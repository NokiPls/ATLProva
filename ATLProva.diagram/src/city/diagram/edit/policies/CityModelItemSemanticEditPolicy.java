/*
 * 
 */
package city.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import city.diagram.edit.commands.CityCreateCommand;
import city.diagram.providers.CityElementTypes;

/**
 * @generated
 */
public class CityModelItemSemanticEditPolicy extends
		CityBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CityModelItemSemanticEditPolicy() {
		super(CityElementTypes.CityModel_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CityElementTypes.City_2001 == req.getElementType()) {
			return getGEFWrapper(new CityCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
