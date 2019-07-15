import java.util.Arrays;

public class plusOne
{


    public int[] plusOnes(int[] digits)
    {
        int num = digits.length - 1;
        for (int i = num; i >= 0; i--)
        {
            int lastIndex = digits[i];
            if (lastIndex < 9)
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }



    public static void main(String[] args)
    {
        int arr[] = {2,9,9};
     //   int[] ints = new plusOne().plusOne(arr);
      //  System.out.println(Arrays.toString(ints));


        int[] intss = new plusOne().plusOnes(arr);
        System.out.println(Arrays.toString(intss));

    }
}
