package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusardbloqueo extends GXProcedure
{
   public pbusardbloqueo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusardbloqueo.class ), "" );
   }

   public pbusardbloqueo( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 )
   {
      pbusardbloqueo.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      pbusardbloqueo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusardbloqueo.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pbusardbloqueo.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pbusardbloqueo.this.aP3 = aP3;
      pbusardbloqueo.this.aP4 = aP4;
      pbusardbloqueo.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Flag = (byte)(0) ;
      AV17ArtBlo = httpContext.getMessage( "N", "") ;
      /* Using cursor P04PF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A69ArtDsc = P04PF2_A69ArtDsc[0] ;
         n69ArtDsc = P04PF2_n69ArtDsc[0] ;
         A7779ArtBlo = P04PF2_A7779ArtBlo[0] ;
         n7779ArtBlo = P04PF2_n7779ArtBlo[0] ;
         AV16ArtDsc = A69ArtDsc ;
         AV17ArtBlo = A7779ArtBlo ;
         AV15Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusardbloqueo.this.A396EmprCod;
      this.aP1[0] = pbusardbloqueo.this.A252CliCod;
      this.aP2[0] = pbusardbloqueo.this.A65ArtCod;
      this.aP3[0] = pbusardbloqueo.this.AV16ArtDsc;
      this.aP4[0] = pbusardbloqueo.this.AV17ArtBlo;
      this.aP5[0] = pbusardbloqueo.this.AV15Flag;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16ArtDsc = "" ;
      AV17ArtBlo = "" ;
      scmdbuf = "" ;
      P04PF2_A396EmprCod = new String[] {""} ;
      P04PF2_A252CliCod = new int[1] ;
      P04PF2_A65ArtCod = new String[] {""} ;
      P04PF2_A69ArtDsc = new String[] {""} ;
      P04PF2_n69ArtDsc = new boolean[] {false} ;
      P04PF2_A7779ArtBlo = new String[] {""} ;
      P04PF2_n7779ArtBlo = new boolean[] {false} ;
      A69ArtDsc = "" ;
      A7779ArtBlo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusardbloqueo__default(),
         new Object[] {
             new Object[] {
            P04PF2_A396EmprCod, P04PF2_A252CliCod, P04PF2_A65ArtCod, P04PF2_A69ArtDsc, P04PF2_n69ArtDsc, P04PF2_A7779ArtBlo, P04PF2_n7779ArtBlo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV16ArtDsc ;
   private String AV17ArtBlo ;
   private String scmdbuf ;
   private String A69ArtDsc ;
   private String A7779ArtBlo ;
   private boolean n69ArtDsc ;
   private boolean n7779ArtBlo ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04PF2_A396EmprCod ;
   private int[] P04PF2_A252CliCod ;
   private String[] P04PF2_A65ArtCod ;
   private String[] P04PF2_A69ArtDsc ;
   private boolean[] P04PF2_n69ArtDsc ;
   private String[] P04PF2_A7779ArtBlo ;
   private boolean[] P04PF2_n7779ArtBlo ;
}

final  class pbusardbloqueo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04PF2", "SELECT EmprCod, CliCod, ArtCod, ArtDsc, ArtBlo FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

