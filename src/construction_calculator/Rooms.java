package construction_calculator;

public class Rooms {
	
	int roomsNumber;
	int wallNumber=4;
	double h;
	double a;
	double b;
	//boolean niereguralneKsztalty;
	double[] wallLength = new double[wallNumber];
	double ceilingSurface;
	//boolean isRectangular; //prostoko¹tny?
	
	
	public Rooms[] howManyRooms(int roomsNumber) {
		Rooms[] rooms = new Rooms[roomsNumber];
		return rooms;
	}
	
	public Rooms(int roomsNumber, int wallNumber, double h, double a, double b) {
		this.wallNumber=wallNumber;
		 this.h=h;
		 this.a=a;
		 this.b=b;
		 //this.niereguralneKsztalty=niereguralneKsztalty;
	}
	public Rooms( double a, double b,double h) {
		 //this.wallNumber=wallNumber;
		 this.h=h;
		 this.a=a;
		 this.b=b;
		 //this.niereguralneKsztalty=niereguralneKsztalty;
	}

	public Rooms() {
		// TODO Auto-generated constructor stub
	}
	
	public double PoleScian() {
		double pScian= 2*a*h+2*b*h;		
		return pScian;
	}
	
	public double poleSufitu() {
		double pSufitu=a*b;
		return pSufitu;
	}
	
	public double polePokoju() {
		double pPokoju= 2*a*h+2*b+a*b;		
		return pPokoju;
	}

	public double obwodPokoju() {
		double obwod=2*a+2*b;
		return obwod;
	}
}
