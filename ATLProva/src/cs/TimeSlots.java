/**
 */
package cs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Slots</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cs.CsPackage#getTimeSlots()
 * @model
 * @generated
 */
public enum TimeSlots implements Enumerator {
	/**
	 * The '<em><b>Morning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MORNING_VALUE
	 * @generated
	 * @ordered
	 */
	MORNING(1, "Morning", "Morning"),

	/**
	 * The '<em><b>Afternoon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTERNOON_VALUE
	 * @generated
	 * @ordered
	 */
	AFTERNOON(2, "Afternoon", "Afternoon"),

	/**
	 * The '<em><b>Evening</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENING_VALUE
	 * @generated
	 * @ordered
	 */
	EVENING(3, "Evening", "Evening"),

	/**
	 * The '<em><b>Night</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	NIGHT(4, "Night", "Night");

	/**
	 * The '<em><b>Morning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Morning</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MORNING
	 * @model name="Morning"
	 * @generated
	 * @ordered
	 */
	public static final int MORNING_VALUE = 1;

	/**
	 * The '<em><b>Afternoon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Afternoon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTERNOON
	 * @model name="Afternoon"
	 * @generated
	 * @ordered
	 */
	public static final int AFTERNOON_VALUE = 2;

	/**
	 * The '<em><b>Evening</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Evening</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENING
	 * @model name="Evening"
	 * @generated
	 * @ordered
	 */
	public static final int EVENING_VALUE = 3;

	/**
	 * The '<em><b>Night</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Night</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NIGHT
	 * @model name="Night"
	 * @generated
	 * @ordered
	 */
	public static final int NIGHT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Time Slots</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeSlots[] VALUES_ARRAY =
		new TimeSlots[] {
			MORNING,
			AFTERNOON,
			EVENING,
			NIGHT,
		};

	/**
	 * A public read-only list of all the '<em><b>Time Slots</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeSlots> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Slots</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimeSlots get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeSlots result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Slots</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimeSlots getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeSlots result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Slots</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimeSlots get(int value) {
		switch (value) {
			case MORNING_VALUE: return MORNING;
			case AFTERNOON_VALUE: return AFTERNOON;
			case EVENING_VALUE: return EVENING;
			case NIGHT_VALUE: return NIGHT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimeSlots(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TimeSlots
