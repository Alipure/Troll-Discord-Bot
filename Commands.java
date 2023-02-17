package techtoolbox.Ali;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;
import java.util.Random;

public class Commands extends ListenerAdapter {
    public void onGuildMessageReceived(@Nonnull GuildMessageReceivedEvent event) {
        // This will check if the prefix is said in chat
        String[] args = event.getMessage().getContentRaw().split("\\s+");


        // Will create Embedbuilder and Will prompt the bot to display infomation when asked
        if (args[0].equalsIgnoreCase(Rasooly.prefix) && args[1].equalsIgnoreCase("info")) {
            EmbedBuilder infoEmbed = new EmbedBuilder();
            infoEmbed.setTitle("👽 Rasooly Bot Information 👽");
            infoEmbed.setDescription("This bot is fully dedicated and revolving Rasol");
            infoEmbed.addField("Hey, here is the information: \n", "\n \n" +
                    "**rasol info** - For information\n \n" +
                    "**rasol spam (number)** - To spam \" Rasol likes programming \" however times your heart desires. \n \n" +
                    " ||**[WARNING MAY BREAK BOT] [DEADLY]**||  ||**[IM TALKING TO YOU PARSA]**||\n \n" +
                    "**rasol questionable** - To obtain a random questionable picture of Rasol \n \n" +
                    "**rasol fun fact** - To have a fun fact about Rasol! \n \n" +
                    "Help promote the bot by joining: \n" +
                    "https://discord.gg/W3uGBJE \n \n", false);
            infoEmbed.setColor(0x6226ab);
            infoEmbed.setFooter("Created by Alipure", event.getMember().getUser().getAvatarUrl());
            infoEmbed.setImage("https://cdn.discordapp.com/attachments/767635801386909726/767663293027975188/Malay.jpg");
            infoEmbed.setThumbnail("https://cdn.discordapp.com/attachments/767086809066373163/767641790446567455/Rasol_Smile.PNG");
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(infoEmbed.build()).queue();
            infoEmbed.clear();
            event.getChannel().sendMessage("https://discord.gg/aHEyz8XWtH").queue();
        }
            // This is the spam command
            if (args[0].equalsIgnoreCase(Rasooly.prefix) && args[1].equalsIgnoreCase("spam")
                    && args[2].equalsIgnoreCase(args[2])) {
                int spamNumber = Integer.parseInt(args[2]);
                if (spamNumber > 20) {
                    event.getChannel().sendTyping().queue();
                    event.getChannel().sendMessage("The maximum is 20").queue();
                    spamNumber = 20;
                }
                for (int i = 0; i < spamNumber; i++) {
                event.getChannel().sendTyping().queue();
                event.getChannel().sendMessage("Rasol likes programming").queue();
                // This will delay the message being sent by 2 seconds
                try {
                    Thread.sleep(2000);
                }
                catch (InterruptedException ex)
                {
                    // do nothing
                }
            }
        }
        // Will prompt the bot to display random questionable picture of Rasol
        if (args[0].equalsIgnoreCase(Rasooly.prefix) && args[1].equalsIgnoreCase("questionable")) {
                String[] questionableList = {"https://cdn.discordapp.com/attachments/767635801386909726/767961397270151198/rasolquestionable.png",
                        "https://cdn.discordapp.com/attachments/767086809066373163/767636484550950932/Captu868re.PNG",
                        "https://cdn.discordapp.com/attachments/767086809066373163/767636500296761354/Capture.PNG",
                        "https://cdn.discordapp.com/attachments/767086809066373163/767636509531570186/rasol_open_mouth.PNG",
                        "https://cdn.discordapp.com/attachments/767086809066373163/767636537592512512/jew.png",
                        "https://cdn.discordapp.com/attachments/767086809066373163/767636559930851338/rasol_face.png",
                        "https://cdn.discordapp.com/attachments/767086809066373163/767641790446567455/Rasol_Smile.PNG",
                        "https://cdn.discordapp.com/attachments/767635801386909726/767962457695453194/rasolomegeleelele.PNG",
                        "https://cdn.discordapp.com/attachments/767635801386909726/767962467199614986/rasolomegele.PNG",
                        "https://cdn.discordapp.com/attachments/698659516975284224/767963215660449823/image3.png",
                        "https://cdn.discordapp.com/attachments/767635801386909726/768090133131427880/image0.png"};
                Random random = new Random();
                int index = random.nextInt(questionableList.length);
                event.getChannel().sendTyping().queue();
                event.getChannel().sendMessage(questionableList[index]).queue();
        }
        // Will prompt the bot to reveal random information about Rasol
        if (args[0].equalsIgnoreCase(Rasooly.prefix) && args[1].equalsIgnoreCase("fun") && args[2].equalsIgnoreCase("fact")) {
            String[] rasolFacts = {"Rasol likes eating burgers.",
                    "Rasol admits to having 100 bitcoin.",
                    "Rasol sometimes can wait to play paintball",
                    "Fun fact Rasol works as a part time tutor",
                    "Rasol intends to never touch his C book",
                    "Rasol claims that he is track runner, funny right? Lol",
                    "Rasol has a pigeon.",
                    "Rasol is an investigator."};
            Random random = new Random();
            int index = random.nextInt(rasolFacts.length);
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(rasolFacts[index]).queue();
        }
        // Will unname everyone in the server // NOT DONE
        if (args[0].equalsIgnoreCase(Rasooly.prefix) && args[1].equalsIgnoreCase("unname") && args[2].equalsIgnoreCase("all")) {
        }

        // Will have a conversation with Rasol // Better improvements?
        if (args[0].equalsIgnoreCase("hey") && args[1].equalsIgnoreCase("rasol") ||
                (args[0].equalsIgnoreCase("Hey") && args[1].equalsIgnoreCase("Rasol") ||
                        (args[0].equalsIgnoreCase("Hey") && args[1].equalsIgnoreCase("rasol")))) {
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage("Hey what's up?").queue();
            try {
                Thread.sleep(10000);
            }
            catch (InterruptedException ex)
            {
                // do nothing
            }

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage("Nothing much just got done with my shift at my tutor session").queue();
            try {
                Thread.sleep(11000);
            }
            catch (InterruptedException ex)
            {
                // do nothing
            }

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage("Yeah, that's cool and all, but I need to start my dance lessons...").queue();
            try {
                Thread.sleep(12000);
            }
            catch (InterruptedException ex)
            {
                // do nothing
            }

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage("One second, I think I left the laptop in my bag still got to go!").queue();
        }

    }
}