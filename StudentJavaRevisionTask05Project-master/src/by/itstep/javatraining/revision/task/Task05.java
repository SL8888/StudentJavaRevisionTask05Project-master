package by.itstep.javatraining.revision.task;

/*	Task 05. The Average Number [среднее число]
 *
 *	Даны три различных числа. Определите среднее по величине число.
 *
 *	Примечание
 *	1) Не забудьте про "защиту от дурака": все три числа должны быть различными.
 *
 *	Формат входных данных [input]
 *	На вход даётся три различных целых числа в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено среднее по величине число или ноль, если среди чисел есть одинаковые.
 *
 *	[ input 1]: 1 2 3
 *	[output 1]: 2
 *
 *	[ input 2]: 17 23 11
 *	[output 2]: 11
 *
 *	[ input 3]: 7 7 7
 *	[output 3]: 0
 *
 *	[ input 4]: 5 7 7
 *	[output 4]: 0
 */

public class Task05 {
    public static int task05(int a, int b, int c) {
        if (a != c && a != b && b != c) {
//            return (a > b) ? ((c < b) ? b : ((c < a) ? c : a)) :  // #1
//                    ((a > c) ? a : (b > c) ? c : b);
            if ((b - a) * (c - b) >= 0) {                           // #2
                return b;
            } else if ((a - b) * (c - a) >= 0) {
                return a;
            } else return c;
        }
        return 0;
    }
}

