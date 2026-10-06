package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class appbarest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      appbarest pgm = new appbarest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public appbarest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( appbarest.class ), "" );
   }

   public appbarest( int remoteHandle ,
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
      AV8Emprcod = "001" ;
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV8Emprcod ;
      GXv_char2[0] = AV11Emprnom ;
      GXv_char3[0] = AV10Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      appbarest.this.AV8Emprcod = GXv_char1[0] ;
      appbarest.this.AV11Emprnom = GXv_char2[0] ;
      appbarest.this.AV10Usurcod = GXv_char3[0] ;
      GXv_char3[0] = AV8Emprcod ;
      new app.pbarest2(remoteHandle, context).execute( GXv_char3) ;
      appbarest.this.AV8Emprcod = GXv_char3[0] ;
      GXv_char3[0] = AV8Emprcod ;
      GXv_char2[0] = AV10Usurcod ;
      GXv_char1[0] = AV9Station ;
      new app.pbarest0(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      appbarest.this.AV8Emprcod = GXv_char3[0] ;
      appbarest.this.AV10Usurcod = GXv_char2[0] ;
      appbarest.this.AV9Station = GXv_char1[0] ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ppbarest.class);
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
      AV8Emprcod = "" ;
      AV9Station = "" ;
      AV11Emprnom = "" ;
      AV10Usurcod = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8Emprcod ;
   private String AV9Station ;
   private String AV11Emprnom ;
   private String AV10Usurcod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
}

