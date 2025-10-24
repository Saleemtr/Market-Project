package matala1java;

import java.util.Scanner;

public class AddProductToBuyerCommand implements Command {
    private final Admin admin;
    private final Scanner scanner;
    public AddProductToBuyerCommand(Admin admin, Scanner scanner) {
        this.admin = admin;
        this.scanner = scanner;
    }
    @Override
    public void execute() {
        admin.AddProductToBuyer(scanner);
    }
}
