package orz.doublexi.Frame;

import orz.doublexi.service.FileStoreService;
import orz.doublexi.utils.FiletoBinary;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.util.Map;

public class MyMainFrame extends JFrame implements ActionListener {
    Container contentPane=null;
    String labelStr="路径！看这里";
    IndexFrame idf=null;
    JButton insert =new JButton("导入文件");
    JButton showFile=new JButton("显示数据库文件");
    JLabel showPath=new JLabel(labelStr);
    FileStoreService fs=new FileStoreService();

    public MyMainFrame(){
       initView();
    }
    private void initView(){
         this.setBounds(500,200,500,300);
        contentPane =this.getContentPane();
        contentPane.setLayout(new FlowLayout());
        fullContain();
        initListener();
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private void fullContain(){

         insert.setSize(50,20);
         showFile.setSize(50,20);
         contentPane.add(showFile);
         contentPane.add(insert);
         contentPane.add(showPath);

    }
    private void initListener(){

        insert.addActionListener(this);
        showFile.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == insert){
            JFileChooser chooser = new JFileChooser();
            chooser.setMultiSelectionEnabled(false);
           int t=chooser.showOpenDialog(insert);
            System.out.println(t);
           if(t==0){
               labelStr=chooser.getSelectedFile().getAbsolutePath();
               showPath.setText(labelStr);
               int i = JOptionPane.showConfirmDialog(this, "确认添加这个文件到数据库？");
System.out.println(i);
               if(i==0){
                   try {
                       FileInputStream in=FiletoBinary.fileToInputStream(labelStr);
                       String name=chooser.getSelectedFile().getName();
//                       String[] ss = s.split("\\.");
                       
                   
                       fs.insertFile(name,in);
                       JOptionPane.showMessageDialog(null,"成功了....也许吧【心虚.jpg】");
                       return;
                   } catch (Exception e1) {
                       e1.printStackTrace();
                   }
               }
           }
           JOptionPane.showMessageDialog(null,"失败咯");

        }else if(e.getSource() == showFile){
           
                idf=new IndexFrame();
                idf.setLayout(new FlowLayout());
                idf.setBounds(500,500,500,500);
            
            Container cc=idf.getContentPane();
            Map<String,String> index=fs.queryFile();
            idf.setSource(index);
            for(Map.Entry<String,String> mm:index.entrySet()){
JLabel l1=new JLabel(mm.getValue());
JLabel l2=new JLabel(mm.getKey()+"#");
l1.addMouseListener(idf);
                cc.add(l1);
                cc.add(l2);
                
            }

            idf.setVisible(true);

        }
    }
}
