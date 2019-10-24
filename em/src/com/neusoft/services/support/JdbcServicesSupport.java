package com.neusoft.services.support;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.neusoft.system.db.DBUtils;

public abstract class JdbcServicesSupport {
	private Map<String,Object> dto=null;
	public JdbcServicesSupport(Map<String,Object> dto){
		
		this.dto=dto;
	}
	
	protected Object getVal(final String key){
		return this.dto.get(key);
	}
	protected String[] getArray(String key){
		Object tem=this.dto.get(key);
		if(tem instanceof java.lang.String[]){
			return (String[])tem;
		}
		else{
			return new String[]{tem.toString()};
		}
	}
	
	protected boolean isNotNull(Object value){
		
		return value!=null&&!"".equals(value);
	}
	protected boolean batchTuiXiu(final String sql,final Object...args)throws Exception{
		
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
			pstm=DBUtils.preparedStatement(sql);
			pstm.setObject(1, "2");
			for(Object param:args){
				pstm.setObject(2, param);
				pstm.addBatch();
			}
			DBUtils.beginTransation();
			boolean tag=false;
			try{
				pstm.executeBatch();
				DBUtils.commit();
				tag=true;
			}catch(Exception e){
				DBUtils.rollback();
				e.printStackTrace();
			}
			return tag;
		} finally {
			DBUtils.close(pstm);
		}
		
	}
	protected boolean batchTuiXiu2(final String sql,final Object...args)throws Exception{
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
			pstm=DBUtils.preparedStatement(sql);
			pstm.setObject(1, "2");
			;
			pstm.setObject(2, this.getVal("money"));
			
			for(Object param:args){
				pstm.setObject(3, param);
				pstm.addBatch();
			}
			DBUtils.beginTransation();
			boolean tag=false;
			try{
				pstm.executeBatch();
				DBUtils.commit();
				tag=true;
			}catch(Exception e){
				DBUtils.rollback();
				e.printStackTrace();
			}
			return tag;
		} finally {
			DBUtils.endTransaction();
			DBUtils.close(pstm);
		}
		
	}
	protected List<Map<String,String>> queryForList(final String sql,final Object...args) throws Exception{
		
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try{
			
			pstm=DBUtils.preparedStatement(sql);
			int index=1;
			for(Object param:args){
				pstm.setObject(index++, param);
				
			}
			rs=pstm.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			int count =rsmd.getColumnCount();
			int initSize=((int)(count/0.75))+1;
			List<Map<String,String>> rows=new ArrayList<>();
			Map<String,String> ins=null;
			while(rs.next()){
				ins=new HashMap<String, String>(initSize);
				for(int i=1;i<=count;i++){
					ins.put(rsmd.getColumnLabel(i),rs.getString(i));
					
				}
				rows.add(ins);
			}
			return rows;
		}
		finally{
			DBUtils.close(rs);
			DBUtils.close(pstm);
		}
	}
	
	protected Map<String,String> queryForMap(final String sql,final Object...args)throws Exception{
		
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try{
			pstm=DBUtils.preparedStatement(sql);
			int index=1;
			for(Object param:args){
				pstm.setObject(index++,param);
			}
			rs=pstm.executeQuery();
			Map<String,String> ins=null;
			if(rs.next()){
				ResultSetMetaData rsmd=rs.getMetaData();
				int count=rsmd.getColumnCount();
				int initSize=((int)(count/0.75))+1;
				ins=new HashMap<>(initSize);
				for(int i=1;i<=count;i++){
					ins.put(rsmd.getColumnLabel(i), rs.getString(i));
				}
			}
			return ins;
			
		}finally{
			DBUtils.close(rs);
			DBUtils.close(pstm);
			
		}
	}
	
	protected boolean batchTransaction(final String sql,final Object...args)throws Exception{
		PreparedStatement  pstm=null;
		try{
			pstm=DBUtils.preparedStatement(sql);
		for(Object id:args){
			pstm.setObject(1, id);
			pstm.addBatch();
		}
		boolean tag=false;
		DBUtils.beginTransation();
		try{
			pstm.executeBatch();
			DBUtils.commit();
		}catch(Exception e){
			DBUtils.rollback();
			e.printStackTrace();
		}finally{
			DBUtils.endTransaction();
		}
		return tag;
		}
		finally{
			DBUtils.close(pstm);
		}
	}
	
	protected int executeUpdate(final String sql,final Object...args) throws Exception{
		PreparedStatement pstm=null;
		try{
			pstm=DBUtils.preparedStatement(sql);
			int index=1;
			for(Object param:args){
				pstm.setObject(index++, param);
				
			}
			return pstm.executeUpdate();
			
		}finally{
			DBUtils.close(pstm);
		}
		
	}
}
