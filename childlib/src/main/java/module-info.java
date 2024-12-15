module org.usadamasa.childlib {
    requires split.one;

    // Cannot access org.usadamasa.split.WidgetTwo by split package.
    // requires split.two;

    exports org.usadamasa.childlib.exported;
}
