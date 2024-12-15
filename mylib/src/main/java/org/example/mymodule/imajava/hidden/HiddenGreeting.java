package org.example.mymodule.imajava.hidden;

// Don't allow to use com.google.pubsub.v1.TopicName.
//import com.google.pubsub.v1.TopicName;

import org.usadamasa.autoapp.wrap.pubsub.CreateTopicExample;

import java.io.IOException;

public class HiddenGreeting {
    public String hello(String name) {
        sample();
        return "(Hidden) -> " + name;
    }

    public void sample(){
        // Don't allow to use com.google.pubsub.v1.TopicName
        // TopicName topicName = TopicName.of("project-id", "topic-id");

        try {
            var createTopicExample = new CreateTopicExample();
            createTopicExample.example("project-id", "topic-id");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
