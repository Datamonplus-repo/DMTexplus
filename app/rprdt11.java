package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rprdt11 extends GXReport
{
   public rprdt11( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rprdt11.class ), "" );
   }

   public rprdt11( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
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
                             int[] aP11 )
   {
      rprdt11.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String aP0 ,
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
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String aP0 ,
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
                             String[] aP12 )
   {
      rprdt11.this.A396EmprCod = aP0;
      rprdt11.this.AV83PMaqCod = aP1[0];
      this.aP1 = aP1;
      rprdt11.this.AV116UMaqCod = aP2[0];
      this.aP2 = aP2;
      rprdt11.this.AV35Hisprodti = aP3[0];
      this.aP3 = aP3;
      rprdt11.this.AV34Hisprodtf = aP4[0];
      this.aP4 = aP4;
      rprdt11.this.AV94TipMaqCod = aP5[0];
      this.aP5 = aP5;
      rprdt11.this.AV9ArtCodi = aP6[0];
      this.aP6 = aP6;
      rprdt11.this.AV8ArtCodf = aP7[0];
      this.aP7 = aP7;
      rprdt11.this.AV17Barcolnomi = aP8[0];
      this.aP8 = aP8;
      rprdt11.this.AV16Barcolnomf = aP9[0];
      this.aP9 = aP9;
      rprdt11.this.AV19Barcolnumi = aP10[0];
      this.aP10 = aP10;
      rprdt11.this.AV18Barcolnumf = aP11[0];
      this.aP11 = aP11;
      rprdt11.this.AV25Filename = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 1 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName(AV25Filename) ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         if ( (GXutil.strcmp("", AV25Filename)==0) )
         {
            AV25Filename = GXutil.trim( AV121Pgmdesc) + ".pdf" ;
            AV25Filename = GXutil.strReplace( AV25Filename, " ", "_") ;
         }
         AV22EmpCod = A396EmprCod ;
         GXt_char1 = AV46Lit01 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT561_", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit01 = GXt_char1 ;
         GXt_char1 = AV47Lit02 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2469_", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit02 = GXt_char1 ;
         GXt_char1 = AV45Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV122Pgmname, (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit0 = GXt_char1 ;
         GXt_char1 = AV48Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV48Lit1 = GXt_char1 ;
         GXt_char1 = AV59Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV59Lit2 = GXt_char1 ;
         GXt_char1 = AV62Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV62Lit3 = GXt_char1 ;
         GXt_char1 = AV63Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2097_", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV63Lit4 = GXt_char1 ;
         GXt_char1 = AV64Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2187_", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV64Lit5 = GXt_char1 ;
         GXt_char1 = AV65Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV65Lit6 = GXt_char1 ;
         GXt_char1 = AV66Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV66Lit7 = GXt_char1 ;
         GXt_char1 = AV67Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2465_", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV67Lit8 = GXt_char1 ;
         GXt_char1 = AV68Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV68Lit9 = GXt_char1 ;
         GXt_char1 = AV49Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT516_", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit10 = GXt_char1 ;
         GXt_char1 = AV50Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2465_", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit11 = GXt_char1 ;
         GXt_char1 = AV51Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT516_", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV51Lit12 = GXt_char1 ;
         GXt_char1 = AV52Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN288_", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV52Lit13 = GXt_char1 ;
         GXt_char1 = AV53Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT399_", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV53Lit14 = GXt_char1 ;
         GXt_char1 = AV54Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT516_", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV54Lit15 = GXt_char1 ;
         GXt_char1 = AV55Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN017", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV55Lit16 = GXt_char1 ;
         GXt_char1 = AV56Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN018", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV56Lit17 = GXt_char1 ;
         GXt_char1 = AV57Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN017", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV57Lit18 = GXt_char1 ;
         GXt_char1 = AV58Lit19 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN018", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV58Lit19 = GXt_char1 ;
         GXt_char1 = AV60Lit20 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN019", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV60Lit20 = GXt_char1 ;
         GXt_char1 = AV61Lit21 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN019", ""), (byte)(99), GXv_char2) ;
         rprdt11.this.GXt_char1 = GXv_char2[0] ;
         AV61Lit21 = GXt_char1 ;
         GXv_int3[0] = AV88Texknit ;
         new app.pexicon(remoteHandle, context).execute( AV118EmprCod, httpContext.getMessage( "TEXKNI", ""), GXv_int3) ;
         rprdt11.this.AV88Texknit = GXv_int3[0] ;
         GXv_int3[0] = AV24F_tintutex ;
         new app.pexicon(remoteHandle, context).execute( AV118EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int3) ;
         rprdt11.this.AV24F_tintutex = GXv_int3[0] ;
         GXv_int3[0] = AV29FlagTiReal ;
         new app.pexicon(remoteHandle, context).execute( AV118EmprCod, httpContext.getMessage( "TIREAL", ""), GXv_int3) ;
         rprdt11.this.AV29FlagTiReal = GXv_int3[0] ;
         GXt_int4 = AV92Tinamar ;
         GXv_int3[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( AV118EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int3) ;
         rprdt11.this.GXt_int4 = GXv_int3[0] ;
         AV92Tinamar = GXt_int4 ;
         GXt_char1 = AV23EmprNom ;
         GXv_char2[0] = AV22EmpCod ;
         GXv_char5[0] = GXt_char1 ;
         new app.pemprnom(remoteHandle, context).execute( GXv_char2, GXv_char5) ;
         rprdt11.this.AV22EmpCod = GXv_char2[0] ;
         rprdt11.this.GXt_char1 = GXv_char5[0] ;
         AV23EmprNom = GXt_char1 ;
         AV96Tot_Kgs_Ge = DecimalUtil.doubleToDec(0) ;
         AV97Tot_kgs_Gi = DecimalUtil.doubleToDec(0) ;
         AV103TotKG = DecimalUtil.doubleToDec(0) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV94TipMaqCod ,
                                              A1011TipMaqCod ,
                                              A4440HisProDTI ,
                                              AV35Hisprodti ,
                                              A4441HisProDTF ,
                                              AV34Hisprodtf ,
                                              A212BarSer ,
                                              AV9ArtCodi ,
                                              AV8ArtCodf ,
                                              A135BarColNom ,
                                              AV17Barcolnomi ,
                                              AV16Barcolnomf ,
                                              Integer.valueOf(A136BarColNum) ,
                                              Integer.valueOf(AV19Barcolnumi) ,
                                              Integer.valueOf(AV18Barcolnumf) ,
                                              A396EmprCod ,
                                              AV83PMaqCod ,
                                              A602MaqCod ,
                                              AV116UMaqCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor P07FJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV83PMaqCod, AV35Hisprodti, AV34Hisprodtf, AV35Hisprodti, AV34Hisprodtf, AV9ArtCodi, AV8ArtCodf, AV17Barcolnomi, AV16Barcolnomf, Integer.valueOf(AV19Barcolnumi), Integer.valueOf(AV18Barcolnumf), AV116UMaqCod, AV94TipMaqCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A129BarCod = P07FJ2_A129BarCod[0] ;
            A132BarCodReo = P07FJ2_A132BarCodReo[0] ;
            A130BarCodPar = P07FJ2_A130BarCodPar[0] ;
            A136BarColNum = P07FJ2_A136BarColNum[0] ;
            A135BarColNom = P07FJ2_A135BarColNom[0] ;
            A212BarSer = P07FJ2_A212BarSer[0] ;
            A1011TipMaqCod = P07FJ2_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P07FJ2_n1011TipMaqCod[0] ;
            A4441HisProDTF = P07FJ2_A4441HisProDTF[0] ;
            n4441HisProDTF = P07FJ2_n4441HisProDTF[0] ;
            A4440HisProDTI = P07FJ2_A4440HisProDTI[0] ;
            n4440HisProDTI = P07FJ2_n4440HisProDTI[0] ;
            A602MaqCod = P07FJ2_A602MaqCod[0] ;
            A656ParCod = P07FJ2_A656ParCod[0] ;
            n656ParCod = P07FJ2_n656ParCod[0] ;
            A1525HisProKgr = P07FJ2_A1525HisProKgr[0] ;
            A3612HisProReo = P07FJ2_A3612HisProReo[0] ;
            A558HisProFec = P07FJ2_A558HisProFec[0] ;
            A561HisProLin = P07FJ2_A561HisProLin[0] ;
            A1011TipMaqCod = P07FJ2_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P07FJ2_n1011TipMaqCod[0] ;
            A136BarColNum = P07FJ2_A136BarColNum[0] ;
            A135BarColNom = P07FJ2_A135BarColNom[0] ;
            A212BarSer = P07FJ2_A212BarSer[0] ;
            if ( A656ParCod == 0 )
            {
               AV103TotKG = AV103TotKG.add(A1525HisProKgr) ;
               if ( A3612HisProReo == 2 )
               {
                  AV96Tot_Kgs_Ge = AV96Tot_Kgs_Ge.add(A1525HisProKgr) ;
               }
               if ( A3612HisProReo == 1 )
               {
                  AV97Tot_kgs_Gi = AV97Tot_kgs_Gi.add(A1525HisProKgr) ;
               }
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV100Tot_KGU = AV103TotKG.subtract(AV96Tot_Kgs_Ge).subtract(AV97Tot_kgs_Gi) ;
         AV104TotKgs = DecimalUtil.doubleToDec(0) ;
         AV108TotMinT = 0 ;
         AV73NTin = 0 ;
         AV101Tot_N_Ge = 0 ;
         AV102Tot_N_Gi = 0 ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV94TipMaqCod ,
                                              A1011TipMaqCod ,
                                              A4440HisProDTI ,
                                              AV35Hisprodti ,
                                              A4441HisProDTF ,
                                              AV34Hisprodtf ,
                                              A212BarSer ,
                                              AV9ArtCodi ,
                                              AV8ArtCodf ,
                                              A135BarColNom ,
                                              AV17Barcolnomi ,
                                              AV16Barcolnomf ,
                                              Integer.valueOf(A136BarColNum) ,
                                              Integer.valueOf(AV19Barcolnumi) ,
                                              Integer.valueOf(AV18Barcolnumf) ,
                                              A396EmprCod ,
                                              AV83PMaqCod ,
                                              A602MaqCod ,
                                              AV116UMaqCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor P07FJ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV83PMaqCod, AV35Hisprodti, AV34Hisprodtf, AV35Hisprodti, AV34Hisprodtf, AV9ArtCodi, AV8ArtCodf, AV17Barcolnomi, AV16Barcolnomf, Integer.valueOf(AV19Barcolnumi), Integer.valueOf(AV18Barcolnumf), AV116UMaqCod, AV94TipMaqCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk7FJ4 = false ;
            A602MaqCod = P07FJ3_A602MaqCod[0] ;
            A556HisProEst = P07FJ3_A556HisProEst[0] ;
            A129BarCod = P07FJ3_A129BarCod[0] ;
            A132BarCodReo = P07FJ3_A132BarCodReo[0] ;
            A130BarCodPar = P07FJ3_A130BarCodPar[0] ;
            A1525HisProKgr = P07FJ3_A1525HisProKgr[0] ;
            A3612HisProReo = P07FJ3_A3612HisProReo[0] ;
            A656ParCod = P07FJ3_A656ParCod[0] ;
            n656ParCod = P07FJ3_n656ParCod[0] ;
            A503GruOpeCod = P07FJ3_A503GruOpeCod[0] ;
            A3610HisProLot = P07FJ3_A3610HisProLot[0] ;
            A136BarColNum = P07FJ3_A136BarColNum[0] ;
            A135BarColNom = P07FJ3_A135BarColNom[0] ;
            A212BarSer = P07FJ3_A212BarSer[0] ;
            A1011TipMaqCod = P07FJ3_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P07FJ3_n1011TipMaqCod[0] ;
            A606MaqDsc = P07FJ3_A606MaqDsc[0] ;
            n606MaqDsc = P07FJ3_n606MaqDsc[0] ;
            A563HisProMin = P07FJ3_A563HisProMin[0] ;
            A560HisProHin = P07FJ3_A560HisProHin[0] ;
            A562HisProMfi = P07FJ3_A562HisProMfi[0] ;
            A559HisProHfi = P07FJ3_A559HisProHfi[0] ;
            A4440HisProDTI = P07FJ3_A4440HisProDTI[0] ;
            n4440HisProDTI = P07FJ3_n4440HisProDTI[0] ;
            A4441HisProDTF = P07FJ3_A4441HisProDTF[0] ;
            n4441HisProDTF = P07FJ3_n4441HisProDTF[0] ;
            A558HisProFec = P07FJ3_A558HisProFec[0] ;
            A561HisProLin = P07FJ3_A561HisProLin[0] ;
            A1011TipMaqCod = P07FJ3_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P07FJ3_n1011TipMaqCod[0] ;
            A606MaqDsc = P07FJ3_A606MaqDsc[0] ;
            n606MaqDsc = P07FJ3_n606MaqDsc[0] ;
            A136BarColNum = P07FJ3_A136BarColNum[0] ;
            A135BarColNom = P07FJ3_A135BarColNom[0] ;
            A212BarSer = P07FJ3_A212BarSer[0] ;
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
            AV104TotKgs = DecimalUtil.doubleToDec(0) ;
            AV95Tot_kgs_e = DecimalUtil.doubleToDec(0) ;
            AV98Tot_kgs_i = DecimalUtil.doubleToDec(0) ;
            AV108TotMinT = 0 ;
            AV73NTin = 0 ;
            AV111Totmt_i = 0 ;
            AV76Ntin_i = 0 ;
            AV109Totmt_e = 0 ;
            AV74Ntin_e = 0 ;
            AV36HisProLot = "" ;
            AV33GruOpeCod = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P07FJ3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P07FJ3_A602MaqCod[0], A602MaqCod) == 0 ) )
            {
               brk7FJ4 = false ;
               A556HisProEst = P07FJ3_A556HisProEst[0] ;
               A129BarCod = P07FJ3_A129BarCod[0] ;
               A132BarCodReo = P07FJ3_A132BarCodReo[0] ;
               A130BarCodPar = P07FJ3_A130BarCodPar[0] ;
               A1525HisProKgr = P07FJ3_A1525HisProKgr[0] ;
               A3612HisProReo = P07FJ3_A3612HisProReo[0] ;
               A656ParCod = P07FJ3_A656ParCod[0] ;
               n656ParCod = P07FJ3_n656ParCod[0] ;
               A503GruOpeCod = P07FJ3_A503GruOpeCod[0] ;
               A3610HisProLot = P07FJ3_A3610HisProLot[0] ;
               A563HisProMin = P07FJ3_A563HisProMin[0] ;
               A560HisProHin = P07FJ3_A560HisProHin[0] ;
               A562HisProMfi = P07FJ3_A562HisProMfi[0] ;
               A559HisProHfi = P07FJ3_A559HisProHfi[0] ;
               A4440HisProDTI = P07FJ3_A4440HisProDTI[0] ;
               n4440HisProDTI = P07FJ3_n4440HisProDTI[0] ;
               A4441HisProDTF = P07FJ3_A4441HisProDTF[0] ;
               n4441HisProDTF = P07FJ3_n4441HisProDTF[0] ;
               A558HisProFec = P07FJ3_A558HisProFec[0] ;
               A561HisProLin = P07FJ3_A561HisProLin[0] ;
               if ( (( A4440HisProDTI.after( AV35Hisprodti ) ) || ( GXutil.dateCompare(A4440HisProDTI, AV35Hisprodti) )) )
               {
                  if ( (( A4441HisProDTF.before( AV34Hisprodtf ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV34Hisprodtf) )) )
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
                     AV37HisProTre = (short)(0) ;
                     if ( A556HisProEst != 0 )
                     {
                        AV37HisProTre = ((AV29FlagTiReal==0) ? A564HisProTre : A5605HisProTr2) ;
                     }
                     AV10BarCod = A129BarCod ;
                     AV14BarCodReo = A132BarCodReo ;
                     AV12BarCodPar = A130BarCodPar ;
                     AV28FlagMarca = (byte)(0) ;
                     /* Execute user subroutine: 'LEOHDR' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(1);
                        pr_default.close(1);
                        pr_default.close(1);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     AV39HmP = DecimalUtil.doubleToDec(AV37HisProTre/ (double) (60)) ;
                     AV38HmF = DecimalUtil.doubleToDec(AV89TiempoF/ (double) (60)) ;
                     if ( A656ParCod == 0 )
                     {
                        AV104TotKgs = AV104TotKgs.add(A1525HisProKgr) ;
                        if ( A3612HisProReo == 2 )
                        {
                           AV95Tot_kgs_e = AV95Tot_kgs_e.add(A1525HisProKgr) ;
                        }
                        if ( A3612HisProReo == 1 )
                        {
                           AV98Tot_kgs_i = AV98Tot_kgs_i.add(A1525HisProKgr) ;
                        }
                     }
                     if ( GXutil.strcmp(AV36HisProLot, A3610HisProLot) != 0 )
                     {
                        AV73NTin = (int)(AV73NTin+1) ;
                        AV108TotMinT = (int)(AV108TotMinT+AV37HisProTre) ;
                     }
                     if ( ( GXutil.strcmp(AV36HisProLot, A3610HisProLot) == 0 ) && ( AV33GruOpeCod != A503GruOpeCod ) )
                     {
                        AV108TotMinT = (int)(AV108TotMinT+AV37HisProTre) ;
                     }
                     AV36HisProLot = A3610HisProLot ;
                     AV33GruOpeCod = A503GruOpeCod ;
                  }
               }
               brk7FJ4 = true ;
               pr_default.readNext(1);
            }
            AV79PesMedPar = DecimalUtil.doubleToDec(0) ;
            if ( ! (0==AV73NTin) )
            {
               AV79PesMedPar = ((0==AV73NTin) ? DecimalUtil.doubleToDec(0) : AV104TotKgs.divide(DecimalUtil.doubleToDec(AV73NTin), 18, java.math.RoundingMode.DOWN)) ;
            }
            AV42HorRea = (short)(GXutil.Int( AV108TotMinT/ (double) (60))) ;
            AV43HorReaint = (short)(GXutil.Int( AV42HorRea)) ;
            AV70MinRea = (byte)(AV108TotMinT-(AV43HorReaint*60)) ;
            AV71MinRea2 = DecimalUtil.doubleToDec(AV70MinRea/ (double) (100)) ;
            AV39HmP = DecimalUtil.doubleToDec(AV43HorReaint).add(AV71MinRea2) ;
            AV90TiempoNP = DecimalUtil.doubleToDec(0) ;
            if ( ! (0==AV73NTin) )
            {
               AV90TiempoNP = ((0==AV73NTin) ? DecimalUtil.doubleToDec(0) : AV39HmP.divide(DecimalUtil.doubleToDec(AV73NTin), 18, java.math.RoundingMode.DOWN)) ;
            }
            AV84Porc_ = DecimalUtil.doubleToDec(0) ;
            AV84Porc_ = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV103TotKG)==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV104TotKgs.divide(AV103TotKG, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 1)) ;
            AV21Dias = DecimalUtil.doubleToDec(AV108TotMinT/ (double) (1440)) ;
            if ( AV24F_tintutex == 0 )
            {
               h7FJ0( false, 17) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 8, Gx_line+0, 53, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 58, Gx_line+0, 176, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV104TotKgs, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+0, 289, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV108TotMinT), "ZZZZZ9")), 353, Gx_line+0, 398, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39HmP, "ZZZ,ZZ9.99")), 414, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV73NTin), "ZZZZZ9")), 500, Gx_line+0, 545, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90TiempoNP, "Z,ZZ9.99")), 578, Gx_line+0, 637, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+0, 759, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Porc_, "ZZ9.9")), 302, Gx_line+0, 339, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Porc_, "ZZ9.9")), 302, Gx_line+1, 339, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               if ( AV92Tinamar == 1 )
               {
                  GXv_char5[0] = AV118EmprCod ;
                  GXv_char2[0] = A602MaqCod ;
                  GXv_dtime6[0] = AV35Hisprodti ;
                  GXv_dtime7[0] = AV34Hisprodtf ;
                  GXv_int8[0] = AV91TimeBarfas ;
                  new app.ptimebarfas(remoteHandle, context).execute( GXv_char5, GXv_char2, GXv_dtime6, GXv_dtime7, GXv_int8) ;
                  rprdt11.this.AV118EmprCod = GXv_char5[0] ;
                  rprdt11.this.A602MaqCod = GXv_char2[0] ;
                  rprdt11.this.AV35Hisprodti = GXv_dtime6[0] ;
                  rprdt11.this.AV34Hisprodtf = GXv_dtime7[0] ;
                  rprdt11.this.AV91TimeBarfas = (int)((int)(GXv_int8[0])) ;
                  AV42HorRea = (short)(GXutil.Int( AV91TimeBarfas/ (double) (60))) ;
                  AV43HorReaint = (short)(GXutil.Int( AV42HorRea)) ;
                  AV70MinRea = (byte)(AV91TimeBarfas-(AV43HorReaint*60)) ;
                  AV71MinRea2 = DecimalUtil.doubleToDec(AV70MinRea/ (double) (100)) ;
                  AV39HmP = DecimalUtil.doubleToDec(AV43HorReaint).add(AV71MinRea2) ;
                  h7FJ0( false, 17) ;
                  getPrinter().GxAttris("Calibri", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV91TimeBarfas), "ZZZZZ9")), 359, Gx_line+0, 398, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39HmP, "ZZZ,ZZ9.99")), 424, Gx_line+0, 488, Gx_line+15, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
            }
            else
            {
               h7FJ0( false, 17) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 8, Gx_line+0, 53, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 58, Gx_line+0, 176, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV104TotKgs, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+0, 289, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39HmP, "ZZZ,ZZ9.99")), 414, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV73NTin), "ZZZZZ9")), 500, Gx_line+0, 545, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90TiempoNP, "Z,ZZ9.99")), 578, Gx_line+0, 637, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+0, 759, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21Dias, "ZZ9.99")), 353, Gx_line+0, 398, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Porc_, "ZZ9.9")), 302, Gx_line+0, 339, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV79PesMedPar = DecimalUtil.doubleToDec(0) ;
            if ( ! (0==AV76Ntin_i) )
            {
               AV79PesMedPar = ((0==AV76Ntin_i) ? DecimalUtil.doubleToDec(0) : AV98Tot_kgs_i.divide(DecimalUtil.doubleToDec(AV76Ntin_i), 18, java.math.RoundingMode.DOWN)) ;
            }
            AV42HorRea = (short)(GXutil.Int( AV111Totmt_i/ (double) (60))) ;
            AV43HorReaint = (short)(GXutil.Int( AV42HorRea)) ;
            AV70MinRea = (byte)(AV111Totmt_i-(AV43HorReaint*60)) ;
            AV71MinRea2 = DecimalUtil.doubleToDec(AV70MinRea/ (double) (100)) ;
            AV39HmP = DecimalUtil.doubleToDec(AV43HorReaint).add(AV71MinRea2) ;
            AV90TiempoNP = DecimalUtil.doubleToDec(0) ;
            if ( ! (0==AV76Ntin_i) )
            {
               AV90TiempoNP = ((0==AV76Ntin_i) ? DecimalUtil.doubleToDec(0) : AV39HmP.divide(DecimalUtil.doubleToDec(AV76Ntin_i), 18, java.math.RoundingMode.DOWN)) ;
            }
            AV84Porc_ = DecimalUtil.doubleToDec(0) ;
            AV84Porc_ = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV104TotKgs)==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV98Tot_kgs_i.divide(AV104TotKgs, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 1)) ;
            AV21Dias = DecimalUtil.doubleToDec(AV111Totmt_i/ (double) (1440)) ;
            if ( AV24F_tintutex == 0 )
            {
               h7FJ0( false, 17) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV98Tot_kgs_i, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+0, 289, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV111Totmt_i), "ZZZZZ9")), 353, Gx_line+0, 398, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39HmP, "ZZZ,ZZ9.99")), 414, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV76Ntin_i), "ZZZZZ9")), 500, Gx_line+0, 545, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90TiempoNP, "Z,ZZ9.99")), 578, Gx_line+0, 637, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+0, 759, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit16, "")), 27, Gx_line+0, 174, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Porc_, "ZZ9.9")), 302, Gx_line+0, 339, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            else
            {
               h7FJ0( false, 17) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV98Tot_kgs_i, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+0, 289, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39HmP, "ZZZ,ZZ9.99")), 414, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV76Ntin_i), "ZZZZZ9")), 500, Gx_line+0, 545, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90TiempoNP, "Z,ZZ9.99")), 578, Gx_line+0, 637, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+0, 759, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit16, "")), 27, Gx_line+0, 174, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Porc_, "ZZ9.9")), 302, Gx_line+0, 339, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21Dias, "ZZ9.99")), 353, Gx_line+1, 398, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV79PesMedPar = DecimalUtil.doubleToDec(0) ;
            if ( ! (0==AV74Ntin_e) )
            {
               AV79PesMedPar = ((0==AV74Ntin_e) ? DecimalUtil.doubleToDec(0) : AV95Tot_kgs_e.divide(DecimalUtil.doubleToDec(AV74Ntin_e), 18, java.math.RoundingMode.DOWN)) ;
            }
            AV42HorRea = (short)(GXutil.Int( AV109Totmt_e/ (double) (60))) ;
            AV43HorReaint = (short)(GXutil.Int( AV42HorRea)) ;
            AV70MinRea = (byte)(AV109Totmt_e-(AV43HorReaint*60)) ;
            AV71MinRea2 = DecimalUtil.doubleToDec(AV70MinRea/ (double) (100)) ;
            AV39HmP = DecimalUtil.doubleToDec(AV43HorReaint).add(AV71MinRea2) ;
            AV90TiempoNP = DecimalUtil.doubleToDec(0) ;
            if ( ! (0==AV74Ntin_e) )
            {
               AV90TiempoNP = ((0==AV74Ntin_e) ? DecimalUtil.doubleToDec(0) : AV39HmP.divide(DecimalUtil.doubleToDec(AV74Ntin_e), 18, java.math.RoundingMode.DOWN)) ;
            }
            AV84Porc_ = DecimalUtil.doubleToDec(0) ;
            AV84Porc_ = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV104TotKgs)==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV95Tot_kgs_e.divide(AV104TotKgs, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 1)) ;
            AV21Dias = DecimalUtil.doubleToDec(AV109Totmt_e/ (double) (1440)) ;
            if ( AV24F_tintutex == 0 )
            {
               h7FJ0( false, 17) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV95Tot_kgs_e, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+0, 289, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV109Totmt_e), "ZZZZZ9")), 353, Gx_line+0, 398, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39HmP, "ZZZ,ZZ9.99")), 414, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV74Ntin_e), "ZZZZZ9")), 500, Gx_line+0, 545, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90TiempoNP, "Z,ZZ9.99")), 578, Gx_line+0, 637, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+0, 759, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit17, "")), 27, Gx_line+0, 174, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Porc_, "ZZ9.9")), 302, Gx_line+0, 339, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            else
            {
               h7FJ0( false, 17) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV95Tot_kgs_e, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+0, 289, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39HmP, "ZZZ,ZZ9.99")), 414, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV74Ntin_e), "ZZZZZ9")), 500, Gx_line+0, 545, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90TiempoNP, "Z,ZZ9.99")), 578, Gx_line+0, 637, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+0, 759, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit17, "")), 27, Gx_line+0, 174, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Porc_, "ZZ9.9")), 302, Gx_line+0, 339, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21Dias, "ZZ9.99")), 353, Gx_line+1, 398, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV99Tot_kgs_u = AV104TotKgs.subtract(AV95Tot_kgs_e).subtract(AV98Tot_kgs_i) ;
            AV77NTin_u = (int)(AV73NTin-AV76Ntin_i-AV74Ntin_e) ;
            AV112Totmt_u = (int)(AV108TotMinT-AV111Totmt_i-AV109Totmt_e) ;
            AV79PesMedPar = DecimalUtil.doubleToDec(0) ;
            if ( ! (0==AV77NTin_u) )
            {
               AV79PesMedPar = ((0==AV77NTin_u) ? DecimalUtil.doubleToDec(0) : AV99Tot_kgs_u.divide(DecimalUtil.doubleToDec(AV77NTin_u), 18, java.math.RoundingMode.DOWN)) ;
            }
            AV42HorRea = (short)(GXutil.Int( AV112Totmt_u/ (double) (60))) ;
            AV43HorReaint = (short)(GXutil.Int( AV42HorRea)) ;
            AV70MinRea = (byte)(AV112Totmt_u-(AV43HorReaint*60)) ;
            AV71MinRea2 = DecimalUtil.doubleToDec(AV70MinRea/ (double) (100)) ;
            AV39HmP = DecimalUtil.doubleToDec(AV43HorReaint).add(AV71MinRea2) ;
            AV90TiempoNP = DecimalUtil.doubleToDec(0) ;
            if ( ! (0==AV77NTin_u) )
            {
               AV90TiempoNP = ((0==AV77NTin_u) ? DecimalUtil.doubleToDec(0) : AV39HmP.divide(DecimalUtil.doubleToDec(AV77NTin_u), 18, java.math.RoundingMode.DOWN)) ;
            }
            AV84Porc_ = DecimalUtil.doubleToDec(0) ;
            AV84Porc_ = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV104TotKgs)==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV99Tot_kgs_u.divide(AV104TotKgs, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 1)) ;
            AV21Dias = DecimalUtil.doubleToDec(AV112Totmt_u/ (double) (1440)) ;
            if ( AV24F_tintutex == 0 )
            {
               h7FJ0( false, 19) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit21, "")), 27, Gx_line+0, 174, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV99Tot_kgs_u, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+0, 289, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV112Totmt_u), "ZZZZZ9")), 353, Gx_line+0, 398, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39HmP, "ZZZ,ZZ9.99")), 414, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV77NTin_u), "ZZZZZ9")), 500, Gx_line+0, 545, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90TiempoNP, "Z,ZZ9.99")), 578, Gx_line+0, 637, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+0, 759, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+16, 789, Gx_line+16, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Porc_, "ZZ9.9")), 302, Gx_line+0, 339, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
            }
            else
            {
               h7FJ0( false, 20) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 128, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit21, "")), 27, Gx_line+0, 174, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 128, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV99Tot_kgs_u, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+0, 289, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21Dias, "ZZ9.99")), 353, Gx_line+0, 398, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39HmP, "ZZZ,ZZ9.99")), 414, Gx_line+0, 488, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV77NTin_u), "ZZZZZ9")), 500, Gx_line+0, 545, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90TiempoNP, "Z,ZZ9.99")), 578, Gx_line+0, 637, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+0, 759, Gx_line+15, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+16, 789, Gx_line+16, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 128, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Porc_, "ZZ9.9")), 302, Gx_line+0, 339, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
            }
            AV107TotMinG = (int)(AV107TotMinG+AV108TotMinT) ;
            AV113TotNTinG = (int)(AV113TotNTinG+AV73NTin) ;
            AV106Totm_Gi = (int)(AV106Totm_Gi+AV111Totmt_i) ;
            AV105Totm_Ge = (int)(AV105Totm_Ge+AV109Totmt_e) ;
            AV102Tot_N_Gi = (int)(AV102Tot_N_Gi+AV76Ntin_i) ;
            AV101Tot_N_Ge = (int)(AV101Tot_N_Ge+AV74Ntin_e) ;
            if ( ! brk7FJ4 )
            {
               brk7FJ4 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         AV79PesMedPar = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV113TotNTinG) )
         {
            AV79PesMedPar = ((0==AV113TotNTinG) ? DecimalUtil.doubleToDec(0) : AV103TotKG.divide(DecimalUtil.doubleToDec(AV113TotNTinG), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV42HorRea = (short)(GXutil.Int( AV107TotMinG/ (double) (60))) ;
         AV43HorReaint = (short)(GXutil.Int( AV42HorRea)) ;
         AV70MinRea = (byte)(AV107TotMinG-(AV43HorReaint*60)) ;
         AV71MinRea2 = DecimalUtil.doubleToDec(AV70MinRea/ (double) (100)) ;
         AV39HmP = DecimalUtil.doubleToDec(AV43HorReaint).add(AV71MinRea2) ;
         AV90TiempoNP = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV113TotNTinG) )
         {
            AV90TiempoNP = ((0==AV113TotNTinG) ? DecimalUtil.doubleToDec(0) : AV39HmP.divide(DecimalUtil.doubleToDec(AV113TotNTinG), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV21Dias = DecimalUtil.doubleToDec(AV107TotMinG/ (double) (1440)) ;
         if ( AV24F_tintutex == 0 )
         {
            h7FJ0( false, 45) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV103TotKG, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+17, 289, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV107TotMinG), "ZZZZZZZ9")), 353, Gx_line+17, 397, Gx_line+34, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39HmP, "ZZZ,ZZ9.99")), 414, Gx_line+17, 488, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV113TotNTinG), "ZZZZZ9")), 500, Gx_line+17, 545, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90TiempoNP, "Z,ZZ9.99")), 578, Gx_line+17, 637, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+18, 759, Gx_line+33, 2, 0, 0, 0) ;
            getPrinter().GxDrawRect(44, Gx_line+13, 789, Gx_line+41, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+41, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+45) ;
         }
         else
         {
            h7FJ0( false, 44) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV103TotKG, "ZZ,ZZZ,ZZ9.99")), 193, Gx_line+17, 289, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21Dias, "ZZ9.99")), 353, Gx_line+17, 398, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39HmP, "ZZZ,ZZ9.99")), 416, Gx_line+17, 490, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV113TotNTinG), "ZZZZZ9")), 500, Gx_line+17, 545, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90TiempoNP, "Z,ZZ9.99")), 578, Gx_line+17, 637, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+18, 759, Gx_line+33, 2, 0, 0, 0) ;
            getPrinter().GxDrawRect(44, Gx_line+13, 789, Gx_line+41, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1, Gx_line+0, 1, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(788, Gx_line+0, 788, Gx_line+17, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+41, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+44) ;
         }
         AV79PesMedPar = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV102Tot_N_Gi) )
         {
            AV79PesMedPar = ((0==AV102Tot_N_Gi) ? DecimalUtil.doubleToDec(0) : AV97Tot_kgs_Gi.divide(DecimalUtil.doubleToDec(AV102Tot_N_Gi), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV42HorRea = (short)(GXutil.Int( AV106Totm_Gi/ (double) (60))) ;
         AV43HorReaint = (short)(GXutil.Int( AV42HorRea)) ;
         AV70MinRea = (byte)(AV106Totm_Gi-(AV43HorReaint*60)) ;
         AV71MinRea2 = DecimalUtil.doubleToDec(AV70MinRea/ (double) (100)) ;
         AV39HmP = DecimalUtil.doubleToDec(AV43HorReaint).add(AV71MinRea2) ;
         AV90TiempoNP = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV102Tot_N_Gi) )
         {
            AV90TiempoNP = ((0==AV102Tot_N_Gi) ? DecimalUtil.doubleToDec(0) : AV39HmP.divide(DecimalUtil.doubleToDec(AV102Tot_N_Gi), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV21Dias = DecimalUtil.doubleToDec(AV106Totm_Gi/ (double) (1440)) ;
         AV84Porc_ = DecimalUtil.doubleToDec(0) ;
         AV84Porc_ = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV103TotKG)==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV97Tot_kgs_Gi.divide(AV103TotKG, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 1)) ;
         if ( AV24F_tintutex == 0 )
         {
            h7FJ0( false, 27) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV97Tot_kgs_Gi, "ZZ,ZZZ,ZZ9.99")), 192, Gx_line+6, 288, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(1, Gx_line+0, 789, Gx_line+28, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(295, Gx_line+0, 295, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+7, 759, Gx_line+22, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90TiempoNP, "Z,ZZ9.99")), 578, Gx_line+6, 637, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV102Tot_N_Gi), "ZZZZZ9")), 500, Gx_line+6, 545, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39HmP, "ZZZ,ZZ9.99")), 416, Gx_line+6, 490, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV106Totm_Gi), "ZZZZZZZ9")), 353, Gx_line+6, 397, Gx_line+23, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit18, "")), 26, Gx_line+6, 173, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Porc_, "ZZ9.9")), 302, Gx_line+6, 339, Gx_line+24, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
         }
         else
         {
            h7FJ0( false, 27) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV97Tot_kgs_Gi, "ZZ,ZZZ,ZZ9.99")), 192, Gx_line+6, 288, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(1, Gx_line+0, 789, Gx_line+28, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(297, Gx_line+0, 297, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+7, 759, Gx_line+22, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90TiempoNP, "Z,ZZ9.99")), 578, Gx_line+6, 637, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV102Tot_N_Gi), "ZZZZZ9")), 500, Gx_line+6, 545, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39HmP, "ZZZ,ZZ9.99")), 416, Gx_line+6, 490, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21Dias, "ZZ9.99")), 353, Gx_line+6, 398, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit18, "")), 26, Gx_line+6, 173, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Porc_, "ZZ9.9")), 302, Gx_line+6, 339, Gx_line+24, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+27, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
         }
         AV79PesMedPar = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV101Tot_N_Ge) )
         {
            AV79PesMedPar = ((0==AV101Tot_N_Ge) ? DecimalUtil.doubleToDec(0) : AV96Tot_Kgs_Ge.divide(DecimalUtil.doubleToDec(AV101Tot_N_Ge), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV42HorRea = (short)(GXutil.Int( AV105Totm_Ge/ (double) (60))) ;
         AV43HorReaint = (short)(GXutil.Int( AV42HorRea)) ;
         AV70MinRea = (byte)(AV105Totm_Ge-(AV43HorReaint*60)) ;
         AV71MinRea2 = DecimalUtil.doubleToDec(AV70MinRea/ (double) (100)) ;
         AV39HmP = DecimalUtil.doubleToDec(AV43HorReaint).add(AV71MinRea2) ;
         AV90TiempoNP = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV101Tot_N_Ge) )
         {
            AV90TiempoNP = ((0==AV101Tot_N_Ge) ? DecimalUtil.doubleToDec(0) : AV39HmP.divide(DecimalUtil.doubleToDec(AV101Tot_N_Ge), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV21Dias = DecimalUtil.doubleToDec(AV105Totm_Ge/ (double) (1440)) ;
         AV84Porc_ = DecimalUtil.doubleToDec(0) ;
         AV84Porc_ = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV103TotKG)==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV96Tot_Kgs_Ge.divide(AV103TotKG, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 1)) ;
         if ( AV24F_tintutex == 0 )
         {
            h7FJ0( false, 27) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV96Tot_Kgs_Ge, "ZZ,ZZZ,ZZ9.99")), 192, Gx_line+5, 288, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(1, Gx_line+0, 789, Gx_line+27, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+6, 759, Gx_line+21, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90TiempoNP, "Z,ZZ9.99")), 578, Gx_line+5, 637, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV101Tot_N_Ge), "ZZZZZ9")), 500, Gx_line+5, 545, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39HmP, "ZZZ,ZZ9.99")), 416, Gx_line+5, 490, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV105Totm_Ge), "ZZZZZ9")), 353, Gx_line+5, 398, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit19, "")), 26, Gx_line+5, 173, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(297, Gx_line+0, 297, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Porc_, "ZZ9.9")), 302, Gx_line+5, 339, Gx_line+23, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
         }
         else
         {
            h7FJ0( false, 27) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV96Tot_Kgs_Ge, "ZZ,ZZZ,ZZ9.99")), 192, Gx_line+5, 288, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(1, Gx_line+0, 789, Gx_line+27, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+6, 759, Gx_line+21, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90TiempoNP, "Z,ZZ9.99")), 578, Gx_line+5, 637, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV101Tot_N_Ge), "ZZZZZ9")), 500, Gx_line+5, 545, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39HmP, "ZZZ,ZZ9.99")), 416, Gx_line+5, 490, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21Dias, "ZZ9.99")), 353, Gx_line+5, 398, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit19, "")), 26, Gx_line+5, 173, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(297, Gx_line+0, 297, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Porc_, "ZZ9.9")), 302, Gx_line+5, 339, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+27, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
         }
         AV75Ntin_Gu = (int)(AV113TotNTinG-AV102Tot_N_Gi-AV101Tot_N_Ge) ;
         AV110Totmt_Gu = (int)(AV107TotMinG-AV105Totm_Ge-AV106Totm_Gi) ;
         AV79PesMedPar = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV75Ntin_Gu) )
         {
            AV79PesMedPar = ((0==AV75Ntin_Gu) ? DecimalUtil.doubleToDec(0) : AV100Tot_KGU.divide(DecimalUtil.doubleToDec(AV75Ntin_Gu), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV42HorRea = (short)(GXutil.Int( AV110Totmt_Gu/ (double) (60))) ;
         AV43HorReaint = (short)(GXutil.Int( AV42HorRea)) ;
         AV70MinRea = (byte)(AV110Totmt_Gu-(AV43HorReaint*60)) ;
         AV71MinRea2 = DecimalUtil.doubleToDec(AV70MinRea/ (double) (100)) ;
         AV39HmP = DecimalUtil.doubleToDec(AV43HorReaint).add(AV71MinRea2) ;
         AV90TiempoNP = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV75Ntin_Gu) )
         {
            AV90TiempoNP = ((0==AV75Ntin_Gu) ? DecimalUtil.doubleToDec(0) : AV39HmP.divide(DecimalUtil.doubleToDec(AV75Ntin_Gu), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV21Dias = DecimalUtil.doubleToDec(AV110Totmt_Gu/ (double) (1440)) ;
         AV84Porc_ = DecimalUtil.doubleToDec(0) ;
         AV84Porc_ = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV103TotKG)==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( (AV100Tot_KGU.divide(AV103TotKG, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 1)) ;
         if ( AV24F_tintutex == 0 )
         {
            h7FJ0( false, 27) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV100Tot_KGU, "ZZ,ZZZ,ZZ9.99")), 191, Gx_line+5, 287, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(1, Gx_line+0, 789, Gx_line+27, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+6, 759, Gx_line+21, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90TiempoNP, "Z,ZZ9.99")), 578, Gx_line+5, 637, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV75Ntin_Gu), "ZZZZZ9")), 500, Gx_line+5, 545, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39HmP, "ZZZ,ZZ9.99")), 416, Gx_line+5, 490, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV110Totmt_Gu), "ZZZZZ9")), 353, Gx_line+5, 398, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Lit20, "")), 25, Gx_line+5, 172, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(297, Gx_line+0, 297, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Porc_, "ZZ9.9")), 302, Gx_line+5, 339, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+27, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
         }
         else
         {
            h7FJ0( false, 27) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 128, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV100Tot_KGU, "ZZ,ZZZ,ZZ9.99")), 191, Gx_line+5, 287, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(1, Gx_line+0, 789, Gx_line+27, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79PesMedPar, "ZZZ,ZZ9.99")), 686, Gx_line+6, 759, Gx_line+21, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV90TiempoNP, "Z,ZZ9.99")), 578, Gx_line+5, 637, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV75Ntin_Gu), "ZZZZZ9")), 500, Gx_line+5, 545, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39HmP, "ZZZ,ZZ9.99")), 416, Gx_line+5, 490, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21Dias, "ZZ9.99")), 353, Gx_line+5, 398, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Lit20, "")), 25, Gx_line+5, 172, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(183, Gx_line+0, 183, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(297, Gx_line+0, 297, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+0, 491, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(668, Gx_line+0, 668, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Porc_, "ZZ9.9")), 302, Gx_line+5, 339, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+0, 345, Gx_line+27, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
         }
         if ( AV88Texknit == 1 )
         {
            h7FJ0( false, 150) ;
            getPrinter().GxDrawLine(7, Gx_line+56, 263, Gx_line+56, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 31, Gx_line+41, 68, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 218, Gx_line+41, 255, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44KgCol[1-1], "ZZZZZZ,ZZ9.99")), 157, Gx_line+63, 253, Gx_line+80, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44KgCol[2-1], "ZZZZZZ,ZZ9.99")), 158, Gx_line+88, 254, Gx_line+105, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44KgCol[3-1], "ZZZZZZ,ZZ9.99")), 158, Gx_line+114, 254, Gx_line+131, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Blancos", ""), 31, Gx_line+64, 83, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descrudados", ""), 31, Gx_line+89, 112, Gx_line+104, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 31, Gx_line+115, 68, Gx_line+130, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(7, Gx_line+36, 264, Gx_line+145, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+150) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7FJ0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'LEOHDR' Routine */
      returnInSub = false ;
      AV20CliCod = 999999 ;
      AV32ForSer = "XXXXXXXXXXXXXXXX" ;
      AV30ForColNom = "XXXXXXXXXXXXX" ;
      AV31ForColNum = 999999 ;
      AV93TipColCod = (byte)(99) ;
      AV26FlagBarcad = (byte)(0) ;
      AV27FlagBH = "X" ;
      /* Using cursor P07FJ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV14BarCodReo), AV12BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = P07FJ4_A130BarCodPar[0] ;
         A132BarCodReo = P07FJ4_A132BarCodReo[0] ;
         A129BarCod = P07FJ4_A129BarCod[0] ;
         A252CliCod = P07FJ4_A252CliCod[0] ;
         n252CliCod = P07FJ4_n252CliCod[0] ;
         A212BarSer = P07FJ4_A212BarSer[0] ;
         A135BarColNom = P07FJ4_A135BarColNom[0] ;
         A136BarColNum = P07FJ4_A136BarColNum[0] ;
         A218BarTipCol = P07FJ4_A218BarTipCol[0] ;
         AV26FlagBarcad = (byte)(1) ;
         AV27FlagBH = httpContext.getMessage( "B", "") ;
         AV20CliCod = A252CliCod ;
         AV32ForSer = A212BarSer ;
         AV30ForColNom = A135BarColNom ;
         AV31ForColNum = A136BarColNum ;
         AV93TipColCod = A218BarTipCol ;
         /* Execute user subroutine: 'LEOFORMU' */
         S126 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV26FlagBarcad == 0 )
      {
         /* Using cursor P07FJ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV14BarCodReo), AV12BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A507HbaBarPar = P07FJ5_A507HbaBarPar[0] ;
            A508HbaBarReo = P07FJ5_A508HbaBarReo[0] ;
            A506HbaBarCod = P07FJ5_A506HbaBarCod[0] ;
            A252CliCod = P07FJ5_A252CliCod[0] ;
            n252CliCod = P07FJ5_n252CliCod[0] ;
            A535HbaSer = P07FJ5_A535HbaSer[0] ;
            n535HbaSer = P07FJ5_n535HbaSer[0] ;
            A509HbaColNom = P07FJ5_A509HbaColNom[0] ;
            n509HbaColNom = P07FJ5_n509HbaColNom[0] ;
            A510HbaColNum = P07FJ5_A510HbaColNum[0] ;
            n510HbaColNum = P07FJ5_n510HbaColNum[0] ;
            A537HbaTipCol = P07FJ5_A537HbaTipCol[0] ;
            n537HbaTipCol = P07FJ5_n537HbaTipCol[0] ;
            AV27FlagBH = httpContext.getMessage( "H", "") ;
            AV20CliCod = A252CliCod ;
            AV32ForSer = A535HbaSer ;
            AV30ForColNom = A509HbaColNom ;
            AV31ForColNum = A510HbaColNum ;
            AV93TipColCod = A537HbaTipCol ;
            /* Execute user subroutine: 'LEOFORMU' */
            S126 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   public void S126( ) throws ProcessInterruptedException
   {
      /* 'LEOFORMU' Routine */
      returnInSub = false ;
      AV89TiempoF = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P07FJ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV20CliCod), AV32ForSer, AV30ForColNom, Integer.valueOf(AV31ForColNum), Byte.valueOf(AV93TipColCod)});
      c771ProForTie = P07FJ6_A771ProForTie[0] ;
      pr_default.close(4);
      AV89TiempoF = (short)(AV89TiempoF+c771ProForTie) ;
      /* End optimized group. */
   }

   public void h7FJ0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            if ( AV24F_tintutex == 0 )
            {
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Minutos", ""), 349, Gx_line+131, 401, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Horas", ""), 431, Gx_line+131, 468, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23EmprNom, "")), 9, Gx_line+15, 260, Gx_line+36, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 485, Gx_line+15, 536, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 593, Gx_line+15, 686, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 607, Gx_line+48, 652, Gx_line+65, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV35Hisprodti, "99/99/99 99:99:99"), 55, Gx_line+82, 180, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV34Hisprodtf, "99/99/99 99:99:99"), 278, Gx_line+81, 403, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+7, 789, Gx_line+7, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+73, 789, Gx_line+73, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit0, "")), 9, Gx_line+48, 333, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit1, "")), 442, Gx_line+15, 472, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Lit2, "")), 556, Gx_line+15, 586, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit3, "")), 552, Gx_line+49, 597, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit4, "")), 13, Gx_line+82, 50, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit5, "")), 235, Gx_line+81, 272, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit6, "")), 8, Gx_line+131, 60, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Lit7, "")), 242, Gx_line+131, 287, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Lit8, "")), 353, Gx_line+115, 398, Gx_line+131, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Lit9, "")), 421, Gx_line+115, 480, Gx_line+131, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit10, "")), 493, Gx_line+131, 552, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit11, "")), 572, Gx_line+115, 617, Gx_line+131, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Medio", ""), 621, Gx_line+115, 658, Gx_line+130, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit12, "")), 572, Gx_line+131, 631, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit13, "")), 682, Gx_line+115, 712, Gx_line+131, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit14, "")), 682, Gx_line+131, 719, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit15, "")), 722, Gx_line+131, 781, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(1, Gx_line+110, 789, Gx_line+151, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+149, 1, Gx_line+155, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+149, 788, Gx_line+155, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+111, 491, Gx_line+155, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+110, 183, Gx_line+155, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+110, 555, Gx_line+155, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+110, 668, Gx_line+155, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+133, 409, Gx_line+155, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("%", 317, Gx_line+131, 325, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(296, Gx_line+110, 296, Gx_line+155, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+110, 345, Gx_line+155, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+155) ;
            }
            else
            {
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Dias", ""), 360, Gx_line+129, 390, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Horas", ""), 431, Gx_line+129, 468, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23EmprNom, "")), 9, Gx_line+13, 260, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 485, Gx_line+13, 536, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 593, Gx_line+13, 686, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 607, Gx_line+46, 652, Gx_line+63, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV35Hisprodti, "99/99/99 99:99:99"), 55, Gx_line+80, 180, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( AV34Hisprodtf, "99/99/99 99:99:99"), 274, Gx_line+80, 399, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+5, 789, Gx_line+5, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+71, 789, Gx_line+71, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit0, "")), 9, Gx_line+46, 333, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit1, "")), 442, Gx_line+13, 472, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Lit2, "")), 556, Gx_line+13, 586, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit3, "")), 552, Gx_line+47, 597, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit4, "")), 13, Gx_line+80, 50, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit5, "")), 231, Gx_line+80, 268, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit6, "")), 8, Gx_line+129, 60, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Lit7, "")), 242, Gx_line+129, 287, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Lit9, "")), 421, Gx_line+113, 480, Gx_line+129, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit10, "")), 493, Gx_line+129, 552, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit11, "")), 572, Gx_line+113, 617, Gx_line+129, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Medio", ""), 621, Gx_line+113, 658, Gx_line+128, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit12, "")), 572, Gx_line+129, 631, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit13, "")), 682, Gx_line+113, 712, Gx_line+129, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit14, "")), 682, Gx_line+129, 719, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit15, "")), 722, Gx_line+129, 781, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(1, Gx_line+108, 789, Gx_line+149, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1, Gx_line+147, 1, Gx_line+153, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(788, Gx_line+147, 788, Gx_line+153, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(491, Gx_line+109, 491, Gx_line+153, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(183, Gx_line+108, 183, Gx_line+153, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(555, Gx_line+108, 555, Gx_line+153, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(668, Gx_line+108, 668, Gx_line+153, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+131, 409, Gx_line+153, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("%", 317, Gx_line+129, 325, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(295, Gx_line+108, 295, Gx_line+153, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(345, Gx_line+108, 345, Gx_line+153, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+153) ;
            }
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
      add_metrics3( ) ;
      add_metrics4( ) ;
      add_metrics5( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, true, 58, 14, 72, 123,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 30, 35, 35, 55, 45, 14, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 21, 21, 37, 37, 37, 38, 61, 45, 45, 45, 45, 42, 38, 49, 45, 17, 35, 45, 38, 52, 45, 49, 42, 49, 45, 42, 38, 45, 42, 59, 42, 42, 38, 21, 18, 23, 37, 35, 21, 35, 38, 35, 38, 35, 21, 38, 38, 18, 18, 35, 18, 56, 38, 38, 38, 38, 25, 35, 21, 38, 35, 49, 35, 35, 32, 25, 17, 25, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 36, 35, 35, 35, 17, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 21, 21, 36, 35, 21, 21, 21, 23, 35, 53, 53, 53, 38, 45, 45, 45, 45, 45, 45, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 35, 35, 35, 35, 35, 18, 18, 18, 18, 38, 38, 38, 38, 38, 38, 38, 35, 38, 38, 38, 38, 38, 35, 38, 35}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Calibri", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics5( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected void cleanup( )
   {
      this.aP1[0] = rprdt11.this.AV83PMaqCod;
      this.aP2[0] = rprdt11.this.AV116UMaqCod;
      this.aP3[0] = rprdt11.this.AV35Hisprodti;
      this.aP4[0] = rprdt11.this.AV34Hisprodtf;
      this.aP5[0] = rprdt11.this.AV94TipMaqCod;
      this.aP6[0] = rprdt11.this.AV9ArtCodi;
      this.aP7[0] = rprdt11.this.AV8ArtCodf;
      this.aP8[0] = rprdt11.this.AV17Barcolnomi;
      this.aP9[0] = rprdt11.this.AV16Barcolnomf;
      this.aP10[0] = rprdt11.this.AV19Barcolnumi;
      this.aP11[0] = rprdt11.this.AV18Barcolnumf;
      this.aP12[0] = rprdt11.this.AV25Filename;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV121Pgmdesc = "" ;
      AV22EmpCod = "" ;
      AV46Lit01 = "" ;
      AV47Lit02 = "" ;
      AV45Lit0 = "" ;
      AV122Pgmname = "" ;
      AV48Lit1 = "" ;
      AV59Lit2 = "" ;
      AV62Lit3 = "" ;
      AV63Lit4 = "" ;
      AV64Lit5 = "" ;
      AV65Lit6 = "" ;
      AV66Lit7 = "" ;
      AV67Lit8 = "" ;
      AV68Lit9 = "" ;
      AV49Lit10 = "" ;
      AV50Lit11 = "" ;
      AV51Lit12 = "" ;
      AV52Lit13 = "" ;
      AV53Lit14 = "" ;
      AV54Lit15 = "" ;
      AV55Lit16 = "" ;
      AV56Lit17 = "" ;
      AV57Lit18 = "" ;
      AV58Lit19 = "" ;
      AV60Lit20 = "" ;
      AV61Lit21 = "" ;
      AV118EmprCod = "" ;
      GXv_int3 = new byte[1] ;
      AV23EmprNom = "" ;
      GXt_char1 = "" ;
      AV96Tot_Kgs_Ge = DecimalUtil.ZERO ;
      AV97Tot_kgs_Gi = DecimalUtil.ZERO ;
      AV103TotKG = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      A1011TipMaqCod = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A602MaqCod = "" ;
      P07FJ2_A129BarCod = new int[1] ;
      P07FJ2_A132BarCodReo = new byte[1] ;
      P07FJ2_A130BarCodPar = new String[] {""} ;
      P07FJ2_A396EmprCod = new String[] {""} ;
      P07FJ2_A136BarColNum = new int[1] ;
      P07FJ2_A135BarColNom = new String[] {""} ;
      P07FJ2_A212BarSer = new String[] {""} ;
      P07FJ2_A1011TipMaqCod = new String[] {""} ;
      P07FJ2_n1011TipMaqCod = new boolean[] {false} ;
      P07FJ2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P07FJ2_n4441HisProDTF = new boolean[] {false} ;
      P07FJ2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P07FJ2_n4440HisProDTI = new boolean[] {false} ;
      P07FJ2_A602MaqCod = new String[] {""} ;
      P07FJ2_A656ParCod = new short[1] ;
      P07FJ2_n656ParCod = new boolean[] {false} ;
      P07FJ2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07FJ2_A3612HisProReo = new byte[1] ;
      P07FJ2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07FJ2_A561HisProLin = new int[1] ;
      A130BarCodPar = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A558HisProFec = GXutil.nullDate() ;
      AV100Tot_KGU = DecimalUtil.ZERO ;
      AV104TotKgs = DecimalUtil.ZERO ;
      P07FJ3_A396EmprCod = new String[] {""} ;
      P07FJ3_A602MaqCod = new String[] {""} ;
      P07FJ3_A556HisProEst = new byte[1] ;
      P07FJ3_A129BarCod = new int[1] ;
      P07FJ3_A132BarCodReo = new byte[1] ;
      P07FJ3_A130BarCodPar = new String[] {""} ;
      P07FJ3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07FJ3_A3612HisProReo = new byte[1] ;
      P07FJ3_A656ParCod = new short[1] ;
      P07FJ3_n656ParCod = new boolean[] {false} ;
      P07FJ3_A503GruOpeCod = new int[1] ;
      P07FJ3_A3610HisProLot = new String[] {""} ;
      P07FJ3_A136BarColNum = new int[1] ;
      P07FJ3_A135BarColNom = new String[] {""} ;
      P07FJ3_A212BarSer = new String[] {""} ;
      P07FJ3_A1011TipMaqCod = new String[] {""} ;
      P07FJ3_n1011TipMaqCod = new boolean[] {false} ;
      P07FJ3_A606MaqDsc = new String[] {""} ;
      P07FJ3_n606MaqDsc = new boolean[] {false} ;
      P07FJ3_A563HisProMin = new byte[1] ;
      P07FJ3_A560HisProHin = new byte[1] ;
      P07FJ3_A562HisProMfi = new byte[1] ;
      P07FJ3_A559HisProHfi = new byte[1] ;
      P07FJ3_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P07FJ3_n4440HisProDTI = new boolean[] {false} ;
      P07FJ3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P07FJ3_n4441HisProDTF = new boolean[] {false} ;
      P07FJ3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07FJ3_A561HisProLin = new int[1] ;
      A3610HisProLot = "" ;
      A606MaqDsc = "" ;
      AV95Tot_kgs_e = DecimalUtil.ZERO ;
      AV98Tot_kgs_i = DecimalUtil.ZERO ;
      AV36HisProLot = "" ;
      AV12BarCodPar = "" ;
      AV39HmP = DecimalUtil.ZERO ;
      AV38HmF = DecimalUtil.ZERO ;
      AV79PesMedPar = DecimalUtil.ZERO ;
      AV71MinRea2 = DecimalUtil.ZERO ;
      AV90TiempoNP = DecimalUtil.ZERO ;
      AV84Porc_ = DecimalUtil.ZERO ;
      AV21Dias = DecimalUtil.ZERO ;
      GXv_char5 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_dtime6 = new java.util.Date[1] ;
      GXv_dtime7 = new java.util.Date[1] ;
      GXv_int8 = new long[1] ;
      AV99Tot_kgs_u = DecimalUtil.ZERO ;
      AV44KgCol = new java.math.BigDecimal[3] ;
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV44KgCol[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV32ForSer = "" ;
      AV30ForColNom = "" ;
      AV27FlagBH = "" ;
      P07FJ4_A396EmprCod = new String[] {""} ;
      P07FJ4_A130BarCodPar = new String[] {""} ;
      P07FJ4_A132BarCodReo = new byte[1] ;
      P07FJ4_A129BarCod = new int[1] ;
      P07FJ4_A252CliCod = new int[1] ;
      P07FJ4_n252CliCod = new boolean[] {false} ;
      P07FJ4_A212BarSer = new String[] {""} ;
      P07FJ4_A135BarColNom = new String[] {""} ;
      P07FJ4_A136BarColNum = new int[1] ;
      P07FJ4_A218BarTipCol = new byte[1] ;
      P07FJ5_A396EmprCod = new String[] {""} ;
      P07FJ5_A507HbaBarPar = new String[] {""} ;
      P07FJ5_A508HbaBarReo = new byte[1] ;
      P07FJ5_A506HbaBarCod = new int[1] ;
      P07FJ5_A252CliCod = new int[1] ;
      P07FJ5_n252CliCod = new boolean[] {false} ;
      P07FJ5_A535HbaSer = new String[] {""} ;
      P07FJ5_n535HbaSer = new boolean[] {false} ;
      P07FJ5_A509HbaColNom = new String[] {""} ;
      P07FJ5_n509HbaColNom = new boolean[] {false} ;
      P07FJ5_A510HbaColNum = new int[1] ;
      P07FJ5_n510HbaColNum = new boolean[] {false} ;
      P07FJ5_A537HbaTipCol = new byte[1] ;
      P07FJ5_n537HbaTipCol = new boolean[] {false} ;
      A507HbaBarPar = "" ;
      A535HbaSer = "" ;
      A509HbaColNom = "" ;
      P07FJ6_A771ProForTie = new short[1] ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rprdt11__default(),
         new Object[] {
             new Object[] {
            P07FJ2_A129BarCod, P07FJ2_A132BarCodReo, P07FJ2_A130BarCodPar, P07FJ2_A396EmprCod, P07FJ2_A136BarColNum, P07FJ2_A135BarColNom, P07FJ2_A212BarSer, P07FJ2_A1011TipMaqCod, P07FJ2_n1011TipMaqCod, P07FJ2_A4441HisProDTF,
            P07FJ2_n4441HisProDTF, P07FJ2_A4440HisProDTI, P07FJ2_n4440HisProDTI, P07FJ2_A602MaqCod, P07FJ2_A656ParCod, P07FJ2_n656ParCod, P07FJ2_A1525HisProKgr, P07FJ2_A3612HisProReo, P07FJ2_A558HisProFec, P07FJ2_A561HisProLin
            }
            , new Object[] {
            P07FJ3_A396EmprCod, P07FJ3_A602MaqCod, P07FJ3_A556HisProEst, P07FJ3_A129BarCod, P07FJ3_A132BarCodReo, P07FJ3_A130BarCodPar, P07FJ3_A1525HisProKgr, P07FJ3_A3612HisProReo, P07FJ3_A656ParCod, P07FJ3_n656ParCod,
            P07FJ3_A503GruOpeCod, P07FJ3_A3610HisProLot, P07FJ3_A136BarColNum, P07FJ3_A135BarColNom, P07FJ3_A212BarSer, P07FJ3_A1011TipMaqCod, P07FJ3_n1011TipMaqCod, P07FJ3_A606MaqDsc, P07FJ3_n606MaqDsc, P07FJ3_A563HisProMin,
            P07FJ3_A560HisProHin, P07FJ3_A562HisProMfi, P07FJ3_A559HisProHfi, P07FJ3_A4440HisProDTI, P07FJ3_n4440HisProDTI, P07FJ3_A4441HisProDTF, P07FJ3_n4441HisProDTF, P07FJ3_A558HisProFec, P07FJ3_A561HisProLin
            }
            , new Object[] {
            P07FJ4_A396EmprCod, P07FJ4_A130BarCodPar, P07FJ4_A132BarCodReo, P07FJ4_A129BarCod, P07FJ4_A252CliCod, P07FJ4_n252CliCod, P07FJ4_A212BarSer, P07FJ4_A135BarColNom, P07FJ4_A136BarColNum, P07FJ4_A218BarTipCol
            }
            , new Object[] {
            P07FJ5_A396EmprCod, P07FJ5_A507HbaBarPar, P07FJ5_A508HbaBarReo, P07FJ5_A506HbaBarCod, P07FJ5_A252CliCod, P07FJ5_n252CliCod, P07FJ5_A535HbaSer, P07FJ5_n535HbaSer, P07FJ5_A509HbaColNom, P07FJ5_n509HbaColNom,
            P07FJ5_A510HbaColNum, P07FJ5_n510HbaColNum, P07FJ5_A537HbaTipCol, P07FJ5_n537HbaTipCol
            }
            , new Object[] {
            P07FJ6_A771ProForTie
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV122Pgmname = "RPRdt11" ;
      AV121Pgmdesc = httpContext.getMessage( "PRODUCCION TINTE DT", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV122Pgmname = "RPRdt11" ;
      AV121Pgmdesc = httpContext.getMessage( "PRODUCCION TINTE DT", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV88Texknit ;
   private byte AV24F_tintutex ;
   private byte AV29FlagTiReal ;
   private byte AV92Tinamar ;
   private byte GXt_int4 ;
   private byte GXv_int3[] ;
   private byte A132BarCodReo ;
   private byte A3612HisProReo ;
   private byte A556HisProEst ;
   private byte A563HisProMin ;
   private byte A560HisProHin ;
   private byte A562HisProMfi ;
   private byte A559HisProHfi ;
   private byte AV14BarCodReo ;
   private byte AV28FlagMarca ;
   private byte AV70MinRea ;
   private byte AV93TipColCod ;
   private byte AV26FlagBarcad ;
   private byte A218BarTipCol ;
   private byte A508HbaBarReo ;
   private byte A537HbaTipCol ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short A564HisProTre ;
   private short AV37HisProTre ;
   private short AV89TiempoF ;
   private short AV42HorRea ;
   private short AV43HorReaint ;
   private short c771ProForTie ;
   private short Gx_err ;
   private int AV19Barcolnumi ;
   private int AV18Barcolnumf ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private int AV108TotMinT ;
   private int AV73NTin ;
   private int AV101Tot_N_Ge ;
   private int AV102Tot_N_Gi ;
   private int A503GruOpeCod ;
   private int AV111Totmt_i ;
   private int AV76Ntin_i ;
   private int AV109Totmt_e ;
   private int AV74Ntin_e ;
   private int AV33GruOpeCod ;
   private int AV10BarCod ;
   private int Gx_OldLine ;
   private int AV91TimeBarfas ;
   private int AV77NTin_u ;
   private int AV112Totmt_u ;
   private int AV107TotMinG ;
   private int AV113TotNTinG ;
   private int AV106Totm_Gi ;
   private int AV105Totm_Ge ;
   private int AV75Ntin_Gu ;
   private int AV110Totmt_Gu ;
   private int AV20CliCod ;
   private int AV31ForColNum ;
   private int A252CliCod ;
   private int A506HbaBarCod ;
   private int A510HbaColNum ;
   private int GX_I ;
   private long GXv_int8[] ;
   private java.math.BigDecimal AV96Tot_Kgs_Ge ;
   private java.math.BigDecimal AV97Tot_kgs_Gi ;
   private java.math.BigDecimal AV103TotKG ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal AV100Tot_KGU ;
   private java.math.BigDecimal AV104TotKgs ;
   private java.math.BigDecimal AV95Tot_kgs_e ;
   private java.math.BigDecimal AV98Tot_kgs_i ;
   private java.math.BigDecimal AV39HmP ;
   private java.math.BigDecimal AV38HmF ;
   private java.math.BigDecimal AV79PesMedPar ;
   private java.math.BigDecimal AV71MinRea2 ;
   private java.math.BigDecimal AV90TiempoNP ;
   private java.math.BigDecimal AV84Porc_ ;
   private java.math.BigDecimal AV21Dias ;
   private java.math.BigDecimal AV99Tot_kgs_u ;
   private java.math.BigDecimal AV44KgCol[] ;
   private String A396EmprCod ;
   private String AV83PMaqCod ;
   private String AV116UMaqCod ;
   private String AV94TipMaqCod ;
   private String AV9ArtCodi ;
   private String AV8ArtCodf ;
   private String AV17Barcolnomi ;
   private String AV16Barcolnomf ;
   private String AV25Filename ;
   private String AV121Pgmdesc ;
   private String AV22EmpCod ;
   private String AV46Lit01 ;
   private String AV47Lit02 ;
   private String AV45Lit0 ;
   private String AV122Pgmname ;
   private String AV48Lit1 ;
   private String AV59Lit2 ;
   private String AV62Lit3 ;
   private String AV63Lit4 ;
   private String AV64Lit5 ;
   private String AV65Lit6 ;
   private String AV66Lit7 ;
   private String AV67Lit8 ;
   private String AV68Lit9 ;
   private String AV49Lit10 ;
   private String AV50Lit11 ;
   private String AV51Lit12 ;
   private String AV52Lit13 ;
   private String AV53Lit14 ;
   private String AV54Lit15 ;
   private String AV55Lit16 ;
   private String AV56Lit17 ;
   private String AV57Lit18 ;
   private String AV58Lit19 ;
   private String AV60Lit20 ;
   private String AV61Lit21 ;
   private String AV118EmprCod ;
   private String AV23EmprNom ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A1011TipMaqCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A602MaqCod ;
   private String A130BarCodPar ;
   private String A3610HisProLot ;
   private String A606MaqDsc ;
   private String AV36HisProLot ;
   private String AV12BarCodPar ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String AV32ForSer ;
   private String AV30ForColNom ;
   private String AV27FlagBH ;
   private String A507HbaBarPar ;
   private String A535HbaSer ;
   private String A509HbaColNom ;
   private String Gx_time ;
   private java.util.Date AV35Hisprodti ;
   private java.util.Date AV34Hisprodtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date GXv_dtime6[] ;
   private java.util.Date GXv_dtime7[] ;
   private java.util.Date A558HisProFec ;
   private java.util.Date Gx_date ;
   private boolean n1011TipMaqCod ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private boolean n656ParCod ;
   private boolean brk7FJ4 ;
   private boolean n606MaqDsc ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n535HbaSer ;
   private boolean n509HbaColNom ;
   private boolean n510HbaColNum ;
   private boolean n537HbaTipCol ;
   private String[] aP12 ;
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
   private IDataStoreProvider pr_default ;
   private int[] P07FJ2_A129BarCod ;
   private byte[] P07FJ2_A132BarCodReo ;
   private String[] P07FJ2_A130BarCodPar ;
   private String[] P07FJ2_A396EmprCod ;
   private int[] P07FJ2_A136BarColNum ;
   private String[] P07FJ2_A135BarColNom ;
   private String[] P07FJ2_A212BarSer ;
   private String[] P07FJ2_A1011TipMaqCod ;
   private boolean[] P07FJ2_n1011TipMaqCod ;
   private java.util.Date[] P07FJ2_A4441HisProDTF ;
   private boolean[] P07FJ2_n4441HisProDTF ;
   private java.util.Date[] P07FJ2_A4440HisProDTI ;
   private boolean[] P07FJ2_n4440HisProDTI ;
   private String[] P07FJ2_A602MaqCod ;
   private short[] P07FJ2_A656ParCod ;
   private boolean[] P07FJ2_n656ParCod ;
   private java.math.BigDecimal[] P07FJ2_A1525HisProKgr ;
   private byte[] P07FJ2_A3612HisProReo ;
   private java.util.Date[] P07FJ2_A558HisProFec ;
   private int[] P07FJ2_A561HisProLin ;
   private String[] P07FJ3_A396EmprCod ;
   private String[] P07FJ3_A602MaqCod ;
   private byte[] P07FJ3_A556HisProEst ;
   private int[] P07FJ3_A129BarCod ;
   private byte[] P07FJ3_A132BarCodReo ;
   private String[] P07FJ3_A130BarCodPar ;
   private java.math.BigDecimal[] P07FJ3_A1525HisProKgr ;
   private byte[] P07FJ3_A3612HisProReo ;
   private short[] P07FJ3_A656ParCod ;
   private boolean[] P07FJ3_n656ParCod ;
   private int[] P07FJ3_A503GruOpeCod ;
   private String[] P07FJ3_A3610HisProLot ;
   private int[] P07FJ3_A136BarColNum ;
   private String[] P07FJ3_A135BarColNom ;
   private String[] P07FJ3_A212BarSer ;
   private String[] P07FJ3_A1011TipMaqCod ;
   private boolean[] P07FJ3_n1011TipMaqCod ;
   private String[] P07FJ3_A606MaqDsc ;
   private boolean[] P07FJ3_n606MaqDsc ;
   private byte[] P07FJ3_A563HisProMin ;
   private byte[] P07FJ3_A560HisProHin ;
   private byte[] P07FJ3_A562HisProMfi ;
   private byte[] P07FJ3_A559HisProHfi ;
   private java.util.Date[] P07FJ3_A4440HisProDTI ;
   private boolean[] P07FJ3_n4440HisProDTI ;
   private java.util.Date[] P07FJ3_A4441HisProDTF ;
   private boolean[] P07FJ3_n4441HisProDTF ;
   private java.util.Date[] P07FJ3_A558HisProFec ;
   private int[] P07FJ3_A561HisProLin ;
   private String[] P07FJ4_A396EmprCod ;
   private String[] P07FJ4_A130BarCodPar ;
   private byte[] P07FJ4_A132BarCodReo ;
   private int[] P07FJ4_A129BarCod ;
   private int[] P07FJ4_A252CliCod ;
   private boolean[] P07FJ4_n252CliCod ;
   private String[] P07FJ4_A212BarSer ;
   private String[] P07FJ4_A135BarColNom ;
   private int[] P07FJ4_A136BarColNum ;
   private byte[] P07FJ4_A218BarTipCol ;
   private String[] P07FJ5_A396EmprCod ;
   private String[] P07FJ5_A507HbaBarPar ;
   private byte[] P07FJ5_A508HbaBarReo ;
   private int[] P07FJ5_A506HbaBarCod ;
   private int[] P07FJ5_A252CliCod ;
   private boolean[] P07FJ5_n252CliCod ;
   private String[] P07FJ5_A535HbaSer ;
   private boolean[] P07FJ5_n535HbaSer ;
   private String[] P07FJ5_A509HbaColNom ;
   private boolean[] P07FJ5_n509HbaColNom ;
   private int[] P07FJ5_A510HbaColNum ;
   private boolean[] P07FJ5_n510HbaColNum ;
   private byte[] P07FJ5_A537HbaTipCol ;
   private boolean[] P07FJ5_n537HbaTipCol ;
   private short[] P07FJ6_A771ProForTie ;
}

final  class rprdt11__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07FJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV94TipMaqCod ,
                                          String A1011TipMaqCod ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date AV35Hisprodti ,
                                          java.util.Date A4441HisProDTF ,
                                          java.util.Date AV34Hisprodtf ,
                                          String A212BarSer ,
                                          String AV9ArtCodi ,
                                          String AV8ArtCodf ,
                                          String A135BarColNom ,
                                          String AV17Barcolnomi ,
                                          String AV16Barcolnomf ,
                                          int A136BarColNum ,
                                          int AV19Barcolnumi ,
                                          int AV18Barcolnumf ,
                                          String A396EmprCod ,
                                          String AV83PMaqCod ,
                                          String A602MaqCod ,
                                          String AV116UMaqCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[14];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T3.BarColNum, T3.BarColNom, T3.BarSer, T2.TipMaqCod, T1.HisProDTF, T1.HisProDTI, T1.MaqCod, T1.ParCod," ;
      scmdbuf += " T1.HisProKgr, T1.HisProReo, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN" ;
      scmdbuf += " TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTI <= ?)");
      addWhere(sWhereString, "(T3.BarSer >= ? and T3.BarSer <= ?)");
      addWhere(sWhereString, "(T3.BarColNom >= ? and T3.BarColNom <= ?)");
      addWhere(sWhereString, "(T3.BarColNum >= ? and T3.BarColNum <= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( ! (GXutil.strcmp("", AV94TipMaqCod)==0) )
      {
         addWhere(sWhereString, "(T2.TipMaqCod = ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_P07FJ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV94TipMaqCod ,
                                          String A1011TipMaqCod ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date AV35Hisprodti ,
                                          java.util.Date A4441HisProDTF ,
                                          java.util.Date AV34Hisprodtf ,
                                          String A212BarSer ,
                                          String AV9ArtCodi ,
                                          String AV8ArtCodf ,
                                          String A135BarColNom ,
                                          String AV17Barcolnomi ,
                                          String AV16Barcolnomf ,
                                          int A136BarColNum ,
                                          int AV19Barcolnumi ,
                                          int AV18Barcolnumf ,
                                          String A396EmprCod ,
                                          String AV83PMaqCod ,
                                          String A602MaqCod ,
                                          String AV116UMaqCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[14];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCod, T1.HisProEst, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProKgr, T1.HisProReo, T1.ParCod, T1.GruOpeCod, T1.HisProLot, T3.BarColNum," ;
      scmdbuf += " T3.BarColNom, T3.BarSer, T2.TipMaqCod, T2.MaqDsc, T1.HisProMin, T1.HisProHin, T1.HisProMfi, T1.HisProHfi, T1.HisProDTI, T1.HisProDTF, T1.HisProFec, T1.HisProLin" ;
      scmdbuf += " FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod" ;
      scmdbuf += " = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTI <= ?)");
      addWhere(sWhereString, "(T3.BarSer >= ?)");
      addWhere(sWhereString, "(T3.BarSer <= ?)");
      addWhere(sWhereString, "(T3.BarColNom >= ?)");
      addWhere(sWhereString, "(T3.BarColNom <= ?)");
      addWhere(sWhereString, "(T3.BarColNum >= ?)");
      addWhere(sWhereString, "(T3.BarColNum <= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( ! (GXutil.strcmp("", AV94TipMaqCod)==0) )
      {
         addWhere(sWhereString, "(T2.TipMaqCod = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProLot, T1.GruOpeCod, T1.ParCod" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P07FJ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 1 :
                  return conditional_P07FJ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07FJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07FJ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07FJ4", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07FJ5", "SELECT EmprCod, HbaBarPar, HbaBarReo, HbaBarCod, CliCod, HbaSer, HbaColNom, HbaColNum, HbaTipCol FROM TXPHISBAR WHERE EmprCod = ? and HbaBarCod = ? and HbaBarReo = ? and HbaBarPar = ? ORDER BY EmprCod, HbaBarCod, HbaBarReo, HbaBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07FJ6", "SELECT SUM(T2.ProForTie) FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 6);
               ((short[]) buf[14])[0] = rslt.getShort(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,2);
               ((byte[]) buf[17])[0] = rslt.getByte(14);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((int[]) buf[19])[0] = rslt.getInt(16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 10);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((String[]) buf[14])[0] = rslt.getString(14, 16);
               ((String[]) buf[15])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(17);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((byte[]) buf[21])[0] = rslt.getByte(19);
               ((byte[]) buf[22])[0] = rslt.getByte(20);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(21);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(22);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(23);
               ((int[]) buf[28])[0] = rslt.getInt(24);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[16], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[17], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[18], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[19], false);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 4);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[16], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[17], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[18], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[19], false);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 4);
               }
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

