package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tnprovprdloaddvcombo extends GXProcedure
{
   public tnprovprdloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tnprovprdloaddvcombo.class ), "" );
   }

   public tnprovprdloaddvcombo( int remoteHandle ,
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
      tnprovprdloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      tnprovprdloaddvcombo.this.AV12ComboName = aP0;
      tnprovprdloaddvcombo.this.AV13TrnMode = aP1;
      tnprovprdloaddvcombo.this.AV14EmprCod = aP2;
      tnprovprdloaddvcombo.this.AV15PrdNum = aP3;
      tnprovprdloaddvcombo.this.aP4 = aP4;
      tnprovprdloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "PrdPrv") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PRDPRV' */
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
      /* 'LOADCOMBOITEMS_PRDPRV' Routine */
      returnInSub = false ;
      /* Using cursor P09Q32 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14216PrvAct = P09Q32_A14216PrvAct[0] ;
         A13719PrvNNom = P09Q32_A13719PrvNNom[0] ;
         A795PrvNum = P09Q32_A795PrvNum[0] ;
         A794PrvNom = P09Q32_A794PrvNom[0] ;
         n794PrvNom = P09Q32_n794PrvNom[0] ;
         A396EmprCod = P09Q32_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13719PrvNNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP4[0] = tnprovprdloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tnprovprdloaddvcombo.this.AV10Combo_Data;
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
      P09Q32_A14216PrvAct = new String[] {""} ;
      P09Q32_A13719PrvNNom = new String[] {""} ;
      P09Q32_A795PrvNum = new int[1] ;
      P09Q32_A794PrvNom = new String[] {""} ;
      P09Q32_n794PrvNom = new boolean[] {false} ;
      P09Q32_A396EmprCod = new String[] {""} ;
      A14216PrvAct = "" ;
      A13719PrvNNom = "" ;
      A794PrvNom = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tnprovprdloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09Q32_A14216PrvAct, P09Q32_A13719PrvNNom, P09Q32_A795PrvNum, P09Q32_A794PrvNom, P09Q32_n794PrvNom, P09Q32_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A795PrvNum ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV15PrdNum ;
   private String scmdbuf ;
   private String A14216PrvAct ;
   private String A794PrvNom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean n794PrvNom ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13719PrvNNom ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09Q32_A14216PrvAct ;
   private String[] P09Q32_A13719PrvNNom ;
   private int[] P09Q32_A795PrvNum ;
   private String[] P09Q32_A794PrvNom ;
   private boolean[] P09Q32_n794PrvNom ;
   private String[] P09Q32_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tnprovprdloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09Q32", "SELECT PrvAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, PrvNum, PrvNom, EmprCod FROM TXPPRVGEN WHERE PrvAct = 'S' ORDER BY PrvNNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
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

