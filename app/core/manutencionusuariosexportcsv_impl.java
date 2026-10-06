package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class manutencionusuariosexportcsv_impl extends GXWebProcedure
{
   public manutencionusuariosexportcsv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S191 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S181 ();
      if ( returnInSub )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV13Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "ManutencionUsuariosExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
      AV10TextFile.setSource( AV11Filename );
      AV10TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV14TextFileLine = "" ;
      if ( GXutil.strcmp(AV19Session.getValue("Core.ManutencionUsuariosColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("Core.ManutencionUsuariosColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "UUID", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "E-Mail", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Printer", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Sockt", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV46Core_manutencionusuariosds_1_filterfulltext = AV30FilterFullText ;
      AV47Core_manutencionusuariosds_2_tfusurnom = AV34TFUsurNom ;
      AV48Core_manutencionusuariosds_3_tfusurnom_sel = AV35TFUsurNom_Sel ;
      AV49Core_manutencionusuariosds_4_tfusumail = AV37TFUsuMail ;
      AV50Core_manutencionusuariosds_5_tfusumail_sel = AV38TFUsuMail_Sel ;
      AV51Core_manutencionusuariosds_6_tfusurprint = AV39TFUsurPrint ;
      AV52Core_manutencionusuariosds_7_tfusurprint_sel = AV40TFUsurPrint_Sel ;
      AV53Core_manutencionusuariosds_8_tfusursockt = AV41TFUsurSockt ;
      AV54Core_manutencionusuariosds_9_tfusursockt_sel = AV42TFUsurSockt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV46Core_manutencionusuariosds_1_filterfulltext ,
                                           AV48Core_manutencionusuariosds_3_tfusurnom_sel ,
                                           AV47Core_manutencionusuariosds_2_tfusurnom ,
                                           AV50Core_manutencionusuariosds_5_tfusumail_sel ,
                                           AV49Core_manutencionusuariosds_4_tfusumail ,
                                           AV52Core_manutencionusuariosds_7_tfusurprint_sel ,
                                           AV51Core_manutencionusuariosds_6_tfusurprint ,
                                           AV54Core_manutencionusuariosds_9_tfusursockt_sel ,
                                           AV53Core_manutencionusuariosds_8_tfusursockt ,
                                           A854UsurNom ,
                                           A10513UsuMail ,
                                           A14415UsurPrint ,
                                           A14487UsurSockt ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV46Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV46Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV46Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV46Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV46Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV46Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV46Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV46Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV47Core_manutencionusuariosds_2_tfusurnom = GXutil.padr( GXutil.rtrim( AV47Core_manutencionusuariosds_2_tfusurnom), 35, "%") ;
      lV49Core_manutencionusuariosds_4_tfusumail = GXutil.padr( GXutil.rtrim( AV49Core_manutencionusuariosds_4_tfusumail), 40, "%") ;
      lV51Core_manutencionusuariosds_6_tfusurprint = GXutil.concat( GXutil.rtrim( AV51Core_manutencionusuariosds_6_tfusurprint), "%", "") ;
      lV53Core_manutencionusuariosds_8_tfusursockt = GXutil.concat( GXutil.rtrim( AV53Core_manutencionusuariosds_8_tfusursockt), "%", "") ;
      /* Using cursor P0ANC2 */
      pr_default.execute(0, new Object[] {lV46Core_manutencionusuariosds_1_filterfulltext, lV46Core_manutencionusuariosds_1_filterfulltext, lV46Core_manutencionusuariosds_1_filterfulltext, lV46Core_manutencionusuariosds_1_filterfulltext, lV47Core_manutencionusuariosds_2_tfusurnom, AV48Core_manutencionusuariosds_3_tfusurnom_sel, lV49Core_manutencionusuariosds_4_tfusumail, AV50Core_manutencionusuariosds_5_tfusumail_sel, lV51Core_manutencionusuariosds_6_tfusurprint, AV52Core_manutencionusuariosds_7_tfusurprint_sel, lV53Core_manutencionusuariosds_8_tfusursockt, AV54Core_manutencionusuariosds_9_tfusursockt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14487UsurSockt = P0ANC2_A14487UsurSockt[0] ;
         n14487UsurSockt = P0ANC2_n14487UsurSockt[0] ;
         A14415UsurPrint = P0ANC2_A14415UsurPrint[0] ;
         n14415UsurPrint = P0ANC2_n14415UsurPrint[0] ;
         A10513UsuMail = P0ANC2_A10513UsuMail[0] ;
         A854UsurNom = P0ANC2_A854UsurNom[0] ;
         n854UsurNom = P0ANC2_n854UsurNom[0] ;
         A14371UsurGuid = P0ANC2_A14371UsurGuid[0] ;
         n14371UsurGuid = P0ANC2_n14371UsurGuid[0] ;
         A850UsurCod = P0ANC2_A850UsurCod[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += A14371UsurGuid.toString() ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A854UsurNom, ";", ","), GXv_char3) ;
            manutencionusuariosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A10513UsuMail, ";", ","), GXv_char3) ;
            manutencionusuariosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14415UsurPrint, ";", ","), GXv_char3) ;
            manutencionusuariosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14487UsurSockt, ";", ","), GXv_char3) ;
            manutencionusuariosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.len( AV14TextFileLine) > 0 )
         {
            AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV10TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ManutencionUsuariosExportCSV.csv");
         }
         AV27HttpResponse.addFile(AV10TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10TextFile.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10TextFile.getErrDescription() ;
         AV10TextFile.close();
         AV27HttpResponse.addString(AV12ErrorMessage);
         httpContext.nUserReturn = (byte)(1) ;
         if ( httpContext.willRedirect( ) )
         {
            httpContext.redirect( httpContext.wjLoc );
            httpContext.wjLoc = "" ;
         }
         returnInSub = true;
         if (true) return;
      }
   }

   public void S141( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV15ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "UsurGuid", "", "UUID", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "UsurNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "UsuMail", "", "E-Mail", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "UsurPrint", "", "Printer", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "UsurSockt", "", "Sockt", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Core.ManutencionUsuariosColumnsSelector", GXv_char3) ;
      manutencionusuariosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, GXv_SdtWWPColumnsSelector5) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector4[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("Core.ManutencionUsuariosGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Core.ManutencionUsuariosGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("Core.ManutencionUsuariosGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV55GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURNOM") == 0 )
         {
            AV34TFUsurNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURNOM_SEL") == 0 )
         {
            AV35TFUsurNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSUMAIL") == 0 )
         {
            AV37TFUsuMail = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSUMAIL_SEL") == 0 )
         {
            AV38TFUsuMail_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURPRINT") == 0 )
         {
            AV39TFUsurPrint = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURPRINT_SEL") == 0 )
         {
            AV40TFUsurPrint_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURSOCKT") == 0 )
         {
            AV41TFUsurSockt = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURSOCKT_SEL") == 0 )
         {
            AV42TFUsurSockt_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void S162( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S172( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A14371UsurGuid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A854UsurNom = "" ;
      A10513UsuMail = "" ;
      A14415UsurPrint = "" ;
      A14487UsurSockt = "" ;
      AV46Core_manutencionusuariosds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV47Core_manutencionusuariosds_2_tfusurnom = "" ;
      AV34TFUsurNom = "" ;
      AV48Core_manutencionusuariosds_3_tfusurnom_sel = "" ;
      AV35TFUsurNom_Sel = "" ;
      AV49Core_manutencionusuariosds_4_tfusumail = "" ;
      AV37TFUsuMail = "" ;
      AV50Core_manutencionusuariosds_5_tfusumail_sel = "" ;
      AV38TFUsuMail_Sel = "" ;
      AV51Core_manutencionusuariosds_6_tfusurprint = "" ;
      AV39TFUsurPrint = "" ;
      AV52Core_manutencionusuariosds_7_tfusurprint_sel = "" ;
      AV40TFUsurPrint_Sel = "" ;
      AV53Core_manutencionusuariosds_8_tfusursockt = "" ;
      AV41TFUsurSockt = "" ;
      AV54Core_manutencionusuariosds_9_tfusursockt_sel = "" ;
      AV42TFUsurSockt_Sel = "" ;
      scmdbuf = "" ;
      lV46Core_manutencionusuariosds_1_filterfulltext = "" ;
      lV47Core_manutencionusuariosds_2_tfusurnom = "" ;
      lV49Core_manutencionusuariosds_4_tfusumail = "" ;
      lV51Core_manutencionusuariosds_6_tfusurprint = "" ;
      lV53Core_manutencionusuariosds_8_tfusursockt = "" ;
      P0ANC2_A14487UsurSockt = new String[] {""} ;
      P0ANC2_n14487UsurSockt = new boolean[] {false} ;
      P0ANC2_A14415UsurPrint = new String[] {""} ;
      P0ANC2_n14415UsurPrint = new boolean[] {false} ;
      P0ANC2_A10513UsuMail = new String[] {""} ;
      P0ANC2_A854UsurNom = new String[] {""} ;
      P0ANC2_n854UsurNom = new boolean[] {false} ;
      P0ANC2_A14371UsurGuid = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0ANC2_n14371UsurGuid = new boolean[] {false} ;
      P0ANC2_A850UsurCod = new String[] {""} ;
      A850UsurCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.manutencionusuariosexportcsv__default(),
         new Object[] {
             new Object[] {
            P0ANC2_A14487UsurSockt, P0ANC2_n14487UsurSockt, P0ANC2_A14415UsurPrint, P0ANC2_n14415UsurPrint, P0ANC2_A10513UsuMail, P0ANC2_A854UsurNom, P0ANC2_n854UsurNom, P0ANC2_A14371UsurGuid, P0ANC2_n14371UsurGuid, P0ANC2_A850UsurCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV55GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A854UsurNom ;
   private String A10513UsuMail ;
   private String AV47Core_manutencionusuariosds_2_tfusurnom ;
   private String AV34TFUsurNom ;
   private String AV48Core_manutencionusuariosds_3_tfusurnom_sel ;
   private String AV35TFUsurNom_Sel ;
   private String AV49Core_manutencionusuariosds_4_tfusumail ;
   private String AV37TFUsuMail ;
   private String AV50Core_manutencionusuariosds_5_tfusumail_sel ;
   private String AV38TFUsuMail_Sel ;
   private String scmdbuf ;
   private String lV47Core_manutencionusuariosds_2_tfusurnom ;
   private String lV49Core_manutencionusuariosds_4_tfusumail ;
   private String A850UsurCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n14487UsurSockt ;
   private boolean n14415UsurPrint ;
   private boolean n854UsurNom ;
   private boolean n14371UsurGuid ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String A14415UsurPrint ;
   private String A14487UsurSockt ;
   private String AV46Core_manutencionusuariosds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV51Core_manutencionusuariosds_6_tfusurprint ;
   private String AV39TFUsurPrint ;
   private String AV52Core_manutencionusuariosds_7_tfusurprint_sel ;
   private String AV40TFUsurPrint_Sel ;
   private String AV53Core_manutencionusuariosds_8_tfusursockt ;
   private String AV41TFUsurSockt ;
   private String AV54Core_manutencionusuariosds_9_tfusursockt_sel ;
   private String AV42TFUsurSockt_Sel ;
   private String lV46Core_manutencionusuariosds_1_filterfulltext ;
   private String lV51Core_manutencionusuariosds_6_tfusurprint ;
   private String lV53Core_manutencionusuariosds_8_tfusursockt ;
   private String AV12ErrorMessage ;
   private java.util.UUID A14371UsurGuid ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P0ANC2_A14487UsurSockt ;
   private boolean[] P0ANC2_n14487UsurSockt ;
   private String[] P0ANC2_A14415UsurPrint ;
   private boolean[] P0ANC2_n14415UsurPrint ;
   private String[] P0ANC2_A10513UsuMail ;
   private String[] P0ANC2_A854UsurNom ;
   private boolean[] P0ANC2_n854UsurNom ;
   private java.util.UUID[] P0ANC2_A14371UsurGuid ;
   private boolean[] P0ANC2_n14371UsurGuid ;
   private String[] P0ANC2_A850UsurCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class manutencionusuariosexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ANC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV46Core_manutencionusuariosds_1_filterfulltext ,
                                          String AV48Core_manutencionusuariosds_3_tfusurnom_sel ,
                                          String AV47Core_manutencionusuariosds_2_tfusurnom ,
                                          String AV50Core_manutencionusuariosds_5_tfusumail_sel ,
                                          String AV49Core_manutencionusuariosds_4_tfusumail ,
                                          String AV52Core_manutencionusuariosds_7_tfusurprint_sel ,
                                          String AV51Core_manutencionusuariosds_6_tfusurprint ,
                                          String AV54Core_manutencionusuariosds_9_tfusursockt_sel ,
                                          String AV53Core_manutencionusuariosds_8_tfusursockt ,
                                          String A854UsurNom ,
                                          String A10513UsuMail ,
                                          String A14415UsurPrint ,
                                          String A14487UsurSockt ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[12];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT UsurSockt, UsurPrint, UsuMail, UsurNom, UsurGuid, UsurCod FROM TXPUSUARI" ;
      if ( ! (GXutil.strcmp("", AV46Core_manutencionusuariosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(UsurNom) like '%' || UPPER(?)) or ( UPPER(UsuMail) like '%' || UPPER(?)) or ( UPPER(UsurPrint) like '%' || UPPER(?)) or ( UPPER(UsurSockt) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Core_manutencionusuariosds_3_tfusurnom_sel)==0) && ( ! (GXutil.strcmp("", AV47Core_manutencionusuariosds_2_tfusurnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Core_manutencionusuariosds_3_tfusurnom_sel)==0) )
      {
         addWhere(sWhereString, "(UsurNom = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Core_manutencionusuariosds_5_tfusumail_sel)==0) && ( ! (GXutil.strcmp("", AV49Core_manutencionusuariosds_4_tfusumail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsuMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Core_manutencionusuariosds_5_tfusumail_sel)==0) )
      {
         addWhere(sWhereString, "(UsuMail = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Core_manutencionusuariosds_7_tfusurprint_sel)==0) && ( ! (GXutil.strcmp("", AV51Core_manutencionusuariosds_6_tfusurprint)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurPrint) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Core_manutencionusuariosds_7_tfusurprint_sel)==0) )
      {
         addWhere(sWhereString, "(UsurPrint = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Core_manutencionusuariosds_9_tfusursockt_sel)==0) && ( ! (GXutil.strcmp("", AV53Core_manutencionusuariosds_8_tfusursockt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurSockt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Core_manutencionusuariosds_9_tfusursockt_sel)==0) )
      {
         addWhere(sWhereString, "(UsurSockt = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY UsurNom" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY UsurNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY UsurGuid" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY UsurGuid DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY UsuMail" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY UsuMail DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY UsurPrint" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY UsurPrint DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY UsurSockt" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY UsurSockt DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P0ANC2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ANC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 40);
               ((String[]) buf[5])[0] = rslt.getString(4, 35);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[7])[0] = rslt.getGUID(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 8);
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
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 35);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 35);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 40);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 150);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 150);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               return;
      }
   }

}

