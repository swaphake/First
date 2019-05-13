package comm.com;

public class A4 {
	int i,j,k=9;
	public A4() {
		// TODO Auto-generated constructor stub
		for(i=1;i<=9;i++){
			for(j=k;j>=1;j--){
				if(j==9){
					System.out.print("6");
				}
				else if(j==6){
					System.out.print("9");
				}
				else{
				System.out.print(j+"");
				}
			}
			System.out.println("");
			k--;
		}
	}

	public static void main(String[] args) {
		A4 a4=new A4  ();
	}
}
