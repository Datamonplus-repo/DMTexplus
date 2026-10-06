package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class devoluciontejido_1loaddvcombo extends GXProcedure
{
   public devoluciontejido_1loaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_1loaddvcombo.class ), "" );
   }

   public devoluciontejido_1loaddvcombo( int remoteHandle ,
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
      devoluciontejido_1loaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      devoluciontejido_1loaddvcombo.this.AV12ComboName = aP0;
      devoluciontejido_1loaddvcombo.this.AV13TrnMode = aP1;
      devoluciontejido_1loaddvcombo.this.AV14EmprCod = aP2;
      devoluciontejido_1loaddvcombo.this.AV15DevCruId = aP3;
      devoluciontejido_1loaddvcombo.this.aP4 = aP4;
      devoluciontejido_1loaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "TrnCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TRNCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "CliCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CLICOD' */
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
      /* 'LOADCOMBOITEMS_TRNCOD' Routine */
      returnInSub = false ;
      /* Using cursor P09SI2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13738TrnCNom = P09SI2_A13738TrnCNom[0] ;
         A840TrnCod = P09SI2_A840TrnCod[0] ;
         n840TrnCod = P09SI2_n840TrnCod[0] ;
         A841TrnNom = P09SI2_A841TrnNom[0] ;
         n841TrnNom = P09SI2_n841TrnNom[0] ;
         A396EmprCod = P09SI2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13738TrnCNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09SI3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15DevCruId)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A11669DevCruId = P09SI3_A11669DevCruId[0] ;
            A396EmprCod = P09SI3_A396EmprCod[0] ;
            A840TrnCod = P09SI3_A840TrnCod[0] ;
            n840TrnCod = P09SI3_n840TrnCod[0] ;
            AV16SelectedValue = ((0==A840TrnCod) ? "" : GXutil.trim( GXutil.str( A840TrnCod, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_CLICOD' Routine */
      returnInSub = false ;
      /* Using cursor P09SI4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A10045CliAct = P09SI4_A10045CliAct[0] ;
         A14416CliNac = P09SI4_A14416CliNac[0] ;
         A13735CliCNom = P09SI4_A13735CliCNom[0] ;
         A252CliCod = P09SI4_A252CliCod[0] ;
         A279CliNom = P09SI4_A279CliNom[0] ;
         A396EmprCod = P09SI4_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09SI5 */
         pr_default.execute(3, new Object[] {AV14EmprCod, Integer.valueOf(AV15DevCruId)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A11669DevCruId = P09SI5_A11669DevCruId[0] ;
            A396EmprCod = P09SI5_A396EmprCod[0] ;
            A252CliCod = P09SI5_A252CliCod[0] ;
            AV16SelectedValue = ((0==A252CliCod) ? "" : GXutil.trim( GXutil.str( A252CliCod, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = devoluciontejido_1loaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = devoluciontejido_1loaddvcombo.this.AV10Combo_Data;
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
      P09SI2_A13738TrnCNom = new String[] {""} ;
      P09SI2_A840TrnCod = new short[1] ;
      P09SI2_n840TrnCod = new boolean[] {false} ;
      P09SI2_A841TrnNom = new String[] {""} ;
      P09SI2_n841TrnNom = new boolean[] {false} ;
      P09SI2_A396EmprCod = new String[] {""} ;
      A13738TrnCNom = "" ;
      A841TrnNom = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09SI3_A11669DevCruId = new int[1] ;
      P09SI3_A396EmprCod = new String[] {""} ;
      P09SI3_A840TrnCod = new short[1] ;
      P09SI3_n840TrnCod = new boolean[] {false} ;
      P09SI4_A10045CliAct = new String[] {""} ;
      P09SI4_A14416CliNac = new String[] {""} ;
      P09SI4_A13735CliCNom = new String[] {""} ;
      P09SI4_A252CliCod = new int[1] ;
      P09SI4_A279CliNom = new String[] {""} ;
      P09SI4_A396EmprCod = new String[] {""} ;
      A10045CliAct = "" ;
      A14416CliNac = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      P09SI5_A11669DevCruId = new int[1] ;
      P09SI5_A396EmprCod = new String[] {""} ;
      P09SI5_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_1loaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09SI2_A13738TrnCNom, P09SI2_A840TrnCod, P09SI2_A841TrnNom, P09SI2_n841TrnNom, P09SI2_A396EmprCod
            }
            , new Object[] {
            P09SI3_A11669DevCruId, P09SI3_A396EmprCod, P09SI3_A840TrnCod, P09SI3_n840TrnCod
            }
            , new Object[] {
            P09SI4_A10045CliAct, P09SI4_A14416CliNac, P09SI4_A13735CliCNom, P09SI4_A252CliCod, P09SI4_A279CliNom, P09SI4_A396EmprCod
            }
            , new Object[] {
            P09SI5_A11669DevCruId, P09SI5_A396EmprCod, P09SI5_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A840TrnCod ;
   private short Gx_err ;
   private int AV15DevCruId ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A841TrnNom ;
   private String A396EmprCod ;
   private String A10045CliAct ;
   private String A14416CliNac ;
   private String A279CliNom ;
   private boolean returnInSub ;
   private boolean n840TrnCod ;
   private boolean n841TrnNom ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13738TrnCNom ;
   private String A13735CliCNom ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09SI2_A13738TrnCNom ;
   private short[] P09SI2_A840TrnCod ;
   private boolean[] P09SI2_n840TrnCod ;
   private String[] P09SI2_A841TrnNom ;
   private boolean[] P09SI2_n841TrnNom ;
   private String[] P09SI2_A396EmprCod ;
   private int[] P09SI3_A11669DevCruId ;
   private String[] P09SI3_A396EmprCod ;
   private short[] P09SI3_A840TrnCod ;
   private boolean[] P09SI3_n840TrnCod ;
   private String[] P09SI4_A10045CliAct ;
   private String[] P09SI4_A14416CliNac ;
   private String[] P09SI4_A13735CliCNom ;
   private int[] P09SI4_A252CliCod ;
   private String[] P09SI4_A279CliNom ;
   private String[] P09SI4_A396EmprCod ;
   private int[] P09SI5_A11669DevCruId ;
   private String[] P09SI5_A396EmprCod ;
   private int[] P09SI5_A252CliCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class devoluciontejido_1loaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09SI2", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, TrnCod, TrnNom, EmprCod FROM TXPTRANSP ORDER BY TrnCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09SI3", "SELECT DevCruId, EmprCod, TrnCod FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09SI4", "SELECT CliAct, CliNac, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom, EmprCod FROM TXPCLIENT WHERE (CliAct = 'S') AND (CliNac = 'S') ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09SI5", "SELECT DevCruId, EmprCod, CliCod FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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

