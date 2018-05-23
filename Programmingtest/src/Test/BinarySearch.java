
public class BinarySearch {
	public static void main(String[] args) {
		int ar[]={28,56,10,7,56,32};
		System.out.println("array:");
		dispArr(ar);
		bubbleSort(ar);
		dispArr(ar);
		int in= binary(ar,10,0,ar.length);
		
	}
	public static void dispArr(int ele[])
	{
		for(int i=0;i<ele.length;i++)
		{
			System.out.println(ele[i]+" ");
		}
		System.out.println();
	}
	public static void bubbleSort(int a[]){
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;i<a.length-1;i++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
	}
	static int binary(int ar[],int ele, int low,int high)
	{
		if(low>high)
			return -1;
		int mid=(low+high)/2;
		if(ar[mid]==ele)
		{
			return mid;
		}
		if(ar[mid]<ele)
		return binary(ar,ele,mid+1,high);
		else
			return binary(ar,ele,low,mid-1);
	}

}
