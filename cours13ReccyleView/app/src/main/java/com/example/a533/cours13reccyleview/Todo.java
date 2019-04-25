package com.example.a533.cours13reccyleview;

import java.util.Date;

public class Todo {
    Date dateAdded;
    String title;
    String description;

    public Todo(Date dataAdded, String title, String description) {
        this.dateAdded = dataAdded;
        this.title = title;
        this.description = description;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDataAdded(Date dataAdded) {
        this.dateAdded = dataAdded;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
