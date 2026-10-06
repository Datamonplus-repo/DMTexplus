package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tarticploaddvcombo extends GXProcedure
{
   public tarticploaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarticploaddvcombo.class ), "" );
   }

   public tarticploaddvcombo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    int aP3 ,
                                                                                    String aP4 ,
                                                                                    String[] aP5 )
   {
      tarticploaddvcombo.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String aP4 ,
                        String[] aP5 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String aP4 ,
                             String[] aP5 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 )
   {
      tarticploaddvcombo.this.AV13ComboName = aP0;
      tarticploaddvcombo.this.AV15TrnMode = aP1;
      tarticploaddvcombo.this.AV17EmprCod = aP2;
      tarticploaddvcombo.this.AV18CliCod = aP3;
      tarticploaddvcombo.this.AV19ArtCod = aP4;
      tarticploaddvcombo.this.aP5 = aP5;
      tarticploaddvcombo.this.aP6 = aP6;
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
      if ( GXutil.strcmp(AV13ComboName, "ProCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PROCOD' */
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
      /* 'LOADCOMBOITEMS_PROCOD' Routine */
      returnInSub = false ;
      if ( 1 == 2 )
      {
         /* Using cursor P09ND2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A13771ProCDsc = P09ND2_A13771ProCDsc[0] ;
            A758ProCod = P09ND2_A758ProCod[0] ;
            A759ProDsc = P09ND2_A759ProDsc[0] ;
            A396EmprCod = P09ND2_A396EmprCod[0] ;
            AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A758ProCod );
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13771ProCDsc );
            AV10Combo_Data.add(AV11Combo_DataItem, 0);
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      /* Using cursor P09ND3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A14284ProEst = P09ND3_A14284ProEst[0] ;
         A13771ProCDsc = P09ND3_A13771ProCDsc[0] ;
         A758ProCod = P09ND3_A758ProCod[0] ;
         A759ProDsc = P09ND3_A759ProDsc[0] ;
         A396EmprCod = P09ND3_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A758ProCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13771ProCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP5[0] = tarticploaddvcombo.this.AV12SelectedValue;
      this.aP6[0] = tarticploaddvcombo.this.AV10Combo_Data;
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
      P09ND2_A13771ProCDsc = new String[] {""} ;
      P09ND2_A758ProCod = new String[] {""} ;
      P09ND2_A759ProDsc = new String[] {""} ;
      P09ND2_A396EmprCod = new String[] {""} ;
      A13771ProCDsc = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09ND3_A14284ProEst = new String[] {""} ;
      P09ND3_A13771ProCDsc = new String[] {""} ;
      P09ND3_A758ProCod = new String[] {""} ;
      P09ND3_A759ProDsc = new String[] {""} ;
      P09ND3_A396EmprCod = new String[] {""} ;
      A14284ProEst = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticploaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09ND2_A13771ProCDsc, P09ND2_A758ProCod, P09ND2_A759ProDsc, P09ND2_A396EmprCod
            }
            , new Object[] {
            P09ND3_A14284ProEst, P09ND3_A13771ProCDsc, P09ND3_A758ProCod, P09ND3_A759ProDsc, P09ND3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV18CliCod ;
   private String AV15TrnMode ;
   private String AV17EmprCod ;
   private String AV19ArtCod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A396EmprCod ;
   private String A14284ProEst ;
   private boolean returnInSub ;
   private String AV13ComboName ;
   private String AV12SelectedValue ;
   private String A13771ProCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P09ND2_A13771ProCDsc ;
   private String[] P09ND2_A758ProCod ;
   private String[] P09ND2_A759ProDsc ;
   private String[] P09ND2_A396EmprCod ;
   private String[] P09ND3_A14284ProEst ;
   private String[] P09ND3_A13771ProCDsc ;
   private String[] P09ND3_A758ProCod ;
   private String[] P09ND3_A759ProDsc ;
   private String[] P09ND3_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tarticploaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ND2", "SELECT RTRIM(LTRIM(ProCod)) || '-' || RTRIM(LTRIM(ProDsc)) AS ProCDsc, ProCod, ProDsc, EmprCod FROM TXPPROCES ORDER BY ProCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ND3", "SELECT ProEst, RTRIM(LTRIM(ProCod)) || '-' || RTRIM(LTRIM(ProDsc)) AS ProCDsc, ProCod, ProDsc, EmprCod FROM TXPPROCES WHERE ProEst = 'A' ORDER BY ProCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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

