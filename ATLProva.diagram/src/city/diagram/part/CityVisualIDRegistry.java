/*
 * 
 */
package city.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import city.CityModel;
import city.CityPackage;
import city.diagram.edit.parts.CityCityDistrictsCompartmentEditPart;
import city.diagram.edit.parts.CityEditPart;
import city.diagram.edit.parts.CityModelEditPart;
import city.diagram.edit.parts.CityNameEditPart;
import city.diagram.edit.parts.DistrictDistrictPlacesCompartmentEditPart;
import city.diagram.edit.parts.DistrictEditPart;
import city.diagram.edit.parts.DistrictNameEditPart;
import city.diagram.edit.parts.PlaceEditPart;
import city.diagram.edit.parts.PlaceNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CityVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "ATLProva.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CityModelEditPart.MODEL_ID.equals(view.getType())) {
				return CityModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return city.diagram.part.CityVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				CityDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CityPackage.eINSTANCE.getCityModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((CityModel) domainElement)) {
			return CityModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = city.diagram.part.CityVisualIDRegistry
				.getModelID(containerView);
		if (!CityModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"city".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (CityModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = city.diagram.part.CityVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CityModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CityModelEditPart.VISUAL_ID:
			if (CityPackage.eINSTANCE.getCity().isSuperTypeOf(
					domainElement.eClass())) {
				return CityEditPart.VISUAL_ID;
			}
			break;
		case CityCityDistrictsCompartmentEditPart.VISUAL_ID:
			if (CityPackage.eINSTANCE.getDistrict().isSuperTypeOf(
					domainElement.eClass())) {
				return DistrictEditPart.VISUAL_ID;
			}
			break;
		case DistrictDistrictPlacesCompartmentEditPart.VISUAL_ID:
			if (CityPackage.eINSTANCE.getPlace().isSuperTypeOf(
					domainElement.eClass())) {
				return PlaceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = city.diagram.part.CityVisualIDRegistry
				.getModelID(containerView);
		if (!CityModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"city".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (CityModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = city.diagram.part.CityVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CityModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CityModelEditPart.VISUAL_ID:
			if (CityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CityEditPart.VISUAL_ID:
			if (CityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CityCityDistrictsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DistrictEditPart.VISUAL_ID:
			if (DistrictNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DistrictDistrictPlacesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlaceEditPart.VISUAL_ID:
			if (PlaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CityCityDistrictsCompartmentEditPart.VISUAL_ID:
			if (DistrictEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DistrictDistrictPlacesCompartmentEditPart.VISUAL_ID:
			if (PlaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(CityModel element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case CityCityDistrictsCompartmentEditPart.VISUAL_ID:
		case DistrictDistrictPlacesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case CityModelEditPart.VISUAL_ID:
			return false;
		case PlaceEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return city.diagram.part.CityVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return city.diagram.part.CityVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return city.diagram.part.CityVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return city.diagram.part.CityVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return city.diagram.part.CityVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return city.diagram.part.CityVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
