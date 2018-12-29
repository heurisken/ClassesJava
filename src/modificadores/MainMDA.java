package modificadores;

public class MainMDA {

    public static void main(String[] args ){

        //Instanciado um objeto com final para ver se pode se seus atributos podem ser modificados.
        final ModificaoresDeAcesso obj1 = new ModificaoresDeAcesso(1, "obj1" , 1000);
        obj1.setId(2);
        System.out.println("ID " + obj1.getNome() + " : " + obj1.getId());

        obj1.setId(3);
        System.out.println("ID " + obj1.getNome() + " : " + obj1.getId());

        //Verificar os objetos
        System.out.println(obj1.getNome() + " : " + obj1);

        ModificaoresDeAcesso obj2;

        obj2 = obj1;

        System.out.println(obj1.getNome() + " : " + obj1);
        System.out.println(obj2.getNome() + " : " + obj2);

        //modificando os valores dos objetos
        obj1.setNome("obj1.novo");
        System.out.println(obj1.getNome() + " : " + obj1);
        System.out.println(obj2.getNome() + " : " + obj2);


        //Sobescrevendo os objetos :
        ModificaoresDeAcesso obj3 = new ModificaoresDeAcesso(3 , "obj3" , 3000);

        //Erro pois obj1 é final. Sua referência na memória não pode ser modificada
        //obj1 = obj3;

        obj2 = obj3;
        System.out.println(obj2.getNome() + " : " + obj2);
        System.out.println(obj3.getNome() + " : " + obj3);








    }

}
