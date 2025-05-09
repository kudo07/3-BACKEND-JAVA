package lec7;

public class AbstractConsume extends Profession {
    public void profession() {
        System.out.println("hi iam in th eperson");
    }

    @Override
    public int printO() {

        return 0;
    }
    //defination or implementation
}

class CalculationConsume extends Calculation {

    public static int getPriceOfPen() {
        return 2;
    }
}
//1. This is called method hiding (not overriding)
//Because getPriceOfPen() is static, it is not overridden, it is hidden.
//
//The method in CalculationConsume does not replace the one in Calculation. It just hides it when accessed via the subclass.