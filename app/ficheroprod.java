package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ficheroprod extends GXProcedure
{
   public ficheroprod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ficheroprod.class ), "" );
   }

   public ficheroprod( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      ficheroprod.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 )
   {
      ficheroprod.this.AV81EmprCod = aP0[0];
      this.aP0 = aP0;
      ficheroprod.this.AV100Dirp = aP1[0];
      this.aP1 = aP1;
      ficheroprod.this.AV101Barcod = aP2[0];
      this.aP2 = aP2;
      ficheroprod.this.AV102Barcodreo = aP3[0];
      this.aP3 = aP3;
      ficheroprod.this.AV103Barcodpar = aP4[0];
      this.aP4 = aP4;
      ficheroprod.this.AV104Reclinmaq = aP5[0];
      this.aP5 = aP5;
      ficheroprod.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV123ErrorMessage = "" ;
      AV99Dir = AV100Dirp ;
      AV99Dir = GXutil.trim( AV99Dir) ;
      AV57LenVar = (byte)(GXutil.len( AV99Dir)) ;
      AV99Dir = ((GXutil.strcmp(GXutil.substring( AV99Dir, AV57LenVar, 1), "\\")!=0) ? AV99Dir+"\\" : AV99Dir) ;
      AV100Dirp = GXutil.trim( AV99Dir) ;
      GXt_int1 = AV98Contval ;
      GXv_int2[0] = GXt_int1 ;
      new app.pnumdoc(remoteHandle, context).execute( AV81EmprCod, httpContext.getMessage( "SEDOCV", ""), GXv_int2) ;
      ficheroprod.this.GXt_int1 = GXv_int2[0] ;
      AV98Contval = GXt_int1 ;
      GXt_int3 = AV112ActOF9 ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( AV81EmprCod, httpContext.getMessage( "OF9SED", ""), GXv_int4) ;
      ficheroprod.this.GXt_int3 = GXv_int4[0] ;
      AV112ActOF9 = GXt_int3 ;
      /* Using cursor P09BA2 */
      pr_default.execute(0, new Object[] {AV81EmprCod, Integer.valueOf(AV101Barcod), Byte.valueOf(AV102Barcodreo), AV103Barcodpar, Short.valueOf(AV104Reclinmaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P09BA2_A2804RecLinMaq[0] ;
         A130BarCodPar = P09BA2_A130BarCodPar[0] ;
         A132BarCodReo = P09BA2_A132BarCodReo[0] ;
         A129BarCod = P09BA2_A129BarCod[0] ;
         A396EmprCod = P09BA2_A396EmprCod[0] ;
         A616MaqOrdSeq = P09BA2_A616MaqOrdSeq[0] ;
         n616MaqOrdSeq = P09BA2_n616MaqOrdSeq[0] ;
         A602MaqCod = P09BA2_A602MaqCod[0] ;
         A5109RecNumInt = P09BA2_A5109RecNumInt[0] ;
         A616MaqOrdSeq = P09BA2_A616MaqOrdSeq[0] ;
         n616MaqOrdSeq = P09BA2_n616MaqOrdSeq[0] ;
         AV35Num_mq = A616MaqOrdSeq ;
         AV35Num_mq = (short)(GXutil.lval( GXutil.substring( A602MaqCod, 5, 2))) ;
         AV38Of6 = A5109RecNumInt ;
         AV111Of9 = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + GXutil.str( A132BarCodReo, 1, 0) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P09BA3 */
      pr_default.execute(1, new Object[] {AV81EmprCod, Integer.valueOf(AV101Barcod), Byte.valueOf(AV102Barcodreo), AV103Barcodpar, Short.valueOf(AV104Reclinmaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A872RecPrdNum = P09BA3_A872RecPrdNum[0] ;
         A2804RecLinMaq = P09BA3_A2804RecLinMaq[0] ;
         A130BarCodPar = P09BA3_A130BarCodPar[0] ;
         A132BarCodReo = P09BA3_A132BarCodReo[0] ;
         A129BarCod = P09BA3_A129BarCod[0] ;
         A396EmprCod = P09BA3_A396EmprCod[0] ;
         A686PrdCant = P09BA3_A686PrdCant[0] ;
         A811RecLin = P09BA3_A811RecLin[0] ;
         A1273RecLinPro = P09BA3_A1273RecLinPro[0] ;
         if ( A686PrdCant.doubleValue() < 1 )
         {
            AV120MoAColorantes = httpContext.getMessage( "M", "") ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV119Inicio = GXutil.now( ) ;
      AV118Fin = GXutil.dtadd( AV119Inicio, AV113VarSleep) ;
      while ( AV118Fin.after( GXutil.now( ) ) )
      {
         AV119Inicio = GXutil.now( ) ;
         Gx_msg = "-> " + httpContext.getMessage( "Inicio= ", "") + localUtil.ttoc( AV119Inicio, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Espero...para inciar fichero PREP... ", "") + GXutil.newLine( ) ;
         Gx_msg += "-> " + httpContext.getMessage( "Fin= ", "") + localUtil.ttoc( AV118Fin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + GXutil.newLine( ) ;
         System.out.println( Gx_msg );
      }
      AV34FicA = GXutil.padl( GXutil.trim( GXutil.str( AV98Contval, 8, 0)), (short)(8), "0") ;
      AV12File = AV100Dirp ;
      AV122Filename = AV12File + AV34FicA + ".dat" ;
      AV121TextFile.setSource( AV122Filename );
      AV121TextFile.create();
      AV121TextFile.openWrite("");
      AV105LastRecForNro = (byte)(0) ;
      AV106Npedidos = (byte)(1) ;
      /* Using cursor P09BA4 */
      pr_default.execute(2, new Object[] {AV81EmprCod, Integer.valueOf(AV101Barcod), Byte.valueOf(AV102Barcodreo), AV103Barcodpar, Short.valueOf(AV104Reclinmaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P09BA4_A719PrdNum[0] ;
         n719PrdNum = P09BA4_n719PrdNum[0] ;
         A2394RecForNro = P09BA4_A2394RecForNro[0] ;
         A2804RecLinMaq = P09BA4_A2804RecLinMaq[0] ;
         A130BarCodPar = P09BA4_A130BarCodPar[0] ;
         A132BarCodReo = P09BA4_A132BarCodReo[0] ;
         A129BarCod = P09BA4_A129BarCod[0] ;
         A396EmprCod = P09BA4_A396EmprCod[0] ;
         A1643PrdTip = P09BA4_A1643PrdTip[0] ;
         A872RecPrdNum = P09BA4_A872RecPrdNum[0] ;
         A875RecPrdDsc = P09BA4_A875RecPrdDsc[0] ;
         A5109RecNumInt = P09BA4_A5109RecNumInt[0] ;
         A686PrdCant = P09BA4_A686PrdCant[0] ;
         A811RecLin = P09BA4_A811RecLin[0] ;
         A1273RecLinPro = P09BA4_A1273RecLinPro[0] ;
         A1643PrdTip = P09BA4_A1643PrdTip[0] ;
         A5109RecNumInt = P09BA4_A5109RecNumInt[0] ;
         if ( ( AV105LastRecForNro != A2394RecForNro ) && ( A2394RecForNro > 0 ) && ( AV105LastRecForNro > 0 ) )
         {
            AV106Npedidos = (byte)(1) ;
         }
         AV108PrdTip = ((GXutil.strcmp(A1643PrdTip, httpContext.getMessage( "M", ""))==0) ? httpContext.getMessage( "M", "") : httpContext.getMessage( "A", "")) ;
         AV108PrdTip = ((GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 2), "10")>=0)&&(GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 2), "79")<=0)&&(GXutil.strcmp(AV120MoAColorantes, httpContext.getMessage( "M", ""))==0) ? httpContext.getMessage( "M", "") : AV108PrdTip) ;
         AV107DescProducto = GXutil.substring( A875RecPrdDsc, 1, 13) ;
         AV125TextFileLine = httpContext.getMessage( "\"PROD\"", "") + "," ;
         AV125TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV35Num_mq, 4, 0)), (short)(4), "0") + "\"" + "," ;
         if ( AV112ActOF9 == 0 )
         {
            AV125TextFileLine += "\"" + GXutil.padr( GXutil.trim( GXutil.str( A5109RecNumInt, 8, 0)), 8, " ") + "\"" + "," ;
         }
         else
         {
            AV125TextFileLine += "\"" + GXutil.padr( GXutil.trim( AV111Of9), 9, " ") + "\"" + "," ;
         }
         AV125TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( ((A2394RecForNro==0) ? AV105LastRecForNro : A2394RecForNro), 2, 0)), (short)(2), "0") + "\"" + "," ;
         AV125TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV106Npedidos, 2, 0)), (short)(2), "0") + "\"" + "," ;
         AV125TextFileLine += "\"" + GXutil.padr( GXutil.trim( A872RecPrdNum), 13, " ") + "\"" + "," ;
         AV125TextFileLine += "\"" + GXutil.padr( GXutil.trim( AV107DescProducto), 13, " ") + "\"" + "," ;
         AV125TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( A686PrdCant, 12, 1)), (short)(12), "0") + "\"" + "," ;
         AV125TextFileLine += "\"" + httpContext.getMessage( "g", "") + "\"" + "," ;
         AV125TextFileLine += "\"" + ((GXutil.strcmp(AV108PrdTip, httpContext.getMessage( "M", ""))==0) ? "1" : "0") + "\"" ;
         if ( GXutil.len( AV125TextFileLine) > 0 )
         {
            AV121TextFile.writeLine(AV125TextFileLine);
         }
         AV105LastRecForNro = ((A2394RecForNro==0) ? AV105LastRecForNro : A2394RecForNro) ;
         AV106Npedidos = (byte)(AV106Npedidos+1) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV121TextFile.close();
      if ( AV121TextFile.getErrCode() != 0 )
      {
         AV123ErrorMessage = GXutil.trim( GXutil.str( AV121TextFile.getErrCode(), 10, 2)) + " " + GXutil.trim( AV121TextFile.getErrDescription()) ;
      }
      else
      {
         AV123ErrorMessage += httpContext.getMessage( "Fichero PROD ,Productos creado", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ficheroprod.this.AV81EmprCod;
      this.aP1[0] = ficheroprod.this.AV100Dirp;
      this.aP2[0] = ficheroprod.this.AV101Barcod;
      this.aP3[0] = ficheroprod.this.AV102Barcodreo;
      this.aP4[0] = ficheroprod.this.AV103Barcodpar;
      this.aP5[0] = ficheroprod.this.AV104Reclinmaq;
      this.aP6[0] = ficheroprod.this.AV123ErrorMessage;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV123ErrorMessage = "" ;
      AV99Dir = "" ;
      GXv_int2 = new int[1] ;
      GXv_int4 = new byte[1] ;
      scmdbuf = "" ;
      P09BA2_A2804RecLinMaq = new short[1] ;
      P09BA2_A130BarCodPar = new String[] {""} ;
      P09BA2_A132BarCodReo = new byte[1] ;
      P09BA2_A129BarCod = new int[1] ;
      P09BA2_A396EmprCod = new String[] {""} ;
      P09BA2_A616MaqOrdSeq = new short[1] ;
      P09BA2_n616MaqOrdSeq = new boolean[] {false} ;
      P09BA2_A602MaqCod = new String[] {""} ;
      P09BA2_A5109RecNumInt = new int[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      AV111Of9 = "" ;
      P09BA3_A872RecPrdNum = new String[] {""} ;
      P09BA3_A2804RecLinMaq = new short[1] ;
      P09BA3_A130BarCodPar = new String[] {""} ;
      P09BA3_A132BarCodReo = new byte[1] ;
      P09BA3_A129BarCod = new int[1] ;
      P09BA3_A396EmprCod = new String[] {""} ;
      P09BA3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BA3_A811RecLin = new short[1] ;
      P09BA3_A1273RecLinPro = new byte[1] ;
      A872RecPrdNum = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      AV120MoAColorantes = "" ;
      AV119Inicio = GXutil.resetTime( GXutil.nullDate() );
      AV118Fin = GXutil.resetTime( GXutil.nullDate() );
      Gx_msg = "" ;
      AV34FicA = "" ;
      AV12File = "" ;
      AV122Filename = "" ;
      AV121TextFile = new com.genexus.util.GXFile();
      P09BA4_A719PrdNum = new String[] {""} ;
      P09BA4_n719PrdNum = new boolean[] {false} ;
      P09BA4_A2394RecForNro = new byte[1] ;
      P09BA4_A2804RecLinMaq = new short[1] ;
      P09BA4_A130BarCodPar = new String[] {""} ;
      P09BA4_A132BarCodReo = new byte[1] ;
      P09BA4_A129BarCod = new int[1] ;
      P09BA4_A396EmprCod = new String[] {""} ;
      P09BA4_A1643PrdTip = new String[] {""} ;
      P09BA4_A872RecPrdNum = new String[] {""} ;
      P09BA4_A875RecPrdDsc = new String[] {""} ;
      P09BA4_A5109RecNumInt = new int[1] ;
      P09BA4_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BA4_A811RecLin = new short[1] ;
      P09BA4_A1273RecLinPro = new byte[1] ;
      A719PrdNum = "" ;
      A1643PrdTip = "" ;
      A875RecPrdDsc = "" ;
      AV108PrdTip = "" ;
      AV107DescProducto = "" ;
      AV125TextFileLine = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficheroprod__default(),
         new Object[] {
             new Object[] {
            P09BA2_A2804RecLinMaq, P09BA2_A130BarCodPar, P09BA2_A132BarCodReo, P09BA2_A129BarCod, P09BA2_A396EmprCod, P09BA2_A616MaqOrdSeq, P09BA2_n616MaqOrdSeq, P09BA2_A602MaqCod, P09BA2_A5109RecNumInt
            }
            , new Object[] {
            P09BA3_A872RecPrdNum, P09BA3_A2804RecLinMaq, P09BA3_A130BarCodPar, P09BA3_A132BarCodReo, P09BA3_A129BarCod, P09BA3_A396EmprCod, P09BA3_A686PrdCant, P09BA3_A811RecLin, P09BA3_A1273RecLinPro
            }
            , new Object[] {
            P09BA4_A719PrdNum, P09BA4_n719PrdNum, P09BA4_A2394RecForNro, P09BA4_A2804RecLinMaq, P09BA4_A130BarCodPar, P09BA4_A132BarCodReo, P09BA4_A129BarCod, P09BA4_A396EmprCod, P09BA4_A1643PrdTip, P09BA4_A872RecPrdNum,
            P09BA4_A875RecPrdDsc, P09BA4_A5109RecNumInt, P09BA4_A686PrdCant, P09BA4_A811RecLin, P09BA4_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV102Barcodreo ;
   private byte AV57LenVar ;
   private byte AV112ActOF9 ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte AV105LastRecForNro ;
   private byte AV106Npedidos ;
   private byte A2394RecForNro ;
   private short AV104Reclinmaq ;
   private short A2804RecLinMaq ;
   private short A616MaqOrdSeq ;
   private short AV35Num_mq ;
   private short A811RecLin ;
   private short AV113VarSleep ;
   private short Gx_err ;
   private int AV101Barcod ;
   private int AV98Contval ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private int A129BarCod ;
   private int A5109RecNumInt ;
   private int AV38Of6 ;
   private java.math.BigDecimal A686PrdCant ;
   private String AV81EmprCod ;
   private String AV100Dirp ;
   private String AV103Barcodpar ;
   private String AV99Dir ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV111Of9 ;
   private String A872RecPrdNum ;
   private String AV120MoAColorantes ;
   private String Gx_msg ;
   private String AV34FicA ;
   private String AV12File ;
   private String A719PrdNum ;
   private String A1643PrdTip ;
   private String A875RecPrdDsc ;
   private String AV108PrdTip ;
   private String AV107DescProducto ;
   private java.util.Date AV119Inicio ;
   private java.util.Date AV118Fin ;
   private boolean n616MaqOrdSeq ;
   private boolean n719PrdNum ;
   private String AV125TextFileLine ;
   private String AV123ErrorMessage ;
   private String AV122Filename ;
   private com.genexus.util.GXFile AV121TextFile ;
   private String[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private short[] P09BA2_A2804RecLinMaq ;
   private String[] P09BA2_A130BarCodPar ;
   private byte[] P09BA2_A132BarCodReo ;
   private int[] P09BA2_A129BarCod ;
   private String[] P09BA2_A396EmprCod ;
   private short[] P09BA2_A616MaqOrdSeq ;
   private boolean[] P09BA2_n616MaqOrdSeq ;
   private String[] P09BA2_A602MaqCod ;
   private int[] P09BA2_A5109RecNumInt ;
   private String[] P09BA3_A872RecPrdNum ;
   private short[] P09BA3_A2804RecLinMaq ;
   private String[] P09BA3_A130BarCodPar ;
   private byte[] P09BA3_A132BarCodReo ;
   private int[] P09BA3_A129BarCod ;
   private String[] P09BA3_A396EmprCod ;
   private java.math.BigDecimal[] P09BA3_A686PrdCant ;
   private short[] P09BA3_A811RecLin ;
   private byte[] P09BA3_A1273RecLinPro ;
   private String[] P09BA4_A719PrdNum ;
   private boolean[] P09BA4_n719PrdNum ;
   private byte[] P09BA4_A2394RecForNro ;
   private short[] P09BA4_A2804RecLinMaq ;
   private String[] P09BA4_A130BarCodPar ;
   private byte[] P09BA4_A132BarCodReo ;
   private int[] P09BA4_A129BarCod ;
   private String[] P09BA4_A396EmprCod ;
   private String[] P09BA4_A1643PrdTip ;
   private String[] P09BA4_A872RecPrdNum ;
   private String[] P09BA4_A875RecPrdDsc ;
   private int[] P09BA4_A5109RecNumInt ;
   private java.math.BigDecimal[] P09BA4_A686PrdCant ;
   private short[] P09BA4_A811RecLin ;
   private byte[] P09BA4_A1273RecLinPro ;
}

final  class ficheroprod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09BA2", "SELECT T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.MaqOrdSeq, T1.MaqCod, T1.RecNumInt FROM (TXPRECMAQ T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09BA3", "SELECT RecPrdNum, RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, PrdCant, RecLin, RecLinPro FROM TXPLRECET WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) AND (SUBSTR(RecPrdNum, 1, 2) >= '10' and SUBSTR(RecPrdNum, 1, 2) <= '79') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BA4", "SELECT T1.PrdNum, T1.RecForNro, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.PrdTip, T1.RecPrdNum, T1.RecPrdDsc, T3.RecNumInt, T1.PrdCant, T1.RecLin, T1.RecLinPro FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPRECMAQ T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (T1.RecForNro > 0) AND (SUBSTR(T1.PrdNum, 1, 2) >= '10' and SUBSTR(T1.PrdNum, 1, 2) <= '99') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,3);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

