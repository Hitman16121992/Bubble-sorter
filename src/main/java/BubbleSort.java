public class BubbleSort {
    private int[] a; //создаём массив
    private int elem; // количество элементов в массиве

    public BubbleSort(int max) {  //конструктор
        a = new int[max];           // создание массива размера max
        elem = 0;                   //при создание в массиве 0 элементов
    }




    public void into(int value){   //метод вставки элемента в массив
        a[elem] = value;            // вставка value в массив а
        elem++;                     // размер массива увеличивается
    }


    public void printer(){                  //метод вывода на консоль
        for(int i = 0; i< elem; i++){       //для каждого элемента в массиве
            System.out.println(a[i]+"");        // вывести на консоль
//            System.out.println("");       // с новой строки
        }
        System.out.println("----Окончание вывода массива----");
    }

    private void toSwap( int first, int second){        //метод меняет пару чисел в массиве
        int dummy = a[first];                       //во временную переменную помещаем первый элемент
        a[first]= a[second];                           //на место первого ставим второй элемент
        a[second]= dummy;                               //вместо второго элемента пишем первый из временной памяти
    }

    public void bubbleSorted(){                     //метод пузырьковой сортировки
        for (int out = elem -1; out >=1; out--){       //внешний цикл
            for (int in = 0; in <out; in++){            //внутренний цикл
                if (a[in]<a[in+1])                      //если порядок элементов нарушен
                    toSwap(in, in+1);                   //вызвать метод, меняющий местами

            }
        }
    }
}
