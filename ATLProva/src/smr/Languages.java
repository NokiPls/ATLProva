/**
 */
package smr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Languages</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see smr.SmrPackage#getLanguages()
 * @model
 * @generated
 */
public enum Languages implements Enumerator {
	/**
	 * The '<em><b>English</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENGLISH_VALUE
	 * @generated
	 * @ordered
	 */
	ENGLISH(2, "English", ""),

	/**
	 * The '<em><b>Spanish</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPANISH_VALUE
	 * @generated
	 * @ordered
	 */
	SPANISH(1, "Spanish", "Spanish"), /**
	 * The '<em><b>Lassa Sta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LASSA_STA_VALUE
	 * @generated
	 * @ordered
	 */
	LASSA_STA(3, "LassaSta", "LassaSta");

	/**
	 * The '<em><b>English</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>English</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENGLISH
	 * @model name="English" literal=""
	 * @generated
	 * @ordered
	 */
	public static final int ENGLISH_VALUE = 2;

	/**
	 * The '<em><b>Spanish</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spanish</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPANISH
	 * @model name="Spanish"
	 * @generated
	 * @ordered
	 */
	public static final int SPANISH_VALUE = 1;

	/**
	 * The '<em><b>Lassa Sta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lassa Sta</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LASSA_STA
	 * @model name="LassaSta"
	 * @generated
	 * @ordered
	 */
	public static final int LASSA_STA_VALUE = 3;

	/**
	 * An array of all the '<em><b>Languages</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Languages[] VALUES_ARRAY =
		new Languages[] {
			ENGLISH,
			SPANISH,
			LASSA_STA,
		};

	/**
	 * A public read-only list of all the '<em><b>Languages</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Languages> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Languages</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Languages get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Languages result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Languages</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Languages getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Languages result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Languages</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Languages get(int value) {
		switch (value) {
			case ENGLISH_VALUE: return ENGLISH;
			case SPANISH_VALUE: return SPANISH;
			case LASSA_STA_VALUE: return LASSA_STA;
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
	private Languages(int value, String name, String literal) {
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
	
} //Languages
