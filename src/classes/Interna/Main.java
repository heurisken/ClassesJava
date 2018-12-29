package classes.Interna;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Teste de classes internas.");


        //Instanciando a classe Externa
        ExternaClass classeExterna = new ExternaClass("ClasseExterna");

        //Instanciando a classe Não estática:
        ExternaClass.NoStaticClass classeNaoEstatica = classeExterna.new NoStaticClass("ClasseNãoEstática");

        //Instanciando a classe Estática:
        ExternaClass.StaticClass classeEstatica = new ExternaClass.StaticClass("ClasseEstática");
        ExternaClass.StaticClass classeEstatica2 = new ExternaClass.StaticClass("ClasseEstatica2");



        //Imprimindo todas as classes :
        System.out.println(classeExterna);
        System.out.println(classeNaoEstatica);
        System.out.println(classeEstatica);
        System.out.println(classeEstatica2);



    }
}
