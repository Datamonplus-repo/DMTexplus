package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmoddie extends GXProcedure
{
   public pmoddie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmoddie.class ), "" );
   }

   public pmoddie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pmoddie.this.aP3 = new String[] {""};
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
      pmoddie.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmoddie.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pmoddie.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmoddie.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV38Ok = httpContext.getMessage( "N", "") ;
      /* Using cursor P019S2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P019S2_A130BarCodPar[0] ;
         A132BarCodReo = P019S2_A132BarCodReo[0] ;
         A129BarCod = P019S2_A129BarCod[0] ;
         A361DisCod = P019S2_A361DisCod[0] ;
         A212BarSer = P019S2_A212BarSer[0] ;
         A1652BarSerDsc = P019S2_A1652BarSerDsc[0] ;
         A217BarTipArt = P019S2_A217BarTipArt[0] ;
         n217BarTipArt = P019S2_n217BarTipArt[0] ;
         A143BarDisNum = P019S2_A143BarDisNum[0] ;
         A1799BarDibInt = P019S2_A1799BarDibInt[0] ;
         A1798BarDibCli = P019S2_A1798BarDibCli[0] ;
         AV27DisCod = A361DisCod ;
         AV32BarSer = A212BarSer ;
         AV40BarSerDsc = A1652BarSerDsc ;
         AV33BarTipArt = A217BarTipArt ;
         AV39BarDisNum = A143BarDisNum ;
         AV45BarDibInt = A1799BarDibInt ;
         AV46BarDibCli = A1798BarDibCli ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      n1014DibInt = false ;
      n1013DibCli = false ;
      /* Optimized UPDATE. */
      /* Using cursor P019S3 */
      pr_default.execute(1, new Object[] {AV39BarDisNum, Short.valueOf(AV33BarTipArt), Boolean.valueOf(n1014DibInt), Integer.valueOf(AV45BarDibInt), Boolean.valueOf(n1013DibCli), AV46BarDibCli, AV40BarSerDsc, AV32BarSer, A396EmprCod, Integer.valueOf(AV27DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmoddie.this.A396EmprCod;
      this.aP1[0] = pmoddie.this.AV16BarCod;
      this.aP2[0] = pmoddie.this.AV17BarCodReo;
      this.aP3[0] = pmoddie.this.AV18BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmoddie");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV38Ok = "" ;
      scmdbuf = "" ;
      P019S2_A396EmprCod = new String[] {""} ;
      P019S2_A130BarCodPar = new String[] {""} ;
      P019S2_A132BarCodReo = new byte[1] ;
      P019S2_A129BarCod = new int[1] ;
      P019S2_A361DisCod = new int[1] ;
      P019S2_A212BarSer = new String[] {""} ;
      P019S2_A1652BarSerDsc = new String[] {""} ;
      P019S2_A217BarTipArt = new short[1] ;
      P019S2_n217BarTipArt = new boolean[] {false} ;
      P019S2_A143BarDisNum = new String[] {""} ;
      P019S2_A1799BarDibInt = new int[1] ;
      P019S2_A1798BarDibCli = new String[] {""} ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A143BarDisNum = "" ;
      A1798BarDibCli = "" ;
      AV32BarSer = "" ;
      AV40BarSerDsc = "" ;
      AV39BarDisNum = "" ;
      AV46BarDibCli = "" ;
      A360DisCliNum = "" ;
      A1013DibCli = "" ;
      A337DisArtDsc = "" ;
      A335DisArtCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmoddie__default(),
         new Object[] {
             new Object[] {
            P019S2_A396EmprCod, P019S2_A130BarCodPar, P019S2_A132BarCodReo, P019S2_A129BarCod, P019S2_A361DisCod, P019S2_A212BarSer, P019S2_A1652BarSerDsc, P019S2_A217BarTipArt, P019S2_n217BarTipArt, P019S2_A143BarDisNum,
            P019S2_A1799BarDibInt, P019S2_A1798BarDibCli
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
   private short A217BarTipArt ;
   private short AV33BarTipArt ;
   private short A352DisArtTip ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A1799BarDibInt ;
   private int AV27DisCod ;
   private int AV45BarDibInt ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String AV18BarCodPar ;
   private String AV38Ok ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A143BarDisNum ;
   private String A1798BarDibCli ;
   private String AV32BarSer ;
   private String AV40BarSerDsc ;
   private String AV39BarDisNum ;
   private String AV46BarDibCli ;
   private String A360DisCliNum ;
   private String A1013DibCli ;
   private String A337DisArtDsc ;
   private String A335DisArtCod ;
   private boolean n217BarTipArt ;
   private boolean n1014DibInt ;
   private boolean n1013DibCli ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P019S2_A396EmprCod ;
   private String[] P019S2_A130BarCodPar ;
   private byte[] P019S2_A132BarCodReo ;
   private int[] P019S2_A129BarCod ;
   private int[] P019S2_A361DisCod ;
   private String[] P019S2_A212BarSer ;
   private String[] P019S2_A1652BarSerDsc ;
   private short[] P019S2_A217BarTipArt ;
   private boolean[] P019S2_n217BarTipArt ;
   private String[] P019S2_A143BarDisNum ;
   private int[] P019S2_A1799BarDibInt ;
   private String[] P019S2_A1798BarDibCli ;
}

final  class pmoddie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P019S2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, DisCod, BarSer, BarSerDsc, BarTipArt, BarDisNum, BarDibInt, BarDibCli FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P019S3", "UPDATE TXPDISPOS SET DisCliNum=?, DisArtTip=?, DibInt=?, DibCli=?, DisArtDsc=?, DisArtCod=?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
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
               stmt.setString(1, (String)parms[0], 8);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 16);
               }
               stmt.setString(5, (String)parms[6], 26);
               stmt.setString(6, (String)parms[7], 16);
               stmt.setString(7, (String)parms[8], 3);
               stmt.setInt(8, ((Number) parms[9]).intValue());
               return;
      }
   }

}

