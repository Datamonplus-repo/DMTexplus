package app.websevices ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hashopenssl_parametro_cprpem extends GXProcedure
{
   public hashopenssl_parametro_cprpem( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hashopenssl_parametro_cprpem.class ), "" );
   }

   public hashopenssl_parametro_cprpem( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             boolean[] aP1 )
   {
      hashopenssl_parametro_cprpem.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        boolean[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             boolean[] aP1 ,
                             String[] aP2 )
   {
      hashopenssl_parametro_cprpem.this.AV25Texto = aP0;
      hashopenssl_parametro_cprpem.this.aP1 = aP1;
      hashopenssl_parametro_cprpem.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26GeneradoHASH = false ;
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      hashopenssl_parametro_cprpem.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      GXv_char2[0] = AV9Emprcod ;
      GXv_char3[0] = AV28EmprNom ;
      GXv_char4[0] = AV29UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      hashopenssl_parametro_cprpem.this.AV9Emprcod = GXv_char2[0] ;
      hashopenssl_parametro_cprpem.this.AV28EmprNom = GXv_char3[0] ;
      hashopenssl_parametro_cprpem.this.AV29UsurCod = GXv_char4[0] ;
      if ( ! (GXutil.strcmp("", AV9Emprcod)==0) )
      {
         AV30ContCod = "CPRPEM" ;
         GXt_char1 = AV14NombreKeyPrivada ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pbusdsc2(remoteHandle, context).execute( AV9Emprcod, AV30ContCod, GXv_char4) ;
         hashopenssl_parametro_cprpem.this.GXt_char1 = GXv_char4[0] ;
         AV14NombreKeyPrivada = GXt_char1 ;
         if ( (GXutil.strcmp("", AV14NombreKeyPrivada)==0) )
         {
            GXv_char4[0] = AV9Emprcod ;
            new app.websevices.registrarparametrocprpem(remoteHandle, context).execute( GXv_char4) ;
            hashopenssl_parametro_cprpem.this.AV9Emprcod = GXv_char4[0] ;
            GXt_char1 = AV14NombreKeyPrivada ;
            GXv_char4[0] = GXt_char1 ;
            new app.core.pbusdsc2(remoteHandle, context).execute( AV9Emprcod, AV30ContCod, GXv_char4) ;
            hashopenssl_parametro_cprpem.this.GXt_char1 = GXv_char4[0] ;
            AV14NombreKeyPrivada = GXt_char1 ;
         }
         if ( ! (GXutil.strcmp("", AV14NombreKeyPrivada)==0) )
         {
            AV14NombreKeyPrivada = GXutil.trim( AV14NombreKeyPrivada) ;
            AV13KeyPrivadaFile.setSource( AV14NombreKeyPrivada );
            if ( AV13KeyPrivadaFile.exists() )
            {
               /* Execute user subroutine: 'GENERAR USANDO OPENSSL' */
               S111 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            else
            {
               AV11TextoResultado = GXutil.format( httpContext.getMessage( "No existe Archivo PEM : %1, revisar parámetrización %2 y/o verificar existencia de archivo en la ruta indicada", ""), GXutil.trim( AV14NombreKeyPrivada), GXutil.trim( AV30ContCod), "", "", "", "", "", "", "") ;
            }
         }
         else
         {
            AV11TextoResultado = GXutil.format( httpContext.getMessage( "La parametrización del Código %1, no registra nombre del archivo PEM, por favor ajustar", ""), GXutil.trim( AV30ContCod), "", "", "", "", "", "", "", "") ;
         }
      }
      else
      {
         AV11TextoResultado = httpContext.getMessage( "No se detecta Terminal de Conexión. Revisar inicio de Sesión", "") ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'GENERAR USANDO OPENSSL' Routine */
      returnInSub = false ;
      GXt_char1 = AV23RutaOpenSSL ;
      GXv_char4[0] = GXt_char1 ;
      new app.websevices.rutaparametrizadaopenssl(remoteHandle, context).execute( GXv_char4) ;
      hashopenssl_parametro_cprpem.this.GXt_char1 = GXv_char4[0] ;
      AV23RutaOpenSSL = GXt_char1 ;
      AV8OpenSSLFile.setSource( AV23RutaOpenSSL );
      AV10FechaHora = GXutil.now( ) ;
      AV18NumeroFechaHora = (long)(GXutil.year( AV10FechaHora)*10000000000L) ;
      AV18NumeroFechaHora = (long)(AV18NumeroFechaHora+(GXutil.month( AV10FechaHora)*100000000)) ;
      AV18NumeroFechaHora = (long)(AV18NumeroFechaHora+(GXutil.day( AV10FechaHora)*1000000)) ;
      AV18NumeroFechaHora = (long)(AV18NumeroFechaHora+(GXutil.hour( AV10FechaHora)*10000)) ;
      AV18NumeroFechaHora = (long)(AV18NumeroFechaHora+(GXutil.minute( AV10FechaHora)*100)) ;
      AV18NumeroFechaHora = (long)(AV18NumeroFechaHora+(GXutil.second( AV10FechaHora))) ;
      if ( (GXutil.strcmp("", AV25Texto)==0) )
      {
         AV11TextoResultado = "Se requiere texto a procesar" ;
      }
      else if ( (GXutil.strcmp("", AV23RutaOpenSSL)==0) )
      {
         AV11TextoResultado = "Se requiere ruta del programa OPENSSL" ;
      }
      else if ( ! AV8OpenSSLFile.exists() )
      {
         AV11TextoResultado = GXutil.trim( AV23RutaOpenSSL) ;
      }
      else
      {
         /* Execute user subroutine: 'GENERAR ARCHIVO REGISTRO TXT CON EL &TEXTO RECIBIDO' */
         S121 ();
         if (returnInSub) return;
      }
   }

   public void S121( )
   {
      /* 'GENERAR ARCHIVO REGISTRO TXT CON EL &TEXTO RECIBIDO' Routine */
      returnInSub = false ;
      AV17NombreRegistroTxt = GXutil.format( httpContext.getMessage( "Registro_%1.txt", ""), GXutil.trim( GXutil.str( AV18NumeroFechaHora, 18, 0)), "", "", "", "", "", "", "", "") ;
      AV21RegistroTxtFile.setSource( AV17NombreRegistroTxt );
      AV21RegistroTxtFile.create();
      AV21RegistroTxtFile.openWrite("");
      AV21RegistroTxtFile.writeAllText(GXutil.trim( AV25Texto), "");
      AV21RegistroTxtFile.close();
      if ( AV21RegistroTxtFile.exists() )
      {
         AV12InstruccionShell = GXutil.format( httpContext.getMessage( "echo %1> \"%2\"", ""), GXutil.trim( AV25Texto), GXutil.trim( AV21RegistroTxtFile.getAbsoluteName()), "", "", "", "", "", "", "") ;
         AV31SeguimientoInstruccionShell = AV12InstruccionShell ;
         AV22Resultado = (short)(GXutil.shell( AV12InstruccionShell, 1, 0)) ;
         AV24RutaTrabajo = AV21RegistroTxtFile.getPath() ;
         /* Execute user subroutine: 'CREAR ARCHIVO REGISTRO SHA1' */
         S131 ();
         if (returnInSub) return;
      }
      else
      {
         AV11TextoResultado = "Falló, no generó Archivo " + GXutil.trim( AV17NombreRegistroTxt) ;
      }
   }

   public void S131( )
   {
      /* 'CREAR ARCHIVO REGISTRO SHA1' Routine */
      returnInSub = false ;
      AV16NombreRegistroSha1 = GXutil.format( httpContext.getMessage( "%1\\Registro_%2.sha1", ""), GXutil.trim( AV24RutaTrabajo), GXutil.trim( GXutil.str( AV18NumeroFechaHora, 18, 0)), "", "", "", "", "", "", "") ;
      AV20RegistroSha1File.setSource( GXutil.trim( AV16NombreRegistroSha1) );
      AV12InstruccionShell = GXutil.format( httpContext.getMessage( "\"%1\" dgst -sha1 -sign \"%2\" -out \"%3\" \"%4\"", ""), GXutil.trim( AV23RutaOpenSSL), GXutil.trim( AV13KeyPrivadaFile.getAbsoluteName()), GXutil.trim( AV16NombreRegistroSha1), GXutil.trim( AV21RegistroTxtFile.getAbsoluteName()), "", "", "", "", "") ;
      AV31SeguimientoInstruccionShell += GXutil.newLine( ) + AV12InstruccionShell ;
      AV22Resultado = (short)(GXutil.shell( AV12InstruccionShell, 1, 0)) ;
      if ( AV20RegistroSha1File.exists() )
      {
         /* Execute user subroutine: 'CREAR ARCHIVO REGISTRO APLICANDO BASE64' */
         S141 ();
         if (returnInSub) return;
      }
      else
      {
         AV11TextoResultado = "Falló, no generó Archivo " + GXutil.trim( AV16NombreRegistroSha1) ;
      }
   }

   public void S141( )
   {
      /* 'CREAR ARCHIVO REGISTRO APLICANDO BASE64' Routine */
      returnInSub = false ;
      AV15NombreRegistroB64 = GXutil.format( httpContext.getMessage( "%1\\Registro_%2.b64", ""), GXutil.trim( AV24RutaTrabajo), GXutil.trim( GXutil.str( AV18NumeroFechaHora, 18, 0)), "", "", "", "", "", "", "") ;
      AV19RegistroB64File.setSource( AV15NombreRegistroB64 );
      AV12InstruccionShell = GXutil.format( httpContext.getMessage( "\"%1\" enc -base64 -in \"%2\" -out \"%3\" -A", ""), GXutil.trim( AV23RutaOpenSSL), GXutil.trim( AV16NombreRegistroSha1), GXutil.trim( AV15NombreRegistroB64), "", "", "", "", "", "") ;
      AV31SeguimientoInstruccionShell += GXutil.newLine( ) + AV12InstruccionShell ;
      AV22Resultado = (short)(GXutil.shell( AV12InstruccionShell, 1, 0)) ;
      if ( AV19RegistroB64File.exists() )
      {
         /* Execute user subroutine: 'ABRIR ARCHIVO BASE64 PARA OBTENER HASH' */
         S151 ();
         if (returnInSub) return;
      }
      else
      {
         AV11TextoResultado = "Falló, no generó archivo " + AV15NombreRegistroB64 + httpContext.getMessage( " Shell( ", "") + GXutil.trim( GXutil.str( AV22Resultado, 4, 0)) ;
      }
      AV20RegistroSha1File.delete();
   }

   public void S151( )
   {
      /* 'ABRIR ARCHIVO BASE64 PARA OBTENER HASH' Routine */
      returnInSub = false ;
      AV19RegistroB64File.openRead("");
      AV11TextoResultado = AV19RegistroB64File.readLine() ;
      if ( (GXutil.strcmp("", AV11TextoResultado)==0) )
      {
         AV11TextoResultado = httpContext.getMessage( "Falló, no registra información el archivo ", "") + GXutil.trim( AV15NombreRegistroB64) ;
      }
      else
      {
         AV26GeneradoHASH = true ;
      }
      AV19RegistroB64File.close();
      AV19RegistroB64File.delete();
   }

   protected void cleanup( )
   {
      this.aP1[0] = hashopenssl_parametro_cprpem.this.AV26GeneradoHASH;
      this.aP2[0] = hashopenssl_parametro_cprpem.this.AV11TextoResultado;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11TextoResultado = "" ;
      AV27Station = "" ;
      AV9Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV28EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV29UsurCod = "" ;
      AV30ContCod = "" ;
      AV14NombreKeyPrivada = "" ;
      AV13KeyPrivadaFile = new com.genexus.util.GXFile();
      AV23RutaOpenSSL = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV8OpenSSLFile = new com.genexus.util.GXFile();
      AV10FechaHora = GXutil.resetTime( GXutil.nullDate() );
      AV17NombreRegistroTxt = "" ;
      AV21RegistroTxtFile = new com.genexus.util.GXFile();
      AV12InstruccionShell = "" ;
      AV31SeguimientoInstruccionShell = "" ;
      AV24RutaTrabajo = "" ;
      AV16NombreRegistroSha1 = "" ;
      AV20RegistroSha1File = new com.genexus.util.GXFile();
      AV15NombreRegistroB64 = "" ;
      AV19RegistroB64File = new com.genexus.util.GXFile();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV22Resultado ;
   private short Gx_err ;
   private long AV18NumeroFechaHora ;
   private String AV27Station ;
   private String AV9Emprcod ;
   private String GXv_char2[] ;
   private String AV28EmprNom ;
   private String GXv_char3[] ;
   private String AV29UsurCod ;
   private String AV30ContCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private java.util.Date AV10FechaHora ;
   private boolean AV26GeneradoHASH ;
   private boolean returnInSub ;
   private String AV25Texto ;
   private String AV11TextoResultado ;
   private String AV14NombreKeyPrivada ;
   private String AV23RutaOpenSSL ;
   private String AV17NombreRegistroTxt ;
   private String AV12InstruccionShell ;
   private String AV31SeguimientoInstruccionShell ;
   private String AV24RutaTrabajo ;
   private String AV16NombreRegistroSha1 ;
   private String AV15NombreRegistroB64 ;
   private com.genexus.util.GXFile AV13KeyPrivadaFile ;
   private com.genexus.util.GXFile AV8OpenSSLFile ;
   private com.genexus.util.GXFile AV21RegistroTxtFile ;
   private com.genexus.util.GXFile AV20RegistroSha1File ;
   private com.genexus.util.GXFile AV19RegistroB64File ;
   private String[] aP2 ;
   private boolean[] aP1 ;
}

