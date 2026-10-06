package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tfasparloaddvcombo extends GXProcedure
{
   public tfasparloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfasparloaddvcombo.class ), "" );
   }

   public tfasparloaddvcombo( int remoteHandle ,
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
                                                                                    String aP6 ,
                                                                                    short aP7 ,
                                                                                    String[] aP8 )
   {
      tfasparloaddvcombo.this.aP9 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        byte aP4 ,
                        String aP5 ,
                        String aP6 ,
                        short aP7 ,
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
                             String aP6 ,
                             short aP7 ,
                             String[] aP8 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP9 )
   {
      tfasparloaddvcombo.this.AV12ComboName = aP0;
      tfasparloaddvcombo.this.AV13TrnMode = aP1;
      tfasparloaddvcombo.this.AV14EmprCod = aP2;
      tfasparloaddvcombo.this.AV15BarCod = aP3;
      tfasparloaddvcombo.this.AV16BarCodReo = aP4;
      tfasparloaddvcombo.this.AV17BarCodPar = aP5;
      tfasparloaddvcombo.this.AV18ProCod = aP6;
      tfasparloaddvcombo.this.AV19BarOrdLin = aP7;
      tfasparloaddvcombo.this.aP8 = aP8;
      tfasparloaddvcombo.this.aP9 = aP9;
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
      if ( GXutil.strcmp(AV12ComboName, "ParFasCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PARFASCOD' */
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
      /* 'LOADCOMBOITEMS_PARFASCOD' Routine */
      returnInSub = false ;
      /* Using cursor P09XD2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13741ParCDsc = P09XD2_A13741ParCDsc[0] ;
         A1664ParFasCod = P09XD2_A1664ParFasCod[0] ;
         A1665ParFasDsc = P09XD2_A1665ParFasDsc[0] ;
         n1665ParFasDsc = P09XD2_n1665ParFasDsc[0] ;
         A396EmprCod = P09XD2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A1664ParFasCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13741ParCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP8[0] = tfasparloaddvcombo.this.AV20SelectedValue;
      this.aP9[0] = tfasparloaddvcombo.this.AV10Combo_Data;
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
      P09XD2_A13741ParCDsc = new String[] {""} ;
      P09XD2_A1664ParFasCod = new short[1] ;
      P09XD2_A1665ParFasDsc = new String[] {""} ;
      P09XD2_n1665ParFasDsc = new boolean[] {false} ;
      P09XD2_A396EmprCod = new String[] {""} ;
      A13741ParCDsc = "" ;
      A1665ParFasDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfasparloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09XD2_A13741ParCDsc, P09XD2_A1664ParFasCod, P09XD2_A1665ParFasDsc, P09XD2_n1665ParFasDsc, P09XD2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private short AV19BarOrdLin ;
   private short A1664ParFasCod ;
   private short Gx_err ;
   private int AV15BarCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV17BarCodPar ;
   private String AV18ProCod ;
   private String scmdbuf ;
   private String A1665ParFasDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean n1665ParFasDsc ;
   private String AV12ComboName ;
   private String AV20SelectedValue ;
   private String A13741ParCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP9 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P09XD2_A13741ParCDsc ;
   private short[] P09XD2_A1664ParFasCod ;
   private String[] P09XD2_A1665ParFasDsc ;
   private boolean[] P09XD2_n1665ParFasDsc ;
   private String[] P09XD2_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tfasparloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09XD2", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ParFasCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ParFasDsc, ''))) AS ParCDsc, ParFasCod, ParFasDsc, EmprCod FROM TXPPARFAS ORDER BY ParCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

