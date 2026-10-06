package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palmpedn extends GXProcedure
{
   public palmpedn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palmpedn.class ), "" );
   }

   public palmpedn( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           java.math.BigDecimal[] aP3 ,
                           java.math.BigDecimal[] aP4 ,
                           String[] aP5 ,
                           java.util.Date[] aP6 ,
                           String[] aP7 ,
                           String[] aP8 ,
                           short[] aP9 ,
                           java.util.Date[] aP10 ,
                           int[] aP11 ,
                           String[] aP12 ,
                           short[] aP13 ,
                           String[] aP14 ,
                           String[] aP15 )
   {
      palmpedn.this.aP16 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
      return aP16[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 ,
                        java.util.Date[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        short[] aP9 ,
                        java.util.Date[] aP10 ,
                        int[] aP11 ,
                        String[] aP12 ,
                        short[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        byte[] aP16 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             java.util.Date[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 ,
                             java.util.Date[] aP10 ,
                             int[] aP11 ,
                             String[] aP12 ,
                             short[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             byte[] aP16 )
   {
      palmpedn.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palmpedn.this.A658PedCod = aP1[0];
      this.aP1 = aP1;
      palmpedn.this.A719PrdNum = aP2[0];
      this.aP2 = aP2;
      palmpedn.this.AV30PrdCnt = aP3[0];
      this.aP3 = aP3;
      palmpedn.this.AV41PedPre = aP4[0];
      this.aP4 = aP4;
      palmpedn.this.AV43Albaran = aP5[0];
      this.aP5 = aP5;
      palmpedn.this.AV47EntFVal = aP6[0];
      this.aP6 = aP6;
      palmpedn.this.AV48EntLotn = aP7[0];
      this.aP7 = aP7;
      palmpedn.this.AV63ProductosEtiquetas = aP8[0];
      this.aP8 = aP8;
      palmpedn.this.AV46i = aP9[0];
      this.aP9 = aP9;
      palmpedn.this.AV50Pedfec = aP10[0];
      this.aP10 = aP10;
      palmpedn.this.AV49PrvNum = aP11[0];
      this.aP11 = aP11;
      palmpedn.this.AV55EntNAlbar = aP12[0];
      this.aP12 = aP12;
      palmpedn.this.AV60Netiquetas = aP13[0];
      this.aP13 = aP13;
      palmpedn.this.AV62EntUbicacion = aP14[0];
      this.aP14 = aP14;
      palmpedn.this.AV66Pedcum = aP15[0];
      this.aP15 = aP15;
      palmpedn.this.AV68EntNEmb = aP16[0];
      this.aP16 = aP16;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV64sdtProductosEtiquetasCollection.fromJSonString(AV63ProductosEtiquetas, null);
      GXt_int1 = AV51Consumos ;
      GXv_int2[0] = GXt_int1 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int2) ;
      palmpedn.this.GXt_int1 = GXv_int2[0] ;
      AV51Consumos = (byte)(GXt_int1) ;
      GXt_int3 = AV52NoUpd ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOUPPR", ""), GXv_int4) ;
      palmpedn.this.GXt_int3 = GXv_int4[0] ;
      AV52NoUpd = GXt_int3 ;
      GXt_int3 = AV53DocAut ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DOCAUT", ""), GXv_int4) ;
      palmpedn.this.GXt_int3 = GXv_int4[0] ;
      AV53DocAut = GXt_int3 ;
      GXt_int3 = AV56Nalbaran20 ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBA20", ""), GXv_int4) ;
      palmpedn.this.GXt_int3 = GXv_int4[0] ;
      AV56Nalbaran20 = GXt_int3 ;
      GXt_int3 = AV59ExiLoteID ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IDLOTE", ""), GXv_int4) ;
      palmpedn.this.GXt_int3 = GXv_int4[0] ;
      AV59ExiLoteID = GXt_int3 ;
      AV31EntNumCon = (short)(0) ;
      AV32EntConIni = 0 ;
      AV33EntConFin = 0 ;
      /* Using cursor P02NM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum, A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A660PedDto = P02NM2_A660PedDto[0] ;
         A665PedPre = P02NM2_A665PedPre[0] ;
         A669PedUni = P02NM2_A669PedUni[0] ;
         A657PedCanEnt = P02NM2_A657PedCanEnt[0] ;
         A663PedFulEnt = P02NM2_A663PedFulEnt[0] ;
         A659PedCum = P02NM2_A659PedCum[0] ;
         /* Using cursor P02NM3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum});
         A847UltLinEnt = P02NM3_A847UltLinEnt[0] ;
         A684PrdCanPen = P02NM3_A684PrdCanPen[0] ;
         A704PrdExiAlm = P02NM3_A704PrdExiAlm[0] ;
         A718PrdNom = P02NM3_A718PrdNom[0] ;
         A713PrdFulEnt = P02NM3_A713PrdFulEnt[0] ;
         A709PrdFecPre = P02NM3_A709PrdFecPre[0] ;
         A724PrdPreAct = P02NM3_A724PrdPreAct[0] ;
         A725PrdPreAnt = P02NM3_A725PrdPreAnt[0] ;
         A795PrvNum = P02NM3_A795PrvNum[0] ;
         A750PrdValStk = P02NM3_A750PrdValStk[0] ;
         A726PrdPreMed = P02NM3_A726PrdPreMed[0] ;
         A705PrdExiCC = P02NM3_A705PrdExiCC[0] ;
         A13457PrdUbicaci = P02NM3_A13457PrdUbicaci[0] ;
         /* Using cursor P02NM4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
         A800PrvPri = P02NM4_A800PrvPri[0] ;
         n800PrvPri = P02NM4_n800PrvPri[0] ;
         /* Using cursor P02NM5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         A666PedPri = P02NM5_A666PedPri[0] ;
         W396EmprCod = A396EmprCod ;
         W719PrdNum = A719PrdNum ;
         A666PedPri = GXutil.str( A800PrvPri, 1, 0) ;
         if ( GXutil.strcmp(AV66Pedcum, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) < 0 )
            {
               AV42Cant = A669PedUni.subtract(A657PedCanEnt) ;
               A684PrdCanPen = A684PrdCanPen.subtract(AV42Cant) ;
            }
         }
         else
         {
            A684PrdCanPen = A684PrdCanPen.subtract(AV30PrdCnt) ;
            if ( A684PrdCanPen.doubleValue() < 0 )
            {
               A684PrdCanPen = DecimalUtil.doubleToDec(0) ;
            }
         }
         A657PedCanEnt = A657PedCanEnt.add(AV30PrdCnt) ;
         A704PrdExiAlm = A704PrdExiAlm.add(AV30PrdCnt) ;
         A665PedPre = AV41PedPre ;
         A663PedFulEnt = AV50Pedfec ;
         A847UltLinEnt = (short)(A847UltLinEnt+1) ;
         A659PedCum = AV66Pedcum ;
         /*
            INSERT RECORD ON TABLE TXPENTALM

         */
         W396EmprCod = A396EmprCod ;
         W719PrdNum = A719PrdNum ;
         A597LinEnt = A847UltLinEnt ;
         A415EntFecEnt = AV50Pedfec ;
         A11Albaran = AV43Albaran ;
         AV35EntPre = AV41PedPre ;
         if ( A660PedDto.doubleValue() > 0 )
         {
            AV35EntPre = GXutil.roundDecimal( A665PedPre.multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
         }
         A417EntPre = AV35EntPre ;
         A418EntUniEnt = AV30PrdCnt ;
         A419EntUniRem = A418EntUniEnt ;
         A411EntCon = (byte)(0) ;
         A412EntConFin = AV33EntConFin ;
         A413EntConIni = AV32EntConIni ;
         A414EntEti = (byte)(0) ;
         A416EntNumCon = AV31EntNumCon ;
         A3404EntPedCum = httpContext.getMessage( "N", "") ;
         A5686EntLotN = AV48EntLotn ;
         A5685EntFVal = AV47EntFVal ;
         A6156EntPrvNum = AV49PrvNum ;
         n6156EntPrvNum = false ;
         AV65sdtpRODUCTOSeTIQUETAS = (app.SdtSDTProductosEtiquetas)new app.SdtSDTProductosEtiquetas(remoteHandle, context);
         AV65sdtpRODUCTOSeTIQUETAS.setgxTv_SdtSDTProductosEtiquetas_Producto( A719PrdNum );
         AV65sdtpRODUCTOSeTIQUETAS.setgxTv_SdtSDTProductosEtiquetas_Linent( A597LinEnt );
         AV65sdtpRODUCTOSeTIQUETAS.setgxTv_SdtSDTProductosEtiquetas_Netiquetas( (short)(((AV60Netiquetas==0) ? 1 : AV60Netiquetas)) );
         AV64sdtProductosEtiquetasCollection.add(AV65sdtpRODUCTOSeTIQUETAS, 0);
         if ( AV53DocAut == 1 )
         {
            GXv_int2[0] = AV54Contador ;
            new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DOCAUT", ""), GXv_int2) ;
            palmpedn.this.AV54Contador = GXv_int2[0] ;
         }
         A10187EntRemNro = ((AV53DocAut==0) ? " " : GXutil.trim( GXutil.str( AV54Contador, 8, 0))) ;
         A12716EntFabId = AV49PrvNum ;
         A12857EntNAlbar = AV55EntNAlbar ;
         if ( AV59ExiLoteID == 1 )
         {
            GXv_int2[0] = (int)(AV57NumIdLote) ;
            new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IDLOTE", ""), GXv_int2) ;
            palmpedn.this.AV57NumIdLote = GXv_int2[0] ;
         }
         A13235EntLoteID = ((AV59ExiLoteID==0) ? 0 : AV57NumIdLote) ;
         A13456EntUbicaci = AV62EntUbicacion ;
         A14035EntNEmb = AV68EntNEmb ;
         /* Using cursor P02NM6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt), A11Albaran, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A418EntUniEnt, A417EntPre, Short.valueOf(A416EntNumCon), A419EntUniRem, Byte.valueOf(A414EntEti), Byte.valueOf(A411EntCon), A415EntFecEnt, Integer.valueOf(A413EntConIni), Integer.valueOf(A412EntConFin), A3404EntPedCum, A5685EntFVal, A5686EntLotN, Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum), A10187EntRemNro, Integer.valueOf(A12716EntFabId), A12857EntNAlbar, Long.valueOf(A13235EntLoteID), A13456EntUbicaci, Byte.valueOf(A14035EntNEmb)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
         if ( (pr_default.getStatus(4) == 1) )
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
         A719PrdNum = W719PrdNum ;
         /* End Insert */
         GXv_char5[0] = A396EmprCod ;
         GXv_char6[0] = A719PrdNum ;
         GXv_int7[0] = A847UltLinEnt ;
         new app.plinent(remoteHandle, context).execute( GXv_char5, GXv_char6, GXv_int7) ;
         palmpedn.this.A396EmprCod = GXv_char5[0] ;
         palmpedn.this.A719PrdNum = GXv_char6[0] ;
         palmpedn.this.A847UltLinEnt = GXv_int7[0] ;
         if ( ! (0==AV31EntNumCon) )
         {
         }
         AV36Year = (short)(GXutil.year( AV50Pedfec)) ;
         AV37Month = (byte)(GXutil.month( AV50Pedfec)) ;
         AV38FchNull = GXutil.nullDate() ;
         GXv_char6[0] = A396EmprCod ;
         GXv_int2[0] = AV49PrvNum ;
         GXv_int7[0] = AV36Year ;
         GXv_int4[0] = AV37Month ;
         GXv_decimal8[0] = AV30PrdCnt ;
         GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal10[0] = AV35EntPre ;
         GXv_char5[0] = A666PedPri ;
         GXv_int11[0] = AV36Year ;
         GXv_int12[0] = (short)(0) ;
         GXv_int13[0] = AV37Month ;
         GXv_int14[0] = (byte)(0) ;
         GXv_decimal15[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date16[0] = AV50Pedfec ;
         GXv_date17[0] = AV38FchNull ;
         GXv_char18[0] = httpContext.getMessage( "INS", "") ;
         new app.pprdest(remoteHandle, context).execute( GXv_char6, GXv_int2, GXv_int7, GXv_int4, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_char5, GXv_int11, GXv_int12, GXv_int13, GXv_int14, GXv_decimal15, GXv_date16, GXv_date17, GXv_char18) ;
         palmpedn.this.A396EmprCod = GXv_char6[0] ;
         palmpedn.this.AV49PrvNum = GXv_int2[0] ;
         palmpedn.this.AV36Year = GXv_int7[0] ;
         palmpedn.this.AV37Month = GXv_int4[0] ;
         palmpedn.this.AV30PrdCnt = GXv_decimal8[0] ;
         palmpedn.this.AV35EntPre = GXv_decimal10[0] ;
         palmpedn.this.A666PedPri = GXv_char5[0] ;
         palmpedn.this.AV36Year = GXv_int11[0] ;
         palmpedn.this.AV37Month = GXv_int13[0] ;
         palmpedn.this.AV50Pedfec = GXv_date16[0] ;
         palmpedn.this.AV38FchNull = GXv_date17[0] ;
         GXv_char18[0] = A396EmprCod ;
         GXv_char6[0] = A719PrdNum ;
         GXv_int12[0] = AV36Year ;
         GXv_int14[0] = AV37Month ;
         GXv_decimal15[0] = AV30PrdCnt ;
         GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal9[0] = AV35EntPre ;
         GXv_int11[0] = AV36Year ;
         GXv_int7[0] = (short)(0) ;
         GXv_int13[0] = AV37Month ;
         GXv_int4[0] = (byte)(0) ;
         GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date17[0] = AV50Pedfec ;
         GXv_date16[0] = AV38FchNull ;
         GXv_char5[0] = A666PedPri ;
         GXv_char19[0] = httpContext.getMessage( "INS", "") ;
         new app.pprdent(remoteHandle, context).execute( GXv_char18, GXv_char6, GXv_int12, GXv_int14, GXv_decimal15, GXv_decimal10, GXv_decimal9, GXv_int11, GXv_int7, GXv_int13, GXv_int4, GXv_decimal8, GXv_date17, GXv_date16, GXv_char5, GXv_char19) ;
         palmpedn.this.A396EmprCod = GXv_char18[0] ;
         palmpedn.this.A719PrdNum = GXv_char6[0] ;
         palmpedn.this.AV36Year = GXv_int12[0] ;
         palmpedn.this.AV37Month = GXv_int14[0] ;
         palmpedn.this.AV30PrdCnt = GXv_decimal15[0] ;
         palmpedn.this.AV35EntPre = GXv_decimal9[0] ;
         palmpedn.this.AV36Year = GXv_int11[0] ;
         palmpedn.this.AV37Month = GXv_int13[0] ;
         palmpedn.this.AV50Pedfec = GXv_date17[0] ;
         palmpedn.this.AV38FchNull = GXv_date16[0] ;
         palmpedn.this.A666PedPri = GXv_char5[0] ;
         GXv_char19[0] = A396EmprCod ;
         GXv_int2[0] = AV49PrvNum ;
         GXv_char18[0] = A719PrdNum ;
         GXv_char6[0] = A718PrdNom ;
         GXv_int12[0] = AV36Year ;
         GXv_int14[0] = AV37Month ;
         GXv_decimal15[0] = AV30PrdCnt ;
         GXv_decimal10[0] = AV30PrdCnt ;
         GXv_decimal9[0] = AV35EntPre ;
         GXv_char5[0] = A666PedPri ;
         GXv_int11[0] = AV36Year ;
         GXv_int7[0] = AV36Year ;
         GXv_int13[0] = AV37Month ;
         GXv_int4[0] = AV37Month ;
         GXv_decimal8[0] = AV35EntPre ;
         GXv_date17[0] = AV50Pedfec ;
         GXv_date16[0] = AV50Pedfec ;
         GXv_char20[0] = httpContext.getMessage( "INS", "") ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char19, GXv_int2, GXv_char18, GXv_char6, GXv_int12, GXv_int14, GXv_decimal15, GXv_decimal10, GXv_decimal9, GXv_char5, GXv_int11, GXv_int7, GXv_int13, GXv_int4, GXv_decimal8, GXv_date17, GXv_date16, GXv_char20) ;
         palmpedn.this.A396EmprCod = GXv_char19[0] ;
         palmpedn.this.AV49PrvNum = GXv_int2[0] ;
         palmpedn.this.A719PrdNum = GXv_char18[0] ;
         palmpedn.this.A718PrdNom = GXv_char6[0] ;
         palmpedn.this.AV36Year = GXv_int12[0] ;
         palmpedn.this.AV37Month = GXv_int14[0] ;
         palmpedn.this.AV30PrdCnt = GXv_decimal15[0] ;
         palmpedn.this.AV30PrdCnt = GXv_decimal10[0] ;
         palmpedn.this.AV35EntPre = GXv_decimal9[0] ;
         palmpedn.this.A666PedPri = GXv_char5[0] ;
         palmpedn.this.AV36Year = GXv_int11[0] ;
         palmpedn.this.AV36Year = GXv_int7[0] ;
         palmpedn.this.AV37Month = GXv_int13[0] ;
         palmpedn.this.AV37Month = GXv_int4[0] ;
         palmpedn.this.AV35EntPre = GXv_decimal8[0] ;
         palmpedn.this.AV50Pedfec = GXv_date17[0] ;
         palmpedn.this.AV50Pedfec = GXv_date16[0] ;
         A713PrdFulEnt = AV50Pedfec ;
         if ( AV52NoUpd == 0 )
         {
            A709PrdFecPre = AV50Pedfec ;
            A725PrdPreAnt = A724PrdPreAct ;
            A724PrdPreAct = AV35EntPre ;
         }
         A795PrvNum = AV49PrvNum ;
         if ( DecimalUtil.compareTo((A750PrdValStk.add(GXutil.roundDecimal( AV35EntPre.multiply(AV30PrdCnt), 2))), DecimalUtil.stringToDec("99999999.99")) > 0 )
         {
            A750PrdValStk = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A750PrdValStk = A750PrdValStk.add((GXutil.roundDecimal( AV35EntPre.multiply(AV30PrdCnt), 2))) ;
         }
         if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV51Consumos == 1 ) )
         {
            A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
         }
         if ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) )
         {
            A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
         }
         A13457PrdUbicaci = AV62EntUbicacion ;
         GXt_char21 = AV39Station ;
         GXv_char20[0] = GXt_char21 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char20) ;
         palmpedn.this.GXt_char21 = GXv_char20[0] ;
         AV39Station = GXt_char21 ;
         GXv_char20[0] = A396EmprCod ;
         GXv_char19[0] = "" ;
         GXv_char18[0] = AV40UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV39Station, GXv_char20, GXv_char19, GXv_char18) ;
         palmpedn.this.A396EmprCod = GXv_char20[0] ;
         palmpedn.this.AV40UsurCod = GXv_char18[0] ;
         if ( AV56Nalbaran20 == 0 )
         {
            GXv_char20[0] = A396EmprCod ;
            GXv_char19[0] = A719PrdNum ;
            GXv_decimal15[0] = AV30PrdCnt ;
            GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
            GXv_char18[0] = httpContext.getMessage( "EN", "") ;
            GXv_char6[0] = A666PedPri ;
            GXv_decimal9[0] = AV35EntPre ;
            GXv_int2[0] = 0 ;
            GXv_int14[0] = (byte)(0) ;
            GXv_char5[0] = " " ;
            GXv_int22[0] = A658PedCod ;
            GXv_char23[0] = GXutil.substring( AV55EntNAlbar, 1, 10) ;
            GXv_char24[0] = AV40UsurCod ;
            GXv_char25[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
            GXv_int12[0] = A847UltLinEnt ;
            GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal26[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date17[0] = AV50Pedfec ;
            GXv_int27[0] = AV49PrvNum ;
            GXv_char28[0] = AV48EntLotn ;
            new app.pnewcc9(remoteHandle, context).execute( GXv_char20, GXv_char19, GXv_decimal15, GXv_decimal10, GXv_char18, GXv_char6, GXv_decimal9, GXv_int2, GXv_int14, GXv_char5, GXv_int22, GXv_char23, GXv_char24, GXv_char25, GXv_int12, GXv_decimal8, GXv_decimal26, GXv_date17, GXv_int27, GXv_char28) ;
            palmpedn.this.A396EmprCod = GXv_char20[0] ;
            palmpedn.this.A719PrdNum = GXv_char19[0] ;
            palmpedn.this.AV30PrdCnt = GXv_decimal15[0] ;
            palmpedn.this.A666PedPri = GXv_char6[0] ;
            palmpedn.this.AV35EntPre = GXv_decimal9[0] ;
            palmpedn.this.A658PedCod = GXv_int22[0] ;
            palmpedn.this.AV40UsurCod = GXv_char24[0] ;
            palmpedn.this.A847UltLinEnt = GXv_int12[0] ;
            palmpedn.this.AV50Pedfec = GXv_date17[0] ;
            palmpedn.this.AV49PrvNum = GXv_int27[0] ;
            palmpedn.this.AV48EntLotn = GXv_char28[0] ;
         }
         else
         {
            GXv_char28[0] = A396EmprCod ;
            GXv_char25[0] = A719PrdNum ;
            GXv_decimal26[0] = AV30PrdCnt ;
            GXv_decimal15[0] = DecimalUtil.doubleToDec(0) ;
            GXv_char24[0] = httpContext.getMessage( "EN", "") ;
            GXv_char23[0] = A666PedPri ;
            GXv_decimal10[0] = AV35EntPre ;
            GXv_int27[0] = 0 ;
            GXv_int14[0] = (byte)(0) ;
            GXv_char20[0] = " " ;
            GXv_int22[0] = A658PedCod ;
            GXv_char19[0] = GXutil.substring( AV55EntNAlbar, 1, 10) ;
            GXv_char18[0] = AV40UsurCod ;
            GXv_char6[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
            GXv_int12[0] = A847UltLinEnt ;
            GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date17[0] = AV50Pedfec ;
            GXv_int2[0] = AV49PrvNum ;
            GXv_char5[0] = AV48EntLotn ;
            GXv_char29[0] = AV55EntNAlbar ;
            new app.pccstk20(remoteHandle, context).execute( GXv_char28, GXv_char25, GXv_decimal26, GXv_decimal15, GXv_char24, GXv_char23, GXv_decimal10, GXv_int27, GXv_int14, GXv_char20, GXv_int22, GXv_char19, GXv_char18, GXv_char6, GXv_int12, GXv_decimal9, GXv_decimal8, GXv_date17, GXv_int2, GXv_char5, GXv_char29) ;
            palmpedn.this.A396EmprCod = GXv_char28[0] ;
            palmpedn.this.A719PrdNum = GXv_char25[0] ;
            palmpedn.this.AV30PrdCnt = GXv_decimal26[0] ;
            palmpedn.this.A666PedPri = GXv_char23[0] ;
            palmpedn.this.AV35EntPre = GXv_decimal10[0] ;
            palmpedn.this.A658PedCod = GXv_int22[0] ;
            palmpedn.this.AV40UsurCod = GXv_char18[0] ;
            palmpedn.this.A847UltLinEnt = GXv_int12[0] ;
            palmpedn.this.AV50Pedfec = GXv_date17[0] ;
            palmpedn.this.AV49PrvNum = GXv_int2[0] ;
            palmpedn.this.AV48EntLotn = GXv_char5[0] ;
            palmpedn.this.AV55EntNAlbar = GXv_char29[0] ;
         }
         /* Using cursor P02NM7 */
         pr_default.execute(5, new Object[] {Short.valueOf(A847UltLinEnt), A684PrdCanPen, A704PrdExiAlm, A713PrdFulEnt, A709PrdFecPre, A724PrdPreAct, A725PrdPreAnt, Integer.valueOf(A795PrvNum), A750PrdValStk, A726PrdPreMed, A13457PrdUbicaci, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Using cursor P02NM8 */
         pr_default.execute(6, new Object[] {A666PedPri, A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDID");
         /* Using cursor P02NM9 */
         pr_default.execute(7, new Object[] {A665PedPre, A657PedCanEnt, A663PedFulEnt, A659PedCum, A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
         A396EmprCod = W396EmprCod ;
         A719PrdNum = W719PrdNum ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      pr_default.close(3);
      AV67Flag = (short)(0) ;
      /* Using cursor P02NM10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A667PedSit = P02NM10_A667PedSit[0] ;
         /* Using cursor P02NM11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A659PedCum = P02NM11_A659PedCum[0] ;
            if ( GXutil.strcmp(A659PedCum, httpContext.getMessage( "N", "")) == 0 )
            {
               AV67Flag = (short)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(9);
         A667PedSit = ((AV67Flag==0) ? "S" : "N") ;
         /* Using cursor P02NM12 */
         pr_default.execute(10, new Object[] {A667PedSit, A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDID");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
      /* Optimized UPDATE. */
      /* Using cursor P02NM13 */
      pr_default.execute(11, new Object[] {AV35EntPre, A396EmprCod, A719PrdNum, Integer.valueOf(AV49PrvNum)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROPRV");
      /* End optimized UPDATE. */
      AV63ProductosEtiquetas = AV64sdtProductosEtiquetasCollection.toJSonString(false) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palmpedn.this.A396EmprCod;
      this.aP1[0] = palmpedn.this.A658PedCod;
      this.aP2[0] = palmpedn.this.A719PrdNum;
      this.aP3[0] = palmpedn.this.AV30PrdCnt;
      this.aP4[0] = palmpedn.this.AV41PedPre;
      this.aP5[0] = palmpedn.this.AV43Albaran;
      this.aP6[0] = palmpedn.this.AV47EntFVal;
      this.aP7[0] = palmpedn.this.AV48EntLotn;
      this.aP8[0] = palmpedn.this.AV63ProductosEtiquetas;
      this.aP9[0] = palmpedn.this.AV46i;
      this.aP10[0] = palmpedn.this.AV50Pedfec;
      this.aP11[0] = palmpedn.this.AV49PrvNum;
      this.aP12[0] = palmpedn.this.AV55EntNAlbar;
      this.aP13[0] = palmpedn.this.AV60Netiquetas;
      this.aP14[0] = palmpedn.this.AV62EntUbicacion;
      this.aP15[0] = palmpedn.this.AV66Pedcum;
      this.aP16[0] = palmpedn.this.AV68EntNEmb;
      Application.commitDataStores(context, remoteHandle, pr_default, "palmpedn");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV64sdtProductosEtiquetasCollection = new GXBaseCollection<app.SdtSDTProductosEtiquetas>(app.SdtSDTProductosEtiquetas.class, "SDTProductosEtiquetas", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P02NM2_A396EmprCod = new String[] {""} ;
      P02NM2_A658PedCod = new int[1] ;
      P02NM2_n658PedCod = new boolean[] {false} ;
      P02NM2_A719PrdNum = new String[] {""} ;
      P02NM2_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02NM2_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02NM2_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02NM2_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02NM2_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P02NM2_A659PedCum = new String[] {""} ;
      A660PedDto = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A663PedFulEnt = GXutil.nullDate() ;
      A659PedCum = "" ;
      P02NM3_A847UltLinEnt = new short[1] ;
      P02NM3_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02NM3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02NM3_A718PrdNom = new String[] {""} ;
      P02NM3_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P02NM3_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P02NM3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02NM3_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02NM3_A795PrvNum = new int[1] ;
      P02NM3_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02NM3_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02NM3_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02NM3_A13457PrdUbicaci = new String[] {""} ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A713PrdFulEnt = GXutil.nullDate() ;
      A709PrdFecPre = GXutil.nullDate() ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A13457PrdUbicaci = "" ;
      P02NM4_A800PrvPri = new byte[1] ;
      P02NM4_n800PrvPri = new boolean[] {false} ;
      P02NM5_A666PedPri = new String[] {""} ;
      A666PedPri = "" ;
      W396EmprCod = "" ;
      W719PrdNum = "" ;
      AV42Cant = DecimalUtil.ZERO ;
      A415EntFecEnt = GXutil.nullDate() ;
      A11Albaran = "" ;
      AV35EntPre = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A3404EntPedCum = "" ;
      A5686EntLotN = "" ;
      A5685EntFVal = GXutil.nullDate() ;
      AV65sdtpRODUCTOSeTIQUETAS = new app.SdtSDTProductosEtiquetas(remoteHandle, context);
      A10187EntRemNro = "" ;
      A12857EntNAlbar = "" ;
      A13456EntUbicaci = "" ;
      Gx_emsg = "" ;
      AV38FchNull = GXutil.nullDate() ;
      GXv_int11 = new short[1] ;
      GXv_int7 = new short[1] ;
      GXv_int13 = new byte[1] ;
      GXv_int4 = new byte[1] ;
      GXv_date16 = new java.util.Date[1] ;
      AV39Station = "" ;
      GXt_char21 = "" ;
      AV40UsurCod = "" ;
      GXv_char28 = new String[1] ;
      GXv_char25 = new String[1] ;
      GXv_decimal26 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_char24 = new String[1] ;
      GXv_char23 = new String[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int27 = new int[1] ;
      GXv_int14 = new byte[1] ;
      GXv_char20 = new String[1] ;
      GXv_int22 = new int[1] ;
      GXv_char19 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int12 = new short[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_date17 = new java.util.Date[1] ;
      GXv_int2 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char29 = new String[1] ;
      P02NM10_A396EmprCod = new String[] {""} ;
      P02NM10_A658PedCod = new int[1] ;
      P02NM10_n658PedCod = new boolean[] {false} ;
      P02NM10_A667PedSit = new String[] {""} ;
      A667PedSit = "" ;
      P02NM11_A396EmprCod = new String[] {""} ;
      P02NM11_A658PedCod = new int[1] ;
      P02NM11_n658PedCod = new boolean[] {false} ;
      P02NM11_A719PrdNum = new String[] {""} ;
      P02NM11_A659PedCum = new String[] {""} ;
      A7240PrdPrea = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palmpedn__default(),
         new Object[] {
             new Object[] {
            P02NM2_A396EmprCod, P02NM2_A658PedCod, P02NM2_A719PrdNum, P02NM2_A660PedDto, P02NM2_A665PedPre, P02NM2_A669PedUni, P02NM2_A657PedCanEnt, P02NM2_A663PedFulEnt, P02NM2_A659PedCum
            }
            , new Object[] {
            P02NM3_A847UltLinEnt, P02NM3_A684PrdCanPen, P02NM3_A704PrdExiAlm, P02NM3_A718PrdNom, P02NM3_A713PrdFulEnt, P02NM3_A709PrdFecPre, P02NM3_A724PrdPreAct, P02NM3_A725PrdPreAnt, P02NM3_A795PrvNum, P02NM3_A750PrdValStk,
            P02NM3_A726PrdPreMed, P02NM3_A705PrdExiCC, P02NM3_A13457PrdUbicaci
            }
            , new Object[] {
            P02NM4_A800PrvPri, P02NM4_n800PrvPri
            }
            , new Object[] {
            P02NM5_A666PedPri
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
            P02NM10_A396EmprCod, P02NM10_A658PedCod, P02NM10_A667PedSit
            }
            , new Object[] {
            P02NM11_A396EmprCod, P02NM11_A658PedCod, P02NM11_A719PrdNum, P02NM11_A659PedCum
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

   private byte AV68EntNEmb ;
   private byte AV51Consumos ;
   private byte AV52NoUpd ;
   private byte AV53DocAut ;
   private byte AV56Nalbaran20 ;
   private byte AV59ExiLoteID ;
   private byte GXt_int3 ;
   private byte A800PrvPri ;
   private byte A411EntCon ;
   private byte A414EntEti ;
   private byte A14035EntNEmb ;
   private byte AV37Month ;
   private byte GXv_int13[] ;
   private byte GXv_int4[] ;
   private byte GXv_int14[] ;
   private short AV46i ;
   private short AV60Netiquetas ;
   private short AV31EntNumCon ;
   private short A847UltLinEnt ;
   private short A597LinEnt ;
   private short A416EntNumCon ;
   private short Gx_err ;
   private short AV36Year ;
   private short GXv_int11[] ;
   private short GXv_int7[] ;
   private short GXv_int12[] ;
   private short AV67Flag ;
   private int A658PedCod ;
   private int AV49PrvNum ;
   private int GXt_int1 ;
   private int AV32EntConIni ;
   private int AV33EntConFin ;
   private int A795PrvNum ;
   private int GX_INS42 ;
   private int A412EntConFin ;
   private int A413EntConIni ;
   private int A6156EntPrvNum ;
   private int AV54Contador ;
   private int A12716EntFabId ;
   private int GXv_int27[] ;
   private int GXv_int22[] ;
   private int GXv_int2[] ;
   private long AV57NumIdLote ;
   private long A13235EntLoteID ;
   private java.math.BigDecimal AV30PrdCnt ;
   private java.math.BigDecimal AV41PedPre ;
   private java.math.BigDecimal A660PedDto ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal AV42Cant ;
   private java.math.BigDecimal AV35EntPre ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal GXv_decimal26[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal A7240PrdPrea ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV43Albaran ;
   private String AV48EntLotn ;
   private String AV55EntNAlbar ;
   private String AV62EntUbicacion ;
   private String AV66Pedcum ;
   private String scmdbuf ;
   private String A659PedCum ;
   private String A718PrdNom ;
   private String A13457PrdUbicaci ;
   private String A666PedPri ;
   private String W396EmprCod ;
   private String W719PrdNum ;
   private String A11Albaran ;
   private String A3404EntPedCum ;
   private String A5686EntLotN ;
   private String A10187EntRemNro ;
   private String A12857EntNAlbar ;
   private String A13456EntUbicaci ;
   private String Gx_emsg ;
   private String AV39Station ;
   private String GXt_char21 ;
   private String AV40UsurCod ;
   private String GXv_char28[] ;
   private String GXv_char25[] ;
   private String GXv_char24[] ;
   private String GXv_char23[] ;
   private String GXv_char20[] ;
   private String GXv_char19[] ;
   private String GXv_char18[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char29[] ;
   private String A667PedSit ;
   private java.util.Date AV47EntFVal ;
   private java.util.Date AV50Pedfec ;
   private java.util.Date A663PedFulEnt ;
   private java.util.Date A713PrdFulEnt ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date A5685EntFVal ;
   private java.util.Date AV38FchNull ;
   private java.util.Date GXv_date16[] ;
   private java.util.Date GXv_date17[] ;
   private boolean n658PedCod ;
   private boolean n800PrvPri ;
   private boolean n6156EntPrvNum ;
   private String AV63ProductosEtiquetas ;
   private byte[] aP16 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP5 ;
   private java.util.Date[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private short[] aP9 ;
   private java.util.Date[] aP10 ;
   private int[] aP11 ;
   private String[] aP12 ;
   private short[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private IDataStoreProvider pr_default ;
   private String[] P02NM2_A396EmprCod ;
   private int[] P02NM2_A658PedCod ;
   private boolean[] P02NM2_n658PedCod ;
   private String[] P02NM2_A719PrdNum ;
   private java.math.BigDecimal[] P02NM2_A660PedDto ;
   private java.math.BigDecimal[] P02NM2_A665PedPre ;
   private java.math.BigDecimal[] P02NM2_A669PedUni ;
   private java.math.BigDecimal[] P02NM2_A657PedCanEnt ;
   private java.util.Date[] P02NM2_A663PedFulEnt ;
   private String[] P02NM2_A659PedCum ;
   private short[] P02NM3_A847UltLinEnt ;
   private java.math.BigDecimal[] P02NM3_A684PrdCanPen ;
   private java.math.BigDecimal[] P02NM3_A704PrdExiAlm ;
   private String[] P02NM3_A718PrdNom ;
   private java.util.Date[] P02NM3_A713PrdFulEnt ;
   private java.util.Date[] P02NM3_A709PrdFecPre ;
   private java.math.BigDecimal[] P02NM3_A724PrdPreAct ;
   private java.math.BigDecimal[] P02NM3_A725PrdPreAnt ;
   private int[] P02NM3_A795PrvNum ;
   private java.math.BigDecimal[] P02NM3_A750PrdValStk ;
   private java.math.BigDecimal[] P02NM3_A726PrdPreMed ;
   private java.math.BigDecimal[] P02NM3_A705PrdExiCC ;
   private String[] P02NM3_A13457PrdUbicaci ;
   private byte[] P02NM4_A800PrvPri ;
   private boolean[] P02NM4_n800PrvPri ;
   private String[] P02NM5_A666PedPri ;
   private String[] P02NM10_A396EmprCod ;
   private int[] P02NM10_A658PedCod ;
   private boolean[] P02NM10_n658PedCod ;
   private String[] P02NM10_A667PedSit ;
   private String[] P02NM11_A396EmprCod ;
   private int[] P02NM11_A658PedCod ;
   private boolean[] P02NM11_n658PedCod ;
   private String[] P02NM11_A719PrdNum ;
   private String[] P02NM11_A659PedCum ;
   private GXBaseCollection<app.SdtSDTProductosEtiquetas> AV64sdtProductosEtiquetasCollection ;
   private app.SdtSDTProductosEtiquetas AV65sdtpRODUCTOSeTIQUETAS ;
}

final  class palmpedn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02NM2", "SELECT EmprCod, PedCod, PrdNum, PedDto, PedPre, PedUni, PedCanEnt, PedFulEnt, PedCum FROM TXPLPEDID WHERE (EmprCod = ? AND PedCod = ? AND PrdNum = ?) AND (EmprCod = ? and PedCod = ? and PrdNum = ?) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02NM3", "SELECT UltLinEnt, PrdCanPen, PrdExiAlm, PrdNom, PrdFulEnt, PrdFecPre, PrdPreAct, PrdPreAnt, PrvNum, PrdValStk, PrdPreMed, PrdExiCC, PrdUbicaci FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02NM4", "SELECT PrvPri FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02NM5", "SELECT PedPri FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02NM6", "INSERT INTO TXPENTALM(EmprCod, PrdNum, LinEnt, Albaran, PedCod, EntUniEnt, EntPre, EntNumCon, EntUniRem, EntEti, EntCon, EntFecEnt, EntConIni, EntConFin, EntPedCum, EntFVal, EntLotN, EntPrvNum, EntRemNro, EntFabId, EntNAlbar, EntLoteID, EntUbicaci, EntNEmb, EntNro, EntBnc, EntCC, EntCCoCod, EntRemTpo, EntRemSuc, EntRemFch, EntUniAlb, EntObs, EntHfCon, EntFfCon, EntHiCon, EntFiCon) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new UpdateCursor("P02NM7", "UPDATE TXPPRODUC SET UltLinEnt=?, PrdCanPen=?, PrdExiAlm=?, PrdFulEnt=?, PrdFecPre=?, PrdPreAct=?, PrdPreAnt=?, PrvNum=?, PrdValStk=?, PrdPreMed=?, PrdUbicaci=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new UpdateCursor("P02NM8", "UPDATE TXPCPEDID SET PedPri=?  WHERE EmprCod = ? AND PedCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPEDID")
         ,new UpdateCursor("P02NM9", "UPDATE TXPLPEDID SET PedPre=?, PedCanEnt=?, PedFulEnt=?, PedCum=?  WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPEDID")
         ,new ForEachCursor("P02NM10", "SELECT EmprCod, PedCod, PedSit FROM TXPCPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02NM11", "SELECT EmprCod, PedCod, PrdNum, PedCum FROM TXPLPEDID WHERE EmprCod = ? and PedCod = ? and PrdNum = ? ORDER BY EmprCod, PedCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02NM12", "UPDATE TXPCPEDID SET PedSit=?  WHERE EmprCod = ? AND PedCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPEDID")
         ,new UpdateCursor("P02NM13", "UPDATE TXPPROPRV SET PrdPrea=?  WHERE EmprCod = ? and PrdNum = ? and PrdPrv = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROPRV")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,4);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               stmt.setString(4, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               stmt.setString(6, (String)parms[7], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 10);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 5);
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 4);
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               stmt.setByte(11, ((Number) parms[11]).byteValue());
               stmt.setDate(12, (java.util.Date)parms[12]);
               stmt.setInt(13, ((Number) parms[13]).intValue());
               stmt.setInt(14, ((Number) parms[14]).intValue());
               stmt.setString(15, (String)parms[15], 1);
               stmt.setDate(16, (java.util.Date)parms[16]);
               stmt.setString(17, (String)parms[17], 26);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[19]).intValue());
               }
               stmt.setString(19, (String)parms[20], 12);
               stmt.setInt(20, ((Number) parms[21]).intValue());
               stmt.setString(21, (String)parms[22], 20);
               stmt.setLong(22, ((Number) parms[23]).longValue());
               stmt.setString(23, (String)parms[24], 20);
               stmt.setByte(24, ((Number) parms[25]).byteValue());
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 5);
               stmt.setString(11, (String)parms[10], 20);
               stmt.setString(12, (String)parms[11], 3);
               stmt.setString(13, (String)parms[12], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 7 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[6]).intValue());
               }
               stmt.setString(7, (String)parms[7], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 11 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

