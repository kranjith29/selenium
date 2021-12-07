
/*
 Input String – “This string is a test string”
Output – “gnirts tset a si gnirts sihT”

 */
//sihT gnirts si a tset gnirts



//		String s = "This string is a test string";
//
//				String[] a = s.split("");
//
//				String r ="";
//				String d ="";
//
//				for(int i=s.length()-1; i>=0; i--){
//				 r=r+a[i];
//				}
//				System.out.println(r);
//				String[] b=r.split(" ");
//				
//				for(int j=b.length-1; j>=0; j--) {
//					d=d+b[j]+" ";
//					
//				}
//				System.out.println(d);
//		
//	}

public class Reverse {
	public static void main(String[] args) {

		String s = "COMBINATION";
		String[] a = s.split("");
		String b = "";

		int r =s.length();

		for(int i=0; i<=r-1; i++){
			if(a[i]==a[r-1] ) {
				break;
			}
			else {
				b=b+a[i];
				s=b;
			}
			System.out.println(s);

		}		
	}

}



