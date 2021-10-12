package EjercicioEXTRA01;

/**
 *
 * @author d.andresperalta
 */
public class Numero {

    Integer num;

    public Numero() {
    }

    public Numero(Integer num) {
        this.num = num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Numero{" + "num=" + num + '}';
    }

}
