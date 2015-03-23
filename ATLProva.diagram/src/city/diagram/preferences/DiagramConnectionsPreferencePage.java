/*
 * 
 */
package city.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import city.diagram.part.CityDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(CityDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
