package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdevpie2_bc extends GXWebPanel implements IGxSilentTrn
{
   public tdevpie2_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdevpie2_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdevpie2_bc.class ));
   }

   public tdevpie2_bc( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1P331( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1P331( ) ;
      standaloneModal( ) ;
      addRow1P331( ) ;
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
         e111P32 ();
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

   public void confirm_1P30( )
   {
      beforeValidate1P331( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1P331( ) ;
         }
         else
         {
            checkExtendedTable1P331( ) ;
            if ( AnyError == 0 )
            {
               zm1P331( 45) ;
               zm1P331( 46) ;
               zm1P331( 47) ;
               zm1P331( 48) ;
               zm1P331( 49) ;
            }
            closeExtendedTableCursors1P331( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode31 = Gx_mode ;
         confirm_1P3451( ) ;
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

   public void confirm_1P3451( )
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
      while ( nGXsfl_451_idx < bcTDevPie2.getgxTv_SdtTDevPie2_Level1().size() )
      {
         readRow1P3451( ) ;
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
            getKey1P3451( ) ;
            if ( isIns( ) && ! isDlt( ) )
            {
               if ( RcdFound451 == 0 )
               {
                  Gx_mode = "INS" ;
                  beforeValidate1P3451( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1P3451( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1P3451( 51) ;
                     }
                     closeExtendedTableCursors1P3451( ) ;
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
                     getByPrimaryKey1P3451( ) ;
                     load1P3451( ) ;
                     beforeValidate1P3451( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1P3451( ) ;
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
                        beforeValidate1P3451( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1P3451( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1P3451( 51) ;
                           }
                           closeExtendedTableCursors1P3451( ) ;
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
            VarsToRow451( ((app.SdtTDevPie2_Level1Item)bcTDevPie2.getgxTv_SdtTDevPie2_Level1().elementAt(-1+nGXsfl_451_idx))) ;
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

   public void e121P32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tdevpie2_bc.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdevpie2_bc.this.A396EmprCod = GXv_char2[0] ;
      tdevpie2_bc.this.AV7EmprNom = GXv_char3[0] ;
      tdevpie2_bc.this.AV8UsurCod = GXv_char4[0] ;
      GXt_char1 = AV24Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tdevpie2_bc.this.GXt_char1 = GXv_char4[0] ;
      AV24Station = GXt_char1 ;
      GXv_char4[0] = AV75EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char4, GXv_char3, GXv_char2) ;
      tdevpie2_bc.this.AV75EmprCod = GXv_char4[0] ;
      tdevpie2_bc.this.AV7EmprNom = GXv_char3[0] ;
      tdevpie2_bc.this.AV8UsurCod = GXv_char2[0] ;
      GXv_SdtWWPContext5[0] = AV77WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV77WWPContext = GXv_SdtWWPContext5[0] ;
      AV78TrnContext.fromxml(AV79WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV78TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV84Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV85GXV1 = 1 ;
         while ( AV85GXV1 <= AV78TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV82TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV78TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV85GXV1));
            if ( GXutil.strcmp(AV82TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlbRecCod") == 0 )
            {
               AV80Insert_AlbRecCod = (int)(GXutil.lval( AV82TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV82TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "DevGenTrn") == 0 )
            {
               AV81Insert_DevGenTrn = (short)(GXutil.lval( AV82TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            AV85GXV1 = (int)(AV85GXV1+1) ;
         }
      }
   }

   public void e111P32( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void e131P32( )
   {
      /* 'DoVerPiezas' Routine */
      returnInSub = false ;
      if ( (GXutil.strcmp("", A2159AlbRecPie)==0) )
      {
         /* Window Datatype Object Property */
         AV83Window.setUrl( formatLink("app.webwdetpie", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A2159AlbRecPie)),GXutil.URLEncode(DecimalUtil.decToString(A2155AlbRecKgm)),GXutil.URLEncode(DecimalUtil.decToString(A2157AlbRecMtr)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"EmprCod","AlbRecCod","AlbRecPie","DisPieKil","DisPieMet","DisPieAnc"})  );
         AV83Window.setReturnParms(new Object[] {"A396EmprCod","A44AlbRecCod","A2159AlbRecPie","A2155AlbRecKgm","A2157AlbRecMtr","",});
         AV83Window.setWidth( 230 );
         AV83Window.setHeight( 200 );
         httpContext.newWindow(AV83Window);
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Debe de estar en el campo Pieza, sin valor", ""));
      }
      /*  Sending Event outputs  */
   }

   public void zm1P331( int GX_JID )
   {
      if ( ( GX_JID == 44 ) || ( GX_JID == 0 ) )
      {
         Z325DevGenFec = A325DevGenFec ;
         Z6288DevGenDom = A6288DevGenDom ;
         Z328DevGenUni = A328DevGenUni ;
         Z326DevGenPie = A326DevGenPie ;
         Z324DevGenEst = A324DevGenEst ;
         Z1304DevUlin = A1304DevUlin ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z327DevGenTrn = A327DevGenTrn ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
      if ( ( GX_JID == 45 ) || ( GX_JID == 0 ) )
      {
         Z407EmprNom = A407EmprNom ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
      if ( ( GX_JID == 46 ) || ( GX_JID == 0 ) )
      {
         Z47AlbREst = A47AlbREst ;
         Z252CliCod = A252CliCod ;
         Z45AlbRef = A45AlbRef ;
         Z56AlbRUni = A56AlbRUni ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
      if ( ( GX_JID == 47 ) || ( GX_JID == 0 ) )
      {
         Z279CliNom = A279CliNom ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
      if ( ( GX_JID == 48 ) || ( GX_JID == 0 ) )
      {
         Z329DevTrnNom = A329DevTrnNom ;
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
      if ( ( GX_JID == 49 ) || ( GX_JID == 0 ) )
      {
         Z57AlbRUniDis = A57AlbRUniDis ;
         Z51AlbRPieDis = A51AlbRPieDis ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
      if ( GX_JID == -44 )
      {
         Z323DevGenCod = A323DevGenCod ;
         Z325DevGenFec = A325DevGenFec ;
         Z6288DevGenDom = A6288DevGenDom ;
         Z252CliCod = A252CliCod ;
         Z328DevGenUni = A328DevGenUni ;
         Z326DevGenPie = A326DevGenPie ;
         Z324DevGenEst = A324DevGenEst ;
         Z1304DevUlin = A1304DevUlin ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z327DevGenTrn = A327DevGenTrn ;
         Z407EmprNom = A407EmprNom ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z47AlbREst = A47AlbREst ;
         Z45AlbRef = A45AlbRef ;
         Z56AlbRUni = A56AlbRUni ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z279CliNom = A279CliNom ;
         Z329DevTrnNom = A329DevTrnNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV84Pgmname = "TDevPie2_BC" ;
      /* Using cursor BC01P315 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = BC01P315_A407EmprNom[0] ;
      n407EmprNom = BC01P315_n407EmprNom[0] ;
      pr_default.close(12);
   }

   public void standaloneModal( )
   {
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
   }

   public void load1P331( )
   {
      /* Using cursor BC01P317 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A54AlbRPieUti = BC01P317_A54AlbRPieUti[0] ;
         A47AlbREst = BC01P317_A47AlbREst[0] ;
         A407EmprNom = BC01P317_A407EmprNom[0] ;
         n407EmprNom = BC01P317_n407EmprNom[0] ;
         A325DevGenFec = BC01P317_A325DevGenFec[0] ;
         n325DevGenFec = BC01P317_n325DevGenFec[0] ;
         A6288DevGenDom = BC01P317_A6288DevGenDom[0] ;
         n6288DevGenDom = BC01P317_n6288DevGenDom[0] ;
         A252CliCod = BC01P317_A252CliCod[0] ;
         n252CliCod = BC01P317_n252CliCod[0] ;
         A279CliNom = BC01P317_A279CliNom[0] ;
         A45AlbRef = BC01P317_A45AlbRef[0] ;
         A329DevTrnNom = BC01P317_A329DevTrnNom[0] ;
         n329DevTrnNom = BC01P317_n329DevTrnNom[0] ;
         A56AlbRUni = BC01P317_A56AlbRUni[0] ;
         A328DevGenUni = BC01P317_A328DevGenUni[0] ;
         n328DevGenUni = BC01P317_n328DevGenUni[0] ;
         A326DevGenPie = BC01P317_A326DevGenPie[0] ;
         n326DevGenPie = BC01P317_n326DevGenPie[0] ;
         A60AlbRUniUti = BC01P317_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = BC01P317_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = BC01P317_A58AlbRUniEnt[0] ;
         A324DevGenEst = BC01P317_A324DevGenEst[0] ;
         n324DevGenEst = BC01P317_n324DevGenEst[0] ;
         A1304DevUlin = BC01P317_A1304DevUlin[0] ;
         n1304DevUlin = BC01P317_n1304DevUlin[0] ;
         A44AlbRecCod = BC01P317_A44AlbRecCod[0] ;
         n44AlbRecCod = BC01P317_n44AlbRecCod[0] ;
         A327DevGenTrn = BC01P317_A327DevGenTrn[0] ;
         n327DevGenTrn = BC01P317_n327DevGenTrn[0] ;
         A3066AlbDevPUni = BC01P317_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = BC01P317_A5278AlbDevPPie[0] ;
         zm1P331( -44) ;
      }
      pr_default.close(13);
      onLoadActions1P331( ) ;
   }

   public void onLoadActions1P331( )
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
   }

   public void checkExtendedTable1P331( )
   {
      nIsDirty_31 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC01P318 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
      }
      A54AlbRPieUti = BC01P318_A54AlbRPieUti[0] ;
      A47AlbREst = BC01P318_A47AlbREst[0] ;
      A252CliCod = BC01P318_A252CliCod[0] ;
      n252CliCod = BC01P318_n252CliCod[0] ;
      A45AlbRef = BC01P318_A45AlbRef[0] ;
      A56AlbRUni = BC01P318_A56AlbRUni[0] ;
      A60AlbRUniUti = BC01P318_A60AlbRUniUti[0] ;
      A52AlbRPieEnt = BC01P318_A52AlbRPieEnt[0] ;
      A58AlbRUniEnt = BC01P318_A58AlbRUniEnt[0] ;
      nIsDirty_31 = (short)(1) ;
      O54AlbRPieUti = A54AlbRPieUti ;
      nIsDirty_31 = (short)(1) ;
      O60AlbRUniUti = A60AlbRUniUti ;
      pr_default.close(14);
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
      /* Using cursor BC01P319 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = BC01P319_A279CliNom[0] ;
      pr_default.close(15);
      /* Using cursor BC01P320 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A327DevGenTrn) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevGen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVGENTRN");
            AnyError = (short)(1) ;
         }
      }
      A329DevTrnNom = BC01P320_A329DevTrnNom[0] ;
      n329DevTrnNom = BC01P320_n329DevTrnNom[0] ;
      pr_default.close(16);
      /* Using cursor BC01P322 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A3066AlbDevPUni = BC01P322_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = BC01P322_A5278AlbDevPPie[0] ;
      }
      else
      {
         nIsDirty_31 = (short)(1) ;
         A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
         nIsDirty_31 = (short)(1) ;
         A5278AlbDevPPie = (short)(0) ;
      }
      pr_default.close(17);
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
         tdevpie2_bc.this.A396EmprCod = GXv_char4[0] ;
         tdevpie2_bc.this.A44AlbRecCod = GXv_int6[0] ;
         tdevpie2_bc.this.AV9AlbRPieDis = GXv_int7[0] ;
         tdevpie2_bc.this.AV10AlbRUniDis = GXv_decimal8[0] ;
         tdevpie2_bc.this.AV11AlbRPDis = GXv_int9[0] ;
         tdevpie2_bc.this.AV12AlbRUDis = GXv_decimal10[0] ;
         tdevpie2_bc.this.AV13AlbRUni = GXv_char3[0] ;
      }
   }

   public void closeExtendedTableCursors1P331( )
   {
      pr_default.close(7);
      pr_default.close(15);
      pr_default.close(16);
      pr_default.close(17);
   }

   public void enableDisable( )
   {
   }

   public void getKey1P331( )
   {
      /* Using cursor BC01P323 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound31 = (short)(1) ;
      }
      else
      {
         RcdFound31 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01P324 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(19) != 101) && ( GXutil.strcmp(BC01P324_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1P331( 44) ;
         RcdFound31 = (short)(1) ;
         A323DevGenCod = BC01P324_A323DevGenCod[0] ;
         A325DevGenFec = BC01P324_A325DevGenFec[0] ;
         n325DevGenFec = BC01P324_n325DevGenFec[0] ;
         A6288DevGenDom = BC01P324_A6288DevGenDom[0] ;
         n6288DevGenDom = BC01P324_n6288DevGenDom[0] ;
         A328DevGenUni = BC01P324_A328DevGenUni[0] ;
         n328DevGenUni = BC01P324_n328DevGenUni[0] ;
         A326DevGenPie = BC01P324_A326DevGenPie[0] ;
         n326DevGenPie = BC01P324_n326DevGenPie[0] ;
         A324DevGenEst = BC01P324_A324DevGenEst[0] ;
         n324DevGenEst = BC01P324_n324DevGenEst[0] ;
         A1304DevUlin = BC01P324_A1304DevUlin[0] ;
         n1304DevUlin = BC01P324_n1304DevUlin[0] ;
         A44AlbRecCod = BC01P324_A44AlbRecCod[0] ;
         n44AlbRecCod = BC01P324_n44AlbRecCod[0] ;
         A327DevGenTrn = BC01P324_A327DevGenTrn[0] ;
         n327DevGenTrn = BC01P324_n327DevGenTrn[0] ;
         O328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
         O326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1P331( ) ;
         if ( AnyError == 1 )
         {
            RcdFound31 = (short)(0) ;
            initializeNonKey1P331( ) ;
         }
         Gx_mode = sMode31 ;
      }
      else
      {
         RcdFound31 = (short)(0) ;
         initializeNonKey1P331( ) ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode31 ;
      }
      pr_default.close(19);
   }

   public void getEqualNoModal( )
   {
      getKey1P331( ) ;
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
      confirm_1P30( ) ;
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

   public void checkOptimisticConcurrency1P331( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01P325 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(20) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVGEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(20) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z325DevGenFec), GXutil.resetTime(BC01P325_A325DevGenFec[0])) ) || ( Z6288DevGenDom != BC01P325_A6288DevGenDom[0] ) || ( DecimalUtil.compareTo(Z328DevGenUni, BC01P325_A328DevGenUni[0]) != 0 ) || ( Z326DevGenPie != BC01P325_A326DevGenPie[0] ) || ( Z324DevGenEst != BC01P325_A324DevGenEst[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1304DevUlin != BC01P325_A1304DevUlin[0] ) || ( Z44AlbRecCod != BC01P325_A44AlbRecCod[0] ) || ( Z327DevGenTrn != BC01P325_A327DevGenTrn[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVGEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor BC01P326 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(21) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( Z47AlbREst != BC01P326_A47AlbREst[0] ) || ( Z252CliCod != BC01P326_A252CliCod[0] ) || ( GXutil.strcmp(Z45AlbRef, BC01P326_A45AlbRef[0]) != 0 ) || ( GXutil.strcmp(Z56AlbRUni, BC01P326_A56AlbRUni[0]) != 0 ) || ( DecimalUtil.compareTo(Z60AlbRUniUti, BC01P326_A60AlbRUniUti[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z52AlbRPieEnt != BC01P326_A52AlbRPieEnt[0] ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, BC01P326_A58AlbRUniEnt[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1P331( )
   {
      beforeValidate1P331( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P331( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1P331( 0) ;
         checkOptimisticConcurrency1P331( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P331( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1P331( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01P327 */
                  pr_default.execute(22, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A323DevGenCod), Boolean.valueOf(n325DevGenFec), A325DevGenFec, Boolean.valueOf(n6288DevGenDom), Byte.valueOf(A6288DevGenDom), Boolean.valueOf(n328DevGenUni), A328DevGenUni, Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n324DevGenEst), Byte.valueOf(A324DevGenEst), Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( (pr_default.getStatus(22) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11P331( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1P331( ) ;
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
            load1P331( ) ;
         }
         endLevel1P331( ) ;
      }
      closeExtendedTableCursors1P331( ) ;
   }

   public void update1P331( )
   {
      beforeValidate1P331( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P331( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P331( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P331( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1P331( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01P328 */
                  pr_default.execute(23, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n325DevGenFec), A325DevGenFec, Boolean.valueOf(n6288DevGenDom), Byte.valueOf(A6288DevGenDom), Boolean.valueOf(n328DevGenUni), A328DevGenUni, Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n324DevGenEst), Byte.valueOf(A324DevGenEst), Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn), A396EmprCod, Integer.valueOf(A323DevGenCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( (pr_default.getStatus(23) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVGEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1P331( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11P331( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1P331( ) ;
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
         endLevel1P331( ) ;
      }
      closeExtendedTableCursors1P331( ) ;
   }

   public void deferredUpdate1P331( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1P331( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P331( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1P331( ) ;
         afterConfirm1P331( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1P331( ) ;
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
               scanKeyStart1P3451( ) ;
               while ( RcdFound451 != 0 )
               {
                  getByPrimaryKey1P3451( ) ;
                  delete1P3451( ) ;
                  scanKeyNext1P3451( ) ;
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
               scanKeyEnd1P3451( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01P329 */
                  pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11P331( ) ;
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
      endLevel1P331( ) ;
      Gx_mode = sMode31 ;
   }

   public void onDeleteControls1P331( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC01P331 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            A3066AlbDevPUni = BC01P331_A3066AlbDevPUni[0] ;
            A5278AlbDevPPie = BC01P331_A5278AlbDevPPie[0] ;
         }
         else
         {
            A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
            A5278AlbDevPPie = (short)(0) ;
         }
         pr_default.close(25);
         /* Using cursor BC01P332 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         zm1P331( 46) ;
         A54AlbRPieUti = BC01P332_A54AlbRPieUti[0] ;
         A47AlbREst = BC01P332_A47AlbREst[0] ;
         A252CliCod = BC01P332_A252CliCod[0] ;
         n252CliCod = BC01P332_n252CliCod[0] ;
         A45AlbRef = BC01P332_A45AlbRef[0] ;
         A56AlbRUni = BC01P332_A56AlbRUni[0] ;
         A60AlbRUniUti = BC01P332_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = BC01P332_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = BC01P332_A58AlbRUniEnt[0] ;
         O54AlbRPieUti = A54AlbRPieUti ;
         pr_default.close(26);
         /* Using cursor BC01P333 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = BC01P333_A279CliNom[0] ;
         pr_default.close(27);
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
         /* Using cursor BC01P334 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
         A329DevTrnNom = BC01P334_A329DevTrnNom[0] ;
         n329DevTrnNom = BC01P334_n329DevTrnNom[0] ;
         pr_default.close(28);
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
      if ( AnyError == 0 )
      {
         /* Using cursor BC01P335 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOBS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
      }
   }

   public void processNestedLevel1P3451( )
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
      while ( nGXsfl_451_idx < bcTDevPie2.getgxTv_SdtTDevPie2_Level1().size() )
      {
         readRow1P3451( ) ;
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
            standaloneNotModal1P3451( ) ;
            if ( isIns( ) )
            {
               Gx_mode = "INS" ;
               insert1P3451( ) ;
            }
            else
            {
               if ( isDlt( ) )
               {
                  Gx_mode = "DLT" ;
                  delete1P3451( ) ;
               }
               else
               {
                  Gx_mode = "UPD" ;
                  update1P3451( ) ;
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
         KeyVarsToRow451( ((app.SdtTDevPie2_Level1Item)bcTDevPie2.getgxTv_SdtTDevPie2_Level1().elementAt(-1+nGXsfl_451_idx))) ;
      }
      if ( AnyError == 0 )
      {
         /* Batch update SDT rows */
         nGXsfl_451_idx = 0 ;
         while ( nGXsfl_451_idx < bcTDevPie2.getgxTv_SdtTDevPie2_Level1().size() )
         {
            readRow1P3451( ) ;
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
               bcTDevPie2.getgxTv_SdtTDevPie2_Level1().removeElement(nGXsfl_451_idx);
               nGXsfl_451_idx = (int)(nGXsfl_451_idx-1) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               getByPrimaryKey1P3451( ) ;
               VarsToRow451( ((app.SdtTDevPie2_Level1Item)bcTDevPie2.getgxTv_SdtTDevPie2_Level1().elementAt(-1+nGXsfl_451_idx))) ;
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
      initAll1P3451( ) ;
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

   public void processLevel1P331( )
   {
      /* Save parent mode. */
      sMode31 = Gx_mode ;
      processNestedLevel1P3451( ) ;
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
      /* Restore parent mode. */
      Gx_mode = sMode31 ;
      /* ' Update level parameters */
      /* Using cursor BC01P336 */
      pr_default.execute(30, new Object[] {Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n328DevGenUni), A328DevGenUni, A396EmprCod, Integer.valueOf(A323DevGenCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
      /* Using cursor BC01P337 */
      pr_default.execute(31, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void updateTablesN11P331( )
   {
      /* Using cursor BC01P338 */
      pr_default.execute(32, new Object[] {Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel1P331( )
   {
      pr_default.close(20);
      pr_default.close(21);
      if ( AnyError == 0 )
      {
         beforeComplete1P331( ) ;
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

   public void scanKeyStart1P331( )
   {
      /* Scan By routine */
      /* Using cursor BC01P340 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A323DevGenCod = BC01P340_A323DevGenCod[0] ;
         A54AlbRPieUti = BC01P340_A54AlbRPieUti[0] ;
         A47AlbREst = BC01P340_A47AlbREst[0] ;
         A407EmprNom = BC01P340_A407EmprNom[0] ;
         n407EmprNom = BC01P340_n407EmprNom[0] ;
         A325DevGenFec = BC01P340_A325DevGenFec[0] ;
         n325DevGenFec = BC01P340_n325DevGenFec[0] ;
         A6288DevGenDom = BC01P340_A6288DevGenDom[0] ;
         n6288DevGenDom = BC01P340_n6288DevGenDom[0] ;
         A252CliCod = BC01P340_A252CliCod[0] ;
         n252CliCod = BC01P340_n252CliCod[0] ;
         A279CliNom = BC01P340_A279CliNom[0] ;
         A45AlbRef = BC01P340_A45AlbRef[0] ;
         A329DevTrnNom = BC01P340_A329DevTrnNom[0] ;
         n329DevTrnNom = BC01P340_n329DevTrnNom[0] ;
         A56AlbRUni = BC01P340_A56AlbRUni[0] ;
         A328DevGenUni = BC01P340_A328DevGenUni[0] ;
         n328DevGenUni = BC01P340_n328DevGenUni[0] ;
         A326DevGenPie = BC01P340_A326DevGenPie[0] ;
         n326DevGenPie = BC01P340_n326DevGenPie[0] ;
         A60AlbRUniUti = BC01P340_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = BC01P340_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = BC01P340_A58AlbRUniEnt[0] ;
         A324DevGenEst = BC01P340_A324DevGenEst[0] ;
         n324DevGenEst = BC01P340_n324DevGenEst[0] ;
         A1304DevUlin = BC01P340_A1304DevUlin[0] ;
         n1304DevUlin = BC01P340_n1304DevUlin[0] ;
         A44AlbRecCod = BC01P340_A44AlbRecCod[0] ;
         n44AlbRecCod = BC01P340_n44AlbRecCod[0] ;
         A327DevGenTrn = BC01P340_A327DevGenTrn[0] ;
         n327DevGenTrn = BC01P340_n327DevGenTrn[0] ;
         A3066AlbDevPUni = BC01P340_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = BC01P340_A5278AlbDevPPie[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1P331( )
   {
      /* Scan next routine */
      pr_default.readNext(33);
      RcdFound31 = (short)(0) ;
      scanKeyLoad1P331( ) ;
   }

   public void scanKeyLoad1P331( )
   {
      sMode31 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A323DevGenCod = BC01P340_A323DevGenCod[0] ;
         A54AlbRPieUti = BC01P340_A54AlbRPieUti[0] ;
         A47AlbREst = BC01P340_A47AlbREst[0] ;
         A407EmprNom = BC01P340_A407EmprNom[0] ;
         n407EmprNom = BC01P340_n407EmprNom[0] ;
         A325DevGenFec = BC01P340_A325DevGenFec[0] ;
         n325DevGenFec = BC01P340_n325DevGenFec[0] ;
         A6288DevGenDom = BC01P340_A6288DevGenDom[0] ;
         n6288DevGenDom = BC01P340_n6288DevGenDom[0] ;
         A252CliCod = BC01P340_A252CliCod[0] ;
         n252CliCod = BC01P340_n252CliCod[0] ;
         A279CliNom = BC01P340_A279CliNom[0] ;
         A45AlbRef = BC01P340_A45AlbRef[0] ;
         A329DevTrnNom = BC01P340_A329DevTrnNom[0] ;
         n329DevTrnNom = BC01P340_n329DevTrnNom[0] ;
         A56AlbRUni = BC01P340_A56AlbRUni[0] ;
         A328DevGenUni = BC01P340_A328DevGenUni[0] ;
         n328DevGenUni = BC01P340_n328DevGenUni[0] ;
         A326DevGenPie = BC01P340_A326DevGenPie[0] ;
         n326DevGenPie = BC01P340_n326DevGenPie[0] ;
         A60AlbRUniUti = BC01P340_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = BC01P340_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = BC01P340_A58AlbRUniEnt[0] ;
         A324DevGenEst = BC01P340_A324DevGenEst[0] ;
         n324DevGenEst = BC01P340_n324DevGenEst[0] ;
         A1304DevUlin = BC01P340_A1304DevUlin[0] ;
         n1304DevUlin = BC01P340_n1304DevUlin[0] ;
         A44AlbRecCod = BC01P340_A44AlbRecCod[0] ;
         n44AlbRecCod = BC01P340_n44AlbRecCod[0] ;
         A327DevGenTrn = BC01P340_A327DevGenTrn[0] ;
         n327DevGenTrn = BC01P340_n327DevGenTrn[0] ;
         A3066AlbDevPUni = BC01P340_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = BC01P340_A5278AlbDevPPie[0] ;
      }
      Gx_mode = sMode31 ;
   }

   public void scanKeyEnd1P331( )
   {
      pr_default.close(33);
   }

   public void afterConfirm1P331( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1P331( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1P331( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1P331( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1P331( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1P331( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1P331( )
   {
   }

   public void zm1P3451( int GX_JID )
   {
      if ( ( GX_JID == 50 ) || ( GX_JID == 0 ) )
      {
         Z3067DevPieUni = A3067DevPieUni ;
      }
      if ( ( GX_JID == 51 ) || ( GX_JID == 0 ) )
      {
         Z4795AlRPieCal = A4795AlRPieCal ;
         Z2155AlbRecKgm = A2155AlbRecKgm ;
         Z2157AlbRecMtr = A2157AlbRecMtr ;
      }
      if ( GX_JID == -50 )
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

   public void standaloneNotModal1P3451( )
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

   public void standaloneModal1P3451( )
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

   public void load1P3451( )
   {
      /* Using cursor BC01P341 */
      pr_default.execute(34, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A323DevGenCod), A396EmprCod, A2159AlbRecPie});
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound451 = (short)(1) ;
         A4795AlRPieCal = BC01P341_A4795AlRPieCal[0] ;
         A3067DevPieUni = BC01P341_A3067DevPieUni[0] ;
         A2158AlbRecMtrU = BC01P341_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = BC01P341_A2156AlbRecKgmU[0] ;
         A2155AlbRecKgm = BC01P341_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = BC01P341_A2157AlbRecMtr[0] ;
         zm1P3451( -50) ;
      }
      pr_default.close(34);
      onLoadActions1P3451( ) ;
   }

   public void onLoadActions1P3451( )
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
      if ( true /* Level */ )
      {
         AV63oldUni = O3067DevPieUni ;
      }
      if ( isIns( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
      {
         A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
         {
            A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni).subtract(AV63oldUni) ;
         }
         else
         {
            if ( isDlt( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
            {
               A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(A3067DevPieUni) ;
            }
         }
      }
      if ( isIns( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
      {
         A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
         {
            A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni).subtract(AV63oldUni) ;
         }
         else
         {
            if ( isDlt( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
            {
               A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(A3067DevPieUni) ;
            }
         }
      }
   }

   public void checkExtendedTable1P3451( )
   {
      nIsDirty_451 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1P3451( ) ;
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC01P342 */
      pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBDET", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECPIE");
         AnyError = (short)(1) ;
      }
      A4795AlRPieCal = BC01P342_A4795AlRPieCal[0] ;
      A2158AlbRecMtrU = BC01P342_A2158AlbRecMtrU[0] ;
      A2156AlbRecKgmU = BC01P342_A2156AlbRecKgmU[0] ;
      A2155AlbRecKgm = BC01P342_A2155AlbRecKgm[0] ;
      A2157AlbRecMtr = BC01P342_A2157AlbRecMtr[0] ;
      nIsDirty_451 = (short)(1) ;
      O2156AlbRecKgmU = A2156AlbRecKgmU ;
      nIsDirty_451 = (short)(1) ;
      O2158AlbRecMtrU = A2158AlbRecMtrU ;
      pr_default.close(35);
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
      if ( true /* Level */ )
      {
         AV63oldUni = O3067DevPieUni ;
      }
      if ( isIns( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
      {
         nIsDirty_451 = (short)(1) ;
         A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
         {
            nIsDirty_451 = (short)(1) ;
            A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni).subtract(AV63oldUni) ;
         }
         else
         {
            if ( isDlt( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
            {
               nIsDirty_451 = (short)(1) ;
               A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(A3067DevPieUni) ;
            }
         }
      }
      if ( DecimalUtil.compareTo(A2158AlbRecMtrU, A2157AlbRecMtr) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de kilos no suficientes", ""), 0, "");
      }
      if ( isIns( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
      {
         nIsDirty_451 = (short)(1) ;
         A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
         {
            nIsDirty_451 = (short)(1) ;
            A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni).subtract(AV63oldUni) ;
         }
         else
         {
            if ( isDlt( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
            {
               nIsDirty_451 = (short)(1) ;
               A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(A3067DevPieUni) ;
            }
         }
      }
      if ( DecimalUtil.compareTo(A2156AlbRecKgmU, A2155AlbRecKgm) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de metros no suficientes", ""), 0, "");
      }
   }

   public void closeExtendedTableCursors1P3451( )
   {
      pr_default.close(2);
   }

   public void enableDisable1P3451( )
   {
   }

   public void getKey1P3451( )
   {
      /* Using cursor BC01P343 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound451 = (short)(1) ;
      }
      else
      {
         RcdFound451 = (short)(0) ;
      }
      pr_default.close(36);
   }

   public void getByPrimaryKey1P3451( )
   {
      /* Using cursor BC01P344 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(37) != 101) && ( GXutil.strcmp(BC01P344_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1P3451( 50) ;
         RcdFound451 = (short)(1) ;
         initializeNonKey1P3451( ) ;
         A3067DevPieUni = BC01P344_A3067DevPieUni[0] ;
         A2159AlbRecPie = BC01P344_A2159AlbRecPie[0] ;
         O3067DevPieUni = A3067DevPieUni ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         sMode451 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1P3451( ) ;
         load1P3451( ) ;
         Gx_mode = sMode451 ;
      }
      else
      {
         RcdFound451 = (short)(0) ;
         initializeNonKey1P3451( ) ;
         sMode451 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1P3451( ) ;
         Gx_mode = sMode451 ;
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1P3451( ) ;
      }
      pr_default.close(37);
   }

   public void checkOptimisticConcurrency1P3451( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01P345 */
         pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(38) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDevPie"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(38) == 101) || ( DecimalUtil.compareTo(Z3067DevPieUni, BC01P345_A3067DevPieUni[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDevPie"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor BC01P346 */
      pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(39) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBDET"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( GXutil.strcmp(Z4795AlRPieCal, BC01P346_A4795AlRPieCal[0]) != 0 ) || ( DecimalUtil.compareTo(Z2155AlbRecKgm, BC01P346_A2155AlbRecKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z2157AlbRecMtr, BC01P346_A2157AlbRecMtr[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBDET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1P3451( )
   {
      beforeValidate1P3451( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P3451( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1P3451( 0) ;
         checkOptimisticConcurrency1P3451( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P3451( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1P3451( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01P347 */
                  pr_default.execute(40, new Object[] {Integer.valueOf(A323DevGenCod), A3067DevPieUni, A396EmprCod, A2159AlbRecPie});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDevPie");
                  if ( (pr_default.getStatus(40) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11P3451( ) ;
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
            load1P3451( ) ;
         }
         endLevel1P3451( ) ;
      }
      closeExtendedTableCursors1P3451( ) ;
   }

   public void update1P3451( )
   {
      beforeValidate1P3451( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P3451( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P3451( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P3451( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1P3451( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01P348 */
                  pr_default.execute(41, new Object[] {A3067DevPieUni, A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDevPie");
                  if ( (pr_default.getStatus(41) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDevPie"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1P3451( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        updateTablesN11P3451( ) ;
                        getByPrimaryKey1P3451( ) ;
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
         endLevel1P3451( ) ;
      }
      closeExtendedTableCursors1P3451( ) ;
   }

   public void deferredUpdate1P3451( )
   {
   }

   public void delete1P3451( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1P3451( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P3451( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1P3451( ) ;
         afterConfirm1P3451( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1P3451( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01P349 */
               pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDevPie");
               if ( AnyError == 0 )
               {
                  updateTablesN11P3451( ) ;
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
      endLevel1P3451( ) ;
      Gx_mode = sMode451 ;
   }

   public void onDeleteControls1P3451( )
   {
      standaloneModal1P3451( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC01P350 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         zm1P3451( 51) ;
         A4795AlRPieCal = BC01P350_A4795AlRPieCal[0] ;
         A2158AlbRecMtrU = BC01P350_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = BC01P350_A2156AlbRecKgmU[0] ;
         A2155AlbRecKgm = BC01P350_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = BC01P350_A2157AlbRecMtr[0] ;
         O2156AlbRecKgmU = A2156AlbRecKgmU ;
         O2158AlbRecMtrU = A2158AlbRecMtrU ;
         pr_default.close(43);
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
         if ( true /* Level */ )
         {
            AV63oldUni = O3067DevPieUni ;
         }
         if ( isIns( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
         {
            A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
            {
               A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni).subtract(AV63oldUni) ;
            }
            else
            {
               if ( isDlt( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
               {
                  A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(A3067DevPieUni) ;
               }
            }
         }
         if ( isIns( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
         {
            A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
            {
               A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni).subtract(AV63oldUni) ;
            }
            else
            {
               if ( isDlt( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
               {
                  A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(A3067DevPieUni) ;
               }
            }
         }
      }
   }

   public void updateTablesN11P3451( )
   {
      /* Using cursor BC01P351 */
      pr_default.execute(44, new Object[] {A2158AlbRecMtrU, A2156AlbRecKgmU, A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
   }

   public void endLevel1P3451( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(38);
      }
      pr_default.close(39);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1P3451( )
   {
      /* Scan By routine */
      /* Using cursor BC01P352 */
      pr_default.execute(45, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A323DevGenCod), A396EmprCod});
      RcdFound451 = (short)(0) ;
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound451 = (short)(1) ;
         A4795AlRPieCal = BC01P352_A4795AlRPieCal[0] ;
         A3067DevPieUni = BC01P352_A3067DevPieUni[0] ;
         A2158AlbRecMtrU = BC01P352_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = BC01P352_A2156AlbRecKgmU[0] ;
         A2155AlbRecKgm = BC01P352_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = BC01P352_A2157AlbRecMtr[0] ;
         A2159AlbRecPie = BC01P352_A2159AlbRecPie[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1P3451( )
   {
      /* Scan next routine */
      pr_default.readNext(45);
      RcdFound451 = (short)(0) ;
      scanKeyLoad1P3451( ) ;
   }

   public void scanKeyLoad1P3451( )
   {
      sMode451 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound451 = (short)(1) ;
         A4795AlRPieCal = BC01P352_A4795AlRPieCal[0] ;
         A3067DevPieUni = BC01P352_A3067DevPieUni[0] ;
         A2158AlbRecMtrU = BC01P352_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = BC01P352_A2156AlbRecKgmU[0] ;
         A2155AlbRecKgm = BC01P352_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = BC01P352_A2157AlbRecMtr[0] ;
         A2159AlbRecPie = BC01P352_A2159AlbRecPie[0] ;
      }
      Gx_mode = sMode451 ;
   }

   public void scanKeyEnd1P3451( )
   {
      pr_default.close(45);
   }

   public void afterConfirm1P3451( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1P3451( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1P3451( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1P3451( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1P3451( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1P3451( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1P3451( )
   {
   }

   public void send_integrity_lvl_hashes1P3451( )
   {
   }

   public void send_integrity_lvl_hashes1P331( )
   {
   }

   public void addRow1P331( )
   {
      VarsToRow31( bcTDevPie2) ;
   }

   public void readRow1P331( )
   {
      RowToVars31( bcTDevPie2, 1) ;
   }

   public void addRow1P3451( )
   {
      app.SdtTDevPie2_Level1Item obj451;
      obj451 = new app.SdtTDevPie2_Level1Item(remoteHandle);
      VarsToRow451( obj451) ;
      bcTDevPie2.getgxTv_SdtTDevPie2_Level1().add(obj451, 0);
      obj451.setgxTv_SdtTDevPie2_Level1Item_Mode( "UPD" );
      obj451.setgxTv_SdtTDevPie2_Level1Item_Modified( (short)(0) );
   }

   public void readRow1P3451( )
   {
      nGXsfl_451_idx = (int)(nGXsfl_451_idx+1) ;
      RowToVars451( ((app.SdtTDevPie2_Level1Item)bcTDevPie2.getgxTv_SdtTDevPie2_Level1().elementAt(-1+nGXsfl_451_idx)), 1) ;
   }

   public void initializeNonKey1P331( )
   {
      AV9AlbRPieDis = 0 ;
      AV10AlbRUniDis = DecimalUtil.ZERO ;
      AV13AlbRUni = "" ;
      AV11AlbRPDis = 0 ;
      AV12AlbRUDis = DecimalUtil.ZERO ;
      A54AlbRPieUti = 0 ;
      A47AlbREst = (byte)(0) ;
      AV14KilAnt = DecimalUtil.ZERO ;
      AV15MetAnt = DecimalUtil.ZERO ;
      AV16PieAnt = (short)(0) ;
      AV17Kilos = DecimalUtil.ZERO ;
      AV18Metros = DecimalUtil.ZERO ;
      AV19Piezas = (short)(0) ;
      A51AlbRPieDis = 0 ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A325DevGenFec = GXutil.nullDate() ;
      n325DevGenFec = false ;
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
      A328DevGenUni = DecimalUtil.ZERO ;
      n328DevGenUni = false ;
      A326DevGenPie = (short)(0) ;
      n326DevGenPie = false ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A52AlbRPieEnt = 0 ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A324DevGenEst = (byte)(0) ;
      n324DevGenEst = false ;
      A3066AlbDevPUni = DecimalUtil.ZERO ;
      A5278AlbDevPPie = (short)(0) ;
      A1304DevUlin = (byte)(0) ;
      n1304DevUlin = false ;
      O326DevGenPie = A326DevGenPie ;
      n326DevGenPie = false ;
      O328DevGenUni = A328DevGenUni ;
      n328DevGenUni = false ;
      O54AlbRPieUti = A54AlbRPieUti ;
      O60AlbRUniUti = A60AlbRUniUti ;
      O3066AlbDevPUni = A3066AlbDevPUni ;
      O5278AlbDevPPie = A5278AlbDevPPie ;
      Z325DevGenFec = GXutil.nullDate() ;
      Z6288DevGenDom = (byte)(0) ;
      Z328DevGenUni = DecimalUtil.ZERO ;
      Z326DevGenPie = (short)(0) ;
      Z324DevGenEst = (byte)(0) ;
      Z1304DevUlin = (byte)(0) ;
      Z44AlbRecCod = 0 ;
      Z327DevGenTrn = (short)(0) ;
      Z47AlbREst = (byte)(0) ;
      Z252CliCod = 0 ;
      Z45AlbRef = "" ;
      Z56AlbRUni = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z52AlbRPieEnt = 0 ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
   }

   public void initAll1P331( )
   {
      A323DevGenCod = 0 ;
      initializeNonKey1P331( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1P3451( )
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

   public void initAll1P3451( )
   {
      A2159AlbRecPie = "" ;
      initializeNonKey1P3451( ) ;
   }

   public void standaloneModalInsert1P3451( )
   {
      A326DevGenPie = i326DevGenPie ;
      n326DevGenPie = false ;
      A54AlbRPieUti = i54AlbRPieUti ;
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

   public void VarsToRow31( app.SdtTDevPie2 obj31 )
   {
      obj31.setgxTv_SdtTDevPie2_Mode( Gx_mode );
      obj31.setgxTv_SdtTDevPie2_Emprcod( A396EmprCod );
      obj31.setgxTv_SdtTDevPie2_Albrpieuti( A54AlbRPieUti );
      obj31.setgxTv_SdtTDevPie2_Albrest( A47AlbREst );
      obj31.setgxTv_SdtTDevPie2_Albrpiedis( A51AlbRPieDis );
      obj31.setgxTv_SdtTDevPie2_Albrunidis( A57AlbRUniDis );
      obj31.setgxTv_SdtTDevPie2_Emprnom( A407EmprNom );
      obj31.setgxTv_SdtTDevPie2_Devgenfec( A325DevGenFec );
      obj31.setgxTv_SdtTDevPie2_Albreccod( A44AlbRecCod );
      obj31.setgxTv_SdtTDevPie2_Devgendom( A6288DevGenDom );
      obj31.setgxTv_SdtTDevPie2_Clicod( A252CliCod );
      obj31.setgxTv_SdtTDevPie2_Clinom( A279CliNom );
      obj31.setgxTv_SdtTDevPie2_Albref( A45AlbRef );
      obj31.setgxTv_SdtTDevPie2_Devgentrn( A327DevGenTrn );
      obj31.setgxTv_SdtTDevPie2_Devtrnnom( A329DevTrnNom );
      obj31.setgxTv_SdtTDevPie2_Albruni( A56AlbRUni );
      obj31.setgxTv_SdtTDevPie2_Devgenuni( A328DevGenUni );
      obj31.setgxTv_SdtTDevPie2_Devgenpie( A326DevGenPie );
      obj31.setgxTv_SdtTDevPie2_Albruniuti( A60AlbRUniUti );
      obj31.setgxTv_SdtTDevPie2_Albrpieent( A52AlbRPieEnt );
      obj31.setgxTv_SdtTDevPie2_Albrunient( A58AlbRUniEnt );
      obj31.setgxTv_SdtTDevPie2_Devgenest( A324DevGenEst );
      obj31.setgxTv_SdtTDevPie2_Albdevpuni( A3066AlbDevPUni );
      obj31.setgxTv_SdtTDevPie2_Albdevppie( A5278AlbDevPPie );
      obj31.setgxTv_SdtTDevPie2_Devulin( A1304DevUlin );
      obj31.setgxTv_SdtTDevPie2_Emprcod( A396EmprCod );
      obj31.setgxTv_SdtTDevPie2_Devgencod( A323DevGenCod );
      obj31.setgxTv_SdtTDevPie2_Emprcod_Z( Z396EmprCod );
      obj31.setgxTv_SdtTDevPie2_Emprnom_Z( Z407EmprNom );
      obj31.setgxTv_SdtTDevPie2_Devgencod_Z( Z323DevGenCod );
      obj31.setgxTv_SdtTDevPie2_Devgenfec_Z( Z325DevGenFec );
      obj31.setgxTv_SdtTDevPie2_Albreccod_Z( Z44AlbRecCod );
      obj31.setgxTv_SdtTDevPie2_Devgendom_Z( Z6288DevGenDom );
      obj31.setgxTv_SdtTDevPie2_Clicod_Z( Z252CliCod );
      obj31.setgxTv_SdtTDevPie2_Clinom_Z( Z279CliNom );
      obj31.setgxTv_SdtTDevPie2_Albref_Z( Z45AlbRef );
      obj31.setgxTv_SdtTDevPie2_Devgentrn_Z( Z327DevGenTrn );
      obj31.setgxTv_SdtTDevPie2_Devtrnnom_Z( Z329DevTrnNom );
      obj31.setgxTv_SdtTDevPie2_Albrunidis_Z( Z57AlbRUniDis );
      obj31.setgxTv_SdtTDevPie2_Albrpiedis_Z( Z51AlbRPieDis );
      obj31.setgxTv_SdtTDevPie2_Albruni_Z( Z56AlbRUni );
      obj31.setgxTv_SdtTDevPie2_Devgenuni_Z( Z328DevGenUni );
      obj31.setgxTv_SdtTDevPie2_Devgenpie_Z( Z326DevGenPie );
      obj31.setgxTv_SdtTDevPie2_Albruniuti_Z( Z60AlbRUniUti );
      obj31.setgxTv_SdtTDevPie2_Albrpieuti_Z( Z54AlbRPieUti );
      obj31.setgxTv_SdtTDevPie2_Albrpieent_Z( Z52AlbRPieEnt );
      obj31.setgxTv_SdtTDevPie2_Albrunient_Z( Z58AlbRUniEnt );
      obj31.setgxTv_SdtTDevPie2_Albrest_Z( Z47AlbREst );
      obj31.setgxTv_SdtTDevPie2_Devgenest_Z( Z324DevGenEst );
      obj31.setgxTv_SdtTDevPie2_Albdevpuni_Z( Z3066AlbDevPUni );
      obj31.setgxTv_SdtTDevPie2_Albdevppie_Z( Z5278AlbDevPPie );
      obj31.setgxTv_SdtTDevPie2_Devulin_Z( Z1304DevUlin );
      obj31.setgxTv_SdtTDevPie2_Emprnom_N( (byte)((byte)((n407EmprNom)?1:0)) );
      obj31.setgxTv_SdtTDevPie2_Devgenfec_N( (byte)((byte)((n325DevGenFec)?1:0)) );
      obj31.setgxTv_SdtTDevPie2_Albreccod_N( (byte)((byte)((n44AlbRecCod)?1:0)) );
      obj31.setgxTv_SdtTDevPie2_Devgendom_N( (byte)((byte)((n6288DevGenDom)?1:0)) );
      obj31.setgxTv_SdtTDevPie2_Clicod_N( (byte)((byte)((n252CliCod)?1:0)) );
      obj31.setgxTv_SdtTDevPie2_Devgentrn_N( (byte)((byte)((n327DevGenTrn)?1:0)) );
      obj31.setgxTv_SdtTDevPie2_Devtrnnom_N( (byte)((byte)((n329DevTrnNom)?1:0)) );
      obj31.setgxTv_SdtTDevPie2_Devgenuni_N( (byte)((byte)((n328DevGenUni)?1:0)) );
      obj31.setgxTv_SdtTDevPie2_Devgenpie_N( (byte)((byte)((n326DevGenPie)?1:0)) );
      obj31.setgxTv_SdtTDevPie2_Devgenest_N( (byte)((byte)((n324DevGenEst)?1:0)) );
      obj31.setgxTv_SdtTDevPie2_Devulin_N( (byte)((byte)((n1304DevUlin)?1:0)) );
      obj31.setgxTv_SdtTDevPie2_Mode( Gx_mode );
   }

   public void KeyVarsToRow31( app.SdtTDevPie2 obj31 )
   {
      obj31.setgxTv_SdtTDevPie2_Emprcod( A396EmprCod );
      obj31.setgxTv_SdtTDevPie2_Devgencod( A323DevGenCod );
   }

   public void RowToVars31( app.SdtTDevPie2 obj31 ,
                            int forceLoad )
   {
      Gx_mode = obj31.getgxTv_SdtTDevPie2_Mode() ;
      A396EmprCod = obj31.getgxTv_SdtTDevPie2_Emprcod() ;
      if ( forceLoad == 1 )
      {
         A54AlbRPieUti = obj31.getgxTv_SdtTDevPie2_Albrpieuti() ;
      }
      A47AlbREst = obj31.getgxTv_SdtTDevPie2_Albrest() ;
      A51AlbRPieDis = obj31.getgxTv_SdtTDevPie2_Albrpiedis() ;
      A57AlbRUniDis = obj31.getgxTv_SdtTDevPie2_Albrunidis() ;
      A407EmprNom = obj31.getgxTv_SdtTDevPie2_Emprnom() ;
      n407EmprNom = false ;
      A325DevGenFec = obj31.getgxTv_SdtTDevPie2_Devgenfec() ;
      n325DevGenFec = false ;
      if ( ! ( isUpd( )  ) || ( forceLoad == 1 ) )
      {
         A44AlbRecCod = obj31.getgxTv_SdtTDevPie2_Albreccod() ;
         n44AlbRecCod = false ;
      }
      A6288DevGenDom = obj31.getgxTv_SdtTDevPie2_Devgendom() ;
      n6288DevGenDom = false ;
      A252CliCod = obj31.getgxTv_SdtTDevPie2_Clicod() ;
      n252CliCod = false ;
      A279CliNom = obj31.getgxTv_SdtTDevPie2_Clinom() ;
      A45AlbRef = obj31.getgxTv_SdtTDevPie2_Albref() ;
      A327DevGenTrn = obj31.getgxTv_SdtTDevPie2_Devgentrn() ;
      n327DevGenTrn = false ;
      A329DevTrnNom = obj31.getgxTv_SdtTDevPie2_Devtrnnom() ;
      n329DevTrnNom = false ;
      A56AlbRUni = obj31.getgxTv_SdtTDevPie2_Albruni() ;
      if ( forceLoad == 1 )
      {
         A328DevGenUni = obj31.getgxTv_SdtTDevPie2_Devgenuni() ;
         n328DevGenUni = false ;
      }
      if ( forceLoad == 1 )
      {
         A326DevGenPie = obj31.getgxTv_SdtTDevPie2_Devgenpie() ;
         n326DevGenPie = false ;
      }
      if ( forceLoad == 1 )
      {
         A60AlbRUniUti = obj31.getgxTv_SdtTDevPie2_Albruniuti() ;
      }
      A52AlbRPieEnt = obj31.getgxTv_SdtTDevPie2_Albrpieent() ;
      A58AlbRUniEnt = obj31.getgxTv_SdtTDevPie2_Albrunient() ;
      A324DevGenEst = obj31.getgxTv_SdtTDevPie2_Devgenest() ;
      n324DevGenEst = false ;
      A3066AlbDevPUni = obj31.getgxTv_SdtTDevPie2_Albdevpuni() ;
      A5278AlbDevPPie = obj31.getgxTv_SdtTDevPie2_Albdevppie() ;
      A1304DevUlin = obj31.getgxTv_SdtTDevPie2_Devulin() ;
      n1304DevUlin = false ;
      A396EmprCod = obj31.getgxTv_SdtTDevPie2_Emprcod() ;
      A323DevGenCod = obj31.getgxTv_SdtTDevPie2_Devgencod() ;
      Z396EmprCod = obj31.getgxTv_SdtTDevPie2_Emprcod_Z() ;
      Z407EmprNom = obj31.getgxTv_SdtTDevPie2_Emprnom_Z() ;
      Z323DevGenCod = obj31.getgxTv_SdtTDevPie2_Devgencod_Z() ;
      Z325DevGenFec = obj31.getgxTv_SdtTDevPie2_Devgenfec_Z() ;
      Z44AlbRecCod = obj31.getgxTv_SdtTDevPie2_Albreccod_Z() ;
      Z6288DevGenDom = obj31.getgxTv_SdtTDevPie2_Devgendom_Z() ;
      Z252CliCod = obj31.getgxTv_SdtTDevPie2_Clicod_Z() ;
      Z279CliNom = obj31.getgxTv_SdtTDevPie2_Clinom_Z() ;
      Z45AlbRef = obj31.getgxTv_SdtTDevPie2_Albref_Z() ;
      Z327DevGenTrn = obj31.getgxTv_SdtTDevPie2_Devgentrn_Z() ;
      Z329DevTrnNom = obj31.getgxTv_SdtTDevPie2_Devtrnnom_Z() ;
      Z57AlbRUniDis = obj31.getgxTv_SdtTDevPie2_Albrunidis_Z() ;
      Z51AlbRPieDis = obj31.getgxTv_SdtTDevPie2_Albrpiedis_Z() ;
      Z56AlbRUni = obj31.getgxTv_SdtTDevPie2_Albruni_Z() ;
      Z328DevGenUni = obj31.getgxTv_SdtTDevPie2_Devgenuni_Z() ;
      O328DevGenUni = obj31.getgxTv_SdtTDevPie2_Devgenuni_Z() ;
      Z326DevGenPie = obj31.getgxTv_SdtTDevPie2_Devgenpie_Z() ;
      O326DevGenPie = obj31.getgxTv_SdtTDevPie2_Devgenpie_Z() ;
      Z60AlbRUniUti = obj31.getgxTv_SdtTDevPie2_Albruniuti_Z() ;
      O60AlbRUniUti = obj31.getgxTv_SdtTDevPie2_Albruniuti_Z() ;
      Z54AlbRPieUti = obj31.getgxTv_SdtTDevPie2_Albrpieuti_Z() ;
      O54AlbRPieUti = obj31.getgxTv_SdtTDevPie2_Albrpieuti_Z() ;
      Z52AlbRPieEnt = obj31.getgxTv_SdtTDevPie2_Albrpieent_Z() ;
      Z58AlbRUniEnt = obj31.getgxTv_SdtTDevPie2_Albrunient_Z() ;
      Z47AlbREst = obj31.getgxTv_SdtTDevPie2_Albrest_Z() ;
      Z324DevGenEst = obj31.getgxTv_SdtTDevPie2_Devgenest_Z() ;
      Z3066AlbDevPUni = obj31.getgxTv_SdtTDevPie2_Albdevpuni_Z() ;
      O3066AlbDevPUni = obj31.getgxTv_SdtTDevPie2_Albdevpuni_Z() ;
      Z5278AlbDevPPie = obj31.getgxTv_SdtTDevPie2_Albdevppie_Z() ;
      O5278AlbDevPPie = obj31.getgxTv_SdtTDevPie2_Albdevppie_Z() ;
      Z1304DevUlin = obj31.getgxTv_SdtTDevPie2_Devulin_Z() ;
      n407EmprNom = (boolean)((obj31.getgxTv_SdtTDevPie2_Emprnom_N()==0)?false:true) ;
      n325DevGenFec = (boolean)((obj31.getgxTv_SdtTDevPie2_Devgenfec_N()==0)?false:true) ;
      n44AlbRecCod = (boolean)((obj31.getgxTv_SdtTDevPie2_Albreccod_N()==0)?false:true) ;
      n6288DevGenDom = (boolean)((obj31.getgxTv_SdtTDevPie2_Devgendom_N()==0)?false:true) ;
      n252CliCod = (boolean)((obj31.getgxTv_SdtTDevPie2_Clicod_N()==0)?false:true) ;
      n327DevGenTrn = (boolean)((obj31.getgxTv_SdtTDevPie2_Devgentrn_N()==0)?false:true) ;
      n329DevTrnNom = (boolean)((obj31.getgxTv_SdtTDevPie2_Devtrnnom_N()==0)?false:true) ;
      n328DevGenUni = (boolean)((obj31.getgxTv_SdtTDevPie2_Devgenuni_N()==0)?false:true) ;
      n326DevGenPie = (boolean)((obj31.getgxTv_SdtTDevPie2_Devgenpie_N()==0)?false:true) ;
      n324DevGenEst = (boolean)((obj31.getgxTv_SdtTDevPie2_Devgenest_N()==0)?false:true) ;
      n1304DevUlin = (boolean)((obj31.getgxTv_SdtTDevPie2_Devulin_N()==0)?false:true) ;
      Gx_mode = obj31.getgxTv_SdtTDevPie2_Mode() ;
   }

   public void VarsToRow451( app.SdtTDevPie2_Level1Item obj451 )
   {
      obj451.setgxTv_SdtTDevPie2_Level1Item_Mode( Gx_mode );
      obj451.setgxTv_SdtTDevPie2_Level1Item_Devpieuni( A3067DevPieUni );
      obj451.setgxTv_SdtTDevPie2_Level1Item_Albrecmtru( A2158AlbRecMtrU );
      obj451.setgxTv_SdtTDevPie2_Level1Item_Albreckgmu( A2156AlbRecKgmU );
      obj451.setgxTv_SdtTDevPie2_Level1Item_Albreckgm( A2155AlbRecKgm );
      obj451.setgxTv_SdtTDevPie2_Level1Item_Albrecmtr( A2157AlbRecMtr );
      obj451.setgxTv_SdtTDevPie2_Level1Item_Albrecpie( A2159AlbRecPie );
      obj451.setgxTv_SdtTDevPie2_Level1Item_Albrecpie_Z( Z2159AlbRecPie );
      obj451.setgxTv_SdtTDevPie2_Level1Item_Albreckgm_Z( Z2155AlbRecKgm );
      obj451.setgxTv_SdtTDevPie2_Level1Item_Albrecmtr_Z( Z2157AlbRecMtr );
      obj451.setgxTv_SdtTDevPie2_Level1Item_Albreckgmu_Z( Z2156AlbRecKgmU );
      obj451.setgxTv_SdtTDevPie2_Level1Item_Albrecmtru_Z( Z2158AlbRecMtrU );
      obj451.setgxTv_SdtTDevPie2_Level1Item_Devpieuni_Z( Z3067DevPieUni );
      obj451.setgxTv_SdtTDevPie2_Level1Item_Modified( nIsMod_451 );
   }

   public void KeyVarsToRow451( app.SdtTDevPie2_Level1Item obj451 )
   {
      obj451.setgxTv_SdtTDevPie2_Level1Item_Albrecpie( A2159AlbRecPie );
   }

   public void RowToVars451( app.SdtTDevPie2_Level1Item obj451 ,
                             int forceLoad )
   {
      Gx_mode = obj451.getgxTv_SdtTDevPie2_Level1Item_Mode() ;
      A3067DevPieUni = obj451.getgxTv_SdtTDevPie2_Level1Item_Devpieuni() ;
      A2158AlbRecMtrU = obj451.getgxTv_SdtTDevPie2_Level1Item_Albrecmtru() ;
      A2156AlbRecKgmU = obj451.getgxTv_SdtTDevPie2_Level1Item_Albreckgmu() ;
      A2155AlbRecKgm = obj451.getgxTv_SdtTDevPie2_Level1Item_Albreckgm() ;
      A2157AlbRecMtr = obj451.getgxTv_SdtTDevPie2_Level1Item_Albrecmtr() ;
      A2159AlbRecPie = obj451.getgxTv_SdtTDevPie2_Level1Item_Albrecpie() ;
      Z2159AlbRecPie = obj451.getgxTv_SdtTDevPie2_Level1Item_Albrecpie_Z() ;
      Z2155AlbRecKgm = obj451.getgxTv_SdtTDevPie2_Level1Item_Albreckgm_Z() ;
      Z2157AlbRecMtr = obj451.getgxTv_SdtTDevPie2_Level1Item_Albrecmtr_Z() ;
      Z2156AlbRecKgmU = obj451.getgxTv_SdtTDevPie2_Level1Item_Albreckgmu_Z() ;
      O2156AlbRecKgmU = obj451.getgxTv_SdtTDevPie2_Level1Item_Albreckgmu_Z() ;
      Z2158AlbRecMtrU = obj451.getgxTv_SdtTDevPie2_Level1Item_Albrecmtru_Z() ;
      O2158AlbRecMtrU = obj451.getgxTv_SdtTDevPie2_Level1Item_Albrecmtru_Z() ;
      Z3067DevPieUni = obj451.getgxTv_SdtTDevPie2_Level1Item_Devpieuni_Z() ;
      O3067DevPieUni = obj451.getgxTv_SdtTDevPie2_Level1Item_Devpieuni_Z() ;
      nIsMod_451 = obj451.getgxTv_SdtTDevPie2_Level1Item_Modified() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A323DevGenCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1P331( ) ;
      scanKeyStart1P331( ) ;
      if ( RcdFound31 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01P353 */
         pr_default.execute(46, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(46) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01P353_A407EmprNom[0] ;
         n407EmprNom = BC01P353_n407EmprNom[0] ;
         pr_default.close(46);
         /* Using cursor BC01P355 */
         pr_default.execute(47, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            A3066AlbDevPUni = BC01P355_A3066AlbDevPUni[0] ;
            A5278AlbDevPPie = BC01P355_A5278AlbDevPPie[0] ;
         }
         else
         {
            A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
            A5278AlbDevPPie = (short)(0) ;
         }
         pr_default.close(47);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         O3067DevPieUni = A3067DevPieUni ;
         O328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
         O326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         O54AlbRPieUti = A54AlbRPieUti ;
      }
      zm1P331( -44) ;
      onLoadActions1P331( ) ;
      addRow1P331( ) ;
      bcTDevPie2.getgxTv_SdtTDevPie2_Level1().clearCollection();
      if ( RcdFound31 == 1 )
      {
         scanKeyStart1P3451( ) ;
         nGXsfl_451_idx = 1 ;
         while ( RcdFound451 != 0 )
         {
            O3067DevPieUni = A3067DevPieUni ;
            O2156AlbRecKgmU = A2156AlbRecKgmU ;
            O2158AlbRecMtrU = A2158AlbRecMtrU ;
            Z396EmprCod = A396EmprCod ;
            Z323DevGenCod = A323DevGenCod ;
            Z2159AlbRecPie = A2159AlbRecPie ;
            zm1P3451( -50) ;
            onLoadActions1P3451( ) ;
            nRcdExists_451 = (short)(1) ;
            nIsMod_451 = (short)(0) ;
            Z3067DevPieUni = A3067DevPieUni ;
            Z2156AlbRecKgmU = A2156AlbRecKgmU ;
            Z2158AlbRecMtrU = A2158AlbRecMtrU ;
            addRow1P3451( ) ;
            nGXsfl_451_idx = (int)(nGXsfl_451_idx+1) ;
            scanKeyNext1P3451( ) ;
         }
         scanKeyEnd1P3451( ) ;
      }
      scanKeyEnd1P331( ) ;
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
      RowToVars31( bcTDevPie2, 0) ;
      scanKeyStart1P331( ) ;
      if ( RcdFound31 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01P356 */
         pr_default.execute(48, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(48) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01P356_A407EmprNom[0] ;
         n407EmprNom = BC01P356_n407EmprNom[0] ;
         pr_default.close(48);
         /* Using cursor BC01P358 */
         pr_default.execute(49, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            A3066AlbDevPUni = BC01P358_A3066AlbDevPUni[0] ;
            A5278AlbDevPPie = BC01P358_A5278AlbDevPPie[0] ;
         }
         else
         {
            A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
            A5278AlbDevPPie = (short)(0) ;
         }
         pr_default.close(49);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         O3067DevPieUni = A3067DevPieUni ;
         O328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
         O326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         O54AlbRPieUti = A54AlbRPieUti ;
      }
      zm1P331( -44) ;
      onLoadActions1P331( ) ;
      addRow1P331( ) ;
      bcTDevPie2.getgxTv_SdtTDevPie2_Level1().clearCollection();
      if ( RcdFound31 == 1 )
      {
         scanKeyStart1P3451( ) ;
         nGXsfl_451_idx = 1 ;
         while ( RcdFound451 != 0 )
         {
            O3067DevPieUni = A3067DevPieUni ;
            O2156AlbRecKgmU = A2156AlbRecKgmU ;
            O2158AlbRecMtrU = A2158AlbRecMtrU ;
            Z396EmprCod = A396EmprCod ;
            Z323DevGenCod = A323DevGenCod ;
            Z2159AlbRecPie = A2159AlbRecPie ;
            zm1P3451( -50) ;
            onLoadActions1P3451( ) ;
            nRcdExists_451 = (short)(1) ;
            nIsMod_451 = (short)(0) ;
            Z3067DevPieUni = A3067DevPieUni ;
            Z2156AlbRecKgmU = A2156AlbRecKgmU ;
            Z2158AlbRecMtrU = A2158AlbRecMtrU ;
            addRow1P3451( ) ;
            nGXsfl_451_idx = (int)(nGXsfl_451_idx+1) ;
            scanKeyNext1P3451( ) ;
         }
         scanKeyEnd1P3451( ) ;
      }
      scanKeyEnd1P331( ) ;
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
      getKey1P331( ) ;
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
         insert1P331( ) ;
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
               update1P331( ) ;
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
                     insert1P331( ) ;
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
                     insert1P331( ) ;
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
      RowToVars31( bcTDevPie2, 1) ;
      saveImpl( ) ;
      VarsToRow31( bcTDevPie2) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars31( bcTDevPie2, 1) ;
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
      insert1P331( ) ;
      afterTrn( ) ;
      VarsToRow31( bcTDevPie2) ;
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
         app.SdtTDevPie2 auxBC = new app.SdtTDevPie2( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A323DevGenCod);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcTDevPie2);
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
      RowToVars31( bcTDevPie2, 1) ;
      updateImpl( ) ;
      VarsToRow31( bcTDevPie2) ;
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
      RowToVars31( bcTDevPie2, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1P331( ) ;
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
      VarsToRow31( bcTDevPie2) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars31( bcTDevPie2, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1P331( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdevpie2_bc");
      VarsToRow31( bcTDevPie2) ;
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
      Gx_mode = bcTDevPie2.getgxTv_SdtTDevPie2_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTDevPie2.setgxTv_SdtTDevPie2_Mode( Gx_mode );
   }

   public void SetSDT( app.SdtTDevPie2 sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTDevPie2 )
      {
         bcTDevPie2 = sdt ;
         if ( GXutil.strcmp(bcTDevPie2.getgxTv_SdtTDevPie2_Mode(), "") == 0 )
         {
            bcTDevPie2.setgxTv_SdtTDevPie2_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow31( bcTDevPie2) ;
         }
         else
         {
            RowToVars31( bcTDevPie2, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTDevPie2.getgxTv_SdtTDevPie2_Mode(), "") == 0 )
         {
            bcTDevPie2.setgxTv_SdtTDevPie2_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars31( bcTDevPie2, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtTDevPie2 getTDevPie2_BC( )
   {
      return bcTDevPie2 ;
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
      AV7EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      AV75EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV77WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV78TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV79WebSession = httpContext.getWebSession();
      AV84Pgmname = "" ;
      AV82TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      A2159AlbRecPie = "" ;
      AV83Window = new com.genexus.webpanels.GXWindow();
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      Z325DevGenFec = GXutil.nullDate() ;
      A325DevGenFec = GXutil.nullDate() ;
      Z328DevGenUni = DecimalUtil.ZERO ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      Z3066AlbDevPUni = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      A407EmprNom = "" ;
      Z45AlbRef = "" ;
      A45AlbRef = "" ;
      Z56AlbRUni = "" ;
      A56AlbRUni = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
      A279CliNom = "" ;
      Z329DevTrnNom = "" ;
      A329DevTrnNom = "" ;
      BC01P315_A407EmprNom = new String[] {""} ;
      BC01P315_n407EmprNom = new boolean[] {false} ;
      AV12AlbRUDis = DecimalUtil.ZERO ;
      BC01P317_A323DevGenCod = new int[1] ;
      BC01P317_A54AlbRPieUti = new int[1] ;
      BC01P317_A47AlbREst = new byte[1] ;
      BC01P317_A407EmprNom = new String[] {""} ;
      BC01P317_n407EmprNom = new boolean[] {false} ;
      BC01P317_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01P317_n325DevGenFec = new boolean[] {false} ;
      BC01P317_A6288DevGenDom = new byte[1] ;
      BC01P317_n6288DevGenDom = new boolean[] {false} ;
      BC01P317_A252CliCod = new int[1] ;
      BC01P317_n252CliCod = new boolean[] {false} ;
      BC01P317_A279CliNom = new String[] {""} ;
      BC01P317_A45AlbRef = new String[] {""} ;
      BC01P317_A329DevTrnNom = new String[] {""} ;
      BC01P317_n329DevTrnNom = new boolean[] {false} ;
      BC01P317_A56AlbRUni = new String[] {""} ;
      BC01P317_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P317_n328DevGenUni = new boolean[] {false} ;
      BC01P317_A326DevGenPie = new short[1] ;
      BC01P317_n326DevGenPie = new boolean[] {false} ;
      BC01P317_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P317_A52AlbRPieEnt = new int[1] ;
      BC01P317_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P317_A324DevGenEst = new byte[1] ;
      BC01P317_n324DevGenEst = new boolean[] {false} ;
      BC01P317_A1304DevUlin = new byte[1] ;
      BC01P317_n1304DevUlin = new boolean[] {false} ;
      BC01P317_A396EmprCod = new String[] {""} ;
      BC01P317_A44AlbRecCod = new int[1] ;
      BC01P317_n44AlbRecCod = new boolean[] {false} ;
      BC01P317_A327DevGenTrn = new short[1] ;
      BC01P317_n327DevGenTrn = new boolean[] {false} ;
      BC01P317_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P317_A5278AlbDevPPie = new short[1] ;
      BC01P318_A54AlbRPieUti = new int[1] ;
      BC01P318_A47AlbREst = new byte[1] ;
      BC01P318_A252CliCod = new int[1] ;
      BC01P318_n252CliCod = new boolean[] {false} ;
      BC01P318_A45AlbRef = new String[] {""} ;
      BC01P318_A56AlbRUni = new String[] {""} ;
      BC01P318_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P318_A52AlbRPieEnt = new int[1] ;
      BC01P318_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P319_A279CliNom = new String[] {""} ;
      BC01P320_A329DevTrnNom = new String[] {""} ;
      BC01P320_n329DevTrnNom = new boolean[] {false} ;
      BC01P322_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P322_A5278AlbDevPPie = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int9 = new int[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV13AlbRUni = "" ;
      GXv_char3 = new String[1] ;
      BC01P323_A396EmprCod = new String[] {""} ;
      BC01P323_A323DevGenCod = new int[1] ;
      BC01P324_A323DevGenCod = new int[1] ;
      BC01P324_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01P324_n325DevGenFec = new boolean[] {false} ;
      BC01P324_A6288DevGenDom = new byte[1] ;
      BC01P324_n6288DevGenDom = new boolean[] {false} ;
      BC01P324_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P324_n328DevGenUni = new boolean[] {false} ;
      BC01P324_A326DevGenPie = new short[1] ;
      BC01P324_n326DevGenPie = new boolean[] {false} ;
      BC01P324_A324DevGenEst = new byte[1] ;
      BC01P324_n324DevGenEst = new boolean[] {false} ;
      BC01P324_A1304DevUlin = new byte[1] ;
      BC01P324_n1304DevUlin = new boolean[] {false} ;
      BC01P324_A396EmprCod = new String[] {""} ;
      BC01P324_A44AlbRecCod = new int[1] ;
      BC01P324_n44AlbRecCod = new boolean[] {false} ;
      BC01P324_A327DevGenTrn = new short[1] ;
      BC01P324_n327DevGenTrn = new boolean[] {false} ;
      BC01P325_A323DevGenCod = new int[1] ;
      BC01P325_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01P325_n325DevGenFec = new boolean[] {false} ;
      BC01P325_A6288DevGenDom = new byte[1] ;
      BC01P325_n6288DevGenDom = new boolean[] {false} ;
      BC01P325_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P325_n328DevGenUni = new boolean[] {false} ;
      BC01P325_A326DevGenPie = new short[1] ;
      BC01P325_n326DevGenPie = new boolean[] {false} ;
      BC01P325_A324DevGenEst = new byte[1] ;
      BC01P325_n324DevGenEst = new boolean[] {false} ;
      BC01P325_A1304DevUlin = new byte[1] ;
      BC01P325_n1304DevUlin = new boolean[] {false} ;
      BC01P325_A396EmprCod = new String[] {""} ;
      BC01P325_A44AlbRecCod = new int[1] ;
      BC01P325_n44AlbRecCod = new boolean[] {false} ;
      BC01P325_A327DevGenTrn = new short[1] ;
      BC01P325_n327DevGenTrn = new boolean[] {false} ;
      BC01P326_A54AlbRPieUti = new int[1] ;
      BC01P326_A47AlbREst = new byte[1] ;
      BC01P326_A252CliCod = new int[1] ;
      BC01P326_n252CliCod = new boolean[] {false} ;
      BC01P326_A45AlbRef = new String[] {""} ;
      BC01P326_A56AlbRUni = new String[] {""} ;
      BC01P326_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P326_A52AlbRPieEnt = new int[1] ;
      BC01P326_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P331_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P331_A5278AlbDevPPie = new short[1] ;
      BC01P332_A54AlbRPieUti = new int[1] ;
      BC01P332_A47AlbREst = new byte[1] ;
      BC01P332_A252CliCod = new int[1] ;
      BC01P332_n252CliCod = new boolean[] {false} ;
      BC01P332_A45AlbRef = new String[] {""} ;
      BC01P332_A56AlbRUni = new String[] {""} ;
      BC01P332_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P332_A52AlbRPieEnt = new int[1] ;
      BC01P332_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P333_A279CliNom = new String[] {""} ;
      BC01P334_A329DevTrnNom = new String[] {""} ;
      BC01P334_n329DevTrnNom = new boolean[] {false} ;
      BC01P335_A396EmprCod = new String[] {""} ;
      BC01P335_A323DevGenCod = new int[1] ;
      BC01P335_A1302DevLin = new byte[1] ;
      BC01P340_A323DevGenCod = new int[1] ;
      BC01P340_A54AlbRPieUti = new int[1] ;
      BC01P340_A47AlbREst = new byte[1] ;
      BC01P340_A407EmprNom = new String[] {""} ;
      BC01P340_n407EmprNom = new boolean[] {false} ;
      BC01P340_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01P340_n325DevGenFec = new boolean[] {false} ;
      BC01P340_A6288DevGenDom = new byte[1] ;
      BC01P340_n6288DevGenDom = new boolean[] {false} ;
      BC01P340_A252CliCod = new int[1] ;
      BC01P340_n252CliCod = new boolean[] {false} ;
      BC01P340_A279CliNom = new String[] {""} ;
      BC01P340_A45AlbRef = new String[] {""} ;
      BC01P340_A329DevTrnNom = new String[] {""} ;
      BC01P340_n329DevTrnNom = new boolean[] {false} ;
      BC01P340_A56AlbRUni = new String[] {""} ;
      BC01P340_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P340_n328DevGenUni = new boolean[] {false} ;
      BC01P340_A326DevGenPie = new short[1] ;
      BC01P340_n326DevGenPie = new boolean[] {false} ;
      BC01P340_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P340_A52AlbRPieEnt = new int[1] ;
      BC01P340_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P340_A324DevGenEst = new byte[1] ;
      BC01P340_n324DevGenEst = new boolean[] {false} ;
      BC01P340_A1304DevUlin = new byte[1] ;
      BC01P340_n1304DevUlin = new boolean[] {false} ;
      BC01P340_A396EmprCod = new String[] {""} ;
      BC01P340_A44AlbRecCod = new int[1] ;
      BC01P340_n44AlbRecCod = new boolean[] {false} ;
      BC01P340_A327DevGenTrn = new short[1] ;
      BC01P340_n327DevGenTrn = new boolean[] {false} ;
      BC01P340_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P340_A5278AlbDevPPie = new short[1] ;
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
      BC01P341_A4795AlRPieCal = new String[] {""} ;
      BC01P341_A323DevGenCod = new int[1] ;
      BC01P341_A3067DevPieUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P341_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P341_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P341_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P341_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P341_A396EmprCod = new String[] {""} ;
      BC01P341_A2159AlbRecPie = new String[] {""} ;
      BC01P341_A44AlbRecCod = new int[1] ;
      BC01P341_n44AlbRecCod = new boolean[] {false} ;
      O3067DevPieUni = DecimalUtil.ZERO ;
      AV63oldUni = DecimalUtil.ZERO ;
      O2158AlbRecMtrU = DecimalUtil.ZERO ;
      O2156AlbRecKgmU = DecimalUtil.ZERO ;
      BC01P342_A4795AlRPieCal = new String[] {""} ;
      BC01P342_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P342_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P342_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P342_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P342_A44AlbRecCod = new int[1] ;
      BC01P342_n44AlbRecCod = new boolean[] {false} ;
      BC01P343_A396EmprCod = new String[] {""} ;
      BC01P343_A323DevGenCod = new int[1] ;
      BC01P343_A2159AlbRecPie = new String[] {""} ;
      BC01P344_A323DevGenCod = new int[1] ;
      BC01P344_A3067DevPieUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P344_A396EmprCod = new String[] {""} ;
      BC01P344_A2159AlbRecPie = new String[] {""} ;
      sMode451 = "" ;
      BC01P345_A323DevGenCod = new int[1] ;
      BC01P345_A3067DevPieUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P345_A396EmprCod = new String[] {""} ;
      BC01P345_A2159AlbRecPie = new String[] {""} ;
      BC01P346_A4795AlRPieCal = new String[] {""} ;
      BC01P346_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P346_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P346_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P346_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P346_A44AlbRecCod = new int[1] ;
      BC01P346_n44AlbRecCod = new boolean[] {false} ;
      BC01P350_A4795AlRPieCal = new String[] {""} ;
      BC01P350_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P350_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P350_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P350_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P352_A4795AlRPieCal = new String[] {""} ;
      BC01P352_A323DevGenCod = new int[1] ;
      BC01P352_A3067DevPieUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P352_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P352_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P352_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P352_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P352_A396EmprCod = new String[] {""} ;
      BC01P352_A2159AlbRecPie = new String[] {""} ;
      BC01P352_A44AlbRecCod = new int[1] ;
      BC01P352_n44AlbRecCod = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC01P353_A407EmprNom = new String[] {""} ;
      BC01P353_n407EmprNom = new boolean[] {false} ;
      BC01P355_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P355_A5278AlbDevPPie = new short[1] ;
      BC01P356_A407EmprNom = new String[] {""} ;
      BC01P356_n407EmprNom = new boolean[] {false} ;
      BC01P358_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01P358_A5278AlbDevPPie = new short[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdevpie2_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdevpie2_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdevpie2_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdevpie2_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevpie2_bc__default(),
         new Object[] {
             new Object[] {
            BC01P32_A323DevGenCod, BC01P32_A3067DevPieUni, BC01P32_A396EmprCod, BC01P32_A2159AlbRecPie
            }
            , new Object[] {
            BC01P33_A323DevGenCod, BC01P33_A3067DevPieUni, BC01P33_A396EmprCod, BC01P33_A2159AlbRecPie
            }
            , new Object[] {
            BC01P34_A4795AlRPieCal, BC01P34_A2158AlbRecMtrU, BC01P34_A2156AlbRecKgmU, BC01P34_A2155AlbRecKgm, BC01P34_A2157AlbRecMtr, BC01P34_A44AlbRecCod
            }
            , new Object[] {
            BC01P35_A4795AlRPieCal, BC01P35_A2158AlbRecMtrU, BC01P35_A2156AlbRecKgmU, BC01P35_A2155AlbRecKgm, BC01P35_A2157AlbRecMtr, BC01P35_A44AlbRecCod
            }
            , new Object[] {
            BC01P36_A323DevGenCod, BC01P36_A325DevGenFec, BC01P36_n325DevGenFec, BC01P36_A6288DevGenDom, BC01P36_n6288DevGenDom, BC01P36_A328DevGenUni, BC01P36_n328DevGenUni, BC01P36_A326DevGenPie, BC01P36_n326DevGenPie, BC01P36_A324DevGenEst,
            BC01P36_n324DevGenEst, BC01P36_A1304DevUlin, BC01P36_n1304DevUlin, BC01P36_A396EmprCod, BC01P36_A44AlbRecCod, BC01P36_n44AlbRecCod, BC01P36_A327DevGenTrn, BC01P36_n327DevGenTrn, BC01P36_A252CliCod, BC01P36_n252CliCod
            }
            , new Object[] {
            BC01P37_A323DevGenCod, BC01P37_A325DevGenFec, BC01P37_n325DevGenFec, BC01P37_A6288DevGenDom, BC01P37_n6288DevGenDom, BC01P37_A328DevGenUni, BC01P37_n328DevGenUni, BC01P37_A326DevGenPie, BC01P37_n326DevGenPie, BC01P37_A324DevGenEst,
            BC01P37_n324DevGenEst, BC01P37_A1304DevUlin, BC01P37_n1304DevUlin, BC01P37_A396EmprCod, BC01P37_A44AlbRecCod, BC01P37_n44AlbRecCod, BC01P37_A327DevGenTrn, BC01P37_n327DevGenTrn, BC01P37_A252CliCod, BC01P37_n252CliCod
            }
            , new Object[] {
            BC01P38_A407EmprNom, BC01P38_n407EmprNom
            }
            , new Object[] {
            BC01P39_A54AlbRPieUti, BC01P39_A47AlbREst, BC01P39_A252CliCod, BC01P39_A45AlbRef, BC01P39_A56AlbRUni, BC01P39_A60AlbRUniUti, BC01P39_A52AlbRPieEnt, BC01P39_A58AlbRUniEnt
            }
            , new Object[] {
            BC01P310_A54AlbRPieUti, BC01P310_A47AlbREst, BC01P310_A252CliCod, BC01P310_A45AlbRef, BC01P310_A56AlbRUni, BC01P310_A60AlbRUniUti, BC01P310_A52AlbRPieEnt, BC01P310_A58AlbRUniEnt
            }
            , new Object[] {
            BC01P311_A279CliNom
            }
            , new Object[] {
            BC01P312_A329DevTrnNom, BC01P312_n329DevTrnNom
            }
            , new Object[] {
            BC01P314_A3066AlbDevPUni, BC01P314_A5278AlbDevPPie
            }
            , new Object[] {
            BC01P315_A407EmprNom, BC01P315_n407EmprNom
            }
            , new Object[] {
            BC01P317_A323DevGenCod, BC01P317_A54AlbRPieUti, BC01P317_A47AlbREst, BC01P317_A407EmprNom, BC01P317_n407EmprNom, BC01P317_A325DevGenFec, BC01P317_n325DevGenFec, BC01P317_A6288DevGenDom, BC01P317_n6288DevGenDom, BC01P317_A252CliCod,
            BC01P317_n252CliCod, BC01P317_A279CliNom, BC01P317_A45AlbRef, BC01P317_A329DevTrnNom, BC01P317_n329DevTrnNom, BC01P317_A56AlbRUni, BC01P317_A328DevGenUni, BC01P317_n328DevGenUni, BC01P317_A326DevGenPie, BC01P317_n326DevGenPie,
            BC01P317_A60AlbRUniUti, BC01P317_A52AlbRPieEnt, BC01P317_A58AlbRUniEnt, BC01P317_A324DevGenEst, BC01P317_n324DevGenEst, BC01P317_A1304DevUlin, BC01P317_n1304DevUlin, BC01P317_A396EmprCod, BC01P317_A44AlbRecCod, BC01P317_n44AlbRecCod,
            BC01P317_A327DevGenTrn, BC01P317_n327DevGenTrn, BC01P317_A3066AlbDevPUni, BC01P317_A5278AlbDevPPie
            }
            , new Object[] {
            BC01P318_A54AlbRPieUti, BC01P318_A47AlbREst, BC01P318_A252CliCod, BC01P318_A45AlbRef, BC01P318_A56AlbRUni, BC01P318_A60AlbRUniUti, BC01P318_A52AlbRPieEnt, BC01P318_A58AlbRUniEnt
            }
            , new Object[] {
            BC01P319_A279CliNom
            }
            , new Object[] {
            BC01P320_A329DevTrnNom, BC01P320_n329DevTrnNom
            }
            , new Object[] {
            BC01P322_A3066AlbDevPUni, BC01P322_A5278AlbDevPPie
            }
            , new Object[] {
            BC01P323_A396EmprCod, BC01P323_A323DevGenCod
            }
            , new Object[] {
            BC01P324_A323DevGenCod, BC01P324_A325DevGenFec, BC01P324_n325DevGenFec, BC01P324_A6288DevGenDom, BC01P324_n6288DevGenDom, BC01P324_A328DevGenUni, BC01P324_n328DevGenUni, BC01P324_A326DevGenPie, BC01P324_n326DevGenPie, BC01P324_A324DevGenEst,
            BC01P324_n324DevGenEst, BC01P324_A1304DevUlin, BC01P324_n1304DevUlin, BC01P324_A396EmprCod, BC01P324_A44AlbRecCod, BC01P324_n44AlbRecCod, BC01P324_A327DevGenTrn, BC01P324_n327DevGenTrn
            }
            , new Object[] {
            BC01P325_A323DevGenCod, BC01P325_A325DevGenFec, BC01P325_n325DevGenFec, BC01P325_A6288DevGenDom, BC01P325_n6288DevGenDom, BC01P325_A328DevGenUni, BC01P325_n328DevGenUni, BC01P325_A326DevGenPie, BC01P325_n326DevGenPie, BC01P325_A324DevGenEst,
            BC01P325_n324DevGenEst, BC01P325_A1304DevUlin, BC01P325_n1304DevUlin, BC01P325_A396EmprCod, BC01P325_A44AlbRecCod, BC01P325_n44AlbRecCod, BC01P325_A327DevGenTrn, BC01P325_n327DevGenTrn
            }
            , new Object[] {
            BC01P326_A54AlbRPieUti, BC01P326_A47AlbREst, BC01P326_A252CliCod, BC01P326_A45AlbRef, BC01P326_A56AlbRUni, BC01P326_A60AlbRUniUti, BC01P326_A52AlbRPieEnt, BC01P326_A58AlbRUniEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01P331_A3066AlbDevPUni, BC01P331_A5278AlbDevPPie
            }
            , new Object[] {
            BC01P332_A54AlbRPieUti, BC01P332_A47AlbREst, BC01P332_A252CliCod, BC01P332_A45AlbRef, BC01P332_A56AlbRUni, BC01P332_A60AlbRUniUti, BC01P332_A52AlbRPieEnt, BC01P332_A58AlbRUniEnt
            }
            , new Object[] {
            BC01P333_A279CliNom
            }
            , new Object[] {
            BC01P334_A329DevTrnNom, BC01P334_n329DevTrnNom
            }
            , new Object[] {
            BC01P335_A396EmprCod, BC01P335_A323DevGenCod, BC01P335_A1302DevLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01P340_A323DevGenCod, BC01P340_A54AlbRPieUti, BC01P340_A47AlbREst, BC01P340_A407EmprNom, BC01P340_n407EmprNom, BC01P340_A325DevGenFec, BC01P340_n325DevGenFec, BC01P340_A6288DevGenDom, BC01P340_n6288DevGenDom, BC01P340_A252CliCod,
            BC01P340_n252CliCod, BC01P340_A279CliNom, BC01P340_A45AlbRef, BC01P340_A329DevTrnNom, BC01P340_n329DevTrnNom, BC01P340_A56AlbRUni, BC01P340_A328DevGenUni, BC01P340_n328DevGenUni, BC01P340_A326DevGenPie, BC01P340_n326DevGenPie,
            BC01P340_A60AlbRUniUti, BC01P340_A52AlbRPieEnt, BC01P340_A58AlbRUniEnt, BC01P340_A324DevGenEst, BC01P340_n324DevGenEst, BC01P340_A1304DevUlin, BC01P340_n1304DevUlin, BC01P340_A396EmprCod, BC01P340_A44AlbRecCod, BC01P340_n44AlbRecCod,
            BC01P340_A327DevGenTrn, BC01P340_n327DevGenTrn, BC01P340_A3066AlbDevPUni, BC01P340_A5278AlbDevPPie
            }
            , new Object[] {
            BC01P341_A4795AlRPieCal, BC01P341_A323DevGenCod, BC01P341_A3067DevPieUni, BC01P341_A2158AlbRecMtrU, BC01P341_A2156AlbRecKgmU, BC01P341_A2155AlbRecKgm, BC01P341_A2157AlbRecMtr, BC01P341_A396EmprCod, BC01P341_A2159AlbRecPie, BC01P341_A44AlbRecCod
            }
            , new Object[] {
            BC01P342_A4795AlRPieCal, BC01P342_A2158AlbRecMtrU, BC01P342_A2156AlbRecKgmU, BC01P342_A2155AlbRecKgm, BC01P342_A2157AlbRecMtr, BC01P342_A44AlbRecCod
            }
            , new Object[] {
            BC01P343_A396EmprCod, BC01P343_A323DevGenCod, BC01P343_A2159AlbRecPie
            }
            , new Object[] {
            BC01P344_A323DevGenCod, BC01P344_A3067DevPieUni, BC01P344_A396EmprCod, BC01P344_A2159AlbRecPie
            }
            , new Object[] {
            BC01P345_A323DevGenCod, BC01P345_A3067DevPieUni, BC01P345_A396EmprCod, BC01P345_A2159AlbRecPie
            }
            , new Object[] {
            BC01P346_A4795AlRPieCal, BC01P346_A2158AlbRecMtrU, BC01P346_A2156AlbRecKgmU, BC01P346_A2155AlbRecKgm, BC01P346_A2157AlbRecMtr, BC01P346_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01P350_A4795AlRPieCal, BC01P350_A2158AlbRecMtrU, BC01P350_A2156AlbRecKgmU, BC01P350_A2155AlbRecKgm, BC01P350_A2157AlbRecMtr
            }
            , new Object[] {
            }
            , new Object[] {
            BC01P352_A4795AlRPieCal, BC01P352_A323DevGenCod, BC01P352_A3067DevPieUni, BC01P352_A2158AlbRecMtrU, BC01P352_A2156AlbRecKgmU, BC01P352_A2155AlbRecKgm, BC01P352_A2157AlbRecMtr, BC01P352_A396EmprCod, BC01P352_A2159AlbRecPie, BC01P352_A44AlbRecCod
            }
            , new Object[] {
            BC01P353_A407EmprNom, BC01P353_n407EmprNom
            }
            , new Object[] {
            BC01P355_A3066AlbDevPUni, BC01P355_A5278AlbDevPPie
            }
            , new Object[] {
            BC01P356_A407EmprNom, BC01P356_n407EmprNom
            }
            , new Object[] {
            BC01P358_A3066AlbDevPUni, BC01P358_A5278AlbDevPPie
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV84Pgmname = "TDevPie2_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e121P32 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte s47AlbREst ;
   private byte O47AlbREst ;
   private byte A47AlbREst ;
   private byte Z6288DevGenDom ;
   private byte A6288DevGenDom ;
   private byte Z324DevGenEst ;
   private byte A324DevGenEst ;
   private byte Z1304DevUlin ;
   private byte A1304DevUlin ;
   private byte Z47AlbREst ;
   private byte Gxremove451 ;
   private byte Gx_BScreen ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
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
   private short AV81Insert_DevGenTrn ;
   private short Z326DevGenPie ;
   private short Z327DevGenTrn ;
   private short A327DevGenTrn ;
   private short Z5278AlbDevPPie ;
   private short RcdFound31 ;
   private short nIsDirty_31 ;
   private short nRcdExists_451 ;
   private short nIsDirty_451 ;
   private short i326DevGenPie ;
   private int trnEnded ;
   private int Z323DevGenCod ;
   private int A323DevGenCod ;
   private int s54AlbRPieUti ;
   private int O54AlbRPieUti ;
   private int A54AlbRPieUti ;
   private int sV9AlbRPieDis ;
   private int OV9AlbRPieDis ;
   private int AV9AlbRPieDis ;
   private int nGXsfl_451_idx=1 ;
   private int AV85GXV1 ;
   private int AV80Insert_AlbRecCod ;
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
   private int GXv_int6[] ;
   private int GXv_int7[] ;
   private int GXv_int9[] ;
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
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal Z3067DevPieUni ;
   private java.math.BigDecimal Z2155AlbRecKgm ;
   private java.math.BigDecimal Z2157AlbRecMtr ;
   private java.math.BigDecimal Z2158AlbRecMtrU ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal Z2156AlbRecKgmU ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal O3067DevPieUni ;
   private java.math.BigDecimal AV63oldUni ;
   private java.math.BigDecimal O2158AlbRecMtrU ;
   private java.math.BigDecimal O2156AlbRecKgmU ;
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
   private String AV84Pgmname ;
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
   private String GXv_char4[] ;
   private String AV13AlbRUni ;
   private String GXv_char3[] ;
   private String Z4795AlRPieCal ;
   private String A4795AlRPieCal ;
   private String Z2159AlbRecPie ;
   private String sMode451 ;
   private java.util.Date Z325DevGenFec ;
   private java.util.Date A325DevGenFec ;
   private boolean n326DevGenPie ;
   private boolean n328DevGenUni ;
   private boolean returnInSub ;
   private boolean n407EmprNom ;
   private boolean n325DevGenFec ;
   private boolean n6288DevGenDom ;
   private boolean n252CliCod ;
   private boolean n329DevTrnNom ;
   private boolean n324DevGenEst ;
   private boolean n1304DevUlin ;
   private boolean n44AlbRecCod ;
   private boolean n327DevGenTrn ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private com.genexus.webpanels.GXWindow AV83Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV79WebSession ;
   private app.SdtTDevPie2 bcTDevPie2 ;
   private IDataStoreProvider pr_default ;
   private String[] BC01P315_A407EmprNom ;
   private boolean[] BC01P315_n407EmprNom ;
   private int[] BC01P317_A323DevGenCod ;
   private int[] BC01P317_A54AlbRPieUti ;
   private byte[] BC01P317_A47AlbREst ;
   private String[] BC01P317_A407EmprNom ;
   private boolean[] BC01P317_n407EmprNom ;
   private java.util.Date[] BC01P317_A325DevGenFec ;
   private boolean[] BC01P317_n325DevGenFec ;
   private byte[] BC01P317_A6288DevGenDom ;
   private boolean[] BC01P317_n6288DevGenDom ;
   private int[] BC01P317_A252CliCod ;
   private boolean[] BC01P317_n252CliCod ;
   private String[] BC01P317_A279CliNom ;
   private String[] BC01P317_A45AlbRef ;
   private String[] BC01P317_A329DevTrnNom ;
   private boolean[] BC01P317_n329DevTrnNom ;
   private String[] BC01P317_A56AlbRUni ;
   private java.math.BigDecimal[] BC01P317_A328DevGenUni ;
   private boolean[] BC01P317_n328DevGenUni ;
   private short[] BC01P317_A326DevGenPie ;
   private boolean[] BC01P317_n326DevGenPie ;
   private java.math.BigDecimal[] BC01P317_A60AlbRUniUti ;
   private int[] BC01P317_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01P317_A58AlbRUniEnt ;
   private byte[] BC01P317_A324DevGenEst ;
   private boolean[] BC01P317_n324DevGenEst ;
   private byte[] BC01P317_A1304DevUlin ;
   private boolean[] BC01P317_n1304DevUlin ;
   private String[] BC01P317_A396EmprCod ;
   private int[] BC01P317_A44AlbRecCod ;
   private boolean[] BC01P317_n44AlbRecCod ;
   private short[] BC01P317_A327DevGenTrn ;
   private boolean[] BC01P317_n327DevGenTrn ;
   private java.math.BigDecimal[] BC01P317_A3066AlbDevPUni ;
   private short[] BC01P317_A5278AlbDevPPie ;
   private int[] BC01P318_A54AlbRPieUti ;
   private byte[] BC01P318_A47AlbREst ;
   private int[] BC01P318_A252CliCod ;
   private boolean[] BC01P318_n252CliCod ;
   private String[] BC01P318_A45AlbRef ;
   private String[] BC01P318_A56AlbRUni ;
   private java.math.BigDecimal[] BC01P318_A60AlbRUniUti ;
   private int[] BC01P318_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01P318_A58AlbRUniEnt ;
   private String[] BC01P319_A279CliNom ;
   private String[] BC01P320_A329DevTrnNom ;
   private boolean[] BC01P320_n329DevTrnNom ;
   private java.math.BigDecimal[] BC01P322_A3066AlbDevPUni ;
   private short[] BC01P322_A5278AlbDevPPie ;
   private String[] BC01P323_A396EmprCod ;
   private int[] BC01P323_A323DevGenCod ;
   private int[] BC01P324_A323DevGenCod ;
   private java.util.Date[] BC01P324_A325DevGenFec ;
   private boolean[] BC01P324_n325DevGenFec ;
   private byte[] BC01P324_A6288DevGenDom ;
   private boolean[] BC01P324_n6288DevGenDom ;
   private java.math.BigDecimal[] BC01P324_A328DevGenUni ;
   private boolean[] BC01P324_n328DevGenUni ;
   private short[] BC01P324_A326DevGenPie ;
   private boolean[] BC01P324_n326DevGenPie ;
   private byte[] BC01P324_A324DevGenEst ;
   private boolean[] BC01P324_n324DevGenEst ;
   private byte[] BC01P324_A1304DevUlin ;
   private boolean[] BC01P324_n1304DevUlin ;
   private String[] BC01P324_A396EmprCod ;
   private int[] BC01P324_A44AlbRecCod ;
   private boolean[] BC01P324_n44AlbRecCod ;
   private short[] BC01P324_A327DevGenTrn ;
   private boolean[] BC01P324_n327DevGenTrn ;
   private int[] BC01P325_A323DevGenCod ;
   private java.util.Date[] BC01P325_A325DevGenFec ;
   private boolean[] BC01P325_n325DevGenFec ;
   private byte[] BC01P325_A6288DevGenDom ;
   private boolean[] BC01P325_n6288DevGenDom ;
   private java.math.BigDecimal[] BC01P325_A328DevGenUni ;
   private boolean[] BC01P325_n328DevGenUni ;
   private short[] BC01P325_A326DevGenPie ;
   private boolean[] BC01P325_n326DevGenPie ;
   private byte[] BC01P325_A324DevGenEst ;
   private boolean[] BC01P325_n324DevGenEst ;
   private byte[] BC01P325_A1304DevUlin ;
   private boolean[] BC01P325_n1304DevUlin ;
   private String[] BC01P325_A396EmprCod ;
   private int[] BC01P325_A44AlbRecCod ;
   private boolean[] BC01P325_n44AlbRecCod ;
   private short[] BC01P325_A327DevGenTrn ;
   private boolean[] BC01P325_n327DevGenTrn ;
   private int[] BC01P326_A54AlbRPieUti ;
   private byte[] BC01P326_A47AlbREst ;
   private int[] BC01P326_A252CliCod ;
   private boolean[] BC01P326_n252CliCod ;
   private String[] BC01P326_A45AlbRef ;
   private String[] BC01P326_A56AlbRUni ;
   private java.math.BigDecimal[] BC01P326_A60AlbRUniUti ;
   private int[] BC01P326_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01P326_A58AlbRUniEnt ;
   private java.math.BigDecimal[] BC01P331_A3066AlbDevPUni ;
   private short[] BC01P331_A5278AlbDevPPie ;
   private int[] BC01P332_A54AlbRPieUti ;
   private byte[] BC01P332_A47AlbREst ;
   private int[] BC01P332_A252CliCod ;
   private boolean[] BC01P332_n252CliCod ;
   private String[] BC01P332_A45AlbRef ;
   private String[] BC01P332_A56AlbRUni ;
   private java.math.BigDecimal[] BC01P332_A60AlbRUniUti ;
   private int[] BC01P332_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01P332_A58AlbRUniEnt ;
   private String[] BC01P333_A279CliNom ;
   private String[] BC01P334_A329DevTrnNom ;
   private boolean[] BC01P334_n329DevTrnNom ;
   private String[] BC01P335_A396EmprCod ;
   private int[] BC01P335_A323DevGenCod ;
   private byte[] BC01P335_A1302DevLin ;
   private int[] BC01P340_A323DevGenCod ;
   private int[] BC01P340_A54AlbRPieUti ;
   private byte[] BC01P340_A47AlbREst ;
   private String[] BC01P340_A407EmprNom ;
   private boolean[] BC01P340_n407EmprNom ;
   private java.util.Date[] BC01P340_A325DevGenFec ;
   private boolean[] BC01P340_n325DevGenFec ;
   private byte[] BC01P340_A6288DevGenDom ;
   private boolean[] BC01P340_n6288DevGenDom ;
   private int[] BC01P340_A252CliCod ;
   private boolean[] BC01P340_n252CliCod ;
   private String[] BC01P340_A279CliNom ;
   private String[] BC01P340_A45AlbRef ;
   private String[] BC01P340_A329DevTrnNom ;
   private boolean[] BC01P340_n329DevTrnNom ;
   private String[] BC01P340_A56AlbRUni ;
   private java.math.BigDecimal[] BC01P340_A328DevGenUni ;
   private boolean[] BC01P340_n328DevGenUni ;
   private short[] BC01P340_A326DevGenPie ;
   private boolean[] BC01P340_n326DevGenPie ;
   private java.math.BigDecimal[] BC01P340_A60AlbRUniUti ;
   private int[] BC01P340_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01P340_A58AlbRUniEnt ;
   private byte[] BC01P340_A324DevGenEst ;
   private boolean[] BC01P340_n324DevGenEst ;
   private byte[] BC01P340_A1304DevUlin ;
   private boolean[] BC01P340_n1304DevUlin ;
   private String[] BC01P340_A396EmprCod ;
   private int[] BC01P340_A44AlbRecCod ;
   private boolean[] BC01P340_n44AlbRecCod ;
   private short[] BC01P340_A327DevGenTrn ;
   private boolean[] BC01P340_n327DevGenTrn ;
   private java.math.BigDecimal[] BC01P340_A3066AlbDevPUni ;
   private short[] BC01P340_A5278AlbDevPPie ;
   private String[] BC01P341_A4795AlRPieCal ;
   private int[] BC01P341_A323DevGenCod ;
   private java.math.BigDecimal[] BC01P341_A3067DevPieUni ;
   private java.math.BigDecimal[] BC01P341_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] BC01P341_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] BC01P341_A2155AlbRecKgm ;
   private java.math.BigDecimal[] BC01P341_A2157AlbRecMtr ;
   private String[] BC01P341_A396EmprCod ;
   private String[] BC01P341_A2159AlbRecPie ;
   private int[] BC01P341_A44AlbRecCod ;
   private boolean[] BC01P341_n44AlbRecCod ;
   private String[] BC01P342_A4795AlRPieCal ;
   private java.math.BigDecimal[] BC01P342_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] BC01P342_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] BC01P342_A2155AlbRecKgm ;
   private java.math.BigDecimal[] BC01P342_A2157AlbRecMtr ;
   private int[] BC01P342_A44AlbRecCod ;
   private boolean[] BC01P342_n44AlbRecCod ;
   private String[] BC01P343_A396EmprCod ;
   private int[] BC01P343_A323DevGenCod ;
   private String[] BC01P343_A2159AlbRecPie ;
   private int[] BC01P344_A323DevGenCod ;
   private java.math.BigDecimal[] BC01P344_A3067DevPieUni ;
   private String[] BC01P344_A396EmprCod ;
   private String[] BC01P344_A2159AlbRecPie ;
   private int[] BC01P345_A323DevGenCod ;
   private java.math.BigDecimal[] BC01P345_A3067DevPieUni ;
   private String[] BC01P345_A396EmprCod ;
   private String[] BC01P345_A2159AlbRecPie ;
   private String[] BC01P346_A4795AlRPieCal ;
   private java.math.BigDecimal[] BC01P346_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] BC01P346_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] BC01P346_A2155AlbRecKgm ;
   private java.math.BigDecimal[] BC01P346_A2157AlbRecMtr ;
   private int[] BC01P346_A44AlbRecCod ;
   private boolean[] BC01P346_n44AlbRecCod ;
   private String[] BC01P350_A4795AlRPieCal ;
   private java.math.BigDecimal[] BC01P350_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] BC01P350_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] BC01P350_A2155AlbRecKgm ;
   private java.math.BigDecimal[] BC01P350_A2157AlbRecMtr ;
   private String[] BC01P352_A4795AlRPieCal ;
   private int[] BC01P352_A323DevGenCod ;
   private java.math.BigDecimal[] BC01P352_A3067DevPieUni ;
   private java.math.BigDecimal[] BC01P352_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] BC01P352_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] BC01P352_A2155AlbRecKgm ;
   private java.math.BigDecimal[] BC01P352_A2157AlbRecMtr ;
   private String[] BC01P352_A396EmprCod ;
   private String[] BC01P352_A2159AlbRecPie ;
   private int[] BC01P352_A44AlbRecCod ;
   private boolean[] BC01P352_n44AlbRecCod ;
   private String[] BC01P353_A407EmprNom ;
   private boolean[] BC01P353_n407EmprNom ;
   private java.math.BigDecimal[] BC01P355_A3066AlbDevPUni ;
   private short[] BC01P355_A5278AlbDevPPie ;
   private String[] BC01P356_A407EmprNom ;
   private boolean[] BC01P356_n407EmprNom ;
   private java.math.BigDecimal[] BC01P358_A3066AlbDevPUni ;
   private short[] BC01P358_A5278AlbDevPPie ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private int[] BC01P32_A323DevGenCod ;
   private java.math.BigDecimal[] BC01P32_A3067DevPieUni ;
   private String[] BC01P32_A396EmprCod ;
   private String[] BC01P32_A2159AlbRecPie ;
   private int[] BC01P33_A323DevGenCod ;
   private java.math.BigDecimal[] BC01P33_A3067DevPieUni ;
   private String[] BC01P33_A396EmprCod ;
   private String[] BC01P33_A2159AlbRecPie ;
   private String[] BC01P34_A4795AlRPieCal ;
   private java.math.BigDecimal[] BC01P34_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] BC01P34_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] BC01P34_A2155AlbRecKgm ;
   private java.math.BigDecimal[] BC01P34_A2157AlbRecMtr ;
   private int[] BC01P34_A44AlbRecCod ;
   private String[] BC01P35_A4795AlRPieCal ;
   private java.math.BigDecimal[] BC01P35_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] BC01P35_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] BC01P35_A2155AlbRecKgm ;
   private java.math.BigDecimal[] BC01P35_A2157AlbRecMtr ;
   private int[] BC01P35_A44AlbRecCod ;
   private int[] BC01P36_A323DevGenCod ;
   private java.util.Date[] BC01P36_A325DevGenFec ;
   private byte[] BC01P36_A6288DevGenDom ;
   private java.math.BigDecimal[] BC01P36_A328DevGenUni ;
   private short[] BC01P36_A326DevGenPie ;
   private byte[] BC01P36_A324DevGenEst ;
   private byte[] BC01P36_A1304DevUlin ;
   private String[] BC01P36_A396EmprCod ;
   private int[] BC01P36_A44AlbRecCod ;
   private short[] BC01P36_A327DevGenTrn ;
   private int[] BC01P36_A252CliCod ;
   private int[] BC01P37_A323DevGenCod ;
   private java.util.Date[] BC01P37_A325DevGenFec ;
   private byte[] BC01P37_A6288DevGenDom ;
   private java.math.BigDecimal[] BC01P37_A328DevGenUni ;
   private short[] BC01P37_A326DevGenPie ;
   private byte[] BC01P37_A324DevGenEst ;
   private byte[] BC01P37_A1304DevUlin ;
   private String[] BC01P37_A396EmprCod ;
   private int[] BC01P37_A44AlbRecCod ;
   private short[] BC01P37_A327DevGenTrn ;
   private int[] BC01P37_A252CliCod ;
   private String[] BC01P38_A407EmprNom ;
   private int[] BC01P39_A54AlbRPieUti ;
   private byte[] BC01P39_A47AlbREst ;
   private int[] BC01P39_A252CliCod ;
   private String[] BC01P39_A45AlbRef ;
   private String[] BC01P39_A56AlbRUni ;
   private java.math.BigDecimal[] BC01P39_A60AlbRUniUti ;
   private int[] BC01P39_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01P39_A58AlbRUniEnt ;
   private int[] BC01P310_A54AlbRPieUti ;
   private byte[] BC01P310_A47AlbREst ;
   private int[] BC01P310_A252CliCod ;
   private String[] BC01P310_A45AlbRef ;
   private String[] BC01P310_A56AlbRUni ;
   private java.math.BigDecimal[] BC01P310_A60AlbRUniUti ;
   private int[] BC01P310_A52AlbRPieEnt ;
   private java.math.BigDecimal[] BC01P310_A58AlbRUniEnt ;
   private String[] BC01P311_A279CliNom ;
   private String[] BC01P312_A329DevTrnNom ;
   private java.math.BigDecimal[] BC01P314_A3066AlbDevPUni ;
   private short[] BC01P314_A5278AlbDevPPie ;
   private boolean[] BC01P36_n325DevGenFec ;
   private boolean[] BC01P36_n6288DevGenDom ;
   private boolean[] BC01P36_n328DevGenUni ;
   private boolean[] BC01P36_n326DevGenPie ;
   private boolean[] BC01P36_n324DevGenEst ;
   private boolean[] BC01P36_n1304DevUlin ;
   private boolean[] BC01P36_n44AlbRecCod ;
   private boolean[] BC01P36_n327DevGenTrn ;
   private boolean[] BC01P36_n252CliCod ;
   private boolean[] BC01P37_n325DevGenFec ;
   private boolean[] BC01P37_n6288DevGenDom ;
   private boolean[] BC01P37_n328DevGenUni ;
   private boolean[] BC01P37_n326DevGenPie ;
   private boolean[] BC01P37_n324DevGenEst ;
   private boolean[] BC01P37_n1304DevUlin ;
   private boolean[] BC01P37_n44AlbRecCod ;
   private boolean[] BC01P37_n327DevGenTrn ;
   private boolean[] BC01P37_n252CliCod ;
   private boolean[] BC01P38_n407EmprNom ;
   private boolean[] BC01P312_n329DevTrnNom ;
   private app.wwpbaseobjects.SdtWWPContext AV77WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV78TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV82TrnContextAtt ;
}

final  class tdevpie2_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpie2_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpie2_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpie2_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpie2_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01P32", "SELECT DevGenCod, DevPieUni, EmprCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ?  FOR UPDATE OF DevPieUni NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P33", "SELECT DevGenCod, DevPieUni, EmprCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P34", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?  FOR UPDATE OF AlbRecMtrU, AlbRecKgmU NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P35", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P36", "SELECT DevGenCod, DevGenFec, DevGenDom, DevGenUni, DevGenPie, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, CliCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ?  FOR UPDATE OF DevGenFec, DevGenDom, DevGenUni, DevGenPie, DevGenEst, DevUlin, AlbRecCod, DevGenTrn, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P37", "SELECT DevGenCod, DevGenFec, DevGenDom, DevGenUni, DevGenPie, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, CliCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P38", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P39", "SELECT AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRUniUti, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRPieUti, AlbREst, AlbRUniUti NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P310", "SELECT AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRUniUti, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P311", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P312", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P314", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P315", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P317", "SELECT /*+ FIRST_ROWS(100) */ TM1.DevGenCod, T4.AlbRPieUti, T4.AlbREst, T2.EmprNom, TM1.DevGenFec, TM1.DevGenDom, TM1.CliCod, T5.CliNom, T4.AlbRef, T6.TrnNom AS DevTrnNom, T4.AlbRUni, TM1.DevGenUni, TM1.DevGenPie, T4.AlbRUniUti, T4.AlbRPieEnt, T4.AlbRUniEnt, TM1.DevGenEst, TM1.DevUlin, TM1.EmprCod, TM1.AlbRecCod, TM1.DevGenTrn AS DevGenTrn, COALESCE( T3.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T3.AlbDevPPie, 0) AS AlbDevPPie FROM (((((TXPDEVGEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.DevGenCod = TM1.DevGenCod) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = TM1.EmprCod AND T4.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = TM1.DevGenTrn) WHERE TM1.EmprCod = ? and TM1.DevGenCod = ? ORDER BY TM1.EmprCod, TM1.DevGenCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P318", "SELECT AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRUniUti, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P319", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P320", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P322", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P323", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P324", "SELECT DevGenCod, DevGenFec, DevGenDom, DevGenUni, DevGenPie, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P325", "SELECT DevGenCod, DevGenFec, DevGenDom, DevGenUni, DevGenPie, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ?  FOR UPDATE OF DevGenFec, DevGenDom, DevGenUni, DevGenPie, DevGenEst, DevUlin, AlbRecCod, DevGenTrn, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P326", "SELECT AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRUniUti, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRPieUti, AlbREst, AlbRUniUti NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01P327", "INSERT INTO TXPDEVGEN(CliCod, DevGenCod, DevGenFec, DevGenDom, DevGenUni, DevGenPie, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, EmprTrn, DevMatric, DevHorSal, DevFmd, DevFmdD, DevFHh, DevGrossT, DevStt, DevDiscli, DevMdl, DevEnvAT, DevATCodeI, DevGenAT, DevAlbRecC, DevGenATCU, DevGenSerA, DevGenTipA) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ')", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("BC01P328", "UPDATE TXPDEVGEN SET CliCod=?, DevGenFec=?, DevGenDom=?, DevGenUni=?, DevGenPie=?, DevGenEst=?, DevUlin=?, AlbRecCod=?, DevGenTrn=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("BC01P329", "DELETE FROM TXPDEVGEN  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new ForEachCursor("BC01P331", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P332", "SELECT AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRUniUti, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P333", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P334", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P335", "SELECT * FROM (SELECT EmprCod, DevGenCod, DevLin FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("BC01P336", "UPDATE TXPDEVGEN SET DevGenPie=?, DevGenUni=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("BC01P337", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("BC01P338", "UPDATE TXPALBREC SET AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("BC01P340", "SELECT /*+ FIRST_ROWS(100) */ TM1.DevGenCod, T4.AlbRPieUti, T4.AlbREst, T2.EmprNom, TM1.DevGenFec, TM1.DevGenDom, TM1.CliCod, T5.CliNom, T4.AlbRef, T6.TrnNom AS DevTrnNom, T4.AlbRUni, TM1.DevGenUni, TM1.DevGenPie, T4.AlbRUniUti, T4.AlbRPieEnt, T4.AlbRUniEnt, TM1.DevGenEst, TM1.DevUlin, TM1.EmprCod, TM1.AlbRecCod, TM1.DevGenTrn AS DevGenTrn, COALESCE( T3.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T3.AlbDevPPie, 0) AS AlbDevPPie FROM (((((TXPDEVGEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.DevGenCod = TM1.DevGenCod) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = TM1.EmprCod AND T4.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = TM1.DevGenTrn) WHERE TM1.EmprCod = ? and TM1.DevGenCod = ? ORDER BY TM1.EmprCod, TM1.DevGenCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P341", "SELECT /*+ FIRST_ROWS(11) */ T2.AlRPieCal, T1.DevGenCod, T1.DevPieUni, T2.AlbRecMtrU, T2.AlbRecKgmU, T2.AlbRecKgm, T2.AlbRecMtr, T1.EmprCod, T1.AlbRecPie, T2.AlbRecCod FROM (TXPDevPie T1 LEFT JOIN TXPALBDET T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = ? AND T2.AlbRecPie = T1.AlbRecPie) WHERE T1.DevGenCod = ? and T1.EmprCod = ? and T1.AlbRecPie = ? ORDER BY T1.EmprCod, T1.DevGenCod, T1.AlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P342", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P343", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P344", "SELECT DevGenCod, DevPieUni, EmprCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P345", "SELECT DevGenCod, DevPieUni, EmprCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ?  FOR UPDATE OF DevPieUni NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P346", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?  FOR UPDATE OF AlbRecMtrU, AlbRecKgmU NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01P347", "INSERT INTO TXPDevPie(DevGenCod, DevPieUni, EmprCod, AlbRecPie) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPDevPie")
         ,new UpdateCursor("BC01P348", "UPDATE TXPDevPie SET DevPieUni=?  WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPDevPie")
         ,new UpdateCursor("BC01P349", "DELETE FROM TXPDevPie  WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPDevPie")
         ,new ForEachCursor("BC01P350", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01P351", "UPDATE TXPALBDET SET AlbRecMtrU=?, AlbRecKgmU=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPALBDET")
         ,new ForEachCursor("BC01P352", "SELECT /*+ FIRST_ROWS(11) */ T2.AlRPieCal, T1.DevGenCod, T1.DevPieUni, T2.AlbRecMtrU, T2.AlbRecKgmU, T2.AlbRecKgm, T2.AlbRecMtr, T1.EmprCod, T1.AlbRecPie, T2.AlbRecCod FROM (TXPDevPie T1 LEFT JOIN TXPALBDET T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = ? AND T2.AlbRecPie = T1.AlbRecPie) WHERE T1.DevGenCod = ? and T1.EmprCod = ? ORDER BY T1.EmprCod, T1.DevGenCod, T1.AlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P353", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P355", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P356", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01P358", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
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
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
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
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 30);
               ((String[]) buf[12])[0] = rslt.getString(9, 16);
               ((String[]) buf[13])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,2);
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
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
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
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
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
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 25 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 26 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 33 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 30);
               ((String[]) buf[12])[0] = rslt.getString(9, 16);
               ((String[]) buf[13])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,2);
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
            case 34 :
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
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 37 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 38 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 45 :
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
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 47 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 49 :
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
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 2 :
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
            case 3 :
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
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
            case 15 :
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
            case 16 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
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
            case 22 :
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
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
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
            case 23 :
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
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
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
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
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
            case 27 :
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
            case 28 :
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
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
            case 31 :
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
            case 32 :
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
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 34 :
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
            case 35 :
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
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
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
            case 40 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 41 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 43 :
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
            case 44 :
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
            case 45 :
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
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

