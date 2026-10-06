package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class job_bc extends GXWebPanel implements IGxSilentTrn
{
   public job_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public job_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( job_bc.class ));
   }

   public job_bc( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1VJ1907( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1VJ1907( ) ;
      standaloneModal( ) ;
      addRow1VJ1907( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( ! (GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            httpContext.GX_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "", true);
         }
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z14423JobId = A14423JobId ;
            SetMode( "UPD") ;
         }
      }
      endTrnMsgTxt = "" ;
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public boolean Reindex( )
   {
      return true ;
   }

   public void confirm_1VJ0( )
   {
      beforeValidate1VJ1907( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1VJ1907( ) ;
         }
         else
         {
            checkExtendedTable1VJ1907( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1VJ1907( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm1VJ1907( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         Z14485JobDesc = A14485JobDesc ;
         Z14424JobType = A14424JobType ;
         Z14484JobExec = A14484JobExec ;
         Z14450JobStat = A14450JobStat ;
         Z14451UsrCreat = A14451UsrCreat ;
         Z14488UsrSocket = A14488UsrSocket ;
         Z14452DtCreat = A14452DtCreat ;
         Z14453DtStart = A14453DtStart ;
         Z14454DtEnd = A14454DtEnd ;
         Z14455TotItem = A14455TotItem ;
         Z14456PrcItem = A14456PrcItem ;
         Z14457OkItem = A14457OkItem ;
         Z14458ErItem = A14458ErItem ;
         Z14459PrgPct = A14459PrgPct ;
         Z14460CurItem = A14460CurItem ;
         Z14437BasePath = A14437BasePath ;
         Z14462OutPath = A14462OutPath ;
         Z14463ZipPath = A14463ZipPath ;
         Z14464ZipUrl = A14464ZipUrl ;
         Z14466LockId = A14466LockId ;
         Z14467LockDt = A14467LockDt ;
      }
      if ( GX_JID == -3 )
      {
         Z14423JobId = A14423JobId ;
         Z14485JobDesc = A14485JobDesc ;
         Z14424JobType = A14424JobType ;
         Z14484JobExec = A14484JobExec ;
         Z14450JobStat = A14450JobStat ;
         Z14451UsrCreat = A14451UsrCreat ;
         Z14488UsrSocket = A14488UsrSocket ;
         Z14452DtCreat = A14452DtCreat ;
         Z14453DtStart = A14453DtStart ;
         Z14454DtEnd = A14454DtEnd ;
         Z14455TotItem = A14455TotItem ;
         Z14456PrcItem = A14456PrcItem ;
         Z14457OkItem = A14457OkItem ;
         Z14458ErItem = A14458ErItem ;
         Z14459PrgPct = A14459PrgPct ;
         Z14460CurItem = A14460CurItem ;
         Z14437BasePath = A14437BasePath ;
         Z14462OutPath = A14462OutPath ;
         Z14463ZipPath = A14463ZipPath ;
         Z14464ZipUrl = A14464ZipUrl ;
         Z14465LastErr = A14465LastErr ;
         Z14466LockId = A14466LockId ;
         Z14467LockDt = A14467LockDt ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1VJ1907( )
   {
      /* Using cursor BC01VJ4 */
      pr_default.execute(2, new Object[] {A14423JobId});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1907 = (short)(1) ;
         A14465LastErr = BC01VJ4_A14465LastErr[0] ;
         n14465LastErr = BC01VJ4_n14465LastErr[0] ;
         A14485JobDesc = BC01VJ4_A14485JobDesc[0] ;
         n14485JobDesc = BC01VJ4_n14485JobDesc[0] ;
         A14424JobType = BC01VJ4_A14424JobType[0] ;
         n14424JobType = BC01VJ4_n14424JobType[0] ;
         A14484JobExec = BC01VJ4_A14484JobExec[0] ;
         n14484JobExec = BC01VJ4_n14484JobExec[0] ;
         A14450JobStat = BC01VJ4_A14450JobStat[0] ;
         n14450JobStat = BC01VJ4_n14450JobStat[0] ;
         A14451UsrCreat = BC01VJ4_A14451UsrCreat[0] ;
         n14451UsrCreat = BC01VJ4_n14451UsrCreat[0] ;
         A14488UsrSocket = BC01VJ4_A14488UsrSocket[0] ;
         n14488UsrSocket = BC01VJ4_n14488UsrSocket[0] ;
         A14452DtCreat = BC01VJ4_A14452DtCreat[0] ;
         n14452DtCreat = BC01VJ4_n14452DtCreat[0] ;
         A14453DtStart = BC01VJ4_A14453DtStart[0] ;
         n14453DtStart = BC01VJ4_n14453DtStart[0] ;
         A14454DtEnd = BC01VJ4_A14454DtEnd[0] ;
         n14454DtEnd = BC01VJ4_n14454DtEnd[0] ;
         A14455TotItem = BC01VJ4_A14455TotItem[0] ;
         n14455TotItem = BC01VJ4_n14455TotItem[0] ;
         A14456PrcItem = BC01VJ4_A14456PrcItem[0] ;
         n14456PrcItem = BC01VJ4_n14456PrcItem[0] ;
         A14457OkItem = BC01VJ4_A14457OkItem[0] ;
         n14457OkItem = BC01VJ4_n14457OkItem[0] ;
         A14458ErItem = BC01VJ4_A14458ErItem[0] ;
         n14458ErItem = BC01VJ4_n14458ErItem[0] ;
         A14459PrgPct = BC01VJ4_A14459PrgPct[0] ;
         n14459PrgPct = BC01VJ4_n14459PrgPct[0] ;
         A14460CurItem = BC01VJ4_A14460CurItem[0] ;
         n14460CurItem = BC01VJ4_n14460CurItem[0] ;
         A14437BasePath = BC01VJ4_A14437BasePath[0] ;
         n14437BasePath = BC01VJ4_n14437BasePath[0] ;
         A14462OutPath = BC01VJ4_A14462OutPath[0] ;
         n14462OutPath = BC01VJ4_n14462OutPath[0] ;
         A14463ZipPath = BC01VJ4_A14463ZipPath[0] ;
         n14463ZipPath = BC01VJ4_n14463ZipPath[0] ;
         A14464ZipUrl = BC01VJ4_A14464ZipUrl[0] ;
         n14464ZipUrl = BC01VJ4_n14464ZipUrl[0] ;
         A14466LockId = BC01VJ4_A14466LockId[0] ;
         n14466LockId = BC01VJ4_n14466LockId[0] ;
         A14467LockDt = BC01VJ4_A14467LockDt[0] ;
         n14467LockDt = BC01VJ4_n14467LockDt[0] ;
         zm1VJ1907( -3) ;
      }
      pr_default.close(2);
      onLoadActions1VJ1907( ) ;
   }

   public void onLoadActions1VJ1907( )
   {
   }

   public void checkExtendedTable1VJ1907( )
   {
      nIsDirty_1907 = (short)(0) ;
      standaloneModal( ) ;
      if ( ! ( ( GXutil.strcmp(A14450JobStat, "WAINTING") == 0 ) || ( GXutil.strcmp(A14450JobStat, "PROCESSING") == 0 ) || ( GXutil.strcmp(A14450JobStat, "SUCCESS") == 0 ) || ( GXutil.strcmp(A14450JobStat, "ERROR") == 0 ) || ( GXutil.strcmp(A14450JobStat, "DONE") == 0 ) || ( GXutil.strcmp(A14450JobStat, "DONE_ERR") == 0 ) || (GXutil.strcmp("", A14450JobStat)==0) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Status", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1VJ1907( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1VJ1907( )
   {
      /* Using cursor BC01VJ5 */
      pr_default.execute(3, new Object[] {A14423JobId});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1907 = (short)(1) ;
      }
      else
      {
         RcdFound1907 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01VJ6 */
      pr_default.execute(4, new Object[] {A14423JobId});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1VJ1907( 3) ;
         RcdFound1907 = (short)(1) ;
         A14465LastErr = BC01VJ6_A14465LastErr[0] ;
         n14465LastErr = BC01VJ6_n14465LastErr[0] ;
         A14423JobId = BC01VJ6_A14423JobId[0] ;
         A14485JobDesc = BC01VJ6_A14485JobDesc[0] ;
         n14485JobDesc = BC01VJ6_n14485JobDesc[0] ;
         A14424JobType = BC01VJ6_A14424JobType[0] ;
         n14424JobType = BC01VJ6_n14424JobType[0] ;
         A14484JobExec = BC01VJ6_A14484JobExec[0] ;
         n14484JobExec = BC01VJ6_n14484JobExec[0] ;
         A14450JobStat = BC01VJ6_A14450JobStat[0] ;
         n14450JobStat = BC01VJ6_n14450JobStat[0] ;
         A14451UsrCreat = BC01VJ6_A14451UsrCreat[0] ;
         n14451UsrCreat = BC01VJ6_n14451UsrCreat[0] ;
         A14488UsrSocket = BC01VJ6_A14488UsrSocket[0] ;
         n14488UsrSocket = BC01VJ6_n14488UsrSocket[0] ;
         A14452DtCreat = BC01VJ6_A14452DtCreat[0] ;
         n14452DtCreat = BC01VJ6_n14452DtCreat[0] ;
         A14453DtStart = BC01VJ6_A14453DtStart[0] ;
         n14453DtStart = BC01VJ6_n14453DtStart[0] ;
         A14454DtEnd = BC01VJ6_A14454DtEnd[0] ;
         n14454DtEnd = BC01VJ6_n14454DtEnd[0] ;
         A14455TotItem = BC01VJ6_A14455TotItem[0] ;
         n14455TotItem = BC01VJ6_n14455TotItem[0] ;
         A14456PrcItem = BC01VJ6_A14456PrcItem[0] ;
         n14456PrcItem = BC01VJ6_n14456PrcItem[0] ;
         A14457OkItem = BC01VJ6_A14457OkItem[0] ;
         n14457OkItem = BC01VJ6_n14457OkItem[0] ;
         A14458ErItem = BC01VJ6_A14458ErItem[0] ;
         n14458ErItem = BC01VJ6_n14458ErItem[0] ;
         A14459PrgPct = BC01VJ6_A14459PrgPct[0] ;
         n14459PrgPct = BC01VJ6_n14459PrgPct[0] ;
         A14460CurItem = BC01VJ6_A14460CurItem[0] ;
         n14460CurItem = BC01VJ6_n14460CurItem[0] ;
         A14437BasePath = BC01VJ6_A14437BasePath[0] ;
         n14437BasePath = BC01VJ6_n14437BasePath[0] ;
         A14462OutPath = BC01VJ6_A14462OutPath[0] ;
         n14462OutPath = BC01VJ6_n14462OutPath[0] ;
         A14463ZipPath = BC01VJ6_A14463ZipPath[0] ;
         n14463ZipPath = BC01VJ6_n14463ZipPath[0] ;
         A14464ZipUrl = BC01VJ6_A14464ZipUrl[0] ;
         n14464ZipUrl = BC01VJ6_n14464ZipUrl[0] ;
         A14466LockId = BC01VJ6_A14466LockId[0] ;
         n14466LockId = BC01VJ6_n14466LockId[0] ;
         A14467LockDt = BC01VJ6_A14467LockDt[0] ;
         n14467LockDt = BC01VJ6_n14467LockDt[0] ;
         Z14423JobId = A14423JobId ;
         sMode1907 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1VJ1907( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1907 = (short)(0) ;
            initializeNonKey1VJ1907( ) ;
         }
         Gx_mode = sMode1907 ;
      }
      else
      {
         RcdFound1907 = (short)(0) ;
         initializeNonKey1VJ1907( ) ;
         sMode1907 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode1907 ;
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1VJ1907( ) ;
      if ( RcdFound1907 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
      }
      getByPrimaryKey( ) ;
   }

   public void insert_check( )
   {
      confirm_1VJ0( ) ;
      IsConfirmed = (short)(0) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency1VJ1907( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01VJ7 */
         pr_default.execute(5, new Object[] {A14423JobId});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPJOB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z14485JobDesc, BC01VJ7_A14485JobDesc[0]) != 0 ) || ( GXutil.strcmp(Z14424JobType, BC01VJ7_A14424JobType[0]) != 0 ) || ( GXutil.strcmp(Z14484JobExec, BC01VJ7_A14484JobExec[0]) != 0 ) || ( GXutil.strcmp(Z14450JobStat, BC01VJ7_A14450JobStat[0]) != 0 ) || ( GXutil.strcmp(Z14451UsrCreat, BC01VJ7_A14451UsrCreat[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14488UsrSocket, BC01VJ7_A14488UsrSocket[0]) != 0 ) || !( GXutil.dateCompare(Z14452DtCreat, BC01VJ7_A14452DtCreat[0]) ) || !( GXutil.dateCompare(Z14453DtStart, BC01VJ7_A14453DtStart[0]) ) || !( GXutil.dateCompare(Z14454DtEnd, BC01VJ7_A14454DtEnd[0]) ) || ( Z14455TotItem != BC01VJ7_A14455TotItem[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14456PrcItem != BC01VJ7_A14456PrcItem[0] ) || ( Z14457OkItem != BC01VJ7_A14457OkItem[0] ) || ( Z14458ErItem != BC01VJ7_A14458ErItem[0] ) || ( Z14459PrgPct != BC01VJ7_A14459PrgPct[0] ) || ( GXutil.strcmp(Z14460CurItem, BC01VJ7_A14460CurItem[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14437BasePath, BC01VJ7_A14437BasePath[0]) != 0 ) || ( GXutil.strcmp(Z14462OutPath, BC01VJ7_A14462OutPath[0]) != 0 ) || ( GXutil.strcmp(Z14463ZipPath, BC01VJ7_A14463ZipPath[0]) != 0 ) || ( GXutil.strcmp(Z14464ZipUrl, BC01VJ7_A14464ZipUrl[0]) != 0 ) || ( GXutil.strcmp(Z14466LockId, BC01VJ7_A14466LockId[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z14467LockDt, BC01VJ7_A14467LockDt[0]) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPJOB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1VJ1907( )
   {
      beforeValidate1VJ1907( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VJ1907( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1VJ1907( 0) ;
         checkOptimisticConcurrency1VJ1907( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VJ1907( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1VJ1907( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01VJ8 */
                  pr_default.execute(6, new Object[] {A14423JobId, Boolean.valueOf(n14485JobDesc), A14485JobDesc, Boolean.valueOf(n14424JobType), A14424JobType, Boolean.valueOf(n14484JobExec), A14484JobExec, Boolean.valueOf(n14450JobStat), A14450JobStat, Boolean.valueOf(n14451UsrCreat), A14451UsrCreat, Boolean.valueOf(n14488UsrSocket), A14488UsrSocket, Boolean.valueOf(n14452DtCreat), A14452DtCreat, Boolean.valueOf(n14453DtStart), A14453DtStart, Boolean.valueOf(n14454DtEnd), A14454DtEnd, Boolean.valueOf(n14455TotItem), Long.valueOf(A14455TotItem), Boolean.valueOf(n14456PrcItem), Long.valueOf(A14456PrcItem), Boolean.valueOf(n14457OkItem), Long.valueOf(A14457OkItem), Boolean.valueOf(n14458ErItem), Long.valueOf(A14458ErItem), Boolean.valueOf(n14459PrgPct), Short.valueOf(A14459PrgPct), Boolean.valueOf(n14460CurItem), A14460CurItem, Boolean.valueOf(n14437BasePath), A14437BasePath, Boolean.valueOf(n14462OutPath), A14462OutPath, Boolean.valueOf(n14463ZipPath), A14463ZipPath, Boolean.valueOf(n14464ZipUrl), A14464ZipUrl, Boolean.valueOf(n14465LastErr), A14465LastErr, Boolean.valueOf(n14466LockId), A14466LockId, Boolean.valueOf(n14467LockDt), A14467LockDt});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOB");
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load1VJ1907( ) ;
         }
         endLevel1VJ1907( ) ;
      }
      closeExtendedTableCursors1VJ1907( ) ;
   }

   public void update1VJ1907( )
   {
      beforeValidate1VJ1907( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VJ1907( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VJ1907( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VJ1907( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1VJ1907( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01VJ9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n14485JobDesc), A14485JobDesc, Boolean.valueOf(n14424JobType), A14424JobType, Boolean.valueOf(n14484JobExec), A14484JobExec, Boolean.valueOf(n14450JobStat), A14450JobStat, Boolean.valueOf(n14451UsrCreat), A14451UsrCreat, Boolean.valueOf(n14488UsrSocket), A14488UsrSocket, Boolean.valueOf(n14452DtCreat), A14452DtCreat, Boolean.valueOf(n14453DtStart), A14453DtStart, Boolean.valueOf(n14454DtEnd), A14454DtEnd, Boolean.valueOf(n14455TotItem), Long.valueOf(A14455TotItem), Boolean.valueOf(n14456PrcItem), Long.valueOf(A14456PrcItem), Boolean.valueOf(n14457OkItem), Long.valueOf(A14457OkItem), Boolean.valueOf(n14458ErItem), Long.valueOf(A14458ErItem), Boolean.valueOf(n14459PrgPct), Short.valueOf(A14459PrgPct), Boolean.valueOf(n14460CurItem), A14460CurItem, Boolean.valueOf(n14437BasePath), A14437BasePath, Boolean.valueOf(n14462OutPath), A14462OutPath, Boolean.valueOf(n14463ZipPath), A14463ZipPath, Boolean.valueOf(n14464ZipUrl), A14464ZipUrl, Boolean.valueOf(n14465LastErr), A14465LastErr, Boolean.valueOf(n14466LockId), A14466LockId, Boolean.valueOf(n14467LockDt), A14467LockDt, A14423JobId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOB");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPJOB"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1VJ1907( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1VJ1907( ) ;
      }
      closeExtendedTableCursors1VJ1907( ) ;
   }

   public void deferredUpdate1VJ1907( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1VJ1907( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VJ1907( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1VJ1907( ) ;
         afterConfirm1VJ1907( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1VJ1907( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01VJ10 */
               pr_default.execute(8, new Object[] {A14423JobId});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOB");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode1907 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1VJ1907( ) ;
      Gx_mode = sMode1907 ;
   }

   public void onDeleteControls1VJ1907( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor BC01VJ11 */
         pr_default.execute(9, new Object[] {A14423JobId});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOBPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor BC01VJ12 */
         pr_default.execute(10, new Object[] {A14423JobId});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOBITEM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel1VJ1907( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1VJ1907( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1VJ1907( )
   {
      /* Using cursor BC01VJ13 */
      pr_default.execute(11, new Object[] {A14423JobId});
      RcdFound1907 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1907 = (short)(1) ;
         A14465LastErr = BC01VJ13_A14465LastErr[0] ;
         n14465LastErr = BC01VJ13_n14465LastErr[0] ;
         A14423JobId = BC01VJ13_A14423JobId[0] ;
         A14485JobDesc = BC01VJ13_A14485JobDesc[0] ;
         n14485JobDesc = BC01VJ13_n14485JobDesc[0] ;
         A14424JobType = BC01VJ13_A14424JobType[0] ;
         n14424JobType = BC01VJ13_n14424JobType[0] ;
         A14484JobExec = BC01VJ13_A14484JobExec[0] ;
         n14484JobExec = BC01VJ13_n14484JobExec[0] ;
         A14450JobStat = BC01VJ13_A14450JobStat[0] ;
         n14450JobStat = BC01VJ13_n14450JobStat[0] ;
         A14451UsrCreat = BC01VJ13_A14451UsrCreat[0] ;
         n14451UsrCreat = BC01VJ13_n14451UsrCreat[0] ;
         A14488UsrSocket = BC01VJ13_A14488UsrSocket[0] ;
         n14488UsrSocket = BC01VJ13_n14488UsrSocket[0] ;
         A14452DtCreat = BC01VJ13_A14452DtCreat[0] ;
         n14452DtCreat = BC01VJ13_n14452DtCreat[0] ;
         A14453DtStart = BC01VJ13_A14453DtStart[0] ;
         n14453DtStart = BC01VJ13_n14453DtStart[0] ;
         A14454DtEnd = BC01VJ13_A14454DtEnd[0] ;
         n14454DtEnd = BC01VJ13_n14454DtEnd[0] ;
         A14455TotItem = BC01VJ13_A14455TotItem[0] ;
         n14455TotItem = BC01VJ13_n14455TotItem[0] ;
         A14456PrcItem = BC01VJ13_A14456PrcItem[0] ;
         n14456PrcItem = BC01VJ13_n14456PrcItem[0] ;
         A14457OkItem = BC01VJ13_A14457OkItem[0] ;
         n14457OkItem = BC01VJ13_n14457OkItem[0] ;
         A14458ErItem = BC01VJ13_A14458ErItem[0] ;
         n14458ErItem = BC01VJ13_n14458ErItem[0] ;
         A14459PrgPct = BC01VJ13_A14459PrgPct[0] ;
         n14459PrgPct = BC01VJ13_n14459PrgPct[0] ;
         A14460CurItem = BC01VJ13_A14460CurItem[0] ;
         n14460CurItem = BC01VJ13_n14460CurItem[0] ;
         A14437BasePath = BC01VJ13_A14437BasePath[0] ;
         n14437BasePath = BC01VJ13_n14437BasePath[0] ;
         A14462OutPath = BC01VJ13_A14462OutPath[0] ;
         n14462OutPath = BC01VJ13_n14462OutPath[0] ;
         A14463ZipPath = BC01VJ13_A14463ZipPath[0] ;
         n14463ZipPath = BC01VJ13_n14463ZipPath[0] ;
         A14464ZipUrl = BC01VJ13_A14464ZipUrl[0] ;
         n14464ZipUrl = BC01VJ13_n14464ZipUrl[0] ;
         A14466LockId = BC01VJ13_A14466LockId[0] ;
         n14466LockId = BC01VJ13_n14466LockId[0] ;
         A14467LockDt = BC01VJ13_A14467LockDt[0] ;
         n14467LockDt = BC01VJ13_n14467LockDt[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1VJ1907( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1907 = (short)(0) ;
      scanKeyLoad1VJ1907( ) ;
   }

   public void scanKeyLoad1VJ1907( )
   {
      sMode1907 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1907 = (short)(1) ;
         A14465LastErr = BC01VJ13_A14465LastErr[0] ;
         n14465LastErr = BC01VJ13_n14465LastErr[0] ;
         A14423JobId = BC01VJ13_A14423JobId[0] ;
         A14485JobDesc = BC01VJ13_A14485JobDesc[0] ;
         n14485JobDesc = BC01VJ13_n14485JobDesc[0] ;
         A14424JobType = BC01VJ13_A14424JobType[0] ;
         n14424JobType = BC01VJ13_n14424JobType[0] ;
         A14484JobExec = BC01VJ13_A14484JobExec[0] ;
         n14484JobExec = BC01VJ13_n14484JobExec[0] ;
         A14450JobStat = BC01VJ13_A14450JobStat[0] ;
         n14450JobStat = BC01VJ13_n14450JobStat[0] ;
         A14451UsrCreat = BC01VJ13_A14451UsrCreat[0] ;
         n14451UsrCreat = BC01VJ13_n14451UsrCreat[0] ;
         A14488UsrSocket = BC01VJ13_A14488UsrSocket[0] ;
         n14488UsrSocket = BC01VJ13_n14488UsrSocket[0] ;
         A14452DtCreat = BC01VJ13_A14452DtCreat[0] ;
         n14452DtCreat = BC01VJ13_n14452DtCreat[0] ;
         A14453DtStart = BC01VJ13_A14453DtStart[0] ;
         n14453DtStart = BC01VJ13_n14453DtStart[0] ;
         A14454DtEnd = BC01VJ13_A14454DtEnd[0] ;
         n14454DtEnd = BC01VJ13_n14454DtEnd[0] ;
         A14455TotItem = BC01VJ13_A14455TotItem[0] ;
         n14455TotItem = BC01VJ13_n14455TotItem[0] ;
         A14456PrcItem = BC01VJ13_A14456PrcItem[0] ;
         n14456PrcItem = BC01VJ13_n14456PrcItem[0] ;
         A14457OkItem = BC01VJ13_A14457OkItem[0] ;
         n14457OkItem = BC01VJ13_n14457OkItem[0] ;
         A14458ErItem = BC01VJ13_A14458ErItem[0] ;
         n14458ErItem = BC01VJ13_n14458ErItem[0] ;
         A14459PrgPct = BC01VJ13_A14459PrgPct[0] ;
         n14459PrgPct = BC01VJ13_n14459PrgPct[0] ;
         A14460CurItem = BC01VJ13_A14460CurItem[0] ;
         n14460CurItem = BC01VJ13_n14460CurItem[0] ;
         A14437BasePath = BC01VJ13_A14437BasePath[0] ;
         n14437BasePath = BC01VJ13_n14437BasePath[0] ;
         A14462OutPath = BC01VJ13_A14462OutPath[0] ;
         n14462OutPath = BC01VJ13_n14462OutPath[0] ;
         A14463ZipPath = BC01VJ13_A14463ZipPath[0] ;
         n14463ZipPath = BC01VJ13_n14463ZipPath[0] ;
         A14464ZipUrl = BC01VJ13_A14464ZipUrl[0] ;
         n14464ZipUrl = BC01VJ13_n14464ZipUrl[0] ;
         A14466LockId = BC01VJ13_A14466LockId[0] ;
         n14466LockId = BC01VJ13_n14466LockId[0] ;
         A14467LockDt = BC01VJ13_A14467LockDt[0] ;
         n14467LockDt = BC01VJ13_n14467LockDt[0] ;
      }
      Gx_mode = sMode1907 ;
   }

   public void scanKeyEnd1VJ1907( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1VJ1907( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1VJ1907( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1VJ1907( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1VJ1907( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1VJ1907( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1VJ1907( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1VJ1907( )
   {
   }

   public void send_integrity_lvl_hashes1VJ1907( )
   {
   }

   public void addRow1VJ1907( )
   {
      VarsToRow1907( bcasyncbatch_JOB) ;
   }

   public void readRow1VJ1907( )
   {
      RowToVars1907( bcasyncbatch_JOB, 1) ;
   }

   public void initializeNonKey1VJ1907( )
   {
      A14485JobDesc = "" ;
      n14485JobDesc = false ;
      A14424JobType = "" ;
      n14424JobType = false ;
      A14484JobExec = "" ;
      n14484JobExec = false ;
      A14450JobStat = "" ;
      n14450JobStat = false ;
      A14451UsrCreat = "" ;
      n14451UsrCreat = false ;
      A14488UsrSocket = "" ;
      n14488UsrSocket = false ;
      A14452DtCreat = GXutil.resetTime( GXutil.nullDate() );
      n14452DtCreat = false ;
      A14453DtStart = GXutil.resetTime( GXutil.nullDate() );
      n14453DtStart = false ;
      A14454DtEnd = GXutil.resetTime( GXutil.nullDate() );
      n14454DtEnd = false ;
      A14455TotItem = 0 ;
      n14455TotItem = false ;
      A14456PrcItem = 0 ;
      n14456PrcItem = false ;
      A14457OkItem = 0 ;
      n14457OkItem = false ;
      A14458ErItem = 0 ;
      n14458ErItem = false ;
      A14459PrgPct = (short)(0) ;
      n14459PrgPct = false ;
      A14460CurItem = "" ;
      n14460CurItem = false ;
      A14437BasePath = "" ;
      n14437BasePath = false ;
      A14462OutPath = "" ;
      n14462OutPath = false ;
      A14463ZipPath = "" ;
      n14463ZipPath = false ;
      A14464ZipUrl = "" ;
      n14464ZipUrl = false ;
      A14465LastErr = "" ;
      n14465LastErr = false ;
      A14466LockId = "" ;
      n14466LockId = false ;
      A14467LockDt = GXutil.resetTime( GXutil.nullDate() );
      n14467LockDt = false ;
      Z14485JobDesc = "" ;
      Z14424JobType = "" ;
      Z14484JobExec = "" ;
      Z14450JobStat = "" ;
      Z14451UsrCreat = "" ;
      Z14488UsrSocket = "" ;
      Z14452DtCreat = GXutil.resetTime( GXutil.nullDate() );
      Z14453DtStart = GXutil.resetTime( GXutil.nullDate() );
      Z14454DtEnd = GXutil.resetTime( GXutil.nullDate() );
      Z14455TotItem = 0 ;
      Z14456PrcItem = 0 ;
      Z14457OkItem = 0 ;
      Z14458ErItem = 0 ;
      Z14459PrgPct = (short)(0) ;
      Z14460CurItem = "" ;
      Z14437BasePath = "" ;
      Z14462OutPath = "" ;
      Z14463ZipPath = "" ;
      Z14464ZipUrl = "" ;
      Z14466LockId = "" ;
      Z14467LockDt = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll1VJ1907( )
   {
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      initializeNonKey1VJ1907( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public boolean isIns( )
   {
      return ((GXutil.strcmp(Gx_mode, "INS")==0) ? true : false) ;
   }

   public boolean isDlt( )
   {
      return ((GXutil.strcmp(Gx_mode, "DLT")==0) ? true : false) ;
   }

   public boolean isUpd( )
   {
      return ((GXutil.strcmp(Gx_mode, "UPD")==0) ? true : false) ;
   }

   public boolean isDsp( )
   {
      return ((GXutil.strcmp(Gx_mode, "DSP")==0) ? true : false) ;
   }

   public void VarsToRow1907( app.asyncbatch.SdtJOB obj1907 )
   {
      obj1907.setgxTv_SdtJOB_Mode( Gx_mode );
      obj1907.setgxTv_SdtJOB_Jobdesc( A14485JobDesc );
      obj1907.setgxTv_SdtJOB_Jobtype( A14424JobType );
      obj1907.setgxTv_SdtJOB_Jobexec( A14484JobExec );
      obj1907.setgxTv_SdtJOB_Jobstat( A14450JobStat );
      obj1907.setgxTv_SdtJOB_Usrcreat( A14451UsrCreat );
      obj1907.setgxTv_SdtJOB_Usrsocket( A14488UsrSocket );
      obj1907.setgxTv_SdtJOB_Dtcreat( A14452DtCreat );
      obj1907.setgxTv_SdtJOB_Dtstart( A14453DtStart );
      obj1907.setgxTv_SdtJOB_Dtend( A14454DtEnd );
      obj1907.setgxTv_SdtJOB_Totitem( A14455TotItem );
      obj1907.setgxTv_SdtJOB_Prcitem( A14456PrcItem );
      obj1907.setgxTv_SdtJOB_Okitem( A14457OkItem );
      obj1907.setgxTv_SdtJOB_Eritem( A14458ErItem );
      obj1907.setgxTv_SdtJOB_Prgpct( A14459PrgPct );
      obj1907.setgxTv_SdtJOB_Curitem( A14460CurItem );
      obj1907.setgxTv_SdtJOB_Basepath( A14437BasePath );
      obj1907.setgxTv_SdtJOB_Outpath( A14462OutPath );
      obj1907.setgxTv_SdtJOB_Zippath( A14463ZipPath );
      obj1907.setgxTv_SdtJOB_Zipurl( A14464ZipUrl );
      obj1907.setgxTv_SdtJOB_Lasterr( A14465LastErr );
      obj1907.setgxTv_SdtJOB_Lockid( A14466LockId );
      obj1907.setgxTv_SdtJOB_Lockdt( A14467LockDt );
      obj1907.setgxTv_SdtJOB_Jobid( A14423JobId );
      obj1907.setgxTv_SdtJOB_Jobid_Z( Z14423JobId );
      obj1907.setgxTv_SdtJOB_Jobdesc_Z( Z14485JobDesc );
      obj1907.setgxTv_SdtJOB_Jobtype_Z( Z14424JobType );
      obj1907.setgxTv_SdtJOB_Jobexec_Z( Z14484JobExec );
      obj1907.setgxTv_SdtJOB_Jobstat_Z( Z14450JobStat );
      obj1907.setgxTv_SdtJOB_Usrcreat_Z( Z14451UsrCreat );
      obj1907.setgxTv_SdtJOB_Usrsocket_Z( Z14488UsrSocket );
      obj1907.setgxTv_SdtJOB_Dtcreat_Z( Z14452DtCreat );
      obj1907.setgxTv_SdtJOB_Dtstart_Z( Z14453DtStart );
      obj1907.setgxTv_SdtJOB_Dtend_Z( Z14454DtEnd );
      obj1907.setgxTv_SdtJOB_Totitem_Z( Z14455TotItem );
      obj1907.setgxTv_SdtJOB_Prcitem_Z( Z14456PrcItem );
      obj1907.setgxTv_SdtJOB_Okitem_Z( Z14457OkItem );
      obj1907.setgxTv_SdtJOB_Eritem_Z( Z14458ErItem );
      obj1907.setgxTv_SdtJOB_Prgpct_Z( Z14459PrgPct );
      obj1907.setgxTv_SdtJOB_Curitem_Z( Z14460CurItem );
      obj1907.setgxTv_SdtJOB_Basepath_Z( Z14437BasePath );
      obj1907.setgxTv_SdtJOB_Outpath_Z( Z14462OutPath );
      obj1907.setgxTv_SdtJOB_Zippath_Z( Z14463ZipPath );
      obj1907.setgxTv_SdtJOB_Zipurl_Z( Z14464ZipUrl );
      obj1907.setgxTv_SdtJOB_Lockid_Z( Z14466LockId );
      obj1907.setgxTv_SdtJOB_Lockdt_Z( Z14467LockDt );
      obj1907.setgxTv_SdtJOB_Jobdesc_N( (byte)((byte)((n14485JobDesc)?1:0)) );
      obj1907.setgxTv_SdtJOB_Jobtype_N( (byte)((byte)((n14424JobType)?1:0)) );
      obj1907.setgxTv_SdtJOB_Jobexec_N( (byte)((byte)((n14484JobExec)?1:0)) );
      obj1907.setgxTv_SdtJOB_Jobstat_N( (byte)((byte)((n14450JobStat)?1:0)) );
      obj1907.setgxTv_SdtJOB_Usrcreat_N( (byte)((byte)((n14451UsrCreat)?1:0)) );
      obj1907.setgxTv_SdtJOB_Usrsocket_N( (byte)((byte)((n14488UsrSocket)?1:0)) );
      obj1907.setgxTv_SdtJOB_Dtcreat_N( (byte)((byte)((n14452DtCreat)?1:0)) );
      obj1907.setgxTv_SdtJOB_Dtstart_N( (byte)((byte)((n14453DtStart)?1:0)) );
      obj1907.setgxTv_SdtJOB_Dtend_N( (byte)((byte)((n14454DtEnd)?1:0)) );
      obj1907.setgxTv_SdtJOB_Totitem_N( (byte)((byte)((n14455TotItem)?1:0)) );
      obj1907.setgxTv_SdtJOB_Prcitem_N( (byte)((byte)((n14456PrcItem)?1:0)) );
      obj1907.setgxTv_SdtJOB_Okitem_N( (byte)((byte)((n14457OkItem)?1:0)) );
      obj1907.setgxTv_SdtJOB_Eritem_N( (byte)((byte)((n14458ErItem)?1:0)) );
      obj1907.setgxTv_SdtJOB_Prgpct_N( (byte)((byte)((n14459PrgPct)?1:0)) );
      obj1907.setgxTv_SdtJOB_Curitem_N( (byte)((byte)((n14460CurItem)?1:0)) );
      obj1907.setgxTv_SdtJOB_Basepath_N( (byte)((byte)((n14437BasePath)?1:0)) );
      obj1907.setgxTv_SdtJOB_Outpath_N( (byte)((byte)((n14462OutPath)?1:0)) );
      obj1907.setgxTv_SdtJOB_Zippath_N( (byte)((byte)((n14463ZipPath)?1:0)) );
      obj1907.setgxTv_SdtJOB_Zipurl_N( (byte)((byte)((n14464ZipUrl)?1:0)) );
      obj1907.setgxTv_SdtJOB_Lasterr_N( (byte)((byte)((n14465LastErr)?1:0)) );
      obj1907.setgxTv_SdtJOB_Lockid_N( (byte)((byte)((n14466LockId)?1:0)) );
      obj1907.setgxTv_SdtJOB_Lockdt_N( (byte)((byte)((n14467LockDt)?1:0)) );
      obj1907.setgxTv_SdtJOB_Mode( Gx_mode );
   }

   public void KeyVarsToRow1907( app.asyncbatch.SdtJOB obj1907 )
   {
      obj1907.setgxTv_SdtJOB_Jobid( A14423JobId );
   }

   public void RowToVars1907( app.asyncbatch.SdtJOB obj1907 ,
                              int forceLoad )
   {
      Gx_mode = obj1907.getgxTv_SdtJOB_Mode() ;
      A14485JobDesc = obj1907.getgxTv_SdtJOB_Jobdesc() ;
      n14485JobDesc = false ;
      A14424JobType = obj1907.getgxTv_SdtJOB_Jobtype() ;
      n14424JobType = false ;
      A14484JobExec = obj1907.getgxTv_SdtJOB_Jobexec() ;
      n14484JobExec = false ;
      A14450JobStat = obj1907.getgxTv_SdtJOB_Jobstat() ;
      n14450JobStat = false ;
      A14451UsrCreat = obj1907.getgxTv_SdtJOB_Usrcreat() ;
      n14451UsrCreat = false ;
      A14488UsrSocket = obj1907.getgxTv_SdtJOB_Usrsocket() ;
      n14488UsrSocket = false ;
      A14452DtCreat = obj1907.getgxTv_SdtJOB_Dtcreat() ;
      n14452DtCreat = false ;
      A14453DtStart = obj1907.getgxTv_SdtJOB_Dtstart() ;
      n14453DtStart = false ;
      A14454DtEnd = obj1907.getgxTv_SdtJOB_Dtend() ;
      n14454DtEnd = false ;
      A14455TotItem = obj1907.getgxTv_SdtJOB_Totitem() ;
      n14455TotItem = false ;
      A14456PrcItem = obj1907.getgxTv_SdtJOB_Prcitem() ;
      n14456PrcItem = false ;
      A14457OkItem = obj1907.getgxTv_SdtJOB_Okitem() ;
      n14457OkItem = false ;
      A14458ErItem = obj1907.getgxTv_SdtJOB_Eritem() ;
      n14458ErItem = false ;
      A14459PrgPct = obj1907.getgxTv_SdtJOB_Prgpct() ;
      n14459PrgPct = false ;
      A14460CurItem = obj1907.getgxTv_SdtJOB_Curitem() ;
      n14460CurItem = false ;
      A14437BasePath = obj1907.getgxTv_SdtJOB_Basepath() ;
      n14437BasePath = false ;
      A14462OutPath = obj1907.getgxTv_SdtJOB_Outpath() ;
      n14462OutPath = false ;
      A14463ZipPath = obj1907.getgxTv_SdtJOB_Zippath() ;
      n14463ZipPath = false ;
      A14464ZipUrl = obj1907.getgxTv_SdtJOB_Zipurl() ;
      n14464ZipUrl = false ;
      A14465LastErr = obj1907.getgxTv_SdtJOB_Lasterr() ;
      n14465LastErr = false ;
      A14466LockId = obj1907.getgxTv_SdtJOB_Lockid() ;
      n14466LockId = false ;
      A14467LockDt = obj1907.getgxTv_SdtJOB_Lockdt() ;
      n14467LockDt = false ;
      A14423JobId = obj1907.getgxTv_SdtJOB_Jobid() ;
      Z14423JobId = obj1907.getgxTv_SdtJOB_Jobid_Z() ;
      Z14485JobDesc = obj1907.getgxTv_SdtJOB_Jobdesc_Z() ;
      Z14424JobType = obj1907.getgxTv_SdtJOB_Jobtype_Z() ;
      Z14484JobExec = obj1907.getgxTv_SdtJOB_Jobexec_Z() ;
      Z14450JobStat = obj1907.getgxTv_SdtJOB_Jobstat_Z() ;
      Z14451UsrCreat = obj1907.getgxTv_SdtJOB_Usrcreat_Z() ;
      Z14488UsrSocket = obj1907.getgxTv_SdtJOB_Usrsocket_Z() ;
      Z14452DtCreat = obj1907.getgxTv_SdtJOB_Dtcreat_Z() ;
      Z14453DtStart = obj1907.getgxTv_SdtJOB_Dtstart_Z() ;
      Z14454DtEnd = obj1907.getgxTv_SdtJOB_Dtend_Z() ;
      Z14455TotItem = obj1907.getgxTv_SdtJOB_Totitem_Z() ;
      Z14456PrcItem = obj1907.getgxTv_SdtJOB_Prcitem_Z() ;
      Z14457OkItem = obj1907.getgxTv_SdtJOB_Okitem_Z() ;
      Z14458ErItem = obj1907.getgxTv_SdtJOB_Eritem_Z() ;
      Z14459PrgPct = obj1907.getgxTv_SdtJOB_Prgpct_Z() ;
      Z14460CurItem = obj1907.getgxTv_SdtJOB_Curitem_Z() ;
      Z14437BasePath = obj1907.getgxTv_SdtJOB_Basepath_Z() ;
      Z14462OutPath = obj1907.getgxTv_SdtJOB_Outpath_Z() ;
      Z14463ZipPath = obj1907.getgxTv_SdtJOB_Zippath_Z() ;
      Z14464ZipUrl = obj1907.getgxTv_SdtJOB_Zipurl_Z() ;
      Z14466LockId = obj1907.getgxTv_SdtJOB_Lockid_Z() ;
      Z14467LockDt = obj1907.getgxTv_SdtJOB_Lockdt_Z() ;
      n14485JobDesc = (boolean)((obj1907.getgxTv_SdtJOB_Jobdesc_N()==0)?false:true) ;
      n14424JobType = (boolean)((obj1907.getgxTv_SdtJOB_Jobtype_N()==0)?false:true) ;
      n14484JobExec = (boolean)((obj1907.getgxTv_SdtJOB_Jobexec_N()==0)?false:true) ;
      n14450JobStat = (boolean)((obj1907.getgxTv_SdtJOB_Jobstat_N()==0)?false:true) ;
      n14451UsrCreat = (boolean)((obj1907.getgxTv_SdtJOB_Usrcreat_N()==0)?false:true) ;
      n14488UsrSocket = (boolean)((obj1907.getgxTv_SdtJOB_Usrsocket_N()==0)?false:true) ;
      n14452DtCreat = (boolean)((obj1907.getgxTv_SdtJOB_Dtcreat_N()==0)?false:true) ;
      n14453DtStart = (boolean)((obj1907.getgxTv_SdtJOB_Dtstart_N()==0)?false:true) ;
      n14454DtEnd = (boolean)((obj1907.getgxTv_SdtJOB_Dtend_N()==0)?false:true) ;
      n14455TotItem = (boolean)((obj1907.getgxTv_SdtJOB_Totitem_N()==0)?false:true) ;
      n14456PrcItem = (boolean)((obj1907.getgxTv_SdtJOB_Prcitem_N()==0)?false:true) ;
      n14457OkItem = (boolean)((obj1907.getgxTv_SdtJOB_Okitem_N()==0)?false:true) ;
      n14458ErItem = (boolean)((obj1907.getgxTv_SdtJOB_Eritem_N()==0)?false:true) ;
      n14459PrgPct = (boolean)((obj1907.getgxTv_SdtJOB_Prgpct_N()==0)?false:true) ;
      n14460CurItem = (boolean)((obj1907.getgxTv_SdtJOB_Curitem_N()==0)?false:true) ;
      n14437BasePath = (boolean)((obj1907.getgxTv_SdtJOB_Basepath_N()==0)?false:true) ;
      n14462OutPath = (boolean)((obj1907.getgxTv_SdtJOB_Outpath_N()==0)?false:true) ;
      n14463ZipPath = (boolean)((obj1907.getgxTv_SdtJOB_Zippath_N()==0)?false:true) ;
      n14464ZipUrl = (boolean)((obj1907.getgxTv_SdtJOB_Zipurl_N()==0)?false:true) ;
      n14465LastErr = (boolean)((obj1907.getgxTv_SdtJOB_Lasterr_N()==0)?false:true) ;
      n14466LockId = (boolean)((obj1907.getgxTv_SdtJOB_Lockid_N()==0)?false:true) ;
      n14467LockDt = (boolean)((obj1907.getgxTv_SdtJOB_Lockdt_N()==0)?false:true) ;
      Gx_mode = obj1907.getgxTv_SdtJOB_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A14423JobId = (java.util.UUID)getParm(obj,0) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1VJ1907( ) ;
      scanKeyStart1VJ1907( ) ;
      if ( RcdFound1907 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z14423JobId = A14423JobId ;
      }
      zm1VJ1907( -3) ;
      onLoadActions1VJ1907( ) ;
      addRow1VJ1907( ) ;
      scanKeyEnd1VJ1907( ) ;
      if ( RcdFound1907 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Load( )
   {
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      RowToVars1907( bcasyncbatch_JOB, 0) ;
      scanKeyStart1VJ1907( ) ;
      if ( RcdFound1907 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z14423JobId = A14423JobId ;
      }
      zm1VJ1907( -3) ;
      onLoadActions1VJ1907( ) ;
      addRow1VJ1907( ) ;
      scanKeyEnd1VJ1907( ) ;
      if ( RcdFound1907 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1VJ1907( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1VJ1907( ) ;
      }
      else
      {
         if ( RcdFound1907 == 1 )
         {
            if ( !( A14423JobId.equals( Z14423JobId ) ) )
            {
               A14423JobId = Z14423JobId ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               /* Update record */
               update1VJ1907( ) ;
            }
         }
         else
         {
            if ( isDlt( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               if ( !( A14423JobId.equals( Z14423JobId ) ) )
               {
                  if ( isUpd( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert1VJ1907( ) ;
                  }
               }
               else
               {
                  if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert1VJ1907( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void Save( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars1907( bcasyncbatch_JOB, 1) ;
      saveImpl( ) ;
      VarsToRow1907( bcasyncbatch_JOB) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars1907( bcasyncbatch_JOB, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1VJ1907( ) ;
      afterTrn( ) ;
      VarsToRow1907( bcasyncbatch_JOB) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
      }
      else
      {
         app.asyncbatch.SdtJOB auxBC = new app.asyncbatch.SdtJOB( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A14423JobId);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcasyncbatch_JOB);
            auxBC.Save();
         }
         LclMsgLst = auxTrn.GetMessages() ;
         AnyError = (short)(auxTrn.Errors()) ;
         httpContext.GX_msglist = LclMsgLst ;
         if ( auxTrn.Errors() == 0 )
         {
            Gx_mode = auxTrn.GetMode() ;
            afterTrn( ) ;
         }
      }
   }

   public boolean Update( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars1907( bcasyncbatch_JOB, 1) ;
      updateImpl( ) ;
      VarsToRow1907( bcasyncbatch_JOB) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public boolean InsertOrUpdate( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars1907( bcasyncbatch_JOB, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1VJ1907( ) ;
      if ( AnyError == 1 )
      {
         if ( GXutil.strcmp(httpContext.GX_msglist.getItemValue((short)(1)), "DuplicatePrimaryKey") == 0 )
         {
            AnyError = (short)(0) ;
            httpContext.GX_msglist.removeAllItems();
            updateImpl( ) ;
         }
      }
      else
      {
         afterTrn( ) ;
      }
      VarsToRow1907( bcasyncbatch_JOB) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1907( bcasyncbatch_JOB, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1VJ1907( ) ;
      if ( RcdFound1907 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( !( A14423JobId.equals( Z14423JobId ) ) )
         {
            A14423JobId = Z14423JobId ;
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( isDlt( ) )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            update_check( ) ;
         }
      }
      else
      {
         if ( !( A14423JobId.equals( Z14423JobId ) ) )
         {
            Gx_mode = "INS" ;
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               Gx_mode = "INS" ;
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "asyncbatch.job_bc");
      VarsToRow1907( bcasyncbatch_JOB) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public int Errors( )
   {
      if ( AnyError == 0 )
      {
         return 0 ;
      }
      return 1 ;
   }

   public com.genexus.internet.MsgList GetMessages( )
   {
      return LclMsgLst ;
   }

   public String GetMode( )
   {
      Gx_mode = bcasyncbatch_JOB.getgxTv_SdtJOB_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcasyncbatch_JOB.setgxTv_SdtJOB_Mode( Gx_mode );
   }

   public void SetSDT( app.asyncbatch.SdtJOB sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcasyncbatch_JOB )
      {
         bcasyncbatch_JOB = sdt ;
         if ( GXutil.strcmp(bcasyncbatch_JOB.getgxTv_SdtJOB_Mode(), "") == 0 )
         {
            bcasyncbatch_JOB.setgxTv_SdtJOB_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow1907( bcasyncbatch_JOB) ;
         }
         else
         {
            RowToVars1907( bcasyncbatch_JOB, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcasyncbatch_JOB.getgxTv_SdtJOB_Mode(), "") == 0 )
         {
            bcasyncbatch_JOB.setgxTv_SdtJOB_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars1907( bcasyncbatch_JOB, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtJOB getJOB_BC( )
   {
      return bcasyncbatch_JOB ;
   }


   public void webExecute( )
   {
   }

   protected void createObjects( )
   {
   }

   protected void Process( )
   {
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Gx_mode = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      Z14485JobDesc = "" ;
      A14485JobDesc = "" ;
      Z14424JobType = "" ;
      A14424JobType = "" ;
      Z14484JobExec = "" ;
      A14484JobExec = "" ;
      Z14450JobStat = "" ;
      A14450JobStat = "" ;
      Z14451UsrCreat = "" ;
      A14451UsrCreat = "" ;
      Z14488UsrSocket = "" ;
      A14488UsrSocket = "" ;
      Z14452DtCreat = GXutil.resetTime( GXutil.nullDate() );
      A14452DtCreat = GXutil.resetTime( GXutil.nullDate() );
      Z14453DtStart = GXutil.resetTime( GXutil.nullDate() );
      A14453DtStart = GXutil.resetTime( GXutil.nullDate() );
      Z14454DtEnd = GXutil.resetTime( GXutil.nullDate() );
      A14454DtEnd = GXutil.resetTime( GXutil.nullDate() );
      Z14460CurItem = "" ;
      A14460CurItem = "" ;
      Z14437BasePath = "" ;
      A14437BasePath = "" ;
      Z14462OutPath = "" ;
      A14462OutPath = "" ;
      Z14463ZipPath = "" ;
      A14463ZipPath = "" ;
      Z14464ZipUrl = "" ;
      A14464ZipUrl = "" ;
      Z14466LockId = "" ;
      A14466LockId = "" ;
      Z14467LockDt = GXutil.resetTime( GXutil.nullDate() );
      A14467LockDt = GXutil.resetTime( GXutil.nullDate() );
      Z14465LastErr = "" ;
      A14465LastErr = "" ;
      BC01VJ4_A14465LastErr = new String[] {""} ;
      BC01VJ4_n14465LastErr = new boolean[] {false} ;
      BC01VJ4_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      BC01VJ4_A14485JobDesc = new String[] {""} ;
      BC01VJ4_n14485JobDesc = new boolean[] {false} ;
      BC01VJ4_A14424JobType = new String[] {""} ;
      BC01VJ4_n14424JobType = new boolean[] {false} ;
      BC01VJ4_A14484JobExec = new String[] {""} ;
      BC01VJ4_n14484JobExec = new boolean[] {false} ;
      BC01VJ4_A14450JobStat = new String[] {""} ;
      BC01VJ4_n14450JobStat = new boolean[] {false} ;
      BC01VJ4_A14451UsrCreat = new String[] {""} ;
      BC01VJ4_n14451UsrCreat = new boolean[] {false} ;
      BC01VJ4_A14488UsrSocket = new String[] {""} ;
      BC01VJ4_n14488UsrSocket = new boolean[] {false} ;
      BC01VJ4_A14452DtCreat = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VJ4_n14452DtCreat = new boolean[] {false} ;
      BC01VJ4_A14453DtStart = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VJ4_n14453DtStart = new boolean[] {false} ;
      BC01VJ4_A14454DtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VJ4_n14454DtEnd = new boolean[] {false} ;
      BC01VJ4_A14455TotItem = new long[1] ;
      BC01VJ4_n14455TotItem = new boolean[] {false} ;
      BC01VJ4_A14456PrcItem = new long[1] ;
      BC01VJ4_n14456PrcItem = new boolean[] {false} ;
      BC01VJ4_A14457OkItem = new long[1] ;
      BC01VJ4_n14457OkItem = new boolean[] {false} ;
      BC01VJ4_A14458ErItem = new long[1] ;
      BC01VJ4_n14458ErItem = new boolean[] {false} ;
      BC01VJ4_A14459PrgPct = new short[1] ;
      BC01VJ4_n14459PrgPct = new boolean[] {false} ;
      BC01VJ4_A14460CurItem = new String[] {""} ;
      BC01VJ4_n14460CurItem = new boolean[] {false} ;
      BC01VJ4_A14437BasePath = new String[] {""} ;
      BC01VJ4_n14437BasePath = new boolean[] {false} ;
      BC01VJ4_A14462OutPath = new String[] {""} ;
      BC01VJ4_n14462OutPath = new boolean[] {false} ;
      BC01VJ4_A14463ZipPath = new String[] {""} ;
      BC01VJ4_n14463ZipPath = new boolean[] {false} ;
      BC01VJ4_A14464ZipUrl = new String[] {""} ;
      BC01VJ4_n14464ZipUrl = new boolean[] {false} ;
      BC01VJ4_A14466LockId = new String[] {""} ;
      BC01VJ4_n14466LockId = new boolean[] {false} ;
      BC01VJ4_A14467LockDt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VJ4_n14467LockDt = new boolean[] {false} ;
      BC01VJ5_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      BC01VJ6_A14465LastErr = new String[] {""} ;
      BC01VJ6_n14465LastErr = new boolean[] {false} ;
      BC01VJ6_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      BC01VJ6_A14485JobDesc = new String[] {""} ;
      BC01VJ6_n14485JobDesc = new boolean[] {false} ;
      BC01VJ6_A14424JobType = new String[] {""} ;
      BC01VJ6_n14424JobType = new boolean[] {false} ;
      BC01VJ6_A14484JobExec = new String[] {""} ;
      BC01VJ6_n14484JobExec = new boolean[] {false} ;
      BC01VJ6_A14450JobStat = new String[] {""} ;
      BC01VJ6_n14450JobStat = new boolean[] {false} ;
      BC01VJ6_A14451UsrCreat = new String[] {""} ;
      BC01VJ6_n14451UsrCreat = new boolean[] {false} ;
      BC01VJ6_A14488UsrSocket = new String[] {""} ;
      BC01VJ6_n14488UsrSocket = new boolean[] {false} ;
      BC01VJ6_A14452DtCreat = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VJ6_n14452DtCreat = new boolean[] {false} ;
      BC01VJ6_A14453DtStart = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VJ6_n14453DtStart = new boolean[] {false} ;
      BC01VJ6_A14454DtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VJ6_n14454DtEnd = new boolean[] {false} ;
      BC01VJ6_A14455TotItem = new long[1] ;
      BC01VJ6_n14455TotItem = new boolean[] {false} ;
      BC01VJ6_A14456PrcItem = new long[1] ;
      BC01VJ6_n14456PrcItem = new boolean[] {false} ;
      BC01VJ6_A14457OkItem = new long[1] ;
      BC01VJ6_n14457OkItem = new boolean[] {false} ;
      BC01VJ6_A14458ErItem = new long[1] ;
      BC01VJ6_n14458ErItem = new boolean[] {false} ;
      BC01VJ6_A14459PrgPct = new short[1] ;
      BC01VJ6_n14459PrgPct = new boolean[] {false} ;
      BC01VJ6_A14460CurItem = new String[] {""} ;
      BC01VJ6_n14460CurItem = new boolean[] {false} ;
      BC01VJ6_A14437BasePath = new String[] {""} ;
      BC01VJ6_n14437BasePath = new boolean[] {false} ;
      BC01VJ6_A14462OutPath = new String[] {""} ;
      BC01VJ6_n14462OutPath = new boolean[] {false} ;
      BC01VJ6_A14463ZipPath = new String[] {""} ;
      BC01VJ6_n14463ZipPath = new boolean[] {false} ;
      BC01VJ6_A14464ZipUrl = new String[] {""} ;
      BC01VJ6_n14464ZipUrl = new boolean[] {false} ;
      BC01VJ6_A14466LockId = new String[] {""} ;
      BC01VJ6_n14466LockId = new boolean[] {false} ;
      BC01VJ6_A14467LockDt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VJ6_n14467LockDt = new boolean[] {false} ;
      sMode1907 = "" ;
      BC01VJ7_A14465LastErr = new String[] {""} ;
      BC01VJ7_n14465LastErr = new boolean[] {false} ;
      BC01VJ7_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      BC01VJ7_A14485JobDesc = new String[] {""} ;
      BC01VJ7_n14485JobDesc = new boolean[] {false} ;
      BC01VJ7_A14424JobType = new String[] {""} ;
      BC01VJ7_n14424JobType = new boolean[] {false} ;
      BC01VJ7_A14484JobExec = new String[] {""} ;
      BC01VJ7_n14484JobExec = new boolean[] {false} ;
      BC01VJ7_A14450JobStat = new String[] {""} ;
      BC01VJ7_n14450JobStat = new boolean[] {false} ;
      BC01VJ7_A14451UsrCreat = new String[] {""} ;
      BC01VJ7_n14451UsrCreat = new boolean[] {false} ;
      BC01VJ7_A14488UsrSocket = new String[] {""} ;
      BC01VJ7_n14488UsrSocket = new boolean[] {false} ;
      BC01VJ7_A14452DtCreat = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VJ7_n14452DtCreat = new boolean[] {false} ;
      BC01VJ7_A14453DtStart = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VJ7_n14453DtStart = new boolean[] {false} ;
      BC01VJ7_A14454DtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VJ7_n14454DtEnd = new boolean[] {false} ;
      BC01VJ7_A14455TotItem = new long[1] ;
      BC01VJ7_n14455TotItem = new boolean[] {false} ;
      BC01VJ7_A14456PrcItem = new long[1] ;
      BC01VJ7_n14456PrcItem = new boolean[] {false} ;
      BC01VJ7_A14457OkItem = new long[1] ;
      BC01VJ7_n14457OkItem = new boolean[] {false} ;
      BC01VJ7_A14458ErItem = new long[1] ;
      BC01VJ7_n14458ErItem = new boolean[] {false} ;
      BC01VJ7_A14459PrgPct = new short[1] ;
      BC01VJ7_n14459PrgPct = new boolean[] {false} ;
      BC01VJ7_A14460CurItem = new String[] {""} ;
      BC01VJ7_n14460CurItem = new boolean[] {false} ;
      BC01VJ7_A14437BasePath = new String[] {""} ;
      BC01VJ7_n14437BasePath = new boolean[] {false} ;
      BC01VJ7_A14462OutPath = new String[] {""} ;
      BC01VJ7_n14462OutPath = new boolean[] {false} ;
      BC01VJ7_A14463ZipPath = new String[] {""} ;
      BC01VJ7_n14463ZipPath = new boolean[] {false} ;
      BC01VJ7_A14464ZipUrl = new String[] {""} ;
      BC01VJ7_n14464ZipUrl = new boolean[] {false} ;
      BC01VJ7_A14466LockId = new String[] {""} ;
      BC01VJ7_n14466LockId = new boolean[] {false} ;
      BC01VJ7_A14467LockDt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VJ7_n14467LockDt = new boolean[] {false} ;
      BC01VJ11_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      BC01VJ11_A14478ParKey = new String[] {""} ;
      BC01VJ12_A14468ItmId = new long[1] ;
      BC01VJ12_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      BC01VJ13_A14465LastErr = new String[] {""} ;
      BC01VJ13_n14465LastErr = new boolean[] {false} ;
      BC01VJ13_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      BC01VJ13_A14485JobDesc = new String[] {""} ;
      BC01VJ13_n14485JobDesc = new boolean[] {false} ;
      BC01VJ13_A14424JobType = new String[] {""} ;
      BC01VJ13_n14424JobType = new boolean[] {false} ;
      BC01VJ13_A14484JobExec = new String[] {""} ;
      BC01VJ13_n14484JobExec = new boolean[] {false} ;
      BC01VJ13_A14450JobStat = new String[] {""} ;
      BC01VJ13_n14450JobStat = new boolean[] {false} ;
      BC01VJ13_A14451UsrCreat = new String[] {""} ;
      BC01VJ13_n14451UsrCreat = new boolean[] {false} ;
      BC01VJ13_A14488UsrSocket = new String[] {""} ;
      BC01VJ13_n14488UsrSocket = new boolean[] {false} ;
      BC01VJ13_A14452DtCreat = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VJ13_n14452DtCreat = new boolean[] {false} ;
      BC01VJ13_A14453DtStart = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VJ13_n14453DtStart = new boolean[] {false} ;
      BC01VJ13_A14454DtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VJ13_n14454DtEnd = new boolean[] {false} ;
      BC01VJ13_A14455TotItem = new long[1] ;
      BC01VJ13_n14455TotItem = new boolean[] {false} ;
      BC01VJ13_A14456PrcItem = new long[1] ;
      BC01VJ13_n14456PrcItem = new boolean[] {false} ;
      BC01VJ13_A14457OkItem = new long[1] ;
      BC01VJ13_n14457OkItem = new boolean[] {false} ;
      BC01VJ13_A14458ErItem = new long[1] ;
      BC01VJ13_n14458ErItem = new boolean[] {false} ;
      BC01VJ13_A14459PrgPct = new short[1] ;
      BC01VJ13_n14459PrgPct = new boolean[] {false} ;
      BC01VJ13_A14460CurItem = new String[] {""} ;
      BC01VJ13_n14460CurItem = new boolean[] {false} ;
      BC01VJ13_A14437BasePath = new String[] {""} ;
      BC01VJ13_n14437BasePath = new boolean[] {false} ;
      BC01VJ13_A14462OutPath = new String[] {""} ;
      BC01VJ13_n14462OutPath = new boolean[] {false} ;
      BC01VJ13_A14463ZipPath = new String[] {""} ;
      BC01VJ13_n14463ZipPath = new boolean[] {false} ;
      BC01VJ13_A14464ZipUrl = new String[] {""} ;
      BC01VJ13_n14464ZipUrl = new boolean[] {false} ;
      BC01VJ13_A14466LockId = new String[] {""} ;
      BC01VJ13_n14466LockId = new boolean[] {false} ;
      BC01VJ13_A14467LockDt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VJ13_n14467LockDt = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.job_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.job_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.job_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.job_bc__default(),
         new Object[] {
             new Object[] {
            BC01VJ2_A14465LastErr, BC01VJ2_n14465LastErr, BC01VJ2_A14423JobId, BC01VJ2_A14485JobDesc, BC01VJ2_n14485JobDesc, BC01VJ2_A14424JobType, BC01VJ2_n14424JobType, BC01VJ2_A14484JobExec, BC01VJ2_n14484JobExec, BC01VJ2_A14450JobStat,
            BC01VJ2_n14450JobStat, BC01VJ2_A14451UsrCreat, BC01VJ2_n14451UsrCreat, BC01VJ2_A14488UsrSocket, BC01VJ2_n14488UsrSocket, BC01VJ2_A14452DtCreat, BC01VJ2_n14452DtCreat, BC01VJ2_A14453DtStart, BC01VJ2_n14453DtStart, BC01VJ2_A14454DtEnd,
            BC01VJ2_n14454DtEnd, BC01VJ2_A14455TotItem, BC01VJ2_n14455TotItem, BC01VJ2_A14456PrcItem, BC01VJ2_n14456PrcItem, BC01VJ2_A14457OkItem, BC01VJ2_n14457OkItem, BC01VJ2_A14458ErItem, BC01VJ2_n14458ErItem, BC01VJ2_A14459PrgPct,
            BC01VJ2_n14459PrgPct, BC01VJ2_A14460CurItem, BC01VJ2_n14460CurItem, BC01VJ2_A14437BasePath, BC01VJ2_n14437BasePath, BC01VJ2_A14462OutPath, BC01VJ2_n14462OutPath, BC01VJ2_A14463ZipPath, BC01VJ2_n14463ZipPath, BC01VJ2_A14464ZipUrl,
            BC01VJ2_n14464ZipUrl, BC01VJ2_A14466LockId, BC01VJ2_n14466LockId, BC01VJ2_A14467LockDt, BC01VJ2_n14467LockDt
            }
            , new Object[] {
            BC01VJ3_A14465LastErr, BC01VJ3_n14465LastErr, BC01VJ3_A14423JobId, BC01VJ3_A14485JobDesc, BC01VJ3_n14485JobDesc, BC01VJ3_A14424JobType, BC01VJ3_n14424JobType, BC01VJ3_A14484JobExec, BC01VJ3_n14484JobExec, BC01VJ3_A14450JobStat,
            BC01VJ3_n14450JobStat, BC01VJ3_A14451UsrCreat, BC01VJ3_n14451UsrCreat, BC01VJ3_A14488UsrSocket, BC01VJ3_n14488UsrSocket, BC01VJ3_A14452DtCreat, BC01VJ3_n14452DtCreat, BC01VJ3_A14453DtStart, BC01VJ3_n14453DtStart, BC01VJ3_A14454DtEnd,
            BC01VJ3_n14454DtEnd, BC01VJ3_A14455TotItem, BC01VJ3_n14455TotItem, BC01VJ3_A14456PrcItem, BC01VJ3_n14456PrcItem, BC01VJ3_A14457OkItem, BC01VJ3_n14457OkItem, BC01VJ3_A14458ErItem, BC01VJ3_n14458ErItem, BC01VJ3_A14459PrgPct,
            BC01VJ3_n14459PrgPct, BC01VJ3_A14460CurItem, BC01VJ3_n14460CurItem, BC01VJ3_A14437BasePath, BC01VJ3_n14437BasePath, BC01VJ3_A14462OutPath, BC01VJ3_n14462OutPath, BC01VJ3_A14463ZipPath, BC01VJ3_n14463ZipPath, BC01VJ3_A14464ZipUrl,
            BC01VJ3_n14464ZipUrl, BC01VJ3_A14466LockId, BC01VJ3_n14466LockId, BC01VJ3_A14467LockDt, BC01VJ3_n14467LockDt
            }
            , new Object[] {
            BC01VJ4_A14465LastErr, BC01VJ4_n14465LastErr, BC01VJ4_A14423JobId, BC01VJ4_A14485JobDesc, BC01VJ4_n14485JobDesc, BC01VJ4_A14424JobType, BC01VJ4_n14424JobType, BC01VJ4_A14484JobExec, BC01VJ4_n14484JobExec, BC01VJ4_A14450JobStat,
            BC01VJ4_n14450JobStat, BC01VJ4_A14451UsrCreat, BC01VJ4_n14451UsrCreat, BC01VJ4_A14488UsrSocket, BC01VJ4_n14488UsrSocket, BC01VJ4_A14452DtCreat, BC01VJ4_n14452DtCreat, BC01VJ4_A14453DtStart, BC01VJ4_n14453DtStart, BC01VJ4_A14454DtEnd,
            BC01VJ4_n14454DtEnd, BC01VJ4_A14455TotItem, BC01VJ4_n14455TotItem, BC01VJ4_A14456PrcItem, BC01VJ4_n14456PrcItem, BC01VJ4_A14457OkItem, BC01VJ4_n14457OkItem, BC01VJ4_A14458ErItem, BC01VJ4_n14458ErItem, BC01VJ4_A14459PrgPct,
            BC01VJ4_n14459PrgPct, BC01VJ4_A14460CurItem, BC01VJ4_n14460CurItem, BC01VJ4_A14437BasePath, BC01VJ4_n14437BasePath, BC01VJ4_A14462OutPath, BC01VJ4_n14462OutPath, BC01VJ4_A14463ZipPath, BC01VJ4_n14463ZipPath, BC01VJ4_A14464ZipUrl,
            BC01VJ4_n14464ZipUrl, BC01VJ4_A14466LockId, BC01VJ4_n14466LockId, BC01VJ4_A14467LockDt, BC01VJ4_n14467LockDt
            }
            , new Object[] {
            BC01VJ5_A14423JobId
            }
            , new Object[] {
            BC01VJ6_A14465LastErr, BC01VJ6_n14465LastErr, BC01VJ6_A14423JobId, BC01VJ6_A14485JobDesc, BC01VJ6_n14485JobDesc, BC01VJ6_A14424JobType, BC01VJ6_n14424JobType, BC01VJ6_A14484JobExec, BC01VJ6_n14484JobExec, BC01VJ6_A14450JobStat,
            BC01VJ6_n14450JobStat, BC01VJ6_A14451UsrCreat, BC01VJ6_n14451UsrCreat, BC01VJ6_A14488UsrSocket, BC01VJ6_n14488UsrSocket, BC01VJ6_A14452DtCreat, BC01VJ6_n14452DtCreat, BC01VJ6_A14453DtStart, BC01VJ6_n14453DtStart, BC01VJ6_A14454DtEnd,
            BC01VJ6_n14454DtEnd, BC01VJ6_A14455TotItem, BC01VJ6_n14455TotItem, BC01VJ6_A14456PrcItem, BC01VJ6_n14456PrcItem, BC01VJ6_A14457OkItem, BC01VJ6_n14457OkItem, BC01VJ6_A14458ErItem, BC01VJ6_n14458ErItem, BC01VJ6_A14459PrgPct,
            BC01VJ6_n14459PrgPct, BC01VJ6_A14460CurItem, BC01VJ6_n14460CurItem, BC01VJ6_A14437BasePath, BC01VJ6_n14437BasePath, BC01VJ6_A14462OutPath, BC01VJ6_n14462OutPath, BC01VJ6_A14463ZipPath, BC01VJ6_n14463ZipPath, BC01VJ6_A14464ZipUrl,
            BC01VJ6_n14464ZipUrl, BC01VJ6_A14466LockId, BC01VJ6_n14466LockId, BC01VJ6_A14467LockDt, BC01VJ6_n14467LockDt
            }
            , new Object[] {
            BC01VJ7_A14465LastErr, BC01VJ7_n14465LastErr, BC01VJ7_A14423JobId, BC01VJ7_A14485JobDesc, BC01VJ7_n14485JobDesc, BC01VJ7_A14424JobType, BC01VJ7_n14424JobType, BC01VJ7_A14484JobExec, BC01VJ7_n14484JobExec, BC01VJ7_A14450JobStat,
            BC01VJ7_n14450JobStat, BC01VJ7_A14451UsrCreat, BC01VJ7_n14451UsrCreat, BC01VJ7_A14488UsrSocket, BC01VJ7_n14488UsrSocket, BC01VJ7_A14452DtCreat, BC01VJ7_n14452DtCreat, BC01VJ7_A14453DtStart, BC01VJ7_n14453DtStart, BC01VJ7_A14454DtEnd,
            BC01VJ7_n14454DtEnd, BC01VJ7_A14455TotItem, BC01VJ7_n14455TotItem, BC01VJ7_A14456PrcItem, BC01VJ7_n14456PrcItem, BC01VJ7_A14457OkItem, BC01VJ7_n14457OkItem, BC01VJ7_A14458ErItem, BC01VJ7_n14458ErItem, BC01VJ7_A14459PrgPct,
            BC01VJ7_n14459PrgPct, BC01VJ7_A14460CurItem, BC01VJ7_n14460CurItem, BC01VJ7_A14437BasePath, BC01VJ7_n14437BasePath, BC01VJ7_A14462OutPath, BC01VJ7_n14462OutPath, BC01VJ7_A14463ZipPath, BC01VJ7_n14463ZipPath, BC01VJ7_A14464ZipUrl,
            BC01VJ7_n14464ZipUrl, BC01VJ7_A14466LockId, BC01VJ7_n14466LockId, BC01VJ7_A14467LockDt, BC01VJ7_n14467LockDt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01VJ11_A14423JobId, BC01VJ11_A14478ParKey
            }
            , new Object[] {
            BC01VJ12_A14468ItmId, BC01VJ12_A14423JobId
            }
            , new Object[] {
            BC01VJ13_A14465LastErr, BC01VJ13_n14465LastErr, BC01VJ13_A14423JobId, BC01VJ13_A14485JobDesc, BC01VJ13_n14485JobDesc, BC01VJ13_A14424JobType, BC01VJ13_n14424JobType, BC01VJ13_A14484JobExec, BC01VJ13_n14484JobExec, BC01VJ13_A14450JobStat,
            BC01VJ13_n14450JobStat, BC01VJ13_A14451UsrCreat, BC01VJ13_n14451UsrCreat, BC01VJ13_A14488UsrSocket, BC01VJ13_n14488UsrSocket, BC01VJ13_A14452DtCreat, BC01VJ13_n14452DtCreat, BC01VJ13_A14453DtStart, BC01VJ13_n14453DtStart, BC01VJ13_A14454DtEnd,
            BC01VJ13_n14454DtEnd, BC01VJ13_A14455TotItem, BC01VJ13_n14455TotItem, BC01VJ13_A14456PrcItem, BC01VJ13_n14456PrcItem, BC01VJ13_A14457OkItem, BC01VJ13_n14457OkItem, BC01VJ13_A14458ErItem, BC01VJ13_n14458ErItem, BC01VJ13_A14459PrgPct,
            BC01VJ13_n14459PrgPct, BC01VJ13_A14460CurItem, BC01VJ13_n14460CurItem, BC01VJ13_A14437BasePath, BC01VJ13_n14437BasePath, BC01VJ13_A14462OutPath, BC01VJ13_n14462OutPath, BC01VJ13_A14463ZipPath, BC01VJ13_n14463ZipPath, BC01VJ13_A14464ZipUrl,
            BC01VJ13_n14464ZipUrl, BC01VJ13_A14466LockId, BC01VJ13_n14466LockId, BC01VJ13_A14467LockDt, BC01VJ13_n14467LockDt
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z14459PrgPct ;
   private short A14459PrgPct ;
   private short RcdFound1907 ;
   private short nIsDirty_1907 ;
   private int trnEnded ;
   private int GX_JID ;
   private long Z14455TotItem ;
   private long A14455TotItem ;
   private long Z14456PrcItem ;
   private long A14456PrcItem ;
   private long Z14457OkItem ;
   private long A14457OkItem ;
   private long Z14458ErItem ;
   private long A14458ErItem ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1907 ;
   private java.util.Date Z14452DtCreat ;
   private java.util.Date A14452DtCreat ;
   private java.util.Date Z14453DtStart ;
   private java.util.Date A14453DtStart ;
   private java.util.Date Z14454DtEnd ;
   private java.util.Date A14454DtEnd ;
   private java.util.Date Z14467LockDt ;
   private java.util.Date A14467LockDt ;
   private boolean n14465LastErr ;
   private boolean n14485JobDesc ;
   private boolean n14424JobType ;
   private boolean n14484JobExec ;
   private boolean n14450JobStat ;
   private boolean n14451UsrCreat ;
   private boolean n14488UsrSocket ;
   private boolean n14452DtCreat ;
   private boolean n14453DtStart ;
   private boolean n14454DtEnd ;
   private boolean n14455TotItem ;
   private boolean n14456PrcItem ;
   private boolean n14457OkItem ;
   private boolean n14458ErItem ;
   private boolean n14459PrgPct ;
   private boolean n14460CurItem ;
   private boolean n14437BasePath ;
   private boolean n14462OutPath ;
   private boolean n14463ZipPath ;
   private boolean n14464ZipUrl ;
   private boolean n14466LockId ;
   private boolean n14467LockDt ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private String Z14465LastErr ;
   private String A14465LastErr ;
   private String Z14485JobDesc ;
   private String A14485JobDesc ;
   private String Z14424JobType ;
   private String A14424JobType ;
   private String Z14484JobExec ;
   private String A14484JobExec ;
   private String Z14450JobStat ;
   private String A14450JobStat ;
   private String Z14451UsrCreat ;
   private String A14451UsrCreat ;
   private String Z14488UsrSocket ;
   private String A14488UsrSocket ;
   private String Z14460CurItem ;
   private String A14460CurItem ;
   private String Z14437BasePath ;
   private String A14437BasePath ;
   private String Z14462OutPath ;
   private String A14462OutPath ;
   private String Z14463ZipPath ;
   private String A14463ZipPath ;
   private String Z14464ZipUrl ;
   private String A14464ZipUrl ;
   private String Z14466LockId ;
   private String A14466LockId ;
   private java.util.UUID Z14423JobId ;
   private java.util.UUID A14423JobId ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private app.asyncbatch.SdtJOB bcasyncbatch_JOB ;
   private IDataStoreProvider pr_default ;
   private String[] BC01VJ4_A14465LastErr ;
   private boolean[] BC01VJ4_n14465LastErr ;
   private java.util.UUID[] BC01VJ4_A14423JobId ;
   private String[] BC01VJ4_A14485JobDesc ;
   private boolean[] BC01VJ4_n14485JobDesc ;
   private String[] BC01VJ4_A14424JobType ;
   private boolean[] BC01VJ4_n14424JobType ;
   private String[] BC01VJ4_A14484JobExec ;
   private boolean[] BC01VJ4_n14484JobExec ;
   private String[] BC01VJ4_A14450JobStat ;
   private boolean[] BC01VJ4_n14450JobStat ;
   private String[] BC01VJ4_A14451UsrCreat ;
   private boolean[] BC01VJ4_n14451UsrCreat ;
   private String[] BC01VJ4_A14488UsrSocket ;
   private boolean[] BC01VJ4_n14488UsrSocket ;
   private java.util.Date[] BC01VJ4_A14452DtCreat ;
   private boolean[] BC01VJ4_n14452DtCreat ;
   private java.util.Date[] BC01VJ4_A14453DtStart ;
   private boolean[] BC01VJ4_n14453DtStart ;
   private java.util.Date[] BC01VJ4_A14454DtEnd ;
   private boolean[] BC01VJ4_n14454DtEnd ;
   private long[] BC01VJ4_A14455TotItem ;
   private boolean[] BC01VJ4_n14455TotItem ;
   private long[] BC01VJ4_A14456PrcItem ;
   private boolean[] BC01VJ4_n14456PrcItem ;
   private long[] BC01VJ4_A14457OkItem ;
   private boolean[] BC01VJ4_n14457OkItem ;
   private long[] BC01VJ4_A14458ErItem ;
   private boolean[] BC01VJ4_n14458ErItem ;
   private short[] BC01VJ4_A14459PrgPct ;
   private boolean[] BC01VJ4_n14459PrgPct ;
   private String[] BC01VJ4_A14460CurItem ;
   private boolean[] BC01VJ4_n14460CurItem ;
   private String[] BC01VJ4_A14437BasePath ;
   private boolean[] BC01VJ4_n14437BasePath ;
   private String[] BC01VJ4_A14462OutPath ;
   private boolean[] BC01VJ4_n14462OutPath ;
   private String[] BC01VJ4_A14463ZipPath ;
   private boolean[] BC01VJ4_n14463ZipPath ;
   private String[] BC01VJ4_A14464ZipUrl ;
   private boolean[] BC01VJ4_n14464ZipUrl ;
   private String[] BC01VJ4_A14466LockId ;
   private boolean[] BC01VJ4_n14466LockId ;
   private java.util.Date[] BC01VJ4_A14467LockDt ;
   private boolean[] BC01VJ4_n14467LockDt ;
   private java.util.UUID[] BC01VJ5_A14423JobId ;
   private String[] BC01VJ6_A14465LastErr ;
   private boolean[] BC01VJ6_n14465LastErr ;
   private java.util.UUID[] BC01VJ6_A14423JobId ;
   private String[] BC01VJ6_A14485JobDesc ;
   private boolean[] BC01VJ6_n14485JobDesc ;
   private String[] BC01VJ6_A14424JobType ;
   private boolean[] BC01VJ6_n14424JobType ;
   private String[] BC01VJ6_A14484JobExec ;
   private boolean[] BC01VJ6_n14484JobExec ;
   private String[] BC01VJ6_A14450JobStat ;
   private boolean[] BC01VJ6_n14450JobStat ;
   private String[] BC01VJ6_A14451UsrCreat ;
   private boolean[] BC01VJ6_n14451UsrCreat ;
   private String[] BC01VJ6_A14488UsrSocket ;
   private boolean[] BC01VJ6_n14488UsrSocket ;
   private java.util.Date[] BC01VJ6_A14452DtCreat ;
   private boolean[] BC01VJ6_n14452DtCreat ;
   private java.util.Date[] BC01VJ6_A14453DtStart ;
   private boolean[] BC01VJ6_n14453DtStart ;
   private java.util.Date[] BC01VJ6_A14454DtEnd ;
   private boolean[] BC01VJ6_n14454DtEnd ;
   private long[] BC01VJ6_A14455TotItem ;
   private boolean[] BC01VJ6_n14455TotItem ;
   private long[] BC01VJ6_A14456PrcItem ;
   private boolean[] BC01VJ6_n14456PrcItem ;
   private long[] BC01VJ6_A14457OkItem ;
   private boolean[] BC01VJ6_n14457OkItem ;
   private long[] BC01VJ6_A14458ErItem ;
   private boolean[] BC01VJ6_n14458ErItem ;
   private short[] BC01VJ6_A14459PrgPct ;
   private boolean[] BC01VJ6_n14459PrgPct ;
   private String[] BC01VJ6_A14460CurItem ;
   private boolean[] BC01VJ6_n14460CurItem ;
   private String[] BC01VJ6_A14437BasePath ;
   private boolean[] BC01VJ6_n14437BasePath ;
   private String[] BC01VJ6_A14462OutPath ;
   private boolean[] BC01VJ6_n14462OutPath ;
   private String[] BC01VJ6_A14463ZipPath ;
   private boolean[] BC01VJ6_n14463ZipPath ;
   private String[] BC01VJ6_A14464ZipUrl ;
   private boolean[] BC01VJ6_n14464ZipUrl ;
   private String[] BC01VJ6_A14466LockId ;
   private boolean[] BC01VJ6_n14466LockId ;
   private java.util.Date[] BC01VJ6_A14467LockDt ;
   private boolean[] BC01VJ6_n14467LockDt ;
   private String[] BC01VJ7_A14465LastErr ;
   private boolean[] BC01VJ7_n14465LastErr ;
   private java.util.UUID[] BC01VJ7_A14423JobId ;
   private String[] BC01VJ7_A14485JobDesc ;
   private boolean[] BC01VJ7_n14485JobDesc ;
   private String[] BC01VJ7_A14424JobType ;
   private boolean[] BC01VJ7_n14424JobType ;
   private String[] BC01VJ7_A14484JobExec ;
   private boolean[] BC01VJ7_n14484JobExec ;
   private String[] BC01VJ7_A14450JobStat ;
   private boolean[] BC01VJ7_n14450JobStat ;
   private String[] BC01VJ7_A14451UsrCreat ;
   private boolean[] BC01VJ7_n14451UsrCreat ;
   private String[] BC01VJ7_A14488UsrSocket ;
   private boolean[] BC01VJ7_n14488UsrSocket ;
   private java.util.Date[] BC01VJ7_A14452DtCreat ;
   private boolean[] BC01VJ7_n14452DtCreat ;
   private java.util.Date[] BC01VJ7_A14453DtStart ;
   private boolean[] BC01VJ7_n14453DtStart ;
   private java.util.Date[] BC01VJ7_A14454DtEnd ;
   private boolean[] BC01VJ7_n14454DtEnd ;
   private long[] BC01VJ7_A14455TotItem ;
   private boolean[] BC01VJ7_n14455TotItem ;
   private long[] BC01VJ7_A14456PrcItem ;
   private boolean[] BC01VJ7_n14456PrcItem ;
   private long[] BC01VJ7_A14457OkItem ;
   private boolean[] BC01VJ7_n14457OkItem ;
   private long[] BC01VJ7_A14458ErItem ;
   private boolean[] BC01VJ7_n14458ErItem ;
   private short[] BC01VJ7_A14459PrgPct ;
   private boolean[] BC01VJ7_n14459PrgPct ;
   private String[] BC01VJ7_A14460CurItem ;
   private boolean[] BC01VJ7_n14460CurItem ;
   private String[] BC01VJ7_A14437BasePath ;
   private boolean[] BC01VJ7_n14437BasePath ;
   private String[] BC01VJ7_A14462OutPath ;
   private boolean[] BC01VJ7_n14462OutPath ;
   private String[] BC01VJ7_A14463ZipPath ;
   private boolean[] BC01VJ7_n14463ZipPath ;
   private String[] BC01VJ7_A14464ZipUrl ;
   private boolean[] BC01VJ7_n14464ZipUrl ;
   private String[] BC01VJ7_A14466LockId ;
   private boolean[] BC01VJ7_n14466LockId ;
   private java.util.Date[] BC01VJ7_A14467LockDt ;
   private boolean[] BC01VJ7_n14467LockDt ;
   private java.util.UUID[] BC01VJ11_A14423JobId ;
   private String[] BC01VJ11_A14478ParKey ;
   private long[] BC01VJ12_A14468ItmId ;
   private java.util.UUID[] BC01VJ12_A14423JobId ;
   private String[] BC01VJ13_A14465LastErr ;
   private boolean[] BC01VJ13_n14465LastErr ;
   private java.util.UUID[] BC01VJ13_A14423JobId ;
   private String[] BC01VJ13_A14485JobDesc ;
   private boolean[] BC01VJ13_n14485JobDesc ;
   private String[] BC01VJ13_A14424JobType ;
   private boolean[] BC01VJ13_n14424JobType ;
   private String[] BC01VJ13_A14484JobExec ;
   private boolean[] BC01VJ13_n14484JobExec ;
   private String[] BC01VJ13_A14450JobStat ;
   private boolean[] BC01VJ13_n14450JobStat ;
   private String[] BC01VJ13_A14451UsrCreat ;
   private boolean[] BC01VJ13_n14451UsrCreat ;
   private String[] BC01VJ13_A14488UsrSocket ;
   private boolean[] BC01VJ13_n14488UsrSocket ;
   private java.util.Date[] BC01VJ13_A14452DtCreat ;
   private boolean[] BC01VJ13_n14452DtCreat ;
   private java.util.Date[] BC01VJ13_A14453DtStart ;
   private boolean[] BC01VJ13_n14453DtStart ;
   private java.util.Date[] BC01VJ13_A14454DtEnd ;
   private boolean[] BC01VJ13_n14454DtEnd ;
   private long[] BC01VJ13_A14455TotItem ;
   private boolean[] BC01VJ13_n14455TotItem ;
   private long[] BC01VJ13_A14456PrcItem ;
   private boolean[] BC01VJ13_n14456PrcItem ;
   private long[] BC01VJ13_A14457OkItem ;
   private boolean[] BC01VJ13_n14457OkItem ;
   private long[] BC01VJ13_A14458ErItem ;
   private boolean[] BC01VJ13_n14458ErItem ;
   private short[] BC01VJ13_A14459PrgPct ;
   private boolean[] BC01VJ13_n14459PrgPct ;
   private String[] BC01VJ13_A14460CurItem ;
   private boolean[] BC01VJ13_n14460CurItem ;
   private String[] BC01VJ13_A14437BasePath ;
   private boolean[] BC01VJ13_n14437BasePath ;
   private String[] BC01VJ13_A14462OutPath ;
   private boolean[] BC01VJ13_n14462OutPath ;
   private String[] BC01VJ13_A14463ZipPath ;
   private boolean[] BC01VJ13_n14463ZipPath ;
   private String[] BC01VJ13_A14464ZipUrl ;
   private boolean[] BC01VJ13_n14464ZipUrl ;
   private String[] BC01VJ13_A14466LockId ;
   private boolean[] BC01VJ13_n14466LockId ;
   private java.util.Date[] BC01VJ13_A14467LockDt ;
   private boolean[] BC01VJ13_n14467LockDt ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] BC01VJ2_A14465LastErr ;
   private java.util.UUID[] BC01VJ2_A14423JobId ;
   private String[] BC01VJ2_A14485JobDesc ;
   private String[] BC01VJ2_A14424JobType ;
   private String[] BC01VJ2_A14484JobExec ;
   private String[] BC01VJ2_A14450JobStat ;
   private String[] BC01VJ2_A14451UsrCreat ;
   private String[] BC01VJ2_A14488UsrSocket ;
   private java.util.Date[] BC01VJ2_A14452DtCreat ;
   private java.util.Date[] BC01VJ2_A14453DtStart ;
   private java.util.Date[] BC01VJ2_A14454DtEnd ;
   private long[] BC01VJ2_A14455TotItem ;
   private long[] BC01VJ2_A14456PrcItem ;
   private long[] BC01VJ2_A14457OkItem ;
   private long[] BC01VJ2_A14458ErItem ;
   private short[] BC01VJ2_A14459PrgPct ;
   private String[] BC01VJ2_A14460CurItem ;
   private String[] BC01VJ2_A14437BasePath ;
   private String[] BC01VJ2_A14462OutPath ;
   private String[] BC01VJ2_A14463ZipPath ;
   private String[] BC01VJ2_A14464ZipUrl ;
   private String[] BC01VJ2_A14466LockId ;
   private java.util.Date[] BC01VJ2_A14467LockDt ;
   private String[] BC01VJ3_A14465LastErr ;
   private java.util.UUID[] BC01VJ3_A14423JobId ;
   private String[] BC01VJ3_A14485JobDesc ;
   private String[] BC01VJ3_A14424JobType ;
   private String[] BC01VJ3_A14484JobExec ;
   private String[] BC01VJ3_A14450JobStat ;
   private String[] BC01VJ3_A14451UsrCreat ;
   private String[] BC01VJ3_A14488UsrSocket ;
   private java.util.Date[] BC01VJ3_A14452DtCreat ;
   private java.util.Date[] BC01VJ3_A14453DtStart ;
   private java.util.Date[] BC01VJ3_A14454DtEnd ;
   private long[] BC01VJ3_A14455TotItem ;
   private long[] BC01VJ3_A14456PrcItem ;
   private long[] BC01VJ3_A14457OkItem ;
   private long[] BC01VJ3_A14458ErItem ;
   private short[] BC01VJ3_A14459PrgPct ;
   private String[] BC01VJ3_A14460CurItem ;
   private String[] BC01VJ3_A14437BasePath ;
   private String[] BC01VJ3_A14462OutPath ;
   private String[] BC01VJ3_A14463ZipPath ;
   private String[] BC01VJ3_A14464ZipUrl ;
   private String[] BC01VJ3_A14466LockId ;
   private java.util.Date[] BC01VJ3_A14467LockDt ;
   private boolean[] BC01VJ2_n14465LastErr ;
   private boolean[] BC01VJ2_n14485JobDesc ;
   private boolean[] BC01VJ2_n14424JobType ;
   private boolean[] BC01VJ2_n14484JobExec ;
   private boolean[] BC01VJ2_n14450JobStat ;
   private boolean[] BC01VJ2_n14451UsrCreat ;
   private boolean[] BC01VJ2_n14488UsrSocket ;
   private boolean[] BC01VJ2_n14452DtCreat ;
   private boolean[] BC01VJ2_n14453DtStart ;
   private boolean[] BC01VJ2_n14454DtEnd ;
   private boolean[] BC01VJ2_n14455TotItem ;
   private boolean[] BC01VJ2_n14456PrcItem ;
   private boolean[] BC01VJ2_n14457OkItem ;
   private boolean[] BC01VJ2_n14458ErItem ;
   private boolean[] BC01VJ2_n14459PrgPct ;
   private boolean[] BC01VJ2_n14460CurItem ;
   private boolean[] BC01VJ2_n14437BasePath ;
   private boolean[] BC01VJ2_n14462OutPath ;
   private boolean[] BC01VJ2_n14463ZipPath ;
   private boolean[] BC01VJ2_n14464ZipUrl ;
   private boolean[] BC01VJ2_n14466LockId ;
   private boolean[] BC01VJ2_n14467LockDt ;
   private boolean[] BC01VJ3_n14465LastErr ;
   private boolean[] BC01VJ3_n14485JobDesc ;
   private boolean[] BC01VJ3_n14424JobType ;
   private boolean[] BC01VJ3_n14484JobExec ;
   private boolean[] BC01VJ3_n14450JobStat ;
   private boolean[] BC01VJ3_n14451UsrCreat ;
   private boolean[] BC01VJ3_n14488UsrSocket ;
   private boolean[] BC01VJ3_n14452DtCreat ;
   private boolean[] BC01VJ3_n14453DtStart ;
   private boolean[] BC01VJ3_n14454DtEnd ;
   private boolean[] BC01VJ3_n14455TotItem ;
   private boolean[] BC01VJ3_n14456PrcItem ;
   private boolean[] BC01VJ3_n14457OkItem ;
   private boolean[] BC01VJ3_n14458ErItem ;
   private boolean[] BC01VJ3_n14459PrgPct ;
   private boolean[] BC01VJ3_n14460CurItem ;
   private boolean[] BC01VJ3_n14437BasePath ;
   private boolean[] BC01VJ3_n14462OutPath ;
   private boolean[] BC01VJ3_n14463ZipPath ;
   private boolean[] BC01VJ3_n14464ZipUrl ;
   private boolean[] BC01VJ3_n14466LockId ;
   private boolean[] BC01VJ3_n14467LockDt ;
}

final  class job_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class job_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class job_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class job_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01VJ2", "SELECT LastErr, JobId, JobDesc, JobType, JobExec, JobStat, UsrCreat, UsrSocket, DtCreat, DtStart, DtEnd, TotItem, PrcItem, OkItem, ErItem, PrgPct, CurItem, BasePath, OutPath, ZipPath, ZipUrl, LockId, LockDt FROM TXPJOB WHERE JobId = ?  FOR UPDATE OF JobDesc, JobType, JobExec, JobStat, UsrCreat, UsrSocket, DtCreat, DtStart, DtEnd, TotItem, PrcItem, OkItem, ErItem, PrgPct, CurItem, BasePath, OutPath, ZipPath, ZipUrl, LastErr, LockId, LockDt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VJ3", "SELECT LastErr, JobId, JobDesc, JobType, JobExec, JobStat, UsrCreat, UsrSocket, DtCreat, DtStart, DtEnd, TotItem, PrcItem, OkItem, ErItem, PrgPct, CurItem, BasePath, OutPath, ZipPath, ZipUrl, LockId, LockDt FROM TXPJOB WHERE JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VJ4", "SELECT /*+ FIRST_ROWS(100) */ TM1.LastErr, TM1.JobId, TM1.JobDesc, TM1.JobType, TM1.JobExec, TM1.JobStat, TM1.UsrCreat, TM1.UsrSocket, TM1.DtCreat, TM1.DtStart, TM1.DtEnd, TM1.TotItem, TM1.PrcItem, TM1.OkItem, TM1.ErItem, TM1.PrgPct, TM1.CurItem, TM1.BasePath, TM1.OutPath, TM1.ZipPath, TM1.ZipUrl, TM1.LockId, TM1.LockDt FROM TXPJOB TM1 WHERE TM1.JobId = ? ORDER BY TM1.JobId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VJ5", "SELECT /*+ FIRST_ROWS(1) */ JobId FROM TXPJOB WHERE JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VJ6", "SELECT LastErr, JobId, JobDesc, JobType, JobExec, JobStat, UsrCreat, UsrSocket, DtCreat, DtStart, DtEnd, TotItem, PrcItem, OkItem, ErItem, PrgPct, CurItem, BasePath, OutPath, ZipPath, ZipUrl, LockId, LockDt FROM TXPJOB WHERE JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VJ7", "SELECT LastErr, JobId, JobDesc, JobType, JobExec, JobStat, UsrCreat, UsrSocket, DtCreat, DtStart, DtEnd, TotItem, PrcItem, OkItem, ErItem, PrgPct, CurItem, BasePath, OutPath, ZipPath, ZipUrl, LockId, LockDt FROM TXPJOB WHERE JobId = ?  FOR UPDATE OF JobDesc, JobType, JobExec, JobStat, UsrCreat, UsrSocket, DtCreat, DtStart, DtEnd, TotItem, PrcItem, OkItem, ErItem, PrgPct, CurItem, BasePath, OutPath, ZipPath, ZipUrl, LastErr, LockId, LockDt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01VJ8", "INSERT INTO TXPJOB(JobId, JobDesc, JobType, JobExec, JobStat, UsrCreat, UsrSocket, DtCreat, DtStart, DtEnd, TotItem, PrcItem, OkItem, ErItem, PrgPct, CurItem, BasePath, OutPath, ZipPath, ZipUrl, LastErr, LockId, LockDt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPJOB")
         ,new UpdateCursor("BC01VJ9", "UPDATE TXPJOB SET JobDesc=?, JobType=?, JobExec=?, JobStat=?, UsrCreat=?, UsrSocket=?, DtCreat=?, DtStart=?, DtEnd=?, TotItem=?, PrcItem=?, OkItem=?, ErItem=?, PrgPct=?, CurItem=?, BasePath=?, OutPath=?, ZipPath=?, ZipUrl=?, LastErr=?, LockId=?, LockDt=?  WHERE JobId = ?", GX_NOMASK, "TXPJOB")
         ,new UpdateCursor("BC01VJ10", "DELETE FROM TXPJOB  WHERE JobId = ?", GX_NOMASK, "TXPJOB")
         ,new ForEachCursor("BC01VJ11", "SELECT * FROM (SELECT JobId, ParKey FROM TXPJOBPAR WHERE JobId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01VJ12", "SELECT * FROM (SELECT ItmId, JobId FROM TXPJOBITE WHERE JobId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01VJ13", "SELECT /*+ FIRST_ROWS(100) */ TM1.LastErr, TM1.JobId, TM1.JobDesc, TM1.JobType, TM1.JobExec, TM1.JobStat, TM1.UsrCreat, TM1.UsrSocket, TM1.DtCreat, TM1.DtStart, TM1.DtEnd, TM1.TotItem, TM1.PrcItem, TM1.OkItem, TM1.ErItem, TM1.PrgPct, TM1.CurItem, TM1.BasePath, TM1.OutPath, TM1.ZipPath, TM1.ZipUrl, TM1.LockId, TM1.LockDt FROM TXPJOB TM1 WHERE TM1.JobId = ? ORDER BY TM1.JobId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.UUID[]) buf[2])[0] = rslt.getGUID(2);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[2])[0] = rslt.getGUID(2);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[2])[0] = rslt.getGUID(2);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[2])[0] = rslt.getGUID(2);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[2])[0] = rslt.getGUID(2);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.UUID[]) buf[1])[0] = rslt.getGUID(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[2])[0] = rslt.getGUID(2);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
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
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 2 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 3 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 4 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 5 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 6 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 100);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 30);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[6], 100);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 20);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 60);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 100);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[14], false);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[16], false);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[18], false);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[20]).longValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[22]).longValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(13, ((Number) parms[24]).longValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(14, ((Number) parms[26]).longValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 100);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 200);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 200);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 200);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[38], 200);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(21, (String)parms[40]);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[42], 100);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(23, (java.util.Date)parms[44], false);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 100);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 100);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 20);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 60);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 100);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[19]).longValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[21]).longValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[23]).longValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(13, ((Number) parms[25]).longValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 100);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 200);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 200);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 200);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 200);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(20, (String)parms[39]);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 100);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[43], false);
               }
               stmt.setGUID(23, (java.util.UUID)parms[44]);
               return;
            case 8 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 9 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 10 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 11 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
      }
   }

}

