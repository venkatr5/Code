
public class Yamaha extends BikeParent{
 
	
		// TODO Auto-generated constructor stub
	
	public Yamaha() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public   void WheelBase(int radius1,int base1) {
		// TODO Auto-generated method stub
		System.out.println("Product"+ (radius1*base1)+b );
		
	}
	public static void main(String[] args) {
		
		BikeParent obj1= new Yamaha();
		obj1.WheelBase(2,4);
		BikeParent obj2= new Yamaha();
		obj2.Calculation(10, 5);
	}
	
}
