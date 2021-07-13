
public class StringApp {
	public static void main(String[] args) {
		System.out.println("Hello World"); //String(문자열)
		System.out.println('H'); // ''는 Character(문자, 한 글자를 표현)
		System.out.println("H");
		
		System.out.println("Hello "
				+ "World"); //이때는 줄바꿈이 되지 않는다.
		
		// \n의 n은 new line의 약자이다.
		System.out.println("Hello \nWorld");
		
		// \뒤에 오는 문자는 일반 문자열의 문자가 된다.
		System.out.println("Hello \"World\""); //Hello "World"
	}
}
