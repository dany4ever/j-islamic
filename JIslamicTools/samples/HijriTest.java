import java.util.Calendar;
import java.util.GregorianCalendar;

import com.ahmedsoliman.devel.jislamic.hijri.HijriCalendar;


public class HijriTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal1 = GregorianCalendar.getInstance();
		HijriCalendar x = new HijriCalendar(cal1);
		System.out.println(x.get(HijriCalendar.MONTH)) ;
		System.out.println(x.get(HijriCalendar.DAY_OF_MONTH)) ;
		System.out.println(x.get(HijriCalendar.YEAR)) ;
		System.out.println(cal1.toString());
		Calendar returned = x.toGregorianCalendar();
		System.out.println(returned.get(HijriCalendar.MONTH)) ;
		System.out.println(returned.get(HijriCalendar.DAY_OF_MONTH)) ;
		System.out.println(returned.get(HijriCalendar.YEAR)) ;
		
	}

}
