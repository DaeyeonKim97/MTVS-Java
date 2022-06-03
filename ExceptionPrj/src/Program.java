
public class Program {

	public static void main(String[] args) {
		int result = 0;
		try {
			result = Calculator.add(3, 400000);
		}
		catch(천을_넘는_예외 | 음수가되는예외 e){
			
		}
		catch(Exception e) {
			
		}
		finally {
			System.out.println("catch가 될 경우 이것이 출력 됨.");
		}
		result = Calculator.sub(3, 4);
		result = Calculator.mul(3, 4);
		result = Calculator.div(3, 4);
	}

}
