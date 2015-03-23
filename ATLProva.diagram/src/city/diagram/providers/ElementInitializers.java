/*
 * 
 */
package city.diagram.providers;

import city.diagram.part.CityDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = CityDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			CityDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
