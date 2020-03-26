import org.junit.Test;
import org.junit.runner.RunWith;

import java.math.BigInteger;

import static org.junit.Assert.*;


public class LengthDecodeTest {

    @Test
    public void lengthDecodeWithoutAddition() {
        BigInteger correctResult = new BigInteger("113");
        String controlResult = "71";
        assertEquals(LengthDecode.lengthDecode(controlResult), correctResult);
    }

    @Test
    public void lengthDecodeWithAddition81() {
        BigInteger correctResult = new BigInteger("254");
        String controlResult = "81 FE";
        assertEquals(LengthDecode.lengthDecode(controlResult), correctResult);
    }

    @Test
    public void lengthDecodeWithAddition82() {
        BigInteger correctResult = new BigInteger("2614");
        String controlResult = "82 0A36";
        assertEquals(LengthDecode.lengthDecode(controlResult), correctResult);
    }

    @Test
    public void lengthDecodeWithAddition83() {
        BigInteger correctResult = new BigInteger("65536");
        String controlResult = "83 010000";
        assertEquals(LengthDecode.lengthDecode(controlResult), correctResult);
    }

    @Test
    public void lengthDecodeWithAddition84() {
        BigInteger correctResult = new BigInteger("3794967295");
        String controlResult = "84 E2329AFF";
        assertEquals(LengthDecode.lengthDecode(controlResult), correctResult);
    }

    @Test
    public void lengthDecodeWithAddition85() {
        BigInteger correctResult = new BigInteger("999511627775");
        String controlResult = "85 E8B78917FF";
        assertEquals(LengthDecode.lengthDecode(controlResult), correctResult);
    }

    @Test
    public void lengthDecodeWithAddition86() {
        BigInteger correctResult = new BigInteger("1099511627777");
        String controlResult = "86 010000000001";
        assertEquals(LengthDecode.lengthDecode(controlResult), correctResult);
    }

    @Test
    public void lengthDecodeWithAddition87() {
        BigInteger correctResult = new BigInteger("52057594037927935");
        String controlResult = "87 B8F21B207DFFFF";
        assertEquals(LengthDecode.lengthDecode(controlResult), correctResult);
    }
}
