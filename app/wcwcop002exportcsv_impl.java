package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwcop002exportcsv_impl extends GXWebProcedure
{
   public wcwcop002exportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCWcop002ExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCWcop002ColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCWcop002ColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Almacen", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Reserva", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pendiente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Disponible", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Validez", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Valor", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV55Wcwcop002ds_1_filterfulltext = AV51FilterFullText ;
      AV56Wcwcop002ds_2_tfprdnum = AV39TFPrdNum ;
      AV57Wcwcop002ds_3_tfprdnum_sel = AV40TFPrdNum_Sel ;
      AV58Wcwcop002ds_4_tfprdnom = AV41TFPrdNom ;
      AV59Wcwcop002ds_5_tfprdnom_sel = AV42TFPrdNom_Sel ;
      AV60Wcwcop002ds_6_tfprdexialm = AV43TFPrdExiAlm ;
      AV61Wcwcop002ds_7_tfprdexialm_to = AV44TFPrdExiAlm_To ;
      AV62Wcwcop002ds_8_tfprdcanres = AV45TFPrdCanRes ;
      AV63Wcwcop002ds_9_tfprdcanres_to = AV46TFPrdCanRes_To ;
      AV64Wcwcop002ds_10_tfprdcanpen = AV47TFPrdCanPen ;
      AV65Wcwcop002ds_11_tfprdcanpen_to = AV48TFPrdCanPen_To ;
      AV66Wcwcop002ds_12_tfvaldsc = AV49TFValDsc ;
      AV67Wcwcop002ds_13_tfvaldsc_sel = AV50TFValDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV55Wcwcop002ds_1_filterfulltext ,
                                           AV57Wcwcop002ds_3_tfprdnum_sel ,
                                           AV56Wcwcop002ds_2_tfprdnum ,
                                           AV59Wcwcop002ds_5_tfprdnom_sel ,
                                           AV58Wcwcop002ds_4_tfprdnom ,
                                           AV60Wcwcop002ds_6_tfprdexialm ,
                                           AV61Wcwcop002ds_7_tfprdexialm_to ,
                                           AV62Wcwcop002ds_8_tfprdcanres ,
                                           AV63Wcwcop002ds_9_tfprdcanres_to ,
                                           AV64Wcwcop002ds_10_tfprdcanpen ,
                                           AV65Wcwcop002ds_11_tfprdcanpen_to ,
                                           AV67Wcwcop002ds_13_tfvaldsc_sel ,
                                           AV66Wcwcop002ds_12_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A857ValDsc ,
                                           Short.valueOf(AV30OrderedBy) ,
                                           Boolean.valueOf(AV31OrderedDsc) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV28Emprcod ,
                                           Integer.valueOf(AV29PrvNum) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV55Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV55Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV55Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV55Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV55Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV55Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV56Wcwcop002ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV56Wcwcop002ds_2_tfprdnum), 6, "%") ;
      lV58Wcwcop002ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV58Wcwcop002ds_4_tfprdnom), 26, "%") ;
      lV66Wcwcop002ds_12_tfvaldsc = GXutil.padr( GXutil.rtrim( AV66Wcwcop002ds_12_tfvaldsc), 16, "%") ;
      /* Using cursor P08R92 */
      pr_default.execute(0, new Object[] {AV28Emprcod, Integer.valueOf(AV29PrvNum), lV55Wcwcop002ds_1_filterfulltext, lV55Wcwcop002ds_1_filterfulltext, lV55Wcwcop002ds_1_filterfulltext, lV55Wcwcop002ds_1_filterfulltext, lV55Wcwcop002ds_1_filterfulltext, lV55Wcwcop002ds_1_filterfulltext, lV56Wcwcop002ds_2_tfprdnum, AV57Wcwcop002ds_3_tfprdnum_sel, lV58Wcwcop002ds_4_tfprdnom, AV59Wcwcop002ds_5_tfprdnom_sel, AV60Wcwcop002ds_6_tfprdexialm, AV61Wcwcop002ds_7_tfprdexialm_to, AV62Wcwcop002ds_8_tfprdcanres, AV63Wcwcop002ds_9_tfprdcanres_to, AV64Wcwcop002ds_10_tfprdcanpen, AV65Wcwcop002ds_11_tfprdcanpen_to, lV66Wcwcop002ds_12_tfvaldsc, AV67Wcwcop002ds_13_tfvaldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P08R92_A856ValCod[0] ;
         A795PrvNum = P08R92_A795PrvNum[0] ;
         A396EmprCod = P08R92_A396EmprCod[0] ;
         A857ValDsc = P08R92_A857ValDsc[0] ;
         n857ValDsc = P08R92_n857ValDsc[0] ;
         A684PrdCanPen = P08R92_A684PrdCanPen[0] ;
         A685PrdCanRes = P08R92_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08R92_A704PrdExiAlm[0] ;
         A718PrdNom = P08R92_A718PrdNom[0] ;
         A719PrdNum = P08R92_A719PrdNum[0] ;
         A724PrdPreAct = P08R92_A724PrdPreAct[0] ;
         A857ValDsc = P08R92_A857ValDsc[0] ;
         n857ValDsc = P08R92_n857ValDsc[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
            wcwcop002exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
            wcwcop002exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A704PrdExiAlm, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A685PrdCanRes, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A684PrdCanPen, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV32Disponible = A704PrdExiAlm.subtract(A685PrdCanRes) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV32Disponible, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A857ValDsc, ";", ","), GXv_char3) ;
            wcwcop002exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV33Cantidad = DecimalUtil.doubleToDec(0) ;
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('0',3),t(',',7),t('255',3),t(',',7),t('0',3),t(')',4) ]
               Target    : [ t('Cantidad',23),t('Backcolor',3) ]
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
               Expression: [ t('rgb(',1),t('0',3),t(',',7),t('0',3),t(',',7),t('0',3),t(')',4) ]
               Target    : [ t('Cantidad',23),t('Forecolor',3) ]
               ForType   : 29
               Type      : []
            */
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV33Cantidad, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV34PrdPreAct = A724PrdPreAct ;
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('0',3),t(',',7),t('255',3),t(',',7),t('0',3),t(')',4) ]
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
               Expression: [ t('rgb(',1),t('0',3),t(',',7),t('0',3),t(',',7),t('0',3),t(')',4) ]
               Target    : [ t('Prdpreact',23),t('Forecolor',3) ]
               ForType   : 29
               Type      : []
            */
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV34PrdPreAct, 14, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV35Valor = GXutil.roundDecimal( AV33Cantidad.multiply(AV34PrdPreAct), 2) ;
            if ( ! ( GXutil.roundDecimal( AV33Cantidad.multiply(AV34PrdPreAct), 2).doubleValue() > 0 ) )
            {
               /* * Property Backcolor not supported in */
               /* * Property Backcolor not supported in */
               /* * Property Backcolor not supported in */
               /* * Property Backcolor not supported in */
               /*
                  Assignment error:
                  ================
                  Expression: [ t('rgb(',1),t('255',3),t(',',7),t('255',3),t(',',7),t('0',3),t(')',4) ]
                  Target    : [ t('Valor',23),t('Backcolor',3) ]
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
                  Expression: [ t('rgb(',1),t('0',3),t(',',7),t('0',3),t(',',7),t('0',3),t(')',4) ]
                  Target    : [ t('Valor',23),t('Forecolor',3) ]
                  ForType   : 29
                  Type      : []
               */
            }
            else
            {
               /* * Property Backcolor not supported in */
               /* * Property Backcolor not supported in */
               /* * Property Backcolor not supported in */
               /* * Property Backcolor not supported in */
               /*
                  Assignment error:
                  ================
                  Expression: [ t('rgb(',1),t('0',3),t(',',7),t('255',3),t(',',7),t('0',3),t(')',4) ]
                  Target    : [ t('Valor',23),t('Backcolor',3) ]
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
                  Expression: [ t('rgb(',1),t('0',3),t(',',7),t('0',3),t(',',7),t('0',3),t(')',4) ]
                  Target    : [ t('Valor',23),t('Forecolor',3) ]
                  ForType   : 29
                  Type      : []
               */
            }
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV35Valor, 11, 2) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCWcop002ExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdExiAlm", "", "Almacen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdCanRes", "", "Reserva", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdCanPen", "", "Pendiente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Disponible", "", "Disponible", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ValDsc", "", "Validez", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Cantidad", "", "Cantidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&PrdPreAct", "", "Precio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Valor", "", "Valor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWcop002ColumnsSelector", GXv_char3) ;
      wcwcop002exportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCWcop002GridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWcop002GridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV19Session.getValue("WCWcop002GridState"), null, null);
      }
      AV30OrderedBy = AV37GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV31OrderedDsc = AV37GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV68GXV1 = 1 ;
      while ( AV68GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV68GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV51FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV39TFPrdNum = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV40TFPrdNum_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV41TFPrdNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV42TFPrdNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV43TFPrdExiAlm = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFPrdExiAlm_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV45TFPrdCanRes = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV46TFPrdCanRes_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANPEN") == 0 )
         {
            AV47TFPrdCanPen = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFPrdCanPen_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV49TFValDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV50TFValDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV29PrvNum = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV68GXV1 = (int)(AV68GXV1+1) ;
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
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV55Wcwcop002ds_1_filterfulltext = "" ;
      AV51FilterFullText = "" ;
      AV56Wcwcop002ds_2_tfprdnum = "" ;
      AV39TFPrdNum = "" ;
      AV57Wcwcop002ds_3_tfprdnum_sel = "" ;
      AV40TFPrdNum_Sel = "" ;
      AV58Wcwcop002ds_4_tfprdnom = "" ;
      AV41TFPrdNom = "" ;
      AV59Wcwcop002ds_5_tfprdnom_sel = "" ;
      AV42TFPrdNom_Sel = "" ;
      AV60Wcwcop002ds_6_tfprdexialm = DecimalUtil.ZERO ;
      AV43TFPrdExiAlm = DecimalUtil.ZERO ;
      AV61Wcwcop002ds_7_tfprdexialm_to = DecimalUtil.ZERO ;
      AV44TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV62Wcwcop002ds_8_tfprdcanres = DecimalUtil.ZERO ;
      AV45TFPrdCanRes = DecimalUtil.ZERO ;
      AV63Wcwcop002ds_9_tfprdcanres_to = DecimalUtil.ZERO ;
      AV46TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV64Wcwcop002ds_10_tfprdcanpen = DecimalUtil.ZERO ;
      AV47TFPrdCanPen = DecimalUtil.ZERO ;
      AV65Wcwcop002ds_11_tfprdcanpen_to = DecimalUtil.ZERO ;
      AV48TFPrdCanPen_To = DecimalUtil.ZERO ;
      AV66Wcwcop002ds_12_tfvaldsc = "" ;
      AV49TFValDsc = "" ;
      AV67Wcwcop002ds_13_tfvaldsc_sel = "" ;
      AV50TFValDsc_Sel = "" ;
      scmdbuf = "" ;
      lV55Wcwcop002ds_1_filterfulltext = "" ;
      lV56Wcwcop002ds_2_tfprdnum = "" ;
      lV58Wcwcop002ds_4_tfprdnom = "" ;
      lV66Wcwcop002ds_12_tfvaldsc = "" ;
      AV28Emprcod = "" ;
      A396EmprCod = "" ;
      P08R92_A856ValCod = new byte[1] ;
      P08R92_A795PrvNum = new int[1] ;
      P08R92_A396EmprCod = new String[] {""} ;
      P08R92_A857ValDsc = new String[] {""} ;
      P08R92_n857ValDsc = new boolean[] {false} ;
      P08R92_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08R92_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08R92_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08R92_A718PrdNom = new String[] {""} ;
      P08R92_A719PrdNum = new String[] {""} ;
      P08R92_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV32Disponible = DecimalUtil.ZERO ;
      AV33Cantidad = DecimalUtil.ZERO ;
      AV34PrdPreAct = DecimalUtil.ZERO ;
      AV35Valor = DecimalUtil.ZERO ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwcop002exportcsv__default(),
         new Object[] {
             new Object[] {
            P08R92_A856ValCod, P08R92_A795PrvNum, P08R92_A396EmprCod, P08R92_A857ValDsc, P08R92_n857ValDsc, P08R92_A684PrdCanPen, P08R92_A685PrdCanRes, P08R92_A704PrdExiAlm, P08R92_A718PrdNom, P08R92_A719PrdNum,
            P08R92_A724PrdPreAct
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short gxcookieaux ;
   private short AV30OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A795PrvNum ;
   private int AV29PrvNum ;
   private int AV68GXV1 ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV60Wcwcop002ds_6_tfprdexialm ;
   private java.math.BigDecimal AV43TFPrdExiAlm ;
   private java.math.BigDecimal AV61Wcwcop002ds_7_tfprdexialm_to ;
   private java.math.BigDecimal AV44TFPrdExiAlm_To ;
   private java.math.BigDecimal AV62Wcwcop002ds_8_tfprdcanres ;
   private java.math.BigDecimal AV45TFPrdCanRes ;
   private java.math.BigDecimal AV63Wcwcop002ds_9_tfprdcanres_to ;
   private java.math.BigDecimal AV46TFPrdCanRes_To ;
   private java.math.BigDecimal AV64Wcwcop002ds_10_tfprdcanpen ;
   private java.math.BigDecimal AV47TFPrdCanPen ;
   private java.math.BigDecimal AV65Wcwcop002ds_11_tfprdcanpen_to ;
   private java.math.BigDecimal AV48TFPrdCanPen_To ;
   private java.math.BigDecimal AV32Disponible ;
   private java.math.BigDecimal AV33Cantidad ;
   private java.math.BigDecimal AV34PrdPreAct ;
   private java.math.BigDecimal AV35Valor ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A857ValDsc ;
   private String AV56Wcwcop002ds_2_tfprdnum ;
   private String AV39TFPrdNum ;
   private String AV57Wcwcop002ds_3_tfprdnum_sel ;
   private String AV40TFPrdNum_Sel ;
   private String AV58Wcwcop002ds_4_tfprdnom ;
   private String AV41TFPrdNom ;
   private String AV59Wcwcop002ds_5_tfprdnom_sel ;
   private String AV42TFPrdNom_Sel ;
   private String AV66Wcwcop002ds_12_tfvaldsc ;
   private String AV49TFValDsc ;
   private String AV67Wcwcop002ds_13_tfvaldsc_sel ;
   private String AV50TFValDsc_Sel ;
   private String scmdbuf ;
   private String lV56Wcwcop002ds_2_tfprdnum ;
   private String lV58Wcwcop002ds_4_tfprdnom ;
   private String lV66Wcwcop002ds_12_tfvaldsc ;
   private String AV28Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV31OrderedDsc ;
   private boolean n857ValDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV55Wcwcop002ds_1_filterfulltext ;
   private String AV51FilterFullText ;
   private String lV55Wcwcop002ds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P08R92_A856ValCod ;
   private int[] P08R92_A795PrvNum ;
   private String[] P08R92_A396EmprCod ;
   private String[] P08R92_A857ValDsc ;
   private boolean[] P08R92_n857ValDsc ;
   private java.math.BigDecimal[] P08R92_A684PrdCanPen ;
   private java.math.BigDecimal[] P08R92_A685PrdCanRes ;
   private java.math.BigDecimal[] P08R92_A704PrdExiAlm ;
   private String[] P08R92_A718PrdNom ;
   private String[] P08R92_A719PrdNum ;
   private java.math.BigDecimal[] P08R92_A724PrdPreAct ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class wcwcop002exportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08R92( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Wcwcop002ds_1_filterfulltext ,
                                          String AV57Wcwcop002ds_3_tfprdnum_sel ,
                                          String AV56Wcwcop002ds_2_tfprdnum ,
                                          String AV59Wcwcop002ds_5_tfprdnom_sel ,
                                          String AV58Wcwcop002ds_4_tfprdnom ,
                                          java.math.BigDecimal AV60Wcwcop002ds_6_tfprdexialm ,
                                          java.math.BigDecimal AV61Wcwcop002ds_7_tfprdexialm_to ,
                                          java.math.BigDecimal AV62Wcwcop002ds_8_tfprdcanres ,
                                          java.math.BigDecimal AV63Wcwcop002ds_9_tfprdcanres_to ,
                                          java.math.BigDecimal AV64Wcwcop002ds_10_tfprdcanpen ,
                                          java.math.BigDecimal AV65Wcwcop002ds_11_tfprdcanpen_to ,
                                          String AV67Wcwcop002ds_13_tfvaldsc_sel ,
                                          String AV66Wcwcop002ds_12_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          String A857ValDsc ,
                                          short AV30OrderedBy ,
                                          boolean AV31OrderedDsc ,
                                          int A795PrvNum ,
                                          byte A856ValCod ,
                                          String AV28Emprcod ,
                                          int AV29PrvNum ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[20];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.PrvNum, T1.EmprCod, T2.ValDsc, T1.PrdCanPen, T1.PrdCanRes, T1.PrdExiAlm, T1.PrdNom, T1.PrdNum, T1.PrdPreAct FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrvNum = ?)");
      addWhere(sWhereString, "(Not (T1.PrvNum = 0))");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) <> '#')");
      addWhere(sWhereString, "(Not (rtrim(SUBSTR(T1.PrdNum, 2, 1)) IS NULL AND NOT(SUBSTR(T1.PrdNum, 2, 1) IS NULL)))");
      addWhere(sWhereString, "(T1.ValCod >= 1)");
      addWhere(sWhereString, "(T1.ValCod <= 2)");
      if ( ! (GXutil.strcmp("", AV55Wcwcop002ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanPen,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T2.ValDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Wcwcop002ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV56Wcwcop002ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Wcwcop002ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Wcwcop002ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV58Wcwcop002ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Wcwcop002ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Wcwcop002ds_6_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Wcwcop002ds_7_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Wcwcop002ds_8_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Wcwcop002ds_9_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Wcwcop002ds_10_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Wcwcop002ds_11_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcwcop002ds_13_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcwcop002ds_12_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcwcop002ds_13_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm DESC" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes DESC" ;
      }
      else if ( ( AV30OrderedBy == 5 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanPen" ;
      }
      else if ( ( AV30OrderedBy == 5 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanPen DESC" ;
      }
      else if ( ( AV30OrderedBy == 6 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ValDsc" ;
      }
      else if ( ( AV30OrderedBy == 6 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ValDsc DESC" ;
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
                  return conditional_P08R92(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08R92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               return;
      }
   }

}

