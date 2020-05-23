public class EmpWage{


	public static void main(String args[] ){
	System.out.println("Welcome");

	int	is_Present=1;
	int attendence=(int) Math.floor(Math.random()*10%2+1);


	if(attendence ==is_Present){
	System.out.println("Present");
	}
	else{
	System.out.println("Absent");
	}

	}
}
