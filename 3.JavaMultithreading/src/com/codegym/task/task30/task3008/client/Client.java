package com.codegym.task.task30.task3008.client;

import com.codegym.task.task30.task3008.Connection;
import com.codegym.task.task30.task3008.ConsoleHelper;
import com.codegym.task.task30.task3008.Message;
import com.codegym.task.task30.task3008.MessageType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;

    public class SocketThread extends Thread {


        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutAddingNewUser(String message) {
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutDeletingNewUser(String message) {
            ConsoleHelper.writeMessage(message);
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            Client.this.clientConnected = clientConnected;
            synchronized (Client.this) {
                Client.this.notify();
                ;
            }
            //Client.this.notify();
        }

        protected void clientHandshake() throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();


                if (message.getType() == MessageType.NAME_REQUEST){
                    connection.send(new Message (MessageType.USER_NAME, getUserName()));
                    continue;
                }

                if (message.getType()== MessageType.NAME_ACCEPTED){
                    notifyConnectionStatusChanged(true);
                    break;
                }

                if (message.getType() != MessageType.NAME_REQUEST && message.getType() != MessageType.NAME_ACCEPTED){
                    throw new IOException("Unexpected MessageType");
                }
            }

        }
        protected void clientMainLoop() throws IOException, ClassNotFoundException{
            while (true) {
                Message message = connection.receive();
                if (message.getType() != MessageType.TEXT && message.getType() != MessageType.USER_REMOVED && message.getType() != MessageType.USER_ADDED){
                    throw new IOException("Unexpected MessageType");
                }
                if (message.getType().equals(MessageType.TEXT)) {
                    processIncomingMessage(message.getData());
                    continue;
                }if (message.getType().equals(MessageType.USER_ADDED)) {
                    informAboutAddingNewUser(message.getData());
                    continue;
                }if (message.getType().equals(MessageType.USER_REMOVED)) {
                    informAboutDeletingNewUser(message.getData());
                }

            }
        }

        @Override
        public void run() {
            try {
                Socket socket = new Socket(getServerAddress(),getServerPort());
                 connection = new Connection(socket);
                clientHandshake();
                clientMainLoop();
            } catch (IOException | ClassNotFoundException e) {
                notifyConnectionStatusChanged(false);
            }
        }
    }

    public void run() throws InterruptedException {
        SocketThread socketThread = getSocketThread();
        socketThread.setDaemon(true);
        socketThread.start();
        synchronized (this) {
            wait();
        }
        if (clientConnected) {
            ConsoleHelper.writeMessage("Connection established. To exit, enter 'exit'.");
            String text = "";
            while (clientConnected) {
                text = ConsoleHelper.readString();
                if (text.equals("exit")) break;
                if (shouldSendTextFromConsole()) sendTextMessage(text);
            }
        } else ConsoleHelper.writeMessage("An error occurred while working with the client.");
    }

    protected String getServerAddress() throws IOException {
        return ConsoleHelper.readString();
    }

    protected int getServerPort() throws IOException {
        return ConsoleHelper.readInt();
    }

    protected String getUserName() throws IOException {
        return ConsoleHelper.readString();
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            clientConnected = false;
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
