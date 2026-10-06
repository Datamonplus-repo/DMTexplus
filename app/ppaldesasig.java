package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppaldesasig extends GXProcedure
{
   public ppaldesasig( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppaldesasig.class ), "" );
   }

   public ppaldesasig( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 )
   {
      ppaldesasig.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      ppaldesasig.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppaldesasig.this.A966PartCod = aP1[0];
      this.aP1 = aP1;
      ppaldesasig.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      ppaldesasig.this.AV8PartAlbDis = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P024I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(AV8PartAlbDis)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A981PartAlbDis = P024I2_A981PartAlbDis[0] ;
         n981PartAlbDis = P024I2_n981PartAlbDis[0] ;
         A5913PartPalEst = P024I2_A5913PartPalEst[0] ;
         n5913PartPalEst = P024I2_n5913PartPalEst[0] ;
         A5912PartPalUti = P024I2_A5912PartPalUti[0] ;
         n5912PartPalUti = P024I2_n5912PartPalUti[0] ;
         A984KilEnt = P024I2_A984KilEnt[0] ;
         n984KilEnt = P024I2_n984KilEnt[0] ;
         A985ConEnt = P024I2_A985ConEnt[0] ;
         n985ConEnt = P024I2_n985ConEnt[0] ;
         A979PartLin = P024I2_A979PartLin[0] ;
         A5913PartPalEst = httpContext.getMessage( "A", "") ;
         n5913PartPalEst = false ;
         A5912PartPalUti = httpContext.getMessage( "N", "") ;
         n5912PartPalUti = false ;
         AV12Kilos = A984KilEnt ;
         AV13Conos = A985ConEnt ;
         /* Using cursor P024I3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n5913PartPalEst), A5913PartPalEst, Boolean.valueOf(n5912PartPalUti), A5912PartPalUti, A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P024I4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A361DisCod = P024I4_A361DisCod[0] ;
         W966PartCod = A966PartCod ;
         n966PartCod = false ;
         W252CliCod = A252CliCod ;
         n252CliCod = false ;
         /* Using cursor P024I5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A130BarCodPar = P024I5_A130BarCodPar[0] ;
            A132BarCodReo = P024I5_A132BarCodReo[0] ;
            A129BarCod = P024I5_A129BarCod[0] ;
            W361DisCod = A361DisCod ;
            /* Using cursor P024I6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(AV8PartAlbDis)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A361DisCod = P024I6_A361DisCod[0] ;
               A1157TipConCod = P024I6_A1157TipConCod[0] ;
               n1157TipConCod = P024I6_n1157TipConCod[0] ;
               A252CliCod = P024I6_A252CliCod[0] ;
               n252CliCod = P024I6_n252CliCod[0] ;
               A966PartCod = P024I6_A966PartCod[0] ;
               n966PartCod = P024I6_n966PartCod[0] ;
               A5908PartPal = P024I6_A5908PartPal[0] ;
               A361DisCod = P024I6_A361DisCod[0] ;
               A252CliCod = P024I6_A252CliCod[0] ;
               n252CliCod = P024I6_n252CliCod[0] ;
               A1157TipConCod = P024I6_A1157TipConCod[0] ;
               n1157TipConCod = P024I6_n1157TipConCod[0] ;
               A966PartCod = P024I6_A966PartCod[0] ;
               n966PartCod = P024I6_n966PartCod[0] ;
               AV17GXLvl25 = (byte)(0) ;
               /* Using cursor P024I7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1157TipConCod), Short.valueOf(A1157TipConCod), Integer.valueOf(A129BarCod), AV12Kilos});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A981PartAlbDis = P024I7_A981PartAlbDis[0] ;
                  n981PartAlbDis = P024I7_n981PartAlbDis[0] ;
                  A986KilUti = P024I7_A986KilUti[0] ;
                  n986KilUti = P024I7_n986KilUti[0] ;
                  A980PartLinTip = P024I7_A980PartLinTip[0] ;
                  n980PartLinTip = P024I7_n980PartLinTip[0] ;
                  A979PartLin = P024I7_A979PartLin[0] ;
                  if ( ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "R", "")) == 0 ) || ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "B", "")) == 0 ) )
                  {
                     AV17GXLvl25 = (byte)(1) ;
                     /* Using cursor P024I8 */
                     pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
                  }
                  pr_default.readNext(5);
               }
               pr_default.close(5);
               if ( AV17GXLvl25 == 0 )
               {
                  /* Using cursor P024I9 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1157TipConCod), Short.valueOf(A1157TipConCod), Integer.valueOf(A129BarCod)});
                  while ( (pr_default.getStatus(7) != 101) )
                  {
                     A981PartAlbDis = P024I9_A981PartAlbDis[0] ;
                     n981PartAlbDis = P024I9_n981PartAlbDis[0] ;
                     A980PartLinTip = P024I9_A980PartLinTip[0] ;
                     n980PartLinTip = P024I9_n980PartLinTip[0] ;
                     A986KilUti = P024I9_A986KilUti[0] ;
                     n986KilUti = P024I9_n986KilUti[0] ;
                     A987ConUti = P024I9_A987ConUti[0] ;
                     n987ConUti = P024I9_n987ConUti[0] ;
                     A979PartLin = P024I9_A979PartLin[0] ;
                     if ( ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "R", "")) == 0 ) || ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "B", "")) == 0 ) )
                     {
                        A986KilUti = A986KilUti.subtract(AV12Kilos) ;
                        n986KilUti = false ;
                        A987ConUti = (short)(A987ConUti-AV13Conos) ;
                        n987ConUti = false ;
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        /* Using cursor P024I10 */
                        pr_default.execute(8, new Object[] {Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti), A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
                        if (true) break;
                        /* Using cursor P024I11 */
                        pr_default.execute(9, new Object[] {Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti), A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
                     }
                     pr_default.readNext(7);
                  }
                  pr_default.close(7);
               }
               /* Using cursor P024I12 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5908PartPal)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPalSal");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(4);
            A361DisCod = W361DisCod ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         A966PartCod = W966PartCod ;
         n966PartCod = false ;
         A252CliCod = W252CliCod ;
         n252CliCod = false ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppaldesasig.this.A396EmprCod;
      this.aP1[0] = ppaldesasig.this.A966PartCod;
      this.aP2[0] = ppaldesasig.this.A252CliCod;
      this.aP3[0] = ppaldesasig.this.AV8PartAlbDis;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppaldesasig");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P024I2_A396EmprCod = new String[] {""} ;
      P024I2_A966PartCod = new String[] {""} ;
      P024I2_n966PartCod = new boolean[] {false} ;
      P024I2_A252CliCod = new int[1] ;
      P024I2_n252CliCod = new boolean[] {false} ;
      P024I2_A981PartAlbDis = new int[1] ;
      P024I2_n981PartAlbDis = new boolean[] {false} ;
      P024I2_A5913PartPalEst = new String[] {""} ;
      P024I2_n5913PartPalEst = new boolean[] {false} ;
      P024I2_A5912PartPalUti = new String[] {""} ;
      P024I2_n5912PartPalUti = new boolean[] {false} ;
      P024I2_A984KilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P024I2_n984KilEnt = new boolean[] {false} ;
      P024I2_A985ConEnt = new short[1] ;
      P024I2_n985ConEnt = new boolean[] {false} ;
      P024I2_A979PartLin = new int[1] ;
      A5913PartPalEst = "" ;
      A5912PartPalUti = "" ;
      A984KilEnt = DecimalUtil.ZERO ;
      AV12Kilos = DecimalUtil.ZERO ;
      P024I4_A396EmprCod = new String[] {""} ;
      P024I4_A966PartCod = new String[] {""} ;
      P024I4_n966PartCod = new boolean[] {false} ;
      P024I4_A252CliCod = new int[1] ;
      P024I4_n252CliCod = new boolean[] {false} ;
      P024I4_A361DisCod = new int[1] ;
      W966PartCod = "" ;
      P024I5_A396EmprCod = new String[] {""} ;
      P024I5_A361DisCod = new int[1] ;
      P024I5_A252CliCod = new int[1] ;
      P024I5_n252CliCod = new boolean[] {false} ;
      P024I5_A130BarCodPar = new String[] {""} ;
      P024I5_A132BarCodReo = new byte[1] ;
      P024I5_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      P024I6_A361DisCod = new int[1] ;
      P024I6_A396EmprCod = new String[] {""} ;
      P024I6_A129BarCod = new int[1] ;
      P024I6_A132BarCodReo = new byte[1] ;
      P024I6_A130BarCodPar = new String[] {""} ;
      P024I6_A1157TipConCod = new short[1] ;
      P024I6_n1157TipConCod = new boolean[] {false} ;
      P024I6_A252CliCod = new int[1] ;
      P024I6_n252CliCod = new boolean[] {false} ;
      P024I6_A966PartCod = new String[] {""} ;
      P024I6_n966PartCod = new boolean[] {false} ;
      P024I6_A5908PartPal = new int[1] ;
      P024I7_A396EmprCod = new String[] {""} ;
      P024I7_A966PartCod = new String[] {""} ;
      P024I7_n966PartCod = new boolean[] {false} ;
      P024I7_A252CliCod = new int[1] ;
      P024I7_n252CliCod = new boolean[] {false} ;
      P024I7_A1157TipConCod = new short[1] ;
      P024I7_n1157TipConCod = new boolean[] {false} ;
      P024I7_A981PartAlbDis = new int[1] ;
      P024I7_n981PartAlbDis = new boolean[] {false} ;
      P024I7_A986KilUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P024I7_n986KilUti = new boolean[] {false} ;
      P024I7_A980PartLinTip = new String[] {""} ;
      P024I7_n980PartLinTip = new boolean[] {false} ;
      P024I7_A979PartLin = new int[1] ;
      A986KilUti = DecimalUtil.ZERO ;
      A980PartLinTip = "" ;
      P024I9_A396EmprCod = new String[] {""} ;
      P024I9_A966PartCod = new String[] {""} ;
      P024I9_n966PartCod = new boolean[] {false} ;
      P024I9_A252CliCod = new int[1] ;
      P024I9_n252CliCod = new boolean[] {false} ;
      P024I9_A1157TipConCod = new short[1] ;
      P024I9_n1157TipConCod = new boolean[] {false} ;
      P024I9_A981PartAlbDis = new int[1] ;
      P024I9_n981PartAlbDis = new boolean[] {false} ;
      P024I9_A980PartLinTip = new String[] {""} ;
      P024I9_n980PartLinTip = new boolean[] {false} ;
      P024I9_A986KilUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P024I9_n986KilUti = new boolean[] {false} ;
      P024I9_A987ConUti = new short[1] ;
      P024I9_n987ConUti = new boolean[] {false} ;
      P024I9_A979PartLin = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppaldesasig__default(),
         new Object[] {
             new Object[] {
            P024I2_A396EmprCod, P024I2_A966PartCod, P024I2_A252CliCod, P024I2_A981PartAlbDis, P024I2_n981PartAlbDis, P024I2_A5913PartPalEst, P024I2_n5913PartPalEst, P024I2_A5912PartPalUti, P024I2_n5912PartPalUti, P024I2_A984KilEnt,
            P024I2_n984KilEnt, P024I2_A985ConEnt, P024I2_n985ConEnt, P024I2_A979PartLin
            }
            , new Object[] {
            }
            , new Object[] {
            P024I4_A396EmprCod, P024I4_A966PartCod, P024I4_n966PartCod, P024I4_A252CliCod, P024I4_A361DisCod
            }
            , new Object[] {
            P024I5_A396EmprCod, P024I5_A361DisCod, P024I5_A252CliCod, P024I5_n252CliCod, P024I5_A130BarCodPar, P024I5_A132BarCodReo, P024I5_A129BarCod
            }
            , new Object[] {
            P024I6_A361DisCod, P024I6_A396EmprCod, P024I6_A129BarCod, P024I6_A132BarCodReo, P024I6_A130BarCodPar, P024I6_A1157TipConCod, P024I6_n1157TipConCod, P024I6_A252CliCod, P024I6_n252CliCod, P024I6_A966PartCod,
            P024I6_n966PartCod, P024I6_A5908PartPal
            }
            , new Object[] {
            P024I7_A396EmprCod, P024I7_A966PartCod, P024I7_A252CliCod, P024I7_A1157TipConCod, P024I7_n1157TipConCod, P024I7_A981PartAlbDis, P024I7_n981PartAlbDis, P024I7_A986KilUti, P024I7_n986KilUti, P024I7_A980PartLinTip,
            P024I7_n980PartLinTip, P024I7_A979PartLin
            }
            , new Object[] {
            }
            , new Object[] {
            P024I9_A396EmprCod, P024I9_A966PartCod, P024I9_A252CliCod, P024I9_A1157TipConCod, P024I9_n1157TipConCod, P024I9_A981PartAlbDis, P024I9_n981PartAlbDis, P024I9_A980PartLinTip, P024I9_n980PartLinTip, P024I9_A986KilUti,
            P024I9_n986KilUti, P024I9_A987ConUti, P024I9_n987ConUti, P024I9_A979PartLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV17GXLvl25 ;
   private short A985ConEnt ;
   private short AV13Conos ;
   private short A1157TipConCod ;
   private short A987ConUti ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV8PartAlbDis ;
   private int A981PartAlbDis ;
   private int A979PartLin ;
   private int A361DisCod ;
   private int W252CliCod ;
   private int A129BarCod ;
   private int W361DisCod ;
   private int A5908PartPal ;
   private java.math.BigDecimal A984KilEnt ;
   private java.math.BigDecimal AV12Kilos ;
   private java.math.BigDecimal A986KilUti ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String scmdbuf ;
   private String A5913PartPalEst ;
   private String A5912PartPalUti ;
   private String W966PartCod ;
   private String A130BarCodPar ;
   private String A980PartLinTip ;
   private boolean n966PartCod ;
   private boolean n252CliCod ;
   private boolean n981PartAlbDis ;
   private boolean n5913PartPalEst ;
   private boolean n5912PartPalUti ;
   private boolean n984KilEnt ;
   private boolean n985ConEnt ;
   private boolean n1157TipConCod ;
   private boolean n986KilUti ;
   private boolean n980PartLinTip ;
   private boolean n987ConUti ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P024I2_A396EmprCod ;
   private String[] P024I2_A966PartCod ;
   private boolean[] P024I2_n966PartCod ;
   private int[] P024I2_A252CliCod ;
   private boolean[] P024I2_n252CliCod ;
   private int[] P024I2_A981PartAlbDis ;
   private boolean[] P024I2_n981PartAlbDis ;
   private String[] P024I2_A5913PartPalEst ;
   private boolean[] P024I2_n5913PartPalEst ;
   private String[] P024I2_A5912PartPalUti ;
   private boolean[] P024I2_n5912PartPalUti ;
   private java.math.BigDecimal[] P024I2_A984KilEnt ;
   private boolean[] P024I2_n984KilEnt ;
   private short[] P024I2_A985ConEnt ;
   private boolean[] P024I2_n985ConEnt ;
   private int[] P024I2_A979PartLin ;
   private String[] P024I4_A396EmprCod ;
   private String[] P024I4_A966PartCod ;
   private boolean[] P024I4_n966PartCod ;
   private int[] P024I4_A252CliCod ;
   private boolean[] P024I4_n252CliCod ;
   private int[] P024I4_A361DisCod ;
   private String[] P024I5_A396EmprCod ;
   private int[] P024I5_A361DisCod ;
   private int[] P024I5_A252CliCod ;
   private boolean[] P024I5_n252CliCod ;
   private String[] P024I5_A130BarCodPar ;
   private byte[] P024I5_A132BarCodReo ;
   private int[] P024I5_A129BarCod ;
   private int[] P024I6_A361DisCod ;
   private String[] P024I6_A396EmprCod ;
   private int[] P024I6_A129BarCod ;
   private byte[] P024I6_A132BarCodReo ;
   private String[] P024I6_A130BarCodPar ;
   private short[] P024I6_A1157TipConCod ;
   private boolean[] P024I6_n1157TipConCod ;
   private int[] P024I6_A252CliCod ;
   private boolean[] P024I6_n252CliCod ;
   private String[] P024I6_A966PartCod ;
   private boolean[] P024I6_n966PartCod ;
   private int[] P024I6_A5908PartPal ;
   private String[] P024I7_A396EmprCod ;
   private String[] P024I7_A966PartCod ;
   private boolean[] P024I7_n966PartCod ;
   private int[] P024I7_A252CliCod ;
   private boolean[] P024I7_n252CliCod ;
   private short[] P024I7_A1157TipConCod ;
   private boolean[] P024I7_n1157TipConCod ;
   private int[] P024I7_A981PartAlbDis ;
   private boolean[] P024I7_n981PartAlbDis ;
   private java.math.BigDecimal[] P024I7_A986KilUti ;
   private boolean[] P024I7_n986KilUti ;
   private String[] P024I7_A980PartLinTip ;
   private boolean[] P024I7_n980PartLinTip ;
   private int[] P024I7_A979PartLin ;
   private String[] P024I9_A396EmprCod ;
   private String[] P024I9_A966PartCod ;
   private boolean[] P024I9_n966PartCod ;
   private int[] P024I9_A252CliCod ;
   private boolean[] P024I9_n252CliCod ;
   private short[] P024I9_A1157TipConCod ;
   private boolean[] P024I9_n1157TipConCod ;
   private int[] P024I9_A981PartAlbDis ;
   private boolean[] P024I9_n981PartAlbDis ;
   private String[] P024I9_A980PartLinTip ;
   private boolean[] P024I9_n980PartLinTip ;
   private java.math.BigDecimal[] P024I9_A986KilUti ;
   private boolean[] P024I9_n986KilUti ;
   private short[] P024I9_A987ConUti ;
   private boolean[] P024I9_n987ConUti ;
   private int[] P024I9_A979PartLin ;
}

final  class ppaldesasig__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P024I2", "SELECT EmprCod, PartCod, CliCod, PartAlbDis, PartPalEst, PartPalUti, KilEnt, ConEnt, PartLin FROM TXPLPARTI WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (PartAlbDis = ?) ORDER BY EmprCod, PartCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P024I3", "UPDATE TXPLPARTI SET PartPalEst=?, PartPalUti=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND PartLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new ForEachCursor("P024I4", "SELECT EmprCod, PartCod, CliCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P024I5", "SELECT EmprCod, DisCod, CliCod, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE (EmprCod = ? and DisCod = ?) AND (CliCod = ?) ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P024I6", "SELECT T2.DisCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.TipConCod, T2.CliCod, T3.PartCod, T1.PartPal FROM ((TXPPalSal T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T2.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.PartPal = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.PartPal ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P024I7", "SELECT EmprCod, PartCod, CliCod, TipConCod, PartAlbDis, KilUti, PartLinTip, PartLin FROM TXPLPARTI WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (TipConCod = ?) AND (PartAlbDis = ?) AND (KilUti = ?) ORDER BY EmprCod, PartCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P024I8", "DELETE FROM TXPLPARTI  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND PartLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new ForEachCursor("P024I9", "SELECT EmprCod, PartCod, CliCod, TipConCod, PartAlbDis, PartLinTip, KilUti, ConUti, PartLin FROM TXPLPARTI WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (TipConCod = ?) AND (PartAlbDis = ?) ORDER BY EmprCod DESC, PartCod DESC, CliCod DESC, PartLin DESC ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P024I10", "UPDATE TXPLPARTI SET KilUti=?, ConUti=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND PartLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new UpdateCursor("P024I11", "UPDATE TXPLPARTI SET KilUti=?, ConUti=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND PartLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new UpdateCursor("P024I12", "DELETE FROM TXPPalSal  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND PartPal = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPalSal")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               stmt.setInt(6, ((Number) parms[9]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               stmt.setInt(5, ((Number) parms[7]).intValue());
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               stmt.setInt(6, ((Number) parms[9]).intValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               stmt.setInt(6, ((Number) parms[9]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

