/**
 */
package cs.impl;

import cs.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CsFactoryImpl extends EFactoryImpl implements CsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CsFactory init() {
		try {
			CsFactory theCsFactory = (CsFactory)EPackage.Registry.INSTANCE.getEFactory(CsPackage.eNS_URI);
			if (theCsFactory != null) {
				return theCsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CsPackage.MONITORED_CITY: return createMonitoredCity();
			case CsPackage.PLACE: return createPlace();
			case CsPackage.DISTRICT: return createDistrict();
			case CsPackage.CITY_SENSING: return createCitySensing();
			case CsPackage.MAP_POST_LANG: return (EObject)createMapPostLang();
			case CsPackage.NUM_POST: return createNumPost();
			case CsPackage.NUM_PHOTO: return createNumPhoto();
			case CsPackage.NUM_POST_TIME_SLOT: return createNumPostTimeSlot();
			case CsPackage.NUM_POST_LANG: return createNumPostLang();
			case CsPackage.MAP_POST_TIME_SLOT: return (EObject)createMapPostTimeSlot();
			case CsPackage.CATEGORIES_COUNT: return createCategoriesCount();
			case CsPackage.MAP_CATEGORIES: return (EObject)createMapCategories();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CsPackage.CATEGORIES:
				return createCategoriesFromString(eDataType, initialValue);
			case CsPackage.LANGUAGES:
				return createLanguagesFromString(eDataType, initialValue);
			case CsPackage.TIME_SLOTS:
				return createTimeSlotsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CsPackage.CATEGORIES:
				return convertCategoriesToString(eDataType, instanceValue);
			case CsPackage.LANGUAGES:
				return convertLanguagesToString(eDataType, instanceValue);
			case CsPackage.TIME_SLOTS:
				return convertTimeSlotsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoredCity createMonitoredCity() {
		MonitoredCityImpl monitoredCity = new MonitoredCityImpl();
		return monitoredCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public District createDistrict() {
		DistrictImpl district = new DistrictImpl();
		return district;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitySensing createCitySensing() {
		CitySensingImpl citySensing = new CitySensingImpl();
		return citySensing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Languages, Integer> createMapPostLang() {
		MapPostLangImpl mapPostLang = new MapPostLangImpl();
		return mapPostLang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumPost createNumPost() {
		NumPostImpl numPost = new NumPostImpl();
		return numPost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumPhoto createNumPhoto() {
		NumPhotoImpl numPhoto = new NumPhotoImpl();
		return numPhoto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumPostTimeSlot createNumPostTimeSlot() {
		NumPostTimeSlotImpl numPostTimeSlot = new NumPostTimeSlotImpl();
		return numPostTimeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumPostLang createNumPostLang() {
		NumPostLangImpl numPostLang = new NumPostLangImpl();
		return numPostLang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<TimeSlots, Integer> createMapPostTimeSlot() {
		MapPostTimeSlotImpl mapPostTimeSlot = new MapPostTimeSlotImpl();
		return mapPostTimeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoriesCount createCategoriesCount() {
		CategoriesCountImpl categoriesCount = new CategoriesCountImpl();
		return categoriesCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Categories, Integer> createMapCategories() {
		MapCategoriesImpl mapCategories = new MapCategoriesImpl();
		return mapCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categories createCategoriesFromString(EDataType eDataType, String initialValue) {
		Categories result = Categories.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategoriesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Languages createLanguagesFromString(EDataType eDataType, String initialValue) {
		Languages result = Languages.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguagesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSlots createTimeSlotsFromString(EDataType eDataType, String initialValue) {
		TimeSlots result = TimeSlots.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeSlotsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsPackage getCsPackage() {
		return (CsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CsPackage getPackage() {
		return CsPackage.eINSTANCE;
	}

} //CsFactoryImpl
