package Demo.Test;

public class Reverse {
public static void main(String[] args) {
	String s = "Praveen";
/*
	String a[] = s.split("");
	
	String r = "";
	for(int i=s.length()-1; i>=0;i--) {
		r=r+a[i];
	}

	/*
//	 i=6; a[6]--> r= ""+"n"-->n
//	 i=5; a[5]--> r ="n"+"e"-->"ne"
//	 i=4; a[4]-> r ="ne"+"e"->"nee"
	 */
	//System.out.println("Reverse: "+r);
//	StringBuffer h = new StringBuffer(s);
//	StringBuffer reverse1= h.reverse();
//	System.out.println(reverse1);
	
	StringBuilder jj = new StringBuilder(s);
	StringBuilder reverse2 = jj.reverse();
	System.out.println(reverse2);
	
}
	
	

}
