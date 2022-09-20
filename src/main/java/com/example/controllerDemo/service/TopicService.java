package com.example.controllerDemo.service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {


    public List<Topic> getTopicList()
    {
        Topic t1 = new Topic("Spring",1,"Framework");
        Topic t2 = new Topic("Java",2,"Language");
        Topic t3 = new Topic("Hibernate",3,"Framework");

        List<Topic> l = new ArrayList();
        l.add(t1);
        l.add(t2);
        l.add(t3);

        return l;

    }

    public Topic getTopicById(int id)
    {

        return  getTopicList().stream().filter(t -> t.getTopicId()== id).findAny().get();
    }

    public Topic getTopicByName(String name)
    {
        return getTopicList().stream().filter(t->t.getTopicName().equalsIgnoreCase(name)).findFirst().get();
    }

    public void addTopic(Topic t) {
        List<Topic> l = new ArrayList<>();
        getTopicList().add(t);
    }

    public void deleteTopic(Topic id) {

        
    }

    public void updateTopic(Topic t, int id) {

        for (int i = 0; i < getTopicList().size(); i++) {
            if (getTopicList().get(i).getTopicId() == id) {
                getTopicList().set(id, t);
            }
        }

    }
}
