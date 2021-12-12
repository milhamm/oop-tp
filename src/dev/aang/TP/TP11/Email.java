package dev.aang.TP.TP11;

import java.io.Serializable;
import java.time.LocalDate;

public class Email implements Serializable {

    private int id;
    private String sender;
    private String subject;
    private String content;
    private LocalDate date;
    private boolean starred;

    public Email(int id, String sender, String subject, String content, LocalDate date, boolean starred) {
        setId(id);
        setSender(sender);
        setSubject(subject);
        setContent(content);
        setDate(date);
        setStarred(starred);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public void display () {
        System.out.println("____________");
        System.out.printf("%s\t\t%s\n", getSender(), getDate());
        System.out.printf("%s\n", getSubject());
        System.out.printf("%s\t\t%s\n", getContent(), isStarred() ? "*" : "x");
    }
}
