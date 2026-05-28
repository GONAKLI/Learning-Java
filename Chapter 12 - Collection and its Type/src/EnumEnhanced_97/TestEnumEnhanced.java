package EnumEnhanced_97;

import EnumEnhanced_97.DayWithType;

public class TestEnumEnhanced {
    static void main() {
        for(DayWithType c : DayWithType.values()){
            System.out.printf("%s: --> %s \n", c, c.getDayType());
        }
    }
}
