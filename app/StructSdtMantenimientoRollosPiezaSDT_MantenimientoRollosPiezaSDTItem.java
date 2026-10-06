package app ;
import com.genexus.*;

public final  class StructSdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem( )
   {
      this( -1, new ModelContext( StructSdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem.class ));
   }

   public StructSdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem( int remoteHandle ,
                                                                                ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Emprcod = "" ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodpar = "" ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Procod = "" ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barnhdr = "" ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fascod = "" ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fasdsc = "" ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Maqcodbis = "" ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfaskgm = new java.math.BigDecimal(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfasmtr = new java.math.BigDecimal(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Bartierea = new java.math.BigDecimal(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea = cal.getTime() ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea_N = (byte)(1) ;
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
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Emprcod = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodpar = value ;
   }

   public short getBarordlin( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barordlin ;
   }

   public void setBarordlin( short value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barordlin = value ;
   }

   public String getProcod( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Procod ;
   }

   public void setProcod( String value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Procod = value ;
   }

   public String getBarnhdr( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barnhdr ;
   }

   public void setBarnhdr( String value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barnhdr = value ;
   }

   public String getFascod( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fascod ;
   }

   public void setFascod( String value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fascod = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fasdsc = value ;
   }

   public String getMaqcodbis( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Maqcodbis ;
   }

   public void setMaqcodbis( String value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Maqcodbis = value ;
   }

   public java.math.BigDecimal getBarfaskgm( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfaskgm ;
   }

   public void setBarfaskgm( java.math.BigDecimal value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfaskgm = value ;
   }

   public java.math.BigDecimal getBarfasmtr( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfasmtr ;
   }

   public void setBarfasmtr( java.math.BigDecimal value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfasmtr = value ;
   }

   public java.math.BigDecimal getBartierea( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Bartierea ;
   }

   public void setBartierea( java.math.BigDecimal value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Bartierea = value ;
   }

   public java.util.Date getBarfecrea( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea ;
   }

   public void setBarfecrea( java.util.Date value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea = value ;
   }

   protected byte gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodreo ;
   protected byte gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea_N ;
   protected byte gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N ;
   protected short gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barordlin ;
   protected int gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcod ;
   protected String gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Emprcod ;
   protected String gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodpar ;
   protected String gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Procod ;
   protected String gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barnhdr ;
   protected String gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fascod ;
   protected String gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fasdsc ;
   protected String gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Maqcodbis ;
   protected java.math.BigDecimal gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfaskgm ;
   protected java.math.BigDecimal gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfasmtr ;
   protected java.math.BigDecimal gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Bartierea ;
   protected java.util.Date gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea ;
}

