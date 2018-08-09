package com.example.demo;

import com.example.demo.mapper.TestMapper;
import com.example.demo.util.MapperUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Objects;


@Service
public class HalloServer {
//    @Autowired
//    private TestMapper testMapper;

//    public String hallo2(String word) {
//        TestData testData = testMapper.findTestDataByFirstField("test2");
//        return "hallo " + word + "   " + testData.getSecondField();
//    }

    public String hallo(String word) {
        try (SqlSession sqlSession = MapperUtils.getSession()) {
            TestMapper testMapper = MapperUtils.getMapper(sqlSession, TestMapper.class);
            TestData td = testMapper.findTestDataByFirstField("test2");
            sqlSession.close();
            return "hallo " + word + " |  " + td.getFirstField() + "   " + td.getSecondField();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

}
