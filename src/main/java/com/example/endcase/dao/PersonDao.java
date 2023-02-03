package com.example.endcase.dao;

import com.example.endcase.pojo.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PersonDao extends Neo4jRepository<Person, Long> {  // 第一个是类 第二个是类的主键
    Person findByName(String name); // 其实这里操作数据库已经实现了 findByName
}
