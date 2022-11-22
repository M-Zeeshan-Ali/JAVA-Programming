package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CWZEE_GuestAddingProgram {

  //  public class AddingGuest {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> guestlist = new ArrayList<>();
            guestlist.add("Michael Orwell");
            // guestlist.add("Veronika O'Neill");
            //  guestlist.add("Lester Wilcox");
            //  guestlist.add("Justine Oakley");
            //  guestlist.add("Rylan Tempest");

            do {
                System.out.println("\n=== GUEST LIST ===");
                for (int i = 0; i < guestlist.size(); i++) {
                    System.out.printf("%d | %s\n", (i + 1), guestlist.get(i));
                }

                System.out.println("\n--- MENU ---");
                System.out.println("1: Add Guest\n2: Insert Guest\n3: Rename Guest\n4: Remove Guest\n5: Exit");
                System.out.print("Option: ");
                int option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 1:
                        System.out.print("Guest name: ");
                        guestlist.add(sc.nextLine());
                        break;
                }
            } while (true);
        }

    }

//}
