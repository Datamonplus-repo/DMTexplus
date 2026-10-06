package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class adpdefectostest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      adpdefectostest pgm = new adpdefectostest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public adpdefectostest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( adpdefectostest.class ), "" );
   }

   public adpdefectostest( int remoteHandle ,
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
      AV10Emprcod = "001" ;
      AV13HisEstReo = (byte)(1) ;
      AV9ClicodIni = 0 ;
      AV11FechaFin = GXutil.resetTime(GXutil.now( )) ;
      AV12FechaIni = GXutil.addmth( AV11FechaFin, (short)(-3)) ;
      GXt_objcol_SdtSDTDefectos1 = AV14sdtDefectosCollection ;
      GXv_objcol_SdtSDTDefectos2[0] = GXt_objcol_SdtSDTDefectos1 ;
      new app.dpdefectos(remoteHandle, context).execute( AV10Emprcod, AV12FechaIni, AV11FechaFin, AV9ClicodIni, 999999, AV13HisEstReo, GXv_objcol_SdtSDTDefectos2) ;
      GXt_objcol_SdtSDTDefectos1 = GXv_objcol_SdtSDTDefectos2[0] ;
      AV14sdtDefectosCollection = GXt_objcol_SdtSDTDefectos1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV14sdtDefectosCollection.toxml(false, true, "SDTDefectosCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dpdefectostest.class);
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
      AV10Emprcod = "" ;
      AV11FechaFin = GXutil.nullDate() ;
      AV12FechaIni = GXutil.nullDate() ;
      AV14sdtDefectosCollection = new GXBaseCollection<app.SdtSDTDefectos>(app.SdtSDTDefectos.class, "SDTDefectos", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTDefectos1 = new GXBaseCollection<app.SdtSDTDefectos>(app.SdtSDTDefectos.class, "SDTDefectos", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTDefectos2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13HisEstReo ;
   private short Gx_err ;
   private int AV9ClicodIni ;
   private String AV10Emprcod ;
   private java.util.Date AV11FechaFin ;
   private java.util.Date AV12FechaIni ;
   private GXBaseCollection<app.SdtSDTDefectos> AV14sdtDefectosCollection ;
   private GXBaseCollection<app.SdtSDTDefectos> GXt_objcol_SdtSDTDefectos1 ;
   private GXBaseCollection<app.SdtSDTDefectos> GXv_objcol_SdtSDTDefectos2[] ;
}

