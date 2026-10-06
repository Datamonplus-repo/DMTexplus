package app.ponteway.v1 ;
import com.genexus.*;

public final  class StructSdtListValues_Item implements Cloneable, java.io.Serializable
{
   public StructSdtListValues_Item( )
   {
      this( -1, new ModelContext( StructSdtListValues_Item.class ));
   }

   public StructSdtListValues_Item( int remoteHandle ,
                                    ModelContext context )
   {
      gxTv_SdtListValues_Item_Key = "" ;
      gxTv_SdtListValues_Item_Value = "" ;
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

   public String getKey( )
   {
      return gxTv_SdtListValues_Item_Key ;
   }

   public void setKey( String value )
   {
      gxTv_SdtListValues_Item_N = (byte)(0) ;
      gxTv_SdtListValues_Item_Key = value ;
   }

   public String getValue( )
   {
      return gxTv_SdtListValues_Item_Value ;
   }

   public void setValue( String value )
   {
      gxTv_SdtListValues_Item_N = (byte)(0) ;
      gxTv_SdtListValues_Item_Value = value ;
   }

   protected byte gxTv_SdtListValues_Item_N ;
   protected String gxTv_SdtListValues_Item_Key ;
   protected String gxTv_SdtListValues_Item_Value ;
}

