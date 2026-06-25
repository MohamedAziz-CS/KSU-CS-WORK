
public class TestTV {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.channelUp(20);
		tv1.volumeLevelUp(4);
		if(tv1.isOn()) {
			System.out.println(tv1.toString());
		}

	}

}
