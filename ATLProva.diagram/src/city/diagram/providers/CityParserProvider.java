/*
 * 
 */
package city.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import city.CityPackage;
import city.diagram.edit.parts.CityNameEditPart;
import city.diagram.edit.parts.DistrictNameEditPart;
import city.diagram.edit.parts.PlaceNameEditPart;
import city.diagram.parsers.MessageFormatParser;
import city.diagram.part.CityVisualIDRegistry;

/**
 * @generated
 */
public class CityParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser cityName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getCityName_5003Parser() {
		if (cityName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { CityPackage.eINSTANCE
					.getCity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cityName_5003Parser = parser;
		}
		return cityName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser districtName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getDistrictName_5002Parser() {
		if (districtName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CityPackage.eINSTANCE
					.getDistrict_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			districtName_5002Parser = parser;
		}
		return districtName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser placeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getPlaceName_5001Parser() {
		if (placeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CityPackage.eINSTANCE
					.getPlace_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			placeName_5001Parser = parser;
		}
		return placeName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CityNameEditPart.VISUAL_ID:
			return getCityName_5003Parser();
		case DistrictNameEditPart.VISUAL_ID:
			return getDistrictName_5002Parser();
		case PlaceNameEditPart.VISUAL_ID:
			return getPlaceName_5001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(CityVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CityVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CityElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
