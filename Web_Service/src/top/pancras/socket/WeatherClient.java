package top.pancras.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 通过socket来实现客户端和服务端通信
 * 此处是请求天气服务的客户端代码
 * @author pancras
 *
 */
public class WeatherClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.创建Socket对象，和服务端建立连接,ip为服务器所在ip，port为服务器端口号(此处会抛出异常)
		Socket socket = new Socket("127.0.0.1",12345);
		
		//2.发送城市名称
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF("北京");
		System.out.println("请求查询天气：北京");
		
		//3.接受返回结果使用输入流
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		String result = dis.readUTF();
		System.out.println("北京天气：" + result);
		
		//4.关闭流
		dis.close();
		dos.close();
		
		//疑问socket需要关闭吗
	}
}
