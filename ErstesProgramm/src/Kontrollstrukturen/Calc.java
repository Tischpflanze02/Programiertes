package Kontrollstrukturen;

public class Calc {
    public Calc(String operator, double v1, double v2) {
        value1 = v1;
        value2 = v2;
        operation = StringToMathOperation(operator);
    }
    enum MathOperation {
        Invalid,
        Sum,
        Subtract,
        Multiply,
        Dived,
    }

    public static double calc(String operator, double v1, double v2) {
        Calc calc = new Calc(operator, v1, v2);
        return calc.calc();
    }

    public double calc() {
        return switch (operation) {
            case MathOperation.Multiply -> value1 * value2;
            case MathOperation.Dived -> value1 / value2;
            case  MathOperation.Subtract -> value1 - value2;
            case MathOperation.Sum -> value1 + value2;
            default -> 0.0;
        };
    }

    private MathOperation StringToMathOperation(String operation) {
        MathOperation result = MathOperation.Invalid;
        switch (operation) {
            case "*" -> result = MathOperation.Multiply;
            case "-" -> result = MathOperation.Subtract;
            case "+" -> result = MathOperation.Sum;
            case "/" -> result = MathOperation.Dived;
        }
        return result;
    }

    private double value1 = 0.0;
    private double value2 = 0.0;
    private MathOperation operation = MathOperation.Invalid;
}