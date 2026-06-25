
public class TV {

	public int channel;
	public int volumeLevel;
	public boolean on;

	public void turnOn() {

		on = true;

	}

	public void turnOff() {

		on = false;
	}

	public boolean isOn() {

		return on;
	}

	public void volumeLevelUp(int vol) {

		int x = vol + this.volumeLevel;
		if (x <= 8) {
			this.volumeLevel = x;
		}
	}

	public void volumeLevelDown(int vol) {

		int x = this.volumeLevel - vol;
		if (x >= 0) {
			this.volumeLevel = x;
		}
	}

	public void channelUp(int ch) {
		int x = this.channel + ch;
		if (x <= 100) {
			this.channel = x;
		}
	}

	public void channelDown(int ch) {
		int x = this.channel - ch;
		if (x >= 0) {
			this.channel = x;
		}
	}

	public String toString() {
		String x = "";
		if (this.on) {
			x = "on";
		} else {
			x = "off";
		}
		String y = "TV is " + x + " and current channel is " + this.channel + " and current volume level is "
				+ this.volumeLevel+".";
		return y;
	}

}
