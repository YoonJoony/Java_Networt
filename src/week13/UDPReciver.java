package week13;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReciver {
    public static void main(String[] args) throws IOException {
        int port = 2001;
        int times = 100;
        //소켓생성
        DatagramSocket ds = new DatagramSocket(port);
        int i = 1;
        while(i < times) {
            byte[] buffer = new byte[30];
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
            ds.receive(dp);
            String str = new String(dp.getData());
            System.out.println("수신데이터 : " + str);
            i++;
        }
    }
}
