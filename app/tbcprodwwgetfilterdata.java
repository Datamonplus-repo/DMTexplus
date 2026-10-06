package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tbcprodwwgetfilterdata extends GXProcedure
{
   public tbcprodwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbcprodwwgetfilterdata.class ), "" );
   }

   public tbcprodwwgetfilterdata( int remoteHandle ,
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
      tbcprodwwgetfilterdata.this.aP5 = new String[] {""};
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
      tbcprodwwgetfilterdata.this.AV32DDOName = aP0;
      tbcprodwwgetfilterdata.this.AV30SearchTxt = aP1;
      tbcprodwwgetfilterdata.this.AV31SearchTxtTo = aP2;
      tbcprodwwgetfilterdata.this.aP3 = aP3;
      tbcprodwwgetfilterdata.this.aP4 = aP4;
      tbcprodwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_BCPRODUCTO") == 0 )
      {
         /* Execute user subroutine: 'LOADBCPRODUCTOOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_BCDESCRIPCION") == 0 )
      {
         /* Execute user subroutine: 'LOADBCDESCRIPCIONOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_BCPROVEEDOR") == 0 )
      {
         /* Execute user subroutine: 'LOADBCPROVEEDOROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_BCDESCERROR") == 0 )
      {
         /* Execute user subroutine: 'LOADBCDESCERROROPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_BCPILAERROR") == 0 )
      {
         /* Execute user subroutine: 'LOADBCPILAERROROPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV36OptionsJson = AV35Options.toJSonString(false) ;
      AV39OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV40OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("TBCPRODWWGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TBCPRODWWGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("TBCPRODWWGridState"), null, null);
      }
      AV65GXV1 = 1 ;
      while ( AV65GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV65GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV62FilterFullText = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPRODUCTO") == 0 )
         {
            AV10TFBCProducto = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPRODUCTO_SEL") == 0 )
         {
            AV11TFBCProducto_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCRIPCION") == 0 )
         {
            AV12TFBCDescripcion = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCRIPCION_SEL") == 0 )
         {
            AV13TFBCDescripcion_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPRECIO") == 0 )
         {
            AV14TFBCPrecio = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFBCPrecio_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCUNDCOMP_SEL") == 0 )
         {
            AV16TFBCUndComp_SelsJson = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV17TFBCUndComp_Sels.fromJSonString(AV16TFBCUndComp_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPROVEEDOR") == 0 )
         {
            AV18TFBCProveedor = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPROVEEDOR_SEL") == 0 )
         {
            AV19TFBCProveedor_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPROCESADO") == 0 )
         {
            AV20TFBCProcesado = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFBCProcesado_To = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCERROR") == 0 )
         {
            AV22TFBCError = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFBCError_To = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCERROR") == 0 )
         {
            AV24TFBCDescError = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCDESCERROR_SEL") == 0 )
         {
            AV25TFBCDescError_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCFECHERROR") == 0 )
         {
            AV26TFBCFechError = localUtil.ctot( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPILAERROR") == 0 )
         {
            AV28TFBCPilaError = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBCPILAERROR_SEL") == 0 )
         {
            AV29TFBCPilaError_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV65GXV1 = (int)(AV65GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBCPRODUCTOOPTIONS' Routine */
      returnInSub = false ;
      AV10TFBCProducto = AV30SearchTxt ;
      AV11TFBCProducto_Sel = "" ;
      AV67Tbcprodwwds_1_filterfulltext = AV62FilterFullText ;
      AV68Tbcprodwwds_2_tfbcproducto = AV10TFBCProducto ;
      AV69Tbcprodwwds_3_tfbcproducto_sel = AV11TFBCProducto_Sel ;
      AV70Tbcprodwwds_4_tfbcdescripcion = AV12TFBCDescripcion ;
      AV71Tbcprodwwds_5_tfbcdescripcion_sel = AV13TFBCDescripcion_Sel ;
      AV72Tbcprodwwds_6_tfbcprecio = AV14TFBCPrecio ;
      AV73Tbcprodwwds_7_tfbcprecio_to = AV15TFBCPrecio_To ;
      AV74Tbcprodwwds_8_tfbcundcomp_sels = AV17TFBCUndComp_Sels ;
      AV75Tbcprodwwds_9_tfbcproveedor = AV18TFBCProveedor ;
      AV76Tbcprodwwds_10_tfbcproveedor_sel = AV19TFBCProveedor_Sel ;
      AV77Tbcprodwwds_11_tfbcprocesado = AV20TFBCProcesado ;
      AV78Tbcprodwwds_12_tfbcprocesado_to = AV21TFBCProcesado_To ;
      AV79Tbcprodwwds_13_tfbcerror = AV22TFBCError ;
      AV80Tbcprodwwds_14_tfbcerror_to = AV23TFBCError_To ;
      AV81Tbcprodwwds_15_tfbcdescerror = AV24TFBCDescError ;
      AV82Tbcprodwwds_16_tfbcdescerror_sel = AV25TFBCDescError_Sel ;
      AV83Tbcprodwwds_17_tfbcfecherror = AV26TFBCFechError ;
      AV84Tbcprodwwds_18_tfbcpilaerror = AV28TFBCPilaError ;
      AV85Tbcprodwwds_19_tfbcpilaerror_sel = AV29TFBCPilaError_Sel ;
      pr_ekamat.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(A13481BCUndComp) ,
                                           AV74Tbcprodwwds_8_tfbcundcomp_sels ,
                                           AV69Tbcprodwwds_3_tfbcproducto_sel ,
                                           AV68Tbcprodwwds_2_tfbcproducto ,
                                           AV71Tbcprodwwds_5_tfbcdescripcion_sel ,
                                           AV70Tbcprodwwds_4_tfbcdescripcion ,
                                           AV72Tbcprodwwds_6_tfbcprecio ,
                                           AV73Tbcprodwwds_7_tfbcprecio_to ,
                                           Integer.valueOf(AV74Tbcprodwwds_8_tfbcundcomp_sels.size()) ,
                                           AV76Tbcprodwwds_10_tfbcproveedor_sel ,
                                           AV75Tbcprodwwds_9_tfbcproveedor ,
                                           Short.valueOf(AV77Tbcprodwwds_11_tfbcprocesado) ,
                                           Short.valueOf(AV78Tbcprodwwds_12_tfbcprocesado_to) ,
                                           Short.valueOf(AV79Tbcprodwwds_13_tfbcerror) ,
                                           Short.valueOf(AV80Tbcprodwwds_14_tfbcerror_to) ,
                                           AV82Tbcprodwwds_16_tfbcdescerror_sel ,
                                           AV81Tbcprodwwds_15_tfbcdescerror ,
                                           AV83Tbcprodwwds_17_tfbcfecherror ,
                                           AV85Tbcprodwwds_19_tfbcpilaerror_sel ,
                                           AV84Tbcprodwwds_18_tfbcpilaerror ,
                                           A13478BCProducto ,
                                           A13479BCDescripc ,
                                           A13480BCPrecio ,
                                           A13482BCProveedo ,
                                           Short.valueOf(A13483BCProcesad) ,
                                           Short.valueOf(A13484BCError) ,
                                           A13485BCDescErro ,
                                           A13486BCFechErro ,
                                           A13487BCPilaErro ,
                                           AV67Tbcprodwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV68Tbcprodwwds_2_tfbcproducto = GXutil.padr( GXutil.rtrim( AV68Tbcprodwwds_2_tfbcproducto), 6, "%") ;
      lV70Tbcprodwwds_4_tfbcdescripcion = GXutil.padr( GXutil.rtrim( AV70Tbcprodwwds_4_tfbcdescripcion), 26, "%") ;
      lV75Tbcprodwwds_9_tfbcproveedor = GXutil.padr( GXutil.rtrim( AV75Tbcprodwwds_9_tfbcproveedor), 20, "%") ;
      lV81Tbcprodwwds_15_tfbcdescerror = GXutil.concat( GXutil.rtrim( AV81Tbcprodwwds_15_tfbcdescerror), "%", "") ;
      lV84Tbcprodwwds_18_tfbcpilaerror = GXutil.concat( GXutil.rtrim( AV84Tbcprodwwds_18_tfbcpilaerror), "%", "") ;
      /* Using cursor P07ZJ2 */
      pr_ekamat.execute(0, new Object[] {lV68Tbcprodwwds_2_tfbcproducto, AV69Tbcprodwwds_3_tfbcproducto_sel, lV70Tbcprodwwds_4_tfbcdescripcion, AV71Tbcprodwwds_5_tfbcdescripcion_sel, AV72Tbcprodwwds_6_tfbcprecio, AV73Tbcprodwwds_7_tfbcprecio_to, lV75Tbcprodwwds_9_tfbcproveedor, AV76Tbcprodwwds_10_tfbcproveedor_sel, Short.valueOf(AV77Tbcprodwwds_11_tfbcprocesado), Short.valueOf(AV78Tbcprodwwds_12_tfbcprocesado_to), Short.valueOf(AV79Tbcprodwwds_13_tfbcerror), Short.valueOf(AV80Tbcprodwwds_14_tfbcerror_to), lV81Tbcprodwwds_15_tfbcdescerror, AV82Tbcprodwwds_16_tfbcdescerror_sel, AV83Tbcprodwwds_17_tfbcfecherror, lV84Tbcprodwwds_18_tfbcpilaerror, AV85Tbcprodwwds_19_tfbcpilaerror_sel});
      while ( (pr_ekamat.getStatus(0) != 101) )
      {
         brk7ZJ2 = false ;
         A13478BCProducto = P07ZJ2_A13478BCProducto[0] ;
         A13487BCPilaErro = P07ZJ2_A13487BCPilaErro[0] ;
         n13487BCPilaErro = P07ZJ2_n13487BCPilaErro[0] ;
         A13486BCFechErro = P07ZJ2_A13486BCFechErro[0] ;
         n13486BCFechErro = P07ZJ2_n13486BCFechErro[0] ;
         A13485BCDescErro = P07ZJ2_A13485BCDescErro[0] ;
         n13485BCDescErro = P07ZJ2_n13485BCDescErro[0] ;
         A13484BCError = P07ZJ2_A13484BCError[0] ;
         n13484BCError = P07ZJ2_n13484BCError[0] ;
         A13483BCProcesad = P07ZJ2_A13483BCProcesad[0] ;
         n13483BCProcesad = P07ZJ2_n13483BCProcesad[0] ;
         A13482BCProveedo = P07ZJ2_A13482BCProveedo[0] ;
         n13482BCProveedo = P07ZJ2_n13482BCProveedo[0] ;
         A13480BCPrecio = P07ZJ2_A13480BCPrecio[0] ;
         n13480BCPrecio = P07ZJ2_n13480BCPrecio[0] ;
         A13479BCDescripc = P07ZJ2_A13479BCDescripc[0] ;
         n13479BCDescripc = P07ZJ2_n13479BCDescripc[0] ;
         A13481BCUndComp = P07ZJ2_A13481BCUndComp[0] ;
         n13481BCUndComp = P07ZJ2_n13481BCUndComp[0] ;
         A396EmprCod = P07ZJ2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV67Tbcprodwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13478BCProducto) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13479BCDescripc) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13480BCPrecio, 13, 5) , GXutil.padr( "%" + AV67Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "kilos", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "litros", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 2 ) ) || ( GXutil.like( GXutil.upper( A13482BCProveedo) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13483BCProcesad, 4, 0) , GXutil.padr( "%" + AV67Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13484BCError, 4, 0) , GXutil.padr( "%" + AV67Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13485BCDescErro) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13487BCPilaErro) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV42count = 0 ;
            while ( (pr_ekamat.getStatus(0) != 101) && ( GXutil.strcmp(P07ZJ2_A13478BCProducto[0], A13478BCProducto) == 0 ) )
            {
               brk7ZJ2 = false ;
               A396EmprCod = P07ZJ2_A396EmprCod[0] ;
               AV42count = (long)(AV42count+1) ;
               brk7ZJ2 = true ;
               pr_ekamat.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A13478BCProducto)==0) )
            {
               AV34Option = A13478BCProducto ;
               AV35Options.add(AV34Option, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV35Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk7ZJ2 )
         {
            brk7ZJ2 = true ;
            pr_ekamat.readNext(0);
         }
      }
      pr_ekamat.close(0);
   }

   public void S131( )
   {
      /* 'LOADBCDESCRIPCIONOPTIONS' Routine */
      returnInSub = false ;
      AV12TFBCDescripcion = AV30SearchTxt ;
      AV13TFBCDescripcion_Sel = "" ;
      AV67Tbcprodwwds_1_filterfulltext = AV62FilterFullText ;
      AV68Tbcprodwwds_2_tfbcproducto = AV10TFBCProducto ;
      AV69Tbcprodwwds_3_tfbcproducto_sel = AV11TFBCProducto_Sel ;
      AV70Tbcprodwwds_4_tfbcdescripcion = AV12TFBCDescripcion ;
      AV71Tbcprodwwds_5_tfbcdescripcion_sel = AV13TFBCDescripcion_Sel ;
      AV72Tbcprodwwds_6_tfbcprecio = AV14TFBCPrecio ;
      AV73Tbcprodwwds_7_tfbcprecio_to = AV15TFBCPrecio_To ;
      AV74Tbcprodwwds_8_tfbcundcomp_sels = AV17TFBCUndComp_Sels ;
      AV75Tbcprodwwds_9_tfbcproveedor = AV18TFBCProveedor ;
      AV76Tbcprodwwds_10_tfbcproveedor_sel = AV19TFBCProveedor_Sel ;
      AV77Tbcprodwwds_11_tfbcprocesado = AV20TFBCProcesado ;
      AV78Tbcprodwwds_12_tfbcprocesado_to = AV21TFBCProcesado_To ;
      AV79Tbcprodwwds_13_tfbcerror = AV22TFBCError ;
      AV80Tbcprodwwds_14_tfbcerror_to = AV23TFBCError_To ;
      AV81Tbcprodwwds_15_tfbcdescerror = AV24TFBCDescError ;
      AV82Tbcprodwwds_16_tfbcdescerror_sel = AV25TFBCDescError_Sel ;
      AV83Tbcprodwwds_17_tfbcfecherror = AV26TFBCFechError ;
      AV84Tbcprodwwds_18_tfbcpilaerror = AV28TFBCPilaError ;
      AV85Tbcprodwwds_19_tfbcpilaerror_sel = AV29TFBCPilaError_Sel ;
      pr_ekamat.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(A13481BCUndComp) ,
                                           AV74Tbcprodwwds_8_tfbcundcomp_sels ,
                                           AV69Tbcprodwwds_3_tfbcproducto_sel ,
                                           AV68Tbcprodwwds_2_tfbcproducto ,
                                           AV71Tbcprodwwds_5_tfbcdescripcion_sel ,
                                           AV70Tbcprodwwds_4_tfbcdescripcion ,
                                           AV72Tbcprodwwds_6_tfbcprecio ,
                                           AV73Tbcprodwwds_7_tfbcprecio_to ,
                                           Integer.valueOf(AV74Tbcprodwwds_8_tfbcundcomp_sels.size()) ,
                                           AV76Tbcprodwwds_10_tfbcproveedor_sel ,
                                           AV75Tbcprodwwds_9_tfbcproveedor ,
                                           Short.valueOf(AV77Tbcprodwwds_11_tfbcprocesado) ,
                                           Short.valueOf(AV78Tbcprodwwds_12_tfbcprocesado_to) ,
                                           Short.valueOf(AV79Tbcprodwwds_13_tfbcerror) ,
                                           Short.valueOf(AV80Tbcprodwwds_14_tfbcerror_to) ,
                                           AV82Tbcprodwwds_16_tfbcdescerror_sel ,
                                           AV81Tbcprodwwds_15_tfbcdescerror ,
                                           AV83Tbcprodwwds_17_tfbcfecherror ,
                                           AV85Tbcprodwwds_19_tfbcpilaerror_sel ,
                                           AV84Tbcprodwwds_18_tfbcpilaerror ,
                                           A13478BCProducto ,
                                           A13479BCDescripc ,
                                           A13480BCPrecio ,
                                           A13482BCProveedo ,
                                           Short.valueOf(A13483BCProcesad) ,
                                           Short.valueOf(A13484BCError) ,
                                           A13485BCDescErro ,
                                           A13486BCFechErro ,
                                           A13487BCPilaErro ,
                                           AV67Tbcprodwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV68Tbcprodwwds_2_tfbcproducto = GXutil.padr( GXutil.rtrim( AV68Tbcprodwwds_2_tfbcproducto), 6, "%") ;
      lV70Tbcprodwwds_4_tfbcdescripcion = GXutil.padr( GXutil.rtrim( AV70Tbcprodwwds_4_tfbcdescripcion), 26, "%") ;
      lV75Tbcprodwwds_9_tfbcproveedor = GXutil.padr( GXutil.rtrim( AV75Tbcprodwwds_9_tfbcproveedor), 20, "%") ;
      lV81Tbcprodwwds_15_tfbcdescerror = GXutil.concat( GXutil.rtrim( AV81Tbcprodwwds_15_tfbcdescerror), "%", "") ;
      lV84Tbcprodwwds_18_tfbcpilaerror = GXutil.concat( GXutil.rtrim( AV84Tbcprodwwds_18_tfbcpilaerror), "%", "") ;
      /* Using cursor P07ZJ3 */
      pr_ekamat.execute(1, new Object[] {lV68Tbcprodwwds_2_tfbcproducto, AV69Tbcprodwwds_3_tfbcproducto_sel, lV70Tbcprodwwds_4_tfbcdescripcion, AV71Tbcprodwwds_5_tfbcdescripcion_sel, AV72Tbcprodwwds_6_tfbcprecio, AV73Tbcprodwwds_7_tfbcprecio_to, lV75Tbcprodwwds_9_tfbcproveedor, AV76Tbcprodwwds_10_tfbcproveedor_sel, Short.valueOf(AV77Tbcprodwwds_11_tfbcprocesado), Short.valueOf(AV78Tbcprodwwds_12_tfbcprocesado_to), Short.valueOf(AV79Tbcprodwwds_13_tfbcerror), Short.valueOf(AV80Tbcprodwwds_14_tfbcerror_to), lV81Tbcprodwwds_15_tfbcdescerror, AV82Tbcprodwwds_16_tfbcdescerror_sel, AV83Tbcprodwwds_17_tfbcfecherror, lV84Tbcprodwwds_18_tfbcpilaerror, AV85Tbcprodwwds_19_tfbcpilaerror_sel});
      while ( (pr_ekamat.getStatus(1) != 101) )
      {
         brk7ZJ4 = false ;
         A13479BCDescripc = P07ZJ3_A13479BCDescripc[0] ;
         n13479BCDescripc = P07ZJ3_n13479BCDescripc[0] ;
         A13487BCPilaErro = P07ZJ3_A13487BCPilaErro[0] ;
         n13487BCPilaErro = P07ZJ3_n13487BCPilaErro[0] ;
         A13486BCFechErro = P07ZJ3_A13486BCFechErro[0] ;
         n13486BCFechErro = P07ZJ3_n13486BCFechErro[0] ;
         A13485BCDescErro = P07ZJ3_A13485BCDescErro[0] ;
         n13485BCDescErro = P07ZJ3_n13485BCDescErro[0] ;
         A13484BCError = P07ZJ3_A13484BCError[0] ;
         n13484BCError = P07ZJ3_n13484BCError[0] ;
         A13483BCProcesad = P07ZJ3_A13483BCProcesad[0] ;
         n13483BCProcesad = P07ZJ3_n13483BCProcesad[0] ;
         A13482BCProveedo = P07ZJ3_A13482BCProveedo[0] ;
         n13482BCProveedo = P07ZJ3_n13482BCProveedo[0] ;
         A13480BCPrecio = P07ZJ3_A13480BCPrecio[0] ;
         n13480BCPrecio = P07ZJ3_n13480BCPrecio[0] ;
         A13478BCProducto = P07ZJ3_A13478BCProducto[0] ;
         A13481BCUndComp = P07ZJ3_A13481BCUndComp[0] ;
         n13481BCUndComp = P07ZJ3_n13481BCUndComp[0] ;
         A396EmprCod = P07ZJ3_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV67Tbcprodwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13478BCProducto) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13479BCDescripc) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13480BCPrecio, 13, 5) , GXutil.padr( "%" + AV67Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "kilos", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "litros", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 2 ) ) || ( GXutil.like( GXutil.upper( A13482BCProveedo) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13483BCProcesad, 4, 0) , GXutil.padr( "%" + AV67Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13484BCError, 4, 0) , GXutil.padr( "%" + AV67Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13485BCDescErro) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13487BCPilaErro) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV42count = 0 ;
            while ( (pr_ekamat.getStatus(1) != 101) && ( GXutil.strcmp(P07ZJ3_A13479BCDescripc[0], A13479BCDescripc) == 0 ) )
            {
               brk7ZJ4 = false ;
               A13478BCProducto = P07ZJ3_A13478BCProducto[0] ;
               A396EmprCod = P07ZJ3_A396EmprCod[0] ;
               AV42count = (long)(AV42count+1) ;
               brk7ZJ4 = true ;
               pr_ekamat.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A13479BCDescripc)==0) )
            {
               AV34Option = A13479BCDescripc ;
               AV35Options.add(AV34Option, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV35Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk7ZJ4 )
         {
            brk7ZJ4 = true ;
            pr_ekamat.readNext(1);
         }
      }
      pr_ekamat.close(1);
   }

   public void S141( )
   {
      /* 'LOADBCPROVEEDOROPTIONS' Routine */
      returnInSub = false ;
      AV18TFBCProveedor = AV30SearchTxt ;
      AV19TFBCProveedor_Sel = "" ;
      AV67Tbcprodwwds_1_filterfulltext = AV62FilterFullText ;
      AV68Tbcprodwwds_2_tfbcproducto = AV10TFBCProducto ;
      AV69Tbcprodwwds_3_tfbcproducto_sel = AV11TFBCProducto_Sel ;
      AV70Tbcprodwwds_4_tfbcdescripcion = AV12TFBCDescripcion ;
      AV71Tbcprodwwds_5_tfbcdescripcion_sel = AV13TFBCDescripcion_Sel ;
      AV72Tbcprodwwds_6_tfbcprecio = AV14TFBCPrecio ;
      AV73Tbcprodwwds_7_tfbcprecio_to = AV15TFBCPrecio_To ;
      AV74Tbcprodwwds_8_tfbcundcomp_sels = AV17TFBCUndComp_Sels ;
      AV75Tbcprodwwds_9_tfbcproveedor = AV18TFBCProveedor ;
      AV76Tbcprodwwds_10_tfbcproveedor_sel = AV19TFBCProveedor_Sel ;
      AV77Tbcprodwwds_11_tfbcprocesado = AV20TFBCProcesado ;
      AV78Tbcprodwwds_12_tfbcprocesado_to = AV21TFBCProcesado_To ;
      AV79Tbcprodwwds_13_tfbcerror = AV22TFBCError ;
      AV80Tbcprodwwds_14_tfbcerror_to = AV23TFBCError_To ;
      AV81Tbcprodwwds_15_tfbcdescerror = AV24TFBCDescError ;
      AV82Tbcprodwwds_16_tfbcdescerror_sel = AV25TFBCDescError_Sel ;
      AV83Tbcprodwwds_17_tfbcfecherror = AV26TFBCFechError ;
      AV84Tbcprodwwds_18_tfbcpilaerror = AV28TFBCPilaError ;
      AV85Tbcprodwwds_19_tfbcpilaerror_sel = AV29TFBCPilaError_Sel ;
      pr_ekamat.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(A13481BCUndComp) ,
                                           AV74Tbcprodwwds_8_tfbcundcomp_sels ,
                                           AV69Tbcprodwwds_3_tfbcproducto_sel ,
                                           AV68Tbcprodwwds_2_tfbcproducto ,
                                           AV71Tbcprodwwds_5_tfbcdescripcion_sel ,
                                           AV70Tbcprodwwds_4_tfbcdescripcion ,
                                           AV72Tbcprodwwds_6_tfbcprecio ,
                                           AV73Tbcprodwwds_7_tfbcprecio_to ,
                                           Integer.valueOf(AV74Tbcprodwwds_8_tfbcundcomp_sels.size()) ,
                                           AV76Tbcprodwwds_10_tfbcproveedor_sel ,
                                           AV75Tbcprodwwds_9_tfbcproveedor ,
                                           Short.valueOf(AV77Tbcprodwwds_11_tfbcprocesado) ,
                                           Short.valueOf(AV78Tbcprodwwds_12_tfbcprocesado_to) ,
                                           Short.valueOf(AV79Tbcprodwwds_13_tfbcerror) ,
                                           Short.valueOf(AV80Tbcprodwwds_14_tfbcerror_to) ,
                                           AV82Tbcprodwwds_16_tfbcdescerror_sel ,
                                           AV81Tbcprodwwds_15_tfbcdescerror ,
                                           AV83Tbcprodwwds_17_tfbcfecherror ,
                                           AV85Tbcprodwwds_19_tfbcpilaerror_sel ,
                                           AV84Tbcprodwwds_18_tfbcpilaerror ,
                                           A13478BCProducto ,
                                           A13479BCDescripc ,
                                           A13480BCPrecio ,
                                           A13482BCProveedo ,
                                           Short.valueOf(A13483BCProcesad) ,
                                           Short.valueOf(A13484BCError) ,
                                           A13485BCDescErro ,
                                           A13486BCFechErro ,
                                           A13487BCPilaErro ,
                                           AV67Tbcprodwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV68Tbcprodwwds_2_tfbcproducto = GXutil.padr( GXutil.rtrim( AV68Tbcprodwwds_2_tfbcproducto), 6, "%") ;
      lV70Tbcprodwwds_4_tfbcdescripcion = GXutil.padr( GXutil.rtrim( AV70Tbcprodwwds_4_tfbcdescripcion), 26, "%") ;
      lV75Tbcprodwwds_9_tfbcproveedor = GXutil.padr( GXutil.rtrim( AV75Tbcprodwwds_9_tfbcproveedor), 20, "%") ;
      lV81Tbcprodwwds_15_tfbcdescerror = GXutil.concat( GXutil.rtrim( AV81Tbcprodwwds_15_tfbcdescerror), "%", "") ;
      lV84Tbcprodwwds_18_tfbcpilaerror = GXutil.concat( GXutil.rtrim( AV84Tbcprodwwds_18_tfbcpilaerror), "%", "") ;
      /* Using cursor P07ZJ4 */
      pr_ekamat.execute(2, new Object[] {lV68Tbcprodwwds_2_tfbcproducto, AV69Tbcprodwwds_3_tfbcproducto_sel, lV70Tbcprodwwds_4_tfbcdescripcion, AV71Tbcprodwwds_5_tfbcdescripcion_sel, AV72Tbcprodwwds_6_tfbcprecio, AV73Tbcprodwwds_7_tfbcprecio_to, lV75Tbcprodwwds_9_tfbcproveedor, AV76Tbcprodwwds_10_tfbcproveedor_sel, Short.valueOf(AV77Tbcprodwwds_11_tfbcprocesado), Short.valueOf(AV78Tbcprodwwds_12_tfbcprocesado_to), Short.valueOf(AV79Tbcprodwwds_13_tfbcerror), Short.valueOf(AV80Tbcprodwwds_14_tfbcerror_to), lV81Tbcprodwwds_15_tfbcdescerror, AV82Tbcprodwwds_16_tfbcdescerror_sel, AV83Tbcprodwwds_17_tfbcfecherror, lV84Tbcprodwwds_18_tfbcpilaerror, AV85Tbcprodwwds_19_tfbcpilaerror_sel});
      while ( (pr_ekamat.getStatus(2) != 101) )
      {
         brk7ZJ6 = false ;
         A13482BCProveedo = P07ZJ4_A13482BCProveedo[0] ;
         n13482BCProveedo = P07ZJ4_n13482BCProveedo[0] ;
         A13487BCPilaErro = P07ZJ4_A13487BCPilaErro[0] ;
         n13487BCPilaErro = P07ZJ4_n13487BCPilaErro[0] ;
         A13486BCFechErro = P07ZJ4_A13486BCFechErro[0] ;
         n13486BCFechErro = P07ZJ4_n13486BCFechErro[0] ;
         A13485BCDescErro = P07ZJ4_A13485BCDescErro[0] ;
         n13485BCDescErro = P07ZJ4_n13485BCDescErro[0] ;
         A13484BCError = P07ZJ4_A13484BCError[0] ;
         n13484BCError = P07ZJ4_n13484BCError[0] ;
         A13483BCProcesad = P07ZJ4_A13483BCProcesad[0] ;
         n13483BCProcesad = P07ZJ4_n13483BCProcesad[0] ;
         A13480BCPrecio = P07ZJ4_A13480BCPrecio[0] ;
         n13480BCPrecio = P07ZJ4_n13480BCPrecio[0] ;
         A13479BCDescripc = P07ZJ4_A13479BCDescripc[0] ;
         n13479BCDescripc = P07ZJ4_n13479BCDescripc[0] ;
         A13478BCProducto = P07ZJ4_A13478BCProducto[0] ;
         A13481BCUndComp = P07ZJ4_A13481BCUndComp[0] ;
         n13481BCUndComp = P07ZJ4_n13481BCUndComp[0] ;
         A396EmprCod = P07ZJ4_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV67Tbcprodwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13478BCProducto) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13479BCDescripc) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13480BCPrecio, 13, 5) , GXutil.padr( "%" + AV67Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "kilos", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "litros", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 2 ) ) || ( GXutil.like( GXutil.upper( A13482BCProveedo) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13483BCProcesad, 4, 0) , GXutil.padr( "%" + AV67Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13484BCError, 4, 0) , GXutil.padr( "%" + AV67Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13485BCDescErro) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13487BCPilaErro) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV42count = 0 ;
            while ( (pr_ekamat.getStatus(2) != 101) && ( GXutil.strcmp(P07ZJ4_A13482BCProveedo[0], A13482BCProveedo) == 0 ) )
            {
               brk7ZJ6 = false ;
               A13478BCProducto = P07ZJ4_A13478BCProducto[0] ;
               A396EmprCod = P07ZJ4_A396EmprCod[0] ;
               AV42count = (long)(AV42count+1) ;
               brk7ZJ6 = true ;
               pr_ekamat.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A13482BCProveedo)==0) )
            {
               AV34Option = A13482BCProveedo ;
               AV35Options.add(AV34Option, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV35Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk7ZJ6 )
         {
            brk7ZJ6 = true ;
            pr_ekamat.readNext(2);
         }
      }
      pr_ekamat.close(2);
   }

   public void S151( )
   {
      /* 'LOADBCDESCERROROPTIONS' Routine */
      returnInSub = false ;
      AV24TFBCDescError = AV30SearchTxt ;
      AV25TFBCDescError_Sel = "" ;
      AV67Tbcprodwwds_1_filterfulltext = AV62FilterFullText ;
      AV68Tbcprodwwds_2_tfbcproducto = AV10TFBCProducto ;
      AV69Tbcprodwwds_3_tfbcproducto_sel = AV11TFBCProducto_Sel ;
      AV70Tbcprodwwds_4_tfbcdescripcion = AV12TFBCDescripcion ;
      AV71Tbcprodwwds_5_tfbcdescripcion_sel = AV13TFBCDescripcion_Sel ;
      AV72Tbcprodwwds_6_tfbcprecio = AV14TFBCPrecio ;
      AV73Tbcprodwwds_7_tfbcprecio_to = AV15TFBCPrecio_To ;
      AV74Tbcprodwwds_8_tfbcundcomp_sels = AV17TFBCUndComp_Sels ;
      AV75Tbcprodwwds_9_tfbcproveedor = AV18TFBCProveedor ;
      AV76Tbcprodwwds_10_tfbcproveedor_sel = AV19TFBCProveedor_Sel ;
      AV77Tbcprodwwds_11_tfbcprocesado = AV20TFBCProcesado ;
      AV78Tbcprodwwds_12_tfbcprocesado_to = AV21TFBCProcesado_To ;
      AV79Tbcprodwwds_13_tfbcerror = AV22TFBCError ;
      AV80Tbcprodwwds_14_tfbcerror_to = AV23TFBCError_To ;
      AV81Tbcprodwwds_15_tfbcdescerror = AV24TFBCDescError ;
      AV82Tbcprodwwds_16_tfbcdescerror_sel = AV25TFBCDescError_Sel ;
      AV83Tbcprodwwds_17_tfbcfecherror = AV26TFBCFechError ;
      AV84Tbcprodwwds_18_tfbcpilaerror = AV28TFBCPilaError ;
      AV85Tbcprodwwds_19_tfbcpilaerror_sel = AV29TFBCPilaError_Sel ;
      pr_ekamat.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(A13481BCUndComp) ,
                                           AV74Tbcprodwwds_8_tfbcundcomp_sels ,
                                           AV69Tbcprodwwds_3_tfbcproducto_sel ,
                                           AV68Tbcprodwwds_2_tfbcproducto ,
                                           AV71Tbcprodwwds_5_tfbcdescripcion_sel ,
                                           AV70Tbcprodwwds_4_tfbcdescripcion ,
                                           AV72Tbcprodwwds_6_tfbcprecio ,
                                           AV73Tbcprodwwds_7_tfbcprecio_to ,
                                           Integer.valueOf(AV74Tbcprodwwds_8_tfbcundcomp_sels.size()) ,
                                           AV76Tbcprodwwds_10_tfbcproveedor_sel ,
                                           AV75Tbcprodwwds_9_tfbcproveedor ,
                                           Short.valueOf(AV77Tbcprodwwds_11_tfbcprocesado) ,
                                           Short.valueOf(AV78Tbcprodwwds_12_tfbcprocesado_to) ,
                                           Short.valueOf(AV79Tbcprodwwds_13_tfbcerror) ,
                                           Short.valueOf(AV80Tbcprodwwds_14_tfbcerror_to) ,
                                           AV82Tbcprodwwds_16_tfbcdescerror_sel ,
                                           AV81Tbcprodwwds_15_tfbcdescerror ,
                                           AV83Tbcprodwwds_17_tfbcfecherror ,
                                           AV85Tbcprodwwds_19_tfbcpilaerror_sel ,
                                           AV84Tbcprodwwds_18_tfbcpilaerror ,
                                           A13478BCProducto ,
                                           A13479BCDescripc ,
                                           A13480BCPrecio ,
                                           A13482BCProveedo ,
                                           Short.valueOf(A13483BCProcesad) ,
                                           Short.valueOf(A13484BCError) ,
                                           A13485BCDescErro ,
                                           A13486BCFechErro ,
                                           A13487BCPilaErro ,
                                           AV67Tbcprodwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV68Tbcprodwwds_2_tfbcproducto = GXutil.padr( GXutil.rtrim( AV68Tbcprodwwds_2_tfbcproducto), 6, "%") ;
      lV70Tbcprodwwds_4_tfbcdescripcion = GXutil.padr( GXutil.rtrim( AV70Tbcprodwwds_4_tfbcdescripcion), 26, "%") ;
      lV75Tbcprodwwds_9_tfbcproveedor = GXutil.padr( GXutil.rtrim( AV75Tbcprodwwds_9_tfbcproveedor), 20, "%") ;
      lV81Tbcprodwwds_15_tfbcdescerror = GXutil.concat( GXutil.rtrim( AV81Tbcprodwwds_15_tfbcdescerror), "%", "") ;
      lV84Tbcprodwwds_18_tfbcpilaerror = GXutil.concat( GXutil.rtrim( AV84Tbcprodwwds_18_tfbcpilaerror), "%", "") ;
      /* Using cursor P07ZJ5 */
      pr_ekamat.execute(3, new Object[] {lV68Tbcprodwwds_2_tfbcproducto, AV69Tbcprodwwds_3_tfbcproducto_sel, lV70Tbcprodwwds_4_tfbcdescripcion, AV71Tbcprodwwds_5_tfbcdescripcion_sel, AV72Tbcprodwwds_6_tfbcprecio, AV73Tbcprodwwds_7_tfbcprecio_to, lV75Tbcprodwwds_9_tfbcproveedor, AV76Tbcprodwwds_10_tfbcproveedor_sel, Short.valueOf(AV77Tbcprodwwds_11_tfbcprocesado), Short.valueOf(AV78Tbcprodwwds_12_tfbcprocesado_to), Short.valueOf(AV79Tbcprodwwds_13_tfbcerror), Short.valueOf(AV80Tbcprodwwds_14_tfbcerror_to), lV81Tbcprodwwds_15_tfbcdescerror, AV82Tbcprodwwds_16_tfbcdescerror_sel, AV83Tbcprodwwds_17_tfbcfecherror, lV84Tbcprodwwds_18_tfbcpilaerror, AV85Tbcprodwwds_19_tfbcpilaerror_sel});
      while ( (pr_ekamat.getStatus(3) != 101) )
      {
         brk7ZJ8 = false ;
         A13485BCDescErro = P07ZJ5_A13485BCDescErro[0] ;
         n13485BCDescErro = P07ZJ5_n13485BCDescErro[0] ;
         A13487BCPilaErro = P07ZJ5_A13487BCPilaErro[0] ;
         n13487BCPilaErro = P07ZJ5_n13487BCPilaErro[0] ;
         A13486BCFechErro = P07ZJ5_A13486BCFechErro[0] ;
         n13486BCFechErro = P07ZJ5_n13486BCFechErro[0] ;
         A13484BCError = P07ZJ5_A13484BCError[0] ;
         n13484BCError = P07ZJ5_n13484BCError[0] ;
         A13483BCProcesad = P07ZJ5_A13483BCProcesad[0] ;
         n13483BCProcesad = P07ZJ5_n13483BCProcesad[0] ;
         A13482BCProveedo = P07ZJ5_A13482BCProveedo[0] ;
         n13482BCProveedo = P07ZJ5_n13482BCProveedo[0] ;
         A13480BCPrecio = P07ZJ5_A13480BCPrecio[0] ;
         n13480BCPrecio = P07ZJ5_n13480BCPrecio[0] ;
         A13479BCDescripc = P07ZJ5_A13479BCDescripc[0] ;
         n13479BCDescripc = P07ZJ5_n13479BCDescripc[0] ;
         A13478BCProducto = P07ZJ5_A13478BCProducto[0] ;
         A13481BCUndComp = P07ZJ5_A13481BCUndComp[0] ;
         n13481BCUndComp = P07ZJ5_n13481BCUndComp[0] ;
         A396EmprCod = P07ZJ5_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV67Tbcprodwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13478BCProducto) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13479BCDescripc) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13480BCPrecio, 13, 5) , GXutil.padr( "%" + AV67Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "kilos", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "litros", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 2 ) ) || ( GXutil.like( GXutil.upper( A13482BCProveedo) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13483BCProcesad, 4, 0) , GXutil.padr( "%" + AV67Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13484BCError, 4, 0) , GXutil.padr( "%" + AV67Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13485BCDescErro) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13487BCPilaErro) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV42count = 0 ;
            while ( (pr_ekamat.getStatus(3) != 101) && ( GXutil.strcmp(P07ZJ5_A13485BCDescErro[0], A13485BCDescErro) == 0 ) )
            {
               brk7ZJ8 = false ;
               A13478BCProducto = P07ZJ5_A13478BCProducto[0] ;
               A396EmprCod = P07ZJ5_A396EmprCod[0] ;
               AV42count = (long)(AV42count+1) ;
               brk7ZJ8 = true ;
               pr_ekamat.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A13485BCDescErro)==0) )
            {
               AV34Option = A13485BCDescErro ;
               AV35Options.add(AV34Option, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV35Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk7ZJ8 )
         {
            brk7ZJ8 = true ;
            pr_ekamat.readNext(3);
         }
      }
      pr_ekamat.close(3);
   }

   public void S161( )
   {
      /* 'LOADBCPILAERROROPTIONS' Routine */
      returnInSub = false ;
      AV28TFBCPilaError = AV30SearchTxt ;
      AV29TFBCPilaError_Sel = "" ;
      AV67Tbcprodwwds_1_filterfulltext = AV62FilterFullText ;
      AV68Tbcprodwwds_2_tfbcproducto = AV10TFBCProducto ;
      AV69Tbcprodwwds_3_tfbcproducto_sel = AV11TFBCProducto_Sel ;
      AV70Tbcprodwwds_4_tfbcdescripcion = AV12TFBCDescripcion ;
      AV71Tbcprodwwds_5_tfbcdescripcion_sel = AV13TFBCDescripcion_Sel ;
      AV72Tbcprodwwds_6_tfbcprecio = AV14TFBCPrecio ;
      AV73Tbcprodwwds_7_tfbcprecio_to = AV15TFBCPrecio_To ;
      AV74Tbcprodwwds_8_tfbcundcomp_sels = AV17TFBCUndComp_Sels ;
      AV75Tbcprodwwds_9_tfbcproveedor = AV18TFBCProveedor ;
      AV76Tbcprodwwds_10_tfbcproveedor_sel = AV19TFBCProveedor_Sel ;
      AV77Tbcprodwwds_11_tfbcprocesado = AV20TFBCProcesado ;
      AV78Tbcprodwwds_12_tfbcprocesado_to = AV21TFBCProcesado_To ;
      AV79Tbcprodwwds_13_tfbcerror = AV22TFBCError ;
      AV80Tbcprodwwds_14_tfbcerror_to = AV23TFBCError_To ;
      AV81Tbcprodwwds_15_tfbcdescerror = AV24TFBCDescError ;
      AV82Tbcprodwwds_16_tfbcdescerror_sel = AV25TFBCDescError_Sel ;
      AV83Tbcprodwwds_17_tfbcfecherror = AV26TFBCFechError ;
      AV84Tbcprodwwds_18_tfbcpilaerror = AV28TFBCPilaError ;
      AV85Tbcprodwwds_19_tfbcpilaerror_sel = AV29TFBCPilaError_Sel ;
      pr_ekamat.dynParam(4, new Object[]{ new Object[]{
                                           Short.valueOf(A13481BCUndComp) ,
                                           AV74Tbcprodwwds_8_tfbcundcomp_sels ,
                                           AV69Tbcprodwwds_3_tfbcproducto_sel ,
                                           AV68Tbcprodwwds_2_tfbcproducto ,
                                           AV71Tbcprodwwds_5_tfbcdescripcion_sel ,
                                           AV70Tbcprodwwds_4_tfbcdescripcion ,
                                           AV72Tbcprodwwds_6_tfbcprecio ,
                                           AV73Tbcprodwwds_7_tfbcprecio_to ,
                                           Integer.valueOf(AV74Tbcprodwwds_8_tfbcundcomp_sels.size()) ,
                                           AV76Tbcprodwwds_10_tfbcproveedor_sel ,
                                           AV75Tbcprodwwds_9_tfbcproveedor ,
                                           Short.valueOf(AV77Tbcprodwwds_11_tfbcprocesado) ,
                                           Short.valueOf(AV78Tbcprodwwds_12_tfbcprocesado_to) ,
                                           Short.valueOf(AV79Tbcprodwwds_13_tfbcerror) ,
                                           Short.valueOf(AV80Tbcprodwwds_14_tfbcerror_to) ,
                                           AV82Tbcprodwwds_16_tfbcdescerror_sel ,
                                           AV81Tbcprodwwds_15_tfbcdescerror ,
                                           AV83Tbcprodwwds_17_tfbcfecherror ,
                                           AV85Tbcprodwwds_19_tfbcpilaerror_sel ,
                                           AV84Tbcprodwwds_18_tfbcpilaerror ,
                                           A13478BCProducto ,
                                           A13479BCDescripc ,
                                           A13480BCPrecio ,
                                           A13482BCProveedo ,
                                           Short.valueOf(A13483BCProcesad) ,
                                           Short.valueOf(A13484BCError) ,
                                           A13485BCDescErro ,
                                           A13486BCFechErro ,
                                           A13487BCPilaErro ,
                                           AV67Tbcprodwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV68Tbcprodwwds_2_tfbcproducto = GXutil.padr( GXutil.rtrim( AV68Tbcprodwwds_2_tfbcproducto), 6, "%") ;
      lV70Tbcprodwwds_4_tfbcdescripcion = GXutil.padr( GXutil.rtrim( AV70Tbcprodwwds_4_tfbcdescripcion), 26, "%") ;
      lV75Tbcprodwwds_9_tfbcproveedor = GXutil.padr( GXutil.rtrim( AV75Tbcprodwwds_9_tfbcproveedor), 20, "%") ;
      lV81Tbcprodwwds_15_tfbcdescerror = GXutil.concat( GXutil.rtrim( AV81Tbcprodwwds_15_tfbcdescerror), "%", "") ;
      lV84Tbcprodwwds_18_tfbcpilaerror = GXutil.concat( GXutil.rtrim( AV84Tbcprodwwds_18_tfbcpilaerror), "%", "") ;
      /* Using cursor P07ZJ6 */
      pr_ekamat.execute(4, new Object[] {lV68Tbcprodwwds_2_tfbcproducto, AV69Tbcprodwwds_3_tfbcproducto_sel, lV70Tbcprodwwds_4_tfbcdescripcion, AV71Tbcprodwwds_5_tfbcdescripcion_sel, AV72Tbcprodwwds_6_tfbcprecio, AV73Tbcprodwwds_7_tfbcprecio_to, lV75Tbcprodwwds_9_tfbcproveedor, AV76Tbcprodwwds_10_tfbcproveedor_sel, Short.valueOf(AV77Tbcprodwwds_11_tfbcprocesado), Short.valueOf(AV78Tbcprodwwds_12_tfbcprocesado_to), Short.valueOf(AV79Tbcprodwwds_13_tfbcerror), Short.valueOf(AV80Tbcprodwwds_14_tfbcerror_to), lV81Tbcprodwwds_15_tfbcdescerror, AV82Tbcprodwwds_16_tfbcdescerror_sel, AV83Tbcprodwwds_17_tfbcfecherror, lV84Tbcprodwwds_18_tfbcpilaerror, AV85Tbcprodwwds_19_tfbcpilaerror_sel});
      while ( (pr_ekamat.getStatus(4) != 101) )
      {
         brk7ZJ10 = false ;
         A13487BCPilaErro = P07ZJ6_A13487BCPilaErro[0] ;
         n13487BCPilaErro = P07ZJ6_n13487BCPilaErro[0] ;
         A13486BCFechErro = P07ZJ6_A13486BCFechErro[0] ;
         n13486BCFechErro = P07ZJ6_n13486BCFechErro[0] ;
         A13485BCDescErro = P07ZJ6_A13485BCDescErro[0] ;
         n13485BCDescErro = P07ZJ6_n13485BCDescErro[0] ;
         A13484BCError = P07ZJ6_A13484BCError[0] ;
         n13484BCError = P07ZJ6_n13484BCError[0] ;
         A13483BCProcesad = P07ZJ6_A13483BCProcesad[0] ;
         n13483BCProcesad = P07ZJ6_n13483BCProcesad[0] ;
         A13482BCProveedo = P07ZJ6_A13482BCProveedo[0] ;
         n13482BCProveedo = P07ZJ6_n13482BCProveedo[0] ;
         A13480BCPrecio = P07ZJ6_A13480BCPrecio[0] ;
         n13480BCPrecio = P07ZJ6_n13480BCPrecio[0] ;
         A13479BCDescripc = P07ZJ6_A13479BCDescripc[0] ;
         n13479BCDescripc = P07ZJ6_n13479BCDescripc[0] ;
         A13478BCProducto = P07ZJ6_A13478BCProducto[0] ;
         A13481BCUndComp = P07ZJ6_A13481BCUndComp[0] ;
         n13481BCUndComp = P07ZJ6_n13481BCUndComp[0] ;
         A396EmprCod = P07ZJ6_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV67Tbcprodwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13478BCProducto) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13479BCDescripc) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13480BCPrecio, 13, 5) , GXutil.padr( "%" + AV67Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "kilos", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "litros", ""), "") , GXutil.padr( "%" + GXutil.lower( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13481BCUndComp == 2 ) ) || ( GXutil.like( GXutil.upper( A13482BCProveedo) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13483BCProcesad, 4, 0) , GXutil.padr( "%" + AV67Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13484BCError, 4, 0) , GXutil.padr( "%" + AV67Tbcprodwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13485BCDescErro) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13487BCPilaErro) , GXutil.padr( "%" + GXutil.upper( AV67Tbcprodwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV42count = 0 ;
            while ( (pr_ekamat.getStatus(4) != 101) && ( GXutil.strcmp(P07ZJ6_A13487BCPilaErro[0], A13487BCPilaErro) == 0 ) )
            {
               brk7ZJ10 = false ;
               A13478BCProducto = P07ZJ6_A13478BCProducto[0] ;
               A396EmprCod = P07ZJ6_A396EmprCod[0] ;
               AV42count = (long)(AV42count+1) ;
               brk7ZJ10 = true ;
               pr_ekamat.readNext(4);
            }
            if ( ! (GXutil.strcmp("", A13487BCPilaErro)==0) )
            {
               AV34Option = A13487BCPilaErro ;
               AV35Options.add(AV34Option, 0);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV35Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk7ZJ10 )
         {
            brk7ZJ10 = true ;
            pr_ekamat.readNext(4);
         }
      }
      pr_ekamat.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tbcprodwwgetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = tbcprodwwgetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = tbcprodwwgetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36OptionsJson = "" ;
      AV39OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43Session = httpContext.getWebSession();
      AV45GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV62FilterFullText = "" ;
      AV10TFBCProducto = "" ;
      AV11TFBCProducto_Sel = "" ;
      AV12TFBCDescripcion = "" ;
      AV13TFBCDescripcion_Sel = "" ;
      AV14TFBCPrecio = DecimalUtil.ZERO ;
      AV15TFBCPrecio_To = DecimalUtil.ZERO ;
      AV16TFBCUndComp_SelsJson = "" ;
      AV17TFBCUndComp_Sels = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV18TFBCProveedor = "" ;
      AV19TFBCProveedor_Sel = "" ;
      AV24TFBCDescError = "" ;
      AV25TFBCDescError_Sel = "" ;
      AV26TFBCFechError = GXutil.resetTime( GXutil.nullDate() );
      AV28TFBCPilaError = "" ;
      AV29TFBCPilaError_Sel = "" ;
      A13478BCProducto = "" ;
      AV67Tbcprodwwds_1_filterfulltext = "" ;
      AV68Tbcprodwwds_2_tfbcproducto = "" ;
      AV69Tbcprodwwds_3_tfbcproducto_sel = "" ;
      AV70Tbcprodwwds_4_tfbcdescripcion = "" ;
      AV71Tbcprodwwds_5_tfbcdescripcion_sel = "" ;
      AV72Tbcprodwwds_6_tfbcprecio = DecimalUtil.ZERO ;
      AV73Tbcprodwwds_7_tfbcprecio_to = DecimalUtil.ZERO ;
      AV74Tbcprodwwds_8_tfbcundcomp_sels = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV75Tbcprodwwds_9_tfbcproveedor = "" ;
      AV76Tbcprodwwds_10_tfbcproveedor_sel = "" ;
      AV81Tbcprodwwds_15_tfbcdescerror = "" ;
      AV82Tbcprodwwds_16_tfbcdescerror_sel = "" ;
      AV83Tbcprodwwds_17_tfbcfecherror = GXutil.resetTime( GXutil.nullDate() );
      AV84Tbcprodwwds_18_tfbcpilaerror = "" ;
      AV85Tbcprodwwds_19_tfbcpilaerror_sel = "" ;
      lV67Tbcprodwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV68Tbcprodwwds_2_tfbcproducto = "" ;
      lV70Tbcprodwwds_4_tfbcdescripcion = "" ;
      lV75Tbcprodwwds_9_tfbcproveedor = "" ;
      lV81Tbcprodwwds_15_tfbcdescerror = "" ;
      lV84Tbcprodwwds_18_tfbcpilaerror = "" ;
      A13479BCDescripc = "" ;
      A13480BCPrecio = DecimalUtil.ZERO ;
      A13482BCProveedo = "" ;
      A13485BCDescErro = "" ;
      A13486BCFechErro = GXutil.resetTime( GXutil.nullDate() );
      A13487BCPilaErro = "" ;
      P07ZJ2_A13478BCProducto = new String[] {""} ;
      P07ZJ2_A13487BCPilaErro = new String[] {""} ;
      P07ZJ2_n13487BCPilaErro = new boolean[] {false} ;
      P07ZJ2_A13486BCFechErro = new java.util.Date[] {GXutil.nullDate()} ;
      P07ZJ2_n13486BCFechErro = new boolean[] {false} ;
      P07ZJ2_A13485BCDescErro = new String[] {""} ;
      P07ZJ2_n13485BCDescErro = new boolean[] {false} ;
      P07ZJ2_A13484BCError = new short[1] ;
      P07ZJ2_n13484BCError = new boolean[] {false} ;
      P07ZJ2_A13483BCProcesad = new short[1] ;
      P07ZJ2_n13483BCProcesad = new boolean[] {false} ;
      P07ZJ2_A13482BCProveedo = new String[] {""} ;
      P07ZJ2_n13482BCProveedo = new boolean[] {false} ;
      P07ZJ2_A13480BCPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZJ2_n13480BCPrecio = new boolean[] {false} ;
      P07ZJ2_A13479BCDescripc = new String[] {""} ;
      P07ZJ2_n13479BCDescripc = new boolean[] {false} ;
      P07ZJ2_A13481BCUndComp = new short[1] ;
      P07ZJ2_n13481BCUndComp = new boolean[] {false} ;
      P07ZJ2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV34Option = "" ;
      P07ZJ3_A13479BCDescripc = new String[] {""} ;
      P07ZJ3_n13479BCDescripc = new boolean[] {false} ;
      P07ZJ3_A13487BCPilaErro = new String[] {""} ;
      P07ZJ3_n13487BCPilaErro = new boolean[] {false} ;
      P07ZJ3_A13486BCFechErro = new java.util.Date[] {GXutil.nullDate()} ;
      P07ZJ3_n13486BCFechErro = new boolean[] {false} ;
      P07ZJ3_A13485BCDescErro = new String[] {""} ;
      P07ZJ3_n13485BCDescErro = new boolean[] {false} ;
      P07ZJ3_A13484BCError = new short[1] ;
      P07ZJ3_n13484BCError = new boolean[] {false} ;
      P07ZJ3_A13483BCProcesad = new short[1] ;
      P07ZJ3_n13483BCProcesad = new boolean[] {false} ;
      P07ZJ3_A13482BCProveedo = new String[] {""} ;
      P07ZJ3_n13482BCProveedo = new boolean[] {false} ;
      P07ZJ3_A13480BCPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZJ3_n13480BCPrecio = new boolean[] {false} ;
      P07ZJ3_A13478BCProducto = new String[] {""} ;
      P07ZJ3_A13481BCUndComp = new short[1] ;
      P07ZJ3_n13481BCUndComp = new boolean[] {false} ;
      P07ZJ3_A396EmprCod = new String[] {""} ;
      P07ZJ4_A13482BCProveedo = new String[] {""} ;
      P07ZJ4_n13482BCProveedo = new boolean[] {false} ;
      P07ZJ4_A13487BCPilaErro = new String[] {""} ;
      P07ZJ4_n13487BCPilaErro = new boolean[] {false} ;
      P07ZJ4_A13486BCFechErro = new java.util.Date[] {GXutil.nullDate()} ;
      P07ZJ4_n13486BCFechErro = new boolean[] {false} ;
      P07ZJ4_A13485BCDescErro = new String[] {""} ;
      P07ZJ4_n13485BCDescErro = new boolean[] {false} ;
      P07ZJ4_A13484BCError = new short[1] ;
      P07ZJ4_n13484BCError = new boolean[] {false} ;
      P07ZJ4_A13483BCProcesad = new short[1] ;
      P07ZJ4_n13483BCProcesad = new boolean[] {false} ;
      P07ZJ4_A13480BCPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZJ4_n13480BCPrecio = new boolean[] {false} ;
      P07ZJ4_A13479BCDescripc = new String[] {""} ;
      P07ZJ4_n13479BCDescripc = new boolean[] {false} ;
      P07ZJ4_A13478BCProducto = new String[] {""} ;
      P07ZJ4_A13481BCUndComp = new short[1] ;
      P07ZJ4_n13481BCUndComp = new boolean[] {false} ;
      P07ZJ4_A396EmprCod = new String[] {""} ;
      P07ZJ5_A13485BCDescErro = new String[] {""} ;
      P07ZJ5_n13485BCDescErro = new boolean[] {false} ;
      P07ZJ5_A13487BCPilaErro = new String[] {""} ;
      P07ZJ5_n13487BCPilaErro = new boolean[] {false} ;
      P07ZJ5_A13486BCFechErro = new java.util.Date[] {GXutil.nullDate()} ;
      P07ZJ5_n13486BCFechErro = new boolean[] {false} ;
      P07ZJ5_A13484BCError = new short[1] ;
      P07ZJ5_n13484BCError = new boolean[] {false} ;
      P07ZJ5_A13483BCProcesad = new short[1] ;
      P07ZJ5_n13483BCProcesad = new boolean[] {false} ;
      P07ZJ5_A13482BCProveedo = new String[] {""} ;
      P07ZJ5_n13482BCProveedo = new boolean[] {false} ;
      P07ZJ5_A13480BCPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZJ5_n13480BCPrecio = new boolean[] {false} ;
      P07ZJ5_A13479BCDescripc = new String[] {""} ;
      P07ZJ5_n13479BCDescripc = new boolean[] {false} ;
      P07ZJ5_A13478BCProducto = new String[] {""} ;
      P07ZJ5_A13481BCUndComp = new short[1] ;
      P07ZJ5_n13481BCUndComp = new boolean[] {false} ;
      P07ZJ5_A396EmprCod = new String[] {""} ;
      P07ZJ6_A13487BCPilaErro = new String[] {""} ;
      P07ZJ6_n13487BCPilaErro = new boolean[] {false} ;
      P07ZJ6_A13486BCFechErro = new java.util.Date[] {GXutil.nullDate()} ;
      P07ZJ6_n13486BCFechErro = new boolean[] {false} ;
      P07ZJ6_A13485BCDescErro = new String[] {""} ;
      P07ZJ6_n13485BCDescErro = new boolean[] {false} ;
      P07ZJ6_A13484BCError = new short[1] ;
      P07ZJ6_n13484BCError = new boolean[] {false} ;
      P07ZJ6_A13483BCProcesad = new short[1] ;
      P07ZJ6_n13483BCProcesad = new boolean[] {false} ;
      P07ZJ6_A13482BCProveedo = new String[] {""} ;
      P07ZJ6_n13482BCProveedo = new boolean[] {false} ;
      P07ZJ6_A13480BCPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZJ6_n13480BCPrecio = new boolean[] {false} ;
      P07ZJ6_A13479BCDescripc = new String[] {""} ;
      P07ZJ6_n13479BCDescripc = new boolean[] {false} ;
      P07ZJ6_A13478BCProducto = new String[] {""} ;
      P07ZJ6_A13481BCUndComp = new short[1] ;
      P07ZJ6_n13481BCUndComp = new boolean[] {false} ;
      P07ZJ6_A396EmprCod = new String[] {""} ;
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tbcprodwwgetfilterdata__ekamat(),
         new Object[] {
             new Object[] {
            P07ZJ2_A13478BCProducto, P07ZJ2_A13487BCPilaErro, P07ZJ2_n13487BCPilaErro, P07ZJ2_A13486BCFechErro, P07ZJ2_n13486BCFechErro, P07ZJ2_A13485BCDescErro, P07ZJ2_n13485BCDescErro, P07ZJ2_A13484BCError, P07ZJ2_n13484BCError, P07ZJ2_A13483BCProcesad,
            P07ZJ2_n13483BCProcesad, P07ZJ2_A13482BCProveedo, P07ZJ2_n13482BCProveedo, P07ZJ2_A13480BCPrecio, P07ZJ2_n13480BCPrecio, P07ZJ2_A13479BCDescripc, P07ZJ2_n13479BCDescripc, P07ZJ2_A13481BCUndComp, P07ZJ2_n13481BCUndComp, P07ZJ2_A396EmprCod
            }
            , new Object[] {
            P07ZJ3_A13479BCDescripc, P07ZJ3_n13479BCDescripc, P07ZJ3_A13487BCPilaErro, P07ZJ3_n13487BCPilaErro, P07ZJ3_A13486BCFechErro, P07ZJ3_n13486BCFechErro, P07ZJ3_A13485BCDescErro, P07ZJ3_n13485BCDescErro, P07ZJ3_A13484BCError, P07ZJ3_n13484BCError,
            P07ZJ3_A13483BCProcesad, P07ZJ3_n13483BCProcesad, P07ZJ3_A13482BCProveedo, P07ZJ3_n13482BCProveedo, P07ZJ3_A13480BCPrecio, P07ZJ3_n13480BCPrecio, P07ZJ3_A13478BCProducto, P07ZJ3_A13481BCUndComp, P07ZJ3_n13481BCUndComp, P07ZJ3_A396EmprCod
            }
            , new Object[] {
            P07ZJ4_A13482BCProveedo, P07ZJ4_n13482BCProveedo, P07ZJ4_A13487BCPilaErro, P07ZJ4_n13487BCPilaErro, P07ZJ4_A13486BCFechErro, P07ZJ4_n13486BCFechErro, P07ZJ4_A13485BCDescErro, P07ZJ4_n13485BCDescErro, P07ZJ4_A13484BCError, P07ZJ4_n13484BCError,
            P07ZJ4_A13483BCProcesad, P07ZJ4_n13483BCProcesad, P07ZJ4_A13480BCPrecio, P07ZJ4_n13480BCPrecio, P07ZJ4_A13479BCDescripc, P07ZJ4_n13479BCDescripc, P07ZJ4_A13478BCProducto, P07ZJ4_A13481BCUndComp, P07ZJ4_n13481BCUndComp, P07ZJ4_A396EmprCod
            }
            , new Object[] {
            P07ZJ5_A13485BCDescErro, P07ZJ5_n13485BCDescErro, P07ZJ5_A13487BCPilaErro, P07ZJ5_n13487BCPilaErro, P07ZJ5_A13486BCFechErro, P07ZJ5_n13486BCFechErro, P07ZJ5_A13484BCError, P07ZJ5_n13484BCError, P07ZJ5_A13483BCProcesad, P07ZJ5_n13483BCProcesad,
            P07ZJ5_A13482BCProveedo, P07ZJ5_n13482BCProveedo, P07ZJ5_A13480BCPrecio, P07ZJ5_n13480BCPrecio, P07ZJ5_A13479BCDescripc, P07ZJ5_n13479BCDescripc, P07ZJ5_A13478BCProducto, P07ZJ5_A13481BCUndComp, P07ZJ5_n13481BCUndComp, P07ZJ5_A396EmprCod
            }
            , new Object[] {
            P07ZJ6_A13487BCPilaErro, P07ZJ6_n13487BCPilaErro, P07ZJ6_A13486BCFechErro, P07ZJ6_n13486BCFechErro, P07ZJ6_A13485BCDescErro, P07ZJ6_n13485BCDescErro, P07ZJ6_A13484BCError, P07ZJ6_n13484BCError, P07ZJ6_A13483BCProcesad, P07ZJ6_n13483BCProcesad,
            P07ZJ6_A13482BCProveedo, P07ZJ6_n13482BCProveedo, P07ZJ6_A13480BCPrecio, P07ZJ6_n13480BCPrecio, P07ZJ6_A13479BCDescripc, P07ZJ6_n13479BCDescripc, P07ZJ6_A13478BCProducto, P07ZJ6_A13481BCUndComp, P07ZJ6_n13481BCUndComp, P07ZJ6_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV20TFBCProcesado ;
   private short AV21TFBCProcesado_To ;
   private short AV22TFBCError ;
   private short AV23TFBCError_To ;
   private short AV77Tbcprodwwds_11_tfbcprocesado ;
   private short AV78Tbcprodwwds_12_tfbcprocesado_to ;
   private short AV79Tbcprodwwds_13_tfbcerror ;
   private short AV80Tbcprodwwds_14_tfbcerror_to ;
   private short A13481BCUndComp ;
   private short A13483BCProcesad ;
   private short A13484BCError ;
   private short Gx_err ;
   private int AV65GXV1 ;
   private int AV74Tbcprodwwds_8_tfbcundcomp_sels_size ;
   private long AV42count ;
   private java.math.BigDecimal AV14TFBCPrecio ;
   private java.math.BigDecimal AV15TFBCPrecio_To ;
   private java.math.BigDecimal AV72Tbcprodwwds_6_tfbcprecio ;
   private java.math.BigDecimal AV73Tbcprodwwds_7_tfbcprecio_to ;
   private java.math.BigDecimal A13480BCPrecio ;
   private String AV10TFBCProducto ;
   private String AV11TFBCProducto_Sel ;
   private String AV12TFBCDescripcion ;
   private String AV13TFBCDescripcion_Sel ;
   private String AV18TFBCProveedor ;
   private String AV19TFBCProveedor_Sel ;
   private String A13478BCProducto ;
   private String AV68Tbcprodwwds_2_tfbcproducto ;
   private String AV69Tbcprodwwds_3_tfbcproducto_sel ;
   private String AV70Tbcprodwwds_4_tfbcdescripcion ;
   private String AV71Tbcprodwwds_5_tfbcdescripcion_sel ;
   private String AV75Tbcprodwwds_9_tfbcproveedor ;
   private String AV76Tbcprodwwds_10_tfbcproveedor_sel ;
   private String scmdbuf ;
   private String lV68Tbcprodwwds_2_tfbcproducto ;
   private String lV70Tbcprodwwds_4_tfbcdescripcion ;
   private String lV75Tbcprodwwds_9_tfbcproveedor ;
   private String A13479BCDescripc ;
   private String A13482BCProveedo ;
   private String A396EmprCod ;
   private java.util.Date AV26TFBCFechError ;
   private java.util.Date AV83Tbcprodwwds_17_tfbcfecherror ;
   private java.util.Date A13486BCFechErro ;
   private boolean returnInSub ;
   private boolean brk7ZJ2 ;
   private boolean n13487BCPilaErro ;
   private boolean n13486BCFechErro ;
   private boolean n13485BCDescErro ;
   private boolean n13484BCError ;
   private boolean n13483BCProcesad ;
   private boolean n13482BCProveedo ;
   private boolean n13480BCPrecio ;
   private boolean n13479BCDescripc ;
   private boolean n13481BCUndComp ;
   private boolean brk7ZJ4 ;
   private boolean brk7ZJ6 ;
   private boolean brk7ZJ8 ;
   private boolean brk7ZJ10 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV16TFBCUndComp_SelsJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV62FilterFullText ;
   private String AV24TFBCDescError ;
   private String AV25TFBCDescError_Sel ;
   private String AV28TFBCPilaError ;
   private String AV29TFBCPilaError_Sel ;
   private String AV67Tbcprodwwds_1_filterfulltext ;
   private String AV81Tbcprodwwds_15_tfbcdescerror ;
   private String AV82Tbcprodwwds_16_tfbcdescerror_sel ;
   private String AV84Tbcprodwwds_18_tfbcpilaerror ;
   private String AV85Tbcprodwwds_19_tfbcpilaerror_sel ;
   private String lV67Tbcprodwwds_1_filterfulltext ;
   private String lV81Tbcprodwwds_15_tfbcdescerror ;
   private String lV84Tbcprodwwds_18_tfbcpilaerror ;
   private String A13485BCDescErro ;
   private String A13487BCPilaErro ;
   private String AV34Option ;
   private GXSimpleCollection<Short> AV17TFBCUndComp_Sels ;
   private GXSimpleCollection<Short> AV74Tbcprodwwds_8_tfbcundcomp_sels ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_ekamat ;
   private String[] P07ZJ2_A13478BCProducto ;
   private String[] P07ZJ2_A13487BCPilaErro ;
   private boolean[] P07ZJ2_n13487BCPilaErro ;
   private java.util.Date[] P07ZJ2_A13486BCFechErro ;
   private boolean[] P07ZJ2_n13486BCFechErro ;
   private String[] P07ZJ2_A13485BCDescErro ;
   private boolean[] P07ZJ2_n13485BCDescErro ;
   private short[] P07ZJ2_A13484BCError ;
   private boolean[] P07ZJ2_n13484BCError ;
   private short[] P07ZJ2_A13483BCProcesad ;
   private boolean[] P07ZJ2_n13483BCProcesad ;
   private String[] P07ZJ2_A13482BCProveedo ;
   private boolean[] P07ZJ2_n13482BCProveedo ;
   private java.math.BigDecimal[] P07ZJ2_A13480BCPrecio ;
   private boolean[] P07ZJ2_n13480BCPrecio ;
   private String[] P07ZJ2_A13479BCDescripc ;
   private boolean[] P07ZJ2_n13479BCDescripc ;
   private short[] P07ZJ2_A13481BCUndComp ;
   private boolean[] P07ZJ2_n13481BCUndComp ;
   private String[] P07ZJ2_A396EmprCod ;
   private String[] P07ZJ3_A13479BCDescripc ;
   private boolean[] P07ZJ3_n13479BCDescripc ;
   private String[] P07ZJ3_A13487BCPilaErro ;
   private boolean[] P07ZJ3_n13487BCPilaErro ;
   private java.util.Date[] P07ZJ3_A13486BCFechErro ;
   private boolean[] P07ZJ3_n13486BCFechErro ;
   private String[] P07ZJ3_A13485BCDescErro ;
   private boolean[] P07ZJ3_n13485BCDescErro ;
   private short[] P07ZJ3_A13484BCError ;
   private boolean[] P07ZJ3_n13484BCError ;
   private short[] P07ZJ3_A13483BCProcesad ;
   private boolean[] P07ZJ3_n13483BCProcesad ;
   private String[] P07ZJ3_A13482BCProveedo ;
   private boolean[] P07ZJ3_n13482BCProveedo ;
   private java.math.BigDecimal[] P07ZJ3_A13480BCPrecio ;
   private boolean[] P07ZJ3_n13480BCPrecio ;
   private String[] P07ZJ3_A13478BCProducto ;
   private short[] P07ZJ3_A13481BCUndComp ;
   private boolean[] P07ZJ3_n13481BCUndComp ;
   private String[] P07ZJ3_A396EmprCod ;
   private String[] P07ZJ4_A13482BCProveedo ;
   private boolean[] P07ZJ4_n13482BCProveedo ;
   private String[] P07ZJ4_A13487BCPilaErro ;
   private boolean[] P07ZJ4_n13487BCPilaErro ;
   private java.util.Date[] P07ZJ4_A13486BCFechErro ;
   private boolean[] P07ZJ4_n13486BCFechErro ;
   private String[] P07ZJ4_A13485BCDescErro ;
   private boolean[] P07ZJ4_n13485BCDescErro ;
   private short[] P07ZJ4_A13484BCError ;
   private boolean[] P07ZJ4_n13484BCError ;
   private short[] P07ZJ4_A13483BCProcesad ;
   private boolean[] P07ZJ4_n13483BCProcesad ;
   private java.math.BigDecimal[] P07ZJ4_A13480BCPrecio ;
   private boolean[] P07ZJ4_n13480BCPrecio ;
   private String[] P07ZJ4_A13479BCDescripc ;
   private boolean[] P07ZJ4_n13479BCDescripc ;
   private String[] P07ZJ4_A13478BCProducto ;
   private short[] P07ZJ4_A13481BCUndComp ;
   private boolean[] P07ZJ4_n13481BCUndComp ;
   private String[] P07ZJ4_A396EmprCod ;
   private String[] P07ZJ5_A13485BCDescErro ;
   private boolean[] P07ZJ5_n13485BCDescErro ;
   private String[] P07ZJ5_A13487BCPilaErro ;
   private boolean[] P07ZJ5_n13487BCPilaErro ;
   private java.util.Date[] P07ZJ5_A13486BCFechErro ;
   private boolean[] P07ZJ5_n13486BCFechErro ;
   private short[] P07ZJ5_A13484BCError ;
   private boolean[] P07ZJ5_n13484BCError ;
   private short[] P07ZJ5_A13483BCProcesad ;
   private boolean[] P07ZJ5_n13483BCProcesad ;
   private String[] P07ZJ5_A13482BCProveedo ;
   private boolean[] P07ZJ5_n13482BCProveedo ;
   private java.math.BigDecimal[] P07ZJ5_A13480BCPrecio ;
   private boolean[] P07ZJ5_n13480BCPrecio ;
   private String[] P07ZJ5_A13479BCDescripc ;
   private boolean[] P07ZJ5_n13479BCDescripc ;
   private String[] P07ZJ5_A13478BCProducto ;
   private short[] P07ZJ5_A13481BCUndComp ;
   private boolean[] P07ZJ5_n13481BCUndComp ;
   private String[] P07ZJ5_A396EmprCod ;
   private String[] P07ZJ6_A13487BCPilaErro ;
   private boolean[] P07ZJ6_n13487BCPilaErro ;
   private java.util.Date[] P07ZJ6_A13486BCFechErro ;
   private boolean[] P07ZJ6_n13486BCFechErro ;
   private String[] P07ZJ6_A13485BCDescErro ;
   private boolean[] P07ZJ6_n13485BCDescErro ;
   private short[] P07ZJ6_A13484BCError ;
   private boolean[] P07ZJ6_n13484BCError ;
   private short[] P07ZJ6_A13483BCProcesad ;
   private boolean[] P07ZJ6_n13483BCProcesad ;
   private String[] P07ZJ6_A13482BCProveedo ;
   private boolean[] P07ZJ6_n13482BCProveedo ;
   private java.math.BigDecimal[] P07ZJ6_A13480BCPrecio ;
   private boolean[] P07ZJ6_n13480BCPrecio ;
   private String[] P07ZJ6_A13479BCDescripc ;
   private boolean[] P07ZJ6_n13479BCDescripc ;
   private String[] P07ZJ6_A13478BCProducto ;
   private short[] P07ZJ6_A13481BCUndComp ;
   private boolean[] P07ZJ6_n13481BCUndComp ;
   private String[] P07ZJ6_A396EmprCod ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class tbcprodwwgetfilterdata__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07ZJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short A13481BCUndComp ,
                                          GXSimpleCollection<Short> AV74Tbcprodwwds_8_tfbcundcomp_sels ,
                                          String AV69Tbcprodwwds_3_tfbcproducto_sel ,
                                          String AV68Tbcprodwwds_2_tfbcproducto ,
                                          String AV71Tbcprodwwds_5_tfbcdescripcion_sel ,
                                          String AV70Tbcprodwwds_4_tfbcdescripcion ,
                                          java.math.BigDecimal AV72Tbcprodwwds_6_tfbcprecio ,
                                          java.math.BigDecimal AV73Tbcprodwwds_7_tfbcprecio_to ,
                                          int AV74Tbcprodwwds_8_tfbcundcomp_sels_size ,
                                          String AV76Tbcprodwwds_10_tfbcproveedor_sel ,
                                          String AV75Tbcprodwwds_9_tfbcproveedor ,
                                          short AV77Tbcprodwwds_11_tfbcprocesado ,
                                          short AV78Tbcprodwwds_12_tfbcprocesado_to ,
                                          short AV79Tbcprodwwds_13_tfbcerror ,
                                          short AV80Tbcprodwwds_14_tfbcerror_to ,
                                          String AV82Tbcprodwwds_16_tfbcdescerror_sel ,
                                          String AV81Tbcprodwwds_15_tfbcdescerror ,
                                          java.util.Date AV83Tbcprodwwds_17_tfbcfecherror ,
                                          String AV85Tbcprodwwds_19_tfbcpilaerror_sel ,
                                          String AV84Tbcprodwwds_18_tfbcpilaerror ,
                                          String A13478BCProducto ,
                                          String A13479BCDescripc ,
                                          java.math.BigDecimal A13480BCPrecio ,
                                          String A13482BCProveedo ,
                                          short A13483BCProcesad ,
                                          short A13484BCError ,
                                          String A13485BCDescErro ,
                                          java.util.Date A13486BCFechErro ,
                                          String A13487BCPilaErro ,
                                          String AV67Tbcprodwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT [Producto], [Pila error], [Fecha y hora error], [Descripción error], [Error], [Procesado], [Proveedor], [Precio], [Descripción], [Unidad Compra], [Emprcod]" ;
      scmdbuf += " FROM [Producto] WITH (NOLOCK)" ;
      if ( (GXutil.strcmp("", AV69Tbcprodwwds_3_tfbcproducto_sel)==0) && ( ! (GXutil.strcmp("", AV68Tbcprodwwds_2_tfbcproducto)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Producto]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Tbcprodwwds_3_tfbcproducto_sel)==0) )
      {
         addWhere(sWhereString, "([Producto] = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Tbcprodwwds_5_tfbcdescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV70Tbcprodwwds_4_tfbcdescripcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tbcprodwwds_5_tfbcdescripcion_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción] = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Tbcprodwwds_6_tfbcprecio)==0) )
      {
         addWhere(sWhereString, "([Precio] >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Tbcprodwwds_7_tfbcprecio_to)==0) )
      {
         addWhere(sWhereString, "([Precio] <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( AV74Tbcprodwwds_8_tfbcundcomp_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("sqlserver", AV74Tbcprodwwds_8_tfbcundcomp_sels, "[Unidad Compra] IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV76Tbcprodwwds_10_tfbcproveedor_sel)==0) && ( ! (GXutil.strcmp("", AV75Tbcprodwwds_9_tfbcproveedor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Proveedor]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tbcprodwwds_10_tfbcproveedor_sel)==0) )
      {
         addWhere(sWhereString, "([Proveedor] = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV77Tbcprodwwds_11_tfbcprocesado) )
      {
         addWhere(sWhereString, "([Procesado] >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV78Tbcprodwwds_12_tfbcprocesado_to) )
      {
         addWhere(sWhereString, "([Procesado] <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV79Tbcprodwwds_13_tfbcerror) )
      {
         addWhere(sWhereString, "([Error] >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV80Tbcprodwwds_14_tfbcerror_to) )
      {
         addWhere(sWhereString, "([Error] <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tbcprodwwds_16_tfbcdescerror_sel)==0) && ( ! (GXutil.strcmp("", AV81Tbcprodwwds_15_tfbcdescerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tbcprodwwds_16_tfbcdescerror_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción error] = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV83Tbcprodwwds_17_tfbcfecherror) )
      {
         addWhere(sWhereString, "([Fecha y hora error] >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tbcprodwwds_19_tfbcpilaerror_sel)==0) && ( ! (GXutil.strcmp("", AV84Tbcprodwwds_18_tfbcpilaerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Pila error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tbcprodwwds_19_tfbcpilaerror_sel)==0) )
      {
         addWhere(sWhereString, "([Pila error] = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY [Producto]" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P07ZJ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short A13481BCUndComp ,
                                          GXSimpleCollection<Short> AV74Tbcprodwwds_8_tfbcundcomp_sels ,
                                          String AV69Tbcprodwwds_3_tfbcproducto_sel ,
                                          String AV68Tbcprodwwds_2_tfbcproducto ,
                                          String AV71Tbcprodwwds_5_tfbcdescripcion_sel ,
                                          String AV70Tbcprodwwds_4_tfbcdescripcion ,
                                          java.math.BigDecimal AV72Tbcprodwwds_6_tfbcprecio ,
                                          java.math.BigDecimal AV73Tbcprodwwds_7_tfbcprecio_to ,
                                          int AV74Tbcprodwwds_8_tfbcundcomp_sels_size ,
                                          String AV76Tbcprodwwds_10_tfbcproveedor_sel ,
                                          String AV75Tbcprodwwds_9_tfbcproveedor ,
                                          short AV77Tbcprodwwds_11_tfbcprocesado ,
                                          short AV78Tbcprodwwds_12_tfbcprocesado_to ,
                                          short AV79Tbcprodwwds_13_tfbcerror ,
                                          short AV80Tbcprodwwds_14_tfbcerror_to ,
                                          String AV82Tbcprodwwds_16_tfbcdescerror_sel ,
                                          String AV81Tbcprodwwds_15_tfbcdescerror ,
                                          java.util.Date AV83Tbcprodwwds_17_tfbcfecherror ,
                                          String AV85Tbcprodwwds_19_tfbcpilaerror_sel ,
                                          String AV84Tbcprodwwds_18_tfbcpilaerror ,
                                          String A13478BCProducto ,
                                          String A13479BCDescripc ,
                                          java.math.BigDecimal A13480BCPrecio ,
                                          String A13482BCProveedo ,
                                          short A13483BCProcesad ,
                                          short A13484BCError ,
                                          String A13485BCDescErro ,
                                          java.util.Date A13486BCFechErro ,
                                          String A13487BCPilaErro ,
                                          String AV67Tbcprodwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[17];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT [Descripción], [Pila error], [Fecha y hora error], [Descripción error], [Error], [Procesado], [Proveedor], [Precio], [Producto], [Unidad Compra], [Emprcod]" ;
      scmdbuf += " FROM [Producto] WITH (NOLOCK)" ;
      if ( (GXutil.strcmp("", AV69Tbcprodwwds_3_tfbcproducto_sel)==0) && ( ! (GXutil.strcmp("", AV68Tbcprodwwds_2_tfbcproducto)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Producto]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Tbcprodwwds_3_tfbcproducto_sel)==0) )
      {
         addWhere(sWhereString, "([Producto] = ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Tbcprodwwds_5_tfbcdescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV70Tbcprodwwds_4_tfbcdescripcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tbcprodwwds_5_tfbcdescripcion_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción] = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Tbcprodwwds_6_tfbcprecio)==0) )
      {
         addWhere(sWhereString, "([Precio] >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Tbcprodwwds_7_tfbcprecio_to)==0) )
      {
         addWhere(sWhereString, "([Precio] <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( AV74Tbcprodwwds_8_tfbcundcomp_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("sqlserver", AV74Tbcprodwwds_8_tfbcundcomp_sels, "[Unidad Compra] IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV76Tbcprodwwds_10_tfbcproveedor_sel)==0) && ( ! (GXutil.strcmp("", AV75Tbcprodwwds_9_tfbcproveedor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Proveedor]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tbcprodwwds_10_tfbcproveedor_sel)==0) )
      {
         addWhere(sWhereString, "([Proveedor] = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (0==AV77Tbcprodwwds_11_tfbcprocesado) )
      {
         addWhere(sWhereString, "([Procesado] >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (0==AV78Tbcprodwwds_12_tfbcprocesado_to) )
      {
         addWhere(sWhereString, "([Procesado] <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (0==AV79Tbcprodwwds_13_tfbcerror) )
      {
         addWhere(sWhereString, "([Error] >= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (0==AV80Tbcprodwwds_14_tfbcerror_to) )
      {
         addWhere(sWhereString, "([Error] <= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tbcprodwwds_16_tfbcdescerror_sel)==0) && ( ! (GXutil.strcmp("", AV81Tbcprodwwds_15_tfbcdescerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tbcprodwwds_16_tfbcdescerror_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción error] = ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV83Tbcprodwwds_17_tfbcfecherror) )
      {
         addWhere(sWhereString, "([Fecha y hora error] >= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tbcprodwwds_19_tfbcpilaerror_sel)==0) && ( ! (GXutil.strcmp("", AV84Tbcprodwwds_18_tfbcpilaerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Pila error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tbcprodwwds_19_tfbcpilaerror_sel)==0) )
      {
         addWhere(sWhereString, "([Pila error] = ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY [Descripción]" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P07ZJ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short A13481BCUndComp ,
                                          GXSimpleCollection<Short> AV74Tbcprodwwds_8_tfbcundcomp_sels ,
                                          String AV69Tbcprodwwds_3_tfbcproducto_sel ,
                                          String AV68Tbcprodwwds_2_tfbcproducto ,
                                          String AV71Tbcprodwwds_5_tfbcdescripcion_sel ,
                                          String AV70Tbcprodwwds_4_tfbcdescripcion ,
                                          java.math.BigDecimal AV72Tbcprodwwds_6_tfbcprecio ,
                                          java.math.BigDecimal AV73Tbcprodwwds_7_tfbcprecio_to ,
                                          int AV74Tbcprodwwds_8_tfbcundcomp_sels_size ,
                                          String AV76Tbcprodwwds_10_tfbcproveedor_sel ,
                                          String AV75Tbcprodwwds_9_tfbcproveedor ,
                                          short AV77Tbcprodwwds_11_tfbcprocesado ,
                                          short AV78Tbcprodwwds_12_tfbcprocesado_to ,
                                          short AV79Tbcprodwwds_13_tfbcerror ,
                                          short AV80Tbcprodwwds_14_tfbcerror_to ,
                                          String AV82Tbcprodwwds_16_tfbcdescerror_sel ,
                                          String AV81Tbcprodwwds_15_tfbcdescerror ,
                                          java.util.Date AV83Tbcprodwwds_17_tfbcfecherror ,
                                          String AV85Tbcprodwwds_19_tfbcpilaerror_sel ,
                                          String AV84Tbcprodwwds_18_tfbcpilaerror ,
                                          String A13478BCProducto ,
                                          String A13479BCDescripc ,
                                          java.math.BigDecimal A13480BCPrecio ,
                                          String A13482BCProveedo ,
                                          short A13483BCProcesad ,
                                          short A13484BCError ,
                                          String A13485BCDescErro ,
                                          java.util.Date A13486BCFechErro ,
                                          String A13487BCPilaErro ,
                                          String AV67Tbcprodwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[17];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT [Proveedor], [Pila error], [Fecha y hora error], [Descripción error], [Error], [Procesado], [Precio], [Descripción], [Producto], [Unidad Compra], [Emprcod]" ;
      scmdbuf += " FROM [Producto] WITH (NOLOCK)" ;
      if ( (GXutil.strcmp("", AV69Tbcprodwwds_3_tfbcproducto_sel)==0) && ( ! (GXutil.strcmp("", AV68Tbcprodwwds_2_tfbcproducto)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Producto]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Tbcprodwwds_3_tfbcproducto_sel)==0) )
      {
         addWhere(sWhereString, "([Producto] = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Tbcprodwwds_5_tfbcdescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV70Tbcprodwwds_4_tfbcdescripcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tbcprodwwds_5_tfbcdescripcion_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción] = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Tbcprodwwds_6_tfbcprecio)==0) )
      {
         addWhere(sWhereString, "([Precio] >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Tbcprodwwds_7_tfbcprecio_to)==0) )
      {
         addWhere(sWhereString, "([Precio] <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( AV74Tbcprodwwds_8_tfbcundcomp_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("sqlserver", AV74Tbcprodwwds_8_tfbcundcomp_sels, "[Unidad Compra] IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV76Tbcprodwwds_10_tfbcproveedor_sel)==0) && ( ! (GXutil.strcmp("", AV75Tbcprodwwds_9_tfbcproveedor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Proveedor]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tbcprodwwds_10_tfbcproveedor_sel)==0) )
      {
         addWhere(sWhereString, "([Proveedor] = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV77Tbcprodwwds_11_tfbcprocesado) )
      {
         addWhere(sWhereString, "([Procesado] >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV78Tbcprodwwds_12_tfbcprocesado_to) )
      {
         addWhere(sWhereString, "([Procesado] <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV79Tbcprodwwds_13_tfbcerror) )
      {
         addWhere(sWhereString, "([Error] >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV80Tbcprodwwds_14_tfbcerror_to) )
      {
         addWhere(sWhereString, "([Error] <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tbcprodwwds_16_tfbcdescerror_sel)==0) && ( ! (GXutil.strcmp("", AV81Tbcprodwwds_15_tfbcdescerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tbcprodwwds_16_tfbcdescerror_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción error] = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV83Tbcprodwwds_17_tfbcfecherror) )
      {
         addWhere(sWhereString, "([Fecha y hora error] >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tbcprodwwds_19_tfbcpilaerror_sel)==0) && ( ! (GXutil.strcmp("", AV84Tbcprodwwds_18_tfbcpilaerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Pila error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tbcprodwwds_19_tfbcpilaerror_sel)==0) )
      {
         addWhere(sWhereString, "([Pila error] = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY [Proveedor]" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P07ZJ5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short A13481BCUndComp ,
                                          GXSimpleCollection<Short> AV74Tbcprodwwds_8_tfbcundcomp_sels ,
                                          String AV69Tbcprodwwds_3_tfbcproducto_sel ,
                                          String AV68Tbcprodwwds_2_tfbcproducto ,
                                          String AV71Tbcprodwwds_5_tfbcdescripcion_sel ,
                                          String AV70Tbcprodwwds_4_tfbcdescripcion ,
                                          java.math.BigDecimal AV72Tbcprodwwds_6_tfbcprecio ,
                                          java.math.BigDecimal AV73Tbcprodwwds_7_tfbcprecio_to ,
                                          int AV74Tbcprodwwds_8_tfbcundcomp_sels_size ,
                                          String AV76Tbcprodwwds_10_tfbcproveedor_sel ,
                                          String AV75Tbcprodwwds_9_tfbcproveedor ,
                                          short AV77Tbcprodwwds_11_tfbcprocesado ,
                                          short AV78Tbcprodwwds_12_tfbcprocesado_to ,
                                          short AV79Tbcprodwwds_13_tfbcerror ,
                                          short AV80Tbcprodwwds_14_tfbcerror_to ,
                                          String AV82Tbcprodwwds_16_tfbcdescerror_sel ,
                                          String AV81Tbcprodwwds_15_tfbcdescerror ,
                                          java.util.Date AV83Tbcprodwwds_17_tfbcfecherror ,
                                          String AV85Tbcprodwwds_19_tfbcpilaerror_sel ,
                                          String AV84Tbcprodwwds_18_tfbcpilaerror ,
                                          String A13478BCProducto ,
                                          String A13479BCDescripc ,
                                          java.math.BigDecimal A13480BCPrecio ,
                                          String A13482BCProveedo ,
                                          short A13483BCProcesad ,
                                          short A13484BCError ,
                                          String A13485BCDescErro ,
                                          java.util.Date A13486BCFechErro ,
                                          String A13487BCPilaErro ,
                                          String AV67Tbcprodwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[17];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT [Descripción error], [Pila error], [Fecha y hora error], [Error], [Procesado], [Proveedor], [Precio], [Descripción], [Producto], [Unidad Compra], [Emprcod]" ;
      scmdbuf += " FROM [Producto] WITH (NOLOCK)" ;
      if ( (GXutil.strcmp("", AV69Tbcprodwwds_3_tfbcproducto_sel)==0) && ( ! (GXutil.strcmp("", AV68Tbcprodwwds_2_tfbcproducto)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Producto]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Tbcprodwwds_3_tfbcproducto_sel)==0) )
      {
         addWhere(sWhereString, "([Producto] = ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Tbcprodwwds_5_tfbcdescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV70Tbcprodwwds_4_tfbcdescripcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tbcprodwwds_5_tfbcdescripcion_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción] = ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Tbcprodwwds_6_tfbcprecio)==0) )
      {
         addWhere(sWhereString, "([Precio] >= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Tbcprodwwds_7_tfbcprecio_to)==0) )
      {
         addWhere(sWhereString, "([Precio] <= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( AV74Tbcprodwwds_8_tfbcundcomp_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("sqlserver", AV74Tbcprodwwds_8_tfbcundcomp_sels, "[Unidad Compra] IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV76Tbcprodwwds_10_tfbcproveedor_sel)==0) && ( ! (GXutil.strcmp("", AV75Tbcprodwwds_9_tfbcproveedor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Proveedor]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tbcprodwwds_10_tfbcproveedor_sel)==0) )
      {
         addWhere(sWhereString, "([Proveedor] = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (0==AV77Tbcprodwwds_11_tfbcprocesado) )
      {
         addWhere(sWhereString, "([Procesado] >= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (0==AV78Tbcprodwwds_12_tfbcprocesado_to) )
      {
         addWhere(sWhereString, "([Procesado] <= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (0==AV79Tbcprodwwds_13_tfbcerror) )
      {
         addWhere(sWhereString, "([Error] >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (0==AV80Tbcprodwwds_14_tfbcerror_to) )
      {
         addWhere(sWhereString, "([Error] <= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tbcprodwwds_16_tfbcdescerror_sel)==0) && ( ! (GXutil.strcmp("", AV81Tbcprodwwds_15_tfbcdescerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tbcprodwwds_16_tfbcdescerror_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción error] = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV83Tbcprodwwds_17_tfbcfecherror) )
      {
         addWhere(sWhereString, "([Fecha y hora error] >= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tbcprodwwds_19_tfbcpilaerror_sel)==0) && ( ! (GXutil.strcmp("", AV84Tbcprodwwds_18_tfbcpilaerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Pila error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tbcprodwwds_19_tfbcpilaerror_sel)==0) )
      {
         addWhere(sWhereString, "([Pila error] = ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY [Descripción error]" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P07ZJ6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short A13481BCUndComp ,
                                          GXSimpleCollection<Short> AV74Tbcprodwwds_8_tfbcundcomp_sels ,
                                          String AV69Tbcprodwwds_3_tfbcproducto_sel ,
                                          String AV68Tbcprodwwds_2_tfbcproducto ,
                                          String AV71Tbcprodwwds_5_tfbcdescripcion_sel ,
                                          String AV70Tbcprodwwds_4_tfbcdescripcion ,
                                          java.math.BigDecimal AV72Tbcprodwwds_6_tfbcprecio ,
                                          java.math.BigDecimal AV73Tbcprodwwds_7_tfbcprecio_to ,
                                          int AV74Tbcprodwwds_8_tfbcundcomp_sels_size ,
                                          String AV76Tbcprodwwds_10_tfbcproveedor_sel ,
                                          String AV75Tbcprodwwds_9_tfbcproveedor ,
                                          short AV77Tbcprodwwds_11_tfbcprocesado ,
                                          short AV78Tbcprodwwds_12_tfbcprocesado_to ,
                                          short AV79Tbcprodwwds_13_tfbcerror ,
                                          short AV80Tbcprodwwds_14_tfbcerror_to ,
                                          String AV82Tbcprodwwds_16_tfbcdescerror_sel ,
                                          String AV81Tbcprodwwds_15_tfbcdescerror ,
                                          java.util.Date AV83Tbcprodwwds_17_tfbcfecherror ,
                                          String AV85Tbcprodwwds_19_tfbcpilaerror_sel ,
                                          String AV84Tbcprodwwds_18_tfbcpilaerror ,
                                          String A13478BCProducto ,
                                          String A13479BCDescripc ,
                                          java.math.BigDecimal A13480BCPrecio ,
                                          String A13482BCProveedo ,
                                          short A13483BCProcesad ,
                                          short A13484BCError ,
                                          String A13485BCDescErro ,
                                          java.util.Date A13486BCFechErro ,
                                          String A13487BCPilaErro ,
                                          String AV67Tbcprodwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[17];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT [Pila error], [Fecha y hora error], [Descripción error], [Error], [Procesado], [Proveedor], [Precio], [Descripción], [Producto], [Unidad Compra], [Emprcod]" ;
      scmdbuf += " FROM [Producto] WITH (NOLOCK)" ;
      if ( (GXutil.strcmp("", AV69Tbcprodwwds_3_tfbcproducto_sel)==0) && ( ! (GXutil.strcmp("", AV68Tbcprodwwds_2_tfbcproducto)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Producto]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Tbcprodwwds_3_tfbcproducto_sel)==0) )
      {
         addWhere(sWhereString, "([Producto] = ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Tbcprodwwds_5_tfbcdescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV70Tbcprodwwds_4_tfbcdescripcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tbcprodwwds_5_tfbcdescripcion_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción] = ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Tbcprodwwds_6_tfbcprecio)==0) )
      {
         addWhere(sWhereString, "([Precio] >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Tbcprodwwds_7_tfbcprecio_to)==0) )
      {
         addWhere(sWhereString, "([Precio] <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( AV74Tbcprodwwds_8_tfbcundcomp_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("sqlserver", AV74Tbcprodwwds_8_tfbcundcomp_sels, "[Unidad Compra] IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV76Tbcprodwwds_10_tfbcproveedor_sel)==0) && ( ! (GXutil.strcmp("", AV75Tbcprodwwds_9_tfbcproveedor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Proveedor]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tbcprodwwds_10_tfbcproveedor_sel)==0) )
      {
         addWhere(sWhereString, "([Proveedor] = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (0==AV77Tbcprodwwds_11_tfbcprocesado) )
      {
         addWhere(sWhereString, "([Procesado] >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV78Tbcprodwwds_12_tfbcprocesado_to) )
      {
         addWhere(sWhereString, "([Procesado] <= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (0==AV79Tbcprodwwds_13_tfbcerror) )
      {
         addWhere(sWhereString, "([Error] >= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (0==AV80Tbcprodwwds_14_tfbcerror_to) )
      {
         addWhere(sWhereString, "([Error] <= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tbcprodwwds_16_tfbcdescerror_sel)==0) && ( ! (GXutil.strcmp("", AV81Tbcprodwwds_15_tfbcdescerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Descripción error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tbcprodwwds_16_tfbcdescerror_sel)==0) )
      {
         addWhere(sWhereString, "([Descripción error] = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV83Tbcprodwwds_17_tfbcfecherror) )
      {
         addWhere(sWhereString, "([Fecha y hora error] >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Tbcprodwwds_19_tfbcpilaerror_sel)==0) && ( ! (GXutil.strcmp("", AV84Tbcprodwwds_18_tfbcpilaerror)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([Pila error]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Tbcprodwwds_19_tfbcpilaerror_sel)==0) )
      {
         addWhere(sWhereString, "([Pila error] = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY [Pila error]" ;
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
                  return conditional_P07ZJ2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GXSimpleCollection<Short>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 1 :
                  return conditional_P07ZJ3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GXSimpleCollection<Short>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 2 :
                  return conditional_P07ZJ4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GXSimpleCollection<Short>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 3 :
                  return conditional_P07ZJ5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GXSimpleCollection<Short>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 4 :
                  return conditional_P07ZJ6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GXSimpleCollection<Short>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07ZJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07ZJ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07ZJ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07ZJ5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07ZJ6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 6);
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 6);
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 6);
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 6);
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
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
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 200);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 200);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 200);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 200);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 200);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 200);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 200);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 200);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 200);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 200);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 200);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 200);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 200);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 200);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 200);
               }
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

