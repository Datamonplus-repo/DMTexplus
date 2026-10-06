package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class amant_init extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      amant_init pgm = new amant_init (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public amant_init( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( amant_init.class ), "" );
   }

   public amant_init( int remoteHandle ,
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
      httpContext.wjLoc = formatLink("app.tclient", new String[] {}, new String[] {"Mode","EmprCod","CliCod"})  ;
      callWebObject(formatLink("app.tclientww", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.wjLoc = formatLink("app.tarticu", new String[] {}, new String[] {"Mode","EmprCod","CliCod","ArtCod"})  ;
      callWebObject(formatLink("app.tarticuww", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.wjLoc = formatLink("app.tcformu", new String[] {}, new String[] {"CliCod_p","ForSer_p","ColNom","ColNum","TipCol","Mode"})  ;
      httpContext.wjLoc = formatLink("app.ficherosbasicos.ttipmaq", new String[] {}, new String[] {"Mode","EmprCod","TipMaqCod"})  ;
      callWebObject(formatLink("app.ficherosbasicos.ttipmaqww", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.wjLoc = formatLink("app.tmaquin", new String[] {}, new String[] {"Mode","EmprCod","MaqCod"})  ;
      callWebObject(formatLink("app.tmaquinww", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      callWebObject(formatLink("app.anticipacionerrores.mantww", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      callWebObject(formatLink("app.anticipacionerrores.mant_simular", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      GXv_objcol_SdtsdtMDef1[0] = new GXBaseCollection<app.anticipacionerrores.SdtsdtMDef>() ;
      new app.anticipacionerrores.mant_defecto_dp(remoteHandle, context).execute( "", 0, "", 0, new GXSimpleCollection<String>(String.class, "internal", ""), "", GXutil.nullDate(), GXutil.nullDate(), "", "", GXv_objcol_SdtsdtMDef1) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(mant_init.class);
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
      GXv_objcol_SdtsdtMDef1 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private GXBaseCollection<app.anticipacionerrores.SdtsdtMDef> GXv_objcol_SdtsdtMDef1[] ;
}

