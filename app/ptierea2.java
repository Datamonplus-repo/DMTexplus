package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptierea2 extends GXProcedure
{
   public ptierea2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptierea2.class ), "" );
   }

   public ptierea2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           short[] aP4 )
   {
      ptierea2.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      ptierea2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptierea2.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      ptierea2.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      ptierea2.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      ptierea2.this.A194BarOrdLin = aP4[0];
      this.aP4 = aP4;
      ptierea2.this.AV20BarTieRea = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV25FlagTireal ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TIREAL", ""), GXv_int1) ;
      ptierea2.this.AV25FlagTireal = GXv_int1[0] ;
      AV15Tiempo_f = (short)(0) ;
      /* Using cursor P020D2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A656ParCod = P020D2_A656ParCod[0] ;
         n656ParCod = P020D2_n656ParCod[0] ;
         A556HisProEst = P020D2_A556HisProEst[0] ;
         A4440HisProDTI = P020D2_A4440HisProDTI[0] ;
         n4440HisProDTI = P020D2_n4440HisProDTI[0] ;
         A4441HisProDTF = P020D2_A4441HisProDTF[0] ;
         n4441HisProDTF = P020D2_n4441HisProDTF[0] ;
         A563HisProMin = P020D2_A563HisProMin[0] ;
         A560HisProHin = P020D2_A560HisProHin[0] ;
         A562HisProMfi = P020D2_A562HisProMfi[0] ;
         A559HisProHfi = P020D2_A559HisProHfi[0] ;
         A602MaqCod = P020D2_A602MaqCod[0] ;
         A558HisProFec = P020D2_A558HisProFec[0] ;
         A561HisProLin = P020D2_A561HisProLin[0] ;
         if ( A560HisProHin <= A559HisProHfi )
         {
            A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         }
         else
         {
            A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         }
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         if ( A556HisProEst == 1 )
         {
            if ( AV25FlagTireal == 0 )
            {
               AV15Tiempo_f = (short)(AV15Tiempo_f+A564HisProTre) ;
            }
            else
            {
               AV15Tiempo_f = (short)(AV15Tiempo_f+A5605HisProTr2) ;
            }
         }
         if ( AV15Tiempo_f > 9999 )
         {
            AV15Tiempo_f = (short)(0) ;
         }
         AV20BarTieRea = DecimalUtil.doubleToDec(AV15Tiempo_f/ (double) (60)) ;
         AV21BarTie2 = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV20BarTieRea))) ;
         AV22Resto = AV20BarTieRea.subtract(AV21BarTie2) ;
         AV20BarTieRea = AV21BarTie2.add(((AV22Resto.multiply(DecimalUtil.doubleToDec(60))).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptierea2.this.A396EmprCod;
      this.aP1[0] = ptierea2.this.A129BarCod;
      this.aP2[0] = ptierea2.this.A132BarCodReo;
      this.aP3[0] = ptierea2.this.A130BarCodPar;
      this.aP4[0] = ptierea2.this.A194BarOrdLin;
      this.aP5[0] = ptierea2.this.AV20BarTieRea;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P020D2_A396EmprCod = new String[] {""} ;
      P020D2_A129BarCod = new int[1] ;
      P020D2_A132BarCodReo = new byte[1] ;
      P020D2_A130BarCodPar = new String[] {""} ;
      P020D2_A194BarOrdLin = new short[1] ;
      P020D2_A656ParCod = new short[1] ;
      P020D2_n656ParCod = new boolean[] {false} ;
      P020D2_A556HisProEst = new byte[1] ;
      P020D2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P020D2_n4440HisProDTI = new boolean[] {false} ;
      P020D2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P020D2_n4441HisProDTF = new boolean[] {false} ;
      P020D2_A563HisProMin = new byte[1] ;
      P020D2_A560HisProHin = new byte[1] ;
      P020D2_A562HisProMfi = new byte[1] ;
      P020D2_A559HisProHfi = new byte[1] ;
      P020D2_A602MaqCod = new String[] {""} ;
      P020D2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P020D2_A561HisProLin = new int[1] ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      AV21BarTie2 = DecimalUtil.ZERO ;
      AV22Resto = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptierea2__default(),
         new Object[] {
             new Object[] {
            P020D2_A396EmprCod, P020D2_A129BarCod, P020D2_A132BarCodReo, P020D2_A130BarCodPar, P020D2_A194BarOrdLin, P020D2_A656ParCod, P020D2_n656ParCod, P020D2_A556HisProEst, P020D2_A4440HisProDTI, P020D2_n4440HisProDTI,
            P020D2_A4441HisProDTF, P020D2_n4441HisProDTF, P020D2_A563HisProMin, P020D2_A560HisProHin, P020D2_A562HisProMfi, P020D2_A559HisProHfi, P020D2_A602MaqCod, P020D2_A558HisProFec, P020D2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV25FlagTireal ;
   private byte GXv_int1[] ;
   private byte A556HisProEst ;
   private byte A563HisProMin ;
   private byte A560HisProHin ;
   private byte A562HisProMfi ;
   private byte A559HisProHfi ;
   private short A194BarOrdLin ;
   private short AV15Tiempo_f ;
   private short A656ParCod ;
   private short A564HisProTre ;
   private short A5605HisProTr2 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private java.math.BigDecimal AV20BarTieRea ;
   private java.math.BigDecimal AV21BarTie2 ;
   private java.math.BigDecimal AV22Resto ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean n656ParCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P020D2_A396EmprCod ;
   private int[] P020D2_A129BarCod ;
   private byte[] P020D2_A132BarCodReo ;
   private String[] P020D2_A130BarCodPar ;
   private short[] P020D2_A194BarOrdLin ;
   private short[] P020D2_A656ParCod ;
   private boolean[] P020D2_n656ParCod ;
   private byte[] P020D2_A556HisProEst ;
   private java.util.Date[] P020D2_A4440HisProDTI ;
   private boolean[] P020D2_n4440HisProDTI ;
   private java.util.Date[] P020D2_A4441HisProDTF ;
   private boolean[] P020D2_n4441HisProDTF ;
   private byte[] P020D2_A563HisProMin ;
   private byte[] P020D2_A560HisProHin ;
   private byte[] P020D2_A562HisProMfi ;
   private byte[] P020D2_A559HisProHfi ;
   private String[] P020D2_A602MaqCod ;
   private java.util.Date[] P020D2_A558HisProFec ;
   private int[] P020D2_A561HisProLin ;
}

final  class ptierea2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P020D2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, ParCod, HisProEst, HisProDTI, HisProDTF, HisProMin, HisProHin, HisProMfi, HisProHfi, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ?) AND ((ParCod = 0)) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 6);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(15);
               ((int[]) buf[18])[0] = rslt.getInt(16);
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
      }
   }

}

