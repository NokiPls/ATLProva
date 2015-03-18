/**
 */
package cs.util;

import cs.*;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cs.CsPackage
 * @generated
 */
public class CsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsSwitch() {
		if (modelPackage == null) {
			modelPackage = CsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CsPackage.MONITORED_CITY: {
				MonitoredCity monitoredCity = (MonitoredCity)theEObject;
				T result = caseMonitoredCity(monitoredCity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.PLACE: {
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.STATISTIC: {
				Statistic statistic = (Statistic)theEObject;
				T result = caseStatistic(statistic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.DISTRICT: {
				District district = (District)theEObject;
				T result = caseDistrict(district);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.CITY_SENSING: {
				CitySensing citySensing = (CitySensing)theEObject;
				T result = caseCitySensing(citySensing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.MAP_POST_LANG: {
				@SuppressWarnings("unchecked") Map.Entry<Languages, Integer> mapPostLang = (Map.Entry<Languages, Integer>)theEObject;
				T result = caseMapPostLang(mapPostLang);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.NUM_POST: {
				NumPost numPost = (NumPost)theEObject;
				T result = caseNumPost(numPost);
				if (result == null) result = caseStatistic(numPost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.NUM_PHOTO: {
				NumPhoto numPhoto = (NumPhoto)theEObject;
				T result = caseNumPhoto(numPhoto);
				if (result == null) result = caseStatistic(numPhoto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.NUM_POST_TIME_SLOT: {
				NumPostTimeSlot numPostTimeSlot = (NumPostTimeSlot)theEObject;
				T result = caseNumPostTimeSlot(numPostTimeSlot);
				if (result == null) result = caseStatistic(numPostTimeSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.NUM_POST_LANG: {
				NumPostLang numPostLang = (NumPostLang)theEObject;
				T result = caseNumPostLang(numPostLang);
				if (result == null) result = caseStatistic(numPostLang);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.MAP_POST_TIME_SLOT: {
				@SuppressWarnings("unchecked") Map.Entry<TimeSlots, Integer> mapPostTimeSlot = (Map.Entry<TimeSlots, Integer>)theEObject;
				T result = caseMapPostTimeSlot(mapPostTimeSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.CATEGORIES_COUNT: {
				CategoriesCount categoriesCount = (CategoriesCount)theEObject;
				T result = caseCategoriesCount(categoriesCount);
				if (result == null) result = caseStatistic(categoriesCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CsPackage.MAP_CATEGORIES: {
				@SuppressWarnings("unchecked") Map.Entry<Categories, Integer> mapCategories = (Map.Entry<Categories, Integer>)theEObject;
				T result = caseMapCategories(mapCategories);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitored City</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitored City</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoredCity(MonitoredCity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatistic(Statistic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>District</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>District</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistrict(District object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>City Sensing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>City Sensing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitySensing(CitySensing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Post Lang</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Post Lang</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapPostLang(Map.Entry<Languages, Integer> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Num Post</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Num Post</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumPost(NumPost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Num Photo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Num Photo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumPhoto(NumPhoto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Num Post Time Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Num Post Time Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumPostTimeSlot(NumPostTimeSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Num Post Lang</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Num Post Lang</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumPostLang(NumPostLang object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Post Time Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Post Time Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapPostTimeSlot(Map.Entry<TimeSlots, Integer> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categories Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categories Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoriesCount(CategoriesCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Categories</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Categories</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapCategories(Map.Entry<Categories, Integer> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CsSwitch
