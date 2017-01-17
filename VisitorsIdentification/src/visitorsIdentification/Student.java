package visitorsIdentification;

/**
 * Created by Администратор on 16.01.2017.
 */
public class Student extends Visitors {
    private String group;
    private boolean allowance = false; // допуск

    public Student(String name,String group) {
        super(name);
        this.group = group;
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
