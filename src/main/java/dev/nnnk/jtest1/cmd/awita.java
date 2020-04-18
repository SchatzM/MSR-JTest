package dev.nnnk.jtest1.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import dev.nnnk.jtest1.awa;

public class awita implements CommandExecutor{
    awa plugin;

    public awita(awa plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        sender.sendMessage("Awita");

        return true;
    }
}
