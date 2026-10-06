package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpinformealmacentejidocrudo_cliente extends GXProcedure
{
   public dpinformealmacentejidocrudo_cliente( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpinformealmacentejidocrudo_cliente.class ), "" );
   }

   public dpinformealmacentejidocrudo_cliente( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente> executeUdp( String aP0 ,
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
      dpinformealmacentejidocrudo_cliente.this.aP15 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente>()};
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
                        GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente>[] aP15 )
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
                             GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente>[] aP15 )
   {
      dpinformealmacentejidocrudo_cliente.this.AV5Emprcod = aP0;
      dpinformealmacentejidocrudo_cliente.this.AV20AlbRFen = aP1;
      dpinformealmacentejidocrudo_cliente.this.AV21AlbRFen_to = aP2;
      dpinformealmacentejidocrudo_cliente.this.AV24CliCod = aP3;
      dpinformealmacentejidocrudo_cliente.this.AV16CliCod_to = aP4;
      dpinformealmacentejidocrudo_cliente.this.AV18AlbRef = aP5;
      dpinformealmacentejidocrudo_cliente.this.AV19AlbRef_to = aP6;
      dpinformealmacentejidocrudo_cliente.this.AV22AlbRTartC = aP7;
      dpinformealmacentejidocrudo_cliente.this.AV23AlbRTartC_to = aP8;
      dpinformealmacentejidocrudo_cliente.this.AV25Albrestfrom = aP9;
      dpinformealmacentejidocrudo_cliente.this.AV26Albrestto = aP10;
      dpinformealmacentejidocrudo_cliente.this.AV28AlbREntfrom = aP11;
      dpinformealmacentejidocrudo_cliente.this.AV29AlbREntto = aP12;
      dpinformealmacentejidocrudo_cliente.this.AV30TipEntCod = aP13;
      dpinformealmacentejidocrudo_cliente.this.AV31Tipo = aP14;
      dpinformealmacentejidocrudo_cliente.this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV28AlbREntfrom ,
                                           AV29AlbREntto ,
                                           A46AlbREnt ,
                                           A49AlbRFen ,
                                           AV21AlbRFen_to ,
                                           A45AlbRef ,
                                           AV18AlbRef ,
                                           AV19AlbRef_to ,
                                           Short.valueOf(A6263AlbRTartC) ,
                                           Short.valueOf(AV22AlbRTartC) ,
                                           Short.valueOf(AV23AlbRTartC_to) ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV25Albrestfrom) ,
                                           Byte.valueOf(AV26Albrestto) ,
                                           A55AlbRReo ,
                                           AV31Tipo ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV30TipEntCod) ,
                                           AV5Emprcod ,
                                           Integer.valueOf(AV24CliCod) ,
                                           AV20AlbRFen ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV16CliCod_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      /* Using cursor P001X2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV24CliCod), AV20AlbRFen, AV21AlbRFen_to, AV18AlbRef, AV19AlbRef_to, Short.valueOf(AV22AlbRTartC), Short.valueOf(AV23AlbRTartC_to), Byte.valueOf(AV25Albrestfrom), Byte.valueOf(AV26Albrestto), Short.valueOf(AV30TipEntCod), Short.valueOf(AV30TipEntCod), Integer.valueOf(AV16CliCod_to), AV28AlbREntfrom, AV29AlbREntto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1X2 = false ;
         A49AlbRFen = P001X2_A49AlbRFen[0] ;
         A252CliCod = P001X2_A252CliCod[0] ;
         A396EmprCod = P001X2_A396EmprCod[0] ;
         A46AlbREnt = P001X2_A46AlbREnt[0] ;
         A1211TipEntCod = P001X2_A1211TipEntCod[0] ;
         n1211TipEntCod = P001X2_n1211TipEntCod[0] ;
         A55AlbRReo = P001X2_A55AlbRReo[0] ;
         A47AlbREst = P001X2_A47AlbREst[0] ;
         A6263AlbRTartC = P001X2_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P001X2_n6263AlbRTartC[0] ;
         A45AlbRef = P001X2_A45AlbRef[0] ;
         A279CliNom = P001X2_A279CliNom[0] ;
         A54AlbRPieUti = P001X2_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P001X2_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P001X2_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P001X2_A58AlbRUniEnt[0] ;
         A44AlbRecCod = P001X2_A44AlbRecCod[0] ;
         A279CliNom = P001X2_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV31Tipo) == 0 ) || ( GXutil.strcmp(AV31Tipo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
            {
               A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            }
            else
            {
               if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
               {
                  A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               }
            }
            A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
            Gxm1sdtinformealmacentejidocrudo_cliente = (app.SdtSDTInformeAlmacenTejidoCrudo_Cliente)new app.SdtSDTInformeAlmacenTejidoCrudo_Cliente(remoteHandle, context);
            Gxm2rootcol.add(Gxm1sdtinformealmacentejidocrudo_cliente, 0);
            Gxm1sdtinformealmacentejidocrudo_cliente.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clicod( A252CliCod );
            Gxm1sdtinformealmacentejidocrudo_cliente.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clinom( A279CliNom );
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001X2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P001X2_A252CliCod[0] == A252CliCod ) )
            {
               brk1X2 = false ;
               A49AlbRFen = P001X2_A49AlbRFen[0] ;
               A54AlbRPieUti = P001X2_A54AlbRPieUti[0] ;
               A52AlbRPieEnt = P001X2_A52AlbRPieEnt[0] ;
               A60AlbRUniUti = P001X2_A60AlbRUniUti[0] ;
               A58AlbRUniEnt = P001X2_A58AlbRUniEnt[0] ;
               A44AlbRecCod = P001X2_A44AlbRecCod[0] ;
               if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
               {
                  A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
               }
               else
               {
                  if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
                  {
                     A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
                  }
                  else
                  {
                     A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
                  }
               }
               A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
               Gxm3sdtinformealmacentejidocrudo_cliente_unidadespiezas = (app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item)new app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item(remoteHandle, context);
               Gxm1sdtinformealmacentejidocrudo_cliente.getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas().add(Gxm3sdtinformealmacentejidocrudo_cliente_unidadespiezas, 0);
               AV10UnidadesEntradas = DecimalUtil.ZERO ;
               AV11UnidadesUtilizadas = DecimalUtil.ZERO ;
               AV12UnidadesDisponibles = DecimalUtil.ZERO ;
               AV13PiezasEntradas = 0 ;
               AV14PiezasUtilizadas = 0 ;
               AV15PiezasDisponibles = 0 ;
               AV27unidadeslibres = DecimalUtil.ZERO ;
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001X2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P001X2_A252CliCod[0] == A252CliCod ) )
               {
                  brk1X2 = false ;
                  A49AlbRFen = P001X2_A49AlbRFen[0] ;
                  A54AlbRPieUti = P001X2_A54AlbRPieUti[0] ;
                  A52AlbRPieEnt = P001X2_A52AlbRPieEnt[0] ;
                  A60AlbRUniUti = P001X2_A60AlbRUniUti[0] ;
                  A58AlbRUniEnt = P001X2_A58AlbRUniEnt[0] ;
                  A44AlbRecCod = P001X2_A44AlbRecCod[0] ;
                  if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
                  {
                     A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
                  }
                  else
                  {
                     if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
                     {
                        A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
                     }
                     else
                     {
                        A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
                     }
                  }
                  A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
                  AV10UnidadesEntradas = AV10UnidadesEntradas.add(A58AlbRUniEnt) ;
                  AV11UnidadesUtilizadas = AV11UnidadesUtilizadas.add(A60AlbRUniUti) ;
                  AV12UnidadesDisponibles = AV12UnidadesDisponibles.add(A57AlbRUniDis) ;
                  AV27unidadeslibres = AV27unidadeslibres.add((A58AlbRUniEnt.subtract(A60AlbRUniUti))) ;
                  AV13PiezasEntradas = (int)(AV13PiezasEntradas+A52AlbRPieEnt) ;
                  AV14PiezasUtilizadas = (int)(AV14PiezasUtilizadas+A54AlbRPieUti) ;
                  AV15PiezasDisponibles = (int)(AV15PiezasDisponibles+A51AlbRPieDis) ;
                  brk1X2 = true ;
                  pr_default.readNext(0);
               }
               Gxm3sdtinformealmacentejidocrudo_cliente_unidadespiezas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesentradas( AV10UnidadesEntradas );
               Gxm3sdtinformealmacentejidocrudo_cliente_unidadespiezas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesutilizadas( AV11UnidadesUtilizadas );
               Gxm3sdtinformealmacentejidocrudo_cliente_unidadespiezas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadeslibres( AV27unidadeslibres );
               Gxm3sdtinformealmacentejidocrudo_cliente_unidadespiezas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasentradas( AV13PiezasEntradas );
               Gxm3sdtinformealmacentejidocrudo_cliente_unidadespiezas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasutilizadas( AV14PiezasUtilizadas );
               Gxm3sdtinformealmacentejidocrudo_cliente_unidadespiezas.setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasdisponibles( AV15PiezasDisponibles );
               if ( ! brk1X2 )
               {
                  brk1X2 = true ;
                  pr_default.readNext(0);
               }
            }
         }
         if ( ! brk1X2 )
         {
            brk1X2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP15[0] = dpinformealmacentejidocrudo_cliente.this.Gxm2rootcol;
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
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente>(app.SdtSDTInformeAlmacenTejidoCrudo_Cliente.class, "SDTInformeAlmacenTejidoCrudo_Cliente", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A46AlbREnt = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A55AlbRReo = "" ;
      A396EmprCod = "" ;
      P001X2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P001X2_A252CliCod = new int[1] ;
      P001X2_A396EmprCod = new String[] {""} ;
      P001X2_A46AlbREnt = new String[] {""} ;
      P001X2_A1211TipEntCod = new short[1] ;
      P001X2_n1211TipEntCod = new boolean[] {false} ;
      P001X2_A55AlbRReo = new String[] {""} ;
      P001X2_A47AlbREst = new byte[1] ;
      P001X2_A6263AlbRTartC = new short[1] ;
      P001X2_n6263AlbRTartC = new boolean[] {false} ;
      P001X2_A45AlbRef = new String[] {""} ;
      P001X2_A279CliNom = new String[] {""} ;
      P001X2_A54AlbRPieUti = new int[1] ;
      P001X2_A52AlbRPieEnt = new int[1] ;
      P001X2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001X2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001X2_A44AlbRecCod = new int[1] ;
      A279CliNom = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      Gxm1sdtinformealmacentejidocrudo_cliente = new app.SdtSDTInformeAlmacenTejidoCrudo_Cliente(remoteHandle, context);
      Gxm3sdtinformealmacentejidocrudo_cliente_unidadespiezas = new app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item(remoteHandle, context);
      AV10UnidadesEntradas = DecimalUtil.ZERO ;
      AV11UnidadesUtilizadas = DecimalUtil.ZERO ;
      AV12UnidadesDisponibles = DecimalUtil.ZERO ;
      AV27unidadeslibres = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpinformealmacentejidocrudo_cliente__default(),
         new Object[] {
             new Object[] {
            P001X2_A49AlbRFen, P001X2_A252CliCod, P001X2_A396EmprCod, P001X2_A46AlbREnt, P001X2_A1211TipEntCod, P001X2_n1211TipEntCod, P001X2_A55AlbRReo, P001X2_A47AlbREst, P001X2_A6263AlbRTartC, P001X2_n6263AlbRTartC,
            P001X2_A45AlbRef, P001X2_A279CliNom, P001X2_A54AlbRPieUti, P001X2_A52AlbRPieEnt, P001X2_A60AlbRUniUti, P001X2_A58AlbRUniEnt, P001X2_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV25Albrestfrom ;
   private byte AV26Albrestto ;
   private byte A47AlbREst ;
   private short AV22AlbRTartC ;
   private short AV23AlbRTartC_to ;
   private short AV30TipEntCod ;
   private short A6263AlbRTartC ;
   private short A1211TipEntCod ;
   private short Gx_err ;
   private int AV24CliCod ;
   private int AV16CliCod_to ;
   private int A252CliCod ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A44AlbRecCod ;
   private int A51AlbRPieDis ;
   private int AV13PiezasEntradas ;
   private int AV14PiezasUtilizadas ;
   private int AV15PiezasDisponibles ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV10UnidadesEntradas ;
   private java.math.BigDecimal AV11UnidadesUtilizadas ;
   private java.math.BigDecimal AV12UnidadesDisponibles ;
   private java.math.BigDecimal AV27unidadeslibres ;
   private String AV5Emprcod ;
   private String AV18AlbRef ;
   private String AV19AlbRef_to ;
   private String AV28AlbREntfrom ;
   private String AV29AlbREntto ;
   private String AV31Tipo ;
   private String scmdbuf ;
   private String A46AlbREnt ;
   private String A45AlbRef ;
   private String A55AlbRReo ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private java.util.Date AV20AlbRFen ;
   private java.util.Date AV21AlbRFen_to ;
   private java.util.Date A49AlbRFen ;
   private boolean brk1X2 ;
   private boolean n1211TipEntCod ;
   private boolean n6263AlbRTartC ;
   private GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente>[] aP15 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P001X2_A49AlbRFen ;
   private int[] P001X2_A252CliCod ;
   private String[] P001X2_A396EmprCod ;
   private String[] P001X2_A46AlbREnt ;
   private short[] P001X2_A1211TipEntCod ;
   private boolean[] P001X2_n1211TipEntCod ;
   private String[] P001X2_A55AlbRReo ;
   private byte[] P001X2_A47AlbREst ;
   private short[] P001X2_A6263AlbRTartC ;
   private boolean[] P001X2_n6263AlbRTartC ;
   private String[] P001X2_A45AlbRef ;
   private String[] P001X2_A279CliNom ;
   private int[] P001X2_A54AlbRPieUti ;
   private int[] P001X2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P001X2_A60AlbRUniUti ;
   private java.math.BigDecimal[] P001X2_A58AlbRUniEnt ;
   private int[] P001X2_A44AlbRecCod ;
   private GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente> Gxm2rootcol ;
   private app.SdtSDTInformeAlmacenTejidoCrudo_Cliente Gxm1sdtinformealmacentejidocrudo_cliente ;
   private app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item Gxm3sdtinformealmacentejidocrudo_cliente_unidadespiezas ;
}

final  class dpinformealmacentejidocrudo_cliente__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P001X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV28AlbREntfrom ,
                                          String AV29AlbREntto ,
                                          String A46AlbREnt ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date AV21AlbRFen_to ,
                                          String A45AlbRef ,
                                          String AV18AlbRef ,
                                          String AV19AlbRef_to ,
                                          short A6263AlbRTartC ,
                                          short AV22AlbRTartC ,
                                          short AV23AlbRTartC_to ,
                                          byte A47AlbREst ,
                                          byte AV25Albrestfrom ,
                                          byte AV26Albrestto ,
                                          String A55AlbRReo ,
                                          String AV31Tipo ,
                                          short A1211TipEntCod ,
                                          short AV30TipEntCod ,
                                          String AV5Emprcod ,
                                          int AV24CliCod ,
                                          java.util.Date AV20AlbRFen ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          int AV16CliCod_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[15];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT T1.AlbRFen, T1.CliCod, T1.EmprCod, T1.AlbREnt, T1.TipEntCod, T1.AlbRReo, T1.AlbREst, T1.AlbRTartC, T1.AlbRef, T2.CliNom, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti," ;
      scmdbuf += " T1.AlbRUniEnt, T1.AlbRecCod FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod >= ? and T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRTartC >= ?)");
      addWhere(sWhereString, "(T1.AlbRTartC <= ?)");
      addWhere(sWhereString, "(T1.AlbREst >= ?)");
      addWhere(sWhereString, "(T1.AlbREst <= ?)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      if ( ! (GXutil.strcmp("", AV28AlbREntfrom)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt >= ?)");
      }
      else
      {
         GXv_int1[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV29AlbREntto)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt <= ?)");
      }
      else
      {
         GXv_int1[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.AlbRFen" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
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
                  return conditional_P001X2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 2);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((int[]) buf[16])[0] = rslt.getInt(15);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
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

