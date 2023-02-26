package net.arikia.dev.drpc;

import net.arikia.dev.drpc.callbacks.ReadyCallback;

public class ReadyEvent implements ReadyCallback {
    @Override
    public void apply(DiscordUser user) {
        System.out.println("Discord's ready!");
    }
}

