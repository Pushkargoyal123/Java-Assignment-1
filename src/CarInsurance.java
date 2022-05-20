
public class CarInsurance {
	public enum carType{
		Hatchback, Sedan, SUV
	}
	public enum insuranceType{
		Basic, Premium
	}
	private double carCost;
	
	public void setCarCost(double carCost) {
		this.carCost = carCost;
	}
	
	public double getCarCost(){
		return this.carCost;
	}
	public void getCarInsurancePrice(carType enumCarType, double carCost, insuranceType enumInsuranceType){
		double premiumPrice = 0;
		
		if(enumCarType == CarInsurance.carType.Hatchback) {
			premiumPrice = carCost * 5 / 100;
		}
				
		else if(enumCarType == CarInsurance.carType.Sedan) {	
			premiumPrice = carCost * 8 / 100;	
		}
		
		else {
			premiumPrice = carCost * 10 / 100;
		}
		if(enumInsuranceType == CarInsurance.insuranceType.Premium) {
			premiumPrice = premiumPrice + premiumPrice * 20 / 100;
		}
		System.out.println("\nCar Model  ---   " + enumCarType + "\nCar Price  ---   " + carCost + "\nTotal Insurance amount to be paid   ---   " + premiumPrice + "\n");
	}
}
