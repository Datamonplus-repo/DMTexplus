package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pjln001 extends GXProcedure
{
   public pjln001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pjln001.class ), "" );
   }

   public pjln001( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pjln001.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      pjln001.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pjln001.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pjln001.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pjln001.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pjln001.this.AV10BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pjln001.this.AV8OpeNom = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV12Eliot ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int2) ;
      pjln001.this.GXt_int1 = GXv_int2[0] ;
      AV12Eliot = GXt_int1 ;
      AV8OpeNom = " " ;
      AV11Lhipro = (byte)(0) ;
      /* Using cursor P00UR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV10BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P00UR2_A194BarOrdLin[0] ;
         A656ParCod = P00UR2_A656ParCod[0] ;
         n656ParCod = P00UR2_n656ParCod[0] ;
         A503GruOpeCod = P00UR2_A503GruOpeCod[0] ;
         A561HisProLin = P00UR2_A561HisProLin[0] ;
         A558HisProFec = P00UR2_A558HisProFec[0] ;
         A602MaqCod = P00UR2_A602MaqCod[0] ;
         AV9OpeCod = A503GruOpeCod ;
         AV11Lhipro = (byte)(1) ;
         /* Execute user subroutine: 'OPERA' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( ( AV11Lhipro == 0 ) && ( AV12Eliot == 1 ) )
      {
         /* Using cursor P00UR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV10BarOrdLin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A194BarOrdLin = P00UR3_A194BarOrdLin[0] ;
            A4032CCOpeCod = P00UR3_A4032CCOpeCod[0] ;
            n4032CCOpeCod = P00UR3_n4032CCOpeCod[0] ;
            A758ProCod = P00UR3_A758ProCod[0] ;
            A4031CCTCod = P00UR3_A4031CCTCod[0] ;
            AV9OpeCod = A4032CCOpeCod ;
            /* Execute user subroutine: 'OPERA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPERA' Routine */
      returnInSub = false ;
      AV8OpeNom = "XXXX" ;
      /* Using cursor P00UR4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV9OpeCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A652OpeCod = P00UR4_A652OpeCod[0] ;
         A2505OpePreHor = P00UR4_A2505OpePreHor[0] ;
         n2505OpePreHor = P00UR4_n2505OpePreHor[0] ;
         A653OpeNom = P00UR4_A653OpeNom[0] ;
         n653OpeNom = P00UR4_n653OpeNom[0] ;
         AV8OpeNom = A653OpeNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pjln001.this.A396EmprCod;
      this.aP1[0] = pjln001.this.A129BarCod;
      this.aP2[0] = pjln001.this.A132BarCodReo;
      this.aP3[0] = pjln001.this.A130BarCodPar;
      this.aP4[0] = pjln001.this.AV10BarOrdLin;
      this.aP5[0] = pjln001.this.AV8OpeNom;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P00UR2_A396EmprCod = new String[] {""} ;
      P00UR2_A129BarCod = new int[1] ;
      P00UR2_A132BarCodReo = new byte[1] ;
      P00UR2_A130BarCodPar = new String[] {""} ;
      P00UR2_A194BarOrdLin = new short[1] ;
      P00UR2_A656ParCod = new short[1] ;
      P00UR2_n656ParCod = new boolean[] {false} ;
      P00UR2_A503GruOpeCod = new int[1] ;
      P00UR2_A561HisProLin = new int[1] ;
      P00UR2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00UR2_A602MaqCod = new String[] {""} ;
      A558HisProFec = GXutil.nullDate() ;
      A602MaqCod = "" ;
      P00UR3_A396EmprCod = new String[] {""} ;
      P00UR3_A129BarCod = new int[1] ;
      P00UR3_A132BarCodReo = new byte[1] ;
      P00UR3_A130BarCodPar = new String[] {""} ;
      P00UR3_A194BarOrdLin = new short[1] ;
      P00UR3_A4032CCOpeCod = new int[1] ;
      P00UR3_n4032CCOpeCod = new boolean[] {false} ;
      P00UR3_A758ProCod = new String[] {""} ;
      P00UR3_A4031CCTCod = new int[1] ;
      A758ProCod = "" ;
      P00UR4_A396EmprCod = new String[] {""} ;
      P00UR4_A652OpeCod = new int[1] ;
      P00UR4_A2505OpePreHor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00UR4_n2505OpePreHor = new boolean[] {false} ;
      P00UR4_A653OpeNom = new String[] {""} ;
      P00UR4_n653OpeNom = new boolean[] {false} ;
      A2505OpePreHor = DecimalUtil.ZERO ;
      A653OpeNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pjln001__default(),
         new Object[] {
             new Object[] {
            P00UR2_A396EmprCod, P00UR2_A129BarCod, P00UR2_A132BarCodReo, P00UR2_A130BarCodPar, P00UR2_A194BarOrdLin, P00UR2_A656ParCod, P00UR2_n656ParCod, P00UR2_A503GruOpeCod, P00UR2_A561HisProLin, P00UR2_A558HisProFec,
            P00UR2_A602MaqCod
            }
            , new Object[] {
            P00UR3_A396EmprCod, P00UR3_A129BarCod, P00UR3_A132BarCodReo, P00UR3_A130BarCodPar, P00UR3_A194BarOrdLin, P00UR3_A4032CCOpeCod, P00UR3_n4032CCOpeCod, P00UR3_A758ProCod, P00UR3_A4031CCTCod
            }
            , new Object[] {
            P00UR4_A396EmprCod, P00UR4_A652OpeCod, P00UR4_A2505OpePreHor, P00UR4_n2505OpePreHor, P00UR4_A653OpeNom, P00UR4_n653OpeNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV12Eliot ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV11Lhipro ;
   private short AV10BarOrdLin ;
   private short A194BarOrdLin ;
   private short A656ParCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A503GruOpeCod ;
   private int A561HisProLin ;
   private int AV9OpeCod ;
   private int A4032CCOpeCod ;
   private int A4031CCTCod ;
   private int A652OpeCod ;
   private java.math.BigDecimal A2505OpePreHor ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8OpeNom ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A758ProCod ;
   private String A653OpeNom ;
   private java.util.Date A558HisProFec ;
   private boolean n656ParCod ;
   private boolean returnInSub ;
   private boolean n4032CCOpeCod ;
   private boolean n2505OpePreHor ;
   private boolean n653OpeNom ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00UR2_A396EmprCod ;
   private int[] P00UR2_A129BarCod ;
   private byte[] P00UR2_A132BarCodReo ;
   private String[] P00UR2_A130BarCodPar ;
   private short[] P00UR2_A194BarOrdLin ;
   private short[] P00UR2_A656ParCod ;
   private boolean[] P00UR2_n656ParCod ;
   private int[] P00UR2_A503GruOpeCod ;
   private int[] P00UR2_A561HisProLin ;
   private java.util.Date[] P00UR2_A558HisProFec ;
   private String[] P00UR2_A602MaqCod ;
   private String[] P00UR3_A396EmprCod ;
   private int[] P00UR3_A129BarCod ;
   private byte[] P00UR3_A132BarCodReo ;
   private String[] P00UR3_A130BarCodPar ;
   private short[] P00UR3_A194BarOrdLin ;
   private int[] P00UR3_A4032CCOpeCod ;
   private boolean[] P00UR3_n4032CCOpeCod ;
   private String[] P00UR3_A758ProCod ;
   private int[] P00UR3_A4031CCTCod ;
   private String[] P00UR4_A396EmprCod ;
   private int[] P00UR4_A652OpeCod ;
   private java.math.BigDecimal[] P00UR4_A2505OpePreHor ;
   private boolean[] P00UR4_n2505OpePreHor ;
   private String[] P00UR4_A653OpeNom ;
   private boolean[] P00UR4_n653OpeNom ;
}

final  class pjln001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00UR2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, ParCod, GruOpeCod, HisProLin, HisProFec, MaqCod FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ?) AND (ParCod = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, HisProFec, HisProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00UR3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, CCOpeCod, ProCod, CCTCod FROM TXPCC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00UR4", "SELECT EmprCod, OpeCod, OpePreHor, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

