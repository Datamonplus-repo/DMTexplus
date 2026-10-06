package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class procesoquimico_2loaddvcombo extends GXProcedure
{
   public procesoquimico_2loaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesoquimico_2loaddvcombo.class ), "" );
   }

   public procesoquimico_2loaddvcombo( int remoteHandle ,
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
      procesoquimico_2loaddvcombo.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      procesoquimico_2loaddvcombo.this.AV12ComboName = aP0;
      procesoquimico_2loaddvcombo.this.AV13TrnMode = aP1;
      procesoquimico_2loaddvcombo.this.AV14EmprCod = aP2;
      procesoquimico_2loaddvcombo.this.AV15ProForCod = aP3;
      procesoquimico_2loaddvcombo.this.AV16ProForLin = aP4;
      procesoquimico_2loaddvcombo.this.aP5 = aP5;
      procesoquimico_2loaddvcombo.this.aP6 = aP6;
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
      if ( GXutil.strcmp(AV12ComboName, "ProForPrd") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PROFORPRD' */
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
      /* 'LOADCOMBOITEMS_PROFORPRD' Routine */
      returnInSub = false ;
      /* Using cursor P09T92 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P09T92_A856ValCod[0] ;
         A13747PrdCDsc = P09T92_A13747PrdCDsc[0] ;
         A719PrdNum = P09T92_A719PrdNum[0] ;
         A718PrdNom = P09T92_A718PrdNom[0] ;
         A396EmprCod = P09T92_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13747PrdCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09T93 */
         pr_default.execute(1, new Object[] {AV14EmprCod, AV15ProForCod, Short.valueOf(AV16ProForLin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A767ProForLin = P09T93_A767ProForLin[0] ;
            A764ProForCod = P09T93_A764ProForCod[0] ;
            A396EmprCod = P09T93_A396EmprCod[0] ;
            A770ProForPrd = P09T93_A770ProForPrd[0] ;
            AV17SelectedValue = A770ProForPrd ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   protected void cleanup( )
   {
      this.aP5[0] = procesoquimico_2loaddvcombo.this.AV17SelectedValue;
      this.aP6[0] = procesoquimico_2loaddvcombo.this.AV10Combo_Data;
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
      P09T92_A856ValCod = new byte[1] ;
      P09T92_A13747PrdCDsc = new String[] {""} ;
      P09T92_A719PrdNum = new String[] {""} ;
      P09T92_A718PrdNom = new String[] {""} ;
      P09T92_A396EmprCod = new String[] {""} ;
      A13747PrdCDsc = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09T93_A767ProForLin = new short[1] ;
      P09T93_A764ProForCod = new String[] {""} ;
      P09T93_A396EmprCod = new String[] {""} ;
      P09T93_A770ProForPrd = new String[] {""} ;
      A764ProForCod = "" ;
      A770ProForPrd = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_2loaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09T92_A856ValCod, P09T92_A13747PrdCDsc, P09T92_A719PrdNum, P09T92_A718PrdNom, P09T92_A396EmprCod
            }
            , new Object[] {
            P09T93_A767ProForLin, P09T93_A764ProForCod, P09T93_A396EmprCod, P09T93_A770ProForPrd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short AV16ProForLin ;
   private short A767ProForLin ;
   private short Gx_err ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV15ProForCod ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String A770ProForPrd ;
   private boolean returnInSub ;
   private String AV12ComboName ;
   private String AV17SelectedValue ;
   private String A13747PrdCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09T92_A856ValCod ;
   private String[] P09T92_A13747PrdCDsc ;
   private String[] P09T92_A719PrdNum ;
   private String[] P09T92_A718PrdNom ;
   private String[] P09T92_A396EmprCod ;
   private short[] P09T93_A767ProForLin ;
   private String[] P09T93_A764ProForCod ;
   private String[] P09T93_A396EmprCod ;
   private String[] P09T93_A770ProForPrd ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class procesoquimico_2loaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09T92", "SELECT ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE ValCod = 1 ORDER BY PrdCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09T93", "SELECT ProForLin, ProForCod, EmprCod, ProForPrd FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? and ProForLin = ? ORDER BY EmprCod, ProForCod, ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

