package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwcwuti118_recetasexport extends GXProcedure
{
   public wcwcwuti118_recetasexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwcwuti118_recetasexport.class ), "" );
   }

   public wcwcwuti118_recetasexport( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcwcwuti118_recetasexport.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      wcwcwuti118_recetasexport.this.aP0 = aP0;
      wcwcwuti118_recetasexport.this.aP1 = aP1;
      initialize();
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
      AV13CellRow = 1 ;
      AV14FirstColumn = 1 ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEFILTERS' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S191 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "WCWCWUti118_RecetasExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITEFILTERS' Routine */
      returnInSub = false ;
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      wcwcwuti118_recetasexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      wcwcwuti118_recetasexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFHrePrdCant)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFHrePrdCant_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cantidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwcwuti118_recetasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46TFHrePrdCant)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwcwuti118_recetasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFHrePrdCant_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV49TFHrePrdUDs_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwcwuti118_recetasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFHrePrdUDs_Sel, GXv_char5) ;
         wcwcwuti118_recetasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFHrePrdUDs)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwcwuti118_recetasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFHrePrdUDs, GXv_char5) ;
            wcwcwuti118_recetasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV51TFHreLote_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwcwuti118_recetasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFHreLote_Sel, GXv_char5) ;
         wcwcwuti118_recetasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFHreLote)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwcwuti118_recetasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFHreLote, GXv_char5) ;
            wcwcwuti118_recetasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV32VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("WCWCWUti118_RecetasColumnsSelector"), "") != 0 )
      {
         AV27ColumnsSelectorXML = AV19Session.getValue("WCWCWUti118_RecetasColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV27ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV54GXV1 = 1 ;
      while ( AV54GXV1 <= AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV26ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV54GXV1));
         if ( AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setColor( 11 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         AV54GXV1 = (int)(AV54GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV56Wcwcwuti118_recetasds_1_filterfulltext = AV18FilterFullText ;
      AV57Wcwcwuti118_recetasds_2_tfhreprdcant = AV46TFHrePrdCant ;
      AV58Wcwcwuti118_recetasds_3_tfhreprdcant_to = AV47TFHrePrdCant_To ;
      AV59Wcwcwuti118_recetasds_4_tfhreprduds = AV48TFHrePrdUDs ;
      AV60Wcwcwuti118_recetasds_5_tfhreprduds_sel = AV49TFHrePrdUDs_Sel ;
      AV61Wcwcwuti118_recetasds_6_tfhrelote = AV50TFHreLote ;
      AV62Wcwcwuti118_recetasds_7_tfhrelote_sel = AV51TFHreLote_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV56Wcwcwuti118_recetasds_1_filterfulltext ,
                                           AV57Wcwcwuti118_recetasds_2_tfhreprdcant ,
                                           AV58Wcwcwuti118_recetasds_3_tfhreprdcant_to ,
                                           AV60Wcwcwuti118_recetasds_5_tfhreprduds_sel ,
                                           AV59Wcwcwuti118_recetasds_4_tfhreprduds ,
                                           AV62Wcwcwuti118_recetasds_7_tfhrelote_sel ,
                                           AV61Wcwcwuti118_recetasds_6_tfhrelote ,
                                           A4563HrePrdCant ,
                                           A4561HrePrdUDs ,
                                           A5726HreLote ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV40HreLote ,
                                           A12453HreFecAct ,
                                           AV41Fec1 ,
                                           AV42Fec2 ,
                                           AV38Emprcod ,
                                           AV39Prdnum ,
                                           A396EmprCod ,
                                           A719PrdNum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV56Wcwcwuti118_recetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Wcwcwuti118_recetasds_1_filterfulltext), "%", "") ;
      lV56Wcwcwuti118_recetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Wcwcwuti118_recetasds_1_filterfulltext), "%", "") ;
      lV56Wcwcwuti118_recetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Wcwcwuti118_recetasds_1_filterfulltext), "%", "") ;
      lV59Wcwcwuti118_recetasds_4_tfhreprduds = GXutil.padr( GXutil.rtrim( AV59Wcwcwuti118_recetasds_4_tfhreprduds), 5, "%") ;
      lV61Wcwcwuti118_recetasds_6_tfhrelote = GXutil.padr( GXutil.rtrim( AV61Wcwcwuti118_recetasds_6_tfhrelote), 26, "%") ;
      /* Using cursor P08X62 */
      pr_default.execute(0, new Object[] {AV38Emprcod, AV39Prdnum, AV41Fec1, AV42Fec2, lV56Wcwcwuti118_recetasds_1_filterfulltext, lV56Wcwcwuti118_recetasds_1_filterfulltext, lV56Wcwcwuti118_recetasds_1_filterfulltext, AV57Wcwcwuti118_recetasds_2_tfhreprdcant, AV58Wcwcwuti118_recetasds_3_tfhreprdcant_to, lV59Wcwcwuti118_recetasds_4_tfhreprduds, AV60Wcwcwuti118_recetasds_5_tfhreprduds_sel, lV61Wcwcwuti118_recetasds_6_tfhrelote, AV62Wcwcwuti118_recetasds_7_tfhrelote_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12453HreFecAct = P08X62_A12453HreFecAct[0] ;
         n12453HreFecAct = P08X62_n12453HreFecAct[0] ;
         A719PrdNum = P08X62_A719PrdNum[0] ;
         n719PrdNum = P08X62_n719PrdNum[0] ;
         A396EmprCod = P08X62_A396EmprCod[0] ;
         A5726HreLote = P08X62_A5726HreLote[0] ;
         n5726HreLote = P08X62_n5726HreLote[0] ;
         A4561HrePrdUDs = P08X62_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P08X62_n4561HrePrdUDs[0] ;
         A4563HrePrdCant = P08X62_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P08X62_n4563HrePrdCant[0] ;
         A4494HreBarPar = P08X62_A4494HreBarPar[0] ;
         A4493HreBarReo = P08X62_A4493HreBarReo[0] ;
         A4492HreBarCod = P08X62_A4492HreBarCod[0] ;
         A11707HreProv = P08X62_A11707HreProv[0] ;
         n11707HreProv = P08X62_n11707HreProv[0] ;
         A4558HrePrdNum = P08X62_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P08X62_n4558HrePrdNum[0] ;
         A4495HreNumCie = P08X62_A4495HreNumCie[0] ;
         A4545HreLinMaq = P08X62_A4545HreLinMaq[0] ;
         A4550HreLinPro = P08X62_A4550HreLinPro[0] ;
         A4557HreRecLin = P08X62_A4557HreRecLin[0] ;
         if ( ( ( GXutil.strcmp(A5726HreLote, AV40HreLote) == 0 ) && ( GXutil.strcmp(AV40HreLote, httpContext.getMessage( "S/N", "")) != 0 ) ) || ( (GXutil.strcmp("", A5726HreLote)==0) && ( GXutil.strcmp(AV40HreLote, httpContext.getMessage( "S/N", "")) == 0 ) ) )
         {
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV32VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV23BarNHdr = GXutil.str( A4492HreBarCod, 8, 0) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV23BarNHdr, GXv_char5) ;
               wcwcwuti118_recetasexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4563HrePrdCant)) );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4561HrePrdUDs, GXv_char5) ;
               wcwcwuti118_recetasexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXv_char5[0] = A396EmprCod ;
               GXv_int6[0] = A11707HreProv ;
               GXv_char7[0] = AV45PrvNom ;
               new app.pprvnom(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_char7) ;
               wcwcwuti118_recetasexport.this.A396EmprCod = GXv_char5[0] ;
               wcwcwuti118_recetasexport.this.A11707HreProv = GXv_int6[0] ;
               wcwcwuti118_recetasexport.this.AV45PrvNom = GXv_char7[0] ;
               GXt_char4 = "" ;
               GXv_char7[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45PrvNom, GXv_char7) ;
               wcwcwuti118_recetasexport.this.GXt_char4 = GXv_char7[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char7[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5726HreLote, GXv_char7) ;
               wcwcwuti118_recetasexport.this.GXt_char4 = GXv_char7[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S182 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S191( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10ExcelDocument.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10ExcelDocument.getErrDescription() ;
         AV10ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S151( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&BarNHdr", "", "N Hdr", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HrePrdCant", "", "Cantidad", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HrePrdUDs", "", "Und", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&PrvNom", "", "Proveedor", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreLote", "", "Lote", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char4 = AV28UserCustomValue ;
      GXv_char7[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWCWUti118_RecetasColumnsSelector", GXv_char7) ;
      wcwcwuti118_recetasexport.this.GXt_char4 = GXv_char7[0] ;
      AV28UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV28UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV28UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WCWCWUti118_RecetasGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWCWUti118_RecetasGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("WCWCWUti118_RecetasGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV63GXV2 = 1 ;
      while ( AV63GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV63GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCANT") == 0 )
         {
            AV46TFHrePrdCant = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFHrePrdCant_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS") == 0 )
         {
            AV48TFHrePrdUDs = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS_SEL") == 0 )
         {
            AV49TFHrePrdUDs_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELOTE") == 0 )
         {
            AV50TFHreLote = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELOTE_SEL") == 0 )
         {
            AV51TFHreLote_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV38Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV39Prdnum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELOTE") == 0 )
         {
            AV40HreLote = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC1") == 0 )
         {
            AV41Fec1 = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC2") == 0 )
         {
            AV42Fec2 = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV63GXV2 = (int)(AV63GXV2+1) ;
      }
   }

   public void S172( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S182( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = wcwcwuti118_recetasexport.this.AV11Filename;
      this.aP1[0] = wcwcwuti118_recetasexport.this.AV12ErrorMessage;
      CloseOpenCursors();
      AV10ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Filename = "" ;
      AV12ErrorMessage = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV18FilterFullText = "" ;
      AV46TFHrePrdCant = DecimalUtil.ZERO ;
      AV47TFHrePrdCant_To = DecimalUtil.ZERO ;
      AV49TFHrePrdUDs_Sel = "" ;
      AV48TFHrePrdUDs = "" ;
      AV51TFHreLote_Sel = "" ;
      AV50TFHreLote = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV27ColumnsSelectorXML = "" ;
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A4494HreBarPar = "" ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4561HrePrdUDs = "" ;
      A396EmprCod = "" ;
      A5726HreLote = "" ;
      AV56Wcwcwuti118_recetasds_1_filterfulltext = "" ;
      AV57Wcwcwuti118_recetasds_2_tfhreprdcant = DecimalUtil.ZERO ;
      AV58Wcwcwuti118_recetasds_3_tfhreprdcant_to = DecimalUtil.ZERO ;
      AV59Wcwcwuti118_recetasds_4_tfhreprduds = "" ;
      AV60Wcwcwuti118_recetasds_5_tfhreprduds_sel = "" ;
      AV61Wcwcwuti118_recetasds_6_tfhrelote = "" ;
      AV62Wcwcwuti118_recetasds_7_tfhrelote_sel = "" ;
      scmdbuf = "" ;
      lV56Wcwcwuti118_recetasds_1_filterfulltext = "" ;
      lV59Wcwcwuti118_recetasds_4_tfhreprduds = "" ;
      lV61Wcwcwuti118_recetasds_6_tfhrelote = "" ;
      AV40HreLote = "" ;
      A12453HreFecAct = GXutil.nullDate() ;
      AV41Fec1 = GXutil.nullDate() ;
      AV42Fec2 = GXutil.nullDate() ;
      AV38Emprcod = "" ;
      AV39Prdnum = "" ;
      A719PrdNum = "" ;
      P08X62_A12453HreFecAct = new java.util.Date[] {GXutil.nullDate()} ;
      P08X62_n12453HreFecAct = new boolean[] {false} ;
      P08X62_A719PrdNum = new String[] {""} ;
      P08X62_n719PrdNum = new boolean[] {false} ;
      P08X62_A396EmprCod = new String[] {""} ;
      P08X62_A5726HreLote = new String[] {""} ;
      P08X62_n5726HreLote = new boolean[] {false} ;
      P08X62_A4561HrePrdUDs = new String[] {""} ;
      P08X62_n4561HrePrdUDs = new boolean[] {false} ;
      P08X62_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08X62_n4563HrePrdCant = new boolean[] {false} ;
      P08X62_A4494HreBarPar = new String[] {""} ;
      P08X62_A4493HreBarReo = new byte[1] ;
      P08X62_A4492HreBarCod = new int[1] ;
      P08X62_A11707HreProv = new int[1] ;
      P08X62_n11707HreProv = new boolean[] {false} ;
      P08X62_A4558HrePrdNum = new String[] {""} ;
      P08X62_n4558HrePrdNum = new boolean[] {false} ;
      P08X62_A4495HreNumCie = new byte[1] ;
      P08X62_A4545HreLinMaq = new short[1] ;
      P08X62_A4550HreLinPro = new byte[1] ;
      P08X62_A4557HreRecLin = new short[1] ;
      A4558HrePrdNum = "" ;
      AV23BarNHdr = "" ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      AV45PrvNom = "" ;
      AV28UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char7 = new String[1] ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwcwuti118_recetasexport__default(),
         new Object[] {
             new Object[] {
            P08X62_A12453HreFecAct, P08X62_n12453HreFecAct, P08X62_A719PrdNum, P08X62_n719PrdNum, P08X62_A396EmprCod, P08X62_A5726HreLote, P08X62_n5726HreLote, P08X62_A4561HrePrdUDs, P08X62_n4561HrePrdUDs, P08X62_A4563HrePrdCant,
            P08X62_n4563HrePrdCant, P08X62_A4494HreBarPar, P08X62_A4493HreBarReo, P08X62_A4492HreBarCod, P08X62_A11707HreProv, P08X62_n11707HreProv, P08X62_A4558HrePrdNum, P08X62_n4558HrePrdNum, P08X62_A4495HreNumCie, P08X62_A4545HreLinMaq,
            P08X62_A4550HreLinPro, P08X62_A4557HreRecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV54GXV1 ;
   private int A4492HreBarCod ;
   private int A11707HreProv ;
   private int GXv_int6[] ;
   private int AV63GXV2 ;
   private long AV32VisibleColumnCount ;
   private java.math.BigDecimal AV46TFHrePrdCant ;
   private java.math.BigDecimal AV47TFHrePrdCant_To ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal AV57Wcwcwuti118_recetasds_2_tfhreprdcant ;
   private java.math.BigDecimal AV58Wcwcwuti118_recetasds_3_tfhreprdcant_to ;
   private String AV49TFHrePrdUDs_Sel ;
   private String AV48TFHrePrdUDs ;
   private String AV51TFHreLote_Sel ;
   private String AV50TFHreLote ;
   private String A4494HreBarPar ;
   private String A4561HrePrdUDs ;
   private String A396EmprCod ;
   private String A5726HreLote ;
   private String AV59Wcwcwuti118_recetasds_4_tfhreprduds ;
   private String AV60Wcwcwuti118_recetasds_5_tfhreprduds_sel ;
   private String AV61Wcwcwuti118_recetasds_6_tfhrelote ;
   private String AV62Wcwcwuti118_recetasds_7_tfhrelote_sel ;
   private String scmdbuf ;
   private String lV59Wcwcwuti118_recetasds_4_tfhreprduds ;
   private String lV61Wcwcwuti118_recetasds_6_tfhrelote ;
   private String AV40HreLote ;
   private String AV38Emprcod ;
   private String AV39Prdnum ;
   private String A719PrdNum ;
   private String A4558HrePrdNum ;
   private String AV23BarNHdr ;
   private String GXv_char5[] ;
   private String AV45PrvNom ;
   private String GXt_char4 ;
   private String GXv_char7[] ;
   private java.util.Date A12453HreFecAct ;
   private java.util.Date AV41Fec1 ;
   private java.util.Date AV42Fec2 ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n12453HreFecAct ;
   private boolean n719PrdNum ;
   private boolean n5726HreLote ;
   private boolean n4561HrePrdUDs ;
   private boolean n4563HrePrdCant ;
   private boolean n11707HreProv ;
   private boolean n4558HrePrdNum ;
   private String AV27ColumnsSelectorXML ;
   private String AV28UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV56Wcwcwuti118_recetasds_1_filterfulltext ;
   private String lV56Wcwcwuti118_recetasds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P08X62_A12453HreFecAct ;
   private boolean[] P08X62_n12453HreFecAct ;
   private String[] P08X62_A719PrdNum ;
   private boolean[] P08X62_n719PrdNum ;
   private String[] P08X62_A396EmprCod ;
   private String[] P08X62_A5726HreLote ;
   private boolean[] P08X62_n5726HreLote ;
   private String[] P08X62_A4561HrePrdUDs ;
   private boolean[] P08X62_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P08X62_A4563HrePrdCant ;
   private boolean[] P08X62_n4563HrePrdCant ;
   private String[] P08X62_A4494HreBarPar ;
   private byte[] P08X62_A4493HreBarReo ;
   private int[] P08X62_A4492HreBarCod ;
   private int[] P08X62_A11707HreProv ;
   private boolean[] P08X62_n11707HreProv ;
   private String[] P08X62_A4558HrePrdNum ;
   private boolean[] P08X62_n4558HrePrdNum ;
   private byte[] P08X62_A4495HreNumCie ;
   private short[] P08X62_A4545HreLinMaq ;
   private byte[] P08X62_A4550HreLinPro ;
   private short[] P08X62_A4557HreRecLin ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV26ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class wcwcwuti118_recetasexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08X62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Wcwcwuti118_recetasds_1_filterfulltext ,
                                          java.math.BigDecimal AV57Wcwcwuti118_recetasds_2_tfhreprdcant ,
                                          java.math.BigDecimal AV58Wcwcwuti118_recetasds_3_tfhreprdcant_to ,
                                          String AV60Wcwcwuti118_recetasds_5_tfhreprduds_sel ,
                                          String AV59Wcwcwuti118_recetasds_4_tfhreprduds ,
                                          String AV62Wcwcwuti118_recetasds_7_tfhrelote_sel ,
                                          String AV61Wcwcwuti118_recetasds_6_tfhrelote ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          String A4561HrePrdUDs ,
                                          String A5726HreLote ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV40HreLote ,
                                          java.util.Date A12453HreFecAct ,
                                          java.util.Date AV41Fec1 ,
                                          java.util.Date AV42Fec2 ,
                                          String AV38Emprcod ,
                                          String AV39Prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[13];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT HreFecAct, PrdNum, EmprCod, HreLote, HrePrdUDs, HrePrdCant, HreBarPar, HreBarReo, HreBarCod, HreProv, HrePrdNum, HreNumCie, HreLinMaq, HreLinPro, HreRecLin" ;
      scmdbuf += " FROM TXPHISLRE" ;
      addWhere(sWhereString, "(EmprCod = ? and PrdNum = ?)");
      addWhere(sWhereString, "(HreFecAct >= ?)");
      addWhere(sWhereString, "(HreFecAct <= ?)");
      if ( ! (GXutil.strcmp("", AV56Wcwcwuti118_recetasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(HrePrdCant,'9999990.999'), 2) like '%' || ?) or ( UPPER(HrePrdUDs) like '%' || UPPER(?)) or ( UPPER(HreLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Wcwcwuti118_recetasds_2_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant >= ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Wcwcwuti118_recetasds_3_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant <= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcwcwuti118_recetasds_5_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcwcwuti118_recetasds_4_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcwcwuti118_recetasds_5_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdUDs = ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Wcwcwuti118_recetasds_7_tfhrelote_sel)==0) && ( ! (GXutil.strcmp("", AV61Wcwcwuti118_recetasds_6_tfhrelote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Wcwcwuti118_recetasds_7_tfhrelote_sel)==0) )
      {
         addWhere(sWhereString, "(HreLote = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY HrePrdNum" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdCant" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrePrdCant DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdUDs" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrePrdUDs DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY HreLote" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreLote DESC" ;
      }
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P08X62(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.math.BigDecimal)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08X62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((String[]) buf[5])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(12);
               ((short[]) buf[19])[0] = rslt.getShort(13);
               ((byte[]) buf[20])[0] = rslt.getByte(14);
               ((short[]) buf[21])[0] = rslt.getShort(15);
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
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               return;
      }
   }

}

