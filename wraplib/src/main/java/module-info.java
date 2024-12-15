module wraplib {
    requires google.cloud.pubsub;
    requires proto.google.cloud.pubsub.v1;

    exports org.usadamasa.autoapp.auto;
    exports org.usadamasa.autoapp.wrap.pubsub;
}
