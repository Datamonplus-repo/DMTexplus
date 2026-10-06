package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tproces_lineas_trnloaddvcombo extends GXProcedure
{
   public tproces_lineas_trnloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tproces_lineas_trnloaddvcombo.class ), "" );
   }

   public tproces_lineas_trnloaddvcombo( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    String aP3 ,
                                                                                    short aP4 ,
                                                                                    String[] aP5 )
   {
      tproces_lineas_trnloaddvcombo.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        short aP4 ,
                        String[] aP5 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             short aP4 ,
                             String[] aP5 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 )
   {
      tproces_lineas_trnloaddvcombo.this.AV12ComboName = aP0;
      tproces_lineas_trnloaddvcombo.this.AV13TrnMode = aP1;
      tproces_lineas_trnloaddvcombo.this.AV14EmprCod = aP2;
      tproces_lineas_trnloaddvcombo.this.AV15ProCod = aP3;
      tproces_lineas_trnloaddvcombo.this.AV16ProNumLin = aP4;
      tproces_lineas_trnloaddvcombo.this.aP5 = aP5;
      tproces_lineas_trnloaddvcombo.this.aP6 = aP6;
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
      /* Using cursor P0AA12 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13781FasCDsc = P0AA12_A13781FasCDsc[0] ;
         A457FasCod = P0AA12_A457FasCod[0] ;
         A460FasDsc = P0AA12_A460FasDsc[0] ;
         A396EmprCod = P0AA12_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A457FasCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13781FasCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0AA13 */
         pr_default.execute(1, new Object[] {AV14EmprCod, AV15ProCod, Short.valueOf(AV16ProNumLin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A774ProNumLin = P0AA13_A774ProNumLin[0] ;
            A758ProCod = P0AA13_A758ProCod[0] ;
            A396EmprCod = P0AA13_A396EmprCod[0] ;
            A457FasCod = P0AA13_A457FasCod[0] ;
            AV17SelectedValue = A457FasCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   protected void cleanup( )
   {
      this.aP5[0] = tproces_lineas_trnloaddvcombo.this.AV17SelectedValue;
      this.aP6[0] = tproces_lineas_trnloaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P0AA12_A13781FasCDsc = new String[] {""} ;
      P0AA12_A457FasCod = new String[] {""} ;
      P0AA12_A460FasDsc = new String[] {""} ;
      P0AA12_A396EmprCod = new String[] {""} ;
      A13781FasCDsc = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0AA13_A774ProNumLin = new short[1] ;
      P0AA13_A758ProCod = new String[] {""} ;
      P0AA13_A396EmprCod = new String[] {""} ;
      P0AA13_A457FasCod = new String[] {""} ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces_lineas_trnloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0AA12_A13781FasCDsc, P0AA12_A457FasCod, P0AA12_A460FasDsc, P0AA12_A396EmprCod
            }
            , new Object[] {
            P0AA13_A774ProNumLin, P0AA13_A758ProCod, P0AA13_A396EmprCod, P0AA13_A457FasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV16ProNumLin ;
   private short A774ProNumLin ;
   private short Gx_err ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV15ProCod ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private boolean returnInSub ;
   private String AV12ComboName ;
   private String AV17SelectedValue ;
   private String A13781FasCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AA12_A13781FasCDsc ;
   private String[] P0AA12_A457FasCod ;
   private String[] P0AA12_A460FasDsc ;
   private String[] P0AA12_A396EmprCod ;
   private short[] P0AA13_A774ProNumLin ;
   private String[] P0AA13_A758ProCod ;
   private String[] P0AA13_A396EmprCod ;
   private String[] P0AA13_A457FasCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tproces_lineas_trnloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AA12", "SELECT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, FasCod, FasDsc, EmprCod FROM TXPFASPRO ORDER BY FasCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AA13", "SELECT ProNumLin, ProCod, EmprCod, FasCod FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

