module wraplib {
    requires google.cloud.pubsub;
    requires proto.google.cloud.pubsub.v1;

    exports org.usadamasa.auto;
    exports org.usadamasa.wrap.pubsub;
}
