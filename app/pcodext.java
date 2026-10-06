package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcodext extends GXProcedure
{
   public pcodext( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcodext.class ), "" );
   }

   public pcodext( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pcodext.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pcodext.this.AV9EmprCod = aP0[0];
      this.aP0 = aP0;
      pcodext.this.AV11BarCod = aP1[0];
      this.aP1 = aP1;
      pcodext.this.AV10BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcodext.this.AV12BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcodext.this.AV8CodCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8CodCod = "" ;
      /* Using cursor P00UL2 */
      pr_default.execute(0, new Object[] {AV9EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV10BarCodReo), AV12BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A132BarCodReo = P00UL2_A132BarCodReo[0] ;
         A130BarCodPar = P00UL2_A130BarCodPar[0] ;
         A129BarCod = P00UL2_A129BarCod[0] ;
         A396EmprCod = P00UL2_A396EmprCod[0] ;
         A252CliCod = P00UL2_A252CliCod[0] ;
         n252CliCod = P00UL2_n252CliCod[0] ;
         A212BarSer = P00UL2_A212BarSer[0] ;
         A135BarColNom = P00UL2_A135BarColNom[0] ;
         A136BarColNum = P00UL2_A136BarColNum[0] ;
         A218BarTipCol = P00UL2_A218BarTipCol[0] ;
         AV13CliCod = A252CliCod ;
         AV14BarSer = A212BarSer ;
         AV15BarColNom = A135BarColNom ;
         AV16BarColNum = A136BarColNum ;
         AV17TipColCod = A218BarTipCol ;
         /* Execute user subroutine: 'LOCFOR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'LOCFOR' Routine */
      returnInSub = false ;
      /* Using cursor P00UL3 */
      pr_default.execute(1, new Object[] {AV9EmprCod, Integer.valueOf(AV13CliCod), AV14BarSer, AV15BarColNom, Integer.valueOf(AV16BarColNum), Byte.valueOf(AV17TipColCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A831TipColCod = P00UL3_A831TipColCod[0] ;
         A483ForColNum = P00UL3_A483ForColNum[0] ;
         A482ForColNom = P00UL3_A482ForColNom[0] ;
         A494ForSer = P00UL3_A494ForSer[0] ;
         A252CliCod = P00UL3_A252CliCod[0] ;
         n252CliCod = P00UL3_n252CliCod[0] ;
         A396EmprCod = P00UL3_A396EmprCod[0] ;
         A583IntCod = P00UL3_A583IntCod[0] ;
         AV18IntCod = A583IntCod ;
         /* Execute user subroutine: 'PRETIN' */
         S123 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S123( )
   {
      /* 'PRETIN' Routine */
      returnInSub = false ;
      /* Using cursor P00UL4 */
      pr_default.execute(2, new Object[] {AV9EmprCod, Integer.valueOf(AV13CliCod), AV14BarSer, Byte.valueOf(AV17TipColCod), Byte.valueOf(AV18IntCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A583IntCod = P00UL4_A583IntCod[0] ;
         A831TipColCod = P00UL4_A831TipColCod[0] ;
         A65ArtCod = P00UL4_A65ArtCod[0] ;
         A252CliCod = P00UL4_A252CliCod[0] ;
         n252CliCod = P00UL4_n252CliCod[0] ;
         A396EmprCod = P00UL4_A396EmprCod[0] ;
         A3616PreFacCod = P00UL4_A3616PreFacCod[0] ;
         n3616PreFacCod = P00UL4_n3616PreFacCod[0] ;
         AV8CodCod = A3616PreFacCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcodext.this.AV9EmprCod;
      this.aP1[0] = pcodext.this.AV11BarCod;
      this.aP2[0] = pcodext.this.AV10BarCodReo;
      this.aP3[0] = pcodext.this.AV12BarCodPar;
      this.aP4[0] = pcodext.this.AV8CodCod;
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
      P00UL2_A132BarCodReo = new byte[1] ;
      P00UL2_A130BarCodPar = new String[] {""} ;
      P00UL2_A129BarCod = new int[1] ;
      P00UL2_A396EmprCod = new String[] {""} ;
      P00UL2_A252CliCod = new int[1] ;
      P00UL2_n252CliCod = new boolean[] {false} ;
      P00UL2_A212BarSer = new String[] {""} ;
      P00UL2_A135BarColNom = new String[] {""} ;
      P00UL2_A136BarColNum = new int[1] ;
      P00UL2_A218BarTipCol = new byte[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      AV14BarSer = "" ;
      AV15BarColNom = "" ;
      P00UL3_A831TipColCod = new byte[1] ;
      P00UL3_A483ForColNum = new int[1] ;
      P00UL3_A482ForColNom = new String[] {""} ;
      P00UL3_A494ForSer = new String[] {""} ;
      P00UL3_A252CliCod = new int[1] ;
      P00UL3_n252CliCod = new boolean[] {false} ;
      P00UL3_A396EmprCod = new String[] {""} ;
      P00UL3_A583IntCod = new byte[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      P00UL4_A583IntCod = new byte[1] ;
      P00UL4_A831TipColCod = new byte[1] ;
      P00UL4_A65ArtCod = new String[] {""} ;
      P00UL4_A252CliCod = new int[1] ;
      P00UL4_n252CliCod = new boolean[] {false} ;
      P00UL4_A396EmprCod = new String[] {""} ;
      P00UL4_A3616PreFacCod = new String[] {""} ;
      P00UL4_n3616PreFacCod = new boolean[] {false} ;
      A65ArtCod = "" ;
      A3616PreFacCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcodext__default(),
         new Object[] {
             new Object[] {
            P00UL2_A132BarCodReo, P00UL2_A130BarCodPar, P00UL2_A129BarCod, P00UL2_A396EmprCod, P00UL2_A252CliCod, P00UL2_n252CliCod, P00UL2_A212BarSer, P00UL2_A135BarColNom, P00UL2_A136BarColNum, P00UL2_A218BarTipCol
            }
            , new Object[] {
            P00UL3_A831TipColCod, P00UL3_A483ForColNum, P00UL3_A482ForColNom, P00UL3_A494ForSer, P00UL3_A252CliCod, P00UL3_A396EmprCod, P00UL3_A583IntCod
            }
            , new Object[] {
            P00UL4_A583IntCod, P00UL4_A831TipColCod, P00UL4_A65ArtCod, P00UL4_A252CliCod, P00UL4_A396EmprCod, P00UL4_A3616PreFacCod, P00UL4_n3616PreFacCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10BarCodReo ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV17TipColCod ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV18IntCod ;
   private short Gx_err ;
   private int AV11BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV13CliCod ;
   private int AV16BarColNum ;
   private int A483ForColNum ;
   private String AV9EmprCod ;
   private String AV12BarCodPar ;
   private String AV8CodCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV14BarSer ;
   private String AV15BarColNom ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A65ArtCod ;
   private String A3616PreFacCod ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n3616PreFacCod ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private byte[] P00UL2_A132BarCodReo ;
   private String[] P00UL2_A130BarCodPar ;
   private int[] P00UL2_A129BarCod ;
   private String[] P00UL2_A396EmprCod ;
   private int[] P00UL2_A252CliCod ;
   private boolean[] P00UL2_n252CliCod ;
   private String[] P00UL2_A212BarSer ;
   private String[] P00UL2_A135BarColNom ;
   private int[] P00UL2_A136BarColNum ;
   private byte[] P00UL2_A218BarTipCol ;
   private byte[] P00UL3_A831TipColCod ;
   private int[] P00UL3_A483ForColNum ;
   private String[] P00UL3_A482ForColNom ;
   private String[] P00UL3_A494ForSer ;
   private int[] P00UL3_A252CliCod ;
   private boolean[] P00UL3_n252CliCod ;
   private String[] P00UL3_A396EmprCod ;
   private byte[] P00UL3_A583IntCod ;
   private byte[] P00UL4_A583IntCod ;
   private byte[] P00UL4_A831TipColCod ;
   private String[] P00UL4_A65ArtCod ;
   private int[] P00UL4_A252CliCod ;
   private boolean[] P00UL4_n252CliCod ;
   private String[] P00UL4_A396EmprCod ;
   private String[] P00UL4_A3616PreFacCod ;
   private boolean[] P00UL4_n3616PreFacCod ;
}

final  class pcodext__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00UL2", "SELECT BarCodReo, BarCodPar, BarCod, EmprCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00UL3", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, IntCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00UL4", "SELECT IntCod, TipColCod, ArtCod, CliCod, EmprCod, PreFacCod FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

