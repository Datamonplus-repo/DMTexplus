package app.produccion ;
import com.genexus.*;

public final  class StructSdtSDTInformeProduccionResumenMaquina_MaquinaItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeProduccionResumenMaquina_MaquinaItem( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeProduccionResumenMaquina_MaquinaItem.class ));
   }

   public StructSdtSDTInformeProduccionResumenMaquina_MaquinaItem( int remoteHandle ,
                                                                   ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqdsc = "" ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf = cal.getTime() ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolot = "" ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolotbar = "" ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf_N = (byte)(1) ;
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
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqdsc = value ;
   }

   public java.util.Date getHisprodtf( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf ;
   }

   public void setHisprodtf( java.util.Date value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf = value ;
   }

   public short getParcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Parcod ;
   }

   public void setParcod( short value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Parcod = value ;
   }

   public byte getHisproreo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisproreo ;
   }

   public void setHisproreo( byte value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisproreo = value ;
   }

   public java.math.BigDecimal getHispromtr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr ;
   }

   public void setHispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr = value ;
   }

   public java.math.BigDecimal getHisprokgr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr ;
   }

   public void setHisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr = value ;
   }

   public String getHisprolot( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolot ;
   }

   public void setHisprolot( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolot = value ;
   }

   public int getMinutos( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Minutos ;
   }

   public void setMinutos( int value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Minutos = value ;
   }

   public int getTotaltiempomaquina( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Totaltiempomaquina ;
   }

   public void setTotaltiempomaquina( int value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Totaltiempomaquina = value ;
   }

   public java.math.BigDecimal getPorkilo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo ;
   }

   public void setPorkilo( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo = value ;
   }

   public java.math.BigDecimal getPormetro( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro ;
   }

   public void setPormetro( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro = value ;
   }

   public String getHisprolotbar( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolotbar ;
   }

   public void setHisprolotbar( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolotbar = value ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisproreo ;
   protected byte gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N ;
   protected short gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Parcod ;
   protected int gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Minutos ;
   protected int gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Totaltiempomaquina ;
   protected String gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqdsc ;
   protected String gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolot ;
   protected String gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolotbar ;
   protected java.util.Date gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro ;
}

