package Exceptions;

public class MultiCatchException {

    public static void main(String[] args) {

        String id="23e45g";
        int idNum=0;

        try {
             idNum = Integer.parseInt(id);
            System.out.println(idNum);
            id="111";
            idNum=Integer.parseInt(id);

        }catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }finally {
            System.out.println("i am in finally block");
        }

        System.out.println("i am out of try catch block");
        System.out.println(idNum);

    }
}
