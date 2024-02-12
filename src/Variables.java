//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Variables {
    public static void main(String[] args) {
        System.out.println("Welcome Home!!");

        /*
        Byte
        Min: -128
        Max: 127
        Default: 0
        */
        byte byteVariable = 100;
        System.out.println("Byte value is " + byteVariable);

        /*
        Short
        Min: -32,768
        Max: 32,767
        Default: 0
         */
        short shortVariable = 1000;
        System.out.println("Short value is " + shortVariable);

        /*
        int
        min : -2,147,483,648
        max : 2,147,483,647
        Default : 0
         */
        int integerVariable = 100000;
        System.out.println("int value is " + integerVariable);

        /*
        long
        min : 2^63
        max : 2^ 63 -1
        Default : 0
         */
        long longVariable = 100000000000000000L;
        System.out.println("long value is " + longVariable);


        /*
        float
        Default : 0.0f
         */
        float floatVariable = 20.0f;
        System.out.println("float Value is " +floatVariable);

         /*
        double
        Default : 0.0d
         */
        double doubleVariable = 20.33;
        System.out.println("double value is " +doubleVariable);

        /*
        boolean
        false and true
        Default: false
         */
        boolean booleanVariable = false;
        System.out.println("boolean value is " +booleanVariable);

        /*
        char
        min : 0
        Max : 65,535
         */
        char charVariable = 'a';
        System.out.println("char value is " +charVariable);


    }
}