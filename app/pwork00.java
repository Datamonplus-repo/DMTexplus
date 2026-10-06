package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pwork00 extends GXProcedure
{
   public pwork00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pwork00.class ), "" );
   }

   public pwork00( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             int[] aP2 ,
                             java.util.Date[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 )
   {
      pwork00.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        int[] aP2 ,
                        java.util.Date[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             int[] aP2 ,
                             java.util.Date[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 )
   {
      pwork00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pwork00.this.AV18ManCod = aP1[0];
      this.aP1 = aP1;
      pwork00.this.AV12SalExtAlb = aP2[0];
      this.aP2 = aP2;
      pwork00.this.AV17SalExtFec = aP3[0];
      this.aP3 = aP3;
      pwork00.this.AV8Barcod = aP4[0];
      this.aP4 = aP4;
      pwork00.this.AV9barcodreo = aP5[0];
      this.aP5 = aP5;
      pwork00.this.AV10barcodpar = aP6[0];
      this.aP6 = aP6;
      pwork00.this.AV19Barordlin = aP7[0];
      this.aP7 = aP7;
      pwork00.this.AV14BarKgm = aP8[0];
      this.aP8 = aP8;
      pwork00.this.AV16BarMtr = aP9[0];
      this.aP9 = aP9;
      pwork00.this.AV15Barpie = aP10[0];
      this.aP10 = aP10;
      pwork00.this.AV11Fascod = aP11[0];
      this.aP11 = aP11;
      pwork00.this.AV20FasDscMn = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV12SalExtAlb ;
      GXv_int3[0] = AV13SalExNln ;
      new app.plexhdpz(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3) ;
      pwork00.this.A396EmprCod = GXv_char1[0] ;
      pwork00.this.AV12SalExtAlb = GXv_int2[0] ;
      pwork00.this.AV13SalExNln = GXv_int3[0] ;
      /*
         INSERT RECORD ON TABLE TXPEXHDPZ

      */
      A2253SalExtAlb = AV12SalExtAlb ;
      A6248SalExNln = AV13SalExNln ;
      A129BarCod = AV8Barcod ;
      A132BarCodReo = AV9barcodreo ;
      A130BarCodPar = AV10barcodpar ;
      A6249SalExObs = " " ;
      A6250SalExFeR = GXutil.nullDate() ;
      A6251SalExKgR = DecimalUtil.doubleToDec(0) ;
      A6252SalExCoR = 0 ;
      A6253SalExEsB = (byte)(0) ;
      A6254SalExEnt = "" ;
      A6255SalExMtR = DecimalUtil.doubleToDec(0) ;
      A6256SalExKgE = AV14BarKgm ;
      A6257SalExCoE = AV15Barpie ;
      A6258SalExMtE = AV16BarMtr ;
      A6558FasCodn = AV11Fascod ;
      A8654ObsM = "" ;
      n8654ObsM = false ;
      A654OrdLin = AV19Barordlin ;
      A14410FasDscMn = AV20FasDscMn ;
      /* Using cursor P055G2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A6249SalExObs, A6250SalExFeR, A6251SalExKgR, Integer.valueOf(A6252SalExCoR), Byte.valueOf(A6253SalExEsB), A6254SalExEnt, A6255SalExMtR, A6256SalExKgE, Integer.valueOf(A6257SalExCoE), A6258SalExMtE, A6558FasCodn, Boolean.valueOf(n8654ObsM), A8654ObsM, Short.valueOf(A654OrdLin), A14410FasDscMn});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV8Barcod ;
      GXv_int4[0] = AV9barcodreo ;
      GXv_char5[0] = AV10barcodpar ;
      GXv_int3[0] = AV19Barordlin ;
      GXv_char6[0] = AV11Fascod ;
      GXv_date7[0] = AV17SalExtFec ;
      GXv_int8[0] = (byte)(1) ;
      GXv_int9[0] = AV12SalExtAlb ;
      new app.trabajosexternos.phdrexwcopy1(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int4, GXv_char5, GXv_int3, GXv_char6, GXv_date7, GXv_int8, GXv_int9) ;
      pwork00.this.A396EmprCod = GXv_char1[0] ;
      pwork00.this.AV8Barcod = GXv_int2[0] ;
      pwork00.this.AV9barcodreo = GXv_int4[0] ;
      pwork00.this.AV10barcodpar = GXv_char5[0] ;
      pwork00.this.AV19Barordlin = GXv_int3[0] ;
      pwork00.this.AV11Fascod = GXv_char6[0] ;
      pwork00.this.AV17SalExtFec = GXv_date7[0] ;
      pwork00.this.AV12SalExtAlb = GXv_int9[0] ;
      GXv_char6[0] = A396EmprCod ;
      GXv_int3[0] = AV18ManCod ;
      GXv_char5[0] = AV11Fascod ;
      GXv_char1[0] = httpContext.getMessage( "E", "") ;
      GXv_int9[0] = AV12SalExtAlb ;
      GXv_decimal10[0] = AV14BarKgm ;
      GXv_decimal11[0] = AV16BarMtr ;
      GXv_int12[0] = (short)(AV15Barpie) ;
      GXv_date7[0] = AV17SalExtFec ;
      GXv_int2[0] = AV8Barcod ;
      GXv_int8[0] = AV9barcodreo ;
      GXv_char13[0] = AV10barcodpar ;
      GXv_int14[0] = AV13SalExNln ;
      new app.trabajosexternos.pamvexhd(remoteHandle, context).execute( GXv_char6, GXv_int3, GXv_char5, GXv_char1, GXv_int9, GXv_decimal10, GXv_decimal11, GXv_int12, GXv_date7, GXv_int2, GXv_int8, GXv_char13, GXv_int14) ;
      pwork00.this.A396EmprCod = GXv_char6[0] ;
      pwork00.this.AV18ManCod = GXv_int3[0] ;
      pwork00.this.AV11Fascod = GXv_char5[0] ;
      pwork00.this.AV12SalExtAlb = GXv_int9[0] ;
      pwork00.this.AV14BarKgm = GXv_decimal10[0] ;
      pwork00.this.AV16BarMtr = GXv_decimal11[0] ;
      pwork00.this.AV15Barpie = GXv_int12[0] ;
      pwork00.this.AV17SalExtFec = GXv_date7[0] ;
      pwork00.this.AV8Barcod = GXv_int2[0] ;
      pwork00.this.AV9barcodreo = GXv_int8[0] ;
      pwork00.this.AV10barcodpar = GXv_char13[0] ;
      pwork00.this.AV13SalExNln = GXv_int14[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pwork00.this.A396EmprCod;
      this.aP1[0] = pwork00.this.AV18ManCod;
      this.aP2[0] = pwork00.this.AV12SalExtAlb;
      this.aP3[0] = pwork00.this.AV17SalExtFec;
      this.aP4[0] = pwork00.this.AV8Barcod;
      this.aP5[0] = pwork00.this.AV9barcodreo;
      this.aP6[0] = pwork00.this.AV10barcodpar;
      this.aP7[0] = pwork00.this.AV19Barordlin;
      this.aP8[0] = pwork00.this.AV14BarKgm;
      this.aP9[0] = pwork00.this.AV16BarMtr;
      this.aP10[0] = pwork00.this.AV15Barpie;
      this.aP11[0] = pwork00.this.AV11Fascod;
      this.aP12[0] = pwork00.this.AV20FasDscMn;
      Application.commitDataStores(context, remoteHandle, pr_default, "pwork00");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A130BarCodPar = "" ;
      A6249SalExObs = "" ;
      A6250SalExFeR = GXutil.nullDate() ;
      A6251SalExKgR = DecimalUtil.ZERO ;
      A6254SalExEnt = "" ;
      A6255SalExMtR = DecimalUtil.ZERO ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A6258SalExMtE = DecimalUtil.ZERO ;
      A6558FasCodn = "" ;
      A8654ObsM = "" ;
      A14410FasDscMn = "" ;
      Gx_emsg = "" ;
      GXv_int4 = new byte[1] ;
      GXv_char6 = new String[1] ;
      GXv_int3 = new short[1] ;
      GXv_char5 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int12 = new short[1] ;
      GXv_date7 = new java.util.Date[1] ;
      GXv_int2 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char13 = new String[1] ;
      GXv_int14 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pwork00__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9barcodreo ;
   private byte A132BarCodReo ;
   private byte A6253SalExEsB ;
   private byte GXv_int4[] ;
   private byte GXv_int8[] ;
   private short AV18ManCod ;
   private short AV19Barordlin ;
   private short AV13SalExNln ;
   private short A6248SalExNln ;
   private short A654OrdLin ;
   private short Gx_err ;
   private short GXv_int3[] ;
   private short GXv_int12[] ;
   private short GXv_int14[] ;
   private int AV12SalExtAlb ;
   private int AV8Barcod ;
   private int AV15Barpie ;
   private int GX_INS910 ;
   private int A2253SalExtAlb ;
   private int A129BarCod ;
   private int A6252SalExCoR ;
   private int A6257SalExCoE ;
   private int GXv_int9[] ;
   private int GXv_int2[] ;
   private java.math.BigDecimal AV14BarKgm ;
   private java.math.BigDecimal AV16BarMtr ;
   private java.math.BigDecimal A6251SalExKgR ;
   private java.math.BigDecimal A6255SalExMtR ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal A6258SalExMtE ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private String A396EmprCod ;
   private String AV10barcodpar ;
   private String AV11Fascod ;
   private String AV20FasDscMn ;
   private String A130BarCodPar ;
   private String A6249SalExObs ;
   private String A6254SalExEnt ;
   private String A6558FasCodn ;
   private String A14410FasDscMn ;
   private String Gx_emsg ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char1[] ;
   private String GXv_char13[] ;
   private java.util.Date AV17SalExtFec ;
   private java.util.Date A6250SalExFeR ;
   private java.util.Date GXv_date7[] ;
   private boolean n8654ObsM ;
   private String A8654ObsM ;
   private String[] aP12 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private int[] aP2 ;
   private java.util.Date[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private short[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
}

final  class pwork00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P055G2", "INSERT INTO TXPEXHDPZ(EmprCod, SalExtAlb, SalExNln, BarCod, BarCodReo, BarCodPar, SalExObs, SalExFeR, SalExKgR, SalExCoR, SalExEsB, SalExEnt, SalExMtR, SalExKgE, SalExCoE, SalExMtE, FasCodn, ObsM, OrdLin, FasDscMn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEXHDPZ")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[15], 2);
               stmt.setString(17, (String)parms[16], 8);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[18], 300);
               }
               stmt.setShort(19, ((Number) parms[19]).shortValue());
               stmt.setString(20, (String)parms[20], 30);
               return;
      }
   }

}

