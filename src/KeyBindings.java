public class KeyBindings {
    public static Creature.MoveCommand inputToCommand(String input){
        switch (input){
            case "w":
                return Creature.MoveCommand.UP;
            case "a":
                return Creature.MoveCommand.LEFT;
            case "s":
                return Creature.MoveCommand.DOWN;
            case "d":
                return Creature.MoveCommand.RIGHT;
            default:
                return Creature.MoveCommand.UP;
        }
    }
}
