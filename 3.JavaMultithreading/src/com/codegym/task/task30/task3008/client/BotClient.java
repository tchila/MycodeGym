package com.codegym.task.task30.task3008.client;

import com.codegym.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BotClient extends Client {
    @Override
    protected String getUserName() throws IOException {
        int x = (int) (Math.random() * 99 + 1);
        return "date_bot_" + x;
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    public class BotSocketThread extends SocketThread {

        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Hello, there. I'm a bot. I understand the following commands: date, day, month, year, time, hour, minutes, seconds."
            );
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            if (message.contains(":")) {

                String[] msg = message.split(": ");
                String pattern = null;

                switch (msg[1]) {
                    case "date":
                        pattern = "d.MM.YYYY";
                        break;

                    case "day":
                        pattern = "d";
                        break;

                    case "month":
                        pattern = "MMMM";
                        break;

                    case "year":
                        pattern = "YYYY";
                        break;

                    case "time":
                        pattern = "H:mm:ss";
                        break;

                    case "hour":
                        pattern = "H";
                        break;

                    case "minutes":
                        pattern = "m";
                        break;

                    case "seconds":
                        pattern = "s";
                        break;
                }

                if (pattern != null) {
                    sendTextMessage("Information for " + msg[0] + ": " +
                            new SimpleDateFormat(pattern).format(Calendar.getInstance().getTime()));
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            new BotClient().run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
