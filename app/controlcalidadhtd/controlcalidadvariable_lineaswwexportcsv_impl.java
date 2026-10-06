package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlcalidadvariable_lineaswwexportcsv_impl extends GXWebProcedure
{
   public controlcalidadvariable_lineaswwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ControlCalidadVariable_lineasWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ControlCalidadHTD.ControlCalidadVariable_lineasWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ControlCalidadHTD.ControlCalidadVariable_lineasWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Empresa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción del Test", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "# Lín", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "# Lín", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Valor", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = AV30FilterFullText ;
      AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = AV34TFEmprCod ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel = AV35TFEmprCod_Sel ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = AV36TFEmprNom ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel = AV37TFEmprNom_Sel ;
      AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod = AV38TFCCTCod ;
      AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to = AV39TFCCTCod_To ;
      AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = AV40TFCCTDsc ;
      AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel = AV41TFCCTDsc_Sel ;
      AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin = AV42TFCCTLin ;
      AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to = AV43TFCCTLin_To ;
      AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin = AV44TFCCTValLin ;
      AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to = AV45TFCCTValLin_To ;
      AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = AV46TFCCTValDsc ;
      AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel = AV47TFCCTValDsc_Sel ;
      AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = AV48TFCCTVal ;
      AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel = AV49TFCCTVal_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ,
                                           AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ,
                                           AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ,
                                           AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ,
                                           AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ,
                                           Integer.valueOf(AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod) ,
                                           Integer.valueOf(AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to) ,
                                           AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ,
                                           AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ,
                                           Short.valueOf(AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin) ,
                                           Short.valueOf(AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to) ,
                                           Byte.valueOf(AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin) ,
                                           Byte.valueOf(AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to) ,
                                           AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ,
                                           AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ,
                                           AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ,
                                           AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           A4036CCTDsc ,
                                           Short.valueOf(A4034CCTLin) ,
                                           Byte.valueOf(A4049CCTValLin) ,
                                           A4050CCTValDsc ,
                                           A4051CCTVal ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext), "%", "") ;
      lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod), 3, "%") ;
      lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom), 30, "%") ;
      lV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = GXutil.padr( GXutil.rtrim( AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc), 30, "%") ;
      lV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = GXutil.padr( GXutil.rtrim( AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc), 30, "%") ;
      lV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = GXutil.padr( GXutil.rtrim( AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval), 40, "%") ;
      /* Using cursor P0AB82 */
      pr_default.execute(0, new Object[] {lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext, lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod, AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel, lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom, AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel, Integer.valueOf(AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod), Integer.valueOf(AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to), lV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc, AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel, Short.valueOf(AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin), Short.valueOf(AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to), Byte.valueOf(AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin), Byte.valueOf(AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to), lV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc, AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel, lV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval, AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4051CCTVal = P0AB82_A4051CCTVal[0] ;
         A4050CCTValDsc = P0AB82_A4050CCTValDsc[0] ;
         A4049CCTValLin = P0AB82_A4049CCTValLin[0] ;
         A4034CCTLin = P0AB82_A4034CCTLin[0] ;
         A4036CCTDsc = P0AB82_A4036CCTDsc[0] ;
         A4031CCTCod = P0AB82_A4031CCTCod[0] ;
         A407EmprNom = P0AB82_A407EmprNom[0] ;
         n407EmprNom = P0AB82_n407EmprNom[0] ;
         A396EmprCod = P0AB82_A396EmprCod[0] ;
         A407EmprNom = P0AB82_A407EmprNom[0] ;
         n407EmprNom = P0AB82_n407EmprNom[0] ;
         A4036CCTDsc = P0AB82_A4036CCTDsc[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A396EmprCod, ";", ","), GXv_char3) ;
            controlcalidadvariable_lineaswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A407EmprNom, ";", ","), GXv_char3) ;
            controlcalidadvariable_lineaswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4031CCTCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4036CCTDsc, ";", ","), GXv_char3) ;
            controlcalidadvariable_lineaswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4034CCTLin, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4049CCTValLin, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4050CCTValDsc, ";", ","), GXv_char3) ;
            controlcalidadvariable_lineaswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4051CCTVal, ";", ","), GXv_char3) ;
            controlcalidadvariable_lineaswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ControlCalidadVariable_lineasWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprCod", "", "Código Empresa", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCTCod", "", "Código", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCTDsc", "", "Descripción del Test", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCTLin", "", "# Lín", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCTValLin", "", "# Lín", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCTValDsc", "", "Descripción", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCTVal", "", "Valor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ControlCalidadHTD.ControlCalidadVariable_lineasWWColumnsSelector", GXv_char3) ;
      controlcalidadvariable_lineaswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ControlCalidadHTD.ControlCalidadVariable_lineasWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.ControlCalidadVariable_lineasWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("ControlCalidadHTD.ControlCalidadVariable_lineasWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV70GXV1 = 1 ;
      while ( AV70GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV70GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV34TFEmprCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV35TFEmprCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV36TFEmprNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV37TFEmprNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTCOD") == 0 )
         {
            AV38TFCCTCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFCCTCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC") == 0 )
         {
            AV40TFCCTDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC_SEL") == 0 )
         {
            AV41TFCCTDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLIN") == 0 )
         {
            AV42TFCCTLin = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFCCTLin_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALLIN") == 0 )
         {
            AV44TFCCTValLin = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFCCTValLin_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALDSC") == 0 )
         {
            AV46TFCCTValDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVALDSC_SEL") == 0 )
         {
            AV47TFCCTValDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVAL") == 0 )
         {
            AV48TFCCTVal = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTVAL_SEL") == 0 )
         {
            AV49TFCCTVal_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV70GXV1 = (int)(AV70GXV1+1) ;
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
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A4036CCTDsc = "" ;
      A4050CCTValDsc = "" ;
      A4051CCTVal = "" ;
      AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = "" ;
      AV34TFEmprCod = "" ;
      AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel = "" ;
      AV35TFEmprCod_Sel = "" ;
      AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = "" ;
      AV36TFEmprNom = "" ;
      AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel = "" ;
      AV37TFEmprNom_Sel = "" ;
      AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = "" ;
      AV40TFCCTDsc = "" ;
      AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel = "" ;
      AV41TFCCTDsc_Sel = "" ;
      AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = "" ;
      AV46TFCCTValDsc = "" ;
      AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel = "" ;
      AV47TFCCTValDsc_Sel = "" ;
      AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = "" ;
      AV48TFCCTVal = "" ;
      AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel = "" ;
      AV49TFCCTVal_Sel = "" ;
      scmdbuf = "" ;
      lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext = "" ;
      lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod = "" ;
      lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom = "" ;
      lV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc = "" ;
      lV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc = "" ;
      lV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval = "" ;
      P0AB82_A4051CCTVal = new String[] {""} ;
      P0AB82_A4050CCTValDsc = new String[] {""} ;
      P0AB82_A4049CCTValLin = new byte[1] ;
      P0AB82_A4034CCTLin = new short[1] ;
      P0AB82_A4036CCTDsc = new String[] {""} ;
      P0AB82_A4031CCTCod = new int[1] ;
      P0AB82_A407EmprNom = new String[] {""} ;
      P0AB82_n407EmprNom = new boolean[] {false} ;
      P0AB82_A396EmprCod = new String[] {""} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadvariable_lineaswwexportcsv__default(),
         new Object[] {
             new Object[] {
            P0AB82_A4051CCTVal, P0AB82_A4050CCTValDsc, P0AB82_A4049CCTValLin, P0AB82_A4034CCTLin, P0AB82_A4036CCTDsc, P0AB82_A4031CCTCod, P0AB82_A407EmprNom, P0AB82_n407EmprNom, P0AB82_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4049CCTValLin ;
   private byte AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin ;
   private byte AV44TFCCTValLin ;
   private byte AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to ;
   private byte AV45TFCCTValLin_To ;
   private short gxcookieaux ;
   private short A4034CCTLin ;
   private short AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin ;
   private short AV42TFCCTLin ;
   private short AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to ;
   private short AV43TFCCTLin_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A4031CCTCod ;
   private int AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod ;
   private int AV38TFCCTCod ;
   private int AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to ;
   private int AV39TFCCTCod_To ;
   private int AV70GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String A4036CCTDsc ;
   private String A4050CCTValDsc ;
   private String A4051CCTVal ;
   private String AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ;
   private String AV34TFEmprCod ;
   private String AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ;
   private String AV35TFEmprCod_Sel ;
   private String AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ;
   private String AV36TFEmprNom ;
   private String AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ;
   private String AV37TFEmprNom_Sel ;
   private String AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ;
   private String AV40TFCCTDsc ;
   private String AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ;
   private String AV41TFCCTDsc_Sel ;
   private String AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ;
   private String AV46TFCCTValDsc ;
   private String AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ;
   private String AV47TFCCTValDsc_Sel ;
   private String AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ;
   private String AV48TFCCTVal ;
   private String AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ;
   private String AV49TFCCTVal_Sel ;
   private String scmdbuf ;
   private String lV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ;
   private String lV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ;
   private String lV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ;
   private String lV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ;
   private String lV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n407EmprNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P0AB82_A4051CCTVal ;
   private String[] P0AB82_A4050CCTValDsc ;
   private byte[] P0AB82_A4049CCTValLin ;
   private short[] P0AB82_A4034CCTLin ;
   private String[] P0AB82_A4036CCTDsc ;
   private int[] P0AB82_A4031CCTCod ;
   private String[] P0AB82_A407EmprNom ;
   private boolean[] P0AB82_n407EmprNom ;
   private String[] P0AB82_A396EmprCod ;
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

final  class controlcalidadvariable_lineaswwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AB82( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext ,
                                          String AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel ,
                                          String AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod ,
                                          String AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel ,
                                          String AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom ,
                                          int AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod ,
                                          int AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to ,
                                          String AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel ,
                                          String AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc ,
                                          short AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin ,
                                          short AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to ,
                                          byte AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin ,
                                          byte AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to ,
                                          String AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel ,
                                          String AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc ,
                                          String AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel ,
                                          String AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A4031CCTCod ,
                                          String A4036CCTDsc ,
                                          short A4034CCTLin ,
                                          byte A4049CCTValLin ,
                                          String A4050CCTValDsc ,
                                          String A4051CCTVal ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[24];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.CCTVal, T1.CCTValDsc, T1.CCTValLin, T1.CCTLin, T3.CCTDsc, T1.CCTCod, T2.EmprNom, T1.EmprCod FROM ((TXPCCDef2 T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod) INNER JOIN TXPCCDef T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod)" ;
      if ( ! (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidadvariable_lineaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCTCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CCTDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCTLin,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCTValLin,'90'), 2) like '%' || ?) or ( UPPER(T1.CCTValDsc) like '%' || UPPER(?)) or ( UPPER(T1.CCTVal) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Controlcalidadhtd_controlcalidadvariable_lineaswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidadvariable_lineaswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidadvariable_lineaswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidadvariable_lineaswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV58Controlcalidadhtd_controlcalidadvariable_lineaswwds_6_tfcctcod) )
      {
         addWhere(sWhereString, "(T1.CCTCod >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV59Controlcalidadhtd_controlcalidadvariable_lineaswwds_7_tfcctcod_to) )
      {
         addWhere(sWhereString, "(T1.CCTCod <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel)==0) && ( ! (GXutil.strcmp("", AV60Controlcalidadhtd_controlcalidadvariable_lineaswwds_8_tfcctdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidadvariable_lineaswwds_9_tfcctdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CCTDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV62Controlcalidadhtd_controlcalidadvariable_lineaswwds_10_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV63Controlcalidadhtd_controlcalidadvariable_lineaswwds_11_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV64Controlcalidadhtd_controlcalidadvariable_lineaswwds_12_tfcctvallin) )
      {
         addWhere(sWhereString, "(T1.CCTValLin >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV65Controlcalidadhtd_controlcalidadvariable_lineaswwds_13_tfcctvallin_to) )
      {
         addWhere(sWhereString, "(T1.CCTValLin <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Controlcalidadhtd_controlcalidadvariable_lineaswwds_14_tfcctvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidadvariable_lineaswwds_15_tfcctvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTValDsc = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel)==0) && ( ! (GXutil.strcmp("", AV68Controlcalidadhtd_controlcalidadvariable_lineaswwds_16_tfcctval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCTVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Controlcalidadhtd_controlcalidadvariable_lineaswwds_17_tfcctval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCTVal = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTValDsc" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTValDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.EmprNom" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.EmprNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTCod" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CCTDsc" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CCTDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTLin" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTLin DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTValLin" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTValLin DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCTVal" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCTVal DESC" ;
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
                  return conditional_P0AB82(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AB82", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 40);
               }
               return;
      }
   }

}

