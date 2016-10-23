package Base25.week5.lesson10;

public class TrafficLight {
	private int						curInx;
	private static EnumTrafColor[]	vect	= new EnumTrafColor[4];

	public TrafficLight() {
		this.curInx = -1;
		TrafficLight.vect[0] = EnumTrafColor.жовт;
		TrafficLight.vect[1] = EnumTrafColor.зелен;
		TrafficLight.vect[2] = EnumTrafColor.жовт;
		TrafficLight.vect[3] = EnumTrafColor.черв;
	}

	public enum EnumTrafColor {
		черв, жовт, зелен;

		public EnumTrafColor getCurColor(int curInx) {
			return vect[curInx];
		}

		public EnumTrafColor getNextColor(int curInx) {

			return vect[curInx];
		}
	}

	@Override
	public String toString() {
		return vect[0].getCurColor(getCurInx()).toString();

	}

	public EnumTrafColor switchNextColor() {

		if (getCurInx() == vect.length - 1) setCurInx(0);
		else setCurInx(getCurInx() + 1);

		return vect[0].getNextColor(getCurInx());

	}

	public int getCurInx() {
		return curInx;
	}

	public void setCurInx(int curInx) {
		this.curInx = curInx;
	}

}
