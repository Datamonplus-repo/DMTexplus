package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dp_cctarc extends GXProcedure
{
   public dp_cctarc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dp_cctarc.class ), "" );
   }

   public dp_cctarc( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem> executeUdp( )
   {
      dp_cctarc.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem>[] aP0 )
   {
      dp_cctarc.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P004W2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4041CCTArc = P004W2_A4041CCTArc[0] ;
         A396EmprCod = P004W2_A396EmprCod[0] ;
         A4031CCTCod = P004W2_A4031CCTCod[0] ;
         Gxm1sdt_cctarc_seleccionaarchivo = (app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem)new app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdt_cctarc_seleccionaarchivo, 0);
         Gxm1sdt_cctarc_seleccionaarchivo.setgxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Nomfile( A4041CCTArc );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = dp_cctarc.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem>(app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem.class, "SDT_CCtarc_SeleccionaArchivoItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P004W2_A4041CCTArc = new String[] {""} ;
      P004W2_A396EmprCod = new String[] {""} ;
      P004W2_A4031CCTCod = new int[1] ;
      A4041CCTArc = "" ;
      A396EmprCod = "" ;
      Gxm1sdt_cctarc_seleccionaarchivo = new app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.dp_cctarc__default(),
         new Object[] {
             new Object[] {
            P004W2_A4041CCTArc, P004W2_A396EmprCod, P004W2_A4031CCTCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A4031CCTCod ;
   private String scmdbuf ;
   private String A4041CCTArc ;
   private String A396EmprCod ;
   private GXBaseCollection<app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem>[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P004W2_A4041CCTArc ;
   private String[] P004W2_A396EmprCod ;
   private int[] P004W2_A4031CCTCod ;
   private GXBaseCollection<app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem> Gxm2rootcol ;
   private app.controlcalidadhtd.SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem Gxm1sdt_cctarc_seleccionaarchivo ;
}

final  class dp_cctarc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004W2", "SELECT CCTArc, EmprCod, CCTCod FROM TXPCCDef ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 128);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
      }
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

