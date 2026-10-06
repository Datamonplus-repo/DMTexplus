package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class almacentejidodevolucionloaddvcombo extends GXProcedure
{
   public almacentejidodevolucionloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidodevolucionloaddvcombo.class ), "" );
   }

   public almacentejidodevolucionloaddvcombo( int remoteHandle ,
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
      almacentejidodevolucionloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      almacentejidodevolucionloaddvcombo.this.AV13ComboName = aP0;
      almacentejidodevolucionloaddvcombo.this.AV15TrnMode = aP1;
      almacentejidodevolucionloaddvcombo.this.AV17EmprCod = aP2;
      almacentejidodevolucionloaddvcombo.this.AV18DevCruId = aP3;
      almacentejidodevolucionloaddvcombo.this.aP4 = aP4;
      almacentejidodevolucionloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV13ComboName, "CliCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CLICOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "TrnCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TRNCOD' */
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
      /* 'LOADCOMBOITEMS_CLICOD' Routine */
      returnInSub = false ;
      /* Using cursor P09O32 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13735CliCNom = P09O32_A13735CliCNom[0] ;
         A252CliCod = P09O32_A252CliCod[0] ;
         A279CliNom = P09O32_A279CliNom[0] ;
         A396EmprCod = P09O32_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09O33 */
         pr_default.execute(1, new Object[] {AV17EmprCod, Integer.valueOf(AV18DevCruId)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A11669DevCruId = P09O33_A11669DevCruId[0] ;
            A396EmprCod = P09O33_A396EmprCod[0] ;
            A252CliCod = P09O33_A252CliCod[0] ;
            AV12SelectedValue = ((0==A252CliCod) ? "" : GXutil.trim( GXutil.str( A252CliCod, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_TRNCOD' Routine */
      returnInSub = false ;
      /* Using cursor P09O34 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13738TrnCNom = P09O34_A13738TrnCNom[0] ;
         A840TrnCod = P09O34_A840TrnCod[0] ;
         n840TrnCod = P09O34_n840TrnCod[0] ;
         A841TrnNom = P09O34_A841TrnNom[0] ;
         n841TrnNom = P09O34_n841TrnNom[0] ;
         A396EmprCod = P09O34_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13738TrnCNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09O35 */
         pr_default.execute(3, new Object[] {AV17EmprCod, Integer.valueOf(AV18DevCruId)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A11669DevCruId = P09O35_A11669DevCruId[0] ;
            A396EmprCod = P09O35_A396EmprCod[0] ;
            A840TrnCod = P09O35_A840TrnCod[0] ;
            n840TrnCod = P09O35_n840TrnCod[0] ;
            AV12SelectedValue = ((0==A840TrnCod) ? "" : GXutil.trim( GXutil.str( A840TrnCod, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = almacentejidodevolucionloaddvcombo.this.AV12SelectedValue;
      this.aP5[0] = almacentejidodevolucionloaddvcombo.this.AV10Combo_Data;
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
      P09O32_A13735CliCNom = new String[] {""} ;
      P09O32_A252CliCod = new int[1] ;
      P09O32_A279CliNom = new String[] {""} ;
      P09O32_A396EmprCod = new String[] {""} ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09O33_A11669DevCruId = new int[1] ;
      P09O33_A396EmprCod = new String[] {""} ;
      P09O33_A252CliCod = new int[1] ;
      P09O34_A13738TrnCNom = new String[] {""} ;
      P09O34_A840TrnCod = new short[1] ;
      P09O34_n840TrnCod = new boolean[] {false} ;
      P09O34_A841TrnNom = new String[] {""} ;
      P09O34_n841TrnNom = new boolean[] {false} ;
      P09O34_A396EmprCod = new String[] {""} ;
      A13738TrnCNom = "" ;
      A841TrnNom = "" ;
      P09O35_A11669DevCruId = new int[1] ;
      P09O35_A396EmprCod = new String[] {""} ;
      P09O35_A840TrnCod = new short[1] ;
      P09O35_n840TrnCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejidodevolucionloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09O32_A13735CliCNom, P09O32_A252CliCod, P09O32_A279CliNom, P09O32_A396EmprCod
            }
            , new Object[] {
            P09O33_A11669DevCruId, P09O33_A396EmprCod, P09O33_A252CliCod
            }
            , new Object[] {
            P09O34_A13738TrnCNom, P09O34_A840TrnCod, P09O34_A841TrnNom, P09O34_n841TrnNom, P09O34_A396EmprCod
            }
            , new Object[] {
            P09O35_A11669DevCruId, P09O35_A396EmprCod, P09O35_A840TrnCod, P09O35_n840TrnCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A840TrnCod ;
   private short Gx_err ;
   private int AV18DevCruId ;
   private int A252CliCod ;
   private int A11669DevCruId ;
   private String AV15TrnMode ;
   private String AV17EmprCod ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String A396EmprCod ;
   private String A841TrnNom ;
   private boolean returnInSub ;
   private boolean n840TrnCod ;
   private boolean n841TrnNom ;
   private String AV13ComboName ;
   private String AV12SelectedValue ;
   private String A13735CliCNom ;
   private String A13738TrnCNom ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09O32_A13735CliCNom ;
   private int[] P09O32_A252CliCod ;
   private String[] P09O32_A279CliNom ;
   private String[] P09O32_A396EmprCod ;
   private int[] P09O33_A11669DevCruId ;
   private String[] P09O33_A396EmprCod ;
   private int[] P09O33_A252CliCod ;
   private String[] P09O34_A13738TrnCNom ;
   private short[] P09O34_A840TrnCod ;
   private boolean[] P09O34_n840TrnCod ;
   private String[] P09O34_A841TrnNom ;
   private boolean[] P09O34_n841TrnNom ;
   private String[] P09O34_A396EmprCod ;
   private int[] P09O35_A11669DevCruId ;
   private String[] P09O35_A396EmprCod ;
   private short[] P09O35_A840TrnCod ;
   private boolean[] P09O35_n840TrnCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class almacentejidodevolucionloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09O32", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom, EmprCod FROM TXPCLIENT ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09O33", "SELECT DevCruId, EmprCod, CliCod FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09O34", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, TrnCod, TrnNom, EmprCod FROM TXPTRANSP ORDER BY TrnCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09O35", "SELECT DevCruId, EmprCod, TrnCod FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

