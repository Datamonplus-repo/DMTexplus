package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrcod extends GXProcedure
{
   public pctrcod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrcod.class ), "" );
   }

   public pctrcod( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           short[] aP1 ,
                           short[] aP2 ,
                           int[] aP3 )
   {
      pctrcod.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        short[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             short[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 )
   {
      pctrcod.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrcod.this.AV8TipDfCLQ = aP1[0];
      this.aP1 = aP1;
      pctrcod.this.AV9TipCsCLQ = aP2[0];
      this.aP2 = aP2;
      pctrcod.this.AV10Nr_opecod = aP3[0];
      this.aP3 = aP3;
      pctrcod.this.AV11Cod_err = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ! (0==AV8TipDfCLQ) )
      {
         AV11Cod_err = (byte)(1) ;
         /* Using cursor P021G2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV8TipDfCLQ)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A833TipDefCod = P021G2_A833TipDefCod[0] ;
            AV11Cod_err = (byte)(0) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV11Cod_err > 0 )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( ! (0==AV9TipCsCLQ) )
      {
         AV11Cod_err = (byte)(2) ;
         /* Using cursor P021G3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(AV9TipCsCLQ)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5085CodCausa = P021G3_A5085CodCausa[0] ;
            AV11Cod_err = (byte)(0) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV11Cod_err > 0 )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( ! (0==AV10Nr_opecod) )
      {
         AV11Cod_err = (byte)(3) ;
         /* Using cursor P021G4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV10Nr_opecod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A652OpeCod = P021G4_A652OpeCod[0] ;
            AV11Cod_err = (byte)(0) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV11Cod_err > 0 )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrcod.this.A396EmprCod;
      this.aP1[0] = pctrcod.this.AV8TipDfCLQ;
      this.aP2[0] = pctrcod.this.AV9TipCsCLQ;
      this.aP3[0] = pctrcod.this.AV10Nr_opecod;
      this.aP4[0] = pctrcod.this.AV11Cod_err;
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
      P021G2_A396EmprCod = new String[] {""} ;
      P021G2_A833TipDefCod = new short[1] ;
      P021G3_A396EmprCod = new String[] {""} ;
      P021G3_A5085CodCausa = new short[1] ;
      P021G4_A396EmprCod = new String[] {""} ;
      P021G4_A652OpeCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrcod__default(),
         new Object[] {
             new Object[] {
            P021G2_A396EmprCod, P021G2_A833TipDefCod
            }
            , new Object[] {
            P021G3_A396EmprCod, P021G3_A5085CodCausa
            }
            , new Object[] {
            P021G4_A396EmprCod, P021G4_A652OpeCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Cod_err ;
   private short AV8TipDfCLQ ;
   private short AV9TipCsCLQ ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short Gx_err ;
   private int AV10Nr_opecod ;
   private int A652OpeCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean returnInSub ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private short[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P021G2_A396EmprCod ;
   private short[] P021G2_A833TipDefCod ;
   private String[] P021G3_A396EmprCod ;
   private short[] P021G3_A5085CodCausa ;
   private String[] P021G4_A396EmprCod ;
   private int[] P021G4_A652OpeCod ;
}

final  class pctrcod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P021G2", "SELECT EmprCod, TipDefCod FROM TXPTIPDEF WHERE EmprCod = ? and TipDefCod = ? ORDER BY EmprCod, TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P021G3", "SELECT EmprCod, CodCausa FROM TXPTIPCAU WHERE EmprCod = ? and CodCausa = ? ORDER BY EmprCod, CodCausa ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P021G4", "SELECT EmprCod, OpeCod FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

