package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdevpiecopy1_bc extends GXWebPanel implements IGxSilentTrn
{
   public tdevpiecopy1_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdevpiecopy1_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdevpiecopy1_bc.class ));
   }

   public tdevpiecopy1_bc( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1OU31( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1OU31( ) ;
      standaloneModal( ) ;
      addRow1OU31( ) ;
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
            Z396EmprCod = A396EmprCod ;
            Z323DevGenCod = A323DevGenCod ;
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

   public void confirm_1OU0( )
   {
      beforeValidate1OU31( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1OU31( ) ;
         }
         else
         {
            checkExtendedTable1OU31( ) ;
            if ( AnyError == 0 )
            {
               zm1OU31( 52) ;
               zm1OU31( 53) ;
               zm1OU31( 54) ;
               zm1OU31( 55) ;
               zm1OU31( 56) ;
            }
            closeExtendedTableCursors1OU31( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode31 = Gx_mode ;
         confirm_1OU451( ) ;
         if ( AnyError == 0 )
         {
            confirm_1OU192( ) ;
            if ( AnyError == 0 )
            {
               /* Restore parent mode. */
               Gx_mode = sMode31 ;
               IsConfirmed = (short)(1) ;
            }
         }
         /* Restore parent mode. */
         Gx_mode = sMode31 ;
      }
   }

   public void confirm_1OU192( )
   {
      s1304DevUlin = O1304DevUlin ;
      n1304DevUlin = false ;
      nGXsfl_192_idx = 0 ;
      while ( nGXsfl_192_idx < bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level2().size() )
      {
         readRow1OU192( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound192 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_192 != 0 ) )
         {
            getKey1OU192( ) ;
            if ( isIns( ) && ! isDlt( ) )
            {
               if ( RcdFound192 == 0 )
               {
                  Gx_mode = "INS" ;
                  beforeValidate1OU192( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1OU192( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1OU192( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                     }
                     O1304DevUlin = A1304DevUlin ;
                     n1304DevUlin = false ;
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound192 != 0 )
               {
                  if ( isDlt( ) )
                  {
                     Gx_mode = "DLT" ;
                     getByPrimaryKey1OU192( ) ;
                     load1OU192( ) ;
                     beforeValidate1OU192( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1OU192( ) ;
                        O1304DevUlin = A1304DevUlin ;
                        n1304DevUlin = false ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_192 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        beforeValidate1OU192( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1OU192( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1OU192( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                           }
                           O1304DevUlin = A1304DevUlin ;
                           n1304DevUlin = false ;
                        }
                     }
                  }
               }
               else
               {
                  if ( ! isDlt( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            VarsToRow192( ((app.SdtTDevPieCopy1_Level2Item)bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level2().elementAt(-1+nGXsfl_192_idx))) ;
         }
      }
      O1304DevUlin = s1304DevUlin ;
      n1304DevUlin = false ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1OU451( )
   {
      s326DevGenPie = O326DevGenPie ;
      n326DevGenPie = false ;
      s328DevGenUni = O328DevGenUni ;
      n328DevGenUni = false ;
      s54AlbRPieUti = O54AlbRPieUti ;
      s60AlbRUniUti = O60AlbRUniUti ;
      s3066AlbDevPUni = O3066AlbDevPUni ;
      s5278AlbDevPPie = O5278AlbDevPPie ;
      sV14KilAnt = OV14KilAnt ;
      sV15MetAnt = OV15MetAnt ;
      sV16PieAnt = OV16PieAnt ;
      sV17Kilos = OV17Kilos ;
      sV18Metros = OV18Metros ;
      sV19Piezas = OV19Piezas ;
      sV9AlbRPieDis = OV9AlbRPieDis ;
      sV10AlbRUniDis = OV10AlbRUniDis ;
      s47AlbREst = O47AlbREst ;
      nGXsfl_451_idx = 0 ;
      while ( nGXsfl_451_idx < bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level1().size() )
      {
         readRow1OU451( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound451 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_451 != 0 ) )
         {
            getKey1OU451( ) ;
            if ( isIns( ) && ! isDlt( ) )
            {
               if ( RcdFound451 == 0 )
               {
                  Gx_mode = "INS" ;
                  beforeValidate1OU451( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1OU451( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1OU451( 58) ;
                     }
                     closeExtendedTableCursors1OU451( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                     }
                     O326DevGenPie = A326DevGenPie ;
                     n326DevGenPie = false ;
                     O328DevGenUni = A328DevGenUni ;
                     n328DevGenUni = false ;
                     O54AlbRPieUti = A54AlbRPieUti ;
                     O60AlbRUniUti = A60AlbRUniUti ;
                     O3066AlbDevPUni = A3066AlbDevPUni ;
                     O5278AlbDevPPie = A5278AlbDevPPie ;
                     OV14KilAnt = AV14KilAnt ;
                     OV15MetAnt = AV15MetAnt ;
                     OV16PieAnt = AV16PieAnt ;
                     OV17Kilos = AV17Kilos ;
                     OV18Metros = AV18Metros ;
                     OV19Piezas = AV19Piezas ;
                     OV9AlbRPieDis = AV9AlbRPieDis ;
                     OV10AlbRUniDis = AV10AlbRUniDis ;
                     O47AlbREst = A47AlbREst ;
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound451 != 0 )
               {
                  if ( isDlt( ) )
                  {
                     Gx_mode = "DLT" ;
                     getByPrimaryKey1OU451( ) ;
                     load1OU451( ) ;
                     beforeValidate1OU451( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1OU451( ) ;
                        O326DevGenPie = A326DevGenPie ;
                        n326DevGenPie = false ;
                        O328DevGenUni = A328DevGenUni ;
                        n328DevGenUni = false ;
                        O54AlbRPieUti = A54AlbRPieUti ;
                        O60AlbRUniUti = A60AlbRUniUti ;
                        O3066AlbDevPUni = A3066AlbDevPUni ;
                        O5278AlbDevPPie = A5278AlbDevPPie ;
                        OV14KilAnt = AV14KilAnt ;
                        OV15MetAnt = AV15MetAnt ;
                        OV16PieAnt = AV16PieAnt ;
                        OV17Kilos = AV17Kilos ;
                        OV18Metros = AV18Metros ;
                        OV19Piezas = AV19Piezas ;
                        OV9AlbRPieDis = AV9AlbRPieDis ;
                        OV10AlbRUniDis = AV10AlbRUniDis ;
                        O47AlbREst = A47AlbREst ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_451 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        beforeValidate1OU451( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1OU451( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1OU451( 58) ;
                           }
                           closeExtendedTableCursors1OU451( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                           }
                           O326DevGenPie = A326DevGenPie ;
                           n326DevGenPie = false ;
                           O328DevGenUni = A328DevGenUni ;
                           n328DevGenUni = false ;
                           O54AlbRPieUti = A54AlbRPieUti ;
                           O60AlbRUniUti = A60AlbRUniUti ;
                           O3066AlbDevPUni = A3066AlbDevPUni ;
                           O5278AlbDevPPie = A5278AlbDevPPie ;
                           OV14KilAnt = AV14KilAnt ;
                           OV15MetAnt = AV15MetAnt ;
                           OV16PieAnt = AV16PieAnt ;
                           OV17Kilos = AV17Kilos ;
                           OV18Metros = AV18Metros ;
                           OV19Piezas = AV19Piezas ;
                           OV9AlbRPieDis = AV9AlbRPieDis ;
                           OV10AlbRUniDis = AV10AlbRUniDis ;
                           O47AlbREst = A47AlbREst ;
                        }
                     }
                  }
               }
               else
               {
                  if ( ! isDlt( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            VarsToRow451( ((app.SdtTDevPieCopy1_Level1Item)bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level1().elementAt(-1+nGXsfl_451_idx))) ;
         }
      }
      O326DevGenPie = s326DevGenPie ;
      n326DevGenPie = false ;
      O328DevGenUni = s328DevGenUni ;
      n328DevGenUni = false ;
      O54AlbRPieUti = s54AlbRPieUti ;
      O60AlbRUniUti = s60AlbRUniUti ;
      O3066AlbDevPUni = s3066AlbDevPUni ;
      O5278AlbDevPPie = s5278AlbDevPPie ;
      OV14KilAnt = sV14KilAnt ;
      OV15MetAnt = sV15MetAnt ;
      OV16PieAnt = sV16PieAnt ;
      OV17Kilos = sV17Kilos ;
      OV18Metros = sV18Metros ;
      OV19Piezas = sV19Piezas ;
      OV9AlbRPieDis = sV9AlbRPieDis ;
      OV10AlbRUniDis = sV10AlbRUniDis ;
      O47AlbREst = s47AlbREst ;
      /* Start of After( level) rules */
      if ( ( DecimalUtil.compareTo(A328DevGenUni, A3066AlbDevPUni) != 0 ) && ( A3066AlbDevPUni.doubleValue() != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No suma las unidades", ""), 0, "");
      }
      if ( ( A326DevGenPie != A5278AlbDevPPie ) && ( A5278AlbDevPPie != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No suma la cantidad de piezas", ""), 0, "");
      }
      /* End of After( level) rules */
   }

   public void e111OU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tdevpiecopy1_bc.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdevpiecopy1_bc.this.A396EmprCod = GXv_char2[0] ;
      tdevpiecopy1_bc.this.AV7EmprNom = GXv_char3[0] ;
      tdevpiecopy1_bc.this.AV8UsurCod = GXv_char4[0] ;
   }

   public void e121OU2( )
   {
      /* 'Seleccionar PIEZAS' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.webwdetpie", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A2159AlbRecPie)),GXutil.URLEncode(DecimalUtil.decToString(A2155AlbRecKgm)),GXutil.URLEncode(DecimalUtil.decToString(A2157AlbRecMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV58AlbRecAnh,3,0))}, new String[] {"EmprCod","AlbRecCod","AlbRecPie","DisPieKil","DisPieMet","DisPieAnc"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void zm1OU31( int GX_JID )
   {
      if ( ( GX_JID == 51 ) || ( GX_JID == 0 ) )
      {
         Z328DevGenUni = A328DevGenUni ;
         Z326DevGenPie = A326DevGenPie ;
         Z325DevGenFec = A325DevGenFec ;
         Z6288DevGenDom = A6288DevGenDom ;
         Z324DevGenEst = A324DevGenEst ;
         Z1304DevUlin = A1304DevUlin ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z327DevGenTrn = A327DevGenTrn ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
      if ( ( GX_JID == 52 ) || ( GX_JID == 0 ) )
      {
         Z407EmprNom = A407EmprNom ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
      if ( ( GX_JID == 53 ) || ( GX_JID == 0 ) )
      {
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z47AlbREst = A47AlbREst ;
         Z252CliCod = A252CliCod ;
         Z45AlbRef = A45AlbRef ;
         Z56AlbRUni = A56AlbRUni ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
      if ( ( GX_JID == 54 ) || ( GX_JID == 0 ) )
      {
         Z279CliNom = A279CliNom ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
      if ( ( GX_JID == 55 ) || ( GX_JID == 0 ) )
      {
         Z329DevTrnNom = A329DevTrnNom ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
      if ( ( GX_JID == 56 ) || ( GX_JID == 0 ) )
      {
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
      if ( GX_JID == -51 )
      {
         Z323DevGenCod = A323DevGenCod ;
         Z328DevGenUni = A328DevGenUni ;
         Z326DevGenPie = A326DevGenPie ;
         Z325DevGenFec = A325DevGenFec ;
         Z6288DevGenDom = A6288DevGenDom ;
         Z252CliCod = A252CliCod ;
         Z324DevGenEst = A324DevGenEst ;
         Z1304DevUlin = A1304DevUlin ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z327DevGenTrn = A327DevGenTrn ;
         Z407EmprNom = A407EmprNom ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z47AlbREst = A47AlbREst ;
         Z45AlbRef = A45AlbRef ;
         Z56AlbRUni = A56AlbRUni ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z279CliNom = A279CliNom ;
         Z329DevTrnNom = A329DevTrnNom ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC01OU17 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = BC01OU17_A407EmprNom[0] ;
      n407EmprNom = BC01OU17_n407EmprNom[0] ;
      pr_default.close(14);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         AV20Modo = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
      }
      else
      {
         if ( isDlt( )  )
         {
            AV20Modo = httpContext.getMessage( httpContext.getMessage( "DEL", ""), "") ;
         }
         else
         {
            if ( isUpd( )  )
            {
               AV20Modo = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
            }
         }
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A325DevGenFec)) && ( Gx_BScreen == 0 ) )
      {
         A325DevGenFec = GXutil.today( ) ;
         n325DevGenFec = false ;
      }
      if ( true )
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV10AlbRUniDis = AV12AlbRUDis ;
         }
      }
      if ( true )
      {
         AV14KilAnt = O328DevGenUni ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV14KilAnt = O328DevGenUni ;
         }
      }
      if ( true )
      {
         AV15MetAnt = O328DevGenUni ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV15MetAnt = O328DevGenUni ;
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV17Kilos = A328DevGenUni ;
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV18Metros = A328DevGenUni ;
      }
      if ( true )
      {
         AV9AlbRPieDis = A51AlbRPieDis ;
      }
      else
      {
         if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
         {
            AV9AlbRPieDis = AV11AlbRPDis ;
         }
      }
      AV16PieAnt = O326DevGenPie ;
      AV19Piezas = A326DevGenPie ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         AV61oldDevGenFec = O325DevGenFec ;
      }
   }

   public void load1OU31( )
   {
      /* Using cursor BC01OU19 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A328DevGenUni = BC01OU19_A328DevGenUni[0] ;
         n328DevGenUni = BC01OU19_n328DevGenUni[0] ;
         A326DevGenPie = BC01OU19_A326DevGenPie[0] ;
         n326DevGenPie = BC01OU19_n326DevGenPie[0] ;
         A60AlbRUniUti = BC01OU19_A60AlbRUniUti[0] ;
         A54AlbRPieUti = BC01OU19_A54AlbRPieUti[0] ;
         A47AlbREst = BC01OU19_A47AlbREst[0] ;
         A407EmprNom = BC01OU19_A407EmprNom[0] ;
         n407EmprNom = BC01OU19_n407EmprNom[0] ;
         A325DevGenFec = BC01OU19_A325DevGenFec[0] ;
         n325DevGenFec = BC01OU19_n325DevGenFec[0] ;
         A6288DevGenDom = BC01OU19_A6288DevGenDom[0] ;
         n6288DevGenDom = BC01OU19_n6288DevGenDom[0] ;
         A252CliCod = BC01OU19_A252CliCod[0] ;
         n252CliCod = BC01OU19_n252CliCod[0] ;
         A279CliNom = BC01OU19_A279CliNom[0] ;
         A45AlbRef = BC01OU19_A45AlbRef[0] ;
         A329DevTrnNom = BC01OU19_A329DevTrnNom[0] ;
         n329DevTrnNom = BC01OU19_n329DevTrnNom[0] ;
         A56AlbRUni = BC01OU19_A56AlbRUni[0] ;
         A52AlbRPieEnt = BC01OU19_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = BC01OU19_A58AlbRUniEnt[0] ;
         A324DevGenEst = BC01OU19_A324DevGenEst[0] ;
         n324DevGenEst = BC01OU19_n324DevGenEst[0] ;
         A1304DevUlin = BC01OU19_A1304DevUlin[0] ;
         n1304DevUlin = BC01OU19_n1304DevUlin[0] ;
         A44AlbRecCod = BC01OU19_A44AlbRecCod[0] ;
         n44AlbRecCod = BC01OU19_n44AlbRecCod[0] ;
         A327DevGenTrn = BC01OU19_A327DevGenTrn[0] ;
         n327DevGenTrn = BC01OU19_n327DevGenTrn[0] ;
         A3066AlbDevPUni = BC01OU19_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = BC01OU19_A5278AlbDevPPie[0] ;
         zm1OU31( -51) ;
      }
      pr_default.close(15);
      onLoadActions1OU31( ) ;
   }

   public void onLoadActions1OU31( )
   {
      O54AlbRPieUti = A54AlbRPieUti ;
      O60AlbRUniUti = A60AlbRUniUti ;
      O3066AlbDevPUni = A3066AlbDevPUni ;
      O5278AlbDevPPie = A5278AlbDevPPie ;
      if ( isDlt( )  )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti-O326DevGenPie) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti+A326DevGenPie-O326DevGenPie) ;
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         A47AlbREst = (byte)(1) ;
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            A47AlbREst = (byte)(0) ;
         }
      }
      AV61oldDevGenFec = O325DevGenFec ;
   }

   public void checkExtendedTable1OU31( )
   {
      nIsDirty_31 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC01OU20 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
      }
      A60AlbRUniUti = BC01OU20_A60AlbRUniUti[0] ;
      A54AlbRPieUti = BC01OU20_A54AlbRPieUti[0] ;
      A47AlbREst = BC01OU20_A47AlbREst[0] ;
      A252CliCod = BC01OU20_A252CliCod[0] ;
      n252CliCod = BC01OU20_n252CliCod[0] ;
      A45AlbRef = BC01OU20_A45AlbRef[0] ;
      A56AlbRUni = BC01OU20_A56AlbRUni[0] ;
      A52AlbRPieEnt = BC01OU20_A52AlbRPieEnt[0] ;
      A58AlbRUniEnt = BC01OU20_A58AlbRUniEnt[0] ;
      nIsDirty_31 = (short)(1) ;
      O54AlbRPieUti = A54AlbRPieUti ;
      nIsDirty_31 = (short)(1) ;
      O60AlbRUniUti = A60AlbRUniUti ;
      pr_default.close(16);
      if ( isDlt( )  )
      {
         nIsDirty_31 = (short)(1) ;
         A54AlbRPieUti = (int)(O54AlbRPieUti-O326DevGenPie) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_31 = (short)(1) ;
            A54AlbRPieUti = (int)(O54AlbRPieUti+A326DevGenPie-O326DevGenPie) ;
         }
      }
      nIsDirty_31 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_31 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_31 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            nIsDirty_31 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         nIsDirty_31 = (short)(1) ;
         A47AlbREst = (byte)(1) ;
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            nIsDirty_31 = (short)(1) ;
            A47AlbREst = (byte)(0) ;
         }
      }
      /* Using cursor BC01OU21 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = BC01OU21_A279CliNom[0] ;
      pr_default.close(17);
      /* Using cursor BC01OU22 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A327DevGenTrn) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevGen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVGENTRN");
            AnyError = (short)(1) ;
         }
      }
      A329DevTrnNom = BC01OU22_A329DevTrnNom[0] ;
      n329DevTrnNom = BC01OU22_n329DevTrnNom[0] ;
      pr_default.close(18);
      /* Using cursor BC01OU24 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A3066AlbDevPUni = BC01OU24_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = BC01OU24_A5278AlbDevPPie[0] ;
      }
      else
      {
         nIsDirty_31 = (short)(1) ;
         A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
         nIsDirty_31 = (short)(1) ;
         A5278AlbDevPPie = (short)(0) ;
      }
      pr_default.close(19);
      AV61oldDevGenFec = O325DevGenFec ;
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A44AlbRecCod ;
         GXv_int6[0] = AV9AlbRPieDis ;
         GXv_decimal7[0] = AV10AlbRUniDis ;
         GXv_int8[0] = AV11AlbRPDis ;
         GXv_decimal9[0] = AV12AlbRUDis ;
         GXv_char3[0] = AV13AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_decimal7, GXv_int8, GXv_decimal9, GXv_char3) ;
         tdevpiecopy1_bc.this.A396EmprCod = GXv_char4[0] ;
         tdevpiecopy1_bc.this.A44AlbRecCod = GXv_int5[0] ;
         tdevpiecopy1_bc.this.AV9AlbRPieDis = GXv_int6[0] ;
         tdevpiecopy1_bc.this.AV10AlbRUniDis = GXv_decimal7[0] ;
         tdevpiecopy1_bc.this.AV11AlbRPDis = GXv_int8[0] ;
         tdevpiecopy1_bc.this.AV12AlbRUDis = GXv_decimal9[0] ;
         tdevpiecopy1_bc.this.AV13AlbRUni = GXv_char3[0] ;
      }
      if ( ( A6288DevGenDom > 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_int10[0] = A6288DevGenDom ;
         GXv_char3[0] = AV65Err_att ;
         new app.pexdomenvio(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int10, GXv_char3) ;
         tdevpiecopy1_bc.this.A396EmprCod = GXv_char4[0] ;
         tdevpiecopy1_bc.this.A252CliCod = GXv_int8[0] ;
         tdevpiecopy1_bc.this.A6288DevGenDom = GXv_int10[0] ;
         tdevpiecopy1_bc.this.AV65Err_att = GXv_char3[0] ;
      }
      if ( ( A6288DevGenDom > 0 ) && true /* After */ && ( GXutil.strcmp(AV65Err_att, "") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV65Err_att, 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1OU31( )
   {
      pr_default.close(9);
      pr_default.close(17);
      pr_default.close(18);
      pr_default.close(19);
   }

   public void enableDisable( )
   {
   }

   public void getKey1OU31( )
   {
      /* Using cursor BC01OU25 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound31 = (short)(1) ;
      }
      else
      {
         RcdFound31 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01OU26 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(21) != 101) && ( GXutil.strcmp(BC01OU26_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OU31( 51) ;
         RcdFound31 = (short)(1) ;
         A323DevGenCod = BC01OU26_A323DevGenCod[0] ;
         A328DevGenUni = BC01OU26_A328DevGenUni[0] ;
         n328DevGenUni = BC01OU26_n328DevGenUni[0] ;
         A326DevGenPie = BC01OU26_A326DevGenPie[0] ;
         n326DevGenPie = BC01OU26_n326DevGenPie[0] ;
         A325DevGenFec = BC01OU26_A325DevGenFec[0] ;
         n325DevGenFec = BC01OU26_n325DevGenFec[0] ;
         A6288DevGenDom = BC01OU26_A6288DevGenDom[0] ;
         n6288DevGenDom = BC01OU26_n6288DevGenDom[0] ;
         A324DevGenEst = BC01OU26_A324DevGenEst[0] ;
         n324DevGenEst = BC01OU26_n324DevGenEst[0] ;
         A1304DevUlin = BC01OU26_A1304DevUlin[0] ;
         n1304DevUlin = BC01OU26_n1304DevUlin[0] ;
         A44AlbRecCod = BC01OU26_A44AlbRecCod[0] ;
         n44AlbRecCod = BC01OU26_n44AlbRecCod[0] ;
         A327DevGenTrn = BC01OU26_A327DevGenTrn[0] ;
         n327DevGenTrn = BC01OU26_n327DevGenTrn[0] ;
         O1304DevUlin = A1304DevUlin ;
         n1304DevUlin = false ;
         O328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
         O326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         O325DevGenFec = A325DevGenFec ;
         n325DevGenFec = false ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1OU31( ) ;
         if ( AnyError == 1 )
         {
            RcdFound31 = (short)(0) ;
            initializeNonKey1OU31( ) ;
         }
         Gx_mode = sMode31 ;
      }
      else
      {
         RcdFound31 = (short)(0) ;
         initializeNonKey1OU31( ) ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode31 ;
      }
      pr_default.close(21);
   }

   public void getEqualNoModal( )
   {
      getKey1OU31( ) ;
      if ( RcdFound31 == 0 )
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
      confirm_1OU0( ) ;
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

   public void checkOptimisticConcurrency1OU31( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01OU27 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(22) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVGEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(22) == 101) || ( DecimalUtil.compareTo(Z328DevGenUni, BC01OU27_A328DevGenUni[0]) != 0 ) || ( Z326DevGenPie != BC01OU27_A326DevGenPie[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z325DevGenFec), GXutil.resetTime(BC01OU27_A325DevGenFec[0])) ) || ( Z6288DevGenDom != BC01OU27_A6288DevGenDom[0] ) || ( Z324DevGenEst != BC01OU27_A324DevGenEst[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1304DevUlin != BC01OU27_A1304DevUlin[0] ) || ( Z44AlbRecCod != BC01OU27_A44AlbRecCod[0] ) || ( Z327DevGenTrn != BC01OU27_A327DevGenTrn[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVGEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor BC01OU28 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(23) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( DecimalUtil.compareTo(Z60AlbRUniUti, BC01OU28_A60AlbRUniUti[0]) != 0 ) || ( Z47AlbREst != BC01OU28_A47AlbREst[0] ) || ( Z252CliCod != BC01OU28_A252CliCod[0] ) || ( GXutil.strcmp(Z45AlbRef, BC01OU28_A45AlbRef[0]) != 0 ) || ( GXutil.strcmp(Z56AlbRUni, BC01OU28_A56AlbRUni[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z52AlbRPieEnt != BC01OU28_A52AlbRPieEnt[0] ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, BC01OU28_A58AlbRUniEnt[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OU31( )
   {
      beforeValidate1OU31( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OU31( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OU31( 0) ;
         checkOptimisticConcurrency1OU31( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OU31( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OU31( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01OU29 */
                  pr_default.execute(24, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A323DevGenCod), Boolean.valueOf(n328DevGenUni), A328DevGenUni, Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n325DevGenFec), A325DevGenFec, Boolean.valueOf(n6288DevGenDom), Byte.valueOf(A6288DevGenDom), Boolean.valueOf(n324DevGenEst), Byte.valueOf(A324DevGenEst), Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( (pr_default.getStatus(24) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11OU31( ) ;
                     /* Start of After( Insert) rules */
                     if ( ! (0==A323DevGenCod) && true /* After */ && true /* Level */ )
                     {
                        httpContext.wjLoc = formatLink("app.webwdevpza", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A323DevGenCod,8,0)),GXutil.URLEncode(DecimalUtil.decToString(A328DevGenUni)),GXutil.URLEncode(GXutil.ltrimstr(A326DevGenPie,4,0)),GXutil.URLEncode(DecimalUtil.decToString(A60AlbRUniUti)),GXutil.URLEncode(GXutil.ltrimstr(A54AlbRPieUti,6,0))}, new String[] {"EmprCod","ALbRecCod","DevGenCod","DevGenUni","DevGenPie","AlbRUniUti","AlbRPieUti"})  ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1OU31( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                        }
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
            load1OU31( ) ;
         }
         endLevel1OU31( ) ;
      }
      closeExtendedTableCursors1OU31( ) ;
   }

   public void update1OU31( )
   {
      beforeValidate1OU31( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OU31( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OU31( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OU31( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1OU31( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01OU30 */
                  pr_default.execute(25, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n328DevGenUni), A328DevGenUni, Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n325DevGenFec), A325DevGenFec, Boolean.valueOf(n6288DevGenDom), Byte.valueOf(A6288DevGenDom), Boolean.valueOf(n324DevGenEst), Byte.valueOf(A324DevGenEst), Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn), A396EmprCod, Integer.valueOf(A323DevGenCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( (pr_default.getStatus(25) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVGEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1OU31( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11OU31( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1OU31( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
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
         }
         endLevel1OU31( ) ;
      }
      closeExtendedTableCursors1OU31( ) ;
   }

   public void deferredUpdate1OU31( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1OU31( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OU31( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OU31( ) ;
         afterConfirm1OU31( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OU31( ) ;
            if ( AnyError == 0 )
            {
               A326DevGenPie = O326DevGenPie ;
               n326DevGenPie = false ;
               A328DevGenUni = O328DevGenUni ;
               n328DevGenUni = false ;
               A54AlbRPieUti = O54AlbRPieUti ;
               A60AlbRUniUti = O60AlbRUniUti ;
               A3066AlbDevPUni = O3066AlbDevPUni ;
               A5278AlbDevPPie = O5278AlbDevPPie ;
               AV14KilAnt = OV14KilAnt ;
               AV15MetAnt = OV15MetAnt ;
               AV16PieAnt = OV16PieAnt ;
               AV17Kilos = OV17Kilos ;
               AV18Metros = OV18Metros ;
               AV19Piezas = OV19Piezas ;
               AV9AlbRPieDis = OV9AlbRPieDis ;
               AV10AlbRUniDis = OV10AlbRUniDis ;
               A47AlbREst = O47AlbREst ;
               scanKeyStart1OU451( ) ;
               while ( RcdFound451 != 0 )
               {
                  getByPrimaryKey1OU451( ) ;
                  delete1OU451( ) ;
                  scanKeyNext1OU451( ) ;
                  O326DevGenPie = A326DevGenPie ;
                  n326DevGenPie = false ;
                  O328DevGenUni = A328DevGenUni ;
                  n328DevGenUni = false ;
                  O54AlbRPieUti = A54AlbRPieUti ;
                  O60AlbRUniUti = A60AlbRUniUti ;
                  O3066AlbDevPUni = A3066AlbDevPUni ;
                  O5278AlbDevPPie = A5278AlbDevPPie ;
                  OV14KilAnt = AV14KilAnt ;
                  OV15MetAnt = AV15MetAnt ;
                  OV16PieAnt = AV16PieAnt ;
                  OV17Kilos = AV17Kilos ;
                  OV18Metros = AV18Metros ;
                  OV19Piezas = AV19Piezas ;
                  OV9AlbRPieDis = AV9AlbRPieDis ;
                  OV10AlbRUniDis = AV10AlbRUniDis ;
                  O47AlbREst = A47AlbREst ;
               }
               scanKeyEnd1OU451( ) ;
               A1304DevUlin = O1304DevUlin ;
               n1304DevUlin = false ;
               scanKeyStart1OU192( ) ;
               while ( RcdFound192 != 0 )
               {
                  getByPrimaryKey1OU192( ) ;
                  delete1OU192( ) ;
                  scanKeyNext1OU192( ) ;
                  O1304DevUlin = A1304DevUlin ;
                  n1304DevUlin = false ;
               }
               scanKeyEnd1OU192( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01OU31 */
                  pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11OU31( ) ;
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
      }
      sMode31 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1OU31( ) ;
      Gx_mode = sMode31 ;
   }

   public void onDeleteControls1OU31( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC01OU33 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            A3066AlbDevPUni = BC01OU33_A3066AlbDevPUni[0] ;
            A5278AlbDevPPie = BC01OU33_A5278AlbDevPPie[0] ;
         }
         else
         {
            A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
            A5278AlbDevPPie = (short)(0) ;
         }
         pr_default.close(27);
         AV61oldDevGenFec = O325DevGenFec ;
         /* Using cursor BC01OU34 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         zm1OU31( 53) ;
         A60AlbRUniUti = BC01OU34_A60AlbRUniUti[0] ;
         A54AlbRPieUti = BC01OU34_A54AlbRPieUti[0] ;
         A47AlbREst = BC01OU34_A47AlbREst[0] ;
         A252CliCod = BC01OU34_A252CliCod[0] ;
         n252CliCod = BC01OU34_n252CliCod[0] ;
         A45AlbRef = BC01OU34_A45AlbRef[0] ;
         A56AlbRUni = BC01OU34_A56AlbRUni[0] ;
         A52AlbRPieEnt = BC01OU34_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = BC01OU34_A58AlbRUniEnt[0] ;
         O54AlbRPieUti = A54AlbRPieUti ;
         pr_default.close(28);
         /* Using cursor BC01OU35 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = BC01OU35_A279CliNom[0] ;
         pr_default.close(29);
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         /* Using cursor BC01OU36 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
         A329DevTrnNom = BC01OU36_A329DevTrnNom[0] ;
         n329DevTrnNom = BC01OU36_n329DevTrnNom[0] ;
         pr_default.close(30);
         if ( isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti-O326DevGenPie) ;
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A54AlbRPieUti = (int)(O54AlbRPieUti+A326DevGenPie-O326DevGenPie) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
         }
         else
         {
            if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
            {
               A47AlbREst = (byte)(0) ;
            }
         }
      }
   }

   public void processNestedLevel1OU451( )
   {
      s326DevGenPie = O326DevGenPie ;
      n326DevGenPie = false ;
      s328DevGenUni = O328DevGenUni ;
      n328DevGenUni = false ;
      s54AlbRPieUti = O54AlbRPieUti ;
      s60AlbRUniUti = O60AlbRUniUti ;
      s3066AlbDevPUni = O3066AlbDevPUni ;
      s5278AlbDevPPie = O5278AlbDevPPie ;
      sV14KilAnt = OV14KilAnt ;
      sV15MetAnt = OV15MetAnt ;
      sV16PieAnt = OV16PieAnt ;
      sV17Kilos = OV17Kilos ;
      sV18Metros = OV18Metros ;
      sV19Piezas = OV19Piezas ;
      sV9AlbRPieDis = OV9AlbRPieDis ;
      sV10AlbRUniDis = OV10AlbRUniDis ;
      s47AlbREst = O47AlbREst ;
      nGXsfl_451_idx = 0 ;
      while ( nGXsfl_451_idx < bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level1().size() )
      {
         readRow1OU451( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound451 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_451 != 0 ) )
         {
            standaloneNotModal1OU451( ) ;
            if ( isIns( ) )
            {
               Gx_mode = "INS" ;
               insert1OU451( ) ;
            }
            else
            {
               if ( isDlt( ) )
               {
                  Gx_mode = "DLT" ;
                  delete1OU451( ) ;
               }
               else
               {
                  Gx_mode = "UPD" ;
                  update1OU451( ) ;
               }
            }
            O326DevGenPie = A326DevGenPie ;
            n326DevGenPie = false ;
            O328DevGenUni = A328DevGenUni ;
            n328DevGenUni = false ;
            O54AlbRPieUti = A54AlbRPieUti ;
            O60AlbRUniUti = A60AlbRUniUti ;
            O3066AlbDevPUni = A3066AlbDevPUni ;
            O5278AlbDevPPie = A5278AlbDevPPie ;
            OV14KilAnt = AV14KilAnt ;
            OV15MetAnt = AV15MetAnt ;
            OV16PieAnt = AV16PieAnt ;
            OV17Kilos = AV17Kilos ;
            OV18Metros = AV18Metros ;
            OV19Piezas = AV19Piezas ;
            OV9AlbRPieDis = AV9AlbRPieDis ;
            OV10AlbRUniDis = AV10AlbRUniDis ;
            O47AlbREst = A47AlbREst ;
         }
         KeyVarsToRow451( ((app.SdtTDevPieCopy1_Level1Item)bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level1().elementAt(-1+nGXsfl_451_idx))) ;
      }
      if ( AnyError == 0 )
      {
         /* Batch update SDT rows */
         nGXsfl_451_idx = 0 ;
         while ( nGXsfl_451_idx < bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level1().size() )
         {
            readRow1OU451( ) ;
            if ( (GXutil.strcmp("", Gx_mode)==0) )
            {
               if ( RcdFound451 == 0 )
               {
                  Gx_mode = "INS" ;
               }
               else
               {
                  Gx_mode = "UPD" ;
               }
            }
            /* Update SDT row */
            if ( isDlt( ) )
            {
               bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level1().removeElement(nGXsfl_451_idx);
               nGXsfl_451_idx = (int)(nGXsfl_451_idx-1) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               getByPrimaryKey1OU451( ) ;
               VarsToRow451( ((app.SdtTDevPieCopy1_Level1Item)bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level1().elementAt(-1+nGXsfl_451_idx))) ;
            }
         }
      }
      /* Start of After( level) rules */
      if ( ( DecimalUtil.compareTo(A328DevGenUni, A3066AlbDevPUni) != 0 ) && ( A3066AlbDevPUni.doubleValue() != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No suma las unidades", ""), 0, "");
      }
      if ( ( A326DevGenPie != A5278AlbDevPPie ) && ( A5278AlbDevPPie != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No suma la cantidad de piezas", ""), 0, "");
      }
      /* End of After( level) rules */
      initAll1OU451( ) ;
      if ( AnyError != 0 )
      {
         O326DevGenPie = s326DevGenPie ;
         n326DevGenPie = false ;
         O328DevGenUni = s328DevGenUni ;
         n328DevGenUni = false ;
         O54AlbRPieUti = s54AlbRPieUti ;
         O60AlbRUniUti = s60AlbRUniUti ;
         O3066AlbDevPUni = s3066AlbDevPUni ;
         O5278AlbDevPPie = s5278AlbDevPPie ;
         OV14KilAnt = sV14KilAnt ;
         OV15MetAnt = sV15MetAnt ;
         OV16PieAnt = sV16PieAnt ;
         OV17Kilos = sV17Kilos ;
         OV18Metros = sV18Metros ;
         OV19Piezas = sV19Piezas ;
         OV9AlbRPieDis = sV9AlbRPieDis ;
         OV10AlbRUniDis = sV10AlbRUniDis ;
         O47AlbREst = s47AlbREst ;
      }
      nRcdExists_451 = (short)(0) ;
      nIsMod_451 = (short)(0) ;
      Gxremove451 = (byte)(0) ;
   }

   public void processNestedLevel1OU192( )
   {
      s1304DevUlin = O1304DevUlin ;
      n1304DevUlin = false ;
      nGXsfl_192_idx = 0 ;
      while ( nGXsfl_192_idx < bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level2().size() )
      {
         readRow1OU192( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound192 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_192 != 0 ) )
         {
            standaloneNotModal1OU192( ) ;
            if ( isIns( ) )
            {
               Gx_mode = "INS" ;
               insert1OU192( ) ;
            }
            else
            {
               if ( isDlt( ) )
               {
                  Gx_mode = "DLT" ;
                  delete1OU192( ) ;
               }
               else
               {
                  Gx_mode = "UPD" ;
                  update1OU192( ) ;
               }
            }
            O1304DevUlin = A1304DevUlin ;
            n1304DevUlin = false ;
         }
         KeyVarsToRow192( ((app.SdtTDevPieCopy1_Level2Item)bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level2().elementAt(-1+nGXsfl_192_idx))) ;
      }
      if ( AnyError == 0 )
      {
         /* Batch update SDT rows */
         nGXsfl_192_idx = 0 ;
         while ( nGXsfl_192_idx < bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level2().size() )
         {
            readRow1OU192( ) ;
            if ( (GXutil.strcmp("", Gx_mode)==0) )
            {
               if ( RcdFound192 == 0 )
               {
                  Gx_mode = "INS" ;
               }
               else
               {
                  Gx_mode = "UPD" ;
               }
            }
            /* Update SDT row */
            if ( isDlt( ) )
            {
               bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level2().removeElement(nGXsfl_192_idx);
               nGXsfl_192_idx = (int)(nGXsfl_192_idx-1) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               getByPrimaryKey1OU192( ) ;
               VarsToRow192( ((app.SdtTDevPieCopy1_Level2Item)bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level2().elementAt(-1+nGXsfl_192_idx))) ;
            }
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1OU192( ) ;
      if ( AnyError != 0 )
      {
         O1304DevUlin = s1304DevUlin ;
         n1304DevUlin = false ;
      }
      nRcdExists_192 = (short)(0) ;
      nIsMod_192 = (short)(0) ;
      Gxremove192 = (byte)(0) ;
   }

   public void processLevel1OU31( )
   {
      /* Save parent mode. */
      sMode31 = Gx_mode ;
      processNestedLevel1OU451( ) ;
      processNestedLevel1OU192( ) ;
      if ( AnyError != 0 )
      {
         O326DevGenPie = s326DevGenPie ;
         n326DevGenPie = false ;
         O328DevGenUni = s328DevGenUni ;
         n328DevGenUni = false ;
         O54AlbRPieUti = s54AlbRPieUti ;
         O60AlbRUniUti = s60AlbRUniUti ;
         O3066AlbDevPUni = s3066AlbDevPUni ;
         O5278AlbDevPPie = s5278AlbDevPPie ;
         OV14KilAnt = sV14KilAnt ;
         OV15MetAnt = sV15MetAnt ;
         OV16PieAnt = sV16PieAnt ;
         OV17Kilos = sV17Kilos ;
         OV18Metros = sV18Metros ;
         OV19Piezas = sV19Piezas ;
         OV9AlbRPieDis = sV9AlbRPieDis ;
         OV10AlbRUniDis = sV10AlbRUniDis ;
         O47AlbREst = s47AlbREst ;
         O1304DevUlin = s1304DevUlin ;
         n1304DevUlin = false ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode31 ;
      /* ' Update level parameters */
      /* Using cursor BC01OU37 */
      pr_default.execute(31, new Object[] {Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n328DevGenUni), A328DevGenUni, A396EmprCod, Integer.valueOf(A323DevGenCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
      /* Using cursor BC01OU38 */
      pr_default.execute(32, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void updateTablesN11OU31( )
   {
      /* Using cursor BC01OU39 */
      pr_default.execute(33, new Object[] {Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel1OU31( )
   {
      pr_default.close(22);
      pr_default.close(23);
      if ( AnyError == 0 )
      {
         beforeComplete1OU31( ) ;
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

   public void scanKeyStart1OU31( )
   {
      /* Scan By routine */
      /* Using cursor BC01OU41 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A323DevGenCod = BC01OU41_A323DevGenCod[0] ;
         A328DevGenUni = BC01OU41_A328DevGenUni[0] ;
         n328DevGenUni = BC01OU41_n328DevGenUni[0] ;
         A326DevGenPie = BC01OU41_A326DevGenPie[0] ;
         n326DevGenPie = BC01OU41_n326DevGenPie[0] ;
         A60AlbRUniUti = BC01OU41_A60AlbRUniUti[0] ;
         A54AlbRPieUti = BC01OU41_A54AlbRPieUti[0] ;
         A47AlbREst = BC01OU41_A47AlbREst[0] ;
         A407EmprNom = BC01OU41_A407EmprNom[0] ;
         n407EmprNom = BC01OU41_n407EmprNom[0] ;
         A325DevGenFec = BC01OU41_A325DevGenFec[0] ;
         n325DevGenFec = BC01OU41_n325DevGenFec[0] ;
         A6288DevGenDom = BC01OU41_A6288DevGenDom[0] ;
         n6288DevGenDom = BC01OU41_n6288DevGenDom[0] ;
         A252CliCod = BC01OU41_A252CliCod[0] ;
         n252CliCod = BC01OU41_n252CliCod[0] ;
         A279CliNom = BC01OU41_A279CliNom[0] ;
         A45AlbRef = BC01OU41_A45AlbRef[0] ;
         A329DevTrnNom = BC01OU41_A329DevTrnNom[0] ;
         n329DevTrnNom = BC01OU41_n329DevTrnNom[0] ;
         A56AlbRUni = BC01OU41_A56AlbRUni[0] ;
         A52AlbRPieEnt = BC01OU41_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = BC01OU41_A58AlbRUniEnt[0] ;
         A324DevGenEst = BC01OU41_A324DevGenEst[0] ;
         n324DevGenEst = BC01OU41_n324DevGenEst[0] ;
         A1304DevUlin = BC01OU41_A1304DevUlin[0] ;
         n1304DevUlin = BC01OU41_n1304DevUlin[0] ;
         A44AlbRecCod = BC01OU41_A44AlbRecCod[0] ;
         n44AlbRecCod = BC01OU41_n44AlbRecCod[0] ;
         A327DevGenTrn = BC01OU41_A327DevGenTrn[0] ;
         n327DevGenTrn = BC01OU41_n327DevGenTrn[0] ;
         A3066AlbDevPUni = BC01OU41_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = BC01OU41_A5278AlbDevPPie[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1OU31( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound31 = (short)(0) ;
      scanKeyLoad1OU31( ) ;
   }

   public void scanKeyLoad1OU31( )
   {
      sMode31 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A323DevGenCod = BC01OU41_A323DevGenCod[0] ;
         A328DevGenUni = BC01OU41_A328DevGenUni[0] ;
         n328DevGenUni = BC01OU41_n328DevGenUni[0] ;
         A326DevGenPie = BC01OU41_A326DevGenPie[0] ;
         n326DevGenPie = BC01OU41_n326DevGenPie[0] ;
         A60AlbRUniUti = BC01OU41_A60AlbRUniUti[0] ;
         A54AlbRPieUti = BC01OU41_A54AlbRPieUti[0] ;
         A47AlbREst = BC01OU41_A47AlbREst[0] ;
         A407EmprNom = BC01OU41_A407EmprNom[0] ;
         n407EmprNom = BC01OU41_n407EmprNom[0] ;
         A325DevGenFec = BC01OU41_A325DevGenFec[0] ;
         n325DevGenFec = BC01OU41_n325DevGenFec[0] ;
         A6288DevGenDom = BC01OU41_A6288DevGenDom[0] ;
         n6288DevGenDom = BC01OU41_n6288DevGenDom[0] ;
         A252CliCod = BC01OU41_A252CliCod[0] ;
         n252CliCod = BC01OU41_n252CliCod[0] ;
         A279CliNom = BC01OU41_A279CliNom[0] ;
         A45AlbRef = BC01OU41_A45AlbRef[0] ;
         A329DevTrnNom = BC01OU41_A329DevTrnNom[0] ;
         n329DevTrnNom = BC01OU41_n329DevTrnNom[0] ;
         A56AlbRUni = BC01OU41_A56AlbRUni[0] ;
         A52AlbRPieEnt = BC01OU41_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = BC01OU41_A58AlbRUniEnt[0] ;
         A324DevGenEst = BC01OU41_A324DevGenEst[0] ;
         n324DevGenEst = BC01OU41_n324DevGenEst[0] ;
         A1304DevUlin = BC01OU41_A1304DevUlin[0] ;
         n1304DevUlin = BC01OU41_n1304DevUlin[0] ;
         A44AlbRecCod = BC01OU41_A44AlbRecCod[0] ;
         n44AlbRecCod = BC01OU41_n44AlbRecCod[0] ;
         A327DevGenTrn = BC01OU41_A327DevGenTrn[0] ;
         n327DevGenTrn = BC01OU41_n327DevGenTrn[0] ;
         A3066AlbDevPUni = BC01OU41_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = BC01OU41_A5278AlbDevPPie[0] ;
      }
      Gx_mode = sMode31 ;
   }

   public void scanKeyEnd1OU31( )
   {
      pr_default.close(34);
   }

   public void afterConfirm1OU31( )
   {
      /* After Confirm Rules */
      if ( (0==A323DevGenCod) && true /* After */ && true /* Level */ )
      {
         GXv_int8[0] = A323DevGenCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int8) ;
         tdevpiecopy1_bc.this.A323DevGenCod = GXv_int8[0] ;
      }
   }

   public void beforeInsert1OU31( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OU31( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OU31( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OU31( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OU31( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OU31( )
   {
   }

   public void zm1OU451( int GX_JID )
   {
      if ( ( GX_JID == 57 ) || ( GX_JID == 0 ) )
      {
         Z3067DevPieUni = A3067DevPieUni ;
      }
      if ( ( GX_JID == 58 ) || ( GX_JID == 0 ) )
      {
         Z4795AlRPieCal = A4795AlRPieCal ;
         Z2155AlbRecKgm = A2155AlbRecKgm ;
         Z2157AlbRecMtr = A2157AlbRecMtr ;
      }
      if ( GX_JID == -57 )
      {
         Z323DevGenCod = A323DevGenCod ;
         Z3067DevPieUni = A3067DevPieUni ;
         Z396EmprCod = A396EmprCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         Z4795AlRPieCal = A4795AlRPieCal ;
         Z2158AlbRecMtrU = A2158AlbRecMtrU ;
         Z2156AlbRecKgmU = A2156AlbRecKgmU ;
         Z2155AlbRecKgm = A2155AlbRecKgm ;
         Z2157AlbRecMtr = A2157AlbRecMtr ;
         Z44AlbRecCod = A44AlbRecCod ;
      }
   }

   public void standaloneNotModal1OU451( )
   {
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         A47AlbREst = (byte)(1) ;
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            A47AlbREst = (byte)(0) ;
         }
      }
   }

   public void standaloneModal1OU451( )
   {
      if ( true /* Level */ && isIns( )  )
      {
         A326DevGenPie = (short)(O326DevGenPie+1) ;
         n326DevGenPie = false ;
      }
      else
      {
         if ( true /* Level */ && isDlt( )  )
         {
            A326DevGenPie = (short)(O326DevGenPie-1) ;
            n326DevGenPie = false ;
         }
      }
      if ( isIns( )  || isUpd( )  || isDlt( )  )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti+A326DevGenPie-O326DevGenPie) ;
      }
      AV16PieAnt = O326DevGenPie ;
      AV19Piezas = A326DevGenPie ;
      if ( true )
      {
         AV9AlbRPieDis = A51AlbRPieDis ;
      }
      else
      {
         if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
         {
            AV9AlbRPieDis = AV11AlbRPDis ;
         }
      }
      if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de piezas a devolver superior a la disponible", ""), 0, "");
      }
   }

   public void load1OU451( )
   {
      /* Using cursor BC01OU42 */
      pr_default.execute(35, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A323DevGenCod), A396EmprCod, A2159AlbRecPie});
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound451 = (short)(1) ;
         A4795AlRPieCal = BC01OU42_A4795AlRPieCal[0] ;
         A3067DevPieUni = BC01OU42_A3067DevPieUni[0] ;
         A2158AlbRecMtrU = BC01OU42_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = BC01OU42_A2156AlbRecKgmU[0] ;
         A2155AlbRecKgm = BC01OU42_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = BC01OU42_A2157AlbRecMtr[0] ;
         zm1OU451( -57) ;
      }
      pr_default.close(35);
      onLoadActions1OU451( ) ;
   }

   public void onLoadActions1OU451( )
   {
      if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A2155AlbRecKgm, A2156AlbRecKgmU) >= 0 ) )
      {
         A3067DevPieUni = A2155AlbRecKgm.subtract(A2156AlbRecKgmU) ;
      }
      else
      {
         if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A2157AlbRecMtr, A2158AlbRecMtrU) >= 0 ) )
         {
            A3067DevPieUni = A2157AlbRecMtr.subtract(A2158AlbRecMtrU) ;
         }
      }
      if ( isIns( )  )
      {
         A5278AlbDevPPie = (short)(O5278AlbDevPPie+1) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            A5278AlbDevPPie = O5278AlbDevPPie ;
         }
         else
         {
            if ( isDlt( )  )
            {
               A5278AlbDevPPie = (short)(O5278AlbDevPPie-1) ;
            }
         }
      }
      if ( isIns( )  )
      {
         A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               A3066AlbDevPUni = O3066AlbDevPUni.subtract(O3067DevPieUni) ;
            }
         }
      }
      if ( isDlt( )  )
      {
         A328DevGenUni = O328DevGenUni.subtract(O3067DevPieUni) ;
         n328DevGenUni = false ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A328DevGenUni = O328DevGenUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            n328DevGenUni = false ;
         }
      }
      if ( true )
      {
         AV14KilAnt = O328DevGenUni ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV14KilAnt = O328DevGenUni ;
         }
      }
      if ( true )
      {
         AV15MetAnt = O328DevGenUni ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV15MetAnt = O328DevGenUni ;
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV17Kilos = A328DevGenUni ;
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV18Metros = A328DevGenUni ;
      }
      if ( true )
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV10AlbRUniDis = AV12AlbRUDis ;
         }
      }
      if ( isDlt( )  )
      {
         A60AlbRUniUti = O60AlbRUniUti.subtract(O3067DevPieUni) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
         }
      }
      if ( isDlt( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
      {
         A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(O3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ! ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
         {
            A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(O3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
            {
               A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni) ;
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
               {
                  A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
               }
            }
         }
      }
      if ( isDlt( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
      {
         A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(O3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ! ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
         {
            A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(O3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
            {
               A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni) ;
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
               {
                  A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
               }
            }
         }
      }
      if ( true /* Level */ )
      {
         AV63oldUni = O3067DevPieUni ;
      }
   }

   public void checkExtendedTable1OU451( )
   {
      nIsDirty_451 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1OU451( ) ;
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC01OU43 */
      pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBDET", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECPIE");
         AnyError = (short)(1) ;
      }
      A4795AlRPieCal = BC01OU43_A4795AlRPieCal[0] ;
      A2158AlbRecMtrU = BC01OU43_A2158AlbRecMtrU[0] ;
      A2156AlbRecKgmU = BC01OU43_A2156AlbRecKgmU[0] ;
      A2155AlbRecKgm = BC01OU43_A2155AlbRecKgm[0] ;
      A2157AlbRecMtr = BC01OU43_A2157AlbRecMtr[0] ;
      nIsDirty_451 = (short)(1) ;
      O2156AlbRecKgmU = A2156AlbRecKgmU ;
      nIsDirty_451 = (short)(1) ;
      O2158AlbRecMtrU = A2158AlbRecMtrU ;
      pr_default.close(36);
      if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A2155AlbRecKgm, A2156AlbRecKgmU) >= 0 ) )
      {
         nIsDirty_451 = (short)(1) ;
         A3067DevPieUni = A2155AlbRecKgm.subtract(A2156AlbRecKgmU) ;
      }
      else
      {
         if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A2157AlbRecMtr, A2158AlbRecMtrU) >= 0 ) )
         {
            nIsDirty_451 = (short)(1) ;
            A3067DevPieUni = A2157AlbRecMtr.subtract(A2158AlbRecMtrU) ;
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_451 = (short)(1) ;
         A5278AlbDevPPie = (short)(O5278AlbDevPPie+1) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_451 = (short)(1) ;
            A5278AlbDevPPie = O5278AlbDevPPie ;
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_451 = (short)(1) ;
               A5278AlbDevPPie = (short)(O5278AlbDevPPie-1) ;
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_451 = (short)(1) ;
         A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_451 = (short)(1) ;
            A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_451 = (short)(1) ;
               A3066AlbDevPUni = O3066AlbDevPUni.subtract(O3067DevPieUni) ;
            }
         }
      }
      if ( isDlt( )  )
      {
         nIsDirty_451 = (short)(1) ;
         A328DevGenUni = O328DevGenUni.subtract(O3067DevPieUni) ;
         n328DevGenUni = false ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_451 = (short)(1) ;
            A328DevGenUni = O328DevGenUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            n328DevGenUni = false ;
         }
      }
      if ( true )
      {
         AV14KilAnt = O328DevGenUni ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV14KilAnt = O328DevGenUni ;
         }
      }
      if ( true )
      {
         AV15MetAnt = O328DevGenUni ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV15MetAnt = O328DevGenUni ;
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV17Kilos = A328DevGenUni ;
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV18Metros = A328DevGenUni ;
      }
      if ( true )
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV10AlbRUniDis = AV12AlbRUDis ;
         }
      }
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 0, "");
      }
      if ( isDlt( )  )
      {
         nIsDirty_451 = (short)(1) ;
         A60AlbRUniUti = O60AlbRUniUti.subtract(O3067DevPieUni) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_451 = (short)(1) ;
            A60AlbRUniUti = O60AlbRUniUti.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
         }
      }
      if ( isDlt( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
      {
         nIsDirty_451 = (short)(1) ;
         A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(O3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ! ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
         {
            nIsDirty_451 = (short)(1) ;
            A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(O3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
            {
               nIsDirty_451 = (short)(1) ;
               A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni) ;
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
               {
                  nIsDirty_451 = (short)(1) ;
                  A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
               }
            }
         }
      }
      if ( DecimalUtil.compareTo(A2158AlbRecMtrU, A2157AlbRecMtr) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de kilos no suficientes", ""), 0, "");
      }
      if ( isDlt( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
      {
         nIsDirty_451 = (short)(1) ;
         A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(O3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ! ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
         {
            nIsDirty_451 = (short)(1) ;
            A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(O3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
            {
               nIsDirty_451 = (short)(1) ;
               A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni) ;
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
               {
                  nIsDirty_451 = (short)(1) ;
                  A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
               }
            }
         }
      }
      if ( DecimalUtil.compareTo(A2156AlbRecKgmU, A2155AlbRecKgm) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de metros no suficientes", ""), 0, "");
      }
      if ( true /* Level */ )
      {
         AV63oldUni = O3067DevPieUni ;
      }
   }

   public void closeExtendedTableCursors1OU451( )
   {
      pr_default.close(4);
   }

   public void enableDisable1OU451( )
   {
   }

   public void getKey1OU451( )
   {
      /* Using cursor BC01OU44 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound451 = (short)(1) ;
      }
      else
      {
         RcdFound451 = (short)(0) ;
      }
      pr_default.close(37);
   }

   public void getByPrimaryKey1OU451( )
   {
      /* Using cursor BC01OU45 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(38) != 101) && ( GXutil.strcmp(BC01OU45_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OU451( 57) ;
         RcdFound451 = (short)(1) ;
         initializeNonKey1OU451( ) ;
         A3067DevPieUni = BC01OU45_A3067DevPieUni[0] ;
         A2159AlbRecPie = BC01OU45_A2159AlbRecPie[0] ;
         O3067DevPieUni = A3067DevPieUni ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         sMode451 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1OU451( ) ;
         load1OU451( ) ;
         Gx_mode = sMode451 ;
      }
      else
      {
         RcdFound451 = (short)(0) ;
         initializeNonKey1OU451( ) ;
         sMode451 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1OU451( ) ;
         Gx_mode = sMode451 ;
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1OU451( ) ;
      }
      pr_default.close(38);
   }

   public void checkOptimisticConcurrency1OU451( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01OU46 */
         pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(39) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDevPie"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(39) == 101) || ( DecimalUtil.compareTo(Z3067DevPieUni, BC01OU46_A3067DevPieUni[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDevPie"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor BC01OU47 */
      pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(40) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBDET"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( GXutil.strcmp(Z4795AlRPieCal, BC01OU47_A4795AlRPieCal[0]) != 0 ) || ( DecimalUtil.compareTo(Z2155AlbRecKgm, BC01OU47_A2155AlbRecKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z2157AlbRecMtr, BC01OU47_A2157AlbRecMtr[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBDET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OU451( )
   {
      beforeValidate1OU451( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OU451( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OU451( 0) ;
         checkOptimisticConcurrency1OU451( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OU451( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OU451( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01OU48 */
                  pr_default.execute(41, new Object[] {Integer.valueOf(A323DevGenCod), A3067DevPieUni, A396EmprCod, A2159AlbRecPie});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDevPie");
                  if ( (pr_default.getStatus(41) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11OU451( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
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
            load1OU451( ) ;
         }
         endLevel1OU451( ) ;
      }
      closeExtendedTableCursors1OU451( ) ;
   }

   public void update1OU451( )
   {
      beforeValidate1OU451( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OU451( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OU451( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OU451( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1OU451( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01OU49 */
                  pr_default.execute(42, new Object[] {A3067DevPieUni, A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDevPie");
                  if ( (pr_default.getStatus(42) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDevPie"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1OU451( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        updateTablesN11OU451( ) ;
                        getByPrimaryKey1OU451( ) ;
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
         endLevel1OU451( ) ;
      }
      closeExtendedTableCursors1OU451( ) ;
   }

   public void deferredUpdate1OU451( )
   {
   }

   public void delete1OU451( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1OU451( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OU451( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OU451( ) ;
         afterConfirm1OU451( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OU451( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01OU50 */
               pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDevPie");
               if ( AnyError == 0 )
               {
                  updateTablesN11OU451( ) ;
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode451 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1OU451( ) ;
      Gx_mode = sMode451 ;
   }

   public void onDeleteControls1OU451( )
   {
      standaloneModal1OU451( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC01OU51 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         zm1OU451( 58) ;
         A4795AlRPieCal = BC01OU51_A4795AlRPieCal[0] ;
         A2158AlbRecMtrU = BC01OU51_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = BC01OU51_A2156AlbRecKgmU[0] ;
         A2155AlbRecKgm = BC01OU51_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = BC01OU51_A2157AlbRecMtr[0] ;
         O2156AlbRecKgmU = A2156AlbRecKgmU ;
         O2158AlbRecMtrU = A2158AlbRecMtrU ;
         pr_default.close(44);
         if ( isIns( )  )
         {
            A5278AlbDevPPie = (short)(O5278AlbDevPPie+1) ;
         }
         else
         {
            if ( isUpd( )  )
            {
               A5278AlbDevPPie = O5278AlbDevPPie ;
            }
            else
            {
               if ( isDlt( )  )
               {
                  A5278AlbDevPPie = (short)(O5278AlbDevPPie-1) ;
               }
            }
         }
         if ( isIns( )  )
         {
            A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  )
            {
               A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            }
            else
            {
               if ( isDlt( )  )
               {
                  A3066AlbDevPUni = O3066AlbDevPUni.subtract(O3067DevPieUni) ;
               }
            }
         }
         if ( isDlt( )  )
         {
            A328DevGenUni = O328DevGenUni.subtract(O3067DevPieUni) ;
            n328DevGenUni = false ;
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A328DevGenUni = O328DevGenUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
               n328DevGenUni = false ;
            }
         }
         if ( true )
         {
            AV14KilAnt = O328DevGenUni ;
         }
         else
         {
            if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
            {
               AV14KilAnt = O328DevGenUni ;
            }
         }
         if ( true )
         {
            AV15MetAnt = O328DevGenUni ;
         }
         else
         {
            if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
            {
               AV15MetAnt = O328DevGenUni ;
            }
         }
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV17Kilos = A328DevGenUni ;
         }
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV18Metros = A328DevGenUni ;
         }
         if ( true )
         {
            AV10AlbRUniDis = A57AlbRUniDis ;
         }
         else
         {
            if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
            {
               AV10AlbRUniDis = AV12AlbRUDis ;
            }
         }
         if ( isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.subtract(O3067DevPieUni) ;
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A60AlbRUniUti = O60AlbRUniUti.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            }
         }
         if ( isDlt( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
         {
            A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(O3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ! ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
            {
               A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(O3067DevPieUni) ;
            }
            else
            {
               if ( isUpd( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
               {
                  A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni) ;
               }
               else
               {
                  if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                  {
                     A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
                  }
               }
            }
         }
         if ( isDlt( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
         {
            A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(O3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ! ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
            {
               A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(O3067DevPieUni) ;
            }
            else
            {
               if ( isUpd( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
               {
                  A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni) ;
               }
               else
               {
                  if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
                  {
                     A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
                  }
               }
            }
         }
         if ( true /* Level */ )
         {
            AV63oldUni = O3067DevPieUni ;
         }
      }
   }

   public void updateTablesN11OU451( )
   {
      /* Using cursor BC01OU52 */
      pr_default.execute(45, new Object[] {A2158AlbRecMtrU, A2156AlbRecKgmU, A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
   }

   public void endLevel1OU451( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(39);
      }
      pr_default.close(40);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1OU451( )
   {
      /* Scan By routine */
      /* Using cursor BC01OU53 */
      pr_default.execute(46, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A323DevGenCod), A396EmprCod});
      RcdFound451 = (short)(0) ;
      if ( (pr_default.getStatus(46) != 101) )
      {
         RcdFound451 = (short)(1) ;
         A4795AlRPieCal = BC01OU53_A4795AlRPieCal[0] ;
         A3067DevPieUni = BC01OU53_A3067DevPieUni[0] ;
         A2158AlbRecMtrU = BC01OU53_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = BC01OU53_A2156AlbRecKgmU[0] ;
         A2155AlbRecKgm = BC01OU53_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = BC01OU53_A2157AlbRecMtr[0] ;
         A2159AlbRecPie = BC01OU53_A2159AlbRecPie[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1OU451( )
   {
      /* Scan next routine */
      pr_default.readNext(46);
      RcdFound451 = (short)(0) ;
      scanKeyLoad1OU451( ) ;
   }

   public void scanKeyLoad1OU451( )
   {
      sMode451 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(46) != 101) )
      {
         RcdFound451 = (short)(1) ;
         A4795AlRPieCal = BC01OU53_A4795AlRPieCal[0] ;
         A3067DevPieUni = BC01OU53_A3067DevPieUni[0] ;
         A2158AlbRecMtrU = BC01OU53_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = BC01OU53_A2156AlbRecKgmU[0] ;
         A2155AlbRecKgm = BC01OU53_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = BC01OU53_A2157AlbRecMtr[0] ;
         A2159AlbRecPie = BC01OU53_A2159AlbRecPie[0] ;
      }
      Gx_mode = sMode451 ;
   }

   public void scanKeyEnd1OU451( )
   {
      pr_default.close(46);
   }

   public void afterConfirm1OU451( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OU451( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OU451( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OU451( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OU451( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OU451( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OU451( )
   {
   }

   public void send_integrity_lvl_hashes1OU451( )
   {
   }

   public void zm1OU192( int GX_JID )
   {
      if ( ( GX_JID == 59 ) || ( GX_JID == 0 ) )
      {
         Z1303DevObs = A1303DevObs ;
      }
      if ( GX_JID == -59 )
      {
         Z323DevGenCod = A323DevGenCod ;
         Z1302DevLin = A1302DevLin ;
         Z1303DevObs = A1303DevObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1OU192( )
   {
   }

   public void standaloneModal1OU192( )
   {
      if ( isIns( )  )
      {
         A1304DevUlin = (byte)(O1304DevUlin+1) ;
         n1304DevUlin = false ;
      }
      if ( isIns( )  )
      {
         A1302DevLin = A1304DevUlin ;
      }
   }

   public void load1OU192( )
   {
      /* Using cursor BC01OU54 */
      pr_default.execute(47, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound192 = (short)(1) ;
         A1303DevObs = BC01OU54_A1303DevObs[0] ;
         zm1OU192( -59) ;
      }
      pr_default.close(47);
      onLoadActions1OU192( ) ;
   }

   public void onLoadActions1OU192( )
   {
   }

   public void checkExtendedTable1OU192( )
   {
      nIsDirty_192 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1OU192( ) ;
      Gx_BScreen = (byte)(0) ;
   }

   public void closeExtendedTableCursors1OU192( )
   {
   }

   public void enableDisable1OU192( )
   {
   }

   public void getKey1OU192( )
   {
      /* Using cursor BC01OU55 */
      pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
      if ( (pr_default.getStatus(48) != 101) )
      {
         RcdFound192 = (short)(1) ;
      }
      else
      {
         RcdFound192 = (short)(0) ;
      }
      pr_default.close(48);
   }

   public void getByPrimaryKey1OU192( )
   {
      /* Using cursor BC01OU56 */
      pr_default.execute(49, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
      if ( (pr_default.getStatus(49) != 101) && ( GXutil.strcmp(BC01OU56_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OU192( 59) ;
         RcdFound192 = (short)(1) ;
         initializeNonKey1OU192( ) ;
         A1302DevLin = BC01OU56_A1302DevLin[0] ;
         A1303DevObs = BC01OU56_A1303DevObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         Z1302DevLin = A1302DevLin ;
         sMode192 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1OU192( ) ;
         load1OU192( ) ;
         Gx_mode = sMode192 ;
      }
      else
      {
         RcdFound192 = (short)(0) ;
         initializeNonKey1OU192( ) ;
         sMode192 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1OU192( ) ;
         Gx_mode = sMode192 ;
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1OU192( ) ;
      }
      pr_default.close(49);
   }

   public void checkOptimisticConcurrency1OU192( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01OU57 */
         pr_default.execute(50, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
         if ( (pr_default.getStatus(50) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVOBS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(50) == 101) || ( GXutil.strcmp(Z1303DevObs, BC01OU57_A1303DevObs[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVOBS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OU192( )
   {
      beforeValidate1OU192( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OU192( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OU192( 0) ;
         checkOptimisticConcurrency1OU192( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OU192( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OU192( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01OU58 */
                  pr_default.execute(51, new Object[] {Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin), A1303DevObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVOBS");
                  if ( (pr_default.getStatus(51) == 1) )
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
            load1OU192( ) ;
         }
         endLevel1OU192( ) ;
      }
      closeExtendedTableCursors1OU192( ) ;
   }

   public void update1OU192( )
   {
      beforeValidate1OU192( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OU192( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OU192( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OU192( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1OU192( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01OU59 */
                  pr_default.execute(52, new Object[] {A1303DevObs, A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVOBS");
                  if ( (pr_default.getStatus(52) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVOBS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1OU192( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey1OU192( ) ;
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
         endLevel1OU192( ) ;
      }
      closeExtendedTableCursors1OU192( ) ;
   }

   public void deferredUpdate1OU192( )
   {
   }

   public void delete1OU192( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1OU192( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OU192( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OU192( ) ;
         afterConfirm1OU192( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OU192( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01OU60 */
               pr_default.execute(53, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVOBS");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode192 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1OU192( ) ;
      Gx_mode = sMode192 ;
   }

   public void onDeleteControls1OU192( )
   {
      standaloneModal1OU192( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1OU192( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(50);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1OU192( )
   {
      /* Scan By routine */
      /* Using cursor BC01OU61 */
      pr_default.execute(54, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      RcdFound192 = (short)(0) ;
      if ( (pr_default.getStatus(54) != 101) )
      {
         RcdFound192 = (short)(1) ;
         A1302DevLin = BC01OU61_A1302DevLin[0] ;
         A1303DevObs = BC01OU61_A1303DevObs[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1OU192( )
   {
      /* Scan next routine */
      pr_default.readNext(54);
      RcdFound192 = (short)(0) ;
      scanKeyLoad1OU192( ) ;
   }

   public void scanKeyLoad1OU192( )
   {
      sMode192 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(54) != 101) )
      {
         RcdFound192 = (short)(1) ;
         A1302DevLin = BC01OU61_A1302DevLin[0] ;
         A1303DevObs = BC01OU61_A1303DevObs[0] ;
      }
      Gx_mode = sMode192 ;
   }

   public void scanKeyEnd1OU192( )
   {
      pr_default.close(54);
   }

   public void afterConfirm1OU192( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OU192( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OU192( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OU192( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OU192( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OU192( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OU192( )
   {
   }

   public void send_integrity_lvl_hashes1OU192( )
   {
   }

   public void send_integrity_lvl_hashes1OU31( )
   {
   }

   public void addRow1OU31( )
   {
      VarsToRow31( bcTDevPieCopy1) ;
   }

   public void readRow1OU31( )
   {
      RowToVars31( bcTDevPieCopy1, 1) ;
   }

   public void addRow1OU451( )
   {
      app.SdtTDevPieCopy1_Level1Item obj451;
      obj451 = new app.SdtTDevPieCopy1_Level1Item(remoteHandle);
      VarsToRow451( obj451) ;
      bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level1().add(obj451, 0);
      obj451.setgxTv_SdtTDevPieCopy1_Level1Item_Mode( "UPD" );
      obj451.setgxTv_SdtTDevPieCopy1_Level1Item_Modified( (short)(0) );
   }

   public void readRow1OU451( )
   {
      nGXsfl_451_idx = (int)(nGXsfl_451_idx+1) ;
      RowToVars451( ((app.SdtTDevPieCopy1_Level1Item)bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level1().elementAt(-1+nGXsfl_451_idx)), 1) ;
   }

   public void addRow1OU192( )
   {
      app.SdtTDevPieCopy1_Level2Item obj192;
      obj192 = new app.SdtTDevPieCopy1_Level2Item(remoteHandle);
      VarsToRow192( obj192) ;
      bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level2().add(obj192, 0);
      obj192.setgxTv_SdtTDevPieCopy1_Level2Item_Mode( "UPD" );
      obj192.setgxTv_SdtTDevPieCopy1_Level2Item_Modified( (short)(0) );
   }

   public void readRow1OU192( )
   {
      nGXsfl_192_idx = (int)(nGXsfl_192_idx+1) ;
      RowToVars192( ((app.SdtTDevPieCopy1_Level2Item)bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level2().elementAt(-1+nGXsfl_192_idx)), 1) ;
   }

   public void initializeNonKey1OU31( )
   {
      AV20Modo = "" ;
      AV9AlbRPieDis = 0 ;
      AV10AlbRUniDis = DecimalUtil.ZERO ;
      A328DevGenUni = DecimalUtil.ZERO ;
      n328DevGenUni = false ;
      A326DevGenPie = (short)(0) ;
      n326DevGenPie = false ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A54AlbRPieUti = 0 ;
      AV13AlbRUni = "" ;
      AV11AlbRPDis = 0 ;
      AV12AlbRUDis = DecimalUtil.ZERO ;
      A47AlbREst = (byte)(0) ;
      AV14KilAnt = DecimalUtil.ZERO ;
      AV15MetAnt = DecimalUtil.ZERO ;
      AV16PieAnt = (short)(0) ;
      AV17Kilos = DecimalUtil.ZERO ;
      AV18Metros = DecimalUtil.ZERO ;
      AV19Piezas = (short)(0) ;
      AV61oldDevGenFec = GXutil.nullDate() ;
      AV65Err_att = "" ;
      A51AlbRPieDis = 0 ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      A6288DevGenDom = (byte)(0) ;
      n6288DevGenDom = false ;
      A252CliCod = 0 ;
      n252CliCod = false ;
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A327DevGenTrn = (short)(0) ;
      n327DevGenTrn = false ;
      A329DevTrnNom = "" ;
      n329DevTrnNom = false ;
      A56AlbRUni = "" ;
      A52AlbRPieEnt = 0 ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A324DevGenEst = (byte)(0) ;
      n324DevGenEst = false ;
      A3066AlbDevPUni = DecimalUtil.ZERO ;
      A5278AlbDevPPie = (short)(0) ;
      A1304DevUlin = (byte)(0) ;
      n1304DevUlin = false ;
      A325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      O1304DevUlin = A1304DevUlin ;
      n1304DevUlin = false ;
      O326DevGenPie = A326DevGenPie ;
      n326DevGenPie = false ;
      O328DevGenUni = A328DevGenUni ;
      n328DevGenUni = false ;
      O54AlbRPieUti = A54AlbRPieUti ;
      O60AlbRUniUti = A60AlbRUniUti ;
      O3066AlbDevPUni = A3066AlbDevPUni ;
      O5278AlbDevPPie = A5278AlbDevPPie ;
      O325DevGenFec = A325DevGenFec ;
      n325DevGenFec = false ;
      Z328DevGenUni = DecimalUtil.ZERO ;
      Z326DevGenPie = (short)(0) ;
      Z325DevGenFec = GXutil.nullDate() ;
      Z6288DevGenDom = (byte)(0) ;
      Z324DevGenEst = (byte)(0) ;
      Z1304DevUlin = (byte)(0) ;
      Z44AlbRecCod = 0 ;
      Z327DevGenTrn = (short)(0) ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z47AlbREst = (byte)(0) ;
      Z252CliCod = 0 ;
      Z45AlbRef = "" ;
      Z56AlbRUni = "" ;
      Z52AlbRPieEnt = 0 ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
   }

   public void initAll1OU31( )
   {
      A323DevGenCod = 0 ;
      initializeNonKey1OU31( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV20Modo = iV20Modo ;
      A325DevGenFec = i325DevGenFec ;
      n325DevGenFec = false ;
   }

   public void initializeNonKey1OU451( )
   {
      A3067DevPieUni = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      AV63oldUni = DecimalUtil.ZERO ;
      A4795AlRPieCal = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      O3067DevPieUni = A3067DevPieUni ;
      O2156AlbRecKgmU = A2156AlbRecKgmU ;
      O2158AlbRecMtrU = A2158AlbRecMtrU ;
      Z3067DevPieUni = DecimalUtil.ZERO ;
      Z4795AlRPieCal = "" ;
      Z2155AlbRecKgm = DecimalUtil.ZERO ;
      Z2157AlbRecMtr = DecimalUtil.ZERO ;
   }

   public void initAll1OU451( )
   {
      A2159AlbRecPie = "" ;
      initializeNonKey1OU451( ) ;
   }

   public void standaloneModalInsert1OU451( )
   {
      A326DevGenPie = i326DevGenPie ;
      n326DevGenPie = false ;
      A54AlbRPieUti = i54AlbRPieUti ;
   }

   public void initializeNonKey1OU192( )
   {
      A1303DevObs = "" ;
      Z1303DevObs = "" ;
   }

   public void initAll1OU192( )
   {
      A1302DevLin = (byte)(0) ;
      initializeNonKey1OU192( ) ;
   }

   public void standaloneModalInsert1OU192( )
   {
      A1304DevUlin = i1304DevUlin ;
      n1304DevUlin = false ;
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

   public void VarsToRow31( app.SdtTDevPieCopy1 obj31 )
   {
      obj31.setgxTv_SdtTDevPieCopy1_Mode( Gx_mode );
      obj31.setgxTv_SdtTDevPieCopy1_Emprcod( A396EmprCod );
      obj31.setgxTv_SdtTDevPieCopy1_Devgenuni( A328DevGenUni );
      obj31.setgxTv_SdtTDevPieCopy1_Devgenpie( A326DevGenPie );
      obj31.setgxTv_SdtTDevPieCopy1_Albruniuti( A60AlbRUniUti );
      obj31.setgxTv_SdtTDevPieCopy1_Albrpieuti( A54AlbRPieUti );
      obj31.setgxTv_SdtTDevPieCopy1_Albrest( A47AlbREst );
      obj31.setgxTv_SdtTDevPieCopy1_Albrpiedis( A51AlbRPieDis );
      obj31.setgxTv_SdtTDevPieCopy1_Albrunidis( A57AlbRUniDis );
      obj31.setgxTv_SdtTDevPieCopy1_Emprnom( A407EmprNom );
      obj31.setgxTv_SdtTDevPieCopy1_Albreccod( A44AlbRecCod );
      obj31.setgxTv_SdtTDevPieCopy1_Devgendom( A6288DevGenDom );
      obj31.setgxTv_SdtTDevPieCopy1_Clicod( A252CliCod );
      obj31.setgxTv_SdtTDevPieCopy1_Clinom( A279CliNom );
      obj31.setgxTv_SdtTDevPieCopy1_Albref( A45AlbRef );
      obj31.setgxTv_SdtTDevPieCopy1_Devgentrn( A327DevGenTrn );
      obj31.setgxTv_SdtTDevPieCopy1_Devtrnnom( A329DevTrnNom );
      obj31.setgxTv_SdtTDevPieCopy1_Albruni( A56AlbRUni );
      obj31.setgxTv_SdtTDevPieCopy1_Albrpieent( A52AlbRPieEnt );
      obj31.setgxTv_SdtTDevPieCopy1_Albrunient( A58AlbRUniEnt );
      obj31.setgxTv_SdtTDevPieCopy1_Devgenest( A324DevGenEst );
      obj31.setgxTv_SdtTDevPieCopy1_Albdevpuni( A3066AlbDevPUni );
      obj31.setgxTv_SdtTDevPieCopy1_Albdevppie( A5278AlbDevPPie );
      obj31.setgxTv_SdtTDevPieCopy1_Devulin( A1304DevUlin );
      obj31.setgxTv_SdtTDevPieCopy1_Devgenfec( A325DevGenFec );
      obj31.setgxTv_SdtTDevPieCopy1_Emprcod( A396EmprCod );
      obj31.setgxTv_SdtTDevPieCopy1_Devgencod( A323DevGenCod );
      obj31.setgxTv_SdtTDevPieCopy1_Emprcod_Z( Z396EmprCod );
      obj31.setgxTv_SdtTDevPieCopy1_Emprnom_Z( Z407EmprNom );
      obj31.setgxTv_SdtTDevPieCopy1_Devgencod_Z( Z323DevGenCod );
      obj31.setgxTv_SdtTDevPieCopy1_Devgenfec_Z( Z325DevGenFec );
      obj31.setgxTv_SdtTDevPieCopy1_Albreccod_Z( Z44AlbRecCod );
      obj31.setgxTv_SdtTDevPieCopy1_Devgendom_Z( Z6288DevGenDom );
      obj31.setgxTv_SdtTDevPieCopy1_Clicod_Z( Z252CliCod );
      obj31.setgxTv_SdtTDevPieCopy1_Clinom_Z( Z279CliNom );
      obj31.setgxTv_SdtTDevPieCopy1_Albref_Z( Z45AlbRef );
      obj31.setgxTv_SdtTDevPieCopy1_Devgentrn_Z( Z327DevGenTrn );
      obj31.setgxTv_SdtTDevPieCopy1_Devtrnnom_Z( Z329DevTrnNom );
      obj31.setgxTv_SdtTDevPieCopy1_Albrunidis_Z( Z57AlbRUniDis );
      obj31.setgxTv_SdtTDevPieCopy1_Albrpiedis_Z( Z51AlbRPieDis );
      obj31.setgxTv_SdtTDevPieCopy1_Albruni_Z( Z56AlbRUni );
      obj31.setgxTv_SdtTDevPieCopy1_Devgenuni_Z( Z328DevGenUni );
      obj31.setgxTv_SdtTDevPieCopy1_Devgenpie_Z( Z326DevGenPie );
      obj31.setgxTv_SdtTDevPieCopy1_Albruniuti_Z( Z60AlbRUniUti );
      obj31.setgxTv_SdtTDevPieCopy1_Albrpieuti_Z( Z54AlbRPieUti );
      obj31.setgxTv_SdtTDevPieCopy1_Albrpieent_Z( Z52AlbRPieEnt );
      obj31.setgxTv_SdtTDevPieCopy1_Albrunient_Z( Z58AlbRUniEnt );
      obj31.setgxTv_SdtTDevPieCopy1_Albrest_Z( Z47AlbREst );
      obj31.setgxTv_SdtTDevPieCopy1_Devgenest_Z( Z324DevGenEst );
      obj31.setgxTv_SdtTDevPieCopy1_Albdevpuni_Z( Z3066AlbDevPUni );
      obj31.setgxTv_SdtTDevPieCopy1_Albdevppie_Z( Z5278AlbDevPPie );
      obj31.setgxTv_SdtTDevPieCopy1_Devulin_Z( Z1304DevUlin );
      obj31.setgxTv_SdtTDevPieCopy1_Emprnom_N( (byte)((byte)((n407EmprNom)?1:0)) );
      obj31.setgxTv_SdtTDevPieCopy1_Devgenfec_N( (byte)((byte)((n325DevGenFec)?1:0)) );
      obj31.setgxTv_SdtTDevPieCopy1_Albreccod_N( (byte)((byte)((n44AlbRecCod)?1:0)) );
      obj31.setgxTv_SdtTDevPieCopy1_Devgendom_N( (byte)((byte)((n6288DevGenDom)?1:0)) );
      obj31.setgxTv_SdtTDevPieCopy1_Clicod_N( (byte)((byte)((n252CliCod)?1:0)) );
      obj31.setgxTv_SdtTDevPieCopy1_Devgentrn_N( (byte)((byte)((n327DevGenTrn)?1:0)) );
      obj31.setgxTv_SdtTDevPieCopy1_Devtrnnom_N( (byte)((byte)((n329DevTrnNom)?1:0)) );
      obj31.setgxTv_SdtTDevPieCopy1_Devgenuni_N( (byte)((byte)((n328DevGenUni)?1:0)) );
      obj31.setgxTv_SdtTDevPieCopy1_Devgenpie_N( (byte)((byte)((n326DevGenPie)?1:0)) );
      obj31.setgxTv_SdtTDevPieCopy1_Devgenest_N( (byte)((byte)((n324DevGenEst)?1:0)) );
      obj31.setgxTv_SdtTDevPieCopy1_Devulin_N( (byte)((byte)((n1304DevUlin)?1:0)) );
      obj31.setgxTv_SdtTDevPieCopy1_Mode( Gx_mode );
   }

   public void KeyVarsToRow31( app.SdtTDevPieCopy1 obj31 )
   {
      obj31.setgxTv_SdtTDevPieCopy1_Emprcod( A396EmprCod );
      obj31.setgxTv_SdtTDevPieCopy1_Devgencod( A323DevGenCod );
   }

   public void RowToVars31( app.SdtTDevPieCopy1 obj31 ,
                            int forceLoad )
   {
      Gx_mode = obj31.getgxTv_SdtTDevPieCopy1_Mode() ;
      A396EmprCod = obj31.getgxTv_SdtTDevPieCopy1_Emprcod() ;
      if ( forceLoad == 1 )
      {
         A328DevGenUni = obj31.getgxTv_SdtTDevPieCopy1_Devgenuni() ;
         n328DevGenUni = false ;
      }
      if ( forceLoad == 1 )
      {
         A326DevGenPie = obj31.getgxTv_SdtTDevPieCopy1_Devgenpie() ;
         n326DevGenPie = false ;
      }
      if ( forceLoad == 1 )
      {
         A60AlbRUniUti = obj31.getgxTv_SdtTDevPieCopy1_Albruniuti() ;
      }
      if ( forceLoad == 1 )
      {
         A54AlbRPieUti = obj31.getgxTv_SdtTDevPieCopy1_Albrpieuti() ;
      }
      A47AlbREst = obj31.getgxTv_SdtTDevPieCopy1_Albrest() ;
      A51AlbRPieDis = obj31.getgxTv_SdtTDevPieCopy1_Albrpiedis() ;
      A57AlbRUniDis = obj31.getgxTv_SdtTDevPieCopy1_Albrunidis() ;
      A407EmprNom = obj31.getgxTv_SdtTDevPieCopy1_Emprnom() ;
      n407EmprNom = false ;
      if ( ! ( isUpd( )  ) || ( forceLoad == 1 ) )
      {
         A44AlbRecCod = obj31.getgxTv_SdtTDevPieCopy1_Albreccod() ;
         n44AlbRecCod = false ;
      }
      A6288DevGenDom = obj31.getgxTv_SdtTDevPieCopy1_Devgendom() ;
      n6288DevGenDom = false ;
      A252CliCod = obj31.getgxTv_SdtTDevPieCopy1_Clicod() ;
      n252CliCod = false ;
      A279CliNom = obj31.getgxTv_SdtTDevPieCopy1_Clinom() ;
      A45AlbRef = obj31.getgxTv_SdtTDevPieCopy1_Albref() ;
      A327DevGenTrn = obj31.getgxTv_SdtTDevPieCopy1_Devgentrn() ;
      n327DevGenTrn = false ;
      A329DevTrnNom = obj31.getgxTv_SdtTDevPieCopy1_Devtrnnom() ;
      n329DevTrnNom = false ;
      A56AlbRUni = obj31.getgxTv_SdtTDevPieCopy1_Albruni() ;
      A52AlbRPieEnt = obj31.getgxTv_SdtTDevPieCopy1_Albrpieent() ;
      A58AlbRUniEnt = obj31.getgxTv_SdtTDevPieCopy1_Albrunient() ;
      A324DevGenEst = obj31.getgxTv_SdtTDevPieCopy1_Devgenest() ;
      n324DevGenEst = false ;
      A3066AlbDevPUni = obj31.getgxTv_SdtTDevPieCopy1_Albdevpuni() ;
      A5278AlbDevPPie = obj31.getgxTv_SdtTDevPieCopy1_Albdevppie() ;
      if ( forceLoad == 1 )
      {
         A1304DevUlin = obj31.getgxTv_SdtTDevPieCopy1_Devulin() ;
         n1304DevUlin = false ;
      }
      A325DevGenFec = obj31.getgxTv_SdtTDevPieCopy1_Devgenfec() ;
      n325DevGenFec = false ;
      A396EmprCod = obj31.getgxTv_SdtTDevPieCopy1_Emprcod() ;
      A323DevGenCod = obj31.getgxTv_SdtTDevPieCopy1_Devgencod() ;
      Z396EmprCod = obj31.getgxTv_SdtTDevPieCopy1_Emprcod_Z() ;
      Z407EmprNom = obj31.getgxTv_SdtTDevPieCopy1_Emprnom_Z() ;
      Z323DevGenCod = obj31.getgxTv_SdtTDevPieCopy1_Devgencod_Z() ;
      Z325DevGenFec = obj31.getgxTv_SdtTDevPieCopy1_Devgenfec_Z() ;
      O325DevGenFec = obj31.getgxTv_SdtTDevPieCopy1_Devgenfec_Z() ;
      Z44AlbRecCod = obj31.getgxTv_SdtTDevPieCopy1_Albreccod_Z() ;
      Z6288DevGenDom = obj31.getgxTv_SdtTDevPieCopy1_Devgendom_Z() ;
      Z252CliCod = obj31.getgxTv_SdtTDevPieCopy1_Clicod_Z() ;
      Z279CliNom = obj31.getgxTv_SdtTDevPieCopy1_Clinom_Z() ;
      Z45AlbRef = obj31.getgxTv_SdtTDevPieCopy1_Albref_Z() ;
      Z327DevGenTrn = obj31.getgxTv_SdtTDevPieCopy1_Devgentrn_Z() ;
      Z329DevTrnNom = obj31.getgxTv_SdtTDevPieCopy1_Devtrnnom_Z() ;
      Z57AlbRUniDis = obj31.getgxTv_SdtTDevPieCopy1_Albrunidis_Z() ;
      Z51AlbRPieDis = obj31.getgxTv_SdtTDevPieCopy1_Albrpiedis_Z() ;
      Z56AlbRUni = obj31.getgxTv_SdtTDevPieCopy1_Albruni_Z() ;
      Z328DevGenUni = obj31.getgxTv_SdtTDevPieCopy1_Devgenuni_Z() ;
      O328DevGenUni = obj31.getgxTv_SdtTDevPieCopy1_Devgenuni_Z() ;
      Z326DevGenPie = obj31.getgxTv_SdtTDevPieCopy1_Devgenpie_Z() ;
      O326DevGenPie = obj31.getgxTv_SdtTDevPieCopy1_Devgenpie_Z() ;
      Z60AlbRUniUti = obj31.getgxTv_SdtTDevPieCopy1_Albruniuti_Z() ;
      O60AlbRUniUti = obj31.getgxTv_SdtTDevPieCopy1_Albruniuti_Z() ;
      Z54AlbRPieUti = obj31.getgxTv_SdtTDevPieCopy1_Albrpieuti_Z() ;
      O54AlbRPieUti = obj31.getgxTv_SdtTDevPieCopy1_Albrpieuti_Z() ;
      Z52AlbRPieEnt = obj31.getgxTv_SdtTDevPieCopy1_Albrpieent_Z() ;
      Z58AlbRUniEnt = obj31.getgxTv_SdtTDevPieCopy1_Albrunient_Z() ;
      Z47AlbREst = obj31.getgxTv_SdtTDevPieCopy1_Albrest_Z() ;
      Z324DevGenEst = obj31.getgxTv_SdtTDevPieCopy1_Devgenest_Z() ;
      Z3066AlbDevPUni = obj31.getgxTv_SdtTDevPieCopy1_Albdevpuni_Z() ;
      O3066AlbDevPUni = obj31.getgxTv_SdtTDevPieCopy1_Albdevpuni_Z() ;
      Z5278AlbDevPPie = obj31.getgxTv_SdtTDevPieCopy1_Albdevppie_Z() ;
      O5278AlbDevPPie = obj31.getgxTv_SdtTDevPieCopy1_Albdevppie_Z() ;
      Z1304DevUlin = obj31.getgxTv_SdtTDevPieCopy1_Devulin_Z() ;
      O1304DevUlin = obj31.getgxTv_SdtTDevPieCopy1_Devulin_Z() ;
      n407EmprNom = (boolean)((obj31.getgxTv_SdtTDevPieCopy1_Emprnom_N()==0)?false:true) ;
      n325DevGenFec = (boolean)((obj31.getgxTv_SdtTDevPieCopy1_Devgenfec_N()==0)?false:true) ;
      n44AlbRecCod = (boolean)((obj31.getgxTv_SdtTDevPieCopy1_Albreccod_N()==0)?false:true) ;
      n6288DevGenDom = (boolean)((obj31.getgxTv_SdtTDevPieCopy1_Devgendom_N()==0)?false:true) ;
      n252CliCod = (boolean)((obj31.getgxTv_SdtTDevPieCopy1_Clicod_N()==0)?false:true) ;
      n327DevGenTrn = (boolean)((obj31.getgxTv_SdtTDevPieCopy1_Devgentrn_N()==0)?false:true) ;
      n329DevTrnNom = (boolean)((obj31.getgxTv_SdtTDevPieCopy1_Devtrnnom_N()==0)?false:true) ;
      n328DevGenUni = (boolean)((obj31.getgxTv_SdtTDevPieCopy1_Devgenuni_N()==0)?false:true) ;
      n326DevGenPie = (boolean)((obj31.getgxTv_SdtTDevPieCopy1_Devgenpie_N()==0)?false:true) ;
      n324DevGenEst = (boolean)((obj31.getgxTv_SdtTDevPieCopy1_Devgenest_N()==0)?false:true) ;
      n1304DevUlin = (boolean)((obj31.getgxTv_SdtTDevPieCopy1_Devulin_N()==0)?false:true) ;
      Gx_mode = obj31.getgxTv_SdtTDevPieCopy1_Mode() ;
   }

   public void VarsToRow451( app.SdtTDevPieCopy1_Level1Item obj451 )
   {
      obj451.setgxTv_SdtTDevPieCopy1_Level1Item_Mode( Gx_mode );
      obj451.setgxTv_SdtTDevPieCopy1_Level1Item_Devpieuni( A3067DevPieUni );
      obj451.setgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru( A2158AlbRecMtrU );
      obj451.setgxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu( A2156AlbRecKgmU );
      obj451.setgxTv_SdtTDevPieCopy1_Level1Item_Albreckgm( A2155AlbRecKgm );
      obj451.setgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr( A2157AlbRecMtr );
      obj451.setgxTv_SdtTDevPieCopy1_Level1Item_Albrecpie( A2159AlbRecPie );
      obj451.setgxTv_SdtTDevPieCopy1_Level1Item_Albrecpie_Z( Z2159AlbRecPie );
      obj451.setgxTv_SdtTDevPieCopy1_Level1Item_Albreckgm_Z( Z2155AlbRecKgm );
      obj451.setgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr_Z( Z2157AlbRecMtr );
      obj451.setgxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu_Z( Z2156AlbRecKgmU );
      obj451.setgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru_Z( Z2158AlbRecMtrU );
      obj451.setgxTv_SdtTDevPieCopy1_Level1Item_Devpieuni_Z( Z3067DevPieUni );
      obj451.setgxTv_SdtTDevPieCopy1_Level1Item_Modified( nIsMod_451 );
   }

   public void KeyVarsToRow451( app.SdtTDevPieCopy1_Level1Item obj451 )
   {
      obj451.setgxTv_SdtTDevPieCopy1_Level1Item_Albrecpie( A2159AlbRecPie );
   }

   public void RowToVars451( app.SdtTDevPieCopy1_Level1Item obj451 ,
                             int forceLoad )
   {
      Gx_mode = obj451.getgxTv_SdtTDevPieCopy1_Level1Item_Mode() ;
      A3067DevPieUni = obj451.getgxTv_SdtTDevPieCopy1_Level1Item_Devpieuni() ;
      if ( forceLoad == 1 )
      {
         A2158AlbRecMtrU = obj451.getgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru() ;
      }
      if ( forceLoad == 1 )
      {
         A2156AlbRecKgmU = obj451.getgxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu() ;
      }
      A2155AlbRecKgm = obj451.getgxTv_SdtTDevPieCopy1_Level1Item_Albreckgm() ;
      A2157AlbRecMtr = obj451.getgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr() ;
      A2159AlbRecPie = obj451.getgxTv_SdtTDevPieCopy1_Level1Item_Albrecpie() ;
      Z2159AlbRecPie = obj451.getgxTv_SdtTDevPieCopy1_Level1Item_Albrecpie_Z() ;
      Z2155AlbRecKgm = obj451.getgxTv_SdtTDevPieCopy1_Level1Item_Albreckgm_Z() ;
      Z2157AlbRecMtr = obj451.getgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtr_Z() ;
      Z2156AlbRecKgmU = obj451.getgxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu_Z() ;
      O2156AlbRecKgmU = obj451.getgxTv_SdtTDevPieCopy1_Level1Item_Albreckgmu_Z() ;
      Z2158AlbRecMtrU = obj451.getgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru_Z() ;
      O2158AlbRecMtrU = obj451.getgxTv_SdtTDevPieCopy1_Level1Item_Albrecmtru_Z() ;
      Z3067DevPieUni = obj451.getgxTv_SdtTDevPieCopy1_Level1Item_Devpieuni_Z() ;
      O3067DevPieUni = obj451.getgxTv_SdtTDevPieCopy1_Level1Item_Devpieuni_Z() ;
      nIsMod_451 = obj451.getgxTv_SdtTDevPieCopy1_Level1Item_Modified() ;
   }

   public void VarsToRow192( app.SdtTDevPieCopy1_Level2Item obj192 )
   {
      obj192.setgxTv_SdtTDevPieCopy1_Level2Item_Mode( Gx_mode );
      obj192.setgxTv_SdtTDevPieCopy1_Level2Item_Devobs( A1303DevObs );
      obj192.setgxTv_SdtTDevPieCopy1_Level2Item_Devlin( A1302DevLin );
      obj192.setgxTv_SdtTDevPieCopy1_Level2Item_Devlin_Z( Z1302DevLin );
      obj192.setgxTv_SdtTDevPieCopy1_Level2Item_Devobs_Z( Z1303DevObs );
      obj192.setgxTv_SdtTDevPieCopy1_Level2Item_Modified( nIsMod_192 );
   }

   public void KeyVarsToRow192( app.SdtTDevPieCopy1_Level2Item obj192 )
   {
      obj192.setgxTv_SdtTDevPieCopy1_Level2Item_Devlin( A1302DevLin );
   }

   public void RowToVars192( app.SdtTDevPieCopy1_Level2Item obj192 ,
                             int forceLoad )
   {
      Gx_mode = obj192.getgxTv_SdtTDevPieCopy1_Level2Item_Mode() ;
      A1303DevObs = obj192.getgxTv_SdtTDevPieCopy1_Level2Item_Devobs() ;
      A1302DevLin = obj192.getgxTv_SdtTDevPieCopy1_Level2Item_Devlin() ;
      Z1302DevLin = obj192.getgxTv_SdtTDevPieCopy1_Level2Item_Devlin_Z() ;
      Z1303DevObs = obj192.getgxTv_SdtTDevPieCopy1_Level2Item_Devobs_Z() ;
      nIsMod_192 = obj192.getgxTv_SdtTDevPieCopy1_Level2Item_Modified() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A323DevGenCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1OU31( ) ;
      scanKeyStart1OU31( ) ;
      if ( RcdFound31 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01OU62 */
         pr_default.execute(55, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(55) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01OU62_A407EmprNom[0] ;
         n407EmprNom = BC01OU62_n407EmprNom[0] ;
         pr_default.close(55);
         /* Using cursor BC01OU64 */
         pr_default.execute(56, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(56) != 101) )
         {
            A3066AlbDevPUni = BC01OU64_A3066AlbDevPUni[0] ;
            A5278AlbDevPPie = BC01OU64_A5278AlbDevPPie[0] ;
         }
         else
         {
            A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
            A5278AlbDevPPie = (short)(0) ;
         }
         pr_default.close(56);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         O1304DevUlin = A1304DevUlin ;
         n1304DevUlin = false ;
         O3067DevPieUni = A3067DevPieUni ;
         O328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
         O326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         O325DevGenFec = A325DevGenFec ;
         n325DevGenFec = false ;
         O54AlbRPieUti = A54AlbRPieUti ;
      }
      zm1OU31( -51) ;
      onLoadActions1OU31( ) ;
      addRow1OU31( ) ;
      bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level1().clearCollection();
      if ( RcdFound31 == 1 )
      {
         scanKeyStart1OU451( ) ;
         nGXsfl_451_idx = 1 ;
         while ( RcdFound451 != 0 )
         {
            O3067DevPieUni = A3067DevPieUni ;
            O2156AlbRecKgmU = A2156AlbRecKgmU ;
            O2158AlbRecMtrU = A2158AlbRecMtrU ;
            Z396EmprCod = A396EmprCod ;
            Z323DevGenCod = A323DevGenCod ;
            Z2159AlbRecPie = A2159AlbRecPie ;
            zm1OU451( -57) ;
            onLoadActions1OU451( ) ;
            nRcdExists_451 = (short)(1) ;
            nIsMod_451 = (short)(0) ;
            Z3067DevPieUni = A3067DevPieUni ;
            Z2156AlbRecKgmU = A2156AlbRecKgmU ;
            Z2158AlbRecMtrU = A2158AlbRecMtrU ;
            addRow1OU451( ) ;
            nGXsfl_451_idx = (int)(nGXsfl_451_idx+1) ;
            scanKeyNext1OU451( ) ;
         }
         scanKeyEnd1OU451( ) ;
      }
      bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level2().clearCollection();
      if ( RcdFound31 == 1 )
      {
         scanKeyStart1OU192( ) ;
         nGXsfl_192_idx = 1 ;
         while ( RcdFound192 != 0 )
         {
            Z396EmprCod = A396EmprCod ;
            Z323DevGenCod = A323DevGenCod ;
            Z1302DevLin = A1302DevLin ;
            zm1OU192( -59) ;
            onLoadActions1OU192( ) ;
            nRcdExists_192 = (short)(1) ;
            nIsMod_192 = (short)(0) ;
            addRow1OU192( ) ;
            nGXsfl_192_idx = (int)(nGXsfl_192_idx+1) ;
            scanKeyNext1OU192( ) ;
         }
         scanKeyEnd1OU192( ) ;
      }
      scanKeyEnd1OU31( ) ;
      if ( RcdFound31 == 0 )
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
      RowToVars31( bcTDevPieCopy1, 0) ;
      scanKeyStart1OU31( ) ;
      if ( RcdFound31 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01OU65 */
         pr_default.execute(57, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(57) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01OU65_A407EmprNom[0] ;
         n407EmprNom = BC01OU65_n407EmprNom[0] ;
         pr_default.close(57);
         /* Using cursor BC01OU67 */
         pr_default.execute(58, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(58) != 101) )
         {
            A3066AlbDevPUni = BC01OU67_A3066AlbDevPUni[0] ;
            A5278AlbDevPPie = BC01OU67_A5278AlbDevPPie[0] ;
         }
         else
         {
            A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
            A5278AlbDevPPie = (short)(0) ;
         }
         pr_default.close(58);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         O1304DevUlin = A1304DevUlin ;
         n1304DevUlin = false ;
         O3067DevPieUni = A3067DevPieUni ;
         O328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
         O326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         O325DevGenFec = A325DevGenFec ;
         n325DevGenFec = false ;
         O54AlbRPieUti = A54AlbRPieUti ;
      }
      zm1OU31( -51) ;
      onLoadActions1OU31( ) ;
      addRow1OU31( ) ;
      bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level1().clearCollection();
      if ( RcdFound31 == 1 )
      {
         scanKeyStart1OU451( ) ;
         nGXsfl_451_idx = 1 ;
         while ( RcdFound451 != 0 )
         {
            O3067DevPieUni = A3067DevPieUni ;
            O2156AlbRecKgmU = A2156AlbRecKgmU ;
            O2158AlbRecMtrU = A2158AlbRecMtrU ;
            Z396EmprCod = A396EmprCod ;
            Z323DevGenCod = A323DevGenCod ;
            Z2159AlbRecPie = A2159AlbRecPie ;
            zm1OU451( -57) ;
            onLoadActions1OU451( ) ;
            nRcdExists_451 = (short)(1) ;
            nIsMod_451 = (short)(0) ;
            Z3067DevPieUni = A3067DevPieUni ;
            Z2156AlbRecKgmU = A2156AlbRecKgmU ;
            Z2158AlbRecMtrU = A2158AlbRecMtrU ;
            addRow1OU451( ) ;
            nGXsfl_451_idx = (int)(nGXsfl_451_idx+1) ;
            scanKeyNext1OU451( ) ;
         }
         scanKeyEnd1OU451( ) ;
      }
      bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Level2().clearCollection();
      if ( RcdFound31 == 1 )
      {
         scanKeyStart1OU192( ) ;
         nGXsfl_192_idx = 1 ;
         while ( RcdFound192 != 0 )
         {
            Z396EmprCod = A396EmprCod ;
            Z323DevGenCod = A323DevGenCod ;
            Z1302DevLin = A1302DevLin ;
            zm1OU192( -59) ;
            onLoadActions1OU192( ) ;
            nRcdExists_192 = (short)(1) ;
            nIsMod_192 = (short)(0) ;
            addRow1OU192( ) ;
            nGXsfl_192_idx = (int)(nGXsfl_192_idx+1) ;
            scanKeyNext1OU192( ) ;
         }
         scanKeyEnd1OU192( ) ;
      }
      scanKeyEnd1OU31( ) ;
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1OU31( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A326DevGenPie = O326DevGenPie ;
         n326DevGenPie = false ;
         A328DevGenUni = O328DevGenUni ;
         n328DevGenUni = false ;
         A54AlbRPieUti = O54AlbRPieUti ;
         A60AlbRUniUti = O60AlbRUniUti ;
         A3066AlbDevPUni = O3066AlbDevPUni ;
         A5278AlbDevPPie = O5278AlbDevPPie ;
         AV14KilAnt = OV14KilAnt ;
         AV15MetAnt = OV15MetAnt ;
         AV16PieAnt = OV16PieAnt ;
         AV17Kilos = OV17Kilos ;
         AV18Metros = OV18Metros ;
         AV19Piezas = OV19Piezas ;
         AV9AlbRPieDis = OV9AlbRPieDis ;
         AV10AlbRUniDis = OV10AlbRUniDis ;
         A47AlbREst = O47AlbREst ;
         A1304DevUlin = O1304DevUlin ;
         n1304DevUlin = false ;
         insert1OU31( ) ;
      }
      else
      {
         if ( RcdFound31 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A323DevGenCod != Z323DevGenCod ) )
            {
               A323DevGenCod = Z323DevGenCod ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( isDlt( ) )
            {
               A326DevGenPie = O326DevGenPie ;
               n326DevGenPie = false ;
               A328DevGenUni = O328DevGenUni ;
               n328DevGenUni = false ;
               A54AlbRPieUti = O54AlbRPieUti ;
               A60AlbRUniUti = O60AlbRUniUti ;
               A3066AlbDevPUni = O3066AlbDevPUni ;
               A5278AlbDevPPie = O5278AlbDevPPie ;
               AV14KilAnt = OV14KilAnt ;
               AV15MetAnt = OV15MetAnt ;
               AV16PieAnt = OV16PieAnt ;
               AV17Kilos = OV17Kilos ;
               AV18Metros = OV18Metros ;
               AV19Piezas = OV19Piezas ;
               AV9AlbRPieDis = OV9AlbRPieDis ;
               AV10AlbRUniDis = OV10AlbRUniDis ;
               A47AlbREst = O47AlbREst ;
               A1304DevUlin = O1304DevUlin ;
               n1304DevUlin = false ;
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               /* Update record */
               A326DevGenPie = O326DevGenPie ;
               n326DevGenPie = false ;
               A328DevGenUni = O328DevGenUni ;
               n328DevGenUni = false ;
               A54AlbRPieUti = O54AlbRPieUti ;
               A60AlbRUniUti = O60AlbRUniUti ;
               A3066AlbDevPUni = O3066AlbDevPUni ;
               A5278AlbDevPPie = O5278AlbDevPPie ;
               AV14KilAnt = OV14KilAnt ;
               AV15MetAnt = OV15MetAnt ;
               AV16PieAnt = OV16PieAnt ;
               AV17Kilos = OV17Kilos ;
               AV18Metros = OV18Metros ;
               AV19Piezas = OV19Piezas ;
               AV9AlbRPieDis = OV9AlbRPieDis ;
               AV10AlbRUniDis = OV10AlbRUniDis ;
               A47AlbREst = O47AlbREst ;
               A1304DevUlin = O1304DevUlin ;
               n1304DevUlin = false ;
               update1OU31( ) ;
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
               if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A323DevGenCod != Z323DevGenCod ) )
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
                     A326DevGenPie = O326DevGenPie ;
                     n326DevGenPie = false ;
                     A328DevGenUni = O328DevGenUni ;
                     n328DevGenUni = false ;
                     A54AlbRPieUti = O54AlbRPieUti ;
                     A60AlbRUniUti = O60AlbRUniUti ;
                     A3066AlbDevPUni = O3066AlbDevPUni ;
                     A5278AlbDevPPie = O5278AlbDevPPie ;
                     AV14KilAnt = OV14KilAnt ;
                     AV15MetAnt = OV15MetAnt ;
                     AV16PieAnt = OV16PieAnt ;
                     AV17Kilos = OV17Kilos ;
                     AV18Metros = OV18Metros ;
                     AV19Piezas = OV19Piezas ;
                     AV9AlbRPieDis = OV9AlbRPieDis ;
                     AV10AlbRUniDis = OV10AlbRUniDis ;
                     A47AlbREst = O47AlbREst ;
                     A1304DevUlin = O1304DevUlin ;
                     n1304DevUlin = false ;
                     insert1OU31( ) ;
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
                     A326DevGenPie = O326DevGenPie ;
                     n326DevGenPie = false ;
                     A328DevGenUni = O328DevGenUni ;
                     n328DevGenUni = false ;
                     A54AlbRPieUti = O54AlbRPieUti ;
                     A60AlbRUniUti = O60AlbRUniUti ;
                     A3066AlbDevPUni = O3066AlbDevPUni ;
                     A5278AlbDevPPie = O5278AlbDevPPie ;
                     AV14KilAnt = OV14KilAnt ;
                     AV15MetAnt = OV15MetAnt ;
                     AV16PieAnt = OV16PieAnt ;
                     AV17Kilos = OV17Kilos ;
                     AV18Metros = OV18Metros ;
                     AV19Piezas = OV19Piezas ;
                     AV9AlbRPieDis = OV9AlbRPieDis ;
                     AV10AlbRUniDis = OV10AlbRUniDis ;
                     A47AlbREst = O47AlbREst ;
                     A1304DevUlin = O1304DevUlin ;
                     n1304DevUlin = false ;
                     insert1OU31( ) ;
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
      RowToVars31( bcTDevPieCopy1, 1) ;
      saveImpl( ) ;
      VarsToRow31( bcTDevPieCopy1) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars31( bcTDevPieCopy1, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      A326DevGenPie = O326DevGenPie ;
      n326DevGenPie = false ;
      A328DevGenUni = O328DevGenUni ;
      n328DevGenUni = false ;
      A54AlbRPieUti = O54AlbRPieUti ;
      A60AlbRUniUti = O60AlbRUniUti ;
      A3066AlbDevPUni = O3066AlbDevPUni ;
      A5278AlbDevPPie = O5278AlbDevPPie ;
      AV14KilAnt = OV14KilAnt ;
      AV15MetAnt = OV15MetAnt ;
      AV16PieAnt = OV16PieAnt ;
      AV17Kilos = OV17Kilos ;
      AV18Metros = OV18Metros ;
      AV19Piezas = OV19Piezas ;
      AV9AlbRPieDis = OV9AlbRPieDis ;
      AV10AlbRUniDis = OV10AlbRUniDis ;
      A47AlbREst = O47AlbREst ;
      A1304DevUlin = O1304DevUlin ;
      n1304DevUlin = false ;
      insert1OU31( ) ;
      afterTrn( ) ;
      VarsToRow31( bcTDevPieCopy1) ;
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
         app.SdtTDevPieCopy1 auxBC = new app.SdtTDevPieCopy1( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A323DevGenCod);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcTDevPieCopy1);
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
      RowToVars31( bcTDevPieCopy1, 1) ;
      updateImpl( ) ;
      VarsToRow31( bcTDevPieCopy1) ;
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
      RowToVars31( bcTDevPieCopy1, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1OU31( ) ;
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
      VarsToRow31( bcTDevPieCopy1) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars31( bcTDevPieCopy1, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1OU31( ) ;
      if ( RcdFound31 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A323DevGenCod != Z323DevGenCod ) )
         {
            A323DevGenCod = Z323DevGenCod ;
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A323DevGenCod != Z323DevGenCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdevpiecopy1_bc");
      VarsToRow31( bcTDevPieCopy1) ;
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
      Gx_mode = bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTDevPieCopy1.setgxTv_SdtTDevPieCopy1_Mode( Gx_mode );
   }

   public void SetSDT( app.SdtTDevPieCopy1 sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTDevPieCopy1 )
      {
         bcTDevPieCopy1 = sdt ;
         if ( GXutil.strcmp(bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Mode(), "") == 0 )
         {
            bcTDevPieCopy1.setgxTv_SdtTDevPieCopy1_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow31( bcTDevPieCopy1) ;
         }
         else
         {
            RowToVars31( bcTDevPieCopy1, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTDevPieCopy1.getgxTv_SdtTDevPieCopy1_Mode(), "") == 0 )
         {
            bcTDevPieCopy1.setgxTv_SdtTDevPieCopy1_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars31( bcTDevPieCopy1, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtTDevPieCopy1 getTDevPieCopy1_BC( )
   {
      return bcTDevPieCopy1 ;
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
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      sMode31 = "" ;
      s328DevGenUni = DecimalUtil.ZERO ;
      O328DevGenUni = DecimalUtil.ZERO ;
      A328DevGenUni = DecimalUtil.ZERO ;
      s60AlbRUniUti = DecimalUtil.ZERO ;
      O60AlbRUniUti = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      s3066AlbDevPUni = DecimalUtil.ZERO ;
      O3066AlbDevPUni = DecimalUtil.ZERO ;
      A3066AlbDevPUni = DecimalUtil.ZERO ;
      sV14KilAnt = DecimalUtil.ZERO ;
      OV14KilAnt = DecimalUtil.ZERO ;
      AV14KilAnt = DecimalUtil.ZERO ;
      sV15MetAnt = DecimalUtil.ZERO ;
      OV15MetAnt = DecimalUtil.ZERO ;
      AV15MetAnt = DecimalUtil.ZERO ;
      sV17Kilos = DecimalUtil.ZERO ;
      OV17Kilos = DecimalUtil.ZERO ;
      AV17Kilos = DecimalUtil.ZERO ;
      sV18Metros = DecimalUtil.ZERO ;
      OV18Metros = DecimalUtil.ZERO ;
      AV18Metros = DecimalUtil.ZERO ;
      sV10AlbRUniDis = DecimalUtil.ZERO ;
      OV10AlbRUniDis = DecimalUtil.ZERO ;
      AV10AlbRUniDis = DecimalUtil.ZERO ;
      A3067DevPieUni = DecimalUtil.ZERO ;
      AV24Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV7EmprNom = "" ;
      AV8UsurCod = "" ;
      A2159AlbRecPie = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      Z328DevGenUni = DecimalUtil.ZERO ;
      Z325DevGenFec = GXutil.nullDate() ;
      A325DevGenFec = GXutil.nullDate() ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      Z3066AlbDevPUni = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      A407EmprNom = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z45AlbRef = "" ;
      A45AlbRef = "" ;
      Z56AlbRUni = "" ;
      A56AlbRUni = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
      A279CliNom = "" ;
      Z329DevTrnNom = "" ;
      A329DevTrnNom = "" ;
      BC01OU17_A407EmprNom = new String[] {""} ;
      BC01OU17_n407EmprNom = new boolean[] {false} ;
      AV20Modo = "" ;
      AV12AlbRUDis = DecimalUtil.ZERO ;
      AV61oldDevGenFec = GXutil.nullDate() ;
      O325DevGenFec = GXutil.nullDate() ;
      BC01OU19_A323DevGenCod = new int[1] ;
      BC01OU19_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU19_n328DevGenUni = new boolean[] {false} ;
      BC01OU19_A326DevGenPie = new short[1] ;
      BC01OU19_n326DevGenPie = new boolean[] {false} ;
      BC01OU19_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU19_A54AlbRPieUti = new int[1] ;
      BC01OU19_A47AlbREst = new byte[1] ;
      BC01OU19_A407EmprNom = new String[] {""} ;
      BC01OU19_n407EmprNom = new boolean[] {false} ;
      BC01OU19_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01OU19_n325DevGenFec = new boolean[] {false} ;
      BC01OU19_A6288DevGenDom = new byte[1] ;
      BC01OU19_n6288DevGenDom = new boolean[] {false} ;
      BC01OU19_A252CliCod = new int[1] ;
      BC01OU19_n252CliCod = new boolean[] {false} ;
      BC01OU19_A279CliNom = new String[] {""} ;
      BC01OU19_A45AlbRef = new String[] {""} ;
      BC01OU19_A329DevTrnNom = new String[] {""} ;
      BC01OU19_n329DevTrnNom = new boolean[] {false} ;
      BC01OU19_A56AlbRUni = new String[] {""} ;
      BC01OU19_A52AlbRPieEnt = new int[1] ;
      BC01OU19_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU19_A324DevGenEst = new byte[1] ;
      BC01OU19_n324DevGenEst = new boolean[] {false} ;
      BC01OU19_A1304DevUlin = new byte[1] ;
      BC01OU19_n1304DevUlin = new boolean[] {false} ;
      BC01OU19_A396EmprCod = new String[] {""} ;
      BC01OU19_A44AlbRecCod = new int[1] ;
      BC01OU19_n44AlbRecCod = new boolean[] {false} ;
      BC01OU19_A327DevGenTrn = new short[1] ;
      BC01OU19_n327DevGenTrn = new boolean[] {false} ;
      BC01OU19_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU19_A5278AlbDevPPie = new short[1] ;
      BC01OU20_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU20_A54AlbRPieUti = new int[1] ;
      BC01OU20_A47AlbREst = new byte[1] ;
      BC01OU20_A252CliCod = new int[1] ;
      BC01OU20_n252CliCod = new boolean[] {false} ;
      BC01OU20_A45AlbRef = new String[] {""} ;
      BC01OU20_A56AlbRUni = new String[] {""} ;
      BC01OU20_A52AlbRPieEnt = new int[1] ;
      BC01OU20_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU21_A279CliNom = new String[] {""} ;
      BC01OU22_A329DevTrnNom = new String[] {""} ;
      BC01OU22_n329DevTrnNom = new boolean[] {false} ;
      BC01OU24_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU24_A5278AlbDevPPie = new short[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new int[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV13AlbRUni = "" ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new byte[1] ;
      AV65Err_att = "" ;
      GXv_char3 = new String[1] ;
      BC01OU25_A396EmprCod = new String[] {""} ;
      BC01OU25_A323DevGenCod = new int[1] ;
      BC01OU26_A323DevGenCod = new int[1] ;
      BC01OU26_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU26_n328DevGenUni = new boolean[] {false} ;
      BC01OU26_A326DevGenPie = new short[1] ;
      BC01OU26_n326DevGenPie = new boolean[] {false} ;
      BC01OU26_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01OU26_n325DevGenFec = new boolean[] {false} ;
      BC01OU26_A6288DevGenDom = new byte[1] ;
      BC01OU26_n6288DevGenDom = new boolean[] {false} ;
      BC01OU26_A324DevGenEst = new byte[1] ;
      BC01OU26_n324DevGenEst = new boolean[] {false} ;
      BC01OU26_A1304DevUlin = new byte[1] ;
      BC01OU26_n1304DevUlin = new boolean[] {false} ;
      BC01OU26_A396EmprCod = new String[] {""} ;
      BC01OU26_A44AlbRecCod = new int[1] ;
      BC01OU26_n44AlbRecCod = new boolean[] {false} ;
      BC01OU26_A327DevGenTrn = new short[1] ;
      BC01OU26_n327DevGenTrn = new boolean[] {false} ;
      BC01OU27_A323DevGenCod = new int[1] ;
      BC01OU27_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU27_n328DevGenUni = new boolean[] {false} ;
      BC01OU27_A326DevGenPie = new short[1] ;
      BC01OU27_n326DevGenPie = new boolean[] {false} ;
      BC01OU27_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01OU27_n325DevGenFec = new boolean[] {false} ;
      BC01OU27_A6288DevGenDom = new byte[1] ;
      BC01OU27_n6288DevGenDom = new boolean[] {false} ;
      BC01OU27_A324DevGenEst = new byte[1] ;
      BC01OU27_n324DevGenEst = new boolean[] {false} ;
      BC01OU27_A1304DevUlin = new byte[1] ;
      BC01OU27_n1304DevUlin = new boolean[] {false} ;
      BC01OU27_A396EmprCod = new String[] {""} ;
      BC01OU27_A44AlbRecCod = new int[1] ;
      BC01OU27_n44AlbRecCod = new boolean[] {false} ;
      BC01OU27_A327DevGenTrn = new short[1] ;
      BC01OU27_n327DevGenTrn = new boolean[] {false} ;
      BC01OU28_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU28_A54AlbRPieUti = new int[1] ;
      BC01OU28_A47AlbREst = new byte[1] ;
      BC01OU28_A252CliCod = new int[1] ;
      BC01OU28_n252CliCod = new boolean[] {false} ;
      BC01OU28_A45AlbRef = new String[] {""} ;
      BC01OU28_A56AlbRUni = new String[] {""} ;
      BC01OU28_A52AlbRPieEnt = new int[1] ;
      BC01OU28_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU33_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU33_A5278AlbDevPPie = new short[1] ;
      BC01OU34_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU34_A54AlbRPieUti = new int[1] ;
      BC01OU34_A47AlbREst = new byte[1] ;
      BC01OU34_A252CliCod = new int[1] ;
      BC01OU34_n252CliCod = new boolean[] {false} ;
      BC01OU34_A45AlbRef = new String[] {""} ;
      BC01OU34_A56AlbRUni = new String[] {""} ;
      BC01OU34_A52AlbRPieEnt = new int[1] ;
      BC01OU34_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU35_A279CliNom = new String[] {""} ;
      BC01OU36_A329DevTrnNom = new String[] {""} ;
      BC01OU36_n329DevTrnNom = new boolean[] {false} ;
      BC01OU41_A323DevGenCod = new int[1] ;
      BC01OU41_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU41_n328DevGenUni = new boolean[] {false} ;
      BC01OU41_A326DevGenPie = new short[1] ;
      BC01OU41_n326DevGenPie = new boolean[] {false} ;
      BC01OU41_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU41_A54AlbRPieUti = new int[1] ;
      BC01OU41_A47AlbREst = new byte[1] ;
      BC01OU41_A407EmprNom = new String[] {""} ;
      BC01OU41_n407EmprNom = new boolean[] {false} ;
      BC01OU41_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01OU41_n325DevGenFec = new boolean[] {false} ;
      BC01OU41_A6288DevGenDom = new byte[1] ;
      BC01OU41_n6288DevGenDom = new boolean[] {false} ;
      BC01OU41_A252CliCod = new int[1] ;
      BC01OU41_n252CliCod = new boolean[] {false} ;
      BC01OU41_A279CliNom = new String[] {""} ;
      BC01OU41_A45AlbRef = new String[] {""} ;
      BC01OU41_A329DevTrnNom = new String[] {""} ;
      BC01OU41_n329DevTrnNom = new boolean[] {false} ;
      BC01OU41_A56AlbRUni = new String[] {""} ;
      BC01OU41_A52AlbRPieEnt = new int[1] ;
      BC01OU41_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU41_A324DevGenEst = new byte[1] ;
      BC01OU41_n324DevGenEst = new boolean[] {false} ;
      BC01OU41_A1304DevUlin = new byte[1] ;
      BC01OU41_n1304DevUlin = new boolean[] {false} ;
      BC01OU41_A396EmprCod = new String[] {""} ;
      BC01OU41_A44AlbRecCod = new int[1] ;
      BC01OU41_n44AlbRecCod = new boolean[] {false} ;
      BC01OU41_A327DevGenTrn = new short[1] ;
      BC01OU41_n327DevGenTrn = new boolean[] {false} ;
      BC01OU41_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU41_A5278AlbDevPPie = new short[1] ;
      GXv_int8 = new int[1] ;
      Z3067DevPieUni = DecimalUtil.ZERO ;
      Z4795AlRPieCal = "" ;
      A4795AlRPieCal = "" ;
      Z2155AlbRecKgm = DecimalUtil.ZERO ;
      Z2157AlbRecMtr = DecimalUtil.ZERO ;
      Z2159AlbRecPie = "" ;
      Z2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      Z2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      BC01OU42_A4795AlRPieCal = new String[] {""} ;
      BC01OU42_A323DevGenCod = new int[1] ;
      BC01OU42_A3067DevPieUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU42_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU42_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU42_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU42_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU42_A396EmprCod = new String[] {""} ;
      BC01OU42_A2159AlbRecPie = new String[] {""} ;
      BC01OU42_A44AlbRecCod = new int[1] ;
      BC01OU42_n44AlbRecCod = new boolean[] {false} ;
      O3067DevPieUni = DecimalUtil.ZERO ;
      O2158AlbRecMtrU = DecimalUtil.ZERO ;
      O56AlbRUni = "" ;
      O2156AlbRecKgmU = DecimalUtil.ZERO ;
      AV63oldUni = DecimalUtil.ZERO ;
      BC01OU43_A4795AlRPieCal = new String[] {""} ;
      BC01OU43_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU43_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU43_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU43_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU43_A44AlbRecCod = new int[1] ;
      BC01OU43_n44AlbRecCod = new boolean[] {false} ;
      BC01OU44_A396EmprCod = new String[] {""} ;
      BC01OU44_A323DevGenCod = new int[1] ;
      BC01OU44_A2159AlbRecPie = new String[] {""} ;
      BC01OU45_A323DevGenCod = new int[1] ;
      BC01OU45_A3067DevPieUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU45_A396EmprCod = new String[] {""} ;
      BC01OU45_A2159AlbRecPie = new String[] {""} ;
      sMode451 = "" ;
      BC01OU46_A323DevGenCod = new int[1] ;
      BC01OU46_A3067DevPieUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU46_A396EmprCod = new String[] {""} ;
      BC01OU46_A2159AlbRecPie = new String[] {""} ;
      BC01OU47_A4795AlRPieCal = new String[] {""} ;
      BC01OU47_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU47_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU47_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU47_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU47_A44AlbRecCod = new int[1] ;
      BC01OU47_n44AlbRecCod = new boolean[] {false} ;
      BC01OU51_A4795AlRPieCal = new String[] {""} ;
      BC01OU51_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU51_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU51_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU51_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU53_A4795AlRPieCal = new String[] {""} ;
      BC01OU53_A323DevGenCod = new int[1] ;
      BC01OU53_A3067DevPieUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU53_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU53_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU53_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU53_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU53_A396EmprCod = new String[] {""} ;
      BC01OU53_A2159AlbRecPie = new String[] {""} ;
      BC01OU53_A44AlbRecCod = new int[1] ;
      BC01OU53_n44AlbRecCod = new boolean[] {false} ;
      Z1303DevObs = "" ;
      A1303DevObs = "" ;
      BC01OU54_A323DevGenCod = new int[1] ;
      BC01OU54_A1302DevLin = new byte[1] ;
      BC01OU54_A1303DevObs = new String[] {""} ;
      BC01OU54_A396EmprCod = new String[] {""} ;
      BC01OU55_A396EmprCod = new String[] {""} ;
      BC01OU55_A323DevGenCod = new int[1] ;
      BC01OU55_A1302DevLin = new byte[1] ;
      BC01OU56_A323DevGenCod = new int[1] ;
      BC01OU56_A1302DevLin = new byte[1] ;
      BC01OU56_A1303DevObs = new String[] {""} ;
      BC01OU56_A396EmprCod = new String[] {""} ;
      sMode192 = "" ;
      BC01OU57_A323DevGenCod = new int[1] ;
      BC01OU57_A1302DevLin = new byte[1] ;
      BC01OU57_A1303DevObs = new String[] {""} ;
      BC01OU57_A396EmprCod = new String[] {""} ;
      BC01OU61_A323DevGenCod = new int[1] ;
      BC01OU61_A1302DevLin = new byte[1] ;
      BC01OU61_A1303DevObs = new String[] {""} ;
      BC01OU61_A396EmprCod = new String[] {""} ;
      iV20Modo = "" ;
      i325DevGenFec = GXutil.nullDate() ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC01OU62_A407EmprNom = new String[] {""} ;
      BC01OU62_n407EmprNom = new boolean[] {false} ;
      BC01OU64_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU64_A5278AlbDevPPie = new short[1] ;
      BC01OU65_A407EmprNom = new String[] {""} ;
      BC01OU65_n407EmprNom = new boolean[] {false} ;
      BC01OU67_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OU67_A5278AlbDevPPie = new short[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdevpiecopy1_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdevpiecopy1_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdevpiecopy1_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdevpiecopy1_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevpiecopy1_bc__default(),
         new Object[] {
             new Object[] {
            BC01OU2_A323DevGenCod, BC01OU2_A1302DevLin, BC01OU2_A1303DevObs, BC01OU2_A396EmprCod
            }
            , new Object[] {
            BC01OU3_A323DevGenCod, BC01OU3_A1302DevLin, BC01OU3_A1303DevObs, BC01OU3_A396EmprCod
            }
            , new Object[] {
            BC01OU4_A323DevGenCod, BC01OU4_A3067DevPieUni, BC01OU4_A396EmprCod, BC01OU4_A2159AlbRecPie
            }
            , new Object[] {
            BC01OU5_A323DevGenCod, BC01OU5_A3067DevPieUni, BC01OU5_A396EmprCod, BC01OU5_A2159AlbRecPie
            }
            , new Object[] {
            BC01OU6_A4795AlRPieCal, BC01OU6_A2158AlbRecMtrU, BC01OU6_A2156AlbRecKgmU, BC01OU6_A2155AlbRecKgm, BC01OU6_A2157AlbRecMtr, BC01OU6_A44AlbRecCod
            }
            , new Object[] {
            BC01OU7_A4795AlRPieCal, BC01OU7_A2158AlbRecMtrU, BC01OU7_A2156AlbRecKgmU, BC01OU7_A2155AlbRecKgm, BC01OU7_A2157AlbRecMtr, BC01OU7_A44AlbRecCod
            }
            , new Object[] {
            BC01OU8_A323DevGenCod, BC01OU8_A328DevGenUni, BC01OU8_n328DevGenUni, BC01OU8_A326DevGenPie, BC01OU8_n326DevGenPie, BC01OU8_A325DevGenFec, BC01OU8_n325DevGenFec, BC01OU8_A6288DevGenDom, BC01OU8_n6288DevGenDom, BC01OU8_A324DevGenEst,
            BC01OU8_n324DevGenEst, BC01OU8_A1304DevUlin, BC01OU8_n1304DevUlin, BC01OU8_A396EmprCod, BC01OU8_A44AlbRecCod, BC01OU8_n44AlbRecCod, BC01OU8_A327DevGenTrn, BC01OU8_n327DevGenTrn, BC01OU8_A252CliCod, BC01OU8_n252CliCod
            }
            , new Object[] {
            BC01OU9_A323DevGenCod, BC01OU9_A328DevGenUni, BC01OU9_n328DevGenUni, BC01OU9_A326DevGenPie, BC01OU9_n326DevGenPie, BC01OU9_A325DevGenFec, BC01OU9_n325DevGenFec, BC01OU9_A6288DevGenDom, BC01OU9_n6288DevGenDom, BC01OU9_A324DevGenEst,
            BC01OU9_n324DevGenEst, BC01OU9_A1304DevUlin, BC01OU9_n1304DevUlin, BC01OU9_A396EmprCod, BC01OU9_A44AlbRecCod, BC01OU9_n44AlbRecCod, BC01OU9_A327DevGenTrn, BC01OU9_n327DevGenTrn, BC01OU9_A252CliCod, BC01OU9_n252CliCod
            }
            , new Object[] {
            BC01OU10_A407EmprNom, BC01OU10_n407EmprNom
            }
            , new Object[] {
            BC01OU11_A60AlbRUniUti, BC01OU11_A54AlbRPieUti, BC01OU11_A47AlbREst, BC01OU11_A252CliCod, BC01OU11_A45AlbRef, BC01OU11_A56AlbRUni, BC01OU11_A52AlbRPieEnt, BC01OU11_A58AlbRUniEnt
            }
            , new Object[] {
            BC01OU12_A60AlbRUniUti, BC01OU12_A54AlbRPieUti, BC01OU12_A47AlbREst, BC01OU12_A252CliCod, BC01OU12_A45AlbRef, BC01OU12_A56AlbRUni, BC01OU12_A52AlbRPieEnt, BC01OU12_A58AlbRUniEnt
            }
            , new Object[] {
            BC01OU13_A279CliNom
            }
            , new Object[] {
            BC01OU14_A329DevTrnNom, BC01OU14_n329DevTrnNom
            }
            , new Object[] {
            BC01OU16_A3066AlbDevPUni, BC01OU16_A5278AlbDevPPie
            }
            , new Object[] {
            BC01OU17_A407EmprNom, BC01OU17_n407EmprNom
            }
            , new Object[] {
            BC01OU19_A323DevGenCod, BC01OU19_A328DevGenUni, BC01OU19_n328DevGenUni, BC01OU19_A326DevGenPie, BC01OU19_n326DevGenPie, BC01OU19_A60AlbRUniUti, BC01OU19_A54AlbRPieUti, BC01OU19_A47AlbREst, BC01OU19_A407EmprNom, BC01OU19_n407EmprNom,
            BC01OU19_A325DevGenFec, BC01OU19_n325DevGenFec, BC01OU19_A6288DevGenDom, BC01OU19_n6288DevGenDom, BC01OU19_A252CliCod, BC01OU19_n252CliCod, BC01OU19_A279CliNom, BC01OU19_A45AlbRef, BC01OU19_A329DevTrnNom, BC01OU19_n329DevTrnNom,
            BC01OU19_A56AlbRUni, BC01OU19_A52AlbRPieEnt, BC01OU19_A58AlbRUniEnt, BC01OU19_A324DevGenEst, BC01OU19_n324DevGenEst, BC01OU19_A1304DevUlin, BC01OU19_n1304DevUlin, BC01OU19_A396EmprCod, BC01OU19_A44AlbRecCod, BC01OU19_n44AlbRecCod,
            BC01OU19_A327DevGenTrn, BC01OU19_n327DevGenTrn, BC01OU19_A3066AlbDevPUni, BC01OU19_A5278AlbDevPPie
            }
            , new Object[] {
            BC01OU20_A60AlbRUniUti, BC01OU20_A54AlbRPieUti, BC01OU20_A47AlbREst, BC01OU20_A252CliCod, BC01OU20_A45AlbRef, BC01OU20_A56AlbRUni, BC01OU20_A52AlbRPieEnt, BC01OU20_A58AlbRUniEnt
            }
            , new Object[] {
            BC01OU21_A279CliNom
            }
            , new Object[] {
            BC01OU22_A329DevTrnNom, BC01OU22_n329DevTrnNom
            }
            , new Object[] {
            BC01OU24_A3066AlbDevPUni, BC01OU24_A5278AlbDevPPie
            }
            , new Object[] {
            BC01OU25_A396EmprCod, BC01OU25_A323DevGenCod
            }
            , new Object[] {
            BC01OU26_A323DevGenCod, BC01OU26_A328DevGenUni, BC01OU26_n328DevGenUni, BC01OU26_A326DevGenPie, BC01OU26_n326DevGenPie, BC01OU26_A325DevGenFec, BC01OU26_n325DevGenFec, BC01OU26_A6288DevGenDom, BC01OU26_n6288DevGenDom, BC01OU26_A324DevGenEst,
            BC01OU26_n324DevGenEst, BC01OU26_A1304DevUlin, BC01OU26_n1304DevUlin, BC01OU26_A396EmprCod, BC01OU26_A44AlbRecCod, BC01OU26_n44AlbRecCod, BC01OU26_A327DevGenTrn, BC01OU26_n327DevGenTrn
            }
            , new Object[] {
            BC01OU27_A323DevGenCod, BC01OU27_A328DevGenUni, BC01OU27_n328DevGenUni, BC01OU27_A326DevGenPie, BC01OU27_n326DevGenPie, BC01OU27_A325DevGenFec, BC01OU27_n325DevGenFec, BC01OU27_A6288DevGenDom, BC01OU27_n6288DevGenDom, BC01OU27_A324DevGenEst,
            BC01OU27_n324DevGenEst, BC01OU27_A1304DevUlin, BC01OU27_n1304DevUlin, BC01OU27_A396EmprCod, BC01OU27_A44AlbRecCod, BC01OU27_n44AlbRecCod, BC01OU27_A327DevGenTrn, BC01OU27_n327DevGenTrn
            }
            , new Object[] {
            BC01OU28_A60AlbRUniUti, BC01OU28_A54AlbRPieUti, BC01OU28_A47AlbREst, BC01OU28_A252CliCod, BC01OU28_A45AlbRef, BC01OU28_A56AlbRUni, BC01OU28_A52AlbRPieEnt, BC01OU28_A58AlbRUniEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01OU33_A3066AlbDevPUni, BC01OU33_A5278AlbDevPPie
            }
            , new Object[] {
            BC01OU34_A60AlbRUniUti, BC01OU34_A54AlbRPieUti, BC01OU34_A47AlbREst, BC01OU34_A252CliCod, BC01OU34_A45AlbRef, BC01OU34_A56AlbRUni, BC01OU34_A52AlbRPieEnt, BC01OU34_A58AlbRUniEnt
            }
            , new Object[] {
            BC01OU35_A279CliNom
            }
            , new Object[] {
            BC01OU36_A329DevTrnNom, BC01OU36_n329DevTrnNom
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01OU41_A323DevGenCod, BC01OU41_A328DevGenUni, BC01OU41_n328DevGenUni, BC01OU41_A326DevGenPie, BC01OU41_n326DevGenPie, BC01OU41_A60AlbRUniUti, BC01OU41_A54AlbRPieUti, BC01OU41_A47AlbREst, BC01OU41_A407EmprNom, BC01OU41_n407EmprNom,
            BC01OU41_A325DevGenFec, BC01OU41_n325DevGenFec, BC01OU41_A6288DevGenDom, BC01OU41_n6288DevGenDom, BC01OU41_A252CliCod, BC01OU41_n252CliCod, BC01OU41_A279CliNom, BC01OU41_A45AlbRef, BC01OU41_A329DevTrnNom, BC01OU41_n329DevTrnNom,
            BC01OU41_A56AlbRUni, BC01OU41_A52AlbRPieEnt, BC01OU41_A58AlbRUniEnt, BC01OU41_A324DevGenEst, BC01OU41_n324DevGenEst, BC01OU41_A1304DevUlin, BC01OU41_n1304DevUlin, BC01OU41_A396EmprCod, BC01OU41_A44AlbRecCod, BC01OU41_n44AlbRecCod,
            BC01OU41_A327DevGenTrn, BC01OU41_n327DevGenTrn, BC01OU41_A3066AlbDevPUni, BC01OU41_A5278AlbDevPPie
            }
            , new Object[] {
            BC01OU42_A4795AlRPieCal, BC01OU42_A323DevGenCod, BC01OU42_A3067DevPieUni, BC01OU42_A2158AlbRecMtrU, BC01OU42_A2156AlbRecKgmU, BC01OU42_A2155AlbRecKgm, BC01OU42_A2157AlbRecMtr, BC01OU42_A396EmprCod, BC01OU42_A2159AlbRecPie, BC01OU42_A44AlbRecCod
            }
            , new Object[] {
            BC01OU43_A4795AlRPieCal, BC01OU43_A2158AlbRecMtrU, BC01OU43_A2156AlbRecKgmU, BC01OU43_A2155AlbRecKgm, BC01OU43_A2157AlbRecMtr, BC01OU43_A44AlbRecCod
            }
            , new Object[] {
            BC01OU44_A396EmprCod, BC01OU44_A323DevGenCod, BC01OU44_A2159AlbRecPie
            }
            , new Object[] {
            BC01OU45_A323DevGenCod, BC01OU45_A3067DevPieUni, BC01OU45_A396EmprCod, BC01OU45_A2159AlbRecPie
            }
            , new Object[] {
            BC01OU46_A323DevGenCod, BC01OU46_A3067DevPieUni, BC01OU46_A396EmprCod, BC01OU46_A2159AlbRecPie
            }
            , new Object[] {
            BC01OU47_A4795AlRPieCal, BC01OU47_A2158AlbRecMtrU, BC01OU47_A2156AlbRecKgmU, BC01OU47_A2155AlbRecKgm, BC01OU47_A2157AlbRecMtr, BC01OU47_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01OU51_A4795AlRPieCal, BC01OU51_A2158AlbRecMtrU, BC01OU51_A2156AlbRecKgmU, BC01OU51_A2155AlbRecKgm, BC01OU51_A2157AlbRecMtr
            }
            , new Object[] {
            }
            , new Object[] {
            BC01OU53_A4795AlRPieCal, BC01OU53_A323DevGenCod, BC01OU53_A3067DevPieUni, BC01OU53_A2158AlbRecMtrU, BC01OU53_A2156AlbRecKgmU, BC01OU53_A2155AlbRecKgm, BC01OU53_A2157AlbRecMtr, BC01OU53_A396EmprCod, BC01OU53_A2159AlbRecPie, BC01OU53_A44AlbRecCod
            }
            , new Object[] {
            BC01OU54_A323DevGenCod, BC01OU54_A1302DevLin, BC01OU54_A1303DevObs, BC01OU54_A396EmprCod
            }
            , new Object[] {
            BC01OU55_A396EmprCod, BC01OU55_A323DevGenCod, BC01OU55_A1302DevLin
            }
            , new Object[] {
            BC01OU56_A323DevGenCod, BC01OU56_A1302DevLin, BC01OU56_A1303DevObs, BC01OU56_A396EmprCod
            }
            , new Object[] {
            BC01OU57_A323DevGenCod, BC01OU57_A1302DevLin, BC01OU57_A1303DevObs, BC01OU57_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01OU61_A323DevGenCod, BC01OU61_A1302DevLin, BC01OU61_A1303DevObs, BC01OU61_A396EmprCod
            }
            , new Object[] {
            BC01OU62_A407EmprNom, BC01OU62_n407EmprNom
            }
            , new Object[] {
            BC01OU64_A3066AlbDevPUni, BC01OU64_A5278AlbDevPPie
            }
            , new Object[] {
            BC01OU65_A407EmprNom, BC01OU65_n407EmprNom
            }
            , new Object[] {
            BC01OU67_A3066AlbDevPUni, BC01OU67_A5278AlbDevPPie
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      A325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      O325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      i325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e111OU2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte s1304DevUlin ;
   private byte O1304DevUlin ;
   private byte A1304DevUlin ;
   private byte s47AlbREst ;
   private byte O47AlbREst ;
   private byte A47AlbREst ;
   private byte Z6288DevGenDom ;
   private byte A6288DevGenDom ;
   private byte Z324DevGenEst ;
   private byte A324DevGenEst ;
   private byte Z1304DevUlin ;
   private byte Z47AlbREst ;
   private byte Gx_BScreen ;
   private byte GXv_int10[] ;
   private byte Gxremove451 ;
   private byte Gxremove192 ;
   private byte Z1302DevLin ;
   private byte A1302DevLin ;
   private byte i1304DevUlin ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nIsMod_192 ;
   private short RcdFound192 ;
   private short s326DevGenPie ;
   private short O326DevGenPie ;
   private short A326DevGenPie ;
   private short s5278AlbDevPPie ;
   private short O5278AlbDevPPie ;
   private short A5278AlbDevPPie ;
   private short sV16PieAnt ;
   private short OV16PieAnt ;
   private short AV16PieAnt ;
   private short sV19Piezas ;
   private short OV19Piezas ;
   private short AV19Piezas ;
   private short nIsMod_451 ;
   private short RcdFound451 ;
   private short AV58AlbRecAnh ;
   private short Z326DevGenPie ;
   private short Z327DevGenTrn ;
   private short A327DevGenTrn ;
   private short Z5278AlbDevPPie ;
   private short RcdFound31 ;
   private short nIsDirty_31 ;
   private short nRcdExists_451 ;
   private short nRcdExists_192 ;
   private short nIsDirty_451 ;
   private short nIsDirty_192 ;
   private short i326DevGenPie ;
   private int trnEnded ;
   private int Z323DevGenCod ;
   private int A323DevGenCod ;
   private int nGXsfl_192_idx=1 ;
   private int s54AlbRPieUti ;
   private int O54AlbRPieUti ;
   private int A54AlbRPieUti ;
   private int sV9AlbRPieDis ;
   private int OV9AlbRPieDis ;
   private int AV9AlbRPieDis ;
   private int nGXsfl_451_idx=1 ;
   private int A44AlbRecCod ;
   private int GX_JID ;
   private int Z44AlbRecCod ;
   private int Z51AlbRPieDis ;
   private int A51AlbRPieDis ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int Z52AlbRPieEnt ;
   private int A52AlbRPieEnt ;
   private int Z54AlbRPieUti ;
   private int AV11AlbRPDis ;
   private int GXv_int5[] ;
   private int GXv_int6[] ;
   private int GXv_int8[] ;
   private int i54AlbRPieUti ;
   private java.math.BigDecimal s328DevGenUni ;
   private java.math.BigDecimal O328DevGenUni ;
   private java.math.BigDecimal A328DevGenUni ;
   private java.math.BigDecimal s60AlbRUniUti ;
   private java.math.BigDecimal O60AlbRUniUti ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal s3066AlbDevPUni ;
   private java.math.BigDecimal O3066AlbDevPUni ;
   private java.math.BigDecimal A3066AlbDevPUni ;
   private java.math.BigDecimal sV14KilAnt ;
   private java.math.BigDecimal OV14KilAnt ;
   private java.math.BigDecimal AV14KilAnt ;
   private java.math.BigDecimal sV15MetAnt ;
   private java.math.BigDecimal OV15MetAnt ;
   private java.math.BigDecimal AV15MetAnt ;
   private java.math.BigDecimal sV17Kilos ;
   private java.math.BigDecimal OV17Kilos ;
   private java.math.BigDecimal AV17Kilos ;
   private java.math.BigDecimal sV18Metros ;
   private java.math.BigDecimal OV18Metros ;
   private java.math.BigDecimal AV18Metros ;
   private java.math.BigDecimal sV10AlbRUniDis ;
   private java.math.BigDecimal OV10AlbRUniDis ;
   private java.math.BigDecimal AV10AlbRUniDis ;
   private java.math.BigDecimal A3067DevPieUni ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal Z328DevGenUni ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal Z3066AlbDevPUni ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal AV12AlbRUDis ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal Z3067DevPieUni ;
   private java.math.BigDecimal Z2155AlbRecKgm ;
   private java.math.BigDecimal Z2157AlbRecMtr ;
   private java.math.BigDecimal Z2158AlbRecMtrU ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal Z2156AlbRecKgmU ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal O3067DevPieUni ;
   private java.math.BigDecimal O2158AlbRecMtrU ;
   private java.math.BigDecimal O2156AlbRecKgmU ;
   private java.math.BigDecimal AV63oldUni ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z396EmprCod ;
   private String A396EmprCod ;
   private String sMode31 ;
   private String AV24Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV7EmprNom ;
   private String AV8UsurCod ;
   private String A2159AlbRecPie ;
   private String Z407EmprNom ;
   private String A407EmprNom ;
   private String Z45AlbRef ;
   private String A45AlbRef ;
   private String Z56AlbRUni ;
   private String A56AlbRUni ;
   private String Z279CliNom ;
   private String A279CliNom ;
   private String Z329DevTrnNom ;
   private String A329DevTrnNom ;
   private String AV20Modo ;
   private String AV13AlbRUni ;
   private String GXv_char4[] ;
   private String AV65Err_att ;
   private String GXv_char3[] ;
   private String Z4795AlRPieCal ;
   private String A4795AlRPieCal ;
   private String Z2159AlbRecPie ;
   private String O56AlbRUni ;
   private String sMode451 ;
   private String Z1303DevObs ;
   private String A1303DevObs ;
   private String sMode192 ;
   private String iV20Modo ;
   private java.util.Date Z325DevGenFec ;
   private java.util.Date A325DevGenFec ;
   private java.util.Date AV61oldDevGenFec ;
   private java.util.Date O325DevGenFec ;
   private java.util.Date i325DevGenFec ;
   private boolean n1304DevUlin ;
   private boolean n326DevGenPie ;
   private boolean n328DevGenUni ;
   private boolean returnInSub ;
   private boolean n407EmprNom ;
   private boolean n325DevGenFec ;
   private boolean n6288DevGenDom ;
   private boolean n252CliCod ;
   private boolean n329DevTrnNom ;
   private boolean n324DevGenEst ;
   private boolean n44AlbRecCod ;
   private boolean n327DevGenTrn ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private app.SdtTDevPieCopy1 bcTDevPieCopy1 ;
   private IDataStoreProvider pr_default ;
   private String[] BC01OU17_A407EmprNom ;
   private boolean[] BC01OU17_n407EmprNom ;
   private int[] BC01OU19_A323DevGenCod ;
   private java.math.BigDecimal[] BC01OU19_A328DevGenUni ;
   private boolean[] BC01OU19_n328DevGenUni ;
   private short[] BC01OU19_A326DevGenPie ;
   private boolean[] BC01OU19_n326DevGenPie ;
   private java.math.BigDecimal[] BC01OU19_A60AlbRUniUti ;
   private int[] BC01OU19_A54AlbRPieUti ;
   private byte[] BC01OU19_A47AlbREst ;
   private String[] BC01OU19_A407EmprNom ;
   private boolean[] BC01OU19_n407EmprNom ;
   private java.util.Date[] BC01OU19_A325DevGenFec ;
   private boolean[] BC01OU19_n325DevGenFec ;
   private byte[] BC01OU19_A6288DevGenDom ;
   private boolean[] BC01OU19_n6288DevGenDom ;
   private int[] BC01OU19_A252CliCod ;
   private boolean[] BC01OU19_n252CliCod ;
   private String[] BC01OU19_A279CliNom ;
   private String[] BC01OU19_A45AlbRef ;
   private String[] BC01OU19_A329DevTrnNom ;
   private boolean[] BC01OU19_n329DevTrnNom ;
   private String[] BC01OU19_A56AlbRUni ;
   private int[] BC01OU19_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01OU19_A58AlbRUniEnt ;
   private byte[] BC01OU19_A324DevGenEst ;
   private boolean[] BC01OU19_n324DevGenEst ;
   private byte[] BC01OU19_A1304DevUlin ;
   private boolean[] BC01OU19_n1304DevUlin ;
   private String[] BC01OU19_A396EmprCod ;
   private int[] BC01OU19_A44AlbRecCod ;
   private boolean[] BC01OU19_n44AlbRecCod ;
   private short[] BC01OU19_A327DevGenTrn ;
   private boolean[] BC01OU19_n327DevGenTrn ;
   private java.math.BigDecimal[] BC01OU19_A3066AlbDevPUni ;
   private short[] BC01OU19_A5278AlbDevPPie ;
   private java.math.BigDecimal[] BC01OU20_A60AlbRUniUti ;
   private int[] BC01OU20_A54AlbRPieUti ;
   private byte[] BC01OU20_A47AlbREst ;
   private int[] BC01OU20_A252CliCod ;
   private boolean[] BC01OU20_n252CliCod ;
   private String[] BC01OU20_A45AlbRef ;
   private String[] BC01OU20_A56AlbRUni ;
   private int[] BC01OU20_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01OU20_A58AlbRUniEnt ;
   private String[] BC01OU21_A279CliNom ;
   private String[] BC01OU22_A329DevTrnNom ;
   private boolean[] BC01OU22_n329DevTrnNom ;
   private java.math.BigDecimal[] BC01OU24_A3066AlbDevPUni ;
   private short[] BC01OU24_A5278AlbDevPPie ;
   private String[] BC01OU25_A396EmprCod ;
   private int[] BC01OU25_A323DevGenCod ;
   private int[] BC01OU26_A323DevGenCod ;
   private java.math.BigDecimal[] BC01OU26_A328DevGenUni ;
   private boolean[] BC01OU26_n328DevGenUni ;
   private short[] BC01OU26_A326DevGenPie ;
   private boolean[] BC01OU26_n326DevGenPie ;
   private java.util.Date[] BC01OU26_A325DevGenFec ;
   private boolean[] BC01OU26_n325DevGenFec ;
   private byte[] BC01OU26_A6288DevGenDom ;
   private boolean[] BC01OU26_n6288DevGenDom ;
   private byte[] BC01OU26_A324DevGenEst ;
   private boolean[] BC01OU26_n324DevGenEst ;
   private byte[] BC01OU26_A1304DevUlin ;
   private boolean[] BC01OU26_n1304DevUlin ;
   private String[] BC01OU26_A396EmprCod ;
   private int[] BC01OU26_A44AlbRecCod ;
   private boolean[] BC01OU26_n44AlbRecCod ;
   private short[] BC01OU26_A327DevGenTrn ;
   private boolean[] BC01OU26_n327DevGenTrn ;
   private int[] BC01OU27_A323DevGenCod ;
   private java.math.BigDecimal[] BC01OU27_A328DevGenUni ;
   private boolean[] BC01OU27_n328DevGenUni ;
   private short[] BC01OU27_A326DevGenPie ;
   private boolean[] BC01OU27_n326DevGenPie ;
   private java.util.Date[] BC01OU27_A325DevGenFec ;
   private boolean[] BC01OU27_n325DevGenFec ;
   private byte[] BC01OU27_A6288DevGenDom ;
   private boolean[] BC01OU27_n6288DevGenDom ;
   private byte[] BC01OU27_A324DevGenEst ;
   private boolean[] BC01OU27_n324DevGenEst ;
   private byte[] BC01OU27_A1304DevUlin ;
   private boolean[] BC01OU27_n1304DevUlin ;
   private String[] BC01OU27_A396EmprCod ;
   private int[] BC01OU27_A44AlbRecCod ;
   private boolean[] BC01OU27_n44AlbRecCod ;
   private short[] BC01OU27_A327DevGenTrn ;
   private boolean[] BC01OU27_n327DevGenTrn ;
   private java.math.BigDecimal[] BC01OU28_A60AlbRUniUti ;
   private int[] BC01OU28_A54AlbRPieUti ;
   private byte[] BC01OU28_A47AlbREst ;
   private int[] BC01OU28_A252CliCod ;
   private boolean[] BC01OU28_n252CliCod ;
   private String[] BC01OU28_A45AlbRef ;
   private String[] BC01OU28_A56AlbRUni ;
   private int[] BC01OU28_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01OU28_A58AlbRUniEnt ;
   private java.math.BigDecimal[] BC01OU33_A3066AlbDevPUni ;
   private short[] BC01OU33_A5278AlbDevPPie ;
   private java.math.BigDecimal[] BC01OU34_A60AlbRUniUti ;
   private int[] BC01OU34_A54AlbRPieUti ;
   private byte[] BC01OU34_A47AlbREst ;
   private int[] BC01OU34_A252CliCod ;
   private boolean[] BC01OU34_n252CliCod ;
   private String[] BC01OU34_A45AlbRef ;
   private String[] BC01OU34_A56AlbRUni ;
   private int[] BC01OU34_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01OU34_A58AlbRUniEnt ;
   private String[] BC01OU35_A279CliNom ;
   private String[] BC01OU36_A329DevTrnNom ;
   private boolean[] BC01OU36_n329DevTrnNom ;
   private int[] BC01OU41_A323DevGenCod ;
   private java.math.BigDecimal[] BC01OU41_A328DevGenUni ;
   private boolean[] BC01OU41_n328DevGenUni ;
   private short[] BC01OU41_A326DevGenPie ;
   private boolean[] BC01OU41_n326DevGenPie ;
   private java.math.BigDecimal[] BC01OU41_A60AlbRUniUti ;
   private int[] BC01OU41_A54AlbRPieUti ;
   private byte[] BC01OU41_A47AlbREst ;
   private String[] BC01OU41_A407EmprNom ;
   private boolean[] BC01OU41_n407EmprNom ;
   private java.util.Date[] BC01OU41_A325DevGenFec ;
   private boolean[] BC01OU41_n325DevGenFec ;
   private byte[] BC01OU41_A6288DevGenDom ;
   private boolean[] BC01OU41_n6288DevGenDom ;
   private int[] BC01OU41_A252CliCod ;
   private boolean[] BC01OU41_n252CliCod ;
   private String[] BC01OU41_A279CliNom ;
   private String[] BC01OU41_A45AlbRef ;
   private String[] BC01OU41_A329DevTrnNom ;
   private boolean[] BC01OU41_n329DevTrnNom ;
   private String[] BC01OU41_A56AlbRUni ;
   private int[] BC01OU41_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01OU41_A58AlbRUniEnt ;
   private byte[] BC01OU41_A324DevGenEst ;
   private boolean[] BC01OU41_n324DevGenEst ;
   private byte[] BC01OU41_A1304DevUlin ;
   private boolean[] BC01OU41_n1304DevUlin ;
   private String[] BC01OU41_A396EmprCod ;
   private int[] BC01OU41_A44AlbRecCod ;
   private boolean[] BC01OU41_n44AlbRecCod ;
   private short[] BC01OU41_A327DevGenTrn ;
   private boolean[] BC01OU41_n327DevGenTrn ;
   private java.math.BigDecimal[] BC01OU41_A3066AlbDevPUni ;
   private short[] BC01OU41_A5278AlbDevPPie ;
   private String[] BC01OU42_A4795AlRPieCal ;
   private int[] BC01OU42_A323DevGenCod ;
   private java.math.BigDecimal[] BC01OU42_A3067DevPieUni ;
   private java.math.BigDecimal[] BC01OU42_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] BC01OU42_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] BC01OU42_A2155AlbRecKgm ;
   private java.math.BigDecimal[] BC01OU42_A2157AlbRecMtr ;
   private String[] BC01OU42_A396EmprCod ;
   private String[] BC01OU42_A2159AlbRecPie ;
   private int[] BC01OU42_A44AlbRecCod ;
   private boolean[] BC01OU42_n44AlbRecCod ;
   private String[] BC01OU43_A4795AlRPieCal ;
   private java.math.BigDecimal[] BC01OU43_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] BC01OU43_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] BC01OU43_A2155AlbRecKgm ;
   private java.math.BigDecimal[] BC01OU43_A2157AlbRecMtr ;
   private int[] BC01OU43_A44AlbRecCod ;
   private boolean[] BC01OU43_n44AlbRecCod ;
   private String[] BC01OU44_A396EmprCod ;
   private int[] BC01OU44_A323DevGenCod ;
   private String[] BC01OU44_A2159AlbRecPie ;
   private int[] BC01OU45_A323DevGenCod ;
   private java.math.BigDecimal[] BC01OU45_A3067DevPieUni ;
   private String[] BC01OU45_A396EmprCod ;
   private String[] BC01OU45_A2159AlbRecPie ;
   private int[] BC01OU46_A323DevGenCod ;
   private java.math.BigDecimal[] BC01OU46_A3067DevPieUni ;
   private String[] BC01OU46_A396EmprCod ;
   private String[] BC01OU46_A2159AlbRecPie ;
   private String[] BC01OU47_A4795AlRPieCal ;
   private java.math.BigDecimal[] BC01OU47_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] BC01OU47_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] BC01OU47_A2155AlbRecKgm ;
   private java.math.BigDecimal[] BC01OU47_A2157AlbRecMtr ;
   private int[] BC01OU47_A44AlbRecCod ;
   private boolean[] BC01OU47_n44AlbRecCod ;
   private String[] BC01OU51_A4795AlRPieCal ;
   private java.math.BigDecimal[] BC01OU51_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] BC01OU51_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] BC01OU51_A2155AlbRecKgm ;
   private java.math.BigDecimal[] BC01OU51_A2157AlbRecMtr ;
   private String[] BC01OU53_A4795AlRPieCal ;
   private int[] BC01OU53_A323DevGenCod ;
   private java.math.BigDecimal[] BC01OU53_A3067DevPieUni ;
   private java.math.BigDecimal[] BC01OU53_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] BC01OU53_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] BC01OU53_A2155AlbRecKgm ;
   private java.math.BigDecimal[] BC01OU53_A2157AlbRecMtr ;
   private String[] BC01OU53_A396EmprCod ;
   private String[] BC01OU53_A2159AlbRecPie ;
   private int[] BC01OU53_A44AlbRecCod ;
   private boolean[] BC01OU53_n44AlbRecCod ;
   private int[] BC01OU54_A323DevGenCod ;
   private byte[] BC01OU54_A1302DevLin ;
   private String[] BC01OU54_A1303DevObs ;
   private String[] BC01OU54_A396EmprCod ;
   private String[] BC01OU55_A396EmprCod ;
   private int[] BC01OU55_A323DevGenCod ;
   private byte[] BC01OU55_A1302DevLin ;
   private int[] BC01OU56_A323DevGenCod ;
   private byte[] BC01OU56_A1302DevLin ;
   private String[] BC01OU56_A1303DevObs ;
   private String[] BC01OU56_A396EmprCod ;
   private int[] BC01OU57_A323DevGenCod ;
   private byte[] BC01OU57_A1302DevLin ;
   private String[] BC01OU57_A1303DevObs ;
   private String[] BC01OU57_A396EmprCod ;
   private int[] BC01OU61_A323DevGenCod ;
   private byte[] BC01OU61_A1302DevLin ;
   private String[] BC01OU61_A1303DevObs ;
   private String[] BC01OU61_A396EmprCod ;
   private String[] BC01OU62_A407EmprNom ;
   private boolean[] BC01OU62_n407EmprNom ;
   private java.math.BigDecimal[] BC01OU64_A3066AlbDevPUni ;
   private short[] BC01OU64_A5278AlbDevPPie ;
   private String[] BC01OU65_A407EmprNom ;
   private boolean[] BC01OU65_n407EmprNom ;
   private java.math.BigDecimal[] BC01OU67_A3066AlbDevPUni ;
   private short[] BC01OU67_A5278AlbDevPPie ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private int[] BC01OU2_A323DevGenCod ;
   private byte[] BC01OU2_A1302DevLin ;
   private String[] BC01OU2_A1303DevObs ;
   private String[] BC01OU2_A396EmprCod ;
   private int[] BC01OU3_A323DevGenCod ;
   private byte[] BC01OU3_A1302DevLin ;
   private String[] BC01OU3_A1303DevObs ;
   private String[] BC01OU3_A396EmprCod ;
   private int[] BC01OU4_A323DevGenCod ;
   private java.math.BigDecimal[] BC01OU4_A3067DevPieUni ;
   private String[] BC01OU4_A396EmprCod ;
   private String[] BC01OU4_A2159AlbRecPie ;
   private int[] BC01OU5_A323DevGenCod ;
   private java.math.BigDecimal[] BC01OU5_A3067DevPieUni ;
   private String[] BC01OU5_A396EmprCod ;
   private String[] BC01OU5_A2159AlbRecPie ;
   private String[] BC01OU6_A4795AlRPieCal ;
   private java.math.BigDecimal[] BC01OU6_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] BC01OU6_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] BC01OU6_A2155AlbRecKgm ;
   private java.math.BigDecimal[] BC01OU6_A2157AlbRecMtr ;
   private int[] BC01OU6_A44AlbRecCod ;
   private String[] BC01OU7_A4795AlRPieCal ;
   private java.math.BigDecimal[] BC01OU7_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] BC01OU7_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] BC01OU7_A2155AlbRecKgm ;
   private java.math.BigDecimal[] BC01OU7_A2157AlbRecMtr ;
   private int[] BC01OU7_A44AlbRecCod ;
   private int[] BC01OU8_A323DevGenCod ;
   private java.math.BigDecimal[] BC01OU8_A328DevGenUni ;
   private short[] BC01OU8_A326DevGenPie ;
   private java.util.Date[] BC01OU8_A325DevGenFec ;
   private byte[] BC01OU8_A6288DevGenDom ;
   private byte[] BC01OU8_A324DevGenEst ;
   private byte[] BC01OU8_A1304DevUlin ;
   private String[] BC01OU8_A396EmprCod ;
   private int[] BC01OU8_A44AlbRecCod ;
   private short[] BC01OU8_A327DevGenTrn ;
   private int[] BC01OU8_A252CliCod ;
   private int[] BC01OU9_A323DevGenCod ;
   private java.math.BigDecimal[] BC01OU9_A328DevGenUni ;
   private short[] BC01OU9_A326DevGenPie ;
   private java.util.Date[] BC01OU9_A325DevGenFec ;
   private byte[] BC01OU9_A6288DevGenDom ;
   private byte[] BC01OU9_A324DevGenEst ;
   private byte[] BC01OU9_A1304DevUlin ;
   private String[] BC01OU9_A396EmprCod ;
   private int[] BC01OU9_A44AlbRecCod ;
   private short[] BC01OU9_A327DevGenTrn ;
   private int[] BC01OU9_A252CliCod ;
   private String[] BC01OU10_A407EmprNom ;
   private java.math.BigDecimal[] BC01OU11_A60AlbRUniUti ;
   private int[] BC01OU11_A54AlbRPieUti ;
   private byte[] BC01OU11_A47AlbREst ;
   private int[] BC01OU11_A252CliCod ;
   private String[] BC01OU11_A45AlbRef ;
   private String[] BC01OU11_A56AlbRUni ;
   private int[] BC01OU11_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01OU11_A58AlbRUniEnt ;
   private java.math.BigDecimal[] BC01OU12_A60AlbRUniUti ;
   private int[] BC01OU12_A54AlbRPieUti ;
   private byte[] BC01OU12_A47AlbREst ;
   private int[] BC01OU12_A252CliCod ;
   private String[] BC01OU12_A45AlbRef ;
   private String[] BC01OU12_A56AlbRUni ;
   private int[] BC01OU12_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01OU12_A58AlbRUniEnt ;
   private String[] BC01OU13_A279CliNom ;
   private String[] BC01OU14_A329DevTrnNom ;
   private java.math.BigDecimal[] BC01OU16_A3066AlbDevPUni ;
   private short[] BC01OU16_A5278AlbDevPPie ;
   private boolean[] BC01OU8_n328DevGenUni ;
   private boolean[] BC01OU8_n326DevGenPie ;
   private boolean[] BC01OU8_n325DevGenFec ;
   private boolean[] BC01OU8_n6288DevGenDom ;
   private boolean[] BC01OU8_n324DevGenEst ;
   private boolean[] BC01OU8_n1304DevUlin ;
   private boolean[] BC01OU8_n44AlbRecCod ;
   private boolean[] BC01OU8_n327DevGenTrn ;
   private boolean[] BC01OU8_n252CliCod ;
   private boolean[] BC01OU9_n328DevGenUni ;
   private boolean[] BC01OU9_n326DevGenPie ;
   private boolean[] BC01OU9_n325DevGenFec ;
   private boolean[] BC01OU9_n6288DevGenDom ;
   private boolean[] BC01OU9_n324DevGenEst ;
   private boolean[] BC01OU9_n1304DevUlin ;
   private boolean[] BC01OU9_n44AlbRecCod ;
   private boolean[] BC01OU9_n327DevGenTrn ;
   private boolean[] BC01OU9_n252CliCod ;
   private boolean[] BC01OU10_n407EmprNom ;
   private boolean[] BC01OU14_n329DevTrnNom ;
}

final  class tdevpiecopy1_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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
      return "MODA21";
   }

}

final  class tdevpiecopy1_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpiecopy1_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpiecopy1_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpiecopy1_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01OU2", "SELECT DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ?  FOR UPDATE OF DevObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU3", "SELECT DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU4", "SELECT DevGenCod, DevPieUni, EmprCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ?  FOR UPDATE OF DevPieUni NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU5", "SELECT DevGenCod, DevPieUni, EmprCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU6", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?  FOR UPDATE OF AlbRecMtrU, AlbRecKgmU NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU7", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU8", "SELECT DevGenCod, DevGenUni, DevGenPie, DevGenFec, DevGenDom, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, CliCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ?  FOR UPDATE OF DevGenUni, DevGenPie, DevGenFec, DevGenDom, DevGenEst, DevUlin, AlbRecCod, DevGenTrn, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU9", "SELECT DevGenCod, DevGenUni, DevGenPie, DevGenFec, DevGenDom, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, CliCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU11", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRPieUti, AlbREst, AlbRUniUti NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU12", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU13", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU14", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU16", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU17", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU19", "SELECT /*+ FIRST_ROWS(100) */ TM1.DevGenCod, TM1.DevGenUni, TM1.DevGenPie, T4.AlbRUniUti, T4.AlbRPieUti, T4.AlbREst, T2.EmprNom, TM1.DevGenFec, TM1.DevGenDom, TM1.CliCod, T5.CliNom, T4.AlbRef, T6.TrnNom AS DevTrnNom, T4.AlbRUni, T4.AlbRPieEnt, T4.AlbRUniEnt, TM1.DevGenEst, TM1.DevUlin, TM1.EmprCod, TM1.AlbRecCod, TM1.DevGenTrn AS DevGenTrn, COALESCE( T3.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T3.AlbDevPPie, 0) AS AlbDevPPie FROM (((((TXPDEVGEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.DevGenCod = TM1.DevGenCod) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = TM1.EmprCod AND T4.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = TM1.DevGenTrn) WHERE TM1.EmprCod = ? and TM1.DevGenCod = ? ORDER BY TM1.EmprCod, TM1.DevGenCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU20", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU21", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU22", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU24", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU25", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU26", "SELECT DevGenCod, DevGenUni, DevGenPie, DevGenFec, DevGenDom, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU27", "SELECT DevGenCod, DevGenUni, DevGenPie, DevGenFec, DevGenDom, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ?  FOR UPDATE OF DevGenUni, DevGenPie, DevGenFec, DevGenDom, DevGenEst, DevUlin, AlbRecCod, DevGenTrn, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU28", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRPieUti, AlbREst, AlbRUniUti NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01OU29", "INSERT INTO TXPDEVGEN(CliCod, DevGenCod, DevGenUni, DevGenPie, DevGenFec, DevGenDom, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, EmprTrn, DevMatric, DevHorSal, DevFmd, DevFmdD, DevFHh, DevGrossT, DevStt, DevDiscli, DevMdl, DevEnvAT, DevATCodeI, DevGenAT, DevAlbRecC, DevGenATCU, DevGenSerA, DevGenTipA) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ')", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("BC01OU30", "UPDATE TXPDEVGEN SET CliCod=?, DevGenUni=?, DevGenPie=?, DevGenFec=?, DevGenDom=?, DevGenEst=?, DevUlin=?, AlbRecCod=?, DevGenTrn=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("BC01OU31", "DELETE FROM TXPDEVGEN  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new ForEachCursor("BC01OU33", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU34", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU35", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU36", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01OU37", "UPDATE TXPDEVGEN SET DevUlin=?, DevGenPie=?, DevGenUni=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("BC01OU38", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("BC01OU39", "UPDATE TXPALBREC SET AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("BC01OU41", "SELECT /*+ FIRST_ROWS(100) */ TM1.DevGenCod, TM1.DevGenUni, TM1.DevGenPie, T4.AlbRUniUti, T4.AlbRPieUti, T4.AlbREst, T2.EmprNom, TM1.DevGenFec, TM1.DevGenDom, TM1.CliCod, T5.CliNom, T4.AlbRef, T6.TrnNom AS DevTrnNom, T4.AlbRUni, T4.AlbRPieEnt, T4.AlbRUniEnt, TM1.DevGenEst, TM1.DevUlin, TM1.EmprCod, TM1.AlbRecCod, TM1.DevGenTrn AS DevGenTrn, COALESCE( T3.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T3.AlbDevPPie, 0) AS AlbDevPPie FROM (((((TXPDEVGEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.DevGenCod = TM1.DevGenCod) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = TM1.EmprCod AND T4.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = TM1.DevGenTrn) WHERE TM1.EmprCod = ? and TM1.DevGenCod = ? ORDER BY TM1.EmprCod, TM1.DevGenCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU42", "SELECT /*+ FIRST_ROWS(11) */ T2.AlRPieCal, T1.DevGenCod, T1.DevPieUni, T2.AlbRecMtrU, T2.AlbRecKgmU, T2.AlbRecKgm, T2.AlbRecMtr, T1.EmprCod, T1.AlbRecPie, T2.AlbRecCod FROM (TXPDevPie T1 LEFT JOIN TXPALBDET T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = ? AND T2.AlbRecPie = T1.AlbRecPie) WHERE T1.DevGenCod = ? and T1.EmprCod = ? and T1.AlbRecPie = ? ORDER BY T1.EmprCod, T1.DevGenCod, T1.AlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU43", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU44", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU45", "SELECT DevGenCod, DevPieUni, EmprCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU46", "SELECT DevGenCod, DevPieUni, EmprCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ?  FOR UPDATE OF DevPieUni NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU47", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?  FOR UPDATE OF AlbRecMtrU, AlbRecKgmU NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01OU48", "INSERT INTO TXPDevPie(DevGenCod, DevPieUni, EmprCod, AlbRecPie) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPDevPie")
         ,new UpdateCursor("BC01OU49", "UPDATE TXPDevPie SET DevPieUni=?  WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPDevPie")
         ,new UpdateCursor("BC01OU50", "DELETE FROM TXPDevPie  WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPDevPie")
         ,new ForEachCursor("BC01OU51", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01OU52", "UPDATE TXPALBDET SET AlbRecMtrU=?, AlbRecKgmU=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPALBDET")
         ,new ForEachCursor("BC01OU53", "SELECT /*+ FIRST_ROWS(11) */ T2.AlRPieCal, T1.DevGenCod, T1.DevPieUni, T2.AlbRecMtrU, T2.AlbRecKgmU, T2.AlbRecKgm, T2.AlbRecMtr, T1.EmprCod, T1.AlbRecPie, T2.AlbRecCod FROM (TXPDevPie T1 LEFT JOIN TXPALBDET T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = ? AND T2.AlbRecPie = T1.AlbRecPie) WHERE T1.DevGenCod = ? and T1.EmprCod = ? ORDER BY T1.EmprCod, T1.DevGenCod, T1.AlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU54", "SELECT /*+ FIRST_ROWS(11) */ DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? and DevGenCod = ? and DevLin = ? ORDER BY EmprCod, DevGenCod, DevLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU55", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod, DevLin FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU56", "SELECT DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU57", "SELECT DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ?  FOR UPDATE OF DevObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01OU58", "INSERT INTO TXPDEVOBS(DevGenCod, DevLin, DevObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPDEVOBS")
         ,new UpdateCursor("BC01OU59", "UPDATE TXPDEVOBS SET DevObs=?  WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ?", GX_NOMASK, "TXPDEVOBS")
         ,new UpdateCursor("BC01OU60", "DELETE FROM TXPDEVOBS  WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ?", GX_NOMASK, "TXPDEVOBS")
         ,new ForEachCursor("BC01OU61", "SELECT /*+ FIRST_ROWS(11) */ DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? and DevGenCod = ? ORDER BY EmprCod, DevGenCod, DevLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU62", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU64", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU65", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OU67", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 30);
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
               ((String[]) buf[18])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 1);
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(16,2);
               ((byte[]) buf[23])[0] = rslt.getByte(17);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(19, 3);
               ((int[]) buf[28])[0] = rslt.getInt(20);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(21);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(22,2);
               ((short[]) buf[33])[0] = rslt.getShort(23);
               return;
            case 16 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 22 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 23 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 27 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 28 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 30);
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
               ((String[]) buf[18])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 1);
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(16,2);
               ((byte[]) buf[23])[0] = rslt.getByte(17);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(19, 3);
               ((int[]) buf[28])[0] = rslt.getInt(20);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(21);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(22,2);
               ((short[]) buf[33])[0] = rslt.getShort(23);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 38 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 39 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 47 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 49 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 50 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 54 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 56 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 58 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
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
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
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
            case 10 :
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
            case 11 :
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
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
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
            case 17 :
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
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
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
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[14]).byteValue());
               }
               stmt.setString(9, (String)parms[15], 3);
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[19]).shortValue());
               }
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               stmt.setString(10, (String)parms[18], 3);
               stmt.setInt(11, ((Number) parms[19]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
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
            case 29 :
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
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               return;
            case 32 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               return;
            case 33 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 35 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setString(3, (String)parms[3], 3);
               stmt.setString(4, (String)parms[4], 9);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 41 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 42 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 45 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               stmt.setString(5, (String)parms[5], 9);
               return;
            case 46 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 51 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 60);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

