package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class colorproductosvariablesloaddvcombo extends GXProcedure
{
   public colorproductosvariablesloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( colorproductosvariablesloaddvcombo.class ), "" );
   }

   public colorproductosvariablesloaddvcombo( int remoteHandle ,
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
      colorproductosvariablesloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      colorproductosvariablesloaddvcombo.this.AV12ComboName = aP0;
      colorproductosvariablesloaddvcombo.this.AV13TrnMode = aP1;
      colorproductosvariablesloaddvcombo.this.AV14EmprCod = aP2;
      colorproductosvariablesloaddvcombo.this.AV15ForNumCol = aP3;
      colorproductosvariablesloaddvcombo.this.aP4 = aP4;
      colorproductosvariablesloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "PrdNum") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PRDNUM' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "ForPrdUMe") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_FORPRDUME' */
         S121 ();
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
      /* 'LOADCOMBOITEMS_PRDNUM' Routine */
      returnInSub = false ;
      /* Using cursor P0AD82 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P0AD82_A856ValCod[0] ;
         A13747PrdCDsc = P0AD82_A13747PrdCDsc[0] ;
         A719PrdNum = P0AD82_A719PrdNum[0] ;
         A718PrdNom = P0AD82_A718PrdNom[0] ;
         A396EmprCod = P0AD82_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13747PrdCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_FORPRDUME' Routine */
      returnInSub = false ;
      /* Using cursor P0AD83 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13746ForPrdCDsc = P0AD83_A13746ForPrdCDsc[0] ;
         A490ForPrdUMe = P0AD83_A490ForPrdUMe[0] ;
         A488ForPrdDsc = P0AD83_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AD83_n488ForPrdDsc[0] ;
         A396EmprCod = P0AD83_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A490ForPrdUMe, 1, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13746ForPrdCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP4[0] = colorproductosvariablesloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = colorproductosvariablesloaddvcombo.this.AV10Combo_Data;
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
      P0AD82_A856ValCod = new byte[1] ;
      P0AD82_A13747PrdCDsc = new String[] {""} ;
      P0AD82_A719PrdNum = new String[] {""} ;
      P0AD82_A718PrdNom = new String[] {""} ;
      P0AD82_A396EmprCod = new String[] {""} ;
      A13747PrdCDsc = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0AD83_A13746ForPrdCDsc = new String[] {""} ;
      P0AD83_A490ForPrdUMe = new byte[1] ;
      P0AD83_A488ForPrdDsc = new String[] {""} ;
      P0AD83_n488ForPrdDsc = new boolean[] {false} ;
      P0AD83_A396EmprCod = new String[] {""} ;
      A13746ForPrdCDsc = "" ;
      A488ForPrdDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorproductosvariablesloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0AD82_A856ValCod, P0AD82_A13747PrdCDsc, P0AD82_A719PrdNum, P0AD82_A718PrdNom, P0AD82_A396EmprCod
            }
            , new Object[] {
            P0AD83_A13746ForPrdCDsc, P0AD83_A490ForPrdUMe, P0AD83_A488ForPrdDsc, P0AD83_n488ForPrdDsc, P0AD83_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private byte A490ForPrdUMe ;
   private short Gx_err ;
   private int AV15ForNumCol ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private String A488ForPrdDsc ;
   private boolean returnInSub ;
   private boolean n488ForPrdDsc ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13747PrdCDsc ;
   private String A13746ForPrdCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0AD82_A856ValCod ;
   private String[] P0AD82_A13747PrdCDsc ;
   private String[] P0AD82_A719PrdNum ;
   private String[] P0AD82_A718PrdNom ;
   private String[] P0AD82_A396EmprCod ;
   private String[] P0AD83_A13746ForPrdCDsc ;
   private byte[] P0AD83_A490ForPrdUMe ;
   private String[] P0AD83_A488ForPrdDsc ;
   private boolean[] P0AD83_n488ForPrdDsc ;
   private String[] P0AD83_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class colorproductosvariablesloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AD82", "SELECT ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE ValCod >= 1 and ValCod <= 2 and SUBSTR(PrdNum, 1, 1) <> '#' and SUBSTR(PrdNum, 1, 1) <> 'C' ORDER BY PrdCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AD83", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, ForPrdUMe, ForPrdDsc, EmprCod FROM TXPUNMEPR ORDER BY ForPrdCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
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

