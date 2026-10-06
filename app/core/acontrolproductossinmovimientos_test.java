package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class acontrolproductossinmovimientos_test extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      acontrolproductossinmovimientos_test pgm = new acontrolproductossinmovimientos_test (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public acontrolproductossinmovimientos_test( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( acontrolproductossinmovimientos_test.class ), "" );
   }

   public acontrolproductossinmovimientos_test( int remoteHandle ,
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
      GXt_objcol_SdtControlProductossinMovimientos_SDT1 = AV8ControlProductossinMovimientosCollection ;
      GXv_objcol_SdtControlProductossinMovimientos_SDT2[0] = GXt_objcol_SdtControlProductossinMovimientos_SDT1 ;
      new app.controlproductossinmovimientos_dp(remoteHandle, context).execute( "001", "100000", "999999", 0, 999999, (short)(500), GXv_objcol_SdtControlProductossinMovimientos_SDT2) ;
      GXt_objcol_SdtControlProductossinMovimientos_SDT1 = GXv_objcol_SdtControlProductossinMovimientos_SDT2[0] ;
      AV8ControlProductossinMovimientosCollection = GXt_objcol_SdtControlProductossinMovimientos_SDT1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV8ControlProductossinMovimientosCollection.toxml(false, true, "ControlProductossinMovimientos_SDTCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(controlproductossinmovimientos_test.class);
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
      AV8ControlProductossinMovimientosCollection = new GXBaseCollection<app.SdtControlProductossinMovimientos_SDT>(app.SdtControlProductossinMovimientos_SDT.class, "ControlProductossinMovimientos_SDT", "TexplusNET", remoteHandle);
      GXt_objcol_SdtControlProductossinMovimientos_SDT1 = new GXBaseCollection<app.SdtControlProductossinMovimientos_SDT>(app.SdtControlProductossinMovimientos_SDT.class, "ControlProductossinMovimientos_SDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtControlProductossinMovimientos_SDT2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private GXBaseCollection<app.SdtControlProductossinMovimientos_SDT> AV8ControlProductossinMovimientosCollection ;
   private GXBaseCollection<app.SdtControlProductossinMovimientos_SDT> GXt_objcol_SdtControlProductossinMovimientos_SDT1 ;
   private GXBaseCollection<app.SdtControlProductossinMovimientos_SDT> GXv_objcol_SdtControlProductossinMovimientos_SDT2[] ;
}

