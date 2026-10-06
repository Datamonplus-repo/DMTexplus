package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preccois extends GXProcedure
{
   public preccois( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preccois.class ), "" );
   }

   public preccois( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 ,
                           byte[] aP5 ,
                           byte[] aP6 )
   {
      preccois.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             byte[] aP7 )
   {
      preccois.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      preccois.this.AV42BarCod = aP1[0];
      this.aP1 = aP1;
      preccois.this.AV43BarCodReo = aP2[0];
      this.aP2 = aP2;
      preccois.this.AV44BarCodPar = aP3[0];
      this.aP3 = aP3;
      preccois.this.AV45RecLinMaq = aP4[0];
      this.aP4 = aP4;
      preccois.this.AV34IntCodi = aP5[0];
      this.aP5 = aP5;
      preccois.this.AV22IntCod = aP6[0];
      this.aP6 = aP6;
      preccois.this.AV35F_mod = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV49New_reccol = (byte)(0) ;
      /* Using cursor P02752 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV42BarCod), Byte.valueOf(AV43BarCodReo), AV44BarCodPar, Short.valueOf(AV45RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P02752_A2804RecLinMaq[0] ;
         A130BarCodPar = P02752_A130BarCodPar[0] ;
         A132BarCodReo = P02752_A132BarCodReo[0] ;
         A129BarCod = P02752_A129BarCod[0] ;
         A5407RecUltLCo = P02752_A5407RecUltLCo[0] ;
         n5407RecUltLCo = P02752_n5407RecUltLCo[0] ;
         AV46RecUltLCo = A5407RecUltLCo ;
         /* Using cursor P02753 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5409RecPrdCol = P02753_A5409RecPrdCol[0] ;
            n5409RecPrdCol = P02753_n5409RecPrdCol[0] ;
            A5411RecCantCol = P02753_A5411RecCantCol[0] ;
            n5411RecCantCol = P02753_n5411RecCantCol[0] ;
            A5408RecLinCol = P02753_A5408RecLinCol[0] ;
            AV36RecPrdCol = A5409RecPrdCol ;
            AV48Emprcod = A396EmprCod ;
            /* Execute user subroutine: 'PRODUC' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( GXutil.strcmp(AV37PrdRev, httpContext.getMessage( "S", "")) == 0 )
            {
               AV47ForCan = A5411RecCantCol ;
               /* Execute user subroutine: 'SUSTITUTO' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV21ForCanSum = AV21ForCanSum.add(((AV47ForCan.multiply(AV40ForCan2)))) ;
            }
            else
            {
               AV21ForCanSum = AV21ForCanSum.add(A5411RecCantCol) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02754 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV42BarCod), Byte.valueOf(AV43BarCodReo), AV44BarCodPar, Short.valueOf(AV45RecLinMaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2804RecLinMaq = P02754_A2804RecLinMaq[0] ;
         A130BarCodPar = P02754_A130BarCodPar[0] ;
         A132BarCodReo = P02754_A132BarCodReo[0] ;
         A129BarCod = P02754_A129BarCod[0] ;
         A5409RecPrdCol = P02754_A5409RecPrdCol[0] ;
         n5409RecPrdCol = P02754_n5409RecPrdCol[0] ;
         A5408RecLinCol = P02754_A5408RecLinCol[0] ;
         AV36RecPrdCol = A5409RecPrdCol ;
         /* Execute user subroutine: 'PRODUC' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( GXutil.strcmp(AV37PrdRev, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Using cursor P02755 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Short.valueOf(A5408RecLinCol)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECCOL");
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV24CosKgmF = DecimalUtil.doubleToDec(0) ;
      AV21ForCanSum = DecimalUtil.doubleToDec(0) ;
      AV22IntCod = (byte)(0) ;
      AV23IntDsc = GXutil.space( (short)(30)) ;
      /* Using cursor P02756 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A583IntCod = P02756_A583IntCod[0] ;
         A5360IntLabLf = P02756_A5360IntLabLf[0] ;
         n5360IntLabLf = P02756_n5360IntLabLf[0] ;
         A5359IntLabLi = P02756_A5359IntLabLi[0] ;
         n5359IntLabLi = P02756_n5359IntLabLi[0] ;
         A584IntDsc = P02756_A584IntDsc[0] ;
         n584IntDsc = P02756_n584IntDsc[0] ;
         if ( ( DecimalUtil.compareTo(A5359IntLabLi, AV21ForCanSum) <= 0 ) && ( DecimalUtil.compareTo(A5360IntLabLf, AV21ForCanSum) >= 0 ) )
         {
            AV22IntCod = A583IntCod ;
            AV23IntDsc = A584IntDsc ;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV35F_mod = (byte)(0) ;
      if ( AV22IntCod != AV34IntCodi )
      {
         AV35F_mod = (byte)(1) ;
         /* Using cursor P02757 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV42BarCod), Byte.valueOf(AV43BarCodReo), AV44BarCodPar, Short.valueOf(AV45RecLinMaq)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A2804RecLinMaq = P02757_A2804RecLinMaq[0] ;
            A130BarCodPar = P02757_A130BarCodPar[0] ;
            A132BarCodReo = P02757_A132BarCodReo[0] ;
            A129BarCod = P02757_A129BarCod[0] ;
            A5412RecIntCol = P02757_A5412RecIntCol[0] ;
            n5412RecIntCol = P02757_n5412RecIntCol[0] ;
            A5407RecUltLCo = P02757_A5407RecUltLCo[0] ;
            n5407RecUltLCo = P02757_n5407RecUltLCo[0] ;
            A5412RecIntCol = AV22IntCod ;
            n5412RecIntCol = false ;
            if ( AV49New_reccol == 1 )
            {
               A5407RecUltLCo = AV46RecUltLCo ;
               n5407RecUltLCo = false ;
            }
            /* Using cursor P02758 */
            pr_default.execute(6, new Object[] {Boolean.valueOf(n5412RecIntCol), Byte.valueOf(A5412RecIntCol), Boolean.valueOf(n5407RecUltLCo), Short.valueOf(A5407RecUltLCo), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         Application.commitDataStores(context, remoteHandle, pr_default, "preccois");
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'PRODUC' Routine */
      returnInSub = false ;
      AV37PrdRev = "" ;
      /* Using cursor P02759 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV36RecPrdCol});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A719PrdNum = P02759_A719PrdNum[0] ;
         A3004PrdRev = P02759_A3004PrdRev[0] ;
         AV37PrdRev = A3004PrdRev ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S121( )
   {
      /* 'SUSTITUTO' Routine */
      returnInSub = false ;
      AV38PrdSusNum = "" ;
      AV39Flag_sus = (byte)(0) ;
      /* Using cursor P027510 */
      pr_default.execute(8, new Object[] {A396EmprCod, AV36RecPrdCol});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A719PrdNum = P027510_A719PrdNum[0] ;
         A5976PrdSusCan = P027510_A5976PrdSusCan[0] ;
         n5976PrdSusCan = P027510_n5976PrdSusCan[0] ;
         A490ForPrdUMe = P027510_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P027510_n490ForPrdUMe[0] ;
         A5973PrdSusNum = P027510_A5973PrdSusNum[0] ;
         AV38PrdSusNum = A5973PrdSusNum ;
         AV40ForCan2 = A5976PrdSusCan ;
         AV41ForPrdUme = A490ForPrdUMe ;
         /* Execute user subroutine: 'NEW_RECCOL' */
         S138 ();
         if ( returnInSub )
         {
            pr_default.close(8);
            returnInSub = true;
            if (true) return;
         }
         AV39Flag_sus = (byte)(1) ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S138( )
   {
      /* 'NEW_RECCOL' Routine */
      returnInSub = false ;
      AV49New_reccol = (byte)(1) ;
      AV46RecUltLCo = (short)(AV46RecUltLCo+1) ;
      /*
         INSERT RECORD ON TABLE TXPRECCOL

      */
      A396EmprCod = AV48Emprcod ;
      A129BarCod = AV42BarCod ;
      A132BarCodReo = AV43BarCodReo ;
      A130BarCodPar = AV44BarCodPar ;
      A2804RecLinMaq = AV45RecLinMaq ;
      A5408RecLinCol = AV46RecUltLCo ;
      A5409RecPrdCol = AV38PrdSusNum ;
      n5409RecPrdCol = false ;
      A5411RecCantCol = AV47ForCan.multiply(AV40ForCan2) ;
      n5411RecCantCol = false ;
      A490ForPrdUMe = AV41ForPrdUme ;
      n490ForPrdUMe = false ;
      /* Using cursor P027511 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Short.valueOf(A5408RecLinCol), Boolean.valueOf(n5409RecPrdCol), A5409RecPrdCol, Boolean.valueOf(n5411RecCantCol), A5411RecCantCol, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECCOL");
      if ( (pr_default.getStatus(9) == 1) )
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

   protected void cleanup( )
   {
      this.aP0[0] = preccois.this.A396EmprCod;
      this.aP1[0] = preccois.this.AV42BarCod;
      this.aP2[0] = preccois.this.AV43BarCodReo;
      this.aP3[0] = preccois.this.AV44BarCodPar;
      this.aP4[0] = preccois.this.AV45RecLinMaq;
      this.aP5[0] = preccois.this.AV34IntCodi;
      this.aP6[0] = preccois.this.AV22IntCod;
      this.aP7[0] = preccois.this.AV35F_mod;
      Application.commitDataStores(context, remoteHandle, pr_default, "preccois");
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
      P02752_A396EmprCod = new String[] {""} ;
      P02752_A2804RecLinMaq = new short[1] ;
      P02752_A130BarCodPar = new String[] {""} ;
      P02752_A132BarCodReo = new byte[1] ;
      P02752_A129BarCod = new int[1] ;
      P02752_A5407RecUltLCo = new short[1] ;
      P02752_n5407RecUltLCo = new boolean[] {false} ;
      A130BarCodPar = "" ;
      P02753_A396EmprCod = new String[] {""} ;
      P02753_A129BarCod = new int[1] ;
      P02753_A132BarCodReo = new byte[1] ;
      P02753_A130BarCodPar = new String[] {""} ;
      P02753_A2804RecLinMaq = new short[1] ;
      P02753_A5409RecPrdCol = new String[] {""} ;
      P02753_n5409RecPrdCol = new boolean[] {false} ;
      P02753_A5411RecCantCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02753_n5411RecCantCol = new boolean[] {false} ;
      P02753_A5408RecLinCol = new short[1] ;
      A5409RecPrdCol = "" ;
      A5411RecCantCol = DecimalUtil.ZERO ;
      AV36RecPrdCol = "" ;
      AV48Emprcod = "" ;
      AV37PrdRev = "" ;
      AV47ForCan = DecimalUtil.ZERO ;
      AV21ForCanSum = DecimalUtil.ZERO ;
      AV40ForCan2 = DecimalUtil.ZERO ;
      P02754_A396EmprCod = new String[] {""} ;
      P02754_A2804RecLinMaq = new short[1] ;
      P02754_A130BarCodPar = new String[] {""} ;
      P02754_A132BarCodReo = new byte[1] ;
      P02754_A129BarCod = new int[1] ;
      P02754_A5409RecPrdCol = new String[] {""} ;
      P02754_n5409RecPrdCol = new boolean[] {false} ;
      P02754_A5408RecLinCol = new short[1] ;
      AV24CosKgmF = DecimalUtil.ZERO ;
      AV23IntDsc = "" ;
      P02756_A396EmprCod = new String[] {""} ;
      P02756_A583IntCod = new byte[1] ;
      P02756_A5360IntLabLf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02756_n5360IntLabLf = new boolean[] {false} ;
      P02756_A5359IntLabLi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02756_n5359IntLabLi = new boolean[] {false} ;
      P02756_A584IntDsc = new String[] {""} ;
      P02756_n584IntDsc = new boolean[] {false} ;
      A5360IntLabLf = DecimalUtil.ZERO ;
      A5359IntLabLi = DecimalUtil.ZERO ;
      A584IntDsc = "" ;
      P02757_A396EmprCod = new String[] {""} ;
      P02757_A2804RecLinMaq = new short[1] ;
      P02757_A130BarCodPar = new String[] {""} ;
      P02757_A132BarCodReo = new byte[1] ;
      P02757_A129BarCod = new int[1] ;
      P02757_A5412RecIntCol = new byte[1] ;
      P02757_n5412RecIntCol = new boolean[] {false} ;
      P02757_A5407RecUltLCo = new short[1] ;
      P02757_n5407RecUltLCo = new boolean[] {false} ;
      P02759_A396EmprCod = new String[] {""} ;
      P02759_A719PrdNum = new String[] {""} ;
      P02759_A3004PrdRev = new String[] {""} ;
      A719PrdNum = "" ;
      A3004PrdRev = "" ;
      AV38PrdSusNum = "" ;
      P027510_A396EmprCod = new String[] {""} ;
      P027510_A719PrdNum = new String[] {""} ;
      P027510_A5976PrdSusCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P027510_n5976PrdSusCan = new boolean[] {false} ;
      P027510_A490ForPrdUMe = new byte[1] ;
      P027510_n490ForPrdUMe = new boolean[] {false} ;
      P027510_A5973PrdSusNum = new String[] {""} ;
      A5976PrdSusCan = DecimalUtil.ZERO ;
      A5973PrdSusNum = "" ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.preccois__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.preccois__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.preccois__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preccois__default(),
         new Object[] {
             new Object[] {
            P02752_A396EmprCod, P02752_A2804RecLinMaq, P02752_A130BarCodPar, P02752_A132BarCodReo, P02752_A129BarCod, P02752_A5407RecUltLCo, P02752_n5407RecUltLCo
            }
            , new Object[] {
            P02753_A396EmprCod, P02753_A129BarCod, P02753_A132BarCodReo, P02753_A130BarCodPar, P02753_A2804RecLinMaq, P02753_A5409RecPrdCol, P02753_n5409RecPrdCol, P02753_A5411RecCantCol, P02753_n5411RecCantCol, P02753_A5408RecLinCol
            }
            , new Object[] {
            P02754_A396EmprCod, P02754_A2804RecLinMaq, P02754_A130BarCodPar, P02754_A132BarCodReo, P02754_A129BarCod, P02754_A5409RecPrdCol, P02754_n5409RecPrdCol, P02754_A5408RecLinCol
            }
            , new Object[] {
            }
            , new Object[] {
            P02756_A396EmprCod, P02756_A583IntCod, P02756_A5360IntLabLf, P02756_n5360IntLabLf, P02756_A5359IntLabLi, P02756_n5359IntLabLi, P02756_A584IntDsc, P02756_n584IntDsc
            }
            , new Object[] {
            P02757_A396EmprCod, P02757_A2804RecLinMaq, P02757_A130BarCodPar, P02757_A132BarCodReo, P02757_A129BarCod, P02757_A5412RecIntCol, P02757_n5412RecIntCol, P02757_A5407RecUltLCo, P02757_n5407RecUltLCo
            }
            , new Object[] {
            }
            , new Object[] {
            P02759_A396EmprCod, P02759_A719PrdNum, P02759_A3004PrdRev
            }
            , new Object[] {
            P027510_A396EmprCod, P027510_A719PrdNum, P027510_A5976PrdSusCan, P027510_n5976PrdSusCan, P027510_A490ForPrdUMe, P027510_n490ForPrdUMe, P027510_A5973PrdSusNum
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV43BarCodReo ;
   private byte AV34IntCodi ;
   private byte AV22IntCod ;
   private byte AV35F_mod ;
   private byte AV49New_reccol ;
   private byte A132BarCodReo ;
   private byte A583IntCod ;
   private byte A5412RecIntCol ;
   private byte AV39Flag_sus ;
   private byte A490ForPrdUMe ;
   private byte AV41ForPrdUme ;
   private short AV45RecLinMaq ;
   private short A2804RecLinMaq ;
   private short A5407RecUltLCo ;
   private short AV46RecUltLCo ;
   private short A5408RecLinCol ;
   private short Gx_err ;
   private int AV42BarCod ;
   private int A129BarCod ;
   private int GX_INS785 ;
   private java.math.BigDecimal A5411RecCantCol ;
   private java.math.BigDecimal AV47ForCan ;
   private java.math.BigDecimal AV21ForCanSum ;
   private java.math.BigDecimal AV40ForCan2 ;
   private java.math.BigDecimal AV24CosKgmF ;
   private java.math.BigDecimal A5360IntLabLf ;
   private java.math.BigDecimal A5359IntLabLi ;
   private java.math.BigDecimal A5976PrdSusCan ;
   private String A396EmprCod ;
   private String AV44BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A5409RecPrdCol ;
   private String AV36RecPrdCol ;
   private String AV48Emprcod ;
   private String AV37PrdRev ;
   private String AV23IntDsc ;
   private String A584IntDsc ;
   private String A719PrdNum ;
   private String A3004PrdRev ;
   private String AV38PrdSusNum ;
   private String A5973PrdSusNum ;
   private String Gx_emsg ;
   private boolean n5407RecUltLCo ;
   private boolean n5409RecPrdCol ;
   private boolean n5411RecCantCol ;
   private boolean returnInSub ;
   private boolean n5360IntLabLf ;
   private boolean n5359IntLabLi ;
   private boolean n584IntDsc ;
   private boolean n5412RecIntCol ;
   private boolean n5976PrdSusCan ;
   private boolean n490ForPrdUMe ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P02752_A396EmprCod ;
   private short[] P02752_A2804RecLinMaq ;
   private String[] P02752_A130BarCodPar ;
   private byte[] P02752_A132BarCodReo ;
   private int[] P02752_A129BarCod ;
   private short[] P02752_A5407RecUltLCo ;
   private boolean[] P02752_n5407RecUltLCo ;
   private String[] P02753_A396EmprCod ;
   private int[] P02753_A129BarCod ;
   private byte[] P02753_A132BarCodReo ;
   private String[] P02753_A130BarCodPar ;
   private short[] P02753_A2804RecLinMaq ;
   private String[] P02753_A5409RecPrdCol ;
   private boolean[] P02753_n5409RecPrdCol ;
   private java.math.BigDecimal[] P02753_A5411RecCantCol ;
   private boolean[] P02753_n5411RecCantCol ;
   private short[] P02753_A5408RecLinCol ;
   private String[] P02754_A396EmprCod ;
   private short[] P02754_A2804RecLinMaq ;
   private String[] P02754_A130BarCodPar ;
   private byte[] P02754_A132BarCodReo ;
   private int[] P02754_A129BarCod ;
   private String[] P02754_A5409RecPrdCol ;
   private boolean[] P02754_n5409RecPrdCol ;
   private short[] P02754_A5408RecLinCol ;
   private String[] P02756_A396EmprCod ;
   private byte[] P02756_A583IntCod ;
   private java.math.BigDecimal[] P02756_A5360IntLabLf ;
   private boolean[] P02756_n5360IntLabLf ;
   private java.math.BigDecimal[] P02756_A5359IntLabLi ;
   private boolean[] P02756_n5359IntLabLi ;
   private String[] P02756_A584IntDsc ;
   private boolean[] P02756_n584IntDsc ;
   private String[] P02757_A396EmprCod ;
   private short[] P02757_A2804RecLinMaq ;
   private String[] P02757_A130BarCodPar ;
   private byte[] P02757_A132BarCodReo ;
   private int[] P02757_A129BarCod ;
   private byte[] P02757_A5412RecIntCol ;
   private boolean[] P02757_n5412RecIntCol ;
   private short[] P02757_A5407RecUltLCo ;
   private boolean[] P02757_n5407RecUltLCo ;
   private String[] P02759_A396EmprCod ;
   private String[] P02759_A719PrdNum ;
   private String[] P02759_A3004PrdRev ;
   private String[] P027510_A396EmprCod ;
   private String[] P027510_A719PrdNum ;
   private java.math.BigDecimal[] P027510_A5976PrdSusCan ;
   private boolean[] P027510_n5976PrdSusCan ;
   private byte[] P027510_A490ForPrdUMe ;
   private boolean[] P027510_n490ForPrdUMe ;
   private String[] P027510_A5973PrdSusNum ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class preccois__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class preccois__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class preccois__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class preccois__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02752", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecUltLCo FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02753", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecPrdCol, RecCantCol, RecLinCol FROM TXPRECCOL WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02754", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecPrdCol, RecLinCol FROM TXPRECCOL WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinCol ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02755", "DELETE FROM TXPRECCOL  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinCol = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECCOL")
         ,new ForEachCursor("P02756", "SELECT EmprCod, IntCod, IntLabLf, IntLabLi, IntDsc FROM TXPINTENS WHERE (EmprCod = ? and IntCod >= 0) AND (IntCod <= 99) ORDER BY EmprCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02757", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecIntCol, RecUltLCo FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02758", "UPDATE TXPRECMAQ SET RecIntCol=?, RecUltLCo=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
         ,new ForEachCursor("P02759", "SELECT EmprCod, PrdNum, PrdRev FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P027510", "SELECT EmprCod, PrdNum, PrdSusCan, ForPrdUMe, PrdSusNum FROM TXPPRDSUS WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, PrdSusNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P027511", "INSERT INTO TXPRECCOL(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinCol, RecPrdCol, RecCantCol, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECCOL")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               stmt.setShort(7, ((Number) parms[8]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[11]).byteValue());
               }
               return;
      }
   }

}

