package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class disnormloaddvcombo extends GXProcedure
{
   public disnormloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disnormloaddvcombo.class ), "" );
   }

   public disnormloaddvcombo( int remoteHandle ,
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
      disnormloaddvcombo.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      disnormloaddvcombo.this.AV12ComboName = aP0;
      disnormloaddvcombo.this.AV13TrnMode = aP1;
      disnormloaddvcombo.this.AV14EmprCod = aP2;
      disnormloaddvcombo.this.AV15DisCod = aP3;
      disnormloaddvcombo.this.AV16DisNormID = aP4;
      disnormloaddvcombo.this.aP5 = aP5;
      disnormloaddvcombo.this.aP6 = aP6;
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
      if ( GXutil.strcmp(AV12ComboName, "DisNormID") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_DISNORMID' */
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
      /* 'LOADCOMBOITEMS_DISNORMID' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09VU2 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09VU2_A396EmprCod[0] ;
         A13217NormaID = P09VU2_A13217NormaID[0] ;
         A13218NormaDsc = P09VU2_A13218NormaDsc[0] ;
         n13218NormaDsc = P09VU2_n13218NormaDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A13217NormaID );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A13217NormaID), A13218NormaDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09VU3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod), AV16DisNormID});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A13213DisNormID = P09VU3_A13213DisNormID[0] ;
            A361DisCod = P09VU3_A361DisCod[0] ;
            A396EmprCod = P09VU3_A396EmprCod[0] ;
            AV17SelectedValue = A13213DisNormID ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV16DisNormID)==0) )
         {
            AV17SelectedValue = AV16DisNormID ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP5[0] = disnormloaddvcombo.this.AV17SelectedValue;
      this.aP6[0] = disnormloaddvcombo.this.AV10Combo_Data;
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
      P09VU2_A396EmprCod = new String[] {""} ;
      P09VU2_A13217NormaID = new String[] {""} ;
      P09VU2_A13218NormaDsc = new String[] {""} ;
      P09VU2_n13218NormaDsc = new boolean[] {false} ;
      A396EmprCod = "" ;
      A13217NormaID = "" ;
      A13218NormaDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09VU3_A13213DisNormID = new String[] {""} ;
      P09VU3_A361DisCod = new int[1] ;
      P09VU3_A396EmprCod = new String[] {""} ;
      A13213DisNormID = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disnormloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09VU2_A396EmprCod, P09VU2_A13217NormaID, P09VU2_A13218NormaDsc, P09VU2_n13218NormaDsc
            }
            , new Object[] {
            P09VU3_A13213DisNormID, P09VU3_A361DisCod, P09VU3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV15DisCod ;
   private int A361DisCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV16DisNormID ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A13217NormaID ;
   private String A13218NormaDsc ;
   private String A13213DisNormID ;
   private boolean returnInSub ;
   private boolean n13218NormaDsc ;
   private String AV12ComboName ;
   private String AV17SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P09VU2_A396EmprCod ;
   private String[] P09VU2_A13217NormaID ;
   private String[] P09VU2_A13218NormaDsc ;
   private boolean[] P09VU2_n13218NormaDsc ;
   private String[] P09VU3_A13213DisNormID ;
   private int[] P09VU3_A361DisCod ;
   private String[] P09VU3_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class disnormloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09VU2", "SELECT EmprCod, NormaID, NormaDsc FROM TXPNORMAS WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09VU3", "SELECT DisNormID, DisCod, EmprCod FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? and DisNormID = ? ORDER BY EmprCod, DisCod, DisNormID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
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
               stmt.setString(3, (String)parms[2], 4);
               return;
      }
   }

}

