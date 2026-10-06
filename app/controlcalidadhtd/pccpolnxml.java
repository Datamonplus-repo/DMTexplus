package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccpolnxml extends GXProcedure
{
   public pccpolnxml( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccpolnxml.class ), "" );
   }

   public pccpolnxml( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] AV48Tab_orden )
   {
      pccpolnxml.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, AV48Tab_orden, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] AV48Tab_orden ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, AV48Tab_orden, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] AV48Tab_orden ,
                             String[] aP6 )
   {
      pccpolnxml.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pccpolnxml.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pccpolnxml.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pccpolnxml.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pccpolnxml.this.AV18CCTarc = aP4[0];
      this.aP4 = aP4;
      pccpolnxml.this.AV48Tab_orden = AV48Tab_orden;
      pccpolnxml.this.Gx_mode = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV70nOrd = (byte)(0) ;
      AV27I = 1 ;
      while ( AV27I <= 100 )
      {
         AV14BarOrdLin = AV48Tab_orden[(int)(AV27I)-1] ;
         if ( ! (0==AV14BarOrdLin) || ( AV14BarOrdLin > 0 ) )
         {
            AV70nOrd = (byte)(AV70nOrd+1) ;
            if (true) break;
         }
         AV27I = (long)(AV27I+1) ;
      }
      if ( ! (GXutil.strcmp("", AV18CCTarc)==0) )
      {
         AV32Nombre = "" ;
         GXt_char1 = AV32Nombre ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "CCTDIR", "") ;
         GXv_char4[0] = GXt_char1 ;
         new app.pexidsc2(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
         pccpolnxml.this.A396EmprCod = GXv_char2[0] ;
         pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
         AV32Nombre = GXt_char1 ;
         AV32Nombre = GXutil.trim( AV32Nombre) ;
         AV54vCharUlt = GXutil.substring( AV32Nombre, GXutil.len( AV32Nombre), 1) ;
         AV75PathModelos = GXutil.substring( AV32Nombre, 1, AV76vPosDir-1) ;
         AV71vDirDest = "" ;
         /* Using cursor P0ARI2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A313ContCod = P0ARI2_A313ContCod[0] ;
            A7208ContDsc2 = P0ARI2_A7208ContDsc2[0] ;
            A14173ContATCod = P0ARI2_A14173ContATCod[0] ;
            n14173ContATCod = P0ARI2_n14173ContATCod[0] ;
            if ( GXutil.strcmp(A313ContCod, httpContext.getMessage( "CCTDIR", "")) == 0 )
            {
               AV71vDirDest = A14173ContATCod ;
               if ( GXutil.strcmp(GXutil.substring( AV71vDirDest, 1, 1), "\\") != 0 )
               {
                  AV71vDirDest = "\\" + GXutil.trim( AV71vDirDest) ;
                  if ( GXutil.strcmp(GXutil.substring( AV71vDirDest, GXutil.len( AV71vDirDest), 1), "\\") != 0 )
                  {
                     AV71vDirDest = GXutil.trim( AV71vDirDest) + "\\" ;
                  }
               }
               else
               {
                  if ( GXutil.strcmp(GXutil.substring( AV71vDirDest, GXutil.len( AV71vDirDest), 1), "\\") != 0 )
                  {
                     AV71vDirDest = GXutil.trim( AV71vDirDest) + "\\" ;
                  }
               }
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV22DirectoryZip = AV75PathModelos + httpContext.getMessage( "\\Temp\\", "") ;
         if ( GXutil.strcmp(AV54vCharUlt, "\\") != 0 )
         {
            AV32Nombre += GXutil.trim( AV71vDirDest) ;
            AV32Nombre += "\\" ;
         }
         AV72DirectoryDest.setSource( AV32Nombre );
         AV33NombreDesc = GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 10, 0)), (short)(8), "0") + GXutil.padl( GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)), (short)(1), "0") + GXutil.padl( GXutil.trim( A130BarCodPar), (short)(1), "_") + httpContext.getMessage( ".DOCX", "") ;
         AV32Nombre += GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 10, 0)), (short)(8), "0") + GXutil.padl( GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)), (short)(1), "0") + GXutil.padl( GXutil.trim( A130BarCodPar), (short)(1), "_") + httpContext.getMessage( ".DOCX", "") ;
         AV35NombreZip = AV22DirectoryZip + GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 10, 0)), (short)(8), "0") + GXutil.padl( GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)), (short)(1), "0") + GXutil.padl( GXutil.trim( A130BarCodPar), (short)(1), "_") + httpContext.getMessage( ".ZIP", "") ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Inicia Nombre Documento :%1, Directorio Destino:%2", ""), AV32Nombre, AV72DirectoryDest.getSource(), "", "", "", "", "", "", ""), AV81Pgmname) ;
         AV55vFile.setSource( AV32Nombre );
         if ( ! AV72DirectoryDest.exists() )
         {
            AV72DirectoryDest.create();
         }
         if ( AV55vFile.exists() )
         {
            AV55vFile.delete();
         }
         AV56vFileOrigen.setSource( AV18CCTarc );
         if ( AV56vFileOrigen.exists() )
         {
            AV56vFileOrigen.copy(AV35NombreZip);
         }
         AV29Logs = AV12AppTool.unzip(AV35NombreZip, AV22DirectoryZip) ;
         AV61vFileZip.setSource( AV35NombreZip );
         if ( AV61vFileZip.exists() )
         {
            AV61vFileZip.delete();
         }
         AV34NombreXML = AV22DirectoryZip + httpContext.getMessage( "\\Word\\document.xml", "") ;
         AV58vFileXML.setSource( AV34NombreXML );
         AV58vFileXML.open("");
         AV53TxtXML = AV58vFileXML.readAllText("") ;
         AV58vFileXML.close();
         AV67vTxtXmlC1 = GXutil.trim( AV53TxtXML) ;
         AV9AlbRGrm2 = (short)(0) ;
         AV8AlbRAnc = (short)(0) ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Documento Convertido XML: XMLIni:%1", ""), AV53TxtXML, "", "", "", "", "", "", "", ""), AV81Pgmname) ;
         GXv_int5[0] = AV30Max ;
         new app.controlcalidadhtd.ccpolfunproxml(remoteHandle, context).execute( AV67vTxtXmlC1, GXv_int5, AV25Funcion, AV40ParNom, AV41ParTpo) ;
         pccpolnxml.this.AV30Max = (byte)((byte)(GXv_int5[0])) ;
         if ( AV30Max > 1 )
         {
            /* Using cursor P0ARI3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A212BarSer = P0ARI3_A212BarSer[0] ;
               A361DisCod = P0ARI3_A361DisCod[0] ;
               AV23Discod = A361DisCod ;
               /* Execute user subroutine: 'OBSERV' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV36Nr = (byte)(1) ;
               GX_I = 1 ;
               while ( GX_I <= 5 )
               {
                  AV49TabLot[GX_I-1] = "" ;
                  GX_I = (int)(GX_I+1) ;
               }
               GX_I = 1 ;
               while ( GX_I <= 5 )
               {
                  AV50TabTel[GX_I-1] = "" ;
                  GX_I = (int)(GX_I+1) ;
               }
               /* Using cursor P0ARI4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A44AlbRecCod = P0ARI4_A44AlbRecCod[0] ;
                  A4920AlbRGrm2 = P0ARI4_A4920AlbRGrm2[0] ;
                  A4921AlbRAnc = P0ARI4_A4921AlbRAnc[0] ;
                  A6463AlbRLote = P0ARI4_A6463AlbRLote[0] ;
                  A6464AlbRTelar = P0ARI4_A6464AlbRTelar[0] ;
                  A200BarPieCod = P0ARI4_A200BarPieCod[0] ;
                  A4920AlbRGrm2 = P0ARI4_A4920AlbRGrm2[0] ;
                  A4921AlbRAnc = P0ARI4_A4921AlbRAnc[0] ;
                  A6463AlbRLote = P0ARI4_A6463AlbRLote[0] ;
                  A6464AlbRTelar = P0ARI4_A6464AlbRTelar[0] ;
                  AV9AlbRGrm2 = A4920AlbRGrm2 ;
                  AV8AlbRAnc = A4921AlbRAnc ;
                  if ( AV36Nr <= 5 )
                  {
                     AV49TabLot[AV36Nr-1] = A6463AlbRLote ;
                     AV50TabTel[AV36Nr-1] = A6464AlbRTelar ;
                  }
                  AV36Nr = (byte)(AV36Nr+1) ;
                  pr_default.readNext(2);
               }
               pr_default.close(2);
               AV43Procod = "" ;
               /* Using cursor P0ARI5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A761ProFasLin = P0ARI5_A761ProFasLin[0] ;
                  n761ProFasLin = P0ARI5_n761ProFasLin[0] ;
                  A758ProCod = P0ARI5_A758ProCod[0] ;
                  AV43Procod = A758ProCod ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            pr_default.dynParam(4, new Object[]{ new Object[]{
                                                 Short.valueOf(A194BarOrdLin) ,
                                                 AV48Tab_orden ,
                                                 Byte.valueOf(AV70nOrd) ,
                                                 A396EmprCod ,
                                                 Integer.valueOf(A129BarCod) ,
                                                 Byte.valueOf(A132BarCodReo) ,
                                                 A130BarCodPar } ,
                                                 new int[]{
                                                 TypeConstants.SHORT, TypeConstants.ARRAY | TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                                 }
            });
            /* Using cursor P0ARI7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A252CliCod = P0ARI7_A252CliCod[0] ;
               n252CliCod = P0ARI7_n252CliCod[0] ;
               A758ProCod = P0ARI7_A758ProCod[0] ;
               A4031CCTCod = P0ARI7_A4031CCTCod[0] ;
               A194BarOrdLin = P0ARI7_A194BarOrdLin[0] ;
               A4032CCOpeCod = P0ARI7_A4032CCOpeCod[0] ;
               n4032CCOpeCod = P0ARI7_n4032CCOpeCod[0] ;
               A217BarTipArt = P0ARI7_A217BarTipArt[0] ;
               n217BarTipArt = P0ARI7_n217BarTipArt[0] ;
               A4033CCFch = P0ARI7_A4033CCFch[0] ;
               n4033CCFch = P0ARI7_n4033CCFch[0] ;
               A3281CcObs = P0ARI7_A3281CcObs[0] ;
               n3281CcObs = P0ARI7_n3281CcObs[0] ;
               A279CliNom = P0ARI7_A279CliNom[0] ;
               A212BarSer = P0ARI7_A212BarSer[0] ;
               A4812BarEncCli = P0ARI7_A4812BarEncCli[0] ;
               A143BarDisNum = P0ARI7_A143BarDisNum[0] ;
               A135BarColNom = P0ARI7_A135BarColNom[0] ;
               A136BarColNum = P0ARI7_A136BarColNum[0] ;
               A1652BarSerDsc = P0ARI7_A1652BarSerDsc[0] ;
               A127BarAncCru1 = P0ARI7_A127BarAncCru1[0] ;
               A128BarAncCru2 = P0ARI7_A128BarAncCru2[0] ;
               A125BarAncAca1 = P0ARI7_A125BarAncAca1[0] ;
               A126BarAncAca2 = P0ARI7_A126BarAncAca2[0] ;
               A226BarTraP3 = P0ARI7_A226BarTraP3[0] ;
               A225BarTraP2 = P0ARI7_A225BarTraP2[0] ;
               A224BarTraP1 = P0ARI7_A224BarTraP1[0] ;
               A223BarTra3 = P0ARI7_A223BarTra3[0] ;
               A222BarTra2 = P0ARI7_A222BarTra2[0] ;
               A221BarTra1 = P0ARI7_A221BarTra1[0] ;
               A234BarUrdP3 = P0ARI7_A234BarUrdP3[0] ;
               A233BarUrdP2 = P0ARI7_A233BarUrdP2[0] ;
               A232BarUrdP1 = P0ARI7_A232BarUrdP1[0] ;
               A231BarUrd3 = P0ARI7_A231BarUrd3[0] ;
               A230BarUrd2 = P0ARI7_A230BarUrd2[0] ;
               A229BarUrd1 = P0ARI7_A229BarUrd1[0] ;
               A864BarPes = P0ARI7_A864BarPes[0] ;
               A1909BarGraAca = P0ARI7_A1909BarGraAca[0] ;
               A2454BarGirar = P0ARI7_A2454BarGirar[0] ;
               A1234BarNomCli = P0ARI7_A1234BarNomCli[0] ;
               A1235BarNumCli = P0ARI7_A1235BarNumCli[0] ;
               A3137BarGraAca2 = P0ARI7_A3137BarGraAca2[0] ;
               A1224BarEncAnh = P0ARI7_A1224BarEncAnh[0] ;
               A1223BarEncCom = P0ARI7_A1223BarEncCom[0] ;
               A1226BarGraCru = P0ARI7_A1226BarGraCru[0] ;
               A5406BarAntpT = P0ARI7_A5406BarAntpT[0] ;
               A4609BarMdlCod = P0ARI7_A4609BarMdlCod[0] ;
               A166BarKgm = P0ARI7_A166BarKgm[0] ;
               A184BarMtr = P0ARI7_A184BarMtr[0] ;
               A252CliCod = P0ARI7_A252CliCod[0] ;
               n252CliCod = P0ARI7_n252CliCod[0] ;
               A217BarTipArt = P0ARI7_A217BarTipArt[0] ;
               n217BarTipArt = P0ARI7_n217BarTipArt[0] ;
               A212BarSer = P0ARI7_A212BarSer[0] ;
               A4812BarEncCli = P0ARI7_A4812BarEncCli[0] ;
               A143BarDisNum = P0ARI7_A143BarDisNum[0] ;
               A135BarColNom = P0ARI7_A135BarColNom[0] ;
               A136BarColNum = P0ARI7_A136BarColNum[0] ;
               A1652BarSerDsc = P0ARI7_A1652BarSerDsc[0] ;
               A127BarAncCru1 = P0ARI7_A127BarAncCru1[0] ;
               A128BarAncCru2 = P0ARI7_A128BarAncCru2[0] ;
               A125BarAncAca1 = P0ARI7_A125BarAncAca1[0] ;
               A126BarAncAca2 = P0ARI7_A126BarAncAca2[0] ;
               A226BarTraP3 = P0ARI7_A226BarTraP3[0] ;
               A225BarTraP2 = P0ARI7_A225BarTraP2[0] ;
               A224BarTraP1 = P0ARI7_A224BarTraP1[0] ;
               A223BarTra3 = P0ARI7_A223BarTra3[0] ;
               A222BarTra2 = P0ARI7_A222BarTra2[0] ;
               A221BarTra1 = P0ARI7_A221BarTra1[0] ;
               A234BarUrdP3 = P0ARI7_A234BarUrdP3[0] ;
               A233BarUrdP2 = P0ARI7_A233BarUrdP2[0] ;
               A232BarUrdP1 = P0ARI7_A232BarUrdP1[0] ;
               A231BarUrd3 = P0ARI7_A231BarUrd3[0] ;
               A230BarUrd2 = P0ARI7_A230BarUrd2[0] ;
               A229BarUrd1 = P0ARI7_A229BarUrd1[0] ;
               A864BarPes = P0ARI7_A864BarPes[0] ;
               A1909BarGraAca = P0ARI7_A1909BarGraAca[0] ;
               A2454BarGirar = P0ARI7_A2454BarGirar[0] ;
               A1234BarNomCli = P0ARI7_A1234BarNomCli[0] ;
               A1235BarNumCli = P0ARI7_A1235BarNumCli[0] ;
               A3137BarGraAca2 = P0ARI7_A3137BarGraAca2[0] ;
               A1224BarEncAnh = P0ARI7_A1224BarEncAnh[0] ;
               A1223BarEncCom = P0ARI7_A1223BarEncCom[0] ;
               A1226BarGraCru = P0ARI7_A1226BarGraCru[0] ;
               A5406BarAntpT = P0ARI7_A5406BarAntpT[0] ;
               A4609BarMdlCod = P0ARI7_A4609BarMdlCod[0] ;
               A279CliNom = P0ARI7_A279CliNom[0] ;
               A166BarKgm = P0ARI7_A166BarKgm[0] ;
               A184BarMtr = P0ARI7_A184BarMtr[0] ;
               AV38Openom = " " ;
               /* Using cursor P0ARI8 */
               pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n4032CCOpeCod), Integer.valueOf(A4032CCOpeCod)});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A652OpeCod = P0ARI8_A652OpeCod[0] ;
                  A653OpeNom = P0ARI8_A653OpeNom[0] ;
                  n653OpeNom = P0ARI8_n653OpeNom[0] ;
                  AV38Openom = A653OpeNom ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(5);
               AV15BarTipArt = A217BarTipArt ;
               /* Execute user subroutine: 'TIPART' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV21Cont = (byte)(1) ;
               new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Max:%1", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Max), 2, 0), "", "", "", "", "", "", "", ""), AV81Pgmname) ;
               while ( AV21Cont <= ( AV30Max - 1 ) )
               {
                  AV39ParCnt = (byte)(GXutil.lval( AV25Funcion[AV21Cont-1][3-1])) ;
                  AV42Prg = AV25Funcion[AV21Cont-1][1-1] ;
                  new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Prg:%1", ""), GXutil.trim( AV42Prg), "", "", "", "", "", "", "", ""), AV81Pgmname) ;
                  if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "FECHA", "")) == 0 )
                  {
                     AV62vFrm = (byte)(GXutil.lval( AV40ParNom[AV21Cont-1][1-1])) ;
                     GXt_char1 = AV44Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolfchstr(remoteHandle, context).execute( A4033CCFch, AV62vFrm, GXv_char4) ;
                     pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                     AV44Str = GXt_char1 ;
                     GXv_char4[0] = AV44Str ;
                     new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( AV44Str, AV62vFrm, GXv_char4) ;
                     pccpolnxml.this.AV44Str = GXv_char4[0] ;
                     new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Str:%1", ""), GXutil.trim( AV44Str), "", "", "", "", "", "", "", ""), AV81Pgmname) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "OBSERVACIONES", "")) == 0 )
                  {
                     AV31N = (byte)(GXutil.gxmlines( A3281CcObs, (short)(100))) ;
                     AV27I = 1 ;
                     AV44Str = "" ;
                     while ( AV27I <= AV31N )
                     {
                        AV44Str += GXutil.gxgetmli( A3281CcObs, (short)(AV27I), (short)(100)) ;
                        AV27I = (long)(AV27I+1) ;
                     }
                     new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Str:%1", ""), GXutil.trim( AV44Str), "", "", "", "", "", "", "", ""), AV81Pgmname) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "OPERARIO", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( AV38Openom) ;
                     new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Str:%1", ""), GXutil.trim( AV44Str), "", "", "", "", "", "", "", ""), AV81Pgmname) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "CLIENTE", "")) == 0 )
                  {
                     AV62vFrm = (byte)(GXutil.lval( AV40ParNom[AV21Cont-1][1-1])) ;
                     GXt_char1 = AV44Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( A279CliNom, AV62vFrm, GXv_char4) ;
                     pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                     AV44Str = GXt_char1 ;
                     new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Frm:%1,Str:%2", ""), GXutil.str( AV62vFrm, 1, 0), GXutil.trim( AV44Str), "", "", "", "", "", "", ""), AV81Pgmname) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "SERIE", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( A212BarSer) ;
                     new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Str:%1", ""), GXutil.trim( AV44Str), "", "", "", "", "", "", "", ""), AV81Pgmname) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "DISPCLI", "")) == 0 )
                  {
                     AV62vFrm = (byte)(GXutil.lval( AV40ParNom[AV21Cont-1][1-1])) ;
                     if ( (GXutil.strcmp("", A4812BarEncCli)==0) )
                     {
                        GXt_char1 = AV44Str ;
                        GXv_char4[0] = GXt_char1 ;
                        new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( A143BarDisNum, AV62vFrm, GXv_char4) ;
                        pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                        AV44Str = GXt_char1 ;
                     }
                     else
                     {
                        GXt_char1 = AV44Str ;
                        GXv_char4[0] = GXt_char1 ;
                        new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( A4812BarEncCli, AV62vFrm, GXv_char4) ;
                        pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                        AV44Str = GXt_char1 ;
                     }
                     new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Str:%1", ""), GXutil.trim( AV44Str), "", "", "", "", "", "", "", ""), AV81Pgmname) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "HDR", "")) == 0 )
                  {
                     AV44Str = GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 10, 0)), (short)(8), "0") + GXutil.padl( GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)), (short)(1), "0") + GXutil.padl( GXutil.trim( A130BarCodPar), (short)(1), "_") ;
                     AV62vFrm = (byte)(GXutil.lval( AV40ParNom[AV21Cont-1][1-1])) ;
                     GXt_char1 = AV44Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( AV44Str, AV62vFrm, GXv_char4) ;
                     pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                     AV44Str = GXt_char1 ;
                     new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Frm:%1,Str:%2", ""), GXutil.str( AV62vFrm, 1, 0), GXutil.trim( AV44Str), "", "", "", "", "", "", ""), AV81Pgmname) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "COLOR", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( A135BarColNom) + " " ;
                     AV62vFrm = (byte)(GXutil.lval( AV40ParNom[AV21Cont-1][1-1])) ;
                     AV63vFrm2 = (byte)(GXutil.lval( AV40ParNom[AV21Cont-1][2-1])) ;
                     GXt_char1 = AV44Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A136BarColNum, 3, 0, AV63vFrm2, GXv_char4) ;
                     pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                     AV44Str += GXt_char1 ;
                     GXv_char4[0] = AV44Str ;
                     new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( AV44Str, AV62vFrm, GXv_char4) ;
                     pccpolnxml.this.AV44Str = GXv_char4[0] ;
                     new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Str:%1", ""), GXutil.trim( AV44Str), "", "", "", "", "", "", "", ""), AV81Pgmname) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "TIPART", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( AV51TipArtDsc) ;
                     new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Str:%1", ""), GXutil.trim( AV44Str), "", "", "", "", "", "", "", ""), AV81Pgmname) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "SERDSC", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( A1652BarSerDsc) ;
                     new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Str:%1", ""), GXutil.trim( AV44Str), "", "", "", "", "", "", "", ""), AV81Pgmname) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "COLNUM", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( A135BarColNom) ;
                     if ( A136BarColNum > 0 )
                     {
                        AV44Str = GXutil.trim( A135BarColNom) + " " + GXutil.str( A136BarColNum, 6, 0) ;
                     }
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "HDR2", "")) == 0 )
                  {
                     AV44Str = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "ANCHO", "")) == 0 )
                  {
                     AV63vFrm2 = (byte)(GXutil.lval( AV40ParNom[AV21Cont-1][2-1])) ;
                     if ( GXutil.strcmp(AV40ParNom[AV21Cont-1][1-1], "1") == 0 )
                     {
                        GXt_char1 = AV44Str ;
                        GXv_char4[0] = GXt_char1 ;
                        new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A127BarAncCru1, 3, 0, AV63vFrm2, GXv_char4) ;
                        pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                        AV44Str = GXt_char1 ;
                     }
                     else if ( GXutil.strcmp(AV40ParNom[AV21Cont-1][1-1], "2") == 0 )
                     {
                        GXt_char1 = AV44Str ;
                        GXv_char4[0] = GXt_char1 ;
                        new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A128BarAncCru2, 3, 0, AV63vFrm2, GXv_char4) ;
                        pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                        AV44Str = GXt_char1 ;
                     }
                     else if ( GXutil.strcmp(AV40ParNom[AV21Cont-1][1-1], "3") == 0 )
                     {
                        GXt_char1 = AV44Str ;
                        GXv_char4[0] = GXt_char1 ;
                        new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A125BarAncAca1, 3, 0, AV63vFrm2, GXv_char4) ;
                        pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                        AV44Str = GXt_char1 ;
                     }
                     else if ( GXutil.strcmp(AV40ParNom[AV21Cont-1][1-1], "4") == 0 )
                     {
                        GXt_char1 = AV44Str ;
                        GXv_char4[0] = GXt_char1 ;
                        new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A126BarAncAca2, 3, 0, AV63vFrm2, GXv_char4) ;
                        pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                        AV44Str = GXt_char1 ;
                     }
                     else if ( GXutil.strcmp(AV40ParNom[AV21Cont-1][1-1], "5") == 0 )
                     {
                        AV44Str = httpContext.getMessage( "OPCION NO VALIDA", "") ;
                     }
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "COMPOSICION", "")) == 0 )
                  {
                     if ( GXutil.strcmp(AV40ParNom[AV21Cont-1][1-1], "1") == 0 )
                     {
                        AV44Str = "" ;
                        if ( ! ( (GXutil.strcmp("", A221BarTra1)==0) && (GXutil.strcmp("", A222BarTra2)==0) && (GXutil.strcmp("", A223BarTra3)==0) && (0==A224BarTraP1) && (0==A225BarTraP2) && (0==A226BarTraP3) ) )
                        {
                           AV44Str = httpContext.getMessage( "Trama : ", "") ;
                           if ( ! ( (GXutil.strcmp("", A221BarTra1)==0) && (0==A224BarTraP1) ) )
                           {
                              AV44Str += GXutil.trim( A221BarTra1) + " " + GXutil.trim( GXutil.str( A224BarTraP1, 10, 0)) + "% " ;
                           }
                           if ( ! ( (GXutil.strcmp("", A222BarTra2)==0) && (0==A225BarTraP2) ) )
                           {
                              AV44Str += ", " + GXutil.trim( A222BarTra2) + " " + GXutil.trim( GXutil.str( A225BarTraP2, 10, 0)) + "% " ;
                           }
                           if ( ! ( (GXutil.strcmp("", A223BarTra3)==0) && (0==A226BarTraP3) ) )
                           {
                              AV44Str += ", " + GXutil.trim( A223BarTra3) + " " + GXutil.trim( GXutil.str( A226BarTraP3, 10, 0)) + "% " ;
                           }
                        }
                        if ( ! ( (GXutil.strcmp("", A229BarUrd1)==0) && (GXutil.strcmp("", A230BarUrd2)==0) && (GXutil.strcmp("", A231BarUrd3)==0) && (0==A232BarUrdP1) && (0==A233BarUrdP2) && (0==A234BarUrdP3) ) )
                        {
                           AV44Str = httpContext.getMessage( "Urdido : ", "") ;
                           if ( ! ( (GXutil.strcmp("", A229BarUrd1)==0) && (0==A232BarUrdP1) ) )
                           {
                              AV44Str += GXutil.trim( A229BarUrd1) + " " + GXutil.trim( GXutil.str( A232BarUrdP1, 10, 0)) + "% " ;
                           }
                           if ( ! ( (GXutil.strcmp("", A230BarUrd2)==0) && (0==A233BarUrdP2) ) )
                           {
                              AV44Str += ", " + GXutil.trim( A230BarUrd2) + " " + GXutil.trim( GXutil.str( A233BarUrdP2, 10, 0)) + "% " ;
                           }
                           if ( ! ( (GXutil.strcmp("", A231BarUrd3)==0) && (0==A234BarUrdP3) ) )
                           {
                              AV44Str += ", " + GXutil.trim( A231BarUrd3) + " " + GXutil.trim( GXutil.str( A234BarUrdP3, 10, 0)) + "% " ;
                           }
                        }
                     }
                     else if ( GXutil.strcmp(AV40ParNom[AV21Cont-1][1-1], "2") == 0 )
                     {
                        AV44Str = "" ;
                        if ( ! ( (GXutil.strcmp("", A221BarTra1)==0) && (0==A224BarTraP1) ) )
                        {
                           AV44Str += GXutil.trim( A221BarTra1) + " " + GXutil.trim( GXutil.str( A224BarTraP1, 10, 0)) + "% " ;
                        }
                        if ( ! ( (GXutil.strcmp("", A222BarTra2)==0) && (0==A225BarTraP2) ) )
                        {
                           AV44Str += ", " + GXutil.trim( A222BarTra2) + " " + GXutil.trim( GXutil.str( A225BarTraP2, 10, 0)) + "% " ;
                        }
                        if ( ! ( (GXutil.strcmp("", A223BarTra3)==0) && (0==A226BarTraP3) ) )
                        {
                           AV44Str += ", " + GXutil.trim( A223BarTra3) + " " + GXutil.trim( GXutil.str( A226BarTraP3, 10, 0)) + "% " ;
                        }
                        if ( ! ( (GXutil.strcmp("", A229BarUrd1)==0) && (0==A232BarUrdP1) ) )
                        {
                           AV44Str += ", " + GXutil.trim( A229BarUrd1) + " " + GXutil.trim( GXutil.str( A232BarUrdP1, 10, 0)) + "% " ;
                        }
                        if ( ! ( (GXutil.strcmp("", A230BarUrd2)==0) && (0==A233BarUrdP2) ) )
                        {
                           AV44Str += ", " + GXutil.trim( A230BarUrd2) + " " + GXutil.trim( GXutil.str( A233BarUrdP2, 10, 0)) + "% " ;
                        }
                        if ( ! ( (GXutil.strcmp("", A231BarUrd3)==0) && (0==A234BarUrdP3) ) )
                        {
                           AV44Str += ", " + GXutil.trim( A231BarUrd3) + " " + GXutil.trim( GXutil.str( A234BarUrdP3, 10, 0)) + "% " ;
                        }
                     }
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "GML", "")) == 0 )
                  {
                     AV62vFrm = (byte)(GXutil.lval( AV40ParNom[AV21Cont-1][1-1])) ;
                     GXt_char1 = AV44Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A864BarPes, 4, 0, AV62vFrm, GXv_char4) ;
                     pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                     AV44Str = GXt_char1 ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "GM2", "")) == 0 )
                  {
                     AV62vFrm = (byte)(GXutil.lval( AV40ParNom[AV21Cont-1][1-1])) ;
                     GXt_char1 = AV44Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A1909BarGraAca, 4, 0, AV62vFrm, GXv_char4) ;
                     pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                     AV44Str = GXt_char1 ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "ANCA1", "")) == 0 )
                  {
                     AV62vFrm = (byte)(GXutil.lval( AV40ParNom[AV21Cont-1][1-1])) ;
                     GXt_char1 = AV44Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A125BarAncAca1, 4, 0, AV62vFrm, GXv_char4) ;
                     pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                     AV44Str = GXt_char1 ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "KGS", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( GXutil.str( A166BarKgm, 9, 2)) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "MTS", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( GXutil.str( A184BarMtr, 9, 2)) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "CARTAZ", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( A2454BarGirar) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "COLORC", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( A1234BarNomCli) + " " ;
                     AV62vFrm = (byte)(GXutil.lval( AV40ParNom[AV21Cont-1][1-1])) ;
                     AV63vFrm2 = (byte)(GXutil.lval( AV40ParNom[AV21Cont-1][2-1])) ;
                     GXt_char1 = AV44Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A1235BarNumCli, 3, 0, AV63vFrm2, GXv_char4) ;
                     pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                     AV44Str += GXt_char1 ;
                     GXv_char4[0] = AV44Str ;
                     new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( AV44Str, AV62vFrm, GXv_char4) ;
                     pccpolnxml.this.AV44Str = GXv_char4[0] ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "GM22", "")) == 0 )
                  {
                     GXt_char1 = AV44Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A3137BarGraAca2, 4, 0, AV62vFrm, GXv_char4) ;
                     pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                     AV44Str = GXt_char1 ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "ESTA", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( GXutil.str( A1224BarEncAnh, 6, 2)) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "ESTC", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( GXutil.str( A1223BarEncCom, 6, 2)) ;
                  }
                  else if ( ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "GM2C", "")) == 0 ) && ( AV9AlbRGrm2 > 0 ) )
                  {
                     GXt_char1 = AV44Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( AV9AlbRGrm2, 4, 0, AV62vFrm, GXv_char4) ;
                     pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                     AV44Str = GXt_char1 ;
                  }
                  else if ( ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "GM2C", "")) == 0 ) && ( AV9AlbRGrm2 == 0 ) )
                  {
                     GXt_char1 = AV44Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A1226BarGraCru, 4, 0, AV62vFrm, GXv_char4) ;
                     pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                     AV44Str = GXt_char1 ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "ANCC", "")) == 0 )
                  {
                     if ( AV8AlbRAnc > 0 )
                     {
                        GXt_char1 = AV44Str ;
                        GXv_char4[0] = GXt_char1 ;
                        new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( AV8AlbRAnc, 4, 0, AV62vFrm, GXv_char4) ;
                        pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                        AV44Str = GXt_char1 ;
                     }
                     else
                     {
                        GXt_char1 = AV44Str ;
                        GXv_char4[0] = GXt_char1 ;
                        new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A127BarAncCru1, 4, 0, AV62vFrm, GXv_char4) ;
                        pccpolnxml.this.GXt_char1 = GXv_char4[0] ;
                        AV44Str = GXt_char1 ;
                     }
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "OBSHDR", "")) == 0 )
                  {
                     AV31N = (byte)(GXutil.gxmlines( AV37Obs, (short)(60))) ;
                     AV27I = 1 ;
                     AV44Str = "" ;
                     while ( AV27I <= AV31N )
                     {
                        AV44Str += GXutil.gxgetmli( AV37Obs, (short)(AV27I), (short)(60)) ;
                        AV27I = (long)(AV27I+1) ;
                     }
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "SECAGEM", "")) == 0 )
                  {
                     if ( GXutil.strcmp(A5406BarAntpT, "2") == 0 )
                     {
                        AV44Str = GXutil.trim( httpContext.getMessage( "Secagem em Plano", "")) ;
                     }
                     else if ( GXutil.strcmp(A5406BarAntpT, "1") == 0 )
                     {
                        AV44Str = GXutil.trim( httpContext.getMessage( "Secagem em Tumbler", "")) ;
                     }
                     else
                     {
                        AV44Str = GXutil.trim( httpContext.getMessage( "Sem Valor", "")) ;
                     }
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "MODELO", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( A4609BarMdlCod) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "LOTE1", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( AV49TabLot[1-1]) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "LOTE2", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( AV49TabLot[2-1]) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "LOTE3", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( AV49TabLot[3-1]) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "TEAR1", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( AV50TabTel[1-1]) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "TEAR2", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( AV50TabTel[2-1]) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "TEAR3", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( AV50TabTel[3-1]) ;
                  }
                  else if ( GXutil.strcmp(GXutil.upper( AV42Prg), httpContext.getMessage( "PROCESO", "")) == 0 )
                  {
                     AV44Str = GXutil.trim( AV43Procod) ;
                  }
                  else
                  {
                     if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "SIN", "")) != 0 )
                     {
                        AV87GXLvl367 = (byte)(0) ;
                        /* Using cursor P0ARI9 */
                        pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), AV42Prg});
                        while ( (pr_default.getStatus(6) != 101) )
                        {
                           A4047CCTLinVarW = P0ARI9_A4047CCTLinVarW[0] ;
                           A4035CCVal = P0ARI9_A4035CCVal[0] ;
                           A4034CCTLin = P0ARI9_A4034CCTLin[0] ;
                           A4047CCTLinVarW = P0ARI9_A4047CCTLinVarW[0] ;
                           AV87GXLvl367 = (byte)(1) ;
                           if ( ! (GXutil.strcmp("", A4035CCVal)==0) )
                           {
                              if ( GXutil.strcmp(AV40ParNom[AV21Cont-1][1-1], "1") == 0 )
                              {
                                 GXt_char1 = AV44Str ;
                                 GXv_char4[0] = A396EmprCod ;
                                 GXv_int6[0] = A4031CCTCod ;
                                 GXv_int7[0] = A4034CCTLin ;
                                 GXv_char3[0] = A4035CCVal ;
                                 GXv_char2[0] = GXt_char1 ;
                                 new app.controlcalidadhtd.pccvaldsc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int7, GXv_char3, GXv_char2) ;
                                 pccpolnxml.this.A396EmprCod = GXv_char4[0] ;
                                 pccpolnxml.this.A4031CCTCod = GXv_int6[0] ;
                                 pccpolnxml.this.A4034CCTLin = GXv_int7[0] ;
                                 pccpolnxml.this.A4035CCVal = GXv_char3[0] ;
                                 pccpolnxml.this.GXt_char1 = GXv_char2[0] ;
                                 AV44Str = GXt_char1 ;
                              }
                              else if ( GXutil.strcmp(AV40ParNom[AV21Cont-1][1-1], "2") == 0 )
                              {
                                 AV44Str = A4035CCVal ;
                              }
                              else
                              {
                                 AV44Str = httpContext.getMessage( "¡¡¡ Formato incorrecto !!!", "") ;
                              }
                           }
                           else
                           {
                              AV44Str = "***" ;
                           }
                           new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Prg:%1, Str:%2", ""), GXutil.trim( AV42Prg), GXutil.trim( AV44Str), "", "", "", "", "", "", ""), AV81Pgmname) ;
                           pr_default.readNext(6);
                        }
                        pr_default.close(6);
                        if ( AV87GXLvl367 == 0 )
                        {
                           AV44Str = AV25Funcion[AV21Cont-1][2-1] ;
                        }
                     }
                     else
                     {
                        AV44Str = AV25Funcion[AV21Cont-1][2-1] ;
                     }
                  }
                  AV52txt2 = AV25Funcion[AV21Cont-1][2-1] ;
                  if ( GxRegex.IsMatch(AV53TxtXML,AV52txt2) )
                  {
                     AV53TxtXML = GXutil.strReplace( AV53TxtXML, AV52txt2, AV44Str) ;
                  }
                  AV21Cont = (byte)(AV21Cont+1) ;
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
         }
         else
         {
            new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "No se encontró variables a procesar...", ""), "", "", "", "", "", "", "", "", ""), AV81Pgmname) ;
         }
         AV57vFileWrite.setSource( AV34NombreXML );
         AV57vFileWrite.delete();
         AV57vFileWrite.create();
         AV57vFileWrite.writeAllText(AV53TxtXML, "UTF-8");
         AV57vFileWrite.close();
         AV29Logs = AV12AppTool.zip(AV22DirectoryZip, AV32Nombre) ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV29Logs, AV81Pgmname) ;
         AV29Logs = AV12AppTool.deletedirectory(AV22DirectoryZip) ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV29Logs, AV81Pgmname) ;
         httpContext.wjLoc = formatLink("app.apget_downloadfile", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32Nombre)),GXutil.URLEncode(GXutil.rtrim(AV33NombreDesc)),GXutil.URLEncode(GXutil.rtrim("application/vnd.openxmlformats-officedocument.wordprocessingml.document"))}, new String[] {"vrPathCompleto","vrNomeArquivo","ContentType"})  ;
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No tiene poliza", ""));
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV51TipArtDsc = GXutil.space( (short)(30)) ;
      /* Using cursor P0ARI10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(AV15BarTipArt)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A829TipArtCod = P0ARI10_A829TipArtCod[0] ;
         A830TipArtDsc = P0ARI10_A830TipArtDsc[0] ;
         n830TipArtDsc = P0ARI10_n830TipArtDsc[0] ;
         AV51TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S121( )
   {
      /* 'OBSERV' Routine */
      returnInSub = false ;
      AV37Obs = " " ;
      /* Using cursor P0ARI11 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV23Discod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A361DisCod = P0ARI11_A361DisCod[0] ;
         A377DisObsTxt = P0ARI11_A377DisObsTxt[0] ;
         A376DisObsLin = P0ARI11_A376DisObsLin[0] ;
         if ( GXutil.strcmp(AV37Obs, "") == 0 )
         {
            AV37Obs = A377DisObsTxt + GXutil.chr( (short)(13)) ;
         }
         else
         {
            AV37Obs += A377DisObsTxt + GXutil.chr( (short)(13)) ;
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccpolnxml.this.A396EmprCod;
      this.aP1[0] = pccpolnxml.this.A129BarCod;
      this.aP2[0] = pccpolnxml.this.A132BarCodReo;
      this.aP3[0] = pccpolnxml.this.A130BarCodPar;
      this.aP4[0] = pccpolnxml.this.AV18CCTarc;
      this.aP6[0] = pccpolnxml.this.Gx_mode;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32Nombre = "" ;
      AV54vCharUlt = "" ;
      AV75PathModelos = "" ;
      AV71vDirDest = "" ;
      scmdbuf = "" ;
      P0ARI2_A396EmprCod = new String[] {""} ;
      P0ARI2_A313ContCod = new String[] {""} ;
      P0ARI2_A7208ContDsc2 = new String[] {""} ;
      P0ARI2_A14173ContATCod = new String[] {""} ;
      P0ARI2_n14173ContATCod = new boolean[] {false} ;
      A313ContCod = "" ;
      A7208ContDsc2 = "" ;
      A14173ContATCod = "" ;
      AV22DirectoryZip = "" ;
      AV72DirectoryDest = new com.genexus.util.GXDirectory();
      AV33NombreDesc = "" ;
      AV35NombreZip = "" ;
      AV81Pgmname = "" ;
      AV55vFile = new com.genexus.util.GXFile();
      AV56vFileOrigen = new com.genexus.util.GXFile();
      AV29Logs = "" ;
      AV12AppTool = new app.SdtAppTool(remoteHandle, context);
      AV61vFileZip = new com.genexus.util.GXFile();
      AV34NombreXML = "" ;
      AV58vFileXML = new com.genexus.util.GXFile();
      AV53TxtXML = "" ;
      AV67vTxtXmlC1 = "" ;
      GXv_int5 = new long[1] ;
      AV25Funcion = new String[200][3] ;
      GX_I = 1 ;
      while ( GX_I <= 200 )
      {
         GX_J = 1 ;
         while ( GX_J <= 3 )
         {
            AV25Funcion[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV40ParNom = new String[200][4] ;
      GX_I = 1 ;
      while ( GX_I <= 200 )
      {
         GX_J = 1 ;
         while ( GX_J <= 4 )
         {
            AV40ParNom[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV41ParTpo = new String[200][4] ;
      GX_I = 1 ;
      while ( GX_I <= 200 )
      {
         GX_J = 1 ;
         while ( GX_J <= 4 )
         {
            AV41ParTpo[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      P0ARI3_A396EmprCod = new String[] {""} ;
      P0ARI3_A129BarCod = new int[1] ;
      P0ARI3_A132BarCodReo = new byte[1] ;
      P0ARI3_A130BarCodPar = new String[] {""} ;
      P0ARI3_A212BarSer = new String[] {""} ;
      P0ARI3_A361DisCod = new int[1] ;
      A212BarSer = "" ;
      AV49TabLot = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV49TabLot[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV50TabTel = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV50TabTel[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P0ARI4_A44AlbRecCod = new int[1] ;
      P0ARI4_A396EmprCod = new String[] {""} ;
      P0ARI4_A129BarCod = new int[1] ;
      P0ARI4_A132BarCodReo = new byte[1] ;
      P0ARI4_A130BarCodPar = new String[] {""} ;
      P0ARI4_A4920AlbRGrm2 = new short[1] ;
      P0ARI4_A4921AlbRAnc = new short[1] ;
      P0ARI4_A6463AlbRLote = new String[] {""} ;
      P0ARI4_A6464AlbRTelar = new String[] {""} ;
      P0ARI4_A200BarPieCod = new String[] {""} ;
      A6463AlbRLote = "" ;
      A6464AlbRTelar = "" ;
      A200BarPieCod = "" ;
      AV43Procod = "" ;
      P0ARI5_A396EmprCod = new String[] {""} ;
      P0ARI5_A129BarCod = new int[1] ;
      P0ARI5_A132BarCodReo = new byte[1] ;
      P0ARI5_A130BarCodPar = new String[] {""} ;
      P0ARI5_A761ProFasLin = new short[1] ;
      P0ARI5_n761ProFasLin = new boolean[] {false} ;
      P0ARI5_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      P0ARI7_A252CliCod = new int[1] ;
      P0ARI7_n252CliCod = new boolean[] {false} ;
      P0ARI7_A396EmprCod = new String[] {""} ;
      P0ARI7_A129BarCod = new int[1] ;
      P0ARI7_A132BarCodReo = new byte[1] ;
      P0ARI7_A130BarCodPar = new String[] {""} ;
      P0ARI7_A758ProCod = new String[] {""} ;
      P0ARI7_A4031CCTCod = new int[1] ;
      P0ARI7_A194BarOrdLin = new short[1] ;
      P0ARI7_A4032CCOpeCod = new int[1] ;
      P0ARI7_n4032CCOpeCod = new boolean[] {false} ;
      P0ARI7_A217BarTipArt = new short[1] ;
      P0ARI7_n217BarTipArt = new boolean[] {false} ;
      P0ARI7_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0ARI7_n4033CCFch = new boolean[] {false} ;
      P0ARI7_A3281CcObs = new String[] {""} ;
      P0ARI7_n3281CcObs = new boolean[] {false} ;
      P0ARI7_A279CliNom = new String[] {""} ;
      P0ARI7_A212BarSer = new String[] {""} ;
      P0ARI7_A4812BarEncCli = new String[] {""} ;
      P0ARI7_A143BarDisNum = new String[] {""} ;
      P0ARI7_A135BarColNom = new String[] {""} ;
      P0ARI7_A136BarColNum = new int[1] ;
      P0ARI7_A1652BarSerDsc = new String[] {""} ;
      P0ARI7_A127BarAncCru1 = new short[1] ;
      P0ARI7_A128BarAncCru2 = new short[1] ;
      P0ARI7_A125BarAncAca1 = new short[1] ;
      P0ARI7_A126BarAncAca2 = new short[1] ;
      P0ARI7_A226BarTraP3 = new short[1] ;
      P0ARI7_A225BarTraP2 = new short[1] ;
      P0ARI7_A224BarTraP1 = new short[1] ;
      P0ARI7_A223BarTra3 = new String[] {""} ;
      P0ARI7_A222BarTra2 = new String[] {""} ;
      P0ARI7_A221BarTra1 = new String[] {""} ;
      P0ARI7_A234BarUrdP3 = new short[1] ;
      P0ARI7_A233BarUrdP2 = new short[1] ;
      P0ARI7_A232BarUrdP1 = new short[1] ;
      P0ARI7_A231BarUrd3 = new String[] {""} ;
      P0ARI7_A230BarUrd2 = new String[] {""} ;
      P0ARI7_A229BarUrd1 = new String[] {""} ;
      P0ARI7_A864BarPes = new short[1] ;
      P0ARI7_A1909BarGraAca = new short[1] ;
      P0ARI7_A2454BarGirar = new String[] {""} ;
      P0ARI7_A1234BarNomCli = new String[] {""} ;
      P0ARI7_A1235BarNumCli = new int[1] ;
      P0ARI7_A3137BarGraAca2 = new short[1] ;
      P0ARI7_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ARI7_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ARI7_A1226BarGraCru = new short[1] ;
      P0ARI7_A5406BarAntpT = new String[] {""} ;
      P0ARI7_A4609BarMdlCod = new String[] {""} ;
      P0ARI7_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ARI7_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4033CCFch = GXutil.nullDate() ;
      A3281CcObs = "" ;
      A279CliNom = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      A223BarTra3 = "" ;
      A222BarTra2 = "" ;
      A221BarTra1 = "" ;
      A231BarUrd3 = "" ;
      A230BarUrd2 = "" ;
      A229BarUrd1 = "" ;
      A2454BarGirar = "" ;
      A1234BarNomCli = "" ;
      A1224BarEncAnh = DecimalUtil.ZERO ;
      A1223BarEncCom = DecimalUtil.ZERO ;
      A5406BarAntpT = "" ;
      A4609BarMdlCod = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV38Openom = "" ;
      P0ARI8_A396EmprCod = new String[] {""} ;
      P0ARI8_A652OpeCod = new int[1] ;
      P0ARI8_A653OpeNom = new String[] {""} ;
      P0ARI8_n653OpeNom = new boolean[] {false} ;
      A653OpeNom = "" ;
      AV42Prg = "" ;
      AV44Str = "" ;
      AV51TipArtDsc = "" ;
      AV37Obs = "" ;
      P0ARI9_A396EmprCod = new String[] {""} ;
      P0ARI9_A129BarCod = new int[1] ;
      P0ARI9_A132BarCodReo = new byte[1] ;
      P0ARI9_A130BarCodPar = new String[] {""} ;
      P0ARI9_A758ProCod = new String[] {""} ;
      P0ARI9_A194BarOrdLin = new short[1] ;
      P0ARI9_A4031CCTCod = new int[1] ;
      P0ARI9_A4047CCTLinVarW = new String[] {""} ;
      P0ARI9_A4035CCVal = new String[] {""} ;
      P0ARI9_A4034CCTLin = new short[1] ;
      A4047CCTLinVarW = "" ;
      A4035CCVal = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV52txt2 = "" ;
      AV57vFileWrite = new com.genexus.util.GXFile();
      P0ARI10_A396EmprCod = new String[] {""} ;
      P0ARI10_A829TipArtCod = new short[1] ;
      P0ARI10_A830TipArtDsc = new String[] {""} ;
      P0ARI10_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      P0ARI11_A396EmprCod = new String[] {""} ;
      P0ARI11_A361DisCod = new int[1] ;
      P0ARI11_A377DisObsTxt = new String[] {""} ;
      P0ARI11_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.pccpolnxml__default(),
         new Object[] {
             new Object[] {
            P0ARI2_A396EmprCod, P0ARI2_A313ContCod, P0ARI2_A7208ContDsc2, P0ARI2_A14173ContATCod, P0ARI2_n14173ContATCod
            }
            , new Object[] {
            P0ARI3_A396EmprCod, P0ARI3_A129BarCod, P0ARI3_A132BarCodReo, P0ARI3_A130BarCodPar, P0ARI3_A212BarSer, P0ARI3_A361DisCod
            }
            , new Object[] {
            P0ARI4_A44AlbRecCod, P0ARI4_A396EmprCod, P0ARI4_A129BarCod, P0ARI4_A132BarCodReo, P0ARI4_A130BarCodPar, P0ARI4_A4920AlbRGrm2, P0ARI4_A4921AlbRAnc, P0ARI4_A6463AlbRLote, P0ARI4_A6464AlbRTelar, P0ARI4_A200BarPieCod
            }
            , new Object[] {
            P0ARI5_A396EmprCod, P0ARI5_A129BarCod, P0ARI5_A132BarCodReo, P0ARI5_A130BarCodPar, P0ARI5_A761ProFasLin, P0ARI5_n761ProFasLin, P0ARI5_A758ProCod
            }
            , new Object[] {
            P0ARI7_A252CliCod, P0ARI7_n252CliCod, P0ARI7_A396EmprCod, P0ARI7_A129BarCod, P0ARI7_A132BarCodReo, P0ARI7_A130BarCodPar, P0ARI7_A758ProCod, P0ARI7_A4031CCTCod, P0ARI7_A194BarOrdLin, P0ARI7_A4032CCOpeCod,
            P0ARI7_n4032CCOpeCod, P0ARI7_A217BarTipArt, P0ARI7_n217BarTipArt, P0ARI7_A4033CCFch, P0ARI7_n4033CCFch, P0ARI7_A3281CcObs, P0ARI7_n3281CcObs, P0ARI7_A279CliNom, P0ARI7_A212BarSer, P0ARI7_A4812BarEncCli,
            P0ARI7_A143BarDisNum, P0ARI7_A135BarColNom, P0ARI7_A136BarColNum, P0ARI7_A1652BarSerDsc, P0ARI7_A127BarAncCru1, P0ARI7_A128BarAncCru2, P0ARI7_A125BarAncAca1, P0ARI7_A126BarAncAca2, P0ARI7_A226BarTraP3, P0ARI7_A225BarTraP2,
            P0ARI7_A224BarTraP1, P0ARI7_A223BarTra3, P0ARI7_A222BarTra2, P0ARI7_A221BarTra1, P0ARI7_A234BarUrdP3, P0ARI7_A233BarUrdP2, P0ARI7_A232BarUrdP1, P0ARI7_A231BarUrd3, P0ARI7_A230BarUrd2, P0ARI7_A229BarUrd1,
            P0ARI7_A864BarPes, P0ARI7_A1909BarGraAca, P0ARI7_A2454BarGirar, P0ARI7_A1234BarNomCli, P0ARI7_A1235BarNumCli, P0ARI7_A3137BarGraAca2, P0ARI7_A1224BarEncAnh, P0ARI7_A1223BarEncCom, P0ARI7_A1226BarGraCru, P0ARI7_A5406BarAntpT,
            P0ARI7_A4609BarMdlCod, P0ARI7_A166BarKgm, P0ARI7_A184BarMtr
            }
            , new Object[] {
            P0ARI8_A396EmprCod, P0ARI8_A652OpeCod, P0ARI8_A653OpeNom, P0ARI8_n653OpeNom
            }
            , new Object[] {
            P0ARI9_A396EmprCod, P0ARI9_A129BarCod, P0ARI9_A132BarCodReo, P0ARI9_A130BarCodPar, P0ARI9_A758ProCod, P0ARI9_A194BarOrdLin, P0ARI9_A4031CCTCod, P0ARI9_A4047CCTLinVarW, P0ARI9_A4035CCVal, P0ARI9_A4034CCTLin
            }
            , new Object[] {
            P0ARI10_A396EmprCod, P0ARI10_A829TipArtCod, P0ARI10_A830TipArtDsc, P0ARI10_n830TipArtDsc
            }
            , new Object[] {
            P0ARI11_A396EmprCod, P0ARI11_A361DisCod, P0ARI11_A377DisObsTxt, P0ARI11_A376DisObsLin
            }
         }
      );
      AV81Pgmname = "ControlCalidadHTD.PCCPolnXML" ;
      /* GeneXus formulas. */
      AV81Pgmname = "ControlCalidadHTD.PCCPolnXML" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV70nOrd ;
   private byte AV76vPosDir ;
   private byte AV30Max ;
   private byte AV36Nr ;
   private byte AV21Cont ;
   private byte AV39ParCnt ;
   private byte AV62vFrm ;
   private byte AV31N ;
   private byte AV63vFrm2 ;
   private byte AV87GXLvl367 ;
   private byte A376DisObsLin ;
   private short AV48Tab_orden[] ;
   private short AV14BarOrdLin ;
   private short AV9AlbRGrm2 ;
   private short AV8AlbRAnc ;
   private short A4920AlbRGrm2 ;
   private short A4921AlbRAnc ;
   private short A761ProFasLin ;
   private short A194BarOrdLin ;
   private short A217BarTipArt ;
   private short A127BarAncCru1 ;
   private short A128BarAncCru2 ;
   private short A125BarAncAca1 ;
   private short A126BarAncAca2 ;
   private short A226BarTraP3 ;
   private short A225BarTraP2 ;
   private short A224BarTraP1 ;
   private short A234BarUrdP3 ;
   private short A233BarUrdP2 ;
   private short A232BarUrdP1 ;
   private short A864BarPes ;
   private short A1909BarGraAca ;
   private short A3137BarGraAca2 ;
   private short A1226BarGraCru ;
   private short AV15BarTipArt ;
   private short A4034CCTLin ;
   private short GXv_int7[] ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int AV23Discod ;
   private int GX_I ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A4031CCTCod ;
   private int A4032CCOpeCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A652OpeCod ;
   private int GXv_int6[] ;
   private int GX_J ;
   private long AV27I ;
   private long GXv_int5[] ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV18CCTarc ;
   private String Gx_mode ;
   private String AV32Nombre ;
   private String AV54vCharUlt ;
   private String AV75PathModelos ;
   private String AV71vDirDest ;
   private String scmdbuf ;
   private String A313ContCod ;
   private String A7208ContDsc2 ;
   private String A14173ContATCod ;
   private String AV33NombreDesc ;
   private String AV81Pgmname ;
   private String AV25Funcion[][] ;
   private String AV40ParNom[][] ;
   private String AV41ParTpo[][] ;
   private String A212BarSer ;
   private String AV49TabLot[] ;
   private String AV50TabTel[] ;
   private String A6463AlbRLote ;
   private String A6464AlbRTelar ;
   private String A200BarPieCod ;
   private String AV43Procod ;
   private String A758ProCod ;
   private String A279CliNom ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A223BarTra3 ;
   private String A222BarTra2 ;
   private String A221BarTra1 ;
   private String A231BarUrd3 ;
   private String A230BarUrd2 ;
   private String A229BarUrd1 ;
   private String A2454BarGirar ;
   private String A1234BarNomCli ;
   private String A5406BarAntpT ;
   private String A4609BarMdlCod ;
   private String AV38Openom ;
   private String A653OpeNom ;
   private String AV42Prg ;
   private String AV44Str ;
   private String AV51TipArtDsc ;
   private String A4047CCTLinVarW ;
   private String A4035CCVal ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV52txt2 ;
   private String A830TipArtDsc ;
   private String A377DisObsTxt ;
   private java.util.Date A4033CCFch ;
   private boolean n14173ContATCod ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private boolean n252CliCod ;
   private boolean n4032CCOpeCod ;
   private boolean n217BarTipArt ;
   private boolean n4033CCFch ;
   private boolean n3281CcObs ;
   private boolean n653OpeNom ;
   private boolean n830TipArtDsc ;
   private String AV53TxtXML ;
   private String AV67vTxtXmlC1 ;
   private String AV22DirectoryZip ;
   private String AV35NombreZip ;
   private String AV29Logs ;
   private String AV34NombreXML ;
   private String A3281CcObs ;
   private String AV37Obs ;
   private com.genexus.util.GXFile AV55vFile ;
   private com.genexus.util.GXFile AV56vFileOrigen ;
   private com.genexus.util.GXFile AV61vFileZip ;
   private com.genexus.util.GXFile AV58vFileXML ;
   private com.genexus.util.GXFile AV57vFileWrite ;
   private com.genexus.util.GXDirectory AV72DirectoryDest ;
   private app.SdtAppTool AV12AppTool ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ARI2_A396EmprCod ;
   private String[] P0ARI2_A313ContCod ;
   private String[] P0ARI2_A7208ContDsc2 ;
   private String[] P0ARI2_A14173ContATCod ;
   private boolean[] P0ARI2_n14173ContATCod ;
   private String[] P0ARI3_A396EmprCod ;
   private int[] P0ARI3_A129BarCod ;
   private byte[] P0ARI3_A132BarCodReo ;
   private String[] P0ARI3_A130BarCodPar ;
   private String[] P0ARI3_A212BarSer ;
   private int[] P0ARI3_A361DisCod ;
   private int[] P0ARI4_A44AlbRecCod ;
   private String[] P0ARI4_A396EmprCod ;
   private int[] P0ARI4_A129BarCod ;
   private byte[] P0ARI4_A132BarCodReo ;
   private String[] P0ARI4_A130BarCodPar ;
   private short[] P0ARI4_A4920AlbRGrm2 ;
   private short[] P0ARI4_A4921AlbRAnc ;
   private String[] P0ARI4_A6463AlbRLote ;
   private String[] P0ARI4_A6464AlbRTelar ;
   private String[] P0ARI4_A200BarPieCod ;
   private String[] P0ARI5_A396EmprCod ;
   private int[] P0ARI5_A129BarCod ;
   private byte[] P0ARI5_A132BarCodReo ;
   private String[] P0ARI5_A130BarCodPar ;
   private short[] P0ARI5_A761ProFasLin ;
   private boolean[] P0ARI5_n761ProFasLin ;
   private String[] P0ARI5_A758ProCod ;
   private int[] P0ARI7_A252CliCod ;
   private boolean[] P0ARI7_n252CliCod ;
   private String[] P0ARI7_A396EmprCod ;
   private int[] P0ARI7_A129BarCod ;
   private byte[] P0ARI7_A132BarCodReo ;
   private String[] P0ARI7_A130BarCodPar ;
   private String[] P0ARI7_A758ProCod ;
   private int[] P0ARI7_A4031CCTCod ;
   private short[] P0ARI7_A194BarOrdLin ;
   private int[] P0ARI7_A4032CCOpeCod ;
   private boolean[] P0ARI7_n4032CCOpeCod ;
   private short[] P0ARI7_A217BarTipArt ;
   private boolean[] P0ARI7_n217BarTipArt ;
   private java.util.Date[] P0ARI7_A4033CCFch ;
   private boolean[] P0ARI7_n4033CCFch ;
   private String[] P0ARI7_A3281CcObs ;
   private boolean[] P0ARI7_n3281CcObs ;
   private String[] P0ARI7_A279CliNom ;
   private String[] P0ARI7_A212BarSer ;
   private String[] P0ARI7_A4812BarEncCli ;
   private String[] P0ARI7_A143BarDisNum ;
   private String[] P0ARI7_A135BarColNom ;
   private int[] P0ARI7_A136BarColNum ;
   private String[] P0ARI7_A1652BarSerDsc ;
   private short[] P0ARI7_A127BarAncCru1 ;
   private short[] P0ARI7_A128BarAncCru2 ;
   private short[] P0ARI7_A125BarAncAca1 ;
   private short[] P0ARI7_A126BarAncAca2 ;
   private short[] P0ARI7_A226BarTraP3 ;
   private short[] P0ARI7_A225BarTraP2 ;
   private short[] P0ARI7_A224BarTraP1 ;
   private String[] P0ARI7_A223BarTra3 ;
   private String[] P0ARI7_A222BarTra2 ;
   private String[] P0ARI7_A221BarTra1 ;
   private short[] P0ARI7_A234BarUrdP3 ;
   private short[] P0ARI7_A233BarUrdP2 ;
   private short[] P0ARI7_A232BarUrdP1 ;
   private String[] P0ARI7_A231BarUrd3 ;
   private String[] P0ARI7_A230BarUrd2 ;
   private String[] P0ARI7_A229BarUrd1 ;
   private short[] P0ARI7_A864BarPes ;
   private short[] P0ARI7_A1909BarGraAca ;
   private String[] P0ARI7_A2454BarGirar ;
   private String[] P0ARI7_A1234BarNomCli ;
   private int[] P0ARI7_A1235BarNumCli ;
   private short[] P0ARI7_A3137BarGraAca2 ;
   private java.math.BigDecimal[] P0ARI7_A1224BarEncAnh ;
   private java.math.BigDecimal[] P0ARI7_A1223BarEncCom ;
   private short[] P0ARI7_A1226BarGraCru ;
   private String[] P0ARI7_A5406BarAntpT ;
   private String[] P0ARI7_A4609BarMdlCod ;
   private java.math.BigDecimal[] P0ARI7_A166BarKgm ;
   private java.math.BigDecimal[] P0ARI7_A184BarMtr ;
   private String[] P0ARI8_A396EmprCod ;
   private int[] P0ARI8_A652OpeCod ;
   private String[] P0ARI8_A653OpeNom ;
   private boolean[] P0ARI8_n653OpeNom ;
   private String[] P0ARI9_A396EmprCod ;
   private int[] P0ARI9_A129BarCod ;
   private byte[] P0ARI9_A132BarCodReo ;
   private String[] P0ARI9_A130BarCodPar ;
   private String[] P0ARI9_A758ProCod ;
   private short[] P0ARI9_A194BarOrdLin ;
   private int[] P0ARI9_A4031CCTCod ;
   private String[] P0ARI9_A4047CCTLinVarW ;
   private String[] P0ARI9_A4035CCVal ;
   private short[] P0ARI9_A4034CCTLin ;
   private String[] P0ARI10_A396EmprCod ;
   private short[] P0ARI10_A829TipArtCod ;
   private String[] P0ARI10_A830TipArtDsc ;
   private boolean[] P0ARI10_n830TipArtDsc ;
   private String[] P0ARI11_A396EmprCod ;
   private int[] P0ARI11_A361DisCod ;
   private String[] P0ARI11_A377DisObsTxt ;
   private byte[] P0ARI11_A376DisObsLin ;
}

