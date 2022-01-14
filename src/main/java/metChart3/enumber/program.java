package metChart3.enumber;

public class program {
    public static void main(String[] args) {

        System.out.println(Color.RED.getColor()+Color.RED.getCode());        // #FF0000
        System.out.println(Color.GREEN.getColor()+Color.GREEN.getCode());      // #00FF00
        System.out.println(Color.BLUE.getColor()+Color.BLUE.getCode());

        Operation op = Operation.SUM;
        System.out.println(op.action(10, 4));   // 14
        op = Operation.MULTIPLY;
        System.out.println(op.action(6, 4));    // 24
        op = Operation.SUBTRACT;
        System.out.println(op.action(3,5));
    }
}

enum Color {
    RED("#FF0000", "Красный"), BLUE("#0000FF", "Синий"), GREEN("#00FF00", "Зеленый");
    private String code;
    private String color;

    Color(String code, String color) {
        this.code = code;
        this.color = color;
    }

    public String getCode() {
        return code;
    }

    public String getColor() {
        return color;
    }
}

enum Operation{
    SUM{
        public int action(int x, int y){ return x + y;}
    },
    SUBTRACT{
        public int action(int x, int y){ return x - y;}
    },
    MULTIPLY{
        public int action(int x, int y){ return x * y;}
    };
    public abstract int action(int x, int y);
}