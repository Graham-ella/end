package com.example.endcase.pojo;

public class CustomNode {
    private String id;
    private int group;

    public CustomNode(String id, int group) {
        this.id = id;
        this.group = group;
    }

    public String getId() {
        return id;
    }

    public void setPid(String id) {
        this.id = id;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}
