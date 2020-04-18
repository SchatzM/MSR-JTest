package dev.nnnk.jtest1.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import dev.nnnk.jtest1.awa;

public class awita implements CommandExecutor{
    awa plugin;

    public awita(awa plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        String cmdName = cmd.getName().toLowerCase();
        if (sender instanceof Player) {
            Player player = (Player) sender;

            switch(cmdName) {
                case "awa":
                    player.sendMessage("Awita");
                break;
                case "papawa":
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
