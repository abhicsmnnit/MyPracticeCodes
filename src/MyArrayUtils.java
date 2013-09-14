import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: abhinav
 * Date: 14/9/13
 * Time: 8:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyArrayUtils {
    public static int bSearch(int[] array, int fromIndex, int toIndex, int key) {
        return bSearchFirstOccurrence(array, fromIndex, toIndex, key);
    }

    public static int bSearchFirstOccurrence(int[] array, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            }
            else if (key > array[mid]) {
                low = mid + 1;
            }
            else if (low < mid) {
                high = mid;
            }
            else {
                return mid;
            }
        }
        return Arrays.binarySearch(array, fromIndex, toIndex + 1, key);
    }

    public static int bSearchLastOccurrence(int[] array, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            }
            else if (key > array[mid]) {
                low = mid + 1;
            }
            else if (high > mid) {
                low = mid;
            }
            else {
                return mid;
            }
        }
        return Arrays.binarySearch(array, fromIndex, toIndex + 1, key);
    }
}
