/**
 */
package cs;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Num Post Time Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.NumPostTimeSlot#getPostsPerTimeSlot <em>Posts Per Time Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.CsPackage#getNumPostTimeSlot()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface NumPostTimeSlot extends Statistic {
	/**
	 * Returns the value of the '<em><b>Posts Per Time Slot</b></em>' map.
	 * The key is of type {@link cs.TimeSlots},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posts Per Time Slot</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posts Per Time Slot</em>' map.
	 * @see cs.CsPackage#getNumPostTimeSlot_PostsPerTimeSlot()
	 * @model mapType="cs.MapPostTimeSlot<cs.TimeSlots, org.eclipse.emf.ecore.EIntegerObject>"
	 * @generated
	 */
	EMap<TimeSlots, Integer> getPostsPerTimeSlot();

} // NumPostTimeSlot
