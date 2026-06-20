import java.io.*;
import java.net.*;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000); // connect to server
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        out.println("Hello Server!");
        System.out.println("Server replied: " + in.readLine());

        socket.close();
    }
}