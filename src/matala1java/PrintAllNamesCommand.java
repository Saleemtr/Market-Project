package matala1java;
import java.util.List;

public class PrintAllNamesCommand implements Command {
    private final Admin admin;

    public PrintAllNamesCommand(Admin admin) {
        this.admin = admin;
    }

    @Override
    public void execute() {
        admin.printAllNames();
    }
}