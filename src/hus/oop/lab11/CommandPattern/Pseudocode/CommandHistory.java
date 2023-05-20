package hus.oop.lab11.CommandPattern.Pseudocode;

public class CommandHistory {
    private Command[] history;

    public void push(Command c) {
        // Đẩy lệnh vào cuối mảng lịch sử.
        if (history.length == 0) {
            history = new Command[1];
            history[0] = c;
        } else {
            Command[] temp = new Command[history.length + 1];
            for (int i = 0; i < history.length; i++) {
                temp[i] = history[i];
            }
            temp[history.length] = c;
            history = temp;
        }
    }

    public Command pop() {
        // Lấy lệnh mới nhất từ lịch sử.
        return history[history.length - 1];
    }
}
