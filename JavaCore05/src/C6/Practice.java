package C6;

public class Practice {

    public static final double getsum(double... x) {
        double sum = 0;
        for (double k : x) {
            sum += k;
        }
        return sum;
    }

    public static final double getMin(double... x) {
        double arr[] = new double[100];
        int i = 0;
        for (double k : x) {
            arr[i] = k;
            i++;
        }

        double min = arr[0];
        for (int j = 1; j < i; j++) {
            if (min > arr[j]) {
                min = arr[j];
            }
        }
        return min;
    }

    public static final double getMax(double... x) {
        double arr[] = new double[100];
        int i = 0;
        for (double k : x) {
            arr[i] = k;
            i++;
        }

        double max = arr[0];
        for (int j = 1; j < i; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
        }
        return max;
    }

    public static String toUpper(String str) {
        char c;
        String toUpper = "";
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                c = (char) (str.charAt(i) - 32);
                toUpper += c;
            } else {
                c = str.charAt(i);
                toUpper += c;
            }
        }
        return toUpper;
    }

    public static String toLower(String str) {
        char c;
        String toLower = "";
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                c = (char) (str.charAt(i) + 32);
                toLower += c;
            } else {
                c = str.charAt(i);
                toLower += c;
            }
        }
        return toLower;
    }

    public static String toUpperFirstChar(String str) {

        str = toLower(str);

        String words[] = str.split(" ");
        char firstChar;
        char upperFirstChar;
        String result;

        for (int i = 0; i < words.length; i++) {
            firstChar = (char) words[i].charAt(0);
            upperFirstChar = String.valueOf(firstChar).toUpperCase().charAt(0);
            words[i] = upperFirstChar + words[i].substring(1);
        }
        result = String.join(" ", words);

        return result;
    }

    public static long getFibonacci(int position) {
        if (position == 0) {
            return 0;
        }
        if (position == 1) {
            return 1;
        }
        return getFibonacci(position - 1) + getFibonacci(position - 2);
    }
}
