package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwmodifloteexport extends GXProcedure
{
   public wcwmodifloteexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwmodifloteexport.class ), "" );
   }

   public wcwmodifloteexport( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcwmodifloteexport.this.aP1 = new String[] {""};
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
      wcwmodifloteexport.this.aP0 = aP0;
      wcwmodifloteexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCwModifLoteExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wcwmodifloteexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60FilterFullText, GXv_char5) ;
      wcwmodifloteexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFEntFecEnt)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwmodifloteexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV58TFEntFecEnt );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV35TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwmodifloteexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFPrdNum_Sel, GXv_char5) ;
         wcwmodifloteexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwmodifloteexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFPrdNum, GXv_char5) ;
            wcwmodifloteexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwmodifloteexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFPrdNom_Sel, GXv_char5) ;
         wcwmodifloteexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFPrdNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcwmodifloteexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFPrdNom, GXv_char5) ;
            wcwmodifloteexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV38TFEntPrvNum) && (0==AV39TFEntPrvNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proveedor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwmodifloteexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFEntPrvNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwmodifloteexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFEntPrvNum_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFEntUniEnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFEntUniEnt_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cant Ent", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwmodifloteexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV40TFEntUniEnt)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwmodifloteexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV41TFEntUniEnt_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFEntUniRem)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFEntUniRem_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cant Disp", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwmodifloteexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV42TFEntUniRem)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwmodifloteexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV43TFEntUniRem_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFEntPre)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFEntPre_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Precio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwmodifloteexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV44TFEntPre)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwmodifloteexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV45TFEntPre_To)) );
      }
      if ( ! ( (0==AV46TFPedCod) && (0==AV47TFPedCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Pedido", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwmodifloteexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV46TFPedCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcwmodifloteexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV47TFPedCod_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("WCwModifLoteColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV18Session.getValue("WCwModifLoteColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV99GXV1 = 1 ;
      while ( AV99GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV99GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV99GXV1 = (int)(AV99GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV101Wcwmodifloteds_1_filterfulltext = AV60FilterFullText ;
      AV102Wcwmodifloteds_2_tfentfecent = AV58TFEntFecEnt ;
      AV103Wcwmodifloteds_3_tfprdnum = AV34TFPrdNum ;
      AV104Wcwmodifloteds_4_tfprdnum_sel = AV35TFPrdNum_Sel ;
      AV105Wcwmodifloteds_5_tfprdnom = AV36TFPrdNom ;
      AV106Wcwmodifloteds_6_tfprdnom_sel = AV37TFPrdNom_Sel ;
      AV107Wcwmodifloteds_7_tfentprvnum = AV38TFEntPrvNum ;
      AV108Wcwmodifloteds_8_tfentprvnum_to = AV39TFEntPrvNum_To ;
      AV109Wcwmodifloteds_9_tfentunient = AV40TFEntUniEnt ;
      AV110Wcwmodifloteds_10_tfentunient_to = AV41TFEntUniEnt_To ;
      AV111Wcwmodifloteds_11_tfentunirem = AV42TFEntUniRem ;
      AV112Wcwmodifloteds_12_tfentunirem_to = AV43TFEntUniRem_To ;
      AV113Wcwmodifloteds_13_tfentpre = AV44TFEntPre ;
      AV114Wcwmodifloteds_14_tfentpre_to = AV45TFEntPre_To ;
      AV115Wcwmodifloteds_15_tfpedcod = AV46TFPedCod ;
      AV116Wcwmodifloteds_16_tfpedcod_to = AV47TFPedCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV101Wcwmodifloteds_1_filterfulltext ,
                                           AV102Wcwmodifloteds_2_tfentfecent ,
                                           AV104Wcwmodifloteds_4_tfprdnum_sel ,
                                           AV103Wcwmodifloteds_3_tfprdnum ,
                                           AV106Wcwmodifloteds_6_tfprdnom_sel ,
                                           AV105Wcwmodifloteds_5_tfprdnom ,
                                           Integer.valueOf(AV107Wcwmodifloteds_7_tfentprvnum) ,
                                           Integer.valueOf(AV108Wcwmodifloteds_8_tfentprvnum_to) ,
                                           AV109Wcwmodifloteds_9_tfentunient ,
                                           AV110Wcwmodifloteds_10_tfentunient_to ,
                                           AV111Wcwmodifloteds_11_tfentunirem ,
                                           AV112Wcwmodifloteds_12_tfentunirem_to ,
                                           AV113Wcwmodifloteds_13_tfentpre ,
                                           AV114Wcwmodifloteds_14_tfentpre_to ,
                                           Integer.valueOf(AV115Wcwmodifloteds_15_tfpedcod) ,
                                           Integer.valueOf(AV116Wcwmodifloteds_16_tfpedcod_to) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A418EntUniEnt ,
                                           A419EntUniRem ,
                                           A417EntPre ,
                                           Integer.valueOf(A658PedCod) ,
                                           A415EntFecEnt ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV50Fec1 ,
                                           AV51Fec2 ,
                                           AV52PrdNum1 ,
                                           AV53PrdNum2 ,
                                           Integer.valueOf(AV54PrvNum) ,
                                           Byte.valueOf(A411EntCon) ,
                                           Byte.valueOf(AV55EntCon) ,
                                           AV49Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV101Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV101Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV101Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV101Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV101Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV101Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV101Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV101Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV103Wcwmodifloteds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV103Wcwmodifloteds_3_tfprdnum), 6, "%") ;
      lV105Wcwmodifloteds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV105Wcwmodifloteds_5_tfprdnom), 26, "%") ;
      /* Using cursor P08P92 */
      pr_default.execute(0, new Object[] {AV49Emprcod, AV50Fec1, AV51Fec2, AV52PrdNum1, AV52PrdNum1, AV53PrdNum2, AV53PrdNum2, Integer.valueOf(AV54PrvNum), Integer.valueOf(AV54PrvNum), Byte.valueOf(AV55EntCon), Byte.valueOf(AV55EntCon), lV101Wcwmodifloteds_1_filterfulltext, lV101Wcwmodifloteds_1_filterfulltext, lV101Wcwmodifloteds_1_filterfulltext, lV101Wcwmodifloteds_1_filterfulltext, lV101Wcwmodifloteds_1_filterfulltext, lV101Wcwmodifloteds_1_filterfulltext, lV101Wcwmodifloteds_1_filterfulltext, AV102Wcwmodifloteds_2_tfentfecent, lV103Wcwmodifloteds_3_tfprdnum, AV104Wcwmodifloteds_4_tfprdnum_sel, lV105Wcwmodifloteds_5_tfprdnom, AV106Wcwmodifloteds_6_tfprdnom_sel, Integer.valueOf(AV107Wcwmodifloteds_7_tfentprvnum), Integer.valueOf(AV108Wcwmodifloteds_8_tfentprvnum_to), AV109Wcwmodifloteds_9_tfentunient, AV110Wcwmodifloteds_10_tfentunient_to, AV111Wcwmodifloteds_11_tfentunirem, AV112Wcwmodifloteds_12_tfentunirem_to, AV113Wcwmodifloteds_13_tfentpre, AV114Wcwmodifloteds_14_tfentpre_to, Integer.valueOf(AV115Wcwmodifloteds_15_tfpedcod), Integer.valueOf(AV116Wcwmodifloteds_16_tfpedcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A411EntCon = P08P92_A411EntCon[0] ;
         A396EmprCod = P08P92_A396EmprCod[0] ;
         A658PedCod = P08P92_A658PedCod[0] ;
         n658PedCod = P08P92_n658PedCod[0] ;
         A417EntPre = P08P92_A417EntPre[0] ;
         A419EntUniRem = P08P92_A419EntUniRem[0] ;
         A418EntUniEnt = P08P92_A418EntUniEnt[0] ;
         A6156EntPrvNum = P08P92_A6156EntPrvNum[0] ;
         n6156EntPrvNum = P08P92_n6156EntPrvNum[0] ;
         A718PrdNom = P08P92_A718PrdNom[0] ;
         A719PrdNum = P08P92_A719PrdNum[0] ;
         A415EntFecEnt = P08P92_A415EntFecEnt[0] ;
         A12857EntNAlbar = P08P92_A12857EntNAlbar[0] ;
         A5686EntLotN = P08P92_A5686EntLotN[0] ;
         A597LinEnt = P08P92_A597LinEnt[0] ;
         A718PrdNom = P08P92_A718PrdNom[0] ;
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
            GXt_dtime6 = GXutil.resetTime( A415EntFecEnt );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
            wcwmodifloteexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char5) ;
            wcwmodifloteexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A6156EntPrvNum );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = AV22PrvNom ;
            GXv_char5[0] = A396EmprCod ;
            GXv_int7[0] = A6156EntPrvNum ;
            GXv_char8[0] = GXt_char4 ;
            new app.pprvnom(remoteHandle, context).execute( GXv_char5, GXv_int7, GXv_char8) ;
            wcwmodifloteexport.this.A396EmprCod = GXv_char5[0] ;
            wcwmodifloteexport.this.A6156EntPrvNum = GXv_int7[0] ;
            wcwmodifloteexport.this.GXt_char4 = GXv_char8[0] ;
            AV22PrvNom = GXt_char4 ;
            GXt_char4 = "" ;
            GXv_char8[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV22PrvNom, GXv_char8) ;
            wcwmodifloteexport.this.GXt_char4 = GXv_char8[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A418EntUniEnt)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A419EntUniRem)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A417EntPre)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV56EntNAlbar = A12857EntNAlbar ;
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('0',3),t(',',7),t('0',3),t(',',7),t('255',3),t(')',4) ]
               Target    : [ t('Entnalbar',23),t('Backcolor',3) ]
               ForType   : 29
               Type      : []
            */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('255',3),t(',',7),t('255',3),t(',',7),t('255',3),t(')',4) ]
               Target    : [ t('Entnalbar',23),t('Forecolor',3) ]
               ForType   : 29
               Type      : []
            */
            GXt_char4 = "" ;
            GXv_char8[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56EntNAlbar, GXv_char8) ;
            wcwmodifloteexport.this.GXt_char4 = GXv_char8[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV57EntLotN = A5686EntLotN ;
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /* * Property Backcolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('0',3),t(',',7),t('0',3),t(',',7),t('255',3),t(')',4) ]
               Target    : [ t('Entlotn',23),t('Backcolor',3) ]
               ForType   : 29
               Type      : []
            */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /* * Property Forecolor not supported in */
            /*
               Assignment error:
               ================
               Expression: [ t('rgb(',1),t('255',3),t(',',7),t('255',3),t(',',7),t('255',3),t(')',4) ]
               Target    : [ t('Entlotn',23),t('Forecolor',3) ]
               ForType   : 29
               Type      : []
            */
            GXt_char4 = "" ;
            GXv_char8[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57EntLotN, GXv_char8) ;
            wcwmodifloteexport.this.GXt_char4 = GXv_char8[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A658PedCod );
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
      GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "EntFecEnt", "", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "PrdNum", "", "Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "PrdNom", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "EntPrvNum", "", "Proveedor", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&PrvNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "EntUniEnt", "", "Cant Ent", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "EntUniRem", "", "Cant Disp", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "EntPre", "", "Precio", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&EntNAlbar", "", "Nº Doc", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&EntLotN", "", "Lote", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "PedCod", "", "Nº Pedido", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char8[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCwModifLoteColumnsSelector", GXv_char8) ;
      wcwmodifloteexport.this.GXt_char4 = GXv_char8[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector10[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, GXv_SdtWWPColumnsSelector10) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector9[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue("WCwModifLoteGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCwModifLoteGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("WCwModifLoteGridState"), null, null);
      }
      AV16OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV117GXV2 = 1 ;
      while ( AV117GXV2 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV117GXV2));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV60FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTFECENT") == 0 )
         {
            AV58TFEntFecEnt = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV34TFPrdNum = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV35TFPrdNum_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV36TFPrdNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV37TFPrdNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRVNUM") == 0 )
         {
            AV38TFEntPrvNum = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFEntPrvNum_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIENT") == 0 )
         {
            AV40TFEntUniEnt = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFEntUniEnt_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIREM") == 0 )
         {
            AV42TFEntUniRem = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFEntUniRem_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRE") == 0 )
         {
            AV44TFEntPre = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFEntPre_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV46TFPedCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFPedCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV49Emprcod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC1") == 0 )
         {
            AV50Fec1 = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC2") == 0 )
         {
            AV51Fec2 = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM1") == 0 )
         {
            AV52PrdNum1 = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM2") == 0 )
         {
            AV53PrdNum2 = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV54PrvNum = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ENTCON") == 0 )
         {
            AV55EntCon = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV117GXV2 = (int)(AV117GXV2+1) ;
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
      this.aP0[0] = wcwmodifloteexport.this.AV11Filename;
      this.aP1[0] = wcwmodifloteexport.this.AV12ErrorMessage;
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
      AV60FilterFullText = "" ;
      AV58TFEntFecEnt = GXutil.nullDate() ;
      AV35TFPrdNum_Sel = "" ;
      AV34TFPrdNum = "" ;
      AV37TFPrdNom_Sel = "" ;
      AV36TFPrdNom = "" ;
      AV40TFEntUniEnt = DecimalUtil.ZERO ;
      AV41TFEntUniEnt_To = DecimalUtil.ZERO ;
      AV42TFEntUniRem = DecimalUtil.ZERO ;
      AV43TFEntUniRem_To = DecimalUtil.ZERO ;
      AV44TFEntPre = DecimalUtil.ZERO ;
      AV45TFEntPre_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV18Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A415EntFecEnt = GXutil.nullDate() ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A396EmprCod = "" ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      A12857EntNAlbar = "" ;
      A5686EntLotN = "" ;
      AV101Wcwmodifloteds_1_filterfulltext = "" ;
      AV102Wcwmodifloteds_2_tfentfecent = GXutil.nullDate() ;
      AV103Wcwmodifloteds_3_tfprdnum = "" ;
      AV104Wcwmodifloteds_4_tfprdnum_sel = "" ;
      AV105Wcwmodifloteds_5_tfprdnom = "" ;
      AV106Wcwmodifloteds_6_tfprdnom_sel = "" ;
      AV109Wcwmodifloteds_9_tfentunient = DecimalUtil.ZERO ;
      AV110Wcwmodifloteds_10_tfentunient_to = DecimalUtil.ZERO ;
      AV111Wcwmodifloteds_11_tfentunirem = DecimalUtil.ZERO ;
      AV112Wcwmodifloteds_12_tfentunirem_to = DecimalUtil.ZERO ;
      AV113Wcwmodifloteds_13_tfentpre = DecimalUtil.ZERO ;
      AV114Wcwmodifloteds_14_tfentpre_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV101Wcwmodifloteds_1_filterfulltext = "" ;
      lV103Wcwmodifloteds_3_tfprdnum = "" ;
      lV105Wcwmodifloteds_5_tfprdnom = "" ;
      AV50Fec1 = GXutil.nullDate() ;
      AV51Fec2 = GXutil.nullDate() ;
      AV52PrdNum1 = "" ;
      AV53PrdNum2 = "" ;
      AV49Emprcod = "" ;
      P08P92_A411EntCon = new byte[1] ;
      P08P92_A396EmprCod = new String[] {""} ;
      P08P92_A658PedCod = new int[1] ;
      P08P92_n658PedCod = new boolean[] {false} ;
      P08P92_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08P92_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08P92_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08P92_A6156EntPrvNum = new int[1] ;
      P08P92_n6156EntPrvNum = new boolean[] {false} ;
      P08P92_A718PrdNom = new String[] {""} ;
      P08P92_A719PrdNum = new String[] {""} ;
      P08P92_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08P92_A12857EntNAlbar = new String[] {""} ;
      P08P92_A5686EntLotN = new String[] {""} ;
      P08P92_A597LinEnt = new short[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV22PrvNom = "" ;
      GXv_char5 = new String[1] ;
      GXv_int7 = new int[1] ;
      AV56EntNAlbar = "" ;
      AV57EntLotN = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char8 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwmodifloteexport__default(),
         new Object[] {
             new Object[] {
            P08P92_A411EntCon, P08P92_A396EmprCod, P08P92_A658PedCod, P08P92_n658PedCod, P08P92_A417EntPre, P08P92_A419EntUniRem, P08P92_A418EntUniEnt, P08P92_A6156EntPrvNum, P08P92_n6156EntPrvNum, P08P92_A718PrdNom,
            P08P92_A719PrdNum, P08P92_A415EntFecEnt, P08P92_A12857EntNAlbar, P08P92_A5686EntLotN, P08P92_A597LinEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A411EntCon ;
   private byte AV55EntCon ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short A597LinEnt ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV38TFEntPrvNum ;
   private int AV39TFEntPrvNum_To ;
   private int AV46TFPedCod ;
   private int AV47TFPedCod_To ;
   private int AV99GXV1 ;
   private int A6156EntPrvNum ;
   private int A658PedCod ;
   private int AV107Wcwmodifloteds_7_tfentprvnum ;
   private int AV108Wcwmodifloteds_8_tfentprvnum_to ;
   private int AV115Wcwmodifloteds_15_tfpedcod ;
   private int AV116Wcwmodifloteds_16_tfpedcod_to ;
   private int AV54PrvNum ;
   private int GXv_int7[] ;
   private int AV117GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV40TFEntUniEnt ;
   private java.math.BigDecimal AV41TFEntUniEnt_To ;
   private java.math.BigDecimal AV42TFEntUniRem ;
   private java.math.BigDecimal AV43TFEntUniRem_To ;
   private java.math.BigDecimal AV44TFEntPre ;
   private java.math.BigDecimal AV45TFEntPre_To ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal AV109Wcwmodifloteds_9_tfentunient ;
   private java.math.BigDecimal AV110Wcwmodifloteds_10_tfentunient_to ;
   private java.math.BigDecimal AV111Wcwmodifloteds_11_tfentunirem ;
   private java.math.BigDecimal AV112Wcwmodifloteds_12_tfentunirem_to ;
   private java.math.BigDecimal AV113Wcwmodifloteds_13_tfentpre ;
   private java.math.BigDecimal AV114Wcwmodifloteds_14_tfentpre_to ;
   private String AV35TFPrdNum_Sel ;
   private String AV34TFPrdNum ;
   private String AV37TFPrdNom_Sel ;
   private String AV36TFPrdNom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private String A12857EntNAlbar ;
   private String A5686EntLotN ;
   private String AV103Wcwmodifloteds_3_tfprdnum ;
   private String AV104Wcwmodifloteds_4_tfprdnum_sel ;
   private String AV105Wcwmodifloteds_5_tfprdnom ;
   private String AV106Wcwmodifloteds_6_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV103Wcwmodifloteds_3_tfprdnum ;
   private String lV105Wcwmodifloteds_5_tfprdnom ;
   private String AV52PrdNum1 ;
   private String AV53PrdNum2 ;
   private String AV49Emprcod ;
   private String AV22PrvNom ;
   private String GXv_char5[] ;
   private String AV56EntNAlbar ;
   private String AV57EntLotN ;
   private String GXt_char4 ;
   private String GXv_char8[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV58TFEntFecEnt ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date AV102Wcwmodifloteds_2_tfentfecent ;
   private java.util.Date AV50Fec1 ;
   private java.util.Date AV51Fec2 ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n658PedCod ;
   private boolean n6156EntPrvNum ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV60FilterFullText ;
   private String AV101Wcwmodifloteds_1_filterfulltext ;
   private String lV101Wcwmodifloteds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P08P92_A411EntCon ;
   private String[] P08P92_A396EmprCod ;
   private int[] P08P92_A658PedCod ;
   private boolean[] P08P92_n658PedCod ;
   private java.math.BigDecimal[] P08P92_A417EntPre ;
   private java.math.BigDecimal[] P08P92_A419EntUniRem ;
   private java.math.BigDecimal[] P08P92_A418EntUniEnt ;
   private int[] P08P92_A6156EntPrvNum ;
   private boolean[] P08P92_n6156EntPrvNum ;
   private String[] P08P92_A718PrdNom ;
   private String[] P08P92_A719PrdNum ;
   private java.util.Date[] P08P92_A415EntFecEnt ;
   private String[] P08P92_A12857EntNAlbar ;
   private String[] P08P92_A5686EntLotN ;
   private short[] P08P92_A597LinEnt ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class wcwmodifloteexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08P92( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV101Wcwmodifloteds_1_filterfulltext ,
                                          java.util.Date AV102Wcwmodifloteds_2_tfentfecent ,
                                          String AV104Wcwmodifloteds_4_tfprdnum_sel ,
                                          String AV103Wcwmodifloteds_3_tfprdnum ,
                                          String AV106Wcwmodifloteds_6_tfprdnom_sel ,
                                          String AV105Wcwmodifloteds_5_tfprdnom ,
                                          int AV107Wcwmodifloteds_7_tfentprvnum ,
                                          int AV108Wcwmodifloteds_8_tfentprvnum_to ,
                                          java.math.BigDecimal AV109Wcwmodifloteds_9_tfentunient ,
                                          java.math.BigDecimal AV110Wcwmodifloteds_10_tfentunient_to ,
                                          java.math.BigDecimal AV111Wcwmodifloteds_11_tfentunirem ,
                                          java.math.BigDecimal AV112Wcwmodifloteds_12_tfentunirem_to ,
                                          java.math.BigDecimal AV113Wcwmodifloteds_13_tfentpre ,
                                          java.math.BigDecimal AV114Wcwmodifloteds_14_tfentpre_to ,
                                          int AV115Wcwmodifloteds_15_tfpedcod ,
                                          int AV116Wcwmodifloteds_16_tfpedcod_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A6156EntPrvNum ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A419EntUniRem ,
                                          java.math.BigDecimal A417EntPre ,
                                          int A658PedCod ,
                                          java.util.Date A415EntFecEnt ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          java.util.Date AV50Fec1 ,
                                          java.util.Date AV51Fec2 ,
                                          String AV52PrdNum1 ,
                                          String AV53PrdNum2 ,
                                          int AV54PrvNum ,
                                          byte A411EntCon ,
                                          byte AV55EntCon ,
                                          String AV49Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[33];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EntCon, T1.EmprCod, T1.PedCod, T1.EntPre, T1.EntUniRem, T1.EntUniEnt, T1.EntPrvNum, T2.PrdNom, T1.PrdNum, T1.EntFecEnt, T1.EntNAlbar, T1.EntLotN, T1.LinEnt" ;
      scmdbuf += " FROM (TXPENTALM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt <= ?)");
      addWhere(sWhereString, "(T1.PrdNum >= ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.PrdNum <= ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EntPrvNum = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EntCon = ? or ? = 9)");
      if ( ! (GXutil.strcmp("", AV101Wcwmodifloteds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EntPrvNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniRem,'999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
         GXv_int11[12] = (byte)(1) ;
         GXv_int11[13] = (byte)(1) ;
         GXv_int11[14] = (byte)(1) ;
         GXv_int11[15] = (byte)(1) ;
         GXv_int11[16] = (byte)(1) ;
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV102Wcwmodifloteds_2_tfentfecent)) )
      {
         addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcwmodifloteds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcwmodifloteds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcwmodifloteds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcwmodifloteds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcwmodifloteds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcwmodifloteds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (0==AV107Wcwmodifloteds_7_tfentprvnum) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (0==AV108Wcwmodifloteds_8_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Wcwmodifloteds_9_tfentunient)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt >= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Wcwmodifloteds_10_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt <= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Wcwmodifloteds_11_tfentunirem)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniRem >= ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Wcwmodifloteds_12_tfentunirem_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniRem <= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Wcwmodifloteds_13_tfentpre)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre >= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Wcwmodifloteds_14_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre <= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV115Wcwmodifloteds_15_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (0==AV116Wcwmodifloteds_16_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EntFecEnt" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EntFecEnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EntPrvNum" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EntPrvNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EntUniEnt" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EntUniEnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EntUniRem" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EntUniRem DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EntPre" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EntPre DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PedCod" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PedCod DESC" ;
      }
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P08P92(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08P92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 20);
               ((String[]) buf[13])[0] = rslt.getString(12, 26);
               ((short[]) buf[14])[0] = rslt.getShort(13);
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
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               return;
      }
   }

}

