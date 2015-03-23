/*
 * 
 */
package city.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import city.diagram.edit.parts.CityEditPartFactory;
import city.diagram.edit.parts.CityModelEditPart;
import city.diagram.part.CityVisualIDRegistry;

/**
 * @generated
 */
public class CityEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public CityEditPartProvider() {
		super(new CityEditPartFactory(), CityVisualIDRegistry.TYPED_INSTANCE,
				CityModelEditPart.MODEL_ID);
	}

}
