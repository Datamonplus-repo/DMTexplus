package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class fase_618 extends GXProcedure
{
   public fase_618( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( fase_618.class ), "" );
   }

   public fase_618( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              int aP1 ,
                              byte aP2 ,
                              String aP3 )
   {
      fase_618.this.aP4 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        boolean[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             boolean[] aP4 )
   {
      fase_618.this.A396EmprCod = aP0;
      fase_618.this.A129BarCod = aP1;
      fase_618.this.A132BarCodReo = aP2;
      fase_618.this.A130BarCodPar = aP3;
      fase_618.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Fase_618 = false ;
      /* Using cursor P0A482 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P0A482_A252CliCod[0] ;
         n252CliCod = P0A482_n252CliCod[0] ;
         A457FasCod = P0A482_A457FasCod[0] ;
         A194BarOrdLin = P0A482_A194BarOrdLin[0] ;
         A758ProCod = P0A482_A758ProCod[0] ;
         A252CliCod = P0A482_A252CliCod[0] ;
         n252CliCod = P0A482_n252CliCod[0] ;
         AV11Clicod = A252CliCod ;
         AV9Fascod = A457FasCod ;
         /* Execute user subroutine: 'PREFAS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV10Precio_Acc == 1 )
         {
            AV8Fase_618 = true ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'PREFAS' Routine */
      returnInSub = false ;
      AV10Precio_Acc = (byte)(0) ;
      /* Using cursor P0A483 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV11Clicod), AV9Fascod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A457FasCod = P0A483_A457FasCod[0] ;
         A252CliCod = P0A483_A252CliCod[0] ;
         n252CliCod = P0A483_n252CliCod[0] ;
         A10882FasPreU = P0A483_A10882FasPreU[0] ;
         n10882FasPreU = P0A483_n10882FasPreU[0] ;
         AV10Precio_Acc = A10882FasPreU ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP4[0] = fase_618.this.AV8Fase_618;
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
      P0A482_A396EmprCod = new String[] {""} ;
      P0A482_A129BarCod = new int[1] ;
      P0A482_A132BarCodReo = new byte[1] ;
      P0A482_A130BarCodPar = new String[] {""} ;
      P0A482_A252CliCod = new int[1] ;
      P0A482_n252CliCod = new boolean[] {false} ;
      P0A482_A457FasCod = new String[] {""} ;
      P0A482_A194BarOrdLin = new short[1] ;
      P0A482_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV9Fascod = "" ;
      P0A483_A396EmprCod = new String[] {""} ;
      P0A483_A457FasCod = new String[] {""} ;
      P0A483_A252CliCod = new int[1] ;
      P0A483_n252CliCod = new boolean[] {false} ;
      P0A483_A10882FasPreU = new byte[1] ;
      P0A483_n10882FasPreU = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.fase_618__default(),
         new Object[] {
             new Object[] {
            P0A482_A396EmprCod, P0A482_A129BarCod, P0A482_A132BarCodReo, P0A482_A130BarCodPar, P0A482_A252CliCod, P0A482_n252CliCod, P0A482_A457FasCod, P0A482_A194BarOrdLin, P0A482_A758ProCod
            }
            , new Object[] {
            P0A483_A396EmprCod, P0A483_A457FasCod, P0A483_A252CliCod, P0A483_A10882FasPreU, P0A483_n10882FasPreU
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV10Precio_Acc ;
   private byte A10882FasPreU ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV11Clicod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV9Fascod ;
   private boolean AV8Fase_618 ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n10882FasPreU ;
   private boolean[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A482_A396EmprCod ;
   private int[] P0A482_A129BarCod ;
   private byte[] P0A482_A132BarCodReo ;
   private String[] P0A482_A130BarCodPar ;
   private int[] P0A482_A252CliCod ;
   private boolean[] P0A482_n252CliCod ;
   private String[] P0A482_A457FasCod ;
   private short[] P0A482_A194BarOrdLin ;
   private String[] P0A482_A758ProCod ;
   private String[] P0A483_A396EmprCod ;
   private String[] P0A483_A457FasCod ;
   private int[] P0A483_A252CliCod ;
   private boolean[] P0A483_n252CliCod ;
   private byte[] P0A483_A10882FasPreU ;
   private boolean[] P0A483_n10882FasPreU ;
}

final  class fase_618__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A482", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.CliCod, T1.FasCod, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A483", "SELECT EmprCod, FasCod, CliCod, FasPreU FROM TXPPREFAS WHERE EmprCod = ? and CliCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

