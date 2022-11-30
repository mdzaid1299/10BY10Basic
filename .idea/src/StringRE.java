package ReverseString;

public class StringRE {
    public static void main(String[] args) {
        String st = "Happy";
        String reverse = "";
        for (int i = st.length(); i > -0; i--) {
            reverse = reverse + st.charAt(i);

        }
        System.out.println("reverse of Happy " + reverse);
    }
}
