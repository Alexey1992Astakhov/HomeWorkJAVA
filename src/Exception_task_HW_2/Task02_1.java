package Exception_task_HW_2;

public class Task02_1 {

    public static void main(String[] args) {
        int[] intArray = new int[]{6, 7, 5, 7, 9, 8, 1, 2};

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching ArithmeticException: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
