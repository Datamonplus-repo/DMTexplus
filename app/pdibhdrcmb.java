package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdibhdrcmb extends GXProcedure
{
   public pdibhdrcmb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdibhdrcmb.class ), "" );
   }

   public pdibhdrcmb( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 )
   {
      pdibhdrcmb.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 )
   {
      pdibhdrcmb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdibhdrcmb.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pdibhdrcmb.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdibhdrcmb.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdibhdrcmb.this.AV8DibCli = aP4[0];
      this.aP4 = aP4;
      pdibhdrcmb.this.AV9DibInt = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02SM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P02SM2_A361DisCod[0] ;
         A1798BarDibCli = P02SM2_A1798BarDibCli[0] ;
         A1799BarDibInt = P02SM2_A1799BarDibInt[0] ;
         /* Using cursor P02SM3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A1013DibCli = P02SM3_A1013DibCli[0] ;
         n1013DibCli = P02SM3_n1013DibCli[0] ;
         A1014DibInt = P02SM3_A1014DibInt[0] ;
         n1014DibInt = P02SM3_n1014DibInt[0] ;
         A1798BarDibCli = AV8DibCli ;
         A1799BarDibInt = AV9DibInt ;
         A1013DibCli = AV8DibCli ;
         n1013DibCli = false ;
         A1014DibInt = AV9DibInt ;
         n1014DibInt = false ;
         /* Using cursor P02SM4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Using cursor P02SM5 */
         pr_default.execute(3, new Object[] {A1798BarDibCli, Integer.valueOf(A1799BarDibInt), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdibhdrcmb.this.A396EmprCod;
      this.aP1[0] = pdibhdrcmb.this.A129BarCod;
      this.aP2[0] = pdibhdrcmb.this.A132BarCodReo;
      this.aP3[0] = pdibhdrcmb.this.A130BarCodPar;
      this.aP4[0] = pdibhdrcmb.this.AV8DibCli;
      this.aP5[0] = pdibhdrcmb.this.AV9DibInt;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdibhdrcmb");
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
      P02SM2_A361DisCod = new int[1] ;
      P02SM2_A396EmprCod = new String[] {""} ;
      P02SM2_A129BarCod = new int[1] ;
      P02SM2_A132BarCodReo = new byte[1] ;
      P02SM2_A130BarCodPar = new String[] {""} ;
      P02SM2_A1798BarDibCli = new String[] {""} ;
      P02SM2_A1799BarDibInt = new int[1] ;
      A1798BarDibCli = "" ;
      P02SM3_A1013DibCli = new String[] {""} ;
      P02SM3_n1013DibCli = new boolean[] {false} ;
      P02SM3_A1014DibInt = new int[1] ;
      P02SM3_n1014DibInt = new boolean[] {false} ;
      A1013DibCli = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdibhdrcmb__default(),
         new Object[] {
             new Object[] {
            P02SM2_A361DisCod, P02SM2_A396EmprCod, P02SM2_A129BarCod, P02SM2_A132BarCodReo, P02SM2_A130BarCodPar, P02SM2_A1798BarDibCli, P02SM2_A1799BarDibInt
            }
            , new Object[] {
            P02SM3_A1013DibCli, P02SM3_n1013DibCli, P02SM3_A1014DibInt, P02SM3_n1014DibInt
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

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9DibInt ;
   private int A361DisCod ;
   private int A1799BarDibInt ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8DibCli ;
   private String scmdbuf ;
   private String A1798BarDibCli ;
   private String A1013DibCli ;
   private boolean n1013DibCli ;
   private boolean n1014DibInt ;
   private int[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P02SM2_A361DisCod ;
   private String[] P02SM2_A396EmprCod ;
   private int[] P02SM2_A129BarCod ;
   private byte[] P02SM2_A132BarCodReo ;
   private String[] P02SM2_A130BarCodPar ;
   private String[] P02SM2_A1798BarDibCli ;
   private int[] P02SM2_A1799BarDibInt ;
   private String[] P02SM3_A1013DibCli ;
   private boolean[] P02SM3_n1013DibCli ;
   private int[] P02SM3_A1014DibInt ;
   private boolean[] P02SM3_n1014DibInt ;
}

final  class pdibhdrcmb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02SM2", "SELECT DisCod, EmprCod, BarCod, BarCodReo, BarCodPar, BarDibCli, BarDibInt FROM TXPBARCAD WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02SM3", "SELECT DibCli, DibInt FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02SM4", "UPDATE TXPDISPOS SET DibCli=?, DibInt=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P02SM5", "UPDATE TXPBARCAD SET BarDibCli=?, BarDibInt=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

