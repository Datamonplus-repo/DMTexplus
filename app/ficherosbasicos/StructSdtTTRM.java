package app.ficherosbasicos ;
import com.genexus.*;

public final  class StructSdtTTRM implements Cloneable, java.io.Serializable
{
   public StructSdtTTRM( )
   {
      this( -1, new ModelContext( StructSdtTTRM.class ));
   }

   public StructSdtTTRM( int remoteHandle ,
                         ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTTRM_Emprcod = "" ;
      gxTv_SdtTTRM_Emprnom = "" ;
      gxTv_SdtTTRM_Trmdivnom = "" ;
      gxTv_SdtTTRM_Trmfecha = cal.getTime() ;
      gxTv_SdtTTRM_Trmcompra = new java.math.BigDecimal(0) ;
      gxTv_SdtTTRM_Trmventa = new java.math.BigDecimal(0) ;
      gxTv_SdtTTRM_Trmautman = "" ;
      gxTv_SdtTTRM_Mode = "" ;
      gxTv_SdtTTRM_Emprcod_Z = "" ;
      gxTv_SdtTTRM_Emprnom_Z = "" ;
      gxTv_SdtTTRM_Trmdivnom_Z = "" ;
      gxTv_SdtTTRM_Trmfecha_Z = cal.getTime() ;
      gxTv_SdtTTRM_Trmcompra_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTTRM_Trmventa_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTTRM_Trmautman_Z = "" ;
      gxTv_SdtTTRM_Emprnom_N = (byte)(1) ;
      gxTv_SdtTTRM_Trmdivnom_N = (byte)(1) ;
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
      return gxTv_SdtTTRM_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Emprcod = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtTTRM_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtTTRM_Emprnom_N = (byte)(0) ;
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Emprnom = value ;
   }

   public byte getTrmdivid( )
   {
      return gxTv_SdtTTRM_Trmdivid ;
   }

   public void setTrmdivid( byte value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Trmdivid = value ;
   }

   public String getTrmdivnom( )
   {
      return gxTv_SdtTTRM_Trmdivnom ;
   }

   public void setTrmdivnom( String value )
   {
      gxTv_SdtTTRM_Trmdivnom_N = (byte)(0) ;
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Trmdivnom = value ;
   }

   public java.util.Date getTrmfecha( )
   {
      return gxTv_SdtTTRM_Trmfecha ;
   }

   public void setTrmfecha( java.util.Date value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Trmfecha = value ;
   }

   public java.math.BigDecimal getTrmcompra( )
   {
      return gxTv_SdtTTRM_Trmcompra ;
   }

   public void setTrmcompra( java.math.BigDecimal value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Trmcompra = value ;
   }

   public java.math.BigDecimal getTrmventa( )
   {
      return gxTv_SdtTTRM_Trmventa ;
   }

   public void setTrmventa( java.math.BigDecimal value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Trmventa = value ;
   }

   public String getTrmautman( )
   {
      return gxTv_SdtTTRM_Trmautman ;
   }

   public void setTrmautman( String value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Trmautman = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTTRM_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTTRM_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Initialized = value ;
   }

   public String getEmprcod_Z( )
   {
      return gxTv_SdtTTRM_Emprcod_Z ;
   }

   public void setEmprcod_Z( String value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Emprcod_Z = value ;
   }

   public String getEmprnom_Z( )
   {
      return gxTv_SdtTTRM_Emprnom_Z ;
   }

   public void setEmprnom_Z( String value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Emprnom_Z = value ;
   }

   public byte getTrmdivid_Z( )
   {
      return gxTv_SdtTTRM_Trmdivid_Z ;
   }

   public void setTrmdivid_Z( byte value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Trmdivid_Z = value ;
   }

   public String getTrmdivnom_Z( )
   {
      return gxTv_SdtTTRM_Trmdivnom_Z ;
   }

   public void setTrmdivnom_Z( String value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Trmdivnom_Z = value ;
   }

   public java.util.Date getTrmfecha_Z( )
   {
      return gxTv_SdtTTRM_Trmfecha_Z ;
   }

   public void setTrmfecha_Z( java.util.Date value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Trmfecha_Z = value ;
   }

   public java.math.BigDecimal getTrmcompra_Z( )
   {
      return gxTv_SdtTTRM_Trmcompra_Z ;
   }

   public void setTrmcompra_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Trmcompra_Z = value ;
   }

   public java.math.BigDecimal getTrmventa_Z( )
   {
      return gxTv_SdtTTRM_Trmventa_Z ;
   }

   public void setTrmventa_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Trmventa_Z = value ;
   }

   public String getTrmautman_Z( )
   {
      return gxTv_SdtTTRM_Trmautman_Z ;
   }

   public void setTrmautman_Z( String value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Trmautman_Z = value ;
   }

   public byte getEmprnom_N( )
   {
      return gxTv_SdtTTRM_Emprnom_N ;
   }

   public void setEmprnom_N( byte value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Emprnom_N = value ;
   }

   public byte getTrmdivnom_N( )
   {
      return gxTv_SdtTTRM_Trmdivnom_N ;
   }

   public void setTrmdivnom_N( byte value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      gxTv_SdtTTRM_Trmdivnom_N = value ;
   }

   protected byte gxTv_SdtTTRM_Trmdivid ;
   protected byte gxTv_SdtTTRM_Trmdivid_Z ;
   protected byte gxTv_SdtTTRM_Emprnom_N ;
   protected byte gxTv_SdtTTRM_Trmdivnom_N ;
   private byte gxTv_SdtTTRM_N ;
   protected short gxTv_SdtTTRM_Initialized ;
   protected String gxTv_SdtTTRM_Emprcod ;
   protected String gxTv_SdtTTRM_Emprnom ;
   protected String gxTv_SdtTTRM_Trmdivnom ;
   protected String gxTv_SdtTTRM_Trmautman ;
   protected String gxTv_SdtTTRM_Mode ;
   protected String gxTv_SdtTTRM_Emprcod_Z ;
   protected String gxTv_SdtTTRM_Emprnom_Z ;
   protected String gxTv_SdtTTRM_Trmdivnom_Z ;
   protected String gxTv_SdtTTRM_Trmautman_Z ;
   protected java.util.Date gxTv_SdtTTRM_Trmfecha ;
   protected java.math.BigDecimal gxTv_SdtTTRM_Trmcompra ;
   protected java.math.BigDecimal gxTv_SdtTTRM_Trmventa ;
   protected java.util.Date gxTv_SdtTTRM_Trmfecha_Z ;
   protected java.math.BigDecimal gxTv_SdtTTRM_Trmcompra_Z ;
   protected java.math.BigDecimal gxTv_SdtTTRM_Trmventa_Z ;
}

