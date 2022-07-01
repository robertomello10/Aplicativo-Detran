public class Multa{

    private String infracao;
    private Float valor;
    private static Integer numeroMultas = 0;


//criando get

public String infracao(){
    return infracao;

}

public Float valor(){
    return valor;

}

public Multa(){
    numeroMultas += 1;
}

//criando set

public void addinfracao(String infringement){
    this.infracao = infringement;

}

public void addvalor(Float value){
    this.valor = value;
}

public Integer qtdMultas(){

    return numeroMultas;

}


}