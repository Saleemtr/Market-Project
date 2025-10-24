package matala1java;

import java.util.Scanner;

public class DisplayProductsFromCategoryCommand implements Command {
    private final Admin admin;
    private final Scanner scanner;
    public DisplayProductsFromCategoryCommand(Admin admin, Scanner scanner) {
        this.admin = admin;
        this.scanner = scanner;
    }
    @Override
    public void execute() {
        admin.displayProductsFromCategory(scanner);
    }
}
