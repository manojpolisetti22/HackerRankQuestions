import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ali = new int[3];
        int[] bo = new int[3];

        int alice = 0, bob = 0;

        for(int i = 0; i < 3; i ++){
            ali[i] = in.nextInt();

        }
        for(int j = 0; j < 3; j ++){
            bo[j] = in.nextInt();
        }
        for (int k = 0; k < 3; k++){
            if(ali[k] > bo[k]) {
                alice++;
            }
            if(ali[k] < bo[k]) {
                bob++;
            }
        }
        System.out.println("" + alice + " " + bob);

        /*int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();*/

    }
}
