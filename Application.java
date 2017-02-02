/**
 * Created by Lori on 2/2/2017.
 */
public class Application {

    /**
     * This method calculates the sum of the numbers in the array except the number 13 and every other number
     * that follows after it.
     * @param nums the array of numbers.
     * @return the sum of the numbers.
     */
    private int sum13(int[] nums)
    {
        int sum = 0;

        if (nums.length == 0)
            return 0;

        for (int counter = 0; counter < nums.length; counter++)
        {
            if (nums[counter] != 13)
                sum += nums[counter];
            else
                break;
        }
        return sum;
    }

    public static void main (String []args)
    {
        Application application = new Application();
        int[] nums = {1,2,2,1,13};

        System.out.println(application.sum13(nums));
    }
}
