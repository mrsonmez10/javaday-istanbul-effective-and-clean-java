package content02;

public class GuvenliKod {

    public static final String[] ANLASMALI_SITELER = new String[] { "http://hızlıguvenlitemizhaber.com",
            "http://engercekciharikahaberler.com" };

    public static void haberleriAl(String url) {
        for (String haberler : ANLASMALI_SITELER) {
            if (url.equals(haberler)) {
                System.out.println(haberler);
            }
        }
    }
}

/*
    // public static final List<String> ANLASMALI_SITELER_GUVENLI = Collections.unmodifiableList(Arrays.asList(ANLASMALI_SITELER));
 */
