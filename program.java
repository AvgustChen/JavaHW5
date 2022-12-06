
public class program {
public static void main(String[] args) {
    // Введите n для вычесления треугольного числа
    int n = 21;
    int result = model.triangularNumber(n);
    int[][] array = model.createArray(n);
    array = model.arrayTriangular(array, n);
    System.out.printf("Треугольное число от " + n + " = " + result + "\n");
    model.printRow(array);
}
    
}