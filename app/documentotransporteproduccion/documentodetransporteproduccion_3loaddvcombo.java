package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_3loaddvcombo extends GXProcedure
{
   public documentodetransporteproduccion_3loaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_3loaddvcombo.class ), "" );
   }

   public documentodetransporteproduccion_3loaddvcombo( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    long aP3 ,
                                                                                    int aP4 ,
                                                                                    byte aP5 ,
                                                                                    String aP6 ,
                                                                                    String[] aP7 )
   {
      documentodetransporteproduccion_3loaddvcombo.this.aP8 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        long aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        String aP6 ,
                        String[] aP7 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             long aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             String aP6 ,
                             String[] aP7 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP8 )
   {
      documentodetransporteproduccion_3loaddvcombo.this.AV12ComboName = aP0;
      documentodetransporteproduccion_3loaddvcombo.this.AV13TrnMode = aP1;
      documentodetransporteproduccion_3loaddvcombo.this.AV14EmprCod = aP2;
      documentodetransporteproduccion_3loaddvcombo.this.AV15AlbProCod = aP3;
      documentodetransporteproduccion_3loaddvcombo.this.AV16BarCod = aP4;
      documentodetransporteproduccion_3loaddvcombo.this.AV17BarCodReo = aP5;
      documentodetransporteproduccion_3loaddvcombo.this.AV18BarCodPar = aP6;
      documentodetransporteproduccion_3loaddvcombo.this.aP7 = aP7;
      documentodetransporteproduccion_3loaddvcombo.this.aP8 = aP8;
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
      if ( GXutil.strcmp(AV12ComboName, "TubCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TUBCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "PlasCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PLASCOD' */
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
      /* 'LOADCOMBOITEMS_TUBCOD' Routine */
      returnInSub = false ;
      /* Using cursor P0A702 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13813TubNomID = P0A702_A13813TubNomID[0] ;
         A1207TubNom = P0A702_A1207TubNom[0] ;
         n1207TubNom = P0A702_n1207TubNom[0] ;
         A1206TubCod = P0A702_A1206TubCod[0] ;
         n1206TubCod = P0A702_n1206TubCod[0] ;
         A396EmprCod = P0A702_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A1206TubCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13813TubNomID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A703 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P0A703_A130BarCodPar[0] ;
            A132BarCodReo = P0A703_A132BarCodReo[0] ;
            A129BarCod = P0A703_A129BarCod[0] ;
            A30AlbProCod = P0A703_A30AlbProCod[0] ;
            A396EmprCod = P0A703_A396EmprCod[0] ;
            A1206TubCod = P0A703_A1206TubCod[0] ;
            n1206TubCod = P0A703_n1206TubCod[0] ;
            AV19SelectedValue = ((0==A1206TubCod) ? "" : GXutil.trim( GXutil.str( A1206TubCod, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_PLASCOD' Routine */
      returnInSub = false ;
      /* Using cursor P0A704 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14285PlasNomID = P0A704_A14285PlasNomID[0] ;
         A6466PlasCod = P0A704_A6466PlasCod[0] ;
         n6466PlasCod = P0A704_n6466PlasCod[0] ;
         A6474PlasNom = P0A704_A6474PlasNom[0] ;
         n6474PlasNom = P0A704_n6474PlasNom[0] ;
         A396EmprCod = P0A704_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A6466PlasCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A14285PlasNomID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A705 */
         pr_default.execute(3, new Object[] {AV14EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A130BarCodPar = P0A705_A130BarCodPar[0] ;
            A132BarCodReo = P0A705_A132BarCodReo[0] ;
            A129BarCod = P0A705_A129BarCod[0] ;
            A30AlbProCod = P0A705_A30AlbProCod[0] ;
            A396EmprCod = P0A705_A396EmprCod[0] ;
            A6466PlasCod = P0A705_A6466PlasCod[0] ;
            n6466PlasCod = P0A705_n6466PlasCod[0] ;
            AV19SelectedValue = ((0==A6466PlasCod) ? "" : GXutil.trim( GXutil.str( A6466PlasCod, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   protected void cleanup( )
   {
      this.aP7[0] = documentodetransporteproduccion_3loaddvcombo.this.AV19SelectedValue;
      this.aP8[0] = documentodetransporteproduccion_3loaddvcombo.this.AV10Combo_Data;
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
      P0A702_A13813TubNomID = new String[] {""} ;
      P0A702_A1207TubNom = new String[] {""} ;
      P0A702_n1207TubNom = new boolean[] {false} ;
      P0A702_A1206TubCod = new short[1] ;
      P0A702_n1206TubCod = new boolean[] {false} ;
      P0A702_A396EmprCod = new String[] {""} ;
      A13813TubNomID = "" ;
      A1207TubNom = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0A703_A130BarCodPar = new String[] {""} ;
      P0A703_A132BarCodReo = new byte[1] ;
      P0A703_A129BarCod = new int[1] ;
      P0A703_A30AlbProCod = new long[1] ;
      P0A703_A396EmprCod = new String[] {""} ;
      P0A703_A1206TubCod = new short[1] ;
      P0A703_n1206TubCod = new boolean[] {false} ;
      A130BarCodPar = "" ;
      P0A704_A14285PlasNomID = new String[] {""} ;
      P0A704_A6466PlasCod = new short[1] ;
      P0A704_n6466PlasCod = new boolean[] {false} ;
      P0A704_A6474PlasNom = new String[] {""} ;
      P0A704_n6474PlasNom = new boolean[] {false} ;
      P0A704_A396EmprCod = new String[] {""} ;
      A14285PlasNomID = "" ;
      A6474PlasNom = "" ;
      P0A705_A130BarCodPar = new String[] {""} ;
      P0A705_A132BarCodReo = new byte[1] ;
      P0A705_A129BarCod = new int[1] ;
      P0A705_A30AlbProCod = new long[1] ;
      P0A705_A396EmprCod = new String[] {""} ;
      P0A705_A6466PlasCod = new short[1] ;
      P0A705_n6466PlasCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_3loaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A702_A13813TubNomID, P0A702_A1207TubNom, P0A702_n1207TubNom, P0A702_A1206TubCod, P0A702_A396EmprCod
            }
            , new Object[] {
            P0A703_A130BarCodPar, P0A703_A132BarCodReo, P0A703_A129BarCod, P0A703_A30AlbProCod, P0A703_A396EmprCod, P0A703_A1206TubCod, P0A703_n1206TubCod
            }
            , new Object[] {
            P0A704_A14285PlasNomID, P0A704_A6466PlasCod, P0A704_A6474PlasNom, P0A704_n6474PlasNom, P0A704_A396EmprCod
            }
            , new Object[] {
            P0A705_A130BarCodPar, P0A705_A132BarCodReo, P0A705_A129BarCod, P0A705_A30AlbProCod, P0A705_A396EmprCod, P0A705_A6466PlasCod, P0A705_n6466PlasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte A132BarCodReo ;
   private short A1206TubCod ;
   private short A6466PlasCod ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private long AV15AlbProCod ;
   private long A30AlbProCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV18BarCodPar ;
   private String scmdbuf ;
   private String A1207TubNom ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A14285PlasNomID ;
   private String A6474PlasNom ;
   private boolean returnInSub ;
   private boolean n1207TubNom ;
   private boolean n1206TubCod ;
   private boolean n6466PlasCod ;
   private boolean n6474PlasNom ;
   private String AV12ComboName ;
   private String AV19SelectedValue ;
   private String A13813TubNomID ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP8 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A702_A13813TubNomID ;
   private String[] P0A702_A1207TubNom ;
   private boolean[] P0A702_n1207TubNom ;
   private short[] P0A702_A1206TubCod ;
   private boolean[] P0A702_n1206TubCod ;
   private String[] P0A702_A396EmprCod ;
   private String[] P0A703_A130BarCodPar ;
   private byte[] P0A703_A132BarCodReo ;
   private int[] P0A703_A129BarCod ;
   private long[] P0A703_A30AlbProCod ;
   private String[] P0A703_A396EmprCod ;
   private short[] P0A703_A1206TubCod ;
   private boolean[] P0A703_n1206TubCod ;
   private String[] P0A704_A14285PlasNomID ;
   private short[] P0A704_A6466PlasCod ;
   private boolean[] P0A704_n6466PlasCod ;
   private String[] P0A704_A6474PlasNom ;
   private boolean[] P0A704_n6474PlasNom ;
   private String[] P0A704_A396EmprCod ;
   private String[] P0A705_A130BarCodPar ;
   private byte[] P0A705_A132BarCodReo ;
   private int[] P0A705_A129BarCod ;
   private long[] P0A705_A30AlbProCod ;
   private String[] P0A705_A396EmprCod ;
   private short[] P0A705_A6466PlasCod ;
   private boolean[] P0A705_n6466PlasCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class documentodetransporteproduccion_3loaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A702", "SELECT RTRIM(LTRIM(COALESCE( TubNom, ''))) || '(' || RTRIM(LTRIM(SUBSTR(TO_CHAR(TubCod,'9990'), 2))) || ')' AS TubNomID, TubNom, TubCod, EmprCod FROM TXPTUBOS ORDER BY TubNomID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A703", "SELECT BarCodPar, BarCodReo, BarCod, AlbProCod, EmprCod, TubCod FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A704", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PlasCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PlasNom, ''))) AS PlasNomID, PlasCod, PlasNom, EmprCod FROM TXPPLASTI ORDER BY PlasNomID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A705", "SELECT BarCodPar, BarCodReo, BarCod, AlbProCod, EmprCod, PlasCod FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

