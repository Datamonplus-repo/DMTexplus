package app.documentotransportecomercial ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_lineas_trnloaddvcombo extends GXProcedure
{
   public documentotransportecomercial_lineas_trnloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_lineas_trnloaddvcombo.class ), "" );
   }

   public documentotransportecomercial_lineas_trnloaddvcombo( int remoteHandle ,
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
      documentotransportecomercial_lineas_trnloaddvcombo.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      documentotransportecomercial_lineas_trnloaddvcombo.this.AV12ComboName = aP0;
      documentotransportecomercial_lineas_trnloaddvcombo.this.AV13TrnMode = aP1;
      documentotransportecomercial_lineas_trnloaddvcombo.this.AV14EmprCod = aP2;
      documentotransportecomercial_lineas_trnloaddvcombo.this.AV15AlbComCod = aP3;
      documentotransportecomercial_lineas_trnloaddvcombo.this.AV16AlbComLin = aP4;
      documentotransportecomercial_lineas_trnloaddvcombo.this.aP5 = aP5;
      documentotransportecomercial_lineas_trnloaddvcombo.this.aP6 = aP6;
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
      if ( GXutil.strcmp(AV12ComboName, "AlbComUni") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_ALBCOMUNI' */
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
      /* 'LOADCOMBOITEMS_ALBCOMUNI' Routine */
      returnInSub = false ;
      /* Using cursor P0A8R2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13772UnidCDsc = P0A8R2_A13772UnidCDsc[0] ;
         A848UniCod = P0A8R2_A848UniCod[0] ;
         A849UniDsc = P0A8R2_A849UniDsc[0] ;
         n849UniDsc = P0A8R2_n849UniDsc[0] ;
         A396EmprCod = P0A8R2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A848UniCod, 1, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13772UnidCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A8R3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15AlbComCod), Short.valueOf(AV16AlbComLin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A20AlbComLin = P0A8R3_A20AlbComLin[0] ;
            A14AlbComCod = P0A8R3_A14AlbComCod[0] ;
            A396EmprCod = P0A8R3_A396EmprCod[0] ;
            A4717AlbComUni = P0A8R3_A4717AlbComUni[0] ;
            AV17SelectedValue = ((0==A4717AlbComUni) ? "" : GXutil.trim( GXutil.str( A4717AlbComUni, 1, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   protected void cleanup( )
   {
      this.aP5[0] = documentotransportecomercial_lineas_trnloaddvcombo.this.AV17SelectedValue;
      this.aP6[0] = documentotransportecomercial_lineas_trnloaddvcombo.this.AV10Combo_Data;
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
      P0A8R2_A13772UnidCDsc = new String[] {""} ;
      P0A8R2_A848UniCod = new byte[1] ;
      P0A8R2_A849UniDsc = new String[] {""} ;
      P0A8R2_n849UniDsc = new boolean[] {false} ;
      P0A8R2_A396EmprCod = new String[] {""} ;
      A13772UnidCDsc = "" ;
      A849UniDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0A8R3_A20AlbComLin = new short[1] ;
      P0A8R3_A14AlbComCod = new int[1] ;
      P0A8R3_A396EmprCod = new String[] {""} ;
      P0A8R3_A4717AlbComUni = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_lineas_trnloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A8R2_A13772UnidCDsc, P0A8R2_A848UniCod, P0A8R2_A849UniDsc, P0A8R2_n849UniDsc, P0A8R2_A396EmprCod
            }
            , new Object[] {
            P0A8R3_A20AlbComLin, P0A8R3_A14AlbComCod, P0A8R3_A396EmprCod, P0A8R3_A4717AlbComUni
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A848UniCod ;
   private byte A4717AlbComUni ;
   private short AV16AlbComLin ;
   private short A20AlbComLin ;
   private short Gx_err ;
   private int AV15AlbComCod ;
   private int A14AlbComCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A849UniDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean n849UniDsc ;
   private String AV12ComboName ;
   private String AV17SelectedValue ;
   private String A13772UnidCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A8R2_A13772UnidCDsc ;
   private byte[] P0A8R2_A848UniCod ;
   private String[] P0A8R2_A849UniDsc ;
   private boolean[] P0A8R2_n849UniDsc ;
   private String[] P0A8R2_A396EmprCod ;
   private short[] P0A8R3_A20AlbComLin ;
   private int[] P0A8R3_A14AlbComCod ;
   private String[] P0A8R3_A396EmprCod ;
   private byte[] P0A8R3_A4717AlbComUni ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class documentotransportecomercial_lineas_trnloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A8R2", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(UniCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( UniDsc, ''))) AS UnidCDsc, UniCod, UniDsc, EmprCod FROM TXPTIPUNI ORDER BY UnidCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8R3", "SELECT AlbComLin, AlbComCod, EmprCod, AlbComUni FROM TXPLALCOM WHERE EmprCod = ? and AlbComCod = ? and AlbComLin = ? ORDER BY EmprCod, AlbComCod, AlbComLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

