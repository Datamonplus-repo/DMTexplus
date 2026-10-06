package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbumma2 extends GXProcedure
{
   public pbumma2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbumma2.class ), "" );
   }

   public pbumma2( int remoteHandle ,
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
      pbumma2.this.aP5 = new String[] {""};
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
      pbumma2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbumma2.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      pbumma2.this.AV16BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbumma2.this.AV17BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbumma2.this.AV9MacProCod = aP4[0];
      this.aP4 = aP4;
      pbumma2.this.AV8BusMod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01J92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01J92_A130BarCodPar[0] ;
         A132BarCodReo = P01J92_A132BarCodReo[0] ;
         A129BarCod = P01J92_A129BarCod[0] ;
         A252CliCod = P01J92_A252CliCod[0] ;
         n252CliCod = P01J92_n252CliCod[0] ;
         A212BarSer = P01J92_A212BarSer[0] ;
         A135BarColNom = P01J92_A135BarColNom[0] ;
         A136BarColNum = P01J92_A136BarColNum[0] ;
         A218BarTipCol = P01J92_A218BarTipCol[0] ;
         AV10CliCod = A252CliCod ;
         AV11ForSer = A212BarSer ;
         AV12ForColNom = A135BarColNom ;
         AV13ForColNum = A136BarColNum ;
         AV14TipColCod = A218BarTipCol ;
         /* Execute user subroutine: 'MACROPROC' */
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
      /* 'MACROPROC' Routine */
      returnInSub = false ;
      n1514MacProCod = false ;
      /* Optimized UPDATE. */
      /* Using cursor P01J93 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n1514MacProCod), AV9MacProCod, A396EmprCod, Integer.valueOf(AV10CliCod), AV11ForSer, AV12ForColNom, Integer.valueOf(AV13ForColNum), Byte.valueOf(AV14TipColCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbumma2.this.A396EmprCod;
      this.aP1[0] = pbumma2.this.AV15BarCod;
      this.aP2[0] = pbumma2.this.AV16BarCodReo;
      this.aP3[0] = pbumma2.this.AV17BarCodPar;
      this.aP4[0] = pbumma2.this.AV9MacProCod;
      this.aP5[0] = pbumma2.this.AV8BusMod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbumma2");
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
      P01J92_A396EmprCod = new String[] {""} ;
      P01J92_A130BarCodPar = new String[] {""} ;
      P01J92_A132BarCodReo = new byte[1] ;
      P01J92_A129BarCod = new int[1] ;
      P01J92_A252CliCod = new int[1] ;
      P01J92_n252CliCod = new boolean[] {false} ;
      P01J92_A212BarSer = new String[] {""} ;
      P01J92_A135BarColNom = new String[] {""} ;
      P01J92_A136BarColNum = new int[1] ;
      P01J92_A218BarTipCol = new byte[1] ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      AV11ForSer = "" ;
      AV12ForColNom = "" ;
      A1514MacProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbumma2__default(),
         new Object[] {
             new Object[] {
            P01J92_A396EmprCod, P01J92_A130BarCodPar, P01J92_A132BarCodReo, P01J92_A129BarCod, P01J92_A252CliCod, P01J92_n252CliCod, P01J92_A212BarSer, P01J92_A135BarColNom, P01J92_A136BarColNum, P01J92_A218BarTipCol
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV14TipColCod ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV10CliCod ;
   private int AV13ForColNum ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private String AV9MacProCod ;
   private String AV8BusMod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV11ForSer ;
   private String AV12ForColNom ;
   private String A1514MacProCod ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n1514MacProCod ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01J92_A396EmprCod ;
   private String[] P01J92_A130BarCodPar ;
   private byte[] P01J92_A132BarCodReo ;
   private int[] P01J92_A129BarCod ;
   private int[] P01J92_A252CliCod ;
   private boolean[] P01J92_n252CliCod ;
   private String[] P01J92_A212BarSer ;
   private String[] P01J92_A135BarColNom ;
   private int[] P01J92_A136BarColNum ;
   private byte[] P01J92_A218BarTipCol ;
}

final  class pbumma2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01J92", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01J93", "UPDATE TXPCFORMU SET MacProCod=?  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

