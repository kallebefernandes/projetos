package sistema;

/**
 *
 * @author kalebe
 */
public class TestaString {
    public static void main(String[] args) {
        String s = "Kalebe";
        s = s.replaceAll("a", "2");
        System.out.println(s);
        boolean contains = s.contains("kal");
        System.out.println(contains);
        String trim = s.trim();
        System.out.println(trim);
        boolean vazia = s.isEmpty();
        System.out.println(vazia);
        int a = s.length();
        System.out.println(a);
    }
}
