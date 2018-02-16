package q1;


public class file {
	int AB;
	int H;
	int B2;
	int B3;
	int HR;
	int R;
	int BB;
	String Name;
	
	public file(int ab,int h,int b2, int b3, int hr, int r, int bb, String n) {
		AB=ab;
		H=h;
		B2=b2;
		B3=b3;
		HR=hr;
		R=r;
		BB=bb;
		Name=n;
		
	}
	public double BA() {
		return (double)H/(double)AB;
	}
	public double OBP() {
		return ((double)H+BB)/((double)AB+BB);
	}
	

}
