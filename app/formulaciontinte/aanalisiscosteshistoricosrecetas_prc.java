package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aanalisiscosteshistoricosrecetas_prc extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aanalisiscosteshistoricosrecetas_prc pgm = new aanalisiscosteshistoricosrecetas_prc (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aanalisiscosteshistoricosrecetas_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aanalisiscosteshistoricosrecetas_prc.class ), "" );
   }

   public aanalisiscosteshistoricosrecetas_prc( int remoteHandle ,
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
      AV20Emprcod = "001" ;
      AV10barcod = 662457 ;
      AV12barcodreo = (byte)(0) ;
      AV11barcodpar = " " ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV33AnalisisCostesHistoricosRecetasCollection.toxml(false, true, "FormulacionTinte.AnalisisCostesHistoricosRecetas_SDTCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(analisiscosteshistoricosrecetas_prc.class);
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
      AV20Emprcod = "" ;
      AV11barcodpar = "" ;
      AV33AnalisisCostesHistoricosRecetasCollection = new GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT>(app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT.class, "AnalisisCostesHistoricosRecetas_SDT", "TexplusNET", remoteHandle);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12barcodreo ;
   private short Gx_err ;
   private int AV10barcod ;
   private String AV20Emprcod ;
   private String AV11barcodpar ;
   private GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT> AV33AnalisisCostesHistoricosRecetasCollection ;
}

