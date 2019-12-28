
public class Question01 {
	public String printNumber(int i) {
		if(i%3==0&&i%5==0) {
			return "FizzBizz";
		}else if(i%3==0) {
			return "Fizz";
		}else if(i%5==0) {
			return "Bizz";
		}
		return i+"";
	}

}
