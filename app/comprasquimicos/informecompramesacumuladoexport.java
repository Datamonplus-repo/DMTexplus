package app.comprasquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informecompramesacumuladoexport extends GXProcedure
{
   public informecompramesacumuladoexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informecompramesacumuladoexport.class ), "" );
   }

   public informecompramesacumuladoexport( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      informecompramesacumuladoexport.this.aP1 = new String[] {""};
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
      informecompramesacumuladoexport.this.aP0 = aP0;
      informecompramesacumuladoexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "InformeCompraMesAcumuladoExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      informecompramesacumuladoexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      informecompramesacumuladoexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFPrdNumMes) && (0==AV35TFPrdNumMes_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mes", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         informecompramesacumuladoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFPrdNumMes );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         informecompramesacumuladoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFPrdNumMes_To );
      }
      if ( ! ( (GXutil.strcmp("", AV37TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         informecompramesacumuladoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFPrdNum_Sel, GXv_char5) ;
         informecompramesacumuladoexport.this.GXt_char4 = GXv_char5[0] ;
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
            informecompramesacumuladoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFPrdNum, GXv_char5) ;
            informecompramesacumuladoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         informecompramesacumuladoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFPrdNom_Sel, GXv_char5) ;
         informecompramesacumuladoexport.this.GXt_char4 = GXv_char5[0] ;
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
            informecompramesacumuladoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFPrdNom, GXv_char5) ;
            informecompramesacumuladoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdUniCprM)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFPrdUniCprM_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidades Compradas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         informecompramesacumuladoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV40TFPrdUniCprM)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         informecompramesacumuladoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV41TFPrdUniCprM_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFPrdValCprM)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFPrdValCprM_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Valor Compras", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         informecompramesacumuladoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV42TFPrdValCprM)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         informecompramesacumuladoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV43TFPrdValCprM_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("ComprasQuimicos.InformeCompraMesAcumuladoColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("ComprasQuimicos.InformeCompraMesAcumuladoColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV55GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Integer.valueOf(AV48PrvNum) ,
                                           Integer.valueOf(AV49UProv) ,
                                           A745PrdUniCprM ,
                                           A749PrdValCprM ,
                                           AV45Emprcod ,
                                           AV46PrdNum ,
                                           Short.valueOf(AV50Any) ,
                                           Byte.valueOf(AV51Mes) ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           AV47UProd } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P09GC2 */
      pr_default.execute(0, new Object[] {AV45Emprcod, AV46PrdNum, Short.valueOf(AV50Any), Byte.valueOf(AV51Mes), Integer.valueOf(AV48PrvNum), Integer.valueOf(AV49UProv), AV47UProd});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A749PrdValCprM = P09GC2_A749PrdValCprM[0] ;
         A745PrdUniCprM = P09GC2_A745PrdUniCprM[0] ;
         A720PrdNumMes = P09GC2_A720PrdNumMes[0] ;
         A681PrdAny = P09GC2_A681PrdAny[0] ;
         A795PrvNum = P09GC2_A795PrvNum[0] ;
         A719PrdNum = P09GC2_A719PrdNum[0] ;
         A396EmprCod = P09GC2_A396EmprCod[0] ;
         A718PrdNom = P09GC2_A718PrdNom[0] ;
         A795PrvNum = P09GC2_A795PrvNum[0] ;
         A718PrdNom = P09GC2_A718PrdNom[0] ;
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
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXutil.str( A720PrdNumMes, 2, 0) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
            informecompramesacumuladoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char5) ;
            informecompramesacumuladoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXutil.str( A745PrdUniCprM, 10, 2) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXutil.str( A749PrdValCprM, 12, 2) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
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
      if ( 1 == 0 )
      {
         AV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext = AV18FilterFullText ;
         AV59Comprasquimicos_informecompramesacumuladods_2_tfprdnummes = AV34TFPrdNumMes ;
         AV60Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to = AV35TFPrdNumMes_To ;
         AV61Comprasquimicos_informecompramesacumuladods_4_tfprdnum = AV36TFPrdNum ;
         AV62Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel = AV37TFPrdNum_Sel ;
         AV63Comprasquimicos_informecompramesacumuladods_6_tfprdnom = AV38TFPrdNom ;
         AV64Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel = AV39TFPrdNom_Sel ;
         AV65Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm = AV40TFPrdUniCprM ;
         AV66Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to = AV41TFPrdUniCprM_To ;
         AV67Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm = AV42TFPrdValCprM ;
         AV68Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to = AV43TFPrdValCprM_To ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext ,
                                              Byte.valueOf(AV59Comprasquimicos_informecompramesacumuladods_2_tfprdnummes) ,
                                              Byte.valueOf(AV60Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to) ,
                                              AV62Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel ,
                                              AV61Comprasquimicos_informecompramesacumuladods_4_tfprdnum ,
                                              AV64Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel ,
                                              AV63Comprasquimicos_informecompramesacumuladods_6_tfprdnom ,
                                              AV65Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm ,
                                              AV66Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to ,
                                              AV67Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm ,
                                              AV68Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to ,
                                              Byte.valueOf(A720PrdNumMes) ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A745PrdUniCprM ,
                                              A749PrdValCprM ,
                                              Short.valueOf(AV16OrderedBy) ,
                                              Boolean.valueOf(AV17OrderedDsc) ,
                                              Integer.valueOf(A795PrvNum) ,
                                              Integer.valueOf(AV48PrvNum) ,
                                              Integer.valueOf(AV49UProv) ,
                                              AV45Emprcod ,
                                              AV46PrdNum ,
                                              Short.valueOf(AV50Any) ,
                                              Byte.valueOf(AV51Mes) ,
                                              A396EmprCod ,
                                              AV47UProd } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
         lV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
         lV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
         lV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
         lV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext), "%", "") ;
         lV61Comprasquimicos_informecompramesacumuladods_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV61Comprasquimicos_informecompramesacumuladods_4_tfprdnum), 6, "%") ;
         lV63Comprasquimicos_informecompramesacumuladods_6_tfprdnom = GXutil.padr( GXutil.rtrim( AV63Comprasquimicos_informecompramesacumuladods_6_tfprdnom), 26, "%") ;
         /* Using cursor P09GC3 */
         pr_default.execute(1, new Object[] {AV45Emprcod, AV46PrdNum, Short.valueOf(AV50Any), Byte.valueOf(AV51Mes), Integer.valueOf(AV48PrvNum), Integer.valueOf(AV49UProv), AV47UProd, lV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext, lV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext, lV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext, lV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext, lV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext, Byte.valueOf(AV59Comprasquimicos_informecompramesacumuladods_2_tfprdnummes), Byte.valueOf(AV60Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to), lV61Comprasquimicos_informecompramesacumuladods_4_tfprdnum, AV62Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel, lV63Comprasquimicos_informecompramesacumuladods_6_tfprdnom, AV64Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel, AV65Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm, AV66Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to, AV67Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm, AV68Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A681PrdAny = P09GC3_A681PrdAny[0] ;
            A795PrvNum = P09GC3_A795PrvNum[0] ;
            A396EmprCod = P09GC3_A396EmprCod[0] ;
            A749PrdValCprM = P09GC3_A749PrdValCprM[0] ;
            A745PrdUniCprM = P09GC3_A745PrdUniCprM[0] ;
            A718PrdNom = P09GC3_A718PrdNom[0] ;
            A719PrdNum = P09GC3_A719PrdNum[0] ;
            A720PrdNumMes = P09GC3_A720PrdNumMes[0] ;
            A795PrvNum = P09GC3_A795PrvNum[0] ;
            A718PrdNom = P09GC3_A718PrdNom[0] ;
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
            AV31VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A720PrdNumMes );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
               informecompramesacumuladoexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char5) ;
               informecompramesacumuladoexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A745PrdUniCprM)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A749PrdValCprM)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S182 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNumMes", "", "Mes", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNum", "", "Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNom", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdUniCprM", "", "Unidades Compradas", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdValCprM", "", "Valor Compras", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ComprasQuimicos.InformeCompraMesAcumuladoColumnsSelector", GXv_char5) ;
      informecompramesacumuladoexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ComprasQuimicos.InformeCompraMesAcumuladoGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ComprasQuimicos.InformeCompraMesAcumuladoGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("ComprasQuimicos.InformeCompraMesAcumuladoGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV69GXV2 = 1 ;
      while ( AV69GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV69GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EmprCod") == 0 )
         {
            AV45Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV46PrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&UProd") == 0 )
         {
            AV47UProd = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV48PrvNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&UProv") == 0 )
         {
            AV49UProv = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&Mes") == 0 )
         {
            AV51Mes = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&Any") == 0 )
         {
            AV50Any = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV69GXV2 = (int)(AV69GXV2+1) ;
      }
      if ( 1 == 0 )
      {
         if ( GXutil.strcmp(AV19Session.getValue("ComprasQuimicos.InformeCompraMesAcumuladoGridState"), "") == 0 )
         {
            AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ComprasQuimicos.InformeCompraMesAcumuladoGridState"), null, null);
         }
         else
         {
            AV21GridState.fromxml(AV19Session.getValue("ComprasQuimicos.InformeCompraMesAcumuladoGridState"), null, null);
         }
         AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
         AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
         AV70GXV3 = 1 ;
         while ( AV70GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
         {
            AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV70GXV3));
            if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
            {
               AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            }
            else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUMMES") == 0 )
            {
               AV34TFPrdNumMes = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
               AV35TFPrdNumMes_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
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
            else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUNICPRM") == 0 )
            {
               AV40TFPrdUniCprM = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
               AV41TFPrdUniCprM_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            }
            else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDVALCPRM") == 0 )
            {
               AV42TFPrdValCprM = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
               AV43TFPrdValCprM_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            }
            AV70GXV3 = (int)(AV70GXV3+1) ;
         }
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
      this.aP0[0] = informecompramesacumuladoexport.this.AV11Filename;
      this.aP1[0] = informecompramesacumuladoexport.this.AV12ErrorMessage;
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
      AV40TFPrdUniCprM = DecimalUtil.ZERO ;
      AV41TFPrdUniCprM_To = DecimalUtil.ZERO ;
      AV42TFPrdValCprM = DecimalUtil.ZERO ;
      AV43TFPrdValCprM_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A745PrdUniCprM = DecimalUtil.ZERO ;
      A749PrdValCprM = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      AV45Emprcod = "" ;
      AV46PrdNum = "" ;
      A396EmprCod = "" ;
      AV47UProd = "" ;
      P09GC2_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GC2_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GC2_A720PrdNumMes = new byte[1] ;
      P09GC2_A681PrdAny = new short[1] ;
      P09GC2_A795PrvNum = new int[1] ;
      P09GC2_A719PrdNum = new String[] {""} ;
      P09GC2_A396EmprCod = new String[] {""} ;
      P09GC2_A718PrdNom = new String[] {""} ;
      AV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext = "" ;
      AV61Comprasquimicos_informecompramesacumuladods_4_tfprdnum = "" ;
      AV62Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel = "" ;
      AV63Comprasquimicos_informecompramesacumuladods_6_tfprdnom = "" ;
      AV64Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel = "" ;
      AV65Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm = DecimalUtil.ZERO ;
      AV66Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to = DecimalUtil.ZERO ;
      AV67Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm = DecimalUtil.ZERO ;
      AV68Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to = DecimalUtil.ZERO ;
      lV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext = "" ;
      lV61Comprasquimicos_informecompramesacumuladods_4_tfprdnum = "" ;
      lV63Comprasquimicos_informecompramesacumuladods_6_tfprdnom = "" ;
      P09GC3_A681PrdAny = new short[1] ;
      P09GC3_A795PrvNum = new int[1] ;
      P09GC3_A396EmprCod = new String[] {""} ;
      P09GC3_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GC3_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GC3_A718PrdNom = new String[] {""} ;
      P09GC3_A719PrdNum = new String[] {""} ;
      P09GC3_A720PrdNumMes = new byte[1] ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.comprasquimicos.informecompramesacumuladoexport__default(),
         new Object[] {
             new Object[] {
            P09GC2_A749PrdValCprM, P09GC2_A745PrdUniCprM, P09GC2_A720PrdNumMes, P09GC2_A681PrdAny, P09GC2_A795PrvNum, P09GC2_A719PrdNum, P09GC2_A396EmprCod, P09GC2_A718PrdNom
            }
            , new Object[] {
            P09GC3_A681PrdAny, P09GC3_A795PrvNum, P09GC3_A396EmprCod, P09GC3_A749PrdValCprM, P09GC3_A745PrdUniCprM, P09GC3_A718PrdNom, P09GC3_A719PrdNum, P09GC3_A720PrdNumMes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV34TFPrdNumMes ;
   private byte AV35TFPrdNumMes_To ;
   private byte A720PrdNumMes ;
   private byte AV51Mes ;
   private byte AV59Comprasquimicos_informecompramesacumuladods_2_tfprdnummes ;
   private byte AV60Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short AV50Any ;
   private short A681PrdAny ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV55GXV1 ;
   private int A795PrvNum ;
   private int AV48PrvNum ;
   private int AV49UProv ;
   private int AV69GXV2 ;
   private int AV70GXV3 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV40TFPrdUniCprM ;
   private java.math.BigDecimal AV41TFPrdUniCprM_To ;
   private java.math.BigDecimal AV42TFPrdValCprM ;
   private java.math.BigDecimal AV43TFPrdValCprM_To ;
   private java.math.BigDecimal A745PrdUniCprM ;
   private java.math.BigDecimal A749PrdValCprM ;
   private java.math.BigDecimal AV65Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm ;
   private java.math.BigDecimal AV66Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to ;
   private java.math.BigDecimal AV67Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm ;
   private java.math.BigDecimal AV68Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to ;
   private String AV37TFPrdNum_Sel ;
   private String AV36TFPrdNum ;
   private String AV39TFPrdNom_Sel ;
   private String AV38TFPrdNom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String scmdbuf ;
   private String AV45Emprcod ;
   private String AV46PrdNum ;
   private String A396EmprCod ;
   private String AV47UProd ;
   private String AV61Comprasquimicos_informecompramesacumuladods_4_tfprdnum ;
   private String AV62Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel ;
   private String AV63Comprasquimicos_informecompramesacumuladods_6_tfprdnom ;
   private String AV64Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel ;
   private String lV61Comprasquimicos_informecompramesacumuladods_4_tfprdnum ;
   private String lV63Comprasquimicos_informecompramesacumuladods_6_tfprdnom ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext ;
   private String lV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P09GC2_A749PrdValCprM ;
   private java.math.BigDecimal[] P09GC2_A745PrdUniCprM ;
   private byte[] P09GC2_A720PrdNumMes ;
   private short[] P09GC2_A681PrdAny ;
   private int[] P09GC2_A795PrvNum ;
   private String[] P09GC2_A719PrdNum ;
   private String[] P09GC2_A396EmprCod ;
   private String[] P09GC2_A718PrdNom ;
   private short[] P09GC3_A681PrdAny ;
   private int[] P09GC3_A795PrvNum ;
   private String[] P09GC3_A396EmprCod ;
   private java.math.BigDecimal[] P09GC3_A749PrdValCprM ;
   private java.math.BigDecimal[] P09GC3_A745PrdUniCprM ;
   private String[] P09GC3_A718PrdNom ;
   private String[] P09GC3_A719PrdNum ;
   private byte[] P09GC3_A720PrdNumMes ;
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

final  class informecompramesacumuladoexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09GC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          int A795PrvNum ,
                                          int AV48PrvNum ,
                                          int AV49UProv ,
                                          java.math.BigDecimal A745PrdUniCprM ,
                                          java.math.BigDecimal A749PrdValCprM ,
                                          String AV45Emprcod ,
                                          String AV46PrdNum ,
                                          short AV50Any ,
                                          byte AV51Mes ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          String AV47UProd )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[7];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.PrdValCprM, T1.PrdUniCprM, T1.PrdNumMes, T1.PrdAny, T2.PrvNum, T1.PrdNum, T1.EmprCod, T2.PrdNom FROM (TXPLPRDES T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ? and T1.PrdAny = ? and T1.PrdNumMes = ?)");
      addWhere(sWhereString, "(T2.PrvNum >= ?)");
      addWhere(sWhereString, "(T2.PrvNum <= ?)");
      addWhere(sWhereString, "(T1.PrdUniCprM <> 0)");
      addWhere(sWhereString, "(T1.PrdValCprM <> 0)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdUniCprM" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdUniCprM DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNumMes" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNumMes DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdValCprM" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdValCprM DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09GC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext ,
                                          byte AV59Comprasquimicos_informecompramesacumuladods_2_tfprdnummes ,
                                          byte AV60Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to ,
                                          String AV62Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel ,
                                          String AV61Comprasquimicos_informecompramesacumuladods_4_tfprdnum ,
                                          String AV64Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel ,
                                          String AV63Comprasquimicos_informecompramesacumuladods_6_tfprdnom ,
                                          java.math.BigDecimal AV65Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm ,
                                          java.math.BigDecimal AV66Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to ,
                                          java.math.BigDecimal AV67Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm ,
                                          java.math.BigDecimal AV68Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to ,
                                          byte A720PrdNumMes ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A745PrdUniCprM ,
                                          java.math.BigDecimal A749PrdValCprM ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          int A795PrvNum ,
                                          int AV48PrvNum ,
                                          int AV49UProv ,
                                          String AV45Emprcod ,
                                          String AV46PrdNum ,
                                          short AV50Any ,
                                          byte AV51Mes ,
                                          String A396EmprCod ,
                                          String AV47UProd )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[22];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.PrdAny, T2.PrvNum, T1.EmprCod, T1.PrdValCprM, T1.PrdUniCprM, T2.PrdNom, T1.PrdNum, T1.PrdNumMes FROM (TXPLPRDES T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ? and T1.PrdAny = ? and T1.PrdNumMes = ?)");
      addWhere(sWhereString, "(T2.PrvNum >= ?)");
      addWhere(sWhereString, "(T2.PrvNum <= ?)");
      addWhere(sWhereString, "(T1.PrdUniCprM <> 0)");
      addWhere(sWhereString, "(T1.PrdValCprM <> 0)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( ! (GXutil.strcmp("", AV58Comprasquimicos_informecompramesacumuladods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.PrdNumMes,'90'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdUniCprM,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdValCprM,'999999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
         GXv_int10[9] = (byte)(1) ;
         GXv_int10[10] = (byte)(1) ;
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV59Comprasquimicos_informecompramesacumuladods_2_tfprdnummes) )
      {
         addWhere(sWhereString, "(T1.PrdNumMes >= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Comprasquimicos_informecompramesacumuladods_3_tfprdnummes_to) )
      {
         addWhere(sWhereString, "(T1.PrdNumMes <= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV61Comprasquimicos_informecompramesacumuladods_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Comprasquimicos_informecompramesacumuladods_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV63Comprasquimicos_informecompramesacumuladods_6_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Comprasquimicos_informecompramesacumuladods_7_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Comprasquimicos_informecompramesacumuladods_8_tfprdunicprm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUniCprM >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Comprasquimicos_informecompramesacumuladods_9_tfprdunicprm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdUniCprM <= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Comprasquimicos_informecompramesacumuladods_10_tfprdvalcprm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdValCprM >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Comprasquimicos_informecompramesacumuladods_11_tfprdvalcprm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdValCprM <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdUniCprM" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdUniCprM DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNumMes" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNumMes DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdValCprM" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdValCprM DESC" ;
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
                  return conditional_P09GC2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Boolean) dynConstraints[1]).booleanValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
            case 1 :
                  return conditional_P09GC3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Boolean) dynConstraints[17]).booleanValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09GC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
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
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               return;
      }
   }

}

