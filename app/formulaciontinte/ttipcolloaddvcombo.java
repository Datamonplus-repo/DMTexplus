package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipcolloaddvcombo extends GXProcedure
{
   public ttipcolloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipcolloaddvcombo.class ), "" );
   }

   public ttipcolloaddvcombo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    byte aP3 ,
                                                                                    String[] aP4 )
   {
      ttipcolloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        byte aP3 ,
                        String[] aP4 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             byte aP3 ,
                             String[] aP4 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      ttipcolloaddvcombo.this.AV12ComboName = aP0;
      ttipcolloaddvcombo.this.AV13TrnMode = aP1;
      ttipcolloaddvcombo.this.AV14EmprCod = aP2;
      ttipcolloaddvcombo.this.AV15TipColCod = aP3;
      ttipcolloaddvcombo.this.aP4 = aP4;
      ttipcolloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "TipArtFam") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TIPARTFAM' */
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
      /* 'LOADCOMBOITEMS_TIPARTFAM' Routine */
      returnInSub = false ;
      /* Using cursor P09TH2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14196ID_GrdTpDs = P09TH2_A14196ID_GrdTpDs[0] ;
         A4364GrdTipArt = P09TH2_A4364GrdTipArt[0] ;
         A4368GrdTipDsc = P09TH2_A4368GrdTipDsc[0] ;
         A396EmprCod = P09TH2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A4364GrdTipArt, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A14196ID_GrdTpDs );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09TH3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Byte.valueOf(AV15TipColCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A831TipColCod = P09TH3_A831TipColCod[0] ;
            A396EmprCod = P09TH3_A396EmprCod[0] ;
            A5723TipArtFam = P09TH3_A5723TipArtFam[0] ;
            n5723TipArtFam = P09TH3_n5723TipArtFam[0] ;
            AV16SelectedValue = ((0==A5723TipArtFam) ? "" : GXutil.trim( GXutil.str( A5723TipArtFam, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = ttipcolloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = ttipcolloaddvcombo.this.AV10Combo_Data;
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
      P09TH2_A14196ID_GrdTpDs = new String[] {""} ;
      P09TH2_A4364GrdTipArt = new short[1] ;
      P09TH2_A4368GrdTipDsc = new String[] {""} ;
      P09TH2_A396EmprCod = new String[] {""} ;
      A14196ID_GrdTpDs = "" ;
      A4368GrdTipDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09TH3_A831TipColCod = new byte[1] ;
      P09TH3_A396EmprCod = new String[] {""} ;
      P09TH3_A5723TipArtFam = new short[1] ;
      P09TH3_n5723TipArtFam = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.ttipcolloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09TH2_A14196ID_GrdTpDs, P09TH2_A4364GrdTipArt, P09TH2_A4368GrdTipDsc, P09TH2_A396EmprCod
            }
            , new Object[] {
            P09TH3_A831TipColCod, P09TH3_A396EmprCod, P09TH3_A5723TipArtFam, P09TH3_n5723TipArtFam
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15TipColCod ;
   private byte A831TipColCod ;
   private short A4364GrdTipArt ;
   private short A5723TipArtFam ;
   private short Gx_err ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A14196ID_GrdTpDs ;
   private String A4368GrdTipDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean n5723TipArtFam ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09TH2_A14196ID_GrdTpDs ;
   private short[] P09TH2_A4364GrdTipArt ;
   private String[] P09TH2_A4368GrdTipDsc ;
   private String[] P09TH2_A396EmprCod ;
   private byte[] P09TH3_A831TipColCod ;
   private String[] P09TH3_A396EmprCod ;
   private short[] P09TH3_A5723TipArtFam ;
   private boolean[] P09TH3_n5723TipArtFam ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class ttipcolloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09TH2", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(GrdTipArt,'9990'), 2))) || '-' || RTRIM(LTRIM(GrdTipDsc)) AS ID_GrdTpDs, GrdTipArt, GrdTipDsc, EmprCod FROM TXPGRDTIP ORDER BY ID_GrdTpDs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09TH3", "SELECT TipColCod, EmprCod, TipArtFam FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 35);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

