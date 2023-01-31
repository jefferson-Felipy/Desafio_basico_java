public class App {
    public static void main(String[] args) throws Exception {
       
        System.out.println("Soma dos números multiplos de 3 ou de 5 menores que 1000:"+calculoUm());
        System.out.println("Soma dos números multiplos de 3 ou de 5 menores que 500:"+calculoDois());

    }

    //Soma dos Números Multiplos de 3 ou 5 menores que 1000_
    public static int calculoUm() {
        int valores = 0;

        for(int i = 1; i < 1000;i++){
            if(i % 3 == 0 || i % 5 == 0 ){
                valores += i;
            }
        }

        return valores;
    }

    //Soma dos Números multiplos de 3 ou de 5 menores que 500_
    public static int calculoDois() {
        int valores2 = 0;

        for(int i = 1;i < 500;i++){
            if(i % 3 == 0 || i % 5 == 0){
                valores2 += i;
            }

            return valores2;
        }
    }
}
