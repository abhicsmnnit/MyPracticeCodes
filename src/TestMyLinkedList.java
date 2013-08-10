import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: abhinav
 * Date: 10/8/13
 * Time: 11:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestMyLinkedList {
    @Test
    public void sizeOfEmptyListIsZero() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        assert (myLinkedList.size() == 0);
        Assert.assertEquals("", myLinkedList.toString());
    }

    @Test
    public void sizeOfListAfterOneInsertionIs1() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.add(1);
        assert (myLinkedList.size() == 1);
    }

    @Test
    public void clearingAListActuallyClearsIt() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        Integer addedElement1 = 1;
        Integer addedElement2 = 2;
        Integer addedElement3 = 3;
        Integer addedElement4 = 4;
        Integer addedElement5 = 5;

        myLinkedList.add(addedElement1);
        myLinkedList.add(addedElement2);
        myLinkedList.add(addedElement3);
        myLinkedList.add(addedElement4);
        myLinkedList.add(addedElement5);
        Assert.assertEquals("[" + addedElement1 + "]" + "[" + addedElement2 + "]" + "[" + addedElement3 + "]" + "[" + addedElement4 + "]" + "[" + addedElement5 + "]", myLinkedList.toString());

        myLinkedList.clear();
        Assert.assertEquals("", myLinkedList.toString());

    }

    @Test
    public void emptyListMustNotContainAnyElement() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        Assert.assertFalse(myLinkedList.contains(1));
    }

    @Test
    public void listMustNeverContainNull() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        Assert.assertFalse(myLinkedList.contains(null));

        myLinkedList.add(1);
        Assert.assertFalse(myLinkedList.contains(null));
    }

    @Test
    public void anAddedElementMustBeThereInTheList() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        Integer addedElement = 1;
        myLinkedList.add(addedElement);
        Assert.assertTrue(myLinkedList.contains(addedElement));
        Assert.assertEquals("[" + addedElement + "]", myLinkedList.toString());
    }

    @Test
    public void anElementAfterRemovalMustNotBeThereInTheList() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        Integer addedElement = 1;
        myLinkedList.add(addedElement);
        Assert.assertTrue(myLinkedList.contains(addedElement));
        Assert.assertEquals("[" + addedElement + "]", myLinkedList.toString());

        myLinkedList.remove(addedElement);
        Assert.assertFalse(myLinkedList.contains(addedElement));
        Assert.assertEquals("", myLinkedList.toString());
    }

    @Test
    public void shouldBeAbleToRemoveOnlyOneElementPresentInTheListCorrectly() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        Integer addedElement = 1;
        myLinkedList.add(addedElement);
        Assert.assertEquals("[" + addedElement + "]", myLinkedList.toString());

        myLinkedList.remove(addedElement);
        Assert.assertEquals("", myLinkedList.toString());
        Assert.assertEquals(0, myLinkedList.size());
    }

    @Test
    public void shouldBeAbleToRemoveTheFirstElementCorrectly() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        Integer addedElement1 = 1;
        Integer addedElement2 = 2;
        Integer addedElement3 = 3;
        myLinkedList.add(addedElement1);
        myLinkedList.add(addedElement2);
        myLinkedList.add(addedElement3);
        Assert.assertEquals("[" + addedElement1 + "]" + "[" + addedElement2 + "]" + "[" + addedElement3 + "]", myLinkedList.toString());


        myLinkedList.remove(addedElement1);
        Assert.assertEquals("[" + addedElement2 + "]" + "[" + addedElement3 + "]", myLinkedList.toString());
    }

    @Test
    public void shouldBeAbleToRemoveTheLastElementCorrectly() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        Integer addedElement1 = 1;
        Integer addedElement2 = 2;
        Integer addedElement3 = 3;

        myLinkedList.add(addedElement1);
        myLinkedList.add(addedElement2);
        myLinkedList.add(addedElement3);
        Assert.assertEquals("[" + addedElement1 + "]" + "[" + addedElement2 + "]" + "[" + addedElement3 + "]", myLinkedList.toString());

        myLinkedList.remove(addedElement3);
        Assert.assertEquals("[" + addedElement1 + "]" + "[" + addedElement2 + "]", myLinkedList.toString());
    }

    @Test
    public void shouldBeAbleToRemoveOneOfTheMiddleElementCorrectly() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        Integer addedElement1 = 1;
        Integer addedElement2 = 2;
        Integer addedElement3 = 3;
        Integer addedElement4 = 4;
        Integer addedElement5 = 5;

        myLinkedList.add(addedElement1);
        myLinkedList.add(addedElement2);
        myLinkedList.add(addedElement3);
        myLinkedList.add(addedElement4);
        myLinkedList.add(addedElement5);
        Assert.assertEquals("[" + addedElement1 + "]" + "[" + addedElement2 + "]" + "[" + addedElement3 + "]" + "[" + addedElement4 + "]" + "[" + addedElement5 + "]", myLinkedList.toString());

        myLinkedList.remove(addedElement3);
        Assert.assertEquals("[" + addedElement1 + "]" + "[" + addedElement2 + "]" + "[" + addedElement4 + "]" + "[" + addedElement5 + "]", myLinkedList.toString());
    }

    @Test
    public void shouldNotRemoveAnElementThatIsOutOfBound() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        Assert.assertFalse(myLinkedList.remove(-1));
        Assert.assertFalse(myLinkedList.remove(0));

        Integer addedElement = 100;
        myLinkedList.add(addedElement);
        Assert.assertEquals("[" + addedElement + "]", myLinkedList.toString());

        Assert.assertFalse(myLinkedList.remove(-1));
        Assert.assertEquals("[" + addedElement + "]", myLinkedList.toString());
    }

    @Test
    public void shouldBeAbleToRemoveOnlyOneElementPresentInTheListCorrectlyUsingIndex() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        Integer addedElement = 1;
        myLinkedList.add(addedElement);
        Assert.assertEquals("[" + addedElement + "]", myLinkedList.toString());

        myLinkedList.remove(0);
        Assert.assertEquals("", myLinkedList.toString());
        Assert.assertEquals(0, myLinkedList.size());
    }

    @Test
    public void shouldBeAbleToRemoveTheFirstElementCorrectlyUsingIndex() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        Integer addedElement1 = 1;
        Integer addedElement2 = 2;
        Integer addedElement3 = 3;
        myLinkedList.add(addedElement1);
        myLinkedList.add(addedElement2);
        myLinkedList.add(addedElement3);
        Assert.assertEquals("[" + addedElement1 + "]" + "[" + addedElement2 + "]" + "[" + addedElement3 + "]", myLinkedList.toString());


        myLinkedList.remove(0);
        Assert.assertEquals("[" + addedElement2 + "]" + "[" + addedElement3 + "]", myLinkedList.toString());
    }

    @Test
    public void shouldBeAbleToRemoveTheLastElementCorrectlyUsingIndex() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        Integer addedElement1 = 1;
        Integer addedElement2 = 2;
        Integer addedElement3 = 3;

        myLinkedList.add(addedElement1);
        myLinkedList.add(addedElement2);
        myLinkedList.add(addedElement3);
        Assert.assertEquals("[" + addedElement1 + "]" + "[" + addedElement2 + "]" + "[" + addedElement3 + "]", myLinkedList.toString());

        myLinkedList.remove(2);
        Assert.assertEquals("[" + addedElement1 + "]" + "[" + addedElement2 + "]", myLinkedList.toString());
    }

    @Test
    public void shouldBeAbleToRemoveOneOfTheMiddleElementCorrectlyUsingIndex() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        Integer addedElement1 = 100;
        Integer addedElement2 = 200;
        Integer addedElement3 = 300;
        Integer addedElement4 = 400;
        Integer addedElement5 = 500;

        myLinkedList.add(addedElement1);
        myLinkedList.add(addedElement2);
        myLinkedList.add(addedElement3);
        myLinkedList.add(addedElement4);
        myLinkedList.add(addedElement5);
        Assert.assertEquals("[" + addedElement1 + "]" + "[" + addedElement2 + "]" + "[" + addedElement3 + "]" + "[" + addedElement4 + "]" + "[" + addedElement5 + "]", myLinkedList.toString());

        myLinkedList.remove(2);
        Assert.assertEquals("[" + addedElement1 + "]" + "[" + addedElement2 + "]" + "[" + addedElement4 + "]" + "[" + addedElement5 + "]", myLinkedList.toString());
    }

    @Test
    public void test() {

    }
}
