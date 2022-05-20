import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		CarInsurance company1 = new CarInsurance();
		
		short carChoice = 0, insuranceChoice = 0;
		char choice = 'n';
		CarInsurance.carType carType = null;
		CarInsurance.insuranceType insuranceType= null;
		
		try {
			do {
				// code for chooosing car type 
				do {
					try {
						Scanner sc = new Scanner(System.in);
						System.out.println("Choose the Car Model \n1.Hatchback \n2.Sedan \n3.SUV \nPlease Enter your choice");
						carChoice = sc.nextShort();
						if(carChoice == 1) {
							carType = CarInsurance.carType.Hatchback;
						}
						else if(carChoice == 2) {
							carType = CarInsurance.carType.Sedan;
						}
						else if(carChoice == 3) {
							carType = CarInsurance.carType.SUV;
						}
						else {
							System.out.println("Invalid Input\n");
						}
					}catch(Exception e) {
						carChoice = 0;
						System.out.println("Invalid Input\n");
					}
				}
				while(carChoice > 3 || carChoice < 1);
				
				// code for entering car cost
				System.out.println("Enter the Price of the " + carType);
				company1.setCarCost(s.nextDouble());
				
				// code for choosing insurance type
				do {
					try {
						Scanner sc = new Scanner(System.in);
						System.out.println("Choose the insurance type of " + carType + " \n1.Basic \n2.Premium \nPlease Enter your choice");
						insuranceChoice = sc.nextShort();
						if(insuranceChoice == 1) {
							insuranceType =  CarInsurance.insuranceType.Basic;
						}
						else if(insuranceChoice == 2) {
							insuranceType =  CarInsurance.insuranceType.Premium;
						}
						else {
							System.out.println("invalid input \n");
						}
					}catch(Exception e) {
						insuranceChoice = 0;
						System.out.println("invalid input \n");
					}
				}
				while(insuranceChoice != 2 && insuranceChoice != 1);
				
				company1.getCarInsurancePrice(carType, company1.getCarCost(),insuranceType);
				
				System.out.println("Want to add another car press y for YES and n for NO ?");
				choice = s.next().charAt(0);
				
				if(choice != 'y' && choice != 'n') {
					System.out.println("Invalid Input");
				}else if(choice == 'n'){
					System.out.println("Thankk You !!!!!!!!!!!!!!!!!!!");
				}
			}
			while(choice == 'y');
		}catch(Exception e) {
			System.out.println("OOPS!!! Invalid Input ");
		}
	}

}
