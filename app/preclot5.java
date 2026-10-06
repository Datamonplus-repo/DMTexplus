package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preclot5 extends GXProcedure
{
   public preclot5( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preclot5.class ), "" );
   }

   public preclot5( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 )
   {
      preclot5.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        java.util.Date[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      preclot5.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      preclot5.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      preclot5.this.AV14RecLote = aP2[0];
      this.aP2 = aP2;
      preclot5.this.AV25PrdLoteFch = aP3[0];
      this.aP3 = aP3;
      preclot5.this.AV21LoteCon = aP4[0];
      this.aP4 = aP4;
      preclot5.this.AV26almprdid = aP5[0];
      this.aP5 = aP5;
      preclot5.this.AV22Usurcod = aP6[0];
      this.aP6 = aP6;
      preclot5.this.AV23Station = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV15carvema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
      preclot5.this.GXt_int1 = GXv_int2[0] ;
      AV15carvema = GXt_int1 ;
      GXt_int1 = AV20Artemalha ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEMH", ""), GXv_int2) ;
      preclot5.this.GXt_int1 = GXv_int2[0] ;
      AV20Artemalha = GXt_int1 ;
      AV19RecProv = 0 ;
      AV24inc_obs = " " ;
      /* Using cursor P047L2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A718PrdNom = P047L2_A718PrdNom[0] ;
         A10881PrdLote = P047L2_A10881PrdLote[0] ;
         A13971PrdLoteFch = P047L2_A13971PrdLoteFch[0] ;
         n13971PrdLoteFch = P047L2_n13971PrdLoteFch[0] ;
         A13927AlmPrdID = P047L2_A13927AlmPrdID[0] ;
         n13927AlmPrdID = P047L2_n13927AlmPrdID[0] ;
         A795PrvNum = P047L2_A795PrvNum[0] ;
         AV24inc_obs = httpContext.getMessage( "Producto = ", "") + GXutil.trim( A719PrdNum) + " " + GXutil.trim( A718PrdNom) + GXutil.newLine( ) ;
         AV24inc_obs += httpContext.getMessage( "Cambio Lote  de ", "") + GXutil.trim( A10881PrdLote) + httpContext.getMessage( " a ", "") + GXutil.trim( AV14RecLote) + GXutil.newLine( ) ;
         AV24inc_obs += httpContext.getMessage( "Cambio Fecha de ", "") + GXutil.trim( localUtil.dtoc( A13971PrdLoteFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( " a ", "") + GXutil.trim( localUtil.dtoc( AV25PrdLoteFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + GXutil.newLine( ) ;
         AV24inc_obs += httpContext.getMessage( "Cambio Almacenn ", "") + GXutil.trim( GXutil.str( A13927AlmPrdID, 4, 0)) + httpContext.getMessage( " a ", "") + GXutil.trim( GXutil.str( AV26almprdid, 4, 0)) + GXutil.newLine( ) ;
         A10881PrdLote = AV14RecLote ;
         A13971PrdLoteFch = AV25PrdLoteFch ;
         n13971PrdLoteFch = false ;
         AV19RecProv = A795PrvNum ;
         A13927AlmPrdID = AV26almprdid ;
         n13927AlmPrdID = false ;
         /* Using cursor P047L3 */
         pr_default.execute(1, new Object[] {A10881PrdLote, Boolean.valueOf(n13971PrdLoteFch), A13971PrdLoteFch, Boolean.valueOf(n13927AlmPrdID), Short.valueOf(A13927AlmPrdID), A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV24inc_obs, "") != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV30Pgmname, AV22Usurcod, AV23Station, AV24inc_obs, 99999999, (byte)(0), "") ;
      }
      AV24inc_obs = " " ;
      /* Using cursor P047L4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, AV14RecLote});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A11664LoteID = P047L4_A11664LoteID[0] ;
         A11668LoteCon = P047L4_A11668LoteCon[0] ;
         A718PrdNom = P047L4_A718PrdNom[0] ;
         A11665LoteFec = P047L4_A11665LoteFec[0] ;
         A718PrdNom = P047L4_A718PrdNom[0] ;
         if ( GXutil.strcmp(A11668LoteCon, AV21LoteCon) != 0 )
         {
            AV24inc_obs = httpContext.getMessage( "LOte ID = ", "") + GXutil.trim( AV14RecLote) + GXutil.newLine( ) ;
            AV24inc_obs += httpContext.getMessage( "Producto = ", "") + GXutil.trim( A719PrdNum) + " " + GXutil.trim( A718PrdNom) + GXutil.newLine( ) ;
            AV24inc_obs += httpContext.getMessage( "Cambio Consumo de ", "") + A11668LoteCon + httpContext.getMessage( " a ", "") + AV21LoteCon + GXutil.newLine( ) ;
            A11668LoteCon = AV21LoteCon ;
         }
         /* Using cursor P047L5 */
         pr_default.execute(3, new Object[] {A11668LoteCon, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A11664LoteID, A11665LoteFec});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOTPRD");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV24inc_obs, "") != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV30Pgmname, AV22Usurcod, AV23Station, AV24inc_obs, 99999999, (byte)(0), "") ;
      }
      if ( AV15carvema == 1 )
      {
         /* Using cursor P047L6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A686PrdCant = P047L6_A686PrdCant[0] ;
            A129BarCod = P047L6_A129BarCod[0] ;
            A132BarCodReo = P047L6_A132BarCodReo[0] ;
            A130BarCodPar = P047L6_A130BarCodPar[0] ;
            A5058BarEnvLaw = P047L6_A5058BarEnvLaw[0] ;
            A5725RecLote = P047L6_A5725RecLote[0] ;
            A11708RecProv = P047L6_A11708RecProv[0] ;
            A12717RecFabId = P047L6_A12717RecFabId[0] ;
            A2804RecLinMaq = P047L6_A2804RecLinMaq[0] ;
            A1273RecLinPro = P047L6_A1273RecLinPro[0] ;
            A811RecLin = P047L6_A811RecLin[0] ;
            A5058BarEnvLaw = P047L6_A5058BarEnvLaw[0] ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A129BarCod ;
            GXv_int2[0] = A132BarCodReo ;
            GXv_char5[0] = A130BarCodPar ;
            GXv_int6[0] = AV16Barfasest ;
            GXv_date7[0] = AV17Barfecrini ;
            GXv_char8[0] = AV18maqcodbis ;
            new app.pplat07(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_char5, GXv_int6, GXv_date7, GXv_char8) ;
            preclot5.this.A396EmprCod = GXv_char3[0] ;
            preclot5.this.A129BarCod = GXv_int4[0] ;
            preclot5.this.A132BarCodReo = GXv_int2[0] ;
            preclot5.this.A130BarCodPar = GXv_char5[0] ;
            preclot5.this.AV16Barfasest = GXv_int6[0] ;
            preclot5.this.AV17Barfecrini = GXv_date7[0] ;
            preclot5.this.AV18maqcodbis = GXv_char8[0] ;
            if ( AV16Barfasest == 0 )
            {
               if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) && ( GXutil.strcmp(A5058BarEnvLaw, httpContext.getMessage( "S", "")) == 0 ) )
               {
               }
               else
               {
                  A5725RecLote = AV14RecLote ;
                  A11708RecProv = AV19RecProv ;
                  A12717RecFabId = AV19RecProv ;
               }
               Gx_msg = httpContext.getMessage( "Procesando .. ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + " " + GXutil.trim( A719PrdNum) ;
               System.out.println( Gx_msg );
            }
            /* Using cursor P047L7 */
            pr_default.execute(5, new Object[] {A5725RecLote, Integer.valueOf(A11708RecProv), Integer.valueOf(A12717RecFabId), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
      if ( AV20Artemalha == 1 )
      {
         /* Using cursor P047L8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A686PrdCant = P047L8_A686PrdCant[0] ;
            A5725RecLote = P047L8_A5725RecLote[0] ;
            A11708RecProv = P047L8_A11708RecProv[0] ;
            A130BarCodPar = P047L8_A130BarCodPar[0] ;
            A132BarCodReo = P047L8_A132BarCodReo[0] ;
            A129BarCod = P047L8_A129BarCod[0] ;
            A2804RecLinMaq = P047L8_A2804RecLinMaq[0] ;
            A1273RecLinPro = P047L8_A1273RecLinPro[0] ;
            A811RecLin = P047L8_A811RecLin[0] ;
            if ( GXutil.strcmp(A5725RecLote, " ") == 0 )
            {
               A5725RecLote = AV14RecLote ;
               A11708RecProv = AV19RecProv ;
               Gx_msg = httpContext.getMessage( "Procesando .. ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + " " + GXutil.trim( A719PrdNum) ;
               System.out.println( Gx_msg );
            }
            /* Using cursor P047L9 */
            pr_default.execute(7, new Object[] {A5725RecLote, Integer.valueOf(A11708RecProv), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
            pr_default.readNext(6);
         }
         pr_default.close(6);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = preclot5.this.A396EmprCod;
      this.aP1[0] = preclot5.this.A719PrdNum;
      this.aP2[0] = preclot5.this.AV14RecLote;
      this.aP3[0] = preclot5.this.AV25PrdLoteFch;
      this.aP4[0] = preclot5.this.AV21LoteCon;
      this.aP5[0] = preclot5.this.AV26almprdid;
      this.aP6[0] = preclot5.this.AV22Usurcod;
      this.aP7[0] = preclot5.this.AV23Station;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24inc_obs = "" ;
      scmdbuf = "" ;
      P047L2_A396EmprCod = new String[] {""} ;
      P047L2_A719PrdNum = new String[] {""} ;
      P047L2_n719PrdNum = new boolean[] {false} ;
      P047L2_A718PrdNom = new String[] {""} ;
      P047L2_A10881PrdLote = new String[] {""} ;
      P047L2_A13971PrdLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      P047L2_n13971PrdLoteFch = new boolean[] {false} ;
      P047L2_A13927AlmPrdID = new short[1] ;
      P047L2_n13927AlmPrdID = new boolean[] {false} ;
      P047L2_A795PrvNum = new int[1] ;
      A718PrdNom = "" ;
      A10881PrdLote = "" ;
      A13971PrdLoteFch = GXutil.nullDate() ;
      AV30Pgmname = "" ;
      P047L4_A396EmprCod = new String[] {""} ;
      P047L4_A719PrdNum = new String[] {""} ;
      P047L4_n719PrdNum = new boolean[] {false} ;
      P047L4_A11664LoteID = new String[] {""} ;
      P047L4_A11668LoteCon = new String[] {""} ;
      P047L4_A718PrdNom = new String[] {""} ;
      P047L4_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      A11664LoteID = "" ;
      A11668LoteCon = "" ;
      A11665LoteFec = GXutil.nullDate() ;
      P047L6_A396EmprCod = new String[] {""} ;
      P047L6_A719PrdNum = new String[] {""} ;
      P047L6_n719PrdNum = new boolean[] {false} ;
      P047L6_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P047L6_A129BarCod = new int[1] ;
      P047L6_A132BarCodReo = new byte[1] ;
      P047L6_A130BarCodPar = new String[] {""} ;
      P047L6_A5058BarEnvLaw = new String[] {""} ;
      P047L6_A5725RecLote = new String[] {""} ;
      P047L6_A11708RecProv = new int[1] ;
      P047L6_A12717RecFabId = new int[1] ;
      P047L6_A2804RecLinMaq = new short[1] ;
      P047L6_A1273RecLinPro = new byte[1] ;
      P047L6_A811RecLin = new short[1] ;
      A686PrdCant = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A5058BarEnvLaw = "" ;
      A5725RecLote = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new byte[1] ;
      AV17Barfecrini = GXutil.nullDate() ;
      GXv_date7 = new java.util.Date[1] ;
      AV18maqcodbis = "" ;
      GXv_char8 = new String[1] ;
      Gx_msg = "" ;
      P047L8_A396EmprCod = new String[] {""} ;
      P047L8_A719PrdNum = new String[] {""} ;
      P047L8_n719PrdNum = new boolean[] {false} ;
      P047L8_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P047L8_A5725RecLote = new String[] {""} ;
      P047L8_A11708RecProv = new int[1] ;
      P047L8_A130BarCodPar = new String[] {""} ;
      P047L8_A132BarCodReo = new byte[1] ;
      P047L8_A129BarCod = new int[1] ;
      P047L8_A2804RecLinMaq = new short[1] ;
      P047L8_A1273RecLinPro = new byte[1] ;
      P047L8_A811RecLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preclot5__default(),
         new Object[] {
             new Object[] {
            P047L2_A396EmprCod, P047L2_A719PrdNum, P047L2_A718PrdNom, P047L2_A10881PrdLote, P047L2_A13971PrdLoteFch, P047L2_n13971PrdLoteFch, P047L2_A13927AlmPrdID, P047L2_n13927AlmPrdID, P047L2_A795PrvNum
            }
            , new Object[] {
            }
            , new Object[] {
            P047L4_A396EmprCod, P047L4_A719PrdNum, P047L4_A11664LoteID, P047L4_A11668LoteCon, P047L4_A718PrdNom, P047L4_A11665LoteFec
            }
            , new Object[] {
            }
            , new Object[] {
            P047L6_A396EmprCod, P047L6_A719PrdNum, P047L6_n719PrdNum, P047L6_A686PrdCant, P047L6_A129BarCod, P047L6_A132BarCodReo, P047L6_A130BarCodPar, P047L6_A5058BarEnvLaw, P047L6_A5725RecLote, P047L6_A11708RecProv,
            P047L6_A12717RecFabId, P047L6_A2804RecLinMaq, P047L6_A1273RecLinPro, P047L6_A811RecLin
            }
            , new Object[] {
            }
            , new Object[] {
            P047L8_A396EmprCod, P047L8_A719PrdNum, P047L8_n719PrdNum, P047L8_A686PrdCant, P047L8_A5725RecLote, P047L8_A11708RecProv, P047L8_A130BarCodPar, P047L8_A132BarCodReo, P047L8_A129BarCod, P047L8_A2804RecLinMaq,
            P047L8_A1273RecLinPro, P047L8_A811RecLin
            }
            , new Object[] {
            }
         }
      );
      AV30Pgmname = "PRECLOT5" ;
      /* GeneXus formulas. */
      AV30Pgmname = "PRECLOT5" ;
      Gx_err = (short)(0) ;
   }

   private byte AV15carvema ;
   private byte AV20Artemalha ;
   private byte GXt_int1 ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte GXv_int2[] ;
   private byte AV16Barfasest ;
   private byte GXv_int6[] ;
   private short AV26almprdid ;
   private short A13927AlmPrdID ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int AV19RecProv ;
   private int A795PrvNum ;
   private int A129BarCod ;
   private int A11708RecProv ;
   private int A12717RecFabId ;
   private int GXv_int4[] ;
   private java.math.BigDecimal A686PrdCant ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV14RecLote ;
   private String AV21LoteCon ;
   private String AV22Usurcod ;
   private String AV23Station ;
   private String scmdbuf ;
   private String A718PrdNom ;
   private String A10881PrdLote ;
   private String AV30Pgmname ;
   private String A11664LoteID ;
   private String A11668LoteCon ;
   private String A130BarCodPar ;
   private String A5058BarEnvLaw ;
   private String A5725RecLote ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String AV18maqcodbis ;
   private String GXv_char8[] ;
   private String Gx_msg ;
   private java.util.Date AV25PrdLoteFch ;
   private java.util.Date A13971PrdLoteFch ;
   private java.util.Date A11665LoteFec ;
   private java.util.Date AV17Barfecrini ;
   private java.util.Date GXv_date7[] ;
   private boolean n719PrdNum ;
   private boolean n13971PrdLoteFch ;
   private boolean n13927AlmPrdID ;
   private String AV24inc_obs ;
   private String[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private java.util.Date[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P047L2_A396EmprCod ;
   private String[] P047L2_A719PrdNum ;
   private boolean[] P047L2_n719PrdNum ;
   private String[] P047L2_A718PrdNom ;
   private String[] P047L2_A10881PrdLote ;
   private java.util.Date[] P047L2_A13971PrdLoteFch ;
   private boolean[] P047L2_n13971PrdLoteFch ;
   private short[] P047L2_A13927AlmPrdID ;
   private boolean[] P047L2_n13927AlmPrdID ;
   private int[] P047L2_A795PrvNum ;
   private String[] P047L4_A396EmprCod ;
   private String[] P047L4_A719PrdNum ;
   private boolean[] P047L4_n719PrdNum ;
   private String[] P047L4_A11664LoteID ;
   private String[] P047L4_A11668LoteCon ;
   private String[] P047L4_A718PrdNom ;
   private java.util.Date[] P047L4_A11665LoteFec ;
   private String[] P047L6_A396EmprCod ;
   private String[] P047L6_A719PrdNum ;
   private boolean[] P047L6_n719PrdNum ;
   private java.math.BigDecimal[] P047L6_A686PrdCant ;
   private int[] P047L6_A129BarCod ;
   private byte[] P047L6_A132BarCodReo ;
   private String[] P047L6_A130BarCodPar ;
   private String[] P047L6_A5058BarEnvLaw ;
   private String[] P047L6_A5725RecLote ;
   private int[] P047L6_A11708RecProv ;
   private int[] P047L6_A12717RecFabId ;
   private short[] P047L6_A2804RecLinMaq ;
   private byte[] P047L6_A1273RecLinPro ;
   private short[] P047L6_A811RecLin ;
   private String[] P047L8_A396EmprCod ;
   private String[] P047L8_A719PrdNum ;
   private boolean[] P047L8_n719PrdNum ;
   private java.math.BigDecimal[] P047L8_A686PrdCant ;
   private String[] P047L8_A5725RecLote ;
   private int[] P047L8_A11708RecProv ;
   private String[] P047L8_A130BarCodPar ;
   private byte[] P047L8_A132BarCodReo ;
   private int[] P047L8_A129BarCod ;
   private short[] P047L8_A2804RecLinMaq ;
   private byte[] P047L8_A1273RecLinPro ;
   private short[] P047L8_A811RecLin ;
}

final  class preclot5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P047L2", "SELECT EmprCod, PrdNum, PrdNom, PrdLote, PrdLoteFch, AlmPrdID, PrvNum FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P047L3", "UPDATE TXPPRODUC SET PrdLote=?, PrdLoteFch=?, AlmPrdID=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new ForEachCursor("P047L4", "SELECT T1.EmprCod, T1.PrdNum, T1.LoteID, T1.LoteCon, T2.PrdNom, T1.LoteFec FROM (TXPLOTPRD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.LoteID = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.LoteID ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P047L5", "UPDATE TXPLOTPRD SET LoteCon=?  WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLOTPRD")
         ,new ForEachCursor("P047L6", "SELECT T1.EmprCod, T1.PrdNum, T1.PrdCant, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarEnvLaw, T1.RecLote, T1.RecProv, T1.RecFabId, T1.RecLinMaq, T1.RecLinPro, T1.RecLin FROM (TXPLRECET T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P047L7", "UPDATE TXPLRECET SET RecLote=?, RecProv=?, RecFabId=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new ForEachCursor("P047L8", "SELECT EmprCod, PrdNum, PrdCant, RecLote, RecProv, BarCodPar, BarCodReo, BarCod, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P047L9", "UPDATE TXPLRECET SET RecLote=?, RecProv=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
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
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 26);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[2]);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               stmt.setString(4, (String)parms[5], 3);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 6);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 26);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               stmt.setString(4, (String)parms[4], 26);
               stmt.setDate(5, (java.util.Date)parms[5]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
      }
   }

}

