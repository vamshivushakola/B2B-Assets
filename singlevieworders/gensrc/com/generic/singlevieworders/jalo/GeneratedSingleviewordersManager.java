/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 20, 2016 3:27:56 PM                     ---
 * ----------------------------------------------------------------
 */
package com.generic.singlevieworders.jalo;

import com.generic.singlevieworders.constants.SingleviewordersConstants;
import com.generic.singlevieworders.jalo.OrderTracking;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SingleviewordersManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSingleviewordersManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n ORDERTRACKING's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<OrderTracking> ORDERTRACKINGRELATIONORDERTRACKINGHANDLER = new OneToManyHandler<OrderTracking>(
	SingleviewordersConstants.TC.ORDERTRACKING,
	true,
	"abstractOrderEntry",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("ERPOrderNumber", AttributeMode.INITIAL);
		tmp.put("origin", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrder", Collections.unmodifiableMap(tmp));
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
	
	public OrderTracking createOrderTracking(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SingleviewordersConstants.TC.ORDERTRACKING );
			return (OrderTracking)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating OrderTracking : "+e.getMessage(), 0 );
		}
	}
	
	public OrderTracking createOrderTracking(final Map attributeValues)
	{
		return createOrderTracking( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.ERPOrderNumber</code> attribute.
	 * @return the ERPOrderNumber - Addon - addition Defines the ERP order Number for the Order
	 */
	public String getERPOrderNumber(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, SingleviewordersConstants.Attributes.AbstractOrder.ERPORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.ERPOrderNumber</code> attribute.
	 * @return the ERPOrderNumber - Addon - addition Defines the ERP order Number for the Order
	 */
	public String getERPOrderNumber(final AbstractOrder item)
	{
		return getERPOrderNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.ERPOrderNumber</code> attribute. 
	 * @param value the ERPOrderNumber - Addon - addition Defines the ERP order Number for the Order
	 */
	public void setERPOrderNumber(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, SingleviewordersConstants.Attributes.AbstractOrder.ERPORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.ERPOrderNumber</code> attribute. 
	 * @param value the ERPOrderNumber - Addon - addition Defines the ERP order Number for the Order
	 */
	public void setERPOrderNumber(final AbstractOrder item, final String value)
	{
		setERPOrderNumber( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return SingleviewordersConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.orderTracking</code> attribute.
	 * @return the orderTracking
	 */
	public Collection<OrderTracking> getOrderTracking(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return ORDERTRACKINGRELATIONORDERTRACKINGHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.orderTracking</code> attribute.
	 * @return the orderTracking
	 */
	public Collection<OrderTracking> getOrderTracking(final AbstractOrderEntry item)
	{
		return getOrderTracking( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.orderTracking</code> attribute. 
	 * @param value the orderTracking
	 */
	public void setOrderTracking(final SessionContext ctx, final AbstractOrderEntry item, final Collection<OrderTracking> value)
	{
		ORDERTRACKINGRELATIONORDERTRACKINGHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.orderTracking</code> attribute. 
	 * @param value the orderTracking
	 */
	public void setOrderTracking(final AbstractOrderEntry item, final Collection<OrderTracking> value)
	{
		setOrderTracking( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to orderTracking. 
	 * @param value the item to add to orderTracking
	 */
	public void addToOrderTracking(final SessionContext ctx, final AbstractOrderEntry item, final OrderTracking value)
	{
		ORDERTRACKINGRELATIONORDERTRACKINGHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to orderTracking. 
	 * @param value the item to add to orderTracking
	 */
	public void addToOrderTracking(final AbstractOrderEntry item, final OrderTracking value)
	{
		addToOrderTracking( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from orderTracking. 
	 * @param value the item to remove from orderTracking
	 */
	public void removeFromOrderTracking(final SessionContext ctx, final AbstractOrderEntry item, final OrderTracking value)
	{
		ORDERTRACKINGRELATIONORDERTRACKINGHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from orderTracking. 
	 * @param value the item to remove from orderTracking
	 */
	public void removeFromOrderTracking(final AbstractOrderEntry item, final OrderTracking value)
	{
		removeFromOrderTracking( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.origin</code> attribute.
	 * @return the origin - Addon addition - Defines the ERP order Number for the Order
	 */
	public String getOrigin(final SessionContext ctx, final AbstractOrder item)
	{
		return (String)item.getProperty( ctx, SingleviewordersConstants.Attributes.AbstractOrder.ORIGIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.origin</code> attribute.
	 * @return the origin - Addon addition - Defines the ERP order Number for the Order
	 */
	public String getOrigin(final AbstractOrder item)
	{
		return getOrigin( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.origin</code> attribute. 
	 * @param value the origin - Addon addition - Defines the ERP order Number for the Order
	 */
	public void setOrigin(final SessionContext ctx, final AbstractOrder item, final String value)
	{
		item.setProperty(ctx, SingleviewordersConstants.Attributes.AbstractOrder.ORIGIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.origin</code> attribute. 
	 * @param value the origin - Addon addition - Defines the ERP order Number for the Order
	 */
	public void setOrigin(final AbstractOrder item, final String value)
	{
		setOrigin( getSession().getSessionContext(), item, value );
	}
	
}
