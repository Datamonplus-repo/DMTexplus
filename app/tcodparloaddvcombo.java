package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tcodparloaddvcombo extends GXProcedure
{
   public tcodparloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcodparloaddvcombo.class ), "" );
   }

   public tcodparloaddvcombo( int remoteHandle ,
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
      tcodparloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      tcodparloaddvcombo.this.AV12ComboName = aP0;
      tcodparloaddvcombo.this.AV13TrnMode = aP1;
      tcodparloaddvcombo.this.AV14EmprCod = aP2;
      tcodparloaddvcombo.this.AV15ParCod = aP3;
      tcodparloaddvcombo.this.aP4 = aP4;
      tcodparloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "ParTMCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PARTMCOD' */
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
      /* 'LOADCOMBOITEMS_PARTMCOD' Routine */
      returnInSub = false ;
      /* Using cursor P09XW2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13749TMCDsc = P09XW2_A13749TMCDsc[0] ;
         A9430TMCod = P09XW2_A9430TMCod[0] ;
         A9431TMDsc = P09XW2_A9431TMDsc[0] ;
         n9431TMDsc = P09XW2_n9431TMDsc[0] ;
         A396EmprCod = P09XW2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A9430TMCod, 8, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13749TMCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09XW3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Short.valueOf(AV15ParCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A656ParCod = P09XW3_A656ParCod[0] ;
            A396EmprCod = P09XW3_A396EmprCod[0] ;
            A9396ParTMCod = P09XW3_A9396ParTMCod[0] ;
            n9396ParTMCod = P09XW3_n9396ParTMCod[0] ;
            AV16SelectedValue = ((0==A9396ParTMCod) ? "" : GXutil.trim( GXutil.str( A9396ParTMCod, 8, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = tcodparloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tcodparloaddvcombo.this.AV10Combo_Data;
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
      P09XW2_A13749TMCDsc = new String[] {""} ;
      P09XW2_A9430TMCod = new int[1] ;
      P09XW2_A9431TMDsc = new String[] {""} ;
      P09XW2_n9431TMDsc = new boolean[] {false} ;
      P09XW2_A396EmprCod = new String[] {""} ;
      A13749TMCDsc = "" ;
      A9431TMDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09XW3_A656ParCod = new short[1] ;
      P09XW3_A396EmprCod = new String[] {""} ;
      P09XW3_A9396ParTMCod = new int[1] ;
      P09XW3_n9396ParTMCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcodparloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09XW2_A13749TMCDsc, P09XW2_A9430TMCod, P09XW2_A9431TMDsc, P09XW2_n9431TMDsc, P09XW2_A396EmprCod
            }
            , new Object[] {
            P09XW3_A656ParCod, P09XW3_A396EmprCod, P09XW3_A9396ParTMCod, P09XW3_n9396ParTMCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV15ParCod ;
   private short A656ParCod ;
   private short Gx_err ;
   private int A9430TMCod ;
   private int A9396ParTMCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A9431TMDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean n9431TMDsc ;
   private boolean n9396ParTMCod ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13749TMCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09XW2_A13749TMCDsc ;
   private int[] P09XW2_A9430TMCod ;
   private String[] P09XW2_A9431TMDsc ;
   private boolean[] P09XW2_n9431TMDsc ;
   private String[] P09XW2_A396EmprCod ;
   private short[] P09XW3_A656ParCod ;
   private String[] P09XW3_A396EmprCod ;
   private int[] P09XW3_A9396ParTMCod ;
   private boolean[] P09XW3_n9396ParTMCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tcodparloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09XW2", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TMCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TMDsc, ''))) AS TMCDsc, TMCod, TMDsc, EmprCod FROM TXPMTAREA ORDER BY TMCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09XW3", "SELECT ParCod, EmprCod, ParTMCod FROM TXPCODPAR WHERE EmprCod = ? and ParCod = ? ORDER BY EmprCod, ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

