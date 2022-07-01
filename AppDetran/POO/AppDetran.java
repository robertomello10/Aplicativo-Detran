

public class AppDetran{
    public static void main(String[] args){




        Propietario roberto = new Propietario();
        System.out.println("Digite o nome do propietário: ");
        roberto.addnome(Console.readString());
        System.out.println("Digite o numero da CNH: ");
        roberto.addCNH(Console.readString());

        Integer opcao = 0;
        while(opcao != -1){

            System.out.println("01 - Adicionar um carro\n02 - Adicionar multa á um carro\n03 - Relatório carros/multas\nDigite a opção desejada: \n");
            opcao = Console.readInteger();
            if(opcao == 1){

                String modelo;
                System.out.println("Digite o modelo do Carro: ");
                modelo = Console.readString();
                System.out.println("Digite 1 para veiculos de carga ou digite 2 para veiculos de passageiros");
                Integer opc = Console.readInteger();
                if(opc == 1){

                    Decarga car = new Decarga();
                    System.out.println("Digite a capacidade de carga do veículo: ");
                    car.setCapacidade(Console.readDouble());
                    car.addModelo(modelo);
                    roberto.addCarros(car);
                }
                else{

                    Depassageiro car =  new Depassageiro();
                    System.out.println("Digite a quantidade máxima de passageiros no veículo: ");
                    car.setPassageiro(Console.readDouble());
                    car.addModelo(modelo);
                    roberto.addCarros(car);
                }





            }

            if(opcao == 2){

                for(int x = 0; x <roberto.quantidadeCarro(); x++){

                    System.out.println("\n"+(x+1)+"-"+roberto.informaLista(x).Modelo() + " Placa: "+ roberto.informaLista(x).Placa());
                }

                System.out.println("Digite o numero do carro: ");
                Carro auxcar = roberto.informaLista(Console.readInteger() -1);

                Multa mult = new Multa();
                System.out.println("Digite a infração cometida: ");
                mult.addinfracao(Console.readString());

                System.out.println("Digite o valor da infração cometida: ");
                mult.addvalor(Console.readFloat());
                auxcar.addMultas(mult);

            }

            if(opcao == 3){

                Carro carro1 = new Carro();
                Multa multa1 = new Multa();

                System.out.println("\n\nQuantidade de carros: "+ (carro1.qtdCarro()-1)+"\nQuantidade de Propietarios: "+ roberto.qtdPropietarios()+"\nQuantidade de multas: "+ (multa1.qtdMultas()-1)+"\n");
                System.out.println("Nome do propietario: "+ roberto.Nome()+"\nCNH: " + roberto.CNH()+"\n");
                Carro aux;
                Multa aux2;
                for(int i = 0 ; i < roberto.quantidadeCarro(); i++){

                    aux = roberto.informaLista(i);

                    System.out.println("\nModelo: "+aux.Modelo()+"\nPlaca: "+aux.Placa());

                        if(aux instanceof Decarga){

                            System.out.println("Capacidade de carga (Kg):");
                            System.out.println(((Decarga)aux).getCapacidade());

                        }

                        if(aux instanceof Depassageiro){

                            System.out.println("Capacidade de Passageiro(N. passageiros):");
                            System.out.println(((Depassageiro)aux).getPassageiro());
                        }

                        System.out.println("\nMultas("+aux.quantidadeMulta()+"):");

                    for(int x = 0 ; x < aux.quantidadeMulta(); x++){
                        aux2= aux.tipoMulta(x);
                        System.out.println("\tInfracao: "+aux2.infracao()+"    Valor da infracao: "+aux2.valor());
                }
                }

            }



        }

    }

}