package Exp04;

import java.io.*;
import java.net.*;

public class T_12201425_4_3 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            // 创建一个ServerSocket监听8080端口
            serverSocket = new ServerSocket(8000);
            System.out.println("服务器已启动，等待客户端连接...");
            // 循环监听客户端请求
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("客户端已连接，地址为：" + socket.getInetAddress());
                // 创建一个新的线程处理客户端请求
                new Thread(new ServerThread(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class ServerThread implements Runnable {
    private Socket socket;
    private BufferedReader br;
    private PrintWriter pw;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 获取客户端输入流
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // 获取客户端输出流
            pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            String message;
            // 循环读取客户端发送的信息
            while ((message = br.readLine()) != null) {
                System.out.println("客户端发送的信息为：" + message);
                // 向客户端发送信息
                pw.println("服务器已接收到您发送的信息：" + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
                if (br != null) {
                    br.close();
                }
                if (pw != null) {
                    pw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
