package comm.com;

public class A1 {
	int i=1,j=1,k=1;
	public A1() {
		// TODO Auto-generated constructor stub
		System.out.println("1");
		for(i=1;i<=5;i++){
			System.out.print("1");
			
			for(j=1;j<=k;j++){
				System.out.print("2");
			}
			System.out.println("1");
			k++;
		}
		
	}
public static void main(String[] args) {
	A1 a1=new A1();
	
}
}
