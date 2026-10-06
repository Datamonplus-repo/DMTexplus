package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class adphdrsareoperartest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      adphdrsareoperartest pgm = new adphdrsareoperartest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public adphdrsareoperartest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( adphdrsareoperartest.class ), "" );
   }

   public adphdrsareoperartest( int remoteHandle ,
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
      AV12BarFecGen_To = GXutil.today( ) ;
      AV9BarFecGen = GXutil.dadd( AV12BarFecGen_To, (-7)) ;
      AV10BarNHdr = " " ;
      AV11CliNom = " " ;
      GXt_objcol_SdtSDTHdrsaReoperar1 = AV8sdtHdrsaReoperarCollection ;
      GXv_objcol_SdtSDTHdrsaReoperar2[0] = GXt_objcol_SdtSDTHdrsaReoperar1 ;
      new app.dphdrsareoperar(remoteHandle, context).execute( "001", AV9BarFecGen, AV12BarFecGen_To, AV10BarNHdr, AV11CliNom, GXv_objcol_SdtSDTHdrsaReoperar2) ;
      GXt_objcol_SdtSDTHdrsaReoperar1 = GXv_objcol_SdtSDTHdrsaReoperar2[0] ;
      AV8sdtHdrsaReoperarCollection = GXt_objcol_SdtSDTHdrsaReoperar1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV8sdtHdrsaReoperarCollection.toxml(false, true, "SDTHdrsaReoperarCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dphdrsareoperartest.class);
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
      AV12BarFecGen_To = GXutil.nullDate() ;
      AV9BarFecGen = GXutil.nullDate() ;
      AV10BarNHdr = "" ;
      AV11CliNom = "" ;
      AV8sdtHdrsaReoperarCollection = new GXBaseCollection<app.SdtSDTHdrsaReoperar>(app.SdtSDTHdrsaReoperar.class, "SDTHdrsaReoperar", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTHdrsaReoperar1 = new GXBaseCollection<app.SdtSDTHdrsaReoperar>(app.SdtSDTHdrsaReoperar.class, "SDTHdrsaReoperar", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTHdrsaReoperar2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV10BarNHdr ;
   private String AV11CliNom ;
   private java.util.Date AV12BarFecGen_To ;
   private java.util.Date AV9BarFecGen ;
   private GXBaseCollection<app.SdtSDTHdrsaReoperar> AV8sdtHdrsaReoperarCollection ;
   private GXBaseCollection<app.SdtSDTHdrsaReoperar> GXt_objcol_SdtSDTHdrsaReoperar1 ;
   private GXBaseCollection<app.SdtSDTHdrsaReoperar> GXv_objcol_SdtSDTHdrsaReoperar2[] ;
}

