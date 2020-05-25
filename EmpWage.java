public class EmpWage{

	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HR=20;
	public static final int NUM_WORKING_DAYS=20;

	public static final int MAX_WORKING_DAYS=100;
   public static final int  MAX_HRS_IN_MONTH=10;


//......... New-Branch UC 7---------------------

	public void empWageCalculator(int empHrs,int EMP_RATE_PER_HR){
				empHrs=0;

	 			int totalWorkingDays=0;
        		int totalWorkingHrs=0;
				int totalEmpWage=0;

        while(totalWorkingDays<=MAX_WORKING_DAYS &&
                totalWorkingHrs<MAX_HRS_IN_MONTH)
			{


        totalWorkingDays++;
        int empCheck= (int) (Math.floor(Math.random()*10)%2+1);

                switch (empCheck)
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

        		totalWorkingHrs+=empHrs;
     			int empWage = (empHrs*EMP_RATE_PER_HR);
       		totalEmpWage+=empWage;
        }
      System.out.println("Total Wage till 100 hrs and 20 Working days ="+ totalEmpWage);

		}




	public static void main(String args[] ){



		EmpWage e = new EmpWage();


			e.empWageCalculator(10,EMP_RATE_PER_HR);




	}
}
