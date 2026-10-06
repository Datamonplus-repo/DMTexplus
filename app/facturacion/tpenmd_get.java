package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpenmd_get extends GXProcedure
{
   public tpenmd_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpenmd_get.class ), "" );
   }

   public tpenmd_get( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           short aP2 ,
                                           java.math.BigDecimal[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           java.math.BigDecimal[] aP6 )
   {
      tpenmd_get.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      tpenmd_get.this.A396EmprCod = aP0;
      tpenmd_get.this.A252CliCod = aP1;
      tpenmd_get.this.AV8PMDLin = aP2;
      tpenmd_get.this.aP3 = aP3;
      tpenmd_get.this.aP4 = aP4;
      tpenmd_get.this.aP5 = aP5;
      tpenmd_get.this.aP6 = aP6;
      tpenmd_get.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12PMDAcaPrc = DecimalUtil.ZERO ;
      AV9PMDKgmMax = DecimalUtil.ZERO ;
      AV10PMDKgmMin = DecimalUtil.ZERO ;
      AV13PMDKgmMinS = DecimalUtil.ZERO ;
      AV11PMDTinPrc = DecimalUtil.ZERO ;
      /* Using cursor P0AMR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(AV8PMDLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8403PMDLin = P0AMR2_A8403PMDLin[0] ;
         A8407PMDAcaPrc = P0AMR2_A8407PMDAcaPrc[0] ;
         A8405PMDKgmMax = P0AMR2_A8405PMDKgmMax[0] ;
         A8404PMDKgmMin = P0AMR2_A8404PMDKgmMin[0] ;
         A8408PMDKgmMinS = P0AMR2_A8408PMDKgmMinS[0] ;
         A8406PMDTinPrc = P0AMR2_A8406PMDTinPrc[0] ;
         AV12PMDAcaPrc = A8407PMDAcaPrc ;
         AV9PMDKgmMax = A8405PMDKgmMax ;
         AV10PMDKgmMin = A8404PMDKgmMin ;
         AV13PMDKgmMinS = A8408PMDKgmMinS ;
         AV11PMDTinPrc = A8406PMDTinPrc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = tpenmd_get.this.AV9PMDKgmMax;
      this.aP4[0] = tpenmd_get.this.AV10PMDKgmMin;
      this.aP5[0] = tpenmd_get.this.AV11PMDTinPrc;
      this.aP6[0] = tpenmd_get.this.AV12PMDAcaPrc;
      this.aP7[0] = tpenmd_get.this.AV13PMDKgmMinS;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9PMDKgmMax = DecimalUtil.ZERO ;
      AV10PMDKgmMin = DecimalUtil.ZERO ;
      AV11PMDTinPrc = DecimalUtil.ZERO ;
      AV12PMDAcaPrc = DecimalUtil.ZERO ;
      AV13PMDKgmMinS = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AMR2_A396EmprCod = new String[] {""} ;
      P0AMR2_A252CliCod = new int[1] ;
      P0AMR2_A8403PMDLin = new short[1] ;
      P0AMR2_A8407PMDAcaPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AMR2_A8405PMDKgmMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AMR2_A8404PMDKgmMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AMR2_A8408PMDKgmMinS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AMR2_A8406PMDTinPrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A8407PMDAcaPrc = DecimalUtil.ZERO ;
      A8405PMDKgmMax = DecimalUtil.ZERO ;
      A8404PMDKgmMin = DecimalUtil.ZERO ;
      A8408PMDKgmMinS = DecimalUtil.ZERO ;
      A8406PMDTinPrc = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd_get__default(),
         new Object[] {
             new Object[] {
            P0AMR2_A396EmprCod, P0AMR2_A252CliCod, P0AMR2_A8403PMDLin, P0AMR2_A8407PMDAcaPrc, P0AMR2_A8405PMDKgmMax, P0AMR2_A8404PMDKgmMin, P0AMR2_A8408PMDKgmMinS, P0AMR2_A8406PMDTinPrc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8PMDLin ;
   private short A8403PMDLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal AV9PMDKgmMax ;
   private java.math.BigDecimal AV10PMDKgmMin ;
   private java.math.BigDecimal AV11PMDTinPrc ;
   private java.math.BigDecimal AV12PMDAcaPrc ;
   private java.math.BigDecimal AV13PMDKgmMinS ;
   private java.math.BigDecimal A8407PMDAcaPrc ;
   private java.math.BigDecimal A8405PMDKgmMax ;
   private java.math.BigDecimal A8404PMDKgmMin ;
   private java.math.BigDecimal A8408PMDKgmMinS ;
   private java.math.BigDecimal A8406PMDTinPrc ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AMR2_A396EmprCod ;
   private int[] P0AMR2_A252CliCod ;
   private short[] P0AMR2_A8403PMDLin ;
   private java.math.BigDecimal[] P0AMR2_A8407PMDAcaPrc ;
   private java.math.BigDecimal[] P0AMR2_A8405PMDKgmMax ;
   private java.math.BigDecimal[] P0AMR2_A8404PMDKgmMin ;
   private java.math.BigDecimal[] P0AMR2_A8408PMDKgmMinS ;
   private java.math.BigDecimal[] P0AMR2_A8406PMDTinPrc ;
}

final  class tpenmd_get__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AMR2", "SELECT EmprCod, CliCod, PMDLin, PMDAcaPrc, PMDKgmMax, PMDKgmMin, PMDKgmMinS, PMDTinPrc FROM TXPPenMD WHERE EmprCod = ? and CliCod = ? and PMDLin = ? ORDER BY EmprCod, CliCod, PMDLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

