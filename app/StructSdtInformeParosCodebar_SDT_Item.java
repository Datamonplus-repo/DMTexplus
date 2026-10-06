package app ;
import com.genexus.*;

public final  class StructSdtInformeParosCodebar_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtInformeParosCodebar_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtInformeParosCodebar_SDT_Item.class ));
   }

   public StructSdtInformeParosCodebar_SDT_Item( int remoteHandle ,
                                                 ModelContext context )
   {
      gxTv_SdtInformeParosCodebar_SDT_Item_Parcodnom = "" ;
      gxTv_SdtInformeParosCodebar_SDT_Item_Parcodest = "" ;
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

   public boolean getSeleccionar( )
   {
      return gxTv_SdtInformeParosCodebar_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtInformeParosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeParosCodebar_SDT_Item_Seleccionar = value ;
   }

   public short getParcod( )
   {
      return gxTv_SdtInformeParosCodebar_SDT_Item_Parcod ;
   }

   public void setParcod( short value )
   {
      gxTv_SdtInformeParosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeParosCodebar_SDT_Item_Parcod = value ;
   }

   public String getParcodnom( )
   {
      return gxTv_SdtInformeParosCodebar_SDT_Item_Parcodnom ;
   }

   public void setParcodnom( String value )
   {
      gxTv_SdtInformeParosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeParosCodebar_SDT_Item_Parcodnom = value ;
   }

   public String getParcodest( )
   {
      return gxTv_SdtInformeParosCodebar_SDT_Item_Parcodest ;
   }

   public void setParcodest( String value )
   {
      gxTv_SdtInformeParosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeParosCodebar_SDT_Item_Parcodest = value ;
   }

   protected byte gxTv_SdtInformeParosCodebar_SDT_Item_N ;
   protected short gxTv_SdtInformeParosCodebar_SDT_Item_Parcod ;
   protected String gxTv_SdtInformeParosCodebar_SDT_Item_Parcodnom ;
   protected String gxTv_SdtInformeParosCodebar_SDT_Item_Parcodest ;
   protected boolean gxTv_SdtInformeParosCodebar_SDT_Item_Seleccionar ;
}

