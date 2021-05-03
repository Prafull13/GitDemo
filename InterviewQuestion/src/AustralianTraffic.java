
public class AustralianTraffic implements CentralTraffic ,ContinentTraffic {
	
	public static void main(String[] args) {
		
		CentralTraffic t = new AustralianTraffic();
		AustralianTraffic at = new AustralianTraffic();
		ContinentTraffic ct = new AustralianTraffic();
		t.greenGo();
		t.yellowFlash();
		t.redStop();
		at.walkOnHandSymbol();
		ct.trainSymbolTrafficRule();
		
		ct.turnRight();
		t.turnRight();
		
	}

	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green Go Implementation");
	}

	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Stop Implementation");
	}

	public void yellowFlash() {
		// TODO Auto-generated method stub
		System.out.println("Falsh Yellow Implementation");
	}

	public void walkOnHandSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Walk on Hand Symbol method Implementation");
	}

	public void trainSymbolTrafficRule() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Train Symbol method Implementation");
	}

	public void turnLeft() {
		// TODO Auto-generated method stub
		
	}

	public void turnRight() {
		// TODO Auto-generated method stub
		
	}

}
