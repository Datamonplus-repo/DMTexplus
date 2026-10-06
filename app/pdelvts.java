package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelvts extends GXProcedure
{
   public pdelvts( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelvts.class ), "" );
   }

   public pdelvts( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      pdelvts.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pdelvts.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelvts.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pdelvts.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pdelvts.this.A10972Int_cod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04C12 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10973Int_Dsc = P04C12_A10973Int_Dsc[0] ;
         n10973Int_Dsc = P04C12_n10973Int_Dsc[0] ;
         /* Using cursor P04C13 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A11043Int_Un = P04C13_A11043Int_Un[0] ;
            /* Optimized DELETE. */
            /* Using cursor P04C14 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCIN1");
            /* End optimized DELETE. */
            /* Using cursor P04C15 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPuINCIN");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P04C16 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCINT");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelvts.this.A396EmprCod;
      this.aP1[0] = pdelvts.this.A252CliCod;
      this.aP2[0] = pdelvts.this.A65ArtCod;
      this.aP3[0] = pdelvts.this.A10972Int_cod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelvts");
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
      P04C12_A396EmprCod = new String[] {""} ;
      P04C12_A252CliCod = new int[1] ;
      P04C12_A65ArtCod = new String[] {""} ;
      P04C12_A10972Int_cod = new byte[1] ;
      P04C12_A10973Int_Dsc = new String[] {""} ;
      P04C12_n10973Int_Dsc = new boolean[] {false} ;
      A10973Int_Dsc = "" ;
      P04C13_A396EmprCod = new String[] {""} ;
      P04C13_A252CliCod = new int[1] ;
      P04C13_A65ArtCod = new String[] {""} ;
      P04C13_A10972Int_cod = new byte[1] ;
      P04C13_A11043Int_Un = new String[] {""} ;
      A11043Int_Un = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelvts__default(),
         new Object[] {
             new Object[] {
            P04C12_A396EmprCod, P04C12_A252CliCod, P04C12_A65ArtCod, P04C12_A10972Int_cod, P04C12_A10973Int_Dsc, P04C12_n10973Int_Dsc
            }
            , new Object[] {
            P04C13_A396EmprCod, P04C13_A252CliCod, P04C13_A65ArtCod, P04C13_A10972Int_cod, P04C13_A11043Int_Un
            }
            , new Object[] {
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

   private byte A10972Int_cod ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String scmdbuf ;
   private String A10973Int_Dsc ;
   private String A11043Int_Un ;
   private boolean n10973Int_Dsc ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04C12_A396EmprCod ;
   private int[] P04C12_A252CliCod ;
   private String[] P04C12_A65ArtCod ;
   private byte[] P04C12_A10972Int_cod ;
   private String[] P04C12_A10973Int_Dsc ;
   private boolean[] P04C12_n10973Int_Dsc ;
   private String[] P04C13_A396EmprCod ;
   private int[] P04C13_A252CliCod ;
   private String[] P04C13_A65ArtCod ;
   private byte[] P04C13_A10972Int_cod ;
   private String[] P04C13_A11043Int_Un ;
}

final  class pdelvts__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04C12", "SELECT EmprCod, CliCod, ArtCod, Int_cod, Int_Dsc FROM TXPINCINT WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Int_cod = ? ORDER BY EmprCod, CliCod, ArtCod, Int_cod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04C13", "SELECT EmprCod, CliCod, ArtCod, Int_cod, Int_Un FROM TXPuINCIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Int_cod = ? ORDER BY EmprCod, CliCod, ArtCod, Int_cod, Int_Un ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04C14", "DELETE FROM TXPINCIN1  WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Int_cod = ? and Int_Un = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINCIN1")
         ,new UpdateCursor("P04C15", "DELETE FROM TXPuINCIN  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Int_cod = ? AND Int_Un = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPuINCIN")
         ,new UpdateCursor("P04C16", "DELETE FROM TXPINCINT  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND Int_cod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINCINT")
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

