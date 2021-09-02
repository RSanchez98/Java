package com.company;


import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main
{

    public static void main(String[] args) throws LoginException
    {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        String token ="NzAyODE2NTYzNDM4Mjg4OTE2.XqFk1g.35JMRzFTufRhBiV9OTAzR1YX-mg";
        builder.setToken(token);
        builder.addEventListeners(new Bot());
        builder.build();
    }
}