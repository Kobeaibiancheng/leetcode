package array;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]-1] = nums[i];
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) {
                list.add(i+1);
            }
        }
        return list;
    }
    
}
