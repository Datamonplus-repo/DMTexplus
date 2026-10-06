package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apperpprod extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apperpprod pgm = new apperpprod (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apperpprod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apperpprod.class ), "" );
   }

   public apperpprod( int remoteHandle ,
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
      AV8Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV9EmprCod ;
      GXv_char2[0] = AV10EmprNom ;
      GXv_char3[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char1, GXv_char2, GXv_char3) ;
      apperpprod.this.AV9EmprCod = GXv_char1[0] ;
      apperpprod.this.AV10EmprNom = GXv_char2[0] ;
      apperpprod.this.AV11UsurCod = GXv_char3[0] ;
      AV12Fec2 = GXutil.today( ) ;
      System.out.println( httpContext.getMessage( "Elimino HDR en tabla ERPROD, Situacion=9", "") );
      GXv_char3[0] = AV9EmprCod ;
      GXv_date4[0] = AV13Fec1 ;
      GXv_date5[0] = AV12Fec2 ;
      GXv_char2[0] = AV11UsurCod ;
      GXv_char1[0] = AV8Station ;
      new app.per0006(remoteHandle, context).execute( GXv_char3, GXv_date4, GXv_date5, GXv_char2, GXv_char1) ;
      apperpprod.this.AV9EmprCod = GXv_char3[0] ;
      apperpprod.this.AV13Fec1 = GXv_date4[0] ;
      apperpprod.this.AV12Fec2 = GXv_date5[0] ;
      apperpprod.this.AV11UsurCod = GXv_char2[0] ;
      apperpprod.this.AV8Station = GXv_char1[0] ;
      System.out.println( httpContext.getMessage( "Creo tabla ERPROD, Situacion=9", "") );
      GXv_char3[0] = AV9EmprCod ;
      GXv_date5[0] = AV13Fec1 ;
      GXv_date4[0] = AV12Fec2 ;
      new app.per0005(remoteHandle, context).execute( GXv_char3, GXv_date5, GXv_date4) ;
      apperpprod.this.AV9EmprCod = GXv_char3[0] ;
      apperpprod.this.AV13Fec1 = GXv_date5[0] ;
      apperpprod.this.AV12Fec2 = GXv_date4[0] ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pperpprod.class);
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
      AV8Station = "" ;
      AV9EmprCod = "" ;
      AV10EmprNom = "" ;
      AV11UsurCod = "" ;
      AV12Fec2 = GXutil.nullDate() ;
      AV13Fec1 = GXutil.nullDate() ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_date5 = new java.util.Date[1] ;
      GXv_date4 = new java.util.Date[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8Station ;
   private String AV9EmprCod ;
   private String AV10EmprNom ;
   private String AV11UsurCod ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private java.util.Date AV12Fec2 ;
   private java.util.Date AV13Fec1 ;
   private java.util.Date GXv_date5[] ;
   private java.util.Date GXv_date4[] ;
}

