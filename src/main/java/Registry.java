import java.util.Map;

public class Registry<I,O> {

    private Command<I, O> command;

    public Registry(Command<I, O> command) {
        this.command = command;
    }

    <K> Registry<I, K> addCommand(Command<O, K> newCommand) {
        return new Registry<>(input -> newCommand.execute(command.execute(input)));
    }

    O execute(I input) {
        return command.execute(input);
    }
}
