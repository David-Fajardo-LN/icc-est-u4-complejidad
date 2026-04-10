public class App {
    public static void main(String[] args) throws Exception {
        int number = 10;
        int [] array = {1,2,3,4,5};
        System.out.println("Hello word");
        /*//for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }*/
        for (int i: array){
            System.out.println(array[i]);
        }
    }
}
