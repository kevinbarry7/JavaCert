import java.lang.System; // redundant import because this package is always imported
import java.lang.*; //also redundant like previous line
import java.util.Random;
import java.util.*; // also redundant unless you wanted something else besides just Random
public class ImportExample {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(10));
	}
}