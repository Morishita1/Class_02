package com.biz.market;

public class RiceMarket {

	public int iprice; // 매입가격
	public int oprice; // 판매가격
	
	public void margin() {
		int marhin =oprice-iprice;
		System.out.println("판매이익금 : "+marhin);
	}
		
	
	
}
