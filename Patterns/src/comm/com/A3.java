package comm.com;

public class A3 {
	int i,j,k=9;
	public A3() {
		// TODO Auto-generated constructor stub
		for(i=1;i<=9;i++){
			for(j=k;j>=1;j--){
				
				System.out.print(j+"");
				
			}
			System.out.println("");
			k--;
		}
	}

	public static void main(String[] args) {
		A3 a3=new A3();
	}
}
