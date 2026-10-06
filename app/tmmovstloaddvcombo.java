package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmmovstloaddvcombo extends GXProcedure
{
   public tmmovstloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmmovstloaddvcombo.class ), "" );
   }

   public tmmovstloaddvcombo( int remoteHandle ,
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
      tmmovstloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      tmmovstloaddvcombo.this.AV12ComboName = aP0;
      tmmovstloaddvcombo.this.AV13TrnMode = aP1;
      tmmovstloaddvcombo.this.AV14EmprCod = aP2;
      tmmovstloaddvcombo.this.AV15MMSCod = aP3;
      tmmovstloaddvcombo.this.aP4 = aP4;
      tmmovstloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "MMSRCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_MMSRCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "MMSPrvNum") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_MMSPRVNUM' */
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
      /* 'LOADCOMBOITEMS_MMSRCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0AQS2 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AQS2_A396EmprCod[0] ;
         A9493MRNom = P0AQS2_A9493MRNom[0] ;
         n9493MRNom = P0AQS2_n9493MRNom[0] ;
         A9492MRCod = P0AQS2_A9492MRCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A9492MRCod, 8, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9"))+"-"+GXutil.trim( A9493MRNom) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_MMSPRVNUM' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0AQS3 */
      pr_default.execute(1, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A14216PrvAct = P0AQS3_A14216PrvAct[0] ;
         A396EmprCod = P0AQS3_A396EmprCod[0] ;
         A794PrvNom = P0AQS3_A794PrvNom[0] ;
         n794PrvNom = P0AQS3_n794PrvNom[0] ;
         A795PrvNum = P0AQS3_A795PrvNum[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))+"-"+GXutil.trim( A794PrvNom) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0AQS4 */
         pr_default.execute(2, new Object[] {AV14EmprCod, Integer.valueOf(AV15MMSCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A9412MMSCod = P0AQS4_A9412MMSCod[0] ;
            A396EmprCod = P0AQS4_A396EmprCod[0] ;
            A9414MMSPrvNum = P0AQS4_A9414MMSPrvNum[0] ;
            n9414MMSPrvNum = P0AQS4_n9414MMSPrvNum[0] ;
            AV16SelectedValue = ((0==A9414MMSPrvNum) ? "" : GXutil.trim( GXutil.str( A9414MMSPrvNum, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = tmmovstloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tmmovstloaddvcombo.this.AV10Combo_Data;
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
      P0AQS2_A396EmprCod = new String[] {""} ;
      P0AQS2_A9493MRNom = new String[] {""} ;
      P0AQS2_n9493MRNom = new boolean[] {false} ;
      P0AQS2_A9492MRCod = new int[1] ;
      A396EmprCod = "" ;
      A9493MRNom = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0AQS3_A14216PrvAct = new String[] {""} ;
      P0AQS3_A396EmprCod = new String[] {""} ;
      P0AQS3_A794PrvNom = new String[] {""} ;
      P0AQS3_n794PrvNom = new boolean[] {false} ;
      P0AQS3_A795PrvNum = new int[1] ;
      A14216PrvAct = "" ;
      A794PrvNom = "" ;
      P0AQS4_A9412MMSCod = new int[1] ;
      P0AQS4_A396EmprCod = new String[] {""} ;
      P0AQS4_A9414MMSPrvNum = new int[1] ;
      P0AQS4_n9414MMSPrvNum = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmmovstloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0AQS2_A396EmprCod, P0AQS2_A9493MRNom, P0AQS2_n9493MRNom, P0AQS2_A9492MRCod
            }
            , new Object[] {
            P0AQS3_A14216PrvAct, P0AQS3_A396EmprCod, P0AQS3_A794PrvNom, P0AQS3_n794PrvNom, P0AQS3_A795PrvNum
            }
            , new Object[] {
            P0AQS4_A9412MMSCod, P0AQS4_A396EmprCod, P0AQS4_A9414MMSPrvNum, P0AQS4_n9414MMSPrvNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV15MMSCod ;
   private int A9492MRCod ;
   private int A795PrvNum ;
   private int A9412MMSCod ;
   private int A9414MMSPrvNum ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A9493MRNom ;
   private String A14216PrvAct ;
   private String A794PrvNom ;
   private boolean returnInSub ;
   private boolean n9493MRNom ;
   private boolean n794PrvNom ;
   private boolean n9414MMSPrvNum ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQS2_A396EmprCod ;
   private String[] P0AQS2_A9493MRNom ;
   private boolean[] P0AQS2_n9493MRNom ;
   private int[] P0AQS2_A9492MRCod ;
   private String[] P0AQS3_A14216PrvAct ;
   private String[] P0AQS3_A396EmprCod ;
   private String[] P0AQS3_A794PrvNom ;
   private boolean[] P0AQS3_n794PrvNom ;
   private int[] P0AQS3_A795PrvNum ;
   private int[] P0AQS4_A9412MMSCod ;
   private String[] P0AQS4_A396EmprCod ;
   private int[] P0AQS4_A9414MMSPrvNum ;
   private boolean[] P0AQS4_n9414MMSPrvNum ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tmmovstloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQS2", "SELECT EmprCod, MRNom, MRCod FROM TXPMREPUE WHERE EmprCod = ? ORDER BY EmprCod, MRCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQS3", "SELECT PrvAct, EmprCod, PrvNom, PrvNum FROM TXPPRVGEN WHERE (EmprCod = ?) AND (PrvAct = 'S') ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQS4", "SELECT MMSCod, EmprCod, MMSPrvNum FROM TXPMMoStk WHERE EmprCod = ? and MMSCod = ? ORDER BY EmprCod, MMSCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

