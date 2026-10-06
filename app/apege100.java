package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apege100 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apege100 pgm = new apege100 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apege100( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apege100.class ), "" );
   }

   public apege100( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV8UsurCod = " " ;
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV13EmprCod ;
      GXv_char2[0] = AV27EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      apege100.this.AV13EmprCod = GXv_char1[0] ;
      apege100.this.AV27EmprNom = GXv_char2[0] ;
      apege100.this.AV8UsurCod = GXv_char3[0] ;
      AV21Hhmmss_i = "06:00:00" ;
      GXt_char4 = AV21Hhmmss_i ;
      GXv_char3[0] = AV13EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "HMSDTI", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pexicond(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      apege100.this.AV13EmprCod = GXv_char3[0] ;
      apege100.this.GXt_char4 = GXv_char1[0] ;
      AV21Hhmmss_i = GXt_char4 ;
      AV20Hhmmss_f = "05:59:00" ;
      GXt_char4 = AV20Hhmmss_f ;
      GXv_char3[0] = AV13EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "HMSDTF", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pexicond(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      apege100.this.AV13EmprCod = GXv_char3[0] ;
      apege100.this.GXt_char4 = GXv_char1[0] ;
      AV20Hhmmss_f = GXt_char4 ;
      AV23Horai = localUtil.ctot( AV21Hhmmss_i, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV22HoraF = localUtil.ctot( AV20Hhmmss_f, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      GXt_char4 = AV59ddmmaaaa ;
      GXv_char3[0] = AV13EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "EGEINI", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      apege100.this.AV13EmprCod = GXv_char3[0] ;
      apege100.this.GXt_char4 = GXv_char1[0] ;
      AV59ddmmaaaa = GXt_char4 ;
      AV10Fec1 = ((GXutil.strcmp("", AV59ddmmaaaa)==0) ? localUtil.ctod( "01/01/01", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) : localUtil.ctod( AV59ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      GXt_char4 = AV59ddmmaaaa ;
      GXv_char3[0] = AV13EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "EGEFIN", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      apege100.this.AV13EmprCod = GXv_char3[0] ;
      apege100.this.GXt_char4 = GXv_char1[0] ;
      AV59ddmmaaaa = GXt_char4 ;
      AV11Fec2 = ((GXutil.strcmp("", AV59ddmmaaaa)==0) ? GXutil.today( ) : localUtil.ctod( AV59ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      AV24Fecha_hora = localUtil.dtoc( AV10Fec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV23Horai, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV26Hisprodti = localUtil.ctot( AV24Fecha_hora, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV24Fecha_hora = localUtil.dtoc( AV11Fec2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV22HoraF, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV25Hisprodtf = localUtil.ctot( AV24Fecha_hora, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      GXt_char4 = AV12Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "PATHBI", ""), GXv_char3) ;
      apege100.this.GXt_char4 = GXv_char3[0] ;
      AV12Carpeta = GXt_char4 ;
      GXt_char4 = AV12Carpeta ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char3) ;
      apege100.this.GXt_char4 = GXv_char3[0] ;
      AV12Carpeta = ((GXutil.strcmp("", AV12Carpeta)==0) ? GXt_char4 : AV12Carpeta) ;
      AV14NomInf = httpContext.getMessage( "EGE Unico", "") ;
      AV15File = GXutil.trim( AV12Carpeta) + "\\" + GXutil.trim( AV14NomInf) + httpContext.getMessage( ".csv", "") ;
      if ( new app.core.file(remoteHandle, context).executeUdp( AV15File) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV19Stat = GXutil.deleteFile( AV15File) ;
      }
      GXt_int5 = AV18hnd ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fcreate(remoteHandle, context).execute( AV15File, GXv_int6) ;
      apege100.this.GXt_int5 = GXv_int6[0] ;
      AV18hnd = GXt_int5 ;
      AV16Control = httpContext.getMessage( "Id_Empresa", "") + ";" + httpContext.getMessage( "Fecha", "") + ";" + httpContext.getMessage( "Id_Seccion", "") + ";" + httpContext.getMessage( "Id_Emp_Sec", "") + ";" + httpContext.getMessage( "Máquina", "") + ";" + httpContext.getMessage( "Tiempo Calendario", "") + ";" + httpContext.getMessage( "TIEMPO POR MANTENIMIENTO", "") + ";" + httpContext.getMessage( "TIEMPO no planificado", "") + ";" + httpContext.getMessage( "Tiempo Disponible", "") + ";" + httpContext.getMessage( "Tiempos Perdidos", "") + ";" + httpContext.getMessage( "Tiempo Operativo", "") + ";" + httpContext.getMessage( "% de Disponibilidad", "") + ";" ;
      AV16Control += httpContext.getMessage( "Carga por 24 horas", "") + ";" + httpContext.getMessage( "Kilos/Metros Esperados", "") + ";" + httpContext.getMessage( "Kilos/Metros Reales", "") + ";" + httpContext.getMessage( "% de Rendimiento", "") + ";" + httpContext.getMessage( "Kilos/Metros Reprocesados", "") + ";" + httpContext.getMessage( "Kilos/Metros Bien a la Primera", "") + ";" + httpContext.getMessage( "% de Calidad", "") + ";" + httpContext.getMessage( "% de EGE", "") ;
      GXt_int7 = AV19Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fputs(remoteHandle, context).execute( AV18hnd, AV16Control, GXv_int8) ;
      apege100.this.GXt_int7 = GXv_int8[0] ;
      AV19Stat = GXt_int7 ;
      new app.pacthisprofd(remoteHandle, context).execute( ) ;
      GXv_char3[0] = AV13EmprCod ;
      GXv_date9[0] = AV10Fec1 ;
      GXv_date10[0] = AV11Fec2 ;
      GXv_dtime11[0] = AV26Hisprodti ;
      GXv_dtime12[0] = AV25Hisprodtf ;
      GXv_char2[0] = AV15File ;
      GXv_int6[0] = AV18hnd ;
      new app.pege101(remoteHandle, context).execute( GXv_char3, GXv_date9, GXv_date10, GXv_dtime11, GXv_dtime12, GXv_char2, GXv_int6) ;
      apege100.this.AV13EmprCod = GXv_char3[0] ;
      apege100.this.AV10Fec1 = GXv_date9[0] ;
      apege100.this.AV11Fec2 = GXv_date10[0] ;
      apege100.this.AV26Hisprodti = GXv_dtime11[0] ;
      apege100.this.AV25Hisprodtf = GXv_dtime12[0] ;
      apege100.this.AV15File = GXv_char2[0] ;
      apege100.this.AV18hnd = GXv_int6[0] ;
      GXv_char3[0] = AV13EmprCod ;
      GXv_date10[0] = AV10Fec1 ;
      GXv_date9[0] = AV11Fec2 ;
      GXv_dtime12[0] = AV26Hisprodti ;
      GXv_dtime11[0] = AV25Hisprodtf ;
      GXv_char2[0] = AV15File ;
      GXv_int6[0] = AV18hnd ;
      new app.pege102(remoteHandle, context).execute( GXv_char3, GXv_date10, GXv_date9, GXv_dtime12, GXv_dtime11, GXv_char2, GXv_int6) ;
      apege100.this.AV13EmprCod = GXv_char3[0] ;
      apege100.this.AV10Fec1 = GXv_date10[0] ;
      apege100.this.AV11Fec2 = GXv_date9[0] ;
      apege100.this.AV26Hisprodti = GXv_dtime12[0] ;
      apege100.this.AV25Hisprodtf = GXv_dtime11[0] ;
      apege100.this.AV15File = GXv_char2[0] ;
      apege100.this.AV18hnd = GXv_int6[0] ;
      GXv_char3[0] = AV13EmprCod ;
      GXv_date10[0] = AV10Fec1 ;
      GXv_date9[0] = AV11Fec2 ;
      GXv_dtime12[0] = AV26Hisprodti ;
      GXv_dtime11[0] = AV25Hisprodtf ;
      GXv_char2[0] = AV15File ;
      GXv_int6[0] = AV18hnd ;
      new app.pege103(remoteHandle, context).execute( GXv_char3, GXv_date10, GXv_date9, GXv_dtime12, GXv_dtime11, GXv_char2, GXv_int6) ;
      apege100.this.AV13EmprCod = GXv_char3[0] ;
      apege100.this.AV10Fec1 = GXv_date10[0] ;
      apege100.this.AV11Fec2 = GXv_date9[0] ;
      apege100.this.AV26Hisprodti = GXv_dtime12[0] ;
      apege100.this.AV25Hisprodtf = GXv_dtime11[0] ;
      apege100.this.AV15File = GXv_char2[0] ;
      apege100.this.AV18hnd = GXv_int6[0] ;
      GXt_int7 = AV19Stat ;
      GXv_int8[0] = GXt_int7 ;
      new app.core.fclose(remoteHandle, context).execute( AV18hnd, GXv_int8) ;
      apege100.this.GXt_int7 = GXv_int8[0] ;
      AV19Stat = GXt_int7 ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pege100.class);
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
      AV8UsurCod = "" ;
      AV9Station = "" ;
      AV13EmprCod = "" ;
      AV27EmprNom = "" ;
      AV21Hhmmss_i = "" ;
      AV20Hhmmss_f = "" ;
      AV23Horai = GXutil.resetTime( GXutil.nullDate() );
      AV22HoraF = GXutil.resetTime( GXutil.nullDate() );
      AV59ddmmaaaa = "" ;
      AV10Fec1 = GXutil.nullDate() ;
      GXv_char1 = new String[1] ;
      AV11Fec2 = GXutil.nullDate() ;
      AV24Fecha_hora = "" ;
      AV26Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV25Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV12Carpeta = "" ;
      GXt_char4 = "" ;
      AV14NomInf = "" ;
      AV15File = "" ;
      AV16Control = "" ;
      GXv_char3 = new String[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_dtime12 = new java.util.Date[1] ;
      GXv_dtime11 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new long[1] ;
      GXv_int8 = new byte[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19Stat ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private short Gx_err ;
   private long AV18hnd ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV13EmprCod ;
   private String AV27EmprNom ;
   private String AV21Hhmmss_i ;
   private String AV20Hhmmss_f ;
   private String AV59ddmmaaaa ;
   private String GXv_char1[] ;
   private String AV24Fecha_hora ;
   private String AV12Carpeta ;
   private String GXt_char4 ;
   private String AV14NomInf ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date AV23Horai ;
   private java.util.Date AV22HoraF ;
   private java.util.Date AV26Hisprodti ;
   private java.util.Date AV25Hisprodtf ;
   private java.util.Date GXv_dtime12[] ;
   private java.util.Date GXv_dtime11[] ;
   private java.util.Date AV10Fec1 ;
   private java.util.Date AV11Fec2 ;
   private java.util.Date GXv_date10[] ;
   private java.util.Date GXv_date9[] ;
   private boolean Cond_result ;
   private String AV15File ;
   private String AV16Control ;
}

