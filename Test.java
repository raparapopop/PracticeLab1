package com;

public class Test {
	

	public static void main(String[] args) {
		
	 
		Date d1 = new Date(12, 5, 2007);
		Date d2 = new Date(12, 4, 2007);
		

		
		int result= d1.compareTo(d2);
		
		if(result < 0)
			System.out.println(d1.getMonth()+" / " + d1.getDay()+" / " + d1.getYear()+ " comes before " +d2.getMonth()+" / " + d2.getDay()+" / " + d2.getYear());
		else if (result > 0)
			System.out.println(d2.getMonth()+" / " + d2.getDay()+" / " + d2.getYear()+ " comese before "+ d1.getMonth()+" / " + d1.getDay()+" / " + d1.getYear());
		else
			System.out.println(d1.getMonth()+" / " + d1.getDay()+" / " + d1.getYear()+ " is equal to "+ d2.getMonth()+" / " + d2.getDay()+" / " + d2.getYear());
	
	}
	
	

}