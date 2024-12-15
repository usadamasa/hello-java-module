package org.usadamasa.acllib;

import org.usadamasa.split.WidgetOne;
import org.usadamasa.split.WidgetTwo;

public class CallSplitPackage {
    public static String callSplitPackage(String name) {
        WidgetOne widgetOne = new WidgetOne();
        WidgetTwo widgetTwo = new WidgetTwo();
        return widgetOne.widgetOneHello(name) + " " + widgetTwo.widgetTwoHello(name);
    }
}
