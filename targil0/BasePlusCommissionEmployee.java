package targil0;

public class BasePlusCommissionEmployee extends CommissionEmployee {

float baseSalary;
	
//constractor
public BasePlusCommissionEmployee(String firstName, String lastName, int id, float grossSales, int commision,
			float baseSalary) {
		super(firstName, lastName, id, grossSales, commision);
		this.baseSalary = baseSalary;
	}

//defalt constractor
public BasePlusCommissionEmployee() {
	super();
	this.baseSalary = 0;
}

//getters and setters
public float getBaseSalary() {
	return baseSalary;
}

public void setBaseSalary(float baseSalary) throws IllegalArgumentException {
	if(baseSalary<0)
		throw new IllegalArgumentException("The value of baseSalary is not valid");
	this.baseSalary = baseSalary;
}


//hashcode and equals
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Float.floatToIntBits(baseSalary);
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
	BasePlusCommissionEmployee other = (BasePlusCommissionEmployee) obj;
	if (Float.floatToIntBits(baseSalary) != Float.floatToIntBits(other.baseSalary))
		return false;
	return true;
}

@Override
public double earnings() {
return super.earnings()+baseSalary;
}

//TO STRING
@Override
public String toString() {
	return "BasePlusCommissionEmployee [baseSalary=" + baseSalary + ", grossSales=" + grossSales + ", commision="
			+ commision + ", firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
}

}
