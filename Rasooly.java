package techtoolbox.Ali;
import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.requests.*;
import net.dv8tion.jda.api.utils.*;
import net.dv8tion.jda.api.utils.cache.*;

import javax.security.auth.login.*;


public class Rasooly {
    public static JDABuilder builder;
    public static String prefix = "rasol";
    // Main
    public static void main(String[] args) throws LoginException {
        String token = "NzY3Mjg1NTYwMDI3OTA2MDk5.X4vsXA.NCbortOQa7Ihcg8Yyv2nOOicJuA";
        builder = JDABuilder.createDefault(token);
        builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
        builder.setBulkDeleteSplittingEnabled(false);
        builder.setCompression(Compression.NONE);
        // Setting Bot's activity
        builder.setActivity(Activity.watching("Rasol's laptop \n" +
                "for help: rasol info"));
        builder.addEventListeners(new Commands());
        builder.enableIntents(GatewayIntent.GUILD_MEMBERS);
        builder.build();
    }

}
