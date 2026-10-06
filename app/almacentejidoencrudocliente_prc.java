package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class almacentejidoencrudocliente_prc extends GXProcedure
{
   public almacentejidoencrudocliente_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidoencrudocliente_prc.class ), "" );
   }

   public almacentejidoencrudocliente_prc( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 )
   {
      almacentejidoencrudocliente_prc.this.aP14 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        java.util.Date[] aP4 ,
                        java.util.Date[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 ,
                        short[] aP11 ,
                        short[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 )
   {
      almacentejidoencrudocliente_prc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      almacentejidoencrudocliente_prc.this.AV8ImpCod = aP1[0];
      this.aP1 = aP1;
      almacentejidoencrudocliente_prc.this.AV26PCliente = aP2[0];
      this.aP2 = aP2;
      almacentejidoencrudocliente_prc.this.AV42UCliente = aP3[0];
      this.aP3 = aP3;
      almacentejidoencrudocliente_prc.this.AV27PFecha = aP4[0];
      this.aP4 = aP4;
      almacentejidoencrudocliente_prc.this.AV43UFecha = aP5[0];
      this.aP5 = aP5;
      almacentejidoencrudocliente_prc.this.AV10AlbRef_i = aP6[0];
      this.aP6 = aP6;
      almacentejidoencrudocliente_prc.this.AV9AlbRef_f = aP7[0];
      this.aP7 = aP7;
      almacentejidoencrudocliente_prc.this.AV12Albrenti = aP8[0];
      this.aP8 = aP8;
      almacentejidoencrudocliente_prc.this.AV11Albrentf = aP9[0];
      this.aP9 = aP9;
      almacentejidoencrudocliente_prc.this.AV30TipEntcodi = aP10[0];
      this.aP10 = aP10;
      almacentejidoencrudocliente_prc.this.AV28Tipartcod1 = aP11[0];
      this.aP11 = aP11;
      almacentejidoencrudocliente_prc.this.AV29Tipartcod2 = aP12[0];
      this.aP12 = aP12;
      almacentejidoencrudocliente_prc.this.AV22Estado_a = aP13[0];
      this.aP13 = aP13;
      almacentejidoencrudocliente_prc.this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = AV20ContDsc ;
      new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EM0000", ""), GXv_char1) ;
      almacentejidoencrudocliente_prc.this.AV20ContDsc = GXv_char1[0] ;
      GXt_int2 = AV23Moda21 ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int3) ;
      almacentejidoencrudocliente_prc.this.GXt_int2 = GXv_int3[0] ;
      AV23Moda21 = GXt_int2 ;
      GXt_int2 = AV18Cli350 ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int3) ;
      almacentejidoencrudocliente_prc.this.GXt_int2 = GXv_int3[0] ;
      AV18Cli350 = GXt_int2 ;
      GXt_int4 = AV21ContVal ;
      GXv_int5[0] = GXt_int4 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int5) ;
      almacentejidoencrudocliente_prc.this.GXt_int4 = GXv_int5[0] ;
      AV21ContVal = GXt_int4 ;
      AV25PAlbRest = (byte)(0) ;
      AV41UALbRest = (byte)(1) ;
      if ( GXutil.strcmp(AV22Estado_a, "0") == 0 )
      {
         AV25PAlbRest = (byte)(0) ;
         AV41UALbRest = (byte)(0) ;
      }
      if ( GXutil.strcmp(AV22Estado_a, "1") == 0 )
      {
         AV25PAlbRest = (byte)(1) ;
         AV41UALbRest = (byte)(1) ;
      }
      AV44AlmacenTejidoencrudoCliente_SDT.clear();
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV27PFecha ,
                                           AV43UFecha ,
                                           Integer.valueOf(AV26PCliente) ,
                                           Integer.valueOf(AV42UCliente) ,
                                           AV10AlbRef_i ,
                                           AV9AlbRef_f ,
                                           AV12Albrenti ,
                                           AV11Albrentf ,
                                           Short.valueOf(AV28Tipartcod1) ,
                                           Short.valueOf(AV29Tipartcod2) ,
                                           Byte.valueOf(AV25PAlbRest) ,
                                           Byte.valueOf(AV41UALbRest) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A45AlbRef ,
                                           A46AlbREnt ,
                                           Short.valueOf(A6263AlbRTartC) ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV30TipEntcodi) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0ATS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV30TipEntcodi), Short.valueOf(AV30TipEntcodi), AV27PFecha, AV43UFecha, Integer.valueOf(AV26PCliente), Integer.valueOf(AV42UCliente), AV10AlbRef_i, AV9AlbRef_f, AV12Albrenti, AV11Albrentf, Short.valueOf(AV28Tipartcod1), Short.valueOf(AV29Tipartcod2), Byte.valueOf(AV25PAlbRest), Byte.valueOf(AV41UALbRest)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkATS2 = false ;
         A49AlbRFen = P0ATS2_A49AlbRFen[0] ;
         A252CliCod = P0ATS2_A252CliCod[0] ;
         A46AlbREnt = P0ATS2_A46AlbREnt[0] ;
         A1211TipEntCod = P0ATS2_A1211TipEntCod[0] ;
         n1211TipEntCod = P0ATS2_n1211TipEntCod[0] ;
         A6263AlbRTartC = P0ATS2_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P0ATS2_n6263AlbRTartC[0] ;
         A47AlbREst = P0ATS2_A47AlbREst[0] ;
         A45AlbRef = P0ATS2_A45AlbRef[0] ;
         A52AlbRPieEnt = P0ATS2_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P0ATS2_A58AlbRUniEnt[0] ;
         A54AlbRPieUti = P0ATS2_A54AlbRPieUti[0] ;
         A60AlbRUniUti = P0ATS2_A60AlbRUniUti[0] ;
         A279CliNom = P0ATS2_A279CliNom[0] ;
         A44AlbRecCod = P0ATS2_A44AlbRecCod[0] ;
         A279CliNom = P0ATS2_A279CliNom[0] ;
         if ( ( AV23Moda21 == 1 ) && ( A252CliCod == 350 ) && ( AV18Cli350 == 1 ) && ( AV21ContVal == 1 ) )
         {
         }
         else
         {
            AV46TotPE = 0 ;
            AV47TotEnt = DecimalUtil.doubleToDec(0) ;
            AV48TotPU = 0 ;
            AV49TotUti = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ATS2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0ATS2_A252CliCod[0] == A252CliCod ) )
            {
               brkATS2 = false ;
               A49AlbRFen = P0ATS2_A49AlbRFen[0] ;
               A46AlbREnt = P0ATS2_A46AlbREnt[0] ;
               A1211TipEntCod = P0ATS2_A1211TipEntCod[0] ;
               n1211TipEntCod = P0ATS2_n1211TipEntCod[0] ;
               A6263AlbRTartC = P0ATS2_A6263AlbRTartC[0] ;
               n6263AlbRTartC = P0ATS2_n6263AlbRTartC[0] ;
               A47AlbREst = P0ATS2_A47AlbREst[0] ;
               A45AlbRef = P0ATS2_A45AlbRef[0] ;
               A52AlbRPieEnt = P0ATS2_A52AlbRPieEnt[0] ;
               A58AlbRUniEnt = P0ATS2_A58AlbRUniEnt[0] ;
               A54AlbRPieUti = P0ATS2_A54AlbRPieUti[0] ;
               A60AlbRUniUti = P0ATS2_A60AlbRUniUti[0] ;
               A44AlbRecCod = P0ATS2_A44AlbRecCod[0] ;
               if ( A1211TipEntCod != 9999 )
               {
                  if ( ( A1211TipEntCod == AV30TipEntcodi ) || (0==AV30TipEntcodi) )
                  {
                     AV46TotPE = (int)(AV46TotPE+A52AlbRPieEnt) ;
                     AV47TotEnt = AV47TotEnt.add(A58AlbRUniEnt) ;
                     AV48TotPU = (int)(AV48TotPU+A54AlbRPieUti) ;
                     AV49TotUti = AV49TotUti.add(A60AlbRUniUti) ;
                  }
               }
               brkATS2 = true ;
               pr_default.readNext(0);
            }
            AV50Saldo_u = AV47TotEnt.subtract(AV49TotUti) ;
            AV51Saldo_p = (int)(AV46TotPE-AV48TotPU) ;
            AV45AlmacenTejidoencrudoCliente_SDTItem = (app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem)new app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem(remoteHandle, context);
            AV45AlmacenTejidoencrudoCliente_SDTItem.setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clicod( A252CliCod );
            AV45AlmacenTejidoencrudoCliente_SDTItem.setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Clinom( A279CliNom );
            AV45AlmacenTejidoencrudoCliente_SDTItem.setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totent( AV47TotEnt );
            AV45AlmacenTejidoencrudoCliente_SDTItem.setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpe( AV46TotPE );
            AV45AlmacenTejidoencrudoCliente_SDTItem.setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totuti( AV49TotUti );
            AV45AlmacenTejidoencrudoCliente_SDTItem.setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Totpu( AV48TotPU );
            AV45AlmacenTejidoencrudoCliente_SDTItem.setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldou( AV56Saldou );
            AV45AlmacenTejidoencrudoCliente_SDTItem.setgxTv_SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem_Saldop( (int)(DecimalUtil.decToDouble(AV57Saldop)) );
            AV44AlmacenTejidoencrudoCliente_SDT.add(AV45AlmacenTejidoencrudoCliente_SDTItem, 0);
         }
         if ( ! brkATS2 )
         {
            brkATS2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      AV14AlmacenTejidoencrudoCliente_SDTjson = AV44AlmacenTejidoencrudoCliente_SDT.toJSonString(false) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = almacentejidoencrudocliente_prc.this.A396EmprCod;
      this.aP1[0] = almacentejidoencrudocliente_prc.this.AV8ImpCod;
      this.aP2[0] = almacentejidoencrudocliente_prc.this.AV26PCliente;
      this.aP3[0] = almacentejidoencrudocliente_prc.this.AV42UCliente;
      this.aP4[0] = almacentejidoencrudocliente_prc.this.AV27PFecha;
      this.aP5[0] = almacentejidoencrudocliente_prc.this.AV43UFecha;
      this.aP6[0] = almacentejidoencrudocliente_prc.this.AV10AlbRef_i;
      this.aP7[0] = almacentejidoencrudocliente_prc.this.AV9AlbRef_f;
      this.aP8[0] = almacentejidoencrudocliente_prc.this.AV12Albrenti;
      this.aP9[0] = almacentejidoencrudocliente_prc.this.AV11Albrentf;
      this.aP10[0] = almacentejidoencrudocliente_prc.this.AV30TipEntcodi;
      this.aP11[0] = almacentejidoencrudocliente_prc.this.AV28Tipartcod1;
      this.aP12[0] = almacentejidoencrudocliente_prc.this.AV29Tipartcod2;
      this.aP13[0] = almacentejidoencrudocliente_prc.this.AV22Estado_a;
      this.aP14[0] = almacentejidoencrudocliente_prc.this.AV14AlmacenTejidoencrudoCliente_SDTjson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14AlmacenTejidoencrudoCliente_SDTjson = "" ;
      AV20ContDsc = "" ;
      GXv_char1 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_int5 = new int[1] ;
      AV44AlmacenTejidoencrudoCliente_SDT = new GXBaseCollection<app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem>(app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem.class, "AlmacenTejidoencrudoCliente_SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A46AlbREnt = "" ;
      P0ATS2_A396EmprCod = new String[] {""} ;
      P0ATS2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATS2_A252CliCod = new int[1] ;
      P0ATS2_A46AlbREnt = new String[] {""} ;
      P0ATS2_A1211TipEntCod = new short[1] ;
      P0ATS2_n1211TipEntCod = new boolean[] {false} ;
      P0ATS2_A6263AlbRTartC = new short[1] ;
      P0ATS2_n6263AlbRTartC = new boolean[] {false} ;
      P0ATS2_A47AlbREst = new byte[1] ;
      P0ATS2_A45AlbRef = new String[] {""} ;
      P0ATS2_A52AlbRPieEnt = new int[1] ;
      P0ATS2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATS2_A54AlbRPieUti = new int[1] ;
      P0ATS2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATS2_A279CliNom = new String[] {""} ;
      P0ATS2_A44AlbRecCod = new int[1] ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      AV47TotEnt = DecimalUtil.ZERO ;
      AV49TotUti = DecimalUtil.ZERO ;
      AV50Saldo_u = DecimalUtil.ZERO ;
      AV45AlmacenTejidoencrudoCliente_SDTItem = new app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem(remoteHandle, context);
      AV56Saldou = DecimalUtil.ZERO ;
      AV57Saldop = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacentejidoencrudocliente_prc__default(),
         new Object[] {
             new Object[] {
            P0ATS2_A396EmprCod, P0ATS2_A49AlbRFen, P0ATS2_A252CliCod, P0ATS2_A46AlbREnt, P0ATS2_A1211TipEntCod, P0ATS2_n1211TipEntCod, P0ATS2_A6263AlbRTartC, P0ATS2_n6263AlbRTartC, P0ATS2_A47AlbREst, P0ATS2_A45AlbRef,
            P0ATS2_A52AlbRPieEnt, P0ATS2_A58AlbRUniEnt, P0ATS2_A54AlbRPieUti, P0ATS2_A60AlbRUniUti, P0ATS2_A279CliNom, P0ATS2_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV23Moda21 ;
   private byte AV18Cli350 ;
   private byte GXt_int2 ;
   private byte GXv_int3[] ;
   private byte AV25PAlbRest ;
   private byte AV41UALbRest ;
   private byte A47AlbREst ;
   private short AV30TipEntcodi ;
   private short AV28Tipartcod1 ;
   private short AV29Tipartcod2 ;
   private short A6263AlbRTartC ;
   private short A1211TipEntCod ;
   private short Gx_err ;
   private int AV26PCliente ;
   private int AV42UCliente ;
   private int AV21ContVal ;
   private int GXt_int4 ;
   private int GXv_int5[] ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A44AlbRecCod ;
   private int AV46TotPE ;
   private int AV48TotPU ;
   private int AV51Saldo_p ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV47TotEnt ;
   private java.math.BigDecimal AV49TotUti ;
   private java.math.BigDecimal AV50Saldo_u ;
   private java.math.BigDecimal AV56Saldou ;
   private java.math.BigDecimal AV57Saldop ;
   private String A396EmprCod ;
   private String AV8ImpCod ;
   private String AV10AlbRef_i ;
   private String AV9AlbRef_f ;
   private String AV12Albrenti ;
   private String AV11Albrentf ;
   private String AV22Estado_a ;
   private String AV20ContDsc ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A45AlbRef ;
   private String A46AlbREnt ;
   private String A279CliNom ;
   private java.util.Date AV27PFecha ;
   private java.util.Date AV43UFecha ;
   private java.util.Date A49AlbRFen ;
   private boolean brkATS2 ;
   private boolean n1211TipEntCod ;
   private boolean n6263AlbRTartC ;
   private String AV14AlmacenTejidoencrudoCliente_SDTjson ;
   private String[] aP14 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private java.util.Date[] aP4 ;
   private java.util.Date[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private short[] aP10 ;
   private short[] aP11 ;
   private short[] aP12 ;
   private String[] aP13 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ATS2_A396EmprCod ;
   private java.util.Date[] P0ATS2_A49AlbRFen ;
   private int[] P0ATS2_A252CliCod ;
   private String[] P0ATS2_A46AlbREnt ;
   private short[] P0ATS2_A1211TipEntCod ;
   private boolean[] P0ATS2_n1211TipEntCod ;
   private short[] P0ATS2_A6263AlbRTartC ;
   private boolean[] P0ATS2_n6263AlbRTartC ;
   private byte[] P0ATS2_A47AlbREst ;
   private String[] P0ATS2_A45AlbRef ;
   private int[] P0ATS2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P0ATS2_A58AlbRUniEnt ;
   private int[] P0ATS2_A54AlbRPieUti ;
   private java.math.BigDecimal[] P0ATS2_A60AlbRUniUti ;
   private String[] P0ATS2_A279CliNom ;
   private int[] P0ATS2_A44AlbRecCod ;
   private GXBaseCollection<app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem> AV44AlmacenTejidoencrudoCliente_SDT ;
   private app.SdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem AV45AlmacenTejidoencrudoCliente_SDTItem ;
}

final  class almacentejidoencrudocliente_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ATS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV27PFecha ,
                                          java.util.Date AV43UFecha ,
                                          int AV26PCliente ,
                                          int AV42UCliente ,
                                          String AV10AlbRef_i ,
                                          String AV9AlbRef_f ,
                                          String AV12Albrenti ,
                                          String AV11Albrentf ,
                                          short AV28Tipartcod1 ,
                                          short AV29Tipartcod2 ,
                                          byte AV25PAlbRest ,
                                          byte AV41UALbRest ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A45AlbRef ,
                                          String A46AlbREnt ,
                                          short A6263AlbRTartC ,
                                          byte A47AlbREst ,
                                          short A1211TipEntCod ,
                                          short AV30TipEntcodi ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[15];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRFen, T1.CliCod, T1.AlbREnt, T1.TipEntCod, T1.AlbRTartC, T1.AlbREst, T1.AlbRef, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRPieUti, T1.AlbRUniUti," ;
      scmdbuf += " T2.CliNom, T1.AlbRecCod FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.TipEntCod <> 9999)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27PFecha)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43UFecha)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV26PCliente) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV42UCliente) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10AlbRef_i)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9AlbRef_f)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12Albrenti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11Albrentf)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV28Tipartcod1) )
      {
         addWhere(sWhereString, "(T1.AlbRTartC >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV29Tipartcod2) )
      {
         addWhere(sWhereString, "(T1.AlbRTartC <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV25PAlbRest) )
      {
         addWhere(sWhereString, "(T1.AlbREst >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV41UALbRest) )
      {
         addWhere(sWhereString, "(T1.AlbREst <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P0ATS2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ATS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 30);
               ((int[]) buf[15])[0] = rslt.getInt(14);
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
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
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
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               return;
      }
   }

}

