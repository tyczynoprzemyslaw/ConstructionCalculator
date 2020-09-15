package construction_calculator;
/**
 * It's class to do maths calculations.
 * In the future it could be a lot of rooms.
 *
 */
public class Rooms {
	
	

	double h;
	double a;
	double b;
	
	
	double ceilingSurface;
	double[] alldimensions = new double[4];
	
	
	
	public Rooms[] howManyRooms(int roomsNumber) {
		Rooms[] rooms = new Rooms[roomsNumber];
		return rooms;
	}
	
	
	public Rooms( double a, double b,double h) {
		 
		 this.h=h;
		 this.a=a;
		 this.b=b;
		
	}

	public Rooms() {
		
	}
	
	public double areaWalls() {
		double pScian= 2*a*h+2*b*h;		
		return pScian;
	}
	
	public double areaCeiling() {
		double pSufitu=a*b;
		return pSufitu;
	}
	
	public double totalSurface() {
		double pPokoju= 2*a*h+2*b+a*b;		
		return pPokoju;
	}

	public double circuitofRoom() {
		double obwod=2*a+2*b;
		return obwod;
	}
        
        public void allDimensions(){
            
            alldimensions[0]= totalSurface();
            alldimensions[1]= areaCeiling();
            alldimensions[2]= areaWalls();            		
            alldimensions[3]= circuitofRoom();
           
        }
}
