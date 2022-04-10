package robo3XY;


public class RoboChar {
    private char direcao; //Criando o atributo de classe de caractere único
    private int posicaoX, posicaoY;

    public String mostrarPosicaoAtual(){
        return "\nDirecao Atual: "+this.direcao+"\nPosição x:"+this.posicaoX+"\nPosição Y: "+this.posicaoY;
    }

    //Verificando e configurando o valor do atributo "direcao"
    public void setDirecao(char direcao){
        switch (direcao){
            case 'N':
                this.direcao = direcao;
                this.posicaoY++;
                break;
            case 'S':
                this.direcao = direcao;
                this.posicaoY--;
                break;
            case 'L':
                this.direcao = direcao;
                this.posicaoX++;
                break;
            case 'O':
                this.direcao = direcao;
                this.posicaoX--;
                break;
            default:
                System.out.println("\nDireção Inválida");
        }

    }

    //Retornando o valor do atributo direcao
    public char getDirecao(){
        return this.direcao;
    }
}
