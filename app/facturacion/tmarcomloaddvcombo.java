package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmarcomloaddvcombo extends GXProcedure
{
   public tmarcomloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmarcomloaddvcombo.class ), "" );
   }

   public tmarcomloaddvcombo( int remoteHandle ,
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
      tmarcomloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      tmarcomloaddvcombo.this.AV12ComboName = aP0;
      tmarcomloaddvcombo.this.AV13TrnMode = aP1;
      tmarcomloaddvcombo.this.AV14EmprCod = aP2;
      tmarcomloaddvcombo.this.AV15Mgen_com = aP3;
      tmarcomloaddvcombo.this.aP4 = aP4;
      tmarcomloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "GrdTipArt") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_GRDTIPART' */
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
      /* 'LOADCOMBOITEMS_GRDTIPART' Routine */
      returnInSub = false ;
      /* Using cursor P0A4Z2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14196ID_GrdTpDs = P0A4Z2_A14196ID_GrdTpDs[0] ;
         A4364GrdTipArt = P0A4Z2_A4364GrdTipArt[0] ;
         A4368GrdTipDsc = P0A4Z2_A4368GrdTipDsc[0] ;
         A396EmprCod = P0A4Z2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A4364GrdTipArt, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A14196ID_GrdTpDs );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP4[0] = tmarcomloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tmarcomloaddvcombo.this.AV10Combo_Data;
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
      P0A4Z2_A14196ID_GrdTpDs = new String[] {""} ;
      P0A4Z2_A4364GrdTipArt = new short[1] ;
      P0A4Z2_A4368GrdTipDsc = new String[] {""} ;
      P0A4Z2_A396EmprCod = new String[] {""} ;
      A14196ID_GrdTpDs = "" ;
      A4368GrdTipDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tmarcomloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A4Z2_A14196ID_GrdTpDs, P0A4Z2_A4364GrdTipArt, P0A4Z2_A4368GrdTipDsc, P0A4Z2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4364GrdTipArt ;
   private short Gx_err ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV15Mgen_com ;
   private String scmdbuf ;
   private String A14196ID_GrdTpDs ;
   private String A4368GrdTipDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A4Z2_A14196ID_GrdTpDs ;
   private short[] P0A4Z2_A4364GrdTipArt ;
   private String[] P0A4Z2_A4368GrdTipDsc ;
   private String[] P0A4Z2_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tmarcomloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A4Z2", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(GrdTipArt,'9990'), 2))) || '-' || RTRIM(LTRIM(GrdTipDsc)) AS ID_GrdTpDs, GrdTipArt, GrdTipDsc, EmprCod FROM TXPGRDTIP ORDER BY ID_GrdTpDs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 35);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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

