public main (){
    public class ChangeToUpperCase {

        public static String toUpperCaseRecursive(String str) {
            if (str.isEmpty()) {
                return "";
            }

            char firstChar = str.charAt(0);
            String remaining = str.substring(1);

            return Character.isUpperCase(firstChar) ? firstChar + remaining : Character.toUpperCase(firstChar) + toUpperCaseRecursive(remaining);
        }

        public static void main(String[] args) {
            String str = "hello";
            System.out.println("Lowercase" + str);
            System.out.println("Uppercase" + toUpperCaseRecursive(str));
        }
    }

}