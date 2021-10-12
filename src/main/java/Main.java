import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {

    public static void main(String[] args) {

        //Discord Bot Token
        String token = "Your Token Goes Here";

        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();

        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("!hmmm")) {
                event.getChannel().sendMessage("*cloaked man removes hood* Hello there.");
            } else if (event.getMessageContent().equalsIgnoreCase("!BeepBlip")) {
                event.getChannel().sendMessage("Come here, my little friend. Don't be afraid.");
            } else if (event.getMessageContent().equalsIgnoreCase("!BeepBlipBlip")) {
                event.getChannel().sendMessage("Oh, don't worry. He'll be all right");
            } else if (event.getMessageContent().equalsIgnoreCase("!next")) {
                event.getChannel().sendMessage("*reckless teenager wakes up* Rest easy, son." +
                                                        "You've had a busy day. You're fortunate to be " +
                                                        "all in one piece.");
            }
        });
    }

}
