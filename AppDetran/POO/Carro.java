import java.util.ArrayList;
import java.util.Random;


public class Carro{
    private String modelo;
    private String placa;
    private ArrayList<Multa> listaMulta = new ArrayList<Multa>();
    private String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVXWYZ";
    private static Integer numeroCarros = 0;
    private Random gerarPlaca = new Random();


    //criando os get

    public String Modelo(){
        return modelo;
    }

    public String Placa(){
        return placa;
    }

    public Multa tipoMulta(Integer quantidade){
        return listaMulta.get(quantidade);
    }

    public Integer quantidadeMulta(){

        return listaMulta.size();
    }



    //criando os set
    public void addMultas(Multa mult){

        listaMulta.add(mult);
    }


    public void addModelo(String model){
        this.modelo = model;
    }

    public void addPlaca(String plate){
        if(plate.length()  == 8){
            this.placa = plate;

        }
        else{
            System.out.println("Tamanho de placa INVALIDA");
        }

    }

    public String addZero(Integer quantidade){

        if(quantidade < 10){
            return ("00" + Integer.toString(quantidade));
        }
        else if(quantidade < 100){
            return ("0" + Integer.toString(quantidade));
        }
        return Integer.toString(quantidade);
    }

    public Carro(){

        numeroCarros += 1;
        addPlaca("" + alfabeto.charAt(gerarPlaca.nextInt(26)) + alfabeto.charAt(gerarPlaca.nextInt(26)) +
        alfabeto.charAt(gerarPlaca.nextInt(26)) + Integer.toString(gerarPlaca.nextInt(10)) +
        alfabeto.charAt(gerarPlaca.nextInt(26)) + addZero(numeroCarros));
    }

    public Integer qtdCarro(){

        return numeroCarros;
    }



}