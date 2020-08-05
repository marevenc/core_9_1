import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        int port = 4224;
        try (Socket clientSocket = new Socket("localhost", port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));)
        {
            out.println("Vasya");
            String fromServer = in.readLine();
            System.out.println(fromServer);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
