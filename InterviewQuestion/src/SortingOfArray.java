
public class SortingOfArray {
public static void main(String[] args) {
	
	
//	int b[]={4,5,2,7,8,5,7,3,9};
//	int intTemp;
	char a[]={'r','t','y','g','r','z','a','o'};
	char temp;
	
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++){
			
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println(a[i]);
	}
	
	
	
	
}
}
