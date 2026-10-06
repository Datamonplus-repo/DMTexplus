package app ;
import com.genexus.*;

public final  class StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr( )
   {
      this( -1, new ModelContext( StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr.class ));
   }

   public StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr( int remoteHandle ,
                                                                  ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisbarser = "" ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreodsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hiscolnom = "" ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisnomcli = "" ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreohdr = "" ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreofec = cal.getTime() ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hiskgmori = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisbarkgm = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hismtrori = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisbarmtr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreofec_N = (byte)(1) ;
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

   public String getHisbarser( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisbarser ;
   }

   public void setHisbarser( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisbarser = value ;
   }

   public String getHisreodsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreodsc ;
   }

   public void setHisreodsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreodsc = value ;
   }

   public String getHiscolnom( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hiscolnom ;
   }

   public void setHiscolnom( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hiscolnom = value ;
   }

   public int getHiscolnum( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hiscolnum ;
   }

   public void setHiscolnum( int value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hiscolnum = value ;
   }

   public String getHisnomcli( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisnomcli ;
   }

   public void setHisnomcli( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisnomcli = value ;
   }

   public String getHisreohdr( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreohdr ;
   }

   public void setHisreohdr( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreohdr = value ;
   }

   public java.util.Date getHisreofec( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreofec ;
   }

   public void setHisreofec( java.util.Date value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreofec_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreofec = value ;
   }

   public java.math.BigDecimal getHiskgmori( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hiskgmori ;
   }

   public void setHiskgmori( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hiskgmori = value ;
   }

   public java.math.BigDecimal getHisbarkgm( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisbarkgm ;
   }

   public void setHisbarkgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisbarkgm = value ;
   }

   public java.math.BigDecimal getHismtrori( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hismtrori ;
   }

   public void setHismtrori( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hismtrori = value ;
   }

   public java.math.BigDecimal getHisbarmtr( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisbarmtr ;
   }

   public void setHisbarmtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisbarmtr = value ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreofec_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_N ;
   protected int gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hiscolnum ;
   protected String gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisbarser ;
   protected String gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreodsc ;
   protected String gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hiscolnom ;
   protected String gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisnomcli ;
   protected String gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreohdr ;
   protected java.util.Date gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisreofec ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hiskgmori ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisbarkgm ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hismtrori ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr_Hisbarmtr ;
}

