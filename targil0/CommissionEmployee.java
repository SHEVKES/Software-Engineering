package targil0;

public class CommissionEmployee extends Employee {
float grossSales;//רווחים ממכירות
int commision;// עמלה באחוזים

public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commision) {//constractor
		super(firstName, lastName, id);
		this.grossSales = grossSales;
		this.commision = commision;
	}

public CommissionEmployee() {//default contractor
	super();
	this.grossSales = 0;
	this.commision = 0;
}


@Override
public double earnings() {
	return (commision/100) * grossSales;
}


//getters and setters
public float getGrossSales() {
	return grossSales;
}

public void setGrossSales(float grossSales) throws IllegalArgumentException {
	if(grossSales<0)
		throw new IllegalArgumentException("The value of grossSales is not valid");
	this.grossSales = grossSales;
}

public int getCommision() {
	return commision;
}

public void setCommision(int commision) throws IllegalArgumentException{
	if(commision<0)
		throw new IllegalArgumentException("The value of commision is not valid");
	this.commision = commision;
}

//hashCode and equals
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + commision;
	result = prime * result + Float.floatToIntBits(grossSales);
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
	CommissionEmployee other = (CommissionEmployee) obj;
	if (commision != other.commision)
		return false;
	if (Float.floatToIntBits(grossSales) != Float.floatToIntBits(other.grossSales))
		return false;
	return true;
}

@Override
public String toString() {
	return "CommissionEmployee [grossSales=" + grossSales + ", commision=" + commision + ", firstName=" + firstName
			+ ", lastName=" + lastName + ", id=" + id + "]";
}


}
