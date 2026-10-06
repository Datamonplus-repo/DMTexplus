package app ;
import com.genexus.*;

public final  class StructSdtHistoricoReoperadosporCliente_TipodeDefecto_HDR implements Cloneable, java.io.Serializable
{
   public StructSdtHistoricoReoperadosporCliente_TipodeDefecto_HDR( )
   {
      this( -1, new ModelContext( StructSdtHistoricoReoperadosporCliente_TipodeDefecto_HDR.class ));
   }

   public StructSdtHistoricoReoperadosporCliente_TipodeDefecto_HDR( int remoteHandle ,
                                                                    ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarser = "" ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreodsc = "" ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnom = "" ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisnomcli = "" ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreohdr = "" ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec = cal.getTime() ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiskgmori = new java.math.BigDecimal(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarkgm = new java.math.BigDecimal(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hismtrori = new java.math.BigDecimal(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarmtr = new java.math.BigDecimal(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqcod = "" ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqdsc = "" ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec_N = (byte)(1) ;
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
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarser ;
   }

   public void setHisbarser( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarser = value ;
   }

   public String getHisreodsc( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreodsc ;
   }

   public void setHisreodsc( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreodsc = value ;
   }

   public String getHiscolnom( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnom ;
   }

   public void setHiscolnom( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnom = value ;
   }

   public int getHiscolnum( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnum ;
   }

   public void setHiscolnum( int value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnum = value ;
   }

   public String getHisnomcli( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisnomcli ;
   }

   public void setHisnomcli( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisnomcli = value ;
   }

   public String getHisreohdr( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreohdr ;
   }

   public void setHisreohdr( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreohdr = value ;
   }

   public java.util.Date getHisreofec( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec ;
   }

   public void setHisreofec( java.util.Date value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec = value ;
   }

   public java.math.BigDecimal getHiskgmori( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiskgmori ;
   }

   public void setHiskgmori( java.math.BigDecimal value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiskgmori = value ;
   }

   public java.math.BigDecimal getHisbarkgm( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarkgm ;
   }

   public void setHisbarkgm( java.math.BigDecimal value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarkgm = value ;
   }

   public java.math.BigDecimal getHismtrori( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hismtrori ;
   }

   public void setHismtrori( java.math.BigDecimal value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hismtrori = value ;
   }

   public java.math.BigDecimal getHisbarmtr( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarmtr ;
   }

   public void setHisbarmtr( java.math.BigDecimal value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarmtr = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqdsc = value ;
   }

   protected byte gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec_N ;
   protected byte gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N ;
   protected int gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnum ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarser ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreodsc ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnom ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisnomcli ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreohdr ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqcod ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqdsc ;
   protected java.util.Date gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec ;
   protected java.math.BigDecimal gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiskgmori ;
   protected java.math.BigDecimal gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarkgm ;
   protected java.math.BigDecimal gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hismtrori ;
   protected java.math.BigDecimal gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarmtr ;
}

