package app.websevices ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class creacionhashopenssl extends GXProcedure
{
   public creacionhashopenssl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( creacionhashopenssl.class ), "" );
   }

   public creacionhashopenssl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             boolean aP1 ,
                             boolean[] aP2 )
   {
      creacionhashopenssl.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        boolean aP1 ,
                        boolean[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             boolean aP1 ,
                             boolean[] aP2 ,
                             String[] aP3 )
   {
      creacionhashopenssl.this.AV8Texto = aP0;
      creacionhashopenssl.this.AV47UsarKeyParametrizada = aP1;
      creacionhashopenssl.this.aP2 = aP2;
      creacionhashopenssl.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV41GeneradoHASH = false ;
      GXt_char1 = AV42Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      creacionhashopenssl.this.GXt_char1 = GXv_char2[0] ;
      AV42Station = GXt_char1 ;
      GXv_char2[0] = AV14Emprcod ;
      GXv_char3[0] = AV43EmprNom ;
      GXv_char4[0] = AV44UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV42Station, GXv_char2, GXv_char3, GXv_char4) ;
      creacionhashopenssl.this.AV14Emprcod = GXv_char2[0] ;
      creacionhashopenssl.this.AV43EmprNom = GXv_char3[0] ;
      creacionhashopenssl.this.AV44UsurCod = GXv_char4[0] ;
      if ( ! (GXutil.strcmp("", AV14Emprcod)==0) )
      {
         if ( AV47UsarKeyParametrizada )
         {
            AV45ContCod = "CPRPEM" ;
            GXt_char1 = AV30NombreKeyPrivada ;
            GXv_char4[0] = GXt_char1 ;
            new app.core.pbusdsc2(remoteHandle, context).execute( AV14Emprcod, AV45ContCod, GXv_char4) ;
            creacionhashopenssl.this.GXt_char1 = GXv_char4[0] ;
            AV30NombreKeyPrivada = GXt_char1 ;
            if ( (GXutil.strcmp("", AV30NombreKeyPrivada)==0) )
            {
               GXv_char4[0] = AV14Emprcod ;
               new app.websevices.registrarparametrocprpem(remoteHandle, context).execute( GXv_char4) ;
               creacionhashopenssl.this.AV14Emprcod = GXv_char4[0] ;
               GXt_char1 = AV30NombreKeyPrivada ;
               GXv_char4[0] = GXt_char1 ;
               new app.core.pbusdsc2(remoteHandle, context).execute( AV14Emprcod, AV45ContCod, GXv_char4) ;
               creacionhashopenssl.this.GXt_char1 = GXv_char4[0] ;
               AV30NombreKeyPrivada = GXt_char1 ;
            }
            if ( ! (GXutil.strcmp("", AV30NombreKeyPrivada)==0) )
            {
               AV30NombreKeyPrivada = GXutil.trim( AV30NombreKeyPrivada) ;
               AV28KeyPrivadaFile.setSource( AV30NombreKeyPrivada );
               if ( AV28KeyPrivadaFile.exists() )
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
                  AV26TextoResultado = httpContext.getMessage( "No existe Archivo PEM", "") + AV30NombreKeyPrivada ;
               }
            }
            else
            {
               AV26TextoResultado = httpContext.getMessage( "La parametrización del Código CPRPEM, no registra nombre del archivo PEM, por favor ajustar", "") ;
            }
         }
         else
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
      }
      else
      {
         AV26TextoResultado = httpContext.getMessage( "No se detecta Terminal de Conexión. Revisar inicio de Sesión", "") ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'GENERAR USANDO OPENSSL' Routine */
      returnInSub = false ;
      GXt_char1 = AV39RutaOpenSSL ;
      GXv_char4[0] = GXt_char1 ;
      new app.websevices.rutaparametrizadaopenssl(remoteHandle, context).execute( GXv_char4) ;
      creacionhashopenssl.this.GXt_char1 = GXv_char4[0] ;
      AV39RutaOpenSSL = GXt_char1 ;
      AV24OpenSSLFile.setSource( AV39RutaOpenSSL );
      AV25FechaHora = GXutil.now( ) ;
      AV34NumeroFechaHora = (long)(GXutil.year( AV25FechaHora)*10000000000L) ;
      AV34NumeroFechaHora = (long)(AV34NumeroFechaHora+(GXutil.month( AV25FechaHora)*100000000)) ;
      AV34NumeroFechaHora = (long)(AV34NumeroFechaHora+(GXutil.day( AV25FechaHora)*1000000)) ;
      AV34NumeroFechaHora = (long)(AV34NumeroFechaHora+(GXutil.hour( AV25FechaHora)*10000)) ;
      AV34NumeroFechaHora = (long)(AV34NumeroFechaHora+(GXutil.minute( AV25FechaHora)*100)) ;
      AV34NumeroFechaHora = (long)(AV34NumeroFechaHora+(GXutil.second( AV25FechaHora))) ;
      if ( (GXutil.strcmp("", AV8Texto)==0) )
      {
         AV26TextoResultado = "Se requiere texto a procesar" ;
      }
      else if ( (GXutil.strcmp("", AV39RutaOpenSSL)==0) )
      {
         AV26TextoResultado = "Se requiere ruta del programa OPENSSL" ;
      }
      else if ( ! AV24OpenSSLFile.exists() )
      {
         AV26TextoResultado = GXutil.trim( AV39RutaOpenSSL) ;
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
      AV33NombreRegistroTxt = GXutil.format( httpContext.getMessage( "Registro_%1.txt", ""), GXutil.trim( GXutil.str( AV34NumeroFechaHora, 18, 0)), "", "", "", "", "", "", "", "") ;
      AV37RegistroTxtFile.setSource( AV33NombreRegistroTxt );
      AV37RegistroTxtFile.create();
      AV37RegistroTxtFile.openWrite("");
      AV37RegistroTxtFile.writeLine(GXutil.trim( AV8Texto));
      AV37RegistroTxtFile.close();
      if ( AV37RegistroTxtFile.exists() )
      {
         AV40RutaTrabajo = AV37RegistroTxtFile.getPath() ;
         if ( AV47UsarKeyParametrizada )
         {
            /* Execute user subroutine: 'CREAR ARCHIVO REGISTRO SHA1' */
            S131 ();
            if (returnInSub) return;
         }
         else
         {
            /* Execute user subroutine: 'GENERAR ARCHIVO KEYPRIVADA PEM' */
            S141 ();
            if (returnInSub) return;
         }
      }
      else
      {
         AV26TextoResultado = "Falló, no generó Archivo " + GXutil.trim( AV33NombreRegistroTxt) ;
      }
   }

   public void S141( )
   {
      /* 'GENERAR ARCHIVO KEYPRIVADA PEM' Routine */
      returnInSub = false ;
      GXt_char1 = AV30NombreKeyPrivada ;
      GXv_char4[0] = GXt_char1 ;
      new app.websevices.creacionclaveprivadapemopenssl(remoteHandle, context).execute( GXv_char4) ;
      creacionhashopenssl.this.GXt_char1 = GXv_char4[0] ;
      AV30NombreKeyPrivada = GXt_char1 ;
      AV28KeyPrivadaFile.setSource( GXutil.trim( AV30NombreKeyPrivada) );
      if ( AV28KeyPrivadaFile.exists() )
      {
         /* Execute user subroutine: 'CREAR ARCHIVO REGISTRO SHA1' */
         S131 ();
         if (returnInSub) return;
      }
      else
      {
         AV26TextoResultado = "Falló, no generó Archivo " + GXutil.trim( AV30NombreKeyPrivada) ;
      }
      AV37RegistroTxtFile.delete();
   }

   public void S131( )
   {
      /* 'CREAR ARCHIVO REGISTRO SHA1' Routine */
      returnInSub = false ;
      AV32NombreRegistroSha1 = GXutil.format( httpContext.getMessage( "%1\\Registro_%2.sha1", ""), GXutil.trim( AV40RutaTrabajo), GXutil.trim( GXutil.str( AV34NumeroFechaHora, 18, 0)), "", "", "", "", "", "", "") ;
      AV36RegistroSha1File.setSource( GXutil.trim( AV32NombreRegistroSha1) );
      AV27InstruccionShell = GXutil.format( httpContext.getMessage( "\"%1\" dgst -sha1 -sign \"%2\" -out \"%3\" \"%4\"", ""), GXutil.trim( AV39RutaOpenSSL), GXutil.trim( AV30NombreKeyPrivada), GXutil.trim( AV32NombreRegistroSha1), GXutil.trim( AV37RegistroTxtFile.getAbsoluteName()), "", "", "", "", "") ;
      AV38Resultado = (short)(GXutil.shell( AV27InstruccionShell, 1, 0)) ;
      if ( AV36RegistroSha1File.exists() )
      {
         /* Execute user subroutine: 'CREAR ARCHIVO REGISTRO APLICANDO BASE64' */
         S151 ();
         if (returnInSub) return;
      }
      else
      {
         AV26TextoResultado = "Falló, no generó Archivo " + GXutil.trim( AV32NombreRegistroSha1) ;
      }
      if ( ! AV47UsarKeyParametrizada )
      {
         AV28KeyPrivadaFile.delete();
      }
   }

   public void S151( )
   {
      /* 'CREAR ARCHIVO REGISTRO APLICANDO BASE64' Routine */
      returnInSub = false ;
      AV31NombreRegistroB64 = GXutil.format( httpContext.getMessage( "%1\\Registro_%2.b64", ""), GXutil.trim( AV40RutaTrabajo), GXutil.trim( GXutil.str( AV34NumeroFechaHora, 18, 0)), "", "", "", "", "", "", "") ;
      AV35RegistroB64File.setSource( AV31NombreRegistroB64 );
      AV27InstruccionShell = GXutil.format( httpContext.getMessage( "\"%1\" enc -base64 -in \"%2\" -out \"%3\" -A", ""), GXutil.trim( AV39RutaOpenSSL), GXutil.trim( AV32NombreRegistroSha1), GXutil.trim( AV31NombreRegistroB64), "", "", "", "", "", "") ;
      AV38Resultado = (short)(GXutil.shell( AV27InstruccionShell, 1, 0)) ;
      if ( AV35RegistroB64File.exists() )
      {
         /* Execute user subroutine: 'ABRIR ARCHIVO BASE64 PARA OBTENER HASH' */
         S161 ();
         if (returnInSub) return;
      }
      else
      {
         AV26TextoResultado = "Falló, no generó archivo " + AV31NombreRegistroB64 ;
      }
      AV36RegistroSha1File.delete();
   }

   public void S161( )
   {
      /* 'ABRIR ARCHIVO BASE64 PARA OBTENER HASH' Routine */
      returnInSub = false ;
      AV35RegistroB64File.openRead("");
      AV26TextoResultado = AV35RegistroB64File.readLine() ;
      if ( (GXutil.strcmp("", AV26TextoResultado)==0) )
      {
         AV26TextoResultado = httpContext.getMessage( "Falló, no registra información el archivo ", "") + GXutil.trim( AV31NombreRegistroB64) ;
      }
      else
      {
         AV41GeneradoHASH = true ;
      }
      AV35RegistroB64File.close();
      AV35RegistroB64File.delete();
   }

   protected void cleanup( )
   {
      this.aP2[0] = creacionhashopenssl.this.AV41GeneradoHASH;
      this.aP3[0] = creacionhashopenssl.this.AV26TextoResultado;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26TextoResultado = "" ;
      AV42Station = "" ;
      AV14Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV43EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV44UsurCod = "" ;
      AV45ContCod = "" ;
      AV30NombreKeyPrivada = "" ;
      AV28KeyPrivadaFile = new com.genexus.util.GXFile();
      AV39RutaOpenSSL = "" ;
      AV24OpenSSLFile = new com.genexus.util.GXFile();
      AV25FechaHora = GXutil.resetTime( GXutil.nullDate() );
      AV33NombreRegistroTxt = "" ;
      AV37RegistroTxtFile = new com.genexus.util.GXFile();
      AV40RutaTrabajo = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV32NombreRegistroSha1 = "" ;
      AV36RegistroSha1File = new com.genexus.util.GXFile();
      AV27InstruccionShell = "" ;
      AV31NombreRegistroB64 = "" ;
      AV35RegistroB64File = new com.genexus.util.GXFile();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV38Resultado ;
   private short Gx_err ;
   private long AV34NumeroFechaHora ;
   private String AV42Station ;
   private String AV14Emprcod ;
   private String GXv_char2[] ;
   private String AV43EmprNom ;
   private String GXv_char3[] ;
   private String AV44UsurCod ;
   private String AV45ContCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private java.util.Date AV25FechaHora ;
   private boolean AV47UsarKeyParametrizada ;
   private boolean AV41GeneradoHASH ;
   private boolean returnInSub ;
   private String AV8Texto ;
   private String AV26TextoResultado ;
   private String AV30NombreKeyPrivada ;
   private String AV39RutaOpenSSL ;
   private String AV33NombreRegistroTxt ;
   private String AV40RutaTrabajo ;
   private String AV32NombreRegistroSha1 ;
   private String AV27InstruccionShell ;
   private String AV31NombreRegistroB64 ;
   private com.genexus.util.GXFile AV28KeyPrivadaFile ;
   private com.genexus.util.GXFile AV24OpenSSLFile ;
   private com.genexus.util.GXFile AV37RegistroTxtFile ;
   private com.genexus.util.GXFile AV36RegistroSha1File ;
   private com.genexus.util.GXFile AV35RegistroB64File ;
   private String[] aP3 ;
   private boolean[] aP2 ;
}

