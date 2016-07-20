/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 20, 2016 3:27:56 PM                     ---
 * ----------------------------------------------------------------
 */
package com.generic.singlevieworders.jalo;

import com.generic.singlevieworders.constants.SingleviewordersConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem OrderTracking}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOrderTracking extends GenericItem
{
	/** Qualifier of the <code>OrderTracking.scheduledDate</code> attribute **/
	public static final String SCHEDULEDDATE = "scheduledDate";
	/** Qualifier of the <code>OrderTracking.scheduledQty</code> attribute **/
	public static final String SCHEDULEDQTY = "scheduledQty";
	/** Qualifier of the <code>OrderTracking.deliveryDate</code> attribute **/
	public static final String DELIVERYDATE = "deliveryDate";
	/** Qualifier of the <code>OrderTracking.deliveryQty</code> attribute **/
	public static final String DELIVERYQTY = "deliveryQty";
	/** Qualifier of the <code>OrderTracking.trackingNumber</code> attribute **/
	public static final String TRACKINGNUMBER = "trackingNumber";
	/** Qualifier of the <code>OrderTracking.abstractOrderEntry</code> attribute **/
	public static final String ABSTRACTORDERENTRY = "abstractOrderEntry";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ABSTRACTORDERENTRY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedOrderTracking> ABSTRACTORDERENTRYHANDLER = new BidirectionalOneToManyHandler<GeneratedOrderTracking>(
	SingleviewordersConstants.TC.ORDERTRACKING,
	false,
	"abstractOrderEntry",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SCHEDULEDDATE, AttributeMode.INITIAL);
		tmp.put(SCHEDULEDQTY, AttributeMode.INITIAL);
		tmp.put(DELIVERYDATE, AttributeMode.INITIAL);
		tmp.put(DELIVERYQTY, AttributeMode.INITIAL);
		tmp.put(TRACKINGNUMBER, AttributeMode.INITIAL);
		tmp.put(ABSTRACTORDERENTRY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTracking.abstractOrderEntry</code> attribute.
	 * @return the abstractOrderEntry
	 */
	public AbstractOrderEntry getAbstractOrderEntry(final SessionContext ctx)
	{
		return (AbstractOrderEntry)getProperty( ctx, ABSTRACTORDERENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTracking.abstractOrderEntry</code> attribute.
	 * @return the abstractOrderEntry
	 */
	public AbstractOrderEntry getAbstractOrderEntry()
	{
		return getAbstractOrderEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTracking.abstractOrderEntry</code> attribute. 
	 * @param value the abstractOrderEntry
	 */
	public void setAbstractOrderEntry(final SessionContext ctx, final AbstractOrderEntry value)
	{
		ABSTRACTORDERENTRYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTracking.abstractOrderEntry</code> attribute. 
	 * @param value the abstractOrderEntry
	 */
	public void setAbstractOrderEntry(final AbstractOrderEntry value)
	{
		setAbstractOrderEntry( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ABSTRACTORDERENTRYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTracking.deliveryDate</code> attribute.
	 * @return the deliveryDate - The actual delivery Date
	 */
	public Date getDeliveryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DELIVERYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTracking.deliveryDate</code> attribute.
	 * @return the deliveryDate - The actual delivery Date
	 */
	public Date getDeliveryDate()
	{
		return getDeliveryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTracking.deliveryDate</code> attribute. 
	 * @param value the deliveryDate - The actual delivery Date
	 */
	public void setDeliveryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DELIVERYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTracking.deliveryDate</code> attribute. 
	 * @param value the deliveryDate - The actual delivery Date
	 */
	public void setDeliveryDate(final Date value)
	{
		setDeliveryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTracking.deliveryQty</code> attribute.
	 * @return the deliveryQty - The actual delivery Qty
	 */
	public Integer getDeliveryQty(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DELIVERYQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTracking.deliveryQty</code> attribute.
	 * @return the deliveryQty - The actual delivery Qty
	 */
	public Integer getDeliveryQty()
	{
		return getDeliveryQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTracking.deliveryQty</code> attribute. 
	 * @return the deliveryQty - The actual delivery Qty
	 */
	public int getDeliveryQtyAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDeliveryQty( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTracking.deliveryQty</code> attribute. 
	 * @return the deliveryQty - The actual delivery Qty
	 */
	public int getDeliveryQtyAsPrimitive()
	{
		return getDeliveryQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTracking.deliveryQty</code> attribute. 
	 * @param value the deliveryQty - The actual delivery Qty
	 */
	public void setDeliveryQty(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DELIVERYQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTracking.deliveryQty</code> attribute. 
	 * @param value the deliveryQty - The actual delivery Qty
	 */
	public void setDeliveryQty(final Integer value)
	{
		setDeliveryQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTracking.deliveryQty</code> attribute. 
	 * @param value the deliveryQty - The actual delivery Qty
	 */
	public void setDeliveryQty(final SessionContext ctx, final int value)
	{
		setDeliveryQty( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTracking.deliveryQty</code> attribute. 
	 * @param value the deliveryQty - The actual delivery Qty
	 */
	public void setDeliveryQty(final int value)
	{
		setDeliveryQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTracking.scheduledDate</code> attribute.
	 * @return the scheduledDate - The scheduled delivery Date
	 */
	public Date getScheduledDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, SCHEDULEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTracking.scheduledDate</code> attribute.
	 * @return the scheduledDate - The scheduled delivery Date
	 */
	public Date getScheduledDate()
	{
		return getScheduledDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTracking.scheduledDate</code> attribute. 
	 * @param value the scheduledDate - The scheduled delivery Date
	 */
	public void setScheduledDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, SCHEDULEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTracking.scheduledDate</code> attribute. 
	 * @param value the scheduledDate - The scheduled delivery Date
	 */
	public void setScheduledDate(final Date value)
	{
		setScheduledDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTracking.scheduledQty</code> attribute.
	 * @return the scheduledQty - The scheduled delivery Qty
	 */
	public Integer getScheduledQty(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SCHEDULEDQTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTracking.scheduledQty</code> attribute.
	 * @return the scheduledQty - The scheduled delivery Qty
	 */
	public Integer getScheduledQty()
	{
		return getScheduledQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTracking.scheduledQty</code> attribute. 
	 * @return the scheduledQty - The scheduled delivery Qty
	 */
	public int getScheduledQtyAsPrimitive(final SessionContext ctx)
	{
		Integer value = getScheduledQty( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTracking.scheduledQty</code> attribute. 
	 * @return the scheduledQty - The scheduled delivery Qty
	 */
	public int getScheduledQtyAsPrimitive()
	{
		return getScheduledQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTracking.scheduledQty</code> attribute. 
	 * @param value the scheduledQty - The scheduled delivery Qty
	 */
	public void setScheduledQty(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SCHEDULEDQTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTracking.scheduledQty</code> attribute. 
	 * @param value the scheduledQty - The scheduled delivery Qty
	 */
	public void setScheduledQty(final Integer value)
	{
		setScheduledQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTracking.scheduledQty</code> attribute. 
	 * @param value the scheduledQty - The scheduled delivery Qty
	 */
	public void setScheduledQty(final SessionContext ctx, final int value)
	{
		setScheduledQty( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTracking.scheduledQty</code> attribute. 
	 * @param value the scheduledQty - The scheduled delivery Qty
	 */
	public void setScheduledQty(final int value)
	{
		setScheduledQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTracking.trackingNumber</code> attribute.
	 * @return the trackingNumber - The tracking Number
	 */
	public String getTrackingNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TRACKINGNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrderTracking.trackingNumber</code> attribute.
	 * @return the trackingNumber - The tracking Number
	 */
	public String getTrackingNumber()
	{
		return getTrackingNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTracking.trackingNumber</code> attribute. 
	 * @param value the trackingNumber - The tracking Number
	 */
	public void setTrackingNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TRACKINGNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrderTracking.trackingNumber</code> attribute. 
	 * @param value the trackingNumber - The tracking Number
	 */
	public void setTrackingNumber(final String value)
	{
		setTrackingNumber( getSession().getSessionContext(), value );
	}
	
}
