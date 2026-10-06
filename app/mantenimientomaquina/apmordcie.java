package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apmordcie extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apmordcie pgm = new apmordcie (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      int aP1 = 0;

      try
      {
         aP0 = (String) args[0];
         aP1 = (int) GXutil.lval( args[1]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1);
   }

   public apmordcie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apmordcie.class ), "" );
   }

   public apmordcie( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             int aP1 )
   {
      apmordcie.this.A396EmprCod = aP0;
      apmordcie.this.A9425OMCod = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "OR", "") ;
      GXv_int3[0] = AV9MTMovCod ;
      GXv_char4[0] = AV10MTMovNom ;
      new app.mantenimientomaquina.pmrmtesp(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_char4) ;
      apmordcie.this.A396EmprCod = GXv_char1[0] ;
      apmordcie.this.AV9MTMovCod = GXv_int3[0] ;
      apmordcie.this.AV10MTMovNom = GXv_char4[0] ;
      /* Using cursor P03ML2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9449OMRTpo = P03ML2_A9449OMRTpo[0] ;
         A9451OMRRPre = P03ML2_A9451OMRRPre[0] ;
         A9453OMRCPre = P03ML2_A9453OMRCPre[0] ;
         A9452OMRCCnt = P03ML2_A9452OMRCCnt[0] ;
         A9448OMRepPre = P03ML2_A9448OMRepPre[0] ;
         n9448OMRepPre = P03ML2_n9448OMRepPre[0] ;
         A9450OMRRCnt = P03ML2_A9450OMRRCnt[0] ;
         A9446OMRepCod = P03ML2_A9446OMRepCod[0] ;
         A9448OMRepPre = P03ML2_A9448OMRepPre[0] ;
         n9448OMRepPre = P03ML2_n9448OMRepPre[0] ;
         if ( GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "R", "")) == 0 )
         {
            AV11OMRRCnt = A9450OMRRCnt ;
            AV13ServerNow = GXutil.serverNow( context, remoteHandle, pr_default) ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int3[0] = A9425OMCod ;
            GXv_int5[0] = A9446OMRepCod ;
            GXv_int6[0] = AV9MTMovCod ;
            GXv_char2[0] = AV10MTMovNom ;
            GXv_int7[0] = (byte)(1) ;
            GXv_decimal8[0] = AV11OMRRCnt ;
            GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
            GXv_char1[0] = httpContext.getMessage( "T", "") ;
            GXv_dtime10[0] = AV13ServerNow ;
            new app.mantenimientomaquina.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_int5, GXv_int6, GXv_char2, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_char1, GXv_dtime10) ;
            apmordcie.this.A396EmprCod = GXv_char4[0] ;
            apmordcie.this.A9425OMCod = GXv_int3[0] ;
            apmordcie.this.A9446OMRepCod = GXv_int5[0] ;
            apmordcie.this.AV9MTMovCod = GXv_int6[0] ;
            apmordcie.this.AV10MTMovNom = GXv_char2[0] ;
            apmordcie.this.AV11OMRRCnt = GXv_decimal8[0] ;
            apmordcie.this.AV13ServerNow = GXv_dtime10[0] ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int6[0] = A9425OMCod ;
            GXv_int5[0] = A9446OMRepCod ;
            GXv_int3[0] = AV9MTMovCod ;
            GXv_char2[0] = AV10MTMovNom ;
            GXv_int7[0] = (byte)(1) ;
            GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal8[0] = AV11OMRRCnt ;
            GXv_char1[0] = httpContext.getMessage( "T", "") ;
            GXv_dtime10[0] = AV13ServerNow ;
            GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
            new app.mantenimientomaquina.pmrepmov(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_int3, GXv_char2, GXv_int7, GXv_decimal9, GXv_decimal8, GXv_char1, GXv_dtime10, GXv_decimal11) ;
            apmordcie.this.A396EmprCod = GXv_char4[0] ;
            apmordcie.this.A9425OMCod = GXv_int6[0] ;
            apmordcie.this.A9446OMRepCod = GXv_int5[0] ;
            apmordcie.this.AV9MTMovCod = GXv_int3[0] ;
            apmordcie.this.AV10MTMovNom = GXv_char2[0] ;
            apmordcie.this.AV11OMRRCnt = GXv_decimal8[0] ;
            apmordcie.this.AV13ServerNow = GXv_dtime10[0] ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P03ML3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A9458OMMTpo = P03ML3_A9458OMMTpo[0] ;
         A9460OMMRPre = P03ML3_A9460OMMRPre[0] ;
         A9462OMMCPre = P03ML3_A9462OMMCPre[0] ;
         A9461OMMCCnt = P03ML3_A9461OMMCCnt[0] ;
         A9457OMOpePre = P03ML3_A9457OMOpePre[0] ;
         n9457OMOpePre = P03ML3_n9457OMOpePre[0] ;
         A9455OMOpeCod = P03ML3_A9455OMOpeCod[0] ;
         A9459OMMRCnt = P03ML3_A9459OMMRCnt[0] ;
         A9457OMOpePre = P03ML3_A9457OMOpePre[0] ;
         n9457OMOpePre = P03ML3_n9457OMOpePre[0] ;
         if ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "R", "")) == 0 )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int6[0] = A9425OMCod ;
            GXv_int5[0] = A9455OMOpeCod ;
            GXv_decimal11[0] = A9459OMMRCnt ;
            GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
            new app.mantenimientomaquina.pmmores(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_decimal11, GXv_decimal9) ;
            apmordcie.this.A396EmprCod = GXv_char4[0] ;
            apmordcie.this.A9425OMCod = GXv_int6[0] ;
            apmordcie.this.A9455OMOpeCod = GXv_int5[0] ;
            apmordcie.this.A9459OMMRCnt = GXv_decimal11[0] ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int6[0] = A9425OMCod ;
            GXv_int5[0] = A9455OMOpeCod ;
            GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal9[0] = A9459OMMRCnt ;
            new app.mantenimientomaquina.pmmomov(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_decimal11, GXv_decimal9) ;
            apmordcie.this.A396EmprCod = GXv_char4[0] ;
            apmordcie.this.A9425OMCod = GXv_int6[0] ;
            apmordcie.this.A9455OMOpeCod = GXv_int5[0] ;
            apmordcie.this.A9459OMMRCnt = GXv_decimal9[0] ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.apmordcie");
      /* Using cursor P03ML4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A9464OMNot = P03ML4_A9464OMNot[0] ;
         AV12OMNot = A9464OMNot ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor P03ML5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), A396EmprCod, Integer.valueOf(A9425OMCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A9429PMCod = P03ML5_A9429PMCod[0] ;
         n9429PMCod = P03ML5_n9429PMCod[0] ;
         A9439OMFchCer = P03ML5_A9439OMFchCer[0] ;
         /* Using cursor P03ML6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
         A9486PMUlt = P03ML6_A9486PMUlt[0] ;
         n9486PMUlt = P03ML6_n9486PMUlt[0] ;
         A9488PMOrd = P03ML6_A9488PMOrd[0] ;
         n9488PMOrd = P03ML6_n9488PMOrd[0] ;
         A9486PMUlt = GXutil.serverDate( context, remoteHandle, pr_default) ;
         n9486PMUlt = false ;
         A9488PMOrd = 0 ;
         n9488PMOrd = false ;
         /* Using cursor P03ML7 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n9486PMUlt), A9486PMUlt, Boolean.valueOf(n9488PMOrd), Integer.valueOf(A9488PMOrd), A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPREVE");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      pr_default.close(4);
      /* Using cursor P03ML8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A9428SMCod = P03ML8_A9428SMCod[0] ;
         n9428SMCod = P03ML8_n9428SMCod[0] ;
         A9445OMEst = P03ML8_A9445OMEst[0] ;
         A9439OMFchCer = P03ML8_A9439OMFchCer[0] ;
         AV8SMCod = A9428SMCod ;
         A9445OMEst = httpContext.getMessage( "R", "") ;
         A9439OMFchCer = GXutil.serverNow( context, remoteHandle, pr_default) ;
         /* Using cursor P03ML9 */
         pr_default.execute(7, new Object[] {A9445OMEst, A9439OMFchCer, A396EmprCod, Integer.valueOf(A9425OMCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
      /* Using cursor P03ML10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV8SMCod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A9428SMCod = P03ML10_A9428SMCod[0] ;
         n9428SMCod = P03ML10_n9428SMCod[0] ;
         A9522SMEst = P03ML10_A9522SMEst[0] ;
         n9522SMEst = P03ML10_n9522SMEst[0] ;
         A9522SMEst = httpContext.getMessage( "C", "") ;
         n9522SMEst = false ;
         /* Using cursor P03ML11 */
         pr_default.execute(9, new Object[] {Boolean.valueOf(n9522SMEst), A9522SMEst, A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMSOLIC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pmordcie.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.apmordcie");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10MTMovNom = "" ;
      scmdbuf = "" ;
      P03ML2_A396EmprCod = new String[] {""} ;
      P03ML2_A9425OMCod = new int[1] ;
      P03ML2_A9449OMRTpo = new String[] {""} ;
      P03ML2_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03ML2_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03ML2_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03ML2_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03ML2_n9448OMRepPre = new boolean[] {false} ;
      P03ML2_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03ML2_A9446OMRepCod = new int[1] ;
      A9449OMRTpo = "" ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      A9448OMRepPre = DecimalUtil.ZERO ;
      A9450OMRRCnt = DecimalUtil.ZERO ;
      AV11OMRRCnt = DecimalUtil.ZERO ;
      AV13ServerNow = GXutil.resetTime( GXutil.nullDate() );
      GXv_int3 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new byte[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char1 = new String[1] ;
      GXv_dtime10 = new java.util.Date[1] ;
      P03ML3_A396EmprCod = new String[] {""} ;
      P03ML3_A9425OMCod = new int[1] ;
      P03ML3_A9458OMMTpo = new String[] {""} ;
      P03ML3_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03ML3_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03ML3_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03ML3_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03ML3_n9457OMOpePre = new boolean[] {false} ;
      P03ML3_A9455OMOpeCod = new int[1] ;
      P03ML3_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9458OMMTpo = "" ;
      A9460OMMRPre = DecimalUtil.ZERO ;
      A9462OMMCPre = DecimalUtil.ZERO ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      A9457OMOpePre = DecimalUtil.ZERO ;
      A9459OMMRCnt = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      P03ML4_A396EmprCod = new String[] {""} ;
      P03ML4_A9425OMCod = new int[1] ;
      P03ML4_A9464OMNot = new String[] {""} ;
      A9464OMNot = "" ;
      AV12OMNot = "" ;
      P03ML5_A9429PMCod = new int[1] ;
      P03ML5_n9429PMCod = new boolean[] {false} ;
      P03ML5_A396EmprCod = new String[] {""} ;
      P03ML5_A9425OMCod = new int[1] ;
      P03ML5_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      P03ML6_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P03ML6_n9486PMUlt = new boolean[] {false} ;
      P03ML6_A9488PMOrd = new int[1] ;
      P03ML6_n9488PMOrd = new boolean[] {false} ;
      A9486PMUlt = GXutil.nullDate() ;
      P03ML8_A396EmprCod = new String[] {""} ;
      P03ML8_A9425OMCod = new int[1] ;
      P03ML8_A9428SMCod = new int[1] ;
      P03ML8_n9428SMCod = new boolean[] {false} ;
      P03ML8_A9445OMEst = new String[] {""} ;
      P03ML8_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      A9445OMEst = "" ;
      P03ML10_A396EmprCod = new String[] {""} ;
      P03ML10_A9428SMCod = new int[1] ;
      P03ML10_n9428SMCod = new boolean[] {false} ;
      P03ML10_A9522SMEst = new String[] {""} ;
      P03ML10_n9522SMEst = new boolean[] {false} ;
      A9522SMEst = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.apmordcie__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.apmordcie__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.apmordcie__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.apmordcie__default(),
         new Object[] {
             new Object[] {
            P03ML2_A396EmprCod, P03ML2_A9425OMCod, P03ML2_A9449OMRTpo, P03ML2_A9451OMRRPre, P03ML2_A9453OMRCPre, P03ML2_A9452OMRCCnt, P03ML2_A9448OMRepPre, P03ML2_n9448OMRepPre, P03ML2_A9450OMRRCnt, P03ML2_A9446OMRepCod
            }
            , new Object[] {
            P03ML3_A396EmprCod, P03ML3_A9425OMCod, P03ML3_A9458OMMTpo, P03ML3_A9460OMMRPre, P03ML3_A9462OMMCPre, P03ML3_A9461OMMCCnt, P03ML3_A9457OMOpePre, P03ML3_n9457OMOpePre, P03ML3_A9455OMOpeCod, P03ML3_A9459OMMRCnt
            }
            , new Object[] {
            P03ML4_A396EmprCod, P03ML4_A9425OMCod, P03ML4_A9464OMNot
            }
            , new Object[] {
            P03ML5_A9429PMCod, P03ML5_n9429PMCod, P03ML5_A396EmprCod, P03ML5_A9425OMCod, P03ML5_A9439OMFchCer
            }
            , new Object[] {
            P03ML6_A9486PMUlt, P03ML6_n9486PMUlt, P03ML6_A9488PMOrd, P03ML6_n9488PMOrd
            }
            , new Object[] {
            }
            , new Object[] {
            P03ML8_A396EmprCod, P03ML8_A9425OMCod, P03ML8_A9428SMCod, P03ML8_n9428SMCod, P03ML8_A9445OMEst, P03ML8_A9439OMFchCer
            }
            , new Object[] {
            }
            , new Object[] {
            P03ML10_A396EmprCod, P03ML10_A9428SMCod, P03ML10_A9522SMEst, P03ML10_n9522SMEst
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXv_int7[] ;
   private short Gx_err ;
   private int A9425OMCod ;
   private int AV9MTMovCod ;
   private int A9446OMRepCod ;
   private int GXv_int3[] ;
   private int A9455OMOpeCod ;
   private int GXv_int6[] ;
   private int GXv_int5[] ;
   private int A9429PMCod ;
   private int A9488PMOrd ;
   private int A9428SMCod ;
   private int AV8SMCod ;
   private java.math.BigDecimal A9451OMRRPre ;
   private java.math.BigDecimal A9453OMRCPre ;
   private java.math.BigDecimal A9452OMRCCnt ;
   private java.math.BigDecimal A9448OMRepPre ;
   private java.math.BigDecimal A9450OMRRCnt ;
   private java.math.BigDecimal AV11OMRRCnt ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal A9460OMMRPre ;
   private java.math.BigDecimal A9462OMMCPre ;
   private java.math.BigDecimal A9461OMMCCnt ;
   private java.math.BigDecimal A9457OMOpePre ;
   private java.math.BigDecimal A9459OMMRCnt ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String A396EmprCod ;
   private String AV10MTMovNom ;
   private String scmdbuf ;
   private String A9449OMRTpo ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String A9458OMMTpo ;
   private String GXv_char4[] ;
   private String A9445OMEst ;
   private String A9522SMEst ;
   private java.util.Date AV13ServerNow ;
   private java.util.Date GXv_dtime10[] ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date A9486PMUlt ;
   private boolean n9448OMRepPre ;
   private boolean n9457OMOpePre ;
   private boolean n9429PMCod ;
   private boolean n9486PMUlt ;
   private boolean n9488PMOrd ;
   private boolean n9428SMCod ;
   private boolean n9522SMEst ;
   private String A9464OMNot ;
   private String AV12OMNot ;
   private IDataStoreProvider pr_default ;
   private String[] P03ML2_A396EmprCod ;
   private int[] P03ML2_A9425OMCod ;
   private String[] P03ML2_A9449OMRTpo ;
   private java.math.BigDecimal[] P03ML2_A9451OMRRPre ;
   private java.math.BigDecimal[] P03ML2_A9453OMRCPre ;
   private java.math.BigDecimal[] P03ML2_A9452OMRCCnt ;
   private java.math.BigDecimal[] P03ML2_A9448OMRepPre ;
   private boolean[] P03ML2_n9448OMRepPre ;
   private java.math.BigDecimal[] P03ML2_A9450OMRRCnt ;
   private int[] P03ML2_A9446OMRepCod ;
   private String[] P03ML3_A396EmprCod ;
   private int[] P03ML3_A9425OMCod ;
   private String[] P03ML3_A9458OMMTpo ;
   private java.math.BigDecimal[] P03ML3_A9460OMMRPre ;
   private java.math.BigDecimal[] P03ML3_A9462OMMCPre ;
   private java.math.BigDecimal[] P03ML3_A9461OMMCCnt ;
   private java.math.BigDecimal[] P03ML3_A9457OMOpePre ;
   private boolean[] P03ML3_n9457OMOpePre ;
   private int[] P03ML3_A9455OMOpeCod ;
   private java.math.BigDecimal[] P03ML3_A9459OMMRCnt ;
   private String[] P03ML4_A396EmprCod ;
   private int[] P03ML4_A9425OMCod ;
   private String[] P03ML4_A9464OMNot ;
   private int[] P03ML5_A9429PMCod ;
   private boolean[] P03ML5_n9429PMCod ;
   private String[] P03ML5_A396EmprCod ;
   private int[] P03ML5_A9425OMCod ;
   private java.util.Date[] P03ML5_A9439OMFchCer ;
   private java.util.Date[] P03ML6_A9486PMUlt ;
   private boolean[] P03ML6_n9486PMUlt ;
   private int[] P03ML6_A9488PMOrd ;
   private boolean[] P03ML6_n9488PMOrd ;
   private String[] P03ML8_A396EmprCod ;
   private int[] P03ML8_A9425OMCod ;
   private int[] P03ML8_A9428SMCod ;
   private boolean[] P03ML8_n9428SMCod ;
   private String[] P03ML8_A9445OMEst ;
   private java.util.Date[] P03ML8_A9439OMFchCer ;
   private String[] P03ML10_A396EmprCod ;
   private int[] P03ML10_A9428SMCod ;
   private boolean[] P03ML10_n9428SMCod ;
   private String[] P03ML10_A9522SMEst ;
   private boolean[] P03ML10_n9522SMEst ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class apmordcie__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class apmordcie__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class apmordcie__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class apmordcie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03ML2", "SELECT T1.EmprCod, T1.OMCod, T1.OMRTpo, T1.OMRRPre, T1.OMRCPre, T1.OMRCCnt, T2.MRStkPre AS OMRepPre, T1.OMRRCnt, T1.OMRepCod AS OMRepCod FROM (TXPMOrRep T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.OMRepCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03ML3", "SELECT T1.EmprCod, T1.OMCod, T1.OMMTpo, T1.OMMRPre, T1.OMMCPre, T1.OMMCCnt, T2.OpePreHor AS OMOpePre, T1.OMOpeCod AS OMOpeCod, T1.OMMRCnt FROM (TXPMOrMO T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod = T1.EmprCod AND T2.OpeCod = T1.OMOpeCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03ML4", "SELECT EmprCod, OMCod, OMNot FROM TXPMORDEN WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03ML5", "SELECT PMCod, EmprCod, OMCod, OMFchCer FROM TXPMORDEN WHERE (EmprCod = ? AND OMCod = ?) AND (EmprCod = ? and OMCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03ML6", "SELECT PMUlt, PMOrd FROM TXPMPREVE WHERE EmprCod = ? AND PMCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03ML7", "UPDATE TXPMPREVE SET PMUlt=?, PMOrd=?  WHERE EmprCod = ? AND PMCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMPREVE")
         ,new ForEachCursor("P03ML8", "SELECT EmprCod, OMCod, SMCod, OMEst, OMFchCer FROM TXPMORDEN WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03ML9", "UPDATE TXPMORDEN SET OMEst=?, OMFchCer=?  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMORDEN")
         ,new ForEachCursor("P03ML10", "SELECT EmprCod, SMCod, SMEst FROM TXPMSOLIC WHERE (EmprCod = ? and SMCod = ?) AND (SMCod > 0) ORDER BY EmprCod, SMCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03ML11", "UPDATE TXPMSOLIC SET SMEst=?  WHERE EmprCod = ? AND SMCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMSOLIC")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
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
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               return;
      }
   }

}

