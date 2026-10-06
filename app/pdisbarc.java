package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisbarc extends GXProcedure
{
   public pdisbarc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisbarc.class ), "" );
   }

   public pdisbarc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 )
   {
      pdisbarc.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pdisbarc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisbarc.this.AV14Barcod = aP1[0];
      this.aP1 = aP1;
      pdisbarc.this.AV15Barcodreo = aP2[0];
      this.aP2 = aP2;
      pdisbarc.this.AV16Barcodpar = aP3[0];
      this.aP3 = aP3;
      pdisbarc.this.AV17Discod = aP4[0];
      this.aP4 = aP4;
      pdisbarc.this.Gx_msg = aP5[0];
      this.aP5 = aP5;
      pdisbarc.this.AV20Pgmname_i = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV23Emprnom ;
      GXv_char3[0] = AV22Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char1, GXv_char2, GXv_char3) ;
      pdisbarc.this.A396EmprCod = GXv_char1[0] ;
      pdisbarc.this.AV23Emprnom = GXv_char2[0] ;
      pdisbarc.this.AV22Usurcod = GXv_char3[0] ;
      Gx_msg = " " ;
      AV37Disbar = (byte)(0) ;
      /* Using cursor P03AA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV14Barcod), Byte.valueOf(AV15Barcodreo), AV16Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1139DisBarCod = P03AA2_A1139DisBarCod[0] ;
         A1140DisBarReo = P03AA2_A1140DisBarReo[0] ;
         A1141DisBarPar = P03AA2_A1141DisBarPar[0] ;
         A1146DisDisCod = P03AA2_A1146DisDisCod[0] ;
         AV18Disdiscod = A1146DisDisCod ;
         AV37Disbar = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV17Discod != AV18Disdiscod )
      {
         /* Using cursor P03AA3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV18Disdiscod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A361DisCod = P03AA3_A361DisCod[0] ;
            A360DisCliNum = P03AA3_A360DisCliNum[0] ;
            A252CliCod = P03AA3_A252CliCod[0] ;
            A335DisArtCod = P03AA3_A335DisArtCod[0] ;
            A337DisArtDsc = P03AA3_A337DisArtDsc[0] ;
            A362DisColNom = P03AA3_A362DisColNom[0] ;
            n362DisColNom = P03AA3_n362DisColNom[0] ;
            A363DisColNum = P03AA3_A363DisColNum[0] ;
            n363DisColNum = P03AA3_n363DisColNum[0] ;
            A390DisTipCol = P03AA3_A390DisTipCol[0] ;
            n390DisTipCol = P03AA3_n390DisTipCol[0] ;
            A1195DisNomCli = P03AA3_A1195DisNomCli[0] ;
            A1196DisNumCli = P03AA3_A1196DisNumCli[0] ;
            A369DisFec = P03AA3_A369DisFec[0] ;
            A2310DisCliDes = P03AA3_A2310DisCliDes[0] ;
            A2831DisNumLot = P03AA3_A2831DisNumLot[0] ;
            AV24DisCliNum = A360DisCliNum ;
            AV25Clicodd = A252CliCod ;
            AV26Disartcod = A335DisArtCod ;
            AV27Disartdsc = A337DisArtDsc ;
            AV28Discolnom = A362DisColNom ;
            AV29Discolnum = A363DisColNum ;
            AV30Distipcol = A390DisTipCol ;
            AV31Disnomcli = A1195DisNomCli ;
            AV32Disnumcli = A1196DisNumCli ;
            AV34Barfecgen = A369DisFec ;
            AV36Barclides = A2310DisCliDes ;
            AV35BarNumlot = A2831DisNumLot ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV19Texto_i = httpContext.getMessage( "Atencion. Se ha detectado que hay cambio de datos", "") + GXutil.newLine( ) + httpContext.getMessage( "La HDR=", "") + GXutil.str( AV14Barcod, 8, 0) + " " + GXutil.str( AV15Barcodreo, 1, 0) + AV16Barcodpar + GXutil.newLine( ) + httpContext.getMessage( "tiene el item Discod.BARCAD=", "") + GXutil.str( AV17Discod, 8, 0) + " " + httpContext.getMessage( "cambiado", "") + GXutil.newLine( ) + httpContext.getMessage( "con respecto a DisDiscod.DISBAR=", "") + GXutil.str( AV18Disdiscod, 8, 0) + GXutil.newLine( ) + httpContext.getMessage( "El sistema ejecuta la utilidad de CAMBIO de datos en BARCAD", "") + GXutil.newLine( ) + httpContext.getMessage( "Se debe de posicionar en campo primero de la HDR", "") + GXutil.newLine( ) + httpContext.getMessage( "Modificamos los siguientes items de BARCAD:", "") + GXutil.newLine( ) + httpContext.getMessage( "Clicod=", "") + GXutil.str( AV25Clicodd, 6, 0) + httpContext.getMessage( "Barser=", "") + AV26Disartcod + httpContext.getMessage( "Barserdsc=", "") + AV27Disartdsc + httpContext.getMessage( "BarDisNum=", "") + AV24DisCliNum + GXutil.newLine( ) + httpContext.getMessage( "BarcolNom=", "") + AV28Discolnom + httpContext.getMessage( "Barcolnum=", "") + GXutil.str( AV29Discolnum, 6, 0) + httpContext.getMessage( "Bartipcol=", "") + GXutil.str( AV30Distipcol, 2, 0) + GXutil.newLine( ) + httpContext.getMessage( "BarNomCli=", "") + AV31Disnomcli + httpContext.getMessage( "BarNumCli=", "") + GXutil.str( AV32Disnumcli, 6, 0) ;
         if ( GXutil.strcmp(AV33Ok_c, httpContext.getMessage( "S", "")) == 0 )
         {
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname_i, AV22Usurcod, AV21Station, AV19Texto_i, AV14Barcod, AV15Barcodreo, AV16Barcodpar) ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = AV14Barcod ;
            GXv_int5[0] = AV15Barcodreo ;
            GXv_char2[0] = AV16Barcodpar ;
            GXv_int6[0] = AV18Disdiscod ;
            GXv_int7[0] = AV25Clicodd ;
            GXv_char1[0] = AV26Disartcod ;
            GXv_char8[0] = AV27Disartdsc ;
            GXv_char9[0] = AV24DisCliNum ;
            GXv_char10[0] = AV28Discolnom ;
            GXv_int11[0] = AV29Discolnum ;
            GXv_char12[0] = AV31Disnomcli ;
            GXv_int13[0] = AV32Disnumcli ;
            GXv_int14[0] = AV30Distipcol ;
            GXv_date15[0] = AV34Barfecgen ;
            GXv_int16[0] = AV35BarNumlot ;
            GXv_int17[0] = AV36Barclides ;
            new app.ptes000(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char2, GXv_int6, GXv_int7, GXv_char1, GXv_char8, GXv_char9, GXv_char10, GXv_int11, GXv_char12, GXv_int13, GXv_int14, GXv_date15, GXv_int16, GXv_int17) ;
            pdisbarc.this.A396EmprCod = GXv_char3[0] ;
            pdisbarc.this.AV14Barcod = GXv_int4[0] ;
            pdisbarc.this.AV15Barcodreo = GXv_int5[0] ;
            pdisbarc.this.AV16Barcodpar = GXv_char2[0] ;
            pdisbarc.this.AV18Disdiscod = GXv_int6[0] ;
            pdisbarc.this.AV25Clicodd = GXv_int7[0] ;
            pdisbarc.this.AV26Disartcod = GXv_char1[0] ;
            pdisbarc.this.AV27Disartdsc = GXv_char8[0] ;
            pdisbarc.this.AV24DisCliNum = GXv_char9[0] ;
            pdisbarc.this.AV28Discolnom = GXv_char10[0] ;
            pdisbarc.this.AV29Discolnum = GXv_int11[0] ;
            pdisbarc.this.AV31Disnomcli = GXv_char12[0] ;
            pdisbarc.this.AV32Disnumcli = GXv_int13[0] ;
            pdisbarc.this.AV30Distipcol = GXv_int14[0] ;
            pdisbarc.this.AV34Barfecgen = GXv_date15[0] ;
            pdisbarc.this.AV35BarNumlot = GXv_int16[0] ;
            pdisbarc.this.AV36Barclides = GXv_int17[0] ;
            Gx_msg = httpContext.getMessage( "Atencion. Se ha detectado que hay cambio de datos", "") + GXutil.newLine( ) + httpContext.getMessage( "La HDR=", "") + GXutil.str( AV14Barcod, 8, 0) + " " + GXutil.str( AV15Barcodreo, 1, 0) + AV16Barcodpar + GXutil.newLine( ) + httpContext.getMessage( "tiene el item Discod.BARCAD=", "") + GXutil.str( AV17Discod, 8, 0) + " " + httpContext.getMessage( "cambiado", "") + GXutil.newLine( ) + httpContext.getMessage( "con respecto a DisDiscod.DISBAR=", "") + GXutil.str( AV18Disdiscod, 8, 0) + GXutil.newLine( ) + httpContext.getMessage( "El sistema ejecuta la utilidad de CAMBIO de datos en BARCAD.", "") + GXutil.newLine( ) + httpContext.getMessage( "Se debe de posicionar en campo primero de la HDR. Y volver a pulsar TAB", "") ;
         }
         else
         {
            Gx_msg = httpContext.getMessage( "Atencion. Se ha detectado que hay cambio de datos", "") + GXutil.newLine( ) + httpContext.getMessage( "La HDR=", "") + GXutil.str( AV14Barcod, 8, 0) + " " + GXutil.str( AV15Barcodreo, 1, 0) + AV16Barcodpar + GXutil.newLine( ) + httpContext.getMessage( "tiene el item Discod.BARCAD=", "") + GXutil.str( AV17Discod, 8, 0) + " " + httpContext.getMessage( "cambiado", "") + GXutil.newLine( ) + httpContext.getMessage( "con respecto a DisDiscod.DISBAR=", "") + GXutil.str( AV18Disdiscod, 8, 0) + GXutil.newLine( ) + httpContext.getMessage( "El sistema NO ejecuta la utilidad de CAMBIO de datos en BARCAD.", "") + GXutil.newLine( ) + httpContext.getMessage( "El sistema da ERROR. Consultar para ejecutar Wtes000", "") ;
            AV19Texto_i = Gx_msg ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV20Pgmname_i, AV22Usurcod, AV21Station, AV19Texto_i, AV14Barcod, AV15Barcodreo, AV16Barcodpar) ;
         }
      }
      else
      {
         System.out.println( httpContext.getMessage( "Control tabla DISBAR. Ok", "") );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisbarc.this.A396EmprCod;
      this.aP1[0] = pdisbarc.this.AV14Barcod;
      this.aP2[0] = pdisbarc.this.AV15Barcodreo;
      this.aP3[0] = pdisbarc.this.AV16Barcodpar;
      this.aP4[0] = pdisbarc.this.AV17Discod;
      this.aP5[0] = pdisbarc.this.Gx_msg;
      this.aP6[0] = pdisbarc.this.AV20Pgmname_i;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21Station = "" ;
      AV23Emprnom = "" ;
      AV22Usurcod = "" ;
      scmdbuf = "" ;
      P03AA2_A396EmprCod = new String[] {""} ;
      P03AA2_A1139DisBarCod = new int[1] ;
      P03AA2_A1140DisBarReo = new byte[1] ;
      P03AA2_A1141DisBarPar = new String[] {""} ;
      P03AA2_A1146DisDisCod = new int[1] ;
      A1141DisBarPar = "" ;
      P03AA3_A396EmprCod = new String[] {""} ;
      P03AA3_A361DisCod = new int[1] ;
      P03AA3_A360DisCliNum = new String[] {""} ;
      P03AA3_A252CliCod = new int[1] ;
      P03AA3_A335DisArtCod = new String[] {""} ;
      P03AA3_A337DisArtDsc = new String[] {""} ;
      P03AA3_A362DisColNom = new String[] {""} ;
      P03AA3_n362DisColNom = new boolean[] {false} ;
      P03AA3_A363DisColNum = new int[1] ;
      P03AA3_n363DisColNum = new boolean[] {false} ;
      P03AA3_A390DisTipCol = new byte[1] ;
      P03AA3_n390DisTipCol = new boolean[] {false} ;
      P03AA3_A1195DisNomCli = new String[] {""} ;
      P03AA3_A1196DisNumCli = new int[1] ;
      P03AA3_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P03AA3_A2310DisCliDes = new int[1] ;
      P03AA3_A2831DisNumLot = new int[1] ;
      A360DisCliNum = "" ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A369DisFec = GXutil.nullDate() ;
      AV24DisCliNum = "" ;
      AV26Disartcod = "" ;
      AV27Disartdsc = "" ;
      AV28Discolnom = "" ;
      AV31Disnomcli = "" ;
      AV34Barfecgen = GXutil.nullDate() ;
      AV19Texto_i = "" ;
      AV33Ok_c = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_char12 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int14 = new byte[1] ;
      GXv_date15 = new java.util.Date[1] ;
      GXv_int16 = new int[1] ;
      GXv_int17 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisbarc__default(),
         new Object[] {
             new Object[] {
            P03AA2_A396EmprCod, P03AA2_A1139DisBarCod, P03AA2_A1140DisBarReo, P03AA2_A1141DisBarPar, P03AA2_A1146DisDisCod
            }
            , new Object[] {
            P03AA3_A396EmprCod, P03AA3_A361DisCod, P03AA3_A360DisCliNum, P03AA3_A252CliCod, P03AA3_A335DisArtCod, P03AA3_A337DisArtDsc, P03AA3_A362DisColNom, P03AA3_n362DisColNom, P03AA3_A363DisColNum, P03AA3_n363DisColNum,
            P03AA3_A390DisTipCol, P03AA3_n390DisTipCol, P03AA3_A1195DisNomCli, P03AA3_A1196DisNumCli, P03AA3_A369DisFec, P03AA3_A2310DisCliDes, P03AA3_A2831DisNumLot
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Barcodreo ;
   private byte AV37Disbar ;
   private byte A1140DisBarReo ;
   private byte A390DisTipCol ;
   private byte AV30Distipcol ;
   private byte GXv_int5[] ;
   private byte GXv_int14[] ;
   private short Gx_err ;
   private int AV14Barcod ;
   private int AV17Discod ;
   private int A1139DisBarCod ;
   private int A1146DisDisCod ;
   private int AV18Disdiscod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A1196DisNumCli ;
   private int A2310DisCliDes ;
   private int A2831DisNumLot ;
   private int AV25Clicodd ;
   private int AV29Discolnum ;
   private int AV32Disnumcli ;
   private int AV36Barclides ;
   private int AV35BarNumlot ;
   private int GXv_int4[] ;
   private int GXv_int6[] ;
   private int GXv_int7[] ;
   private int GXv_int11[] ;
   private int GXv_int13[] ;
   private int GXv_int16[] ;
   private int GXv_int17[] ;
   private String A396EmprCod ;
   private String AV16Barcodpar ;
   private String Gx_msg ;
   private String AV20Pgmname_i ;
   private String AV21Station ;
   private String AV23Emprnom ;
   private String AV22Usurcod ;
   private String scmdbuf ;
   private String A1141DisBarPar ;
   private String A360DisCliNum ;
   private String A335DisArtCod ;
   private String A337DisArtDsc ;
   private String A362DisColNom ;
   private String A1195DisNomCli ;
   private String AV24DisCliNum ;
   private String AV26Disartcod ;
   private String AV27Disartdsc ;
   private String AV28Discolnom ;
   private String AV31Disnomcli ;
   private String AV33Ok_c ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String GXv_char12[] ;
   private java.util.Date A369DisFec ;
   private java.util.Date AV34Barfecgen ;
   private java.util.Date GXv_date15[] ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n390DisTipCol ;
   private String AV19Texto_i ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P03AA2_A396EmprCod ;
   private int[] P03AA2_A1139DisBarCod ;
   private byte[] P03AA2_A1140DisBarReo ;
   private String[] P03AA2_A1141DisBarPar ;
   private int[] P03AA2_A1146DisDisCod ;
   private String[] P03AA3_A396EmprCod ;
   private int[] P03AA3_A361DisCod ;
   private String[] P03AA3_A360DisCliNum ;
   private int[] P03AA3_A252CliCod ;
   private String[] P03AA3_A335DisArtCod ;
   private String[] P03AA3_A337DisArtDsc ;
   private String[] P03AA3_A362DisColNom ;
   private boolean[] P03AA3_n362DisColNom ;
   private int[] P03AA3_A363DisColNum ;
   private boolean[] P03AA3_n363DisColNum ;
   private byte[] P03AA3_A390DisTipCol ;
   private boolean[] P03AA3_n390DisTipCol ;
   private String[] P03AA3_A1195DisNomCli ;
   private int[] P03AA3_A1196DisNumCli ;
   private java.util.Date[] P03AA3_A369DisFec ;
   private int[] P03AA3_A2310DisCliDes ;
   private int[] P03AA3_A2831DisNumLot ;
}

final  class pdisbarc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03AA2", "SELECT EmprCod, DisBarCod, DisBarReo, DisBarPar, DisDisCod FROM TXPDISBAR WHERE EmprCod = ? and DisBarCod = ? and DisBarReo = ? and DisBarPar = ? ORDER BY EmprCod, DisBarCod, DisBarReo, DisBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03AA3", "SELECT EmprCod, DisCod, DisCliNum, CliCod, DisArtCod, DisArtDsc, DisColNom, DisColNum, DisTipCol, DisNomCli, DisNumCli, DisFec, DisCliDes, DisNumLot FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 13);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((int[]) buf[16])[0] = rslt.getInt(14);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

