package ar.com.proautomation;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String[] array = new String[3];
    	array[0] = "hola";
    	array[2] = "mundo";
    	array[1] = "!";
    	
    	List<String> list = new ArrayList<String>();
    	list.add("hola");
    	list.add("mundo");
    	list.add("!");
    	list.add("chau");
    	
    	for(String word : list) {
    		System.out.println(word);	
    	}
        
    }
}
