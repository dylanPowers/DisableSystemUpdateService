package me.swineson.disablesystemupdateservice;

import java.io.IOException;

/**
 * by James Swineson on 7/15/15.
 * Originated from ghostflying on 3/18/15.
 */
public final class PropUtil {
    private static final String COMMAND_PREFIX = "pm ";
    private static final String[] PROPERTIES = {
            "enable 'com.google.android.gms/.update.SystemUpdateService'",
            "disable 'com.google.android.gsf/.update.SystemUpdateService'"
    };

    public static void disableSystemUpdateService() {
        try{
            for (String property : PROPERTIES) {
                Runtime.getRuntime().exec(COMMAND_PREFIX + property);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
