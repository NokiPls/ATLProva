/*
 * 
 */
package city.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import city.diagram.edit.commands.DistrictCreateCommand;
import city.diagram.providers.CityElementTypes;

/**
 * @generated
 */
public class CityCityDistrictsCompartmentItemSemanticEditPolicy extends
		CityBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CityCityDistrictsCompartmentItemSemanticEditPolicy() {
		super(CityElementTypes.City_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CityElementTypes.District_3001 == req.getElementType()) {
			return getGEFWrapper(new DistrictCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
