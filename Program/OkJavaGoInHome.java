import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHome {
	
	public static void main(String[] args) {
		
		String id = "JAVA APT 507";
		
		// Elevator call
		Elevator myElevator = new Elevator(id); // Elevator는 데이터 타입, myElevator는 변수명
		myElevator.callForUp(1); // 1층으로 엘레베이터를 보내고 올라간다.
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off(); // 괄호로 시작하고 끝나는 명령 = 메소드
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floorLamp");
		floorLamp.on();
	}

}
