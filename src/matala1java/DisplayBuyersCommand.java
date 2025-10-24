package matala1java;

class DisplayBuyersCommand implements Command {
    private final Admin admin;

    public DisplayBuyersCommand(Admin admin) {
        this.admin = admin;
    }

    @Override
    public void execute() {
        admin.DisplayBuyers();
    }
}