package app ;
import com.genexus.*;

public final  class StructSdtSdtFasePedido implements Cloneable, java.io.Serializable
{
   public StructSdtSdtFasePedido( )
   {
      this( -1, new ModelContext( StructSdtSdtFasePedido.class ));
   }

   public StructSdtSdtFasePedido( int remoteHandle ,
                                  ModelContext context )
   {
      gxTv_SdtSdtFasePedido_Fascod = "" ;
      gxTv_SdtSdtFasePedido_Fasdsc = "" ;
      gxTv_SdtSdtFasePedido_Fasapr = "" ;
      gxTv_SdtSdtFasePedido_Dismaqpru = "" ;
      gxTv_SdtSdtFasePedido_Disfaspre = new java.math.BigDecimal(0) ;
      gxTv_SdtSdtFasePedido_Disfasuni = "" ;
      gxTv_SdtSdtFasePedido_Disfasdto = new java.math.BigDecimal(0) ;
      gxTv_SdtSdtFasePedido_Disfasrec = new java.math.BigDecimal(0) ;
      gxTv_SdtSdtFasePedido_Disfastpp = new java.math.BigDecimal(0) ;
      gxTv_SdtSdtFasePedido_Disfasupl = new java.math.BigDecimal(0) ;
      gxTv_SdtSdtFasePedido_Disfasrb = new java.math.BigDecimal(0) ;
      gxTv_SdtSdtFasePedido_Disfasobs = "" ;
      gxTv_SdtSdtFasePedido_Disvelpro = new java.math.BigDecimal(0) ;
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

   public short getDisfaslin( )
   {
      return gxTv_SdtSdtFasePedido_Disfaslin ;
   }

   public void setDisfaslin( short value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfaslin = value ;
   }

   public String getFascod( )
   {
      return gxTv_SdtSdtFasePedido_Fascod ;
   }

   public void setFascod( String value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Fascod = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtSdtFasePedido_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Fasdsc = value ;
   }

   public String getFasapr( )
   {
      return gxTv_SdtSdtFasePedido_Fasapr ;
   }

   public void setFasapr( String value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Fasapr = value ;
   }

   public String getDismaqpru( )
   {
      return gxTv_SdtSdtFasePedido_Dismaqpru ;
   }

   public void setDismaqpru( String value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Dismaqpru = value ;
   }

   public short getDisquiul( )
   {
      return gxTv_SdtSdtFasePedido_Disquiul ;
   }

   public void setDisquiul( short value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disquiul = value ;
   }

   public java.math.BigDecimal getDisfaspre( )
   {
      return gxTv_SdtSdtFasePedido_Disfaspre ;
   }

   public void setDisfaspre( java.math.BigDecimal value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfaspre = value ;
   }

   public String getDisfasuni( )
   {
      return gxTv_SdtSdtFasePedido_Disfasuni ;
   }

   public void setDisfasuni( String value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfasuni = value ;
   }

   public java.math.BigDecimal getDisfasdto( )
   {
      return gxTv_SdtSdtFasePedido_Disfasdto ;
   }

   public void setDisfasdto( java.math.BigDecimal value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfasdto = value ;
   }

   public java.math.BigDecimal getDisfasrec( )
   {
      return gxTv_SdtSdtFasePedido_Disfasrec ;
   }

   public void setDisfasrec( java.math.BigDecimal value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfasrec = value ;
   }

   public byte getDisfasaut( )
   {
      return gxTv_SdtSdtFasePedido_Disfasaut ;
   }

   public void setDisfasaut( byte value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfasaut = value ;
   }

   public java.math.BigDecimal getDisfastpp( )
   {
      return gxTv_SdtSdtFasePedido_Disfastpp ;
   }

   public void setDisfastpp( java.math.BigDecimal value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfastpp = value ;
   }

   public java.math.BigDecimal getDisfasupl( )
   {
      return gxTv_SdtSdtFasePedido_Disfasupl ;
   }

   public void setDisfasupl( java.math.BigDecimal value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfasupl = value ;
   }

   public java.math.BigDecimal getDisfasrb( )
   {
      return gxTv_SdtSdtFasePedido_Disfasrb ;
   }

   public void setDisfasrb( java.math.BigDecimal value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfasrb = value ;
   }

   public short getDta_uord( )
   {
      return gxTv_SdtSdtFasePedido_Dta_uord ;
   }

   public void setDta_uord( short value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Dta_uord = value ;
   }

   public String getDisfasobs( )
   {
      return gxTv_SdtSdtFasePedido_Disfasobs ;
   }

   public void setDisfasobs( String value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disfasobs = value ;
   }

   public short getDispresal( )
   {
      return gxTv_SdtSdtFasePedido_Dispresal ;
   }

   public void setDispresal( short value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Dispresal = value ;
   }

   public short getDisprepie( )
   {
      return gxTv_SdtSdtFasePedido_Disprepie ;
   }

   public void setDisprepie( short value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disprepie = value ;
   }

   public java.math.BigDecimal getDisvelpro( )
   {
      return gxTv_SdtSdtFasePedido_Disvelpro ;
   }

   public void setDisvelpro( java.math.BigDecimal value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disvelpro = value ;
   }

   public short getDisnumpas( )
   {
      return gxTv_SdtSdtFasePedido_Disnumpas ;
   }

   public void setDisnumpas( short value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Disnumpas = value ;
   }

   public byte getFaspreobl( )
   {
      return gxTv_SdtSdtFasePedido_Faspreobl ;
   }

   public void setFaspreobl( byte value )
   {
      gxTv_SdtSdtFasePedido_N = (byte)(0) ;
      gxTv_SdtSdtFasePedido_Faspreobl = value ;
   }

   protected byte gxTv_SdtSdtFasePedido_Disfasaut ;
   protected byte gxTv_SdtSdtFasePedido_Faspreobl ;
   protected byte gxTv_SdtSdtFasePedido_N ;
   protected short gxTv_SdtSdtFasePedido_Disfaslin ;
   protected short gxTv_SdtSdtFasePedido_Disquiul ;
   protected short gxTv_SdtSdtFasePedido_Dta_uord ;
   protected short gxTv_SdtSdtFasePedido_Dispresal ;
   protected short gxTv_SdtSdtFasePedido_Disprepie ;
   protected short gxTv_SdtSdtFasePedido_Disnumpas ;
   protected String gxTv_SdtSdtFasePedido_Fascod ;
   protected String gxTv_SdtSdtFasePedido_Fasdsc ;
   protected String gxTv_SdtSdtFasePedido_Fasapr ;
   protected String gxTv_SdtSdtFasePedido_Dismaqpru ;
   protected String gxTv_SdtSdtFasePedido_Disfasuni ;
   protected String gxTv_SdtSdtFasePedido_Disfasobs ;
   protected java.math.BigDecimal gxTv_SdtSdtFasePedido_Disfaspre ;
   protected java.math.BigDecimal gxTv_SdtSdtFasePedido_Disfasdto ;
   protected java.math.BigDecimal gxTv_SdtSdtFasePedido_Disfasrec ;
   protected java.math.BigDecimal gxTv_SdtSdtFasePedido_Disfastpp ;
   protected java.math.BigDecimal gxTv_SdtSdtFasePedido_Disfasupl ;
   protected java.math.BigDecimal gxTv_SdtSdtFasePedido_Disfasrb ;
   protected java.math.BigDecimal gxTv_SdtSdtFasePedido_Disvelpro ;
}

