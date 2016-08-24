package module2.homework;

public class Task1 {

    static int array[] = {25, -7, 96, 8, 6, -87, 14, 27, -8, 2};
    static double data[] = {52, 3.2, 9.6, 18, -6, 5.7, -15.4, 67, -58, -6};


    static int sum(int[] array) {  //sum(int array[])
        int a = 0;
        for (int item : array) {
            a += item;
        }
        return a;
    }

    static double sum(double[] data) { //sum(double[])
        double a = 0;
        for (double item : data) {
            a += item;
        }
        return a;
    }

    static int multiplication(int[] array) {  //multiplication(int array[])
        int b = 1;
        for (int item : array) {
            b *= item;
        }
        return b;
    }

    static double multiplication(double[] data) {  //multiplication (double[])
        double b = 1;
        for (double item : data) {
            b *= item;
        }
        return b;
    }

    static int modulus(int[] array) {  //modulus(int array[])
        int c = array[0];
        int d = array[9];
        int e = c % d;

        return e;
    }

    static double modulus(double[] data) {  //modulus(double[])
        double c = data[0];
        double d = data[9];
        double e = c % d;

        return e;

    }

    static int min(int[] array) {   //min(int array[])
        int f = array.length-1;
        for (int item : array) {
            if (item < f) {
                f = item;
            }
        }
        return f;
    }

    static double min(double[] date) {  //min(double[])
        double f = date.length-1;
        for (double item : date) {
            if (item < f) {
                f = item;
            }
        }
        return f;
    }

    static int max(int[] array) {  //max(int array[])
        int g = array.length-1;
        for (int item : array) {
            if (item > g) {
                g = item;
            }
        }
        return g;
    }

    static double max(double[] data) {   //max(double[])
        double h = data.length-1;
        for (double item : data) {
            if (item > h) {
                h = item;
            }
        }
        return h;
    }

    static int maxPositive(int[] array) {  //maxPositive(int array[])
        int k = 0;
        for (int item : array) {
            if (item > k) {
                k = item;
            }
        }
        return k;
    }

    static double maxPositive(double[] data) {  //maxPositive(double array[])
        double k = 0;
        for (double item : data) {
            if (item > k) {
                k = item;
            }
        }
        return k;
    }

    static int secondLargest(int[] array) {  //secondLargest(int array[])
        int l = array.length-1;
        int m = max(array);
        for (int item : array) {
            if (l < item && item < m) {
                l = item;
            }
        }
        return l;
    }

    static double secondLargest(double[] data) {  // secondLargest(double[])
        double l = data.length-1;
        double m = max(data);
        for (double item : data) {
            if (l < item && item < m) {
                l = item;
            }
        }
        return l;
    }


    public static void main(String[] args) {

        System.out.println(sum(array));
        System.out.println(sum(data));

        System.out.println(multiplication(array));
        System.out.println(multiplication(data));

        System.out.println(modulus(array));
        System.out.println(modulus(data));

        System.out.println(min(array));
        System.out.println(min(data));

        System.out.println(max(array));
        System.out.println(max(data));

        System.out.println(maxPositive(array));
        System.out.println(maxPositive(data));

        System.out.println(secondLargest(array));
        System.out.println(secondLargest(data));
    }
}
