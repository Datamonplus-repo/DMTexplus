package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcdetalleproductosexportcsv_impl extends GXWebProcedure
{
   public wcdetalleproductosexportcsv_impl( com.genexus.internet.HttpContext context )
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
      S181 ();
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
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S171 ();
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
      AV11Filename = "./PrivateTempStorage/" + "WCDetalleProductosExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      AV14TextFileLine += "#" ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Producto", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Descripcion", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Factor", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Und", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Teorica", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Final", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Añadida", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += "%" ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Nº orden", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Tq", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Usuario", "") ;
      AV14TextFileLine += ";" ;
      AV14TextFileLine += httpContext.getMessage( "Fecha", "") ;
      AV10TextFile.writeLine(AV14TextFileLine);
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV69Wcdetalleproductosds_1_tfhrereclin = AV64TFHreRecLin ;
      AV70Wcdetalleproductosds_2_tfhrereclin_to = AV65TFHreRecLin_To ;
      AV71Wcdetalleproductosds_3_tfhreprdnum = AV34TFHrePrdNum ;
      AV72Wcdetalleproductosds_4_tfhreprdnum_sel = AV35TFHrePrdNum_Sel ;
      AV73Wcdetalleproductosds_5_tfhreprddsc = AV36TFHrePrdDsc ;
      AV74Wcdetalleproductosds_6_tfhreprddsc_sel = AV37TFHrePrdDsc_Sel ;
      AV75Wcdetalleproductosds_7_tfhrefaccon = AV48TFHreFacCon ;
      AV76Wcdetalleproductosds_8_tfhrefaccon_to = AV49TFHreFacCon_To ;
      AV77Wcdetalleproductosds_9_tfhreprduds = AV50TFHrePrdUDs ;
      AV78Wcdetalleproductosds_10_tfhreprduds_sel = AV51TFHrePrdUDs_Sel ;
      AV79Wcdetalleproductosds_11_tfhreprdcant = AV52TFHrePrdCant ;
      AV80Wcdetalleproductosds_12_tfhreprdcant_to = AV53TFHrePrdCant_To ;
      AV81Wcdetalleproductosds_13_tfhrecanany = AV56TFHreCanAny ;
      AV82Wcdetalleproductosds_14_tfhrecanany_to = AV57TFHreCanAny_To ;
      AV83Wcdetalleproductosds_15_tfhrefornro = AV58TFHreForNro ;
      AV84Wcdetalleproductosds_16_tfhrefornro_to = AV59TFHreForNro_To ;
      AV85Wcdetalleproductosds_17_tfhreprdtnq = AV60TFHrePrdTnq ;
      AV86Wcdetalleproductosds_18_tfhreprdtnq_to = AV61TFHrePrdTnq_To ;
      AV87Wcdetalleproductosds_19_tfhrelinusr = AV62TFHreLinUsr ;
      AV88Wcdetalleproductosds_20_tfhrelinusr_sel = AV63TFHreLinUsr_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV69Wcdetalleproductosds_1_tfhrereclin) ,
                                           Short.valueOf(AV70Wcdetalleproductosds_2_tfhrereclin_to) ,
                                           AV72Wcdetalleproductosds_4_tfhreprdnum_sel ,
                                           AV71Wcdetalleproductosds_3_tfhreprdnum ,
                                           AV74Wcdetalleproductosds_6_tfhreprddsc_sel ,
                                           AV73Wcdetalleproductosds_5_tfhreprddsc ,
                                           AV75Wcdetalleproductosds_7_tfhrefaccon ,
                                           AV76Wcdetalleproductosds_8_tfhrefaccon_to ,
                                           AV78Wcdetalleproductosds_10_tfhreprduds_sel ,
                                           AV77Wcdetalleproductosds_9_tfhreprduds ,
                                           AV79Wcdetalleproductosds_11_tfhreprdcant ,
                                           AV80Wcdetalleproductosds_12_tfhreprdcant_to ,
                                           AV81Wcdetalleproductosds_13_tfhrecanany ,
                                           AV82Wcdetalleproductosds_14_tfhrecanany_to ,
                                           Byte.valueOf(AV83Wcdetalleproductosds_15_tfhrefornro) ,
                                           Byte.valueOf(AV84Wcdetalleproductosds_16_tfhrefornro_to) ,
                                           Byte.valueOf(AV85Wcdetalleproductosds_17_tfhreprdtnq) ,
                                           Byte.valueOf(AV86Wcdetalleproductosds_18_tfhreprdtnq_to) ,
                                           AV88Wcdetalleproductosds_20_tfhrelinusr_sel ,
                                           AV87Wcdetalleproductosds_19_tfhrelinusr ,
                                           Short.valueOf(A4557HreRecLin) ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4562HreFacCon ,
                                           A4561HrePrdUDs ,
                                           A4563HrePrdCant ,
                                           A4565HreCanAny ,
                                           Byte.valueOf(A4566HreForNro) ,
                                           Byte.valueOf(A4567HrePrdTnq) ,
                                           A4582HreLinUsr ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV38EmprCod ,
                                           Integer.valueOf(AV39HreBarCod) ,
                                           Byte.valueOf(AV40HreBarReo) ,
                                           AV41HreBarPar ,
                                           Byte.valueOf(AV42HreNumCie) ,
                                           Short.valueOf(AV43HreLinMaq) ,
                                           Byte.valueOf(AV44HreLinPro) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Byte.valueOf(A4550HreLinPro) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BYTE
                                           }
      });
      lV71Wcdetalleproductosds_3_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV71Wcdetalleproductosds_3_tfhreprdnum), 6, "%") ;
      lV73Wcdetalleproductosds_5_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV73Wcdetalleproductosds_5_tfhreprddsc), 26, "%") ;
      lV77Wcdetalleproductosds_9_tfhreprduds = GXutil.padr( GXutil.rtrim( AV77Wcdetalleproductosds_9_tfhreprduds), 5, "%") ;
      lV87Wcdetalleproductosds_19_tfhrelinusr = GXutil.padr( GXutil.rtrim( AV87Wcdetalleproductosds_19_tfhrelinusr), 8, "%") ;
      /* Using cursor P08ZD2 */
      pr_default.execute(0, new Object[] {AV38EmprCod, Integer.valueOf(AV39HreBarCod), Byte.valueOf(AV40HreBarReo), AV41HreBarPar, Byte.valueOf(AV42HreNumCie), Short.valueOf(AV43HreLinMaq), Byte.valueOf(AV44HreLinPro), Short.valueOf(AV69Wcdetalleproductosds_1_tfhrereclin), Short.valueOf(AV70Wcdetalleproductosds_2_tfhrereclin_to), lV71Wcdetalleproductosds_3_tfhreprdnum, AV72Wcdetalleproductosds_4_tfhreprdnum_sel, lV73Wcdetalleproductosds_5_tfhreprddsc, AV74Wcdetalleproductosds_6_tfhreprddsc_sel, AV75Wcdetalleproductosds_7_tfhrefaccon, AV76Wcdetalleproductosds_8_tfhrefaccon_to, lV77Wcdetalleproductosds_9_tfhreprduds, AV78Wcdetalleproductosds_10_tfhreprduds_sel, AV79Wcdetalleproductosds_11_tfhreprdcant, AV80Wcdetalleproductosds_12_tfhreprdcant_to, AV81Wcdetalleproductosds_13_tfhrecanany, AV82Wcdetalleproductosds_14_tfhrecanany_to, Byte.valueOf(AV83Wcdetalleproductosds_15_tfhrefornro), Byte.valueOf(AV84Wcdetalleproductosds_16_tfhrefornro_to), Byte.valueOf(AV85Wcdetalleproductosds_17_tfhreprdtnq), Byte.valueOf(AV86Wcdetalleproductosds_18_tfhreprdtnq_to), lV87Wcdetalleproductosds_19_tfhrelinusr, AV88Wcdetalleproductosds_20_tfhrelinusr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4550HreLinPro = P08ZD2_A4550HreLinPro[0] ;
         A4545HreLinMaq = P08ZD2_A4545HreLinMaq[0] ;
         A4495HreNumCie = P08ZD2_A4495HreNumCie[0] ;
         A4494HreBarPar = P08ZD2_A4494HreBarPar[0] ;
         A4493HreBarReo = P08ZD2_A4493HreBarReo[0] ;
         A4492HreBarCod = P08ZD2_A4492HreBarCod[0] ;
         A396EmprCod = P08ZD2_A396EmprCod[0] ;
         A4582HreLinUsr = P08ZD2_A4582HreLinUsr[0] ;
         n4582HreLinUsr = P08ZD2_n4582HreLinUsr[0] ;
         A4567HrePrdTnq = P08ZD2_A4567HrePrdTnq[0] ;
         n4567HrePrdTnq = P08ZD2_n4567HrePrdTnq[0] ;
         A4566HreForNro = P08ZD2_A4566HreForNro[0] ;
         n4566HreForNro = P08ZD2_n4566HreForNro[0] ;
         A4565HreCanAny = P08ZD2_A4565HreCanAny[0] ;
         n4565HreCanAny = P08ZD2_n4565HreCanAny[0] ;
         A4563HrePrdCant = P08ZD2_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P08ZD2_n4563HrePrdCant[0] ;
         A4561HrePrdUDs = P08ZD2_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P08ZD2_n4561HrePrdUDs[0] ;
         A4562HreFacCon = P08ZD2_A4562HreFacCon[0] ;
         n4562HreFacCon = P08ZD2_n4562HreFacCon[0] ;
         A4559HrePrdDsc = P08ZD2_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P08ZD2_n4559HrePrdDsc[0] ;
         A4558HrePrdNum = P08ZD2_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P08ZD2_n4558HrePrdNum[0] ;
         A4557HreRecLin = P08ZD2_A4557HreRecLin[0] ;
         A4564HreCanFin = P08ZD2_A4564HreCanFin[0] ;
         n4564HreCanFin = P08ZD2_n4564HreCanFin[0] ;
         A4583HrePesFec = P08ZD2_A4583HrePesFec[0] ;
         n4583HrePesFec = P08ZD2_n4583HrePesFec[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S152 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV14TextFileLine += GXutil.str( A4557HreRecLin, 4, 0) ;
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4558HrePrdNum, ";", ","), GXv_char3) ;
         wcdetalleproductosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4559HrePrdDsc, ";", ","), GXv_char3) ;
         wcdetalleproductosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A4562HreFacCon, 11, 5) ;
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4561HrePrdUDs, ";", ","), GXv_char3) ;
         wcdetalleproductosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
         AV45HreCanFin = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A4564HreCanFin)==0) ? A4563HrePrdCant : A4564HreCanFin) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV45HreCanFin, 11, 3) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A4563HrePrdCant, 11, 3) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A4565HreCanAny, 11, 3) ;
         AV46Porc = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45HreCanFin)==0) ? DecimalUtil.doubleToDec(0) : (A4565HreCanAny.divide(AV45HreCanFin, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( AV46Porc, 6, 2) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A4566HreForNro, 2, 0) ;
         AV14TextFileLine += ";" ;
         AV14TextFileLine += GXutil.str( A4567HrePrdTnq, 2, 0) ;
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4582HreLinUsr, ";", ","), GXv_char3) ;
         wcdetalleproductosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
         AV47FechaPes = (!(GXutil.strcmp("", A4582HreLinUsr)==0) ? localUtil.ttoc( A4583HrePesFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") : "") ;
         AV14TextFileLine += ";" ;
         GXt_char2 = AV14TextFileLine ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV47FechaPes, ";", ","), GXv_char3) ;
         wcdetalleproductosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         AV14TextFileLine += GXt_char2 ;
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV10TextFile.writeLine(AV14TextFileLine);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S171( )
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCDetalleProductosExportCSV.csv");
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

   public void S181( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WCDetalleProductosGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCDetalleProductosGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("WCDetalleProductosGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV89GXV1 = 1 ;
      while ( AV89GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV89GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRERECLIN") == 0 )
         {
            AV64TFHreRecLin = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFHreRecLin_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM") == 0 )
         {
            AV34TFHrePrdNum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM_SEL") == 0 )
         {
            AV35TFHrePrdNum_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC") == 0 )
         {
            AV36TFHrePrdDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC_SEL") == 0 )
         {
            AV37TFHrePrdDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREFACCON") == 0 )
         {
            AV48TFHreFacCon = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFHreFacCon_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS") == 0 )
         {
            AV50TFHrePrdUDs = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS_SEL") == 0 )
         {
            AV51TFHrePrdUDs_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCANT") == 0 )
         {
            AV52TFHrePrdCant = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFHrePrdCant_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRECANANY") == 0 )
         {
            AV56TFHreCanAny = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV57TFHreCanAny_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREFORNRO") == 0 )
         {
            AV58TFHreForNro = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFHreForNro_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDTNQ") == 0 )
         {
            AV60TFHrePrdTnq = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFHrePrdTnq_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINUSR") == 0 )
         {
            AV62TFHreLinUsr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINUSR_SEL") == 0 )
         {
            AV63TFHreLinUsr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV38EmprCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV39HreBarCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV40HreBarReo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV41HreBarPar = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV42HreNumCie = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINMAQ") == 0 )
         {
            AV43HreLinMaq = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINPRO") == 0 )
         {
            AV44HreLinPro = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV89GXV1 = (int)(AV89GXV1+1) ;
      }
   }

   public void S152( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S162( )
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
      A4558HrePrdNum = "" ;
      A4559HrePrdDsc = "" ;
      A4562HreFacCon = DecimalUtil.ZERO ;
      A4561HrePrdUDs = "" ;
      A4564HreCanFin = DecimalUtil.ZERO ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      A4582HreLinUsr = "" ;
      A4583HrePesFec = GXutil.resetTime( GXutil.nullDate() );
      AV71Wcdetalleproductosds_3_tfhreprdnum = "" ;
      AV34TFHrePrdNum = "" ;
      AV72Wcdetalleproductosds_4_tfhreprdnum_sel = "" ;
      AV35TFHrePrdNum_Sel = "" ;
      AV73Wcdetalleproductosds_5_tfhreprddsc = "" ;
      AV36TFHrePrdDsc = "" ;
      AV74Wcdetalleproductosds_6_tfhreprddsc_sel = "" ;
      AV37TFHrePrdDsc_Sel = "" ;
      AV75Wcdetalleproductosds_7_tfhrefaccon = DecimalUtil.ZERO ;
      AV48TFHreFacCon = DecimalUtil.ZERO ;
      AV76Wcdetalleproductosds_8_tfhrefaccon_to = DecimalUtil.ZERO ;
      AV49TFHreFacCon_To = DecimalUtil.ZERO ;
      AV77Wcdetalleproductosds_9_tfhreprduds = "" ;
      AV50TFHrePrdUDs = "" ;
      AV78Wcdetalleproductosds_10_tfhreprduds_sel = "" ;
      AV51TFHrePrdUDs_Sel = "" ;
      AV79Wcdetalleproductosds_11_tfhreprdcant = DecimalUtil.ZERO ;
      AV52TFHrePrdCant = DecimalUtil.ZERO ;
      AV80Wcdetalleproductosds_12_tfhreprdcant_to = DecimalUtil.ZERO ;
      AV53TFHrePrdCant_To = DecimalUtil.ZERO ;
      AV81Wcdetalleproductosds_13_tfhrecanany = DecimalUtil.ZERO ;
      AV56TFHreCanAny = DecimalUtil.ZERO ;
      AV82Wcdetalleproductosds_14_tfhrecanany_to = DecimalUtil.ZERO ;
      AV57TFHreCanAny_To = DecimalUtil.ZERO ;
      AV87Wcdetalleproductosds_19_tfhrelinusr = "" ;
      AV62TFHreLinUsr = "" ;
      AV88Wcdetalleproductosds_20_tfhrelinusr_sel = "" ;
      AV63TFHreLinUsr_Sel = "" ;
      scmdbuf = "" ;
      lV71Wcdetalleproductosds_3_tfhreprdnum = "" ;
      lV73Wcdetalleproductosds_5_tfhreprddsc = "" ;
      lV77Wcdetalleproductosds_9_tfhreprduds = "" ;
      lV87Wcdetalleproductosds_19_tfhrelinusr = "" ;
      AV38EmprCod = "" ;
      AV41HreBarPar = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P08ZD2_A4550HreLinPro = new byte[1] ;
      P08ZD2_A4545HreLinMaq = new short[1] ;
      P08ZD2_A4495HreNumCie = new byte[1] ;
      P08ZD2_A4494HreBarPar = new String[] {""} ;
      P08ZD2_A4493HreBarReo = new byte[1] ;
      P08ZD2_A4492HreBarCod = new int[1] ;
      P08ZD2_A396EmprCod = new String[] {""} ;
      P08ZD2_A4582HreLinUsr = new String[] {""} ;
      P08ZD2_n4582HreLinUsr = new boolean[] {false} ;
      P08ZD2_A4567HrePrdTnq = new byte[1] ;
      P08ZD2_n4567HrePrdTnq = new boolean[] {false} ;
      P08ZD2_A4566HreForNro = new byte[1] ;
      P08ZD2_n4566HreForNro = new boolean[] {false} ;
      P08ZD2_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZD2_n4565HreCanAny = new boolean[] {false} ;
      P08ZD2_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZD2_n4563HrePrdCant = new boolean[] {false} ;
      P08ZD2_A4561HrePrdUDs = new String[] {""} ;
      P08ZD2_n4561HrePrdUDs = new boolean[] {false} ;
      P08ZD2_A4562HreFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZD2_n4562HreFacCon = new boolean[] {false} ;
      P08ZD2_A4559HrePrdDsc = new String[] {""} ;
      P08ZD2_n4559HrePrdDsc = new boolean[] {false} ;
      P08ZD2_A4558HrePrdNum = new String[] {""} ;
      P08ZD2_n4558HrePrdNum = new boolean[] {false} ;
      P08ZD2_A4557HreRecLin = new short[1] ;
      P08ZD2_A4564HreCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZD2_n4564HreCanFin = new boolean[] {false} ;
      P08ZD2_A4583HrePesFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZD2_n4583HrePesFec = new boolean[] {false} ;
      AV45HreCanFin = DecimalUtil.ZERO ;
      AV46Porc = DecimalUtil.ZERO ;
      AV47FechaPes = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV19Session = httpContext.getWebSession();
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcdetalleproductosexportcsv__default(),
         new Object[] {
             new Object[] {
            P08ZD2_A4550HreLinPro, P08ZD2_A4545HreLinMaq, P08ZD2_A4495HreNumCie, P08ZD2_A4494HreBarPar, P08ZD2_A4493HreBarReo, P08ZD2_A4492HreBarCod, P08ZD2_A396EmprCod, P08ZD2_A4582HreLinUsr, P08ZD2_n4582HreLinUsr, P08ZD2_A4567HrePrdTnq,
            P08ZD2_n4567HrePrdTnq, P08ZD2_A4566HreForNro, P08ZD2_n4566HreForNro, P08ZD2_A4565HreCanAny, P08ZD2_n4565HreCanAny, P08ZD2_A4563HrePrdCant, P08ZD2_n4563HrePrdCant, P08ZD2_A4561HrePrdUDs, P08ZD2_n4561HrePrdUDs, P08ZD2_A4562HreFacCon,
            P08ZD2_n4562HreFacCon, P08ZD2_A4559HrePrdDsc, P08ZD2_n4559HrePrdDsc, P08ZD2_A4558HrePrdNum, P08ZD2_n4558HrePrdNum, P08ZD2_A4557HreRecLin, P08ZD2_A4564HreCanFin, P08ZD2_n4564HreCanFin, P08ZD2_A4583HrePesFec, P08ZD2_n4583HrePesFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4566HreForNro ;
   private byte A4567HrePrdTnq ;
   private byte AV83Wcdetalleproductosds_15_tfhrefornro ;
   private byte AV58TFHreForNro ;
   private byte AV84Wcdetalleproductosds_16_tfhrefornro_to ;
   private byte AV59TFHreForNro_To ;
   private byte AV85Wcdetalleproductosds_17_tfhreprdtnq ;
   private byte AV60TFHrePrdTnq ;
   private byte AV86Wcdetalleproductosds_18_tfhreprdtnq_to ;
   private byte AV61TFHrePrdTnq_To ;
   private byte AV40HreBarReo ;
   private byte AV42HreNumCie ;
   private byte AV44HreLinPro ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short gxcookieaux ;
   private short A4557HreRecLin ;
   private short AV69Wcdetalleproductosds_1_tfhrereclin ;
   private short AV64TFHreRecLin ;
   private short AV70Wcdetalleproductosds_2_tfhrereclin_to ;
   private short AV65TFHreRecLin_To ;
   private short AV28OrderedBy ;
   private short AV43HreLinMaq ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV39HreBarCod ;
   private int A4492HreBarCod ;
   private int AV89GXV1 ;
   private java.math.BigDecimal A4562HreFacCon ;
   private java.math.BigDecimal A4564HreCanFin ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4565HreCanAny ;
   private java.math.BigDecimal AV75Wcdetalleproductosds_7_tfhrefaccon ;
   private java.math.BigDecimal AV48TFHreFacCon ;
   private java.math.BigDecimal AV76Wcdetalleproductosds_8_tfhrefaccon_to ;
   private java.math.BigDecimal AV49TFHreFacCon_To ;
   private java.math.BigDecimal AV79Wcdetalleproductosds_11_tfhreprdcant ;
   private java.math.BigDecimal AV52TFHrePrdCant ;
   private java.math.BigDecimal AV80Wcdetalleproductosds_12_tfhreprdcant_to ;
   private java.math.BigDecimal AV53TFHrePrdCant_To ;
   private java.math.BigDecimal AV81Wcdetalleproductosds_13_tfhrecanany ;
   private java.math.BigDecimal AV56TFHreCanAny ;
   private java.math.BigDecimal AV82Wcdetalleproductosds_14_tfhrecanany_to ;
   private java.math.BigDecimal AV57TFHreCanAny_To ;
   private java.math.BigDecimal AV45HreCanFin ;
   private java.math.BigDecimal AV46Porc ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A4558HrePrdNum ;
   private String A4559HrePrdDsc ;
   private String A4561HrePrdUDs ;
   private String A4582HreLinUsr ;
   private String AV71Wcdetalleproductosds_3_tfhreprdnum ;
   private String AV34TFHrePrdNum ;
   private String AV72Wcdetalleproductosds_4_tfhreprdnum_sel ;
   private String AV35TFHrePrdNum_Sel ;
   private String AV73Wcdetalleproductosds_5_tfhreprddsc ;
   private String AV36TFHrePrdDsc ;
   private String AV74Wcdetalleproductosds_6_tfhreprddsc_sel ;
   private String AV37TFHrePrdDsc_Sel ;
   private String AV77Wcdetalleproductosds_9_tfhreprduds ;
   private String AV50TFHrePrdUDs ;
   private String AV78Wcdetalleproductosds_10_tfhreprduds_sel ;
   private String AV51TFHrePrdUDs_Sel ;
   private String AV87Wcdetalleproductosds_19_tfhrelinusr ;
   private String AV62TFHreLinUsr ;
   private String AV88Wcdetalleproductosds_20_tfhrelinusr_sel ;
   private String AV63TFHreLinUsr_Sel ;
   private String scmdbuf ;
   private String lV71Wcdetalleproductosds_3_tfhreprdnum ;
   private String lV73Wcdetalleproductosds_5_tfhreprddsc ;
   private String lV77Wcdetalleproductosds_9_tfhreprduds ;
   private String lV87Wcdetalleproductosds_19_tfhrelinusr ;
   private String AV38EmprCod ;
   private String AV41HreBarPar ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String AV47FechaPes ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4583HrePesFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n4582HreLinUsr ;
   private boolean n4567HrePrdTnq ;
   private boolean n4566HreForNro ;
   private boolean n4565HreCanAny ;
   private boolean n4563HrePrdCant ;
   private boolean n4561HrePrdUDs ;
   private boolean n4562HreFacCon ;
   private boolean n4559HrePrdDsc ;
   private boolean n4558HrePrdNum ;
   private boolean n4564HreCanFin ;
   private boolean n4583HrePesFec ;
   private String AV14TextFileLine ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P08ZD2_A4550HreLinPro ;
   private short[] P08ZD2_A4545HreLinMaq ;
   private byte[] P08ZD2_A4495HreNumCie ;
   private String[] P08ZD2_A4494HreBarPar ;
   private byte[] P08ZD2_A4493HreBarReo ;
   private int[] P08ZD2_A4492HreBarCod ;
   private String[] P08ZD2_A396EmprCod ;
   private String[] P08ZD2_A4582HreLinUsr ;
   private boolean[] P08ZD2_n4582HreLinUsr ;
   private byte[] P08ZD2_A4567HrePrdTnq ;
   private boolean[] P08ZD2_n4567HrePrdTnq ;
   private byte[] P08ZD2_A4566HreForNro ;
   private boolean[] P08ZD2_n4566HreForNro ;
   private java.math.BigDecimal[] P08ZD2_A4565HreCanAny ;
   private boolean[] P08ZD2_n4565HreCanAny ;
   private java.math.BigDecimal[] P08ZD2_A4563HrePrdCant ;
   private boolean[] P08ZD2_n4563HrePrdCant ;
   private String[] P08ZD2_A4561HrePrdUDs ;
   private boolean[] P08ZD2_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P08ZD2_A4562HreFacCon ;
   private boolean[] P08ZD2_n4562HreFacCon ;
   private String[] P08ZD2_A4559HrePrdDsc ;
   private boolean[] P08ZD2_n4559HrePrdDsc ;
   private String[] P08ZD2_A4558HrePrdNum ;
   private boolean[] P08ZD2_n4558HrePrdNum ;
   private short[] P08ZD2_A4557HreRecLin ;
   private java.math.BigDecimal[] P08ZD2_A4564HreCanFin ;
   private boolean[] P08ZD2_n4564HreCanFin ;
   private java.util.Date[] P08ZD2_A4583HrePesFec ;
   private boolean[] P08ZD2_n4583HrePesFec ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class wcdetalleproductosexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08ZD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV69Wcdetalleproductosds_1_tfhrereclin ,
                                          short AV70Wcdetalleproductosds_2_tfhrereclin_to ,
                                          String AV72Wcdetalleproductosds_4_tfhreprdnum_sel ,
                                          String AV71Wcdetalleproductosds_3_tfhreprdnum ,
                                          String AV74Wcdetalleproductosds_6_tfhreprddsc_sel ,
                                          String AV73Wcdetalleproductosds_5_tfhreprddsc ,
                                          java.math.BigDecimal AV75Wcdetalleproductosds_7_tfhrefaccon ,
                                          java.math.BigDecimal AV76Wcdetalleproductosds_8_tfhrefaccon_to ,
                                          String AV78Wcdetalleproductosds_10_tfhreprduds_sel ,
                                          String AV77Wcdetalleproductosds_9_tfhreprduds ,
                                          java.math.BigDecimal AV79Wcdetalleproductosds_11_tfhreprdcant ,
                                          java.math.BigDecimal AV80Wcdetalleproductosds_12_tfhreprdcant_to ,
                                          java.math.BigDecimal AV81Wcdetalleproductosds_13_tfhrecanany ,
                                          java.math.BigDecimal AV82Wcdetalleproductosds_14_tfhrecanany_to ,
                                          byte AV83Wcdetalleproductosds_15_tfhrefornro ,
                                          byte AV84Wcdetalleproductosds_16_tfhrefornro_to ,
                                          byte AV85Wcdetalleproductosds_17_tfhreprdtnq ,
                                          byte AV86Wcdetalleproductosds_18_tfhreprdtnq_to ,
                                          String AV88Wcdetalleproductosds_20_tfhrelinusr_sel ,
                                          String AV87Wcdetalleproductosds_19_tfhrelinusr ,
                                          short A4557HreRecLin ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4562HreFacCon ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          java.math.BigDecimal A4565HreCanAny ,
                                          byte A4566HreForNro ,
                                          byte A4567HrePrdTnq ,
                                          String A4582HreLinUsr ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV38EmprCod ,
                                          int AV39HreBarCod ,
                                          byte AV40HreBarReo ,
                                          String AV41HreBarPar ,
                                          byte AV42HreNumCie ,
                                          short AV43HreLinMaq ,
                                          byte AV44HreLinPro ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq ,
                                          byte A4550HreLinPro )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[27];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT HreLinPro, HreLinMaq, HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreLinUsr, HrePrdTnq, HreForNro, HreCanAny, HrePrdCant, HrePrdUDs, HreFacCon, HrePrdDsc," ;
      scmdbuf += " HrePrdNum, HreRecLin, HreCanFin, HrePesFec FROM TXPHISLRE" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreLinPro = ?)");
      if ( ! (0==AV69Wcdetalleproductosds_1_tfhrereclin) )
      {
         addWhere(sWhereString, "(HreRecLin >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcdetalleproductosds_2_tfhrereclin_to) )
      {
         addWhere(sWhereString, "(HreRecLin <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Wcdetalleproductosds_4_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV71Wcdetalleproductosds_3_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Wcdetalleproductosds_4_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdNum = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Wcdetalleproductosds_6_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Wcdetalleproductosds_5_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Wcdetalleproductosds_6_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdDsc = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcdetalleproductosds_7_tfhrefaccon)==0) )
      {
         addWhere(sWhereString, "(HreFacCon >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Wcdetalleproductosds_8_tfhrefaccon_to)==0) )
      {
         addWhere(sWhereString, "(HreFacCon <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Wcdetalleproductosds_10_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV77Wcdetalleproductosds_9_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Wcdetalleproductosds_10_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdUDs = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Wcdetalleproductosds_11_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Wcdetalleproductosds_12_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Wcdetalleproductosds_13_tfhrecanany)==0) )
      {
         addWhere(sWhereString, "(HreCanAny >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Wcdetalleproductosds_14_tfhrecanany_to)==0) )
      {
         addWhere(sWhereString, "(HreCanAny <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcdetalleproductosds_15_tfhrefornro) )
      {
         addWhere(sWhereString, "(HreForNro >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV84Wcdetalleproductosds_16_tfhrefornro_to) )
      {
         addWhere(sWhereString, "(HreForNro <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV85Wcdetalleproductosds_17_tfhreprdtnq) )
      {
         addWhere(sWhereString, "(HrePrdTnq >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV86Wcdetalleproductosds_18_tfhreprdtnq_to) )
      {
         addWhere(sWhereString, "(HrePrdTnq <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Wcdetalleproductosds_20_tfhrelinusr_sel)==0) && ( ! (GXutil.strcmp("", AV87Wcdetalleproductosds_19_tfhrelinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Wcdetalleproductosds_20_tfhrelinusr_sel)==0) )
      {
         addWhere(sWhereString, "(HreLinUsr = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HreRecLin" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreRecLin DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdNum" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrePrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdDsc" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrePrdDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HreFacCon" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreFacCon DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdUDs" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrePrdUDs DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdCant" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrePrdCant DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HreCanAny" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreCanAny DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HreForNro" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreForNro DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdTnq" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrePrdTnq DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HreLinUsr" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreLinUsr DESC" ;
      }
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P08ZD2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08ZD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(17);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(18,3);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               return;
      }
   }

}

