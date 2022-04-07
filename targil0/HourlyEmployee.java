package targil0;

public class HourlyEmployee extends Employee {

int hours;//the number of hours that we worked in a week
float wage;//лсу for an hour


public HourlyEmployee(String firstName, String lastName, int id, int hours, float wage) {//constructor
	super(firstName, lastName, id);
	this.hours = hours;
	this.wage = wage;
}

public HourlyEmployee() { //default constructor
	super();
	this.hours = 0;
	this.wage = 0;
}

@Override
public double earnings() {
	return hours*wage;
}


//getters and setters
public int getHours() {
	return hours;
}

public void setHours(int hours) throws IllegalArgumentException {
	if(hours<0)
		throw new IllegalArgumentException("The value of hours is not valid");
	this.hours = hours;
}

public float getWage() {
	return wage;
}

public void setWage(float wage) throws IllegalArgumentException {
	if(wage<0)
		throw new IllegalArgumentException("The value of wege is not valid");
	this.wage = wage;
}

//hashCode and equals
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + hours;
	result = prime * result + Float.floatToIntBits(wage);
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	HourlyEmployee other = (HourlyEmployee) obj;
	if (hours != other.hours)
		return false;
	if (Float.floatToIntBits(wage) != Float.floatToIntBits(other.wage))
		return false;
	return true;
}

//TO STRING
@Override
public String toString() {
	return "HourlyEmployee [hours=" + hours + ", wage=" + wage + ", firstName=" + firstName + ", lastName=" + lastName
			+ ", id=" + id + "]";
}







}
