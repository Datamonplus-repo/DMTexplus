package app ;
import com.genexus.*;

public final  class StructSdtSDTDetalleEntradas implements Cloneable, java.io.Serializable
{
   public StructSdtSDTDetalleEntradas( )
   {
      this( -1, new ModelContext( StructSdtSDTDetalleEntradas.class ));
   }

   public StructSdtSDTDetalleEntradas( int remoteHandle ,
                                       ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTDetalleEntradas_Clinom = "" ;
      gxTv_SdtSDTDetalleEntradas_Albref = "" ;
      gxTv_SdtSDTDetalleEntradas_Albrefdsc = "" ;
      gxTv_SdtSDTDetalleEntradas_Albrfen = cal.getTime() ;
      gxTv_SdtSDTDetalleEntradas_Albrent2 = "" ;
      gxTv_SdtSDTDetalleEntradas_Albruni = "" ;
      gxTv_SdtSDTDetalleEntradas_Albrunient = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDetalleEntradas_Albruniuti = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrunidis = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrloc = "" ;
      gxTv_SdtSDTDetalleEntradas_Procenom = "" ;
      gxTv_SdtSDTDetalleEntradas_Trnnom = "" ;
      gxTv_SdtSDTDetalleEntradas_Obs = "" ;
      gxTv_SdtSDTDetalleEntradas_Kgsexp = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDetalleEntradas_Mtsexp = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrfen_N = (byte)(1) ;
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
      return gxTv_SdtSDTDetalleEntradas_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtSDTDetalleEntradas_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Clinom = value ;
   }

   public String getAlbref( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albref ;
   }

   public void setAlbref( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albref = value ;
   }

   public String getAlbrefdsc( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrefdsc ;
   }

   public void setAlbrefdsc( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrefdsc = value ;
   }

   public int getAlbreccod( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albreccod ;
   }

   public void setAlbreccod( int value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albreccod = value ;
   }

   public java.util.Date getAlbrfen( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrfen ;
   }

   public void setAlbrfen( java.util.Date value )
   {
      gxTv_SdtSDTDetalleEntradas_Albrfen_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrfen = value ;
   }

   public String getAlbrent2( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrent2 ;
   }

   public void setAlbrent2( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrent2 = value ;
   }

   public String getAlbruni( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albruni ;
   }

   public void setAlbruni( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albruni = value ;
   }

   public java.math.BigDecimal getAlbrunient( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrunient ;
   }

   public void setAlbrunient( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrunient = value ;
   }

   public int getAlbrpieent( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrpieent ;
   }

   public void setAlbrpieent( int value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrpieent = value ;
   }

   public java.math.BigDecimal getAlbruniuti( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albruniuti ;
   }

   public void setAlbruniuti( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albruniuti = value ;
   }

   public int getAlbrpieuti( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrpieuti ;
   }

   public void setAlbrpieuti( int value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrpieuti = value ;
   }

   public java.math.BigDecimal getAlbrunidis( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrunidis ;
   }

   public void setAlbrunidis( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrunidis = value ;
   }

   public int getAlbrpiedis( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrpiedis ;
   }

   public void setAlbrpiedis( int value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrpiedis = value ;
   }

   public String getAlbrloc( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrloc ;
   }

   public void setAlbrloc( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrloc = value ;
   }

   public String getProcenom( )
   {
      return gxTv_SdtSDTDetalleEntradas_Procenom ;
   }

   public void setProcenom( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Procenom = value ;
   }

   public String getTrnnom( )
   {
      return gxTv_SdtSDTDetalleEntradas_Trnnom ;
   }

   public void setTrnnom( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Trnnom = value ;
   }

   public String getObs( )
   {
      return gxTv_SdtSDTDetalleEntradas_Obs ;
   }

   public void setObs( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Obs = value ;
   }

   public java.math.BigDecimal getKgsexp( )
   {
      return gxTv_SdtSDTDetalleEntradas_Kgsexp ;
   }

   public void setKgsexp( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Kgsexp = value ;
   }

   public java.math.BigDecimal getMtsexp( )
   {
      return gxTv_SdtSDTDetalleEntradas_Mtsexp ;
   }

   public void setMtsexp( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Mtsexp = value ;
   }

   public int getPzsexp( )
   {
      return gxTv_SdtSDTDetalleEntradas_Pzsexp ;
   }

   public void setPzsexp( int value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Pzsexp = value ;
   }

   protected byte gxTv_SdtSDTDetalleEntradas_Albrfen_N ;
   protected byte gxTv_SdtSDTDetalleEntradas_N ;
   protected int gxTv_SdtSDTDetalleEntradas_Clicod ;
   protected int gxTv_SdtSDTDetalleEntradas_Albreccod ;
   protected int gxTv_SdtSDTDetalleEntradas_Albrpieent ;
   protected int gxTv_SdtSDTDetalleEntradas_Albrpieuti ;
   protected int gxTv_SdtSDTDetalleEntradas_Albrpiedis ;
   protected int gxTv_SdtSDTDetalleEntradas_Pzsexp ;
   protected String gxTv_SdtSDTDetalleEntradas_Clinom ;
   protected String gxTv_SdtSDTDetalleEntradas_Albref ;
   protected String gxTv_SdtSDTDetalleEntradas_Albrefdsc ;
   protected String gxTv_SdtSDTDetalleEntradas_Albrent2 ;
   protected String gxTv_SdtSDTDetalleEntradas_Albruni ;
   protected String gxTv_SdtSDTDetalleEntradas_Albrloc ;
   protected String gxTv_SdtSDTDetalleEntradas_Procenom ;
   protected String gxTv_SdtSDTDetalleEntradas_Trnnom ;
   protected String gxTv_SdtSDTDetalleEntradas_Obs ;
   protected java.util.Date gxTv_SdtSDTDetalleEntradas_Albrfen ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleEntradas_Albrunient ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleEntradas_Albruniuti ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleEntradas_Albrunidis ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleEntradas_Kgsexp ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleEntradas_Mtsexp ;
}

