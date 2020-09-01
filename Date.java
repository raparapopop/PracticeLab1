package com;

class Date implements Comparable<Date> {
	int month ;  
	   int day ;    
	   int year ;   
	    Date(int m , int d, int y) { 
	      month = m;
	      day = d;
	      year = y;
	   }
	    
	    public int getYear() {
	    	return year;
	        }
		public int getMonth() {
			return month;
			}
		public int getDay() {
			return day;
			}
		   
		   
	   public int compareTo( Date otherDate ) {
		   
	          
	      if (year < otherDate.year)
	         return -1;
	      else if (year > otherDate.year)
	         return 1;
	      else { 
	         if (month < otherDate.month)
	            return -1;
	         else if (month > otherDate.month)
	            return 1;
	         else { 
	            if (day < otherDate.day)
	               return -1;
	            else if (day > otherDate.day)
	               return 1;
	            else 
	               return 0;
	         }
	      }
	   }
	}