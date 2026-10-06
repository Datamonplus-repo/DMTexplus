package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prpi008 extends GXProcedure
{
   public prpi008( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prpi008.class ), "" );
   }

   public prpi008( int remoteHandle ,
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
                             byte[] aP5 )
   {
      prpi008.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      prpi008.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prpi008.this.AV8Barcod = aP1[0];
      this.aP1 = aP1;
      prpi008.this.AV9Barcodreo = aP2[0];
      this.aP2 = aP2;
      prpi008.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      prpi008.this.AV11Barcodnew = aP4[0];
      this.aP4 = aP4;
      prpi008.this.AV12barcodreonew = aP5[0];
      this.aP5 = aP5;
      prpi008.this.AV13barcodparnew = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05CI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9613Lb_Hdrp = P05CI2_A9613Lb_Hdrp[0] ;
         A9612Lb_Hdrr = P05CI2_A9612Lb_Hdrr[0] ;
         A9611Lb_Hdr = P05CI2_A9611Lb_Hdr[0] ;
         A13221BCSd009 = P05CI2_A13221BCSd009[0] ;
         n13221BCSd009 = P05CI2_n13221BCSd009[0] ;
         A13229BCSd008 = P05CI2_A13229BCSd008[0] ;
         n13229BCSd008 = P05CI2_n13229BCSd008[0] ;
         A13228BCSd007 = P05CI2_A13228BCSd007[0] ;
         n13228BCSd007 = P05CI2_n13228BCSd007[0] ;
         A13227BCSd006 = P05CI2_A13227BCSd006[0] ;
         n13227BCSd006 = P05CI2_n13227BCSd006[0] ;
         A13226BCSd005 = P05CI2_A13226BCSd005[0] ;
         n13226BCSd005 = P05CI2_n13226BCSd005[0] ;
         A13225BCSd004 = P05CI2_A13225BCSd004[0] ;
         n13225BCSd004 = P05CI2_n13225BCSd004[0] ;
         A13224BCSd003 = P05CI2_A13224BCSd003[0] ;
         n13224BCSd003 = P05CI2_n13224BCSd003[0] ;
         A13223BCSd002 = P05CI2_A13223BCSd002[0] ;
         n13223BCSd002 = P05CI2_n13223BCSd002[0] ;
         A13222BCSd001 = P05CI2_A13222BCSd001[0] ;
         n13222BCSd001 = P05CI2_n13222BCSd001[0] ;
         A12899Sedo14 = P05CI2_A12899Sedo14[0] ;
         n12899Sedo14 = P05CI2_n12899Sedo14[0] ;
         A12898Sedo13 = P05CI2_A12898Sedo13[0] ;
         n12898Sedo13 = P05CI2_n12898Sedo13[0] ;
         A12897Sedo12 = P05CI2_A12897Sedo12[0] ;
         n12897Sedo12 = P05CI2_n12897Sedo12[0] ;
         A12640Lb_FecEm = P05CI2_A12640Lb_FecEm[0] ;
         n12640Lb_FecEm = P05CI2_n12640Lb_FecEm[0] ;
         A12639Lb_FecCd = P05CI2_A12639Lb_FecCd[0] ;
         n12639Lb_FecCd = P05CI2_n12639Lb_FecCd[0] ;
         A12612Lb_FecRm = P05CI2_A12612Lb_FecRm[0] ;
         n12612Lb_FecRm = P05CI2_n12612Lb_FecRm[0] ;
         A12611Lb_FecSf = P05CI2_A12611Lb_FecSf[0] ;
         n12611Lb_FecSf = P05CI2_n12611Lb_FecSf[0] ;
         A12604Lb_FecTef = P05CI2_A12604Lb_FecTef[0] ;
         n12604Lb_FecTef = P05CI2_n12604Lb_FecTef[0] ;
         A12603Lb_FecAcb = P05CI2_A12603Lb_FecAcb[0] ;
         n12603Lb_FecAcb = P05CI2_n12603Lb_FecAcb[0] ;
         A12602Lb_FecFev = P05CI2_A12602Lb_FecFev[0] ;
         n12602Lb_FecFev = P05CI2_n12602Lb_FecFev[0] ;
         A12601Lb_FecVTf = P05CI2_A12601Lb_FecVTf[0] ;
         n12601Lb_FecVTf = P05CI2_n12601Lb_FecVTf[0] ;
         A12269Sedo11 = P05CI2_A12269Sedo11[0] ;
         n12269Sedo11 = P05CI2_n12269Sedo11[0] ;
         A12268Sedo10 = P05CI2_A12268Sedo10[0] ;
         n12268Sedo10 = P05CI2_n12268Sedo10[0] ;
         A12267Sedo9 = P05CI2_A12267Sedo9[0] ;
         n12267Sedo9 = P05CI2_n12267Sedo9[0] ;
         A12266Sedo8 = P05CI2_A12266Sedo8[0] ;
         n12266Sedo8 = P05CI2_n12266Sedo8[0] ;
         A12265Sedo7 = P05CI2_A12265Sedo7[0] ;
         n12265Sedo7 = P05CI2_n12265Sedo7[0] ;
         A10821Lb_IDMFC = P05CI2_A10821Lb_IDMFC[0] ;
         n10821Lb_IDMFC = P05CI2_n10821Lb_IDMFC[0] ;
         A10820Lb_IDMF = P05CI2_A10820Lb_IDMF[0] ;
         n10820Lb_IDMF = P05CI2_n10820Lb_IDMF[0] ;
         A10819Lb_IDMS = P05CI2_A10819Lb_IDMS[0] ;
         n10819Lb_IDMS = P05CI2_n10819Lb_IDMS[0] ;
         A10818Lb_IDMO = P05CI2_A10818Lb_IDMO[0] ;
         n10818Lb_IDMO = P05CI2_n10818Lb_IDMO[0] ;
         A10817Lb_IDMP = P05CI2_A10817Lb_IDMP[0] ;
         n10817Lb_IDMP = P05CI2_n10817Lb_IDMP[0] ;
         A10135Lb_UbUb = P05CI2_A10135Lb_UbUb[0] ;
         n10135Lb_UbUb = P05CI2_n10135Lb_UbUb[0] ;
         A10148Lb_UbPzs = P05CI2_A10148Lb_UbPzs[0] ;
         n10148Lb_UbPzs = P05CI2_n10148Lb_UbPzs[0] ;
         A10153Lb_HhTin = P05CI2_A10153Lb_HhTin[0] ;
         n10153Lb_HhTin = P05CI2_n10153Lb_HhTin[0] ;
         A10138Lb_HhOut = P05CI2_A10138Lb_HhOut[0] ;
         n10138Lb_HhOut = P05CI2_n10138Lb_HhOut[0] ;
         A10152Lb_HhIn = P05CI2_A10152Lb_HhIn[0] ;
         n10152Lb_HhIn = P05CI2_n10152Lb_HhIn[0] ;
         A10110Sedo6 = P05CI2_A10110Sedo6[0] ;
         n10110Sedo6 = P05CI2_n10110Sedo6[0] ;
         A10109Sedo5 = P05CI2_A10109Sedo5[0] ;
         n10109Sedo5 = P05CI2_n10109Sedo5[0] ;
         A10108Sedo4 = P05CI2_A10108Sedo4[0] ;
         n10108Sedo4 = P05CI2_n10108Sedo4[0] ;
         A10107Sedo3 = P05CI2_A10107Sedo3[0] ;
         n10107Sedo3 = P05CI2_n10107Sedo3[0] ;
         A10106Sedo2 = P05CI2_A10106Sedo2[0] ;
         n10106Sedo2 = P05CI2_n10106Sedo2[0] ;
         A10105Sedo1 = P05CI2_A10105Sedo1[0] ;
         n10105Sedo1 = P05CI2_n10105Sedo1[0] ;
         A9857Ex_Obs = P05CI2_A9857Ex_Obs[0] ;
         n9857Ex_Obs = P05CI2_n9857Ex_Obs[0] ;
         A9721Lb_obsprb = P05CI2_A9721Lb_obsprb[0] ;
         n9721Lb_obsprb = P05CI2_n9721Lb_obsprb[0] ;
         A9709Lb_obsout = P05CI2_A9709Lb_obsout[0] ;
         n9709Lb_obsout = P05CI2_n9709Lb_obsout[0] ;
         A9703Lb_FecAcF = P05CI2_A9703Lb_FecAcF[0] ;
         n9703Lb_FecAcF = P05CI2_n9703Lb_FecAcF[0] ;
         A9702Lb_FecPAc = P05CI2_A9702Lb_FecPAc[0] ;
         n9702Lb_FecPAc = P05CI2_n9702Lb_FecPAc[0] ;
         A9625Lb_obsin = P05CI2_A9625Lb_obsin[0] ;
         n9625Lb_obsin = P05CI2_n9625Lb_obsin[0] ;
         A9624Lb_UsuTin = P05CI2_A9624Lb_UsuTin[0] ;
         n9624Lb_UsuTin = P05CI2_n9624Lb_UsuTin[0] ;
         A9623Lb_FecTin = P05CI2_A9623Lb_FecTin[0] ;
         n9623Lb_FecTin = P05CI2_n9623Lb_FecTin[0] ;
         A9618Lb_inout = P05CI2_A9618Lb_inout[0] ;
         n9618Lb_inout = P05CI2_n9618Lb_inout[0] ;
         A9617Lb_FecOut = P05CI2_A9617Lb_FecOut[0] ;
         n9617Lb_FecOut = P05CI2_n9617Lb_FecOut[0] ;
         A9616Lb_UsuOut = P05CI2_A9616Lb_UsuOut[0] ;
         n9616Lb_UsuOut = P05CI2_n9616Lb_UsuOut[0] ;
         A9615Lb_FecIn = P05CI2_A9615Lb_FecIn[0] ;
         n9615Lb_FecIn = P05CI2_n9615Lb_FecIn[0] ;
         A9614Lb_UsuIn = P05CI2_A9614Lb_UsuIn[0] ;
         n9614Lb_UsuIn = P05CI2_n9614Lb_UsuIn[0] ;
         W396EmprCod = A396EmprCod ;
         W9611Lb_Hdr = A9611Lb_Hdr ;
         W9612Lb_Hdrr = A9612Lb_Hdrr ;
         W9613Lb_Hdrp = A9613Lb_Hdrp ;
         /*
            INSERT RECORD ON TABLE TXPHDRINO

         */
         W396EmprCod = A396EmprCod ;
         W9611Lb_Hdr = A9611Lb_Hdr ;
         W9612Lb_Hdrr = A9612Lb_Hdrr ;
         W9613Lb_Hdrp = A9613Lb_Hdrp ;
         A9611Lb_Hdr = AV11Barcodnew ;
         A9612Lb_Hdrr = AV12barcodreonew ;
         A9613Lb_Hdrp = AV13barcodparnew ;
         /* Using cursor P05CI3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp, Boolean.valueOf(n9614Lb_UsuIn), A9614Lb_UsuIn, Boolean.valueOf(n9615Lb_FecIn), A9615Lb_FecIn, Boolean.valueOf(n9616Lb_UsuOut), A9616Lb_UsuOut, Boolean.valueOf(n9617Lb_FecOut), A9617Lb_FecOut, Boolean.valueOf(n9618Lb_inout), Byte.valueOf(A9618Lb_inout), Boolean.valueOf(n9623Lb_FecTin), A9623Lb_FecTin, Boolean.valueOf(n9624Lb_UsuTin), A9624Lb_UsuTin, Boolean.valueOf(n9625Lb_obsin), A9625Lb_obsin, Boolean.valueOf(n9702Lb_FecPAc), A9702Lb_FecPAc, Boolean.valueOf(n9703Lb_FecAcF), A9703Lb_FecAcF, Boolean.valueOf(n9709Lb_obsout), A9709Lb_obsout, Boolean.valueOf(n9721Lb_obsprb), A9721Lb_obsprb, Boolean.valueOf(n9857Ex_Obs), A9857Ex_Obs, Boolean.valueOf(n10105Sedo1), A10105Sedo1, Boolean.valueOf(n10106Sedo2), A10106Sedo2, Boolean.valueOf(n10107Sedo3), Short.valueOf(A10107Sedo3), Boolean.valueOf(n10108Sedo4), A10108Sedo4, Boolean.valueOf(n10109Sedo5), Byte.valueOf(A10109Sedo5), Boolean.valueOf(n10110Sedo6), Byte.valueOf(A10110Sedo6), Boolean.valueOf(n10152Lb_HhIn), A10152Lb_HhIn, Boolean.valueOf(n10138Lb_HhOut), A10138Lb_HhOut, Boolean.valueOf(n10153Lb_HhTin), A10153Lb_HhTin, Boolean.valueOf(n10148Lb_UbPzs), Integer.valueOf(A10148Lb_UbPzs), Boolean.valueOf(n10135Lb_UbUb), A10135Lb_UbUb, Boolean.valueOf(n10817Lb_IDMP), Integer.valueOf(A10817Lb_IDMP), Boolean.valueOf(n10818Lb_IDMO), A10818Lb_IDMO, Boolean.valueOf(n10819Lb_IDMS), Byte.valueOf(A10819Lb_IDMS), Boolean.valueOf(n10820Lb_IDMF), A10820Lb_IDMF, Boolean.valueOf(n10821Lb_IDMFC), A10821Lb_IDMFC, Boolean.valueOf(n12265Sedo7), A12265Sedo7, Boolean.valueOf(n12266Sedo8), A12266Sedo8, Boolean.valueOf(n12267Sedo9), Short.valueOf(A12267Sedo9), Boolean.valueOf(n12268Sedo10), Short.valueOf(A12268Sedo10), Boolean.valueOf(n12269Sedo11), Short.valueOf(A12269Sedo11), Boolean.valueOf(n12601Lb_FecVTf), A12601Lb_FecVTf, Boolean.valueOf(n12602Lb_FecFev), A12602Lb_FecFev, Boolean.valueOf(n12603Lb_FecAcb), A12603Lb_FecAcb, Boolean.valueOf(n12604Lb_FecTef), A12604Lb_FecTef, Boolean.valueOf(n12611Lb_FecSf), A12611Lb_FecSf, Boolean.valueOf(n12612Lb_FecRm), A12612Lb_FecRm, Boolean.valueOf(n12639Lb_FecCd), A12639Lb_FecCd, Boolean.valueOf(n12640Lb_FecEm), A12640Lb_FecEm, Boolean.valueOf(n12897Sedo12), Short.valueOf(A12897Sedo12), Boolean.valueOf(n12898Sedo13), Short.valueOf(A12898Sedo13), Boolean.valueOf(n12899Sedo14), Integer.valueOf(A12899Sedo14), Boolean.valueOf(n13222BCSd001), Byte.valueOf(A13222BCSd001), Boolean.valueOf(n13223BCSd002), Short.valueOf(A13223BCSd002), Boolean.valueOf(n13224BCSd003), Integer.valueOf(A13224BCSd003), Boolean.valueOf(n13225BCSd004), Short.valueOf(A13225BCSd004), Boolean.valueOf(n13226BCSd005), Short.valueOf(A13226BCSd005), Boolean.valueOf(n13227BCSd006), Integer.valueOf(A13227BCSd006), Boolean.valueOf(n13228BCSd007), Byte.valueOf(A13228BCSd007), Boolean.valueOf(n13229BCSd008), Short.valueOf(A13229BCSd008), Boolean.valueOf(n13221BCSd009), A13221BCSd009});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRINO");
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
         A9611Lb_Hdr = W9611Lb_Hdr ;
         A9612Lb_Hdrr = W9612Lb_Hdrr ;
         A9613Lb_Hdrp = W9613Lb_Hdrp ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A9611Lb_Hdr = W9611Lb_Hdr ;
         A9612Lb_Hdrr = W9612Lb_Hdrr ;
         A9613Lb_Hdrp = W9613Lb_Hdrp ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prpi008.this.A396EmprCod;
      this.aP1[0] = prpi008.this.AV8Barcod;
      this.aP2[0] = prpi008.this.AV9Barcodreo;
      this.aP3[0] = prpi008.this.AV10Barcodpar;
      this.aP4[0] = prpi008.this.AV11Barcodnew;
      this.aP5[0] = prpi008.this.AV12barcodreonew;
      this.aP6[0] = prpi008.this.AV13barcodparnew;
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
      P05CI2_A396EmprCod = new String[] {""} ;
      P05CI2_A9613Lb_Hdrp = new String[] {""} ;
      P05CI2_A9612Lb_Hdrr = new byte[1] ;
      P05CI2_A9611Lb_Hdr = new int[1] ;
      P05CI2_A13221BCSd009 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05CI2_n13221BCSd009 = new boolean[] {false} ;
      P05CI2_A13229BCSd008 = new short[1] ;
      P05CI2_n13229BCSd008 = new boolean[] {false} ;
      P05CI2_A13228BCSd007 = new byte[1] ;
      P05CI2_n13228BCSd007 = new boolean[] {false} ;
      P05CI2_A13227BCSd006 = new int[1] ;
      P05CI2_n13227BCSd006 = new boolean[] {false} ;
      P05CI2_A13226BCSd005 = new short[1] ;
      P05CI2_n13226BCSd005 = new boolean[] {false} ;
      P05CI2_A13225BCSd004 = new short[1] ;
      P05CI2_n13225BCSd004 = new boolean[] {false} ;
      P05CI2_A13224BCSd003 = new int[1] ;
      P05CI2_n13224BCSd003 = new boolean[] {false} ;
      P05CI2_A13223BCSd002 = new short[1] ;
      P05CI2_n13223BCSd002 = new boolean[] {false} ;
      P05CI2_A13222BCSd001 = new byte[1] ;
      P05CI2_n13222BCSd001 = new boolean[] {false} ;
      P05CI2_A12899Sedo14 = new int[1] ;
      P05CI2_n12899Sedo14 = new boolean[] {false} ;
      P05CI2_A12898Sedo13 = new short[1] ;
      P05CI2_n12898Sedo13 = new boolean[] {false} ;
      P05CI2_A12897Sedo12 = new short[1] ;
      P05CI2_n12897Sedo12 = new boolean[] {false} ;
      P05CI2_A12640Lb_FecEm = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n12640Lb_FecEm = new boolean[] {false} ;
      P05CI2_A12639Lb_FecCd = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n12639Lb_FecCd = new boolean[] {false} ;
      P05CI2_A12612Lb_FecRm = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n12612Lb_FecRm = new boolean[] {false} ;
      P05CI2_A12611Lb_FecSf = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n12611Lb_FecSf = new boolean[] {false} ;
      P05CI2_A12604Lb_FecTef = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n12604Lb_FecTef = new boolean[] {false} ;
      P05CI2_A12603Lb_FecAcb = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n12603Lb_FecAcb = new boolean[] {false} ;
      P05CI2_A12602Lb_FecFev = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n12602Lb_FecFev = new boolean[] {false} ;
      P05CI2_A12601Lb_FecVTf = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n12601Lb_FecVTf = new boolean[] {false} ;
      P05CI2_A12269Sedo11 = new short[1] ;
      P05CI2_n12269Sedo11 = new boolean[] {false} ;
      P05CI2_A12268Sedo10 = new short[1] ;
      P05CI2_n12268Sedo10 = new boolean[] {false} ;
      P05CI2_A12267Sedo9 = new short[1] ;
      P05CI2_n12267Sedo9 = new boolean[] {false} ;
      P05CI2_A12266Sedo8 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05CI2_n12266Sedo8 = new boolean[] {false} ;
      P05CI2_A12265Sedo7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05CI2_n12265Sedo7 = new boolean[] {false} ;
      P05CI2_A10821Lb_IDMFC = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n10821Lb_IDMFC = new boolean[] {false} ;
      P05CI2_A10820Lb_IDMF = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n10820Lb_IDMF = new boolean[] {false} ;
      P05CI2_A10819Lb_IDMS = new byte[1] ;
      P05CI2_n10819Lb_IDMS = new boolean[] {false} ;
      P05CI2_A10818Lb_IDMO = new String[] {""} ;
      P05CI2_n10818Lb_IDMO = new boolean[] {false} ;
      P05CI2_A10817Lb_IDMP = new int[1] ;
      P05CI2_n10817Lb_IDMP = new boolean[] {false} ;
      P05CI2_A10135Lb_UbUb = new String[] {""} ;
      P05CI2_n10135Lb_UbUb = new boolean[] {false} ;
      P05CI2_A10148Lb_UbPzs = new int[1] ;
      P05CI2_n10148Lb_UbPzs = new boolean[] {false} ;
      P05CI2_A10153Lb_HhTin = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n10153Lb_HhTin = new boolean[] {false} ;
      P05CI2_A10138Lb_HhOut = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n10138Lb_HhOut = new boolean[] {false} ;
      P05CI2_A10152Lb_HhIn = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n10152Lb_HhIn = new boolean[] {false} ;
      P05CI2_A10110Sedo6 = new byte[1] ;
      P05CI2_n10110Sedo6 = new boolean[] {false} ;
      P05CI2_A10109Sedo5 = new byte[1] ;
      P05CI2_n10109Sedo5 = new boolean[] {false} ;
      P05CI2_A10108Sedo4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05CI2_n10108Sedo4 = new boolean[] {false} ;
      P05CI2_A10107Sedo3 = new short[1] ;
      P05CI2_n10107Sedo3 = new boolean[] {false} ;
      P05CI2_A10106Sedo2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05CI2_n10106Sedo2 = new boolean[] {false} ;
      P05CI2_A10105Sedo1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05CI2_n10105Sedo1 = new boolean[] {false} ;
      P05CI2_A9857Ex_Obs = new String[] {""} ;
      P05CI2_n9857Ex_Obs = new boolean[] {false} ;
      P05CI2_A9721Lb_obsprb = new String[] {""} ;
      P05CI2_n9721Lb_obsprb = new boolean[] {false} ;
      P05CI2_A9709Lb_obsout = new String[] {""} ;
      P05CI2_n9709Lb_obsout = new boolean[] {false} ;
      P05CI2_A9703Lb_FecAcF = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n9703Lb_FecAcF = new boolean[] {false} ;
      P05CI2_A9702Lb_FecPAc = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n9702Lb_FecPAc = new boolean[] {false} ;
      P05CI2_A9625Lb_obsin = new String[] {""} ;
      P05CI2_n9625Lb_obsin = new boolean[] {false} ;
      P05CI2_A9624Lb_UsuTin = new String[] {""} ;
      P05CI2_n9624Lb_UsuTin = new boolean[] {false} ;
      P05CI2_A9623Lb_FecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n9623Lb_FecTin = new boolean[] {false} ;
      P05CI2_A9618Lb_inout = new byte[1] ;
      P05CI2_n9618Lb_inout = new boolean[] {false} ;
      P05CI2_A9617Lb_FecOut = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n9617Lb_FecOut = new boolean[] {false} ;
      P05CI2_A9616Lb_UsuOut = new String[] {""} ;
      P05CI2_n9616Lb_UsuOut = new boolean[] {false} ;
      P05CI2_A9615Lb_FecIn = new java.util.Date[] {GXutil.nullDate()} ;
      P05CI2_n9615Lb_FecIn = new boolean[] {false} ;
      P05CI2_A9614Lb_UsuIn = new String[] {""} ;
      P05CI2_n9614Lb_UsuIn = new boolean[] {false} ;
      A9613Lb_Hdrp = "" ;
      A13221BCSd009 = DecimalUtil.ZERO ;
      A12640Lb_FecEm = GXutil.nullDate() ;
      A12639Lb_FecCd = GXutil.nullDate() ;
      A12612Lb_FecRm = GXutil.nullDate() ;
      A12611Lb_FecSf = GXutil.nullDate() ;
      A12604Lb_FecTef = GXutil.nullDate() ;
      A12603Lb_FecAcb = GXutil.nullDate() ;
      A12602Lb_FecFev = GXutil.nullDate() ;
      A12601Lb_FecVTf = GXutil.nullDate() ;
      A12266Sedo8 = DecimalUtil.ZERO ;
      A12265Sedo7 = DecimalUtil.ZERO ;
      A10821Lb_IDMFC = GXutil.resetTime( GXutil.nullDate() );
      A10820Lb_IDMF = GXutil.resetTime( GXutil.nullDate() );
      A10818Lb_IDMO = "" ;
      A10135Lb_UbUb = "" ;
      A10153Lb_HhTin = GXutil.resetTime( GXutil.nullDate() );
      A10138Lb_HhOut = GXutil.resetTime( GXutil.nullDate() );
      A10152Lb_HhIn = GXutil.resetTime( GXutil.nullDate() );
      A10108Sedo4 = DecimalUtil.ZERO ;
      A10106Sedo2 = DecimalUtil.ZERO ;
      A10105Sedo1 = DecimalUtil.ZERO ;
      A9857Ex_Obs = "" ;
      A9721Lb_obsprb = "" ;
      A9709Lb_obsout = "" ;
      A9703Lb_FecAcF = GXutil.nullDate() ;
      A9702Lb_FecPAc = GXutil.nullDate() ;
      A9625Lb_obsin = "" ;
      A9624Lb_UsuTin = "" ;
      A9623Lb_FecTin = GXutil.nullDate() ;
      A9617Lb_FecOut = GXutil.nullDate() ;
      A9616Lb_UsuOut = "" ;
      A9615Lb_FecIn = GXutil.nullDate() ;
      A9614Lb_UsuIn = "" ;
      W396EmprCod = "" ;
      W9613Lb_Hdrp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prpi008__default(),
         new Object[] {
             new Object[] {
            P05CI2_A396EmprCod, P05CI2_A9613Lb_Hdrp, P05CI2_A9612Lb_Hdrr, P05CI2_A9611Lb_Hdr, P05CI2_A13221BCSd009, P05CI2_n13221BCSd009, P05CI2_A13229BCSd008, P05CI2_n13229BCSd008, P05CI2_A13228BCSd007, P05CI2_n13228BCSd007,
            P05CI2_A13227BCSd006, P05CI2_n13227BCSd006, P05CI2_A13226BCSd005, P05CI2_n13226BCSd005, P05CI2_A13225BCSd004, P05CI2_n13225BCSd004, P05CI2_A13224BCSd003, P05CI2_n13224BCSd003, P05CI2_A13223BCSd002, P05CI2_n13223BCSd002,
            P05CI2_A13222BCSd001, P05CI2_n13222BCSd001, P05CI2_A12899Sedo14, P05CI2_n12899Sedo14, P05CI2_A12898Sedo13, P05CI2_n12898Sedo13, P05CI2_A12897Sedo12, P05CI2_n12897Sedo12, P05CI2_A12640Lb_FecEm, P05CI2_n12640Lb_FecEm,
            P05CI2_A12639Lb_FecCd, P05CI2_n12639Lb_FecCd, P05CI2_A12612Lb_FecRm, P05CI2_n12612Lb_FecRm, P05CI2_A12611Lb_FecSf, P05CI2_n12611Lb_FecSf, P05CI2_A12604Lb_FecTef, P05CI2_n12604Lb_FecTef, P05CI2_A12603Lb_FecAcb, P05CI2_n12603Lb_FecAcb,
            P05CI2_A12602Lb_FecFev, P05CI2_n12602Lb_FecFev, P05CI2_A12601Lb_FecVTf, P05CI2_n12601Lb_FecVTf, P05CI2_A12269Sedo11, P05CI2_n12269Sedo11, P05CI2_A12268Sedo10, P05CI2_n12268Sedo10, P05CI2_A12267Sedo9, P05CI2_n12267Sedo9,
            P05CI2_A12266Sedo8, P05CI2_n12266Sedo8, P05CI2_A12265Sedo7, P05CI2_n12265Sedo7, P05CI2_A10821Lb_IDMFC, P05CI2_n10821Lb_IDMFC, P05CI2_A10820Lb_IDMF, P05CI2_n10820Lb_IDMF, P05CI2_A10819Lb_IDMS, P05CI2_n10819Lb_IDMS,
            P05CI2_A10818Lb_IDMO, P05CI2_n10818Lb_IDMO, P05CI2_A10817Lb_IDMP, P05CI2_n10817Lb_IDMP, P05CI2_A10135Lb_UbUb, P05CI2_n10135Lb_UbUb, P05CI2_A10148Lb_UbPzs, P05CI2_n10148Lb_UbPzs, P05CI2_A10153Lb_HhTin, P05CI2_n10153Lb_HhTin,
            P05CI2_A10138Lb_HhOut, P05CI2_n10138Lb_HhOut, P05CI2_A10152Lb_HhIn, P05CI2_n10152Lb_HhIn, P05CI2_A10110Sedo6, P05CI2_n10110Sedo6, P05CI2_A10109Sedo5, P05CI2_n10109Sedo5, P05CI2_A10108Sedo4, P05CI2_n10108Sedo4,
            P05CI2_A10107Sedo3, P05CI2_n10107Sedo3, P05CI2_A10106Sedo2, P05CI2_n10106Sedo2, P05CI2_A10105Sedo1, P05CI2_n10105Sedo1, P05CI2_A9857Ex_Obs, P05CI2_n9857Ex_Obs, P05CI2_A9721Lb_obsprb, P05CI2_n9721Lb_obsprb,
            P05CI2_A9709Lb_obsout, P05CI2_n9709Lb_obsout, P05CI2_A9703Lb_FecAcF, P05CI2_n9703Lb_FecAcF, P05CI2_A9702Lb_FecPAc, P05CI2_n9702Lb_FecPAc, P05CI2_A9625Lb_obsin, P05CI2_n9625Lb_obsin, P05CI2_A9624Lb_UsuTin, P05CI2_n9624Lb_UsuTin,
            P05CI2_A9623Lb_FecTin, P05CI2_n9623Lb_FecTin, P05CI2_A9618Lb_inout, P05CI2_n9618Lb_inout, P05CI2_A9617Lb_FecOut, P05CI2_n9617Lb_FecOut, P05CI2_A9616Lb_UsuOut, P05CI2_n9616Lb_UsuOut, P05CI2_A9615Lb_FecIn, P05CI2_n9615Lb_FecIn,
            P05CI2_A9614Lb_UsuIn, P05CI2_n9614Lb_UsuIn
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Barcodreo ;
   private byte AV12barcodreonew ;
   private byte A9612Lb_Hdrr ;
   private byte A13228BCSd007 ;
   private byte A13222BCSd001 ;
   private byte A10819Lb_IDMS ;
   private byte A10110Sedo6 ;
   private byte A10109Sedo5 ;
   private byte A9618Lb_inout ;
   private byte W9612Lb_Hdrr ;
   private short A13229BCSd008 ;
   private short A13226BCSd005 ;
   private short A13225BCSd004 ;
   private short A13223BCSd002 ;
   private short A12898Sedo13 ;
   private short A12897Sedo12 ;
   private short A12269Sedo11 ;
   private short A12268Sedo10 ;
   private short A12267Sedo9 ;
   private short A10107Sedo3 ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int AV11Barcodnew ;
   private int A9611Lb_Hdr ;
   private int A13227BCSd006 ;
   private int A13224BCSd003 ;
   private int A12899Sedo14 ;
   private int A10817Lb_IDMP ;
   private int A10148Lb_UbPzs ;
   private int W9611Lb_Hdr ;
   private int GX_INS1373 ;
   private java.math.BigDecimal A13221BCSd009 ;
   private java.math.BigDecimal A12266Sedo8 ;
   private java.math.BigDecimal A12265Sedo7 ;
   private java.math.BigDecimal A10108Sedo4 ;
   private java.math.BigDecimal A10106Sedo2 ;
   private java.math.BigDecimal A10105Sedo1 ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private String AV13barcodparnew ;
   private String scmdbuf ;
   private String A9613Lb_Hdrp ;
   private String A10135Lb_UbUb ;
   private String A9624Lb_UsuTin ;
   private String A9616Lb_UsuOut ;
   private String A9614Lb_UsuIn ;
   private String W396EmprCod ;
   private String W9613Lb_Hdrp ;
   private String Gx_emsg ;
   private java.util.Date A10821Lb_IDMFC ;
   private java.util.Date A10820Lb_IDMF ;
   private java.util.Date A10153Lb_HhTin ;
   private java.util.Date A10138Lb_HhOut ;
   private java.util.Date A10152Lb_HhIn ;
   private java.util.Date A12640Lb_FecEm ;
   private java.util.Date A12639Lb_FecCd ;
   private java.util.Date A12612Lb_FecRm ;
   private java.util.Date A12611Lb_FecSf ;
   private java.util.Date A12604Lb_FecTef ;
   private java.util.Date A12603Lb_FecAcb ;
   private java.util.Date A12602Lb_FecFev ;
   private java.util.Date A12601Lb_FecVTf ;
   private java.util.Date A9703Lb_FecAcF ;
   private java.util.Date A9702Lb_FecPAc ;
   private java.util.Date A9623Lb_FecTin ;
   private java.util.Date A9617Lb_FecOut ;
   private java.util.Date A9615Lb_FecIn ;
   private boolean n13221BCSd009 ;
   private boolean n13229BCSd008 ;
   private boolean n13228BCSd007 ;
   private boolean n13227BCSd006 ;
   private boolean n13226BCSd005 ;
   private boolean n13225BCSd004 ;
   private boolean n13224BCSd003 ;
   private boolean n13223BCSd002 ;
   private boolean n13222BCSd001 ;
   private boolean n12899Sedo14 ;
   private boolean n12898Sedo13 ;
   private boolean n12897Sedo12 ;
   private boolean n12640Lb_FecEm ;
   private boolean n12639Lb_FecCd ;
   private boolean n12612Lb_FecRm ;
   private boolean n12611Lb_FecSf ;
   private boolean n12604Lb_FecTef ;
   private boolean n12603Lb_FecAcb ;
   private boolean n12602Lb_FecFev ;
   private boolean n12601Lb_FecVTf ;
   private boolean n12269Sedo11 ;
   private boolean n12268Sedo10 ;
   private boolean n12267Sedo9 ;
   private boolean n12266Sedo8 ;
   private boolean n12265Sedo7 ;
   private boolean n10821Lb_IDMFC ;
   private boolean n10820Lb_IDMF ;
   private boolean n10819Lb_IDMS ;
   private boolean n10818Lb_IDMO ;
   private boolean n10817Lb_IDMP ;
   private boolean n10135Lb_UbUb ;
   private boolean n10148Lb_UbPzs ;
   private boolean n10153Lb_HhTin ;
   private boolean n10138Lb_HhOut ;
   private boolean n10152Lb_HhIn ;
   private boolean n10110Sedo6 ;
   private boolean n10109Sedo5 ;
   private boolean n10108Sedo4 ;
   private boolean n10107Sedo3 ;
   private boolean n10106Sedo2 ;
   private boolean n10105Sedo1 ;
   private boolean n9857Ex_Obs ;
   private boolean n9721Lb_obsprb ;
   private boolean n9709Lb_obsout ;
   private boolean n9703Lb_FecAcF ;
   private boolean n9702Lb_FecPAc ;
   private boolean n9625Lb_obsin ;
   private boolean n9624Lb_UsuTin ;
   private boolean n9623Lb_FecTin ;
   private boolean n9618Lb_inout ;
   private boolean n9617Lb_FecOut ;
   private boolean n9616Lb_UsuOut ;
   private boolean n9615Lb_FecIn ;
   private boolean n9614Lb_UsuIn ;
   private String A10818Lb_IDMO ;
   private String A9857Ex_Obs ;
   private String A9721Lb_obsprb ;
   private String A9709Lb_obsout ;
   private String A9625Lb_obsin ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05CI2_A396EmprCod ;
   private String[] P05CI2_A9613Lb_Hdrp ;
   private byte[] P05CI2_A9612Lb_Hdrr ;
   private int[] P05CI2_A9611Lb_Hdr ;
   private java.math.BigDecimal[] P05CI2_A13221BCSd009 ;
   private boolean[] P05CI2_n13221BCSd009 ;
   private short[] P05CI2_A13229BCSd008 ;
   private boolean[] P05CI2_n13229BCSd008 ;
   private byte[] P05CI2_A13228BCSd007 ;
   private boolean[] P05CI2_n13228BCSd007 ;
   private int[] P05CI2_A13227BCSd006 ;
   private boolean[] P05CI2_n13227BCSd006 ;
   private short[] P05CI2_A13226BCSd005 ;
   private boolean[] P05CI2_n13226BCSd005 ;
   private short[] P05CI2_A13225BCSd004 ;
   private boolean[] P05CI2_n13225BCSd004 ;
   private int[] P05CI2_A13224BCSd003 ;
   private boolean[] P05CI2_n13224BCSd003 ;
   private short[] P05CI2_A13223BCSd002 ;
   private boolean[] P05CI2_n13223BCSd002 ;
   private byte[] P05CI2_A13222BCSd001 ;
   private boolean[] P05CI2_n13222BCSd001 ;
   private int[] P05CI2_A12899Sedo14 ;
   private boolean[] P05CI2_n12899Sedo14 ;
   private short[] P05CI2_A12898Sedo13 ;
   private boolean[] P05CI2_n12898Sedo13 ;
   private short[] P05CI2_A12897Sedo12 ;
   private boolean[] P05CI2_n12897Sedo12 ;
   private java.util.Date[] P05CI2_A12640Lb_FecEm ;
   private boolean[] P05CI2_n12640Lb_FecEm ;
   private java.util.Date[] P05CI2_A12639Lb_FecCd ;
   private boolean[] P05CI2_n12639Lb_FecCd ;
   private java.util.Date[] P05CI2_A12612Lb_FecRm ;
   private boolean[] P05CI2_n12612Lb_FecRm ;
   private java.util.Date[] P05CI2_A12611Lb_FecSf ;
   private boolean[] P05CI2_n12611Lb_FecSf ;
   private java.util.Date[] P05CI2_A12604Lb_FecTef ;
   private boolean[] P05CI2_n12604Lb_FecTef ;
   private java.util.Date[] P05CI2_A12603Lb_FecAcb ;
   private boolean[] P05CI2_n12603Lb_FecAcb ;
   private java.util.Date[] P05CI2_A12602Lb_FecFev ;
   private boolean[] P05CI2_n12602Lb_FecFev ;
   private java.util.Date[] P05CI2_A12601Lb_FecVTf ;
   private boolean[] P05CI2_n12601Lb_FecVTf ;
   private short[] P05CI2_A12269Sedo11 ;
   private boolean[] P05CI2_n12269Sedo11 ;
   private short[] P05CI2_A12268Sedo10 ;
   private boolean[] P05CI2_n12268Sedo10 ;
   private short[] P05CI2_A12267Sedo9 ;
   private boolean[] P05CI2_n12267Sedo9 ;
   private java.math.BigDecimal[] P05CI2_A12266Sedo8 ;
   private boolean[] P05CI2_n12266Sedo8 ;
   private java.math.BigDecimal[] P05CI2_A12265Sedo7 ;
   private boolean[] P05CI2_n12265Sedo7 ;
   private java.util.Date[] P05CI2_A10821Lb_IDMFC ;
   private boolean[] P05CI2_n10821Lb_IDMFC ;
   private java.util.Date[] P05CI2_A10820Lb_IDMF ;
   private boolean[] P05CI2_n10820Lb_IDMF ;
   private byte[] P05CI2_A10819Lb_IDMS ;
   private boolean[] P05CI2_n10819Lb_IDMS ;
   private String[] P05CI2_A10818Lb_IDMO ;
   private boolean[] P05CI2_n10818Lb_IDMO ;
   private int[] P05CI2_A10817Lb_IDMP ;
   private boolean[] P05CI2_n10817Lb_IDMP ;
   private String[] P05CI2_A10135Lb_UbUb ;
   private boolean[] P05CI2_n10135Lb_UbUb ;
   private int[] P05CI2_A10148Lb_UbPzs ;
   private boolean[] P05CI2_n10148Lb_UbPzs ;
   private java.util.Date[] P05CI2_A10153Lb_HhTin ;
   private boolean[] P05CI2_n10153Lb_HhTin ;
   private java.util.Date[] P05CI2_A10138Lb_HhOut ;
   private boolean[] P05CI2_n10138Lb_HhOut ;
   private java.util.Date[] P05CI2_A10152Lb_HhIn ;
   private boolean[] P05CI2_n10152Lb_HhIn ;
   private byte[] P05CI2_A10110Sedo6 ;
   private boolean[] P05CI2_n10110Sedo6 ;
   private byte[] P05CI2_A10109Sedo5 ;
   private boolean[] P05CI2_n10109Sedo5 ;
   private java.math.BigDecimal[] P05CI2_A10108Sedo4 ;
   private boolean[] P05CI2_n10108Sedo4 ;
   private short[] P05CI2_A10107Sedo3 ;
   private boolean[] P05CI2_n10107Sedo3 ;
   private java.math.BigDecimal[] P05CI2_A10106Sedo2 ;
   private boolean[] P05CI2_n10106Sedo2 ;
   private java.math.BigDecimal[] P05CI2_A10105Sedo1 ;
   private boolean[] P05CI2_n10105Sedo1 ;
   private String[] P05CI2_A9857Ex_Obs ;
   private boolean[] P05CI2_n9857Ex_Obs ;
   private String[] P05CI2_A9721Lb_obsprb ;
   private boolean[] P05CI2_n9721Lb_obsprb ;
   private String[] P05CI2_A9709Lb_obsout ;
   private boolean[] P05CI2_n9709Lb_obsout ;
   private java.util.Date[] P05CI2_A9703Lb_FecAcF ;
   private boolean[] P05CI2_n9703Lb_FecAcF ;
   private java.util.Date[] P05CI2_A9702Lb_FecPAc ;
   private boolean[] P05CI2_n9702Lb_FecPAc ;
   private String[] P05CI2_A9625Lb_obsin ;
   private boolean[] P05CI2_n9625Lb_obsin ;
   private String[] P05CI2_A9624Lb_UsuTin ;
   private boolean[] P05CI2_n9624Lb_UsuTin ;
   private java.util.Date[] P05CI2_A9623Lb_FecTin ;
   private boolean[] P05CI2_n9623Lb_FecTin ;
   private byte[] P05CI2_A9618Lb_inout ;
   private boolean[] P05CI2_n9618Lb_inout ;
   private java.util.Date[] P05CI2_A9617Lb_FecOut ;
   private boolean[] P05CI2_n9617Lb_FecOut ;
   private String[] P05CI2_A9616Lb_UsuOut ;
   private boolean[] P05CI2_n9616Lb_UsuOut ;
   private java.util.Date[] P05CI2_A9615Lb_FecIn ;
   private boolean[] P05CI2_n9615Lb_FecIn ;
   private String[] P05CI2_A9614Lb_UsuIn ;
   private boolean[] P05CI2_n9614Lb_UsuIn ;
}

final  class prpi008__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05CI2", "SELECT EmprCod, Lb_Hdrp, Lb_Hdrr, Lb_Hdr, BCSd009, BCSd008, BCSd007, BCSd006, BCSd005, BCSd004, BCSd003, BCSd002, BCSd001, Sedo14, Sedo13, Sedo12, Lb_FecEm, Lb_FecCd, Lb_FecRm, Lb_FecSf, Lb_FecTef, Lb_FecAcb, Lb_FecFev, Lb_FecVTf, Sedo11, Sedo10, Sedo9, Sedo8, Sedo7, Lb_IDMFC, Lb_IDMF, Lb_IDMS, Lb_IDMO, Lb_IDMP, Lb_UbUb, Lb_UbPzs, Lb_HhTin, Lb_HhOut, Lb_HhIn, Sedo6, Sedo5, Sedo4, Sedo3, Sedo2, Sedo1, Ex_Obs, Lb_obsprb, Lb_obsout, Lb_FecAcF, Lb_FecPAc, Lb_obsin, Lb_UsuTin, Lb_FecTin, Lb_inout, Lb_FecOut, Lb_UsuOut, Lb_FecIn, Lb_UsuIn FROM TXPHDRINO WHERE EmprCod = ? and Lb_Hdr = ? and Lb_Hdrr = ? and Lb_Hdrp = ? ORDER BY EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05CI3", "INSERT INTO TXPHDRINO(EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp, Lb_UsuIn, Lb_FecIn, Lb_UsuOut, Lb_FecOut, Lb_inout, Lb_FecTin, Lb_UsuTin, Lb_obsin, Lb_FecPAc, Lb_FecAcF, Lb_obsout, Lb_obsprb, Ex_Obs, Sedo1, Sedo2, Sedo3, Sedo4, Sedo5, Sedo6, Lb_HhIn, Lb_HhOut, Lb_HhTin, Lb_UbPzs, Lb_UbUb, Lb_IDMP, Lb_IDMO, Lb_IDMS, Lb_IDMF, Lb_IDMFC, Sedo7, Sedo8, Sedo9, Sedo10, Sedo11, Lb_FecVTf, Lb_FecFev, Lb_FecAcb, Lb_FecTef, Lb_FecSf, Lb_FecRm, Lb_FecCd, Lb_FecEm, Sedo12, Sedo13, Sedo14, BCSd001, BCSd002, BCSd003, BCSd004, BCSd005, BCSd006, BCSd007, BCSd008, BCSd009) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRINO")
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDate(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDate(22);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDate(24);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(25);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((short[]) buf[46])[0] = rslt.getShort(26);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((short[]) buf[48])[0] = rslt.getShort(27);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(28,1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(29,1);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[54])[0] = rslt.getGXDateTime(30);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDateTime(31);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((byte[]) buf[58])[0] = rslt.getByte(32);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getVarchar(33);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((int[]) buf[62])[0] = rslt.getInt(34);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(35, 10);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((int[]) buf[66])[0] = rslt.getInt(36);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[68])[0] = GXutil.resetDate(rslt.getGXDateTime(37));
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[70])[0] = GXutil.resetDate(rslt.getGXDateTime(38));
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[72])[0] = GXutil.resetDate(rslt.getGXDateTime(39));
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((byte[]) buf[74])[0] = rslt.getByte(40);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((byte[]) buf[76])[0] = rslt.getByte(41);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[78])[0] = rslt.getBigDecimal(42,2);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((short[]) buf[80])[0] = rslt.getShort(43);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[82])[0] = rslt.getBigDecimal(44,1);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[84])[0] = rslt.getBigDecimal(45,1);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getVarchar(47);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getVarchar(48);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[92])[0] = rslt.getGXDate(49);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[94])[0] = rslt.getGXDate(50);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getVarchar(51);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getString(52, 8);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[100])[0] = rslt.getGXDate(53);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((byte[]) buf[102])[0] = rslt.getByte(54);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[104])[0] = rslt.getGXDate(55);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(56, 10);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[108])[0] = rslt.getGXDate(57);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getString(58, 10);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 10);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 8);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[19], 200);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DATE );
               }
               else
               {
                  stmt.setDate(13, (java.util.Date)parms[21]);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DATE );
               }
               else
               {
                  stmt.setDate(14, (java.util.Date)parms[23]);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[25], 200);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[27], 200);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[29], 300);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[39]).byteValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[41]).byteValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(24, (java.util.Date)parms[43], true);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(25, (java.util.Date)parms[45], true);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(26, (java.util.Date)parms[47], true);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(27, ((Number) parms[49]).intValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[51], 10);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(29, ((Number) parms[53]).intValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[55], 300);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(31, ((Number) parms[57]).byteValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(32, (java.util.Date)parms[59], false);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(33, (java.util.Date)parms[61], false);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[63], 1);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[65], 1);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[67]).shortValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[69]).shortValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(38, ((Number) parms[71]).shortValue());
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.DATE );
               }
               else
               {
                  stmt.setDate(39, (java.util.Date)parms[73]);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DATE );
               }
               else
               {
                  stmt.setDate(40, (java.util.Date)parms[75]);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.DATE );
               }
               else
               {
                  stmt.setDate(41, (java.util.Date)parms[77]);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.DATE );
               }
               else
               {
                  stmt.setDate(42, (java.util.Date)parms[79]);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.DATE );
               }
               else
               {
                  stmt.setDate(43, (java.util.Date)parms[81]);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.DATE );
               }
               else
               {
                  stmt.setDate(44, (java.util.Date)parms[83]);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.DATE );
               }
               else
               {
                  stmt.setDate(45, (java.util.Date)parms[85]);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.DATE );
               }
               else
               {
                  stmt.setDate(46, (java.util.Date)parms[87]);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(47, ((Number) parms[89]).shortValue());
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(48, ((Number) parms[91]).shortValue());
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(49, ((Number) parms[93]).intValue());
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(50, ((Number) parms[95]).byteValue());
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(51, ((Number) parms[97]).shortValue());
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(52, ((Number) parms[99]).intValue());
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(53, ((Number) parms[101]).shortValue());
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(54, ((Number) parms[103]).shortValue());
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(55, ((Number) parms[105]).intValue());
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(56, ((Number) parms[107]).byteValue());
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(57, ((Number) parms[109]).shortValue());
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(58, (java.math.BigDecimal)parms[111], 1);
               }
               return;
      }
   }

}

