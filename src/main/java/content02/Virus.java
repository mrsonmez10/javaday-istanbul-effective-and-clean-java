package content02;

public class Virus {

	public static String virus() {
		String virusUrl = "kotuhaberler.com";
		GuvenliKod.ANLASMALI_SITELER[0] = virusUrl;
		GuvenliKod.haberleriAl(virusUrl);
		return "";
	}

	public static void main(String[] args) {
		virus();
	}

	/*
		String virusUrl = "kotuhaberler.com";
		GuvenliKod.ANLASMALI_SITELER[0] = virusUrl;
		GuvenliKod.haberleriAl(virusUrl);
	 */
}
