package day1;

public class UseCar {
	public static void main(String[] args) {
		Car c=new Car();
		c.brand="bmw";
		c.color="yellow";
		c.price=400000;
		c.taxAmount=100;
		Car c1=new Car();
		c1.brand="toyota";
		c1.color="blue";
		c1.price=500000;
		c1.taxAmount=200;
		Car c2=new Car();
		c2.brand="tata";  
		c2.color="white";
		c2.price=59090;
		c2.taxAmount=30;
		c.totalPrice=c.price+c1.price+c2.price;
		c.taxPercentage=100;
		c.netPrice=c1.price*c.taxPercentage/100+c.price;
		System.out.println(c.totalPrice);
		System.out.println(c.netPrice);
		System.out.println(c.totalPrice/3);
	}

}
