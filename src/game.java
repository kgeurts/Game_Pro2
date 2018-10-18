import java.util.*;

    public class game {

        public static void main(String[] args) {
            Boolean runGame = true;

            Scanner scan = new Scanner(System.in);

            String input = "";
            String[] commandos = {"hoger", "lager", "exit"};
            double getalStart = 0;
            double getalfind = 0;
            while (runGame == true)  // (rungame)
            {

                getalStart = Math.ceil(Math.random() * 10 ); // Getal van 1 tot 10

                System.out.println("Getal is: " + getalStart);


                // INPUT CONTROLEREN!

                boolean geldigeInput = false;

                while (geldigeInput == false)
                {
                    input = scan.nextLine();
                    input = input.toLowerCase();

                    for (int i=0; i < commandos.length; i++ )
                    {
                       if (input.equals(commandos[i]))
                       {
                           // input is geldig
                           geldigeInput=true;
                           break; //break de loop af omdat wij al geldige input hebben.
                       }
                    }
                }

                // INPUT EVALUEREN
                getalfind = Math.ceil(Math.random() * 10 ); // Getal van 1 tot 10

                boolean win = false;
                if (input.equals(commandos[0])) //hoger
                {
                    if (getalfind > getalStart)
                    {
                        //Gewonnen!!!!
                        win = true;
                    }
                }
                else if (input.equals(commandos[1])) // lager
                {
                    if (getalfind < getalStart)
                    {
                        //Gewonnen!
                        win = true;
                    }
                }
                else
                {
                    // Niet lager niet hoger dan zal het wel exit zijn
                    runGame = false;
                    continue;
                }

                // Eindresultaat tonen
                System.out.println("Getal is: " + getalStart);
                System.out.println("Getal is: " + getalfind);

                if (getalfind != getalStart)
                {
                    if (win)
                    {
                        System.out.println("Je hebt gewonnen!!!");
                        // JE HEBT GEWONNEN!!
                    }
                    else
                        {
                            System.out.println("Je hebt verloren!");
                            // JE HEBT VERLOREN!
                        }
                }
            }


        }
    }