import java.util.Scanner;

public class sort {

	public void sorting(int arr[]){
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;					
				}									
			}			
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
		
		public void insert(int a[], int k) {
		    int a1[] = new int[a.length + 1];
		    for(int i = 0; i < a.length; i++) {
		        if(k < a[i]) {
		            a1[i] = k;
		            for(int j = i + 1; j < a1.length; j++) {
		                a1[j] = a[i];
		                i++;
		            }
		        } else {
		            a1[i] = a[i];
		        }
		    }
		    for (int j = 0; j < a1.length; j++) {
				System.out.println(a1[j]); 
		} 
	}
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter the size of the array : ");
    int size = scan.nextInt();
    
    System.out.println("Enter the elements of the array : ");
	int arr[]=new int[size];
	for (int i = 0; i < size; i++) {
		arr[i]=scan.nextInt();
	}
	sort obj=new sort();
	
	System.out.println("Elements after sorting are : ");
	obj.sorting(arr);
	
	System.out.println("********************************************************");
	
	System.out.println("Enter the element you want to insert : ");
	int element = scan.nextInt();
	
	System.out.println("The array after the insertion of the element is : ");
	obj.insert(arr,element);
	
  }
}
