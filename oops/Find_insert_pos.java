public class Find_insert_pos {

    public int insertPosition(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] < target && nums[i + 1] > target) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }

}
