package robo;


public class Robo {
    private Direcao direcao; //Criando o atributo de classe, que é de acordo apenas com as direções/parâmetros predefinidas em "Direcao"

    //Configurando o valor do atributo "direcao", de acordo com a classe "Direcao".
    public void setDirecao(Direcao direcao){
        this.direcao = direcao;
    }

    //Retornando o valor do atributo direcao
    public Direcao getDirecao(){
        return this.direcao;
    }
}
