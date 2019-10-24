package com.neusoft.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.neusoft.services.support.JdbcServicesSupport;
import com.neusoft.system.tools.Tools;

public class EmpServicesImpl extends JdbcServicesSupport {

	public EmpServicesImpl(Map<String, Object> dto) {
		super(dto);
		// TODO Auto-generated constructor stub
	}
public boolean tuixiu()throws Exception
{
	StringBuilder sql=new StringBuilder()
			.append("update emp")
			.append("  set state=?")
			.append(" where eid=?")
			;
	String idlist[]=this.getArray("idlist");
	return this.batchTuiXiu(sql.toString(),idlist);//**************************************************
	
}
public boolean tuixiu2()throws Exception
{
	StringBuilder sql=new StringBuilder()
			.append("update emp")
			.append("  set state=?, esal=esal+?")
			.append(" where eid=?")
			;
//	Object stateList[]={"2",this.getVal("money")};
	String idlist[]=this.getArray("idlist");
	return this.batchTuiXiu2(sql.toString(),idlist);//**************************************************
	
}
	public boolean batchDelete() throws Exception {
		String sql = "delete from emp where eid=?";
		String idlist[] = this.getArray("idlist");
		return this.batchTransaction(sql, idlist);
	}

	public List<Map<String, String>> queryAll() throws Exception {
		Object ename = this.getVal("qename");
		Object enumber = this.getVal("qenumber");
		Object besal = this.getVal("besal");
		Object eesal = this.getVal("eesal");
		Object esex = this.getVal("qesex");
		Object mz = this.getVal("qmz");
		StringBuilder sql = new StringBuilder()
				.append("select x.eid,x.ename,x.enumber,a.fvalue cnesex,x.esr,x.esal,b.fvalue cnmz")
				.append("  from syscode a,syscode b,emp x")
				.append(" where a.fcode=x.esex and a.fname='ESEX'")
				.append("  and b.fcode=x.mz and b.fname='MZ'")
				.append("  and  state=1")
				;
		;
		List<Object> paramList = new ArrayList<>();

		if (this.isNotNull(ename)) {
			sql.append(" and x.ename like ?");
			paramList.add("%"+ename+"%");
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
		return this.queryForList(sql.toString(), paramList.toArray());
	}
public Map<String,String> findById() throws Exception{
	StringBuilder sql=new StringBuilder()
			.append("select a.ename,a.enumber,a.esex,a.esr,a.esal,a.ah,a.mz,a.ememo")
			.append("  from emp a")
			.append(" where a.eid=?")
			;
	return this.queryForMap(sql.toString(), this.getVal("eid"));
}

public boolean deleteById() throws Exception{
	String sql="delete from emp where eid=?";
	return this.executeUpdate(sql, this.getVal("eid"))>0;
}

public boolean modifyEmp() throws Exception{
	StringBuilder sql=new StringBuilder()
			.append("update emp")
			.append("  set ename=?,enumber=?,esex=?,esr=?,esal=?,ah=?,ememo=?,mz=?")
			.append(" where eid=?")
			;
	Object args[]={
			this.getVal("ename"),
			this.getVal("enumber"),
			this.getVal("esex"),
			this.getVal("eesr"),
			this.getVal("esal"),
			Tools.joinArray(this.getVal("ah")),
			this.getVal("ememo"),
			this.getVal("mz"),
			this.getVal("eid")
	};
	return this.executeUpdate(sql.toString(), args)>0;
}

public boolean addEmp() throws Exception{
	StringBuilder sql=new StringBuilder()
			.append("insert into emp (ename,enumber,esex,esr,esal,ah,ememo,mz,state)")
			.append("          values(?,?,?,?,?,?,?,?,?)")
			;
	Object args[]={
			this.getVal("ename"),
			this.getVal("enumber"),
			this.getVal("esex"),
			this.getVal("esr"),
			this.getVal("esal"),
		    Tools.joinArray(this.getVal("ah")),
			this.getVal("ememo"),
			this.getVal("mz"),
			"1"
	};
	return this.executeUpdate(sql.toString(), args)>0;
	
}
}
