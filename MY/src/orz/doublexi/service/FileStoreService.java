package orz.doublexi.service;

import jdk.internal.util.xml.impl.Input;
import orz.doublexi.utils.DbUtils;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class FileStoreService {
    public boolean  insertFile(String name,FileInputStream data){
        Connection con = DbUtils.getCon();
        try {
            PreparedStatement statement = con.prepareStatement("insert into binaryfile(p_name,p_data) values (?,?)");//

            statement.setObject(1,name);
      statement.setBlob(2,data);

            boolean isture=statement.execute();
            DbUtils.close(con);
            return isture;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public Map<String,String> queryFile(){
        Map map=new HashMap<String,String>();
        Connection con = DbUtils.getCon();
        try {
            PreparedStatement statement = con.prepareStatement("select p_id,p_name from binaryfile");//
            ResultSet set = statement.executeQuery();
            while(set.next()){
                String i1=null;
                String i2=null;
                i1=new String(set.getBytes(1),"utf8");
                i2=new String(set.getBytes(2),"utf8");
                map.put(i1,i2);
            }

            DbUtils.close(con);

            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public byte[] queryData(String name){
    
    	InputStream in=null;
    	byte[] out=null;
         Connection con = DbUtils.getCon();
         try {
             PreparedStatement statement = con.prepareStatement("select  p_data from binaryfile where p_name=?");
             statement.setObject(1, name);
             ResultSet set = statement.executeQuery();
             while(set.next()){
                 Blob data = set.getBlob(1);
                 in = data.getBinaryStream();
               
                out=new byte[in.available()];
                 in.read(out);              
             }

             DbUtils.close(con);

             return out;
         } catch (Exception e) {
             System.out.println("获取data字节数据失败");
         }
         return null;
    }
}
