package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prieclfr extends GXProcedure
{
   public prieclfr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prieclfr.class ), "" );
   }

   public prieclfr( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           int[] aP2 ,
                                           String[] aP3 )
   {
      prieclfr.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      prieclfr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prieclfr.this.AV13CliCodP = aP1[0];
      this.aP1 = aP1;
      prieclfr.this.AV9FacCod = aP2[0];
      this.aP2 = aP2;
      prieclfr.this.AV10Modo = aP3[0];
      this.aP3 = aP3;
      prieclfr.this.AV12Riesgo = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV14PagoFac ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PAGFAC", ""), GXv_int1) ;
      prieclfr.this.AV14PagoFac = GXv_int1[0] ;
      AV23Station = context.getWorkstationId( remoteHandle) ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char4[0] = AV24Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char2, GXv_char3, GXv_char4) ;
      prieclfr.this.A396EmprCod = GXv_char2[0] ;
      prieclfr.this.AV25EmprNom = GXv_char3[0] ;
      prieclfr.this.AV24Usurcod = GXv_char4[0] ;
      if ( GXutil.strcmp(AV10Modo, httpContext.getMessage( "A", "")) == 0 )
      {
         /* Execute user subroutine: 'ALTA' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV10Modo, httpContext.getMessage( "B", "")) == 0 )
      {
         /* Execute user subroutine: 'BAJA' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ALTA' Routine */
      returnInSub = false ;
      /* Using cursor P04SX3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9FacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A430FacCod = P04SX3_A430FacCod[0] ;
         A252CliCod = P04SX3_A252CliCod[0] ;
         n252CliCod = P04SX3_n252CliCod[0] ;
         A436FacFch = P04SX3_A436FacFch[0] ;
         A11513FacRecIca = P04SX3_A11513FacRecIca[0] ;
         A8346FacRecI = P04SX3_A8346FacRecI[0] ;
         n8346FacRecI = P04SX3_n8346FacRecI[0] ;
         A7212FacRect = P04SX3_A7212FacRect[0] ;
         A453FacRECPor = P04SX3_A453FacRECPor[0] ;
         A443FacIVAPor = P04SX3_A443FacIVAPor[0] ;
         A14224FacCostFac = P04SX3_A14224FacCostFac[0] ;
         A14223FacCostKgs = P04SX3_A14223FacCostKgs[0] ;
         A14222FacCostMts = P04SX3_A14222FacCostMts[0] ;
         A434FacDtoPP = P04SX3_A434FacDtoPP[0] ;
         A433FacDtoGen = P04SX3_A433FacDtoGen[0] ;
         A7209Colombia = P04SX3_A7209Colombia[0] ;
         n7209Colombia = P04SX3_n7209Colombia[0] ;
         A14219FacEnergia = P04SX3_A14219FacEnergia[0] ;
         A3918FacImpTot1 = P04SX3_A3918FacImpTot1[0] ;
         A7209Colombia = P04SX3_A7209Colombia[0] ;
         n7209Colombia = P04SX3_n7209Colombia[0] ;
         A3918FacImpTot1 = P04SX3_A3918FacImpTot1[0] ;
         A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
         A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
            }
            else
            {
               A440FacImpPP = DecimalUtil.doubleToDec(0) ;
            }
         }
         A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
         A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
         A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
            }
            else
            {
               A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
            }
            else
            {
               A452FacRecImp = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
            }
            else
            {
               A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
            }
         }
         A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
            }
            else
            {
               A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
            }
         }
         A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
         AV11FacTot = A455FacTot ;
         AV8CliCod = A252CliCod ;
         AV15FacFch = A436FacFch ;
         /* Using cursor P04SX4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A957FacVtoFch = P04SX4_A957FacVtoFch[0] ;
            n957FacVtoFch = P04SX4_n957FacVtoFch[0] ;
            A956FacVtoLin = P04SX4_A956FacVtoLin[0] ;
            AV20FacVtoFch = A957FacVtoFch ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P04SX5 */
      pr_default.execute(2, new Object[] {AV11FacTot, A396EmprCod, Integer.valueOf(AV8CliCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
      /* End optimized UPDATE. */
      if ( AV14PagoFac == 1 )
      {
         /*
            INSERT RECORD ON TABLE TXPPAGCLI

         */
         A5130PagIden = AV9FacCod ;
         A5131PagFec = AV15FacFch ;
         n5131PagFec = false ;
         A252CliCod = AV8CliCod ;
         n252CliCod = false ;
         A5132PagImpo = AV11FacTot ;
         n5132PagImpo = false ;
         A5133PagDocum = localUtil.dtoc( AV20FacVtoFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         n5133PagDocum = false ;
         /* Using cursor P04SX6 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5130PagIden), Boolean.valueOf(n5131PagFec), A5131PagFec, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n5132PagImpo), A5132PagImpo, Boolean.valueOf(n5133PagDocum), A5133PagDocum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPAGCLI");
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
      }
   }

   public void S121( )
   {
      /* 'BAJA' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P04SX7 */
      pr_default.execute(4, new Object[] {AV12Riesgo, A396EmprCod, Integer.valueOf(AV13CliCodP)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
      /* End optimized UPDATE. */
      if ( AV14PagoFac == 1 )
      {
         /* Using cursor P04SX8 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV9FacCod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A5130PagIden = P04SX8_A5130PagIden[0] ;
            A5132PagImpo = P04SX8_A5132PagImpo[0] ;
            n5132PagImpo = P04SX8_n5132PagImpo[0] ;
            A5132PagImpo = A5132PagImpo.subtract(AV12Riesgo) ;
            n5132PagImpo = false ;
            if ( A5132PagImpo.doubleValue() <= 0 )
            {
               /* Using cursor P04SX9 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A5130PagIden)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPAGCLI");
            }
            /* Using cursor P04SX10 */
            pr_default.execute(7, new Object[] {Boolean.valueOf(n5132PagImpo), A5132PagImpo, A396EmprCod, Integer.valueOf(A5130PagIden)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPAGCLI");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
   }

   public void S131( )
   {
      /* 'MODIF' Routine */
      returnInSub = false ;
      /* Using cursor P04SX12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV9FacCod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A430FacCod = P04SX12_A430FacCod[0] ;
         A252CliCod = P04SX12_A252CliCod[0] ;
         n252CliCod = P04SX12_n252CliCod[0] ;
         A11513FacRecIca = P04SX12_A11513FacRecIca[0] ;
         A8346FacRecI = P04SX12_A8346FacRecI[0] ;
         n8346FacRecI = P04SX12_n8346FacRecI[0] ;
         A7212FacRect = P04SX12_A7212FacRect[0] ;
         A453FacRECPor = P04SX12_A453FacRECPor[0] ;
         A443FacIVAPor = P04SX12_A443FacIVAPor[0] ;
         A14224FacCostFac = P04SX12_A14224FacCostFac[0] ;
         A14223FacCostKgs = P04SX12_A14223FacCostKgs[0] ;
         A14222FacCostMts = P04SX12_A14222FacCostMts[0] ;
         A434FacDtoPP = P04SX12_A434FacDtoPP[0] ;
         A433FacDtoGen = P04SX12_A433FacDtoGen[0] ;
         A7209Colombia = P04SX12_A7209Colombia[0] ;
         n7209Colombia = P04SX12_n7209Colombia[0] ;
         A14219FacEnergia = P04SX12_A14219FacEnergia[0] ;
         A3918FacImpTot1 = P04SX12_A3918FacImpTot1[0] ;
         A7209Colombia = P04SX12_A7209Colombia[0] ;
         n7209Colombia = P04SX12_n7209Colombia[0] ;
         A3918FacImpTot1 = P04SX12_A3918FacImpTot1[0] ;
         A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
         A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
            }
            else
            {
               A440FacImpPP = DecimalUtil.doubleToDec(0) ;
            }
         }
         A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
         A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
         A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
            }
            else
            {
               A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
            }
            else
            {
               A452FacRecImp = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
            }
            else
            {
               A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
            }
         }
         A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
            }
            else
            {
               A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
            }
         }
         A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
         AV11FacTot = A455FacTot ;
         AV8CliCod = A252CliCod ;
         /* Using cursor P04SX13 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A957FacVtoFch = P04SX13_A957FacVtoFch[0] ;
            n957FacVtoFch = P04SX13_n957FacVtoFch[0] ;
            A956FacVtoLin = P04SX13_A956FacVtoLin[0] ;
            AV20FacVtoFch = A957FacVtoFch ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
      /* Optimized UPDATE. */
      /* Using cursor P04SX14 */
      pr_default.execute(10, new Object[] {AV12Riesgo, AV11FacTot, A396EmprCod, Integer.valueOf(AV8CliCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
      /* End optimized UPDATE. */
      if ( AV14PagoFac == 1 )
      {
         /* Using cursor P04SX15 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV9FacCod)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A5130PagIden = P04SX15_A5130PagIden[0] ;
            A5132PagImpo = P04SX15_A5132PagImpo[0] ;
            n5132PagImpo = P04SX15_n5132PagImpo[0] ;
            A5133PagDocum = P04SX15_A5133PagDocum[0] ;
            n5133PagDocum = P04SX15_n5133PagDocum[0] ;
            A5132PagImpo = AV11FacTot ;
            n5132PagImpo = false ;
            AV26Inc_obs = httpContext.getMessage( "Modificacion Tabla PAGCLI", "") + GXutil.newLine( ) ;
            AV26Inc_obs += httpContext.getMessage( "Valor Inicial Fecha Pago= ", "") + GXutil.trim( A5133PagDocum) + GXutil.newLine( ) ;
            AV26Inc_obs += httpContext.getMessage( "Valor Nuevo   Fecha Pago= ", "") + localUtil.dtoc( AV20FacVtoFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            A5133PagDocum = localUtil.dtoc( AV20FacVtoFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            n5133PagDocum = false ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV38Pgmname, AV24Usurcod, AV23Station, AV26Inc_obs, AV9FacCod, (byte)(0), "") ;
            /* Using cursor P04SX16 */
            pr_default.execute(12, new Object[] {Boolean.valueOf(n5132PagImpo), A5132PagImpo, Boolean.valueOf(n5133PagDocum), A5133PagDocum, A396EmprCod, Integer.valueOf(A5130PagIden)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPAGCLI");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(11);
      }
   }

   public void S141( )
   {
      /* 'HPAGCL' Routine */
      returnInSub = false ;
      AV22HpagUltl = (short)(1) ;
      /*
         INSERT RECORD ON TABLE TXPHPAGCL

      */
      A11248HpagIden = AV9FacCod ;
      A11249HpagUltl = AV22HpagUltl ;
      n11249HpagUltl = false ;
      /* Using cursor P04SX17 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A11248HpagIden), Boolean.valueOf(n11249HpagUltl), Short.valueOf(A11249HpagUltl)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPAGCL");
      if ( (pr_default.getStatus(13) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P04SX18 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A11248HpagIden)});
         while ( (pr_default.getStatus(14) != 101) )
         {
            A396EmprCod = P04SX18_A396EmprCod[0] ;
            A11248HpagIden = P04SX18_A11248HpagIden[0] ;
            A11249HpagUltl = P04SX18_A11249HpagUltl[0] ;
            n11249HpagUltl = P04SX18_n11249HpagUltl[0] ;
            A11249HpagUltl = (short)(A11249HpagUltl+1) ;
            n11249HpagUltl = false ;
            AV22HpagUltl = A11249HpagUltl ;
            /* Using cursor P04SX19 */
            pr_default.execute(15, new Object[] {Boolean.valueOf(n11249HpagUltl), Short.valueOf(A11249HpagUltl), A396EmprCod, Integer.valueOf(A11248HpagIden)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPAGCL");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(14);
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
      this.aP0[0] = prieclfr.this.A396EmprCod;
      this.aP1[0] = prieclfr.this.AV13CliCodP;
      this.aP2[0] = prieclfr.this.AV9FacCod;
      this.aP3[0] = prieclfr.this.AV10Modo;
      this.aP4[0] = prieclfr.this.AV12Riesgo;
      Application.commitDataStores(context, remoteHandle, pr_default, "prieclfr");
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
      AV23Station = "" ;
      GXv_char2 = new String[1] ;
      AV25EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV24Usurcod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P04SX3_A396EmprCod = new String[] {""} ;
      P04SX3_A430FacCod = new int[1] ;
      P04SX3_A252CliCod = new int[1] ;
      P04SX3_n252CliCod = new boolean[] {false} ;
      P04SX3_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P04SX3_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX3_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX3_n8346FacRecI = new boolean[] {false} ;
      P04SX3_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX3_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX3_A443FacIVAPor = new byte[1] ;
      P04SX3_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX3_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX3_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX3_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX3_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX3_A7209Colombia = new byte[1] ;
      P04SX3_n7209Colombia = new boolean[] {false} ;
      P04SX3_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX3_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A436FacFch = GXutil.nullDate() ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      AV11FacTot = DecimalUtil.ZERO ;
      AV15FacFch = GXutil.nullDate() ;
      P04SX4_A396EmprCod = new String[] {""} ;
      P04SX4_A430FacCod = new int[1] ;
      P04SX4_A957FacVtoFch = new java.util.Date[] {GXutil.nullDate()} ;
      P04SX4_n957FacVtoFch = new boolean[] {false} ;
      P04SX4_A956FacVtoLin = new byte[1] ;
      A957FacVtoFch = GXutil.nullDate() ;
      AV20FacVtoFch = GXutil.nullDate() ;
      A5131PagFec = GXutil.nullDate() ;
      A5132PagImpo = DecimalUtil.ZERO ;
      A5133PagDocum = "" ;
      Gx_emsg = "" ;
      P04SX8_A396EmprCod = new String[] {""} ;
      P04SX8_A5130PagIden = new int[1] ;
      P04SX8_A5132PagImpo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX8_n5132PagImpo = new boolean[] {false} ;
      P04SX12_A396EmprCod = new String[] {""} ;
      P04SX12_A430FacCod = new int[1] ;
      P04SX12_A252CliCod = new int[1] ;
      P04SX12_n252CliCod = new boolean[] {false} ;
      P04SX12_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX12_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX12_n8346FacRecI = new boolean[] {false} ;
      P04SX12_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX12_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX12_A443FacIVAPor = new byte[1] ;
      P04SX12_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX12_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX12_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX12_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX12_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX12_A7209Colombia = new byte[1] ;
      P04SX12_n7209Colombia = new boolean[] {false} ;
      P04SX12_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX12_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX13_A396EmprCod = new String[] {""} ;
      P04SX13_A430FacCod = new int[1] ;
      P04SX13_A957FacVtoFch = new java.util.Date[] {GXutil.nullDate()} ;
      P04SX13_n957FacVtoFch = new boolean[] {false} ;
      P04SX13_A956FacVtoLin = new byte[1] ;
      P04SX15_A396EmprCod = new String[] {""} ;
      P04SX15_A5130PagIden = new int[1] ;
      P04SX15_A5132PagImpo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04SX15_n5132PagImpo = new boolean[] {false} ;
      P04SX15_A5133PagDocum = new String[] {""} ;
      P04SX15_n5133PagDocum = new boolean[] {false} ;
      AV26Inc_obs = "" ;
      AV38Pgmname = "" ;
      P04SX18_A396EmprCod = new String[] {""} ;
      P04SX18_A11248HpagIden = new int[1] ;
      P04SX18_A11249HpagUltl = new short[1] ;
      P04SX18_n11249HpagUltl = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prieclfr__default(),
         new Object[] {
             new Object[] {
            P04SX3_A396EmprCod, P04SX3_A430FacCod, P04SX3_A252CliCod, P04SX3_A436FacFch, P04SX3_A11513FacRecIca, P04SX3_A8346FacRecI, P04SX3_n8346FacRecI, P04SX3_A7212FacRect, P04SX3_A453FacRECPor, P04SX3_A443FacIVAPor,
            P04SX3_A14224FacCostFac, P04SX3_A14223FacCostKgs, P04SX3_A14222FacCostMts, P04SX3_A434FacDtoPP, P04SX3_A433FacDtoGen, P04SX3_A7209Colombia, P04SX3_n7209Colombia, P04SX3_A14219FacEnergia, P04SX3_A3918FacImpTot1
            }
            , new Object[] {
            P04SX4_A396EmprCod, P04SX4_A430FacCod, P04SX4_A957FacVtoFch, P04SX4_n957FacVtoFch, P04SX4_A956FacVtoLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04SX8_A396EmprCod, P04SX8_A5130PagIden, P04SX8_A5132PagImpo, P04SX8_n5132PagImpo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04SX12_A396EmprCod, P04SX12_A430FacCod, P04SX12_A252CliCod, P04SX12_A11513FacRecIca, P04SX12_A8346FacRecI, P04SX12_n8346FacRecI, P04SX12_A7212FacRect, P04SX12_A453FacRECPor, P04SX12_A443FacIVAPor, P04SX12_A14224FacCostFac,
            P04SX12_A14223FacCostKgs, P04SX12_A14222FacCostMts, P04SX12_A434FacDtoPP, P04SX12_A433FacDtoGen, P04SX12_A7209Colombia, P04SX12_n7209Colombia, P04SX12_A14219FacEnergia, P04SX12_A3918FacImpTot1
            }
            , new Object[] {
            P04SX13_A396EmprCod, P04SX13_A430FacCod, P04SX13_A957FacVtoFch, P04SX13_n957FacVtoFch, P04SX13_A956FacVtoLin
            }
            , new Object[] {
            }
            , new Object[] {
            P04SX15_A396EmprCod, P04SX15_A5130PagIden, P04SX15_A5132PagImpo, P04SX15_n5132PagImpo, P04SX15_A5133PagDocum, P04SX15_n5133PagDocum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04SX18_A396EmprCod, P04SX18_A11248HpagIden, P04SX18_A11249HpagUltl, P04SX18_n11249HpagUltl
            }
            , new Object[] {
            }
         }
      );
      AV38Pgmname = "PRieClFr" ;
      /* GeneXus formulas. */
      AV38Pgmname = "PRieClFr" ;
      Gx_err = (short)(0) ;
   }

   private byte AV14PagoFac ;
   private byte GXv_int1[] ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private byte A956FacVtoLin ;
   private short Gx_err ;
   private short AV22HpagUltl ;
   private short A11249HpagUltl ;
   private int AV13CliCodP ;
   private int AV9FacCod ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int AV8CliCod ;
   private int GX_INS749 ;
   private int A5130PagIden ;
   private int GX_INS1498 ;
   private int A11248HpagIden ;
   private java.math.BigDecimal AV12Riesgo ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal AV11FacTot ;
   private java.math.BigDecimal A5132PagImpo ;
   private String A396EmprCod ;
   private String AV10Modo ;
   private String AV23Station ;
   private String GXv_char2[] ;
   private String AV25EmprNom ;
   private String GXv_char3[] ;
   private String AV24Usurcod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A5133PagDocum ;
   private String Gx_emsg ;
   private String AV38Pgmname ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV15FacFch ;
   private java.util.Date A957FacVtoFch ;
   private java.util.Date AV20FacVtoFch ;
   private java.util.Date A5131PagFec ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private boolean n957FacVtoFch ;
   private boolean n5131PagFec ;
   private boolean n5132PagImpo ;
   private boolean n5133PagDocum ;
   private boolean n11249HpagUltl ;
   private String AV26Inc_obs ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04SX3_A396EmprCod ;
   private int[] P04SX3_A430FacCod ;
   private int[] P04SX3_A252CliCod ;
   private boolean[] P04SX3_n252CliCod ;
   private java.util.Date[] P04SX3_A436FacFch ;
   private java.math.BigDecimal[] P04SX3_A11513FacRecIca ;
   private java.math.BigDecimal[] P04SX3_A8346FacRecI ;
   private boolean[] P04SX3_n8346FacRecI ;
   private java.math.BigDecimal[] P04SX3_A7212FacRect ;
   private java.math.BigDecimal[] P04SX3_A453FacRECPor ;
   private byte[] P04SX3_A443FacIVAPor ;
   private java.math.BigDecimal[] P04SX3_A14224FacCostFac ;
   private java.math.BigDecimal[] P04SX3_A14223FacCostKgs ;
   private java.math.BigDecimal[] P04SX3_A14222FacCostMts ;
   private java.math.BigDecimal[] P04SX3_A434FacDtoPP ;
   private java.math.BigDecimal[] P04SX3_A433FacDtoGen ;
   private byte[] P04SX3_A7209Colombia ;
   private boolean[] P04SX3_n7209Colombia ;
   private java.math.BigDecimal[] P04SX3_A14219FacEnergia ;
   private java.math.BigDecimal[] P04SX3_A3918FacImpTot1 ;
   private String[] P04SX4_A396EmprCod ;
   private int[] P04SX4_A430FacCod ;
   private java.util.Date[] P04SX4_A957FacVtoFch ;
   private boolean[] P04SX4_n957FacVtoFch ;
   private byte[] P04SX4_A956FacVtoLin ;
   private String[] P04SX8_A396EmprCod ;
   private int[] P04SX8_A5130PagIden ;
   private java.math.BigDecimal[] P04SX8_A5132PagImpo ;
   private boolean[] P04SX8_n5132PagImpo ;
   private String[] P04SX12_A396EmprCod ;
   private int[] P04SX12_A430FacCod ;
   private int[] P04SX12_A252CliCod ;
   private boolean[] P04SX12_n252CliCod ;
   private java.math.BigDecimal[] P04SX12_A11513FacRecIca ;
   private java.math.BigDecimal[] P04SX12_A8346FacRecI ;
   private boolean[] P04SX12_n8346FacRecI ;
   private java.math.BigDecimal[] P04SX12_A7212FacRect ;
   private java.math.BigDecimal[] P04SX12_A453FacRECPor ;
   private byte[] P04SX12_A443FacIVAPor ;
   private java.math.BigDecimal[] P04SX12_A14224FacCostFac ;
   private java.math.BigDecimal[] P04SX12_A14223FacCostKgs ;
   private java.math.BigDecimal[] P04SX12_A14222FacCostMts ;
   private java.math.BigDecimal[] P04SX12_A434FacDtoPP ;
   private java.math.BigDecimal[] P04SX12_A433FacDtoGen ;
   private byte[] P04SX12_A7209Colombia ;
   private boolean[] P04SX12_n7209Colombia ;
   private java.math.BigDecimal[] P04SX12_A14219FacEnergia ;
   private java.math.BigDecimal[] P04SX12_A3918FacImpTot1 ;
   private String[] P04SX13_A396EmprCod ;
   private int[] P04SX13_A430FacCod ;
   private java.util.Date[] P04SX13_A957FacVtoFch ;
   private boolean[] P04SX13_n957FacVtoFch ;
   private byte[] P04SX13_A956FacVtoLin ;
   private String[] P04SX15_A396EmprCod ;
   private int[] P04SX15_A5130PagIden ;
   private java.math.BigDecimal[] P04SX15_A5132PagImpo ;
   private boolean[] P04SX15_n5132PagImpo ;
   private String[] P04SX15_A5133PagDocum ;
   private boolean[] P04SX15_n5133PagDocum ;
   private String[] P04SX18_A396EmprCod ;
   private int[] P04SX18_A11248HpagIden ;
   private short[] P04SX18_A11249HpagUltl ;
   private boolean[] P04SX18_n11249HpagUltl ;
}

final  class prieclfr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04SX3", "SELECT T1.EmprCod, T1.FacCod, T1.CliCod, T1.FacFch, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor, T1.FacIVAPor, T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoPP, T1.FacDtoGen, T2.Colombia, T1.FacEnergia, COALESCE( T3.FacImpTot1, 0) AS FacImpTot1 FROM ((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.FacCod = T1.FacCod) WHERE T1.EmprCod = ? and T1.FacCod = ? ORDER BY T1.EmprCod, T1.FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04SX4", "SELECT EmprCod, FacCod, FacVtoFch, FacVtoLin FROM TXPFACVTO WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacVtoLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04SX5", "UPDATE TXPCLIENT SET CliRieCir=CliRieCir + ?  WHERE EmprCod = ? and CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
         ,new UpdateCursor("P04SX6", "INSERT INTO TXPPAGCLI(EmprCod, PagIden, PagFec, CliCod, PagImpo, PagDocum) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPAGCLI")
         ,new UpdateCursor("P04SX7", "UPDATE TXPCLIENT SET CliRieCir=CliRieCir - ?  WHERE EmprCod = ? and CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
         ,new ForEachCursor("P04SX8", "SELECT EmprCod, PagIden, PagImpo FROM TXPPAGCLI WHERE EmprCod = ? and PagIden = ? ORDER BY EmprCod, PagIden  FOR UPDATE OF PagImpo NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04SX9", "DELETE FROM TXPPAGCLI  WHERE EmprCod = ? AND PagIden = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPAGCLI")
         ,new UpdateCursor("P04SX10", "UPDATE TXPPAGCLI SET PagImpo=?  WHERE EmprCod = ? AND PagIden = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPAGCLI")
         ,new ForEachCursor("P04SX12", "SELECT T1.EmprCod, T1.FacCod, T1.CliCod, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor, T1.FacIVAPor, T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoPP, T1.FacDtoGen, T2.Colombia, T1.FacEnergia, COALESCE( T3.FacImpTot1, 0) AS FacImpTot1 FROM ((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.FacCod = T1.FacCod) WHERE T1.EmprCod = ? and T1.FacCod = ? ORDER BY T1.EmprCod, T1.FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04SX13", "SELECT EmprCod, FacCod, FacVtoFch, FacVtoLin FROM TXPFACVTO WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacVtoLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04SX14", "UPDATE TXPCLIENT SET CliRieCir=CliRieCir - ? + ?  WHERE EmprCod = ? and CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
         ,new ForEachCursor("P04SX15", "SELECT EmprCod, PagIden, PagImpo, PagDocum FROM TXPPAGCLI WHERE EmprCod = ? and PagIden = ? ORDER BY EmprCod, PagIden  FOR UPDATE OF PagImpo, PagDocum NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04SX16", "UPDATE TXPPAGCLI SET PagImpo=?, PagDocum=?  WHERE EmprCod = ? AND PagIden = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPAGCLI")
         ,new UpdateCursor("P04SX17", "INSERT INTO TXPHPAGCL(EmprCod, HpagIden, HpagUltl) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHPAGCL")
         ,new ForEachCursor("P04SX18", "SELECT EmprCod, HpagIden, HpagUltl FROM TXPHPAGCL WHERE EmprCod = ? and HpagIden = ? ORDER BY EmprCod, HpagIden  FOR UPDATE OF HpagUltl NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04SX19", "UPDATE TXPHPAGCL SET HpagUltl=?  WHERE EmprCod = ? AND HpagIden = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHPAGCL")
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 10);
               }
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
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
               return;
            case 10 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
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
               return;
      }
   }

}

