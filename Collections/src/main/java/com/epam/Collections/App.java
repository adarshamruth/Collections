package com.epam.Collections;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             MyCustomList<String> myList = new MyCustomList<String>();
             
             myList.add("Harshith");
             myList.add("Epam");
             myList.add("Optimist");
             myList.add("Home Task");
             
             
             System.out.println("My List: "+myList.toString());
             
             
             myList.delete(0);
             
             System.out.println("After Deleting "+myList.toString());

             
            	 
             
	}

}
