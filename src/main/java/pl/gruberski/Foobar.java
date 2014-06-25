package pl.gruberski;

public class Foobar {

	public String getWord(int number) {
		
		if(number == 1) {
			return "Foo";
		}
		else if(number == 2) {
			return "Bar";
		}
		else {
			throw new IllegalArgumentException("invalid argument");
		}
	}
}
