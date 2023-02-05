package com.simplilearn.mailvailidation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mailvalidation_function {

	public static void main(String[] args) {
		// Step 1: This program will create an arraylist of emails. 
	    // Step 2: Get an email that is to be validated as an input from user.
		// Step 3: Create a function to validate email from user.
		
		List<String> emailList = new ArrayList();
        
        emailList.add("john.s@gmail.com");
        emailList.add("harsh.k@gmail.com");
        emailList.add("johan.r@gmail.com");
        emailList.add("rohan.s@gmail.com");
        emailList.add("jones.a@gmail.com");
        emailList.add("selvi.s@gmail.com");
        emailList.add("ravi.s@gmail.com");
        emailList.add("peter.p@gmail.com");
        emailList.add("kiran.lal@gmail.com");
        emailList.add("selva.kumar@gmail.com");
        emailList.add("madhu.s@gmail.com");
        emailList.add("mithun.km@gmail.com");
        emailList.add("sundar.pichai@gmail.com");
        emailList.add("kumar.s@gmail.com");
        emailList.add("pavi.sumi@gmail.com");
        emailList.add("sound.arya@gmail.com");
        
        System.out.println("Please enter the email id to be validated");
        
        Scanner UserInput = new Scanner(System.in);
			
			String mailId = UserInput.next();
        
      //To print the list:
        
      System.out.println("The email list is " );
      
      
        for(String name1 : emailList)
        {
         
        System.out.println(name1); 
        }
        
        //To display the size of the list:
        
         System.out.println("The length of emaillist is " + emailList.size() );
         
         //To call the fuction for validation of email
         
         System.out.println("******Validation of Email******");
         System.out.println(EmailValidation(mailId,emailList));

	}
	



 
	
public static String EmailValidation(String inputID, List<String> ListofEmails) {
		
		String status;
		for(int i = 0; i < ListofEmails.size(); i++) {
		
			if(ListofEmails.get(i).equals(inputID)) {
				
				status = inputID + " is present in the list";
				return status;
			}
			
		}
		status = inputID + " is not present in the list";
		
		return status;
		
	}
	

}