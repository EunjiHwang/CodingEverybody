import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHomeargs {
	
	//parameter, 매개변수
	public static void main(String[] args) {
		String id = args[0];
		String bright = args[1];
		/* arguments를 사용하여 args에 값을 넣어 실행이 가능하다.
		최신판에는 arguments 값을 ""로 묶어야 가능하며 제목에는 ""가 들어가지 못한다.*/
		
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
		
		// 밝기 조절이 되는 무드등
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright)); // 더블형으로 바뀜
		moodLamp.on();
	}

}
