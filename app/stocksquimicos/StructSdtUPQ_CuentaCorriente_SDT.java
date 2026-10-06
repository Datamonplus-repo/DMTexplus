package app.stocksquimicos ;
import com.genexus.*;

public final  class StructSdtUPQ_CuentaCorriente_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtUPQ_CuentaCorriente_SDT( )
   {
      this( -1, new ModelContext( StructSdtUPQ_CuentaCorriente_SDT.class ));
   }

   public StructSdtUPQ_CuentaCorriente_SDT( int remoteHandle ,
                                            ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnum = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnom = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Diahora = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Tipmovcc = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkdsc = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcane = new java.math.BigDecimal(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcans = new java.math.BigDecimal(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpre = new java.math.BigDecimal(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Exis = new java.math.BigDecimal(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklot = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech = cal.getTime() ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Hdr = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkusu = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpar = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec = cal.getTime() ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech_N = (byte)(1) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec_N = (byte)(1) ;
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

   public String getPrdnum( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnum ;
   }

   public void setPrdnum( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnum = value ;
   }

   public String getPrdnom( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnom ;
   }

   public void setPrdnom( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnom = value ;
   }

   public long getCcstklin( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklin ;
   }

   public void setCcstklin( long value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklin = value ;
   }

   public String getDiahora( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Diahora ;
   }

   public void setDiahora( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Diahora = value ;
   }

   public String getTipmovcc( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Tipmovcc ;
   }

   public void setTipmovcc( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Tipmovcc = value ;
   }

   public String getCcstkdsc( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkdsc ;
   }

   public void setCcstkdsc( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkdsc = value ;
   }

   public java.math.BigDecimal getCcstkcane( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcane ;
   }

   public void setCcstkcane( java.math.BigDecimal value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcane = value ;
   }

   public java.math.BigDecimal getCcstkcans( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcans ;
   }

   public void setCcstkcans( java.math.BigDecimal value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcans = value ;
   }

   public java.math.BigDecimal getCcstkpre( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpre ;
   }

   public void setCcstkpre( java.math.BigDecimal value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpre = value ;
   }

   public java.math.BigDecimal getExis( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Exis ;
   }

   public void setExis( java.math.BigDecimal value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Exis = value ;
   }

   public String getCcstklot( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklot ;
   }

   public void setCcstklot( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklot = value ;
   }

   public java.util.Date getCcstklotfech( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech ;
   }

   public void setCcstklotfech( java.util.Date value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech = value ;
   }

   public String getHdr( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Hdr ;
   }

   public void setHdr( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Hdr = value ;
   }

   public String getCcstkusu( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkusu ;
   }

   public void setCcstkusu( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkusu = value ;
   }

   public int getCcstkbar( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkbar ;
   }

   public void setCcstkbar( int value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkbar = value ;
   }

   public byte getCcstkreo( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkreo ;
   }

   public void setCcstkreo( byte value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkreo = value ;
   }

   public String getCcstkpar( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpar ;
   }

   public void setCcstkpar( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpar = value ;
   }

   public int getCcstkped( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkped ;
   }

   public void setCcstkped( int value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkped = value ;
   }

   public short getCcstklen( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklen ;
   }

   public void setCcstklen( short value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklen = value ;
   }

   public java.util.Date getCcstkfec( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec ;
   }

   public void setCcstkfec( java.util.Date value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec = value ;
   }

   protected byte gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkreo ;
   protected byte gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech_N ;
   protected byte gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec_N ;
   protected byte gxTv_SdtUPQ_CuentaCorriente_SDT_N ;
   protected short gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklen ;
   protected int gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkbar ;
   protected int gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkped ;
   protected long gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklin ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnum ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnom ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Diahora ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Tipmovcc ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkdsc ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklot ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Hdr ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkusu ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpar ;
   protected java.math.BigDecimal gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcane ;
   protected java.math.BigDecimal gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcans ;
   protected java.math.BigDecimal gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpre ;
   protected java.math.BigDecimal gxTv_SdtUPQ_CuentaCorriente_SDT_Exis ;
   protected java.util.Date gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech ;
   protected java.util.Date gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec ;
}

