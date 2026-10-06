package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdfpq extends GXProcedure
{
   public phdfpq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdfpq.class ), "" );
   }

   public phdfpq( int remoteHandle ,
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
      phdfpq.this.aP5 = new short[] {0};
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
      phdfpq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdfpq.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      phdfpq.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      phdfpq.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      phdfpq.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      phdfpq.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02K22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5372FasQuiUl = P02K22_A5372FasQuiUl[0] ;
         n5372FasQuiUl = P02K22_n5372FasQuiUl[0] ;
         AV8FasQuiUl = (short)(0) ;
         AV9Num_l = (short)(0) ;
         /* Using cursor P02K23 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5371FasQuiLin = P02K23_A5371FasQuiLin[0] ;
            AV9Num_l = A5371FasQuiLin ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A5372FasQuiUl = AV9Num_l ;
         n5372FasQuiUl = false ;
         /* Using cursor P02K24 */
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
      this.aP0[0] = phdfpq.this.A396EmprCod;
      this.aP1[0] = phdfpq.this.A129BarCod;
      this.aP2[0] = phdfpq.this.A132BarCodReo;
      this.aP3[0] = phdfpq.this.A130BarCodPar;
      this.aP4[0] = phdfpq.this.A758ProCod;
      this.aP5[0] = phdfpq.this.A194BarOrdLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "phdfpq");
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
      P02K22_A396EmprCod = new String[] {""} ;
      P02K22_A129BarCod = new int[1] ;
      P02K22_A132BarCodReo = new byte[1] ;
      P02K22_A130BarCodPar = new String[] {""} ;
      P02K22_A758ProCod = new String[] {""} ;
      P02K22_A194BarOrdLin = new short[1] ;
      P02K22_A5372FasQuiUl = new short[1] ;
      P02K22_n5372FasQuiUl = new boolean[] {false} ;
      P02K23_A396EmprCod = new String[] {""} ;
      P02K23_A129BarCod = new int[1] ;
      P02K23_A132BarCodReo = new byte[1] ;
      P02K23_A130BarCodPar = new String[] {""} ;
      P02K23_A758ProCod = new String[] {""} ;
      P02K23_A194BarOrdLin = new short[1] ;
      P02K23_A5371FasQuiLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdfpq__default(),
         new Object[] {
             new Object[] {
            P02K22_A396EmprCod, P02K22_A129BarCod, P02K22_A132BarCodReo, P02K22_A130BarCodPar, P02K22_A758ProCod, P02K22_A194BarOrdLin, P02K22_A5372FasQuiUl, P02K22_n5372FasQuiUl
            }
            , new Object[] {
            P02K23_A396EmprCod, P02K23_A129BarCod, P02K23_A132BarCodReo, P02K23_A130BarCodPar, P02K23_A758ProCod, P02K23_A194BarOrdLin, P02K23_A5371FasQuiLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short A5372FasQuiUl ;
   private short AV8FasQuiUl ;
   private short AV9Num_l ;
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
   private String[] P02K22_A396EmprCod ;
   private int[] P02K22_A129BarCod ;
   private byte[] P02K22_A132BarCodReo ;
   private String[] P02K22_A130BarCodPar ;
   private String[] P02K22_A758ProCod ;
   private short[] P02K22_A194BarOrdLin ;
   private short[] P02K22_A5372FasQuiUl ;
   private boolean[] P02K22_n5372FasQuiUl ;
   private String[] P02K23_A396EmprCod ;
   private int[] P02K23_A129BarCod ;
   private byte[] P02K23_A132BarCodReo ;
   private String[] P02K23_A130BarCodPar ;
   private String[] P02K23_A758ProCod ;
   private short[] P02K23_A194BarOrdLin ;
   private short[] P02K23_A5371FasQuiLin ;
}

final  class phdfpq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02K22", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiUl FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02K23", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02K24", "UPDATE TXPBARFAS SET FasQuiUl=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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

