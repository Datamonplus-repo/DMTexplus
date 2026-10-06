package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pconconsdt extends GXProcedure
{
   public pconconsdt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pconconsdt.class ), "" );
   }

   public pconconsdt( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String aP0 ,
                                     String aP1 ,
                                     short aP2 ,
                                     String[] aP3 ,
                                     java.util.Date[] aP4 ,
                                     java.util.Date[] aP5 ,
                                     java.util.Date[] aP6 )
   {
      pconconsdt.this.aP7 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        short aP2 ,
                        String[] aP3 ,
                        java.util.Date[] aP4 ,
                        java.util.Date[] aP5 ,
                        java.util.Date[] aP6 ,
                        java.util.Date[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             short aP2 ,
                             String[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.util.Date[] aP5 ,
                             java.util.Date[] aP6 ,
                             java.util.Date[] aP7 )
   {
      pconconsdt.this.A396EmprCod = aP0;
      pconconsdt.this.A719PrdNum = aP1;
      pconconsdt.this.AV43PrdAny = aP2;
      pconconsdt.this.aP3 = aP3;
      pconconsdt.this.aP4 = aP4;
      pconconsdt.this.aP5 = aP5;
      pconconsdt.this.aP6 = aP6;
      pconconsdt.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV37DiaIni = GXutil.nullDate() ;
      AV35Diafin = GXutil.nullDate() ;
      AV38DiaIniAnt = GXutil.nullDate() ;
      AV36DiaFinAnt = GXutil.nullDate() ;
      AV34ContMes = (byte)(12) ;
      AV39FechaActual = GXutil.serverDate( context, remoteHandle, pr_default) ;
      AV40Mes = (byte)(GXutil.month( AV39FechaActual)) ;
      AV37DiaIni = localUtil.ymdtod( AV43PrdAny, 1, 1) ;
      AV39FechaActual = GXutil.dadd(AV39FechaActual,-(1)) ;
      AV35Diafin = localUtil.ymdtod( AV43PrdAny, GXutil.month( AV39FechaActual), GXutil.day( AV39FechaActual)) ;
      AV32AnyAnt = (short)(0) ;
      AV42MesIni = (byte)(0) ;
      if ( AV40Mes != 12 )
      {
         AV32AnyAnt = (short)(AV43PrdAny-1) ;
         AV42MesIni = (byte)(AV40Mes+1) ;
         AV38DiaIniAnt = localUtil.ymdtod( AV32AnyAnt, AV42MesIni, 1) ;
         AV36DiaFinAnt = localUtil.ymdtod( AV32AnyAnt, 12, 31) ;
      }
      /* Using cursor P08P42 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(AV43PrdAny), Byte.valueOf(AV40Mes), Short.valueOf(AV32AnyAnt), Byte.valueOf(AV42MesIni), Short.valueOf(AV32AnyAnt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A720PrdNumMes = P08P42_A720PrdNumMes[0] ;
         A681PrdAny = P08P42_A681PrdAny[0] ;
         A745PrdUniCprM = P08P42_A745PrdUniCprM[0] ;
         A749PrdValCprM = P08P42_A749PrdValCprM[0] ;
         A744PrdUniConM = P08P42_A744PrdUniConM[0] ;
         A747PrdValConM = P08P42_A747PrdValConM[0] ;
         AV45SdtPConCos = (app.SdtSdtPConCos)new app.SdtSdtPConCos(remoteHandle, context);
         AV45SdtPConCos.setgxTv_SdtSdtPConCos_Prdanymes( (int)(A681PrdAny*100+A720PrdNumMes) );
         AV45SdtPConCos.setgxTv_SdtSdtPConCos_Prdany( A681PrdAny );
         AV45SdtPConCos.setgxTv_SdtSdtPConCos_Prdnummes( A720PrdNumMes );
         AV45SdtPConCos.setgxTv_SdtSdtPConCos_Prdunicprm( A745PrdUniCprM );
         AV45SdtPConCos.setgxTv_SdtSdtPConCos_Prdvalcprm( A749PrdValCprM );
         AV45SdtPConCos.setgxTv_SdtSdtPConCos_Prduniconm( A744PrdUniConM );
         AV45SdtPConCos.setgxTv_SdtSdtPConCos_Prdvalconm( A747PrdValConM );
         AV46SdtPConCosCollection.add(AV45SdtPConCos, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV46SdtPConCosCollection.sort(httpContext.getMessage( "PrdAnyMes", ""));
      AV47SdtPConCosJSon = AV46SdtPConCosCollection.toJSonString(false) ;
      AV46SdtPConCosCollection.clear();
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pconconsdt.this.AV47SdtPConCosJSon;
      this.aP4[0] = pconconsdt.this.AV37DiaIni;
      this.aP5[0] = pconconsdt.this.AV35Diafin;
      this.aP6[0] = pconconsdt.this.AV38DiaIniAnt;
      this.aP7[0] = pconconsdt.this.AV36DiaFinAnt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV47SdtPConCosJSon = "" ;
      AV37DiaIni = GXutil.nullDate() ;
      AV35Diafin = GXutil.nullDate() ;
      AV38DiaIniAnt = GXutil.nullDate() ;
      AV36DiaFinAnt = GXutil.nullDate() ;
      AV39FechaActual = GXutil.nullDate() ;
      scmdbuf = "" ;
      P08P42_A396EmprCod = new String[] {""} ;
      P08P42_A719PrdNum = new String[] {""} ;
      P08P42_A720PrdNumMes = new byte[1] ;
      P08P42_A681PrdAny = new short[1] ;
      P08P42_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08P42_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08P42_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08P42_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A745PrdUniCprM = DecimalUtil.ZERO ;
      A749PrdValCprM = DecimalUtil.ZERO ;
      A744PrdUniConM = DecimalUtil.ZERO ;
      A747PrdValConM = DecimalUtil.ZERO ;
      AV45SdtPConCos = new app.SdtSdtPConCos(remoteHandle, context);
      AV46SdtPConCosCollection = new GXBaseCollection<app.SdtSdtPConCos>(app.SdtSdtPConCos.class, "SdtPConCos", "TexplusNET", remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pconconsdt__default(),
         new Object[] {
             new Object[] {
            P08P42_A396EmprCod, P08P42_A719PrdNum, P08P42_A720PrdNumMes, P08P42_A681PrdAny, P08P42_A745PrdUniCprM, P08P42_A749PrdValCprM, P08P42_A744PrdUniConM, P08P42_A747PrdValConM
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV34ContMes ;
   private byte AV40Mes ;
   private byte AV42MesIni ;
   private byte A720PrdNumMes ;
   private short AV43PrdAny ;
   private short AV32AnyAnt ;
   private short A681PrdAny ;
   private short Gx_err ;
   private java.math.BigDecimal A745PrdUniCprM ;
   private java.math.BigDecimal A749PrdValCprM ;
   private java.math.BigDecimal A744PrdUniConM ;
   private java.math.BigDecimal A747PrdValConM ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private java.util.Date AV37DiaIni ;
   private java.util.Date AV35Diafin ;
   private java.util.Date AV38DiaIniAnt ;
   private java.util.Date AV36DiaFinAnt ;
   private java.util.Date AV39FechaActual ;
   private String AV47SdtPConCosJSon ;
   private java.util.Date[] aP7 ;
   private String[] aP3 ;
   private java.util.Date[] aP4 ;
   private java.util.Date[] aP5 ;
   private java.util.Date[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P08P42_A396EmprCod ;
   private String[] P08P42_A719PrdNum ;
   private byte[] P08P42_A720PrdNumMes ;
   private short[] P08P42_A681PrdAny ;
   private java.math.BigDecimal[] P08P42_A745PrdUniCprM ;
   private java.math.BigDecimal[] P08P42_A749PrdValCprM ;
   private java.math.BigDecimal[] P08P42_A744PrdUniConM ;
   private java.math.BigDecimal[] P08P42_A747PrdValConM ;
   private GXBaseCollection<app.SdtSdtPConCos> AV46SdtPConCosCollection ;
   private app.SdtSdtPConCos AV45SdtPConCos ;
}

final  class pconconsdt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08P42", "SELECT EmprCod, PrdNum, PrdNumMes, PrdAny, PrdUniCprM, PrdValCprM, PrdUniConM, PrdValConM FROM TXPLPRDES WHERE (EmprCod = ? and PrdNum = ?) AND (( PrdAny = ? and PrdNumMes >= 1 and PrdNumMes <= ?) or ( ( PrdAny = ? and PrdNumMes >= ? and PrdNumMes <= 12) and Not (? = 0))) ORDER BY EmprCod, PrdNum, PrdAny, PrdNumMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

