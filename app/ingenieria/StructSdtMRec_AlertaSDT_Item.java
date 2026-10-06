package app.ingenieria ;
import com.genexus.*;

public final  class StructSdtMRec_AlertaSDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtMRec_AlertaSDT_Item( )
   {
      this( -1, new ModelContext( StructSdtMRec_AlertaSDT_Item.class ));
   }

   public StructSdtMRec_AlertaSDT_Item( int remoteHandle ,
                                        ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtMRec_AlertaSDT_Item_Emprcod = "" ;
      gxTv_SdtMRec_AlertaSDT_Item_Barcodpar = "" ;
      gxTv_SdtMRec_AlertaSDT_Item_Mprecplc = "" ;
      gxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn = new java.math.BigDecimal(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Mprecval = new java.math.BigDecimal(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx = new java.math.BigDecimal(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Mprecfec = cal.getTime() ;
      gxTv_SdtMRec_AlertaSDT_Item_Mprecfecev = cal.getTime() ;
      gxTv_SdtMRec_AlertaSDT_Item_Clinom = "" ;
      gxTv_SdtMRec_AlertaSDT_Item_Artcod = "" ;
      gxTv_SdtMRec_AlertaSDT_Item_Artdsc = "" ;
      gxTv_SdtMRec_AlertaSDT_Item_Maqcod = "" ;
      gxTv_SdtMRec_AlertaSDT_Item_Maqdsc = "" ;
      gxTv_SdtMRec_AlertaSDT_Item_Fascod = "" ;
      gxTv_SdtMRec_AlertaSDT_Item_Fasdsc = "" ;
      gxTv_SdtMRec_AlertaSDT_Item_Parfasdsc = "" ;
      gxTv_SdtMRec_AlertaSDT_Item_Mprecfec_N = (byte)(1) ;
      gxTv_SdtMRec_AlertaSDT_Item_Mprecfecev_N = (byte)(1) ;
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
      return gxTv_SdtMRec_AlertaSDT_Item_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Emprcod = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Barcodpar = value ;
   }

   public short getMenvord( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Menvord ;
   }

   public void setMenvord( short value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Menvord = value ;
   }

   public long getMreclin( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Mreclin ;
   }

   public void setMreclin( long value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Mreclin = value ;
   }

   public String getMprecplc( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Mprecplc ;
   }

   public void setMprecplc( String value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Mprecplc = value ;
   }

   public java.math.BigDecimal getMprecvalmn( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn ;
   }

   public void setMprecvalmn( java.math.BigDecimal value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn = value ;
   }

   public java.math.BigDecimal getMprecval( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Mprecval ;
   }

   public void setMprecval( java.math.BigDecimal value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Mprecval = value ;
   }

   public java.math.BigDecimal getMprecvalmx( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx ;
   }

   public void setMprecvalmx( java.math.BigDecimal value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx = value ;
   }

   public java.util.Date getMprecfec( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Mprecfec ;
   }

   public void setMprecfec( java.util.Date value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_Mprecfec_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Mprecfec = value ;
   }

   public boolean getMprecer( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Mprecer ;
   }

   public void setMprecer( boolean value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Mprecer = value ;
   }

   public java.util.Date getMprecfecev( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Mprecfecev ;
   }

   public void setMprecfecev( java.util.Date value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_Mprecfecev_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Mprecfecev = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Clinom = value ;
   }

   public String getArtcod( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Artcod ;
   }

   public void setArtcod( String value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Artcod = value ;
   }

   public String getArtdsc( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Artdsc ;
   }

   public void setArtdsc( String value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Artdsc = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Maqdsc = value ;
   }

   public String getFascod( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Fascod ;
   }

   public void setFascod( String value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Fascod = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Fasdsc = value ;
   }

   public short getParfascod( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Parfascod ;
   }

   public void setParfascod( short value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Parfascod = value ;
   }

   public String getParfasdsc( )
   {
      return gxTv_SdtMRec_AlertaSDT_Item_Parfasdsc ;
   }

   public void setParfasdsc( String value )
   {
      gxTv_SdtMRec_AlertaSDT_Item_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaSDT_Item_Parfasdsc = value ;
   }

   protected byte gxTv_SdtMRec_AlertaSDT_Item_Barcodreo ;
   protected byte gxTv_SdtMRec_AlertaSDT_Item_Mprecfec_N ;
   protected byte gxTv_SdtMRec_AlertaSDT_Item_Mprecfecev_N ;
   protected byte gxTv_SdtMRec_AlertaSDT_Item_N ;
   protected short gxTv_SdtMRec_AlertaSDT_Item_Menvord ;
   protected short gxTv_SdtMRec_AlertaSDT_Item_Parfascod ;
   protected int gxTv_SdtMRec_AlertaSDT_Item_Barcod ;
   protected int gxTv_SdtMRec_AlertaSDT_Item_Clicod ;
   protected long gxTv_SdtMRec_AlertaSDT_Item_Mreclin ;
   protected String gxTv_SdtMRec_AlertaSDT_Item_Emprcod ;
   protected String gxTv_SdtMRec_AlertaSDT_Item_Barcodpar ;
   protected String gxTv_SdtMRec_AlertaSDT_Item_Clinom ;
   protected String gxTv_SdtMRec_AlertaSDT_Item_Artcod ;
   protected String gxTv_SdtMRec_AlertaSDT_Item_Artdsc ;
   protected String gxTv_SdtMRec_AlertaSDT_Item_Maqcod ;
   protected String gxTv_SdtMRec_AlertaSDT_Item_Maqdsc ;
   protected String gxTv_SdtMRec_AlertaSDT_Item_Fascod ;
   protected String gxTv_SdtMRec_AlertaSDT_Item_Fasdsc ;
   protected String gxTv_SdtMRec_AlertaSDT_Item_Parfasdsc ;
   protected boolean gxTv_SdtMRec_AlertaSDT_Item_Mprecer ;
   protected String gxTv_SdtMRec_AlertaSDT_Item_Mprecplc ;
   protected java.math.BigDecimal gxTv_SdtMRec_AlertaSDT_Item_Mprecvalmn ;
   protected java.math.BigDecimal gxTv_SdtMRec_AlertaSDT_Item_Mprecval ;
   protected java.math.BigDecimal gxTv_SdtMRec_AlertaSDT_Item_Mprecvalmx ;
   protected java.util.Date gxTv_SdtMRec_AlertaSDT_Item_Mprecfec ;
   protected java.util.Date gxTv_SdtMRec_AlertaSDT_Item_Mprecfecev ;
}

