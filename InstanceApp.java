import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {
	public static void main(String[] args) throws IOException {
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		p1.write("Hello 1");
		// PrintWriter가 Writer를 상속, Writer가 Object를 상속하기에 toString이 사용 가능
		p2.toString();
		p2.write("Hello 2"); // PrintWriter에 있는 write를 사용
		
/*		PrintWriter.write("result1.txt", "Hello 1");
		PrintWriter.write("result2.txt", "Hello 2");
		PrintWriter.write("result1.txt", "Hello 1");
		PrintWriter.write("result2.txt", "Hello 2");
		PrintWriter.write("result1.txt", "Hello 1");
		PrintWriter.write("result2.txt", "Hello 2");
		PrintWriter.write("result1.txt", "Hello 1");
		PrintWriter.write("result2.txt", "Hello 2");
		PrintWriter.write("result1.txt", "Hello 1");
		PrintWriter.write("result2.txt", "Hello 2");
		PrintWriter.write("result1.txt", "Hello 1");
		PrintWriter.write("result2.txt", "Hello 2");
		PrintWriter.write("result1.txt", "Hello 1");
		PrintWriter.write("result2.txt", "Hello 2"); */
	}

}
