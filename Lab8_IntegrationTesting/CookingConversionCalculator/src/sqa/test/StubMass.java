//นายยศนนท์ ดวงไข 663380021-5 Sec 1
package sqa.test;
import sqa.main.MassConverter;

public class StubMass extends MassConverter {
    @Override
    public double convert(double massValue, String fromUnit, String toUnit) {
        if (fromUnit.equalsIgnoreCase("tablespoon") && toUnit.equalsIgnoreCase("gram") && massValue == 10)
            return 80.0;
        if (fromUnit.equalsIgnoreCase("kilogram") && toUnit.equalsIgnoreCase("pound") && massValue == 50)
            return 110.25;
        if (fromUnit.equalsIgnoreCase("kilogram") && toUnit.equalsIgnoreCase("kilogram") && massValue == 0)
            return 154.35;
        if (fromUnit.equalsIgnoreCase("oz") && toUnit.equalsIgnoreCase("gram") && massValue == 10)
            return 283.49;
        return 0.0;
    }
    @Override
    public double getConversionFactor(String fromUnit, String toUnit) {
        if (fromUnit.equalsIgnoreCase("tablespoon") && toUnit.equalsIgnoreCase("gram"))
            return 8.0;
        return 0.0;
    }
}