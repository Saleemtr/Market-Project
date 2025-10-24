package matala1java;

class SortSellersByUserNameCommand implements Command {
    private final Admin admin;

    public SortSellersByUserNameCommand(Admin admin) {
        this.admin = admin;
    }

    @Override
    public void execute() {
        admin.sortArraysByUserName();
    }
}
