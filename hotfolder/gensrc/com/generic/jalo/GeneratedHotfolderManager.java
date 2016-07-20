/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 20, 2016 3:27:56 PM                     ---
 * ----------------------------------------------------------------
 */
package com.generic.jalo;

import com.generic.constants.HotfolderConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.user.Address;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>HotfolderManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHotfolderManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("code", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Address", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.code</code> attribute.
	 * @return the code - Add code Parameter
	 */
	public String getCode(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, HotfolderConstants.Attributes.Address.CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.code</code> attribute.
	 * @return the code - Add code Parameter
	 */
	public String getCode(final Address item)
	{
		return getCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.code</code> attribute. 
	 * @param value the code - Add code Parameter
	 */
	public void setCode(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, HotfolderConstants.Attributes.Address.CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.code</code> attribute. 
	 * @param value the code - Add code Parameter
	 */
	public void setCode(final Address item, final String value)
	{
		setCode( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return HotfolderConstants.EXTENSIONNAME;
	}
	
}
