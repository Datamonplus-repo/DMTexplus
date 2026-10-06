package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class disdefloaddvcombo extends GXProcedure
{
   public disdefloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disdefloaddvcombo.class ), "" );
   }

   public disdefloaddvcombo( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    int aP3 ,
                                                                                    short aP4 ,
                                                                                    String[] aP5 )
   {
      disdefloaddvcombo.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        short aP4 ,
                        String[] aP5 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             short aP4 ,
                             String[] aP5 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 )
   {
      disdefloaddvcombo.this.AV12ComboName = aP0;
      disdefloaddvcombo.this.AV13TrnMode = aP1;
      disdefloaddvcombo.this.AV14EmprCod = aP2;
      disdefloaddvcombo.this.AV15DisCod = aP3;
      disdefloaddvcombo.this.AV16TipDefCod = aP4;
      disdefloaddvcombo.this.aP5 = aP5;
      disdefloaddvcombo.this.aP6 = aP6;
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
      if ( GXutil.strcmp(AV12ComboName, "TipDefCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TIPDEFCOD' */
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
      /* 'LOADCOMBOITEMS_TIPDEFCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09VX2 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09VX2_A396EmprCod[0] ;
         A833TipDefCod = P09VX2_A833TipDefCod[0] ;
         A834TipDefDsc = P09VX2_A834TipDefDsc[0] ;
         n834TipDefDsc = P09VX2_n834TipDefDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A833TipDefCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A833TipDefCod, 4, 0)), A834TipDefDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09VX3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod), Short.valueOf(AV16TipDefCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A833TipDefCod = P09VX3_A833TipDefCod[0] ;
            A361DisCod = P09VX3_A361DisCod[0] ;
            A396EmprCod = P09VX3_A396EmprCod[0] ;
            AV17SelectedValue = ((0==A833TipDefCod) ? "" : GXutil.trim( GXutil.str( A833TipDefCod, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         if ( ! (0==AV16TipDefCod) )
         {
            AV17SelectedValue = GXutil.trim( GXutil.str( AV16TipDefCod, 4, 0)) ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP5[0] = disdefloaddvcombo.this.AV17SelectedValue;
      this.aP6[0] = disdefloaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P09VX2_A396EmprCod = new String[] {""} ;
      P09VX2_A833TipDefCod = new short[1] ;
      P09VX2_A834TipDefDsc = new String[] {""} ;
      P09VX2_n834TipDefDsc = new boolean[] {false} ;
      A396EmprCod = "" ;
      A834TipDefDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09VX3_A833TipDefCod = new short[1] ;
      P09VX3_A361DisCod = new int[1] ;
      P09VX3_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disdefloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09VX2_A396EmprCod, P09VX2_A833TipDefCod, P09VX2_A834TipDefDsc, P09VX2_n834TipDefDsc
            }
            , new Object[] {
            P09VX3_A833TipDefCod, P09VX3_A361DisCod, P09VX3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV16TipDefCod ;
   private short A833TipDefCod ;
   private short Gx_err ;
   private int AV15DisCod ;
   private int A361DisCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A834TipDefDsc ;
   private boolean returnInSub ;
   private boolean n834TipDefDsc ;
   private String AV12ComboName ;
   private String AV17SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P09VX2_A396EmprCod ;
   private short[] P09VX2_A833TipDefCod ;
   private String[] P09VX2_A834TipDefDsc ;
   private boolean[] P09VX2_n834TipDefDsc ;
   private short[] P09VX3_A833TipDefCod ;
   private int[] P09VX3_A361DisCod ;
   private String[] P09VX3_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class disdefloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09VX2", "SELECT EmprCod, TipDefCod, TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09VX3", "SELECT TipDefCod, DisCod, EmprCod FROM TXPDISDEF WHERE EmprCod = ? and DisCod = ? and TipDefCod = ? ORDER BY EmprCod, DisCod, TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

