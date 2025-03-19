import java.util.Arrays;

public class PracticeProblem{
	static int[] compareSearch(int[] array, int number){
		int[] compare = new int[]{-1, -1};
		for(int i = 0; i < array.length; ++i){
			if(array[i] == number){
				compare[0] = i+1;
				break;
			}
		}
		if(compare[0] == -1){
			compare[0] = array.length;
		}
		Arrays.sort(array);
		int i = 0;
		for(int low = 0, high = array.length, mid = array.length/2; low <= high; mid = low+(high-low)/2){
			++i;
			if(number < array[mid]){
				high = mid-1;
			}else if(number > array[mid]){
				low = mid+1;
			}else{
				break; 
			}
		}
		compare[1] = i;
		return compare;
	}

	static int[] compareStringSearch(String[] array, String word){
		int[] compare = new int[]{-1, -1};
		for(int i = 0; i < array.length; ++i){
			if(array[i].equals(word)){
				compare[0] = i+1;
				break;
			}
		}
		if(compare[0] == -1){
			compare[0] = array.length;
		}
		Arrays.sort(array);
		int i = 0;
		for(int low = 0, high = array.length, mid = array.length/2; low <= high; mid = low+(high-low)/2){
			++i;
			if(word.compareTo(array[mid]) < 0){
				high = mid-1;
			}else if(word.compareTo(array[mid]) > 0){
				low = mid+1;
			}else{
				break; 
			}
		}
		compare[1] = i;
		return compare;
	}
	
	public static void main(String args[]){}
}
