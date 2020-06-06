package com.zero;

import com.zero.config.AppConfig;
import com.zero.dao.TestDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
        TestDao dao = acac.getBean(TestDao.class);
        dao.query();
    }

}
