package targil0;

public abstract class Employee { 
	String firstName;
	String lastName;
	int id;
	public Employee(String firstName, String lastName, int id) //const
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	public Employee() //default const
	{
		this.firstName = "plony";
		this.lastName = "almony";
		this.id = 0;
	}
	//setters and getters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId1(int id) {
		this.id = id;
	}
	public void setId(int id) throws IllegalArgumentException {
		if(id<0)
			throw new IllegalArgumentException("The value of id is not valid");
		this.id = id;
	}

	//toString
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
	}

	//equals and hash code
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	//return the salary of the worker
	public abstract double earnings();
	
	

}

