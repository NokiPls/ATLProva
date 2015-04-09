/**
 */
package cs.tests;

import cs.CsFactory;
import cs.NumPostTimeSlot;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Num Post Time Slot</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumPostTimeSlotTest extends StatisticTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NumPostTimeSlotTest.class);
	}

	/**
	 * Constructs a new Num Post Time Slot test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumPostTimeSlotTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Num Post Time Slot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NumPostTimeSlot getFixture() {
		return (NumPostTimeSlot)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CsFactory.eINSTANCE.createNumPostTimeSlot());
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

} //NumPostTimeSlotTest
