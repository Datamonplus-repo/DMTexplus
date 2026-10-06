package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdibgra extends GXProcedure
{
   public pdibgra( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdibgra.class ), "" );
   }

   public pdibgra( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 )
   {
      pdibgra.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pdibgra.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdibgra.this.AV8DibCli = aP1[0];
      this.aP1 = aP1;
      pdibgra.this.AV9DibInt = aP2[0];
      this.aP2 = aP2;
      pdibgra.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13GXLvl1 = (byte)(0) ;
      /* Using cursor P02YE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8DibCli, Integer.valueOf(AV9DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7042ShaDibInt = P02YE2_A7042ShaDibInt[0] ;
         A7041ShaDibCli = P02YE2_A7041ShaDibCli[0] ;
         A7031ShaCod = P02YE2_A7031ShaCod[0] ;
         AV13GXLvl1 = (byte)(1) ;
         AV10Grabada = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV13GXLvl1 == 0 )
      {
         AV14GXLvl7 = (byte)(0) ;
         /* Using cursor P02YE3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV8DibCli, Integer.valueOf(AV9DibInt)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A129BarCod = P02YE3_A129BarCod[0] ;
            n129BarCod = P02YE3_n129BarCod[0] ;
            A132BarCodReo = P02YE3_A132BarCodReo[0] ;
            n132BarCodReo = P02YE3_n132BarCodReo[0] ;
            A130BarCodPar = P02YE3_A130BarCodPar[0] ;
            n130BarCodPar = P02YE3_n130BarCodPar[0] ;
            A1799BarDibInt = P02YE3_A1799BarDibInt[0] ;
            A1798BarDibCli = P02YE3_A1798BarDibCli[0] ;
            A7050OGSEst = P02YE3_A7050OGSEst[0] ;
            n7050OGSEst = P02YE3_n7050OGSEst[0] ;
            A7049OGSCod = P02YE3_A7049OGSCod[0] ;
            A1799BarDibInt = P02YE3_A1799BarDibInt[0] ;
            A1798BarDibCli = P02YE3_A1798BarDibCli[0] ;
            if ( GXutil.strcmp(A7050OGSEst, httpContext.getMessage( "N", "")) == 0 )
            {
               AV14GXLvl7 = (byte)(1) ;
               AV10Grabada = (byte)(2) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV14GXLvl7 == 0 )
         {
            AV10Grabada = (byte)(0) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdibgra.this.A396EmprCod;
      this.aP1[0] = pdibgra.this.AV8DibCli;
      this.aP2[0] = pdibgra.this.AV9DibInt;
      this.aP3[0] = pdibgra.this.AV10Grabada;
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
      P02YE2_A396EmprCod = new String[] {""} ;
      P02YE2_A7042ShaDibInt = new int[1] ;
      P02YE2_A7041ShaDibCli = new String[] {""} ;
      P02YE2_A7031ShaCod = new String[] {""} ;
      A7041ShaDibCli = "" ;
      A7031ShaCod = "" ;
      P02YE3_A129BarCod = new int[1] ;
      P02YE3_n129BarCod = new boolean[] {false} ;
      P02YE3_A132BarCodReo = new byte[1] ;
      P02YE3_n132BarCodReo = new boolean[] {false} ;
      P02YE3_A130BarCodPar = new String[] {""} ;
      P02YE3_n130BarCodPar = new boolean[] {false} ;
      P02YE3_A396EmprCod = new String[] {""} ;
      P02YE3_A1799BarDibInt = new int[1] ;
      P02YE3_A1798BarDibCli = new String[] {""} ;
      P02YE3_A7050OGSEst = new String[] {""} ;
      P02YE3_n7050OGSEst = new boolean[] {false} ;
      P02YE3_A7049OGSCod = new int[1] ;
      A130BarCodPar = "" ;
      A1798BarDibCli = "" ;
      A7050OGSEst = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdibgra__default(),
         new Object[] {
             new Object[] {
            P02YE2_A396EmprCod, P02YE2_A7042ShaDibInt, P02YE2_A7041ShaDibCli, P02YE2_A7031ShaCod
            }
            , new Object[] {
            P02YE3_A129BarCod, P02YE3_n129BarCod, P02YE3_A132BarCodReo, P02YE3_n132BarCodReo, P02YE3_A130BarCodPar, P02YE3_n130BarCodPar, P02YE3_A396EmprCod, P02YE3_A1799BarDibInt, P02YE3_A1798BarDibCli, P02YE3_A7050OGSEst,
            P02YE3_n7050OGSEst, P02YE3_A7049OGSCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Grabada ;
   private byte AV13GXLvl1 ;
   private byte AV14GXLvl7 ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV9DibInt ;
   private int A7042ShaDibInt ;
   private int A129BarCod ;
   private int A1799BarDibInt ;
   private int A7049OGSCod ;
   private String A396EmprCod ;
   private String AV8DibCli ;
   private String scmdbuf ;
   private String A7041ShaDibCli ;
   private String A7031ShaCod ;
   private String A130BarCodPar ;
   private String A1798BarDibCli ;
   private String A7050OGSEst ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n7050OGSEst ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02YE2_A396EmprCod ;
   private int[] P02YE2_A7042ShaDibInt ;
   private String[] P02YE2_A7041ShaDibCli ;
   private String[] P02YE2_A7031ShaCod ;
   private int[] P02YE3_A129BarCod ;
   private boolean[] P02YE3_n129BarCod ;
   private byte[] P02YE3_A132BarCodReo ;
   private boolean[] P02YE3_n132BarCodReo ;
   private String[] P02YE3_A130BarCodPar ;
   private boolean[] P02YE3_n130BarCodPar ;
   private String[] P02YE3_A396EmprCod ;
   private int[] P02YE3_A1799BarDibInt ;
   private String[] P02YE3_A1798BarDibCli ;
   private String[] P02YE3_A7050OGSEst ;
   private boolean[] P02YE3_n7050OGSEst ;
   private int[] P02YE3_A7049OGSCod ;
}

final  class pdibgra__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02YE2", "SELECT * FROM (SELECT EmprCod, ShaDibInt, ShaDibCli, ShaCod FROM TXPShablo WHERE (EmprCod = ?) AND (ShaDibCli = ?) AND (ShaDibInt = ?) ORDER BY EmprCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02YE3", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T2.BarDibInt, T2.BarDibCli, T1.OGSEst, T1.OGSCod FROM (TXPShaGra T1 LEFT JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T2.BarDibCli = ?) AND (T2.BarDibInt = ?) ORDER BY T1.EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 16);
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

