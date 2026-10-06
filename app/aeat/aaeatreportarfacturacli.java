package app.aeat ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aaeatreportarfacturacli extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aaeatreportarfacturacli pgm = new aaeatreportarfacturacli (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      int aP0 = 0;

      try
      {
         aP0 = (int) GXutil.lval( args[0]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0);
   }

   public aaeatreportarfacturacli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aaeatreportarfacturacli.class ), "" );
   }

   public aaeatreportarfacturacli( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( int aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( int aP0 )
   {
      aaeatreportarfacturacli.this.AV8FacCod = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16FileName = GXutil.trim( AV22Pgmname) + "-" + GXutil.trim( GXutil.str( AV8FacCod, 8, 0)) ;
      AV16FileName += ".json" ;
      GXv_boolean1[0] = AV9IsPending ;
      GXv_char2[0] = AV10MessagePending ;
      new app.aeat.aeat_validar_faccod(remoteHandle, context).execute( AV8FacCod, GXv_boolean1, GXv_char2) ;
      aaeatreportarfacturacli.this.AV9IsPending = GXv_boolean1[0] ;
      aaeatreportarfacturacli.this.AV10MessagePending = GXv_char2[0] ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "AEAT_Validar_FacCod: in: &FACCOD: %1, out: &IsPending: %2, &MessagePending: %3", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8FacCod), 8, 0), GXutil.booltostr( AV9IsPending), AV10MessagePending, "", "", "", "", "", ""), AV22Pgmname) ;
      if ( (0==AV8FacCod) )
      {
         AV13ResultadoEnviarFacturaAEAT = httpContext.getMessage( "Se requiere Codigo Factura", "") ;
      }
      else if ( ! AV9IsPending )
      {
         AV13ResultadoEnviarFacturaAEAT = GXutil.trim( AV10MessagePending) ;
      }
      else
      {
         GXv_int3[0] = AV14StatusCode ;
         GXv_char2[0] = AV15xmlRespuesta ;
         GXv_char4[0] = AV10MessagePending ;
         new app.aeat.enviarfacturaaeat(remoteHandle, context).execute( AV8FacCod, GXv_int3, GXv_char2, GXv_char4) ;
         aaeatreportarfacturacli.this.AV14StatusCode = GXv_int3[0] ;
         aaeatreportarfacturacli.this.AV15xmlRespuesta = GXv_char2[0] ;
         aaeatreportarfacturacli.this.AV10MessagePending = GXv_char4[0] ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "EnviarFacturaAEAT: in: &FACCOD: %1, out: &StatusCode: %2, &MessagePending: %3", ""), GXutil.trim( GXutil.str( AV8FacCod, 8, 0)), GXutil.trim( GXutil.str( AV14StatusCode, 10, 0)), AV10MessagePending, "", "", "", "", "", ""), AV22Pgmname) ;
         AV11RespuestaRegistroFacturacionAlta.fromxml(AV15xmlRespuesta, null, null);
         if ( ! ( AV14StatusCode == 200 ) )
         {
            if ( GXutil.strcmp(AV11RespuestaRegistroFacturacionAlta.getgxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro(), "") == 0 )
            {
               AV11RespuestaRegistroFacturacionAlta.setgxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro( "Failure" );
               AV12RespuestaRegistroFacturacionAltaErrores = (app.aeat.SdtErrorType)new app.aeat.SdtErrorType(remoteHandle, context);
               AV12RespuestaRegistroFacturacionAltaErrores.setgxTv_SdtErrorType_Codigoerror( GXutil.trim( GXutil.str( AV14StatusCode, 10, 0)) );
               AV12RespuestaRegistroFacturacionAltaErrores.setgxTv_SdtErrorType_Descripcionerror( (!(GXutil.strcmp("", AV15xmlRespuesta)==0) ? AV22Pgmname+GXutil.newLine( )+GXutil.trim( AV15xmlRespuesta) : httpContext.getMessage( "?? Fallo técnico status en la conexión  o estructura del XML.", "")) );
               AV11RespuestaRegistroFacturacionAlta.getgxTv_SdtRespuestaRegistroFacturacionAlta_Errores().add(AV12RespuestaRegistroFacturacionAltaErrores, 0);
            }
         }
         AV13ResultadoEnviarFacturaAEAT = AV11RespuestaRegistroFacturacionAlta.toJSonString(false, true) ;
      }
      /* Execute user subroutine: 'LIMPIAR CADENAS \N \T' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV17File.setSource( AV16FileName );
      if ( AV17File.exists() )
      {
         AV17File.delete();
      }
      AV17File.openWrite("");
      AV17File.writeLine(GXutil.trim( AV13ResultadoEnviarFacturaAEAT));
      AV17File.close();
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Resultado Enviar Factura AEAT: %1", ""), GXutil.trim( AV13ResultadoEnviarFacturaAEAT), "", "", "", "", "", "", "", ""), AV22Pgmname) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LIMPIAR CADENAS \N \T' Routine */
      returnInSub = false ;
      AV18Cadenas.add("\\n", 0);
      AV18Cadenas.add("\\t", 0);
      AV23GXV1 = 1 ;
      while ( AV23GXV1 <= AV18Cadenas.size() )
      {
         AV19Cadena = (String)AV18Cadenas.elementAt(-1+AV23GXV1) ;
         while ( GXutil.strSearch( AV13ResultadoEnviarFacturaAEAT, AV19Cadena, 1) > 0 )
         {
            AV13ResultadoEnviarFacturaAEAT = GXutil.strReplace( AV13ResultadoEnviarFacturaAEAT, AV19Cadena, " ") ;
            new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Limpiar cadena: %1 en ResultadoEnviarFacturaAEAT: %2", ""), GXutil.trim( AV19Cadena), GXutil.trim( AV13ResultadoEnviarFacturaAEAT), "", "", "", "", "", "", ""), AV22Pgmname) ;
         }
         AV23GXV1 = (int)(AV23GXV1+1) ;
      }
      AV19Cadena = "  " ;
      while ( GXutil.strSearch( AV13ResultadoEnviarFacturaAEAT, AV19Cadena, 1) > 0 )
      {
         AV13ResultadoEnviarFacturaAEAT = GXutil.strReplace( AV13ResultadoEnviarFacturaAEAT, AV19Cadena, " ") ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Limpiar Espacios Dobles en ResultadoEnviarFacturaAEAT: %2", ""), GXutil.trim( AV19Cadena), GXutil.trim( AV13ResultadoEnviarFacturaAEAT), "", "", "", "", "", "", ""), AV22Pgmname) ;
      }
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Resultado Enviar Factura AEAT: %1", ""), GXutil.trim( AV13ResultadoEnviarFacturaAEAT), "", "", "", "", "", "", "", ""), AV22Pgmname) ;
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(aeatreportarfacturacli.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16FileName = "" ;
      AV22Pgmname = "" ;
      GXv_boolean1 = new boolean[1] ;
      AV10MessagePending = "" ;
      AV13ResultadoEnviarFacturaAEAT = "" ;
      GXv_int3 = new long[1] ;
      AV15xmlRespuesta = "" ;
      GXv_char2 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV11RespuestaRegistroFacturacionAlta = new app.aeat.SdtRespuestaRegistroFacturacionAlta(remoteHandle, context);
      AV12RespuestaRegistroFacturacionAltaErrores = new app.aeat.SdtErrorType(remoteHandle, context);
      AV17File = new com.genexus.util.GXFile();
      AV18Cadenas = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19Cadena = "" ;
      AV22Pgmname = "AEAT.AAEATReportarFacturaCli" ;
      /* GeneXus formulas. */
      AV22Pgmname = "AEAT.AAEATReportarFacturaCli" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8FacCod ;
   private int AV23GXV1 ;
   private long AV14StatusCode ;
   private long GXv_int3[] ;
   private String AV22Pgmname ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private boolean AV9IsPending ;
   private boolean GXv_boolean1[] ;
   private boolean returnInSub ;
   private String AV13ResultadoEnviarFacturaAEAT ;
   private String AV15xmlRespuesta ;
   private String AV16FileName ;
   private String AV10MessagePending ;
   private String AV19Cadena ;
   private com.genexus.util.GXFile AV17File ;
   private GXSimpleCollection<String> AV18Cadenas ;
   private app.aeat.SdtRespuestaRegistroFacturacionAlta AV11RespuestaRegistroFacturacionAlta ;
   private app.aeat.SdtErrorType AV12RespuestaRegistroFacturacionAltaErrores ;
}

