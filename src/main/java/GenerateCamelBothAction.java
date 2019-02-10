import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class GenerateCamelBothAction extends AnAction {

    public void actionPerformed(AnActionEvent event) {
        GenerateTagAction.actionPerformed(event,true,true,true);
    }
}