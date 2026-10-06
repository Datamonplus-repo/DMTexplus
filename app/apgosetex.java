package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apgosetex extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apgosetex pgm = new apgosetex (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apgosetex( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apgosetex.class ), "" );
   }

   public apgosetex( int remoteHandle ,
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
      AV8Comm = httpContext.getMessage( "enlace/OS:", "") ;
      AV8Comm += GXutil.trim( GXutil.str( AV9Barcod, 8, 0)) + "," ;
      AV8Comm += GXutil.str( AV10Barcodreo, 1, 0) + "," ;
      AV8Comm += AV11Barcodpar ;
      httpContext.GX_msglist.addItem(AV8Comm);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pgosetex.class);
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
      AV8Comm = "" ;
      AV11Barcodpar = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Barcodreo ;
   private short Gx_err ;
   private int AV9Barcod ;
   private String AV8Comm ;
   private String AV11Barcodpar ;
}

