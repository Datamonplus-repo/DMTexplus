package app.ingenieria ;
import com.genexus.*;

public final  class StructSdtMRec_AlertaMaquinaSDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtMRec_AlertaMaquinaSDT_Item( )
   {
      this( -1, new ModelContext( StructSdtMRec_AlertaMaquinaSDT_Item.class ));
   }

   public StructSdtMRec_AlertaMaquinaSDT_Item( int remoteHandle ,
                                               ModelContext context )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod = "" ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar = "" ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod = "" ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc = "" ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr = new java.math.BigDecimal(0) ;
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

   public String getEmprcod( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar = value ;
   }

   public short getMenvord( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Menvord ;
   }

   public void setMenvord( short value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Menvord = value ;
   }

   public long getMreclin( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Mreclin ;
   }

   public void setMreclin( long value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Mreclin = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc = value ;
   }

   public java.math.BigDecimal getMaqerr( )
   {
      return gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr ;
   }

   public void setMaqerr( java.math.BigDecimal value )
   {
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr = value ;
   }

   protected byte gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodreo ;
   protected byte gxTv_SdtMRec_AlertaMaquinaSDT_Item_N ;
   protected short gxTv_SdtMRec_AlertaMaquinaSDT_Item_Menvord ;
   protected int gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcod ;
   protected long gxTv_SdtMRec_AlertaMaquinaSDT_Item_Mreclin ;
   protected String gxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod ;
   protected String gxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar ;
   protected String gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod ;
   protected String gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc ;
   protected java.math.BigDecimal gxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr ;
}

