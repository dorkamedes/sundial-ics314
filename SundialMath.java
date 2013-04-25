/**
  @author Reginald Nartatez
 */
 
import java.math.*;

public class SundialMath
{
	private double angleOfHour;
	
	//constructor
	public SundialMath()
	{
		angleOfHour = 0;
	}
	
	//return the angleOfHour
	public double getAngleOfHour()
	{
		return angleOfHour;
	}

	/**			
		@params:	double t:	time measured from noon in degrees of arc
					String phi: latitude of sundial location
		
		finds the angle of the hour line for the gnomon
		formula:	tan(d) = tan(t)*sin(phi)
	 */
	public void setAngleOfHour(double t, String phi)
	{	
		angleOfHour = Math.toDegrees(Math.atan(Math.tan(Math.toRadians(t))*Math.sin(Math.toRadians(convertHourToDecimal(phi)))));
	}
	
	//same as above, but takes a double for phi instead of a string
	public void setAngleOfHour(double t, double phi)
	{	
		angleOfHour = Math.toDegrees(Math.atan(Math.tan(Math.toRadians(t))*Math.sin(Math.toRadians(phi))));
	}
	
	/**				
		@params:	String degree: the value to convert
		@return:	double:			the converted value
		@usage:	45\"30'23 = 45 degrees, 30 minutes, 23 seconds
					You need that first backslash to indicate that the
					double quote does not close the string
					
					convertHourToDecimal("45\"30'23)
		
		Converts hour to decimal;
		from stackoverflow
	 */
	public double convertHourToDecimal(String degree)
	{
    	if(!degree.matches("(-)?[0-6][0-9]\"[0-6][0-9]\'[0-6][0-9](.[0-9]{1,5})?"))
  	      throw new IllegalArgumentException();
  	      
  		String[] strArray=degree.split("[\"']");
  		return Double.parseDouble(strArray[0])+Double.parseDouble(strArray[1])/60+Double.parseDouble(strArray[2])/3600;
	}
}
