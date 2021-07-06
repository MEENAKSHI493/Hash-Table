package com.Bridgelabz;
import java.util.Hashtable;

public class HashTable {


		public static void main(String[] args) 
		{
		        HashtableMain<String, Integer> hashMain = new HashtableMain();
		        String message = "Paranoids are not paranoid because they are paranoid but " +
		                "because they keep putting themselves deliberately into paranoid avoidable situations";

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
		        //Display the hashtable
		        System.out.println(hashMain);

		        //Remove "avoidable" from the hashtable
		        hashMain.remove("avoidable");

		        //Display the hashtable
		        System.out.println(hashMain);
		    }
		}

