package src.tiposLimitados;

public class NumericFns<T extends Number> {
    T num;

    public NumericFns(T num) {
        this.num = num;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    // Curinga
    public boolean absEqual(NumericFns<?> ob) {
        return Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue());
    }
}

class BoundsDemo {
    public static void main(String[] args) {
        // Integer pode ser usado porque é subclasse de Number
        NumericFns<Integer> iOb = new NumericFns<Integer>(5);

        System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
        System.out.println("Fractional of iOb is " + iOb.fraction());

        System.out.println();

        // Double também pode ser usado
        NumericFns<Double> dOb = new NumericFns<Double>(5.25);

        System.out.println("Reciprocal of dOb is " + dOb.reciprocal());
        System.out.println("Fractional of dOb is " + dOb.fraction());

        // Essa parte não será compilada porque String não é subclasse de Number
        // NumericFns<String> strOb = new NumericFns<String>("Error");
    }
}
