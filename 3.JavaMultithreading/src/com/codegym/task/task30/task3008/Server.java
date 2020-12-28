package com.codegym.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();
    public static void sendBroadcastMessage(Message message) {
        for (Connection c : connectionMap.values()) {
            try {
                c.send(message);
            } catch (IOException e) {
                System.out.println("error");
            }
        }
    }
    public static void main(String[] args) throws IOException {
        int port = ConsoleHelper.readInt();
        ServerSocket serverSocket = null;
        try {

            serverSocket = new ServerSocket(port);
            System.out.println("Server is running");
            while (true){
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                handler.start();
            }
        } catch (IOException e) {
            serverSocket.close();
            e.printStackTrace();
        }
    }

    private static class Handler extends Thread{
        @Override
        public void run() {
            ConsoleHelper.writeMessage("New connection started at :" + socket.getRemoteSocketAddress());
            try {
                Connection connection = new Connection(socket);
                String name =serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED,name));
                notifyUsers(connection,name);
                serverMainLoop(connection,name);
                connectionMap.remove(name);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED,name));
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            super.run();
        }

        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException,ClassNotFoundException{
            while(true) {
                connection.send(new Message(MessageType.NAME_REQUEST));

                Message response = connection.receive();

                if (response.getType().equals(MessageType.USER_NAME)) {
                    String data = response.getData();

                    if (data != null && !data.isEmpty()) {
                        if(!connectionMap.keySet().contains(data)){
                            connectionMap.put(data, connection);
                        }else continue;
                        connection.send(new Message(MessageType.NAME_ACCEPTED));
                        return data;
                    }
                }
            }
        }

        private void notifyUsers(Connection connection, String userName) throws IOException{
            for (Map.Entry<String, Connection> entry : connectionMap.entrySet()) {
                if(!entry.getKey().equals(userName)){
                    Message message = new Message(MessageType.USER_ADDED,entry.getKey() );
                    connection.send(message);                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException{
            while (true){
                Message message = connection.receive();
                if(message.getType() ==  MessageType.TEXT){
                    String s = String.format("%s: %s",userName,message.getData());
                    sendBroadcastMessage(new Message(MessageType.TEXT,s));
                } else{
                    ConsoleHelper.writeMessage("Error during Message sending");
                    
                }
            }
        }
    }


}
