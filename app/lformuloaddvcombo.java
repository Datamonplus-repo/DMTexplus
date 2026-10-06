package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class lformuloaddvcombo extends GXProcedure
{
   public lformuloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lformuloaddvcombo.class ), "" );
   }

   public lformuloaddvcombo( int remoteHandle ,
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
                                                                                    String aP5 ,
                                                                                    int aP6 ,
                                                                                    byte aP7 ,
                                                                                    short aP8 ,
                                                                                    String[] aP9 )
   {
      lformuloaddvcombo.this.aP10 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String aP4 ,
                        String aP5 ,
                        int aP6 ,
                        byte aP7 ,
                        short aP8 ,
                        String[] aP9 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String aP4 ,
                             String aP5 ,
                             int aP6 ,
                             byte aP7 ,
                             short aP8 ,
                             String[] aP9 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP10 )
   {
      lformuloaddvcombo.this.AV12ComboName = aP0;
      lformuloaddvcombo.this.AV13TrnMode = aP1;
      lformuloaddvcombo.this.AV14EmprCod = aP2;
      lformuloaddvcombo.this.AV15CliCod = aP3;
      lformuloaddvcombo.this.AV16ForSer = aP4;
      lformuloaddvcombo.this.AV17ForColNom = aP5;
      lformuloaddvcombo.this.AV18ForColNum = aP6;
      lformuloaddvcombo.this.AV19TipColCod = aP7;
      lformuloaddvcombo.this.AV20ProForL = aP8;
      lformuloaddvcombo.this.aP9 = aP9;
      lformuloaddvcombo.this.aP10 = aP10;
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
      if ( GXutil.strcmp(AV12ComboName, "ProForCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PROFORCOD' */
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
      /* 'LOADCOMBOITEMS_PROFORCOD' Routine */
      returnInSub = false ;
      /* Using cursor P0ADU2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13133ProForAct = P0ADU2_A13133ProForAct[0] ;
         A13740ProFDsc = P0ADU2_A13740ProFDsc[0] ;
         A764ProForCod = P0ADU2_A764ProForCod[0] ;
         A766ProForDsc = P0ADU2_A766ProForDsc[0] ;
         A396EmprCod = P0ADU2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A764ProForCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13740ProFDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0ADU3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15CliCod), AV16ForSer, AV17ForColNom, Integer.valueOf(AV18ForColNum), Byte.valueOf(AV19TipColCod), Short.valueOf(AV20ProForL)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1160ProForL = P0ADU3_A1160ProForL[0] ;
            A831TipColCod = P0ADU3_A831TipColCod[0] ;
            A483ForColNum = P0ADU3_A483ForColNum[0] ;
            A482ForColNom = P0ADU3_A482ForColNom[0] ;
            A494ForSer = P0ADU3_A494ForSer[0] ;
            A252CliCod = P0ADU3_A252CliCod[0] ;
            A396EmprCod = P0ADU3_A396EmprCod[0] ;
            A764ProForCod = P0ADU3_A764ProForCod[0] ;
            AV21SelectedValue = A764ProForCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   protected void cleanup( )
   {
      this.aP9[0] = lformuloaddvcombo.this.AV21SelectedValue;
      this.aP10[0] = lformuloaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P0ADU2_A13133ProForAct = new String[] {""} ;
      P0ADU2_A13740ProFDsc = new String[] {""} ;
      P0ADU2_A764ProForCod = new String[] {""} ;
      P0ADU2_A766ProForDsc = new String[] {""} ;
      P0ADU2_A396EmprCod = new String[] {""} ;
      A13133ProForAct = "" ;
      A13740ProFDsc = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0ADU3_A1160ProForL = new short[1] ;
      P0ADU3_A831TipColCod = new byte[1] ;
      P0ADU3_A483ForColNum = new int[1] ;
      P0ADU3_A482ForColNom = new String[] {""} ;
      P0ADU3_A494ForSer = new String[] {""} ;
      P0ADU3_A252CliCod = new int[1] ;
      P0ADU3_A396EmprCod = new String[] {""} ;
      P0ADU3_A764ProForCod = new String[] {""} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lformuloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0ADU2_A13133ProForAct, P0ADU2_A13740ProFDsc, P0ADU2_A764ProForCod, P0ADU2_A766ProForDsc, P0ADU2_A396EmprCod
            }
            , new Object[] {
            P0ADU3_A1160ProForL, P0ADU3_A831TipColCod, P0ADU3_A483ForColNum, P0ADU3_A482ForColNom, P0ADU3_A494ForSer, P0ADU3_A252CliCod, P0ADU3_A396EmprCod, P0ADU3_A764ProForCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19TipColCod ;
   private byte A831TipColCod ;
   private short AV20ProForL ;
   private short A1160ProForL ;
   private short Gx_err ;
   private int AV15CliCod ;
   private int AV18ForColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV16ForSer ;
   private String AV17ForColNom ;
   private String scmdbuf ;
   private String A13133ProForAct ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A396EmprCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private boolean returnInSub ;
   private String AV12ComboName ;
   private String AV21SelectedValue ;
   private String A13740ProFDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP10 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ADU2_A13133ProForAct ;
   private String[] P0ADU2_A13740ProFDsc ;
   private String[] P0ADU2_A764ProForCod ;
   private String[] P0ADU2_A766ProForDsc ;
   private String[] P0ADU2_A396EmprCod ;
   private short[] P0ADU3_A1160ProForL ;
   private byte[] P0ADU3_A831TipColCod ;
   private int[] P0ADU3_A483ForColNum ;
   private String[] P0ADU3_A482ForColNom ;
   private String[] P0ADU3_A494ForSer ;
   private int[] P0ADU3_A252CliCod ;
   private String[] P0ADU3_A396EmprCod ;
   private String[] P0ADU3_A764ProForCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class lformuloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADU2", "SELECT ProForAct, RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, ProForCod, ProForDsc, EmprCod FROM TXPCPROFO WHERE ProForAct = 'S' ORDER BY ProFDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ADU3", "SELECT ProForL, TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ProForCod FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ProForL = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

