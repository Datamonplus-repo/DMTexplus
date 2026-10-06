package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpinformealmacentejidocrudo_cliente_referencia extends GXProcedure
{
   public dpinformealmacentejidocrudo_cliente_referencia( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpinformealmacentejidocrudo_cliente_referencia.class ), "" );
   }

   public dpinformealmacentejidocrudo_cliente_referencia( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia> executeUdp( String aP0 ,
                                                                                               java.util.Date aP1 ,
                                                                                               java.util.Date aP2 ,
                                                                                               int aP3 ,
                                                                                               int aP4 ,
                                                                                               String aP5 ,
                                                                                               String aP6 ,
                                                                                               short aP7 ,
                                                                                               short aP8 ,
                                                                                               byte aP9 ,
                                                                                               byte aP10 ,
                                                                                               String aP11 ,
                                                                                               String aP12 ,
                                                                                               short aP13 ,
                                                                                               String aP14 )
   {
      dpinformealmacentejidocrudo_cliente_referencia.this.aP15 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        int aP3 ,
                        int aP4 ,
                        String aP5 ,
                        String aP6 ,
                        short aP7 ,
                        short aP8 ,
                        byte aP9 ,
                        byte aP10 ,
                        String aP11 ,
                        String aP12 ,
                        short aP13 ,
                        String aP14 ,
                        GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia>[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             int aP3 ,
                             int aP4 ,
                             String aP5 ,
                             String aP6 ,
                             short aP7 ,
                             short aP8 ,
                             byte aP9 ,
                             byte aP10 ,
                             String aP11 ,
                             String aP12 ,
                             short aP13 ,
                             String aP14 ,
                             GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia>[] aP15 )
   {
      dpinformealmacentejidocrudo_cliente_referencia.this.AV13Emprcod = aP0;
      dpinformealmacentejidocrudo_cliente_referencia.this.AV7AlbRFen = aP1;
      dpinformealmacentejidocrudo_cliente_referencia.this.AV8AlbRFen_to = aP2;
      dpinformealmacentejidocrudo_cliente_referencia.this.AV11CliCod = aP3;
      dpinformealmacentejidocrudo_cliente_referencia.this.AV12CliCod_to = aP4;
      dpinformealmacentejidocrudo_cliente_referencia.this.AV5AlbRef = aP5;
      dpinformealmacentejidocrudo_cliente_referencia.this.AV6AlbRef_to = aP6;
      dpinformealmacentejidocrudo_cliente_referencia.this.AV9AlbRTartC = aP7;
      dpinformealmacentejidocrudo_cliente_referencia.this.AV10AlbRTartC_to = aP8;
      dpinformealmacentejidocrudo_cliente_referencia.this.AV24Albrestfrom = aP9;
      dpinformealmacentejidocrudo_cliente_referencia.this.AV25Albrestto = aP10;
      dpinformealmacentejidocrudo_cliente_referencia.this.AV31AlbREntfrom = aP11;
      dpinformealmacentejidocrudo_cliente_referencia.this.AV32AlbREntto = aP12;
      dpinformealmacentejidocrudo_cliente_referencia.this.AV28TipEntCod = aP13;
      dpinformealmacentejidocrudo_cliente_referencia.this.AV29Tipo = aP14;
      dpinformealmacentejidocrudo_cliente_referencia.this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV31AlbREntfrom ,
                                           AV32AlbREntto ,
                                           A46AlbREnt ,
                                           A49AlbRFen ,
                                           AV8AlbRFen_to ,
                                           A45AlbRef ,
                                           AV6AlbRef_to ,
                                           Short.valueOf(A6263AlbRTartC) ,
                                           Short.valueOf(AV9AlbRTartC) ,
                                           Short.valueOf(AV10AlbRTartC_to) ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV24Albrestfrom) ,
                                           Byte.valueOf(AV25Albrestto) ,
                                           A55AlbRReo ,
                                           AV29Tipo ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV28TipEntCod) ,
                                           AV13Emprcod ,
                                           Integer.valueOf(AV11CliCod) ,
                                           AV5AlbRef ,
                                           AV7AlbRFen ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV12CliCod_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      /* Using cursor P001W2 */
      pr_default.execute(0, new Object[] {AV13Emprcod, Integer.valueOf(AV11CliCod), AV5AlbRef, AV7AlbRFen, AV8AlbRFen_to, AV6AlbRef_to, Short.valueOf(AV9AlbRTartC), Short.valueOf(AV10AlbRTartC_to), Byte.valueOf(AV24Albrestfrom), Byte.valueOf(AV25Albrestto), Short.valueOf(AV28TipEntCod), Short.valueOf(AV28TipEntCod), Integer.valueOf(AV12CliCod_to), AV31AlbREntfrom, AV32AlbREntto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1W2 = false ;
         A58AlbRUniEnt = P001W2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P001W2_A60AlbRUniUti[0] ;
         A49AlbRFen = P001W2_A49AlbRFen[0] ;
         A3613AlbRefDsc = P001W2_A3613AlbRefDsc[0] ;
         A56AlbRUni = P001W2_A56AlbRUni[0] ;
         A45AlbRef = P001W2_A45AlbRef[0] ;
         A252CliCod = P001W2_A252CliCod[0] ;
         A396EmprCod = P001W2_A396EmprCod[0] ;
         A46AlbREnt = P001W2_A46AlbREnt[0] ;
         A1211TipEntCod = P001W2_A1211TipEntCod[0] ;
         n1211TipEntCod = P001W2_n1211TipEntCod[0] ;
         A55AlbRReo = P001W2_A55AlbRReo[0] ;
         A47AlbREst = P001W2_A47AlbREst[0] ;
         A6263AlbRTartC = P001W2_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P001W2_n6263AlbRTartC[0] ;
         A279CliNom = P001W2_A279CliNom[0] ;
         A54AlbRPieUti = P001W2_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P001W2_A52AlbRPieEnt[0] ;
         A44AlbRecCod = P001W2_A44AlbRecCod[0] ;
         A279CliNom = P001W2_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV29Tipo) == 0 ) || ( GXutil.strcmp(AV29Tipo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
            Gxm1sdtinformealmacentejidocrudo_cliente_referencia = (app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia)new app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia(remoteHandle, context);
            Gxm2rootcol.add(Gxm1sdtinformealmacentejidocrudo_cliente_referencia, 0);
            Gxm1sdtinformealmacentejidocrudo_cliente_referencia.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clicod( A252CliCod );
            Gxm1sdtinformealmacentejidocrudo_cliente_referencia.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clinom( A279CliNom );
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001W2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P001W2_A252CliCod[0] == A252CliCod ) )
            {
               brk1W2 = false ;
               A58AlbRUniEnt = P001W2_A58AlbRUniEnt[0] ;
               A60AlbRUniUti = P001W2_A60AlbRUniUti[0] ;
               A49AlbRFen = P001W2_A49AlbRFen[0] ;
               A3613AlbRefDsc = P001W2_A3613AlbRefDsc[0] ;
               A56AlbRUni = P001W2_A56AlbRUni[0] ;
               A45AlbRef = P001W2_A45AlbRef[0] ;
               A54AlbRPieUti = P001W2_A54AlbRPieUti[0] ;
               A52AlbRPieEnt = P001W2_A52AlbRPieEnt[0] ;
               A44AlbRecCod = P001W2_A44AlbRecCod[0] ;
               A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
               Gxm3sdtinformealmacentejidocrudo_cliente_referencia_referencias = (app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia)new app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia(remoteHandle, context);
               Gxm1sdtinformealmacentejidocrudo_cliente_referencia.getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias().add(Gxm3sdtinformealmacentejidocrudo_cliente_referencia_referencias, 0);
               Gxm3sdtinformealmacentejidocrudo_cliente_referencia_referencias.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albref( A45AlbRef );
               GXt_char1 = "" ;
               GXv_char2[0] = GXt_char1 ;
               new app.ppartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A45AlbRef, GXv_char2) ;
               dpinformealmacentejidocrudo_cliente_referencia.this.GXt_char1 = GXv_char2[0] ;
               Gxm3sdtinformealmacentejidocrudo_cliente_referencia_referencias.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albrefdsc( ((GXutil.strcmp("", A3613AlbRefDsc)==0) ? GXt_char1 : A3613AlbRefDsc) );
               Gxm3sdtinformealmacentejidocrudo_cliente_referencia_referencias.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albruni( A56AlbRUni );
               AV18UnidadesEntradas = DecimalUtil.ZERO ;
               AV19UnidadesUtilizadas = DecimalUtil.ZERO ;
               AV20UnidadesDisponibles = DecimalUtil.ZERO ;
               AV27UnidadesLibres = DecimalUtil.ZERO ;
               AV21PiezasEntradas = 0 ;
               AV22PiezasUtilizadas = 0 ;
               AV23PiezasDisponibles = 0 ;
               AV26AlbRUniDis = DecimalUtil.ZERO ;
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001W2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P001W2_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P001W2_A45AlbRef[0], A45AlbRef) == 0 ) )
               {
                  brk1W2 = false ;
                  A58AlbRUniEnt = P001W2_A58AlbRUniEnt[0] ;
                  A60AlbRUniUti = P001W2_A60AlbRUniUti[0] ;
                  A49AlbRFen = P001W2_A49AlbRFen[0] ;
                  A54AlbRPieUti = P001W2_A54AlbRPieUti[0] ;
                  A52AlbRPieEnt = P001W2_A52AlbRPieEnt[0] ;
                  A44AlbRecCod = P001W2_A44AlbRecCod[0] ;
                  A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
                  AV18UnidadesEntradas = AV18UnidadesEntradas.add(A58AlbRUniEnt) ;
                  AV19UnidadesUtilizadas = AV19UnidadesUtilizadas.add(A60AlbRUniUti) ;
                  AV20UnidadesDisponibles = AV20UnidadesDisponibles.add((A58AlbRUniEnt.subtract(A60AlbRUniUti))) ;
                  AV27UnidadesLibres = AV27UnidadesLibres.add((A58AlbRUniEnt.subtract(A60AlbRUniUti))) ;
                  AV21PiezasEntradas = (int)(AV21PiezasEntradas+A52AlbRPieEnt) ;
                  AV22PiezasUtilizadas = (int)(AV22PiezasUtilizadas+A54AlbRPieUti) ;
                  AV23PiezasDisponibles = (int)(AV23PiezasDisponibles+A51AlbRPieDis) ;
                  brk1W2 = true ;
                  pr_default.readNext(0);
               }
               Gxm3sdtinformealmacentejidocrudo_cliente_referencia_referencias.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesentradas( AV18UnidadesEntradas );
               Gxm3sdtinformealmacentejidocrudo_cliente_referencia_referencias.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesutilizadas( AV19UnidadesUtilizadas );
               Gxm3sdtinformealmacentejidocrudo_cliente_referencia_referencias.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadeslibres( AV27UnidadesLibres );
               Gxm3sdtinformealmacentejidocrudo_cliente_referencia_referencias.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasentradas( AV21PiezasEntradas );
               Gxm3sdtinformealmacentejidocrudo_cliente_referencia_referencias.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasutilizadas( AV22PiezasUtilizadas );
               Gxm3sdtinformealmacentejidocrudo_cliente_referencia_referencias.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasdisponibles( ((AV23PiezasDisponibles<0) ? 0 : AV23PiezasDisponibles) );
               if ( ! brk1W2 )
               {
                  brk1W2 = true ;
                  pr_default.readNext(0);
               }
            }
         }
         if ( ! brk1W2 )
         {
            brk1W2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP15[0] = dpinformealmacentejidocrudo_cliente_referencia.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(0);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia>(app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia.class, "SDTInformeAlmacenTejidoCrudo_Cliente_Referencia", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A46AlbREnt = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A55AlbRReo = "" ;
      A396EmprCod = "" ;
      P001W2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001W2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001W2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P001W2_A3613AlbRefDsc = new String[] {""} ;
      P001W2_A56AlbRUni = new String[] {""} ;
      P001W2_A45AlbRef = new String[] {""} ;
      P001W2_A252CliCod = new int[1] ;
      P001W2_A396EmprCod = new String[] {""} ;
      P001W2_A46AlbREnt = new String[] {""} ;
      P001W2_A1211TipEntCod = new short[1] ;
      P001W2_n1211TipEntCod = new boolean[] {false} ;
      P001W2_A55AlbRReo = new String[] {""} ;
      P001W2_A47AlbREst = new byte[1] ;
      P001W2_A6263AlbRTartC = new short[1] ;
      P001W2_n6263AlbRTartC = new boolean[] {false} ;
      P001W2_A279CliNom = new String[] {""} ;
      P001W2_A54AlbRPieUti = new int[1] ;
      P001W2_A52AlbRPieEnt = new int[1] ;
      P001W2_A44AlbRecCod = new int[1] ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A3613AlbRefDsc = "" ;
      A56AlbRUni = "" ;
      A279CliNom = "" ;
      Gxm1sdtinformealmacentejidocrudo_cliente_referencia = new app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia(remoteHandle, context);
      Gxm3sdtinformealmacentejidocrudo_cliente_referencia_referencias = new app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV18UnidadesEntradas = DecimalUtil.ZERO ;
      AV19UnidadesUtilizadas = DecimalUtil.ZERO ;
      AV20UnidadesDisponibles = DecimalUtil.ZERO ;
      AV27UnidadesLibres = DecimalUtil.ZERO ;
      AV26AlbRUniDis = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpinformealmacentejidocrudo_cliente_referencia__default(),
         new Object[] {
             new Object[] {
            P001W2_A58AlbRUniEnt, P001W2_A60AlbRUniUti, P001W2_A49AlbRFen, P001W2_A3613AlbRefDsc, P001W2_A56AlbRUni, P001W2_A45AlbRef, P001W2_A252CliCod, P001W2_A396EmprCod, P001W2_A46AlbREnt, P001W2_A1211TipEntCod,
            P001W2_n1211TipEntCod, P001W2_A55AlbRReo, P001W2_A47AlbREst, P001W2_A6263AlbRTartC, P001W2_n6263AlbRTartC, P001W2_A279CliNom, P001W2_A54AlbRPieUti, P001W2_A52AlbRPieEnt, P001W2_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24Albrestfrom ;
   private byte AV25Albrestto ;
   private byte A47AlbREst ;
   private short AV9AlbRTartC ;
   private short AV10AlbRTartC_to ;
   private short AV28TipEntCod ;
   private short A6263AlbRTartC ;
   private short A1211TipEntCod ;
   private short Gx_err ;
   private int AV11CliCod ;
   private int AV12CliCod_to ;
   private int A252CliCod ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A44AlbRecCod ;
   private int A51AlbRPieDis ;
   private int AV21PiezasEntradas ;
   private int AV22PiezasUtilizadas ;
   private int AV23PiezasDisponibles ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV18UnidadesEntradas ;
   private java.math.BigDecimal AV19UnidadesUtilizadas ;
   private java.math.BigDecimal AV20UnidadesDisponibles ;
   private java.math.BigDecimal AV27UnidadesLibres ;
   private java.math.BigDecimal AV26AlbRUniDis ;
   private String AV13Emprcod ;
   private String AV5AlbRef ;
   private String AV6AlbRef_to ;
   private String AV31AlbREntfrom ;
   private String AV32AlbREntto ;
   private String AV29Tipo ;
   private String scmdbuf ;
   private String A46AlbREnt ;
   private String A45AlbRef ;
   private String A55AlbRReo ;
   private String A396EmprCod ;
   private String A3613AlbRefDsc ;
   private String A56AlbRUni ;
   private String A279CliNom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV7AlbRFen ;
   private java.util.Date AV8AlbRFen_to ;
   private java.util.Date A49AlbRFen ;
   private boolean brk1W2 ;
   private boolean n1211TipEntCod ;
   private boolean n6263AlbRTartC ;
   private GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia>[] aP15 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P001W2_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P001W2_A60AlbRUniUti ;
   private java.util.Date[] P001W2_A49AlbRFen ;
   private String[] P001W2_A3613AlbRefDsc ;
   private String[] P001W2_A56AlbRUni ;
   private String[] P001W2_A45AlbRef ;
   private int[] P001W2_A252CliCod ;
   private String[] P001W2_A396EmprCod ;
   private String[] P001W2_A46AlbREnt ;
   private short[] P001W2_A1211TipEntCod ;
   private boolean[] P001W2_n1211TipEntCod ;
   private String[] P001W2_A55AlbRReo ;
   private byte[] P001W2_A47AlbREst ;
   private short[] P001W2_A6263AlbRTartC ;
   private boolean[] P001W2_n6263AlbRTartC ;
   private String[] P001W2_A279CliNom ;
   private int[] P001W2_A54AlbRPieUti ;
   private int[] P001W2_A52AlbRPieEnt ;
   private int[] P001W2_A44AlbRecCod ;
   private GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia> Gxm2rootcol ;
   private app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia Gxm1sdtinformealmacentejidocrudo_cliente_referencia ;
   private app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia Gxm3sdtinformealmacentejidocrudo_cliente_referencia_referencias ;
}

final  class dpinformealmacentejidocrudo_cliente_referencia__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P001W2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV31AlbREntfrom ,
                                          String AV32AlbREntto ,
                                          String A46AlbREnt ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date AV8AlbRFen_to ,
                                          String A45AlbRef ,
                                          String AV6AlbRef_to ,
                                          short A6263AlbRTartC ,
                                          short AV9AlbRTartC ,
                                          short AV10AlbRTartC_to ,
                                          byte A47AlbREst ,
                                          byte AV24Albrestfrom ,
                                          byte AV25Albrestto ,
                                          String A55AlbRReo ,
                                          String AV29Tipo ,
                                          short A1211TipEntCod ,
                                          short AV28TipEntCod ,
                                          String AV13Emprcod ,
                                          int AV11CliCod ,
                                          String AV5AlbRef ,
                                          java.util.Date AV7AlbRFen ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          int AV12CliCod_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[15];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRFen, T1.AlbRefDsc, T1.AlbRUni, T1.AlbRef, T1.CliCod, T1.EmprCod, T1.AlbREnt, T1.TipEntCod, T1.AlbRReo, T1.AlbREst, T1.AlbRTartC," ;
      scmdbuf += " T2.CliNom, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRecCod FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod >= ? and T1.AlbRef >= ? and T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRTartC >= ?)");
      addWhere(sWhereString, "(T1.AlbRTartC <= ?)");
      addWhere(sWhereString, "(T1.AlbREst >= ?)");
      addWhere(sWhereString, "(T1.AlbREst <= ?)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      if ( ! (GXutil.strcmp("", AV31AlbREntfrom)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt >= ?)");
      }
      else
      {
         GXv_int3[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV32AlbREntto)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt <= ?)");
      }
      else
      {
         GXv_int3[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.AlbRef, T1.AlbRFen" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
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
                  return conditional_P001W2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001W2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 2);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 30);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((int[]) buf[18])[0] = rslt.getInt(17);
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
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
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
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               return;
      }
   }

}

