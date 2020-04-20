package dev.nnnk.jtest1.cmd;

import dev.nnnk.jtest1.awa;

import java.util.Arrays;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;

// Main commands handler
public class cmdr implements CommandExecutor {
    awa plugin;

    public cmdr(awa plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        String cmdName = cmd.getName().toLowerCase();
        PluginDescriptionFile pdf = this.plugin.getDescription();
        Boolean haveArgs = args.length > 0;
        String[] argsAProc;
        String digamelon = null;

        if(haveArgs) {
            argsAProc = Arrays.copyOfRange(args, 1, args.length);
            digamelon = String.join(" ", argsAProc);
        }

        switch(cmdName) {
            case "awa":
            case "awita":
                if (haveArgs) {
                    if(args[0].equalsIgnoreCase("version") || args[0].equalsIgnoreCase("v")) {
                        sender.sendMessage("Version: "+pdf.getVersion());
                    }
                    if(args[0].equalsIgnoreCase("dime") || args[0].equalsIgnoreCase("d")) {
                        sender.sendMessage("Pos te digo que "+digamelon+".");
                    }
                } else {
                    sender.sendMessage("Awa no args");
                }
            break;
            case "papawa":
            case "papawita":
                sender.sendMessage("Papawita");
            break;
            case "cmd":
            case "commands":
                sender.sendMessage("cmds");
            break;
            default:
                return false;
        }

        return true;
    }
}
