import com.ahmedsoliman.devel.jislamic.hijri.HijriCalendar;
import com.ahmedsoliman.devel.jislamic.hijri.HijriEvents;
import com.ahmedsoliman.devel.jislamic.hijri.HijriMonth;
import com.ahmedsoliman.devel.jislamic.hijri.HijriEvents.HijriEventClass;


public class HijriTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HijriCalendar x = new HijriCalendar(9,9,9);
		System.out.println(x.get(HijriCalendar.MONTH)) ;
	}

}
