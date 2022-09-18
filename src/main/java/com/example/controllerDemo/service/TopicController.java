package com.example.controllerDemo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private topicService topicService;
    @RequestMapping("/topics")
    public List<Topic>  getAllTopic()
    {
        return topicService.getTopicList();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopicById ( @PathVariable int id)
    {
        return topicService.getTopicById(id);
    }

    @RequestMapping( method = RequestMethod.POST,  value = "/topics")
    public void addTopic(@RequestBody Topic t)
    {

        topicService.addTopic(t);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteTopic/{id}")
    public void deleteTopic(Topic t)
    {

    }

    @RequestMapping(method = RequestMethod.PUT , value = "/update/{id}")
    public void updateTopic(@RequestBody Topic t,@PathVariable int id)
    {
        topicService.updateTopic(t, id);
    }
}
