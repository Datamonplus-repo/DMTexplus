package app.expedicionesautomatizadas ;
import com.genexus.*;

public final  class StructSdtSDT_PiezaDefectos_SDT_PiezaDefecto implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_PiezaDefectos_SDT_PiezaDefecto( )
   {
      this( -1, new ModelContext( StructSdtSDT_PiezaDefectos_SDT_PiezaDefecto.class ));
   }

   public StructSdtSDT_PiezaDefectos_SDT_PiezaDefecto( int remoteHandle ,
                                                       ModelContext context )
   {
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefdsc = "" ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetini = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetfin = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieob = "" ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Trozos = "" ;
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

   public short getTipdefcod( )
   {
      return gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefcod ;
   }

   public void setTipdefcod( short value )
   {
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N = (byte)(0) ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefcod = value ;
   }

   public String getTipdefdsc( )
   {
      return gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefdsc ;
   }

   public void setTipdefdsc( String value )
   {
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N = (byte)(0) ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefdsc = value ;
   }

   public java.math.BigDecimal getMetpiemetini( )
   {
      return gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetini ;
   }

   public void setMetpiemetini( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N = (byte)(0) ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetini = value ;
   }

   public java.math.BigDecimal getMetpiemetfin( )
   {
      return gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetfin ;
   }

   public void setMetpiemetfin( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N = (byte)(0) ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetfin = value ;
   }

   public byte getMetpieest( )
   {
      return gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieest ;
   }

   public void setMetpieest( byte value )
   {
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N = (byte)(0) ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieest = value ;
   }

   public String getMetpieob( )
   {
      return gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieob ;
   }

   public void setMetpieob( String value )
   {
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N = (byte)(0) ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieob = value ;
   }

   public String getTrozos( )
   {
      return gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Trozos ;
   }

   public void setTrozos( String value )
   {
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N = (byte)(0) ;
      gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Trozos = value ;
   }

   protected byte gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieest ;
   protected byte gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_N ;
   protected short gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefcod ;
   protected String gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefdsc ;
   protected String gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpieob ;
   protected String gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Trozos ;
   protected java.math.BigDecimal gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetini ;
   protected java.math.BigDecimal gxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetfin ;
}

