public class StringMethods {

    public static void main(String[] args){

        //String length() - length of the string
        String str1 = "length of the string";
        System.out.println(str1.length());

        //String charAT() - returns a char value at the given index number
        String str2 = "return char value";
        System.out.println(str2.charAt(3));

        //String concat() - combines specified string at the given index number
        String str3 = "combine string";
        System.out.println(str3.concat(" to appended string"));

        //String contains() - returns true if chars are found in the string
        String str4 = "returns true if char found";
        System.out.println(str4.contains("if")); //returns true
        System.out.println(str4.contains("at")); // returns false

        //String emdsWith() - checks if this string ends with given suffix


    }
}
