class EmpolyeeSalary1 {
	public static void main(String args[]) {
		int salary = 50000 ;
		int tax;
		int netsalary;
		
		 if (salary>=100000) {
			tax=salary*3/100;
		 }else {
			tax=salary*1/100;
		 }
		 
		 netsalary=salary-tax;
		 
	    System.out.println("Salary: " + salary);
         System.out.println("Tax: " + tax);
        System.out.println("Net Salary: "+ netsalary);
	}
}	