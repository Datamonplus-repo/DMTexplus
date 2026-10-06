package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pakmtot extends GXProcedure
{
   public pakmtot( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pakmtot.class ), "" );
   }

   public pakmtot( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           java.math.BigDecimal[] aP4 )
   {
      pakmtot.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pakmtot.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pakmtot.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pakmtot.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pakmtot.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pakmtot.this.AV8TotK = aP4[0];
      this.aP4 = aP4;
      pakmtot.this.AV9TotM = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV11ConversionLbvsKgs ;
      GXv_int2[0] = GXt_int1 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LBVSKG", ""), GXv_int2) ;
      pakmtot.this.GXt_int1 = GXv_int2[0] ;
      AV11ConversionLbvsKgs = GXt_int1 ;
      AV12lbvsKgs = ((AV11ConversionLbvsKgs==0) ? DecimalUtil.doubleToDec(1) : DecimalUtil.doubleToDec(AV11ConversionLbvsKgs/ (double) (100))) ;
      /* Using cursor P01YF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A590KgmAgr = P01YF2_A590KgmAgr[0] ;
         A869MtrAgr = P01YF2_A869MtrAgr[0] ;
         A119BarAgrCod = P01YF2_A119BarAgrCod[0] ;
         A124BarAgrReo = P01YF2_A124BarAgrReo[0] ;
         A122BarAgrPar = P01YF2_A122BarAgrPar[0] ;
         AV8TotK = AV8TotK.add(((A590KgmAgr.divide(AV12lbvsKgs, 18, java.math.RoundingMode.DOWN)))) ;
         AV9TotM = AV9TotM.add(A869MtrAgr) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pakmtot.this.A396EmprCod;
      this.aP1[0] = pakmtot.this.A129BarCod;
      this.aP2[0] = pakmtot.this.A132BarCodReo;
      this.aP3[0] = pakmtot.this.A130BarCodPar;
      this.aP4[0] = pakmtot.this.AV8TotK;
      this.aP5[0] = pakmtot.this.AV9TotM;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new int[1] ;
      AV12lbvsKgs = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01YF2_A396EmprCod = new String[] {""} ;
      P01YF2_A129BarCod = new int[1] ;
      P01YF2_A132BarCodReo = new byte[1] ;
      P01YF2_A130BarCodPar = new String[] {""} ;
      P01YF2_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YF2_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YF2_A119BarAgrCod = new int[1] ;
      P01YF2_A124BarAgrReo = new byte[1] ;
      P01YF2_A122BarAgrPar = new String[] {""} ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A122BarAgrPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pakmtot__default(),
         new Object[] {
             new Object[] {
            P01YF2_A396EmprCod, P01YF2_A129BarCod, P01YF2_A132BarCodReo, P01YF2_A130BarCodPar, P01YF2_A590KgmAgr, P01YF2_A869MtrAgr, P01YF2_A119BarAgrCod, P01YF2_A124BarAgrReo, P01YF2_A122BarAgrPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV11ConversionLbvsKgs ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private int A119BarAgrCod ;
   private java.math.BigDecimal AV8TotK ;
   private java.math.BigDecimal AV9TotM ;
   private java.math.BigDecimal AV12lbvsKgs ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A122BarAgrPar ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01YF2_A396EmprCod ;
   private int[] P01YF2_A129BarCod ;
   private byte[] P01YF2_A132BarCodReo ;
   private String[] P01YF2_A130BarCodPar ;
   private java.math.BigDecimal[] P01YF2_A590KgmAgr ;
   private java.math.BigDecimal[] P01YF2_A869MtrAgr ;
   private int[] P01YF2_A119BarAgrCod ;
   private byte[] P01YF2_A124BarAgrReo ;
   private String[] P01YF2_A122BarAgrPar ;
}

final  class pakmtot__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01YF2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, KgmAgr, MtrAgr, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
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
               return;
      }
   }

}

