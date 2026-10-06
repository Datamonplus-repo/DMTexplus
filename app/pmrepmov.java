package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmrepmov extends GXProcedure
{
   public pmrepmov( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmrepmov.class ), "" );
   }

   public pmrepmov( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           int[] aP2 ,
                                           int[] aP3 ,
                                           String[] aP4 ,
                                           byte[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           String[] aP8 ,
                                           java.util.Date[] aP9 )
   {
      pmrepmov.this.aP10 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        java.util.Date[] aP9 ,
                        java.math.BigDecimal[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             java.util.Date[] aP9 ,
                             java.math.BigDecimal[] aP10 )
   {
      pmrepmov.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmrepmov.this.A9425OMCod = aP1[0];
      this.aP1 = aP1;
      pmrepmov.this.A9446OMRepCod = aP2[0];
      this.aP2 = aP2;
      pmrepmov.this.AV13MRMovTpo = aP3[0];
      this.aP3 = aP3;
      pmrepmov.this.AV12MRMovDsc = aP4[0];
      this.aP4 = aP4;
      pmrepmov.this.AV14Sal = aP5[0];
      this.aP5 = aP5;
      pmrepmov.this.AV9oOMMRCnt = aP6[0];
      this.aP6 = aP6;
      pmrepmov.this.AV8nOMMRCnt = aP7[0];
      this.aP7 = aP7;
      pmrepmov.this.AV17Op = aP8[0];
      this.aP8 = aP8;
      pmrepmov.this.AV15MRMovFch = aP9[0];
      this.aP9 = aP9;
      pmrepmov.this.AV16MRMovPre = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ( GXutil.strcmp(AV17Op, httpContext.getMessage( "T", "")) == 0 ) || ( GXutil.strcmp(AV17Op, httpContext.getMessage( "O", "")) == 0 ) )
      {
         AV20GXLvl3 = (byte)(0) ;
         /* Using cursor P03MO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A9449OMRTpo = P03MO2_A9449OMRTpo[0] ;
            A9452OMRCCnt = P03MO2_A9452OMRCCnt[0] ;
            if ( GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "C", "")) == 0 )
            {
               AV20GXLvl3 = (byte)(1) ;
               A9452OMRCCnt = A9452OMRCCnt.add((AV8nOMMRCnt.subtract(AV9oOMMRCnt))) ;
               if ( A9452OMRCCnt.doubleValue() <= 0 )
               {
                  /* Using cursor P03MO3 */
                  pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
               }
               /* Using cursor P03MO4 */
               pr_default.execute(2, new Object[] {A9452OMRCCnt, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( AV20GXLvl3 == 0 )
         {
            if ( AV8nOMMRCnt.doubleValue() > 0 )
            {
               /*
                  INSERT RECORD ON TABLE TXPMOrRep

               */
               A9449OMRTpo = httpContext.getMessage( "C", "") ;
               A9452OMRCCnt = AV8nOMMRCnt.subtract(AV9oOMMRCnt) ;
               /* Using cursor P03MO5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo, A9452OMRCCnt});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
               if ( (pr_default.getStatus(3) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               /* End Insert */
               /* Using cursor P03MO6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod)});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A9449OMRTpo = P03MO6_A9449OMRTpo[0] ;
                  A9448OMRepPre = P03MO6_A9448OMRepPre[0] ;
                  n9448OMRepPre = P03MO6_n9448OMRepPre[0] ;
                  A9453OMRCPre = P03MO6_A9453OMRCPre[0] ;
                  A9448OMRepPre = P03MO6_A9448OMRepPre[0] ;
                  n9448OMRepPre = P03MO6_n9448OMRepPre[0] ;
                  if ( GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "C", "")) == 0 )
                  {
                     A9453OMRCPre = A9448OMRepPre ;
                     /* Using cursor P03MO7 */
                     pr_default.execute(5, new Object[] {A9453OMRCPre, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
                  }
                  pr_default.readNext(4);
               }
               pr_default.close(4);
            }
         }
      }
      if ( ( GXutil.strcmp(AV17Op, httpContext.getMessage( "T", "")) == 0 ) || ( GXutil.strcmp(AV17Op, httpContext.getMessage( "R", "")) == 0 ) )
      {
         Gx_msg = httpContext.getMessage( "&Op=", "") + AV17Op + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&MRMovTpo=", "") + GXutil.str( AV13MRMovTpo, 8, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&MRMovDsc=", "") + AV12MRMovDsc + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&Sal     =", "") + GXutil.str( AV14Sal, 1, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&oOMMRCnt=", "") + GXutil.str( AV9oOMMRCnt, 12, 3) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&nOMMRCnt=", "") + GXutil.str( AV8nOMMRCnt, 12, 3) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&MRMovFch=", "") + localUtil.ttoc( AV15MRMovFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&MRMovPre=", "") + GXutil.str( AV16MRMovPre, 12, 3) + GXutil.newLine( ) ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(Gx_msg, AV23Pgmname) ;
         /* Using cursor P03MO8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A9492MRCod = P03MO8_A9492MRCod[0] ;
            A9500MRUltMov = P03MO8_A9500MRUltMov[0] ;
            n9500MRUltMov = P03MO8_n9500MRUltMov[0] ;
            A9495MRStkAct = P03MO8_A9495MRStkAct[0] ;
            n9495MRStkAct = P03MO8_n9495MRStkAct[0] ;
            /* Noskip command */
            A9495MRStkAct = A9495MRStkAct.add(((AV8nOMMRCnt.subtract(AV9oOMMRCnt)).negate())) ;
            n9495MRStkAct = false ;
            new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(httpContext.getMessage( "Update Tabla MRepuestos", ""), AV23Pgmname) ;
            /* Using cursor P03MO9 */
            pr_default.execute(7, new Object[] {Boolean.valueOf(n9495MRStkAct), A9495MRStkAct, A396EmprCod, Integer.valueOf(A9492MRCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMREPUE");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
         /* Using cursor P03MO10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A9492MRCod = P03MO10_A9492MRCod[0] ;
            A9500MRUltMov = P03MO10_A9500MRUltMov[0] ;
            n9500MRUltMov = P03MO10_n9500MRUltMov[0] ;
            AV26GXLvl53 = (byte)(0) ;
            /* Using cursor P03MO11 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), A396EmprCod, Integer.valueOf(A9492MRCod), Integer.valueOf(A9425OMCod), Integer.valueOf(AV13MRMovTpo)});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A9503MRMovOrd = P03MO11_A9503MRMovOrd[0] ;
               A9505MRMovTpo = P03MO11_A9505MRMovTpo[0] ;
               A9504MRMovFch = P03MO11_A9504MRMovFch[0] ;
               A9509MRMovPre = P03MO11_A9509MRMovPre[0] ;
               A9508MRMovCnt = P03MO11_A9508MRMovCnt[0] ;
               A9502MRMov = P03MO11_A9502MRMov[0] ;
               if ( A9503MRMovOrd == A9425OMCod )
               {
                  if ( A9505MRMovTpo == AV13MRMovTpo )
                  {
                     /* Using cursor P03MO12 */
                     pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
                     A9499MRStkPre = P03MO12_A9499MRStkPre[0] ;
                     n9499MRStkPre = P03MO12_n9499MRStkPre[0] ;
                     AV26GXLvl53 = (byte)(1) ;
                     A9504MRMovFch = AV15MRMovFch ;
                     if ( AV16MRMovPre.doubleValue() != 0 )
                     {
                        A9509MRMovPre = AV16MRMovPre ;
                        A9499MRStkPre = AV16MRMovPre ;
                        n9499MRStkPre = false ;
                     }
                     else
                     {
                        A9499MRStkPre = A9509MRMovPre ;
                        n9499MRStkPre = false ;
                     }
                     A9508MRMovCnt = A9508MRMovCnt.add((AV8nOMMRCnt.subtract(AV9oOMMRCnt))) ;
                     if ( ( A9508MRMovCnt.doubleValue() == 0 ) || ( ( A9508MRMovCnt.doubleValue() < 0 ) && ( AV14Sal == 0 ) ) )
                     {
                        /* Using cursor P03MO13 */
                        pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9502MRMov)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReMov");
                     }
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     /* Using cursor P03MO14 */
                     pr_default.execute(12, new Object[] {Boolean.valueOf(n9499MRStkPre), A9499MRStkPre, A396EmprCod, Integer.valueOf(A9492MRCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMREPUE");
                     /* Using cursor P03MO15 */
                     pr_default.execute(13, new Object[] {A9504MRMovFch, A9509MRMovPre, A9508MRMovCnt, A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9502MRMov)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReMov");
                     if (true) break;
                     /* Using cursor P03MO16 */
                     pr_default.execute(14, new Object[] {Boolean.valueOf(n9499MRStkPre), A9499MRStkPre, A396EmprCod, Integer.valueOf(A9492MRCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMREPUE");
                     /* Using cursor P03MO17 */
                     pr_default.execute(15, new Object[] {A9504MRMovFch, A9509MRMovPre, A9508MRMovCnt, A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9502MRMov)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReMov");
                  }
               }
               pr_default.readNext(9);
            }
            pr_default.close(9);
            pr_default.close(10);
            if ( AV26GXLvl53 == 0 )
            {
               if ( ( AV8nOMMRCnt.subtract(AV9oOMMRCnt).doubleValue() > 0 ) || ( ( AV8nOMMRCnt.subtract(AV9oOMMRCnt).doubleValue() < 0 ) && ( AV14Sal == 1 ) ) )
               {
                  A9500MRUltMov = (int)(A9500MRUltMov+1) ;
                  n9500MRUltMov = false ;
                  AV10MRUltMov = A9500MRUltMov ;
                  /*
                     INSERT RECORD ON TABLE TXPMReMov

                  */
                  A9502MRMov = AV10MRUltMov ;
                  A9507MRMovDsc = AV12MRMovDsc ;
                  A9504MRMovFch = AV15MRMovFch ;
                  A9503MRMovOrd = A9425OMCod ;
                  A9505MRMovTpo = AV13MRMovTpo ;
                  A9508MRMovCnt = AV8nOMMRCnt.subtract(AV9oOMMRCnt) ;
                  /* Using cursor P03MO18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod), Long.valueOf(A9502MRMov), Integer.valueOf(A9503MRMovOrd), A9504MRMovFch, Integer.valueOf(A9505MRMovTpo), A9507MRMovDsc, A9508MRMovCnt});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMReMov");
                  if ( (pr_default.getStatus(16) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  /* End Insert */
               }
            }
            /* Using cursor P03MO19 */
            pr_default.execute(17, new Object[] {Boolean.valueOf(n9500MRUltMov), Integer.valueOf(A9500MRUltMov), A396EmprCod, Integer.valueOf(A9492MRCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMREPUE");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmrepmov.this.A396EmprCod;
      this.aP1[0] = pmrepmov.this.A9425OMCod;
      this.aP2[0] = pmrepmov.this.A9446OMRepCod;
      this.aP3[0] = pmrepmov.this.AV13MRMovTpo;
      this.aP4[0] = pmrepmov.this.AV12MRMovDsc;
      this.aP5[0] = pmrepmov.this.AV14Sal;
      this.aP6[0] = pmrepmov.this.AV9oOMMRCnt;
      this.aP7[0] = pmrepmov.this.AV8nOMMRCnt;
      this.aP8[0] = pmrepmov.this.AV17Op;
      this.aP9[0] = pmrepmov.this.AV15MRMovFch;
      this.aP10[0] = pmrepmov.this.AV16MRMovPre;
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
      P03MO2_A396EmprCod = new String[] {""} ;
      P03MO2_A9425OMCod = new int[1] ;
      P03MO2_A9446OMRepCod = new int[1] ;
      P03MO2_A9449OMRTpo = new String[] {""} ;
      P03MO2_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9449OMRTpo = "" ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P03MO6_A396EmprCod = new String[] {""} ;
      P03MO6_A9425OMCod = new int[1] ;
      P03MO6_A9446OMRepCod = new int[1] ;
      P03MO6_A9449OMRTpo = new String[] {""} ;
      P03MO6_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03MO6_n9448OMRepPre = new boolean[] {false} ;
      P03MO6_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9448OMRepPre = DecimalUtil.ZERO ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV23Pgmname = "" ;
      P03MO8_A396EmprCod = new String[] {""} ;
      P03MO8_A9492MRCod = new int[1] ;
      P03MO8_A9500MRUltMov = new int[1] ;
      P03MO8_n9500MRUltMov = new boolean[] {false} ;
      P03MO8_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03MO8_n9495MRStkAct = new boolean[] {false} ;
      A9495MRStkAct = DecimalUtil.ZERO ;
      P03MO10_A396EmprCod = new String[] {""} ;
      P03MO10_A9492MRCod = new int[1] ;
      P03MO10_A9500MRUltMov = new int[1] ;
      P03MO10_n9500MRUltMov = new boolean[] {false} ;
      P03MO11_A396EmprCod = new String[] {""} ;
      P03MO11_A9492MRCod = new int[1] ;
      P03MO11_A9503MRMovOrd = new int[1] ;
      P03MO11_A9505MRMovTpo = new int[1] ;
      P03MO11_A9504MRMovFch = new java.util.Date[] {GXutil.nullDate()} ;
      P03MO11_A9509MRMovPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03MO11_A9508MRMovCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03MO11_A9502MRMov = new long[1] ;
      A9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      A9509MRMovPre = DecimalUtil.ZERO ;
      A9508MRMovCnt = DecimalUtil.ZERO ;
      P03MO12_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03MO12_n9499MRStkPre = new boolean[] {false} ;
      A9499MRStkPre = DecimalUtil.ZERO ;
      A9507MRMovDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmrepmov__default(),
         new Object[] {
             new Object[] {
            P03MO2_A396EmprCod, P03MO2_A9425OMCod, P03MO2_A9446OMRepCod, P03MO2_A9449OMRTpo, P03MO2_A9452OMRCCnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03MO6_A396EmprCod, P03MO6_A9425OMCod, P03MO6_A9446OMRepCod, P03MO6_A9449OMRTpo, P03MO6_A9448OMRepPre, P03MO6_n9448OMRepPre, P03MO6_A9453OMRCPre
            }
            , new Object[] {
            }
            , new Object[] {
            P03MO8_A396EmprCod, P03MO8_A9492MRCod, P03MO8_A9500MRUltMov, P03MO8_n9500MRUltMov, P03MO8_A9495MRStkAct, P03MO8_n9495MRStkAct
            }
            , new Object[] {
            }
            , new Object[] {
            P03MO10_A396EmprCod, P03MO10_A9492MRCod, P03MO10_A9500MRUltMov, P03MO10_n9500MRUltMov
            }
            , new Object[] {
            P03MO11_A396EmprCod, P03MO11_A9492MRCod, P03MO11_A9503MRMovOrd, P03MO11_A9505MRMovTpo, P03MO11_A9504MRMovFch, P03MO11_A9509MRMovPre, P03MO11_A9508MRMovCnt, P03MO11_A9502MRMov
            }
            , new Object[] {
            P03MO12_A9499MRStkPre, P03MO12_n9499MRStkPre
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
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV23Pgmname = "PMRepMov" ;
      /* GeneXus formulas. */
      AV23Pgmname = "PMRepMov" ;
      Gx_err = (short)(0) ;
   }

   private byte AV14Sal ;
   private byte AV20GXLvl3 ;
   private byte AV26GXLvl53 ;
   private short Gx_err ;
   private int A9425OMCod ;
   private int A9446OMRepCod ;
   private int AV13MRMovTpo ;
   private int GX_INS1233 ;
   private int A9492MRCod ;
   private int A9500MRUltMov ;
   private int Gx_OldLine ;
   private int A9503MRMovOrd ;
   private int A9505MRMovTpo ;
   private int AV10MRUltMov ;
   private int GX_INS1239 ;
   private long A9502MRMov ;
   private java.math.BigDecimal AV9oOMMRCnt ;
   private java.math.BigDecimal AV8nOMMRCnt ;
   private java.math.BigDecimal AV16MRMovPre ;
   private java.math.BigDecimal A9452OMRCCnt ;
   private java.math.BigDecimal A9448OMRepPre ;
   private java.math.BigDecimal A9453OMRCPre ;
   private java.math.BigDecimal A9495MRStkAct ;
   private java.math.BigDecimal A9509MRMovPre ;
   private java.math.BigDecimal A9508MRMovCnt ;
   private java.math.BigDecimal A9499MRStkPre ;
   private String A396EmprCod ;
   private String AV12MRMovDsc ;
   private String AV17Op ;
   private String scmdbuf ;
   private String A9449OMRTpo ;
   private String Gx_emsg ;
   private String Gx_msg ;
   private String AV23Pgmname ;
   private String A9507MRMovDsc ;
   private java.util.Date AV15MRMovFch ;
   private java.util.Date A9504MRMovFch ;
   private boolean n9448OMRepPre ;
   private boolean n9500MRUltMov ;
   private boolean n9495MRStkAct ;
   private boolean n9499MRStkPre ;
   private java.math.BigDecimal[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private java.util.Date[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P03MO2_A396EmprCod ;
   private int[] P03MO2_A9425OMCod ;
   private int[] P03MO2_A9446OMRepCod ;
   private String[] P03MO2_A9449OMRTpo ;
   private java.math.BigDecimal[] P03MO2_A9452OMRCCnt ;
   private String[] P03MO6_A396EmprCod ;
   private int[] P03MO6_A9425OMCod ;
   private int[] P03MO6_A9446OMRepCod ;
   private String[] P03MO6_A9449OMRTpo ;
   private java.math.BigDecimal[] P03MO6_A9448OMRepPre ;
   private boolean[] P03MO6_n9448OMRepPre ;
   private java.math.BigDecimal[] P03MO6_A9453OMRCPre ;
   private String[] P03MO8_A396EmprCod ;
   private int[] P03MO8_A9492MRCod ;
   private int[] P03MO8_A9500MRUltMov ;
   private boolean[] P03MO8_n9500MRUltMov ;
   private java.math.BigDecimal[] P03MO8_A9495MRStkAct ;
   private boolean[] P03MO8_n9495MRStkAct ;
   private String[] P03MO10_A396EmprCod ;
   private int[] P03MO10_A9492MRCod ;
   private int[] P03MO10_A9500MRUltMov ;
   private boolean[] P03MO10_n9500MRUltMov ;
   private String[] P03MO11_A396EmprCod ;
   private int[] P03MO11_A9492MRCod ;
   private int[] P03MO11_A9503MRMovOrd ;
   private int[] P03MO11_A9505MRMovTpo ;
   private java.util.Date[] P03MO11_A9504MRMovFch ;
   private java.math.BigDecimal[] P03MO11_A9509MRMovPre ;
   private java.math.BigDecimal[] P03MO11_A9508MRMovCnt ;
   private long[] P03MO11_A9502MRMov ;
   private java.math.BigDecimal[] P03MO12_A9499MRStkPre ;
   private boolean[] P03MO12_n9499MRStkPre ;
}

final  class pmrepmov__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03MO2", "SELECT EmprCod, OMCod, OMRepCod, OMRTpo, OMRCCnt FROM TXPMOrRep WHERE EmprCod = ? and OMCod = ? and OMRepCod = ? ORDER BY EmprCod, OMCod, OMRepCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03MO3", "DELETE FROM TXPMOrRep  WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrRep")
         ,new UpdateCursor("P03MO4", "UPDATE TXPMOrRep SET OMRCCnt=?  WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrRep")
         ,new UpdateCursor("P03MO5", "INSERT INTO TXPMOrRep(EmprCod, OMCod, OMRepCod, OMRTpo, OMRCCnt, OMRRCnt, OMRRPre, OMRCPre) VALUES(?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrRep")
         ,new ForEachCursor("P03MO6", "SELECT T1.EmprCod, T1.OMCod, T1.OMRepCod AS OMRepCod, T1.OMRTpo, T2.MRStkPre AS OMRepPre, T1.OMRCPre FROM (TXPMOrRep T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.OMRepCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.OMRepCod = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMRepCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03MO7", "UPDATE TXPMOrRep SET OMRCPre=?  WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMOrRep")
         ,new ForEachCursor("P03MO8", "SELECT EmprCod, MRCod, MRUltMov, MRStkAct FROM TXPMREPUE WHERE EmprCod = ? and MRCod = ? ORDER BY EmprCod, MRCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03MO9", "UPDATE TXPMREPUE SET MRStkAct=?  WHERE EmprCod = ? AND MRCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMREPUE")
         ,new ForEachCursor("P03MO10", "SELECT EmprCod, MRCod, MRUltMov FROM TXPMREPUE WHERE EmprCod = ? and MRCod = ? ORDER BY EmprCod, MRCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03MO11", "SELECT EmprCod, MRCod, MRMovOrd, MRMovTpo, MRMovFch, MRMovPre, MRMovCnt, MRMov FROM TXPMReMov WHERE (EmprCod = ? AND MRCod = ?) AND ((EmprCod = ? and MRCod = ?) AND (MRMovOrd = ?) AND (MRMovTpo = ?)) ORDER BY EmprCod, MRCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03MO12", "SELECT MRStkPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03MO13", "DELETE FROM TXPMReMov  WHERE EmprCod = ? AND MRCod = ? AND MRMov = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMReMov")
         ,new UpdateCursor("P03MO14", "UPDATE TXPMREPUE SET MRStkPre=?  WHERE EmprCod = ? AND MRCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMREPUE")
         ,new UpdateCursor("P03MO15", "UPDATE TXPMReMov SET MRMovFch=?, MRMovPre=?, MRMovCnt=?  WHERE EmprCod = ? AND MRCod = ? AND MRMov = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMReMov")
         ,new UpdateCursor("P03MO16", "UPDATE TXPMREPUE SET MRStkPre=?  WHERE EmprCod = ? AND MRCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMREPUE")
         ,new UpdateCursor("P03MO17", "UPDATE TXPMReMov SET MRMovFch=?, MRMovPre=?, MRMovCnt=?  WHERE EmprCod = ? AND MRCod = ? AND MRMov = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMReMov")
         ,new UpdateCursor("P03MO18", "INSERT INTO TXPMReMov(EmprCod, MRCod, MRMov, MRMovOrd, MRMovFch, MRMovTpo, MRMovDsc, MRMovCnt, MRMovPre) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMReMov")
         ,new UpdateCursor("P03MO19", "UPDATE TXPMREPUE SET MRUltMov=?  WHERE EmprCod = ? AND MRCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMREPUE")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 13 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 15 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 30);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 3);
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

