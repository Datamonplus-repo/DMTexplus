package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class peliest2 extends GXProcedure
{
   public peliest2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( peliest2.class ), "" );
   }

   public peliest2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      peliest2.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      peliest2.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      peliest2.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      peliest2.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      peliest2.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      peliest2.this.AV22estagrcod = aP4[0];
      this.aP4 = aP4;
      peliest2.this.AV23estagrreo = aP5[0];
      this.aP5 = aP5;
      peliest2.this.AV24estagrpar = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04RJ2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV22estagrcod), Byte.valueOf(AV23estagrreo), AV24estagrpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P04RJ2_A130BarCodPar[0] ;
         A132BarCodReo = P04RJ2_A132BarCodReo[0] ;
         A129BarCod = P04RJ2_A129BarCod[0] ;
         A396EmprCod = P04RJ2_A396EmprCod[0] ;
         A120BarAgrEst = P04RJ2_A120BarAgrEst[0] ;
         A120BarAgrEst = httpContext.getMessage( "N", "") ;
         /* Using cursor P04RJ3 */
         pr_default.execute(1, new Object[] {A120BarAgrEst, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Optimized DELETE. */
      /* Using cursor P04RJ4 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV22estagrcod), Byte.valueOf(AV23estagrreo), AV24estagrpar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPestagr");
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P04RJ5 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV22estagrcod), Byte.valueOf(AV23estagrreo), AV24estagrpar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPestagr");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = peliest2.this.AV15EmprCod;
      this.aP1[0] = peliest2.this.AV16BarCod;
      this.aP2[0] = peliest2.this.AV17BarCodReo;
      this.aP3[0] = peliest2.this.AV18BarCodPar;
      this.aP4[0] = peliest2.this.AV22estagrcod;
      this.aP5[0] = peliest2.this.AV23estagrreo;
      this.aP6[0] = peliest2.this.AV24estagrpar;
      Application.commitDataStores(context, remoteHandle, pr_default, "peliest2");
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
      P04RJ2_A130BarCodPar = new String[] {""} ;
      P04RJ2_A132BarCodReo = new byte[1] ;
      P04RJ2_A129BarCod = new int[1] ;
      P04RJ2_A396EmprCod = new String[] {""} ;
      P04RJ2_A120BarAgrEst = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A120BarAgrEst = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.peliest2__default(),
         new Object[] {
             new Object[] {
            P04RJ2_A130BarCodPar, P04RJ2_A132BarCodReo, P04RJ2_A129BarCod, P04RJ2_A396EmprCod, P04RJ2_A120BarAgrEst
            }
            , new Object[] {
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
   private byte AV23estagrreo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int AV22estagrcod ;
   private int A129BarCod ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV24estagrpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A120BarAgrEst ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P04RJ2_A130BarCodPar ;
   private byte[] P04RJ2_A132BarCodReo ;
   private int[] P04RJ2_A129BarCod ;
   private String[] P04RJ2_A396EmprCod ;
   private String[] P04RJ2_A120BarAgrEst ;
}

final  class peliest2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04RJ2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04RJ3", "UPDATE TXPBARCAD SET BarAgrEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P04RJ4", "DELETE FROM TXPestagr  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPestagr")
         ,new UpdateCursor("P04RJ5", "DELETE FROM TXPestagr  WHERE (EmprCod = ?) AND (estagrcod = ?) AND (estagrreo = ?) AND (estagrpar = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPestagr")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               return;
      }
   }

}

