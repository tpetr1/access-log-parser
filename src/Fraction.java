public class Fraction extends Number{

    int num,denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    public String toString() {
        return num + "/" + denum;
    }

    public byte byteValue() {
        return (byte) ((byte) num/denum);
    }

    public short shortValue() {
        return (short) ((short) num/denum);
    }

    public int intValue() {
        return (int) num/denum;
    }

    public long longValue() {
        return (long) ((long) num/denum);
    }

    public float floatValue() {
        return (float) ((float) num/denum);
    }

    public double doubleValue() {
        return (double) ((double) num/denum);
    }
}
