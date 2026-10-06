package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pstkifas extends GXProcedure
{
   public pstkifas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pstkifas.class ), "" );
   }

   public pstkifas( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pstkifas.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pstkifas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pstkifas.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      pstkifas.this.AV9BarCodReo = aP2[0];
      this.aP2 = aP2;
      pstkifas.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13MaxFas = (byte)(0) ;
      /* Using cursor P02212 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3400DisRefBCPa = P02212_A3400DisRefBCPa[0] ;
         A3399DisRefBCRe = P02212_A3399DisRefBCRe[0] ;
         A3398DisRefBarC = P02212_A3398DisRefBarC[0] ;
         A361DisCod = P02212_A361DisCod[0] ;
         A3607DisRefBPie = P02212_A3607DisRefBPie[0] ;
         /* Using cursor P02213 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV11DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A129BarCod = P02213_A129BarCod[0] ;
            A132BarCodReo = P02213_A132BarCodReo[0] ;
            A130BarCodPar = P02213_A130BarCodPar[0] ;
            A153BarFasEst = P02213_A153BarFasEst[0] ;
            A361DisCod = P02213_A361DisCod[0] ;
            A457FasCod = P02213_A457FasCod[0] ;
            A758ProCod = P02213_A758ProCod[0] ;
            A194BarOrdLin = P02213_A194BarOrdLin[0] ;
            A361DisCod = P02213_A361DisCod[0] ;
            AV13MaxFas = (byte)(AV13MaxFas+1) ;
            AV12FasCod[AV13MaxFas-1] = A457FasCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P02214 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P02214_A457FasCod[0] ;
         A130BarCodPar = P02214_A130BarCodPar[0] ;
         A132BarCodReo = P02214_A132BarCodReo[0] ;
         A129BarCod = P02214_A129BarCod[0] ;
         A758ProCod = P02214_A758ProCod[0] ;
         A194BarOrdLin = P02214_A194BarOrdLin[0] ;
         if ( new app.core.ascan(remoteHandle, context).executeUdp( AV12FasCod, A457FasCod) > 0 )
         {
            /* Using cursor P02215 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pstkifas.this.A396EmprCod;
      this.aP1[0] = pstkifas.this.AV8BarCod;
      this.aP2[0] = pstkifas.this.AV9BarCodReo;
      this.aP3[0] = pstkifas.this.AV10BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pstkifas");
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
      P02212_A396EmprCod = new String[] {""} ;
      P02212_A3400DisRefBCPa = new String[] {""} ;
      P02212_A3399DisRefBCRe = new byte[1] ;
      P02212_A3398DisRefBarC = new int[1] ;
      P02212_A361DisCod = new int[1] ;
      P02212_A3607DisRefBPie = new String[] {""} ;
      A3400DisRefBCPa = "" ;
      A3607DisRefBPie = "" ;
      P02213_A129BarCod = new int[1] ;
      P02213_A132BarCodReo = new byte[1] ;
      P02213_A130BarCodPar = new String[] {""} ;
      P02213_A396EmprCod = new String[] {""} ;
      P02213_A153BarFasEst = new byte[1] ;
      P02213_A361DisCod = new int[1] ;
      P02213_A457FasCod = new String[] {""} ;
      P02213_A758ProCod = new String[] {""} ;
      P02213_A194BarOrdLin = new short[1] ;
      A130BarCodPar = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV12FasCod = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV12FasCod[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P02214_A396EmprCod = new String[] {""} ;
      P02214_A457FasCod = new String[] {""} ;
      P02214_A130BarCodPar = new String[] {""} ;
      P02214_A132BarCodReo = new byte[1] ;
      P02214_A129BarCod = new int[1] ;
      P02214_A758ProCod = new String[] {""} ;
      P02214_A194BarOrdLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pstkifas__default(),
         new Object[] {
             new Object[] {
            P02212_A396EmprCod, P02212_A3400DisRefBCPa, P02212_A3399DisRefBCRe, P02212_A3398DisRefBarC, P02212_A361DisCod, P02212_A3607DisRefBPie
            }
            , new Object[] {
            P02213_A129BarCod, P02213_A132BarCodReo, P02213_A130BarCodPar, P02213_A396EmprCod, P02213_A153BarFasEst, P02213_A361DisCod, P02213_A457FasCod, P02213_A758ProCod, P02213_A194BarOrdLin
            }
            , new Object[] {
            P02214_A396EmprCod, P02214_A457FasCod, P02214_A130BarCodPar, P02214_A132BarCodReo, P02214_A129BarCod, P02214_A758ProCod, P02214_A194BarOrdLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodReo ;
   private byte AV13MaxFas ;
   private byte A3399DisRefBCRe ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV8BarCod ;
   private int A3398DisRefBarC ;
   private int A361DisCod ;
   private int AV11DisCod ;
   private int A129BarCod ;
   private int GX_I ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String scmdbuf ;
   private String A3400DisRefBCPa ;
   private String A3607DisRefBPie ;
   private String A130BarCodPar ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV12FasCod[] ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02212_A396EmprCod ;
   private String[] P02212_A3400DisRefBCPa ;
   private byte[] P02212_A3399DisRefBCRe ;
   private int[] P02212_A3398DisRefBarC ;
   private int[] P02212_A361DisCod ;
   private String[] P02212_A3607DisRefBPie ;
   private int[] P02213_A129BarCod ;
   private byte[] P02213_A132BarCodReo ;
   private String[] P02213_A130BarCodPar ;
   private String[] P02213_A396EmprCod ;
   private byte[] P02213_A153BarFasEst ;
   private int[] P02213_A361DisCod ;
   private String[] P02213_A457FasCod ;
   private String[] P02213_A758ProCod ;
   private short[] P02213_A194BarOrdLin ;
   private String[] P02214_A396EmprCod ;
   private String[] P02214_A457FasCod ;
   private String[] P02214_A130BarCodPar ;
   private byte[] P02214_A132BarCodReo ;
   private int[] P02214_A129BarCod ;
   private String[] P02214_A758ProCod ;
   private short[] P02214_A194BarOrdLin ;
}

final  class pstkifas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02212", "SELECT EmprCod, DisRefBCPa, DisRefBCRe, DisRefBarC, DisCod, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? and DisRefBarC = ? and DisRefBCRe = ? and DisRefBCPa = ? ORDER BY EmprCod, DisRefBarC, DisRefBCRe, DisRefBCPa ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02213", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T1.BarFasEst, T2.DisCod, T1.FasCod, T1.ProCod, T1.BarOrdLin FROM (TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T2.DisCod = ?) AND (T1.BarFasEst = 2) ORDER BY T1.EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02214", "SELECT EmprCod, FasCod, BarCodPar, BarCodReo, BarCod, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02215", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

