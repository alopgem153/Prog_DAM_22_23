package Bucles;

public class FiboNacci {
    public static void main(String[] args) {
        
        int numero = 9;

        switch (numero) {
            case 0: 
                System.out.print("0");
                break;
            case 1:
                System.out.print("0, 1");
                break;
            default:
                System.out.print("0, 1");
                int f1 = 0;
                int f2 = 1;
                int aux = 0;

                while (numero > 2)
                {
                    aux = f1;
                    f1 = f2;
                    f2 = aux + f2;
                    System.out.print(" ,"+ f2 );
                    numero--;
                }

        }

    }
}
