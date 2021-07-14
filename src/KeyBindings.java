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
                //謎の入力はとりあえず上に動く
                return Creature.MoveCommand.UP;
        }
    }
}
