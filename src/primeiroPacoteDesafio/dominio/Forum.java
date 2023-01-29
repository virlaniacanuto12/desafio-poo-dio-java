package primeiroPacoteDesafio.dominio;

public class Forum extends Dev {


    private String descricao;
    private String tecnologia;
    private String assunto;

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getTecnologia() {
        return tecnologia;
    }
    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
    public String getAssunto() {
        return assunto;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public int calcularTotalXp(int XP) {
        return super.calcularTotalXp(XP + 5);
    }
    @Override
    public void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }
    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }
    
    
}
