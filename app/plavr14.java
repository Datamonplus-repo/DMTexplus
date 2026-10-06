package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plavr14 extends GXProcedure
{
   public plavr14( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plavr14.class ), "" );
   }

   public plavr14( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      plavr14.this.aP3 = new String[] {""};
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
      plavr14.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plavr14.this.A5059Hl_hdr = aP1[0];
      this.aP1 = aP1;
      plavr14.this.A5060Hl_hdrr = aP2[0];
      this.aP2 = aP2;
      plavr14.this.A5061Hl_hdrp = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02AK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5059Hl_hdr), Byte.valueOf(A5060Hl_hdrr), A5061Hl_hdrp});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5064Hl_causa = P02AK2_A5064Hl_causa[0] ;
         n5064Hl_causa = P02AK2_n5064Hl_causa[0] ;
         /* Optimized DELETE. */
         /* Using cursor P02AK3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5059Hl_hdr), Byte.valueOf(A5060Hl_hdrr), A5061Hl_hdrp});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHLREO1");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P02AK4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5059Hl_hdr), Byte.valueOf(A5060Hl_hdrr), A5061Hl_hdrp});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHLREO2");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P02AK5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5059Hl_hdr), Byte.valueOf(A5060Hl_hdrr), A5061Hl_hdrp});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHLREO3");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P02AK6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5059Hl_hdr), Byte.valueOf(A5060Hl_hdrr), A5061Hl_hdrp});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHLRPRP");
         /* End optimized DELETE. */
         /* Using cursor P02AK7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5059Hl_hdr), Byte.valueOf(A5060Hl_hdrr), A5061Hl_hdrp});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHLREOP");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plavr14.this.A396EmprCod;
      this.aP1[0] = plavr14.this.A5059Hl_hdr;
      this.aP2[0] = plavr14.this.A5060Hl_hdrr;
      this.aP3[0] = plavr14.this.A5061Hl_hdrp;
      Application.commitDataStores(context, remoteHandle, pr_default, "plavr14");
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
      P02AK2_A5064Hl_causa = new String[] {""} ;
      P02AK2_n5064Hl_causa = new boolean[] {false} ;
      P02AK2_A396EmprCod = new String[] {""} ;
      P02AK2_A5059Hl_hdr = new int[1] ;
      P02AK2_A5060Hl_hdrr = new byte[1] ;
      P02AK2_A5061Hl_hdrp = new String[] {""} ;
      A5064Hl_causa = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plavr14__default(),
         new Object[] {
             new Object[] {
            P02AK2_A5064Hl_causa, P02AK2_n5064Hl_causa, P02AK2_A396EmprCod, P02AK2_A5059Hl_hdr, P02AK2_A5060Hl_hdrr, P02AK2_A5061Hl_hdrp
            }
            , new Object[] {
            }
            , new Object[] {
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

   private byte A5060Hl_hdrr ;
   private short Gx_err ;
   private int A5059Hl_hdr ;
   private String A396EmprCod ;
   private String A5061Hl_hdrp ;
   private String scmdbuf ;
   private boolean n5064Hl_causa ;
   private String A5064Hl_causa ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02AK2_A5064Hl_causa ;
   private boolean[] P02AK2_n5064Hl_causa ;
   private String[] P02AK2_A396EmprCod ;
   private int[] P02AK2_A5059Hl_hdr ;
   private byte[] P02AK2_A5060Hl_hdrr ;
   private String[] P02AK2_A5061Hl_hdrp ;
}

final  class plavr14__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02AK2", "SELECT Hl_causa, EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp FROM TXPHLREOP WHERE EmprCod = ? and Hl_hdr = ? and Hl_hdrr = ? and Hl_hdrp = ? ORDER BY EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02AK3", "DELETE FROM TXPHLREO1  WHERE EmprCod = ? and Hl_hdr = ? and Hl_hdrr = ? and Hl_hdrp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHLREO1")
         ,new UpdateCursor("P02AK4", "DELETE FROM TXPHLREO2  WHERE EmprCod = ? and Hl_hdr = ? and Hl_hdrr = ? and Hl_hdrp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHLREO2")
         ,new UpdateCursor("P02AK5", "DELETE FROM TXPHLREO3  WHERE EmprCod = ? and Hl_hdr = ? and Hl_hdrr = ? and Hl_hdrp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHLREO3")
         ,new UpdateCursor("P02AK6", "DELETE FROM TXPHLRPRP  WHERE EmprCod = ? and Hl_hdr = ? and Hl_hdrr = ? and Hl_hdrp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHLRPRP")
         ,new UpdateCursor("P02AK7", "DELETE FROM TXPHLREOP  WHERE EmprCod = ? AND Hl_hdr = ? AND Hl_hdrr = ? AND Hl_hdrp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHLREOP")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

