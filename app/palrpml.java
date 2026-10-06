package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palrpml extends GXProcedure
{
   public palrpml( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palrpml.class ), "" );
   }

   public palrpml( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           int[] aP2 ,
                                           byte[] aP3 ,
                                           String[] aP4 ,
                                           String[] aP5 ,
                                           short[] aP6 ,
                                           java.math.BigDecimal[] aP7 )
   {
      palrpml.this.aP8 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 )
   {
      palrpml.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palrpml.this.A200BarPieCod = aP1[0];
      this.aP1 = aP1;
      palrpml.this.AV8AlRPieBarC = aP2[0];
      this.aP2 = aP2;
      palrpml.this.AV9AlRPieBarR = aP3[0];
      this.aP3 = aP3;
      palrpml.this.AV10AlRPieBarP = aP4[0];
      this.aP4 = aP4;
      palrpml.this.AV11AlRPieFasC = aP5[0];
      this.aP5 = aP5;
      palrpml.this.AV12AlRPieFasL = aP6[0];
      this.aP6 = aP6;
      palrpml.this.AV14AlRPieMtrA = aP7[0];
      this.aP7 = aP7;
      palrpml.this.AV15AlrPieKgmA = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18GXLvl1 = (byte)(0) ;
      /* Using cursor P035W2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P035W2_A130BarCodPar[0] ;
         A132BarCodReo = P035W2_A132BarCodReo[0] ;
         A129BarCod = P035W2_A129BarCod[0] ;
         A170BarKilLan = P035W2_A170BarKilLan[0] ;
         A183BarMetLan = P035W2_A183BarMetLan[0] ;
         A203BarPieKil = P035W2_A203BarPieKil[0] ;
         A205BarPieMet = P035W2_A205BarPieMet[0] ;
         AV18GXLvl1 = (byte)(1) ;
         AV8AlRPieBarC = A129BarCod ;
         AV9AlRPieBarR = A132BarCodReo ;
         AV10AlRPieBarP = A130BarCodPar ;
         /* Using cursor P035W3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A153BarFasEst = P035W3_A153BarFasEst[0] ;
            A457FasCod = P035W3_A457FasCod[0] ;
            A194BarOrdLin = P035W3_A194BarOrdLin[0] ;
            A758ProCod = P035W3_A758ProCod[0] ;
            AV11AlRPieFasC = A457FasCod ;
            AV12AlRPieFasL = A194BarOrdLin ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( ( A205BarPieMet.doubleValue() > 0 ) || ( A203BarPieKil.doubleValue() > 0 ) )
         {
            AV15AlrPieKgmA = A203BarPieKil ;
            AV14AlRPieMtrA = A205BarPieMet ;
         }
         else
         {
            AV15AlrPieKgmA = A170BarKilLan ;
            AV14AlRPieMtrA = A183BarMetLan ;
         }
         AV13Cont = AV13Cont.add(DecimalUtil.doubleToDec(1)) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV18GXLvl1 == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Pieza no encontrada en ninguna HDR.", ""));
      }
      if ( AV13Cont.doubleValue() > 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Pieza encontrada en varias HDRs.", ""));
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palrpml.this.A396EmprCod;
      this.aP1[0] = palrpml.this.A200BarPieCod;
      this.aP2[0] = palrpml.this.AV8AlRPieBarC;
      this.aP3[0] = palrpml.this.AV9AlRPieBarR;
      this.aP4[0] = palrpml.this.AV10AlRPieBarP;
      this.aP5[0] = palrpml.this.AV11AlRPieFasC;
      this.aP6[0] = palrpml.this.AV12AlRPieFasL;
      this.aP7[0] = palrpml.this.AV14AlRPieMtrA;
      this.aP8[0] = palrpml.this.AV15AlrPieKgmA;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P035W2_A396EmprCod = new String[] {""} ;
      P035W2_A200BarPieCod = new String[] {""} ;
      P035W2_A130BarCodPar = new String[] {""} ;
      P035W2_A132BarCodReo = new byte[1] ;
      P035W2_A129BarCod = new int[1] ;
      P035W2_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P035W2_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P035W2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P035W2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      P035W3_A396EmprCod = new String[] {""} ;
      P035W3_A129BarCod = new int[1] ;
      P035W3_A132BarCodReo = new byte[1] ;
      P035W3_A130BarCodPar = new String[] {""} ;
      P035W3_A153BarFasEst = new byte[1] ;
      P035W3_A457FasCod = new String[] {""} ;
      P035W3_A194BarOrdLin = new short[1] ;
      P035W3_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV13Cont = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palrpml__default(),
         new Object[] {
             new Object[] {
            P035W2_A396EmprCod, P035W2_A200BarPieCod, P035W2_A130BarCodPar, P035W2_A132BarCodReo, P035W2_A129BarCod, P035W2_A170BarKilLan, P035W2_A183BarMetLan, P035W2_A203BarPieKil, P035W2_A205BarPieMet
            }
            , new Object[] {
            P035W3_A396EmprCod, P035W3_A129BarCod, P035W3_A132BarCodReo, P035W3_A130BarCodPar, P035W3_A153BarFasEst, P035W3_A457FasCod, P035W3_A194BarOrdLin, P035W3_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9AlRPieBarR ;
   private byte AV18GXLvl1 ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private short AV12AlRPieFasL ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV8AlRPieBarC ;
   private int A129BarCod ;
   private java.math.BigDecimal AV14AlRPieMtrA ;
   private java.math.BigDecimal AV15AlrPieKgmA ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV13Cont ;
   private String A396EmprCod ;
   private String A200BarPieCod ;
   private String AV10AlRPieBarP ;
   private String AV11AlRPieFasC ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A457FasCod ;
   private String A758ProCod ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P035W2_A396EmprCod ;
   private String[] P035W2_A200BarPieCod ;
   private String[] P035W2_A130BarCodPar ;
   private byte[] P035W2_A132BarCodReo ;
   private int[] P035W2_A129BarCod ;
   private java.math.BigDecimal[] P035W2_A170BarKilLan ;
   private java.math.BigDecimal[] P035W2_A183BarMetLan ;
   private java.math.BigDecimal[] P035W2_A203BarPieKil ;
   private java.math.BigDecimal[] P035W2_A205BarPieMet ;
   private String[] P035W3_A396EmprCod ;
   private int[] P035W3_A129BarCod ;
   private byte[] P035W3_A132BarCodReo ;
   private String[] P035W3_A130BarCodPar ;
   private byte[] P035W3_A153BarFasEst ;
   private String[] P035W3_A457FasCod ;
   private short[] P035W3_A194BarOrdLin ;
   private String[] P035W3_A758ProCod ;
}

final  class palrpml__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P035W2", "SELECT EmprCod, BarPieCod, BarCodPar, BarCodReo, BarCod, BarKilLan, BarMetLan, BarPieKil, BarPieMet FROM TXPBARPIE WHERE (EmprCod = ? and BarPieCod = ?) AND (BarPieMet > 0 or BarPieKil > 0 or BarMetLan > 0 or BarKilLan > 0) ORDER BY EmprCod, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P035W3", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFasEst, FasCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFasEst > 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
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
               stmt.setString(2, (String)parms[1], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

