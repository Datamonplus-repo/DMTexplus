package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class disfasloaddvcombo extends GXProcedure
{
   public disfasloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disfasloaddvcombo.class ), "" );
   }

   public disfasloaddvcombo( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    int aP3 ,
                                                                                    String aP4 ,
                                                                                    short aP5 ,
                                                                                    String[] aP6 )
   {
      disfasloaddvcombo.this.aP7 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String aP4 ,
                        short aP5 ,
                        String[] aP6 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String aP4 ,
                             short aP5 ,
                             String[] aP6 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP7 )
   {
      disfasloaddvcombo.this.AV12ComboName = aP0;
      disfasloaddvcombo.this.AV13TrnMode = aP1;
      disfasloaddvcombo.this.AV14EmprCod = aP2;
      disfasloaddvcombo.this.AV15DisCod = aP3;
      disfasloaddvcombo.this.AV16ProCod = aP4;
      disfasloaddvcombo.this.AV17DisFasLin = aP5;
      disfasloaddvcombo.this.aP6 = aP6;
      disfasloaddvcombo.this.aP7 = aP7;
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
      /* Using cursor P09VW2 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09VW2_A396EmprCod[0] ;
         A457FasCod = P09VW2_A457FasCod[0] ;
         A460FasDsc = P09VW2_A460FasDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A457FasCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", A457FasCod, A460FasDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09VW3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod), AV16ProCod, Short.valueOf(AV17DisFasLin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A368DisFasLin = P09VW3_A368DisFasLin[0] ;
            A758ProCod = P09VW3_A758ProCod[0] ;
            A361DisCod = P09VW3_A361DisCod[0] ;
            A396EmprCod = P09VW3_A396EmprCod[0] ;
            A457FasCod = P09VW3_A457FasCod[0] ;
            AV18SelectedValue = A457FasCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   protected void cleanup( )
   {
      this.aP6[0] = disfasloaddvcombo.this.AV18SelectedValue;
      this.aP7[0] = disfasloaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P09VW2_A396EmprCod = new String[] {""} ;
      P09VW2_A457FasCod = new String[] {""} ;
      P09VW2_A460FasDsc = new String[] {""} ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09VW3_A368DisFasLin = new short[1] ;
      P09VW3_A758ProCod = new String[] {""} ;
      P09VW3_A361DisCod = new int[1] ;
      P09VW3_A396EmprCod = new String[] {""} ;
      P09VW3_A457FasCod = new String[] {""} ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disfasloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09VW2_A396EmprCod, P09VW2_A457FasCod, P09VW2_A460FasDsc
            }
            , new Object[] {
            P09VW3_A368DisFasLin, P09VW3_A758ProCod, P09VW3_A361DisCod, P09VW3_A396EmprCod, P09VW3_A457FasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV17DisFasLin ;
   private short A368DisFasLin ;
   private short Gx_err ;
   private int AV15DisCod ;
   private int A361DisCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV16ProCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A758ProCod ;
   private boolean returnInSub ;
   private String AV12ComboName ;
   private String AV18SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP7 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P09VW2_A396EmprCod ;
   private String[] P09VW2_A457FasCod ;
   private String[] P09VW2_A460FasDsc ;
   private short[] P09VW3_A368DisFasLin ;
   private String[] P09VW3_A758ProCod ;
   private int[] P09VW3_A361DisCod ;
   private String[] P09VW3_A396EmprCod ;
   private String[] P09VW3_A457FasCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class disfasloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09VW2", "SELECT EmprCod, FasCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09VW3", "SELECT DisFasLin, ProCod, DisCod, EmprCod, FasCod FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

