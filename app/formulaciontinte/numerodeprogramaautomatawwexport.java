package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class numerodeprogramaautomatawwexport extends GXProcedure
{
   public numerodeprogramaautomatawwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( numerodeprogramaautomatawwexport.class ), "" );
   }

   public numerodeprogramaautomatawwexport( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      numerodeprogramaautomatawwexport.this.aP1 = new String[] {""};
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
      numerodeprogramaautomatawwexport.this.aP0 = aP0;
      numerodeprogramaautomatawwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "NumerodeProgramaAutomataWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (GXutil.strcmp("", AV35TFMacProCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº de Programa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         numerodeprogramaautomatawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFMacProCod_Sel, GXv_char5) ;
         numerodeprogramaautomatawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFMacProCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº de Programa", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            numerodeprogramaautomatawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFMacProCod, GXv_char5) ;
            numerodeprogramaautomatawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFMacProDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         numerodeprogramaautomatawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFMacProDsc_Sel, GXv_char5) ;
         numerodeprogramaautomatawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFMacProDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            numerodeprogramaautomatawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFMacProDsc, GXv_char5) ;
            numerodeprogramaautomatawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFMacProDsc2_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion (mayor)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         numerodeprogramaautomatawwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFMacProDsc2_Sel, GXv_char5) ;
         numerodeprogramaautomatawwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFMacProDsc2)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion (mayor)", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            numerodeprogramaautomatawwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFMacProDsc2, GXv_char5) ;
            numerodeprogramaautomatawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV40TFMacNumPrg) && (0==AV41TFMacNumPrg_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Programa Cent.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         numerodeprogramaautomatawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFMacNumPrg );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         numerodeprogramaautomatawwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFMacNumPrg_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.NumerodeProgramaAutomataWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.NumerodeProgramaAutomataWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV52GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV54Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = AV34TFMacProCod ;
      AV55Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel = AV35TFMacProCod_Sel ;
      AV56Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = AV36TFMacProDsc ;
      AV57Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel = AV37TFMacProDsc_Sel ;
      AV58Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = AV38TFMacProDsc2 ;
      AV59Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel = AV39TFMacProDsc2_Sel ;
      AV60Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg = AV40TFMacNumPrg ;
      AV61Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to = AV41TFMacNumPrg_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV55Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel ,
                                           AV54Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ,
                                           AV57Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel ,
                                           AV56Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ,
                                           AV59Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel ,
                                           AV58Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ,
                                           Integer.valueOf(AV60Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg) ,
                                           Integer.valueOf(AV61Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to) ,
                                           A1514MacProCod ,
                                           A1515MacProDsc ,
                                           A6231MacProDsc2 ,
                                           Integer.valueOf(A6096MacNumPrg) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV54Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod), 6, "%") ;
      lV56Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc), 20, "%") ;
      lV58Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2), 60, "%") ;
      /* Using cursor P09CF2 */
      pr_default.execute(0, new Object[] {lV54Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod, AV55Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel, lV56Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc, AV57Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel, lV58Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2, AV59Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel, Integer.valueOf(AV60Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg), Integer.valueOf(AV61Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6096MacNumPrg = P09CF2_A6096MacNumPrg[0] ;
         A6231MacProDsc2 = P09CF2_A6231MacProDsc2[0] ;
         A1515MacProDsc = P09CF2_A1515MacProDsc[0] ;
         A1514MacProCod = P09CF2_A1514MacProCod[0] ;
         A396EmprCod = P09CF2_A396EmprCod[0] ;
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
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1514MacProCod, GXv_char5) ;
            numerodeprogramaautomatawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1515MacProDsc, GXv_char5) ;
            numerodeprogramaautomatawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A6231MacProDsc2, GXv_char5) ;
            numerodeprogramaautomatawwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A6096MacNumPrg );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_int6 = AV49NumerodeFormulas ;
            GXv_char5[0] = A396EmprCod ;
            GXv_char7[0] = A1514MacProCod ;
            GXv_int8[0] = (byte)(2) ;
            GXv_int9[0] = GXt_int6 ;
            new app.pmacpro(remoteHandle, context).execute( GXv_char5, GXv_char7, GXv_int8, GXv_int9) ;
            numerodeprogramaautomatawwexport.this.A396EmprCod = GXv_char5[0] ;
            numerodeprogramaautomatawwexport.this.A1514MacProCod = GXv_char7[0] ;
            numerodeprogramaautomatawwexport.this.GXt_int6 = GXv_int9[0] ;
            AV49NumerodeFormulas = (short)(GXt_int6) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( AV49NumerodeFormulas );
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
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MacProCod", "", "Nº de Programa", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MacProDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MacProDsc2", "", "Descripcion (mayor)", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MacNumPrg", "", "Nº Programa Cent.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&NumerodeFormulas", "", "Nº de Formulas", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char7[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.NumerodeProgramaAutomataWWColumnsSelector", GXv_char7) ;
      numerodeprogramaautomatawwexport.this.GXt_char4 = GXv_char7[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.NumerodeProgramaAutomataWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.NumerodeProgramaAutomataWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("FormulacionTinte.NumerodeProgramaAutomataWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV62GXV2 = 1 ;
      while ( AV62GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV62GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPROCOD") == 0 )
         {
            AV34TFMacProCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPROCOD_SEL") == 0 )
         {
            AV35TFMacProCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC") == 0 )
         {
            AV36TFMacProDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC_SEL") == 0 )
         {
            AV37TFMacProDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC2") == 0 )
         {
            AV38TFMacProDsc2 = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC2_SEL") == 0 )
         {
            AV39TFMacProDsc2_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACNUMPRG") == 0 )
         {
            AV40TFMacNumPrg = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFMacNumPrg_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV62GXV2 = (int)(AV62GXV2+1) ;
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
      this.aP0[0] = numerodeprogramaautomatawwexport.this.AV11Filename;
      this.aP1[0] = numerodeprogramaautomatawwexport.this.AV12ErrorMessage;
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
      AV35TFMacProCod_Sel = "" ;
      AV34TFMacProCod = "" ;
      AV37TFMacProDsc_Sel = "" ;
      AV36TFMacProDsc = "" ;
      AV39TFMacProDsc2_Sel = "" ;
      AV38TFMacProDsc2 = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A1514MacProCod = "" ;
      A1515MacProDsc = "" ;
      A6231MacProDsc2 = "" ;
      A396EmprCod = "" ;
      AV54Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = "" ;
      AV55Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel = "" ;
      AV56Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = "" ;
      AV57Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel = "" ;
      AV58Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = "" ;
      AV59Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel = "" ;
      scmdbuf = "" ;
      lV54Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = "" ;
      lV56Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = "" ;
      lV58Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = "" ;
      P09CF2_A6096MacNumPrg = new int[1] ;
      P09CF2_A6231MacProDsc2 = new String[] {""} ;
      P09CF2_A1515MacProDsc = new String[] {""} ;
      P09CF2_A1514MacProCod = new String[] {""} ;
      P09CF2_A396EmprCod = new String[] {""} ;
      GXv_char5 = new String[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int9 = new int[1] ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char7 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.numerodeprogramaautomatawwexport__default(),
         new Object[] {
             new Object[] {
            P09CF2_A6096MacNumPrg, P09CF2_A6231MacProDsc2, P09CF2_A1515MacProDsc, P09CF2_A1514MacProCod, P09CF2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXv_int8[] ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short AV49NumerodeFormulas ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV40TFMacNumPrg ;
   private int AV41TFMacNumPrg_To ;
   private int AV52GXV1 ;
   private int A6096MacNumPrg ;
   private int AV60Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg ;
   private int AV61Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to ;
   private int GXt_int6 ;
   private int GXv_int9[] ;
   private int AV62GXV2 ;
   private long AV31VisibleColumnCount ;
   private String AV35TFMacProCod_Sel ;
   private String AV34TFMacProCod ;
   private String AV37TFMacProDsc_Sel ;
   private String AV36TFMacProDsc ;
   private String AV39TFMacProDsc2_Sel ;
   private String AV38TFMacProDsc2 ;
   private String A1514MacProCod ;
   private String A1515MacProDsc ;
   private String A6231MacProDsc2 ;
   private String A396EmprCod ;
   private String AV54Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ;
   private String AV55Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel ;
   private String AV56Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ;
   private String AV57Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel ;
   private String AV58Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ;
   private String AV59Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel ;
   private String scmdbuf ;
   private String lV54Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ;
   private String lV56Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ;
   private String lV58Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ;
   private String GXv_char5[] ;
   private String GXt_char4 ;
   private String GXv_char7[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P09CF2_A6096MacNumPrg ;
   private String[] P09CF2_A6231MacProDsc2 ;
   private String[] P09CF2_A1515MacProDsc ;
   private String[] P09CF2_A1514MacProCod ;
   private String[] P09CF2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class numerodeprogramaautomatawwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09CF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel ,
                                          String AV54Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ,
                                          String AV57Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel ,
                                          String AV56Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ,
                                          String AV59Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel ,
                                          String AV58Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ,
                                          int AV60Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg ,
                                          int AV61Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to ,
                                          String A1514MacProCod ,
                                          String A1515MacProDsc ,
                                          String A6231MacProDsc2 ,
                                          int A6096MacNumPrg ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[8];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT MacNumPrg, MacProDsc2, MacProDsc, MacProCod, EmprCod FROM TXPCMACPR" ;
      if ( (GXutil.strcmp("", AV55Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel)==0) )
      {
         addWhere(sWhereString, "(MacProCod = ?)");
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(MacProDsc = ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(MacProDsc2 = ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg) )
      {
         addWhere(sWhereString, "(MacNumPrg >= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to) )
      {
         addWhere(sWhereString, "(MacNumPrg <= ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MacProCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MacProCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MacProDsc" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MacProDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MacProDsc2" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MacProDsc2 DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MacNumPrg" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MacNumPrg DESC" ;
      }
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P09CF2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09CF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 60);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 60);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               return;
      }
   }

}

