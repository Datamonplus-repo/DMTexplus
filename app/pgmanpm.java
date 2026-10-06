package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgmanpm extends GXProcedure
{
   public pgmanpm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgmanpm.class ), "" );
   }

   public pgmanpm( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            short[] aP3 ,
                            short[] aP4 )
   {
      pgmanpm.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        short[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             short[] aP4 ,
                             short[] aP5 )
   {
      pgmanpm.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pgmanpm.this.AV17CliOri = aP1[0];
      this.aP1 = aP1;
      pgmanpm.this.AV16ArtOri = aP2[0];
      this.aP2 = aP2;
      pgmanpm.this.AV23ArtGracru = aP3[0];
      this.aP3 = aP3;
      pgmanpm.this.AV24ArtCrumin = aP4[0];
      this.aP4 = aP4;
      pgmanpm.this.AV25ArtPmlCru = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23ArtGracru = (short)(0) ;
      AV24ArtCrumin = (short)(0) ;
      AV25ArtPmlCru = (short)(0) ;
      /* Using cursor P04GE2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV17CliOri), AV16ArtOri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A65ArtCod = P04GE2_A65ArtCod[0] ;
         A252CliCod = P04GE2_A252CliCod[0] ;
         A396EmprCod = P04GE2_A396EmprCod[0] ;
         A78ArtGraCru = P04GE2_A78ArtGraCru[0] ;
         n78ArtGraCru = P04GE2_n78ArtGraCru[0] ;
         A68ArtCruMin = P04GE2_A68ArtCruMin[0] ;
         n68ArtCruMin = P04GE2_n68ArtCruMin[0] ;
         A7415ArtPmlCru = P04GE2_A7415ArtPmlCru[0] ;
         n7415ArtPmlCru = P04GE2_n7415ArtPmlCru[0] ;
         AV23ArtGracru = A78ArtGraCru ;
         AV24ArtCrumin = A68ArtCruMin ;
         AV25ArtPmlCru = A7415ArtPmlCru ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgmanpm.this.AV15EmprCod;
      this.aP1[0] = pgmanpm.this.AV17CliOri;
      this.aP2[0] = pgmanpm.this.AV16ArtOri;
      this.aP3[0] = pgmanpm.this.AV23ArtGracru;
      this.aP4[0] = pgmanpm.this.AV24ArtCrumin;
      this.aP5[0] = pgmanpm.this.AV25ArtPmlCru;
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
      P04GE2_A65ArtCod = new String[] {""} ;
      P04GE2_A252CliCod = new int[1] ;
      P04GE2_A396EmprCod = new String[] {""} ;
      P04GE2_A78ArtGraCru = new short[1] ;
      P04GE2_n78ArtGraCru = new boolean[] {false} ;
      P04GE2_A68ArtCruMin = new short[1] ;
      P04GE2_n68ArtCruMin = new boolean[] {false} ;
      P04GE2_A7415ArtPmlCru = new short[1] ;
      P04GE2_n7415ArtPmlCru = new boolean[] {false} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgmanpm__default(),
         new Object[] {
             new Object[] {
            P04GE2_A65ArtCod, P04GE2_A252CliCod, P04GE2_A396EmprCod, P04GE2_A78ArtGraCru, P04GE2_n78ArtGraCru, P04GE2_A68ArtCruMin, P04GE2_n68ArtCruMin, P04GE2_A7415ArtPmlCru, P04GE2_n7415ArtPmlCru
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV23ArtGracru ;
   private short AV24ArtCrumin ;
   private short AV25ArtPmlCru ;
   private short A78ArtGraCru ;
   private short A68ArtCruMin ;
   private short A7415ArtPmlCru ;
   private short Gx_err ;
   private int AV17CliOri ;
   private int A252CliCod ;
   private String AV15EmprCod ;
   private String AV16ArtOri ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private boolean n78ArtGraCru ;
   private boolean n68ArtCruMin ;
   private boolean n7415ArtPmlCru ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04GE2_A65ArtCod ;
   private int[] P04GE2_A252CliCod ;
   private String[] P04GE2_A396EmprCod ;
   private short[] P04GE2_A78ArtGraCru ;
   private boolean[] P04GE2_n78ArtGraCru ;
   private short[] P04GE2_A68ArtCruMin ;
   private boolean[] P04GE2_n68ArtCruMin ;
   private short[] P04GE2_A7415ArtPmlCru ;
   private boolean[] P04GE2_n7415ArtPmlCru ;
}

final  class pgmanpm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04GE2", "SELECT ArtCod, CliCod, EmprCod, ArtGraCru, ArtCruMin, ArtPmlCru FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               return;
      }
   }

}

