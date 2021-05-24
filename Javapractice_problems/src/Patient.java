package Assignment3;

public class Patient {
	
		 String name;
		 double weight,height;
		 Patient(double w,double h)
		 {
			 weight=w;
			 height=h;
			 } 
		 double BMI()
		 { 
			 return (weight/(height*height))*703;
			 }
		 }
	

