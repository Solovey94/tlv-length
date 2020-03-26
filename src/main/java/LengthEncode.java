import java.math.BigInteger;

public class LengthEncode {

    public static String lengthEncode(BigInteger length) {
        if (length.compareTo(new BigInteger("0")) == -1) {
            return "Введите другую последовательность";
        } else if (length.compareTo(new BigInteger("127")) == -1) {   //0x7F
            return decToHex(length);
        } else if (length.compareTo(new BigInteger("255")) == -1) {                 //0xFF
            return ("81 " + decToHex(length));
        } else if (length.compareTo(new BigInteger("65535")) == -1) {               //0xFFFF
            return ("82 " + decToHex(length));
        } else if (length.compareTo(new BigInteger("16777215")) == -1) {            //0xFFFFFF
            return ("83 " + decToHex(length));
        } else if (length.compareTo(new BigInteger("4294967295")) == -1) {          //0xFFFFFFFF
            return ("84 " + decToHex(length));
        } else if (length.compareTo(new BigInteger("1099511627775")) == -1) {       //0xFFFFFFFFFF
            return ("85 " + decToHex(length));
        } else if (length.compareTo(new BigInteger("281474976710655")) == -1) {     //0xFFFFFFFFFFFF
            return ("86 " + decToHex(length));
        } else if (length.compareTo(new BigInteger("72057594037927935")) == -1) {   //0xFFFFFFFFFFFFFF
            return ("87 " + decToHex(length));
        }
        return "Введите другую последовательность";
    }


    public static String decToHex(BigInteger length) {
        String result = "";
        if (length.equals(0))
            result = 0 + result;
        else {
            while (length.compareTo(BigInteger.valueOf(0)) == 1) {
                int num = length.mod(BigInteger.valueOf(16)).intValue();
                if (num >= 0 && num < 10)
                    result = num + result;
                else {
                    char c = (char) ('A' + num - 10);
                    result = c + result;
                }
                length = length.divide(BigInteger.valueOf(16));
            }
        }
        if (result.length() % 2 == 0) {
            return result;
        } else
            return ("0" + result);
    }

}