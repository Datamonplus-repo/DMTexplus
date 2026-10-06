package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pparrxchk extends GXProcedure
{
   public pparrxchk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pparrxchk.class ), "" );
   }

   public pparrxchk( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 )
   {
      pparrxchk.this.aP3 = new byte[] {0};
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
      pparrxchk.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pparrxchk.this.A966PartCod = aP1[0];
      this.aP1 = aP1;
      pparrxchk.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pparrxchk.this.AV8Ok = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11GXLvl1 = (byte)(0) ;
      /* Using cursor P02142 */
      pr_default.execute(0, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A980PartLinTip = P02142_A980PartLinTip[0] ;
         n980PartLinTip = P02142_n980PartLinTip[0] ;
         A979PartLin = P02142_A979PartLin[0] ;
         if ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "B", "")) == 0 )
         {
            AV11GXLvl1 = (byte)(1) ;
            AV8Ok = (byte)(0) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV11GXLvl1 == 0 )
      {
         AV8Ok = (byte)(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pparrxchk.this.A396EmprCod;
      this.aP1[0] = pparrxchk.this.A966PartCod;
      this.aP2[0] = pparrxchk.this.A252CliCod;
      this.aP3[0] = pparrxchk.this.AV8Ok;
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
      P02142_A396EmprCod = new String[] {""} ;
      P02142_A966PartCod = new String[] {""} ;
      P02142_A252CliCod = new int[1] ;
      P02142_A980PartLinTip = new String[] {""} ;
      P02142_n980PartLinTip = new boolean[] {false} ;
      P02142_A979PartLin = new int[1] ;
      A980PartLinTip = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pparrxchk__default(),
         new Object[] {
             new Object[] {
            P02142_A396EmprCod, P02142_A966PartCod, P02142_A252CliCod, P02142_A980PartLinTip, P02142_n980PartLinTip, P02142_A979PartLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Ok ;
   private byte AV11GXLvl1 ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A979PartLin ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String scmdbuf ;
   private String A980PartLinTip ;
   private boolean n980PartLinTip ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02142_A396EmprCod ;
   private String[] P02142_A966PartCod ;
   private int[] P02142_A252CliCod ;
   private String[] P02142_A980PartLinTip ;
   private boolean[] P02142_n980PartLinTip ;
   private int[] P02142_A979PartLin ;
}

final  class pparrxchk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02142", "SELECT EmprCod, PartCod, CliCod, PartLinTip, PartLin FROM TXPLPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[5])[0] = rslt.getInt(5);
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

