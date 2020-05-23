public class EmpWage{

	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HR=20;


	public static void main(String args[] ){
	System.out.println("Welcome");

	int	is_Present=1;
	int	empHrs=0;

//-------------New Branch UC1------------
	int attendence=(int) Math.floor(Math.random()*10)%3;

	if(attendence ==is_Present){
	System.out.println("Present");
	}
	else if(attendence ==2){
	System.out.println("Part-Time");
	}
	else { System.out.println("Absent");}

//------------New Branch UC2--------------
	  if(attendence==IS_FULL_TIME)
        {
        empHrs=8;
        }
		int empWage=(empHrs*EMP_RATE_PER_HR);
		System.out.println("EmpWage Full-Time "+empWage);
//-----------New Branch UC 3-------
		if(attendence==IS_FULL_TIME)
                empHrs=8;
        else if(attendence==IS_PART_TIME)
                empHrs=4;

        empWage = (empHrs*EMP_RATE_PER_HR);
        System.out.println("Emp Wage daily "+ empWage);

//--------------New Branch uC 4-------------
		
                switch (attendence)
        {
                case IS_FULL_TIME:
                        empHrs=8;
                        break;
                case IS_PART_TIME:
                        empHrs=4;
                        break;
                default:
                        empHrs=0;
                                break;
        }
		empWage = (empHrs*EMP_RATE_PER_HR);
        System.out.println("Emp Wage Using Case  "+ empWage);







	}
}
