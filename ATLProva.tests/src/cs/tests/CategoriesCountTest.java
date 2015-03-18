/**
 */
package cs.tests;

import cs.CategoriesCount;
import cs.CsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Categories Count</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CategoriesCountTest extends StatisticTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CategoriesCountTest.class);
	}

	/**
	 * Constructs a new Categories Count test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoriesCountTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Categories Count test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CategoriesCount getFixture() {
		return (CategoriesCount)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CsFactory.eINSTANCE.createCategoriesCount());
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

} //CategoriesCountTest
