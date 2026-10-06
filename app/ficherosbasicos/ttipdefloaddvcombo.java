package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipdefloaddvcombo extends GXProcedure
{
   public ttipdefloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipdefloaddvcombo.class ), "" );
   }

   public ttipdefloaddvcombo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    short aP3 ,
                                                                                    String[] aP4 )
   {
      ttipdefloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        short aP3 ,
                        String[] aP4 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             short aP3 ,
                             String[] aP4 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      ttipdefloaddvcombo.this.AV12ComboName = aP0;
      ttipdefloaddvcombo.this.AV13TrnMode = aP1;
      ttipdefloaddvcombo.this.AV14EmprCod = aP2;
      ttipdefloaddvcombo.this.AV15TipDefCod = aP3;
      ttipdefloaddvcombo.this.aP4 = aP4;
      ttipdefloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "MaqDef") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_MAQDEF' */
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
      /* 'LOADCOMBOITEMS_MAQDEF' Routine */
      returnInSub = false ;
      /* Using cursor P0A072 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13734MaqCDsc = P0A072_A13734MaqCDsc[0] ;
         A602MaqCod = P0A072_A602MaqCod[0] ;
         A606MaqDsc = P0A072_A606MaqDsc[0] ;
         n606MaqDsc = P0A072_n606MaqDsc[0] ;
         A396EmprCod = P0A072_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13734MaqCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A073 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Short.valueOf(AV15TipDefCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A833TipDefCod = P0A073_A833TipDefCod[0] ;
            A396EmprCod = P0A073_A396EmprCod[0] ;
            A12346MaqDef = P0A073_A12346MaqDef[0] ;
            n12346MaqDef = P0A073_n12346MaqDef[0] ;
            AV16SelectedValue = A12346MaqDef ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = ttipdefloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = ttipdefloaddvcombo.this.AV10Combo_Data;
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
      P0A072_A13734MaqCDsc = new String[] {""} ;
      P0A072_A602MaqCod = new String[] {""} ;
      P0A072_A606MaqDsc = new String[] {""} ;
      P0A072_n606MaqDsc = new boolean[] {false} ;
      P0A072_A396EmprCod = new String[] {""} ;
      A13734MaqCDsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0A073_A833TipDefCod = new short[1] ;
      P0A073_A396EmprCod = new String[] {""} ;
      P0A073_A12346MaqDef = new String[] {""} ;
      P0A073_n12346MaqDef = new boolean[] {false} ;
      A12346MaqDef = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttipdefloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A072_A13734MaqCDsc, P0A072_A602MaqCod, P0A072_A606MaqDsc, P0A072_n606MaqDsc, P0A072_A396EmprCod
            }
            , new Object[] {
            P0A073_A833TipDefCod, P0A073_A396EmprCod, P0A073_A12346MaqDef, P0A073_n12346MaqDef
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV15TipDefCod ;
   private short A833TipDefCod ;
   private short Gx_err ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A396EmprCod ;
   private String A12346MaqDef ;
   private boolean returnInSub ;
   private boolean n606MaqDsc ;
   private boolean n12346MaqDef ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13734MaqCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A072_A13734MaqCDsc ;
   private String[] P0A072_A602MaqCod ;
   private String[] P0A072_A606MaqDsc ;
   private boolean[] P0A072_n606MaqDsc ;
   private String[] P0A072_A396EmprCod ;
   private short[] P0A073_A833TipDefCod ;
   private String[] P0A073_A396EmprCod ;
   private String[] P0A073_A12346MaqDef ;
   private boolean[] P0A073_n12346MaqDef ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class ttipdefloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A072", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, MaqCod, MaqDsc, EmprCod FROM TXPMAQUIN ORDER BY MaqCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A073", "SELECT TipDefCod, EmprCod, MaqDef FROM TXPTIPDEF WHERE EmprCod = ? and TipDefCod = ? ORDER BY EmprCod, TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

