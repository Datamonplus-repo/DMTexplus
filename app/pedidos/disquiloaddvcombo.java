package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class disquiloaddvcombo extends GXProcedure
{
   public disquiloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disquiloaddvcombo.class ), "" );
   }

   public disquiloaddvcombo( int remoteHandle ,
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
                                                                                    short aP5 ,
                                                                                    short aP6 ,
                                                                                    String[] aP7 )
   {
      disquiloaddvcombo.this.aP8 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String aP4 ,
                        short aP5 ,
                        short aP6 ,
                        String[] aP7 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String aP4 ,
                             short aP5 ,
                             short aP6 ,
                             String[] aP7 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP8 )
   {
      disquiloaddvcombo.this.AV12ComboName = aP0;
      disquiloaddvcombo.this.AV13TrnMode = aP1;
      disquiloaddvcombo.this.AV14EmprCod = aP2;
      disquiloaddvcombo.this.AV15DisCod = aP3;
      disquiloaddvcombo.this.AV16ProCod = aP4;
      disquiloaddvcombo.this.AV17DisFasLin = aP5;
      disquiloaddvcombo.this.AV18DisQuiLin = aP6;
      disquiloaddvcombo.this.aP7 = aP7;
      disquiloaddvcombo.this.aP8 = aP8;
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
      if ( GXutil.strcmp(AV12ComboName, "ProForCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PROFORCOD' */
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
      /* 'LOADCOMBOITEMS_PROFORCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09W02 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = P09W02_A764ProForCod[0] ;
         A766ProForDsc = P09W02_A766ProForDsc[0] ;
         A396EmprCod = P09W02_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A764ProForCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A764ProForCod), A766ProForDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09W03 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod), AV16ProCod, Short.valueOf(AV17DisFasLin), Short.valueOf(AV18DisQuiLin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5377DisQuiLin = P09W03_A5377DisQuiLin[0] ;
            A368DisFasLin = P09W03_A368DisFasLin[0] ;
            A758ProCod = P09W03_A758ProCod[0] ;
            A361DisCod = P09W03_A361DisCod[0] ;
            A396EmprCod = P09W03_A396EmprCod[0] ;
            A764ProForCod = P09W03_A764ProForCod[0] ;
            AV19SelectedValue = A764ProForCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   protected void cleanup( )
   {
      this.aP7[0] = disquiloaddvcombo.this.AV19SelectedValue;
      this.aP8[0] = disquiloaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P09W02_A764ProForCod = new String[] {""} ;
      P09W02_A766ProForDsc = new String[] {""} ;
      P09W02_A396EmprCod = new String[] {""} ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09W03_A5377DisQuiLin = new short[1] ;
      P09W03_A368DisFasLin = new short[1] ;
      P09W03_A758ProCod = new String[] {""} ;
      P09W03_A361DisCod = new int[1] ;
      P09W03_A396EmprCod = new String[] {""} ;
      P09W03_A764ProForCod = new String[] {""} ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disquiloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09W02_A764ProForCod, P09W02_A766ProForDsc, P09W02_A396EmprCod
            }
            , new Object[] {
            P09W03_A5377DisQuiLin, P09W03_A368DisFasLin, P09W03_A758ProCod, P09W03_A361DisCod, P09W03_A396EmprCod, P09W03_A764ProForCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV17DisFasLin ;
   private short AV18DisQuiLin ;
   private short A5377DisQuiLin ;
   private short A368DisFasLin ;
   private short Gx_err ;
   private int AV15DisCod ;
   private int A361DisCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV16ProCod ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private boolean returnInSub ;
   private String AV12ComboName ;
   private String AV19SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP8 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P09W02_A764ProForCod ;
   private String[] P09W02_A766ProForDsc ;
   private String[] P09W02_A396EmprCod ;
   private short[] P09W03_A5377DisQuiLin ;
   private short[] P09W03_A368DisFasLin ;
   private String[] P09W03_A758ProCod ;
   private int[] P09W03_A361DisCod ;
   private String[] P09W03_A396EmprCod ;
   private String[] P09W03_A764ProForCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class disquiloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09W02", "SELECT ProForCod, ProForDsc, EmprCod FROM TXPCPROFO ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09W03", "SELECT DisQuiLin, DisFasLin, ProCod, DisCod, EmprCod, ProForCod FROM TXPDISQUI WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? and DisQuiLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

