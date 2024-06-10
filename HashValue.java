package HashValue;

public class HashValue {

    public static long calculateHashValue(String password) {
        int multiplikator = 1;
        long summe = 0;

        for (int i = 0; i < password.length(); i++) {
            Character erstesZeichen = password.charAt(i);
            int asciiWert = (int) erstesZeichen;

            summe += calculateSumme(asciiWert, multiplikator);

            if ((i + 1) % 4 == 0) {
                multiplikator = 1;
            }else{
                multiplikator *= 64;
            }
        }
        return summe % 1000000;
    }
    public static long calculateSumme(int ascii, int multiplikator) {
        return ascii * multiplikator;
    }

}





