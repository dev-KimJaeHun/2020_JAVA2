package com.kita.second.level2;

public class Netflix {
	int chapter = 0;
	int maxChapter; // 최대편수
	
	public Netflix(int maxChapter) {
		this.maxChapter = maxChapter;
	}
	
	boolean watch() {
		++chapter;
		if(chapter <= maxChapter) {
			System.out.println("넷플릭스를 시청한다.");
			return true;
		}
		System.out.println("넷플릭스를 이미 시청했다.");
		return false;
	}
}
