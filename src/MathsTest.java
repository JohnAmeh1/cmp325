import org.junit.*;

public class MathsTest{
    Maths maths;
    @Before
    public void setUpInstance(){
        maths = new Maths();
    }
    @Test
    public void checkTheSumOfTwoNumbersEqualsThree(){
        Assert.assertEquals(3,maths.addTwoNumbers(3,0));
    }
    @Test
    public void checkTheSumOfTwoNumbersEqualsThreeAgain(){
        Assert.assertEquals(3, maths.addTwoNumbers(1,2));
    }
    @Test
    public void checkThePrime(){
        Assert.assertTrue(maths.checkIfNumberIsPrime(13));
    }
}
