package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_detail_ins extends GXProcedure
{
   public trabajoexterno_detail_ins( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_detail_ins.class ), "" );
   }

   public trabajoexterno_detail_ins( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        int aP3 ,
                        byte aP4 ,
                        String aP5 ,
                        String aP6 ,
                        java.util.Date aP7 ,
                        java.math.BigDecimal aP8 ,
                        int aP9 ,
                        java.math.BigDecimal aP10 ,
                        String aP11 ,
                        short aP12 ,
                        String aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             int aP3 ,
                             byte aP4 ,
                             String aP5 ,
                             String aP6 ,
                             java.util.Date aP7 ,
                             java.math.BigDecimal aP8 ,
                             int aP9 ,
                             java.math.BigDecimal aP10 ,
                             String aP11 ,
                             short aP12 ,
                             String aP13 )
   {
      trabajoexterno_detail_ins.this.AV22Emprcod = aP0;
      trabajoexterno_detail_ins.this.AV8SalExtAlb = aP1;
      trabajoexterno_detail_ins.this.AV9SalExNln = aP2;
      trabajoexterno_detail_ins.this.AV10BarCod = aP3;
      trabajoexterno_detail_ins.this.AV11BarCodreo = aP4;
      trabajoexterno_detail_ins.this.AV12BarCodpar = aP5;
      trabajoexterno_detail_ins.this.AV13SalExObs = aP6;
      trabajoexterno_detail_ins.this.AV14SalExFeR = aP7;
      trabajoexterno_detail_ins.this.AV16SalExKgE = aP8;
      trabajoexterno_detail_ins.this.AV17SalExCoE = aP9;
      trabajoexterno_detail_ins.this.AV18SalExMtE = aP10;
      trabajoexterno_detail_ins.this.AV19FasCodn = aP11;
      trabajoexterno_detail_ins.this.AV21OrdLin = aP12;
      trabajoexterno_detail_ins.this.AV23FasDscMn = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPEXHDPZ

      */
      A396EmprCod = AV22Emprcod ;
      A2253SalExtAlb = AV8SalExtAlb ;
      A6248SalExNln = AV9SalExNln ;
      A129BarCod = AV10BarCod ;
      A132BarCodReo = AV11BarCodreo ;
      A130BarCodPar = AV12BarCodpar ;
      A6249SalExObs = AV13SalExObs ;
      A6250SalExFeR = AV14SalExFeR ;
      A6251SalExKgR = DecimalUtil.ZERO ;
      A6252SalExCoR = 0 ;
      A6255SalExMtR = DecimalUtil.ZERO ;
      A6253SalExEsB = (byte)(0) ;
      A6254SalExEnt = "" ;
      A6256SalExKgE = AV16SalExKgE ;
      A6257SalExCoE = AV17SalExCoE ;
      A6258SalExMtE = AV18SalExMtE ;
      A6558FasCodn = AV19FasCodn ;
      A654OrdLin = AV21OrdLin ;
      A14410FasDscMn = AV23FasDscMn ;
      A8654ObsM = "" ;
      n8654ObsM = false ;
      /* Using cursor P0ABO2 */
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
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternos.trabajoexterno_detail_ins");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A6249SalExObs = "" ;
      A6250SalExFeR = GXutil.nullDate() ;
      A6251SalExKgR = DecimalUtil.ZERO ;
      A6255SalExMtR = DecimalUtil.ZERO ;
      A6254SalExEnt = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A6258SalExMtE = DecimalUtil.ZERO ;
      A6558FasCodn = "" ;
      A14410FasDscMn = "" ;
      A8654ObsM = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_detail_ins__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11BarCodreo ;
   private byte A132BarCodReo ;
   private byte A6253SalExEsB ;
   private short AV9SalExNln ;
   private short AV21OrdLin ;
   private short A6248SalExNln ;
   private short A654OrdLin ;
   private short Gx_err ;
   private int AV8SalExtAlb ;
   private int AV10BarCod ;
   private int AV17SalExCoE ;
   private int GX_INS910 ;
   private int A2253SalExtAlb ;
   private int A129BarCod ;
   private int A6252SalExCoR ;
   private int A6257SalExCoE ;
   private java.math.BigDecimal AV16SalExKgE ;
   private java.math.BigDecimal AV18SalExMtE ;
   private java.math.BigDecimal A6251SalExKgR ;
   private java.math.BigDecimal A6255SalExMtR ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal A6258SalExMtE ;
   private String AV22Emprcod ;
   private String AV12BarCodpar ;
   private String AV13SalExObs ;
   private String AV19FasCodn ;
   private String AV23FasDscMn ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A6249SalExObs ;
   private String A6254SalExEnt ;
   private String A6558FasCodn ;
   private String A14410FasDscMn ;
   private String Gx_emsg ;
   private java.util.Date AV14SalExFeR ;
   private java.util.Date A6250SalExFeR ;
   private boolean n8654ObsM ;
   private String A8654ObsM ;
   private IDataStoreProvider pr_default ;
}

final  class trabajoexterno_detail_ins__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0ABO2", "INSERT INTO TXPEXHDPZ(EmprCod, SalExtAlb, SalExNln, BarCod, BarCodReo, BarCodPar, SalExObs, SalExFeR, SalExKgR, SalExCoR, SalExEsB, SalExEnt, SalExMtR, SalExKgE, SalExCoE, SalExMtE, FasCodn, ObsM, OrdLin, FasDscMn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEXHDPZ")
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

