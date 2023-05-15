package by.itstep.javatraining.revision.task;

/*	Task 09. Intersection of Segments [пересечение отрезков]
 *
 *  На числовой прямой даны два отрезка: [a1; b1] и [a2; b2].
 *  Найдите их пересечение с использованием эффективного и простого алгоритма.
 *
 *  Примечание
 *  Пересечением двух отрезков может быть:
 *  1) отрезок [a, b];
 *  2) точка (point - number);
 *  3) пустое множество (empty set).
 *
 *	Формат входных данных [input]
 *	На вход даются четыре целые числа a1, b1, a2, b2, которые задают соответствующие отрезки.
 *  Концы соответствующих отрезков могут задаваться неупорядоченно.
 *
 *  Формат выходных данных [output]
 *	Должна быть возвращена строка, которая может содержать следующее:
 *  1) границу отрезка в формате "segment - [a, b]", являющегося пересечением;
 *  2) общую точку в формате "point - number", где number - число;
 *  3) "empty set" - «пустое множество», если у отрезков нет пересечения;
 *  4) "error", если данные заданы некорректно.
 *
 *	[ input 1]: 1 3 2 4
 *	[output 1]: segment - [2, 3]
 *
 *	[ input 5]: 3 1 2 4
 *	[output 5]: segment - [2, 3]
 *
 *	[ input 2]: 1 2 2 3
 *	[output 2]: point - 2
 *
 *	[ input 3]: 1 2 3 4
 *	[output 3]: empty set
 *
 *	[ input 4]: 2 2 3 4
 *	[output 4]: error
 */

public class Task09 {
    public static String task09(int a1, int b1, int a2, int b2) {
        int crossing;
        if (a1 == b1 || a2 == b2) {
            return "error";
        }
        if (a1 > b1) {
            crossing = a1;
            a1 = b1;
            b1 = crossing;
        }
        if (a2 > b2) {
            crossing = a2;
            a2 = b2;
            b2 = crossing;
        }
        if (b1 == a2) {
            return "point - " + b1;
        } else if (b2 == a1) {
            return "point - " + b2;
        } else if (b1 < a2 || b2 < a1) {
            return "empty set";
        } else {
            return "segment - [" + Math.max(a1, a2) + ", " + Math.min(b1, b2) + "]";
        }
    }
}