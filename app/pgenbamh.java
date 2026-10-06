package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgenbamh extends GXProcedure
{
   public pgenbamh( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgenbamh.class ), "" );
   }

   public pgenbamh( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      pgenbamh.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pgenbamh.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pgenbamh.this.AV16DisCod = aP1[0];
      this.aP1 = aP1;
      pgenbamh.this.AV17MaqCod = aP2[0];
      this.aP2 = aP2;
      pgenbamh.this.AV20FlagA = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV28Flag ;
      new app.popcion(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "10207E", ""), GXv_int1) ;
      pgenbamh.this.AV28Flag = GXv_int1[0] ;
      GXv_int1[0] = AV41Flag1 ;
      new app.popcion(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int1) ;
      pgenbamh.this.AV41Flag1 = GXv_int1[0] ;
      GXv_int1[0] = AV47Flag2 ;
      new app.popcion(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "JMOLTO", ""), GXv_int1) ;
      pgenbamh.this.AV47Flag2 = GXv_int1[0] ;
      GXv_int1[0] = AV48FlagPer ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PERTEX", ""), GXv_int1) ;
      pgenbamh.this.AV48FlagPer = GXv_int1[0] ;
      AV53FlagBros = (byte)(0) ;
      GXv_int1[0] = AV53FlagBros ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "BROS", ""), GXv_int1) ;
      pgenbamh.this.AV53FlagBros = GXv_int1[0] ;
      AV54FlagCtrl = (byte)(0) ;
      GXv_int1[0] = AV54FlagCtrl ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, "300900", GXv_int1) ;
      pgenbamh.this.AV54FlagCtrl = GXv_int1[0] ;
      AV58FlagCtrFor = (byte)(0) ;
      GXv_int1[0] = AV58FlagCtrFor ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CTRFOR", ""), GXv_int1) ;
      pgenbamh.this.AV58FlagCtrFor = GXv_int1[0] ;
      GXv_int1[0] = AV59SILTEK ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "SILTEK", ""), GXv_int1) ;
      pgenbamh.this.AV59SILTEK = GXv_int1[0] ;
      GXv_int1[0] = AV60TESPEC ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TESPEC", ""), GXv_int1) ;
      pgenbamh.this.AV60TESPEC = GXv_int1[0] ;
      AV61FlagGas = (byte)(0) ;
      GXv_int1[0] = AV61FlagGas ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "GASSOL", ""), GXv_int1) ;
      pgenbamh.this.AV61FlagGas = GXv_int1[0] ;
      GXv_int1[0] = AV62FlagVALOHR ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "VALOHR", ""), GXv_int1) ;
      pgenbamh.this.AV62FlagVALOHR = GXv_int1[0] ;
      GXv_int1[0] = AV68Magosa ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MAGOSA", ""), GXv_int1) ;
      pgenbamh.this.AV68Magosa = GXv_int1[0] ;
      GXt_int2 = AV67F_nr ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "NOTREC", ""), GXv_int1) ;
      pgenbamh.this.GXt_int2 = GXv_int1[0] ;
      AV67F_nr = GXt_int2 ;
      GXt_int2 = AV70itram ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ITRAM", ""), GXv_int1) ;
      pgenbamh.this.GXt_int2 = GXv_int1[0] ;
      AV70itram = GXt_int2 ;
      if ( ! (0==AV53FlagBros) )
      {
         AV56FechaLim = localUtil.ctod( "30/09/2000", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         AV57FecPrue = GXutil.today( ) ;
         if ( (( GXutil.resetTime(AV57FecPrue).after( GXutil.resetTime( AV56FechaLim )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV57FecPrue), GXutil.resetTime(AV56FechaLim)) )) && ( AV54FlagCtrl == 1 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "PROBLEMA DE VERSION PONGASE EN CONTACTO CON SU PROVEEDOR DE ACATEX.", ""));
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      /* Using cursor P006P2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV17MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P006P2_A602MaqCod[0] ;
         n602MaqCod = P006P2_n602MaqCod[0] ;
         A396EmprCod = P006P2_A396EmprCod[0] ;
         A624MaqVolMed = P006P2_A624MaqVolMed[0] ;
         n624MaqVolMed = P006P2_n624MaqVolMed[0] ;
         AV52Volumen = A624MaqVolMed ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P006P4 */
      pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A966PartCod = P006P4_A966PartCod[0] ;
         n966PartCod = P006P4_n966PartCod[0] ;
         A374DisNumPie = P006P4_A374DisNumPie[0] ;
         A360DisCliNum = P006P4_A360DisCliNum[0] ;
         A352DisArtTip = P006P4_A352DisArtTip[0] ;
         A1195DisNomCli = P006P4_A1195DisNomCli[0] ;
         A1196DisNumCli = P006P4_A1196DisNumCli[0] ;
         A369DisFec = P006P4_A369DisFec[0] ;
         A2835DisPle2 = P006P4_A2835DisPle2[0] ;
         A375DisNumUni = P006P4_A375DisNumUni[0] ;
         A392DisUniMed = P006P4_A392DisUniMed[0] ;
         A370DisFecCli = P006P4_A370DisFecCli[0] ;
         A371DisFecEnt = P006P4_A371DisFecEnt[0] ;
         A341DisArtOpe = P006P4_A341DisArtOpe[0] ;
         A359DisArtUrg = P006P4_A359DisArtUrg[0] ;
         A340DisArtMat = P006P4_A340DisArtMat[0] ;
         A350DisArtRdt = P006P4_A350DisArtRdt[0] ;
         A353DisArtTr1 = P006P4_A353DisArtTr1[0] ;
         A344DisArtPt1 = P006P4_A344DisArtPt1[0] ;
         A354DisArtTr2 = P006P4_A354DisArtTr2[0] ;
         A345DisArtPt2 = P006P4_A345DisArtPt2[0] ;
         A355DisArtTr3 = P006P4_A355DisArtTr3[0] ;
         A346DisArtPt3 = P006P4_A346DisArtPt3[0] ;
         A356DisArtUr1 = P006P4_A356DisArtUr1[0] ;
         A347DisArtPu1 = P006P4_A347DisArtPu1[0] ;
         A357DisArtUr2 = P006P4_A357DisArtUr2[0] ;
         A348DisArtPu2 = P006P4_A348DisArtPu2[0] ;
         A358DisArtUr3 = P006P4_A358DisArtUr3[0] ;
         A349DisArtPu3 = P006P4_A349DisArtPu3[0] ;
         n349DisArtPu3 = P006P4_n349DisArtPu3[0] ;
         A334DisArtAnh = P006P4_A334DisArtAnh[0] ;
         A343DisArtPle = P006P4_A343DisArtPle[0] ;
         A339DisArtLar = P006P4_A339DisArtLar[0] ;
         A351DisArtSua = P006P4_A351DisArtSua[0] ;
         A333DisArtAca = P006P4_A333DisArtAca[0] ;
         A336DisArtCor = P006P4_A336DisArtCor[0] ;
         A338DisArtEnc = P006P4_A338DisArtEnc[0] ;
         A2831DisNumLot = P006P4_A2831DisNumLot[0] ;
         A2832DisKgsLot = P006P4_A2832DisKgsLot[0] ;
         A2833DisMtrLot = P006P4_A2833DisMtrLot[0] ;
         A2009DisTipDis = P006P4_A2009DisTipDis[0] ;
         n2009DisTipDis = P006P4_n2009DisTipDis[0] ;
         A757PriCod = P006P4_A757PriCod[0] ;
         A342DisArtPes = P006P4_A342DisArtPes[0] ;
         A999DisNMez = P006P4_A999DisNMez[0] ;
         A998DisNMtr = P006P4_A998DisNMtr[0] ;
         A1002DisNumTen = P006P4_A1002DisNumTen[0] ;
         n1002DisNumTen = P006P4_n1002DisNumTen[0] ;
         A337DisArtDsc = P006P4_A337DisArtDsc[0] ;
         A2310DisCliDes = P006P4_A2310DisCliDes[0] ;
         A2742DisCodTex = P006P4_A2742DisCodTex[0] ;
         n2742DisCodTex = P006P4_n2742DisCodTex[0] ;
         A2743DisNumTex1 = P006P4_A2743DisNumTex1[0] ;
         A2744DisNumTex2 = P006P4_A2744DisNumTex2[0] ;
         n2744DisNumTex2 = P006P4_n2744DisNumTex2[0] ;
         A2926DisPla = P006P4_A2926DisPla[0] ;
         A3306DisFac = P006P4_A3306DisFac[0] ;
         A3307DisManCod1 = P006P4_A3307DisManCod1[0] ;
         A3308DisManCod2 = P006P4_A3308DisManCod2[0] ;
         A3127DisNumCor = P006P4_A3127DisNumCor[0] ;
         A3128DisAncSal1 = P006P4_A3128DisAncSal1[0] ;
         A3129DisAncSal2 = P006P4_A3129DisAncSal2[0] ;
         A3130DisAncSal3 = P006P4_A3130DisAncSal3[0] ;
         A3131DisGraAca2 = P006P4_A3131DisGraAca2[0] ;
         A3132DisGraCru2 = P006P4_A3132DisGraCru2[0] ;
         A3627DisFecLan = P006P4_A3627DisFecLan[0] ;
         n3627DisFecLan = P006P4_n3627DisFecLan[0] ;
         A5366DisAntp = P006P4_A5366DisAntp[0] ;
         A5252DisAcc = P006P4_A5252DisAcc[0] ;
         A8887DisFchT = P006P4_A8887DisFchT[0] ;
         n8887DisFchT = P006P4_n8887DisFchT[0] ;
         A8885DisFEnt = P006P4_A8885DisFEnt[0] ;
         n8885DisFEnt = P006P4_n8885DisFEnt[0] ;
         A8886DisDest = P006P4_A8886DisDest[0] ;
         A4470DisCruKgs = P006P4_A4470DisCruKgs[0] ;
         A7739DisExp = P006P4_A7739DisExp[0] ;
         A5032DisEstTip = P006P4_A5032DisEstTip[0] ;
         A361DisCod = P006P4_A361DisCod[0] ;
         A1968DisRes = P006P4_A1968DisRes[0] ;
         n1968DisRes = P006P4_n1968DisRes[0] ;
         A367DisEst = P006P4_A367DisEst[0] ;
         A387DisPiePie = P006P4_A387DisPiePie[0] ;
         n387DisPiePie = P006P4_n387DisPiePie[0] ;
         A390DisTipCol = P006P4_A390DisTipCol[0] ;
         n390DisTipCol = P006P4_n390DisTipCol[0] ;
         A363DisColNum = P006P4_A363DisColNum[0] ;
         n363DisColNum = P006P4_n363DisColNum[0] ;
         A362DisColNom = P006P4_A362DisColNom[0] ;
         n362DisColNom = P006P4_n362DisColNom[0] ;
         A335DisArtCod = P006P4_A335DisArtCod[0] ;
         A252CliCod = P006P4_A252CliCod[0] ;
         n252CliCod = P006P4_n252CliCod[0] ;
         A396EmprCod = P006P4_A396EmprCod[0] ;
         A365DisDes = P006P4_A365DisDes[0] ;
         A387DisPiePie = P006P4_A387DisPiePie[0] ;
         n387DisPiePie = P006P4_n387DisPiePie[0] ;
         if ( GXutil.strcmp(A1968DisRes, httpContext.getMessage( "N", "")) == 0 )
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A386DisPieNor = (short)(getDisPieNor0( A396EmprCod, A361DisCod)) ;
            }
            else
            {
               A386DisPieNor = (short)(0) ;
            }
            GXt_char3 = A475FindCol ;
            GXv_char4[0] = GXt_char3 ;
            new app.pedidos.dis_findcol_validate(remoteHandle, context).execute( A396EmprCod, A252CliCod, A335DisArtCod, A362DisColNom, A363DisColNum, A390DisTipCol, GXv_char4) ;
            pgenbamh.this.GXt_char3 = GXv_char4[0] ;
            A475FindCol = GXt_char3 ;
            W396EmprCod = A396EmprCod ;
            W361DisCod = A361DisCod ;
            AV15EmprCod = A396EmprCod ;
            AV19CliCod = A252CliCod ;
            AV42ForSer = A335DisArtCod ;
            AV43ForcolNom = A362DisColNom ;
            AV44ForcolNum = A363DisColNum ;
            AV45TipCol = A390DisTipCol ;
            /* Execute user subroutine: 'CTRFOR' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV38DisArtCod = A335DisArtCod ;
            AV19CliCod = A252CliCod ;
            /* Execute user subroutine: 'ANCHOS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV26ContVal = 0 ;
            if ( ( GXutil.strcmp(A757PriCod, "0") == 0 ) && ( AV28Flag == 1 ) )
            {
               GXv_int5[0] = AV26ContVal ;
               new app.pnumdoc(remoteHandle, context).execute( AV15EmprCod, "020300", GXv_int5) ;
               pgenbamh.this.AV26ContVal = GXv_int5[0] ;
            }
            if ( ( GXutil.strcmp(A757PriCod, "1") == 0 ) && ( AV28Flag == 1 ) )
            {
               GXv_int5[0] = AV26ContVal ;
               new app.pnumdoc(remoteHandle, context).execute( AV15EmprCod, "021300", GXv_int5) ;
               pgenbamh.this.AV26ContVal = GXv_int5[0] ;
            }
            AV32DisReo = (byte)(0) ;
            /* Using cursor P006P5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A319DefPor = P006P5_A319DefPor[0] ;
               A833TipDefCod = P006P5_A833TipDefCod[0] ;
               n833TipDefCod = P006P5_n833TipDefCod[0] ;
               AV32DisReo = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            GXv_char4[0] = A396EmprCod ;
            GXv_int5[0] = A252CliCod ;
            GXv_char6[0] = A335DisArtCod ;
            GXv_char7[0] = A362DisColNom ;
            GXv_int8[0] = A363DisColNum ;
            GXv_int1[0] = A390DisTipCol ;
            GXv_int9[0] = AV39Matiz ;
            GXv_int10[0] = AV49IntCod ;
            GXv_char11[0] = AV51Tono ;
            new app.pbuscma3(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char6, GXv_char7, GXv_int8, GXv_int1, GXv_int9, GXv_int10, GXv_char11) ;
            pgenbamh.this.A396EmprCod = GXv_char4[0] ;
            pgenbamh.this.A252CliCod = GXv_int5[0] ;
            pgenbamh.this.A335DisArtCod = GXv_char6[0] ;
            pgenbamh.this.A362DisColNom = GXv_char7[0] ;
            pgenbamh.this.A363DisColNum = GXv_int8[0] ;
            pgenbamh.this.A390DisTipCol = GXv_int1[0] ;
            pgenbamh.this.AV39Matiz = GXv_int9[0] ;
            pgenbamh.this.AV49IntCod = GXv_int10[0] ;
            pgenbamh.this.AV51Tono = GXv_char11[0] ;
            /*
               INSERT RECORD ON TABLE TXPBARCAD

            */
            W396EmprCod = A396EmprCod ;
            W361DisCod = A361DisCod ;
            A396EmprCod = AV15EmprCod ;
            if ( AV28Flag == 0 )
            {
               A129BarCod = AV16DisCod ;
               AV27BarCod = AV16DisCod ;
               AV40Mensa = GXutil.concat( httpContext.getMessage( "Generando Hoja de Ruta", ""), GXutil.str( AV27BarCod, 8, 0), " ") ;
               System.out.println( AV40Mensa );
            }
            else
            {
               A129BarCod = AV26ContVal ;
               AV27BarCod = AV26ContVal ;
               AV40Mensa = GXutil.concat( httpContext.getMessage( "Generando Hoja de Ruta", ""), GXutil.str( AV26ContVal, 8, 0), " ") ;
               System.out.println( AV40Mensa );
            }
            A132BarCodReo = (byte)(0) ;
            A130BarCodPar = " " ;
            A361DisCod = AV16DisCod ;
            A143BarDisNum = A360DisCliNum ;
            A212BarSer = A335DisArtCod ;
            A217BarTipArt = A352DisArtTip ;
            n217BarTipArt = false ;
            A135BarColNom = A362DisColNom ;
            A136BarColNum = A363DisColNum ;
            A1234BarNomCli = A1195DisNomCli ;
            A1235BarNumCli = A1196DisNumCli ;
            A218BarTipCol = A390DisTipCol ;
            A159BarFecGen = A369DisFec ;
            if ( ( AV59SILTEK == 1 ) || ( AV60TESPEC == 1 ) )
            {
               A2836BarPle2 = A2835DisPle2 ;
            }
            if ( ( AV47Flag2 == 1 ) || ( AV53FlagBros == 1 ) || ( AV61FlagGas == 1 ) || ( AV68Magosa == 1 ) )
            {
               A159BarFecGen = GXutil.today( ) ;
            }
            A192BarNumUni = A375DisNumUni ;
            A228BarUniMed = A392DisUniMed ;
            A155BarFecCli = A370DisFecCli ;
            if ( AV47Flag2 == 1 )
            {
               A155BarFecCli = Gx_date ;
            }
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
            {
               A191BarNumPie = A387DisPiePie ;
            }
            else
            {
               A191BarNumPie = A386DisPieNor ;
            }
            A158BarFecFpr = A371DisFecEnt ;
            A180BarMaqCod = AV17MaqCod ;
            A236BarVolMaq = AV52Volumen ;
            A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
            if ( GXutil.strcmp(A341DisArtOpe, httpContext.getMessage( "SI", "")) == 0 )
            {
               A193BarOpeEsp = (byte)(1) ;
            }
            else
            {
               if ( ( GXutil.strcmp(A475FindCol, "xxx") == 0 ) || ( AV32DisReo == 1 ) )
               {
                  if ( GXutil.strcmp(A475FindCol, "xxx") == 0 )
                  {
                     if ( (0==AV41Flag1) )
                     {
                        A193BarOpeEsp = (byte)(4) ;
                     }
                     else
                     {
                        A193BarOpeEsp = (byte)(0) ;
                     }
                  }
                  else
                  {
                     if ( AV32DisReo == 1 )
                     {
                        A193BarOpeEsp = (byte)(7) ;
                     }
                  }
               }
               else
               {
                  A193BarOpeEsp = (byte)(0) ;
               }
            }
            A235BarUrg = A359DisArtUrg ;
            A182BarMat = A340DisArtMat ;
            A211BarRdt = A350DisArtRdt ;
            A221BarTra1 = A353DisArtTr1 ;
            A224BarTraP1 = A344DisArtPt1 ;
            A222BarTra2 = A354DisArtTr2 ;
            A225BarTraP2 = A345DisArtPt2 ;
            A223BarTra3 = A355DisArtTr3 ;
            A226BarTraP3 = A346DisArtPt3 ;
            A229BarUrd1 = A356DisArtUr1 ;
            A232BarUrdP1 = A347DisArtPu1 ;
            A230BarUrd2 = A357DisArtUr2 ;
            A233BarUrdP2 = A348DisArtPu2 ;
            A231BarUrd3 = A358DisArtUr3 ;
            A234BarUrdP3 = A349DisArtPu3 ;
            A127BarAncCru1 = AV29BarAncCru1 ;
            A128BarAncCru2 = AV30BarAncCru2 ;
            A125BarAncAca1 = A334DisArtAnh ;
            A126BarAncAca2 = AV31BarAncAca2 ;
            A206BarPle = A343DisArtPle ;
            A177BarLar = A339DisArtLar ;
            A214BarSua = A351DisArtSua ;
            A118BarAcaQui = A333DisArtAca ;
            A139BarCorOri = A336DisArtCor ;
            A145BarEncOri = A338DisArtEnc ;
            A146BarEst = AV20FlagA ;
            A2826BarNumLot = A2831DisNumLot ;
            A2827BarKgsLot = A2832DisKgsLot ;
            A2828BarMtrLot = A2833DisMtrLot ;
            if ( GXutil.strcmp(A475FindCol, "xxx") == 0 )
            {
               A213BarSit = (byte)(2) ;
               A147BarEstCol = (byte)(0) ;
            }
            else
            {
               A213BarSit = (byte)(1) ;
               A147BarEstCol = (byte)(1) ;
            }
            if ( ( AV47Flag2 == 1 ) && ( AV46CtrFor == 1 ) )
            {
               A213BarSit = (byte)(2) ;
            }
            if ( ( AV58FlagCtrFor == 1 ) && ( AV46CtrFor == 1 ) )
            {
               A213BarSit = (byte)(2) ;
            }
            if ( ( AV70itram == 1 ) && ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "E", "")) == 0 ) )
            {
               GXv_char11[0] = A396EmprCod ;
               GXv_int8[0] = A252CliCod ;
               GXv_char7[0] = A335DisArtCod ;
               GXv_char6[0] = A362DisColNom ;
               GXv_char4[0] = AV71ok ;
               new app.pcestam(remoteHandle, context).execute( GXv_char11, GXv_int8, GXv_char7, GXv_char6, GXv_char4) ;
               pgenbamh.this.A396EmprCod = GXv_char11[0] ;
               pgenbamh.this.A252CliCod = GXv_int8[0] ;
               pgenbamh.this.A335DisArtCod = GXv_char7[0] ;
               pgenbamh.this.A362DisColNom = GXv_char6[0] ;
               pgenbamh.this.AV71ok = GXv_char4[0] ;
               if ( GXutil.strcmp(AV71ok, httpContext.getMessage( "S", "")) == 0 )
               {
                  A213BarSit = (byte)(1) ;
               }
            }
            A209BarPri = A757PriCod ;
            A138BarConReo = (byte)(0) ;
            A137BarConPar = " " ;
            A189BarNumAny = (short)(0) ;
            A141BarCosPro = DecimalUtil.doubleToDec(0) ;
            A140BarCosAny = DecimalUtil.doubleToDec(0) ;
            A169BarKgsFac = DecimalUtil.doubleToDec(0) ;
            if ( AV32DisReo == 1 )
            {
               A148BarEstReo = (byte)(2) ;
            }
            else
            {
               A148BarEstReo = (byte)(0) ;
            }
            A196BarOrdReo = (byte)(0) ;
            A158BarFecFpr = A371DisFecEnt ;
            A120BarAgrEst = httpContext.getMessage( "N", "") ;
            A864BarPes = A342DisArtPes ;
            A921BarMatiz = AV39Matiz ;
            A1499BarNMez = A999DisNMez ;
            A1500BarNMtr = A998DisNMtr ;
            A1878BarNumTen = A1002DisNumTen ;
            A2010BarTipDis = A2009DisTipDis ;
            A1652BarSerDsc = A337DisArtDsc ;
            A178BarLis = (byte)(0) ;
            if ( AV41Flag1 == 1 )
            {
               if ( ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "A", "")) == 0 ) )
               {
                  A178BarLis = (byte)(1) ;
               }
               A4937BarCtrPdas = (byte)(0) ;
               n4937BarCtrPdas = false ;
            }
            A1832BarLisInd = (byte)(0) ;
            A2311BarCliDes = A2310DisCliDes ;
            A2746BarCodTex = A2742DisCodTex ;
            n2746BarCodTex = false ;
            A2752BarNumTex1 = A2743DisNumTex1 ;
            A2753BarNumTex2 = A2744DisNumTex2 ;
            n2753BarNumTex2 = false ;
            A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
            A2485BarColPes = httpContext.getMessage( "N", "") ;
            A2498BarPrdPes = httpContext.getMessage( "N", "") ;
            A2499BarRDos1 = httpContext.getMessage( "N", "") ;
            A2500BarRDos2 = httpContext.getMessage( "N", "") ;
            if ( AV48FlagPer == 1 )
            {
               GXv_char11[0] = AV15EmprCod ;
               GXv_int8[0] = AV16DisCod ;
               GXv_char7[0] = AV50BarProPer ;
               new app.pbusdl(remoteHandle, context).execute( GXv_char11, GXv_int8, GXv_char7) ;
               pgenbamh.this.AV15EmprCod = GXv_char11[0] ;
               pgenbamh.this.AV16DisCod = GXv_int8[0] ;
               pgenbamh.this.AV50BarProPer = GXv_char7[0] ;
               if ( (0==AV49IntCod) )
               {
                  A2830BarIntPer = (byte)(0) ;
               }
               else
               {
                  A2830BarIntPer = AV49IntCod ;
               }
               A2829BarProPer = AV50BarProPer ;
            }
            A3030BarPlf = A2926DisPla ;
            A3310BarFac = A3306DisFac ;
            A3311BarManCod1 = A3307DisManCod1 ;
            A3312BarManCod2 = A3308DisManCod2 ;
            if ( AV53FlagBros == 1 )
            {
               A2830BarIntPer = (byte)(99) ;
               A1832BarLisInd = (byte)(0) ;
            }
            A3133BarNumCor = A3127DisNumCor ;
            A3134BarAncSal1 = A3128DisAncSal1 ;
            A3135BarAncSal2 = A3129DisAncSal2 ;
            A3136BarAncSal3 = A3130DisAncSal3 ;
            A3137BarGraAca2 = A3131DisGraAca2 ;
            A3138BarGraCru2 = A3132DisGraCru2 ;
            A3313BarNumTon = AV51Tono ;
            A1003BarFecLan = GXutil.nullDate() ;
            n1003BarFecLan = false ;
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3627DisFecLan)) )
            {
               A1003BarFecLan = A3627DisFecLan ;
               n1003BarFecLan = false ;
            }
            if ( AV61FlagGas == 1 )
            {
               A145BarEncOri = A338DisArtEnc ;
               A139BarCorOri = A336DisArtCor ;
            }
            A5367BarAntp = A5366DisAntp ;
            A3745BarFoa = GXutil.space( (short)(1)) ;
            A2400BarManCod = (short)(0) ;
            A5253BarAcc = A5252DisAcc ;
            A161BarFecSal = GXutil.nullDate() ;
            A4832BarAudFec = A8887DisFchT ;
            n4832BarAudFec = false ;
            A4835BarAudOpeN = A8885DisFEnt ;
            n4835BarAudOpeN = false ;
            A4837BarAudSupN = A8886DisDest ;
            n4837BarAudSupN = false ;
            A4458BarCruKgs = A4470DisCruKgs ;
            n4458BarCruKgs = false ;
            if ( ( GXutil.strcmp(A7739DisExp, httpContext.getMessage( "N", "")) != 0 ) && ( AV53FlagBros == 1 ) )
            {
               A146BarEst = (byte)(1) ;
            }
            A3594BarPriTin = (byte)(80) ;
            A5034BarEstTip = A5032DisEstTip ;
            /* Using cursor P006P6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A120BarAgrEst, A180BarMaqCod, Integer.valueOf(A236BarVolMaq), Integer.valueOf(A361DisCod), A143BarDisNum, A212BarSer, Boolean.valueOf(n217BarTipArt), Short.valueOf(A217BarTipArt), A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), A159BarFecGen, A192BarNumUni, A228BarUniMed, Byte.valueOf(A148BarEstReo), A155BarFecCli, Short.valueOf(A191BarNumPie), Byte.valueOf(A196BarOrdReo), Byte.valueOf(A193BarOpeEsp), A161BarFecSal, Byte.valueOf(A235BarUrg), A182BarMat, A211BarRdt, A221BarTra1, Short.valueOf(A224BarTraP1), A222BarTra2, Short.valueOf(A225BarTraP2), A223BarTra3, Short.valueOf(A226BarTraP3), A229BarUrd1, Short.valueOf(A232BarUrdP1), A230BarUrd2, Short.valueOf(A233BarUrdP2), A231BarUrd3, Short.valueOf(A234BarUrdP3), Short.valueOf(A127BarAncCru1), Short.valueOf(A128BarAncCru2), Short.valueOf(A125BarAncAca1), Short.valueOf(A126BarAncAca2), A206BarPle, A177BarLar, A214BarSua, A118BarAcaQui, A139BarCorOri, A145BarEncOri, Byte.valueOf(A146BarEst), Byte.valueOf(A213BarSit), A209BarPri, Byte.valueOf(A138BarConReo), A137BarConPar, Short.valueOf(A189BarNumAny), A141BarCosPro, A140BarCosAny, A169BarKgsFac, A158BarFecFpr, Byte.valueOf(A147BarEstCol), Byte.valueOf(A178BarLis), Short.valueOf(A864BarPes), Boolean.valueOf(n1003BarFecLan), A1003BarFecLan, Short.valueOf(A921BarMatiz), A1234BarNomCli, Integer.valueOf(A1235BarNumCli), A1500BarNMtr, A1499BarNMez, A1652BarSerDsc, Byte.valueOf(A1832BarLisInd), A1878BarNumTen, A2010BarTipDis, Integer.valueOf(A2311BarCliDes), Short.valueOf(A2400BarManCod), A2485BarColPes, A2498BarPrdPes, A2499BarRDos1, A2500BarRDos2, Boolean.valueOf(n2746BarCodTex), A2746BarCodTex, Byte.valueOf(A2752BarNumTex1), Boolean.valueOf(n2753BarNumTex2), Short.valueOf(A2753BarNumTex2), A2759BarMaqGru, Integer.valueOf(A2826BarNumLot), A2827BarKgsLot, A2828BarMtrLot, A2829BarProPer, Byte.valueOf(A2830BarIntPer), A3030BarPlf, A2836BarPle2, Short.valueOf(A3133BarNumCor), Short.valueOf(A3134BarAncSal1), Short.valueOf(A3135BarAncSal2), Short.valueOf(A3136BarAncSal3), Short.valueOf(A3137BarGraAca2), Short.valueOf(A3138BarGraCru2), A3310BarFac, Short.valueOf(A3311BarManCod1), Short.valueOf(A3312BarManCod2), A3313BarNumTon, A3745BarFoa, Boolean.valueOf(n4458BarCruKgs), A4458BarCruKgs, Boolean.valueOf(n4937BarCtrPdas), Byte.valueOf(A4937BarCtrPdas), A5034BarEstTip, A5253BarAcc, A5367BarAntp, Boolean.valueOf(n4832BarAudFec), A4832BarAudFec, Boolean.valueOf(n4835BarAudOpeN), A4835BarAudOpeN, Boolean.valueOf(n4837BarAudSupN), A4837BarAudSupN, Byte.valueOf(A3594BarPriTin), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            if ( (pr_default.getStatus(3) == 1) )
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
            A361DisCod = W361DisCod ;
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPDISBAR

            */
            A1146DisDisCod = AV16DisCod ;
            if ( AV28Flag == 0 )
            {
               A1139DisBarCod = AV16DisCod ;
            }
            else
            {
               A1139DisBarCod = AV26ContVal ;
            }
            A1140DisBarReo = (byte)(0) ;
            A1141DisBarPar = " " ;
            /* Using cursor P006P7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A1146DisDisCod), Integer.valueOf(A1139DisBarCod), Byte.valueOf(A1140DisBarReo), A1141DisBarPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISBAR");
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
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPBARPIE

            */
            W396EmprCod = A396EmprCod ;
            A396EmprCod = AV15EmprCod ;
            A129BarCod = AV27BarCod ;
            A132BarCodReo = (byte)(0) ;
            A130BarCodPar = " " ;
            A44AlbRecCod = 0 ;
            A200BarPieCod = httpContext.getMessage( "NO PIEZA", "") ;
            A203BarPieKil = A375DisNumUni ;
            A205BarPieMet = DecimalUtil.ZERO ;
            A1501BarPiePie = A374DisNumPie ;
            A201BarPieEst = (byte)(0) ;
            /* Using cursor P006P8 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), Integer.valueOf(A1501BarPiePie)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            if ( (pr_default.getStatus(5) == 1) )
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
            /* End Insert */
            if ( AV67F_nr == 1 )
            {
               GXv_char11[0] = AV15EmprCod ;
               GXv_char7[0] = A966PartCod ;
               GXv_int8[0] = AV19CliCod ;
               GXv_int5[0] = AV27BarCod ;
               GXv_int10[0] = (byte)(0) ;
               GXv_char6[0] = " " ;
               GXv_int12[0] = AV16DisCod ;
               new app.phdrnrp(remoteHandle, context).execute( GXv_char11, GXv_char7, GXv_int8, GXv_int5, GXv_int10, GXv_char6, GXv_int12) ;
               pgenbamh.this.AV15EmprCod = GXv_char11[0] ;
               pgenbamh.this.A966PartCod = GXv_char7[0] ;
               pgenbamh.this.AV19CliCod = GXv_int8[0] ;
               pgenbamh.this.AV27BarCod = GXv_int5[0] ;
               pgenbamh.this.AV16DisCod = GXv_int12[0] ;
            }
            GXv_char11[0] = AV15EmprCod ;
            GXv_int12[0] = AV16DisCod ;
            GXv_int8[0] = AV27BarCod ;
            new app.pfasbar(remoteHandle, context).execute( GXv_char11, GXv_int12, GXv_int8) ;
            pgenbamh.this.AV15EmprCod = GXv_char11[0] ;
            pgenbamh.this.AV16DisCod = GXv_int12[0] ;
            pgenbamh.this.AV27BarCod = GXv_int8[0] ;
            A367DisEst = (byte)(3) ;
            AV63Nr_codigo = 0 ;
            AV64Nr_opecod = 0 ;
            AV65TipCsClq = (short)(0) ;
            /* Using cursor P006P9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Integer.valueOf(AV19CliCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A7090Nr_PartCod = P006P9_A7090Nr_PartCod[0] ;
               n7090Nr_PartCod = P006P9_n7090Nr_PartCod[0] ;
               A5340Nr_CliCod = P006P9_A5340Nr_CliCod[0] ;
               n5340Nr_CliCod = P006P9_n5340Nr_CliCod[0] ;
               A5198Nr_codigo = P006P9_A5198Nr_codigo[0] ;
               A5906Nr_OpeCod = P006P9_A5906Nr_OpeCod[0] ;
               n5906Nr_OpeCod = P006P9_n5906Nr_OpeCod[0] ;
               A5904Nr_TipCsCL = P006P9_A5904Nr_TipCsCL[0] ;
               n5904Nr_TipCsCL = P006P9_n5904Nr_TipCsCL[0] ;
               AV63Nr_codigo = A5198Nr_codigo ;
               AV64Nr_opecod = A5906Nr_OpeCod ;
               AV65TipCsClq = A5904Nr_TipCsCL ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            /* Using cursor P006P10 */
            pr_default.execute(7, new Object[] {AV15EmprCod, Integer.valueOf(AV16DisCod)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A319DefPor = P006P10_A319DefPor[0] ;
               A833TipDefCod = P006P10_A833TipDefCod[0] ;
               n833TipDefCod = P006P10_n833TipDefCod[0] ;
               A361DisCod = P006P10_A361DisCod[0] ;
               A396EmprCod = P006P10_A396EmprCod[0] ;
               W396EmprCod = A396EmprCod ;
               if ( AV63Nr_codigo > 0 )
               {
                  AV66Num_fic = AV63Nr_codigo ;
               }
               /*
                  INSERT RECORD ON TABLE TXPHISREO

               */
               W396EmprCod = A396EmprCod ;
               W833TipDefCod = A833TipDefCod ;
               n833TipDefCod = false ;
               W602MaqCod = A602MaqCod ;
               n602MaqCod = false ;
               A396EmprCod = AV15EmprCod ;
               if ( (0==AV26ContVal) )
               {
                  A539HisBarCod = AV16DisCod ;
               }
               else
               {
                  A539HisBarCod = AV26ContVal ;
               }
               A545HisCodReo = (byte)(0) ;
               A544HisCodPar = " " ;
               n833TipDefCod = false ;
               A571HisTipArt = A352DisArtTip ;
               n571HisTipArt = false ;
               A542HisBarSer = A335DisArtCod ;
               n542HisBarSer = false ;
               A546HisColNom = A362DisColNom ;
               n546HisColNom = false ;
               A547HisColNum = A363DisColNum ;
               n547HisColNum = false ;
               A572HisTipCol = A390DisTipCol ;
               n572HisTipCol = false ;
               A553HisNumPie = A374DisNumPie ;
               n553HisNumPie = false ;
               A540HisBarKgm = A375DisNumUni.multiply(DecimalUtil.doubleToDec(A319DefPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               n540HisBarKgm = false ;
               A602MaqCod = AV17MaqCod ;
               n602MaqCod = false ;
               A569HisReoFec = A369DisFec ;
               n569HisReoFec = false ;
               A549HisKgmOri = A375DisNumUni ;
               n549HisKgmOri = false ;
               A554HisOrdReo = (byte)(0) ;
               n554HisOrdReo = false ;
               A548HisEstReo = (byte)(2) ;
               n548HisEstReo = false ;
               A2297HisReoTn = AV66Num_fic ;
               n2297HisReoTn = false ;
               A2299HisReoDsc = A337DisArtDsc ;
               n2299HisReoDsc = false ;
               A5356Hisoperar = AV64Nr_opecod ;
               n5356Hisoperar = false ;
               A5085CodCausa = AV65TipCsClq ;
               n5085CodCausa = false ;
               /* Using cursor P006P11 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod), Boolean.valueOf(n571HisTipArt), Short.valueOf(A571HisTipArt), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n542HisBarSer), A542HisBarSer, Boolean.valueOf(n546HisColNom), A546HisColNom, Boolean.valueOf(n547HisColNum), Integer.valueOf(A547HisColNum), Boolean.valueOf(n572HisTipCol), Byte.valueOf(A572HisTipCol), Boolean.valueOf(n553HisNumPie), Short.valueOf(A553HisNumPie), Boolean.valueOf(n540HisBarKgm), A540HisBarKgm, Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n569HisReoFec), A569HisReoFec, Boolean.valueOf(n549HisKgmOri), A549HisKgmOri, Boolean.valueOf(n554HisOrdReo), Byte.valueOf(A554HisOrdReo), Boolean.valueOf(n548HisEstReo), Byte.valueOf(A548HisEstReo), Boolean.valueOf(n2297HisReoTn), Integer.valueOf(A2297HisReoTn), Boolean.valueOf(n2299HisReoDsc), A2299HisReoDsc, Boolean.valueOf(n5085CodCausa), Short.valueOf(A5085CodCausa), Boolean.valueOf(n5356Hisoperar), Integer.valueOf(A5356Hisoperar)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
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
               A396EmprCod = W396EmprCod ;
               A833TipDefCod = W833TipDefCod ;
               n833TipDefCod = false ;
               A602MaqCod = W602MaqCod ;
               n602MaqCod = false ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               pr_default.readNext(7);
            }
            pr_default.close(7);
            if ( AV62FlagVALOHR == 1 )
            {
               GXv_char11[0] = AV15EmprCod ;
               GXv_int12[0] = AV27BarCod ;
               GXv_int10[0] = (byte)(0) ;
               GXv_char7[0] = " " ;
               GXv_char6[0] = httpContext.getMessage( "A", "") ;
               new app.pgenalm(remoteHandle, context).execute( GXv_char11, GXv_int12, GXv_int10, GXv_char7, GXv_char6) ;
               pgenbamh.this.AV15EmprCod = GXv_char11[0] ;
               pgenbamh.this.AV27BarCod = GXv_int12[0] ;
            }
            if ( GXutil.strcmp(GXutil.substring( A966PartCod, 1, 4), httpContext.getMessage( "STKI", "")) == 0 )
            {
               GXv_char11[0] = A396EmprCod ;
               GXv_int12[0] = A361DisCod ;
               GXv_int10[0] = (byte)(0) ;
               GXv_char7[0] = " " ;
               new app.pnewstki(remoteHandle, context).execute( GXv_char11, GXv_int12, GXv_int10, GXv_char7) ;
               pgenbamh.this.A396EmprCod = GXv_char11[0] ;
               pgenbamh.this.A361DisCod = GXv_int12[0] ;
               if ( GXutil.strcmp(A5910PartCnf, httpContext.getMessage( "S", "")) == 0 )
               {
                  GXv_char11[0] = A396EmprCod ;
                  GXv_int12[0] = A361DisCod ;
                  GXv_int10[0] = (byte)(0) ;
                  GXv_char7[0] = " " ;
                  new app.pstkifas(remoteHandle, context).execute( GXv_char11, GXv_int12, GXv_int10, GXv_char7) ;
                  pgenbamh.this.A396EmprCod = GXv_char11[0] ;
                  pgenbamh.this.A361DisCod = GXv_int12[0] ;
               }
            }
            /* Using cursor P006P12 */
            pr_default.execute(9, new Object[] {Byte.valueOf(A367DisEst), A396EmprCod, Integer.valueOf(A361DisCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
            A396EmprCod = W396EmprCod ;
            A361DisCod = W361DisCod ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'ANCHOS' Routine */
      returnInSub = false ;
      AV29BarAncCru1 = (short)(0) ;
      AV30BarAncCru2 = (short)(0) ;
      AV31BarAncAca2 = (short)(0) ;
      /* Using cursor P006P13 */
      pr_default.execute(10, new Object[] {AV15EmprCod, Integer.valueOf(AV19CliCod), AV38DisArtCod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A252CliCod = P006P13_A252CliCod[0] ;
         n252CliCod = P006P13_n252CliCod[0] ;
         A65ArtCod = P006P13_A65ArtCod[0] ;
         A396EmprCod = P006P13_A396EmprCod[0] ;
         A68ArtCruMin = P006P13_A68ArtCruMin[0] ;
         n68ArtCruMin = P006P13_n68ArtCruMin[0] ;
         A67ArtCruMax = P006P13_A67ArtCruMax[0] ;
         n67ArtCruMax = P006P13_n67ArtCruMax[0] ;
         A62ArtAcaMax = P006P13_A62ArtAcaMax[0] ;
         n62ArtAcaMax = P006P13_n62ArtAcaMax[0] ;
         AV29BarAncCru1 = A68ArtCruMin ;
         AV30BarAncCru2 = A67ArtCruMax ;
         AV31BarAncAca2 = A62ArtAcaMax ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S121( )
   {
      /* 'CTRFOR' Routine */
      returnInSub = false ;
      AV46CtrFor = (byte)(0) ;
      /* Using cursor P006P14 */
      pr_default.execute(11, new Object[] {AV15EmprCod, Integer.valueOf(AV19CliCod), AV42ForSer, AV43ForcolNom, Integer.valueOf(AV44ForcolNum), Byte.valueOf(AV45TipCol)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A831TipColCod = P006P14_A831TipColCod[0] ;
         A483ForColNum = P006P14_A483ForColNum[0] ;
         A482ForColNom = P006P14_A482ForColNom[0] ;
         A494ForSer = P006P14_A494ForSer[0] ;
         A252CliCod = P006P14_A252CliCod[0] ;
         n252CliCod = P006P14_n252CliCod[0] ;
         A396EmprCod = P006P14_A396EmprCod[0] ;
         A484ForCon = P006P14_A484ForCon[0] ;
         AV46CtrFor = A484ForCon ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgenbamh.this.AV15EmprCod;
      this.aP1[0] = pgenbamh.this.AV16DisCod;
      this.aP2[0] = pgenbamh.this.AV17MaqCod;
      this.aP3[0] = pgenbamh.this.AV20FlagA;
      Application.commitDataStores(context, remoteHandle, pr_default, "pgenbamh");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public int getDisPieNor0( String E396EmprCod ,
                             int E361DisCod )
   {
      X673Piezas = 0 ;
      /* Using cursor P006P15 */
      pr_default.execute(12, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         X673Piezas = P006P15_A673Piezas[0] ;
      }
      pr_default.close(12);
      return X673Piezas ;
   }

   public void initialize( )
   {
      AV56FechaLim = GXutil.nullDate() ;
      AV57FecPrue = GXutil.nullDate() ;
      scmdbuf = "" ;
      P006P2_A602MaqCod = new String[] {""} ;
      P006P2_n602MaqCod = new boolean[] {false} ;
      P006P2_A396EmprCod = new String[] {""} ;
      P006P2_A624MaqVolMed = new int[1] ;
      P006P2_n624MaqVolMed = new boolean[] {false} ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      P006P4_A966PartCod = new String[] {""} ;
      P006P4_n966PartCod = new boolean[] {false} ;
      P006P4_A374DisNumPie = new short[1] ;
      P006P4_A360DisCliNum = new String[] {""} ;
      P006P4_A352DisArtTip = new short[1] ;
      P006P4_A1195DisNomCli = new String[] {""} ;
      P006P4_A1196DisNumCli = new int[1] ;
      P006P4_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P006P4_A2835DisPle2 = new String[] {""} ;
      P006P4_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006P4_A392DisUniMed = new String[] {""} ;
      P006P4_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P006P4_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P006P4_A341DisArtOpe = new String[] {""} ;
      P006P4_A359DisArtUrg = new byte[1] ;
      P006P4_A340DisArtMat = new String[] {""} ;
      P006P4_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006P4_A353DisArtTr1 = new String[] {""} ;
      P006P4_A344DisArtPt1 = new short[1] ;
      P006P4_A354DisArtTr2 = new String[] {""} ;
      P006P4_A345DisArtPt2 = new short[1] ;
      P006P4_A355DisArtTr3 = new String[] {""} ;
      P006P4_A346DisArtPt3 = new short[1] ;
      P006P4_A356DisArtUr1 = new String[] {""} ;
      P006P4_A347DisArtPu1 = new short[1] ;
      P006P4_A357DisArtUr2 = new String[] {""} ;
      P006P4_A348DisArtPu2 = new short[1] ;
      P006P4_A358DisArtUr3 = new String[] {""} ;
      P006P4_A349DisArtPu3 = new short[1] ;
      P006P4_n349DisArtPu3 = new boolean[] {false} ;
      P006P4_A334DisArtAnh = new short[1] ;
      P006P4_A343DisArtPle = new String[] {""} ;
      P006P4_A339DisArtLar = new String[] {""} ;
      P006P4_A351DisArtSua = new String[] {""} ;
      P006P4_A333DisArtAca = new String[] {""} ;
      P006P4_A336DisArtCor = new String[] {""} ;
      P006P4_A338DisArtEnc = new String[] {""} ;
      P006P4_A2831DisNumLot = new int[1] ;
      P006P4_A2832DisKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006P4_A2833DisMtrLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006P4_A2009DisTipDis = new String[] {""} ;
      P006P4_n2009DisTipDis = new boolean[] {false} ;
      P006P4_A757PriCod = new String[] {""} ;
      P006P4_A342DisArtPes = new short[1] ;
      P006P4_A999DisNMez = new String[] {""} ;
      P006P4_A998DisNMtr = new String[] {""} ;
      P006P4_A1002DisNumTen = new String[] {""} ;
      P006P4_n1002DisNumTen = new boolean[] {false} ;
      P006P4_A337DisArtDsc = new String[] {""} ;
      P006P4_A2310DisCliDes = new int[1] ;
      P006P4_A2742DisCodTex = new String[] {""} ;
      P006P4_n2742DisCodTex = new boolean[] {false} ;
      P006P4_A2743DisNumTex1 = new byte[1] ;
      P006P4_A2744DisNumTex2 = new short[1] ;
      P006P4_n2744DisNumTex2 = new boolean[] {false} ;
      P006P4_A2926DisPla = new String[] {""} ;
      P006P4_A3306DisFac = new String[] {""} ;
      P006P4_A3307DisManCod1 = new short[1] ;
      P006P4_A3308DisManCod2 = new short[1] ;
      P006P4_A3127DisNumCor = new short[1] ;
      P006P4_A3128DisAncSal1 = new short[1] ;
      P006P4_A3129DisAncSal2 = new short[1] ;
      P006P4_A3130DisAncSal3 = new short[1] ;
      P006P4_A3131DisGraAca2 = new short[1] ;
      P006P4_A3132DisGraCru2 = new short[1] ;
      P006P4_A3627DisFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      P006P4_n3627DisFecLan = new boolean[] {false} ;
      P006P4_A5366DisAntp = new String[] {""} ;
      P006P4_A5252DisAcc = new String[] {""} ;
      P006P4_A8887DisFchT = new java.util.Date[] {GXutil.nullDate()} ;
      P006P4_n8887DisFchT = new boolean[] {false} ;
      P006P4_A8885DisFEnt = new String[] {""} ;
      P006P4_n8885DisFEnt = new boolean[] {false} ;
      P006P4_A8886DisDest = new String[] {""} ;
      P006P4_A4470DisCruKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006P4_A7739DisExp = new String[] {""} ;
      P006P4_A5032DisEstTip = new String[] {""} ;
      P006P4_A361DisCod = new int[1] ;
      P006P4_A1968DisRes = new String[] {""} ;
      P006P4_n1968DisRes = new boolean[] {false} ;
      P006P4_A367DisEst = new byte[1] ;
      P006P4_A387DisPiePie = new short[1] ;
      P006P4_n387DisPiePie = new boolean[] {false} ;
      P006P4_A390DisTipCol = new byte[1] ;
      P006P4_n390DisTipCol = new boolean[] {false} ;
      P006P4_A363DisColNum = new int[1] ;
      P006P4_n363DisColNum = new boolean[] {false} ;
      P006P4_A362DisColNom = new String[] {""} ;
      P006P4_n362DisColNom = new boolean[] {false} ;
      P006P4_A335DisArtCod = new String[] {""} ;
      P006P4_A252CliCod = new int[1] ;
      P006P4_n252CliCod = new boolean[] {false} ;
      P006P4_A396EmprCod = new String[] {""} ;
      P006P4_A365DisDes = new String[] {""} ;
      A966PartCod = "" ;
      A360DisCliNum = "" ;
      A1195DisNomCli = "" ;
      A369DisFec = GXutil.nullDate() ;
      A2835DisPle2 = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      A370DisFecCli = GXutil.nullDate() ;
      A371DisFecEnt = GXutil.nullDate() ;
      A341DisArtOpe = "" ;
      A340DisArtMat = "" ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      A353DisArtTr1 = "" ;
      A354DisArtTr2 = "" ;
      A355DisArtTr3 = "" ;
      A356DisArtUr1 = "" ;
      A357DisArtUr2 = "" ;
      A358DisArtUr3 = "" ;
      A343DisArtPle = "" ;
      A339DisArtLar = "" ;
      A351DisArtSua = "" ;
      A333DisArtAca = "" ;
      A336DisArtCor = "" ;
      A338DisArtEnc = "" ;
      A2832DisKgsLot = DecimalUtil.ZERO ;
      A2833DisMtrLot = DecimalUtil.ZERO ;
      A2009DisTipDis = "" ;
      A757PriCod = "" ;
      A999DisNMez = "" ;
      A998DisNMtr = "" ;
      A1002DisNumTen = "" ;
      A337DisArtDsc = "" ;
      A2742DisCodTex = "" ;
      A2926DisPla = "" ;
      A3306DisFac = "" ;
      A3627DisFecLan = GXutil.nullDate() ;
      A5366DisAntp = "" ;
      A5252DisAcc = "" ;
      A8887DisFchT = GXutil.nullDate() ;
      A8885DisFEnt = "" ;
      A8886DisDest = "" ;
      A4470DisCruKgs = DecimalUtil.ZERO ;
      A7739DisExp = "" ;
      A5032DisEstTip = "" ;
      A1968DisRes = "" ;
      A362DisColNom = "" ;
      A335DisArtCod = "" ;
      A365DisDes = "" ;
      A475FindCol = "" ;
      GXt_char3 = "" ;
      W396EmprCod = "" ;
      AV42ForSer = "" ;
      AV43ForcolNom = "" ;
      AV38DisArtCod = "" ;
      P006P5_A396EmprCod = new String[] {""} ;
      P006P5_A361DisCod = new int[1] ;
      P006P5_A319DefPor = new short[1] ;
      P006P5_A833TipDefCod = new short[1] ;
      P006P5_n833TipDefCod = new boolean[] {false} ;
      GXv_int1 = new byte[1] ;
      GXv_int9 = new short[1] ;
      AV51Tono = "" ;
      AV40Mensa = "" ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A2836BarPle2 = "" ;
      A192BarNumUni = DecimalUtil.ZERO ;
      A228BarUniMed = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A180BarMaqCod = "" ;
      A2759BarMaqGru = "" ;
      A182BarMat = "" ;
      A211BarRdt = DecimalUtil.ZERO ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      A229BarUrd1 = "" ;
      A230BarUrd2 = "" ;
      A231BarUrd3 = "" ;
      A206BarPle = "" ;
      A177BarLar = "" ;
      A214BarSua = "" ;
      A118BarAcaQui = "" ;
      A139BarCorOri = "" ;
      A145BarEncOri = "" ;
      A2827BarKgsLot = DecimalUtil.ZERO ;
      A2828BarMtrLot = DecimalUtil.ZERO ;
      AV71ok = "" ;
      GXv_char4 = new String[1] ;
      A209BarPri = "" ;
      A137BarConPar = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A169BarKgsFac = DecimalUtil.ZERO ;
      A120BarAgrEst = "" ;
      A1499BarNMez = "" ;
      A1500BarNMtr = "" ;
      A1878BarNumTen = "" ;
      A2010BarTipDis = "" ;
      A1652BarSerDsc = "" ;
      A2746BarCodTex = "" ;
      A2485BarColPes = "" ;
      A2498BarPrdPes = "" ;
      A2499BarRDos1 = "" ;
      A2500BarRDos2 = "" ;
      AV50BarProPer = "" ;
      A2829BarProPer = "" ;
      A3030BarPlf = "" ;
      A3310BarFac = "" ;
      A3313BarNumTon = "" ;
      A1003BarFecLan = GXutil.nullDate() ;
      A5367BarAntp = "" ;
      A3745BarFoa = "" ;
      A5253BarAcc = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A4832BarAudFec = GXutil.nullDate() ;
      A4835BarAudOpeN = "" ;
      A4837BarAudSupN = "" ;
      A4458BarCruKgs = DecimalUtil.ZERO ;
      A5034BarEstTip = "" ;
      Gx_emsg = "" ;
      A1141DisBarPar = "" ;
      A200BarPieCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      GXv_int5 = new int[1] ;
      GXv_int8 = new int[1] ;
      P006P9_A396EmprCod = new String[] {""} ;
      P006P9_A7090Nr_PartCod = new String[] {""} ;
      P006P9_n7090Nr_PartCod = new boolean[] {false} ;
      P006P9_A5340Nr_CliCod = new int[1] ;
      P006P9_n5340Nr_CliCod = new boolean[] {false} ;
      P006P9_A5198Nr_codigo = new int[1] ;
      P006P9_A5906Nr_OpeCod = new int[1] ;
      P006P9_n5906Nr_OpeCod = new boolean[] {false} ;
      P006P9_A5904Nr_TipCsCL = new short[1] ;
      P006P9_n5904Nr_TipCsCL = new boolean[] {false} ;
      A7090Nr_PartCod = "" ;
      P006P10_A319DefPor = new short[1] ;
      P006P10_A833TipDefCod = new short[1] ;
      P006P10_n833TipDefCod = new boolean[] {false} ;
      P006P10_A361DisCod = new int[1] ;
      P006P10_A396EmprCod = new String[] {""} ;
      W602MaqCod = "" ;
      A544HisCodPar = "" ;
      A542HisBarSer = "" ;
      A546HisColNom = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A569HisReoFec = GXutil.nullDate() ;
      A549HisKgmOri = DecimalUtil.ZERO ;
      A2299HisReoDsc = "" ;
      GXv_char6 = new String[1] ;
      A5910PartCnf = "" ;
      GXv_char11 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char7 = new String[1] ;
      P006P13_A252CliCod = new int[1] ;
      P006P13_n252CliCod = new boolean[] {false} ;
      P006P13_A65ArtCod = new String[] {""} ;
      P006P13_A396EmprCod = new String[] {""} ;
      P006P13_A68ArtCruMin = new short[1] ;
      P006P13_n68ArtCruMin = new boolean[] {false} ;
      P006P13_A67ArtCruMax = new short[1] ;
      P006P13_n67ArtCruMax = new boolean[] {false} ;
      P006P13_A62ArtAcaMax = new short[1] ;
      P006P13_n62ArtAcaMax = new boolean[] {false} ;
      A65ArtCod = "" ;
      P006P14_A831TipColCod = new byte[1] ;
      P006P14_A483ForColNum = new int[1] ;
      P006P14_A482ForColNom = new String[] {""} ;
      P006P14_A494ForSer = new String[] {""} ;
      P006P14_A252CliCod = new int[1] ;
      P006P14_n252CliCod = new boolean[] {false} ;
      P006P14_A396EmprCod = new String[] {""} ;
      P006P14_A484ForCon = new byte[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      E396EmprCod = "" ;
      P006P15_A673Piezas = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgenbamh__default(),
         new Object[] {
             new Object[] {
            P006P2_A602MaqCod, P006P2_A396EmprCod, P006P2_A624MaqVolMed, P006P2_n624MaqVolMed
            }
            , new Object[] {
            P006P4_A966PartCod, P006P4_n966PartCod, P006P4_A374DisNumPie, P006P4_A360DisCliNum, P006P4_A352DisArtTip, P006P4_A1195DisNomCli, P006P4_A1196DisNumCli, P006P4_A369DisFec, P006P4_A2835DisPle2, P006P4_A375DisNumUni,
            P006P4_A392DisUniMed, P006P4_A370DisFecCli, P006P4_A371DisFecEnt, P006P4_A341DisArtOpe, P006P4_A359DisArtUrg, P006P4_A340DisArtMat, P006P4_A350DisArtRdt, P006P4_A353DisArtTr1, P006P4_A344DisArtPt1, P006P4_A354DisArtTr2,
            P006P4_A345DisArtPt2, P006P4_A355DisArtTr3, P006P4_A346DisArtPt3, P006P4_A356DisArtUr1, P006P4_A347DisArtPu1, P006P4_A357DisArtUr2, P006P4_A348DisArtPu2, P006P4_A358DisArtUr3, P006P4_A349DisArtPu3, P006P4_n349DisArtPu3,
            P006P4_A334DisArtAnh, P006P4_A343DisArtPle, P006P4_A339DisArtLar, P006P4_A351DisArtSua, P006P4_A333DisArtAca, P006P4_A336DisArtCor, P006P4_A338DisArtEnc, P006P4_A2831DisNumLot, P006P4_A2832DisKgsLot, P006P4_A2833DisMtrLot,
            P006P4_A2009DisTipDis, P006P4_n2009DisTipDis, P006P4_A757PriCod, P006P4_A342DisArtPes, P006P4_A999DisNMez, P006P4_A998DisNMtr, P006P4_A1002DisNumTen, P006P4_n1002DisNumTen, P006P4_A337DisArtDsc, P006P4_A2310DisCliDes,
            P006P4_A2742DisCodTex, P006P4_n2742DisCodTex, P006P4_A2743DisNumTex1, P006P4_A2744DisNumTex2, P006P4_n2744DisNumTex2, P006P4_A2926DisPla, P006P4_A3306DisFac, P006P4_A3307DisManCod1, P006P4_A3308DisManCod2, P006P4_A3127DisNumCor,
            P006P4_A3128DisAncSal1, P006P4_A3129DisAncSal2, P006P4_A3130DisAncSal3, P006P4_A3131DisGraAca2, P006P4_A3132DisGraCru2, P006P4_A3627DisFecLan, P006P4_n3627DisFecLan, P006P4_A5366DisAntp, P006P4_A5252DisAcc, P006P4_A8887DisFchT,
            P006P4_n8887DisFchT, P006P4_A8885DisFEnt, P006P4_n8885DisFEnt, P006P4_A8886DisDest, P006P4_A4470DisCruKgs, P006P4_A7739DisExp, P006P4_A5032DisEstTip, P006P4_A361DisCod, P006P4_A1968DisRes, P006P4_n1968DisRes,
            P006P4_A367DisEst, P006P4_A387DisPiePie, P006P4_n387DisPiePie, P006P4_A390DisTipCol, P006P4_n390DisTipCol, P006P4_A363DisColNum, P006P4_n363DisColNum, P006P4_A362DisColNom, P006P4_n362DisColNom, P006P4_A335DisArtCod,
            P006P4_A252CliCod, P006P4_A396EmprCod, P006P4_A365DisDes
            }
            , new Object[] {
            P006P5_A396EmprCod, P006P5_A361DisCod, P006P5_A319DefPor, P006P5_A833TipDefCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P006P9_A396EmprCod, P006P9_A7090Nr_PartCod, P006P9_n7090Nr_PartCod, P006P9_A5340Nr_CliCod, P006P9_n5340Nr_CliCod, P006P9_A5198Nr_codigo, P006P9_A5906Nr_OpeCod, P006P9_n5906Nr_OpeCod, P006P9_A5904Nr_TipCsCL, P006P9_n5904Nr_TipCsCL
            }
            , new Object[] {
            P006P10_A319DefPor, P006P10_A833TipDefCod, P006P10_A361DisCod, P006P10_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P006P13_A252CliCod, P006P13_A65ArtCod, P006P13_A396EmprCod, P006P13_A68ArtCruMin, P006P13_n68ArtCruMin, P006P13_A67ArtCruMax, P006P13_n67ArtCruMax, P006P13_A62ArtAcaMax, P006P13_n62ArtAcaMax
            }
            , new Object[] {
            P006P14_A831TipColCod, P006P14_A483ForColNum, P006P14_A482ForColNom, P006P14_A494ForSer, P006P14_A252CliCod, P006P14_A396EmprCod, P006P14_A484ForCon
            }
            , new Object[] {
            P006P15_A673Piezas
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV20FlagA ;
   private byte AV28Flag ;
   private byte AV41Flag1 ;
   private byte AV47Flag2 ;
   private byte AV48FlagPer ;
   private byte AV53FlagBros ;
   private byte AV54FlagCtrl ;
   private byte AV58FlagCtrFor ;
   private byte AV59SILTEK ;
   private byte AV60TESPEC ;
   private byte AV61FlagGas ;
   private byte AV62FlagVALOHR ;
   private byte AV68Magosa ;
   private byte AV67F_nr ;
   private byte AV70itram ;
   private byte GXt_int2 ;
   private byte A359DisArtUrg ;
   private byte A2743DisNumTex1 ;
   private byte A367DisEst ;
   private byte A390DisTipCol ;
   private byte AV45TipCol ;
   private byte AV32DisReo ;
   private byte GXv_int1[] ;
   private byte AV49IntCod ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A193BarOpeEsp ;
   private byte A235BarUrg ;
   private byte A146BarEst ;
   private byte A213BarSit ;
   private byte A147BarEstCol ;
   private byte AV46CtrFor ;
   private byte A138BarConReo ;
   private byte A148BarEstReo ;
   private byte A196BarOrdReo ;
   private byte A178BarLis ;
   private byte A4937BarCtrPdas ;
   private byte A1832BarLisInd ;
   private byte A2752BarNumTex1 ;
   private byte A2830BarIntPer ;
   private byte A3594BarPriTin ;
   private byte A1140DisBarReo ;
   private byte A201BarPieEst ;
   private byte A545HisCodReo ;
   private byte A572HisTipCol ;
   private byte A554HisOrdReo ;
   private byte A548HisEstReo ;
   private byte GXv_int10[] ;
   private byte A831TipColCod ;
   private byte A484ForCon ;
   private short A374DisNumPie ;
   private short A352DisArtTip ;
   private short A344DisArtPt1 ;
   private short A345DisArtPt2 ;
   private short A346DisArtPt3 ;
   private short A347DisArtPu1 ;
   private short A348DisArtPu2 ;
   private short A349DisArtPu3 ;
   private short A334DisArtAnh ;
   private short A342DisArtPes ;
   private short A2744DisNumTex2 ;
   private short A3307DisManCod1 ;
   private short A3308DisManCod2 ;
   private short A3127DisNumCor ;
   private short A3128DisAncSal1 ;
   private short A3129DisAncSal2 ;
   private short A3130DisAncSal3 ;
   private short A3131DisGraAca2 ;
   private short A3132DisGraCru2 ;
   private short A387DisPiePie ;
   private short A386DisPieNor ;
   private short A319DefPor ;
   private short A833TipDefCod ;
   private short AV39Matiz ;
   private short GXv_int9[] ;
   private short A217BarTipArt ;
   private short A191BarNumPie ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A232BarUrdP1 ;
   private short A233BarUrdP2 ;
   private short A234BarUrdP3 ;
   private short A127BarAncCru1 ;
   private short AV29BarAncCru1 ;
   private short A128BarAncCru2 ;
   private short AV30BarAncCru2 ;
   private short A125BarAncAca1 ;
   private short A126BarAncAca2 ;
   private short AV31BarAncAca2 ;
   private short A189BarNumAny ;
   private short A864BarPes ;
   private short A921BarMatiz ;
   private short A2753BarNumTex2 ;
   private short A3311BarManCod1 ;
   private short A3312BarManCod2 ;
   private short A3133BarNumCor ;
   private short A3134BarAncSal1 ;
   private short A3135BarAncSal2 ;
   private short A3136BarAncSal3 ;
   private short A3137BarGraAca2 ;
   private short A3138BarGraCru2 ;
   private short A2400BarManCod ;
   private short Gx_err ;
   private short AV65TipCsClq ;
   private short A5904Nr_TipCsCL ;
   private short W833TipDefCod ;
   private short A571HisTipArt ;
   private short A553HisNumPie ;
   private short A5085CodCausa ;
   private short A68ArtCruMin ;
   private short A67ArtCruMax ;
   private short A62ArtAcaMax ;
   private int AV16DisCod ;
   private int A624MaqVolMed ;
   private int AV52Volumen ;
   private int A1196DisNumCli ;
   private int A2831DisNumLot ;
   private int A2310DisCliDes ;
   private int A361DisCod ;
   private int A363DisColNum ;
   private int A252CliCod ;
   private int W361DisCod ;
   private int AV19CliCod ;
   private int AV44ForcolNum ;
   private int AV26ContVal ;
   private int GX_INS12 ;
   private int A129BarCod ;
   private int AV27BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A236BarVolMaq ;
   private int A2826BarNumLot ;
   private int A2311BarCliDes ;
   private int GX_INS153 ;
   private int A1146DisDisCod ;
   private int A1139DisBarCod ;
   private int GX_INS18 ;
   private int A44AlbRecCod ;
   private int A1501BarPiePie ;
   private int GXv_int5[] ;
   private int GXv_int8[] ;
   private int AV63Nr_codigo ;
   private int AV64Nr_opecod ;
   private int A5340Nr_CliCod ;
   private int A5198Nr_codigo ;
   private int A5906Nr_OpeCod ;
   private int AV66Num_fic ;
   private int GX_INS60 ;
   private int A539HisBarCod ;
   private int A547HisColNum ;
   private int A2297HisReoTn ;
   private int A5356Hisoperar ;
   private int GXv_int12[] ;
   private int A483ForColNum ;
   private int X673Piezas ;
   private int E361DisCod ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal A2832DisKgsLot ;
   private java.math.BigDecimal A2833DisMtrLot ;
   private java.math.BigDecimal A4470DisCruKgs ;
   private java.math.BigDecimal A192BarNumUni ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A2827BarKgsLot ;
   private java.math.BigDecimal A2828BarMtrLot ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A169BarKgsFac ;
   private java.math.BigDecimal A4458BarCruKgs ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A549HisKgmOri ;
   private String AV15EmprCod ;
   private String AV17MaqCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String A360DisCliNum ;
   private String A1195DisNomCli ;
   private String A2835DisPle2 ;
   private String A392DisUniMed ;
   private String A341DisArtOpe ;
   private String A340DisArtMat ;
   private String A353DisArtTr1 ;
   private String A354DisArtTr2 ;
   private String A355DisArtTr3 ;
   private String A356DisArtUr1 ;
   private String A357DisArtUr2 ;
   private String A358DisArtUr3 ;
   private String A343DisArtPle ;
   private String A339DisArtLar ;
   private String A351DisArtSua ;
   private String A333DisArtAca ;
   private String A336DisArtCor ;
   private String A338DisArtEnc ;
   private String A2009DisTipDis ;
   private String A757PriCod ;
   private String A999DisNMez ;
   private String A998DisNMtr ;
   private String A1002DisNumTen ;
   private String A337DisArtDsc ;
   private String A2742DisCodTex ;
   private String A2926DisPla ;
   private String A3306DisFac ;
   private String A5366DisAntp ;
   private String A5252DisAcc ;
   private String A8885DisFEnt ;
   private String A8886DisDest ;
   private String A7739DisExp ;
   private String A5032DisEstTip ;
   private String A1968DisRes ;
   private String A362DisColNom ;
   private String A335DisArtCod ;
   private String A365DisDes ;
   private String A475FindCol ;
   private String GXt_char3 ;
   private String W396EmprCod ;
   private String AV42ForSer ;
   private String AV43ForcolNom ;
   private String AV38DisArtCod ;
   private String AV51Tono ;
   private String AV40Mensa ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A2836BarPle2 ;
   private String A228BarUniMed ;
   private String A180BarMaqCod ;
   private String A2759BarMaqGru ;
   private String A182BarMat ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String A229BarUrd1 ;
   private String A230BarUrd2 ;
   private String A231BarUrd3 ;
   private String A206BarPle ;
   private String A177BarLar ;
   private String A214BarSua ;
   private String A118BarAcaQui ;
   private String A139BarCorOri ;
   private String A145BarEncOri ;
   private String AV71ok ;
   private String GXv_char4[] ;
   private String A209BarPri ;
   private String A137BarConPar ;
   private String A120BarAgrEst ;
   private String A1499BarNMez ;
   private String A1500BarNMtr ;
   private String A1878BarNumTen ;
   private String A2010BarTipDis ;
   private String A1652BarSerDsc ;
   private String A2746BarCodTex ;
   private String A2485BarColPes ;
   private String A2498BarPrdPes ;
   private String A2499BarRDos1 ;
   private String A2500BarRDos2 ;
   private String AV50BarProPer ;
   private String A2829BarProPer ;
   private String A3030BarPlf ;
   private String A3310BarFac ;
   private String A3313BarNumTon ;
   private String A5367BarAntp ;
   private String A3745BarFoa ;
   private String A5253BarAcc ;
   private String A4835BarAudOpeN ;
   private String A4837BarAudSupN ;
   private String A5034BarEstTip ;
   private String Gx_emsg ;
   private String A1141DisBarPar ;
   private String A200BarPieCod ;
   private String A7090Nr_PartCod ;
   private String W602MaqCod ;
   private String A544HisCodPar ;
   private String A542HisBarSer ;
   private String A546HisColNom ;
   private String A2299HisReoDsc ;
   private String GXv_char6[] ;
   private String A5910PartCnf ;
   private String GXv_char11[] ;
   private String GXv_char7[] ;
   private String A65ArtCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String E396EmprCod ;
   private java.util.Date AV56FechaLim ;
   private java.util.Date AV57FecPrue ;
   private java.util.Date A369DisFec ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date A3627DisFecLan ;
   private java.util.Date A8887DisFchT ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date Gx_date ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A1003BarFecLan ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A4832BarAudFec ;
   private java.util.Date A569HisReoFec ;
   private boolean returnInSub ;
   private boolean n602MaqCod ;
   private boolean n624MaqVolMed ;
   private boolean n966PartCod ;
   private boolean n349DisArtPu3 ;
   private boolean n2009DisTipDis ;
   private boolean n1002DisNumTen ;
   private boolean n2742DisCodTex ;
   private boolean n2744DisNumTex2 ;
   private boolean n3627DisFecLan ;
   private boolean n8887DisFchT ;
   private boolean n8885DisFEnt ;
   private boolean n1968DisRes ;
   private boolean n387DisPiePie ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean n252CliCod ;
   private boolean n833TipDefCod ;
   private boolean n217BarTipArt ;
   private boolean n4937BarCtrPdas ;
   private boolean n2746BarCodTex ;
   private boolean n2753BarNumTex2 ;
   private boolean n1003BarFecLan ;
   private boolean n4832BarAudFec ;
   private boolean n4835BarAudOpeN ;
   private boolean n4837BarAudSupN ;
   private boolean n4458BarCruKgs ;
   private boolean n7090Nr_PartCod ;
   private boolean n5340Nr_CliCod ;
   private boolean n5906Nr_OpeCod ;
   private boolean n5904Nr_TipCsCL ;
   private boolean n571HisTipArt ;
   private boolean n542HisBarSer ;
   private boolean n546HisColNom ;
   private boolean n547HisColNum ;
   private boolean n572HisTipCol ;
   private boolean n553HisNumPie ;
   private boolean n540HisBarKgm ;
   private boolean n569HisReoFec ;
   private boolean n549HisKgmOri ;
   private boolean n554HisOrdReo ;
   private boolean n548HisEstReo ;
   private boolean n2297HisReoTn ;
   private boolean n2299HisReoDsc ;
   private boolean n5356Hisoperar ;
   private boolean n5085CodCausa ;
   private boolean n68ArtCruMin ;
   private boolean n67ArtCruMax ;
   private boolean n62ArtAcaMax ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P006P2_A602MaqCod ;
   private boolean[] P006P2_n602MaqCod ;
   private String[] P006P2_A396EmprCod ;
   private int[] P006P2_A624MaqVolMed ;
   private boolean[] P006P2_n624MaqVolMed ;
   private String[] P006P4_A966PartCod ;
   private boolean[] P006P4_n966PartCod ;
   private short[] P006P4_A374DisNumPie ;
   private String[] P006P4_A360DisCliNum ;
   private short[] P006P4_A352DisArtTip ;
   private String[] P006P4_A1195DisNomCli ;
   private int[] P006P4_A1196DisNumCli ;
   private java.util.Date[] P006P4_A369DisFec ;
   private String[] P006P4_A2835DisPle2 ;
   private java.math.BigDecimal[] P006P4_A375DisNumUni ;
   private String[] P006P4_A392DisUniMed ;
   private java.util.Date[] P006P4_A370DisFecCli ;
   private java.util.Date[] P006P4_A371DisFecEnt ;
   private String[] P006P4_A341DisArtOpe ;
   private byte[] P006P4_A359DisArtUrg ;
   private String[] P006P4_A340DisArtMat ;
   private java.math.BigDecimal[] P006P4_A350DisArtRdt ;
   private String[] P006P4_A353DisArtTr1 ;
   private short[] P006P4_A344DisArtPt1 ;
   private String[] P006P4_A354DisArtTr2 ;
   private short[] P006P4_A345DisArtPt2 ;
   private String[] P006P4_A355DisArtTr3 ;
   private short[] P006P4_A346DisArtPt3 ;
   private String[] P006P4_A356DisArtUr1 ;
   private short[] P006P4_A347DisArtPu1 ;
   private String[] P006P4_A357DisArtUr2 ;
   private short[] P006P4_A348DisArtPu2 ;
   private String[] P006P4_A358DisArtUr3 ;
   private short[] P006P4_A349DisArtPu3 ;
   private boolean[] P006P4_n349DisArtPu3 ;
   private short[] P006P4_A334DisArtAnh ;
   private String[] P006P4_A343DisArtPle ;
   private String[] P006P4_A339DisArtLar ;
   private String[] P006P4_A351DisArtSua ;
   private String[] P006P4_A333DisArtAca ;
   private String[] P006P4_A336DisArtCor ;
   private String[] P006P4_A338DisArtEnc ;
   private int[] P006P4_A2831DisNumLot ;
   private java.math.BigDecimal[] P006P4_A2832DisKgsLot ;
   private java.math.BigDecimal[] P006P4_A2833DisMtrLot ;
   private String[] P006P4_A2009DisTipDis ;
   private boolean[] P006P4_n2009DisTipDis ;
   private String[] P006P4_A757PriCod ;
   private short[] P006P4_A342DisArtPes ;
   private String[] P006P4_A999DisNMez ;
   private String[] P006P4_A998DisNMtr ;
   private String[] P006P4_A1002DisNumTen ;
   private boolean[] P006P4_n1002DisNumTen ;
   private String[] P006P4_A337DisArtDsc ;
   private int[] P006P4_A2310DisCliDes ;
   private String[] P006P4_A2742DisCodTex ;
   private boolean[] P006P4_n2742DisCodTex ;
   private byte[] P006P4_A2743DisNumTex1 ;
   private short[] P006P4_A2744DisNumTex2 ;
   private boolean[] P006P4_n2744DisNumTex2 ;
   private String[] P006P4_A2926DisPla ;
   private String[] P006P4_A3306DisFac ;
   private short[] P006P4_A3307DisManCod1 ;
   private short[] P006P4_A3308DisManCod2 ;
   private short[] P006P4_A3127DisNumCor ;
   private short[] P006P4_A3128DisAncSal1 ;
   private short[] P006P4_A3129DisAncSal2 ;
   private short[] P006P4_A3130DisAncSal3 ;
   private short[] P006P4_A3131DisGraAca2 ;
   private short[] P006P4_A3132DisGraCru2 ;
   private java.util.Date[] P006P4_A3627DisFecLan ;
   private boolean[] P006P4_n3627DisFecLan ;
   private String[] P006P4_A5366DisAntp ;
   private String[] P006P4_A5252DisAcc ;
   private java.util.Date[] P006P4_A8887DisFchT ;
   private boolean[] P006P4_n8887DisFchT ;
   private String[] P006P4_A8885DisFEnt ;
   private boolean[] P006P4_n8885DisFEnt ;
   private String[] P006P4_A8886DisDest ;
   private java.math.BigDecimal[] P006P4_A4470DisCruKgs ;
   private String[] P006P4_A7739DisExp ;
   private String[] P006P4_A5032DisEstTip ;
   private int[] P006P4_A361DisCod ;
   private String[] P006P4_A1968DisRes ;
   private boolean[] P006P4_n1968DisRes ;
   private byte[] P006P4_A367DisEst ;
   private short[] P006P4_A387DisPiePie ;
   private boolean[] P006P4_n387DisPiePie ;
   private byte[] P006P4_A390DisTipCol ;
   private boolean[] P006P4_n390DisTipCol ;
   private int[] P006P4_A363DisColNum ;
   private boolean[] P006P4_n363DisColNum ;
   private String[] P006P4_A362DisColNom ;
   private boolean[] P006P4_n362DisColNom ;
   private String[] P006P4_A335DisArtCod ;
   private int[] P006P4_A252CliCod ;
   private boolean[] P006P4_n252CliCod ;
   private String[] P006P4_A396EmprCod ;
   private String[] P006P4_A365DisDes ;
   private String[] P006P5_A396EmprCod ;
   private int[] P006P5_A361DisCod ;
   private short[] P006P5_A319DefPor ;
   private short[] P006P5_A833TipDefCod ;
   private boolean[] P006P5_n833TipDefCod ;
   private String[] P006P9_A396EmprCod ;
   private String[] P006P9_A7090Nr_PartCod ;
   private boolean[] P006P9_n7090Nr_PartCod ;
   private int[] P006P9_A5340Nr_CliCod ;
   private boolean[] P006P9_n5340Nr_CliCod ;
   private int[] P006P9_A5198Nr_codigo ;
   private int[] P006P9_A5906Nr_OpeCod ;
   private boolean[] P006P9_n5906Nr_OpeCod ;
   private short[] P006P9_A5904Nr_TipCsCL ;
   private boolean[] P006P9_n5904Nr_TipCsCL ;
   private short[] P006P10_A319DefPor ;
   private short[] P006P10_A833TipDefCod ;
   private boolean[] P006P10_n833TipDefCod ;
   private int[] P006P10_A361DisCod ;
   private String[] P006P10_A396EmprCod ;
   private int[] P006P13_A252CliCod ;
   private boolean[] P006P13_n252CliCod ;
   private String[] P006P13_A65ArtCod ;
   private String[] P006P13_A396EmprCod ;
   private short[] P006P13_A68ArtCruMin ;
   private boolean[] P006P13_n68ArtCruMin ;
   private short[] P006P13_A67ArtCruMax ;
   private boolean[] P006P13_n67ArtCruMax ;
   private short[] P006P13_A62ArtAcaMax ;
   private boolean[] P006P13_n62ArtAcaMax ;
   private byte[] P006P14_A831TipColCod ;
   private int[] P006P14_A483ForColNum ;
   private String[] P006P14_A482ForColNom ;
   private String[] P006P14_A494ForSer ;
   private int[] P006P14_A252CliCod ;
   private boolean[] P006P14_n252CliCod ;
   private String[] P006P14_A396EmprCod ;
   private byte[] P006P14_A484ForCon ;
   private int[] P006P15_A673Piezas ;
}

final  class pgenbamh__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006P2", "SELECT MaqCod, EmprCod, MaqVolMed FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006P4", "SELECT T1.PartCod, T1.DisNumPie, T1.DisCliNum, T1.DisArtTip, T1.DisNomCli, T1.DisNumCli, T1.DisFec, T1.DisPle2, T1.DisNumUni, T1.DisUniMed, T1.DisFecCli, T1.DisFecEnt, T1.DisArtOpe, T1.DisArtUrg, T1.DisArtMat, T1.DisArtRdt, T1.DisArtTr1, T1.DisArtPt1, T1.DisArtTr2, T1.DisArtPt2, T1.DisArtTr3, T1.DisArtPt3, T1.DisArtUr1, T1.DisArtPu1, T1.DisArtUr2, T1.DisArtPu2, T1.DisArtUr3, T1.DisArtPu3, T1.DisArtAnh, T1.DisArtPle, T1.DisArtLar, T1.DisArtSua, T1.DisArtAca, T1.DisArtCor, T1.DisArtEnc, T1.DisNumLot, T1.DisKgsLot, T1.DisMtrLot, T1.DisTipDis, T1.PriCod, T1.DisArtPes, T1.DisNMez, T1.DisNMtr, T1.DisNumTen, T1.DisArtDsc, T1.DisCliDes, T1.DisCodTex, T1.DisNumTex1, T1.DisNumTex2, T1.DisPla, T1.DisFac, T1.DisManCod1, T1.DisManCod2, T1.DisNumCor, T1.DisAncSal1, T1.DisAncSal2, T1.DisAncSal3, T1.DisGraAca2, T1.DisGraCru2, T1.DisFecLan, T1.DisAntp, T1.DisAcc, T1.DisFchT, T1.DisFEnt, T1.DisDest, T1.DisCruKgs, T1.DisExp, T1.DisEstTip, T1.DisCod, T1.DisRes, T1.DisEst, COALESCE( T2.DisPiePie, 0) AS DisPiePie, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtCod, T1.CliCod, T1.EmprCod, T1.DisDes FROM (TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE (T1.EmprCod = ? and T1.DisCod = ?) AND (T1.DisEst = 1) ORDER BY T1.EmprCod, T1.DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006P5", "SELECT * FROM (SELECT EmprCod, DisCod, DefPor, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P006P6", "INSERT INTO TXPBARCAD(EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst, BarMaqCod, BarVolMaq, DisCod, BarDisNum, BarSer, BarTipArt, BarColNom, BarColNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarOpeEsp, BarFecSal, BarUrg, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarSit, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarFecFpr, BarEstCol, BarLis, BarPes, BarFecLan, BarMatiz, BarNomCli, BarNumCli, BarNMtr, BarNMez, BarSerDsc, BarLisInd, BarNumTen, BarTipDis, BarCliDes, BarManCod, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarCodTex, BarNumTex1, BarNumTex2, BarMaqGru, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarFoa, BarCruKgs, BarCtrPdas, BarEstTip, BarAcc, BarAntp, BarAudFec, BarAudOpeN, BarAudSupN, BarPriTin, CliCod, DisDes, BarFecEnt, BarMaqPro, BarDiaP, BarHorCum, BarEstRes, BarNumAso, BarDisOri, NotUltLin, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarEncCom, BarEncAnh, BarGraCru, BarPesBal, BarLocDis, BarPart, BarCodTN, BarExt, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarSitExt, UltLinMaq, BarCoef, BarMacCod, BarPeg, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudTur, BarAudOpe, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P006P7", "INSERT INTO TXPDISBAR(EmprCod, DisDisCod, DisBarCod, DisBarReo, DisBarPar, DisNumPda) VALUES(?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISBAR")
         ,new UpdateCursor("P006P8", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarPiePie, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P006P9", "SELECT EmprCod, Nr_PartCod, Nr_CliCod, Nr_codigo, Nr_OpeCod, Nr_TipCsCL FROM TXPNOTREC WHERE EmprCod = ? and Nr_PartCod = ? and Nr_CliCod = ? ORDER BY EmprCod, Nr_PartCod, Nr_CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P006P10", "SELECT DefPor, TipDefCod, DisCod, EmprCod FROM TXPDISDEF WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P006P11", "INSERT INTO TXPHISREO(EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod, HisTipArt, CliCod, HisBarSer, HisColNom, HisColNum, HisTipCol, HisNumPie, HisBarKgm, MaqCod, HisReoFec, HisKgmOri, HisOrdReo, HisEstReo, HisReoTn, HisReoDsc, CodCausa, Hisoperar, HisBarMtr, HisMtrOri, HisReoPza, TipCorCod, HisAcCo, HisAcCot, HisAdEAcCo, HisAdEAcCt, HisAdeSN, HisAdeObs, Rps_Cod, HisUsu, HisHorReo, HisNomCli, HisNumCli, HisOpecod, HisOpeTur, HisMtsCarg, HisMtsImp, HisreoLote) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
         ,new UpdateCursor("P006P12", "UPDATE TXPDISPOS SET DisEst=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P006P13", "SELECT CliCod, ArtCod, EmprCod, ArtCruMin, ArtCruMax, ArtAcaMax FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006P14", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForCon FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006P15", "SELECT SUM(Piezas) AS GXC1 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 2);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[17])[0] = rslt.getString(17, 4);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 4);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 4);
               ((short[]) buf[22])[0] = rslt.getShort(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 4);
               ((short[]) buf[24])[0] = rslt.getShort(24);
               ((String[]) buf[25])[0] = rslt.getString(25, 4);
               ((short[]) buf[26])[0] = rslt.getShort(26);
               ((String[]) buf[27])[0] = rslt.getString(27, 4);
               ((short[]) buf[28])[0] = rslt.getShort(28);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(29);
               ((String[]) buf[31])[0] = rslt.getString(30, 10);
               ((String[]) buf[32])[0] = rslt.getString(31, 10);
               ((String[]) buf[33])[0] = rslt.getString(32, 6);
               ((String[]) buf[34])[0] = rslt.getString(33, 6);
               ((String[]) buf[35])[0] = rslt.getString(34, 1);
               ((String[]) buf[36])[0] = rslt.getString(35, 1);
               ((int[]) buf[37])[0] = rslt.getInt(36);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(37,2);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(38,2);
               ((String[]) buf[40])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(40, 1);
               ((short[]) buf[43])[0] = rslt.getShort(41);
               ((String[]) buf[44])[0] = rslt.getString(42, 10);
               ((String[]) buf[45])[0] = rslt.getString(43, 10);
               ((String[]) buf[46])[0] = rslt.getString(44, 10);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(45, 26);
               ((int[]) buf[49])[0] = rslt.getInt(46);
               ((String[]) buf[50])[0] = rslt.getString(47, 4);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((byte[]) buf[52])[0] = rslt.getByte(48);
               ((short[]) buf[53])[0] = rslt.getShort(49);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(50, 1);
               ((String[]) buf[56])[0] = rslt.getString(51, 1);
               ((short[]) buf[57])[0] = rslt.getShort(52);
               ((short[]) buf[58])[0] = rslt.getShort(53);
               ((short[]) buf[59])[0] = rslt.getShort(54);
               ((short[]) buf[60])[0] = rslt.getShort(55);
               ((short[]) buf[61])[0] = rslt.getShort(56);
               ((short[]) buf[62])[0] = rslt.getShort(57);
               ((short[]) buf[63])[0] = rslt.getShort(58);
               ((short[]) buf[64])[0] = rslt.getShort(59);
               ((java.util.Date[]) buf[65])[0] = rslt.getGXDate(60);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(61, 1);
               ((String[]) buf[68])[0] = rslt.getString(62, 1);
               ((java.util.Date[]) buf[69])[0] = rslt.getGXDate(63);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(64, 30);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(65, 30);
               ((java.math.BigDecimal[]) buf[74])[0] = rslt.getBigDecimal(66,2);
               ((String[]) buf[75])[0] = rslt.getString(67, 1);
               ((String[]) buf[76])[0] = rslt.getString(68, 1);
               ((int[]) buf[77])[0] = rslt.getInt(69);
               ((String[]) buf[78])[0] = rslt.getString(70, 1);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((byte[]) buf[80])[0] = rslt.getByte(71);
               ((short[]) buf[81])[0] = rslt.getShort(72);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((byte[]) buf[83])[0] = rslt.getByte(73);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((int[]) buf[85])[0] = rslt.getInt(74);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(75, 13);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(76, 16);
               ((int[]) buf[90])[0] = rslt.getInt(77);
               ((String[]) buf[91])[0] = rslt.getString(78, 3);
               ((String[]) buf[92])[0] = rslt.getString(79, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 11 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 8);
               stmt.setString(10, (String)parms[9], 16);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[11]).shortValue());
               }
               stmt.setString(12, (String)parms[12], 13);
               stmt.setInt(13, ((Number) parms[13]).intValue());
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               stmt.setDate(15, (java.util.Date)parms[15]);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[16], 2);
               stmt.setString(17, (String)parms[17], 1);
               stmt.setByte(18, ((Number) parms[18]).byteValue());
               stmt.setDate(19, (java.util.Date)parms[19]);
               stmt.setShort(20, ((Number) parms[20]).shortValue());
               stmt.setByte(21, ((Number) parms[21]).byteValue());
               stmt.setByte(22, ((Number) parms[22]).byteValue());
               stmt.setDate(23, (java.util.Date)parms[23]);
               stmt.setByte(24, ((Number) parms[24]).byteValue());
               stmt.setString(25, (String)parms[25], 16);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[26], 2);
               stmt.setString(27, (String)parms[27], 4);
               stmt.setShort(28, ((Number) parms[28]).shortValue());
               stmt.setString(29, (String)parms[29], 4);
               stmt.setShort(30, ((Number) parms[30]).shortValue());
               stmt.setString(31, (String)parms[31], 4);
               stmt.setShort(32, ((Number) parms[32]).shortValue());
               stmt.setString(33, (String)parms[33], 4);
               stmt.setShort(34, ((Number) parms[34]).shortValue());
               stmt.setString(35, (String)parms[35], 4);
               stmt.setShort(36, ((Number) parms[36]).shortValue());
               stmt.setString(37, (String)parms[37], 4);
               stmt.setShort(38, ((Number) parms[38]).shortValue());
               stmt.setShort(39, ((Number) parms[39]).shortValue());
               stmt.setShort(40, ((Number) parms[40]).shortValue());
               stmt.setShort(41, ((Number) parms[41]).shortValue());
               stmt.setShort(42, ((Number) parms[42]).shortValue());
               stmt.setString(43, (String)parms[43], 10);
               stmt.setString(44, (String)parms[44], 10);
               stmt.setString(45, (String)parms[45], 6);
               stmt.setString(46, (String)parms[46], 6);
               stmt.setString(47, (String)parms[47], 1);
               stmt.setString(48, (String)parms[48], 1);
               stmt.setByte(49, ((Number) parms[49]).byteValue());
               stmt.setByte(50, ((Number) parms[50]).byteValue());
               stmt.setString(51, (String)parms[51], 1);
               stmt.setByte(52, ((Number) parms[52]).byteValue());
               stmt.setString(53, (String)parms[53], 1);
               stmt.setShort(54, ((Number) parms[54]).shortValue());
               stmt.setBigDecimal(55, (java.math.BigDecimal)parms[55], 2);
               stmt.setBigDecimal(56, (java.math.BigDecimal)parms[56], 2);
               stmt.setBigDecimal(57, (java.math.BigDecimal)parms[57], 2);
               stmt.setDate(58, (java.util.Date)parms[58]);
               stmt.setByte(59, ((Number) parms[59]).byteValue());
               stmt.setByte(60, ((Number) parms[60]).byteValue());
               stmt.setShort(61, ((Number) parms[61]).shortValue());
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.DATE );
               }
               else
               {
                  stmt.setDate(62, (java.util.Date)parms[63]);
               }
               stmt.setShort(63, ((Number) parms[64]).shortValue());
               stmt.setString(64, (String)parms[65], 13);
               stmt.setInt(65, ((Number) parms[66]).intValue());
               stmt.setString(66, (String)parms[67], 10);
               stmt.setString(67, (String)parms[68], 10);
               stmt.setString(68, (String)parms[69], 26);
               stmt.setByte(69, ((Number) parms[70]).byteValue());
               stmt.setString(70, (String)parms[71], 10);
               stmt.setString(71, (String)parms[72], 1);
               stmt.setInt(72, ((Number) parms[73]).intValue());
               stmt.setShort(73, ((Number) parms[74]).shortValue());
               stmt.setString(74, (String)parms[75], 1);
               stmt.setString(75, (String)parms[76], 1);
               stmt.setString(76, (String)parms[77], 1);
               stmt.setString(77, (String)parms[78], 1);
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(78, (String)parms[80], 4);
               }
               stmt.setByte(79, ((Number) parms[81]).byteValue());
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(80, ((Number) parms[83]).shortValue());
               }
               stmt.setString(81, (String)parms[84], 4);
               stmt.setInt(82, ((Number) parms[85]).intValue());
               stmt.setBigDecimal(83, (java.math.BigDecimal)parms[86], 2);
               stmt.setBigDecimal(84, (java.math.BigDecimal)parms[87], 2);
               stmt.setString(85, (String)parms[88], 8);
               stmt.setByte(86, ((Number) parms[89]).byteValue());
               stmt.setString(87, (String)parms[90], 1);
               stmt.setString(88, (String)parms[91], 30);
               stmt.setShort(89, ((Number) parms[92]).shortValue());
               stmt.setShort(90, ((Number) parms[93]).shortValue());
               stmt.setShort(91, ((Number) parms[94]).shortValue());
               stmt.setShort(92, ((Number) parms[95]).shortValue());
               stmt.setShort(93, ((Number) parms[96]).shortValue());
               stmt.setShort(94, ((Number) parms[97]).shortValue());
               stmt.setString(95, (String)parms[98], 1);
               stmt.setShort(96, ((Number) parms[99]).shortValue());
               stmt.setShort(97, ((Number) parms[100]).shortValue());
               stmt.setString(98, (String)parms[101], 10);
               stmt.setString(99, (String)parms[102], 1);
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 100 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(100, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 101 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(101, ((Number) parms[106]).byteValue());
               }
               stmt.setString(102, (String)parms[107], 1);
               stmt.setString(103, (String)parms[108], 1);
               stmt.setString(104, (String)parms[109], 1);
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 105 , Types.DATE );
               }
               else
               {
                  stmt.setDate(105, (java.util.Date)parms[111]);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 106 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(106, (String)parms[113], 30);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 107 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(107, (String)parms[115], 30);
               }
               stmt.setByte(108, ((Number) parms[116]).byteValue());
               if ( ((Boolean) parms[117]).booleanValue() )
               {
                  stmt.setNull( 109 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(109, ((Number) parms[118]).intValue());
               }
               stmt.setString(110, (String)parms[119], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 16);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 13);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[19]).shortValue());
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
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[23], 6);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DATE );
               }
               else
               {
                  stmt.setDate(15, (java.util.Date)parms[25]);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[29]).byteValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[31]).byteValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[33]).intValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[35], 26);
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
                  stmt.setInt(22, ((Number) parms[39]).intValue());
               }
               return;
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
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
               return;
      }
   }

}

