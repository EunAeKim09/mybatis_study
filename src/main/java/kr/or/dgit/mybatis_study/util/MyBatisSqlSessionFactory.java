package kr.or.dgit.mybatis_study.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSqlSessionFactory {
	private static SqlSessionFactory sqlSesstionFactory;
	
	public static SqlSessionFactory gerSqlSessionFactory() {
		if(sqlSesstionFactory == null) {
			InputStream inputStream;
			try {
				inputStream = Resources.getResourceAsStream("mybatis-config.xml");
				sqlSesstionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			}catch(IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e.getCause());
			}
		}
		return sqlSesstionFactory;
	}
	
	public static SqlSession openSession() {
		return gerSqlSessionFactory().openSession();
	}
}
