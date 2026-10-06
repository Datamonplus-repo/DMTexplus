package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tclifpgloaddvcombo extends GXProcedure
{
   public tclifpgloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclifpgloaddvcombo.class ), "" );
   }

   public tclifpgloaddvcombo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    int aP3 ,
                                                                                    String[] aP4 )
   {
      tclifpgloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String[] aP4 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String[] aP4 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      tclifpgloaddvcombo.this.AV12ComboName = aP0;
      tclifpgloaddvcombo.this.AV13TrnMode = aP1;
      tclifpgloaddvcombo.this.AV14EmprCod = aP2;
      tclifpgloaddvcombo.this.AV15CliCod = aP3;
      tclifpgloaddvcombo.this.aP4 = aP4;
      tclifpgloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "FpgCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_FPGCOD' */
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
      /* 'LOADCOMBOITEMS_FPGCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A4C2 */
      pr_default.execute(0, new Object[] {AV14EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(AV15CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0A4C2_A396EmprCod[0] ;
         A497FpgCod = P0A4C2_A497FpgCod[0] ;
         A498FpgDsc = P0A4C2_A498FpgDsc[0] ;
         n498FpgDsc = P0A4C2_n498FpgDsc[0] ;
         A30AlbProCod = P0A4C2_A30AlbProCod[0] ;
         A498FpgDsc = P0A4C2_A498FpgDsc[0] ;
         n498FpgDsc = P0A4C2_n498FpgDsc[0] ;
         AV16SelectedValue = GXutil.trim( A497FpgCod) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A497FpgCod) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A497FpgCod), A498FpgDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P0A4C3 */
      pr_default.execute(1, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P0A4C3_A396EmprCod[0] ;
         A497FpgCod = P0A4C3_A497FpgCod[0] ;
         A498FpgDsc = P0A4C3_A498FpgDsc[0] ;
         n498FpgDsc = P0A4C3_n498FpgDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A497FpgCod) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A497FpgCod), A498FpgDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV10Combo_Data.sort("Title");
   }

   protected void cleanup( )
   {
      this.aP4[0] = tclifpgloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tclifpgloaddvcombo.this.AV10Combo_Data;
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
      P0A4C2_A396EmprCod = new String[] {""} ;
      P0A4C2_A497FpgCod = new String[] {""} ;
      P0A4C2_A498FpgDsc = new String[] {""} ;
      P0A4C2_n498FpgDsc = new boolean[] {false} ;
      P0A4C2_A30AlbProCod = new long[1] ;
      A396EmprCod = "" ;
      A497FpgCod = "" ;
      A498FpgDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0A4C3_A396EmprCod = new String[] {""} ;
      P0A4C3_A497FpgCod = new String[] {""} ;
      P0A4C3_A498FpgDsc = new String[] {""} ;
      P0A4C3_n498FpgDsc = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclifpgloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A4C2_A396EmprCod, P0A4C2_A497FpgCod, P0A4C2_A498FpgDsc, P0A4C2_n498FpgDsc, P0A4C2_A30AlbProCod
            }
            , new Object[] {
            P0A4C3_A396EmprCod, P0A4C3_A497FpgCod, P0A4C3_A498FpgDsc, P0A4C3_n498FpgDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV15CliCod ;
   private int A252CliCod ;
   private long A30AlbProCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A497FpgCod ;
   private String A498FpgDsc ;
   private boolean returnInSub ;
   private boolean n498FpgDsc ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A4C2_A396EmprCod ;
   private String[] P0A4C2_A497FpgCod ;
   private String[] P0A4C2_A498FpgDsc ;
   private boolean[] P0A4C2_n498FpgDsc ;
   private long[] P0A4C2_A30AlbProCod ;
   private String[] P0A4C3_A396EmprCod ;
   private String[] P0A4C3_A497FpgCod ;
   private String[] P0A4C3_A498FpgDsc ;
   private boolean[] P0A4C3_n498FpgDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tclifpgloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A4C2", "SELECT T1.EmprCod, T1.FpgCod, T2.FpgDsc, T1.AlbProCod FROM (TXPCALPRD T1 INNER JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod = T1.FpgCod) WHERE (T1.EmprCod = ?) AND (? = ?) ORDER BY T1.EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A4C3", "SELECT EmprCod, FpgCod, FpgDsc FROM TXPFORPAG WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

