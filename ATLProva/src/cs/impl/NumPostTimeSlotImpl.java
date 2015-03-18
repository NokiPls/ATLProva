/**
 */
package cs.impl;

import cs.CsPackage;
import cs.NumPostTimeSlot;
import cs.TimeSlots;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Num Post Time Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.impl.NumPostTimeSlotImpl#getPostsPerTimeSlot <em>Posts Per Time Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumPostTimeSlotImpl extends StatisticImpl implements NumPostTimeSlot {
	/**
	 * The cached value of the '{@link #getPostsPerTimeSlot() <em>Posts Per Time Slot</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostsPerTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected EMap<TimeSlots, Integer> postsPerTimeSlot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumPostTimeSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.NUM_POST_TIME_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<TimeSlots, Integer> getPostsPerTimeSlot() {
		if (postsPerTimeSlot == null) {
			postsPerTimeSlot = new EcoreEMap<TimeSlots,Integer>(CsPackage.Literals.MAP_POST_TIME_SLOT, MapPostTimeSlotImpl.class, this, CsPackage.NUM_POST_TIME_SLOT__POSTS_PER_TIME_SLOT);
		}
		return postsPerTimeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.NUM_POST_TIME_SLOT__POSTS_PER_TIME_SLOT:
				return ((InternalEList<?>)getPostsPerTimeSlot()).basicRemove(otherEnd, msgs);
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
			case CsPackage.NUM_POST_TIME_SLOT__POSTS_PER_TIME_SLOT:
				if (coreType) return getPostsPerTimeSlot();
				else return getPostsPerTimeSlot().map();
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
			case CsPackage.NUM_POST_TIME_SLOT__POSTS_PER_TIME_SLOT:
				((EStructuralFeature.Setting)getPostsPerTimeSlot()).set(newValue);
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
			case CsPackage.NUM_POST_TIME_SLOT__POSTS_PER_TIME_SLOT:
				getPostsPerTimeSlot().clear();
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
			case CsPackage.NUM_POST_TIME_SLOT__POSTS_PER_TIME_SLOT:
				return postsPerTimeSlot != null && !postsPerTimeSlot.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NumPostTimeSlotImpl
