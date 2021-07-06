package com.Bridgelabz;

public class HashTable {


	  public static void main(String[] args) {
		  HashTableMain<String, Integer> hashMain = new HashTableMain();
	        String message = "To be or not to be";

	        //String to String[] conversion.
	        String[] messageArray = message.toLowerCase().split(" ");

	        //Iterate within the array
	        for(String word: messageArray) {
	            Integer value =  hashMain.get(word);
	            if( value == null)
	                value = 1;
	            else
	                value = value + 1;
	            hashMain.add(word , value);
	        }
	        //Display the linked list
	        System.out.println(hashMain);
	    }
	}


