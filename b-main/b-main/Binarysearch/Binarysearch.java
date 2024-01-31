
/**
 * Write a description of class Binarysearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Binarysearch
{
public static void main(String[] args){

    int[]nums = {1,2,3,4,5,6,7,8,9,10};
    
    System.out.println(binarySearch(nums, 0, nums.length-1, 4));
    
}

public static int binarySearch(int[] nums, int start, int end, int key) {
    int half = (start+end)/2;
    
    if(key == nums[half]) return half;
    if(key == start) return start;
    if(key == end) return end;
    
    else if(key<nums[half]) {
        System.out.println("s");
        end = half;
        return binarySearch(nums, start, end, key);
    }
    else if(key>nums[half]) {
        System.out.println("a");
        start = half;
        return binarySearch(nums, start, end, key);
    }
    return -1;
}
   
    
}
