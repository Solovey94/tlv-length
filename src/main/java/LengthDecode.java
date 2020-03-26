import java.math.BigInteger;
import java.util.ArrayList;

public class LengthDecode {

    public static BigInteger lengthDecode(String length) {
        String result = "";
        String expression = length.replaceAll(" ", "");
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            list.add(ch);
        }
        if (list.get(0) == '8') {
            switch (list.get(1)) {
                case ('1'):
                    result = buildExpression(list, 2);
                    break;
                case ('2'):
                    result = buildExpression(list, 3);
                    break;
                case ('3'):
                    result = buildExpression(list, 4);
                    break;
                case ('4'):
                    result = buildExpression(list, 5);
                    break;
                case ('5'):
                    result = buildExpression(list, 6);
                    break;
                case ('6'):
                    result = buildExpression(list, 7);
                    break;
                case ('7'):
                    result = buildExpression(list, 8);
                    break;
            }
        } else {
            for (int i = 0; i<2; i++){
                result = result+list.get(i);
            }
        }
        return hexToDec(result);
    }

    public static String buildExpression(ArrayList<Character> list, Integer num) {
        StringBuffer result = new StringBuffer("");
        for (int x = 2; x < num*2; x++) {
            result.append(list.get(x));
        }
        return result.toString();
    }

    public static BigInteger hexToDec(String length) {
        BigInteger result = BigInteger.ZERO;
        String s = length.toUpperCase();
        for (int i = 0; i <= s.length() - 1; i++) {
            char c = s.charAt(i);
            if (c >= 48 && c < 58) {
                result = (result.multiply(BigInteger.valueOf(16))).add(BigInteger.valueOf((int) (c - 48)));
            } else
                result = (result.multiply(BigInteger.valueOf(16))).add(BigInteger.valueOf(Math.abs('A' - c) + 10));
        }
        return result;
    }

}
