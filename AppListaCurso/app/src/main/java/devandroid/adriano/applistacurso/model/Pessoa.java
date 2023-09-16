package devandroid.adriano.applistacurso.model;

// OrdemDePagamnto- pascalClase - CameCase

public class Pessoa {



    //Construtor
    //Atributos - Objeto - Molde - Modelo - Template
    // Metedos de Acesso - Getts and Setts

    private String primeiroNome;
    private String sobreNome;
    private String cursoDesejado;
    private String telefoneDesejado;

    public Pessoa(){}

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefoneDesejado() {
        return telefoneDesejado;
    }

    public void setTelefoneDesejado(String telefoneDesejado) {
        this.telefoneDesejado = telefoneDesejado;
    }
}
