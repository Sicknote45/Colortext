package colortext;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Colortexts extends JavaPlugin{
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            Player p = (Player) sender;
if(cmd.getName().equalsIgnoreCase("Colortext")){
              if (p.hasPermission("Donator")){
                  p.sendMessage(ChatColor.GOLD + "Your Rank would look like:");  
            	  if(args.length >= 1){
                              if(args[0].equalsIgnoreCase("red")){
                            	  if(args.length >= 3){
                                      p.sendMessage(ChatColor.RED + "[Error]: Please only specify one word.");
                              }
                                      if(args.length == 2){
                                              p.sendMessage(ChatColor.RED + "[" + args[1] + "]");
                                      }
                                      if(args.length == 1){
                                          p.sendMessage(ChatColor.RED + "Error: Please type something.");
                                              
                                      }
                                     
                              }
                              if(args[0].equalsIgnoreCase("green")){
                            	  if(args.length >= 3){
                                      p.sendMessage(ChatColor.RED + "[Error]: Please only specify one word.");
                              }
                                      if(args.length == 2){
                                              p.sendMessage(ChatColor.GREEN + "[" + args[1] + "]");
                                      }
                                      if(args.length == 1){
                                          p.sendMessage(ChatColor.RED + "Error: Please type something.");
                                      }
                              }
                              if(args[0].equalsIgnoreCase("dark_green")){
                            	  if(args.length >= 3){
                                      p.sendMessage(ChatColor.RED + "[Error]: Please only specify one word.");
                              }
                                  if(args.length == 2){
                                          p.sendMessage(ChatColor.DARK_GREEN + "[" + args[1] + "]");
                                  }
                                  if(args.length == 1){
                                      p.sendMessage(ChatColor.RED + "Error: Please type something.");
                                  }
                          }
                              if(args[0].equalsIgnoreCase("dark_red")){
                            	  if(args.length >= 3){
                                      p.sendMessage(ChatColor.RED + "[Error]: Please only specify one word.");
                              }
                                  if(args.length == 2){
                                          p.sendMessage(ChatColor.DARK_RED + "[" + args[1] + "]");
                                  }
                                  if(args.length == 1){
                                      p.sendMessage(ChatColor.RED + "[Error]:  Please type something.");
                                  }
                          }
                              if(args[0].equalsIgnoreCase("dark_gray")){
                            	  if(args.length >= 3){
                                      p.sendMessage(ChatColor.RED + "[Error]: Please only specify one word.");
                              }
                                  if(args.length == 2){
                                          p.sendMessage(ChatColor.DARK_GRAY + "[" + args[1] + "]");
                                  }
                                  if(args.length == 1){
                                      p.sendMessage(ChatColor.RED + "Error: Please type something.");
                                  }
                          }
                              if(args[0].equalsIgnoreCase("dark_purple")){
                            	  if(args.length >= 3){
                                      p.sendMessage(ChatColor.RED + "[Error]: Please only specify one word.");
                              }
                                  if(args.length == 2){
                                          p.sendMessage(ChatColor.DARK_PURPLE + "[" + args[1] + "]" );
                                  }
                                  if(args.length == 1){
                                      p.sendMessage(ChatColor.RED + "Error: Please type something.");
                                  }
                                  if(args[0].equalsIgnoreCase("dark_aqua")){
                                	  if(args.length >= 3){
                                          p.sendMessage(ChatColor.RED + "Please only specify one word.");
                                  }
                                      if(args.length == 2){
                                              p.sendMessage(ChatColor.DARK_AQUA + "[" + args[1] + "]");
                                      }
                                      if(args.length == 1){
                                          p.sendMessage(ChatColor.RED + "Error: Please type something.");
                                      }
                              }
                          }
                              if(args[0].equalsIgnoreCase("black")){
                            	  if(args.length >= 3){
                                      p.sendMessage(ChatColor.RED + "[Error]: Please only specify one word.");
                              }
                                  if(args.length == 2){
                                          p.sendMessage(ChatColor.BLACK + "[" + args[1] + "]");
                                  }
                                  if(args.length == 1){
                                      p.sendMessage(ChatColor.RED + "Error: Please type something.");
                                  }
                          }
                              if(args[0].equalsIgnoreCase("dark_blue")){
                            	  if(args.length >= 3){
                                      p.sendMessage(ChatColor.RED + "[Error]: Please only specify one word.");
                              }
                                  if(args.length == 2){
                                          p.sendMessage(ChatColor.DARK_BLUE + "[" + args[1] + "]");
                                  }
                                  if(args.length == 1){
                                      p.sendMessage(ChatColor.RED + "Error: Please type something.");
                                  }
                          }
                              if(args[0].equalsIgnoreCase("gold")){
                            	  if(args.length >= 3){
                                      p.sendMessage(ChatColor.RED + "[Error]: Please only specify one word.");
                              }
                                  if(args.length == 2){
                                          p.sendMessage(ChatColor.GOLD + "[" + args[1] + "]");
                                  }
                                  if(args.length == 1){
                                      p.sendMessage(ChatColor.RED + "Error: Please type something.");
                                  }
                          }
                              if(args[0].equalsIgnoreCase("gray")){
                            	  if(args.length >= 3){
                                      p.sendMessage(ChatColor.RED + "[Error]: Please only specify one word.");
                              }
                                  if(args.length == 2){
                                          p.sendMessage(ChatColor.GRAY + "[" + args[1] + "]");
                                  }
                                  if(args.length == 1){
                                      p.sendMessage(ChatColor.RED + "Error: Please type something.");
                                  }
                          }
                              if(args[0].equalsIgnoreCase("blue")){
                            	  if(args.length >= 3){
                                      p.sendMessage(ChatColor.RED + "[Error]: Please only specify one word.");
                              }
                                  if(args.length == 2){
                                          p.sendMessage(ChatColor.BLUE + "[" + args[1] + "]");
                                  }
                                  if(args.length == 1){
                                      p.sendMessage(ChatColor.RED + "Error: Please type something.");
                                  }
                          }
                              if(args[0].equalsIgnoreCase("light_purple")){
                            	  if(args.length >= 3){
                                      p.sendMessage(ChatColor.RED + "[Error]: Please only specify one word.");
                              }
                                  if(args.length == 2){
                                          p.sendMessage(ChatColor.LIGHT_PURPLE + "[" + args[1] + "]");
                                  }
                                  if(args.length == 1){
                                      p.sendMessage(ChatColor.RED + "Error: Please type something.");
                                  }
                          }
                              if(args[0].equalsIgnoreCase("aqua")){
                            	  if(args.length >= 3){
                                      p.sendMessage(ChatColor.RED + "[Error]: Please only specify one word.");
                              }
                                  if(args.length == 2){
                                          p.sendMessage(ChatColor.AQUA + "[" + args[1] + "]");
                                  }
                                  if(args.length == 1){
                                      p.sendMessage(ChatColor.RED + "Error: Please type something.");
                                  }
                          }
                              if(args[0].equalsIgnoreCase("yellow")){
                            	  if(args.length >= 3){
                                      p.sendMessage(ChatColor.RED + "[Error]: Please only specify one word.");
                              }
                                  if(args.length == 2){
                                          p.sendMessage(ChatColor.YELLOW + "[" + args[1] + "]");
                                  }
                                  if(args.length == 1){
                                      p.sendMessage(ChatColor.RED + "Error: Please type something.");
                                  }
                          }
                              if(args[0].equalsIgnoreCase("white")){
                                  if(args.length >= 3){
                                          p.sendMessage(ChatColor.RED + "[Error]: Please only specify one word.");
                                  }
                                  if(args.length == 2){
                                          p.sendMessage(ChatColor.WHITE + "[" + args[1] + "]");
                                  }
                                  if(args.length == 1){
                                      p.sendMessage(ChatColor.RED + "Error: Please type something.");
                                  }
                                  
                          }
                              
                      }else{
                          p.sendMessage("Please specifiy a name.");
                          return true;
                  }
          }
          else{
                  p.sendMessage(ChatColor.RED + "You do not have permission to execute this command.");
          }
          return true;
  }      
  return false;
}
}

