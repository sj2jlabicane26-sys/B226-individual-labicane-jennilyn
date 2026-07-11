package day19.discussion;

import java.util.Scanner;

public class LoadReg {

    static Scanner scanner = new Scanner(System.in);
    static double balance = 200;

    public static void main(String[] args) {
        while (true) {

            try {
                clearScreen();
                carrierInfo();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number");
                scanner.nextLine();
            }

        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void validateUssdCode() {
        System.out.println("*Dial 123# to access TNT Services");
        System.out.print("Enter USSD code:");
        String ussdCode = scanner.nextLine();

        //Validation
        if (ussdCode.isEmpty() || !ussdCode.equals("123")) {
            System.out.println("Invalid USSD Code. Exiting...");
            System.exit(0);
        }

    }

    public static void carrierInfo() {
        System.out.println("BAL: P" + balance);
        System.out.println("1) Unli Text");
        System.out.println("2) Unli Call");
        System.out.println("3) Unli Call N text");
        System.out.println("4) BOOSTER");
        System.out.println("5) GIGA/ARAW-ARAW DATA");
        System.out.print("Enter a number: ");
        int carrierInfoChoice = scanner.nextInt();

        switch (carrierInfoChoice) {
            case 1:
                unliTextPromo();
                break;
            case 2:
                unliCallPromo();
                break;
            case 3:
                unliCallNText();
                break;
            case 4:
                booster();
                break;
            case 5:
                gigaArawaraw();

        }

    }

    public static void unliTextPromo() {
        System.out.println("**Unlimited Text Promo Choice");
        System.out.println("1) 1 Day for P10");
        System.out.println("2) 3 Days for P30");
        System.out.println("3) 5 Days for P50");
        System.out.println("0) Back");
        System.out.print("Enter Choice:");
        int unliTextPromoChoice = scanner.nextInt();

        switch (unliTextPromoChoice) {
            case 1:
                System.out.println("1 Day for P10");
                break;
            case 2:
                System.out.println("3 Days for P30");
                break;
            case 3:
                System.out.println("5 Days for P50");
                break;
            case 4:
                System.out.println("back");
            default:
                System.out.println("back");
        }

    }

    public static void unliCallPromo() {
        System.out.println("**Unlimited Call Promo Choice");
        System.out.println("1) 1 Day for P10");
        System.out.println("2) 3 Days for P30");
        System.out.println("3) 5 Days for P50");
        System.out.println("0) Back");
        System.out.print("Enter Choice:");
        int unliCallChoice = scanner.nextInt();

        switch (unliCallChoice) {
            case 1:
                System.out.println("1 Day for P10");
                break;
            case 2:
                System.out.println("3 Days for P30");
                break;
            case 3:
                System.out.println("5 Days for P50");
                break;
            case 4:
                System.out.println("back");
            default:
                System.out.println("Invalid Choice!");
        }

    }

    public static void unliCallNText() {
        System.out.println("**Unlimited Call N Text Promo Choice");
        System.out.println("1) 1 Day for P10");
        System.out.println("2) 3 Days for P30");
        System.out.println("3) 5 Days for P50");
        System.out.println("4) Back");
        System.out.print("Enter Choice:");
        int unliCallNTextChoice = scanner.nextInt();

        switch (unliCallNTextChoice) {
            case 1:
                System.out.println("1 Day for P10");
                break;
            case 2:
                System.out.println("3 Days for P30");
                break;
            case 3:
                System.out.println("5 Days for P50");
                break;
            case 4:
                System.out.println("back");
            default:
                System.out.println("Invalid Choice!");
        }

    }

    public static void booster() {

        System.out.println("**Booster Promo Choice");
        System.out.println("1) MAX SAYA");
        System.out.println("2) WATCHAPP");
        System.out.println("0) Back");
        System.out.print("Enter Choice: ");
        int maxSayaWatchAppChoice = scanner.nextInt();

        if (maxSayaWatchAppChoice == 1) {

            System.out.println("MAX SAYA");
            System.out.println("1) 2GB, 1Day, P30");
            System.out.println("0) Back");
            System.out.print("Enter Choice: ");
            int maxSayaChoice = scanner.nextInt();

            if (maxSayaChoice == 1) {
                if (balance >= 30) {
                    balance -= 30;

                    System.out.println("Enjoy HIGH-SPEED DATA for all sites!");
                    System.out.println("2GB, 1Day, P30");
                    System.out.println("Remaining Balance: P" + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }

            } else if (maxSayaChoice == 0) {
                System.out.println("Back");
            } else {
                System.out.println("Invalid Choice");
            }
            System.exit(0);

        } else if (maxSayaWatchAppChoice == 2) {

            System.out.println("WATCHAPP");
            System.out.println("1) Vlogs and Lifestyle Videos, 1Hr P5");
            System.out.println("2) Top Vlogs + more, 2Hrs, P5");
            System.out.println("3) Top Vlogs + more, 3Hrs, P10");
            System.out.println("4) Premium Movie, 12Hrs, P15");
            System.out.println("0) Back");
            System.out.print("Enter Choice: ");
            int watchApp = scanner.nextInt();

            if (watchApp == 1) {

                if (balance >= 5) {
                    balance -= 5;
                    System.out.println("Vlogs and Lifestyle Videos, 1Hr, P5");
                    System.out.println("Remaining Balance: P" + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }

            } else if (watchApp == 2) {

                if (balance >= 5) {
                    balance -= 5;
                    System.out.println("Top Vlogs + more, 2Hrs, P5");
                    System.out.println("Remaining Balance: P" + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }

            } else if (watchApp == 3) {

                if (balance >= 10) {
                    balance -= 10;
                    System.out.println("Top Vlogs + more, 3Hrs, P10");
                    System.out.println("Remaining Balance: P" + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }

            } else if (watchApp == 4) {

                if (balance >= 15) {
                    balance -= 15;
                    System.out.println("Premium Movie, 12Hrs, P15");
                    System.out.println("Remaining Balance: P" + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }

            } else if (watchApp == 0) {

                System.out.println("Back");

            } else {

                System.out.println("Invalid Choice!");

            }
            System.exit(0);
        }
    }

    public static void gigaArawaraw() {

        System.out.println("**GIGA ARAW-ARAW Promo Choice**");
        System.out.println("1) GIGA");
        System.out.println("2) ARAW-ARAW DATA");
        System.out.println("0) Back");
        System.out.print("Enter Choice: ");
        int gigaArawarawChoice = scanner.nextInt();

        if (gigaArawarawChoice == 1) {

            System.out.println("GIGA");
            System.out.println("1) Double Giga Video+75 P75");
            System.out.println("2) Double Giga Stories+75 P75");
            System.out.println("3) Double Giga Video+149 P149");
            System.out.println("0) Back");
            System.out.print("Enter Choice: ");
            int gigaChoice = scanner.nextInt();

            if (gigaChoice == 1) {
                if (balance >= 75) {
                    balance -= 75;
                    System.out.println("TNT TOTAL 9 GB: 2 GB VIDEO ARAW-ARAW para sa Youtube,Netflex (6GB)"
                            + "+ 3 GB + UNLI CALLS & TEXT for 3 days" + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }

            } else if (gigaChoice == 2) {
                if (balance >= 75) {
                    balance -= 75;
                    System.out.println("TNT TOTAL 9 GB: 2 GB STORIES ARAW-ARAW para sa Youtube,Netflex (6GB)"
                            + "+ 3 GB + UNLI CALLS & TEXT for 3 days" + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }

            } else if (gigaChoice == 3) {
                if (balance >= 149) {
                    balance -= 149;
                    System.out.println("TNT TOTAL 20 GB: 2 GB VIDEO ARAW-ARAW para sa Youtube,Netflex (14GB)"
                            + "+ 3 GB + UNLI CALLS & TEXT for 3 days" + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }

            } else if (gigaChoice == 0) {
                System.out.println("Back");
            } else {
                System.out.println("Invalid Choice");
            }
            System.exit(0);

        } else if (gigaArawarawChoice == 2) {

            System.out.println("ARAW-ARAW DATA");
            System.out.println("1) 1GB per day for 3 DAYS P50");
            System.out.println("2) 1..5 GB per day for 3 DAYS P75");
            System.out.println("3) 1 GB per day for 7 DAYS P105");
            System.out.println("0) Back");
            System.out.print("Enter Choice: ");
            int watchApp = scanner.nextInt();

            if (watchApp == 1) {

                if (balance >= 50) {
                    balance -= 50;
                    System.out.println("TNT 1 GB per day (Total 3GB) with 5 Mins Calls to Mobile + 50 Texts for 3 days");
                    System.out.println("Remaining Balance: P" + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }

            } else if (watchApp == 2) {

                if (balance >= 75) {
                    balance -= 75;
                    System.out.println("TNT 1.5 GB per day (Total 4.5GB) with 5 Mins Calls to Mobile + 50 Texts for 3 days");
                    System.out.println("Remaining Balance: P" + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }

            } else if (watchApp == 3) {

                if (balance >= 105) {
                    balance -= 105;
                    System.out.println("TNT 1 GB per day (Total 7GB) with 10 Mins Calls to Mobile + 100 Texts for 7 days");
                    System.out.println("Remaining Balance: P" + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }  System.exit(0);

            } else if (watchApp == 0) {

                System.out.println("Back");

            } else {

                System.out.println("Invalid Choice!");

            }  
        }

    }
}
