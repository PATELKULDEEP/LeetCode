import java.util.Arrays;
import java.util.HashSet;

public class NumberOfDistinctAvg_6237 {

    public static void main(String[] args) {

        int[] nums = {4,1,4,0,3,5};
        System.out.println(distinctAverages(nums));

    }
    public static int distinctAverages(int[] nums) {

        Arrays.sort(nums);
        HashSet<Float> hs = new HashSet<>();

        int len = nums.length;

        for(int i=0,j=len-1; ;i++,j--){

            float avg = (nums[i] + nums[j])/ (float) 2;

            hs.add(avg);
            if(i == j-1 ){
                break;
            }
        }

        return hs.size();

    }

}
