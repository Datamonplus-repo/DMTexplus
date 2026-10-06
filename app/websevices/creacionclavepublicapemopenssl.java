package app.websevices ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class creacionclavepublicapemopenssl extends GXProcedure
{
   public creacionclavepublicapemopenssl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( creacionclavepublicapemopenssl.class ), "" );
   }

   public creacionclavepublicapemopenssl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      creacionclavepublicapemopenssl.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      creacionclavepublicapemopenssl.this.AV15RutaClavePrivadaPEM = aP0;
      creacionclavepublicapemopenssl.this.aP1 = aP1;
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
      creacionclavepublicapemopenssl.this.GXt_char1 = GXv_char2[0] ;
      AV17RutaOpenSSL = GXt_char1 ;
      AV8OpenSSLFile.setSource( AV17RutaOpenSSL );
      AV9FechaHora = GXutil.now( ) ;
      AV13NumeroFechaHora = (long)(GXutil.year( AV9FechaHora)*10000000000L) ;
      AV13NumeroFechaHora = (long)(AV13NumeroFechaHora+(GXutil.month( AV9FechaHora)*100000000)) ;
      AV13NumeroFechaHora = (long)(AV13NumeroFechaHora+(GXutil.day( AV9FechaHora)*1000000)) ;
      AV13NumeroFechaHora = (long)(AV13NumeroFechaHora+(GXutil.hour( AV9FechaHora)*10000)) ;
      AV13NumeroFechaHora = (long)(AV13NumeroFechaHora+(GXutil.minute( AV9FechaHora)*100)) ;
      AV13NumeroFechaHora = (long)(AV13NumeroFechaHora+(GXutil.second( AV9FechaHora))) ;
      AV11ClavePrivadaFile.setSource( AV15RutaClavePrivadaPEM );
      if ( (GXutil.strcmp("", AV17RutaOpenSSL)==0) )
      {
         AV19TextoResultado = "Se requiere ruta del programa OPENSSL" ;
      }
      else if ( ! AV8OpenSSLFile.exists() )
      {
         AV19TextoResultado = "No se encuentrá archivo " + GXutil.trim( AV17RutaOpenSSL) ;
      }
      else if ( ! AV11ClavePrivadaFile.exists() )
      {
         AV19TextoResultado = "No se encuentrá archivo " + GXutil.trim( AV15RutaClavePrivadaPEM) ;
      }
      else
      {
         /* Execute user subroutine: 'GENERAR ARCHIVO CLAVEPUBLICA PEM' */
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
      /* 'GENERAR ARCHIVO CLAVEPUBLICA PEM' Routine */
      returnInSub = false ;
      AV22PosicionExtension = (short)(GXutil.strSearchRev( AV15RutaClavePrivadaPEM, ".", -1)) ;
      AV21NombreClavePublica = GXutil.strReplace( GXutil.lower( AV15RutaClavePrivadaPEM), httpContext.getMessage( "privada", ""), httpContext.getMessage( "Publica", "")) ;
      if ( GXutil.strcmp(GXutil.lower( AV21NombreClavePublica), GXutil.lower( AV15RutaClavePrivadaPEM)) == 0 )
      {
         AV21NombreClavePublica = GXutil.substring( AV15RutaClavePrivadaPEM, 1, (AV22PosicionExtension-1)) ;
         AV21NombreClavePublica += "_Pub" ;
         AV21NombreClavePublica += GXutil.substring( AV15RutaClavePrivadaPEM, AV22PosicionExtension, 255) ;
      }
      AV10InstruccionShell = GXutil.format( httpContext.getMessage( "\"%1\" rsa -in \"%2\" -out \"%3\" -outform PEM -pubout ", ""), GXutil.trim( AV17RutaOpenSSL), GXutil.trim( AV11ClavePrivadaFile.getAbsoluteName()), GXutil.trim( AV21NombreClavePublica), "", "", "", "", "", "") ;
      AV14Resultado = (short)(GXutil.shell( AV10InstruccionShell, 1, 0)) ;
      AV20ClavePublicaFile.setSource( GXutil.trim( AV21NombreClavePublica) );
      if ( AV20ClavePublicaFile.exists() )
      {
         AV16RutaClavePublicaPEM = AV20ClavePublicaFile.getAbsoluteName() ;
      }
      else
      {
         AV16RutaClavePublicaPEM = GXutil.str( AV14Resultado, 4, 0) + " Falló, no generó Archivo " + AV10InstruccionShell ;
      }
   }

   protected void cleanup( )
   {
      this.aP1[0] = creacionclavepublicapemopenssl.this.AV16RutaClavePublicaPEM;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16RutaClavePublicaPEM = "" ;
      AV17RutaOpenSSL = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV8OpenSSLFile = new com.genexus.util.GXFile();
      AV9FechaHora = GXutil.resetTime( GXutil.nullDate() );
      AV11ClavePrivadaFile = new com.genexus.util.GXFile();
      AV19TextoResultado = "" ;
      AV21NombreClavePublica = "" ;
      AV10InstruccionShell = "" ;
      AV20ClavePublicaFile = new com.genexus.util.GXFile();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV22PosicionExtension ;
   private short AV14Resultado ;
   private short Gx_err ;
   private long AV13NumeroFechaHora ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV9FechaHora ;
   private boolean returnInSub ;
   private String AV15RutaClavePrivadaPEM ;
   private String AV16RutaClavePublicaPEM ;
   private String AV17RutaOpenSSL ;
   private String AV19TextoResultado ;
   private String AV21NombreClavePublica ;
   private String AV10InstruccionShell ;
   private com.genexus.util.GXFile AV8OpenSSLFile ;
   private com.genexus.util.GXFile AV11ClavePrivadaFile ;
   private com.genexus.util.GXFile AV20ClavePublicaFile ;
   private String[] aP1 ;
}

