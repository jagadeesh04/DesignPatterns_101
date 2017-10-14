package duck;

import behavior.FlyBehavior;
import behavior.QuackBehavior;

public abstract class Duck{

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public  void swim(){
		System.out.println("all ducks swim");
	}
	
	public abstract void display();
	
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
}
