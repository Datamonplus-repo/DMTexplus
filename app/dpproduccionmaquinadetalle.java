package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpproduccionmaquinadetalle extends GXProcedure
{
   public dpproduccionmaquinadetalle( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpproduccionmaquinadetalle.class ), "" );
   }

   public dpproduccionmaquinadetalle( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtsdtProduccionMaquinaDetalle> executeUdp( String aP0 ,
                                                                           String aP1 ,
                                                                           java.util.Date aP2 ,
                                                                           java.util.Date aP3 )
   {
      dpproduccionmaquinadetalle.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<app.SdtsdtProduccionMaquinaDetalle>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        java.util.Date aP3 ,
                        GXBaseCollection<app.SdtsdtProduccionMaquinaDetalle>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             GXBaseCollection<app.SdtsdtProduccionMaquinaDetalle>[] aP4 )
   {
      dpproduccionmaquinadetalle.this.AV5MaqCodIni = aP0;
      dpproduccionmaquinadetalle.this.AV6MaqCodFin = aP1;
      dpproduccionmaquinadetalle.this.AV7HisProDTI = aP2;
      dpproduccionmaquinadetalle.this.AV8HisProDTF = aP3;
      dpproduccionmaquinadetalle.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000H2 */
      pr_default.execute(0, new Object[] {AV5MaqCodIni, AV7HisProDTI, AV8HisProDTF, AV6MaqCodFin});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P000H2_A396EmprCod[0] ;
         A656ParCod = P000H2_A656ParCod[0] ;
         n656ParCod = P000H2_n656ParCod[0] ;
         A4441HisProDTF = P000H2_A4441HisProDTF[0] ;
         n4441HisProDTF = P000H2_n4441HisProDTF[0] ;
         A4440HisProDTI = P000H2_A4440HisProDTI[0] ;
         n4440HisProDTI = P000H2_n4440HisProDTI[0] ;
         A602MaqCod = P000H2_A602MaqCod[0] ;
         A606MaqDsc = P000H2_A606MaqDsc[0] ;
         n606MaqDsc = P000H2_n606MaqDsc[0] ;
         A1525HisProKgr = P000H2_A1525HisProKgr[0] ;
         A1526HisProMtr = P000H2_A1526HisProMtr[0] ;
         A130BarCodPar = P000H2_A130BarCodPar[0] ;
         A132BarCodReo = P000H2_A132BarCodReo[0] ;
         A129BarCod = P000H2_A129BarCod[0] ;
         A558HisProFec = P000H2_A558HisProFec[0] ;
         A561HisProLin = P000H2_A561HisProLin[0] ;
         A606MaqDsc = P000H2_A606MaqDsc[0] ;
         n606MaqDsc = P000H2_n606MaqDsc[0] ;
         A13694BarHdr = GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 8, 0)), (short)(8), "0") + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + GXutil.padl( A130BarCodPar, (short)(1), " ") ;
         Gxm1sdtproduccionmaquinadetalle = (app.SdtsdtProduccionMaquinaDetalle)new app.SdtsdtProduccionMaquinaDetalle(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtproduccionmaquinadetalle, 0);
         Gxm1sdtproduccionmaquinadetalle.setgxTv_SdtsdtProduccionMaquinaDetalle_Maqcod( A602MaqCod );
         Gxm1sdtproduccionmaquinadetalle.setgxTv_SdtsdtProduccionMaquinaDetalle_Maqdsc( A606MaqDsc );
         Gxm1sdtproduccionmaquinadetalle.setgxTv_SdtsdtProduccionMaquinaDetalle_Kilos( A1525HisProKgr );
         Gxm1sdtproduccionmaquinadetalle.setgxTv_SdtsdtProduccionMaquinaDetalle_Metros( A1526HisProMtr );
         Gxm1sdtproduccionmaquinadetalle.setgxTv_SdtsdtProduccionMaquinaDetalle_Barhdr( A13694BarHdr );
         Gxm1sdtproduccionmaquinadetalle.setgxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti( A4440HisProDTI );
         Gxm1sdtproduccionmaquinadetalle.setgxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf( A4441HisProDTF );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = dpproduccionmaquinadetalle.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtsdtProduccionMaquinaDetalle>(app.SdtsdtProduccionMaquinaDetalle.class, "sdtProduccionMaquinaDetalle", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P000H2_A396EmprCod = new String[] {""} ;
      P000H2_A656ParCod = new short[1] ;
      P000H2_n656ParCod = new boolean[] {false} ;
      P000H2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P000H2_n4441HisProDTF = new boolean[] {false} ;
      P000H2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P000H2_n4440HisProDTI = new boolean[] {false} ;
      P000H2_A602MaqCod = new String[] {""} ;
      P000H2_A606MaqDsc = new String[] {""} ;
      P000H2_n606MaqDsc = new boolean[] {false} ;
      P000H2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000H2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000H2_A130BarCodPar = new String[] {""} ;
      P000H2_A132BarCodReo = new byte[1] ;
      P000H2_A129BarCod = new int[1] ;
      P000H2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P000H2_A561HisProLin = new int[1] ;
      A396EmprCod = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A13694BarHdr = "" ;
      Gxm1sdtproduccionmaquinadetalle = new app.SdtsdtProduccionMaquinaDetalle(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpproduccionmaquinadetalle__default(),
         new Object[] {
             new Object[] {
            P000H2_A396EmprCod, P000H2_A656ParCod, P000H2_n656ParCod, P000H2_A4441HisProDTF, P000H2_n4441HisProDTF, P000H2_A4440HisProDTI, P000H2_n4440HisProDTI, P000H2_A602MaqCod, P000H2_A606MaqDsc, P000H2_n606MaqDsc,
            P000H2_A1525HisProKgr, P000H2_A1526HisProMtr, P000H2_A130BarCodPar, P000H2_A132BarCodReo, P000H2_A129BarCod, P000H2_A558HisProFec, P000H2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A656ParCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private String AV5MaqCodIni ;
   private String AV6MaqCodFin ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A130BarCodPar ;
   private String A13694BarHdr ;
   private java.util.Date AV7HisProDTI ;
   private java.util.Date AV8HisProDTF ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A558HisProFec ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private boolean n606MaqDsc ;
   private GXBaseCollection<app.SdtsdtProduccionMaquinaDetalle>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P000H2_A396EmprCod ;
   private short[] P000H2_A656ParCod ;
   private boolean[] P000H2_n656ParCod ;
   private java.util.Date[] P000H2_A4441HisProDTF ;
   private boolean[] P000H2_n4441HisProDTF ;
   private java.util.Date[] P000H2_A4440HisProDTI ;
   private boolean[] P000H2_n4440HisProDTI ;
   private String[] P000H2_A602MaqCod ;
   private String[] P000H2_A606MaqDsc ;
   private boolean[] P000H2_n606MaqDsc ;
   private java.math.BigDecimal[] P000H2_A1525HisProKgr ;
   private java.math.BigDecimal[] P000H2_A1526HisProMtr ;
   private String[] P000H2_A130BarCodPar ;
   private byte[] P000H2_A132BarCodReo ;
   private int[] P000H2_A129BarCod ;
   private java.util.Date[] P000H2_A558HisProFec ;
   private int[] P000H2_A561HisProLin ;
   private GXBaseCollection<app.SdtsdtProduccionMaquinaDetalle> Gxm2rootcol ;
   private app.SdtsdtProduccionMaquinaDetalle Gxm1sdtproduccionmaquinadetalle ;
}

final  class dpproduccionmaquinadetalle__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000H2", "SELECT T1.EmprCod, T1.ParCod, T1.HisProDTF, T1.HisProDTI, T1.MaqCod, T2.MaqDsc, T1.HisProKgr, T1.HisProMtr, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.HisProFec, T1.HisProLin FROM (TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = '001' and T1.MaqCod >= ? and T1.HisProDTI >= ?) AND (T1.HisProDTF <= ?) AND ((T1.ParCod = 0)) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProDTI ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((String[]) buf[8])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(12);
               ((int[]) buf[16])[0] = rslt.getInt(13);
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
               stmt.setString(1, (String)parms[0], 6);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setString(4, (String)parms[3], 6);
               return;
      }
   }

}

