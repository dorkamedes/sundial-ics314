/**
  @author Reginald Nartatez
 */
 
import java.math.*;

public class SundialMath
{
	/*Standard Meridians
	private const double SM_NEWWFOUNDLAND		=	52.5;
	private const double SM_ATLANTIC				=	60;
	private const double SM_EASTERN				=	75;
	private const double SM_CENTRAL				=	90;
	private const double SM_MOUNTAIN				=	105;
	private const double SM_PACIFIC				=	120;
	private const double SM_YUKON					=	135;
	private const double SM_ALASKAHAWAII		=	150;
	private const double SM_BERING				=	165;
	end Standard Meridians */
	
	private double angleOfHour;
	private double adjustedAngle;
	private double eot;
	
	//constructor
	public SundialMath()
	{
		angleOfHour		=	0;		//angle of hour of the gnomon
		adjustedAngle 	=	0;		//angle adjusted for local apparent time
		eot				=	0;		//eot = Equation of Time
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
		@params:	double longitude:				the precise longitudinal location of the gnomon in degrees
					double standardMeridian:	the nearest Standard Meridian W of the gnomon in degrees
		
		finds the angle of the hour line for the gnomon
		adjusted for local apparent time in radians
	 */
	public void setAdjustedAngle(double longitude, double standardMeridian)
	{
		adjustedAngle = Math.toRadians(longitude - standardMeridian);
	}
	
	/**			
		@return:	adjustedAngle	
		
		returns the adjusted angle of hour line in radians
	 */
	public double getAdjustedAngle()
	{
		return adjustedAngle;
	}
	
	/**			
		@params:	int dayOfTheYear:		the day of the year ie Jan 1 is day 1, Feb 1 is day 32, Dec 31 is day 365
		
		calculates the Equation of Time in radians
	 */
	public void setEOT(int dayOfTheYear)
	{
		double b = Math.toRadians(360 * (dayOfTheYear - 81) / 365);
		
		eot = 9.87 * Math.sin(2 * b) - 7.53 * Math.cos(b) - 1.5 * Math.sin(b);
	}
	
	/**			
		@return:	eot
		
		returns the Equation of Time
	 */
	public double getEOT()
	{
		return eot;
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
