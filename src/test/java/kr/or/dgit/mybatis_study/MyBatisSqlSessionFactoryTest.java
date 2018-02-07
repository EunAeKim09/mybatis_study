package kr.or.dgit.mybatis_study;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_study.util.MyBatisSqlSessionFactory;

public class MyBatisSqlSessionFactoryTest {
	private static SqlSessionFactory factory;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = MyBatisSqlSessionFactory.gerSqlSessionFactory();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		factory = null;
	}


	@Test
	public void test() {
		Assert.assertNotNull(factory);
	}

}
