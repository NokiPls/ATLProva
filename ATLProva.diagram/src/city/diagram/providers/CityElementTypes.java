/*
 * 
 */
package city.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import city.CityPackage;
import city.diagram.edit.parts.CityEditPart;
import city.diagram.edit.parts.CityModelEditPart;
import city.diagram.edit.parts.DistrictEditPart;
import city.diagram.edit.parts.PlaceEditPart;
import city.diagram.part.CityDiagramEditorPlugin;

/**
 * @generated
 */
public class CityElementTypes {

	/**
	 * @generated
	 */
	private CityElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			CityDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType CityModel_1000 = getElementType("ATLProva.diagram.CityModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType City_2001 = getElementType("ATLProva.diagram.City_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType District_3001 = getElementType("ATLProva.diagram.District_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Place_3002 = getElementType("ATLProva.diagram.Place_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(CityModel_1000, CityPackage.eINSTANCE.getCityModel());

			elements.put(City_2001, CityPackage.eINSTANCE.getCity());

			elements.put(District_3001, CityPackage.eINSTANCE.getDistrict());

			elements.put(Place_3002, CityPackage.eINSTANCE.getPlace());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(CityModel_1000);
			KNOWN_ELEMENT_TYPES.add(City_2001);
			KNOWN_ELEMENT_TYPES.add(District_3001);
			KNOWN_ELEMENT_TYPES.add(Place_3002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CityModelEditPart.VISUAL_ID:
			return CityModel_1000;
		case CityEditPart.VISUAL_ID:
			return City_2001;
		case DistrictEditPart.VISUAL_ID:
			return District_3001;
		case PlaceEditPart.VISUAL_ID:
			return Place_3002;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return city.diagram.providers.CityElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return city.diagram.providers.CityElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return city.diagram.providers.CityElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
