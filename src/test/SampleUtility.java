package test;

public class SampleUtility {

	public static final int MORNING = 1;
	public static final int DAYTIME = 2;
	public static final int NIGHT = 3;

	public String getJapaneseHello(int time) {

		String hello = null;

		switch (time) {
		case MORNING:
			hello = "おはよう";
			break;
		case DAYTIME:
			hello = "こんにちわ";
			break;
		case NIGHT:
			hello = "こんばんわ";
			break;
		default:
			throw new IllegalArgumentException("time: " + time);
		}

		return hello;
	}
}
