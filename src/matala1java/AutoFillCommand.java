package matala1java;

public class AutoFillCommand implements Command {
    private final Admin admin;
    public AutoFillCommand(Admin admin) {
        this.admin = admin;
    }
    @Override
    public void execute() {
        admin.autoFill();
    }
}
