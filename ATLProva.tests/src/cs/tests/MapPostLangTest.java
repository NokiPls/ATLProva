/**
 */
package cs.tests;

import cs.CsFactory;
import cs.CsPackage;
import cs.Languages;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Map Post Lang</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MapPostLangTest extends TestCase {

	/**
	 * The fixture for this Map Post Lang test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<Languages, Integer> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MapPostLangTest.class);
	}

	/**
	 * Constructs a new Map Post Lang test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapPostLangTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Map Post Lang test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<Languages, Integer> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Map Post Lang test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<Languages, Integer> getFixture() {
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
		setFixture((Map.Entry<Languages, Integer>)CsFactory.eINSTANCE.create(CsPackage.Literals.MAP_POST_LANG));
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

} //MapPostLangTest
