import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threesum {
    public static List<List<Integer>> threeSum(int nums[]) {
        Set<List<Integer>> res=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> triplet=Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(triplet);
                        res.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }

    public static List<List<Integer>> threeSum2(int nums[]) {
        Set<List<Integer>> res=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            Set<Integer> seen=new HashSet<>();
            int target=-nums[i];

            for(int j=i+1;j<n;j++){
                int complement=target-nums[j];
                if(seen.contains(complement)){
                    List<Integer> triplet=Arrays.asList(nums[i],nums[j],complement);
                    Collections.sort(triplet);
                    res.add(triplet);
                }
                seen.add(nums[j]);
            }

        }
        return new ArrayList<>(res);
    }
    public static List<List<Integer>> threeSum3(int nums[]){
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;

            while (j<k) {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;k--;

                    while (j<k && nums[j]==nums[j-1]) {
                        j++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[]={-1, 0,  1, 2, -1, -4};
        System.out.println(threeSum(nums));
        System.out.println(threeSum2(nums));
        System.out.println(threeSum3(nums));
    }
}
