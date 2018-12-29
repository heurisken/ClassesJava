package modificadores;

//Classe que será instanciada pela MainMDA como final. Teste para ver um objeto do tipo final pode ser modificado.
public class ModificaoresDeAcesso {

    private int id;
    private final int idFinal;
    private String nome;



    public ModificaoresDeAcesso(int id, String nome, int idFinal) {
        this.id = id;
        this.nome = nome;
        this.idFinal = idFinal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFinal() {
        return idFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
