package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppddg01 extends GXProcedure
{
   public ppddg01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppddg01.class ), "" );
   }

   public ppddg01( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 )
   {
      ppddg01.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 )
   {
      ppddg01.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      ppddg01.this.AV39PedDGId = aP1[0];
      this.aP1 = aP1;
      ppddg01.this.AV17ArtCod = aP2[0];
      this.aP2 = aP2;
      ppddg01.this.AV18CliCod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "PDDG01", "") );
      GXt_int1 = AV28ParArt ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PARART", ""), GXv_int2) ;
      ppddg01.this.GXt_int1 = GXv_int2[0] ;
      AV28ParArt = GXt_int1 ;
      GXt_int1 = AV31Parfss ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PARFSS", ""), GXv_int2) ;
      ppddg01.this.GXt_int1 = GXv_int2[0] ;
      AV31Parfss = GXt_int1 ;
      GXt_int3 = AV32Valor ;
      GXv_char4[0] = AV15EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "PARFSS", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      ppddg01.this.AV15EmprCod = GXv_char4[0] ;
      ppddg01.this.GXt_int3 = GXv_int6[0] ;
      AV32Valor = (byte)(GXt_int3) ;
      GXt_int1 = AV38PqfdesdeFases ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PQFRFS", ""), GXv_int2) ;
      ppddg01.this.GXt_int1 = GXv_int2[0] ;
      AV38PqfdesdeFases = GXt_int1 ;
      /* Using cursor P05OZ2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV18CliCod), AV17ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A775ProUltLin = P05OZ2_A775ProUltLin[0] ;
         A252CliCod = P05OZ2_A252CliCod[0] ;
         A65ArtCod = P05OZ2_A65ArtCod[0] ;
         A396EmprCod = P05OZ2_A396EmprCod[0] ;
         A758ProCod = P05OZ2_A758ProCod[0] ;
         A775ProUltLin = P05OZ2_A775ProUltLin[0] ;
         W396EmprCod = A396EmprCod ;
         AV19ProCod = A758ProCod ;
         /*
            INSERT RECORD ON TABLE TXPPEDDG4

         */
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         A396EmprCod = AV15EmprCod ;
         A13026PedDGId = AV39PedDGId ;
         A758ProCod = AV19ProCod ;
         A13044PedDGUltFa = A775ProUltLin ;
         /* Using cursor P05OZ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13044PedDGUltFa)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG4");
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
         A396EmprCod = W396EmprCod ;
         A758ProCod = W758ProCod ;
         /* End Insert */
         AV26Disquilin = (short)(1) ;
         AV35Act_nrq = (byte)(0) ;
         /* Using cursor P05OZ4 */
         pr_default.execute(2, new Object[] {AV15EmprCod, AV19ProCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A774ProNumLin = P05OZ4_A774ProNumLin[0] ;
            A758ProCod = P05OZ4_A758ProCod[0] ;
            A396EmprCod = P05OZ4_A396EmprCod[0] ;
            A457FasCod = P05OZ4_A457FasCod[0] ;
            n457FasCod = P05OZ4_n457FasCod[0] ;
            A602MaqCod = P05OZ4_A602MaqCod[0] ;
            n602MaqCod = P05OZ4_n602MaqCod[0] ;
            A602MaqCod = P05OZ4_A602MaqCod[0] ;
            n602MaqCod = P05OZ4_n602MaqCod[0] ;
            W396EmprCod = A396EmprCod ;
            W758ProCod = A758ProCod ;
            AV22FasCod = A457FasCod ;
            AV30ProNumLin = A774ProNumLin ;
            AV36Maqcod = A602MaqCod ;
            /* Execute user subroutine: 'ARTFOR' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV34Num_rq > 1 )
            {
               AV35Act_nrq = (byte)(1) ;
            }
            /*
               INSERT RECORD ON TABLE TXPPEDDG5

            */
            W396EmprCod = A396EmprCod ;
            W758ProCod = A758ProCod ;
            W457FasCod = A457FasCod ;
            n457FasCod = false ;
            A396EmprCod = AV15EmprCod ;
            A13026PedDGId = AV39PedDGId ;
            A758ProCod = AV19ProCod ;
            A13045PedDGFasLi = A774ProNumLin ;
            A457FasCod = AV22FasCod ;
            n457FasCod = false ;
            A13051PedDGObFas = " " ;
            n13051PedDGObFas = false ;
            /* Using cursor P05OZ5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi), Boolean.valueOf(n457FasCod), A457FasCod, Boolean.valueOf(n13051PedDGObFas), A13051PedDGObFas});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG5");
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
            A396EmprCod = W396EmprCod ;
            A758ProCod = W758ProCod ;
            A457FasCod = W457FasCod ;
            n457FasCod = false ;
            /* End Insert */
            if ( AV28ParArt == 0 )
            {
               if ( ( AV31Parfss == 1 ) && ( AV32Valor == 1 ) )
               {
               }
               else
               {
                  /* Using cursor P05OZ6 */
                  pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV18CliCod), AV17ArtCod, AV19ProCod, AV22FasCod});
                  while ( (pr_default.getStatus(4) != 101) )
                  {
                     A1668ParFasVal = P05OZ6_A1668ParFasVal[0] ;
                     A1673ParFasObs = P05OZ6_A1673ParFasObs[0] ;
                     A1664ParFasCod = P05OZ6_A1664ParFasCod[0] ;
                     A457FasCod = P05OZ6_A457FasCod[0] ;
                     n457FasCod = P05OZ6_n457FasCod[0] ;
                     A758ProCod = P05OZ6_A758ProCod[0] ;
                     A65ArtCod = P05OZ6_A65ArtCod[0] ;
                     A252CliCod = P05OZ6_A252CliCod[0] ;
                     W396EmprCod = A396EmprCod ;
                     W758ProCod = A758ProCod ;
                     /*
                        INSERT RECORD ON TABLE TXPPEDDG8

                     */
                     W396EmprCod = A396EmprCod ;
                     W758ProCod = A758ProCod ;
                     W1664ParFasCod = A1664ParFasCod ;
                     A396EmprCod = AV15EmprCod ;
                     A13026PedDGId = AV39PedDGId ;
                     A758ProCod = AV19ProCod ;
                     A13045PedDGFasLi = AV30ProNumLin ;
                     A13058PedDGParVa = A1668ParFasVal ;
                     n13058PedDGParVa = false ;
                     A13059PedDGParOb = A1673ParFasObs ;
                     n13059PedDGParOb = false ;
                     /* Using cursor P05OZ7 */
                     pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi), Short.valueOf(A1664ParFasCod), Boolean.valueOf(n13058PedDGParVa), A13058PedDGParVa, Boolean.valueOf(n13059PedDGParOb), A13059PedDGParOb});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG8");
                     if ( (pr_default.getStatus(5) == 1) )
                     {
                        Gx_err = (short)(1) ;
                        Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                     }
                     else
                     {
                        Gx_err = (short)(0) ;
                        Gx_emsg = "" ;
                     }
                     A396EmprCod = W396EmprCod ;
                     A758ProCod = W758ProCod ;
                     A1664ParFasCod = W1664ParFasCod ;
                     /* End Insert */
                     A396EmprCod = W396EmprCod ;
                     A758ProCod = W758ProCod ;
                     pr_default.readNext(4);
                  }
                  pr_default.close(4);
               }
            }
            else
            {
               /* Using cursor P05OZ8 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A6986NumLinPro = P05OZ8_A6986NumLinPro[0] ;
                  A6989ParFasValp = P05OZ8_A6989ParFasValp[0] ;
                  n6989ParFasValp = P05OZ8_n6989ParFasValp[0] ;
                  A6990ParFasObsp = P05OZ8_A6990ParFasObsp[0] ;
                  n6990ParFasObsp = P05OZ8_n6990ParFasObsp[0] ;
                  A1664ParFasCod = P05OZ8_A1664ParFasCod[0] ;
                  W396EmprCod = A396EmprCod ;
                  W758ProCod = A758ProCod ;
                  /*
                     INSERT RECORD ON TABLE TXPPEDDG8

                  */
                  W396EmprCod = A396EmprCod ;
                  W758ProCod = A758ProCod ;
                  A396EmprCod = AV15EmprCod ;
                  A13026PedDGId = AV39PedDGId ;
                  A758ProCod = AV19ProCod ;
                  A13045PedDGFasLi = A6986NumLinPro ;
                  A13058PedDGParVa = A6989ParFasValp ;
                  n13058PedDGParVa = false ;
                  A13059PedDGParOb = A6990ParFasObsp ;
                  n13059PedDGParOb = false ;
                  /* Using cursor P05OZ9 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi), Short.valueOf(A1664ParFasCod), Boolean.valueOf(n13058PedDGParVa), A13058PedDGParVa, Boolean.valueOf(n13059PedDGParOb), A13059PedDGParOb});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG8");
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
                  A396EmprCod = W396EmprCod ;
                  A758ProCod = W758ProCod ;
                  /* End Insert */
                  A396EmprCod = W396EmprCod ;
                  A758ProCod = W758ProCod ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
            }
            A396EmprCod = W396EmprCod ;
            A758ProCod = W758ProCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Return PDDG01", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTFOR' Routine */
      returnInSub = false ;
      if ( AV38PqfdesdeFases == 1 )
      {
         AV26Disquilin = (short)(1) ;
         /* Using cursor P05OZ10 */
         pr_default.execute(8, new Object[] {AV15EmprCod, AV22FasCod});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A456FasActTin = P05OZ10_A456FasActTin[0] ;
            n456FasActTin = P05OZ10_n456FasActTin[0] ;
            A4286FasForMul = P05OZ10_A4286FasForMul[0] ;
            n4286FasForMul = P05OZ10_n4286FasForMul[0] ;
            A457FasCod = P05OZ10_A457FasCod[0] ;
            n457FasCod = P05OZ10_n457FasCod[0] ;
            A396EmprCod = P05OZ10_A396EmprCod[0] ;
            A764ProForCod = P05OZ10_A764ProForCod[0] ;
            n764ProForCod = P05OZ10_n764ProForCod[0] ;
            A4650FasForLin = P05OZ10_A4650FasForLin[0] ;
            A456FasActTin = P05OZ10_A456FasActTin[0] ;
            n456FasActTin = P05OZ10_n456FasActTin[0] ;
            A4286FasForMul = P05OZ10_A4286FasForMul[0] ;
            n4286FasForMul = P05OZ10_n4286FasForMul[0] ;
            if ( ( GXutil.strcmp(A4286FasForMul, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) != 0 ) )
            {
               AV27ARTPROCOD = A764ProForCod ;
               /* Execute user subroutine: 'CREODISQUI' */
               S1210 ();
               if ( returnInSub )
               {
                  pr_default.close(8);
                  pr_default.close(8);
                  returnInSub = true;
                  if (true) return;
               }
            }
            pr_default.readNext(8);
         }
         pr_default.close(8);
      }
      else
      {
         AV27ARTPROCOD = " " ;
         AV26Disquilin = (short)(1) ;
         AV34Num_rq = (short)(0) ;
         /* Using cursor P05OZ11 */
         pr_default.execute(9, new Object[] {AV15EmprCod, Integer.valueOf(AV18CliCod), AV17ArtCod, AV19ProCod});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A758ProCod = P05OZ11_A758ProCod[0] ;
            A65ArtCod = P05OZ11_A65ArtCod[0] ;
            A252CliCod = P05OZ11_A252CliCod[0] ;
            A396EmprCod = P05OZ11_A396EmprCod[0] ;
            A4898ArtProCod = P05OZ11_A4898ArtProCod[0] ;
            A457FasCod = P05OZ11_A457FasCod[0] ;
            n457FasCod = P05OZ11_n457FasCod[0] ;
            A456FasActTin = P05OZ11_A456FasActTin[0] ;
            n456FasActTin = P05OZ11_n456FasActTin[0] ;
            A4286FasForMul = P05OZ11_A4286FasForMul[0] ;
            n4286FasForMul = P05OZ11_n4286FasForMul[0] ;
            A4897ArtProLin = P05OZ11_A4897ArtProLin[0] ;
            A456FasActTin = P05OZ11_A456FasActTin[0] ;
            n456FasActTin = P05OZ11_n456FasActTin[0] ;
            A4286FasForMul = P05OZ11_A4286FasForMul[0] ;
            n4286FasForMul = P05OZ11_n4286FasForMul[0] ;
            AV27ARTPROCOD = A4898ArtProCod ;
            if ( GXutil.strcmp(AV22FasCod, A457FasCod) == 0 )
            {
               if ( ( GXutil.strcmp(A4286FasForMul, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) != 0 ) )
               {
                  /* Execute user subroutine: 'CREODISQUI' */
                  S1210 ();
                  if ( returnInSub )
                  {
                     pr_default.close(9);
                     pr_default.close(9);
                     returnInSub = true;
                     if (true) return;
                  }
                  AV34Num_rq = (short)(AV34Num_rq+1) ;
               }
            }
            pr_default.readNext(9);
         }
         pr_default.close(9);
      }
   }

   public void S1210( )
   {
      /* 'CREODISQUI' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPPEDDG7

      */
      A396EmprCod = AV15EmprCod ;
      A13026PedDGId = AV39PedDGId ;
      A758ProCod = AV19ProCod ;
      A13045PedDGFasLi = AV30ProNumLin ;
      A13057PedDGPQLin = AV26Disquilin ;
      A764ProForCod = AV27ARTPROCOD ;
      n764ProForCod = false ;
      /* Using cursor P05OZ12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi), Short.valueOf(A13057PedDGPQLin), Boolean.valueOf(n764ProForCod), A764ProForCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG7");
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
      /* End Insert */
      AV26Disquilin = (short)(AV26Disquilin+1) ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppddg01.this.AV15EmprCod;
      this.aP1[0] = ppddg01.this.AV39PedDGId;
      this.aP2[0] = ppddg01.this.AV17ArtCod;
      this.aP3[0] = ppddg01.this.AV18CliCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppddg01");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P05OZ2_A775ProUltLin = new short[1] ;
      P05OZ2_A252CliCod = new int[1] ;
      P05OZ2_A65ArtCod = new String[] {""} ;
      P05OZ2_A396EmprCod = new String[] {""} ;
      P05OZ2_A758ProCod = new String[] {""} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      W396EmprCod = "" ;
      AV19ProCod = "" ;
      W758ProCod = "" ;
      Gx_emsg = "" ;
      P05OZ4_A774ProNumLin = new short[1] ;
      P05OZ4_A758ProCod = new String[] {""} ;
      P05OZ4_A396EmprCod = new String[] {""} ;
      P05OZ4_A457FasCod = new String[] {""} ;
      P05OZ4_n457FasCod = new boolean[] {false} ;
      P05OZ4_A602MaqCod = new String[] {""} ;
      P05OZ4_n602MaqCod = new boolean[] {false} ;
      A457FasCod = "" ;
      A602MaqCod = "" ;
      AV22FasCod = "" ;
      AV36Maqcod = "" ;
      W457FasCod = "" ;
      A13051PedDGObFas = "" ;
      P05OZ6_A396EmprCod = new String[] {""} ;
      P05OZ6_A1668ParFasVal = new String[] {""} ;
      P05OZ6_A1673ParFasObs = new String[] {""} ;
      P05OZ6_A1664ParFasCod = new short[1] ;
      P05OZ6_A457FasCod = new String[] {""} ;
      P05OZ6_n457FasCod = new boolean[] {false} ;
      P05OZ6_A758ProCod = new String[] {""} ;
      P05OZ6_A65ArtCod = new String[] {""} ;
      P05OZ6_A252CliCod = new int[1] ;
      A1668ParFasVal = "" ;
      A1673ParFasObs = "" ;
      A13058PedDGParVa = "" ;
      A13059PedDGParOb = "" ;
      P05OZ8_A396EmprCod = new String[] {""} ;
      P05OZ8_A252CliCod = new int[1] ;
      P05OZ8_A65ArtCod = new String[] {""} ;
      P05OZ8_A758ProCod = new String[] {""} ;
      P05OZ8_A6986NumLinPro = new short[1] ;
      P05OZ8_A6989ParFasValp = new String[] {""} ;
      P05OZ8_n6989ParFasValp = new boolean[] {false} ;
      P05OZ8_A6990ParFasObsp = new String[] {""} ;
      P05OZ8_n6990ParFasObsp = new boolean[] {false} ;
      P05OZ8_A1664ParFasCod = new short[1] ;
      A6989ParFasValp = "" ;
      A6990ParFasObsp = "" ;
      P05OZ10_A456FasActTin = new String[] {""} ;
      P05OZ10_n456FasActTin = new boolean[] {false} ;
      P05OZ10_A4286FasForMul = new String[] {""} ;
      P05OZ10_n4286FasForMul = new boolean[] {false} ;
      P05OZ10_A457FasCod = new String[] {""} ;
      P05OZ10_n457FasCod = new boolean[] {false} ;
      P05OZ10_A396EmprCod = new String[] {""} ;
      P05OZ10_A764ProForCod = new String[] {""} ;
      P05OZ10_n764ProForCod = new boolean[] {false} ;
      P05OZ10_A4650FasForLin = new short[1] ;
      A456FasActTin = "" ;
      A4286FasForMul = "" ;
      A764ProForCod = "" ;
      AV27ARTPROCOD = "" ;
      P05OZ11_A758ProCod = new String[] {""} ;
      P05OZ11_A65ArtCod = new String[] {""} ;
      P05OZ11_A252CliCod = new int[1] ;
      P05OZ11_A396EmprCod = new String[] {""} ;
      P05OZ11_A4898ArtProCod = new String[] {""} ;
      P05OZ11_A457FasCod = new String[] {""} ;
      P05OZ11_n457FasCod = new boolean[] {false} ;
      P05OZ11_A456FasActTin = new String[] {""} ;
      P05OZ11_n456FasActTin = new boolean[] {false} ;
      P05OZ11_A4286FasForMul = new String[] {""} ;
      P05OZ11_n4286FasForMul = new boolean[] {false} ;
      P05OZ11_A4897ArtProLin = new short[1] ;
      A4898ArtProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppddg01__default(),
         new Object[] {
             new Object[] {
            P05OZ2_A775ProUltLin, P05OZ2_A252CliCod, P05OZ2_A65ArtCod, P05OZ2_A396EmprCod, P05OZ2_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05OZ4_A774ProNumLin, P05OZ4_A758ProCod, P05OZ4_A396EmprCod, P05OZ4_A457FasCod, P05OZ4_A602MaqCod, P05OZ4_n602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05OZ6_A396EmprCod, P05OZ6_A1668ParFasVal, P05OZ6_A1673ParFasObs, P05OZ6_A1664ParFasCod, P05OZ6_A457FasCod, P05OZ6_A758ProCod, P05OZ6_A65ArtCod, P05OZ6_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05OZ8_A396EmprCod, P05OZ8_A252CliCod, P05OZ8_A65ArtCod, P05OZ8_A758ProCod, P05OZ8_A6986NumLinPro, P05OZ8_A6989ParFasValp, P05OZ8_n6989ParFasValp, P05OZ8_A6990ParFasObsp, P05OZ8_n6990ParFasObsp, P05OZ8_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05OZ10_A456FasActTin, P05OZ10_n456FasActTin, P05OZ10_A4286FasForMul, P05OZ10_n4286FasForMul, P05OZ10_A457FasCod, P05OZ10_A396EmprCod, P05OZ10_A764ProForCod, P05OZ10_A4650FasForLin
            }
            , new Object[] {
            P05OZ11_A758ProCod, P05OZ11_A65ArtCod, P05OZ11_A252CliCod, P05OZ11_A396EmprCod, P05OZ11_A4898ArtProCod, P05OZ11_A457FasCod, P05OZ11_A456FasActTin, P05OZ11_n456FasActTin, P05OZ11_A4286FasForMul, P05OZ11_n4286FasForMul,
            P05OZ11_A4897ArtProLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV28ParArt ;
   private byte AV31Parfss ;
   private byte AV32Valor ;
   private byte AV38PqfdesdeFases ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV35Act_nrq ;
   private short A775ProUltLin ;
   private short A13044PedDGUltFa ;
   private short Gx_err ;
   private short AV26Disquilin ;
   private short A774ProNumLin ;
   private short AV30ProNumLin ;
   private short AV34Num_rq ;
   private short A13045PedDGFasLi ;
   private short A1664ParFasCod ;
   private short W1664ParFasCod ;
   private short A6986NumLinPro ;
   private short A4650FasForLin ;
   private short A4897ArtProLin ;
   private short A13057PedDGPQLin ;
   private int AV39PedDGId ;
   private int AV18CliCod ;
   private int GXt_int3 ;
   private int GXv_int6[] ;
   private int A252CliCod ;
   private int GX_INS1785 ;
   private int A13026PedDGId ;
   private int GX_INS1786 ;
   private int GX_INS1789 ;
   private int GX_INS1788 ;
   private String AV15EmprCod ;
   private String AV17ArtCod ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String W396EmprCod ;
   private String AV19ProCod ;
   private String W758ProCod ;
   private String Gx_emsg ;
   private String A457FasCod ;
   private String A602MaqCod ;
   private String AV22FasCod ;
   private String AV36Maqcod ;
   private String W457FasCod ;
   private String A1668ParFasVal ;
   private String A1673ParFasObs ;
   private String A13058PedDGParVa ;
   private String A13059PedDGParOb ;
   private String A6989ParFasValp ;
   private String A6990ParFasObsp ;
   private String A456FasActTin ;
   private String A4286FasForMul ;
   private String A764ProForCod ;
   private String AV27ARTPROCOD ;
   private String A4898ArtProCod ;
   private boolean n457FasCod ;
   private boolean n602MaqCod ;
   private boolean returnInSub ;
   private boolean n13051PedDGObFas ;
   private boolean n13058PedDGParVa ;
   private boolean n13059PedDGParOb ;
   private boolean n6989ParFasValp ;
   private boolean n6990ParFasObsp ;
   private boolean n456FasActTin ;
   private boolean n4286FasForMul ;
   private boolean n764ProForCod ;
   private String A13051PedDGObFas ;
   private int[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P05OZ2_A775ProUltLin ;
   private int[] P05OZ2_A252CliCod ;
   private String[] P05OZ2_A65ArtCod ;
   private String[] P05OZ2_A396EmprCod ;
   private String[] P05OZ2_A758ProCod ;
   private short[] P05OZ4_A774ProNumLin ;
   private String[] P05OZ4_A758ProCod ;
   private String[] P05OZ4_A396EmprCod ;
   private String[] P05OZ4_A457FasCod ;
   private boolean[] P05OZ4_n457FasCod ;
   private String[] P05OZ4_A602MaqCod ;
   private boolean[] P05OZ4_n602MaqCod ;
   private String[] P05OZ6_A396EmprCod ;
   private String[] P05OZ6_A1668ParFasVal ;
   private String[] P05OZ6_A1673ParFasObs ;
   private short[] P05OZ6_A1664ParFasCod ;
   private String[] P05OZ6_A457FasCod ;
   private boolean[] P05OZ6_n457FasCod ;
   private String[] P05OZ6_A758ProCod ;
   private String[] P05OZ6_A65ArtCod ;
   private int[] P05OZ6_A252CliCod ;
   private String[] P05OZ8_A396EmprCod ;
   private int[] P05OZ8_A252CliCod ;
   private String[] P05OZ8_A65ArtCod ;
   private String[] P05OZ8_A758ProCod ;
   private short[] P05OZ8_A6986NumLinPro ;
   private String[] P05OZ8_A6989ParFasValp ;
   private boolean[] P05OZ8_n6989ParFasValp ;
   private String[] P05OZ8_A6990ParFasObsp ;
   private boolean[] P05OZ8_n6990ParFasObsp ;
   private short[] P05OZ8_A1664ParFasCod ;
   private String[] P05OZ10_A456FasActTin ;
   private boolean[] P05OZ10_n456FasActTin ;
   private String[] P05OZ10_A4286FasForMul ;
   private boolean[] P05OZ10_n4286FasForMul ;
   private String[] P05OZ10_A457FasCod ;
   private boolean[] P05OZ10_n457FasCod ;
   private String[] P05OZ10_A396EmprCod ;
   private String[] P05OZ10_A764ProForCod ;
   private boolean[] P05OZ10_n764ProForCod ;
   private short[] P05OZ10_A4650FasForLin ;
   private String[] P05OZ11_A758ProCod ;
   private String[] P05OZ11_A65ArtCod ;
   private int[] P05OZ11_A252CliCod ;
   private String[] P05OZ11_A396EmprCod ;
   private String[] P05OZ11_A4898ArtProCod ;
   private String[] P05OZ11_A457FasCod ;
   private boolean[] P05OZ11_n457FasCod ;
   private String[] P05OZ11_A456FasActTin ;
   private boolean[] P05OZ11_n456FasActTin ;
   private String[] P05OZ11_A4286FasForMul ;
   private boolean[] P05OZ11_n4286FasForMul ;
   private short[] P05OZ11_A4897ArtProLin ;
}

final  class ppddg01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05OZ2", "SELECT T2.ProUltLin, T1.CliCod, T1.ArtCod, T1.EmprCod, T1.ProCod FROM (TXPARTLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05OZ3", "INSERT INTO TXPPEDDG4(EmprCod, PedDGId, ProCod, PedDGUltFa) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPEDDG4")
         ,new ForEachCursor("P05OZ4", "SELECT T1.ProNumLin, T1.ProCod, T1.EmprCod, T1.FasCod, T2.MaqCod FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05OZ5", "INSERT INTO TXPPEDDG5(EmprCod, PedDGId, ProCod, PedDGFasLi, FasCod, PedDGObFas, PedDGPQUlt) VALUES(?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPEDDG5")
         ,new ForEachCursor("P05OZ6", "SELECT EmprCod, ParFasVal, ParFasObs, ParFasCod, FasCod, ProCod, ArtCod, CliCod FROM TXPSERPAR WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05OZ7", "INSERT INTO TXPPEDDG8(EmprCod, PedDGId, ProCod, PedDGFasLi, ParFasCod, PedDGParVa, PedDGParOb, PedDGParTx) VALUES(?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPEDDG8")
         ,new ForEachCursor("P05OZ8", "SELECT EmprCod, CliCod, ArtCod, ProCod, NumLinPro, ParFasValp, ParFasObsp, ParFasCod FROM TXPPARAR1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, NumLinPro, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05OZ9", "INSERT INTO TXPPEDDG8(EmprCod, PedDGId, ProCod, PedDGFasLi, ParFasCod, PedDGParVa, PedDGParOb, PedDGParTx) VALUES(?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPEDDG8")
         ,new ForEachCursor("P05OZ10", "SELECT T2.FasActTin, T2.FasForMul, T1.FasCod, T1.EmprCod, T1.ProForCod, T1.FasForLin FROM (TXPFASPR1 T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.FasCod, T1.FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05OZ11", "SELECT T1.ProCod, T1.ArtCod, T1.CliCod, T1.EmprCod, T1.ArtProCod, T1.FasCod, T2.FasActTin, T2.FasForMul, T1.ArtProLin FROM (TXPArtFor T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05OZ12", "INSERT INTO TXPPEDDG7(EmprCod, PedDGId, ProCod, PedDGFasLi, PedDGPQLin, ProForCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPEDDG7")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 3000);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 60);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 60);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 6);
               }
               return;
      }
   }

}

