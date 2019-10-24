package dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

public class HouseInfoDao {

	Connection conn = null;
	QueryRunner query = null;

	public int addHouseInfo(St s) throws SQLException {

		String sql = "insert into emp(empno,ename,job,mgr,hiredate,sal,comm,deptno)" + " values(?,?,?,?,?,?,?,?)";
		conn = DBUtil.openConnection();
		query = new QueryRunner();
		int count = query.update(conn, sql, new Object[] { s.getEmpno(), s.getEname(), s.getJob(), s.getMgr(),
				 s.getHiredate(),s.getSal(), s.getComm(), s.getDeptno() });
		return count;
	}

	

}
