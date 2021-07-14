import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHomeInput {
	
	public static void main(String[] args) {
		// ID와 Bright를 입력받아서 적용
		String id = JOptionPane.showInputDialog("Enter a ID");
		String bright = JOptionPane.showInputDialog("Enter a Bright level");
		
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
