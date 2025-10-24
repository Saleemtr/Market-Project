package matala1java;
import java.util.Scanner;

class AddBuyerCommand implements Command {
    private final Admin admin;
    private final Scanner scanner;

    public AddBuyerCommand(Admin admin, Scanner scanner) {
        this.admin = admin;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        Admin.AddBuyer(scanner);
    }
}
