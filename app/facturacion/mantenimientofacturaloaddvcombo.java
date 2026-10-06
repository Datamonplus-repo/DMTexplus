package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mantenimientofacturaloaddvcombo extends GXProcedure
{
   public mantenimientofacturaloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientofacturaloaddvcombo.class ), "" );
   }

   public mantenimientofacturaloaddvcombo( int remoteHandle ,
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
      mantenimientofacturaloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      mantenimientofacturaloaddvcombo.this.AV12ComboName = aP0;
      mantenimientofacturaloaddvcombo.this.AV13TrnMode = aP1;
      mantenimientofacturaloaddvcombo.this.AV14EmprCod = aP2;
      mantenimientofacturaloaddvcombo.this.AV15FacCod = aP3;
      mantenimientofacturaloaddvcombo.this.aP4 = aP4;
      mantenimientofacturaloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "FacFpg") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_FACFPG' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "MeivaId") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_MEIVAID' */
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
      /* 'LOADCOMBOITEMS_FACFPG' Routine */
      returnInSub = false ;
      /* Using cursor P09Z02 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13811FpgDscID = P09Z02_A13811FpgDscID[0] ;
         A497FpgCod = P09Z02_A497FpgCod[0] ;
         A498FpgDsc = P09Z02_A498FpgDsc[0] ;
         n498FpgDsc = P09Z02_n498FpgDsc[0] ;
         A396EmprCod = P09Z02_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A497FpgCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13811FpgDscID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09Z03 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15FacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A430FacCod = P09Z03_A430FacCod[0] ;
            A396EmprCod = P09Z03_A396EmprCod[0] ;
            A437FacFpg = P09Z03_A437FacFpg[0] ;
            AV16SelectedValue = A437FacFpg ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_MEIVAID' Routine */
      returnInSub = false ;
      /* Using cursor P09Z04 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14246ID_MeivaDs = P09Z04_A14246ID_MeivaDs[0] ;
         A11629MeivaId = P09Z04_A11629MeivaId[0] ;
         n11629MeivaId = P09Z04_n11629MeivaId[0] ;
         A11630MeivaDsc = P09Z04_A11630MeivaDsc[0] ;
         n11630MeivaDsc = P09Z04_n11630MeivaDsc[0] ;
         A396EmprCod = P09Z04_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A11629MeivaId );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A14246ID_MeivaDs );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09Z05 */
         pr_default.execute(3, new Object[] {AV14EmprCod, Integer.valueOf(AV15FacCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A430FacCod = P09Z05_A430FacCod[0] ;
            A396EmprCod = P09Z05_A396EmprCod[0] ;
            A11629MeivaId = P09Z05_A11629MeivaId[0] ;
            n11629MeivaId = P09Z05_n11629MeivaId[0] ;
            AV16SelectedValue = A11629MeivaId ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = mantenimientofacturaloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = mantenimientofacturaloaddvcombo.this.AV10Combo_Data;
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
      P09Z02_A13811FpgDscID = new String[] {""} ;
      P09Z02_A497FpgCod = new String[] {""} ;
      P09Z02_A498FpgDsc = new String[] {""} ;
      P09Z02_n498FpgDsc = new boolean[] {false} ;
      P09Z02_A396EmprCod = new String[] {""} ;
      A13811FpgDscID = "" ;
      A497FpgCod = "" ;
      A498FpgDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09Z03_A430FacCod = new int[1] ;
      P09Z03_A396EmprCod = new String[] {""} ;
      P09Z03_A437FacFpg = new String[] {""} ;
      A437FacFpg = "" ;
      P09Z04_A14246ID_MeivaDs = new String[] {""} ;
      P09Z04_A11629MeivaId = new String[] {""} ;
      P09Z04_n11629MeivaId = new boolean[] {false} ;
      P09Z04_A11630MeivaDsc = new String[] {""} ;
      P09Z04_n11630MeivaDsc = new boolean[] {false} ;
      P09Z04_A396EmprCod = new String[] {""} ;
      A14246ID_MeivaDs = "" ;
      A11629MeivaId = "" ;
      A11630MeivaDsc = "" ;
      P09Z05_A430FacCod = new int[1] ;
      P09Z05_A396EmprCod = new String[] {""} ;
      P09Z05_A11629MeivaId = new String[] {""} ;
      P09Z05_n11629MeivaId = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.mantenimientofacturaloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09Z02_A13811FpgDscID, P09Z02_A497FpgCod, P09Z02_A498FpgDsc, P09Z02_n498FpgDsc, P09Z02_A396EmprCod
            }
            , new Object[] {
            P09Z03_A430FacCod, P09Z03_A396EmprCod, P09Z03_A437FacFpg
            }
            , new Object[] {
            P09Z04_A14246ID_MeivaDs, P09Z04_A11629MeivaId, P09Z04_A11630MeivaDsc, P09Z04_n11630MeivaDsc, P09Z04_A396EmprCod
            }
            , new Object[] {
            P09Z05_A430FacCod, P09Z05_A396EmprCod, P09Z05_A11629MeivaId, P09Z05_n11629MeivaId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV15FacCod ;
   private int A430FacCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A497FpgCod ;
   private String A498FpgDsc ;
   private String A396EmprCod ;
   private String A437FacFpg ;
   private String A14246ID_MeivaDs ;
   private String A11629MeivaId ;
   private boolean returnInSub ;
   private boolean n498FpgDsc ;
   private boolean n11629MeivaId ;
   private boolean n11630MeivaDsc ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13811FpgDscID ;
   private String A11630MeivaDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09Z02_A13811FpgDscID ;
   private String[] P09Z02_A497FpgCod ;
   private String[] P09Z02_A498FpgDsc ;
   private boolean[] P09Z02_n498FpgDsc ;
   private String[] P09Z02_A396EmprCod ;
   private int[] P09Z03_A430FacCod ;
   private String[] P09Z03_A396EmprCod ;
   private String[] P09Z03_A437FacFpg ;
   private String[] P09Z04_A14246ID_MeivaDs ;
   private String[] P09Z04_A11629MeivaId ;
   private boolean[] P09Z04_n11629MeivaId ;
   private String[] P09Z04_A11630MeivaDsc ;
   private boolean[] P09Z04_n11630MeivaDsc ;
   private String[] P09Z04_A396EmprCod ;
   private int[] P09Z05_A430FacCod ;
   private String[] P09Z05_A396EmprCod ;
   private String[] P09Z05_A11629MeivaId ;
   private boolean[] P09Z05_n11629MeivaId ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class mantenimientofacturaloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09Z02", "SELECT RTRIM(LTRIM(FpgCod)) || '-' || RTRIM(LTRIM(COALESCE( FpgDsc, ''))) AS FpgDscID, FpgCod, FpgDsc, EmprCod FROM TXPFORPAG ORDER BY FpgDscID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09Z03", "SELECT FacCod, EmprCod, FacFpg FROM TXPCFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09Z04", "SELECT RTRIM(LTRIM(MeivaId)) || '-' || RTRIM(LTRIM(COALESCE( MeivaDsc, ''))) AS ID_MeivaDs, MeivaId, MeivaDsc, EmprCod FROM TXPMEIVA ORDER BY ID_MeivaDs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09Z05", "SELECT FacCod, EmprCod, MeivaId FROM TXPCFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 110);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

