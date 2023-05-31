import java.math.BigDecimal;

public class Fraction {
    public static double fraction(double x){
        BigDecimal t = BigDecimal.valueOf((int) x);
        BigDecimal d = BigDecimal.valueOf(x);
        BigDecimal res = d.subtract(t);
        return res.doubleValue();
    }
}
