// นายยศนนท์ ดวงไข 663380021-5 Sec 1
package sqa.test;
import sqa.main.LiquidVolumeConverter;

public class StubLiquid extends LiquidVolumeConverter {
    @Override
    public double convert(double liquidValue, String fromUnit, String toUnit) {
        if (fromUnit.equalsIgnoreCase("cup") && toUnit.equalsIgnoreCase("ml") && liquidValue == 4)
            return 1000.0;
        if (fromUnit.equalsIgnoreCase("pint") && toUnit.equalsIgnoreCase("ml") && liquidValue == 2)
            return 946.352;
        if (fromUnit.equalsIgnoreCase("pint") && toUnit.equalsIgnoreCase("ml") && liquidValue == 13)
            return 6151.288;
        return 0.0;
    }
    @Override
    public double getConversionFactor(String fromUnit, String toUnit) {
        if (fromUnit.equalsIgnoreCase("cup") && toUnit.equalsIgnoreCase("ml"))
            return 250.0;
        return 0.0;
    }
}