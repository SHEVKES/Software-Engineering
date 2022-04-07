package targil0;

public class Payroll {
	public static void main(String[] args)  {
		try
		{
		   Employee[] arr = new Employee[3];
		   arr[0]=new HourlyEmployee("Ayala", "Cohen", 212224638, 30, 100);
		   arr[1]=new CommissionEmployee("Shira", "Shevkes", 212433841, 3000, 40);
		   arr[2]=new BasePlusCommissionEmployee("Tamar", "Israeli", 328495, 5000, 20, 1000);
		   
		  for (Employee employee : arr)
		  {
			if(employee.getClass()==BasePlusCommissionEmployee.class)
			{
				float oldSalary=((BasePlusCommissionEmployee) employee).getBaseSalary();
				((BasePlusCommissionEmployee)employee).setBaseSalary((float)(oldSalary*1.1));
			}
			System.out.println(employee + " earings: "+ employee.earnings());
		  }
		}
		catch(IllegalArgumentException ex) { System.out.println("ERROR");}
			
		  }
			
		}

