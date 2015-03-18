/**
 */
package smr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smr.Location#getCity <em>City</em>}</li>
 *   <li>{@link smr.Location#getAddress <em>Address</em>}</li>
 *   <li>{@link smr.Location#getPlace <em>Place</em>}</li>
 *   <li>{@link smr.Location#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link smr.Location#getDistrict <em>District</em>}</li>
 * </ul>
 * </p>
 *
 * @see smr.SmrPackage#getLocation()
 * @model annotation="gmf.node label='city'"
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see smr.SmrPackage#getLocation_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link smr.Location#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see smr.SmrPackage#getLocation_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link smr.Location#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' containment reference.
	 * @see #setPlace(Place)
	 * @see smr.SmrPackage#getLocation_Place()
	 * @model containment="true"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link smr.Location#getPlace <em>Place</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' containment reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference.
	 * @see #setCoordinates(Coordinates)
	 * @see smr.SmrPackage#getLocation_Coordinates()
	 * @model containment="true"
	 * @generated
	 */
	Coordinates getCoordinates();

	/**
	 * Sets the value of the '{@link smr.Location#getCoordinates <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' containment reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(Coordinates value);

	/**
	 * Returns the value of the '<em><b>District</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>District</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>District</em>' attribute.
	 * @see #setDistrict(String)
	 * @see smr.SmrPackage#getLocation_District()
	 * @model
	 * @generated
	 */
	String getDistrict();

	/**
	 * Sets the value of the '{@link smr.Location#getDistrict <em>District</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>District</em>' attribute.
	 * @see #getDistrict()
	 * @generated
	 */
	void setDistrict(String value);

} // Location
