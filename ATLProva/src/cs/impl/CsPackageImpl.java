/**
 */
package cs.impl;

import cs.Categories;
import cs.CategoriesCount;
import cs.CitySensing;
import cs.CsFactory;
import cs.CsPackage;
import cs.District;
import cs.Languages;
import cs.MonitoredCity;
import cs.NumPhoto;
import cs.NumPost;
import cs.NumPostLang;
import cs.NumPostTimeSlot;
import cs.Place;
import cs.Statistic;
import cs.TimeSlots;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CsPackageImpl extends EPackageImpl implements CsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoredCityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass districtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citySensingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapPostLangEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numPostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numPhotoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numPostTimeSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numPostLangEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapPostTimeSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoriesCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapCategoriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum categoriesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languagesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeSlotsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cs.CsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CsPackageImpl() {
		super(eNS_URI, CsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CsPackage init() {
		if (isInited) return (CsPackage)EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI);

		// Obtain or create and register package
		CsPackageImpl theCsPackage = (CsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCsPackage.createPackageContents();

		// Initialize created meta-data
		theCsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CsPackage.eNS_URI, theCsPackage);
		return theCsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitoredCity() {
		return monitoredCityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredCity_Name() {
		return (EAttribute)monitoredCityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoredCity_Districts() {
		return (EReference)monitoredCityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoredCity_Stats() {
		return (EReference)monitoredCityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredCity_CoordBx() {
		return (EAttribute)monitoredCityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredCity_CoordBy() {
		return (EAttribute)monitoredCityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredCity_CoordEx() {
		return (EAttribute)monitoredCityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoredCity_CoordEy() {
		return (EAttribute)monitoredCityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Name() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Stats() {
		return (EReference)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatistic() {
		return statisticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistic_Name() {
		return (EAttribute)statisticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistic_Metric() {
		return (EAttribute)statisticEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistrict() {
		return districtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistrict_Places() {
		return (EReference)districtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistrict_Name() {
		return (EAttribute)districtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistrict_CoordBx() {
		return (EAttribute)districtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistrict_CoordBy() {
		return (EAttribute)districtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistrict_CoordEx() {
		return (EAttribute)districtEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistrict_CoordEy() {
		return (EAttribute)districtEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDistrict_Stats() {
		return (EReference)districtEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCitySensing() {
		return citySensingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCitySensing_Cities() {
		return (EReference)citySensingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapPostLang() {
		return mapPostLangEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapPostLang_Key() {
		return (EAttribute)mapPostLangEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapPostLang_Value() {
		return (EAttribute)mapPostLangEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumPost() {
		return numPostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumPhoto() {
		return numPhotoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumPostTimeSlot() {
		return numPostTimeSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumPostTimeSlot_PostsPerTimeSlot() {
		return (EReference)numPostTimeSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumPostLang() {
		return numPostLangEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumPostLang_LangNumber() {
		return (EReference)numPostLangEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapPostTimeSlot() {
		return mapPostTimeSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapPostTimeSlot_Key() {
		return (EAttribute)mapPostTimeSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapPostTimeSlot_Value() {
		return (EAttribute)mapPostTimeSlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoriesCount() {
		return categoriesCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoriesCount_CatNumber() {
		return (EReference)categoriesCountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapCategories() {
		return mapCategoriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapCategories_Key() {
		return (EAttribute)mapCategoriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapCategories_Value() {
		return (EAttribute)mapCategoriesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCategories() {
		return categoriesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLanguages() {
		return languagesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeSlots() {
		return timeSlotsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsFactory getCsFactory() {
		return (CsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		monitoredCityEClass = createEClass(MONITORED_CITY);
		createEAttribute(monitoredCityEClass, MONITORED_CITY__NAME);
		createEReference(monitoredCityEClass, MONITORED_CITY__DISTRICTS);
		createEReference(monitoredCityEClass, MONITORED_CITY__STATS);
		createEAttribute(monitoredCityEClass, MONITORED_CITY__COORD_BX);
		createEAttribute(monitoredCityEClass, MONITORED_CITY__COORD_BY);
		createEAttribute(monitoredCityEClass, MONITORED_CITY__COORD_EX);
		createEAttribute(monitoredCityEClass, MONITORED_CITY__COORD_EY);

		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__NAME);
		createEReference(placeEClass, PLACE__STATS);

		statisticEClass = createEClass(STATISTIC);
		createEAttribute(statisticEClass, STATISTIC__NAME);
		createEAttribute(statisticEClass, STATISTIC__METRIC);

		districtEClass = createEClass(DISTRICT);
		createEReference(districtEClass, DISTRICT__PLACES);
		createEAttribute(districtEClass, DISTRICT__NAME);
		createEAttribute(districtEClass, DISTRICT__COORD_BX);
		createEAttribute(districtEClass, DISTRICT__COORD_BY);
		createEAttribute(districtEClass, DISTRICT__COORD_EX);
		createEAttribute(districtEClass, DISTRICT__COORD_EY);
		createEReference(districtEClass, DISTRICT__STATS);

		citySensingEClass = createEClass(CITY_SENSING);
		createEReference(citySensingEClass, CITY_SENSING__CITIES);

		mapPostLangEClass = createEClass(MAP_POST_LANG);
		createEAttribute(mapPostLangEClass, MAP_POST_LANG__KEY);
		createEAttribute(mapPostLangEClass, MAP_POST_LANG__VALUE);

		numPostEClass = createEClass(NUM_POST);

		numPhotoEClass = createEClass(NUM_PHOTO);

		numPostTimeSlotEClass = createEClass(NUM_POST_TIME_SLOT);
		createEReference(numPostTimeSlotEClass, NUM_POST_TIME_SLOT__POSTS_PER_TIME_SLOT);

		numPostLangEClass = createEClass(NUM_POST_LANG);
		createEReference(numPostLangEClass, NUM_POST_LANG__LANG_NUMBER);

		mapPostTimeSlotEClass = createEClass(MAP_POST_TIME_SLOT);
		createEAttribute(mapPostTimeSlotEClass, MAP_POST_TIME_SLOT__KEY);
		createEAttribute(mapPostTimeSlotEClass, MAP_POST_TIME_SLOT__VALUE);

		categoriesCountEClass = createEClass(CATEGORIES_COUNT);
		createEReference(categoriesCountEClass, CATEGORIES_COUNT__CAT_NUMBER);

		mapCategoriesEClass = createEClass(MAP_CATEGORIES);
		createEAttribute(mapCategoriesEClass, MAP_CATEGORIES__KEY);
		createEAttribute(mapCategoriesEClass, MAP_CATEGORIES__VALUE);

		// Create enums
		categoriesEEnum = createEEnum(CATEGORIES);
		languagesEEnum = createEEnum(LANGUAGES);
		timeSlotsEEnum = createEEnum(TIME_SLOTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		numPostEClass.getESuperTypes().add(this.getStatistic());
		numPhotoEClass.getESuperTypes().add(this.getStatistic());
		numPostTimeSlotEClass.getESuperTypes().add(this.getStatistic());
		numPostLangEClass.getESuperTypes().add(this.getStatistic());
		categoriesCountEClass.getESuperTypes().add(this.getStatistic());

		// Initialize classes, features, and operations; add parameters
		initEClass(monitoredCityEClass, MonitoredCity.class, "MonitoredCity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonitoredCity_Name(), ecorePackage.getEString(), "name", null, 1, 1, MonitoredCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitoredCity_Districts(), this.getDistrict(), null, "districts", null, 1, -1, MonitoredCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitoredCity_Stats(), this.getStatistic(), null, "stats", null, 0, -1, MonitoredCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitoredCity_CoordBx(), ecorePackage.getEFloat(), "coordBx", null, 1, 1, MonitoredCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitoredCity_CoordBy(), ecorePackage.getEFloat(), "coordBy", null, 1, 1, MonitoredCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitoredCity_CoordEx(), ecorePackage.getEFloat(), "coordEx", null, 1, 1, MonitoredCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitoredCity_CoordEy(), ecorePackage.getEFloat(), "coordEy", null, 1, 1, MonitoredCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Name(), ecorePackage.getEString(), "name", null, 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_Stats(), this.getStatistic(), null, "stats", null, 0, -1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statisticEClass, Statistic.class, "Statistic", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatistic_Name(), ecorePackage.getEString(), "name", null, 0, 1, Statistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistic_Metric(), ecorePackage.getELong(), "metric", null, 1, 1, Statistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(districtEClass, District.class, "District", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDistrict_Places(), this.getPlace(), null, "places", null, 0, -1, District.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistrict_Name(), ecorePackage.getEString(), "name", null, 0, 1, District.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistrict_CoordBx(), ecorePackage.getEFloat(), "coordBx", null, 1, 1, District.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistrict_CoordBy(), ecorePackage.getEFloat(), "coordBy", null, 1, 1, District.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistrict_CoordEx(), ecorePackage.getEFloat(), "coordEx", null, 1, 1, District.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistrict_CoordEy(), ecorePackage.getEFloat(), "coordEy", null, 1, 1, District.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDistrict_Stats(), this.getStatistic(), null, "stats", null, 0, -1, District.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(citySensingEClass, CitySensing.class, "CitySensing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCitySensing_Cities(), this.getMonitoredCity(), null, "cities", null, 1, -1, CitySensing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapPostLangEClass, Map.Entry.class, "MapPostLang", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapPostLang_Key(), this.getLanguages(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapPostLang_Value(), ecorePackage.getEIntegerObject(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numPostEClass, NumPost.class, "NumPost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numPhotoEClass, NumPhoto.class, "NumPhoto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numPostTimeSlotEClass, NumPostTimeSlot.class, "NumPostTimeSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumPostTimeSlot_PostsPerTimeSlot(), this.getMapPostTimeSlot(), null, "postsPerTimeSlot", null, 0, -1, NumPostTimeSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numPostLangEClass, NumPostLang.class, "NumPostLang", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumPostLang_LangNumber(), this.getMapPostLang(), null, "langNumber", null, 0, -1, NumPostLang.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapPostTimeSlotEClass, Map.Entry.class, "MapPostTimeSlot", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapPostTimeSlot_Key(), this.getTimeSlots(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapPostTimeSlot_Value(), ecorePackage.getEIntegerObject(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoriesCountEClass, CategoriesCount.class, "CategoriesCount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoriesCount_CatNumber(), this.getMapCategories(), null, "catNumber", null, 0, -1, CategoriesCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapCategoriesEClass, Map.Entry.class, "MapCategories", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapCategories_Key(), this.getCategories(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapCategories_Value(), ecorePackage.getEIntegerObject(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(categoriesEEnum, Categories.class, "Categories");
		addEEnumLiteral(categoriesEEnum, Categories.CULTURE);
		addEEnumLiteral(categoriesEEnum, Categories.FOOD);
		addEEnumLiteral(categoriesEEnum, Categories.FUN);

		initEEnum(languagesEEnum, Languages.class, "Languages");
		addEEnumLiteral(languagesEEnum, Languages.SPANISH);
		addEEnumLiteral(languagesEEnum, Languages.ENGLISH);
		addEEnumLiteral(languagesEEnum, Languages.ITALIAN);

		initEEnum(timeSlotsEEnum, TimeSlots.class, "TimeSlots");
		addEEnumLiteral(timeSlotsEEnum, TimeSlots.MORNING);
		addEEnumLiteral(timeSlotsEEnum, TimeSlots.AFTERNOON);
		addEEnumLiteral(timeSlotsEEnum, TimeSlots.EVENING);
		addEEnumLiteral(timeSlotsEEnum, TimeSlots.NIGHT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
		// gmf.diagram
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (monitoredCityEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (placeEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (districtEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (mapPostLangEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (numPostEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (numPhotoEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (numPostTimeSlotEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (numPostLangEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (mapPostTimeSlotEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (categoriesCountEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (mapCategoriesEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getMonitoredCity_Districts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMonitoredCity_Stats(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPlace_Stats(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDistrict_Places(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDistrict_Stats(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (citySensingEClass, 
		   source, 
		   new String[] {
		   });
	}

} //CsPackageImpl
