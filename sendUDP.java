import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class sendUDP{
    public static void main(String[] args) throws IOException{
        DatagramSocket s;
        DatagramPacket p;
        s=new DatagramSocket(); 
        String message=args[0];
        //byte[] buffer=message.getData();
        InetAddress dst=InetAddress.getByName(args[1]);
        int dstPort=3000;
        p=new DatagramPacket(message.getBytes(),message.getBytes().length,dst,dstPort);

        s.send(p);
        s.close();



    }
}




