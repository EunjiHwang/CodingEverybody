import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHomeargs {
	
	//parameter, �Ű�����
	public static void main(String[] args) {
		String id = args[0];
		String bright = args[1];
		/* arguments�� ����Ͽ� args�� ���� �־� ������ �����ϴ�.
		�ֽ��ǿ��� arguments ���� ""�� ����� �����ϸ� ���񿡴� ""�� ���� ���Ѵ�.*/
		
		// Elevator call
		Elevator myElevator = new Elevator(id); // Elevator�� ������ Ÿ��, myElevator�� ������
		myElevator.callForUp(1); // 1������ ���������͸� ������ �ö󰣴�.
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off(); // ��ȣ�� �����ϰ� ������ ��� = �޼ҵ�
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floorLamp");
		floorLamp.on();
		
		// ��� ������ �Ǵ� �����
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright)); // ���������� �ٲ�
		moodLamp.on();
	}

}
