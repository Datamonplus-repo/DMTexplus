package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pm21totliquido extends GXProcedure
{
   public pm21totliquido( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pm21totliquido.class ), "" );
   }

   public pm21totliquido( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           int[] aP2 ,
                                           byte[] aP3 ,
                                           String[] aP4 )
   {
      pm21totliquido.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pm21totliquido.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pm21totliquido.this.A430FacCod = aP1[0];
      this.aP1 = aP1;
      pm21totliquido.this.A1294FacBarCod = aP2[0];
      this.aP2 = aP2;
      pm21totliquido.this.A1295FacBarReo = aP3[0];
      this.aP3 = aP3;
      pm21totliquido.this.A1296FacBarPar = aP4[0];
      this.aP4 = aP4;
      pm21totliquido.this.AV49SumSig = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV49SumSig = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05SL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk5SL2 = false ;
         A3397FacFasCod = P05SL2_A3397FacFasCod[0] ;
         A444FacKgs = P05SL2_A444FacKgs[0] ;
         A428FacAlbTip = P05SL2_A428FacAlbTip[0] ;
         A454FacSer = P05SL2_A454FacSer[0] ;
         A3898FacPreKgsA = P05SL2_A3898FacPreKgsA[0] ;
         A448FacPreKgs = P05SL2_A448FacPreKgs[0] ;
         A5353FacImpMan = P05SL2_A5353FacImpMan[0] ;
         A449FacPreMts = P05SL2_A449FacPreMts[0] ;
         A447FacMts = P05SL2_A447FacMts[0] ;
         A5050FacBonLi = P05SL2_A5050FacBonLi[0] ;
         A451FacRec = P05SL2_A451FacRec[0] ;
         A427FacAlbCod = P05SL2_A427FacAlbCod[0] ;
         A446FacLin = P05SL2_A446FacLin[0] ;
         AV95Last_hdr = "" ;
         AV32FacAlbCod = A427FacAlbCod ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P05SL2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P05SL2_A430FacCod[0] == A430FacCod ) && ( P05SL2_A1294FacBarCod[0] == A1294FacBarCod ) && ( P05SL2_A1295FacBarReo[0] == A1295FacBarReo ) )
         {
            if ( ! ( ( GXutil.strcmp(P05SL2_A1296FacBarPar[0], A1296FacBarPar) == 0 ) ) )
            {
               if (true) break;
            }
            brk5SL2 = false ;
            A3397FacFasCod = P05SL2_A3397FacFasCod[0] ;
            A444FacKgs = P05SL2_A444FacKgs[0] ;
            A428FacAlbTip = P05SL2_A428FacAlbTip[0] ;
            A454FacSer = P05SL2_A454FacSer[0] ;
            A3898FacPreKgsA = P05SL2_A3898FacPreKgsA[0] ;
            A448FacPreKgs = P05SL2_A448FacPreKgs[0] ;
            A5353FacImpMan = P05SL2_A5353FacImpMan[0] ;
            A449FacPreMts = P05SL2_A449FacPreMts[0] ;
            A447FacMts = P05SL2_A447FacMts[0] ;
            A5050FacBonLi = P05SL2_A5050FacBonLi[0] ;
            A451FacRec = P05SL2_A451FacRec[0] ;
            A446FacLin = P05SL2_A446FacLin[0] ;
            if ( (GXutil.strcmp("", A3397FacFasCod)==0) )
            {
               AV88Hdr = GXutil.str( A1294FacBarCod, 8, 0) + "-" + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
               AV106Hdri = ((GXutil.strcmp(AV153CliImpReop, httpContext.getMessage( "N", ""))==0) ? GXutil.str( A1294FacBarCod, 8, 0) : ((A1295FacBarReo==0) ? GXutil.str( A1294FacBarCod, 8, 0) : GXutil.str( A1294FacBarCod, 8, 0)+" "+GXutil.str( A1295FacBarReo, 1, 0))) ;
               AV97FacKgs = A444FacKgs ;
               if ( A428FacAlbTip == 1 )
               {
                  if ( GXutil.strcmp(A454FacSer, httpContext.getMessage( "Tubos", "")) != 0 )
                  {
                     AV133TotLin2 = (A444FacKgs.multiply(A448FacPreKgs)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                     AV67TotLin = GXutil.roundDecimal( AV133TotLin2, 2) ;
                     if ( A5353FacImpMan.doubleValue() > 0 )
                     {
                        AV67TotLin = A5353FacImpMan ;
                        AV91Precio = DecimalUtil.doubleToDec(0) ;
                     }
                     if ( AV67TotLin.doubleValue() == 0 )
                     {
                        AV91Precio = DecimalUtil.doubleToDec(0) ;
                        AV126Dto = DecimalUtil.doubleToDec(0) ;
                     }
                     AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                     {
                        AV133TotLin2 = (A447FacMts.multiply(A449FacPreMts)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                        AV67TotLin = GXutil.roundDecimal( AV133TotLin2, 2) ;
                        AV91Precio = A449FacPreMts ;
                        AV126Dto = A451FacRec.subtract(A5050FacBonLi) ;
                        AV128ImpPenDto = AV128ImpPenDto.add(GXutil.roundDecimal( (A447FacMts.multiply(AV91Precio).multiply(AV126Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
                        if ( A5353FacImpMan.doubleValue() > 0 )
                        {
                           AV67TotLin = A5353FacImpMan ;
                           AV91Precio = DecimalUtil.doubleToDec(0) ;
                        }
                        if ( AV67TotLin.doubleValue() == 0 )
                        {
                           AV91Precio = DecimalUtil.doubleToDec(0) ;
                           AV126Dto = DecimalUtil.doubleToDec(0) ;
                        }
                        AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                     }
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) )
                     {
                        AV133TotLin2 = (A447FacMts.multiply(A449FacPreMts)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                        AV67TotLin = GXutil.roundDecimal( AV133TotLin2, 2) ;
                        AV91Precio = A449FacPreMts ;
                        AV126Dto = A451FacRec.subtract(A5050FacBonLi) ;
                        AV128ImpPenDto = AV128ImpPenDto.add(GXutil.roundDecimal( (A447FacMts.multiply(AV91Precio).multiply(AV126Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
                        if ( A5353FacImpMan.doubleValue() > 0 )
                        {
                           AV67TotLin = A5353FacImpMan ;
                           AV91Precio = DecimalUtil.doubleToDec(0) ;
                        }
                        if ( AV67TotLin.doubleValue() == 0 )
                        {
                           AV91Precio = DecimalUtil.doubleToDec(0) ;
                           AV126Dto = DecimalUtil.doubleToDec(0) ;
                        }
                        AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                     }
                  }
                  if ( GXutil.strcmp(A454FacSer, httpContext.getMessage( "Tubos", "")) == 0 )
                  {
                     AV133TotLin2 = (A444FacKgs.multiply(A448FacPreKgs)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                     AV67TotLin = GXutil.roundDecimal( AV133TotLin2, 2) ;
                     AV91Precio = A448FacPreKgs ;
                     AV126Dto = A451FacRec.subtract(A5050FacBonLi) ;
                     AV128ImpPenDto = AV128ImpPenDto.add(GXutil.roundDecimal( (A444FacKgs.multiply(AV91Precio).multiply(AV126Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
                     AV97FacKgs = A444FacKgs ;
                     if ( AV67TotLin.doubleValue() == 0 )
                     {
                        AV91Precio = DecimalUtil.doubleToDec(0) ;
                        AV126Dto = DecimalUtil.doubleToDec(0) ;
                     }
                     AV49SumSig = AV49SumSig.add(AV67TotLin) ;
                  }
               }
               AV95Last_hdr = AV88Hdr ;
            }
            brk5SL2 = true ;
            pr_default.readNext(0);
         }
         /* Execute user subroutine: 'LINEASFAS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'LINEASFAS2' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ! brk5SL2 )
         {
            brk5SL2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'LINEASFAS' Routine */
      returnInSub = false ;
      AV100BarCodL = (int)(GXutil.lval( GXutil.substring( AV95Last_hdr, 1, 8))) ;
      AV101BarCodReoL = (byte)(GXutil.lval( GXutil.substring( AV95Last_hdr, 10, 1))) ;
      AV102BarCodParL = GXutil.substring( AV95Last_hdr, 11, 1) ;
      AV96FasesDsc = "" ;
      if ( AV136Agr_Fases == 1 )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A430FacCod ;
         GXv_int3[0] = AV32FacAlbCod ;
         GXv_int4[0] = AV100BarCodL ;
         GXv_int5[0] = AV101BarCodReoL ;
         GXv_char6[0] = AV102BarCodParL ;
         GXv_char7[0] = AV96FasesDsc ;
         GXv_decimal8[0] = AV91Precio ;
         GXv_decimal9[0] = AV97FacKgs ;
         GXv_decimal10[0] = AV67TotLin ;
         GXv_int11[0] = AV124i ;
         GXv_decimal12[0] = AV131FacBonLi ;
         GXv_decimal13[0] = AV132FacRec ;
         new app.pfacmod2(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_int4, GXv_int5, GXv_char6, GXv_char7, GXv_decimal8, GXv_decimal9, GXv_decimal10, AV120Tab_dsc, AV121Tab_imp, AV122Tab_kgs, AV123Tab_prec, GXv_int11, AV129Tab_Bon, AV130Tab_Rec, GXv_decimal12, GXv_decimal13) ;
         pm21totliquido.this.A396EmprCod = GXv_char1[0] ;
         pm21totliquido.this.A430FacCod = GXv_int2[0] ;
         pm21totliquido.this.AV32FacAlbCod = GXv_int3[0] ;
         pm21totliquido.this.AV100BarCodL = GXv_int4[0] ;
         pm21totliquido.this.AV101BarCodReoL = GXv_int5[0] ;
         pm21totliquido.this.AV102BarCodParL = GXv_char6[0] ;
         pm21totliquido.this.AV96FasesDsc = GXv_char7[0] ;
         pm21totliquido.this.AV91Precio = GXv_decimal8[0] ;
         pm21totliquido.this.AV97FacKgs = GXv_decimal9[0] ;
         pm21totliquido.this.AV67TotLin = GXv_decimal10[0] ;
         pm21totliquido.this.AV124i = GXv_int11[0] ;
         pm21totliquido.this.AV131FacBonLi = GXv_decimal12[0] ;
         pm21totliquido.this.AV132FacRec = GXv_decimal13[0] ;
      }
      else
      {
         if ( AV136Agr_Fases == 2 )
         {
            GXv_char7[0] = A396EmprCod ;
            GXv_int4[0] = A430FacCod ;
            GXv_int3[0] = AV32FacAlbCod ;
            GXv_int2[0] = AV100BarCodL ;
            GXv_int11[0] = AV101BarCodReoL ;
            GXv_char6[0] = AV102BarCodParL ;
            GXv_char1[0] = AV96FasesDsc ;
            GXv_decimal13[0] = AV91Precio ;
            GXv_decimal12[0] = AV97FacKgs ;
            GXv_decimal10[0] = AV67TotLin ;
            GXv_int5[0] = AV124i ;
            GXv_decimal9[0] = AV131FacBonLi ;
            GXv_decimal8[0] = AV132FacRec ;
            new app.pfacmod1(remoteHandle, context).execute( GXv_char7, GXv_int4, GXv_int3, GXv_int2, GXv_int11, GXv_char6, GXv_char1, GXv_decimal13, GXv_decimal12, GXv_decimal10, AV120Tab_dsc, AV121Tab_imp, AV122Tab_kgs, AV123Tab_prec, GXv_int5, AV129Tab_Bon, AV130Tab_Rec, GXv_decimal9, GXv_decimal8) ;
            pm21totliquido.this.A396EmprCod = GXv_char7[0] ;
            pm21totliquido.this.A430FacCod = GXv_int4[0] ;
            pm21totliquido.this.AV32FacAlbCod = GXv_int3[0] ;
            pm21totliquido.this.AV100BarCodL = GXv_int2[0] ;
            pm21totliquido.this.AV101BarCodReoL = GXv_int11[0] ;
            pm21totliquido.this.AV102BarCodParL = GXv_char6[0] ;
            pm21totliquido.this.AV96FasesDsc = GXv_char1[0] ;
            pm21totliquido.this.AV91Precio = GXv_decimal13[0] ;
            pm21totliquido.this.AV97FacKgs = GXv_decimal12[0] ;
            pm21totliquido.this.AV67TotLin = GXv_decimal10[0] ;
            pm21totliquido.this.AV124i = GXv_int5[0] ;
            pm21totliquido.this.AV131FacBonLi = GXv_decimal9[0] ;
            pm21totliquido.this.AV132FacRec = GXv_decimal8[0] ;
         }
         else
         {
            GXv_char7[0] = A396EmprCod ;
            GXv_int4[0] = A430FacCod ;
            GXv_int3[0] = AV32FacAlbCod ;
            GXv_int2[0] = AV100BarCodL ;
            GXv_int11[0] = AV101BarCodReoL ;
            GXv_char6[0] = AV102BarCodParL ;
            GXv_char1[0] = AV96FasesDsc ;
            GXv_decimal13[0] = AV91Precio ;
            GXv_decimal12[0] = AV97FacKgs ;
            GXv_decimal10[0] = AV67TotLin ;
            GXv_int5[0] = AV124i ;
            GXv_decimal9[0] = AV131FacBonLi ;
            GXv_decimal8[0] = AV132FacRec ;
            new app.pfacmod4(remoteHandle, context).execute( GXv_char7, GXv_int4, GXv_int3, GXv_int2, GXv_int11, GXv_char6, GXv_char1, GXv_decimal13, GXv_decimal12, GXv_decimal10, AV120Tab_dsc, AV121Tab_imp, AV122Tab_kgs, AV123Tab_prec, GXv_int5, AV129Tab_Bon, AV130Tab_Rec, GXv_decimal9, GXv_decimal8) ;
            pm21totliquido.this.A396EmprCod = GXv_char7[0] ;
            pm21totliquido.this.A430FacCod = GXv_int4[0] ;
            pm21totliquido.this.AV32FacAlbCod = GXv_int3[0] ;
            pm21totliquido.this.AV100BarCodL = GXv_int2[0] ;
            pm21totliquido.this.AV101BarCodReoL = GXv_int11[0] ;
            pm21totliquido.this.AV102BarCodParL = GXv_char6[0] ;
            pm21totliquido.this.AV96FasesDsc = GXv_char1[0] ;
            pm21totliquido.this.AV91Precio = GXv_decimal13[0] ;
            pm21totliquido.this.AV97FacKgs = GXv_decimal12[0] ;
            pm21totliquido.this.AV67TotLin = GXv_decimal10[0] ;
            pm21totliquido.this.AV124i = GXv_int5[0] ;
            pm21totliquido.this.AV131FacBonLi = GXv_decimal9[0] ;
            pm21totliquido.this.AV132FacRec = GXv_decimal8[0] ;
         }
      }
      if ( ! (GXutil.strcmp("", AV96FasesDsc)==0) )
      {
         if ( AV124i == 1 )
         {
            AV96FasesDsc = GXutil.trim( AV96FasesDsc) ;
            AV126Dto = AV132FacRec.subtract(AV131FacBonLi) ;
            AV128ImpPenDto = AV128ImpPenDto.add(GXutil.roundDecimal( (AV97FacKgs.multiply(AV91Precio).multiply(AV126Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
            if ( AV67TotLin.doubleValue() == 0 )
            {
               AV91Precio = DecimalUtil.doubleToDec(0) ;
               AV126Dto = DecimalUtil.doubleToDec(0) ;
            }
            AV49SumSig = AV49SumSig.add(AV67TotLin) ;
         }
         else
         {
            AV125j = (byte)(1) ;
            while ( AV125j <= AV124i )
            {
               AV96FasesDsc = AV120Tab_dsc[AV125j-1] ;
               AV97FacKgs = AV122Tab_kgs[AV125j-1] ;
               AV91Precio = AV123Tab_prec[AV125j-1] ;
               AV67TotLin = AV121Tab_imp[AV125j-1] ;
               AV131FacBonLi = AV129Tab_Bon[AV125j-1] ;
               AV132FacRec = AV130Tab_Rec[AV125j-1] ;
               AV126Dto = AV132FacRec.subtract(AV131FacBonLi) ;
               AV128ImpPenDto = AV128ImpPenDto.add(GXutil.roundDecimal( (AV97FacKgs.multiply(AV91Precio).multiply(AV126Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
               if ( AV67TotLin.doubleValue() == 0 )
               {
                  AV91Precio = DecimalUtil.doubleToDec(0) ;
                  AV126Dto = DecimalUtil.doubleToDec(0) ;
               }
               AV49SumSig = AV49SumSig.add(AV67TotLin) ;
               AV125j = (byte)(AV125j+1) ;
            }
         }
      }
   }

   public void S121( )
   {
      /* 'LINEASFAS2' Routine */
      returnInSub = false ;
      AV100BarCodL = (int)(GXutil.lval( GXutil.substring( AV95Last_hdr, 1, 8))) ;
      AV101BarCodReoL = (byte)(GXutil.lval( GXutil.substring( AV95Last_hdr, 10, 1))) ;
      AV102BarCodParL = GXutil.substring( AV95Last_hdr, 11, 1) ;
      AV96FasesDsc = "" ;
      if ( AV136Agr_Fases == 1 )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int4[0] = A430FacCod ;
         GXv_int3[0] = AV32FacAlbCod ;
         GXv_int2[0] = AV100BarCodL ;
         GXv_int11[0] = AV101BarCodReoL ;
         GXv_char6[0] = AV102BarCodParL ;
         GXv_char1[0] = AV96FasesDsc ;
         GXv_decimal13[0] = AV91Precio ;
         GXv_decimal12[0] = AV134FacMts ;
         GXv_decimal10[0] = AV67TotLin ;
         GXv_int5[0] = AV124i ;
         GXv_decimal9[0] = AV131FacBonLi ;
         GXv_decimal8[0] = AV132FacRec ;
         new app.pfacmod3(remoteHandle, context).execute( GXv_char7, GXv_int4, GXv_int3, GXv_int2, GXv_int11, GXv_char6, GXv_char1, GXv_decimal13, GXv_decimal12, GXv_decimal10, AV120Tab_dsc, AV121Tab_imp, AV135Tab_mts, AV123Tab_prec, GXv_int5, AV129Tab_Bon, AV130Tab_Rec, GXv_decimal9, GXv_decimal8) ;
         pm21totliquido.this.A396EmprCod = GXv_char7[0] ;
         pm21totliquido.this.A430FacCod = GXv_int4[0] ;
         pm21totliquido.this.AV32FacAlbCod = GXv_int3[0] ;
         pm21totliquido.this.AV100BarCodL = GXv_int2[0] ;
         pm21totliquido.this.AV101BarCodReoL = GXv_int11[0] ;
         pm21totliquido.this.AV102BarCodParL = GXv_char6[0] ;
         pm21totliquido.this.AV96FasesDsc = GXv_char1[0] ;
         pm21totliquido.this.AV91Precio = GXv_decimal13[0] ;
         pm21totliquido.this.AV134FacMts = GXv_decimal12[0] ;
         pm21totliquido.this.AV67TotLin = GXv_decimal10[0] ;
         pm21totliquido.this.AV124i = GXv_int5[0] ;
         pm21totliquido.this.AV131FacBonLi = GXv_decimal9[0] ;
         pm21totliquido.this.AV132FacRec = GXv_decimal8[0] ;
      }
      else
      {
         if ( AV136Agr_Fases == 2 )
         {
            GXv_char7[0] = A396EmprCod ;
            GXv_int4[0] = A430FacCod ;
            GXv_int3[0] = AV32FacAlbCod ;
            GXv_int2[0] = AV100BarCodL ;
            GXv_int11[0] = AV101BarCodReoL ;
            GXv_char6[0] = AV102BarCodParL ;
            GXv_char1[0] = AV96FasesDsc ;
            GXv_decimal13[0] = AV91Precio ;
            GXv_decimal12[0] = AV134FacMts ;
            GXv_decimal10[0] = AV67TotLin ;
            GXv_int5[0] = AV124i ;
            GXv_decimal9[0] = AV131FacBonLi ;
            GXv_decimal8[0] = AV132FacRec ;
            new app.pfacmod5(remoteHandle, context).execute( GXv_char7, GXv_int4, GXv_int3, GXv_int2, GXv_int11, GXv_char6, GXv_char1, GXv_decimal13, GXv_decimal12, GXv_decimal10, AV120Tab_dsc, AV121Tab_imp, AV135Tab_mts, AV123Tab_prec, GXv_int5, AV129Tab_Bon, AV130Tab_Rec, GXv_decimal9, GXv_decimal8) ;
            pm21totliquido.this.A396EmprCod = GXv_char7[0] ;
            pm21totliquido.this.A430FacCod = GXv_int4[0] ;
            pm21totliquido.this.AV32FacAlbCod = GXv_int3[0] ;
            pm21totliquido.this.AV100BarCodL = GXv_int2[0] ;
            pm21totliquido.this.AV101BarCodReoL = GXv_int11[0] ;
            pm21totliquido.this.AV102BarCodParL = GXv_char6[0] ;
            pm21totliquido.this.AV96FasesDsc = GXv_char1[0] ;
            pm21totliquido.this.AV91Precio = GXv_decimal13[0] ;
            pm21totliquido.this.AV134FacMts = GXv_decimal12[0] ;
            pm21totliquido.this.AV67TotLin = GXv_decimal10[0] ;
            pm21totliquido.this.AV124i = GXv_int5[0] ;
            pm21totliquido.this.AV131FacBonLi = GXv_decimal9[0] ;
            pm21totliquido.this.AV132FacRec = GXv_decimal8[0] ;
         }
         else
         {
            GXv_char7[0] = A396EmprCod ;
            GXv_int4[0] = A430FacCod ;
            GXv_int3[0] = AV32FacAlbCod ;
            GXv_int2[0] = AV100BarCodL ;
            GXv_int11[0] = AV101BarCodReoL ;
            GXv_char6[0] = AV102BarCodParL ;
            GXv_char1[0] = AV96FasesDsc ;
            GXv_decimal13[0] = AV91Precio ;
            GXv_decimal12[0] = AV134FacMts ;
            GXv_decimal10[0] = AV67TotLin ;
            GXv_int5[0] = AV124i ;
            GXv_decimal9[0] = AV131FacBonLi ;
            GXv_decimal8[0] = AV132FacRec ;
            new app.pfacmod6(remoteHandle, context).execute( GXv_char7, GXv_int4, GXv_int3, GXv_int2, GXv_int11, GXv_char6, GXv_char1, GXv_decimal13, GXv_decimal12, GXv_decimal10, AV120Tab_dsc, AV121Tab_imp, AV135Tab_mts, AV123Tab_prec, GXv_int5, AV129Tab_Bon, AV130Tab_Rec, GXv_decimal9, GXv_decimal8) ;
            pm21totliquido.this.A396EmprCod = GXv_char7[0] ;
            pm21totliquido.this.A430FacCod = GXv_int4[0] ;
            pm21totliquido.this.AV32FacAlbCod = GXv_int3[0] ;
            pm21totliquido.this.AV100BarCodL = GXv_int2[0] ;
            pm21totliquido.this.AV101BarCodReoL = GXv_int11[0] ;
            pm21totliquido.this.AV102BarCodParL = GXv_char6[0] ;
            pm21totliquido.this.AV96FasesDsc = GXv_char1[0] ;
            pm21totliquido.this.AV91Precio = GXv_decimal13[0] ;
            pm21totliquido.this.AV134FacMts = GXv_decimal12[0] ;
            pm21totliquido.this.AV67TotLin = GXv_decimal10[0] ;
            pm21totliquido.this.AV124i = GXv_int5[0] ;
            pm21totliquido.this.AV131FacBonLi = GXv_decimal9[0] ;
            pm21totliquido.this.AV132FacRec = GXv_decimal8[0] ;
         }
      }
      if ( ! (GXutil.strcmp("", AV96FasesDsc)==0) )
      {
         if ( AV124i == 1 )
         {
            AV96FasesDsc = GXutil.trim( AV96FasesDsc) ;
            AV126Dto = AV132FacRec.subtract(AV131FacBonLi) ;
            AV128ImpPenDto = AV128ImpPenDto.add(GXutil.roundDecimal( (AV134FacMts.multiply(AV91Precio).multiply(AV126Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
            if ( AV67TotLin.doubleValue() == 0 )
            {
               AV91Precio = DecimalUtil.doubleToDec(0) ;
               AV126Dto = DecimalUtil.doubleToDec(0) ;
            }
            AV49SumSig = AV49SumSig.add(AV67TotLin) ;
         }
         else
         {
            AV125j = (byte)(1) ;
            while ( AV125j <= AV124i )
            {
               AV96FasesDsc = AV120Tab_dsc[AV125j-1] ;
               AV134FacMts = AV135Tab_mts[AV125j-1] ;
               AV91Precio = AV123Tab_prec[AV125j-1] ;
               AV67TotLin = AV121Tab_imp[AV125j-1] ;
               AV126Dto = AV132FacRec.subtract(AV131FacBonLi) ;
               AV128ImpPenDto = AV128ImpPenDto.add(GXutil.roundDecimal( (AV134FacMts.multiply(AV91Precio).multiply(AV126Dto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2)) ;
               if ( AV67TotLin.doubleValue() == 0 )
               {
                  AV91Precio = DecimalUtil.doubleToDec(0) ;
                  AV126Dto = DecimalUtil.doubleToDec(0) ;
               }
               AV49SumSig = AV49SumSig.add(AV67TotLin) ;
               AV125j = (byte)(AV125j+1) ;
            }
         }
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pm21totliquido.this.A396EmprCod;
      this.aP1[0] = pm21totliquido.this.A430FacCod;
      this.aP2[0] = pm21totliquido.this.A1294FacBarCod;
      this.aP3[0] = pm21totliquido.this.A1295FacBarReo;
      this.aP4[0] = pm21totliquido.this.A1296FacBarPar;
      this.aP5[0] = pm21totliquido.this.AV49SumSig;
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
      P05SL2_A396EmprCod = new String[] {""} ;
      P05SL2_A430FacCod = new int[1] ;
      P05SL2_A1294FacBarCod = new int[1] ;
      P05SL2_A1295FacBarReo = new byte[1] ;
      P05SL2_A1296FacBarPar = new String[] {""} ;
      P05SL2_A3397FacFasCod = new String[] {""} ;
      P05SL2_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SL2_A428FacAlbTip = new byte[1] ;
      P05SL2_A454FacSer = new String[] {""} ;
      P05SL2_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SL2_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SL2_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SL2_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SL2_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SL2_A5050FacBonLi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SL2_A451FacRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SL2_A427FacAlbCod = new long[1] ;
      P05SL2_A446FacLin = new int[1] ;
      A3397FacFasCod = "" ;
      A444FacKgs = DecimalUtil.ZERO ;
      A454FacSer = "" ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A5050FacBonLi = DecimalUtil.ZERO ;
      A451FacRec = DecimalUtil.ZERO ;
      AV95Last_hdr = "" ;
      AV88Hdr = "" ;
      AV106Hdri = "" ;
      AV153CliImpReop = "" ;
      AV97FacKgs = DecimalUtil.ZERO ;
      AV133TotLin2 = DecimalUtil.ZERO ;
      AV67TotLin = DecimalUtil.ZERO ;
      AV91Precio = DecimalUtil.ZERO ;
      AV126Dto = DecimalUtil.ZERO ;
      AV128ImpPenDto = DecimalUtil.ZERO ;
      AV102BarCodParL = "" ;
      AV96FasesDsc = "" ;
      AV120Tab_dsc = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV120Tab_dsc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV121Tab_imp = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV121Tab_imp[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV122Tab_kgs = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV122Tab_kgs[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV123Tab_prec = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV123Tab_prec[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV129Tab_Bon = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV129Tab_Bon[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV130Tab_Rec = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV130Tab_Rec[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV131FacBonLi = DecimalUtil.ZERO ;
      AV132FacRec = DecimalUtil.ZERO ;
      AV134FacMts = DecimalUtil.ZERO ;
      AV135Tab_mts = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV135Tab_mts[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      GXv_char7 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int3 = new long[1] ;
      GXv_int2 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char6 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int5 = new byte[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pm21totliquido__default(),
         new Object[] {
             new Object[] {
            P05SL2_A396EmprCod, P05SL2_A430FacCod, P05SL2_A1294FacBarCod, P05SL2_A1295FacBarReo, P05SL2_A1296FacBarPar, P05SL2_A3397FacFasCod, P05SL2_A444FacKgs, P05SL2_A428FacAlbTip, P05SL2_A454FacSer, P05SL2_A3898FacPreKgsA,
            P05SL2_A448FacPreKgs, P05SL2_A5353FacImpMan, P05SL2_A449FacPreMts, P05SL2_A447FacMts, P05SL2_A5050FacBonLi, P05SL2_A451FacRec, P05SL2_A427FacAlbCod, P05SL2_A446FacLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1295FacBarReo ;
   private byte A428FacAlbTip ;
   private byte AV101BarCodReoL ;
   private byte AV136Agr_Fases ;
   private byte AV124i ;
   private byte AV125j ;
   private byte GXv_int11[] ;
   private byte GXv_int5[] ;
   private short Gx_err ;
   private int A430FacCod ;
   private int A1294FacBarCod ;
   private int A446FacLin ;
   private int AV100BarCodL ;
   private int GXv_int4[] ;
   private int GXv_int2[] ;
   private int GX_I ;
   private long A427FacAlbCod ;
   private long AV32FacAlbCod ;
   private long GXv_int3[] ;
   private java.math.BigDecimal AV49SumSig ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A5050FacBonLi ;
   private java.math.BigDecimal A451FacRec ;
   private java.math.BigDecimal AV97FacKgs ;
   private java.math.BigDecimal AV133TotLin2 ;
   private java.math.BigDecimal AV67TotLin ;
   private java.math.BigDecimal AV91Precio ;
   private java.math.BigDecimal AV126Dto ;
   private java.math.BigDecimal AV128ImpPenDto ;
   private java.math.BigDecimal AV121Tab_imp[] ;
   private java.math.BigDecimal AV122Tab_kgs[] ;
   private java.math.BigDecimal AV123Tab_prec[] ;
   private java.math.BigDecimal AV129Tab_Bon[] ;
   private java.math.BigDecimal AV130Tab_Rec[] ;
   private java.math.BigDecimal AV131FacBonLi ;
   private java.math.BigDecimal AV132FacRec ;
   private java.math.BigDecimal AV134FacMts ;
   private java.math.BigDecimal AV135Tab_mts[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String A396EmprCod ;
   private String A1296FacBarPar ;
   private String scmdbuf ;
   private String A3397FacFasCod ;
   private String A454FacSer ;
   private String AV95Last_hdr ;
   private String AV88Hdr ;
   private String AV106Hdri ;
   private String AV153CliImpReop ;
   private String AV102BarCodParL ;
   private String AV96FasesDsc ;
   private String AV120Tab_dsc[] ;
   private String GXv_char7[] ;
   private String GXv_char6[] ;
   private String GXv_char1[] ;
   private boolean brk5SL2 ;
   private boolean returnInSub ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05SL2_A396EmprCod ;
   private int[] P05SL2_A430FacCod ;
   private int[] P05SL2_A1294FacBarCod ;
   private byte[] P05SL2_A1295FacBarReo ;
   private String[] P05SL2_A1296FacBarPar ;
   private String[] P05SL2_A3397FacFasCod ;
   private java.math.BigDecimal[] P05SL2_A444FacKgs ;
   private byte[] P05SL2_A428FacAlbTip ;
   private String[] P05SL2_A454FacSer ;
   private java.math.BigDecimal[] P05SL2_A3898FacPreKgsA ;
   private java.math.BigDecimal[] P05SL2_A448FacPreKgs ;
   private java.math.BigDecimal[] P05SL2_A5353FacImpMan ;
   private java.math.BigDecimal[] P05SL2_A449FacPreMts ;
   private java.math.BigDecimal[] P05SL2_A447FacMts ;
   private java.math.BigDecimal[] P05SL2_A5050FacBonLi ;
   private java.math.BigDecimal[] P05SL2_A451FacRec ;
   private long[] P05SL2_A427FacAlbCod ;
   private int[] P05SL2_A446FacLin ;
}

final  class pm21totliquido__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05SL2", "SELECT EmprCod, FacCod, FacBarCod, FacBarReo, FacBarPar, FacFasCod, FacKgs, FacAlbTip, FacSer, FacPreKgsA, FacPreKgs, FacImpMan, FacPreMts, FacMts, FacBonLi, FacRec, FacAlbCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? and FacBarCod = ? and FacBarReo = ? and FacBarPar = ? ORDER BY EmprCod, FacCod, FacBarCod, FacBarReo, FacBarPar, FacFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((long[]) buf[16])[0] = rslt.getLong(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
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
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

