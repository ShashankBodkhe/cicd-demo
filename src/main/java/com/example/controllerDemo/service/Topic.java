package com.example.controllerDemo.service;

public class Topic {

    private String topicName;
    private int topicId;
    private String description;

    public Topic(String topicName, int topicId, String description) {
        this.topicName = topicName;
        this.topicId = topicId;
        this.description = description;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
}
