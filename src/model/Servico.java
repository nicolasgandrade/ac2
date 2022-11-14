package model;

public class Servico {
    
    private int id;
    private String nome;
    private String empresa;
    private String descricao;
    private String inicio;
    private String fim;
    private float valor;

    public Servico(){
        
    }
    
    public Servico(String nome, String empresa, String descricao, String inicio, String fim, float valor) {
        this.nome = nome;
        this.empresa = empresa;
        this.descricao = descricao;
        this.inicio = inicio;
        this.fim = fim;
        this.valor = valor;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}