package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class adpincidenciastest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      adpincidenciastest pgm = new adpincidenciastest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public adpincidenciastest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( adpincidenciastest.class ), "" );
   }

   public adpincidenciastest( int remoteHandle ,
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
      AV10Inc_diaFin = GXutil.resetTime(GXutil.now( )) ;
      AV9Inc_diaInicio = GXutil.dadd( AV10Inc_diaFin, (-5)) ;
      GXt_objcol_SdtSDTIncidencias1 = AV8SdtIncidenciasCollection ;
      GXv_objcol_SdtSDTIncidencias2[0] = GXt_objcol_SdtSDTIncidencias1 ;
      new app.dpincidencias(remoteHandle, context).execute( "001", AV9Inc_diaInicio, AV10Inc_diaFin, " ", 0, (byte)(0), " ", GXv_objcol_SdtSDTIncidencias2) ;
      GXt_objcol_SdtSDTIncidencias1 = GXv_objcol_SdtSDTIncidencias2[0] ;
      AV8SdtIncidenciasCollection = GXt_objcol_SdtSDTIncidencias1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV8SdtIncidenciasCollection.toxml(false, true, "SDTIncidenciasCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dpincidenciastest.class);
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
      AV10Inc_diaFin = GXutil.nullDate() ;
      AV9Inc_diaInicio = GXutil.nullDate() ;
      AV8SdtIncidenciasCollection = new GXBaseCollection<app.SdtSDTIncidencias>(app.SdtSDTIncidencias.class, "SDTIncidencias", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTIncidencias1 = new GXBaseCollection<app.SdtSDTIncidencias>(app.SdtSDTIncidencias.class, "SDTIncidencias", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTIncidencias2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV10Inc_diaFin ;
   private java.util.Date AV9Inc_diaInicio ;
   private GXBaseCollection<app.SdtSDTIncidencias> AV8SdtIncidenciasCollection ;
   private GXBaseCollection<app.SdtSDTIncidencias> GXt_objcol_SdtSDTIncidencias1 ;
   private GXBaseCollection<app.SdtSDTIncidencias> GXv_objcol_SdtSDTIncidencias2[] ;
}

