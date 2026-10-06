package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class productosnoaplicarnormas_wcexport extends GXProcedure
{
   public productosnoaplicarnormas_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( productosnoaplicarnormas_wcexport.class ), "" );
   }

   public productosnoaplicarnormas_wcexport( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      productosnoaplicarnormas_wcexport.this.aP1 = new String[] {""};
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
      productosnoaplicarnormas_wcexport.this.aP0 = aP0;
      productosnoaplicarnormas_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ProductosNOaplicarNormas_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      productosnoaplicarnormas_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      productosnoaplicarnormas_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV37TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosnoaplicarnormas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFPrdNum_Sel, GXv_char5) ;
         productosnoaplicarnormas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            productosnoaplicarnormas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFPrdNum, GXv_char5) ;
            productosnoaplicarnormas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosnoaplicarnormas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFPrdNom_Sel, GXv_char5) ;
         productosnoaplicarnormas_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFPrdNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            productosnoaplicarnormas_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFPrdNom, GXv_char5) ;
            productosnoaplicarnormas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdDisponible)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFPrdDisponible_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Disponible", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosnoaplicarnormas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV40TFPrdDisponible)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         productosnoaplicarnormas_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV41TFPrdDisponible_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV33VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("ProductosNOaplicarNormas_WCColumnsSelector"), "") != 0 )
      {
         AV28ColumnsSelectorXML = AV19Session.getValue("ProductosNOaplicarNormas_WCColumnsSelector") ;
         AV25ColumnsSelector.fromxml(AV28ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV27ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV51GXV1));
         if ( AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setColor( 11 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV53Productosnoaplicarnormas_wcds_1_filterfulltext = AV18FilterFullText ;
      AV54Productosnoaplicarnormas_wcds_2_tfprdnum = AV36TFPrdNum ;
      AV55Productosnoaplicarnormas_wcds_3_tfprdnum_sel = AV37TFPrdNum_Sel ;
      AV56Productosnoaplicarnormas_wcds_4_tfprdnom = AV38TFPrdNom ;
      AV57Productosnoaplicarnormas_wcds_5_tfprdnom_sel = AV39TFPrdNom_Sel ;
      AV58Productosnoaplicarnormas_wcds_6_tfprddisponible = AV40TFPrdDisponible ;
      AV59Productosnoaplicarnormas_wcds_7_tfprddisponible_to = AV41TFPrdDisponible_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV53Productosnoaplicarnormas_wcds_1_filterfulltext ,
                                           AV55Productosnoaplicarnormas_wcds_3_tfprdnum_sel ,
                                           AV54Productosnoaplicarnormas_wcds_2_tfprdnum ,
                                           AV57Productosnoaplicarnormas_wcds_5_tfprdnom_sel ,
                                           AV56Productosnoaplicarnormas_wcds_4_tfprdnom ,
                                           AV58Productosnoaplicarnormas_wcds_6_tfprddisponible ,
                                           AV59Productosnoaplicarnormas_wcds_7_tfprddisponible_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV44Prdnum ,
                                           Byte.valueOf(A856ValCod) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Integer.valueOf(AV45PrvNum) ,
                                           AV43Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV44Prdnum = GXutil.padr( GXutil.rtrim( AV44Prdnum), 6, "%") ;
      lV53Productosnoaplicarnormas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Productosnoaplicarnormas_wcds_1_filterfulltext), "%", "") ;
      lV53Productosnoaplicarnormas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Productosnoaplicarnormas_wcds_1_filterfulltext), "%", "") ;
      lV53Productosnoaplicarnormas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Productosnoaplicarnormas_wcds_1_filterfulltext), "%", "") ;
      lV54Productosnoaplicarnormas_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV54Productosnoaplicarnormas_wcds_2_tfprdnum), 6, "%") ;
      lV56Productosnoaplicarnormas_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV56Productosnoaplicarnormas_wcds_4_tfprdnom), 26, "%") ;
      /* Using cursor P095U2 */
      pr_default.execute(0, new Object[] {AV43Emprcod, lV44Prdnum, AV44Prdnum, Integer.valueOf(AV45PrvNum), Integer.valueOf(AV45PrvNum), lV53Productosnoaplicarnormas_wcds_1_filterfulltext, lV53Productosnoaplicarnormas_wcds_1_filterfulltext, lV53Productosnoaplicarnormas_wcds_1_filterfulltext, lV54Productosnoaplicarnormas_wcds_2_tfprdnum, AV55Productosnoaplicarnormas_wcds_3_tfprdnum_sel, lV56Productosnoaplicarnormas_wcds_4_tfprdnom, AV57Productosnoaplicarnormas_wcds_5_tfprdnom_sel, AV58Productosnoaplicarnormas_wcds_6_tfprddisponible, AV59Productosnoaplicarnormas_wcds_7_tfprddisponible_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P095U2_A719PrdNum[0] ;
         A396EmprCod = P095U2_A396EmprCod[0] ;
         A795PrvNum = P095U2_A795PrvNum[0] ;
         A856ValCod = P095U2_A856ValCod[0] ;
         A718PrdNom = P095U2_A718PrdNom[0] ;
         A685PrdCanRes = P095U2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P095U2_A704PrdExiAlm[0] ;
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV33VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV23Seleccionar = "S" ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV23Seleccionar, GXv_char5) ;
            productosnoaplicarnormas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
            productosnoaplicarnormas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char5) ;
            productosnoaplicarnormas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A13831PrdDisponi)) );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV46Normas = "" ;
            /* Using cursor P095U3 */
            pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A13217NormaID = P095U3_A13217NormaID[0] ;
               if ( (GXutil.strcmp("", AV46Normas)==0) )
               {
                  AV46Normas = GXutil.trim( A13217NormaID) ;
               }
               else
               {
                  AV46Normas += "/" + GXutil.trim( A13217NormaID) ;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46Normas, GXv_char5) ;
            productosnoaplicarnormas_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
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
      AV25ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Seleccionar", "", "", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNum", "", "Producto", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNom", "", "Descripcion", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdDisponible", "", "Disponible", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Normas", "", "Normas", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV29UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ProductosNOaplicarNormas_WCColumnsSelector", GXv_char5) ;
      productosnoaplicarnormas_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV29UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV29UserCustomValue)==0) ) )
      {
         AV26ColumnsSelectorAux.fromxml(AV29UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV25ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV26ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV25ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("ProductosNOaplicarNormas_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ProductosNOaplicarNormas_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("ProductosNOaplicarNormas_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV61GXV2 = 1 ;
      while ( AV61GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV36TFPrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV37TFPrdNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV38TFPrdNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV39TFPrdNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDISPONIBLE") == 0 )
         {
            AV40TFPrdDisponible = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFPrdDisponible_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV43Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV44Prdnum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV45PrvNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&NORMAID") == 0 )
         {
            AV47NormaID = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV61GXV2 = (int)(AV61GXV2+1) ;
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
      this.aP0[0] = productosnoaplicarnormas_wcexport.this.AV11Filename;
      this.aP1[0] = productosnoaplicarnormas_wcexport.this.AV12ErrorMessage;
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
      AV37TFPrdNum_Sel = "" ;
      AV36TFPrdNum = "" ;
      AV39TFPrdNom_Sel = "" ;
      AV38TFPrdNom = "" ;
      AV40TFPrdDisponible = DecimalUtil.ZERO ;
      AV41TFPrdDisponible_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV28ColumnsSelectorXML = "" ;
      AV25ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV27ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      AV53Productosnoaplicarnormas_wcds_1_filterfulltext = "" ;
      AV54Productosnoaplicarnormas_wcds_2_tfprdnum = "" ;
      AV55Productosnoaplicarnormas_wcds_3_tfprdnum_sel = "" ;
      AV56Productosnoaplicarnormas_wcds_4_tfprdnom = "" ;
      AV57Productosnoaplicarnormas_wcds_5_tfprdnom_sel = "" ;
      AV58Productosnoaplicarnormas_wcds_6_tfprddisponible = DecimalUtil.ZERO ;
      AV59Productosnoaplicarnormas_wcds_7_tfprddisponible_to = DecimalUtil.ZERO ;
      lV44Prdnum = "" ;
      scmdbuf = "" ;
      lV53Productosnoaplicarnormas_wcds_1_filterfulltext = "" ;
      lV54Productosnoaplicarnormas_wcds_2_tfprdnum = "" ;
      lV56Productosnoaplicarnormas_wcds_4_tfprdnom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      AV44Prdnum = "" ;
      AV43Emprcod = "" ;
      A396EmprCod = "" ;
      P095U2_A719PrdNum = new String[] {""} ;
      P095U2_A396EmprCod = new String[] {""} ;
      P095U2_A795PrvNum = new int[1] ;
      P095U2_A856ValCod = new byte[1] ;
      P095U2_A718PrdNom = new String[] {""} ;
      P095U2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P095U2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV23Seleccionar = "" ;
      AV46Normas = "" ;
      P095U3_A396EmprCod = new String[] {""} ;
      P095U3_A719PrdNum = new String[] {""} ;
      P095U3_A13217NormaID = new String[] {""} ;
      A13217NormaID = "" ;
      AV29UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV26ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV47NormaID = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.productosnoaplicarnormas_wcexport__default(),
         new Object[] {
             new Object[] {
            P095U2_A719PrdNum, P095U2_A396EmprCod, P095U2_A795PrvNum, P095U2_A856ValCod, P095U2_A718PrdNom, P095U2_A685PrdCanRes, P095U2_A704PrdExiAlm
            }
            , new Object[] {
            P095U3_A396EmprCod, P095U3_A719PrdNum, P095U3_A13217NormaID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV51GXV1 ;
   private int A795PrvNum ;
   private int AV45PrvNum ;
   private int AV61GXV2 ;
   private long AV33VisibleColumnCount ;
   private java.math.BigDecimal AV40TFPrdDisponible ;
   private java.math.BigDecimal AV41TFPrdDisponible_To ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private java.math.BigDecimal AV58Productosnoaplicarnormas_wcds_6_tfprddisponible ;
   private java.math.BigDecimal AV59Productosnoaplicarnormas_wcds_7_tfprddisponible_to ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private String AV37TFPrdNum_Sel ;
   private String AV36TFPrdNum ;
   private String AV39TFPrdNom_Sel ;
   private String AV38TFPrdNom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV54Productosnoaplicarnormas_wcds_2_tfprdnum ;
   private String AV55Productosnoaplicarnormas_wcds_3_tfprdnum_sel ;
   private String AV56Productosnoaplicarnormas_wcds_4_tfprdnom ;
   private String AV57Productosnoaplicarnormas_wcds_5_tfprdnom_sel ;
   private String lV44Prdnum ;
   private String scmdbuf ;
   private String lV54Productosnoaplicarnormas_wcds_2_tfprdnum ;
   private String lV56Productosnoaplicarnormas_wcds_4_tfprdnom ;
   private String AV44Prdnum ;
   private String AV43Emprcod ;
   private String A396EmprCod ;
   private String AV23Seleccionar ;
   private String A13217NormaID ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private String AV47NormaID ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV28ColumnsSelectorXML ;
   private String AV29UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV53Productosnoaplicarnormas_wcds_1_filterfulltext ;
   private String lV53Productosnoaplicarnormas_wcds_1_filterfulltext ;
   private String AV46Normas ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P095U2_A719PrdNum ;
   private String[] P095U2_A396EmprCod ;
   private int[] P095U2_A795PrvNum ;
   private byte[] P095U2_A856ValCod ;
   private String[] P095U2_A718PrdNom ;
   private java.math.BigDecimal[] P095U2_A685PrdCanRes ;
   private java.math.BigDecimal[] P095U2_A704PrdExiAlm ;
   private String[] P095U3_A396EmprCod ;
   private String[] P095U3_A719PrdNum ;
   private String[] P095U3_A13217NormaID ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV27ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class productosnoaplicarnormas_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P095U2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Productosnoaplicarnormas_wcds_1_filterfulltext ,
                                          String AV55Productosnoaplicarnormas_wcds_3_tfprdnum_sel ,
                                          String AV54Productosnoaplicarnormas_wcds_2_tfprdnum ,
                                          String AV57Productosnoaplicarnormas_wcds_5_tfprdnom_sel ,
                                          String AV56Productosnoaplicarnormas_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV58Productosnoaplicarnormas_wcds_6_tfprddisponible ,
                                          java.math.BigDecimal AV59Productosnoaplicarnormas_wcds_7_tfprddisponible_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV44Prdnum ,
                                          byte A856ValCod ,
                                          int A795PrvNum ,
                                          int AV45PrvNum ,
                                          String AV43Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[14];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT PrdNum, EmprCod, PrvNum, ValCod, PrdNom, PrdCanRes, PrdExiAlm FROM TXPPRODUC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(PrdNum)))) >= 5)");
      addWhere(sWhereString, "(ValCod < 3)");
      addWhere(sWhereString, "(PrvNum = ? or (? = 0))");
      if ( ! (GXutil.strcmp("", AV53Productosnoaplicarnormas_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(PrdNum) like '%' || UPPER(?)) or ( UPPER(PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(( PrdExiAlm - PrdCanRes),'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Productosnoaplicarnormas_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV54Productosnoaplicarnormas_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Productosnoaplicarnormas_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Productosnoaplicarnormas_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Productosnoaplicarnormas_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Productosnoaplicarnormas_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Productosnoaplicarnormas_wcds_6_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( PrdExiAlm - PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Productosnoaplicarnormas_wcds_7_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( PrdExiAlm - PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNum DESC" ;
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
                  return conditional_P095U2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Boolean) dynConstraints[12]).booleanValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P095U2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P095U3", "SELECT EmprCod, PrdNum, NormaID FROM TXPPrdNor WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
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
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

