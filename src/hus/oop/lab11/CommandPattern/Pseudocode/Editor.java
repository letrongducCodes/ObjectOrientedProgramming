package hus.oop.lab11.CommandPattern.Pseudocode;

public class Editor {
    String text = " ";

    public String getSelection() {
        // Trả về văn bản đã chọn.
        return text;
    }

    public int getSelectionStart() {
        // Return the start index of the selected text.
        return 0;
    }

    public int getSelectionEnd() {
        // Return the end index of the selected text.
        return 0;
    }

    public int getCursorPosition() {
        // Return the cursor position.
        return 0;
    }

    public void deleteSelection() {
        // Xóa văn bản đã chọn.
        throw new UnsupportedOperationException("This method is not yet implemented.");
    }

    public void replaceSelection(String text) {
        // Chèn nội dung trong clipboard vào vị trí hiện tại.
        if (getSelection() != null) {
            // Replace the selected text with the new text.
            int start = getSelectionStart();
            int end = getSelectionEnd();
            this.text = this.text.substring(0, start) + text + this.text.substring(end);
        } else {
            // Insert the new text at the current cursor position.
            int cursorPosition = getCursorPosition();
            this.text = this.text.substring(0, cursorPosition) + text +this.text.substring(cursorPosition);
        }
    }
}
