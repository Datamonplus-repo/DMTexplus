package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class eliminaciondeformulastinte_2export extends GXProcedure
{
   public eliminaciondeformulastinte_2export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( eliminaciondeformulastinte_2export.class ), "" );
   }

   public eliminaciondeformulastinte_2export( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      eliminaciondeformulastinte_2export.this.aP1 = new String[] {""};
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
      eliminaciondeformulastinte_2export.this.aP0 = aP0;
      eliminaciondeformulastinte_2export.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "EliminaciondeFormulasTinte_2Export-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (0==AV46TFNum_hdrsH_Sel) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Historico?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         eliminaciondeformulastinte_2export.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV46TFNum_hdrsH_Sel );
      }
      else
      {
         if ( ! ( (0==AV45TFNum_hdrsH) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Historico?", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            eliminaciondeformulastinte_2export.this.AV13CellRow = GXv_int3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV45TFNum_hdrsH );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV42VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV28Session.getValue("FormulacionTinte.EliminaciondeFormulasTinte_2ColumnsSelector"), "") != 0 )
      {
         AV37ColumnsSelectorXML = AV28Session.getValue("FormulacionTinte.EliminaciondeFormulasTinte_2ColumnsSelector") ;
         AV34ColumnsSelector.fromxml(AV37ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV50GXV1 = 1 ;
      while ( AV50GXV1 <= AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV36ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV50GXV1));
         if ( AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setColor( 11 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         AV50GXV1 = (int)(AV50GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV52Formulaciontinte_eliminaciondeformulastinte_2ds_1_tfnum_hdrsh = AV45TFNum_hdrsH ;
      AV53Formulaciontinte_eliminaciondeformulastinte_2ds_2_tfnum_hdrsh_sel = AV46TFNum_hdrsH_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV17Clicod) ,
                                           Integer.valueOf(AV18Clicod_to) ,
                                           AV19Forser ,
                                           AV20Forser_to ,
                                           AV21Forcolnom ,
                                           AV22Forcolnom_to ,
                                           Integer.valueOf(AV23Forcolnum) ,
                                           Integer.valueOf(AV24Forcolnum_to) ,
                                           Byte.valueOf(AV25TipColCod) ,
                                           Byte.valueOf(AV26TipColCod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A496ForUltUti ,
                                           AV27ForUltUti ,
                                           A2749ForPro ,
                                           AV16Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P09WE2 */
      pr_default.execute(0, new Object[] {AV16Emprcod, AV27ForUltUti, Integer.valueOf(AV17Clicod), Integer.valueOf(AV18Clicod_to), AV19Forser, AV20Forser_to, AV21Forcolnom, AV22Forcolnom_to, Integer.valueOf(AV23Forcolnum), Integer.valueOf(AV24Forcolnum_to), Byte.valueOf(AV25TipColCod), Byte.valueOf(AV26TipColCod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2749ForPro = P09WE2_A2749ForPro[0] ;
         n2749ForPro = P09WE2_n2749ForPro[0] ;
         A496ForUltUti = P09WE2_A496ForUltUti[0] ;
         n496ForUltUti = P09WE2_n496ForUltUti[0] ;
         A831TipColCod = P09WE2_A831TipColCod[0] ;
         A483ForColNum = P09WE2_A483ForColNum[0] ;
         A482ForColNom = P09WE2_A482ForColNom[0] ;
         A494ForSer = P09WE2_A494ForSer[0] ;
         A252CliCod = P09WE2_A252CliCod[0] ;
         A396EmprCod = P09WE2_A396EmprCod[0] ;
         A279CliNom = P09WE2_A279CliNom[0] ;
         A5742ForSerDsc = P09WE2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09WE2_n5742ForSerDsc[0] ;
         A279CliNom = P09WE2_A279CliNom[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV42VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            eliminaciondeformulastinte_2export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A494ForSer, GXv_char5) ;
            eliminaciondeformulastinte_2export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5742ForSerDsc, GXv_char5) ;
            eliminaciondeformulastinte_2export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A482ForColNom, GXv_char5) ;
            eliminaciondeformulastinte_2export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A483ForColNum );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A831TipColCod );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A496ForUltUti );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2749ForPro, GXv_char5) ;
            eliminaciondeformulastinte_2export.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_int7 = AV32Num_hdrs ;
            GXv_char5[0] = A396EmprCod ;
            GXv_int8[0] = A252CliCod ;
            GXv_char9[0] = A494ForSer ;
            GXv_char10[0] = A482ForColNom ;
            GXv_int11[0] = A483ForColNum ;
            GXv_int12[0] = A831TipColCod ;
            GXv_int13[0] = GXt_int7 ;
            new app.formulaciontinte.pkilequi2(remoteHandle, context).execute( GXv_char5, GXv_int8, GXv_char9, GXv_char10, GXv_int11, GXv_int12, GXv_int13) ;
            eliminaciondeformulastinte_2export.this.A396EmprCod = GXv_char5[0] ;
            eliminaciondeformulastinte_2export.this.A252CliCod = GXv_int8[0] ;
            eliminaciondeformulastinte_2export.this.A494ForSer = GXv_char9[0] ;
            eliminaciondeformulastinte_2export.this.A482ForColNom = GXv_char10[0] ;
            eliminaciondeformulastinte_2export.this.A483ForColNum = GXv_int11[0] ;
            eliminaciondeformulastinte_2export.this.A831TipColCod = GXv_int12[0] ;
            eliminaciondeformulastinte_2export.this.GXt_int7 = GXv_int13[0] ;
            AV32Num_hdrs = (short)(GXt_int7) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( AV32Num_hdrs );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_int7 = AV33Num_hdrsH ;
            GXv_int13[0] = GXt_int7 ;
            new app.formulaciontinte.pkilequi2historico(remoteHandle, context).execute( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod, GXv_int13) ;
            eliminaciondeformulastinte_2export.this.GXt_int7 = GXv_int13[0] ;
            AV33Num_hdrsH = (short)(GXt_int7) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( AV33Num_hdrsH );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
      AV34ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliCod", "", "Cliente", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliNom", "", "Nombre", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForSer", "", "Articulo", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForSerDsc", "", "Descripcion", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForColNom", "", "Color", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForColNum", "", "Numero", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "TipColCod", "", "Codigo", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForUltUti", "", "Fecha Ult. Uti.", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForPro", "", "Prov.?", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&Num_hdrs", "", "Producciones?", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&Num_hdrsH", "", "Historico?", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char4 = AV38UserCustomValue ;
      GXv_char10[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.EliminaciondeFormulasTinte_2ColumnsSelector", GXv_char10) ;
      eliminaciondeformulastinte_2export.this.GXt_char4 = GXv_char10[0] ;
      AV38UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV38UserCustomValue)==0) ) )
      {
         AV35ColumnsSelectorAux.fromxml(AV38UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV35ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV34ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV35ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV34ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV28Session.getValue("FormulacionTinte.EliminaciondeFormulasTinte_2GridState"), "") == 0 )
      {
         AV30GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.EliminaciondeFormulasTinte_2GridState"), null, null);
      }
      else
      {
         AV30GridState.fromxml(AV28Session.getValue("FormulacionTinte.EliminaciondeFormulasTinte_2GridState"), null, null);
      }
      AV54GXV2 = 1 ;
      while ( AV54GXV2 <= AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV54GXV2));
         if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNUM_HDRSH") == 0 )
         {
            AV45TFNum_hdrsH = (short)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNUM_HDRSH_SEL") == 0 )
         {
            AV46TFNum_hdrsH_Sel = (short)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV17Clicod = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV18Clicod_to = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV19Forser = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER_TO") == 0 )
         {
            AV20Forser_to = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV21Forcolnom = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM_TO") == 0 )
         {
            AV22Forcolnom_to = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV23Forcolnum = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM_TO") == 0 )
         {
            AV24Forcolnum_to = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV25TipColCod = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD_TO") == 0 )
         {
            AV26TipColCod_to = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORULTUTI") == 0 )
         {
            AV27ForUltUti = localUtil.ctod( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV54GXV2 = (int)(AV54GXV2+1) ;
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
      this.aP0[0] = eliminaciondeformulastinte_2export.this.AV11Filename;
      this.aP1[0] = eliminaciondeformulastinte_2export.this.AV12ErrorMessage;
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
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV28Session = httpContext.getWebSession();
      AV37ColumnsSelectorXML = "" ;
      AV34ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV36ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A496ForUltUti = GXutil.nullDate() ;
      A2749ForPro = "" ;
      A396EmprCod = "" ;
      scmdbuf = "" ;
      AV19Forser = "" ;
      AV20Forser_to = "" ;
      AV21Forcolnom = "" ;
      AV22Forcolnom_to = "" ;
      AV27ForUltUti = GXutil.nullDate() ;
      AV16Emprcod = "" ;
      P09WE2_A2749ForPro = new String[] {""} ;
      P09WE2_n2749ForPro = new boolean[] {false} ;
      P09WE2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P09WE2_n496ForUltUti = new boolean[] {false} ;
      P09WE2_A831TipColCod = new byte[1] ;
      P09WE2_A483ForColNum = new int[1] ;
      P09WE2_A482ForColNom = new String[] {""} ;
      P09WE2_A494ForSer = new String[] {""} ;
      P09WE2_A252CliCod = new int[1] ;
      P09WE2_A396EmprCod = new String[] {""} ;
      P09WE2_A279CliNom = new String[] {""} ;
      P09WE2_A5742ForSerDsc = new String[] {""} ;
      P09WE2_n5742ForSerDsc = new boolean[] {false} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      GXv_char5 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char9 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_int13 = new int[1] ;
      AV38UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char10 = new String[1] ;
      AV35ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV30GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV31GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.eliminaciondeformulastinte_2export__default(),
         new Object[] {
             new Object[] {
            P09WE2_A2749ForPro, P09WE2_n2749ForPro, P09WE2_A496ForUltUti, P09WE2_n496ForUltUti, P09WE2_A831TipColCod, P09WE2_A483ForColNum, P09WE2_A482ForColNom, P09WE2_A494ForSer, P09WE2_A252CliCod, P09WE2_A396EmprCod,
            P09WE2_A279CliNom, P09WE2_A5742ForSerDsc, P09WE2_n5742ForSerDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV25TipColCod ;
   private byte AV26TipColCod_to ;
   private byte GXv_int12[] ;
   private short AV46TFNum_hdrsH_Sel ;
   private short AV45TFNum_hdrsH ;
   private short GXv_int3[] ;
   private short AV52Formulaciontinte_eliminaciondeformulastinte_2ds_1_tfnum_hdrsh ;
   private short AV53Formulaciontinte_eliminaciondeformulastinte_2ds_2_tfnum_hdrsh_sel ;
   private short AV32Num_hdrs ;
   private short AV33Num_hdrsH ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV50GXV1 ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV17Clicod ;
   private int AV18Clicod_to ;
   private int AV23Forcolnum ;
   private int AV24Forcolnum_to ;
   private int GXv_int8[] ;
   private int GXv_int11[] ;
   private int GXt_int7 ;
   private int GXv_int13[] ;
   private int AV54GXV2 ;
   private long AV42VisibleColumnCount ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A2749ForPro ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String AV19Forser ;
   private String AV20Forser_to ;
   private String AV21Forcolnom ;
   private String AV22Forcolnom_to ;
   private String AV16Emprcod ;
   private String GXv_char5[] ;
   private String GXv_char9[] ;
   private String GXt_char4 ;
   private String GXv_char10[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date A496ForUltUti ;
   private java.util.Date AV27ForUltUti ;
   private boolean returnInSub ;
   private boolean n2749ForPro ;
   private boolean n496ForUltUti ;
   private boolean n5742ForSerDsc ;
   private String AV37ColumnsSelectorXML ;
   private String AV38UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV28Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09WE2_A2749ForPro ;
   private boolean[] P09WE2_n2749ForPro ;
   private java.util.Date[] P09WE2_A496ForUltUti ;
   private boolean[] P09WE2_n496ForUltUti ;
   private byte[] P09WE2_A831TipColCod ;
   private int[] P09WE2_A483ForColNum ;
   private String[] P09WE2_A482ForColNom ;
   private String[] P09WE2_A494ForSer ;
   private int[] P09WE2_A252CliCod ;
   private String[] P09WE2_A396EmprCod ;
   private String[] P09WE2_A279CliNom ;
   private String[] P09WE2_A5742ForSerDsc ;
   private boolean[] P09WE2_n5742ForSerDsc ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV30GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV31GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV34ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV35ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV36ColumnsSelector_Column ;
}

final  class eliminaciondeformulastinte_2export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09WE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV17Clicod ,
                                          int AV18Clicod_to ,
                                          String AV19Forser ,
                                          String AV20Forser_to ,
                                          String AV21Forcolnom ,
                                          String AV22Forcolnom_to ,
                                          int AV23Forcolnum ,
                                          int AV24Forcolnum_to ,
                                          byte AV25TipColCod ,
                                          byte AV26TipColCod_to ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          java.util.Date A496ForUltUti ,
                                          java.util.Date AV27ForUltUti ,
                                          String A2749ForPro ,
                                          String AV16Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[12];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.ForPro, T1.ForUltUti, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.EmprCod, T2.CliNom, T1.ForSerDsc FROM (TXPCFORMU T1 INNER JOIN" ;
      scmdbuf += " TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ForUltUti <= ?)");
      addWhere(sWhereString, "(Not (T1.ForUltUti = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.ForPro <> 'S')");
      if ( ! (0==AV17Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( ! (0==AV18Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19Forser)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV20Forser_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21Forcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (0==AV23Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (0==AV24Forcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (0==AV25TipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (0==AV26TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_P09WE2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09WE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 13);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
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
                  stmt.setString(sIdx, (String)parms[18], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               return;
      }
   }

}

