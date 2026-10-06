package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class lanyad_sdt_cargasdt extends GXProcedure
{
   public lanyad_sdt_cargasdt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lanyad_sdt_cargasdt.class ), "" );
   }

   public lanyad_sdt_cargasdt( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 )
   {
      lanyad_sdt_cargasdt.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             String[] aP5 )
   {
      lanyad_sdt_cargasdt.this.AV13EmprCod = aP0;
      lanyad_sdt_cargasdt.this.AV10BarCod = aP1;
      lanyad_sdt_cargasdt.this.AV12BarCodReo = aP2;
      lanyad_sdt_cargasdt.this.AV11BarCodPar = aP3;
      lanyad_sdt_cargasdt.this.AV19RecLinMAL = aP4;
      lanyad_sdt_cargasdt.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14LANYAD_SDT.clear();
      AV18lastPrdnum = "" ;
      AV8PrdCFin = DecimalUtil.ZERO ;
      AV22GXLvl5 = (byte)(0) ;
      /* Using cursor P0AQO2 */
      pr_default.execute(0, new Object[] {AV13EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV12BarCodReo), AV11BarCodPar, Short.valueOf(AV19RecLinMAL)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AQO2_A396EmprCod[0] ;
         A129BarCod = P0AQO2_A129BarCod[0] ;
         A132BarCodReo = P0AQO2_A132BarCodReo[0] ;
         A130BarCodPar = P0AQO2_A130BarCodPar[0] ;
         A2808RecLinMAL = P0AQO2_A2808RecLinMAL[0] ;
         A1378PrdCFin = P0AQO2_A1378PrdCFin[0] ;
         n1378PrdCFin = P0AQO2_n1378PrdCFin[0] ;
         A5807LanyLote = P0AQO2_A5807LanyLote[0] ;
         n5807LanyLote = P0AQO2_n5807LanyLote[0] ;
         A718PrdNom = P0AQO2_A718PrdNom[0] ;
         A719PrdNum = P0AQO2_A719PrdNum[0] ;
         A1377RecNumAny = P0AQO2_A1377RecNumAny[0] ;
         A718PrdNom = P0AQO2_A718PrdNom[0] ;
         AV22GXLvl5 = (byte)(1) ;
         if ( ( GXutil.strcmp(A719PrdNum, AV18lastPrdnum) != 0 ) && ! (GXutil.strcmp("", AV18lastPrdnum)==0) )
         {
            AV16LANYAD_SDTItem = (app.formulaciontinte.SdtLANYAD_SDT_LANYAD_SDTItem)new app.formulaciontinte.SdtLANYAD_SDT_LANYAD_SDTItem(remoteHandle, context);
            AV16LANYAD_SDTItem.setgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnum( AV18lastPrdnum );
            AV16LANYAD_SDTItem.setgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnom( AV9Prdnom );
            AV16LANYAD_SDTItem.setgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdcfin( AV8PrdCFin );
            AV16LANYAD_SDTItem.setgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Lote( AV17lastLanyLote );
            AV14LANYAD_SDT.add(AV16LANYAD_SDTItem, 0);
            AV8PrdCFin = DecimalUtil.doubleToDec(0) ;
         }
         AV8PrdCFin = AV8PrdCFin.add(A1378PrdCFin) ;
         AV18lastPrdnum = A719PrdNum ;
         AV17lastLanyLote = A5807LanyLote ;
         AV9Prdnom = A718PrdNom ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV22GXLvl5 == 0 )
      {
         System.out.println( httpContext.getMessage( "NO hay datos", "") );
      }
      if ( ! (GXutil.strcmp("", AV18lastPrdnum)==0) )
      {
         AV16LANYAD_SDTItem = (app.formulaciontinte.SdtLANYAD_SDT_LANYAD_SDTItem)new app.formulaciontinte.SdtLANYAD_SDT_LANYAD_SDTItem(remoteHandle, context);
         AV16LANYAD_SDTItem.setgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnum( AV18lastPrdnum );
         AV16LANYAD_SDTItem.setgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnom( AV9Prdnom );
         AV16LANYAD_SDTItem.setgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdcfin( AV8PrdCFin );
         AV16LANYAD_SDTItem.setgxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Lote( AV17lastLanyLote );
         AV14LANYAD_SDT.add(AV16LANYAD_SDTItem, 0);
      }
      AV15LANYAD_SDT_json = AV14LANYAD_SDT.toJSonString(false) ;
      System.out.println( httpContext.getMessage( "&LANYAD_SDT_json=", "")+AV15LANYAD_SDT_json );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = lanyad_sdt_cargasdt.this.AV15LANYAD_SDT_json;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15LANYAD_SDT_json = "" ;
      AV14LANYAD_SDT = new GXBaseCollection<app.formulaciontinte.SdtLANYAD_SDT_LANYAD_SDTItem>(app.formulaciontinte.SdtLANYAD_SDT_LANYAD_SDTItem.class, "LANYAD_SDTItem", "TexplusNET", remoteHandle);
      AV18lastPrdnum = "" ;
      AV8PrdCFin = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AQO2_A396EmprCod = new String[] {""} ;
      P0AQO2_A129BarCod = new int[1] ;
      P0AQO2_A132BarCodReo = new byte[1] ;
      P0AQO2_A130BarCodPar = new String[] {""} ;
      P0AQO2_A2808RecLinMAL = new short[1] ;
      P0AQO2_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQO2_n1378PrdCFin = new boolean[] {false} ;
      P0AQO2_A5807LanyLote = new String[] {""} ;
      P0AQO2_n5807LanyLote = new boolean[] {false} ;
      P0AQO2_A718PrdNom = new String[] {""} ;
      P0AQO2_A719PrdNum = new String[] {""} ;
      P0AQO2_A1377RecNumAny = new byte[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      A5807LanyLote = "" ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      AV16LANYAD_SDTItem = new app.formulaciontinte.SdtLANYAD_SDT_LANYAD_SDTItem(remoteHandle, context);
      AV9Prdnom = "" ;
      AV17lastLanyLote = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.lanyad_sdt_cargasdt__default(),
         new Object[] {
             new Object[] {
            P0AQO2_A396EmprCod, P0AQO2_A129BarCod, P0AQO2_A132BarCodReo, P0AQO2_A130BarCodPar, P0AQO2_A2808RecLinMAL, P0AQO2_A1378PrdCFin, P0AQO2_n1378PrdCFin, P0AQO2_A5807LanyLote, P0AQO2_n5807LanyLote, P0AQO2_A718PrdNom,
            P0AQO2_A719PrdNum, P0AQO2_A1377RecNumAny
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12BarCodReo ;
   private byte AV22GXLvl5 ;
   private byte A132BarCodReo ;
   private byte A1377RecNumAny ;
   private short AV19RecLinMAL ;
   private short A2808RecLinMAL ;
   private short Gx_err ;
   private int AV10BarCod ;
   private int A129BarCod ;
   private java.math.BigDecimal AV8PrdCFin ;
   private java.math.BigDecimal A1378PrdCFin ;
   private String AV13EmprCod ;
   private String AV11BarCodPar ;
   private String AV18lastPrdnum ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A5807LanyLote ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String AV9Prdnom ;
   private String AV17lastLanyLote ;
   private boolean n1378PrdCFin ;
   private boolean n5807LanyLote ;
   private String AV15LANYAD_SDT_json ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQO2_A396EmprCod ;
   private int[] P0AQO2_A129BarCod ;
   private byte[] P0AQO2_A132BarCodReo ;
   private String[] P0AQO2_A130BarCodPar ;
   private short[] P0AQO2_A2808RecLinMAL ;
   private java.math.BigDecimal[] P0AQO2_A1378PrdCFin ;
   private boolean[] P0AQO2_n1378PrdCFin ;
   private String[] P0AQO2_A5807LanyLote ;
   private boolean[] P0AQO2_n5807LanyLote ;
   private String[] P0AQO2_A718PrdNom ;
   private String[] P0AQO2_A719PrdNum ;
   private byte[] P0AQO2_A1377RecNumAny ;
   private GXBaseCollection<app.formulaciontinte.SdtLANYAD_SDT_LANYAD_SDTItem> AV14LANYAD_SDT ;
   private app.formulaciontinte.SdtLANYAD_SDT_LANYAD_SDTItem AV16LANYAD_SDTItem ;
}

final  class lanyad_sdt_cargasdt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQO2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.PrdCFin, T1.LanyLote, T2.PrdNom, T1.PrdNum, T1.RecNumAny FROM (TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

