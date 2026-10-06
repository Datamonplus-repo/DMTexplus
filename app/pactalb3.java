package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactalb3 extends GXProcedure
{
   public pactalb3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactalb3.class ), "" );
   }

   public pactalb3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           int[] aP2 ,
                                           String[] aP3 ,
                                           java.math.BigDecimal[] aP4 )
   {
      pactalb3.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pactalb3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactalb3.this.AV14DisCod = aP1[0];
      this.aP1 = aP1;
      pactalb3.this.A44AlbRecCod = aP2[0];
      this.aP2 = aP2;
      pactalb3.this.A2159AlbRecPie = aP3[0];
      this.aP3 = aP3;
      pactalb3.this.AV11Kilos = aP4[0];
      this.aP4 = aP4;
      pactalb3.this.AV12Metros = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13FlagPRef = (byte)(0) ;
      GXv_int1[0] = AV13FlagPRef ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PZAREF", ""), GXv_int1) ;
      pactalb3.this.AV13FlagPRef = GXv_int1[0] ;
      GXv_int1[0] = AV17Martex ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MARTEX", ""), GXv_int1) ;
      pactalb3.this.AV17Martex = GXv_int1[0] ;
      AV19TermCod = context.getWorkstationId( remoteHandle) ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV20EmprNOm ;
      GXv_char4[0] = AV21Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV19TermCod, GXv_char2, GXv_char3, GXv_char4) ;
      pactalb3.this.A396EmprCod = GXv_char2[0] ;
      pactalb3.this.AV20EmprNOm = GXv_char3[0] ;
      pactalb3.this.AV21Usurcod = GXv_char4[0] ;
      /* Using cursor P04A72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2154AlbRecAnh = P04A72_A2154AlbRecAnh[0] ;
         A50AlbRLoc = P04A72_A50AlbRLoc[0] ;
         A3731AlbRecIdPz = P04A72_A3731AlbRecIdPz[0] ;
         A2156AlbRecKgmU = P04A72_A2156AlbRecKgmU[0] ;
         A2158AlbRecMtrU = P04A72_A2158AlbRecMtrU[0] ;
         A50AlbRLoc = P04A72_A50AlbRLoc[0] ;
         W396EmprCod = A396EmprCod ;
         W44AlbRecCod = A44AlbRecCod ;
         /*
            INSERT RECORD ON TABLE TXPDISALD

         */
         W44AlbRecCod = A44AlbRecCod ;
         W396EmprCod = A396EmprCod ;
         A361DisCod = AV14DisCod ;
         A2185DisPieAnc = A2154AlbRecAnh ;
         A380DisPieCod = A2159AlbRecPie ;
         A382DisPieKil = AV11Kilos ;
         A384DisPieMet = AV12Metros ;
         A5099DisPieEst = (byte)(0) ;
         A2184DisPieLoc = ((AV13FlagPRef==1) ? A3731AlbRecIdPz : A50AlbRLoc) ;
         if ( AV17Martex == 1 )
         {
            if ( GXutil.strcmp(A3731AlbRecIdPz, httpContext.getMessage( "AUTOMATICO", "")) == 0 )
            {
               A2184DisPieLoc = GXutil.substring( A3731AlbRecIdPz, 1, 10) ;
            }
            else
            {
               A2184DisPieLoc = A50AlbRLoc ;
            }
         }
         /* Using cursor P04A73 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod, A382DisPieKil, A384DisPieMet, A2184DisPieLoc, Short.valueOf(A2185DisPieAnc), Byte.valueOf(A5099DisPieEst)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A44AlbRecCod = W44AlbRecCod ;
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         /*
            INSERT RECORD ON TABLE TXPDISALB

         */
         W396EmprCod = A396EmprCod ;
         W44AlbRecCod = A44AlbRecCod ;
         A361DisCod = AV14DisCod ;
         A673Piezas = 1 ;
         A631Metros = AV12Metros ;
         A595Kilos = AV11Kilos ;
         /* Using cursor P04A74 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A673Piezas), A595Kilos, A631Metros});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Optimized UPDATE. */
            /* Using cursor P04A75 */
            pr_default.execute(3, new Object[] {AV11Kilos, AV12Metros, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
            /* End optimized UPDATE. */
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A44AlbRecCod = W44AlbRecCod ;
         /* End Insert */
         AV18Inc_obs = httpContext.getMessage( "Alta DISALD. Modif ALBDET", "") + GXutil.newLine( ) ;
         AV18Inc_obs += httpContext.getMessage( "N Disp Int= ", "") + GXutil.str( AV14DisCod, 8, 0) + GXutil.newLine( ) ;
         AV18Inc_obs += httpContext.getMessage( "N Recep   = ", "") + GXutil.str( A44AlbRecCod, 8, 0) + GXutil.newLine( ) ;
         AV18Inc_obs += httpContext.getMessage( "N Pieza   = ", "") + A2159AlbRecPie + GXutil.newLine( ) ;
         AV18Inc_obs += httpContext.getMessage( "Se suma a AlbRecKgmu= ", "") + GXutil.str( A2156AlbRecKgmU, 9, 2) + httpContext.getMessage( " estos Kilos     = ", "") + GXutil.str( AV11Kilos, 9, 2) + GXutil.newLine( ) ;
         AV18Inc_obs += httpContext.getMessage( "Se suma a AlbRecMtru= ", "") + GXutil.str( A2158AlbRecMtrU, 9, 2) + httpContext.getMessage( " estos Metros    = ", "") + GXutil.str( AV12Metros, 9, 2) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV26Pgmname, AV21Usurcod, AV19TermCod, AV18Inc_obs, AV14DisCod, (byte)(0), "") ;
         A2158AlbRecMtrU = A2158AlbRecMtrU.add(AV12Metros) ;
         A2156AlbRecKgmU = A2156AlbRecKgmU.add(AV11Kilos) ;
         AV9EmprCod = A396EmprCod ;
         AV10AlbRecCod = A44AlbRecCod ;
         /* Execute user subroutine: 'ALBREC' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P04A76 */
         pr_default.execute(4, new Object[] {A2156AlbRecKgmU, A2158AlbRecMtrU, A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
         A396EmprCod = W396EmprCod ;
         A44AlbRecCod = W44AlbRecCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P04A77 */
      pr_default.execute(5, new Object[] {Integer.valueOf(AV14DisCod), A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A361DisCod = P04A77_A361DisCod[0] ;
         A392DisUniMed = P04A77_A392DisUniMed[0] ;
         A342DisArtPes = P04A77_A342DisArtPes[0] ;
         A361DisCod = P04A77_A361DisCod[0] ;
         A392DisUniMed = P04A77_A392DisUniMed[0] ;
         A342DisArtPes = P04A77_A342DisArtPes[0] ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = AV14DisCod ;
         GXv_int6[0] = A44AlbRecCod ;
         GXv_char3[0] = A2159AlbRecPie ;
         GXv_decimal7[0] = AV11Kilos ;
         GXv_decimal8[0] = AV12Metros ;
         GXv_char2[0] = A392DisUniMed ;
         GXv_int9[0] = A342DisArtPes ;
         new app.pdisalp(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_decimal7, GXv_decimal8, GXv_char2, GXv_int9) ;
         pactalb3.this.A396EmprCod = GXv_char4[0] ;
         pactalb3.this.AV14DisCod = GXv_int5[0] ;
         pactalb3.this.A44AlbRecCod = GXv_int6[0] ;
         pactalb3.this.A2159AlbRecPie = GXv_char3[0] ;
         pactalb3.this.AV11Kilos = GXv_decimal7[0] ;
         pactalb3.this.AV12Metros = GXv_decimal8[0] ;
         pactalb3.this.A392DisUniMed = GXv_char2[0] ;
         pactalb3.this.A342DisArtPes = GXv_int9[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      cleanup();
   }

   public void S111( )
   {
      /* 'ALBREC' Routine */
      returnInSub = false ;
      /* Using cursor P04A78 */
      pr_default.execute(6, new Object[] {AV9EmprCod, Integer.valueOf(AV10AlbRecCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A56AlbRUni = P04A78_A56AlbRUni[0] ;
         A60AlbRUniUti = P04A78_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P04A78_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P04A78_A58AlbRUniEnt[0] ;
         A47AlbREst = P04A78_A47AlbREst[0] ;
         A48AlbRFecUlt = P04A78_A48AlbRFecUlt[0] ;
         A60AlbRUniUti = A60AlbRUniUti.add((((GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", ""))==0) ? AV11Kilos : AV12Metros))) ;
         A54AlbRPieUti = (int)(A54AlbRPieUti+1) ;
         A47AlbREst = (byte)(((DecimalUtil.compareTo(A60AlbRUniUti, A58AlbRUniEnt)>=0) ? 1 : 0)) ;
         A48AlbRFecUlt = GXutil.today( ) ;
         AV18Inc_obs = httpContext.getMessage( "Modif ALBREC", "") + GXutil.newLine( ) ;
         AV18Inc_obs += httpContext.getMessage( "N Recep   = ", "") + GXutil.str( AV10AlbRecCod, 8, 0) + GXutil.newLine( ) ;
         AV18Inc_obs += httpContext.getMessage( "Cant Utilizada= ", "") + GXutil.str( A60AlbRUniUti, 9, 2) + GXutil.newLine( ) ;
         AV18Inc_obs += httpContext.getMessage( "Cant Entrada  = ", "") + GXutil.str( A58AlbRUniEnt, 9, 2) + GXutil.newLine( ) ;
         AV18Inc_obs += httpContext.getMessage( "Estado        = ", "") + GXutil.str( A47AlbREst, 1, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV26Pgmname, AV21Usurcod, AV19TermCod, AV18Inc_obs, A44AlbRecCod, (byte)(0), "") ;
         /* Using cursor P04A79 */
         pr_default.execute(7, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A48AlbRFecUlt, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactalb3.this.A396EmprCod;
      this.aP1[0] = pactalb3.this.AV14DisCod;
      this.aP2[0] = pactalb3.this.A44AlbRecCod;
      this.aP3[0] = pactalb3.this.A2159AlbRecPie;
      this.aP4[0] = pactalb3.this.AV11Kilos;
      this.aP5[0] = pactalb3.this.AV12Metros;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactalb3");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      AV19TermCod = "" ;
      AV20EmprNOm = "" ;
      AV21Usurcod = "" ;
      scmdbuf = "" ;
      P04A72_A396EmprCod = new String[] {""} ;
      P04A72_A44AlbRecCod = new int[1] ;
      P04A72_A2159AlbRecPie = new String[] {""} ;
      P04A72_A2154AlbRecAnh = new short[1] ;
      P04A72_A50AlbRLoc = new String[] {""} ;
      P04A72_A3731AlbRecIdPz = new String[] {""} ;
      P04A72_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04A72_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A50AlbRLoc = "" ;
      A3731AlbRecIdPz = "" ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      A380DisPieCod = "" ;
      A382DisPieKil = DecimalUtil.ZERO ;
      A384DisPieMet = DecimalUtil.ZERO ;
      A2184DisPieLoc = "" ;
      Gx_emsg = "" ;
      A631Metros = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
      AV18Inc_obs = "" ;
      AV26Pgmname = "" ;
      AV9EmprCod = "" ;
      P04A77_A396EmprCod = new String[] {""} ;
      P04A77_A44AlbRecCod = new int[1] ;
      P04A77_A2159AlbRecPie = new String[] {""} ;
      P04A77_A361DisCod = new int[1] ;
      P04A77_A392DisUniMed = new String[] {""} ;
      P04A77_A342DisArtPes = new short[1] ;
      A392DisUniMed = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char2 = new String[1] ;
      GXv_int9 = new short[1] ;
      P04A78_A44AlbRecCod = new int[1] ;
      P04A78_A396EmprCod = new String[] {""} ;
      P04A78_A56AlbRUni = new String[] {""} ;
      P04A78_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04A78_A54AlbRPieUti = new int[1] ;
      P04A78_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04A78_A47AlbREst = new byte[1] ;
      P04A78_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      A56AlbRUni = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactalb3__default(),
         new Object[] {
             new Object[] {
            P04A72_A396EmprCod, P04A72_A44AlbRecCod, P04A72_A2159AlbRecPie, P04A72_A2154AlbRecAnh, P04A72_A50AlbRLoc, P04A72_A3731AlbRecIdPz, P04A72_A2156AlbRecKgmU, P04A72_A2158AlbRecMtrU
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04A77_A396EmprCod, P04A77_A44AlbRecCod, P04A77_A2159AlbRecPie, P04A77_A361DisCod, P04A77_A392DisUniMed, P04A77_A342DisArtPes
            }
            , new Object[] {
            P04A78_A44AlbRecCod, P04A78_A396EmprCod, P04A78_A56AlbRUni, P04A78_A60AlbRUniUti, P04A78_A54AlbRPieUti, P04A78_A58AlbRUniEnt, P04A78_A47AlbREst, P04A78_A48AlbRFecUlt
            }
            , new Object[] {
            }
         }
      );
      AV26Pgmname = "PACTALB3" ;
      /* GeneXus formulas. */
      AV26Pgmname = "PACTALB3" ;
      Gx_err = (short)(0) ;
   }

   private byte AV13FlagPRef ;
   private byte AV17Martex ;
   private byte GXv_int1[] ;
   private byte A5099DisPieEst ;
   private byte A47AlbREst ;
   private short A2154AlbRecAnh ;
   private short A2185DisPieAnc ;
   private short Gx_err ;
   private short A342DisArtPes ;
   private short GXv_int9[] ;
   private int AV14DisCod ;
   private int A44AlbRecCod ;
   private int W44AlbRecCod ;
   private int GX_INS36 ;
   private int A361DisCod ;
   private int GX_INS35 ;
   private int A673Piezas ;
   private int AV10AlbRecCod ;
   private int GXv_int5[] ;
   private int GXv_int6[] ;
   private int A54AlbRPieUti ;
   private java.math.BigDecimal AV11Kilos ;
   private java.math.BigDecimal AV12Metros ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal A384DisPieMet ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private String A396EmprCod ;
   private String A2159AlbRecPie ;
   private String AV19TermCod ;
   private String AV20EmprNOm ;
   private String AV21Usurcod ;
   private String scmdbuf ;
   private String A50AlbRLoc ;
   private String A3731AlbRecIdPz ;
   private String W396EmprCod ;
   private String A380DisPieCod ;
   private String A2184DisPieLoc ;
   private String Gx_emsg ;
   private String AV26Pgmname ;
   private String AV9EmprCod ;
   private String A392DisUniMed ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String A56AlbRUni ;
   private java.util.Date A48AlbRFecUlt ;
   private boolean returnInSub ;
   private String AV18Inc_obs ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04A72_A396EmprCod ;
   private int[] P04A72_A44AlbRecCod ;
   private String[] P04A72_A2159AlbRecPie ;
   private short[] P04A72_A2154AlbRecAnh ;
   private String[] P04A72_A50AlbRLoc ;
   private String[] P04A72_A3731AlbRecIdPz ;
   private java.math.BigDecimal[] P04A72_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] P04A72_A2158AlbRecMtrU ;
   private String[] P04A77_A396EmprCod ;
   private int[] P04A77_A44AlbRecCod ;
   private String[] P04A77_A2159AlbRecPie ;
   private int[] P04A77_A361DisCod ;
   private String[] P04A77_A392DisUniMed ;
   private short[] P04A77_A342DisArtPes ;
   private int[] P04A78_A44AlbRecCod ;
   private String[] P04A78_A396EmprCod ;
   private String[] P04A78_A56AlbRUni ;
   private java.math.BigDecimal[] P04A78_A60AlbRUniUti ;
   private int[] P04A78_A54AlbRPieUti ;
   private java.math.BigDecimal[] P04A78_A58AlbRUniEnt ;
   private byte[] P04A78_A47AlbREst ;
   private java.util.Date[] P04A78_A48AlbRFecUlt ;
}

final  class pactalb3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04A72", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie, T1.AlbRecAnh, T2.AlbRLoc, T1.AlbRecIdPz, T1.AlbRecKgmU, T1.AlbRecMtrU FROM (TXPALBDET T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? and T1.AlbRecPie = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04A73", "INSERT INTO TXPDISALD(EmprCod, DisCod, AlbRecCod, DisPieCod, DisPieKil, DisPieMet, DisPieLoc, DisPieAnc, DisPieEst, DisPieIdPz, DisPieCodB, DisPieAncc, DisPiePda) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P04A74", "INSERT INTO TXPDISALB(EmprCod, DisCod, AlbRecCod, Piezas, Kilos, Metros, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P04A75", "UPDATE TXPDISALB SET Kilos=Kilos + ?, Metros=Metros + ?, Piezas=Piezas + 1  WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P04A76", "UPDATE TXPALBDET SET AlbRecKgmU=?, AlbRecMtrU=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBDET")
         ,new ForEachCursor("P04A77", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie, T2.DisCod, T2.DisUniMed, T2.DisArtPes FROM (TXPALBDET T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = ?) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? and T1.AlbRecPie = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04A78", "SELECT AlbRecCod, EmprCod, AlbRUni, AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbREst, AlbRFecUlt FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04A79", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?, AlbRFecUlt=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 15);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
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
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

