package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccpolnwd extends GXProcedure
{
   public pccpolnwd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccpolnwd.class ), "" );
   }

   public pccpolnwd( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short[] executeUdp( String[] aP0 ,
                              int[] aP1 ,
                              byte[] aP2 ,
                              String[] aP3 ,
                              String[] aP4 )
   {
      AV60Tab_orden = new short[200] ;
      execute_int(aP0, aP1, aP2, aP3, aP4, AV60Tab_orden);
      return AV60Tab_orden;
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] AV60Tab_orden )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, AV60Tab_orden);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] AV60Tab_orden )
   {
      pccpolnwd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pccpolnwd.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pccpolnwd.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pccpolnwd.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pccpolnwd.this.AV54CCTarc = aP4[0];
      this.aP4 = aP4;
      pccpolnwd.this.AV60Tab_orden = AV60Tab_orden;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ! (GXutil.strcmp("", AV54CCTarc)==0) )
      {
         AV37Nombre = "" ;
         GXt_char1 = AV37Nombre ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "CCTDIR", "") ;
         GXv_char4[0] = GXt_char1 ;
         new app.pexicond(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
         pccpolnwd.this.A396EmprCod = GXv_char2[0] ;
         pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
         AV37Nombre = GXt_char1 ;
         AV37Nombre = GXutil.trim( AV37Nombre) ;
         AV78vCharUlt = GXutil.substring( AV37Nombre, GXutil.len( AV37Nombre), 1) ;
         if ( GXutil.strcmp(AV78vCharUlt, "\\") != 0 )
         {
            AV37Nombre += "\\" ;
         }
         if ( ! (0==AV52BarOrdLin) )
         {
            AV37Nombre += GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 10, 0)), (short)(8), "0") + GXutil.padl( GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)), (short)(1), "0") + GXutil.padl( GXutil.trim( A130BarCodPar), (short)(1), "_") + GXutil.padl( GXutil.trim( GXutil.str( AV52BarOrdLin, 10, 0)), (short)(4), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV53CCTCod, 10, 0)), (short)(6), "0") + httpContext.getMessage( ".DOC", "") ;
         }
         else
         {
            AV37Nombre += GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 10, 0)), (short)(8), "0") + GXutil.padl( GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)), (short)(1), "0") + GXutil.padl( GXutil.trim( A130BarCodPar), (short)(1), "_") + httpContext.getMessage( ".DOC", "") ;
         }
         AV75vFile.setSource( AV37Nombre );
         if ( AV75vFile.exists() )
         {
            AV75vFile.delete();
         }
         AV76vFileOrigen.setSource( AV54CCTarc );
         if ( AV76vFileOrigen.exists() )
         {
            AV76vFileOrigen.copy(AV37Nombre);
         }
         AV70Documento.Open(AV37Nombre);
         AV70Documento.Show();
         AV58AlbRGrm2 = (short)(0) ;
         AV59AlbRAnc = (short)(0) ;
         /* Using cursor P04802 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A212BarSer = P04802_A212BarSer[0] ;
            A361DisCod = P04802_A361DisCod[0] ;
            AV62Discod = A361DisCod ;
            /* Execute user subroutine: 'OBSERV' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV67Nr = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 5 )
            {
               AV68TabLot[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 5 )
            {
               AV69TabTel[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P04803 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A44AlbRecCod = P04803_A44AlbRecCod[0] ;
               A4920AlbRGrm2 = P04803_A4920AlbRGrm2[0] ;
               A4921AlbRAnc = P04803_A4921AlbRAnc[0] ;
               A6463AlbRLote = P04803_A6463AlbRLote[0] ;
               A6464AlbRTelar = P04803_A6464AlbRTelar[0] ;
               A200BarPieCod = P04803_A200BarPieCod[0] ;
               A4920AlbRGrm2 = P04803_A4920AlbRGrm2[0] ;
               A4921AlbRAnc = P04803_A4921AlbRAnc[0] ;
               A6463AlbRLote = P04803_A6463AlbRLote[0] ;
               A6464AlbRTelar = P04803_A6464AlbRTelar[0] ;
               AV58AlbRGrm2 = A4920AlbRGrm2 ;
               AV59AlbRAnc = A4921AlbRAnc ;
               if ( AV67Nr <= 5 )
               {
                  AV68TabLot[AV67Nr-1] = A6463AlbRLote ;
                  AV69TabTel[AV67Nr-1] = A6464AlbRTelar ;
               }
               AV67Nr = (byte)(AV67Nr+1) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV72Procod = "" ;
            /* Using cursor P04804 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A761ProFasLin = P04804_A761ProFasLin[0] ;
               n761ProFasLin = P04804_n761ProFasLin[0] ;
               A758ProCod = P04804_A758ProCod[0] ;
               AV72Procod = A758ProCod ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         pr_default.dynParam(3, new Object[]{ new Object[]{
                                              Short.valueOf(A194BarOrdLin) ,
                                              AV60Tab_orden ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.ARRAY | TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         /* Using cursor P04806 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A252CliCod = P04806_A252CliCod[0] ;
            n252CliCod = P04806_n252CliCod[0] ;
            A758ProCod = P04806_A758ProCod[0] ;
            A194BarOrdLin = P04806_A194BarOrdLin[0] ;
            A4031CCTCod = P04806_A4031CCTCod[0] ;
            A4032CCOpeCod = P04806_A4032CCOpeCod[0] ;
            n4032CCOpeCod = P04806_n4032CCOpeCod[0] ;
            A217BarTipArt = P04806_A217BarTipArt[0] ;
            n217BarTipArt = P04806_n217BarTipArt[0] ;
            A4033CCFch = P04806_A4033CCFch[0] ;
            n4033CCFch = P04806_n4033CCFch[0] ;
            A3281CcObs = P04806_A3281CcObs[0] ;
            n3281CcObs = P04806_n3281CcObs[0] ;
            A279CliNom = P04806_A279CliNom[0] ;
            A212BarSer = P04806_A212BarSer[0] ;
            A4812BarEncCli = P04806_A4812BarEncCli[0] ;
            A143BarDisNum = P04806_A143BarDisNum[0] ;
            A135BarColNom = P04806_A135BarColNom[0] ;
            A136BarColNum = P04806_A136BarColNum[0] ;
            A1652BarSerDsc = P04806_A1652BarSerDsc[0] ;
            A127BarAncCru1 = P04806_A127BarAncCru1[0] ;
            A128BarAncCru2 = P04806_A128BarAncCru2[0] ;
            A125BarAncAca1 = P04806_A125BarAncAca1[0] ;
            A126BarAncAca2 = P04806_A126BarAncAca2[0] ;
            A226BarTraP3 = P04806_A226BarTraP3[0] ;
            A225BarTraP2 = P04806_A225BarTraP2[0] ;
            A224BarTraP1 = P04806_A224BarTraP1[0] ;
            A223BarTra3 = P04806_A223BarTra3[0] ;
            A222BarTra2 = P04806_A222BarTra2[0] ;
            A221BarTra1 = P04806_A221BarTra1[0] ;
            A234BarUrdP3 = P04806_A234BarUrdP3[0] ;
            A233BarUrdP2 = P04806_A233BarUrdP2[0] ;
            A232BarUrdP1 = P04806_A232BarUrdP1[0] ;
            A231BarUrd3 = P04806_A231BarUrd3[0] ;
            A230BarUrd2 = P04806_A230BarUrd2[0] ;
            A229BarUrd1 = P04806_A229BarUrd1[0] ;
            A864BarPes = P04806_A864BarPes[0] ;
            A1909BarGraAca = P04806_A1909BarGraAca[0] ;
            A2454BarGirar = P04806_A2454BarGirar[0] ;
            A1234BarNomCli = P04806_A1234BarNomCli[0] ;
            A1235BarNumCli = P04806_A1235BarNumCli[0] ;
            A3137BarGraAca2 = P04806_A3137BarGraAca2[0] ;
            A1224BarEncAnh = P04806_A1224BarEncAnh[0] ;
            A1223BarEncCom = P04806_A1223BarEncCom[0] ;
            A1226BarGraCru = P04806_A1226BarGraCru[0] ;
            A5406BarAntpT = P04806_A5406BarAntpT[0] ;
            A4609BarMdlCod = P04806_A4609BarMdlCod[0] ;
            A166BarKgm = P04806_A166BarKgm[0] ;
            A184BarMtr = P04806_A184BarMtr[0] ;
            A252CliCod = P04806_A252CliCod[0] ;
            n252CliCod = P04806_n252CliCod[0] ;
            A217BarTipArt = P04806_A217BarTipArt[0] ;
            n217BarTipArt = P04806_n217BarTipArt[0] ;
            A212BarSer = P04806_A212BarSer[0] ;
            A4812BarEncCli = P04806_A4812BarEncCli[0] ;
            A143BarDisNum = P04806_A143BarDisNum[0] ;
            A135BarColNom = P04806_A135BarColNom[0] ;
            A136BarColNum = P04806_A136BarColNum[0] ;
            A1652BarSerDsc = P04806_A1652BarSerDsc[0] ;
            A127BarAncCru1 = P04806_A127BarAncCru1[0] ;
            A128BarAncCru2 = P04806_A128BarAncCru2[0] ;
            A125BarAncAca1 = P04806_A125BarAncAca1[0] ;
            A126BarAncAca2 = P04806_A126BarAncAca2[0] ;
            A226BarTraP3 = P04806_A226BarTraP3[0] ;
            A225BarTraP2 = P04806_A225BarTraP2[0] ;
            A224BarTraP1 = P04806_A224BarTraP1[0] ;
            A223BarTra3 = P04806_A223BarTra3[0] ;
            A222BarTra2 = P04806_A222BarTra2[0] ;
            A221BarTra1 = P04806_A221BarTra1[0] ;
            A234BarUrdP3 = P04806_A234BarUrdP3[0] ;
            A233BarUrdP2 = P04806_A233BarUrdP2[0] ;
            A232BarUrdP1 = P04806_A232BarUrdP1[0] ;
            A231BarUrd3 = P04806_A231BarUrd3[0] ;
            A230BarUrd2 = P04806_A230BarUrd2[0] ;
            A229BarUrd1 = P04806_A229BarUrd1[0] ;
            A864BarPes = P04806_A864BarPes[0] ;
            A1909BarGraAca = P04806_A1909BarGraAca[0] ;
            A2454BarGirar = P04806_A2454BarGirar[0] ;
            A1234BarNomCli = P04806_A1234BarNomCli[0] ;
            A1235BarNumCli = P04806_A1235BarNumCli[0] ;
            A3137BarGraAca2 = P04806_A3137BarGraAca2[0] ;
            A1224BarEncAnh = P04806_A1224BarEncAnh[0] ;
            A1223BarEncCom = P04806_A1223BarEncCom[0] ;
            A1226BarGraCru = P04806_A1226BarGraCru[0] ;
            A5406BarAntpT = P04806_A5406BarAntpT[0] ;
            A4609BarMdlCod = P04806_A4609BarMdlCod[0] ;
            A279CliNom = P04806_A279CliNom[0] ;
            A166BarKgm = P04806_A166BarKgm[0] ;
            A184BarMtr = P04806_A184BarMtr[0] ;
            AV61Openom = " " ;
            /* Using cursor P04807 */
            pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n4032CCOpeCod), Integer.valueOf(A4032CCOpeCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A652OpeCod = P04807_A652OpeCod[0] ;
               A653OpeNom = P04807_A653OpeNom[0] ;
               n653OpeNom = P04807_n653OpeNom[0] ;
               AV61Openom = A653OpeNom ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(4);
            AV55BarTipArt = A217BarTipArt ;
            /* Execute user subroutine: 'TIPART' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(3);
               pr_default.close(3);
               pr_default.close(3);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV40Txt = AV70Documento.getText() ;
            GXv_char4[0] = AV40Txt ;
            GXv_int5[0] = AV41Max ;
            new app.controlcalidadhtd.pccpolfunproc(remoteHandle, context).execute( GXv_char4, GXv_int5, AV33Funcion, AV34ParNom, AV35ParTpo) ;
            pccpolnwd.this.AV40Txt = GXv_char4[0] ;
            pccpolnwd.this.AV41Max = (byte)((byte)(GXv_int5[0])) ;
            AV42Cont = (byte)(1) ;
            while ( AV42Cont <= AV41Max )
            {
               AV44Prg = AV33Funcion[AV42Cont-1][1-1] ;
               if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "FECHA", "")) == 0 )
               {
                  AV73vFrm = (byte)(GXutil.lval( AV34ParNom[AV42Cont-1][1-1])) ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolfchstr(remoteHandle, context).execute( A4033CCFch, AV73vFrm, GXv_char4) ;
                  pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
                  GXv_char4[0] = AV49Str ;
                  new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( AV49Str, AV73vFrm, GXv_char4) ;
                  pccpolnwd.this.AV49Str = GXv_char4[0] ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "OBSERVACIONES", "")) == 0 )
               {
                  AV51N = (byte)(GXutil.gxmlines( A3281CcObs, (short)(100))) ;
                  AV47I = 1 ;
                  AV49Str = "" ;
                  while ( AV47I <= AV51N )
                  {
                     AV49Str += GXutil.gxgetmli( A3281CcObs, (short)(AV47I), (short)(100)) ;
                     AV47I = (long)(AV47I+1) ;
                  }
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "OPERARIO", "")) == 0 )
               {
                  AV49Str = GXutil.trim( AV61Openom) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "CLIENTE", "")) == 0 )
               {
                  AV73vFrm = (byte)(GXutil.lval( AV34ParNom[AV42Cont-1][1-1])) ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( A279CliNom, AV73vFrm, GXv_char4) ;
                  pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "SERIE", "")) == 0 )
               {
                  AV49Str = GXutil.trim( A212BarSer) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "DISPCLI", "")) == 0 )
               {
                  AV73vFrm = (byte)(GXutil.lval( AV34ParNom[AV42Cont-1][1-1])) ;
                  if ( (GXutil.strcmp("", A4812BarEncCli)==0) )
                  {
                     GXt_char1 = AV49Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( A143BarDisNum, AV73vFrm, GXv_char4) ;
                     pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                     AV49Str = GXt_char1 ;
                  }
                  else
                  {
                     GXt_char1 = AV49Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( A4812BarEncCli, AV73vFrm, GXv_char4) ;
                     pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                     AV49Str = GXt_char1 ;
                  }
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "HDR", "")) == 0 )
               {
                  AV49Str = GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 10, 0)), (short)(8), "0") + GXutil.padl( GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)), (short)(1), "0") + GXutil.padl( GXutil.trim( A130BarCodPar), (short)(1), "_") ;
                  AV73vFrm = (byte)(GXutil.lval( AV34ParNom[AV42Cont-1][1-1])) ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( AV49Str, AV73vFrm, GXv_char4) ;
                  pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "COLOR", "")) == 0 )
               {
                  AV49Str = GXutil.trim( A135BarColNom) + " " ;
                  AV73vFrm = (byte)(GXutil.lval( AV34ParNom[AV42Cont-1][1-1])) ;
                  AV77vFrm2 = (byte)(GXutil.lval( AV34ParNom[AV42Cont-1][2-1])) ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A136BarColNum, 3, 0, AV77vFrm2, GXv_char4) ;
                  pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str += GXt_char1 ;
                  GXv_char4[0] = AV49Str ;
                  new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( AV49Str, AV73vFrm, GXv_char4) ;
                  pccpolnwd.this.AV49Str = GXv_char4[0] ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "TIPART", "")) == 0 )
               {
                  AV49Str = GXutil.trim( AV56TipArtDsc) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "SERDSC", "")) == 0 )
               {
                  AV49Str = GXutil.trim( A1652BarSerDsc) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "COLNUM", "")) == 0 )
               {
                  AV49Str = GXutil.trim( A135BarColNom) ;
                  if ( A136BarColNum > 0 )
                  {
                     AV49Str = GXutil.trim( A135BarColNom) + " " + GXutil.str( A136BarColNum, 6, 0) ;
                  }
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "HDR2", "")) == 0 )
               {
                  AV49Str = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "ANCHO", "")) == 0 )
               {
                  AV77vFrm2 = (byte)(GXutil.lval( AV34ParNom[AV42Cont-1][2-1])) ;
                  if ( GXutil.strcmp(AV34ParNom[AV42Cont-1][1-1], "1") == 0 )
                  {
                     GXt_char1 = AV49Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A127BarAncCru1, 3, 0, AV77vFrm2, GXv_char4) ;
                     pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                     AV49Str = GXt_char1 ;
                  }
                  else if ( GXutil.strcmp(AV34ParNom[AV42Cont-1][1-1], "2") == 0 )
                  {
                     GXt_char1 = AV49Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A128BarAncCru2, 3, 0, AV77vFrm2, GXv_char4) ;
                     pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                     AV49Str = GXt_char1 ;
                  }
                  else if ( GXutil.strcmp(AV34ParNom[AV42Cont-1][1-1], "3") == 0 )
                  {
                     GXt_char1 = AV49Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A125BarAncAca1, 3, 0, AV77vFrm2, GXv_char4) ;
                     pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                     AV49Str = GXt_char1 ;
                  }
                  else if ( GXutil.strcmp(AV34ParNom[AV42Cont-1][1-1], "4") == 0 )
                  {
                     GXt_char1 = AV49Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A126BarAncAca2, 3, 0, AV77vFrm2, GXv_char4) ;
                     pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                     AV49Str = GXt_char1 ;
                  }
                  else if ( GXutil.strcmp(AV34ParNom[AV42Cont-1][1-1], "5") == 0 )
                  {
                     AV49Str = httpContext.getMessage( "OPCION NO VALIDA", "") ;
                  }
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "COMPOSICION", "")) == 0 )
               {
                  if ( GXutil.strcmp(AV34ParNom[AV42Cont-1][1-1], "1") == 0 )
                  {
                     AV49Str = "" ;
                     if ( ! ( (GXutil.strcmp("", A221BarTra1)==0) && (GXutil.strcmp("", A222BarTra2)==0) && (GXutil.strcmp("", A223BarTra3)==0) && (0==A224BarTraP1) && (0==A225BarTraP2) && (0==A226BarTraP3) ) )
                     {
                        AV49Str = httpContext.getMessage( "Trama : ", "") ;
                        if ( ! ( (GXutil.strcmp("", A221BarTra1)==0) && (0==A224BarTraP1) ) )
                        {
                           AV49Str += GXutil.trim( A221BarTra1) + " " + GXutil.trim( GXutil.str( A224BarTraP1, 10, 0)) + "% " ;
                        }
                        if ( ! ( (GXutil.strcmp("", A222BarTra2)==0) && (0==A225BarTraP2) ) )
                        {
                           AV49Str += ", " + GXutil.trim( A222BarTra2) + " " + GXutil.trim( GXutil.str( A225BarTraP2, 10, 0)) + "% " ;
                        }
                        if ( ! ( (GXutil.strcmp("", A223BarTra3)==0) && (0==A226BarTraP3) ) )
                        {
                           AV49Str += ", " + GXutil.trim( A223BarTra3) + " " + GXutil.trim( GXutil.str( A226BarTraP3, 10, 0)) + "% " ;
                        }
                     }
                     if ( ! ( (GXutil.strcmp("", A229BarUrd1)==0) && (GXutil.strcmp("", A230BarUrd2)==0) && (GXutil.strcmp("", A231BarUrd3)==0) && (0==A232BarUrdP1) && (0==A233BarUrdP2) && (0==A234BarUrdP3) ) )
                     {
                        AV49Str = httpContext.getMessage( "Urdido : ", "") ;
                        if ( ! ( (GXutil.strcmp("", A229BarUrd1)==0) && (0==A232BarUrdP1) ) )
                        {
                           AV49Str += GXutil.trim( A229BarUrd1) + " " + GXutil.trim( GXutil.str( A232BarUrdP1, 10, 0)) + "% " ;
                        }
                        if ( ! ( (GXutil.strcmp("", A230BarUrd2)==0) && (0==A233BarUrdP2) ) )
                        {
                           AV49Str += ", " + GXutil.trim( A230BarUrd2) + " " + GXutil.trim( GXutil.str( A233BarUrdP2, 10, 0)) + "% " ;
                        }
                        if ( ! ( (GXutil.strcmp("", A231BarUrd3)==0) && (0==A234BarUrdP3) ) )
                        {
                           AV49Str += ", " + GXutil.trim( A231BarUrd3) + " " + GXutil.trim( GXutil.str( A234BarUrdP3, 10, 0)) + "% " ;
                        }
                     }
                  }
                  else if ( GXutil.strcmp(AV34ParNom[AV42Cont-1][1-1], "2") == 0 )
                  {
                     AV49Str = "" ;
                     if ( ! ( (GXutil.strcmp("", A221BarTra1)==0) && (0==A224BarTraP1) ) )
                     {
                        AV49Str += GXutil.trim( A221BarTra1) + " " + GXutil.trim( GXutil.str( A224BarTraP1, 10, 0)) + "% " ;
                     }
                     if ( ! ( (GXutil.strcmp("", A222BarTra2)==0) && (0==A225BarTraP2) ) )
                     {
                        AV49Str += ", " + GXutil.trim( A222BarTra2) + " " + GXutil.trim( GXutil.str( A225BarTraP2, 10, 0)) + "% " ;
                     }
                     if ( ! ( (GXutil.strcmp("", A223BarTra3)==0) && (0==A226BarTraP3) ) )
                     {
                        AV49Str += ", " + GXutil.trim( A223BarTra3) + " " + GXutil.trim( GXutil.str( A226BarTraP3, 10, 0)) + "% " ;
                     }
                     if ( ! ( (GXutil.strcmp("", A229BarUrd1)==0) && (0==A232BarUrdP1) ) )
                     {
                        AV49Str += ", " + GXutil.trim( A229BarUrd1) + " " + GXutil.trim( GXutil.str( A232BarUrdP1, 10, 0)) + "% " ;
                     }
                     if ( ! ( (GXutil.strcmp("", A230BarUrd2)==0) && (0==A233BarUrdP2) ) )
                     {
                        AV49Str += ", " + GXutil.trim( A230BarUrd2) + " " + GXutil.trim( GXutil.str( A233BarUrdP2, 10, 0)) + "% " ;
                     }
                     if ( ! ( (GXutil.strcmp("", A231BarUrd3)==0) && (0==A234BarUrdP3) ) )
                     {
                        AV49Str += ", " + GXutil.trim( A231BarUrd3) + " " + GXutil.trim( GXutil.str( A234BarUrdP3, 10, 0)) + "% " ;
                     }
                  }
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "GML", "")) == 0 )
               {
                  AV73vFrm = (byte)(GXutil.lval( AV34ParNom[AV42Cont-1][1-1])) ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A864BarPes, 4, 0, AV73vFrm, GXv_char4) ;
                  pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "GM2", "")) == 0 )
               {
                  AV73vFrm = (byte)(GXutil.lval( AV34ParNom[AV42Cont-1][1-1])) ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A1909BarGraAca, 4, 0, AV73vFrm, GXv_char4) ;
                  pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "ANCA1", "")) == 0 )
               {
                  AV73vFrm = (byte)(GXutil.lval( AV34ParNom[AV42Cont-1][1-1])) ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A125BarAncAca1, 4, 0, AV73vFrm, GXv_char4) ;
                  pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "KGS", "")) == 0 )
               {
                  AV49Str = GXutil.trim( GXutil.str( A166BarKgm, 9, 2)) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "MTS", "")) == 0 )
               {
                  AV49Str = GXutil.trim( GXutil.str( A184BarMtr, 9, 2)) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "CARTAZ", "")) == 0 )
               {
                  AV49Str = GXutil.trim( A2454BarGirar) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "COLORC", "")) == 0 )
               {
                  AV49Str = GXutil.trim( A1234BarNomCli) + " " ;
                  AV73vFrm = (byte)(GXutil.lval( AV34ParNom[AV42Cont-1][1-1])) ;
                  AV77vFrm2 = (byte)(GXutil.lval( AV34ParNom[AV42Cont-1][2-1])) ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A1235BarNumCli, 3, 0, AV77vFrm2, GXv_char4) ;
                  pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str += GXt_char1 ;
                  GXv_char4[0] = AV49Str ;
                  new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( AV49Str, AV73vFrm, GXv_char4) ;
                  pccpolnwd.this.AV49Str = GXv_char4[0] ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "GM22", "")) == 0 )
               {
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A3137BarGraAca2, 4, 0, AV73vFrm, GXv_char4) ;
                  pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "ESTA", "")) == 0 )
               {
                  AV49Str = GXutil.trim( GXutil.str( A1224BarEncAnh, 6, 2)) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "ESTC", "")) == 0 )
               {
                  AV49Str = GXutil.trim( GXutil.str( A1223BarEncCom, 6, 2)) ;
               }
               else if ( ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "GM2C", "")) == 0 ) && ( AV58AlbRGrm2 > 0 ) )
               {
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( AV58AlbRGrm2, 4, 0, AV73vFrm, GXv_char4) ;
                  pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
               }
               else if ( ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "GM2C", "")) == 0 ) && ( AV58AlbRGrm2 == 0 ) )
               {
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A1226BarGraCru, 4, 0, AV73vFrm, GXv_char4) ;
                  pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "ANCC", "")) == 0 )
               {
                  if ( AV59AlbRAnc > 0 )
                  {
                     GXt_char1 = AV49Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( AV59AlbRAnc, 4, 0, AV73vFrm, GXv_char4) ;
                     pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                     AV49Str = GXt_char1 ;
                  }
                  else
                  {
                     GXt_char1 = AV49Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A127BarAncCru1, 4, 0, AV73vFrm, GXv_char4) ;
                     pccpolnwd.this.GXt_char1 = GXv_char4[0] ;
                     AV49Str = GXt_char1 ;
                  }
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "OBSHDR", "")) == 0 )
               {
                  AV51N = (byte)(GXutil.gxmlines( AV64Obs, (short)(60))) ;
                  AV47I = 1 ;
                  AV49Str = "" ;
                  while ( AV47I <= AV51N )
                  {
                     AV49Str += GXutil.gxgetmli( AV64Obs, (short)(AV47I), (short)(60)) ;
                     AV47I = (long)(AV47I+1) ;
                  }
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "SECAGEM", "")) == 0 )
               {
                  if ( GXutil.strcmp(A5406BarAntpT, "2") == 0 )
                  {
                     AV49Str = GXutil.trim( httpContext.getMessage( "Secagem em Plano", "")) ;
                  }
                  else if ( GXutil.strcmp(A5406BarAntpT, "1") == 0 )
                  {
                     AV49Str = GXutil.trim( httpContext.getMessage( "Secagem em Tumbler", "")) ;
                  }
                  else
                  {
                     AV49Str = GXutil.trim( httpContext.getMessage( "Sem Valor", "")) ;
                  }
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "MODELO", "")) == 0 )
               {
                  AV49Str = GXutil.trim( A4609BarMdlCod) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "LOTE1", "")) == 0 )
               {
                  AV49Str = GXutil.trim( AV68TabLot[1-1]) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "LOTE2", "")) == 0 )
               {
                  AV49Str = GXutil.trim( AV68TabLot[2-1]) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "LOTE3", "")) == 0 )
               {
                  AV49Str = GXutil.trim( AV68TabLot[3-1]) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "TEAR1", "")) == 0 )
               {
                  AV49Str = GXutil.trim( AV69TabTel[1-1]) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "TEAR2", "")) == 0 )
               {
                  AV49Str = GXutil.trim( AV69TabTel[2-1]) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "TEAR3", "")) == 0 )
               {
                  AV49Str = GXutil.trim( AV69TabTel[3-1]) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "PROCESO", "")) == 0 )
               {
                  AV49Str = GXutil.trim( AV72Procod) ;
               }
               else
               {
                  AV86GXLvl354 = (byte)(0) ;
                  /* Using cursor P04808 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), AV44Prg});
                  while ( (pr_default.getStatus(5) != 101) )
                  {
                     A4047CCTLinVarW = P04808_A4047CCTLinVarW[0] ;
                     A4035CCVal = P04808_A4035CCVal[0] ;
                     A4034CCTLin = P04808_A4034CCTLin[0] ;
                     A4047CCTLinVarW = P04808_A4047CCTLinVarW[0] ;
                     AV86GXLvl354 = (byte)(1) ;
                     if ( ! (GXutil.strcmp("", A4035CCVal)==0) )
                     {
                        if ( GXutil.strcmp(AV34ParNom[AV42Cont-1][1-1], "1") == 0 )
                        {
                           GXt_char1 = AV49Str ;
                           GXv_char4[0] = A396EmprCod ;
                           GXv_int6[0] = A4031CCTCod ;
                           GXv_int7[0] = A4034CCTLin ;
                           GXv_char3[0] = A4035CCVal ;
                           GXv_char2[0] = GXt_char1 ;
                           new app.controlcalidadhtd.pccvaldsc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int7, GXv_char3, GXv_char2) ;
                           pccpolnwd.this.A396EmprCod = GXv_char4[0] ;
                           pccpolnwd.this.A4031CCTCod = GXv_int6[0] ;
                           pccpolnwd.this.A4034CCTLin = GXv_int7[0] ;
                           pccpolnwd.this.A4035CCVal = GXv_char3[0] ;
                           pccpolnwd.this.GXt_char1 = GXv_char2[0] ;
                           AV49Str = GXt_char1 ;
                        }
                        else if ( GXutil.strcmp(AV34ParNom[AV42Cont-1][1-1], "2") == 0 )
                        {
                           AV49Str = A4035CCVal ;
                        }
                        else
                        {
                           AV49Str = httpContext.getMessage( "¡¡¡ Formato incorrecto !!!", "") ;
                        }
                     }
                     else
                     {
                        AV49Str = "***" ;
                     }
                     pr_default.readNext(5);
                  }
                  pr_default.close(5);
                  if ( AV86GXLvl354 == 0 )
                  {
                     AV49Str = AV33Funcion[AV42Cont-1][2-1] ;
                  }
               }
               AV45CantSust = (long)(GXutil.Int( GXutil.len( AV49Str)/ (double) (200))) ;
               AV46StrResto = ((int)((GXutil.len( AV49Str)) % (200))) ;
               AV47I = 1 ;
               while ( AV47I <= AV45CantSust )
               {
                  AV50Inicio = (long)(((AV47I-1)*200)+1) ;
                  AV48StrAux = GXutil.substring( AV49Str, (int)(AV50Inicio), 200) ;
                  AV48StrAux += "#####" ;
                  if ( AV47I == 1 )
                  {
                     AV70Documento.Replace(AV33Funcion[AV42Cont-1][2-1], AV48StrAux, (short)(0), (short)(1));
                  }
                  else
                  {
                     AV70Documento.Replace("#####", AV48StrAux, (short)(0), (short)(1));
                  }
                  AV47I = (long)(AV47I+1) ;
               }
               AV50Inicio = (long)(((AV47I-1)*200)+1) ;
               AV48StrAux = GXutil.substring( AV49Str, (int)(AV50Inicio), (int)(AV46StrResto)) ;
               if ( AV47I == 1 )
               {
                  AV70Documento.Replace(AV33Funcion[AV42Cont-1][2-1], AV48StrAux, (short)(0), (short)(1));
               }
               else
               {
                  AV70Documento.Replace("#####", AV48StrAux, (short)(0), (short)(1));
               }
               AV42Cont = (byte)(AV42Cont+1) ;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         AV70Documento.Save();
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
      AV56TipArtDsc = GXutil.space( (short)(30)) ;
      /* Using cursor P04809 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(AV55BarTipArt)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A829TipArtCod = P04809_A829TipArtCod[0] ;
         A830TipArtDsc = P04809_A830TipArtDsc[0] ;
         n830TipArtDsc = P04809_n830TipArtDsc[0] ;
         AV56TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S121( )
   {
      /* 'OBSERV' Routine */
      returnInSub = false ;
      AV64Obs = " " ;
      /* Using cursor P048010 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV62Discod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A361DisCod = P048010_A361DisCod[0] ;
         A377DisObsTxt = P048010_A377DisObsTxt[0] ;
         A376DisObsLin = P048010_A376DisObsLin[0] ;
         if ( GXutil.strcmp(AV64Obs, "") == 0 )
         {
            AV64Obs = A377DisObsTxt + GXutil.chr( (short)(13)) ;
         }
         else
         {
            AV64Obs += A377DisObsTxt + GXutil.chr( (short)(13)) ;
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccpolnwd.this.A396EmprCod;
      this.aP1[0] = pccpolnwd.this.A129BarCod;
      this.aP2[0] = pccpolnwd.this.A132BarCodReo;
      this.aP3[0] = pccpolnwd.this.A130BarCodPar;
      this.aP4[0] = pccpolnwd.this.AV54CCTarc;
      CloseOpenCursors();
      AV70Documento.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37Nombre = "" ;
      AV78vCharUlt = "" ;
      AV75vFile = new com.genexus.util.GXFile();
      AV76vFileOrigen = new com.genexus.util.GXFile();
      AV70Documento = new com.genexus.gxoffice.WordDoc();
      scmdbuf = "" ;
      P04802_A396EmprCod = new String[] {""} ;
      P04802_A129BarCod = new int[1] ;
      P04802_A132BarCodReo = new byte[1] ;
      P04802_A130BarCodPar = new String[] {""} ;
      P04802_A212BarSer = new String[] {""} ;
      P04802_A361DisCod = new int[1] ;
      A212BarSer = "" ;
      AV68TabLot = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV68TabLot[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV69TabTel = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV69TabTel[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P04803_A44AlbRecCod = new int[1] ;
      P04803_A396EmprCod = new String[] {""} ;
      P04803_A129BarCod = new int[1] ;
      P04803_A132BarCodReo = new byte[1] ;
      P04803_A130BarCodPar = new String[] {""} ;
      P04803_A4920AlbRGrm2 = new short[1] ;
      P04803_A4921AlbRAnc = new short[1] ;
      P04803_A6463AlbRLote = new String[] {""} ;
      P04803_A6464AlbRTelar = new String[] {""} ;
      P04803_A200BarPieCod = new String[] {""} ;
      A6463AlbRLote = "" ;
      A6464AlbRTelar = "" ;
      A200BarPieCod = "" ;
      AV72Procod = "" ;
      P04804_A396EmprCod = new String[] {""} ;
      P04804_A129BarCod = new int[1] ;
      P04804_A132BarCodReo = new byte[1] ;
      P04804_A130BarCodPar = new String[] {""} ;
      P04804_A761ProFasLin = new short[1] ;
      P04804_n761ProFasLin = new boolean[] {false} ;
      P04804_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      P04806_A252CliCod = new int[1] ;
      P04806_n252CliCod = new boolean[] {false} ;
      P04806_A396EmprCod = new String[] {""} ;
      P04806_A129BarCod = new int[1] ;
      P04806_A132BarCodReo = new byte[1] ;
      P04806_A130BarCodPar = new String[] {""} ;
      P04806_A758ProCod = new String[] {""} ;
      P04806_A194BarOrdLin = new short[1] ;
      P04806_A4031CCTCod = new int[1] ;
      P04806_A4032CCOpeCod = new int[1] ;
      P04806_n4032CCOpeCod = new boolean[] {false} ;
      P04806_A217BarTipArt = new short[1] ;
      P04806_n217BarTipArt = new boolean[] {false} ;
      P04806_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      P04806_n4033CCFch = new boolean[] {false} ;
      P04806_A3281CcObs = new String[] {""} ;
      P04806_n3281CcObs = new boolean[] {false} ;
      P04806_A279CliNom = new String[] {""} ;
      P04806_A212BarSer = new String[] {""} ;
      P04806_A4812BarEncCli = new String[] {""} ;
      P04806_A143BarDisNum = new String[] {""} ;
      P04806_A135BarColNom = new String[] {""} ;
      P04806_A136BarColNum = new int[1] ;
      P04806_A1652BarSerDsc = new String[] {""} ;
      P04806_A127BarAncCru1 = new short[1] ;
      P04806_A128BarAncCru2 = new short[1] ;
      P04806_A125BarAncAca1 = new short[1] ;
      P04806_A126BarAncAca2 = new short[1] ;
      P04806_A226BarTraP3 = new short[1] ;
      P04806_A225BarTraP2 = new short[1] ;
      P04806_A224BarTraP1 = new short[1] ;
      P04806_A223BarTra3 = new String[] {""} ;
      P04806_A222BarTra2 = new String[] {""} ;
      P04806_A221BarTra1 = new String[] {""} ;
      P04806_A234BarUrdP3 = new short[1] ;
      P04806_A233BarUrdP2 = new short[1] ;
      P04806_A232BarUrdP1 = new short[1] ;
      P04806_A231BarUrd3 = new String[] {""} ;
      P04806_A230BarUrd2 = new String[] {""} ;
      P04806_A229BarUrd1 = new String[] {""} ;
      P04806_A864BarPes = new short[1] ;
      P04806_A1909BarGraAca = new short[1] ;
      P04806_A2454BarGirar = new String[] {""} ;
      P04806_A1234BarNomCli = new String[] {""} ;
      P04806_A1235BarNumCli = new int[1] ;
      P04806_A3137BarGraAca2 = new short[1] ;
      P04806_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04806_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04806_A1226BarGraCru = new short[1] ;
      P04806_A5406BarAntpT = new String[] {""} ;
      P04806_A4609BarMdlCod = new String[] {""} ;
      P04806_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04806_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      AV61Openom = "" ;
      P04807_A396EmprCod = new String[] {""} ;
      P04807_A652OpeCod = new int[1] ;
      P04807_A653OpeNom = new String[] {""} ;
      P04807_n653OpeNom = new boolean[] {false} ;
      A653OpeNom = "" ;
      AV40Txt = "" ;
      GXv_int5 = new long[1] ;
      AV33Funcion = new String[200][3] ;
      GX_I = 1 ;
      while ( GX_I <= 200 )
      {
         GX_J = 1 ;
         while ( GX_J <= 3 )
         {
            AV33Funcion[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV34ParNom = new String[200][4] ;
      GX_I = 1 ;
      while ( GX_I <= 200 )
      {
         GX_J = 1 ;
         while ( GX_J <= 4 )
         {
            AV34ParNom[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV35ParTpo = new String[200][4] ;
      GX_I = 1 ;
      while ( GX_I <= 200 )
      {
         GX_J = 1 ;
         while ( GX_J <= 4 )
         {
            AV35ParTpo[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV44Prg = "" ;
      AV49Str = "" ;
      AV56TipArtDsc = "" ;
      AV64Obs = "" ;
      P04808_A396EmprCod = new String[] {""} ;
      P04808_A129BarCod = new int[1] ;
      P04808_A132BarCodReo = new byte[1] ;
      P04808_A130BarCodPar = new String[] {""} ;
      P04808_A758ProCod = new String[] {""} ;
      P04808_A194BarOrdLin = new short[1] ;
      P04808_A4031CCTCod = new int[1] ;
      P04808_A4047CCTLinVarW = new String[] {""} ;
      P04808_A4035CCVal = new String[] {""} ;
      P04808_A4034CCTLin = new short[1] ;
      A4047CCTLinVarW = "" ;
      A4035CCVal = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV48StrAux = "" ;
      P04809_A396EmprCod = new String[] {""} ;
      P04809_A829TipArtCod = new short[1] ;
      P04809_A830TipArtDsc = new String[] {""} ;
      P04809_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      P048010_A396EmprCod = new String[] {""} ;
      P048010_A361DisCod = new int[1] ;
      P048010_A377DisObsTxt = new String[] {""} ;
      P048010_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.pccpolnwd__default(),
         new Object[] {
             new Object[] {
            P04802_A396EmprCod, P04802_A129BarCod, P04802_A132BarCodReo, P04802_A130BarCodPar, P04802_A212BarSer, P04802_A361DisCod
            }
            , new Object[] {
            P04803_A44AlbRecCod, P04803_A396EmprCod, P04803_A129BarCod, P04803_A132BarCodReo, P04803_A130BarCodPar, P04803_A4920AlbRGrm2, P04803_A4921AlbRAnc, P04803_A6463AlbRLote, P04803_A6464AlbRTelar, P04803_A200BarPieCod
            }
            , new Object[] {
            P04804_A396EmprCod, P04804_A129BarCod, P04804_A132BarCodReo, P04804_A130BarCodPar, P04804_A761ProFasLin, P04804_n761ProFasLin, P04804_A758ProCod
            }
            , new Object[] {
            P04806_A252CliCod, P04806_n252CliCod, P04806_A396EmprCod, P04806_A129BarCod, P04806_A132BarCodReo, P04806_A130BarCodPar, P04806_A758ProCod, P04806_A194BarOrdLin, P04806_A4031CCTCod, P04806_A4032CCOpeCod,
            P04806_n4032CCOpeCod, P04806_A217BarTipArt, P04806_n217BarTipArt, P04806_A4033CCFch, P04806_n4033CCFch, P04806_A3281CcObs, P04806_n3281CcObs, P04806_A279CliNom, P04806_A212BarSer, P04806_A4812BarEncCli,
            P04806_A143BarDisNum, P04806_A135BarColNom, P04806_A136BarColNum, P04806_A1652BarSerDsc, P04806_A127BarAncCru1, P04806_A128BarAncCru2, P04806_A125BarAncAca1, P04806_A126BarAncAca2, P04806_A226BarTraP3, P04806_A225BarTraP2,
            P04806_A224BarTraP1, P04806_A223BarTra3, P04806_A222BarTra2, P04806_A221BarTra1, P04806_A234BarUrdP3, P04806_A233BarUrdP2, P04806_A232BarUrdP1, P04806_A231BarUrd3, P04806_A230BarUrd2, P04806_A229BarUrd1,
            P04806_A864BarPes, P04806_A1909BarGraAca, P04806_A2454BarGirar, P04806_A1234BarNomCli, P04806_A1235BarNumCli, P04806_A3137BarGraAca2, P04806_A1224BarEncAnh, P04806_A1223BarEncCom, P04806_A1226BarGraCru, P04806_A5406BarAntpT,
            P04806_A4609BarMdlCod, P04806_A166BarKgm, P04806_A184BarMtr
            }
            , new Object[] {
            P04807_A396EmprCod, P04807_A652OpeCod, P04807_A653OpeNom, P04807_n653OpeNom
            }
            , new Object[] {
            P04808_A396EmprCod, P04808_A129BarCod, P04808_A132BarCodReo, P04808_A130BarCodPar, P04808_A758ProCod, P04808_A194BarOrdLin, P04808_A4031CCTCod, P04808_A4047CCTLinVarW, P04808_A4035CCVal, P04808_A4034CCTLin
            }
            , new Object[] {
            P04809_A396EmprCod, P04809_A829TipArtCod, P04809_A830TipArtDsc, P04809_n830TipArtDsc
            }
            , new Object[] {
            P048010_A396EmprCod, P048010_A361DisCod, P048010_A377DisObsTxt, P048010_A376DisObsLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV67Nr ;
   private byte AV41Max ;
   private byte AV42Cont ;
   private byte AV73vFrm ;
   private byte AV51N ;
   private byte AV77vFrm2 ;
   private byte AV86GXLvl354 ;
   private byte A376DisObsLin ;
   private short AV52BarOrdLin ;
   private short AV58AlbRGrm2 ;
   private short AV59AlbRAnc ;
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
   private short AV55BarTipArt ;
   private short A4034CCTLin ;
   private short GXv_int7[] ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV53CCTCod ;
   private int A361DisCod ;
   private int AV62Discod ;
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
   private long GXv_int5[] ;
   private long AV47I ;
   private long AV45CantSust ;
   private long AV46StrResto ;
   private long AV50Inicio ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV54CCTarc ;
   private String AV37Nombre ;
   private String AV78vCharUlt ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String AV68TabLot[] ;
   private String AV69TabTel[] ;
   private String A6463AlbRLote ;
   private String A6464AlbRTelar ;
   private String A200BarPieCod ;
   private String AV72Procod ;
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
   private String AV61Openom ;
   private String A653OpeNom ;
   private String AV33Funcion[][] ;
   private String AV34ParNom[][] ;
   private String AV35ParTpo[][] ;
   private String AV44Prg ;
   private String AV56TipArtDsc ;
   private String A4047CCTLinVarW ;
   private String A4035CCVal ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV48StrAux ;
   private String A830TipArtDsc ;
   private String A377DisObsTxt ;
   private java.util.Date A4033CCFch ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private boolean n252CliCod ;
   private boolean n4032CCOpeCod ;
   private boolean n217BarTipArt ;
   private boolean n4033CCFch ;
   private boolean n3281CcObs ;
   private boolean n653OpeNom ;
   private boolean n830TipArtDsc ;
   private String AV40Txt ;
   private String AV49Str ;
   private String A3281CcObs ;
   private String AV64Obs ;
   private com.genexus.util.GXFile AV75vFile ;
   private com.genexus.util.GXFile AV76vFileOrigen ;
   private short[] AV60Tab_orden ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04802_A396EmprCod ;
   private int[] P04802_A129BarCod ;
   private byte[] P04802_A132BarCodReo ;
   private String[] P04802_A130BarCodPar ;
   private String[] P04802_A212BarSer ;
   private int[] P04802_A361DisCod ;
   private int[] P04803_A44AlbRecCod ;
   private String[] P04803_A396EmprCod ;
   private int[] P04803_A129BarCod ;
   private byte[] P04803_A132BarCodReo ;
   private String[] P04803_A130BarCodPar ;
   private short[] P04803_A4920AlbRGrm2 ;
   private short[] P04803_A4921AlbRAnc ;
   private String[] P04803_A6463AlbRLote ;
   private String[] P04803_A6464AlbRTelar ;
   private String[] P04803_A200BarPieCod ;
   private String[] P04804_A396EmprCod ;
   private int[] P04804_A129BarCod ;
   private byte[] P04804_A132BarCodReo ;
   private String[] P04804_A130BarCodPar ;
   private short[] P04804_A761ProFasLin ;
   private boolean[] P04804_n761ProFasLin ;
   private String[] P04804_A758ProCod ;
   private int[] P04806_A252CliCod ;
   private boolean[] P04806_n252CliCod ;
   private String[] P04806_A396EmprCod ;
   private int[] P04806_A129BarCod ;
   private byte[] P04806_A132BarCodReo ;
   private String[] P04806_A130BarCodPar ;
   private String[] P04806_A758ProCod ;
   private short[] P04806_A194BarOrdLin ;
   private int[] P04806_A4031CCTCod ;
   private int[] P04806_A4032CCOpeCod ;
   private boolean[] P04806_n4032CCOpeCod ;
   private short[] P04806_A217BarTipArt ;
   private boolean[] P04806_n217BarTipArt ;
   private java.util.Date[] P04806_A4033CCFch ;
   private boolean[] P04806_n4033CCFch ;
   private String[] P04806_A3281CcObs ;
   private boolean[] P04806_n3281CcObs ;
   private String[] P04806_A279CliNom ;
   private String[] P04806_A212BarSer ;
   private String[] P04806_A4812BarEncCli ;
   private String[] P04806_A143BarDisNum ;
   private String[] P04806_A135BarColNom ;
   private int[] P04806_A136BarColNum ;
   private String[] P04806_A1652BarSerDsc ;
   private short[] P04806_A127BarAncCru1 ;
   private short[] P04806_A128BarAncCru2 ;
   private short[] P04806_A125BarAncAca1 ;
   private short[] P04806_A126BarAncAca2 ;
   private short[] P04806_A226BarTraP3 ;
   private short[] P04806_A225BarTraP2 ;
   private short[] P04806_A224BarTraP1 ;
   private String[] P04806_A223BarTra3 ;
   private String[] P04806_A222BarTra2 ;
   private String[] P04806_A221BarTra1 ;
   private short[] P04806_A234BarUrdP3 ;
   private short[] P04806_A233BarUrdP2 ;
   private short[] P04806_A232BarUrdP1 ;
   private String[] P04806_A231BarUrd3 ;
   private String[] P04806_A230BarUrd2 ;
   private String[] P04806_A229BarUrd1 ;
   private short[] P04806_A864BarPes ;
   private short[] P04806_A1909BarGraAca ;
   private String[] P04806_A2454BarGirar ;
   private String[] P04806_A1234BarNomCli ;
   private int[] P04806_A1235BarNumCli ;
   private short[] P04806_A3137BarGraAca2 ;
   private java.math.BigDecimal[] P04806_A1224BarEncAnh ;
   private java.math.BigDecimal[] P04806_A1223BarEncCom ;
   private short[] P04806_A1226BarGraCru ;
   private String[] P04806_A5406BarAntpT ;
   private String[] P04806_A4609BarMdlCod ;
   private java.math.BigDecimal[] P04806_A166BarKgm ;
   private java.math.BigDecimal[] P04806_A184BarMtr ;
   private String[] P04807_A396EmprCod ;
   private int[] P04807_A652OpeCod ;
   private String[] P04807_A653OpeNom ;
   private boolean[] P04807_n653OpeNom ;
   private String[] P04808_A396EmprCod ;
   private int[] P04808_A129BarCod ;
   private byte[] P04808_A132BarCodReo ;
   private String[] P04808_A130BarCodPar ;
   private String[] P04808_A758ProCod ;
   private short[] P04808_A194BarOrdLin ;
   private int[] P04808_A4031CCTCod ;
   private String[] P04808_A4047CCTLinVarW ;
   private String[] P04808_A4035CCVal ;
   private short[] P04808_A4034CCTLin ;
   private String[] P04809_A396EmprCod ;
   private short[] P04809_A829TipArtCod ;
   private String[] P04809_A830TipArtDsc ;
   private boolean[] P04809_n830TipArtDsc ;
   private String[] P048010_A396EmprCod ;
   private int[] P048010_A361DisCod ;
   private String[] P048010_A377DisObsTxt ;
   private byte[] P048010_A376DisObsLin ;
   private com.genexus.gxoffice.WordDoc AV70Documento ;
}

final  class pccpolnwd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P04806( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short A194BarOrdLin ,
                                          short  AV60Tab_orden[] ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[4];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T2.CliCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCOpeCod, T2.BarTipArt, T1.CCFch, T1.CcObs, T3.CliNom," ;
      scmdbuf += " T2.BarSer, T2.BarEncCli, T2.BarDisNum, T2.BarColNom, T2.BarColNum, T2.BarSerDsc, T2.BarAncCru1, T2.BarAncCru2, T2.BarAncAca1, T2.BarAncAca2, T2.BarTraP3, T2.BarTraP2," ;
      scmdbuf += " T2.BarTraP1, T2.BarTra3, T2.BarTra2, T2.BarTra1, T2.BarUrdP3, T2.BarUrdP2, T2.BarUrdP1, T2.BarUrd3, T2.BarUrd2, T2.BarUrd1, T2.BarPes, T2.BarGraAca, T2.BarGirar," ;
      scmdbuf += " T2.BarNomCli, T2.BarNumCli, T2.BarGraAca2, T2.BarEncAnh, T2.BarEncCom, T2.BarGraCru, T2.BarAntpT, T2.BarMdlCod, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T4.BarMtr," ;
      scmdbuf += " 0) AS BarMtr FROM (((TXPCC T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV60Tab_orden, "T1.BarOrdLin IN (", ")")+")");
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
            case 3 :
                  return conditional_P04806(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (short[])dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04802", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSer, DisCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04803", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbRGrm2, T2.AlbRAnc, T2.AlbRLote, T2.AlbRTelar, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04804", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04806", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04807", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04808", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T2.CCTLinVarW, T1.CCVal, T1.CCTLin FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.CCTCod = ?) AND (RTRIM(LTRIM(UPPER(T2.CCTLinVarW))) = RTRIM(LTRIM(UPPER(?)))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04809", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P048010", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
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
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
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
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
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
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 7 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
            case 4 :
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
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 100);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

