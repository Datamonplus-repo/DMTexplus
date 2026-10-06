package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdevpie1_bc extends GXWebPanel implements IGxSilentTrn
{
   public tdevpie1_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdevpie1_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdevpie1_bc.class ));
   }

   public tdevpie1_bc( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1P231( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1P231( ) ;
      standaloneModal( ) ;
      addRow1P231( ) ;
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
         /* Execute user event: After Trn */
         e111P22 ();
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

   public void confirm_1P20( )
   {
      beforeValidate1P231( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1P231( ) ;
         }
         else
         {
            checkExtendedTable1P231( ) ;
            if ( AnyError == 0 )
            {
               zm1P231( 29) ;
               zm1P231( 30) ;
               zm1P231( 31) ;
               zm1P231( 32) ;
               zm1P231( 33) ;
            }
            closeExtendedTableCursors1P231( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode31 = Gx_mode ;
         confirm_1P2192( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode31 ;
            IsConfirmed = (short)(1) ;
         }
         /* Restore parent mode. */
         Gx_mode = sMode31 ;
      }
   }

   public void confirm_1P2192( )
   {
      s1304DevUlin = O1304DevUlin ;
      n1304DevUlin = false ;
      nGXsfl_192_idx = 0 ;
      while ( nGXsfl_192_idx < bcTDevPie1.getgxTv_SdtTDevPie1_Level2().size() )
      {
         readRow1P2192( ) ;
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
            getKey1P2192( ) ;
            if ( isIns( ) && ! isDlt( ) )
            {
               if ( RcdFound192 == 0 )
               {
                  Gx_mode = "INS" ;
                  beforeValidate1P2192( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1P2192( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1P2192( ) ;
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
                     getByPrimaryKey1P2192( ) ;
                     load1P2192( ) ;
                     beforeValidate1P2192( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1P2192( ) ;
                        O1304DevUlin = A1304DevUlin ;
                        n1304DevUlin = false ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_192 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        beforeValidate1P2192( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1P2192( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1P2192( ) ;
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
            VarsToRow192( ((app.SdtTDevPie1_Level2Item)bcTDevPie1.getgxTv_SdtTDevPie1_Level2().elementAt(-1+nGXsfl_192_idx))) ;
         }
      }
      O1304DevUlin = s1304DevUlin ;
      n1304DevUlin = false ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void e121P22( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tdevpie1_bc.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdevpie1_bc.this.A396EmprCod = GXv_char2[0] ;
      tdevpie1_bc.this.AV7EmprNom = GXv_char3[0] ;
      tdevpie1_bc.this.AV8UsurCod = GXv_char4[0] ;
      GXt_char1 = AV24Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tdevpie1_bc.this.GXt_char1 = GXv_char4[0] ;
      AV24Station = GXt_char1 ;
      GXv_char4[0] = AV75EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char4, GXv_char3, GXv_char2) ;
      tdevpie1_bc.this.AV75EmprCod = GXv_char4[0] ;
      tdevpie1_bc.this.AV7EmprNom = GXv_char3[0] ;
      tdevpie1_bc.this.AV8UsurCod = GXv_char2[0] ;
      GXv_SdtWWPContext5[0] = AV77WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV77WWPContext = GXv_SdtWWPContext5[0] ;
      AV78TrnContext.fromxml(AV79WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV78TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV88Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV89GXV1 = 1 ;
         while ( AV89GXV1 <= AV78TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV82TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV78TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV89GXV1));
            if ( GXutil.strcmp(AV82TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlbRecCod") == 0 )
            {
               AV80Insert_AlbRecCod = (int)(GXutil.lval( AV82TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV82TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "DevGenTrn") == 0 )
            {
               AV81Insert_DevGenTrn = (short)(GXutil.lval( AV82TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            AV89GXV1 = (int)(AV89GXV1+1) ;
         }
      }
   }

   public void e111P22( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tdevpie2", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A323DevGenCod,8,0))}, new String[] {"Mode","EmprCod","DevGenCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e131P22( )
   {
      /* AlbRecCod_Click Routine */
      returnInSub = false ;
      /* Window Datatype Object Property */
      AV86Window.setUrl( formatLink("app.selecciontablaalbrec", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"EmprCod","Clicodin","AlbReccod"})  );
      AV86Window.setReturnParms(new Object[] {"A44AlbRecCod",});
      AV86Window.setWidth( 230 );
      AV86Window.setHeight( 200 );
      httpContext.newWindow(AV86Window);
      /*  Sending Event outputs  */
   }

   public void zm1P231( int GX_JID )
   {
      if ( ( GX_JID == 28 ) || ( GX_JID == 0 ) )
      {
         Z328DevGenUni = A328DevGenUni ;
         Z326DevGenPie = A326DevGenPie ;
         Z325DevGenFec = A325DevGenFec ;
         Z6288DevGenDom = A6288DevGenDom ;
         Z410EmprTrn = A410EmprTrn ;
         Z324DevGenEst = A324DevGenEst ;
         Z1304DevUlin = A1304DevUlin ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z327DevGenTrn = A327DevGenTrn ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
      if ( ( GX_JID == 29 ) || ( GX_JID == 0 ) )
      {
         Z407EmprNom = A407EmprNom ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
      if ( ( GX_JID == 30 ) || ( GX_JID == 0 ) )
      {
         Z47AlbREst = A47AlbREst ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z54AlbRPieUti = A54AlbRPieUti ;
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
      if ( ( GX_JID == 31 ) || ( GX_JID == 0 ) )
      {
         Z279CliNom = A279CliNom ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
      if ( ( GX_JID == 32 ) || ( GX_JID == 0 ) )
      {
         Z329DevTrnNom = A329DevTrnNom ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
      if ( ( GX_JID == 33 ) || ( GX_JID == 0 ) )
      {
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
      if ( GX_JID == -28 )
      {
         Z323DevGenCod = A323DevGenCod ;
         Z328DevGenUni = A328DevGenUni ;
         Z326DevGenPie = A326DevGenPie ;
         Z325DevGenFec = A325DevGenFec ;
         Z6288DevGenDom = A6288DevGenDom ;
         Z252CliCod = A252CliCod ;
         Z410EmprTrn = A410EmprTrn ;
         Z324DevGenEst = A324DevGenEst ;
         Z1304DevUlin = A1304DevUlin ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z327DevGenTrn = A327DevGenTrn ;
         Z407EmprNom = A407EmprNom ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
         Z47AlbREst = A47AlbREst ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z54AlbRPieUti = A54AlbRPieUti ;
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
      AV88Pgmname = "TDevPie1_BC" ;
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC01P213 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = BC01P213_A407EmprNom[0] ;
      n407EmprNom = BC01P213_n407EmprNom[0] ;
      pr_default.close(10);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A325DevGenFec)) && ( Gx_BScreen == 0 ) )
      {
         A325DevGenFec = GXutil.today( ) ;
         n325DevGenFec = false ;
      }
      if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
      {
         AV9AlbRPieDis = AV11AlbRPDis ;
      }
      else
      {
         AV9AlbRPieDis = A51AlbRPieDis ;
      }
      AV16PieAnt = O326DevGenPie ;
      AV19Piezas = A326DevGenPie ;
   }

   public void load1P231( )
   {
      /* Using cursor BC01P215 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A47AlbREst = BC01P215_A47AlbREst[0] ;
         A328DevGenUni = BC01P215_A328DevGenUni[0] ;
         n328DevGenUni = BC01P215_n328DevGenUni[0] ;
         A326DevGenPie = BC01P215_A326DevGenPie[0] ;
         n326DevGenPie = BC01P215_n326DevGenPie[0] ;
         A60AlbRUniUti = BC01P215_A60AlbRUniUti[0] ;
         A54AlbRPieUti = BC01P215_A54AlbRPieUti[0] ;
         A407EmprNom = BC01P215_A407EmprNom[0] ;
         n407EmprNom = BC01P215_n407EmprNom[0] ;
         A325DevGenFec = BC01P215_A325DevGenFec[0] ;
         n325DevGenFec = BC01P215_n325DevGenFec[0] ;
         A6288DevGenDom = BC01P215_A6288DevGenDom[0] ;
         n6288DevGenDom = BC01P215_n6288DevGenDom[0] ;
         A252CliCod = BC01P215_A252CliCod[0] ;
         n252CliCod = BC01P215_n252CliCod[0] ;
         A279CliNom = BC01P215_A279CliNom[0] ;
         A45AlbRef = BC01P215_A45AlbRef[0] ;
         A410EmprTrn = BC01P215_A410EmprTrn[0] ;
         n410EmprTrn = BC01P215_n410EmprTrn[0] ;
         A329DevTrnNom = BC01P215_A329DevTrnNom[0] ;
         n329DevTrnNom = BC01P215_n329DevTrnNom[0] ;
         A56AlbRUni = BC01P215_A56AlbRUni[0] ;
         A52AlbRPieEnt = BC01P215_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = BC01P215_A58AlbRUniEnt[0] ;
         A324DevGenEst = BC01P215_A324DevGenEst[0] ;
         n324DevGenEst = BC01P215_n324DevGenEst[0] ;
         A1304DevUlin = BC01P215_A1304DevUlin[0] ;
         n1304DevUlin = BC01P215_n1304DevUlin[0] ;
         A44AlbRecCod = BC01P215_A44AlbRecCod[0] ;
         n44AlbRecCod = BC01P215_n44AlbRecCod[0] ;
         A327DevGenTrn = BC01P215_A327DevGenTrn[0] ;
         n327DevGenTrn = BC01P215_n327DevGenTrn[0] ;
         A3066AlbDevPUni = BC01P215_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = BC01P215_A5278AlbDevPPie[0] ;
         zm1P231( -28) ;
      }
      pr_default.close(11);
      onLoadActions1P231( ) ;
   }

   public void onLoadActions1P231( )
   {
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
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         AV10AlbRUniDis = AV12AlbRUDis ;
      }
      else
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
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
   }

   public void checkExtendedTable1P231( )
   {
      nIsDirty_31 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC01P216 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
      }
      A47AlbREst = BC01P216_A47AlbREst[0] ;
      A60AlbRUniUti = BC01P216_A60AlbRUniUti[0] ;
      A54AlbRPieUti = BC01P216_A54AlbRPieUti[0] ;
      A252CliCod = BC01P216_A252CliCod[0] ;
      n252CliCod = BC01P216_n252CliCod[0] ;
      A45AlbRef = BC01P216_A45AlbRef[0] ;
      A56AlbRUni = BC01P216_A56AlbRUni[0] ;
      A52AlbRPieEnt = BC01P216_A52AlbRPieEnt[0] ;
      A58AlbRUniEnt = BC01P216_A58AlbRUniEnt[0] ;
      pr_default.close(12);
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
      /* Using cursor BC01P217 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = BC01P217_A279CliNom[0] ;
      pr_default.close(13);
      /* Using cursor BC01P218 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A327DevGenTrn) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevGen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVGENTRN");
            AnyError = (short)(1) ;
         }
      }
      A329DevTrnNom = BC01P218_A329DevTrnNom[0] ;
      n329DevTrnNom = BC01P218_n329DevTrnNom[0] ;
      pr_default.close(14);
      /* Using cursor BC01P220 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A3066AlbDevPUni = BC01P220_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = BC01P220_A5278AlbDevPPie[0] ;
      }
      else
      {
         nIsDirty_31 = (short)(1) ;
         A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
         nIsDirty_31 = (short)(1) ;
         A5278AlbDevPPie = (short)(0) ;
      }
      pr_default.close(15);
      if ( (0==A44AlbRecCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion es requerido.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A44AlbRecCod ;
         GXv_int7[0] = AV9AlbRPieDis ;
         GXv_decimal8[0] = AV10AlbRUniDis ;
         GXv_int9[0] = AV11AlbRPDis ;
         GXv_decimal10[0] = AV12AlbRUDis ;
         GXv_char3[0] = AV13AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int7, GXv_decimal8, GXv_int9, GXv_decimal10, GXv_char3) ;
         tdevpie1_bc.this.A396EmprCod = GXv_char4[0] ;
         tdevpie1_bc.this.A44AlbRecCod = GXv_int6[0] ;
         tdevpie1_bc.this.AV9AlbRPieDis = GXv_int7[0] ;
         tdevpie1_bc.this.AV10AlbRUniDis = GXv_decimal8[0] ;
         tdevpie1_bc.this.AV11AlbRPDis = GXv_int9[0] ;
         tdevpie1_bc.this.AV12AlbRUDis = GXv_decimal10[0] ;
         tdevpie1_bc.this.AV13AlbRUni = GXv_char3[0] ;
      }
      if ( (0==A44AlbRecCod) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion NO valido", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( A6288DevGenDom > 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A252CliCod ;
         GXv_int11[0] = A6288DevGenDom ;
         GXv_char3[0] = AV65Err_att ;
         new app.pexdomenvio(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int11, GXv_char3) ;
         tdevpie1_bc.this.A396EmprCod = GXv_char4[0] ;
         tdevpie1_bc.this.A252CliCod = GXv_int9[0] ;
         tdevpie1_bc.this.A6288DevGenDom = GXv_int11[0] ;
         tdevpie1_bc.this.AV65Err_att = GXv_char3[0] ;
      }
      if ( ( A6288DevGenDom > 0 ) && true /* After */ && ( GXutil.strcmp(AV65Err_att, "") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV65Err_att, 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         AV10AlbRUniDis = AV12AlbRUDis ;
      }
      else
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
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
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 0, "");
      }
   }

   public void closeExtendedTableCursors1P231( )
   {
      pr_default.close(5);
      pr_default.close(13);
      pr_default.close(14);
      pr_default.close(15);
   }

   public void enableDisable( )
   {
   }

   public void getKey1P231( )
   {
      /* Using cursor BC01P221 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound31 = (short)(1) ;
      }
      else
      {
         RcdFound31 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01P222 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(17) != 101) && ( GXutil.strcmp(BC01P222_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1P231( 28) ;
         RcdFound31 = (short)(1) ;
         A323DevGenCod = BC01P222_A323DevGenCod[0] ;
         A328DevGenUni = BC01P222_A328DevGenUni[0] ;
         n328DevGenUni = BC01P222_n328DevGenUni[0] ;
         A326DevGenPie = BC01P222_A326DevGenPie[0] ;
         n326DevGenPie = BC01P222_n326DevGenPie[0] ;
         A325DevGenFec = BC01P222_A325DevGenFec[0] ;
         n325DevGenFec = BC01P222_n325DevGenFec[0] ;
         A6288DevGenDom = BC01P222_A6288DevGenDom[0] ;
         n6288DevGenDom = BC01P222_n6288DevGenDom[0] ;
         A410EmprTrn = BC01P222_A410EmprTrn[0] ;
         n410EmprTrn = BC01P222_n410EmprTrn[0] ;
         A324DevGenEst = BC01P222_A324DevGenEst[0] ;
         n324DevGenEst = BC01P222_n324DevGenEst[0] ;
         A1304DevUlin = BC01P222_A1304DevUlin[0] ;
         n1304DevUlin = BC01P222_n1304DevUlin[0] ;
         A44AlbRecCod = BC01P222_A44AlbRecCod[0] ;
         n44AlbRecCod = BC01P222_n44AlbRecCod[0] ;
         A327DevGenTrn = BC01P222_A327DevGenTrn[0] ;
         n327DevGenTrn = BC01P222_n327DevGenTrn[0] ;
         O1304DevUlin = A1304DevUlin ;
         n1304DevUlin = false ;
         O326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         O328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1P231( ) ;
         if ( AnyError == 1 )
         {
            RcdFound31 = (short)(0) ;
            initializeNonKey1P231( ) ;
         }
         Gx_mode = sMode31 ;
      }
      else
      {
         RcdFound31 = (short)(0) ;
         initializeNonKey1P231( ) ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode31 ;
      }
      pr_default.close(17);
   }

   public void getEqualNoModal( )
   {
      getKey1P231( ) ;
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
      confirm_1P20( ) ;
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

   public void checkOptimisticConcurrency1P231( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01P223 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(18) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVGEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(18) == 101) || ( DecimalUtil.compareTo(Z328DevGenUni, BC01P223_A328DevGenUni[0]) != 0 ) || ( Z326DevGenPie != BC01P223_A326DevGenPie[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z325DevGenFec), GXutil.resetTime(BC01P223_A325DevGenFec[0])) ) || ( Z6288DevGenDom != BC01P223_A6288DevGenDom[0] ) || ( GXutil.strcmp(Z410EmprTrn, BC01P223_A410EmprTrn[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z324DevGenEst != BC01P223_A324DevGenEst[0] ) || ( Z1304DevUlin != BC01P223_A1304DevUlin[0] ) || ( Z44AlbRecCod != BC01P223_A44AlbRecCod[0] ) || ( Z327DevGenTrn != BC01P223_A327DevGenTrn[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVGEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor BC01P224 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(19) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( Z47AlbREst != BC01P224_A47AlbREst[0] ) || ( DecimalUtil.compareTo(Z60AlbRUniUti, BC01P224_A60AlbRUniUti[0]) != 0 ) || ( Z54AlbRPieUti != BC01P224_A54AlbRPieUti[0] ) || ( Z252CliCod != BC01P224_A252CliCod[0] ) || ( GXutil.strcmp(Z45AlbRef, BC01P224_A45AlbRef[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z56AlbRUni, BC01P224_A56AlbRUni[0]) != 0 ) || ( Z52AlbRPieEnt != BC01P224_A52AlbRPieEnt[0] ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, BC01P224_A58AlbRUniEnt[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1P231( )
   {
      beforeValidate1P231( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P231( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1P231( 0) ;
         checkOptimisticConcurrency1P231( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P231( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1P231( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01P225 */
                  pr_default.execute(20, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A323DevGenCod), Boolean.valueOf(n328DevGenUni), A328DevGenUni, Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n325DevGenFec), A325DevGenFec, Boolean.valueOf(n6288DevGenDom), Byte.valueOf(A6288DevGenDom), Boolean.valueOf(n410EmprTrn), A410EmprTrn, Boolean.valueOf(n324DevGenEst), Byte.valueOf(A324DevGenEst), Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( (pr_default.getStatus(20) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11P231( ) ;
                     /* Start of After( Insert) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.updemprtrn(remoteHandle, context).execute( A396EmprCod, A323DevGenCod) ;
                     }
                     if ( ! (0==A323DevGenCod) && true /* After */ && true /* Level */ )
                     {
                        httpContext.wjLoc = formatLink("app.webwdevpza", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A323DevGenCod,8,0)),GXutil.URLEncode(DecimalUtil.decToString(A328DevGenUni)),GXutil.URLEncode(GXutil.ltrimstr(A326DevGenPie,4,0)),GXutil.URLEncode(DecimalUtil.decToString(A60AlbRUniUti)),GXutil.URLEncode(GXutil.ltrimstr(A54AlbRPieUti,6,0))}, new String[] {"EmprCod","ALbRecCod","DevGenCod","DevGenUni","DevGenPie","AlbRUniUti","AlbRPieUti"})  ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1P231( ) ;
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
            load1P231( ) ;
         }
         endLevel1P231( ) ;
      }
      closeExtendedTableCursors1P231( ) ;
   }

   public void update1P231( )
   {
      beforeValidate1P231( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P231( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P231( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P231( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1P231( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01P226 */
                  pr_default.execute(21, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n328DevGenUni), A328DevGenUni, Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n325DevGenFec), A325DevGenFec, Boolean.valueOf(n6288DevGenDom), Byte.valueOf(A6288DevGenDom), Boolean.valueOf(n410EmprTrn), A410EmprTrn, Boolean.valueOf(n324DevGenEst), Byte.valueOf(A324DevGenEst), Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn), A396EmprCod, Integer.valueOf(A323DevGenCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( (pr_default.getStatus(21) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVGEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1P231( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11P231( ) ;
                     /* Start of After( update) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.updemprtrn(remoteHandle, context).execute( A396EmprCod, A323DevGenCod) ;
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1P231( ) ;
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
         endLevel1P231( ) ;
      }
      closeExtendedTableCursors1P231( ) ;
   }

   public void deferredUpdate1P231( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1P231( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P231( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1P231( ) ;
         afterConfirm1P231( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1P231( ) ;
            if ( AnyError == 0 )
            {
               A1304DevUlin = O1304DevUlin ;
               n1304DevUlin = false ;
               scanKeyStart1P2192( ) ;
               while ( RcdFound192 != 0 )
               {
                  getByPrimaryKey1P2192( ) ;
                  delete1P2192( ) ;
                  scanKeyNext1P2192( ) ;
                  O1304DevUlin = A1304DevUlin ;
                  n1304DevUlin = false ;
               }
               scanKeyEnd1P2192( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01P227 */
                  pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11P231( ) ;
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
      endLevel1P231( ) ;
      Gx_mode = sMode31 ;
   }

   public void onDeleteControls1P231( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC01P229 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            A3066AlbDevPUni = BC01P229_A3066AlbDevPUni[0] ;
            A5278AlbDevPPie = BC01P229_A5278AlbDevPPie[0] ;
         }
         else
         {
            A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
            A5278AlbDevPPie = (short)(0) ;
         }
         pr_default.close(23);
         /* Using cursor BC01P230 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         zm1P231( 30) ;
         A47AlbREst = BC01P230_A47AlbREst[0] ;
         A60AlbRUniUti = BC01P230_A60AlbRUniUti[0] ;
         A54AlbRPieUti = BC01P230_A54AlbRPieUti[0] ;
         A252CliCod = BC01P230_A252CliCod[0] ;
         n252CliCod = BC01P230_n252CliCod[0] ;
         A45AlbRef = BC01P230_A45AlbRef[0] ;
         A56AlbRUni = BC01P230_A56AlbRUni[0] ;
         A52AlbRPieEnt = BC01P230_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = BC01P230_A58AlbRUniEnt[0] ;
         pr_default.close(24);
         /* Using cursor BC01P231 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = BC01P231_A279CliNom[0] ;
         pr_default.close(25);
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
         /* Using cursor BC01P232 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
         A329DevTrnNom = BC01P232_A329DevTrnNom[0] ;
         n329DevTrnNom = BC01P232_n329DevTrnNom[0] ;
         pr_default.close(26);
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV10AlbRUniDis = AV12AlbRUDis ;
         }
         else
         {
            AV10AlbRUniDis = A57AlbRUniDis ;
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
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC01P233 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Piezas devueltas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
      }
   }

   public void processNestedLevel1P2192( )
   {
      s1304DevUlin = O1304DevUlin ;
      n1304DevUlin = false ;
      nGXsfl_192_idx = 0 ;
      while ( nGXsfl_192_idx < bcTDevPie1.getgxTv_SdtTDevPie1_Level2().size() )
      {
         readRow1P2192( ) ;
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
            standaloneNotModal1P2192( ) ;
            if ( isIns( ) )
            {
               Gx_mode = "INS" ;
               insert1P2192( ) ;
            }
            else
            {
               if ( isDlt( ) )
               {
                  Gx_mode = "DLT" ;
                  delete1P2192( ) ;
               }
               else
               {
                  Gx_mode = "UPD" ;
                  update1P2192( ) ;
               }
            }
            O1304DevUlin = A1304DevUlin ;
            n1304DevUlin = false ;
         }
         KeyVarsToRow192( ((app.SdtTDevPie1_Level2Item)bcTDevPie1.getgxTv_SdtTDevPie1_Level2().elementAt(-1+nGXsfl_192_idx))) ;
      }
      if ( AnyError == 0 )
      {
         /* Batch update SDT rows */
         nGXsfl_192_idx = 0 ;
         while ( nGXsfl_192_idx < bcTDevPie1.getgxTv_SdtTDevPie1_Level2().size() )
         {
            readRow1P2192( ) ;
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
               bcTDevPie1.getgxTv_SdtTDevPie1_Level2().removeElement(nGXsfl_192_idx);
               nGXsfl_192_idx = (int)(nGXsfl_192_idx-1) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               getByPrimaryKey1P2192( ) ;
               VarsToRow192( ((app.SdtTDevPie1_Level2Item)bcTDevPie1.getgxTv_SdtTDevPie1_Level2().elementAt(-1+nGXsfl_192_idx))) ;
            }
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1P2192( ) ;
      if ( AnyError != 0 )
      {
         O1304DevUlin = s1304DevUlin ;
         n1304DevUlin = false ;
      }
      nRcdExists_192 = (short)(0) ;
      nIsMod_192 = (short)(0) ;
      Gxremove192 = (byte)(0) ;
   }

   public void processLevel1P231( )
   {
      /* Save parent mode. */
      sMode31 = Gx_mode ;
      processNestedLevel1P2192( ) ;
      if ( AnyError != 0 )
      {
         O1304DevUlin = s1304DevUlin ;
         n1304DevUlin = false ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode31 ;
      /* ' Update level parameters */
      /* Using cursor BC01P234 */
      pr_default.execute(28, new Object[] {Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), A396EmprCod, Integer.valueOf(A323DevGenCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
   }

   public void updateTablesN11P231( )
   {
      /* Using cursor BC01P235 */
      pr_default.execute(29, new Object[] {Byte.valueOf(A47AlbREst), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel1P231( )
   {
      pr_default.close(18);
      pr_default.close(19);
      if ( AnyError == 0 )
      {
         beforeComplete1P231( ) ;
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

   public void scanKeyStart1P231( )
   {
      /* Scan By routine */
      /* Using cursor BC01P237 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A323DevGenCod = BC01P237_A323DevGenCod[0] ;
         A47AlbREst = BC01P237_A47AlbREst[0] ;
         A328DevGenUni = BC01P237_A328DevGenUni[0] ;
         n328DevGenUni = BC01P237_n328DevGenUni[0] ;
         A326DevGenPie = BC01P237_A326DevGenPie[0] ;
         n326DevGenPie = BC01P237_n326DevGenPie[0] ;
         A60AlbRUniUti = BC01P237_A60AlbRUniUti[0] ;
         A54AlbRPieUti = BC01P237_A54AlbRPieUti[0] ;
         A407EmprNom = BC01P237_A407EmprNom[0] ;
         n407EmprNom = BC01P237_n407EmprNom[0] ;
         A325DevGenFec = BC01P237_A325DevGenFec[0] ;
         n325DevGenFec = BC01P237_n325DevGenFec[0] ;
         A6288DevGenDom = BC01P237_A6288DevGenDom[0] ;
         n6288DevGenDom = BC01P237_n6288DevGenDom[0] ;
         A252CliCod = BC01P237_A252CliCod[0] ;
         n252CliCod = BC01P237_n252CliCod[0] ;
         A279CliNom = BC01P237_A279CliNom[0] ;
         A45AlbRef = BC01P237_A45AlbRef[0] ;
         A410EmprTrn = BC01P237_A410EmprTrn[0] ;
         n410EmprTrn = BC01P237_n410EmprTrn[0] ;
         A329DevTrnNom = BC01P237_A329DevTrnNom[0] ;
         n329DevTrnNom = BC01P237_n329DevTrnNom[0] ;
         A56AlbRUni = BC01P237_A56AlbRUni[0] ;
         A52AlbRPieEnt = BC01P237_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = BC01P237_A58AlbRUniEnt[0] ;
         A324DevGenEst = BC01P237_A324DevGenEst[0] ;
         n324DevGenEst = BC01P237_n324DevGenEst[0] ;
         A1304DevUlin = BC01P237_A1304DevUlin[0] ;
         n1304DevUlin = BC01P237_n1304DevUlin[0] ;
         A44AlbRecCod = BC01P237_A44AlbRecCod[0] ;
         n44AlbRecCod = BC01P237_n44AlbRecCod[0] ;
         A327DevGenTrn = BC01P237_A327DevGenTrn[0] ;
         n327DevGenTrn = BC01P237_n327DevGenTrn[0] ;
         A3066AlbDevPUni = BC01P237_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = BC01P237_A5278AlbDevPPie[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1P231( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound31 = (short)(0) ;
      scanKeyLoad1P231( ) ;
   }

   public void scanKeyLoad1P231( )
   {
      sMode31 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A323DevGenCod = BC01P237_A323DevGenCod[0] ;
         A47AlbREst = BC01P237_A47AlbREst[0] ;
         A328DevGenUni = BC01P237_A328DevGenUni[0] ;
         n328DevGenUni = BC01P237_n328DevGenUni[0] ;
         A326DevGenPie = BC01P237_A326DevGenPie[0] ;
         n326DevGenPie = BC01P237_n326DevGenPie[0] ;
         A60AlbRUniUti = BC01P237_A60AlbRUniUti[0] ;
         A54AlbRPieUti = BC01P237_A54AlbRPieUti[0] ;
         A407EmprNom = BC01P237_A407EmprNom[0] ;
         n407EmprNom = BC01P237_n407EmprNom[0] ;
         A325DevGenFec = BC01P237_A325DevGenFec[0] ;
         n325DevGenFec = BC01P237_n325DevGenFec[0] ;
         A6288DevGenDom = BC01P237_A6288DevGenDom[0] ;
         n6288DevGenDom = BC01P237_n6288DevGenDom[0] ;
         A252CliCod = BC01P237_A252CliCod[0] ;
         n252CliCod = BC01P237_n252CliCod[0] ;
         A279CliNom = BC01P237_A279CliNom[0] ;
         A45AlbRef = BC01P237_A45AlbRef[0] ;
         A410EmprTrn = BC01P237_A410EmprTrn[0] ;
         n410EmprTrn = BC01P237_n410EmprTrn[0] ;
         A329DevTrnNom = BC01P237_A329DevTrnNom[0] ;
         n329DevTrnNom = BC01P237_n329DevTrnNom[0] ;
         A56AlbRUni = BC01P237_A56AlbRUni[0] ;
         A52AlbRPieEnt = BC01P237_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = BC01P237_A58AlbRUniEnt[0] ;
         A324DevGenEst = BC01P237_A324DevGenEst[0] ;
         n324DevGenEst = BC01P237_n324DevGenEst[0] ;
         A1304DevUlin = BC01P237_A1304DevUlin[0] ;
         n1304DevUlin = BC01P237_n1304DevUlin[0] ;
         A44AlbRecCod = BC01P237_A44AlbRecCod[0] ;
         n44AlbRecCod = BC01P237_n44AlbRecCod[0] ;
         A327DevGenTrn = BC01P237_A327DevGenTrn[0] ;
         n327DevGenTrn = BC01P237_n327DevGenTrn[0] ;
         A3066AlbDevPUni = BC01P237_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = BC01P237_A5278AlbDevPPie[0] ;
      }
      Gx_mode = sMode31 ;
   }

   public void scanKeyEnd1P231( )
   {
      pr_default.close(30);
   }

   public void afterConfirm1P231( )
   {
      /* After Confirm Rules */
      if ( (0==A323DevGenCod) && true /* After */ && true /* Level */ )
      {
         GXv_int9[0] = A323DevGenCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int9) ;
         tdevpie1_bc.this.A323DevGenCod = GXv_int9[0] ;
      }
   }

   public void beforeInsert1P231( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1P231( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1P231( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1P231( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1P231( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1P231( )
   {
   }

   public void zm1P2192( int GX_JID )
   {
      if ( ( GX_JID == 34 ) || ( GX_JID == 0 ) )
      {
         Z1303DevObs = A1303DevObs ;
      }
      if ( GX_JID == -34 )
      {
         Z323DevGenCod = A323DevGenCod ;
         Z1302DevLin = A1302DevLin ;
         Z1303DevObs = A1303DevObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1P2192( )
   {
   }

   public void standaloneModal1P2192( )
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

   public void load1P2192( )
   {
      /* Using cursor BC01P238 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound192 = (short)(1) ;
         A1303DevObs = BC01P238_A1303DevObs[0] ;
         zm1P2192( -34) ;
      }
      pr_default.close(31);
      onLoadActions1P2192( ) ;
   }

   public void onLoadActions1P2192( )
   {
   }

   public void checkExtendedTable1P2192( )
   {
      nIsDirty_192 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1P2192( ) ;
      Gx_BScreen = (byte)(0) ;
   }

   public void closeExtendedTableCursors1P2192( )
   {
   }

   public void enableDisable1P2192( )
   {
   }

   public void getKey1P2192( )
   {
      /* Using cursor BC01P239 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound192 = (short)(1) ;
      }
      else
      {
         RcdFound192 = (short)(0) ;
      }
      pr_default.close(32);
   }

   public void getByPrimaryKey1P2192( )
   {
      /* Using cursor BC01P240 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
      if ( (pr_default.getStatus(33) != 101) && ( GXutil.strcmp(BC01P240_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1P2192( 34) ;
         RcdFound192 = (short)(1) ;
         initializeNonKey1P2192( ) ;
         A1302DevLin = BC01P240_A1302DevLin[0] ;
         A1303DevObs = BC01P240_A1303DevObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         Z1302DevLin = A1302DevLin ;
         sMode192 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1P2192( ) ;
         load1P2192( ) ;
         Gx_mode = sMode192 ;
      }
      else
      {
         RcdFound192 = (short)(0) ;
         initializeNonKey1P2192( ) ;
         sMode192 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1P2192( ) ;
         Gx_mode = sMode192 ;
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1P2192( ) ;
      }
      pr_default.close(33);
   }

   public void checkOptimisticConcurrency1P2192( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01P241 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
         if ( (pr_default.getStatus(34) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVOBS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(34) == 101) || ( GXutil.strcmp(Z1303DevObs, BC01P241_A1303DevObs[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVOBS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1P2192( )
   {
      beforeValidate1P2192( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P2192( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1P2192( 0) ;
         checkOptimisticConcurrency1P2192( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P2192( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1P2192( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01P242 */
                  pr_default.execute(35, new Object[] {Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin), A1303DevObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVOBS");
                  if ( (pr_default.getStatus(35) == 1) )
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
            load1P2192( ) ;
         }
         endLevel1P2192( ) ;
      }
      closeExtendedTableCursors1P2192( ) ;
   }

   public void update1P2192( )
   {
      beforeValidate1P2192( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P2192( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P2192( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P2192( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1P2192( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01P243 */
                  pr_default.execute(36, new Object[] {A1303DevObs, A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVOBS");
                  if ( (pr_default.getStatus(36) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVOBS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1P2192( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey1P2192( ) ;
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
         endLevel1P2192( ) ;
      }
      closeExtendedTableCursors1P2192( ) ;
   }

   public void deferredUpdate1P2192( )
   {
   }

   public void delete1P2192( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1P2192( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P2192( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1P2192( ) ;
         afterConfirm1P2192( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1P2192( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01P244 */
               pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
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
      endLevel1P2192( ) ;
      Gx_mode = sMode192 ;
   }

   public void onDeleteControls1P2192( )
   {
      standaloneModal1P2192( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1P2192( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(34);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1P2192( )
   {
      /* Scan By routine */
      /* Using cursor BC01P245 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      RcdFound192 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound192 = (short)(1) ;
         A1302DevLin = BC01P245_A1302DevLin[0] ;
         A1303DevObs = BC01P245_A1303DevObs[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1P2192( )
   {
      /* Scan next routine */
      pr_default.readNext(38);
      RcdFound192 = (short)(0) ;
      scanKeyLoad1P2192( ) ;
   }

   public void scanKeyLoad1P2192( )
   {
      sMode192 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound192 = (short)(1) ;
         A1302DevLin = BC01P245_A1302DevLin[0] ;
         A1303DevObs = BC01P245_A1303DevObs[0] ;
      }
      Gx_mode = sMode192 ;
   }

   public void scanKeyEnd1P2192( )
   {
      pr_default.close(38);
   }

   public void afterConfirm1P2192( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1P2192( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1P2192( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1P2192( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1P2192( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1P2192( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1P2192( )
   {
   }

   public void send_integrity_lvl_hashes1P2192( )
   {
   }

   public void send_integrity_lvl_hashes1P231( )
   {
   }

   public void addRow1P231( )
   {
      VarsToRow31( bcTDevPie1) ;
   }

   public void readRow1P231( )
   {
      RowToVars31( bcTDevPie1, 1) ;
   }

   public void addRow1P2192( )
   {
      app.SdtTDevPie1_Level2Item obj192;
      obj192 = new app.SdtTDevPie1_Level2Item(remoteHandle);
      VarsToRow192( obj192) ;
      bcTDevPie1.getgxTv_SdtTDevPie1_Level2().add(obj192, 0);
      obj192.setgxTv_SdtTDevPie1_Level2Item_Mode( "UPD" );
      obj192.setgxTv_SdtTDevPie1_Level2Item_Modified( (short)(0) );
   }

   public void readRow1P2192( )
   {
      nGXsfl_192_idx = (int)(nGXsfl_192_idx+1) ;
      RowToVars192( ((app.SdtTDevPie1_Level2Item)bcTDevPie1.getgxTv_SdtTDevPie1_Level2().elementAt(-1+nGXsfl_192_idx)), 1) ;
   }

   public void initializeNonKey1P231( )
   {
      AV13AlbRUni = "" ;
      AV9AlbRPieDis = 0 ;
      AV10AlbRUniDis = DecimalUtil.ZERO ;
      AV11AlbRPDis = 0 ;
      AV12AlbRUDis = DecimalUtil.ZERO ;
      A47AlbREst = (byte)(0) ;
      AV14KilAnt = DecimalUtil.ZERO ;
      AV15MetAnt = DecimalUtil.ZERO ;
      AV16PieAnt = (short)(0) ;
      AV17Kilos = DecimalUtil.ZERO ;
      AV18Metros = DecimalUtil.ZERO ;
      AV19Piezas = (short)(0) ;
      AV65Err_att = "" ;
      A328DevGenUni = DecimalUtil.ZERO ;
      n328DevGenUni = false ;
      A326DevGenPie = (short)(0) ;
      n326DevGenPie = false ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A54AlbRPieUti = 0 ;
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
      A410EmprTrn = "" ;
      n410EmprTrn = false ;
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
      Z328DevGenUni = DecimalUtil.ZERO ;
      Z326DevGenPie = (short)(0) ;
      Z325DevGenFec = GXutil.nullDate() ;
      Z6288DevGenDom = (byte)(0) ;
      Z410EmprTrn = "" ;
      Z324DevGenEst = (byte)(0) ;
      Z1304DevUlin = (byte)(0) ;
      Z44AlbRecCod = 0 ;
      Z327DevGenTrn = (short)(0) ;
      Z47AlbREst = (byte)(0) ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z54AlbRPieUti = 0 ;
      Z252CliCod = 0 ;
      Z45AlbRef = "" ;
      Z56AlbRUni = "" ;
      Z52AlbRPieEnt = 0 ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
   }

   public void initAll1P231( )
   {
      A323DevGenCod = 0 ;
      initializeNonKey1P231( ) ;
   }

   public void standaloneModalInsert( )
   {
      A325DevGenFec = i325DevGenFec ;
      n325DevGenFec = false ;
   }

   public void initializeNonKey1P2192( )
   {
      A1303DevObs = "" ;
      Z1303DevObs = "" ;
   }

   public void initAll1P2192( )
   {
      A1302DevLin = (byte)(0) ;
      initializeNonKey1P2192( ) ;
   }

   public void standaloneModalInsert1P2192( )
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

   public void VarsToRow31( app.SdtTDevPie1 obj31 )
   {
      obj31.setgxTv_SdtTDevPie1_Mode( Gx_mode );
      obj31.setgxTv_SdtTDevPie1_Emprcod( A396EmprCod );
      obj31.setgxTv_SdtTDevPie1_Albrest( A47AlbREst );
      obj31.setgxTv_SdtTDevPie1_Devgenuni( A328DevGenUni );
      obj31.setgxTv_SdtTDevPie1_Devgenpie( A326DevGenPie );
      obj31.setgxTv_SdtTDevPie1_Albruniuti( A60AlbRUniUti );
      obj31.setgxTv_SdtTDevPie1_Albrpieuti( A54AlbRPieUti );
      obj31.setgxTv_SdtTDevPie1_Albrpiedis( A51AlbRPieDis );
      obj31.setgxTv_SdtTDevPie1_Albrunidis( A57AlbRUniDis );
      obj31.setgxTv_SdtTDevPie1_Emprnom( A407EmprNom );
      obj31.setgxTv_SdtTDevPie1_Albreccod( A44AlbRecCod );
      obj31.setgxTv_SdtTDevPie1_Devgendom( A6288DevGenDom );
      obj31.setgxTv_SdtTDevPie1_Clicod( A252CliCod );
      obj31.setgxTv_SdtTDevPie1_Clinom( A279CliNom );
      obj31.setgxTv_SdtTDevPie1_Albref( A45AlbRef );
      obj31.setgxTv_SdtTDevPie1_Emprtrn( A410EmprTrn );
      obj31.setgxTv_SdtTDevPie1_Devgentrn( A327DevGenTrn );
      obj31.setgxTv_SdtTDevPie1_Devtrnnom( A329DevTrnNom );
      obj31.setgxTv_SdtTDevPie1_Albruni( A56AlbRUni );
      obj31.setgxTv_SdtTDevPie1_Albrpieent( A52AlbRPieEnt );
      obj31.setgxTv_SdtTDevPie1_Albrunient( A58AlbRUniEnt );
      obj31.setgxTv_SdtTDevPie1_Devgenest( A324DevGenEst );
      obj31.setgxTv_SdtTDevPie1_Albdevpuni( A3066AlbDevPUni );
      obj31.setgxTv_SdtTDevPie1_Albdevppie( A5278AlbDevPPie );
      obj31.setgxTv_SdtTDevPie1_Devulin( A1304DevUlin );
      obj31.setgxTv_SdtTDevPie1_Devgenfec( A325DevGenFec );
      obj31.setgxTv_SdtTDevPie1_Emprcod( A396EmprCod );
      obj31.setgxTv_SdtTDevPie1_Devgencod( A323DevGenCod );
      obj31.setgxTv_SdtTDevPie1_Emprcod_Z( Z396EmprCod );
      obj31.setgxTv_SdtTDevPie1_Emprnom_Z( Z407EmprNom );
      obj31.setgxTv_SdtTDevPie1_Devgencod_Z( Z323DevGenCod );
      obj31.setgxTv_SdtTDevPie1_Devgenfec_Z( Z325DevGenFec );
      obj31.setgxTv_SdtTDevPie1_Albreccod_Z( Z44AlbRecCod );
      obj31.setgxTv_SdtTDevPie1_Devgendom_Z( Z6288DevGenDom );
      obj31.setgxTv_SdtTDevPie1_Clicod_Z( Z252CliCod );
      obj31.setgxTv_SdtTDevPie1_Clinom_Z( Z279CliNom );
      obj31.setgxTv_SdtTDevPie1_Albref_Z( Z45AlbRef );
      obj31.setgxTv_SdtTDevPie1_Emprtrn_Z( Z410EmprTrn );
      obj31.setgxTv_SdtTDevPie1_Devgentrn_Z( Z327DevGenTrn );
      obj31.setgxTv_SdtTDevPie1_Devtrnnom_Z( Z329DevTrnNom );
      obj31.setgxTv_SdtTDevPie1_Albrunidis_Z( Z57AlbRUniDis );
      obj31.setgxTv_SdtTDevPie1_Albrpiedis_Z( Z51AlbRPieDis );
      obj31.setgxTv_SdtTDevPie1_Albruni_Z( Z56AlbRUni );
      obj31.setgxTv_SdtTDevPie1_Devgenuni_Z( Z328DevGenUni );
      obj31.setgxTv_SdtTDevPie1_Devgenpie_Z( Z326DevGenPie );
      obj31.setgxTv_SdtTDevPie1_Albruniuti_Z( Z60AlbRUniUti );
      obj31.setgxTv_SdtTDevPie1_Albrpieuti_Z( Z54AlbRPieUti );
      obj31.setgxTv_SdtTDevPie1_Albrpieent_Z( Z52AlbRPieEnt );
      obj31.setgxTv_SdtTDevPie1_Albrunient_Z( Z58AlbRUniEnt );
      obj31.setgxTv_SdtTDevPie1_Albrest_Z( Z47AlbREst );
      obj31.setgxTv_SdtTDevPie1_Devgenest_Z( Z324DevGenEst );
      obj31.setgxTv_SdtTDevPie1_Albdevpuni_Z( Z3066AlbDevPUni );
      obj31.setgxTv_SdtTDevPie1_Albdevppie_Z( Z5278AlbDevPPie );
      obj31.setgxTv_SdtTDevPie1_Devulin_Z( Z1304DevUlin );
      obj31.setgxTv_SdtTDevPie1_Emprnom_N( (byte)((byte)((n407EmprNom)?1:0)) );
      obj31.setgxTv_SdtTDevPie1_Devgenfec_N( (byte)((byte)((n325DevGenFec)?1:0)) );
      obj31.setgxTv_SdtTDevPie1_Albreccod_N( (byte)((byte)((n44AlbRecCod)?1:0)) );
      obj31.setgxTv_SdtTDevPie1_Devgendom_N( (byte)((byte)((n6288DevGenDom)?1:0)) );
      obj31.setgxTv_SdtTDevPie1_Clicod_N( (byte)((byte)((n252CliCod)?1:0)) );
      obj31.setgxTv_SdtTDevPie1_Emprtrn_N( (byte)((byte)((n410EmprTrn)?1:0)) );
      obj31.setgxTv_SdtTDevPie1_Devgentrn_N( (byte)((byte)((n327DevGenTrn)?1:0)) );
      obj31.setgxTv_SdtTDevPie1_Devtrnnom_N( (byte)((byte)((n329DevTrnNom)?1:0)) );
      obj31.setgxTv_SdtTDevPie1_Devgenuni_N( (byte)((byte)((n328DevGenUni)?1:0)) );
      obj31.setgxTv_SdtTDevPie1_Devgenpie_N( (byte)((byte)((n326DevGenPie)?1:0)) );
      obj31.setgxTv_SdtTDevPie1_Devgenest_N( (byte)((byte)((n324DevGenEst)?1:0)) );
      obj31.setgxTv_SdtTDevPie1_Devulin_N( (byte)((byte)((n1304DevUlin)?1:0)) );
      obj31.setgxTv_SdtTDevPie1_Mode( Gx_mode );
   }

   public void KeyVarsToRow31( app.SdtTDevPie1 obj31 )
   {
      obj31.setgxTv_SdtTDevPie1_Emprcod( A396EmprCod );
      obj31.setgxTv_SdtTDevPie1_Devgencod( A323DevGenCod );
   }

   public void RowToVars31( app.SdtTDevPie1 obj31 ,
                            int forceLoad )
   {
      Gx_mode = obj31.getgxTv_SdtTDevPie1_Mode() ;
      A396EmprCod = obj31.getgxTv_SdtTDevPie1_Emprcod() ;
      A47AlbREst = obj31.getgxTv_SdtTDevPie1_Albrest() ;
      A328DevGenUni = obj31.getgxTv_SdtTDevPie1_Devgenuni() ;
      n328DevGenUni = false ;
      if ( forceLoad == 1 )
      {
         A326DevGenPie = obj31.getgxTv_SdtTDevPie1_Devgenpie() ;
         n326DevGenPie = false ;
      }
      A60AlbRUniUti = obj31.getgxTv_SdtTDevPie1_Albruniuti() ;
      A54AlbRPieUti = obj31.getgxTv_SdtTDevPie1_Albrpieuti() ;
      A51AlbRPieDis = obj31.getgxTv_SdtTDevPie1_Albrpiedis() ;
      A57AlbRUniDis = obj31.getgxTv_SdtTDevPie1_Albrunidis() ;
      A407EmprNom = obj31.getgxTv_SdtTDevPie1_Emprnom() ;
      n407EmprNom = false ;
      if ( ! ( isUpd( )  ) || ( forceLoad == 1 ) )
      {
         A44AlbRecCod = obj31.getgxTv_SdtTDevPie1_Albreccod() ;
         n44AlbRecCod = false ;
      }
      A6288DevGenDom = obj31.getgxTv_SdtTDevPie1_Devgendom() ;
      n6288DevGenDom = false ;
      A252CliCod = obj31.getgxTv_SdtTDevPie1_Clicod() ;
      n252CliCod = false ;
      A279CliNom = obj31.getgxTv_SdtTDevPie1_Clinom() ;
      A45AlbRef = obj31.getgxTv_SdtTDevPie1_Albref() ;
      A410EmprTrn = obj31.getgxTv_SdtTDevPie1_Emprtrn() ;
      n410EmprTrn = false ;
      A327DevGenTrn = obj31.getgxTv_SdtTDevPie1_Devgentrn() ;
      n327DevGenTrn = false ;
      A329DevTrnNom = obj31.getgxTv_SdtTDevPie1_Devtrnnom() ;
      n329DevTrnNom = false ;
      A56AlbRUni = obj31.getgxTv_SdtTDevPie1_Albruni() ;
      A52AlbRPieEnt = obj31.getgxTv_SdtTDevPie1_Albrpieent() ;
      A58AlbRUniEnt = obj31.getgxTv_SdtTDevPie1_Albrunient() ;
      A324DevGenEst = obj31.getgxTv_SdtTDevPie1_Devgenest() ;
      n324DevGenEst = false ;
      A3066AlbDevPUni = obj31.getgxTv_SdtTDevPie1_Albdevpuni() ;
      A5278AlbDevPPie = obj31.getgxTv_SdtTDevPie1_Albdevppie() ;
      if ( forceLoad == 1 )
      {
         A1304DevUlin = obj31.getgxTv_SdtTDevPie1_Devulin() ;
         n1304DevUlin = false ;
      }
      A325DevGenFec = obj31.getgxTv_SdtTDevPie1_Devgenfec() ;
      n325DevGenFec = false ;
      A396EmprCod = obj31.getgxTv_SdtTDevPie1_Emprcod() ;
      A323DevGenCod = obj31.getgxTv_SdtTDevPie1_Devgencod() ;
      Z396EmprCod = obj31.getgxTv_SdtTDevPie1_Emprcod_Z() ;
      Z407EmprNom = obj31.getgxTv_SdtTDevPie1_Emprnom_Z() ;
      Z323DevGenCod = obj31.getgxTv_SdtTDevPie1_Devgencod_Z() ;
      Z325DevGenFec = obj31.getgxTv_SdtTDevPie1_Devgenfec_Z() ;
      Z44AlbRecCod = obj31.getgxTv_SdtTDevPie1_Albreccod_Z() ;
      Z6288DevGenDom = obj31.getgxTv_SdtTDevPie1_Devgendom_Z() ;
      Z252CliCod = obj31.getgxTv_SdtTDevPie1_Clicod_Z() ;
      Z279CliNom = obj31.getgxTv_SdtTDevPie1_Clinom_Z() ;
      Z45AlbRef = obj31.getgxTv_SdtTDevPie1_Albref_Z() ;
      Z410EmprTrn = obj31.getgxTv_SdtTDevPie1_Emprtrn_Z() ;
      Z327DevGenTrn = obj31.getgxTv_SdtTDevPie1_Devgentrn_Z() ;
      Z329DevTrnNom = obj31.getgxTv_SdtTDevPie1_Devtrnnom_Z() ;
      Z57AlbRUniDis = obj31.getgxTv_SdtTDevPie1_Albrunidis_Z() ;
      Z51AlbRPieDis = obj31.getgxTv_SdtTDevPie1_Albrpiedis_Z() ;
      Z56AlbRUni = obj31.getgxTv_SdtTDevPie1_Albruni_Z() ;
      Z328DevGenUni = obj31.getgxTv_SdtTDevPie1_Devgenuni_Z() ;
      O328DevGenUni = obj31.getgxTv_SdtTDevPie1_Devgenuni_Z() ;
      Z326DevGenPie = obj31.getgxTv_SdtTDevPie1_Devgenpie_Z() ;
      O326DevGenPie = obj31.getgxTv_SdtTDevPie1_Devgenpie_Z() ;
      Z60AlbRUniUti = obj31.getgxTv_SdtTDevPie1_Albruniuti_Z() ;
      Z54AlbRPieUti = obj31.getgxTv_SdtTDevPie1_Albrpieuti_Z() ;
      Z52AlbRPieEnt = obj31.getgxTv_SdtTDevPie1_Albrpieent_Z() ;
      Z58AlbRUniEnt = obj31.getgxTv_SdtTDevPie1_Albrunient_Z() ;
      Z47AlbREst = obj31.getgxTv_SdtTDevPie1_Albrest_Z() ;
      Z324DevGenEst = obj31.getgxTv_SdtTDevPie1_Devgenest_Z() ;
      Z3066AlbDevPUni = obj31.getgxTv_SdtTDevPie1_Albdevpuni_Z() ;
      Z5278AlbDevPPie = obj31.getgxTv_SdtTDevPie1_Albdevppie_Z() ;
      Z1304DevUlin = obj31.getgxTv_SdtTDevPie1_Devulin_Z() ;
      O1304DevUlin = obj31.getgxTv_SdtTDevPie1_Devulin_Z() ;
      n407EmprNom = (boolean)((obj31.getgxTv_SdtTDevPie1_Emprnom_N()==0)?false:true) ;
      n325DevGenFec = (boolean)((obj31.getgxTv_SdtTDevPie1_Devgenfec_N()==0)?false:true) ;
      n44AlbRecCod = (boolean)((obj31.getgxTv_SdtTDevPie1_Albreccod_N()==0)?false:true) ;
      n6288DevGenDom = (boolean)((obj31.getgxTv_SdtTDevPie1_Devgendom_N()==0)?false:true) ;
      n252CliCod = (boolean)((obj31.getgxTv_SdtTDevPie1_Clicod_N()==0)?false:true) ;
      n410EmprTrn = (boolean)((obj31.getgxTv_SdtTDevPie1_Emprtrn_N()==0)?false:true) ;
      n327DevGenTrn = (boolean)((obj31.getgxTv_SdtTDevPie1_Devgentrn_N()==0)?false:true) ;
      n329DevTrnNom = (boolean)((obj31.getgxTv_SdtTDevPie1_Devtrnnom_N()==0)?false:true) ;
      n328DevGenUni = (boolean)((obj31.getgxTv_SdtTDevPie1_Devgenuni_N()==0)?false:true) ;
      n326DevGenPie = (boolean)((obj31.getgxTv_SdtTDevPie1_Devgenpie_N()==0)?false:true) ;
      n324DevGenEst = (boolean)((obj31.getgxTv_SdtTDevPie1_Devgenest_N()==0)?false:true) ;
      n1304DevUlin = (boolean)((obj31.getgxTv_SdtTDevPie1_Devulin_N()==0)?false:true) ;
      Gx_mode = obj31.getgxTv_SdtTDevPie1_Mode() ;
   }

   public void VarsToRow192( app.SdtTDevPie1_Level2Item obj192 )
   {
      obj192.setgxTv_SdtTDevPie1_Level2Item_Mode( Gx_mode );
      obj192.setgxTv_SdtTDevPie1_Level2Item_Devobs( A1303DevObs );
      obj192.setgxTv_SdtTDevPie1_Level2Item_Devlin( A1302DevLin );
      obj192.setgxTv_SdtTDevPie1_Level2Item_Devlin_Z( Z1302DevLin );
      obj192.setgxTv_SdtTDevPie1_Level2Item_Devobs_Z( Z1303DevObs );
      obj192.setgxTv_SdtTDevPie1_Level2Item_Modified( nIsMod_192 );
   }

   public void KeyVarsToRow192( app.SdtTDevPie1_Level2Item obj192 )
   {
      obj192.setgxTv_SdtTDevPie1_Level2Item_Devlin( A1302DevLin );
   }

   public void RowToVars192( app.SdtTDevPie1_Level2Item obj192 ,
                             int forceLoad )
   {
      Gx_mode = obj192.getgxTv_SdtTDevPie1_Level2Item_Mode() ;
      A1303DevObs = obj192.getgxTv_SdtTDevPie1_Level2Item_Devobs() ;
      A1302DevLin = obj192.getgxTv_SdtTDevPie1_Level2Item_Devlin() ;
      Z1302DevLin = obj192.getgxTv_SdtTDevPie1_Level2Item_Devlin_Z() ;
      Z1303DevObs = obj192.getgxTv_SdtTDevPie1_Level2Item_Devobs_Z() ;
      nIsMod_192 = obj192.getgxTv_SdtTDevPie1_Level2Item_Modified() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A323DevGenCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1P231( ) ;
      scanKeyStart1P231( ) ;
      if ( RcdFound31 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01P246 */
         pr_default.execute(39, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(39) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01P246_A407EmprNom[0] ;
         n407EmprNom = BC01P246_n407EmprNom[0] ;
         pr_default.close(39);
         /* Using cursor BC01P248 */
         pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            A3066AlbDevPUni = BC01P248_A3066AlbDevPUni[0] ;
            A5278AlbDevPPie = BC01P248_A5278AlbDevPPie[0] ;
         }
         else
         {
            A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
            A5278AlbDevPPie = (short)(0) ;
         }
         pr_default.close(40);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         O1304DevUlin = A1304DevUlin ;
         n1304DevUlin = false ;
         O326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         O328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
      }
      zm1P231( -28) ;
      onLoadActions1P231( ) ;
      addRow1P231( ) ;
      bcTDevPie1.getgxTv_SdtTDevPie1_Level2().clearCollection();
      if ( RcdFound31 == 1 )
      {
         scanKeyStart1P2192( ) ;
         nGXsfl_192_idx = 1 ;
         while ( RcdFound192 != 0 )
         {
            Z396EmprCod = A396EmprCod ;
            Z323DevGenCod = A323DevGenCod ;
            Z1302DevLin = A1302DevLin ;
            zm1P2192( -34) ;
            onLoadActions1P2192( ) ;
            nRcdExists_192 = (short)(1) ;
            nIsMod_192 = (short)(0) ;
            addRow1P2192( ) ;
            nGXsfl_192_idx = (int)(nGXsfl_192_idx+1) ;
            scanKeyNext1P2192( ) ;
         }
         scanKeyEnd1P2192( ) ;
      }
      scanKeyEnd1P231( ) ;
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
      RowToVars31( bcTDevPie1, 0) ;
      scanKeyStart1P231( ) ;
      if ( RcdFound31 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01P249 */
         pr_default.execute(41, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(41) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01P249_A407EmprNom[0] ;
         n407EmprNom = BC01P249_n407EmprNom[0] ;
         pr_default.close(41);
         /* Using cursor BC01P251 */
         pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            A3066AlbDevPUni = BC01P251_A3066AlbDevPUni[0] ;
            A5278AlbDevPPie = BC01P251_A5278AlbDevPPie[0] ;
         }
         else
         {
            A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
            A5278AlbDevPPie = (short)(0) ;
         }
         pr_default.close(42);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         O1304DevUlin = A1304DevUlin ;
         n1304DevUlin = false ;
         O326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         O328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
      }
      zm1P231( -28) ;
      onLoadActions1P231( ) ;
      addRow1P231( ) ;
      bcTDevPie1.getgxTv_SdtTDevPie1_Level2().clearCollection();
      if ( RcdFound31 == 1 )
      {
         scanKeyStart1P2192( ) ;
         nGXsfl_192_idx = 1 ;
         while ( RcdFound192 != 0 )
         {
            Z396EmprCod = A396EmprCod ;
            Z323DevGenCod = A323DevGenCod ;
            Z1302DevLin = A1302DevLin ;
            zm1P2192( -34) ;
            onLoadActions1P2192( ) ;
            nRcdExists_192 = (short)(1) ;
            nIsMod_192 = (short)(0) ;
            addRow1P2192( ) ;
            nGXsfl_192_idx = (int)(nGXsfl_192_idx+1) ;
            scanKeyNext1P2192( ) ;
         }
         scanKeyEnd1P2192( ) ;
      }
      scanKeyEnd1P231( ) ;
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
      getKey1P231( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1304DevUlin = O1304DevUlin ;
         n1304DevUlin = false ;
         insert1P231( ) ;
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
               A1304DevUlin = O1304DevUlin ;
               n1304DevUlin = false ;
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               /* Update record */
               A1304DevUlin = O1304DevUlin ;
               n1304DevUlin = false ;
               update1P231( ) ;
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
                     A1304DevUlin = O1304DevUlin ;
                     n1304DevUlin = false ;
                     insert1P231( ) ;
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
                     A1304DevUlin = O1304DevUlin ;
                     n1304DevUlin = false ;
                     insert1P231( ) ;
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
      RowToVars31( bcTDevPie1, 1) ;
      saveImpl( ) ;
      VarsToRow31( bcTDevPie1) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars31( bcTDevPie1, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      A1304DevUlin = O1304DevUlin ;
      n1304DevUlin = false ;
      insert1P231( ) ;
      afterTrn( ) ;
      VarsToRow31( bcTDevPie1) ;
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
         app.SdtTDevPie1 auxBC = new app.SdtTDevPie1( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A323DevGenCod);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcTDevPie1);
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
      RowToVars31( bcTDevPie1, 1) ;
      updateImpl( ) ;
      VarsToRow31( bcTDevPie1) ;
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
      RowToVars31( bcTDevPie1, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1P231( ) ;
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
      VarsToRow31( bcTDevPie1) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars31( bcTDevPie1, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1P231( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdevpie1_bc");
      VarsToRow31( bcTDevPie1) ;
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
      Gx_mode = bcTDevPie1.getgxTv_SdtTDevPie1_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTDevPie1.setgxTv_SdtTDevPie1_Mode( Gx_mode );
   }

   public void SetSDT( app.SdtTDevPie1 sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTDevPie1 )
      {
         bcTDevPie1 = sdt ;
         if ( GXutil.strcmp(bcTDevPie1.getgxTv_SdtTDevPie1_Mode(), "") == 0 )
         {
            bcTDevPie1.setgxTv_SdtTDevPie1_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow31( bcTDevPie1) ;
         }
         else
         {
            RowToVars31( bcTDevPie1, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTDevPie1.getgxTv_SdtTDevPie1_Mode(), "") == 0 )
         {
            bcTDevPie1.setgxTv_SdtTDevPie1_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars31( bcTDevPie1, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtTDevPie1 getTDevPie1_BC( )
   {
      return bcTDevPie1 ;
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
      AV24Station = "" ;
      AV7EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      AV75EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV77WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV78TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV79WebSession = httpContext.getWebSession();
      AV88Pgmname = "" ;
      AV82TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV86Window = new com.genexus.webpanels.GXWindow();
      Z328DevGenUni = DecimalUtil.ZERO ;
      A328DevGenUni = DecimalUtil.ZERO ;
      Z325DevGenFec = GXutil.nullDate() ;
      A325DevGenFec = GXutil.nullDate() ;
      Z410EmprTrn = "" ;
      A410EmprTrn = "" ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      Z3066AlbDevPUni = DecimalUtil.ZERO ;
      A3066AlbDevPUni = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      A407EmprNom = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
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
      BC01P213_A407EmprNom = new String[] {""} ;
      BC01P213_n407EmprNom = new boolean[] {false} ;
      BC01P215_A323DevGenCod = new int[1] ;
      BC01P215_A47AlbREst = new byte[1] ;
      BC01P215_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P215_n328DevGenUni = new boolean[] {false} ;
      BC01P215_A326DevGenPie = new short[1] ;
      BC01P215_n326DevGenPie = new boolean[] {false} ;
      BC01P215_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P215_A54AlbRPieUti = new int[1] ;
      BC01P215_A407EmprNom = new String[] {""} ;
      BC01P215_n407EmprNom = new boolean[] {false} ;
      BC01P215_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01P215_n325DevGenFec = new boolean[] {false} ;
      BC01P215_A6288DevGenDom = new byte[1] ;
      BC01P215_n6288DevGenDom = new boolean[] {false} ;
      BC01P215_A252CliCod = new int[1] ;
      BC01P215_n252CliCod = new boolean[] {false} ;
      BC01P215_A279CliNom = new String[] {""} ;
      BC01P215_A45AlbRef = new String[] {""} ;
      BC01P215_A410EmprTrn = new String[] {""} ;
      BC01P215_n410EmprTrn = new boolean[] {false} ;
      BC01P215_A329DevTrnNom = new String[] {""} ;
      BC01P215_n329DevTrnNom = new boolean[] {false} ;
      BC01P215_A56AlbRUni = new String[] {""} ;
      BC01P215_A52AlbRPieEnt = new int[1] ;
      BC01P215_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P215_A324DevGenEst = new byte[1] ;
      BC01P215_n324DevGenEst = new boolean[] {false} ;
      BC01P215_A1304DevUlin = new byte[1] ;
      BC01P215_n1304DevUlin = new boolean[] {false} ;
      BC01P215_A396EmprCod = new String[] {""} ;
      BC01P215_A44AlbRecCod = new int[1] ;
      BC01P215_n44AlbRecCod = new boolean[] {false} ;
      BC01P215_A327DevGenTrn = new short[1] ;
      BC01P215_n327DevGenTrn = new boolean[] {false} ;
      BC01P215_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P215_A5278AlbDevPPie = new short[1] ;
      AV10AlbRUniDis = DecimalUtil.ZERO ;
      AV12AlbRUDis = DecimalUtil.ZERO ;
      AV14KilAnt = DecimalUtil.ZERO ;
      O328DevGenUni = DecimalUtil.ZERO ;
      AV15MetAnt = DecimalUtil.ZERO ;
      AV17Kilos = DecimalUtil.ZERO ;
      AV18Metros = DecimalUtil.ZERO ;
      BC01P216_A47AlbREst = new byte[1] ;
      BC01P216_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P216_A54AlbRPieUti = new int[1] ;
      BC01P216_A252CliCod = new int[1] ;
      BC01P216_n252CliCod = new boolean[] {false} ;
      BC01P216_A45AlbRef = new String[] {""} ;
      BC01P216_A56AlbRUni = new String[] {""} ;
      BC01P216_A52AlbRPieEnt = new int[1] ;
      BC01P216_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P217_A279CliNom = new String[] {""} ;
      BC01P218_A329DevTrnNom = new String[] {""} ;
      BC01P218_n329DevTrnNom = new boolean[] {false} ;
      BC01P220_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P220_A5278AlbDevPPie = new short[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV13AlbRUni = "" ;
      GXv_char4 = new String[1] ;
      GXv_int11 = new byte[1] ;
      AV65Err_att = "" ;
      GXv_char3 = new String[1] ;
      BC01P221_A396EmprCod = new String[] {""} ;
      BC01P221_A323DevGenCod = new int[1] ;
      BC01P222_A323DevGenCod = new int[1] ;
      BC01P222_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P222_n328DevGenUni = new boolean[] {false} ;
      BC01P222_A326DevGenPie = new short[1] ;
      BC01P222_n326DevGenPie = new boolean[] {false} ;
      BC01P222_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01P222_n325DevGenFec = new boolean[] {false} ;
      BC01P222_A6288DevGenDom = new byte[1] ;
      BC01P222_n6288DevGenDom = new boolean[] {false} ;
      BC01P222_A410EmprTrn = new String[] {""} ;
      BC01P222_n410EmprTrn = new boolean[] {false} ;
      BC01P222_A324DevGenEst = new byte[1] ;
      BC01P222_n324DevGenEst = new boolean[] {false} ;
      BC01P222_A1304DevUlin = new byte[1] ;
      BC01P222_n1304DevUlin = new boolean[] {false} ;
      BC01P222_A396EmprCod = new String[] {""} ;
      BC01P222_A44AlbRecCod = new int[1] ;
      BC01P222_n44AlbRecCod = new boolean[] {false} ;
      BC01P222_A327DevGenTrn = new short[1] ;
      BC01P222_n327DevGenTrn = new boolean[] {false} ;
      BC01P223_A323DevGenCod = new int[1] ;
      BC01P223_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P223_n328DevGenUni = new boolean[] {false} ;
      BC01P223_A326DevGenPie = new short[1] ;
      BC01P223_n326DevGenPie = new boolean[] {false} ;
      BC01P223_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01P223_n325DevGenFec = new boolean[] {false} ;
      BC01P223_A6288DevGenDom = new byte[1] ;
      BC01P223_n6288DevGenDom = new boolean[] {false} ;
      BC01P223_A410EmprTrn = new String[] {""} ;
      BC01P223_n410EmprTrn = new boolean[] {false} ;
      BC01P223_A324DevGenEst = new byte[1] ;
      BC01P223_n324DevGenEst = new boolean[] {false} ;
      BC01P223_A1304DevUlin = new byte[1] ;
      BC01P223_n1304DevUlin = new boolean[] {false} ;
      BC01P223_A396EmprCod = new String[] {""} ;
      BC01P223_A44AlbRecCod = new int[1] ;
      BC01P223_n44AlbRecCod = new boolean[] {false} ;
      BC01P223_A327DevGenTrn = new short[1] ;
      BC01P223_n327DevGenTrn = new boolean[] {false} ;
      BC01P224_A47AlbREst = new byte[1] ;
      BC01P224_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P224_A54AlbRPieUti = new int[1] ;
      BC01P224_A252CliCod = new int[1] ;
      BC01P224_n252CliCod = new boolean[] {false} ;
      BC01P224_A45AlbRef = new String[] {""} ;
      BC01P224_A56AlbRUni = new String[] {""} ;
      BC01P224_A52AlbRPieEnt = new int[1] ;
      BC01P224_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P229_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P229_A5278AlbDevPPie = new short[1] ;
      BC01P230_A47AlbREst = new byte[1] ;
      BC01P230_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P230_A54AlbRPieUti = new int[1] ;
      BC01P230_A252CliCod = new int[1] ;
      BC01P230_n252CliCod = new boolean[] {false} ;
      BC01P230_A45AlbRef = new String[] {""} ;
      BC01P230_A56AlbRUni = new String[] {""} ;
      BC01P230_A52AlbRPieEnt = new int[1] ;
      BC01P230_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P231_A279CliNom = new String[] {""} ;
      BC01P232_A329DevTrnNom = new String[] {""} ;
      BC01P232_n329DevTrnNom = new boolean[] {false} ;
      BC01P233_A396EmprCod = new String[] {""} ;
      BC01P233_A323DevGenCod = new int[1] ;
      BC01P233_A2159AlbRecPie = new String[] {""} ;
      BC01P237_A323DevGenCod = new int[1] ;
      BC01P237_A47AlbREst = new byte[1] ;
      BC01P237_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P237_n328DevGenUni = new boolean[] {false} ;
      BC01P237_A326DevGenPie = new short[1] ;
      BC01P237_n326DevGenPie = new boolean[] {false} ;
      BC01P237_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P237_A54AlbRPieUti = new int[1] ;
      BC01P237_A407EmprNom = new String[] {""} ;
      BC01P237_n407EmprNom = new boolean[] {false} ;
      BC01P237_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01P237_n325DevGenFec = new boolean[] {false} ;
      BC01P237_A6288DevGenDom = new byte[1] ;
      BC01P237_n6288DevGenDom = new boolean[] {false} ;
      BC01P237_A252CliCod = new int[1] ;
      BC01P237_n252CliCod = new boolean[] {false} ;
      BC01P237_A279CliNom = new String[] {""} ;
      BC01P237_A45AlbRef = new String[] {""} ;
      BC01P237_A410EmprTrn = new String[] {""} ;
      BC01P237_n410EmprTrn = new boolean[] {false} ;
      BC01P237_A329DevTrnNom = new String[] {""} ;
      BC01P237_n329DevTrnNom = new boolean[] {false} ;
      BC01P237_A56AlbRUni = new String[] {""} ;
      BC01P237_A52AlbRPieEnt = new int[1] ;
      BC01P237_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P237_A324DevGenEst = new byte[1] ;
      BC01P237_n324DevGenEst = new boolean[] {false} ;
      BC01P237_A1304DevUlin = new byte[1] ;
      BC01P237_n1304DevUlin = new boolean[] {false} ;
      BC01P237_A396EmprCod = new String[] {""} ;
      BC01P237_A44AlbRecCod = new int[1] ;
      BC01P237_n44AlbRecCod = new boolean[] {false} ;
      BC01P237_A327DevGenTrn = new short[1] ;
      BC01P237_n327DevGenTrn = new boolean[] {false} ;
      BC01P237_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P237_A5278AlbDevPPie = new short[1] ;
      GXv_int9 = new int[1] ;
      Z1303DevObs = "" ;
      A1303DevObs = "" ;
      BC01P238_A323DevGenCod = new int[1] ;
      BC01P238_A1302DevLin = new byte[1] ;
      BC01P238_A1303DevObs = new String[] {""} ;
      BC01P238_A396EmprCod = new String[] {""} ;
      BC01P239_A396EmprCod = new String[] {""} ;
      BC01P239_A323DevGenCod = new int[1] ;
      BC01P239_A1302DevLin = new byte[1] ;
      BC01P240_A323DevGenCod = new int[1] ;
      BC01P240_A1302DevLin = new byte[1] ;
      BC01P240_A1303DevObs = new String[] {""} ;
      BC01P240_A396EmprCod = new String[] {""} ;
      sMode192 = "" ;
      BC01P241_A323DevGenCod = new int[1] ;
      BC01P241_A1302DevLin = new byte[1] ;
      BC01P241_A1303DevObs = new String[] {""} ;
      BC01P241_A396EmprCod = new String[] {""} ;
      BC01P245_A323DevGenCod = new int[1] ;
      BC01P245_A1302DevLin = new byte[1] ;
      BC01P245_A1303DevObs = new String[] {""} ;
      BC01P245_A396EmprCod = new String[] {""} ;
      i325DevGenFec = GXutil.nullDate() ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC01P246_A407EmprNom = new String[] {""} ;
      BC01P246_n407EmprNom = new boolean[] {false} ;
      BC01P248_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P248_A5278AlbDevPPie = new short[1] ;
      BC01P249_A407EmprNom = new String[] {""} ;
      BC01P249_n407EmprNom = new boolean[] {false} ;
      BC01P251_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P251_A5278AlbDevPPie = new short[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdevpie1_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdevpie1_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdevpie1_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdevpie1_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevpie1_bc__default(),
         new Object[] {
             new Object[] {
            BC01P22_A323DevGenCod, BC01P22_A1302DevLin, BC01P22_A1303DevObs, BC01P22_A396EmprCod
            }
            , new Object[] {
            BC01P23_A323DevGenCod, BC01P23_A1302DevLin, BC01P23_A1303DevObs, BC01P23_A396EmprCod
            }
            , new Object[] {
            BC01P24_A323DevGenCod, BC01P24_A328DevGenUni, BC01P24_n328DevGenUni, BC01P24_A326DevGenPie, BC01P24_n326DevGenPie, BC01P24_A325DevGenFec, BC01P24_n325DevGenFec, BC01P24_A6288DevGenDom, BC01P24_n6288DevGenDom, BC01P24_A410EmprTrn,
            BC01P24_n410EmprTrn, BC01P24_A324DevGenEst, BC01P24_n324DevGenEst, BC01P24_A1304DevUlin, BC01P24_n1304DevUlin, BC01P24_A396EmprCod, BC01P24_A44AlbRecCod, BC01P24_n44AlbRecCod, BC01P24_A327DevGenTrn, BC01P24_n327DevGenTrn,
            BC01P24_A252CliCod, BC01P24_n252CliCod
            }
            , new Object[] {
            BC01P25_A323DevGenCod, BC01P25_A328DevGenUni, BC01P25_n328DevGenUni, BC01P25_A326DevGenPie, BC01P25_n326DevGenPie, BC01P25_A325DevGenFec, BC01P25_n325DevGenFec, BC01P25_A6288DevGenDom, BC01P25_n6288DevGenDom, BC01P25_A410EmprTrn,
            BC01P25_n410EmprTrn, BC01P25_A324DevGenEst, BC01P25_n324DevGenEst, BC01P25_A1304DevUlin, BC01P25_n1304DevUlin, BC01P25_A396EmprCod, BC01P25_A44AlbRecCod, BC01P25_n44AlbRecCod, BC01P25_A327DevGenTrn, BC01P25_n327DevGenTrn,
            BC01P25_A252CliCod, BC01P25_n252CliCod
            }
            , new Object[] {
            BC01P26_A407EmprNom, BC01P26_n407EmprNom
            }
            , new Object[] {
            BC01P27_A47AlbREst, BC01P27_A60AlbRUniUti, BC01P27_A54AlbRPieUti, BC01P27_A252CliCod, BC01P27_A45AlbRef, BC01P27_A56AlbRUni, BC01P27_A52AlbRPieEnt, BC01P27_A58AlbRUniEnt
            }
            , new Object[] {
            BC01P28_A47AlbREst, BC01P28_A60AlbRUniUti, BC01P28_A54AlbRPieUti, BC01P28_A252CliCod, BC01P28_A45AlbRef, BC01P28_A56AlbRUni, BC01P28_A52AlbRPieEnt, BC01P28_A58AlbRUniEnt
            }
            , new Object[] {
            BC01P29_A279CliNom
            }
            , new Object[] {
            BC01P210_A329DevTrnNom, BC01P210_n329DevTrnNom
            }
            , new Object[] {
            BC01P212_A3066AlbDevPUni, BC01P212_A5278AlbDevPPie
            }
            , new Object[] {
            BC01P213_A407EmprNom, BC01P213_n407EmprNom
            }
            , new Object[] {
            BC01P215_A323DevGenCod, BC01P215_A47AlbREst, BC01P215_A328DevGenUni, BC01P215_n328DevGenUni, BC01P215_A326DevGenPie, BC01P215_n326DevGenPie, BC01P215_A60AlbRUniUti, BC01P215_A54AlbRPieUti, BC01P215_A407EmprNom, BC01P215_n407EmprNom,
            BC01P215_A325DevGenFec, BC01P215_n325DevGenFec, BC01P215_A6288DevGenDom, BC01P215_n6288DevGenDom, BC01P215_A252CliCod, BC01P215_n252CliCod, BC01P215_A279CliNom, BC01P215_A45AlbRef, BC01P215_A410EmprTrn, BC01P215_n410EmprTrn,
            BC01P215_A329DevTrnNom, BC01P215_n329DevTrnNom, BC01P215_A56AlbRUni, BC01P215_A52AlbRPieEnt, BC01P215_A58AlbRUniEnt, BC01P215_A324DevGenEst, BC01P215_n324DevGenEst, BC01P215_A1304DevUlin, BC01P215_n1304DevUlin, BC01P215_A396EmprCod,
            BC01P215_A44AlbRecCod, BC01P215_n44AlbRecCod, BC01P215_A327DevGenTrn, BC01P215_n327DevGenTrn, BC01P215_A3066AlbDevPUni, BC01P215_A5278AlbDevPPie
            }
            , new Object[] {
            BC01P216_A47AlbREst, BC01P216_A60AlbRUniUti, BC01P216_A54AlbRPieUti, BC01P216_A252CliCod, BC01P216_A45AlbRef, BC01P216_A56AlbRUni, BC01P216_A52AlbRPieEnt, BC01P216_A58AlbRUniEnt
            }
            , new Object[] {
            BC01P217_A279CliNom
            }
            , new Object[] {
            BC01P218_A329DevTrnNom, BC01P218_n329DevTrnNom
            }
            , new Object[] {
            BC01P220_A3066AlbDevPUni, BC01P220_A5278AlbDevPPie
            }
            , new Object[] {
            BC01P221_A396EmprCod, BC01P221_A323DevGenCod
            }
            , new Object[] {
            BC01P222_A323DevGenCod, BC01P222_A328DevGenUni, BC01P222_n328DevGenUni, BC01P222_A326DevGenPie, BC01P222_n326DevGenPie, BC01P222_A325DevGenFec, BC01P222_n325DevGenFec, BC01P222_A6288DevGenDom, BC01P222_n6288DevGenDom, BC01P222_A410EmprTrn,
            BC01P222_n410EmprTrn, BC01P222_A324DevGenEst, BC01P222_n324DevGenEst, BC01P222_A1304DevUlin, BC01P222_n1304DevUlin, BC01P222_A396EmprCod, BC01P222_A44AlbRecCod, BC01P222_n44AlbRecCod, BC01P222_A327DevGenTrn, BC01P222_n327DevGenTrn
            }
            , new Object[] {
            BC01P223_A323DevGenCod, BC01P223_A328DevGenUni, BC01P223_n328DevGenUni, BC01P223_A326DevGenPie, BC01P223_n326DevGenPie, BC01P223_A325DevGenFec, BC01P223_n325DevGenFec, BC01P223_A6288DevGenDom, BC01P223_n6288DevGenDom, BC01P223_A410EmprTrn,
            BC01P223_n410EmprTrn, BC01P223_A324DevGenEst, BC01P223_n324DevGenEst, BC01P223_A1304DevUlin, BC01P223_n1304DevUlin, BC01P223_A396EmprCod, BC01P223_A44AlbRecCod, BC01P223_n44AlbRecCod, BC01P223_A327DevGenTrn, BC01P223_n327DevGenTrn
            }
            , new Object[] {
            BC01P224_A47AlbREst, BC01P224_A60AlbRUniUti, BC01P224_A54AlbRPieUti, BC01P224_A252CliCod, BC01P224_A45AlbRef, BC01P224_A56AlbRUni, BC01P224_A52AlbRPieEnt, BC01P224_A58AlbRUniEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01P229_A3066AlbDevPUni, BC01P229_A5278AlbDevPPie
            }
            , new Object[] {
            BC01P230_A47AlbREst, BC01P230_A60AlbRUniUti, BC01P230_A54AlbRPieUti, BC01P230_A252CliCod, BC01P230_A45AlbRef, BC01P230_A56AlbRUni, BC01P230_A52AlbRPieEnt, BC01P230_A58AlbRUniEnt
            }
            , new Object[] {
            BC01P231_A279CliNom
            }
            , new Object[] {
            BC01P232_A329DevTrnNom, BC01P232_n329DevTrnNom
            }
            , new Object[] {
            BC01P233_A396EmprCod, BC01P233_A323DevGenCod, BC01P233_A2159AlbRecPie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01P237_A323DevGenCod, BC01P237_A47AlbREst, BC01P237_A328DevGenUni, BC01P237_n328DevGenUni, BC01P237_A326DevGenPie, BC01P237_n326DevGenPie, BC01P237_A60AlbRUniUti, BC01P237_A54AlbRPieUti, BC01P237_A407EmprNom, BC01P237_n407EmprNom,
            BC01P237_A325DevGenFec, BC01P237_n325DevGenFec, BC01P237_A6288DevGenDom, BC01P237_n6288DevGenDom, BC01P237_A252CliCod, BC01P237_n252CliCod, BC01P237_A279CliNom, BC01P237_A45AlbRef, BC01P237_A410EmprTrn, BC01P237_n410EmprTrn,
            BC01P237_A329DevTrnNom, BC01P237_n329DevTrnNom, BC01P237_A56AlbRUni, BC01P237_A52AlbRPieEnt, BC01P237_A58AlbRUniEnt, BC01P237_A324DevGenEst, BC01P237_n324DevGenEst, BC01P237_A1304DevUlin, BC01P237_n1304DevUlin, BC01P237_A396EmprCod,
            BC01P237_A44AlbRecCod, BC01P237_n44AlbRecCod, BC01P237_A327DevGenTrn, BC01P237_n327DevGenTrn, BC01P237_A3066AlbDevPUni, BC01P237_A5278AlbDevPPie
            }
            , new Object[] {
            BC01P238_A323DevGenCod, BC01P238_A1302DevLin, BC01P238_A1303DevObs, BC01P238_A396EmprCod
            }
            , new Object[] {
            BC01P239_A396EmprCod, BC01P239_A323DevGenCod, BC01P239_A1302DevLin
            }
            , new Object[] {
            BC01P240_A323DevGenCod, BC01P240_A1302DevLin, BC01P240_A1303DevObs, BC01P240_A396EmprCod
            }
            , new Object[] {
            BC01P241_A323DevGenCod, BC01P241_A1302DevLin, BC01P241_A1303DevObs, BC01P241_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01P245_A323DevGenCod, BC01P245_A1302DevLin, BC01P245_A1303DevObs, BC01P245_A396EmprCod
            }
            , new Object[] {
            BC01P246_A407EmprNom, BC01P246_n407EmprNom
            }
            , new Object[] {
            BC01P248_A3066AlbDevPUni, BC01P248_A5278AlbDevPPie
            }
            , new Object[] {
            BC01P249_A407EmprNom, BC01P249_n407EmprNom
            }
            , new Object[] {
            BC01P251_A3066AlbDevPUni, BC01P251_A5278AlbDevPPie
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV88Pgmname = "TDevPie1_BC" ;
      Z325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      A325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      i325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e121P22 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte s1304DevUlin ;
   private byte O1304DevUlin ;
   private byte A1304DevUlin ;
   private byte Z6288DevGenDom ;
   private byte A6288DevGenDom ;
   private byte Z324DevGenEst ;
   private byte A324DevGenEst ;
   private byte Z1304DevUlin ;
   private byte Z47AlbREst ;
   private byte A47AlbREst ;
   private byte Gx_BScreen ;
   private byte GXv_int11[] ;
   private byte Gxremove192 ;
   private byte Z1302DevLin ;
   private byte A1302DevLin ;
   private byte i1304DevUlin ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nIsMod_192 ;
   private short RcdFound192 ;
   private short AV81Insert_DevGenTrn ;
   private short Z326DevGenPie ;
   private short A326DevGenPie ;
   private short Z327DevGenTrn ;
   private short A327DevGenTrn ;
   private short Z5278AlbDevPPie ;
   private short A5278AlbDevPPie ;
   private short AV16PieAnt ;
   private short O326DevGenPie ;
   private short AV19Piezas ;
   private short RcdFound31 ;
   private short nIsDirty_31 ;
   private short nRcdExists_192 ;
   private short nIsDirty_192 ;
   private int trnEnded ;
   private int Z323DevGenCod ;
   private int A323DevGenCod ;
   private int nGXsfl_192_idx=1 ;
   private int AV89GXV1 ;
   private int AV80Insert_AlbRecCod ;
   private int A44AlbRecCod ;
   private int GX_JID ;
   private int Z44AlbRecCod ;
   private int Z51AlbRPieDis ;
   private int A51AlbRPieDis ;
   private int Z54AlbRPieUti ;
   private int A54AlbRPieUti ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int Z52AlbRPieEnt ;
   private int A52AlbRPieEnt ;
   private int AV9AlbRPieDis ;
   private int AV11AlbRPDis ;
   private int GXv_int6[] ;
   private int GXv_int7[] ;
   private int GXv_int9[] ;
   private java.math.BigDecimal Z328DevGenUni ;
   private java.math.BigDecimal A328DevGenUni ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal Z3066AlbDevPUni ;
   private java.math.BigDecimal A3066AlbDevPUni ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal AV10AlbRUniDis ;
   private java.math.BigDecimal AV12AlbRUDis ;
   private java.math.BigDecimal AV14KilAnt ;
   private java.math.BigDecimal O328DevGenUni ;
   private java.math.BigDecimal AV15MetAnt ;
   private java.math.BigDecimal AV17Kilos ;
   private java.math.BigDecimal AV18Metros ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
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
   private String AV7EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String AV75EmprCod ;
   private String GXv_char2[] ;
   private String AV88Pgmname ;
   private String Z410EmprTrn ;
   private String A410EmprTrn ;
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
   private String AV13AlbRUni ;
   private String GXv_char4[] ;
   private String AV65Err_att ;
   private String GXv_char3[] ;
   private String Z1303DevObs ;
   private String A1303DevObs ;
   private String sMode192 ;
   private java.util.Date Z325DevGenFec ;
   private java.util.Date A325DevGenFec ;
   private java.util.Date i325DevGenFec ;
   private boolean n1304DevUlin ;
   private boolean returnInSub ;
   private boolean n407EmprNom ;
   private boolean n325DevGenFec ;
   private boolean n328DevGenUni ;
   private boolean n326DevGenPie ;
   private boolean n6288DevGenDom ;
   private boolean n252CliCod ;
   private boolean n410EmprTrn ;
   private boolean n329DevTrnNom ;
   private boolean n324DevGenEst ;
   private boolean n44AlbRecCod ;
   private boolean n327DevGenTrn ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private com.genexus.webpanels.GXWindow AV86Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV79WebSession ;
   private app.SdtTDevPie1 bcTDevPie1 ;
   private IDataStoreProvider pr_default ;
   private String[] BC01P213_A407EmprNom ;
   private boolean[] BC01P213_n407EmprNom ;
   private int[] BC01P215_A323DevGenCod ;
   private byte[] BC01P215_A47AlbREst ;
   private java.math.BigDecimal[] BC01P215_A328DevGenUni ;
   private boolean[] BC01P215_n328DevGenUni ;
   private short[] BC01P215_A326DevGenPie ;
   private boolean[] BC01P215_n326DevGenPie ;
   private java.math.BigDecimal[] BC01P215_A60AlbRUniUti ;
   private int[] BC01P215_A54AlbRPieUti ;
   private String[] BC01P215_A407EmprNom ;
   private boolean[] BC01P215_n407EmprNom ;
   private java.util.Date[] BC01P215_A325DevGenFec ;
   private boolean[] BC01P215_n325DevGenFec ;
   private byte[] BC01P215_A6288DevGenDom ;
   private boolean[] BC01P215_n6288DevGenDom ;
   private int[] BC01P215_A252CliCod ;
   private boolean[] BC01P215_n252CliCod ;
   private String[] BC01P215_A279CliNom ;
   private String[] BC01P215_A45AlbRef ;
   private String[] BC01P215_A410EmprTrn ;
   private boolean[] BC01P215_n410EmprTrn ;
   private String[] BC01P215_A329DevTrnNom ;
   private boolean[] BC01P215_n329DevTrnNom ;
   private String[] BC01P215_A56AlbRUni ;
   private int[] BC01P215_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01P215_A58AlbRUniEnt ;
   private byte[] BC01P215_A324DevGenEst ;
   private boolean[] BC01P215_n324DevGenEst ;
   private byte[] BC01P215_A1304DevUlin ;
   private boolean[] BC01P215_n1304DevUlin ;
   private String[] BC01P215_A396EmprCod ;
   private int[] BC01P215_A44AlbRecCod ;
   private boolean[] BC01P215_n44AlbRecCod ;
   private short[] BC01P215_A327DevGenTrn ;
   private boolean[] BC01P215_n327DevGenTrn ;
   private java.math.BigDecimal[] BC01P215_A3066AlbDevPUni ;
   private short[] BC01P215_A5278AlbDevPPie ;
   private byte[] BC01P216_A47AlbREst ;
   private java.math.BigDecimal[] BC01P216_A60AlbRUniUti ;
   private int[] BC01P216_A54AlbRPieUti ;
   private int[] BC01P216_A252CliCod ;
   private boolean[] BC01P216_n252CliCod ;
   private String[] BC01P216_A45AlbRef ;
   private String[] BC01P216_A56AlbRUni ;
   private int[] BC01P216_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01P216_A58AlbRUniEnt ;
   private String[] BC01P217_A279CliNom ;
   private String[] BC01P218_A329DevTrnNom ;
   private boolean[] BC01P218_n329DevTrnNom ;
   private java.math.BigDecimal[] BC01P220_A3066AlbDevPUni ;
   private short[] BC01P220_A5278AlbDevPPie ;
   private String[] BC01P221_A396EmprCod ;
   private int[] BC01P221_A323DevGenCod ;
   private int[] BC01P222_A323DevGenCod ;
   private java.math.BigDecimal[] BC01P222_A328DevGenUni ;
   private boolean[] BC01P222_n328DevGenUni ;
   private short[] BC01P222_A326DevGenPie ;
   private boolean[] BC01P222_n326DevGenPie ;
   private java.util.Date[] BC01P222_A325DevGenFec ;
   private boolean[] BC01P222_n325DevGenFec ;
   private byte[] BC01P222_A6288DevGenDom ;
   private boolean[] BC01P222_n6288DevGenDom ;
   private String[] BC01P222_A410EmprTrn ;
   private boolean[] BC01P222_n410EmprTrn ;
   private byte[] BC01P222_A324DevGenEst ;
   private boolean[] BC01P222_n324DevGenEst ;
   private byte[] BC01P222_A1304DevUlin ;
   private boolean[] BC01P222_n1304DevUlin ;
   private String[] BC01P222_A396EmprCod ;
   private int[] BC01P222_A44AlbRecCod ;
   private boolean[] BC01P222_n44AlbRecCod ;
   private short[] BC01P222_A327DevGenTrn ;
   private boolean[] BC01P222_n327DevGenTrn ;
   private int[] BC01P223_A323DevGenCod ;
   private java.math.BigDecimal[] BC01P223_A328DevGenUni ;
   private boolean[] BC01P223_n328DevGenUni ;
   private short[] BC01P223_A326DevGenPie ;
   private boolean[] BC01P223_n326DevGenPie ;
   private java.util.Date[] BC01P223_A325DevGenFec ;
   private boolean[] BC01P223_n325DevGenFec ;
   private byte[] BC01P223_A6288DevGenDom ;
   private boolean[] BC01P223_n6288DevGenDom ;
   private String[] BC01P223_A410EmprTrn ;
   private boolean[] BC01P223_n410EmprTrn ;
   private byte[] BC01P223_A324DevGenEst ;
   private boolean[] BC01P223_n324DevGenEst ;
   private byte[] BC01P223_A1304DevUlin ;
   private boolean[] BC01P223_n1304DevUlin ;
   private String[] BC01P223_A396EmprCod ;
   private int[] BC01P223_A44AlbRecCod ;
   private boolean[] BC01P223_n44AlbRecCod ;
   private short[] BC01P223_A327DevGenTrn ;
   private boolean[] BC01P223_n327DevGenTrn ;
   private byte[] BC01P224_A47AlbREst ;
   private java.math.BigDecimal[] BC01P224_A60AlbRUniUti ;
   private int[] BC01P224_A54AlbRPieUti ;
   private int[] BC01P224_A252CliCod ;
   private boolean[] BC01P224_n252CliCod ;
   private String[] BC01P224_A45AlbRef ;
   private String[] BC01P224_A56AlbRUni ;
   private int[] BC01P224_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01P224_A58AlbRUniEnt ;
   private java.math.BigDecimal[] BC01P229_A3066AlbDevPUni ;
   private short[] BC01P229_A5278AlbDevPPie ;
   private byte[] BC01P230_A47AlbREst ;
   private java.math.BigDecimal[] BC01P230_A60AlbRUniUti ;
   private int[] BC01P230_A54AlbRPieUti ;
   private int[] BC01P230_A252CliCod ;
   private boolean[] BC01P230_n252CliCod ;
   private String[] BC01P230_A45AlbRef ;
   private String[] BC01P230_A56AlbRUni ;
   private int[] BC01P230_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01P230_A58AlbRUniEnt ;
   private String[] BC01P231_A279CliNom ;
   private String[] BC01P232_A329DevTrnNom ;
   private boolean[] BC01P232_n329DevTrnNom ;
   private String[] BC01P233_A396EmprCod ;
   private int[] BC01P233_A323DevGenCod ;
   private String[] BC01P233_A2159AlbRecPie ;
   private int[] BC01P237_A323DevGenCod ;
   private byte[] BC01P237_A47AlbREst ;
   private java.math.BigDecimal[] BC01P237_A328DevGenUni ;
   private boolean[] BC01P237_n328DevGenUni ;
   private short[] BC01P237_A326DevGenPie ;
   private boolean[] BC01P237_n326DevGenPie ;
   private java.math.BigDecimal[] BC01P237_A60AlbRUniUti ;
   private int[] BC01P237_A54AlbRPieUti ;
   private String[] BC01P237_A407EmprNom ;
   private boolean[] BC01P237_n407EmprNom ;
   private java.util.Date[] BC01P237_A325DevGenFec ;
   private boolean[] BC01P237_n325DevGenFec ;
   private byte[] BC01P237_A6288DevGenDom ;
   private boolean[] BC01P237_n6288DevGenDom ;
   private int[] BC01P237_A252CliCod ;
   private boolean[] BC01P237_n252CliCod ;
   private String[] BC01P237_A279CliNom ;
   private String[] BC01P237_A45AlbRef ;
   private String[] BC01P237_A410EmprTrn ;
   private boolean[] BC01P237_n410EmprTrn ;
   private String[] BC01P237_A329DevTrnNom ;
   private boolean[] BC01P237_n329DevTrnNom ;
   private String[] BC01P237_A56AlbRUni ;
   private int[] BC01P237_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01P237_A58AlbRUniEnt ;
   private byte[] BC01P237_A324DevGenEst ;
   private boolean[] BC01P237_n324DevGenEst ;
   private byte[] BC01P237_A1304DevUlin ;
   private boolean[] BC01P237_n1304DevUlin ;
   private String[] BC01P237_A396EmprCod ;
   private int[] BC01P237_A44AlbRecCod ;
   private boolean[] BC01P237_n44AlbRecCod ;
   private short[] BC01P237_A327DevGenTrn ;
   private boolean[] BC01P237_n327DevGenTrn ;
   private java.math.BigDecimal[] BC01P237_A3066AlbDevPUni ;
   private short[] BC01P237_A5278AlbDevPPie ;
   private int[] BC01P238_A323DevGenCod ;
   private byte[] BC01P238_A1302DevLin ;
   private String[] BC01P238_A1303DevObs ;
   private String[] BC01P238_A396EmprCod ;
   private String[] BC01P239_A396EmprCod ;
   private int[] BC01P239_A323DevGenCod ;
   private byte[] BC01P239_A1302DevLin ;
   private int[] BC01P240_A323DevGenCod ;
   private byte[] BC01P240_A1302DevLin ;
   private String[] BC01P240_A1303DevObs ;
   private String[] BC01P240_A396EmprCod ;
   private int[] BC01P241_A323DevGenCod ;
   private byte[] BC01P241_A1302DevLin ;
   private String[] BC01P241_A1303DevObs ;
   private String[] BC01P241_A396EmprCod ;
   private int[] BC01P245_A323DevGenCod ;
   private byte[] BC01P245_A1302DevLin ;
   private String[] BC01P245_A1303DevObs ;
   private String[] BC01P245_A396EmprCod ;
   private String[] BC01P246_A407EmprNom ;
   private boolean[] BC01P246_n407EmprNom ;
   private java.math.BigDecimal[] BC01P248_A3066AlbDevPUni ;
   private short[] BC01P248_A5278AlbDevPPie ;
   private String[] BC01P249_A407EmprNom ;
   private boolean[] BC01P249_n407EmprNom ;
   private java.math.BigDecimal[] BC01P251_A3066AlbDevPUni ;
   private short[] BC01P251_A5278AlbDevPPie ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private int[] BC01P22_A323DevGenCod ;
   private byte[] BC01P22_A1302DevLin ;
   private String[] BC01P22_A1303DevObs ;
   private String[] BC01P22_A396EmprCod ;
   private int[] BC01P23_A323DevGenCod ;
   private byte[] BC01P23_A1302DevLin ;
   private String[] BC01P23_A1303DevObs ;
   private String[] BC01P23_A396EmprCod ;
   private int[] BC01P24_A323DevGenCod ;
   private java.math.BigDecimal[] BC01P24_A328DevGenUni ;
   private short[] BC01P24_A326DevGenPie ;
   private java.util.Date[] BC01P24_A325DevGenFec ;
   private byte[] BC01P24_A6288DevGenDom ;
   private String[] BC01P24_A410EmprTrn ;
   private byte[] BC01P24_A324DevGenEst ;
   private byte[] BC01P24_A1304DevUlin ;
   private String[] BC01P24_A396EmprCod ;
   private int[] BC01P24_A44AlbRecCod ;
   private short[] BC01P24_A327DevGenTrn ;
   private int[] BC01P24_A252CliCod ;
   private int[] BC01P25_A323DevGenCod ;
   private java.math.BigDecimal[] BC01P25_A328DevGenUni ;
   private short[] BC01P25_A326DevGenPie ;
   private java.util.Date[] BC01P25_A325DevGenFec ;
   private byte[] BC01P25_A6288DevGenDom ;
   private String[] BC01P25_A410EmprTrn ;
   private byte[] BC01P25_A324DevGenEst ;
   private byte[] BC01P25_A1304DevUlin ;
   private String[] BC01P25_A396EmprCod ;
   private int[] BC01P25_A44AlbRecCod ;
   private short[] BC01P25_A327DevGenTrn ;
   private int[] BC01P25_A252CliCod ;
   private String[] BC01P26_A407EmprNom ;
   private byte[] BC01P27_A47AlbREst ;
   private java.math.BigDecimal[] BC01P27_A60AlbRUniUti ;
   private int[] BC01P27_A54AlbRPieUti ;
   private int[] BC01P27_A252CliCod ;
   private String[] BC01P27_A45AlbRef ;
   private String[] BC01P27_A56AlbRUni ;
   private int[] BC01P27_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01P27_A58AlbRUniEnt ;
   private byte[] BC01P28_A47AlbREst ;
   private java.math.BigDecimal[] BC01P28_A60AlbRUniUti ;
   private int[] BC01P28_A54AlbRPieUti ;
   private int[] BC01P28_A252CliCod ;
   private String[] BC01P28_A45AlbRef ;
   private String[] BC01P28_A56AlbRUni ;
   private int[] BC01P28_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01P28_A58AlbRUniEnt ;
   private String[] BC01P29_A279CliNom ;
   private String[] BC01P210_A329DevTrnNom ;
   private java.math.BigDecimal[] BC01P212_A3066AlbDevPUni ;
   private short[] BC01P212_A5278AlbDevPPie ;
   private boolean[] BC01P24_n328DevGenUni ;
   private boolean[] BC01P24_n326DevGenPie ;
   private boolean[] BC01P24_n325DevGenFec ;
   private boolean[] BC01P24_n6288DevGenDom ;
   private boolean[] BC01P24_n410EmprTrn ;
   private boolean[] BC01P24_n324DevGenEst ;
   private boolean[] BC01P24_n1304DevUlin ;
   private boolean[] BC01P24_n44AlbRecCod ;
   private boolean[] BC01P24_n327DevGenTrn ;
   private boolean[] BC01P24_n252CliCod ;
   private boolean[] BC01P25_n328DevGenUni ;
   private boolean[] BC01P25_n326DevGenPie ;
   private boolean[] BC01P25_n325DevGenFec ;
   private boolean[] BC01P25_n6288DevGenDom ;
   private boolean[] BC01P25_n410EmprTrn ;
   private boolean[] BC01P25_n324DevGenEst ;
   private boolean[] BC01P25_n1304DevUlin ;
   private boolean[] BC01P25_n44AlbRecCod ;
   private boolean[] BC01P25_n327DevGenTrn ;
   private boolean[] BC01P25_n252CliCod ;
   private boolean[] BC01P26_n407EmprNom ;
   private boolean[] BC01P210_n329DevTrnNom ;
   private app.wwpbaseobjects.SdtWWPContext AV77WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV78TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV82TrnContextAtt ;
}

final  class tdevpie1_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpie1_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpie1_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpie1_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpie1_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01P22", "SELECT DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ?  FOR UPDATE OF DevObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P23", "SELECT DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P24", "SELECT DevGenCod, DevGenUni, DevGenPie, DevGenFec, DevGenDom, EmprTrn, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, CliCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ?  FOR UPDATE OF DevGenUni, DevGenPie, DevGenFec, DevGenDom, EmprTrn, DevGenEst, DevUlin, AlbRecCod, DevGenTrn, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P25", "SELECT DevGenCod, DevGenUni, DevGenPie, DevGenFec, DevGenDom, EmprTrn, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, CliCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P27", "SELECT AlbREst, AlbRUniUti, AlbRPieUti, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbREst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P28", "SELECT AlbREst, AlbRUniUti, AlbRPieUti, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P29", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P210", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P212", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P213", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P215", "SELECT /*+ FIRST_ROWS(100) */ TM1.DevGenCod, T4.AlbREst, TM1.DevGenUni, TM1.DevGenPie, T4.AlbRUniUti, T4.AlbRPieUti, T2.EmprNom, TM1.DevGenFec, TM1.DevGenDom, TM1.CliCod, T5.CliNom, T4.AlbRef, TM1.EmprTrn, T6.TrnNom AS DevTrnNom, T4.AlbRUni, T4.AlbRPieEnt, T4.AlbRUniEnt, TM1.DevGenEst, TM1.DevUlin, TM1.EmprCod, TM1.AlbRecCod, TM1.DevGenTrn AS DevGenTrn, COALESCE( T3.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T3.AlbDevPPie, 0) AS AlbDevPPie FROM (((((TXPDEVGEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.DevGenCod = TM1.DevGenCod) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = TM1.EmprCod AND T4.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = TM1.DevGenTrn) WHERE TM1.EmprCod = ? and TM1.DevGenCod = ? ORDER BY TM1.EmprCod, TM1.DevGenCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P216", "SELECT AlbREst, AlbRUniUti, AlbRPieUti, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P217", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P218", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P220", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P221", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P222", "SELECT DevGenCod, DevGenUni, DevGenPie, DevGenFec, DevGenDom, EmprTrn, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P223", "SELECT DevGenCod, DevGenUni, DevGenPie, DevGenFec, DevGenDom, EmprTrn, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ?  FOR UPDATE OF DevGenUni, DevGenPie, DevGenFec, DevGenDom, EmprTrn, DevGenEst, DevUlin, AlbRecCod, DevGenTrn, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P224", "SELECT AlbREst, AlbRUniUti, AlbRPieUti, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbREst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01P225", "INSERT INTO TXPDEVGEN(CliCod, DevGenCod, DevGenUni, DevGenPie, DevGenFec, DevGenDom, EmprTrn, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, DevMatric, DevHorSal, DevFmd, DevFmdD, DevFHh, DevGrossT, DevStt, DevDiscli, DevMdl, DevEnvAT, DevATCodeI, DevGenAT, DevAlbRecC, DevGenATCU, DevGenSerA, DevGenTipA) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ')", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("BC01P226", "UPDATE TXPDEVGEN SET CliCod=?, DevGenUni=?, DevGenPie=?, DevGenFec=?, DevGenDom=?, EmprTrn=?, DevGenEst=?, DevUlin=?, AlbRecCod=?, DevGenTrn=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("BC01P227", "DELETE FROM TXPDEVGEN  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new ForEachCursor("BC01P229", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P230", "SELECT AlbREst, AlbRUniUti, AlbRPieUti, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P231", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P232", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P233", "SELECT * FROM (SELECT EmprCod, DevGenCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("BC01P234", "UPDATE TXPDEVGEN SET DevUlin=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("BC01P235", "UPDATE TXPALBREC SET AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("BC01P237", "SELECT /*+ FIRST_ROWS(100) */ TM1.DevGenCod, T4.AlbREst, TM1.DevGenUni, TM1.DevGenPie, T4.AlbRUniUti, T4.AlbRPieUti, T2.EmprNom, TM1.DevGenFec, TM1.DevGenDom, TM1.CliCod, T5.CliNom, T4.AlbRef, TM1.EmprTrn, T6.TrnNom AS DevTrnNom, T4.AlbRUni, T4.AlbRPieEnt, T4.AlbRUniEnt, TM1.DevGenEst, TM1.DevUlin, TM1.EmprCod, TM1.AlbRecCod, TM1.DevGenTrn AS DevGenTrn, COALESCE( T3.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T3.AlbDevPPie, 0) AS AlbDevPPie FROM (((((TXPDEVGEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.DevGenCod = TM1.DevGenCod) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = TM1.EmprCod AND T4.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = TM1.DevGenTrn) WHERE TM1.EmprCod = ? and TM1.DevGenCod = ? ORDER BY TM1.EmprCod, TM1.DevGenCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P238", "SELECT /*+ FIRST_ROWS(11) */ DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? and DevGenCod = ? and DevLin = ? ORDER BY EmprCod, DevGenCod, DevLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P239", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod, DevLin FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P240", "SELECT DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P241", "SELECT DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ?  FOR UPDATE OF DevObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01P242", "INSERT INTO TXPDEVOBS(DevGenCod, DevLin, DevObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPDEVOBS")
         ,new UpdateCursor("BC01P243", "UPDATE TXPDEVOBS SET DevObs=?  WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ?", GX_NOMASK, "TXPDEVOBS")
         ,new UpdateCursor("BC01P244", "DELETE FROM TXPDEVOBS  WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ?", GX_NOMASK, "TXPDEVOBS")
         ,new ForEachCursor("BC01P245", "SELECT /*+ FIRST_ROWS(11) */ DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? and DevGenCod = ? ORDER BY EmprCod, DevGenCod, DevLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P246", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P248", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P249", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P251", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[7])[0] = rslt.getInt(6);
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
               ((String[]) buf[18])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((int[]) buf[23])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(17,2);
               ((byte[]) buf[25])[0] = rslt.getByte(18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(19);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(20, 3);
               ((int[]) buf[30])[0] = rslt.getInt(21);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(22);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(23,2);
               ((short[]) buf[35])[0] = rslt.getShort(24);
               return;
            case 12 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 19 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 23 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 24 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[7])[0] = rslt.getInt(6);
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
               ((String[]) buf[18])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((int[]) buf[23])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(17,2);
               ((byte[]) buf[25])[0] = rslt.getByte(18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(19);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(20, 3);
               ((int[]) buf[30])[0] = rslt.getInt(21);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(22);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(23,2);
               ((short[]) buf[35])[0] = rslt.getShort(24);
               return;
            case 31 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 33 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 34 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 38 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 40 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 42 :
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 6 :
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
            case 7 :
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
            case 8 :
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
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
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
            case 13 :
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
            case 14 :
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
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
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
            case 20 :
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 3);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[16]).byteValue());
               }
               stmt.setString(10, (String)parms[17], 3);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[21]).shortValue());
               }
               return;
            case 21 :
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 3);
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
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               stmt.setString(11, (String)parms[20], 3);
               stmt.setInt(12, ((Number) parms[21]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
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
            case 25 :
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
            case 26 :
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
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 29 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 35 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 60);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

