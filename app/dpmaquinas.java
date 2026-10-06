package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpmaquinas extends GXProcedure
{
   public dpmaquinas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpmaquinas.class ), "" );
   }

   public dpmaquinas( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTMaquinas> executeUdp( String aP0 ,
                                                           String aP1 ,
                                                           String aP2 ,
                                                           java.util.Date aP3 ,
                                                           java.util.Date aP4 ,
                                                           byte aP5 )
   {
      dpmaquinas.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTMaquinas>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        byte aP5 ,
                        GXBaseCollection<app.SdtSDTMaquinas>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             byte aP5 ,
                             GXBaseCollection<app.SdtSDTMaquinas>[] aP6 )
   {
      dpmaquinas.this.AV5Emprcod = aP0;
      dpmaquinas.this.AV6MaqcodIni = aP1;
      dpmaquinas.this.AV7MaqcodFin = aP2;
      dpmaquinas.this.AV8FInicio = aP3;
      dpmaquinas.this.AV9FFin = aP4;
      dpmaquinas.this.AV10TipoProduccion = aP5;
      dpmaquinas.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000L2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV6MaqcodIni, AV8FInicio, AV9FFin, Byte.valueOf(AV10TipoProduccion), Byte.valueOf(AV10TipoProduccion), AV7MaqcodFin});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk0L2 = false ;
         A602MaqCod = P000L2_A602MaqCod[0] ;
         A396EmprCod = P000L2_A396EmprCod[0] ;
         A1525HisProKgr = P000L2_A1525HisProKgr[0] ;
         A1526HisProMtr = P000L2_A1526HisProMtr[0] ;
         A656ParCod = P000L2_A656ParCod[0] ;
         n656ParCod = P000L2_n656ParCod[0] ;
         A3612HisProReo = P000L2_A3612HisProReo[0] ;
         A4441HisProDTF = P000L2_A4441HisProDTF[0] ;
         n4441HisProDTF = P000L2_n4441HisProDTF[0] ;
         A4440HisProDTI = P000L2_A4440HisProDTI[0] ;
         n4440HisProDTI = P000L2_n4440HisProDTI[0] ;
         A606MaqDsc = P000L2_A606MaqDsc[0] ;
         n606MaqDsc = P000L2_n606MaqDsc[0] ;
         A558HisProFec = P000L2_A558HisProFec[0] ;
         A561HisProLin = P000L2_A561HisProLin[0] ;
         A606MaqDsc = P000L2_A606MaqDsc[0] ;
         n606MaqDsc = P000L2_n606MaqDsc[0] ;
         Gxm1sdtmaquinas = (app.SdtSDTMaquinas)new app.SdtSDTMaquinas(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtmaquinas, 0);
         Gxm1sdtmaquinas.setgxTv_SdtSDTMaquinas_Maqcod( A602MaqCod );
         Gxm1sdtmaquinas.setgxTv_SdtSDTMaquinas_Maqdsc( A606MaqDsc );
         AV11Kilos = DecimalUtil.doubleToDec(0) ;
         AV12Metros = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P000L2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P000L2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk0L2 = false ;
            A1525HisProKgr = P000L2_A1525HisProKgr[0] ;
            A1526HisProMtr = P000L2_A1526HisProMtr[0] ;
            A558HisProFec = P000L2_A558HisProFec[0] ;
            A561HisProLin = P000L2_A561HisProLin[0] ;
            AV11Kilos = AV11Kilos.add(A1525HisProKgr) ;
            AV12Metros = AV12Metros.add(A1526HisProMtr) ;
            brk0L2 = true ;
            pr_default.readNext(0);
         }
         Gxm1sdtmaquinas.setgxTv_SdtSDTMaquinas_Kilosproduccion( AV11Kilos );
         Gxm1sdtmaquinas.setgxTv_SdtSDTMaquinas_Metrosproduccion( AV12Metros );
         if ( ! brk0L2 )
         {
            brk0L2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = dpmaquinas.this.Gxm2rootcol;
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
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTMaquinas>(app.SdtSDTMaquinas.class, "SDTMaquinas", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P000L2_A602MaqCod = new String[] {""} ;
      P000L2_A396EmprCod = new String[] {""} ;
      P000L2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000L2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000L2_A656ParCod = new short[1] ;
      P000L2_n656ParCod = new boolean[] {false} ;
      P000L2_A3612HisProReo = new byte[1] ;
      P000L2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P000L2_n4441HisProDTF = new boolean[] {false} ;
      P000L2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P000L2_n4440HisProDTI = new boolean[] {false} ;
      P000L2_A606MaqDsc = new String[] {""} ;
      P000L2_n606MaqDsc = new boolean[] {false} ;
      P000L2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P000L2_A561HisProLin = new int[1] ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A606MaqDsc = "" ;
      A558HisProFec = GXutil.nullDate() ;
      Gxm1sdtmaquinas = new app.SdtSDTMaquinas(remoteHandle, context);
      AV11Kilos = DecimalUtil.ZERO ;
      AV12Metros = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpmaquinas__default(),
         new Object[] {
             new Object[] {
            P000L2_A602MaqCod, P000L2_A396EmprCod, P000L2_A1525HisProKgr, P000L2_A1526HisProMtr, P000L2_A656ParCod, P000L2_n656ParCod, P000L2_A3612HisProReo, P000L2_A4441HisProDTF, P000L2_n4441HisProDTF, P000L2_A4440HisProDTI,
            P000L2_n4440HisProDTI, P000L2_A606MaqDsc, P000L2_n606MaqDsc, P000L2_A558HisProFec, P000L2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TipoProduccion ;
   private byte A3612HisProReo ;
   private short A656ParCod ;
   private short Gx_err ;
   private int A561HisProLin ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV11Kilos ;
   private java.math.BigDecimal AV12Metros ;
   private String AV5Emprcod ;
   private String AV6MaqcodIni ;
   private String AV7MaqcodFin ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A606MaqDsc ;
   private java.util.Date AV8FInicio ;
   private java.util.Date AV9FFin ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A558HisProFec ;
   private boolean brk0L2 ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private boolean n606MaqDsc ;
   private GXBaseCollection<app.SdtSDTMaquinas>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P000L2_A602MaqCod ;
   private String[] P000L2_A396EmprCod ;
   private java.math.BigDecimal[] P000L2_A1525HisProKgr ;
   private java.math.BigDecimal[] P000L2_A1526HisProMtr ;
   private short[] P000L2_A656ParCod ;
   private boolean[] P000L2_n656ParCod ;
   private byte[] P000L2_A3612HisProReo ;
   private java.util.Date[] P000L2_A4441HisProDTF ;
   private boolean[] P000L2_n4441HisProDTF ;
   private java.util.Date[] P000L2_A4440HisProDTI ;
   private boolean[] P000L2_n4440HisProDTI ;
   private String[] P000L2_A606MaqDsc ;
   private boolean[] P000L2_n606MaqDsc ;
   private java.util.Date[] P000L2_A558HisProFec ;
   private int[] P000L2_A561HisProLin ;
   private GXBaseCollection<app.SdtSDTMaquinas> Gxm2rootcol ;
   private app.SdtSDTMaquinas Gxm1sdtmaquinas ;
}

final  class dpmaquinas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000L2", "SELECT T1.MaqCod, T1.EmprCod, T1.HisProKgr, T1.HisProMtr, T1.ParCod, T1.HisProReo, T1.HisProDTF, T1.HisProDTI, T2.MaqDsc, T1.HisProFec, T1.HisProLin FROM (TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTI >= ?) AND (T1.HisProDTF <= ?) AND (T1.HisProReo = ? or ? = 9) AND (T1.ParCod = 0) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(10);
               ((int[]) buf[14])[0] = rslt.getInt(11);
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
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
      }
   }

}

