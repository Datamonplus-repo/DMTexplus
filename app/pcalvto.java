package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalvto extends GXProcedure
{
   public pcalvto( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalvto.class ), "" );
   }

   public pcalvto( int remoteHandle ,
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
      pcalvto.this.A396EmprCod = aP0;
      pcalvto.this.A430FacCod = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(DecimalUtil.decToDouble(AV105Imppor)) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VTOPOR", ""), GXv_int2) ;
      pcalvto.this.GXt_int1 = GXv_int2[0] ;
      AV105Imppor = DecimalUtil.doubleToDec(GXt_int1) ;
      AV106Nvtos = (byte)(0) ;
      /* Using cursor P00B23 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1150FacNumVto = P00B23_A1150FacNumVto[0] ;
         A252CliCod = P00B23_A252CliCod[0] ;
         A450FacPri = P00B23_A450FacPri[0] ;
         A1151FacPer = P00B23_A1151FacPer[0] ;
         A277CliIniVac = P00B23_A277CliIniVac[0] ;
         A276CliFinVac = P00B23_A276CliFinVac[0] ;
         A258CliDes = P00B23_A258CliDes[0] ;
         A1152FacDiaPag = P00B23_A1152FacDiaPag[0] ;
         A436FacFch = P00B23_A436FacFch[0] ;
         A3915EmpNumDec = P00B23_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00B23_n3915EmpNumDec[0] ;
         A11513FacRecIca = P00B23_A11513FacRecIca[0] ;
         A8346FacRecI = P00B23_A8346FacRecI[0] ;
         n8346FacRecI = P00B23_n8346FacRecI[0] ;
         A7212FacRect = P00B23_A7212FacRect[0] ;
         A453FacRECPor = P00B23_A453FacRECPor[0] ;
         A443FacIVAPor = P00B23_A443FacIVAPor[0] ;
         A14224FacCostFac = P00B23_A14224FacCostFac[0] ;
         A14223FacCostKgs = P00B23_A14223FacCostKgs[0] ;
         A14222FacCostMts = P00B23_A14222FacCostMts[0] ;
         A434FacDtoPP = P00B23_A434FacDtoPP[0] ;
         A433FacDtoGen = P00B23_A433FacDtoGen[0] ;
         A7209Colombia = P00B23_A7209Colombia[0] ;
         n7209Colombia = P00B23_n7209Colombia[0] ;
         A14219FacEnergia = P00B23_A14219FacEnergia[0] ;
         A3918FacImpTot1 = P00B23_A3918FacImpTot1[0] ;
         A3915EmpNumDec = P00B23_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00B23_n3915EmpNumDec[0] ;
         A7209Colombia = P00B23_A7209Colombia[0] ;
         n7209Colombia = P00B23_n7209Colombia[0] ;
         A277CliIniVac = P00B23_A277CliIniVac[0] ;
         A276CliFinVac = P00B23_A276CliFinVac[0] ;
         A258CliDes = P00B23_A258CliDes[0] ;
         A3918FacImpTot1 = P00B23_A3918FacImpTot1[0] ;
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
         A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
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
         AV23NumVto = A1150FacNumVto ;
         AV106Nvtos = A1150FacNumVto ;
         /* Optimized DELETE. */
         /* Using cursor P00B24 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFACVTO");
         /* End optimized DELETE. */
         AV106Nvtos = A1150FacNumVto ;
         AV99clicod = A252CliCod ;
         AV100FacPri = A450FacPri ;
         /* Execute user subroutine: 'CLIFPG' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV106Nvtos = A1150FacNumVto ;
         AV84Period = A1151FacPer ;
         AV29NoPag3 = 0 ;
         AV30NoPag4 = 0 ;
         AV92Desp2 = (short)(0) ;
         AV27NoPag1 = (int)(GXutil.lval( A277CliIniVac)) ;
         AV28NoPag2 = (int)(GXutil.lval( A276CliFinVac)) ;
         AV93Desp1 = (short)(GXutil.lval( A258CliDes)) ;
         AV33NumEfe = (byte)(AV23NumVto) ;
         AV24DiaP1 = (byte)(GXutil.lval( GXutil.substring( A1152FacDiaPag, 1, 2))) ;
         AV25DiaP2 = (byte)(GXutil.lval( GXutil.substring( A1152FacDiaPag, 3, 2))) ;
         AV26DiaP3 = (byte)(GXutil.lval( GXutil.substring( A1152FacDiaPag, 5, 2))) ;
         AV36INVto10 = (byte)(GXutil.Int( AV23NumVto/ (double) (10))) ;
         AV37INVto100 = (byte)(GXutil.Int( AV23NumVto/ (double) (100))) ;
         AV62NP1Mes = (byte)(0) ;
         AV63NP2Mes = (byte)(0) ;
         AV64NP3Mes = (byte)(0) ;
         AV65NP4Mes = (byte)(0) ;
         if ( ! (0==AV27NoPag1) && ! (0==AV28NoPag2) && ! (0==AV93Desp1) )
         {
            AV58NP1Dia = (byte)(GXutil.Int( AV27NoPag1/ (double) (100))) ;
            AV59NP2Dia = (byte)(GXutil.Int( AV28NoPag2/ (double) (100))) ;
            AV62NP1Mes = (byte)(AV27NoPag1-(AV58NP1Dia*100)) ;
            AV63NP2Mes = (byte)(AV28NoPag2-(AV59NP2Dia*100)) ;
            AV66Desp1Dia = (byte)(GXutil.Int( AV93Desp1/ (double) (100))) ;
            AV68Desp1Mes = (byte)(AV93Desp1-(AV66Desp1Dia*100)) ;
         }
         if ( ! (0==AV29NoPag3) && ! (0==AV30NoPag4) && ! (0==AV92Desp2) )
         {
            AV60NP3Dia = (byte)(GXutil.Int( AV29NoPag3/ (double) (100))) ;
            AV61NP4Dia = (byte)(GXutil.Int( AV30NoPag4/ (double) (100))) ;
            AV64NP3Mes = (byte)(AV29NoPag3-(AV60NP3Dia*100)) ;
            AV65NP4Mes = (byte)(AV30NoPag4-(AV61NP4Dia*100)) ;
            AV67Desp2Dia = (byte)(GXutil.Int( AV92Desp2/ (double) (100))) ;
            AV69Desp2Mes = (byte)(AV92Desp2-(AV67Desp2Dia*100)) ;
         }
         AV36INVto10 = (byte)(GXutil.Int( AV23NumVto/ (double) (10))) ;
         AV37INVto100 = (byte)(GXutil.Int( AV23NumVto/ (double) (100))) ;
         if ( AV37INVto100 == 0 )
         {
            AV31DConta = httpContext.getMessage( "S", "") ;
         }
         else
         {
            AV31DConta = httpContext.getMessage( "N", "") ;
         }
         if ( ( AV36INVto10 - ( AV37INVto100 * 10 ) ) == 1 )
         {
            AV38DiaSem = httpContext.getMessage( "S", "") ;
            AV50Dia1 = (byte)(0) ;
            AV51Dia2 = (byte)(0) ;
            AV52Dia3 = (byte)(0) ;
            AV53Sem1 = (byte)(0) ;
            AV54Sem2 = (byte)(0) ;
            AV55Sem3 = (byte)(0) ;
            if ( ! (0==AV24DiaP1) )
            {
               AV53Sem1 = (byte)(GXutil.Int( AV24DiaP1/ (double) (10))) ;
               AV50Dia1 = (byte)(AV24DiaP1-(10*AV53Sem1)) ;
            }
            if ( ! (0==AV25DiaP2) )
            {
               AV54Sem2 = (byte)(GXutil.Int( AV25DiaP2/ (double) (10))) ;
               AV51Dia2 = (byte)(AV25DiaP2-(10*AV54Sem2)) ;
            }
            if ( ! (0==AV26DiaP3) )
            {
               AV55Sem3 = (byte)(GXutil.Int( AV26DiaP3/ (double) (10))) ;
               AV52Dia3 = (byte)(AV26DiaP3-(10*AV55Sem3)) ;
            }
         }
         else
         {
            AV38DiaSem = httpContext.getMessage( "N", "") ;
            if ( ( AV36INVto10 - ( AV37INVto100 * 10 ) ) == 2 )
            {
               AV39FinMes = httpContext.getMessage( "S", "") ;
            }
            else
            {
               AV39FinMes = httpContext.getMessage( "N", "") ;
            }
         }
         AV106Nvtos = (byte)(((AV106Nvtos==0) ? 1 : AV106Nvtos)) ;
         if ( AV33NumEfe == 0 )
         {
            AV33NumEfe = (byte)(1) ;
         }
         if ( ( GXutil.len( AV84Period) == 2 ) || ( GXutil.len( AV84Period) == 3 ) )
         {
            AV94Period1 = AV84Period ;
            AV84Period = GXutil.rtrim( AV94Period1) ;
            AV84Period = GXutil.trim( AV84Period) + "00" ;
            AV89Div = (short)(100) ;
         }
         else
         {
            if ( GXutil.len( AV84Period) == 5 )
            {
               AV89Div = (short)(1000) ;
               if ( GXutil.strcmp(GXutil.substring( AV84Period, 3, 1), "0") == 0 )
               {
                  AV89Div = (short)(100) ;
               }
            }
            else
            {
               AV89Div = (short)(100) ;
            }
         }
         AV32Antes = (short)(GXutil.Int( DecimalUtil.decToDouble(CommonUtil.decimalVal( AV84Period, ".").divide(DecimalUtil.doubleToDec(AV89Div), 18, java.math.RoundingMode.DOWN)))) ;
         AV34Entre = (byte)(GXutil.lval( AV84Period)-(AV89Div*AV32Antes)) ;
         AV78FechaFra = A436FacFch ;
         if ( GXutil.strcmp(AV31DConta, httpContext.getMessage( "S", "")) == 0 )
         {
            AV75AntesMes = (byte)(GXutil.Int( AV32Antes/ (double) (30))) ;
            AV76AntesDias = (byte)(AV32Antes-(30*AV75AntesMes)) ;
            AV41Fecha = GXutil.addmth( AV78FechaFra, AV75AntesMes) ;
            AV41Fecha = GXutil.dadd(AV41Fecha,+((int)(AV76AntesDias))) ;
            AV43EntreMes = (byte)(GXutil.Int( AV34Entre/ (double) (30))) ;
            AV44EntreDias = (byte)(AV34Entre-(30*AV43EntreMes)) ;
            if ( GXutil.dateCompare(GXutil.resetTime(GXutil.eomdate( AV78FechaFra)), GXutil.resetTime(AV78FechaFra)) )
            {
               if ( GXutil.day( AV78FechaFra) > 30 )
               {
                  AV78FechaFra = GXutil.dadd(AV78FechaFra,-(1)) ;
               }
            }
         }
         else
         {
            AV79VtoFinMes = httpContext.getMessage( "N", "") ;
            AV41Fecha = GXutil.dadd(AV78FechaFra,+((int)(AV32Antes))) ;
            AV75AntesMes = (byte)(0) ;
            AV76AntesDias = (byte)(AV32Antes) ;
            AV43EntreMes = (byte)(0) ;
            AV44EntreDias = AV34Entre ;
         }
         AV35Linea = (byte)(0) ;
         if ( A3915EmpNumDec == 0 )
         {
            AV18import = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(A455FacTot.divide(DecimalUtil.doubleToDec(AV33NumEfe), 18, java.math.RoundingMode.DOWN)))) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               AV18import = GXutil.roundDecimal( A455FacTot.divide(DecimalUtil.doubleToDec(AV33NumEfe), 18, java.math.RoundingMode.DOWN), 2) ;
            }
         }
         AV40Total = DecimalUtil.doubleToDec(0) ;
         AV91FacVtoLin = (byte)(1) ;
         AV109Nvtos2 = (byte)(1) ;
         while ( AV33NumEfe > 0 )
         {
            AV35Linea = (byte)(AV35Linea+1) ;
            if ( GXutil.strcmp(AV39FinMes, httpContext.getMessage( "S", "")) == 0 )
            {
               AV42PrvDat = GXutil.eomdate( AV41Fecha) ;
            }
            else
            {
               if ( GXutil.strcmp(AV38DiaSem, httpContext.getMessage( "S", "")) == 0 )
               {
                  GX_I = 1 ;
                  while ( GX_I <= 3 )
                  {
                     AV45Dia[GX_I-1] = GXutil.nullDate() ;
                     GX_I = (int)(GX_I+1) ;
                  }
                  AV56DatIniMes = localUtil.ymdtod( GXutil.year( AV41Fecha), GXutil.month( AV41Fecha), 1) ;
                  if ( ! (0==AV50Dia1) )
                  {
                     AV77DowIniMes = GXutil.dow( AV56DatIniMes) ;
                     if ( AV77DowIniMes == 1 )
                     {
                        AV77DowIniMes = (byte)(7) ;
                     }
                     else
                     {
                        AV77DowIniMes = (byte)(AV77DowIniMes-1) ;
                     }
                     if ( AV77DowIniMes > AV50Dia1 )
                     {
                        AV45Dia[1-1] = GXutil.dadd(AV56DatIniMes,+((7-AV77DowIniMes+AV50Dia1+(7*(AV53Sem1-1))))) ;
                     }
                     else
                     {
                        AV45Dia[1-1] = GXutil.dadd(AV56DatIniMes,+((AV50Dia1-AV77DowIniMes+(7*(AV53Sem1-1))))) ;
                     }
                     if ( GXutil.day( AV41Fecha) > GXutil.day( AV45Dia[1-1]) )
                     {
                        AV56DatIniMes = GXutil.addmth( AV56DatIniMes, (short)(1)) ;
                        AV77DowIniMes = GXutil.dow( AV56DatIniMes) ;
                        if ( AV77DowIniMes == 1 )
                        {
                           AV77DowIniMes = (byte)(7) ;
                        }
                        else
                        {
                           AV77DowIniMes = (byte)(AV77DowIniMes-1) ;
                        }
                        if ( AV77DowIniMes > AV50Dia1 )
                        {
                           AV45Dia[1-1] = GXutil.dadd(AV56DatIniMes,+((7-AV77DowIniMes+AV50Dia1+(7*(AV53Sem1-1))))) ;
                        }
                        else
                        {
                           AV45Dia[1-1] = GXutil.dadd(AV56DatIniMes,+((AV50Dia1-AV77DowIniMes+(7*(AV53Sem1-1))))) ;
                        }
                     }
                  }
               }
               else
               {
                  if ( GXutil.strcmp(AV31DConta, httpContext.getMessage( "S", "")) == 0 )
                  {
                     if ( ! (0==AV24DiaP1) )
                     {
                        if ( AV24DiaP1 >= 30 )
                        {
                           AV45Dia[1-1] = GXutil.eomdate( localUtil.ymdtod( GXutil.year( AV41Fecha), GXutil.month( AV41Fecha), 1)) ;
                           if ( ( GXutil.day( AV45Dia[1-1]) > 30 ) && ( AV24DiaP1 == 30 ) )
                           {
                              AV45Dia[1-1] = localUtil.ymdtod( GXutil.year( AV41Fecha), GXutil.month( AV41Fecha), 30) ;
                           }
                        }
                        else
                        {
                           AV45Dia[1-1] = localUtil.ymdtod( GXutil.year( AV41Fecha), GXutil.month( AV41Fecha), AV24DiaP1) ;
                           if ( GXutil.resetTime(AV41Fecha).after( GXutil.resetTime( AV45Dia[1-1] )) )
                           {
                              AV45Dia[1-1] = GXutil.addmth( AV45Dia[1-1], (short)(1)) ;
                           }
                        }
                     }
                     if ( ! (0==AV25DiaP2) )
                     {
                        if ( AV25DiaP2 >= 30 )
                        {
                           AV45Dia[2-1] = GXutil.eomdate( localUtil.ymdtod( GXutil.year( AV41Fecha), GXutil.month( AV41Fecha), 1)) ;
                           if ( ( GXutil.day( AV45Dia[2-1]) > 30 ) && ( AV25DiaP2 == 30 ) )
                           {
                              AV45Dia[2-1] = localUtil.ymdtod( GXutil.year( AV41Fecha), GXutil.month( AV41Fecha), 30) ;
                           }
                        }
                        else
                        {
                           AV45Dia[2-1] = localUtil.ymdtod( GXutil.year( AV41Fecha), GXutil.month( AV41Fecha), AV25DiaP2) ;
                           if ( GXutil.resetTime(AV41Fecha).after( GXutil.resetTime( AV45Dia[2-1] )) )
                           {
                              AV45Dia[2-1] = GXutil.addmth( AV45Dia[2-1], (short)(1)) ;
                           }
                        }
                     }
                     if ( ! (0==AV26DiaP3) )
                     {
                        if ( AV26DiaP3 >= 30 )
                        {
                           AV45Dia[3-1] = GXutil.eomdate( localUtil.ymdtod( GXutil.year( AV41Fecha), GXutil.month( AV41Fecha), 1)) ;
                           if ( ( GXutil.day( AV45Dia[3-1]) > 30 ) && ( AV24DiaP1 == 30 ) )
                           {
                              AV45Dia[3-1] = localUtil.ymdtod( GXutil.year( AV41Fecha), GXutil.month( AV41Fecha), 30) ;
                           }
                        }
                        else
                        {
                           AV45Dia[3-1] = localUtil.ymdtod( GXutil.year( AV41Fecha), GXutil.month( AV41Fecha), AV26DiaP3) ;
                           if ( GXutil.resetTime(AV41Fecha).after( GXutil.resetTime( AV45Dia[3-1] )) )
                           {
                              AV45Dia[3-1] = GXutil.addmth( AV45Dia[3-1], (short)(1)) ;
                           }
                        }
                     }
                  }
                  else
                  {
                     if ( ! (0==AV24DiaP1) )
                     {
                        AV45Dia[1-1] = localUtil.ymdtod( GXutil.year( AV41Fecha), GXutil.month( AV41Fecha), AV24DiaP1) ;
                        if ( GXutil.resetTime(AV41Fecha).after( GXutil.resetTime( AV45Dia[1-1] )) )
                        {
                           AV45Dia[1-1] = GXutil.addmth( AV45Dia[1-1], (short)(1)) ;
                        }
                     }
                     if ( ! (0==AV25DiaP2) )
                     {
                        AV45Dia[2-1] = localUtil.ymdtod( GXutil.year( AV41Fecha), GXutil.month( AV41Fecha), AV25DiaP2) ;
                        if ( GXutil.resetTime(AV41Fecha).after( GXutil.resetTime( AV45Dia[2-1] )) )
                        {
                           AV45Dia[2-1] = GXutil.addmth( AV45Dia[2-1], (short)(1)) ;
                        }
                     }
                     if ( ! (0==AV26DiaP3) )
                     {
                        AV45Dia[3-1] = localUtil.ymdtod( GXutil.year( AV41Fecha), GXutil.month( AV41Fecha), AV26DiaP3) ;
                        if ( GXutil.resetTime(AV41Fecha).after( GXutil.resetTime( AV45Dia[3-1] )) )
                        {
                           AV45Dia[3-1] = GXutil.addmth( AV45Dia[3-1], (short)(1)) ;
                        }
                     }
                  }
               }
               /* Execute user subroutine: 'DATES' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            /* Execute user subroutine: 'VACAC' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /*
               INSERT RECORD ON TABLE TXPFACVTO

            */
            A956FacVtoLin = AV91FacVtoLin ;
            A957FacVtoFch = AV42PrvDat ;
            n957FacVtoFch = false ;
            if ( ( AV105Imppor.doubleValue() == 1 ) && ( AV106Nvtos == 2 ) && ( AV101CliPor1.doubleValue() > 0 ) && ( AV102CliPor2 > 0 ) )
            {
               if ( AV109Nvtos2 == 1 )
               {
                  A958FacVtoImp = GXutil.roundDecimal( (A455FacTot.multiply(AV101CliPor1)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
                  n958FacVtoImp = false ;
               }
               else
               {
                  A958FacVtoImp = GXutil.roundDecimal( (A455FacTot.multiply(DecimalUtil.doubleToDec(AV102CliPor2))).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
                  n958FacVtoImp = false ;
               }
            }
            else
            {
               if ( AV33NumEfe == 1 )
               {
                  A958FacVtoImp = A455FacTot.subtract(AV40Total) ;
                  n958FacVtoImp = false ;
               }
               else
               {
                  A958FacVtoImp = AV18import ;
                  n958FacVtoImp = false ;
                  AV40Total = AV40Total.add(AV18import) ;
               }
            }
            /* Using cursor P00B25 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Byte.valueOf(A956FacVtoLin), Boolean.valueOf(n957FacVtoFch), A957FacVtoFch, Boolean.valueOf(n958FacVtoImp), A958FacVtoImp});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFACVTO");
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
            /* End Insert */
            AV33NumEfe = (byte)(AV33NumEfe-1) ;
            AV75AntesMes = (byte)(AV75AntesMes+AV43EntreMes) ;
            AV76AntesDias = (byte)(AV76AntesDias+AV44EntreDias) ;
            AV41Fecha = GXutil.dadd(GXutil.addmth( AV78FechaFra, AV75AntesMes),+((int)(AV76AntesDias))) ;
            AV91FacVtoLin = (byte)(AV91FacVtoLin+1) ;
            AV109Nvtos2 = (byte)(AV109Nvtos2+1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'DATES' Routine */
      returnInSub = false ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV45Dia[1-1])) )
      {
         AV47DiaMin = AV45Dia[1-1] ;
         if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV45Dia[2-1])) )
         {
            if ( GXutil.resetTime(AV47DiaMin).after( GXutil.resetTime( AV45Dia[2-1] )) )
            {
               AV47DiaMin = AV45Dia[2-1] ;
            }
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV45Dia[3-1])) )
            {
               if ( GXutil.resetTime(AV47DiaMin).after( GXutil.resetTime( AV45Dia[3-1] )) )
               {
                  AV47DiaMin = AV45Dia[3-1] ;
               }
            }
         }
      }
      else
      {
         AV47DiaMin = AV41Fecha ;
      }
      AV42PrvDat = AV47DiaMin ;
   }

   public void S121( )
   {
      /* 'VACAC' Routine */
      returnInSub = false ;
      if ( ! (0==AV62NP1Mes) )
      {
         AV70LInfV1 = localUtil.ymdtod( GXutil.year( AV42PrvDat), AV62NP1Mes, AV58NP1Dia) ;
         if ( AV63NP2Mes < AV62NP1Mes )
         {
            AV72LSupV1 = localUtil.ymdtod( GXutil.year( AV42PrvDat)+1, AV63NP2Mes, AV59NP2Dia) ;
         }
         else
         {
            AV72LSupV1 = localUtil.ymdtod( GXutil.year( AV42PrvDat), AV63NP2Mes, AV59NP2Dia) ;
         }
      }
      if ( ! (0==AV64NP3Mes) )
      {
         AV71LInfV2 = localUtil.ymdtod( GXutil.year( AV42PrvDat), AV64NP3Mes, AV60NP3Dia) ;
         if ( AV65NP4Mes < AV64NP3Mes )
         {
            AV73LSupV2 = localUtil.ymdtod( GXutil.year( AV42PrvDat)+1, AV65NP4Mes, AV61NP4Dia) ;
         }
         else
         {
            AV73LSupV2 = localUtil.ymdtod( GXutil.year( AV42PrvDat), AV65NP4Mes, AV61NP4Dia) ;
         }
      }
      if ( (( GXutil.resetTime(AV42PrvDat).after( GXutil.resetTime( AV70LInfV1 )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV42PrvDat), GXutil.resetTime(AV70LInfV1)) )) && (( GXutil.resetTime(AV42PrvDat).before( GXutil.resetTime( AV72LSupV1 )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV42PrvDat), GXutil.resetTime(AV72LSupV1)) )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70LInfV1)) )
      {
         AV42PrvDat = localUtil.ymdtod( GXutil.year( AV72LSupV1), AV68Desp1Mes, AV66Desp1Dia) ;
      }
      if ( (( GXutil.resetTime(AV42PrvDat).after( GXutil.resetTime( AV71LInfV2 )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV42PrvDat), GXutil.resetTime(AV71LInfV2)) )) && (( GXutil.resetTime(AV42PrvDat).before( GXutil.resetTime( AV73LSupV2 )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV42PrvDat), GXutil.resetTime(AV73LSupV2)) )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71LInfV2)) )
      {
         AV42PrvDat = localUtil.ymdtod( GXutil.year( AV73LSupV2), AV69Desp2Mes, AV67Desp2Dia) ;
      }
   }

   public void S131( )
   {
      /* 'CLIFPG' Routine */
      returnInSub = false ;
      AV101CliPor1 = DecimalUtil.doubleToDec(0) ;
      AV102CliPor2 = (short)(0) ;
      /* Using cursor P00B26 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV99clicod), AV100FacPri});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A297CliPri = P00B26_A297CliPri[0] ;
         A252CliCod = P00B26_A252CliCod[0] ;
         A14421Clipor1 = P00B26_A14421Clipor1[0] ;
         A14422Clipor2 = P00B26_A14422Clipor2[0] ;
         AV101CliPor1 = A14421Clipor1 ;
         AV102CliPor2 = A14422Clipor2 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pcalvto");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV105Imppor = DecimalUtil.ZERO ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P00B23_A396EmprCod = new String[] {""} ;
      P00B23_A430FacCod = new int[1] ;
      P00B23_A1150FacNumVto = new byte[1] ;
      P00B23_A252CliCod = new int[1] ;
      P00B23_A450FacPri = new String[] {""} ;
      P00B23_A1151FacPer = new String[] {""} ;
      P00B23_A277CliIniVac = new String[] {""} ;
      P00B23_A276CliFinVac = new String[] {""} ;
      P00B23_A258CliDes = new String[] {""} ;
      P00B23_A1152FacDiaPag = new String[] {""} ;
      P00B23_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P00B23_A3915EmpNumDec = new byte[1] ;
      P00B23_n3915EmpNumDec = new boolean[] {false} ;
      P00B23_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B23_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B23_n8346FacRecI = new boolean[] {false} ;
      P00B23_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B23_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B23_A443FacIVAPor = new byte[1] ;
      P00B23_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B23_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B23_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B23_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B23_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B23_A7209Colombia = new byte[1] ;
      P00B23_n7209Colombia = new boolean[] {false} ;
      P00B23_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B23_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A450FacPri = "" ;
      A1151FacPer = "" ;
      A277CliIniVac = "" ;
      A276CliFinVac = "" ;
      A258CliDes = "" ;
      A1152FacDiaPag = "" ;
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
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
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
      AV100FacPri = "" ;
      AV84Period = "" ;
      AV31DConta = "" ;
      AV38DiaSem = "" ;
      AV39FinMes = "" ;
      AV94Period1 = "" ;
      AV78FechaFra = GXutil.nullDate() ;
      AV41Fecha = GXutil.nullDate() ;
      AV79VtoFinMes = "" ;
      AV18import = DecimalUtil.ZERO ;
      AV40Total = DecimalUtil.ZERO ;
      AV42PrvDat = GXutil.nullDate() ;
      AV45Dia = new java.util.Date[3] ;
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV45Dia[GX_I-1] = GXutil.nullDate() ;
         GX_I = (int)(GX_I+1) ;
      }
      AV56DatIniMes = GXutil.nullDate() ;
      A957FacVtoFch = GXutil.nullDate() ;
      AV101CliPor1 = DecimalUtil.ZERO ;
      A958FacVtoImp = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      AV47DiaMin = GXutil.nullDate() ;
      AV70LInfV1 = GXutil.nullDate() ;
      AV72LSupV1 = GXutil.nullDate() ;
      AV71LInfV2 = GXutil.nullDate() ;
      AV73LSupV2 = GXutil.nullDate() ;
      P00B26_A396EmprCod = new String[] {""} ;
      P00B26_A297CliPri = new String[] {""} ;
      P00B26_A252CliCod = new int[1] ;
      P00B26_A14421Clipor1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00B26_A14422Clipor2 = new short[1] ;
      A297CliPri = "" ;
      A14421Clipor1 = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcalvto__default(),
         new Object[] {
             new Object[] {
            P00B23_A396EmprCod, P00B23_A430FacCod, P00B23_A1150FacNumVto, P00B23_A252CliCod, P00B23_A450FacPri, P00B23_A1151FacPer, P00B23_A277CliIniVac, P00B23_A276CliFinVac, P00B23_A258CliDes, P00B23_A1152FacDiaPag,
            P00B23_A436FacFch, P00B23_A3915EmpNumDec, P00B23_n3915EmpNumDec, P00B23_A11513FacRecIca, P00B23_A8346FacRecI, P00B23_n8346FacRecI, P00B23_A7212FacRect, P00B23_A453FacRECPor, P00B23_A443FacIVAPor, P00B23_A14224FacCostFac,
            P00B23_A14223FacCostKgs, P00B23_A14222FacCostMts, P00B23_A434FacDtoPP, P00B23_A433FacDtoGen, P00B23_A7209Colombia, P00B23_n7209Colombia, P00B23_A14219FacEnergia, P00B23_A3918FacImpTot1
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00B26_A396EmprCod, P00B26_A297CliPri, P00B26_A252CliCod, P00B26_A14421Clipor1, P00B26_A14422Clipor2
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV106Nvtos ;
   private byte A1150FacNumVto ;
   private byte A3915EmpNumDec ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private byte AV33NumEfe ;
   private byte AV24DiaP1 ;
   private byte AV25DiaP2 ;
   private byte AV26DiaP3 ;
   private byte AV36INVto10 ;
   private byte AV37INVto100 ;
   private byte AV62NP1Mes ;
   private byte AV63NP2Mes ;
   private byte AV64NP3Mes ;
   private byte AV65NP4Mes ;
   private byte AV58NP1Dia ;
   private byte AV59NP2Dia ;
   private byte AV66Desp1Dia ;
   private byte AV68Desp1Mes ;
   private byte AV60NP3Dia ;
   private byte AV61NP4Dia ;
   private byte AV67Desp2Dia ;
   private byte AV69Desp2Mes ;
   private byte AV50Dia1 ;
   private byte AV51Dia2 ;
   private byte AV52Dia3 ;
   private byte AV53Sem1 ;
   private byte AV54Sem2 ;
   private byte AV55Sem3 ;
   private byte AV34Entre ;
   private byte AV75AntesMes ;
   private byte AV76AntesDias ;
   private byte AV43EntreMes ;
   private byte AV44EntreDias ;
   private byte AV35Linea ;
   private byte AV91FacVtoLin ;
   private byte AV109Nvtos2 ;
   private byte AV77DowIniMes ;
   private byte A956FacVtoLin ;
   private short AV92Desp2 ;
   private short AV93Desp1 ;
   private short AV89Div ;
   private short AV32Antes ;
   private short AV102CliPor2 ;
   private short Gx_err ;
   private short A14422Clipor2 ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int AV23NumVto ;
   private int AV99clicod ;
   private int AV29NoPag3 ;
   private int AV30NoPag4 ;
   private int AV27NoPag1 ;
   private int AV28NoPag2 ;
   private int GX_I ;
   private int GX_INS129 ;
   private java.math.BigDecimal AV105Imppor ;
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
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
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
   private java.math.BigDecimal AV18import ;
   private java.math.BigDecimal AV40Total ;
   private java.math.BigDecimal AV101CliPor1 ;
   private java.math.BigDecimal A958FacVtoImp ;
   private java.math.BigDecimal A14421Clipor1 ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A450FacPri ;
   private String A1151FacPer ;
   private String A277CliIniVac ;
   private String A276CliFinVac ;
   private String A258CliDes ;
   private String A1152FacDiaPag ;
   private String AV100FacPri ;
   private String AV84Period ;
   private String AV31DConta ;
   private String AV38DiaSem ;
   private String AV39FinMes ;
   private String AV94Period1 ;
   private String AV79VtoFinMes ;
   private String Gx_emsg ;
   private String A297CliPri ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV78FechaFra ;
   private java.util.Date AV41Fecha ;
   private java.util.Date AV42PrvDat ;
   private java.util.Date AV45Dia[] ;
   private java.util.Date AV56DatIniMes ;
   private java.util.Date A957FacVtoFch ;
   private java.util.Date AV47DiaMin ;
   private java.util.Date AV70LInfV1 ;
   private java.util.Date AV72LSupV1 ;
   private java.util.Date AV71LInfV2 ;
   private java.util.Date AV73LSupV2 ;
   private boolean n3915EmpNumDec ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private boolean returnInSub ;
   private boolean n957FacVtoFch ;
   private boolean n958FacVtoImp ;
   private IDataStoreProvider pr_default ;
   private String[] P00B23_A396EmprCod ;
   private int[] P00B23_A430FacCod ;
   private byte[] P00B23_A1150FacNumVto ;
   private int[] P00B23_A252CliCod ;
   private String[] P00B23_A450FacPri ;
   private String[] P00B23_A1151FacPer ;
   private String[] P00B23_A277CliIniVac ;
   private String[] P00B23_A276CliFinVac ;
   private String[] P00B23_A258CliDes ;
   private String[] P00B23_A1152FacDiaPag ;
   private java.util.Date[] P00B23_A436FacFch ;
   private byte[] P00B23_A3915EmpNumDec ;
   private boolean[] P00B23_n3915EmpNumDec ;
   private java.math.BigDecimal[] P00B23_A11513FacRecIca ;
   private java.math.BigDecimal[] P00B23_A8346FacRecI ;
   private boolean[] P00B23_n8346FacRecI ;
   private java.math.BigDecimal[] P00B23_A7212FacRect ;
   private java.math.BigDecimal[] P00B23_A453FacRECPor ;
   private byte[] P00B23_A443FacIVAPor ;
   private java.math.BigDecimal[] P00B23_A14224FacCostFac ;
   private java.math.BigDecimal[] P00B23_A14223FacCostKgs ;
   private java.math.BigDecimal[] P00B23_A14222FacCostMts ;
   private java.math.BigDecimal[] P00B23_A434FacDtoPP ;
   private java.math.BigDecimal[] P00B23_A433FacDtoGen ;
   private byte[] P00B23_A7209Colombia ;
   private boolean[] P00B23_n7209Colombia ;
   private java.math.BigDecimal[] P00B23_A14219FacEnergia ;
   private java.math.BigDecimal[] P00B23_A3918FacImpTot1 ;
   private String[] P00B26_A396EmprCod ;
   private String[] P00B26_A297CliPri ;
   private int[] P00B26_A252CliCod ;
   private java.math.BigDecimal[] P00B26_A14421Clipor1 ;
   private short[] P00B26_A14422Clipor2 ;
}

final  class pcalvto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00B23", "SELECT T1.EmprCod, T1.FacCod, T1.FacNumVto, T1.CliCod, T1.FacPri, T1.FacPer, T3.CliIniVac, T3.CliFinVac, T3.CliDes, T1.FacDiaPag, T1.FacFch, T2.EmpNumDec, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor, T1.FacIVAPor, T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoPP, T1.FacDtoGen, T2.Colombia, T1.FacEnergia, COALESCE( T4.FacImpTot1, 0) AS FacImpTot1 FROM (((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T4 ON T4.EmprCod = T1.EmprCod AND T4.FacCod = T1.FacCod) WHERE T1.EmprCod = ? and T1.FacCod = ? ORDER BY T1.EmprCod, T1.FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00B24", "DELETE FROM TXPFACVTO  WHERE EmprCod = ? and FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFACVTO")
         ,new UpdateCursor("P00B25", "INSERT INTO TXPFACVTO(EmprCod, FacCod, FacVtoLin, FacVtoFch, FacVtoImp, FacVtoTip) VALUES(?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFACVTO")
         ,new ForEachCursor("P00B26", "SELECT EmprCod, CliPri, CliCod, Clipor1, Clipor2 FROM TXPCLIFPG WHERE EmprCod = ? and CliCod = ? and CliPri = ? ORDER BY EmprCod, CliCod, CliPri ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               ((String[]) buf[7])[0] = rslt.getString(8, 4);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,3);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
               ((byte[]) buf[24])[0] = rslt.getByte(23);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(25,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

