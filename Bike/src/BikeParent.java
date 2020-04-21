
public abstract class BikeParent {
	int a;
	int b=10;
	 
	public  abstract  void WheelBase(int radius1,int base1);
	public void Calculation(int radius,int base)
	{
		System.out.println("Product"+ radius*base  );
	}
}
