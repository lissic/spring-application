package com.zero.dao;

import org.springframework.stereotype.Repository;

/**
 * Author: Zero <br>
 * Date: 2020-06-06
 * COMPANY: Zero有限公司
 * DESCRIPTION: The copyright belongs to Zero,if you have any problems,please contact him.
 */
@Repository
public class TestDao implements Dao {
    @Override
    public void query() {
        System.out.println("testDao");
    }
}
