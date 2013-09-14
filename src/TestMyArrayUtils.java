import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: abhinav
 * Date: 14/9/13
 * Time: 8:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestMyArrayUtils {
    @Test
    public void bSearchShouldReturnPositiveValueForExistingElement() {
        int[] array = {0, 1, 3, 4};
        Assert.assertTrue(MyArrayUtils.bSearch(array, 0, array.length - 1, 3) > 0);
    }

    @Test
    public void bSearchShouldReturnNegativeValueForNonExistingElement() {
        int[] array = {0, 1, 3, 4};
        Assert.assertTrue(MyArrayUtils.bSearch(array, 0, array.length - 1, 2) < 0);
    }

    @Test
    public void bSearchFirstOccurrenceShouldReturnCorrectFirstOccurrenceForExistingElement() {
        int[] array = {0, 1, 1, 3, 4};
        Assert.assertEquals(MyArrayUtils.bSearchFirstOccurrence(array, 0, array.length - 1, 1), 1);
    }

    @Test
    public void bSearchFirstOccurrenceShouldReturnCorrectPositionForNonExistingElement() {
        int[] array = {0, 1, 1, 3, 4};
        Assert.assertEquals(MyArrayUtils.bSearchFirstOccurrence(array, 0, array.length - 1, 2), -4);
    }

    @Test
    public void bSearchLastOccurrenceShouldReturnCorrectLastOccurrenceForExistingElement() {
        int[] array = {0, 1, 1, 1, 3, 5};

        Assert.assertEquals(MyArrayUtils.bSearchLastOccurrence(array, 0, array.length - 1, 1), 3);
    }

    @Test
    public void bSearchLastOccurrenceShouldReturnCorrectPositionForNonExistingElement() {
        int[] array = {0, 1, 1, 1, 3, 5};

        Assert.assertEquals(MyArrayUtils.bSearchLastOccurrence(array, 0, array.length - 1, 2), -5);
    }

    @Test
    public void bSearchShouldCorrectPositionForNonExistingElement() {
        int[] array = {0, 1, 3, 4};
        Assert.assertEquals(MyArrayUtils.bSearch(array, 0, array.length - 1, 2), -3);
    }

    @Test
    public void bSearchShouldCorrectPositionForNonExistingElementHighCornerCase() {
        int[] array = {0, 1, 3, 4};
        Assert.assertEquals(MyArrayUtils.bSearch(array, 0, array.length - 1, 5), -5);
    }

    @Test
    public void bSearchFirstOccurrenceShouldCorrectPositionForNonExistingElementHighCornerCase() {
        int[] array = {0, 1, 3, 4};
        Assert.assertEquals(MyArrayUtils.bSearchFirstOccurrence(array, 0, array.length - 1, 5), -5);
    }

    @Test
    public void bSearchLastOccurrenceShouldCorrectPositionForNonExistingElementHighCornerCase() {
        int[] array = {0, 1, 3, 4};
        System.out.println(Arrays.binarySearch(array, 5));
        Assert.assertEquals(MyArrayUtils.bSearchLastOccurrence(array, 0, array.length - 1, 5), -5);
    }
}
