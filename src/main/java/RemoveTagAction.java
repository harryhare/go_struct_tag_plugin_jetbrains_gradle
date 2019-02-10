import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;


public class RemoveTagAction extends AnAction {
    public RemoveTagAction() {
        super("Hello");
    }

    public void actionPerformed(AnActionEvent event) {
        GenerateTagAction.actionPerformed(event, false, false, false);
    }
}