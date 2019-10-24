import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;

import javax.swing.JFrame;

public class PP20 {
private static int j=0;
private static boolean methodB(int k) {
	j+=k;
	return true;
}
public static void methodA(int i) {
boolean b;
b=i<10|methodB(4);
b=i<10||methodB(8);
}
public static void main(String args[]) {
int a=3;
int c=0;
if(a>0)
	if(a>3) c=2;
	else c=3;
else c=4;
System.out.println(c);
//ArrayList list=new  
//Array
}
}
