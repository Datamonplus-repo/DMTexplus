package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class arclacupt extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      arclacupt pgm = new arclacupt (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public arclacupt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( arclacupt.class ), "" );
   }

   public arclacupt( int remoteHandle ,
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
      GXv_char1[0] = AV8EmprCod ;
      GXv_int2[0] = AV9BarCod ;
      GXv_int3[0] = AV10BarCodReo ;
      GXv_char4[0] = AV11BarCodPar ;
      new app.rclacup(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
      arclacupt.this.AV8EmprCod = GXv_char1[0] ;
      arclacupt.this.AV9BarCod = GXv_int2[0] ;
      arclacupt.this.AV10BarCodReo = GXv_int3[0] ;
      arclacupt.this.AV11BarCodPar = GXv_char4[0] ;
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Ok", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(rclacupt.class);
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
      AV8EmprCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      AV11BarCodPar = "" ;
      GXv_char4 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10BarCodReo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int AV9BarCod ;
   private int GXv_int2[] ;
   private String AV8EmprCod ;
   private String GXv_char1[] ;
   private String AV11BarCodPar ;
   private String GXv_char4[] ;
}

