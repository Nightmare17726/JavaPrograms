import java.util.*;
import java.lang.*;
import javax.swing.JOptionPane;
public class QuartsToGallonsWithExceptionHandling {

	public static void main(String[] args) {
		int quartsInput = 0;
		boolean error = true;
		String Quartsinput;
		final int quartzInGallon = 4;
		int neededGallons, numGallons, extraQuartz;
		
		while(error) {
			try {
				Quartsinput = JOptionPane.showInputDialog(null, "How many quarts do you need? ");
				quartsInput = Integer.parseInt(Quartsinput);
				
				neededGallons = quartsInput / quartzInGallon;
				numGallons = neededGallons * quartzInGallon;
				extraQuartz = quartsInput - numGallons;
				
				JOptionPane.showMessageDialog(null, "A job that needs " + quartsInput + " quarts requires " + neededGallons + " gallons plus " + extraQuartz + " quarts.");
				break;
			}
			catch(NumberFormatException exception) {
				JOptionPane.showMessageDialog(null, "ERROR: Please input an integer number.");
			}
		
		}
		
			
	}
}
