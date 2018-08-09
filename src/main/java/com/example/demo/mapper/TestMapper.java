package com.example.demo.mapper;

import com.example.demo.TestData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestMapper {
    /**
     * 根据ID查找用户
     *
     * @param firstField
     * @return
     */
//    @Select("select * from user where name = #{name} and pwd = #{pwd}")
//    @Select("select * from test where firstField = #{firstField}")
//    TestData findTestDataByFirstField2(@Param("firstField") String firstField);
//
    TestData findTestDataByFirstField(String firstField);


//    @Select("select * from user")
//    @Results({ @Result(id = true, column = "id", property = "id"),
//            @Result(column = "username", property = "user_name"),
//            @Result(column = "city", property = "city") })
//    public List<User> selectAll() throws Exception;


    //-------------------- 复用 -----------------------

//<mapper namespace="twm.mybatisdemo.mapper.UserMapper">
//    <!-- 自定义返回结果集 -->
//    <resultMap id="userMap" type="twm.mybatisdemo.pojo.User">
//        <id column="id" property="id" jdbcType="INTEGER" />
//        <result property="user_name" column="username"></result>
//        <result property="city" column="city"></result>
//    </resultMap>
//</mapper>


//    @Select("select * from user where id=#{id}")
//    @ResultMap("twm.mybatisdemo.mapper.UserMapper.userMap")
//    public User selectById(int id) throws Exception;
//
//    @Select("select * from user")
//    @ResultMap("twm.mybatisdemo.mapper.UserMapper.userMap")
//    public List<User> selectAll() throws Exception;
}
