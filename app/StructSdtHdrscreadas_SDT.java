package app ;
import com.genexus.*;

public final  class StructSdtHdrscreadas_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtHdrscreadas_SDT( )
   {
      this( -1, new ModelContext( StructSdtHdrscreadas_SDT.class ));
   }

   public StructSdtHdrscreadas_SDT( int remoteHandle ,
                                    ModelContext context )
   {
      gxTv_SdtHdrscreadas_SDT_Barcodpar = "" ;
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
      return gxTv_SdtHdrscreadas_SDT_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtHdrscreadas_SDT_N = (byte)(0) ;
      gxTv_SdtHdrscreadas_SDT_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtHdrscreadas_SDT_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtHdrscreadas_SDT_N = (byte)(0) ;
      gxTv_SdtHdrscreadas_SDT_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtHdrscreadas_SDT_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtHdrscreadas_SDT_N = (byte)(0) ;
      gxTv_SdtHdrscreadas_SDT_Barcodpar = value ;
   }

   public short getReclinmaq( )
   {
      return gxTv_SdtHdrscreadas_SDT_Reclinmaq ;
   }

   public void setReclinmaq( short value )
   {
      gxTv_SdtHdrscreadas_SDT_N = (byte)(0) ;
      gxTv_SdtHdrscreadas_SDT_Reclinmaq = value ;
   }

   protected byte gxTv_SdtHdrscreadas_SDT_Barcodreo ;
   protected byte gxTv_SdtHdrscreadas_SDT_N ;
   protected short gxTv_SdtHdrscreadas_SDT_Reclinmaq ;
   protected int gxTv_SdtHdrscreadas_SDT_Barcod ;
   protected String gxTv_SdtHdrscreadas_SDT_Barcodpar ;
}

