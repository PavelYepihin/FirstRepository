package visitorsIdentification;

/**
 * Created by Администратор on 16.01.2017.
 */
public abstract class Visitors {
    private String name;

    public Visitors(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public abstract void setAllowance(boolean allowance);
    public abstract boolean isCanEnter();
}
