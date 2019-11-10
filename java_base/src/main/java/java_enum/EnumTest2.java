package java_enum;
/**
 * 给 enum 自定义属性和方法
 */
public enum EnumTest2 {
	MON(11),TUE(2),WED(33),THU(4),FRI(5),
	SAT(6){
		@Override
		public boolean isRest() {
			return true;
		}
	},
	SUN(7){
		@Override
		public boolean isRest() {
			return true;
		}
	};
	private int value;
	private EnumTest2(int value) {//自定义构造器-->表明括号里面必须传int类型的数据
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public boolean isRest() {
		return false;
	}
}
