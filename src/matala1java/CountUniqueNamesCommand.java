package matala1java;
import java.util.Scanner;
class CountUniqueNamesCommand implements Command {
    private final Admin admin;

    public CountUniqueNamesCommand(Admin admin) {
        this.admin = admin;
    }

    @Override
    public void execute() {
        admin.countName(new Scanner(System.in));
    }
}