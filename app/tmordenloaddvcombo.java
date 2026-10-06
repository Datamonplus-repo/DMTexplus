package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmordenloaddvcombo extends GXProcedure
{
   public tmordenloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordenloaddvcombo.class ), "" );
   }

   public tmordenloaddvcombo( int remoteHandle ,
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
      tmordenloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      tmordenloaddvcombo.this.AV12ComboName = aP0;
      tmordenloaddvcombo.this.AV13TrnMode = aP1;
      tmordenloaddvcombo.this.AV14EmprCod = aP2;
      tmordenloaddvcombo.this.AV15OMCod = aP3;
      tmordenloaddvcombo.this.aP4 = aP4;
      tmordenloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "OMMaqCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_OMMAQCOD' */
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
      /* 'LOADCOMBOITEMS_OMMAQCOD' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         AV10Combo_Data.sort("Title");
         if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
         {
            /* Using cursor P0A632 */
            pr_default.execute(0, new Object[] {AV14EmprCod, Integer.valueOf(AV15OMCod)});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A9425OMCod = P0A632_A9425OMCod[0] ;
               A396EmprCod = P0A632_A396EmprCod[0] ;
               A9426OMMaqCod = P0A632_A9426OMMaqCod[0] ;
               AV16SelectedValue = A9426OMMaqCod ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
         }
      }
      GXt_char2 = AV19Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      tmordenloaddvcombo.this.GXt_char2 = GXv_char3[0] ;
      AV19Station = GXt_char2 ;
      GXv_char3[0] = AV14EmprCod ;
      GXv_char4[0] = AV20EmprNom ;
      GXv_char5[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char3, GXv_char4, GXv_char5) ;
      tmordenloaddvcombo.this.AV14EmprCod = GXv_char3[0] ;
      tmordenloaddvcombo.this.AV20EmprNom = GXv_char4[0] ;
      tmordenloaddvcombo.this.AV21UsurCod = GXv_char5[0] ;
      AV10Combo_Data.sort("Title");
      AV10Combo_Data.clear();
      /* Using cursor P0A633 */
      pr_default.execute(1, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A607MaqEst = P0A633_A607MaqEst[0] ;
         n607MaqEst = P0A633_n607MaqEst[0] ;
         A396EmprCod = P0A633_A396EmprCod[0] ;
         A606MaqDsc = P0A633_A606MaqDsc[0] ;
         n606MaqDsc = P0A633_n606MaqDsc[0] ;
         A602MaqCod = P0A633_A602MaqCod[0] ;
         if ( GXutil.strcmp(A607MaqEst, httpContext.getMessage( "A", "")) == 0 )
         {
            AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A602MaqCod) );
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A602MaqCod), A606MaqDsc, "", "", "", "", "", "", "") );
            AV10Combo_Data.add(AV11Combo_DataItem, 0);
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P0A634 */
      pr_default.execute(2, new Object[] {AV14EmprCod, Integer.valueOf(AV15OMCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A9426OMMaqCod = P0A634_A9426OMMaqCod[0] ;
         A9425OMCod = P0A634_A9425OMCod[0] ;
         A396EmprCod = P0A634_A396EmprCod[0] ;
         AV16SelectedValue = ((GXutil.strcmp("", A9426OMMaqCod)==0) ? "" : GXutil.trim( A9426OMMaqCod)) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP4[0] = tmordenloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tmordenloaddvcombo.this.AV10Combo_Data;
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
      P0A632_A9425OMCod = new int[1] ;
      P0A632_A396EmprCod = new String[] {""} ;
      P0A632_A9426OMMaqCod = new String[] {""} ;
      A396EmprCod = "" ;
      A9426OMMaqCod = "" ;
      AV19Station = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV20EmprNom = "" ;
      GXv_char4 = new String[1] ;
      AV21UsurCod = "" ;
      GXv_char5 = new String[1] ;
      P0A633_A607MaqEst = new String[] {""} ;
      P0A633_n607MaqEst = new boolean[] {false} ;
      P0A633_A396EmprCod = new String[] {""} ;
      P0A633_A606MaqDsc = new String[] {""} ;
      P0A633_n606MaqDsc = new boolean[] {false} ;
      P0A633_A602MaqCod = new String[] {""} ;
      A607MaqEst = "" ;
      A606MaqDsc = "" ;
      A602MaqCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0A634_A9426OMMaqCod = new String[] {""} ;
      P0A634_A9425OMCod = new int[1] ;
      P0A634_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmordenloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A632_A9425OMCod, P0A632_A396EmprCod, P0A632_A9426OMMaqCod
            }
            , new Object[] {
            P0A633_A607MaqEst, P0A633_n607MaqEst, P0A633_A396EmprCod, P0A633_A606MaqDsc, P0A633_n606MaqDsc, P0A633_A602MaqCod
            }
            , new Object[] {
            P0A634_A9426OMMaqCod, P0A634_A9425OMCod, P0A634_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV15OMCod ;
   private int A9425OMCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A9426OMMaqCod ;
   private String AV19Station ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV20EmprNom ;
   private String GXv_char4[] ;
   private String AV21UsurCod ;
   private String GXv_char5[] ;
   private String A607MaqEst ;
   private String A606MaqDsc ;
   private String A602MaqCod ;
   private boolean returnInSub ;
   private boolean n607MaqEst ;
   private boolean n606MaqDsc ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P0A632_A9425OMCod ;
   private String[] P0A632_A396EmprCod ;
   private String[] P0A632_A9426OMMaqCod ;
   private String[] P0A633_A607MaqEst ;
   private boolean[] P0A633_n607MaqEst ;
   private String[] P0A633_A396EmprCod ;
   private String[] P0A633_A606MaqDsc ;
   private boolean[] P0A633_n606MaqDsc ;
   private String[] P0A633_A602MaqCod ;
   private String[] P0A634_A9426OMMaqCod ;
   private int[] P0A634_A9425OMCod ;
   private String[] P0A634_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tmordenloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A632", "SELECT OMCod, EmprCod, OMMaqCod FROM TXPMORDEN WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A633", "SELECT MaqEst, EmprCod, MaqDsc, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A634", "SELECT OMMaqCod, OMCod, EmprCod FROM TXPMORDEN WHERE (EmprCod = ? and OMCod = ?) AND (Not (rtrim(OMMaqCod) IS NULL AND NOT(OMMaqCod IS NULL))) ORDER BY EmprCod, OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
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

