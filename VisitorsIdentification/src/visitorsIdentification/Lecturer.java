package visitorsIdentification;

/**
 * Created by Администратор on 16.01.2017.
 */
public class Lecturer extends Visitors {
    private String post;
    private String kafedra;
    private boolean allowance = false; // допуск

    public Lecturer(String name, String post, String kafedra) {
        super(name);
        this.post = post;
        this.kafedra = kafedra;
    }

    @Override
    public void setAllowance(boolean allowance) {
        this.allowance = allowance;
    }

    @Override
    public boolean isCanEnter() {
        return allowance;
    }

}
