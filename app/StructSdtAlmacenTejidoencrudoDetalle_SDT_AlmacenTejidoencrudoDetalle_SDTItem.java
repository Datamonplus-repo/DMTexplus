package app ;
import com.genexus.*;

public final  class StructSdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem( )
   {
      this( -1, new ModelContext( StructSdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem.class ));
   }

   public StructSdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem( int remoteHandle ,
                                                                                        ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Clinom = "" ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albref = "" ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrefdsc = "" ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrfen = cal.getTime() ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrent2 = "" ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruni = "" ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunient = new java.math.BigDecimal(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruniuti = new java.math.BigDecimal(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunidis = new java.math.BigDecimal(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Procenom = "" ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Trnnom = "" ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrloc = "" ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrfen_N = (byte)(1) ;
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

   public int getClicod( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Clinom = value ;
   }

   public String getAlbref( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albref ;
   }

   public void setAlbref( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albref = value ;
   }

   public String getAlbrefdsc( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrefdsc ;
   }

   public void setAlbrefdsc( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrefdsc = value ;
   }

   public int getAlbreccod( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albreccod ;
   }

   public void setAlbreccod( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albreccod = value ;
   }

   public java.util.Date getAlbrfen( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrfen ;
   }

   public void setAlbrfen( java.util.Date value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrfen_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrfen = value ;
   }

   public String getAlbrent2( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrent2 ;
   }

   public void setAlbrent2( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrent2 = value ;
   }

   public String getAlbruni( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruni ;
   }

   public void setAlbruni( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruni = value ;
   }

   public java.math.BigDecimal getAlbrunient( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunient ;
   }

   public void setAlbrunient( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunient = value ;
   }

   public int getAlbrpieent( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieent ;
   }

   public void setAlbrpieent( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieent = value ;
   }

   public java.math.BigDecimal getAlbruniuti( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruniuti ;
   }

   public void setAlbruniuti( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruniuti = value ;
   }

   public int getAlbrpieuti( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieuti ;
   }

   public void setAlbrpieuti( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieuti = value ;
   }

   public java.math.BigDecimal getAlbrunidis( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunidis ;
   }

   public void setAlbrunidis( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunidis = value ;
   }

   public int getAlbrpiedis( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpiedis ;
   }

   public void setAlbrpiedis( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpiedis = value ;
   }

   public short getProcecod( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Procecod ;
   }

   public void setProcecod( short value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Procecod = value ;
   }

   public String getProcenom( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Procenom ;
   }

   public void setProcenom( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Procenom = value ;
   }

   public short getTrncod( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Trncod ;
   }

   public void setTrncod( short value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Trncod = value ;
   }

   public String getTrnnom( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Trnnom ;
   }

   public void setTrnnom( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Trnnom = value ;
   }

   public String getAlbrloc( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrloc ;
   }

   public void setAlbrloc( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrloc = value ;
   }

   protected byte gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrfen_N ;
   protected byte gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_N ;
   protected short gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Procecod ;
   protected short gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Trncod ;
   protected int gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Clicod ;
   protected int gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albreccod ;
   protected int gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieent ;
   protected int gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpieuti ;
   protected int gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrpiedis ;
   protected String gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Clinom ;
   protected String gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albref ;
   protected String gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrefdsc ;
   protected String gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrent2 ;
   protected String gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruni ;
   protected String gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Procenom ;
   protected String gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Trnnom ;
   protected String gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrloc ;
   protected java.util.Date gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrfen ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunient ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albruniuti ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem_Albrunidis ;
}

