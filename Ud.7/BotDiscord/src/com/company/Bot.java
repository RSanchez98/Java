package com.company;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;
import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Bot extends ListenerAdapter
{
    @Override
    public void onMessageReceived(@Nonnull MessageReceivedEvent event)
    {
        if (!event.getAuthor().isBot())
        {
            if (event.getMessage().getContentRaw().equals("!pin"))
            {
                event.getChannel().sendMessage("pam, toma lacasitos").queue();
            }

            if (event.getMessage().getContentRaw().equals("!pium"))
            {
                event.getChannel().sendMessage("¿QUIERES SENTIRLA EN EL PEXO?").queue();
            }

            if (event.getMessage().getContentRaw().equals("!Tu que prefieres?"))
            {
                event.getChannel().sendMessage("una piza o una tortilla de papa?").queue();
            }

            if(event.getMessage().getContentRaw().equals("!9000"))
            {
                User autor = event.getMessage().getAuthor();
                event.getChannel().sendMessage("<@"+autor.getId()+">'s Over 9000!!!").queue();
            }

            if(event.getMessage().getContentRaw().equals("!blackman"))
            {
                event.getMessage().addReaction("\uD83E\uDDCD\uD83C\uDFFF\u200D♂️").queue();
            }
        }

    }

}
