package com.epam.gitdemo;

/**
 * Hello world!
 *
 */
public class App 
{
	public String removeString(String string) {
		int i=0;
		int count=0;
		while(i<2 && count<=1){
			if(string.charAt(i)=='A'){
				string = string.substring(0,i) + string.substring(i+1);
				count++;
			}
			else {
				i++;
			}
		}
		return string;
	}
	
}
