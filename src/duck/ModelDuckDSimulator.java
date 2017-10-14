package duck;

import FlyDuck.FlyRocketPowered;

public class ModelDuckDSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
	
	
		Duck model = new ModelDuck();
		model.performFly();
		
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
	}
	
	
}
