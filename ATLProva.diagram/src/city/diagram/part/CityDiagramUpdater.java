/*
 * 
 */
package city.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import city.City;
import city.CityModel;
import city.District;
import city.Place;
import city.diagram.edit.parts.CityCityDistrictsCompartmentEditPart;
import city.diagram.edit.parts.CityEditPart;
import city.diagram.edit.parts.CityModelEditPart;
import city.diagram.edit.parts.DistrictDistrictPlacesCompartmentEditPart;
import city.diagram.edit.parts.DistrictEditPart;
import city.diagram.edit.parts.PlaceEditPart;

/**
 * @generated
 */
public class CityDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<CityNodeDescriptor> getSemanticChildren(View view) {
		switch (CityVisualIDRegistry.getVisualID(view)) {
		case CityModelEditPart.VISUAL_ID:
			return getCityModel_1000SemanticChildren(view);
		case CityCityDistrictsCompartmentEditPart.VISUAL_ID:
			return getCityCityDistrictsCompartment_7001SemanticChildren(view);
		case DistrictDistrictPlacesCompartmentEditPart.VISUAL_ID:
			return getDistrictDistrictPlacesCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CityNodeDescriptor> getCityModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CityModel modelElement = (CityModel) view.getElement();
		LinkedList<CityNodeDescriptor> result = new LinkedList<CityNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCities().iterator(); it.hasNext();) {
			City childElement = (City) it.next();
			int visualID = CityVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CityEditPart.VISUAL_ID) {
				result.add(new CityNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CityNodeDescriptor> getCityCityDistrictsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		City modelElement = (City) containerView.getElement();
		LinkedList<CityNodeDescriptor> result = new LinkedList<CityNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDistricts().iterator(); it
				.hasNext();) {
			District childElement = (District) it.next();
			int visualID = CityVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DistrictEditPart.VISUAL_ID) {
				result.add(new CityNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CityNodeDescriptor> getDistrictDistrictPlacesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		District modelElement = (District) containerView.getElement();
		LinkedList<CityNodeDescriptor> result = new LinkedList<CityNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPlaces().iterator(); it.hasNext();) {
			Place childElement = (Place) it.next();
			int visualID = CityVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PlaceEditPart.VISUAL_ID) {
				result.add(new CityNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CityLinkDescriptor> getContainedLinks(View view) {
		switch (CityVisualIDRegistry.getVisualID(view)) {
		case CityModelEditPart.VISUAL_ID:
			return getCityModel_1000ContainedLinks(view);
		case CityEditPart.VISUAL_ID:
			return getCity_2001ContainedLinks(view);
		case DistrictEditPart.VISUAL_ID:
			return getDistrict_3001ContainedLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CityLinkDescriptor> getIncomingLinks(View view) {
		switch (CityVisualIDRegistry.getVisualID(view)) {
		case CityEditPart.VISUAL_ID:
			return getCity_2001IncomingLinks(view);
		case DistrictEditPart.VISUAL_ID:
			return getDistrict_3001IncomingLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CityLinkDescriptor> getOutgoingLinks(View view) {
		switch (CityVisualIDRegistry.getVisualID(view)) {
		case CityEditPart.VISUAL_ID:
			return getCity_2001OutgoingLinks(view);
		case DistrictEditPart.VISUAL_ID:
			return getDistrict_3001OutgoingLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CityLinkDescriptor> getCityModel_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CityLinkDescriptor> getCity_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CityLinkDescriptor> getDistrict_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CityLinkDescriptor> getPlace_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CityLinkDescriptor> getCity_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CityLinkDescriptor> getDistrict_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CityLinkDescriptor> getPlace_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CityLinkDescriptor> getCity_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CityLinkDescriptor> getDistrict_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CityLinkDescriptor> getPlace_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<CityNodeDescriptor> getSemanticChildren(View view) {
			return CityDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CityLinkDescriptor> getContainedLinks(View view) {
			return CityDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CityLinkDescriptor> getIncomingLinks(View view) {
			return CityDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<CityLinkDescriptor> getOutgoingLinks(View view) {
			return CityDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
