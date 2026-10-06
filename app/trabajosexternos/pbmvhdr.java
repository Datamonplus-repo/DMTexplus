package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbmvhdr extends GXProcedure
{
   public pbmvhdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbmvhdr.class ), "" );
   }

   public pbmvhdr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 )
   {
      pbmvhdr.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        int[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 )
   {
      pbmvhdr.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbmvhdr.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      pbmvhdr.this.AV17ExHdrFas = aP2[0];
      this.aP2 = aP2;
      pbmvhdr.this.AV18ExHdrTip = aP3[0];
      this.aP3 = aP3;
      pbmvhdr.this.AV19ExHdrAlb = aP4[0];
      this.aP4 = aP4;
      pbmvhdr.this.AV20BarCod = aP5[0];
      this.aP5 = aP5;
      pbmvhdr.this.AV21BarCodReo = aP6[0];
      this.aP6 = aP6;
      pbmvhdr.this.AV22BarCodPar = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P00FA2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV17ExHdrFas, AV18ExHdrTip, Integer.valueOf(AV19ExHdrAlb), Integer.valueOf(AV20BarCod), Byte.valueOf(AV21BarCodReo), AV22BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVH");
      /* End optimized DELETE. */
      /* Using cursor P00FA3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV17ExHdrFas});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2689ExHdrFas = P00FA3_A2689ExHdrFas[0] ;
         A2248ManCod = P00FA3_A2248ManCod[0] ;
         A396EmprCod = P00FA3_A396EmprCod[0] ;
         AV23FlagL = (byte)(0) ;
         /* Using cursor P00FA4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A2692ExHdrLin = P00FA4_A2692ExHdrLin[0] ;
            AV23FlagL = (byte)(1) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( (0==AV23FlagL) )
         {
            /* Using cursor P00FA5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXMVH");
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbmvhdr.this.AV15EmprCod;
      this.aP1[0] = pbmvhdr.this.AV16ManCod;
      this.aP2[0] = pbmvhdr.this.AV17ExHdrFas;
      this.aP3[0] = pbmvhdr.this.AV18ExHdrTip;
      this.aP4[0] = pbmvhdr.this.AV19ExHdrAlb;
      this.aP5[0] = pbmvhdr.this.AV20BarCod;
      this.aP6[0] = pbmvhdr.this.AV21BarCodReo;
      this.aP7[0] = pbmvhdr.this.AV22BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternos.pbmvhdr");
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
      P00FA3_A2689ExHdrFas = new String[] {""} ;
      P00FA3_A2248ManCod = new short[1] ;
      P00FA3_A396EmprCod = new String[] {""} ;
      A2689ExHdrFas = "" ;
      A396EmprCod = "" ;
      P00FA4_A396EmprCod = new String[] {""} ;
      P00FA4_A2248ManCod = new short[1] ;
      P00FA4_A2689ExHdrFas = new String[] {""} ;
      P00FA4_A2692ExHdrLin = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.pbmvhdr__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P00FA3_A2689ExHdrFas, P00FA3_A2248ManCod, P00FA3_A396EmprCod
            }
            , new Object[] {
            P00FA4_A396EmprCod, P00FA4_A2248ManCod, P00FA4_A2689ExHdrFas, P00FA4_A2692ExHdrLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21BarCodReo ;
   private byte AV23FlagL ;
   private short AV16ManCod ;
   private short A2248ManCod ;
   private short Gx_err ;
   private int AV19ExHdrAlb ;
   private int AV20BarCod ;
   private int A2692ExHdrLin ;
   private String AV15EmprCod ;
   private String AV17ExHdrFas ;
   private String AV18ExHdrTip ;
   private String AV22BarCodPar ;
   private String scmdbuf ;
   private String A2689ExHdrFas ;
   private String A396EmprCod ;
   private String[] aP7 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private int[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00FA3_A2689ExHdrFas ;
   private short[] P00FA3_A2248ManCod ;
   private String[] P00FA3_A396EmprCod ;
   private String[] P00FA4_A396EmprCod ;
   private short[] P00FA4_A2248ManCod ;
   private String[] P00FA4_A2689ExHdrFas ;
   private int[] P00FA4_A2692ExHdrLin ;
}

final  class pbmvhdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00FA2", "DELETE FROM TXPLEXMVH  WHERE (EmprCod = ? and ManCod = ? and ExHdrFas = ?) AND (ExHdrTip = ?) AND (ExHdrAlb = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVH")
         ,new ForEachCursor("P00FA3", "SELECT ExHdrFas, ManCod, EmprCod FROM TXPCEXMVH WHERE EmprCod = ? and ManCod = ? and ExHdrFas = ? ORDER BY EmprCod, ManCod, ExHdrFas ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00FA4", "SELECT EmprCod, ManCod, ExHdrFas, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? and ManCod = ? and ExHdrFas = ? ORDER BY EmprCod, ManCod, ExHdrFas ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00FA5", "DELETE FROM TXPCEXMVH  WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXMVH")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

