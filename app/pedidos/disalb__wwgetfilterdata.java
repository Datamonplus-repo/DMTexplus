package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class disalb__wwgetfilterdata extends GXProcedure
{
   public disalb__wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disalb__wwgetfilterdata.class ), "" );
   }

   public disalb__wwgetfilterdata( int remoteHandle ,
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
      disalb__wwgetfilterdata.this.aP5 = new String[] {""};
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
      disalb__wwgetfilterdata.this.AV30DDOName = aP0;
      disalb__wwgetfilterdata.this.AV31SearchTxt = aP1;
      disalb__wwgetfilterdata.this.AV32SearchTxtTo = aP2;
      disalb__wwgetfilterdata.this.aP3 = aP3;
      disalb__wwgetfilterdata.this.aP4 = aP4;
      disalb__wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV23OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_ALBREF") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_ALBRLOTE") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRLOTEOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV33OptionsJson = AV20Options.toJSonString(false) ;
      AV34OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV23OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue("Pedidos.DisAlb__WWGridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Pedidos.DisAlb__WWGridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV25Session.getValue("Pedidos.DisAlb__WWGridState"), null, null);
      }
      AV38GXV1 = 1 ;
      while ( AV38GXV1 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV38GXV1));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV10TFAlbRecCod = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbRecCod_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV12TFAlbRef = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV13TFAlbRef_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV14TFAlbRReo_SelsJson = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV15TFAlbRReo_Sels.fromJSonString(AV14TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE") == 0 )
         {
            AV16TFAlbRLote = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE_SEL") == 0 )
         {
            AV17TFAlbRLote_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV38GXV1 = (int)(AV38GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBREFOPTIONS' Routine */
      returnInSub = false ;
      AV12TFAlbRef = AV31SearchTxt ;
      AV13TFAlbRef_Sel = "" ;
      AV40Pedidos_disalb__wwds_1_tfalbreccod = AV10TFAlbRecCod ;
      AV41Pedidos_disalb__wwds_2_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV42Pedidos_disalb__wwds_3_tfalbref = AV12TFAlbRef ;
      AV43Pedidos_disalb__wwds_4_tfalbref_sel = AV13TFAlbRef_Sel ;
      AV44Pedidos_disalb__wwds_5_tfalbrreo_sels = AV15TFAlbRReo_Sels ;
      AV45Pedidos_disalb__wwds_6_tfalbrlote = AV16TFAlbRLote ;
      AV46Pedidos_disalb__wwds_7_tfalbrlote_sel = AV17TFAlbRLote_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV44Pedidos_disalb__wwds_5_tfalbrreo_sels ,
                                           Integer.valueOf(AV40Pedidos_disalb__wwds_1_tfalbreccod) ,
                                           Integer.valueOf(AV41Pedidos_disalb__wwds_2_tfalbreccod_to) ,
                                           AV43Pedidos_disalb__wwds_4_tfalbref_sel ,
                                           AV42Pedidos_disalb__wwds_3_tfalbref ,
                                           Integer.valueOf(AV44Pedidos_disalb__wwds_5_tfalbrreo_sels.size()) ,
                                           AV46Pedidos_disalb__wwds_7_tfalbrlote_sel ,
                                           AV45Pedidos_disalb__wwds_6_tfalbrlote ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           A6463AlbRLote } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV42Pedidos_disalb__wwds_3_tfalbref = GXutil.padr( GXutil.rtrim( AV42Pedidos_disalb__wwds_3_tfalbref), 16, "%") ;
      lV45Pedidos_disalb__wwds_6_tfalbrlote = GXutil.padr( GXutil.rtrim( AV45Pedidos_disalb__wwds_6_tfalbrlote), 20, "%") ;
      /* Using cursor P0A2C2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV40Pedidos_disalb__wwds_1_tfalbreccod), Integer.valueOf(AV41Pedidos_disalb__wwds_2_tfalbreccod_to), lV42Pedidos_disalb__wwds_3_tfalbref, AV43Pedidos_disalb__wwds_4_tfalbref_sel, lV45Pedidos_disalb__wwds_6_tfalbrlote, AV46Pedidos_disalb__wwds_7_tfalbrlote_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA2C2 = false ;
         A44AlbRecCod = P0A2C2_A44AlbRecCod[0] ;
         A396EmprCod = P0A2C2_A396EmprCod[0] ;
         A6463AlbRLote = P0A2C2_A6463AlbRLote[0] ;
         A55AlbRReo = P0A2C2_A55AlbRReo[0] ;
         A45AlbRef = P0A2C2_A45AlbRef[0] ;
         A361DisCod = P0A2C2_A361DisCod[0] ;
         A6463AlbRLote = P0A2C2_A6463AlbRLote[0] ;
         A55AlbRReo = P0A2C2_A55AlbRReo[0] ;
         A45AlbRef = P0A2C2_A45AlbRef[0] ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A2C2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0A2C2_A44AlbRecCod[0] == A44AlbRecCod ) )
         {
            brkA2C2 = false ;
            A361DisCod = P0A2C2_A361DisCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brkA2C2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A45AlbRef)==0) )
         {
            AV19Option = A45AlbRef ;
            AV18InsertIndex = 1 ;
            while ( ( AV18InsertIndex <= AV20Options.size() ) && ( GXutil.strcmp((String)AV20Options.elementAt(-1+AV18InsertIndex), AV19Option) < 0 ) )
            {
               AV18InsertIndex = (int)(AV18InsertIndex+1) ;
            }
            AV20Options.add(AV19Option, AV18InsertIndex);
            AV23OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), AV18InsertIndex);
         }
         if ( AV20Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA2C2 )
         {
            brkA2C2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBRLOTEOPTIONS' Routine */
      returnInSub = false ;
      AV16TFAlbRLote = AV31SearchTxt ;
      AV17TFAlbRLote_Sel = "" ;
      AV40Pedidos_disalb__wwds_1_tfalbreccod = AV10TFAlbRecCod ;
      AV41Pedidos_disalb__wwds_2_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV42Pedidos_disalb__wwds_3_tfalbref = AV12TFAlbRef ;
      AV43Pedidos_disalb__wwds_4_tfalbref_sel = AV13TFAlbRef_Sel ;
      AV44Pedidos_disalb__wwds_5_tfalbrreo_sels = AV15TFAlbRReo_Sels ;
      AV45Pedidos_disalb__wwds_6_tfalbrlote = AV16TFAlbRLote ;
      AV46Pedidos_disalb__wwds_7_tfalbrlote_sel = AV17TFAlbRLote_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV44Pedidos_disalb__wwds_5_tfalbrreo_sels ,
                                           Integer.valueOf(AV40Pedidos_disalb__wwds_1_tfalbreccod) ,
                                           Integer.valueOf(AV41Pedidos_disalb__wwds_2_tfalbreccod_to) ,
                                           AV43Pedidos_disalb__wwds_4_tfalbref_sel ,
                                           AV42Pedidos_disalb__wwds_3_tfalbref ,
                                           Integer.valueOf(AV44Pedidos_disalb__wwds_5_tfalbrreo_sels.size()) ,
                                           AV46Pedidos_disalb__wwds_7_tfalbrlote_sel ,
                                           AV45Pedidos_disalb__wwds_6_tfalbrlote ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           A6463AlbRLote } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV42Pedidos_disalb__wwds_3_tfalbref = GXutil.padr( GXutil.rtrim( AV42Pedidos_disalb__wwds_3_tfalbref), 16, "%") ;
      lV45Pedidos_disalb__wwds_6_tfalbrlote = GXutil.padr( GXutil.rtrim( AV45Pedidos_disalb__wwds_6_tfalbrlote), 20, "%") ;
      /* Using cursor P0A2C3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV40Pedidos_disalb__wwds_1_tfalbreccod), Integer.valueOf(AV41Pedidos_disalb__wwds_2_tfalbreccod_to), lV42Pedidos_disalb__wwds_3_tfalbref, AV43Pedidos_disalb__wwds_4_tfalbref_sel, lV45Pedidos_disalb__wwds_6_tfalbrlote, AV46Pedidos_disalb__wwds_7_tfalbrlote_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA2C4 = false ;
         A396EmprCod = P0A2C3_A396EmprCod[0] ;
         A6463AlbRLote = P0A2C3_A6463AlbRLote[0] ;
         A55AlbRReo = P0A2C3_A55AlbRReo[0] ;
         A45AlbRef = P0A2C3_A45AlbRef[0] ;
         A44AlbRecCod = P0A2C3_A44AlbRecCod[0] ;
         A361DisCod = P0A2C3_A361DisCod[0] ;
         A6463AlbRLote = P0A2C3_A6463AlbRLote[0] ;
         A55AlbRReo = P0A2C3_A55AlbRReo[0] ;
         A45AlbRef = P0A2C3_A45AlbRef[0] ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A2C3_A6463AlbRLote[0], A6463AlbRLote) == 0 ) )
         {
            brkA2C4 = false ;
            A396EmprCod = P0A2C3_A396EmprCod[0] ;
            A44AlbRecCod = P0A2C3_A44AlbRecCod[0] ;
            A361DisCod = P0A2C3_A361DisCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brkA2C4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A6463AlbRLote)==0) )
         {
            AV19Option = A6463AlbRLote ;
            AV20Options.add(AV19Option, 0);
            AV23OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV20Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA2C4 )
         {
            brkA2C4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = disalb__wwgetfilterdata.this.AV33OptionsJson;
      this.aP4[0] = disalb__wwgetfilterdata.this.AV34OptionsDescJson;
      this.aP5[0] = disalb__wwgetfilterdata.this.AV35OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33OptionsJson = "" ;
      AV34OptionsDescJson = "" ;
      AV35OptionIndexesJson = "" ;
      AV20Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV23OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25Session = httpContext.getWebSession();
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFAlbRef = "" ;
      AV13TFAlbRef_Sel = "" ;
      AV14TFAlbRReo_SelsJson = "" ;
      AV15TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV16TFAlbRLote = "" ;
      AV17TFAlbRLote_Sel = "" ;
      A45AlbRef = "" ;
      AV42Pedidos_disalb__wwds_3_tfalbref = "" ;
      AV43Pedidos_disalb__wwds_4_tfalbref_sel = "" ;
      AV44Pedidos_disalb__wwds_5_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV45Pedidos_disalb__wwds_6_tfalbrlote = "" ;
      AV46Pedidos_disalb__wwds_7_tfalbrlote_sel = "" ;
      scmdbuf = "" ;
      lV42Pedidos_disalb__wwds_3_tfalbref = "" ;
      lV45Pedidos_disalb__wwds_6_tfalbrlote = "" ;
      A55AlbRReo = "" ;
      A6463AlbRLote = "" ;
      P0A2C2_A44AlbRecCod = new int[1] ;
      P0A2C2_A396EmprCod = new String[] {""} ;
      P0A2C2_A6463AlbRLote = new String[] {""} ;
      P0A2C2_A55AlbRReo = new String[] {""} ;
      P0A2C2_A45AlbRef = new String[] {""} ;
      P0A2C2_A361DisCod = new int[1] ;
      A396EmprCod = "" ;
      AV19Option = "" ;
      P0A2C3_A396EmprCod = new String[] {""} ;
      P0A2C3_A6463AlbRLote = new String[] {""} ;
      P0A2C3_A55AlbRReo = new String[] {""} ;
      P0A2C3_A45AlbRef = new String[] {""} ;
      P0A2C3_A44AlbRecCod = new int[1] ;
      P0A2C3_A361DisCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb__wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A2C2_A44AlbRecCod, P0A2C2_A396EmprCod, P0A2C2_A6463AlbRLote, P0A2C2_A55AlbRReo, P0A2C2_A45AlbRef, P0A2C2_A361DisCod
            }
            , new Object[] {
            P0A2C3_A396EmprCod, P0A2C3_A6463AlbRLote, P0A2C3_A55AlbRReo, P0A2C3_A45AlbRef, P0A2C3_A44AlbRecCod, P0A2C3_A361DisCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV38GXV1 ;
   private int AV10TFAlbRecCod ;
   private int AV11TFAlbRecCod_To ;
   private int AV40Pedidos_disalb__wwds_1_tfalbreccod ;
   private int AV41Pedidos_disalb__wwds_2_tfalbreccod_to ;
   private int AV44Pedidos_disalb__wwds_5_tfalbrreo_sels_size ;
   private int A44AlbRecCod ;
   private int A361DisCod ;
   private int AV18InsertIndex ;
   private long AV24count ;
   private String AV12TFAlbRef ;
   private String AV13TFAlbRef_Sel ;
   private String AV16TFAlbRLote ;
   private String AV17TFAlbRLote_Sel ;
   private String A45AlbRef ;
   private String AV42Pedidos_disalb__wwds_3_tfalbref ;
   private String AV43Pedidos_disalb__wwds_4_tfalbref_sel ;
   private String AV45Pedidos_disalb__wwds_6_tfalbrlote ;
   private String AV46Pedidos_disalb__wwds_7_tfalbrlote_sel ;
   private String scmdbuf ;
   private String lV42Pedidos_disalb__wwds_3_tfalbref ;
   private String lV45Pedidos_disalb__wwds_6_tfalbrlote ;
   private String A55AlbRReo ;
   private String A6463AlbRLote ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkA2C2 ;
   private boolean brkA2C4 ;
   private String AV33OptionsJson ;
   private String AV34OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV14TFAlbRReo_SelsJson ;
   private String AV30DDOName ;
   private String AV31SearchTxt ;
   private String AV32SearchTxtTo ;
   private String AV19Option ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P0A2C2_A44AlbRecCod ;
   private String[] P0A2C2_A396EmprCod ;
   private String[] P0A2C2_A6463AlbRLote ;
   private String[] P0A2C2_A55AlbRReo ;
   private String[] P0A2C2_A45AlbRef ;
   private int[] P0A2C2_A361DisCod ;
   private String[] P0A2C3_A396EmprCod ;
   private String[] P0A2C3_A6463AlbRLote ;
   private String[] P0A2C3_A55AlbRReo ;
   private String[] P0A2C3_A45AlbRef ;
   private int[] P0A2C3_A44AlbRecCod ;
   private int[] P0A2C3_A361DisCod ;
   private GXSimpleCollection<String> AV15TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV44Pedidos_disalb__wwds_5_tfalbrreo_sels ;
   private GXSimpleCollection<String> AV20Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV23OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
}

final  class disalb__wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A2C2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV44Pedidos_disalb__wwds_5_tfalbrreo_sels ,
                                          int AV40Pedidos_disalb__wwds_1_tfalbreccod ,
                                          int AV41Pedidos_disalb__wwds_2_tfalbreccod_to ,
                                          String AV43Pedidos_disalb__wwds_4_tfalbref_sel ,
                                          String AV42Pedidos_disalb__wwds_3_tfalbref ,
                                          int AV44Pedidos_disalb__wwds_5_tfalbrreo_sels_size ,
                                          String AV46Pedidos_disalb__wwds_7_tfalbrlote_sel ,
                                          String AV45Pedidos_disalb__wwds_6_tfalbrlote ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A6463AlbRLote )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.AlbRecCod, T1.EmprCod, T2.AlbRLote, T2.AlbRReo, T2.AlbRef, T1.DisCod FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod" ;
      scmdbuf += " = T1.AlbRecCod)" ;
      if ( ! (0==AV40Pedidos_disalb__wwds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV41Pedidos_disalb__wwds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Pedidos_disalb__wwds_4_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV42Pedidos_disalb__wwds_3_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Pedidos_disalb__wwds_4_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV44Pedidos_disalb__wwds_5_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV44Pedidos_disalb__wwds_5_tfalbrreo_sels, "T2.AlbRReo IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV46Pedidos_disalb__wwds_7_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV45Pedidos_disalb__wwds_6_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Pedidos_disalb__wwds_7_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRecCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A2C3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV44Pedidos_disalb__wwds_5_tfalbrreo_sels ,
                                          int AV40Pedidos_disalb__wwds_1_tfalbreccod ,
                                          int AV41Pedidos_disalb__wwds_2_tfalbreccod_to ,
                                          String AV43Pedidos_disalb__wwds_4_tfalbref_sel ,
                                          String AV42Pedidos_disalb__wwds_3_tfalbref ,
                                          int AV44Pedidos_disalb__wwds_5_tfalbrreo_sels_size ,
                                          String AV46Pedidos_disalb__wwds_7_tfalbrlote_sel ,
                                          String AV45Pedidos_disalb__wwds_6_tfalbrlote ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A6463AlbRLote )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[6];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.AlbRLote, T2.AlbRReo, T2.AlbRef, T1.AlbRecCod, T1.DisCod FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod" ;
      scmdbuf += " = T1.AlbRecCod)" ;
      if ( ! (0==AV40Pedidos_disalb__wwds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (0==AV41Pedidos_disalb__wwds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Pedidos_disalb__wwds_4_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV42Pedidos_disalb__wwds_3_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Pedidos_disalb__wwds_4_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( AV44Pedidos_disalb__wwds_5_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV44Pedidos_disalb__wwds_5_tfalbrreo_sels, "T2.AlbRReo IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV46Pedidos_disalb__wwds_7_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV45Pedidos_disalb__wwds_6_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Pedidos_disalb__wwds_7_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.AlbRLote" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
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
                  return conditional_P0A2C2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] );
            case 1 :
                  return conditional_P0A2C3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A2C2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A2C3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 20);
               }
               return;
      }
   }

}

