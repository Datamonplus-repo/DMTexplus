package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partdat extends GXProcedure
{
   public partdat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partdat.class ), "" );
   }

   public partdat( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      partdat.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      partdat.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partdat.this.AV8Clicod = aP1[0];
      this.aP1 = aP1;
      partdat.this.AV9Artcod = aP2[0];
      this.aP2 = aP2;
      partdat.this.AV10Procod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P033P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Clicod), AV9Artcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3072ArtObsLon = P033P2_A3072ArtObsLon[0] ;
         n3072ArtObsLon = P033P2_n3072ArtObsLon[0] ;
         A65ArtCod = P033P2_A65ArtCod[0] ;
         A252CliCod = P033P2_A252CliCod[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         AV14ArtObsLon = A3072ArtObsLon ;
         AV11Nlin = (short)(GXutil.gxmlines( AV14ArtObsLon, (short)(56))) ;
         AV12i = (short)(1) ;
         AV16Art_Obs = " " ;
         while ( AV12i <= AV11Nlin )
         {
            AV13Obstxt = GXutil.gxgetmli( AV14ArtObsLon, AV12i, (short)(56)) ;
            AV16Art_Obs += AV13Obstxt + GXutil.chr( (short)(13)) ;
            AV12i = (short)(AV12i+1) ;
         }
         /* Using cursor P033P3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, AV10Procod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A8955Art_Obs = P033P3_A8955Art_Obs[0] ;
            n8955Art_Obs = P033P3_n8955Art_Obs[0] ;
            A8084Art_RdoP = P033P3_A8084Art_RdoP[0] ;
            n8084Art_RdoP = P033P3_n8084Art_RdoP[0] ;
            A8083Art_AncP = P033P3_A8083Art_AncP[0] ;
            n8083Art_AncP = P033P3_n8083Art_AncP[0] ;
            A8082Art_PmlP = P033P3_A8082Art_PmlP[0] ;
            n8082Art_PmlP = P033P3_n8082Art_PmlP[0] ;
            A8081Art_GrmP = P033P3_A8081Art_GrmP[0] ;
            n8081Art_GrmP = P033P3_n8081Art_GrmP[0] ;
            A8080Art_PmlC = P033P3_A8080Art_PmlC[0] ;
            n8080Art_PmlC = P033P3_n8080Art_PmlC[0] ;
            A8079Art_AncC = P033P3_A8079Art_AncC[0] ;
            n8079Art_AncC = P033P3_n8079Art_AncC[0] ;
            A8078Art_GrmC = P033P3_A8078Art_GrmC[0] ;
            n8078Art_GrmC = P033P3_n8078Art_GrmC[0] ;
            A8077Art_GrmB = P033P3_A8077Art_GrmB[0] ;
            n8077Art_GrmB = P033P3_n8077Art_GrmB[0] ;
            A8076Art_AncB = P033P3_A8076Art_AncB[0] ;
            n8076Art_AncB = P033P3_n8076Art_AncB[0] ;
            A8075Art_Fabs = P033P3_A8075Art_Fabs[0] ;
            n8075Art_Fabs = P033P3_n8075Art_Fabs[0] ;
            A8074Art_Rdpc = P033P3_A8074Art_Rdpc[0] ;
            n8074Art_Rdpc = P033P3_n8074Art_Rdpc[0] ;
            A8073Art_Rdo = P033P3_A8073Art_Rdo[0] ;
            n8073Art_Rdo = P033P3_n8073Art_Rdo[0] ;
            A8072Art_Cor = P033P3_A8072Art_Cor[0] ;
            n8072Art_Cor = P033P3_n8072Art_Cor[0] ;
            A8071Art_Enc = P033P3_A8071Art_Enc[0] ;
            n8071Art_Enc = P033P3_n8071Art_Enc[0] ;
            A8070Art_Elar = P033P3_A8070Art_Elar[0] ;
            n8070Art_Elar = P033P3_n8070Art_Elar[0] ;
            A8069Art_Eanc = P033P3_A8069Art_Eanc[0] ;
            n8069Art_Eanc = P033P3_n8069Art_Eanc[0] ;
            A8068Art_PmlA = P033P3_A8068Art_PmlA[0] ;
            n8068Art_PmlA = P033P3_n8068Art_PmlA[0] ;
            A8067Art_Merma = P033P3_A8067Art_Merma[0] ;
            n8067Art_Merma = P033P3_n8067Art_Merma[0] ;
            A8066Art_AncA = P033P3_A8066Art_AncA[0] ;
            n8066Art_AncA = P033P3_n8066Art_AncA[0] ;
            A8065Art_GrmA = P033P3_A8065Art_GrmA[0] ;
            n8065Art_GrmA = P033P3_n8065Art_GrmA[0] ;
            A758ProCod = P033P3_A758ProCod[0] ;
            A7777ArtRdtSc = P033P3_A7777ArtRdtSc[0] ;
            n7777ArtRdtSc = P033P3_n7777ArtRdtSc[0] ;
            A7414ArtAncSc = P033P3_A7414ArtAncSc[0] ;
            n7414ArtAncSc = P033P3_n7414ArtAncSc[0] ;
            A7413ArtPmlSc = P033P3_A7413ArtPmlSc[0] ;
            n7413ArtPmlSc = P033P3_n7413ArtPmlSc[0] ;
            A7412Artgrm2Sc = P033P3_A7412Artgrm2Sc[0] ;
            n7412Artgrm2Sc = P033P3_n7412Artgrm2Sc[0] ;
            A7415ArtPmlCru = P033P3_A7415ArtPmlCru[0] ;
            n7415ArtPmlCru = P033P3_n7415ArtPmlCru[0] ;
            A68ArtCruMin = P033P3_A68ArtCruMin[0] ;
            n68ArtCruMin = P033P3_n68ArtCruMin[0] ;
            A78ArtGraCru = P033P3_A78ArtGraCru[0] ;
            n78ArtGraCru = P033P3_n78ArtGraCru[0] ;
            A3123ArtAncSal2 = P033P3_A3123ArtAncSal2[0] ;
            n3123ArtAncSal2 = P033P3_n3123ArtAncSal2[0] ;
            A3122ArtAncSal1 = P033P3_A3122ArtAncSal1[0] ;
            n3122ArtAncSal1 = P033P3_n3122ArtAncSal1[0] ;
            A2791ArtFacAbs = P033P3_A2791ArtFacAbs[0] ;
            n2791ArtFacAbs = P033P3_n2791ArtFacAbs[0] ;
            A1905ArtRdoA = P033P3_A1905ArtRdoA[0] ;
            n1905ArtRdoA = P033P3_n1905ArtRdoA[0] ;
            A95ArtRen = P033P3_A95ArtRen[0] ;
            n95ArtRen = P033P3_n95ArtRen[0] ;
            A66ArtCorOri = P033P3_A66ArtCorOri[0] ;
            n66ArtCorOri = P033P3_n66ArtCorOri[0] ;
            A70ArtEncOri = P033P3_A70ArtEncOri[0] ;
            n70ArtEncOri = P033P3_n70ArtEncOri[0] ;
            A1229ArtEncCom = P033P3_A1229ArtEncCom[0] ;
            n1229ArtEncCom = P033P3_n1229ArtEncCom[0] ;
            A1230ArtEncAnh = P033P3_A1230ArtEncAnh[0] ;
            n1230ArtEncAnh = P033P3_n1230ArtEncAnh[0] ;
            A1148ArtPml = P033P3_A1148ArtPml[0] ;
            n1148ArtPml = P033P3_n1148ArtPml[0] ;
            A88ArtMer = P033P3_A88ArtMer[0] ;
            n88ArtMer = P033P3_n88ArtMer[0] ;
            A63ArtAcaMin = P033P3_A63ArtAcaMin[0] ;
            n63ArtAcaMin = P033P3_n63ArtAcaMin[0] ;
            A1903ArtGraAca = P033P3_A1903ArtGraAca[0] ;
            n1903ArtGraAca = P033P3_n1903ArtGraAca[0] ;
            A12752Art_Tipo = P033P3_A12752Art_Tipo[0] ;
            n12752Art_Tipo = P033P3_n12752Art_Tipo[0] ;
            A12142ProStFec = P033P3_A12142ProStFec[0] ;
            A12141ProSta = P033P3_A12141ProSta[0] ;
            A11272ProFabs = P033P3_A11272ProFabs[0] ;
            A10556ProFecM = P033P3_A10556ProFecM[0] ;
            A10555ProUserM = P033P3_A10555ProUserM[0] ;
            A10554ProFecA = P033P3_A10554ProFecA[0] ;
            A10553ProUserA = P033P3_A10553ProUserA[0] ;
            A10412ProAct = P033P3_A10412ProAct[0] ;
            A10026DscCFa = P033P3_A10026DscCFa[0] ;
            A9629Art_els = P033P3_A9629Art_els[0] ;
            n9629Art_els = P033P3_n9629Art_els[0] ;
            A9628Art_ets = P033P3_A9628Art_ets[0] ;
            n9628Art_ets = P033P3_n9628Art_ets[0] ;
            A8166Art_Und = P033P3_A8166Art_Und[0] ;
            n8166Art_Und = P033P3_n8166Art_Und[0] ;
            A8165Art_Dsc = P033P3_A8165Art_Dsc[0] ;
            n8165Art_Dsc = P033P3_n8165Art_Dsc[0] ;
            A7777ArtRdtSc = P033P3_A7777ArtRdtSc[0] ;
            n7777ArtRdtSc = P033P3_n7777ArtRdtSc[0] ;
            A7414ArtAncSc = P033P3_A7414ArtAncSc[0] ;
            n7414ArtAncSc = P033P3_n7414ArtAncSc[0] ;
            A7413ArtPmlSc = P033P3_A7413ArtPmlSc[0] ;
            n7413ArtPmlSc = P033P3_n7413ArtPmlSc[0] ;
            A7412Artgrm2Sc = P033P3_A7412Artgrm2Sc[0] ;
            n7412Artgrm2Sc = P033P3_n7412Artgrm2Sc[0] ;
            A7415ArtPmlCru = P033P3_A7415ArtPmlCru[0] ;
            n7415ArtPmlCru = P033P3_n7415ArtPmlCru[0] ;
            A68ArtCruMin = P033P3_A68ArtCruMin[0] ;
            n68ArtCruMin = P033P3_n68ArtCruMin[0] ;
            A78ArtGraCru = P033P3_A78ArtGraCru[0] ;
            n78ArtGraCru = P033P3_n78ArtGraCru[0] ;
            A3123ArtAncSal2 = P033P3_A3123ArtAncSal2[0] ;
            n3123ArtAncSal2 = P033P3_n3123ArtAncSal2[0] ;
            A3122ArtAncSal1 = P033P3_A3122ArtAncSal1[0] ;
            n3122ArtAncSal1 = P033P3_n3122ArtAncSal1[0] ;
            A2791ArtFacAbs = P033P3_A2791ArtFacAbs[0] ;
            n2791ArtFacAbs = P033P3_n2791ArtFacAbs[0] ;
            A1905ArtRdoA = P033P3_A1905ArtRdoA[0] ;
            n1905ArtRdoA = P033P3_n1905ArtRdoA[0] ;
            A95ArtRen = P033P3_A95ArtRen[0] ;
            n95ArtRen = P033P3_n95ArtRen[0] ;
            A66ArtCorOri = P033P3_A66ArtCorOri[0] ;
            n66ArtCorOri = P033P3_n66ArtCorOri[0] ;
            A70ArtEncOri = P033P3_A70ArtEncOri[0] ;
            n70ArtEncOri = P033P3_n70ArtEncOri[0] ;
            A1229ArtEncCom = P033P3_A1229ArtEncCom[0] ;
            n1229ArtEncCom = P033P3_n1229ArtEncCom[0] ;
            A1230ArtEncAnh = P033P3_A1230ArtEncAnh[0] ;
            n1230ArtEncAnh = P033P3_n1230ArtEncAnh[0] ;
            A1148ArtPml = P033P3_A1148ArtPml[0] ;
            n1148ArtPml = P033P3_n1148ArtPml[0] ;
            A88ArtMer = P033P3_A88ArtMer[0] ;
            n88ArtMer = P033P3_n88ArtMer[0] ;
            A63ArtAcaMin = P033P3_A63ArtAcaMin[0] ;
            n63ArtAcaMin = P033P3_n63ArtAcaMin[0] ;
            A1903ArtGraAca = P033P3_A1903ArtGraAca[0] ;
            n1903ArtGraAca = P033P3_n1903ArtGraAca[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            W758ProCod = A758ProCod ;
            /*
               INSERT RECORD ON TABLE TXPARTLIN

            */
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            W758ProCod = A758ProCod ;
            W8084Art_RdoP = A8084Art_RdoP ;
            n8084Art_RdoP = false ;
            W8083Art_AncP = A8083Art_AncP ;
            n8083Art_AncP = false ;
            W8082Art_PmlP = A8082Art_PmlP ;
            n8082Art_PmlP = false ;
            W8081Art_GrmP = A8081Art_GrmP ;
            n8081Art_GrmP = false ;
            W8080Art_PmlC = A8080Art_PmlC ;
            n8080Art_PmlC = false ;
            W8079Art_AncC = A8079Art_AncC ;
            n8079Art_AncC = false ;
            W8078Art_GrmC = A8078Art_GrmC ;
            n8078Art_GrmC = false ;
            W8077Art_GrmB = A8077Art_GrmB ;
            n8077Art_GrmB = false ;
            W8076Art_AncB = A8076Art_AncB ;
            n8076Art_AncB = false ;
            W8075Art_Fabs = A8075Art_Fabs ;
            n8075Art_Fabs = false ;
            W8074Art_Rdpc = A8074Art_Rdpc ;
            n8074Art_Rdpc = false ;
            W8073Art_Rdo = A8073Art_Rdo ;
            n8073Art_Rdo = false ;
            W8072Art_Cor = A8072Art_Cor ;
            n8072Art_Cor = false ;
            W8071Art_Enc = A8071Art_Enc ;
            n8071Art_Enc = false ;
            W8070Art_Elar = A8070Art_Elar ;
            n8070Art_Elar = false ;
            W8069Art_Eanc = A8069Art_Eanc ;
            n8069Art_Eanc = false ;
            W8068Art_PmlA = A8068Art_PmlA ;
            n8068Art_PmlA = false ;
            W8067Art_Merma = A8067Art_Merma ;
            n8067Art_Merma = false ;
            W8066Art_AncA = A8066Art_AncA ;
            n8066Art_AncA = false ;
            W8065Art_GrmA = A8065Art_GrmA ;
            n8065Art_GrmA = false ;
            W8955Art_Obs = A8955Art_Obs ;
            n8955Art_Obs = false ;
            A252CliCod = AV8Clicod ;
            A65ArtCod = AV9Artcod ;
            A758ProCod = AV10Procod ;
            A8084Art_RdoP = A7777ArtRdtSc ;
            n8084Art_RdoP = false ;
            A8083Art_AncP = A7414ArtAncSc ;
            n8083Art_AncP = false ;
            A8082Art_PmlP = A7413ArtPmlSc ;
            n8082Art_PmlP = false ;
            A8081Art_GrmP = A7412Artgrm2Sc ;
            n8081Art_GrmP = false ;
            A8080Art_PmlC = A7415ArtPmlCru ;
            n8080Art_PmlC = false ;
            A8079Art_AncC = A68ArtCruMin ;
            n8079Art_AncC = false ;
            A8078Art_GrmC = A78ArtGraCru ;
            n8078Art_GrmC = false ;
            A8077Art_GrmB = A3123ArtAncSal2 ;
            n8077Art_GrmB = false ;
            A8076Art_AncB = A3122ArtAncSal1 ;
            n8076Art_AncB = false ;
            A8075Art_Fabs = A2791ArtFacAbs ;
            n8075Art_Fabs = false ;
            A8074Art_Rdpc = A1905ArtRdoA ;
            n8074Art_Rdpc = false ;
            A8073Art_Rdo = A95ArtRen ;
            n8073Art_Rdo = false ;
            A8072Art_Cor = A66ArtCorOri ;
            n8072Art_Cor = false ;
            A8071Art_Enc = A70ArtEncOri ;
            n8071Art_Enc = false ;
            A8070Art_Elar = A1229ArtEncCom ;
            n8070Art_Elar = false ;
            A8069Art_Eanc = A1230ArtEncAnh ;
            n8069Art_Eanc = false ;
            A8068Art_PmlA = A1148ArtPml ;
            n8068Art_PmlA = false ;
            A8067Art_Merma = A88ArtMer ;
            n8067Art_Merma = false ;
            A8066Art_AncA = A63ArtAcaMin ;
            n8066Art_AncA = false ;
            A8065Art_GrmA = A1903ArtGraAca ;
            n8065Art_GrmA = false ;
            A8955Art_Obs = AV16Art_Obs ;
            n8955Art_Obs = false ;
            /* Using cursor P033P4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, Boolean.valueOf(n8065Art_GrmA), Short.valueOf(A8065Art_GrmA), Boolean.valueOf(n8066Art_AncA), Short.valueOf(A8066Art_AncA), Boolean.valueOf(n8067Art_Merma), A8067Art_Merma, Boolean.valueOf(n8068Art_PmlA), Short.valueOf(A8068Art_PmlA), Boolean.valueOf(n8069Art_Eanc), Short.valueOf(A8069Art_Eanc), Boolean.valueOf(n8070Art_Elar), Short.valueOf(A8070Art_Elar), Boolean.valueOf(n8071Art_Enc), A8071Art_Enc, Boolean.valueOf(n8072Art_Cor), A8072Art_Cor, Boolean.valueOf(n8073Art_Rdo), A8073Art_Rdo, Boolean.valueOf(n8074Art_Rdpc), A8074Art_Rdpc, Boolean.valueOf(n8075Art_Fabs), A8075Art_Fabs, Boolean.valueOf(n8076Art_AncB), Short.valueOf(A8076Art_AncB), Boolean.valueOf(n8077Art_GrmB), Short.valueOf(A8077Art_GrmB), Boolean.valueOf(n8078Art_GrmC), Short.valueOf(A8078Art_GrmC), Boolean.valueOf(n8079Art_AncC), Short.valueOf(A8079Art_AncC), Boolean.valueOf(n8080Art_PmlC), Short.valueOf(A8080Art_PmlC), Boolean.valueOf(n8081Art_GrmP), Short.valueOf(A8081Art_GrmP), Boolean.valueOf(n8082Art_PmlP), Short.valueOf(A8082Art_PmlP), Boolean.valueOf(n8083Art_AncP), Short.valueOf(A8083Art_AncP), Boolean.valueOf(n8084Art_RdoP), A8084Art_RdoP, Boolean.valueOf(n8165Art_Dsc), A8165Art_Dsc, Boolean.valueOf(n8166Art_Und), A8166Art_Und, Boolean.valueOf(n8955Art_Obs), A8955Art_Obs, Boolean.valueOf(n9628Art_ets), A9628Art_ets, Boolean.valueOf(n9629Art_els), A9629Art_els, A10026DscCFa, A10412ProAct, A10553ProUserA, A10554ProFecA, A10555ProUserM, A10556ProFecM, A11272ProFabs, Byte.valueOf(A12141ProSta), A12142ProStFec, Boolean.valueOf(n12752Art_Tipo), A12752Art_Tipo});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
            if ( (pr_default.getStatus(2) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               /* Using cursor P033P5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A396EmprCod = P033P5_A396EmprCod[0] ;
                  A252CliCod = P033P5_A252CliCod[0] ;
                  A65ArtCod = P033P5_A65ArtCod[0] ;
                  A758ProCod = P033P5_A758ProCod[0] ;
                  A8084Art_RdoP = P033P5_A8084Art_RdoP[0] ;
                  n8084Art_RdoP = P033P5_n8084Art_RdoP[0] ;
                  A8083Art_AncP = P033P5_A8083Art_AncP[0] ;
                  n8083Art_AncP = P033P5_n8083Art_AncP[0] ;
                  A8082Art_PmlP = P033P5_A8082Art_PmlP[0] ;
                  n8082Art_PmlP = P033P5_n8082Art_PmlP[0] ;
                  A8081Art_GrmP = P033P5_A8081Art_GrmP[0] ;
                  n8081Art_GrmP = P033P5_n8081Art_GrmP[0] ;
                  A8080Art_PmlC = P033P5_A8080Art_PmlC[0] ;
                  n8080Art_PmlC = P033P5_n8080Art_PmlC[0] ;
                  A8079Art_AncC = P033P5_A8079Art_AncC[0] ;
                  n8079Art_AncC = P033P5_n8079Art_AncC[0] ;
                  A8078Art_GrmC = P033P5_A8078Art_GrmC[0] ;
                  n8078Art_GrmC = P033P5_n8078Art_GrmC[0] ;
                  A8077Art_GrmB = P033P5_A8077Art_GrmB[0] ;
                  n8077Art_GrmB = P033P5_n8077Art_GrmB[0] ;
                  A8076Art_AncB = P033P5_A8076Art_AncB[0] ;
                  n8076Art_AncB = P033P5_n8076Art_AncB[0] ;
                  A8075Art_Fabs = P033P5_A8075Art_Fabs[0] ;
                  n8075Art_Fabs = P033P5_n8075Art_Fabs[0] ;
                  A8074Art_Rdpc = P033P5_A8074Art_Rdpc[0] ;
                  n8074Art_Rdpc = P033P5_n8074Art_Rdpc[0] ;
                  A8073Art_Rdo = P033P5_A8073Art_Rdo[0] ;
                  n8073Art_Rdo = P033P5_n8073Art_Rdo[0] ;
                  A8072Art_Cor = P033P5_A8072Art_Cor[0] ;
                  n8072Art_Cor = P033P5_n8072Art_Cor[0] ;
                  A8071Art_Enc = P033P5_A8071Art_Enc[0] ;
                  n8071Art_Enc = P033P5_n8071Art_Enc[0] ;
                  A8070Art_Elar = P033P5_A8070Art_Elar[0] ;
                  n8070Art_Elar = P033P5_n8070Art_Elar[0] ;
                  A8069Art_Eanc = P033P5_A8069Art_Eanc[0] ;
                  n8069Art_Eanc = P033P5_n8069Art_Eanc[0] ;
                  A8068Art_PmlA = P033P5_A8068Art_PmlA[0] ;
                  n8068Art_PmlA = P033P5_n8068Art_PmlA[0] ;
                  A8067Art_Merma = P033P5_A8067Art_Merma[0] ;
                  n8067Art_Merma = P033P5_n8067Art_Merma[0] ;
                  A8066Art_AncA = P033P5_A8066Art_AncA[0] ;
                  n8066Art_AncA = P033P5_n8066Art_AncA[0] ;
                  A8065Art_GrmA = P033P5_A8065Art_GrmA[0] ;
                  n8065Art_GrmA = P033P5_n8065Art_GrmA[0] ;
                  A8955Art_Obs = P033P5_A8955Art_Obs[0] ;
                  n8955Art_Obs = P033P5_n8955Art_Obs[0] ;
                  A8084Art_RdoP = A7777ArtRdtSc ;
                  n8084Art_RdoP = false ;
                  A8083Art_AncP = A7414ArtAncSc ;
                  n8083Art_AncP = false ;
                  A8082Art_PmlP = A7413ArtPmlSc ;
                  n8082Art_PmlP = false ;
                  A8081Art_GrmP = A7412Artgrm2Sc ;
                  n8081Art_GrmP = false ;
                  A8080Art_PmlC = A7415ArtPmlCru ;
                  n8080Art_PmlC = false ;
                  A8079Art_AncC = A68ArtCruMin ;
                  n8079Art_AncC = false ;
                  A8078Art_GrmC = A78ArtGraCru ;
                  n8078Art_GrmC = false ;
                  A8077Art_GrmB = A3123ArtAncSal2 ;
                  n8077Art_GrmB = false ;
                  A8076Art_AncB = A3122ArtAncSal1 ;
                  n8076Art_AncB = false ;
                  A8075Art_Fabs = A2791ArtFacAbs ;
                  n8075Art_Fabs = false ;
                  A8074Art_Rdpc = A1905ArtRdoA ;
                  n8074Art_Rdpc = false ;
                  A8073Art_Rdo = A95ArtRen ;
                  n8073Art_Rdo = false ;
                  A8072Art_Cor = A66ArtCorOri ;
                  n8072Art_Cor = false ;
                  A8071Art_Enc = A70ArtEncOri ;
                  n8071Art_Enc = false ;
                  A8070Art_Elar = A1229ArtEncCom ;
                  n8070Art_Elar = false ;
                  A8069Art_Eanc = A1230ArtEncAnh ;
                  n8069Art_Eanc = false ;
                  A8068Art_PmlA = A1148ArtPml ;
                  n8068Art_PmlA = false ;
                  A8067Art_Merma = A88ArtMer ;
                  n8067Art_Merma = false ;
                  A8066Art_AncA = A63ArtAcaMin ;
                  n8066Art_AncA = false ;
                  A8065Art_GrmA = A1903ArtGraAca ;
                  n8065Art_GrmA = false ;
                  A8955Art_Obs = AV16Art_Obs ;
                  n8955Art_Obs = false ;
                  /* Using cursor P033P6 */
                  pr_default.execute(4, new Object[] {Boolean.valueOf(n8084Art_RdoP), A8084Art_RdoP, Boolean.valueOf(n8083Art_AncP), Short.valueOf(A8083Art_AncP), Boolean.valueOf(n8082Art_PmlP), Short.valueOf(A8082Art_PmlP), Boolean.valueOf(n8081Art_GrmP), Short.valueOf(A8081Art_GrmP), Boolean.valueOf(n8080Art_PmlC), Short.valueOf(A8080Art_PmlC), Boolean.valueOf(n8079Art_AncC), Short.valueOf(A8079Art_AncC), Boolean.valueOf(n8078Art_GrmC), Short.valueOf(A8078Art_GrmC), Boolean.valueOf(n8077Art_GrmB), Short.valueOf(A8077Art_GrmB), Boolean.valueOf(n8076Art_AncB), Short.valueOf(A8076Art_AncB), Boolean.valueOf(n8075Art_Fabs), A8075Art_Fabs, Boolean.valueOf(n8074Art_Rdpc), A8074Art_Rdpc, Boolean.valueOf(n8073Art_Rdo), A8073Art_Rdo, Boolean.valueOf(n8072Art_Cor), A8072Art_Cor, Boolean.valueOf(n8071Art_Enc), A8071Art_Enc, Boolean.valueOf(n8070Art_Elar), Short.valueOf(A8070Art_Elar), Boolean.valueOf(n8069Art_Eanc), Short.valueOf(A8069Art_Eanc), Boolean.valueOf(n8068Art_PmlA), Short.valueOf(A8068Art_PmlA), Boolean.valueOf(n8067Art_Merma), A8067Art_Merma, Boolean.valueOf(n8066Art_AncA), Short.valueOf(A8066Art_AncA), Boolean.valueOf(n8065Art_GrmA), Short.valueOf(A8065Art_GrmA), Boolean.valueOf(n8955Art_Obs), A8955Art_Obs, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
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
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            A758ProCod = W758ProCod ;
            A8084Art_RdoP = W8084Art_RdoP ;
            n8084Art_RdoP = false ;
            A8083Art_AncP = W8083Art_AncP ;
            n8083Art_AncP = false ;
            A8082Art_PmlP = W8082Art_PmlP ;
            n8082Art_PmlP = false ;
            A8081Art_GrmP = W8081Art_GrmP ;
            n8081Art_GrmP = false ;
            A8080Art_PmlC = W8080Art_PmlC ;
            n8080Art_PmlC = false ;
            A8079Art_AncC = W8079Art_AncC ;
            n8079Art_AncC = false ;
            A8078Art_GrmC = W8078Art_GrmC ;
            n8078Art_GrmC = false ;
            A8077Art_GrmB = W8077Art_GrmB ;
            n8077Art_GrmB = false ;
            A8076Art_AncB = W8076Art_AncB ;
            n8076Art_AncB = false ;
            A8075Art_Fabs = W8075Art_Fabs ;
            n8075Art_Fabs = false ;
            A8074Art_Rdpc = W8074Art_Rdpc ;
            n8074Art_Rdpc = false ;
            A8073Art_Rdo = W8073Art_Rdo ;
            n8073Art_Rdo = false ;
            A8072Art_Cor = W8072Art_Cor ;
            n8072Art_Cor = false ;
            A8071Art_Enc = W8071Art_Enc ;
            n8071Art_Enc = false ;
            A8070Art_Elar = W8070Art_Elar ;
            n8070Art_Elar = false ;
            A8069Art_Eanc = W8069Art_Eanc ;
            n8069Art_Eanc = false ;
            A8068Art_PmlA = W8068Art_PmlA ;
            n8068Art_PmlA = false ;
            A8067Art_Merma = W8067Art_Merma ;
            n8067Art_Merma = false ;
            A8066Art_AncA = W8066Art_AncA ;
            n8066Art_AncA = false ;
            A8065Art_GrmA = W8065Art_GrmA ;
            n8065Art_GrmA = false ;
            A8955Art_Obs = W8955Art_Obs ;
            n8955Art_Obs = false ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            A758ProCod = W758ProCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partdat.this.A396EmprCod;
      this.aP1[0] = partdat.this.AV8Clicod;
      this.aP2[0] = partdat.this.AV9Artcod;
      this.aP3[0] = partdat.this.AV10Procod;
      Application.commitDataStores(context, remoteHandle, pr_default, "partdat");
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
      P033P2_A3072ArtObsLon = new String[] {""} ;
      P033P2_n3072ArtObsLon = new boolean[] {false} ;
      P033P2_A396EmprCod = new String[] {""} ;
      P033P2_A65ArtCod = new String[] {""} ;
      P033P2_A252CliCod = new int[1] ;
      A3072ArtObsLon = "" ;
      A65ArtCod = "" ;
      W396EmprCod = "" ;
      W65ArtCod = "" ;
      AV14ArtObsLon = "" ;
      AV16Art_Obs = "" ;
      AV13Obstxt = "" ;
      P033P3_A396EmprCod = new String[] {""} ;
      P033P3_A252CliCod = new int[1] ;
      P033P3_A65ArtCod = new String[] {""} ;
      P033P3_A8955Art_Obs = new String[] {""} ;
      P033P3_n8955Art_Obs = new boolean[] {false} ;
      P033P3_A8084Art_RdoP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P033P3_n8084Art_RdoP = new boolean[] {false} ;
      P033P3_A8083Art_AncP = new short[1] ;
      P033P3_n8083Art_AncP = new boolean[] {false} ;
      P033P3_A8082Art_PmlP = new short[1] ;
      P033P3_n8082Art_PmlP = new boolean[] {false} ;
      P033P3_A8081Art_GrmP = new short[1] ;
      P033P3_n8081Art_GrmP = new boolean[] {false} ;
      P033P3_A8080Art_PmlC = new short[1] ;
      P033P3_n8080Art_PmlC = new boolean[] {false} ;
      P033P3_A8079Art_AncC = new short[1] ;
      P033P3_n8079Art_AncC = new boolean[] {false} ;
      P033P3_A8078Art_GrmC = new short[1] ;
      P033P3_n8078Art_GrmC = new boolean[] {false} ;
      P033P3_A8077Art_GrmB = new short[1] ;
      P033P3_n8077Art_GrmB = new boolean[] {false} ;
      P033P3_A8076Art_AncB = new short[1] ;
      P033P3_n8076Art_AncB = new boolean[] {false} ;
      P033P3_A8075Art_Fabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P033P3_n8075Art_Fabs = new boolean[] {false} ;
      P033P3_A8074Art_Rdpc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P033P3_n8074Art_Rdpc = new boolean[] {false} ;
      P033P3_A8073Art_Rdo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P033P3_n8073Art_Rdo = new boolean[] {false} ;
      P033P3_A8072Art_Cor = new String[] {""} ;
      P033P3_n8072Art_Cor = new boolean[] {false} ;
      P033P3_A8071Art_Enc = new String[] {""} ;
      P033P3_n8071Art_Enc = new boolean[] {false} ;
      P033P3_A8070Art_Elar = new short[1] ;
      P033P3_n8070Art_Elar = new boolean[] {false} ;
      P033P3_A8069Art_Eanc = new short[1] ;
      P033P3_n8069Art_Eanc = new boolean[] {false} ;
      P033P3_A8068Art_PmlA = new short[1] ;
      P033P3_n8068Art_PmlA = new boolean[] {false} ;
      P033P3_A8067Art_Merma = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P033P3_n8067Art_Merma = new boolean[] {false} ;
      P033P3_A8066Art_AncA = new short[1] ;
      P033P3_n8066Art_AncA = new boolean[] {false} ;
      P033P3_A8065Art_GrmA = new short[1] ;
      P033P3_n8065Art_GrmA = new boolean[] {false} ;
      P033P3_A758ProCod = new String[] {""} ;
      P033P3_A7777ArtRdtSc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P033P3_n7777ArtRdtSc = new boolean[] {false} ;
      P033P3_A7414ArtAncSc = new short[1] ;
      P033P3_n7414ArtAncSc = new boolean[] {false} ;
      P033P3_A7413ArtPmlSc = new short[1] ;
      P033P3_n7413ArtPmlSc = new boolean[] {false} ;
      P033P3_A7412Artgrm2Sc = new short[1] ;
      P033P3_n7412Artgrm2Sc = new boolean[] {false} ;
      P033P3_A7415ArtPmlCru = new short[1] ;
      P033P3_n7415ArtPmlCru = new boolean[] {false} ;
      P033P3_A68ArtCruMin = new short[1] ;
      P033P3_n68ArtCruMin = new boolean[] {false} ;
      P033P3_A78ArtGraCru = new short[1] ;
      P033P3_n78ArtGraCru = new boolean[] {false} ;
      P033P3_A3123ArtAncSal2 = new short[1] ;
      P033P3_n3123ArtAncSal2 = new boolean[] {false} ;
      P033P3_A3122ArtAncSal1 = new short[1] ;
      P033P3_n3122ArtAncSal1 = new boolean[] {false} ;
      P033P3_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P033P3_n2791ArtFacAbs = new boolean[] {false} ;
      P033P3_A1905ArtRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P033P3_n1905ArtRdoA = new boolean[] {false} ;
      P033P3_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P033P3_n95ArtRen = new boolean[] {false} ;
      P033P3_A66ArtCorOri = new String[] {""} ;
      P033P3_n66ArtCorOri = new boolean[] {false} ;
      P033P3_A70ArtEncOri = new String[] {""} ;
      P033P3_n70ArtEncOri = new boolean[] {false} ;
      P033P3_A1229ArtEncCom = new short[1] ;
      P033P3_n1229ArtEncCom = new boolean[] {false} ;
      P033P3_A1230ArtEncAnh = new short[1] ;
      P033P3_n1230ArtEncAnh = new boolean[] {false} ;
      P033P3_A1148ArtPml = new short[1] ;
      P033P3_n1148ArtPml = new boolean[] {false} ;
      P033P3_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P033P3_n88ArtMer = new boolean[] {false} ;
      P033P3_A63ArtAcaMin = new short[1] ;
      P033P3_n63ArtAcaMin = new boolean[] {false} ;
      P033P3_A1903ArtGraAca = new short[1] ;
      P033P3_n1903ArtGraAca = new boolean[] {false} ;
      P033P3_A12752Art_Tipo = new String[] {""} ;
      P033P3_n12752Art_Tipo = new boolean[] {false} ;
      P033P3_A12142ProStFec = new java.util.Date[] {GXutil.nullDate()} ;
      P033P3_A12141ProSta = new byte[1] ;
      P033P3_A11272ProFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P033P3_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      P033P3_A10555ProUserM = new String[] {""} ;
      P033P3_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      P033P3_A10553ProUserA = new String[] {""} ;
      P033P3_A10412ProAct = new String[] {""} ;
      P033P3_A10026DscCFa = new String[] {""} ;
      P033P3_A9629Art_els = new String[] {""} ;
      P033P3_n9629Art_els = new boolean[] {false} ;
      P033P3_A9628Art_ets = new String[] {""} ;
      P033P3_n9628Art_ets = new boolean[] {false} ;
      P033P3_A8166Art_Und = new String[] {""} ;
      P033P3_n8166Art_Und = new boolean[] {false} ;
      P033P3_A8165Art_Dsc = new String[] {""} ;
      P033P3_n8165Art_Dsc = new boolean[] {false} ;
      A8955Art_Obs = "" ;
      A8084Art_RdoP = DecimalUtil.ZERO ;
      A8075Art_Fabs = DecimalUtil.ZERO ;
      A8074Art_Rdpc = DecimalUtil.ZERO ;
      A8073Art_Rdo = DecimalUtil.ZERO ;
      A8072Art_Cor = "" ;
      A8071Art_Enc = "" ;
      A8067Art_Merma = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      A7777ArtRdtSc = DecimalUtil.ZERO ;
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      A1905ArtRdoA = DecimalUtil.ZERO ;
      A95ArtRen = DecimalUtil.ZERO ;
      A66ArtCorOri = "" ;
      A70ArtEncOri = "" ;
      A88ArtMer = DecimalUtil.ZERO ;
      A12752Art_Tipo = "" ;
      A12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
      A11272ProFabs = DecimalUtil.ZERO ;
      A10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      A10555ProUserM = "" ;
      A10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      A10553ProUserA = "" ;
      A10412ProAct = "" ;
      A10026DscCFa = "" ;
      A9629Art_els = "" ;
      A9628Art_ets = "" ;
      A8166Art_Und = "" ;
      A8165Art_Dsc = "" ;
      W758ProCod = "" ;
      W8084Art_RdoP = DecimalUtil.ZERO ;
      W8075Art_Fabs = DecimalUtil.ZERO ;
      W8074Art_Rdpc = DecimalUtil.ZERO ;
      W8073Art_Rdo = DecimalUtil.ZERO ;
      W8072Art_Cor = "" ;
      W8071Art_Enc = "" ;
      W8067Art_Merma = DecimalUtil.ZERO ;
      W8955Art_Obs = "" ;
      Gx_emsg = "" ;
      P033P5_A396EmprCod = new String[] {""} ;
      P033P5_A252CliCod = new int[1] ;
      P033P5_A65ArtCod = new String[] {""} ;
      P033P5_A758ProCod = new String[] {""} ;
      P033P5_A8084Art_RdoP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P033P5_n8084Art_RdoP = new boolean[] {false} ;
      P033P5_A8083Art_AncP = new short[1] ;
      P033P5_n8083Art_AncP = new boolean[] {false} ;
      P033P5_A8082Art_PmlP = new short[1] ;
      P033P5_n8082Art_PmlP = new boolean[] {false} ;
      P033P5_A8081Art_GrmP = new short[1] ;
      P033P5_n8081Art_GrmP = new boolean[] {false} ;
      P033P5_A8080Art_PmlC = new short[1] ;
      P033P5_n8080Art_PmlC = new boolean[] {false} ;
      P033P5_A8079Art_AncC = new short[1] ;
      P033P5_n8079Art_AncC = new boolean[] {false} ;
      P033P5_A8078Art_GrmC = new short[1] ;
      P033P5_n8078Art_GrmC = new boolean[] {false} ;
      P033P5_A8077Art_GrmB = new short[1] ;
      P033P5_n8077Art_GrmB = new boolean[] {false} ;
      P033P5_A8076Art_AncB = new short[1] ;
      P033P5_n8076Art_AncB = new boolean[] {false} ;
      P033P5_A8075Art_Fabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P033P5_n8075Art_Fabs = new boolean[] {false} ;
      P033P5_A8074Art_Rdpc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P033P5_n8074Art_Rdpc = new boolean[] {false} ;
      P033P5_A8073Art_Rdo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P033P5_n8073Art_Rdo = new boolean[] {false} ;
      P033P5_A8072Art_Cor = new String[] {""} ;
      P033P5_n8072Art_Cor = new boolean[] {false} ;
      P033P5_A8071Art_Enc = new String[] {""} ;
      P033P5_n8071Art_Enc = new boolean[] {false} ;
      P033P5_A8070Art_Elar = new short[1] ;
      P033P5_n8070Art_Elar = new boolean[] {false} ;
      P033P5_A8069Art_Eanc = new short[1] ;
      P033P5_n8069Art_Eanc = new boolean[] {false} ;
      P033P5_A8068Art_PmlA = new short[1] ;
      P033P5_n8068Art_PmlA = new boolean[] {false} ;
      P033P5_A8067Art_Merma = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P033P5_n8067Art_Merma = new boolean[] {false} ;
      P033P5_A8066Art_AncA = new short[1] ;
      P033P5_n8066Art_AncA = new boolean[] {false} ;
      P033P5_A8065Art_GrmA = new short[1] ;
      P033P5_n8065Art_GrmA = new boolean[] {false} ;
      P033P5_A8955Art_Obs = new String[] {""} ;
      P033P5_n8955Art_Obs = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partdat__default(),
         new Object[] {
             new Object[] {
            P033P2_A3072ArtObsLon, P033P2_n3072ArtObsLon, P033P2_A396EmprCod, P033P2_A65ArtCod, P033P2_A252CliCod
            }
            , new Object[] {
            P033P3_A396EmprCod, P033P3_A252CliCod, P033P3_A65ArtCod, P033P3_A8955Art_Obs, P033P3_n8955Art_Obs, P033P3_A8084Art_RdoP, P033P3_n8084Art_RdoP, P033P3_A8083Art_AncP, P033P3_n8083Art_AncP, P033P3_A8082Art_PmlP,
            P033P3_n8082Art_PmlP, P033P3_A8081Art_GrmP, P033P3_n8081Art_GrmP, P033P3_A8080Art_PmlC, P033P3_n8080Art_PmlC, P033P3_A8079Art_AncC, P033P3_n8079Art_AncC, P033P3_A8078Art_GrmC, P033P3_n8078Art_GrmC, P033P3_A8077Art_GrmB,
            P033P3_n8077Art_GrmB, P033P3_A8076Art_AncB, P033P3_n8076Art_AncB, P033P3_A8075Art_Fabs, P033P3_n8075Art_Fabs, P033P3_A8074Art_Rdpc, P033P3_n8074Art_Rdpc, P033P3_A8073Art_Rdo, P033P3_n8073Art_Rdo, P033P3_A8072Art_Cor,
            P033P3_n8072Art_Cor, P033P3_A8071Art_Enc, P033P3_n8071Art_Enc, P033P3_A8070Art_Elar, P033P3_n8070Art_Elar, P033P3_A8069Art_Eanc, P033P3_n8069Art_Eanc, P033P3_A8068Art_PmlA, P033P3_n8068Art_PmlA, P033P3_A8067Art_Merma,
            P033P3_n8067Art_Merma, P033P3_A8066Art_AncA, P033P3_n8066Art_AncA, P033P3_A8065Art_GrmA, P033P3_n8065Art_GrmA, P033P3_A758ProCod, P033P3_A7777ArtRdtSc, P033P3_n7777ArtRdtSc, P033P3_A7414ArtAncSc, P033P3_n7414ArtAncSc,
            P033P3_A7413ArtPmlSc, P033P3_n7413ArtPmlSc, P033P3_A7412Artgrm2Sc, P033P3_n7412Artgrm2Sc, P033P3_A7415ArtPmlCru, P033P3_n7415ArtPmlCru, P033P3_A68ArtCruMin, P033P3_n68ArtCruMin, P033P3_A78ArtGraCru, P033P3_n78ArtGraCru,
            P033P3_A3123ArtAncSal2, P033P3_n3123ArtAncSal2, P033P3_A3122ArtAncSal1, P033P3_n3122ArtAncSal1, P033P3_A2791ArtFacAbs, P033P3_n2791ArtFacAbs, P033P3_A1905ArtRdoA, P033P3_n1905ArtRdoA, P033P3_A95ArtRen, P033P3_n95ArtRen,
            P033P3_A66ArtCorOri, P033P3_n66ArtCorOri, P033P3_A70ArtEncOri, P033P3_n70ArtEncOri, P033P3_A1229ArtEncCom, P033P3_n1229ArtEncCom, P033P3_A1230ArtEncAnh, P033P3_n1230ArtEncAnh, P033P3_A1148ArtPml, P033P3_n1148ArtPml,
            P033P3_A88ArtMer, P033P3_n88ArtMer, P033P3_A63ArtAcaMin, P033P3_n63ArtAcaMin, P033P3_A1903ArtGraAca, P033P3_n1903ArtGraAca, P033P3_A12752Art_Tipo, P033P3_n12752Art_Tipo, P033P3_A12142ProStFec, P033P3_A12141ProSta,
            P033P3_A11272ProFabs, P033P3_A10556ProFecM, P033P3_A10555ProUserM, P033P3_A10554ProFecA, P033P3_A10553ProUserA, P033P3_A10412ProAct, P033P3_A10026DscCFa, P033P3_A9629Art_els, P033P3_n9629Art_els, P033P3_A9628Art_ets,
            P033P3_n9628Art_ets, P033P3_A8166Art_Und, P033P3_n8166Art_Und, P033P3_A8165Art_Dsc, P033P3_n8165Art_Dsc
            }
            , new Object[] {
            }
            , new Object[] {
            P033P5_A396EmprCod, P033P5_A252CliCod, P033P5_A65ArtCod, P033P5_A758ProCod, P033P5_A8084Art_RdoP, P033P5_n8084Art_RdoP, P033P5_A8083Art_AncP, P033P5_n8083Art_AncP, P033P5_A8082Art_PmlP, P033P5_n8082Art_PmlP,
            P033P5_A8081Art_GrmP, P033P5_n8081Art_GrmP, P033P5_A8080Art_PmlC, P033P5_n8080Art_PmlC, P033P5_A8079Art_AncC, P033P5_n8079Art_AncC, P033P5_A8078Art_GrmC, P033P5_n8078Art_GrmC, P033P5_A8077Art_GrmB, P033P5_n8077Art_GrmB,
            P033P5_A8076Art_AncB, P033P5_n8076Art_AncB, P033P5_A8075Art_Fabs, P033P5_n8075Art_Fabs, P033P5_A8074Art_Rdpc, P033P5_n8074Art_Rdpc, P033P5_A8073Art_Rdo, P033P5_n8073Art_Rdo, P033P5_A8072Art_Cor, P033P5_n8072Art_Cor,
            P033P5_A8071Art_Enc, P033P5_n8071Art_Enc, P033P5_A8070Art_Elar, P033P5_n8070Art_Elar, P033P5_A8069Art_Eanc, P033P5_n8069Art_Eanc, P033P5_A8068Art_PmlA, P033P5_n8068Art_PmlA, P033P5_A8067Art_Merma, P033P5_n8067Art_Merma,
            P033P5_A8066Art_AncA, P033P5_n8066Art_AncA, P033P5_A8065Art_GrmA, P033P5_n8065Art_GrmA, P033P5_A8955Art_Obs, P033P5_n8955Art_Obs
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A12141ProSta ;
   private short AV11Nlin ;
   private short AV12i ;
   private short A8083Art_AncP ;
   private short A8082Art_PmlP ;
   private short A8081Art_GrmP ;
   private short A8080Art_PmlC ;
   private short A8079Art_AncC ;
   private short A8078Art_GrmC ;
   private short A8077Art_GrmB ;
   private short A8076Art_AncB ;
   private short A8070Art_Elar ;
   private short A8069Art_Eanc ;
   private short A8068Art_PmlA ;
   private short A8066Art_AncA ;
   private short A8065Art_GrmA ;
   private short A7414ArtAncSc ;
   private short A7413ArtPmlSc ;
   private short A7412Artgrm2Sc ;
   private short A7415ArtPmlCru ;
   private short A68ArtCruMin ;
   private short A78ArtGraCru ;
   private short A3123ArtAncSal2 ;
   private short A3122ArtAncSal1 ;
   private short A1229ArtEncCom ;
   private short A1230ArtEncAnh ;
   private short A1148ArtPml ;
   private short A63ArtAcaMin ;
   private short A1903ArtGraAca ;
   private short W8083Art_AncP ;
   private short W8082Art_PmlP ;
   private short W8081Art_GrmP ;
   private short W8080Art_PmlC ;
   private short W8079Art_AncC ;
   private short W8078Art_GrmC ;
   private short W8077Art_GrmB ;
   private short W8076Art_AncB ;
   private short W8070Art_Elar ;
   private short W8069Art_Eanc ;
   private short W8068Art_PmlA ;
   private short W8066Art_AncA ;
   private short W8065Art_GrmA ;
   private short Gx_err ;
   private int AV8Clicod ;
   private int A252CliCod ;
   private int W252CliCod ;
   private int GX_INS11 ;
   private java.math.BigDecimal A8084Art_RdoP ;
   private java.math.BigDecimal A8075Art_Fabs ;
   private java.math.BigDecimal A8074Art_Rdpc ;
   private java.math.BigDecimal A8073Art_Rdo ;
   private java.math.BigDecimal A8067Art_Merma ;
   private java.math.BigDecimal A7777ArtRdtSc ;
   private java.math.BigDecimal A2791ArtFacAbs ;
   private java.math.BigDecimal A1905ArtRdoA ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal A88ArtMer ;
   private java.math.BigDecimal A11272ProFabs ;
   private java.math.BigDecimal W8084Art_RdoP ;
   private java.math.BigDecimal W8075Art_Fabs ;
   private java.math.BigDecimal W8074Art_Rdpc ;
   private java.math.BigDecimal W8073Art_Rdo ;
   private java.math.BigDecimal W8067Art_Merma ;
   private String A396EmprCod ;
   private String AV9Artcod ;
   private String AV10Procod ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String W396EmprCod ;
   private String W65ArtCod ;
   private String AV13Obstxt ;
   private String A8072Art_Cor ;
   private String A8071Art_Enc ;
   private String A758ProCod ;
   private String A66ArtCorOri ;
   private String A70ArtEncOri ;
   private String A12752Art_Tipo ;
   private String A10555ProUserM ;
   private String A10553ProUserA ;
   private String A10412ProAct ;
   private String A10026DscCFa ;
   private String A9629Art_els ;
   private String A9628Art_ets ;
   private String A8166Art_Und ;
   private String A8165Art_Dsc ;
   private String W758ProCod ;
   private String W8072Art_Cor ;
   private String W8071Art_Enc ;
   private String Gx_emsg ;
   private java.util.Date A12142ProStFec ;
   private java.util.Date A10556ProFecM ;
   private java.util.Date A10554ProFecA ;
   private boolean n3072ArtObsLon ;
   private boolean n8955Art_Obs ;
   private boolean n8084Art_RdoP ;
   private boolean n8083Art_AncP ;
   private boolean n8082Art_PmlP ;
   private boolean n8081Art_GrmP ;
   private boolean n8080Art_PmlC ;
   private boolean n8079Art_AncC ;
   private boolean n8078Art_GrmC ;
   private boolean n8077Art_GrmB ;
   private boolean n8076Art_AncB ;
   private boolean n8075Art_Fabs ;
   private boolean n8074Art_Rdpc ;
   private boolean n8073Art_Rdo ;
   private boolean n8072Art_Cor ;
   private boolean n8071Art_Enc ;
   private boolean n8070Art_Elar ;
   private boolean n8069Art_Eanc ;
   private boolean n8068Art_PmlA ;
   private boolean n8067Art_Merma ;
   private boolean n8066Art_AncA ;
   private boolean n8065Art_GrmA ;
   private boolean n7777ArtRdtSc ;
   private boolean n7414ArtAncSc ;
   private boolean n7413ArtPmlSc ;
   private boolean n7412Artgrm2Sc ;
   private boolean n7415ArtPmlCru ;
   private boolean n68ArtCruMin ;
   private boolean n78ArtGraCru ;
   private boolean n3123ArtAncSal2 ;
   private boolean n3122ArtAncSal1 ;
   private boolean n2791ArtFacAbs ;
   private boolean n1905ArtRdoA ;
   private boolean n95ArtRen ;
   private boolean n66ArtCorOri ;
   private boolean n70ArtEncOri ;
   private boolean n1229ArtEncCom ;
   private boolean n1230ArtEncAnh ;
   private boolean n1148ArtPml ;
   private boolean n88ArtMer ;
   private boolean n63ArtAcaMin ;
   private boolean n1903ArtGraAca ;
   private boolean n12752Art_Tipo ;
   private boolean n9629Art_els ;
   private boolean n9628Art_ets ;
   private boolean n8166Art_Und ;
   private boolean n8165Art_Dsc ;
   private String A3072ArtObsLon ;
   private String AV14ArtObsLon ;
   private String AV16Art_Obs ;
   private String A8955Art_Obs ;
   private String W8955Art_Obs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P033P2_A3072ArtObsLon ;
   private boolean[] P033P2_n3072ArtObsLon ;
   private String[] P033P2_A396EmprCod ;
   private String[] P033P2_A65ArtCod ;
   private int[] P033P2_A252CliCod ;
   private String[] P033P3_A396EmprCod ;
   private int[] P033P3_A252CliCod ;
   private String[] P033P3_A65ArtCod ;
   private String[] P033P3_A8955Art_Obs ;
   private boolean[] P033P3_n8955Art_Obs ;
   private java.math.BigDecimal[] P033P3_A8084Art_RdoP ;
   private boolean[] P033P3_n8084Art_RdoP ;
   private short[] P033P3_A8083Art_AncP ;
   private boolean[] P033P3_n8083Art_AncP ;
   private short[] P033P3_A8082Art_PmlP ;
   private boolean[] P033P3_n8082Art_PmlP ;
   private short[] P033P3_A8081Art_GrmP ;
   private boolean[] P033P3_n8081Art_GrmP ;
   private short[] P033P3_A8080Art_PmlC ;
   private boolean[] P033P3_n8080Art_PmlC ;
   private short[] P033P3_A8079Art_AncC ;
   private boolean[] P033P3_n8079Art_AncC ;
   private short[] P033P3_A8078Art_GrmC ;
   private boolean[] P033P3_n8078Art_GrmC ;
   private short[] P033P3_A8077Art_GrmB ;
   private boolean[] P033P3_n8077Art_GrmB ;
   private short[] P033P3_A8076Art_AncB ;
   private boolean[] P033P3_n8076Art_AncB ;
   private java.math.BigDecimal[] P033P3_A8075Art_Fabs ;
   private boolean[] P033P3_n8075Art_Fabs ;
   private java.math.BigDecimal[] P033P3_A8074Art_Rdpc ;
   private boolean[] P033P3_n8074Art_Rdpc ;
   private java.math.BigDecimal[] P033P3_A8073Art_Rdo ;
   private boolean[] P033P3_n8073Art_Rdo ;
   private String[] P033P3_A8072Art_Cor ;
   private boolean[] P033P3_n8072Art_Cor ;
   private String[] P033P3_A8071Art_Enc ;
   private boolean[] P033P3_n8071Art_Enc ;
   private short[] P033P3_A8070Art_Elar ;
   private boolean[] P033P3_n8070Art_Elar ;
   private short[] P033P3_A8069Art_Eanc ;
   private boolean[] P033P3_n8069Art_Eanc ;
   private short[] P033P3_A8068Art_PmlA ;
   private boolean[] P033P3_n8068Art_PmlA ;
   private java.math.BigDecimal[] P033P3_A8067Art_Merma ;
   private boolean[] P033P3_n8067Art_Merma ;
   private short[] P033P3_A8066Art_AncA ;
   private boolean[] P033P3_n8066Art_AncA ;
   private short[] P033P3_A8065Art_GrmA ;
   private boolean[] P033P3_n8065Art_GrmA ;
   private String[] P033P3_A758ProCod ;
   private java.math.BigDecimal[] P033P3_A7777ArtRdtSc ;
   private boolean[] P033P3_n7777ArtRdtSc ;
   private short[] P033P3_A7414ArtAncSc ;
   private boolean[] P033P3_n7414ArtAncSc ;
   private short[] P033P3_A7413ArtPmlSc ;
   private boolean[] P033P3_n7413ArtPmlSc ;
   private short[] P033P3_A7412Artgrm2Sc ;
   private boolean[] P033P3_n7412Artgrm2Sc ;
   private short[] P033P3_A7415ArtPmlCru ;
   private boolean[] P033P3_n7415ArtPmlCru ;
   private short[] P033P3_A68ArtCruMin ;
   private boolean[] P033P3_n68ArtCruMin ;
   private short[] P033P3_A78ArtGraCru ;
   private boolean[] P033P3_n78ArtGraCru ;
   private short[] P033P3_A3123ArtAncSal2 ;
   private boolean[] P033P3_n3123ArtAncSal2 ;
   private short[] P033P3_A3122ArtAncSal1 ;
   private boolean[] P033P3_n3122ArtAncSal1 ;
   private java.math.BigDecimal[] P033P3_A2791ArtFacAbs ;
   private boolean[] P033P3_n2791ArtFacAbs ;
   private java.math.BigDecimal[] P033P3_A1905ArtRdoA ;
   private boolean[] P033P3_n1905ArtRdoA ;
   private java.math.BigDecimal[] P033P3_A95ArtRen ;
   private boolean[] P033P3_n95ArtRen ;
   private String[] P033P3_A66ArtCorOri ;
   private boolean[] P033P3_n66ArtCorOri ;
   private String[] P033P3_A70ArtEncOri ;
   private boolean[] P033P3_n70ArtEncOri ;
   private short[] P033P3_A1229ArtEncCom ;
   private boolean[] P033P3_n1229ArtEncCom ;
   private short[] P033P3_A1230ArtEncAnh ;
   private boolean[] P033P3_n1230ArtEncAnh ;
   private short[] P033P3_A1148ArtPml ;
   private boolean[] P033P3_n1148ArtPml ;
   private java.math.BigDecimal[] P033P3_A88ArtMer ;
   private boolean[] P033P3_n88ArtMer ;
   private short[] P033P3_A63ArtAcaMin ;
   private boolean[] P033P3_n63ArtAcaMin ;
   private short[] P033P3_A1903ArtGraAca ;
   private boolean[] P033P3_n1903ArtGraAca ;
   private String[] P033P3_A12752Art_Tipo ;
   private boolean[] P033P3_n12752Art_Tipo ;
   private java.util.Date[] P033P3_A12142ProStFec ;
   private byte[] P033P3_A12141ProSta ;
   private java.math.BigDecimal[] P033P3_A11272ProFabs ;
   private java.util.Date[] P033P3_A10556ProFecM ;
   private String[] P033P3_A10555ProUserM ;
   private java.util.Date[] P033P3_A10554ProFecA ;
   private String[] P033P3_A10553ProUserA ;
   private String[] P033P3_A10412ProAct ;
   private String[] P033P3_A10026DscCFa ;
   private String[] P033P3_A9629Art_els ;
   private boolean[] P033P3_n9629Art_els ;
   private String[] P033P3_A9628Art_ets ;
   private boolean[] P033P3_n9628Art_ets ;
   private String[] P033P3_A8166Art_Und ;
   private boolean[] P033P3_n8166Art_Und ;
   private String[] P033P3_A8165Art_Dsc ;
   private boolean[] P033P3_n8165Art_Dsc ;
   private String[] P033P5_A396EmprCod ;
   private int[] P033P5_A252CliCod ;
   private String[] P033P5_A65ArtCod ;
   private String[] P033P5_A758ProCod ;
   private java.math.BigDecimal[] P033P5_A8084Art_RdoP ;
   private boolean[] P033P5_n8084Art_RdoP ;
   private short[] P033P5_A8083Art_AncP ;
   private boolean[] P033P5_n8083Art_AncP ;
   private short[] P033P5_A8082Art_PmlP ;
   private boolean[] P033P5_n8082Art_PmlP ;
   private short[] P033P5_A8081Art_GrmP ;
   private boolean[] P033P5_n8081Art_GrmP ;
   private short[] P033P5_A8080Art_PmlC ;
   private boolean[] P033P5_n8080Art_PmlC ;
   private short[] P033P5_A8079Art_AncC ;
   private boolean[] P033P5_n8079Art_AncC ;
   private short[] P033P5_A8078Art_GrmC ;
   private boolean[] P033P5_n8078Art_GrmC ;
   private short[] P033P5_A8077Art_GrmB ;
   private boolean[] P033P5_n8077Art_GrmB ;
   private short[] P033P5_A8076Art_AncB ;
   private boolean[] P033P5_n8076Art_AncB ;
   private java.math.BigDecimal[] P033P5_A8075Art_Fabs ;
   private boolean[] P033P5_n8075Art_Fabs ;
   private java.math.BigDecimal[] P033P5_A8074Art_Rdpc ;
   private boolean[] P033P5_n8074Art_Rdpc ;
   private java.math.BigDecimal[] P033P5_A8073Art_Rdo ;
   private boolean[] P033P5_n8073Art_Rdo ;
   private String[] P033P5_A8072Art_Cor ;
   private boolean[] P033P5_n8072Art_Cor ;
   private String[] P033P5_A8071Art_Enc ;
   private boolean[] P033P5_n8071Art_Enc ;
   private short[] P033P5_A8070Art_Elar ;
   private boolean[] P033P5_n8070Art_Elar ;
   private short[] P033P5_A8069Art_Eanc ;
   private boolean[] P033P5_n8069Art_Eanc ;
   private short[] P033P5_A8068Art_PmlA ;
   private boolean[] P033P5_n8068Art_PmlA ;
   private java.math.BigDecimal[] P033P5_A8067Art_Merma ;
   private boolean[] P033P5_n8067Art_Merma ;
   private short[] P033P5_A8066Art_AncA ;
   private boolean[] P033P5_n8066Art_AncA ;
   private short[] P033P5_A8065Art_GrmA ;
   private boolean[] P033P5_n8065Art_GrmA ;
   private String[] P033P5_A8955Art_Obs ;
   private boolean[] P033P5_n8955Art_Obs ;
}

final  class partdat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P033P2", "SELECT ArtObsLon, EmprCod, ArtCod, CliCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P033P3", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.Art_Obs, T1.Art_RdoP, T1.Art_AncP, T1.Art_PmlP, T1.Art_GrmP, T1.Art_PmlC, T1.Art_AncC, T1.Art_GrmC, T1.Art_GrmB, T1.Art_AncB, T1.Art_Fabs, T1.Art_Rdpc, T1.Art_Rdo, T1.Art_Cor, T1.Art_Enc, T1.Art_Elar, T1.Art_Eanc, T1.Art_PmlA, T1.Art_Merma, T1.Art_AncA, T1.Art_GrmA, T1.ProCod, T2.ArtRdtSc, T2.ArtAncSc, T2.ArtPmlSc, T2.Artgrm2Sc, T2.ArtPmlCru, T2.ArtCruMin, T2.ArtGraCru, T2.ArtAncSal2, T2.ArtAncSal1, T2.ArtFacAbs, T2.ArtRdoA, T2.ArtRen, T2.ArtCorOri, T2.ArtEncOri, T2.ArtEncCom, T2.ArtEncAnh, T2.ArtPml, T2.ArtMer, T2.ArtAcaMin, T2.ArtGraAca, T1.Art_Tipo, T1.ProStFec, T1.ProSta, T1.ProFabs, T1.ProFecM, T1.ProUserM, T1.ProFecA, T1.ProUserA, T1.ProAct, T1.DscCFa, T1.Art_els, T1.Art_ets, T1.Art_Und, T1.Art_Dsc FROM (TXPARTLIN T1 INNER JOIN TXPARTICU T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod = T1.ArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P033P4", "INSERT INTO TXPARTLIN(EmprCod, CliCod, ArtCod, ProCod, Art_GrmA, Art_AncA, Art_Merma, Art_PmlA, Art_Eanc, Art_Elar, Art_Enc, Art_Cor, Art_Rdo, Art_Rdpc, Art_Fabs, Art_AncB, Art_GrmB, Art_GrmC, Art_AncC, Art_PmlC, Art_GrmP, Art_PmlP, Art_AncP, Art_RdoP, Art_Dsc, Art_Und, Art_Obs, Art_ets, Art_els, DscCFa, ProAct, ProUserA, ProFecA, ProUserM, ProFecM, ProFabs, ProSta, ProStFec, Art_Tipo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTLIN")
         ,new ForEachCursor("P033P5", "SELECT EmprCod, CliCod, ArtCod, ProCod, Art_RdoP, Art_AncP, Art_PmlP, Art_GrmP, Art_PmlC, Art_AncC, Art_GrmC, Art_GrmB, Art_AncB, Art_Fabs, Art_Rdpc, Art_Rdo, Art_Cor, Art_Enc, Art_Elar, Art_Eanc, Art_PmlA, Art_Merma, Art_AncA, Art_GrmA, Art_Obs FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P033P6", "UPDATE TXPARTLIN SET Art_RdoP=?, Art_AncP=?, Art_PmlP=?, Art_GrmP=?, Art_PmlC=?, Art_AncC=?, Art_GrmC=?, Art_GrmB=?, Art_AncB=?, Art_Fabs=?, Art_Rdpc=?, Art_Rdo=?, Art_Cor=?, Art_Enc=?, Art_Elar=?, Art_Eanc=?, Art_PmlA=?, Art_Merma=?, Art_AncA=?, Art_GrmA=?, Art_Obs=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTLIN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(24);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(25, 8);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((short[]) buf[48])[0] = rslt.getShort(27);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((short[]) buf[50])[0] = rslt.getShort(28);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((short[]) buf[52])[0] = rslt.getShort(29);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((short[]) buf[54])[0] = rslt.getShort(30);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((short[]) buf[56])[0] = rslt.getShort(31);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((short[]) buf[58])[0] = rslt.getShort(32);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(33);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((short[]) buf[62])[0] = rslt.getShort(34);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[64])[0] = rslt.getBigDecimal(35,2);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[66])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((short[]) buf[74])[0] = rslt.getShort(40);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((short[]) buf[76])[0] = rslt.getShort(41);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((short[]) buf[78])[0] = rslt.getShort(42);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[80])[0] = rslt.getBigDecimal(43,2);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((short[]) buf[82])[0] = rslt.getShort(44);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((short[]) buf[84])[0] = rslt.getShort(45);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(46, 1);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[88])[0] = rslt.getGXDateTime(47);
               ((byte[]) buf[89])[0] = rslt.getByte(48);
               ((java.math.BigDecimal[]) buf[90])[0] = rslt.getBigDecimal(49,2);
               ((java.util.Date[]) buf[91])[0] = rslt.getGXDateTime(50);
               ((String[]) buf[92])[0] = rslt.getString(51, 10);
               ((java.util.Date[]) buf[93])[0] = rslt.getGXDateTime(52);
               ((String[]) buf[94])[0] = rslt.getString(53, 10);
               ((String[]) buf[95])[0] = rslt.getString(54, 1);
               ((String[]) buf[96])[0] = rslt.getString(55, 30);
               ((String[]) buf[97])[0] = rslt.getString(56, 10);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getString(57, 10);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getString(58, 1);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(59, 26);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((short[]) buf[42])[0] = rslt.getShort(24);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[33]).shortValue());
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
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[45], 26);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[47], 1);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[49], 800);
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
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[53], 10);
               }
               stmt.setString(30, (String)parms[54], 30);
               stmt.setString(31, (String)parms[55], 1);
               stmt.setString(32, (String)parms[56], 10);
               stmt.setDateTime(33, (java.util.Date)parms[57], false);
               stmt.setString(34, (String)parms[58], 10);
               stmt.setDateTime(35, (java.util.Date)parms[59], false);
               stmt.setBigDecimal(36, (java.math.BigDecimal)parms[60], 2);
               stmt.setByte(37, ((Number) parms[61]).byteValue());
               stmt.setDateTime(38, (java.util.Date)parms[62], false);
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[64], 1);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 800);
               }
               stmt.setString(22, (String)parms[42], 3);
               stmt.setInt(23, ((Number) parms[43]).intValue());
               stmt.setString(24, (String)parms[44], 16);
               stmt.setString(25, (String)parms[45], 8);
               return;
      }
   }

}

