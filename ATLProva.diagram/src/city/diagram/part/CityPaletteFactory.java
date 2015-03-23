/*
 * 
 */
package city.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import city.diagram.providers.CityElementTypes;

/**
 * @generated
 */
public class CityPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createCategory1CreationTool());
		paletteContainer.add(createCity2CreationTool());
		paletteContainer.add(createDistrict3CreationTool());
		paletteContainer.add(createPlace4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCategory1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Category1CreationTool_title,
				Messages.Category1CreationTool_desc, null, null) {
		};
		entry.setId("createCategory1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCity2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.City2CreationTool_title,
				Messages.City2CreationTool_desc,
				Collections.singletonList(CityElementTypes.City_2001));
		entry.setId("createCity2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CityElementTypes
				.getImageDescriptor(CityElementTypes.City_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDistrict3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.District3CreationTool_title,
				Messages.District3CreationTool_desc,
				Collections.singletonList(CityElementTypes.District_3001));
		entry.setId("createDistrict3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CityElementTypes
				.getImageDescriptor(CityElementTypes.District_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlace4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Place4CreationTool_title,
				Messages.Place4CreationTool_desc,
				Collections.singletonList(CityElementTypes.Place_3002));
		entry.setId("createPlace4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CityElementTypes
				.getImageDescriptor(CityElementTypes.Place_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
