/**
 */
package smr;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smr.Post#getId <em>Id</em>}</li>
 *   <li>{@link smr.Post#getSourcesn <em>Sourcesn</em>}</li>
 *   <li>{@link smr.Post#getPlace <em>Place</em>}</li>
 *   <li>{@link smr.Post#getText <em>Text</em>}</li>
 *   <li>{@link smr.Post#getPictures <em>Pictures</em>}</li>
 *   <li>{@link smr.Post#getCategories <em>Categories</em>}</li>
 *   <li>{@link smr.Post#getTime <em>Time</em>}</li>
 *   <li>{@link smr.Post#getAuthor <em>Author</em>}</li>
 *   <li>{@link smr.Post#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see smr.SmrPackage#getPost()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Post extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see smr.SmrPackage#getPost_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link smr.Post#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Sourcesn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sourcesn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcesn</em>' attribute.
	 * @see #setSourcesn(String)
	 * @see smr.SmrPackage#getPost_Sourcesn()
	 * @model required="true"
	 * @generated
	 */
	String getSourcesn();

	/**
	 * Sets the value of the '{@link smr.Post#getSourcesn <em>Sourcesn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sourcesn</em>' attribute.
	 * @see #getSourcesn()
	 * @generated
	 */
	void setSourcesn(String value);

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
	 * @see smr.SmrPackage#getPost_Place()
	 * @model containment="true"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link smr.Post#getPlace <em>Place</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' containment reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(Text)
	 * @see smr.SmrPackage#getPost_Text()
	 * @model containment="true"
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link smr.Post#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

	/**
	 * Returns the value of the '<em><b>Pictures</b></em>' containment reference list.
	 * The list contents are of type {@link smr.Picture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pictures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pictures</em>' containment reference list.
	 * @see smr.SmrPackage#getPost_Pictures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Picture> getPictures();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link smr.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see smr.SmrPackage#getPost_Categories()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Date)
	 * @see smr.SmrPackage#getPost_Time()
	 * @model
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link smr.Post#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Author)
	 * @see smr.SmrPackage#getPost_Author()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Author getAuthor();

	/**
	 * Sets the value of the '{@link smr.Post#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Author value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link smr.Languages}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see smr.Languages
	 * @see #setLanguage(Languages)
	 * @see smr.SmrPackage#getPost_Language()
	 * @model
	 * @generated
	 */
	Languages getLanguage();

	/**
	 * Sets the value of the '{@link smr.Post#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see smr.Languages
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Languages value);

} // Post
