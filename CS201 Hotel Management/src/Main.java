import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

class Food {
    int itemno;
    int quantity;
    float price;

    Food(int itemno, int quantity) {
        this.itemno = itemno;
        this.quantity = quantity;
        switch (itemno) {
            case 1:
                price = quantity * 50;
                break;
            case 2:
                price = quantity * 60;
                break;
            case 3:
                price = quantity * 70;
                break;
            case 4:
                price = quantity * 30;
                break;
        }
    }
}

class Hotel2 {
    @SuppressWarnings("static-access")
    static void Main2() {

        Scanner sc = new Scanner(System.in);
        Food1 food = new Food1();
        System.out.println("Press the assigned number for menu and ordering");
        System.out.println("1.Breakfast \n2.Lunch \n3.Dinner");
        int ch = sc.nextInt();
        int item = 0;
        int quantity = 0;
        switch (ch) {
            case 1:
                food.BreakfastMenu();
                System.out.println("Enter Item number");
                item = sc.nextInt();
                System.out.println("Enter Quantity");
                quantity = sc.nextInt();
                food.Breakfast(item, quantity);
                break;
            case 2:
                food.LunchMenu();
                System.out.println("Enter Item number");
                item = sc.nextInt();
                System.out.println("Enter Quantity");
                quantity = sc.nextInt();
                food.Lunch(item, quantity);
                break;
            case 3:
                food.DinnerMenu();
                System.out.println("Enter Item number");
                item = sc.nextInt();
                System.out.println("Enter Quantity");
                quantity = sc.nextInt();
                food.Dinner(item, quantity);
                break;
            default:
                System.out.println("invalid option");
        }


    }

}

class Food1 extends Menu {


    static int total = 0;

    public static void Breakfast(int Item, int quantity) {
        int price = 0;
        String str = "";
        switch (Item) {
            case 1:
                price = quantity * 60;
                break;
            case 2:
                price = quantity * 90;
                break;
            default:
                System.out.println("No such Item");
                break;
        }
        total += price;
        if (Item == 1)
            str = "Dosa";
        else
            str = "Pancake";

        showBill(str, total, quantity);

    }

    static void Lunch(int Item, int quantity) {
        int price = 0;
        String str = "";
        switch (Item) {
            case 1:
                price = quantity * 60;
                break;
            case 2:
                price = quantity * 90;
                break;
            default:
                System.out.println("No such Item");
                break;
        }
        total += price;
        if (Item == 1)
            str = "Biriyani";
        else
            str = "Pav Bhaji";

        showBill(str, total, quantity);
    }

    static void Dinner(int Item, int quantity) {
        int price = 0;
        String str = "";
        switch (Item) {
            case 1:
                price = quantity * 60;
                break;
            case 2:
                price = quantity * 90;
                break;
            default:
                System.out.println("No such Item");
                break;
        }
        total += price;
        if (Item == 1)
            str = "Galouti Kebab";
        else
            str = "Malabar Prawn Curry & Tortoli";

        showBill(str, total, quantity);
    }

    static void showBill(String item, int total, int quantity) {
        System.out.println("The item ordered is: " + item);
        System.out.println("----------------------------------------");
        System.out.println("The total  quantity is: " + quantity);
        System.out.println("----------------------------------------");
        System.out.println("The total amount is: " + total);
    }

}


abstract class Menu {

    static void BreakfastMenu() {
        System.out.println("Press the assigned number for the food");
        System.out.println("1. Dosa \n2. Pancake");
//		Food.Breakfast(item, quantity);
    }

    static void LunchMenu() {
        System.out.println("Press the assigned number for the food");
        System.out.println("1. Biriyani \n2. Pav Bhaji");
//		Food.Lunch(item, quantity);
    }

    static void DinnerMenu() {
        System.out.println("Press the assigned number for the food");
        System.out.println("1. Galouti Kebab \n2. Malabar Prawn Curry & Tortoli");
//		Food.Dinner(item, quantity);
    }
}

class Gaming {
    int gameno;
    int hour;
    float price;

    Gaming(int gameno, int hour) {
        this.gameno = gameno;
        this.hour = hour;
        switch (gameno) {
            case 1:
                price = hour * 399;
                break;
            case 2:
                price = hour * 499;
                break;
            case 3:
                price = hour * 599;
                break;
            case 4:
                price = hour * 699;
                break;
        }
    }
}

