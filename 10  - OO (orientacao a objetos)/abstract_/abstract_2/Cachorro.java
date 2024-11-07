package abstract_.abstract_2;

public class Cachorro extends Animal {

    // por não ser uma classe abstrata, preciso obrigatoriamente implementar todos os métodos abstratos

    @Override
    public String mover() {
        return "Usando patas"; // apenas para exemplo rs
    }


    // No entanto, posso sobreescrever os demais métodos se quiser também
    @Override
    public String respirar() {
        return super.respirar();
    }
}
