module dev.usadamasa.mylib {
    requires usadamasa.acllib;
    requires dev.usadamasa.childlib;

    // exports dev.usadamasa.mylib.hidden;
    exports dev.usadamasa.mylib.exported;
}
