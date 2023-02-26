package net.arikia.dev.drpc;

public class builderMain {
    private static final String CLIENT_ID = "1077801426853560360";
    public builderMain() {

    }

    public static void main(String[] args) {
        /*DiscordEventHandlers handlers = new DiscordEventHandlers.Builder().setReadyEventHandler((user) -> {
            System.out.println("Welcome " + user.username + "#" + user.discriminator + "!");
        }).build();*/
        DiscordEventHandlers handlers = new DiscordEventHandlers();
        handlers.ready = (user) -> System.out.println("Discord RPC is ready!");

        DiscordRPC.discordInitialize(CLIENT_ID, handlers, true);
        DiscordRichPresence presence = new DiscordRichPresence();
        presence.state = "Playing Valorant";
        presence.details = "In game";
        presence.largeImageKey = "valorant_logo";
        presence.largeImageText = "Valorant";

        DiscordRPC.discordUpdatePresence(presence);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            DiscordRPC.discordShutdown();
        }));


    }
}
