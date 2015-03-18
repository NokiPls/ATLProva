/**
 */
package cs.impl;

import cs.Categories;
import cs.CategoriesCount;
import cs.CsPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categories Count</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.impl.CategoriesCountImpl#getCatNumber <em>Cat Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoriesCountImpl extends StatisticImpl implements CategoriesCount {
	/**
	 * The cached value of the '{@link #getCatNumber() <em>Cat Number</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatNumber()
	 * @generated
	 * @ordered
	 */
	protected EMap<Categories, Integer> catNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoriesCountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.CATEGORIES_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Categories, Integer> getCatNumber() {
		if (catNumber == null) {
			catNumber = new EcoreEMap<Categories,Integer>(CsPackage.Literals.MAP_CATEGORIES, MapCategoriesImpl.class, this, CsPackage.CATEGORIES_COUNT__CAT_NUMBER);
		}
		return catNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.CATEGORIES_COUNT__CAT_NUMBER:
				return ((InternalEList<?>)getCatNumber()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.CATEGORIES_COUNT__CAT_NUMBER:
				if (coreType) return getCatNumber();
				else return getCatNumber().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CsPackage.CATEGORIES_COUNT__CAT_NUMBER:
				((EStructuralFeature.Setting)getCatNumber()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CsPackage.CATEGORIES_COUNT__CAT_NUMBER:
				getCatNumber().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CsPackage.CATEGORIES_COUNT__CAT_NUMBER:
				return catNumber != null && !catNumber.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CategoriesCountImpl
