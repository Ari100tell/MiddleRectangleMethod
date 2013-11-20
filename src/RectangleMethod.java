/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Ari100tell
 */
public class RectangleMethod {
    public double run(double a, double b, int n) {
        double result, h;
        int i;

        h = (b - a) / n; //Шаг сетки
        result = 0.0;

        for (i = 1; i <= n; i++) {
            result += calculateFunction(a + h * (i - 0.5)); //Вычисляем в средней точке и добавляем в сумму
        }
        result *= h;

        return result;
    }

    public double calculateFunction(double x) {
        return Math.pow(x, 2) / Math.pow((2 * x + 0.3), 2);
    }

    public Double calculateFault(Double actualResult, Double analiticalResult) {
        return (Math.abs(actualResult - analiticalResult) / analiticalResult) * 100;
    }

}
