package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfiritems extends GXProcedure
{
   public pfiritems( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfiritems.class ), "" );
   }

   public pfiritems( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 )
   {
      pfiritems.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.util.Date[] aP2 )
   {
      pfiritems.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfiritems.this.A430FacCod = aP1[0];
      this.aP1 = aP1;
      pfiritems.this.AV300FacHor = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV297Moda21 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      pfiritems.this.GXt_int1 = GXv_int2[0] ;
      AV297Moda21 = GXt_int1 ;
      GXt_int1 = AV303Tintex ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int2) ;
      pfiritems.this.GXt_int1 = GXv_int2[0] ;
      AV303Tintex = GXt_int1 ;
      GXt_int1 = AV312crearcsv ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRCSV", ""), GXv_int2) ;
      pfiritems.this.GXt_int1 = GXv_int2[0] ;
      AV312crearcsv = GXt_int1 ;
      /* Using cursor P03S72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), A396EmprCod, Integer.valueOf(A430FacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9643FacLiq1 = P03S72_A9643FacLiq1[0] ;
         A9644FacLiq2 = P03S72_A9644FacLiq2[0] ;
         A9645FacIva1 = P03S72_A9645FacIva1[0] ;
         A9646FacTot1 = P03S72_A9646FacTot1[0] ;
         A11513FacRecIca = P03S72_A11513FacRecIca[0] ;
         A8346FacRecI = P03S72_A8346FacRecI[0] ;
         n8346FacRecI = P03S72_n8346FacRecI[0] ;
         A7212FacRect = P03S72_A7212FacRect[0] ;
         A453FacRECPor = P03S72_A453FacRECPor[0] ;
         A14224FacCostFac = P03S72_A14224FacCostFac[0] ;
         A14223FacCostKgs = P03S72_A14223FacCostKgs[0] ;
         A14222FacCostMts = P03S72_A14222FacCostMts[0] ;
         A443FacIVAPor = P03S72_A443FacIVAPor[0] ;
         A433FacDtoGen = P03S72_A433FacDtoGen[0] ;
         A434FacDtoPP = P03S72_A434FacDtoPP[0] ;
         A14219FacEnergia = P03S72_A14219FacEnergia[0] ;
         /* Using cursor P03S73 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         A7209Colombia = P03S73_A7209Colombia[0] ;
         n7209Colombia = P03S73_n7209Colombia[0] ;
         /* Using cursor P03S75 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         if ( (pr_default.getStatus(2) != 101) )
         {
            A3918FacImpTot1 = P03S75_A3918FacImpTot1[0] ;
         }
         else
         {
            A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
         }
         A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
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
         A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
         A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
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
         A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
         A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
         AV296Facdtopp = A434FacDtoPP ;
         AV255FacDtoGen = A433FacDtoGen ;
         if ( AV297Moda21 == 1 )
         {
            if ( ( AV255FacDtoGen.doubleValue() > 0 ) && ( AV296Facdtopp.doubleValue() == 0 ) )
            {
               AV296Facdtopp = AV255FacDtoGen ;
            }
         }
         AV212FacImpTot = A441FacImpTot ;
         AV213FacImpPP = A440FacImpPP ;
         AV254FacImpGen = A439FacImpGen ;
         AV214FacIvaImp = A442FacIVAImp ;
         AV215FacTot = A455FacTot ;
         AV225FacBasImp = A429FacBasImp ;
         AV253FacIvaPor = A443FacIVAPor ;
         /* Using cursor P03S76 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A3397FacFasCod = P03S76_A3397FacFasCod[0] ;
            A432FacDsc = P03S76_A432FacDsc[0] ;
            A454FacSer = P03S76_A454FacSer[0] ;
            A428FacAlbTip = P03S76_A428FacAlbTip[0] ;
            A449FacPreMts = P03S76_A449FacPreMts[0] ;
            A447FacMts = P03S76_A447FacMts[0] ;
            A9650FacPMdto = P03S76_A9650FacPMdto[0] ;
            A9649FacPKDto = P03S76_A9649FacPKDto[0] ;
            A9648FacDtoL = P03S76_A9648FacDtoL[0] ;
            A9647FacImpdto = P03S76_A9647FacImpdto[0] ;
            A9651FacImpd = P03S76_A9651FacImpd[0] ;
            A448FacPreKgs = P03S76_A448FacPreKgs[0] ;
            A444FacKgs = P03S76_A444FacKgs[0] ;
            A12198FacPreUnd = P03S76_A12198FacPreUnd[0] ;
            A12197FacUnds = P03S76_A12197FacUnds[0] ;
            A9708FacDscII = P03S76_A9708FacDscII[0] ;
            A3898FacPreKgsA = P03S76_A3898FacPreKgsA[0] ;
            A5353FacImpMan = P03S76_A5353FacImpMan[0] ;
            A446FacLin = P03S76_A446FacLin[0] ;
            if ( ( ( A428FacAlbTip == 2 ) ) || ( ( A428FacAlbTip == 0 ) && ( GXutil.strcmp(A454FacSer, httpContext.getMessage( "RECTIFICACION", "")) == 0 ) ) )
            {
               if ( A449FacPreMts.doubleValue() != 0 )
               {
                  AV295Aux5 = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                  AV291Aux1 = AV295Aux5.subtract((AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                  AV292Aux2 = AV291Aux1 ;
                  AV293Aux3 = DecimalUtil.doubleToDec(0) ;
                  if ( A447FacMts.doubleValue() != 0 )
                  {
                     AV293Aux3 = AV292Aux2.divide(A447FacMts, 18, java.math.RoundingMode.DOWN) ;
                  }
                  A9650FacPMdto = AV293Aux3 ;
                  A9649FacPKDto = DecimalUtil.doubleToDec(0) ;
                  A9648FacDtoL = AV296Facdtopp ;
                  A9647FacImpdto = AV293Aux3.multiply(A447FacMts) ;
                  AV290Aux0 = AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  A9651FacImpd = AV290Aux0 ;
                  AV294Aux4 = AV294Aux4.add((AV293Aux3.multiply(A447FacMts))) ;
               }
               if ( A448FacPreKgs.doubleValue() != 0 )
               {
                  AV295Aux5 = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                  AV291Aux1 = AV295Aux5.subtract((AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                  AV292Aux2 = AV291Aux1 ;
                  AV293Aux3 = DecimalUtil.doubleToDec(0) ;
                  if ( A444FacKgs.doubleValue() != 0 )
                  {
                     AV293Aux3 = AV292Aux2.divide(A444FacKgs, 18, java.math.RoundingMode.DOWN) ;
                  }
                  A9650FacPMdto = AV293Aux3 ;
                  A9649FacPKDto = DecimalUtil.doubleToDec(0) ;
                  A9648FacDtoL = AV296Facdtopp ;
                  A9647FacImpdto = AV293Aux3.multiply(A444FacKgs) ;
                  AV290Aux0 = AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  A9651FacImpd = AV290Aux0 ;
                  AV294Aux4 = AV294Aux4.add((AV293Aux3.multiply(A444FacKgs))) ;
               }
               if ( A12198FacPreUnd.doubleValue() != 0 )
               {
                  AV295Aux5 = GXutil.roundDecimal( DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd), 2) ;
                  AV291Aux1 = AV295Aux5.subtract((AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                  AV292Aux2 = AV291Aux1 ;
                  AV293Aux3 = DecimalUtil.doubleToDec(0) ;
                  if ( A12197FacUnds != 0 )
                  {
                     AV293Aux3 = AV292Aux2.divide(DecimalUtil.doubleToDec(A12197FacUnds), 18, java.math.RoundingMode.DOWN) ;
                  }
                  A9650FacPMdto = AV293Aux3 ;
                  A9649FacPKDto = DecimalUtil.doubleToDec(0) ;
                  A9648FacDtoL = AV296Facdtopp ;
                  A9647FacImpdto = AV293Aux3.multiply(DecimalUtil.doubleToDec(A12197FacUnds)) ;
                  AV290Aux0 = AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  A9651FacImpd = AV290Aux0 ;
                  AV294Aux4 = AV294Aux4.add((AV293Aux3.multiply(DecimalUtil.doubleToDec(A12197FacUnds)))) ;
               }
               A9708FacDscII = A432FacDsc ;
            }
            if ( A428FacAlbTip == 1 )
            {
               if ( (GXutil.strcmp("", A3397FacFasCod)==0) )
               {
                  if ( GXutil.strcmp(A454FacSer, httpContext.getMessage( "Tubos", "")) != 0 )
                  {
                     if ( AV297Moda21 == 0 )
                     {
                        AV295Aux5 = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                     }
                     else
                     {
                        AV298Aux9 = (A444FacKgs.multiply(A448FacPreKgs)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                        AV295Aux5 = GXutil.roundDecimal( AV298Aux9, 2) ;
                     }
                     AV291Aux1 = AV295Aux5.subtract((AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                     AV290Aux0 = AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                     AV292Aux2 = AV291Aux1 ;
                     AV293Aux3 = DecimalUtil.doubleToDec(0) ;
                     if ( A444FacKgs.doubleValue() > 0 )
                     {
                        AV293Aux3 = AV292Aux2.divide(A444FacKgs, 18, java.math.RoundingMode.DOWN) ;
                     }
                     A9649FacPKDto = AV293Aux3 ;
                     A9650FacPMdto = DecimalUtil.doubleToDec(0) ;
                     A9648FacDtoL = AV296Facdtopp ;
                     A9647FacImpdto = AV293Aux3.multiply(A444FacKgs) ;
                     AV290Aux0 = AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                     A9651FacImpd = AV290Aux0 ;
                     if ( ( A5353FacImpMan.doubleValue() > 0 ) && ( AV297Moda21 == 1 ) )
                     {
                        A9647FacImpdto = A5353FacImpMan.subtract((A5353FacImpMan.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                        A9651FacImpd = A5353FacImpMan.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                     }
                     AV294Aux4 = AV294Aux4.add((AV293Aux3.multiply(A444FacKgs))) ;
                     if ( ( A5353FacImpMan.doubleValue() > 0 ) && ( AV297Moda21 == 1 ) )
                     {
                        AV294Aux4 = AV294Aux4.add((A5353FacImpMan.subtract((A5353FacImpMan.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))) ;
                     }
                     A9708FacDscII = A432FacDsc ;
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                     {
                        if ( AV297Moda21 == 0 )
                        {
                           AV295Aux5 = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                        }
                        else
                        {
                           AV298Aux9 = (A447FacMts.multiply(A449FacPreMts)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                           AV295Aux5 = GXutil.roundDecimal( AV298Aux9, 2) ;
                        }
                        AV291Aux1 = AV295Aux5.subtract((AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                        AV292Aux2 = AV291Aux1 ;
                        AV293Aux3 = DecimalUtil.doubleToDec(0) ;
                        if ( A447FacMts.doubleValue() > 0 )
                        {
                           AV293Aux3 = AV292Aux2.divide(A447FacMts, 18, java.math.RoundingMode.DOWN) ;
                        }
                        A9650FacPMdto = AV293Aux3 ;
                        A9648FacDtoL = AV296Facdtopp ;
                        A9647FacImpdto = A9647FacImpdto.add(((AV293Aux3.multiply(A447FacMts)))) ;
                        AV290Aux0 = AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                        A9651FacImpd = AV290Aux0 ;
                        AV294Aux4 = AV294Aux4.add((AV293Aux3.multiply(A447FacMts))) ;
                     }
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                     {
                        if ( AV297Moda21 == 0 )
                        {
                           AV295Aux5 = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                        }
                        else
                        {
                           AV298Aux9 = (A447FacMts.multiply(A449FacPreMts)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                           AV295Aux5 = GXutil.roundDecimal( AV298Aux9, 2) ;
                        }
                        AV291Aux1 = AV295Aux5.subtract((AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                        AV292Aux2 = AV291Aux1 ;
                        AV293Aux3 = DecimalUtil.doubleToDec(0) ;
                        if ( A447FacMts.doubleValue() > 0 )
                        {
                           AV293Aux3 = AV292Aux2.divide(A447FacMts, 18, java.math.RoundingMode.DOWN) ;
                        }
                        A9650FacPMdto = AV293Aux3 ;
                        A9649FacPKDto = DecimalUtil.doubleToDec(0) ;
                        A9648FacDtoL = AV296Facdtopp ;
                        A9647FacImpdto = AV293Aux3.multiply(A447FacMts) ;
                        AV290Aux0 = AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                        A9651FacImpd = AV290Aux0 ;
                        AV294Aux4 = AV294Aux4.add((AV293Aux3.multiply(A447FacMts))) ;
                        A9708FacDscII = A432FacDsc ;
                     }
                     if ( A12198FacPreUnd.doubleValue() != 0 )
                     {
                        AV295Aux5 = GXutil.roundDecimal( DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd), 2) ;
                        AV291Aux1 = AV295Aux5.subtract((AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                        AV292Aux2 = AV291Aux1 ;
                        AV293Aux3 = DecimalUtil.doubleToDec(0) ;
                        if ( A12197FacUnds > 0 )
                        {
                           AV293Aux3 = AV292Aux2.divide(DecimalUtil.doubleToDec(A12197FacUnds), 18, java.math.RoundingMode.DOWN) ;
                        }
                        A9650FacPMdto = AV293Aux3 ;
                        A9649FacPKDto = DecimalUtil.doubleToDec(0) ;
                        A9648FacDtoL = AV296Facdtopp ;
                        A9647FacImpdto = AV293Aux3.multiply(DecimalUtil.doubleToDec(A12197FacUnds)) ;
                        AV290Aux0 = AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                        A9651FacImpd = AV290Aux0 ;
                        AV294Aux4 = AV294Aux4.add((AV293Aux3.multiply(DecimalUtil.doubleToDec(A12197FacUnds)))) ;
                        A9708FacDscII = AV234FacDsc ;
                     }
                  }
                  if ( GXutil.strcmp(A454FacSer, httpContext.getMessage( "Tubos", "")) == 0 )
                  {
                     if ( AV297Moda21 == 0 )
                     {
                        AV295Aux5 = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                     }
                     else
                     {
                        AV298Aux9 = (A444FacKgs.multiply(A448FacPreKgs)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                        AV295Aux5 = GXutil.roundDecimal( AV298Aux9, 2) ;
                     }
                     AV291Aux1 = AV295Aux5.subtract((AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                     AV292Aux2 = AV291Aux1 ;
                     AV293Aux3 = DecimalUtil.doubleToDec(0) ;
                     if ( A444FacKgs.doubleValue() > 0 )
                     {
                        AV293Aux3 = AV292Aux2.divide(A444FacKgs, 18, java.math.RoundingMode.DOWN) ;
                     }
                     A9650FacPMdto = AV293Aux3 ;
                     A9649FacPKDto = DecimalUtil.doubleToDec(0) ;
                     A9648FacDtoL = AV296Facdtopp ;
                     A9647FacImpdto = AV293Aux3.multiply(A444FacKgs) ;
                     AV290Aux0 = AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                     A9651FacImpd = AV290Aux0 ;
                     AV294Aux4 = AV294Aux4.add((AV293Aux3.multiply(A444FacKgs))) ;
                     A9708FacDscII = A432FacDsc ;
                  }
               }
               else
               {
                  if ( GXutil.strcmp(A3397FacFasCod, httpContext.getMessage( "ZZZZZZZZ", "")) != 0 )
                  {
                     /* Using cursor P03S77 */
                     pr_default.execute(4, new Object[] {A396EmprCod, A3397FacFasCod});
                     while ( (pr_default.getStatus(4) != 101) )
                     {
                        A457FasCod = P03S77_A457FasCod[0] ;
                        AV234FacDsc = A432FacDsc ;
                        /* Exiting from a For First loop. */
                        if (true) break;
                     }
                     pr_default.close(4);
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                     {
                        if ( AV297Moda21 == 0 )
                        {
                           AV295Aux5 = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                        }
                        else
                        {
                           AV298Aux9 = (A444FacKgs.multiply(A448FacPreKgs)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                           AV295Aux5 = GXutil.roundDecimal( AV298Aux9, 2) ;
                        }
                        AV291Aux1 = AV295Aux5.subtract((AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                        AV292Aux2 = AV291Aux1 ;
                        AV293Aux3 = DecimalUtil.doubleToDec(0) ;
                        if ( A444FacKgs.doubleValue() > 0 )
                        {
                           AV293Aux3 = AV292Aux2.divide(A444FacKgs, 18, java.math.RoundingMode.DOWN) ;
                        }
                        A9649FacPKDto = AV293Aux3 ;
                        A9650FacPMdto = DecimalUtil.doubleToDec(0) ;
                        A9648FacDtoL = AV296Facdtopp ;
                        A9647FacImpdto = AV293Aux3.multiply(A444FacKgs) ;
                        AV290Aux0 = AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                        A9651FacImpd = AV290Aux0 ;
                        AV294Aux4 = AV294Aux4.add((AV293Aux3.multiply(A444FacKgs))) ;
                        A9708FacDscII = AV234FacDsc ;
                     }
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                     {
                        if ( AV297Moda21 == 0 )
                        {
                           AV295Aux5 = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                        }
                        else
                        {
                           AV298Aux9 = (A447FacMts.multiply(A449FacPreMts)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                           AV295Aux5 = GXutil.roundDecimal( AV298Aux9, 2) ;
                        }
                        AV291Aux1 = AV295Aux5.subtract((AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                        AV292Aux2 = AV291Aux1 ;
                        AV293Aux3 = DecimalUtil.doubleToDec(0) ;
                        if ( A447FacMts.doubleValue() > 0 )
                        {
                           AV293Aux3 = AV292Aux2.divide(A447FacMts, 18, java.math.RoundingMode.DOWN) ;
                        }
                        A9650FacPMdto = AV293Aux3 ;
                        A9648FacDtoL = AV296Facdtopp ;
                        A9647FacImpdto = A9647FacImpdto.add((AV293Aux3.multiply(A447FacMts))) ;
                        AV290Aux0 = AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                        A9651FacImpd = AV290Aux0 ;
                        AV294Aux4 = AV294Aux4.add((AV293Aux3.multiply(A447FacMts))) ;
                     }
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                     {
                        if ( AV297Moda21 == 0 )
                        {
                           AV295Aux5 = GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2) ;
                        }
                        else
                        {
                           AV298Aux9 = (A447FacMts.multiply(A449FacPreMts)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                           AV295Aux5 = GXutil.roundDecimal( AV298Aux9, 2) ;
                        }
                        AV291Aux1 = AV295Aux5.subtract((AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                        AV292Aux2 = AV291Aux1 ;
                        AV293Aux3 = DecimalUtil.doubleToDec(0) ;
                        if ( A447FacMts.doubleValue() > 0 )
                        {
                           AV293Aux3 = AV292Aux2.divide(A447FacMts, 18, java.math.RoundingMode.DOWN) ;
                        }
                        A9650FacPMdto = AV293Aux3 ;
                        A9649FacPKDto = DecimalUtil.doubleToDec(0) ;
                        A9648FacDtoL = AV296Facdtopp ;
                        A9647FacImpdto = AV293Aux3.multiply(A447FacMts) ;
                        AV290Aux0 = AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                        A9651FacImpd = AV290Aux0 ;
                        AV294Aux4 = AV294Aux4.add((AV293Aux3.multiply(A447FacMts))) ;
                        A9708FacDscII = AV234FacDsc ;
                     }
                     if ( A12198FacPreUnd.doubleValue() != 0 )
                     {
                        if ( AV297Moda21 == 0 )
                        {
                           AV295Aux5 = GXutil.roundDecimal( DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd), 2) ;
                        }
                        else
                        {
                        }
                        AV291Aux1 = AV295Aux5.subtract((AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                        AV292Aux2 = AV291Aux1 ;
                        AV293Aux3 = DecimalUtil.doubleToDec(0) ;
                        if ( A12197FacUnds > 0 )
                        {
                           AV293Aux3 = AV292Aux2.divide(DecimalUtil.doubleToDec(A12197FacUnds), 18, java.math.RoundingMode.DOWN) ;
                        }
                        A9650FacPMdto = AV293Aux3 ;
                        A9649FacPKDto = DecimalUtil.doubleToDec(0) ;
                        A9648FacDtoL = AV296Facdtopp ;
                        A9647FacImpdto = AV293Aux3.multiply(DecimalUtil.doubleToDec(A12197FacUnds)) ;
                        AV290Aux0 = AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                        A9651FacImpd = AV290Aux0 ;
                        AV294Aux4 = AV294Aux4.add((AV293Aux3.multiply(DecimalUtil.doubleToDec(A12197FacUnds)))) ;
                        A9708FacDscII = AV234FacDsc ;
                     }
                  }
                  else
                  {
                     AV295Aux5 = GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2) ;
                     AV291Aux1 = AV295Aux5.subtract((AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                     AV292Aux2 = AV291Aux1 ;
                     AV293Aux3 = DecimalUtil.doubleToDec(0) ;
                     if ( A444FacKgs.doubleValue() > 0 )
                     {
                        AV293Aux3 = AV292Aux2.divide(A444FacKgs, 18, java.math.RoundingMode.DOWN) ;
                     }
                     A9649FacPKDto = AV293Aux3 ;
                     A9650FacPMdto = DecimalUtil.doubleToDec(0) ;
                     A9648FacDtoL = AV296Facdtopp ;
                     A9647FacImpdto = AV293Aux3.multiply(A444FacKgs) ;
                     AV290Aux0 = AV295Aux5.multiply(AV296Facdtopp).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                     A9651FacImpd = AV290Aux0 ;
                     AV294Aux4 = AV294Aux4.add((AV293Aux3.multiply(A444FacKgs))) ;
                     A9708FacDscII = A432FacDsc ;
                  }
               }
            }
            /* Using cursor P03S78 */
            pr_default.execute(5, new Object[] {A9650FacPMdto, A9649FacPKDto, A9648FacDtoL, A9647FacImpdto, A9651FacImpd, A9708FacDscII, A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
            pr_default.readNext(3);
         }
         pr_default.close(3);
         A9643FacLiq1 = AV212FacImpTot ;
         A9644FacLiq2 = AV212FacImpTot.subtract(GXutil.roundDecimal( ((AV212FacImpTot.multiply(AV296Facdtopp)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
         AV299FacdtoIm = DecimalUtil.doubleToDec(0) ;
         A9645FacIva1 = GXutil.roundDecimal( (A9644FacLiq2.subtract(AV299FacdtoIm)).multiply(DecimalUtil.doubleToDec(AV253FacIvaPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
         A9646FacTot1 = A9644FacLiq2.add(A9645FacIva1).subtract(AV299FacdtoIm) ;
         /* Using cursor P03S79 */
         pr_default.execute(6, new Object[] {A9643FacLiq1, A9644FacLiq2, A9645FacIva1, A9646FacTot1, A396EmprCod, Integer.valueOf(A430FacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfiritems.this.A396EmprCod;
      this.aP1[0] = pfiritems.this.A430FacCod;
      this.aP2[0] = pfiritems.this.AV300FacHor;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfiritems");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P03S72_A396EmprCod = new String[] {""} ;
      P03S72_A430FacCod = new int[1] ;
      P03S72_A9643FacLiq1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S72_A9644FacLiq2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S72_A9645FacIva1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S72_A9646FacTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S72_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S72_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S72_n8346FacRecI = new boolean[] {false} ;
      P03S72_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S72_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S72_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S72_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S72_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S72_A443FacIVAPor = new byte[1] ;
      P03S72_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S72_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S72_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9643FacLiq1 = DecimalUtil.ZERO ;
      A9644FacLiq2 = DecimalUtil.ZERO ;
      A9645FacIva1 = DecimalUtil.ZERO ;
      A9646FacTot1 = DecimalUtil.ZERO ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      P03S73_A7209Colombia = new byte[1] ;
      P03S73_n7209Colombia = new boolean[] {false} ;
      P03S75_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      AV296Facdtopp = DecimalUtil.ZERO ;
      AV255FacDtoGen = DecimalUtil.ZERO ;
      AV212FacImpTot = DecimalUtil.ZERO ;
      AV213FacImpPP = DecimalUtil.ZERO ;
      AV254FacImpGen = DecimalUtil.ZERO ;
      AV214FacIvaImp = DecimalUtil.ZERO ;
      AV215FacTot = DecimalUtil.ZERO ;
      AV225FacBasImp = DecimalUtil.ZERO ;
      P03S76_A396EmprCod = new String[] {""} ;
      P03S76_A430FacCod = new int[1] ;
      P03S76_A3397FacFasCod = new String[] {""} ;
      P03S76_A432FacDsc = new String[] {""} ;
      P03S76_A454FacSer = new String[] {""} ;
      P03S76_A428FacAlbTip = new byte[1] ;
      P03S76_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S76_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S76_A9650FacPMdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S76_A9649FacPKDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S76_A9648FacDtoL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S76_A9647FacImpdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S76_A9651FacImpd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S76_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S76_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S76_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S76_A12197FacUnds = new int[1] ;
      P03S76_A9708FacDscII = new String[] {""} ;
      P03S76_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S76_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03S76_A446FacLin = new int[1] ;
      A3397FacFasCod = "" ;
      A432FacDsc = "" ;
      A454FacSer = "" ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A9650FacPMdto = DecimalUtil.ZERO ;
      A9649FacPKDto = DecimalUtil.ZERO ;
      A9648FacDtoL = DecimalUtil.ZERO ;
      A9647FacImpdto = DecimalUtil.ZERO ;
      A9651FacImpd = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A9708FacDscII = "" ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      AV295Aux5 = DecimalUtil.ZERO ;
      AV291Aux1 = DecimalUtil.ZERO ;
      AV292Aux2 = DecimalUtil.ZERO ;
      AV293Aux3 = DecimalUtil.ZERO ;
      AV290Aux0 = DecimalUtil.ZERO ;
      AV294Aux4 = DecimalUtil.ZERO ;
      AV298Aux9 = DecimalUtil.ZERO ;
      AV234FacDsc = "" ;
      P03S77_A396EmprCod = new String[] {""} ;
      P03S77_A457FasCod = new String[] {""} ;
      A457FasCod = "" ;
      AV299FacdtoIm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfiritems__default(),
         new Object[] {
             new Object[] {
            P03S72_A396EmprCod, P03S72_A430FacCod, P03S72_A9643FacLiq1, P03S72_A9644FacLiq2, P03S72_A9645FacIva1, P03S72_A9646FacTot1, P03S72_A11513FacRecIca, P03S72_A8346FacRecI, P03S72_n8346FacRecI, P03S72_A7212FacRect,
            P03S72_A453FacRECPor, P03S72_A14224FacCostFac, P03S72_A14223FacCostKgs, P03S72_A14222FacCostMts, P03S72_A443FacIVAPor, P03S72_A433FacDtoGen, P03S72_A434FacDtoPP, P03S72_A14219FacEnergia
            }
            , new Object[] {
            P03S73_A7209Colombia, P03S73_n7209Colombia
            }
            , new Object[] {
            P03S75_A3918FacImpTot1
            }
            , new Object[] {
            P03S76_A396EmprCod, P03S76_A430FacCod, P03S76_A3397FacFasCod, P03S76_A432FacDsc, P03S76_A454FacSer, P03S76_A428FacAlbTip, P03S76_A449FacPreMts, P03S76_A447FacMts, P03S76_A9650FacPMdto, P03S76_A9649FacPKDto,
            P03S76_A9648FacDtoL, P03S76_A9647FacImpdto, P03S76_A9651FacImpd, P03S76_A448FacPreKgs, P03S76_A444FacKgs, P03S76_A12198FacPreUnd, P03S76_A12197FacUnds, P03S76_A9708FacDscII, P03S76_A3898FacPreKgsA, P03S76_A5353FacImpMan,
            P03S76_A446FacLin
            }
            , new Object[] {
            P03S77_A396EmprCod, P03S77_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV297Moda21 ;
   private byte AV303Tintex ;
   private byte AV312crearcsv ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private byte AV253FacIvaPor ;
   private byte A428FacAlbTip ;
   private short Gx_err ;
   private int A430FacCod ;
   private int A12197FacUnds ;
   private int A446FacLin ;
   private java.math.BigDecimal A9643FacLiq1 ;
   private java.math.BigDecimal A9644FacLiq2 ;
   private java.math.BigDecimal A9645FacIva1 ;
   private java.math.BigDecimal A9646FacTot1 ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal AV296Facdtopp ;
   private java.math.BigDecimal AV255FacDtoGen ;
   private java.math.BigDecimal AV212FacImpTot ;
   private java.math.BigDecimal AV213FacImpPP ;
   private java.math.BigDecimal AV254FacImpGen ;
   private java.math.BigDecimal AV214FacIvaImp ;
   private java.math.BigDecimal AV215FacTot ;
   private java.math.BigDecimal AV225FacBasImp ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A9650FacPMdto ;
   private java.math.BigDecimal A9649FacPKDto ;
   private java.math.BigDecimal A9648FacDtoL ;
   private java.math.BigDecimal A9647FacImpdto ;
   private java.math.BigDecimal A9651FacImpd ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal AV295Aux5 ;
   private java.math.BigDecimal AV291Aux1 ;
   private java.math.BigDecimal AV292Aux2 ;
   private java.math.BigDecimal AV293Aux3 ;
   private java.math.BigDecimal AV290Aux0 ;
   private java.math.BigDecimal AV294Aux4 ;
   private java.math.BigDecimal AV298Aux9 ;
   private java.math.BigDecimal AV299FacdtoIm ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A3397FacFasCod ;
   private String A432FacDsc ;
   private String A454FacSer ;
   private String A9708FacDscII ;
   private String AV234FacDsc ;
   private String A457FasCod ;
   private java.util.Date AV300FacHor ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private java.util.Date[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03S72_A396EmprCod ;
   private int[] P03S72_A430FacCod ;
   private java.math.BigDecimal[] P03S72_A9643FacLiq1 ;
   private java.math.BigDecimal[] P03S72_A9644FacLiq2 ;
   private java.math.BigDecimal[] P03S72_A9645FacIva1 ;
   private java.math.BigDecimal[] P03S72_A9646FacTot1 ;
   private java.math.BigDecimal[] P03S72_A11513FacRecIca ;
   private java.math.BigDecimal[] P03S72_A8346FacRecI ;
   private boolean[] P03S72_n8346FacRecI ;
   private java.math.BigDecimal[] P03S72_A7212FacRect ;
   private java.math.BigDecimal[] P03S72_A453FacRECPor ;
   private java.math.BigDecimal[] P03S72_A14224FacCostFac ;
   private java.math.BigDecimal[] P03S72_A14223FacCostKgs ;
   private java.math.BigDecimal[] P03S72_A14222FacCostMts ;
   private byte[] P03S72_A443FacIVAPor ;
   private java.math.BigDecimal[] P03S72_A433FacDtoGen ;
   private java.math.BigDecimal[] P03S72_A434FacDtoPP ;
   private java.math.BigDecimal[] P03S72_A14219FacEnergia ;
   private byte[] P03S73_A7209Colombia ;
   private boolean[] P03S73_n7209Colombia ;
   private java.math.BigDecimal[] P03S75_A3918FacImpTot1 ;
   private String[] P03S76_A396EmprCod ;
   private int[] P03S76_A430FacCod ;
   private String[] P03S76_A3397FacFasCod ;
   private String[] P03S76_A432FacDsc ;
   private String[] P03S76_A454FacSer ;
   private byte[] P03S76_A428FacAlbTip ;
   private java.math.BigDecimal[] P03S76_A449FacPreMts ;
   private java.math.BigDecimal[] P03S76_A447FacMts ;
   private java.math.BigDecimal[] P03S76_A9650FacPMdto ;
   private java.math.BigDecimal[] P03S76_A9649FacPKDto ;
   private java.math.BigDecimal[] P03S76_A9648FacDtoL ;
   private java.math.BigDecimal[] P03S76_A9647FacImpdto ;
   private java.math.BigDecimal[] P03S76_A9651FacImpd ;
   private java.math.BigDecimal[] P03S76_A448FacPreKgs ;
   private java.math.BigDecimal[] P03S76_A444FacKgs ;
   private java.math.BigDecimal[] P03S76_A12198FacPreUnd ;
   private int[] P03S76_A12197FacUnds ;
   private String[] P03S76_A9708FacDscII ;
   private java.math.BigDecimal[] P03S76_A3898FacPreKgsA ;
   private java.math.BigDecimal[] P03S76_A5353FacImpMan ;
   private int[] P03S76_A446FacLin ;
   private String[] P03S77_A396EmprCod ;
   private String[] P03S77_A457FasCod ;
}

final  class pfiritems__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03S72", "SELECT EmprCod, FacCod, FacLiq1, FacLiq2, FacIva1, FacTot1, FacRecIca, FacRecI, FacRect, FacRECPor, FacCostFac, FacCostKgs, FacCostMts, FacIVAPor, FacDtoGen, FacDtoPP, FacEnergia FROM TXPCFAVEN WHERE (EmprCod = ? AND FacCod = ?) AND (EmprCod = ? and FacCod = ?)  FOR UPDATE OF FacLiq1, FacLiq2, FacIva1, FacTot1 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03S73", "SELECT Colombia FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03S75", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03S76", "SELECT EmprCod, FacCod, FacFasCod, FacDsc, FacSer, FacAlbTip, FacPreMts, FacMts, FacPMdto, FacPKDto, FacDtoL, FacImpdto, FacImpd, FacPreKgs, FacKgs, FacPreUnd, FacUnds, FacDscII, FacPreKgsA, FacImpMan, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacLin  FOR UPDATE OF FacPMdto, FacPKDto, FacDtoL, FacImpdto, FacImpd, FacDscII NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03S77", "SELECT EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03S78", "UPDATE TXPLFAVEN SET FacPMdto=?, FacPKDto=?, FacDtoL=?, FacImpdto=?, FacImpd=?, FacDscII=?  WHERE EmprCod = ? AND FacCod = ? AND FacLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P03S79", "UPDATE TXPCFAVEN SET FacLiq1=?, FacLiq2=?, FacIva1=?, FacTot1=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 200);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,5);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,2);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
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
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setString(6, (String)parms[5], 200);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

