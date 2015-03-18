/**
 */
package cs.tests;

import cs.CsFactory;
import cs.CsPackage;
import cs.TimeSlots;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Map Post Time Slot</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MapPostTimeSlotTest extends TestCase {

	/**
	 * The fixture for this Map Post Time Slot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<TimeSlots, Integer> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MapPostTimeSlotTest.class);
	}

	/**
	 * Constructs a new Map Post Time Slot test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapPostTimeSlotTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Map Post Time Slot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<TimeSlots, Integer> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Map Post Time Slot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<TimeSlots, Integer> getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
		setFixture((Map.Entry<TimeSlots, Integer>)CsFactory.eINSTANCE.create(CsPackage.Literals.MAP_POST_TIME_SLOT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MapPostTimeSlotTest
