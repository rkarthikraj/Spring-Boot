package com.practise.service;

import com.practise.pojo.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1", "Sprint-Boot", "Quickstart for spring-boot"),
            new Topic("2", "Java", "Master the Java programming language"),
            new Topic("3", "Operating Systems", "Operating systems for dummies")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String topicId) {
        return topics.stream().filter(t -> t.getId().equals(topicId)).findFirst().get();
    }

    public String addTopic(Topic topicRequest) {
        topics.add(topicRequest);
        return "TOPIC ADDED SUCCESSFULLY";
    }

    public String updateTopic(String topicId, Topic topicRequest) {
        for (int i = 0; i < topics.size(); ++i) {
            Topic t = topics.get(i);
            if (t.getId().equals(topicId)) {
                topics.set(i, topicRequest);
                return "TOPIC UPDATED SUCCESSFULLY";
            }
        }
        return "UPDATE FAILED";
    }

    public String deleteTopic(String topicId) {
        topics.removeIf(t -> t.getId().equals(topicId));
        return "DELETED SUCCESSFULLY";
    }
}
