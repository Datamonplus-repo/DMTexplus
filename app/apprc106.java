package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apprc106 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apprc106 pgm = new apprc106 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apprc106( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apprc106.class ), "" );
   }

   public apprc106( int remoteHandle ,
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
      AV10UsurCod = " " ;
      AV13Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV8EmprCod ;
      GXv_char2[0] = AV9EmprNom ;
      GXv_char3[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char1, GXv_char2, GXv_char3) ;
      apprc106.this.AV8EmprCod = GXv_char1[0] ;
      apprc106.this.AV9EmprNom = GXv_char2[0] ;
      apprc106.this.AV10UsurCod = GXv_char3[0] ;
      AV11Maquina1 = httpContext.getMessage( "TI01MC", "") ;
      AV12Maquina2 = httpContext.getMessage( "TI29TH", "") ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pprc106.class);
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
      AV10UsurCod = "" ;
      AV13Station = "" ;
      AV8EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV9EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV11Maquina1 = "" ;
      AV12Maquina2 = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV10UsurCod ;
   private String AV13Station ;
   private String AV8EmprCod ;
   private String GXv_char1[] ;
   private String AV9EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV11Maquina1 ;
   private String AV12Maquina2 ;
}

