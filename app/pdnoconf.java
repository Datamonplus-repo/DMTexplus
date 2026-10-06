package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdnoconf extends GXProcedure
{
   public pdnoconf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdnoconf.class ), "" );
   }

   public pdnoconf( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pdnoconf.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pdnoconf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdnoconf.this.A13137NCHdr = aP1[0];
      this.aP1 = aP1;
      pdnoconf.this.A13138NCHdrr = aP2[0];
      this.aP2 = aP2;
      pdnoconf.this.A13139NCHdrp = aP3[0];
      this.aP3 = aP3;
      pdnoconf.this.AV10Usurcod = aP4[0];
      this.aP4 = aP4;
      pdnoconf.this.AV9station = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05RP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13137NCHdr), Byte.valueOf(A13138NCHdrr), A13139NCHdrp});
      while ( (pr_default.getStatus(0) != 101) )
      {
         /* Using cursor P05RP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13137NCHdr), Byte.valueOf(A13138NCHdrr), A13139NCHdrp});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOCONF");
         AV8Inc_obs = httpContext.getMessage( "Eliminacion No Conformidad, otras", "") ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV14Pgmname, AV10Usurcod, AV9station, AV8Inc_obs, A13137NCHdr, A13138NCHdrr, A13139NCHdrp) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdnoconf.this.A396EmprCod;
      this.aP1[0] = pdnoconf.this.A13137NCHdr;
      this.aP2[0] = pdnoconf.this.A13138NCHdrr;
      this.aP3[0] = pdnoconf.this.A13139NCHdrp;
      this.aP4[0] = pdnoconf.this.AV10Usurcod;
      this.aP5[0] = pdnoconf.this.AV9station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdnoconf");
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
      P05RP2_A396EmprCod = new String[] {""} ;
      P05RP2_A13137NCHdr = new int[1] ;
      P05RP2_A13138NCHdrr = new byte[1] ;
      P05RP2_A13139NCHdrp = new String[] {""} ;
      AV8Inc_obs = "" ;
      AV14Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdnoconf__default(),
         new Object[] {
             new Object[] {
            P05RP2_A396EmprCod, P05RP2_A13137NCHdr, P05RP2_A13138NCHdrr, P05RP2_A13139NCHdrp
            }
            , new Object[] {
            }
         }
      );
      AV14Pgmname = "PdNOCONF" ;
      /* GeneXus formulas. */
      AV14Pgmname = "PdNOCONF" ;
      Gx_err = (short)(0) ;
   }

   private byte A13138NCHdrr ;
   private short Gx_err ;
   private int A13137NCHdr ;
   private String A396EmprCod ;
   private String A13139NCHdrp ;
   private String AV10Usurcod ;
   private String AV9station ;
   private String scmdbuf ;
   private String AV14Pgmname ;
   private String AV8Inc_obs ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05RP2_A396EmprCod ;
   private int[] P05RP2_A13137NCHdr ;
   private byte[] P05RP2_A13138NCHdrr ;
   private String[] P05RP2_A13139NCHdrp ;
}

final  class pdnoconf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05RP2", "SELECT EmprCod, NCHdr, NCHdrr, NCHdrp FROM TXPNOCONF WHERE EmprCod = ? and NCHdr = ? and NCHdrr = ? and NCHdrp = ? ORDER BY EmprCod, NCHdr, NCHdrr, NCHdrp ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05RP3", "DELETE FROM TXPNOCONF  WHERE EmprCod = ? AND NCHdr = ? AND NCHdrr = ? AND NCHdrp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPNOCONF")
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
      }
   }

}

