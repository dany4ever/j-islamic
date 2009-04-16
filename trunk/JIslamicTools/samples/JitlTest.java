
import com.ahmedsoliman.devel.jislamic.DayPrayers;
import com.ahmedsoliman.devel.jislamic.Jitl;
import com.ahmedsoliman.devel.jislamic.Method;
import com.ahmedsoliman.devel.jislamic.Prayer;
import com.ahmedsoliman.devel.jislamic.astro.Dms;
import com.ahmedsoliman.devel.jislamic.astro.Location;
import com.ahmedsoliman.devel.jislamic.astro.SimpleDate;


public class JitlTest {

    public static void main(String args[]) {
    	
    	Dms qibla;
        //GregorianCalendar
    	SimpleDate today = new SimpleDate(9, 11, 2008);
        
        //Date today = new Date();
        Prayer imsaak ;
        Prayer nextImsaak ;
        Prayer nextFajr;
      
        /* auto fill the method structure. Have a look at prayer.h for a
         * list of supported methods */
        
        Method m = Method.EGYPT_SURVEY.copy();
        //m.setRound(0);
        Jitl itl = new Jitl(new Location(30.057100, 31.227200, 2, 0 ), m);        
        //itl.setCalendar(Calendar.getInstance());
        
        //Jitl itl = new Jitl(new Location(21.423333, 39.823333, 1, 1 ), Method.MUSLIM_LEAGUE);
        
        /* Call the main function to fill the Prayer times array of
         * structures */
        DayPrayers ptList = itl.getPrayerTimes (today);

        /* Call functions for other prayer times and qibla */
        imsaak = itl.getImsaak (today);
        nextFajr = itl.getNextDayFajr (today);
        nextImsaak = itl.getNextDayImsaak (today);
        qibla = itl.getNorthQibla();

        System.out.print("\nQibla\t=" + qibla + "\n");
        System.out.print("Time:");
        System.out.print(ptList.maghrib() + "\n");
        /*
        Iterator iterator = ptList.iterator();
        Prayer p = null;
        while(iterator.hasNext()) {
            p = (Prayer)iterator.next();
        	System.out.println(p);
        }
        */
        System.out.println("Today's Imsaak: " + imsaak);
        System.out.println("Tomorrow's Fajr: " + nextFajr);
        System.out.println("Tomorrow's Imsaak: " + nextImsaak);
        //System.out.println(Utils.PI + "\n");
        //System.out.println(Math.PI + "\n");
        
    }

}
