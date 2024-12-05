package first_package;
//Question: Any 10 methods of Maths class in Java
public class Maths_ClassinJava {

	public static void main(String[] args) throws InterruptedException {
		//System.out.println(Math.addExact(100, 200));
		int i=Math.addExact(200, 300);
		System.out.println(i);
		Thread.sleep(4000);
		int j=Math.subtractExact(200, 400);
		System.out.println(j);
		int k=Math.divideExact(200, 100);
		System.out.println(k);
		double d=Math.max(300.89, 899.09);
		System.out.println(d);
		long l=Math.min(899999999, 655555566);
		System.out.println(l);
		double m=Math.random();
		System.out.println(m);
		double n=Math.abs(-200.9837696435576854);
		System.out.println(n);
double o=Math.PI;
System.out.println(o);




		/*System.out.println(Math.addExact(100455333, 2033435664570l));
		System.out.println(Math.subtractExact(100, 200));
		System.out.println(Math.max(100, 200));
		System.out.println(Math.min(100.0, 200));//int,float,long,double
		System.out.println(Math.abs(-300.566799999));//float x,int x,double x
		System.out.println(Math.random());//It will give o/p as in between 0 and 1 random values.return type double value*/
}

}
