package testproject;

public class Person {
private int pid;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
private String fname;
private String lname;
public Person(int pid, String fname, String lname) {
	super();
	this.pid = pid;
	this.fname = fname;
	this.lname = lname;
}
@Override
public String toString() {
	return "Person [pid=" + pid + ", fname=" + fname + ", lname=" + lname + "]";
}

}
