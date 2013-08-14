import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: abhinav
 * Date: 15/8/13
 * Time: 4:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestValidParenthesization {
    @Test
    public void shouldPassASimplePairOfParens() {
        ValidParenthesization validParenthesization = new ValidParenthesization();
        String pattern = "()";
        Assert.assertTrue(validParenthesization.isValidParenthesization(pattern));
    }

    @Test
    public void shouldNotPassAPatternStartingWithRightParen() {
        ValidParenthesization validParenthesization = new ValidParenthesization();
        String pattern = ")()";
        Assert.assertFalse(validParenthesization.isValidParenthesization(pattern));
    }

    @Test
    public void shouldPassACertainComplexValidPattern() {
        ValidParenthesization validParenthesization = new ValidParenthesization();
        String pattern = "(()())()";
        Assert.assertTrue(validParenthesization.isValidParenthesization(pattern));
    }

    @Test
    public void shouldNotPassAPatternThatMissesSomeRightParensInTheEnd() {
        ValidParenthesization validParenthesization = new ValidParenthesization();
        String pattern = "(()()(";
        Assert.assertFalse(validParenthesization.isValidParenthesization(pattern));
    }
}
