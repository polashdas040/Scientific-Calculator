
public class CalculatorModel {

    int operator = 0;
    double operand1;
    double operand2;
    double result;

    public void setOperand(String opr) {
        if (!opr.equals("")) {
            double num = Double.valueOf(opr);
            if (num <= 100000000 && num >= -100000000) {
                if (operator == 0) {
                    operand1 = num;
                } else {
                    operand2 = num;
                }
            }
        }
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;

    }

    public void setResult(double result) {
        this.result = result;
    }

    public void process() {
        switch (operator) {
            case 1:
                result = summation(operand1, operand2);
                break;
            case 2:
                result = subtraction(operand1, operand2);
                break;
            case 3:
                result = multiplication(operand1, operand2);
                break;
            case 4:
                result = division(operand1, operand2);
                break;
            case 5:
                result = modulus(operand1, operand2);
                break;
            case 6:
                result = inverse(operand1);
                break;
            case 7:
                result = sin(operand1);
                break;
            case 8:
                result = yrootx(operand1, operand2);
                break;
            case 9:
                result = raised3(operand1);
                break;
            case 10:
                result = log(operand1);
                break;
            case 11:
                result = Degrees(operand1);
                break;
            case 12:
                result = cos(operand1);
                ;
                break;
            case 13:
                result = tan(operand1);
                ;
                break;
            case 14:
                result = bXraisedToY(operand1, operand2);
                break;
            case 15:
                result = exp(operand1);
                break;
            case 16:
                result = sinh(operand1);
                ;
                break;
            case 17:
                result = cosh(operand1);
                ;
                break;
            case 18:
                result = tanh(operand1);
                ;
                break;
            case 19:
                result = sqrt(operand1);
                break;
            case 20:
                result = PI();
                break;
            case 21:
                result = raised2(operand1);
                break;

            case 23:
                result = fact(operand1);
                break;
        }
        operand1 = result;
    }

    public double summation(double a, double b) {

        result = a + b;
        return result;
    }

    public double subtraction(double a, double b) {

        result = a - b;
        return result;
    }

    public double multiplication(double a, double b) {

        result = a * b;
        return result;
    }

    public double division(double a, double b) {

        result = a / b;
        return result;
    }

    public double modulus(double a, double b) {

        result = a % b;
        return result;
    }

    public double inverse(double a) {

        result = 1 / a;
        return result;
    }

    public double sin(double a) {

        result = Math.sin(Math.toRadians(a));
        return result;
    }

    public double cos(double a) {

        result = Math.cos(Math.toRadians(a));
        return result;
    }

    public double tan(double a) {

        result = Math.tan(Math.toRadians(a));
        return result;
    }

    public double sinh(double a) {

        result = Math.sinh(Math.toRadians(a));
        return result;
    }

    public double cosh(double a) {

        result = Math.cosh(Math.toRadians(a));
        return result;
    }

    public double tanh(double a) {

        result = Math.tanh(Math.toRadians(a));
        return result;
    }

    public double yrootx(double a, double b) {

        result = Math.pow(a, (1 / b));
        return result;
    }

    public double raised3(double a) {

        result = a * a * a;

        return result;
    }

    public double bXraisedToY(double a, double b) {
        result = 1.0;
        while (b > 0) {
            if (b % 2 == 0) {
                a = a * a;
                b = b / 2;
            } else {
                result = result * a;
                b = b - 1;
            }
        }
        return result;
    }

    public double exp(double a) {
        result = Math.exp(a);
        return result;
    }

    public double log(double a) {
        result = Math.log(a);
        return result;
    }

    public double Degrees(double a) {
        result = Math.toDegrees(a);
        return result;
    }

    public double sqrt(double a) {
        double t;
        result = a / 2;
        do {
            t = result;
            result = (t + (a / t)) / 2;
        } while ((t - result) != 0);
        return result;
    }

    public double PI() {
        result = Math.PI;
        return result;
    }

    public double raised2(double a) {
        result = a * a;
        return result;
    }

    public double fact(double a) {
        double f = a;
        double n = 1;
        while (f != 0) {
            n = n * f;
            f--;
        }
        result = n;
        return result;
    }

}
