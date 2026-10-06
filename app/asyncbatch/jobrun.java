package app.asyncbatch ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class jobrun extends GXProcedure
{
   public jobrun( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( jobrun.class ), "" );
   }

   public jobrun( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( java.util.UUID aP0 ,
                        String aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( java.util.UUID aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      jobrun.this.AV22JobId = aP0;
      jobrun.this.AV26EmprCod = aP1;
      jobrun.this.AV50UsurCod = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AOC2 */
      pr_default.execute(0, new Object[] {AV22JobId});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14423JobId = P0AOC2_A14423JobId[0] ;
         A14462OutPath = P0AOC2_A14462OutPath[0] ;
         n14462OutPath = P0AOC2_n14462OutPath[0] ;
         A14437BasePath = P0AOC2_A14437BasePath[0] ;
         n14437BasePath = P0AOC2_n14437BasePath[0] ;
         A14451UsrCreat = P0AOC2_A14451UsrCreat[0] ;
         n14451UsrCreat = P0AOC2_n14451UsrCreat[0] ;
         A14488UsrSocket = P0AOC2_A14488UsrSocket[0] ;
         n14488UsrSocket = P0AOC2_n14488UsrSocket[0] ;
         A14453DtStart = P0AOC2_A14453DtStart[0] ;
         n14453DtStart = P0AOC2_n14453DtStart[0] ;
         A14456PrcItem = P0AOC2_A14456PrcItem[0] ;
         n14456PrcItem = P0AOC2_n14456PrcItem[0] ;
         A14457OkItem = P0AOC2_A14457OkItem[0] ;
         n14457OkItem = P0AOC2_n14457OkItem[0] ;
         A14458ErItem = P0AOC2_A14458ErItem[0] ;
         n14458ErItem = P0AOC2_n14458ErItem[0] ;
         A14459PrgPct = P0AOC2_A14459PrgPct[0] ;
         n14459PrgPct = P0AOC2_n14459PrgPct[0] ;
         AV91OUTPATH = A14462OutPath ;
         AV92BASEPATH = A14437BasePath ;
         AV98USURGUID = A14451UsrCreat ;
         AV108UsrSocket = A14488UsrSocket ;
         A14453DtStart = GXutil.now( ) ;
         n14453DtStart = false ;
         A14456PrcItem = 0 ;
         n14456PrcItem = false ;
         A14457OkItem = 0 ;
         n14457OkItem = false ;
         A14458ErItem = 0 ;
         n14458ErItem = false ;
         A14459PrgPct = (short)(0) ;
         n14459PrgPct = false ;
         /* Using cursor P0AOC3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n14453DtStart), A14453DtStart, Boolean.valueOf(n14456PrcItem), Long.valueOf(A14456PrcItem), Boolean.valueOf(n14457OkItem), Long.valueOf(A14457OkItem), Boolean.valueOf(n14458ErItem), Long.valueOf(A14458ErItem), Boolean.valueOf(n14459PrgPct), Short.valueOf(A14459PrgPct), A14423JobId});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOB");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV99in_USURGUID = GXutil.strToGuid(AV98USURGUID) ;
      /* Execute user subroutine: 'LOADJOBPARAMETERS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P0AOC4 */
      pr_default.execute(2, new Object[] {AV22JobId});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14475OutUrl = P0AOC4_A14475OutUrl[0] ;
         n14475OutUrl = P0AOC4_n14475OutUrl[0] ;
         A14423JobId = P0AOC4_A14423JobId[0] ;
         A14470DocId = P0AOC4_A14470DocId[0] ;
         n14470DocId = P0AOC4_n14470DocId[0] ;
         A14471DocLbl = P0AOC4_A14471DocLbl[0] ;
         n14471DocLbl = P0AOC4_n14471DocLbl[0] ;
         A14472ItmSts = P0AOC4_A14472ItmSts[0] ;
         n14472ItmSts = P0AOC4_n14472ItmSts[0] ;
         A14473RetryQt = P0AOC4_A14473RetryQt[0] ;
         n14473RetryQt = P0AOC4_n14473RetryQt[0] ;
         A14484JobExec = P0AOC4_A14484JobExec[0] ;
         n14484JobExec = P0AOC4_n14484JobExec[0] ;
         A14474OutFile = P0AOC4_A14474OutFile[0] ;
         n14474OutFile = P0AOC4_n14474OutFile[0] ;
         A14476FileNm = P0AOC4_A14476FileNm[0] ;
         n14476FileNm = P0AOC4_n14476FileNm[0] ;
         A14481ItmDtStart = P0AOC4_A14481ItmDtStart[0] ;
         n14481ItmDtStart = P0AOC4_n14481ItmDtStart[0] ;
         A14424JobType = P0AOC4_A14424JobType[0] ;
         n14424JobType = P0AOC4_n14424JobType[0] ;
         A14482ItmDtEnd = P0AOC4_A14482ItmDtEnd[0] ;
         n14482ItmDtEnd = P0AOC4_n14482ItmDtEnd[0] ;
         A14486ItmErr = P0AOC4_A14486ItmErr[0] ;
         n14486ItmErr = P0AOC4_n14486ItmErr[0] ;
         A14468ItmId = P0AOC4_A14468ItmId[0] ;
         A14484JobExec = P0AOC4_A14484JobExec[0] ;
         n14484JobExec = P0AOC4_n14484JobExec[0] ;
         A14424JobType = P0AOC4_A14424JobType[0] ;
         n14424JobType = P0AOC4_n14424JobType[0] ;
         AV80DocId = A14470DocId ;
         AV82DOCLBL = A14471DocLbl ;
         AV81ItMid = A14468ItmId ;
         AV83ITMSTS = A14472ItmSts ;
         AV84RETRYQT = A14473RetryQt ;
         AV90Program = A14484JobExec ;
         AV23OutFile = A14474OutFile ;
         AV24OutUrl = A14475OutUrl ;
         AV25FileNm = A14476FileNm ;
         A14472ItmSts = httpContext.getMessage( "RUN", "") ;
         n14472ItmSts = false ;
         A14481ItmDtStart = GXutil.now( ) ;
         n14481ItmDtStart = false ;
         A14473RetryQt = (short)(A14473RetryQt+1) ;
         n14473RetryQt = false ;
         AV36OkItemRun = false ;
         AV109ErrorMsg = "" ;
         if ( GXutil.strcmp(A14424JobType, "FATURA") == 0 )
         {
            GXv_char1[0] = AV50UsurCod ;
            GXv_boolean2[0] = AV36OkItemRun ;
            GXv_char3[0] = AV109ErrorMsg ;
            new app.facturacion.runimpressionfactura(remoteHandle, context).execute( AV26EmprCod, GXv_char1, AV81ItMid, AV22JobId, AV80DocId, AV82DOCLBL, AV83ITMSTS, AV84RETRYQT, AV92BASEPATH, AV91OUTPATH, AV23OutFile, AV24OutUrl, AV25FileNm, AV110JobData, GXv_boolean2, GXv_char3) ;
            jobrun.this.AV50UsurCod = GXv_char1[0] ;
            jobrun.this.AV36OkItemRun = GXv_boolean2[0] ;
            jobrun.this.AV109ErrorMsg = GXv_char3[0] ;
         }
         else if ( GXutil.strcmp(A14424JobType, "ALBARA") == 0 )
         {
            GXv_char3[0] = AV26EmprCod ;
            GXv_char1[0] = AV50UsurCod ;
            GXv_int4[0] = AV81ItMid ;
            GXv_guid5[0] = AV22JobId ;
            GXv_int6[0] = AV80DocId ;
            GXv_char7[0] = AV82DOCLBL ;
            GXv_char8[0] = AV83ITMSTS ;
            GXv_int9[0] = AV84RETRYQT ;
            GXv_char10[0] = AV92BASEPATH ;
            GXv_char11[0] = AV91OUTPATH ;
            GXv_char12[0] = AV23OutFile ;
            GXv_char13[0] = AV24OutUrl ;
            GXv_char14[0] = AV25FileNm ;
            GXv_SdtJobParameterData15[0] = AV110JobData;
            GXv_boolean2[0] = AV36OkItemRun ;
            GXv_char16[0] = AV109ErrorMsg ;
            callAux16 = new Object[ 16 ];
            callAux16 [ 0 ] = GXv_char3 ;
            callAux16 [ 1 ] = GXv_char1 ;
            callAux16 [ 2 ] = GXv_int4 ;
            callAux16 [ 3 ] = GXv_guid5 ;
            callAux16 [ 4 ] = GXv_int6 ;
            callAux16 [ 5 ] = GXv_char7 ;
            callAux16 [ 6 ] = GXv_char8 ;
            callAux16 [ 7 ] = GXv_int9 ;
            callAux16 [ 8 ] = GXv_char10 ;
            callAux16 [ 9 ] = GXv_char11 ;
            callAux16 [ 10 ] = GXv_char12 ;
            callAux16 [ 11 ] = GXv_char13 ;
            callAux16 [ 12 ] = GXv_char14 ;
            callAux16 [ 13 ] = GXv_SdtJobParameterData15 ;
            callAux16 [ 14 ] = GXv_boolean2 ;
            callAux16 [ 15 ] = GXv_char16 ;
            DynamicExecute.dynamicExecute(context, remoteHandle, getClass(),  "app." ,  AV90Program ,  callAux16 );
            jobrun.this.AV26EmprCod = GXv_char3[0] ;
            jobrun.this.AV50UsurCod = GXv_char1[0] ;
            jobrun.this.AV81ItMid = GXv_int4[0] ;
            jobrun.this.AV22JobId = GXv_guid5[0] ;
            jobrun.this.AV80DocId = GXv_int6[0] ;
            jobrun.this.AV82DOCLBL = GXv_char7[0] ;
            jobrun.this.AV83ITMSTS = GXv_char8[0] ;
            jobrun.this.AV84RETRYQT = GXv_int9[0] ;
            jobrun.this.AV92BASEPATH = GXv_char10[0] ;
            jobrun.this.AV91OUTPATH = GXv_char11[0] ;
            jobrun.this.AV23OutFile = GXv_char12[0] ;
            jobrun.this.AV24OutUrl = GXv_char13[0] ;
            jobrun.this.AV25FileNm = GXv_char14[0] ;
            AV110JobData = GXv_SdtJobParameterData15[0] ;
            jobrun.this.AV36OkItemRun = GXv_boolean2[0] ;
            jobrun.this.AV109ErrorMsg = GXv_char16[0] ;
         }
         else if ( GXutil.strcmp(A14424JobType, "REMESSA") == 0 )
         {
            GXv_char16[0] = AV26EmprCod ;
            GXv_char14[0] = AV50UsurCod ;
            GXv_int6[0] = AV81ItMid ;
            GXv_guid5[0] = AV22JobId ;
            GXv_int4[0] = AV80DocId ;
            GXv_char13[0] = AV82DOCLBL ;
            GXv_char12[0] = AV83ITMSTS ;
            GXv_int9[0] = AV84RETRYQT ;
            GXv_char11[0] = AV92BASEPATH ;
            GXv_char10[0] = AV91OUTPATH ;
            GXv_char8[0] = AV23OutFile ;
            GXv_char7[0] = AV24OutUrl ;
            GXv_char3[0] = AV25FileNm ;
            GXv_SdtJobParameterData15[0] = AV110JobData;
            GXv_boolean2[0] = AV36OkItemRun ;
            GXv_char1[0] = AV109ErrorMsg ;
            callAux16 = new Object[ 16 ];
            callAux16 [ 0 ] = GXv_char16 ;
            callAux16 [ 1 ] = GXv_char14 ;
            callAux16 [ 2 ] = GXv_int6 ;
            callAux16 [ 3 ] = GXv_guid5 ;
            callAux16 [ 4 ] = GXv_int4 ;
            callAux16 [ 5 ] = GXv_char13 ;
            callAux16 [ 6 ] = GXv_char12 ;
            callAux16 [ 7 ] = GXv_int9 ;
            callAux16 [ 8 ] = GXv_char11 ;
            callAux16 [ 9 ] = GXv_char10 ;
            callAux16 [ 10 ] = GXv_char8 ;
            callAux16 [ 11 ] = GXv_char7 ;
            callAux16 [ 12 ] = GXv_char3 ;
            callAux16 [ 13 ] = GXv_SdtJobParameterData15 ;
            callAux16 [ 14 ] = GXv_boolean2 ;
            callAux16 [ 15 ] = GXv_char1 ;
            DynamicExecute.dynamicExecute(context, remoteHandle, getClass(),  "app." ,  AV90Program ,  callAux16 );
            jobrun.this.AV26EmprCod = GXv_char16[0] ;
            jobrun.this.AV50UsurCod = GXv_char14[0] ;
            jobrun.this.AV81ItMid = GXv_int6[0] ;
            jobrun.this.AV22JobId = GXv_guid5[0] ;
            jobrun.this.AV80DocId = GXv_int4[0] ;
            jobrun.this.AV82DOCLBL = GXv_char13[0] ;
            jobrun.this.AV83ITMSTS = GXv_char12[0] ;
            jobrun.this.AV84RETRYQT = GXv_int9[0] ;
            jobrun.this.AV92BASEPATH = GXv_char11[0] ;
            jobrun.this.AV91OUTPATH = GXv_char10[0] ;
            jobrun.this.AV23OutFile = GXv_char8[0] ;
            jobrun.this.AV24OutUrl = GXv_char7[0] ;
            jobrun.this.AV25FileNm = GXv_char3[0] ;
            AV110JobData = GXv_SdtJobParameterData15[0] ;
            jobrun.this.AV36OkItemRun = GXv_boolean2[0] ;
            jobrun.this.AV109ErrorMsg = GXv_char1[0] ;
         }
         else
         {
            AV36OkItemRun = false ;
            AV109ErrorMsg = httpContext.getMessage( "Executor não suportado: ", "") + A14484JobExec ;
         }
         if ( AV36OkItemRun )
         {
            A14472ItmSts = httpContext.getMessage( "OK", "") ;
            n14472ItmSts = false ;
            A14482ItmDtEnd = GXutil.now( ) ;
            n14482ItmDtEnd = false ;
         }
         else
         {
            A14472ItmSts = httpContext.getMessage( "ERR", "") ;
            n14472ItmSts = false ;
            A14482ItmDtEnd = GXutil.now( ) ;
            n14482ItmDtEnd = false ;
            A14486ItmErr = AV109ErrorMsg ;
            n14486ItmErr = false ;
         }
         /* Execute user subroutine: 'UPD_JOB_PROGRESS' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P0AOC5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n14472ItmSts), A14472ItmSts, Boolean.valueOf(n14473RetryQt), Short.valueOf(A14473RetryQt), Boolean.valueOf(n14481ItmDtStart), A14481ItmDtStart, Boolean.valueOf(n14482ItmDtEnd), A14482ItmDtEnd, Boolean.valueOf(n14486ItmErr), A14486ItmErr, Long.valueOf(A14468ItmId), A14423JobId});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOBITE");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Execute user subroutine: 'NOTIFICATION' */
      S141 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADJOBPARAMETERS' Routine */
      returnInSub = false ;
      AV110JobData = (app.asyncbatch.SdtJobParameterData)new app.asyncbatch.SdtJobParameterData(remoteHandle, context);
      AV110JobData.setgxTv_SdtJobParameterData_Jobid( AV22JobId );
      AV110JobData.getgxTv_SdtJobParameterData_Jobparsdt().clear();
      /* Using cursor P0AOC6 */
      pr_default.execute(4, new Object[] {AV22JobId});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A14423JobId = P0AOC6_A14423JobId[0] ;
         A14478ParKey = P0AOC6_A14478ParKey[0] ;
         A14479ParVal = P0AOC6_A14479ParVal[0] ;
         n14479ParVal = P0AOC6_n14479ParVal[0] ;
         A14480ValTyp = P0AOC6_A14480ValTyp[0] ;
         n14480ValTyp = P0AOC6_n14480ValTyp[0] ;
         AV111JobDataItem = (app.asyncbatch.SdtJobParameterData_JobParSdtItem)new app.asyncbatch.SdtJobParameterData_JobParSdtItem(remoteHandle, context);
         AV111JobDataItem.setgxTv_SdtJobParameterData_JobParSdtItem_Parkey( A14478ParKey );
         AV111JobDataItem.setgxTv_SdtJobParameterData_JobParSdtItem_Parval( A14479ParVal );
         AV111JobDataItem.setgxTv_SdtJobParameterData_JobParSdtItem_Valtyp( A14480ValTyp );
         AV110JobData.getgxTv_SdtJobParameterData_Jobparsdt().add(AV111JobDataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S121( )
   {
      /* 'UPD_JOB_PROGRESS' Routine */
      returnInSub = false ;
      AV51Now = GXutil.now( ) ;
      /* Using cursor P0AOC7 */
      pr_default.execute(5, new Object[] {AV22JobId});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A14423JobId = P0AOC7_A14423JobId[0] ;
         A14463ZipPath = P0AOC7_A14463ZipPath[0] ;
         n14463ZipPath = P0AOC7_n14463ZipPath[0] ;
         A14457OkItem = P0AOC7_A14457OkItem[0] ;
         n14457OkItem = P0AOC7_n14457OkItem[0] ;
         A14458ErItem = P0AOC7_A14458ErItem[0] ;
         n14458ErItem = P0AOC7_n14458ErItem[0] ;
         A14456PrcItem = P0AOC7_A14456PrcItem[0] ;
         n14456PrcItem = P0AOC7_n14456PrcItem[0] ;
         A14455TotItem = P0AOC7_A14455TotItem[0] ;
         n14455TotItem = P0AOC7_n14455TotItem[0] ;
         A14459PrgPct = P0AOC7_A14459PrgPct[0] ;
         n14459PrgPct = P0AOC7_n14459PrgPct[0] ;
         A14454DtEnd = P0AOC7_A14454DtEnd[0] ;
         n14454DtEnd = P0AOC7_n14454DtEnd[0] ;
         A14460CurItem = P0AOC7_A14460CurItem[0] ;
         n14460CurItem = P0AOC7_n14460CurItem[0] ;
         A14450JobStat = P0AOC7_A14450JobStat[0] ;
         n14450JobStat = P0AOC7_n14450JobStat[0] ;
         A14464ZipUrl = P0AOC7_A14464ZipUrl[0] ;
         n14464ZipUrl = P0AOC7_n14464ZipUrl[0] ;
         AV101ZipPath = A14463ZipPath ;
         if ( AV36OkItemRun )
         {
            A14457OkItem = (long)(A14457OkItem+1) ;
            n14457OkItem = false ;
         }
         else
         {
            A14458ErItem = (long)(A14458ErItem+1) ;
            n14458ErItem = false ;
         }
         A14456PrcItem = (long)(A14456PrcItem+1) ;
         n14456PrcItem = false ;
         if ( A14455TotItem > 0 )
         {
            A14459PrgPct = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(A14456PrcItem*100/ (double) (A14455TotItem)), 0))) ;
            n14459PrgPct = false ;
         }
         else
         {
            A14459PrgPct = (short)(0) ;
            n14459PrgPct = false ;
         }
         if ( A14456PrcItem >= A14455TotItem )
         {
            A14454DtEnd = GXutil.now( ) ;
            n14454DtEnd = false ;
            A14460CurItem = "" ;
            n14460CurItem = false ;
            if ( A14458ErItem > 0 )
            {
               A14450JobStat = "DONE_ERR" ;
               n14450JobStat = false ;
            }
            else
            {
               A14450JobStat = "DONE" ;
               n14450JobStat = false ;
               /* Execute user subroutine: 'ZIPPATHEMAIL' */
               S135 ();
               if ( returnInSub )
               {
                  pr_default.close(5);
                  returnInSub = true;
                  if (true) return;
               }
               A14463ZipPath = AV72PathPDFFull ;
               n14463ZipPath = false ;
               A14464ZipUrl = AV96ZIP_URL ;
               n14464ZipUrl = false ;
            }
         }
         /* Using cursor P0AOC8 */
         pr_default.execute(6, new Object[] {Boolean.valueOf(n14463ZipPath), A14463ZipPath, Boolean.valueOf(n14457OkItem), Long.valueOf(A14457OkItem), Boolean.valueOf(n14458ErItem), Long.valueOf(A14458ErItem), Boolean.valueOf(n14456PrcItem), Long.valueOf(A14456PrcItem), Boolean.valueOf(n14459PrgPct), Short.valueOf(A14459PrgPct), Boolean.valueOf(n14454DtEnd), A14454DtEnd, Boolean.valueOf(n14460CurItem), A14460CurItem, Boolean.valueOf(n14450JobStat), A14450JobStat, Boolean.valueOf(n14464ZipUrl), A14464ZipUrl, A14423JobId});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOB");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S135( )
   {
      /* 'ZIPPATHEMAIL' Routine */
      returnInSub = false ;
      AV95ZIP_FILENM = "" ;
      /* Using cursor P0AOC9 */
      pr_default.execute(7, new Object[] {AV22JobId});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A14423JobId = P0AOC9_A14423JobId[0] ;
         A14474OutFile = P0AOC9_A14474OutFile[0] ;
         n14474OutFile = P0AOC9_n14474OutFile[0] ;
         A14476FileNm = P0AOC9_A14476FileNm[0] ;
         n14476FileNm = P0AOC9_n14476FileNm[0] ;
         A14468ItmId = P0AOC9_A14468ItmId[0] ;
         AV93ItemPDF = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
         AV93ItemPDF.setgxTv_SdtSdt_MergePDF_PDF_Realpath( A14474OutFile );
         AV69Sdt_MergePDF.add(AV93ItemPDF, 0);
         if ( (GXutil.strcmp("", AV95ZIP_FILENM)==0) )
         {
            AV95ZIP_FILENM = A14476FileNm ;
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
      AV96ZIP_URL = GXutil.format( httpContext.getMessage( "./webpdf/%1%2", ""), httpContext.getMessage( "PRINT_", ""), AV95ZIP_FILENM, "", "", "", "", "", "", "") ;
      AV96ZIP_URL = GXutil.trim( AV96ZIP_URL) ;
      AV97ZIP_PATH_FILENM = GXutil.format( "%1%2%3", AV91OUTPATH, httpContext.getMessage( "PRINT_", ""), AV95ZIP_FILENM, "", "", "", "", "", "") ;
      AV97ZIP_PATH_FILENM = GXutil.trim( AV97ZIP_PATH_FILENM) ;
      AV73ListPdfJson = AV69Sdt_MergePDF.toJSonString(false) ;
      AV72PathPDFFull = AV71AppTool.merge(AV73ListPdfJson, AV97ZIP_PATH_FILENM, false) ;
   }

   public void S141( )
   {
      /* 'NOTIFICATION' Routine */
      returnInSub = false ;
      AV102NotificationInfo.setgxTv_SdtNotificationInfo_Id( AV22JobId.toString() );
      AV102NotificationInfo.setgxTv_SdtNotificationInfo_Message( "DONE" );
      AV102NotificationInfo.setgxTv_SdtNotificationInfo_Object( "Facturacion.GenerarJobFactura" );
      AV105Resp = AV103Notification.notifyclient(AV108UsrSocket, AV102NotificationInfo) ;
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "asyncbatch.jobrun");
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
      P0AOC2_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0AOC2_A14462OutPath = new String[] {""} ;
      P0AOC2_n14462OutPath = new boolean[] {false} ;
      P0AOC2_A14437BasePath = new String[] {""} ;
      P0AOC2_n14437BasePath = new boolean[] {false} ;
      P0AOC2_A14451UsrCreat = new String[] {""} ;
      P0AOC2_n14451UsrCreat = new boolean[] {false} ;
      P0AOC2_A14488UsrSocket = new String[] {""} ;
      P0AOC2_n14488UsrSocket = new boolean[] {false} ;
      P0AOC2_A14453DtStart = new java.util.Date[] {GXutil.nullDate()} ;
      P0AOC2_n14453DtStart = new boolean[] {false} ;
      P0AOC2_A14456PrcItem = new long[1] ;
      P0AOC2_n14456PrcItem = new boolean[] {false} ;
      P0AOC2_A14457OkItem = new long[1] ;
      P0AOC2_n14457OkItem = new boolean[] {false} ;
      P0AOC2_A14458ErItem = new long[1] ;
      P0AOC2_n14458ErItem = new boolean[] {false} ;
      P0AOC2_A14459PrgPct = new short[1] ;
      P0AOC2_n14459PrgPct = new boolean[] {false} ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A14462OutPath = "" ;
      A14437BasePath = "" ;
      A14451UsrCreat = "" ;
      A14488UsrSocket = "" ;
      A14453DtStart = GXutil.resetTime( GXutil.nullDate() );
      AV91OUTPATH = "" ;
      AV92BASEPATH = "" ;
      AV98USURGUID = "" ;
      AV108UsrSocket = "" ;
      AV99in_USURGUID = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      P0AOC4_A14475OutUrl = new String[] {""} ;
      P0AOC4_n14475OutUrl = new boolean[] {false} ;
      P0AOC4_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0AOC4_A14470DocId = new long[1] ;
      P0AOC4_n14470DocId = new boolean[] {false} ;
      P0AOC4_A14471DocLbl = new String[] {""} ;
      P0AOC4_n14471DocLbl = new boolean[] {false} ;
      P0AOC4_A14472ItmSts = new String[] {""} ;
      P0AOC4_n14472ItmSts = new boolean[] {false} ;
      P0AOC4_A14473RetryQt = new short[1] ;
      P0AOC4_n14473RetryQt = new boolean[] {false} ;
      P0AOC4_A14484JobExec = new String[] {""} ;
      P0AOC4_n14484JobExec = new boolean[] {false} ;
      P0AOC4_A14474OutFile = new String[] {""} ;
      P0AOC4_n14474OutFile = new boolean[] {false} ;
      P0AOC4_A14476FileNm = new String[] {""} ;
      P0AOC4_n14476FileNm = new boolean[] {false} ;
      P0AOC4_A14481ItmDtStart = new java.util.Date[] {GXutil.nullDate()} ;
      P0AOC4_n14481ItmDtStart = new boolean[] {false} ;
      P0AOC4_A14424JobType = new String[] {""} ;
      P0AOC4_n14424JobType = new boolean[] {false} ;
      P0AOC4_A14482ItmDtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      P0AOC4_n14482ItmDtEnd = new boolean[] {false} ;
      P0AOC4_A14486ItmErr = new String[] {""} ;
      P0AOC4_n14486ItmErr = new boolean[] {false} ;
      P0AOC4_A14468ItmId = new long[1] ;
      A14475OutUrl = "" ;
      A14471DocLbl = "" ;
      A14472ItmSts = "" ;
      A14484JobExec = "" ;
      A14474OutFile = "" ;
      A14476FileNm = "" ;
      A14481ItmDtStart = GXutil.resetTime( GXutil.nullDate() );
      A14424JobType = "" ;
      A14482ItmDtEnd = GXutil.resetTime( GXutil.nullDate() );
      A14486ItmErr = "" ;
      AV82DOCLBL = "" ;
      AV83ITMSTS = "" ;
      AV90Program = "" ;
      AV23OutFile = "" ;
      AV24OutUrl = "" ;
      AV25FileNm = "" ;
      AV109ErrorMsg = "" ;
      AV110JobData = new app.asyncbatch.SdtJobParameterData(remoteHandle, context);
      GXv_char16 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_int6 = new long[1] ;
      GXv_guid5 = new java.util.UUID[1] ;
      GXv_int4 = new long[1] ;
      GXv_char13 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_char11 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_SdtJobParameterData15 = new app.asyncbatch.SdtJobParameterData[1] ;
      GXv_boolean2 = new boolean[1] ;
      GXv_char1 = new String[1] ;
      P0AOC6_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0AOC6_A14478ParKey = new String[] {""} ;
      P0AOC6_A14479ParVal = new String[] {""} ;
      P0AOC6_n14479ParVal = new boolean[] {false} ;
      P0AOC6_A14480ValTyp = new String[] {""} ;
      P0AOC6_n14480ValTyp = new boolean[] {false} ;
      A14478ParKey = "" ;
      A14479ParVal = "" ;
      A14480ValTyp = "" ;
      AV111JobDataItem = new app.asyncbatch.SdtJobParameterData_JobParSdtItem(remoteHandle, context);
      AV51Now = GXutil.resetTime( GXutil.nullDate() );
      P0AOC7_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0AOC7_A14463ZipPath = new String[] {""} ;
      P0AOC7_n14463ZipPath = new boolean[] {false} ;
      P0AOC7_A14457OkItem = new long[1] ;
      P0AOC7_n14457OkItem = new boolean[] {false} ;
      P0AOC7_A14458ErItem = new long[1] ;
      P0AOC7_n14458ErItem = new boolean[] {false} ;
      P0AOC7_A14456PrcItem = new long[1] ;
      P0AOC7_n14456PrcItem = new boolean[] {false} ;
      P0AOC7_A14455TotItem = new long[1] ;
      P0AOC7_n14455TotItem = new boolean[] {false} ;
      P0AOC7_A14459PrgPct = new short[1] ;
      P0AOC7_n14459PrgPct = new boolean[] {false} ;
      P0AOC7_A14454DtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      P0AOC7_n14454DtEnd = new boolean[] {false} ;
      P0AOC7_A14460CurItem = new String[] {""} ;
      P0AOC7_n14460CurItem = new boolean[] {false} ;
      P0AOC7_A14450JobStat = new String[] {""} ;
      P0AOC7_n14450JobStat = new boolean[] {false} ;
      P0AOC7_A14464ZipUrl = new String[] {""} ;
      P0AOC7_n14464ZipUrl = new boolean[] {false} ;
      A14463ZipPath = "" ;
      A14454DtEnd = GXutil.resetTime( GXutil.nullDate() );
      A14460CurItem = "" ;
      A14450JobStat = "" ;
      A14464ZipUrl = "" ;
      AV101ZipPath = "" ;
      AV72PathPDFFull = "" ;
      AV96ZIP_URL = "" ;
      AV95ZIP_FILENM = "" ;
      P0AOC9_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0AOC9_A14474OutFile = new String[] {""} ;
      P0AOC9_n14474OutFile = new boolean[] {false} ;
      P0AOC9_A14476FileNm = new String[] {""} ;
      P0AOC9_n14476FileNm = new boolean[] {false} ;
      P0AOC9_A14468ItmId = new long[1] ;
      AV93ItemPDF = new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
      AV69Sdt_MergePDF = new GXBaseCollection<app.SdtSdt_MergePDF_PDF>(app.SdtSdt_MergePDF_PDF.class, "PDF", "TexplusNET", remoteHandle);
      AV97ZIP_PATH_FILENM = "" ;
      AV73ListPdfJson = "" ;
      AV71AppTool = new app.SdtAppTool(remoteHandle, context);
      AV102NotificationInfo = new com.genexuscore.genexus.server.SdtNotificationInfo(remoteHandle, context);
      AV103Notification = new com.genexuscore.genexus.server.SdtSocket(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.jobrun__default(),
         new Object[] {
             new Object[] {
            P0AOC2_A14423JobId, P0AOC2_A14462OutPath, P0AOC2_n14462OutPath, P0AOC2_A14437BasePath, P0AOC2_n14437BasePath, P0AOC2_A14451UsrCreat, P0AOC2_n14451UsrCreat, P0AOC2_A14488UsrSocket, P0AOC2_n14488UsrSocket, P0AOC2_A14453DtStart,
            P0AOC2_n14453DtStart, P0AOC2_A14456PrcItem, P0AOC2_n14456PrcItem, P0AOC2_A14457OkItem, P0AOC2_n14457OkItem, P0AOC2_A14458ErItem, P0AOC2_n14458ErItem, P0AOC2_A14459PrgPct, P0AOC2_n14459PrgPct
            }
            , new Object[] {
            }
            , new Object[] {
            P0AOC4_A14475OutUrl, P0AOC4_n14475OutUrl, P0AOC4_A14423JobId, P0AOC4_A14470DocId, P0AOC4_n14470DocId, P0AOC4_A14471DocLbl, P0AOC4_n14471DocLbl, P0AOC4_A14472ItmSts, P0AOC4_n14472ItmSts, P0AOC4_A14473RetryQt,
            P0AOC4_n14473RetryQt, P0AOC4_A14484JobExec, P0AOC4_n14484JobExec, P0AOC4_A14474OutFile, P0AOC4_n14474OutFile, P0AOC4_A14476FileNm, P0AOC4_n14476FileNm, P0AOC4_A14481ItmDtStart, P0AOC4_n14481ItmDtStart, P0AOC4_A14424JobType,
            P0AOC4_n14424JobType, P0AOC4_A14482ItmDtEnd, P0AOC4_n14482ItmDtEnd, P0AOC4_A14486ItmErr, P0AOC4_n14486ItmErr, P0AOC4_A14468ItmId
            }
            , new Object[] {
            }
            , new Object[] {
            P0AOC6_A14423JobId, P0AOC6_A14478ParKey, P0AOC6_A14479ParVal, P0AOC6_n14479ParVal, P0AOC6_A14480ValTyp, P0AOC6_n14480ValTyp
            }
            , new Object[] {
            P0AOC7_A14423JobId, P0AOC7_A14463ZipPath, P0AOC7_n14463ZipPath, P0AOC7_A14457OkItem, P0AOC7_n14457OkItem, P0AOC7_A14458ErItem, P0AOC7_n14458ErItem, P0AOC7_A14456PrcItem, P0AOC7_n14456PrcItem, P0AOC7_A14455TotItem,
            P0AOC7_n14455TotItem, P0AOC7_A14459PrgPct, P0AOC7_n14459PrgPct, P0AOC7_A14454DtEnd, P0AOC7_n14454DtEnd, P0AOC7_A14460CurItem, P0AOC7_n14460CurItem, P0AOC7_A14450JobStat, P0AOC7_n14450JobStat, P0AOC7_A14464ZipUrl,
            P0AOC7_n14464ZipUrl
            }
            , new Object[] {
            }
            , new Object[] {
            P0AOC9_A14423JobId, P0AOC9_A14474OutFile, P0AOC9_n14474OutFile, P0AOC9_A14476FileNm, P0AOC9_n14476FileNm, P0AOC9_A14468ItmId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A14459PrgPct ;
   private short A14473RetryQt ;
   private short AV84RETRYQT ;
   private short GXv_int9[] ;
   private short AV105Resp ;
   private short Gx_err ;
   private long A14456PrcItem ;
   private long A14457OkItem ;
   private long A14458ErItem ;
   private long A14470DocId ;
   private long A14468ItmId ;
   private long AV80DocId ;
   private long AV81ItMid ;
   private long GXv_int6[] ;
   private long GXv_int4[] ;
   private long A14455TotItem ;
   private String AV26EmprCod ;
   private String AV50UsurCod ;
   private String scmdbuf ;
   private String GXv_char16[] ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String GXv_char12[] ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private String GXv_char3[] ;
   private String GXv_char1[] ;
   private java.util.Date A14453DtStart ;
   private java.util.Date A14481ItmDtStart ;
   private java.util.Date A14482ItmDtEnd ;
   private java.util.Date AV51Now ;
   private java.util.Date A14454DtEnd ;
   private boolean n14462OutPath ;
   private boolean n14437BasePath ;
   private boolean n14451UsrCreat ;
   private boolean n14488UsrSocket ;
   private boolean n14453DtStart ;
   private boolean n14456PrcItem ;
   private boolean n14457OkItem ;
   private boolean n14458ErItem ;
   private boolean n14459PrgPct ;
   private boolean returnInSub ;
   private boolean n14475OutUrl ;
   private boolean n14470DocId ;
   private boolean n14471DocLbl ;
   private boolean n14472ItmSts ;
   private boolean n14473RetryQt ;
   private boolean n14484JobExec ;
   private boolean n14474OutFile ;
   private boolean n14476FileNm ;
   private boolean n14481ItmDtStart ;
   private boolean n14424JobType ;
   private boolean n14482ItmDtEnd ;
   private boolean n14486ItmErr ;
   private boolean AV36OkItemRun ;
   private boolean GXv_boolean2[] ;
   private boolean n14479ParVal ;
   private boolean n14480ValTyp ;
   private boolean n14463ZipPath ;
   private boolean n14455TotItem ;
   private boolean n14454DtEnd ;
   private boolean n14460CurItem ;
   private boolean n14450JobStat ;
   private boolean n14464ZipUrl ;
   private String A14475OutUrl ;
   private String AV24OutUrl ;
   private String AV73ListPdfJson ;
   private String A14462OutPath ;
   private String A14437BasePath ;
   private String A14451UsrCreat ;
   private String A14488UsrSocket ;
   private String AV91OUTPATH ;
   private String AV92BASEPATH ;
   private String AV98USURGUID ;
   private String AV108UsrSocket ;
   private String A14471DocLbl ;
   private String A14472ItmSts ;
   private String A14484JobExec ;
   private String A14474OutFile ;
   private String A14476FileNm ;
   private String A14424JobType ;
   private String A14486ItmErr ;
   private String AV82DOCLBL ;
   private String AV83ITMSTS ;
   private String AV90Program ;
   private String AV23OutFile ;
   private String AV25FileNm ;
   private String AV109ErrorMsg ;
   private String A14478ParKey ;
   private String A14479ParVal ;
   private String A14480ValTyp ;
   private String A14463ZipPath ;
   private String A14460CurItem ;
   private String A14450JobStat ;
   private String A14464ZipUrl ;
   private String AV101ZipPath ;
   private String AV72PathPDFFull ;
   private String AV96ZIP_URL ;
   private String AV95ZIP_FILENM ;
   private String AV97ZIP_PATH_FILENM ;
   private java.util.UUID AV22JobId ;
   private java.util.UUID A14423JobId ;
   private java.util.UUID AV99in_USURGUID ;
   private java.util.UUID GXv_guid5[] ;
   private app.SdtAppTool AV71AppTool ;
   private com.genexuscore.genexus.server.SdtNotificationInfo AV102NotificationInfo ;
   private com.genexuscore.genexus.server.SdtSocket AV103Notification ;
   private IDataStoreProvider pr_default ;
   private java.util.UUID[] P0AOC2_A14423JobId ;
   private String[] P0AOC2_A14462OutPath ;
   private boolean[] P0AOC2_n14462OutPath ;
   private String[] P0AOC2_A14437BasePath ;
   private boolean[] P0AOC2_n14437BasePath ;
   private String[] P0AOC2_A14451UsrCreat ;
   private boolean[] P0AOC2_n14451UsrCreat ;
   private String[] P0AOC2_A14488UsrSocket ;
   private boolean[] P0AOC2_n14488UsrSocket ;
   private java.util.Date[] P0AOC2_A14453DtStart ;
   private boolean[] P0AOC2_n14453DtStart ;
   private long[] P0AOC2_A14456PrcItem ;
   private boolean[] P0AOC2_n14456PrcItem ;
   private long[] P0AOC2_A14457OkItem ;
   private boolean[] P0AOC2_n14457OkItem ;
   private long[] P0AOC2_A14458ErItem ;
   private boolean[] P0AOC2_n14458ErItem ;
   private short[] P0AOC2_A14459PrgPct ;
   private boolean[] P0AOC2_n14459PrgPct ;
   private String[] P0AOC4_A14475OutUrl ;
   private boolean[] P0AOC4_n14475OutUrl ;
   private java.util.UUID[] P0AOC4_A14423JobId ;
   private long[] P0AOC4_A14470DocId ;
   private boolean[] P0AOC4_n14470DocId ;
   private String[] P0AOC4_A14471DocLbl ;
   private boolean[] P0AOC4_n14471DocLbl ;
   private String[] P0AOC4_A14472ItmSts ;
   private boolean[] P0AOC4_n14472ItmSts ;
   private short[] P0AOC4_A14473RetryQt ;
   private boolean[] P0AOC4_n14473RetryQt ;
   private String[] P0AOC4_A14484JobExec ;
   private boolean[] P0AOC4_n14484JobExec ;
   private String[] P0AOC4_A14474OutFile ;
   private boolean[] P0AOC4_n14474OutFile ;
   private String[] P0AOC4_A14476FileNm ;
   private boolean[] P0AOC4_n14476FileNm ;
   private java.util.Date[] P0AOC4_A14481ItmDtStart ;
   private boolean[] P0AOC4_n14481ItmDtStart ;
   private String[] P0AOC4_A14424JobType ;
   private boolean[] P0AOC4_n14424JobType ;
   private java.util.Date[] P0AOC4_A14482ItmDtEnd ;
   private boolean[] P0AOC4_n14482ItmDtEnd ;
   private String[] P0AOC4_A14486ItmErr ;
   private boolean[] P0AOC4_n14486ItmErr ;
   private long[] P0AOC4_A14468ItmId ;
   private Object[] callAux16 ;
   private java.util.UUID[] P0AOC6_A14423JobId ;
   private String[] P0AOC6_A14478ParKey ;
   private String[] P0AOC6_A14479ParVal ;
   private boolean[] P0AOC6_n14479ParVal ;
   private String[] P0AOC6_A14480ValTyp ;
   private boolean[] P0AOC6_n14480ValTyp ;
   private java.util.UUID[] P0AOC7_A14423JobId ;
   private String[] P0AOC7_A14463ZipPath ;
   private boolean[] P0AOC7_n14463ZipPath ;
   private long[] P0AOC7_A14457OkItem ;
   private boolean[] P0AOC7_n14457OkItem ;
   private long[] P0AOC7_A14458ErItem ;
   private boolean[] P0AOC7_n14458ErItem ;
   private long[] P0AOC7_A14456PrcItem ;
   private boolean[] P0AOC7_n14456PrcItem ;
   private long[] P0AOC7_A14455TotItem ;
   private boolean[] P0AOC7_n14455TotItem ;
   private short[] P0AOC7_A14459PrgPct ;
   private boolean[] P0AOC7_n14459PrgPct ;
   private java.util.Date[] P0AOC7_A14454DtEnd ;
   private boolean[] P0AOC7_n14454DtEnd ;
   private String[] P0AOC7_A14460CurItem ;
   private boolean[] P0AOC7_n14460CurItem ;
   private String[] P0AOC7_A14450JobStat ;
   private boolean[] P0AOC7_n14450JobStat ;
   private String[] P0AOC7_A14464ZipUrl ;
   private boolean[] P0AOC7_n14464ZipUrl ;
   private java.util.UUID[] P0AOC9_A14423JobId ;
   private String[] P0AOC9_A14474OutFile ;
   private boolean[] P0AOC9_n14474OutFile ;
   private String[] P0AOC9_A14476FileNm ;
   private boolean[] P0AOC9_n14476FileNm ;
   private long[] P0AOC9_A14468ItmId ;
   private GXBaseCollection<app.SdtSdt_MergePDF_PDF> AV69Sdt_MergePDF ;
   private app.SdtSdt_MergePDF_PDF AV93ItemPDF ;
   private app.asyncbatch.SdtJobParameterData AV110JobData ;
   private app.asyncbatch.SdtJobParameterData GXv_SdtJobParameterData15[] ;
   private app.asyncbatch.SdtJobParameterData_JobParSdtItem AV111JobDataItem ;
}

final  class jobrun__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AOC2", "SELECT JobId, OutPath, BasePath, UsrCreat, UsrSocket, DtStart, PrcItem, OkItem, ErItem, PrgPct FROM TXPJOB WHERE JobId = ? ORDER BY JobId ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AOC3", "UPDATE TXPJOB SET DtStart=?, PrcItem=?, OkItem=?, ErItem=?, PrgPct=?  WHERE JobId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPJOB")
         ,new ForEachCursor("P0AOC4", "SELECT T1.OutUrl, T1.JobId, T1.DocId, T1.DocLbl, T1.ItmSts, T1.RetryQt, T2.JobExec, T1.OutFile, T1.FileNm, T1.ItmDtStart, T2.JobType, T1.ItmDtEnd, T1.ItmErr, T1.ItmId FROM (TXPJOBITE T1 INNER JOIN TXPJOB T2 ON T2.JobId = T1.JobId) WHERE T1.JobId = ? ORDER BY T1.ItmId, T1.JobId ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AOC5", "UPDATE TXPJOBITE SET ItmSts=?, RetryQt=?, ItmDtStart=?, ItmDtEnd=?, ItmErr=?  WHERE ItmId = ? AND JobId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPJOBITE")
         ,new ForEachCursor("P0AOC6", "SELECT JobId, ParKey, ParVal, ValTyp FROM TXPJOBPAR WHERE JobId = ? ORDER BY JobId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AOC7", "SELECT JobId, ZipPath, OkItem, ErItem, PrcItem, TotItem, PrgPct, DtEnd, CurItem, JobStat, ZipUrl FROM TXPJOB WHERE JobId = ? ORDER BY JobId ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AOC8", "UPDATE TXPJOB SET ZipPath=?, OkItem=?, ErItem=?, PrcItem=?, PrgPct=?, DtEnd=?, CurItem=?, JobStat=?, ZipUrl=?  WHERE JobId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPJOB")
         ,new ForEachCursor("P0AOC9", "SELECT JobId, OutFile, FileNm, ItmId FROM TXPJOBITE WHERE JobId = ? ORDER BY JobId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[2])[0] = rslt.getGUID(2);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14);
               return;
            case 4 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 7 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4);
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
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[3]).longValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(3, ((Number) parms[5]).longValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(4, ((Number) parms[7]).longValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               stmt.setGUID(6, (java.util.UUID)parms[10]);
               return;
            case 2 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 30);
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
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 100);
               }
               stmt.setLong(6, ((Number) parms[10]).longValue());
               stmt.setGUID(7, (java.util.UUID)parms[11]);
               return;
            case 4 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 5 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 200);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[3]).longValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(3, ((Number) parms[5]).longValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(4, ((Number) parms[7]).longValue());
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
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[11], false);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 100);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 20);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 200);
               }
               stmt.setGUID(10, (java.util.UUID)parms[18]);
               return;
            case 7 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
      }
   }

}

