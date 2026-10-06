package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wdupserconfirmgetfilterdata extends GXProcedure
{
   public wdupserconfirmgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wdupserconfirmgetfilterdata.class ), "" );
   }

   public wdupserconfirmgetfilterdata( int remoteHandle ,
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
      wdupserconfirmgetfilterdata.this.aP5 = new String[] {""};
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
      wdupserconfirmgetfilterdata.this.AV28DDOName = aP0;
      wdupserconfirmgetfilterdata.this.AV29SearchTxt = aP1;
      wdupserconfirmgetfilterdata.this.AV30SearchTxtTo = aP2;
      wdupserconfirmgetfilterdata.this.aP3 = aP3;
      wdupserconfirmgetfilterdata.this.aP4 = aP4;
      wdupserconfirmgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV21OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_SDTDUPLICACCIONSERIE__ARTCODORI") == 0 )
      {
         AV11TFSDTDuplicaccionSerie__ArtCodOri = AV29SearchTxt ;
         AV12TFSDTDuplicaccionSerie__ArtCodOri_Sel = "" ;
         /* Execute user subroutine: 'LOADSDTDUPLICACCIONSERIE__ARTCODORIOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_SDTDUPLICACCIONSERIE__ARTDSCDES") == 0 )
      {
         AV13TFSDTDuplicaccionSerie__ArtDscDes = AV29SearchTxt ;
         AV14TFSDTDuplicaccionSerie__ArtDscDes_Sel = "" ;
         /* Execute user subroutine: 'LOADSDTDUPLICACCIONSERIE__ARTDSCDESOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV31OptionsJson = AV18Options.toJSonString(false) ;
      AV32OptionsDescJson = AV20OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV21OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV23Session.getValue("FicherosBasicos.wdupserConfirmGridState"), "") == 0 )
      {
         AV25GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.wdupserConfirmGridState"), null, null);
      }
      else
      {
         AV25GridState.fromxml(AV23Session.getValue("FicherosBasicos.wdupserConfirmGridState"), null, null);
      }
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV26GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV41GXV1));
         if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSDTDUPLICACCIONSERIE__ARTCODORI") == 0 )
         {
            AV11TFSDTDuplicaccionSerie__ArtCodOri = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSDTDUPLICACCIONSERIE__ARTCODORI_SEL") == 0 )
         {
            AV12TFSDTDuplicaccionSerie__ArtCodOri_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSDTDUPLICACCIONSERIE__ARTDSCDES") == 0 )
         {
            AV13TFSDTDuplicaccionSerie__ArtDscDes = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSDTDUPLICACCIONSERIE__ARTDSCDES_SEL") == 0 )
         {
            AV14TFSDTDuplicaccionSerie__ArtDscDes_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV34EmprCod = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODORI") == 0 )
         {
            AV35CliCodOri = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODDES") == 0 )
         {
            AV36CliCodDes = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OP_E") == 0 )
         {
            AV37Op_e = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OP_P") == 0 )
         {
            AV38Op_p = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADSDTDUPLICACCIONSERIE__ARTCODORIOPTIONS' Routine */
      returnInSub = false ;
      AV42GXV2 = 1 ;
      while ( AV42GXV2 <= AV10SDTDuplicaccionSerie.size() )
      {
         AV15SDTDuplicaccionSerieItem = (app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)((app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)AV10SDTDuplicaccionSerie.elementAt(-1+AV42GXV2));
         if ( ! (GXutil.strcmp("", AV15SDTDuplicaccionSerieItem.getgxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori())==0) )
         {
            AV17Option = AV15SDTDuplicaccionSerieItem.getgxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori() ;
            AV16InsertIndex = 1 ;
            while ( ( AV16InsertIndex <= AV18Options.size() ) && ( GXutil.strcmp((String)AV18Options.elementAt(-1+AV16InsertIndex), AV17Option) < 0 ) )
            {
               AV16InsertIndex = (int)(AV16InsertIndex+1) ;
            }
            if ( ( ( AV16InsertIndex == AV18Options.size() + 1 ) ) || ( GXutil.strcmp((String)AV18Options.elementAt(-1+AV16InsertIndex), AV17Option) != 0 ) )
            {
               AV18Options.add(AV17Option, AV16InsertIndex);
            }
         }
         AV42GXV2 = (int)(AV42GXV2+1) ;
      }
   }

   public void S131( )
   {
      /* 'LOADSDTDUPLICACCIONSERIE__ARTDSCDESOPTIONS' Routine */
      returnInSub = false ;
      AV43GXV3 = 1 ;
      while ( AV43GXV3 <= AV10SDTDuplicaccionSerie.size() )
      {
         AV15SDTDuplicaccionSerieItem = (app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)((app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)AV10SDTDuplicaccionSerie.elementAt(-1+AV43GXV3));
         if ( ! (GXutil.strcmp("", AV15SDTDuplicaccionSerieItem.getgxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes())==0) )
         {
            AV17Option = AV15SDTDuplicaccionSerieItem.getgxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes() ;
            AV16InsertIndex = 1 ;
            while ( ( AV16InsertIndex <= AV18Options.size() ) && ( GXutil.strcmp((String)AV18Options.elementAt(-1+AV16InsertIndex), AV17Option) < 0 ) )
            {
               AV16InsertIndex = (int)(AV16InsertIndex+1) ;
            }
            if ( ( ( AV16InsertIndex == AV18Options.size() + 1 ) ) || ( GXutil.strcmp((String)AV18Options.elementAt(-1+AV16InsertIndex), AV17Option) != 0 ) )
            {
               AV18Options.add(AV17Option, AV16InsertIndex);
            }
         }
         AV43GXV3 = (int)(AV43GXV3+1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP3[0] = wdupserconfirmgetfilterdata.this.AV31OptionsJson;
      this.aP4[0] = wdupserconfirmgetfilterdata.this.AV32OptionsDescJson;
      this.aP5[0] = wdupserconfirmgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV31OptionsJson = "" ;
      AV32OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV18Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV21OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TFSDTDuplicaccionSerie__ArtCodOri = "" ;
      AV12TFSDTDuplicaccionSerie__ArtCodOri_Sel = "" ;
      AV13TFSDTDuplicaccionSerie__ArtDscDes = "" ;
      AV14TFSDTDuplicaccionSerie__ArtDscDes_Sel = "" ;
      AV23Session = httpContext.getWebSession();
      AV25GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV26GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV34EmprCod = "" ;
      AV37Op_e = "" ;
      AV38Op_p = "" ;
      AV10SDTDuplicaccionSerie = new GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie>(app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie.class, "Serie", "TexplusNET", remoteHandle);
      AV15SDTDuplicaccionSerieItem = new app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie(remoteHandle, context);
      AV17Option = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV41GXV1 ;
   private int AV35CliCodOri ;
   private int AV36CliCodDes ;
   private int AV42GXV2 ;
   private int AV16InsertIndex ;
   private int AV43GXV3 ;
   private String AV11TFSDTDuplicaccionSerie__ArtCodOri ;
   private String AV12TFSDTDuplicaccionSerie__ArtCodOri_Sel ;
   private String AV13TFSDTDuplicaccionSerie__ArtDscDes ;
   private String AV14TFSDTDuplicaccionSerie__ArtDscDes_Sel ;
   private String AV34EmprCod ;
   private String AV37Op_e ;
   private String AV38Op_p ;
   private boolean returnInSub ;
   private String AV31OptionsJson ;
   private String AV32OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV29SearchTxt ;
   private String AV30SearchTxtTo ;
   private String AV17Option ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie> AV10SDTDuplicaccionSerie ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private GXSimpleCollection<String> AV18Options ;
   private GXSimpleCollection<String> AV20OptionsDesc ;
   private GXSimpleCollection<String> AV21OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie AV15SDTDuplicaccionSerieItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV25GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV26GridStateFilterValue ;
}

