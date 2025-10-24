package matala1java;

import java.util.Scanner;

public class PayForBuyersCartCommand implements Command {
    private final Admin admin;
    private final Scanner scanner;
    public PayForBuyersCartCommand(Admin admin, Scanner scanner) {
        this.admin = admin;
        this.scanner = scanner;
    }
    @Override
    public void execute() {
        admin.PayForBuyersCart(scanner);
    }
}
