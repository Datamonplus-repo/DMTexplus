package app.websevices ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class creacionclaveprivadapemopenssl extends GXProcedure
{
   public creacionclaveprivadapemopenssl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( creacionclaveprivadapemopenssl.class ), "" );
   }

   public creacionclaveprivadapemopenssl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      creacionclaveprivadapemopenssl.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      creacionclaveprivadapemopenssl.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV17RutaOpenSSL ;
      GXv_char2[0] = GXt_char1 ;
      new app.websevices.rutaparametrizadaopenssl(remoteHandle, context).execute( GXv_char2) ;
      creacionclaveprivadapemopenssl.this.GXt_char1 = GXv_char2[0] ;
      AV17RutaOpenSSL = GXt_char1 ;
      AV8OpenSSLFile.setSource( AV17RutaOpenSSL );
      AV9FechaHora = GXutil.now( ) ;
      AV13NumeroFechaHora = (long)(GXutil.year( AV9FechaHora)*10000000000L) ;
      AV13NumeroFechaHora = (long)(AV13NumeroFechaHora+(GXutil.month( AV9FechaHora)*100000000)) ;
      AV13NumeroFechaHora = (long)(AV13NumeroFechaHora+(GXutil.day( AV9FechaHora)*1000000)) ;
      AV13NumeroFechaHora = (long)(AV13NumeroFechaHora+(GXutil.hour( AV9FechaHora)*10000)) ;
      AV13NumeroFechaHora = (long)(AV13NumeroFechaHora+(GXutil.minute( AV9FechaHora)*100)) ;
      AV13NumeroFechaHora = (long)(AV13NumeroFechaHora+(GXutil.second( AV9FechaHora))) ;
      if ( (GXutil.strcmp("", AV17RutaOpenSSL)==0) )
      {
         AV19TextoResultado = "Se requiere ruta del programa OPENSSL" ;
      }
      else if ( ! AV8OpenSSLFile.exists() )
      {
         AV19TextoResultado = "No se encuentrá archivo " + GXutil.trim( AV17RutaOpenSSL) ;
      }
      else
      {
         /* Execute user subroutine: 'GENERAR ARCHIVO CLAVEPRIVADA PEM' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'GENERAR ARCHIVO CLAVEPRIVADA PEM' Routine */
      returnInSub = false ;
      AV12NombreClavePrivada = GXutil.format( httpContext.getMessage( "ClavePrivada_%1.pem", ""), GXutil.trim( GXutil.str( AV13NumeroFechaHora, 18, 0)), "", "", "", "", "", "", "", "") ;
      AV11ClavePrivadaFile.setSource( GXutil.trim( AV12NombreClavePrivada) );
      AV11ClavePrivadaFile.create();
      AV11ClavePrivadaFile.openWrite("");
      AV11ClavePrivadaFile.close();
      if ( AV11ClavePrivadaFile.exists() )
      {
         AV12NombreClavePrivada = AV11ClavePrivadaFile.getAbsoluteName() ;
         AV11ClavePrivadaFile.delete();
         AV11ClavePrivadaFile.setSource( GXutil.trim( AV12NombreClavePrivada) );
         AV10InstruccionShell = GXutil.format( httpContext.getMessage( "\"%1\" genrsa -out \"%2\" 1024", ""), GXutil.trim( AV17RutaOpenSSL), GXutil.trim( AV12NombreClavePrivada), "", "", "", "", "", "", "") ;
         AV14Resultado = (short)(GXutil.shell( AV10InstruccionShell, 1, 0)) ;
         if ( AV11ClavePrivadaFile.exists() )
         {
            AV15RutaClavePrivadaPEM = AV11ClavePrivadaFile.getAbsoluteName() ;
         }
         else
         {
            AV15RutaClavePrivadaPEM = "Falló, no generó Archivo " + GXutil.trim( AV12NombreClavePrivada) ;
         }
      }
      else
      {
         AV15RutaClavePrivadaPEM = "Falló, no creó Archivo " + GXutil.trim( AV12NombreClavePrivada) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = creacionclaveprivadapemopenssl.this.AV15RutaClavePrivadaPEM;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15RutaClavePrivadaPEM = "" ;
      AV17RutaOpenSSL = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV8OpenSSLFile = new com.genexus.util.GXFile();
      AV9FechaHora = GXutil.resetTime( GXutil.nullDate() );
      AV19TextoResultado = "" ;
      AV12NombreClavePrivada = "" ;
      AV11ClavePrivadaFile = new com.genexus.util.GXFile();
      AV10InstruccionShell = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV14Resultado ;
   private short Gx_err ;
   private long AV13NumeroFechaHora ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV9FechaHora ;
   private boolean returnInSub ;
   private String AV15RutaClavePrivadaPEM ;
   private String AV17RutaOpenSSL ;
   private String AV19TextoResultado ;
   private String AV12NombreClavePrivada ;
   private String AV10InstruccionShell ;
   private com.genexus.util.GXFile AV8OpenSSLFile ;
   private com.genexus.util.GXFile AV11ClavePrivadaFile ;
   private String[] aP0 ;
}

