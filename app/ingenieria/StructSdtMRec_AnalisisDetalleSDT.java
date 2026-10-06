package app.ingenieria ;
import com.genexus.*;

public final  class StructSdtMRec_AnalisisDetalleSDT implements Cloneable, java.io.Serializable
{
   public StructSdtMRec_AnalisisDetalleSDT( )
   {
      this( -1, new ModelContext( StructSdtMRec_AnalisisDetalleSDT.class ));
   }

   public StructSdtMRec_AnalisisDetalleSDT( int remoteHandle ,
                                            ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtMRec_AnalisisDetalleSDT_Emprcod = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Barcodpar = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecplc = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn = new java.math.BigDecimal(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecval = new java.math.BigDecimal(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx = new java.math.BigDecimal(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec = cal.getTime() ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev = cal.getTime() ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Maqcod = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Maqdsc = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Fascod = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Fasdsc = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Parfasdsc = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Artcod = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Artdsc = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Clinom = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Hdr = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec_N = (byte)(1) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev_N = (byte)(1) ;
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
      return gxTv_SdtMRec_AnalisisDetalleSDT_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Emprcod = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Barcodpar = value ;
   }

   public short getMenvord( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Menvord ;
   }

   public void setMenvord( short value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Menvord = value ;
   }

   public long getMreclin( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Mreclin ;
   }

   public void setMreclin( long value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mreclin = value ;
   }

   public String getMprecplc( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Mprecplc ;
   }

   public void setMprecplc( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecplc = value ;
   }

   public java.math.BigDecimal getMprecvalmn( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn ;
   }

   public void setMprecvalmn( java.math.BigDecimal value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn = value ;
   }

   public java.math.BigDecimal getMprecval( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Mprecval ;
   }

   public void setMprecval( java.math.BigDecimal value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecval = value ;
   }

   public java.math.BigDecimal getMprecvalmx( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx ;
   }

   public void setMprecvalmx( java.math.BigDecimal value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx = value ;
   }

   public java.util.Date getMprecfec( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec ;
   }

   public void setMprecfec( java.util.Date value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec = value ;
   }

   public boolean getMprecer( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Mprecer ;
   }

   public void setMprecer( boolean value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecer = value ;
   }

   public java.util.Date getMprecfecev( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev ;
   }

   public void setMprecfecev( java.util.Date value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Maqdsc = value ;
   }

   public String getFascod( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Fascod ;
   }

   public void setFascod( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Fascod = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Fasdsc = value ;
   }

   public short getParfascod( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Parfascod ;
   }

   public void setParfascod( short value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Parfascod = value ;
   }

   public String getParfasdsc( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Parfasdsc ;
   }

   public void setParfasdsc( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Parfasdsc = value ;
   }

   public String getArtcod( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Artcod ;
   }

   public void setArtcod( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Artcod = value ;
   }

   public String getArtdsc( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Artdsc ;
   }

   public void setArtdsc( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Artdsc = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Clinom = value ;
   }

   public String getHdr( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Hdr ;
   }

   public void setHdr( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Hdr = value ;
   }

   protected byte gxTv_SdtMRec_AnalisisDetalleSDT_Barcodreo ;
   protected byte gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec_N ;
   protected byte gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev_N ;
   protected byte gxTv_SdtMRec_AnalisisDetalleSDT_N ;
   protected short gxTv_SdtMRec_AnalisisDetalleSDT_Menvord ;
   protected short gxTv_SdtMRec_AnalisisDetalleSDT_Parfascod ;
   protected int gxTv_SdtMRec_AnalisisDetalleSDT_Barcod ;
   protected int gxTv_SdtMRec_AnalisisDetalleSDT_Clicod ;
   protected long gxTv_SdtMRec_AnalisisDetalleSDT_Mreclin ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Emprcod ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Barcodpar ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Maqcod ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Maqdsc ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Fascod ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Fasdsc ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Parfasdsc ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Artcod ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Artdsc ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Clinom ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Hdr ;
   protected boolean gxTv_SdtMRec_AnalisisDetalleSDT_Mprecer ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Mprecplc ;
   protected java.math.BigDecimal gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn ;
   protected java.math.BigDecimal gxTv_SdtMRec_AnalisisDetalleSDT_Mprecval ;
   protected java.math.BigDecimal gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx ;
   protected java.util.Date gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec ;
   protected java.util.Date gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev ;
}

