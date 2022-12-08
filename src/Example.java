public class Example {
    private int s; // Приватная переменная

    // Сеттер, он устанавливает значение переменной
    public void setS(int s){
        if(s==0)
            this.s=-100;
        else
            this.s=s;
    }

    // Геттер, он получается значение переменной
    public int getS(){
        return s;
    }
}