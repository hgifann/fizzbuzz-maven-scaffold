import org.junit.Assert;
import org.junit.Test;

public class Test01 {
	@Test
	public void print_test() {
		Question01 question=new Question01();
		Assert.assertEquals("7", question.printNumber(7));
    	Assert.assertEquals("Fizz", question.printNumber(3));
        Assert.assertEquals("Bizz", question.printNumber(5));
        Assert.assertEquals("FizzBizz", question.printNumber(15));
       
	}

}
