package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pwordsinlineasccpoln extends GXProcedure
{
   public pwordsinlineasccpoln( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pwordsinlineasccpoln.class ), "" );
   }

   public pwordsinlineasccpoln( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short[] AV60Tab_orden )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, AV60Tab_orden);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short[] AV60Tab_orden )
   {
      pwordsinlineasccpoln.this.A396EmprCod = aP0;
      pwordsinlineasccpoln.this.A129BarCod = aP1;
      pwordsinlineasccpoln.this.A132BarCodReo = aP2;
      pwordsinlineasccpoln.this.A130BarCodPar = aP3;
      pwordsinlineasccpoln.this.AV54CCTarc = aP4;
      pwordsinlineasccpoln.this.AV60Tab_orden = AV60Tab_orden;
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
         pwordsinlineasccpoln.this.A396EmprCod = GXv_char2[0] ;
         pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
         AV37Nombre = GXt_char1 ;
         AV37Nombre = GXutil.trim( AV37Nombre) ;
         if ( ! ( GXutil.strcmp(GXutil.substring( AV37Nombre, 1, GXutil.len( AV37Nombre)), "\\") == 0 ) )
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
         AV77File.setSource( AV37Nombre );
         if ( AV77File.exists() )
         {
            AV38Comm = httpContext.getMessage( "Delete File ", "") + AV37Nombre ;
            AV77File.delete();
            AV77File.close();
         }
         AV38Comm = httpContext.getMessage( "Copy File ", "") + "\"" + GXutil.trim( AV54CCTarc) + "\"" + httpContext.getMessage( " to ", "") + "\"" + AV37Nombre + "\"" ;
         System.out.println( AV38Comm );
         AV77File.setSource( AV54CCTarc );
         AV77File.copy(AV37Nombre);
         AV77File.close();
         AV73Documento.Open(AV37Nombre);
         AV73Documento.Show();
         AV58AlbRGrm2 = (short)(0) ;
         AV59AlbRAnc = (short)(0) ;
         /* Using cursor P05EI2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A212BarSer = P05EI2_A212BarSer[0] ;
            A361DisCod = P05EI2_A361DisCod[0] ;
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
            /* Using cursor P05EI3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A44AlbRecCod = P05EI3_A44AlbRecCod[0] ;
               A4920AlbRGrm2 = P05EI3_A4920AlbRGrm2[0] ;
               A4921AlbRAnc = P05EI3_A4921AlbRAnc[0] ;
               A6463AlbRLote = P05EI3_A6463AlbRLote[0] ;
               A6464AlbRTelar = P05EI3_A6464AlbRTelar[0] ;
               A200BarPieCod = P05EI3_A200BarPieCod[0] ;
               A4920AlbRGrm2 = P05EI3_A4920AlbRGrm2[0] ;
               A4921AlbRAnc = P05EI3_A4921AlbRAnc[0] ;
               A6463AlbRLote = P05EI3_A6463AlbRLote[0] ;
               A6464AlbRTelar = P05EI3_A6464AlbRTelar[0] ;
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
            AV75Procod = "" ;
            /* Using cursor P05EI4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A761ProFasLin = P05EI4_A761ProFasLin[0] ;
               n761ProFasLin = P05EI4_n761ProFasLin[0] ;
               A758ProCod = P05EI4_A758ProCod[0] ;
               AV75Procod = A758ProCod ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P05EI6 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A252CliCod = P05EI6_A252CliCod[0] ;
            n252CliCod = P05EI6_n252CliCod[0] ;
            A217BarTipArt = P05EI6_A217BarTipArt[0] ;
            n217BarTipArt = P05EI6_n217BarTipArt[0] ;
            A279CliNom = P05EI6_A279CliNom[0] ;
            A2311BarCliDes = P05EI6_A2311BarCliDes[0] ;
            A212BarSer = P05EI6_A212BarSer[0] ;
            A4812BarEncCli = P05EI6_A4812BarEncCli[0] ;
            A143BarDisNum = P05EI6_A143BarDisNum[0] ;
            A135BarColNom = P05EI6_A135BarColNom[0] ;
            A136BarColNum = P05EI6_A136BarColNum[0] ;
            A1652BarSerDsc = P05EI6_A1652BarSerDsc[0] ;
            A127BarAncCru1 = P05EI6_A127BarAncCru1[0] ;
            A128BarAncCru2 = P05EI6_A128BarAncCru2[0] ;
            A125BarAncAca1 = P05EI6_A125BarAncAca1[0] ;
            A126BarAncAca2 = P05EI6_A126BarAncAca2[0] ;
            A226BarTraP3 = P05EI6_A226BarTraP3[0] ;
            A225BarTraP2 = P05EI6_A225BarTraP2[0] ;
            A224BarTraP1 = P05EI6_A224BarTraP1[0] ;
            A223BarTra3 = P05EI6_A223BarTra3[0] ;
            A222BarTra2 = P05EI6_A222BarTra2[0] ;
            A221BarTra1 = P05EI6_A221BarTra1[0] ;
            A234BarUrdP3 = P05EI6_A234BarUrdP3[0] ;
            A233BarUrdP2 = P05EI6_A233BarUrdP2[0] ;
            A232BarUrdP1 = P05EI6_A232BarUrdP1[0] ;
            A231BarUrd3 = P05EI6_A231BarUrd3[0] ;
            A230BarUrd2 = P05EI6_A230BarUrd2[0] ;
            A229BarUrd1 = P05EI6_A229BarUrd1[0] ;
            A864BarPes = P05EI6_A864BarPes[0] ;
            A1909BarGraAca = P05EI6_A1909BarGraAca[0] ;
            A2454BarGirar = P05EI6_A2454BarGirar[0] ;
            A1234BarNomCli = P05EI6_A1234BarNomCli[0] ;
            A1235BarNumCli = P05EI6_A1235BarNumCli[0] ;
            A3137BarGraAca2 = P05EI6_A3137BarGraAca2[0] ;
            A1224BarEncAnh = P05EI6_A1224BarEncAnh[0] ;
            A1223BarEncCom = P05EI6_A1223BarEncCom[0] ;
            A1226BarGraCru = P05EI6_A1226BarGraCru[0] ;
            A5406BarAntpT = P05EI6_A5406BarAntpT[0] ;
            A4609BarMdlCod = P05EI6_A4609BarMdlCod[0] ;
            A9775BarItem1 = P05EI6_A9775BarItem1[0] ;
            A9777BarItem3 = P05EI6_A9777BarItem3[0] ;
            A14329BarCnoEncO = P05EI6_A14329BarCnoEncO[0] ;
            A4466BarAcaAnh = P05EI6_A4466BarAcaAnh[0] ;
            A9776barItem2 = P05EI6_A9776barItem2[0] ;
            A9789BarItem5 = P05EI6_A9789BarItem5[0] ;
            A166BarKgm = P05EI6_A166BarKgm[0] ;
            n166BarKgm = P05EI6_n166BarKgm[0] ;
            A279CliNom = P05EI6_A279CliNom[0] ;
            A166BarKgm = P05EI6_A166BarKgm[0] ;
            n166BarKgm = P05EI6_n166BarKgm[0] ;
            AV61Openom = " " ;
            AV55BarTipArt = A217BarTipArt ;
            /* Execute user subroutine: 'TIPART' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(3);
               pr_default.close(3);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV40Txt = AV73Documento.getText() ;
            GXv_char4[0] = AV40Txt ;
            GXv_int5[0] = AV41Max ;
            new app.controlcalidadhtd.pccpolfunproc(remoteHandle, context).execute( GXv_char4, GXv_int5, AV33Funcion, AV34ParNom, AV35ParTpo) ;
            pwordsinlineasccpoln.this.AV40Txt = GXv_char4[0] ;
            pwordsinlineasccpoln.this.AV41Max = (byte)((byte)(GXv_int5[0])) ;
            AV42Cont = (byte)(1) ;
            while ( AV42Cont <= AV41Max )
            {
               AV43ParCnt = AV33Funcion[AV42Cont-1][3-1] ;
               AV44Prg = AV33Funcion[AV42Cont-1][1-1] ;
               AV70Ccfch = GXutil.today( ) ;
               if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "FECHA", "")) == 0 )
               {
                  AV81Frm = AV34ParNom[AV42Cont-1][2-1] ;
                  GXv_char4[0] = AV49Str ;
                  new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( AV49Str, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                  pwordsinlineasccpoln.this.AV49Str = GXv_char4[0] ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "OPERARIO", "")) == 0 )
               {
                  AV49Str = GXutil.trim( AV61Openom) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "CLIENTE", "")) == 0 )
               {
                  AV81Frm = AV34ParNom[AV42Cont-1][1-1] ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( A279CliNom, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                  pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
               }
               else if ( ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "CLIENTEF", "")) == 0 ) && ( A2311BarCliDes > 0 ) )
               {
                  GXv_char4[0] = AV71Clinomf ;
                  new app.pclinom(remoteHandle, context).execute( A396EmprCod, A2311BarCliDes, GXv_char4) ;
                  pwordsinlineasccpoln.this.AV71Clinomf = GXv_char4[0] ;
                  AV49Str = GXutil.trim( AV71Clinomf) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "SERIE", "")) == 0 )
               {
                  AV49Str = GXutil.trim( A212BarSer) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "DISPCLI", "")) == 0 )
               {
                  if ( (GXutil.strcmp("", A4812BarEncCli)==0) )
                  {
                     AV81Frm = "" ;
                     AV81Frm = AV34ParNom[AV42Cont-1][1-1] ;
                     GXt_char1 = AV49Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( A143BarDisNum, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                     pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
                     AV49Str = GXt_char1 ;
                  }
                  else
                  {
                     AV81Frm = "" ;
                     AV81Frm = AV34ParNom[AV42Cont-1][1-1] ;
                     GXt_char1 = AV49Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( A4812BarEncCli, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                     pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
                     AV49Str = GXt_char1 ;
                  }
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "HDR", "")) == 0 )
               {
                  AV49Str = GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 10, 0)), (short)(8), "0") + GXutil.padl( GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)), (short)(1), "0") + GXutil.padl( GXutil.trim( A130BarCodPar), (short)(1), "_") ;
                  AV81Frm = "" ;
                  AV81Frm = AV34ParNom[AV42Cont-1][1-1] ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( AV49Str, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                  pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "COLOR", "")) == 0 )
               {
                  AV81Frm = "" ;
                  AV81Frm = AV34ParNom[AV42Cont-1][2-1] ;
                  AV49Str = GXutil.trim( A135BarColNom) + " " ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A136BarColNum, 3, 0, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                  pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str += GXt_char1 ;
                  AV81Frm = "" ;
                  AV81Frm = AV34ParNom[AV42Cont-1][1-1] ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( AV49Str, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                  pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
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
                  AV81Frm = AV34ParNom[AV42Cont-1][1-1] ;
                  if ( GXutil.strcmp(AV81Frm, "1") == 0 )
                  {
                     AV81Frm = "" ;
                     AV81Frm = AV34ParNom[AV42Cont-1][2-1] ;
                     GXt_char1 = AV49Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A127BarAncCru1, 3, 0, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                     pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
                     AV49Str = GXt_char1 ;
                  }
                  else if ( GXutil.strcmp(AV81Frm, "2") == 0 )
                  {
                     AV81Frm = "" ;
                     AV81Frm = AV34ParNom[AV42Cont-1][2-1] ;
                     GXt_char1 = AV49Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A128BarAncCru2, 3, 0, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                     pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
                     AV49Str = GXt_char1 ;
                  }
                  else if ( GXutil.strcmp(AV81Frm, "3") == 0 )
                  {
                     AV81Frm = "" ;
                     AV81Frm = AV34ParNom[AV42Cont-1][2-1] ;
                     GXt_char1 = AV49Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A125BarAncAca1, 3, 0, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                     pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
                     AV49Str = GXt_char1 ;
                  }
                  else if ( GXutil.strcmp(AV81Frm, "4") == 0 )
                  {
                     AV81Frm = "" ;
                     AV81Frm = AV34ParNom[AV42Cont-1][2-1] ;
                     GXt_char1 = AV49Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A126BarAncAca2, 3, 0, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                     pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
                     AV49Str = GXt_char1 ;
                  }
                  else if ( GXutil.strcmp(AV81Frm, "5") == 0 )
                  {
                     AV49Str = httpContext.getMessage( "OPCION NO VALIDA", "") ;
                  }
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "COMPOSICION", "")) == 0 )
               {
                  AV81Frm = "" ;
                  AV81Frm = AV34ParNom[AV42Cont-1][1-1] ;
                  if ( GXutil.strcmp(AV81Frm, "1") == 0 )
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
                  else if ( GXutil.strcmp(AV81Frm, "2") == 0 )
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
                  AV81Frm = "" ;
                  AV81Frm = AV34ParNom[AV42Cont-1][1-1] ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A864BarPes, 4, 0, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                  pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "GM2", "")) == 0 )
               {
                  AV81Frm = "" ;
                  AV81Frm = AV34ParNom[AV42Cont-1][1-1] ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A1909BarGraAca, 4, 0, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                  pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "ANCA1", "")) == 0 )
               {
                  AV81Frm = "" ;
                  AV81Frm = AV34ParNom[AV42Cont-1][1-1] ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A125BarAncAca1, 4, 0, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                  pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "KGS", "")) == 0 )
               {
                  AV49Str = GXutil.trim( GXutil.str( A166BarKgm, 9, 2)) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "CARTAZ", "")) == 0 )
               {
                  AV49Str = GXutil.trim( A2454BarGirar) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "COLORC", "")) == 0 )
               {
                  AV81Frm = "" ;
                  AV81Frm = AV34ParNom[AV42Cont-1][2-1] ;
                  AV49Str = GXutil.trim( A1234BarNomCli) + " " ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A1235BarNumCli, 3, 0, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                  pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str += GXt_char1 ;
                  AV81Frm = "" ;
                  AV81Frm = AV34ParNom[AV42Cont-1][1-1] ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = AV49Str ;
                  new app.controlcalidadhtd.pccpolstrcase(remoteHandle, context).execute( AV49Str, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                  pwordsinlineasccpoln.this.AV49Str = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "GM22", "")) == 0 )
               {
                  AV81Frm = "" ;
                  AV81Frm = AV34ParNom[AV42Cont-1][1-1] ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A3137BarGraAca2, 4, 0, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                  pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
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
                  AV81Frm = "" ;
                  AV81Frm = AV34ParNom[AV42Cont-1][1-1] ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( AV58AlbRGrm2, 4, 0, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                  pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
               }
               else if ( ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "GM2C", "")) == 0 ) && ( AV58AlbRGrm2 == 0 ) )
               {
                  AV81Frm = "" ;
                  AV81Frm = AV34ParNom[AV42Cont-1][1-1] ;
                  GXt_char1 = AV49Str ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A1226BarGraCru, 4, 0, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                  pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
                  AV49Str = GXt_char1 ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "ANCC", "")) == 0 )
               {
                  AV81Frm = "" ;
                  AV81Frm = AV34ParNom[AV42Cont-1][1-1] ;
                  if ( AV59AlbRAnc > 0 )
                  {
                     GXt_char1 = AV49Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( AV59AlbRAnc, 4, 0, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                     pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
                     AV49Str = GXt_char1 ;
                  }
                  else
                  {
                     GXt_char1 = AV49Str ;
                     GXv_char4[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccpolnumfor(remoteHandle, context).execute( A127BarAncCru1, 4, 0, (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV81Frm, "."))), GXv_char4) ;
                     pwordsinlineasccpoln.this.GXt_char1 = GXv_char4[0] ;
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
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "NOP", "")) == 0 )
               {
                  AV49Str = GXutil.trim( A9775BarItem1) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "NOV", "")) == 0 )
               {
                  AV49Str = GXutil.trim( A9777BarItem3) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "OBSCNOENC", "")) == 0 )
               {
                  AV51N = (byte)(GXutil.gxmlines( A14329BarCnoEncO, (short)(60))) ;
                  AV47I = 1 ;
                  AV49Str = "" ;
                  while ( AV47I <= AV51N )
                  {
                     AV49Str += GXutil.gxgetmli( A14329BarCnoEncO, (short)(AV47I), (short)(60)) ;
                     AV47I = (long)(AV47I+1) ;
                  }
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "CNODSC", "")) == 0 )
               {
                  AV72tb1_dsc = " " ;
                  if ( A4466BarAcaAnh > 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int6[0] = A4466BarAcaAnh ;
                     GXv_char3[0] = AV72tb1_dsc ;
                     new app.pptable1(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
                     pwordsinlineasccpoln.this.A396EmprCod = GXv_char4[0] ;
                     pwordsinlineasccpoln.this.A4466BarAcaAnh = GXv_int6[0] ;
                     pwordsinlineasccpoln.this.AV72tb1_dsc = GXv_char3[0] ;
                  }
                  AV49Str = GXutil.trim( AV72tb1_dsc) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "BARITEM1", "")) == 0 )
               {
                  AV49Str = GXutil.trim( A9775BarItem1) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "BARITEM2", "")) == 0 )
               {
                  AV49Str = GXutil.trim( A9776barItem2) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "BARITEM3", "")) == 0 )
               {
                  AV49Str = GXutil.trim( A9777BarItem3) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "BARITEM5", "")) == 0 )
               {
                  AV49Str = GXutil.trim( A9789BarItem5) ;
               }
               else if ( GXutil.strcmp(GXutil.upper( AV44Prg), httpContext.getMessage( "PROCESO", "")) == 0 )
               {
                  AV49Str = GXutil.trim( AV75Procod) ;
               }
               else
               {
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
                     AV73Documento.Replace(AV33Funcion[AV42Cont-1][2-1], AV48StrAux, (short)(0), (short)(1));
                  }
                  else
                  {
                     AV73Documento.Replace("#####", AV48StrAux, (short)(0), (short)(1));
                  }
                  AV47I = (long)(AV47I+1) ;
               }
               AV50Inicio = (long)(((AV47I-1)*200)+1) ;
               AV48StrAux = GXutil.substring( AV49Str, (int)(AV50Inicio), (int)(AV46StrResto)) ;
               if ( AV47I == 1 )
               {
                  AV73Documento.Replace(AV33Funcion[AV42Cont-1][2-1], AV48StrAux, (short)(0), (short)(1));
               }
               else
               {
                  AV73Documento.Replace("#####", AV48StrAux, (short)(0), (short)(1));
               }
               AV42Cont = (byte)(AV42Cont+1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         AV73Documento.Save();
         httpContext.wjLoc = formatLink("app.apget_downloadfile", new String[] {GXutil.URLEncode(GXutil.rtrim(GXutil.trim( AV37Nombre))),GXutil.URLEncode(GXutil.rtrim(GXutil.trim( AV37Nombre))),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "application/msword", "")))}, new String[] {"vrPathCompleto","vrNomeArquivo","ContentType"})  ;
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
      /* Using cursor P05EI7 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(AV55BarTipArt)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A829TipArtCod = P05EI7_A829TipArtCod[0] ;
         A830TipArtDsc = P05EI7_A830TipArtDsc[0] ;
         n830TipArtDsc = P05EI7_n830TipArtDsc[0] ;
         AV56TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S121( )
   {
      /* 'OBSERV' Routine */
      returnInSub = false ;
      AV64Obs = " " ;
      /* Using cursor P05EI8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV62Discod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A361DisCod = P05EI8_A361DisCod[0] ;
         A377DisObsTxt = P05EI8_A377DisObsTxt[0] ;
         A376DisObsLin = P05EI8_A376DisObsLin[0] ;
         if ( GXutil.strcmp(AV64Obs, "") == 0 )
         {
            AV64Obs = A377DisObsTxt + GXutil.chr( (short)(13)) ;
         }
         else
         {
            AV64Obs += A377DisObsTxt + GXutil.chr( (short)(13)) ;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      AV73Documento.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37Nombre = "" ;
      GXv_char2 = new String[1] ;
      AV77File = new com.genexus.util.GXFile();
      AV38Comm = "" ;
      AV73Documento = new com.genexus.gxoffice.WordDoc();
      scmdbuf = "" ;
      P05EI2_A396EmprCod = new String[] {""} ;
      P05EI2_A129BarCod = new int[1] ;
      P05EI2_A132BarCodReo = new byte[1] ;
      P05EI2_A130BarCodPar = new String[] {""} ;
      P05EI2_A212BarSer = new String[] {""} ;
      P05EI2_A361DisCod = new int[1] ;
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
      P05EI3_A44AlbRecCod = new int[1] ;
      P05EI3_A396EmprCod = new String[] {""} ;
      P05EI3_A129BarCod = new int[1] ;
      P05EI3_A132BarCodReo = new byte[1] ;
      P05EI3_A130BarCodPar = new String[] {""} ;
      P05EI3_A4920AlbRGrm2 = new short[1] ;
      P05EI3_A4921AlbRAnc = new short[1] ;
      P05EI3_A6463AlbRLote = new String[] {""} ;
      P05EI3_A6464AlbRTelar = new String[] {""} ;
      P05EI3_A200BarPieCod = new String[] {""} ;
      A6463AlbRLote = "" ;
      A6464AlbRTelar = "" ;
      A200BarPieCod = "" ;
      AV75Procod = "" ;
      P05EI4_A396EmprCod = new String[] {""} ;
      P05EI4_A129BarCod = new int[1] ;
      P05EI4_A132BarCodReo = new byte[1] ;
      P05EI4_A130BarCodPar = new String[] {""} ;
      P05EI4_A761ProFasLin = new short[1] ;
      P05EI4_n761ProFasLin = new boolean[] {false} ;
      P05EI4_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      P05EI6_A252CliCod = new int[1] ;
      P05EI6_n252CliCod = new boolean[] {false} ;
      P05EI6_A396EmprCod = new String[] {""} ;
      P05EI6_A129BarCod = new int[1] ;
      P05EI6_A132BarCodReo = new byte[1] ;
      P05EI6_A130BarCodPar = new String[] {""} ;
      P05EI6_A217BarTipArt = new short[1] ;
      P05EI6_n217BarTipArt = new boolean[] {false} ;
      P05EI6_A279CliNom = new String[] {""} ;
      P05EI6_A2311BarCliDes = new int[1] ;
      P05EI6_A212BarSer = new String[] {""} ;
      P05EI6_A4812BarEncCli = new String[] {""} ;
      P05EI6_A143BarDisNum = new String[] {""} ;
      P05EI6_A135BarColNom = new String[] {""} ;
      P05EI6_A136BarColNum = new int[1] ;
      P05EI6_A1652BarSerDsc = new String[] {""} ;
      P05EI6_A127BarAncCru1 = new short[1] ;
      P05EI6_A128BarAncCru2 = new short[1] ;
      P05EI6_A125BarAncAca1 = new short[1] ;
      P05EI6_A126BarAncAca2 = new short[1] ;
      P05EI6_A226BarTraP3 = new short[1] ;
      P05EI6_A225BarTraP2 = new short[1] ;
      P05EI6_A224BarTraP1 = new short[1] ;
      P05EI6_A223BarTra3 = new String[] {""} ;
      P05EI6_A222BarTra2 = new String[] {""} ;
      P05EI6_A221BarTra1 = new String[] {""} ;
      P05EI6_A234BarUrdP3 = new short[1] ;
      P05EI6_A233BarUrdP2 = new short[1] ;
      P05EI6_A232BarUrdP1 = new short[1] ;
      P05EI6_A231BarUrd3 = new String[] {""} ;
      P05EI6_A230BarUrd2 = new String[] {""} ;
      P05EI6_A229BarUrd1 = new String[] {""} ;
      P05EI6_A864BarPes = new short[1] ;
      P05EI6_A1909BarGraAca = new short[1] ;
      P05EI6_A2454BarGirar = new String[] {""} ;
      P05EI6_A1234BarNomCli = new String[] {""} ;
      P05EI6_A1235BarNumCli = new int[1] ;
      P05EI6_A3137BarGraAca2 = new short[1] ;
      P05EI6_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05EI6_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05EI6_A1226BarGraCru = new short[1] ;
      P05EI6_A5406BarAntpT = new String[] {""} ;
      P05EI6_A4609BarMdlCod = new String[] {""} ;
      P05EI6_A9775BarItem1 = new String[] {""} ;
      P05EI6_A9777BarItem3 = new String[] {""} ;
      P05EI6_A14329BarCnoEncO = new String[] {""} ;
      P05EI6_A4466BarAcaAnh = new short[1] ;
      P05EI6_A9776barItem2 = new String[] {""} ;
      P05EI6_A9789BarItem5 = new String[] {""} ;
      P05EI6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05EI6_n166BarKgm = new boolean[] {false} ;
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
      A9775BarItem1 = "" ;
      A9777BarItem3 = "" ;
      A14329BarCnoEncO = "" ;
      A9776barItem2 = "" ;
      A9789BarItem5 = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV61Openom = "" ;
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
      AV43ParCnt = "" ;
      AV44Prg = "" ;
      AV70Ccfch = GXutil.nullDate() ;
      AV81Frm = "" ;
      AV49Str = "" ;
      AV71Clinomf = "" ;
      AV56TipArtDsc = "" ;
      GXt_char1 = "" ;
      AV64Obs = "" ;
      AV72tb1_dsc = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_char3 = new String[1] ;
      AV48StrAux = "" ;
      P05EI7_A396EmprCod = new String[] {""} ;
      P05EI7_A829TipArtCod = new short[1] ;
      P05EI7_A830TipArtDsc = new String[] {""} ;
      P05EI7_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      P05EI8_A396EmprCod = new String[] {""} ;
      P05EI8_A361DisCod = new int[1] ;
      P05EI8_A377DisObsTxt = new String[] {""} ;
      P05EI8_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.pwordsinlineasccpoln__default(),
         new Object[] {
             new Object[] {
            P05EI2_A396EmprCod, P05EI2_A129BarCod, P05EI2_A132BarCodReo, P05EI2_A130BarCodPar, P05EI2_A212BarSer, P05EI2_A361DisCod
            }
            , new Object[] {
            P05EI3_A44AlbRecCod, P05EI3_A396EmprCod, P05EI3_A129BarCod, P05EI3_A132BarCodReo, P05EI3_A130BarCodPar, P05EI3_A4920AlbRGrm2, P05EI3_A4921AlbRAnc, P05EI3_A6463AlbRLote, P05EI3_A6464AlbRTelar, P05EI3_A200BarPieCod
            }
            , new Object[] {
            P05EI4_A396EmprCod, P05EI4_A129BarCod, P05EI4_A132BarCodReo, P05EI4_A130BarCodPar, P05EI4_A761ProFasLin, P05EI4_n761ProFasLin, P05EI4_A758ProCod
            }
            , new Object[] {
            P05EI6_A252CliCod, P05EI6_n252CliCod, P05EI6_A396EmprCod, P05EI6_A129BarCod, P05EI6_A132BarCodReo, P05EI6_A130BarCodPar, P05EI6_A217BarTipArt, P05EI6_n217BarTipArt, P05EI6_A279CliNom, P05EI6_A2311BarCliDes,
            P05EI6_A212BarSer, P05EI6_A4812BarEncCli, P05EI6_A143BarDisNum, P05EI6_A135BarColNom, P05EI6_A136BarColNum, P05EI6_A1652BarSerDsc, P05EI6_A127BarAncCru1, P05EI6_A128BarAncCru2, P05EI6_A125BarAncAca1, P05EI6_A126BarAncAca2,
            P05EI6_A226BarTraP3, P05EI6_A225BarTraP2, P05EI6_A224BarTraP1, P05EI6_A223BarTra3, P05EI6_A222BarTra2, P05EI6_A221BarTra1, P05EI6_A234BarUrdP3, P05EI6_A233BarUrdP2, P05EI6_A232BarUrdP1, P05EI6_A231BarUrd3,
            P05EI6_A230BarUrd2, P05EI6_A229BarUrd1, P05EI6_A864BarPes, P05EI6_A1909BarGraAca, P05EI6_A2454BarGirar, P05EI6_A1234BarNomCli, P05EI6_A1235BarNumCli, P05EI6_A3137BarGraAca2, P05EI6_A1224BarEncAnh, P05EI6_A1223BarEncCom,
            P05EI6_A1226BarGraCru, P05EI6_A5406BarAntpT, P05EI6_A4609BarMdlCod, P05EI6_A9775BarItem1, P05EI6_A9777BarItem3, P05EI6_A14329BarCnoEncO, P05EI6_A4466BarAcaAnh, P05EI6_A9776barItem2, P05EI6_A9789BarItem5, P05EI6_A166BarKgm,
            P05EI6_n166BarKgm
            }
            , new Object[] {
            P05EI7_A396EmprCod, P05EI7_A829TipArtCod, P05EI7_A830TipArtDsc, P05EI7_n830TipArtDsc
            }
            , new Object[] {
            P05EI8_A396EmprCod, P05EI8_A361DisCod, P05EI8_A377DisObsTxt, P05EI8_A376DisObsLin
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
   private byte AV51N ;
   private byte A376DisObsLin ;
   private short AV60Tab_orden[] ;
   private short AV52BarOrdLin ;
   private short AV58AlbRGrm2 ;
   private short AV59AlbRAnc ;
   private short A4920AlbRGrm2 ;
   private short A4921AlbRAnc ;
   private short A761ProFasLin ;
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
   private short A4466BarAcaAnh ;
   private short AV55BarTipArt ;
   private short GXv_int6[] ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV53CCTCod ;
   private int A361DisCod ;
   private int AV62Discod ;
   private int GX_I ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A2311BarCliDes ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int GX_J ;
   private long GXv_int5[] ;
   private long AV47I ;
   private long AV45CantSust ;
   private long AV46StrResto ;
   private long AV50Inicio ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A166BarKgm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV54CCTarc ;
   private String AV37Nombre ;
   private String GXv_char2[] ;
   private String AV38Comm ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String AV68TabLot[] ;
   private String AV69TabTel[] ;
   private String A6463AlbRLote ;
   private String A6464AlbRTelar ;
   private String A200BarPieCod ;
   private String AV75Procod ;
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
   private String A9775BarItem1 ;
   private String A9777BarItem3 ;
   private String A9776barItem2 ;
   private String A9789BarItem5 ;
   private String AV61Openom ;
   private String AV33Funcion[][] ;
   private String AV34ParNom[][] ;
   private String AV35ParTpo[][] ;
   private String AV43ParCnt ;
   private String AV44Prg ;
   private String AV81Frm ;
   private String AV71Clinomf ;
   private String AV56TipArtDsc ;
   private String GXt_char1 ;
   private String AV72tb1_dsc ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV48StrAux ;
   private String A830TipArtDsc ;
   private String A377DisObsTxt ;
   private java.util.Date AV70Ccfch ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n166BarKgm ;
   private boolean n830TipArtDsc ;
   private String AV40Txt ;
   private String AV49Str ;
   private String A14329BarCnoEncO ;
   private String AV64Obs ;
   private com.genexus.util.GXFile AV77File ;
   private IDataStoreProvider pr_default ;
   private String[] P05EI2_A396EmprCod ;
   private int[] P05EI2_A129BarCod ;
   private byte[] P05EI2_A132BarCodReo ;
   private String[] P05EI2_A130BarCodPar ;
   private String[] P05EI2_A212BarSer ;
   private int[] P05EI2_A361DisCod ;
   private int[] P05EI3_A44AlbRecCod ;
   private String[] P05EI3_A396EmprCod ;
   private int[] P05EI3_A129BarCod ;
   private byte[] P05EI3_A132BarCodReo ;
   private String[] P05EI3_A130BarCodPar ;
   private short[] P05EI3_A4920AlbRGrm2 ;
   private short[] P05EI3_A4921AlbRAnc ;
   private String[] P05EI3_A6463AlbRLote ;
   private String[] P05EI3_A6464AlbRTelar ;
   private String[] P05EI3_A200BarPieCod ;
   private String[] P05EI4_A396EmprCod ;
   private int[] P05EI4_A129BarCod ;
   private byte[] P05EI4_A132BarCodReo ;
   private String[] P05EI4_A130BarCodPar ;
   private short[] P05EI4_A761ProFasLin ;
   private boolean[] P05EI4_n761ProFasLin ;
   private String[] P05EI4_A758ProCod ;
   private int[] P05EI6_A252CliCod ;
   private boolean[] P05EI6_n252CliCod ;
   private String[] P05EI6_A396EmprCod ;
   private int[] P05EI6_A129BarCod ;
   private byte[] P05EI6_A132BarCodReo ;
   private String[] P05EI6_A130BarCodPar ;
   private short[] P05EI6_A217BarTipArt ;
   private boolean[] P05EI6_n217BarTipArt ;
   private String[] P05EI6_A279CliNom ;
   private int[] P05EI6_A2311BarCliDes ;
   private String[] P05EI6_A212BarSer ;
   private String[] P05EI6_A4812BarEncCli ;
   private String[] P05EI6_A143BarDisNum ;
   private String[] P05EI6_A135BarColNom ;
   private int[] P05EI6_A136BarColNum ;
   private String[] P05EI6_A1652BarSerDsc ;
   private short[] P05EI6_A127BarAncCru1 ;
   private short[] P05EI6_A128BarAncCru2 ;
   private short[] P05EI6_A125BarAncAca1 ;
   private short[] P05EI6_A126BarAncAca2 ;
   private short[] P05EI6_A226BarTraP3 ;
   private short[] P05EI6_A225BarTraP2 ;
   private short[] P05EI6_A224BarTraP1 ;
   private String[] P05EI6_A223BarTra3 ;
   private String[] P05EI6_A222BarTra2 ;
   private String[] P05EI6_A221BarTra1 ;
   private short[] P05EI6_A234BarUrdP3 ;
   private short[] P05EI6_A233BarUrdP2 ;
   private short[] P05EI6_A232BarUrdP1 ;
   private String[] P05EI6_A231BarUrd3 ;
   private String[] P05EI6_A230BarUrd2 ;
   private String[] P05EI6_A229BarUrd1 ;
   private short[] P05EI6_A864BarPes ;
   private short[] P05EI6_A1909BarGraAca ;
   private String[] P05EI6_A2454BarGirar ;
   private String[] P05EI6_A1234BarNomCli ;
   private int[] P05EI6_A1235BarNumCli ;
   private short[] P05EI6_A3137BarGraAca2 ;
   private java.math.BigDecimal[] P05EI6_A1224BarEncAnh ;
   private java.math.BigDecimal[] P05EI6_A1223BarEncCom ;
   private short[] P05EI6_A1226BarGraCru ;
   private String[] P05EI6_A5406BarAntpT ;
   private String[] P05EI6_A4609BarMdlCod ;
   private String[] P05EI6_A9775BarItem1 ;
   private String[] P05EI6_A9777BarItem3 ;
   private String[] P05EI6_A14329BarCnoEncO ;
   private short[] P05EI6_A4466BarAcaAnh ;
   private String[] P05EI6_A9776barItem2 ;
   private String[] P05EI6_A9789BarItem5 ;
   private java.math.BigDecimal[] P05EI6_A166BarKgm ;
   private boolean[] P05EI6_n166BarKgm ;
   private String[] P05EI7_A396EmprCod ;
   private short[] P05EI7_A829TipArtCod ;
   private String[] P05EI7_A830TipArtDsc ;
   private boolean[] P05EI7_n830TipArtDsc ;
   private String[] P05EI8_A396EmprCod ;
   private int[] P05EI8_A361DisCod ;
   private String[] P05EI8_A377DisObsTxt ;
   private byte[] P05EI8_A376DisObsLin ;
   private com.genexus.gxoffice.WordDoc AV73Documento ;
}

final  class pwordsinlineasccpoln__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05EI2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSer, DisCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05EI3", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbRGrm2, T2.AlbRAnc, T2.AlbRLote, T2.AlbRTelar, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05EI4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05EI6", "SELECT T1.CliCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarTipArt, T2.CliNom, T1.BarCliDes, T1.BarSer, T1.BarEncCli, T1.BarDisNum, T1.BarColNom, T1.BarColNum, T1.BarSerDsc, T1.BarAncCru1, T1.BarAncCru2, T1.BarAncAca1, T1.BarAncAca2, T1.BarTraP3, T1.BarTraP2, T1.BarTraP1, T1.BarTra3, T1.BarTra2, T1.BarTra1, T1.BarUrdP3, T1.BarUrdP2, T1.BarUrdP1, T1.BarUrd3, T1.BarUrd2, T1.BarUrd1, T1.BarPes, T1.BarGraAca, T1.BarGirar, T1.BarNomCli, T1.BarNumCli, T1.BarGraAca2, T1.BarEncAnh, T1.BarEncCom, T1.BarGraCru, T1.BarAntpT, T1.BarMdlCod, T1.BarItem1, T1.BarItem3, T1.BarCnoEncO, T1.BarAcaAnh, T1.barItem2, T1.BarItem5, COALESCE( T3.BarKgm, 0) AS BarKgm FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05EI7", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05EI8", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((String[]) buf[12])[0] = rslt.getString(11, 8);
               ((String[]) buf[13])[0] = rslt.getString(12, 13);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 26);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((short[]) buf[19])[0] = rslt.getShort(18);
               ((short[]) buf[20])[0] = rslt.getShort(19);
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((short[]) buf[22])[0] = rslt.getShort(21);
               ((String[]) buf[23])[0] = rslt.getString(22, 4);
               ((String[]) buf[24])[0] = rslt.getString(23, 4);
               ((String[]) buf[25])[0] = rslt.getString(24, 4);
               ((short[]) buf[26])[0] = rslt.getShort(25);
               ((short[]) buf[27])[0] = rslt.getShort(26);
               ((short[]) buf[28])[0] = rslt.getShort(27);
               ((String[]) buf[29])[0] = rslt.getString(28, 4);
               ((String[]) buf[30])[0] = rslt.getString(29, 4);
               ((String[]) buf[31])[0] = rslt.getString(30, 4);
               ((short[]) buf[32])[0] = rslt.getShort(31);
               ((short[]) buf[33])[0] = rslt.getShort(32);
               ((String[]) buf[34])[0] = rslt.getString(33, 20);
               ((String[]) buf[35])[0] = rslt.getString(34, 13);
               ((int[]) buf[36])[0] = rslt.getInt(35);
               ((short[]) buf[37])[0] = rslt.getShort(36);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(37,2);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(38,2);
               ((short[]) buf[40])[0] = rslt.getShort(39);
               ((String[]) buf[41])[0] = rslt.getString(40, 1);
               ((String[]) buf[42])[0] = rslt.getString(41, 13);
               ((String[]) buf[43])[0] = rslt.getString(42, 20);
               ((String[]) buf[44])[0] = rslt.getString(43, 20);
               ((String[]) buf[45])[0] = rslt.getVarchar(44);
               ((short[]) buf[46])[0] = rslt.getShort(45);
               ((String[]) buf[47])[0] = rslt.getString(46, 20);
               ((String[]) buf[48])[0] = rslt.getString(47, 20);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(48,2);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

