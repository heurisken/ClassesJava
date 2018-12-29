package classes.Interna;

public class ExternaClass {

    private String ec;

    public ExternaClass(String ec) {
        this.ec = ec;
    }

    public String getEc() {
        return ec;
    }

    public void setEc(String ec) {
        this.ec = ec;
    }

    @Override
    public String toString() {
        return getEc();
    }

//Classe interna tipo NÃO ESTÁTICA ----------------------------------------------------------


    public class NoStaticClass{

        private String nsc;

        public NoStaticClass(String nsc) {
            this.nsc = nsc;
        }

        public String getNsc() {
            return nsc;
        }

        public void setNsc(String nsc) {
            this.nsc = nsc;
        }

        @Override
        public String toString() {
            return getNsc();
        }
    } // ----------------------------------------------------------Classe interna tipo NÃO ESTÁTICA


    //Classe interna tipo ESTÁTICA --------------------------------------------------------------
    public static class StaticClass{

        private String sc;

        public StaticClass(String sc) {
            this.sc = sc;
        }

        public String getSc() {
            return sc;
        }

        public void setSc(String sc) {
            this.sc = sc;
        }

        @Override
        public String toString() {
            return getSc();
        }
    }// -------------------------------------------------------------- Classe interna tipo ESTÁTICA
}
