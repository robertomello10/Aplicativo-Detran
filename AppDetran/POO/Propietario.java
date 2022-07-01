import java.util.ArrayList;

public class Propietario{

    private String nome;
    private String cnh;
    private ArrayList<Carro> listaCarros = new ArrayList<Carro>();
    private static Integer numeroPropietarios = 0;


// criando as funcoes que retornam objetos e atribuem valores.
    public String Nome(){
        return nome;
    }


    public String CNH(){
        return cnh;
    }


    public Propietario(){

        numeroPropietarios +=1;
    }

//criando os set

    public void addnome(String name){
        nome = name;

    }

    public void addCarros(Carro car){

        listaCarros.add(car);
    }

    public void addCNH(String habilitacao){

        cnh = habilitacao;
    }

    public Integer qtdPropietarios(){

        return numeroPropietarios;
    }

    public Carro informaLista(Integer quantidade){

        return listaCarros.get(quantidade);

    }

    public Integer quantidadeCarro(){

        return listaCarros.size();
    }




}

