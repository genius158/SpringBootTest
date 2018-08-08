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
    @Autowired
    private TestMapper testMapper;

    public String hallo(String word) {
//        try (SqlSession sqlSession = MapperUtils.getSession()) {
//            TestMapper testMapper = MapperUtils.getMapper(sqlSession, TestMapper.class);
//            TestData td = testMapper.findTestDataByFirstField("test2");
//            sqlSession.close();
//            return "hallo " + word + " |  " + td.getFirstField() + "   " + td.getSecondField();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return "";

        TestData testData = testMapper.findTestDataByFirstField2("test2");
        return "hallo " + word + "   " + testData.getFirstField();

//        {
//            String resource = "mybatis-config.xml";
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            try (SqlSession openSession = sqlSessionFactory.openSession()) {
//                TestData user = openSession.selectOne(
//                        "com.example.demo.TestMapper.findTestDataByFirstField", "test2");
//                System.out.println(user);
//                return "hallo " + word + " |  " + user.getFirstField() + "   " + user.getSecondField();
//            }
//        }
    }

}
