package matala1java;

public class PrintReversedCommand implements Command {
    private final Admin admin;

    public PrintReversedCommand (Admin admin) {
        this.admin = admin;
    }

    @Override
    public void execute() {
        admin.printReversedNames();
    }
}