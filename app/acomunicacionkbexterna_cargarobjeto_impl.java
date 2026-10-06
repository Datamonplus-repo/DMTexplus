package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class acomunicacionkbexterna_cargarobjeto_impl extends GXWebProcedure
{
   public acomunicacionkbexterna_cargarobjeto_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "ClienteVertexEncriptado") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV18ClienteVertexEncriptado = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV21KbExternaEncriptada = httpContext.GetPar( "KbExternaEncriptada") ;
            AV16CadenaEncriptacion = httpContext.GetPar( "CadenaEncriptacion") ;
            AV24ObjetoEncriptado = httpContext.GetPar( "ObjetoEncriptado") ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33WebSession.remove("TexplusNET_Autentication");
      AV33WebSession.remove("TexplusNET_ComunicacionKbExterna");
      GXt_char1 = AV8EmprCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.vxparam_acaemp(remoteHandle, context).execute( GXv_char2) ;
      acomunicacionkbexterna_cargarobjeto_impl.this.GXt_char1 = GXv_char2[0] ;
      AV8EmprCod = GXt_char1 ;
      GXt_char1 = AV8EmprCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.vxparam_netusr(remoteHandle, context).execute( GXv_char2) ;
      acomunicacionkbexterna_cargarobjeto_impl.this.GXt_char1 = GXv_char2[0] ;
      AV8EmprCod = GXt_char1 ;
      GXt_char1 = AV10USURCOD ;
      GXv_char2[0] = GXt_char1 ;
      new app.vxparam_netusr(remoteHandle, context).execute( GXv_char2) ;
      acomunicacionkbexterna_cargarobjeto_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10USURCOD = GXt_char1 ;
      if ( (GXutil.strcmp("", AV10USURCOD)==0) )
      {
         AV10USURCOD = "ADMIN" ;
         AV11USURPWD = "ADMIN" ;
      }
      AV9SdtAutenticacion.setgxTv_SdtSDTAutenticacion_Cadena01( httpContext.encrypt64( AV11USURPWD, AV16CadenaEncriptacion) );
      AV9SdtAutenticacion.setgxTv_SdtSDTAutenticacion_Cadena02( AV16CadenaEncriptacion );
      AV9SdtAutenticacion.setgxTv_SdtSDTAutenticacion_Cadena03( httpContext.encrypt64( AV10USURCOD, AV16CadenaEncriptacion) );
      AV9SdtAutenticacion.setgxTv_SdtSDTAutenticacion_Cadena04( httpContext.encrypt64( AV8EmprCod, AV16CadenaEncriptacion) );
      AV33WebSession.setValue("TexplusNET_Autentication", AV9SdtAutenticacion.toJSonString(false, true));
      AV30Station = httpContext.getMessage( "NE", "") + AV10USURCOD ;
      GXv_char2[0] = AV30Station ;
      GXv_char3[0] = AV28SecEmprCod ;
      new app.pusuemp(remoteHandle, context).execute( GXv_char2, GXv_char3) ;
      acomunicacionkbexterna_cargarobjeto_impl.this.AV30Station = GXv_char2[0] ;
      acomunicacionkbexterna_cargarobjeto_impl.this.AV28SecEmprCod = GXv_char3[0] ;
      AV33WebSession.setValue("TexplusNET_ComunicacionKbExterna", "registrado");
      AV25Programa = httpContext.decrypt64( AV24ObjetoEncriptado, AV9SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena02()) ;
      new app.comunicacionkbexterna_listaobjetosdisponibles(remoteHandle, context).execute( AV25Programa) ;
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV18ClienteVertexEncriptado = "" ;
      AV21KbExternaEncriptada = "" ;
      AV16CadenaEncriptacion = "" ;
      AV24ObjetoEncriptado = "" ;
      AV33WebSession = httpContext.getWebSession();
      AV8EmprCod = "" ;
      AV10USURCOD = "" ;
      GXt_char1 = "" ;
      AV11USURPWD = "" ;
      AV9SdtAutenticacion = new app.wwpbaseobjects.SdtSDTAutenticacion(remoteHandle, context);
      AV30Station = "" ;
      GXv_char2 = new String[1] ;
      AV28SecEmprCod = "" ;
      GXv_char3 = new String[1] ;
      AV25Programa = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV8EmprCod ;
   private String AV10USURCOD ;
   private String GXt_char1 ;
   private String AV11USURPWD ;
   private String AV30Station ;
   private String GXv_char2[] ;
   private String AV28SecEmprCod ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private String AV18ClienteVertexEncriptado ;
   private String AV21KbExternaEncriptada ;
   private String AV16CadenaEncriptacion ;
   private String AV24ObjetoEncriptado ;
   private String AV25Programa ;
   private app.wwpbaseobjects.SdtSDTAutenticacion AV9SdtAutenticacion ;
   private com.genexus.webpanels.WebSession AV33WebSession ;
}

