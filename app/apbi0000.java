package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apbi0000 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apbi0000 pgm = new apbi0000 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apbi0000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apbi0000.class ), "" );
   }

   public apbi0000( int remoteHandle ,
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
      GXv_char1[0] = AV11EmprCod ;
      GXv_char2[0] = AV12EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      apbi0000.this.AV11EmprCod = GXv_char1[0] ;
      apbi0000.this.AV12EmprNom = GXv_char2[0] ;
      apbi0000.this.AV8UsurCod = GXv_char3[0] ;
      AV10Inc_obs = httpContext.getMessage( "Indicador OTIF,Inicio", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV11EmprCod, AV15Pgmname, AV8UsurCod, AV9Station, AV10Inc_obs, 11111111, (byte)(0), "") ;
      new app.potifhistorico(remoteHandle, context).execute( ) ;
      new app.potif003(remoteHandle, context).execute( ) ;
      AV10Inc_obs = httpContext.getMessage( "Indicador OTIF,Fin", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV11EmprCod, AV15Pgmname, AV8UsurCod, AV9Station, AV10Inc_obs, 11111111, (byte)(0), "") ;
      AV10Inc_obs = httpContext.getMessage( "Indicador Muestras Cliente,Inicio", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV11EmprCod, AV15Pgmname, AV8UsurCod, AV9Station, AV10Inc_obs, 11111111, (byte)(0), "") ;
      new app.pefclimtas(remoteHandle, context).execute( ) ;
      AV10Inc_obs = httpContext.getMessage( "Indicador Muestras Cliente,Fin", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV11EmprCod, AV15Pgmname, AV8UsurCod, AV9Station, AV10Inc_obs, 11111111, (byte)(0), "") ;
      AV10Inc_obs = httpContext.getMessage( "Indicador Tabla TIAES,Inicio", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV11EmprCod, AV15Pgmname, AV8UsurCod, AV9Station, AV10Inc_obs, 11111111, (byte)(0), "") ;
      new app.ptiaes(remoteHandle, context).execute( ) ;
      AV10Inc_obs = httpContext.getMessage( "Indicador Tabla TIAES,Fin", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV11EmprCod, AV15Pgmname, AV8UsurCod, AV9Station, AV10Inc_obs, 11111111, (byte)(0), "") ;
      AV10Inc_obs = httpContext.getMessage( "Indicador MPS,Inicio", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV11EmprCod, AV15Pgmname, AV8UsurCod, AV9Station, AV10Inc_obs, 11111111, (byte)(0), "") ;
      new app.pmps003(remoteHandle, context).execute( ) ;
      AV10Inc_obs = httpContext.getMessage( "Indicador MPS,Fin", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV11EmprCod, AV15Pgmname, AV8UsurCod, AV9Station, AV10Inc_obs, 11111111, (byte)(0), "") ;
      AV10Inc_obs = httpContext.getMessage( "Indicador Entrada TELA,Inicio", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV11EmprCod, AV15Pgmname, AV8UsurCod, AV9Station, AV10Inc_obs, 11111111, (byte)(0), "") ;
      new app.penttela(remoteHandle, context).execute( ) ;
      AV10Inc_obs = httpContext.getMessage( "Indicador Entrada TELA,Fin", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV11EmprCod, AV15Pgmname, AV8UsurCod, AV9Station, AV10Inc_obs, 11111111, (byte)(0), "") ;
      AV10Inc_obs = httpContext.getMessage( "Indicador Ege,Inicio", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV11EmprCod, AV15Pgmname, AV8UsurCod, AV9Station, AV10Inc_obs, 11111111, (byte)(0), "") ;
      new app.pege100(remoteHandle, context).execute( ) ;
      AV10Inc_obs = httpContext.getMessage( "Indicador Ege,Fin", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV11EmprCod, AV15Pgmname, AV8UsurCod, AV9Station, AV10Inc_obs, 11111111, (byte)(0), "") ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pbi0000.class);
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
      AV11EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV12EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV10Inc_obs = "" ;
      AV15Pgmname = "" ;
      AV15Pgmname = "APBI0000" ;
      /* GeneXus formulas. */
      AV15Pgmname = "APBI0000" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV11EmprCod ;
   private String GXv_char1[] ;
   private String AV12EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV15Pgmname ;
   private String AV10Inc_obs ;
}

