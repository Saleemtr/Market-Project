package matala1java;
class CopyNamesCommand implements Command {
    private final Admin admin;

    public CopyNamesCommand(Admin admin) {
        this.admin = admin;
    }

    @Override
    public void execute() {
        admin.copyNames();
    }
}
