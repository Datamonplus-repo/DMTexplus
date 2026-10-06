package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pedido__wwgetfilterdata extends GXProcedure
{
   public pedido__wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pedido__wwgetfilterdata.class ), "" );
   }

   public pedido__wwgetfilterdata( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pedido__wwgetfilterdata.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pedido__wwgetfilterdata.this.AV38DDOName = aP0;
      pedido__wwgetfilterdata.this.AV36SearchTxt = aP1;
      pedido__wwgetfilterdata.this.AV37SearchTxtTo = aP2;
      pedido__wwgetfilterdata.this.aP3 = aP3;
      pedido__wwgetfilterdata.this.aP4 = aP4;
      pedido__wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV41Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV46OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_DISFEC") == 0 )
      {
         /* Execute user subroutine: 'LOADDISFECOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_DISARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADDISARTCODOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_DISARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADDISARTDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_DISCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADDISCOLNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV42OptionsJson = AV41Options.toJSonString(false) ;
      AV45OptionsDescJson = AV44OptionsDesc.toJSonString(false) ;
      AV47OptionIndexesJson = AV46OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV49Session.getValue("PedidosClienteSinDetalle.Pedido__WWGridState"), "") == 0 )
      {
         AV51GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.Pedido__WWGridState"), null, null);
      }
      else
      {
         AV51GridState.fromxml(AV49Session.getValue("PedidosClienteSinDetalle.Pedido__WWGridState"), null, null);
      }
      AV199GXV1 = 1 ;
      while ( AV199GXV1 <= AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV52GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV199GXV1));
         if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV54FilterFullText = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV15TFDisCod = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV16TFDisCod_To = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFECCLI") == 0 )
         {
            AV56TFDisFecCli = localUtil.ctod( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV57TFDisFecCli_To = localUtil.ctod( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFEC") == 0 )
         {
            AV17TFDisFec = localUtil.ctod( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV18TFDisFec_To = localUtil.ctod( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFEC_SEL") == 0 )
         {
            AV55TFDisFec_Sel = localUtil.ctod( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFECENT") == 0 )
         {
            AV58TFDisFecEnt = localUtil.ctod( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV59TFDisFecEnt_To = localUtil.ctod( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV19TFCliCod = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV20TFCliCod_To = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV21TFCliNom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV22TFCliNom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV23TFDisArtCod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV24TFDisArtCod_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV25TFDisArtDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV26TFDisArtDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV27TFDisColNom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV28TFDisColNom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV29TFDisColNum = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV30TFDisColNum_To = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTIPCOL") == 0 )
         {
            AV31TFDisTipCol = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV32TFDisTipCol_To = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISEST_SEL") == 0 )
         {
            AV33TFDisEst_SelsJson = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV34TFDisEst_Sels.fromJSonString(AV33TFDisEst_SelsJson, null);
         }
         AV199GXV1 = (int)(AV199GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADDISFECOPTIONS' Routine */
      returnInSub = false ;
      AV17TFDisFec = localUtil.ctod( AV36SearchTxt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV18TFDisFec_To = localUtil.ctod( AV37SearchTxtTo, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV55TFDisFec_Sel = GXutil.nullDate() ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV34TFDisEst_Sels ,
                                           Integer.valueOf(AV15TFDisCod) ,
                                           Integer.valueOf(AV16TFDisCod_To) ,
                                           AV56TFDisFecCli ,
                                           AV57TFDisFecCli_To ,
                                           AV55TFDisFec_Sel ,
                                           AV17TFDisFec ,
                                           AV18TFDisFec_To ,
                                           AV58TFDisFecEnt ,
                                           AV59TFDisFecEnt_To ,
                                           Integer.valueOf(AV19TFCliCod) ,
                                           Integer.valueOf(AV20TFCliCod_To) ,
                                           AV22TFCliNom_Sel ,
                                           AV21TFCliNom ,
                                           AV24TFDisArtCod_Sel ,
                                           AV23TFDisArtCod ,
                                           AV26TFDisArtDsc_Sel ,
                                           AV25TFDisArtDsc ,
                                           AV28TFDisColNom_Sel ,
                                           AV27TFDisColNom ,
                                           Integer.valueOf(AV29TFDisColNum) ,
                                           Integer.valueOf(AV30TFDisColNum_To) ,
                                           Byte.valueOf(AV31TFDisTipCol) ,
                                           Byte.valueOf(AV32TFDisTipCol_To) ,
                                           Integer.valueOf(AV34TFDisEst_Sels.size()) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A370DisFecCli ,
                                           A369DisFec ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           AV54FilterFullText } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV21TFCliNom = GXutil.padr( GXutil.rtrim( AV21TFCliNom), 30, "%") ;
      lV23TFDisArtCod = GXutil.padr( GXutil.rtrim( AV23TFDisArtCod), 16, "%") ;
      lV25TFDisArtDsc = GXutil.padr( GXutil.rtrim( AV25TFDisArtDsc), 26, "%") ;
      lV27TFDisColNom = GXutil.padr( GXutil.rtrim( AV27TFDisColNom), 13, "%") ;
      /* Using cursor P09IH2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV15TFDisCod), Integer.valueOf(AV16TFDisCod_To), AV56TFDisFecCli, AV57TFDisFecCli_To, AV17TFDisFec, AV18TFDisFec_To, AV55TFDisFec_Sel, AV58TFDisFecEnt, AV59TFDisFecEnt_To, Integer.valueOf(AV19TFCliCod), Integer.valueOf(AV20TFCliCod_To), lV21TFCliNom, AV22TFCliNom_Sel, lV23TFDisArtCod, AV24TFDisArtCod_Sel, lV25TFDisArtDsc, AV26TFDisArtDsc_Sel, lV27TFDisColNom, AV28TFDisColNom_Sel, Integer.valueOf(AV29TFDisColNum), Integer.valueOf(AV30TFDisColNum_To), Byte.valueOf(AV31TFDisTipCol), Byte.valueOf(AV32TFDisTipCol_To)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9IH2 = false ;
         A396EmprCod = P09IH2_A396EmprCod[0] ;
         A369DisFec = P09IH2_A369DisFec[0] ;
         A371DisFecEnt = P09IH2_A371DisFecEnt[0] ;
         A370DisFecCli = P09IH2_A370DisFecCli[0] ;
         A367DisEst = P09IH2_A367DisEst[0] ;
         A390DisTipCol = P09IH2_A390DisTipCol[0] ;
         n390DisTipCol = P09IH2_n390DisTipCol[0] ;
         A363DisColNum = P09IH2_A363DisColNum[0] ;
         n363DisColNum = P09IH2_n363DisColNum[0] ;
         A362DisColNom = P09IH2_A362DisColNom[0] ;
         n362DisColNom = P09IH2_n362DisColNom[0] ;
         A337DisArtDsc = P09IH2_A337DisArtDsc[0] ;
         A335DisArtCod = P09IH2_A335DisArtCod[0] ;
         A279CliNom = P09IH2_A279CliNom[0] ;
         A252CliCod = P09IH2_A252CliCod[0] ;
         A361DisCod = P09IH2_A361DisCod[0] ;
         A279CliNom = P09IH2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV54FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "en pedido", "") , GXutil.padr( "%" + GXutil.lower( AV54FilterFullText) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( "en produccion", "") , GXutil.padr( "%" + GXutil.lower( AV54FilterFullText) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) ) )
         {
            AV48count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && GXutil.dateCompare(GXutil.resetTime(P09IH2_A369DisFec[0]), GXutil.resetTime(A369DisFec)) )
            {
               brk9IH2 = false ;
               A396EmprCod = P09IH2_A396EmprCod[0] ;
               A361DisCod = P09IH2_A361DisCod[0] ;
               AV48count = (long)(AV48count+1) ;
               brk9IH2 = true ;
               pr_default.readNext(0);
            }
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A369DisFec)) )
            {
               AV40Option = localUtil.dtoc( A369DisFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
               AV41Options.add(AV40Option, 0);
               AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV41Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9IH2 )
         {
            brk9IH2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV21TFCliNom = AV36SearchTxt ;
      AV22TFCliNom_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV34TFDisEst_Sels ,
                                           Integer.valueOf(AV15TFDisCod) ,
                                           Integer.valueOf(AV16TFDisCod_To) ,
                                           AV56TFDisFecCli ,
                                           AV57TFDisFecCli_To ,
                                           AV55TFDisFec_Sel ,
                                           AV17TFDisFec ,
                                           AV18TFDisFec_To ,
                                           AV58TFDisFecEnt ,
                                           AV59TFDisFecEnt_To ,
                                           Integer.valueOf(AV19TFCliCod) ,
                                           Integer.valueOf(AV20TFCliCod_To) ,
                                           AV22TFCliNom_Sel ,
                                           AV21TFCliNom ,
                                           AV24TFDisArtCod_Sel ,
                                           AV23TFDisArtCod ,
                                           AV26TFDisArtDsc_Sel ,
                                           AV25TFDisArtDsc ,
                                           AV28TFDisColNom_Sel ,
                                           AV27TFDisColNom ,
                                           Integer.valueOf(AV29TFDisColNum) ,
                                           Integer.valueOf(AV30TFDisColNum_To) ,
                                           Byte.valueOf(AV31TFDisTipCol) ,
                                           Byte.valueOf(AV32TFDisTipCol_To) ,
                                           Integer.valueOf(AV34TFDisEst_Sels.size()) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A370DisFecCli ,
                                           A369DisFec ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           AV54FilterFullText } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV21TFCliNom = GXutil.padr( GXutil.rtrim( AV21TFCliNom), 30, "%") ;
      lV23TFDisArtCod = GXutil.padr( GXutil.rtrim( AV23TFDisArtCod), 16, "%") ;
      lV25TFDisArtDsc = GXutil.padr( GXutil.rtrim( AV25TFDisArtDsc), 26, "%") ;
      lV27TFDisColNom = GXutil.padr( GXutil.rtrim( AV27TFDisColNom), 13, "%") ;
      /* Using cursor P09IH3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV15TFDisCod), Integer.valueOf(AV16TFDisCod_To), AV56TFDisFecCli, AV57TFDisFecCli_To, AV17TFDisFec, AV18TFDisFec_To, AV55TFDisFec_Sel, AV58TFDisFecEnt, AV59TFDisFecEnt_To, Integer.valueOf(AV19TFCliCod), Integer.valueOf(AV20TFCliCod_To), lV21TFCliNom, AV22TFCliNom_Sel, lV23TFDisArtCod, AV24TFDisArtCod_Sel, lV25TFDisArtDsc, AV26TFDisArtDsc_Sel, lV27TFDisColNom, AV28TFDisColNom_Sel, Integer.valueOf(AV29TFDisColNum), Integer.valueOf(AV30TFDisColNum_To), Byte.valueOf(AV31TFDisTipCol), Byte.valueOf(AV32TFDisTipCol_To)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9IH4 = false ;
         A396EmprCod = P09IH3_A396EmprCod[0] ;
         A279CliNom = P09IH3_A279CliNom[0] ;
         A371DisFecEnt = P09IH3_A371DisFecEnt[0] ;
         A369DisFec = P09IH3_A369DisFec[0] ;
         A370DisFecCli = P09IH3_A370DisFecCli[0] ;
         A367DisEst = P09IH3_A367DisEst[0] ;
         A390DisTipCol = P09IH3_A390DisTipCol[0] ;
         n390DisTipCol = P09IH3_n390DisTipCol[0] ;
         A363DisColNum = P09IH3_A363DisColNum[0] ;
         n363DisColNum = P09IH3_n363DisColNum[0] ;
         A362DisColNom = P09IH3_A362DisColNom[0] ;
         n362DisColNom = P09IH3_n362DisColNom[0] ;
         A337DisArtDsc = P09IH3_A337DisArtDsc[0] ;
         A335DisArtCod = P09IH3_A335DisArtCod[0] ;
         A252CliCod = P09IH3_A252CliCod[0] ;
         A361DisCod = P09IH3_A361DisCod[0] ;
         A279CliNom = P09IH3_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV54FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "en pedido", "") , GXutil.padr( "%" + GXutil.lower( AV54FilterFullText) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( "en produccion", "") , GXutil.padr( "%" + GXutil.lower( AV54FilterFullText) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) ) )
         {
            AV48count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09IH3_A279CliNom[0], A279CliNom) == 0 ) )
            {
               brk9IH4 = false ;
               A396EmprCod = P09IH3_A396EmprCod[0] ;
               A252CliCod = P09IH3_A252CliCod[0] ;
               A361DisCod = P09IH3_A361DisCod[0] ;
               AV48count = (long)(AV48count+1) ;
               brk9IH4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A279CliNom)==0) )
            {
               AV40Option = A279CliNom ;
               AV41Options.add(AV40Option, 0);
               AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV41Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9IH4 )
         {
            brk9IH4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADDISARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV23TFDisArtCod = AV36SearchTxt ;
      AV24TFDisArtCod_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV34TFDisEst_Sels ,
                                           Integer.valueOf(AV15TFDisCod) ,
                                           Integer.valueOf(AV16TFDisCod_To) ,
                                           AV56TFDisFecCli ,
                                           AV57TFDisFecCli_To ,
                                           AV55TFDisFec_Sel ,
                                           AV17TFDisFec ,
                                           AV18TFDisFec_To ,
                                           AV58TFDisFecEnt ,
                                           AV59TFDisFecEnt_To ,
                                           Integer.valueOf(AV19TFCliCod) ,
                                           Integer.valueOf(AV20TFCliCod_To) ,
                                           AV22TFCliNom_Sel ,
                                           AV21TFCliNom ,
                                           AV24TFDisArtCod_Sel ,
                                           AV23TFDisArtCod ,
                                           AV26TFDisArtDsc_Sel ,
                                           AV25TFDisArtDsc ,
                                           AV28TFDisColNom_Sel ,
                                           AV27TFDisColNom ,
                                           Integer.valueOf(AV29TFDisColNum) ,
                                           Integer.valueOf(AV30TFDisColNum_To) ,
                                           Byte.valueOf(AV31TFDisTipCol) ,
                                           Byte.valueOf(AV32TFDisTipCol_To) ,
                                           Integer.valueOf(AV34TFDisEst_Sels.size()) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A370DisFecCli ,
                                           A369DisFec ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           AV54FilterFullText } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV21TFCliNom = GXutil.padr( GXutil.rtrim( AV21TFCliNom), 30, "%") ;
      lV23TFDisArtCod = GXutil.padr( GXutil.rtrim( AV23TFDisArtCod), 16, "%") ;
      lV25TFDisArtDsc = GXutil.padr( GXutil.rtrim( AV25TFDisArtDsc), 26, "%") ;
      lV27TFDisColNom = GXutil.padr( GXutil.rtrim( AV27TFDisColNom), 13, "%") ;
      /* Using cursor P09IH4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV15TFDisCod), Integer.valueOf(AV16TFDisCod_To), AV56TFDisFecCli, AV57TFDisFecCli_To, AV17TFDisFec, AV18TFDisFec_To, AV55TFDisFec_Sel, AV58TFDisFecEnt, AV59TFDisFecEnt_To, Integer.valueOf(AV19TFCliCod), Integer.valueOf(AV20TFCliCod_To), lV21TFCliNom, AV22TFCliNom_Sel, lV23TFDisArtCod, AV24TFDisArtCod_Sel, lV25TFDisArtDsc, AV26TFDisArtDsc_Sel, lV27TFDisColNom, AV28TFDisColNom_Sel, Integer.valueOf(AV29TFDisColNum), Integer.valueOf(AV30TFDisColNum_To), Byte.valueOf(AV31TFDisTipCol), Byte.valueOf(AV32TFDisTipCol_To)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9IH6 = false ;
         A396EmprCod = P09IH4_A396EmprCod[0] ;
         A335DisArtCod = P09IH4_A335DisArtCod[0] ;
         A371DisFecEnt = P09IH4_A371DisFecEnt[0] ;
         A369DisFec = P09IH4_A369DisFec[0] ;
         A370DisFecCli = P09IH4_A370DisFecCli[0] ;
         A367DisEst = P09IH4_A367DisEst[0] ;
         A390DisTipCol = P09IH4_A390DisTipCol[0] ;
         n390DisTipCol = P09IH4_n390DisTipCol[0] ;
         A363DisColNum = P09IH4_A363DisColNum[0] ;
         n363DisColNum = P09IH4_n363DisColNum[0] ;
         A362DisColNom = P09IH4_A362DisColNom[0] ;
         n362DisColNom = P09IH4_n362DisColNom[0] ;
         A337DisArtDsc = P09IH4_A337DisArtDsc[0] ;
         A279CliNom = P09IH4_A279CliNom[0] ;
         A252CliCod = P09IH4_A252CliCod[0] ;
         A361DisCod = P09IH4_A361DisCod[0] ;
         A279CliNom = P09IH4_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV54FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "en pedido", "") , GXutil.padr( "%" + GXutil.lower( AV54FilterFullText) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( "en produccion", "") , GXutil.padr( "%" + GXutil.lower( AV54FilterFullText) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) ) )
         {
            AV48count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09IH4_A335DisArtCod[0], A335DisArtCod) == 0 ) )
            {
               brk9IH6 = false ;
               A396EmprCod = P09IH4_A396EmprCod[0] ;
               A361DisCod = P09IH4_A361DisCod[0] ;
               AV48count = (long)(AV48count+1) ;
               brk9IH6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A335DisArtCod)==0) )
            {
               AV40Option = A335DisArtCod ;
               AV41Options.add(AV40Option, 0);
               AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV41Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9IH6 )
         {
            brk9IH6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADDISARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV25TFDisArtDsc = AV36SearchTxt ;
      AV26TFDisArtDsc_Sel = "" ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV34TFDisEst_Sels ,
                                           Integer.valueOf(AV15TFDisCod) ,
                                           Integer.valueOf(AV16TFDisCod_To) ,
                                           AV56TFDisFecCli ,
                                           AV57TFDisFecCli_To ,
                                           AV55TFDisFec_Sel ,
                                           AV17TFDisFec ,
                                           AV18TFDisFec_To ,
                                           AV58TFDisFecEnt ,
                                           AV59TFDisFecEnt_To ,
                                           Integer.valueOf(AV19TFCliCod) ,
                                           Integer.valueOf(AV20TFCliCod_To) ,
                                           AV22TFCliNom_Sel ,
                                           AV21TFCliNom ,
                                           AV24TFDisArtCod_Sel ,
                                           AV23TFDisArtCod ,
                                           AV26TFDisArtDsc_Sel ,
                                           AV25TFDisArtDsc ,
                                           AV28TFDisColNom_Sel ,
                                           AV27TFDisColNom ,
                                           Integer.valueOf(AV29TFDisColNum) ,
                                           Integer.valueOf(AV30TFDisColNum_To) ,
                                           Byte.valueOf(AV31TFDisTipCol) ,
                                           Byte.valueOf(AV32TFDisTipCol_To) ,
                                           Integer.valueOf(AV34TFDisEst_Sels.size()) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A370DisFecCli ,
                                           A369DisFec ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           AV54FilterFullText } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV21TFCliNom = GXutil.padr( GXutil.rtrim( AV21TFCliNom), 30, "%") ;
      lV23TFDisArtCod = GXutil.padr( GXutil.rtrim( AV23TFDisArtCod), 16, "%") ;
      lV25TFDisArtDsc = GXutil.padr( GXutil.rtrim( AV25TFDisArtDsc), 26, "%") ;
      lV27TFDisColNom = GXutil.padr( GXutil.rtrim( AV27TFDisColNom), 13, "%") ;
      /* Using cursor P09IH5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(AV15TFDisCod), Integer.valueOf(AV16TFDisCod_To), AV56TFDisFecCli, AV57TFDisFecCli_To, AV17TFDisFec, AV18TFDisFec_To, AV55TFDisFec_Sel, AV58TFDisFecEnt, AV59TFDisFecEnt_To, Integer.valueOf(AV19TFCliCod), Integer.valueOf(AV20TFCliCod_To), lV21TFCliNom, AV22TFCliNom_Sel, lV23TFDisArtCod, AV24TFDisArtCod_Sel, lV25TFDisArtDsc, AV26TFDisArtDsc_Sel, lV27TFDisColNom, AV28TFDisColNom_Sel, Integer.valueOf(AV29TFDisColNum), Integer.valueOf(AV30TFDisColNum_To), Byte.valueOf(AV31TFDisTipCol), Byte.valueOf(AV32TFDisTipCol_To)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9IH8 = false ;
         A396EmprCod = P09IH5_A396EmprCod[0] ;
         A337DisArtDsc = P09IH5_A337DisArtDsc[0] ;
         A371DisFecEnt = P09IH5_A371DisFecEnt[0] ;
         A369DisFec = P09IH5_A369DisFec[0] ;
         A370DisFecCli = P09IH5_A370DisFecCli[0] ;
         A367DisEst = P09IH5_A367DisEst[0] ;
         A390DisTipCol = P09IH5_A390DisTipCol[0] ;
         n390DisTipCol = P09IH5_n390DisTipCol[0] ;
         A363DisColNum = P09IH5_A363DisColNum[0] ;
         n363DisColNum = P09IH5_n363DisColNum[0] ;
         A362DisColNom = P09IH5_A362DisColNom[0] ;
         n362DisColNom = P09IH5_n362DisColNom[0] ;
         A335DisArtCod = P09IH5_A335DisArtCod[0] ;
         A279CliNom = P09IH5_A279CliNom[0] ;
         A252CliCod = P09IH5_A252CliCod[0] ;
         A361DisCod = P09IH5_A361DisCod[0] ;
         A279CliNom = P09IH5_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV54FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "en pedido", "") , GXutil.padr( "%" + GXutil.lower( AV54FilterFullText) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( "en produccion", "") , GXutil.padr( "%" + GXutil.lower( AV54FilterFullText) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) ) )
         {
            AV48count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09IH5_A337DisArtDsc[0], A337DisArtDsc) == 0 ) )
            {
               brk9IH8 = false ;
               A396EmprCod = P09IH5_A396EmprCod[0] ;
               A361DisCod = P09IH5_A361DisCod[0] ;
               AV48count = (long)(AV48count+1) ;
               brk9IH8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A337DisArtDsc)==0) )
            {
               AV40Option = A337DisArtDsc ;
               AV41Options.add(AV40Option, 0);
               AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV41Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9IH8 )
         {
            brk9IH8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADDISCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV27TFDisColNom = AV36SearchTxt ;
      AV28TFDisColNom_Sel = "" ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV34TFDisEst_Sels ,
                                           Integer.valueOf(AV15TFDisCod) ,
                                           Integer.valueOf(AV16TFDisCod_To) ,
                                           AV56TFDisFecCli ,
                                           AV57TFDisFecCli_To ,
                                           AV55TFDisFec_Sel ,
                                           AV17TFDisFec ,
                                           AV18TFDisFec_To ,
                                           AV58TFDisFecEnt ,
                                           AV59TFDisFecEnt_To ,
                                           Integer.valueOf(AV19TFCliCod) ,
                                           Integer.valueOf(AV20TFCliCod_To) ,
                                           AV22TFCliNom_Sel ,
                                           AV21TFCliNom ,
                                           AV24TFDisArtCod_Sel ,
                                           AV23TFDisArtCod ,
                                           AV26TFDisArtDsc_Sel ,
                                           AV25TFDisArtDsc ,
                                           AV28TFDisColNom_Sel ,
                                           AV27TFDisColNom ,
                                           Integer.valueOf(AV29TFDisColNum) ,
                                           Integer.valueOf(AV30TFDisColNum_To) ,
                                           Byte.valueOf(AV31TFDisTipCol) ,
                                           Byte.valueOf(AV32TFDisTipCol_To) ,
                                           Integer.valueOf(AV34TFDisEst_Sels.size()) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A370DisFecCli ,
                                           A369DisFec ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           AV54FilterFullText } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV21TFCliNom = GXutil.padr( GXutil.rtrim( AV21TFCliNom), 30, "%") ;
      lV23TFDisArtCod = GXutil.padr( GXutil.rtrim( AV23TFDisArtCod), 16, "%") ;
      lV25TFDisArtDsc = GXutil.padr( GXutil.rtrim( AV25TFDisArtDsc), 26, "%") ;
      lV27TFDisColNom = GXutil.padr( GXutil.rtrim( AV27TFDisColNom), 13, "%") ;
      /* Using cursor P09IH6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV15TFDisCod), Integer.valueOf(AV16TFDisCod_To), AV56TFDisFecCli, AV57TFDisFecCli_To, AV17TFDisFec, AV18TFDisFec_To, AV55TFDisFec_Sel, AV58TFDisFecEnt, AV59TFDisFecEnt_To, Integer.valueOf(AV19TFCliCod), Integer.valueOf(AV20TFCliCod_To), lV21TFCliNom, AV22TFCliNom_Sel, lV23TFDisArtCod, AV24TFDisArtCod_Sel, lV25TFDisArtDsc, AV26TFDisArtDsc_Sel, lV27TFDisColNom, AV28TFDisColNom_Sel, Integer.valueOf(AV29TFDisColNum), Integer.valueOf(AV30TFDisColNum_To), Byte.valueOf(AV31TFDisTipCol), Byte.valueOf(AV32TFDisTipCol_To)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9IH10 = false ;
         A396EmprCod = P09IH6_A396EmprCod[0] ;
         A362DisColNom = P09IH6_A362DisColNom[0] ;
         n362DisColNom = P09IH6_n362DisColNom[0] ;
         A371DisFecEnt = P09IH6_A371DisFecEnt[0] ;
         A369DisFec = P09IH6_A369DisFec[0] ;
         A370DisFecCli = P09IH6_A370DisFecCli[0] ;
         A367DisEst = P09IH6_A367DisEst[0] ;
         A390DisTipCol = P09IH6_A390DisTipCol[0] ;
         n390DisTipCol = P09IH6_n390DisTipCol[0] ;
         A363DisColNum = P09IH6_A363DisColNum[0] ;
         n363DisColNum = P09IH6_n363DisColNum[0] ;
         A337DisArtDsc = P09IH6_A337DisArtDsc[0] ;
         A335DisArtCod = P09IH6_A335DisArtCod[0] ;
         A279CliNom = P09IH6_A279CliNom[0] ;
         A252CliCod = P09IH6_A252CliCod[0] ;
         A361DisCod = P09IH6_A361DisCod[0] ;
         A279CliNom = P09IH6_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV54FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV54FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV54FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "en pedido", "") , GXutil.padr( "%" + GXutil.lower( AV54FilterFullText) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( "en produccion", "") , GXutil.padr( "%" + GXutil.lower( AV54FilterFullText) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) ) )
         {
            AV48count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09IH6_A362DisColNom[0], A362DisColNom) == 0 ) )
            {
               brk9IH10 = false ;
               A396EmprCod = P09IH6_A396EmprCod[0] ;
               A361DisCod = P09IH6_A361DisCod[0] ;
               AV48count = (long)(AV48count+1) ;
               brk9IH10 = true ;
               pr_default.readNext(4);
            }
            if ( ! (GXutil.strcmp("", A362DisColNom)==0) )
            {
               AV40Option = A362DisColNom ;
               AV41Options.add(AV40Option, 0);
               AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV41Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9IH10 )
         {
            brk9IH10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = pedido__wwgetfilterdata.this.AV42OptionsJson;
      this.aP4[0] = pedido__wwgetfilterdata.this.AV45OptionsDescJson;
      this.aP5[0] = pedido__wwgetfilterdata.this.AV47OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV42OptionsJson = "" ;
      AV45OptionsDescJson = "" ;
      AV47OptionIndexesJson = "" ;
      AV41Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV46OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV49Session = httpContext.getWebSession();
      AV51GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV52GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV54FilterFullText = "" ;
      AV56TFDisFecCli = GXutil.nullDate() ;
      AV57TFDisFecCli_To = GXutil.nullDate() ;
      AV17TFDisFec = GXutil.nullDate() ;
      AV18TFDisFec_To = GXutil.nullDate() ;
      AV55TFDisFec_Sel = GXutil.nullDate() ;
      AV58TFDisFecEnt = GXutil.nullDate() ;
      AV59TFDisFecEnt_To = GXutil.nullDate() ;
      AV21TFCliNom = "" ;
      AV22TFCliNom_Sel = "" ;
      AV23TFDisArtCod = "" ;
      AV24TFDisArtCod_Sel = "" ;
      AV25TFDisArtDsc = "" ;
      AV26TFDisArtDsc_Sel = "" ;
      AV27TFDisColNom = "" ;
      AV28TFDisColNom_Sel = "" ;
      AV33TFDisEst_SelsJson = "" ;
      AV34TFDisEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV21TFCliNom = "" ;
      lV23TFDisArtCod = "" ;
      lV25TFDisArtDsc = "" ;
      lV27TFDisColNom = "" ;
      A370DisFecCli = GXutil.nullDate() ;
      A369DisFec = GXutil.nullDate() ;
      A371DisFecEnt = GXutil.nullDate() ;
      A279CliNom = "" ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      P09IH2_A396EmprCod = new String[] {""} ;
      P09IH2_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IH2_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09IH2_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09IH2_A367DisEst = new byte[1] ;
      P09IH2_A390DisTipCol = new byte[1] ;
      P09IH2_n390DisTipCol = new boolean[] {false} ;
      P09IH2_A363DisColNum = new int[1] ;
      P09IH2_n363DisColNum = new boolean[] {false} ;
      P09IH2_A362DisColNom = new String[] {""} ;
      P09IH2_n362DisColNom = new boolean[] {false} ;
      P09IH2_A337DisArtDsc = new String[] {""} ;
      P09IH2_A335DisArtCod = new String[] {""} ;
      P09IH2_A279CliNom = new String[] {""} ;
      P09IH2_A252CliCod = new int[1] ;
      P09IH2_A361DisCod = new int[1] ;
      A396EmprCod = "" ;
      AV40Option = "" ;
      P09IH3_A396EmprCod = new String[] {""} ;
      P09IH3_A279CliNom = new String[] {""} ;
      P09IH3_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09IH3_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IH3_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09IH3_A367DisEst = new byte[1] ;
      P09IH3_A390DisTipCol = new byte[1] ;
      P09IH3_n390DisTipCol = new boolean[] {false} ;
      P09IH3_A363DisColNum = new int[1] ;
      P09IH3_n363DisColNum = new boolean[] {false} ;
      P09IH3_A362DisColNom = new String[] {""} ;
      P09IH3_n362DisColNom = new boolean[] {false} ;
      P09IH3_A337DisArtDsc = new String[] {""} ;
      P09IH3_A335DisArtCod = new String[] {""} ;
      P09IH3_A252CliCod = new int[1] ;
      P09IH3_A361DisCod = new int[1] ;
      P09IH4_A396EmprCod = new String[] {""} ;
      P09IH4_A335DisArtCod = new String[] {""} ;
      P09IH4_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09IH4_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IH4_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09IH4_A367DisEst = new byte[1] ;
      P09IH4_A390DisTipCol = new byte[1] ;
      P09IH4_n390DisTipCol = new boolean[] {false} ;
      P09IH4_A363DisColNum = new int[1] ;
      P09IH4_n363DisColNum = new boolean[] {false} ;
      P09IH4_A362DisColNom = new String[] {""} ;
      P09IH4_n362DisColNom = new boolean[] {false} ;
      P09IH4_A337DisArtDsc = new String[] {""} ;
      P09IH4_A279CliNom = new String[] {""} ;
      P09IH4_A252CliCod = new int[1] ;
      P09IH4_A361DisCod = new int[1] ;
      P09IH5_A396EmprCod = new String[] {""} ;
      P09IH5_A337DisArtDsc = new String[] {""} ;
      P09IH5_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09IH5_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IH5_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09IH5_A367DisEst = new byte[1] ;
      P09IH5_A390DisTipCol = new byte[1] ;
      P09IH5_n390DisTipCol = new boolean[] {false} ;
      P09IH5_A363DisColNum = new int[1] ;
      P09IH5_n363DisColNum = new boolean[] {false} ;
      P09IH5_A362DisColNom = new String[] {""} ;
      P09IH5_n362DisColNom = new boolean[] {false} ;
      P09IH5_A335DisArtCod = new String[] {""} ;
      P09IH5_A279CliNom = new String[] {""} ;
      P09IH5_A252CliCod = new int[1] ;
      P09IH5_A361DisCod = new int[1] ;
      P09IH6_A396EmprCod = new String[] {""} ;
      P09IH6_A362DisColNom = new String[] {""} ;
      P09IH6_n362DisColNom = new boolean[] {false} ;
      P09IH6_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09IH6_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IH6_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09IH6_A367DisEst = new byte[1] ;
      P09IH6_A390DisTipCol = new byte[1] ;
      P09IH6_n390DisTipCol = new boolean[] {false} ;
      P09IH6_A363DisColNum = new int[1] ;
      P09IH6_n363DisColNum = new boolean[] {false} ;
      P09IH6_A337DisArtDsc = new String[] {""} ;
      P09IH6_A335DisArtCod = new String[] {""} ;
      P09IH6_A279CliNom = new String[] {""} ;
      P09IH6_A252CliCod = new int[1] ;
      P09IH6_A361DisCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.pedido__wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09IH2_A396EmprCod, P09IH2_A369DisFec, P09IH2_A371DisFecEnt, P09IH2_A370DisFecCli, P09IH2_A367DisEst, P09IH2_A390DisTipCol, P09IH2_n390DisTipCol, P09IH2_A363DisColNum, P09IH2_n363DisColNum, P09IH2_A362DisColNom,
            P09IH2_n362DisColNom, P09IH2_A337DisArtDsc, P09IH2_A335DisArtCod, P09IH2_A279CliNom, P09IH2_A252CliCod, P09IH2_A361DisCod
            }
            , new Object[] {
            P09IH3_A396EmprCod, P09IH3_A279CliNom, P09IH3_A371DisFecEnt, P09IH3_A369DisFec, P09IH3_A370DisFecCli, P09IH3_A367DisEst, P09IH3_A390DisTipCol, P09IH3_n390DisTipCol, P09IH3_A363DisColNum, P09IH3_n363DisColNum,
            P09IH3_A362DisColNom, P09IH3_n362DisColNom, P09IH3_A337DisArtDsc, P09IH3_A335DisArtCod, P09IH3_A252CliCod, P09IH3_A361DisCod
            }
            , new Object[] {
            P09IH4_A396EmprCod, P09IH4_A335DisArtCod, P09IH4_A371DisFecEnt, P09IH4_A369DisFec, P09IH4_A370DisFecCli, P09IH4_A367DisEst, P09IH4_A390DisTipCol, P09IH4_n390DisTipCol, P09IH4_A363DisColNum, P09IH4_n363DisColNum,
            P09IH4_A362DisColNom, P09IH4_n362DisColNom, P09IH4_A337DisArtDsc, P09IH4_A279CliNom, P09IH4_A252CliCod, P09IH4_A361DisCod
            }
            , new Object[] {
            P09IH5_A396EmprCod, P09IH5_A337DisArtDsc, P09IH5_A371DisFecEnt, P09IH5_A369DisFec, P09IH5_A370DisFecCli, P09IH5_A367DisEst, P09IH5_A390DisTipCol, P09IH5_n390DisTipCol, P09IH5_A363DisColNum, P09IH5_n363DisColNum,
            P09IH5_A362DisColNom, P09IH5_n362DisColNom, P09IH5_A335DisArtCod, P09IH5_A279CliNom, P09IH5_A252CliCod, P09IH5_A361DisCod
            }
            , new Object[] {
            P09IH6_A396EmprCod, P09IH6_A362DisColNom, P09IH6_n362DisColNom, P09IH6_A371DisFecEnt, P09IH6_A369DisFec, P09IH6_A370DisFecCli, P09IH6_A367DisEst, P09IH6_A390DisTipCol, P09IH6_n390DisTipCol, P09IH6_A363DisColNum,
            P09IH6_n363DisColNum, P09IH6_A337DisArtDsc, P09IH6_A335DisArtCod, P09IH6_A279CliNom, P09IH6_A252CliCod, P09IH6_A361DisCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV31TFDisTipCol ;
   private byte AV32TFDisTipCol_To ;
   private byte A367DisEst ;
   private byte A390DisTipCol ;
   private short Gx_err ;
   private int AV199GXV1 ;
   private int AV15TFDisCod ;
   private int AV16TFDisCod_To ;
   private int AV19TFCliCod ;
   private int AV20TFCliCod_To ;
   private int AV29TFDisColNum ;
   private int AV30TFDisColNum_To ;
   private int AV34TFDisEst_Sels_size ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private long AV48count ;
   private String AV21TFCliNom ;
   private String AV22TFCliNom_Sel ;
   private String AV23TFDisArtCod ;
   private String AV24TFDisArtCod_Sel ;
   private String AV25TFDisArtDsc ;
   private String AV26TFDisArtDsc_Sel ;
   private String AV27TFDisColNom ;
   private String AV28TFDisColNom_Sel ;
   private String scmdbuf ;
   private String lV21TFCliNom ;
   private String lV23TFDisArtCod ;
   private String lV25TFDisArtDsc ;
   private String lV27TFDisColNom ;
   private String A279CliNom ;
   private String A335DisArtCod ;
   private String A337DisArtDsc ;
   private String A362DisColNom ;
   private String A396EmprCod ;
   private java.util.Date AV56TFDisFecCli ;
   private java.util.Date AV57TFDisFecCli_To ;
   private java.util.Date AV17TFDisFec ;
   private java.util.Date AV18TFDisFec_To ;
   private java.util.Date AV55TFDisFec_Sel ;
   private java.util.Date AV58TFDisFecEnt ;
   private java.util.Date AV59TFDisFecEnt_To ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A369DisFec ;
   private java.util.Date A371DisFecEnt ;
   private boolean returnInSub ;
   private boolean brk9IH2 ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean brk9IH4 ;
   private boolean brk9IH6 ;
   private boolean brk9IH8 ;
   private boolean brk9IH10 ;
   private String AV42OptionsJson ;
   private String AV45OptionsDescJson ;
   private String AV47OptionIndexesJson ;
   private String AV33TFDisEst_SelsJson ;
   private String AV38DDOName ;
   private String AV36SearchTxt ;
   private String AV37SearchTxtTo ;
   private String AV54FilterFullText ;
   private String AV40Option ;
   private GXSimpleCollection<Byte> AV34TFDisEst_Sels ;
   private com.genexus.webpanels.WebSession AV49Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09IH2_A396EmprCod ;
   private java.util.Date[] P09IH2_A369DisFec ;
   private java.util.Date[] P09IH2_A371DisFecEnt ;
   private java.util.Date[] P09IH2_A370DisFecCli ;
   private byte[] P09IH2_A367DisEst ;
   private byte[] P09IH2_A390DisTipCol ;
   private boolean[] P09IH2_n390DisTipCol ;
   private int[] P09IH2_A363DisColNum ;
   private boolean[] P09IH2_n363DisColNum ;
   private String[] P09IH2_A362DisColNom ;
   private boolean[] P09IH2_n362DisColNom ;
   private String[] P09IH2_A337DisArtDsc ;
   private String[] P09IH2_A335DisArtCod ;
   private String[] P09IH2_A279CliNom ;
   private int[] P09IH2_A252CliCod ;
   private int[] P09IH2_A361DisCod ;
   private String[] P09IH3_A396EmprCod ;
   private String[] P09IH3_A279CliNom ;
   private java.util.Date[] P09IH3_A371DisFecEnt ;
   private java.util.Date[] P09IH3_A369DisFec ;
   private java.util.Date[] P09IH3_A370DisFecCli ;
   private byte[] P09IH3_A367DisEst ;
   private byte[] P09IH3_A390DisTipCol ;
   private boolean[] P09IH3_n390DisTipCol ;
   private int[] P09IH3_A363DisColNum ;
   private boolean[] P09IH3_n363DisColNum ;
   private String[] P09IH3_A362DisColNom ;
   private boolean[] P09IH3_n362DisColNom ;
   private String[] P09IH3_A337DisArtDsc ;
   private String[] P09IH3_A335DisArtCod ;
   private int[] P09IH3_A252CliCod ;
   private int[] P09IH3_A361DisCod ;
   private String[] P09IH4_A396EmprCod ;
   private String[] P09IH4_A335DisArtCod ;
   private java.util.Date[] P09IH4_A371DisFecEnt ;
   private java.util.Date[] P09IH4_A369DisFec ;
   private java.util.Date[] P09IH4_A370DisFecCli ;
   private byte[] P09IH4_A367DisEst ;
   private byte[] P09IH4_A390DisTipCol ;
   private boolean[] P09IH4_n390DisTipCol ;
   private int[] P09IH4_A363DisColNum ;
   private boolean[] P09IH4_n363DisColNum ;
   private String[] P09IH4_A362DisColNom ;
   private boolean[] P09IH4_n362DisColNom ;
   private String[] P09IH4_A337DisArtDsc ;
   private String[] P09IH4_A279CliNom ;
   private int[] P09IH4_A252CliCod ;
   private int[] P09IH4_A361DisCod ;
   private String[] P09IH5_A396EmprCod ;
   private String[] P09IH5_A337DisArtDsc ;
   private java.util.Date[] P09IH5_A371DisFecEnt ;
   private java.util.Date[] P09IH5_A369DisFec ;
   private java.util.Date[] P09IH5_A370DisFecCli ;
   private byte[] P09IH5_A367DisEst ;
   private byte[] P09IH5_A390DisTipCol ;
   private boolean[] P09IH5_n390DisTipCol ;
   private int[] P09IH5_A363DisColNum ;
   private boolean[] P09IH5_n363DisColNum ;
   private String[] P09IH5_A362DisColNom ;
   private boolean[] P09IH5_n362DisColNom ;
   private String[] P09IH5_A335DisArtCod ;
   private String[] P09IH5_A279CliNom ;
   private int[] P09IH5_A252CliCod ;
   private int[] P09IH5_A361DisCod ;
   private String[] P09IH6_A396EmprCod ;
   private String[] P09IH6_A362DisColNom ;
   private boolean[] P09IH6_n362DisColNom ;
   private java.util.Date[] P09IH6_A371DisFecEnt ;
   private java.util.Date[] P09IH6_A369DisFec ;
   private java.util.Date[] P09IH6_A370DisFecCli ;
   private byte[] P09IH6_A367DisEst ;
   private byte[] P09IH6_A390DisTipCol ;
   private boolean[] P09IH6_n390DisTipCol ;
   private int[] P09IH6_A363DisColNum ;
   private boolean[] P09IH6_n363DisColNum ;
   private String[] P09IH6_A337DisArtDsc ;
   private String[] P09IH6_A335DisArtCod ;
   private String[] P09IH6_A279CliNom ;
   private int[] P09IH6_A252CliCod ;
   private int[] P09IH6_A361DisCod ;
   private GXSimpleCollection<String> AV41Options ;
   private GXSimpleCollection<String> AV44OptionsDesc ;
   private GXSimpleCollection<String> AV46OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV51GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV52GridStateFilterValue ;
}

final  class pedido__wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09IH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV34TFDisEst_Sels ,
                                          int AV15TFDisCod ,
                                          int AV16TFDisCod_To ,
                                          java.util.Date AV56TFDisFecCli ,
                                          java.util.Date AV57TFDisFecCli_To ,
                                          java.util.Date AV55TFDisFec_Sel ,
                                          java.util.Date AV17TFDisFec ,
                                          java.util.Date AV18TFDisFec_To ,
                                          java.util.Date AV58TFDisFecEnt ,
                                          java.util.Date AV59TFDisFecEnt_To ,
                                          int AV19TFCliCod ,
                                          int AV20TFCliCod_To ,
                                          String AV22TFCliNom_Sel ,
                                          String AV21TFCliNom ,
                                          String AV24TFDisArtCod_Sel ,
                                          String AV23TFDisArtCod ,
                                          String AV26TFDisArtDsc_Sel ,
                                          String AV25TFDisArtDsc ,
                                          String AV28TFDisColNom_Sel ,
                                          String AV27TFDisColNom ,
                                          int AV29TFDisColNum ,
                                          int AV30TFDisColNum_To ,
                                          byte AV31TFDisTipCol ,
                                          byte AV32TFDisTipCol_To ,
                                          int AV34TFDisEst_Sels_size ,
                                          int A361DisCod ,
                                          java.util.Date A370DisFecCli ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String AV54FilterFullText )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[23];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisFec, T1.DisFecEnt, T1.DisFecCli, T1.DisEst, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.DisCod FROM (TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( ! (0==AV15TFDisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV16TFDisCod_To) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFDisFecCli)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57TFDisFecCli_To)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFDisFec_Sel)) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17TFDisFec)) ) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFDisFec_Sel)) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18TFDisFec_To)) ) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFDisFec_Sel)) )
      {
         addWhere(sWhereString, "(T1.DisFec = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFDisFecEnt)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59TFDisFecEnt_To)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV19TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV20TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV22TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV21TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV24TFDisArtCod_Sel)==0) && ( ! (GXutil.strcmp("", AV23TFDisArtCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV24TFDisArtCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV26TFDisArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV25TFDisArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV26TFDisArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV28TFDisColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV27TFDisColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFDisColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV29TFDisColNum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFDisColNum_To) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFDisTipCol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV32TFDisTipCol_To) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( AV34TFDisEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV34TFDisEst_Sels, "T1.DisEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisFec" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09IH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV34TFDisEst_Sels ,
                                          int AV15TFDisCod ,
                                          int AV16TFDisCod_To ,
                                          java.util.Date AV56TFDisFecCli ,
                                          java.util.Date AV57TFDisFecCli_To ,
                                          java.util.Date AV55TFDisFec_Sel ,
                                          java.util.Date AV17TFDisFec ,
                                          java.util.Date AV18TFDisFec_To ,
                                          java.util.Date AV58TFDisFecEnt ,
                                          java.util.Date AV59TFDisFecEnt_To ,
                                          int AV19TFCliCod ,
                                          int AV20TFCliCod_To ,
                                          String AV22TFCliNom_Sel ,
                                          String AV21TFCliNom ,
                                          String AV24TFDisArtCod_Sel ,
                                          String AV23TFDisArtCod ,
                                          String AV26TFDisArtDsc_Sel ,
                                          String AV25TFDisArtDsc ,
                                          String AV28TFDisColNom_Sel ,
                                          String AV27TFDisColNom ,
                                          int AV29TFDisColNum ,
                                          int AV30TFDisColNum_To ,
                                          byte AV31TFDisTipCol ,
                                          byte AV32TFDisTipCol_To ,
                                          int AV34TFDisEst_Sels_size ,
                                          int A361DisCod ,
                                          java.util.Date A370DisFecCli ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String AV54FilterFullText )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[23];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.DisFecEnt, T1.DisFec, T1.DisFecCli, T1.DisEst, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T1.CliCod," ;
      scmdbuf += " T1.DisCod FROM (TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( ! (0==AV15TFDisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (0==AV16TFDisCod_To) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFDisFecCli)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57TFDisFecCli_To)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFDisFec_Sel)) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17TFDisFec)) ) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFDisFec_Sel)) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18TFDisFec_To)) ) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFDisFec_Sel)) )
      {
         addWhere(sWhereString, "(T1.DisFec = ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFDisFecEnt)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59TFDisFecEnt_To)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (0==AV19TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (0==AV20TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV22TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV21TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV24TFDisArtCod_Sel)==0) && ( ! (GXutil.strcmp("", AV23TFDisArtCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV24TFDisArtCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV26TFDisArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV25TFDisArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV26TFDisArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV28TFDisColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV27TFDisColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFDisColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (0==AV29TFDisColNum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFDisColNum_To) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFDisTipCol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (0==AV32TFDisTipCol_To) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( AV34TFDisEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV34TFDisEst_Sels, "T1.DisEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09IH4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV34TFDisEst_Sels ,
                                          int AV15TFDisCod ,
                                          int AV16TFDisCod_To ,
                                          java.util.Date AV56TFDisFecCli ,
                                          java.util.Date AV57TFDisFecCli_To ,
                                          java.util.Date AV55TFDisFec_Sel ,
                                          java.util.Date AV17TFDisFec ,
                                          java.util.Date AV18TFDisFec_To ,
                                          java.util.Date AV58TFDisFecEnt ,
                                          java.util.Date AV59TFDisFecEnt_To ,
                                          int AV19TFCliCod ,
                                          int AV20TFCliCod_To ,
                                          String AV22TFCliNom_Sel ,
                                          String AV21TFCliNom ,
                                          String AV24TFDisArtCod_Sel ,
                                          String AV23TFDisArtCod ,
                                          String AV26TFDisArtDsc_Sel ,
                                          String AV25TFDisArtDsc ,
                                          String AV28TFDisColNom_Sel ,
                                          String AV27TFDisColNom ,
                                          int AV29TFDisColNum ,
                                          int AV30TFDisColNum_To ,
                                          byte AV31TFDisTipCol ,
                                          byte AV32TFDisTipCol_To ,
                                          int AV34TFDisEst_Sels_size ,
                                          int A361DisCod ,
                                          java.util.Date A370DisFecCli ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String AV54FilterFullText )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[23];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisArtCod, T1.DisFecEnt, T1.DisFec, T1.DisFecCli, T1.DisEst, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.DisCod FROM (TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( ! (0==AV15TFDisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV16TFDisCod_To) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFDisFecCli)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57TFDisFecCli_To)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFDisFec_Sel)) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17TFDisFec)) ) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFDisFec_Sel)) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18TFDisFec_To)) ) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFDisFec_Sel)) )
      {
         addWhere(sWhereString, "(T1.DisFec = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFDisFecEnt)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59TFDisFecEnt_To)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV19TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV20TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV22TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV21TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV24TFDisArtCod_Sel)==0) && ( ! (GXutil.strcmp("", AV23TFDisArtCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV24TFDisArtCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV26TFDisArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV25TFDisArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV26TFDisArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV28TFDisColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV27TFDisColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFDisColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV29TFDisColNum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFDisColNum_To) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFDisTipCol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV32TFDisTipCol_To) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( AV34TFDisEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV34TFDisEst_Sels, "T1.DisEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisArtCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09IH5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV34TFDisEst_Sels ,
                                          int AV15TFDisCod ,
                                          int AV16TFDisCod_To ,
                                          java.util.Date AV56TFDisFecCli ,
                                          java.util.Date AV57TFDisFecCli_To ,
                                          java.util.Date AV55TFDisFec_Sel ,
                                          java.util.Date AV17TFDisFec ,
                                          java.util.Date AV18TFDisFec_To ,
                                          java.util.Date AV58TFDisFecEnt ,
                                          java.util.Date AV59TFDisFecEnt_To ,
                                          int AV19TFCliCod ,
                                          int AV20TFCliCod_To ,
                                          String AV22TFCliNom_Sel ,
                                          String AV21TFCliNom ,
                                          String AV24TFDisArtCod_Sel ,
                                          String AV23TFDisArtCod ,
                                          String AV26TFDisArtDsc_Sel ,
                                          String AV25TFDisArtDsc ,
                                          String AV28TFDisColNom_Sel ,
                                          String AV27TFDisColNom ,
                                          int AV29TFDisColNum ,
                                          int AV30TFDisColNum_To ,
                                          byte AV31TFDisTipCol ,
                                          byte AV32TFDisTipCol_To ,
                                          int AV34TFDisEst_Sels_size ,
                                          int A361DisCod ,
                                          java.util.Date A370DisFecCli ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String AV54FilterFullText )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[23];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisArtDsc, T1.DisFecEnt, T1.DisFec, T1.DisFecCli, T1.DisEst, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtCod, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.DisCod FROM (TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( ! (0==AV15TFDisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (0==AV16TFDisCod_To) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFDisFecCli)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57TFDisFecCli_To)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFDisFec_Sel)) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17TFDisFec)) ) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFDisFec_Sel)) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18TFDisFec_To)) ) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFDisFec_Sel)) )
      {
         addWhere(sWhereString, "(T1.DisFec = ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFDisFecEnt)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59TFDisFecEnt_To)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (0==AV19TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (0==AV20TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV22TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV21TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV24TFDisArtCod_Sel)==0) && ( ! (GXutil.strcmp("", AV23TFDisArtCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV24TFDisArtCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV26TFDisArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV25TFDisArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV26TFDisArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV28TFDisColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV27TFDisColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFDisColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (0==AV29TFDisColNum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFDisColNum_To) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFDisTipCol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (0==AV32TFDisTipCol_To) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( AV34TFDisEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV34TFDisEst_Sels, "T1.DisEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisArtDsc" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P09IH6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV34TFDisEst_Sels ,
                                          int AV15TFDisCod ,
                                          int AV16TFDisCod_To ,
                                          java.util.Date AV56TFDisFecCli ,
                                          java.util.Date AV57TFDisFecCli_To ,
                                          java.util.Date AV55TFDisFec_Sel ,
                                          java.util.Date AV17TFDisFec ,
                                          java.util.Date AV18TFDisFec_To ,
                                          java.util.Date AV58TFDisFecEnt ,
                                          java.util.Date AV59TFDisFecEnt_To ,
                                          int AV19TFCliCod ,
                                          int AV20TFCliCod_To ,
                                          String AV22TFCliNom_Sel ,
                                          String AV21TFCliNom ,
                                          String AV24TFDisArtCod_Sel ,
                                          String AV23TFDisArtCod ,
                                          String AV26TFDisArtDsc_Sel ,
                                          String AV25TFDisArtDsc ,
                                          String AV28TFDisColNom_Sel ,
                                          String AV27TFDisColNom ,
                                          int AV29TFDisColNum ,
                                          int AV30TFDisColNum_To ,
                                          byte AV31TFDisTipCol ,
                                          byte AV32TFDisTipCol_To ,
                                          int AV34TFDisEst_Sels_size ,
                                          int A361DisCod ,
                                          java.util.Date A370DisFecCli ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String AV54FilterFullText )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[23];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisColNom, T1.DisFecEnt, T1.DisFec, T1.DisFecCli, T1.DisEst, T1.DisTipCol, T1.DisColNum, T1.DisArtDsc, T1.DisArtCod, T2.CliNom, T1.CliCod," ;
      scmdbuf += " T1.DisCod FROM (TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( ! (0==AV15TFDisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (0==AV16TFDisCod_To) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFDisFecCli)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57TFDisFecCli_To)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFDisFec_Sel)) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17TFDisFec)) ) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFDisFec_Sel)) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18TFDisFec_To)) ) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFDisFec_Sel)) )
      {
         addWhere(sWhereString, "(T1.DisFec = ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFDisFecEnt)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59TFDisFecEnt_To)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV19TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (0==AV20TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV22TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV21TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV24TFDisArtCod_Sel)==0) && ( ! (GXutil.strcmp("", AV23TFDisArtCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV24TFDisArtCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV26TFDisArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV25TFDisArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV26TFDisArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV28TFDisColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV27TFDisColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFDisColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV29TFDisColNum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV30TFDisColNum_To) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV31TFDisTipCol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (0==AV32TFDisTipCol_To) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( AV34TFDisEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV34TFDisEst_Sels, "T1.DisEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.DisColNom" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_P09IH2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] );
            case 1 :
                  return conditional_P09IH3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] );
            case 2 :
                  return conditional_P09IH4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] );
            case 3 :
                  return conditional_P09IH5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] );
            case 4 :
                  return conditional_P09IH6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09IH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09IH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09IH4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09IH5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09IH6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 26);
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 26);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
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
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
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
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
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
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
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
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
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
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
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
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               return;
      }
   }

}

