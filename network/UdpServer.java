import java.net.*;

public class UdpServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket serverSocket = new DatagramSocket(9876);
        byte[] receiveData = new byte[1024];
        byte[] sendData;

        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        serverSocket.receive(receivePacket);

        String msg = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Client says: " + msg);

        InetAddress clientAddress = receivePacket.getAddress();
        int clientPort = receivePacket.getPort();
        sendData = "Hello UDP Client!".getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
        serverSocket.send(sendPacket);
        serverSocket.close();
    }
}