class Singleroom {
    String name;
    String contact;
    String gender;
    ArrayList<Food> food = new ArrayList<>();
    ArrayList<Gaming> game = new ArrayList<>();

    Singleroom() {
        this.name = "";
    }

    Singleroom(String name, String contact, String gender) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
    }
}

class Doubleroom extends Singleroom {
    String name2;
    String contact2;
    String gender2;

    Doubleroom(String name, String contact, String gender, String name2, String contact2, String gender2) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
        this.name2 = name2;
        this.contact2 = contact2;
        this.gender2 = gender2;
    }
}

class NotAvailable extends Exception {
    @Override
    public String toString() {
        return "Not Available !";
    }
}

class holder //implements Serializable
{
    Doubleroom[] luxury_doublerrom = new Doubleroom[10]; //Luxury
    Doubleroom[] deluxe_doublerrom = new Doubleroom[20]; //Deluxe
    Singleroom[] luxury_singleerrom = new Singleroom[10]; //Luxury
    Singleroom[] deluxe_singleerrom = new Singleroom[20]; //Deluxe
}

class Hotel {
    static holder hotel_ob = new holder();
    static Scanner sc = new Scanner(System.in);

    static void CustDetails(int i, int rn) {
        String name, contact, gender;
        String name2 = null, contact2 = null;
        String gender2 = "";
        System.out.print("\nEnter customer name: ");
        name = sc.next();
        System.out.print("Enter contact number: ");
        contact = sc.next();
        System.out.print("Enter gender: ");
        gender = sc.next();
        if (i < 3) {
            System.out.print("Enter second customer name: ");
            name2 = sc.next();
            System.out.print("Enter contact number: ");
            contact2 = sc.next();
            System.out.print("Enter gender: ");
            gender2 = sc.next();
        }

        switch (i) {
            case 1:
                hotel_ob.luxury_doublerrom[rn] = new Doubleroom(name, contact, gender, name2, contact2, gender2);
                break;
            case 2:
                hotel_ob.deluxe_doublerrom[rn] = new Doubleroom(name, contact, gender, name2, contact2, gender2);
                break;
            case 3:
                hotel_ob.luxury_singleerrom[rn] = new Singleroom(name, contact, gender);
                break;
            case 4:
                hotel_ob.deluxe_singleerrom[rn] = new Singleroom(name, contact, gender);
                break;
            default:
                System.out.println("Wrong option");
                break;
        }
    }

