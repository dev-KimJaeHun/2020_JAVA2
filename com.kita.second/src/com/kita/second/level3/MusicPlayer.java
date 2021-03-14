package com.kita.second.level3;

public class MusicPlayer implements IUAlbum, BTSAlbum {
	public void playIUAlbum() {
		System.out.println("아이유 앨범을 재생한다.");
	}
	
	public void playBTSAlbum() {
		System.out.println("BTS 앨범을 재생한다.");
	}
}
