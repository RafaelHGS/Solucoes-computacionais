package projetogarrafa;

public class Garrafa {
    private String cor, material;
    private float preco;

    //material
    public void setMaterial(String material){
        this.material = material;
    }

    public String getMaterial(){
        return this.material;
    }

    //cor
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }

    //preco
    public void setPreco(float preco){
        this.preco = preco;
    }

    public float getPreco(){
        return this.preco;
    }

    public void Beber(){
        System.out.println("Bebendo Garrafa");
    }

}
