package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dptbllhipro extends GXProcedure
{
   public dptbllhipro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dptbllhipro.class ), "" );
   }

   public dptbllhipro( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTtblLhipro> executeUdp( String aP0 ,
                                                            String aP1 ,
                                                            String aP2 ,
                                                            java.util.Date aP3 ,
                                                            java.util.Date aP4 ,
                                                            byte aP5 )
   {
      dptbllhipro.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTtblLhipro>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        byte aP5 ,
                        GXBaseCollection<app.SdtSDTtblLhipro>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             byte aP5 ,
                             GXBaseCollection<app.SdtSDTtblLhipro>[] aP6 )
   {
      dptbllhipro.this.AV5Emprcod = aP0;
      dptbllhipro.this.AV11MaqcodIni = aP1;
      dptbllhipro.this.AV10MaqcodFin = aP2;
      dptbllhipro.this.AV8FInicio = aP3;
      dptbllhipro.this.AV7FFin = aP4;
      dptbllhipro.this.AV13TipoProduccion = aP5;
      dptbllhipro.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000Q2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV11MaqcodIni, AV10MaqcodFin, AV8FInicio, AV7FFin});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P000Q2_A602MaqCod[0] ;
         A396EmprCod = P000Q2_A396EmprCod[0] ;
         A606MaqDsc = P000Q2_A606MaqDsc[0] ;
         n606MaqDsc = P000Q2_n606MaqDsc[0] ;
         A557HisProF = P000Q2_A557HisProF[0] ;
         A1525HisProKgr = P000Q2_A1525HisProKgr[0] ;
         A1526HisProMtr = P000Q2_A1526HisProMtr[0] ;
         A3610HisProLot = P000Q2_A3610HisProLot[0] ;
         A566HisProTur = P000Q2_A566HisProTur[0] ;
         A461Fase = P000Q2_A461Fase[0] ;
         A656ParCod = P000Q2_A656ParCod[0] ;
         n656ParCod = P000Q2_n656ParCod[0] ;
         A212BarSer = P000Q2_A212BarSer[0] ;
         A1652BarSerDsc = P000Q2_A1652BarSerDsc[0] ;
         A2247HisProTip = P000Q2_A2247HisProTip[0] ;
         A135BarColNom = P000Q2_A135BarColNom[0] ;
         A1234BarNomCli = P000Q2_A1234BarNomCli[0] ;
         A503GruOpeCod = P000Q2_A503GruOpeCod[0] ;
         A4440HisProDTI = P000Q2_A4440HisProDTI[0] ;
         n4440HisProDTI = P000Q2_n4440HisProDTI[0] ;
         A4441HisProDTF = P000Q2_A4441HisProDTF[0] ;
         n4441HisProDTF = P000Q2_n4441HisProDTF[0] ;
         A130BarCodPar = P000Q2_A130BarCodPar[0] ;
         A132BarCodReo = P000Q2_A132BarCodReo[0] ;
         A129BarCod = P000Q2_A129BarCod[0] ;
         A558HisProFec = P000Q2_A558HisProFec[0] ;
         A561HisProLin = P000Q2_A561HisProLin[0] ;
         A606MaqDsc = P000Q2_A606MaqDsc[0] ;
         n606MaqDsc = P000Q2_n606MaqDsc[0] ;
         A212BarSer = P000Q2_A212BarSer[0] ;
         A1652BarSerDsc = P000Q2_A1652BarSerDsc[0] ;
         A135BarColNom = P000Q2_A135BarColNom[0] ;
         A1234BarNomCli = P000Q2_A1234BarNomCli[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         Gxm1sdttbllhipro = (app.SdtSDTtblLhipro)new app.SdtSDTtblLhipro(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdttbllhipro, 0);
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Maqcod( A602MaqCod );
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Maqdsc( A606MaqDsc );
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Hisprodti( A4440HisProDTI );
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Hisprodtf( A4441HisProDTF );
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Hisprof( A557HisProF );
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Hisprokgr( A1525HisProKgr );
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Hispromtr( A1526HisProMtr );
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Barnhdr( A13696BarNHdr );
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Hisprolot( A3610HisProLot );
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Hisprotur( A566HisProTur );
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Fase( A461Fase );
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( AV5Emprcod, A461Fase, GXv_char2) ;
         dptbllhipro.this.GXt_char1 = GXv_char2[0] ;
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Fasdsc( GXt_char1 );
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Hisprotr2( A5605HisProTr2 );
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Parcod( A656ParCod );
         GXt_char1 = "" ;
         GXv_char2[0] = AV5Emprcod ;
         GXv_int3[0] = A656ParCod ;
         GXv_char4[0] = GXt_char1 ;
         new app.ppardsccopy1(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
         dptbllhipro.this.AV5Emprcod = GXv_char2[0] ;
         dptbllhipro.this.A656ParCod = GXv_int3[0] ;
         dptbllhipro.this.GXt_char1 = GXv_char4[0] ;
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Parcodnom( GXt_char1 );
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Barser( A212BarSer );
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Barserdsc( A1652BarSerDsc );
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Hisprotip( A2247HisProTip );
         GXt_char1 = "" ;
         GXv_char4[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( AV5Emprcod, A2247HisProTip, GXv_char4) ;
         dptbllhipro.this.GXt_char1 = GXv_char4[0] ;
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Tipartdsc( GXt_char1 );
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Barcolnom( A135BarColNom );
         Gxm1sdttbllhipro.setgxTv_SdtSDTtblLhipro_Barnomcli( A1234BarNomCli );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = dptbllhipro.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTtblLhipro>(app.SdtSDTtblLhipro.class, "SDTtblLhipro", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P000Q2_A602MaqCod = new String[] {""} ;
      P000Q2_A396EmprCod = new String[] {""} ;
      P000Q2_A606MaqDsc = new String[] {""} ;
      P000Q2_n606MaqDsc = new boolean[] {false} ;
      P000Q2_A557HisProF = new String[] {""} ;
      P000Q2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000Q2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000Q2_A3610HisProLot = new String[] {""} ;
      P000Q2_A566HisProTur = new byte[1] ;
      P000Q2_A461Fase = new String[] {""} ;
      P000Q2_A656ParCod = new short[1] ;
      P000Q2_n656ParCod = new boolean[] {false} ;
      P000Q2_A212BarSer = new String[] {""} ;
      P000Q2_A1652BarSerDsc = new String[] {""} ;
      P000Q2_A2247HisProTip = new short[1] ;
      P000Q2_A135BarColNom = new String[] {""} ;
      P000Q2_A1234BarNomCli = new String[] {""} ;
      P000Q2_A503GruOpeCod = new int[1] ;
      P000Q2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P000Q2_n4440HisProDTI = new boolean[] {false} ;
      P000Q2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P000Q2_n4441HisProDTF = new boolean[] {false} ;
      P000Q2_A130BarCodPar = new String[] {""} ;
      P000Q2_A132BarCodReo = new byte[1] ;
      P000Q2_A129BarCod = new int[1] ;
      P000Q2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P000Q2_A561HisProLin = new int[1] ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A606MaqDsc = "" ;
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A3610HisProLot = "" ;
      A461Fase = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A130BarCodPar = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      Gxm1sdttbllhipro = new app.SdtSDTtblLhipro(remoteHandle, context);
      GXv_char2 = new String[1] ;
      GXv_int3 = new short[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dptbllhipro__default(),
         new Object[] {
             new Object[] {
            P000Q2_A602MaqCod, P000Q2_A396EmprCod, P000Q2_A606MaqDsc, P000Q2_n606MaqDsc, P000Q2_A557HisProF, P000Q2_A1525HisProKgr, P000Q2_A1526HisProMtr, P000Q2_A3610HisProLot, P000Q2_A566HisProTur, P000Q2_A461Fase,
            P000Q2_A656ParCod, P000Q2_n656ParCod, P000Q2_A212BarSer, P000Q2_A1652BarSerDsc, P000Q2_A2247HisProTip, P000Q2_A135BarColNom, P000Q2_A1234BarNomCli, P000Q2_A503GruOpeCod, P000Q2_A4440HisProDTI, P000Q2_n4440HisProDTI,
            P000Q2_A4441HisProDTF, P000Q2_n4441HisProDTF, P000Q2_A130BarCodPar, P000Q2_A132BarCodReo, P000Q2_A129BarCod, P000Q2_A558HisProFec, P000Q2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13TipoProduccion ;
   private byte A566HisProTur ;
   private byte A132BarCodReo ;
   private short A656ParCod ;
   private short A2247HisProTip ;
   private short A5605HisProTr2 ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private int A503GruOpeCod ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private String AV5Emprcod ;
   private String AV11MaqcodIni ;
   private String AV10MaqcodFin ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A606MaqDsc ;
   private String A557HisProF ;
   private String A3610HisProLot ;
   private String A461Fase ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private java.util.Date AV8FInicio ;
   private java.util.Date AV7FFin ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean n606MaqDsc ;
   private boolean n656ParCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private GXBaseCollection<app.SdtSDTtblLhipro>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P000Q2_A602MaqCod ;
   private String[] P000Q2_A396EmprCod ;
   private String[] P000Q2_A606MaqDsc ;
   private boolean[] P000Q2_n606MaqDsc ;
   private String[] P000Q2_A557HisProF ;
   private java.math.BigDecimal[] P000Q2_A1525HisProKgr ;
   private java.math.BigDecimal[] P000Q2_A1526HisProMtr ;
   private String[] P000Q2_A3610HisProLot ;
   private byte[] P000Q2_A566HisProTur ;
   private String[] P000Q2_A461Fase ;
   private short[] P000Q2_A656ParCod ;
   private boolean[] P000Q2_n656ParCod ;
   private String[] P000Q2_A212BarSer ;
   private String[] P000Q2_A1652BarSerDsc ;
   private short[] P000Q2_A2247HisProTip ;
   private String[] P000Q2_A135BarColNom ;
   private String[] P000Q2_A1234BarNomCli ;
   private int[] P000Q2_A503GruOpeCod ;
   private java.util.Date[] P000Q2_A4440HisProDTI ;
   private boolean[] P000Q2_n4440HisProDTI ;
   private java.util.Date[] P000Q2_A4441HisProDTF ;
   private boolean[] P000Q2_n4441HisProDTF ;
   private String[] P000Q2_A130BarCodPar ;
   private byte[] P000Q2_A132BarCodReo ;
   private int[] P000Q2_A129BarCod ;
   private java.util.Date[] P000Q2_A558HisProFec ;
   private int[] P000Q2_A561HisProLin ;
   private GXBaseCollection<app.SdtSDTtblLhipro> Gxm2rootcol ;
   private app.SdtSDTtblLhipro Gxm1sdttbllhipro ;
}

final  class dptbllhipro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000Q2", "SELECT T1.MaqCod, T1.EmprCod, T2.MaqDsc, T1.HisProF, T1.HisProKgr, T1.HisProMtr, T1.HisProLot, T1.HisProTur, T1.Fase, T1.ParCod, T3.BarSer, T3.BarSerDsc, T1.HisProTip, T3.BarColNom, T3.BarNomCli, T1.GruOpeCod, T1.HisProDTI, T1.HisProDTF, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T1.MaqCod >= ?) AND (T1.MaqCod <= ?) AND (T1.HisProDTI >= ?) AND (T1.HisProDTF <= ?) ORDER BY T1.EmprCod, T1.GruOpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[7])[0] = rslt.getString(7, 10);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 16);
               ((String[]) buf[13])[0] = rslt.getString(12, 26);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 13);
               ((String[]) buf[16])[0] = rslt.getString(15, 13);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(19, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(20);
               ((int[]) buf[24])[0] = rslt.getInt(21);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(22);
               ((int[]) buf[26])[0] = rslt.getInt(23);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               return;
      }
   }

}

