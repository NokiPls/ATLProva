/**
 */
package cs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cs.CsFactory
 * @model kind="package"
 * @generated
 */
public interface CsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CsPackage eINSTANCE = cs.impl.CsPackageImpl.init();

	/**
	 * The meta object id for the '{@link cs.impl.MonitoredCityImpl <em>Monitored City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.MonitoredCityImpl
	 * @see cs.impl.CsPackageImpl#getMonitoredCity()
	 * @generated
	 */
	int MONITORED_CITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Districts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CITY__DISTRICTS = 1;

	/**
	 * The feature id for the '<em><b>Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CITY__STATS = 2;

	/**
	 * The feature id for the '<em><b>Coord Bx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CITY__COORD_BX = 3;

	/**
	 * The feature id for the '<em><b>Coord By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CITY__COORD_BY = 4;

	/**
	 * The feature id for the '<em><b>Coord Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CITY__COORD_EX = 5;

	/**
	 * The feature id for the '<em><b>Coord Ey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CITY__COORD_EY = 6;

	/**
	 * The number of structural features of the '<em>Monitored City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CITY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Monitored City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORED_CITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cs.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.PlaceImpl
	 * @see cs.impl.CsPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__STATS = 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cs.impl.StatisticImpl <em>Statistic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.StatisticImpl
	 * @see cs.impl.CsPackageImpl#getStatistic()
	 * @generated
	 */
	int STATISTIC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__METRIC = 1;

	/**
	 * The number of structural features of the '<em>Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cs.impl.DistrictImpl <em>District</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.DistrictImpl
	 * @see cs.impl.CsPackageImpl#getDistrict()
	 * @generated
	 */
	int DISTRICT = 3;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__PLACES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Coord Bx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__COORD_BX = 2;

	/**
	 * The feature id for the '<em><b>Coord By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__COORD_BY = 3;

	/**
	 * The feature id for the '<em><b>Coord Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__COORD_EX = 4;

	/**
	 * The feature id for the '<em><b>Coord Ey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__COORD_EY = 5;

	/**
	 * The feature id for the '<em><b>Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT__STATS = 6;

	/**
	 * The number of structural features of the '<em>District</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>District</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cs.impl.CitySensingImpl <em>City Sensing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.CitySensingImpl
	 * @see cs.impl.CsPackageImpl#getCitySensing()
	 * @generated
	 */
	int CITY_SENSING = 4;

	/**
	 * The feature id for the '<em><b>Cities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_SENSING__CITIES = 0;

	/**
	 * The number of structural features of the '<em>City Sensing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_SENSING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>City Sensing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_SENSING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cs.impl.MapPostLangImpl <em>Map Post Lang</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.MapPostLangImpl
	 * @see cs.impl.CsPackageImpl#getMapPostLang()
	 * @generated
	 */
	int MAP_POST_LANG = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_POST_LANG__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_POST_LANG__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Map Post Lang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_POST_LANG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Map Post Lang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_POST_LANG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cs.impl.NumPostImpl <em>Num Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.NumPostImpl
	 * @see cs.impl.CsPackageImpl#getNumPost()
	 * @generated
	 */
	int NUM_POST = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST__NAME = STATISTIC__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST__METRIC = STATISTIC__METRIC;

	/**
	 * The number of structural features of the '<em>Num Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_FEATURE_COUNT = STATISTIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Num Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_OPERATION_COUNT = STATISTIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.NumPhotoImpl <em>Num Photo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.NumPhotoImpl
	 * @see cs.impl.CsPackageImpl#getNumPhoto()
	 * @generated
	 */
	int NUM_PHOTO = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_PHOTO__NAME = STATISTIC__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_PHOTO__METRIC = STATISTIC__METRIC;

	/**
	 * The number of structural features of the '<em>Num Photo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_PHOTO_FEATURE_COUNT = STATISTIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Num Photo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_PHOTO_OPERATION_COUNT = STATISTIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.NumPostTimeSlotImpl <em>Num Post Time Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.NumPostTimeSlotImpl
	 * @see cs.impl.CsPackageImpl#getNumPostTimeSlot()
	 * @generated
	 */
	int NUM_POST_TIME_SLOT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_TIME_SLOT__NAME = STATISTIC__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_TIME_SLOT__METRIC = STATISTIC__METRIC;

	/**
	 * The feature id for the '<em><b>Posts Per Time Slot</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_TIME_SLOT__POSTS_PER_TIME_SLOT = STATISTIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Num Post Time Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_TIME_SLOT_FEATURE_COUNT = STATISTIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Num Post Time Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_TIME_SLOT_OPERATION_COUNT = STATISTIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.NumPostLangImpl <em>Num Post Lang</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.NumPostLangImpl
	 * @see cs.impl.CsPackageImpl#getNumPostLang()
	 * @generated
	 */
	int NUM_POST_LANG = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_LANG__NAME = STATISTIC__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_LANG__METRIC = STATISTIC__METRIC;

	/**
	 * The feature id for the '<em><b>Lang Number</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_LANG__LANG_NUMBER = STATISTIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Num Post Lang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_LANG_FEATURE_COUNT = STATISTIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Num Post Lang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POST_LANG_OPERATION_COUNT = STATISTIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.MapPostTimeSlotImpl <em>Map Post Time Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.MapPostTimeSlotImpl
	 * @see cs.impl.CsPackageImpl#getMapPostTimeSlot()
	 * @generated
	 */
	int MAP_POST_TIME_SLOT = 10;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_POST_TIME_SLOT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_POST_TIME_SLOT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Map Post Time Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_POST_TIME_SLOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Map Post Time Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_POST_TIME_SLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cs.impl.CategoriesCountImpl <em>Categories Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.CategoriesCountImpl
	 * @see cs.impl.CsPackageImpl#getCategoriesCount()
	 * @generated
	 */
	int CATEGORIES_COUNT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_COUNT__NAME = STATISTIC__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_COUNT__METRIC = STATISTIC__METRIC;

	/**
	 * The feature id for the '<em><b>Cat Number</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_COUNT__CAT_NUMBER = STATISTIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Categories Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_COUNT_FEATURE_COUNT = STATISTIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Categories Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_COUNT_OPERATION_COUNT = STATISTIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cs.impl.MapCategoriesImpl <em>Map Categories</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.impl.MapCategoriesImpl
	 * @see cs.impl.CsPackageImpl#getMapCategories()
	 * @generated
	 */
	int MAP_CATEGORIES = 12;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_CATEGORIES__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_CATEGORIES__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Map Categories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_CATEGORIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Map Categories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_CATEGORIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cs.Categories <em>Categories</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.Categories
	 * @see cs.impl.CsPackageImpl#getCategories()
	 * @generated
	 */
	int CATEGORIES = 13;

	/**
	 * The meta object id for the '{@link cs.Languages <em>Languages</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.Languages
	 * @see cs.impl.CsPackageImpl#getLanguages()
	 * @generated
	 */
	int LANGUAGES = 14;

	/**
	 * The meta object id for the '{@link cs.TimeSlots <em>Time Slots</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cs.TimeSlots
	 * @see cs.impl.CsPackageImpl#getTimeSlots()
	 * @generated
	 */
	int TIME_SLOTS = 15;


	/**
	 * Returns the meta object for class '{@link cs.MonitoredCity <em>Monitored City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitored City</em>'.
	 * @see cs.MonitoredCity
	 * @generated
	 */
	EClass getMonitoredCity();

	/**
	 * Returns the meta object for the attribute '{@link cs.MonitoredCity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cs.MonitoredCity#getName()
	 * @see #getMonitoredCity()
	 * @generated
	 */
	EAttribute getMonitoredCity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cs.MonitoredCity#getDistricts <em>Districts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Districts</em>'.
	 * @see cs.MonitoredCity#getDistricts()
	 * @see #getMonitoredCity()
	 * @generated
	 */
	EReference getMonitoredCity_Districts();

	/**
	 * Returns the meta object for the containment reference list '{@link cs.MonitoredCity#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stats</em>'.
	 * @see cs.MonitoredCity#getStats()
	 * @see #getMonitoredCity()
	 * @generated
	 */
	EReference getMonitoredCity_Stats();

	/**
	 * Returns the meta object for the attribute '{@link cs.MonitoredCity#getCoordBx <em>Coord Bx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coord Bx</em>'.
	 * @see cs.MonitoredCity#getCoordBx()
	 * @see #getMonitoredCity()
	 * @generated
	 */
	EAttribute getMonitoredCity_CoordBx();

	/**
	 * Returns the meta object for the attribute '{@link cs.MonitoredCity#getCoordBy <em>Coord By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coord By</em>'.
	 * @see cs.MonitoredCity#getCoordBy()
	 * @see #getMonitoredCity()
	 * @generated
	 */
	EAttribute getMonitoredCity_CoordBy();

	/**
	 * Returns the meta object for the attribute '{@link cs.MonitoredCity#getCoordEx <em>Coord Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coord Ex</em>'.
	 * @see cs.MonitoredCity#getCoordEx()
	 * @see #getMonitoredCity()
	 * @generated
	 */
	EAttribute getMonitoredCity_CoordEx();

	/**
	 * Returns the meta object for the attribute '{@link cs.MonitoredCity#getCoordEy <em>Coord Ey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coord Ey</em>'.
	 * @see cs.MonitoredCity#getCoordEy()
	 * @see #getMonitoredCity()
	 * @generated
	 */
	EAttribute getMonitoredCity_CoordEy();

	/**
	 * Returns the meta object for class '{@link cs.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see cs.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link cs.Place#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cs.Place#getName()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cs.Place#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stats</em>'.
	 * @see cs.Place#getStats()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Stats();

	/**
	 * Returns the meta object for class '{@link cs.Statistic <em>Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistic</em>'.
	 * @see cs.Statistic
	 * @generated
	 */
	EClass getStatistic();

	/**
	 * Returns the meta object for the attribute '{@link cs.Statistic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cs.Statistic#getName()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Name();

	/**
	 * Returns the meta object for the attribute '{@link cs.Statistic#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see cs.Statistic#getMetric()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Metric();

	/**
	 * Returns the meta object for class '{@link cs.District <em>District</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>District</em>'.
	 * @see cs.District
	 * @generated
	 */
	EClass getDistrict();

	/**
	 * Returns the meta object for the containment reference list '{@link cs.District#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see cs.District#getPlaces()
	 * @see #getDistrict()
	 * @generated
	 */
	EReference getDistrict_Places();

	/**
	 * Returns the meta object for the attribute '{@link cs.District#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cs.District#getName()
	 * @see #getDistrict()
	 * @generated
	 */
	EAttribute getDistrict_Name();

	/**
	 * Returns the meta object for the attribute '{@link cs.District#getCoordBx <em>Coord Bx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coord Bx</em>'.
	 * @see cs.District#getCoordBx()
	 * @see #getDistrict()
	 * @generated
	 */
	EAttribute getDistrict_CoordBx();

	/**
	 * Returns the meta object for the attribute '{@link cs.District#getCoordBy <em>Coord By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coord By</em>'.
	 * @see cs.District#getCoordBy()
	 * @see #getDistrict()
	 * @generated
	 */
	EAttribute getDistrict_CoordBy();

	/**
	 * Returns the meta object for the attribute '{@link cs.District#getCoordEx <em>Coord Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coord Ex</em>'.
	 * @see cs.District#getCoordEx()
	 * @see #getDistrict()
	 * @generated
	 */
	EAttribute getDistrict_CoordEx();

	/**
	 * Returns the meta object for the attribute '{@link cs.District#getCoordEy <em>Coord Ey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coord Ey</em>'.
	 * @see cs.District#getCoordEy()
	 * @see #getDistrict()
	 * @generated
	 */
	EAttribute getDistrict_CoordEy();

	/**
	 * Returns the meta object for the containment reference list '{@link cs.District#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stats</em>'.
	 * @see cs.District#getStats()
	 * @see #getDistrict()
	 * @generated
	 */
	EReference getDistrict_Stats();

	/**
	 * Returns the meta object for class '{@link cs.CitySensing <em>City Sensing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City Sensing</em>'.
	 * @see cs.CitySensing
	 * @generated
	 */
	EClass getCitySensing();

	/**
	 * Returns the meta object for the containment reference list '{@link cs.CitySensing#getCities <em>Cities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cities</em>'.
	 * @see cs.CitySensing#getCities()
	 * @see #getCitySensing()
	 * @generated
	 */
	EReference getCitySensing_Cities();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Map Post Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Post Lang</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="cs.Languages" keyRequired="true"
	 *        valueDataType="org.eclipse.emf.ecore.EIntegerObject" valueRequired="true"
	 *        annotation="gmf.node label='name'"
	 * @generated
	 */
	EClass getMapPostLang();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMapPostLang()
	 * @generated
	 */
	EAttribute getMapPostLang_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMapPostLang()
	 * @generated
	 */
	EAttribute getMapPostLang_Value();

	/**
	 * Returns the meta object for class '{@link cs.NumPost <em>Num Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Post</em>'.
	 * @see cs.NumPost
	 * @generated
	 */
	EClass getNumPost();

	/**
	 * Returns the meta object for class '{@link cs.NumPhoto <em>Num Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Photo</em>'.
	 * @see cs.NumPhoto
	 * @generated
	 */
	EClass getNumPhoto();

	/**
	 * Returns the meta object for class '{@link cs.NumPostTimeSlot <em>Num Post Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Post Time Slot</em>'.
	 * @see cs.NumPostTimeSlot
	 * @generated
	 */
	EClass getNumPostTimeSlot();

	/**
	 * Returns the meta object for the map '{@link cs.NumPostTimeSlot#getPostsPerTimeSlot <em>Posts Per Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Posts Per Time Slot</em>'.
	 * @see cs.NumPostTimeSlot#getPostsPerTimeSlot()
	 * @see #getNumPostTimeSlot()
	 * @generated
	 */
	EReference getNumPostTimeSlot_PostsPerTimeSlot();

	/**
	 * Returns the meta object for class '{@link cs.NumPostLang <em>Num Post Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Post Lang</em>'.
	 * @see cs.NumPostLang
	 * @generated
	 */
	EClass getNumPostLang();

	/**
	 * Returns the meta object for the map '{@link cs.NumPostLang#getLangNumber <em>Lang Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Lang Number</em>'.
	 * @see cs.NumPostLang#getLangNumber()
	 * @see #getNumPostLang()
	 * @generated
	 */
	EReference getNumPostLang_LangNumber();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Map Post Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Post Time Slot</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="cs.TimeSlots" keyRequired="true"
	 *        valueDataType="org.eclipse.emf.ecore.EIntegerObject" valueRequired="true"
	 *        annotation="gmf.node label='name'"
	 * @generated
	 */
	EClass getMapPostTimeSlot();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMapPostTimeSlot()
	 * @generated
	 */
	EAttribute getMapPostTimeSlot_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMapPostTimeSlot()
	 * @generated
	 */
	EAttribute getMapPostTimeSlot_Value();

	/**
	 * Returns the meta object for class '{@link cs.CategoriesCount <em>Categories Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categories Count</em>'.
	 * @see cs.CategoriesCount
	 * @generated
	 */
	EClass getCategoriesCount();

	/**
	 * Returns the meta object for the map '{@link cs.CategoriesCount#getCatNumber <em>Cat Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Cat Number</em>'.
	 * @see cs.CategoriesCount#getCatNumber()
	 * @see #getCategoriesCount()
	 * @generated
	 */
	EReference getCategoriesCount_CatNumber();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Map Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Categories</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="cs.Categories" keyRequired="true"
	 *        valueDataType="org.eclipse.emf.ecore.EIntegerObject" valueRequired="true"
	 *        annotation="gmf.node label='name'"
	 * @generated
	 */
	EClass getMapCategories();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMapCategories()
	 * @generated
	 */
	EAttribute getMapCategories_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMapCategories()
	 * @generated
	 */
	EAttribute getMapCategories_Value();

	/**
	 * Returns the meta object for enum '{@link cs.Categories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Categories</em>'.
	 * @see cs.Categories
	 * @generated
	 */
	EEnum getCategories();

	/**
	 * Returns the meta object for enum '{@link cs.Languages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Languages</em>'.
	 * @see cs.Languages
	 * @generated
	 */
	EEnum getLanguages();

	/**
	 * Returns the meta object for enum '{@link cs.TimeSlots <em>Time Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Slots</em>'.
	 * @see cs.TimeSlots
	 * @generated
	 */
	EEnum getTimeSlots();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CsFactory getCsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cs.impl.MonitoredCityImpl <em>Monitored City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.MonitoredCityImpl
		 * @see cs.impl.CsPackageImpl#getMonitoredCity()
		 * @generated
		 */
		EClass MONITORED_CITY = eINSTANCE.getMonitoredCity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORED_CITY__NAME = eINSTANCE.getMonitoredCity_Name();

		/**
		 * The meta object literal for the '<em><b>Districts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORED_CITY__DISTRICTS = eINSTANCE.getMonitoredCity_Districts();

		/**
		 * The meta object literal for the '<em><b>Stats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORED_CITY__STATS = eINSTANCE.getMonitoredCity_Stats();

		/**
		 * The meta object literal for the '<em><b>Coord Bx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORED_CITY__COORD_BX = eINSTANCE.getMonitoredCity_CoordBx();

		/**
		 * The meta object literal for the '<em><b>Coord By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORED_CITY__COORD_BY = eINSTANCE.getMonitoredCity_CoordBy();

		/**
		 * The meta object literal for the '<em><b>Coord Ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORED_CITY__COORD_EX = eINSTANCE.getMonitoredCity_CoordEx();

		/**
		 * The meta object literal for the '<em><b>Coord Ey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORED_CITY__COORD_EY = eINSTANCE.getMonitoredCity_CoordEy();

		/**
		 * The meta object literal for the '{@link cs.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.PlaceImpl
		 * @see cs.impl.CsPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NAME = eINSTANCE.getPlace_Name();

		/**
		 * The meta object literal for the '<em><b>Stats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__STATS = eINSTANCE.getPlace_Stats();

		/**
		 * The meta object literal for the '{@link cs.impl.StatisticImpl <em>Statistic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.StatisticImpl
		 * @see cs.impl.CsPackageImpl#getStatistic()
		 * @generated
		 */
		EClass STATISTIC = eINSTANCE.getStatistic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC__NAME = eINSTANCE.getStatistic_Name();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC__METRIC = eINSTANCE.getStatistic_Metric();

		/**
		 * The meta object literal for the '{@link cs.impl.DistrictImpl <em>District</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.DistrictImpl
		 * @see cs.impl.CsPackageImpl#getDistrict()
		 * @generated
		 */
		EClass DISTRICT = eINSTANCE.getDistrict();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRICT__PLACES = eINSTANCE.getDistrict_Places();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRICT__NAME = eINSTANCE.getDistrict_Name();

		/**
		 * The meta object literal for the '<em><b>Coord Bx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRICT__COORD_BX = eINSTANCE.getDistrict_CoordBx();

		/**
		 * The meta object literal for the '<em><b>Coord By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRICT__COORD_BY = eINSTANCE.getDistrict_CoordBy();

		/**
		 * The meta object literal for the '<em><b>Coord Ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRICT__COORD_EX = eINSTANCE.getDistrict_CoordEx();

		/**
		 * The meta object literal for the '<em><b>Coord Ey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRICT__COORD_EY = eINSTANCE.getDistrict_CoordEy();

		/**
		 * The meta object literal for the '<em><b>Stats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRICT__STATS = eINSTANCE.getDistrict_Stats();

		/**
		 * The meta object literal for the '{@link cs.impl.CitySensingImpl <em>City Sensing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.CitySensingImpl
		 * @see cs.impl.CsPackageImpl#getCitySensing()
		 * @generated
		 */
		EClass CITY_SENSING = eINSTANCE.getCitySensing();

		/**
		 * The meta object literal for the '<em><b>Cities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_SENSING__CITIES = eINSTANCE.getCitySensing_Cities();

		/**
		 * The meta object literal for the '{@link cs.impl.MapPostLangImpl <em>Map Post Lang</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.MapPostLangImpl
		 * @see cs.impl.CsPackageImpl#getMapPostLang()
		 * @generated
		 */
		EClass MAP_POST_LANG = eINSTANCE.getMapPostLang();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_POST_LANG__KEY = eINSTANCE.getMapPostLang_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_POST_LANG__VALUE = eINSTANCE.getMapPostLang_Value();

		/**
		 * The meta object literal for the '{@link cs.impl.NumPostImpl <em>Num Post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.NumPostImpl
		 * @see cs.impl.CsPackageImpl#getNumPost()
		 * @generated
		 */
		EClass NUM_POST = eINSTANCE.getNumPost();

		/**
		 * The meta object literal for the '{@link cs.impl.NumPhotoImpl <em>Num Photo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.NumPhotoImpl
		 * @see cs.impl.CsPackageImpl#getNumPhoto()
		 * @generated
		 */
		EClass NUM_PHOTO = eINSTANCE.getNumPhoto();

		/**
		 * The meta object literal for the '{@link cs.impl.NumPostTimeSlotImpl <em>Num Post Time Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.NumPostTimeSlotImpl
		 * @see cs.impl.CsPackageImpl#getNumPostTimeSlot()
		 * @generated
		 */
		EClass NUM_POST_TIME_SLOT = eINSTANCE.getNumPostTimeSlot();

		/**
		 * The meta object literal for the '<em><b>Posts Per Time Slot</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUM_POST_TIME_SLOT__POSTS_PER_TIME_SLOT = eINSTANCE.getNumPostTimeSlot_PostsPerTimeSlot();

		/**
		 * The meta object literal for the '{@link cs.impl.NumPostLangImpl <em>Num Post Lang</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.NumPostLangImpl
		 * @see cs.impl.CsPackageImpl#getNumPostLang()
		 * @generated
		 */
		EClass NUM_POST_LANG = eINSTANCE.getNumPostLang();

		/**
		 * The meta object literal for the '<em><b>Lang Number</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUM_POST_LANG__LANG_NUMBER = eINSTANCE.getNumPostLang_LangNumber();

		/**
		 * The meta object literal for the '{@link cs.impl.MapPostTimeSlotImpl <em>Map Post Time Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.MapPostTimeSlotImpl
		 * @see cs.impl.CsPackageImpl#getMapPostTimeSlot()
		 * @generated
		 */
		EClass MAP_POST_TIME_SLOT = eINSTANCE.getMapPostTimeSlot();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_POST_TIME_SLOT__KEY = eINSTANCE.getMapPostTimeSlot_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_POST_TIME_SLOT__VALUE = eINSTANCE.getMapPostTimeSlot_Value();

		/**
		 * The meta object literal for the '{@link cs.impl.CategoriesCountImpl <em>Categories Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.CategoriesCountImpl
		 * @see cs.impl.CsPackageImpl#getCategoriesCount()
		 * @generated
		 */
		EClass CATEGORIES_COUNT = eINSTANCE.getCategoriesCount();

		/**
		 * The meta object literal for the '<em><b>Cat Number</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIES_COUNT__CAT_NUMBER = eINSTANCE.getCategoriesCount_CatNumber();

		/**
		 * The meta object literal for the '{@link cs.impl.MapCategoriesImpl <em>Map Categories</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.impl.MapCategoriesImpl
		 * @see cs.impl.CsPackageImpl#getMapCategories()
		 * @generated
		 */
		EClass MAP_CATEGORIES = eINSTANCE.getMapCategories();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_CATEGORIES__KEY = eINSTANCE.getMapCategories_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_CATEGORIES__VALUE = eINSTANCE.getMapCategories_Value();

		/**
		 * The meta object literal for the '{@link cs.Categories <em>Categories</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.Categories
		 * @see cs.impl.CsPackageImpl#getCategories()
		 * @generated
		 */
		EEnum CATEGORIES = eINSTANCE.getCategories();

		/**
		 * The meta object literal for the '{@link cs.Languages <em>Languages</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.Languages
		 * @see cs.impl.CsPackageImpl#getLanguages()
		 * @generated
		 */
		EEnum LANGUAGES = eINSTANCE.getLanguages();

		/**
		 * The meta object literal for the '{@link cs.TimeSlots <em>Time Slots</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cs.TimeSlots
		 * @see cs.impl.CsPackageImpl#getTimeSlots()
		 * @generated
		 */
		EEnum TIME_SLOTS = eINSTANCE.getTimeSlots();

	}

} //CsPackage
