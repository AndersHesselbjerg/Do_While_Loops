import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {


        try {
            ServerSocket serverSocket = new ServerSocket(1111);
            System.out.println("Socket er oprettet");
            Socket socket = serverSocket.accept(); // afventer klient
            System.out.println("Client er forbundet");

            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[4];
            inputStream.read(bytes);
            for (int i = 0; i < bytes.length; i++) {
                System.out.println("recieved: " + bytes[i]);

            }

            System.out.println("The end");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

