package visitorsIdentification;

/**
 * Created by Администратор on 16.01.2017.
 */
public class Checker {

    private String visitors[]; // посетители
    // работники и студенты
    protected String regVisitors[] = {"Петя", "Маша", "Нина", "Вика", "Евлампий", "Олег", "Евкакий"};


    public Checker(int n) {
        visitors = new String[n];
    }


    private void addToList(String name) {
        for (int i = 0; i < visitors.length; i++) {
            if (visitors[i] == null) {
                visitors[i] = name;
                break;
            }
        }
    }

    public void showVisitorsList() {
        System.out.println("\nСписок посетителей:\n");
        for (String x : visitors) {
            if (x == null) {
                break;
            }
            System.out.print(x + "  ");
        }
        System.out.println("\nКонец списка");
    }


    public boolean check(Visitors visitor) {
        if (visitor.isCanEnter()) {
            addToList(visitor.getName());
            return true;
        }

        for (String x : regVisitors) {
            if (x.equals(visitor.getName())) {
                visitor.setAllowance(true);
                addToList(visitor.getName());
                return true;
            }
        }
        return false;
    }
}
