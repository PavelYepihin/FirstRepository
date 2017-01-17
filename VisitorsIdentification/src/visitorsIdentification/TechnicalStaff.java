package visitorsIdentification;

/**
 * Created by Администратор on 16.01.2017.
 */
public class TechnicalStaff extends Visitors {
    private boolean allowance = false; // допуск

    public TechnicalStaff(String name) {
        super(name);
    }

    public void authorization(Guest guest) {
        guest.setAllowance(true);
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
