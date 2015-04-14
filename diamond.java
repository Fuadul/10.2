
public class diamond {

	public static void main(String[] args) {
		int i=1;
		String s=" ",m="*";
		
		while(i<=5){
			if(i==1 || i==5){
			System.out.println(s+s+m);
			i=i+1;
			}
			if(i==2 || i==4){
				System.out.println(s+m+m+m);
				i=i+1;
			}
			if(i==3){
				System.out.println(m+m+m+m+m);
				i=i+1;
			}
		}

	}

}
