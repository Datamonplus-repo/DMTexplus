package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class devoluciontejido_3getfilterdata extends GXProcedure
{
   public devoluciontejido_3getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_3getfilterdata.class ), "" );
   }

   public devoluciontejido_3getfilterdata( int remoteHandle ,
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
      devoluciontejido_3getfilterdata.this.aP5 = new String[] {""};
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
      devoluciontejido_3getfilterdata.this.AV32DDOName = aP0;
      devoluciontejido_3getfilterdata.this.AV33SearchTxt = aP1;
      devoluciontejido_3getfilterdata.this.AV34SearchTxtTo = aP2;
      devoluciontejido_3getfilterdata.this.aP3 = aP3;
      devoluciontejido_3getfilterdata.this.aP4 = aP4;
      devoluciontejido_3getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV25OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBREF") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBREFDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV35OptionsJson = AV22Options.toJSonString(false) ;
      AV36OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV25OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("AlmacenSinDetalle.DevolucionTejido_3GridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AlmacenSinDetalle.DevolucionTejido_3GridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("AlmacenSinDetalle.DevolucionTejido_3GridState"), null, null);
      }
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV10TFAlbRecCod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbRecCod_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV12TFAlbRef = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV13TFAlbRef_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV14TFAlbRefDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV15TFAlbRefDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUUND") == 0 )
         {
            AV16TFDevCruUnd = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFDevCruUnd_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUPZS") == 0 )
         {
            AV18TFDevCruPzs = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFDevCruPzs_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV38Emprcod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DEVCRUID") == 0 )
         {
            AV39DevCruId = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DEVCRUATID") == 0 )
         {
            AV40DevCruAtId = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV41Clicod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DEVCRUDTSYS") == 0 )
         {
            AV42DevCruDtSys = localUtil.ctot( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DEVCRUFEC") == 0 )
         {
            AV43DevCruFec = localUtil.ctod( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBREFOPTIONS' Routine */
      returnInSub = false ;
      AV12TFAlbRef = AV33SearchTxt ;
      AV13TFAlbRef_Sel = "" ;
      AV48Almacensindetalle_devoluciontejido_3ds_1_tfalbreccod = AV10TFAlbRecCod ;
      AV49Almacensindetalle_devoluciontejido_3ds_2_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref = AV12TFAlbRef ;
      AV51Almacensindetalle_devoluciontejido_3ds_4_tfalbref_sel = AV13TFAlbRef_Sel ;
      AV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc = AV14TFAlbRefDsc ;
      AV53Almacensindetalle_devoluciontejido_3ds_6_tfalbrefdsc_sel = AV15TFAlbRefDsc_Sel ;
      AV54Almacensindetalle_devoluciontejido_3ds_7_tfdevcruund = AV16TFDevCruUnd ;
      AV55Almacensindetalle_devoluciontejido_3ds_8_tfdevcruund_to = AV17TFDevCruUnd_To ;
      AV56Almacensindetalle_devoluciontejido_3ds_9_tfdevcrupzs = AV18TFDevCruPzs ;
      AV57Almacensindetalle_devoluciontejido_3ds_10_tfdevcrupzs_to = AV19TFDevCruPzs_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV48Almacensindetalle_devoluciontejido_3ds_1_tfalbreccod) ,
                                           Integer.valueOf(AV49Almacensindetalle_devoluciontejido_3ds_2_tfalbreccod_to) ,
                                           AV51Almacensindetalle_devoluciontejido_3ds_4_tfalbref_sel ,
                                           AV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref ,
                                           AV53Almacensindetalle_devoluciontejido_3ds_6_tfalbrefdsc_sel ,
                                           AV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc ,
                                           AV54Almacensindetalle_devoluciontejido_3ds_7_tfdevcruund ,
                                           AV55Almacensindetalle_devoluciontejido_3ds_8_tfdevcruund_to ,
                                           Integer.valueOf(AV56Almacensindetalle_devoluciontejido_3ds_9_tfdevcrupzs) ,
                                           Integer.valueOf(AV57Almacensindetalle_devoluciontejido_3ds_10_tfdevcrupzs_to) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A11683DevCruUnd ,
                                           Integer.valueOf(A11684DevCruPzs) ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(AV39DevCruId) ,
                                           AV38Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref = GXutil.padr( GXutil.rtrim( AV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref), 16, "%") ;
      lV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc), 26, "%") ;
      /* Using cursor P09SG2 */
      pr_default.execute(0, new Object[] {AV38Emprcod, Integer.valueOf(AV39DevCruId), Integer.valueOf(AV48Almacensindetalle_devoluciontejido_3ds_1_tfalbreccod), Integer.valueOf(AV49Almacensindetalle_devoluciontejido_3ds_2_tfalbreccod_to), lV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref, AV51Almacensindetalle_devoluciontejido_3ds_4_tfalbref_sel, lV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc, AV53Almacensindetalle_devoluciontejido_3ds_6_tfalbrefdsc_sel, AV54Almacensindetalle_devoluciontejido_3ds_7_tfdevcruund, AV55Almacensindetalle_devoluciontejido_3ds_8_tfdevcruund_to, Integer.valueOf(AV56Almacensindetalle_devoluciontejido_3ds_9_tfdevcrupzs), Integer.valueOf(AV57Almacensindetalle_devoluciontejido_3ds_10_tfdevcrupzs_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9SG2 = false ;
         A44AlbRecCod = P09SG2_A44AlbRecCod[0] ;
         A396EmprCod = P09SG2_A396EmprCod[0] ;
         A11669DevCruId = P09SG2_A11669DevCruId[0] ;
         A11684DevCruPzs = P09SG2_A11684DevCruPzs[0] ;
         A11683DevCruUnd = P09SG2_A11683DevCruUnd[0] ;
         A3613AlbRefDsc = P09SG2_A3613AlbRefDsc[0] ;
         A45AlbRef = P09SG2_A45AlbRef[0] ;
         A3613AlbRefDsc = P09SG2_A3613AlbRefDsc[0] ;
         A45AlbRef = P09SG2_A45AlbRef[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09SG2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09SG2_A44AlbRecCod[0] == A44AlbRecCod ) )
         {
            brk9SG2 = false ;
            A11669DevCruId = P09SG2_A11669DevCruId[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9SG2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A45AlbRef)==0) )
         {
            AV21Option = A45AlbRef ;
            AV20InsertIndex = 1 ;
            while ( ( AV20InsertIndex <= AV22Options.size() ) && ( GXutil.strcmp((String)AV22Options.elementAt(-1+AV20InsertIndex), AV21Option) < 0 ) )
            {
               AV20InsertIndex = (int)(AV20InsertIndex+1) ;
            }
            AV22Options.add(AV21Option, AV20InsertIndex);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), AV20InsertIndex);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9SG2 )
         {
            brk9SG2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBREFDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFAlbRefDsc = AV33SearchTxt ;
      AV15TFAlbRefDsc_Sel = "" ;
      AV48Almacensindetalle_devoluciontejido_3ds_1_tfalbreccod = AV10TFAlbRecCod ;
      AV49Almacensindetalle_devoluciontejido_3ds_2_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref = AV12TFAlbRef ;
      AV51Almacensindetalle_devoluciontejido_3ds_4_tfalbref_sel = AV13TFAlbRef_Sel ;
      AV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc = AV14TFAlbRefDsc ;
      AV53Almacensindetalle_devoluciontejido_3ds_6_tfalbrefdsc_sel = AV15TFAlbRefDsc_Sel ;
      AV54Almacensindetalle_devoluciontejido_3ds_7_tfdevcruund = AV16TFDevCruUnd ;
      AV55Almacensindetalle_devoluciontejido_3ds_8_tfdevcruund_to = AV17TFDevCruUnd_To ;
      AV56Almacensindetalle_devoluciontejido_3ds_9_tfdevcrupzs = AV18TFDevCruPzs ;
      AV57Almacensindetalle_devoluciontejido_3ds_10_tfdevcrupzs_to = AV19TFDevCruPzs_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV48Almacensindetalle_devoluciontejido_3ds_1_tfalbreccod) ,
                                           Integer.valueOf(AV49Almacensindetalle_devoluciontejido_3ds_2_tfalbreccod_to) ,
                                           AV51Almacensindetalle_devoluciontejido_3ds_4_tfalbref_sel ,
                                           AV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref ,
                                           AV53Almacensindetalle_devoluciontejido_3ds_6_tfalbrefdsc_sel ,
                                           AV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc ,
                                           AV54Almacensindetalle_devoluciontejido_3ds_7_tfdevcruund ,
                                           AV55Almacensindetalle_devoluciontejido_3ds_8_tfdevcruund_to ,
                                           Integer.valueOf(AV56Almacensindetalle_devoluciontejido_3ds_9_tfdevcrupzs) ,
                                           Integer.valueOf(AV57Almacensindetalle_devoluciontejido_3ds_10_tfdevcrupzs_to) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A11683DevCruUnd ,
                                           Integer.valueOf(A11684DevCruPzs) ,
                                           A396EmprCod ,
                                           AV38Emprcod ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(AV39DevCruId) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref = GXutil.padr( GXutil.rtrim( AV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref), 16, "%") ;
      lV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc), 26, "%") ;
      /* Using cursor P09SG3 */
      pr_default.execute(1, new Object[] {AV38Emprcod, Integer.valueOf(AV39DevCruId), Integer.valueOf(AV48Almacensindetalle_devoluciontejido_3ds_1_tfalbreccod), Integer.valueOf(AV49Almacensindetalle_devoluciontejido_3ds_2_tfalbreccod_to), lV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref, AV51Almacensindetalle_devoluciontejido_3ds_4_tfalbref_sel, lV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc, AV53Almacensindetalle_devoluciontejido_3ds_6_tfalbrefdsc_sel, AV54Almacensindetalle_devoluciontejido_3ds_7_tfdevcruund, AV55Almacensindetalle_devoluciontejido_3ds_8_tfdevcruund_to, Integer.valueOf(AV56Almacensindetalle_devoluciontejido_3ds_9_tfdevcrupzs), Integer.valueOf(AV57Almacensindetalle_devoluciontejido_3ds_10_tfdevcrupzs_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9SG4 = false ;
         A396EmprCod = P09SG3_A396EmprCod[0] ;
         A11669DevCruId = P09SG3_A11669DevCruId[0] ;
         A3613AlbRefDsc = P09SG3_A3613AlbRefDsc[0] ;
         A11684DevCruPzs = P09SG3_A11684DevCruPzs[0] ;
         A11683DevCruUnd = P09SG3_A11683DevCruUnd[0] ;
         A45AlbRef = P09SG3_A45AlbRef[0] ;
         A44AlbRecCod = P09SG3_A44AlbRecCod[0] ;
         A3613AlbRefDsc = P09SG3_A3613AlbRefDsc[0] ;
         A45AlbRef = P09SG3_A45AlbRef[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09SG3_A3613AlbRefDsc[0], A3613AlbRefDsc) == 0 ) )
         {
            brk9SG4 = false ;
            A396EmprCod = P09SG3_A396EmprCod[0] ;
            A11669DevCruId = P09SG3_A11669DevCruId[0] ;
            A44AlbRecCod = P09SG3_A44AlbRecCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9SG4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A3613AlbRefDsc)==0) )
         {
            AV21Option = A3613AlbRefDsc ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9SG4 )
         {
            brk9SG4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = devoluciontejido_3getfilterdata.this.AV35OptionsJson;
      this.aP4[0] = devoluciontejido_3getfilterdata.this.AV36OptionsDescJson;
      this.aP5[0] = devoluciontejido_3getfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV35OptionsJson = "" ;
      AV36OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV22Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV25OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFAlbRef = "" ;
      AV13TFAlbRef_Sel = "" ;
      AV14TFAlbRefDsc = "" ;
      AV15TFAlbRefDsc_Sel = "" ;
      AV16TFDevCruUnd = DecimalUtil.ZERO ;
      AV17TFDevCruUnd_To = DecimalUtil.ZERO ;
      AV38Emprcod = "" ;
      AV40DevCruAtId = "" ;
      AV42DevCruDtSys = GXutil.resetTime( GXutil.nullDate() );
      AV43DevCruFec = GXutil.nullDate() ;
      A45AlbRef = "" ;
      AV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref = "" ;
      AV51Almacensindetalle_devoluciontejido_3ds_4_tfalbref_sel = "" ;
      AV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc = "" ;
      AV53Almacensindetalle_devoluciontejido_3ds_6_tfalbrefdsc_sel = "" ;
      AV54Almacensindetalle_devoluciontejido_3ds_7_tfdevcruund = DecimalUtil.ZERO ;
      AV55Almacensindetalle_devoluciontejido_3ds_8_tfdevcruund_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref = "" ;
      lV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc = "" ;
      A3613AlbRefDsc = "" ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P09SG2_A44AlbRecCod = new int[1] ;
      P09SG2_A396EmprCod = new String[] {""} ;
      P09SG2_A11669DevCruId = new int[1] ;
      P09SG2_A11684DevCruPzs = new int[1] ;
      P09SG2_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09SG2_A3613AlbRefDsc = new String[] {""} ;
      P09SG2_A45AlbRef = new String[] {""} ;
      AV21Option = "" ;
      P09SG3_A396EmprCod = new String[] {""} ;
      P09SG3_A11669DevCruId = new int[1] ;
      P09SG3_A3613AlbRefDsc = new String[] {""} ;
      P09SG3_A11684DevCruPzs = new int[1] ;
      P09SG3_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09SG3_A45AlbRef = new String[] {""} ;
      P09SG3_A44AlbRecCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_3getfilterdata__default(),
         new Object[] {
             new Object[] {
            P09SG2_A44AlbRecCod, P09SG2_A396EmprCod, P09SG2_A11669DevCruId, P09SG2_A11684DevCruPzs, P09SG2_A11683DevCruUnd, P09SG2_A3613AlbRefDsc, P09SG2_A45AlbRef
            }
            , new Object[] {
            P09SG3_A396EmprCod, P09SG3_A11669DevCruId, P09SG3_A3613AlbRefDsc, P09SG3_A11684DevCruPzs, P09SG3_A11683DevCruUnd, P09SG3_A45AlbRef, P09SG3_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV46GXV1 ;
   private int AV10TFAlbRecCod ;
   private int AV11TFAlbRecCod_To ;
   private int AV18TFDevCruPzs ;
   private int AV19TFDevCruPzs_To ;
   private int AV39DevCruId ;
   private int AV41Clicod ;
   private int AV48Almacensindetalle_devoluciontejido_3ds_1_tfalbreccod ;
   private int AV49Almacensindetalle_devoluciontejido_3ds_2_tfalbreccod_to ;
   private int AV56Almacensindetalle_devoluciontejido_3ds_9_tfdevcrupzs ;
   private int AV57Almacensindetalle_devoluciontejido_3ds_10_tfdevcrupzs_to ;
   private int A44AlbRecCod ;
   private int A11684DevCruPzs ;
   private int A11669DevCruId ;
   private int AV20InsertIndex ;
   private long AV26count ;
   private java.math.BigDecimal AV16TFDevCruUnd ;
   private java.math.BigDecimal AV17TFDevCruUnd_To ;
   private java.math.BigDecimal AV54Almacensindetalle_devoluciontejido_3ds_7_tfdevcruund ;
   private java.math.BigDecimal AV55Almacensindetalle_devoluciontejido_3ds_8_tfdevcruund_to ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private String AV12TFAlbRef ;
   private String AV13TFAlbRef_Sel ;
   private String AV14TFAlbRefDsc ;
   private String AV15TFAlbRefDsc_Sel ;
   private String AV38Emprcod ;
   private String AV40DevCruAtId ;
   private String A45AlbRef ;
   private String AV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref ;
   private String AV51Almacensindetalle_devoluciontejido_3ds_4_tfalbref_sel ;
   private String AV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc ;
   private String AV53Almacensindetalle_devoluciontejido_3ds_6_tfalbrefdsc_sel ;
   private String scmdbuf ;
   private String lV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref ;
   private String lV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc ;
   private String A3613AlbRefDsc ;
   private String A396EmprCod ;
   private java.util.Date AV42DevCruDtSys ;
   private java.util.Date AV43DevCruFec ;
   private boolean returnInSub ;
   private boolean brk9SG2 ;
   private boolean brk9SG4 ;
   private String AV35OptionsJson ;
   private String AV36OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV33SearchTxt ;
   private String AV34SearchTxtTo ;
   private String AV21Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09SG2_A44AlbRecCod ;
   private String[] P09SG2_A396EmprCod ;
   private int[] P09SG2_A11669DevCruId ;
   private int[] P09SG2_A11684DevCruPzs ;
   private java.math.BigDecimal[] P09SG2_A11683DevCruUnd ;
   private String[] P09SG2_A3613AlbRefDsc ;
   private String[] P09SG2_A45AlbRef ;
   private String[] P09SG3_A396EmprCod ;
   private int[] P09SG3_A11669DevCruId ;
   private String[] P09SG3_A3613AlbRefDsc ;
   private int[] P09SG3_A11684DevCruPzs ;
   private java.math.BigDecimal[] P09SG3_A11683DevCruUnd ;
   private String[] P09SG3_A45AlbRef ;
   private int[] P09SG3_A44AlbRecCod ;
   private GXSimpleCollection<String> AV22Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV25OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class devoluciontejido_3getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09SG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV48Almacensindetalle_devoluciontejido_3ds_1_tfalbreccod ,
                                          int AV49Almacensindetalle_devoluciontejido_3ds_2_tfalbreccod_to ,
                                          String AV51Almacensindetalle_devoluciontejido_3ds_4_tfalbref_sel ,
                                          String AV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref ,
                                          String AV53Almacensindetalle_devoluciontejido_3ds_6_tfalbrefdsc_sel ,
                                          String AV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc ,
                                          java.math.BigDecimal AV54Almacensindetalle_devoluciontejido_3ds_7_tfdevcruund ,
                                          java.math.BigDecimal AV55Almacensindetalle_devoluciontejido_3ds_8_tfdevcruund_to ,
                                          int AV56Almacensindetalle_devoluciontejido_3ds_9_tfdevcrupzs ,
                                          int AV57Almacensindetalle_devoluciontejido_3ds_10_tfdevcrupzs_to ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          java.math.BigDecimal A11683DevCruUnd ,
                                          int A11684DevCruPzs ,
                                          int A11669DevCruId ,
                                          int AV39DevCruId ,
                                          String AV38Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.AlbRecCod, T1.EmprCod, T1.DevCruId, T1.DevCruPzs, T1.DevCruUnd, T2.AlbRefDsc, T2.AlbRef FROM (TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DevCruId = ?)");
      if ( ! (0==AV48Almacensindetalle_devoluciontejido_3ds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV49Almacensindetalle_devoluciontejido_3ds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Almacensindetalle_devoluciontejido_3ds_4_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Almacensindetalle_devoluciontejido_3ds_4_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Almacensindetalle_devoluciontejido_3ds_6_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Almacensindetalle_devoluciontejido_3ds_6_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Almacensindetalle_devoluciontejido_3ds_7_tfdevcruund)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Almacensindetalle_devoluciontejido_3ds_8_tfdevcruund_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV56Almacensindetalle_devoluciontejido_3ds_9_tfdevcrupzs) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV57Almacensindetalle_devoluciontejido_3ds_10_tfdevcrupzs_to) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRecCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09SG3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV48Almacensindetalle_devoluciontejido_3ds_1_tfalbreccod ,
                                          int AV49Almacensindetalle_devoluciontejido_3ds_2_tfalbreccod_to ,
                                          String AV51Almacensindetalle_devoluciontejido_3ds_4_tfalbref_sel ,
                                          String AV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref ,
                                          String AV53Almacensindetalle_devoluciontejido_3ds_6_tfalbrefdsc_sel ,
                                          String AV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc ,
                                          java.math.BigDecimal AV54Almacensindetalle_devoluciontejido_3ds_7_tfdevcruund ,
                                          java.math.BigDecimal AV55Almacensindetalle_devoluciontejido_3ds_8_tfdevcruund_to ,
                                          int AV56Almacensindetalle_devoluciontejido_3ds_9_tfdevcrupzs ,
                                          int AV57Almacensindetalle_devoluciontejido_3ds_10_tfdevcrupzs_to ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          java.math.BigDecimal A11683DevCruUnd ,
                                          int A11684DevCruPzs ,
                                          String A396EmprCod ,
                                          String AV38Emprcod ,
                                          int A11669DevCruId ,
                                          int AV39DevCruId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevCruId, T2.AlbRefDsc, T1.DevCruPzs, T1.DevCruUnd, T2.AlbRef, T1.AlbRecCod FROM (TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DevCruId = ?)");
      if ( ! (0==AV48Almacensindetalle_devoluciontejido_3ds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV49Almacensindetalle_devoluciontejido_3ds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Almacensindetalle_devoluciontejido_3ds_4_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV50Almacensindetalle_devoluciontejido_3ds_3_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Almacensindetalle_devoluciontejido_3ds_4_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Almacensindetalle_devoluciontejido_3ds_6_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Almacensindetalle_devoluciontejido_3ds_5_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Almacensindetalle_devoluciontejido_3ds_6_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Almacensindetalle_devoluciontejido_3ds_7_tfdevcruund)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Almacensindetalle_devoluciontejido_3ds_8_tfdevcruund_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV56Almacensindetalle_devoluciontejido_3ds_9_tfdevcrupzs) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV57Almacensindetalle_devoluciontejido_3ds_10_tfdevcrupzs_to) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.AlbRefDsc" ;
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
                  return conditional_P09SG2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 1 :
                  return conditional_P09SG3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09SG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09SG3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               return;
            case 1 :
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
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               return;
      }
   }

}

