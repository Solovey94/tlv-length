
import org.junit.Test;


import java.math.BigInteger;

import static org.junit.Assert.*;


public class LengthEncodeTest {

    @Test
    public void lengthEncodeWithoutAddition() {
        String correctResult = "71";
        BigInteger controlResult = new BigInteger("113");
        assertEquals(LengthEncode.lengthEncode(controlResult), correctResult);
    }

    @Test
    public void lengthEncodeWithAddition81() {
        String correctResult = "81 FE";
        BigInteger controlResult = new BigInteger("254");
        assertEquals(LengthEncode.lengthEncode(controlResult), correctResult);
    }

    @Test
    public void lengthEncodeWithAddition82() {
        String correctResult = "82 0A36";
        BigInteger controlResult = new BigInteger("2614");
        assertEquals(LengthEncode.lengthEncode(controlResult), correctResult);
    }

    @Test
    public void lengthEncodeWithAddition83() {
        String correctResult = "83 010000";
        BigInteger controlResult = new BigInteger("65536");
        assertEquals(LengthEncode.lengthEncode(controlResult), correctResult);
    }

    @Test
    public void lengthEncodeWithAddition84() {
        String correctResult = "84 E2329AFF";
        BigInteger controlResult = new BigInteger("3794967295");
        assertEquals(LengthEncode.lengthEncode(controlResult), correctResult);
    }

    @Test
    public void lengthEncodeWithAddition85() {
        String correctResult = "85 E8B78917FF";
        BigInteger controlResult = new BigInteger("999511627775");
        assertEquals(LengthEncode.lengthEncode(controlResult), correctResult);
    }

    @Test
    public void lengthEncodeWithAddition86() {
        String correctResult = "86 010000000001";
        BigInteger controlResult = new BigInteger("1099511627777");
        assertEquals(LengthEncode.lengthEncode(controlResult), correctResult);
    }

    @Test
    public void lengthEncodeWithAddition87() {
        String correctResult = "87 B8F21B207DFFFF";
        BigInteger controlResult = new BigInteger("52057594037927935");
        assertEquals(LengthEncode.lengthEncode(controlResult), correctResult);
    }

    @Test
    public void lengthEncodeWithValueLessZero() {
        String correctResult = "Введите другую последовательность";
        BigInteger controlResult = new BigInteger("-1");
        assertEquals(LengthEncode.lengthEncode(controlResult), correctResult);
    }


}
