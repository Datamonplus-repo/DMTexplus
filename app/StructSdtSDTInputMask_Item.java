package app ;
import com.genexus.*;

public final  class StructSdtSDTInputMask_Item implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInputMask_Item( )
   {
      this( -1, new ModelContext( StructSdtSDTInputMask_Item.class ));
   }

   public StructSdtSDTInputMask_Item( int remoteHandle ,
                                      ModelContext context )
   {
      gxTv_SdtSDTInputMask_Item_Value = "" ;
      gxTv_SdtSDTInputMask_Item_Description = "" ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public String getValue( )
   {
      return gxTv_SdtSDTInputMask_Item_Value ;
   }

   public void setValue( String value )
   {
      gxTv_SdtSDTInputMask_Item_N = (byte)(0) ;
      gxTv_SdtSDTInputMask_Item_Value = value ;
   }

   public String getDescription( )
   {
      return gxTv_SdtSDTInputMask_Item_Description ;
   }

   public void setDescription( String value )
   {
      gxTv_SdtSDTInputMask_Item_N = (byte)(0) ;
      gxTv_SdtSDTInputMask_Item_Description = value ;
   }

   protected byte gxTv_SdtSDTInputMask_Item_N ;
   protected String gxTv_SdtSDTInputMask_Item_Value ;
   protected String gxTv_SdtSDTInputMask_Item_Description ;
}

