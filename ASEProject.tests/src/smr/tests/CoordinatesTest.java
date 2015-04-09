/**
 */
package smr.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import smr.Coordinates;
import smr.SmrFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinatesTest extends TestCase {

	/**
	 * The fixture for this Coordinates test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Coordinates fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CoordinatesTest.class);
	}

	/**
	 * Constructs a new Coordinates test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Coordinates test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Coordinates fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Coordinates test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Coordinates getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmrFactory.eINSTANCE.createCoordinates());
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

} //CoordinatesTest
