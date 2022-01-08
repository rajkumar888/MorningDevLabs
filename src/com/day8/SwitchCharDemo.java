package com.day8;

public class SwitchCharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 char ch='Z';  
		 
		 
		    switch(ch)  
		    {  
		    
		        case 'a': 
		        case 'A':
		            System.out.println("Vowel capital or small A");  
		            break;  
		            
		        case 'e': 
		        case 'E':  
		        	System.out.println("Vowel capital or small E");  
		            break; 
		            
		        case 'i':  
		        case 'I':   
		        	System.out.println("Vowel capital or small I");   
		            break;
		            
		        default:   
		            System.out.println("Consonant"); 
			    break;
		            
		        case 'o':   
		        case 'O':   
		        	System.out.println("Vowel capital or small O");   
		            break;  
		            
		        case 'u': 
		        case 'U':
		        	System.out.println("Vowel capital or small U"); 
		            break;  
		        
		        
		    }  
		
		
		

	}

}
