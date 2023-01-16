
public class A134_장가은_20230116 {
	public String reversePrefix(String word, char ch) {
        final int i = word.indexOf(ch) + 1;
        return new StringBuilder(word.substring(0, i))
        .reverse()
        .append(word.substring(i))
        .toString();
    } 
}
