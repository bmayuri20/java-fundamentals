package has_a_withCtor;

public class CarEngineTest{
	public static void main(String[] args){
		Engine eng = new Engine("Diesel",26);
		
		Car car = new Car(eng);
	
	
		System.out.println(car.engine.engineType);
		System.out.println(car.engine.horsePower);
		
	}
}