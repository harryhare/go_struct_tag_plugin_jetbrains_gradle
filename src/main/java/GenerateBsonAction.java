import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;


public class GenerateBsonAction extends AnAction {

    public void actionPerformed(AnActionEvent event) {
        GenerateTagAction.actionPerformed(event,false,true,false);
    }
}