package com.laszloborbely.springboottest;

public class Greeting {
    /**
     * Constant fields
     */
    private final long id;
    private final String content;

    /**
     * Greeting constructor
     *
     * @param id      Unique ID
     * @param content Name of the person to greet
     */
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    /**
     * Getter function for ID
     *
     * @return Unique ID
     */
    public long getId() {
        return id;
    }

    /**
     * Getter function for content
     *
     * @return Name of the person to greet
     */
    public String getContent() {
        return content;
    }
}
