package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class adpinformecomprasmestest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      adpinformecomprasmestest pgm = new adpinformecomprasmestest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public adpinformecomprasmestest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( adpinformecomprasmestest.class ), "" );
   }

   public adpinformecomprasmestest( int remoteHandle ,
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
      GXt_objcol_SdtSDTInformeComprasMes1 = AV14sdtInformesComprasMesCollection ;
      GXv_objcol_SdtSDTInformeComprasMes2[0] = GXt_objcol_SdtSDTInformeComprasMes1 ;
      new app.dpinformecomprasmes(remoteHandle, context).execute( "001", " ", "999999", 0, 999999, (short)(2021), GXv_objcol_SdtSDTInformeComprasMes2) ;
      GXt_objcol_SdtSDTInformeComprasMes1 = GXv_objcol_SdtSDTInformeComprasMes2[0] ;
      AV14sdtInformesComprasMesCollection = GXt_objcol_SdtSDTInformeComprasMes1 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV14sdtInformesComprasMesCollection.toxml(false, true, "SDTInformeComprasMesCollection", "TexplusNET")) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dpinformecomprasmestest.class);
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
      AV14sdtInformesComprasMesCollection = new GXBaseCollection<app.SdtSDTInformeComprasMes>(app.SdtSDTInformeComprasMes.class, "SDTInformeComprasMes", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTInformeComprasMes1 = new GXBaseCollection<app.SdtSDTInformeComprasMes>(app.SdtSDTInformeComprasMes.class, "SDTInformeComprasMes", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTInformeComprasMes2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private GXBaseCollection<app.SdtSDTInformeComprasMes> AV14sdtInformesComprasMesCollection ;
   private GXBaseCollection<app.SdtSDTInformeComprasMes> GXt_objcol_SdtSDTInformeComprasMes1 ;
   private GXBaseCollection<app.SdtSDTInformeComprasMes> GXv_objcol_SdtSDTInformeComprasMes2[] ;
}

