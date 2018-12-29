package classes.Static;

public class Main {

    public static void main(String[] args ) throws Throwable {

        System.out.println("Teste de Classe estática");

        //verificando se a a variável estática é do escopo da classe :
        AtributosEstaticos cs1 = new AtributosEstaticos("cs1");
        System.out.println("Objetos : " + AtributosEstaticos.getCounter());

        AtributosEstaticos cs2 = new AtributosEstaticos("cs2");
        System.out.println("Objetos : " +cs2.getCounter());

        AtributosEstaticos cs3 = new AtributosEstaticos("cs3");
        System.out.println("Objetos : " +cs3.getCounter());


        //Apos destruir um objeto, deve atualizar o contador id;
        cs1.finalize();
        System.out.println("Destruindo um...");
        System.out.println("Objetos : " + AtributosEstaticos.getCounter());

    }


}
