package com.me.ssmanno.dao;

import com.me.ssmanno.pojo.Person;
import com.me.ssmanno.pojo.PersonQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonDao {
    int countByExample(PersonQuery example);

    int deleteByExample(PersonQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    List<Person> selectByExample(PersonQuery example);

    Person selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonQuery example);

    int updateByExample(@Param("record") Person record, @Param("example") PersonQuery example);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}