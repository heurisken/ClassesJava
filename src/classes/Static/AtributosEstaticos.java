package classes.Static;

public class AtributosEstaticos {

    private static int counter = 0;
    private String nome;


    public AtributosEstaticos(String nome) {
        counter++;
        this.nome = nome;
    }

    //Métodos estáticos não podem referenciar this
    public static int getCounter() {
        return counter;
    }

    //Métodos estáticos não podem acessar variáveis de instância.
    public static void setCounter(int counter) {
        AtributosEstaticos.counter = counter;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        counter--;
    }
}
