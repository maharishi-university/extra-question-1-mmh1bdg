public class FindIndices {
    public static void main(String...args){
        int nums = [2,7,11,15];
        int target=9;
        int indicesTwo[]=findTwoIndices(nums, target);
        int indicesAll[]=findAllIndices(nums);
        for(int i=0; i<indicesTwo.length; i++){
            System.out.println("Found Indices are: "+indicesTwo[i])
        }


    }

    public int[] findTwoIndices(int[] nums, int target){
        int indices[];
        for(int i=0; i<nums.length; i++){
            if(i<nums.length-1){
                int sum=nums[i]+nums[i+1];
                if(sum==target){
                    indices[i]=nums[i]
                    indices[i+1]=nums[i+1];
                    return indices;
                }
            }

        }
    }
}
