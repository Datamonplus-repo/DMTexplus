package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class atiempomedioentrega_lab_test extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      atiempomedioentrega_lab_test pgm = new atiempomedioentrega_lab_test (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public atiempomedioentrega_lab_test( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( atiempomedioentrega_lab_test.class ), "" );
   }

   public atiempomedioentrega_lab_test( int remoteHandle ,
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
      AV10Lb_FechaE = localUtil.ctod( "29/11/2021", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV11Lb_FechaE_to = GXutil.serverDate( context, remoteHandle, pr_default) ;
      AV12Lb_FechaEninout = GXutil.nullDate() ;
      AV13Lb_FechaEninout_to = GXutil.serverDate( context, remoteHandle, pr_default) ;
      GXt_objcol_SdtTiempoMedioEntrega_LAB1 = AV8TiempoMedioEntrega_LAB ;
      GXv_objcol_SdtTiempoMedioEntrega_LAB2[0] = GXt_objcol_SdtTiempoMedioEntrega_LAB1 ;
      new app.gestionlaboratorio.tiempomedioentrega_lab_dp(remoteHandle, context).execute( "001", 27, 27, "", httpContext.getMessage( "zzzzzzzzzzzzzzzz", ""), "", httpContext.getMessage( "zzzzzzzzzzzzzzzzzzzz", ""), AV10Lb_FechaE, AV11Lb_FechaE_to, AV12Lb_FechaEninout, AV13Lb_FechaEninout_to, GXv_objcol_SdtTiempoMedioEntrega_LAB2) ;
      GXt_objcol_SdtTiempoMedioEntrega_LAB1 = GXv_objcol_SdtTiempoMedioEntrega_LAB2[0] ;
      AV8TiempoMedioEntrega_LAB = GXt_objcol_SdtTiempoMedioEntrega_LAB1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV8TiempoMedioEntrega_LAB.toxml(false, true, "GestionLaboratorio.TiempoMedioEntrega_LABCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(tiempomedioentrega_lab_test.class);
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
      AV10Lb_FechaE = GXutil.nullDate() ;
      AV11Lb_FechaE_to = GXutil.nullDate() ;
      AV12Lb_FechaEninout = GXutil.nullDate() ;
      AV13Lb_FechaEninout_to = GXutil.nullDate() ;
      AV8TiempoMedioEntrega_LAB = new GXBaseCollection<app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB>(app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB.class, "TiempoMedioEntrega_LAB", "TexplusNET", remoteHandle);
      GXt_objcol_SdtTiempoMedioEntrega_LAB1 = new GXBaseCollection<app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB>(app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB.class, "TiempoMedioEntrega_LAB", "TexplusNET", remoteHandle);
      GXv_objcol_SdtTiempoMedioEntrega_LAB2 = new GXBaseCollection[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.atiempomedioentrega_lab_test__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV10Lb_FechaE ;
   private java.util.Date AV11Lb_FechaE_to ;
   private java.util.Date AV12Lb_FechaEninout ;
   private java.util.Date AV13Lb_FechaEninout_to ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB> AV8TiempoMedioEntrega_LAB ;
   private GXBaseCollection<app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB> GXt_objcol_SdtTiempoMedioEntrega_LAB1 ;
   private GXBaseCollection<app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB> GXv_objcol_SdtTiempoMedioEntrega_LAB2[] ;
}

final  class atiempomedioentrega_lab_test__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

