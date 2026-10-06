package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuspes extends GXProcedure
{
   public pbuspes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuspes.class ), "" );
   }

   public pbuspes( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           byte[] aP4 ,
                                           String[] aP5 ,
                                           String[] aP6 ,
                                           java.math.BigDecimal[] aP7 )
   {
      pbuspes.this.aP8 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 )
   {
      pbuspes.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbuspes.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pbuspes.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbuspes.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbuspes.this.AV15DisComLin = aP4[0];
      this.aP4 = aP4;
      pbuspes.this.AV16DisComCod = aP5[0];
      this.aP5 = aP5;
      pbuspes.this.AV17FonCod = aP6[0];
      this.aP6 = aP6;
      pbuspes.this.AV18CombPre = aP7[0];
      this.aP7 = aP7;
      pbuspes.this.AV19MtsCom = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24FondPre = DecimalUtil.doubleToDec(0) ;
      AV18CombPre = DecimalUtil.doubleToDec(0) ;
      AV23PreComLim = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P00YD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P00YD2_A361DisCod[0] ;
         A1014DibInt = P00YD2_A1014DibInt[0] ;
         n1014DibInt = P00YD2_n1014DibInt[0] ;
         A1013DibCli = P00YD2_A1013DibCli[0] ;
         n1013DibCli = P00YD2_n1013DibCli[0] ;
         A212BarSer = P00YD2_A212BarSer[0] ;
         A252CliCod = P00YD2_A252CliCod[0] ;
         n252CliCod = P00YD2_n252CliCod[0] ;
         A1014DibInt = P00YD2_A1014DibInt[0] ;
         n1014DibInt = P00YD2_n1014DibInt[0] ;
         A1013DibCli = P00YD2_A1013DibCli[0] ;
         n1013DibCli = P00YD2_n1013DibCli[0] ;
         AV25FlagFon = (byte)(0) ;
         /* Using cursor P00YD3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A212BarSer, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), AV16DisComCod, AV17FonCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A65ArtCod = P00YD3_A65ArtCod[0] ;
            A1177Dibujo = P00YD3_A1177Dibujo[0] ;
            A1790DibIntCod = P00YD3_A1790DibIntCod[0] ;
            A2529FondCod = P00YD3_A2529FondCod[0] ;
            A1176CombCod = P00YD3_A1176CombCod[0] ;
            A2530FondPre = P00YD3_A2530FondPre[0] ;
            n2530FondPre = P00YD3_n2530FondPre[0] ;
            AV24FondPre = A2530FondPre ;
            AV25FlagFon = (byte)(1) ;
            /* Using cursor P00YD4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A1177Dibujo, Integer.valueOf(A1790DibIntCod), A1176CombCod, A2529FondCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A2531FonLimMax = P00YD4_A2531FonLimMax[0] ;
               n2531FonLimMax = P00YD4_n2531FonLimMax[0] ;
               A2532FonLimMin = P00YD4_A2532FonLimMin[0] ;
               n2532FonLimMin = P00YD4_n2532FonLimMin[0] ;
               A2533FonLimPre = P00YD4_A2533FonLimPre[0] ;
               n2533FonLimPre = P00YD4_n2533FonLimPre[0] ;
               A2645LinFon = P00YD4_A2645LinFon[0] ;
               if ( ( AV19MtsCom.doubleValue() >= A2532FonLimMin ) && ( AV19MtsCom.doubleValue() <= A2531FonLimMax ) )
               {
                  AV23PreComLim = A2533FonLimPre ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV23PreComLim)==0) )
            {
               AV24FondPre = AV23PreComLim ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( (0==AV25FlagFon) )
         {
            /* Using cursor P00YD5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A212BarSer, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), AV16DisComCod});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A65ArtCod = P00YD5_A65ArtCod[0] ;
               A1177Dibujo = P00YD5_A1177Dibujo[0] ;
               A1790DibIntCod = P00YD5_A1790DibIntCod[0] ;
               A1176CombCod = P00YD5_A1176CombCod[0] ;
               A1175CombPre = P00YD5_A1175CombPre[0] ;
               n1175CombPre = P00YD5_n1175CombPre[0] ;
               AV18CombPre = A1175CombPre ;
               /* Using cursor P00YD6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A1177Dibujo, Integer.valueOf(A1790DibIntCod), A1176CombCod});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A1750ComLimMax = P00YD6_A1750ComLimMax[0] ;
                  n1750ComLimMax = P00YD6_n1750ComLimMax[0] ;
                  A1751ComLimMin = P00YD6_A1751ComLimMin[0] ;
                  n1751ComLimMin = P00YD6_n1751ComLimMin[0] ;
                  A1752ComLimPre = P00YD6_A1752ComLimPre[0] ;
                  n1752ComLimPre = P00YD6_n1752ComLimPre[0] ;
                  A1769LinCom = P00YD6_A1769LinCom[0] ;
                  if ( ( AV19MtsCom.doubleValue() >= A1751ComLimMin ) && ( AV19MtsCom.doubleValue() <= A1750ComLimMax ) )
                  {
                     AV23PreComLim = A1752ComLimPre ;
                  }
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV23PreComLim)==0) )
               {
                  AV18CombPre = AV23PreComLim ;
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
         }
         else
         {
            AV18CombPre = AV24FondPre ;
         }
         n2517BarPrcMtr = false ;
         /* Optimized UPDATE. */
         /* Using cursor P00YD7 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n2517BarPrcMtr), AV18CombPre, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(AV15DisComLin), AV16DisComCod, AV17FonCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
         /* End optimized UPDATE. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuspes.this.A396EmprCod;
      this.aP1[0] = pbuspes.this.A129BarCod;
      this.aP2[0] = pbuspes.this.A132BarCodReo;
      this.aP3[0] = pbuspes.this.A130BarCodPar;
      this.aP4[0] = pbuspes.this.AV15DisComLin;
      this.aP5[0] = pbuspes.this.AV16DisComCod;
      this.aP6[0] = pbuspes.this.AV17FonCod;
      this.aP7[0] = pbuspes.this.AV18CombPre;
      this.aP8[0] = pbuspes.this.AV19MtsCom;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbuspes");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24FondPre = DecimalUtil.ZERO ;
      AV23PreComLim = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P00YD2_A361DisCod = new int[1] ;
      P00YD2_A396EmprCod = new String[] {""} ;
      P00YD2_A129BarCod = new int[1] ;
      P00YD2_A132BarCodReo = new byte[1] ;
      P00YD2_A130BarCodPar = new String[] {""} ;
      P00YD2_A1014DibInt = new int[1] ;
      P00YD2_n1014DibInt = new boolean[] {false} ;
      P00YD2_A1013DibCli = new String[] {""} ;
      P00YD2_n1013DibCli = new boolean[] {false} ;
      P00YD2_A212BarSer = new String[] {""} ;
      P00YD2_A252CliCod = new int[1] ;
      P00YD2_n252CliCod = new boolean[] {false} ;
      A1013DibCli = "" ;
      A212BarSer = "" ;
      P00YD3_A396EmprCod = new String[] {""} ;
      P00YD3_A252CliCod = new int[1] ;
      P00YD3_n252CliCod = new boolean[] {false} ;
      P00YD3_A65ArtCod = new String[] {""} ;
      P00YD3_A1177Dibujo = new String[] {""} ;
      P00YD3_A1790DibIntCod = new int[1] ;
      P00YD3_A2529FondCod = new String[] {""} ;
      P00YD3_A1176CombCod = new String[] {""} ;
      P00YD3_A2530FondPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YD3_n2530FondPre = new boolean[] {false} ;
      A65ArtCod = "" ;
      A1177Dibujo = "" ;
      A2529FondCod = "" ;
      A1176CombCod = "" ;
      A2530FondPre = DecimalUtil.ZERO ;
      P00YD4_A396EmprCod = new String[] {""} ;
      P00YD4_A252CliCod = new int[1] ;
      P00YD4_n252CliCod = new boolean[] {false} ;
      P00YD4_A65ArtCod = new String[] {""} ;
      P00YD4_A1177Dibujo = new String[] {""} ;
      P00YD4_A1790DibIntCod = new int[1] ;
      P00YD4_A1176CombCod = new String[] {""} ;
      P00YD4_A2529FondCod = new String[] {""} ;
      P00YD4_A2531FonLimMax = new int[1] ;
      P00YD4_n2531FonLimMax = new boolean[] {false} ;
      P00YD4_A2532FonLimMin = new int[1] ;
      P00YD4_n2532FonLimMin = new boolean[] {false} ;
      P00YD4_A2533FonLimPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YD4_n2533FonLimPre = new boolean[] {false} ;
      P00YD4_A2645LinFon = new short[1] ;
      A2533FonLimPre = DecimalUtil.ZERO ;
      P00YD5_A396EmprCod = new String[] {""} ;
      P00YD5_A252CliCod = new int[1] ;
      P00YD5_n252CliCod = new boolean[] {false} ;
      P00YD5_A65ArtCod = new String[] {""} ;
      P00YD5_A1177Dibujo = new String[] {""} ;
      P00YD5_A1790DibIntCod = new int[1] ;
      P00YD5_A1176CombCod = new String[] {""} ;
      P00YD5_A1175CombPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YD5_n1175CombPre = new boolean[] {false} ;
      A1175CombPre = DecimalUtil.ZERO ;
      P00YD6_A396EmprCod = new String[] {""} ;
      P00YD6_A252CliCod = new int[1] ;
      P00YD6_n252CliCod = new boolean[] {false} ;
      P00YD6_A65ArtCod = new String[] {""} ;
      P00YD6_A1177Dibujo = new String[] {""} ;
      P00YD6_A1790DibIntCod = new int[1] ;
      P00YD6_A1176CombCod = new String[] {""} ;
      P00YD6_A1750ComLimMax = new int[1] ;
      P00YD6_n1750ComLimMax = new boolean[] {false} ;
      P00YD6_A1751ComLimMin = new int[1] ;
      P00YD6_n1751ComLimMin = new boolean[] {false} ;
      P00YD6_A1752ComLimPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YD6_n1752ComLimPre = new boolean[] {false} ;
      P00YD6_A1769LinCom = new short[1] ;
      A1752ComLimPre = DecimalUtil.ZERO ;
      A2517BarPrcMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbuspes__default(),
         new Object[] {
             new Object[] {
            P00YD2_A361DisCod, P00YD2_A396EmprCod, P00YD2_A129BarCod, P00YD2_A132BarCodReo, P00YD2_A130BarCodPar, P00YD2_A1014DibInt, P00YD2_n1014DibInt, P00YD2_A1013DibCli, P00YD2_n1013DibCli, P00YD2_A212BarSer,
            P00YD2_A252CliCod, P00YD2_n252CliCod
            }
            , new Object[] {
            P00YD3_A396EmprCod, P00YD3_A252CliCod, P00YD3_A65ArtCod, P00YD3_A1177Dibujo, P00YD3_A1790DibIntCod, P00YD3_A2529FondCod, P00YD3_A1176CombCod, P00YD3_A2530FondPre, P00YD3_n2530FondPre
            }
            , new Object[] {
            P00YD4_A396EmprCod, P00YD4_A252CliCod, P00YD4_A65ArtCod, P00YD4_A1177Dibujo, P00YD4_A1790DibIntCod, P00YD4_A1176CombCod, P00YD4_A2529FondCod, P00YD4_A2531FonLimMax, P00YD4_n2531FonLimMax, P00YD4_A2532FonLimMin,
            P00YD4_n2532FonLimMin, P00YD4_A2533FonLimPre, P00YD4_n2533FonLimPre, P00YD4_A2645LinFon
            }
            , new Object[] {
            P00YD5_A396EmprCod, P00YD5_A252CliCod, P00YD5_A65ArtCod, P00YD5_A1177Dibujo, P00YD5_A1790DibIntCod, P00YD5_A1176CombCod, P00YD5_A1175CombPre, P00YD5_n1175CombPre
            }
            , new Object[] {
            P00YD6_A396EmprCod, P00YD6_A252CliCod, P00YD6_A65ArtCod, P00YD6_A1177Dibujo, P00YD6_A1790DibIntCod, P00YD6_A1176CombCod, P00YD6_A1750ComLimMax, P00YD6_n1750ComLimMax, P00YD6_A1751ComLimMin, P00YD6_n1751ComLimMin,
            P00YD6_A1752ComLimPre, P00YD6_n1752ComLimPre, P00YD6_A1769LinCom
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV15DisComLin ;
   private byte AV25FlagFon ;
   private short A2645LinFon ;
   private short A1769LinCom ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private int A1790DibIntCod ;
   private int A2531FonLimMax ;
   private int A2532FonLimMin ;
   private int A1750ComLimMax ;
   private int A1751ComLimMin ;
   private java.math.BigDecimal AV18CombPre ;
   private java.math.BigDecimal AV19MtsCom ;
   private java.math.BigDecimal AV24FondPre ;
   private java.math.BigDecimal AV23PreComLim ;
   private java.math.BigDecimal A2530FondPre ;
   private java.math.BigDecimal A2533FonLimPre ;
   private java.math.BigDecimal A1175CombPre ;
   private java.math.BigDecimal A1752ComLimPre ;
   private java.math.BigDecimal A2517BarPrcMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV16DisComCod ;
   private String AV17FonCod ;
   private String scmdbuf ;
   private String A1013DibCli ;
   private String A212BarSer ;
   private String A65ArtCod ;
   private String A1177Dibujo ;
   private String A2529FondCod ;
   private String A1176CombCod ;
   private boolean n1014DibInt ;
   private boolean n1013DibCli ;
   private boolean n252CliCod ;
   private boolean n2530FondPre ;
   private boolean n2531FonLimMax ;
   private boolean n2532FonLimMin ;
   private boolean n2533FonLimPre ;
   private boolean n1175CombPre ;
   private boolean n1750ComLimMax ;
   private boolean n1751ComLimMin ;
   private boolean n1752ComLimPre ;
   private boolean n2517BarPrcMtr ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private int[] P00YD2_A361DisCod ;
   private String[] P00YD2_A396EmprCod ;
   private int[] P00YD2_A129BarCod ;
   private byte[] P00YD2_A132BarCodReo ;
   private String[] P00YD2_A130BarCodPar ;
   private int[] P00YD2_A1014DibInt ;
   private boolean[] P00YD2_n1014DibInt ;
   private String[] P00YD2_A1013DibCli ;
   private boolean[] P00YD2_n1013DibCli ;
   private String[] P00YD2_A212BarSer ;
   private int[] P00YD2_A252CliCod ;
   private boolean[] P00YD2_n252CliCod ;
   private String[] P00YD3_A396EmprCod ;
   private int[] P00YD3_A252CliCod ;
   private boolean[] P00YD3_n252CliCod ;
   private String[] P00YD3_A65ArtCod ;
   private String[] P00YD3_A1177Dibujo ;
   private int[] P00YD3_A1790DibIntCod ;
   private String[] P00YD3_A2529FondCod ;
   private String[] P00YD3_A1176CombCod ;
   private java.math.BigDecimal[] P00YD3_A2530FondPre ;
   private boolean[] P00YD3_n2530FondPre ;
   private String[] P00YD4_A396EmprCod ;
   private int[] P00YD4_A252CliCod ;
   private boolean[] P00YD4_n252CliCod ;
   private String[] P00YD4_A65ArtCod ;
   private String[] P00YD4_A1177Dibujo ;
   private int[] P00YD4_A1790DibIntCod ;
   private String[] P00YD4_A1176CombCod ;
   private String[] P00YD4_A2529FondCod ;
   private int[] P00YD4_A2531FonLimMax ;
   private boolean[] P00YD4_n2531FonLimMax ;
   private int[] P00YD4_A2532FonLimMin ;
   private boolean[] P00YD4_n2532FonLimMin ;
   private java.math.BigDecimal[] P00YD4_A2533FonLimPre ;
   private boolean[] P00YD4_n2533FonLimPre ;
   private short[] P00YD4_A2645LinFon ;
   private String[] P00YD5_A396EmprCod ;
   private int[] P00YD5_A252CliCod ;
   private boolean[] P00YD5_n252CliCod ;
   private String[] P00YD5_A65ArtCod ;
   private String[] P00YD5_A1177Dibujo ;
   private int[] P00YD5_A1790DibIntCod ;
   private String[] P00YD5_A1176CombCod ;
   private java.math.BigDecimal[] P00YD5_A1175CombPre ;
   private boolean[] P00YD5_n1175CombPre ;
   private String[] P00YD6_A396EmprCod ;
   private int[] P00YD6_A252CliCod ;
   private boolean[] P00YD6_n252CliCod ;
   private String[] P00YD6_A65ArtCod ;
   private String[] P00YD6_A1177Dibujo ;
   private int[] P00YD6_A1790DibIntCod ;
   private String[] P00YD6_A1176CombCod ;
   private int[] P00YD6_A1750ComLimMax ;
   private boolean[] P00YD6_n1750ComLimMax ;
   private int[] P00YD6_A1751ComLimMin ;
   private boolean[] P00YD6_n1751ComLimMin ;
   private java.math.BigDecimal[] P00YD6_A1752ComLimPre ;
   private boolean[] P00YD6_n1752ComLimPre ;
   private short[] P00YD6_A1769LinCom ;
}

final  class pbuspes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00YD2", "SELECT T1.DisCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.DibInt, T2.DibCli, T1.BarSer, T1.CliCod FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YD3", "SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod, FondCod, CombCod, FondPre FROM TXPLPREFO WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Dibujo = ? and DibIntCod = ? and CombCod = ? and FondCod = ? ORDER BY EmprCod, CliCod, ArtCod, Dibujo, DibIntCod, CombCod, FondCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YD4", "SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod, CombCod, FondCod, FonLimMax, FonLimMin, FonLimPre, LinFon FROM TXPLIMFON WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Dibujo = ? and DibIntCod = ? and CombCod = ? and FondCod = ? ORDER BY EmprCod, CliCod, ArtCod, Dibujo, DibIntCod, CombCod, FondCod, LinFon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YD5", "SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod, CombCod, CombPre FROM TXPLPRECO WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Dibujo = ? and DibIntCod = ? and CombCod = ? ORDER BY EmprCod, CliCod, ArtCod, Dibujo, DibIntCod, CombCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YD6", "SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod, CombCod, ComLimMax, ComLimMin, ComLimPre, LinCom FROM TXPLIMCOM WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Dibujo = ? and DibIntCod = ? and CombCod = ? ORDER BY EmprCod, CliCod, ArtCod, Dibujo, DibIntCod, CombCod, LinCom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YD7", "UPDATE TXPBARCOM SET BarPrcMtr=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(11);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(10);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               stmt.setString(6, (String)parms[8], 12);
               stmt.setString(7, (String)parms[9], 12);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 16);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 12);
               stmt.setString(7, (String)parms[7], 12);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               stmt.setString(6, (String)parms[8], 12);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 16);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 12);
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 12);
               stmt.setString(8, (String)parms[8], 12);
               return;
      }
   }

}

