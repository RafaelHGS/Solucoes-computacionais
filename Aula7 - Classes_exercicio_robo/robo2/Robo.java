package robo2;


public class Robo {
    private Direcao direcao; //Criando o atributo de classe, que é de acordo apenas com as direções/parâmetros predefinidas em "Direcao"

    //Configurando o valor do atributo "direcao", de acordo com a classe "Direcao".
    public void setDirecao(int direcao){
        if (direcao >= 0 && direcao <= 3){ //Verificando está dentro dos índices possíveis em "Direcao"
            this.direcao = Direcao.values()[direcao]; //Acessando e definindo o atributo "direcao" de acordo com o índice do enum contido em "Direcao"
        }
        else{
            System.out.println("Valor inválido  ");
        }
    }

    //Retornando o valor do atributo direcao
    public Direcao getDirecao(){
        return this.direcao;
    }
}
