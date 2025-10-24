package matala1java;
import java.util.Scanner;
class AddSellerCommand implements Command {
    private final Admin admin;
    private final Scanner scanner;

    public AddSellerCommand(Admin admin, Scanner scanner) {
        this.admin = admin;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        admin.AddSeller(scanner);
    }
}

