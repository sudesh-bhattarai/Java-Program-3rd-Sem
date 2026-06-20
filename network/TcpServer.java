import java.io.*;
import java.net.*;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000); // port 5000
        System.out.println("Server waiting for connection...");
        Socket socket = server.accept(); // waits for client

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String msg = in.readLine();
        System.out.println("Client says: " + msg);
        out.println("Hello Client!");
        socket.close();
        server.close();
    }
}