package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution
{
    public static void main(String[] args)
    {
        outputStrings("Мама", "Мыла", "Раму"); //вызов решения
    }

    public static void swapStrings(String[] s, int i, int j) //замена местами двух элементов массива
    {
        String swap = s[i]; //промежуточная переменная для сохранения значения элемента до замены
        s[i] = s[j]; //присвоение "первому" элементу значения "второго"
        s[j] = swap; //присвоение "второму" элементу значения "первого", бережливо сохранённому в swap
    }

    public static void outputStrings(String a, String b, String c) //вывод перестановок
    {
        String[] s = {a, b, c}; //помещение переданных аргументов в массив
        for(int i = 0; i < 3; i++) //цикл перестановок порядка элементов 1 -> 2, 2 -> 3
        {
            swapStrings(s, 0, 1); // замена местами 1 -> 2
            System.out.println(s[0] + s[1] + s[2]); // промежуточный вывод
            swapStrings(s, 1, 2); // замена местами 2 -> 3
            System.out.println(s[0] + s[1] + s[2]); // промежуточный вывод
        }
    }
}