final  class pccpolnxml__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ARI7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short A194BarOrdLin ,
                                          short  AV48Tab_orden[] ,
                                          byte AV70nOrd ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[4];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T2.CliCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.CCTCod, T1.BarOrdLin, T1.CCOpeCod, T2.BarTipArt, T1.CCFch, T1.CcObs, T3.CliNom," ;
      scmdbuf += " T2.BarSer, T2.BarEncCli, T2.BarDisNum, T2.BarColNom, T2.BarColNum, T2.BarSerDsc, T2.BarAncCru1, T2.BarAncCru2, T2.BarAncAca1, T2.BarAncAca2, T2.BarTraP3, T2.BarTraP2," ;
      scmdbuf += " T2.BarTraP1, T2.BarTra3, T2.BarTra2, T2.BarTra1, T2.BarUrdP3, T2.BarUrdP2, T2.BarUrdP1, T2.BarUrd3, T2.BarUrd2, T2.BarUrd1, T2.BarPes, T2.BarGraAca, T2.BarGirar," ;
      scmdbuf += " T2.BarNomCli, T2.BarNumCli, T2.BarGraAca2, T2.BarEncAnh, T2.BarEncCom, T2.BarGraCru, T2.BarAntpT, T2.BarMdlCod, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T4.BarMtr," ;
      scmdbuf += " 0) AS BarMtr FROM (((TXPCC T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( AV70nOrd > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV48Tab_orden, "T1.BarOrdLin IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 4 :
                  return conditional_P0ARI7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (short[])dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ARI2", "SELECT EmprCod, ContCod, ContDsc2, ContATCod FROM TXPEMPLIN WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ARI3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSer, DisCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ARI4", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbRGrm2, T2.AlbRAnc, T2.AlbRLote, T2.AlbRTelar, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ARI5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ARI7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ARI8", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ARI9", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T2.CCTLinVarW, T1.CCVal, T1.CCTLin FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.CCTCod = ?) AND (UPPER(RTRIM(LTRIM(T2.CCTLinVarW))) = UPPER(RTRIM(LTRIM(?)))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ARI10", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ARI11", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 30);
               ((String[]) buf[18])[0] = rslt.getString(14, 16);
               ((String[]) buf[19])[0] = rslt.getString(15, 20);
               ((String[]) buf[20])[0] = rslt.getString(16, 8);
               ((String[]) buf[21])[0] = rslt.getString(17, 13);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 26);
               ((short[]) buf[24])[0] = rslt.getShort(20);
               ((short[]) buf[25])[0] = rslt.getShort(21);
               ((short[]) buf[26])[0] = rslt.getShort(22);
               ((short[]) buf[27])[0] = rslt.getShort(23);
               ((short[]) buf[28])[0] = rslt.getShort(24);
               ((short[]) buf[29])[0] = rslt.getShort(25);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((String[]) buf[31])[0] = rslt.getString(27, 4);
               ((String[]) buf[32])[0] = rslt.getString(28, 4);
               ((String[]) buf[33])[0] = rslt.getString(29, 4);
               ((short[]) buf[34])[0] = rslt.getShort(30);
               ((short[]) buf[35])[0] = rslt.getShort(31);
               ((short[]) buf[36])[0] = rslt.getShort(32);
               ((String[]) buf[37])[0] = rslt.getString(33, 4);
               ((String[]) buf[38])[0] = rslt.getString(34, 4);
               ((String[]) buf[39])[0] = rslt.getString(35, 4);
               ((short[]) buf[40])[0] = rslt.getShort(36);
               ((short[]) buf[41])[0] = rslt.getShort(37);
               ((String[]) buf[42])[0] = rslt.getString(38, 20);
               ((String[]) buf[43])[0] = rslt.getString(39, 13);
               ((int[]) buf[44])[0] = rslt.getInt(40);
               ((short[]) buf[45])[0] = rslt.getShort(41);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(42,2);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(43,2);
               ((short[]) buf[48])[0] = rslt.getShort(44);
               ((String[]) buf[49])[0] = rslt.getString(45, 1);
               ((String[]) buf[50])[0] = rslt.getString(46, 13);
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(47,2);
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(48,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 32);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[6]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 1);
               }
               return;
            case 5 :
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 100);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

