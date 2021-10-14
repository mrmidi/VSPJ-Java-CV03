package abstraction;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Function_Line line = new Function_Line(1.5, 3.2);
        System.out.println(line.calc_y(9.88));

        Function_Line line2;
        try {
            line2 = (Function_Line) line.clone();
            System.out.println(line2);
        } catch (CloneNotSupportedException e) {
            System.out.println("Error, couldn't clone for some reason");
        }

    }
}
