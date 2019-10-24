import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import orz.doublexi.mvcbyxml.dao.ShuqianDao;
import orz.doublexi.mvcbyxml.projo.ShuQian;

public class MybatisClient {
public static void main(String[] args) {
	try {
		InputStream stream = Resources.getResourceAsStream("mybatisConfig.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
		SqlSession session = build.openSession();
		ShuqianDao dao = session.getMapper(ShuqianDao.class);
		ShuQian shuQian = new ShuQian();
		shuQian.setFenlei(1);
		shuQian.setMingcheng("测试的书签");
		shuQian.setWebaddress("www");
		System.out.println(dao.getClass());
		
		dao.insertShuQian(shuQian);
		session.close();
		System.out.println("结束");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void Test01() {
	try {
		InputStream stream = Resources.getResourceAsStream("mybatisConfig.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
		SqlSession session = build.openSession();
		ShuqianDao dao = session.getMapper(ShuqianDao.class);
		ShuQian shuQian = new ShuQian();
		shuQian.setFenlei(1);
		shuQian.setMingcheng("测试的书签");
		shuQian.setWebaddress("www");
		dao.insertShuQian(shuQian);
		session.commit();
		session.close();
		System.out.println("结束");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
}
public void Test02() {
	
}
}
