import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;

public class GenerateTagAction {
    static public void actionPerformed(AnActionEvent event, boolean json, boolean bson, boolean camel) {
        //Messages.showMessageDialog(project, "Hello world!", "Greeting", Messages.getInformationIcon());
        final Project project = event.getProject();
        final Editor editor = event.getRequiredData(CommonDataKeys.EDITOR);
        final Document document = editor.getDocument();
        final SelectionModel selectionModel = editor.getSelectionModel();
        if (project == null) {
            return;
        }
        System.out.println(project.getName());
        if (event.getData(PlatformDataKeys.EDITOR) == null) {
            return;
        }
//        Document document= null;
//        try {
//            document = event.getData(PlatformDataKeys.EDITOR).getDocument();
//        } catch (NullPointerException e) {
//            return;
//        }
//        String origin=document.getText();
//        String modified = TagAdder.ModifyTag(origin,true,true);
//        document.setText(modified);

        final int start = selectionModel.getSelectionStart();
        final int end = selectionModel.getSelectionEnd();
        System.out.printf("start:%d, end:%d\n", start, end);
        String origin = document.getText(TextRange.create(start, end));
        String modified = TagAdder.ModifyTag(origin, json, bson, camel);
        WriteCommandAction.runWriteCommandAction(project, () ->
                document.replaceString(start, end, modified)
        );
        //selectionModel.removeSelection();
    }
}
