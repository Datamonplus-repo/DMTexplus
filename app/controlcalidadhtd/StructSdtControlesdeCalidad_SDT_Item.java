package app.controlcalidadhtd ;
import com.genexus.*;

public final  class StructSdtControlesdeCalidad_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtControlesdeCalidad_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtControlesdeCalidad_SDT_Item.class ));
   }

   public StructSdtControlesdeCalidad_SDT_Item( int remoteHandle ,
                                                ModelContext context )
   {
      gxTv_SdtControlesdeCalidad_SDT_Item_Cctdsc = "" ;
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
      return gxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtControlesdeCalidad_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar = value ;
   }

   public int getCctcod( )
   {
      return gxTv_SdtControlesdeCalidad_SDT_Item_Cctcod ;
   }

   public void setCctcod( int value )
   {
      gxTv_SdtControlesdeCalidad_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlesdeCalidad_SDT_Item_Cctcod = value ;
   }

   public String getCctdsc( )
   {
      return gxTv_SdtControlesdeCalidad_SDT_Item_Cctdsc ;
   }

   public void setCctdsc( String value )
   {
      gxTv_SdtControlesdeCalidad_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlesdeCalidad_SDT_Item_Cctdsc = value ;
   }

   protected byte gxTv_SdtControlesdeCalidad_SDT_Item_N ;
   protected int gxTv_SdtControlesdeCalidad_SDT_Item_Cctcod ;
   protected String gxTv_SdtControlesdeCalidad_SDT_Item_Cctdsc ;
   protected boolean gxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar ;
}

