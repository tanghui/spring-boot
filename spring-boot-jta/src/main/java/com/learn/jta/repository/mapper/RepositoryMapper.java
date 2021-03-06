package com.learn.jta.repository.mapper;

import com.learn.jta.repository.model.Repository;
import com.learn.jta.repository.model.RepositoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepositoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbg.generated Tue Jun 11 23:50:30 CST 2019
     */
    long countByExample(RepositoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbg.generated Tue Jun 11 23:50:30 CST 2019
     */
    int deleteByExample(RepositoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbg.generated Tue Jun 11 23:50:30 CST 2019
     */
    int insert(Repository record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbg.generated Tue Jun 11 23:50:30 CST 2019
     */
    int insertSelective(Repository record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbg.generated Tue Jun 11 23:50:30 CST 2019
     */
    List<Repository> selectByExample(RepositoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbg.generated Tue Jun 11 23:50:30 CST 2019
     */
    int updateByExampleSelective(@Param("record") Repository record, @Param("example") RepositoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repository
     *
     * @mbg.generated Tue Jun 11 23:50:30 CST 2019
     */
    int updateByExample(@Param("record") Repository record, @Param("example") RepositoryExample example);
}