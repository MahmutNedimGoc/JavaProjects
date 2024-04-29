package ders1;

public class TV {
	int channel = 1;
	int volume = 1;
	boolean on = true;
	
	public TV() {	
	}
	public void turnON() {
		on = true;
	}
	public void turnOFF() {
		on = false;
	}
	public void setChannel(int channel) {
		if(on && channel >= 1 && channel <= 120) {
			this.channel = channel;
		}
	}
	public void setVolume(int volume) {
		if(on && volume > 1 && volume <= 10) {
			this.volume = volume;
		}
	}
	public void ChannelUp() {
		if(on && channel >= 1 && channel <= 120) {
			channel++;
		}
	}
	public void ChannelDown() {
		if(on && channel >= 1 && channel <= 120) {
			channel--;
		}
	}
	public void VolumeUp() {
		if(on && volume >= 1 && volume <= 10) {
			volume++;
		}
	}
	public void VolumeDown() {
		if(on && volume >= 1 && volume <= 10) {
			volume--;
		}
	}
	
}
