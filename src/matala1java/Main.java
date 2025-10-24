package matala1java;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Command> commands = new HashMap<>();
        commands.put(1, new AddSellerCommand(admin, scanner));
        commands.put(2, new AddBuyerCommand(admin, scanner));
        commands.put(3, new AddProductToSellerCommand(admin, scanner));
        commands.put(4, new AddProductToBuyerCommand(admin, scanner));
        commands.put(5, new PayForBuyersCartCommand(admin, scanner));
        commands.put(6, new DisplayBuyersCommand(admin));
        commands.put(7, new DisplaySellersCommand(admin));
        commands.put(8, new DisplayProductsFromCategoryCommand(admin, scanner));
        commands.put(9, new ChooseAnOldCartToAddCommand(admin, scanner));
        commands.put(10, new AutoFillCommand(admin));
        commands.put(99, new PrintAllNamesCommand(admin));
        commands.put(100, new CopyNamesCommand(admin));
        commands.put(101, new CountUniqueNamesCommand(admin));
        commands.put(102, new PrintReversedCommand(admin));
        commands.put(103, new SortSellersByUserNameCommand(admin));
        // Add more commands as needed

        int choice;
        do {
            printMenu();
            choice = getUserChoice(scanner);

            if (commands.containsKey(choice)) {
                commands.get(choice).execute();
            } else if (choice != 0) {
                System.out.println("Invalid choice, try again.");
            }
        } while (choice != 0);

        System.out.println("End Program :)");
    }

    private static void printMenu() {
        System.out.println("0 - Exit");
        System.out.println("1 - Add Seller");
        System.out.println("2 - Add Buyer");
        System.out.println("3 - Add product to seller");
        System.out.println("4 - Add product to buyer");
        System.out.println("5 - Pay For a Buyers Cart");
        System.out.println("6 - Show Buyers Details");
        System.out.println("7 - Show Sellers Details");
        System.out.println("8 - Choose Category to show products from");
        System.out.println("9 - Replace your current cart");
        System.out.println("10 - Auto fill details");
        System.out.println("99 - Print all names");
        System.out.println("100 - Count unique names");
        System.out.println("101 - Check name count");
        System.out.println("102 - Print reversed twice");
        System.out.println("103 - Sort sellers by userName length");
        System.out.print("Enter Choice : ");
    }

    private static int getUserChoice(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, enter a number.");
            }
        }
    }


    public static int changeToInt(String choice) throws WrongInput {
        try {
            return Integer.parseInt(choice);
        } catch (NumberFormatException e) {
            throw new WrongInput("invalid Choice , Enter a New one :");
        }

    }
}



