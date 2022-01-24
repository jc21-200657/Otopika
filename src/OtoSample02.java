import jp.jc21.t.yoshizawa.otopika.Otopika;

/**
 * 
 */


/**
 * @author t.yoshizawa
 *
 */
public class OtoSample02  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Otopika oto = new Otopika();
		oto.powerOn();
		while(true) {
			oto.lightAll();
			oto.sleep();
			oto.lightOff();
			oto.sleep();
			oto.lightGreen();
			oto.sleep();
			oto.lightYellow();
			oto.sleep();
			oto.lightRed();
			oto.sleep();
		}

	}

}
