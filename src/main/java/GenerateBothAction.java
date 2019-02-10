import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;


public class GenerateBothAction extends AnAction {

    public void actionPerformed(AnActionEvent event) {
        GenerateTagAction.actionPerformed(event,true,true,false);
    }
}