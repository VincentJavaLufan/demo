package pattern.builder;
/**
 * StringBuilder DomBuilder,SaxBuilder �ȵ���Щ���ǽ�����ģʽ��
 * @author Administrator
 *
 */
public class SxtAirShipBuilder implements AirShipBuilder{
	@Override
	public Engine builderEngine(){
		System.out.println("������ѧ�÷�����");
		return new Engine("��ѧ�÷�����");
	}
	
	@Override
	public EscapeTower builderEscapeTower(){
		System.out.println("������ѧ��������");
		return new EscapeTower("��ѧ��������");
	}
	@Override
	public OrbitalModule builderOrbitalModule(){
		System.out.println("������ѧ�ù����");
		return new OrbitalModule("��ѧ�ù����");
	}
}
