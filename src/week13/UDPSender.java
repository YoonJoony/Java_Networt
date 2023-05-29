package week13;

import java.io.IOException;
import java.net.*;

public class UDPSender {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        InetAddress ia = InetAddress.getByName("127.0.0.1");
        int port = 2001;
        String s = "신한입니다...";
        byte[] buffer = s.getBytes();
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length, ia, port); //송신용 패킷은 주소가 들어간다.
        ds.send(dp);
    }
}
