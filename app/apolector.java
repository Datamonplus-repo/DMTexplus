package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apolector extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apolector pgm = new apolector (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apolector( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apolector.class ), "" );
   }

   public apolector( int remoteHandle ,
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
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV10EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      apolector.this.AV10EmprCod = GXv_char1[0] ;
      apolector.this.AV11EmprNom = GXv_char2[0] ;
      apolector.this.AV12UsurCod = GXv_char3[0] ;
      GXv_int4[0] = AV8FlagEmpr ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "LECEMP", ""), GXv_int4) ;
      apolector.this.AV8FlagEmpr = GXv_int4[0] ;
      GXv_int4[0] = AV14FlagHil ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "HILO  ", ""), GXv_int4) ;
      apolector.this.AV14FlagHil = GXv_int4[0] ;
      GXv_int4[0] = AV15LecNBon ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "LECNBO", ""), GXv_int4) ;
      apolector.this.AV15LecNBon = GXv_int4[0] ;
      GXv_int4[0] = AV16JBP ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "JBURGO", ""), GXv_int4) ;
      apolector.this.AV16JBP = GXv_int4[0] ;
      GXv_int4[0] = AV19Lavanderia ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "LAVAND", ""), GXv_int4) ;
      apolector.this.AV19Lavanderia = GXv_int4[0] ;
      GXv_char3[0] = AV20ContDsc2 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "VERSEM", ""), GXv_char3) ;
      apolector.this.AV20ContDsc2 = GXv_char3[0] ;
      AV21Version = GXutil.substring( AV20ContDsc2, 1, 20) ;
      AV22TextoVers = httpContext.getMessage( "TEXPLUS ", "") + GXutil.trim( AV21Version) ;
      if ( AV16JBP == 1 )
      {
         while ( 1 > 0 )
         {
            if ( GXutil.strcmp(AV17Sal, httpContext.getMessage( "S", "")) == 0 )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
      }
      if ( AV8FlagEmpr == 1 )
      {
      }
      else
      {
         if ( AV15LecNBon == 1 )
         {
         }
         else
         {
            if ( AV19Lavanderia == 1 )
            {
            }
            else
            {
            }
         }
      }
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(polector.class);
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
      AV9Station = "" ;
      AV10EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV12UsurCod = "" ;
      GXv_int4 = new byte[1] ;
      AV20ContDsc2 = "" ;
      GXv_char3 = new String[1] ;
      AV21Version = "" ;
      AV22TextoVers = "" ;
      AV17Sal = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8FlagEmpr ;
   private byte AV14FlagHil ;
   private byte AV15LecNBon ;
   private byte AV16JBP ;
   private byte AV19Lavanderia ;
   private byte GXv_int4[] ;
   private short Gx_err ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String AV12UsurCod ;
   private String AV20ContDsc2 ;
   private String GXv_char3[] ;
   private String AV21Version ;
   private String AV22TextoVers ;
   private String AV17Sal ;
   private boolean returnInSub ;
}

