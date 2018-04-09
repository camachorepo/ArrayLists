import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ColorMethods {

	
	
	
	
	public String colorDay(String color) {
		
		
		return ("Today's color is " + color);
	}
	
	public void removeElement(int index, ArrayList values) {
		values.remove(index);
	}
	
	public boolean isContained(ArrayList <String> values, String value) {
		boolean foundValue = false; 
		
		for(String s : values) {
			
			if(s.equals(value)) {
				
					foundValue = true;
			}
			
		}
		
		return foundValue;
	}
	
	
	public void sorted(ArrayList values ) {
		
		Collections.sort(values);
	}
	
	public void reverse(ArrayList values) {
		Collections.reverse(values);
	}
	
	public void copy (ArrayList <String> a, ArrayList <String> b) {
		
		for(String s : a) {
			
			b.add(s);
			
		}
	}
	
	public ArrayList compare (ArrayList <String> a, ArrayList <String> b) {
		ArrayList <String> c = new ArrayList<String>();
		for(String s : a ) {
			
			if(b.contains(s)) {
				
				c.add(s);
			}
			
		}
		
		return c;
	}
	
	public void append(ArrayList a, ArrayList b) {
		
		a.addAll(b);
		
	}
	
	public void printOutValues(ArrayList<?> a) {
		
		for (Object s : a) {
			
			System.out.println(s);
			
		}
		
		
	}
	
	
	public void convertToList(ArrayList a, String[] b) {
		
		for(String s : b) {
			a.add(s);	
			
		}
		
		
	}
	
	
}
