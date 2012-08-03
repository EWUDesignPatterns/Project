package gui;

public class StringUtils {

	public static String repeat(String str, int times) {
		StringBuilder builder = new StringBuilder();
		
		do {
			builder.append(str);
			times--;
		} while (times > 0);
		
		return builder.toString();
	}
}
