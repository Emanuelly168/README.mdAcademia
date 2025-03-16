public class pessoas {
    private String nome;
    public String nivel;
    private long cpf;
    //tive que usar um long pq int so suporta 10 numeros, ja o long 19
    private String email;
    private long telefone;

    treino dadosTreino = new treino();


    public void setNome(String nome){
        this.nome = nome;
    }
    

    public void setNivel(String nivel){
        this.nivel = nivel;
    }
    public String getNivel(){
        return this.nivel;
    }



    public void setCpf(long cpf){
        this.cpf = cpf;
    }



    public void setEmail(String email){
        this.email = email;
    }



    public void setTelefone(long telefone){
        this.telefone = telefone;
    }



    void exibeDadosPessoas(){
        System.out.println("Nome do(a) aluno(a): " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("email aluno(a): " + email);
        System.out.println("telefone:" + telefone);
        System.out.println("Nivel do(a) aluno(a): " + nivel);

        
    }


}
