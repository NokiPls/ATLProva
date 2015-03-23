/*
 * 
 */
package city.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import city.diagram.edit.commands.PlaceCreateCommand;
import city.diagram.providers.CityElementTypes;

/**
 * @generated
 */
public class DistrictDistrictPlacesCompartmentItemSemanticEditPolicy extends
		CityBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DistrictDistrictPlacesCompartmentItemSemanticEditPolicy() {
		super(CityElementTypes.District_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CityElementTypes.Place_3002 == req.getElementType()) {
			return getGEFWrapper(new PlaceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
