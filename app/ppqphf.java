package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppqphf extends GXProcedure
{
   public ppqphf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppqphf.class ), "" );
   }

   public ppqphf( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 )
   {
      ppqphf.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      ppqphf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppqphf.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      ppqphf.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      ppqphf.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      ppqphf.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      ppqphf.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23DisQui = (byte)(0) ;
      /* Using cursor P02BN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5372FasQuiUl = P02BN2_A5372FasQuiUl[0] ;
         n5372FasQuiUl = P02BN2_n5372FasQuiUl[0] ;
         /* Using cursor P02BN3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5371FasQuiLin = P02BN3_A5371FasQuiLin[0] ;
            AV23DisQui = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV23DisQui == 0 )
         {
            A5372FasQuiUl = (short)(0) ;
            n5372FasQuiUl = false ;
         }
         /* Using cursor P02BN4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n5372FasQuiUl), Short.valueOf(A5372FasQuiUl), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppqphf.this.A396EmprCod;
      this.aP1[0] = ppqphf.this.A129BarCod;
      this.aP2[0] = ppqphf.this.A132BarCodReo;
      this.aP3[0] = ppqphf.this.A130BarCodPar;
      this.aP4[0] = ppqphf.this.A758ProCod;
      this.aP5[0] = ppqphf.this.A194BarOrdLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppqphf");
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
      P02BN2_A396EmprCod = new String[] {""} ;
      P02BN2_A129BarCod = new int[1] ;
      P02BN2_A132BarCodReo = new byte[1] ;
      P02BN2_A130BarCodPar = new String[] {""} ;
      P02BN2_A758ProCod = new String[] {""} ;
      P02BN2_A194BarOrdLin = new short[1] ;
      P02BN2_A5372FasQuiUl = new short[1] ;
      P02BN2_n5372FasQuiUl = new boolean[] {false} ;
      P02BN3_A396EmprCod = new String[] {""} ;
      P02BN3_A129BarCod = new int[1] ;
      P02BN3_A132BarCodReo = new byte[1] ;
      P02BN3_A130BarCodPar = new String[] {""} ;
      P02BN3_A758ProCod = new String[] {""} ;
      P02BN3_A194BarOrdLin = new short[1] ;
      P02BN3_A5371FasQuiLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppqphf__default(),
         new Object[] {
             new Object[] {
            P02BN2_A396EmprCod, P02BN2_A129BarCod, P02BN2_A132BarCodReo, P02BN2_A130BarCodPar, P02BN2_A758ProCod, P02BN2_A194BarOrdLin, P02BN2_A5372FasQuiUl, P02BN2_n5372FasQuiUl
            }
            , new Object[] {
            P02BN3_A396EmprCod, P02BN3_A129BarCod, P02BN3_A132BarCodReo, P02BN3_A130BarCodPar, P02BN3_A758ProCod, P02BN3_A194BarOrdLin, P02BN3_A5371FasQuiLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV23DisQui ;
   private short A194BarOrdLin ;
   private short A5372FasQuiUl ;
   private short A5371FasQuiLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String scmdbuf ;
   private boolean n5372FasQuiUl ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02BN2_A396EmprCod ;
   private int[] P02BN2_A129BarCod ;
   private byte[] P02BN2_A132BarCodReo ;
   private String[] P02BN2_A130BarCodPar ;
   private String[] P02BN2_A758ProCod ;
   private short[] P02BN2_A194BarOrdLin ;
   private short[] P02BN2_A5372FasQuiUl ;
   private boolean[] P02BN2_n5372FasQuiUl ;
   private String[] P02BN3_A396EmprCod ;
   private int[] P02BN3_A129BarCod ;
   private byte[] P02BN3_A132BarCodReo ;
   private String[] P02BN3_A130BarCodPar ;
   private String[] P02BN3_A758ProCod ;
   private short[] P02BN3_A194BarOrdLin ;
   private short[] P02BN3_A5371FasQuiLin ;
}

final  class ppqphf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02BN2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiUl FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02BN3", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02BN4", "UPDATE TXPBARFAS SET FasQuiUl=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

