package matala1java;

import java.util.Scanner;

public class ChooseAnOldCartToAddCommand implements Command {
    private final Admin admin;
    private final Scanner scanner;
    public ChooseAnOldCartToAddCommand(Admin admin, Scanner scanner) {
        this.admin = admin;
        this.scanner = scanner;
    }
    @Override
    public void execute() {
        admin.chooseAnOldCartToAdd(scanner);
    }

}
