package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tclienvloaddvcombo extends GXProcedure
{
   public tclienvloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclienvloaddvcombo.class ), "" );
   }

   public tclienvloaddvcombo( int remoteHandle ,
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
      tclienvloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      tclienvloaddvcombo.this.AV12ComboName = aP0;
      tclienvloaddvcombo.this.AV13TrnMode = aP1;
      tclienvloaddvcombo.this.AV14EmprCod = aP2;
      tclienvloaddvcombo.this.AV15CliCod = aP3;
      tclienvloaddvcombo.this.aP4 = aP4;
      tclienvloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "CliEnvPrv") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CLIENVPRV' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "CliEnvTp") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CLIENVTP' */
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
      /* 'LOADCOMBOITEMS_CLIENVPRV' Routine */
      returnInSub = false ;
      /* Using cursor P0A4B2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A781PrvCod = P0A4B2_A781PrvCod[0] ;
         A787PrvDsc = P0A4B2_A787PrvDsc[0] ;
         n787PrvDsc = P0A4B2_n787PrvDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A781PrvCod, 3, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A781PrvCod, 3, 0)), A787PrvDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_CLIENVTP' Routine */
      returnInSub = false ;
      /* Using cursor P0A4B3 */
      pr_default.execute(1, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P0A4B3_A396EmprCod[0] ;
         A840TrnCod = P0A4B3_A840TrnCod[0] ;
         A841TrnNom = P0A4B3_A841TrnNom[0] ;
         n841TrnNom = P0A4B3_n841TrnNom[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A840TrnCod, 4, 0)), A841TrnNom, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV10Combo_Data.sort("Title");
   }

   protected void cleanup( )
   {
      this.aP4[0] = tclienvloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tclienvloaddvcombo.this.AV10Combo_Data;
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
      P0A4B2_A781PrvCod = new short[1] ;
      P0A4B2_A787PrvDsc = new String[] {""} ;
      P0A4B2_n787PrvDsc = new boolean[] {false} ;
      A787PrvDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0A4B3_A396EmprCod = new String[] {""} ;
      P0A4B3_A840TrnCod = new short[1] ;
      P0A4B3_A841TrnNom = new String[] {""} ;
      P0A4B3_n841TrnNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A841TrnNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclienvloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A4B2_A781PrvCod, P0A4B2_A787PrvDsc, P0A4B2_n787PrvDsc
            }
            , new Object[] {
            P0A4B3_A396EmprCod, P0A4B3_A840TrnCod, P0A4B3_A841TrnNom, P0A4B3_n841TrnNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A781PrvCod ;
   private short A840TrnCod ;
   private short Gx_err ;
   private int AV15CliCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A787PrvDsc ;
   private String A396EmprCod ;
   private String A841TrnNom ;
   private boolean returnInSub ;
   private boolean n787PrvDsc ;
   private boolean n841TrnNom ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P0A4B2_A781PrvCod ;
   private String[] P0A4B2_A787PrvDsc ;
   private boolean[] P0A4B2_n787PrvDsc ;
   private String[] P0A4B3_A396EmprCod ;
   private short[] P0A4B3_A840TrnCod ;
   private String[] P0A4B3_A841TrnNom ;
   private boolean[] P0A4B3_n841TrnNom ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tclienvloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A4B2", "SELECT PrvCod, PrvDsc FROM TXPPROVIN ORDER BY PrvCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A4B3", "SELECT EmprCod, TrnCod, TrnNom FROM TXPTRANSP WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

