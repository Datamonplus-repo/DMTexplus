package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprofas extends GXProcedure
{
   public pprofas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprofas.class ), "" );
   }

   public pprofas( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      pprofas.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pprofas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprofas.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pprofas.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pprofas.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      pprofas.this.AV33RecLinMaq = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P017J2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P017J2_A130BarCodPar[0] ;
         n130BarCodPar = P017J2_n130BarCodPar[0] ;
         A132BarCodReo = P017J2_A132BarCodReo[0] ;
         n132BarCodReo = P017J2_n132BarCodReo[0] ;
         A129BarCod = P017J2_A129BarCod[0] ;
         n129BarCod = P017J2_n129BarCod[0] ;
         A218BarTipCol = P017J2_A218BarTipCol[0] ;
         A135BarColNom = P017J2_A135BarColNom[0] ;
         A136BarColNum = P017J2_A136BarColNum[0] ;
         A212BarSer = P017J2_A212BarSer[0] ;
         A252CliCod = P017J2_A252CliCod[0] ;
         n252CliCod = P017J2_n252CliCod[0] ;
         W129BarCod = A129BarCod ;
         n129BarCod = false ;
         W132BarCodReo = A132BarCodReo ;
         n132BarCodReo = false ;
         W130BarCodPar = A130BarCodPar ;
         n130BarCodPar = false ;
         AV24Linea = (short)(0) ;
         /* Using cursor P017J3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A212BarSer, Integer.valueOf(A136BarColNum), A135BarColNom, Byte.valueOf(A218BarTipCol)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A764ProForCod = P017J3_A764ProForCod[0] ;
            A831TipColCod = P017J3_A831TipColCod[0] ;
            A482ForColNom = P017J3_A482ForColNom[0] ;
            A483ForColNum = P017J3_A483ForColNum[0] ;
            A494ForSer = P017J3_A494ForSer[0] ;
            A1160ProForL = P017J3_A1160ProForL[0] ;
            AV24Linea = (short)(AV24Linea+10) ;
            /*
               INSERT RECORD ON TABLE TXPCRECET

            */
            W129BarCod = A129BarCod ;
            n129BarCod = false ;
            W132BarCodReo = A132BarCodReo ;
            n132BarCodReo = false ;
            W130BarCodPar = A130BarCodPar ;
            n130BarCodPar = false ;
            A129BarCod = AV16BarCod ;
            n129BarCod = false ;
            A132BarCodReo = AV17BarCodReo ;
            n132BarCodReo = false ;
            A130BarCodPar = AV18BarCodPar ;
            n130BarCodPar = false ;
            A2804RecLinMaq = AV33RecLinMaq ;
            A1273RecLinPro = (byte)(AV24Linea) ;
            /* Using cursor P017J4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), A764ProForCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
            if ( (pr_default.getStatus(2) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A129BarCod = W129BarCod ;
            n129BarCod = false ;
            A132BarCodReo = W132BarCodReo ;
            n132BarCodReo = false ;
            A130BarCodPar = W130BarCodPar ;
            n130BarCodPar = false ;
            /* End Insert */
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A129BarCod = W129BarCod ;
         n129BarCod = false ;
         A132BarCodReo = W132BarCodReo ;
         n132BarCodReo = false ;
         A130BarCodPar = W130BarCodPar ;
         n130BarCodPar = false ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P017J5 */
      byte AV24Linea1272Aux;
      AV24Linea1272Aux = (byte)(AV24Linea) ;
      pr_default.execute(3, new Object[] {Byte.valueOf(AV24Linea1272Aux), A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, Short.valueOf(AV33RecLinMaq)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprofas.this.A396EmprCod;
      this.aP1[0] = pprofas.this.AV16BarCod;
      this.aP2[0] = pprofas.this.AV17BarCodReo;
      this.aP3[0] = pprofas.this.AV18BarCodPar;
      this.aP4[0] = pprofas.this.AV33RecLinMaq;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprofas");
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
      P017J2_A396EmprCod = new String[] {""} ;
      P017J2_A130BarCodPar = new String[] {""} ;
      P017J2_n130BarCodPar = new boolean[] {false} ;
      P017J2_A132BarCodReo = new byte[1] ;
      P017J2_n132BarCodReo = new boolean[] {false} ;
      P017J2_A129BarCod = new int[1] ;
      P017J2_n129BarCod = new boolean[] {false} ;
      P017J2_A218BarTipCol = new byte[1] ;
      P017J2_A135BarColNom = new String[] {""} ;
      P017J2_A136BarColNum = new int[1] ;
      P017J2_A212BarSer = new String[] {""} ;
      P017J2_A252CliCod = new int[1] ;
      P017J2_n252CliCod = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      W130BarCodPar = "" ;
      P017J3_A252CliCod = new int[1] ;
      P017J3_n252CliCod = new boolean[] {false} ;
      P017J3_A396EmprCod = new String[] {""} ;
      P017J3_A129BarCod = new int[1] ;
      P017J3_n129BarCod = new boolean[] {false} ;
      P017J3_A132BarCodReo = new byte[1] ;
      P017J3_n132BarCodReo = new boolean[] {false} ;
      P017J3_A130BarCodPar = new String[] {""} ;
      P017J3_n130BarCodPar = new boolean[] {false} ;
      P017J3_A764ProForCod = new String[] {""} ;
      P017J3_A831TipColCod = new byte[1] ;
      P017J3_A482ForColNom = new String[] {""} ;
      P017J3_A483ForColNum = new int[1] ;
      P017J3_A494ForSer = new String[] {""} ;
      P017J3_A1160ProForL = new short[1] ;
      A764ProForCod = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprofas__default(),
         new Object[] {
             new Object[] {
            P017J2_A396EmprCod, P017J2_A130BarCodPar, P017J2_A132BarCodReo, P017J2_A129BarCod, P017J2_A218BarTipCol, P017J2_A135BarColNom, P017J2_A136BarColNum, P017J2_A212BarSer, P017J2_A252CliCod, P017J2_n252CliCod
            }
            , new Object[] {
            P017J3_A252CliCod, P017J3_A396EmprCod, P017J3_A129BarCod, P017J3_n129BarCod, P017J3_A132BarCodReo, P017J3_n132BarCodReo, P017J3_A130BarCodPar, P017J3_n130BarCodPar, P017J3_A764ProForCod, P017J3_A831TipColCod,
            P017J3_A482ForColNom, P017J3_A483ForColNum, P017J3_A494ForSer, P017J3_A1160ProForL
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte W132BarCodReo ;
   private byte A831TipColCod ;
   private byte A1273RecLinPro ;
   private byte A1272UltLinPro ;
   private short AV33RecLinMaq ;
   private short AV24Linea ;
   private short A1160ProForL ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int W129BarCod ;
   private int A483ForColNum ;
   private int GX_INS409 ;
   private String A396EmprCod ;
   private String AV18BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String W130BarCodPar ;
   private String A764ProForCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String Gx_emsg ;
   private boolean n130BarCodPar ;
   private boolean n132BarCodReo ;
   private boolean n129BarCod ;
   private boolean n252CliCod ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P017J2_A396EmprCod ;
   private String[] P017J2_A130BarCodPar ;
   private boolean[] P017J2_n130BarCodPar ;
   private byte[] P017J2_A132BarCodReo ;
   private boolean[] P017J2_n132BarCodReo ;
   private int[] P017J2_A129BarCod ;
   private boolean[] P017J2_n129BarCod ;
   private byte[] P017J2_A218BarTipCol ;
   private String[] P017J2_A135BarColNom ;
   private int[] P017J2_A136BarColNum ;
   private String[] P017J2_A212BarSer ;
   private int[] P017J2_A252CliCod ;
   private boolean[] P017J2_n252CliCod ;
   private int[] P017J3_A252CliCod ;
   private boolean[] P017J3_n252CliCod ;
   private String[] P017J3_A396EmprCod ;
   private int[] P017J3_A129BarCod ;
   private boolean[] P017J3_n129BarCod ;
   private byte[] P017J3_A132BarCodReo ;
   private boolean[] P017J3_n132BarCodReo ;
   private String[] P017J3_A130BarCodPar ;
   private boolean[] P017J3_n130BarCodPar ;
   private String[] P017J3_A764ProForCod ;
   private byte[] P017J3_A831TipColCod ;
   private String[] P017J3_A482ForColNom ;
   private int[] P017J3_A483ForColNum ;
   private String[] P017J3_A494ForSer ;
   private short[] P017J3_A1160ProForL ;
}

final  class pprofas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P017J2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarTipCol, BarColNom, BarColNum, BarSer, CliCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P017J3", "SELECT T1.CliCod, T1.EmprCod, T2.BarCod, T2.BarCodReo, T2.BarCodPar, T1.ProForCod, T1.TipColCod, T1.ForColNom, T1.ForColNum, T1.ForSer, T1.ProForL FROM (TXPLFORMU T1 INNER JOIN TXPCFORMU T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ForSer = T1.ForSer AND T2.ForColNom = T1.ForColNom AND T2.ForColNum = T1.ForColNum AND T2.TipColCod = T1.TipColCod) WHERE (T1.EmprCod = ?) AND (T2.BarCod = ?) AND (T2.BarCodReo = ?) AND (T2.BarCodPar = ?) AND (T1.ForSer = ? and T1.ForColNum = ? and T1.ForColNom = ? and T1.TipColCod = ?) ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P017J4", "INSERT INTO TXPCRECET(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, ProForCod, ProRecObs, RecVolPrf, RecTiempo, RecNroPrg, RecTemp, RecPhMx, RecPhMn, RecRb, RecNumRec, RecNH2O) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new UpdateCursor("P017J5", "UPDATE TXPRECMAQ SET UltLinPro=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 16);
               ((short[]) buf[13])[0] = rslt.getShort(11);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setString(5, (String)parms[7], 16);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setString(7, (String)parms[9], 13);
               stmt.setByte(8, ((Number) parms[10]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 6);
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

