package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprdfrrloaddvcombo extends GXProcedure
{
   public tprdfrrloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprdfrrloaddvcombo.class ), "" );
   }

   public tprdfrrloaddvcombo( int remoteHandle ,
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
      tprdfrrloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      tprdfrrloaddvcombo.this.AV13ComboName = aP0;
      tprdfrrloaddvcombo.this.AV15TrnMode = aP1;
      tprdfrrloaddvcombo.this.AV17EmprCod = aP2;
      tprdfrrloaddvcombo.this.AV18PrdNum = aP3;
      tprdfrrloaddvcombo.this.aP4 = aP4;
      tprdfrrloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV13ComboName, "CFraseR") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CFRASER' */
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
      /* 'LOADCOMBOITEMS_CFRASER' Routine */
      returnInSub = false ;
      /* Using cursor P09L32 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13870CFraseRDFr = P09L32_A13870CFraseRDFr[0] ;
         A11197CFraseR = P09L32_A11197CFraseR[0] ;
         A11198DFraseR = P09L32_A11198DFraseR[0] ;
         n11198DFraseR = P09L32_n11198DFraseR[0] ;
         A396EmprCod = P09L32_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A11197CFraseR );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13870CFraseRDFr );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP4[0] = tprdfrrloaddvcombo.this.AV12SelectedValue;
      this.aP5[0] = tprdfrrloaddvcombo.this.AV10Combo_Data;
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
      P09L32_A13870CFraseRDFr = new String[] {""} ;
      P09L32_A11197CFraseR = new String[] {""} ;
      P09L32_A11198DFraseR = new String[] {""} ;
      P09L32_n11198DFraseR = new boolean[] {false} ;
      P09L32_A396EmprCod = new String[] {""} ;
      A13870CFraseRDFr = "" ;
      A11197CFraseR = "" ;
      A11198DFraseR = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.tprdfrrloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09L32_A13870CFraseRDFr, P09L32_A11197CFraseR, P09L32_A11198DFraseR, P09L32_n11198DFraseR, P09L32_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV15TrnMode ;
   private String AV17EmprCod ;
   private String AV18PrdNum ;
   private String scmdbuf ;
   private String A11197CFraseR ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean n11198DFraseR ;
   private String AV13ComboName ;
   private String AV12SelectedValue ;
   private String A13870CFraseRDFr ;
   private String A11198DFraseR ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09L32_A13870CFraseRDFr ;
   private String[] P09L32_A11197CFraseR ;
   private String[] P09L32_A11198DFraseR ;
   private boolean[] P09L32_n11198DFraseR ;
   private String[] P09L32_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tprdfrrloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09L32", "SELECT RTRIM(LTRIM(CFraseR)) || '-' || RTRIM(LTRIM(COALESCE( DFraseR, ''))) AS CFraseRDFr, CFraseR, DFraseR, EmprCod FROM TXPFRASR ORDER BY CFraseRDFr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

