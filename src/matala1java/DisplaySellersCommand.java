package matala1java;
class DisplaySellersCommand implements Command {
    private final Admin admin;

    public DisplaySellersCommand(Admin admin) {
        this.admin = admin;
    }

    @Override
    public void execute() {
        admin.DisplaySellers();
    }
}
