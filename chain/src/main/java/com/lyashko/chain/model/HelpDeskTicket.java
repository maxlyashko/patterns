package com.lyashko.chain.model;

public class HelpDeskTicket {
    private String name;
    private String issueDescription;
    private int priority;

    public HelpDeskTicket(String name, String issueDescription, int priority) {
        this.name = name;
        this.issueDescription = issueDescription;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public int getPriority() {
        return priority;
    }
}
