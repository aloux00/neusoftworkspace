package orz.doublexi.utils;

import jdk.internal.util.xml.impl.Input;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Blob;

public class FiletoBinary {

         public static byte[] fileToBytes(String s) throws Exception {

                 FileInputStream in = new FileInputStream(s);
             ByteArrayOutputStream out=new ByteArrayOutputStream();
                 byte[] a=new byte[4096];
                 int i=-1;
                 while((i=in.read(a))!=-1){

                     out.write(a,0,i);
                 }
                 return out.toByteArray();

         }
         public static FileInputStream fileToInputStream(String s) throws FileNotFoundException {
             return new FileInputStream(s);
         }
}
