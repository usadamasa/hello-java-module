package org.usadamasa.childlib.exported;

import org.usadamasa.split.WidgetOne;

public class ChildLibExported {
    public String childLibHello(String name) {
        return "(Named Module) " + name + "!";
    }

    public String callSplitedModule(String name) {
        WidgetOne widgetOne = new WidgetOne();
//        WidgetTwo widgetTwo = new WidgetTwo();
//        return widgetOne.widgetOneHello(name) + " " + widgetTwo.widgetTwoHello(name);
        return widgetOne.widgetOneHello(name);
    }
}
