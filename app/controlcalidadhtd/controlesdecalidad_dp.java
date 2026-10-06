package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlesdecalidad_dp extends GXProcedure
{
   public controlesdecalidad_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlesdecalidad_dp.class ), "" );
   }

   public controlesdecalidad_dp( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item> executeUdp( String aP0 )
   {
      controlesdecalidad_dp.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item>[] aP1 )
   {
      controlesdecalidad_dp.this.A396EmprCod = aP0;
      controlesdecalidad_dp.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P004T2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4036CCTDsc = P004T2_A4036CCTDsc[0] ;
         A4031CCTCod = P004T2_A4031CCTCod[0] ;
         Gxm1controlesdecalidad_sdt = (app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)new app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1controlesdecalidad_sdt, 0);
         Gxm1controlesdecalidad_sdt.setgxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar( false );
         Gxm1controlesdecalidad_sdt.setgxTv_SdtControlesdeCalidad_SDT_Item_Cctcod( A4031CCTCod );
         Gxm1controlesdecalidad_sdt.setgxTv_SdtControlesdeCalidad_SDT_Item_Cctdsc( A4036CCTDsc );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = controlesdecalidad_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item>(app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P004T2_A396EmprCod = new String[] {""} ;
      P004T2_A4036CCTDsc = new String[] {""} ;
      P004T2_A4031CCTCod = new int[1] ;
      A4036CCTDsc = "" ;
      Gxm1controlesdecalidad_sdt = new app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlesdecalidad_dp__default(),
         new Object[] {
             new Object[] {
            P004T2_A396EmprCod, P004T2_A4036CCTDsc, P004T2_A4031CCTCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A4031CCTCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A4036CCTDsc ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P004T2_A396EmprCod ;
   private String[] P004T2_A4036CCTDsc ;
   private int[] P004T2_A4031CCTCod ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item> Gxm2rootcol ;
   private app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item Gxm1controlesdecalidad_sdt ;
}

final  class controlesdecalidad_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004T2", "SELECT EmprCod, CCTDsc, CCTCod FROM TXPCCDef WHERE EmprCod = ? ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

