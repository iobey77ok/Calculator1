import java.util.ArrayList;

interface Operation {
    int perform(int a, int b);
}

class Addition implements Operation {
    public int perform(int a, int b) {
        return a + b;
    }
}

class Subtraction implements Operation {
    public int perform(int a, int b) {
        return a - b;
    }
}

class Calculator<T extends Operation> {
    ArrayList<Integer> result = new ArrayList<>();
    T operation;

    Calculator(T operation) {
        this.operation = operation;
    }

    void calculate(int a, int b) {
        result.add(operation.perform(a, b));
    }
}

class Calculator1 {
    public static void main(String[] args) {
        Calculator<Addition> adding = new Calculator<>(new Addition());
        Calculator<Subtraction> sub = new Calculator<>(new Subtraction());

        adding.calculate(10, 5);
        sub.calculate(10, 2); 

        System.out.println("Addition Result: " + adding.result); 
        System.out.println("Subtraction Result: " + sub.result); 
    }
}
