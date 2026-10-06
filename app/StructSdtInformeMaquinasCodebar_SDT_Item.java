package app ;
import com.genexus.*;

public final  class StructSdtInformeMaquinasCodebar_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtInformeMaquinasCodebar_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtInformeMaquinasCodebar_SDT_Item.class ));
   }

   public StructSdtInformeMaquinasCodebar_SDT_Item( int remoteHandle ,
                                                    ModelContext context )
   {
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqcod = "" ;
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqdsc = "" ;
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqest = "" ;
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
      return gxTv_SdtInformeMaquinasCodebar_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_Seleccionar = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqdsc = value ;
   }

   public String getMaqest( )
   {
      return gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqest ;
   }

   public void setMaqest( String value )
   {
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqest = value ;
   }

   protected byte gxTv_SdtInformeMaquinasCodebar_SDT_Item_N ;
   protected String gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqcod ;
   protected String gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqdsc ;
   protected String gxTv_SdtInformeMaquinasCodebar_SDT_Item_Maqest ;
   protected boolean gxTv_SdtInformeMaquinasCodebar_SDT_Item_Seleccionar ;
}

