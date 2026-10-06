package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprocesloaddvcombo extends GXProcedure
{
   public tprocesloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprocesloaddvcombo.class ), "" );
   }

   public tprocesloaddvcombo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    String aP3 ,
                                                                                    String[] aP4 )
   {
      tprocesloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String[] aP4 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String[] aP4 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      tprocesloaddvcombo.this.AV12ComboName = aP0;
      tprocesloaddvcombo.this.AV13TrnMode = aP1;
      tprocesloaddvcombo.this.AV14EmprCod = aP2;
      tprocesloaddvcombo.this.AV15ProCod = aP3;
      tprocesloaddvcombo.this.aP4 = aP4;
      tprocesloaddvcombo.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      if ( GXutil.strcmp(AV12ComboName, "FasCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_FASCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADCOMBOITEMS_FASCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A3I2 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14042FasActiva = P0A3I2_A14042FasActiva[0] ;
         A396EmprCod = P0A3I2_A396EmprCod[0] ;
         A460FasDsc = P0A3I2_A460FasDsc[0] ;
         A457FasCod = P0A3I2_A457FasCod[0] ;
         A13781FasCDsc = GXutil.trim( A457FasCod) + "-" + GXutil.trim( A460FasDsc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A457FasCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13781FasCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P0A3I3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A14042FasActiva = P0A3I3_A14042FasActiva[0] ;
         A13781FasCDsc = P0A3I3_A13781FasCDsc[0] ;
         A457FasCod = P0A3I3_A457FasCod[0] ;
         A460FasDsc = P0A3I3_A460FasDsc[0] ;
         A396EmprCod = P0A3I3_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A457FasCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13781FasCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP4[0] = tprocesloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tprocesloaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P0A3I2_A14042FasActiva = new String[] {""} ;
      P0A3I2_A396EmprCod = new String[] {""} ;
      P0A3I2_A460FasDsc = new String[] {""} ;
      P0A3I2_A457FasCod = new String[] {""} ;
      A14042FasActiva = "" ;
      A396EmprCod = "" ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A13781FasCDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0A3I3_A14042FasActiva = new String[] {""} ;
      P0A3I3_A13781FasCDsc = new String[] {""} ;
      P0A3I3_A457FasCod = new String[] {""} ;
      P0A3I3_A460FasDsc = new String[] {""} ;
      P0A3I3_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tprocesloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A3I2_A14042FasActiva, P0A3I2_A396EmprCod, P0A3I2_A460FasDsc, P0A3I2_A457FasCod
            }
            , new Object[] {
            P0A3I3_A14042FasActiva, P0A3I3_A13781FasCDsc, P0A3I3_A457FasCod, P0A3I3_A460FasDsc, P0A3I3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV15ProCod ;
   private String scmdbuf ;
   private String A14042FasActiva ;
   private String A396EmprCod ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private boolean returnInSub ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13781FasCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A3I2_A14042FasActiva ;
   private String[] P0A3I2_A396EmprCod ;
   private String[] P0A3I2_A460FasDsc ;
   private String[] P0A3I2_A457FasCod ;
   private String[] P0A3I3_A14042FasActiva ;
   private String[] P0A3I3_A13781FasCDsc ;
   private String[] P0A3I3_A457FasCod ;
   private String[] P0A3I3_A460FasDsc ;
   private String[] P0A3I3_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tprocesloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A3I2", "SELECT FasActiva, EmprCod, FasDsc, FasCod FROM TXPFASPRO WHERE (EmprCod = ?) AND (Not FasDsc = '') AND (FasActiva = 'S') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A3I3", "SELECT FasActiva, RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, FasCod, FasDsc, EmprCod FROM TXPFASPRO WHERE FasActiva = 'S' ORDER BY FasCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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

