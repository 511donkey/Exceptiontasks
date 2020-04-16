import java.util.ArrayList;
import java.util.Arrays;

public class Runtimeexceptions {
    public static void main(String[] args) {
        Exception[] exceptions = new Exception[9];

        try {
            int a = 9;
            int b = 0;
            int res = a / b;
        } catch (ArithmeticException e1) {
            System.out.println("Попытка деления на 0");
            exceptions[0] = e1;
        }


        try {
            int a = 6;
            int b = 0;
            int res = a / b;
        } catch (ArithmeticException e2) {
            System.out.println("попытка деления на 0, поменяем числа");
            int res = 0;
            System.out.println(res);
            exceptions[1] = e2;
        }

        try {
            int[] arr = new int[4];
            arr[9] = 4;
        } catch (ArrayIndexOutOfBoundsException e3) {
            System.out.println("соответствующий элемент не найден");
            exceptions[2] = e3;
        }

        try {
            String name = null;
            name.length();
        } catch (NullPointerException e4) {
            System.out.println(e4.getMessage());
            exceptions[3] = e4;
        }

        try {
            Object[] names = new String[10];
            names[0] = new Character('8');
        } catch (ArrayStoreException e5) {
            System.out.println(e5.getMessage() + " попытка сохранения в массив объекта недопустимого типа");
            exceptions[4] = e5;
        }

        try {
            Object a = new Character('n');
            System.out.println((Integer) a);
        } catch (ClassCastException e6) {
            System.out.println(e6.getMessage());
            exceptions[5] = e6;
        }

        try {
            int[] negativearr = new int[-3];
        } catch (NegativeArraySizeException e7) {
            System.out.println("Длина массива не может быть отрицательной");
            exceptions[6] = e7;
        }

        try {
            Number[] arr = new Integer[3];
            arr[0] = new Double(2.43);
        } catch (ArrayStoreException e8) {
            System.out.println(e8.getMessage() + " задали неправильный тип переменной");
            exceptions[7] = e8;
        }

        try {
            Object[] a = new String[2];
            a[0] = new Integer(3);
        } catch (ArrayStoreException e9) {
            System.out.println(e9.getMessage() + " неправильный тип");
            exceptions[8] = e9;
        }


        System.out.println(Arrays.toString(exceptions));
    }
}
