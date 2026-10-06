package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcconsultadevolucionesalmacentejidoencrudosindetallelineasgetfilterdata extends GXProcedure
{
   public wcconsultadevolucionesalmacentejidoencrudosindetallelineasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcconsultadevolucionesalmacentejidoencrudosindetallelineasgetfilterdata.class ), "" );
   }

   public wcconsultadevolucionesalmacentejidoencrudosindetallelineasgetfilterdata( int remoteHandle ,
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
      wcconsultadevolucionesalmacentejidoencrudosindetallelineasgetfilterdata.this.aP5 = new String[] {""};
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
      wcconsultadevolucionesalmacentejidoencrudosindetallelineasgetfilterdata.this.AV28DDOName = aP0;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineasgetfilterdata.this.AV26SearchTxt = aP1;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineasgetfilterdata.this.AV27SearchTxtTo = aP2;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineasgetfilterdata.this.aP3 = aP3;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineasgetfilterdata.this.aP4 = aP4;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineasgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_ALBRENT") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRENTOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_ALBREF") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_ALBREFDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV32OptionsJson = AV31Options.toJSonString(false) ;
      AV35OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV36OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV39Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasGridState"), null, null);
      }
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV45TFAlbRecCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFAlbRecCod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT") == 0 )
         {
            AV57TFAlbREnt = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT_SEL") == 0 )
         {
            AV58TFAlbREnt_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV47TFAlbRef = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV48TFAlbRef_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV49TFAlbRefDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV50TFAlbRefDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUPZS") == 0 )
         {
            AV51TFDevCruPzs = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFDevCruPzs_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUUND") == 0 )
         {
            AV53TFDevCruUnd = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFDevCruUnd_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV55Emprcod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DEVCRUID") == 0 )
         {
            AV56DevCruId = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBRENTOPTIONS' Routine */
      returnInSub = false ;
      AV57TFAlbREnt = AV26SearchTxt ;
      AV58TFAlbREnt_Sel = "" ;
      AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = AV44FilterFullText ;
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod = AV45TFAlbRecCod ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to = AV46TFAlbRecCod_To ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = AV57TFAlbREnt ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel = AV58TFAlbREnt_Sel ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = AV47TFAlbRef ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel = AV48TFAlbRef_Sel ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = AV49TFAlbRefDsc ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel = AV50TFAlbRefDsc_Sel ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs = AV51TFDevCruPzs ;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to = AV52TFDevCruPzs_To ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund = AV53TFDevCruUnd ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to = AV54TFDevCruUnd_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ,
                                           Integer.valueOf(AV64Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod) ,
                                           Integer.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to) ,
                                           AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel ,
                                           AV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ,
                                           AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel ,
                                           AV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ,
                                           AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel ,
                                           AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ,
                                           Integer.valueOf(AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs) ,
                                           Integer.valueOf(AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to) ,
                                           AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund ,
                                           AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A11684DevCruPzs) ,
                                           A11683DevCruUnd ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(AV56DevCruId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent), 8, "%") ;
      lV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = GXutil.padr( GXutil.rtrim( AV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref), 16, "%") ;
      lV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc), 26, "%") ;
      /* Using cursor P090F2 */
      pr_default.execute(0, new Object[] {AV55Emprcod, Integer.valueOf(AV56DevCruId), lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, Integer.valueOf(AV64Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod), Integer.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to), lV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent, AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel, lV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref, AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel, lV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc, AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel, Integer.valueOf(AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs), Integer.valueOf(AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to), AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund, AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk90F2 = false ;
         A396EmprCod = P090F2_A396EmprCod[0] ;
         A11669DevCruId = P090F2_A11669DevCruId[0] ;
         A46AlbREnt = P090F2_A46AlbREnt[0] ;
         A11683DevCruUnd = P090F2_A11683DevCruUnd[0] ;
         A11684DevCruPzs = P090F2_A11684DevCruPzs[0] ;
         A3613AlbRefDsc = P090F2_A3613AlbRefDsc[0] ;
         A45AlbRef = P090F2_A45AlbRef[0] ;
         A44AlbRecCod = P090F2_A44AlbRecCod[0] ;
         A46AlbREnt = P090F2_A46AlbREnt[0] ;
         A3613AlbRefDsc = P090F2_A3613AlbRefDsc[0] ;
         A45AlbRef = P090F2_A45AlbRef[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P090F2_A46AlbREnt[0], A46AlbREnt) == 0 ) )
         {
            brk90F2 = false ;
            A396EmprCod = P090F2_A396EmprCod[0] ;
            A11669DevCruId = P090F2_A11669DevCruId[0] ;
            A44AlbRecCod = P090F2_A44AlbRecCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk90F2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A46AlbREnt)==0) )
         {
            AV30Option = A46AlbREnt ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90F2 )
         {
            brk90F2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBREFOPTIONS' Routine */
      returnInSub = false ;
      AV47TFAlbRef = AV26SearchTxt ;
      AV48TFAlbRef_Sel = "" ;
      AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = AV44FilterFullText ;
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod = AV45TFAlbRecCod ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to = AV46TFAlbRecCod_To ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = AV57TFAlbREnt ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel = AV58TFAlbREnt_Sel ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = AV47TFAlbRef ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel = AV48TFAlbRef_Sel ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = AV49TFAlbRefDsc ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel = AV50TFAlbRefDsc_Sel ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs = AV51TFDevCruPzs ;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to = AV52TFDevCruPzs_To ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund = AV53TFDevCruUnd ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to = AV54TFDevCruUnd_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ,
                                           Integer.valueOf(AV64Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod) ,
                                           Integer.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to) ,
                                           AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel ,
                                           AV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ,
                                           AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel ,
                                           AV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ,
                                           AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel ,
                                           AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ,
                                           Integer.valueOf(AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs) ,
                                           Integer.valueOf(AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to) ,
                                           AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund ,
                                           AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A11684DevCruPzs) ,
                                           A11683DevCruUnd ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(AV56DevCruId) ,
                                           AV55Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent), 8, "%") ;
      lV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = GXutil.padr( GXutil.rtrim( AV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref), 16, "%") ;
      lV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc), 26, "%") ;
      /* Using cursor P090F3 */
      pr_default.execute(1, new Object[] {AV55Emprcod, Integer.valueOf(AV56DevCruId), lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, Integer.valueOf(AV64Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod), Integer.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to), lV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent, AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel, lV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref, AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel, lV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc, AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel, Integer.valueOf(AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs), Integer.valueOf(AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to), AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund, AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk90F4 = false ;
         A44AlbRecCod = P090F3_A44AlbRecCod[0] ;
         A396EmprCod = P090F3_A396EmprCod[0] ;
         A11669DevCruId = P090F3_A11669DevCruId[0] ;
         A11683DevCruUnd = P090F3_A11683DevCruUnd[0] ;
         A11684DevCruPzs = P090F3_A11684DevCruPzs[0] ;
         A3613AlbRefDsc = P090F3_A3613AlbRefDsc[0] ;
         A45AlbRef = P090F3_A45AlbRef[0] ;
         A46AlbREnt = P090F3_A46AlbREnt[0] ;
         A3613AlbRefDsc = P090F3_A3613AlbRefDsc[0] ;
         A45AlbRef = P090F3_A45AlbRef[0] ;
         A46AlbREnt = P090F3_A46AlbREnt[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P090F3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P090F3_A44AlbRecCod[0] == A44AlbRecCod ) )
         {
            brk90F4 = false ;
            A11669DevCruId = P090F3_A11669DevCruId[0] ;
            AV38count = (long)(AV38count+1) ;
            brk90F4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A45AlbRef)==0) )
         {
            AV30Option = A45AlbRef ;
            AV29InsertIndex = 1 ;
            while ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) < 0 ) )
            {
               AV29InsertIndex = (int)(AV29InsertIndex+1) ;
            }
            AV31Options.add(AV30Option, AV29InsertIndex);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), AV29InsertIndex);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90F4 )
         {
            brk90F4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBREFDSCOPTIONS' Routine */
      returnInSub = false ;
      AV49TFAlbRefDsc = AV26SearchTxt ;
      AV50TFAlbRefDsc_Sel = "" ;
      AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = AV44FilterFullText ;
      AV64Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod = AV45TFAlbRecCod ;
      AV65Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to = AV46TFAlbRecCod_To ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = AV57TFAlbREnt ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel = AV58TFAlbREnt_Sel ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = AV47TFAlbRef ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel = AV48TFAlbRef_Sel ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = AV49TFAlbRefDsc ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel = AV50TFAlbRefDsc_Sel ;
      AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs = AV51TFDevCruPzs ;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to = AV52TFDevCruPzs_To ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund = AV53TFDevCruUnd ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to = AV54TFDevCruUnd_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ,
                                           Integer.valueOf(AV64Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod) ,
                                           Integer.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to) ,
                                           AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel ,
                                           AV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ,
                                           AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel ,
                                           AV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ,
                                           AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel ,
                                           AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ,
                                           Integer.valueOf(AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs) ,
                                           Integer.valueOf(AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to) ,
                                           AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund ,
                                           AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A11684DevCruPzs) ,
                                           A11683DevCruUnd ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(AV56DevCruId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent), 8, "%") ;
      lV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = GXutil.padr( GXutil.rtrim( AV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref), 16, "%") ;
      lV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc), 26, "%") ;
      /* Using cursor P090F4 */
      pr_default.execute(2, new Object[] {AV55Emprcod, Integer.valueOf(AV56DevCruId), lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, Integer.valueOf(AV64Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod), Integer.valueOf(AV65Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to), lV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent, AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel, lV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref, AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel, lV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc, AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel, Integer.valueOf(AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs), Integer.valueOf(AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to), AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund, AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk90F6 = false ;
         A396EmprCod = P090F4_A396EmprCod[0] ;
         A11669DevCruId = P090F4_A11669DevCruId[0] ;
         A3613AlbRefDsc = P090F4_A3613AlbRefDsc[0] ;
         A11683DevCruUnd = P090F4_A11683DevCruUnd[0] ;
         A11684DevCruPzs = P090F4_A11684DevCruPzs[0] ;
         A45AlbRef = P090F4_A45AlbRef[0] ;
         A46AlbREnt = P090F4_A46AlbREnt[0] ;
         A44AlbRecCod = P090F4_A44AlbRecCod[0] ;
         A3613AlbRefDsc = P090F4_A3613AlbRefDsc[0] ;
         A45AlbRef = P090F4_A45AlbRef[0] ;
         A46AlbREnt = P090F4_A46AlbREnt[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P090F4_A3613AlbRefDsc[0], A3613AlbRefDsc) == 0 ) )
         {
            brk90F6 = false ;
            A396EmprCod = P090F4_A396EmprCod[0] ;
            A11669DevCruId = P090F4_A11669DevCruId[0] ;
            A44AlbRecCod = P090F4_A44AlbRecCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk90F6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A3613AlbRefDsc)==0) )
         {
            AV30Option = A3613AlbRefDsc ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90F6 )
         {
            brk90F6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcconsultadevolucionesalmacentejidoencrudosindetallelineasgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = wcconsultadevolucionesalmacentejidoencrudosindetallelineasgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = wcconsultadevolucionesalmacentejidoencrudosindetallelineasgetfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32OptionsJson = "" ;
      AV35OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV39Session = httpContext.getWebSession();
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV44FilterFullText = "" ;
      AV57TFAlbREnt = "" ;
      AV58TFAlbREnt_Sel = "" ;
      AV47TFAlbRef = "" ;
      AV48TFAlbRef_Sel = "" ;
      AV49TFAlbRefDsc = "" ;
      AV50TFAlbRefDsc_Sel = "" ;
      AV53TFDevCruUnd = DecimalUtil.ZERO ;
      AV54TFDevCruUnd_To = DecimalUtil.ZERO ;
      AV55Emprcod = "" ;
      A46AlbREnt = "" ;
      AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = "" ;
      AV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = "" ;
      AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel = "" ;
      AV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = "" ;
      AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel = "" ;
      AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = "" ;
      AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel = "" ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund = DecimalUtil.ZERO ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = "" ;
      lV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = "" ;
      lV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = "" ;
      lV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P090F2_A396EmprCod = new String[] {""} ;
      P090F2_A11669DevCruId = new int[1] ;
      P090F2_A46AlbREnt = new String[] {""} ;
      P090F2_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090F2_A11684DevCruPzs = new int[1] ;
      P090F2_A3613AlbRefDsc = new String[] {""} ;
      P090F2_A45AlbRef = new String[] {""} ;
      P090F2_A44AlbRecCod = new int[1] ;
      AV30Option = "" ;
      P090F3_A44AlbRecCod = new int[1] ;
      P090F3_A396EmprCod = new String[] {""} ;
      P090F3_A11669DevCruId = new int[1] ;
      P090F3_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090F3_A11684DevCruPzs = new int[1] ;
      P090F3_A3613AlbRefDsc = new String[] {""} ;
      P090F3_A45AlbRef = new String[] {""} ;
      P090F3_A46AlbREnt = new String[] {""} ;
      P090F4_A396EmprCod = new String[] {""} ;
      P090F4_A11669DevCruId = new int[1] ;
      P090F4_A3613AlbRefDsc = new String[] {""} ;
      P090F4_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090F4_A11684DevCruPzs = new int[1] ;
      P090F4_A45AlbRef = new String[] {""} ;
      P090F4_A46AlbREnt = new String[] {""} ;
      P090F4_A44AlbRecCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultadevolucionesalmacentejidoencrudosindetallelineasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P090F2_A396EmprCod, P090F2_A11669DevCruId, P090F2_A46AlbREnt, P090F2_A11683DevCruUnd, P090F2_A11684DevCruPzs, P090F2_A3613AlbRefDsc, P090F2_A45AlbRef, P090F2_A44AlbRecCod
            }
            , new Object[] {
            P090F3_A44AlbRecCod, P090F3_A396EmprCod, P090F3_A11669DevCruId, P090F3_A11683DevCruUnd, P090F3_A11684DevCruPzs, P090F3_A3613AlbRefDsc, P090F3_A45AlbRef, P090F3_A46AlbREnt
            }
            , new Object[] {
            P090F4_A396EmprCod, P090F4_A11669DevCruId, P090F4_A3613AlbRefDsc, P090F4_A11683DevCruUnd, P090F4_A11684DevCruPzs, P090F4_A45AlbRef, P090F4_A46AlbREnt, P090F4_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV61GXV1 ;
   private int AV45TFAlbRecCod ;
   private int AV46TFAlbRecCod_To ;
   private int AV51TFDevCruPzs ;
   private int AV52TFDevCruPzs_To ;
   private int AV56DevCruId ;
   private int AV64Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod ;
   private int AV65Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to ;
   private int AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs ;
   private int AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to ;
   private int A44AlbRecCod ;
   private int A11684DevCruPzs ;
   private int A11669DevCruId ;
   private int AV29InsertIndex ;
   private long AV38count ;
   private java.math.BigDecimal AV53TFDevCruUnd ;
   private java.math.BigDecimal AV54TFDevCruUnd_To ;
   private java.math.BigDecimal AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund ;
   private java.math.BigDecimal AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private String AV57TFAlbREnt ;
   private String AV58TFAlbREnt_Sel ;
   private String AV47TFAlbRef ;
   private String AV48TFAlbRef_Sel ;
   private String AV49TFAlbRefDsc ;
   private String AV50TFAlbRefDsc_Sel ;
   private String AV55Emprcod ;
   private String A46AlbREnt ;
   private String AV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ;
   private String AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel ;
   private String AV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ;
   private String AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel ;
   private String AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ;
   private String AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel ;
   private String scmdbuf ;
   private String lV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ;
   private String lV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ;
   private String lV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk90F2 ;
   private boolean brk90F4 ;
   private boolean brk90F6 ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV44FilterFullText ;
   private String AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ;
   private String lV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P090F2_A396EmprCod ;
   private int[] P090F2_A11669DevCruId ;
   private String[] P090F2_A46AlbREnt ;
   private java.math.BigDecimal[] P090F2_A11683DevCruUnd ;
   private int[] P090F2_A11684DevCruPzs ;
   private String[] P090F2_A3613AlbRefDsc ;
   private String[] P090F2_A45AlbRef ;
   private int[] P090F2_A44AlbRecCod ;
   private int[] P090F3_A44AlbRecCod ;
   private String[] P090F3_A396EmprCod ;
   private int[] P090F3_A11669DevCruId ;
   private java.math.BigDecimal[] P090F3_A11683DevCruUnd ;
   private int[] P090F3_A11684DevCruPzs ;
   private String[] P090F3_A3613AlbRefDsc ;
   private String[] P090F3_A45AlbRef ;
   private String[] P090F3_A46AlbREnt ;
   private String[] P090F4_A396EmprCod ;
   private int[] P090F4_A11669DevCruId ;
   private String[] P090F4_A3613AlbRefDsc ;
   private java.math.BigDecimal[] P090F4_A11683DevCruUnd ;
   private int[] P090F4_A11684DevCruPzs ;
   private String[] P090F4_A45AlbRef ;
   private String[] P090F4_A46AlbREnt ;
   private int[] P090F4_A44AlbRecCod ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class wcconsultadevolucionesalmacentejidoencrudosindetallelineasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P090F2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ,
                                          int AV64Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod ,
                                          int AV65Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to ,
                                          String AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel ,
                                          String AV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ,
                                          String AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel ,
                                          String AV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ,
                                          String AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel ,
                                          String AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ,
                                          int AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs ,
                                          int AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to ,
                                          java.math.BigDecimal AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund ,
                                          java.math.BigDecimal AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A11684DevCruPzs ,
                                          java.math.BigDecimal A11683DevCruUnd ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          int A11669DevCruId ,
                                          int AV56DevCruId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[20];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevCruId, T2.AlbREnt, T1.DevCruUnd, T1.DevCruPzs, T2.AlbRefDsc, T2.AlbRef, T1.AlbRecCod FROM (TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DevCruId = ?)");
      if ( ! (GXutil.strcmp("", AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbRecCod,'99999990'), 2) like '%' || ?) or ( UPPER(T2.AlbREnt) like '%' || UPPER(?)) or ( UPPER(T2.AlbRef) like '%' || UPPER(?)) or ( UPPER(T2.AlbRefDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DevCruPzs,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.DevCruUnd,'999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.AlbREnt" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P090F3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ,
                                          int AV64Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod ,
                                          int AV65Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to ,
                                          String AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel ,
                                          String AV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ,
                                          String AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel ,
                                          String AV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ,
                                          String AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel ,
                                          String AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ,
                                          int AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs ,
                                          int AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to ,
                                          java.math.BigDecimal AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund ,
                                          java.math.BigDecimal AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A11684DevCruPzs ,
                                          java.math.BigDecimal A11683DevCruUnd ,
                                          int A11669DevCruId ,
                                          int AV56DevCruId ,
                                          String AV55Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[20];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.AlbRecCod, T1.EmprCod, T1.DevCruId, T1.DevCruUnd, T1.DevCruPzs, T2.AlbRefDsc, T2.AlbRef, T2.AlbREnt FROM (TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DevCruId = ?)");
      if ( ! (GXutil.strcmp("", AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbRecCod,'99999990'), 2) like '%' || ?) or ( UPPER(T2.AlbREnt) like '%' || UPPER(?)) or ( UPPER(T2.AlbRef) like '%' || UPPER(?)) or ( UPPER(T2.AlbRefDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DevCruPzs,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.DevCruUnd,'999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRecCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P090F4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ,
                                          int AV64Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod ,
                                          int AV65Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to ,
                                          String AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel ,
                                          String AV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ,
                                          String AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel ,
                                          String AV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ,
                                          String AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel ,
                                          String AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ,
                                          int AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs ,
                                          int AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to ,
                                          java.math.BigDecimal AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund ,
                                          java.math.BigDecimal AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A11684DevCruPzs ,
                                          java.math.BigDecimal A11683DevCruUnd ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          int A11669DevCruId ,
                                          int AV56DevCruId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[20];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevCruId, T2.AlbRefDsc, T1.DevCruUnd, T1.DevCruPzs, T2.AlbRef, T2.AlbREnt, T1.AlbRecCod FROM (TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DevCruId = ?)");
      if ( ! (GXutil.strcmp("", AV63Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbRecCod,'99999990'), 2) like '%' || ?) or ( UPPER(T2.AlbREnt) like '%' || UPPER(?)) or ( UPPER(T2.AlbRef) like '%' || UPPER(?)) or ( UPPER(T2.AlbRefDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DevCruPzs,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.DevCruUnd,'999990.99'), 2) like '%' || ?))");
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
      if ( ! (0==AV64Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV68Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV72Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.AlbRefDsc" ;
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
                  return conditional_P090F2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() );
            case 1 :
                  return conditional_P090F3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] );
            case 2 :
                  return conditional_P090F4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P090F2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090F3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090F4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               return;
            case 1 :
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
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               return;
            case 2 :
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
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               return;
      }
   }

}

