import java.util.*;
public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        double aa=0.0;
        switch(ch)
        {
            case 1:
            {
                aa=Math.PI*Math.pow(a[0],2);
                break;
            }
            case 2:
            {
                aa=a[0]*a[1];
            }
        }
        return aa;
    }
}
