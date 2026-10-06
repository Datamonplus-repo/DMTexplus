package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apege000 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apege000 pgm = new apege000 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apege000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apege000.class ), "" );
   }

   public apege000( int remoteHandle ,
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
      apege000.this.AV13EmprCod = GXv_char1[0] ;
      apege000.this.AV27EmprNom = GXv_char2[0] ;
      apege000.this.AV8UsurCod = GXv_char3[0] ;
      AV21Hhmmss_i = "06:00:00" ;
      GXt_char4 = AV21Hhmmss_i ;
      GXv_char3[0] = AV13EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "HMSDTI", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pexicond(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      apege000.this.AV13EmprCod = GXv_char3[0] ;
      apege000.this.GXt_char4 = GXv_char1[0] ;
      AV21Hhmmss_i = GXt_char4 ;
      AV20Hhmmss_f = "05:59:00" ;
      GXt_char4 = AV20Hhmmss_f ;
      GXv_char3[0] = AV13EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "HMSDTF", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pexicond(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      apege000.this.AV13EmprCod = GXv_char3[0] ;
      apege000.this.GXt_char4 = GXv_char1[0] ;
      AV20Hhmmss_f = GXt_char4 ;
      AV23Horai = localUtil.ctot( AV21Hhmmss_i, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV22HoraF = localUtil.ctot( AV20Hhmmss_f, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      GXt_char4 = AV59ddmmaaaa ;
      GXv_char3[0] = AV13EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "EGEINI", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      apege000.this.AV13EmprCod = GXv_char3[0] ;
      apege000.this.GXt_char4 = GXv_char1[0] ;
      AV59ddmmaaaa = GXt_char4 ;
      AV10Fec1 = ((GXutil.strcmp("", AV59ddmmaaaa)==0) ? localUtil.ctod( "01/01/01", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) : localUtil.ctod( AV59ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      GXt_char4 = AV59ddmmaaaa ;
      GXv_char3[0] = AV13EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "EGEFIN", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      apege000.this.AV13EmprCod = GXv_char3[0] ;
      apege000.this.GXt_char4 = GXv_char1[0] ;
      AV59ddmmaaaa = GXt_char4 ;
      AV11Fec2 = ((GXutil.strcmp("", AV59ddmmaaaa)==0) ? GXutil.today( ) : localUtil.ctod( AV59ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      AV24Fecha_hora = localUtil.dtoc( AV10Fec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV23Horai, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV26Hisprodti = localUtil.ctot( AV24Fecha_hora, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV24Fecha_hora = localUtil.dtoc( AV11Fec2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV22HoraF, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV25Hisprodtf = localUtil.ctot( AV24Fecha_hora, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      GXv_char3[0] = AV13EmprCod ;
      GXv_date5[0] = AV10Fec1 ;
      GXv_date6[0] = AV11Fec2 ;
      GXv_dtime7[0] = AV26Hisprodti ;
      GXv_dtime8[0] = AV25Hisprodtf ;
      new app.pege001(remoteHandle, context).execute( GXv_char3, GXv_date5, GXv_date6, GXv_dtime7, GXv_dtime8) ;
      apege000.this.AV13EmprCod = GXv_char3[0] ;
      apege000.this.AV10Fec1 = GXv_date5[0] ;
      apege000.this.AV11Fec2 = GXv_date6[0] ;
      apege000.this.AV26Hisprodti = GXv_dtime7[0] ;
      apege000.this.AV25Hisprodtf = GXv_dtime8[0] ;
      GXv_char3[0] = AV13EmprCod ;
      GXv_date6[0] = AV10Fec1 ;
      GXv_date5[0] = AV11Fec2 ;
      GXv_dtime8[0] = AV26Hisprodti ;
      GXv_dtime7[0] = AV25Hisprodtf ;
      new app.pege002(remoteHandle, context).execute( GXv_char3, GXv_date6, GXv_date5, GXv_dtime8, GXv_dtime7) ;
      apege000.this.AV13EmprCod = GXv_char3[0] ;
      apege000.this.AV10Fec1 = GXv_date6[0] ;
      apege000.this.AV11Fec2 = GXv_date5[0] ;
      apege000.this.AV26Hisprodti = GXv_dtime8[0] ;
      apege000.this.AV25Hisprodtf = GXv_dtime7[0] ;
      GXv_char3[0] = AV13EmprCod ;
      GXv_date6[0] = AV10Fec1 ;
      GXv_date5[0] = AV11Fec2 ;
      GXv_dtime8[0] = AV26Hisprodti ;
      GXv_dtime7[0] = AV25Hisprodtf ;
      new app.pege003(remoteHandle, context).execute( GXv_char3, GXv_date6, GXv_date5, GXv_dtime8, GXv_dtime7) ;
      apege000.this.AV13EmprCod = GXv_char3[0] ;
      apege000.this.AV10Fec1 = GXv_date6[0] ;
      apege000.this.AV11Fec2 = GXv_date5[0] ;
      apege000.this.AV26Hisprodti = GXv_dtime8[0] ;
      apege000.this.AV25Hisprodtf = GXv_dtime7[0] ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pege000.class);
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
      GXt_char4 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      AV11Fec2 = GXutil.nullDate() ;
      AV24Fecha_hora = "" ;
      AV26Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV25Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      GXv_char3 = new String[1] ;
      GXv_date6 = new java.util.Date[1] ;
      GXv_date5 = new java.util.Date[1] ;
      GXv_dtime8 = new java.util.Date[1] ;
      GXv_dtime7 = new java.util.Date[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV13EmprCod ;
   private String AV27EmprNom ;
   private String AV21Hhmmss_i ;
   private String AV20Hhmmss_f ;
   private String AV59ddmmaaaa ;
   private String GXt_char4 ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String AV24Fecha_hora ;
   private String GXv_char3[] ;
   private java.util.Date AV23Horai ;
   private java.util.Date AV22HoraF ;
   private java.util.Date AV26Hisprodti ;
   private java.util.Date AV25Hisprodtf ;
   private java.util.Date GXv_dtime8[] ;
   private java.util.Date GXv_dtime7[] ;
   private java.util.Date AV10Fec1 ;
   private java.util.Date AV11Fec2 ;
   private java.util.Date GXv_date6[] ;
   private java.util.Date GXv_date5[] ;
}

