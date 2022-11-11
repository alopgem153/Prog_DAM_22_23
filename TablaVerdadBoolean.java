public class TablaVerdadBoolean {
    public static void main(String[] args) {
         boolean varVerdadera = true;
         boolean varFalsa = false;

         System.out.println(varVerdadera + " AND " + varVerdadera + " = " + (varVerdadera && varVerdadera) );
         System.out.println(varVerdadera + " AND " + varFalsa + " = " + (varVerdadera && varFalsa) );


         System.out.println(varVerdadera + " OR " + varVerdadera + " = " + (varVerdadera || varVerdadera) );
         System.out.println(varVerdadera + " OR " + varFalsa + " = " + (varVerdadera || varFalsa) );

    }
}
