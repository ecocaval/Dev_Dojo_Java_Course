package aula106Wrappers.test;

public class WrapperTest01 {

    public static void main(String[] args) {
        byte byteTest = 1;
        short shortTest = 1;
        int intTest = 1;
        long longTest = 1L;
        float floatTest = 1F;
        double doubleTest = 1D;
        char charTest = '1';
        boolean booleanTest = true;
        String stringTest = "1";

        // boxing
        Byte byteWrapper = byteTest;
        Short shortWrapper = shortTest;

        Byte byteWrapper2 = 1;
        Short shortWrapper2 = 1;
        Integer intWrapper = 1;
        Long longWrapper = 1L;
        Float floatWrapper = 1F;
        Double doubleWrapper = 1D;
        Character charWrapper = '1';
        Boolean booleanWrapper = true;
        String stringWrapper = "1";

        // unboxing
        byte byteTest2 = byteWrapper2;
        short shortTest2 = shortWrapper2;
    }
}
