package visitorsIdentification;

/**
 * Created by Администратор on 16.01.2017.
 */
public class Guest extends Visitors {
    private boolean allowance = false; // допуск

    public Guest(String name) {
        super(name);
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
