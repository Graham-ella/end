package com.example.endcase.pojo;

import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

@Node
public class Person {
    @Id
    @GeneratedValue
    private Long id;  // 自动生成的id 数据库里没有存储

    private String name;

    private Long born;

    public Person() {
        // Empty constructor required as of Neo4j API 2.0.5 需要一个空的构造器
    };

    public Person(String name, Long born) {
        this.name = name;
        this.born = born;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBorn() {
        return born;
    }

    public void setBorn(Long born) {
        this.born = born;
    }
}
