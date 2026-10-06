package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptestetic extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptestetic pgm = new aptestetic (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptestetic( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptestetic.class ), "" );
   }

   public aptestetic( int remoteHandle ,
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
      GXv_char1[0] = "001" ;
      GXv_int2[0] = 500238 ;
      GXv_int3[0] = 700201 ;
      GXv_int4[0] = (byte)(0) ;
      GXv_char5[0] = " " ;
      GXv_int6[0] = (short)(2) ;
      new app.retiedo(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_int4, GXv_char5, GXv_int6) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptestetic.class);
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
      GXv_int2 = new long[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new short[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXv_int4[] ;
   private short GXv_int6[] ;
   private short Gx_err ;
   private int GXv_int3[] ;
   private long GXv_int2[] ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
}

