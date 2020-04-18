package dev.nnnk.jtest1.cmd;

import java.util.Arrays;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;

import dev.nnnk.jtest1.awa;

// Main commands handler
public class awita implements CommandExecutor {
    awa plugin;

    public awita(awa plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        String cmdName = cmd.getName().toLowerCase();
        PluginDescriptionFile pdf = this.plugin.getDescription();

        if (sender instanceof Player) {
            Player player = (Player) sender;

            switch(cmdName) {
                case "awa":
                case "awita":
                    if (args.length == 0) {
                        player.sendMessage("Awita");
                    } else {
                        if(args[0].equalsIgnoreCase("version") || args[0].equalsIgnoreCase("v")) {
                            player.sendMessage("Version: "+pdf.getVersion());
                        }
                        if(args[0].equalsIgnoreCase("dime") || args[0].equalsIgnoreCase("d")) {
                            String[] argsAProc = Arrays.copyOfRange(args, 1, args.length);
                            String digamelon = String.join(" ", argsAProc);

                            player.sendMessage("Pos te digo que "+digamelon+".");
                        }
                    }
                break;
                case "papawa":
                case "papawita":
                    player.sendMessage("Papawita");
                break;
                case "ayno":
                    player.sendMessage("Papawita");
                break;
                default:
                    return false;
            }
            return true;
        } else {
            return false;
        }
    }
}
