package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webbcprodexport extends GXProcedure
{
   public webbcprodexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webbcprodexport.class ), "" );
   }

   public webbcprodexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      webbcprodexport.this.aP1 = new String[] {""};
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
      webbcprodexport.this.aP0 = aP0;
      webbcprodexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WebBCPRODExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (GXutil.strcmp("", AV70TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webbcprodexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFPrdNum_Sel, GXv_char5) ;
         webbcprodexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV69TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webbcprodexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFPrdNum, GXv_char5) ;
            webbcprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV72TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webbcprodexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFPrdNom_Sel, GXv_char5) ;
         webbcprodexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV71TFPrdNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webbcprodexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFPrdNom, GXv_char5) ;
            webbcprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV74TFPrdUcpDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webbcprodexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFPrdUcpDsc_Sel, GXv_char5) ;
         webbcprodexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV73TFPrdUcpDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidad", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webbcprodexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFPrdUcpDsc, GXv_char5) ;
            webbcprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFPrdPreAct)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFPrdPreAct_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Precio Actual", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webbcprodexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV75TFPrdPreAct)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webbcprodexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV76TFPrdPreAct_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83TFPrdDisponible)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84TFPrdDisponible_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Disponible", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webbcprodexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV83TFPrdDisponible)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webbcprodexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV84TFPrdDisponible_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV78TFPrvNif_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N.I.F.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webbcprodexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV78TFPrvNif_Sel, GXv_char5) ;
         webbcprodexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV77TFPrvNif)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N.I.F.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webbcprodexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV77TFPrvNif, GXv_char5) ;
            webbcprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV66VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV54Session.getValue("WebBCPRODColumnsSelector"), "") != 0 )
      {
         AV61ColumnsSelectorXML = AV54Session.getValue("WebBCPRODColumnsSelector") ;
         AV58ColumnsSelector.fromxml(AV61ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV87GXV1 = 1 ;
      while ( AV87GXV1 <= AV58ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV60ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV58ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV87GXV1));
         if ( AV60ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV66VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV60ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV60ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV60ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV66VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV66VisibleColumnCount), 1, 1).setColor( 11 );
            AV66VisibleColumnCount = (long)(AV66VisibleColumnCount+1) ;
         }
         AV87GXV1 = (int)(AV87GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV89Webbcprodds_1_tfprdnum = AV69TFPrdNum ;
      AV90Webbcprodds_2_tfprdnum_sel = AV70TFPrdNum_Sel ;
      AV91Webbcprodds_3_tfprdnom = AV71TFPrdNom ;
      AV92Webbcprodds_4_tfprdnom_sel = AV72TFPrdNom_Sel ;
      AV93Webbcprodds_5_tfprducpdsc = AV73TFPrdUcpDsc ;
      AV94Webbcprodds_6_tfprducpdsc_sel = AV74TFPrdUcpDsc_Sel ;
      AV95Webbcprodds_7_tfprdpreact = AV75TFPrdPreAct ;
      AV96Webbcprodds_8_tfprdpreact_to = AV76TFPrdPreAct_To ;
      AV97Webbcprodds_9_tfprddisponible = AV83TFPrdDisponible ;
      AV98Webbcprodds_10_tfprddisponible_to = AV84TFPrdDisponible_To ;
      AV99Webbcprodds_11_tfprvnif = AV77TFPrvNif ;
      AV100Webbcprodds_12_tfprvnif_sel = AV78TFPrvNif_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV90Webbcprodds_2_tfprdnum_sel ,
                                           AV89Webbcprodds_1_tfprdnum ,
                                           AV92Webbcprodds_4_tfprdnom_sel ,
                                           AV91Webbcprodds_3_tfprdnom ,
                                           AV94Webbcprodds_6_tfprducpdsc_sel ,
                                           AV93Webbcprodds_5_tfprducpdsc ,
                                           AV95Webbcprodds_7_tfprdpreact ,
                                           AV96Webbcprodds_8_tfprdpreact_to ,
                                           AV97Webbcprodds_9_tfprddisponible ,
                                           AV98Webbcprodds_10_tfprddisponible_to ,
                                           AV100Webbcprodds_12_tfprvnif_sel ,
                                           AV99Webbcprodds_11_tfprvnif ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A737PrdUcpDsc ,
                                           A724PrdPreAct ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A793PrvNif ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           A3936PrdEqLP ,
                                           AV80EmprCod ,
                                           A396EmprCod ,
                                           Byte.valueOf(A856ValCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV89Webbcprodds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV89Webbcprodds_1_tfprdnum), 6, "%") ;
      lV91Webbcprodds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV91Webbcprodds_3_tfprdnom), 26, "%") ;
      lV93Webbcprodds_5_tfprducpdsc = GXutil.padr( GXutil.rtrim( AV93Webbcprodds_5_tfprducpdsc), 8, "%") ;
      lV99Webbcprodds_11_tfprvnif = GXutil.padr( GXutil.rtrim( AV99Webbcprodds_11_tfprvnif), 20, "%") ;
      /* Using cursor P07ZR2 */
      pr_default.execute(0, new Object[] {AV80EmprCod, lV89Webbcprodds_1_tfprdnum, AV90Webbcprodds_2_tfprdnum_sel, lV91Webbcprodds_3_tfprdnom, AV92Webbcprodds_4_tfprdnom_sel, lV93Webbcprodds_5_tfprducpdsc, AV94Webbcprodds_6_tfprducpdsc_sel, AV95Webbcprodds_7_tfprdpreact, AV96Webbcprodds_8_tfprdpreact_to, AV97Webbcprodds_9_tfprddisponible, AV98Webbcprodds_10_tfprddisponible_to, lV99Webbcprodds_11_tfprvnif, AV100Webbcprodds_12_tfprvnif_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = P07ZR2_A795PrvNum[0] ;
         A742PrdUniCom = P07ZR2_A742PrdUniCom[0] ;
         A3936PrdEqLP = P07ZR2_A3936PrdEqLP[0] ;
         A856ValCod = P07ZR2_A856ValCod[0] ;
         A396EmprCod = P07ZR2_A396EmprCod[0] ;
         A793PrvNif = P07ZR2_A793PrvNif[0] ;
         n793PrvNif = P07ZR2_n793PrvNif[0] ;
         A724PrdPreAct = P07ZR2_A724PrdPreAct[0] ;
         A737PrdUcpDsc = P07ZR2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZR2_n737PrdUcpDsc[0] ;
         A718PrdNom = P07ZR2_A718PrdNom[0] ;
         A719PrdNum = P07ZR2_A719PrdNum[0] ;
         A685PrdCanRes = P07ZR2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P07ZR2_A704PrdExiAlm[0] ;
         A793PrvNif = P07ZR2_A793PrvNif[0] ;
         n793PrvNif = P07ZR2_n793PrvNif[0] ;
         A737PrdUcpDsc = P07ZR2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P07ZR2_n737PrdUcpDsc[0] ;
         if ( GXutil.strcmp(A3936PrdEqLP, httpContext.getMessage( "BC", "")) != 0 )
         {
            A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV66VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV58ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
               webbcprodexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV66VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV66VisibleColumnCount = (long)(AV66VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV58ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char5) ;
               webbcprodexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV66VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV66VisibleColumnCount = (long)(AV66VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV58ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A737PrdUcpDsc, GXv_char5) ;
               webbcprodexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV66VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV66VisibleColumnCount = (long)(AV66VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV58ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV66VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A724PrdPreAct)) );
               AV66VisibleColumnCount = (long)(AV66VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV58ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV66VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A13831PrdDisponi)) );
               AV66VisibleColumnCount = (long)(AV66VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV58ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A793PrvNif, GXv_char5) ;
               webbcprodexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV66VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV66VisibleColumnCount = (long)(AV66VisibleColumnCount+1) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S182 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
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
      AV58ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV58ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNum", "", "Producto", true, "") ;
      AV58ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV58ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNom", "", "Descripcion", true, "") ;
      AV58ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV58ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdUcpDsc", "", "Unidad", true, "") ;
      AV58ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV58ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdPreAct", "", "Precio Actual", true, "") ;
      AV58ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV58ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdDisponible", "", "Disponible", true, "") ;
      AV58ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV58ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrvNif", "", "N.I.F.", true, "") ;
      AV58ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV62UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebBCPRODColumnsSelector", GXv_char5) ;
      webbcprodexport.this.GXt_char4 = GXv_char5[0] ;
      AV62UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV62UserCustomValue)==0) ) )
      {
         AV59ColumnsSelectorAux.fromxml(AV62UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV59ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV58ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV59ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV58ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV54Session.getValue("WebBCPRODGridState"), "") == 0 )
      {
         AV56GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebBCPRODGridState"), null, null);
      }
      else
      {
         AV56GridState.fromxml(AV54Session.getValue("WebBCPRODGridState"), null, null);
      }
      AV16OrderedBy = AV56GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV56GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV101GXV2 = 1 ;
      while ( AV101GXV2 <= AV56GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV57GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV56GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV101GXV2));
         if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV69TFPrdNum = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV70TFPrdNum_Sel = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV71TFPrdNom = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV72TFPrdNom_Sel = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC") == 0 )
         {
            AV73TFPrdUcpDsc = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC_SEL") == 0 )
         {
            AV74TFPrdUcpDsc_Sel = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV75TFPrdPreAct = CommonUtil.decimalVal( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV76TFPrdPreAct_To = CommonUtil.decimalVal( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDISPONIBLE") == 0 )
         {
            AV83TFPrdDisponible = CommonUtil.decimalVal( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV84TFPrdDisponible_To = CommonUtil.decimalVal( AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF") == 0 )
         {
            AV77TFPrvNif = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF_SEL") == 0 )
         {
            AV78TFPrvNif_Sel = AV57GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV101GXV2 = (int)(AV101GXV2+1) ;
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
      this.aP0[0] = webbcprodexport.this.AV11Filename;
      this.aP1[0] = webbcprodexport.this.AV12ErrorMessage;
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
      AV70TFPrdNum_Sel = "" ;
      AV69TFPrdNum = "" ;
      AV72TFPrdNom_Sel = "" ;
      AV71TFPrdNom = "" ;
      AV74TFPrdUcpDsc_Sel = "" ;
      AV73TFPrdUcpDsc = "" ;
      AV75TFPrdPreAct = DecimalUtil.ZERO ;
      AV76TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV83TFPrdDisponible = DecimalUtil.ZERO ;
      AV84TFPrdDisponible_To = DecimalUtil.ZERO ;
      AV78TFPrvNif_Sel = "" ;
      AV77TFPrvNif = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV54Session = httpContext.getWebSession();
      AV61ColumnsSelectorXML = "" ;
      AV58ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV60ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A737PrdUcpDsc = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      A793PrvNif = "" ;
      AV89Webbcprodds_1_tfprdnum = "" ;
      AV90Webbcprodds_2_tfprdnum_sel = "" ;
      AV91Webbcprodds_3_tfprdnom = "" ;
      AV92Webbcprodds_4_tfprdnom_sel = "" ;
      AV93Webbcprodds_5_tfprducpdsc = "" ;
      AV94Webbcprodds_6_tfprducpdsc_sel = "" ;
      AV95Webbcprodds_7_tfprdpreact = DecimalUtil.ZERO ;
      AV96Webbcprodds_8_tfprdpreact_to = DecimalUtil.ZERO ;
      AV97Webbcprodds_9_tfprddisponible = DecimalUtil.ZERO ;
      AV98Webbcprodds_10_tfprddisponible_to = DecimalUtil.ZERO ;
      AV99Webbcprodds_11_tfprvnif = "" ;
      AV100Webbcprodds_12_tfprvnif_sel = "" ;
      scmdbuf = "" ;
      lV89Webbcprodds_1_tfprdnum = "" ;
      lV91Webbcprodds_3_tfprdnom = "" ;
      lV93Webbcprodds_5_tfprducpdsc = "" ;
      lV99Webbcprodds_11_tfprvnif = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A3936PrdEqLP = "" ;
      AV80EmprCod = "" ;
      A396EmprCod = "" ;
      P07ZR2_A795PrvNum = new int[1] ;
      P07ZR2_A742PrdUniCom = new byte[1] ;
      P07ZR2_A3936PrdEqLP = new String[] {""} ;
      P07ZR2_A856ValCod = new byte[1] ;
      P07ZR2_A396EmprCod = new String[] {""} ;
      P07ZR2_A793PrvNif = new String[] {""} ;
      P07ZR2_n793PrvNif = new boolean[] {false} ;
      P07ZR2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZR2_A737PrdUcpDsc = new String[] {""} ;
      P07ZR2_n737PrdUcpDsc = new boolean[] {false} ;
      P07ZR2_A718PrdNom = new String[] {""} ;
      P07ZR2_A719PrdNum = new String[] {""} ;
      P07ZR2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07ZR2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV62UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV59ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV56GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV57GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webbcprodexport__default(),
         new Object[] {
             new Object[] {
            P07ZR2_A795PrvNum, P07ZR2_A742PrdUniCom, P07ZR2_A3936PrdEqLP, P07ZR2_A856ValCod, P07ZR2_A396EmprCod, P07ZR2_A793PrvNif, P07ZR2_n793PrvNif, P07ZR2_A724PrdPreAct, P07ZR2_A737PrdUcpDsc, P07ZR2_n737PrdUcpDsc,
            P07ZR2_A718PrdNom, P07ZR2_A719PrdNum, P07ZR2_A685PrdCanRes, P07ZR2_A704PrdExiAlm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private byte A742PrdUniCom ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV87GXV1 ;
   private int A795PrvNum ;
   private int AV101GXV2 ;
   private long AV66VisibleColumnCount ;
   private java.math.BigDecimal AV75TFPrdPreAct ;
   private java.math.BigDecimal AV76TFPrdPreAct_To ;
   private java.math.BigDecimal AV83TFPrdDisponible ;
   private java.math.BigDecimal AV84TFPrdDisponible_To ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private java.math.BigDecimal AV95Webbcprodds_7_tfprdpreact ;
   private java.math.BigDecimal AV96Webbcprodds_8_tfprdpreact_to ;
   private java.math.BigDecimal AV97Webbcprodds_9_tfprddisponible ;
   private java.math.BigDecimal AV98Webbcprodds_10_tfprddisponible_to ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private String AV70TFPrdNum_Sel ;
   private String AV69TFPrdNum ;
   private String AV72TFPrdNom_Sel ;
   private String AV71TFPrdNom ;
   private String AV74TFPrdUcpDsc_Sel ;
   private String AV73TFPrdUcpDsc ;
   private String AV78TFPrvNif_Sel ;
   private String AV77TFPrvNif ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A737PrdUcpDsc ;
   private String A793PrvNif ;
   private String AV89Webbcprodds_1_tfprdnum ;
   private String AV90Webbcprodds_2_tfprdnum_sel ;
   private String AV91Webbcprodds_3_tfprdnom ;
   private String AV92Webbcprodds_4_tfprdnom_sel ;
   private String AV93Webbcprodds_5_tfprducpdsc ;
   private String AV94Webbcprodds_6_tfprducpdsc_sel ;
   private String AV99Webbcprodds_11_tfprvnif ;
   private String AV100Webbcprodds_12_tfprvnif_sel ;
   private String scmdbuf ;
   private String lV89Webbcprodds_1_tfprdnum ;
   private String lV91Webbcprodds_3_tfprdnom ;
   private String lV93Webbcprodds_5_tfprducpdsc ;
   private String lV99Webbcprodds_11_tfprvnif ;
   private String A3936PrdEqLP ;
   private String AV80EmprCod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n793PrvNif ;
   private boolean n737PrdUcpDsc ;
   private String AV61ColumnsSelectorXML ;
   private String AV62UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV54Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P07ZR2_A795PrvNum ;
   private byte[] P07ZR2_A742PrdUniCom ;
   private String[] P07ZR2_A3936PrdEqLP ;
   private byte[] P07ZR2_A856ValCod ;
   private String[] P07ZR2_A396EmprCod ;
   private String[] P07ZR2_A793PrvNif ;
   private boolean[] P07ZR2_n793PrvNif ;
   private java.math.BigDecimal[] P07ZR2_A724PrdPreAct ;
   private String[] P07ZR2_A737PrdUcpDsc ;
   private boolean[] P07ZR2_n737PrdUcpDsc ;
   private String[] P07ZR2_A718PrdNom ;
   private String[] P07ZR2_A719PrdNum ;
   private java.math.BigDecimal[] P07ZR2_A685PrdCanRes ;
   private java.math.BigDecimal[] P07ZR2_A704PrdExiAlm ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV56GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV57GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV58ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV59ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV60ColumnsSelector_Column ;
}

final  class webbcprodexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07ZR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV90Webbcprodds_2_tfprdnum_sel ,
                                          String AV89Webbcprodds_1_tfprdnum ,
                                          String AV92Webbcprodds_4_tfprdnom_sel ,
                                          String AV91Webbcprodds_3_tfprdnom ,
                                          String AV94Webbcprodds_6_tfprducpdsc_sel ,
                                          String AV93Webbcprodds_5_tfprducpdsc ,
                                          java.math.BigDecimal AV95Webbcprodds_7_tfprdpreact ,
                                          java.math.BigDecimal AV96Webbcprodds_8_tfprdpreact_to ,
                                          java.math.BigDecimal AV97Webbcprodds_9_tfprddisponible ,
                                          java.math.BigDecimal AV98Webbcprodds_10_tfprddisponible_to ,
                                          String AV100Webbcprodds_12_tfprvnif_sel ,
                                          String AV99Webbcprodds_11_tfprvnif ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A737PrdUcpDsc ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A793PrvNif ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String A3936PrdEqLP ,
                                          String AV80EmprCod ,
                                          String A396EmprCod ,
                                          byte A856ValCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[13];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.PrdUniCom AS PrdUniCom, T1.PrdEqLP, T1.ValCod, T1.EmprCod, T2.PrvNif, T1.PrdPreAct, T3.UniDsc AS PrdUcpDsc, T1.PrdNom, T1.PrdNum, T1.PrdCanRes," ;
      scmdbuf += " T1.PrdExiAlm FROM ((TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ValCod = 1)");
      if ( (GXutil.strcmp("", AV90Webbcprodds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV89Webbcprodds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Webbcprodds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Webbcprodds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Webbcprodds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Webbcprodds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Webbcprodds_6_tfprducpdsc_sel)==0) && ( ! (GXutil.strcmp("", AV93Webbcprodds_5_tfprducpdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Webbcprodds_6_tfprducpdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Webbcprodds_7_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Webbcprodds_8_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Webbcprodds_9_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Webbcprodds_10_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Webbcprodds_12_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV99Webbcprodds_11_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Webbcprodds_12_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNif = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.UniDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.UniDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvNif" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvNif DESC" ;
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
                  return conditional_P07ZR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07ZR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,4);
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
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 5);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               return;
      }
   }

}

