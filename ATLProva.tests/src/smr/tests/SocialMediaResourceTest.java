/**
 */
package smr.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import smr.SmrFactory;
import smr.SocialMediaResource;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Social Media Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SocialMediaResourceTest extends TestCase {

	/**
	 * The fixture for this Social Media Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialMediaResource fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SocialMediaResourceTest.class);
	}

	/**
	 * Constructs a new Social Media Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialMediaResourceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Social Media Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SocialMediaResource fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Social Media Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialMediaResource getFixture() {
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
		setFixture(SmrFactory.eINSTANCE.createSocialMediaResource());
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

} //SocialMediaResourceTest
