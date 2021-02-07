
int implementBinarySearch(int arr[], int element)	{  
	int start = 0, end = arr.length - 1;
	while (start <= end) {
		int mid = (start + end) / 2;  
		if (arr[mid] == element)
			return mid;	           // Found the element, returning from it. 
		if (arr[mid] < element)
			start = mid + 1;      //Move to the right of the array.  
		else
			end= mid - 1;         //Move to the left of the array.
	}
	return -1; // If element not found, returning.
}
