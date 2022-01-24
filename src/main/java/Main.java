import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import FruitLand.Apple;
import FruitLand.Box;
import FruitLand.Orange;



public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {2, 5, 1, 4, 3, 6, 7}; //массив интов
        String[] strArray = new String[5]; //массив стрингов
        strArray[0] = "Локи";
        strArray[1] = "Маленький";
        strArray[2] ="Кот";
        strArray[3] ="Наглый";
        strArray[4] ="Серый";
        System.out.println("Задание 1: ");

        printTheContent(intArray);
        printTheContent(strArray);
        System.out.println(" ");
        System.out.println("Меням значение массива местами: ");

        swapTheArrayCellByIndex(intArray, 0,2);
        swapTheArrayCellByIndex(intArray, 1,2);
        swapTheArrayCellByIndex(intArray, 2,4);



        swapTheArrayCellByIndex(strArray, 2,3);
        swapTheArrayCellByIndex(strArray, 3,4);


        printTheContent(intArray);
        printTheContent(strArray);


        System.out.println("Задание 2:");
        List<Integer> integerList = arrayToList(intArray);
        List<String> stringList = arrayToList(strArray);

        System.out.println(stringList);
        System.out.println(integerList);

        System.out.println("Задание 3:");


        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
         // добавляем яблоки в коробку

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
         // добавляем апельсины в коробку

        System.out.println("Вес яблок в коробке равен " + appleBox.getWeight());
        System.out.println("Вес апельсинов  в коробке равен " + orangeBox.getWeight());

        compareWeight((appleBox.compare(orangeBox)));
        System.out.println("Добавим яблок для ровного веса");

        appleBox.addFruit(new Apple());


        compareWeight((appleBox.compare(orangeBox)));

        System.out.println("Создаем новую коробку ");

        Box<Apple> secondAppleBox = new Box<>();
        System.out.println("Вес новой коробки до манипуляций равен : " + secondAppleBox.getWeight());
        appleBox.pourOverTo(secondAppleBox); // пересыпаем яблоки

        System.out.println("Вес первой коробки после пересыпафния равен : " +appleBox.getWeight());
        System.out.println("Новый вес второй коробки: " +secondAppleBox.getWeight());



    }


        public static <T> void swapTheArrayCellByIndex(T[] arr, int firstIndex, int secondIndex) {
            T object = arr[firstIndex];
            arr[firstIndex] = arr[secondIndex];
            arr[secondIndex] = object;
        }

        public static <T> List<T> arrayToList(T[] arr) {
            return new ArrayList<T>(Arrays.asList(arr));
        }

    public static <T> void printTheContent(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void compareWeight(boolean weightFromTheBox){
        if (!weightFromTheBox) {
            System.out.println("Вес коробок не равен");
        }
        else {
            System.out.println("Вес коробок  равен");
        }
    }



}
