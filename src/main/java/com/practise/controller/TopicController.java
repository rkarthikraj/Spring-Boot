package com.practise.controller;

import com.practise.pojo.Topic;
import com.practise.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicsService;

    @RequestMapping("/topic")
    public List<Topic> getAllTopics() {
        return topicsService.getAllTopics();
    }

    @RequestMapping("/topic/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicsService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topic")
    public String addTopic(@RequestBody Topic topicRequest) {
        String result = "FAILED";
        result = topicsService.addTopic(topicRequest);
        return result;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topic/{id}")
    public String updateTopic(@PathVariable String id, @RequestBody Topic topicRequest) {
        String result = "FAILED";
        result = topicsService.updateTopic(id, topicRequest);
        return result;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topic/{id}")
    public String deleteTopic(@PathVariable String id) {
        String result = "FAILED";
        result = topicsService.deleteTopic(id);
        return result;
    }
}
