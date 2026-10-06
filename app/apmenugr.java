package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apmenugr extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apmenugr pgm = new apmenugr (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apmenugr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apmenugr.class ), "" );
   }

   public apmenugr( int remoteHandle ,
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
      GXv_char1[0] = httpContext.getMessage( "MPRINCIP", "") ;
      GXv_char2[0] = httpContext.getMessage( "MPRINCIP", "") ;
      GXv_int3[0] = (byte)(0) ;
      GXv_char4[0] = httpContext.getMessage( "ADMIN", "") ;
      new app.pshowmenu(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_char4) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pmenugr.class);
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
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXv_int3[] ;
   private short Gx_err ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
}

