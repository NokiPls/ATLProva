/**
 */
package cs;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categories Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.CategoriesCount#getCatNumber <em>Cat Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.CsPackage#getCategoriesCount()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface CategoriesCount extends Statistic {
	/**
	 * Returns the value of the '<em><b>Cat Number</b></em>' map.
	 * The key is of type {@link cs.Categories},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cat Number</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cat Number</em>' map.
	 * @see cs.CsPackage#getCategoriesCount_CatNumber()
	 * @model mapType="cs.MapCategories<cs.Categories, org.eclipse.emf.ecore.EIntegerObject>"
	 * @generated
	 */
	EMap<Categories, Integer> getCatNumber();

} // CategoriesCount
