package workhomework;

public class NoteComputer {
private char color;
private int cpu;
public NoteComputer() {
	
}
public NoteComputer(char color,int cpu) {
	this.color=color;
	this.cpu=cpu;
}
public void  getMessage() {
	System.out.println(color);
	System.out.println(cpu);
}
}
