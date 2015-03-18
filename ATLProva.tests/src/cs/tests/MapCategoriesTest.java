/**
 */
package cs.tests;

import cs.Categories;
import cs.CsFactory;
import cs.CsPackage;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Map Categories</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MapCategoriesTest extends TestCase {

	/**
	 * The fixture for this Map Categories test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<Categories, Integer> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MapCategoriesTest.class);
	}

	/**
	 * Constructs a new Map Categories test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapCategoriesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Map Categories test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<Categories, Integer> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Map Categories test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<Categories, Integer> getFixture() {
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
		setFixture((Map.Entry<Categories, Integer>)CsFactory.eINSTANCE.create(CsPackage.Literals.MAP_CATEGORIES));
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

} //MapCategoriesTest