    static void bookroom(int i) {
        int j;
        int rn;
        System.out.println("\nChoose room number from : ");
        switch (i) {
            case 1:
                for (j = 0; j < hotel_ob.luxury_doublerrom.length; j++) {
                    if (hotel_ob.luxury_doublerrom[j] == null) {
                        System.out.print(j + 1 + ",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try {
                    rn = sc.nextInt();
                    rn--;
                    if (hotel_ob.luxury_doublerrom[rn] != null)
                        throw new NotAvailable();
                    CustDetails(i, rn);
                } catch (Exception e) {
                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 2:
                for (j = 0; j < hotel_ob.deluxe_doublerrom.length; j++) {
                    if (hotel_ob.deluxe_doublerrom[j] == null) {
                        System.out.print(j + 11 + ",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try {
                    rn = sc.nextInt();
                    rn = rn - 11;
                    if (hotel_ob.deluxe_doublerrom[rn] != null)
                        throw new NotAvailable();
                    CustDetails(i, rn);
                } catch (Exception e) {
                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 3:
                for (j = 0; j < hotel_ob.luxury_singleerrom.length; j++) {
                    if (hotel_ob.luxury_singleerrom[j] == null) {
                        System.out.print(j + 31 + ",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try {
                    rn = sc.nextInt();
                    rn = rn - 31;
                    if (hotel_ob.luxury_singleerrom[rn] != null)
                        throw new NotAvailable();
                    CustDetails(i, rn);
                } catch (Exception e) {
                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 4:
                for (j = 0; j < hotel_ob.deluxe_singleerrom.length; j++) {
                    if (hotel_ob.deluxe_singleerrom[j] == null) {
                        System.out.print(j + 41 + ",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try {
                    rn = sc.nextInt();
                    rn = rn - 41;
                    if (hotel_ob.deluxe_singleerrom[rn] != null)
                        throw new NotAvailable();
                    CustDetails(i, rn);
                } catch (Exception e) {
                    System.out.println("Invalid Option");
                    return;
                }
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
        System.out.println("Room Booked");
    }

    static void features(int i) {
        switch (i) {
            case 1:
                System.out.println("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:4000 ");
                break;
            case 2:
                System.out.println("Number of double beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:3000  ");
                break;
            case 3:
                System.out.println("Number of single beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:2200  ");
                break;
            case 4:
                System.out.println("Number of single beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:1200 ");
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
    }

    static void availability(int i) {
        int j, count = 0;
        switch (i) {
            case 1:
                for (j = 0; j < 10; j++) {
                    if (hotel_ob.luxury_doublerrom[j] == null)
                        count++;
                }
                break;
            case 2:
                for (j = 0; j < hotel_ob.deluxe_doublerrom.length; j++) {
                    if (hotel_ob.deluxe_doublerrom[j] == null)
                        count++;
                }
                break;
            case 3:
                for (j = 0; j < hotel_ob.luxury_singleerrom.length; j++) {
                    if (hotel_ob.luxury_singleerrom[j] == null)
                        count++;
                }
                break;
            case 4:
                for (j = 0; j < hotel_ob.deluxe_singleerrom.length; j++) {
                    if (hotel_ob.deluxe_singleerrom[j] == null)
                        count++;
                }
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
        System.out.println("Number of rooms available : " + count);
    }

    static void bill(int rn, int rtype) {
        double amount = 0;
        String[] list1 = {"Sandwich", "Pasta", "Noodles", "Coke"};
        String[] list2 = {"Car racing", "Bike racing", "Shooting game", "Ludo"};
        System.out.println("\n \t \t **");
        System.out.println(" \t \t Bill:-");
        System.out.println(" \t \t **");

        switch (rtype) {
            case 1:
                amount += 4000;
                System.out.println("\nRoom Charge - " + 4000);
                System.out.println("\n===============");
                System.out.println("Food Charges:- ");
                System.out.println("===============");
                System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                for (Food obb : hotel_ob.luxury_doublerrom[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list1[obb.itemno - 1], obb.quantity, obb.price);
                }
                System.out.println("Gaming Charges:- ");
                System.out.println("===============");
                System.out.println("Game      Hour       Price");
                System.out.println("-------------------------");
                for (Gaming obb : hotel_ob.luxury_doublerrom[rn].game) {
                    amount += obb.price;
                    String format = "%-15s%-10s%-6s%n";
                    System.out.printf(format, list2[obb.gameno - 1], obb.hour, obb.price);
                }
                Review();
                break;
            case 2:
                amount += 3000;
                System.out.println("Room Charge - " + 3000);
                System.out.println("\nFood Charges:- ");
                System.out.println("===============");
                System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                for (Food obb : hotel_ob.deluxe_doublerrom[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list1[obb.itemno - 1], obb.quantity, obb.price);
                }
                System.out.println("Gaming Charges:- ");
                System.out.println("===============");
                System.out.println("Game      Hour      Price");
                System.out.println("-------------------------");
                for (Gaming obb : hotel_ob.deluxe_doublerrom[rn].game) {
                    amount += obb.price;
                    String format = "%-15s%-10s%-6s%n";
                    System.out.printf(format, list2[obb.gameno - 1], obb.hour, obb.price);
                }
                Review();
                break;
            case 3:
                amount += 2200;
                System.out.println("Room Charge - " + 2200);
                System.out.println("\nFood Charges:- ");
                System.out.println("===============");
                System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                for (Food obb : hotel_ob.luxury_singleerrom[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list1[obb.itemno - 1], obb.quantity, obb.price);
                }
                System.out.println("Gaming Charges:- ");
                System.out.println("===============");
                System.out.println("Game          Hour         Price");
                System.out.println("---------------------------------");
                for (Gaming obb : hotel_ob.luxury_singleerrom[rn].game) {
                    amount += obb.price;
                    String format = "%-15s%-10s%-6s%n";
                    System.out.printf(format, list2[obb.gameno - 1], obb.hour, obb.price);
                }
                Review();
                break;
            case 4:
                amount += 1200;
                System.out.println("Room Charge - " + 1200);
                System.out.println("\nFood Charges:- ");
                System.out.println("===============");
                System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                for (Food obb : hotel_ob.deluxe_singleerrom[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list1[obb.itemno - 1], obb.quantity, obb.price);
                }
                System.out.println(" ");
                System.out.println("Gaming Charges:- ");
                System.out.println("================");
                System.out.println("Game             Hour          Price");
                System.out.println("----------------------------------");
                for (Gaming obb : hotel_ob.deluxe_singleerrom[rn].game) {
                    amount += obb.price;
                    String format = "%-15s%-10s%-6s%n";
                    System.out.printf(format, list2[obb.gameno - 1], obb.hour, obb.price);
                }
                Review();
                break;
            default:
                System.out.println("Not valid");
        }
        System.out.println("\nTotal Amount- " + amount);
    }

    static void Review() {
        System.out.println("\n \n Would you like to give a review  (Y/N)");
        char ch = sc.next().charAt(0);
        if (ch == 'y' || ch == 'Y') {
            System.out.println("Please wirte :");
            String rev = sc.next();
            System.out.print("How would you rate our servises :");
            System.out.println("out of 5 :");
            int star = sc.nextInt();
            System.out.println("Thank you So Much For giving us " + star);
        } else {
            System.out.println("Thank you So much");
        }
    }

    static void deallocate(int rn, int rtype) {
        char w;
        switch (rtype) {
            case 1 -> {
                if (hotel_ob.luxury_doublerrom[rn] != null)
                    System.out.println("Room used by " + hotel_ob.luxury_doublerrom[rn].name);
                else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println("Do you want to checkout ?(y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    bill(rn, rtype);

                    hotel_ob.luxury_doublerrom[rn] = null;
                    System.out.println("Deallocated succesfully");
                }
            }
            case 2 -> {
                if (hotel_ob.deluxe_doublerrom[rn] != null)
                    System.out.println("Room used by " + hotel_ob.deluxe_doublerrom[rn].name);
                else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println("Do you want to checkout ?(y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    bill(rn, rtype);

                    hotel_ob.deluxe_doublerrom[rn] = null;
                    System.out.println("Deallocated succesfully");
                }
            }
            case 3 -> {
                if (hotel_ob.luxury_singleerrom[rn] != null)
                    System.out.println("Room used by " + hotel_ob.luxury_singleerrom[rn].name);
                else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println("Do you want to checkout ? (y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    bill(rn, rtype);

                    hotel_ob.luxury_singleerrom[rn] = null;
                    System.out.println("Deallocated succesfully");
                }
            }
            case 4 -> {
                if (hotel_ob.deluxe_singleerrom[rn] != null)
                    System.out.println("Room used by " + hotel_ob.deluxe_singleerrom[rn].name);
                else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println("Do you want to checkout ? (y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    bill(rn, rtype);
                    hotel_ob.deluxe_singleerrom[rn] = null;
                    System.out.println("Deallocated succesfully");
                }
            }
            default -> System.out.println("\nEnter valid option : ");
        }
    }

    static void gamearea(int rn, int rtype) {
        int i, q;
        char wish;
        try {
            System.out.println("\n  ==============\n   Game Options:  \n  ==============\n\n1.Car racing\tRs.399\n2.Bike racing\tRs.499\n3.Shooting game\tRs.599\n4.Ludo\t\t\tRs.699\n");
            do {
                i = sc.nextInt();
                System.out.print("Hour(s)- ");
                q = sc.nextInt();

                switch (rtype) {
                    case 1 -> hotel_ob.luxury_doublerrom[rn].game.add(new Gaming(i, q));
                    case 2 -> hotel_ob.deluxe_doublerrom[rn].game.add(new Gaming(i, q));
                    case 3 -> hotel_ob.luxury_singleerrom[rn].game.add(new Gaming(i, q));
                    case 4 -> hotel_ob.deluxe_singleerrom[rn].game.add(new Gaming(i, q));
                }
                System.out.println("Do you want to play anything else ? (y/n)");
                wish = sc.next().charAt(0);
            } while (wish == 'y' || wish == 'Y');
        } catch (NullPointerException e) {
            System.out.println("\nRoom not booked");
        } catch (Exception e) {
            System.out.println("Cannot be done");
        }
    }

    static void order(int rn, int rtype) {
        int i, q;
        char wish;
        try {
            System.out.println("\n==========\n   Menu:  \n==========\n\n1.Sandwich\tRs.50\n2.Pasta\t\tRs.60\n3.Noodles\tRs.70\n4.Coke\t\tRs.30\n");
            do {
                i = sc.nextInt();
                System.out.print("Quantity- ");
                q = sc.nextInt();

                switch (rtype) {
                    case 1:
                        hotel_ob.luxury_doublerrom[rn].food.add(new Food(i, q));
                        break;
                    case 2:
                        hotel_ob.deluxe_doublerrom[rn].food.add(new Food(i, q));
                        break;
                    case 3:
                        hotel_ob.luxury_singleerrom[rn].food.add(new Food(i, q));
                        break;
                    case 4:
                        hotel_ob.deluxe_singleerrom[rn].food.add(new Food(i, q));
                        break;
                }
                System.out.println("Do you want to order anything else ? (y/n)");
                wish = sc.next().charAt(0);
            } while (wish == 'y' || wish == 'Y');
        } catch (NullPointerException e) {
            System.out.println("\nRoom not booked");
        } catch (Exception e) {
            System.out.println("Cannot be done");
        }
    }
}


class Project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch, ch2;
        char wish;
        x:
        do {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("-----WELCOME TO GRAND PLAZA HOTEL-----");
            System.out.println("    ==============================");

            System.out.println("\nEnter your choice :\n1.Display room details\n2.Display room availability \n3.Book\n4.Order food\n5.Checkout\n6.Gaming \n7. Outside Restaurant \n8.Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room \n4.Deluxe Single Room\n");
                    ch2 = sc.nextInt();
                    Hotel.features(ch2);
                    break;
                case 2:
                    System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
                    ch2 = sc.nextInt();
                    Hotel.availability(ch2);
                    break;
                case 3:
                    System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
                    ch2 = sc.nextInt();
                    Hotel.bookroom(ch2);
                    break;
                case 4:
                    System.out.print("Room Number -");
                    ch2 = sc.nextInt();
                    if (ch2 > 60)
                        System.out.println("Room doesn't exist");
                    else if (ch2 > 40)
                        Hotel.order(ch2 - 41, 4);
                    else if (ch2 > 30)
                        Hotel.order(ch2 - 31, 3);
                    else if (ch2 > 10)
                        Hotel.order(ch2 - 11, 2);
                    else if (ch2 > 0)
                        Hotel.order(ch2 - 1, 1);
                    else
                        System.out.println("Room doesn't exist");
                    break;
                case 5:
                    System.out.print("Room Number -");
                    ch2 = sc.nextInt();
                    if (ch2 > 60)
                        System.out.println("Room doesn't exist");
                    else if (ch2 > 40)
                        Hotel.deallocate(ch2 - 41, 4);
                    else if (ch2 > 30)
                        Hotel.deallocate(ch2 - 31, 3);
                    else if (ch2 > 10)
                        Hotel.deallocate(ch2 - 11, 2);
                    else if (ch2 > 0)
                        Hotel.deallocate(ch2 - 1, 1);
                    else
                        System.out.println("Room doesn't exist");
                    break;
                case 6:
                    System.out.print("Room Number -");
                    ch2 = sc.nextInt();
                    if (ch2 > 60)
                        System.out.println("Room doesn't exist");
                    else if (ch2 > 40)
                        Hotel.gamearea(ch2 - 41, 4);
                    else if (ch2 > 30)
                        Hotel.gamearea(ch2 - 31, 3);
                    else if (ch2 > 10)
                        Hotel.gamearea(ch2 - 11, 2);
                    else if (ch2 > 0)
                        Hotel.gamearea(ch2 - 1, 1);
                    else
                        System.out.println("Room doesn't exist");
                    break;
                case 7:
                    System.out.println("Welcome to Restaurant ");
                    Hotel2.Main2();
                    break;
                case 8:
                    break;

            }

            System.out.println("\nContinue : (y/n)");
            wish = sc.next().charAt(0);
            if (!(wish == 'y' || wish == 'Y' || wish == 'n' || wish == 'N')) {
                System.out.println("Invalid Option");
                System.out.println("\033[H\033[2J");
                System.out.flush();
                System.out.println("\nContinue : (y/n)");
                wish = sc.next().charAt(0);
            }

        } while (wish == 'y' || wish == 'Y');

    }

}