package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultamaquinasproduccionwwloaddvcombo extends GXProcedure
{
   public consultamaquinasproduccionwwloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultamaquinasproduccionwwloaddvcombo.class ), "" );
   }

   public consultamaquinasproduccionwwloaddvcombo( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      consultamaquinasproduccionwwloaddvcombo.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 )
   {
      consultamaquinasproduccionwwloaddvcombo.this.AV14ComboName = aP0;
      consultamaquinasproduccionwwloaddvcombo.this.AV15TrnMode = aP1;
      consultamaquinasproduccionwwloaddvcombo.this.AV11SearchTxt = aP2;
      consultamaquinasproduccionwwloaddvcombo.this.aP3 = aP3;
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
      AV10MaxItems = 100 ;
      if ( GXutil.strcmp(AV14ComboName, "LecMaqCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LECMAQCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV14ComboName, "LecMaqCod_To") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LECMAQCOD_TO' */
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
      /* 'LOADCOMBOITEMS_LECMAQCOD' Routine */
      returnInSub = false ;
      GXt_char2 = AV24Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      consultamaquinasproduccionwwloaddvcombo.this.GXt_char2 = GXv_char3[0] ;
      AV24Station = GXt_char2 ;
      GXv_char3[0] = AV25EmprCod ;
      GXv_char4[0] = AV26EmprNom ;
      GXv_char5[0] = AV27UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char3, GXv_char4, GXv_char5) ;
      consultamaquinasproduccionwwloaddvcombo.this.AV25EmprCod = GXv_char3[0] ;
      consultamaquinasproduccionwwloaddvcombo.this.AV26EmprNom = GXv_char4[0] ;
      consultamaquinasproduccionwwloaddvcombo.this.AV27UsurCod = GXv_char5[0] ;
      AV12Combo_Data.clear();
      /* Using cursor P09RQ2 */
      pr_default.execute(0, new Object[] {AV25EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09RQ2_A396EmprCod[0] ;
         A1166LecMaqCod = P09RQ2_A1166LecMaqCod[0] ;
         GXt_char2 = AV28MaqDsc ;
         GXv_char5[0] = GXt_char2 ;
         new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, A1166LecMaqCod, GXv_char5) ;
         consultamaquinasproduccionwwloaddvcombo.this.GXt_char2 = GXv_char5[0] ;
         AV28MaqDsc = GXt_char2 ;
         AV13Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV13Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A1166LecMaqCod) );
         AV13Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A1166LecMaqCod), AV28MaqDsc, "", "", "", "", "", "", "") );
         AV12Combo_Data.add(AV13Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV15TrnMode, "GET_DSC") != 0 )
      {
         AV12Combo_Data.sort("Title");
         AV16Combo_DataJson = AV12Combo_Data.toJSonString(false) ;
      }
      else
      {
         AV16Combo_DataJson = AV22LecMaqCodDescription ;
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_LECMAQCOD_TO' Routine */
      returnInSub = false ;
      GXt_char2 = AV24Station ;
      GXv_char5[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      consultamaquinasproduccionwwloaddvcombo.this.GXt_char2 = GXv_char5[0] ;
      AV24Station = GXt_char2 ;
      GXv_char5[0] = AV25EmprCod ;
      GXv_char4[0] = AV26EmprNom ;
      GXv_char3[0] = AV27UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char5, GXv_char4, GXv_char3) ;
      consultamaquinasproduccionwwloaddvcombo.this.AV25EmprCod = GXv_char5[0] ;
      consultamaquinasproduccionwwloaddvcombo.this.AV26EmprNom = GXv_char4[0] ;
      consultamaquinasproduccionwwloaddvcombo.this.AV27UsurCod = GXv_char3[0] ;
      AV12Combo_Data.clear();
      /* Using cursor P09RQ3 */
      pr_default.execute(1, new Object[] {AV25EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P09RQ3_A396EmprCod[0] ;
         A1166LecMaqCod = P09RQ3_A1166LecMaqCod[0] ;
         GXt_char2 = AV28MaqDsc ;
         GXv_char5[0] = GXt_char2 ;
         new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, A1166LecMaqCod, GXv_char5) ;
         consultamaquinasproduccionwwloaddvcombo.this.GXt_char2 = GXv_char5[0] ;
         AV28MaqDsc = GXt_char2 ;
         AV13Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV13Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A1166LecMaqCod) );
         AV13Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A1166LecMaqCod), AV28MaqDsc, "", "", "", "", "", "", "") );
         AV12Combo_Data.add(AV13Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( GXutil.strcmp(AV15TrnMode, "GET_DSC") != 0 )
      {
         AV12Combo_Data.sort("Title");
         AV16Combo_DataJson = AV12Combo_Data.toJSonString(false) ;
      }
      else
      {
         AV16Combo_DataJson = AV23LecMaqCod_ToDescription ;
      }
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultamaquinasproduccionwwloaddvcombo.this.AV16Combo_DataJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Combo_DataJson = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV24Station = "" ;
      AV25EmprCod = "" ;
      AV26EmprNom = "" ;
      AV27UsurCod = "" ;
      AV12Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      scmdbuf = "" ;
      P09RQ2_A396EmprCod = new String[] {""} ;
      P09RQ2_A1166LecMaqCod = new String[] {""} ;
      A396EmprCod = "" ;
      A1166LecMaqCod = "" ;
      AV28MaqDsc = "" ;
      AV13Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV22LecMaqCodDescription = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      P09RQ3_A396EmprCod = new String[] {""} ;
      P09RQ3_A1166LecMaqCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      AV23LecMaqCod_ToDescription = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultamaquinasproduccionwwloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09RQ2_A396EmprCod, P09RQ2_A1166LecMaqCod
            }
            , new Object[] {
            P09RQ3_A396EmprCod, P09RQ3_A1166LecMaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV10MaxItems ;
   private String AV15TrnMode ;
   private String AV24Station ;
   private String AV25EmprCod ;
   private String AV26EmprNom ;
   private String AV27UsurCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A1166LecMaqCod ;
   private String AV28MaqDsc ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private String AV16Combo_DataJson ;
   private String AV14ComboName ;
   private String AV11SearchTxt ;
   private String AV22LecMaqCodDescription ;
   private String AV23LecMaqCod_ToDescription ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P09RQ2_A396EmprCod ;
   private String[] P09RQ2_A1166LecMaqCod ;
   private String[] P09RQ3_A396EmprCod ;
   private String[] P09RQ3_A1166LecMaqCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV12Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV13Combo_DataItem ;
}

final  class consultamaquinasproduccionwwloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09RQ2", "SELECT EmprCod, LecMaqCod FROM TXPLECTOR WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RQ3", "SELECT EmprCod, LecMaqCod FROM TXPLECTOR WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
      }
   }

}

