package model;

public abstract class Conversor {
	public static int converter(int celsius) {
        return (celsius * 9 / 5) + 32;
    }
	
	public static double converter (double km) {
		return km * 0.621371;
	}

    public static String converter(String palavra) {
        return palavra.toLowerCase();
    }
}
