package com.shah.FirstSpring.model;

public class Hello {
    private String from;
    private String to;
    private String text;

    public Hello(String from, String to, String text) {
        this.from = from;
        this.to = to;
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
