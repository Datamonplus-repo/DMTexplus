package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class historicoderecetas_procesosquimicos_wcexport extends GXProcedure
{
   public historicoderecetas_procesosquimicos_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( historicoderecetas_procesosquimicos_wcexport.class ), "" );
   }

   public historicoderecetas_procesosquimicos_wcexport( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      historicoderecetas_procesosquimicos_wcexport.this.aP1 = new String[] {""};
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
      historicoderecetas_procesosquimicos_wcexport.this.aP0 = aP0;
      historicoderecetas_procesosquimicos_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "HistoricodeRecetas_ProcesosQuimicos_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      historicoderecetas_procesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV24FilterFullText, GXv_char5) ;
      historicoderecetas_procesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV40TFHreLinPro) && (0==AV41TFHreLinPro_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         historicoderecetas_procesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFHreLinPro );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         historicoderecetas_procesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFHreLinPro_To );
      }
      if ( ! ( (GXutil.strcmp("", AV43TFHreProCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Proceso", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         historicoderecetas_procesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFHreProCod_Sel, GXv_char5) ;
         historicoderecetas_procesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFHreProCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Proceso", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            historicoderecetas_procesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFHreProCod, GXv_char5) ;
            historicoderecetas_procesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFHreProDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Proceso", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         historicoderecetas_procesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFHreProDsc_Sel, GXv_char5) ;
         historicoderecetas_procesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFHreProDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Proceso", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            historicoderecetas_procesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFHreProDsc, GXv_char5) ;
            historicoderecetas_procesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV46TFHreProTie) && (0==AV47TFHreProTie_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tiempo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         historicoderecetas_procesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV46TFHreProTie );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         historicoderecetas_procesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV47TFHreProTie_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV37VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV25Session.getValue("HistoricodeRecetas_ProcesosQuimicos_WCColumnsSelector"), "") != 0 )
      {
         AV32ColumnsSelectorXML = AV25Session.getValue("HistoricodeRecetas_ProcesosQuimicos_WCColumnsSelector") ;
         AV29ColumnsSelector.fromxml(AV32ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV31ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV52GXV1));
         if ( AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setColor( 11 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = AV24FilterFullText ;
      AV55Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro = AV40TFHreLinPro ;
      AV56Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to = AV41TFHreLinPro_To ;
      AV57Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod = AV42TFHreProCod ;
      AV58Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel = AV43TFHreProCod_Sel ;
      AV59Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc = AV44TFHreProDsc ;
      AV60Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel = AV45TFHreProDsc_Sel ;
      AV61Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie = AV46TFHreProTie ;
      AV62Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to = AV47TFHreProTie_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext ,
                                           Byte.valueOf(AV55Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro) ,
                                           Byte.valueOf(AV56Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to) ,
                                           AV58Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel ,
                                           AV57Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod ,
                                           AV60Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel ,
                                           AV59Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc ,
                                           Short.valueOf(AV61Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie) ,
                                           Short.valueOf(AV62Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to) ,
                                           Byte.valueOf(A4550HreLinPro) ,
                                           A4551HreProCod ,
                                           A4552HreProDsc ,
                                           Short.valueOf(A4553HreProTie) ,
                                           Short.valueOf(AV22OrderedBy) ,
                                           Boolean.valueOf(AV23OrderedDsc) ,
                                           AV16EmprCod ,
                                           Integer.valueOf(AV17HreBarCod) ,
                                           Byte.valueOf(AV18HreBarReo) ,
                                           AV19HreBarPar ,
                                           Byte.valueOf(AV20HreNumCie) ,
                                           Short.valueOf(AV21HreLinMaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT
                                           }
      });
      lV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV57Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod = GXutil.padr( GXutil.rtrim( AV57Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod), 6, "%") ;
      lV59Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc = GXutil.padr( GXutil.rtrim( AV59Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc), 30, "%") ;
      /* Using cursor P09A12 */
      pr_default.execute(0, new Object[] {AV16EmprCod, Integer.valueOf(AV17HreBarCod), Byte.valueOf(AV18HreBarReo), AV19HreBarPar, Byte.valueOf(AV20HreNumCie), Short.valueOf(AV21HreLinMaq), lV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext, lV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext, lV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext, lV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext, Byte.valueOf(AV55Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro), Byte.valueOf(AV56Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to), lV57Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod, AV58Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel, lV59Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc, AV60Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel, Short.valueOf(AV61Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie), Short.valueOf(AV62Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4545HreLinMaq = P09A12_A4545HreLinMaq[0] ;
         A4495HreNumCie = P09A12_A4495HreNumCie[0] ;
         A4494HreBarPar = P09A12_A4494HreBarPar[0] ;
         A4493HreBarReo = P09A12_A4493HreBarReo[0] ;
         A4492HreBarCod = P09A12_A4492HreBarCod[0] ;
         A396EmprCod = P09A12_A396EmprCod[0] ;
         A4553HreProTie = P09A12_A4553HreProTie[0] ;
         A4552HreProDsc = P09A12_A4552HreProDsc[0] ;
         A4551HreProCod = P09A12_A4551HreProCod[0] ;
         A4550HreLinPro = P09A12_A4550HreLinPro[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV37VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( A4550HreLinPro );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4551HreProCod, GXv_char5) ;
            historicoderecetas_procesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4552HreProDsc, GXv_char5) ;
            historicoderecetas_procesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( A4553HreProTie );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
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
      AV29ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HreLinPro", "", "#", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HreProCod", "", "Codigo Proceso", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HreProDsc", "", "Descripcion Proceso", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HreProTie", "", "Tiempo", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV33UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "HistoricodeRecetas_ProcesosQuimicos_WCColumnsSelector", GXv_char5) ;
      historicoderecetas_procesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV33UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV33UserCustomValue)==0) ) )
      {
         AV30ColumnsSelectorAux.fromxml(AV33UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV30ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV29ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV30ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV29ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue("HistoricodeRecetas_ProcesosQuimicos_WCGridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "HistoricodeRecetas_ProcesosQuimicos_WCGridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV25Session.getValue("HistoricodeRecetas_ProcesosQuimicos_WCGridState"), null, null);
      }
      AV22OrderedBy = AV27GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV23OrderedDsc = AV27GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV63GXV2 = 1 ;
      while ( AV63GXV2 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV63GXV2));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV24FilterFullText = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINPRO") == 0 )
         {
            AV40TFHreLinPro = (byte)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFHreLinPro_To = (byte)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPROCOD") == 0 )
         {
            AV42TFHreProCod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPROCOD_SEL") == 0 )
         {
            AV43TFHreProCod_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRODSC") == 0 )
         {
            AV44TFHreProDsc = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRODSC_SEL") == 0 )
         {
            AV45TFHreProDsc_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPROTIE") == 0 )
         {
            AV46TFHreProTie = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFHreProTie_To = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16EmprCod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV17HreBarCod = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV18HreBarReo = (byte)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV19HreBarPar = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV20HreNumCie = (byte)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINMAQ") == 0 )
         {
            AV21HreLinMaq = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
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
      this.aP0[0] = historicoderecetas_procesosquimicos_wcexport.this.AV11Filename;
      this.aP1[0] = historicoderecetas_procesosquimicos_wcexport.this.AV12ErrorMessage;
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
      AV24FilterFullText = "" ;
      AV43TFHreProCod_Sel = "" ;
      AV42TFHreProCod = "" ;
      AV45TFHreProDsc_Sel = "" ;
      AV44TFHreProDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV25Session = httpContext.getWebSession();
      AV32ColumnsSelectorXML = "" ;
      AV29ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV31ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      AV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = "" ;
      AV57Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod = "" ;
      AV58Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel = "" ;
      AV59Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc = "" ;
      AV60Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel = "" ;
      scmdbuf = "" ;
      lV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext = "" ;
      lV57Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod = "" ;
      lV59Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc = "" ;
      AV16EmprCod = "" ;
      AV19HreBarPar = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P09A12_A4545HreLinMaq = new short[1] ;
      P09A12_A4495HreNumCie = new byte[1] ;
      P09A12_A4494HreBarPar = new String[] {""} ;
      P09A12_A4493HreBarReo = new byte[1] ;
      P09A12_A4492HreBarCod = new int[1] ;
      P09A12_A396EmprCod = new String[] {""} ;
      P09A12_A4553HreProTie = new short[1] ;
      P09A12_A4552HreProDsc = new String[] {""} ;
      P09A12_A4551HreProCod = new String[] {""} ;
      P09A12_A4550HreLinPro = new byte[1] ;
      AV33UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV30ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.historicoderecetas_procesosquimicos_wcexport__default(),
         new Object[] {
             new Object[] {
            P09A12_A4545HreLinMaq, P09A12_A4495HreNumCie, P09A12_A4494HreBarPar, P09A12_A4493HreBarReo, P09A12_A4492HreBarCod, P09A12_A396EmprCod, P09A12_A4553HreProTie, P09A12_A4552HreProDsc, P09A12_A4551HreProCod, P09A12_A4550HreLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV40TFHreLinPro ;
   private byte AV41TFHreLinPro_To ;
   private byte A4550HreLinPro ;
   private byte AV55Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro ;
   private byte AV56Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to ;
   private byte AV18HreBarReo ;
   private byte AV20HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private short AV46TFHreProTie ;
   private short AV47TFHreProTie_To ;
   private short GXv_int3[] ;
   private short A4553HreProTie ;
   private short AV61Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie ;
   private short AV62Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to ;
   private short AV22OrderedBy ;
   private short AV21HreLinMaq ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV52GXV1 ;
   private int AV17HreBarCod ;
   private int A4492HreBarCod ;
   private int AV63GXV2 ;
   private long AV37VisibleColumnCount ;
   private String AV43TFHreProCod_Sel ;
   private String AV42TFHreProCod ;
   private String AV45TFHreProDsc_Sel ;
   private String AV44TFHreProDsc ;
   private String A4551HreProCod ;
   private String A4552HreProDsc ;
   private String AV57Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod ;
   private String AV58Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel ;
   private String AV59Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc ;
   private String AV60Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel ;
   private String scmdbuf ;
   private String lV57Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod ;
   private String lV59Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc ;
   private String AV16EmprCod ;
   private String AV19HreBarPar ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV23OrderedDsc ;
   private String AV32ColumnsSelectorXML ;
   private String AV33UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV24FilterFullText ;
   private String AV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext ;
   private String lV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P09A12_A4545HreLinMaq ;
   private byte[] P09A12_A4495HreNumCie ;
   private String[] P09A12_A4494HreBarPar ;
   private byte[] P09A12_A4493HreBarReo ;
   private int[] P09A12_A4492HreBarCod ;
   private String[] P09A12_A396EmprCod ;
   private short[] P09A12_A4553HreProTie ;
   private String[] P09A12_A4552HreProDsc ;
   private String[] P09A12_A4551HreProCod ;
   private byte[] P09A12_A4550HreLinPro ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV29ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV30ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV31ColumnsSelector_Column ;
}

final  class historicoderecetas_procesosquimicos_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09A12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext ,
                                          byte AV55Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro ,
                                          byte AV56Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to ,
                                          String AV58Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel ,
                                          String AV57Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod ,
                                          String AV60Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel ,
                                          String AV59Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc ,
                                          short AV61Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie ,
                                          short AV62Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to ,
                                          byte A4550HreLinPro ,
                                          String A4551HreProCod ,
                                          String A4552HreProDsc ,
                                          short A4553HreProTie ,
                                          short AV22OrderedBy ,
                                          boolean AV23OrderedDsc ,
                                          String AV16EmprCod ,
                                          int AV17HreBarCod ,
                                          byte AV18HreBarReo ,
                                          String AV19HreBarPar ,
                                          byte AV20HreNumCie ,
                                          short AV21HreLinMaq ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[18];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT HreLinMaq, HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreProTie, HreProDsc, HreProCod, HreLinPro FROM TXPHISREC" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV54Historicoderecetas_procesosquimicos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(HreLinPro,'90'), 2) like '%' || ?) or ( UPPER(HreProCod) like '%' || UPPER(?)) or ( UPPER(HreProDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreProTie,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV55Historicoderecetas_procesosquimicos_wcds_2_tfhrelinpro) )
      {
         addWhere(sWhereString, "(HreLinPro >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV56Historicoderecetas_procesosquimicos_wcds_3_tfhrelinpro_to) )
      {
         addWhere(sWhereString, "(HreLinPro <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel)==0) && ( ! (GXutil.strcmp("", AV57Historicoderecetas_procesosquimicos_wcds_4_tfhreprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Historicoderecetas_procesosquimicos_wcds_5_tfhreprocod_sel)==0) )
      {
         addWhere(sWhereString, "(HreProCod = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Historicoderecetas_procesosquimicos_wcds_6_tfhreprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Historicoderecetas_procesosquimicos_wcds_7_tfhreprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreProDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV61Historicoderecetas_procesosquimicos_wcds_8_tfhreprotie) )
      {
         addWhere(sWhereString, "(HreProTie >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV62Historicoderecetas_procesosquimicos_wcds_9_tfhreprotie_to) )
      {
         addWhere(sWhereString, "(HreProTie <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV22OrderedBy == 1 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY HreLinPro" ;
      }
      else if ( ( AV22OrderedBy == 1 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreLinPro DESC" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY HreProCod" ;
      }
      else if ( ( AV22OrderedBy == 2 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreProCod DESC" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY HreProDsc" ;
      }
      else if ( ( AV22OrderedBy == 3 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreProDsc DESC" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ! AV23OrderedDsc )
      {
         scmdbuf += " ORDER BY HreProTie" ;
      }
      else if ( ( AV22OrderedBy == 4 ) && ( AV23OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreProTie DESC" ;
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
                  return conditional_P09A12(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09A12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               return;
      }
   }

}

