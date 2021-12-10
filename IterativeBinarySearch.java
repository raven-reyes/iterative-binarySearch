
public class IterativeBinarySearch {
	
	public static int binarySearch(int arr [] , int l, int r, int key) {
		int mid = l + (r-l)/2;
		for(int i = 0 ; i < arr.length; i++) {
		while (l <= r) {
			if (arr[mid] == key) {
				return mid;
			}
			 if(arr[mid] < key) {
				 return binarySearch(arr, mid + 1, r, key);
			 } else {
				 return binarySearch(arr, l, mid - 1, key);
			 }
		}
		}
		return -1;
		
	}
	

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,6,7,8,9,10,13};
		int key = 10;
		int index = binarySearch(arr, 0, arr.length-1, key);
		if (index != -1) {  // if index is not -1
            System.out.println("Element " + key + " is present at index " + index); 
        } else {
             System.out.println("Element " + key + " is not present");
        
        }
	}

}
