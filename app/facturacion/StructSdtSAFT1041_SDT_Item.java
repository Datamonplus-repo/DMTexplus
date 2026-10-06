package app.facturacion ;
import com.genexus.*;

public final  class StructSdtSAFT1041_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtSAFT1041_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtSAFT1041_SDT_Item.class ));
   }

   public StructSdtSAFT1041_SDT_Item( int remoteHandle ,
                                      ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSAFT1041_SDT_Item_Facfch = cal.getTime() ;
      gxTv_SdtSAFT1041_SDT_Item_Factot = new java.math.BigDecimal(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Factot1 = new java.math.BigDecimal(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Fachor = cal.getTime() ;
      gxTv_SdtSAFT1041_SDT_Item_Hhdt = cal.getTime() ;
      gxTv_SdtSAFT1041_SDT_Item_Facfirdg = "" ;
      gxTv_SdtSAFT1041_SDT_Item_Dias = "" ;
      gxTv_SdtSAFT1041_SDT_Item_Times = "" ;
      gxTv_SdtSAFT1041_SDT_Item_Hhmmss = "" ;
      gxTv_SdtSAFT1041_SDT_Item_Facfirma = "" ;
      gxTv_SdtSAFT1041_SDT_Item_Facfch_N = (byte)(1) ;
      gxTv_SdtSAFT1041_SDT_Item_Fachor_N = (byte)(1) ;
      gxTv_SdtSAFT1041_SDT_Item_Hhdt_N = (byte)(1) ;
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

   public boolean getSeleccionar1( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Seleccionar1 ;
   }

   public void setSeleccionar1( boolean value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Seleccionar1 = value ;
   }

   public boolean getSeleccionar2( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Seleccionar2 ;
   }

   public void setSeleccionar2( boolean value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Seleccionar2 = value ;
   }

   public byte getFacest( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Facest ;
   }

   public void setFacest( byte value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Facest = value ;
   }

   public int getFaccod( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Faccod ;
   }

   public void setFaccod( int value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Faccod = value ;
   }

   public java.util.Date getFacfch( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Facfch ;
   }

   public void setFacfch( java.util.Date value )
   {
      gxTv_SdtSAFT1041_SDT_Item_Facfch_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Facfch = value ;
   }

   public java.math.BigDecimal getFactot( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Factot ;
   }

   public void setFactot( java.math.BigDecimal value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Factot = value ;
   }

   public java.math.BigDecimal getFactot1( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Factot1 ;
   }

   public void setFactot1( java.math.BigDecimal value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Factot1 = value ;
   }

   public java.util.Date getFachor( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Fachor ;
   }

   public void setFachor( java.util.Date value )
   {
      gxTv_SdtSAFT1041_SDT_Item_Fachor_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Fachor = value ;
   }

   public java.util.Date getHhdt( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Hhdt ;
   }

   public void setHhdt( java.util.Date value )
   {
      gxTv_SdtSAFT1041_SDT_Item_Hhdt_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Hhdt = value ;
   }

   public String getFacfirdg( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Facfirdg ;
   }

   public void setFacfirdg( String value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Facfirdg = value ;
   }

   public String getDias( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Dias ;
   }

   public void setDias( String value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Dias = value ;
   }

   public String getTimes( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Times ;
   }

   public void setTimes( String value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Times = value ;
   }

   public String getHhmmss( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Hhmmss ;
   }

   public void setHhmmss( String value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Hhmmss = value ;
   }

   public String getFacfirma( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Facfirma ;
   }

   public void setFacfirma( String value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Facfirma = value ;
   }

   protected byte gxTv_SdtSAFT1041_SDT_Item_Facest ;
   protected byte gxTv_SdtSAFT1041_SDT_Item_Facfch_N ;
   protected byte gxTv_SdtSAFT1041_SDT_Item_Fachor_N ;
   protected byte gxTv_SdtSAFT1041_SDT_Item_Hhdt_N ;
   protected byte gxTv_SdtSAFT1041_SDT_Item_N ;
   protected int gxTv_SdtSAFT1041_SDT_Item_Faccod ;
   protected String gxTv_SdtSAFT1041_SDT_Item_Facfirdg ;
   protected String gxTv_SdtSAFT1041_SDT_Item_Dias ;
   protected String gxTv_SdtSAFT1041_SDT_Item_Times ;
   protected String gxTv_SdtSAFT1041_SDT_Item_Hhmmss ;
   protected String gxTv_SdtSAFT1041_SDT_Item_Facfirma ;
   protected boolean gxTv_SdtSAFT1041_SDT_Item_Seleccionar1 ;
   protected boolean gxTv_SdtSAFT1041_SDT_Item_Seleccionar2 ;
   protected java.util.Date gxTv_SdtSAFT1041_SDT_Item_Facfch ;
   protected java.math.BigDecimal gxTv_SdtSAFT1041_SDT_Item_Factot ;
   protected java.math.BigDecimal gxTv_SdtSAFT1041_SDT_Item_Factot1 ;
   protected java.util.Date gxTv_SdtSAFT1041_SDT_Item_Fachor ;
   protected java.util.Date gxTv_SdtSAFT1041_SDT_Item_Hhdt ;
}

