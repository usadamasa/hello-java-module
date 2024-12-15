module dev.usadamasa.childlib {
    requires split.one;

    // Cannot access dev.usadamasa.split.WidgetTwo by split package.
    // requires split.two;

    exports dev.usadamasa.childlib.exported;
}
