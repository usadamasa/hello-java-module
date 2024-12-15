package org.usadamasa.autoapp.wrap.pubsub;

import com.google.cloud.pubsub.v1.TopicAdminClient;
import com.google.pubsub.v1.Topic;
import com.google.pubsub.v1.TopicName;

import java.io.IOException;

public class CreateTopicExample {
    public static void createTopicExample(String projectId, String topicId) throws IOException {
        TopicName topicName = TopicName.of(projectId, topicId);
        try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
            Topic topic = topicAdminClient.createTopic(topicName);
            System.out.println("Created topic: " + topic.getName());
        }
    }

    public void example(String projectId, String topicId) throws Exception {
        createTopicExample(projectId, topicId);
    }
}
