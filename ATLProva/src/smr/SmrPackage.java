/**
 */
package smr;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see smr.SmrFactory
 * @model kind="package"
 * @generated
 */
public interface SmrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://smr/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmrPackage eINSTANCE = smr.impl.SmrPackageImpl.init();

	/**
	 * The meta object id for the '{@link smr.impl.PostImpl <em>Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smr.impl.PostImpl
	 * @see smr.impl.SmrPackageImpl#getPost()
	 * @generated
	 */
	int POST = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__ID = 0;

	/**
	 * The feature id for the '<em><b>Sourcesn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__SOURCESN = 1;

	/**
	 * The feature id for the '<em><b>Place</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__PLACE = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__TEXT = 3;

	/**
	 * The feature id for the '<em><b>Pictures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__PICTURES = 4;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CATEGORIES = 5;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__TIME = 6;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__AUTHOR = 7;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__LANGUAGE = 8;

	/**
	 * The number of structural features of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smr.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smr.impl.PlaceImpl
	 * @see smr.impl.SmrPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__CITY = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__COORDINATES = 3;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smr.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smr.impl.TextImpl
	 * @see smr.impl.SmrPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TAGS = 2;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smr.impl.PictureImpl <em>Picture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smr.impl.PictureImpl
	 * @see smr.impl.SmrPackageImpl#getPicture()
	 * @generated
	 */
	int PICTURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__TAGS = 1;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__PLACE = 2;

	/**
	 * The number of structural features of the '<em>Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smr.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smr.impl.AuthorImpl
	 * @see smr.impl.SmrPackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__LANGUAGE = 1;

	/**
	 * The feature id for the '<em><b>Current City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__CURRENT_CITY = 2;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smr.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smr.impl.CategoryImpl
	 * @see smr.impl.SmrPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smr.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smr.impl.LocationImpl
	 * @see smr.impl.SmrPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smr.impl.CoordinatesImpl <em>Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smr.impl.CoordinatesImpl
	 * @see smr.impl.SmrPackageImpl#getCoordinates()
	 * @generated
	 */
	int COORDINATES = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Coordx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__COORDX = 1;

	/**
	 * The feature id for the '<em><b>Coordy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__COORDY = 2;

	/**
	 * The number of structural features of the '<em>Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smr.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smr.impl.TagImpl
	 * @see smr.impl.SmrPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 9;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smr.impl.HashtagImpl <em>Hashtag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smr.impl.HashtagImpl
	 * @see smr.impl.SmrPackageImpl#getHashtag()
	 * @generated
	 */
	int HASHTAG = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG__TEXT = TAG__TEXT;

	/**
	 * The number of structural features of the '<em>Hashtag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG_FEATURE_COUNT = TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hashtag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smr.impl.SocialMediaResourceImpl <em>Social Media Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smr.impl.SocialMediaResourceImpl
	 * @see smr.impl.SmrPackageImpl#getSocialMediaResource()
	 * @generated
	 */
	int SOCIAL_MEDIA_RESOURCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_MEDIA_RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Posts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_MEDIA_RESOURCE__POSTS = 1;

	/**
	 * The number of structural features of the '<em>Social Media Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_MEDIA_RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Social Media Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_MEDIA_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smr.impl.MentionImpl <em>Mention</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smr.impl.MentionImpl
	 * @see smr.impl.SmrPackageImpl#getMention()
	 * @generated
	 */
	int MENTION = 11;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION__TEXT = TAG__TEXT;

	/**
	 * The number of structural features of the '<em>Mention</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION_FEATURE_COUNT = TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mention</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENTION_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smr.Categories <em>Categories</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smr.Categories
	 * @see smr.impl.SmrPackageImpl#getCategories()
	 * @generated
	 */
	int CATEGORIES = 12;

	/**
	 * The meta object id for the '{@link smr.Languages <em>Languages</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smr.Languages
	 * @see smr.impl.SmrPackageImpl#getLanguages()
	 * @generated
	 */
	int LANGUAGES = 13;


	/**
	 * Returns the meta object for class '{@link smr.Post <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post</em>'.
	 * @see smr.Post
	 * @generated
	 */
	EClass getPost();

	/**
	 * Returns the meta object for the attribute '{@link smr.Post#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see smr.Post#getId()
	 * @see #getPost()
	 * @generated
	 */
	EAttribute getPost_Id();

	/**
	 * Returns the meta object for the attribute '{@link smr.Post#getSourcesn <em>Sourcesn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sourcesn</em>'.
	 * @see smr.Post#getSourcesn()
	 * @see #getPost()
	 * @generated
	 */
	EAttribute getPost_Sourcesn();

	/**
	 * Returns the meta object for the containment reference '{@link smr.Post#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Place</em>'.
	 * @see smr.Post#getPlace()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Place();

	/**
	 * Returns the meta object for the containment reference '{@link smr.Post#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see smr.Post#getText()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link smr.Post#getPictures <em>Pictures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pictures</em>'.
	 * @see smr.Post#getPictures()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Pictures();

	/**
	 * Returns the meta object for the containment reference list '{@link smr.Post#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see smr.Post#getCategories()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Categories();

	/**
	 * Returns the meta object for the attribute '{@link smr.Post#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see smr.Post#getTime()
	 * @see #getPost()
	 * @generated
	 */
	EAttribute getPost_Time();

	/**
	 * Returns the meta object for the containment reference '{@link smr.Post#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author</em>'.
	 * @see smr.Post#getAuthor()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Author();

	/**
	 * Returns the meta object for the attribute '{@link smr.Post#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see smr.Post#getLanguage()
	 * @see #getPost()
	 * @generated
	 */
	EAttribute getPost_Language();

	/**
	 * Returns the meta object for class '{@link smr.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see smr.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link smr.Place#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see smr.Place#getCity()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_City();

	/**
	 * Returns the meta object for the attribute '{@link smr.Place#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see smr.Place#getAddress()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Address();

	/**
	 * Returns the meta object for the containment reference '{@link smr.Place#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see smr.Place#getLocation()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Location();

	/**
	 * Returns the meta object for the containment reference '{@link smr.Place#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordinates</em>'.
	 * @see smr.Place#getCoordinates()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Coordinates();

	/**
	 * Returns the meta object for class '{@link smr.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see smr.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link smr.Text#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smr.Text#getName()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Name();

	/**
	 * Returns the meta object for the attribute '{@link smr.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see smr.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link smr.Text#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see smr.Text#getTags()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_Tags();

	/**
	 * Returns the meta object for class '{@link smr.Picture <em>Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picture</em>'.
	 * @see smr.Picture
	 * @generated
	 */
	EClass getPicture();

	/**
	 * Returns the meta object for the attribute '{@link smr.Picture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smr.Picture#getName()
	 * @see #getPicture()
	 * @generated
	 */
	EAttribute getPicture_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link smr.Picture#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see smr.Picture#getTags()
	 * @see #getPicture()
	 * @generated
	 */
	EReference getPicture_Tags();

	/**
	 * Returns the meta object for the reference '{@link smr.Picture#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see smr.Picture#getPlace()
	 * @see #getPicture()
	 * @generated
	 */
	EReference getPicture_Place();

	/**
	 * Returns the meta object for class '{@link smr.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see smr.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for the attribute '{@link smr.Author#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smr.Author#getName()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Name();

	/**
	 * Returns the meta object for the attribute '{@link smr.Author#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see smr.Author#getLanguage()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Language();

	/**
	 * Returns the meta object for the attribute '{@link smr.Author#getCurrentCity <em>Current City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current City</em>'.
	 * @see smr.Author#getCurrentCity()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_CurrentCity();

	/**
	 * Returns the meta object for class '{@link smr.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see smr.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link smr.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smr.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the attribute '{@link smr.Category#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see smr.Category#getType()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Type();

	/**
	 * Returns the meta object for class '{@link smr.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see smr.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link smr.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smr.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for class '{@link smr.Coordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates</em>'.
	 * @see smr.Coordinates
	 * @generated
	 */
	EClass getCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link smr.Coordinates#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smr.Coordinates#getName()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Name();

	/**
	 * Returns the meta object for the attribute '{@link smr.Coordinates#getCoordx <em>Coordx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordx</em>'.
	 * @see smr.Coordinates#getCoordx()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Coordx();

	/**
	 * Returns the meta object for the attribute '{@link smr.Coordinates#getCoordy <em>Coordy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordy</em>'.
	 * @see smr.Coordinates#getCoordy()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Coordy();

	/**
	 * Returns the meta object for class '{@link smr.Hashtag <em>Hashtag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hashtag</em>'.
	 * @see smr.Hashtag
	 * @generated
	 */
	EClass getHashtag();

	/**
	 * Returns the meta object for class '{@link smr.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see smr.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link smr.Tag#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see smr.Tag#getText()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Text();

	/**
	 * Returns the meta object for class '{@link smr.SocialMediaResource <em>Social Media Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Media Resource</em>'.
	 * @see smr.SocialMediaResource
	 * @generated
	 */
	EClass getSocialMediaResource();

	/**
	 * Returns the meta object for the attribute '{@link smr.SocialMediaResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smr.SocialMediaResource#getName()
	 * @see #getSocialMediaResource()
	 * @generated
	 */
	EAttribute getSocialMediaResource_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link smr.SocialMediaResource#getPosts <em>Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Posts</em>'.
	 * @see smr.SocialMediaResource#getPosts()
	 * @see #getSocialMediaResource()
	 * @generated
	 */
	EReference getSocialMediaResource_Posts();

	/**
	 * Returns the meta object for class '{@link smr.Mention <em>Mention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mention</em>'.
	 * @see smr.Mention
	 * @generated
	 */
	EClass getMention();

	/**
	 * Returns the meta object for enum '{@link smr.Categories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Categories</em>'.
	 * @see smr.Categories
	 * @generated
	 */
	EEnum getCategories();

	/**
	 * Returns the meta object for enum '{@link smr.Languages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Languages</em>'.
	 * @see smr.Languages
	 * @generated
	 */
	EEnum getLanguages();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmrFactory getSmrFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link smr.impl.PostImpl <em>Post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smr.impl.PostImpl
		 * @see smr.impl.SmrPackageImpl#getPost()
		 * @generated
		 */
		EClass POST = eINSTANCE.getPost();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST__ID = eINSTANCE.getPost_Id();

		/**
		 * The meta object literal for the '<em><b>Sourcesn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST__SOURCESN = eINSTANCE.getPost_Sourcesn();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__PLACE = eINSTANCE.getPost_Place();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__TEXT = eINSTANCE.getPost_Text();

		/**
		 * The meta object literal for the '<em><b>Pictures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__PICTURES = eINSTANCE.getPost_Pictures();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__CATEGORIES = eINSTANCE.getPost_Categories();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST__TIME = eINSTANCE.getPost_Time();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__AUTHOR = eINSTANCE.getPost_Author();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST__LANGUAGE = eINSTANCE.getPost_Language();

		/**
		 * The meta object literal for the '{@link smr.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smr.impl.PlaceImpl
		 * @see smr.impl.SmrPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__CITY = eINSTANCE.getPlace_City();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__ADDRESS = eINSTANCE.getPlace_Address();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__LOCATION = eINSTANCE.getPlace_Location();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__COORDINATES = eINSTANCE.getPlace_Coordinates();

		/**
		 * The meta object literal for the '{@link smr.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smr.impl.TextImpl
		 * @see smr.impl.SmrPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__NAME = eINSTANCE.getText_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__TAGS = eINSTANCE.getText_Tags();

		/**
		 * The meta object literal for the '{@link smr.impl.PictureImpl <em>Picture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smr.impl.PictureImpl
		 * @see smr.impl.SmrPackageImpl#getPicture()
		 * @generated
		 */
		EClass PICTURE = eINSTANCE.getPicture();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICTURE__NAME = eINSTANCE.getPicture_Name();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICTURE__TAGS = eINSTANCE.getPicture_Tags();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICTURE__PLACE = eINSTANCE.getPicture_Place();

		/**
		 * The meta object literal for the '{@link smr.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smr.impl.AuthorImpl
		 * @see smr.impl.SmrPackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__NAME = eINSTANCE.getAuthor_Name();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__LANGUAGE = eINSTANCE.getAuthor_Language();

		/**
		 * The meta object literal for the '<em><b>Current City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__CURRENT_CITY = eINSTANCE.getAuthor_CurrentCity();

		/**
		 * The meta object literal for the '{@link smr.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smr.impl.CategoryImpl
		 * @see smr.impl.SmrPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__TYPE = eINSTANCE.getCategory_Type();

		/**
		 * The meta object literal for the '{@link smr.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smr.impl.LocationImpl
		 * @see smr.impl.SmrPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

		/**
		 * The meta object literal for the '{@link smr.impl.CoordinatesImpl <em>Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smr.impl.CoordinatesImpl
		 * @see smr.impl.SmrPackageImpl#getCoordinates()
		 * @generated
		 */
		EClass COORDINATES = eINSTANCE.getCoordinates();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__NAME = eINSTANCE.getCoordinates_Name();

		/**
		 * The meta object literal for the '<em><b>Coordx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__COORDX = eINSTANCE.getCoordinates_Coordx();

		/**
		 * The meta object literal for the '<em><b>Coordy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__COORDY = eINSTANCE.getCoordinates_Coordy();

		/**
		 * The meta object literal for the '{@link smr.impl.HashtagImpl <em>Hashtag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smr.impl.HashtagImpl
		 * @see smr.impl.SmrPackageImpl#getHashtag()
		 * @generated
		 */
		EClass HASHTAG = eINSTANCE.getHashtag();

		/**
		 * The meta object literal for the '{@link smr.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smr.impl.TagImpl
		 * @see smr.impl.SmrPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__TEXT = eINSTANCE.getTag_Text();

		/**
		 * The meta object literal for the '{@link smr.impl.SocialMediaResourceImpl <em>Social Media Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smr.impl.SocialMediaResourceImpl
		 * @see smr.impl.SmrPackageImpl#getSocialMediaResource()
		 * @generated
		 */
		EClass SOCIAL_MEDIA_RESOURCE = eINSTANCE.getSocialMediaResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_MEDIA_RESOURCE__NAME = eINSTANCE.getSocialMediaResource_Name();

		/**
		 * The meta object literal for the '<em><b>Posts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIAL_MEDIA_RESOURCE__POSTS = eINSTANCE.getSocialMediaResource_Posts();

		/**
		 * The meta object literal for the '{@link smr.impl.MentionImpl <em>Mention</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smr.impl.MentionImpl
		 * @see smr.impl.SmrPackageImpl#getMention()
		 * @generated
		 */
		EClass MENTION = eINSTANCE.getMention();

		/**
		 * The meta object literal for the '{@link smr.Categories <em>Categories</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smr.Categories
		 * @see smr.impl.SmrPackageImpl#getCategories()
		 * @generated
		 */
		EEnum CATEGORIES = eINSTANCE.getCategories();

		/**
		 * The meta object literal for the '{@link smr.Languages <em>Languages</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smr.Languages
		 * @see smr.impl.SmrPackageImpl#getLanguages()
		 * @generated
		 */
		EEnum LANGUAGES = eINSTANCE.getLanguages();

	}

} //SmrPackage
