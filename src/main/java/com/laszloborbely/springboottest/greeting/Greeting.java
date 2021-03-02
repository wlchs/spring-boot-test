package com.laszloborbely.springboottest.greeting;

public class Greeting {
    /*
     * Constant fields
     */
    private final long id;
    private final String content;

    /**
     * @param id      Unique ID
     * @param content Name of the person to greet
     */
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    /**
     * @return Unique ID
     */
    public long getId() {
        return id;
    }

    /**
     * @return Name of the person to greet
     */
    public String getContent() {
        return content;
    }
}
