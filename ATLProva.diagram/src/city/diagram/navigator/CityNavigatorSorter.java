/*
 * 
 */
package city.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import city.diagram.part.CityVisualIDRegistry;

/**
 * @generated
 */
public class CityNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof CityNavigatorItem) {
			CityNavigatorItem item = (CityNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return CityVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
