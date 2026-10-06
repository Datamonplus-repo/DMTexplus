package app ;
import com.genexus.*;

public final  class StructSdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea.class ));
   }

   public StructSdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea( int remoteHandle ,
                                                               ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albref = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrefdsc = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen = cal.getTime() ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Nalbaran = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruni = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunient = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruniuti = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadeslibres = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunidis = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrloc = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrlote = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Procenom = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Trnnom = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrdiscli = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadesexpedidas = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen_N = (byte)(1) ;
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

   public String getAlbref( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albref ;
   }

   public void setAlbref( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albref = value ;
   }

   public String getAlbrefdsc( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrefdsc ;
   }

   public void setAlbrefdsc( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrefdsc = value ;
   }

   public int getAlbreccod( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albreccod ;
   }

   public void setAlbreccod( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albreccod = value ;
   }

   public java.util.Date getAlbrfen( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen ;
   }

   public void setAlbrfen( java.util.Date value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen = value ;
   }

   public String getNalbaran( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Nalbaran ;
   }

   public void setNalbaran( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Nalbaran = value ;
   }

   public String getAlbruni( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruni ;
   }

   public void setAlbruni( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruni = value ;
   }

   public java.math.BigDecimal getAlbrunient( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunient ;
   }

   public void setAlbrunient( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunient = value ;
   }

   public java.math.BigDecimal getAlbruniuti( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruniuti ;
   }

   public void setAlbruniuti( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruniuti = value ;
   }

   public java.math.BigDecimal getUnidadeslibres( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadeslibres ;
   }

   public void setUnidadeslibres( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadeslibres = value ;
   }

   public java.math.BigDecimal getAlbrunidis( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunidis ;
   }

   public void setAlbrunidis( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunidis = value ;
   }

   public int getAlbrpieent( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieent ;
   }

   public void setAlbrpieent( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieent = value ;
   }

   public int getAlbrpieuti( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieuti ;
   }

   public void setAlbrpieuti( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieuti = value ;
   }

   public int getAlbrpiedis( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpiedis ;
   }

   public void setAlbrpiedis( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpiedis = value ;
   }

   public String getAlbrloc( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrloc ;
   }

   public void setAlbrloc( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrloc = value ;
   }

   public String getAlbrlote( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrlote ;
   }

   public void setAlbrlote( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrlote = value ;
   }

   public String getProcenom( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Procenom ;
   }

   public void setProcenom( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Procenom = value ;
   }

   public String getTrnnom( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Trnnom ;
   }

   public void setTrnnom( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Trnnom = value ;
   }

   public String getAlbrdiscli( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrdiscli ;
   }

   public void setAlbrdiscli( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrdiscli = value ;
   }

   public java.math.BigDecimal getUnidadesexpedidas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadesexpedidas ;
   }

   public void setUnidadesexpedidas( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadesexpedidas = value ;
   }

   public int getPiezasexpedidas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Piezasexpedidas ;
   }

   public void setPiezasexpedidas( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Piezasexpedidas = value ;
   }

   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen_N ;
   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albreccod ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieent ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieuti ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpiedis ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Piezasexpedidas ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albref ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrefdsc ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Nalbaran ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruni ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrloc ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrlote ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Procenom ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Trnnom ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrdiscli ;
   protected java.util.Date gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunient ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruniuti ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadeslibres ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunidis ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadesexpedidas ;
}

