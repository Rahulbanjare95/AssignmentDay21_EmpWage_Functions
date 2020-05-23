public class EmpWage{


	public static void main(String args[] ){
	System.out.println("Welcome");

	int IS_FULL_TIME=1;
	int EMP_RATE_PER_HR=20;
	int	is_Present=1;
	int	empHrs=0;
	int attendence=(int) Math.floor(Math.random()*10%2+1);


	if(attendence ==is_Present){
	System.out.println("Present");
	}
	else{
	System.out.println("Absent");
	}

	  if(attendence==IS_FULL_TIME)
        {
        empHrs=8;
        }
		int empWage=(empHrs*EMP_RATE_PER_HR);
		System.out.println("EmpWage "+empWage);





	}
}
