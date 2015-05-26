//Paul Friederichsen

package parsingandcasting;

public class Practice {
	
	public static void main(String[] args) {
		
		String str = "15";
		//I will now convert this string into a useable number
		int stri = Integer.parseInt(str);
		double strd = Double.parseDouble(str);
		//System.out.println(stri + "\n" + strd);
		
		System.out.println(str + 5); //155
		System.out.println(stri + 5); //20
		System.out.println(strd + 5); //20.0
		
		int i = 10;
		double id = (double) i;
		System.out.println(id); //10.0
		
		double d = 11.999;
		int di = (int) d;
		System.out.println(di); //11
		
		byte b = 10;
		short s = 10;
		double bd = (double) b;
		double sd = (double) s;
		System.out.println(bd + sd); //20.0
		
		String str2 = "20";
		double str2d = Double.parseDouble(str2);
		System.out.println(str2d); //20.0
		
		String str3 = "30";
		byte str3b = 
				Byte.parseByte(str3);	
	}
}
