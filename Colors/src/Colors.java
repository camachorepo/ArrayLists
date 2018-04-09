
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Colors {
	
	public static void main (String[] args) {
		
		ArrayList<String> colors  = new ArrayList <String> ();
		ArrayList<String> colors2 = new ArrayList <String> (); 
		ArrayList<String> colors3 = new ArrayList <String> (); 
		ArrayList<String> empty = new ArrayList <String> ();
		String[] darkColors  = new String [] {"Black", "Purple", "Grey"};
		
		ColorMethods methods = new ColorMethods();
		colors.add("Cyan");
		colors.add("Magenta"); 
		colors.add("Yellow"); 
		colors.add("Black");
		
		colors2.add("Magenta");
		colors2.add("Blue"); 
		colors2.add("Red"); 
		colors2.add("Black"); 
		
		

		// Print out the ArrayList
		System.out.println(colors);
		
		for(String s : colors) {
			
			System.out.println(methods.colorDay(s));
		}
		
		//remove element 2 from the colors
		methods.removeElement(2, colors);
		

		
		//check is string is contained in ArrayList 
		System.out.println(methods.isContained(colors, "Yellow"));
		
		//sort the ArrayList
		methods.sorted(colors);
		

		//Reverse the ArrayList
		methods.reverse(colors);
		
		//Copy an arrayList
		methods.copy(colors2, colors3);
		
		
		//Printout the compared arrays
		System.out.println(methods.compare(colors, colors2));
		
		//Append two array Lists 
		methods.append(colors, colors2);

		
		// convert String array to ArrayList
		methods.convertToList(empty, darkColors);
		
		System.out.println(empty);
	}

}
