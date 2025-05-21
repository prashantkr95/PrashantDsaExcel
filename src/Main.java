import generalcode.SumTwoNumbers;

import static generalcode.BiarySearchMeadianOfTwoSorted.findMedian;
import static generalcode.CountAppend.countAppend;
import static generalcode.FirstNonRepeating.findFirstNonrepeating;
import static generalcode.TrappingRainWater.waterTrapped;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("this is my first code in apexon ds");


        }
       // SumTwoNumbers obj=new SumTwoNumbers();
       int result= SumTwoNumbers.add(2,4);
       System.out.println("sum of two numbers is:-" +result);
        int[] arr = {2, 1, 5, 3, 1, 0, 4};
        System.out.println("it is trapping rain water problem is");
        System.out.println(waterTrapped(arr));

        int[] arr1 = {1, 12, 15, 26, 38};
        int[] arr2 = {2, 13, 17, 30, 45, 60};

        System.out.println("It is find median of two sorted arrays is");

        System.out.println(findMedian(arr1, arr2));
        String s2="aaabbbcccdddeeefghij";
        System.out.println("It is find first non repeating character in string is");
        System.out.println(findFirstNonrepeating(s2));
        String str="aaabbbcccddddeeffff";
        System.out.println("it is to find count and append string");
        System.out.println(countAppend(str));

    }
}