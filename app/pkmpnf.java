package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkmpnf extends GXProcedure
{
   public pkmpnf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkmpnf.class ), "" );
   }

   public pkmpnf( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          byte[] aP5 )
   {
      pkmpnf.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 )
   {
      pkmpnf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkmpnf.this.AV25CliCod = aP1[0];
      this.aP1 = aP1;
      pkmpnf.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pkmpnf.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pkmpnf.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pkmpnf.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pkmpnf.this.AV31Discod = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00X12 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV31Discod), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A390DisTipCol = P00X12_A390DisTipCol[0] ;
         n390DisTipCol = P00X12_n390DisTipCol[0] ;
         A361DisCod = P00X12_A361DisCod[0] ;
         A1968DisRes = P00X12_A1968DisRes[0] ;
         n1968DisRes = P00X12_n1968DisRes[0] ;
         A1968DisRes = httpContext.getMessage( "N", "") ;
         n1968DisRes = false ;
         /* Using cursor P00X13 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n1968DisRes), A1968DisRes, A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkmpnf.this.A396EmprCod;
      this.aP1[0] = pkmpnf.this.AV25CliCod;
      this.aP2[0] = pkmpnf.this.A494ForSer;
      this.aP3[0] = pkmpnf.this.A482ForColNom;
      this.aP4[0] = pkmpnf.this.A483ForColNum;
      this.aP5[0] = pkmpnf.this.A831TipColCod;
      this.aP6[0] = pkmpnf.this.AV31Discod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkmpnf");
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
      P00X12_A396EmprCod = new String[] {""} ;
      P00X12_A390DisTipCol = new byte[1] ;
      P00X12_n390DisTipCol = new boolean[] {false} ;
      P00X12_A361DisCod = new int[1] ;
      P00X12_A1968DisRes = new String[] {""} ;
      P00X12_n1968DisRes = new boolean[] {false} ;
      A1968DisRes = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkmpnf__default(),
         new Object[] {
             new Object[] {
            P00X12_A396EmprCod, P00X12_A390DisTipCol, P00X12_n390DisTipCol, P00X12_A361DisCod, P00X12_A1968DisRes, P00X12_n1968DisRes
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte A390DisTipCol ;
   private short Gx_err ;
   private int AV25CliCod ;
   private int A483ForColNum ;
   private int AV31Discod ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String scmdbuf ;
   private String A1968DisRes ;
   private boolean n390DisTipCol ;
   private boolean n1968DisRes ;
   private int[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00X12_A396EmprCod ;
   private byte[] P00X12_A390DisTipCol ;
   private boolean[] P00X12_n390DisTipCol ;
   private int[] P00X12_A361DisCod ;
   private String[] P00X12_A1968DisRes ;
   private boolean[] P00X12_n1968DisRes ;
}

final  class pkmpnf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00X12", "SELECT EmprCod, DisTipCol, DisCod, DisRes FROM TXPDISPOS WHERE (EmprCod = ? and DisCod = ?) AND (DisTipCol = ?) ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00X13", "UPDATE TXPDISPOS SET DisRes=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
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
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

