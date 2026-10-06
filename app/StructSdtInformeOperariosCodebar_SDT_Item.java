package app ;
import com.genexus.*;

public final  class StructSdtInformeOperariosCodebar_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtInformeOperariosCodebar_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtInformeOperariosCodebar_SDT_Item.class ));
   }

   public StructSdtInformeOperariosCodebar_SDT_Item( int remoteHandle ,
                                                     ModelContext context )
   {
      gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom = "" ;
      gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom2 = "" ;
      gxTv_SdtInformeOperariosCodebar_SDT_Item_Opeact = "" ;
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
      return gxTv_SdtInformeOperariosCodebar_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtInformeOperariosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeOperariosCodebar_SDT_Item_Seleccionar = value ;
   }

   public int getOpecod( )
   {
      return gxTv_SdtInformeOperariosCodebar_SDT_Item_Opecod ;
   }

   public void setOpecod( int value )
   {
      gxTv_SdtInformeOperariosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeOperariosCodebar_SDT_Item_Opecod = value ;
   }

   public String getOpenom( )
   {
      return gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom ;
   }

   public void setOpenom( String value )
   {
      gxTv_SdtInformeOperariosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom = value ;
   }

   public String getOpenom2( )
   {
      return gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom2 ;
   }

   public void setOpenom2( String value )
   {
      gxTv_SdtInformeOperariosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom2 = value ;
   }

   public String getOpeact( )
   {
      return gxTv_SdtInformeOperariosCodebar_SDT_Item_Opeact ;
   }

   public void setOpeact( String value )
   {
      gxTv_SdtInformeOperariosCodebar_SDT_Item_N = (byte)(0) ;
      gxTv_SdtInformeOperariosCodebar_SDT_Item_Opeact = value ;
   }

   protected byte gxTv_SdtInformeOperariosCodebar_SDT_Item_N ;
   protected int gxTv_SdtInformeOperariosCodebar_SDT_Item_Opecod ;
   protected String gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom ;
   protected String gxTv_SdtInformeOperariosCodebar_SDT_Item_Openom2 ;
   protected String gxTv_SdtInformeOperariosCodebar_SDT_Item_Opeact ;
   protected boolean gxTv_SdtInformeOperariosCodebar_SDT_Item_Seleccionar ;
}

