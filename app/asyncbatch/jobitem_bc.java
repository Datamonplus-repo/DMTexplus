package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class jobitem_bc extends GXWebPanel implements IGxSilentTrn
{
   public jobitem_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public jobitem_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( jobitem_bc.class ));
   }

   public jobitem_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1VK1908( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1VK1908( ) ;
      standaloneModal( ) ;
      addRow1VK1908( ) ;
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
            Z14468ItmId = A14468ItmId ;
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

   public void confirm_1VK0( )
   {
      beforeValidate1VK1908( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1VK1908( ) ;
         }
         else
         {
            checkExtendedTable1VK1908( ) ;
            if ( AnyError == 0 )
            {
               zm1VK1908( 3) ;
            }
            closeExtendedTableCursors1VK1908( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm1VK1908( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         Z14470DocId = A14470DocId ;
         Z14471DocLbl = A14471DocLbl ;
         Z14472ItmSts = A14472ItmSts ;
         Z14473RetryQt = A14473RetryQt ;
         Z14481ItmDtStart = A14481ItmDtStart ;
         Z14482ItmDtEnd = A14482ItmDtEnd ;
         Z14486ItmErr = A14486ItmErr ;
         Z14474OutFile = A14474OutFile ;
         Z14476FileNm = A14476FileNm ;
      }
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         Z14424JobType = A14424JobType ;
      }
      if ( GX_JID == -2 )
      {
         Z14468ItmId = A14468ItmId ;
         Z14470DocId = A14470DocId ;
         Z14471DocLbl = A14471DocLbl ;
         Z14472ItmSts = A14472ItmSts ;
         Z14473RetryQt = A14473RetryQt ;
         Z14481ItmDtStart = A14481ItmDtStart ;
         Z14482ItmDtEnd = A14482ItmDtEnd ;
         Z14486ItmErr = A14486ItmErr ;
         Z14474OutFile = A14474OutFile ;
         Z14475OutUrl = A14475OutUrl ;
         Z14476FileNm = A14476FileNm ;
         Z14423JobId = A14423JobId ;
         Z14424JobType = A14424JobType ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1VK1908( )
   {
      /* Using cursor BC01VK5 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14468ItmId), A14423JobId});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1908 = (short)(1) ;
         A14475OutUrl = BC01VK5_A14475OutUrl[0] ;
         n14475OutUrl = BC01VK5_n14475OutUrl[0] ;
         A14424JobType = BC01VK5_A14424JobType[0] ;
         n14424JobType = BC01VK5_n14424JobType[0] ;
         A14470DocId = BC01VK5_A14470DocId[0] ;
         n14470DocId = BC01VK5_n14470DocId[0] ;
         A14471DocLbl = BC01VK5_A14471DocLbl[0] ;
         n14471DocLbl = BC01VK5_n14471DocLbl[0] ;
         A14472ItmSts = BC01VK5_A14472ItmSts[0] ;
         n14472ItmSts = BC01VK5_n14472ItmSts[0] ;
         A14473RetryQt = BC01VK5_A14473RetryQt[0] ;
         n14473RetryQt = BC01VK5_n14473RetryQt[0] ;
         A14481ItmDtStart = BC01VK5_A14481ItmDtStart[0] ;
         n14481ItmDtStart = BC01VK5_n14481ItmDtStart[0] ;
         A14482ItmDtEnd = BC01VK5_A14482ItmDtEnd[0] ;
         n14482ItmDtEnd = BC01VK5_n14482ItmDtEnd[0] ;
         A14486ItmErr = BC01VK5_A14486ItmErr[0] ;
         n14486ItmErr = BC01VK5_n14486ItmErr[0] ;
         A14474OutFile = BC01VK5_A14474OutFile[0] ;
         n14474OutFile = BC01VK5_n14474OutFile[0] ;
         A14476FileNm = BC01VK5_A14476FileNm[0] ;
         n14476FileNm = BC01VK5_n14476FileNm[0] ;
         zm1VK1908( -2) ;
      }
      pr_default.close(3);
      onLoadActions1VK1908( ) ;
   }

   public void onLoadActions1VK1908( )
   {
   }

   public void checkExtendedTable1VK1908( )
   {
      nIsDirty_1908 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC01VK6 */
      pr_default.execute(4, new Object[] {A14423JobId});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "JOB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "JOBID");
         AnyError = (short)(1) ;
      }
      A14424JobType = BC01VK6_A14424JobType[0] ;
      n14424JobType = BC01VK6_n14424JobType[0] ;
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1VK1908( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void getKey1VK1908( )
   {
      /* Using cursor BC01VK7 */
      pr_default.execute(5, new Object[] {Long.valueOf(A14468ItmId), A14423JobId});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1908 = (short)(1) ;
      }
      else
      {
         RcdFound1908 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01VK8 */
      pr_default.execute(6, new Object[] {Long.valueOf(A14468ItmId), A14423JobId});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm1VK1908( 2) ;
         RcdFound1908 = (short)(1) ;
         A14475OutUrl = BC01VK8_A14475OutUrl[0] ;
         n14475OutUrl = BC01VK8_n14475OutUrl[0] ;
         A14468ItmId = BC01VK8_A14468ItmId[0] ;
         A14470DocId = BC01VK8_A14470DocId[0] ;
         n14470DocId = BC01VK8_n14470DocId[0] ;
         A14471DocLbl = BC01VK8_A14471DocLbl[0] ;
         n14471DocLbl = BC01VK8_n14471DocLbl[0] ;
         A14472ItmSts = BC01VK8_A14472ItmSts[0] ;
         n14472ItmSts = BC01VK8_n14472ItmSts[0] ;
         A14473RetryQt = BC01VK8_A14473RetryQt[0] ;
         n14473RetryQt = BC01VK8_n14473RetryQt[0] ;
         A14481ItmDtStart = BC01VK8_A14481ItmDtStart[0] ;
         n14481ItmDtStart = BC01VK8_n14481ItmDtStart[0] ;
         A14482ItmDtEnd = BC01VK8_A14482ItmDtEnd[0] ;
         n14482ItmDtEnd = BC01VK8_n14482ItmDtEnd[0] ;
         A14486ItmErr = BC01VK8_A14486ItmErr[0] ;
         n14486ItmErr = BC01VK8_n14486ItmErr[0] ;
         A14474OutFile = BC01VK8_A14474OutFile[0] ;
         n14474OutFile = BC01VK8_n14474OutFile[0] ;
         A14476FileNm = BC01VK8_A14476FileNm[0] ;
         n14476FileNm = BC01VK8_n14476FileNm[0] ;
         A14423JobId = BC01VK8_A14423JobId[0] ;
         Z14468ItmId = A14468ItmId ;
         Z14423JobId = A14423JobId ;
         sMode1908 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1VK1908( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1908 = (short)(0) ;
            initializeNonKey1VK1908( ) ;
         }
         Gx_mode = sMode1908 ;
      }
      else
      {
         RcdFound1908 = (short)(0) ;
         initializeNonKey1VK1908( ) ;
         sMode1908 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode1908 ;
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1VK1908( ) ;
      if ( RcdFound1908 == 0 )
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
      confirm_1VK0( ) ;
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

   public void checkOptimisticConcurrency1VK1908( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01VK9 */
         pr_default.execute(7, new Object[] {Long.valueOf(A14468ItmId), A14423JobId});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPJOBITE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(7) == 101) || ( Z14470DocId != BC01VK9_A14470DocId[0] ) || ( GXutil.strcmp(Z14471DocLbl, BC01VK9_A14471DocLbl[0]) != 0 ) || ( GXutil.strcmp(Z14472ItmSts, BC01VK9_A14472ItmSts[0]) != 0 ) || ( Z14473RetryQt != BC01VK9_A14473RetryQt[0] ) || !( GXutil.dateCompare(Z14481ItmDtStart, BC01VK9_A14481ItmDtStart[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z14482ItmDtEnd, BC01VK9_A14482ItmDtEnd[0]) ) || ( GXutil.strcmp(Z14486ItmErr, BC01VK9_A14486ItmErr[0]) != 0 ) || ( GXutil.strcmp(Z14474OutFile, BC01VK9_A14474OutFile[0]) != 0 ) || ( GXutil.strcmp(Z14476FileNm, BC01VK9_A14476FileNm[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPJOBITE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1VK1908( )
   {
      beforeValidate1VK1908( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VK1908( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1VK1908( 0) ;
         checkOptimisticConcurrency1VK1908( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VK1908( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1VK1908( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01VK10 */
                  pr_default.execute(8, new Object[] {Long.valueOf(A14468ItmId), Boolean.valueOf(n14470DocId), Long.valueOf(A14470DocId), Boolean.valueOf(n14471DocLbl), A14471DocLbl, Boolean.valueOf(n14472ItmSts), A14472ItmSts, Boolean.valueOf(n14473RetryQt), Short.valueOf(A14473RetryQt), Boolean.valueOf(n14481ItmDtStart), A14481ItmDtStart, Boolean.valueOf(n14482ItmDtEnd), A14482ItmDtEnd, Boolean.valueOf(n14486ItmErr), A14486ItmErr, Boolean.valueOf(n14474OutFile), A14474OutFile, Boolean.valueOf(n14475OutUrl), A14475OutUrl, Boolean.valueOf(n14476FileNm), A14476FileNm, A14423JobId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOBITE");
                  if ( (pr_default.getStatus(8) == 1) )
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
            load1VK1908( ) ;
         }
         endLevel1VK1908( ) ;
      }
      closeExtendedTableCursors1VK1908( ) ;
   }

   public void update1VK1908( )
   {
      beforeValidate1VK1908( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VK1908( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VK1908( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VK1908( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1VK1908( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01VK11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n14470DocId), Long.valueOf(A14470DocId), Boolean.valueOf(n14471DocLbl), A14471DocLbl, Boolean.valueOf(n14472ItmSts), A14472ItmSts, Boolean.valueOf(n14473RetryQt), Short.valueOf(A14473RetryQt), Boolean.valueOf(n14481ItmDtStart), A14481ItmDtStart, Boolean.valueOf(n14482ItmDtEnd), A14482ItmDtEnd, Boolean.valueOf(n14486ItmErr), A14486ItmErr, Boolean.valueOf(n14474OutFile), A14474OutFile, Boolean.valueOf(n14475OutUrl), A14475OutUrl, Boolean.valueOf(n14476FileNm), A14476FileNm, Long.valueOf(A14468ItmId), A14423JobId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOBITE");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPJOBITE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1VK1908( ) ;
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
         endLevel1VK1908( ) ;
      }
      closeExtendedTableCursors1VK1908( ) ;
   }

   public void deferredUpdate1VK1908( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1VK1908( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VK1908( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1VK1908( ) ;
         afterConfirm1VK1908( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1VK1908( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01VK12 */
               pr_default.execute(10, new Object[] {Long.valueOf(A14468ItmId), A14423JobId});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOBITE");
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
      sMode1908 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1VK1908( ) ;
      Gx_mode = sMode1908 ;
   }

   public void onDeleteControls1VK1908( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC01VK13 */
         pr_default.execute(11, new Object[] {A14423JobId});
         A14424JobType = BC01VK13_A14424JobType[0] ;
         n14424JobType = BC01VK13_n14424JobType[0] ;
         pr_default.close(11);
      }
   }

   public void endLevel1VK1908( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1VK1908( ) ;
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

   public void scanKeyStart1VK1908( )
   {
      /* Using cursor BC01VK14 */
      pr_default.execute(12, new Object[] {Long.valueOf(A14468ItmId), A14423JobId});
      RcdFound1908 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1908 = (short)(1) ;
         A14475OutUrl = BC01VK14_A14475OutUrl[0] ;
         n14475OutUrl = BC01VK14_n14475OutUrl[0] ;
         A14468ItmId = BC01VK14_A14468ItmId[0] ;
         A14424JobType = BC01VK14_A14424JobType[0] ;
         n14424JobType = BC01VK14_n14424JobType[0] ;
         A14470DocId = BC01VK14_A14470DocId[0] ;
         n14470DocId = BC01VK14_n14470DocId[0] ;
         A14471DocLbl = BC01VK14_A14471DocLbl[0] ;
         n14471DocLbl = BC01VK14_n14471DocLbl[0] ;
         A14472ItmSts = BC01VK14_A14472ItmSts[0] ;
         n14472ItmSts = BC01VK14_n14472ItmSts[0] ;
         A14473RetryQt = BC01VK14_A14473RetryQt[0] ;
         n14473RetryQt = BC01VK14_n14473RetryQt[0] ;
         A14481ItmDtStart = BC01VK14_A14481ItmDtStart[0] ;
         n14481ItmDtStart = BC01VK14_n14481ItmDtStart[0] ;
         A14482ItmDtEnd = BC01VK14_A14482ItmDtEnd[0] ;
         n14482ItmDtEnd = BC01VK14_n14482ItmDtEnd[0] ;
         A14486ItmErr = BC01VK14_A14486ItmErr[0] ;
         n14486ItmErr = BC01VK14_n14486ItmErr[0] ;
         A14474OutFile = BC01VK14_A14474OutFile[0] ;
         n14474OutFile = BC01VK14_n14474OutFile[0] ;
         A14476FileNm = BC01VK14_A14476FileNm[0] ;
         n14476FileNm = BC01VK14_n14476FileNm[0] ;
         A14423JobId = BC01VK14_A14423JobId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1VK1908( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1908 = (short)(0) ;
      scanKeyLoad1VK1908( ) ;
   }

   public void scanKeyLoad1VK1908( )
   {
      sMode1908 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1908 = (short)(1) ;
         A14475OutUrl = BC01VK14_A14475OutUrl[0] ;
         n14475OutUrl = BC01VK14_n14475OutUrl[0] ;
         A14468ItmId = BC01VK14_A14468ItmId[0] ;
         A14424JobType = BC01VK14_A14424JobType[0] ;
         n14424JobType = BC01VK14_n14424JobType[0] ;
         A14470DocId = BC01VK14_A14470DocId[0] ;
         n14470DocId = BC01VK14_n14470DocId[0] ;
         A14471DocLbl = BC01VK14_A14471DocLbl[0] ;
         n14471DocLbl = BC01VK14_n14471DocLbl[0] ;
         A14472ItmSts = BC01VK14_A14472ItmSts[0] ;
         n14472ItmSts = BC01VK14_n14472ItmSts[0] ;
         A14473RetryQt = BC01VK14_A14473RetryQt[0] ;
         n14473RetryQt = BC01VK14_n14473RetryQt[0] ;
         A14481ItmDtStart = BC01VK14_A14481ItmDtStart[0] ;
         n14481ItmDtStart = BC01VK14_n14481ItmDtStart[0] ;
         A14482ItmDtEnd = BC01VK14_A14482ItmDtEnd[0] ;
         n14482ItmDtEnd = BC01VK14_n14482ItmDtEnd[0] ;
         A14486ItmErr = BC01VK14_A14486ItmErr[0] ;
         n14486ItmErr = BC01VK14_n14486ItmErr[0] ;
         A14474OutFile = BC01VK14_A14474OutFile[0] ;
         n14474OutFile = BC01VK14_n14474OutFile[0] ;
         A14476FileNm = BC01VK14_A14476FileNm[0] ;
         n14476FileNm = BC01VK14_n14476FileNm[0] ;
         A14423JobId = BC01VK14_A14423JobId[0] ;
      }
      Gx_mode = sMode1908 ;
   }

   public void scanKeyEnd1VK1908( )
   {
      pr_default.close(12);
   }

   public void afterConfirm1VK1908( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1VK1908( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1VK1908( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1VK1908( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1VK1908( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1VK1908( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1VK1908( )
   {
   }

   public void send_integrity_lvl_hashes1VK1908( )
   {
   }

   public void addRow1VK1908( )
   {
      VarsToRow1908( bcasyncbatch_JOBITEM) ;
   }

   public void readRow1VK1908( )
   {
      RowToVars1908( bcasyncbatch_JOBITEM, 1) ;
   }

   public void initializeNonKey1VK1908( )
   {
      A14424JobType = "" ;
      n14424JobType = false ;
      A14470DocId = 0 ;
      n14470DocId = false ;
      A14471DocLbl = "" ;
      n14471DocLbl = false ;
      A14472ItmSts = "" ;
      n14472ItmSts = false ;
      A14473RetryQt = (short)(0) ;
      n14473RetryQt = false ;
      A14481ItmDtStart = GXutil.resetTime( GXutil.nullDate() );
      n14481ItmDtStart = false ;
      A14482ItmDtEnd = GXutil.resetTime( GXutil.nullDate() );
      n14482ItmDtEnd = false ;
      A14486ItmErr = "" ;
      n14486ItmErr = false ;
      A14474OutFile = "" ;
      n14474OutFile = false ;
      A14475OutUrl = "" ;
      n14475OutUrl = false ;
      A14476FileNm = "" ;
      n14476FileNm = false ;
      Z14470DocId = 0 ;
      Z14471DocLbl = "" ;
      Z14472ItmSts = "" ;
      Z14473RetryQt = (short)(0) ;
      Z14481ItmDtStart = GXutil.resetTime( GXutil.nullDate() );
      Z14482ItmDtEnd = GXutil.resetTime( GXutil.nullDate() );
      Z14486ItmErr = "" ;
      Z14474OutFile = "" ;
      Z14476FileNm = "" ;
   }

   public void initAll1VK1908( )
   {
      A14468ItmId = 0 ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      initializeNonKey1VK1908( ) ;
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

   public void VarsToRow1908( app.asyncbatch.SdtJOBITEM obj1908 )
   {
      obj1908.setgxTv_SdtJOBITEM_Mode( Gx_mode );
      obj1908.setgxTv_SdtJOBITEM_Jobtype( A14424JobType );
      obj1908.setgxTv_SdtJOBITEM_Docid( A14470DocId );
      obj1908.setgxTv_SdtJOBITEM_Doclbl( A14471DocLbl );
      obj1908.setgxTv_SdtJOBITEM_Itmsts( A14472ItmSts );
      obj1908.setgxTv_SdtJOBITEM_Retryqt( A14473RetryQt );
      obj1908.setgxTv_SdtJOBITEM_Itmdtstart( A14481ItmDtStart );
      obj1908.setgxTv_SdtJOBITEM_Itmdtend( A14482ItmDtEnd );
      obj1908.setgxTv_SdtJOBITEM_Itmerr( A14486ItmErr );
      obj1908.setgxTv_SdtJOBITEM_Outfile( A14474OutFile );
      obj1908.setgxTv_SdtJOBITEM_Outurl( A14475OutUrl );
      obj1908.setgxTv_SdtJOBITEM_Filenm( A14476FileNm );
      obj1908.setgxTv_SdtJOBITEM_Itmid( A14468ItmId );
      obj1908.setgxTv_SdtJOBITEM_Jobid( A14423JobId );
      obj1908.setgxTv_SdtJOBITEM_Jobid_Z( Z14423JobId );
      obj1908.setgxTv_SdtJOBITEM_Itmid_Z( Z14468ItmId );
      obj1908.setgxTv_SdtJOBITEM_Jobtype_Z( Z14424JobType );
      obj1908.setgxTv_SdtJOBITEM_Docid_Z( Z14470DocId );
      obj1908.setgxTv_SdtJOBITEM_Doclbl_Z( Z14471DocLbl );
      obj1908.setgxTv_SdtJOBITEM_Itmsts_Z( Z14472ItmSts );
      obj1908.setgxTv_SdtJOBITEM_Retryqt_Z( Z14473RetryQt );
      obj1908.setgxTv_SdtJOBITEM_Itmdtstart_Z( Z14481ItmDtStart );
      obj1908.setgxTv_SdtJOBITEM_Itmdtend_Z( Z14482ItmDtEnd );
      obj1908.setgxTv_SdtJOBITEM_Itmerr_Z( Z14486ItmErr );
      obj1908.setgxTv_SdtJOBITEM_Outfile_Z( Z14474OutFile );
      obj1908.setgxTv_SdtJOBITEM_Filenm_Z( Z14476FileNm );
      obj1908.setgxTv_SdtJOBITEM_Jobtype_N( (byte)((byte)((n14424JobType)?1:0)) );
      obj1908.setgxTv_SdtJOBITEM_Docid_N( (byte)((byte)((n14470DocId)?1:0)) );
      obj1908.setgxTv_SdtJOBITEM_Doclbl_N( (byte)((byte)((n14471DocLbl)?1:0)) );
      obj1908.setgxTv_SdtJOBITEM_Itmsts_N( (byte)((byte)((n14472ItmSts)?1:0)) );
      obj1908.setgxTv_SdtJOBITEM_Retryqt_N( (byte)((byte)((n14473RetryQt)?1:0)) );
      obj1908.setgxTv_SdtJOBITEM_Itmdtstart_N( (byte)((byte)((n14481ItmDtStart)?1:0)) );
      obj1908.setgxTv_SdtJOBITEM_Itmdtend_N( (byte)((byte)((n14482ItmDtEnd)?1:0)) );
      obj1908.setgxTv_SdtJOBITEM_Itmerr_N( (byte)((byte)((n14486ItmErr)?1:0)) );
      obj1908.setgxTv_SdtJOBITEM_Outfile_N( (byte)((byte)((n14474OutFile)?1:0)) );
      obj1908.setgxTv_SdtJOBITEM_Outurl_N( (byte)((byte)((n14475OutUrl)?1:0)) );
      obj1908.setgxTv_SdtJOBITEM_Filenm_N( (byte)((byte)((n14476FileNm)?1:0)) );
      obj1908.setgxTv_SdtJOBITEM_Mode( Gx_mode );
   }

   public void KeyVarsToRow1908( app.asyncbatch.SdtJOBITEM obj1908 )
   {
      obj1908.setgxTv_SdtJOBITEM_Itmid( A14468ItmId );
      obj1908.setgxTv_SdtJOBITEM_Jobid( A14423JobId );
   }

   public void RowToVars1908( app.asyncbatch.SdtJOBITEM obj1908 ,
                              int forceLoad )
   {
      Gx_mode = obj1908.getgxTv_SdtJOBITEM_Mode() ;
      A14424JobType = obj1908.getgxTv_SdtJOBITEM_Jobtype() ;
      n14424JobType = false ;
      A14470DocId = obj1908.getgxTv_SdtJOBITEM_Docid() ;
      n14470DocId = false ;
      A14471DocLbl = obj1908.getgxTv_SdtJOBITEM_Doclbl() ;
      n14471DocLbl = false ;
      A14472ItmSts = obj1908.getgxTv_SdtJOBITEM_Itmsts() ;
      n14472ItmSts = false ;
      A14473RetryQt = obj1908.getgxTv_SdtJOBITEM_Retryqt() ;
      n14473RetryQt = false ;
      A14481ItmDtStart = obj1908.getgxTv_SdtJOBITEM_Itmdtstart() ;
      n14481ItmDtStart = false ;
      A14482ItmDtEnd = obj1908.getgxTv_SdtJOBITEM_Itmdtend() ;
      n14482ItmDtEnd = false ;
      A14486ItmErr = obj1908.getgxTv_SdtJOBITEM_Itmerr() ;
      n14486ItmErr = false ;
      A14474OutFile = obj1908.getgxTv_SdtJOBITEM_Outfile() ;
      n14474OutFile = false ;
      A14475OutUrl = obj1908.getgxTv_SdtJOBITEM_Outurl() ;
      n14475OutUrl = false ;
      A14476FileNm = obj1908.getgxTv_SdtJOBITEM_Filenm() ;
      n14476FileNm = false ;
      A14468ItmId = obj1908.getgxTv_SdtJOBITEM_Itmid() ;
      A14423JobId = obj1908.getgxTv_SdtJOBITEM_Jobid() ;
      Z14423JobId = obj1908.getgxTv_SdtJOBITEM_Jobid_Z() ;
      Z14468ItmId = obj1908.getgxTv_SdtJOBITEM_Itmid_Z() ;
      Z14424JobType = obj1908.getgxTv_SdtJOBITEM_Jobtype_Z() ;
      Z14470DocId = obj1908.getgxTv_SdtJOBITEM_Docid_Z() ;
      Z14471DocLbl = obj1908.getgxTv_SdtJOBITEM_Doclbl_Z() ;
      Z14472ItmSts = obj1908.getgxTv_SdtJOBITEM_Itmsts_Z() ;
      Z14473RetryQt = obj1908.getgxTv_SdtJOBITEM_Retryqt_Z() ;
      Z14481ItmDtStart = obj1908.getgxTv_SdtJOBITEM_Itmdtstart_Z() ;
      Z14482ItmDtEnd = obj1908.getgxTv_SdtJOBITEM_Itmdtend_Z() ;
      Z14486ItmErr = obj1908.getgxTv_SdtJOBITEM_Itmerr_Z() ;
      Z14474OutFile = obj1908.getgxTv_SdtJOBITEM_Outfile_Z() ;
      Z14476FileNm = obj1908.getgxTv_SdtJOBITEM_Filenm_Z() ;
      n14424JobType = (boolean)((obj1908.getgxTv_SdtJOBITEM_Jobtype_N()==0)?false:true) ;
      n14470DocId = (boolean)((obj1908.getgxTv_SdtJOBITEM_Docid_N()==0)?false:true) ;
      n14471DocLbl = (boolean)((obj1908.getgxTv_SdtJOBITEM_Doclbl_N()==0)?false:true) ;
      n14472ItmSts = (boolean)((obj1908.getgxTv_SdtJOBITEM_Itmsts_N()==0)?false:true) ;
      n14473RetryQt = (boolean)((obj1908.getgxTv_SdtJOBITEM_Retryqt_N()==0)?false:true) ;
      n14481ItmDtStart = (boolean)((obj1908.getgxTv_SdtJOBITEM_Itmdtstart_N()==0)?false:true) ;
      n14482ItmDtEnd = (boolean)((obj1908.getgxTv_SdtJOBITEM_Itmdtend_N()==0)?false:true) ;
      n14486ItmErr = (boolean)((obj1908.getgxTv_SdtJOBITEM_Itmerr_N()==0)?false:true) ;
      n14474OutFile = (boolean)((obj1908.getgxTv_SdtJOBITEM_Outfile_N()==0)?false:true) ;
      n14475OutUrl = (boolean)((obj1908.getgxTv_SdtJOBITEM_Outurl_N()==0)?false:true) ;
      n14476FileNm = (boolean)((obj1908.getgxTv_SdtJOBITEM_Filenm_N()==0)?false:true) ;
      Gx_mode = obj1908.getgxTv_SdtJOBITEM_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A14468ItmId = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      A14423JobId = (java.util.UUID)getParm(obj,0) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1VK1908( ) ;
      scanKeyStart1VK1908( ) ;
      if ( RcdFound1908 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01VK15 */
         pr_default.execute(13, new Object[] {A14423JobId});
         if ( (pr_default.getStatus(13) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "JOB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "JOBID");
            AnyError = (short)(1) ;
         }
         A14424JobType = BC01VK15_A14424JobType[0] ;
         n14424JobType = BC01VK15_n14424JobType[0] ;
         pr_default.close(13);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z14468ItmId = A14468ItmId ;
         Z14423JobId = A14423JobId ;
      }
      zm1VK1908( -2) ;
      onLoadActions1VK1908( ) ;
      addRow1VK1908( ) ;
      scanKeyEnd1VK1908( ) ;
      if ( RcdFound1908 == 0 )
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
      RowToVars1908( bcasyncbatch_JOBITEM, 0) ;
      scanKeyStart1VK1908( ) ;
      if ( RcdFound1908 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01VK16 */
         pr_default.execute(14, new Object[] {A14423JobId});
         if ( (pr_default.getStatus(14) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "JOB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "JOBID");
            AnyError = (short)(1) ;
         }
         A14424JobType = BC01VK16_A14424JobType[0] ;
         n14424JobType = BC01VK16_n14424JobType[0] ;
         pr_default.close(14);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z14468ItmId = A14468ItmId ;
         Z14423JobId = A14423JobId ;
      }
      zm1VK1908( -2) ;
      onLoadActions1VK1908( ) ;
      addRow1VK1908( ) ;
      scanKeyEnd1VK1908( ) ;
      if ( RcdFound1908 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1VK1908( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1VK1908( ) ;
      }
      else
      {
         if ( RcdFound1908 == 1 )
         {
            if ( ( A14468ItmId != Z14468ItmId ) || !( A14423JobId.equals( Z14423JobId ) ) )
            {
               A14468ItmId = Z14468ItmId ;
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
               update1VK1908( ) ;
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
               if ( ( A14468ItmId != Z14468ItmId ) || !( A14423JobId.equals( Z14423JobId ) ) )
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
                     insert1VK1908( ) ;
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
                     insert1VK1908( ) ;
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
      RowToVars1908( bcasyncbatch_JOBITEM, 1) ;
      saveImpl( ) ;
      VarsToRow1908( bcasyncbatch_JOBITEM) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars1908( bcasyncbatch_JOBITEM, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1VK1908( ) ;
      afterTrn( ) ;
      VarsToRow1908( bcasyncbatch_JOBITEM) ;
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
         app.asyncbatch.SdtJOBITEM auxBC = new app.asyncbatch.SdtJOBITEM( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A14423JobId, A14468ItmId);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcasyncbatch_JOBITEM);
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
      RowToVars1908( bcasyncbatch_JOBITEM, 1) ;
      updateImpl( ) ;
      VarsToRow1908( bcasyncbatch_JOBITEM) ;
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
      RowToVars1908( bcasyncbatch_JOBITEM, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1VK1908( ) ;
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
      VarsToRow1908( bcasyncbatch_JOBITEM) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1908( bcasyncbatch_JOBITEM, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1VK1908( ) ;
      if ( RcdFound1908 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A14468ItmId != Z14468ItmId ) || !( A14423JobId.equals( Z14423JobId ) ) )
         {
            A14468ItmId = Z14468ItmId ;
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
         if ( ( A14468ItmId != Z14468ItmId ) || !( A14423JobId.equals( Z14423JobId ) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "asyncbatch.jobitem_bc");
      VarsToRow1908( bcasyncbatch_JOBITEM) ;
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
      Gx_mode = bcasyncbatch_JOBITEM.getgxTv_SdtJOBITEM_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcasyncbatch_JOBITEM.setgxTv_SdtJOBITEM_Mode( Gx_mode );
   }

   public void SetSDT( app.asyncbatch.SdtJOBITEM sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcasyncbatch_JOBITEM )
      {
         bcasyncbatch_JOBITEM = sdt ;
         if ( GXutil.strcmp(bcasyncbatch_JOBITEM.getgxTv_SdtJOBITEM_Mode(), "") == 0 )
         {
            bcasyncbatch_JOBITEM.setgxTv_SdtJOBITEM_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow1908( bcasyncbatch_JOBITEM) ;
         }
         else
         {
            RowToVars1908( bcasyncbatch_JOBITEM, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcasyncbatch_JOBITEM.getgxTv_SdtJOBITEM_Mode(), "") == 0 )
         {
            bcasyncbatch_JOBITEM.setgxTv_SdtJOBITEM_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars1908( bcasyncbatch_JOBITEM, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtJOBITEM getJOBITEM_BC( )
   {
      return bcasyncbatch_JOBITEM ;
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
      Z14471DocLbl = "" ;
      A14471DocLbl = "" ;
      Z14472ItmSts = "" ;
      A14472ItmSts = "" ;
      Z14481ItmDtStart = GXutil.resetTime( GXutil.nullDate() );
      A14481ItmDtStart = GXutil.resetTime( GXutil.nullDate() );
      Z14482ItmDtEnd = GXutil.resetTime( GXutil.nullDate() );
      A14482ItmDtEnd = GXutil.resetTime( GXutil.nullDate() );
      Z14486ItmErr = "" ;
      A14486ItmErr = "" ;
      Z14474OutFile = "" ;
      A14474OutFile = "" ;
      Z14476FileNm = "" ;
      A14476FileNm = "" ;
      Z14424JobType = "" ;
      A14424JobType = "" ;
      Z14475OutUrl = "" ;
      A14475OutUrl = "" ;
      BC01VK5_A14475OutUrl = new String[] {""} ;
      BC01VK5_n14475OutUrl = new boolean[] {false} ;
      BC01VK5_A14468ItmId = new long[1] ;
      BC01VK5_A14424JobType = new String[] {""} ;
      BC01VK5_n14424JobType = new boolean[] {false} ;
      BC01VK5_A14470DocId = new long[1] ;
      BC01VK5_n14470DocId = new boolean[] {false} ;
      BC01VK5_A14471DocLbl = new String[] {""} ;
      BC01VK5_n14471DocLbl = new boolean[] {false} ;
      BC01VK5_A14472ItmSts = new String[] {""} ;
      BC01VK5_n14472ItmSts = new boolean[] {false} ;
      BC01VK5_A14473RetryQt = new short[1] ;
      BC01VK5_n14473RetryQt = new boolean[] {false} ;
      BC01VK5_A14481ItmDtStart = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VK5_n14481ItmDtStart = new boolean[] {false} ;
      BC01VK5_A14482ItmDtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VK5_n14482ItmDtEnd = new boolean[] {false} ;
      BC01VK5_A14486ItmErr = new String[] {""} ;
      BC01VK5_n14486ItmErr = new boolean[] {false} ;
      BC01VK5_A14474OutFile = new String[] {""} ;
      BC01VK5_n14474OutFile = new boolean[] {false} ;
      BC01VK5_A14476FileNm = new String[] {""} ;
      BC01VK5_n14476FileNm = new boolean[] {false} ;
      BC01VK5_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      BC01VK6_A14424JobType = new String[] {""} ;
      BC01VK6_n14424JobType = new boolean[] {false} ;
      BC01VK7_A14468ItmId = new long[1] ;
      BC01VK7_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      BC01VK8_A14475OutUrl = new String[] {""} ;
      BC01VK8_n14475OutUrl = new boolean[] {false} ;
      BC01VK8_A14468ItmId = new long[1] ;
      BC01VK8_A14470DocId = new long[1] ;
      BC01VK8_n14470DocId = new boolean[] {false} ;
      BC01VK8_A14471DocLbl = new String[] {""} ;
      BC01VK8_n14471DocLbl = new boolean[] {false} ;
      BC01VK8_A14472ItmSts = new String[] {""} ;
      BC01VK8_n14472ItmSts = new boolean[] {false} ;
      BC01VK8_A14473RetryQt = new short[1] ;
      BC01VK8_n14473RetryQt = new boolean[] {false} ;
      BC01VK8_A14481ItmDtStart = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VK8_n14481ItmDtStart = new boolean[] {false} ;
      BC01VK8_A14482ItmDtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VK8_n14482ItmDtEnd = new boolean[] {false} ;
      BC01VK8_A14486ItmErr = new String[] {""} ;
      BC01VK8_n14486ItmErr = new boolean[] {false} ;
      BC01VK8_A14474OutFile = new String[] {""} ;
      BC01VK8_n14474OutFile = new boolean[] {false} ;
      BC01VK8_A14476FileNm = new String[] {""} ;
      BC01VK8_n14476FileNm = new boolean[] {false} ;
      BC01VK8_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      sMode1908 = "" ;
      BC01VK9_A14475OutUrl = new String[] {""} ;
      BC01VK9_n14475OutUrl = new boolean[] {false} ;
      BC01VK9_A14468ItmId = new long[1] ;
      BC01VK9_A14470DocId = new long[1] ;
      BC01VK9_n14470DocId = new boolean[] {false} ;
      BC01VK9_A14471DocLbl = new String[] {""} ;
      BC01VK9_n14471DocLbl = new boolean[] {false} ;
      BC01VK9_A14472ItmSts = new String[] {""} ;
      BC01VK9_n14472ItmSts = new boolean[] {false} ;
      BC01VK9_A14473RetryQt = new short[1] ;
      BC01VK9_n14473RetryQt = new boolean[] {false} ;
      BC01VK9_A14481ItmDtStart = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VK9_n14481ItmDtStart = new boolean[] {false} ;
      BC01VK9_A14482ItmDtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VK9_n14482ItmDtEnd = new boolean[] {false} ;
      BC01VK9_A14486ItmErr = new String[] {""} ;
      BC01VK9_n14486ItmErr = new boolean[] {false} ;
      BC01VK9_A14474OutFile = new String[] {""} ;
      BC01VK9_n14474OutFile = new boolean[] {false} ;
      BC01VK9_A14476FileNm = new String[] {""} ;
      BC01VK9_n14476FileNm = new boolean[] {false} ;
      BC01VK9_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      BC01VK13_A14424JobType = new String[] {""} ;
      BC01VK13_n14424JobType = new boolean[] {false} ;
      BC01VK14_A14475OutUrl = new String[] {""} ;
      BC01VK14_n14475OutUrl = new boolean[] {false} ;
      BC01VK14_A14468ItmId = new long[1] ;
      BC01VK14_A14424JobType = new String[] {""} ;
      BC01VK14_n14424JobType = new boolean[] {false} ;
      BC01VK14_A14470DocId = new long[1] ;
      BC01VK14_n14470DocId = new boolean[] {false} ;
      BC01VK14_A14471DocLbl = new String[] {""} ;
      BC01VK14_n14471DocLbl = new boolean[] {false} ;
      BC01VK14_A14472ItmSts = new String[] {""} ;
      BC01VK14_n14472ItmSts = new boolean[] {false} ;
      BC01VK14_A14473RetryQt = new short[1] ;
      BC01VK14_n14473RetryQt = new boolean[] {false} ;
      BC01VK14_A14481ItmDtStart = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VK14_n14481ItmDtStart = new boolean[] {false} ;
      BC01VK14_A14482ItmDtEnd = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VK14_n14482ItmDtEnd = new boolean[] {false} ;
      BC01VK14_A14486ItmErr = new String[] {""} ;
      BC01VK14_n14486ItmErr = new boolean[] {false} ;
      BC01VK14_A14474OutFile = new String[] {""} ;
      BC01VK14_n14474OutFile = new boolean[] {false} ;
      BC01VK14_A14476FileNm = new String[] {""} ;
      BC01VK14_n14476FileNm = new boolean[] {false} ;
      BC01VK14_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC01VK15_A14424JobType = new String[] {""} ;
      BC01VK15_n14424JobType = new boolean[] {false} ;
      BC01VK16_A14424JobType = new String[] {""} ;
      BC01VK16_n14424JobType = new boolean[] {false} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.jobitem_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.jobitem_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.jobitem_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.jobitem_bc__default(),
         new Object[] {
             new Object[] {
            BC01VK2_A14475OutUrl, BC01VK2_n14475OutUrl, BC01VK2_A14468ItmId, BC01VK2_A14470DocId, BC01VK2_n14470DocId, BC01VK2_A14471DocLbl, BC01VK2_n14471DocLbl, BC01VK2_A14472ItmSts, BC01VK2_n14472ItmSts, BC01VK2_A14473RetryQt,
            BC01VK2_n14473RetryQt, BC01VK2_A14481ItmDtStart, BC01VK2_n14481ItmDtStart, BC01VK2_A14482ItmDtEnd, BC01VK2_n14482ItmDtEnd, BC01VK2_A14486ItmErr, BC01VK2_n14486ItmErr, BC01VK2_A14474OutFile, BC01VK2_n14474OutFile, BC01VK2_A14476FileNm,
            BC01VK2_n14476FileNm, BC01VK2_A14423JobId
            }
            , new Object[] {
            BC01VK3_A14475OutUrl, BC01VK3_n14475OutUrl, BC01VK3_A14468ItmId, BC01VK3_A14470DocId, BC01VK3_n14470DocId, BC01VK3_A14471DocLbl, BC01VK3_n14471DocLbl, BC01VK3_A14472ItmSts, BC01VK3_n14472ItmSts, BC01VK3_A14473RetryQt,
            BC01VK3_n14473RetryQt, BC01VK3_A14481ItmDtStart, BC01VK3_n14481ItmDtStart, BC01VK3_A14482ItmDtEnd, BC01VK3_n14482ItmDtEnd, BC01VK3_A14486ItmErr, BC01VK3_n14486ItmErr, BC01VK3_A14474OutFile, BC01VK3_n14474OutFile, BC01VK3_A14476FileNm,
            BC01VK3_n14476FileNm, BC01VK3_A14423JobId
            }
            , new Object[] {
            BC01VK4_A14424JobType, BC01VK4_n14424JobType
            }
            , new Object[] {
            BC01VK5_A14475OutUrl, BC01VK5_n14475OutUrl, BC01VK5_A14468ItmId, BC01VK5_A14424JobType, BC01VK5_n14424JobType, BC01VK5_A14470DocId, BC01VK5_n14470DocId, BC01VK5_A14471DocLbl, BC01VK5_n14471DocLbl, BC01VK5_A14472ItmSts,
            BC01VK5_n14472ItmSts, BC01VK5_A14473RetryQt, BC01VK5_n14473RetryQt, BC01VK5_A14481ItmDtStart, BC01VK5_n14481ItmDtStart, BC01VK5_A14482ItmDtEnd, BC01VK5_n14482ItmDtEnd, BC01VK5_A14486ItmErr, BC01VK5_n14486ItmErr, BC01VK5_A14474OutFile,
            BC01VK5_n14474OutFile, BC01VK5_A14476FileNm, BC01VK5_n14476FileNm, BC01VK5_A14423JobId
            }
            , new Object[] {
            BC01VK6_A14424JobType, BC01VK6_n14424JobType
            }
            , new Object[] {
            BC01VK7_A14468ItmId, BC01VK7_A14423JobId
            }
            , new Object[] {
            BC01VK8_A14475OutUrl, BC01VK8_n14475OutUrl, BC01VK8_A14468ItmId, BC01VK8_A14470DocId, BC01VK8_n14470DocId, BC01VK8_A14471DocLbl, BC01VK8_n14471DocLbl, BC01VK8_A14472ItmSts, BC01VK8_n14472ItmSts, BC01VK8_A14473RetryQt,
            BC01VK8_n14473RetryQt, BC01VK8_A14481ItmDtStart, BC01VK8_n14481ItmDtStart, BC01VK8_A14482ItmDtEnd, BC01VK8_n14482ItmDtEnd, BC01VK8_A14486ItmErr, BC01VK8_n14486ItmErr, BC01VK8_A14474OutFile, BC01VK8_n14474OutFile, BC01VK8_A14476FileNm,
            BC01VK8_n14476FileNm, BC01VK8_A14423JobId
            }
            , new Object[] {
            BC01VK9_A14475OutUrl, BC01VK9_n14475OutUrl, BC01VK9_A14468ItmId, BC01VK9_A14470DocId, BC01VK9_n14470DocId, BC01VK9_A14471DocLbl, BC01VK9_n14471DocLbl, BC01VK9_A14472ItmSts, BC01VK9_n14472ItmSts, BC01VK9_A14473RetryQt,
            BC01VK9_n14473RetryQt, BC01VK9_A14481ItmDtStart, BC01VK9_n14481ItmDtStart, BC01VK9_A14482ItmDtEnd, BC01VK9_n14482ItmDtEnd, BC01VK9_A14486ItmErr, BC01VK9_n14486ItmErr, BC01VK9_A14474OutFile, BC01VK9_n14474OutFile, BC01VK9_A14476FileNm,
            BC01VK9_n14476FileNm, BC01VK9_A14423JobId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01VK13_A14424JobType, BC01VK13_n14424JobType
            }
            , new Object[] {
            BC01VK14_A14475OutUrl, BC01VK14_n14475OutUrl, BC01VK14_A14468ItmId, BC01VK14_A14424JobType, BC01VK14_n14424JobType, BC01VK14_A14470DocId, BC01VK14_n14470DocId, BC01VK14_A14471DocLbl, BC01VK14_n14471DocLbl, BC01VK14_A14472ItmSts,
            BC01VK14_n14472ItmSts, BC01VK14_A14473RetryQt, BC01VK14_n14473RetryQt, BC01VK14_A14481ItmDtStart, BC01VK14_n14481ItmDtStart, BC01VK14_A14482ItmDtEnd, BC01VK14_n14482ItmDtEnd, BC01VK14_A14486ItmErr, BC01VK14_n14486ItmErr, BC01VK14_A14474OutFile,
            BC01VK14_n14474OutFile, BC01VK14_A14476FileNm, BC01VK14_n14476FileNm, BC01VK14_A14423JobId
            }
            , new Object[] {
            BC01VK15_A14424JobType, BC01VK15_n14424JobType
            }
            , new Object[] {
            BC01VK16_A14424JobType, BC01VK16_n14424JobType
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
   private short Z14473RetryQt ;
   private short A14473RetryQt ;
   private short RcdFound1908 ;
   private short nIsDirty_1908 ;
   private int trnEnded ;
   private int GX_JID ;
   private long Z14468ItmId ;
   private long A14468ItmId ;
   private long Z14470DocId ;
   private long A14470DocId ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1908 ;
   private java.util.Date Z14481ItmDtStart ;
   private java.util.Date A14481ItmDtStart ;
   private java.util.Date Z14482ItmDtEnd ;
   private java.util.Date A14482ItmDtEnd ;
   private boolean n14475OutUrl ;
   private boolean n14424JobType ;
   private boolean n14470DocId ;
   private boolean n14471DocLbl ;
   private boolean n14472ItmSts ;
   private boolean n14473RetryQt ;
   private boolean n14481ItmDtStart ;
   private boolean n14482ItmDtEnd ;
   private boolean n14486ItmErr ;
   private boolean n14474OutFile ;
   private boolean n14476FileNm ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private String Z14475OutUrl ;
   private String A14475OutUrl ;
   private String Z14471DocLbl ;
   private String A14471DocLbl ;
   private String Z14472ItmSts ;
   private String A14472ItmSts ;
   private String Z14486ItmErr ;
   private String A14486ItmErr ;
   private String Z14474OutFile ;
   private String A14474OutFile ;
   private String Z14476FileNm ;
   private String A14476FileNm ;
   private String Z14424JobType ;
   private String A14424JobType ;
   private java.util.UUID Z14423JobId ;
   private java.util.UUID A14423JobId ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private app.asyncbatch.SdtJOBITEM bcasyncbatch_JOBITEM ;
   private IDataStoreProvider pr_default ;
   private String[] BC01VK5_A14475OutUrl ;
   private boolean[] BC01VK5_n14475OutUrl ;
   private long[] BC01VK5_A14468ItmId ;
   private String[] BC01VK5_A14424JobType ;
   private boolean[] BC01VK5_n14424JobType ;
   private long[] BC01VK5_A14470DocId ;
   private boolean[] BC01VK5_n14470DocId ;
   private String[] BC01VK5_A14471DocLbl ;
   private boolean[] BC01VK5_n14471DocLbl ;
   private String[] BC01VK5_A14472ItmSts ;
   private boolean[] BC01VK5_n14472ItmSts ;
   private short[] BC01VK5_A14473RetryQt ;
   private boolean[] BC01VK5_n14473RetryQt ;
   private java.util.Date[] BC01VK5_A14481ItmDtStart ;
   private boolean[] BC01VK5_n14481ItmDtStart ;
   private java.util.Date[] BC01VK5_A14482ItmDtEnd ;
   private boolean[] BC01VK5_n14482ItmDtEnd ;
   private String[] BC01VK5_A14486ItmErr ;
   private boolean[] BC01VK5_n14486ItmErr ;
   private String[] BC01VK5_A14474OutFile ;
   private boolean[] BC01VK5_n14474OutFile ;
   private String[] BC01VK5_A14476FileNm ;
   private boolean[] BC01VK5_n14476FileNm ;
   private java.util.UUID[] BC01VK5_A14423JobId ;
   private String[] BC01VK6_A14424JobType ;
   private boolean[] BC01VK6_n14424JobType ;
   private long[] BC01VK7_A14468ItmId ;
   private java.util.UUID[] BC01VK7_A14423JobId ;
   private String[] BC01VK8_A14475OutUrl ;
   private boolean[] BC01VK8_n14475OutUrl ;
   private long[] BC01VK8_A14468ItmId ;
   private long[] BC01VK8_A14470DocId ;
   private boolean[] BC01VK8_n14470DocId ;
   private String[] BC01VK8_A14471DocLbl ;
   private boolean[] BC01VK8_n14471DocLbl ;
   private String[] BC01VK8_A14472ItmSts ;
   private boolean[] BC01VK8_n14472ItmSts ;
   private short[] BC01VK8_A14473RetryQt ;
   private boolean[] BC01VK8_n14473RetryQt ;
   private java.util.Date[] BC01VK8_A14481ItmDtStart ;
   private boolean[] BC01VK8_n14481ItmDtStart ;
   private java.util.Date[] BC01VK8_A14482ItmDtEnd ;
   private boolean[] BC01VK8_n14482ItmDtEnd ;
   private String[] BC01VK8_A14486ItmErr ;
   private boolean[] BC01VK8_n14486ItmErr ;
   private String[] BC01VK8_A14474OutFile ;
   private boolean[] BC01VK8_n14474OutFile ;
   private String[] BC01VK8_A14476FileNm ;
   private boolean[] BC01VK8_n14476FileNm ;
   private java.util.UUID[] BC01VK8_A14423JobId ;
   private String[] BC01VK9_A14475OutUrl ;
   private boolean[] BC01VK9_n14475OutUrl ;
   private long[] BC01VK9_A14468ItmId ;
   private long[] BC01VK9_A14470DocId ;
   private boolean[] BC01VK9_n14470DocId ;
   private String[] BC01VK9_A14471DocLbl ;
   private boolean[] BC01VK9_n14471DocLbl ;
   private String[] BC01VK9_A14472ItmSts ;
   private boolean[] BC01VK9_n14472ItmSts ;
   private short[] BC01VK9_A14473RetryQt ;
   private boolean[] BC01VK9_n14473RetryQt ;
   private java.util.Date[] BC01VK9_A14481ItmDtStart ;
   private boolean[] BC01VK9_n14481ItmDtStart ;
   private java.util.Date[] BC01VK9_A14482ItmDtEnd ;
   private boolean[] BC01VK9_n14482ItmDtEnd ;
   private String[] BC01VK9_A14486ItmErr ;
   private boolean[] BC01VK9_n14486ItmErr ;
   private String[] BC01VK9_A14474OutFile ;
   private boolean[] BC01VK9_n14474OutFile ;
   private String[] BC01VK9_A14476FileNm ;
   private boolean[] BC01VK9_n14476FileNm ;
   private java.util.UUID[] BC01VK9_A14423JobId ;
   private String[] BC01VK13_A14424JobType ;
   private boolean[] BC01VK13_n14424JobType ;
   private String[] BC01VK14_A14475OutUrl ;
   private boolean[] BC01VK14_n14475OutUrl ;
   private long[] BC01VK14_A14468ItmId ;
   private String[] BC01VK14_A14424JobType ;
   private boolean[] BC01VK14_n14424JobType ;
   private long[] BC01VK14_A14470DocId ;
   private boolean[] BC01VK14_n14470DocId ;
   private String[] BC01VK14_A14471DocLbl ;
   private boolean[] BC01VK14_n14471DocLbl ;
   private String[] BC01VK14_A14472ItmSts ;
   private boolean[] BC01VK14_n14472ItmSts ;
   private short[] BC01VK14_A14473RetryQt ;
   private boolean[] BC01VK14_n14473RetryQt ;
   private java.util.Date[] BC01VK14_A14481ItmDtStart ;
   private boolean[] BC01VK14_n14481ItmDtStart ;
   private java.util.Date[] BC01VK14_A14482ItmDtEnd ;
   private boolean[] BC01VK14_n14482ItmDtEnd ;
   private String[] BC01VK14_A14486ItmErr ;
   private boolean[] BC01VK14_n14486ItmErr ;
   private String[] BC01VK14_A14474OutFile ;
   private boolean[] BC01VK14_n14474OutFile ;
   private String[] BC01VK14_A14476FileNm ;
   private boolean[] BC01VK14_n14476FileNm ;
   private java.util.UUID[] BC01VK14_A14423JobId ;
   private String[] BC01VK15_A14424JobType ;
   private boolean[] BC01VK15_n14424JobType ;
   private String[] BC01VK16_A14424JobType ;
   private boolean[] BC01VK16_n14424JobType ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] BC01VK2_A14475OutUrl ;
   private long[] BC01VK2_A14468ItmId ;
   private long[] BC01VK2_A14470DocId ;
   private String[] BC01VK2_A14471DocLbl ;
   private String[] BC01VK2_A14472ItmSts ;
   private short[] BC01VK2_A14473RetryQt ;
   private java.util.Date[] BC01VK2_A14481ItmDtStart ;
   private java.util.Date[] BC01VK2_A14482ItmDtEnd ;
   private String[] BC01VK2_A14486ItmErr ;
   private String[] BC01VK2_A14474OutFile ;
   private String[] BC01VK2_A14476FileNm ;
   private java.util.UUID[] BC01VK2_A14423JobId ;
   private String[] BC01VK3_A14475OutUrl ;
   private long[] BC01VK3_A14468ItmId ;
   private long[] BC01VK3_A14470DocId ;
   private String[] BC01VK3_A14471DocLbl ;
   private String[] BC01VK3_A14472ItmSts ;
   private short[] BC01VK3_A14473RetryQt ;
   private java.util.Date[] BC01VK3_A14481ItmDtStart ;
   private java.util.Date[] BC01VK3_A14482ItmDtEnd ;
   private String[] BC01VK3_A14486ItmErr ;
   private String[] BC01VK3_A14474OutFile ;
   private String[] BC01VK3_A14476FileNm ;
   private java.util.UUID[] BC01VK3_A14423JobId ;
   private String[] BC01VK4_A14424JobType ;
   private boolean[] BC01VK2_n14475OutUrl ;
   private boolean[] BC01VK2_n14470DocId ;
   private boolean[] BC01VK2_n14471DocLbl ;
   private boolean[] BC01VK2_n14472ItmSts ;
   private boolean[] BC01VK2_n14473RetryQt ;
   private boolean[] BC01VK2_n14481ItmDtStart ;
   private boolean[] BC01VK2_n14482ItmDtEnd ;
   private boolean[] BC01VK2_n14486ItmErr ;
   private boolean[] BC01VK2_n14474OutFile ;
   private boolean[] BC01VK2_n14476FileNm ;
   private boolean[] BC01VK3_n14475OutUrl ;
   private boolean[] BC01VK3_n14470DocId ;
   private boolean[] BC01VK3_n14471DocLbl ;
   private boolean[] BC01VK3_n14472ItmSts ;
   private boolean[] BC01VK3_n14473RetryQt ;
   private boolean[] BC01VK3_n14481ItmDtStart ;
   private boolean[] BC01VK3_n14482ItmDtEnd ;
   private boolean[] BC01VK3_n14486ItmErr ;
   private boolean[] BC01VK3_n14474OutFile ;
   private boolean[] BC01VK3_n14476FileNm ;
   private boolean[] BC01VK4_n14424JobType ;
}

final  class jobitem_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class jobitem_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class jobitem_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class jobitem_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01VK2", "SELECT OutUrl, ItmId, DocId, DocLbl, ItmSts, RetryQt, ItmDtStart, ItmDtEnd, ItmErr, OutFile, FileNm, JobId FROM TXPJOBITE WHERE ItmId = ? AND JobId = ?  FOR UPDATE OF DocId, DocLbl, ItmSts, RetryQt, ItmDtStart, ItmDtEnd, ItmErr, OutFile, OutUrl, FileNm NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VK3", "SELECT OutUrl, ItmId, DocId, DocLbl, ItmSts, RetryQt, ItmDtStart, ItmDtEnd, ItmErr, OutFile, FileNm, JobId FROM TXPJOBITE WHERE ItmId = ? AND JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VK4", "SELECT JobType FROM TXPJOB WHERE JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VK5", "SELECT /*+ FIRST_ROWS(100) */ TM1.OutUrl, TM1.ItmId, T2.JobType, TM1.DocId, TM1.DocLbl, TM1.ItmSts, TM1.RetryQt, TM1.ItmDtStart, TM1.ItmDtEnd, TM1.ItmErr, TM1.OutFile, TM1.FileNm, TM1.JobId FROM (TXPJOBITE TM1 INNER JOIN TXPJOB T2 ON T2.JobId = TM1.JobId) WHERE TM1.ItmId = ? and TM1.JobId = ? ORDER BY TM1.ItmId, TM1.JobId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VK6", "SELECT JobType FROM TXPJOB WHERE JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VK7", "SELECT /*+ FIRST_ROWS(1) */ ItmId, JobId FROM TXPJOBITE WHERE ItmId = ? AND JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VK8", "SELECT OutUrl, ItmId, DocId, DocLbl, ItmSts, RetryQt, ItmDtStart, ItmDtEnd, ItmErr, OutFile, FileNm, JobId FROM TXPJOBITE WHERE ItmId = ? AND JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VK9", "SELECT OutUrl, ItmId, DocId, DocLbl, ItmSts, RetryQt, ItmDtStart, ItmDtEnd, ItmErr, OutFile, FileNm, JobId FROM TXPJOBITE WHERE ItmId = ? AND JobId = ?  FOR UPDATE OF DocId, DocLbl, ItmSts, RetryQt, ItmDtStart, ItmDtEnd, ItmErr, OutFile, OutUrl, FileNm NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01VK10", "INSERT INTO TXPJOBITE(ItmId, DocId, DocLbl, ItmSts, RetryQt, ItmDtStart, ItmDtEnd, ItmErr, OutFile, OutUrl, FileNm, JobId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPJOBITE")
         ,new UpdateCursor("BC01VK11", "UPDATE TXPJOBITE SET DocId=?, DocLbl=?, ItmSts=?, RetryQt=?, ItmDtStart=?, ItmDtEnd=?, ItmErr=?, OutFile=?, OutUrl=?, FileNm=?  WHERE ItmId = ? AND JobId = ?", GX_NOMASK, "TXPJOBITE")
         ,new UpdateCursor("BC01VK12", "DELETE FROM TXPJOBITE  WHERE ItmId = ? AND JobId = ?", GX_NOMASK, "TXPJOBITE")
         ,new ForEachCursor("BC01VK13", "SELECT JobType FROM TXPJOB WHERE JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VK14", "SELECT /*+ FIRST_ROWS(100) */ TM1.OutUrl, TM1.ItmId, T2.JobType, TM1.DocId, TM1.DocLbl, TM1.ItmSts, TM1.RetryQt, TM1.ItmDtStart, TM1.ItmDtEnd, TM1.ItmErr, TM1.OutFile, TM1.FileNm, TM1.JobId FROM (TXPJOBITE TM1 INNER JOIN TXPJOB T2 ON T2.JobId = TM1.JobId) WHERE TM1.ItmId = ? and TM1.JobId = ? ORDER BY TM1.ItmId, TM1.JobId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VK15", "SELECT JobType FROM TXPJOB WHERE JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VK16", "SELECT JobType FROM TXPJOB WHERE JobId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[21])[0] = rslt.getGUID(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[21])[0] = rslt.getGUID(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[23])[0] = rslt.getGUID(13);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.UUID[]) buf[1])[0] = rslt.getGUID(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[21])[0] = rslt.getGUID(12);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[21])[0] = rslt.getGUID(12);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[23])[0] = rslt.getGUID(13);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setGUID(2, (java.util.UUID)parms[1]);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setGUID(2, (java.util.UUID)parms[1]);
               return;
            case 2 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setGUID(2, (java.util.UUID)parms[1]);
               return;
            case 4 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setGUID(2, (java.util.UUID)parms[1]);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setGUID(2, (java.util.UUID)parms[1]);
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setGUID(2, (java.util.UUID)parms[1]);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 100);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[6], 30);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[10], false);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[12], false);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 100);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 100);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(10, (String)parms[18]);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 100);
               }
               stmt.setGUID(12, (java.util.UUID)parms[21]);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 100);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
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
                  stmt.setVarchar(8, (String)parms[15], 100);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(9, (String)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 100);
               }
               stmt.setLong(11, ((Number) parms[20]).longValue());
               stmt.setGUID(12, (java.util.UUID)parms[21]);
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setGUID(2, (java.util.UUID)parms[1]);
               return;
            case 11 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setGUID(2, (java.util.UUID)parms[1]);
               return;
            case 13 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 14 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
      }
   }

}

