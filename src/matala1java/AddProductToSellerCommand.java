package matala1java;

import java.util.Scanner;

public class AddProductToSellerCommand implements Command {
    private final Admin admin;
    private final Scanner scanner;

    public AddProductToSellerCommand(Admin admin, Scanner scanner) {
        this.admin = admin;
        this.scanner = scanner;
    }
    @Override
    public void execute() {
        admin.AddProductToSeller(scanner);
    }
}
