package com.kita.second.level1.practice;

public class Tv {
	
	// 전원(isPowerOn) 채널(channel) 볼륨(volume)
	// 기본값 전원 false, 채널1, 볼륨 0 
	// 전원켜기(PowerOn) 전원끄기(PowerOff)
	// 채널올리기(channelUp) 채널내리기(channelDown)
	// 볼륨높이기(volumeUp) 볼륨낮추기(vloumeDown)
	
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	public Tv() {
		isPowerOn = false;
		channel = 1;
		volume = 1;
	}
	
	void PowerOn() {
		if(isPowerOn) {
			System.out.println("전원이 이미 켜져있습니다.");
			return;
		}
		isPowerOn = true;
		System.out.println("전원을 켭니다.");
	}
	
	void PowerOff() {
		if(isPowerOn) {
			System.out.println("전원이 이미 꺼져있습니다.");
			return;
		}
		isPowerOn = false;
		System.out.println("전원을 켭니다.");
	}
	
	void channelUp() {
		channel++;
		System.out.println("채널을 올립니다.");
	}
	
	void channelDown() {
		if(channel<2) {
			System.out.println("최소채널입니다.");
			return;
		}
		channel--;
		System.out.println("채널을 내립니다.");
	}
	
	void vloumeUp() {
		volume++;
		System.out.println(volume + "볼륨을 올립니다.");
	}
	
	void volumeDown() {
		volume--;
		System.out.println(volume + "볼륨을 낮춥니다.");
	}
	
}
