package org.se.ada;


public class execut extends ada{
	public static void main(String[] args) {
		getDriver();
		
		Loadurl("https://adactin.com/HotelApp/");
	
		//Login page
		login l =new login();
		fill(l.getTxtusername(),"charanreddy1234");
		fill(l.getTxtpwd(),"9059424388");
		btnclick(l.getBtn());
		
		//booking
		homepage h = new homepage();
		drop(h.getLoc(),"London");
		drop(h.getHot(),"Hotel Creek");
		drop(h.getRoom(),"Double");
		drop(h.getRoomno(),"1 - One");
		fill(h.getDatepic(),"07/01/2020");
		fill(h.getDateout(),"08/01/2020");
		drop(h.getAdults(),"2 - Two");
		drop(h.getChild(),"2 - Two");
		btnclick(h.getClk());
		
		//select page
		selclc s = new selclc();
		btnclick(s.getRbtn());
		btnclick(s.getConti());
		
		//book hotel
		bookhotel bh = new bookhotel();
		fill(bh.getFn(),"charan");
		fill(bh.getLn(),"reddy");
		fill(bh.getAdd(),"1,sreesuryabhavan/nsindhusalai/nmogalivakkam/nchennai/npin-600125");
		fill(bh.getCnum(),"2012201320142015");
		drop(bh.getCtype(),"VISA");
		drop(bh.getEmon(),"May");
		drop(bh.getEyear(),"2022");
		fill(bh.getCvv(),"123");
		btnclick(bh.getClk());
		
		
		
		
		
	}

}
