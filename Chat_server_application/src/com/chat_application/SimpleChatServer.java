package com.chat_application;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleChatServer {

    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        Socket clientSocket = null;

        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("Server started. Listening to the port 8080. Waitng for the client.");
            clientSocket = serverSocket.accept();
            System.out.println("Client connected on port 8080.");
        } catch (IOException e) {
            System.out.println("Could not listen on port: 8080");
            e.printStackTrace();
            return;
        }

        ChatWindow chatWindow = new ChatWindow();
        chatWindow.open(clientSocket);
    }

}