/*
 * 
 */
package city.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import city.diagram.providers.CityElementTypes;
import city.diagram.providers.CityModelingAssistantProvider;

/**
 * @generated
 */
public class CityModelingAssistantProviderOfCityModelEditPart extends
		CityModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CityElementTypes.City_2001);
		return types;
	}

}
