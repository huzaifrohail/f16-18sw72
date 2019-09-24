class Myfirstjavaprogram{
	public static void main(String args[])
	{
		String name;
		name="huzaif";
		short totalmarks=100;
		int marksobtain=90;
		char grade='A';
		double per=(marksobtain*100)/totalmarks;
		boolean t=true;
		boolean f=false;
		if((per>50)==true)
		{
			System.out.println("status:pass");

		}
		else
		{
			System.out.println("status:notpass");

		}

System.out.println("name:"+name);
System.out.println("totalmarks:"+totalmarks);
System.out.println("obtainedmarks:"+marksobtain);
System.out.println("grade:"+grade);
System.out.println("percentage:"+per);
	}
}