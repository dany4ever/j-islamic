package com.ahmedsoliman.devel.jislamic;
/**
 * Mathhab is used for Assr prayer calculation. 
 */
public class Mathhab {
	private Mathhab(){
		
	}
	
	/**
	 * Assr prayer shadow ratio: use Shaa'fi (Maliki, Hanbali) mathhab (default)
	 */
	public static final Mathhab SHAAFI = new Mathhab();
	
	/**
	 * Assr prayer shadow ratio: use Hanafi mathhab
	 */
	public static final Mathhab HANAFI = new Mathhab();
	

}
