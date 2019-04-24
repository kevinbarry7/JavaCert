public class String1 {
    public static void main(String[] args) {
        String string = "animals";
        System.out.println(string.length());

        System.out.println(string.charAt(0));
        System.out.println(string.charAt(6));
        //System.out.println(string.charAt(7)); //throws outofbounds exception
        System.out.println("____________");

        System.out.println(string.indexOf('a'));
        System.out.println(string.indexOf("al"));
        System.out.println(string.indexOf('a', 4));
        System.out.println(string.indexOf("al", 5));
        System.out.println("____________");

        System.out.println(string.substring(3));
        System.out.println(string.substring(string.indexOf('m')));
        System.out.println(string.substring(3, 5));
        System.out.println(string.substring(3, 7));
        System.out.println("____________");

        System.out.println(string.toUpperCase());
        System.out.println(string);
        System.out.println("ABc123".toLowerCase());
        System.out.println("____________");

        System.out.println("abc".equals("ABC"));
        System.out.println("ABC".equals("ABC"));
        System.out.println("abc".equalsIgnoreCase("ABC"));
        System.out.println("____________");

        System.out.println("abc".startsWith("a"));
        System.out.println("abc".startsWith("A"));
        System.out.println("abc".endsWith("c"));
        System.out.println("abc".endsWith("b"));
        System.out.println("____________");

        System.out.println("abc".contains("b"));
        System.out.println("abc".contains("F"));
        System.out.println("____________");

        System.out.println("abcabc".replace('a', 'A'));
        System.out.println("abcabc".replace("a", "A"));
        System.out.println("____________");

        System.out.println("\t   abc\n  ".length());
        String trimmed = "\t   abc\n  ".trim();
        System.out.println(trimmed.length());
        System.out.println("____________");

        //Method chaining
        String start = "AniMaL";
        String trimmed1 = start.trim();
        String lowercase = trimmed1.toLowerCase();
        String result = lowercase.replace('a', 'A');
        System.out.println(result);
        System.out.println("____________");
        



    }
}