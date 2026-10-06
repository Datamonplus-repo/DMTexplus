package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apptt000 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apptt000 pgm = new apptt000 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apptt000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apptt000.class ), "" );
   }

   public apptt000( int remoteHandle ,
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
      AV21UsurCod = " " ;
      AV22Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV23EmprCod ;
      GXv_char2[0] = AV24EmprNom ;
      GXv_char3[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char1, GXv_char2, GXv_char3) ;
      apptt000.this.AV23EmprCod = GXv_char1[0] ;
      apptt000.this.AV24EmprNom = GXv_char2[0] ;
      apptt000.this.AV21UsurCod = GXv_char3[0] ;
      AV19FecA = "01" + "/" + "01" + "/" + GXutil.str( GXutil.year( Gx_date), 4, 0) ;
      AV17Fec1 = localUtil.ctod( AV19FecA, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV18Fec2 = GXutil.today( ) ;
      AV17Fec1 = GXutil.dadd(GXutil.today( ),-(120)) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV20Tab_mq[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      AV28Op = "1" ;
      GXv_char3[0] = AV23EmprCod ;
      GXv_date4[0] = AV17Fec1 ;
      GXv_date5[0] = AV18Fec2 ;
      new app.pptt001(remoteHandle, context).execute( GXv_char3, GXv_date4, GXv_date5, AV20Tab_mq) ;
      apptt000.this.AV23EmprCod = GXv_char3[0] ;
      apptt000.this.AV17Fec1 = GXv_date4[0] ;
      apptt000.this.AV18Fec2 = GXv_date5[0] ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pptt000.class);
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
      AV21UsurCod = "" ;
      AV22Station = "" ;
      AV23EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV24EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV19FecA = "" ;
      Gx_date = GXutil.nullDate() ;
      AV17Fec1 = GXutil.nullDate() ;
      AV18Fec2 = GXutil.nullDate() ;
      AV20Tab_mq = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV20Tab_mq[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV28Op = "" ;
      GXv_char3 = new String[1] ;
      GXv_date4 = new java.util.Date[1] ;
      GXv_date5 = new java.util.Date[1] ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GX_I ;
   private String AV21UsurCod ;
   private String AV22Station ;
   private String AV23EmprCod ;
   private String GXv_char1[] ;
   private String AV24EmprNom ;
   private String GXv_char2[] ;
   private String AV19FecA ;
   private String AV20Tab_mq[] ;
   private String AV28Op ;
   private String GXv_char3[] ;
   private java.util.Date Gx_date ;
   private java.util.Date AV17Fec1 ;
   private java.util.Date AV18Fec2 ;
   private java.util.Date GXv_date4[] ;
   private java.util.Date GXv_date5[] ;
}

