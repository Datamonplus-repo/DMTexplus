package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpedobswwexportcsv_impl extends GXWebProcedure
{
   public tpedobswwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TPEDOBSWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TPEDOBSWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TPEDOBSWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Empresa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Pedido", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ultima Linea Observaciones", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Contador de lineas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Destinatario Pedido Compras", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Peticionario Pedido Compras", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Entrega Prevista", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Pedido", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV67Tpedobswwds_1_filterfulltext = AV63FilterFullText ;
      AV68Tpedobswwds_2_tfemprcod = AV45TFEmprCod ;
      AV69Tpedobswwds_3_tfemprcod_sel = AV46TFEmprCod_Sel ;
      AV70Tpedobswwds_4_tfpedcod = AV47TFPedCod ;
      AV71Tpedobswwds_5_tfpedcod_to = AV48TFPedCod_To ;
      AV72Tpedobswwds_6_tfpedobsul = AV49TFPedObsUL ;
      AV73Tpedobswwds_7_tfpedobsul_to = AV50TFPedObsUL_To ;
      AV74Tpedobswwds_8_tfemprnom = AV51TFEmprNom ;
      AV75Tpedobswwds_9_tfemprnom_sel = AV52TFEmprNom_Sel ;
      AV76Tpedobswwds_10_tfpedconlin = AV53TFPedConLin ;
      AV77Tpedobswwds_11_tfpedconlin_to = AV54TFPedConLin_To ;
      AV78Tpedobswwds_12_tfpedperdes = AV55TFPedPerDes ;
      AV79Tpedobswwds_13_tfpedperdes_sel = AV56TFPedPerDes_Sel ;
      AV80Tpedobswwds_14_tfpedperpet = AV57TFPedPerPet ;
      AV81Tpedobswwds_15_tfpedperpet_sel = AV58TFPedPerPet_Sel ;
      AV82Tpedobswwds_16_tfpedfecent = AV59TFPedFecEnt ;
      AV83Tpedobswwds_17_tfpedfec = AV61TFPedFec ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV67Tpedobswwds_1_filterfulltext ,
                                           AV69Tpedobswwds_3_tfemprcod_sel ,
                                           AV68Tpedobswwds_2_tfemprcod ,
                                           Integer.valueOf(AV70Tpedobswwds_4_tfpedcod) ,
                                           Integer.valueOf(AV71Tpedobswwds_5_tfpedcod_to) ,
                                           Byte.valueOf(AV72Tpedobswwds_6_tfpedobsul) ,
                                           Byte.valueOf(AV73Tpedobswwds_7_tfpedobsul_to) ,
                                           AV75Tpedobswwds_9_tfemprnom_sel ,
                                           AV74Tpedobswwds_8_tfemprnom ,
                                           Byte.valueOf(AV76Tpedobswwds_10_tfpedconlin) ,
                                           Byte.valueOf(AV77Tpedobswwds_11_tfpedconlin_to) ,
                                           AV79Tpedobswwds_13_tfpedperdes_sel ,
                                           AV78Tpedobswwds_12_tfpedperdes ,
                                           AV81Tpedobswwds_15_tfpedperpet_sel ,
                                           AV80Tpedobswwds_14_tfpedperpet ,
                                           AV82Tpedobswwds_16_tfpedfecent ,
                                           AV83Tpedobswwds_17_tfpedfec ,
                                           A396EmprCod ,
                                           Integer.valueOf(A658PedCod) ,
                                           Byte.valueOf(A2503PedObsUL) ,
                                           A407EmprNom ,
                                           Byte.valueOf(A5049PedConLin) ,
                                           A8154PedPerDes ,
                                           A8155PedPerPet ,
                                           A662PedFecEnt ,
                                           A661PedFec ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV67Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tpedobswwds_1_filterfulltext), "%", "") ;
      lV67Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tpedobswwds_1_filterfulltext), "%", "") ;
      lV67Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tpedobswwds_1_filterfulltext), "%", "") ;
      lV67Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tpedobswwds_1_filterfulltext), "%", "") ;
      lV67Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tpedobswwds_1_filterfulltext), "%", "") ;
      lV67Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tpedobswwds_1_filterfulltext), "%", "") ;
      lV67Tpedobswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tpedobswwds_1_filterfulltext), "%", "") ;
      lV68Tpedobswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV68Tpedobswwds_2_tfemprcod), 3, "%") ;
      lV74Tpedobswwds_8_tfemprnom = GXutil.padr( GXutil.rtrim( AV74Tpedobswwds_8_tfemprnom), 30, "%") ;
      lV78Tpedobswwds_12_tfpedperdes = GXutil.padr( GXutil.rtrim( AV78Tpedobswwds_12_tfpedperdes), 30, "%") ;
      lV80Tpedobswwds_14_tfpedperpet = GXutil.padr( GXutil.rtrim( AV80Tpedobswwds_14_tfpedperpet), 30, "%") ;
      /* Using cursor P08PF3 */
      pr_default.execute(0, new Object[] {lV67Tpedobswwds_1_filterfulltext, lV67Tpedobswwds_1_filterfulltext, lV67Tpedobswwds_1_filterfulltext, lV67Tpedobswwds_1_filterfulltext, lV67Tpedobswwds_1_filterfulltext, lV67Tpedobswwds_1_filterfulltext, lV67Tpedobswwds_1_filterfulltext, lV68Tpedobswwds_2_tfemprcod, AV69Tpedobswwds_3_tfemprcod_sel, Integer.valueOf(AV70Tpedobswwds_4_tfpedcod), Integer.valueOf(AV71Tpedobswwds_5_tfpedcod_to), Byte.valueOf(AV72Tpedobswwds_6_tfpedobsul), Byte.valueOf(AV73Tpedobswwds_7_tfpedobsul_to), lV74Tpedobswwds_8_tfemprnom, AV75Tpedobswwds_9_tfemprnom_sel, Byte.valueOf(AV76Tpedobswwds_10_tfpedconlin), Byte.valueOf(AV77Tpedobswwds_11_tfpedconlin_to), lV78Tpedobswwds_12_tfpedperdes, AV79Tpedobswwds_13_tfpedperdes_sel, lV80Tpedobswwds_14_tfpedperpet, AV81Tpedobswwds_15_tfpedperpet_sel, AV82Tpedobswwds_16_tfpedfecent, AV83Tpedobswwds_17_tfpedfec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A661PedFec = P08PF3_A661PedFec[0] ;
         A662PedFecEnt = P08PF3_A662PedFecEnt[0] ;
         A8155PedPerPet = P08PF3_A8155PedPerPet[0] ;
         A8154PedPerDes = P08PF3_A8154PedPerDes[0] ;
         A407EmprNom = P08PF3_A407EmprNom[0] ;
         n407EmprNom = P08PF3_n407EmprNom[0] ;
         A2503PedObsUL = P08PF3_A2503PedObsUL[0] ;
         n2503PedObsUL = P08PF3_n2503PedObsUL[0] ;
         A658PedCod = P08PF3_A658PedCod[0] ;
         A396EmprCod = P08PF3_A396EmprCod[0] ;
         A5049PedConLin = P08PF3_A5049PedConLin[0] ;
         n5049PedConLin = P08PF3_n5049PedConLin[0] ;
         A407EmprNom = P08PF3_A407EmprNom[0] ;
         n407EmprNom = P08PF3_n407EmprNom[0] ;
         A5049PedConLin = P08PF3_A5049PedConLin[0] ;
         n5049PedConLin = P08PF3_n5049PedConLin[0] ;
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
            tpedobswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A658PedCod, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2503PedObsUL, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A407EmprNom, ";", ","), GXv_char3) ;
            tpedobswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5049PedConLin, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A8154PedPerDes, ";", ","), GXv_char3) ;
            tpedobswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A8155PedPerPet, ";", ","), GXv_char3) ;
            tpedobswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A662PedFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A661PedFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TPEDOBSWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PedCod", "", "Nº Pedido", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PedObsUL", "", "Ultima Linea Observaciones", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PedConLin", "", "Contador de lineas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PedPerDes", "", "Destinatario Pedido Compras", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PedPerPet", "", "Peticionario Pedido Compras", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PedFecEnt", "", "Fecha Entrega Prevista", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PedFec", "", "Fecha Pedido", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TPEDOBSWWColumnsSelector", GXv_char3) ;
      tpedobswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TPEDOBSWWGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPEDOBSWWGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV19Session.getValue("TPEDOBSWWGridState"), null, null);
      }
      AV28OrderedBy = AV43GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV43GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV84GXV1 = 1 ;
      while ( AV84GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV84GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV63FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV45TFEmprCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV46TFEmprCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV47TFPedCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFPedCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDOBSUL") == 0 )
         {
            AV49TFPedObsUL = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFPedObsUL_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV51TFEmprNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV52TFEmprNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCONLIN") == 0 )
         {
            AV53TFPedConLin = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFPedConLin_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPERDES") == 0 )
         {
            AV55TFPedPerDes = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPERDES_SEL") == 0 )
         {
            AV56TFPedPerDes_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPERPET") == 0 )
         {
            AV57TFPedPerPet = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPERPET_SEL") == 0 )
         {
            AV58TFPedPerPet_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFECENT") == 0 )
         {
            AV59TFPedFecEnt = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFEC") == 0 )
         {
            AV61TFPedFec = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV84GXV1 = (int)(AV84GXV1+1) ;
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
      A8154PedPerDes = "" ;
      A8155PedPerPet = "" ;
      A662PedFecEnt = GXutil.nullDate() ;
      A661PedFec = GXutil.nullDate() ;
      AV67Tpedobswwds_1_filterfulltext = "" ;
      AV63FilterFullText = "" ;
      AV68Tpedobswwds_2_tfemprcod = "" ;
      AV45TFEmprCod = "" ;
      AV69Tpedobswwds_3_tfemprcod_sel = "" ;
      AV46TFEmprCod_Sel = "" ;
      AV74Tpedobswwds_8_tfemprnom = "" ;
      AV51TFEmprNom = "" ;
      AV75Tpedobswwds_9_tfemprnom_sel = "" ;
      AV52TFEmprNom_Sel = "" ;
      AV78Tpedobswwds_12_tfpedperdes = "" ;
      AV55TFPedPerDes = "" ;
      AV79Tpedobswwds_13_tfpedperdes_sel = "" ;
      AV56TFPedPerDes_Sel = "" ;
      AV80Tpedobswwds_14_tfpedperpet = "" ;
      AV57TFPedPerPet = "" ;
      AV81Tpedobswwds_15_tfpedperpet_sel = "" ;
      AV58TFPedPerPet_Sel = "" ;
      AV82Tpedobswwds_16_tfpedfecent = GXutil.nullDate() ;
      AV59TFPedFecEnt = GXutil.nullDate() ;
      AV83Tpedobswwds_17_tfpedfec = GXutil.nullDate() ;
      AV61TFPedFec = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV67Tpedobswwds_1_filterfulltext = "" ;
      lV68Tpedobswwds_2_tfemprcod = "" ;
      lV74Tpedobswwds_8_tfemprnom = "" ;
      lV78Tpedobswwds_12_tfpedperdes = "" ;
      lV80Tpedobswwds_14_tfpedperpet = "" ;
      P08PF3_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08PF3_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PF3_A8155PedPerPet = new String[] {""} ;
      P08PF3_A8154PedPerDes = new String[] {""} ;
      P08PF3_A407EmprNom = new String[] {""} ;
      P08PF3_n407EmprNom = new boolean[] {false} ;
      P08PF3_A2503PedObsUL = new byte[1] ;
      P08PF3_n2503PedObsUL = new boolean[] {false} ;
      P08PF3_A658PedCod = new int[1] ;
      P08PF3_A396EmprCod = new String[] {""} ;
      P08PF3_A5049PedConLin = new byte[1] ;
      P08PF3_n5049PedConLin = new boolean[] {false} ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpedobswwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08PF3_A661PedFec, P08PF3_A662PedFecEnt, P08PF3_A8155PedPerPet, P08PF3_A8154PedPerDes, P08PF3_A407EmprNom, P08PF3_n407EmprNom, P08PF3_A2503PedObsUL, P08PF3_n2503PedObsUL, P08PF3_A658PedCod, P08PF3_A396EmprCod,
            P08PF3_A5049PedConLin, P08PF3_n5049PedConLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A2503PedObsUL ;
   private byte A5049PedConLin ;
   private byte AV72Tpedobswwds_6_tfpedobsul ;
   private byte AV49TFPedObsUL ;
   private byte AV73Tpedobswwds_7_tfpedobsul_to ;
   private byte AV50TFPedObsUL_To ;
   private byte AV76Tpedobswwds_10_tfpedconlin ;
   private byte AV53TFPedConLin ;
   private byte AV77Tpedobswwds_11_tfpedconlin_to ;
   private byte AV54TFPedConLin_To ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A658PedCod ;
   private int AV70Tpedobswwds_4_tfpedcod ;
   private int AV47TFPedCod ;
   private int AV71Tpedobswwds_5_tfpedcod_to ;
   private int AV48TFPedCod_To ;
   private int AV84GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String A8154PedPerDes ;
   private String A8155PedPerPet ;
   private String AV68Tpedobswwds_2_tfemprcod ;
   private String AV45TFEmprCod ;
   private String AV69Tpedobswwds_3_tfemprcod_sel ;
   private String AV46TFEmprCod_Sel ;
   private String AV74Tpedobswwds_8_tfemprnom ;
   private String AV51TFEmprNom ;
   private String AV75Tpedobswwds_9_tfemprnom_sel ;
   private String AV52TFEmprNom_Sel ;
   private String AV78Tpedobswwds_12_tfpedperdes ;
   private String AV55TFPedPerDes ;
   private String AV79Tpedobswwds_13_tfpedperdes_sel ;
   private String AV56TFPedPerDes_Sel ;
   private String AV80Tpedobswwds_14_tfpedperpet ;
   private String AV57TFPedPerPet ;
   private String AV81Tpedobswwds_15_tfpedperpet_sel ;
   private String AV58TFPedPerPet_Sel ;
   private String scmdbuf ;
   private String lV68Tpedobswwds_2_tfemprcod ;
   private String lV74Tpedobswwds_8_tfemprnom ;
   private String lV78Tpedobswwds_12_tfpedperdes ;
   private String lV80Tpedobswwds_14_tfpedperpet ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A662PedFecEnt ;
   private java.util.Date A661PedFec ;
   private java.util.Date AV82Tpedobswwds_16_tfpedfecent ;
   private java.util.Date AV59TFPedFecEnt ;
   private java.util.Date AV83Tpedobswwds_17_tfpedfec ;
   private java.util.Date AV61TFPedFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n407EmprNom ;
   private boolean n2503PedObsUL ;
   private boolean n5049PedConLin ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV67Tpedobswwds_1_filterfulltext ;
   private String AV63FilterFullText ;
   private String lV67Tpedobswwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P08PF3_A661PedFec ;
   private java.util.Date[] P08PF3_A662PedFecEnt ;
   private String[] P08PF3_A8155PedPerPet ;
   private String[] P08PF3_A8154PedPerDes ;
   private String[] P08PF3_A407EmprNom ;
   private boolean[] P08PF3_n407EmprNom ;
   private byte[] P08PF3_A2503PedObsUL ;
   private boolean[] P08PF3_n2503PedObsUL ;
   private int[] P08PF3_A658PedCod ;
   private String[] P08PF3_A396EmprCod ;
   private byte[] P08PF3_A5049PedConLin ;
   private boolean[] P08PF3_n5049PedConLin ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class tpedobswwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08PF3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Tpedobswwds_1_filterfulltext ,
                                          String AV69Tpedobswwds_3_tfemprcod_sel ,
                                          String AV68Tpedobswwds_2_tfemprcod ,
                                          int AV70Tpedobswwds_4_tfpedcod ,
                                          int AV71Tpedobswwds_5_tfpedcod_to ,
                                          byte AV72Tpedobswwds_6_tfpedobsul ,
                                          byte AV73Tpedobswwds_7_tfpedobsul_to ,
                                          String AV75Tpedobswwds_9_tfemprnom_sel ,
                                          String AV74Tpedobswwds_8_tfemprnom ,
                                          byte AV76Tpedobswwds_10_tfpedconlin ,
                                          byte AV77Tpedobswwds_11_tfpedconlin_to ,
                                          String AV79Tpedobswwds_13_tfpedperdes_sel ,
                                          String AV78Tpedobswwds_12_tfpedperdes ,
                                          String AV81Tpedobswwds_15_tfpedperpet_sel ,
                                          String AV80Tpedobswwds_14_tfpedperpet ,
                                          java.util.Date AV82Tpedobswwds_16_tfpedfecent ,
                                          java.util.Date AV83Tpedobswwds_17_tfpedfec ,
                                          String A396EmprCod ,
                                          int A658PedCod ,
                                          byte A2503PedObsUL ,
                                          String A407EmprNom ,
                                          byte A5049PedConLin ,
                                          String A8154PedPerDes ,
                                          String A8155PedPerPet ,
                                          java.util.Date A662PedFecEnt ,
                                          java.util.Date A661PedFec ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[23];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PedFec, T1.PedFecEnt, T1.PedPerPet, T1.PedPerDes, T2.EmprNom, T1.PedObsUL, T1.PedCod, T1.EmprCod, COALESCE( T3.PedConLin, 0) AS PedConLin FROM ((TXPCPEDID" ;
      scmdbuf += " T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS PedConLin, EmprCod, PedCod FROM TXPOBSPED GROUP BY EmprCod, PedCod ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.PedCod = T1.PedCod)" ;
      if ( ! (GXutil.strcmp("", AV67Tpedobswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedObsUL,'90'), 2) like '%' || ?) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.PedConLin, 0),'90'), 2) like '%' || ?) or ( UPPER(T1.PedPerDes) like '%' || UPPER(?)) or ( UPPER(T1.PedPerPet) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV69Tpedobswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Tpedobswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Tpedobswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV70Tpedobswwds_4_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV71Tpedobswwds_5_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV72Tpedobswwds_6_tfpedobsul) )
      {
         addWhere(sWhereString, "(T1.PedObsUL >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV73Tpedobswwds_7_tfpedobsul_to) )
      {
         addWhere(sWhereString, "(T1.PedObsUL <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Tpedobswwds_9_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Tpedobswwds_8_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Tpedobswwds_9_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV76Tpedobswwds_10_tfpedconlin) )
      {
         addWhere(sWhereString, "(COALESCE( T3.PedConLin, 0) >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV77Tpedobswwds_11_tfpedconlin_to) )
      {
         addWhere(sWhereString, "(COALESCE( T3.PedConLin, 0) <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Tpedobswwds_13_tfpedperdes_sel)==0) && ( ! (GXutil.strcmp("", AV78Tpedobswwds_12_tfpedperdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedPerDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tpedobswwds_13_tfpedperdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PedPerDes = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Tpedobswwds_15_tfpedperpet_sel)==0) && ( ! (GXutil.strcmp("", AV80Tpedobswwds_14_tfpedperpet)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedPerPet) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Tpedobswwds_15_tfpedperpet_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PedPerPet = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82Tpedobswwds_16_tfpedfecent)) )
      {
         addWhere(sWhereString, "(T1.PedFecEnt >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Tpedobswwds_17_tfpedfec)) )
      {
         addWhere(sWhereString, "(T1.PedFec >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedObsUL" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedObsUL DESC" ;
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
         scmdbuf += " ORDER BY T1.PedCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.EmprNom" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.EmprNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedPerDes" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedPerDes DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedPerPet" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedPerPet DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedFecEnt" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedFecEnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedFec" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedFec DESC" ;
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
                  return conditional_P08PF3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PF3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               return;
      }
   }

}

