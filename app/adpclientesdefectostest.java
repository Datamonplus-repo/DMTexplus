package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class adpclientesdefectostest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      adpclientesdefectostest pgm = new adpclientesdefectostest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public adpclientesdefectostest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( adpclientesdefectostest.class ), "" );
   }

   public adpclientesdefectostest( int remoteHandle ,
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
      AV8Emprcod = "001" ;
      AV9HisEstReo = (byte)(1) ;
      AV10ClicodIni = 0 ;
      AV11FechaFin = GXutil.resetTime(GXutil.now( )) ;
      AV12FechaIni = GXutil.addmth( AV11FechaFin, (short)(-3)) ;
      GXt_objcol_SdtSDTClientesDefectos1 = AV13sdtClientesDefectosCollection ;
      GXv_objcol_SdtSDTClientesDefectos2[0] = GXt_objcol_SdtSDTClientesDefectos1 ;
      new app.dpclientesdefectos(remoteHandle, context).execute( AV8Emprcod, AV12FechaIni, AV11FechaFin, AV10ClicodIni, 999999, AV9HisEstReo, GXv_objcol_SdtSDTClientesDefectos2) ;
      GXt_objcol_SdtSDTClientesDefectos1 = GXv_objcol_SdtSDTClientesDefectos2[0] ;
      AV13sdtClientesDefectosCollection = GXt_objcol_SdtSDTClientesDefectos1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV13sdtClientesDefectosCollection.toxml(false, true, "SDTClientesDefectosCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dpclientesdefectostest.class);
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
      AV8Emprcod = "" ;
      AV11FechaFin = GXutil.nullDate() ;
      AV12FechaIni = GXutil.nullDate() ;
      AV13sdtClientesDefectosCollection = new GXBaseCollection<app.SdtSDTClientesDefectos>(app.SdtSDTClientesDefectos.class, "SDTClientesDefectos", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTClientesDefectos1 = new GXBaseCollection<app.SdtSDTClientesDefectos>(app.SdtSDTClientesDefectos.class, "SDTClientesDefectos", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTClientesDefectos2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9HisEstReo ;
   private short Gx_err ;
   private int AV10ClicodIni ;
   private String AV8Emprcod ;
   private java.util.Date AV11FechaFin ;
   private java.util.Date AV12FechaIni ;
   private GXBaseCollection<app.SdtSDTClientesDefectos> AV13sdtClientesDefectosCollection ;
   private GXBaseCollection<app.SdtSDTClientesDefectos> GXt_objcol_SdtSDTClientesDefectos1 ;
   private GXBaseCollection<app.SdtSDTClientesDefectos> GXv_objcol_SdtSDTClientesDefectos2[] ;
}

