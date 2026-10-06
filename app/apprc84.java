package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apprc84 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apprc84 pgm = new apprc84 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apprc84( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apprc84.class ), "" );
   }

   public apprc84( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV76UsurCod = " " ;
      AV77Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV81EmprCod ;
      GXv_char2[0] = AV78EmprNom ;
      GXv_char3[0] = AV76UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV77Station, GXv_char1, GXv_char2, GXv_char3) ;
      apprc84.this.AV81EmprCod = GXv_char1[0] ;
      apprc84.this.AV78EmprNom = GXv_char2[0] ;
      apprc84.this.AV76UsurCod = GXv_char3[0] ;
      AV172LastOpe = 0 ;
      /* Using cursor P05H52 */
      pr_default.execute(0, new Object[] {AV81EmprCod, AV79Fec1, AV80Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P05H52_A129BarCod[0] ;
         A132BarCodReo = P05H52_A132BarCodReo[0] ;
         A130BarCodPar = P05H52_A130BarCodPar[0] ;
         A396EmprCod = P05H52_A396EmprCod[0] ;
         A656ParCod = P05H52_A656ParCod[0] ;
         n656ParCod = P05H52_n656ParCod[0] ;
         A602MaqCod = P05H52_A602MaqCod[0] ;
         A10360HisProFd = P05H52_A10360HisProFd[0] ;
         A503GruOpeCod = P05H52_A503GruOpeCod[0] ;
         A558HisProFec = P05H52_A558HisProFec[0] ;
         A252CliCod = P05H52_A252CliCod[0] ;
         n252CliCod = P05H52_n252CliCod[0] ;
         A212BarSer = P05H52_A212BarSer[0] ;
         A135BarColNom = P05H52_A135BarColNom[0] ;
         A136BarColNum = P05H52_A136BarColNum[0] ;
         A218BarTipCol = P05H52_A218BarTipCol[0] ;
         A148BarEstReo = P05H52_A148BarEstReo[0] ;
         A1525HisProKgr = P05H52_A1525HisProKgr[0] ;
         A211BarRdt = P05H52_A211BarRdt[0] ;
         A1910BarRdoN = P05H52_A1910BarRdoN[0] ;
         A566HisProTur = P05H52_A566HisProTur[0] ;
         A4714HisProNpzs = P05H52_A4714HisProNpzs[0] ;
         A4440HisProDTI = P05H52_A4440HisProDTI[0] ;
         n4440HisProDTI = P05H52_n4440HisProDTI[0] ;
         A4441HisProDTF = P05H52_A4441HisProDTF[0] ;
         n4441HisProDTF = P05H52_n4441HisProDTF[0] ;
         A561HisProLin = P05H52_A561HisProLin[0] ;
         A252CliCod = P05H52_A252CliCod[0] ;
         n252CliCod = P05H52_n252CliCod[0] ;
         A212BarSer = P05H52_A212BarSer[0] ;
         A135BarColNom = P05H52_A135BarColNom[0] ;
         A136BarColNum = P05H52_A136BarColNum[0] ;
         A218BarTipCol = P05H52_A218BarTipCol[0] ;
         A148BarEstReo = P05H52_A148BarEstReo[0] ;
         A211BarRdt = P05H52_A211BarRdt[0] ;
         A1910BarRdoN = P05H52_A1910BarRdoN[0] ;
         if ( GXutil.strcmp(A602MaqCod, httpContext.getMessage( "TIBL01", "")) == 0 )
         {
            if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
            {
               A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
            }
            else
            {
               A5605HisProTr2 = (short)(0) ;
            }
            AV170Gruopecod = A503GruOpeCod ;
            AV134HisProfec = A558HisProFec ;
            AV138MaqCod = GXutil.substring( A602MaqCod, 1, 4) ;
            if ( ( AV170Gruopecod != AV172LastOpe ) && ( AV172LastOpe > 0 ) )
            {
               /* Execute user subroutine: 'IMPOPE' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char2[0] = A212BarSer ;
            GXv_char1[0] = A135BarColNom ;
            GXv_int5[0] = A136BarColNum ;
            GXv_int6[0] = A218BarTipCol ;
            GXv_int7[0] = AV131ForNumcol ;
            new app.pnformu(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char2, GXv_char1, GXv_int5, GXv_int6, GXv_int7) ;
            apprc84.this.A396EmprCod = GXv_char3[0] ;
            apprc84.this.A252CliCod = GXv_int4[0] ;
            apprc84.this.A212BarSer = GXv_char2[0] ;
            apprc84.this.A135BarColNom = GXv_char1[0] ;
            apprc84.this.A136BarColNum = GXv_int5[0] ;
            apprc84.this.A218BarTipCol = GXv_int6[0] ;
            apprc84.this.AV131ForNumcol = GXv_int7[0] ;
            AV150Tothm = AV150Tothm.add(DecimalUtil.doubleToDec(A5605HisProTr2)) ;
            AV151Tothmf = DecimalUtil.doubleToDec(0) ;
            if ( ( AV131ForNumcol >= 980000 ) && ( A148BarEstReo == 0 ) )
            {
               AV154TotKB = AV154TotKB.add(A1525HisProKgr) ;
               AV155Totkbt = AV155Totkbt.add(A1525HisProKgr) ;
            }
            if ( ( AV131ForNumcol < 980000 ) && ( A148BarEstReo == 0 ) )
            {
               AV158TotKM = AV158TotKM.add(A1525HisProKgr) ;
               AV159Totkmt = AV159Totkmt.add(A1525HisProKgr) ;
            }
            if ( A148BarEstReo == 1 )
            {
               AV160TotKR = AV160TotKR.add(A1525HisProKgr) ;
               AV161Totkrt = AV161Totkrt.add(A1525HisProKgr) ;
            }
            AV137Kgshh = DecimalUtil.doubleToDec(0) ;
            if ( A211BarRdt.doubleValue() > 0 )
            {
               AV137Kgshh = (A1910BarRdoN.multiply(DecimalUtil.doubleToDec(60))).divide(A211BarRdt, 18, java.math.RoundingMode.DOWN) ;
            }
            AV163Totkteo = AV163Totkteo.add(AV137Kgshh) ;
            AV171HisProTur = A566HisProTur ;
            AV144Nrg = (int)(AV144Nrg+1) ;
            AV142Mts = A1525HisProKgr.multiply(A211BarRdt) ;
            AV136Horas1 = DecimalUtil.doubleToDec(0) ;
            if ( A1910BarRdoN.doubleValue() > 0 )
            {
               AV136Horas1 = (AV142Mts.divide(A1910BarRdoN, 18, java.math.RoundingMode.DOWN)).divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
            }
            AV146Tot_h = AV146Tot_h.add(AV136Horas1) ;
            AV172LastOpe = A503GruOpeCod ;
            AV147Tot_k = AV147Tot_k.add(A1525HisProKgr) ;
            AV149Tot_p = (int)(AV149Tot_p+A4714HisProNpzs) ;
            AV148Tot_m = AV148Tot_m.add(AV142Mts) ;
            AV173Pdt_dia = A10360HisProFd ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Execute user subroutine: 'IMPOPE' */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'IMPOPE' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ACREDITACION' */
      S121 ();
      if (returnInSub) return;
      /*
         INSERT RECORD ON TABLE TXPTR0500

      */
      A10303Pdt_dia = AV173Pdt_dia ;
      A10304Pdt_maq = AV138MaqCod ;
      A10305Pdt_kgs = AV147Tot_k ;
      n10305Pdt_kgs = false ;
      A10306Pdt_mts = AV148Tot_m ;
      n10306Pdt_mts = false ;
      A10307Pdt_pzas = AV149Tot_p ;
      n10307Pdt_pzas = false ;
      A10308Pdt_hmmr = AV135Hmmr ;
      n10308Pdt_hmmr = false ;
      A10309Pdt_hmp = DecimalUtil.doubleToDec(0) ;
      n10309Pdt_hmp = false ;
      A10310Pdt_hpo = AV82Act_hhpr ;
      n10310Pdt_hpo = false ;
      A10311Pdt_Hv = AV83Act_hhpri ;
      n10311Pdt_Hv = false ;
      A10312Pdt_KgM = AV158TotKM ;
      n10312Pdt_KgM = false ;
      A10313Pdt_KgB = AV154TotKB ;
      n10313Pdt_KgB = false ;
      A10314Pdt_KgR = AV160TotKR ;
      n10314Pdt_KgR = false ;
      A10315Pdt_KgTC = DecimalUtil.doubleToDec(0) ;
      n10315Pdt_KgTC = false ;
      A10316Pdt_KgTB = DecimalUtil.doubleToDec(0) ;
      n10316Pdt_KgTB = false ;
      A10317Pdt_KgA = DecimalUtil.doubleToDec(0) ;
      n10317Pdt_KgA = false ;
      /* Using cursor P05H53 */
      pr_default.execute(1, new Object[] {A396EmprCod, A10303Pdt_dia, A10304Pdt_maq, Boolean.valueOf(n10305Pdt_kgs), A10305Pdt_kgs, Boolean.valueOf(n10306Pdt_mts), A10306Pdt_mts, Boolean.valueOf(n10307Pdt_pzas), Integer.valueOf(A10307Pdt_pzas), Boolean.valueOf(n10308Pdt_hmmr), A10308Pdt_hmmr, Boolean.valueOf(n10309Pdt_hmp), A10309Pdt_hmp, Boolean.valueOf(n10310Pdt_hpo), A10310Pdt_hpo, Boolean.valueOf(n10311Pdt_Hv), A10311Pdt_Hv, Boolean.valueOf(n10312Pdt_KgM), A10312Pdt_KgM, Boolean.valueOf(n10313Pdt_KgB), A10313Pdt_KgB, Boolean.valueOf(n10314Pdt_KgR), A10314Pdt_KgR, Boolean.valueOf(n10315Pdt_KgTC), A10315Pdt_KgTC, Boolean.valueOf(n10316Pdt_KgTB), A10316Pdt_KgTB, Boolean.valueOf(n10317Pdt_KgA), A10317Pdt_KgA});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0500");
      if ( (pr_default.getStatus(1) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         n10311Pdt_Hv = false ;
         n10310Pdt_hpo = false ;
         n10314Pdt_KgR = false ;
         n10313Pdt_KgB = false ;
         n10312Pdt_KgM = false ;
         n10308Pdt_hmmr = false ;
         n10306Pdt_mts = false ;
         n10307Pdt_pzas = false ;
         n10305Pdt_kgs = false ;
         /* Optimized UPDATE. */
         /* Using cursor P05H54 */
         pr_default.execute(2, new Object[] {AV83Act_hhpri, AV82Act_hhpr, AV160TotKR, AV154TotKB, AV158TotKM, AV135Hmmr, AV148Tot_m, Integer.valueOf(AV149Tot_p), AV147Tot_k, A396EmprCod, A10303Pdt_dia, A10304Pdt_maq});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0500");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      AV147Tot_k = DecimalUtil.doubleToDec(0) ;
      AV149Tot_p = 0 ;
      AV150Tothm = DecimalUtil.doubleToDec(0) ;
      AV151Tothmf = DecimalUtil.doubleToDec(0) ;
      AV154TotKB = DecimalUtil.doubleToDec(0) ;
      AV158TotKM = DecimalUtil.doubleToDec(0) ;
      AV160TotKR = DecimalUtil.doubleToDec(0) ;
      AV162TotKT = DecimalUtil.doubleToDec(0) ;
      AV157TotKhmm = DecimalUtil.doubleToDec(0) ;
      AV164TotKthmm = DecimalUtil.doubleToDec(0) ;
      AV146Tot_h = DecimalUtil.doubleToDec(0) ;
      AV148Tot_m = DecimalUtil.doubleToDec(0) ;
   }

   public void S121( )
   {
      /* 'ACREDITACION' Routine */
      returnInSub = false ;
      AV135Hmmr = DecimalUtil.doubleToDec(0) ;
      AV141mq_di = GXutil.resetTime( GXutil.nullDate() );
      AV140Mq_df = GXutil.resetTime( GXutil.nullDate() );
      AV143N_r = (short)(0) ;
      AV139MinSec = 0 ;
      /* Using cursor P05H55 */
      pr_default.execute(3, new Object[] {AV138MaqCod, AV173Pdt_dia, Integer.valueOf(AV172LastOpe)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A10112Mq_Op = P05H55_A10112Mq_Op[0] ;
         A10111Mq_Dia = P05H55_A10111Mq_Dia[0] ;
         A602MaqCod = P05H55_A602MaqCod[0] ;
         A10116Mq_Df = P05H55_A10116Mq_Df[0] ;
         n10116Mq_Df = P05H55_n10116Mq_Df[0] ;
         A10115Mq_Di = P05H55_A10115Mq_Di[0] ;
         n10115Mq_Di = P05H55_n10115Mq_Di[0] ;
         A10118Mq_Cont = P05H55_A10118Mq_Cont[0] ;
         n10118Mq_Cont = P05H55_n10118Mq_Cont[0] ;
         A10179Mq_Contf = P05H55_A10179Mq_Contf[0] ;
         n10179Mq_Contf = P05H55_n10179Mq_Contf[0] ;
         A10114Mq_Ln = P05H55_A10114Mq_Ln[0] ;
         A396EmprCod = P05H55_A396EmprCod[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A10116Mq_Df) )
         {
            AV139MinSec = (int)(AV139MinSec+(GXutil.dtdiff( A10116Mq_Df, A10115Mq_Di)/ (double) (60))) ;
         }
         AV135Hmmr = AV135Hmmr.add(((A10179Mq_Contf.subtract(A10118Mq_Cont)))) ;
         if ( GXutil.dateCompare(GXutil.nullDate(), AV141mq_di) )
         {
            AV141mq_di = A10115Mq_Di ;
         }
         AV143N_r = (short)(AV143N_r+1) ;
         AV140Mq_df = A10116Mq_Df ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV82Act_hhpr = DecimalUtil.doubleToDec(0) ;
      AV83Act_hhpri = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05H56 */
      pr_default.execute(4, new Object[] {AV138MaqCod, AV173Pdt_dia, Integer.valueOf(AV172LastOpe)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A652OpeCod = P05H56_A652OpeCod[0] ;
         A10278Act_dia = P05H56_A10278Act_dia[0] ;
         A10279Act_Maq = P05H56_A10279Act_Maq[0] ;
         A10282Act_hhpr = P05H56_A10282Act_hhpr[0] ;
         n10282Act_hhpr = P05H56_n10282Act_hhpr[0] ;
         A10283Act_hhprI = P05H56_A10283Act_hhprI[0] ;
         n10283Act_hhprI = P05H56_n10283Act_hhprI[0] ;
         A396EmprCod = P05H56_A396EmprCod[0] ;
         AV82Act_hhpr = A10282Act_hhpr ;
         AV83Act_hhpri = A10283Act_hhprI ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pprc84.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apprc84");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV76UsurCod = "" ;
      AV77Station = "" ;
      AV81EmprCod = "" ;
      AV78EmprNom = "" ;
      scmdbuf = "" ;
      AV79Fec1 = GXutil.nullDate() ;
      AV80Fec2 = GXutil.nullDate() ;
      P05H52_A129BarCod = new int[1] ;
      P05H52_A132BarCodReo = new byte[1] ;
      P05H52_A130BarCodPar = new String[] {""} ;
      P05H52_A396EmprCod = new String[] {""} ;
      P05H52_A656ParCod = new short[1] ;
      P05H52_n656ParCod = new boolean[] {false} ;
      P05H52_A602MaqCod = new String[] {""} ;
      P05H52_A10360HisProFd = new java.util.Date[] {GXutil.nullDate()} ;
      P05H52_A503GruOpeCod = new int[1] ;
      P05H52_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05H52_A252CliCod = new int[1] ;
      P05H52_n252CliCod = new boolean[] {false} ;
      P05H52_A212BarSer = new String[] {""} ;
      P05H52_A135BarColNom = new String[] {""} ;
      P05H52_A136BarColNum = new int[1] ;
      P05H52_A218BarTipCol = new byte[1] ;
      P05H52_A148BarEstReo = new byte[1] ;
      P05H52_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05H52_A211BarRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05H52_A1910BarRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05H52_A566HisProTur = new byte[1] ;
      P05H52_A4714HisProNpzs = new short[1] ;
      P05H52_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P05H52_n4440HisProDTI = new boolean[] {false} ;
      P05H52_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P05H52_n4441HisProDTF = new boolean[] {false} ;
      P05H52_A561HisProLin = new int[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A10360HisProFd = GXutil.nullDate() ;
      A558HisProFec = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A211BarRdt = DecimalUtil.ZERO ;
      A1910BarRdoN = DecimalUtil.ZERO ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV134HisProfec = GXutil.nullDate() ;
      AV138MaqCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new int[1] ;
      AV150Tothm = DecimalUtil.ZERO ;
      AV151Tothmf = DecimalUtil.ZERO ;
      AV154TotKB = DecimalUtil.ZERO ;
      AV155Totkbt = DecimalUtil.ZERO ;
      AV158TotKM = DecimalUtil.ZERO ;
      AV159Totkmt = DecimalUtil.ZERO ;
      AV160TotKR = DecimalUtil.ZERO ;
      AV161Totkrt = DecimalUtil.ZERO ;
      AV137Kgshh = DecimalUtil.ZERO ;
      AV163Totkteo = DecimalUtil.ZERO ;
      AV142Mts = DecimalUtil.ZERO ;
      AV136Horas1 = DecimalUtil.ZERO ;
      AV146Tot_h = DecimalUtil.ZERO ;
      AV147Tot_k = DecimalUtil.ZERO ;
      AV148Tot_m = DecimalUtil.ZERO ;
      AV173Pdt_dia = GXutil.nullDate() ;
      A10303Pdt_dia = GXutil.nullDate() ;
      A10304Pdt_maq = "" ;
      A10305Pdt_kgs = DecimalUtil.ZERO ;
      A10306Pdt_mts = DecimalUtil.ZERO ;
      A10308Pdt_hmmr = DecimalUtil.ZERO ;
      AV135Hmmr = DecimalUtil.ZERO ;
      A10309Pdt_hmp = DecimalUtil.ZERO ;
      A10310Pdt_hpo = DecimalUtil.ZERO ;
      AV82Act_hhpr = DecimalUtil.ZERO ;
      A10311Pdt_Hv = DecimalUtil.ZERO ;
      AV83Act_hhpri = DecimalUtil.ZERO ;
      A10312Pdt_KgM = DecimalUtil.ZERO ;
      A10313Pdt_KgB = DecimalUtil.ZERO ;
      A10314Pdt_KgR = DecimalUtil.ZERO ;
      A10315Pdt_KgTC = DecimalUtil.ZERO ;
      A10316Pdt_KgTB = DecimalUtil.ZERO ;
      A10317Pdt_KgA = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      AV162TotKT = DecimalUtil.ZERO ;
      AV157TotKhmm = DecimalUtil.ZERO ;
      AV164TotKthmm = DecimalUtil.ZERO ;
      AV141mq_di = GXutil.resetTime( GXutil.nullDate() );
      AV140Mq_df = GXutil.resetTime( GXutil.nullDate() );
      P05H55_A10112Mq_Op = new int[1] ;
      P05H55_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P05H55_A602MaqCod = new String[] {""} ;
      P05H55_A10116Mq_Df = new java.util.Date[] {GXutil.nullDate()} ;
      P05H55_n10116Mq_Df = new boolean[] {false} ;
      P05H55_A10115Mq_Di = new java.util.Date[] {GXutil.nullDate()} ;
      P05H55_n10115Mq_Di = new boolean[] {false} ;
      P05H55_A10118Mq_Cont = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05H55_n10118Mq_Cont = new boolean[] {false} ;
      P05H55_A10179Mq_Contf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05H55_n10179Mq_Contf = new boolean[] {false} ;
      P05H55_A10114Mq_Ln = new int[1] ;
      P05H55_A396EmprCod = new String[] {""} ;
      A10111Mq_Dia = GXutil.nullDate() ;
      A10116Mq_Df = GXutil.resetTime( GXutil.nullDate() );
      A10115Mq_Di = GXutil.resetTime( GXutil.nullDate() );
      A10118Mq_Cont = DecimalUtil.ZERO ;
      A10179Mq_Contf = DecimalUtil.ZERO ;
      P05H56_A652OpeCod = new int[1] ;
      P05H56_A10278Act_dia = new java.util.Date[] {GXutil.nullDate()} ;
      P05H56_A10279Act_Maq = new String[] {""} ;
      P05H56_A10282Act_hhpr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05H56_n10282Act_hhpr = new boolean[] {false} ;
      P05H56_A10283Act_hhprI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05H56_n10283Act_hhprI = new boolean[] {false} ;
      P05H56_A396EmprCod = new String[] {""} ;
      A10278Act_dia = GXutil.nullDate() ;
      A10279Act_Maq = "" ;
      A10282Act_hhpr = DecimalUtil.ZERO ;
      A10283Act_hhprI = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apprc84__default(),
         new Object[] {
             new Object[] {
            P05H52_A129BarCod, P05H52_A132BarCodReo, P05H52_A130BarCodPar, P05H52_A396EmprCod, P05H52_A656ParCod, P05H52_n656ParCod, P05H52_A602MaqCod, P05H52_A10360HisProFd, P05H52_A503GruOpeCod, P05H52_A558HisProFec,
            P05H52_A252CliCod, P05H52_n252CliCod, P05H52_A212BarSer, P05H52_A135BarColNom, P05H52_A136BarColNum, P05H52_A218BarTipCol, P05H52_A148BarEstReo, P05H52_A1525HisProKgr, P05H52_A211BarRdt, P05H52_A1910BarRdoN,
            P05H52_A566HisProTur, P05H52_A4714HisProNpzs, P05H52_A4440HisProDTI, P05H52_n4440HisProDTI, P05H52_A4441HisProDTF, P05H52_n4441HisProDTF, P05H52_A561HisProLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P05H55_A10112Mq_Op, P05H55_A10111Mq_Dia, P05H55_A602MaqCod, P05H55_A10116Mq_Df, P05H55_n10116Mq_Df, P05H55_A10115Mq_Di, P05H55_n10115Mq_Di, P05H55_A10118Mq_Cont, P05H55_n10118Mq_Cont, P05H55_A10179Mq_Contf,
            P05H55_n10179Mq_Contf, P05H55_A10114Mq_Ln, P05H55_A396EmprCod
            }
            , new Object[] {
            P05H56_A652OpeCod, P05H56_A10278Act_dia, P05H56_A10279Act_Maq, P05H56_A10282Act_hhpr, P05H56_n10282Act_hhpr, P05H56_A10283Act_hhprI, P05H56_n10283Act_hhprI, P05H56_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A148BarEstReo ;
   private byte A566HisProTur ;
   private byte GXv_int6[] ;
   private byte AV171HisProTur ;
   private short A656ParCod ;
   private short A4714HisProNpzs ;
   private short A5605HisProTr2 ;
   private short Gx_err ;
   private short AV143N_r ;
   private int AV172LastOpe ;
   private int A129BarCod ;
   private int A503GruOpeCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A561HisProLin ;
   private int AV170Gruopecod ;
   private int GXv_int4[] ;
   private int GXv_int5[] ;
   private int AV131ForNumcol ;
   private int GXv_int7[] ;
   private int AV144Nrg ;
   private int AV149Tot_p ;
   private int GX_INS1400 ;
   private int A10307Pdt_pzas ;
   private int AV139MinSec ;
   private int A10112Mq_Op ;
   private int A10114Mq_Ln ;
   private int A652OpeCod ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A1910BarRdoN ;
   private java.math.BigDecimal AV150Tothm ;
   private java.math.BigDecimal AV151Tothmf ;
   private java.math.BigDecimal AV154TotKB ;
   private java.math.BigDecimal AV155Totkbt ;
   private java.math.BigDecimal AV158TotKM ;
   private java.math.BigDecimal AV159Totkmt ;
   private java.math.BigDecimal AV160TotKR ;
   private java.math.BigDecimal AV161Totkrt ;
   private java.math.BigDecimal AV137Kgshh ;
   private java.math.BigDecimal AV163Totkteo ;
   private java.math.BigDecimal AV142Mts ;
   private java.math.BigDecimal AV136Horas1 ;
   private java.math.BigDecimal AV146Tot_h ;
   private java.math.BigDecimal AV147Tot_k ;
   private java.math.BigDecimal AV148Tot_m ;
   private java.math.BigDecimal A10305Pdt_kgs ;
   private java.math.BigDecimal A10306Pdt_mts ;
   private java.math.BigDecimal A10308Pdt_hmmr ;
   private java.math.BigDecimal AV135Hmmr ;
   private java.math.BigDecimal A10309Pdt_hmp ;
   private java.math.BigDecimal A10310Pdt_hpo ;
   private java.math.BigDecimal AV82Act_hhpr ;
   private java.math.BigDecimal A10311Pdt_Hv ;
   private java.math.BigDecimal AV83Act_hhpri ;
   private java.math.BigDecimal A10312Pdt_KgM ;
   private java.math.BigDecimal A10313Pdt_KgB ;
   private java.math.BigDecimal A10314Pdt_KgR ;
   private java.math.BigDecimal A10315Pdt_KgTC ;
   private java.math.BigDecimal A10316Pdt_KgTB ;
   private java.math.BigDecimal A10317Pdt_KgA ;
   private java.math.BigDecimal AV162TotKT ;
   private java.math.BigDecimal AV157TotKhmm ;
   private java.math.BigDecimal AV164TotKthmm ;
   private java.math.BigDecimal A10118Mq_Cont ;
   private java.math.BigDecimal A10179Mq_Contf ;
   private java.math.BigDecimal A10282Act_hhpr ;
   private java.math.BigDecimal A10283Act_hhprI ;
   private String AV76UsurCod ;
   private String AV77Station ;
   private String AV81EmprCod ;
   private String AV78EmprNom ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV138MaqCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String A10304Pdt_maq ;
   private String Gx_emsg ;
   private String A10279Act_Maq ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV141mq_di ;
   private java.util.Date AV140Mq_df ;
   private java.util.Date A10116Mq_Df ;
   private java.util.Date A10115Mq_Di ;
   private java.util.Date AV79Fec1 ;
   private java.util.Date AV80Fec2 ;
   private java.util.Date A10360HisProFd ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV134HisProfec ;
   private java.util.Date AV173Pdt_dia ;
   private java.util.Date A10303Pdt_dia ;
   private java.util.Date A10111Mq_Dia ;
   private java.util.Date A10278Act_dia ;
   private boolean n656ParCod ;
   private boolean n252CliCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean returnInSub ;
   private boolean n10305Pdt_kgs ;
   private boolean n10306Pdt_mts ;
   private boolean n10307Pdt_pzas ;
   private boolean n10308Pdt_hmmr ;
   private boolean n10309Pdt_hmp ;
   private boolean n10310Pdt_hpo ;
   private boolean n10311Pdt_Hv ;
   private boolean n10312Pdt_KgM ;
   private boolean n10313Pdt_KgB ;
   private boolean n10314Pdt_KgR ;
   private boolean n10315Pdt_KgTC ;
   private boolean n10316Pdt_KgTB ;
   private boolean n10317Pdt_KgA ;
   private boolean n10116Mq_Df ;
   private boolean n10115Mq_Di ;
   private boolean n10118Mq_Cont ;
   private boolean n10179Mq_Contf ;
   private boolean n10282Act_hhpr ;
   private boolean n10283Act_hhprI ;
   private IDataStoreProvider pr_default ;
   private int[] P05H52_A129BarCod ;
   private byte[] P05H52_A132BarCodReo ;
   private String[] P05H52_A130BarCodPar ;
   private String[] P05H52_A396EmprCod ;
   private short[] P05H52_A656ParCod ;
   private boolean[] P05H52_n656ParCod ;
   private String[] P05H52_A602MaqCod ;
   private java.util.Date[] P05H52_A10360HisProFd ;
   private int[] P05H52_A503GruOpeCod ;
   private java.util.Date[] P05H52_A558HisProFec ;
   private int[] P05H52_A252CliCod ;
   private boolean[] P05H52_n252CliCod ;
   private String[] P05H52_A212BarSer ;
   private String[] P05H52_A135BarColNom ;
   private int[] P05H52_A136BarColNum ;
   private byte[] P05H52_A218BarTipCol ;
   private byte[] P05H52_A148BarEstReo ;
   private java.math.BigDecimal[] P05H52_A1525HisProKgr ;
   private java.math.BigDecimal[] P05H52_A211BarRdt ;
   private java.math.BigDecimal[] P05H52_A1910BarRdoN ;
   private byte[] P05H52_A566HisProTur ;
   private short[] P05H52_A4714HisProNpzs ;
   private java.util.Date[] P05H52_A4440HisProDTI ;
   private boolean[] P05H52_n4440HisProDTI ;
   private java.util.Date[] P05H52_A4441HisProDTF ;
   private boolean[] P05H52_n4441HisProDTF ;
   private int[] P05H52_A561HisProLin ;
   private int[] P05H55_A10112Mq_Op ;
   private java.util.Date[] P05H55_A10111Mq_Dia ;
   private String[] P05H55_A602MaqCod ;
   private java.util.Date[] P05H55_A10116Mq_Df ;
   private boolean[] P05H55_n10116Mq_Df ;
   private java.util.Date[] P05H55_A10115Mq_Di ;
   private boolean[] P05H55_n10115Mq_Di ;
   private java.math.BigDecimal[] P05H55_A10118Mq_Cont ;
   private boolean[] P05H55_n10118Mq_Cont ;
   private java.math.BigDecimal[] P05H55_A10179Mq_Contf ;
   private boolean[] P05H55_n10179Mq_Contf ;
   private int[] P05H55_A10114Mq_Ln ;
   private String[] P05H55_A396EmprCod ;
   private int[] P05H56_A652OpeCod ;
   private java.util.Date[] P05H56_A10278Act_dia ;
   private String[] P05H56_A10279Act_Maq ;
   private java.math.BigDecimal[] P05H56_A10282Act_hhpr ;
   private boolean[] P05H56_n10282Act_hhpr ;
   private java.math.BigDecimal[] P05H56_A10283Act_hhprI ;
   private boolean[] P05H56_n10283Act_hhprI ;
   private String[] P05H56_A396EmprCod ;
}

final  class apprc84__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05H52", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T1.ParCod, T1.MaqCod, T1.HisProFd, T1.GruOpeCod, T1.HisProFec, T2.CliCod, T2.BarSer, T2.BarColNom, T2.BarColNum, T2.BarTipCol, T2.BarEstReo, T1.HisProKgr, T2.BarRdt, T2.BarRdoN, T1.HisProTur, T1.HisProNpzs, T1.HisProDTI, T1.HisProDTF, T1.HisProLin FROM (TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.HisProFd >= ?) AND (T1.ParCod = 0) AND (T1.HisProFd <= ?) ORDER BY T1.EmprCod, T1.HisProFd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05H53", "INSERT INTO TXPTR0500(EmprCod, Pdt_dia, Pdt_maq, Pdt_kgs, Pdt_mts, Pdt_pzas, Pdt_hmmr, Pdt_hmp, Pdt_hpo, Pdt_Hv, Pdt_KgM, Pdt_KgB, Pdt_KgR, Pdt_KgTC, Pdt_KgTB, Pdt_KgA, Pdt_KgPr, Pdt_KgGi, Pdt_KgDe, Pdt_KgCn, Pdt_KgCj) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTR0500")
         ,new UpdateCursor("P05H54", "UPDATE TXPTR0500 SET Pdt_Hv=Pdt_Hv + ?, Pdt_hpo=Pdt_hpo + ?, Pdt_KgR=Pdt_KgR + ?, Pdt_KgB=Pdt_KgB + ?, Pdt_KgM=Pdt_KgM + ?, Pdt_hmmr=Pdt_hmmr + ?, Pdt_mts=Pdt_mts + ?, Pdt_pzas=Pdt_pzas + ?, Pdt_kgs=Pdt_kgs + ?  WHERE EmprCod = ? and Pdt_dia = ? and Pdt_maq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTR0500")
         ,new ForEachCursor("P05H55", "SELECT Mq_Op, Mq_Dia, MaqCod, Mq_Df, Mq_Di, Mq_Cont, Mq_Contf, Mq_Ln, EmprCod FROM TXPMQDDO1 WHERE (MaqCod = ?) AND (Mq_Dia = ?) AND (Mq_Op = ?) ORDER BY EmprCod, MaqCod, Mq_Dia, Mq_Op, Mq_Ln ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05H56", "SELECT OpeCod, Act_dia, Act_Maq, Act_hhpr, Act_hhprI, EmprCod FROM TXPTR0301 WHERE (Act_Maq = ?) AND (Act_dia = ?) AND (OpeCod = ?) ORDER BY EmprCod, OpeCod, Act_dia, Act_Maq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 16);
               ((String[]) buf[13])[0] = rslt.getString(12, 13);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(22);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(23);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 6);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[16], 2);
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
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[28], 2);
               }
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setString(10, (String)parms[9], 3);
               stmt.setDate(11, (java.util.Date)parms[10]);
               stmt.setString(12, (String)parms[11], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

