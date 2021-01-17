import java.util.*;

public class SelfCare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean x = true; //for the while loops
        boolean y = true;

        System.out.println("Hello! I'm your virtual self care program!\n");
        System.out.println("Before we start, please answer with either Y for yes or N for no to \nquestions asked unless told otherwise. Now let's begin :)\n");

        while (y== true){ //in case they put in an invalid input, repeats question

            System.out.print("So, how do you feel today? \nType in 1 if you're happy,\n2 if you're feeling neutral,\nOr 3 if you're feeling sad. ");

            int response = input.nextInt();

            if (response == 1){ //if they're happy
                ifHappy();
                break;
            }
            else if (response == 2){ //if they're angry
                ifAngry();
                break;
            }

            else if (response == 3){ //if they're sad
                ifSad();
                break;
            }

            else { //if they put in something other than 1, 2, or 3
                System.out.println("\nWoah there cowboy, you seemed to have put in something other than 1, 2, or 3. Please put in a 1, 2 , or 3 now.");
            }
        }

        System.out.println("\nThank you for sharing your feelings with me! These are trying times, especially with the pandemic many of us have found ourselves spending alot of time at home. This can create alot of emotions as it's so different than what we are used to, But you can do it!"); //closing s3tatement
    }

    public static void ifHappy(){
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("\nAwesome! That’s nice to hear. Happiness is key to help you with things like stress and when you're feeling down.");

        System.out.println("\nI'm curious as to what made you happy, did something good happen to you? Remember, enter \"Y\" for yes or \"N\" for no" );
        userInput = scanner.next();
        if (userInput.equalsIgnoreCase("Y")){
            System.out.println("\nOh that’s nice! It’s important to do things that make you happy. Being happy helps reduce stress and is healthier for you in the long term! Remember to relish in small accomplishments throughout the day, whether it was just brushing your teeth in the morning or winning an award, celebrating the small things in life will make you a happier person.");

        }
        else if (userInput.equalsIgnoreCase("N")){
            System.out.println("\nThen, did something good happen with your friends?");
            userInput = scanner.next();
            if (userInput.equalsIgnoreCase("Y")){
                System.out.println("\nThat’s awesome! Having a lot of friends that are there to support you is a great way to remain happy! Remember you don’t need to be happy all the time, but it is important that you have people you trust that can support you.");
            }
            else{
                System.out.println("\nThen, Are you happy with school/work?");
                userInput = scanner.next();
                if (userInput.equalsIgnoreCase("Y")){
                    System.out.println("\nThat’s great! A healthy work/life balance is key to happiness. Many people struggle with enjoying work and it’s okay if you need to take a break sometimes. Remember to do what’s best for you.");
                }
                else {
                    System.out.println("\nAw that’s unfortunate, do you have any hobbies that you like to do?");
                    userInput = scanner.next();
                    if (userInput.equalsIgnoreCase("Y")){
                        System.out.println("\nThat’s superb! During these times of isolation it is hard to separate your work life from personal life. A hobby is a great way to deal with stress and other negative things in your life.");
                    }
                    else {
                        System.out.println("\nThats okay! A hobby can be as simple as watching television or as complicated as you want it to be. Just remember a hobby is something that brings you joy, you shouldn't feel stressed when doing it. Either way i'm glad that your're feeling happy today!");
                    }
                }

            }



        }





    }

    public static void ifAngry(){
        Scanner in = new Scanner(System.in);
        //1st question
        System.out.print("\nAre you frustrated with school/work?");
        String userInput = in.next();
        if(userInput.equalsIgnoreCase("Y")){ //check answer
            System.out.println("\nI get that completely! Sometimes school or work can be really stressful, whether that’s because of an upcoming deadline or annoying classmates/coworkers. Just know that whatever the problem is that everything will be okay. Talking to a loved one about your frustrations can help out a lot. Or even having something to look forward to after the ordeal can be good, like playing a game, hanging with friends, listening to music, etc.\n");
        }
        else{
            //2nd question
            System.out.print("\nDoes the reason involve someone close to you?");
            userInput = in.next();
            if(userInput.equalsIgnoreCase("Y")){ //check answer
                System.out.println("\nEven though they are a loved one, they can sometimes annoy you or say something that provokes you. Take some time to calm down and reflect on the situation, was it right to get mad at them? If not, then you should try to apologize once you have calmed down. Keep in mind that just because you wrongly got mad at them, it doesn’t make you a bad person. Sometimes we have bad days and things happen. All we can do is try our best and if we mess up, we should apologize and do better. If you’re right for getting mad at them, it’s a good thing to sit down with them and talk it out calmly with them. If they cannot talk calmly to you, you might want to consider talking to another loved one about this problem and ask advice from them. Whatever happens, in the end, everything will turn out okay.\n");
            }
            else{
                //3rd question
                System.out.print("\nWould you like to listen to a Spotify playlist of calming songs?");
                userInput = in.next();
                if(userInput.equalsIgnoreCase("Y")){ //check answer
                    System.out.println("\nHere's a Spotify playlist to chill to :) https://open.spotify.com/playlist/6JBOkjz26dC12xCSGWCOSR?si=P3HdzhQRRtmQWQ3lh8j8Aw\n");
                }
                else{
                    System.out.println("\nThat’s alright, not everyone likes to listen to music to calm down; we’re all a little bit different in a good way. Find a way to calm down, maybe by doing a hobby or something you just enjoy. That something could be as simple as making yourself food, putting on your favorite body lotion, or sit staring at the wall (if you enjoy that). It could also be as big as starting a new personal project (i.e. make new music, woodwork, paint the house, etc.). Sometimes we need to take time off for ourselves because life can be taxing and make us frustrated. By taking time for ourselves, we can calm down, relax, and enjoy life with its simple comforts.");
                }
            }
        }
    }

    public static void ifSad(){
        Scanner scnr = new Scanner(System.in);

        System.out.println("\nI'm sorry to hear that. Did someone make you sad?");
        String userInput = scnr.next(); //userInput = did someone make you sad

        if(userInput.equalsIgnoreCase("Y")){
            System.out.println("\nWas this person a family member");
            userInput = scnr.next(); //userInput2 = if family member
            if(userInput.equalsIgnoreCase("Y")){
                System.out.println("\nFamily, unlike friends, are ties we are born with and they can feel like a burden. Remember that you are an individual, and have no reason to maintain a relationship with someone who makes you feel sad.");
            }
            if(userInput.equalsIgnoreCase("N")){
                System.out.println("\nWas this person a coworker?");
                userInput = scnr.next(); //userInput3 = coworker?
            }
            if(userInput.equalsIgnoreCase("y")){
                System.out.println("\nWe must realize that coworkers are often also stressed, especially due to the pandemic. We as people can put their anger on each other. It is important to act compassionate towards them, and take their words with a grain of salt.");

            }
            if(userInput.equalsIgnoreCase("n")){
                System.out.println("\nWas this person a friend?");
                userInput = scnr.next();
            }
            if(userInput.equalsIgnoreCase("y")){
                System.out.println("\nFriends can be really fun, and we often rely on them to always make us happy. However, they can become a burden and be hurtful. It is important to realize that you are not obligated to them if they always make you feel hurt.");
            }
            if(userInput.equalsIgnoreCase("n")){
                System.out.println("\nPeople who are hurtful are usually the ones hurting. It is important to be compassionate and kind, but always put your own well-being ahead.");
            }



        }
        if(userInput.equalsIgnoreCase("n")){
            System.out.println("\nIs it something you don’t feel like you have control over?");
            userInput = scnr.next();

            if(userInput.equalsIgnoreCase("y")){
                System.out.println("\nDuring this pandemic, it is important to know that it is ok if you don’t feel like you have control over what is happening to you. Getting through a day, even if you don’t feel like you were productive, is an achievement.");
            }
            if(userInput.equalsIgnoreCase("n")){
                System.out.println("\nRemember that you do not need to solve your problem in one day. Take it slow. Rarely is something as urgent as it feels in your head.");
            }
        }




    }
}
