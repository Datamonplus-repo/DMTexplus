package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class menvwwexport extends GXProcedure
{
   public menvwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( menvwwexport.class ), "" );
   }

   public menvwwexport( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      menvwwexport.this.aP1 = new String[] {""};
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
      menvwwexport.this.aP0 = aP0;
      menvwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "MEnvWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      menvwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      menvwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV36TFBarCod) && (0==AV37TFBarCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "OS", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         menvwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV36TFBarCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         menvwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV37TFBarCod_To );
      }
      if ( ! ( (0==AV38TFBarCodReo) && (0==AV39TFBarCodReo_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "R", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         menvwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFBarCodReo );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         menvwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFBarCodReo_To );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFBarCodPar_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "P", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         menvwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFBarCodPar_Sel, GXv_char5) ;
         menvwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFBarCodPar)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "P", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            menvwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFBarCodPar, GXv_char5) ;
            menvwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV55TFMEnvOrd) && (0==AV56TFMEnvOrd_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Orden", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         menvwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV55TFMEnvOrd );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         menvwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV56TFMEnvOrd_To );
      }
      if ( ! ( (GXutil.strcmp("", AV58TFFasCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         menvwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFFasCod_Sel, GXv_char5) ;
         menvwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV57TFFasCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            menvwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFFasCod, GXv_char5) ;
            menvwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV59TFMEnvIni) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Inicio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         menvwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV59TFMEnvIni );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV61TFMEnvFin) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fin", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         menvwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV61TFMEnvFin );
      }
      if ( ! ( ( AV64TFMEnvEst_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         menvwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV49i = 1 ;
         AV70GXV1 = 1 ;
         while ( AV70GXV1 <= AV64TFMEnvEst_Sels.size() )
         {
            AV65TFMEnvEst_Sel = ((Number) AV64TFMEnvEst_Sels.elementAt(-1+AV70GXV1)).byteValue() ;
            if ( AV49i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( app.ingenieria.gxdomainestadosenvioparametros.getDescription(httpContext,(byte)AV65TFMEnvEst_Sel), "") );
            AV49i = (long)(AV49i+1) ;
            AV70GXV1 = (int)(AV70GXV1+1) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFMEnvInt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFMEnvInt_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Seg.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         menvwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV66TFMEnvInt)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         menvwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV67TFMEnvInt_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("Ingenieria.MEnvWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("Ingenieria.MEnvWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV71GXV2 = 1 ;
      while ( AV71GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV71GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV71GXV2 = (int)(AV71GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV73Ingenieria_menvwwds_1_filterfulltext = AV18FilterFullText ;
      AV74Ingenieria_menvwwds_2_tfbarcod = AV36TFBarCod ;
      AV75Ingenieria_menvwwds_3_tfbarcod_to = AV37TFBarCod_To ;
      AV76Ingenieria_menvwwds_4_tfbarcodreo = AV38TFBarCodReo ;
      AV77Ingenieria_menvwwds_5_tfbarcodreo_to = AV39TFBarCodReo_To ;
      AV78Ingenieria_menvwwds_6_tfbarcodpar = AV40TFBarCodPar ;
      AV79Ingenieria_menvwwds_7_tfbarcodpar_sel = AV41TFBarCodPar_Sel ;
      AV80Ingenieria_menvwwds_8_tfmenvord = AV55TFMEnvOrd ;
      AV81Ingenieria_menvwwds_9_tfmenvord_to = AV56TFMEnvOrd_To ;
      AV82Ingenieria_menvwwds_10_tffascod = AV57TFFasCod ;
      AV83Ingenieria_menvwwds_11_tffascod_sel = AV58TFFasCod_Sel ;
      AV84Ingenieria_menvwwds_12_tfmenvini = AV59TFMEnvIni ;
      AV85Ingenieria_menvwwds_13_tfmenvfin = AV61TFMEnvFin ;
      AV86Ingenieria_menvwwds_14_tfmenvest_sels = AV64TFMEnvEst_Sels ;
      AV87Ingenieria_menvwwds_15_tfmenvint = AV66TFMEnvInt ;
      AV88Ingenieria_menvwwds_16_tfmenvint_to = AV67TFMEnvInt_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A14156MEnvEst) ,
                                           AV86Ingenieria_menvwwds_14_tfmenvest_sels ,
                                           Integer.valueOf(AV74Ingenieria_menvwwds_2_tfbarcod) ,
                                           Integer.valueOf(AV75Ingenieria_menvwwds_3_tfbarcod_to) ,
                                           Byte.valueOf(AV76Ingenieria_menvwwds_4_tfbarcodreo) ,
                                           Byte.valueOf(AV77Ingenieria_menvwwds_5_tfbarcodreo_to) ,
                                           AV79Ingenieria_menvwwds_7_tfbarcodpar_sel ,
                                           AV78Ingenieria_menvwwds_6_tfbarcodpar ,
                                           Short.valueOf(AV80Ingenieria_menvwwds_8_tfmenvord) ,
                                           Short.valueOf(AV81Ingenieria_menvwwds_9_tfmenvord_to) ,
                                           AV83Ingenieria_menvwwds_11_tffascod_sel ,
                                           AV82Ingenieria_menvwwds_10_tffascod ,
                                           AV84Ingenieria_menvwwds_12_tfmenvini ,
                                           AV85Ingenieria_menvwwds_13_tfmenvfin ,
                                           AV87Ingenieria_menvwwds_15_tfmenvint ,
                                           AV88Ingenieria_menvwwds_16_tfmenvint_to ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A14152MEnvOrd) ,
                                           A457FasCod ,
                                           A14158MEnvIni ,
                                           A14157MEnvFin ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV73Ingenieria_menvwwds_1_filterfulltext ,
                                           A14162MEnvInt ,
                                           Integer.valueOf(AV86Ingenieria_menvwwds_14_tfmenvest_sels.size()) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV78Ingenieria_menvwwds_6_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV78Ingenieria_menvwwds_6_tfbarcodpar), 1, "%") ;
      lV82Ingenieria_menvwwds_10_tffascod = GXutil.padr( GXutil.rtrim( AV82Ingenieria_menvwwds_10_tffascod), 8, "%") ;
      /* Using cursor P0AUR2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV86Ingenieria_menvwwds_14_tfmenvest_sels.size()), Integer.valueOf(AV74Ingenieria_menvwwds_2_tfbarcod), Integer.valueOf(AV75Ingenieria_menvwwds_3_tfbarcod_to), Byte.valueOf(AV76Ingenieria_menvwwds_4_tfbarcodreo), Byte.valueOf(AV77Ingenieria_menvwwds_5_tfbarcodreo_to), lV78Ingenieria_menvwwds_6_tfbarcodpar, AV79Ingenieria_menvwwds_7_tfbarcodpar_sel, Short.valueOf(AV80Ingenieria_menvwwds_8_tfmenvord), Short.valueOf(AV81Ingenieria_menvwwds_9_tfmenvord_to), lV82Ingenieria_menvwwds_10_tffascod, AV83Ingenieria_menvwwds_11_tffascod_sel, AV84Ingenieria_menvwwds_12_tfmenvini, AV85Ingenieria_menvwwds_13_tfmenvfin, AV87Ingenieria_menvwwds_15_tfmenvint, AV88Ingenieria_menvwwds_16_tfmenvint_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14162MEnvInt = P0AUR2_A14162MEnvInt[0] ;
         A457FasCod = P0AUR2_A457FasCod[0] ;
         A14152MEnvOrd = P0AUR2_A14152MEnvOrd[0] ;
         A130BarCodPar = P0AUR2_A130BarCodPar[0] ;
         A132BarCodReo = P0AUR2_A132BarCodReo[0] ;
         A129BarCod = P0AUR2_A129BarCod[0] ;
         A14156MEnvEst = P0AUR2_A14156MEnvEst[0] ;
         A14157MEnvFin = P0AUR2_A14157MEnvFin[0] ;
         A14158MEnvIni = P0AUR2_A14158MEnvIni[0] ;
         A396EmprCod = P0AUR2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV73Ingenieria_menvwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A129BarCod, 8, 0) , GXutil.padr( "%" + AV73Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A132BarCodReo, 1, 0) , GXutil.padr( "%" + AV73Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A130BarCodPar) , GXutil.padr( "%" + GXutil.upper( AV73Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14152MEnvOrd, 4, 0) , GXutil.padr( "%" + AV73Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV73Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a procesar", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A14156MEnvEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "procesado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV73Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A14156MEnvEst == 2 ) ) || ( GXutil.like( GXutil.str( A14162MEnvInt, 10, 2) , GXutil.padr( "%" + AV73Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
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
            AV31VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A129BarCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A132BarCodReo );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A130BarCodPar, GXv_char5) ;
               menvwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14152MEnvOrd );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A457FasCod, GXv_char5) ;
               menvwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A14158MEnvIni );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A14157MEnvFin );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( app.ingenieria.gxdomainestadosenvioparametros.getDescription(httpContext,(byte)A14156MEnvEst), "") );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14162MEnvInt)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarCod", "", "OS", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarCodReo", "", "R", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarCodPar", "", "P", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MEnvOrd", "", "Orden", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "FasCod", "", "Codigo Fase", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MEnvIni", "", "Inicio", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MEnvFin", "", "Fin", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MEnvEst", "", "Estado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MEnvInt", "", "Seg.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Ingenieria.MEnvWWColumnsSelector", GXv_char5) ;
      menvwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("Ingenieria.MEnvWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Ingenieria.MEnvWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("Ingenieria.MEnvWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV89GXV3 = 1 ;
      while ( AV89GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV89GXV3));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV36TFBarCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFBarCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV38TFBarCodReo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFBarCodReo_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV40TFBarCodPar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV41TFBarCodPar_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVORD") == 0 )
         {
            AV55TFMEnvOrd = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFMEnvOrd_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV57TFFasCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV58TFFasCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVINI") == 0 )
         {
            AV59TFMEnvIni = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVFIN") == 0 )
         {
            AV61TFMEnvFin = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVEST_SEL") == 0 )
         {
            AV63TFMEnvEst_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV64TFMEnvEst_Sels.fromJSonString(AV63TFMEnvEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVINT") == 0 )
         {
            AV66TFMEnvInt = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV67TFMEnvInt_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV89GXV3 = (int)(AV89GXV3+1) ;
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
      this.aP0[0] = menvwwexport.this.AV11Filename;
      this.aP1[0] = menvwwexport.this.AV12ErrorMessage;
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
      AV41TFBarCodPar_Sel = "" ;
      AV40TFBarCodPar = "" ;
      AV58TFFasCod_Sel = "" ;
      AV57TFFasCod = "" ;
      AV59TFMEnvIni = GXutil.resetTime( GXutil.nullDate() );
      AV61TFMEnvFin = GXutil.resetTime( GXutil.nullDate() );
      AV64TFMEnvEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV66TFMEnvInt = DecimalUtil.ZERO ;
      AV67TFMEnvInt_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A130BarCodPar = "" ;
      A457FasCod = "" ;
      A14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      A14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      A14162MEnvInt = DecimalUtil.ZERO ;
      AV73Ingenieria_menvwwds_1_filterfulltext = "" ;
      AV78Ingenieria_menvwwds_6_tfbarcodpar = "" ;
      AV79Ingenieria_menvwwds_7_tfbarcodpar_sel = "" ;
      AV82Ingenieria_menvwwds_10_tffascod = "" ;
      AV83Ingenieria_menvwwds_11_tffascod_sel = "" ;
      AV84Ingenieria_menvwwds_12_tfmenvini = GXutil.resetTime( GXutil.nullDate() );
      AV85Ingenieria_menvwwds_13_tfmenvfin = GXutil.resetTime( GXutil.nullDate() );
      AV86Ingenieria_menvwwds_14_tfmenvest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV87Ingenieria_menvwwds_15_tfmenvint = DecimalUtil.ZERO ;
      AV88Ingenieria_menvwwds_16_tfmenvint_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV73Ingenieria_menvwwds_1_filterfulltext = "" ;
      lV78Ingenieria_menvwwds_6_tfbarcodpar = "" ;
      lV82Ingenieria_menvwwds_10_tffascod = "" ;
      P0AUR2_A14162MEnvInt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUR2_A457FasCod = new String[] {""} ;
      P0AUR2_A14152MEnvOrd = new short[1] ;
      P0AUR2_A130BarCodPar = new String[] {""} ;
      P0AUR2_A132BarCodReo = new byte[1] ;
      P0AUR2_A129BarCod = new int[1] ;
      P0AUR2_A14156MEnvEst = new byte[1] ;
      P0AUR2_A14157MEnvFin = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUR2_A14158MEnvIni = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUR2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV63TFMEnvEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.menvwwexport__default(),
         new Object[] {
             new Object[] {
            P0AUR2_A14162MEnvInt, P0AUR2_A457FasCod, P0AUR2_A14152MEnvOrd, P0AUR2_A130BarCodPar, P0AUR2_A132BarCodReo, P0AUR2_A129BarCod, P0AUR2_A14156MEnvEst, P0AUR2_A14157MEnvFin, P0AUR2_A14158MEnvIni, P0AUR2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV38TFBarCodReo ;
   private byte AV39TFBarCodReo_To ;
   private byte AV65TFMEnvEst_Sel ;
   private byte A132BarCodReo ;
   private byte A14156MEnvEst ;
   private byte AV76Ingenieria_menvwwds_4_tfbarcodreo ;
   private byte AV77Ingenieria_menvwwds_5_tfbarcodreo_to ;
   private short AV55TFMEnvOrd ;
   private short AV56TFMEnvOrd_To ;
   private short GXv_int3[] ;
   private short A14152MEnvOrd ;
   private short AV80Ingenieria_menvwwds_8_tfmenvord ;
   private short AV81Ingenieria_menvwwds_9_tfmenvord_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV36TFBarCod ;
   private int AV37TFBarCod_To ;
   private int AV70GXV1 ;
   private int AV71GXV2 ;
   private int A129BarCod ;
   private int AV74Ingenieria_menvwwds_2_tfbarcod ;
   private int AV75Ingenieria_menvwwds_3_tfbarcod_to ;
   private int AV86Ingenieria_menvwwds_14_tfmenvest_sels_size ;
   private int AV89GXV3 ;
   private long AV49i ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV66TFMEnvInt ;
   private java.math.BigDecimal AV67TFMEnvInt_To ;
   private java.math.BigDecimal A14162MEnvInt ;
   private java.math.BigDecimal AV87Ingenieria_menvwwds_15_tfmenvint ;
   private java.math.BigDecimal AV88Ingenieria_menvwwds_16_tfmenvint_to ;
   private String AV41TFBarCodPar_Sel ;
   private String AV40TFBarCodPar ;
   private String AV58TFFasCod_Sel ;
   private String AV57TFFasCod ;
   private String A130BarCodPar ;
   private String A457FasCod ;
   private String AV78Ingenieria_menvwwds_6_tfbarcodpar ;
   private String AV79Ingenieria_menvwwds_7_tfbarcodpar_sel ;
   private String AV82Ingenieria_menvwwds_10_tffascod ;
   private String AV83Ingenieria_menvwwds_11_tffascod_sel ;
   private String scmdbuf ;
   private String lV78Ingenieria_menvwwds_6_tfbarcodpar ;
   private String lV82Ingenieria_menvwwds_10_tffascod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV59TFMEnvIni ;
   private java.util.Date AV61TFMEnvFin ;
   private java.util.Date A14158MEnvIni ;
   private java.util.Date A14157MEnvFin ;
   private java.util.Date AV84Ingenieria_menvwwds_12_tfmenvini ;
   private java.util.Date AV85Ingenieria_menvwwds_13_tfmenvfin ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV63TFMEnvEst_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV73Ingenieria_menvwwds_1_filterfulltext ;
   private String lV73Ingenieria_menvwwds_1_filterfulltext ;
   private GXSimpleCollection<Byte> AV64TFMEnvEst_Sels ;
   private GXSimpleCollection<Byte> AV86Ingenieria_menvwwds_14_tfmenvest_sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P0AUR2_A14162MEnvInt ;
   private String[] P0AUR2_A457FasCod ;
   private short[] P0AUR2_A14152MEnvOrd ;
   private String[] P0AUR2_A130BarCodPar ;
   private byte[] P0AUR2_A132BarCodReo ;
   private int[] P0AUR2_A129BarCod ;
   private byte[] P0AUR2_A14156MEnvEst ;
   private java.util.Date[] P0AUR2_A14157MEnvFin ;
   private java.util.Date[] P0AUR2_A14158MEnvIni ;
   private String[] P0AUR2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class menvwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AUR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A14156MEnvEst ,
                                          GXSimpleCollection<Byte> AV86Ingenieria_menvwwds_14_tfmenvest_sels ,
                                          int AV74Ingenieria_menvwwds_2_tfbarcod ,
                                          int AV75Ingenieria_menvwwds_3_tfbarcod_to ,
                                          byte AV76Ingenieria_menvwwds_4_tfbarcodreo ,
                                          byte AV77Ingenieria_menvwwds_5_tfbarcodreo_to ,
                                          String AV79Ingenieria_menvwwds_7_tfbarcodpar_sel ,
                                          String AV78Ingenieria_menvwwds_6_tfbarcodpar ,
                                          short AV80Ingenieria_menvwwds_8_tfmenvord ,
                                          short AV81Ingenieria_menvwwds_9_tfmenvord_to ,
                                          String AV83Ingenieria_menvwwds_11_tffascod_sel ,
                                          String AV82Ingenieria_menvwwds_10_tffascod ,
                                          java.util.Date AV84Ingenieria_menvwwds_12_tfmenvini ,
                                          java.util.Date AV85Ingenieria_menvwwds_13_tfmenvfin ,
                                          java.math.BigDecimal AV87Ingenieria_menvwwds_15_tfmenvint ,
                                          java.math.BigDecimal AV88Ingenieria_menvwwds_16_tfmenvint_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A14152MEnvOrd ,
                                          String A457FasCod ,
                                          java.util.Date A14158MEnvIni ,
                                          java.util.Date A14157MEnvFin ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV73Ingenieria_menvwwds_1_filterfulltext ,
                                          java.math.BigDecimal A14162MEnvInt ,
                                          int AV86Ingenieria_menvwwds_14_tfmenvest_sels_size )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[15];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT CASE  WHEN Not (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN FLOOR((MEnvFin - CAST(MEnvIni AS DATE)) * 86400) ELSE 0 END AS MEnvInt, FasCod, MEnvOrd," ;
      scmdbuf += " BarCodPar, BarCodReo, BarCod, CASE  WHEN (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN 1 ELSE 2 END AS MEnvEst, MEnvFin, MEnvIni, EmprCod FROM TXPMEnv" ;
      addWhere(sWhereString, "(? <= 0 or ( "+GXutil.toValueList("oracle7", AV86Ingenieria_menvwwds_14_tfmenvest_sels, "CASE  WHEN (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN 1 ELSE 2 END IN (", ")")+"))");
      if ( ! (0==AV74Ingenieria_menvwwds_2_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (0==AV75Ingenieria_menvwwds_3_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV76Ingenieria_menvwwds_4_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV77Ingenieria_menvwwds_5_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Ingenieria_menvwwds_7_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV78Ingenieria_menvwwds_6_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Ingenieria_menvwwds_7_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV80Ingenieria_menvwwds_8_tfmenvord) )
      {
         addWhere(sWhereString, "(MEnvOrd >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV81Ingenieria_menvwwds_9_tfmenvord_to) )
      {
         addWhere(sWhereString, "(MEnvOrd <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Ingenieria_menvwwds_11_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV82Ingenieria_menvwwds_10_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Ingenieria_menvwwds_11_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(FasCod = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV84Ingenieria_menvwwds_12_tfmenvini) )
      {
         addWhere(sWhereString, "(MEnvIni >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV85Ingenieria_menvwwds_13_tfmenvfin) )
      {
         addWhere(sWhereString, "(MEnvFin >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Ingenieria_menvwwds_15_tfmenvint)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN FLOOR((MEnvFin - CAST(MEnvIni AS DATE)) * 86400) ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Ingenieria_menvwwds_16_tfmenvint_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN FLOOR((MEnvFin - CAST(MEnvIni AS DATE)) * 86400) ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY BarCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY BarCodReo" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarCodReo DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY BarCodPar" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarCodPar DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MEnvOrd" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MEnvOrd DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY FasCod" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY FasCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MEnvIni" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MEnvIni DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MEnvFin" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MEnvFin DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P0AUR2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Boolean) dynConstraints[24]).booleanValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AUR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9, true);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[26], false, true);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               return;
      }
   }

}

