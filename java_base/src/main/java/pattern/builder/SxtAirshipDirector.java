package pattern.builder;

public class SxtAirshipDirector implements AirShipDirector{
	private AirShipBuilder builder;
	public SxtAirshipDirector(AirShipBuilder builder){
		super();
		this.builder = builder;
	}
	
	@Override
	public AirShip directAirShip(){
		Engine e = builder.builderEngine();
		OrbitalModule o = builder.builderOrbitalModule();
		EscapeTower et = builder.builderEscapeTower();
		
		//װ��ɷɴ�����
		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setEscapeTower(et);
		ship.setOrbitalModule(o);
		
		return ship;
	}
	
}
