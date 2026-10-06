package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwmodprm1exportcsv_impl extends GXWebProcedure
{
   public wcwmodprm1exportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCWmodprm1ExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCWmodprm1ColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCWmodprm1ColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proveedor Actual?", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV58Wcwmodprmds_1_filterfulltext = AV45FilterFullText ;
      AV59Wcwmodprmds_2_tfprdnum = AV37TFPrdNum ;
      AV60Wcwmodprmds_3_tfprdnum_sel = AV38TFPrdNum_Sel ;
      AV61Wcwmodprmds_4_tfprdnom = AV39TFPrdNom ;
      AV62Wcwmodprmds_5_tfprdnom_sel = AV40TFPrdNom_Sel ;
      AV63Wcwmodprmds_6_tfprdpreant = AV41TFPrdPreAnt ;
      AV64Wcwmodprmds_7_tfprdpreant_to = AV42TFPrdPreAnt_To ;
      AV65Wcwmodprmds_8_tfprdfecpre = AV43TFPrdFecPre ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV58Wcwmodprmds_1_filterfulltext ,
                                           AV60Wcwmodprmds_3_tfprdnum_sel ,
                                           AV59Wcwmodprmds_2_tfprdnum ,
                                           AV62Wcwmodprmds_5_tfprdnom_sel ,
                                           AV61Wcwmodprmds_4_tfprdnom ,
                                           AV63Wcwmodprmds_6_tfprdpreant ,
                                           AV64Wcwmodprmds_7_tfprdpreant_to ,
                                           AV65Wcwmodprmds_8_tfprdfecpre ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A725PrdPreAnt ,
                                           A709PrdFecPre ,
                                           Short.valueOf(AV30OrderedBy) ,
                                           Boolean.valueOf(AV31OrderedDsc) ,
                                           AV28Emprcod ,
                                           Integer.valueOf(AV29PrvNum) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A795PrvNum) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV58Wcwmodprmds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Wcwmodprmds_1_filterfulltext), "%", "") ;
      lV58Wcwmodprmds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Wcwmodprmds_1_filterfulltext), "%", "") ;
      lV58Wcwmodprmds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Wcwmodprmds_1_filterfulltext), "%", "") ;
      lV59Wcwmodprmds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV59Wcwmodprmds_2_tfprdnum), 6, "%") ;
      lV61Wcwmodprmds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV61Wcwmodprmds_4_tfprdnom), 26, "%") ;
      /* Using cursor P09RX2 */
      pr_default.execute(0, new Object[] {AV28Emprcod, Integer.valueOf(AV29PrvNum), lV58Wcwmodprmds_1_filterfulltext, lV58Wcwmodprmds_1_filterfulltext, lV58Wcwmodprmds_1_filterfulltext, lV59Wcwmodprmds_2_tfprdnum, AV60Wcwmodprmds_3_tfprdnum_sel, lV61Wcwmodprmds_4_tfprdnom, AV62Wcwmodprmds_5_tfprdnom_sel, AV63Wcwmodprmds_6_tfprdpreant, AV64Wcwmodprmds_7_tfprdpreant_to, AV65Wcwmodprmds_8_tfprdfecpre});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = P09RX2_A795PrvNum[0] ;
         A396EmprCod = P09RX2_A396EmprCod[0] ;
         A709PrdFecPre = P09RX2_A709PrdFecPre[0] ;
         A725PrdPreAnt = P09RX2_A725PrdPreAnt[0] ;
         A718PrdNom = P09RX2_A718PrdNom[0] ;
         A719PrdNum = P09RX2_A719PrdNum[0] ;
         A724PrdPreAct = P09RX2_A724PrdPreAct[0] ;
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
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
            wcwmodprm1exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
            wcwmodprm1exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV32PrdPreAct = A724PrdPreAct ;
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('0',3),t(',',7),t('0',3),t(',',7),t('255',3),t(')',4) ]
               Target    : [ t('Prdpreact',23),t('Backcolor',3) ]
               ForType   : 29
               Type      : []
            */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('255',3),t(',',7),t('255',3),t(',',7),t('255',3),t(')',4) ]
               Target    : [ t('Prdpreact',23),t('Forecolor',3) ]
               ForType   : 29
               Type      : []
            */
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.format( AV32PrdPreAct, "ZZZZZZZ9.999") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV33PrdFecPre = GXutil.serverDate( context, remoteHandle, pr_default) ;
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('0',3),t(',',7),t('0',3),t(',',7),t('255',3),t(')',4) ]
               Target    : [ t('Prdfecpre',23),t('Backcolor',3) ]
               ForType   : 29
               Type      : []
            */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('255',3),t(',',7),t('255',3),t(',',7),t('255',3),t(')',4) ]
               Target    : [ t('Prdfecpre',23),t('Forecolor',3) ]
               ForType   : 29
               Type      : []
            */
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( AV33PrdFecPre, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.format( A725PrdPreAnt, "ZZZZZZZ9.999") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A709PrdFecPre, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
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
      if ( 1 == 0 )
      {
         AV67Wcwmodprm1ds_9_filterfulltext = AV45FilterFullText ;
         AV68Wcwmodprm1ds_10_tfprdprv = AV53TFPrdPrv ;
         AV69Wcwmodprm1ds_11_tfprdprv_to = AV54TFPrdPrv_To ;
         AV70Wcwmodprm1ds_12_tfprdnum = AV37TFPrdNum ;
         AV71Wcwmodprm1ds_13_tfprdnum_sel = AV38TFPrdNum_Sel ;
         AV72Wcwmodprm1ds_14_tfprdnom = AV39TFPrdNom ;
         AV73Wcwmodprm1ds_15_tfprdnom_sel = AV40TFPrdNom_Sel ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV67Wcwmodprm1ds_9_filterfulltext ,
                                              Integer.valueOf(AV68Wcwmodprm1ds_10_tfprdprv) ,
                                              Integer.valueOf(AV69Wcwmodprm1ds_11_tfprdprv_to) ,
                                              AV71Wcwmodprm1ds_13_tfprdnum_sel ,
                                              AV70Wcwmodprm1ds_12_tfprdnum ,
                                              AV73Wcwmodprm1ds_15_tfprdnom_sel ,
                                              AV72Wcwmodprm1ds_14_tfprdnom ,
                                              Integer.valueOf(A6158PrdPrv) ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              Short.valueOf(AV30OrderedBy) ,
                                              Boolean.valueOf(AV31OrderedDsc) ,
                                              Integer.valueOf(AV29PrvNum) ,
                                              AV28Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV67Wcwmodprm1ds_9_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Wcwmodprm1ds_9_filterfulltext), "%", "") ;
         lV67Wcwmodprm1ds_9_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Wcwmodprm1ds_9_filterfulltext), "%", "") ;
         lV67Wcwmodprm1ds_9_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Wcwmodprm1ds_9_filterfulltext), "%", "") ;
         lV70Wcwmodprm1ds_12_tfprdnum = GXutil.padr( GXutil.rtrim( AV70Wcwmodprm1ds_12_tfprdnum), 6, "%") ;
         lV72Wcwmodprm1ds_14_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Wcwmodprm1ds_14_tfprdnom), 26, "%") ;
         /* Using cursor P09RX3 */
         pr_default.execute(1, new Object[] {AV28Emprcod, Integer.valueOf(AV29PrvNum), lV67Wcwmodprm1ds_9_filterfulltext, lV67Wcwmodprm1ds_9_filterfulltext, lV67Wcwmodprm1ds_9_filterfulltext, Integer.valueOf(AV68Wcwmodprm1ds_10_tfprdprv), Integer.valueOf(AV69Wcwmodprm1ds_11_tfprdprv_to), lV70Wcwmodprm1ds_12_tfprdnum, AV71Wcwmodprm1ds_13_tfprdnum_sel, lV72Wcwmodprm1ds_14_tfprdnom, AV73Wcwmodprm1ds_15_tfprdnom_sel});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = P09RX3_A396EmprCod[0] ;
            A718PrdNom = P09RX3_A718PrdNom[0] ;
            A719PrdNum = P09RX3_A719PrdNum[0] ;
            A6158PrdPrv = P09RX3_A6158PrdPrv[0] ;
            A7240PrdPrea = P09RX3_A7240PrdPrea[0] ;
            A718PrdNom = P09RX3_A718PrdNom[0] ;
            AV14TextFileLine = "" ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S162 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A6158PrdPrv, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
               wcwmodprm1exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
               wcwmodprm1exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV32PrdPreAct = A7240PrdPrea ;
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( AV32PrdPreAct, 14, 5) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV33PrdFecPre = GXutil.serverDate( context, remoteHandle, pr_default) ;
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( AV33PrdFecPre, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char2 = AV52ProveedorActual ;
               GXv_char3[0] = GXt_char2 ;
               new app.proveedoractual(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A6158PrdPrv, GXv_char3) ;
               wcwmodprm1exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV52ProveedorActual = GXt_char2 ;
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV52ProveedorActual, ";", ","), GXv_char3) ;
               wcwmodprm1exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
            if ( GXutil.len( AV14TextFileLine) > 0 )
            {
               AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCWmodprm1ExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdPrv", "", "Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&PrdPreAct", "", "Precio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&PrdFecPre", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&ProveedorActual", "", "Proveedor Actual?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWmodprm1ColumnsSelector", GXv_char3) ;
      wcwmodprm1exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCWmodprm1GridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWmodprm1GridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV19Session.getValue("WCWmodprm1GridState"), null, null);
      }
      AV30OrderedBy = AV35GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV31OrderedDsc = AV35GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV45FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPRV") == 0 )
         {
            AV53TFPrdPrv = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFPrdPrv_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV37TFPrdNum = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV38TFPrdNum_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV39TFPrdNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV40TFPrdNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV29PrvNum = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV74GXV1 = (int)(AV74GXV1+1) ;
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
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      A709PrdFecPre = GXutil.nullDate() ;
      A7240PrdPrea = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      AV58Wcwmodprmds_1_filterfulltext = "" ;
      AV45FilterFullText = "" ;
      AV59Wcwmodprmds_2_tfprdnum = "" ;
      AV37TFPrdNum = "" ;
      AV60Wcwmodprmds_3_tfprdnum_sel = "" ;
      AV38TFPrdNum_Sel = "" ;
      AV61Wcwmodprmds_4_tfprdnom = "" ;
      AV39TFPrdNom = "" ;
      AV62Wcwmodprmds_5_tfprdnom_sel = "" ;
      AV40TFPrdNom_Sel = "" ;
      AV63Wcwmodprmds_6_tfprdpreant = DecimalUtil.ZERO ;
      AV41TFPrdPreAnt = DecimalUtil.ZERO ;
      AV64Wcwmodprmds_7_tfprdpreant_to = DecimalUtil.ZERO ;
      AV42TFPrdPreAnt_To = DecimalUtil.ZERO ;
      AV65Wcwmodprmds_8_tfprdfecpre = GXutil.nullDate() ;
      AV43TFPrdFecPre = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV58Wcwmodprmds_1_filterfulltext = "" ;
      lV59Wcwmodprmds_2_tfprdnum = "" ;
      lV61Wcwmodprmds_4_tfprdnom = "" ;
      AV28Emprcod = "" ;
      P09RX2_A795PrvNum = new int[1] ;
      P09RX2_A396EmprCod = new String[] {""} ;
      P09RX2_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P09RX2_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RX2_A718PrdNom = new String[] {""} ;
      P09RX2_A719PrdNum = new String[] {""} ;
      P09RX2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV32PrdPreAct = DecimalUtil.ZERO ;
      AV33PrdFecPre = GXutil.nullDate() ;
      AV67Wcwmodprm1ds_9_filterfulltext = "" ;
      AV70Wcwmodprm1ds_12_tfprdnum = "" ;
      AV71Wcwmodprm1ds_13_tfprdnum_sel = "" ;
      AV72Wcwmodprm1ds_14_tfprdnom = "" ;
      AV73Wcwmodprm1ds_15_tfprdnom_sel = "" ;
      lV67Wcwmodprm1ds_9_filterfulltext = "" ;
      lV70Wcwmodprm1ds_12_tfprdnum = "" ;
      lV72Wcwmodprm1ds_14_tfprdnom = "" ;
      P09RX3_A396EmprCod = new String[] {""} ;
      P09RX3_A718PrdNom = new String[] {""} ;
      P09RX3_A719PrdNum = new String[] {""} ;
      P09RX3_A6158PrdPrv = new int[1] ;
      P09RX3_A7240PrdPrea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV52ProveedorActual = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwmodprm1exportcsv__default(),
         new Object[] {
             new Object[] {
            P09RX2_A795PrvNum, P09RX2_A396EmprCod, P09RX2_A709PrdFecPre, P09RX2_A725PrdPreAnt, P09RX2_A718PrdNom, P09RX2_A719PrdNum, P09RX2_A724PrdPreAct
            }
            , new Object[] {
            P09RX3_A396EmprCod, P09RX3_A718PrdNom, P09RX3_A719PrdNum, P09RX3_A6158PrdPrv, P09RX3_A7240PrdPrea
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV30OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A6158PrdPrv ;
   private int AV29PrvNum ;
   private int A795PrvNum ;
   private int AV68Wcwmodprm1ds_10_tfprdprv ;
   private int AV53TFPrdPrv ;
   private int AV69Wcwmodprm1ds_11_tfprdprv_to ;
   private int AV54TFPrdPrv_To ;
   private int AV74GXV1 ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private java.math.BigDecimal A7240PrdPrea ;
   private java.math.BigDecimal AV63Wcwmodprmds_6_tfprdpreant ;
   private java.math.BigDecimal AV41TFPrdPreAnt ;
   private java.math.BigDecimal AV64Wcwmodprmds_7_tfprdpreant_to ;
   private java.math.BigDecimal AV42TFPrdPreAnt_To ;
   private java.math.BigDecimal AV32PrdPreAct ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private String AV59Wcwmodprmds_2_tfprdnum ;
   private String AV37TFPrdNum ;
   private String AV60Wcwmodprmds_3_tfprdnum_sel ;
   private String AV38TFPrdNum_Sel ;
   private String AV61Wcwmodprmds_4_tfprdnom ;
   private String AV39TFPrdNom ;
   private String AV62Wcwmodprmds_5_tfprdnom_sel ;
   private String AV40TFPrdNom_Sel ;
   private String scmdbuf ;
   private String lV59Wcwmodprmds_2_tfprdnum ;
   private String lV61Wcwmodprmds_4_tfprdnom ;
   private String AV28Emprcod ;
   private String AV70Wcwmodprm1ds_12_tfprdnum ;
   private String AV71Wcwmodprm1ds_13_tfprdnum_sel ;
   private String AV72Wcwmodprm1ds_14_tfprdnom ;
   private String AV73Wcwmodprm1ds_15_tfprdnom_sel ;
   private String lV70Wcwmodprm1ds_12_tfprdnum ;
   private String lV72Wcwmodprm1ds_14_tfprdnom ;
   private String AV52ProveedorActual ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date AV65Wcwmodprmds_8_tfprdfecpre ;
   private java.util.Date AV43TFPrdFecPre ;
   private java.util.Date AV33PrdFecPre ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV31OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV58Wcwmodprmds_1_filterfulltext ;
   private String AV45FilterFullText ;
   private String lV58Wcwmodprmds_1_filterfulltext ;
   private String AV67Wcwmodprm1ds_9_filterfulltext ;
   private String lV67Wcwmodprm1ds_9_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P09RX2_A795PrvNum ;
   private String[] P09RX2_A396EmprCod ;
   private java.util.Date[] P09RX2_A709PrdFecPre ;
   private java.math.BigDecimal[] P09RX2_A725PrdPreAnt ;
   private String[] P09RX2_A718PrdNom ;
   private String[] P09RX2_A719PrdNum ;
   private java.math.BigDecimal[] P09RX2_A724PrdPreAct ;
   private String[] P09RX3_A396EmprCod ;
   private String[] P09RX3_A718PrdNom ;
   private String[] P09RX3_A719PrdNum ;
   private int[] P09RX3_A6158PrdPrv ;
   private java.math.BigDecimal[] P09RX3_A7240PrdPrea ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class wcwmodprm1exportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09RX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Wcwmodprmds_1_filterfulltext ,
                                          String AV60Wcwmodprmds_3_tfprdnum_sel ,
                                          String AV59Wcwmodprmds_2_tfprdnum ,
                                          String AV62Wcwmodprmds_5_tfprdnom_sel ,
                                          String AV61Wcwmodprmds_4_tfprdnom ,
                                          java.math.BigDecimal AV63Wcwmodprmds_6_tfprdpreant ,
                                          java.math.BigDecimal AV64Wcwmodprmds_7_tfprdpreant_to ,
                                          java.util.Date AV65Wcwmodprmds_8_tfprdfecpre ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A725PrdPreAnt ,
                                          java.util.Date A709PrdFecPre ,
                                          short AV30OrderedBy ,
                                          boolean AV31OrderedDsc ,
                                          String AV28Emprcod ,
                                          int AV29PrvNum ,
                                          String A396EmprCod ,
                                          int A795PrvNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[12];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT PrvNum, EmprCod, PrdFecPre, PrdPreAnt, PrdNom, PrdNum, PrdPreAct FROM TXPPRODUC" ;
      addWhere(sWhereString, "(EmprCod = ? and PrvNum = ?)");
      if ( ! (GXutil.strcmp("", AV58Wcwmodprmds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(PrdNum) like '%' || UPPER(?)) or ( UPPER(PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(PrdPreAnt,'99999990.99999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcwmodprmds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcwmodprmds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcwmodprmds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Wcwmodprmds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Wcwmodprmds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Wcwmodprmds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Wcwmodprmds_6_tfprdpreant)==0) )
      {
         addWhere(sWhereString, "(PrdPreAnt >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Wcwmodprmds_7_tfprdpreant_to)==0) )
      {
         addWhere(sWhereString, "(PrdPreAnt <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65Wcwmodprmds_8_tfprdfecpre)) )
      {
         addWhere(sWhereString, "(PrdFecPre >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV30OrderedBy == 1 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNum" ;
      }
      else if ( ( AV30OrderedBy == 1 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNum DESC" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNom" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNom DESC" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdPreAnt" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdPreAnt DESC" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdFecPre" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdFecPre DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09RX3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Wcwmodprm1ds_9_filterfulltext ,
                                          int AV68Wcwmodprm1ds_10_tfprdprv ,
                                          int AV69Wcwmodprm1ds_11_tfprdprv_to ,
                                          String AV71Wcwmodprm1ds_13_tfprdnum_sel ,
                                          String AV70Wcwmodprm1ds_12_tfprdnum ,
                                          String AV73Wcwmodprm1ds_15_tfprdnom_sel ,
                                          String AV72Wcwmodprm1ds_14_tfprdnom ,
                                          int A6158PrdPrv ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          short AV30OrderedBy ,
                                          boolean AV31OrderedDsc ,
                                          int AV29PrvNum ,
                                          String AV28Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[11];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.PrdNom, T1.PrdNum, T1.PrdPrv, T1.PrdPrea FROM (TXPPROPRV T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PrdPrv = ?)");
      if ( ! (GXutil.strcmp("", AV67Wcwmodprm1ds_9_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.PrdPrv,'999990'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcwmodprm1ds_10_tfprdprv) )
      {
         addWhere(sWhereString, "(T1.PrdPrv >= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcwmodprm1ds_11_tfprdprv_to) )
      {
         addWhere(sWhereString, "(T1.PrdPrv <= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcwmodprm1ds_13_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcwmodprm1ds_12_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcwmodprm1ds_13_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Wcwmodprm1ds_15_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Wcwmodprm1ds_14_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Wcwmodprm1ds_15_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV30OrderedBy == 1 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV30OrderedBy == 1 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPrv" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPrv DESC" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P09RX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() );
            case 1 :
                  return conditional_P09RX3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09RX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RX3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
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
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
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
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               return;
      }
   }

}

