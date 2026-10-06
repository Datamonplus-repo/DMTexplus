package app.ponteway.v1 ;
import com.genexus.*;

public final  class StructSdtLoginResponse implements Cloneable, java.io.Serializable
{
   public StructSdtLoginResponse( )
   {
      this( -1, new ModelContext( StructSdtLoginResponse.class ));
   }

   public StructSdtLoginResponse( int remoteHandle ,
                                  ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtLoginResponse_Accesstoken = "" ;
      gxTv_SdtLoginResponse_Expiresin = cal.getTime() ;
      gxTv_SdtLoginResponse_Codutilizador = "" ;
      gxTv_SdtLoginResponse_Codperfil = "" ;
      gxTv_SdtLoginResponse_Programainicial = "" ;
      gxTv_SdtLoginResponse_Expiresin_N = (byte)(1) ;
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

   public String getAccesstoken( )
   {
      return gxTv_SdtLoginResponse_Accesstoken ;
   }

   public void setAccesstoken( String value )
   {
      gxTv_SdtLoginResponse_N = (byte)(0) ;
      gxTv_SdtLoginResponse_Accesstoken = value ;
   }

   public java.util.Date getExpiresin( )
   {
      return gxTv_SdtLoginResponse_Expiresin ;
   }

   public void setExpiresin( java.util.Date value )
   {
      gxTv_SdtLoginResponse_Expiresin_N = (byte)(0) ;
      gxTv_SdtLoginResponse_N = (byte)(0) ;
      gxTv_SdtLoginResponse_Expiresin = value ;
   }

   public boolean getAutenticado( )
   {
      return gxTv_SdtLoginResponse_Autenticado ;
   }

   public void setAutenticado( boolean value )
   {
      gxTv_SdtLoginResponse_N = (byte)(0) ;
      gxTv_SdtLoginResponse_Autenticado = value ;
   }

   public String getCodutilizador( )
   {
      return gxTv_SdtLoginResponse_Codutilizador ;
   }

   public void setCodutilizador( String value )
   {
      gxTv_SdtLoginResponse_N = (byte)(0) ;
      gxTv_SdtLoginResponse_Codutilizador = value ;
   }

   public String getCodperfil( )
   {
      return gxTv_SdtLoginResponse_Codperfil ;
   }

   public void setCodperfil( String value )
   {
      gxTv_SdtLoginResponse_N = (byte)(0) ;
      gxTv_SdtLoginResponse_Codperfil = value ;
   }

   public String getProgramainicial( )
   {
      return gxTv_SdtLoginResponse_Programainicial ;
   }

   public void setProgramainicial( String value )
   {
      gxTv_SdtLoginResponse_N = (byte)(0) ;
      gxTv_SdtLoginResponse_Programainicial = value ;
   }

   protected byte gxTv_SdtLoginResponse_Expiresin_N ;
   protected byte gxTv_SdtLoginResponse_N ;
   protected boolean gxTv_SdtLoginResponse_Autenticado ;
   protected String gxTv_SdtLoginResponse_Accesstoken ;
   protected String gxTv_SdtLoginResponse_Codutilizador ;
   protected String gxTv_SdtLoginResponse_Codperfil ;
   protected String gxTv_SdtLoginResponse_Programainicial ;
   protected java.util.Date gxTv_SdtLoginResponse_Expiresin ;
}

