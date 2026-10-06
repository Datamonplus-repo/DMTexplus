package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partpdo extends GXProcedure
{
   public partpdo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partpdo.class ), "" );
   }

   public partpdo( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      partpdo.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 )
   {
      partpdo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partpdo.this.A966PartCod = aP1[0];
      this.aP1 = aP1;
      partpdo.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      partpdo.this.AV16ParArtCod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15FlagPdo = (byte)(0) ;
      /* Using cursor P00Q32 */
      pr_default.execute(0, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2245PartEstM = P00Q32_A2245PartEstM[0] ;
         n2245PartEstM = P00Q32_n2245PartEstM[0] ;
         A1456ParArtCod = P00Q32_A1456ParArtCod[0] ;
         n1456ParArtCod = P00Q32_n1456ParArtCod[0] ;
         AV16ParArtCod = A1456ParArtCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partpdo.this.A396EmprCod;
      this.aP1[0] = partpdo.this.A966PartCod;
      this.aP2[0] = partpdo.this.A252CliCod;
      this.aP3[0] = partpdo.this.AV16ParArtCod;
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
      P00Q32_A396EmprCod = new String[] {""} ;
      P00Q32_A966PartCod = new String[] {""} ;
      P00Q32_A252CliCod = new int[1] ;
      P00Q32_A2245PartEstM = new String[] {""} ;
      P00Q32_n2245PartEstM = new boolean[] {false} ;
      P00Q32_A1456ParArtCod = new String[] {""} ;
      P00Q32_n1456ParArtCod = new boolean[] {false} ;
      A2245PartEstM = "" ;
      A1456ParArtCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partpdo__default(),
         new Object[] {
             new Object[] {
            P00Q32_A396EmprCod, P00Q32_A966PartCod, P00Q32_A252CliCod, P00Q32_A2245PartEstM, P00Q32_n2245PartEstM, P00Q32_A1456ParArtCod, P00Q32_n1456ParArtCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15FlagPdo ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String AV16ParArtCod ;
   private String scmdbuf ;
   private String A2245PartEstM ;
   private String A1456ParArtCod ;
   private boolean n2245PartEstM ;
   private boolean n1456ParArtCod ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00Q32_A396EmprCod ;
   private String[] P00Q32_A966PartCod ;
   private int[] P00Q32_A252CliCod ;
   private String[] P00Q32_A2245PartEstM ;
   private boolean[] P00Q32_n2245PartEstM ;
   private String[] P00Q32_A1456ParArtCod ;
   private boolean[] P00Q32_n1456ParArtCod ;
}

final  class partpdo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00Q32", "SELECT EmprCod, PartCod, CliCod, PartEstM, ParArtCod FROM TXPCPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

