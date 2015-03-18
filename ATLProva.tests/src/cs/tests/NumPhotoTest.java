/**
 */
package cs.tests;

import cs.CsFactory;
import cs.NumPhoto;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Num Photo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumPhotoTest extends StatisticTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NumPhotoTest.class);
	}

	/**
	 * Constructs a new Num Photo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumPhotoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Num Photo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NumPhoto getFixture() {
		return (NumPhoto)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CsFactory.eINSTANCE.createNumPhoto());
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

} //NumPhotoTest
