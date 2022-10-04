import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class receiveUDP{
    public static void main(String[] args) throws IOException{
        DatagramSocket s;
        s=new DatagramSocket(3000);
        DatagramPacket p;
        p=new DatagramPacket(new byte[512],512);
        s.receive(p);
        System.out.println("message " + new String(p.getData()));
        s.close();

    }
}