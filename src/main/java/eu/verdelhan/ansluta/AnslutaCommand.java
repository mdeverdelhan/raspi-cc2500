package eu.verdelhan.ansluta;

/**
 * Commands of the Ansluta remote.
 */
public enum AnslutaCommand {

    LIGHT_OFF((byte) 0x01, "Turn the light off"),
    LIGHT_ON_50((byte) 0x02, "Turn the light on 50%"),
    LIGHT_ON_100((byte) 0x03, "Turn the light on 100%"),
    LIGHT_PAIR((byte) 0xFF, "Pair the remote to the light");

    /** The command byte */
    byte command;
    /** The command description */
    String description;

    /**
     * @param command the command byte
     * @param description the command description
     */
    private AnslutaCommand(byte command, String description) {
        this.command = command;
        this.description = description;
    }
}
