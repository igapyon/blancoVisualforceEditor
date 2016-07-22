package blanco.visualforceeditor.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class VisualforceEditor extends TextEditor {

	private ColorManager colorManager;

	public VisualforceEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}

	@Override
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}
}
