/**
 */
package city.impl;

import city.City;
import city.CityPackage;
import city.District;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link city.impl.CityImpl#getName <em>Name</em>}</li>
 *   <li>{@link city.impl.CityImpl#getDistricts <em>Districts</em>}</li>
 *   <li>{@link city.impl.CityImpl#getCoordBx <em>Coord Bx</em>}</li>
 *   <li>{@link city.impl.CityImpl#getCoordBy <em>Coord By</em>}</li>
 *   <li>{@link city.impl.CityImpl#getCoordEx <em>Coord Ex</em>}</li>
 *   <li>{@link city.impl.CityImpl#getCoordEy <em>Coord Ey</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CityImpl extends MinimalEObjectImpl.Container implements City {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDistricts() <em>Districts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistricts()
	 * @generated
	 * @ordered
	 */
	protected EList<District> districts;

	/**
	 * The default value of the '{@link #getCoordBx() <em>Coord Bx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordBx()
	 * @generated
	 * @ordered
	 */
	protected static final float COORD_BX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoordBx() <em>Coord Bx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordBx()
	 * @generated
	 * @ordered
	 */
	protected float coordBx = COORD_BX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordBy() <em>Coord By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordBy()
	 * @generated
	 * @ordered
	 */
	protected static final float COORD_BY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoordBy() <em>Coord By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordBy()
	 * @generated
	 * @ordered
	 */
	protected float coordBy = COORD_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordEx() <em>Coord Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordEx()
	 * @generated
	 * @ordered
	 */
	protected static final float COORD_EX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoordEx() <em>Coord Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordEx()
	 * @generated
	 * @ordered
	 */
	protected float coordEx = COORD_EX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordEy() <em>Coord Ey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordEy()
	 * @generated
	 * @ordered
	 */
	protected static final float COORD_EY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoordEy() <em>Coord Ey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordEy()
	 * @generated
	 * @ordered
	 */
	protected float coordEy = COORD_EY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CityPackage.Literals.CITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.CITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<District> getDistricts() {
		if (districts == null) {
			districts = new EObjectContainmentEList<District>(District.class, this, CityPackage.CITY__DISTRICTS);
		}
		return districts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoordBx() {
		return coordBx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordBx(float newCoordBx) {
		float oldCoordBx = coordBx;
		coordBx = newCoordBx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.CITY__COORD_BX, oldCoordBx, coordBx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoordBy() {
		return coordBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordBy(float newCoordBy) {
		float oldCoordBy = coordBy;
		coordBy = newCoordBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.CITY__COORD_BY, oldCoordBy, coordBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoordEx() {
		return coordEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordEx(float newCoordEx) {
		float oldCoordEx = coordEx;
		coordEx = newCoordEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.CITY__COORD_EX, oldCoordEx, coordEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoordEy() {
		return coordEy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordEy(float newCoordEy) {
		float oldCoordEy = coordEy;
		coordEy = newCoordEy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityPackage.CITY__COORD_EY, oldCoordEy, coordEy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CityPackage.CITY__DISTRICTS:
				return ((InternalEList<?>)getDistricts()).basicRemove(otherEnd, msgs);
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
			case CityPackage.CITY__NAME:
				return getName();
			case CityPackage.CITY__DISTRICTS:
				return getDistricts();
			case CityPackage.CITY__COORD_BX:
				return getCoordBx();
			case CityPackage.CITY__COORD_BY:
				return getCoordBy();
			case CityPackage.CITY__COORD_EX:
				return getCoordEx();
			case CityPackage.CITY__COORD_EY:
				return getCoordEy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CityPackage.CITY__NAME:
				setName((String)newValue);
				return;
			case CityPackage.CITY__DISTRICTS:
				getDistricts().clear();
				getDistricts().addAll((Collection<? extends District>)newValue);
				return;
			case CityPackage.CITY__COORD_BX:
				setCoordBx((Float)newValue);
				return;
			case CityPackage.CITY__COORD_BY:
				setCoordBy((Float)newValue);
				return;
			case CityPackage.CITY__COORD_EX:
				setCoordEx((Float)newValue);
				return;
			case CityPackage.CITY__COORD_EY:
				setCoordEy((Float)newValue);
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
			case CityPackage.CITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CityPackage.CITY__DISTRICTS:
				getDistricts().clear();
				return;
			case CityPackage.CITY__COORD_BX:
				setCoordBx(COORD_BX_EDEFAULT);
				return;
			case CityPackage.CITY__COORD_BY:
				setCoordBy(COORD_BY_EDEFAULT);
				return;
			case CityPackage.CITY__COORD_EX:
				setCoordEx(COORD_EX_EDEFAULT);
				return;
			case CityPackage.CITY__COORD_EY:
				setCoordEy(COORD_EY_EDEFAULT);
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
			case CityPackage.CITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CityPackage.CITY__DISTRICTS:
				return districts != null && !districts.isEmpty();
			case CityPackage.CITY__COORD_BX:
				return coordBx != COORD_BX_EDEFAULT;
			case CityPackage.CITY__COORD_BY:
				return coordBy != COORD_BY_EDEFAULT;
			case CityPackage.CITY__COORD_EX:
				return coordEx != COORD_EX_EDEFAULT;
			case CityPackage.CITY__COORD_EY:
				return coordEy != COORD_EY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", coordBx: ");
		result.append(coordBx);
		result.append(", coordBy: ");
		result.append(coordBy);
		result.append(", coordEx: ");
		result.append(coordEx);
		result.append(", coordEy: ");
		result.append(coordEy);
		result.append(')');
		return result.toString();
	}

} //CityImpl
