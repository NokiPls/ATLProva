/**
 */
package smr.tests;

import junit.textui.TestRunner;

import smr.Mention;
import smr.SmrFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mention</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MentionTest extends TagTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MentionTest.class);
	}

	/**
	 * Constructs a new Mention test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MentionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mention test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Mention getFixture() {
		return (Mention)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmrFactory.eINSTANCE.createMention());
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

} //MentionTest
