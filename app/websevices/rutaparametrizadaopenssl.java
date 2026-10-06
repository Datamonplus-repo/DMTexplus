package app.websevices ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rutaparametrizadaopenssl extends GXProcedure
{
   public rutaparametrizadaopenssl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rutaparametrizadaopenssl.class ), "" );
   }

   public rutaparametrizadaopenssl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      rutaparametrizadaopenssl.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      rutaparametrizadaopenssl.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV40Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      rutaparametrizadaopenssl.this.GXt_char1 = GXv_char2[0] ;
      AV40Station = GXt_char1 ;
      GXv_char2[0] = AV11Emprcod ;
      GXv_char3[0] = AV41EmprNom ;
      GXv_char4[0] = AV42UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV40Station, GXv_char2, GXv_char3, GXv_char4) ;
      rutaparametrizadaopenssl.this.AV11Emprcod = GXv_char2[0] ;
      rutaparametrizadaopenssl.this.AV41EmprNom = GXv_char3[0] ;
      rutaparametrizadaopenssl.this.AV42UsurCod = GXv_char4[0] ;
      if ( ! (GXutil.strcmp("", AV11Emprcod)==0) )
      {
         AV43ContCod = "OPENSS" ;
         GXt_char1 = AV35RutaOpenSSL ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pbusdsc2(remoteHandle, context).execute( AV11Emprcod, AV43ContCod, GXv_char4) ;
         rutaparametrizadaopenssl.this.GXt_char1 = GXv_char4[0] ;
         AV35RutaOpenSSL = GXt_char1 ;
         if ( (GXutil.strcmp("", AV35RutaOpenSSL)==0) )
         {
            GXv_char4[0] = AV11Emprcod ;
            new app.websevices.registrarparametroopenss(remoteHandle, context).execute( GXv_char4) ;
            rutaparametrizadaopenssl.this.AV11Emprcod = GXv_char4[0] ;
            GXt_char1 = AV35RutaOpenSSL ;
            GXv_char4[0] = GXt_char1 ;
            new app.core.pbusdsc2(remoteHandle, context).execute( AV11Emprcod, AV43ContCod, GXv_char4) ;
            rutaparametrizadaopenssl.this.GXt_char1 = GXv_char4[0] ;
            AV35RutaOpenSSL = GXt_char1 ;
         }
         if ( ! (GXutil.strcmp("", AV35RutaOpenSSL)==0) )
         {
            AV8OpenSSLFile.setSource( AV35RutaOpenSSL );
            if ( ! AV8OpenSSLFile.exists() )
            {
               AV35RutaOpenSSL = GXutil.format( httpContext.getMessage( "No existe Archivo : %1", ""), AV35RutaOpenSSL, "", "", "", "", "", "", "", "") ;
            }
         }
         else
         {
            AV17TextoResultado = GXutil.format( httpContext.getMessage( "La parametrización del Código %1, no registra nombre del archivo OPENSSL.EXE, por favor ajustar", ""), GXutil.trim( AV43ContCod), "", "", "", "", "", "", "", "") ;
         }
      }
      else
      {
         AV17TextoResultado = httpContext.getMessage( "No se detecta Terminal de Conexión. Revisar inicio de Sesión", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = rutaparametrizadaopenssl.this.AV35RutaOpenSSL;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV35RutaOpenSSL = "" ;
      AV40Station = "" ;
      AV11Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV41EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV42UsurCod = "" ;
      AV43ContCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV8OpenSSLFile = new com.genexus.util.GXFile();
      AV17TextoResultado = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV40Station ;
   private String AV11Emprcod ;
   private String GXv_char2[] ;
   private String AV41EmprNom ;
   private String GXv_char3[] ;
   private String AV42UsurCod ;
   private String AV43ContCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String AV35RutaOpenSSL ;
   private String AV17TextoResultado ;
   private com.genexus.util.GXFile AV8OpenSSLFile ;
   private String[] aP0 ;
}

