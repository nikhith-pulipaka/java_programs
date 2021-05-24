package Javapractice_problems;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Employeee implements Serializable{
	int empno;
	String empname,email;
	public Employeee(int empno, String empname, String email) {

	this.empno = empno;
	this.empname = empname;
	this.email = email;
	}
	@Override
	public String toString() {
	return "Employeee [empno=" + empno + ", empname=" + empname + ", email=" + email + "]";
	}

	}
	