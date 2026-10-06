package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tgrdtip_lineasloaddvcombo extends GXProcedure
{
   public tgrdtip_lineasloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tgrdtip_lineasloaddvcombo.class ), "" );
   }

   public tgrdtip_lineasloaddvcombo( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    short aP3 ,
                                                                                    String[] aP4 )
   {
      tgrdtip_lineasloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        short aP3 ,
                        String[] aP4 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             short aP3 ,
                             String[] aP4 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      tgrdtip_lineasloaddvcombo.this.AV12ComboName = aP0;
      tgrdtip_lineasloaddvcombo.this.AV13TrnMode = aP1;
      tgrdtip_lineasloaddvcombo.this.AV14EmprCod = aP2;
      tgrdtip_lineasloaddvcombo.this.AV15GrdTipArt = aP3;
      tgrdtip_lineasloaddvcombo.this.aP4 = aP4;
      tgrdtip_lineasloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "TipArtCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TIPARTCOD' */
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
      /* 'LOADCOMBOITEMS_TIPARTCOD' Routine */
      returnInSub = false ;
      /* Using cursor P0A9J2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13788TipArtCodD = P0A9J2_A13788TipArtCodD[0] ;
         A829TipArtCod = P0A9J2_A829TipArtCod[0] ;
         A830TipArtDsc = P0A9J2_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A9J2_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = P0A9J2_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = P0A9J2_n6014TipArtDsc2[0] ;
         A396EmprCod = P0A9J2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13788TipArtCodD );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP4[0] = tgrdtip_lineasloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tgrdtip_lineasloaddvcombo.this.AV10Combo_Data;
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
      P0A9J2_A13788TipArtCodD = new String[] {""} ;
      P0A9J2_A829TipArtCod = new short[1] ;
      P0A9J2_A830TipArtDsc = new String[] {""} ;
      P0A9J2_n830TipArtDsc = new boolean[] {false} ;
      P0A9J2_A6014TipArtDsc2 = new String[] {""} ;
      P0A9J2_n6014TipArtDsc2 = new boolean[] {false} ;
      P0A9J2_A396EmprCod = new String[] {""} ;
      A13788TipArtCodD = "" ;
      A830TipArtDsc = "" ;
      A6014TipArtDsc2 = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tgrdtip_lineasloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A9J2_A13788TipArtCodD, P0A9J2_A829TipArtCod, P0A9J2_A830TipArtDsc, P0A9J2_n830TipArtDsc, P0A9J2_A6014TipArtDsc2, P0A9J2_n6014TipArtDsc2, P0A9J2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV15GrdTipArt ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A830TipArtDsc ;
   private String A6014TipArtDsc2 ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean n830TipArtDsc ;
   private boolean n6014TipArtDsc2 ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13788TipArtCodD ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A9J2_A13788TipArtCodD ;
   private short[] P0A9J2_A829TipArtCod ;
   private String[] P0A9J2_A830TipArtDsc ;
   private boolean[] P0A9J2_n830TipArtDsc ;
   private String[] P0A9J2_A6014TipArtDsc2 ;
   private boolean[] P0A9J2_n6014TipArtDsc2 ;
   private String[] P0A9J2_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tgrdtip_lineasloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A9J2", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, TipArtCod, TipArtDsc, TipArtDsc2, EmprCod FROM TXPTIPART ORDER BY TipArtCodD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
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

