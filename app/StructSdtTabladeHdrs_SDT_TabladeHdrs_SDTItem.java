package app ;
import com.genexus.*;

public final  class StructSdtTabladeHdrs_SDT_TabladeHdrs_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtTabladeHdrs_SDT_TabladeHdrs_SDTItem( )
   {
      this( -1, new ModelContext( StructSdtTabladeHdrs_SDT_TabladeHdrs_SDTItem.class ));
   }

   public StructSdtTabladeHdrs_SDT_TabladeHdrs_SDTItem( int remoteHandle ,
                                                        ModelContext context )
   {
      gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar = "" ;
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

   public int getBarcod( )
   {
      return gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar = value ;
   }

   protected byte gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo ;
   protected byte gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_N ;
   protected int gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod ;
   protected String gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar ;
}

