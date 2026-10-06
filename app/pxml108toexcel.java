package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pxml108toexcel extends GXProcedure
{
   public pxml108toexcel( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pxml108toexcel.class ), "" );
   }

   public pxml108toexcel( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             int[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 )
   {
      pxml108toexcel.this.aP14 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        int[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             int[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 )
   {
      pxml108toexcel.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pxml108toexcel.this.AV163PMaqcod = aP1[0];
      this.aP1 = aP1;
      pxml108toexcel.this.AV207UMaqCod = aP2[0];
      this.aP2 = aP2;
      pxml108toexcel.this.AV139Hisprodti = aP3[0];
      this.aP3 = aP3;
      pxml108toexcel.this.AV138Hisprodtf = aP4[0];
      this.aP4 = aP4;
      pxml108toexcel.this.AV182TipMaqcod = aP5[0];
      this.aP5 = aP5;
      pxml108toexcel.this.AV111ArtCodi = aP6[0];
      this.aP6 = aP6;
      pxml108toexcel.this.AV110Artcodf = aP7[0];
      this.aP7 = aP7;
      pxml108toexcel.this.AV113Barcolnomi = aP8[0];
      this.aP8 = aP8;
      pxml108toexcel.this.AV112barcolnomf = aP9[0];
      this.aP9 = aP9;
      pxml108toexcel.this.AV115Barcolnumi = aP10[0];
      this.aP10 = aP10;
      pxml108toexcel.this.AV114Barcolnumf = aP11[0];
      this.aP11 = aP11;
      pxml108toexcel.this.AV132FileName = aP12[0];
      this.aP12 = aP12;
      pxml108toexcel.this.aP13 = aP13;
      pxml108toexcel.this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV124EmprNom ;
      GXv_char2[0] = A407EmprNom ;
      GXv_char3[0] = GXt_char1 ;
      new app.pemprnom(remoteHandle, context).execute( GXv_char2, GXv_char3) ;
      pxml108toexcel.this.A407EmprNom = GXv_char2[0] ;
      pxml108toexcel.this.GXt_char1 = GXv_char3[0] ;
      AV124EmprNom = GXt_char1 ;
      System.out.println( httpContext.getMessage( "Generando Informe xml... ", "") );
      AV130File = AV132FileName ;
      AV126ExcelDocument.Open(AV130File);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV126ExcelDocument.Clear();
      /* Execute user subroutine: 'INICIO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV185Tot_kgs_Ge = DecimalUtil.doubleToDec(0) ;
      AV186Tot_kgs_Gi = DecimalUtil.doubleToDec(0) ;
      AV194TotKG = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P08X52 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV163PMaqcod, AV139Hisprodti, AV138Hisprodtf, AV182TipMaqcod, AV182TipMaqcod, AV111ArtCodi, AV110Artcodf, AV113Barcolnomi, AV112barcolnomf, Integer.valueOf(AV115Barcolnumi), Integer.valueOf(AV114Barcolnumf), AV207UMaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P08X52_A129BarCod[0] ;
         A132BarCodReo = P08X52_A132BarCodReo[0] ;
         A130BarCodPar = P08X52_A130BarCodPar[0] ;
         A136BarColNum = P08X52_A136BarColNum[0] ;
         A135BarColNom = P08X52_A135BarColNom[0] ;
         A212BarSer = P08X52_A212BarSer[0] ;
         A1011TipMaqCod = P08X52_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08X52_n1011TipMaqCod[0] ;
         A4441HisProDTF = P08X52_A4441HisProDTF[0] ;
         n4441HisProDTF = P08X52_n4441HisProDTF[0] ;
         A602MaqCod = P08X52_A602MaqCod[0] ;
         A656ParCod = P08X52_A656ParCod[0] ;
         n656ParCod = P08X52_n656ParCod[0] ;
         A1525HisProKgr = P08X52_A1525HisProKgr[0] ;
         A3612HisProReo = P08X52_A3612HisProReo[0] ;
         A558HisProFec = P08X52_A558HisProFec[0] ;
         A561HisProLin = P08X52_A561HisProLin[0] ;
         A1011TipMaqCod = P08X52_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08X52_n1011TipMaqCod[0] ;
         A136BarColNum = P08X52_A136BarColNum[0] ;
         A135BarColNom = P08X52_A135BarColNom[0] ;
         A212BarSer = P08X52_A212BarSer[0] ;
         if ( A656ParCod == 0 )
         {
            AV194TotKG = AV194TotKG.add(A1525HisProKgr) ;
            if ( A3612HisProReo == 2 )
            {
               AV185Tot_kgs_Ge = AV185Tot_kgs_Ge.add(A1525HisProKgr) ;
            }
            if ( A3612HisProReo == 1 )
            {
               AV186Tot_kgs_Gi = AV186Tot_kgs_Gi.add(A1525HisProKgr) ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV159numr = 0 ;
      AV151j = (short)(1) ;
      AV208x = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV168Tab_def[GX_I-1] = (short)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV170tab_kgsre[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV172tab_kgsri[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV174tab_mtsre[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV176tab_mtsri[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV169Tab_defg[GX_I-1] = (short)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV171tab_kgsreg[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV173tab_kgsrig[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV175tab_mtsreg[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV177tab_mtsrig[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV166tab_costo[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV167tab_costog[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      AV141HisProLot = "" ;
      AV137GruOpeCod = 0 ;
      AV195Totkgs = DecimalUtil.doubleToDec(0) ;
      AV199TotMinT = 0 ;
      AV156NTin = 0 ;
      AV189Tot_N_Ge = 0 ;
      AV190Tot_N_Gi = 0 ;
      /* Using cursor P08X53 */
      pr_default.execute(1, new Object[] {AV163PMaqcod, A396EmprCod, AV139Hisprodti, AV138Hisprodtf, AV182TipMaqcod, AV182TipMaqcod, AV111ArtCodi, AV110Artcodf, AV113Barcolnomi, AV112barcolnomf, Integer.valueOf(AV115Barcolnumi), Integer.valueOf(AV114Barcolnumf), AV207UMaqCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8X53 = false ;
         A129BarCod = P08X53_A129BarCod[0] ;
         A132BarCodReo = P08X53_A132BarCodReo[0] ;
         A130BarCodPar = P08X53_A130BarCodPar[0] ;
         A602MaqCod = P08X53_A602MaqCod[0] ;
         A136BarColNum = P08X53_A136BarColNum[0] ;
         A135BarColNom = P08X53_A135BarColNom[0] ;
         A212BarSer = P08X53_A212BarSer[0] ;
         A1011TipMaqCod = P08X53_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08X53_n1011TipMaqCod[0] ;
         A461Fase = P08X53_A461Fase[0] ;
         A1525HisProKgr = P08X53_A1525HisProKgr[0] ;
         A1526HisProMtr = P08X53_A1526HisProMtr[0] ;
         A148BarEstReo = P08X53_A148BarEstReo[0] ;
         A833TipDefCod = P08X53_A833TipDefCod[0] ;
         n833TipDefCod = P08X53_n833TipDefCod[0] ;
         A656ParCod = P08X53_A656ParCod[0] ;
         n656ParCod = P08X53_n656ParCod[0] ;
         A503GruOpeCod = P08X53_A503GruOpeCod[0] ;
         A3610HisProLot = P08X53_A3610HisProLot[0] ;
         A606MaqDsc = P08X53_A606MaqDsc[0] ;
         n606MaqDsc = P08X53_n606MaqDsc[0] ;
         A563HisProMin = P08X53_A563HisProMin[0] ;
         A560HisProHin = P08X53_A560HisProHin[0] ;
         A562HisProMfi = P08X53_A562HisProMfi[0] ;
         A559HisProHfi = P08X53_A559HisProHfi[0] ;
         A4440HisProDTI = P08X53_A4440HisProDTI[0] ;
         n4440HisProDTI = P08X53_n4440HisProDTI[0] ;
         A4441HisProDTF = P08X53_A4441HisProDTF[0] ;
         n4441HisProDTF = P08X53_n4441HisProDTF[0] ;
         A558HisProFec = P08X53_A558HisProFec[0] ;
         A561HisProLin = P08X53_A561HisProLin[0] ;
         A136BarColNum = P08X53_A136BarColNum[0] ;
         A135BarColNom = P08X53_A135BarColNom[0] ;
         A212BarSer = P08X53_A212BarSer[0] ;
         A148BarEstReo = P08X53_A148BarEstReo[0] ;
         A833TipDefCod = P08X53_A833TipDefCod[0] ;
         n833TipDefCod = P08X53_n833TipDefCod[0] ;
         A1011TipMaqCod = P08X53_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08X53_n1011TipMaqCod[0] ;
         A606MaqDsc = P08X53_A606MaqDsc[0] ;
         n606MaqDsc = P08X53_n606MaqDsc[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         if ( A560HisProHin <= A559HisProHfi )
         {
            A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         }
         else
         {
            A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         }
         AV195Totkgs = DecimalUtil.doubleToDec(0) ;
         AV184Tot_kgs_e = DecimalUtil.doubleToDec(0) ;
         AV187Tot_kgs_i = DecimalUtil.doubleToDec(0) ;
         AV199TotMinT = 0 ;
         AV156NTin = 0 ;
         AV201Totmt_i = DecimalUtil.doubleToDec(0) ;
         AV158Ntin_i = 0 ;
         AV200Totmt_e = DecimalUtil.doubleToDec(0) ;
         AV157Ntin_e = 0 ;
         AV141HisProLot = "" ;
         AV137GruOpeCod = 0 ;
         AV150Inicio = (byte)(0) ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08X53_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk8X53 = false ;
            A129BarCod = P08X53_A129BarCod[0] ;
            A132BarCodReo = P08X53_A132BarCodReo[0] ;
            A130BarCodPar = P08X53_A130BarCodPar[0] ;
            A136BarColNum = P08X53_A136BarColNum[0] ;
            A135BarColNom = P08X53_A135BarColNom[0] ;
            A212BarSer = P08X53_A212BarSer[0] ;
            A1011TipMaqCod = P08X53_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P08X53_n1011TipMaqCod[0] ;
            A461Fase = P08X53_A461Fase[0] ;
            A1525HisProKgr = P08X53_A1525HisProKgr[0] ;
            A1526HisProMtr = P08X53_A1526HisProMtr[0] ;
            A148BarEstReo = P08X53_A148BarEstReo[0] ;
            A833TipDefCod = P08X53_A833TipDefCod[0] ;
            n833TipDefCod = P08X53_n833TipDefCod[0] ;
            A656ParCod = P08X53_A656ParCod[0] ;
            n656ParCod = P08X53_n656ParCod[0] ;
            A503GruOpeCod = P08X53_A503GruOpeCod[0] ;
            A3610HisProLot = P08X53_A3610HisProLot[0] ;
            A563HisProMin = P08X53_A563HisProMin[0] ;
            A560HisProHin = P08X53_A560HisProHin[0] ;
            A562HisProMfi = P08X53_A562HisProMfi[0] ;
            A559HisProHfi = P08X53_A559HisProHfi[0] ;
            A4440HisProDTI = P08X53_A4440HisProDTI[0] ;
            n4440HisProDTI = P08X53_n4440HisProDTI[0] ;
            A4441HisProDTF = P08X53_A4441HisProDTF[0] ;
            n4441HisProDTF = P08X53_n4441HisProDTF[0] ;
            A558HisProFec = P08X53_A558HisProFec[0] ;
            A561HisProLin = P08X53_A561HisProLin[0] ;
            A136BarColNum = P08X53_A136BarColNum[0] ;
            A135BarColNom = P08X53_A135BarColNom[0] ;
            A212BarSer = P08X53_A212BarSer[0] ;
            A148BarEstReo = P08X53_A148BarEstReo[0] ;
            A833TipDefCod = P08X53_A833TipDefCod[0] ;
            n833TipDefCod = P08X53_n833TipDefCod[0] ;
            A1011TipMaqCod = P08X53_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P08X53_n1011TipMaqCod[0] ;
            if ( GXutil.strcmp(P08X53_A396EmprCod[0], A396EmprCod) == 0 )
            {
               if ( ( GXutil.strcmp(A1011TipMaqCod, AV182TipMaqcod) == 0 ) || (GXutil.strcmp("", AV182TipMaqcod)==0) )
               {
                  if ( GXutil.strcmp(A212BarSer, AV111ArtCodi) >= 0 )
                  {
                     if ( GXutil.strcmp(A212BarSer, AV110Artcodf) <= 0 )
                     {
                        if ( GXutil.strcmp(A135BarColNom, AV113Barcolnomi) >= 0 )
                        {
                           if ( GXutil.strcmp(A135BarColNom, AV112barcolnomf) <= 0 )
                           {
                              if ( A136BarColNum >= AV115Barcolnumi )
                              {
                                 if ( A136BarColNum <= AV114Barcolnumf )
                                 {
                                    if ( (( A4441HisProDTF.after( AV139Hisprodti ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV139Hisprodti) )) )
                                    {
                                       if ( (( A4441HisProDTF.before( AV138Hisprodtf ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV138Hisprodtf) )) )
                                       {
                                          if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                                          {
                                             A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
                                          }
                                          else
                                          {
                                             A5605HisProTr2 = (short)(0) ;
                                          }
                                          if ( A560HisProHin <= A559HisProHfi )
                                          {
                                             A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                                          }
                                          else
                                          {
                                             A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                                          }
                                          AV143HisProTr2 = ((AV135FlagTiReal==0) ? A564HisProTre : A5605HisProTr2) ;
                                          GXv_char3[0] = A396EmprCod ;
                                          GXv_char2[0] = A461Fase ;
                                          GXv_char4[0] = AV127FasActTin ;
                                          new app.pfasest(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char4) ;
                                          pxml108toexcel.this.A396EmprCod = GXv_char3[0] ;
                                          pxml108toexcel.this.A461Fase = GXv_char2[0] ;
                                          pxml108toexcel.this.AV127FasActTin = GXv_char4[0] ;
                                          AV195Totkgs = AV195Totkgs.add(A1525HisProKgr) ;
                                          AV202Totmts = AV202Totmts.add(A1526HisProMtr) ;
                                          AV197TotKgsRi = AV197TotKgsRi.add((((A148BarEstReo==1) ? A1525HisProKgr : DecimalUtil.doubleToDec(0)))) ;
                                          AV204TotMtsRi = AV204TotMtsRi.add((((A148BarEstReo==1) ? A1526HisProMtr : DecimalUtil.doubleToDec(0)))) ;
                                          AV196TotKgsRe = AV196TotKgsRe.add((((A148BarEstReo==2) ? A1525HisProKgr : DecimalUtil.doubleToDec(0)))) ;
                                          AV203TotMtsRe = AV203TotMtsRe.add((((A148BarEstReo==2) ? A1526HisProMtr : DecimalUtil.doubleToDec(0)))) ;
                                          AV140Hisprokgr = A1525HisProKgr ;
                                          AV142HisPromtr = A1526HisProMtr ;
                                          AV118Barestreo = A148BarEstReo ;
                                          AV116Barcosany = DecimalUtil.doubleToDec(0) ;
                                          AV117barcospro = DecimalUtil.doubleToDec(0) ;
                                          if ( GXutil.strcmp(AV141HisProLot, A3610HisProLot) != 0 )
                                          {
                                             AV156NTin = (int)(AV156NTin+1) ;
                                             AV199TotMinT = (int)(AV199TotMinT+AV143HisProTr2) ;
                                          }
                                          if ( GXutil.strcmp(AV141HisProLot, A3610HisProLot) != 0 )
                                          {
                                             GXv_char4[0] = A396EmprCod ;
                                             GXv_char3[0] = A3610HisProLot ;
                                             GXv_decimal5[0] = AV116Barcosany ;
                                             GXv_decimal6[0] = AV117barcospro ;
                                             new app.pprc56(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal5, GXv_decimal6) ;
                                             pxml108toexcel.this.A396EmprCod = GXv_char4[0] ;
                                             pxml108toexcel.this.A3610HisProLot = GXv_char3[0] ;
                                             pxml108toexcel.this.AV116Barcosany = GXv_decimal5[0] ;
                                             pxml108toexcel.this.AV117barcospro = GXv_decimal6[0] ;
                                          }
                                          AV180Tipdefcod = (short)(((A833TipDefCod==0)&&((A148BarEstReo==2)||(A148BarEstReo==1)) ? 9999 : A833TipDefCod)) ;
                                          if ( AV180Tipdefcod > 0 )
                                          {
                                             /* Execute user subroutine: 'DEFECTOS' */
                                             S121 ();
                                             if ( returnInSub )
                                             {
                                                pr_default.close(1);
                                                pr_default.close(1);
                                                pr_default.close(1);
                                                returnInSub = true;
                                                cleanup();
                                                if (true) return;
                                             }
                                          }
                                          AV192totcosany = AV192totcosany.add(AV116Barcosany) ;
                                          AV193Totcospro = AV193Totcospro.add(AV117barcospro) ;
                                          if ( ( GXutil.strcmp(AV141HisProLot, A3610HisProLot) == 0 ) && ( AV137GruOpeCod != A503GruOpeCod ) )
                                          {
                                             AV199TotMinT = (int)(AV199TotMinT+AV143HisProTr2) ;
                                          }
                                          AV141HisProLot = A3610HisProLot ;
                                          AV137GruOpeCod = A503GruOpeCod ;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
            brk8X53 = true ;
            pr_default.readNext(1);
         }
         AV162PesMedPar = ((AV156NTin>0) ? AV195Totkgs.divide(DecimalUtil.doubleToDec(AV156NTin), 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
         AV147HorRea = (short)(GXutil.Int( AV199TotMinT/ (double) (60))) ;
         AV148HorReaint = (short)(GXutil.Int( AV147HorRea)) ;
         AV154MinRea = (byte)(AV199TotMinT-(AV148HorReaint*60)) ;
         AV155MinRea2 = DecimalUtil.doubleToDec(AV154MinRea/ (double) (100)) ;
         AV144HmP = DecimalUtil.doubleToDec(AV148HorReaint).add(AV155MinRea2) ;
         AV179TiempoNP = ((AV156NTin>0) ? AV144HmP.divide(DecimalUtil.doubleToDec(AV156NTin), 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
         AV129Fila = (int)(AV129Fila+1) ;
         AV119Columna = 0 ;
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( GXutil.trim( A602MaqCod) );
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( GXutil.trim( A606MaqDsc) );
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV195Totkgs)) );
         AV198TotKgsUtil = AV195Totkgs.subtract(AV197TotKgsRi).subtract(AV196TotKgsRe) ;
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV198TotKgsUtil)) );
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( AV199TotMinT );
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV144HmP)) );
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( AV156NTin );
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV179TiempoNP)) );
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV162PesMedPar)) );
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV197TotKgsRi)) );
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV196TotKgsRe)) );
         AV191totcos = AV192totcosany.add(AV193Totcospro) ;
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV191totcos)) );
         AV149i = (short)(1) ;
         while ( AV149i <= 100 )
         {
            if ( AV168Tab_def[AV149i-1] == 0 )
            {
               if (true) break;
            }
            AV180Tipdefcod = AV168Tab_def[AV149i-1] ;
            GXt_char1 = AV181Tipdefdsc ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int7[0] = AV180Tipdefcod ;
            GXv_char3[0] = GXt_char1 ;
            new app.pdescdef(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3) ;
            pxml108toexcel.this.A396EmprCod = GXv_char4[0] ;
            pxml108toexcel.this.AV180Tipdefcod = GXv_int7[0] ;
            pxml108toexcel.this.GXt_char1 = GXv_char3[0] ;
            AV181Tipdefdsc = GXt_char1 ;
            AV197TotKgsRi = AV172tab_kgsri[AV149i-1] ;
            AV204TotMtsRi = AV176tab_mtsri[AV149i-1] ;
            AV196TotKgsRe = AV170tab_kgsre[AV149i-1] ;
            AV203TotMtsRe = AV174tab_mtsre[AV149i-1] ;
            AV191totcos = AV166tab_costo[AV149i-1] ;
            AV129Fila = (int)(AV129Fila+1) ;
            AV119Columna = 0 ;
            AV119Columna = (int)(AV119Columna+1) ;
            AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( AV180Tipdefcod );
            AV119Columna = (int)(AV119Columna+1) ;
            AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( GXutil.trim( AV181Tipdefdsc) );
            AV119Columna = (int)(AV119Columna+8) ;
            AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV197TotKgsRi)) );
            AV119Columna = (int)(AV119Columna+1) ;
            AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV196TotKgsRe)) );
            AV119Columna = (int)(AV119Columna+1) ;
            AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV191totcos)) );
            AV149i = (short)(AV149i+1) ;
         }
         AV195Totkgs = DecimalUtil.doubleToDec(0) ;
         AV197TotKgsRi = DecimalUtil.doubleToDec(0) ;
         AV196TotKgsRe = DecimalUtil.doubleToDec(0) ;
         AV202Totmts = DecimalUtil.doubleToDec(0) ;
         AV203TotMtsRe = DecimalUtil.doubleToDec(0) ;
         AV204TotMtsRi = DecimalUtil.doubleToDec(0) ;
         AV192totcosany = DecimalUtil.doubleToDec(0) ;
         AV193Totcospro = DecimalUtil.doubleToDec(0) ;
         AV191totcos = DecimalUtil.doubleToDec(0) ;
         AV151j = (short)(1) ;
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV168Tab_def[GX_I-1] = (short)(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV170tab_kgsre[GX_I-1] = DecimalUtil.doubleToDec(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV172tab_kgsri[GX_I-1] = DecimalUtil.doubleToDec(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV174tab_mtsre[GX_I-1] = DecimalUtil.doubleToDec(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV176tab_mtsri[GX_I-1] = DecimalUtil.doubleToDec(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV166tab_costo[GX_I-1] = DecimalUtil.doubleToDec(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         AV141HisProLot = " " ;
         AV137GruOpeCod = 0 ;
         if ( ! brk8X53 )
         {
            brk8X53 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
      AV129Fila = (int)(AV129Fila+1) ;
      AV119Columna = 0 ;
      AV119Columna = (int)(AV119Columna+3) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV194TotKG)) );
      AV119Columna = (int)(AV119Columna+8) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV186Tot_kgs_Gi)) );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV185Tot_kgs_Ge)) );
      AV129Fila = (int)(AV129Fila+3) ;
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Codigo", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV119Columna = (int)(AV119Columna+8) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Kilos Ri", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Kilos Re", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Total", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Coste Total", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "% Reop Int", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "% Reop Ext", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "% Reop Total", "") );
      AV149i = (short)(1) ;
      while ( AV149i <= 100 )
      {
         if ( AV169Tab_defg[AV149i-1] == 0 )
         {
            if (true) break;
         }
         AV180Tipdefcod = AV169Tab_defg[AV149i-1] ;
         GXt_char1 = AV181Tipdefdsc ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = AV180Tipdefcod ;
         GXv_char3[0] = GXt_char1 ;
         new app.pdescdef(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3) ;
         pxml108toexcel.this.A396EmprCod = GXv_char4[0] ;
         pxml108toexcel.this.AV180Tipdefcod = GXv_int7[0] ;
         pxml108toexcel.this.GXt_char1 = GXv_char3[0] ;
         AV181Tipdefdsc = GXt_char1 ;
         AV197TotKgsRi = AV173tab_kgsrig[AV149i-1] ;
         AV204TotMtsRi = AV177tab_mtsrig[AV149i-1] ;
         AV196TotKgsRe = AV171tab_kgsreg[AV149i-1] ;
         AV203TotMtsRe = AV175tab_mtsreg[AV149i-1] ;
         AV205Totrire = AV197TotKgsRi.add(AV196TotKgsRe) ;
         AV191totcos = AV167tab_costog[AV149i-1] ;
         AV129Fila = (int)(AV129Fila+1) ;
         AV119Columna = 0 ;
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( AV180Tipdefcod );
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( GXutil.trim( AV181Tipdefdsc) );
         AV119Columna = (int)(AV119Columna+8) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV197TotKgsRi)) );
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV196TotKgsRe)) );
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV205Totrire)) );
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV191totcos)) );
         AV164porcentage = ((AV186Tot_kgs_Gi.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV197TotKgsRi.divide(AV186Tot_kgs_Gi, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2)) ;
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV164porcentage)) );
         AV164porcentage = ((AV185Tot_kgs_Ge.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV196TotKgsRe.divide(AV185Tot_kgs_Ge, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2)) ;
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV164porcentage)) );
         AV164porcentage = (((AV185Tot_kgs_Ge.add(AV186Tot_kgs_Gi)).doubleValue()==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV205Totrire.divide((AV185Tot_kgs_Ge.add(AV186Tot_kgs_Gi)), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2)) ;
         AV119Columna = (int)(AV119Columna+1) ;
         AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV164porcentage)) );
         AV149i = (short)(AV149i+1) ;
      }
      AV129Fila = (int)(AV129Fila+1) ;
      AV119Columna = 0 ;
      AV119Columna = (int)(AV119Columna+9) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Totales", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV186Tot_kgs_Gi)) );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV185Tot_kgs_Ge)) );
      AV129Fila = (int)(AV129Fila+1) ;
      AV119Columna = 0 ;
      AV119Columna = (int)(AV119Columna+9) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( "%" );
      AV164porcentage = ((AV194TotKG.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV186Tot_kgs_Gi.divide(AV194TotKG, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2)) ;
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV164porcentage)) );
      AV164porcentage = ((AV194TotKG.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV185Tot_kgs_Ge.divide(AV194TotKG, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2)) ;
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV164porcentage)) );
      AV126ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV126ExcelDocument.Close();
      cleanup();
   }

   public void S111( )
   {
      /* 'INICIO' Routine */
      returnInSub = false ;
      AV129Fila = 1 ;
      AV119Columna = 0 ;
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Empresa", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( GXutil.trim( AV124EmprNom) );
      AV129Fila = 1 ;
      AV119Columna = 0 ;
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Generador:", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( GXutil.trim( AV214Pgmname) );
      AV129Fila = (int)(AV129Fila+1) ;
      AV119Columna = 0 ;
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Informe generado aplicando los siguientes Filtros", "") );
      AV129Fila = (int)(AV129Fila+1) ;
      AV119Columna = 0 ;
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      GXt_dtime8 = GXutil.resetTime( GXutil.serverDate( context, remoteHandle, pr_default) );
      AV126ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setDate( GXt_dtime8 );
      AV129Fila = (int)(AV129Fila+1) ;
      AV119Columna = 0 ;
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Rango de Máquinas", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( GXutil.trim( AV163PMaqcod) );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( GXutil.trim( AV207UMaqCod) );
      AV119Columna = (int)(AV119Columna+1) ;
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Rango de Fechas", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setDate( AV139Hisprodti );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setDate( AV138Hisprodtf );
      AV119Columna = (int)(AV119Columna+1) ;
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Tipo de Máquina", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( GXutil.trim( AV182TipMaqcod) );
      AV129Fila = (int)(AV129Fila+1) ;
      AV119Columna = 0 ;
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Rango de Artículos", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( GXutil.trim( AV111ArtCodi) );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( GXutil.trim( AV110Artcodf) );
      AV119Columna = (int)(AV119Columna+1) ;
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Rango de Colores", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( GXutil.trim( AV113Barcolnomi) );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( GXutil.trim( AV112barcolnomf) );
      AV119Columna = (int)(AV119Columna+1) ;
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Rango de Números", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( AV115Barcolnumi );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setNumber( AV114Barcolnumf );
      AV129Fila = (int)(AV129Fila+1) ;
      AV129Fila = (int)(AV129Fila+1) ;
      AV119Columna = 0 ;
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Kilos Totales", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Produccion Util", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Minutos Proceso", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Horas Proceso", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "N Partidas", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Tiempo medio por Partidas", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Peso medio por Partidas", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Kilos Ri", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Kilos Re", "") );
      AV119Columna = (int)(AV119Columna+1) ;
      AV126ExcelDocument.Cells(AV129Fila, AV119Columna, 1, 1).setText( httpContext.getMessage( "Coste", "") );
   }

   public void S121( )
   {
      /* 'DEFECTOS' Routine */
      returnInSub = false ;
      AV109Alta = (byte)(1) ;
      AV149i = (short)(1) ;
      while ( AV149i <= 100 )
      {
         if ( AV168Tab_def[AV149i-1] == 0 )
         {
            if (true) break;
         }
         if ( AV168Tab_def[AV149i-1] == AV180Tipdefcod )
         {
            AV172tab_kgsri[AV149i-1] = AV172tab_kgsri[AV149i-1].add((((AV118Barestreo==1) ? AV140Hisprokgr : DecimalUtil.doubleToDec(0)))) ;
            AV170tab_kgsre[AV149i-1] = AV170tab_kgsre[AV149i-1].add((((AV118Barestreo==2) ? AV140Hisprokgr : DecimalUtil.doubleToDec(0)))) ;
            AV176tab_mtsri[AV149i-1] = AV176tab_mtsri[AV149i-1].add((((AV118Barestreo==1) ? AV142HisPromtr : DecimalUtil.doubleToDec(0)))) ;
            AV174tab_mtsre[AV149i-1] = AV174tab_mtsre[AV149i-1].add((((AV118Barestreo==2) ? AV142HisPromtr : DecimalUtil.doubleToDec(0)))) ;
            AV166tab_costo[AV149i-1] = AV166tab_costo[AV149i-1].add((AV116Barcosany.add(AV117barcospro))) ;
            AV109Alta = (byte)(0) ;
            if (true) break;
         }
         AV149i = (short)(AV149i+1) ;
      }
      if ( AV109Alta == 1 )
      {
         AV168Tab_def[AV151j-1] = AV180Tipdefcod ;
         AV172tab_kgsri[AV151j-1] = AV172tab_kgsri[AV151j-1].add((((AV118Barestreo==1) ? AV140Hisprokgr : DecimalUtil.doubleToDec(0)))) ;
         AV170tab_kgsre[AV151j-1] = AV170tab_kgsre[AV151j-1].add((((AV118Barestreo==2) ? AV140Hisprokgr : DecimalUtil.doubleToDec(0)))) ;
         AV176tab_mtsri[AV151j-1] = AV176tab_mtsri[AV151j-1].add((((AV118Barestreo==1) ? AV142HisPromtr : DecimalUtil.doubleToDec(0)))) ;
         AV174tab_mtsre[AV151j-1] = AV174tab_mtsre[AV151j-1].add((((AV118Barestreo==2) ? AV142HisPromtr : DecimalUtil.doubleToDec(0)))) ;
         AV166tab_costo[AV151j-1] = AV116Barcosany.add(AV117barcospro) ;
         AV151j = (short)(AV151j+1) ;
      }
      AV149i = (short)(1) ;
      AV109Alta = (byte)(1) ;
      while ( AV149i <= 100 )
      {
         if ( AV169Tab_defg[AV149i-1] == 0 )
         {
            if (true) break;
         }
         if ( AV169Tab_defg[AV149i-1] == AV180Tipdefcod )
         {
            AV173tab_kgsrig[AV149i-1] = AV173tab_kgsrig[AV149i-1].add((((AV118Barestreo==1) ? AV140Hisprokgr : DecimalUtil.doubleToDec(0)))) ;
            AV171tab_kgsreg[AV149i-1] = AV171tab_kgsreg[AV149i-1].add((((AV118Barestreo==2) ? AV140Hisprokgr : DecimalUtil.doubleToDec(0)))) ;
            AV177tab_mtsrig[AV149i-1] = AV177tab_mtsrig[AV149i-1].add((((AV118Barestreo==1) ? AV142HisPromtr : DecimalUtil.doubleToDec(0)))) ;
            AV175tab_mtsreg[AV149i-1] = AV175tab_mtsreg[AV149i-1].add((((AV118Barestreo==2) ? AV142HisPromtr : DecimalUtil.doubleToDec(0)))) ;
            AV167tab_costog[AV149i-1] = AV167tab_costog[AV149i-1].add((AV116Barcosany.add(AV117barcospro))) ;
            AV109Alta = (byte)(0) ;
            if (true) break;
         }
         AV149i = (short)(AV149i+1) ;
      }
      if ( AV109Alta == 1 )
      {
         AV169Tab_defg[AV208x-1] = AV180Tipdefcod ;
         AV173tab_kgsrig[AV208x-1] = AV173tab_kgsrig[AV208x-1].add((((AV118Barestreo==1) ? AV140Hisprokgr : DecimalUtil.doubleToDec(0)))) ;
         AV171tab_kgsreg[AV208x-1] = AV171tab_kgsreg[AV208x-1].add((((AV118Barestreo==2) ? AV140Hisprokgr : DecimalUtil.doubleToDec(0)))) ;
         AV177tab_mtsrig[AV208x-1] = AV177tab_mtsrig[AV208x-1].add((((AV118Barestreo==1) ? AV142HisPromtr : DecimalUtil.doubleToDec(0)))) ;
         AV175tab_mtsreg[AV208x-1] = AV175tab_mtsreg[AV208x-1].add((((AV118Barestreo==2) ? AV142HisPromtr : DecimalUtil.doubleToDec(0)))) ;
         AV167tab_costog[AV208x-1] = AV116Barcosany.add(AV117barcospro) ;
         AV208x = (short)(AV208x+1) ;
      }
   }

   public void S131( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV126ExcelDocument.getErrCode() != 0 )
      {
         AV130File = "" ;
         AV125ErrorMessage = AV126ExcelDocument.getErrDescription() ;
         AV126ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pxml108toexcel.this.A396EmprCod;
      this.aP1[0] = pxml108toexcel.this.AV163PMaqcod;
      this.aP2[0] = pxml108toexcel.this.AV207UMaqCod;
      this.aP3[0] = pxml108toexcel.this.AV139Hisprodti;
      this.aP4[0] = pxml108toexcel.this.AV138Hisprodtf;
      this.aP5[0] = pxml108toexcel.this.AV182TipMaqcod;
      this.aP6[0] = pxml108toexcel.this.AV111ArtCodi;
      this.aP7[0] = pxml108toexcel.this.AV110Artcodf;
      this.aP8[0] = pxml108toexcel.this.AV113Barcolnomi;
      this.aP9[0] = pxml108toexcel.this.AV112barcolnomf;
      this.aP10[0] = pxml108toexcel.this.AV115Barcolnumi;
      this.aP11[0] = pxml108toexcel.this.AV114Barcolnumf;
      this.aP12[0] = pxml108toexcel.this.AV132FileName;
      this.aP13[0] = pxml108toexcel.this.AV130File;
      this.aP14[0] = pxml108toexcel.this.AV125ErrorMessage;
      CloseOpenCursors();
      AV126ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV130File = "" ;
      AV125ErrorMessage = "" ;
      AV124EmprNom = "" ;
      A407EmprNom = "" ;
      AV126ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV185Tot_kgs_Ge = DecimalUtil.ZERO ;
      AV186Tot_kgs_Gi = DecimalUtil.ZERO ;
      AV194TotKG = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P08X52_A129BarCod = new int[1] ;
      P08X52_A132BarCodReo = new byte[1] ;
      P08X52_A130BarCodPar = new String[] {""} ;
      P08X52_A396EmprCod = new String[] {""} ;
      P08X52_A136BarColNum = new int[1] ;
      P08X52_A135BarColNom = new String[] {""} ;
      P08X52_A212BarSer = new String[] {""} ;
      P08X52_A1011TipMaqCod = new String[] {""} ;
      P08X52_n1011TipMaqCod = new boolean[] {false} ;
      P08X52_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08X52_n4441HisProDTF = new boolean[] {false} ;
      P08X52_A602MaqCod = new String[] {""} ;
      P08X52_A656ParCod = new short[1] ;
      P08X52_n656ParCod = new boolean[] {false} ;
      P08X52_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08X52_A3612HisProReo = new byte[1] ;
      P08X52_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08X52_A561HisProLin = new int[1] ;
      A130BarCodPar = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A1011TipMaqCod = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A558HisProFec = GXutil.nullDate() ;
      AV168Tab_def = new short[100] ;
      AV170tab_kgsre = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV170tab_kgsre[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV172tab_kgsri = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV172tab_kgsri[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV174tab_mtsre = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV174tab_mtsre[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV176tab_mtsri = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV176tab_mtsri[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV169Tab_defg = new short[100] ;
      AV171tab_kgsreg = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV171tab_kgsreg[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV173tab_kgsrig = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV173tab_kgsrig[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV175tab_mtsreg = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV175tab_mtsreg[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV177tab_mtsrig = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV177tab_mtsrig[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV166tab_costo = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV166tab_costo[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV167tab_costog = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV167tab_costog[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV141HisProLot = "" ;
      AV195Totkgs = DecimalUtil.ZERO ;
      P08X53_A129BarCod = new int[1] ;
      P08X53_A132BarCodReo = new byte[1] ;
      P08X53_A130BarCodPar = new String[] {""} ;
      P08X53_A396EmprCod = new String[] {""} ;
      P08X53_A602MaqCod = new String[] {""} ;
      P08X53_A136BarColNum = new int[1] ;
      P08X53_A135BarColNom = new String[] {""} ;
      P08X53_A212BarSer = new String[] {""} ;
      P08X53_A1011TipMaqCod = new String[] {""} ;
      P08X53_n1011TipMaqCod = new boolean[] {false} ;
      P08X53_A461Fase = new String[] {""} ;
      P08X53_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08X53_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08X53_A148BarEstReo = new byte[1] ;
      P08X53_A833TipDefCod = new short[1] ;
      P08X53_n833TipDefCod = new boolean[] {false} ;
      P08X53_A656ParCod = new short[1] ;
      P08X53_n656ParCod = new boolean[] {false} ;
      P08X53_A503GruOpeCod = new int[1] ;
      P08X53_A3610HisProLot = new String[] {""} ;
      P08X53_A606MaqDsc = new String[] {""} ;
      P08X53_n606MaqDsc = new boolean[] {false} ;
      P08X53_A563HisProMin = new byte[1] ;
      P08X53_A560HisProHin = new byte[1] ;
      P08X53_A562HisProMfi = new byte[1] ;
      P08X53_A559HisProHfi = new byte[1] ;
      P08X53_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08X53_n4440HisProDTI = new boolean[] {false} ;
      P08X53_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08X53_n4441HisProDTF = new boolean[] {false} ;
      P08X53_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08X53_A561HisProLin = new int[1] ;
      A461Fase = "" ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A3610HisProLot = "" ;
      A606MaqDsc = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV184Tot_kgs_e = DecimalUtil.ZERO ;
      AV187Tot_kgs_i = DecimalUtil.ZERO ;
      AV201Totmt_i = DecimalUtil.ZERO ;
      AV200Totmt_e = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      AV127FasActTin = "" ;
      AV202Totmts = DecimalUtil.ZERO ;
      AV197TotKgsRi = DecimalUtil.ZERO ;
      AV204TotMtsRi = DecimalUtil.ZERO ;
      AV196TotKgsRe = DecimalUtil.ZERO ;
      AV203TotMtsRe = DecimalUtil.ZERO ;
      AV140Hisprokgr = DecimalUtil.ZERO ;
      AV142HisPromtr = DecimalUtil.ZERO ;
      AV116Barcosany = DecimalUtil.ZERO ;
      AV117barcospro = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV192totcosany = DecimalUtil.ZERO ;
      AV193Totcospro = DecimalUtil.ZERO ;
      AV162PesMedPar = DecimalUtil.ZERO ;
      AV155MinRea2 = DecimalUtil.ZERO ;
      AV144HmP = DecimalUtil.ZERO ;
      AV179TiempoNP = DecimalUtil.ZERO ;
      AV198TotKgsUtil = DecimalUtil.ZERO ;
      AV191totcos = DecimalUtil.ZERO ;
      AV181Tipdefdsc = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_char3 = new String[1] ;
      AV205Totrire = DecimalUtil.ZERO ;
      AV164porcentage = DecimalUtil.ZERO ;
      AV214Pgmname = "" ;
      GXt_dtime8 = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pxml108toexcel__default(),
         new Object[] {
             new Object[] {
            P08X52_A129BarCod, P08X52_A132BarCodReo, P08X52_A130BarCodPar, P08X52_A396EmprCod, P08X52_A136BarColNum, P08X52_A135BarColNom, P08X52_A212BarSer, P08X52_A1011TipMaqCod, P08X52_n1011TipMaqCod, P08X52_A4441HisProDTF,
            P08X52_n4441HisProDTF, P08X52_A602MaqCod, P08X52_A656ParCod, P08X52_n656ParCod, P08X52_A1525HisProKgr, P08X52_A3612HisProReo, P08X52_A558HisProFec, P08X52_A561HisProLin
            }
            , new Object[] {
            P08X53_A129BarCod, P08X53_A132BarCodReo, P08X53_A130BarCodPar, P08X53_A396EmprCod, P08X53_A602MaqCod, P08X53_A136BarColNum, P08X53_A135BarColNom, P08X53_A212BarSer, P08X53_A1011TipMaqCod, P08X53_n1011TipMaqCod,
            P08X53_A461Fase, P08X53_A1525HisProKgr, P08X53_A1526HisProMtr, P08X53_A148BarEstReo, P08X53_A833TipDefCod, P08X53_n833TipDefCod, P08X53_A656ParCod, P08X53_n656ParCod, P08X53_A503GruOpeCod, P08X53_A3610HisProLot,
            P08X53_A606MaqDsc, P08X53_n606MaqDsc, P08X53_A563HisProMin, P08X53_A560HisProHin, P08X53_A562HisProMfi, P08X53_A559HisProHfi, P08X53_A4440HisProDTI, P08X53_n4440HisProDTI, P08X53_A4441HisProDTF, P08X53_n4441HisProDTF,
            P08X53_A558HisProFec, P08X53_A561HisProLin
            }
         }
      );
      AV214Pgmname = "PXMl108ToExcel" ;
      /* GeneXus formulas. */
      AV214Pgmname = "PXMl108ToExcel" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A3612HisProReo ;
   private byte A148BarEstReo ;
   private byte A563HisProMin ;
   private byte A560HisProHin ;
   private byte A562HisProMfi ;
   private byte A559HisProHfi ;
   private byte AV150Inicio ;
   private byte AV135FlagTiReal ;
   private byte AV118Barestreo ;
   private byte AV154MinRea ;
   private byte AV109Alta ;
   private short A656ParCod ;
   private short AV151j ;
   private short AV208x ;
   private short AV168Tab_def[] ;
   private short AV169Tab_defg[] ;
   private short A833TipDefCod ;
   private short A5605HisProTr2 ;
   private short A564HisProTre ;
   private short AV143HisProTr2 ;
   private short AV180Tipdefcod ;
   private short AV147HorRea ;
   private short AV148HorReaint ;
   private short AV149i ;
   private short GXv_int7[] ;
   private short Gx_err ;
   private int AV115Barcolnumi ;
   private int AV114Barcolnumf ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A561HisProLin ;
   private int AV159numr ;
   private int GX_I ;
   private int AV137GruOpeCod ;
   private int AV199TotMinT ;
   private int AV156NTin ;
   private int AV189Tot_N_Ge ;
   private int AV190Tot_N_Gi ;
   private int A503GruOpeCod ;
   private int AV158Ntin_i ;
   private int AV157Ntin_e ;
   private int AV129Fila ;
   private int AV119Columna ;
   private java.math.BigDecimal AV185Tot_kgs_Ge ;
   private java.math.BigDecimal AV186Tot_kgs_Gi ;
   private java.math.BigDecimal AV194TotKG ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal AV170tab_kgsre[] ;
   private java.math.BigDecimal AV172tab_kgsri[] ;
   private java.math.BigDecimal AV174tab_mtsre[] ;
   private java.math.BigDecimal AV176tab_mtsri[] ;
   private java.math.BigDecimal AV171tab_kgsreg[] ;
   private java.math.BigDecimal AV173tab_kgsrig[] ;
   private java.math.BigDecimal AV175tab_mtsreg[] ;
   private java.math.BigDecimal AV177tab_mtsrig[] ;
   private java.math.BigDecimal AV166tab_costo[] ;
   private java.math.BigDecimal AV167tab_costog[] ;
   private java.math.BigDecimal AV195Totkgs ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV184Tot_kgs_e ;
   private java.math.BigDecimal AV187Tot_kgs_i ;
   private java.math.BigDecimal AV201Totmt_i ;
   private java.math.BigDecimal AV200Totmt_e ;
   private java.math.BigDecimal AV202Totmts ;
   private java.math.BigDecimal AV197TotKgsRi ;
   private java.math.BigDecimal AV204TotMtsRi ;
   private java.math.BigDecimal AV196TotKgsRe ;
   private java.math.BigDecimal AV203TotMtsRe ;
   private java.math.BigDecimal AV140Hisprokgr ;
   private java.math.BigDecimal AV142HisPromtr ;
   private java.math.BigDecimal AV116Barcosany ;
   private java.math.BigDecimal AV117barcospro ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV192totcosany ;
   private java.math.BigDecimal AV193Totcospro ;
   private java.math.BigDecimal AV162PesMedPar ;
   private java.math.BigDecimal AV155MinRea2 ;
   private java.math.BigDecimal AV144HmP ;
   private java.math.BigDecimal AV179TiempoNP ;
   private java.math.BigDecimal AV198TotKgsUtil ;
   private java.math.BigDecimal AV191totcos ;
   private java.math.BigDecimal AV205Totrire ;
   private java.math.BigDecimal AV164porcentage ;
   private String A396EmprCod ;
   private String AV163PMaqcod ;
   private String AV207UMaqCod ;
   private String AV182TipMaqcod ;
   private String AV111ArtCodi ;
   private String AV110Artcodf ;
   private String AV113Barcolnomi ;
   private String AV112barcolnomf ;
   private String AV124EmprNom ;
   private String A407EmprNom ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A1011TipMaqCod ;
   private String A602MaqCod ;
   private String AV141HisProLot ;
   private String A461Fase ;
   private String A3610HisProLot ;
   private String A606MaqDsc ;
   private String GXv_char2[] ;
   private String AV127FasActTin ;
   private String AV181Tipdefdsc ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV214Pgmname ;
   private java.util.Date AV139Hisprodti ;
   private java.util.Date AV138Hisprodtf ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date GXt_dtime8 ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean n1011TipMaqCod ;
   private boolean n4441HisProDTF ;
   private boolean n656ParCod ;
   private boolean brk8X53 ;
   private boolean n833TipDefCod ;
   private boolean n606MaqDsc ;
   private boolean n4440HisProDTI ;
   private String AV132FileName ;
   private String AV130File ;
   private String AV125ErrorMessage ;
   private String[] aP14 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private int[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private IDataStoreProvider pr_default ;
   private int[] P08X52_A129BarCod ;
   private byte[] P08X52_A132BarCodReo ;
   private String[] P08X52_A130BarCodPar ;
   private String[] P08X52_A396EmprCod ;
   private int[] P08X52_A136BarColNum ;
   private String[] P08X52_A135BarColNom ;
   private String[] P08X52_A212BarSer ;
   private String[] P08X52_A1011TipMaqCod ;
   private boolean[] P08X52_n1011TipMaqCod ;
   private java.util.Date[] P08X52_A4441HisProDTF ;
   private boolean[] P08X52_n4441HisProDTF ;
   private String[] P08X52_A602MaqCod ;
   private short[] P08X52_A656ParCod ;
   private boolean[] P08X52_n656ParCod ;
   private java.math.BigDecimal[] P08X52_A1525HisProKgr ;
   private byte[] P08X52_A3612HisProReo ;
   private java.util.Date[] P08X52_A558HisProFec ;
   private int[] P08X52_A561HisProLin ;
   private int[] P08X53_A129BarCod ;
   private byte[] P08X53_A132BarCodReo ;
   private String[] P08X53_A130BarCodPar ;
   private String[] P08X53_A396EmprCod ;
   private String[] P08X53_A602MaqCod ;
   private int[] P08X53_A136BarColNum ;
   private String[] P08X53_A135BarColNom ;
   private String[] P08X53_A212BarSer ;
   private String[] P08X53_A1011TipMaqCod ;
   private boolean[] P08X53_n1011TipMaqCod ;
   private String[] P08X53_A461Fase ;
   private java.math.BigDecimal[] P08X53_A1525HisProKgr ;
   private java.math.BigDecimal[] P08X53_A1526HisProMtr ;
   private byte[] P08X53_A148BarEstReo ;
   private short[] P08X53_A833TipDefCod ;
   private boolean[] P08X53_n833TipDefCod ;
   private short[] P08X53_A656ParCod ;
   private boolean[] P08X53_n656ParCod ;
   private int[] P08X53_A503GruOpeCod ;
   private String[] P08X53_A3610HisProLot ;
   private String[] P08X53_A606MaqDsc ;
   private boolean[] P08X53_n606MaqDsc ;
   private byte[] P08X53_A563HisProMin ;
   private byte[] P08X53_A560HisProHin ;
   private byte[] P08X53_A562HisProMfi ;
   private byte[] P08X53_A559HisProHfi ;
   private java.util.Date[] P08X53_A4440HisProDTI ;
   private boolean[] P08X53_n4440HisProDTI ;
   private java.util.Date[] P08X53_A4441HisProDTF ;
   private boolean[] P08X53_n4441HisProDTF ;
   private java.util.Date[] P08X53_A558HisProFec ;
   private int[] P08X53_A561HisProLin ;
   private com.genexus.gxoffice.ExcelDoc AV126ExcelDocument ;
}

final  class pxml108toexcel__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08X52", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T3.BarColNum, T3.BarColNom, T3.BarSer, T2.TipMaqCod, T1.HisProDTF, T1.MaqCod, T1.ParCod, T1.HisProKgr, T1.HisProReo, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T2.TipMaqCod = ? or (rtrim(?) IS NULL)) AND (T3.BarSer >= ?) AND (T3.BarSer <= ?) AND (T3.BarColNom >= ?) AND (T3.BarColNom <= ?) AND (T3.BarColNum >= ?) AND (T3.BarColNum <= ?) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08X53", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T1.MaqCod, T2.BarColNum, T2.BarColNom, T2.BarSer, T3.TipMaqCod, T1.Fase, T1.HisProKgr, T1.HisProMtr, T2.BarEstReo, T2.TipDefCod, T1.ParCod, T1.GruOpeCod, T1.HisProLot, T3.MaqDsc, T1.HisProMin, T1.HisProHin, T1.HisProMfi, T1.HisProHfi, T1.HisProDTI, T1.HisProDTF, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.MaqCod) WHERE (T1.MaqCod >= ?) AND (T1.EmprCod = ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T3.TipMaqCod = ? or (rtrim(?) IS NULL)) AND (T2.BarSer >= ?) AND (T2.BarSer <= ?) AND (T2.BarColNom >= ?) AND (T2.BarColNom <= ?) AND (T2.BarColNum >= ?) AND (T2.BarColNum <= ?) AND (T1.MaqCod <= ?) ORDER BY T1.MaqCod, T1.HisProLot, T1.GruOpeCod, T1.ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 10);
               ((String[]) buf[20])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(19);
               ((byte[]) buf[23])[0] = rslt.getByte(20);
               ((byte[]) buf[24])[0] = rslt.getByte(21);
               ((byte[]) buf[25])[0] = rslt.getByte(22);
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(24);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(25);
               ((int[]) buf[31])[0] = rslt.getInt(26);
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
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setString(5, (String)parms[4], 4);
               stmt.setString(6, (String)parms[5], 4);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 13);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setString(5, (String)parms[4], 4);
               stmt.setString(6, (String)parms[5], 4);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 13);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 6);
               return;
      }
   }

}

