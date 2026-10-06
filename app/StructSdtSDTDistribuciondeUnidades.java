package app ;
import com.genexus.*;

public final  class StructSdtSDTDistribuciondeUnidades implements Cloneable, java.io.Serializable
{
   public StructSdtSDTDistribuciondeUnidades( )
   {
      this( -1, new ModelContext( StructSdtSDTDistribuciondeUnidades.class ));
   }

   public StructSdtSDTDistribuciondeUnidades( int remoteHandle ,
                                              ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTDistribuciondeUnidades_Clinom = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Albref = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrefdsc = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrfen = cal.getTime() ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrent2 = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Albruni = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrunient = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrunidis = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrloc = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Procenom = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Trnnom = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Obs = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrfen_N = (byte)(1) ;
      gxTv_SdtSDTDistribuciondeUnidades_Hdrs_N = (byte)(1) ;
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
      return gxTv_SdtSDTDistribuciondeUnidades_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Clinom = value ;
   }

   public String getAlbref( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albref ;
   }

   public void setAlbref( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albref = value ;
   }

   public String getAlbrefdsc( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albrefdsc ;
   }

   public void setAlbrefdsc( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrefdsc = value ;
   }

   public int getAlbreccod( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albreccod ;
   }

   public void setAlbreccod( int value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albreccod = value ;
   }

   public java.util.Date getAlbrfen( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albrfen ;
   }

   public void setAlbrfen( java.util.Date value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_Albrfen_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrfen = value ;
   }

   public String getAlbrent2( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albrent2 ;
   }

   public void setAlbrent2( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrent2 = value ;
   }

   public String getAlbruni( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albruni ;
   }

   public void setAlbruni( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albruni = value ;
   }

   public java.math.BigDecimal getAlbrunient( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albrunient ;
   }

   public void setAlbrunient( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrunient = value ;
   }

   public int getAlbrpieent( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albrpieent ;
   }

   public void setAlbrpieent( int value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrpieent = value ;
   }

   public java.math.BigDecimal getAlbrunidis( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albrunidis ;
   }

   public void setAlbrunidis( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrunidis = value ;
   }

   public int getAlbrpiedis( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albrpiedis ;
   }

   public void setAlbrpiedis( int value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrpiedis = value ;
   }

   public String getAlbrloc( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albrloc ;
   }

   public void setAlbrloc( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrloc = value ;
   }

   public String getProcenom( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Procenom ;
   }

   public void setProcenom( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Procenom = value ;
   }

   public String getTrnnom( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Trnnom ;
   }

   public void setTrnnom( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Trnnom = value ;
   }

   public String getObs( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Obs ;
   }

   public void setObs( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Obs = value ;
   }

   public java.util.Vector<app.StructSdtSDTDistribuciondeUnidades_HdrsItem> getHdrs( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Hdrs ;
   }

   public void setHdrs( java.util.Vector<app.StructSdtSDTDistribuciondeUnidades_HdrsItem> value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_Hdrs_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Hdrs = value ;
   }

   protected byte gxTv_SdtSDTDistribuciondeUnidades_Albrfen_N ;
   protected byte gxTv_SdtSDTDistribuciondeUnidades_Hdrs_N ;
   protected byte gxTv_SdtSDTDistribuciondeUnidades_N ;
   protected int gxTv_SdtSDTDistribuciondeUnidades_Clicod ;
   protected int gxTv_SdtSDTDistribuciondeUnidades_Albreccod ;
   protected int gxTv_SdtSDTDistribuciondeUnidades_Albrpieent ;
   protected int gxTv_SdtSDTDistribuciondeUnidades_Albrpiedis ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Clinom ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Albref ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Albrefdsc ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Albrent2 ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Albruni ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Albrloc ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Procenom ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Trnnom ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Obs ;
   protected java.util.Date gxTv_SdtSDTDistribuciondeUnidades_Albrfen ;
   protected java.math.BigDecimal gxTv_SdtSDTDistribuciondeUnidades_Albrunient ;
   protected java.math.BigDecimal gxTv_SdtSDTDistribuciondeUnidades_Albrunidis ;
   protected java.util.Vector<app.StructSdtSDTDistribuciondeUnidades_HdrsItem> gxTv_SdtSDTDistribuciondeUnidades_Hdrs=null ;
}

