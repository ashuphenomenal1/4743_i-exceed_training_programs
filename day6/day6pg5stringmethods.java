public class day6pg5stringmethods {

    public static void main(String[] args) {
        String s="Rao Sahab on Top";
        System.out.println(s);
        int l= s.length();
        System.out.println("Length of the string: "+l);
        System.out.println(s.isEmpty());
        System.out.println(s.codePointAt(4));
        System.out.println(s.charAt(4));
        System.out.println(s.codePointBefore(2));
        System.out.println(s.codePointCount(2, 3));
        System.out.println(s.getBytes());
        System.out.println(s.endsWith("b"));
        System.out.println((char) s.indexOf(0,3 ));
        System.out.println(s.toUpperCase());
    }
}