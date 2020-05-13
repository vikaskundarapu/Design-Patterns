package structural.adapter.example2.adaptee;

public class AfricanLion implements Lion {
	
	@Override
	public void roars() {
		System.out.println("AfricanLion roars!");
	}
	
}
