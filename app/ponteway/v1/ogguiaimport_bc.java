package app.ponteway.v1 ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ogguiaimport_bc extends GXWebPanel implements IGxSilentTrn
{
   public ogguiaimport_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ogguiaimport_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ogguiaimport_bc.class ));
   }

   public ogguiaimport_bc( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1VY1912( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1VY1912( ) ;
      standaloneModal( ) ;
      addRow1VY1912( ) ;
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
            Z14503ogLinha = A14503ogLinha ;
            Z14504ogEmprCod = A14504ogEmprCod ;
            Z14505ogCliCod = A14505ogCliCod ;
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

   public void confirm_1VY0( )
   {
      beforeValidate1VY1912( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1VY1912( ) ;
         }
         else
         {
            checkExtendedTable1VY1912( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1VY1912( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm1VY1912( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z14522ogNmrGuia = A14522ogNmrGuia ;
         Z14523ogSerie = A14523ogSerie ;
         Z14506ogFecha = A14506ogFecha ;
         Z14507ogCodArt = A14507ogCodArt ;
         Z14508ogRolos = A14508ogRolos ;
         Z14556ogRolos_ = A14556ogRolos_ ;
         Z14509ogQuant = A14509ogQuant ;
         Z14557ogQuant_ = A14557ogQuant_ ;
         Z14510ogUnidad = A14510ogUnidad ;
         Z14558ogUnidad_ = A14558ogUnidad_ ;
         Z14528ogReferen = A14528ogReferen ;
         Z14511ogReclam = A14511ogReclam ;
         Z14518ogLote = A14518ogLote ;
         Z14512ogJogo = A14512ogJogo ;
         Z14513ogPoleg = A14513ogPoleg ;
         Z14514ogFio = A14514ogFio ;
         Z14560ogFio_ = A14560ogFio_ ;
         Z14515ogMaqui = A14515ogMaqui ;
         Z14516ogEntrada = A14516ogEntrada ;
         Z14517ogVossaR = A14517ogVossaR ;
         Z14519ogArtiCR = A14519ogArtiCR ;
         Z14520ogArtiAC = A14520ogArtiAC ;
         Z14521ogARecCod = A14521ogARecCod ;
         Z14554ogLocaliza = A14554ogLocaliza ;
         Z14559ogLocalizc = A14559ogLocalizc ;
      }
      if ( GX_JID == -1 )
      {
         Z14503ogLinha = A14503ogLinha ;
         Z14504ogEmprCod = A14504ogEmprCod ;
         Z14505ogCliCod = A14505ogCliCod ;
         Z14522ogNmrGuia = A14522ogNmrGuia ;
         Z14523ogSerie = A14523ogSerie ;
         Z14506ogFecha = A14506ogFecha ;
         Z14507ogCodArt = A14507ogCodArt ;
         Z14508ogRolos = A14508ogRolos ;
         Z14556ogRolos_ = A14556ogRolos_ ;
         Z14509ogQuant = A14509ogQuant ;
         Z14557ogQuant_ = A14557ogQuant_ ;
         Z14510ogUnidad = A14510ogUnidad ;
         Z14558ogUnidad_ = A14558ogUnidad_ ;
         Z14528ogReferen = A14528ogReferen ;
         Z14511ogReclam = A14511ogReclam ;
         Z14518ogLote = A14518ogLote ;
         Z14512ogJogo = A14512ogJogo ;
         Z14513ogPoleg = A14513ogPoleg ;
         Z14514ogFio = A14514ogFio ;
         Z14560ogFio_ = A14560ogFio_ ;
         Z14515ogMaqui = A14515ogMaqui ;
         Z14516ogEntrada = A14516ogEntrada ;
         Z14517ogVossaR = A14517ogVossaR ;
         Z14519ogArtiCR = A14519ogArtiCR ;
         Z14520ogArtiAC = A14520ogArtiAC ;
         Z14521ogARecCod = A14521ogARecCod ;
         Z14554ogLocaliza = A14554ogLocaliza ;
         Z14559ogLocalizc = A14559ogLocalizc ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1VY1912( )
   {
      /* Using cursor BC01VY4 */
      pr_default.execute(2, new Object[] {Long.valueOf(A14503ogLinha), A14504ogEmprCod, Long.valueOf(A14505ogCliCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1912 = (short)(1) ;
         A14522ogNmrGuia = BC01VY4_A14522ogNmrGuia[0] ;
         n14522ogNmrGuia = BC01VY4_n14522ogNmrGuia[0] ;
         A14523ogSerie = BC01VY4_A14523ogSerie[0] ;
         n14523ogSerie = BC01VY4_n14523ogSerie[0] ;
         A14506ogFecha = BC01VY4_A14506ogFecha[0] ;
         n14506ogFecha = BC01VY4_n14506ogFecha[0] ;
         A14507ogCodArt = BC01VY4_A14507ogCodArt[0] ;
         n14507ogCodArt = BC01VY4_n14507ogCodArt[0] ;
         A14508ogRolos = BC01VY4_A14508ogRolos[0] ;
         n14508ogRolos = BC01VY4_n14508ogRolos[0] ;
         A14556ogRolos_ = BC01VY4_A14556ogRolos_[0] ;
         n14556ogRolos_ = BC01VY4_n14556ogRolos_[0] ;
         A14509ogQuant = BC01VY4_A14509ogQuant[0] ;
         n14509ogQuant = BC01VY4_n14509ogQuant[0] ;
         A14557ogQuant_ = BC01VY4_A14557ogQuant_[0] ;
         n14557ogQuant_ = BC01VY4_n14557ogQuant_[0] ;
         A14510ogUnidad = BC01VY4_A14510ogUnidad[0] ;
         n14510ogUnidad = BC01VY4_n14510ogUnidad[0] ;
         A14558ogUnidad_ = BC01VY4_A14558ogUnidad_[0] ;
         n14558ogUnidad_ = BC01VY4_n14558ogUnidad_[0] ;
         A14528ogReferen = BC01VY4_A14528ogReferen[0] ;
         n14528ogReferen = BC01VY4_n14528ogReferen[0] ;
         A14511ogReclam = BC01VY4_A14511ogReclam[0] ;
         n14511ogReclam = BC01VY4_n14511ogReclam[0] ;
         A14518ogLote = BC01VY4_A14518ogLote[0] ;
         n14518ogLote = BC01VY4_n14518ogLote[0] ;
         A14512ogJogo = BC01VY4_A14512ogJogo[0] ;
         n14512ogJogo = BC01VY4_n14512ogJogo[0] ;
         A14513ogPoleg = BC01VY4_A14513ogPoleg[0] ;
         n14513ogPoleg = BC01VY4_n14513ogPoleg[0] ;
         A14514ogFio = BC01VY4_A14514ogFio[0] ;
         n14514ogFio = BC01VY4_n14514ogFio[0] ;
         A14560ogFio_ = BC01VY4_A14560ogFio_[0] ;
         n14560ogFio_ = BC01VY4_n14560ogFio_[0] ;
         A14515ogMaqui = BC01VY4_A14515ogMaqui[0] ;
         n14515ogMaqui = BC01VY4_n14515ogMaqui[0] ;
         A14516ogEntrada = BC01VY4_A14516ogEntrada[0] ;
         n14516ogEntrada = BC01VY4_n14516ogEntrada[0] ;
         A14517ogVossaR = BC01VY4_A14517ogVossaR[0] ;
         n14517ogVossaR = BC01VY4_n14517ogVossaR[0] ;
         A14519ogArtiCR = BC01VY4_A14519ogArtiCR[0] ;
         n14519ogArtiCR = BC01VY4_n14519ogArtiCR[0] ;
         A14520ogArtiAC = BC01VY4_A14520ogArtiAC[0] ;
         n14520ogArtiAC = BC01VY4_n14520ogArtiAC[0] ;
         A14521ogARecCod = BC01VY4_A14521ogARecCod[0] ;
         n14521ogARecCod = BC01VY4_n14521ogARecCod[0] ;
         A14554ogLocaliza = BC01VY4_A14554ogLocaliza[0] ;
         n14554ogLocaliza = BC01VY4_n14554ogLocaliza[0] ;
         A14559ogLocalizc = BC01VY4_A14559ogLocalizc[0] ;
         n14559ogLocalizc = BC01VY4_n14559ogLocalizc[0] ;
         zm1VY1912( -1) ;
      }
      pr_default.close(2);
      onLoadActions1VY1912( ) ;
   }

   public void onLoadActions1VY1912( )
   {
   }

   public void checkExtendedTable1VY1912( )
   {
      nIsDirty_1912 = (short)(0) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1VY1912( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1VY1912( )
   {
      /* Using cursor BC01VY5 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14503ogLinha), A14504ogEmprCod, Long.valueOf(A14505ogCliCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1912 = (short)(1) ;
      }
      else
      {
         RcdFound1912 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01VY6 */
      pr_default.execute(4, new Object[] {Long.valueOf(A14503ogLinha), A14504ogEmprCod, Long.valueOf(A14505ogCliCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1VY1912( 1) ;
         RcdFound1912 = (short)(1) ;
         A14503ogLinha = BC01VY6_A14503ogLinha[0] ;
         A14504ogEmprCod = BC01VY6_A14504ogEmprCod[0] ;
         A14505ogCliCod = BC01VY6_A14505ogCliCod[0] ;
         A14522ogNmrGuia = BC01VY6_A14522ogNmrGuia[0] ;
         n14522ogNmrGuia = BC01VY6_n14522ogNmrGuia[0] ;
         A14523ogSerie = BC01VY6_A14523ogSerie[0] ;
         n14523ogSerie = BC01VY6_n14523ogSerie[0] ;
         A14506ogFecha = BC01VY6_A14506ogFecha[0] ;
         n14506ogFecha = BC01VY6_n14506ogFecha[0] ;
         A14507ogCodArt = BC01VY6_A14507ogCodArt[0] ;
         n14507ogCodArt = BC01VY6_n14507ogCodArt[0] ;
         A14508ogRolos = BC01VY6_A14508ogRolos[0] ;
         n14508ogRolos = BC01VY6_n14508ogRolos[0] ;
         A14556ogRolos_ = BC01VY6_A14556ogRolos_[0] ;
         n14556ogRolos_ = BC01VY6_n14556ogRolos_[0] ;
         A14509ogQuant = BC01VY6_A14509ogQuant[0] ;
         n14509ogQuant = BC01VY6_n14509ogQuant[0] ;
         A14557ogQuant_ = BC01VY6_A14557ogQuant_[0] ;
         n14557ogQuant_ = BC01VY6_n14557ogQuant_[0] ;
         A14510ogUnidad = BC01VY6_A14510ogUnidad[0] ;
         n14510ogUnidad = BC01VY6_n14510ogUnidad[0] ;
         A14558ogUnidad_ = BC01VY6_A14558ogUnidad_[0] ;
         n14558ogUnidad_ = BC01VY6_n14558ogUnidad_[0] ;
         A14528ogReferen = BC01VY6_A14528ogReferen[0] ;
         n14528ogReferen = BC01VY6_n14528ogReferen[0] ;
         A14511ogReclam = BC01VY6_A14511ogReclam[0] ;
         n14511ogReclam = BC01VY6_n14511ogReclam[0] ;
         A14518ogLote = BC01VY6_A14518ogLote[0] ;
         n14518ogLote = BC01VY6_n14518ogLote[0] ;
         A14512ogJogo = BC01VY6_A14512ogJogo[0] ;
         n14512ogJogo = BC01VY6_n14512ogJogo[0] ;
         A14513ogPoleg = BC01VY6_A14513ogPoleg[0] ;
         n14513ogPoleg = BC01VY6_n14513ogPoleg[0] ;
         A14514ogFio = BC01VY6_A14514ogFio[0] ;
         n14514ogFio = BC01VY6_n14514ogFio[0] ;
         A14560ogFio_ = BC01VY6_A14560ogFio_[0] ;
         n14560ogFio_ = BC01VY6_n14560ogFio_[0] ;
         A14515ogMaqui = BC01VY6_A14515ogMaqui[0] ;
         n14515ogMaqui = BC01VY6_n14515ogMaqui[0] ;
         A14516ogEntrada = BC01VY6_A14516ogEntrada[0] ;
         n14516ogEntrada = BC01VY6_n14516ogEntrada[0] ;
         A14517ogVossaR = BC01VY6_A14517ogVossaR[0] ;
         n14517ogVossaR = BC01VY6_n14517ogVossaR[0] ;
         A14519ogArtiCR = BC01VY6_A14519ogArtiCR[0] ;
         n14519ogArtiCR = BC01VY6_n14519ogArtiCR[0] ;
         A14520ogArtiAC = BC01VY6_A14520ogArtiAC[0] ;
         n14520ogArtiAC = BC01VY6_n14520ogArtiAC[0] ;
         A14521ogARecCod = BC01VY6_A14521ogARecCod[0] ;
         n14521ogARecCod = BC01VY6_n14521ogARecCod[0] ;
         A14554ogLocaliza = BC01VY6_A14554ogLocaliza[0] ;
         n14554ogLocaliza = BC01VY6_n14554ogLocaliza[0] ;
         A14559ogLocalizc = BC01VY6_A14559ogLocalizc[0] ;
         n14559ogLocalizc = BC01VY6_n14559ogLocalizc[0] ;
         Z14503ogLinha = A14503ogLinha ;
         Z14504ogEmprCod = A14504ogEmprCod ;
         Z14505ogCliCod = A14505ogCliCod ;
         sMode1912 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1VY1912( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1912 = (short)(0) ;
            initializeNonKey1VY1912( ) ;
         }
         Gx_mode = sMode1912 ;
      }
      else
      {
         RcdFound1912 = (short)(0) ;
         initializeNonKey1VY1912( ) ;
         sMode1912 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode1912 ;
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1VY1912( ) ;
      if ( RcdFound1912 == 0 )
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
      confirm_1VY0( ) ;
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

   public void checkOptimisticConcurrency1VY1912( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01VY7 */
         pr_default.execute(5, new Object[] {Long.valueOf(A14503ogLinha), A14504ogEmprCod, Long.valueOf(A14505ogCliCod)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOGGUIA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(5) == 101) || ( Z14522ogNmrGuia != BC01VY7_A14522ogNmrGuia[0] ) || ( Z14523ogSerie != BC01VY7_A14523ogSerie[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z14506ogFecha), GXutil.resetTime(BC01VY7_A14506ogFecha[0])) ) || ( GXutil.strcmp(Z14507ogCodArt, BC01VY7_A14507ogCodArt[0]) != 0 ) || ( Z14508ogRolos != BC01VY7_A14508ogRolos[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14556ogRolos_ != BC01VY7_A14556ogRolos_[0] ) || ( DecimalUtil.compareTo(Z14509ogQuant, BC01VY7_A14509ogQuant[0]) != 0 ) || ( DecimalUtil.compareTo(Z14557ogQuant_, BC01VY7_A14557ogQuant_[0]) != 0 ) || ( GXutil.strcmp(Z14510ogUnidad, BC01VY7_A14510ogUnidad[0]) != 0 ) || ( GXutil.strcmp(Z14558ogUnidad_, BC01VY7_A14558ogUnidad_[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14528ogReferen, BC01VY7_A14528ogReferen[0]) != 0 ) || ( GXutil.strcmp(Z14511ogReclam, BC01VY7_A14511ogReclam[0]) != 0 ) || ( GXutil.strcmp(Z14518ogLote, BC01VY7_A14518ogLote[0]) != 0 ) || ( GXutil.strcmp(Z14512ogJogo, BC01VY7_A14512ogJogo[0]) != 0 ) || ( GXutil.strcmp(Z14513ogPoleg, BC01VY7_A14513ogPoleg[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14514ogFio, BC01VY7_A14514ogFio[0]) != 0 ) || ( GXutil.strcmp(Z14560ogFio_, BC01VY7_A14560ogFio_[0]) != 0 ) || ( GXutil.strcmp(Z14515ogMaqui, BC01VY7_A14515ogMaqui[0]) != 0 ) || ( GXutil.strcmp(Z14516ogEntrada, BC01VY7_A14516ogEntrada[0]) != 0 ) || ( GXutil.strcmp(Z14517ogVossaR, BC01VY7_A14517ogVossaR[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14519ogArtiCR, BC01VY7_A14519ogArtiCR[0]) != 0 ) || ( GXutil.strcmp(Z14520ogArtiAC, BC01VY7_A14520ogArtiAC[0]) != 0 ) || ( Z14521ogARecCod != BC01VY7_A14521ogARecCod[0] ) || ( GXutil.strcmp(Z14554ogLocaliza, BC01VY7_A14554ogLocaliza[0]) != 0 ) || ( GXutil.strcmp(Z14559ogLocalizc, BC01VY7_A14559ogLocalizc[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOGGUIA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1VY1912( )
   {
      beforeValidate1VY1912( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VY1912( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1VY1912( 0) ;
         checkOptimisticConcurrency1VY1912( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VY1912( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1VY1912( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01VY8 */
                  pr_default.execute(6, new Object[] {Long.valueOf(A14503ogLinha), A14504ogEmprCod, Long.valueOf(A14505ogCliCod), Boolean.valueOf(n14522ogNmrGuia), Long.valueOf(A14522ogNmrGuia), Boolean.valueOf(n14523ogSerie), Short.valueOf(A14523ogSerie), Boolean.valueOf(n14506ogFecha), A14506ogFecha, Boolean.valueOf(n14507ogCodArt), A14507ogCodArt, Boolean.valueOf(n14508ogRolos), Short.valueOf(A14508ogRolos), Boolean.valueOf(n14556ogRolos_), Short.valueOf(A14556ogRolos_), Boolean.valueOf(n14509ogQuant), A14509ogQuant, Boolean.valueOf(n14557ogQuant_), A14557ogQuant_, Boolean.valueOf(n14510ogUnidad), A14510ogUnidad, Boolean.valueOf(n14558ogUnidad_), A14558ogUnidad_, Boolean.valueOf(n14528ogReferen), A14528ogReferen, Boolean.valueOf(n14511ogReclam), A14511ogReclam, Boolean.valueOf(n14518ogLote), A14518ogLote, Boolean.valueOf(n14512ogJogo), A14512ogJogo, Boolean.valueOf(n14513ogPoleg), A14513ogPoleg, Boolean.valueOf(n14514ogFio), A14514ogFio, Boolean.valueOf(n14560ogFio_), A14560ogFio_, Boolean.valueOf(n14515ogMaqui), A14515ogMaqui, Boolean.valueOf(n14516ogEntrada), A14516ogEntrada, Boolean.valueOf(n14517ogVossaR), A14517ogVossaR, Boolean.valueOf(n14519ogArtiCR), A14519ogArtiCR, Boolean.valueOf(n14520ogArtiAC), A14520ogArtiAC, Boolean.valueOf(n14521ogARecCod), Integer.valueOf(A14521ogARecCod), Boolean.valueOf(n14554ogLocaliza), A14554ogLocaliza, Boolean.valueOf(n14559ogLocalizc), A14559ogLocalizc});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOGGUIA");
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
            load1VY1912( ) ;
         }
         endLevel1VY1912( ) ;
      }
      closeExtendedTableCursors1VY1912( ) ;
   }

   public void update1VY1912( )
   {
      beforeValidate1VY1912( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VY1912( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VY1912( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VY1912( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1VY1912( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01VY9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n14522ogNmrGuia), Long.valueOf(A14522ogNmrGuia), Boolean.valueOf(n14523ogSerie), Short.valueOf(A14523ogSerie), Boolean.valueOf(n14506ogFecha), A14506ogFecha, Boolean.valueOf(n14507ogCodArt), A14507ogCodArt, Boolean.valueOf(n14508ogRolos), Short.valueOf(A14508ogRolos), Boolean.valueOf(n14556ogRolos_), Short.valueOf(A14556ogRolos_), Boolean.valueOf(n14509ogQuant), A14509ogQuant, Boolean.valueOf(n14557ogQuant_), A14557ogQuant_, Boolean.valueOf(n14510ogUnidad), A14510ogUnidad, Boolean.valueOf(n14558ogUnidad_), A14558ogUnidad_, Boolean.valueOf(n14528ogReferen), A14528ogReferen, Boolean.valueOf(n14511ogReclam), A14511ogReclam, Boolean.valueOf(n14518ogLote), A14518ogLote, Boolean.valueOf(n14512ogJogo), A14512ogJogo, Boolean.valueOf(n14513ogPoleg), A14513ogPoleg, Boolean.valueOf(n14514ogFio), A14514ogFio, Boolean.valueOf(n14560ogFio_), A14560ogFio_, Boolean.valueOf(n14515ogMaqui), A14515ogMaqui, Boolean.valueOf(n14516ogEntrada), A14516ogEntrada, Boolean.valueOf(n14517ogVossaR), A14517ogVossaR, Boolean.valueOf(n14519ogArtiCR), A14519ogArtiCR, Boolean.valueOf(n14520ogArtiAC), A14520ogArtiAC, Boolean.valueOf(n14521ogARecCod), Integer.valueOf(A14521ogARecCod), Boolean.valueOf(n14554ogLocaliza), A14554ogLocaliza, Boolean.valueOf(n14559ogLocalizc), A14559ogLocalizc, Long.valueOf(A14503ogLinha), A14504ogEmprCod, Long.valueOf(A14505ogCliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOGGUIA");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOGGUIA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1VY1912( ) ;
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
         endLevel1VY1912( ) ;
      }
      closeExtendedTableCursors1VY1912( ) ;
   }

   public void deferredUpdate1VY1912( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1VY1912( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VY1912( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1VY1912( ) ;
         afterConfirm1VY1912( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1VY1912( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01VY10 */
               pr_default.execute(8, new Object[] {Long.valueOf(A14503ogLinha), A14504ogEmprCod, Long.valueOf(A14505ogCliCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOGGUIA");
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
      sMode1912 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1VY1912( ) ;
      Gx_mode = sMode1912 ;
   }

   public void onDeleteControls1VY1912( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1VY1912( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1VY1912( ) ;
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

   public void scanKeyStart1VY1912( )
   {
      /* Using cursor BC01VY11 */
      pr_default.execute(9, new Object[] {Long.valueOf(A14503ogLinha), A14504ogEmprCod, Long.valueOf(A14505ogCliCod)});
      RcdFound1912 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1912 = (short)(1) ;
         A14503ogLinha = BC01VY11_A14503ogLinha[0] ;
         A14504ogEmprCod = BC01VY11_A14504ogEmprCod[0] ;
         A14505ogCliCod = BC01VY11_A14505ogCliCod[0] ;
         A14522ogNmrGuia = BC01VY11_A14522ogNmrGuia[0] ;
         n14522ogNmrGuia = BC01VY11_n14522ogNmrGuia[0] ;
         A14523ogSerie = BC01VY11_A14523ogSerie[0] ;
         n14523ogSerie = BC01VY11_n14523ogSerie[0] ;
         A14506ogFecha = BC01VY11_A14506ogFecha[0] ;
         n14506ogFecha = BC01VY11_n14506ogFecha[0] ;
         A14507ogCodArt = BC01VY11_A14507ogCodArt[0] ;
         n14507ogCodArt = BC01VY11_n14507ogCodArt[0] ;
         A14508ogRolos = BC01VY11_A14508ogRolos[0] ;
         n14508ogRolos = BC01VY11_n14508ogRolos[0] ;
         A14556ogRolos_ = BC01VY11_A14556ogRolos_[0] ;
         n14556ogRolos_ = BC01VY11_n14556ogRolos_[0] ;
         A14509ogQuant = BC01VY11_A14509ogQuant[0] ;
         n14509ogQuant = BC01VY11_n14509ogQuant[0] ;
         A14557ogQuant_ = BC01VY11_A14557ogQuant_[0] ;
         n14557ogQuant_ = BC01VY11_n14557ogQuant_[0] ;
         A14510ogUnidad = BC01VY11_A14510ogUnidad[0] ;
         n14510ogUnidad = BC01VY11_n14510ogUnidad[0] ;
         A14558ogUnidad_ = BC01VY11_A14558ogUnidad_[0] ;
         n14558ogUnidad_ = BC01VY11_n14558ogUnidad_[0] ;
         A14528ogReferen = BC01VY11_A14528ogReferen[0] ;
         n14528ogReferen = BC01VY11_n14528ogReferen[0] ;
         A14511ogReclam = BC01VY11_A14511ogReclam[0] ;
         n14511ogReclam = BC01VY11_n14511ogReclam[0] ;
         A14518ogLote = BC01VY11_A14518ogLote[0] ;
         n14518ogLote = BC01VY11_n14518ogLote[0] ;
         A14512ogJogo = BC01VY11_A14512ogJogo[0] ;
         n14512ogJogo = BC01VY11_n14512ogJogo[0] ;
         A14513ogPoleg = BC01VY11_A14513ogPoleg[0] ;
         n14513ogPoleg = BC01VY11_n14513ogPoleg[0] ;
         A14514ogFio = BC01VY11_A14514ogFio[0] ;
         n14514ogFio = BC01VY11_n14514ogFio[0] ;
         A14560ogFio_ = BC01VY11_A14560ogFio_[0] ;
         n14560ogFio_ = BC01VY11_n14560ogFio_[0] ;
         A14515ogMaqui = BC01VY11_A14515ogMaqui[0] ;
         n14515ogMaqui = BC01VY11_n14515ogMaqui[0] ;
         A14516ogEntrada = BC01VY11_A14516ogEntrada[0] ;
         n14516ogEntrada = BC01VY11_n14516ogEntrada[0] ;
         A14517ogVossaR = BC01VY11_A14517ogVossaR[0] ;
         n14517ogVossaR = BC01VY11_n14517ogVossaR[0] ;
         A14519ogArtiCR = BC01VY11_A14519ogArtiCR[0] ;
         n14519ogArtiCR = BC01VY11_n14519ogArtiCR[0] ;
         A14520ogArtiAC = BC01VY11_A14520ogArtiAC[0] ;
         n14520ogArtiAC = BC01VY11_n14520ogArtiAC[0] ;
         A14521ogARecCod = BC01VY11_A14521ogARecCod[0] ;
         n14521ogARecCod = BC01VY11_n14521ogARecCod[0] ;
         A14554ogLocaliza = BC01VY11_A14554ogLocaliza[0] ;
         n14554ogLocaliza = BC01VY11_n14554ogLocaliza[0] ;
         A14559ogLocalizc = BC01VY11_A14559ogLocalizc[0] ;
         n14559ogLocalizc = BC01VY11_n14559ogLocalizc[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1VY1912( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1912 = (short)(0) ;
      scanKeyLoad1VY1912( ) ;
   }

   public void scanKeyLoad1VY1912( )
   {
      sMode1912 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1912 = (short)(1) ;
         A14503ogLinha = BC01VY11_A14503ogLinha[0] ;
         A14504ogEmprCod = BC01VY11_A14504ogEmprCod[0] ;
         A14505ogCliCod = BC01VY11_A14505ogCliCod[0] ;
         A14522ogNmrGuia = BC01VY11_A14522ogNmrGuia[0] ;
         n14522ogNmrGuia = BC01VY11_n14522ogNmrGuia[0] ;
         A14523ogSerie = BC01VY11_A14523ogSerie[0] ;
         n14523ogSerie = BC01VY11_n14523ogSerie[0] ;
         A14506ogFecha = BC01VY11_A14506ogFecha[0] ;
         n14506ogFecha = BC01VY11_n14506ogFecha[0] ;
         A14507ogCodArt = BC01VY11_A14507ogCodArt[0] ;
         n14507ogCodArt = BC01VY11_n14507ogCodArt[0] ;
         A14508ogRolos = BC01VY11_A14508ogRolos[0] ;
         n14508ogRolos = BC01VY11_n14508ogRolos[0] ;
         A14556ogRolos_ = BC01VY11_A14556ogRolos_[0] ;
         n14556ogRolos_ = BC01VY11_n14556ogRolos_[0] ;
         A14509ogQuant = BC01VY11_A14509ogQuant[0] ;
         n14509ogQuant = BC01VY11_n14509ogQuant[0] ;
         A14557ogQuant_ = BC01VY11_A14557ogQuant_[0] ;
         n14557ogQuant_ = BC01VY11_n14557ogQuant_[0] ;
         A14510ogUnidad = BC01VY11_A14510ogUnidad[0] ;
         n14510ogUnidad = BC01VY11_n14510ogUnidad[0] ;
         A14558ogUnidad_ = BC01VY11_A14558ogUnidad_[0] ;
         n14558ogUnidad_ = BC01VY11_n14558ogUnidad_[0] ;
         A14528ogReferen = BC01VY11_A14528ogReferen[0] ;
         n14528ogReferen = BC01VY11_n14528ogReferen[0] ;
         A14511ogReclam = BC01VY11_A14511ogReclam[0] ;
         n14511ogReclam = BC01VY11_n14511ogReclam[0] ;
         A14518ogLote = BC01VY11_A14518ogLote[0] ;
         n14518ogLote = BC01VY11_n14518ogLote[0] ;
         A14512ogJogo = BC01VY11_A14512ogJogo[0] ;
         n14512ogJogo = BC01VY11_n14512ogJogo[0] ;
         A14513ogPoleg = BC01VY11_A14513ogPoleg[0] ;
         n14513ogPoleg = BC01VY11_n14513ogPoleg[0] ;
         A14514ogFio = BC01VY11_A14514ogFio[0] ;
         n14514ogFio = BC01VY11_n14514ogFio[0] ;
         A14560ogFio_ = BC01VY11_A14560ogFio_[0] ;
         n14560ogFio_ = BC01VY11_n14560ogFio_[0] ;
         A14515ogMaqui = BC01VY11_A14515ogMaqui[0] ;
         n14515ogMaqui = BC01VY11_n14515ogMaqui[0] ;
         A14516ogEntrada = BC01VY11_A14516ogEntrada[0] ;
         n14516ogEntrada = BC01VY11_n14516ogEntrada[0] ;
         A14517ogVossaR = BC01VY11_A14517ogVossaR[0] ;
         n14517ogVossaR = BC01VY11_n14517ogVossaR[0] ;
         A14519ogArtiCR = BC01VY11_A14519ogArtiCR[0] ;
         n14519ogArtiCR = BC01VY11_n14519ogArtiCR[0] ;
         A14520ogArtiAC = BC01VY11_A14520ogArtiAC[0] ;
         n14520ogArtiAC = BC01VY11_n14520ogArtiAC[0] ;
         A14521ogARecCod = BC01VY11_A14521ogARecCod[0] ;
         n14521ogARecCod = BC01VY11_n14521ogARecCod[0] ;
         A14554ogLocaliza = BC01VY11_A14554ogLocaliza[0] ;
         n14554ogLocaliza = BC01VY11_n14554ogLocaliza[0] ;
         A14559ogLocalizc = BC01VY11_A14559ogLocalizc[0] ;
         n14559ogLocalizc = BC01VY11_n14559ogLocalizc[0] ;
      }
      Gx_mode = sMode1912 ;
   }

   public void scanKeyEnd1VY1912( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1VY1912( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1VY1912( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1VY1912( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1VY1912( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1VY1912( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1VY1912( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1VY1912( )
   {
   }

   public void send_integrity_lvl_hashes1VY1912( )
   {
   }

   public void addRow1VY1912( )
   {
      VarsToRow1912( bcponteway_v1_OgGuiaImport) ;
   }

   public void readRow1VY1912( )
   {
      RowToVars1912( bcponteway_v1_OgGuiaImport, 1) ;
   }

   public void initializeNonKey1VY1912( )
   {
      A14522ogNmrGuia = 0 ;
      n14522ogNmrGuia = false ;
      A14523ogSerie = (short)(0) ;
      n14523ogSerie = false ;
      A14506ogFecha = GXutil.nullDate() ;
      n14506ogFecha = false ;
      A14507ogCodArt = "" ;
      n14507ogCodArt = false ;
      A14508ogRolos = (short)(0) ;
      n14508ogRolos = false ;
      A14556ogRolos_ = (short)(0) ;
      n14556ogRolos_ = false ;
      A14509ogQuant = DecimalUtil.ZERO ;
      n14509ogQuant = false ;
      A14557ogQuant_ = DecimalUtil.ZERO ;
      n14557ogQuant_ = false ;
      A14510ogUnidad = "" ;
      n14510ogUnidad = false ;
      A14558ogUnidad_ = "" ;
      n14558ogUnidad_ = false ;
      A14528ogReferen = "" ;
      n14528ogReferen = false ;
      A14511ogReclam = "" ;
      n14511ogReclam = false ;
      A14518ogLote = "" ;
      n14518ogLote = false ;
      A14512ogJogo = "" ;
      n14512ogJogo = false ;
      A14513ogPoleg = "" ;
      n14513ogPoleg = false ;
      A14514ogFio = "" ;
      n14514ogFio = false ;
      A14560ogFio_ = "" ;
      n14560ogFio_ = false ;
      A14515ogMaqui = "" ;
      n14515ogMaqui = false ;
      A14516ogEntrada = "" ;
      n14516ogEntrada = false ;
      A14517ogVossaR = "" ;
      n14517ogVossaR = false ;
      A14519ogArtiCR = "" ;
      n14519ogArtiCR = false ;
      A14520ogArtiAC = "" ;
      n14520ogArtiAC = false ;
      A14521ogARecCod = 0 ;
      n14521ogARecCod = false ;
      A14554ogLocaliza = "" ;
      n14554ogLocaliza = false ;
      A14559ogLocalizc = "" ;
      n14559ogLocalizc = false ;
      Z14522ogNmrGuia = 0 ;
      Z14523ogSerie = (short)(0) ;
      Z14506ogFecha = GXutil.nullDate() ;
      Z14507ogCodArt = "" ;
      Z14508ogRolos = (short)(0) ;
      Z14556ogRolos_ = (short)(0) ;
      Z14509ogQuant = DecimalUtil.ZERO ;
      Z14557ogQuant_ = DecimalUtil.ZERO ;
      Z14510ogUnidad = "" ;
      Z14558ogUnidad_ = "" ;
      Z14528ogReferen = "" ;
      Z14511ogReclam = "" ;
      Z14518ogLote = "" ;
      Z14512ogJogo = "" ;
      Z14513ogPoleg = "" ;
      Z14514ogFio = "" ;
      Z14560ogFio_ = "" ;
      Z14515ogMaqui = "" ;
      Z14516ogEntrada = "" ;
      Z14517ogVossaR = "" ;
      Z14519ogArtiCR = "" ;
      Z14520ogArtiAC = "" ;
      Z14521ogARecCod = 0 ;
      Z14554ogLocaliza = "" ;
      Z14559ogLocalizc = "" ;
   }

   public void initAll1VY1912( )
   {
      A14503ogLinha = 0 ;
      A14504ogEmprCod = "" ;
      A14505ogCliCod = 0 ;
      initializeNonKey1VY1912( ) ;
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

   public void VarsToRow1912( app.ponteway.v1.SdtOgGuiaImport obj1912 )
   {
      obj1912.setgxTv_SdtOgGuiaImport_Mode( Gx_mode );
      obj1912.setgxTv_SdtOgGuiaImport_Ognmrguia( A14522ogNmrGuia );
      obj1912.setgxTv_SdtOgGuiaImport_Ogserie( A14523ogSerie );
      obj1912.setgxTv_SdtOgGuiaImport_Ogfecha( A14506ogFecha );
      obj1912.setgxTv_SdtOgGuiaImport_Ogcodart( A14507ogCodArt );
      obj1912.setgxTv_SdtOgGuiaImport_Ogrolos( A14508ogRolos );
      obj1912.setgxTv_SdtOgGuiaImport_Ogrolos_( A14556ogRolos_ );
      obj1912.setgxTv_SdtOgGuiaImport_Ogquant( A14509ogQuant );
      obj1912.setgxTv_SdtOgGuiaImport_Ogquant_( A14557ogQuant_ );
      obj1912.setgxTv_SdtOgGuiaImport_Ogunidad( A14510ogUnidad );
      obj1912.setgxTv_SdtOgGuiaImport_Ogunidad_( A14558ogUnidad_ );
      obj1912.setgxTv_SdtOgGuiaImport_Ogreferen( A14528ogReferen );
      obj1912.setgxTv_SdtOgGuiaImport_Ogreclam( A14511ogReclam );
      obj1912.setgxTv_SdtOgGuiaImport_Oglote( A14518ogLote );
      obj1912.setgxTv_SdtOgGuiaImport_Ogjogo( A14512ogJogo );
      obj1912.setgxTv_SdtOgGuiaImport_Ogpoleg( A14513ogPoleg );
      obj1912.setgxTv_SdtOgGuiaImport_Ogfio( A14514ogFio );
      obj1912.setgxTv_SdtOgGuiaImport_Ogfio_( A14560ogFio_ );
      obj1912.setgxTv_SdtOgGuiaImport_Ogmaqui( A14515ogMaqui );
      obj1912.setgxTv_SdtOgGuiaImport_Ogentrada( A14516ogEntrada );
      obj1912.setgxTv_SdtOgGuiaImport_Ogvossar( A14517ogVossaR );
      obj1912.setgxTv_SdtOgGuiaImport_Ogarticr( A14519ogArtiCR );
      obj1912.setgxTv_SdtOgGuiaImport_Ogartiac( A14520ogArtiAC );
      obj1912.setgxTv_SdtOgGuiaImport_Ogareccod( A14521ogARecCod );
      obj1912.setgxTv_SdtOgGuiaImport_Oglocalizac( A14554ogLocaliza );
      obj1912.setgxTv_SdtOgGuiaImport_Oglocalizc_( A14559ogLocalizc );
      obj1912.setgxTv_SdtOgGuiaImport_Oglinha( A14503ogLinha );
      obj1912.setgxTv_SdtOgGuiaImport_Ogemprcod( A14504ogEmprCod );
      obj1912.setgxTv_SdtOgGuiaImport_Ogclicod( A14505ogCliCod );
      obj1912.setgxTv_SdtOgGuiaImport_Oglinha_Z( Z14503ogLinha );
      obj1912.setgxTv_SdtOgGuiaImport_Ogemprcod_Z( Z14504ogEmprCod );
      obj1912.setgxTv_SdtOgGuiaImport_Ogclicod_Z( Z14505ogCliCod );
      obj1912.setgxTv_SdtOgGuiaImport_Ognmrguia_Z( Z14522ogNmrGuia );
      obj1912.setgxTv_SdtOgGuiaImport_Ogserie_Z( Z14523ogSerie );
      obj1912.setgxTv_SdtOgGuiaImport_Ogfecha_Z( Z14506ogFecha );
      obj1912.setgxTv_SdtOgGuiaImport_Ogcodart_Z( Z14507ogCodArt );
      obj1912.setgxTv_SdtOgGuiaImport_Ogrolos_Z( Z14508ogRolos );
      obj1912.setgxTv_SdtOgGuiaImport_Ogrolos__Z( Z14556ogRolos_ );
      obj1912.setgxTv_SdtOgGuiaImport_Ogquant_Z( Z14509ogQuant );
      obj1912.setgxTv_SdtOgGuiaImport_Ogquant__Z( Z14557ogQuant_ );
      obj1912.setgxTv_SdtOgGuiaImport_Ogunidad_Z( Z14510ogUnidad );
      obj1912.setgxTv_SdtOgGuiaImport_Ogunidad__Z( Z14558ogUnidad_ );
      obj1912.setgxTv_SdtOgGuiaImport_Ogreferen_Z( Z14528ogReferen );
      obj1912.setgxTv_SdtOgGuiaImport_Ogreclam_Z( Z14511ogReclam );
      obj1912.setgxTv_SdtOgGuiaImport_Oglote_Z( Z14518ogLote );
      obj1912.setgxTv_SdtOgGuiaImport_Ogjogo_Z( Z14512ogJogo );
      obj1912.setgxTv_SdtOgGuiaImport_Ogpoleg_Z( Z14513ogPoleg );
      obj1912.setgxTv_SdtOgGuiaImport_Ogfio_Z( Z14514ogFio );
      obj1912.setgxTv_SdtOgGuiaImport_Ogfio__Z( Z14560ogFio_ );
      obj1912.setgxTv_SdtOgGuiaImport_Ogmaqui_Z( Z14515ogMaqui );
      obj1912.setgxTv_SdtOgGuiaImport_Ogentrada_Z( Z14516ogEntrada );
      obj1912.setgxTv_SdtOgGuiaImport_Ogvossar_Z( Z14517ogVossaR );
      obj1912.setgxTv_SdtOgGuiaImport_Ogarticr_Z( Z14519ogArtiCR );
      obj1912.setgxTv_SdtOgGuiaImport_Ogartiac_Z( Z14520ogArtiAC );
      obj1912.setgxTv_SdtOgGuiaImport_Ogareccod_Z( Z14521ogARecCod );
      obj1912.setgxTv_SdtOgGuiaImport_Oglocalizac_Z( Z14554ogLocaliza );
      obj1912.setgxTv_SdtOgGuiaImport_Oglocalizc__Z( Z14559ogLocalizc );
      obj1912.setgxTv_SdtOgGuiaImport_Ognmrguia_N( (byte)((byte)((n14522ogNmrGuia)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogserie_N( (byte)((byte)((n14523ogSerie)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogfecha_N( (byte)((byte)((n14506ogFecha)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogcodart_N( (byte)((byte)((n14507ogCodArt)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogrolos_N( (byte)((byte)((n14508ogRolos)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogrolos__N( (byte)((byte)((n14556ogRolos_)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogquant_N( (byte)((byte)((n14509ogQuant)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogquant__N( (byte)((byte)((n14557ogQuant_)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogunidad_N( (byte)((byte)((n14510ogUnidad)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogunidad__N( (byte)((byte)((n14558ogUnidad_)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogreferen_N( (byte)((byte)((n14528ogReferen)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogreclam_N( (byte)((byte)((n14511ogReclam)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Oglote_N( (byte)((byte)((n14518ogLote)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogjogo_N( (byte)((byte)((n14512ogJogo)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogpoleg_N( (byte)((byte)((n14513ogPoleg)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogfio_N( (byte)((byte)((n14514ogFio)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogfio__N( (byte)((byte)((n14560ogFio_)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogmaqui_N( (byte)((byte)((n14515ogMaqui)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogentrada_N( (byte)((byte)((n14516ogEntrada)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogvossar_N( (byte)((byte)((n14517ogVossaR)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogarticr_N( (byte)((byte)((n14519ogArtiCR)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogartiac_N( (byte)((byte)((n14520ogArtiAC)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Ogareccod_N( (byte)((byte)((n14521ogARecCod)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Oglocalizac_N( (byte)((byte)((n14554ogLocaliza)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Oglocalizc__N( (byte)((byte)((n14559ogLocalizc)?1:0)) );
      obj1912.setgxTv_SdtOgGuiaImport_Mode( Gx_mode );
   }

   public void KeyVarsToRow1912( app.ponteway.v1.SdtOgGuiaImport obj1912 )
   {
      obj1912.setgxTv_SdtOgGuiaImport_Oglinha( A14503ogLinha );
      obj1912.setgxTv_SdtOgGuiaImport_Ogemprcod( A14504ogEmprCod );
      obj1912.setgxTv_SdtOgGuiaImport_Ogclicod( A14505ogCliCod );
   }

   public void RowToVars1912( app.ponteway.v1.SdtOgGuiaImport obj1912 ,
                              int forceLoad )
   {
      Gx_mode = obj1912.getgxTv_SdtOgGuiaImport_Mode() ;
      A14522ogNmrGuia = obj1912.getgxTv_SdtOgGuiaImport_Ognmrguia() ;
      n14522ogNmrGuia = false ;
      A14523ogSerie = obj1912.getgxTv_SdtOgGuiaImport_Ogserie() ;
      n14523ogSerie = false ;
      A14506ogFecha = obj1912.getgxTv_SdtOgGuiaImport_Ogfecha() ;
      n14506ogFecha = false ;
      A14507ogCodArt = obj1912.getgxTv_SdtOgGuiaImport_Ogcodart() ;
      n14507ogCodArt = false ;
      A14508ogRolos = obj1912.getgxTv_SdtOgGuiaImport_Ogrolos() ;
      n14508ogRolos = false ;
      A14556ogRolos_ = obj1912.getgxTv_SdtOgGuiaImport_Ogrolos_() ;
      n14556ogRolos_ = false ;
      A14509ogQuant = obj1912.getgxTv_SdtOgGuiaImport_Ogquant() ;
      n14509ogQuant = false ;
      A14557ogQuant_ = obj1912.getgxTv_SdtOgGuiaImport_Ogquant_() ;
      n14557ogQuant_ = false ;
      A14510ogUnidad = obj1912.getgxTv_SdtOgGuiaImport_Ogunidad() ;
      n14510ogUnidad = false ;
      A14558ogUnidad_ = obj1912.getgxTv_SdtOgGuiaImport_Ogunidad_() ;
      n14558ogUnidad_ = false ;
      A14528ogReferen = obj1912.getgxTv_SdtOgGuiaImport_Ogreferen() ;
      n14528ogReferen = false ;
      A14511ogReclam = obj1912.getgxTv_SdtOgGuiaImport_Ogreclam() ;
      n14511ogReclam = false ;
      A14518ogLote = obj1912.getgxTv_SdtOgGuiaImport_Oglote() ;
      n14518ogLote = false ;
      A14512ogJogo = obj1912.getgxTv_SdtOgGuiaImport_Ogjogo() ;
      n14512ogJogo = false ;
      A14513ogPoleg = obj1912.getgxTv_SdtOgGuiaImport_Ogpoleg() ;
      n14513ogPoleg = false ;
      A14514ogFio = obj1912.getgxTv_SdtOgGuiaImport_Ogfio() ;
      n14514ogFio = false ;
      A14560ogFio_ = obj1912.getgxTv_SdtOgGuiaImport_Ogfio_() ;
      n14560ogFio_ = false ;
      A14515ogMaqui = obj1912.getgxTv_SdtOgGuiaImport_Ogmaqui() ;
      n14515ogMaqui = false ;
      A14516ogEntrada = obj1912.getgxTv_SdtOgGuiaImport_Ogentrada() ;
      n14516ogEntrada = false ;
      A14517ogVossaR = obj1912.getgxTv_SdtOgGuiaImport_Ogvossar() ;
      n14517ogVossaR = false ;
      A14519ogArtiCR = obj1912.getgxTv_SdtOgGuiaImport_Ogarticr() ;
      n14519ogArtiCR = false ;
      A14520ogArtiAC = obj1912.getgxTv_SdtOgGuiaImport_Ogartiac() ;
      n14520ogArtiAC = false ;
      A14521ogARecCod = obj1912.getgxTv_SdtOgGuiaImport_Ogareccod() ;
      n14521ogARecCod = false ;
      A14554ogLocaliza = obj1912.getgxTv_SdtOgGuiaImport_Oglocalizac() ;
      n14554ogLocaliza = false ;
      A14559ogLocalizc = obj1912.getgxTv_SdtOgGuiaImport_Oglocalizc_() ;
      n14559ogLocalizc = false ;
      A14503ogLinha = obj1912.getgxTv_SdtOgGuiaImport_Oglinha() ;
      A14504ogEmprCod = obj1912.getgxTv_SdtOgGuiaImport_Ogemprcod() ;
      A14505ogCliCod = obj1912.getgxTv_SdtOgGuiaImport_Ogclicod() ;
      Z14503ogLinha = obj1912.getgxTv_SdtOgGuiaImport_Oglinha_Z() ;
      Z14504ogEmprCod = obj1912.getgxTv_SdtOgGuiaImport_Ogemprcod_Z() ;
      Z14505ogCliCod = obj1912.getgxTv_SdtOgGuiaImport_Ogclicod_Z() ;
      Z14522ogNmrGuia = obj1912.getgxTv_SdtOgGuiaImport_Ognmrguia_Z() ;
      Z14523ogSerie = obj1912.getgxTv_SdtOgGuiaImport_Ogserie_Z() ;
      Z14506ogFecha = obj1912.getgxTv_SdtOgGuiaImport_Ogfecha_Z() ;
      Z14507ogCodArt = obj1912.getgxTv_SdtOgGuiaImport_Ogcodart_Z() ;
      Z14508ogRolos = obj1912.getgxTv_SdtOgGuiaImport_Ogrolos_Z() ;
      Z14556ogRolos_ = obj1912.getgxTv_SdtOgGuiaImport_Ogrolos__Z() ;
      Z14509ogQuant = obj1912.getgxTv_SdtOgGuiaImport_Ogquant_Z() ;
      Z14557ogQuant_ = obj1912.getgxTv_SdtOgGuiaImport_Ogquant__Z() ;
      Z14510ogUnidad = obj1912.getgxTv_SdtOgGuiaImport_Ogunidad_Z() ;
      Z14558ogUnidad_ = obj1912.getgxTv_SdtOgGuiaImport_Ogunidad__Z() ;
      Z14528ogReferen = obj1912.getgxTv_SdtOgGuiaImport_Ogreferen_Z() ;
      Z14511ogReclam = obj1912.getgxTv_SdtOgGuiaImport_Ogreclam_Z() ;
      Z14518ogLote = obj1912.getgxTv_SdtOgGuiaImport_Oglote_Z() ;
      Z14512ogJogo = obj1912.getgxTv_SdtOgGuiaImport_Ogjogo_Z() ;
      Z14513ogPoleg = obj1912.getgxTv_SdtOgGuiaImport_Ogpoleg_Z() ;
      Z14514ogFio = obj1912.getgxTv_SdtOgGuiaImport_Ogfio_Z() ;
      Z14560ogFio_ = obj1912.getgxTv_SdtOgGuiaImport_Ogfio__Z() ;
      Z14515ogMaqui = obj1912.getgxTv_SdtOgGuiaImport_Ogmaqui_Z() ;
      Z14516ogEntrada = obj1912.getgxTv_SdtOgGuiaImport_Ogentrada_Z() ;
      Z14517ogVossaR = obj1912.getgxTv_SdtOgGuiaImport_Ogvossar_Z() ;
      Z14519ogArtiCR = obj1912.getgxTv_SdtOgGuiaImport_Ogarticr_Z() ;
      Z14520ogArtiAC = obj1912.getgxTv_SdtOgGuiaImport_Ogartiac_Z() ;
      Z14521ogARecCod = obj1912.getgxTv_SdtOgGuiaImport_Ogareccod_Z() ;
      Z14554ogLocaliza = obj1912.getgxTv_SdtOgGuiaImport_Oglocalizac_Z() ;
      Z14559ogLocalizc = obj1912.getgxTv_SdtOgGuiaImport_Oglocalizc__Z() ;
      n14522ogNmrGuia = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ognmrguia_N()==0)?false:true) ;
      n14523ogSerie = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogserie_N()==0)?false:true) ;
      n14506ogFecha = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogfecha_N()==0)?false:true) ;
      n14507ogCodArt = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogcodart_N()==0)?false:true) ;
      n14508ogRolos = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogrolos_N()==0)?false:true) ;
      n14556ogRolos_ = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogrolos__N()==0)?false:true) ;
      n14509ogQuant = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogquant_N()==0)?false:true) ;
      n14557ogQuant_ = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogquant__N()==0)?false:true) ;
      n14510ogUnidad = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogunidad_N()==0)?false:true) ;
      n14558ogUnidad_ = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogunidad__N()==0)?false:true) ;
      n14528ogReferen = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogreferen_N()==0)?false:true) ;
      n14511ogReclam = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogreclam_N()==0)?false:true) ;
      n14518ogLote = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Oglote_N()==0)?false:true) ;
      n14512ogJogo = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogjogo_N()==0)?false:true) ;
      n14513ogPoleg = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogpoleg_N()==0)?false:true) ;
      n14514ogFio = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogfio_N()==0)?false:true) ;
      n14560ogFio_ = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogfio__N()==0)?false:true) ;
      n14515ogMaqui = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogmaqui_N()==0)?false:true) ;
      n14516ogEntrada = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogentrada_N()==0)?false:true) ;
      n14517ogVossaR = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogvossar_N()==0)?false:true) ;
      n14519ogArtiCR = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogarticr_N()==0)?false:true) ;
      n14520ogArtiAC = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogartiac_N()==0)?false:true) ;
      n14521ogARecCod = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Ogareccod_N()==0)?false:true) ;
      n14554ogLocaliza = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Oglocalizac_N()==0)?false:true) ;
      n14559ogLocalizc = (boolean)((obj1912.getgxTv_SdtOgGuiaImport_Oglocalizc__N()==0)?false:true) ;
      Gx_mode = obj1912.getgxTv_SdtOgGuiaImport_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A14503ogLinha = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      A14504ogEmprCod = (String)getParm(obj,1) ;
      A14505ogCliCod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.LONG)).longValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1VY1912( ) ;
      scanKeyStart1VY1912( ) ;
      if ( RcdFound1912 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z14503ogLinha = A14503ogLinha ;
         Z14504ogEmprCod = A14504ogEmprCod ;
         Z14505ogCliCod = A14505ogCliCod ;
      }
      zm1VY1912( -1) ;
      onLoadActions1VY1912( ) ;
      addRow1VY1912( ) ;
      scanKeyEnd1VY1912( ) ;
      if ( RcdFound1912 == 0 )
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
      RowToVars1912( bcponteway_v1_OgGuiaImport, 0) ;
      scanKeyStart1VY1912( ) ;
      if ( RcdFound1912 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z14503ogLinha = A14503ogLinha ;
         Z14504ogEmprCod = A14504ogEmprCod ;
         Z14505ogCliCod = A14505ogCliCod ;
      }
      zm1VY1912( -1) ;
      onLoadActions1VY1912( ) ;
      addRow1VY1912( ) ;
      scanKeyEnd1VY1912( ) ;
      if ( RcdFound1912 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1VY1912( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1VY1912( ) ;
      }
      else
      {
         if ( RcdFound1912 == 1 )
         {
            if ( ( A14503ogLinha != Z14503ogLinha ) || ( GXutil.strcmp(A14504ogEmprCod, Z14504ogEmprCod) != 0 ) || ( A14505ogCliCod != Z14505ogCliCod ) )
            {
               A14503ogLinha = Z14503ogLinha ;
               A14504ogEmprCod = Z14504ogEmprCod ;
               A14505ogCliCod = Z14505ogCliCod ;
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
               update1VY1912( ) ;
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
               if ( ( A14503ogLinha != Z14503ogLinha ) || ( GXutil.strcmp(A14504ogEmprCod, Z14504ogEmprCod) != 0 ) || ( A14505ogCliCod != Z14505ogCliCod ) )
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
                     insert1VY1912( ) ;
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
                     insert1VY1912( ) ;
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
      RowToVars1912( bcponteway_v1_OgGuiaImport, 1) ;
      saveImpl( ) ;
      VarsToRow1912( bcponteway_v1_OgGuiaImport) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars1912( bcponteway_v1_OgGuiaImport, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1VY1912( ) ;
      afterTrn( ) ;
      VarsToRow1912( bcponteway_v1_OgGuiaImport) ;
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
         app.ponteway.v1.SdtOgGuiaImport auxBC = new app.ponteway.v1.SdtOgGuiaImport( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A14503ogLinha, A14504ogEmprCod, A14505ogCliCod);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcponteway_v1_OgGuiaImport);
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
      RowToVars1912( bcponteway_v1_OgGuiaImport, 1) ;
      updateImpl( ) ;
      VarsToRow1912( bcponteway_v1_OgGuiaImport) ;
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
      RowToVars1912( bcponteway_v1_OgGuiaImport, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1VY1912( ) ;
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
      VarsToRow1912( bcponteway_v1_OgGuiaImport) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1912( bcponteway_v1_OgGuiaImport, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1VY1912( ) ;
      if ( RcdFound1912 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( A14503ogLinha != Z14503ogLinha ) || ( GXutil.strcmp(A14504ogEmprCod, Z14504ogEmprCod) != 0 ) || ( A14505ogCliCod != Z14505ogCliCod ) )
         {
            A14503ogLinha = Z14503ogLinha ;
            A14504ogEmprCod = Z14504ogEmprCod ;
            A14505ogCliCod = Z14505ogCliCod ;
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
         if ( ( A14503ogLinha != Z14503ogLinha ) || ( GXutil.strcmp(A14504ogEmprCod, Z14504ogEmprCod) != 0 ) || ( A14505ogCliCod != Z14505ogCliCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ponteway.v1.ogguiaimport_bc");
      VarsToRow1912( bcponteway_v1_OgGuiaImport) ;
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
      Gx_mode = bcponteway_v1_OgGuiaImport.getgxTv_SdtOgGuiaImport_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcponteway_v1_OgGuiaImport.setgxTv_SdtOgGuiaImport_Mode( Gx_mode );
   }

   public void SetSDT( app.ponteway.v1.SdtOgGuiaImport sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcponteway_v1_OgGuiaImport )
      {
         bcponteway_v1_OgGuiaImport = sdt ;
         if ( GXutil.strcmp(bcponteway_v1_OgGuiaImport.getgxTv_SdtOgGuiaImport_Mode(), "") == 0 )
         {
            bcponteway_v1_OgGuiaImport.setgxTv_SdtOgGuiaImport_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow1912( bcponteway_v1_OgGuiaImport) ;
         }
         else
         {
            RowToVars1912( bcponteway_v1_OgGuiaImport, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcponteway_v1_OgGuiaImport.getgxTv_SdtOgGuiaImport_Mode(), "") == 0 )
         {
            bcponteway_v1_OgGuiaImport.setgxTv_SdtOgGuiaImport_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars1912( bcponteway_v1_OgGuiaImport, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtOgGuiaImport getOgGuiaImport_BC( )
   {
      return bcponteway_v1_OgGuiaImport ;
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
      Z14504ogEmprCod = "" ;
      A14504ogEmprCod = "" ;
      Z14506ogFecha = GXutil.nullDate() ;
      A14506ogFecha = GXutil.nullDate() ;
      Z14507ogCodArt = "" ;
      A14507ogCodArt = "" ;
      Z14509ogQuant = DecimalUtil.ZERO ;
      A14509ogQuant = DecimalUtil.ZERO ;
      Z14557ogQuant_ = DecimalUtil.ZERO ;
      A14557ogQuant_ = DecimalUtil.ZERO ;
      Z14510ogUnidad = "" ;
      A14510ogUnidad = "" ;
      Z14558ogUnidad_ = "" ;
      A14558ogUnidad_ = "" ;
      Z14528ogReferen = "" ;
      A14528ogReferen = "" ;
      Z14511ogReclam = "" ;
      A14511ogReclam = "" ;
      Z14518ogLote = "" ;
      A14518ogLote = "" ;
      Z14512ogJogo = "" ;
      A14512ogJogo = "" ;
      Z14513ogPoleg = "" ;
      A14513ogPoleg = "" ;
      Z14514ogFio = "" ;
      A14514ogFio = "" ;
      Z14560ogFio_ = "" ;
      A14560ogFio_ = "" ;
      Z14515ogMaqui = "" ;
      A14515ogMaqui = "" ;
      Z14516ogEntrada = "" ;
      A14516ogEntrada = "" ;
      Z14517ogVossaR = "" ;
      A14517ogVossaR = "" ;
      Z14519ogArtiCR = "" ;
      A14519ogArtiCR = "" ;
      Z14520ogArtiAC = "" ;
      A14520ogArtiAC = "" ;
      Z14554ogLocaliza = "" ;
      A14554ogLocaliza = "" ;
      Z14559ogLocalizc = "" ;
      A14559ogLocalizc = "" ;
      BC01VY4_A14503ogLinha = new long[1] ;
      BC01VY4_A14504ogEmprCod = new String[] {""} ;
      BC01VY4_A14505ogCliCod = new long[1] ;
      BC01VY4_A14522ogNmrGuia = new long[1] ;
      BC01VY4_n14522ogNmrGuia = new boolean[] {false} ;
      BC01VY4_A14523ogSerie = new short[1] ;
      BC01VY4_n14523ogSerie = new boolean[] {false} ;
      BC01VY4_A14506ogFecha = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VY4_n14506ogFecha = new boolean[] {false} ;
      BC01VY4_A14507ogCodArt = new String[] {""} ;
      BC01VY4_n14507ogCodArt = new boolean[] {false} ;
      BC01VY4_A14508ogRolos = new short[1] ;
      BC01VY4_n14508ogRolos = new boolean[] {false} ;
      BC01VY4_A14556ogRolos_ = new short[1] ;
      BC01VY4_n14556ogRolos_ = new boolean[] {false} ;
      BC01VY4_A14509ogQuant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VY4_n14509ogQuant = new boolean[] {false} ;
      BC01VY4_A14557ogQuant_ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VY4_n14557ogQuant_ = new boolean[] {false} ;
      BC01VY4_A14510ogUnidad = new String[] {""} ;
      BC01VY4_n14510ogUnidad = new boolean[] {false} ;
      BC01VY4_A14558ogUnidad_ = new String[] {""} ;
      BC01VY4_n14558ogUnidad_ = new boolean[] {false} ;
      BC01VY4_A14528ogReferen = new String[] {""} ;
      BC01VY4_n14528ogReferen = new boolean[] {false} ;
      BC01VY4_A14511ogReclam = new String[] {""} ;
      BC01VY4_n14511ogReclam = new boolean[] {false} ;
      BC01VY4_A14518ogLote = new String[] {""} ;
      BC01VY4_n14518ogLote = new boolean[] {false} ;
      BC01VY4_A14512ogJogo = new String[] {""} ;
      BC01VY4_n14512ogJogo = new boolean[] {false} ;
      BC01VY4_A14513ogPoleg = new String[] {""} ;
      BC01VY4_n14513ogPoleg = new boolean[] {false} ;
      BC01VY4_A14514ogFio = new String[] {""} ;
      BC01VY4_n14514ogFio = new boolean[] {false} ;
      BC01VY4_A14560ogFio_ = new String[] {""} ;
      BC01VY4_n14560ogFio_ = new boolean[] {false} ;
      BC01VY4_A14515ogMaqui = new String[] {""} ;
      BC01VY4_n14515ogMaqui = new boolean[] {false} ;
      BC01VY4_A14516ogEntrada = new String[] {""} ;
      BC01VY4_n14516ogEntrada = new boolean[] {false} ;
      BC01VY4_A14517ogVossaR = new String[] {""} ;
      BC01VY4_n14517ogVossaR = new boolean[] {false} ;
      BC01VY4_A14519ogArtiCR = new String[] {""} ;
      BC01VY4_n14519ogArtiCR = new boolean[] {false} ;
      BC01VY4_A14520ogArtiAC = new String[] {""} ;
      BC01VY4_n14520ogArtiAC = new boolean[] {false} ;
      BC01VY4_A14521ogARecCod = new int[1] ;
      BC01VY4_n14521ogARecCod = new boolean[] {false} ;
      BC01VY4_A14554ogLocaliza = new String[] {""} ;
      BC01VY4_n14554ogLocaliza = new boolean[] {false} ;
      BC01VY4_A14559ogLocalizc = new String[] {""} ;
      BC01VY4_n14559ogLocalizc = new boolean[] {false} ;
      BC01VY5_A14503ogLinha = new long[1] ;
      BC01VY5_A14504ogEmprCod = new String[] {""} ;
      BC01VY5_A14505ogCliCod = new long[1] ;
      BC01VY6_A14503ogLinha = new long[1] ;
      BC01VY6_A14504ogEmprCod = new String[] {""} ;
      BC01VY6_A14505ogCliCod = new long[1] ;
      BC01VY6_A14522ogNmrGuia = new long[1] ;
      BC01VY6_n14522ogNmrGuia = new boolean[] {false} ;
      BC01VY6_A14523ogSerie = new short[1] ;
      BC01VY6_n14523ogSerie = new boolean[] {false} ;
      BC01VY6_A14506ogFecha = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VY6_n14506ogFecha = new boolean[] {false} ;
      BC01VY6_A14507ogCodArt = new String[] {""} ;
      BC01VY6_n14507ogCodArt = new boolean[] {false} ;
      BC01VY6_A14508ogRolos = new short[1] ;
      BC01VY6_n14508ogRolos = new boolean[] {false} ;
      BC01VY6_A14556ogRolos_ = new short[1] ;
      BC01VY6_n14556ogRolos_ = new boolean[] {false} ;
      BC01VY6_A14509ogQuant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VY6_n14509ogQuant = new boolean[] {false} ;
      BC01VY6_A14557ogQuant_ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VY6_n14557ogQuant_ = new boolean[] {false} ;
      BC01VY6_A14510ogUnidad = new String[] {""} ;
      BC01VY6_n14510ogUnidad = new boolean[] {false} ;
      BC01VY6_A14558ogUnidad_ = new String[] {""} ;
      BC01VY6_n14558ogUnidad_ = new boolean[] {false} ;
      BC01VY6_A14528ogReferen = new String[] {""} ;
      BC01VY6_n14528ogReferen = new boolean[] {false} ;
      BC01VY6_A14511ogReclam = new String[] {""} ;
      BC01VY6_n14511ogReclam = new boolean[] {false} ;
      BC01VY6_A14518ogLote = new String[] {""} ;
      BC01VY6_n14518ogLote = new boolean[] {false} ;
      BC01VY6_A14512ogJogo = new String[] {""} ;
      BC01VY6_n14512ogJogo = new boolean[] {false} ;
      BC01VY6_A14513ogPoleg = new String[] {""} ;
      BC01VY6_n14513ogPoleg = new boolean[] {false} ;
      BC01VY6_A14514ogFio = new String[] {""} ;
      BC01VY6_n14514ogFio = new boolean[] {false} ;
      BC01VY6_A14560ogFio_ = new String[] {""} ;
      BC01VY6_n14560ogFio_ = new boolean[] {false} ;
      BC01VY6_A14515ogMaqui = new String[] {""} ;
      BC01VY6_n14515ogMaqui = new boolean[] {false} ;
      BC01VY6_A14516ogEntrada = new String[] {""} ;
      BC01VY6_n14516ogEntrada = new boolean[] {false} ;
      BC01VY6_A14517ogVossaR = new String[] {""} ;
      BC01VY6_n14517ogVossaR = new boolean[] {false} ;
      BC01VY6_A14519ogArtiCR = new String[] {""} ;
      BC01VY6_n14519ogArtiCR = new boolean[] {false} ;
      BC01VY6_A14520ogArtiAC = new String[] {""} ;
      BC01VY6_n14520ogArtiAC = new boolean[] {false} ;
      BC01VY6_A14521ogARecCod = new int[1] ;
      BC01VY6_n14521ogARecCod = new boolean[] {false} ;
      BC01VY6_A14554ogLocaliza = new String[] {""} ;
      BC01VY6_n14554ogLocaliza = new boolean[] {false} ;
      BC01VY6_A14559ogLocalizc = new String[] {""} ;
      BC01VY6_n14559ogLocalizc = new boolean[] {false} ;
      sMode1912 = "" ;
      BC01VY7_A14503ogLinha = new long[1] ;
      BC01VY7_A14504ogEmprCod = new String[] {""} ;
      BC01VY7_A14505ogCliCod = new long[1] ;
      BC01VY7_A14522ogNmrGuia = new long[1] ;
      BC01VY7_n14522ogNmrGuia = new boolean[] {false} ;
      BC01VY7_A14523ogSerie = new short[1] ;
      BC01VY7_n14523ogSerie = new boolean[] {false} ;
      BC01VY7_A14506ogFecha = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VY7_n14506ogFecha = new boolean[] {false} ;
      BC01VY7_A14507ogCodArt = new String[] {""} ;
      BC01VY7_n14507ogCodArt = new boolean[] {false} ;
      BC01VY7_A14508ogRolos = new short[1] ;
      BC01VY7_n14508ogRolos = new boolean[] {false} ;
      BC01VY7_A14556ogRolos_ = new short[1] ;
      BC01VY7_n14556ogRolos_ = new boolean[] {false} ;
      BC01VY7_A14509ogQuant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VY7_n14509ogQuant = new boolean[] {false} ;
      BC01VY7_A14557ogQuant_ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VY7_n14557ogQuant_ = new boolean[] {false} ;
      BC01VY7_A14510ogUnidad = new String[] {""} ;
      BC01VY7_n14510ogUnidad = new boolean[] {false} ;
      BC01VY7_A14558ogUnidad_ = new String[] {""} ;
      BC01VY7_n14558ogUnidad_ = new boolean[] {false} ;
      BC01VY7_A14528ogReferen = new String[] {""} ;
      BC01VY7_n14528ogReferen = new boolean[] {false} ;
      BC01VY7_A14511ogReclam = new String[] {""} ;
      BC01VY7_n14511ogReclam = new boolean[] {false} ;
      BC01VY7_A14518ogLote = new String[] {""} ;
      BC01VY7_n14518ogLote = new boolean[] {false} ;
      BC01VY7_A14512ogJogo = new String[] {""} ;
      BC01VY7_n14512ogJogo = new boolean[] {false} ;
      BC01VY7_A14513ogPoleg = new String[] {""} ;
      BC01VY7_n14513ogPoleg = new boolean[] {false} ;
      BC01VY7_A14514ogFio = new String[] {""} ;
      BC01VY7_n14514ogFio = new boolean[] {false} ;
      BC01VY7_A14560ogFio_ = new String[] {""} ;
      BC01VY7_n14560ogFio_ = new boolean[] {false} ;
      BC01VY7_A14515ogMaqui = new String[] {""} ;
      BC01VY7_n14515ogMaqui = new boolean[] {false} ;
      BC01VY7_A14516ogEntrada = new String[] {""} ;
      BC01VY7_n14516ogEntrada = new boolean[] {false} ;
      BC01VY7_A14517ogVossaR = new String[] {""} ;
      BC01VY7_n14517ogVossaR = new boolean[] {false} ;
      BC01VY7_A14519ogArtiCR = new String[] {""} ;
      BC01VY7_n14519ogArtiCR = new boolean[] {false} ;
      BC01VY7_A14520ogArtiAC = new String[] {""} ;
      BC01VY7_n14520ogArtiAC = new boolean[] {false} ;
      BC01VY7_A14521ogARecCod = new int[1] ;
      BC01VY7_n14521ogARecCod = new boolean[] {false} ;
      BC01VY7_A14554ogLocaliza = new String[] {""} ;
      BC01VY7_n14554ogLocaliza = new boolean[] {false} ;
      BC01VY7_A14559ogLocalizc = new String[] {""} ;
      BC01VY7_n14559ogLocalizc = new boolean[] {false} ;
      BC01VY11_A14503ogLinha = new long[1] ;
      BC01VY11_A14504ogEmprCod = new String[] {""} ;
      BC01VY11_A14505ogCliCod = new long[1] ;
      BC01VY11_A14522ogNmrGuia = new long[1] ;
      BC01VY11_n14522ogNmrGuia = new boolean[] {false} ;
      BC01VY11_A14523ogSerie = new short[1] ;
      BC01VY11_n14523ogSerie = new boolean[] {false} ;
      BC01VY11_A14506ogFecha = new java.util.Date[] {GXutil.nullDate()} ;
      BC01VY11_n14506ogFecha = new boolean[] {false} ;
      BC01VY11_A14507ogCodArt = new String[] {""} ;
      BC01VY11_n14507ogCodArt = new boolean[] {false} ;
      BC01VY11_A14508ogRolos = new short[1] ;
      BC01VY11_n14508ogRolos = new boolean[] {false} ;
      BC01VY11_A14556ogRolos_ = new short[1] ;
      BC01VY11_n14556ogRolos_ = new boolean[] {false} ;
      BC01VY11_A14509ogQuant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VY11_n14509ogQuant = new boolean[] {false} ;
      BC01VY11_A14557ogQuant_ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01VY11_n14557ogQuant_ = new boolean[] {false} ;
      BC01VY11_A14510ogUnidad = new String[] {""} ;
      BC01VY11_n14510ogUnidad = new boolean[] {false} ;
      BC01VY11_A14558ogUnidad_ = new String[] {""} ;
      BC01VY11_n14558ogUnidad_ = new boolean[] {false} ;
      BC01VY11_A14528ogReferen = new String[] {""} ;
      BC01VY11_n14528ogReferen = new boolean[] {false} ;
      BC01VY11_A14511ogReclam = new String[] {""} ;
      BC01VY11_n14511ogReclam = new boolean[] {false} ;
      BC01VY11_A14518ogLote = new String[] {""} ;
      BC01VY11_n14518ogLote = new boolean[] {false} ;
      BC01VY11_A14512ogJogo = new String[] {""} ;
      BC01VY11_n14512ogJogo = new boolean[] {false} ;
      BC01VY11_A14513ogPoleg = new String[] {""} ;
      BC01VY11_n14513ogPoleg = new boolean[] {false} ;
      BC01VY11_A14514ogFio = new String[] {""} ;
      BC01VY11_n14514ogFio = new boolean[] {false} ;
      BC01VY11_A14560ogFio_ = new String[] {""} ;
      BC01VY11_n14560ogFio_ = new boolean[] {false} ;
      BC01VY11_A14515ogMaqui = new String[] {""} ;
      BC01VY11_n14515ogMaqui = new boolean[] {false} ;
      BC01VY11_A14516ogEntrada = new String[] {""} ;
      BC01VY11_n14516ogEntrada = new boolean[] {false} ;
      BC01VY11_A14517ogVossaR = new String[] {""} ;
      BC01VY11_n14517ogVossaR = new boolean[] {false} ;
      BC01VY11_A14519ogArtiCR = new String[] {""} ;
      BC01VY11_n14519ogArtiCR = new boolean[] {false} ;
      BC01VY11_A14520ogArtiAC = new String[] {""} ;
      BC01VY11_n14520ogArtiAC = new boolean[] {false} ;
      BC01VY11_A14521ogARecCod = new int[1] ;
      BC01VY11_n14521ogARecCod = new boolean[] {false} ;
      BC01VY11_A14554ogLocaliza = new String[] {""} ;
      BC01VY11_n14554ogLocaliza = new boolean[] {false} ;
      BC01VY11_A14559ogLocalizc = new String[] {""} ;
      BC01VY11_n14559ogLocalizc = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ponteway.v1.ogguiaimport_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ponteway.v1.ogguiaimport_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ponteway.v1.ogguiaimport_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ponteway.v1.ogguiaimport_bc__default(),
         new Object[] {
             new Object[] {
            BC01VY2_A14503ogLinha, BC01VY2_A14504ogEmprCod, BC01VY2_A14505ogCliCod, BC01VY2_A14522ogNmrGuia, BC01VY2_n14522ogNmrGuia, BC01VY2_A14523ogSerie, BC01VY2_n14523ogSerie, BC01VY2_A14506ogFecha, BC01VY2_n14506ogFecha, BC01VY2_A14507ogCodArt,
            BC01VY2_n14507ogCodArt, BC01VY2_A14508ogRolos, BC01VY2_n14508ogRolos, BC01VY2_A14556ogRolos_, BC01VY2_n14556ogRolos_, BC01VY2_A14509ogQuant, BC01VY2_n14509ogQuant, BC01VY2_A14557ogQuant_, BC01VY2_n14557ogQuant_, BC01VY2_A14510ogUnidad,
            BC01VY2_n14510ogUnidad, BC01VY2_A14558ogUnidad_, BC01VY2_n14558ogUnidad_, BC01VY2_A14528ogReferen, BC01VY2_n14528ogReferen, BC01VY2_A14511ogReclam, BC01VY2_n14511ogReclam, BC01VY2_A14518ogLote, BC01VY2_n14518ogLote, BC01VY2_A14512ogJogo,
            BC01VY2_n14512ogJogo, BC01VY2_A14513ogPoleg, BC01VY2_n14513ogPoleg, BC01VY2_A14514ogFio, BC01VY2_n14514ogFio, BC01VY2_A14560ogFio_, BC01VY2_n14560ogFio_, BC01VY2_A14515ogMaqui, BC01VY2_n14515ogMaqui, BC01VY2_A14516ogEntrada,
            BC01VY2_n14516ogEntrada, BC01VY2_A14517ogVossaR, BC01VY2_n14517ogVossaR, BC01VY2_A14519ogArtiCR, BC01VY2_n14519ogArtiCR, BC01VY2_A14520ogArtiAC, BC01VY2_n14520ogArtiAC, BC01VY2_A14521ogARecCod, BC01VY2_n14521ogARecCod, BC01VY2_A14554ogLocaliza,
            BC01VY2_n14554ogLocaliza, BC01VY2_A14559ogLocalizc, BC01VY2_n14559ogLocalizc
            }
            , new Object[] {
            BC01VY3_A14503ogLinha, BC01VY3_A14504ogEmprCod, BC01VY3_A14505ogCliCod, BC01VY3_A14522ogNmrGuia, BC01VY3_n14522ogNmrGuia, BC01VY3_A14523ogSerie, BC01VY3_n14523ogSerie, BC01VY3_A14506ogFecha, BC01VY3_n14506ogFecha, BC01VY3_A14507ogCodArt,
            BC01VY3_n14507ogCodArt, BC01VY3_A14508ogRolos, BC01VY3_n14508ogRolos, BC01VY3_A14556ogRolos_, BC01VY3_n14556ogRolos_, BC01VY3_A14509ogQuant, BC01VY3_n14509ogQuant, BC01VY3_A14557ogQuant_, BC01VY3_n14557ogQuant_, BC01VY3_A14510ogUnidad,
            BC01VY3_n14510ogUnidad, BC01VY3_A14558ogUnidad_, BC01VY3_n14558ogUnidad_, BC01VY3_A14528ogReferen, BC01VY3_n14528ogReferen, BC01VY3_A14511ogReclam, BC01VY3_n14511ogReclam, BC01VY3_A14518ogLote, BC01VY3_n14518ogLote, BC01VY3_A14512ogJogo,
            BC01VY3_n14512ogJogo, BC01VY3_A14513ogPoleg, BC01VY3_n14513ogPoleg, BC01VY3_A14514ogFio, BC01VY3_n14514ogFio, BC01VY3_A14560ogFio_, BC01VY3_n14560ogFio_, BC01VY3_A14515ogMaqui, BC01VY3_n14515ogMaqui, BC01VY3_A14516ogEntrada,
            BC01VY3_n14516ogEntrada, BC01VY3_A14517ogVossaR, BC01VY3_n14517ogVossaR, BC01VY3_A14519ogArtiCR, BC01VY3_n14519ogArtiCR, BC01VY3_A14520ogArtiAC, BC01VY3_n14520ogArtiAC, BC01VY3_A14521ogARecCod, BC01VY3_n14521ogARecCod, BC01VY3_A14554ogLocaliza,
            BC01VY3_n14554ogLocaliza, BC01VY3_A14559ogLocalizc, BC01VY3_n14559ogLocalizc
            }
            , new Object[] {
            BC01VY4_A14503ogLinha, BC01VY4_A14504ogEmprCod, BC01VY4_A14505ogCliCod, BC01VY4_A14522ogNmrGuia, BC01VY4_n14522ogNmrGuia, BC01VY4_A14523ogSerie, BC01VY4_n14523ogSerie, BC01VY4_A14506ogFecha, BC01VY4_n14506ogFecha, BC01VY4_A14507ogCodArt,
            BC01VY4_n14507ogCodArt, BC01VY4_A14508ogRolos, BC01VY4_n14508ogRolos, BC01VY4_A14556ogRolos_, BC01VY4_n14556ogRolos_, BC01VY4_A14509ogQuant, BC01VY4_n14509ogQuant, BC01VY4_A14557ogQuant_, BC01VY4_n14557ogQuant_, BC01VY4_A14510ogUnidad,
            BC01VY4_n14510ogUnidad, BC01VY4_A14558ogUnidad_, BC01VY4_n14558ogUnidad_, BC01VY4_A14528ogReferen, BC01VY4_n14528ogReferen, BC01VY4_A14511ogReclam, BC01VY4_n14511ogReclam, BC01VY4_A14518ogLote, BC01VY4_n14518ogLote, BC01VY4_A14512ogJogo,
            BC01VY4_n14512ogJogo, BC01VY4_A14513ogPoleg, BC01VY4_n14513ogPoleg, BC01VY4_A14514ogFio, BC01VY4_n14514ogFio, BC01VY4_A14560ogFio_, BC01VY4_n14560ogFio_, BC01VY4_A14515ogMaqui, BC01VY4_n14515ogMaqui, BC01VY4_A14516ogEntrada,
            BC01VY4_n14516ogEntrada, BC01VY4_A14517ogVossaR, BC01VY4_n14517ogVossaR, BC01VY4_A14519ogArtiCR, BC01VY4_n14519ogArtiCR, BC01VY4_A14520ogArtiAC, BC01VY4_n14520ogArtiAC, BC01VY4_A14521ogARecCod, BC01VY4_n14521ogARecCod, BC01VY4_A14554ogLocaliza,
            BC01VY4_n14554ogLocaliza, BC01VY4_A14559ogLocalizc, BC01VY4_n14559ogLocalizc
            }
            , new Object[] {
            BC01VY5_A14503ogLinha, BC01VY5_A14504ogEmprCod, BC01VY5_A14505ogCliCod
            }
            , new Object[] {
            BC01VY6_A14503ogLinha, BC01VY6_A14504ogEmprCod, BC01VY6_A14505ogCliCod, BC01VY6_A14522ogNmrGuia, BC01VY6_n14522ogNmrGuia, BC01VY6_A14523ogSerie, BC01VY6_n14523ogSerie, BC01VY6_A14506ogFecha, BC01VY6_n14506ogFecha, BC01VY6_A14507ogCodArt,
            BC01VY6_n14507ogCodArt, BC01VY6_A14508ogRolos, BC01VY6_n14508ogRolos, BC01VY6_A14556ogRolos_, BC01VY6_n14556ogRolos_, BC01VY6_A14509ogQuant, BC01VY6_n14509ogQuant, BC01VY6_A14557ogQuant_, BC01VY6_n14557ogQuant_, BC01VY6_A14510ogUnidad,
            BC01VY6_n14510ogUnidad, BC01VY6_A14558ogUnidad_, BC01VY6_n14558ogUnidad_, BC01VY6_A14528ogReferen, BC01VY6_n14528ogReferen, BC01VY6_A14511ogReclam, BC01VY6_n14511ogReclam, BC01VY6_A14518ogLote, BC01VY6_n14518ogLote, BC01VY6_A14512ogJogo,
            BC01VY6_n14512ogJogo, BC01VY6_A14513ogPoleg, BC01VY6_n14513ogPoleg, BC01VY6_A14514ogFio, BC01VY6_n14514ogFio, BC01VY6_A14560ogFio_, BC01VY6_n14560ogFio_, BC01VY6_A14515ogMaqui, BC01VY6_n14515ogMaqui, BC01VY6_A14516ogEntrada,
            BC01VY6_n14516ogEntrada, BC01VY6_A14517ogVossaR, BC01VY6_n14517ogVossaR, BC01VY6_A14519ogArtiCR, BC01VY6_n14519ogArtiCR, BC01VY6_A14520ogArtiAC, BC01VY6_n14520ogArtiAC, BC01VY6_A14521ogARecCod, BC01VY6_n14521ogARecCod, BC01VY6_A14554ogLocaliza,
            BC01VY6_n14554ogLocaliza, BC01VY6_A14559ogLocalizc, BC01VY6_n14559ogLocalizc
            }
            , new Object[] {
            BC01VY7_A14503ogLinha, BC01VY7_A14504ogEmprCod, BC01VY7_A14505ogCliCod, BC01VY7_A14522ogNmrGuia, BC01VY7_n14522ogNmrGuia, BC01VY7_A14523ogSerie, BC01VY7_n14523ogSerie, BC01VY7_A14506ogFecha, BC01VY7_n14506ogFecha, BC01VY7_A14507ogCodArt,
            BC01VY7_n14507ogCodArt, BC01VY7_A14508ogRolos, BC01VY7_n14508ogRolos, BC01VY7_A14556ogRolos_, BC01VY7_n14556ogRolos_, BC01VY7_A14509ogQuant, BC01VY7_n14509ogQuant, BC01VY7_A14557ogQuant_, BC01VY7_n14557ogQuant_, BC01VY7_A14510ogUnidad,
            BC01VY7_n14510ogUnidad, BC01VY7_A14558ogUnidad_, BC01VY7_n14558ogUnidad_, BC01VY7_A14528ogReferen, BC01VY7_n14528ogReferen, BC01VY7_A14511ogReclam, BC01VY7_n14511ogReclam, BC01VY7_A14518ogLote, BC01VY7_n14518ogLote, BC01VY7_A14512ogJogo,
            BC01VY7_n14512ogJogo, BC01VY7_A14513ogPoleg, BC01VY7_n14513ogPoleg, BC01VY7_A14514ogFio, BC01VY7_n14514ogFio, BC01VY7_A14560ogFio_, BC01VY7_n14560ogFio_, BC01VY7_A14515ogMaqui, BC01VY7_n14515ogMaqui, BC01VY7_A14516ogEntrada,
            BC01VY7_n14516ogEntrada, BC01VY7_A14517ogVossaR, BC01VY7_n14517ogVossaR, BC01VY7_A14519ogArtiCR, BC01VY7_n14519ogArtiCR, BC01VY7_A14520ogArtiAC, BC01VY7_n14520ogArtiAC, BC01VY7_A14521ogARecCod, BC01VY7_n14521ogARecCod, BC01VY7_A14554ogLocaliza,
            BC01VY7_n14554ogLocaliza, BC01VY7_A14559ogLocalizc, BC01VY7_n14559ogLocalizc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01VY11_A14503ogLinha, BC01VY11_A14504ogEmprCod, BC01VY11_A14505ogCliCod, BC01VY11_A14522ogNmrGuia, BC01VY11_n14522ogNmrGuia, BC01VY11_A14523ogSerie, BC01VY11_n14523ogSerie, BC01VY11_A14506ogFecha, BC01VY11_n14506ogFecha, BC01VY11_A14507ogCodArt,
            BC01VY11_n14507ogCodArt, BC01VY11_A14508ogRolos, BC01VY11_n14508ogRolos, BC01VY11_A14556ogRolos_, BC01VY11_n14556ogRolos_, BC01VY11_A14509ogQuant, BC01VY11_n14509ogQuant, BC01VY11_A14557ogQuant_, BC01VY11_n14557ogQuant_, BC01VY11_A14510ogUnidad,
            BC01VY11_n14510ogUnidad, BC01VY11_A14558ogUnidad_, BC01VY11_n14558ogUnidad_, BC01VY11_A14528ogReferen, BC01VY11_n14528ogReferen, BC01VY11_A14511ogReclam, BC01VY11_n14511ogReclam, BC01VY11_A14518ogLote, BC01VY11_n14518ogLote, BC01VY11_A14512ogJogo,
            BC01VY11_n14512ogJogo, BC01VY11_A14513ogPoleg, BC01VY11_n14513ogPoleg, BC01VY11_A14514ogFio, BC01VY11_n14514ogFio, BC01VY11_A14560ogFio_, BC01VY11_n14560ogFio_, BC01VY11_A14515ogMaqui, BC01VY11_n14515ogMaqui, BC01VY11_A14516ogEntrada,
            BC01VY11_n14516ogEntrada, BC01VY11_A14517ogVossaR, BC01VY11_n14517ogVossaR, BC01VY11_A14519ogArtiCR, BC01VY11_n14519ogArtiCR, BC01VY11_A14520ogArtiAC, BC01VY11_n14520ogArtiAC, BC01VY11_A14521ogARecCod, BC01VY11_n14521ogARecCod, BC01VY11_A14554ogLocaliza,
            BC01VY11_n14554ogLocaliza, BC01VY11_A14559ogLocalizc, BC01VY11_n14559ogLocalizc
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
   private short Z14523ogSerie ;
   private short A14523ogSerie ;
   private short Z14508ogRolos ;
   private short A14508ogRolos ;
   private short Z14556ogRolos_ ;
   private short A14556ogRolos_ ;
   private short RcdFound1912 ;
   private short nIsDirty_1912 ;
   private int trnEnded ;
   private int GX_JID ;
   private int Z14521ogARecCod ;
   private int A14521ogARecCod ;
   private long Z14503ogLinha ;
   private long A14503ogLinha ;
   private long Z14505ogCliCod ;
   private long A14505ogCliCod ;
   private long Z14522ogNmrGuia ;
   private long A14522ogNmrGuia ;
   private java.math.BigDecimal Z14509ogQuant ;
   private java.math.BigDecimal A14509ogQuant ;
   private java.math.BigDecimal Z14557ogQuant_ ;
   private java.math.BigDecimal A14557ogQuant_ ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1912 ;
   private java.util.Date Z14506ogFecha ;
   private java.util.Date A14506ogFecha ;
   private boolean n14522ogNmrGuia ;
   private boolean n14523ogSerie ;
   private boolean n14506ogFecha ;
   private boolean n14507ogCodArt ;
   private boolean n14508ogRolos ;
   private boolean n14556ogRolos_ ;
   private boolean n14509ogQuant ;
   private boolean n14557ogQuant_ ;
   private boolean n14510ogUnidad ;
   private boolean n14558ogUnidad_ ;
   private boolean n14528ogReferen ;
   private boolean n14511ogReclam ;
   private boolean n14518ogLote ;
   private boolean n14512ogJogo ;
   private boolean n14513ogPoleg ;
   private boolean n14514ogFio ;
   private boolean n14560ogFio_ ;
   private boolean n14515ogMaqui ;
   private boolean n14516ogEntrada ;
   private boolean n14517ogVossaR ;
   private boolean n14519ogArtiCR ;
   private boolean n14520ogArtiAC ;
   private boolean n14521ogARecCod ;
   private boolean n14554ogLocaliza ;
   private boolean n14559ogLocalizc ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private String Z14504ogEmprCod ;
   private String A14504ogEmprCod ;
   private String Z14507ogCodArt ;
   private String A14507ogCodArt ;
   private String Z14510ogUnidad ;
   private String A14510ogUnidad ;
   private String Z14558ogUnidad_ ;
   private String A14558ogUnidad_ ;
   private String Z14528ogReferen ;
   private String A14528ogReferen ;
   private String Z14511ogReclam ;
   private String A14511ogReclam ;
   private String Z14518ogLote ;
   private String A14518ogLote ;
   private String Z14512ogJogo ;
   private String A14512ogJogo ;
   private String Z14513ogPoleg ;
   private String A14513ogPoleg ;
   private String Z14514ogFio ;
   private String A14514ogFio ;
   private String Z14560ogFio_ ;
   private String A14560ogFio_ ;
   private String Z14515ogMaqui ;
   private String A14515ogMaqui ;
   private String Z14516ogEntrada ;
   private String A14516ogEntrada ;
   private String Z14517ogVossaR ;
   private String A14517ogVossaR ;
   private String Z14519ogArtiCR ;
   private String A14519ogArtiCR ;
   private String Z14520ogArtiAC ;
   private String A14520ogArtiAC ;
   private String Z14554ogLocaliza ;
   private String A14554ogLocaliza ;
   private String Z14559ogLocalizc ;
   private String A14559ogLocalizc ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private app.ponteway.v1.SdtOgGuiaImport bcponteway_v1_OgGuiaImport ;
   private IDataStoreProvider pr_default ;
   private long[] BC01VY4_A14503ogLinha ;
   private String[] BC01VY4_A14504ogEmprCod ;
   private long[] BC01VY4_A14505ogCliCod ;
   private long[] BC01VY4_A14522ogNmrGuia ;
   private boolean[] BC01VY4_n14522ogNmrGuia ;
   private short[] BC01VY4_A14523ogSerie ;
   private boolean[] BC01VY4_n14523ogSerie ;
   private java.util.Date[] BC01VY4_A14506ogFecha ;
   private boolean[] BC01VY4_n14506ogFecha ;
   private String[] BC01VY4_A14507ogCodArt ;
   private boolean[] BC01VY4_n14507ogCodArt ;
   private short[] BC01VY4_A14508ogRolos ;
   private boolean[] BC01VY4_n14508ogRolos ;
   private short[] BC01VY4_A14556ogRolos_ ;
   private boolean[] BC01VY4_n14556ogRolos_ ;
   private java.math.BigDecimal[] BC01VY4_A14509ogQuant ;
   private boolean[] BC01VY4_n14509ogQuant ;
   private java.math.BigDecimal[] BC01VY4_A14557ogQuant_ ;
   private boolean[] BC01VY4_n14557ogQuant_ ;
   private String[] BC01VY4_A14510ogUnidad ;
   private boolean[] BC01VY4_n14510ogUnidad ;
   private String[] BC01VY4_A14558ogUnidad_ ;
   private boolean[] BC01VY4_n14558ogUnidad_ ;
   private String[] BC01VY4_A14528ogReferen ;
   private boolean[] BC01VY4_n14528ogReferen ;
   private String[] BC01VY4_A14511ogReclam ;
   private boolean[] BC01VY4_n14511ogReclam ;
   private String[] BC01VY4_A14518ogLote ;
   private boolean[] BC01VY4_n14518ogLote ;
   private String[] BC01VY4_A14512ogJogo ;
   private boolean[] BC01VY4_n14512ogJogo ;
   private String[] BC01VY4_A14513ogPoleg ;
   private boolean[] BC01VY4_n14513ogPoleg ;
   private String[] BC01VY4_A14514ogFio ;
   private boolean[] BC01VY4_n14514ogFio ;
   private String[] BC01VY4_A14560ogFio_ ;
   private boolean[] BC01VY4_n14560ogFio_ ;
   private String[] BC01VY4_A14515ogMaqui ;
   private boolean[] BC01VY4_n14515ogMaqui ;
   private String[] BC01VY4_A14516ogEntrada ;
   private boolean[] BC01VY4_n14516ogEntrada ;
   private String[] BC01VY4_A14517ogVossaR ;
   private boolean[] BC01VY4_n14517ogVossaR ;
   private String[] BC01VY4_A14519ogArtiCR ;
   private boolean[] BC01VY4_n14519ogArtiCR ;
   private String[] BC01VY4_A14520ogArtiAC ;
   private boolean[] BC01VY4_n14520ogArtiAC ;
   private int[] BC01VY4_A14521ogARecCod ;
   private boolean[] BC01VY4_n14521ogARecCod ;
   private String[] BC01VY4_A14554ogLocaliza ;
   private boolean[] BC01VY4_n14554ogLocaliza ;
   private String[] BC01VY4_A14559ogLocalizc ;
   private boolean[] BC01VY4_n14559ogLocalizc ;
   private long[] BC01VY5_A14503ogLinha ;
   private String[] BC01VY5_A14504ogEmprCod ;
   private long[] BC01VY5_A14505ogCliCod ;
   private long[] BC01VY6_A14503ogLinha ;
   private String[] BC01VY6_A14504ogEmprCod ;
   private long[] BC01VY6_A14505ogCliCod ;
   private long[] BC01VY6_A14522ogNmrGuia ;
   private boolean[] BC01VY6_n14522ogNmrGuia ;
   private short[] BC01VY6_A14523ogSerie ;
   private boolean[] BC01VY6_n14523ogSerie ;
   private java.util.Date[] BC01VY6_A14506ogFecha ;
   private boolean[] BC01VY6_n14506ogFecha ;
   private String[] BC01VY6_A14507ogCodArt ;
   private boolean[] BC01VY6_n14507ogCodArt ;
   private short[] BC01VY6_A14508ogRolos ;
   private boolean[] BC01VY6_n14508ogRolos ;
   private short[] BC01VY6_A14556ogRolos_ ;
   private boolean[] BC01VY6_n14556ogRolos_ ;
   private java.math.BigDecimal[] BC01VY6_A14509ogQuant ;
   private boolean[] BC01VY6_n14509ogQuant ;
   private java.math.BigDecimal[] BC01VY6_A14557ogQuant_ ;
   private boolean[] BC01VY6_n14557ogQuant_ ;
   private String[] BC01VY6_A14510ogUnidad ;
   private boolean[] BC01VY6_n14510ogUnidad ;
   private String[] BC01VY6_A14558ogUnidad_ ;
   private boolean[] BC01VY6_n14558ogUnidad_ ;
   private String[] BC01VY6_A14528ogReferen ;
   private boolean[] BC01VY6_n14528ogReferen ;
   private String[] BC01VY6_A14511ogReclam ;
   private boolean[] BC01VY6_n14511ogReclam ;
   private String[] BC01VY6_A14518ogLote ;
   private boolean[] BC01VY6_n14518ogLote ;
   private String[] BC01VY6_A14512ogJogo ;
   private boolean[] BC01VY6_n14512ogJogo ;
   private String[] BC01VY6_A14513ogPoleg ;
   private boolean[] BC01VY6_n14513ogPoleg ;
   private String[] BC01VY6_A14514ogFio ;
   private boolean[] BC01VY6_n14514ogFio ;
   private String[] BC01VY6_A14560ogFio_ ;
   private boolean[] BC01VY6_n14560ogFio_ ;
   private String[] BC01VY6_A14515ogMaqui ;
   private boolean[] BC01VY6_n14515ogMaqui ;
   private String[] BC01VY6_A14516ogEntrada ;
   private boolean[] BC01VY6_n14516ogEntrada ;
   private String[] BC01VY6_A14517ogVossaR ;
   private boolean[] BC01VY6_n14517ogVossaR ;
   private String[] BC01VY6_A14519ogArtiCR ;
   private boolean[] BC01VY6_n14519ogArtiCR ;
   private String[] BC01VY6_A14520ogArtiAC ;
   private boolean[] BC01VY6_n14520ogArtiAC ;
   private int[] BC01VY6_A14521ogARecCod ;
   private boolean[] BC01VY6_n14521ogARecCod ;
   private String[] BC01VY6_A14554ogLocaliza ;
   private boolean[] BC01VY6_n14554ogLocaliza ;
   private String[] BC01VY6_A14559ogLocalizc ;
   private boolean[] BC01VY6_n14559ogLocalizc ;
   private long[] BC01VY7_A14503ogLinha ;
   private String[] BC01VY7_A14504ogEmprCod ;
   private long[] BC01VY7_A14505ogCliCod ;
   private long[] BC01VY7_A14522ogNmrGuia ;
   private boolean[] BC01VY7_n14522ogNmrGuia ;
   private short[] BC01VY7_A14523ogSerie ;
   private boolean[] BC01VY7_n14523ogSerie ;
   private java.util.Date[] BC01VY7_A14506ogFecha ;
   private boolean[] BC01VY7_n14506ogFecha ;
   private String[] BC01VY7_A14507ogCodArt ;
   private boolean[] BC01VY7_n14507ogCodArt ;
   private short[] BC01VY7_A14508ogRolos ;
   private boolean[] BC01VY7_n14508ogRolos ;
   private short[] BC01VY7_A14556ogRolos_ ;
   private boolean[] BC01VY7_n14556ogRolos_ ;
   private java.math.BigDecimal[] BC01VY7_A14509ogQuant ;
   private boolean[] BC01VY7_n14509ogQuant ;
   private java.math.BigDecimal[] BC01VY7_A14557ogQuant_ ;
   private boolean[] BC01VY7_n14557ogQuant_ ;
   private String[] BC01VY7_A14510ogUnidad ;
   private boolean[] BC01VY7_n14510ogUnidad ;
   private String[] BC01VY7_A14558ogUnidad_ ;
   private boolean[] BC01VY7_n14558ogUnidad_ ;
   private String[] BC01VY7_A14528ogReferen ;
   private boolean[] BC01VY7_n14528ogReferen ;
   private String[] BC01VY7_A14511ogReclam ;
   private boolean[] BC01VY7_n14511ogReclam ;
   private String[] BC01VY7_A14518ogLote ;
   private boolean[] BC01VY7_n14518ogLote ;
   private String[] BC01VY7_A14512ogJogo ;
   private boolean[] BC01VY7_n14512ogJogo ;
   private String[] BC01VY7_A14513ogPoleg ;
   private boolean[] BC01VY7_n14513ogPoleg ;
   private String[] BC01VY7_A14514ogFio ;
   private boolean[] BC01VY7_n14514ogFio ;
   private String[] BC01VY7_A14560ogFio_ ;
   private boolean[] BC01VY7_n14560ogFio_ ;
   private String[] BC01VY7_A14515ogMaqui ;
   private boolean[] BC01VY7_n14515ogMaqui ;
   private String[] BC01VY7_A14516ogEntrada ;
   private boolean[] BC01VY7_n14516ogEntrada ;
   private String[] BC01VY7_A14517ogVossaR ;
   private boolean[] BC01VY7_n14517ogVossaR ;
   private String[] BC01VY7_A14519ogArtiCR ;
   private boolean[] BC01VY7_n14519ogArtiCR ;
   private String[] BC01VY7_A14520ogArtiAC ;
   private boolean[] BC01VY7_n14520ogArtiAC ;
   private int[] BC01VY7_A14521ogARecCod ;
   private boolean[] BC01VY7_n14521ogARecCod ;
   private String[] BC01VY7_A14554ogLocaliza ;
   private boolean[] BC01VY7_n14554ogLocaliza ;
   private String[] BC01VY7_A14559ogLocalizc ;
   private boolean[] BC01VY7_n14559ogLocalizc ;
   private long[] BC01VY11_A14503ogLinha ;
   private String[] BC01VY11_A14504ogEmprCod ;
   private long[] BC01VY11_A14505ogCliCod ;
   private long[] BC01VY11_A14522ogNmrGuia ;
   private boolean[] BC01VY11_n14522ogNmrGuia ;
   private short[] BC01VY11_A14523ogSerie ;
   private boolean[] BC01VY11_n14523ogSerie ;
   private java.util.Date[] BC01VY11_A14506ogFecha ;
   private boolean[] BC01VY11_n14506ogFecha ;
   private String[] BC01VY11_A14507ogCodArt ;
   private boolean[] BC01VY11_n14507ogCodArt ;
   private short[] BC01VY11_A14508ogRolos ;
   private boolean[] BC01VY11_n14508ogRolos ;
   private short[] BC01VY11_A14556ogRolos_ ;
   private boolean[] BC01VY11_n14556ogRolos_ ;
   private java.math.BigDecimal[] BC01VY11_A14509ogQuant ;
   private boolean[] BC01VY11_n14509ogQuant ;
   private java.math.BigDecimal[] BC01VY11_A14557ogQuant_ ;
   private boolean[] BC01VY11_n14557ogQuant_ ;
   private String[] BC01VY11_A14510ogUnidad ;
   private boolean[] BC01VY11_n14510ogUnidad ;
   private String[] BC01VY11_A14558ogUnidad_ ;
   private boolean[] BC01VY11_n14558ogUnidad_ ;
   private String[] BC01VY11_A14528ogReferen ;
   private boolean[] BC01VY11_n14528ogReferen ;
   private String[] BC01VY11_A14511ogReclam ;
   private boolean[] BC01VY11_n14511ogReclam ;
   private String[] BC01VY11_A14518ogLote ;
   private boolean[] BC01VY11_n14518ogLote ;
   private String[] BC01VY11_A14512ogJogo ;
   private boolean[] BC01VY11_n14512ogJogo ;
   private String[] BC01VY11_A14513ogPoleg ;
   private boolean[] BC01VY11_n14513ogPoleg ;
   private String[] BC01VY11_A14514ogFio ;
   private boolean[] BC01VY11_n14514ogFio ;
   private String[] BC01VY11_A14560ogFio_ ;
   private boolean[] BC01VY11_n14560ogFio_ ;
   private String[] BC01VY11_A14515ogMaqui ;
   private boolean[] BC01VY11_n14515ogMaqui ;
   private String[] BC01VY11_A14516ogEntrada ;
   private boolean[] BC01VY11_n14516ogEntrada ;
   private String[] BC01VY11_A14517ogVossaR ;
   private boolean[] BC01VY11_n14517ogVossaR ;
   private String[] BC01VY11_A14519ogArtiCR ;
   private boolean[] BC01VY11_n14519ogArtiCR ;
   private String[] BC01VY11_A14520ogArtiAC ;
   private boolean[] BC01VY11_n14520ogArtiAC ;
   private int[] BC01VY11_A14521ogARecCod ;
   private boolean[] BC01VY11_n14521ogARecCod ;
   private String[] BC01VY11_A14554ogLocaliza ;
   private boolean[] BC01VY11_n14554ogLocaliza ;
   private String[] BC01VY11_A14559ogLocalizc ;
   private boolean[] BC01VY11_n14559ogLocalizc ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private long[] BC01VY2_A14503ogLinha ;
   private String[] BC01VY2_A14504ogEmprCod ;
   private long[] BC01VY2_A14505ogCliCod ;
   private long[] BC01VY2_A14522ogNmrGuia ;
   private short[] BC01VY2_A14523ogSerie ;
   private java.util.Date[] BC01VY2_A14506ogFecha ;
   private String[] BC01VY2_A14507ogCodArt ;
   private short[] BC01VY2_A14508ogRolos ;
   private short[] BC01VY2_A14556ogRolos_ ;
   private java.math.BigDecimal[] BC01VY2_A14509ogQuant ;
   private java.math.BigDecimal[] BC01VY2_A14557ogQuant_ ;
   private String[] BC01VY2_A14510ogUnidad ;
   private String[] BC01VY2_A14558ogUnidad_ ;
   private String[] BC01VY2_A14528ogReferen ;
   private String[] BC01VY2_A14511ogReclam ;
   private String[] BC01VY2_A14518ogLote ;
   private String[] BC01VY2_A14512ogJogo ;
   private String[] BC01VY2_A14513ogPoleg ;
   private String[] BC01VY2_A14514ogFio ;
   private String[] BC01VY2_A14560ogFio_ ;
   private String[] BC01VY2_A14515ogMaqui ;
   private String[] BC01VY2_A14516ogEntrada ;
   private String[] BC01VY2_A14517ogVossaR ;
   private String[] BC01VY2_A14519ogArtiCR ;
   private String[] BC01VY2_A14520ogArtiAC ;
   private int[] BC01VY2_A14521ogARecCod ;
   private String[] BC01VY2_A14554ogLocaliza ;
   private String[] BC01VY2_A14559ogLocalizc ;
   private long[] BC01VY3_A14503ogLinha ;
   private String[] BC01VY3_A14504ogEmprCod ;
   private long[] BC01VY3_A14505ogCliCod ;
   private long[] BC01VY3_A14522ogNmrGuia ;
   private short[] BC01VY3_A14523ogSerie ;
   private java.util.Date[] BC01VY3_A14506ogFecha ;
   private String[] BC01VY3_A14507ogCodArt ;
   private short[] BC01VY3_A14508ogRolos ;
   private short[] BC01VY3_A14556ogRolos_ ;
   private java.math.BigDecimal[] BC01VY3_A14509ogQuant ;
   private java.math.BigDecimal[] BC01VY3_A14557ogQuant_ ;
   private String[] BC01VY3_A14510ogUnidad ;
   private String[] BC01VY3_A14558ogUnidad_ ;
   private String[] BC01VY3_A14528ogReferen ;
   private String[] BC01VY3_A14511ogReclam ;
   private String[] BC01VY3_A14518ogLote ;
   private String[] BC01VY3_A14512ogJogo ;
   private String[] BC01VY3_A14513ogPoleg ;
   private String[] BC01VY3_A14514ogFio ;
   private String[] BC01VY3_A14560ogFio_ ;
   private String[] BC01VY3_A14515ogMaqui ;
   private String[] BC01VY3_A14516ogEntrada ;
   private String[] BC01VY3_A14517ogVossaR ;
   private String[] BC01VY3_A14519ogArtiCR ;
   private String[] BC01VY3_A14520ogArtiAC ;
   private int[] BC01VY3_A14521ogARecCod ;
   private String[] BC01VY3_A14554ogLocaliza ;
   private String[] BC01VY3_A14559ogLocalizc ;
   private boolean[] BC01VY2_n14522ogNmrGuia ;
   private boolean[] BC01VY2_n14523ogSerie ;
   private boolean[] BC01VY2_n14506ogFecha ;
   private boolean[] BC01VY2_n14507ogCodArt ;
   private boolean[] BC01VY2_n14508ogRolos ;
   private boolean[] BC01VY2_n14556ogRolos_ ;
   private boolean[] BC01VY2_n14509ogQuant ;
   private boolean[] BC01VY2_n14557ogQuant_ ;
   private boolean[] BC01VY2_n14510ogUnidad ;
   private boolean[] BC01VY2_n14558ogUnidad_ ;
   private boolean[] BC01VY2_n14528ogReferen ;
   private boolean[] BC01VY2_n14511ogReclam ;
   private boolean[] BC01VY2_n14518ogLote ;
   private boolean[] BC01VY2_n14512ogJogo ;
   private boolean[] BC01VY2_n14513ogPoleg ;
   private boolean[] BC01VY2_n14514ogFio ;
   private boolean[] BC01VY2_n14560ogFio_ ;
   private boolean[] BC01VY2_n14515ogMaqui ;
   private boolean[] BC01VY2_n14516ogEntrada ;
   private boolean[] BC01VY2_n14517ogVossaR ;
   private boolean[] BC01VY2_n14519ogArtiCR ;
   private boolean[] BC01VY2_n14520ogArtiAC ;
   private boolean[] BC01VY2_n14521ogARecCod ;
   private boolean[] BC01VY2_n14554ogLocaliza ;
   private boolean[] BC01VY2_n14559ogLocalizc ;
   private boolean[] BC01VY3_n14522ogNmrGuia ;
   private boolean[] BC01VY3_n14523ogSerie ;
   private boolean[] BC01VY3_n14506ogFecha ;
   private boolean[] BC01VY3_n14507ogCodArt ;
   private boolean[] BC01VY3_n14508ogRolos ;
   private boolean[] BC01VY3_n14556ogRolos_ ;
   private boolean[] BC01VY3_n14509ogQuant ;
   private boolean[] BC01VY3_n14557ogQuant_ ;
   private boolean[] BC01VY3_n14510ogUnidad ;
   private boolean[] BC01VY3_n14558ogUnidad_ ;
   private boolean[] BC01VY3_n14528ogReferen ;
   private boolean[] BC01VY3_n14511ogReclam ;
   private boolean[] BC01VY3_n14518ogLote ;
   private boolean[] BC01VY3_n14512ogJogo ;
   private boolean[] BC01VY3_n14513ogPoleg ;
   private boolean[] BC01VY3_n14514ogFio ;
   private boolean[] BC01VY3_n14560ogFio_ ;
   private boolean[] BC01VY3_n14515ogMaqui ;
   private boolean[] BC01VY3_n14516ogEntrada ;
   private boolean[] BC01VY3_n14517ogVossaR ;
   private boolean[] BC01VY3_n14519ogArtiCR ;
   private boolean[] BC01VY3_n14520ogArtiAC ;
   private boolean[] BC01VY3_n14521ogARecCod ;
   private boolean[] BC01VY3_n14554ogLocaliza ;
   private boolean[] BC01VY3_n14559ogLocalizc ;
}

final  class ogguiaimport_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ogguiaimport_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ogguiaimport_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ogguiaimport_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01VY2", "SELECT ogLinha, ogEmprCod, ogCliCod, ogNmrGuia, ogSerie, ogFecha, ogCodArt, ogRolos, ogRolos_, ogQuant, ogQuant_, ogUnidad, ogUnidad_, ogReferen, ogReclam, ogLote, ogJogo, ogPoleg, ogFio, ogFio_, ogMaqui, ogEntrada, ogVossaR, ogArtiCR, ogArtiAC, ogARecCod, ogLocaliza, ogLocalizc FROM TXPOGGUIA WHERE ogLinha = ? AND ogEmprCod = ? AND ogCliCod = ?  FOR UPDATE OF ogNmrGuia, ogSerie, ogFecha, ogCodArt, ogRolos, ogRolos_, ogQuant, ogQuant_, ogUnidad, ogUnidad_, ogReferen, ogReclam, ogLote, ogJogo, ogPoleg, ogFio, ogFio_, ogMaqui, ogEntrada, ogVossaR, ogArtiCR, ogArtiAC, ogARecCod, ogLocaliza, ogLocalizc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VY3", "SELECT ogLinha, ogEmprCod, ogCliCod, ogNmrGuia, ogSerie, ogFecha, ogCodArt, ogRolos, ogRolos_, ogQuant, ogQuant_, ogUnidad, ogUnidad_, ogReferen, ogReclam, ogLote, ogJogo, ogPoleg, ogFio, ogFio_, ogMaqui, ogEntrada, ogVossaR, ogArtiCR, ogArtiAC, ogARecCod, ogLocaliza, ogLocalizc FROM TXPOGGUIA WHERE ogLinha = ? AND ogEmprCod = ? AND ogCliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VY4", "SELECT /*+ FIRST_ROWS(100) */ TM1.ogLinha, TM1.ogEmprCod, TM1.ogCliCod, TM1.ogNmrGuia, TM1.ogSerie, TM1.ogFecha, TM1.ogCodArt, TM1.ogRolos, TM1.ogRolos_, TM1.ogQuant, TM1.ogQuant_, TM1.ogUnidad, TM1.ogUnidad_, TM1.ogReferen, TM1.ogReclam, TM1.ogLote, TM1.ogJogo, TM1.ogPoleg, TM1.ogFio, TM1.ogFio_, TM1.ogMaqui, TM1.ogEntrada, TM1.ogVossaR, TM1.ogArtiCR, TM1.ogArtiAC, TM1.ogARecCod, TM1.ogLocaliza, TM1.ogLocalizc FROM TXPOGGUIA TM1 WHERE TM1.ogLinha = ? and TM1.ogEmprCod = ? and TM1.ogCliCod = ? ORDER BY TM1.ogLinha, TM1.ogEmprCod, TM1.ogCliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VY5", "SELECT /*+ FIRST_ROWS(1) */ ogLinha, ogEmprCod, ogCliCod FROM TXPOGGUIA WHERE ogLinha = ? AND ogEmprCod = ? AND ogCliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VY6", "SELECT ogLinha, ogEmprCod, ogCliCod, ogNmrGuia, ogSerie, ogFecha, ogCodArt, ogRolos, ogRolos_, ogQuant, ogQuant_, ogUnidad, ogUnidad_, ogReferen, ogReclam, ogLote, ogJogo, ogPoleg, ogFio, ogFio_, ogMaqui, ogEntrada, ogVossaR, ogArtiCR, ogArtiAC, ogARecCod, ogLocaliza, ogLocalizc FROM TXPOGGUIA WHERE ogLinha = ? AND ogEmprCod = ? AND ogCliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01VY7", "SELECT ogLinha, ogEmprCod, ogCliCod, ogNmrGuia, ogSerie, ogFecha, ogCodArt, ogRolos, ogRolos_, ogQuant, ogQuant_, ogUnidad, ogUnidad_, ogReferen, ogReclam, ogLote, ogJogo, ogPoleg, ogFio, ogFio_, ogMaqui, ogEntrada, ogVossaR, ogArtiCR, ogArtiAC, ogARecCod, ogLocaliza, ogLocalizc FROM TXPOGGUIA WHERE ogLinha = ? AND ogEmprCod = ? AND ogCliCod = ?  FOR UPDATE OF ogNmrGuia, ogSerie, ogFecha, ogCodArt, ogRolos, ogRolos_, ogQuant, ogQuant_, ogUnidad, ogUnidad_, ogReferen, ogReclam, ogLote, ogJogo, ogPoleg, ogFio, ogFio_, ogMaqui, ogEntrada, ogVossaR, ogArtiCR, ogArtiAC, ogARecCod, ogLocaliza, ogLocalizc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01VY8", "INSERT INTO TXPOGGUIA(ogLinha, ogEmprCod, ogCliCod, ogNmrGuia, ogSerie, ogFecha, ogCodArt, ogRolos, ogRolos_, ogQuant, ogQuant_, ogUnidad, ogUnidad_, ogReferen, ogReclam, ogLote, ogJogo, ogPoleg, ogFio, ogFio_, ogMaqui, ogEntrada, ogVossaR, ogArtiCR, ogArtiAC, ogARecCod, ogLocaliza, ogLocalizc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPOGGUIA")
         ,new UpdateCursor("BC01VY9", "UPDATE TXPOGGUIA SET ogNmrGuia=?, ogSerie=?, ogFecha=?, ogCodArt=?, ogRolos=?, ogRolos_=?, ogQuant=?, ogQuant_=?, ogUnidad=?, ogUnidad_=?, ogReferen=?, ogReclam=?, ogLote=?, ogJogo=?, ogPoleg=?, ogFio=?, ogFio_=?, ogMaqui=?, ogEntrada=?, ogVossaR=?, ogArtiCR=?, ogArtiAC=?, ogARecCod=?, ogLocaliza=?, ogLocalizc=?  WHERE ogLinha = ? AND ogEmprCod = ? AND ogCliCod = ?", GX_NOMASK, "TXPOGGUIA")
         ,new UpdateCursor("BC01VY10", "DELETE FROM TXPOGGUIA  WHERE ogLinha = ? AND ogEmprCod = ? AND ogCliCod = ?", GX_NOMASK, "TXPOGGUIA")
         ,new ForEachCursor("BC01VY11", "SELECT /*+ FIRST_ROWS(100) */ TM1.ogLinha, TM1.ogEmprCod, TM1.ogCliCod, TM1.ogNmrGuia, TM1.ogSerie, TM1.ogFecha, TM1.ogCodArt, TM1.ogRolos, TM1.ogRolos_, TM1.ogQuant, TM1.ogQuant_, TM1.ogUnidad, TM1.ogUnidad_, TM1.ogReferen, TM1.ogReclam, TM1.ogLote, TM1.ogJogo, TM1.ogPoleg, TM1.ogFio, TM1.ogFio_, TM1.ogMaqui, TM1.ogEntrada, TM1.ogVossaR, TM1.ogArtiCR, TM1.ogArtiAC, TM1.ogARecCod, TM1.ogLocaliza, TM1.ogLocalizc FROM TXPOGGUIA TM1 WHERE TM1.ogLinha = ? and TM1.ogEmprCod = ? and TM1.ogCliCod = ? ORDER BY TM1.ogLinha, TM1.ogEmprCod, TM1.ogCliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
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
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(4, ((Number) parms[4]).longValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 100);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[14]).shortValue());
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
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[24], 16);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[30], 4);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[32], 4);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[34], 4);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 4);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[38], 15);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[40], 10);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[42], 100);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[44], 100);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[46], 100);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[48]).intValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[50], 10);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[52], 10);
               }
               return;
            case 7 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 100);
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 16);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 4);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 4);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 4);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 4);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 15);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 10);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 100);
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
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[43], 100);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[45]).intValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[47], 10);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 10);
               }
               stmt.setLong(26, ((Number) parms[50]).longValue());
               stmt.setVarchar(27, (String)parms[51], 10, false);
               stmt.setLong(28, ((Number) parms[52]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 10, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

