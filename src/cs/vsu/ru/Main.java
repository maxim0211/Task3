package cs.vsu.ru;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Main {

    /**
     * Функция, определяющая, за какое время произойдет добавление элементов  в конец в ArrayList
     * @param n количество добавляемых элементов
     * @return возвращает время добавления
     */
    public static long addingTestToArrayList(int n){
        ArrayList<Integer> list= new ArrayList<>();

        Date startLinked = new Date();
        for (int i = 0; i < n; i++){
            list.add(i);
        }
        Date finishLinked = new Date();

        long time = finishLinked.getTime() - startLinked.getTime();
        return time;
   }

    /**
     * Функция, определяющая, за какое время произойдет установка значений элементам  в ArrayList
     * @param n количество  элементов
     * @return возвращает время за которое произойдут все установки
     */
    public static long setTestToArrayList(int n){
        ArrayList<Integer> list= new ArrayList<>(n);

        for (int i = 0; i < n; i++){
            list.add(i);
        }

        Date startLinked = new Date();
        for (int i = 0; i < n; i++){
            list.set(i,i);
        }
        Date finishLinked = new Date();

        long time = finishLinked.getTime() - startLinked.getTime();
        return time;
    }

    /**
     * Функция, определяющая, за какое время произойдет получение элементов по индексу ArrayList
     * @param n количество элементов
     * @return возвращает время получения элементов
     */
    public static long getTestToArrayList(int n){
        ArrayList<Integer> list= new ArrayList<>();

        for (int i = 0; i < n; i++){
            list.add(i);
        }

        Date startLinked = new Date();
        for (int i = 0; i < n; i++){
            list.get(i);
        }
        Date finishLinked = new Date();

        long time = finishLinked.getTime() - startLinked.getTime();
        return time;
    }

    /**
     * Функция, определяющая, за какое время произойдет поиск по индексу элементов  в ArrayList
     * @param n количество  элементов
     * @return возвращает время поиска
     */
    public static long indexSearchTestToArrayList(int n){
        ArrayList<Integer> list= new ArrayList<>();

        for (int i = 0; i < n; i++){
            list.add(i);
        }

        Date startLinked = new Date();
        for (int i = 0; i < n; i++){
            list.indexOf(i);
        }
        Date finishLinked = new Date();

        long time = finishLinked.getTime() - startLinked.getTime();
        return time;
    }

    /**
     * Функция, определяющая, за какое время произойдет удаление элементов  из ArrayList
     * @param n количество удаляемых элементов
     * @return возвращает время удаления
     */
    public static long removeTestToArrayList(int n){
        ArrayList<Integer> list= new ArrayList<>();

        for (int i = 0; i < n; i++){
            list.add(i);
        }

        Date startLinked = new Date();
        for (int i = 1; i < n; i++){
            list.remove(n-i);
        }
        Date finishLinked = new Date();

        long time = finishLinked.getTime() - startLinked.getTime();
        return time;
    }

    /**
     * Функция, определяющая, за какое время произойдет добавление элементов  в конец в LinkedList
     * @param n количество добавляемых элементов
     * @return возвращает время добавления
     */
    public static long addingTestToLinkedList(int n){
        LinkedList<Integer> list= new LinkedList<>();

        Date startLinked = new Date();
        for (int i = 0; i < n; i++){
            list.add(i);
        }
        Date finishLinked = new Date();

        long time = finishLinked.getTime() - startLinked.getTime();
        return time;
    }

    /**
     * Функция, определяющая, за какое время произойдет установка значений элементам  в LinkedList
     * @param n количество  элементов
     * @return возвращает время за которое произойдут все установки
     */
    public static long setTestToLinkedList(int n){
        LinkedList<Integer> list= new LinkedList<>();

        for (int i = 0; i < n; i++){
            list.add(i);
        }

        Date startLinked = new Date();
        for (int i = 0; i < n; i++){
            list.set(i,i);
        }
        Date finishLinked = new Date();

        long time = finishLinked.getTime() - startLinked.getTime();
        return time;
    }

    /**
     * Функция, определяющая, за какое время произойдет получение элементов по индексу LinkedList
     * @param n количество элементов
     * @return возвращает время получения элементов
     */
    public static long getTestToLinkedList(int n){
        LinkedList<Integer> list= new LinkedList<>();

        for (int i = 0; i < n; i++){
            list.add(i);
        }

        Date startLinked = new Date();
        for (int i = 0; i < n; i++){
            list.get(i);
        }
        Date finishLinked = new Date();

        long time = finishLinked.getTime() - startLinked.getTime();
        return time;
    }

    /**
     * Функция, определяющая, за какое время произойдет поиск по индексу элементов  в LinkedList
     * @param n количество  элементов
     * @return возвращает время поиска
     */
    public static long indexSearchTestToLinkedList(int n){
        LinkedList<Integer> list= new LinkedList<>();

        for (int i = 0; i < n; i++){
            list.add(i);
        }

        Date startLinked = new Date();
        for (int i = 0; i < n; i++){
            list.indexOf(i);
        }
        Date finishLinked = new Date();

        long time = finishLinked.getTime() - startLinked.getTime();
        return time;
    }

    /**
     * Функция, определяющая, за какое время произойдет удаление элементов  из LinkedList
     * @param n количество удаляемых элементов
     * @return возвращает время удаления
     */
    public static long removeTestToLinkedList(int n){
        LinkedList<Integer> list= new LinkedList<>();

        for (int i = 0; i < n; i++){
            list.add(i);
        }

        Date startLinked = new Date();
        for (int i = 1; i < n; i++){
            list.remove(n-i);
        }
        Date finishLinked = new Date();

        long time = finishLinked.getTime() - startLinked.getTime();
        return time;
    }

    /**
     * Функция, позволяющая вывести результат на экран
     */
    public static void informationOutput (){
        System.out.println(" Результат сравнения ArrayList и LinkedList (in ms)\n");
        String[][] matrixResult;
        matrixResult = new String[6][6];

         matrixResult[0][0]= "Table res ";
        matrixResult[0][1]= "Array";
        matrixResult[0][2]= "Linked";

        matrixResult[1][0]="Add  (400k)";
        matrixResult[1][1]=Long.toString(addingTestToArrayList(400000));
        matrixResult[1][2]=Long.toString(addingTestToArrayList(400000));

        matrixResult[3][0]="Get    (40k)";
        matrixResult[3][1]=Long.toString(getTestToArrayList(40000));
        matrixResult[3][2]=Long.toString(getTestToLinkedList(40000));

        matrixResult[2][0]="Rem   (4kk)";
        matrixResult[2][1]=Long.toString(removeTestToArrayList(4000000));
        matrixResult[2][2]=Long.toString(removeTestToLinkedList(4000000));

        matrixResult[4][0]="Set    (40k)";
        matrixResult[4][1]=Long.toString(setTestToArrayList(40000));
        matrixResult[4][2]=Long.toString(setTestToLinkedList(40000));

        matrixResult[5][0]="Index   (3k)";
        matrixResult[5][1]=Long.toString(indexSearchTestToArrayList(3000));
        matrixResult[5][2]=Long.toString(indexSearchTestToLinkedList(3000));

        for (int j=0; j <3; j++){
            System.out.print(matrixResult[0][j]+ "    ");
        }

        System.out.println("\n");

        for (int i=1; i<6; i++){
            for ( int j=0;j<3;j++){
                System.out.print(matrixResult[i][j]+ "      ");
            }
            System.out.println("\n");
        }
    }


    public static void main(String[] args) {

       informationOutput();

    }
}
