package partice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employeee e=new Employeee(180040089,"PULIPAKA NIKHITH","180040089ece@gmail.com");
		FileOutputStream fo=new FileOutputStream("a.txt");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		oo.writeObject(e);
		FileInputStream fi=new FileInputStream("a.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		Employeee e1=(Employeee) oi.readObject();
		System.out.println(e1);

		// oo.writeObject(e);
		oo.close();
		fo.close();

		}
}
