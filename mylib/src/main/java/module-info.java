module usadamasa.mylib {
    requires acllib;
    requires org.usadamasa.childlib;

    // exports org.usadamasa.mylib.hidden;
    exports org.usadamasa.mylib.exported;
}
