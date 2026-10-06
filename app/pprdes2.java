package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprdes2 extends GXProcedure
{
   public pprdes2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprdes2.class ), "" );
   }

   public pprdes2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             byte[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             short[] aP9 ,
                             byte[] aP10 ,
                             byte[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             java.util.Date[] aP13 ,
                             java.util.Date[] aP14 )
   {
      pprdes2.this.aP15 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        byte[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 ,
                        short[] aP9 ,
                        byte[] aP10 ,
                        byte[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        java.util.Date[] aP13 ,
                        java.util.Date[] aP14 ,
                        String[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             byte[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             short[] aP9 ,
                             byte[] aP10 ,
                             byte[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             java.util.Date[] aP13 ,
                             java.util.Date[] aP14 ,
                             String[] aP15 )
   {
      pprdes2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprdes2.this.A795PrvNum = aP1[0];
      this.aP1 = aP1;
      pprdes2.this.A779PrvAny = aP2[0];
      this.aP2 = aP2;
      pprdes2.this.A796PrvNumLin = aP3[0];
      this.aP3 = aP3;
      pprdes2.this.AV17Unidades = aP4[0];
      this.aP4 = aP4;
      pprdes2.this.AV15UniOld = aP5[0];
      this.aP5 = aP5;
      pprdes2.this.AV16Precio = aP6[0];
      this.aP6 = aP6;
      pprdes2.this.AV18Prioridad = aP7[0];
      this.aP7 = aP7;
      pprdes2.this.AV24AnyAct = aP8[0];
      this.aP8 = aP8;
      pprdes2.this.AV19AnyAnt = aP9[0];
      this.aP9 = aP9;
      pprdes2.this.AV25MesAct = aP10[0];
      this.aP10 = aP10;
      pprdes2.this.AV20MesAnt = aP11[0];
      this.aP11 = aP11;
      pprdes2.this.AV21PrecAnt = aP12[0];
      this.aP12 = aP12;
      pprdes2.this.AV22FecAct = aP13[0];
      this.aP13 = aP13;
      pprdes2.this.AV23FecAnt = aP14[0];
      this.aP14 = aP14;
      pprdes2.this.Gx_mode = aP15[0];
      this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "pPRDES2", "") );
      /* Using cursor P01882 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3915EmpNumDec = P01882_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P01882_n3915EmpNumDec[0] ;
         AV28EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPCPRVES

         */
         A330DifEstCa1 = DecimalUtil.doubleToDec(0) ;
         n330DifEstCa1 = false ;
         /* Using cursor P01883 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Boolean.valueOf(n330DifEstCa1), A330DifEstCa1});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRVES");
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
         /* End Insert */
         /*
            INSERT RECORD ON TABLE TXPLPRVES

         */
         if ( GXutil.strcmp(AV18Prioridad, "0") == 0 )
         {
            if ( AV28EmpNumDec == 0 )
            {
               A790PrvEstCm0 = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 0) ;
               n790PrvEstCm0 = false ;
            }
            else
            {
               if ( AV28EmpNumDec == 2 )
               {
                  A790PrvEstCm0 = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2) ;
                  n790PrvEstCm0 = false ;
               }
            }
            A791PrvEstCm1 = DecimalUtil.doubleToDec(0) ;
            n791PrvEstCm1 = false ;
         }
         else
         {
            if ( AV28EmpNumDec == 0 )
            {
               A791PrvEstCm1 = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 0) ;
               n791PrvEstCm1 = false ;
            }
            else
            {
               if ( AV28EmpNumDec == 2 )
               {
                  A791PrvEstCm1 = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2) ;
                  n791PrvEstCm1 = false ;
               }
            }
            A790PrvEstCm0 = DecimalUtil.doubleToDec(0) ;
            n790PrvEstCm0 = false ;
         }
         /* Using cursor P01884 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(A796PrvNumLin), Boolean.valueOf(n790PrvEstCm0), A790PrvEstCm0, Boolean.valueOf(n791PrvEstCm1), A791PrvEstCm1});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRVES");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P01885 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(A796PrvNumLin)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A396EmprCod = P01885_A396EmprCod[0] ;
               A795PrvNum = P01885_A795PrvNum[0] ;
               A779PrvAny = P01885_A779PrvAny[0] ;
               A796PrvNumLin = P01885_A796PrvNumLin[0] ;
               A790PrvEstCm0 = P01885_A790PrvEstCm0[0] ;
               n790PrvEstCm0 = P01885_n790PrvEstCm0[0] ;
               A791PrvEstCm1 = P01885_A791PrvEstCm1[0] ;
               n791PrvEstCm1 = P01885_n791PrvEstCm1[0] ;
               if ( GXutil.strcmp(AV18Prioridad, "0") == 0 )
               {
                  if ( AV28EmpNumDec == 0 )
                  {
                     A790PrvEstCm0 = A790PrvEstCm0.add(GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 0)) ;
                     n790PrvEstCm0 = false ;
                  }
                  else
                  {
                     if ( AV28EmpNumDec == 2 )
                     {
                        A790PrvEstCm0 = A790PrvEstCm0.add(GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2)) ;
                        n790PrvEstCm0 = false ;
                     }
                  }
               }
               else
               {
                  if ( AV28EmpNumDec == 0 )
                  {
                     A791PrvEstCm1 = A791PrvEstCm1.add(GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 0)) ;
                     n791PrvEstCm1 = false ;
                  }
                  else
                  {
                     if ( AV28EmpNumDec == 2 )
                     {
                        A791PrvEstCm1 = A791PrvEstCm1.add(GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2)) ;
                        n791PrvEstCm1 = false ;
                     }
                  }
               }
               /* Using cursor P01886 */
               pr_default.execute(4, new Object[] {Boolean.valueOf(n790PrvEstCm0), A790PrvEstCm0, Boolean.valueOf(n791PrvEstCm1), A791PrvEstCm1, A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(A796PrvNumLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRVES");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         if ( !( GXutil.dateCompare(GXutil.resetTime(AV22FecAct), GXutil.resetTime(AV23FecAnt)) ) )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A795PrvNum ;
            GXv_date3[0] = AV23FecAnt ;
            GXv_int4[0] = A658PedCod ;
            GXv_decimal5[0] = AV15UniOld ;
            GXv_decimal6[0] = AV21PrecAnt ;
            GXv_char7[0] = AV18Prioridad ;
            new app.pacespr(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_date3, GXv_int4, GXv_decimal5, GXv_decimal6, GXv_char7) ;
            pprdes2.this.A396EmprCod = GXv_char1[0] ;
            pprdes2.this.A795PrvNum = GXv_int2[0] ;
            pprdes2.this.AV23FecAnt = GXv_date3[0] ;
            pprdes2.this.A658PedCod = GXv_int4[0] ;
            pprdes2.this.AV15UniOld = GXv_decimal5[0] ;
            pprdes2.this.AV21PrecAnt = GXv_decimal6[0] ;
            pprdes2.this.AV18Prioridad = GXv_char7[0] ;
            AV27FlagEnc = (byte)(0) ;
            /* Using cursor P01887 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(AV24AnyAct), Byte.valueOf(AV25MesAct)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A790PrvEstCm0 = P01887_A790PrvEstCm0[0] ;
               n790PrvEstCm0 = P01887_n790PrvEstCm0[0] ;
               A791PrvEstCm1 = P01887_A791PrvEstCm1[0] ;
               n791PrvEstCm1 = P01887_n791PrvEstCm1[0] ;
               AV27FlagEnc = (byte)(1) ;
               if ( GXutil.strcmp(AV18Prioridad, "0") == 0 )
               {
                  if ( AV28EmpNumDec == 0 )
                  {
                     A790PrvEstCm0 = A790PrvEstCm0.add(GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 0)) ;
                     n790PrvEstCm0 = false ;
                  }
                  else
                  {
                     if ( AV28EmpNumDec == 2 )
                     {
                        A790PrvEstCm0 = A790PrvEstCm0.add(GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2)) ;
                        n790PrvEstCm0 = false ;
                     }
                  }
               }
               else
               {
                  if ( AV28EmpNumDec == 0 )
                  {
                     A791PrvEstCm1 = A791PrvEstCm1.add(GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 0)) ;
                     n791PrvEstCm1 = false ;
                  }
                  else
                  {
                     if ( AV28EmpNumDec == 2 )
                     {
                        A791PrvEstCm1 = A791PrvEstCm1.add(GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2)) ;
                        n791PrvEstCm1 = false ;
                     }
                  }
               }
               /* Using cursor P01888 */
               pr_default.execute(6, new Object[] {Boolean.valueOf(n790PrvEstCm0), A790PrvEstCm0, Boolean.valueOf(n791PrvEstCm1), A791PrvEstCm1, A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(A796PrvNumLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRVES");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(5);
            if ( AV27FlagEnc == 0 )
            {
               /*
                  INSERT RECORD ON TABLE TXPCPRVES

               */
               A330DifEstCa1 = DecimalUtil.doubleToDec(0) ;
               n330DifEstCa1 = false ;
               /* Using cursor P01889 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Boolean.valueOf(n330DifEstCa1), A330DifEstCa1});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRVES");
               if ( (pr_default.getStatus(7) == 1) )
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
               /*
                  INSERT RECORD ON TABLE TXPLPRVES

               */
               if ( GXutil.strcmp(AV18Prioridad, "0") == 0 )
               {
                  if ( AV28EmpNumDec == 0 )
                  {
                     A790PrvEstCm0 = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 0) ;
                     n790PrvEstCm0 = false ;
                  }
                  else
                  {
                     if ( AV28EmpNumDec == 2 )
                     {
                        A790PrvEstCm0 = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2) ;
                        n790PrvEstCm0 = false ;
                     }
                  }
                  A791PrvEstCm1 = DecimalUtil.doubleToDec(0) ;
                  n791PrvEstCm1 = false ;
               }
               else
               {
                  if ( AV28EmpNumDec == 0 )
                  {
                     A791PrvEstCm1 = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 0) ;
                     n791PrvEstCm1 = false ;
                  }
                  else
                  {
                     if ( AV28EmpNumDec == 2 )
                     {
                        A791PrvEstCm1 = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2) ;
                        n791PrvEstCm1 = false ;
                     }
                  }
                  A790PrvEstCm0 = DecimalUtil.doubleToDec(0) ;
                  n790PrvEstCm0 = false ;
               }
               /* Using cursor P018810 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(A796PrvNumLin), Boolean.valueOf(n790PrvEstCm0), A790PrvEstCm0, Boolean.valueOf(n791PrvEstCm1), A791PrvEstCm1});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRVES");
               if ( (pr_default.getStatus(8) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  /* Using cursor P018811 */
                  pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(A796PrvNumLin)});
                  while ( (pr_default.getStatus(9) != 101) )
                  {
                     A396EmprCod = P018811_A396EmprCod[0] ;
                     A795PrvNum = P018811_A795PrvNum[0] ;
                     A779PrvAny = P018811_A779PrvAny[0] ;
                     A796PrvNumLin = P018811_A796PrvNumLin[0] ;
                     A790PrvEstCm0 = P018811_A790PrvEstCm0[0] ;
                     n790PrvEstCm0 = P018811_n790PrvEstCm0[0] ;
                     A791PrvEstCm1 = P018811_A791PrvEstCm1[0] ;
                     n791PrvEstCm1 = P018811_n791PrvEstCm1[0] ;
                     if ( GXutil.strcmp(AV18Prioridad, "0") == 0 )
                     {
                        if ( AV28EmpNumDec == 0 )
                        {
                           A790PrvEstCm0 = A790PrvEstCm0.add(GXutil.roundDecimal( AV16Precio.multiply((AV17Unidades.subtract(AV15UniOld))), 0)) ;
                           n790PrvEstCm0 = false ;
                        }
                        else
                        {
                           if ( AV28EmpNumDec == 2 )
                           {
                              A790PrvEstCm0 = A790PrvEstCm0.add(GXutil.roundDecimal( AV16Precio.multiply((AV17Unidades.subtract(AV15UniOld))), 2)) ;
                              n790PrvEstCm0 = false ;
                           }
                        }
                     }
                     else
                     {
                        if ( AV28EmpNumDec == 0 )
                        {
                           A791PrvEstCm1 = A791PrvEstCm1.add(GXutil.roundDecimal( AV16Precio.multiply((AV17Unidades.subtract(AV15UniOld))), 0)) ;
                           n791PrvEstCm1 = false ;
                        }
                        else
                        {
                           if ( AV28EmpNumDec == 2 )
                           {
                              A791PrvEstCm1 = A791PrvEstCm1.add(GXutil.roundDecimal( AV16Precio.multiply((AV17Unidades.subtract(AV15UniOld))), 2)) ;
                              n791PrvEstCm1 = false ;
                           }
                        }
                     }
                     /* Using cursor P018812 */
                     pr_default.execute(10, new Object[] {Boolean.valueOf(n790PrvEstCm0), A790PrvEstCm0, Boolean.valueOf(n791PrvEstCm1), A791PrvEstCm1, A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(A796PrvNumLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRVES");
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(9);
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               /* End Insert */
            }
         }
         else
         {
            /* Using cursor P018813 */
            pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(A796PrvNumLin)});
            while ( (pr_default.getStatus(11) != 101) )
            {
               A790PrvEstCm0 = P018813_A790PrvEstCm0[0] ;
               n790PrvEstCm0 = P018813_n790PrvEstCm0[0] ;
               A791PrvEstCm1 = P018813_A791PrvEstCm1[0] ;
               n791PrvEstCm1 = P018813_n791PrvEstCm1[0] ;
               if ( GXutil.strcmp(AV18Prioridad, "0") == 0 )
               {
                  if ( AV28EmpNumDec == 0 )
                  {
                     A790PrvEstCm0 = A790PrvEstCm0.subtract(GXutil.roundDecimal( AV21PrecAnt.multiply(AV15UniOld), 0)) ;
                     n790PrvEstCm0 = false ;
                     A790PrvEstCm0 = A790PrvEstCm0.add(GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 0)) ;
                     n790PrvEstCm0 = false ;
                  }
                  else
                  {
                     if ( AV28EmpNumDec == 2 )
                     {
                        A790PrvEstCm0 = A790PrvEstCm0.subtract(GXutil.roundDecimal( AV21PrecAnt.multiply(AV15UniOld), 2)) ;
                        n790PrvEstCm0 = false ;
                        A790PrvEstCm0 = A790PrvEstCm0.add(GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2)) ;
                        n790PrvEstCm0 = false ;
                     }
                  }
               }
               else
               {
                  if ( AV28EmpNumDec == 0 )
                  {
                     A791PrvEstCm1 = A791PrvEstCm1.subtract(GXutil.roundDecimal( AV21PrecAnt.multiply(AV15UniOld), 0)) ;
                     n791PrvEstCm1 = false ;
                     A791PrvEstCm1 = A791PrvEstCm1.add(GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 0)) ;
                     n791PrvEstCm1 = false ;
                  }
                  else
                  {
                     if ( AV28EmpNumDec == 2 )
                     {
                        A791PrvEstCm1 = A791PrvEstCm1.subtract(GXutil.roundDecimal( AV21PrecAnt.multiply(AV15UniOld), 2)) ;
                        n791PrvEstCm1 = false ;
                        A791PrvEstCm1 = A791PrvEstCm1.add(GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2)) ;
                        n791PrvEstCm1 = false ;
                     }
                  }
               }
               /* Using cursor P018814 */
               pr_default.execute(12, new Object[] {Boolean.valueOf(n790PrvEstCm0), A790PrvEstCm0, Boolean.valueOf(n791PrvEstCm1), A791PrvEstCm1, A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(A796PrvNumLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRVES");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(11);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprdes2.this.A396EmprCod;
      this.aP1[0] = pprdes2.this.A795PrvNum;
      this.aP2[0] = pprdes2.this.A779PrvAny;
      this.aP3[0] = pprdes2.this.A796PrvNumLin;
      this.aP4[0] = pprdes2.this.AV17Unidades;
      this.aP5[0] = pprdes2.this.AV15UniOld;
      this.aP6[0] = pprdes2.this.AV16Precio;
      this.aP7[0] = pprdes2.this.AV18Prioridad;
      this.aP8[0] = pprdes2.this.AV24AnyAct;
      this.aP9[0] = pprdes2.this.AV19AnyAnt;
      this.aP10[0] = pprdes2.this.AV25MesAct;
      this.aP11[0] = pprdes2.this.AV20MesAnt;
      this.aP12[0] = pprdes2.this.AV21PrecAnt;
      this.aP13[0] = pprdes2.this.AV22FecAct;
      this.aP14[0] = pprdes2.this.AV23FecAnt;
      this.aP15[0] = pprdes2.this.Gx_mode;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprdes2");
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
      P01882_A396EmprCod = new String[] {""} ;
      P01882_A3915EmpNumDec = new byte[1] ;
      P01882_n3915EmpNumDec = new boolean[] {false} ;
      A330DifEstCa1 = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      A790PrvEstCm0 = DecimalUtil.ZERO ;
      A791PrvEstCm1 = DecimalUtil.ZERO ;
      P01885_A396EmprCod = new String[] {""} ;
      P01885_A795PrvNum = new int[1] ;
      P01885_A779PrvAny = new short[1] ;
      P01885_A796PrvNumLin = new byte[1] ;
      P01885_A790PrvEstCm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01885_n790PrvEstCm0 = new boolean[] {false} ;
      P01885_A791PrvEstCm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01885_n791PrvEstCm1 = new boolean[] {false} ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_int4 = new int[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_char7 = new String[1] ;
      P01887_A396EmprCod = new String[] {""} ;
      P01887_A795PrvNum = new int[1] ;
      P01887_A796PrvNumLin = new byte[1] ;
      P01887_A779PrvAny = new short[1] ;
      P01887_A790PrvEstCm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01887_n790PrvEstCm0 = new boolean[] {false} ;
      P01887_A791PrvEstCm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01887_n791PrvEstCm1 = new boolean[] {false} ;
      P018811_A396EmprCod = new String[] {""} ;
      P018811_A795PrvNum = new int[1] ;
      P018811_A779PrvAny = new short[1] ;
      P018811_A796PrvNumLin = new byte[1] ;
      P018811_A790PrvEstCm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018811_n790PrvEstCm0 = new boolean[] {false} ;
      P018811_A791PrvEstCm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018811_n791PrvEstCm1 = new boolean[] {false} ;
      P018813_A396EmprCod = new String[] {""} ;
      P018813_A795PrvNum = new int[1] ;
      P018813_A779PrvAny = new short[1] ;
      P018813_A796PrvNumLin = new byte[1] ;
      P018813_A790PrvEstCm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018813_n790PrvEstCm0 = new boolean[] {false} ;
      P018813_A791PrvEstCm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018813_n791PrvEstCm1 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprdes2__default(),
         new Object[] {
             new Object[] {
            P01882_A396EmprCod, P01882_A3915EmpNumDec, P01882_n3915EmpNumDec
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01885_A396EmprCod, P01885_A795PrvNum, P01885_A779PrvAny, P01885_A796PrvNumLin, P01885_A790PrvEstCm0, P01885_n790PrvEstCm0, P01885_A791PrvEstCm1, P01885_n791PrvEstCm1
            }
            , new Object[] {
            }
            , new Object[] {
            P01887_A396EmprCod, P01887_A795PrvNum, P01887_A796PrvNumLin, P01887_A779PrvAny, P01887_A790PrvEstCm0, P01887_n790PrvEstCm0, P01887_A791PrvEstCm1, P01887_n791PrvEstCm1
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P018811_A396EmprCod, P018811_A795PrvNum, P018811_A779PrvAny, P018811_A796PrvNumLin, P018811_A790PrvEstCm0, P018811_n790PrvEstCm0, P018811_A791PrvEstCm1, P018811_n791PrvEstCm1
            }
            , new Object[] {
            }
            , new Object[] {
            P018813_A396EmprCod, P018813_A795PrvNum, P018813_A779PrvAny, P018813_A796PrvNumLin, P018813_A790PrvEstCm0, P018813_n790PrvEstCm0, P018813_A791PrvEstCm1, P018813_n791PrvEstCm1
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A796PrvNumLin ;
   private byte AV25MesAct ;
   private byte AV20MesAnt ;
   private byte A3915EmpNumDec ;
   private byte AV28EmpNumDec ;
   private byte AV27FlagEnc ;
   private short A779PrvAny ;
   private short AV24AnyAct ;
   private short AV19AnyAnt ;
   private short Gx_err ;
   private int A795PrvNum ;
   private int GX_INS92 ;
   private int GX_INS93 ;
   private int GXv_int2[] ;
   private int A658PedCod ;
   private int GXv_int4[] ;
   private java.math.BigDecimal AV17Unidades ;
   private java.math.BigDecimal AV15UniOld ;
   private java.math.BigDecimal AV16Precio ;
   private java.math.BigDecimal AV21PrecAnt ;
   private java.math.BigDecimal A330DifEstCa1 ;
   private java.math.BigDecimal A790PrvEstCm0 ;
   private java.math.BigDecimal A791PrvEstCm1 ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String A396EmprCod ;
   private String AV18Prioridad ;
   private String Gx_mode ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private String GXv_char1[] ;
   private String GXv_char7[] ;
   private java.util.Date AV22FecAct ;
   private java.util.Date AV23FecAnt ;
   private java.util.Date GXv_date3[] ;
   private boolean n3915EmpNumDec ;
   private boolean n330DifEstCa1 ;
   private boolean n790PrvEstCm0 ;
   private boolean n791PrvEstCm1 ;
   private String[] aP15 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private byte[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP7 ;
   private short[] aP8 ;
   private short[] aP9 ;
   private byte[] aP10 ;
   private byte[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private java.util.Date[] aP13 ;
   private java.util.Date[] aP14 ;
   private IDataStoreProvider pr_default ;
   private String[] P01882_A396EmprCod ;
   private byte[] P01882_A3915EmpNumDec ;
   private boolean[] P01882_n3915EmpNumDec ;
   private String[] P01885_A396EmprCod ;
   private int[] P01885_A795PrvNum ;
   private short[] P01885_A779PrvAny ;
   private byte[] P01885_A796PrvNumLin ;
   private java.math.BigDecimal[] P01885_A790PrvEstCm0 ;
   private boolean[] P01885_n790PrvEstCm0 ;
   private java.math.BigDecimal[] P01885_A791PrvEstCm1 ;
   private boolean[] P01885_n791PrvEstCm1 ;
   private String[] P01887_A396EmprCod ;
   private int[] P01887_A795PrvNum ;
   private byte[] P01887_A796PrvNumLin ;
   private short[] P01887_A779PrvAny ;
   private java.math.BigDecimal[] P01887_A790PrvEstCm0 ;
   private boolean[] P01887_n790PrvEstCm0 ;
   private java.math.BigDecimal[] P01887_A791PrvEstCm1 ;
   private boolean[] P01887_n791PrvEstCm1 ;
   private String[] P018811_A396EmprCod ;
   private int[] P018811_A795PrvNum ;
   private short[] P018811_A779PrvAny ;
   private byte[] P018811_A796PrvNumLin ;
   private java.math.BigDecimal[] P018811_A790PrvEstCm0 ;
   private boolean[] P018811_n790PrvEstCm0 ;
   private java.math.BigDecimal[] P018811_A791PrvEstCm1 ;
   private boolean[] P018811_n791PrvEstCm1 ;
   private String[] P018813_A396EmprCod ;
   private int[] P018813_A795PrvNum ;
   private short[] P018813_A779PrvAny ;
   private byte[] P018813_A796PrvNumLin ;
   private java.math.BigDecimal[] P018813_A790PrvEstCm0 ;
   private boolean[] P018813_n790PrvEstCm0 ;
   private java.math.BigDecimal[] P018813_A791PrvEstCm1 ;
   private boolean[] P018813_n791PrvEstCm1 ;
}

final  class pprdes2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01882", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01883", "INSERT INTO TXPCPRVES(EmprCod, PrvNum, PrvAny, DifEstCa1) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRVES")
         ,new UpdateCursor("P01884", "INSERT INTO TXPLPRVES(EmprCod, PrvNum, PrvAny, PrvNumLin, PrvEstCm0, PrvEstCm1, PrvDevMes) VALUES(?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRVES")
         ,new ForEachCursor("P01885", "SELECT EmprCod, PrvNum, PrvAny, PrvNumLin, PrvEstCm0, PrvEstCm1 FROM TXPLPRVES WHERE EmprCod = ? and PrvNum = ? and PrvAny = ? and PrvNumLin = ? ORDER BY EmprCod, PrvNum, PrvAny, PrvNumLin  FOR UPDATE OF PrvEstCm0, PrvEstCm1 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01886", "UPDATE TXPLPRVES SET PrvEstCm0=?, PrvEstCm1=?  WHERE EmprCod = ? AND PrvNum = ? AND PrvAny = ? AND PrvNumLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRVES")
         ,new ForEachCursor("P01887", "SELECT EmprCod, PrvNum, PrvNumLin, PrvAny, PrvEstCm0, PrvEstCm1 FROM TXPLPRVES WHERE EmprCod = ? and PrvNum = ? and PrvAny = ? and PrvNumLin = ? ORDER BY EmprCod, PrvNum, PrvAny, PrvNumLin  FOR UPDATE OF PrvEstCm0, PrvEstCm1 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01888", "UPDATE TXPLPRVES SET PrvEstCm0=?, PrvEstCm1=?  WHERE EmprCod = ? AND PrvNum = ? AND PrvAny = ? AND PrvNumLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRVES")
         ,new UpdateCursor("P01889", "INSERT INTO TXPCPRVES(EmprCod, PrvNum, PrvAny, DifEstCa1) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRVES")
         ,new UpdateCursor("P018810", "INSERT INTO TXPLPRVES(EmprCod, PrvNum, PrvAny, PrvNumLin, PrvEstCm0, PrvEstCm1, PrvDevMes) VALUES(?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRVES")
         ,new ForEachCursor("P018811", "SELECT EmprCod, PrvNum, PrvAny, PrvNumLin, PrvEstCm0, PrvEstCm1 FROM TXPLPRVES WHERE EmprCod = ? and PrvNum = ? and PrvAny = ? and PrvNumLin = ? ORDER BY EmprCod, PrvNum, PrvAny, PrvNumLin  FOR UPDATE OF PrvEstCm0, PrvEstCm1 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P018812", "UPDATE TXPLPRVES SET PrvEstCm0=?, PrvEstCm1=?  WHERE EmprCod = ? AND PrvNum = ? AND PrvAny = ? AND PrvNumLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRVES")
         ,new ForEachCursor("P018813", "SELECT EmprCod, PrvNum, PrvAny, PrvNumLin, PrvEstCm0, PrvEstCm1 FROM TXPLPRVES WHERE EmprCod = ? and PrvNum = ? and PrvAny = ? and PrvNumLin = ? ORDER BY EmprCod, PrvNum, PrvAny, PrvNumLin  FOR UPDATE OF PrvEstCm0, PrvEstCm1 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P018814", "UPDATE TXPLPRVES SET PrvEstCm0=?, PrvEstCm1=?  WHERE EmprCod = ? AND PrvNum = ? AND PrvAny = ? AND PrvNumLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRVES")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 6 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 10 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 12 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

