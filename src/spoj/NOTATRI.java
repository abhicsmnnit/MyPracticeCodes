package spoj;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: abhinav
 * Date: 17/8/13
 * Time: 10:28 PM
 * Status: Accepted
 * To change this template use File | Settings | File Templates.
 */
public class NOTATRI {
    private static int N;
    private static int[] array;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            N = in.nextInt();
            if (N == 0)
                break;
            array = new int[N];
            for (int i = 0; i < N; i++) {
               array[i] = in.nextInt();
            }

            Arrays.sort(array);
            System.out.println(notATriangleCount());
        }
    }

    private static int notATriangleCount() {
        int notATriangleCounter = 0;
        for (int i = N - 1; i > 0; i--) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (array[left] + array[right] < array[i]) {
                    notATriangleCounter += (right - left);
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return notATriangleCounter;
    }
}
