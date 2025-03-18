package abstractionLearn;

import encapsulationLearn.SetterGetter;

public class EncapsuleClass {

	public static void main(String[] args) {
		SetterGetter o=new SetterGetter();
		
		o.setter(100);
		
		System.out.println(o.getter());

	}

}
