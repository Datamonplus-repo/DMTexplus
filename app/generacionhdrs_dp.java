package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class generacionhdrs_dp extends GXProcedure
{
   public generacionhdrs_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( generacionhdrs_dp.class ), "" );
   }

   public generacionhdrs_dp( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtGeneracionHDRs_SDT_Item> executeUdp( String aP0 ,
                                                                       byte aP1 )
   {
      generacionhdrs_dp.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<app.SdtGeneracionHDRs_SDT_Item>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        GXBaseCollection<app.SdtGeneracionHDRs_SDT_Item>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             GXBaseCollection<app.SdtGeneracionHDRs_SDT_Item>[] aP2 )
   {
      generacionhdrs_dp.this.AV5Emprcod = aP0;
      generacionhdrs_dp.this.AV6Disest = aP1;
      generacionhdrs_dp.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P003O3 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Byte.valueOf(AV6Disest)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A367DisEst = P003O3_A367DisEst[0] ;
         A396EmprCod = P003O3_A396EmprCod[0] ;
         A369DisFec = P003O3_A369DisFec[0] ;
         A252CliCod = P003O3_A252CliCod[0] ;
         A279CliNom = P003O3_A279CliNom[0] ;
         A360DisCliNum = P003O3_A360DisCliNum[0] ;
         A4813DisEncCli = P003O3_A4813DisEncCli[0] ;
         A1502DisPart = P003O3_A1502DisPart[0] ;
         A335DisArtCod = P003O3_A335DisArtCod[0] ;
         A337DisArtDsc = P003O3_A337DisArtDsc[0] ;
         A362DisColNom = P003O3_A362DisColNom[0] ;
         n362DisColNom = P003O3_n362DisColNom[0] ;
         A363DisColNum = P003O3_A363DisColNum[0] ;
         n363DisColNum = P003O3_n363DisColNum[0] ;
         A390DisTipCol = P003O3_A390DisTipCol[0] ;
         n390DisTipCol = P003O3_n390DisTipCol[0] ;
         A1195DisNomCli = P003O3_A1195DisNomCli[0] ;
         A392DisUniMed = P003O3_A392DisUniMed[0] ;
         A1122MaqCodDis = P003O3_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P003O3_n1122MaqCodDis[0] ;
         A4348DisUsrCod = P003O3_A4348DisUsrCod[0] ;
         A361DisCod = P003O3_A361DisCod[0] ;
         A387DisPiePie = P003O3_A387DisPiePie[0] ;
         n387DisPiePie = P003O3_n387DisPiePie[0] ;
         A365DisDes = P003O3_A365DisDes[0] ;
         A279CliNom = P003O3_A279CliNom[0] ;
         A387DisPiePie = P003O3_A387DisPiePie[0] ;
         n387DisPiePie = P003O3_n387DisPiePie[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            }
         }
         Gxm1generacionhdrs_sdt = (app.SdtGeneracionHDRs_SDT_Item)new app.SdtGeneracionHDRs_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1generacionhdrs_sdt, 0);
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar( true );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Discod( A361DisCod );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Disfec( A369DisFec );
         GXt_int1 = 0 ;
         GXv_int2[0] = GXt_int1 ;
         new app.pbusmac(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_int2) ;
         generacionhdrs_dp.this.GXt_int1 = GXv_int2[0] ;
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Maccod( GXt_int1 );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Clicod( A252CliCod );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Clinom( A279CliNom );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Disenccli( ((GXutil.strcmp("", A4813DisEncCli)==0) ? A360DisCliNum : A4813DisEncCli) );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Dispart( A1502DisPart );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Disartcod( A335DisArtCod );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc( A337DisArtDsc );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Discolnom( A362DisColNom );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Discolnum( A363DisColNum );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Distipcol( A390DisTipCol );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli( A1195DisNomCli );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Disunimed( A392DisUniMed );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie( A387DisPiePie );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm( A381DisPieKgm );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr( A385DisPieMtr );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis( A1122MaqCodDis );
         Gxm1generacionhdrs_sdt.setgxTv_SdtGeneracionHDRs_SDT_Item_Disusrcod( A4348DisUsrCod );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = generacionhdrs_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor P003O4 */
      pr_default.execute(1, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         X595Kilos = P003O4_A595Kilos[0] ;
      }
      pr_default.close(1);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor P003O5 */
      pr_default.execute(2, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         X382DisPieKil = P003O5_A382DisPieKil[0] ;
      }
      pr_default.close(2);
      return X382DisPieKil ;
   }

   public java.math.BigDecimal getDisPieMtr1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X631Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P003O6 */
      pr_default.execute(3, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         X631Metros = P003O6_A631Metros[0] ;
      }
      pr_default.close(3);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P003O7 */
      pr_default.execute(4, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         X384DisPieMet = P003O7_A384DisPieMet[0] ;
      }
      pr_default.close(4);
      return X384DisPieMet ;
   }

   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtGeneracionHDRs_SDT_Item>(app.SdtGeneracionHDRs_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P003O3_A367DisEst = new byte[1] ;
      P003O3_A396EmprCod = new String[] {""} ;
      P003O3_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P003O3_A252CliCod = new int[1] ;
      P003O3_A279CliNom = new String[] {""} ;
      P003O3_A360DisCliNum = new String[] {""} ;
      P003O3_A4813DisEncCli = new String[] {""} ;
      P003O3_A1502DisPart = new short[1] ;
      P003O3_A335DisArtCod = new String[] {""} ;
      P003O3_A337DisArtDsc = new String[] {""} ;
      P003O3_A362DisColNom = new String[] {""} ;
      P003O3_n362DisColNom = new boolean[] {false} ;
      P003O3_A363DisColNum = new int[1] ;
      P003O3_n363DisColNum = new boolean[] {false} ;
      P003O3_A390DisTipCol = new byte[1] ;
      P003O3_n390DisTipCol = new boolean[] {false} ;
      P003O3_A1195DisNomCli = new String[] {""} ;
      P003O3_A392DisUniMed = new String[] {""} ;
      P003O3_A1122MaqCodDis = new String[] {""} ;
      P003O3_n1122MaqCodDis = new boolean[] {false} ;
      P003O3_A4348DisUsrCod = new String[] {""} ;
      P003O3_A361DisCod = new int[1] ;
      P003O3_A387DisPiePie = new short[1] ;
      P003O3_n387DisPiePie = new boolean[] {false} ;
      P003O3_A365DisDes = new String[] {""} ;
      A396EmprCod = "" ;
      A369DisFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A360DisCliNum = "" ;
      A4813DisEncCli = "" ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A392DisUniMed = "" ;
      A1122MaqCodDis = "" ;
      A4348DisUsrCod = "" ;
      A365DisDes = "" ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      Gxm1generacionhdrs_sdt = new app.SdtGeneracionHDRs_SDT_Item(remoteHandle, context);
      GXv_int2 = new int[1] ;
      X595Kilos = DecimalUtil.ZERO ;
      E396EmprCod = "" ;
      P003O4_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      P003O5_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X631Metros = DecimalUtil.ZERO ;
      P003O6_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      P003O7_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.generacionhdrs_dp__default(),
         new Object[] {
             new Object[] {
            P003O3_A367DisEst, P003O3_A396EmprCod, P003O3_A369DisFec, P003O3_A252CliCod, P003O3_A279CliNom, P003O3_A360DisCliNum, P003O3_A4813DisEncCli, P003O3_A1502DisPart, P003O3_A335DisArtCod, P003O3_A337DisArtDsc,
            P003O3_A362DisColNom, P003O3_n362DisColNom, P003O3_A363DisColNum, P003O3_n363DisColNum, P003O3_A390DisTipCol, P003O3_n390DisTipCol, P003O3_A1195DisNomCli, P003O3_A392DisUniMed, P003O3_A1122MaqCodDis, P003O3_n1122MaqCodDis,
            P003O3_A4348DisUsrCod, P003O3_A361DisCod, P003O3_A387DisPiePie, P003O3_n387DisPiePie, P003O3_A365DisDes
            }
            , new Object[] {
            P003O4_A595Kilos
            }
            , new Object[] {
            P003O5_A382DisPieKil
            }
            , new Object[] {
            P003O6_A631Metros
            }
            , new Object[] {
            P003O7_A384DisPieMet
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV6Disest ;
   private byte A367DisEst ;
   private byte A390DisTipCol ;
   private short A1502DisPart ;
   private short A387DisPiePie ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A361DisCod ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private int E361DisCod ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X384DisPieMet ;
   private String AV5Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A360DisCliNum ;
   private String A4813DisEncCli ;
   private String A335DisArtCod ;
   private String A337DisArtDsc ;
   private String A362DisColNom ;
   private String A1195DisNomCli ;
   private String A392DisUniMed ;
   private String A1122MaqCodDis ;
   private String A4348DisUsrCod ;
   private String A365DisDes ;
   private String E396EmprCod ;
   private java.util.Date A369DisFec ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n390DisTipCol ;
   private boolean n1122MaqCodDis ;
   private boolean n387DisPiePie ;
   private GXBaseCollection<app.SdtGeneracionHDRs_SDT_Item>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private byte[] P003O3_A367DisEst ;
   private String[] P003O3_A396EmprCod ;
   private java.util.Date[] P003O3_A369DisFec ;
   private int[] P003O3_A252CliCod ;
   private String[] P003O3_A279CliNom ;
   private String[] P003O3_A360DisCliNum ;
   private String[] P003O3_A4813DisEncCli ;
   private short[] P003O3_A1502DisPart ;
   private String[] P003O3_A335DisArtCod ;
   private String[] P003O3_A337DisArtDsc ;
   private String[] P003O3_A362DisColNom ;
   private boolean[] P003O3_n362DisColNom ;
   private int[] P003O3_A363DisColNum ;
   private boolean[] P003O3_n363DisColNum ;
   private byte[] P003O3_A390DisTipCol ;
   private boolean[] P003O3_n390DisTipCol ;
   private String[] P003O3_A1195DisNomCli ;
   private String[] P003O3_A392DisUniMed ;
   private String[] P003O3_A1122MaqCodDis ;
   private boolean[] P003O3_n1122MaqCodDis ;
   private String[] P003O3_A4348DisUsrCod ;
   private int[] P003O3_A361DisCod ;
   private short[] P003O3_A387DisPiePie ;
   private boolean[] P003O3_n387DisPiePie ;
   private String[] P003O3_A365DisDes ;
   private java.math.BigDecimal[] P003O4_A595Kilos ;
   private java.math.BigDecimal[] P003O5_A382DisPieKil ;
   private java.math.BigDecimal[] P003O6_A631Metros ;
   private java.math.BigDecimal[] P003O7_A384DisPieMet ;
   private GXBaseCollection<app.SdtGeneracionHDRs_SDT_Item> Gxm2rootcol ;
   private app.SdtGeneracionHDRs_SDT_Item Gxm1generacionhdrs_sdt ;
}

final  class generacionhdrs_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003O3", "SELECT T1.DisEst, T1.EmprCod, T1.DisFec, T1.CliCod, T2.CliNom, T1.DisCliNum, T1.DisEncCli, T1.DisPart, T1.DisArtCod, T1.DisArtDsc, T1.DisColNom, T1.DisColNum, T1.DisTipCol, T1.DisNomCli, T1.DisUniMed, T1.MaqCodDis, T1.DisUsrCod, T1.DisCod, COALESCE( T3.DisPiePie, 0) AS DisPiePie, T1.DisDes FROM ((TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisEst = ? ORDER BY T1.EmprCod, T1.DisEst, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P003O4", "SELECT SUM(Kilos) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P003O5", "SELECT SUM(DisPieKil) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P003O6", "SELECT SUM(Metros) AS GXC5 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P003O7", "SELECT SUM(DisPieMet) AS GXC4 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 13);
               ((String[]) buf[17])[0] = rslt.getString(15, 1);
               ((String[]) buf[18])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(17, 8);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((short[]) buf[22])[0] = rslt.getShort(19);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(20, 1);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

