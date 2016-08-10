# Targetarray
public class Traget {

	public static void main(String[] args) {
		int a[]=new int[]{2,7,11,15};
		int target=9;
		for(int i=0;i<a.length-1;i++){
			if(target==a[i]+a[i+1]){
				System.out.println(a[i]+" "+a[i+1]);
				
			}
		}
	}

}
