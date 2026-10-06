package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmforeq extends GXProcedure
{
   public pmforeq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmforeq.class ), "" );
   }

   public pmforeq( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 )
   {
      pmforeq.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pmforeq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmforeq.this.AV8CliCod = aP1[0];
      this.aP1 = aP1;
      pmforeq.this.AV9ForSer = aP2[0];
      this.aP2 = aP2;
      pmforeq.this.AV10ForColNom = aP3[0];
      this.aP3 = aP3;
      pmforeq.this.AV11ForColNum = aP4[0];
      this.aP4 = aP4;
      pmforeq.this.AV12TipColCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV50Carvema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
      pmforeq.this.GXt_int1 = GXv_int2[0] ;
      AV50Carvema = GXt_int1 ;
      GXt_int1 = AV52dorado ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DORADO", ""), GXv_int2) ;
      pmforeq.this.GXt_int1 = GXv_int2[0] ;
      AV52dorado = GXt_int1 ;
      /* Using cursor P028Y2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), AV9ForSer, AV10ForColNom, Integer.valueOf(AV11ForColNum), Byte.valueOf(AV12TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P028Y2_A831TipColCod[0] ;
         A483ForColNum = P028Y2_A483ForColNum[0] ;
         A482ForColNom = P028Y2_A482ForColNom[0] ;
         A494ForSer = P028Y2_A494ForSer[0] ;
         A252CliCod = P028Y2_A252CliCod[0] ;
         A486ForNumCol = P028Y2_A486ForNumCol[0] ;
         A5337ForCodExt = P028Y2_A5337ForCodExt[0] ;
         n5337ForCodExt = P028Y2_n5337ForCodExt[0] ;
         A1192ForNumCli = P028Y2_A1192ForNumCli[0] ;
         n1192ForNumCli = P028Y2_n1192ForNumCli[0] ;
         A1191ForNomCli = P028Y2_A1191ForNomCli[0] ;
         n1191ForNomCli = P028Y2_n1191ForNomCli[0] ;
         A495ForUltMod = P028Y2_A495ForUltMod[0] ;
         n495ForUltMod = P028Y2_n495ForUltMod[0] ;
         A583IntCod = P028Y2_A583IntCod[0] ;
         A5362IntCodF = P028Y2_A5362IntCodF[0] ;
         n5362IntCodF = P028Y2_n5362IntCodF[0] ;
         A626MatCod = P028Y2_A626MatCod[0] ;
         A484ForCon = P028Y2_A484ForCon[0] ;
         A1159ForUltLin = P028Y2_A1159ForUltLin[0] ;
         n1159ForUltLin = P028Y2_n1159ForUltLin[0] ;
         A2749ForPro = P028Y2_A2749ForPro[0] ;
         n2749ForPro = P028Y2_n2749ForPro[0] ;
         A2838ForRelBan = P028Y2_A2838ForRelBan[0] ;
         n2838ForRelBan = P028Y2_n2838ForRelBan[0] ;
         A995ForTonal = P028Y2_A995ForTonal[0] ;
         n995ForTonal = P028Y2_n995ForTonal[0] ;
         A3315ForNumArc = P028Y2_A3315ForNumArc[0] ;
         n3315ForNumArc = P028Y2_n3315ForNumArc[0] ;
         A3316CodSol = P028Y2_A3316CodSol[0] ;
         n3316CodSol = P028Y2_n3316CodSol[0] ;
         A3588ForEst = P028Y2_A3588ForEst[0] ;
         n3588ForEst = P028Y2_n3588ForEst[0] ;
         A1514MacProCod = P028Y2_A1514MacProCod[0] ;
         n1514MacProCod = P028Y2_n1514MacProCod[0] ;
         A4339ForRGB = P028Y2_A4339ForRGB[0] ;
         n4339ForRGB = P028Y2_n4339ForRGB[0] ;
         A5624ForUsrCod = P028Y2_A5624ForUsrCod[0] ;
         n5624ForUsrCod = P028Y2_n5624ForUsrCod[0] ;
         A5625ForFecHor = P028Y2_A5625ForFecHor[0] ;
         n5625ForFecHor = P028Y2_n5625ForFecHor[0] ;
         A3560ForOpcCli = P028Y2_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P028Y2_n3560ForOpcCli[0] ;
         A3558ForFecApr = P028Y2_A3558ForFecApr[0] ;
         n3558ForFecApr = P028Y2_n3558ForFecApr[0] ;
         A8561Fam_Cod = P028Y2_A8561Fam_Cod[0] ;
         n8561Fam_Cod = P028Y2_n8561Fam_Cod[0] ;
         AV13ForNumCol = A486ForNumCol ;
         AV14ForCodExt = A5337ForCodExt ;
         AV15ForNumCli = A1192ForNumCli ;
         AV16ForNomCli = A1191ForNomCli ;
         AV18ForUltMod = A495ForUltMod ;
         AV19IntCod = A583IntCod ;
         AV32IntCodF = A5362IntCodF ;
         AV21MatCod = A626MatCod ;
         AV22ForCon = A484ForCon ;
         AV23ForUltLin = A1159ForUltLin ;
         AV24ForPro = A2749ForPro ;
         AV25ForRelBan = A2838ForRelBan ;
         AV26ForTonal = A995ForTonal ;
         AV27ForNumArc = A3315ForNumArc ;
         AV28CodSol = A3316CodSol ;
         AV31ForEst = A3588ForEst ;
         AV29MacProCod = A1514MacProCod ;
         AV30ForRGB = A4339ForRGB ;
         AV33ForUsrCod = A5624ForUsrCod ;
         AV34ForFecHor = A5625ForFecHor ;
         AV48ForOpcCli = A3560ForOpcCli ;
         AV49ForFecApr = A3558ForFecApr ;
         AV51Fam_cod = A8561Fam_Cod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P028Y3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV13ForNumCol)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A486ForNumCol = P028Y3_A486ForNumCol[0] ;
         A252CliCod = P028Y3_A252CliCod[0] ;
         A494ForSer = P028Y3_A494ForSer[0] ;
         A482ForColNom = P028Y3_A482ForColNom[0] ;
         A483ForColNum = P028Y3_A483ForColNum[0] ;
         A831TipColCod = P028Y3_A831TipColCod[0] ;
         AV35CliCodE = A252CliCod ;
         AV36ForSerE = A494ForSer ;
         AV37ForColNomE = A482ForColNom ;
         AV38ForColNumE = A483ForColNum ;
         AV39TipColCodE = A831TipColCod ;
         if ( ( AV8CliCod != AV35CliCodE ) || ( GXutil.strcmp(AV9ForSer, AV36ForSerE) != 0 ) || ( GXutil.strcmp(AV10ForColNom, AV37ForColNomE) != 0 ) || ( AV11ForColNum != AV38ForColNumE ) || ( AV12TipColCod != AV39TipColCodE ) )
         {
            System.out.println( httpContext.getMessage( "&CliCod <> &CliCodE .OR. &ForSer <> &ForSerE .OR. &ForColNom <> &ForColNomE .OR. &ForColNum <> &ForColNumE .OR. &TipColCod <> &TipColCodE", "") );
            /* Execute user subroutine: 'LFORMU' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P028Y4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV13ForNumCol)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A486ForNumCol = P028Y4_A486ForNumCol[0] ;
         A252CliCod = P028Y4_A252CliCod[0] ;
         A494ForSer = P028Y4_A494ForSer[0] ;
         A482ForColNom = P028Y4_A482ForColNom[0] ;
         A483ForColNum = P028Y4_A483ForColNum[0] ;
         A831TipColCod = P028Y4_A831TipColCod[0] ;
         A5337ForCodExt = P028Y4_A5337ForCodExt[0] ;
         n5337ForCodExt = P028Y4_n5337ForCodExt[0] ;
         A1192ForNumCli = P028Y4_A1192ForNumCli[0] ;
         n1192ForNumCli = P028Y4_n1192ForNumCli[0] ;
         A1191ForNomCli = P028Y4_A1191ForNomCli[0] ;
         n1191ForNomCli = P028Y4_n1191ForNomCli[0] ;
         A495ForUltMod = P028Y4_A495ForUltMod[0] ;
         n495ForUltMod = P028Y4_n495ForUltMod[0] ;
         A583IntCod = P028Y4_A583IntCod[0] ;
         A5362IntCodF = P028Y4_A5362IntCodF[0] ;
         n5362IntCodF = P028Y4_n5362IntCodF[0] ;
         A626MatCod = P028Y4_A626MatCod[0] ;
         A484ForCon = P028Y4_A484ForCon[0] ;
         A1159ForUltLin = P028Y4_A1159ForUltLin[0] ;
         n1159ForUltLin = P028Y4_n1159ForUltLin[0] ;
         A2749ForPro = P028Y4_A2749ForPro[0] ;
         n2749ForPro = P028Y4_n2749ForPro[0] ;
         A2838ForRelBan = P028Y4_A2838ForRelBan[0] ;
         n2838ForRelBan = P028Y4_n2838ForRelBan[0] ;
         A995ForTonal = P028Y4_A995ForTonal[0] ;
         n995ForTonal = P028Y4_n995ForTonal[0] ;
         A3315ForNumArc = P028Y4_A3315ForNumArc[0] ;
         n3315ForNumArc = P028Y4_n3315ForNumArc[0] ;
         A3316CodSol = P028Y4_A3316CodSol[0] ;
         n3316CodSol = P028Y4_n3316CodSol[0] ;
         A3588ForEst = P028Y4_A3588ForEst[0] ;
         n3588ForEst = P028Y4_n3588ForEst[0] ;
         A1514MacProCod = P028Y4_A1514MacProCod[0] ;
         n1514MacProCod = P028Y4_n1514MacProCod[0] ;
         A4339ForRGB = P028Y4_A4339ForRGB[0] ;
         n4339ForRGB = P028Y4_n4339ForRGB[0] ;
         A5624ForUsrCod = P028Y4_A5624ForUsrCod[0] ;
         n5624ForUsrCod = P028Y4_n5624ForUsrCod[0] ;
         A5625ForFecHor = P028Y4_A5625ForFecHor[0] ;
         n5625ForFecHor = P028Y4_n5625ForFecHor[0] ;
         A3560ForOpcCli = P028Y4_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P028Y4_n3560ForOpcCli[0] ;
         A8561Fam_Cod = P028Y4_A8561Fam_Cod[0] ;
         n8561Fam_Cod = P028Y4_n8561Fam_Cod[0] ;
         AV35CliCodE = A252CliCod ;
         AV36ForSerE = A494ForSer ;
         AV37ForColNomE = A482ForColNom ;
         AV38ForColNumE = A483ForColNum ;
         AV39TipColCodE = A831TipColCod ;
         if ( ( AV8CliCod != AV35CliCodE ) || ( GXutil.strcmp(AV9ForSer, AV36ForSerE) != 0 ) || ( GXutil.strcmp(AV10ForColNom, AV37ForColNomE) != 0 ) || ( AV11ForColNum != AV38ForColNumE ) || ( AV12TipColCod != AV39TipColCodE ) )
         {
            A5337ForCodExt = AV14ForCodExt ;
            n5337ForCodExt = false ;
            A1192ForNumCli = AV15ForNumCli ;
            n1192ForNumCli = false ;
            A1191ForNomCli = AV16ForNomCli ;
            n1191ForNomCli = false ;
            A495ForUltMod = AV18ForUltMod ;
            n495ForUltMod = false ;
            A583IntCod = AV19IntCod ;
            A5362IntCodF = AV32IntCodF ;
            n5362IntCodF = false ;
            A626MatCod = AV21MatCod ;
            A484ForCon = AV22ForCon ;
            A1159ForUltLin = AV23ForUltLin ;
            n1159ForUltLin = false ;
            A2749ForPro = AV24ForPro ;
            n2749ForPro = false ;
            A2838ForRelBan = AV25ForRelBan ;
            n2838ForRelBan = false ;
            A995ForTonal = ((AV52dorado==0) ? AV26ForTonal : A995ForTonal) ;
            n995ForTonal = false ;
            A3315ForNumArc = ((AV50Carvema==0) ? AV27ForNumArc : A3315ForNumArc) ;
            n3315ForNumArc = false ;
            A3316CodSol = AV28CodSol ;
            n3316CodSol = false ;
            A3588ForEst = AV31ForEst ;
            n3588ForEst = false ;
            A1514MacProCod = AV29MacProCod ;
            n1514MacProCod = false ;
            A4339ForRGB = AV30ForRGB ;
            n4339ForRGB = false ;
            A5624ForUsrCod = AV33ForUsrCod ;
            n5624ForUsrCod = false ;
            A5625ForFecHor = AV34ForFecHor ;
            n5625ForFecHor = false ;
            A3560ForOpcCli = AV48ForOpcCli ;
            n3560ForOpcCli = false ;
            A8561Fam_Cod = AV51Fam_cod ;
            n8561Fam_Cod = false ;
         }
         /* Using cursor P028Y5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n5337ForCodExt), A5337ForCodExt, Boolean.valueOf(n1192ForNumCli), Integer.valueOf(A1192ForNumCli), Boolean.valueOf(n1191ForNomCli), A1191ForNomCli, Boolean.valueOf(n495ForUltMod), A495ForUltMod, Byte.valueOf(A583IntCod), Boolean.valueOf(n5362IntCodF), Byte.valueOf(A5362IntCodF), Short.valueOf(A626MatCod), Byte.valueOf(A484ForCon), Boolean.valueOf(n1159ForUltLin), Short.valueOf(A1159ForUltLin), Boolean.valueOf(n2749ForPro), A2749ForPro, Boolean.valueOf(n2838ForRelBan), A2838ForRelBan, Boolean.valueOf(n995ForTonal), A995ForTonal, Boolean.valueOf(n3315ForNumArc), Integer.valueOf(A3315ForNumArc), Boolean.valueOf(n3316CodSol), Short.valueOf(A3316CodSol), Boolean.valueOf(n3588ForEst), A3588ForEst, Boolean.valueOf(n1514MacProCod), A1514MacProCod, Boolean.valueOf(n4339ForRGB), Long.valueOf(A4339ForRGB), Boolean.valueOf(n5624ForUsrCod), A5624ForUsrCod, Boolean.valueOf(n5625ForFecHor), A5625ForFecHor, Boolean.valueOf(n3560ForOpcCli), A3560ForOpcCli, Boolean.valueOf(n8561Fam_Cod), Short.valueOf(A8561Fam_Cod), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      GXv_char3[0] = A396EmprCod ;
      GXv_int4[0] = AV13ForNumCol ;
      GXv_char5[0] = AV48ForOpcCli ;
      GXv_int6[0] = AV28CodSol ;
      GXv_int2[0] = AV22ForCon ;
      GXv_date7[0] = AV49ForFecApr ;
      new app.pformuc(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_int6, GXv_int2, GXv_date7) ;
      pmforeq.this.A396EmprCod = GXv_char3[0] ;
      pmforeq.this.AV13ForNumCol = GXv_int4[0] ;
      pmforeq.this.AV48ForOpcCli = GXv_char5[0] ;
      pmforeq.this.AV28CodSol = GXv_int6[0] ;
      pmforeq.this.AV22ForCon = GXv_int2[0] ;
      pmforeq.this.AV49ForFecApr = GXv_date7[0] ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LFORMU' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P028Y6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV35CliCodE), AV36ForSerE, AV37ForColNomE, Integer.valueOf(AV38ForColNumE), Byte.valueOf(AV39TipColCodE)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P028Y7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV35CliCodE), AV36ForSerE, AV37ForColNomE, Integer.valueOf(AV38ForColNumE), Byte.valueOf(AV39TipColCodE)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORMQP");
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P028Y8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV35CliCodE), AV36ForSerE, AV37ForColNomE, Integer.valueOf(AV38ForColNumE), Byte.valueOf(AV39TipColCodE)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORCOM");
      /* End optimized DELETE. */
      /* Using cursor P028Y9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), AV9ForSer, AV10ForColNom, Integer.valueOf(AV11ForColNum), Byte.valueOf(AV12TipColCod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A764ProForCod = P028Y9_A764ProForCod[0] ;
         A1160ProForL = P028Y9_A1160ProForL[0] ;
         A831TipColCod = P028Y9_A831TipColCod[0] ;
         A483ForColNum = P028Y9_A483ForColNum[0] ;
         A482ForColNom = P028Y9_A482ForColNom[0] ;
         A494ForSer = P028Y9_A494ForSer[0] ;
         A252CliCod = P028Y9_A252CliCod[0] ;
         A14198ProforFabs = P028Y9_A14198ProforFabs[0] ;
         A10542ProForH2O = P028Y9_A10542ProForH2O[0] ;
         A9707ProForMq = P028Y9_A9707ProForMq[0] ;
         A9704ProForVol = P028Y9_A9704ProForVol[0] ;
         A8656ProForrbn = P028Y9_A8656ProForrbn[0] ;
         A7802ProFoNPrg = P028Y9_A7802ProFoNPrg[0] ;
         A6549ProForFR = P028Y9_A6549ProForFR[0] ;
         W252CliCod = A252CliCod ;
         W494ForSer = A494ForSer ;
         W482ForColNom = A482ForColNom ;
         W483ForColNum = A483ForColNum ;
         W831TipColCod = A831TipColCod ;
         AV40ProForL = A1160ProForL ;
         AV41ProForCod = A764ProForCod ;
         /*
            INSERT RECORD ON TABLE TXPLFORMU

         */
         W252CliCod = A252CliCod ;
         W494ForSer = A494ForSer ;
         W482ForColNom = A482ForColNom ;
         W483ForColNum = A483ForColNum ;
         W831TipColCod = A831TipColCod ;
         W1160ProForL = A1160ProForL ;
         W764ProForCod = A764ProForCod ;
         A252CliCod = AV35CliCodE ;
         A494ForSer = AV36ForSerE ;
         A482ForColNom = AV37ForColNomE ;
         A483ForColNum = AV38ForColNumE ;
         A831TipColCod = AV39TipColCodE ;
         A1160ProForL = AV40ProForL ;
         A764ProForCod = AV41ProForCod ;
         /* Using cursor P028Y10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL), A764ProForCod, A6549ProForFR, Integer.valueOf(A7802ProFoNPrg), A8656ProForrbn, Integer.valueOf(A9704ProForVol), A9707ProForMq, Short.valueOf(A10542ProForH2O), A14198ProforFabs});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
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
         A252CliCod = W252CliCod ;
         A494ForSer = W494ForSer ;
         A482ForColNom = W482ForColNom ;
         A483ForColNum = W483ForColNum ;
         A831TipColCod = W831TipColCod ;
         A1160ProForL = W1160ProForL ;
         A764ProForCod = W764ProForCod ;
         /* End Insert */
         A252CliCod = W252CliCod ;
         A494ForSer = W494ForSer ;
         A482ForColNom = W482ForColNom ;
         A483ForColNum = W483ForColNum ;
         A831TipColCod = W831TipColCod ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
      /* Using cursor P028Y11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), AV9ForSer, AV10ForColNom, Integer.valueOf(AV11ForColNum), Byte.valueOf(AV12TipColCod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A6268Mq_Prog3 = P028Y11_A6268Mq_Prog3[0] ;
         n6268Mq_Prog3 = P028Y11_n6268Mq_Prog3[0] ;
         A6267Mq_Prog2 = P028Y11_A6267Mq_Prog2[0] ;
         n6267Mq_Prog2 = P028Y11_n6267Mq_Prog2[0] ;
         A6186Mq_Prog = P028Y11_A6186Mq_Prog[0] ;
         n6186Mq_Prog = P028Y11_n6186Mq_Prog[0] ;
         A831TipColCod = P028Y11_A831TipColCod[0] ;
         A483ForColNum = P028Y11_A483ForColNum[0] ;
         A482ForColNom = P028Y11_A482ForColNom[0] ;
         A494ForSer = P028Y11_A494ForSer[0] ;
         A252CliCod = P028Y11_A252CliCod[0] ;
         A6037Mq_Grupo = P028Y11_A6037Mq_Grupo[0] ;
         W252CliCod = A252CliCod ;
         W494ForSer = A494ForSer ;
         W482ForColNom = A482ForColNom ;
         W483ForColNum = A483ForColNum ;
         W831TipColCod = A831TipColCod ;
         AV42Mq_Prog = A6186Mq_Prog ;
         AV43Mq_Prog2 = A6267Mq_Prog2 ;
         AV44Mq_Prog3 = A6268Mq_Prog3 ;
         /*
            INSERT RECORD ON TABLE TXPFORMQP

         */
         W252CliCod = A252CliCod ;
         W494ForSer = A494ForSer ;
         W482ForColNom = A482ForColNom ;
         W483ForColNum = A483ForColNum ;
         W831TipColCod = A831TipColCod ;
         W6186Mq_Prog = A6186Mq_Prog ;
         n6186Mq_Prog = false ;
         W6267Mq_Prog2 = A6267Mq_Prog2 ;
         n6267Mq_Prog2 = false ;
         W6268Mq_Prog3 = A6268Mq_Prog3 ;
         n6268Mq_Prog3 = false ;
         A252CliCod = AV35CliCodE ;
         A494ForSer = AV36ForSerE ;
         A482ForColNom = AV37ForColNomE ;
         A483ForColNum = AV38ForColNumE ;
         A831TipColCod = AV39TipColCodE ;
         A6186Mq_Prog = AV42Mq_Prog ;
         n6186Mq_Prog = false ;
         A6267Mq_Prog2 = AV43Mq_Prog2 ;
         n6267Mq_Prog2 = false ;
         A6268Mq_Prog3 = AV44Mq_Prog3 ;
         n6268Mq_Prog3 = false ;
         /* Using cursor P028Y12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Byte.valueOf(A6037Mq_Grupo), Boolean.valueOf(n6186Mq_Prog), Integer.valueOf(A6186Mq_Prog), Boolean.valueOf(n6267Mq_Prog2), Integer.valueOf(A6267Mq_Prog2), Boolean.valueOf(n6268Mq_Prog3), Integer.valueOf(A6268Mq_Prog3)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORMQP");
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
         A252CliCod = W252CliCod ;
         A494ForSer = W494ForSer ;
         A482ForColNom = W482ForColNom ;
         A483ForColNum = W483ForColNum ;
         A831TipColCod = W831TipColCod ;
         A6186Mq_Prog = W6186Mq_Prog ;
         n6186Mq_Prog = false ;
         A6267Mq_Prog2 = W6267Mq_Prog2 ;
         n6267Mq_Prog2 = false ;
         A6268Mq_Prog3 = W6268Mq_Prog3 ;
         n6268Mq_Prog3 = false ;
         /* End Insert */
         A252CliCod = W252CliCod ;
         A494ForSer = W494ForSer ;
         A482ForColNom = W482ForColNom ;
         A483ForColNum = W483ForColNum ;
         A831TipColCod = W831TipColCod ;
         pr_default.readNext(9);
      }
      pr_default.close(9);
      /* Using cursor P028Y13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), AV9ForSer, AV10ForColNom, Integer.valueOf(AV11ForColNum), Byte.valueOf(AV12TipColCod)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A3689ComForLin = P028Y13_A3689ComForLin[0] ;
         A831TipColCod = P028Y13_A831TipColCod[0] ;
         A483ForColNum = P028Y13_A483ForColNum[0] ;
         A482ForColNom = P028Y13_A482ForColNom[0] ;
         A494ForSer = P028Y13_A494ForSer[0] ;
         A252CliCod = P028Y13_A252CliCod[0] ;
         A3692ComForFec = P028Y13_A3692ComForFec[0] ;
         n3692ComForFec = P028Y13_n3692ComForFec[0] ;
         A3691ComForUsu = P028Y13_A3691ComForUsu[0] ;
         n3691ComForUsu = P028Y13_n3691ComForUsu[0] ;
         A3690ComForTxt = P028Y13_A3690ComForTxt[0] ;
         n3690ComForTxt = P028Y13_n3690ComForTxt[0] ;
         A3679TipComFor = P028Y13_A3679TipComFor[0] ;
         n3679TipComFor = P028Y13_n3679TipComFor[0] ;
         W252CliCod = A252CliCod ;
         W494ForSer = A494ForSer ;
         W482ForColNom = A482ForColNom ;
         W483ForColNum = A483ForColNum ;
         W831TipColCod = A831TipColCod ;
         AV47Comforlin = A3689ComForLin ;
         /*
            INSERT RECORD ON TABLE TXPFORCOM

         */
         W252CliCod = A252CliCod ;
         W494ForSer = A494ForSer ;
         W482ForColNom = A482ForColNom ;
         W483ForColNum = A483ForColNum ;
         W831TipColCod = A831TipColCod ;
         W3689ComForLin = A3689ComForLin ;
         W3679TipComFor = A3679TipComFor ;
         n3679TipComFor = false ;
         W3690ComForTxt = A3690ComForTxt ;
         n3690ComForTxt = false ;
         W3691ComForUsu = A3691ComForUsu ;
         n3691ComForUsu = false ;
         W3692ComForFec = A3692ComForFec ;
         n3692ComForFec = false ;
         A252CliCod = AV35CliCodE ;
         A494ForSer = AV36ForSerE ;
         A482ForColNom = AV37ForColNomE ;
         A483ForColNum = AV38ForColNumE ;
         A831TipColCod = AV39TipColCodE ;
         A3689ComForLin = AV47Comforlin ;
         n3679TipComFor = false ;
         n3690ComForTxt = false ;
         n3691ComForUsu = false ;
         n3692ComForFec = false ;
         /* Using cursor P028Y14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A3689ComForLin), Boolean.valueOf(n3679TipComFor), A3679TipComFor, Boolean.valueOf(n3690ComForTxt), A3690ComForTxt, Boolean.valueOf(n3691ComForUsu), A3691ComForUsu, Boolean.valueOf(n3692ComForFec), A3692ComForFec});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORCOM");
         if ( (pr_default.getStatus(12) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A252CliCod = W252CliCod ;
         A494ForSer = W494ForSer ;
         A482ForColNom = W482ForColNom ;
         A483ForColNum = W483ForColNum ;
         A831TipColCod = W831TipColCod ;
         A3689ComForLin = W3689ComForLin ;
         A3679TipComFor = W3679TipComFor ;
         n3679TipComFor = false ;
         A3690ComForTxt = W3690ComForTxt ;
         n3690ComForTxt = false ;
         A3691ComForUsu = W3691ComForUsu ;
         n3691ComForUsu = false ;
         A3692ComForFec = W3692ComForFec ;
         n3692ComForFec = false ;
         /* End Insert */
         A252CliCod = W252CliCod ;
         A494ForSer = W494ForSer ;
         A482ForColNom = W482ForColNom ;
         A483ForColNum = W483ForColNum ;
         A831TipColCod = W831TipColCod ;
         pr_default.readNext(11);
      }
      pr_default.close(11);
      if ( AV50Carvema == 1 )
      {
         /* Optimized DELETE. */
         /* Using cursor P028Y15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(AV35CliCodE), AV36ForSerE, AV37ForColNomE, Integer.valueOf(AV38ForColNumE), Byte.valueOf(AV39TipColCodE)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOBFOR");
         /* End optimized DELETE. */
         /* Using cursor P028Y16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), AV9ForSer, AV10ForColNom, Integer.valueOf(AV11ForColNum), Byte.valueOf(AV12TipColCod)});
         while ( (pr_default.getStatus(14) != 101) )
         {
            A649ObsForTxt = P028Y16_A649ObsForTxt[0] ;
            A650ObsLin = P028Y16_A650ObsLin[0] ;
            A831TipColCod = P028Y16_A831TipColCod[0] ;
            A483ForColNum = P028Y16_A483ForColNum[0] ;
            A482ForColNom = P028Y16_A482ForColNom[0] ;
            A494ForSer = P028Y16_A494ForSer[0] ;
            A252CliCod = P028Y16_A252CliCod[0] ;
            W252CliCod = A252CliCod ;
            W494ForSer = A494ForSer ;
            W482ForColNom = A482ForColNom ;
            W483ForColNum = A483ForColNum ;
            W831TipColCod = A831TipColCod ;
            AV45OBSLIN = A650ObsLin ;
            AV46OBSFORTXT = A649ObsForTxt ;
            /*
               INSERT RECORD ON TABLE TXPLOBFOR

            */
            W252CliCod = A252CliCod ;
            W494ForSer = A494ForSer ;
            W482ForColNom = A482ForColNom ;
            W483ForColNum = A483ForColNum ;
            W831TipColCod = A831TipColCod ;
            W650ObsLin = A650ObsLin ;
            W649ObsForTxt = A649ObsForTxt ;
            A252CliCod = AV35CliCodE ;
            A494ForSer = AV36ForSerE ;
            A482ForColNom = AV37ForColNomE ;
            A483ForColNum = AV38ForColNumE ;
            A831TipColCod = AV39TipColCodE ;
            A650ObsLin = AV45OBSLIN ;
            A649ObsForTxt = AV46OBSFORTXT ;
            /* Using cursor P028Y17 */
            pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A650ObsLin), A649ObsForTxt});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOBFOR");
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
            A252CliCod = W252CliCod ;
            A494ForSer = W494ForSer ;
            A482ForColNom = W482ForColNom ;
            A483ForColNum = W483ForColNum ;
            A831TipColCod = W831TipColCod ;
            A650ObsLin = W650ObsLin ;
            A649ObsForTxt = W649ObsForTxt ;
            /* End Insert */
            A252CliCod = W252CliCod ;
            A494ForSer = W494ForSer ;
            A482ForColNom = W482ForColNom ;
            A483ForColNum = W483ForColNum ;
            A831TipColCod = W831TipColCod ;
            pr_default.readNext(14);
         }
         pr_default.close(14);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmforeq.this.A396EmprCod;
      this.aP1[0] = pmforeq.this.AV8CliCod;
      this.aP2[0] = pmforeq.this.AV9ForSer;
      this.aP3[0] = pmforeq.this.AV10ForColNom;
      this.aP4[0] = pmforeq.this.AV11ForColNum;
      this.aP5[0] = pmforeq.this.AV12TipColCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pmforeq");
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
      P028Y2_A396EmprCod = new String[] {""} ;
      P028Y2_A831TipColCod = new byte[1] ;
      P028Y2_A483ForColNum = new int[1] ;
      P028Y2_A482ForColNom = new String[] {""} ;
      P028Y2_A494ForSer = new String[] {""} ;
      P028Y2_A252CliCod = new int[1] ;
      P028Y2_A486ForNumCol = new int[1] ;
      P028Y2_A5337ForCodExt = new String[] {""} ;
      P028Y2_n5337ForCodExt = new boolean[] {false} ;
      P028Y2_A1192ForNumCli = new int[1] ;
      P028Y2_n1192ForNumCli = new boolean[] {false} ;
      P028Y2_A1191ForNomCli = new String[] {""} ;
      P028Y2_n1191ForNomCli = new boolean[] {false} ;
      P028Y2_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P028Y2_n495ForUltMod = new boolean[] {false} ;
      P028Y2_A583IntCod = new byte[1] ;
      P028Y2_A5362IntCodF = new byte[1] ;
      P028Y2_n5362IntCodF = new boolean[] {false} ;
      P028Y2_A626MatCod = new short[1] ;
      P028Y2_A484ForCon = new byte[1] ;
      P028Y2_A1159ForUltLin = new short[1] ;
      P028Y2_n1159ForUltLin = new boolean[] {false} ;
      P028Y2_A2749ForPro = new String[] {""} ;
      P028Y2_n2749ForPro = new boolean[] {false} ;
      P028Y2_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028Y2_n2838ForRelBan = new boolean[] {false} ;
      P028Y2_A995ForTonal = new String[] {""} ;
      P028Y2_n995ForTonal = new boolean[] {false} ;
      P028Y2_A3315ForNumArc = new int[1] ;
      P028Y2_n3315ForNumArc = new boolean[] {false} ;
      P028Y2_A3316CodSol = new short[1] ;
      P028Y2_n3316CodSol = new boolean[] {false} ;
      P028Y2_A3588ForEst = new String[] {""} ;
      P028Y2_n3588ForEst = new boolean[] {false} ;
      P028Y2_A1514MacProCod = new String[] {""} ;
      P028Y2_n1514MacProCod = new boolean[] {false} ;
      P028Y2_A4339ForRGB = new long[1] ;
      P028Y2_n4339ForRGB = new boolean[] {false} ;
      P028Y2_A5624ForUsrCod = new String[] {""} ;
      P028Y2_n5624ForUsrCod = new boolean[] {false} ;
      P028Y2_A5625ForFecHor = new java.util.Date[] {GXutil.nullDate()} ;
      P028Y2_n5625ForFecHor = new boolean[] {false} ;
      P028Y2_A3560ForOpcCli = new String[] {""} ;
      P028Y2_n3560ForOpcCli = new boolean[] {false} ;
      P028Y2_A3558ForFecApr = new java.util.Date[] {GXutil.nullDate()} ;
      P028Y2_n3558ForFecApr = new boolean[] {false} ;
      P028Y2_A8561Fam_Cod = new short[1] ;
      P028Y2_n8561Fam_Cod = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A5337ForCodExt = "" ;
      A1191ForNomCli = "" ;
      A495ForUltMod = GXutil.nullDate() ;
      A2749ForPro = "" ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      A995ForTonal = "" ;
      A3588ForEst = "" ;
      A1514MacProCod = "" ;
      A5624ForUsrCod = "" ;
      A5625ForFecHor = GXutil.resetTime( GXutil.nullDate() );
      A3560ForOpcCli = "" ;
      A3558ForFecApr = GXutil.nullDate() ;
      AV14ForCodExt = "" ;
      AV16ForNomCli = "" ;
      AV18ForUltMod = GXutil.nullDate() ;
      AV24ForPro = "" ;
      AV25ForRelBan = DecimalUtil.ZERO ;
      AV26ForTonal = "" ;
      AV31ForEst = "" ;
      AV29MacProCod = "" ;
      AV33ForUsrCod = "" ;
      AV34ForFecHor = GXutil.resetTime( GXutil.nullDate() );
      AV48ForOpcCli = "" ;
      AV49ForFecApr = GXutil.nullDate() ;
      P028Y3_A396EmprCod = new String[] {""} ;
      P028Y3_A486ForNumCol = new int[1] ;
      P028Y3_A252CliCod = new int[1] ;
      P028Y3_A494ForSer = new String[] {""} ;
      P028Y3_A482ForColNom = new String[] {""} ;
      P028Y3_A483ForColNum = new int[1] ;
      P028Y3_A831TipColCod = new byte[1] ;
      AV36ForSerE = "" ;
      AV37ForColNomE = "" ;
      P028Y4_A396EmprCod = new String[] {""} ;
      P028Y4_A486ForNumCol = new int[1] ;
      P028Y4_A252CliCod = new int[1] ;
      P028Y4_A494ForSer = new String[] {""} ;
      P028Y4_A482ForColNom = new String[] {""} ;
      P028Y4_A483ForColNum = new int[1] ;
      P028Y4_A831TipColCod = new byte[1] ;
      P028Y4_A5337ForCodExt = new String[] {""} ;
      P028Y4_n5337ForCodExt = new boolean[] {false} ;
      P028Y4_A1192ForNumCli = new int[1] ;
      P028Y4_n1192ForNumCli = new boolean[] {false} ;
      P028Y4_A1191ForNomCli = new String[] {""} ;
      P028Y4_n1191ForNomCli = new boolean[] {false} ;
      P028Y4_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P028Y4_n495ForUltMod = new boolean[] {false} ;
      P028Y4_A583IntCod = new byte[1] ;
      P028Y4_A5362IntCodF = new byte[1] ;
      P028Y4_n5362IntCodF = new boolean[] {false} ;
      P028Y4_A626MatCod = new short[1] ;
      P028Y4_A484ForCon = new byte[1] ;
      P028Y4_A1159ForUltLin = new short[1] ;
      P028Y4_n1159ForUltLin = new boolean[] {false} ;
      P028Y4_A2749ForPro = new String[] {""} ;
      P028Y4_n2749ForPro = new boolean[] {false} ;
      P028Y4_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028Y4_n2838ForRelBan = new boolean[] {false} ;
      P028Y4_A995ForTonal = new String[] {""} ;
      P028Y4_n995ForTonal = new boolean[] {false} ;
      P028Y4_A3315ForNumArc = new int[1] ;
      P028Y4_n3315ForNumArc = new boolean[] {false} ;
      P028Y4_A3316CodSol = new short[1] ;
      P028Y4_n3316CodSol = new boolean[] {false} ;
      P028Y4_A3588ForEst = new String[] {""} ;
      P028Y4_n3588ForEst = new boolean[] {false} ;
      P028Y4_A1514MacProCod = new String[] {""} ;
      P028Y4_n1514MacProCod = new boolean[] {false} ;
      P028Y4_A4339ForRGB = new long[1] ;
      P028Y4_n4339ForRGB = new boolean[] {false} ;
      P028Y4_A5624ForUsrCod = new String[] {""} ;
      P028Y4_n5624ForUsrCod = new boolean[] {false} ;
      P028Y4_A5625ForFecHor = new java.util.Date[] {GXutil.nullDate()} ;
      P028Y4_n5625ForFecHor = new boolean[] {false} ;
      P028Y4_A3560ForOpcCli = new String[] {""} ;
      P028Y4_n3560ForOpcCli = new boolean[] {false} ;
      P028Y4_A8561Fam_Cod = new short[1] ;
      P028Y4_n8561Fam_Cod = new boolean[] {false} ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_int2 = new byte[1] ;
      GXv_date7 = new java.util.Date[1] ;
      P028Y9_A396EmprCod = new String[] {""} ;
      P028Y9_A764ProForCod = new String[] {""} ;
      P028Y9_A1160ProForL = new short[1] ;
      P028Y9_A831TipColCod = new byte[1] ;
      P028Y9_A483ForColNum = new int[1] ;
      P028Y9_A482ForColNom = new String[] {""} ;
      P028Y9_A494ForSer = new String[] {""} ;
      P028Y9_A252CliCod = new int[1] ;
      P028Y9_A14198ProforFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028Y9_A10542ProForH2O = new short[1] ;
      P028Y9_A9707ProForMq = new String[] {""} ;
      P028Y9_A9704ProForVol = new int[1] ;
      P028Y9_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028Y9_A7802ProFoNPrg = new int[1] ;
      P028Y9_A6549ProForFR = new String[] {""} ;
      A764ProForCod = "" ;
      A14198ProforFabs = DecimalUtil.ZERO ;
      A9707ProForMq = "" ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      A6549ProForFR = "" ;
      W494ForSer = "" ;
      W482ForColNom = "" ;
      AV41ProForCod = "" ;
      W764ProForCod = "" ;
      Gx_emsg = "" ;
      P028Y11_A396EmprCod = new String[] {""} ;
      P028Y11_A6268Mq_Prog3 = new int[1] ;
      P028Y11_n6268Mq_Prog3 = new boolean[] {false} ;
      P028Y11_A6267Mq_Prog2 = new int[1] ;
      P028Y11_n6267Mq_Prog2 = new boolean[] {false} ;
      P028Y11_A6186Mq_Prog = new int[1] ;
      P028Y11_n6186Mq_Prog = new boolean[] {false} ;
      P028Y11_A831TipColCod = new byte[1] ;
      P028Y11_A483ForColNum = new int[1] ;
      P028Y11_A482ForColNom = new String[] {""} ;
      P028Y11_A494ForSer = new String[] {""} ;
      P028Y11_A252CliCod = new int[1] ;
      P028Y11_A6037Mq_Grupo = new byte[1] ;
      P028Y13_A396EmprCod = new String[] {""} ;
      P028Y13_A3689ComForLin = new short[1] ;
      P028Y13_A831TipColCod = new byte[1] ;
      P028Y13_A483ForColNum = new int[1] ;
      P028Y13_A482ForColNom = new String[] {""} ;
      P028Y13_A494ForSer = new String[] {""} ;
      P028Y13_A252CliCod = new int[1] ;
      P028Y13_A3692ComForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P028Y13_n3692ComForFec = new boolean[] {false} ;
      P028Y13_A3691ComForUsu = new String[] {""} ;
      P028Y13_n3691ComForUsu = new boolean[] {false} ;
      P028Y13_A3690ComForTxt = new String[] {""} ;
      P028Y13_n3690ComForTxt = new boolean[] {false} ;
      P028Y13_A3679TipComFor = new String[] {""} ;
      P028Y13_n3679TipComFor = new boolean[] {false} ;
      A3692ComForFec = GXutil.nullDate() ;
      A3691ComForUsu = "" ;
      A3690ComForTxt = "" ;
      A3679TipComFor = "" ;
      W3679TipComFor = "" ;
      W3690ComForTxt = "" ;
      W3691ComForUsu = "" ;
      W3692ComForFec = GXutil.nullDate() ;
      P028Y16_A396EmprCod = new String[] {""} ;
      P028Y16_A649ObsForTxt = new String[] {""} ;
      P028Y16_A650ObsLin = new short[1] ;
      P028Y16_A831TipColCod = new byte[1] ;
      P028Y16_A483ForColNum = new int[1] ;
      P028Y16_A482ForColNom = new String[] {""} ;
      P028Y16_A494ForSer = new String[] {""} ;
      P028Y16_A252CliCod = new int[1] ;
      A649ObsForTxt = "" ;
      AV46OBSFORTXT = "" ;
      W649ObsForTxt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pmforeq__default(),
         new Object[] {
             new Object[] {
            P028Y2_A396EmprCod, P028Y2_A831TipColCod, P028Y2_A483ForColNum, P028Y2_A482ForColNom, P028Y2_A494ForSer, P028Y2_A252CliCod, P028Y2_A486ForNumCol, P028Y2_A5337ForCodExt, P028Y2_n5337ForCodExt, P028Y2_A1192ForNumCli,
            P028Y2_n1192ForNumCli, P028Y2_A1191ForNomCli, P028Y2_n1191ForNomCli, P028Y2_A495ForUltMod, P028Y2_n495ForUltMod, P028Y2_A583IntCod, P028Y2_A5362IntCodF, P028Y2_n5362IntCodF, P028Y2_A626MatCod, P028Y2_A484ForCon,
            P028Y2_A1159ForUltLin, P028Y2_n1159ForUltLin, P028Y2_A2749ForPro, P028Y2_n2749ForPro, P028Y2_A2838ForRelBan, P028Y2_n2838ForRelBan, P028Y2_A995ForTonal, P028Y2_n995ForTonal, P028Y2_A3315ForNumArc, P028Y2_n3315ForNumArc,
            P028Y2_A3316CodSol, P028Y2_n3316CodSol, P028Y2_A3588ForEst, P028Y2_n3588ForEst, P028Y2_A1514MacProCod, P028Y2_n1514MacProCod, P028Y2_A4339ForRGB, P028Y2_n4339ForRGB, P028Y2_A5624ForUsrCod, P028Y2_n5624ForUsrCod,
            P028Y2_A5625ForFecHor, P028Y2_n5625ForFecHor, P028Y2_A3560ForOpcCli, P028Y2_n3560ForOpcCli, P028Y2_A3558ForFecApr, P028Y2_n3558ForFecApr, P028Y2_A8561Fam_Cod, P028Y2_n8561Fam_Cod
            }
            , new Object[] {
            P028Y3_A396EmprCod, P028Y3_A486ForNumCol, P028Y3_A252CliCod, P028Y3_A494ForSer, P028Y3_A482ForColNom, P028Y3_A483ForColNum, P028Y3_A831TipColCod
            }
            , new Object[] {
            P028Y4_A396EmprCod, P028Y4_A486ForNumCol, P028Y4_A252CliCod, P028Y4_A494ForSer, P028Y4_A482ForColNom, P028Y4_A483ForColNum, P028Y4_A831TipColCod, P028Y4_A5337ForCodExt, P028Y4_n5337ForCodExt, P028Y4_A1192ForNumCli,
            P028Y4_n1192ForNumCli, P028Y4_A1191ForNomCli, P028Y4_n1191ForNomCli, P028Y4_A495ForUltMod, P028Y4_n495ForUltMod, P028Y4_A583IntCod, P028Y4_A5362IntCodF, P028Y4_n5362IntCodF, P028Y4_A626MatCod, P028Y4_A484ForCon,
            P028Y4_A1159ForUltLin, P028Y4_n1159ForUltLin, P028Y4_A2749ForPro, P028Y4_n2749ForPro, P028Y4_A2838ForRelBan, P028Y4_n2838ForRelBan, P028Y4_A995ForTonal, P028Y4_n995ForTonal, P028Y4_A3315ForNumArc, P028Y4_n3315ForNumArc,
            P028Y4_A3316CodSol, P028Y4_n3316CodSol, P028Y4_A3588ForEst, P028Y4_n3588ForEst, P028Y4_A1514MacProCod, P028Y4_n1514MacProCod, P028Y4_A4339ForRGB, P028Y4_n4339ForRGB, P028Y4_A5624ForUsrCod, P028Y4_n5624ForUsrCod,
            P028Y4_A5625ForFecHor, P028Y4_n5625ForFecHor, P028Y4_A3560ForOpcCli, P028Y4_n3560ForOpcCli, P028Y4_A8561Fam_Cod, P028Y4_n8561Fam_Cod
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
            P028Y9_A396EmprCod, P028Y9_A764ProForCod, P028Y9_A1160ProForL, P028Y9_A831TipColCod, P028Y9_A483ForColNum, P028Y9_A482ForColNom, P028Y9_A494ForSer, P028Y9_A252CliCod, P028Y9_A14198ProforFabs, P028Y9_A10542ProForH2O,
            P028Y9_A9707ProForMq, P028Y9_A9704ProForVol, P028Y9_A8656ProForrbn, P028Y9_A7802ProFoNPrg, P028Y9_A6549ProForFR
            }
            , new Object[] {
            }
            , new Object[] {
            P028Y11_A396EmprCod, P028Y11_A6268Mq_Prog3, P028Y11_n6268Mq_Prog3, P028Y11_A6267Mq_Prog2, P028Y11_n6267Mq_Prog2, P028Y11_A6186Mq_Prog, P028Y11_n6186Mq_Prog, P028Y11_A831TipColCod, P028Y11_A483ForColNum, P028Y11_A482ForColNom,
            P028Y11_A494ForSer, P028Y11_A252CliCod, P028Y11_A6037Mq_Grupo
            }
            , new Object[] {
            }
            , new Object[] {
            P028Y13_A396EmprCod, P028Y13_A3689ComForLin, P028Y13_A831TipColCod, P028Y13_A483ForColNum, P028Y13_A482ForColNom, P028Y13_A494ForSer, P028Y13_A252CliCod, P028Y13_A3692ComForFec, P028Y13_n3692ComForFec, P028Y13_A3691ComForUsu,
            P028Y13_n3691ComForUsu, P028Y13_A3690ComForTxt, P028Y13_n3690ComForTxt, P028Y13_A3679TipComFor, P028Y13_n3679TipComFor
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P028Y16_A396EmprCod, P028Y16_A649ObsForTxt, P028Y16_A650ObsLin, P028Y16_A831TipColCod, P028Y16_A483ForColNum, P028Y16_A482ForColNom, P028Y16_A494ForSer, P028Y16_A252CliCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12TipColCod ;
   private byte AV50Carvema ;
   private byte AV52dorado ;
   private byte GXt_int1 ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte A5362IntCodF ;
   private byte A484ForCon ;
   private byte AV19IntCod ;
   private byte AV32IntCodF ;
   private byte AV22ForCon ;
   private byte AV39TipColCodE ;
   private byte GXv_int2[] ;
   private byte W831TipColCod ;
   private byte A6037Mq_Grupo ;
   private short A626MatCod ;
   private short A1159ForUltLin ;
   private short A3316CodSol ;
   private short A8561Fam_Cod ;
   private short AV21MatCod ;
   private short AV23ForUltLin ;
   private short AV28CodSol ;
   private short AV51Fam_cod ;
   private short GXv_int6[] ;
   private short A1160ProForL ;
   private short A10542ProForH2O ;
   private short AV40ProForL ;
   private short W1160ProForL ;
   private short Gx_err ;
   private short A3689ComForLin ;
   private short AV47Comforlin ;
   private short W3689ComForLin ;
   private short A650ObsLin ;
   private short AV45OBSLIN ;
   private short W650ObsLin ;
   private int AV8CliCod ;
   private int AV11ForColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A486ForNumCol ;
   private int A1192ForNumCli ;
   private int A3315ForNumArc ;
   private int AV13ForNumCol ;
   private int AV15ForNumCli ;
   private int AV27ForNumArc ;
   private int AV35CliCodE ;
   private int AV38ForColNumE ;
   private int GXv_int4[] ;
   private int A9704ProForVol ;
   private int A7802ProFoNPrg ;
   private int W252CliCod ;
   private int W483ForColNum ;
   private int GX_INS154 ;
   private int A6268Mq_Prog3 ;
   private int A6267Mq_Prog2 ;
   private int A6186Mq_Prog ;
   private int AV42Mq_Prog ;
   private int AV43Mq_Prog2 ;
   private int AV44Mq_Prog3 ;
   private int GX_INS1550 ;
   private int W6186Mq_Prog ;
   private int W6267Mq_Prog2 ;
   private int W6268Mq_Prog3 ;
   private int GX_INS518 ;
   private int GX_INS74 ;
   private long A4339ForRGB ;
   private long AV30ForRGB ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal AV25ForRelBan ;
   private java.math.BigDecimal A14198ProforFabs ;
   private java.math.BigDecimal A8656ProForrbn ;
   private String A396EmprCod ;
   private String AV9ForSer ;
   private String AV10ForColNom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A5337ForCodExt ;
   private String A1191ForNomCli ;
   private String A2749ForPro ;
   private String A995ForTonal ;
   private String A3588ForEst ;
   private String A1514MacProCod ;
   private String A5624ForUsrCod ;
   private String A3560ForOpcCli ;
   private String AV14ForCodExt ;
   private String AV16ForNomCli ;
   private String AV24ForPro ;
   private String AV26ForTonal ;
   private String AV31ForEst ;
   private String AV29MacProCod ;
   private String AV33ForUsrCod ;
   private String AV48ForOpcCli ;
   private String AV36ForSerE ;
   private String AV37ForColNomE ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String A764ProForCod ;
   private String A9707ProForMq ;
   private String A6549ProForFR ;
   private String W494ForSer ;
   private String W482ForColNom ;
   private String AV41ProForCod ;
   private String W764ProForCod ;
   private String Gx_emsg ;
   private String A3691ComForUsu ;
   private String A3690ComForTxt ;
   private String A3679TipComFor ;
   private String W3679TipComFor ;
   private String W3690ComForTxt ;
   private String W3691ComForUsu ;
   private String A649ObsForTxt ;
   private String AV46OBSFORTXT ;
   private String W649ObsForTxt ;
   private java.util.Date A5625ForFecHor ;
   private java.util.Date AV34ForFecHor ;
   private java.util.Date A495ForUltMod ;
   private java.util.Date A3558ForFecApr ;
   private java.util.Date AV18ForUltMod ;
   private java.util.Date AV49ForFecApr ;
   private java.util.Date GXv_date7[] ;
   private java.util.Date A3692ComForFec ;
   private java.util.Date W3692ComForFec ;
   private boolean n5337ForCodExt ;
   private boolean n1192ForNumCli ;
   private boolean n1191ForNomCli ;
   private boolean n495ForUltMod ;
   private boolean n5362IntCodF ;
   private boolean n1159ForUltLin ;
   private boolean n2749ForPro ;
   private boolean n2838ForRelBan ;
   private boolean n995ForTonal ;
   private boolean n3315ForNumArc ;
   private boolean n3316CodSol ;
   private boolean n3588ForEst ;
   private boolean n1514MacProCod ;
   private boolean n4339ForRGB ;
   private boolean n5624ForUsrCod ;
   private boolean n5625ForFecHor ;
   private boolean n3560ForOpcCli ;
   private boolean n3558ForFecApr ;
   private boolean n8561Fam_Cod ;
   private boolean returnInSub ;
   private boolean n6268Mq_Prog3 ;
   private boolean n6267Mq_Prog2 ;
   private boolean n6186Mq_Prog ;
   private boolean n3692ComForFec ;
   private boolean n3691ComForUsu ;
   private boolean n3690ComForTxt ;
   private boolean n3679TipComFor ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P028Y2_A396EmprCod ;
   private byte[] P028Y2_A831TipColCod ;
   private int[] P028Y2_A483ForColNum ;
   private String[] P028Y2_A482ForColNom ;
   private String[] P028Y2_A494ForSer ;
   private int[] P028Y2_A252CliCod ;
   private int[] P028Y2_A486ForNumCol ;
   private String[] P028Y2_A5337ForCodExt ;
   private boolean[] P028Y2_n5337ForCodExt ;
   private int[] P028Y2_A1192ForNumCli ;
   private boolean[] P028Y2_n1192ForNumCli ;
   private String[] P028Y2_A1191ForNomCli ;
   private boolean[] P028Y2_n1191ForNomCli ;
   private java.util.Date[] P028Y2_A495ForUltMod ;
   private boolean[] P028Y2_n495ForUltMod ;
   private byte[] P028Y2_A583IntCod ;
   private byte[] P028Y2_A5362IntCodF ;
   private boolean[] P028Y2_n5362IntCodF ;
   private short[] P028Y2_A626MatCod ;
   private byte[] P028Y2_A484ForCon ;
   private short[] P028Y2_A1159ForUltLin ;
   private boolean[] P028Y2_n1159ForUltLin ;
   private String[] P028Y2_A2749ForPro ;
   private boolean[] P028Y2_n2749ForPro ;
   private java.math.BigDecimal[] P028Y2_A2838ForRelBan ;
   private boolean[] P028Y2_n2838ForRelBan ;
   private String[] P028Y2_A995ForTonal ;
   private boolean[] P028Y2_n995ForTonal ;
   private int[] P028Y2_A3315ForNumArc ;
   private boolean[] P028Y2_n3315ForNumArc ;
   private short[] P028Y2_A3316CodSol ;
   private boolean[] P028Y2_n3316CodSol ;
   private String[] P028Y2_A3588ForEst ;
   private boolean[] P028Y2_n3588ForEst ;
   private String[] P028Y2_A1514MacProCod ;
   private boolean[] P028Y2_n1514MacProCod ;
   private long[] P028Y2_A4339ForRGB ;
   private boolean[] P028Y2_n4339ForRGB ;
   private String[] P028Y2_A5624ForUsrCod ;
   private boolean[] P028Y2_n5624ForUsrCod ;
   private java.util.Date[] P028Y2_A5625ForFecHor ;
   private boolean[] P028Y2_n5625ForFecHor ;
   private String[] P028Y2_A3560ForOpcCli ;
   private boolean[] P028Y2_n3560ForOpcCli ;
   private java.util.Date[] P028Y2_A3558ForFecApr ;
   private boolean[] P028Y2_n3558ForFecApr ;
   private short[] P028Y2_A8561Fam_Cod ;
   private boolean[] P028Y2_n8561Fam_Cod ;
   private String[] P028Y3_A396EmprCod ;
   private int[] P028Y3_A486ForNumCol ;
   private int[] P028Y3_A252CliCod ;
   private String[] P028Y3_A494ForSer ;
   private String[] P028Y3_A482ForColNom ;
   private int[] P028Y3_A483ForColNum ;
   private byte[] P028Y3_A831TipColCod ;
   private String[] P028Y4_A396EmprCod ;
   private int[] P028Y4_A486ForNumCol ;
   private int[] P028Y4_A252CliCod ;
   private String[] P028Y4_A494ForSer ;
   private String[] P028Y4_A482ForColNom ;
   private int[] P028Y4_A483ForColNum ;
   private byte[] P028Y4_A831TipColCod ;
   private String[] P028Y4_A5337ForCodExt ;
   private boolean[] P028Y4_n5337ForCodExt ;
   private int[] P028Y4_A1192ForNumCli ;
   private boolean[] P028Y4_n1192ForNumCli ;
   private String[] P028Y4_A1191ForNomCli ;
   private boolean[] P028Y4_n1191ForNomCli ;
   private java.util.Date[] P028Y4_A495ForUltMod ;
   private boolean[] P028Y4_n495ForUltMod ;
   private byte[] P028Y4_A583IntCod ;
   private byte[] P028Y4_A5362IntCodF ;
   private boolean[] P028Y4_n5362IntCodF ;
   private short[] P028Y4_A626MatCod ;
   private byte[] P028Y4_A484ForCon ;
   private short[] P028Y4_A1159ForUltLin ;
   private boolean[] P028Y4_n1159ForUltLin ;
   private String[] P028Y4_A2749ForPro ;
   private boolean[] P028Y4_n2749ForPro ;
   private java.math.BigDecimal[] P028Y4_A2838ForRelBan ;
   private boolean[] P028Y4_n2838ForRelBan ;
   private String[] P028Y4_A995ForTonal ;
   private boolean[] P028Y4_n995ForTonal ;
   private int[] P028Y4_A3315ForNumArc ;
   private boolean[] P028Y4_n3315ForNumArc ;
   private short[] P028Y4_A3316CodSol ;
   private boolean[] P028Y4_n3316CodSol ;
   private String[] P028Y4_A3588ForEst ;
   private boolean[] P028Y4_n3588ForEst ;
   private String[] P028Y4_A1514MacProCod ;
   private boolean[] P028Y4_n1514MacProCod ;
   private long[] P028Y4_A4339ForRGB ;
   private boolean[] P028Y4_n4339ForRGB ;
   private String[] P028Y4_A5624ForUsrCod ;
   private boolean[] P028Y4_n5624ForUsrCod ;
   private java.util.Date[] P028Y4_A5625ForFecHor ;
   private boolean[] P028Y4_n5625ForFecHor ;
   private String[] P028Y4_A3560ForOpcCli ;
   private boolean[] P028Y4_n3560ForOpcCli ;
   private short[] P028Y4_A8561Fam_Cod ;
   private boolean[] P028Y4_n8561Fam_Cod ;
   private String[] P028Y9_A396EmprCod ;
   private String[] P028Y9_A764ProForCod ;
   private short[] P028Y9_A1160ProForL ;
   private byte[] P028Y9_A831TipColCod ;
   private int[] P028Y9_A483ForColNum ;
   private String[] P028Y9_A482ForColNom ;
   private String[] P028Y9_A494ForSer ;
   private int[] P028Y9_A252CliCod ;
   private java.math.BigDecimal[] P028Y9_A14198ProforFabs ;
   private short[] P028Y9_A10542ProForH2O ;
   private String[] P028Y9_A9707ProForMq ;
   private int[] P028Y9_A9704ProForVol ;
   private java.math.BigDecimal[] P028Y9_A8656ProForrbn ;
   private int[] P028Y9_A7802ProFoNPrg ;
   private String[] P028Y9_A6549ProForFR ;
   private String[] P028Y11_A396EmprCod ;
   private int[] P028Y11_A6268Mq_Prog3 ;
   private boolean[] P028Y11_n6268Mq_Prog3 ;
   private int[] P028Y11_A6267Mq_Prog2 ;
   private boolean[] P028Y11_n6267Mq_Prog2 ;
   private int[] P028Y11_A6186Mq_Prog ;
   private boolean[] P028Y11_n6186Mq_Prog ;
   private byte[] P028Y11_A831TipColCod ;
   private int[] P028Y11_A483ForColNum ;
   private String[] P028Y11_A482ForColNom ;
   private String[] P028Y11_A494ForSer ;
   private int[] P028Y11_A252CliCod ;
   private byte[] P028Y11_A6037Mq_Grupo ;
   private String[] P028Y13_A396EmprCod ;
   private short[] P028Y13_A3689ComForLin ;
   private byte[] P028Y13_A831TipColCod ;
   private int[] P028Y13_A483ForColNum ;
   private String[] P028Y13_A482ForColNom ;
   private String[] P028Y13_A494ForSer ;
   private int[] P028Y13_A252CliCod ;
   private java.util.Date[] P028Y13_A3692ComForFec ;
   private boolean[] P028Y13_n3692ComForFec ;
   private String[] P028Y13_A3691ComForUsu ;
   private boolean[] P028Y13_n3691ComForUsu ;
   private String[] P028Y13_A3690ComForTxt ;
   private boolean[] P028Y13_n3690ComForTxt ;
   private String[] P028Y13_A3679TipComFor ;
   private boolean[] P028Y13_n3679TipComFor ;
   private String[] P028Y16_A396EmprCod ;
   private String[] P028Y16_A649ObsForTxt ;
   private short[] P028Y16_A650ObsLin ;
   private byte[] P028Y16_A831TipColCod ;
   private int[] P028Y16_A483ForColNum ;
   private String[] P028Y16_A482ForColNom ;
   private String[] P028Y16_A494ForSer ;
   private int[] P028Y16_A252CliCod ;
}

final  class pmforeq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P028Y2", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumCol, ForCodExt, ForNumCli, ForNomCli, ForUltMod, IntCod, IntCodF, MatCod, ForCon, ForUltLin, ForPro, ForRelBan, ForTonal, ForNumArc, CodSol, ForEst, MacProCod, ForRGB, ForUsrCod, ForFecHor, ForOpcCli, ForFecApr, Fam_Cod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P028Y3", "SELECT EmprCod, ForNumCol, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P028Y4", "SELECT EmprCod, ForNumCol, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForCodExt, ForNumCli, ForNomCli, ForUltMod, IntCod, IntCodF, MatCod, ForCon, ForUltLin, ForPro, ForRelBan, ForTonal, ForNumArc, CodSol, ForEst, MacProCod, ForRGB, ForUsrCod, ForFecHor, ForOpcCli, Fam_Cod FROM TXPCFORMU WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P028Y5", "UPDATE TXPCFORMU SET ForCodExt=?, ForNumCli=?, ForNomCli=?, ForUltMod=?, IntCod=?, IntCodF=?, MatCod=?, ForCon=?, ForUltLin=?, ForPro=?, ForRelBan=?, ForTonal=?, ForNumArc=?, CodSol=?, ForEst=?, MacProCod=?, ForRGB=?, ForUsrCod=?, ForFecHor=?, ForOpcCli=?, Fam_Cod=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
         ,new UpdateCursor("P028Y6", "DELETE FROM TXPLFORMU  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
         ,new UpdateCursor("P028Y7", "DELETE FROM TXPFORMQP  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFORMQP")
         ,new UpdateCursor("P028Y8", "DELETE FROM TXPFORCOM  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFORCOM")
         ,new ForEachCursor("P028Y9", "SELECT EmprCod, ProForCod, ProForL, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ProforFabs, ProForH2O, ProForMq, ProForVol, ProForrbn, ProFoNPrg, ProForFR FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P028Y10", "INSERT INTO TXPLFORMU(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL, ProForCod, ProForFR, ProFoNPrg, ProForrbn, ProForVol, ProForMq, ProForH2O, ProforFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
         ,new ForEachCursor("P028Y11", "SELECT EmprCod, Mq_Prog3, Mq_Prog2, Mq_Prog, TipColCod, ForColNum, ForColNom, ForSer, CliCod, Mq_Grupo FROM TXPFORMQP WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Mq_Grupo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P028Y12", "INSERT INTO TXPFORMQP(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Mq_Grupo, Mq_Prog, Mq_Prog2, Mq_Prog3) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFORMQP")
         ,new ForEachCursor("P028Y13", "SELECT EmprCod, ComForLin, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ComForFec, ComForUsu, ComForTxt, TipComFor FROM TXPFORCOM WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ComForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P028Y14", "INSERT INTO TXPFORCOM(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ComForLin, TipComFor, ComForTxt, ComForUsu, ComForFec) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFORCOM")
         ,new UpdateCursor("P028Y15", "DELETE FROM TXPLOBFOR  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLOBFOR")
         ,new ForEachCursor("P028Y16", "SELECT EmprCod, ObsForTxt, ObsLin, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P028Y17", "INSERT INTO TXPLOBFOR(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin, ObsForTxt) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLOBFOR")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(12);
               ((byte[]) buf[16])[0] = rslt.getByte(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((byte[]) buf[19])[0] = rslt.getByte(15);
               ((short[]) buf[20])[0] = rslt.getShort(16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(20);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(21);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(23, 6);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((long[]) buf[36])[0] = rslt.getLong(24);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDateTime(26);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDate(28);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((short[]) buf[46])[0] = rslt.getShort(29);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(12);
               ((byte[]) buf[16])[0] = rslt.getByte(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((byte[]) buf[19])[0] = rslt.getByte(15);
               ((short[]) buf[20])[0] = rslt.getShort(16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(20);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(21);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(23, 6);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((long[]) buf[36])[0] = rslt.getLong(24);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDateTime(26);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(28);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 60);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 15);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 13);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               stmt.setByte(5, ((Number) parms[8]).byteValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[20], 20);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[22]).intValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[28], 6);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(17, ((Number) parms[30]).longValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[32], 8);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(19, (java.util.Date)parms[34], false);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[36], 1);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[38]).shortValue());
               }
               stmt.setString(22, (String)parms[39], 3);
               stmt.setInt(23, ((Number) parms[40]).intValue());
               stmt.setString(24, (String)parms[41], 16);
               stmt.setString(25, (String)parms[42], 13);
               stmt.setInt(26, ((Number) parms[43]).intValue());
               stmt.setByte(27, ((Number) parms[44]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 6);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 2);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[12]).intValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 15);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[10], 60);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[12], 8);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[14]);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 30);
               return;
      }
   }

}

