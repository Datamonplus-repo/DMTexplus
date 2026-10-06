package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprocedloaddvcombo extends GXProcedure
{
   public tprocedloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprocedloaddvcombo.class ), "" );
   }

   public tprocedloaddvcombo( int remoteHandle ,
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
      tprocedloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      tprocedloaddvcombo.this.AV13ComboName = aP0;
      tprocedloaddvcombo.this.AV15TrnMode = aP1;
      tprocedloaddvcombo.this.AV17EmprCod = aP2;
      tprocedloaddvcombo.this.AV18ProceCod = aP3;
      tprocedloaddvcombo.this.aP4 = aP4;
      tprocedloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV13ComboName, "PrvCod") == 0 )
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
      /* Using cursor P09O22 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13798PrvDscID = P09O22_A13798PrvDscID[0] ;
         A781PrvCod = P09O22_A781PrvCod[0] ;
         n781PrvCod = P09O22_n781PrvCod[0] ;
         A787PrvDsc = P09O22_A787PrvDsc[0] ;
         n787PrvDsc = P09O22_n787PrvDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A781PrvCod, 3, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13798PrvDscID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09O23 */
         pr_default.execute(1, new Object[] {AV17EmprCod, Short.valueOf(AV18ProceCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A970ProceCod = P09O23_A970ProceCod[0] ;
            A396EmprCod = P09O23_A396EmprCod[0] ;
            A781PrvCod = P09O23_A781PrvCod[0] ;
            n781PrvCod = P09O23_n781PrvCod[0] ;
            AV12SelectedValue = ((0==A781PrvCod) ? "" : GXutil.trim( GXutil.str( A781PrvCod, 3, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = tprocedloaddvcombo.this.AV12SelectedValue;
      this.aP5[0] = tprocedloaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P09O22_A13798PrvDscID = new String[] {""} ;
      P09O22_A781PrvCod = new short[1] ;
      P09O22_n781PrvCod = new boolean[] {false} ;
      P09O22_A787PrvDsc = new String[] {""} ;
      P09O22_n787PrvDsc = new boolean[] {false} ;
      A13798PrvDscID = "" ;
      A787PrvDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09O23_A970ProceCod = new short[1] ;
      P09O23_A396EmprCod = new String[] {""} ;
      P09O23_A781PrvCod = new short[1] ;
      P09O23_n781PrvCod = new boolean[] {false} ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprocedloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09O22_A13798PrvDscID, P09O22_A781PrvCod, P09O22_A787PrvDsc, P09O22_n787PrvDsc
            }
            , new Object[] {
            P09O23_A970ProceCod, P09O23_A396EmprCod, P09O23_A781PrvCod, P09O23_n781PrvCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV18ProceCod ;
   private short A781PrvCod ;
   private short A970ProceCod ;
   private short Gx_err ;
   private String AV15TrnMode ;
   private String AV17EmprCod ;
   private String scmdbuf ;
   private String A787PrvDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean n781PrvCod ;
   private boolean n787PrvDsc ;
   private String AV13ComboName ;
   private String AV12SelectedValue ;
   private String A13798PrvDscID ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09O22_A13798PrvDscID ;
   private short[] P09O22_A781PrvCod ;
   private boolean[] P09O22_n781PrvCod ;
   private String[] P09O22_A787PrvDsc ;
   private boolean[] P09O22_n787PrvDsc ;
   private short[] P09O23_A970ProceCod ;
   private String[] P09O23_A396EmprCod ;
   private short[] P09O23_A781PrvCod ;
   private boolean[] P09O23_n781PrvCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tprocedloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09O22", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrvDsc, ''))) AS PrvDscID, PrvCod, PrvDsc FROM TXPPROVIN ORDER BY PrvDscID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09O23", "SELECT ProceCod, EmprCod, PrvCod FROM TXPPROCED WHERE EmprCod = ? and ProceCod = ? ORDER BY EmprCod, ProceCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

