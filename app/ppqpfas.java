package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppqpfas extends GXProcedure
{
   public ppqpfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppqpfas.class ), "" );
   }

   public ppqpfas( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 )
   {
      ppqpfas.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 )
   {
      ppqpfas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppqpfas.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      ppqpfas.this.A758ProCod = aP2[0];
      this.aP2 = aP2;
      ppqpfas.this.A368DisFasLin = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23DisQui = (byte)(0) ;
      /* Using cursor P02BM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5376DisQuiUl = P02BM2_A5376DisQuiUl[0] ;
         /* Using cursor P02BM3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5377DisQuiLin = P02BM3_A5377DisQuiLin[0] ;
            AV23DisQui = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV23DisQui == 0 )
         {
            A5376DisQuiUl = (short)(0) ;
         }
         /* Using cursor P02BM4 */
         pr_default.execute(2, new Object[] {Short.valueOf(A5376DisQuiUl), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppqpfas.this.A396EmprCod;
      this.aP1[0] = ppqpfas.this.A361DisCod;
      this.aP2[0] = ppqpfas.this.A758ProCod;
      this.aP3[0] = ppqpfas.this.A368DisFasLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppqpfas");
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
      P02BM2_A396EmprCod = new String[] {""} ;
      P02BM2_A361DisCod = new int[1] ;
      P02BM2_A758ProCod = new String[] {""} ;
      P02BM2_A368DisFasLin = new short[1] ;
      P02BM2_A5376DisQuiUl = new short[1] ;
      P02BM3_A396EmprCod = new String[] {""} ;
      P02BM3_A361DisCod = new int[1] ;
      P02BM3_A758ProCod = new String[] {""} ;
      P02BM3_A368DisFasLin = new short[1] ;
      P02BM3_A5377DisQuiLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppqpfas__default(),
         new Object[] {
             new Object[] {
            P02BM2_A396EmprCod, P02BM2_A361DisCod, P02BM2_A758ProCod, P02BM2_A368DisFasLin, P02BM2_A5376DisQuiUl
            }
            , new Object[] {
            P02BM3_A396EmprCod, P02BM3_A361DisCod, P02BM3_A758ProCod, P02BM3_A368DisFasLin, P02BM3_A5377DisQuiLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV23DisQui ;
   private short A368DisFasLin ;
   private short A5376DisQuiUl ;
   private short A5377DisQuiLin ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String scmdbuf ;
   private short[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02BM2_A396EmprCod ;
   private int[] P02BM2_A361DisCod ;
   private String[] P02BM2_A758ProCod ;
   private short[] P02BM2_A368DisFasLin ;
   private short[] P02BM2_A5376DisQuiUl ;
   private String[] P02BM3_A396EmprCod ;
   private int[] P02BM3_A361DisCod ;
   private String[] P02BM3_A758ProCod ;
   private short[] P02BM3_A368DisFasLin ;
   private short[] P02BM3_A5377DisQuiLin ;
}

final  class ppqpfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02BM2", "SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiUl FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02BM3", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02BM4", "UPDATE TXPDISFAS SET DisQuiUl=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

