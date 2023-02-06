public class EX3 {
    public static void main(String args[]) {
        System.out.println("This is my third java program.");
        System.out.print("My name is ");
        for(int i = 0; args.length > i; i++) {
            System.out.print(args[i] + " ");
        }
    }
}