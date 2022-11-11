public class EquivalenciasTipos {
        public static void main(String[] args) {
            byte datoByte = 4;

            short datoShort = 5;

            //tipo short es mas grande y no cabe en byte
            //datoByte = datoShort; 

            datoShort = datoByte; //Si es posible - por ampliación

            //Casting

            double datoDouble = 100.04;

            long datoLong = (long)datoDouble;

            int datoInt = (int) datoDouble;

            System.out.println("Dato Double= " + datoDouble);
            System.out.println("Dato Double casting con long= " + datoLong);
            System.out.println("Dato Double casting con int= " + datoInt);



        }
}
