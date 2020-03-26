import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------TEST----------");
        BigInteger x = new BigInteger("14");
        System.out.println(x.toString() + ": " + LengthEncode.lengthEncode(x));
        System.out.println("------------------------");
        BigInteger y = LengthDecode.lengthDecode("71");
        System.out.println(y);
    }
}
