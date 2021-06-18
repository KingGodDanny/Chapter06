package echo.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.55.74",10001));  //IP 포트번호
		
		System.out.println("<서버시작>");
		System.out.println("================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		
		
		
		Socket socket = serverSocket.accept();  
		//클라이언트 누군가 오면 어쎕트()안에 new socket이 만들어져서 socket에 담긴다.
		System.out.println("[클라이언트가 연결되었습니다.]");
		
		
		//메세지 받기용 스트림
		InputStream is = socket.getInputStream();    //이미 소켓이 만들어놓음
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new  BufferedReader(isr);

		
		//메세지 보내기용 스트림
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		while(true) {
			
			//메세지받기
			String msg = br.readLine();
			
			
			if(msg == null) {  //null이라는건 글자가아니고 주소를 비교하기때문에 ==
				
				System.out.println("클라이언트 접속 종료");
				break;
			}
			
			
			System.out.println("받은메세지: " + msg);
			//메세지 보내기
			bw.write(msg);
			bw.newLine();
			bw.flush();  //용량이 안차도 보내줘라!
			
		}
		
		System.out.println("=====================================================");
		System.out.println("<서버 종료>");
		
		socket.close();
		serverSocket.close();
		
	}

}
