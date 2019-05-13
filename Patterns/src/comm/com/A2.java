package comm.com;

public class A2 {
int i,j,k=1;
public A2() {
	// TODO Auto-generated constructor stub
	for(i=1;i<=5;i++){
		for(j=k;j<=i*2-1;j++){
			System.out.print(j+"");
		}
		System.out.println("");
		k++;
	}
}

public static void main(String[] args) {
	A2 a2=new A2();
}
}
