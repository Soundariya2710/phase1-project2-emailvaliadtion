package com.simplilearn.mailvailidation;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class MailValidation {

	public static void main(String[] args) {
		// Step 1: This program will create an arraylist of emails. 
	    // Step 2: Get an email that is to be validated as an input from user.
		// Step 3: Compare it with the list and display the result.
		
		// Step 1:
		
             List<String> emailSet = new ArrayList();
             
             emailSet.add("john.s@gmail.com");
             emailSet.add("harsh.k@gmail.com");
             emailSet.add("johan.r@gmail.com");
             emailSet.add("rohan.s@gmail.com");
             emailSet.add("jones.a@gmail.com");
             emailSet.add("selvi.s@gmail.com");
             emailSet.add("ravi.s@gmail.com");
             emailSet.add("peter.p@gmail.com");
             emailSet.add("kiran.lal@gmail.com");
             emailSet.add("selva.kumar@gmail.com");
             emailSet.add("madhu.s@gmail.com");
             emailSet.add("mithun.km@gmail.com");
             emailSet.add("sundar.pichai@gmail.com");
             emailSet.add("kumar.s@gmail.com");
             emailSet.add("pavi.sumi@gmail.com");
             emailSet.add("sound.arya@gmail.com");
             emailSet.add("pranav.s@gmail.com");
             emailSet.add("parveen.banu@gmail.com");
             emailSet.add("binu.suresh@gmail.com");
             emailSet.add("kajal.s@gmail.com");
             emailSet.add("vidyut.g@gmail.com");
             emailSet.add("nasser.hussain@hotmail.com");
             emailSet.add("smritha.t@hotmail.com");
             emailSet.add("paneer.selva@hotmail.com");
             emailSet.add("ganesh.s@hotmail.com");
             emailSet.add("riya.sharma@hotmail.com");
             emailSet.add("rahul.dravid@hotmail.com");
             emailSet.add("shriya.gupta@hotmail.com");
             
             
              //To print the list:
             
             //System.out.println("The email list is " );
             
             //for(String name1 : emailSet)
             //{
              
             // System.out.println(name1); 
             //}
             
             //To display the size of the list:
             
              System.out.println("The length of emaillist is " + emailSet.size() );
             
             System.out.println("Please enter the email id to be validated");
            
            Scanner mailInput = new Scanner(System.in);
 			
 			String mailId = mailInput.next();
 			
 			
 				    
 			for(String name : emailSet) {
 				
 				System.out.println("Checking with " +name);
 			
 		 if(( name.equals(mailId)) ){ 
 			
 			 System.out.println("Email validated");
 			
 			break;
 			
 		
 		 }
       
 		 
 		 else {
 	     
 			System.out.println("Email not validted");
 	   
 			
 		 }
    }
 			
	}
}
 			   
            
	

