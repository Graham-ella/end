package com.example.endcase.pojo;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Movie {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String tagline;

    private Long released;

    public Movie(){

    }

    public Movie(String title, String tagline, Long released) {
        this.title = title;
        this.tagline = tagline;
        this.released = released;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public Long getReleased() {
        return released;
    }

    public void setReleased(Long released) {
        this.released = released;
    }
}
