package com.hk.listener;

import com.hk.content.Content;

public class FirstListener {
	
	
	
	static{
		System.out.println("------------¼àÌıÆ÷Æô¶¯-------------");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			Content.cityList.add(i + "");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("------------¼àÌıÆ÷½áÊø-------------");
	}

}
