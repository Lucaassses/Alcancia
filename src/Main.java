//Lucas Rodriguez España


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new scanner;

        int Mon20, Mon50, Mon100, Mon200, Mon500;

        if (Mon20 == 20) {
            Mon20++;

        }else if(Mon50 == 50){
            Mon50++;

        }else if(Mon100 == 100){
            Mon100++;

        }else if(Mon200 == 200){
            Mon200++;

        }else if(Mon500 == 500){
            Mon500++;
        }


        public int contarMoneda(int denominacion) {
            int contador = 0;
            switch (denominacion) {
                case 20:
                    contador = Mon20;
                    break;
                case 50:
                    contador = Mon50;
                    break;
                case 100:
                    contador = Mon100;
                    break;
                case 200:
                    contador = Mon200;
                    break;
                case 500:
                    contador = Mon500;
                    break;
            }

            return contador;
        }

        public int calcularTotal(){
            return Mon20 *20 + Mon50 *50 + Mon100 *100 + Mon200 *200 + Mon500 *500;
        }
        public void romperAlcancia(){

            Mon20 = 0;
            Mon50 = 0;
            Mon100 = 0;
            Mon200 = 0;
            Mon500 = 0;
        }
    }






}


}