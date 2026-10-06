package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppegfoa extends GXProcedure
{
   public ppegfoa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppegfoa.class ), "" );
   }

   public ppegfoa( int remoteHandle ,
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
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             short[] aP9 ,
                             String[] aP10 )
   {
      ppegfoa.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        short[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             short[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      ppegfoa.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppegfoa.this.AV14BarCod = aP1[0];
      this.aP1 = aP1;
      ppegfoa.this.AV15BarCodReo = aP2[0];
      this.aP2 = aP2;
      ppegfoa.this.AV16BarCodPar = aP3[0];
      this.aP3 = aP3;
      ppegfoa.this.AV17BarAgrCod = aP4[0];
      this.aP4 = aP4;
      ppegfoa.this.AV18BarAgrReo = aP5[0];
      this.aP5 = aP5;
      ppegfoa.this.AV19BarAgrPar = aP6[0];
      this.aP6 = aP6;
      ppegfoa.this.AV22MtrAgr = aP7[0];
      this.aP7 = aP7;
      ppegfoa.this.AV21KgmAgr = aP8[0];
      this.aP8 = aP8;
      ppegfoa.this.AV20PieAgr = aP9[0];
      this.aP9 = aP9;
      ppegfoa.this.AV23Tipo = aP10[0];
      this.aP10 = aP10;
      ppegfoa.this.AV24Accion = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV23Tipo, httpContext.getMessage( "P", "")) == 0 )
      {
         if ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "A", "")) == 0 )
         {
            /* Execute user subroutine: 'PEGADOS_ALTA' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "B", "")) == 0 )
         {
            /* Execute user subroutine: 'PEGADOS_BAJA' */
            S131 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "E", "")) == 0 )
         {
            /* Execute user subroutine: 'PEGADOS_ELI_TOTAL' */
            S151 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
      }
      else if ( GXutil.strcmp(AV23Tipo, httpContext.getMessage( "F", "")) == 0 )
      {
         if ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "A", "")) == 0 )
         {
            /* Execute user subroutine: 'FOAMIZADOS_ALTA' */
            S121 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "B", "")) == 0 )
         {
            /* Execute user subroutine: 'FOAMIZADOS_BAJA' */
            S141 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "E", "")) == 0 )
         {
            /* Execute user subroutine: 'FOAMIZADOS_ELI_TOTAL' */
            S161 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'PEGADOS_ALTA' Routine */
      returnInSub = false ;
      /* Using cursor P012S3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV14BarCod), Byte.valueOf(AV15BarCodReo), AV16BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P012S3_A130BarCodPar[0] ;
         A132BarCodReo = P012S3_A132BarCodReo[0] ;
         A129BarCod = P012S3_A129BarCod[0] ;
         A3744BarPeg = P012S3_A3744BarPeg[0] ;
         A166BarKgm = P012S3_A166BarKgm[0] ;
         A184BarMtr = P012S3_A184BarMtr[0] ;
         A199BarPie1 = P012S3_A199BarPie1[0] ;
         A365DisDes = P012S3_A365DisDes[0] ;
         A898BarPieNDes = P012S3_A898BarPieNDes[0] ;
         A166BarKgm = P012S3_A166BarKgm[0] ;
         A184BarMtr = P012S3_A184BarMtr[0] ;
         A199BarPie1 = P012S3_A199BarPie1[0] ;
         A898BarPieNDes = P012S3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A3744BarPeg = httpContext.getMessage( "S", "") ;
         /*
            INSERT RECORD ON TABLE TXPBARPEG

         */
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A129BarCod = AV17BarAgrCod ;
         A132BarCodReo = AV18BarAgrReo ;
         A130BarCodPar = AV19BarAgrPar ;
         A3747BarPegCod = AV14BarCod ;
         A3748BarPegReo = AV15BarCodReo ;
         A3749BarPegPar = AV16BarCodPar ;
         A3750KgmPeg = A166BarKgm ;
         n3750KgmPeg = false ;
         A3752MtrPeg = A184BarMtr ;
         n3752MtrPeg = false ;
         A3751PiePeg = (short)(A198BarPie) ;
         n3751PiePeg = false ;
         /* Using cursor P012S4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3747BarPegCod), Byte.valueOf(A3748BarPegReo), A3749BarPegPar, Boolean.valueOf(n3750KgmPeg), A3750KgmPeg, Boolean.valueOf(n3751PiePeg), Short.valueOf(A3751PiePeg), Boolean.valueOf(n3752MtrPeg), A3752MtrPeg});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPEG");
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
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* End Insert */
         /* Using cursor P012S5 */
         pr_default.execute(2, new Object[] {A3744BarPeg, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P012S6 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV17BarAgrCod), Byte.valueOf(AV18BarAgrReo), AV19BarAgrPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P012S6_A130BarCodPar[0] ;
         A132BarCodReo = P012S6_A132BarCodReo[0] ;
         A129BarCod = P012S6_A129BarCod[0] ;
         A3744BarPeg = P012S6_A3744BarPeg[0] ;
         A3744BarPeg = httpContext.getMessage( "S", "") ;
         /* Using cursor P012S7 */
         pr_default.execute(4, new Object[] {A3744BarPeg, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      /* Using cursor P012S8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV14BarCod), Byte.valueOf(AV15BarCodReo), AV16BarCodPar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A3752MtrPeg = P012S8_A3752MtrPeg[0] ;
         n3752MtrPeg = P012S8_n3752MtrPeg[0] ;
         A3751PiePeg = P012S8_A3751PiePeg[0] ;
         n3751PiePeg = P012S8_n3751PiePeg[0] ;
         A3750KgmPeg = P012S8_A3750KgmPeg[0] ;
         n3750KgmPeg = P012S8_n3750KgmPeg[0] ;
         A3749BarPegPar = P012S8_A3749BarPegPar[0] ;
         A3748BarPegReo = P012S8_A3748BarPegReo[0] ;
         A3747BarPegCod = P012S8_A3747BarPegCod[0] ;
         A130BarCodPar = P012S8_A130BarCodPar[0] ;
         A132BarCodReo = P012S8_A132BarCodReo[0] ;
         A129BarCod = P012S8_A129BarCod[0] ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV25Mtspeg = A3752MtrPeg ;
         if ( ( A3747BarPegCod != AV17BarAgrCod ) || ( A3748BarPegReo != AV18BarAgrReo ) || ( GXutil.strcmp(A3749BarPegPar, AV19BarAgrPar) != 0 ) )
         {
            /*
               INSERT RECORD ON TABLE TXPBARPEG

            */
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W3747BarPegCod = A3747BarPegCod ;
            W3748BarPegReo = A3748BarPegReo ;
            W3749BarPegPar = A3749BarPegPar ;
            W3750KgmPeg = A3750KgmPeg ;
            n3750KgmPeg = false ;
            W3752MtrPeg = A3752MtrPeg ;
            n3752MtrPeg = false ;
            W3751PiePeg = A3751PiePeg ;
            n3751PiePeg = false ;
            A129BarCod = A3747BarPegCod ;
            A132BarCodReo = A3748BarPegReo ;
            A130BarCodPar = A3749BarPegPar ;
            A3747BarPegCod = AV17BarAgrCod ;
            A3748BarPegReo = AV18BarAgrReo ;
            A3749BarPegPar = AV19BarAgrPar ;
            A3750KgmPeg = AV21KgmAgr ;
            n3750KgmPeg = false ;
            A3752MtrPeg = AV22MtrAgr ;
            n3752MtrPeg = false ;
            A3751PiePeg = AV20PieAgr ;
            n3751PiePeg = false ;
            /* Using cursor P012S9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3747BarPegCod), Byte.valueOf(A3748BarPegReo), A3749BarPegPar, Boolean.valueOf(n3750KgmPeg), A3750KgmPeg, Boolean.valueOf(n3751PiePeg), Short.valueOf(A3751PiePeg), Boolean.valueOf(n3752MtrPeg), A3752MtrPeg});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPEG");
            if ( (pr_default.getStatus(6) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               n3751PiePeg = false ;
               n3752MtrPeg = false ;
               n3750KgmPeg = false ;
               /* Optimized UPDATE. */
               /* Using cursor P012S10 */
               pr_default.execute(7, new Object[] {Boolean.valueOf(n3751PiePeg), Short.valueOf(AV20PieAgr), Boolean.valueOf(n3752MtrPeg), AV22MtrAgr, Boolean.valueOf(n3750KgmPeg), AV21KgmAgr, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3747BarPegCod), Byte.valueOf(A3748BarPegReo), A3749BarPegPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPEG");
               /* End optimized UPDATE. */
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A3747BarPegCod = W3747BarPegCod ;
            A3748BarPegReo = W3748BarPegReo ;
            A3749BarPegPar = W3749BarPegPar ;
            A3750KgmPeg = W3750KgmPeg ;
            n3750KgmPeg = false ;
            A3752MtrPeg = W3752MtrPeg ;
            n3752MtrPeg = false ;
            A3751PiePeg = W3751PiePeg ;
            n3751PiePeg = false ;
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPBARPEG

            */
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W3752MtrPeg = A3752MtrPeg ;
            n3752MtrPeg = false ;
            A129BarCod = AV17BarAgrCod ;
            A132BarCodReo = AV18BarAgrReo ;
            A130BarCodPar = AV19BarAgrPar ;
            A3752MtrPeg = AV25Mtspeg ;
            n3752MtrPeg = false ;
            /* Using cursor P012S11 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3747BarPegCod), Byte.valueOf(A3748BarPegReo), A3749BarPegPar, Boolean.valueOf(n3750KgmPeg), A3750KgmPeg, Boolean.valueOf(n3751PiePeg), Short.valueOf(A3751PiePeg), Boolean.valueOf(n3752MtrPeg), A3752MtrPeg});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPEG");
            if ( (pr_default.getStatus(8) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A3752MtrPeg = W3752MtrPeg ;
            n3752MtrPeg = false ;
            /* End Insert */
         }
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S121( )
   {
      /* 'FOAMIZADOS_ALTA' Routine */
      returnInSub = false ;
      /* Using cursor P012S13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV14BarCod), Byte.valueOf(AV15BarCodReo), AV16BarCodPar});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A130BarCodPar = P012S13_A130BarCodPar[0] ;
         A132BarCodReo = P012S13_A132BarCodReo[0] ;
         A129BarCod = P012S13_A129BarCod[0] ;
         A3745BarFoa = P012S13_A3745BarFoa[0] ;
         A166BarKgm = P012S13_A166BarKgm[0] ;
         A184BarMtr = P012S13_A184BarMtr[0] ;
         A199BarPie1 = P012S13_A199BarPie1[0] ;
         A365DisDes = P012S13_A365DisDes[0] ;
         A898BarPieNDes = P012S13_A898BarPieNDes[0] ;
         A166BarKgm = P012S13_A166BarKgm[0] ;
         A184BarMtr = P012S13_A184BarMtr[0] ;
         A199BarPie1 = P012S13_A199BarPie1[0] ;
         A898BarPieNDes = P012S13_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A3745BarFoa = httpContext.getMessage( "S", "") ;
         /*
            INSERT RECORD ON TABLE TXPBARFOA

         */
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A129BarCod = AV17BarAgrCod ;
         A132BarCodReo = AV18BarAgrReo ;
         A130BarCodPar = AV19BarAgrPar ;
         A3753BarFoaCod = AV14BarCod ;
         A3754BarFoaReo = AV15BarCodReo ;
         A3755BarFoaPar = AV16BarCodPar ;
         A3756KgmFoa = A166BarKgm ;
         n3756KgmFoa = false ;
         A3758MtrFoa = A184BarMtr ;
         n3758MtrFoa = false ;
         A3757PieFoa = (short)(A198BarPie) ;
         n3757PieFoa = false ;
         /* Using cursor P012S14 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3753BarFoaCod), Byte.valueOf(A3754BarFoaReo), A3755BarFoaPar, Boolean.valueOf(n3756KgmFoa), A3756KgmFoa, Boolean.valueOf(n3757PieFoa), Short.valueOf(A3757PieFoa), Boolean.valueOf(n3758MtrFoa), A3758MtrFoa});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFOA");
         if ( (pr_default.getStatus(10) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* End Insert */
         /* Using cursor P012S15 */
         pr_default.execute(11, new Object[] {A3745BarFoa, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
      /* Using cursor P012S16 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV17BarAgrCod), Byte.valueOf(AV18BarAgrReo), AV19BarAgrPar});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A130BarCodPar = P012S16_A130BarCodPar[0] ;
         A132BarCodReo = P012S16_A132BarCodReo[0] ;
         A129BarCod = P012S16_A129BarCod[0] ;
         A3745BarFoa = P012S16_A3745BarFoa[0] ;
         A3745BarFoa = httpContext.getMessage( "S", "") ;
         /* Using cursor P012S17 */
         pr_default.execute(13, new Object[] {A3745BarFoa, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
      /* Using cursor P012S18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV14BarCod), Byte.valueOf(AV15BarCodReo), AV16BarCodPar});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A3758MtrFoa = P012S18_A3758MtrFoa[0] ;
         n3758MtrFoa = P012S18_n3758MtrFoa[0] ;
         A130BarCodPar = P012S18_A130BarCodPar[0] ;
         A132BarCodReo = P012S18_A132BarCodReo[0] ;
         A129BarCod = P012S18_A129BarCod[0] ;
         A3757PieFoa = P012S18_A3757PieFoa[0] ;
         n3757PieFoa = P012S18_n3757PieFoa[0] ;
         A3756KgmFoa = P012S18_A3756KgmFoa[0] ;
         n3756KgmFoa = P012S18_n3756KgmFoa[0] ;
         A3755BarFoaPar = P012S18_A3755BarFoaPar[0] ;
         A3754BarFoaReo = P012S18_A3754BarFoaReo[0] ;
         A3753BarFoaCod = P012S18_A3753BarFoaCod[0] ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV26MtsFoa = A3758MtrFoa ;
         if ( ( A3753BarFoaCod != AV17BarAgrCod ) || ( A3754BarFoaReo != AV18BarAgrReo ) || ( GXutil.strcmp(A3755BarFoaPar, AV19BarAgrPar) != 0 ) )
         {
            /*
               INSERT RECORD ON TABLE TXPBARFOA

            */
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W3758MtrFoa = A3758MtrFoa ;
            n3758MtrFoa = false ;
            A129BarCod = AV17BarAgrCod ;
            A132BarCodReo = AV18BarAgrReo ;
            A130BarCodPar = AV19BarAgrPar ;
            A3758MtrFoa = AV26MtsFoa ;
            n3758MtrFoa = false ;
            /* Using cursor P012S19 */
            pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3753BarFoaCod), Byte.valueOf(A3754BarFoaReo), A3755BarFoaPar, Boolean.valueOf(n3756KgmFoa), A3756KgmFoa, Boolean.valueOf(n3757PieFoa), Short.valueOf(A3757PieFoa), Boolean.valueOf(n3758MtrFoa), A3758MtrFoa});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFOA");
            if ( (pr_default.getStatus(15) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A3758MtrFoa = W3758MtrFoa ;
            n3758MtrFoa = false ;
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPBARFOA

            */
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W3753BarFoaCod = A3753BarFoaCod ;
            W3754BarFoaReo = A3754BarFoaReo ;
            W3755BarFoaPar = A3755BarFoaPar ;
            W3756KgmFoa = A3756KgmFoa ;
            n3756KgmFoa = false ;
            W3758MtrFoa = A3758MtrFoa ;
            n3758MtrFoa = false ;
            W3757PieFoa = A3757PieFoa ;
            n3757PieFoa = false ;
            A129BarCod = A3753BarFoaCod ;
            A132BarCodReo = A3754BarFoaReo ;
            A130BarCodPar = A3755BarFoaPar ;
            A3753BarFoaCod = AV17BarAgrCod ;
            A3754BarFoaReo = AV18BarAgrReo ;
            A3755BarFoaPar = AV19BarAgrPar ;
            A3756KgmFoa = AV21KgmAgr ;
            n3756KgmFoa = false ;
            A3758MtrFoa = AV22MtrAgr ;
            n3758MtrFoa = false ;
            A3757PieFoa = AV20PieAgr ;
            n3757PieFoa = false ;
            /* Using cursor P012S20 */
            pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3753BarFoaCod), Byte.valueOf(A3754BarFoaReo), A3755BarFoaPar, Boolean.valueOf(n3756KgmFoa), A3756KgmFoa, Boolean.valueOf(n3757PieFoa), Short.valueOf(A3757PieFoa), Boolean.valueOf(n3758MtrFoa), A3758MtrFoa});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFOA");
            if ( (pr_default.getStatus(16) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               n3757PieFoa = false ;
               n3758MtrFoa = false ;
               n3756KgmFoa = false ;
               /* Optimized UPDATE. */
               /* Using cursor P012S21 */
               pr_default.execute(17, new Object[] {Boolean.valueOf(n3757PieFoa), Short.valueOf(AV20PieAgr), Boolean.valueOf(n3758MtrFoa), AV22MtrAgr, Boolean.valueOf(n3756KgmFoa), AV21KgmAgr, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3753BarFoaCod), Byte.valueOf(A3754BarFoaReo), A3755BarFoaPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFOA");
               /* End optimized UPDATE. */
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A3753BarFoaCod = W3753BarFoaCod ;
            A3754BarFoaReo = W3754BarFoaReo ;
            A3755BarFoaPar = W3755BarFoaPar ;
            A3756KgmFoa = W3756KgmFoa ;
            n3756KgmFoa = false ;
            A3758MtrFoa = W3758MtrFoa ;
            n3758MtrFoa = false ;
            A3757PieFoa = W3757PieFoa ;
            n3757PieFoa = false ;
            /* End Insert */
         }
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(14);
      }
      pr_default.close(14);
   }

   public void S131( )
   {
      /* 'PEGADOS_BAJA' Routine */
      returnInSub = false ;
      /* Using cursor P012S22 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(AV17BarAgrCod), Byte.valueOf(AV18BarAgrReo), AV19BarAgrPar, A396EmprCod, Integer.valueOf(AV17BarAgrCod), Byte.valueOf(AV18BarAgrReo), AV19BarAgrPar});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A130BarCodPar = P012S22_A130BarCodPar[0] ;
         A132BarCodReo = P012S22_A132BarCodReo[0] ;
         A129BarCod = P012S22_A129BarCod[0] ;
         A3747BarPegCod = P012S22_A3747BarPegCod[0] ;
         A3748BarPegReo = P012S22_A3748BarPegReo[0] ;
         A3749BarPegPar = P012S22_A3749BarPegPar[0] ;
         /* Using cursor P012S23 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A3744BarPeg = P012S23_A3744BarPeg[0] ;
         /* Using cursor P012S24 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3747BarPegCod), Byte.valueOf(A3748BarPegReo), A3749BarPegPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPEG");
         A3744BarPeg = httpContext.getMessage( "N", "") ;
         /* Using cursor P012S25 */
         pr_default.execute(21, new Object[] {A3744BarPeg, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(18);
      }
      pr_default.close(18);
      pr_default.close(19);
      /* Optimized DELETE. */
      /* Using cursor P012S26 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(AV17BarAgrCod), Byte.valueOf(AV18BarAgrReo), AV19BarAgrPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPEG");
      /* End optimized DELETE. */
   }

   public void S141( )
   {
      /* 'FOAMIZADOS_BAJA' Routine */
      returnInSub = false ;
      /* Using cursor P012S27 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(AV17BarAgrCod), Byte.valueOf(AV18BarAgrReo), AV19BarAgrPar, A396EmprCod, Integer.valueOf(AV17BarAgrCod), Byte.valueOf(AV18BarAgrReo), AV19BarAgrPar});
      while ( (pr_default.getStatus(23) != 101) )
      {
         A130BarCodPar = P012S27_A130BarCodPar[0] ;
         A132BarCodReo = P012S27_A132BarCodReo[0] ;
         A129BarCod = P012S27_A129BarCod[0] ;
         A3753BarFoaCod = P012S27_A3753BarFoaCod[0] ;
         A3754BarFoaReo = P012S27_A3754BarFoaReo[0] ;
         A3755BarFoaPar = P012S27_A3755BarFoaPar[0] ;
         /* Using cursor P012S28 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A3745BarFoa = P012S28_A3745BarFoa[0] ;
         /* Using cursor P012S29 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3753BarFoaCod), Byte.valueOf(A3754BarFoaReo), A3755BarFoaPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFOA");
         A3745BarFoa = httpContext.getMessage( "N", "") ;
         /* Using cursor P012S30 */
         pr_default.execute(26, new Object[] {A3745BarFoa, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(23);
      }
      pr_default.close(23);
      pr_default.close(24);
      /* Optimized DELETE. */
      /* Using cursor P012S31 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(AV17BarAgrCod), Byte.valueOf(AV18BarAgrReo), AV19BarAgrPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFOA");
      /* End optimized DELETE. */
   }

   public void S151( )
   {
      /* 'PEGADOS_ELI_TOTAL' Routine */
      returnInSub = false ;
      /* Using cursor P012S32 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(AV14BarCod), Byte.valueOf(AV15BarCodReo), AV16BarCodPar});
      while ( (pr_default.getStatus(28) != 101) )
      {
         A130BarCodPar = P012S32_A130BarCodPar[0] ;
         A132BarCodReo = P012S32_A132BarCodReo[0] ;
         A129BarCod = P012S32_A129BarCod[0] ;
         A3747BarPegCod = P012S32_A3747BarPegCod[0] ;
         A3748BarPegReo = P012S32_A3748BarPegReo[0] ;
         A3749BarPegPar = P012S32_A3749BarPegPar[0] ;
         /* Using cursor P012S33 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3747BarPegCod), Byte.valueOf(A3748BarPegReo), A3749BarPegPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPEG");
         AV17BarAgrCod = A3747BarPegCod ;
         AV18BarAgrReo = A3748BarPegReo ;
         AV19BarAgrPar = A3749BarPegPar ;
         /* Execute user subroutine: 'PEGADOS_BAJA' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(28);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(28);
      }
      pr_default.close(28);
      /* Using cursor P012S34 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(AV14BarCod), Byte.valueOf(AV15BarCodReo), AV16BarCodPar});
      while ( (pr_default.getStatus(30) != 101) )
      {
         A130BarCodPar = P012S34_A130BarCodPar[0] ;
         A132BarCodReo = P012S34_A132BarCodReo[0] ;
         A129BarCod = P012S34_A129BarCod[0] ;
         A213BarSit = P012S34_A213BarSit[0] ;
         A3744BarPeg = P012S34_A3744BarPeg[0] ;
         A3744BarPeg = httpContext.getMessage( "N", "") ;
         /* Using cursor P012S35 */
         pr_default.execute(31, new Object[] {A3744BarPeg, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(30);
   }

   public void S161( )
   {
      /* 'FOAMIZADOS_ELI_TOTAL' Routine */
      returnInSub = false ;
      /* Using cursor P012S36 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(AV14BarCod), Byte.valueOf(AV15BarCodReo), AV16BarCodPar});
      while ( (pr_default.getStatus(32) != 101) )
      {
         A130BarCodPar = P012S36_A130BarCodPar[0] ;
         A132BarCodReo = P012S36_A132BarCodReo[0] ;
         A129BarCod = P012S36_A129BarCod[0] ;
         A3753BarFoaCod = P012S36_A3753BarFoaCod[0] ;
         A3754BarFoaReo = P012S36_A3754BarFoaReo[0] ;
         A3755BarFoaPar = P012S36_A3755BarFoaPar[0] ;
         /* Using cursor P012S37 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A3753BarFoaCod), Byte.valueOf(A3754BarFoaReo), A3755BarFoaPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFOA");
         AV17BarAgrCod = A3753BarFoaCod ;
         AV18BarAgrReo = A3754BarFoaReo ;
         AV19BarAgrPar = A3755BarFoaPar ;
         /* Execute user subroutine: 'FOAMIZADOS_BAJA' */
         S141 ();
         if ( returnInSub )
         {
            pr_default.close(32);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(32);
      }
      pr_default.close(32);
      /* Using cursor P012S38 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(AV14BarCod), Byte.valueOf(AV15BarCodReo), AV16BarCodPar});
      while ( (pr_default.getStatus(34) != 101) )
      {
         A130BarCodPar = P012S38_A130BarCodPar[0] ;
         A132BarCodReo = P012S38_A132BarCodReo[0] ;
         A129BarCod = P012S38_A129BarCod[0] ;
         A213BarSit = P012S38_A213BarSit[0] ;
         A3745BarFoa = P012S38_A3745BarFoa[0] ;
         A3745BarFoa = httpContext.getMessage( "N", "") ;
         /* Using cursor P012S39 */
         pr_default.execute(35, new Object[] {A3745BarFoa, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(34);
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppegfoa.this.A396EmprCod;
      this.aP1[0] = ppegfoa.this.AV14BarCod;
      this.aP2[0] = ppegfoa.this.AV15BarCodReo;
      this.aP3[0] = ppegfoa.this.AV16BarCodPar;
      this.aP4[0] = ppegfoa.this.AV17BarAgrCod;
      this.aP5[0] = ppegfoa.this.AV18BarAgrReo;
      this.aP6[0] = ppegfoa.this.AV19BarAgrPar;
      this.aP7[0] = ppegfoa.this.AV22MtrAgr;
      this.aP8[0] = ppegfoa.this.AV21KgmAgr;
      this.aP9[0] = ppegfoa.this.AV20PieAgr;
      this.aP10[0] = ppegfoa.this.AV23Tipo;
      this.aP11[0] = ppegfoa.this.AV24Accion;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppegfoa");
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
      P012S3_A396EmprCod = new String[] {""} ;
      P012S3_A130BarCodPar = new String[] {""} ;
      P012S3_A132BarCodReo = new byte[1] ;
      P012S3_A129BarCod = new int[1] ;
      P012S3_A3744BarPeg = new String[] {""} ;
      P012S3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012S3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012S3_A199BarPie1 = new short[1] ;
      P012S3_A365DisDes = new String[] {""} ;
      P012S3_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A3744BarPeg = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      W130BarCodPar = "" ;
      A3749BarPegPar = "" ;
      A3750KgmPeg = DecimalUtil.ZERO ;
      A3752MtrPeg = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P012S6_A396EmprCod = new String[] {""} ;
      P012S6_A130BarCodPar = new String[] {""} ;
      P012S6_A132BarCodReo = new byte[1] ;
      P012S6_A129BarCod = new int[1] ;
      P012S6_A3744BarPeg = new String[] {""} ;
      P012S8_A396EmprCod = new String[] {""} ;
      P012S8_A3752MtrPeg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012S8_n3752MtrPeg = new boolean[] {false} ;
      P012S8_A3751PiePeg = new short[1] ;
      P012S8_n3751PiePeg = new boolean[] {false} ;
      P012S8_A3750KgmPeg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012S8_n3750KgmPeg = new boolean[] {false} ;
      P012S8_A3749BarPegPar = new String[] {""} ;
      P012S8_A3748BarPegReo = new byte[1] ;
      P012S8_A3747BarPegCod = new int[1] ;
      P012S8_A130BarCodPar = new String[] {""} ;
      P012S8_A132BarCodReo = new byte[1] ;
      P012S8_A129BarCod = new int[1] ;
      AV25Mtspeg = DecimalUtil.ZERO ;
      W3749BarPegPar = "" ;
      W3750KgmPeg = DecimalUtil.ZERO ;
      W3752MtrPeg = DecimalUtil.ZERO ;
      P012S13_A396EmprCod = new String[] {""} ;
      P012S13_A130BarCodPar = new String[] {""} ;
      P012S13_A132BarCodReo = new byte[1] ;
      P012S13_A129BarCod = new int[1] ;
      P012S13_A3745BarFoa = new String[] {""} ;
      P012S13_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012S13_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012S13_A199BarPie1 = new short[1] ;
      P012S13_A365DisDes = new String[] {""} ;
      P012S13_A898BarPieNDes = new int[1] ;
      A3745BarFoa = "" ;
      A3755BarFoaPar = "" ;
      A3756KgmFoa = DecimalUtil.ZERO ;
      A3758MtrFoa = DecimalUtil.ZERO ;
      P012S16_A396EmprCod = new String[] {""} ;
      P012S16_A130BarCodPar = new String[] {""} ;
      P012S16_A132BarCodReo = new byte[1] ;
      P012S16_A129BarCod = new int[1] ;
      P012S16_A3745BarFoa = new String[] {""} ;
      P012S18_A396EmprCod = new String[] {""} ;
      P012S18_A3758MtrFoa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012S18_n3758MtrFoa = new boolean[] {false} ;
      P012S18_A130BarCodPar = new String[] {""} ;
      P012S18_A132BarCodReo = new byte[1] ;
      P012S18_A129BarCod = new int[1] ;
      P012S18_A3757PieFoa = new short[1] ;
      P012S18_n3757PieFoa = new boolean[] {false} ;
      P012S18_A3756KgmFoa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P012S18_n3756KgmFoa = new boolean[] {false} ;
      P012S18_A3755BarFoaPar = new String[] {""} ;
      P012S18_A3754BarFoaReo = new byte[1] ;
      P012S18_A3753BarFoaCod = new int[1] ;
      AV26MtsFoa = DecimalUtil.ZERO ;
      W3758MtrFoa = DecimalUtil.ZERO ;
      W3755BarFoaPar = "" ;
      W3756KgmFoa = DecimalUtil.ZERO ;
      P012S22_A396EmprCod = new String[] {""} ;
      P012S22_A130BarCodPar = new String[] {""} ;
      P012S22_A132BarCodReo = new byte[1] ;
      P012S22_A129BarCod = new int[1] ;
      P012S22_A3747BarPegCod = new int[1] ;
      P012S22_A3748BarPegReo = new byte[1] ;
      P012S22_A3749BarPegPar = new String[] {""} ;
      P012S23_A3744BarPeg = new String[] {""} ;
      P012S27_A396EmprCod = new String[] {""} ;
      P012S27_A130BarCodPar = new String[] {""} ;
      P012S27_A132BarCodReo = new byte[1] ;
      P012S27_A129BarCod = new int[1] ;
      P012S27_A3753BarFoaCod = new int[1] ;
      P012S27_A3754BarFoaReo = new byte[1] ;
      P012S27_A3755BarFoaPar = new String[] {""} ;
      P012S28_A3745BarFoa = new String[] {""} ;
      P012S32_A396EmprCod = new String[] {""} ;
      P012S32_A130BarCodPar = new String[] {""} ;
      P012S32_A132BarCodReo = new byte[1] ;
      P012S32_A129BarCod = new int[1] ;
      P012S32_A3747BarPegCod = new int[1] ;
      P012S32_A3748BarPegReo = new byte[1] ;
      P012S32_A3749BarPegPar = new String[] {""} ;
      P012S34_A396EmprCod = new String[] {""} ;
      P012S34_A130BarCodPar = new String[] {""} ;
      P012S34_A132BarCodReo = new byte[1] ;
      P012S34_A129BarCod = new int[1] ;
      P012S34_A213BarSit = new byte[1] ;
      P012S34_A3744BarPeg = new String[] {""} ;
      P012S36_A396EmprCod = new String[] {""} ;
      P012S36_A130BarCodPar = new String[] {""} ;
      P012S36_A132BarCodReo = new byte[1] ;
      P012S36_A129BarCod = new int[1] ;
      P012S36_A3753BarFoaCod = new int[1] ;
      P012S36_A3754BarFoaReo = new byte[1] ;
      P012S36_A3755BarFoaPar = new String[] {""} ;
      P012S38_A396EmprCod = new String[] {""} ;
      P012S38_A130BarCodPar = new String[] {""} ;
      P012S38_A132BarCodReo = new byte[1] ;
      P012S38_A129BarCod = new int[1] ;
      P012S38_A213BarSit = new byte[1] ;
      P012S38_A3745BarFoa = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppegfoa__default(),
         new Object[] {
             new Object[] {
            P012S3_A396EmprCod, P012S3_A130BarCodPar, P012S3_A132BarCodReo, P012S3_A129BarCod, P012S3_A3744BarPeg, P012S3_A166BarKgm, P012S3_A184BarMtr, P012S3_A199BarPie1, P012S3_A365DisDes, P012S3_A898BarPieNDes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P012S6_A396EmprCod, P012S6_A130BarCodPar, P012S6_A132BarCodReo, P012S6_A129BarCod, P012S6_A3744BarPeg
            }
            , new Object[] {
            }
            , new Object[] {
            P012S8_A396EmprCod, P012S8_A3752MtrPeg, P012S8_n3752MtrPeg, P012S8_A3751PiePeg, P012S8_n3751PiePeg, P012S8_A3750KgmPeg, P012S8_n3750KgmPeg, P012S8_A3749BarPegPar, P012S8_A3748BarPegReo, P012S8_A3747BarPegCod,
            P012S8_A130BarCodPar, P012S8_A132BarCodReo, P012S8_A129BarCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P012S13_A396EmprCod, P012S13_A130BarCodPar, P012S13_A132BarCodReo, P012S13_A129BarCod, P012S13_A3745BarFoa, P012S13_A166BarKgm, P012S13_A184BarMtr, P012S13_A199BarPie1, P012S13_A365DisDes, P012S13_A898BarPieNDes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P012S16_A396EmprCod, P012S16_A130BarCodPar, P012S16_A132BarCodReo, P012S16_A129BarCod, P012S16_A3745BarFoa
            }
            , new Object[] {
            }
            , new Object[] {
            P012S18_A396EmprCod, P012S18_A3758MtrFoa, P012S18_n3758MtrFoa, P012S18_A130BarCodPar, P012S18_A132BarCodReo, P012S18_A129BarCod, P012S18_A3757PieFoa, P012S18_n3757PieFoa, P012S18_A3756KgmFoa, P012S18_n3756KgmFoa,
            P012S18_A3755BarFoaPar, P012S18_A3754BarFoaReo, P012S18_A3753BarFoaCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P012S22_A396EmprCod, P012S22_A130BarCodPar, P012S22_A132BarCodReo, P012S22_A129BarCod, P012S22_A3747BarPegCod, P012S22_A3748BarPegReo, P012S22_A3749BarPegPar
            }
            , new Object[] {
            P012S23_A3744BarPeg
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P012S27_A396EmprCod, P012S27_A130BarCodPar, P012S27_A132BarCodReo, P012S27_A129BarCod, P012S27_A3753BarFoaCod, P012S27_A3754BarFoaReo, P012S27_A3755BarFoaPar
            }
            , new Object[] {
            P012S28_A3745BarFoa
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P012S32_A396EmprCod, P012S32_A130BarCodPar, P012S32_A132BarCodReo, P012S32_A129BarCod, P012S32_A3747BarPegCod, P012S32_A3748BarPegReo, P012S32_A3749BarPegPar
            }
            , new Object[] {
            }
            , new Object[] {
            P012S34_A396EmprCod, P012S34_A130BarCodPar, P012S34_A132BarCodReo, P012S34_A129BarCod, P012S34_A213BarSit, P012S34_A3744BarPeg
            }
            , new Object[] {
            }
            , new Object[] {
            P012S36_A396EmprCod, P012S36_A130BarCodPar, P012S36_A132BarCodReo, P012S36_A129BarCod, P012S36_A3753BarFoaCod, P012S36_A3754BarFoaReo, P012S36_A3755BarFoaPar
            }
            , new Object[] {
            }
            , new Object[] {
            P012S38_A396EmprCod, P012S38_A130BarCodPar, P012S38_A132BarCodReo, P012S38_A129BarCod, P012S38_A213BarSit, P012S38_A3745BarFoa
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15BarCodReo ;
   private byte AV18BarAgrReo ;
   private byte A132BarCodReo ;
   private byte W132BarCodReo ;
   private byte A3748BarPegReo ;
   private byte W3748BarPegReo ;
   private byte A3754BarFoaReo ;
   private byte W3754BarFoaReo ;
   private byte A213BarSit ;
   private short AV20PieAgr ;
   private short A199BarPie1 ;
   private short A3751PiePeg ;
   private short Gx_err ;
   private short W3751PiePeg ;
   private short A3757PieFoa ;
   private short W3757PieFoa ;
   private int AV14BarCod ;
   private int AV17BarAgrCod ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int W129BarCod ;
   private int GX_INS521 ;
   private int A3747BarPegCod ;
   private int W3747BarPegCod ;
   private int GX_INS522 ;
   private int A3753BarFoaCod ;
   private int W3753BarFoaCod ;
   private java.math.BigDecimal AV22MtrAgr ;
   private java.math.BigDecimal AV21KgmAgr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A3750KgmPeg ;
   private java.math.BigDecimal A3752MtrPeg ;
   private java.math.BigDecimal AV25Mtspeg ;
   private java.math.BigDecimal W3750KgmPeg ;
   private java.math.BigDecimal W3752MtrPeg ;
   private java.math.BigDecimal A3756KgmFoa ;
   private java.math.BigDecimal A3758MtrFoa ;
   private java.math.BigDecimal AV26MtsFoa ;
   private java.math.BigDecimal W3758MtrFoa ;
   private java.math.BigDecimal W3756KgmFoa ;
   private String A396EmprCod ;
   private String AV16BarCodPar ;
   private String AV19BarAgrPar ;
   private String AV23Tipo ;
   private String AV24Accion ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A3744BarPeg ;
   private String A365DisDes ;
   private String W130BarCodPar ;
   private String A3749BarPegPar ;
   private String Gx_emsg ;
   private String W3749BarPegPar ;
   private String A3745BarFoa ;
   private String A3755BarFoaPar ;
   private String W3755BarFoaPar ;
   private boolean returnInSub ;
   private boolean n3750KgmPeg ;
   private boolean n3752MtrPeg ;
   private boolean n3751PiePeg ;
   private boolean n3756KgmFoa ;
   private boolean n3758MtrFoa ;
   private boolean n3757PieFoa ;
   private String[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private short[] aP9 ;
   private String[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P012S3_A396EmprCod ;
   private String[] P012S3_A130BarCodPar ;
   private byte[] P012S3_A132BarCodReo ;
   private int[] P012S3_A129BarCod ;
   private String[] P012S3_A3744BarPeg ;
   private java.math.BigDecimal[] P012S3_A166BarKgm ;
   private java.math.BigDecimal[] P012S3_A184BarMtr ;
   private short[] P012S3_A199BarPie1 ;
   private String[] P012S3_A365DisDes ;
   private int[] P012S3_A898BarPieNDes ;
   private String[] P012S6_A396EmprCod ;
   private String[] P012S6_A130BarCodPar ;
   private byte[] P012S6_A132BarCodReo ;
   private int[] P012S6_A129BarCod ;
   private String[] P012S6_A3744BarPeg ;
   private String[] P012S8_A396EmprCod ;
   private java.math.BigDecimal[] P012S8_A3752MtrPeg ;
   private boolean[] P012S8_n3752MtrPeg ;
   private short[] P012S8_A3751PiePeg ;
   private boolean[] P012S8_n3751PiePeg ;
   private java.math.BigDecimal[] P012S8_A3750KgmPeg ;
   private boolean[] P012S8_n3750KgmPeg ;
   private String[] P012S8_A3749BarPegPar ;
   private byte[] P012S8_A3748BarPegReo ;
   private int[] P012S8_A3747BarPegCod ;
   private String[] P012S8_A130BarCodPar ;
   private byte[] P012S8_A132BarCodReo ;
   private int[] P012S8_A129BarCod ;
   private String[] P012S13_A396EmprCod ;
   private String[] P012S13_A130BarCodPar ;
   private byte[] P012S13_A132BarCodReo ;
   private int[] P012S13_A129BarCod ;
   private String[] P012S13_A3745BarFoa ;
   private java.math.BigDecimal[] P012S13_A166BarKgm ;
   private java.math.BigDecimal[] P012S13_A184BarMtr ;
   private short[] P012S13_A199BarPie1 ;
   private String[] P012S13_A365DisDes ;
   private int[] P012S13_A898BarPieNDes ;
   private String[] P012S16_A396EmprCod ;
   private String[] P012S16_A130BarCodPar ;
   private byte[] P012S16_A132BarCodReo ;
   private int[] P012S16_A129BarCod ;
   private String[] P012S16_A3745BarFoa ;
   private String[] P012S18_A396EmprCod ;
   private java.math.BigDecimal[] P012S18_A3758MtrFoa ;
   private boolean[] P012S18_n3758MtrFoa ;
   private String[] P012S18_A130BarCodPar ;
   private byte[] P012S18_A132BarCodReo ;
   private int[] P012S18_A129BarCod ;
   private short[] P012S18_A3757PieFoa ;
   private boolean[] P012S18_n3757PieFoa ;
   private java.math.BigDecimal[] P012S18_A3756KgmFoa ;
   private boolean[] P012S18_n3756KgmFoa ;
   private String[] P012S18_A3755BarFoaPar ;
   private byte[] P012S18_A3754BarFoaReo ;
   private int[] P012S18_A3753BarFoaCod ;
   private String[] P012S22_A396EmprCod ;
   private String[] P012S22_A130BarCodPar ;
   private byte[] P012S22_A132BarCodReo ;
   private int[] P012S22_A129BarCod ;
   private int[] P012S22_A3747BarPegCod ;
   private byte[] P012S22_A3748BarPegReo ;
   private String[] P012S22_A3749BarPegPar ;
   private String[] P012S23_A3744BarPeg ;
   private String[] P012S27_A396EmprCod ;
   private String[] P012S27_A130BarCodPar ;
   private byte[] P012S27_A132BarCodReo ;
   private int[] P012S27_A129BarCod ;
   private int[] P012S27_A3753BarFoaCod ;
   private byte[] P012S27_A3754BarFoaReo ;
   private String[] P012S27_A3755BarFoaPar ;
   private String[] P012S28_A3745BarFoa ;
   private String[] P012S32_A396EmprCod ;
   private String[] P012S32_A130BarCodPar ;
   private byte[] P012S32_A132BarCodReo ;
   private int[] P012S32_A129BarCod ;
   private int[] P012S32_A3747BarPegCod ;
   private byte[] P012S32_A3748BarPegReo ;
   private String[] P012S32_A3749BarPegPar ;
   private String[] P012S34_A396EmprCod ;
   private String[] P012S34_A130BarCodPar ;
   private byte[] P012S34_A132BarCodReo ;
   private int[] P012S34_A129BarCod ;
   private byte[] P012S34_A213BarSit ;
   private String[] P012S34_A3744BarPeg ;
   private String[] P012S36_A396EmprCod ;
   private String[] P012S36_A130BarCodPar ;
   private byte[] P012S36_A132BarCodReo ;
   private int[] P012S36_A129BarCod ;
   private int[] P012S36_A3753BarFoaCod ;
   private byte[] P012S36_A3754BarFoaReo ;
   private String[] P012S36_A3755BarFoaPar ;
   private String[] P012S38_A396EmprCod ;
   private String[] P012S38_A130BarCodPar ;
   private byte[] P012S38_A132BarCodReo ;
   private int[] P012S38_A129BarCod ;
   private byte[] P012S38_A213BarSit ;
   private String[] P012S38_A3745BarFoa ;
}

final  class ppegfoa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P012S3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarPeg, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P012S4", "INSERT INTO TXPBARPEG(EmprCod, BarCod, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar, KgmPeg, PiePeg, MtrPeg) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPEG")
         ,new UpdateCursor("P012S5", "UPDATE TXPBARCAD SET BarPeg=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P012S6", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarPeg FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P012S7", "UPDATE TXPBARCAD SET BarPeg=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P012S8", "SELECT EmprCod, MtrPeg, PiePeg, KgmPeg, BarPegPar, BarPegReo, BarPegCod, BarCodPar, BarCodReo, BarCod FROM TXPBARPEG WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P012S9", "INSERT INTO TXPBARPEG(EmprCod, BarCod, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar, KgmPeg, PiePeg, MtrPeg) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPEG")
         ,new UpdateCursor("P012S10", "UPDATE TXPBARPEG SET PiePeg=?, MtrPeg=?, KgmPeg=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPegCod = ? and BarPegReo = ? and BarPegPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPEG")
         ,new UpdateCursor("P012S11", "INSERT INTO TXPBARPEG(EmprCod, BarCod, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar, KgmPeg, PiePeg, MtrPeg) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPEG")
         ,new ForEachCursor("P012S13", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarFoa, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P012S14", "INSERT INTO TXPBARFOA(EmprCod, BarCod, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar, KgmFoa, PieFoa, MtrFoa) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFOA")
         ,new UpdateCursor("P012S15", "UPDATE TXPBARCAD SET BarFoa=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P012S16", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarFoa FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P012S17", "UPDATE TXPBARCAD SET BarFoa=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P012S18", "SELECT EmprCod, MtrFoa, BarCodPar, BarCodReo, BarCod, PieFoa, KgmFoa, BarFoaPar, BarFoaReo, BarFoaCod FROM TXPBARFOA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P012S19", "INSERT INTO TXPBARFOA(EmprCod, BarCod, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar, KgmFoa, PieFoa, MtrFoa) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFOA")
         ,new UpdateCursor("P012S20", "INSERT INTO TXPBARFOA(EmprCod, BarCod, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar, KgmFoa, PieFoa, MtrFoa) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFOA")
         ,new UpdateCursor("P012S21", "UPDATE TXPBARFOA SET PieFoa=?, MtrFoa=?, KgmFoa=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarFoaCod = ? and BarFoaReo = ? and BarFoaPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFOA")
         ,new ForEachCursor("P012S22", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P012S23", "SELECT BarPeg FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P012S24", "DELETE FROM TXPBARPEG  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPegCod = ? AND BarPegReo = ? AND BarPegPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPEG")
         ,new UpdateCursor("P012S25", "UPDATE TXPBARCAD SET BarPeg=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P012S26", "DELETE FROM TXPBARPEG  WHERE EmprCod = ? and BarPegCod = ? and BarPegReo = ? and BarPegPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPEG")
         ,new ForEachCursor("P012S27", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P012S28", "SELECT BarFoa FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P012S29", "DELETE FROM TXPBARFOA  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarFoaCod = ? AND BarFoaReo = ? AND BarFoaPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFOA")
         ,new UpdateCursor("P012S30", "UPDATE TXPBARCAD SET BarFoa=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P012S31", "DELETE FROM TXPBARFOA  WHERE EmprCod = ? and BarFoaCod = ? and BarFoaReo = ? and BarFoaPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFOA")
         ,new ForEachCursor("P012S32", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P012S33", "DELETE FROM TXPBARPEG  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPegCod = ? AND BarPegReo = ? AND BarPegPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPEG")
         ,new ForEachCursor("P012S34", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSit, BarPeg FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P012S35", "UPDATE TXPBARCAD SET BarPeg=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P012S36", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P012S37", "DELETE FROM TXPBARFOA  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarFoaCod = ? AND BarFoaReo = ? AND BarFoaPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFOA")
         ,new ForEachCursor("P012S38", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSit, BarFoa FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P012S39", "UPDATE TXPBARCAD SET BarFoa=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 1);
               stmt.setInt(8, ((Number) parms[10]).intValue());
               stmt.setByte(9, ((Number) parms[11]).byteValue());
               stmt.setString(10, (String)parms[12], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 1);
               stmt.setInt(8, ((Number) parms[10]).intValue());
               stmt.setByte(9, ((Number) parms[11]).byteValue());
               stmt.setString(10, (String)parms[12], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

