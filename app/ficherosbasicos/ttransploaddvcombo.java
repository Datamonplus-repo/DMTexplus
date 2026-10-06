package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttransploaddvcombo extends GXProcedure
{
   public ttransploaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttransploaddvcombo.class ), "" );
   }

   public ttransploaddvcombo( int remoteHandle ,
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
      ttransploaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      ttransploaddvcombo.this.AV12ComboName = aP0;
      ttransploaddvcombo.this.AV13TrnMode = aP1;
      ttransploaddvcombo.this.AV14EmprCod = aP2;
      ttransploaddvcombo.this.AV15TrnCod = aP3;
      ttransploaddvcombo.this.aP4 = aP4;
      ttransploaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "PrvCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PRVCOD' */
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
      /* 'LOADCOMBOITEMS_PRVCOD' Routine */
      returnInSub = false ;
      /* Using cursor P0A0A2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13798PrvDscID = P0A0A2_A13798PrvDscID[0] ;
         A781PrvCod = P0A0A2_A781PrvCod[0] ;
         n781PrvCod = P0A0A2_n781PrvCod[0] ;
         A787PrvDsc = P0A0A2_A787PrvDsc[0] ;
         n787PrvDsc = P0A0A2_n787PrvDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A781PrvCod, 3, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13798PrvDscID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A0A3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Short.valueOf(AV15TrnCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A840TrnCod = P0A0A3_A840TrnCod[0] ;
            A396EmprCod = P0A0A3_A396EmprCod[0] ;
            A781PrvCod = P0A0A3_A781PrvCod[0] ;
            n781PrvCod = P0A0A3_n781PrvCod[0] ;
            AV16SelectedValue = ((0==A781PrvCod) ? "" : GXutil.trim( GXutil.str( A781PrvCod, 3, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = ttransploaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = ttransploaddvcombo.this.AV10Combo_Data;
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
      P0A0A2_A13798PrvDscID = new String[] {""} ;
      P0A0A2_A781PrvCod = new short[1] ;
      P0A0A2_n781PrvCod = new boolean[] {false} ;
      P0A0A2_A787PrvDsc = new String[] {""} ;
      P0A0A2_n787PrvDsc = new boolean[] {false} ;
      A13798PrvDscID = "" ;
      A787PrvDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0A0A3_A840TrnCod = new short[1] ;
      P0A0A3_A396EmprCod = new String[] {""} ;
      P0A0A3_A781PrvCod = new short[1] ;
      P0A0A3_n781PrvCod = new boolean[] {false} ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttransploaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A0A2_A13798PrvDscID, P0A0A2_A781PrvCod, P0A0A2_A787PrvDsc, P0A0A2_n787PrvDsc
            }
            , new Object[] {
            P0A0A3_A840TrnCod, P0A0A3_A396EmprCod, P0A0A3_A781PrvCod, P0A0A3_n781PrvCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV15TrnCod ;
   private short A781PrvCod ;
   private short A840TrnCod ;
   private short Gx_err ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A787PrvDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean n781PrvCod ;
   private boolean n787PrvDsc ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13798PrvDscID ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A0A2_A13798PrvDscID ;
   private short[] P0A0A2_A781PrvCod ;
   private boolean[] P0A0A2_n781PrvCod ;
   private String[] P0A0A2_A787PrvDsc ;
   private boolean[] P0A0A2_n787PrvDsc ;
   private short[] P0A0A3_A840TrnCod ;
   private String[] P0A0A3_A396EmprCod ;
   private short[] P0A0A3_A781PrvCod ;
   private boolean[] P0A0A3_n781PrvCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class ttransploaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A0A2", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrvDsc, ''))) AS PrvDscID, PrvCod, PrvDsc FROM TXPPROVIN ORDER BY PrvDscID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A0A3", "SELECT TrnCod, EmprCod, PrvCod FROM TXPTRANSP WHERE EmprCod = ? and TrnCod = ? ORDER BY EmprCod, TrnCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

