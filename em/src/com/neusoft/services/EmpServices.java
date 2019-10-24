package com.neusoft.services;

import java.util.*;
import java.sql.*;
import com.neusoft.system.db.DBUtils;
import com.neusoft.system.tools.Tools;

public class EmpServices {
	private Map<String, Object> dto = null;

	public EmpServices(Map<String, Object> dto) {
		this.dto = dto;

	}

	private String[] getArray(String key) {
		Object tem = this.dto.get(key);
		if (tem instanceof java.lang.String[]) {
			return (String[]) tem;
		} else {
			return new String[] { tem.toString() };
		}

	}

	public boolean batchDelete() throws Exception {
		PreparedStatement pstm = null;
		try {

			String sql = "delete from emp where eid=?";
			pstm = DBUtils.preparedStatement(sql);
			String idlist[] = this.getArray("idlist");
			for (String id : idlist) {
				pstm.setObject(1, id);
				pstm.addBatch();
			}
			boolean tag = false;
			DBUtils.beginTransation();
			try {
				pstm.executeBatch();
				DBUtils.commit();
				tag = true;
			} catch (Exception e) {
				DBUtils.rollback();
				e.printStackTrace();
			} finally {
				DBUtils.endTransaction();
			}
			return tag;
		} finally {
			DBUtils.close(pstm);
		}

	}

	public boolean modifyEmp() throws Exception {
		PreparedStatement pstm = null;
		try {

			StringBuilder sql = new StringBuilder().append("update emp")
					.append("   set ename=?,enumber=?,esex=?,esr=?,esal=?,ah=?,ememo=?,mz=?").append(" where eid=?");
			pstm = DBUtils.preparedStatement(sql.toString());

			pstm.setObject(1, this.dto.get("ename"));
			pstm.setObject(2, this.dto.get("enumber"));
			pstm.setObject(3, this.dto.get("esex"));
			pstm.setObject(4, this.dto.get("esr"));
			pstm.setObject(5, this.dto.get("esal"));
			pstm.setObject(6, Tools.joinArray(this.dto.get("ah")));
			pstm.setObject(7, this.dto.get("ememo"));
			pstm.setObject(8, this.dto.get("mz"));
			pstm.setObject(9, this.dto.get("eid"));
			return pstm.executeUpdate() > 0;
		} finally {
			DBUtils.close(pstm);
		}

	}

	public boolean deleteById() throws Exception {
		PreparedStatement pstm = null;
		try {
			String sql = "delete from emp where eid=?";
			pstm = DBUtils.preparedStatement(sql);
			pstm.setObject(1, this.dto.get("eid"));
			return pstm.executeUpdate() > 0;

		} finally {
			DBUtils.close(pstm);
		}

	}

	public boolean addEmp() throws Exception {
		PreparedStatement pstm = null;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("insert into emp(ename,enumber,esex,esr,esal,ah,ememo,mz)");
			sql.append("         values(?,?,?,?,?,?,?,?)");
			pstm = DBUtils.preparedStatement(sql.toString());
			pstm.setObject(1, this.dto.get("ename"));
			pstm.setObject(2, this.dto.get("enumber"));
			pstm.setObject(3, this.dto.get("esex"));
			pstm.setObject(4, this.dto.get("esr"));
			pstm.setObject(5, this.dto.get("esal"));
			pstm.setObject(6, Tools.joinArray(this.dto.get("ah")));
			pstm.setObject(7, this.dto.get("ememo"));
			pstm.setObject(8, this.dto.get("mz"));
			return pstm.executeUpdate() > 0;
		} finally {
			DBUtils.close(pstm);
		}
	}

	public Map<String, String> findById() throws Exception {
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			StringBuilder sql = new StringBuilder()
					.append("select  a.ename,a.enumber,a.esex,a.esr,a.esal,a.ah,a.mz,a.ememo").append("  from emp a")
					.append(" where a.eid=?");
			pstm = DBUtils.preparedStatement(sql.toString());
			pstm.setObject(1, this.dto.get("eid"));
			rs = pstm.executeQuery();
			Map<String, String> ins = null;
			if (rs.next()) {
				ResultSetMetaData rsmd = rs.getMetaData();
				int count = rsmd.getColumnCount();
				int initSize = ((int) (count / 0.75) + 1);
				ins = new HashMap<>(initSize);
				for (int i = 1; i <= count; i++) {
					ins.put(rsmd.getColumnLabel(i).toLowerCase(), rs.getString(i));

				}
			}
			return ins;
		} finally {
			DBUtils.close(rs);
			DBUtils.close(pstm);
		}
	}

	private boolean isNotNull(Object value) {
		return value != null && !value.equals("");
	}

	public List<Map<String, String>> queryAll() throws Exception// queryAll
	{
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			Object ename = this.dto.get("qename");
			Object enumber = this.dto.get("qenumber");
			Object besal = this.dto.get("besal");
			Object eesal = this.dto.get("eesal");
			Object esex = this.dto.get("qesex");
			Object mz = this.dto.get("qmz");

			StringBuilder sql = new StringBuilder()
					.append("select x.eid, x.ename,x.enumber,a.fvalue cnesex,x.esr,x.esal,b.fvalue cnmz")
					.append("  from emp x ,syscode a,syscode b").append(" where x.esex=a.`fcode`and a.`fname`='ESEX'")
					.append("   and x.mz=b.`fcode`and b.`fname`='MZ'");
			List<Object> paramList = new ArrayList<>();
			if (this.isNotNull(ename)) {
				sql.append(" and x.ename like ?");
				paramList.add("%" + ename + "%");
			}
			if (this.isNotNull(enumber)) {
				sql.append(" and x.enumber=?");
				paramList.add(enumber);
			}
			if (this.isNotNull(besal)) {
				sql.append(" and x.esal>=?");
				paramList.add(besal);
			}
			if (this.isNotNull(eesal)) {
				sql.append(" and x.esal<=?");
				paramList.add(eesal);
			}
			if (this.isNotNull(esex)) {
				sql.append(" and x.esex=?");
				paramList.add(esex);
			}
			if (this.isNotNull(mz)) {
				sql.append(" and x.mz=?");
				paramList.add(mz);
			}
			pstm = DBUtils.preparedStatement(sql.toString());
			int index = 1;
			for (Object param : paramList) {
				pstm.setObject(index++, param);
				
			}

			rs = pstm.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			List<Map<String, String>> rows = new ArrayList<>();
			Map<String, String> ins = null;
			while (rs.next()) {
				ins = new HashMap<>();
				for (int i = 1; i <= count; i++) {
					ins.put(rsmd.getColumnLabel(i), rs.getString(i));
				}
				rows.add(ins);
			}
			return rows;
		} finally {
			DBUtils.close(rs);
			DBUtils.close(pstm);

		}

	}

}
