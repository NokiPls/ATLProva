/*
 * 
 */
package city.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import city.diagram.part.CityVisualIDRegistry;

/**
 * @generated
 */
public class CityEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CityVisualIDRegistry.getVisualID(view)) {

			case CityModelEditPart.VISUAL_ID:
				return new CityModelEditPart(view);

			case CityEditPart.VISUAL_ID:
				return new CityEditPart(view);

			case CityNameEditPart.VISUAL_ID:
				return new CityNameEditPart(view);

			case DistrictEditPart.VISUAL_ID:
				return new DistrictEditPart(view);

			case DistrictNameEditPart.VISUAL_ID:
				return new DistrictNameEditPart(view);

			case PlaceEditPart.VISUAL_ID:
				return new PlaceEditPart(view);

			case PlaceNameEditPart.VISUAL_ID:
				return new PlaceNameEditPart(view);

			case CityCityDistrictsCompartmentEditPart.VISUAL_ID:
				return new CityCityDistrictsCompartmentEditPart(view);

			case DistrictDistrictPlacesCompartmentEditPart.VISUAL_ID:
				return new DistrictDistrictPlacesCompartmentEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
