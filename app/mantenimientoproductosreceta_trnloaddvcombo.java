package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mantenimientoproductosreceta_trnloaddvcombo extends GXProcedure
{
   public mantenimientoproductosreceta_trnloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientoproductosreceta_trnloaddvcombo.class ), "" );
   }

   public mantenimientoproductosreceta_trnloaddvcombo( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    int aP3 ,
                                                                                    byte aP4 ,
                                                                                    String aP5 ,
                                                                                    short aP6 ,
                                                                                    byte aP7 ,
                                                                                    String[] aP8 )
   {
      mantenimientoproductosreceta_trnloaddvcombo.this.aP9 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        byte aP4 ,
                        String aP5 ,
                        short aP6 ,
                        byte aP7 ,
                        String[] aP8 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             byte aP4 ,
                             String aP5 ,
                             short aP6 ,
                             byte aP7 ,
                             String[] aP8 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP9 )
   {
      mantenimientoproductosreceta_trnloaddvcombo.this.AV12ComboName = aP0;
      mantenimientoproductosreceta_trnloaddvcombo.this.AV13TrnMode = aP1;
      mantenimientoproductosreceta_trnloaddvcombo.this.AV14EmprCod = aP2;
      mantenimientoproductosreceta_trnloaddvcombo.this.AV15BarCod = aP3;
      mantenimientoproductosreceta_trnloaddvcombo.this.AV16BarCodReo = aP4;
      mantenimientoproductosreceta_trnloaddvcombo.this.AV17BarCodPar = aP5;
      mantenimientoproductosreceta_trnloaddvcombo.this.AV18RecLinMaq = aP6;
      mantenimientoproductosreceta_trnloaddvcombo.this.AV19RecLinPro = aP7;
      mantenimientoproductosreceta_trnloaddvcombo.this.aP8 = aP8;
      mantenimientoproductosreceta_trnloaddvcombo.this.aP9 = aP9;
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
      if ( GXutil.strcmp(AV12ComboName, "RecPrdNum") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_RECPRDNUM' */
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
      /* 'LOADCOMBOITEMS_RECPRDNUM' Routine */
      returnInSub = false ;
      /* Using cursor P0AF92 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P0AF92_A856ValCod[0] ;
         A396EmprCod = P0AF92_A396EmprCod[0] ;
         A718PrdNom = P0AF92_A718PrdNom[0] ;
         A719PrdNum = P0AF92_A719PrdNum[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( A719PrdNum)+" "+GXutil.trim( A718PrdNom) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
   }

   protected void cleanup( )
   {
      this.aP8[0] = mantenimientoproductosreceta_trnloaddvcombo.this.AV20SelectedValue;
      this.aP9[0] = mantenimientoproductosreceta_trnloaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P0AF92_A856ValCod = new byte[1] ;
      P0AF92_A396EmprCod = new String[] {""} ;
      P0AF92_A718PrdNom = new String[] {""} ;
      P0AF92_A719PrdNum = new String[] {""} ;
      A396EmprCod = "" ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientoproductosreceta_trnloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0AF92_A856ValCod, P0AF92_A396EmprCod, P0AF92_A718PrdNom, P0AF92_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte AV19RecLinPro ;
   private byte A856ValCod ;
   private short AV18RecLinMaq ;
   private short Gx_err ;
   private int AV15BarCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV17BarCodPar ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private boolean returnInSub ;
   private String AV12ComboName ;
   private String AV20SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP9 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0AF92_A856ValCod ;
   private String[] P0AF92_A396EmprCod ;
   private String[] P0AF92_A718PrdNom ;
   private String[] P0AF92_A719PrdNum ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class mantenimientoproductosreceta_trnloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AF92", "SELECT ValCod, EmprCod, PrdNom, PrdNum FROM TXPPRODUC WHERE (EmprCod = ?) AND (ValCod >= 1 and ValCod <= 2) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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

