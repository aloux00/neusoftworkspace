package orz.doublexi.servlet.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import orz.doublexi.utils.jdbcUtils;


public class NoteService {
private Connection con;
private PreparedStatement prepareStatement;

public void insertNote(String noteleibie,String notename,String notecontent ){
	//insert into mynote (noteleibie,notemingcheng,notecontent,notedate) VALUES("hah","hhh","kkkk",NOW());
	try {
		con = jdbcUtils.getCon();
		prepareStatement = con.prepareStatement("insert into mynote (noteleibie,notemingcheng,notecontent,notedate) VALUES(?,?,?,NOW())");
		prepareStatement.setObject(1, noteleibie);
		prepareStatement.setObject(2, notename);
		prepareStatement.setObject(3, notecontent);
		
		prepareStatement.execute();
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
