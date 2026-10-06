package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnuefas extends GXProcedure
{
   public pnuefas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnuefas.class ), "" );
   }

   public pnuefas( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pnuefas.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pnuefas.this.AV16EmprCod = aP0[0];
      this.aP0 = aP0;
      pnuefas.this.AV17BarCod = aP1[0];
      this.aP1 = aP1;
      pnuefas.this.AV18BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnuefas.this.AV19BarCodPar = aP3[0];
      this.aP3 = aP3;
      pnuefas.this.AV15ProCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV24FlagLav ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV16EmprCod, httpContext.getMessage( "LAVAND", ""), GXv_int2) ;
      pnuefas.this.GXt_int1 = GXv_int2[0] ;
      AV24FlagLav = GXt_int1 ;
      GXt_int1 = AV27Induyco ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV16EmprCod, httpContext.getMessage( "INDUYC", ""), GXv_int2) ;
      pnuefas.this.GXt_int1 = GXv_int2[0] ;
      AV27Induyco = GXt_int1 ;
      GXv_int2[0] = AV23JBP ;
      new app.pexicon(remoteHandle, context).execute( AV16EmprCod, httpContext.getMessage( "JBP", ""), GXv_int2) ;
      pnuefas.this.AV23JBP = GXv_int2[0] ;
      GXt_int1 = AV32Torient ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV16EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int2) ;
      pnuefas.this.GXt_int1 = GXv_int2[0] ;
      AV32Torient = GXt_int1 ;
      GXt_int1 = AV33Etm ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV16EmprCod, httpContext.getMessage( "ETM", ""), GXv_int2) ;
      pnuefas.this.GXt_int1 = GXv_int2[0] ;
      AV33Etm = GXt_int1 ;
      System.out.println( httpContext.getMessage( "Estamos en PNUEFAS...", "") );
      /* Using cursor P000S3 */
      pr_default.execute(0, new Object[] {AV16EmprCod, Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarCodReo), AV19BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P000S3_A130BarCodPar[0] ;
         A132BarCodReo = P000S3_A132BarCodReo[0] ;
         A129BarCod = P000S3_A129BarCod[0] ;
         A396EmprCod = P000S3_A396EmprCod[0] ;
         A252CliCod = P000S3_A252CliCod[0] ;
         n252CliCod = P000S3_n252CliCod[0] ;
         A212BarSer = P000S3_A212BarSer[0] ;
         A628MaxOrdFas = P000S3_A628MaxOrdFas[0] ;
         n628MaxOrdFas = P000S3_n628MaxOrdFas[0] ;
         A628MaxOrdFas = P000S3_A628MaxOrdFas[0] ;
         n628MaxOrdFas = P000S3_n628MaxOrdFas[0] ;
         AV20UltLin = A628MaxOrdFas ;
         AV28Clicod = A252CliCod ;
         AV29Barser = A212BarSer ;
         AV26NPed = GXutil.trim( GXutil.substring( AV25BarNped, 1, 10)) ;
         if ( (GXutil.strcmp("", AV26NPed)==0) )
         {
            AV26NPed = "0000000000" ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Creamos registro en BARFAS...F(PROLIN)", "") );
      /* Using cursor P000S4 */
      pr_default.execute(1, new Object[] {AV16EmprCod, AV15ProCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A602MaqCod = P000S4_A602MaqCod[0] ;
         n602MaqCod = P000S4_n602MaqCod[0] ;
         A456FasActTin = P000S4_A456FasActTin[0] ;
         n456FasActTin = P000S4_n456FasActTin[0] ;
         A458FasCon = P000S4_A458FasCon[0] ;
         n458FasCon = P000S4_n458FasCon[0] ;
         A4286FasForMul = P000S4_A4286FasForMul[0] ;
         n4286FasForMul = P000S4_n4286FasForMul[0] ;
         A4639FasCara = P000S4_A4639FasCara[0] ;
         n4639FasCara = P000S4_n4639FasCara[0] ;
         A4299FasConPla = P000S4_A4299FasConPla[0] ;
         n4299FasConPla = P000S4_n4299FasConPla[0] ;
         A4903FasAcab = P000S4_A4903FasAcab[0] ;
         n4903FasAcab = P000S4_n4903FasAcab[0] ;
         A5368FasGral = P000S4_A5368FasGral[0] ;
         n5368FasGral = P000S4_n5368FasGral[0] ;
         A758ProCod = P000S4_A758ProCod[0] ;
         A396EmprCod = P000S4_A396EmprCod[0] ;
         A457FasCod = P000S4_A457FasCod[0] ;
         A774ProNumLin = P000S4_A774ProNumLin[0] ;
         A602MaqCod = P000S4_A602MaqCod[0] ;
         n602MaqCod = P000S4_n602MaqCod[0] ;
         A456FasActTin = P000S4_A456FasActTin[0] ;
         n456FasActTin = P000S4_n456FasActTin[0] ;
         A458FasCon = P000S4_A458FasCon[0] ;
         n458FasCon = P000S4_n458FasCon[0] ;
         A4286FasForMul = P000S4_A4286FasForMul[0] ;
         n4286FasForMul = P000S4_n4286FasForMul[0] ;
         A4639FasCara = P000S4_A4639FasCara[0] ;
         n4639FasCara = P000S4_n4639FasCara[0] ;
         A4299FasConPla = P000S4_A4299FasConPla[0] ;
         n4299FasConPla = P000S4_n4299FasConPla[0] ;
         A4903FasAcab = P000S4_A4903FasAcab[0] ;
         n4903FasAcab = P000S4_n4903FasAcab[0] ;
         A5368FasGral = P000S4_A5368FasGral[0] ;
         n5368FasGral = P000S4_n5368FasGral[0] ;
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         AV20UltLin = (short)(AV20UltLin+100) ;
         AV21FasCod = A457FasCod ;
         AV22ProNumLin = A774ProNumLin ;
         /*
            INSERT RECORD ON TABLE TXPBARFAS

         */
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         W457FasCod = A457FasCod ;
         A396EmprCod = AV16EmprCod ;
         A129BarCod = AV17BarCod ;
         A132BarCodReo = AV18BarCodReo ;
         A130BarCodPar = AV19BarCodPar ;
         A758ProCod = AV15ProCod ;
         A194BarOrdLin = AV20UltLin ;
         A457FasCod = AV21FasCod ;
         A603MaqCodBis = A602MaqCod ;
         A150BarFacTin = A456FasActTin ;
         A152BarFasCon = A458FasCon ;
         A4287BarFasFor = A4286FasForMul ;
         A4637BarFasCara = A4639FasCara ;
         A4301BarFasCoP = A4299FasConPla ;
         A4905BarFasAcab = A4903FasAcab ;
         A4638BarUltNlot = 0 ;
         n4638BarUltNlot = false ;
         A4021BarFasBot = GXutil.space( (short)(1)) ;
         A4022BarNumBot = 0 ;
         A5369BarFasGral = A5368FasGral ;
         n5369BarFasGral = false ;
         A5047BarFasFPl = GXutil.nullDate() ;
         n5047BarFasFPl = false ;
         A5048BarFasUsu = GXutil.space( (short)(8)) ;
         n5048BarFasUsu = false ;
         if ( AV27Induyco == 1 )
         {
            A179BarLoc = AV26NPed ;
         }
         else
         {
            A179BarLoc = "" ;
         }
         A3836BarFasPri = (byte)(0) ;
         A5896BarMaqPlan = A602MaqCod ;
         n5896BarMaqPlan = false ;
         A4905BarFasAcab = A4903FasAcab ;
         A6012BarFasTip = ((AV32Torient==1)||(AV33Etm==1) ? httpContext.getMessage( "P", "") : "") ;
         n6012BarFasTip = false ;
         A8938BarfasPri2 = (short)(((AV32Torient==1) ? 800 : ((AV33Etm==1) ? 80 : 0))) ;
         n8938BarfasPri2 = false ;
         /* Using cursor P000S5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A152BarFasCon, A603MaqCodBis, A150BarFacTin, A179BarLoc, A4021BarFasBot, Integer.valueOf(A4022BarNumBot), A4287BarFasFor, A4301BarFasCoP, A4637BarFasCara, Boolean.valueOf(n4638BarUltNlot), Integer.valueOf(A4638BarUltNlot), A4905BarFasAcab, A457FasCod, Boolean.valueOf(n5047BarFasFPl), A5047BarFasFPl, Boolean.valueOf(n5048BarFasUsu), A5048BarFasUsu, Boolean.valueOf(n5369BarFasGral), A5369BarFasGral, Boolean.valueOf(n5896BarMaqPlan), A5896BarMaqPlan, Boolean.valueOf(n6012BarFasTip), A6012BarFasTip, Boolean.valueOf(n8938BarfasPri2), Short.valueOf(A8938BarfasPri2), Byte.valueOf(A3836BarFasPri)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         if ( (pr_default.getStatus(2) == 1) )
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
         /* End Insert */
         /* Execute user subroutine: 'SERPAR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'ARTFOR' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A396EmprCod = W396EmprCod ;
         A758ProCod = W758ProCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      System.out.println( httpContext.getMessage( "Fin Creamos registro en BARFAS...F(PROLIN)", "") );
      System.out.println( httpContext.getMessage( "Actualizamos BARPRO...", "") );
      n761ProFasLin = false ;
      /* Optimized UPDATE. */
      /* Using cursor P000S6 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n761ProFasLin), Short.valueOf(AV22ProNumLin), AV16EmprCod, Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarCodReo), AV19BarCodPar, AV15ProCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
      /* End optimized UPDATE. */
      System.out.println( httpContext.getMessage( "Fin Actualizamos BARPRO...", "") );
      if ( AV24FlagLav == 0 )
      {
         System.out.println( httpContext.getMessage( "Voy a PRENFAS...", "") );
         GXv_char3[0] = AV16EmprCod ;
         GXv_int4[0] = AV17BarCod ;
         GXv_int2[0] = AV18BarCodReo ;
         GXv_char5[0] = AV19BarCodPar ;
         GXv_char6[0] = "        " ;
         GXv_char7[0] = httpContext.getMessage( "INS", "") ;
         new app.prenfas(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_char5, GXv_char6, GXv_char7) ;
         pnuefas.this.AV16EmprCod = GXv_char3[0] ;
         pnuefas.this.AV17BarCod = GXv_int4[0] ;
         pnuefas.this.AV18BarCodReo = GXv_int2[0] ;
         pnuefas.this.AV19BarCodPar = GXv_char5[0] ;
         System.out.println( httpContext.getMessage( "Ok a PRENFAS...", "") );
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SERPAR' Routine */
      returnInSub = false ;
      /* Using cursor P000S7 */
      pr_default.execute(4, new Object[] {AV16EmprCod, Integer.valueOf(AV28Clicod), AV29Barser, AV15ProCod, AV21FasCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A1668ParFasVal = P000S7_A1668ParFasVal[0] ;
         A1673ParFasObs = P000S7_A1673ParFasObs[0] ;
         A12670ParFasVl2 = P000S7_A12670ParFasVl2[0] ;
         A1664ParFasCod = P000S7_A1664ParFasCod[0] ;
         A457FasCod = P000S7_A457FasCod[0] ;
         A758ProCod = P000S7_A758ProCod[0] ;
         A65ArtCod = P000S7_A65ArtCod[0] ;
         A252CliCod = P000S7_A252CliCod[0] ;
         n252CliCod = P000S7_n252CliCod[0] ;
         A396EmprCod = P000S7_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         /*
            INSERT RECORD ON TABLE TXPBarPar

         */
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         W1664ParFasCod = A1664ParFasCod ;
         A396EmprCod = AV16EmprCod ;
         A129BarCod = AV17BarCod ;
         A132BarCodReo = AV18BarCodReo ;
         A130BarCodPar = AV19BarCodPar ;
         A758ProCod = AV15ProCod ;
         A194BarOrdLin = AV20UltLin ;
         A3295BarParVal = A1668ParFasVal ;
         A3296BarParObs = A1673ParFasObs ;
         A3693BarParTxt = " " ;
         n3693BarParTxt = false ;
         A12671BarParVl2 = A12670ParFasVl2 ;
         /* Using cursor P000S8 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A1664ParFasCod), A3295BarParVal, A3296BarParObs, Boolean.valueOf(n3693BarParTxt), A3693BarParTxt, A12671BarParVl2});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
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

   public void S121( )
   {
      /* 'ARTFOR' Routine */
      returnInSub = false ;
      AV30ARTPROCOD = " " ;
      AV31FasQuilin = (short)(1) ;
      /* Using cursor P000S9 */
      pr_default.execute(6, new Object[] {AV16EmprCod, Integer.valueOf(AV28Clicod), AV29Barser, AV15ProCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A758ProCod = P000S9_A758ProCod[0] ;
         A65ArtCod = P000S9_A65ArtCod[0] ;
         A252CliCod = P000S9_A252CliCod[0] ;
         n252CliCod = P000S9_n252CliCod[0] ;
         A396EmprCod = P000S9_A396EmprCod[0] ;
         A4898ArtProCod = P000S9_A4898ArtProCod[0] ;
         A457FasCod = P000S9_A457FasCod[0] ;
         A456FasActTin = P000S9_A456FasActTin[0] ;
         n456FasActTin = P000S9_n456FasActTin[0] ;
         A4286FasForMul = P000S9_A4286FasForMul[0] ;
         n4286FasForMul = P000S9_n4286FasForMul[0] ;
         A4897ArtProLin = P000S9_A4897ArtProLin[0] ;
         A456FasActTin = P000S9_A456FasActTin[0] ;
         n456FasActTin = P000S9_n456FasActTin[0] ;
         A4286FasForMul = P000S9_A4286FasForMul[0] ;
         n4286FasForMul = P000S9_n4286FasForMul[0] ;
         AV30ARTPROCOD = A4898ArtProCod ;
         if ( GXutil.strcmp(AV21FasCod, A457FasCod) == 0 )
         {
            if ( ( GXutil.strcmp(A4286FasForMul, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) != 0 ) )
            {
               /* Execute user subroutine: 'CREOFASQUI' */
               S138 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
                  pr_default.close(6);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S138( )
   {
      /* 'CREOFASQUI' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPFASQUI

      */
      A396EmprCod = AV16EmprCod ;
      A129BarCod = AV17BarCod ;
      A132BarCodReo = AV18BarCodReo ;
      A130BarCodPar = AV19BarCodPar ;
      A758ProCod = AV15ProCod ;
      A194BarOrdLin = AV20UltLin ;
      A5371FasQuiLin = AV31FasQuilin ;
      A764ProForCod = AV30ARTPROCOD ;
      A5373FasQuiNp = (short)(0) ;
      A5374FasQuiTp = (short)(0) ;
      A5375FasQuiRb = (short)(0) ;
      A6599FasMaqPl = " " ;
      A6600FasFecPl = GXutil.nullDate() ;
      A6601FasOrdPl = (byte)(0) ;
      A6602FasStPl = (byte)(0) ;
      A6663FasQuiAnc = (short)(0) ;
      A6664FasQuiGrm = (short)(0) ;
      A6665FasQuiObs = " " ;
      A9722FasQuiVel = DecimalUtil.doubleToDec(0) ;
      A11506FasQuiAv = " " ;
      A12125FasQuiAI = " " ;
      A12124FasQuiAs = " " ;
      /* Using cursor P000S10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin), A764ProForCod, Short.valueOf(A5373FasQuiNp), Short.valueOf(A5374FasQuiTp), Short.valueOf(A5375FasQuiRb), A6599FasMaqPl, A6600FasFecPl, Byte.valueOf(A6601FasOrdPl), Byte.valueOf(A6602FasStPl), Short.valueOf(A6663FasQuiAnc), Short.valueOf(A6664FasQuiGrm), A6665FasQuiObs, A9722FasQuiVel, A11506FasQuiAv, A12124FasQuiAs, A12125FasQuiAI});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
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
      AV31FasQuilin = (short)(AV31FasQuilin+1) ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnuefas.this.AV16EmprCod;
      this.aP1[0] = pnuefas.this.AV17BarCod;
      this.aP2[0] = pnuefas.this.AV18BarCodReo;
      this.aP3[0] = pnuefas.this.AV19BarCodPar;
      this.aP4[0] = pnuefas.this.AV15ProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnuefas");
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
      P000S3_A130BarCodPar = new String[] {""} ;
      P000S3_A132BarCodReo = new byte[1] ;
      P000S3_A129BarCod = new int[1] ;
      P000S3_A396EmprCod = new String[] {""} ;
      P000S3_A252CliCod = new int[1] ;
      P000S3_n252CliCod = new boolean[] {false} ;
      P000S3_A212BarSer = new String[] {""} ;
      P000S3_A628MaxOrdFas = new short[1] ;
      P000S3_n628MaxOrdFas = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      AV29Barser = "" ;
      AV26NPed = "" ;
      AV25BarNped = "" ;
      P000S4_A602MaqCod = new String[] {""} ;
      P000S4_n602MaqCod = new boolean[] {false} ;
      P000S4_A456FasActTin = new String[] {""} ;
      P000S4_n456FasActTin = new boolean[] {false} ;
      P000S4_A458FasCon = new String[] {""} ;
      P000S4_n458FasCon = new boolean[] {false} ;
      P000S4_A4286FasForMul = new String[] {""} ;
      P000S4_n4286FasForMul = new boolean[] {false} ;
      P000S4_A4639FasCara = new String[] {""} ;
      P000S4_n4639FasCara = new boolean[] {false} ;
      P000S4_A4299FasConPla = new String[] {""} ;
      P000S4_n4299FasConPla = new boolean[] {false} ;
      P000S4_A4903FasAcab = new String[] {""} ;
      P000S4_n4903FasAcab = new boolean[] {false} ;
      P000S4_A5368FasGral = new String[] {""} ;
      P000S4_n5368FasGral = new boolean[] {false} ;
      P000S4_A758ProCod = new String[] {""} ;
      P000S4_A396EmprCod = new String[] {""} ;
      P000S4_A457FasCod = new String[] {""} ;
      P000S4_A774ProNumLin = new short[1] ;
      A602MaqCod = "" ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4286FasForMul = "" ;
      A4639FasCara = "" ;
      A4299FasConPla = "" ;
      A4903FasAcab = "" ;
      A5368FasGral = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      W396EmprCod = "" ;
      W758ProCod = "" ;
      AV21FasCod = "" ;
      W457FasCod = "" ;
      A603MaqCodBis = "" ;
      A150BarFacTin = "" ;
      A152BarFasCon = "" ;
      A4287BarFasFor = "" ;
      A4637BarFasCara = "" ;
      A4301BarFasCoP = "" ;
      A4905BarFasAcab = "" ;
      A4021BarFasBot = "" ;
      A5369BarFasGral = "" ;
      A5047BarFasFPl = GXutil.nullDate() ;
      A5048BarFasUsu = "" ;
      A179BarLoc = "" ;
      A5896BarMaqPlan = "" ;
      A6012BarFasTip = "" ;
      Gx_emsg = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      P000S7_A1668ParFasVal = new String[] {""} ;
      P000S7_A1673ParFasObs = new String[] {""} ;
      P000S7_A12670ParFasVl2 = new String[] {""} ;
      P000S7_A1664ParFasCod = new short[1] ;
      P000S7_A457FasCod = new String[] {""} ;
      P000S7_A758ProCod = new String[] {""} ;
      P000S7_A65ArtCod = new String[] {""} ;
      P000S7_A252CliCod = new int[1] ;
      P000S7_n252CliCod = new boolean[] {false} ;
      P000S7_A396EmprCod = new String[] {""} ;
      A1668ParFasVal = "" ;
      A1673ParFasObs = "" ;
      A12670ParFasVl2 = "" ;
      A65ArtCod = "" ;
      A3295BarParVal = "" ;
      A3296BarParObs = "" ;
      A3693BarParTxt = "" ;
      A12671BarParVl2 = "" ;
      AV30ARTPROCOD = "" ;
      P000S9_A758ProCod = new String[] {""} ;
      P000S9_A65ArtCod = new String[] {""} ;
      P000S9_A252CliCod = new int[1] ;
      P000S9_n252CliCod = new boolean[] {false} ;
      P000S9_A396EmprCod = new String[] {""} ;
      P000S9_A4898ArtProCod = new String[] {""} ;
      P000S9_A457FasCod = new String[] {""} ;
      P000S9_A456FasActTin = new String[] {""} ;
      P000S9_n456FasActTin = new boolean[] {false} ;
      P000S9_A4286FasForMul = new String[] {""} ;
      P000S9_n4286FasForMul = new boolean[] {false} ;
      P000S9_A4897ArtProLin = new short[1] ;
      A4898ArtProCod = "" ;
      A764ProForCod = "" ;
      A6599FasMaqPl = "" ;
      A6600FasFecPl = GXutil.nullDate() ;
      A6665FasQuiObs = "" ;
      A9722FasQuiVel = DecimalUtil.ZERO ;
      A11506FasQuiAv = "" ;
      A12125FasQuiAI = "" ;
      A12124FasQuiAs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnuefas__default(),
         new Object[] {
             new Object[] {
            P000S3_A130BarCodPar, P000S3_A132BarCodReo, P000S3_A129BarCod, P000S3_A396EmprCod, P000S3_A252CliCod, P000S3_n252CliCod, P000S3_A212BarSer, P000S3_A628MaxOrdFas, P000S3_n628MaxOrdFas
            }
            , new Object[] {
            P000S4_A602MaqCod, P000S4_n602MaqCod, P000S4_A456FasActTin, P000S4_n456FasActTin, P000S4_A458FasCon, P000S4_n458FasCon, P000S4_A4286FasForMul, P000S4_n4286FasForMul, P000S4_A4639FasCara, P000S4_n4639FasCara,
            P000S4_A4299FasConPla, P000S4_n4299FasConPla, P000S4_A4903FasAcab, P000S4_n4903FasAcab, P000S4_A5368FasGral, P000S4_n5368FasGral, P000S4_A758ProCod, P000S4_A396EmprCod, P000S4_A457FasCod, P000S4_A774ProNumLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P000S7_A1668ParFasVal, P000S7_A1673ParFasObs, P000S7_A12670ParFasVl2, P000S7_A1664ParFasCod, P000S7_A457FasCod, P000S7_A758ProCod, P000S7_A65ArtCod, P000S7_A252CliCod, P000S7_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P000S9_A758ProCod, P000S9_A65ArtCod, P000S9_A252CliCod, P000S9_A396EmprCod, P000S9_A4898ArtProCod, P000S9_A457FasCod, P000S9_A456FasActTin, P000S9_n456FasActTin, P000S9_A4286FasForMul, P000S9_n4286FasForMul,
            P000S9_A4897ArtProLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18BarCodReo ;
   private byte AV24FlagLav ;
   private byte AV27Induyco ;
   private byte AV23JBP ;
   private byte AV32Torient ;
   private byte AV33Etm ;
   private byte GXt_int1 ;
   private byte A132BarCodReo ;
   private byte A3836BarFasPri ;
   private byte GXv_int2[] ;
   private byte A6601FasOrdPl ;
   private byte A6602FasStPl ;
   private short A628MaxOrdFas ;
   private short AV20UltLin ;
   private short A774ProNumLin ;
   private short AV22ProNumLin ;
   private short A194BarOrdLin ;
   private short A8938BarfasPri2 ;
   private short Gx_err ;
   private short A761ProFasLin ;
   private short A1664ParFasCod ;
   private short W1664ParFasCod ;
   private short AV31FasQuilin ;
   private short A4897ArtProLin ;
   private short A5371FasQuiLin ;
   private short A5373FasQuiNp ;
   private short A5374FasQuiTp ;
   private short A5375FasQuiRb ;
   private short A6663FasQuiAnc ;
   private short A6664FasQuiGrm ;
   private int AV17BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV28Clicod ;
   private int GX_INS15 ;
   private int A4638BarUltNlot ;
   private int A4022BarNumBot ;
   private int GXv_int4[] ;
   private int GX_INS475 ;
   private int GX_INS779 ;
   private java.math.BigDecimal A9722FasQuiVel ;
   private String AV16EmprCod ;
   private String AV19BarCodPar ;
   private String AV15ProCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String AV29Barser ;
   private String AV26NPed ;
   private String AV25BarNped ;
   private String A602MaqCod ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String A4286FasForMul ;
   private String A4639FasCara ;
   private String A4299FasConPla ;
   private String A4903FasAcab ;
   private String A5368FasGral ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String W396EmprCod ;
   private String W758ProCod ;
   private String AV21FasCod ;
   private String W457FasCod ;
   private String A603MaqCodBis ;
   private String A150BarFacTin ;
   private String A152BarFasCon ;
   private String A4287BarFasFor ;
   private String A4637BarFasCara ;
   private String A4301BarFasCoP ;
   private String A4905BarFasAcab ;
   private String A4021BarFasBot ;
   private String A5369BarFasGral ;
   private String A5048BarFasUsu ;
   private String A179BarLoc ;
   private String A5896BarMaqPlan ;
   private String A6012BarFasTip ;
   private String Gx_emsg ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String A1668ParFasVal ;
   private String A1673ParFasObs ;
   private String A12670ParFasVl2 ;
   private String A65ArtCod ;
   private String A3295BarParVal ;
   private String A3296BarParObs ;
   private String A12671BarParVl2 ;
   private String AV30ARTPROCOD ;
   private String A4898ArtProCod ;
   private String A764ProForCod ;
   private String A6599FasMaqPl ;
   private String A11506FasQuiAv ;
   private String A12125FasQuiAI ;
   private String A12124FasQuiAs ;
   private java.util.Date A5047BarFasFPl ;
   private java.util.Date A6600FasFecPl ;
   private boolean n252CliCod ;
   private boolean n628MaxOrdFas ;
   private boolean n602MaqCod ;
   private boolean n456FasActTin ;
   private boolean n458FasCon ;
   private boolean n4286FasForMul ;
   private boolean n4639FasCara ;
   private boolean n4299FasConPla ;
   private boolean n4903FasAcab ;
   private boolean n5368FasGral ;
   private boolean n4638BarUltNlot ;
   private boolean n5369BarFasGral ;
   private boolean n5047BarFasFPl ;
   private boolean n5048BarFasUsu ;
   private boolean n5896BarMaqPlan ;
   private boolean n6012BarFasTip ;
   private boolean n8938BarfasPri2 ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private boolean n3693BarParTxt ;
   private String A3693BarParTxt ;
   private String A6665FasQuiObs ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P000S3_A130BarCodPar ;
   private byte[] P000S3_A132BarCodReo ;
   private int[] P000S3_A129BarCod ;
   private String[] P000S3_A396EmprCod ;
   private int[] P000S3_A252CliCod ;
   private boolean[] P000S3_n252CliCod ;
   private String[] P000S3_A212BarSer ;
   private short[] P000S3_A628MaxOrdFas ;
   private boolean[] P000S3_n628MaxOrdFas ;
   private String[] P000S4_A602MaqCod ;
   private boolean[] P000S4_n602MaqCod ;
   private String[] P000S4_A456FasActTin ;
   private boolean[] P000S4_n456FasActTin ;
   private String[] P000S4_A458FasCon ;
   private boolean[] P000S4_n458FasCon ;
   private String[] P000S4_A4286FasForMul ;
   private boolean[] P000S4_n4286FasForMul ;
   private String[] P000S4_A4639FasCara ;
   private boolean[] P000S4_n4639FasCara ;
   private String[] P000S4_A4299FasConPla ;
   private boolean[] P000S4_n4299FasConPla ;
   private String[] P000S4_A4903FasAcab ;
   private boolean[] P000S4_n4903FasAcab ;
   private String[] P000S4_A5368FasGral ;
   private boolean[] P000S4_n5368FasGral ;
   private String[] P000S4_A758ProCod ;
   private String[] P000S4_A396EmprCod ;
   private String[] P000S4_A457FasCod ;
   private short[] P000S4_A774ProNumLin ;
   private String[] P000S7_A1668ParFasVal ;
   private String[] P000S7_A1673ParFasObs ;
   private String[] P000S7_A12670ParFasVl2 ;
   private short[] P000S7_A1664ParFasCod ;
   private String[] P000S7_A457FasCod ;
   private String[] P000S7_A758ProCod ;
   private String[] P000S7_A65ArtCod ;
   private int[] P000S7_A252CliCod ;
   private boolean[] P000S7_n252CliCod ;
   private String[] P000S7_A396EmprCod ;
   private String[] P000S9_A758ProCod ;
   private String[] P000S9_A65ArtCod ;
   private int[] P000S9_A252CliCod ;
   private boolean[] P000S9_n252CliCod ;
   private String[] P000S9_A396EmprCod ;
   private String[] P000S9_A4898ArtProCod ;
   private String[] P000S9_A457FasCod ;
   private String[] P000S9_A456FasActTin ;
   private boolean[] P000S9_n456FasActTin ;
   private String[] P000S9_A4286FasForMul ;
   private boolean[] P000S9_n4286FasForMul ;
   private short[] P000S9_A4897ArtProLin ;
}

final  class pnuefas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000S3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T1.BarSer, COALESCE( T2.MaxOrdFas, 0) AS MaxOrdFas FROM (TXPBARCAD T1 LEFT JOIN (SELECT MAX(BarOrdLin) AS MaxOrdFas, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarOrdLin > 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P000S4", "SELECT T2.MaqCod, T2.FasActTin, T2.FasCon, T2.FasForMul, T2.FasCara, T2.FasConPla, T2.FasAcab, T2.FasGral, T1.ProCod, T1.EmprCod, T1.FasCod, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.ProCod, T1.ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000S5", "INSERT INTO TXPBARFAS(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon, MaqCodBis, BarFacTin, BarLoc, BarFasBot, BarNumBot, BarFasFor, BarFasCoP, BarFasCara, BarUltNlot, BarFasAcab, FasCod, BarFasFPl, BarFasUsu, BarFasGral, BarMaqPlan, BarFasTip, BarfasPri2, BarFasPri, BarFasEst, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarFasKgm, BarFasMtr, BarNPzas, BarFasPzas, BarFasInc, BarFasDTI, BarFasDTF, BarFasKPr, BarFasPPr, BarFasAgr, BarFasPrp, FasQuiUl, BarFasKgT, BarFasMtT, BarFasCR, BarFasSec, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarHdrO, BarObsF, BarObsB, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P000S6", "UPDATE TXPBARPRO SET ProFasLin=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
         ,new ForEachCursor("P000S7", "SELECT ParFasVal, ParFasObs, ParFasVl2, ParFasCod, FasCod, ProCod, ArtCod, CliCod, EmprCod FROM TXPSERPAR WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000S8", "INSERT INTO TXPBarPar(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod, BarParVal, BarParObs, BarParTxt, BarParVl2, BarValPar, Itm_ord5, BarParVMn, BarParVMx, BarParPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBarPar")
         ,new ForEachCursor("P000S9", "SELECT T1.ProCod, T1.ArtCod, T1.CliCod, T1.EmprCod, T1.ArtProCod, T1.FasCod, T2.FasActTin, T2.FasForMul, T1.ArtProLin FROM (TXPArtFor T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000S10", "INSERT INTO TXPFASQUI(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin, ProForCod, FasQuiNp, FasQuiTp, FasQuiRb, FasMaqPl, FasFecPl, FasOrdPl, FasStPl, FasQuiAnc, FasQuiGrm, FasQuiObs, FasQuiVel, FasQuiAv, FasQuiAs, FasQuiAI, FasQuiFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 8);
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((String[]) buf[18])[0] = rslt.getString(11, 8);
               ((short[]) buf[19])[0] = rslt.getShort(12);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               return;
            case 6 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 10);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 1);
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 1);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[16]).intValue());
               }
               stmt.setString(17, (String)parms[17], 1);
               stmt.setString(18, (String)parms[18], 8);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DATE );
               }
               else
               {
                  stmt.setDate(19, (java.util.Date)parms[20]);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[22], 8);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[26], 6);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[30]).shortValue());
               }
               stmt.setByte(25, ((Number) parms[31]).byteValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 60);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[10], 400);
               }
               stmt.setString(11, (String)parms[11], 12);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setString(12, (String)parms[11], 6);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setVarchar(18, (String)parms[17], 400, false);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 1);
               stmt.setString(20, (String)parms[19], 4);
               stmt.setString(21, (String)parms[20], 3);
               stmt.setString(22, (String)parms[21], 3);
               return;
      }
   }

}

